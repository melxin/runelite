package net.melxin.mixins;

import net.runelite.api.mixins.Mixin;
import net.runelite.rs.api.RSBuffer;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSPlatformInfo;

@Mixin(RSPlatformInfo.class)
public abstract class MRSPlatformInfoMixin implements RSPlatformInfo
{
	//@Shadow("client")
	private static RSClient client;

	//@Inject
	//@MethodHook(value = "<init>", end = true)
	public void init(int os, boolean arch64, int osVersion, int vendor, int javaMajor, int javaMinor, int javaPatch, boolean var8, int maxMemory, int cpuCores, int var11, int clockSpeed, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25, String var26)
	{
		client.getLogger().info("Init PlatformInfo");

		/**
		 * Use {@link MRSDesktopPlatformInfoProviderMixin} instead
		 */
		//this.setOs(1);
		//this.setArch64(true);
		//this.setOsVersion(10);
		//this.setVendor(5);
		//this.setJavaMajor(8);
		//this.setJavaMinor(0);
		//this.setJavaPatch(381);
		//this.setMaxMemory(257);
		//this.setCpuCores(4);
		//this.setClockSpeed(0);
	}

	//@Inject
	//@MethodHook("write")
	public void onWrite(RSBuffer var1)
	{
		client.getLogger().info("Write PlatformInfo");
		client.getLogger().info("Os: {}", this.getOs());
		client.getLogger().info("Arch64: {}", this.isArch64());
		client.getLogger().info("Os version: {}", this.getOsVersion());
		client.getLogger().info("Vendor: {}", this.getVendor());
		client.getLogger().info("Java minor: {}", this.getJavaMinor());
		client.getLogger().info("Java major: {}", this.getJavaMajor());
		client.getLogger().info("Java patch: {}", this.getJavaPatch());
		client.getLogger().info("max memory: {}", this.getMaxMemory());
		client.getLogger().info("Cpu core: {}", this.getCpuCores());
		client.getLogger().info("Clock speed: {}", this.getClockSpeed());
	}
}
