import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uf")
@Implements("PlatformInfo")
public class PlatformInfo extends Node implements class117 {
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 1028583515
	)
	@Export("os")
	public int os;
	@ObfuscatedName("bc")
	@Export("arch64")
	boolean arch64;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 22067297
	)
	@Export("osVersion")
	int osVersion;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -1279617321
	)
	@Export("vendor")
	int vendor;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 1028465611
	)
	@Export("javaMajor")
	int javaMajor;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 1754381841
	)
	@Export("javaMinor")
	int javaMinor;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 1475696803
	)
	@Export("javaPatch")
	int javaPatch;
	@ObfuscatedName("br")
	@Export("field4524")
	boolean field4524;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 611880807
	)
	@Export("maxMemory")
	int maxMemory;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 813821463
	)
	@Export("cpuCores")
	int cpuCores;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -1238253601
	)
	@Export("field5105")
	int field5105;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 435629421
	)
	@Export("clockSpeed")
	int clockSpeed;
	@ObfuscatedName("cy")
	@Export("field4536")
	String field4536;
	@ObfuscatedName("ca")
	@Export("field4541")
	String field4541;
	@ObfuscatedName("cr")
	@Export("field5103")
	String field5103;
	@ObfuscatedName("cu")
	@Export("field5110")
	String field5110;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 1300908459
	)
	@Export("field4512")
	int field4512;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = -760539031
	)
	@Export("field5112")
	int field5112;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -1164372705
	)
	@Export("field5089")
	int field5089;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -384712833
	)
	@Export("field5114")
	int field5114;
	@ObfuscatedName("cg")
	@Export("field4537")
	String field4537;
	@ObfuscatedName("cx")
	@Export("field5116")
	String field5116;
	@ObfuscatedName("cw")
	@Export("field4539")
	int[] field4539;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 150299823
	)
	@Export("field4540")
	int field4540;
	@ObfuscatedName("cs")
	@Export("field5119")
	String field5119;
	@ObfuscatedName("ct")
	@Export("field5120")
	String field5120;

	PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25, String var26, String var27) {
		this.field4539 = new int[3];
		this.os = var1;
		this.arch64 = var2;
		this.osVersion = var3;
		this.vendor = var4;
		this.javaMajor = var5;
		this.javaMinor = var6;
		this.javaPatch = var7;
		this.field4524 = var8;
		this.maxMemory = var9;
		this.cpuCores = var10;
		this.field5105 = var11;
		this.clockSpeed = var12;
		this.field4536 = var13;
		this.field4541 = var14;
		this.field5103 = var15;
		this.field5110 = var16;
		this.field4512 = var17;
		this.field5112 = var18;
		this.field5089 = var19;
		this.field5114 = var20;
		this.field4537 = var21;
		this.field5116 = var22;
		this.field4539 = var23;
		this.field4540 = var24;
		this.field5119 = var25;
		this.field5120 = var26;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lwt;S)V",
		garbageValue = "233"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(9);
		var1.writeByte(this.os);
		var1.writeByte(this.arch64 ? 1 : 0);
		var1.writeShort(this.osVersion);
		var1.writeByte(this.vendor);
		var1.writeByte(this.javaMajor);
		var1.writeByte(this.javaMinor);
		var1.writeByte(this.javaPatch);
		var1.writeByte(this.field4524 ? 1 : 0);
		var1.writeShort(this.maxMemory);
		var1.writeByte(this.cpuCores);
		var1.writeMedium(this.field5105);
		var1.writeShort(this.clockSpeed);
		var1.writeStringCp1252NullCircumfixed(this.field4536);
		var1.writeStringCp1252NullCircumfixed(this.field4541);
		var1.writeStringCp1252NullCircumfixed(this.field5103);
		var1.writeStringCp1252NullCircumfixed(this.field5110);
		var1.writeByte(this.field5112);
		var1.writeShort(this.field4512);
		var1.writeStringCp1252NullCircumfixed(this.field4537);
		var1.writeStringCp1252NullCircumfixed(this.field5116);
		var1.writeByte(this.field5089);
		var1.writeByte(this.field5114);

		for (int var2 = 0; var2 < this.field4539.length; ++var2) {
			var1.writeInt(this.field4539[var2]);
		}

		var1.writeInt(this.field4540);
		var1.writeStringCp1252NullCircumfixed(this.field5119);
		var1.writeStringCp1252NullCircumfixed(this.field5120);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "734745187"
	)
	@Export("size")
	public int size() {
		byte var1 = 39;
		String var4 = this.field4536;
		int var3 = var4.length() + 2;
		int var26 = var1 + var3;
		String var7 = this.field4541;
		int var6 = var7.length() + 2;
		var26 += var6;
		String var10 = this.field5103;
		int var9 = var10.length() + 2;
		var26 += var9;
		String var13 = this.field5110;
		int var12 = var13.length() + 2;
		var26 += var12;
		String var16 = this.field4537;
		int var15 = var16.length() + 2;
		var26 += var15;
		String var19 = this.field5116;
		int var18 = var19.length() + 2;
		var26 += var18;
		String var22 = this.field5119;
		int var21 = var22.length() + 2;
		var26 += var21;
		String var25 = this.field5120;
		int var24 = var25.length() + 2;
		var26 += var24;
		return var26;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-2060155674"
	)
	@Export("getDeviceId")
	public String getDeviceId(int var1) {
		String var2 = "";
		String var3 = "12345678-0000-0000-0000-123456789012";
		switch(var1) {
		case 1:
			var2 = "wmic csproduct get UUID";
			break;
		case 2:
			var2 = "system_profiler SPHardwareDataType | awk '/UUID/ { print $3; }'";
			break;
		case 3:
			var2 = "cat /etc/machine-id";
			break;
		default:
			return "Unknown";
		}

		BufferedReader var4 = null;

		try {
			Process var5 = Runtime.getRuntime().exec(var2);
			var4 = new BufferedReader(new InputStreamReader(var5.getInputStream()));
			StringBuilder var6 = new StringBuilder();

			String var7;
			while ((var7 = var4.readLine()) != null) {
				var6.append(var7 + "\n");
			}

			if (var1 == 1) {
				var3 = var6.substring(var6.indexOf("\n"), var6.length()).trim();
			} else if (var1 == 2) {
				int var8 = var6.indexOf("UUID: ") + 36;
				var3 = var6.substring(var6.indexOf("UUID: "), var8).replace("UUID: ", "");
			} else if (var1 == 3) {
				if (var6.length() == 33) {
					var6 = new StringBuilder(var6.substring(0, var6.length() - 1));
				}

				if (var6.length() == 32) {
					var6.insert(20, "-");
					var6.insert(16, "-");
					var6.insert(12, "-");
					var6.insert(8, "-");
					var3 = var6.toString();
				} else {
					var3 = "12345678-0000-0000-0000-123456789012";
				}
			}
		} catch (Exception var17) {
		} finally {
			try {
				if (var4 != null) {
					var4.close();
				}
			} catch (IOException var16) {
			}

		}

		return var3;
	}
}
