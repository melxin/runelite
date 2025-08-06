import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("up")
public class class533 {
	@ObfuscatedName("as")
	static int[] field5483;
	@ObfuscatedName("ah")
	public static int[] field5484;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -54022809
	)
	static int field5487;
	@ObfuscatedName("sr")
	@ObfuscatedGetter(
		intValue = 1806265689
	)
	@Export("selectedSpellFlags")
	static int selectedSpellFlags;

	static {
		field5483 = new int[32768];

		for (int var0 = 0; var0 < 32768; ++var0) {
			field5483[var0] = method10571(var0);
		}

		method10572();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-83"
	)
	static final int method10571(int var0) {
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
		double var15 = (var7 + var9) / 2.0D;
		if (var9 != var7) {
			if (var15 < 0.5D) {
				var13 = (var9 - var7) / (var9 + var7);
			}

			if (var15 >= 0.5D) {
				var13 = (var9 - var7) / (2.0D - var9 - var7);
			}

			if (var9 == var1) {
				var11 = (var3 - var5) / (var9 - var7);
			} else if (var3 == var9) {
				var11 = (var5 - var1) / (var9 - var7) + 2.0D;
			} else if (var5 == var9) {
				var11 = 4.0D + (var1 - var3) / (var9 - var7);
			}
		}

		int var17 = (int)(256.0D * var11 / 6.0D);
		var17 &= 255;
		double var18 = 256.0D * var13;
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
		return (var20 << 7) + (int)(var15 * 128.0D);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILwj;I)Lgi;",
		garbageValue = "-1838741497"
	)
	public static PlayerCompositionColorTextureOverride method10581(int var0, Buffer var1) {
		int var2 = var1.readUnsignedByte();
		boolean var3 = (var2 & 1) != 0;
		boolean var4 = (var2 & 2) != 0;
		boolean var5 = (var2 & 4) != 0;
		boolean var6 = (var2 & 8) != 0;
		PlayerCompositionColorTextureOverride var7 = new PlayerCompositionColorTextureOverride(var0);
		int var8;
		int[] var9;
		boolean var10;
		int var11;
		short var12;
		if (var3) {
			var8 = var1.readUnsignedByte();
			var9 = new int[]{var8 & 15, var8 >> 4 & 15};
			var10 = var7.playerCompositionRecolorTo != null && var9.length == var7.playerCompositionRecolorTo.length;

			for (var11 = 0; var11 < 2; ++var11) {
				if (var9[var11] != 15) {
					var12 = (short)var1.readUnsignedShort();
					if (var10) {
						var7.playerCompositionRecolorTo[var9[var11]] = var12;
					}
				}
			}
		}

		if (var4) {
			var8 = var1.readUnsignedByte();
			var9 = new int[]{var8 & 15, var8 >> 4 & 15};
			var10 = var7.playerCompositionRetextureTo != null && var9.length == var7.playerCompositionRetextureTo.length;

			for (var11 = 0; var11 < 2; ++var11) {
				if (var9[var11] != 15) {
					var12 = (short)var1.readUnsignedShort();
					if (var10) {
						var7.playerCompositionRetextureTo[var9[var11]] = var12;
					}
				}
			}
		}

		if (var5) {
			var7.field1922 = var1.readUnsignedShort();
			var7.field1923 = var1.readUnsignedShort();
		}

		if (var6) {
			var7.field1924 = var1.readUnsignedShort();
			var7.field1925 = var1.readUnsignedShort();
		}

		return var7;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "841035570"
	)
	static void method10572() {
		if (field5484 == null) {
			field5484 = new int[65536];
			double var0 = 0.949999988079071D;

			for (int var2 = 0; var2 < 65536; ++var2) {
				double var3 = 0.0078125D + (double)(var2 >> 10 & 63) / 64.0D;
				double var5 = 0.0625D + (double)(var2 >> 7 & 7) / 8.0D;
				double var7 = (double)(var2 & 127) / 128.0D;
				double var9 = var7;
				double var11 = var7;
				double var13 = var7;
				if (0.0D != var5) {
					double var15;
					if (var7 < 0.5D) {
						var15 = var7 * (var5 + 1.0D);
					} else {
						var15 = var5 + var7 - var7 * var5;
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

					if (6.0D * var19 < 1.0D) {
						var9 = (var15 - var17) * 6.0D * var19 + var17;
					} else if (var19 * 2.0D < 1.0D) {
						var9 = var15;
					} else if (3.0D * var19 < 2.0D) {
						var9 = var17 + (var15 - var17) * (0.6666666666666666D - var19) * 6.0D;
					} else {
						var9 = var17;
					}

					if (var3 * 6.0D < 1.0D) {
						var11 = 6.0D * (var15 - var17) * var3 + var17;
					} else if (var3 * 2.0D < 1.0D) {
						var11 = var15;
					} else if (var3 * 3.0D < 2.0D) {
						var11 = var17 + (var15 - var17) * (0.6666666666666666D - var3) * 6.0D;
					} else {
						var11 = var17;
					}

					if (var23 * 6.0D < 1.0D) {
						var13 = 6.0D * (var15 - var17) * var23 + var17;
					} else if (var23 * 2.0D < 1.0D) {
						var13 = var15;
					} else if (var23 * 3.0D < 2.0D) {
						var13 = 6.0D * (0.6666666666666666D - var23) * (var15 - var17) + var17;
					} else {
						var13 = var17;
					}
				}

				var9 = Math.pow(var9, var0);
				var11 = Math.pow(var11, var0);
				var13 = Math.pow(var13, var0);
				int var25 = (int)(256.0D * var9);
				int var16 = (int)(256.0D * var11);
				int var26 = (int)(256.0D * var13);
				int var18 = var26 + (var16 << 8) + (var25 << 16);
				field5484[var2] = var18 & 16777215;
			}

		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2039574943"
	)
	public static int method10570(int var0) {
		return 255 - (var0 & 255);
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/String;B)Ltn;",
		garbageValue = "-70"
	)
	static class515 method10575(Object var0, String var1) {
		if (var0 == null) {
			throw new RuntimeException();
		} else {
			return (class515)var0;
		}
	}
}
