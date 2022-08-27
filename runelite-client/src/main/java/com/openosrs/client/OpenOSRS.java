package com.openosrs.client;

import com.google.common.base.Strings;
import java.io.File;
import java.io.IOException;
import java.security.Policy;
import java.util.Properties;
import java.util.UUID;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import javax.swing.*;

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

	public static void preload()
	{
		String securityPolicyFile = OpenOSRS.class.getClassLoader().getResource("security.policy").getFile();
		System.setProperty("java.security.policy", securityPolicyFile);
		Policy.getPolicy().refresh();
		System.setSecurityManager(new SecurityManager());
		log.warn("Security manager is enabled");
		log.warn("Security policy file: {}", securityPolicyFile);

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
