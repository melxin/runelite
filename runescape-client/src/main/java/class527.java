import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ui")
public class class527 {
	@ObfuscatedName("ac")
	static int[] field5369;
	@ObfuscatedName("aa")
	public static int[] field5374;

	static {
		field5369 = new int[32768];

		for (int var0 = 0; var0 < 32768; ++var0) {
			field5369[var0] = method10161(var0);
		}

		method10162();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(CB)B",
		garbageValue = "1"
	)
	@Export("charToByteCp1252")
	public static byte charToByteCp1252(char var0) {
		byte var1;
		if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
			if (var0 == 8364) {
				var1 = -128;
			} else if (var0 == 8218) {
				var1 = -126;
			} else if (var0 == 402) {
				var1 = -125;
			} else if (var0 == 8222) {
				var1 = -124;
			} else if (var0 == 8230) {
				var1 = -123;
			} else if (var0 == 8224) {
				var1 = -122;
			} else if (var0 == 8225) {
				var1 = -121;
			} else if (var0 == 710) {
				var1 = -120;
			} else if (var0 == 8240) {
				var1 = -119;
			} else if (var0 == 352) {
				var1 = -118;
			} else if (var0 == 8249) {
				var1 = -117;
			} else if (var0 == 338) {
				var1 = -116;
			} else if (var0 == 381) {
				var1 = -114;
			} else if (var0 == 8216) {
				var1 = -111;
			} else if (var0 == 8217) {
				var1 = -110;
			} else if (var0 == 8220) {
				var1 = -109;
			} else if (var0 == 8221) {
				var1 = -108;
			} else if (var0 == 8226) {
				var1 = -107;
			} else if (var0 == 8211) {
				var1 = -106;
			} else if (var0 == 8212) {
				var1 = -105;
			} else if (var0 == 732) {
				var1 = -104;
			} else if (var0 == 8482) {
				var1 = -103;
			} else if (var0 == 353) {
				var1 = -102;
			} else if (var0 == 8250) {
				var1 = -101;
			} else if (var0 == 339) {
				var1 = -100;
			} else if (var0 == 382) {
				var1 = -98;
			} else if (var0 == 376) {
				var1 = -97;
			} else {
				var1 = 63;
			}
		} else {
			var1 = (byte)var0;
		}

		return var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1714876812"
	)
	static final int method10161(int var0) {
		double var1 = (double)(var0 >> 10 & 31) / 31.0D;
		double var3 = (double)(var0 >> 5 & 31) / 31.0D;
		double var5 = (double)(var0 & 31) / 31.0D;
		double var7 = var1;
		if (var3 < var1) {
			var7 = var3;
		}

		if (var5 < var7) {
			var7 = var5;
		}

		double var9 = var1;
		if (var3 > var1) {
			var9 = var3;
		}

		if (var5 > var9) {
			var9 = var5;
		}

		double var11 = 0.0D;
		double var13 = 0.0D;
		double var15 = (var9 + var7) / 2.0D;
		if (var7 != var9) {
			if (var15 < 0.5D) {
				var13 = (var9 - var7) / (var9 + var7);
			}

			if (var15 >= 0.5D) {
				var13 = (var9 - var7) / (2.0D - var9 - var7);
			}

			if (var1 == var9) {
				var11 = (var3 - var5) / (var9 - var7);
			} else if (var9 == var3) {
				var11 = (var5 - var1) / (var9 - var7) + 2.0D;
			} else if (var5 == var9) {
				var11 = (var1 - var3) / (var9 - var7) + 4.0D;
			}
		}

		int var17 = (int)(var11 * 256.0D / 6.0D);
		var17 &= 255;
		double var18 = var13 * 256.0D;
		if (var18 < 0.0D) {
			var18 = 0.0D;
		} else if (var18 > 255.0D) {
			var18 = 255.0D;
		}

		if (var15 > 0.7D) {
			var18 /= 2.0D;
			var18 = Math.floor(var18);
		}

		if (var15 > 0.75D) {
			var18 /= 2.0D;
			var18 = Math.floor(var18);
		}

		if (var15 > 0.85D) {
			var18 /= 2.0D;
			var18 = Math.floor(var18);
		}

		if (var15 > 0.95D) {
			var18 /= 2.0D;
			var18 = Math.floor(var18);
		}

		if (var15 > 0.995D) {
			var15 = 0.995D;
		}

		int var20 = (int)(var18 / 32.0D + (double)(var17 / 4 * 8));
		return (int)(128.0D * var15) + (var20 << 7);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "23"
	)
	static void method10162() {
		if (field5374 == null) {
			field5374 = new int[65536];
			double var0 = 0.949999988079071D;

			for (int var2 = 0; var2 < 65536; ++var2) {
				double var3 = (double)(var2 >> 10 & 63) / 64.0D + 0.0078125D;
				double var5 = (double)(var2 >> 7 & 7) / 8.0D + 0.0625D;
				double var7 = (double)(var2 & 127) / 128.0D;
				double var9 = var7;
				double var11 = var7;
				double var13 = var7;
				if (0.0D != var5) {
					double var15;
					if (var7 < 0.5D) {
						var15 = var7 * (1.0D + var5);
					} else {
						var15 = var7 + var5 - var5 * var7;
					}

					double var17 = var7 * 2.0D - var15;
					double var19 = var3 + 0.3333333333333333D;
					if (var19 > 1.0D) {
						--var19;
					}

					double var23 = var3 - 0.3333333333333333D;
					if (var23 < 0.0D) {
						++var23;
					}

					if (var19 * 6.0D < 1.0D) {
						var9 = var17 + var19 * (var15 - var17) * 6.0D;
					} else if (var19 * 2.0D < 1.0D) {
						var9 = var15;
					} else if (3.0D * var19 < 2.0D) {
						var9 = var17 + (var15 - var17) * (0.6666666666666666D - var19) * 6.0D;
					} else {
						var9 = var17;
					}

					if (6.0D * var3 < 1.0D) {
						var11 = 6.0D * (var15 - var17) * var3 + var17;
					} else if (2.0D * var3 < 1.0D) {
						var11 = var15;
					} else if (var3 * 3.0D < 2.0D) {
						var11 = var17 + (0.6666666666666666D - var3) * (var15 - var17) * 6.0D;
					} else {
						var11 = var17;
					}

					if (6.0D * var23 < 1.0D) {
						var13 = var17 + var23 * (var15 - var17) * 6.0D;
					} else if (2.0D * var23 < 1.0D) {
						var13 = var15;
					} else if (var23 * 3.0D < 2.0D) {
						var13 = var17 + (0.6666666666666666D - var23) * (var15 - var17) * 6.0D;
					} else {
						var13 = var17;
					}
				}

				var9 = Math.pow(var9, var0);
				var11 = Math.pow(var11, var0);
				var13 = Math.pow(var13, var0);
				int var25 = (int)(256.0D * var9);
				int var16 = (int)(256.0D * var11);
				int var26 = (int)(var13 * 256.0D);
				int var18 = var26 + (var16 << 8) + (var25 << 16);
				field5374[var2] = var18 & 16777215;
			}

		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1422661709"
	)
	public static int method10160(int var0) {
		return 255 - (var0 & 255);
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ILcr;ZB)I",
		garbageValue = "-28"
	)
	static int method10165(int var0, Script var1, boolean var2) {
		Widget var3 = ClientPreferences.widgetDefinition.method7286(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class187.method4098(class255.method5526(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.IF_GETOP) {
			if (var0 == ScriptOpcodes.IF_GETOPBASE) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = var3.dataText;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			--var4;
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
				Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = "";
			}

			return 1;
		}
	}
}
