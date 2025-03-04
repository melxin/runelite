/*
 * Copyright (c) 2016-2017, Adam <Adam@sigterm.info>
 * Copyright (c) 2018, Tomas Slusny <slusnucky@gmail.com>
 * Copyright (c) 2019 Abex
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.rs;

import com.google.common.base.Strings;
import com.google.common.hash.Hashing;
import com.google.common.io.ByteStreams;
import com.openosrs.client.OpenOSRS;
import java.applet.Applet;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Enumeration;
import java.util.Map;
import java.util.function.Supplier;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import javax.annotation.Nonnull;
import javax.swing.SwingUtilities;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.client.RuneLite;
import net.runelite.client.RuneLiteProperties;
import net.runelite.client.RuntimeConfig;
import net.runelite.client.RuntimeConfigLoader;
import net.runelite.client.ui.FatalErrorDialog;
import net.runelite.client.ui.SplashScreen;
import net.runelite.http.api.worlds.World;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;

@Slf4j
@SuppressWarnings({"deprecation"})
public class ClientLoader implements Supplier<Client>
{
	private static File LOCK_FILE = new File(RuneLite.CACHE_DIR, "cache.lock");

	private static final String INJECTED_CLIENT_NAME = "/injected-client.oprs";
	
	private static final int NUM_ATTEMPTS = 6;

	private final ClientConfigLoader clientConfigLoader;
	private final WorldSupplier worldSupplier;
	private final RuntimeConfigLoader runtimeConfigLoader;
	private final String javConfigUrl;

	private Object client;

	public ClientLoader(OkHttpClient okHttpClient, RuntimeConfigLoader runtimeConfigLoader, String javConfigUrl)
	{
		this.clientConfigLoader = new ClientConfigLoader(okHttpClient);
		this.worldSupplier = new WorldSupplier(okHttpClient);
		this.runtimeConfigLoader = runtimeConfigLoader;
		this.javConfigUrl = javConfigUrl;
	}

	@Override
	public synchronized Client get()
	{
		if (client == null)
		{
			client = doLoad();
		}

		if (client instanceof Throwable)
		{
			throw new RuntimeException((Throwable) client);
		}
		return (Client) client;
	}

	private Object doLoad()
	{
		try
		{
			SplashScreen.stage(0, null, "Fetching applet viewer config");
			RSConfig config = downloadConfig();

			SplashScreen.stage(.3, "Starting", "Starting Old School RuneScape");

			LOCK_FILE.getParentFile().mkdirs();
			ClassLoader classLoader;
			try (FileChannel lockfile = FileChannel.open(LOCK_FILE.toPath(),
				StandardOpenOption.CREATE, StandardOpenOption.READ, StandardOpenOption.WRITE);
				@SuppressWarnings("PMD.UnusedLocalVariable") FileLock flock = lockfile.lock())
			{
				File oprsInjected = new File(System.getProperty("user.home") + "/.openosrs/cache/injected-client.jar");
				writeInjectedClient(oprsInjected);
				// create the classloader for the jar while we hold the lock, and eagerly load and link all classes
				// in the jar. Otherwise the jar can change on disk and can break future classloads.
				classLoader = createJarClassLoader(oprsInjected);
			}
			Client rs = loadClient(config, classLoader);

			SplashScreen.stage(.4, null, "Starting core classes");

			return rs;
		}
		catch (OutageException e)
		{
			return e;
		}
		catch (IOException | ClassNotFoundException | InstantiationException | IllegalAccessException | SecurityException e)
		{
			log.error("Error loading RS!", e);

			if (!checkOutages())
			{
				SwingUtilities.invokeLater(() -> FatalErrorDialog.showNetErrorWindow("loading the client", e));
			}
			return e;
		}
	}

	private RSConfig downloadConfig() throws IOException
	{
		HttpUrl url = HttpUrl.get(javConfigUrl);
		IOException err = null;
		for (int attempt = 0; attempt < NUM_ATTEMPTS; attempt++)
		{
			try
			{
				RSConfig config = clientConfigLoader.fetch(url);

				if (Strings.isNullOrEmpty(config.getCodeBase()) || Strings.isNullOrEmpty(config.getInitialJar()) || Strings.isNullOrEmpty(config.getInitialClass()))
				{
					throw new IOException("Invalid or missing jav_config");
				}

				return config;
			}
			catch (IOException e)
			{
				log.info("Failed to get jav_config from host \"{}\" ({})", url.host(), e.getMessage());
				if (checkOutages())
				{
					throw new OutageException(e);
				}

				if (!javConfigUrl.equals(RuneLiteProperties.getJavConfig()))
				{
					throw e;
				}

				String host = worldSupplier.get().getAddress();
				url = url.newBuilder().host(host).build();
				err = e;
			}
		}

		log.info("Falling back to backup client config");

		try
		{
			return downloadFallbackConfig();
		}
		catch (IOException ex)
		{
			log.debug("error downloading backup config", ex);
			throw err; // NOPMD: PreserveStackTrace - use error from Jagex's servers
		}
	}

	@Nonnull
	private RSConfig downloadFallbackConfig() throws IOException
	{
		RSConfig backupConfig = clientConfigLoader.fetch(HttpUrl.get(RuneLiteProperties.getJavConfigBackup()));

		if (Strings.isNullOrEmpty(backupConfig.getCodeBase()) || Strings.isNullOrEmpty(backupConfig.getInitialJar()) || Strings.isNullOrEmpty(backupConfig.getInitialClass()))
		{
			throw new IOException("Invalid or missing jav_config");
		}

		if (Strings.isNullOrEmpty(backupConfig.getRuneLiteWorldParam()))
		{
			throw new IOException("Backup config does not have RuneLite gamepack url");
		}

		// Randomize the codebase
		World world = worldSupplier.get();
		backupConfig.setCodebase("http://" + world.getAddress() + "/");

		// Update the world applet parameter
		Map<String, String> appletProperties = backupConfig.getAppletProperties();
		appletProperties.put(backupConfig.getRuneLiteWorldParam(), Integer.toString(world.getId()));

		return backupConfig;
	}

	private void writeInjectedClient(File cachedInjected) throws IOException
	{
		String cachedHash = cachedInjected.exists() ? com.google.common.io.Files.asByteSource(cachedInjected).hash(Hashing.sha256()).toString() : "";

		byte[] currentInjected = ByteStreams.toByteArray(ClientLoader.class.getResourceAsStream(INJECTED_CLIENT_NAME));
		String currentHash = Hashing.sha256().hashBytes(currentInjected).toString();

		if (!cachedInjected.exists() || !currentHash.equals(cachedHash))
		{
			cachedInjected.getParentFile().mkdirs();
			Files.write(cachedInjected.toPath(), currentInjected);
		}
	}

	private ClassLoader createJarClassLoader(File jar) throws IOException, ClassNotFoundException
	{
		try (JarFile jarFile = new JarFile(jar))
		{
			ClassLoader classLoader = new ClassLoader(ClientLoader.class.getClassLoader())
			{
				@Override
				protected Class<?> findClass(String name) throws ClassNotFoundException
				{
					String entryName = name.replace('.', '/').concat(".class");
					JarEntry jarEntry;

					try
					{
						jarEntry = jarFile.getJarEntry(entryName);
					}
					catch (IllegalStateException ex)
					{
						throw new ClassNotFoundException(name, ex);
					}

					if (jarEntry == null)
					{
						throw new ClassNotFoundException(name);
					}

					try
					{
						InputStream inputStream = jarFile.getInputStream(jarEntry);
						if (inputStream == null)
						{
							throw new ClassNotFoundException(name);
						}

						byte[] bytes = ByteStreams.toByteArray(inputStream);
						return defineClass(name, bytes, 0, bytes.length);
					}
					catch (IOException e)
					{
						throw new ClassNotFoundException(null, e);
					}
				}
			};

			// load all of the classes in this jar; after the jar is closed the classloader
			// will no longer be able to look up classes
			Enumeration<JarEntry> entries = jarFile.entries();
			while (entries.hasMoreElements())
			{
				JarEntry jarEntry = entries.nextElement();
				String name = jarEntry.getName();
				if (name.endsWith(".class"))
				{
					name = name.substring(0, name.length() - 6);
					classLoader.loadClass(name.replace('/', '.'));
				}
			}

			return classLoader;
		}
	}

	private Client loadClient(RSConfig config, ClassLoader classLoader) throws ClassNotFoundException, IllegalAccessException, InstantiationException
	{
		String initialClass = config.getInitialClass();
		Class<?> clientClass = classLoader.loadClass(initialClass);

		Client rs = (Client) clientClass.newInstance();
		((Applet) rs).setStub(new RSAppletStub(config, runtimeConfigLoader));

		log.info("injected-client {}", OpenOSRS.SYSTEM_VERSION);

		return rs;
	}

	private static class OutageException extends RuntimeException
	{
		private OutageException(Throwable cause)
		{
			super(cause);
		}
	}

	private boolean checkOutages()
	{
		RuntimeConfig rtc = runtimeConfigLoader.tryGet();
		if (rtc != null)
		{
			return rtc.showOutageMessage();
		}
		return false;
	}
}
