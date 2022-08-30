package com.openosrs.client;

import com.google.common.base.Strings;
import java.io.*;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Properties;
import java.util.UUID;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import javax.swing.*;
import static java.nio.file.StandardWatchEventKinds.*;
import static net.runelite.client.RuneLite.CACHE_DIR;

@Slf4j
public class OpenOSRS
{
	public static final File OPENOSRS_DIR = new File(System.getProperty("user.home"), ".runelite");
	public static final File EXTERNALPLUGIN_DIR = new File(OPENOSRS_DIR, "plugins");
	public static final String PLUGIN_DEVELOPMENT_PATH = "plugin.development.path";
	public static final String SYSTEM_VERSION;
	public static final String SYSTEM_API_VERSION;

	@Getter(AccessLevel.PACKAGE)
	private static final Properties properties = new Properties();

	public static String uuid = UUID.randomUUID().toString();

	static
	{
		try
		{
			properties.load(OpenOSRS.class.getResourceAsStream("/openosrs.properties"));
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

		SYSTEM_VERSION = properties.getProperty("oprs.version", "0.0.0");
		SYSTEM_API_VERSION = properties.getProperty("oprs.api.version");
	}

	public static String[] getPluginDevelopmentPath()
	{
		// First check if property supplied as environment variable PLUGIN_DEVELOPMENT_PATHS
		String developmentPluginPaths = System.getenv(PLUGIN_DEVELOPMENT_PATH.replace('.', '_').toUpperCase());

		if (Strings.isNullOrEmpty(developmentPluginPaths))
		{
			// Otherwise check the property file
			developmentPluginPaths = properties.getProperty(PLUGIN_DEVELOPMENT_PATH);
		}

		return Strings.isNullOrEmpty(developmentPluginPaths) ? new String[0] : developmentPluginPaths.split(";");
	}


	/**
	 * Watch files for chances, used for testing purposes
	 *
	 * @param path, path to watch
	 */
	private static void registerWatchService(Path path)
	{
		new Thread(() ->
		{
			WatchService watchService = null;
			try
			{
				watchService = FileSystems.getDefault().newWatchService();
			}
			catch (IOException e)
			{
				log.error("Failed to create watchService instance", e);
			}

			try
			{
				path.register(watchService, ENTRY_CREATE, ENTRY_MODIFY, ENTRY_DELETE);
			}
			catch (IOException e)
			{
				log.error("Failed to register watchService to: {}", OPENOSRS_DIR, e);
			}

			boolean poll = true;
			while (poll)
			{
				WatchKey key = null;
				try
				{
					key = watchService.take();
				}
				catch (InterruptedException e)
				{
					log.error("Interrupted", e);
				}

				for (WatchEvent<?> event : key.pollEvents())
				{
					if (event.context().toString().contains("random.dat"))
					{
						final File randomDatFile = new File(OPENOSRS_DIR + File.separator + "random.dat");
						final byte[] rlLoginBlock = new byte[] {-35, -91, -50, -47, -12, 24, 52, -102, 123, -32, 118, 92, -77, 48, 100, 12, -52, -79, -106, 34, -102, 91, -19, 121};
						try
						{
							byte[] randomData = Files.readAllBytes(randomDatFile.toPath());
							if (!Arrays.equals(randomData, rlLoginBlock))
							{
								log.error("random.dat changed: {} -> {}", rlLoginBlock, randomData);
								JOptionPane.showMessageDialog(null,
										"random.dat file changed on: " + LocalDateTime.now() + " to new data: " + randomData,
										"Error random.dat changed",
										JOptionPane.ERROR_MESSAGE
								);
							}
						}
						catch (IOException e)
						{
							log.error("", e);
						}
					}
					log.info("Event kind: {} | File: {}", event.kind(), event.context());
				}
				poll = key.reset();
			}
		}).start();
	}

	public static void preload()
	{
		/**
		 * Use rl login block data
		 *
		 * When you try to login with an empty random.dat file, the myLoginBlock will be written to random.dat.
		 * When you login on runelite, rlLoginBlock gets written.
		 * If the block is written once it does not change again until jagex requests it.
		 *
		 * jagex_cl_oldschool.LIVE.dat is equal
		 */
		//byte[] myLoginBlock = new byte[] {-124, -92, -35, -7, 38, 12, 74, -4, -34, -16, 116, 56, 9, -68, 50, 84, -32, -93, -104, 92, -128, -40, -50, -56};
		final byte[] rlLoginBlock = new byte[] {-35, -91, -50, -47, -12, 24, 52, -102, 123, -32, 118, 92, -77, 48, 100, 12, -52, -79, -106, 34, -102, 91, -19, 121};
		final File randomDatFile = new File(OPENOSRS_DIR + File.separator + "random.dat");
		try
		{
			Files.write(randomDatFile.toPath(), rlLoginBlock, StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
		}
		catch (IOException e)
		{
			log.error("Failed to write rl login block data to: {}", randomDatFile, e);
			System.exit(0);
		}

		registerWatchService(OPENOSRS_DIR.toPath());

		if (!CACHE_DIR.exists())
		{
			JOptionPane.showMessageDialog(null,
					"Please first run RuneLite on this device before using OpenOSRS!",
					"Error loading cache",
					JOptionPane.ERROR_MESSAGE
			);

			System.exit(0);
		}
	}
}
