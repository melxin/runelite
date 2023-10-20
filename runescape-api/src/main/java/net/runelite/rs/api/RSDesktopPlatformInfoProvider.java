package net.runelite.rs.api;

import net.runelite.mapping.Construct;
import net.runelite.mapping.Import;

public interface RSDesktopPlatformInfoProvider
{
	@Import("get")
	RSPlatformInfo get();

	@Construct
	RSPlatformInfo newPlatformInfo(int os, boolean arch64, int osVersion, int vendor, int javaMajor, int javaMinor, int javaPatch, boolean var8, int maxMemory, int cpuCores, int var11, int clockSpeed, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25, String var26);
}
