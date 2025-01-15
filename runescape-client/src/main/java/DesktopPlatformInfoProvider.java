import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tz")
@Implements("DesktopPlatformInfoProvider")
public class DesktopPlatformInfoProvider implements class517 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	@Export("ItemDefinition_fontPlain11")
	static Font ItemDefinition_fontPlain11;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 725544721
	)
	int field5176;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 694410193
	)
	int field5182;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 158239803
	)
	int field5180;

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Ltp;",
		garbageValue = "-2112494538"
	)
	@Export("get")
	public PlatformInfo get() {
		byte var1;
		if (Decimator.osNameLowercase.startsWith("win")) {
			var1 = 1;
		} else if (Decimator.osNameLowercase.startsWith("mac")) {
			var1 = 2;
		} else if (Decimator.osNameLowercase.startsWith("linux")) {
			var1 = 3;
		} else {
			var1 = 4;
		}

		String var2;
		try {
			var2 = System.getProperty("os.arch").toLowerCase();
		} catch (Exception var32) {
			var2 = "";
		}

		String var3;
		try {
			var3 = System.getProperty("os.version").toLowerCase();
		} catch (Exception var31) {
			var3 = "";
		}

		String var4 = "Unknown";
		String var5 = "1.1";

		try {
			var4 = System.getProperty("java.vendor");
			var5 = System.getProperty("java.version");
		} catch (Exception var30) {
		}

		boolean var29;
		if (!var2.startsWith("amd64") && !var2.startsWith("x86_64")) {
			var29 = false;
		} else {
			var29 = true;
		}

		byte var7 = 0;
		if (var1 == 1) {
			if (var3.indexOf("4.0") != -1) {
				var7 = 1;
			} else if (var3.indexOf("4.1") != -1) {
				var7 = 2;
			} else if (var3.indexOf("4.9") != -1) {
				var7 = 3;
			} else if (var3.indexOf("5.0") != -1) {
				var7 = 4;
			} else if (var3.indexOf("5.1") != -1) {
				var7 = 5;
			} else if (var3.indexOf("5.2") != -1) {
				var7 = 8;
			} else if (var3.indexOf("6.0") != -1) {
				var7 = 6;
			} else if (var3.indexOf("6.1") != -1) {
				var7 = 7;
			} else if (var3.indexOf("6.2") != -1) {
				var7 = 9;
			} else if (var3.indexOf("6.3") != -1) {
				var7 = 10;
			} else if (var3.indexOf("10.0") != -1) {
				var7 = 11;
			}
		} else if (var1 == 2) {
			if (var3.indexOf("10.4") != -1) {
				var7 = 20;
			} else if (var3.indexOf("10.5") != -1) {
				var7 = 21;
			} else if (var3.indexOf("10.6") != -1) {
				var7 = 22;
			} else if (var3.indexOf("10.7") != -1) {
				var7 = 23;
			} else if (var3.indexOf("10.8") != -1) {
				var7 = 24;
			} else if (var3.indexOf("10.9") != -1) {
				var7 = 25;
			} else if (var3.indexOf("10.10") != -1) {
				var7 = 26;
			} else if (var3.indexOf("10.11") != -1) {
				var7 = 27;
			} else if (var3.indexOf("10.12") != -1) {
				var7 = 28;
			} else if (var3.indexOf("10.13") != -1) {
				var7 = 29;
			}
		}

		byte var8;
		if (var4.toLowerCase().indexOf("sun") != -1) {
			var8 = 1;
		} else if (var4.toLowerCase().indexOf("microsoft") != -1) {
			var8 = 2;
		} else if (var4.toLowerCase().indexOf("apple") != -1) {
			var8 = 3;
		} else if (var4.toLowerCase().indexOf("oracle") != -1) {
			var8 = 5;
		} else {
			var8 = 4;
		}

		this.method9632(var5);
		boolean var9 = false;
		int var10 = (int)(Runtime.getRuntime().maxMemory() / 1048576L) + 1;
		int var11;
		if (this.field5176 > 3) {
			var11 = Runtime.getRuntime().availableProcessors();
		} else {
			var11 = 0;
		}

		byte var12 = 0;
		String var13 = "";
		String var14 = "";
		String var15 = "";
		String var16 = "";
		String var17 = "";
		String var18 = "";
		boolean var19 = false;
		boolean var20 = false;
		boolean var21 = false;
		boolean var22 = false;
		int[] var23 = new int[3];
		boolean var24 = false;
		String var25 = "";
		String var26 = "";
		String var27 = "";
		boolean var28 = false;
		return new PlatformInfo(var1, var29, var7, var8, this.field5176, this.field5182, this.field5180, false, var10, var11, var12, 0, var13, var14, var15, var16, 0, 0, 0, 0, var17, var18, var23, 0, "", "", var27);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "0"
	)
	void method9632(String var1) {
		if (var1.startsWith("1.")) {
			this.method9633(var1);
		} else {
			this.method9639(var1);
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-606608940"
	)
	void method9633(String var1) {
		String[] var2 = var1.split("\\.");

		try {
			this.field5176 = Integer.parseInt(var2[1]);
			var2 = var2[2].split("_");
			this.field5182 = Integer.parseInt(var2[0]);
			this.field5180 = Integer.parseInt(var2[1]);
		} catch (Exception var4) {
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-2073261161"
	)
	void method9639(String var1) {
		String[] var2 = var1.split("\\.");

		try {
			this.field5176 = Integer.parseInt(var2[0]);
			this.field5182 = Integer.parseInt(var2[1]);
			this.field5180 = Integer.parseInt(var2[2]);
		} catch (Exception var4) {
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([I[IIII)V",
		garbageValue = "-773819736"
	)
	public static void method9651(int[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			int var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;
			int var8 = var6 == Integer.MAX_VALUE ? 0 : 1;

			for (int var9 = var2; var9 < var3; ++var9) {
				if (var0[var9] < (var9 & var8) + var6) {
					int var10 = var0[var9];
					var0[var9] = var0[var5];
					var0[var5] = var10;
					int var11 = var1[var9];
					var1[var9] = var1[var5];
					var1[var5++] = var11;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method9651(var0, var1, var2, var5 - 1);
			method9651(var0, var1, var5 + 1, var3);
		}

	}
}
