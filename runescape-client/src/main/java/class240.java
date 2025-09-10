import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jc")
public class class240 {
	@ObfuscatedName("af")
	public static final int method5439(double var0, double var2, double var4) {
		double var6 = var4;
		double var8 = var4;
		double var10 = var4;
		if (var2 != 0.0D) {
			double var12;
			if (var4 < 0.5D) {
				var12 = var4 * (var2 + 1.0D);
			} else {
				var12 = var4 + var2 - var2 * var4;
			}

			double var14 = 2.0D * var4 - var12;
			double var16 = 0.3333333333333333D + var0;
			if (var16 > 1.0D) {
				--var16;
			}

			double var20 = var0 - 0.3333333333333333D;
			if (var20 < 0.0D) {
				++var20;
			}

			if (var16 * 6.0D < 1.0D) {
				var6 = var14 + (var12 - var14) * 6.0D * var16;
			} else if (2.0D * var16 < 1.0D) {
				var6 = var12;
			} else if (3.0D * var16 < 2.0D) {
				var6 = var14 + 6.0D * (0.6666666666666666D - var16) * (var12 - var14);
			} else {
				var6 = var14;
			}

			if (6.0D * var0 < 1.0D) {
				var8 = var14 + var0 * 6.0D * (var12 - var14);
			} else if (2.0D * var0 < 1.0D) {
				var8 = var12;
			} else if (3.0D * var0 < 2.0D) {
				var8 = 6.0D * (0.6666666666666666D - var0) * (var12 - var14) + var14;
			} else {
				var8 = var14;
			}

			if (6.0D * var20 < 1.0D) {
				var10 = var20 * (var12 - var14) * 6.0D + var14;
			} else if (2.0D * var20 < 1.0D) {
				var10 = var12;
			} else if (3.0D * var20 < 2.0D) {
				var10 = 6.0D * (0.6666666666666666D - var20) * (var12 - var14) + var14;
			} else {
				var10 = var14;
			}
		}

		int var22 = (int)(256.0D * var6);
		int var13 = (int)(var8 * 256.0D);
		int var23 = (int)(256.0D * var10);
		int var15 = var23 + (var13 << 8) + (var22 << 16);
		return var15;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "-1316496953"
	)
	public static String method5442(CharSequence var0) {
		int var1 = var0.length();
		StringBuilder var2 = new StringBuilder(var1);

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if ((var4 < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && (var4 < '0' || var4 > '9') && var4 != '.' && var4 != '-' && var4 != '*' && var4 != '_') {
				if (var4 == ' ') {
					var2.append('+');
				} else {
					byte var5 = UrlRequest.charToByteCp1252(var4);
					var2.append('%');
					int var6 = var5 >> 4 & 15;
					if (var6 >= 10) {
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48));
					}

					var6 = var5 & 15;
					if (var6 >= 10) {
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48));
					}
				}
			} else {
				var2.append(var4);
			}
		}

		return var2.toString();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "601543778"
	)
	public static int method5443(int var0, int var1) {
		int var2 = var0 >>> 31;
		return (var0 + var2) / var1 - var2;
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(ILcg;ZB)I",
		garbageValue = "1"
	)
	static int method5444(int var0, Script var1, boolean var2) {
		if (var0 == 7463) {
			boolean var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
			class574.method11011(var3);
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("nq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1358082337"
	)
	@Export("setMusicVolume")
	static final void setMusicVolume(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255);
		if (var0 != class36.clientPreferences.getMusicVolume()) {
			if (class36.clientPreferences.getMusicVolume() == 0 && class196.method4384()) {
				class166.method4028(WidgetDefinition.field4042, var0);
				Client.playingJingle = false;
			} else if (var0 == 0) {
				class257.method5884(0, 0);
				Client.playingJingle = false;
			} else {
				class305.method6838(var0);
			}

			class36.clientPreferences.updateMusicVolume(var0);
		}

	}
}
