package net.runelite.mixins;

import net.runelite.api.mixins.Copy;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Replace;
import net.runelite.rs.api.RSDesktopPlatformInfoProvider;
import net.runelite.rs.api.RSPlatformInfo;

@Mixin(RSDesktopPlatformInfoProvider.class)
public abstract class DesktopPlatformInfoProviderMixin
{
	@Copy("get")
	@Replace("get")
	public RSPlatformInfo rl$get()
	{
		RSPlatformInfo original = rl$get();

		original.setClockSpeed(24);
		original.setOs(1); // 1=Windows, 2=Mac, 3=Linux
		original.setJavaMajor(11);
		original.setJavaMinor(0);
		original.setJavaPatch(8);
		original.setOsVersion(11);
		original.setVendor(2); // 1=Sun, 2=Microsoft, 3=Apple, 5=Oracle
		original.setCpuCores(8);
		original.setMaxMemory(513);

		return original;
	}
}
