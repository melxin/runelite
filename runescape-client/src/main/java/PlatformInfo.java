import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ud")
@Implements("PlatformInfo")
public class PlatformInfo extends Node implements class117 {
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1151563825
	)
	@Export("os")
	public int os;
	@ObfuscatedName("bc")
	@Export("arch64")
	boolean arch64;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 2142372007
	)
	@Export("osVersion")
	int osVersion;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -36834971
	)
	@Export("vendor")
	int vendor;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 1380604157
	)
	@Export("javaMajor")
	int javaMajor;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 505311211
	)
	@Export("javaMinor")
	int javaMinor;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 642559705
	)
	@Export("javaPatch")
	int javaPatch;
	@ObfuscatedName("bl")
	@Export("field4524")
	boolean field4524;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 1925548391
	)
	@Export("maxMemory")
	int maxMemory;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 885517979
	)
	@Export("cpuCores")
	int cpuCores;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 1132444261
	)
	@Export("field5105")
	int field5105;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -516027745
	)
	@Export("clockSpeed")
	int clockSpeed;
	@ObfuscatedName("cy")
	@Export("field4536")
	String field4536;
	@ObfuscatedName("cj")
	@Export("field4541")
	String field4541;
	@ObfuscatedName("ce")
	@Export("field5103")
	String field5103;
	@ObfuscatedName("cl")
	@Export("field5110")
	String field5110;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -1251107093
	)
	@Export("field4512")
	int field4512;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -1553783883
	)
	@Export("field5112")
	int field5112;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -1617691713
	)
	@Export("field5089")
	int field5089;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -1806215271
	)
	@Export("field5114")
	int field5114;
	@ObfuscatedName("cn")
	@Export("field4537")
	String field4537;
	@ObfuscatedName("ck")
	@Export("field5116")
	String field5116;
	@ObfuscatedName("cx")
	@Export("field4539")
	int[] field4539;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -333883657
	)
	@Export("field4540")
	int field4540;
	@ObfuscatedName("ct")
	@Export("field5119")
	String field5119;
	@ObfuscatedName("cf")
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "-1007791874"
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "32"
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1145805215"
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-10"
	)
	public static int method10712(int var0) {
		return (var0 & class578.field5910) - 1;
	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(Ldm;B)V",
		garbageValue = "40"
	)
	static void method10717(WorldView var0) {
		int var1 = var0.sizeX / 8;
		int var2 = var0.sizeY / 8;
		boolean var3 = false;
		Player.method2271(false);
		var3 = true;

		int var4;
		for (var4 = 0; var4 < class196.field2145.length; ++var4) {
			if (class331.field3831[var4] != -1 && class196.field2145[var4] == null) {
				class196.field2145[var4] = ItemContainer.archive9.takeFile(class331.field3831[var4], 0);
				if (class196.field2145[var4] == null) {
					var3 = false;
				}
			}

			if (class140.field1710[var4] != -1 && class204.field2245[var4] == null) {
				class204.field2245[var4] = ItemContainer.archive9.takeFileEncrypted(class140.field1710[var4], 0, class135.field1642[var4]);
				if (class204.field2245[var4] == null) {
					var3 = false;
				}
			}
		}

		if (var3) {
			Player.method2271(false);
			var3 = true;

			for (var4 = 0; var4 < class196.field2145.length; ++var4) {
				byte[] var17 = class204.field2245[var4];
				if (var17 != null) {
					byte var6 = 10;
					byte var7 = 10;
					var3 &= class533.method10661(var17, var6, var7);
				}
			}

			if (var3) {
				int var5;
				for (var4 = 0; var4 < 4; ++var4) {
					for (var5 = 0; var5 < var0.tileSettings[var4].length; ++var5) {
						Arrays.fill(var0.tileSettings[var4][var5], (byte)0);
					}
				}

				StudioGame.method8201();
				NpcOverrides.method4378();
				var0.method2747();
				Player.method2271(true);

				int var8;
				int var9;
				int var10;
				int var11;
				int var12;
				int var13;
				int var18;
				for (var4 = 0; var4 < 4; ++var4) {
					StudioGame.method8201();

					for (var5 = 0; var5 < var1; ++var5) {
						for (var18 = 0; var18 < var2; ++var18) {
							boolean var19 = false;
							var8 = Client.field445[var4][var5][var18];
							if (var8 != -1) {
								var9 = SpotAnimationDefinition.method4496(var8);
								var10 = WorldMapEvent.method6973(var8);
								var11 = class210.method4671(var8);
								var12 = class138.method3798(var8);
								var13 = (var11 / 8 << 8) + var12 / 8;

								for (int var14 = 0; var14 < class62.field864.length; ++var14) {
									if (class62.field864[var14] == var13 && class196.field2145[var14] != null) {
										int var15 = (var11 - var5) * 8;
										int var16 = (var12 - var18) * 8;
										AttackOption.method2881(var0, class196.field2145[var14], var4, var5 * 8, var18 * 8, var9, (var11 & 7) * 8, (var12 & 7) * 8, var10, var15, var16);
										var19 = true;
										break;
									}
								}
							}

							if (!var19) {
								MusicPatchNode2.method7120(var0.tileHeights, var4, var5 * 8, var18 * 8);
							}
						}
					}
				}

				for (var4 = 0; var4 < 13; ++var4) {
					for (var5 = 0; var5 < 13; ++var5) {
						var18 = Client.field445[0][var4][var5];
						if (var18 == -1) {
							ChatChannel.method2057(var0, var4 * 8, var5 * 8, 8, 8);
						}
					}
				}

				Player.method2271(true);

				for (var4 = 0; var4 < 4; ++var4) {
					StudioGame.method8201();

					for (var5 = 0; var5 < var1; ++var5) {
						for (var18 = 0; var18 < var2; ++var18) {
							int var20 = Client.field445[var4][var5][var18];
							if (var20 != -1) {
								var8 = SpotAnimationDefinition.method4496(var20);
								var9 = WorldMapEvent.method6973(var20);
								var10 = class210.method4671(var20);
								var11 = class138.method3798(var20);
								var12 = (var10 / 8 << 8) + var11 / 8;

								for (var13 = 0; var13 < class62.field864.length; ++var13) {
									if (class62.field864[var13] == var12 && class204.field2245[var13] != null) {
										Tiles.method2110(var0, class204.field2245[var13], var4, var5 * 8, var18 * 8, var8, (var10 & 7) * 8, (var11 & 7) * 8, var9);
										break;
									}
								}
							}
						}
					}
				}

				Player.method2271(true);
				StudioGame.method8201();
				Skills.method8168(var0);
				Player.method2271(true);
				ObjectComposition.ObjectDefinition_cachedModelData.clear();
				StudioGame.method8201();
				HealthBarDefinition.method4316();
				Client.field433 = false;
			}
		}
	}
}
