import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vn")
@Implements("PlatformInfo")
public class PlatformInfo extends Node implements class119 {
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -208903543
	)
	@Export("os")
	public int os;
	@ObfuscatedName("bf")
	@Export("arch64")
	boolean arch64;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -1081993137
	)
	@Export("osVersion")
	int osVersion;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -639246517
	)
	@Export("vendor")
	int vendor;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 448210999
	)
	@Export("javaMajor")
	int javaMajor;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 132591797
	)
	@Export("javaMinor")
	int javaMinor;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -478159607
	)
	@Export("javaPatch")
	int javaPatch;
	@ObfuscatedName("bc")
	@Export("field4524")
	boolean field4524;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -600139767
	)
	@Export("maxMemory")
	int maxMemory;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -1718995343
	)
	@Export("cpuCores")
	int cpuCores;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1423069925
	)
	@Export("field5105")
	int field5105;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 701611621
	)
	@Export("clockSpeed")
	int clockSpeed;
	@ObfuscatedName("ce")
	@Export("field4536")
	String field4536;
	@ObfuscatedName("cu")
	@Export("field4541")
	String field4541;
	@ObfuscatedName("ct")
	@Export("field5103")
	String field5103;
	@ObfuscatedName("cm")
	@Export("field5110")
	String field5110;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -1613592189
	)
	@Export("field4512")
	int field4512;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 980285567
	)
	@Export("field5112")
	int field5112;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -1928072387
	)
	@Export("field5089")
	int field5089;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 1643159983
	)
	@Export("field5114")
	int field5114;
	@ObfuscatedName("cn")
	@Export("field4537")
	String field4537;
	@ObfuscatedName("co")
	@Export("field5116")
	String field5116;
	@ObfuscatedName("cx")
	@Export("field4539")
	int[] field4539;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 1210319985
	)
	@Export("field4540")
	int field4540;
	@ObfuscatedName("cp")
	@Export("field5119")
	String field5119;
	@ObfuscatedName("cd")
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxa;I)V",
		garbageValue = "709577415"
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
		garbageValue = "61"
	)
	@Export("size")
	public int size() {
		byte var1 = 39;
		int var2 = var1 + class169.method4186(this.field4536);
		var2 += class169.method4186(this.field4541);
		var2 += class169.method4186(this.field5103);
		var2 += class169.method4186(this.field5110);
		var2 += class169.method4186(this.field4537);
		var2 += class169.method4186(this.field5116);
		var2 += class169.method4186(this.field5119);
		var2 += class169.method4186(this.field5120);
		return var2;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "168937541"
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
		descriptor = "(Ljava/lang/CharSequence;Lwc;B)Ljava/lang/String;",
		garbageValue = "-6"
	)
	public static String method10936(CharSequence var0, LoginType var1) {
		if (var0 == null) {
			return null;
		} else {
			int var2 = 0;

			int var3;
			for (var3 = var0.length(); var2 < var3 && class143.method3890(var0.charAt(var2)); ++var2) {
			}

			while (var3 > var2 && class143.method3890(var0.charAt(var3 - 1))) {
				--var3;
			}

			int var4 = var3 - var2;
			if (var4 >= 1) {
				byte var6;
				if (var1 == null) {
					var6 = 12;
				} else {
					switch(var1.field5900) {
					case 2:
						var6 = 20;
						break;
					default:
						var6 = 12;
					}
				}

				if (var4 <= var6) {
					StringBuilder var10 = new StringBuilder(var4);

					for (int var11 = var2; var11 < var3; ++var11) {
						char var7 = var0.charAt(var11);
						if (class406.method8492(var7)) {
							char var8;
							switch(var7) {
							case ' ':
							case '-':
							case '_':
							case ' ':
								var8 = '_';
								break;
							case '#':
							case '[':
							case ']':
								var8 = var7;
								break;
							case 'À':
							case 'Á':
							case 'Â':
							case 'Ã':
							case 'Ä':
							case 'à':
							case 'á':
							case 'â':
							case 'ã':
							case 'ä':
								var8 = 'a';
								break;
							case 'Ç':
							case 'ç':
								var8 = 'c';
								break;
							case 'È':
							case 'É':
							case 'Ê':
							case 'Ë':
							case 'è':
							case 'é':
							case 'ê':
							case 'ë':
								var8 = 'e';
								break;
							case 'Í':
							case 'Î':
							case 'Ï':
							case 'í':
							case 'î':
							case 'ï':
								var8 = 'i';
								break;
							case 'Ñ':
							case 'ñ':
								var8 = 'n';
								break;
							case 'Ò':
							case 'Ó':
							case 'Ô':
							case 'Õ':
							case 'Ö':
							case 'ò':
							case 'ó':
							case 'ô':
							case 'õ':
							case 'ö':
								var8 = 'o';
								break;
							case 'Ù':
							case 'Ú':
							case 'Û':
							case 'Ü':
							case 'ù':
							case 'ú':
							case 'û':
							case 'ü':
								var8 = 'u';
								break;
							case 'ß':
								var8 = 'b';
								break;
							case 'ÿ':
							case 'Ÿ':
								var8 = 'y';
								break;
							default:
								var8 = Character.toLowerCase(var7);
							}

							if (var8 != 0) {
								var10.append(var8);
							}
						}
					}

					if (var10.length() == 0) {
						return null;
					}

					return var10.toString();
				}
			}

			return null;
		}
	}
}
