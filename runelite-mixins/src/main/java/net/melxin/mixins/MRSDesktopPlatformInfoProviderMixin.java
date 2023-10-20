package net.melxin.mixins;

import net.runelite.api.mixins.Copy;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Replace;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSDesktopPlatformInfoProvider;
import net.runelite.rs.api.RSPlatformInfo;

@Mixin(RSDesktopPlatformInfoProvider.class)
public abstract class MRSDesktopPlatformInfoProviderMixin implements RSDesktopPlatformInfoProvider
{
	@Shadow("client")
	private static RSClient client;

	private final int os = 1; // WINDOWS=1, MAC_OS=2, LINUX=3, OTHER=4
	private final boolean arch64 = true;
	private final int osVersion = 10;

	private final int vendor = 5; // SUN=1, MICROSOFT=2, APPLE=3, ORACLE=5, OTHER=4

	private final int javaMajor = 8;
	private final int javaMinor = 0;
	private final int javaPatch = 381;

	/**
	 * Either set this 257 or 385, original vanilla is 256+1=257
	 * with jagex launcher they set Xmx384m VM option, when we do the calculation with
	 * (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1; which can be found in {@link net.runelite.rs.api.RSDesktopPlatformInfoProvider}
	 * it will return the memory + 1
	 *
	 * source: <https://oldschool.runescape.wiki/w/Java_Client>
	 */
	private final int maxMemory = 257;

	private final int cpuCores = 4;
	private final int clockSpeed = 0;

	@Copy("get")
	@Replace("get")
	public RSPlatformInfo copy$get()
	{
		RSPlatformInfo rsPlatformInfo = copy$get();
		client.getLogger().info("original platform info: os:{}, arch64:{}, osVersion:{}, vendor:{}, javaMajor:{}, javaMinor:{}, javaPatch:{}, maxMemory:{}, cpuCores:{}, clockSpeed:{}", rsPlatformInfo.getOs(), rsPlatformInfo.isArch64(), rsPlatformInfo.getOsVersion(), rsPlatformInfo.getVendor(), rsPlatformInfo.getJavaMajor(), rsPlatformInfo.getJavaMinor(), rsPlatformInfo.getJavaPatch(), rsPlatformInfo.getMaxMemory(), rsPlatformInfo.getCpuCores(), rsPlatformInfo.getClockSpeed());
		rsPlatformInfo.setOs(os);
		rsPlatformInfo.setArch64(arch64);
		rsPlatformInfo.setOsVersion(osVersion);
		rsPlatformInfo.setVendor(vendor);
		rsPlatformInfo.setJavaMajor(javaMajor);
		rsPlatformInfo.setJavaMinor(javaMinor);
		rsPlatformInfo.setJavaPatch(javaPatch);
		rsPlatformInfo.setMaxMemory(maxMemory);
		rsPlatformInfo.setCpuCores(cpuCores);
		rsPlatformInfo.setClockSpeed(clockSpeed);
		client.getLogger().info("changed platform info: os:{}, arch64:{}, osVersion:{}, vendor:{}, javaMajor:{}, javaMinor:{}, javaPatch:{}, maxMemory:{}, cpuCores:{}, clockSpeed:{}", rsPlatformInfo.getOs(), rsPlatformInfo.isArch64(), rsPlatformInfo.getOsVersion(), rsPlatformInfo.getVendor(), rsPlatformInfo.getJavaMajor(), rsPlatformInfo.getJavaMinor(), rsPlatformInfo.getJavaPatch(), rsPlatformInfo.getMaxMemory(), rsPlatformInfo.getCpuCores(), rsPlatformInfo.getClockSpeed());
		return rsPlatformInfo;
	}
}