import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ca")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "Lwc;"
	)
	@Export("loginType")
	static LoginType loginType;
	@ObfuscatedName("aj")
	final int[][] field1091;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[Lxm;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("aw")
	int[] field1093;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -2056719215
	)
	int field1108;
	@ObfuscatedName("ay")
	int[] field1095;
	@ObfuscatedName("au")
	int[] field1096;
	@ObfuscatedName("az")
	int[] field1102;
	@ObfuscatedName("ad")
	int[] field1098;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -325214437
	)
	int field1094;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1595519961
	)
	int field1105;
	@ObfuscatedName("ac")
	int[] field1101;
	@ObfuscatedName("ab")
	int[] field1088;
	@ObfuscatedName("ax")
	int[] field1103;
	@ObfuscatedName("ar")
	int[] field1100;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 668823645
	)
	int field1107;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1286264868
	)
	int field1106;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1505812201
	)
	int field1099;

	@ObfuscatedSignature(
		descriptor = "([Lxm;[[I)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1, int[][] var2) {
		this.field1093 = new int[256];
		this.field1108 = 0;
		this.field1094 = 0;
		this.field1105 = 0;
		this.field1107 = 0;
		this.field1106 = 0;
		this.field1099 = 0;
		this.sprites = var1;
		this.field1091 = var2;
		this.initColors();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-70"
	)
	@Export("initColors")
	void initColors() {
		this.field1096 = SoundCache.method3252(this.field1091[0][0], this.field1091[0][1], this.field1091[0][2], this.field1091[0][3], this.field1091[0][4]);
		this.field1102 = SoundCache.method3252(this.field1091[1][0], this.field1091[1][1], this.field1091[1][2], this.field1091[1][3], this.field1091[1][4]);
		this.field1098 = SoundCache.method3252(this.field1091[2][0], this.field1091[2][1], this.field1091[2][2], this.field1091[2][3], this.field1091[2][4]);
		this.field1095 = new int[256];
		this.field1107 = 0;
		this.field1103 = new int[32768];
		this.field1100 = new int[32768];
		this.method2607((IndexedSprite)null);
		this.field1101 = new int[32768];
		this.field1088 = new int[32768];
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-436034096"
	)
	void method2598() {
		this.field1096 = null;
		this.field1102 = null;
		this.field1098 = null;
		this.field1095 = null;
		this.field1103 = null;
		this.field1100 = null;
		this.field1101 = null;
		this.field1088 = null;
		this.field1107 = 0;
		this.field1106 = 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-501971477"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1101 == null) {
			this.initColors();
		}

		if (this.field1099 == 0) {
			this.field1099 = var2;
		}

		int var3 = var2 - this.field1099;
		if (var3 >= 256) {
			var3 = 0;
		}

		this.field1099 = var2;
		if (var3 > 0) {
			this.method2617(var3);
		}

		this.method2602(var1);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "11406795"
	)
	final void method2617(int var1) {
		this.field1107 += var1 * 128;
		int var2;
		if (this.field1107 > this.field1103.length) {
			this.field1107 -= this.field1103.length;
			var2 = (int)(Math.random() * 12.0D);
			this.method2607(this.sprites[var2]);
		}

		var2 = 0;
		int var3 = var1 * 128;
		int var4 = (256 - var1) * 128;

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) {
			var6 = this.field1101[var3 + var2] - this.field1103[var2 + this.field1107 & this.field1103.length - 1] * var1 / 6;
			if (var6 < 0) {
				var6 = 0;
			}

			this.field1101[var2++] = var6;
		}

		byte var15 = 10;
		var6 = 128 - var15;

		int var7;
		int var10;
		for (var7 = 256 - var1; var7 < 256; ++var7) {
			int var8 = var7 * 128;

			for (int var9 = 0; var9 < 128; ++var9) {
				var10 = (int)(Math.random() * 100.0D);
				if (var10 < 50 && var9 > var15 && var9 < var6) {
					this.field1101[var9 + var8] = 255;
				} else {
					this.field1101[var9 + var8] = 0;
				}
			}
		}

		if (this.field1094 * 16 > 0) {
			this.field1094 = this.field1094 * 16 - var1 * 4;
		}

		if (this.field1105 * 16 > 0) {
			this.field1105 = this.field1105 * 16 - var1 * 4;
		}

		if (this.field1094 * 16 == 0 && this.field1105 * 16 == 0) {
			var7 = (int)(Math.random() * (double)(2000 / var1));
			if (var7 == 0) {
				this.field1094 = 1024;
			}

			if (var7 == 1) {
				this.field1105 = 1024;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) {
			this.field1093[var7] = this.field1093[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) {
			this.field1093[var7] = (int)(Math.sin((double)this.field1108 / 14.0D) * 16.0D + Math.sin((double)this.field1108 / 15.0D) * 14.0D + Math.sin((double)this.field1108 / 16.0D) * 12.0D);
			++this.field1108;
		}

		this.field1106 = this.field1106 * 10000 + 100 * var1;
		var7 = ((Client.cycle & 1) + var1) / 2;
		if (var7 > 0) {
			short var16 = 128;
			byte var17 = 2;
			var10 = 128 - var17 - var17;

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1106 * 10000; ++var11) {
				var12 = (int)(Math.random() * (double)var10) + var17;
				var13 = (int)(Math.random() * (double)var16) + var16;
				this.field1101[var12 + (var13 << 7)] = 192;
			}

			this.field1106 = 0;

			int var14;
			for (var11 = 0; var11 < 256; ++var11) {
				var12 = 0;
				var13 = var11 * 128;

				for (var14 = -var7; var14 < 128; ++var14) {
					if (var14 + var7 < 128) {
						var12 += this.field1101[var7 + var13 + var14];
					}

					if (var14 - (var7 + 1) >= 0) {
						var12 -= this.field1101[var14 + var13 - (var7 + 1)];
					}

					if (var14 >= 0) {
						this.field1088[var14 + var13] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) {
				var12 = 0;

				for (var13 = -var7; var13 < 256; ++var13) {
					var14 = var13 * 128;
					if (var13 + var7 < 256) {
						var12 += this.field1088[var11 + var14 + var7 * 128];
					}

					if (var13 - (var7 + 1) >= 0) {
						var12 -= this.field1088[var14 + var11 - (var7 + 1) * 128];
					}

					if (var13 >= 0) {
						this.field1101[var11 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "-122"
	)
	@Export("blendColors")
	final int blendColors(int var1, int var2, int var3) {
		int var4 = 256 - var3;
		return (var3 * (var2 & 65280) + var4 * (var1 & 65280) & 16711680) + (var3 * (var2 & 16711935) + var4 * (var1 & 16711935) & -16711936) >> 8;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1737902105"
	)
	final void method2602(int var1) {
		int var2 = this.field1095.length;
		if (this.field1094 * 16 > 0) {
			this.method2603(this.field1094 * 16, this.field1102);
		} else if (this.field1105 * 16 > 0) {
			this.method2603(this.field1105 * 16, this.field1098);
		} else {
			System.arraycopy(this.field1096, 0, this.field1095, 0, var2);
		}

		this.method2604(var1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I[II)V",
		garbageValue = "-941000434"
	)
	final void method2603(int var1, int[] var2) {
		int var3 = this.field1095.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			if (var1 > 768) {
				this.field1095[var4] = this.blendColors(this.field1096[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1095[var4] = var2[var4];
			} else {
				this.field1095[var4] = this.blendColors(var2[var4], this.field1096[var4], 256 - var1);
			}
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-121"
	)
	final void method2604(int var1) {
		int var2 = 0;

		for (int var3 = 1; var3 < 255; ++var3) {
			int var4 = (256 - var3) * this.field1093[var3] / 256;
			int var5 = var4 + var1;
			int var6 = 0;
			int var7 = 128;
			if (var5 < 0) {
				var6 = -var5;
				var5 = 0;
			}

			if (var5 + 128 >= GameEngine.rasterProvider.width) {
				var7 = GameEngine.rasterProvider.width - var5;
			}

			int var8 = var5 + (var3 + 8) * GameEngine.rasterProvider.width;
			var2 += var6;

			for (int var9 = var6; var9 < var7; ++var9) {
				int var10 = this.field1101[var2++];
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width;
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) {
					int var12 = var10;
					int var13 = 256 - var10;
					var10 = this.field1095[var10];
					int var14 = GameEngine.rasterProvider.pixels[var8];
					GameEngine.rasterProvider.pixels[var8++] = -16777216 | (var13 * (var14 & 65280) + var12 * (var10 & 65280) & 16711680) + ((var14 & 16711935) * var13 + (var10 & 16711935) * var12 & -16711936) >> 8;
				} else {
					++var8;
				}
			}

			var2 += 128 - var7;
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lxm;B)V",
		garbageValue = "1"
	)
	final void method2607(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1103.length; ++var2) {
			this.field1103[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) {
			var3 = (int)(Math.random() * 128.0D * 256.0D);
			this.field1103[var3] = (int)(Math.random() * 256.0D);
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) {
			for (var3 = 1; var3 < 255; ++var3) {
				for (var4 = 1; var4 < 127; ++var4) {
					var5 = var4 + (var3 << 7);
					this.field1100[var5] = (this.field1103[var5 - 128] + this.field1103[var5 + 1] + this.field1103[var5 + 128] + this.field1103[var5 - 1]) / 4;
				}
			}

			int[] var8 = this.field1103;
			this.field1103 = this.field1100;
			this.field1100 = var8;
		}

		if (var1 != null) {
			var2 = 0;

			for (var3 = 0; var3 < var1.subHeight * -183371056; ++var3) {
				for (var4 = 0; var4 < var1.subWidth; ++var4) {
					if (var1.pixels[var2++] != 0) {
						var5 = var4 + var1.xOffset + 16;
						int var6 = var3 + var1.yOffset + 16;
						int var7 = var5 + (var6 << 7);
						this.field1103[var7] = 0;
					}
				}
			}
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(JJLnb;I)D",
		garbageValue = "-893117453"
	)
	public static double method2635(long var0, long var2, class343 var4) {
		double var5 = var2 > 0L ? (double)GameEngine.method701(0.0F, 1.0F, (float)var0 / (float)var2) : 1.0D;
		if (var5 > 0.0D && var5 < 1.0D) {
			double var7;
			double var9;
			switch(var4.field3910) {
			case 0:
			default:
				return var5;
			case 1:
				return 1.0D - Math.cos(var5 * 3.141592653589793D / 2.0D);
			case 2:
				return Math.sin(3.141592653589793D * var5 / 2.0D);
			case 3:
				return -(Math.cos(var5 * 3.141592653589793D) - 1.0D) / 2.0D;
			case 4:
				return var5 * var5;
			case 5:
				return 1.0D - (1.0D - var5) * (1.0D - var5);
			case 6:
				return var5 < 0.5D ? var5 * 2.0D * var5 : 1.0D - Math.pow(var5 * -2.0D + 2.0D, 2.0D) / 2.0D;
			case 7:
				return var5 * var5 * var5;
			case 8:
				return 1.0D - Math.pow(1.0D - var5, 3.0D);
			case 9:
				return var5 < 0.5D ? var5 * 4.0D * var5 * var5 : 1.0D - Math.pow(2.0D + var5 * -2.0D, 3.0D) / 2.0D;
			case 10:
				return var5 * var5 * var5 * var5;
			case 11:
				return 1.0D - Math.pow(1.0D - var5, 4.0D);
			case 12:
				return var5 < 0.5D ? var5 * var5 * 8.0D * var5 * var5 : 1.0D - Math.pow(2.0D + -2.0D * var5, 4.0D) / 2.0D;
			case 13:
				return var5 * var5 * var5 * var5 * var5;
			case 14:
				return 1.0D - Math.pow(1.0D - var5, 5.0D);
			case 15:
				return var5 < 0.5D ? var5 * var5 * 8.0D * var5 * var5 * var5 : 1.0D - Math.pow(2.0D + var5 * -2.0D, 5.0D) / 2.0D;
			case 16:
				return Math.pow(2.0D, 10.0D * var5 - 10.0D);
			case 17:
				return 1.0D - Math.pow(2.0D, var5 * -10.0D);
			case 18:
				return var5 < 0.5D ? Math.pow(2.0D, 20.0D * var5 + 10.0D) / 2.0D : (2.0D - Math.pow(2.0D, 10.0D + -20.0D * var5)) / 2.0D;
			case 19:
				return 1.0D - Math.sqrt(1.0D - Math.pow(var5, 2.0D));
			case 20:
				return Math.sqrt(1.0D - Math.pow(var5 - 1.0D, 2.0D));
			case 21:
				return var5 < 0.5D ? (1.0D - Math.sqrt(1.0D - Math.pow(var5 * 2.0D, 2.0D))) / 2.0D : (Math.sqrt(1.0D - Math.pow(2.0D + -2.0D * var5, 2.0D)) + 1.0D) / 2.0D;
			case 22:
				var7 = 1.70158D;
				var9 = 2.70158D;
				return var5 * var5 * var5 * 2.70158D - var5 * 1.70158D * var5;
			case 23:
				var7 = 1.70158D;
				var9 = 2.70158D;
				return 1.0D + 2.70158D * Math.pow(var5 - 1.0D, 3.0D) + 1.70158D * Math.pow(var5 - 1.0D, 2.0D);
			case 24:
				var7 = 1.70158D;
				var9 = 2.5949095D;
				return var5 < 0.5D ? Math.pow(2.0D * var5, 2.0D) * (7.189819D * var5 - 2.5949095D) / 2.0D : (Math.pow(2.0D * var5 - 2.0D, 2.0D) * (2.5949095D + 3.5949095D * (2.0D * var5 - 2.0D)) + 2.0D) / 2.0D;
			case 25:
				var7 = 2.0943951023931953D;
				return -Math.pow(2.0D, var5 * 10.0D - 10.0D) * Math.sin(2.0943951023931953D * (10.0D * var5 - 10.75D));
			case 26:
				var7 = 2.0943951023931953D;
				return Math.pow(2.0D, -10.0D * var5) * Math.sin((10.0D * var5 - 0.75D) * 2.0943951023931953D) + 1.0D;
			case 27:
				var7 = 1.3962634015954636D;
				var9 = Math.sin(1.3962634015954636D * (var5 * 20.0D - 11.125D));
				return var5 < 0.5D ? -(Math.pow(2.0D, 20.0D * var5 - 10.0D) * var9) / 2.0D : Math.pow(2.0D, var5 * -20.0D + 10.0D) * var9 / 2.0D + 1.0D;
			}
		} else {
			return var5 <= 0.0D ? 0.0D : 1.0D;
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "([IIIB)V",
		garbageValue = "-64"
	)
	static void method2636(int[] var0, int var1, int var2) {
		while (var1 < var2) {
			int var3 = var0[var1];
			var0[var1] = var0[var2];
			var0[var2] = var3;
			++var1;
			--var2;
		}

	}
}
