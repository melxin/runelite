import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("tp")
	@ObfuscatedGetter(
		intValue = 143881131
	)
	static int field1293;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[Lvi;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("ae")
	int[] field1298;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -354058959
	)
	int field1283;
	@ObfuscatedName("at")
	int[] field1301;
	@ObfuscatedName("ac")
	int[] field1285;
	@ObfuscatedName("au")
	int[] field1286;
	@ObfuscatedName("as")
	int[] field1287;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1725635467
	)
	int field1290;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -918109945
	)
	int field1289;
	@ObfuscatedName("aa")
	int[] field1297;
	@ObfuscatedName("ak")
	int[] field1291;
	@ObfuscatedName("al")
	int[] field1292;
	@ObfuscatedName("av")
	int[] field1280;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 905273427
	)
	int field1294;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1698540164
	)
	int field1295;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1056539043
	)
	int field1296;
	@ObfuscatedName("ar")
	final int[][] field1300;

	@ObfuscatedSignature(
		descriptor = "([Lvi;[[I)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1, int[][] var2) {
		this.field1298 = new int[256];
		this.field1283 = 0;
		this.field1290 = 0;
		this.field1289 = 0;
		this.field1294 = 0;
		this.field1295 = 0;
		this.field1296 = 0;
		this.sprites = var1;
		this.field1300 = var2;
		this.initColors();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "42"
	)
	@Export("initColors")
	void initColors() {
		this.field1285 = WorldMapID.method6402(this.field1300[0][0], this.field1300[0][1], this.field1300[0][2], this.field1300[0][3], this.field1300[0][4]);
		this.field1286 = WorldMapID.method6402(this.field1300[1][0], this.field1300[1][1], this.field1300[1][2], this.field1300[1][3], this.field1300[1][4]);
		this.field1287 = WorldMapID.method6402(this.field1300[2][0], this.field1300[2][1], this.field1300[2][2], this.field1300[2][3], this.field1300[2][4]);
		this.field1301 = new int[256];
		this.field1294 = 0;
		this.field1292 = new int[32768];
		this.field1280 = new int[32768];
		this.method2844((IndexedSprite)null);
		this.field1297 = new int[32768];
		this.field1291 = new int[32768];
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2095724330"
	)
	void method2852() {
		this.field1285 = null;
		this.field1286 = null;
		this.field1287 = null;
		this.field1301 = null;
		this.field1292 = null;
		this.field1280 = null;
		this.field1297 = null;
		this.field1291 = null;
		this.field1294 = 0;
		this.field1295 = 0;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1398909088"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1297 == null) {
			this.initColors();
		}

		if (this.field1296 == 0) {
			this.field1296 = var2;
		}

		int var3 = var2 - this.field1296;
		if (var3 >= 256) {
			var3 = 0;
		}

		this.field1296 = var2;
		if (var3 > 0) {
			this.method2862(var3);
		}

		this.method2841(var1);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-25"
	)
	final void method2862(int var1) {
		this.field1294 += var1 * 128;
		int var2;
		if (this.field1294 > this.field1292.length) {
			this.field1294 -= this.field1292.length;
			var2 = (int)(Math.random() * 12.0D);
			this.method2844(this.sprites[var2]);
		}

		var2 = 0;
		int var3 = var1 * 128;
		int var4 = (256 - var1) * 128;

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) {
			var6 = this.field1297[var2 + var3] - this.field1292[var2 + this.field1294 & this.field1292.length - 1] * var1 / 6;
			if (var6 < 0) {
				var6 = 0;
			}

			this.field1297[var2++] = var6;
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
					this.field1297[var8 + var9] = 255;
				} else {
					this.field1297[var9 + var8] = 0;
				}
			}
		}

		if (this.field1290 * 16 > 0) {
			this.field1290 = this.field1290 * 16 - var1 * 4;
		}

		if (this.field1289 * 16 > 0) {
			this.field1289 = this.field1289 * 16 - var1 * 4;
		}

		if (this.field1290 * 16 == 0 && this.field1289 * 16 == 0) {
			var7 = (int)(Math.random() * (double)(2000 / var1));
			if (var7 == 0) {
				this.field1290 = 1024;
			}

			if (var7 == 1) {
				this.field1289 = 1024;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) {
			this.field1298[var7] = this.field1298[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) {
			this.field1298[var7] = (int)(Math.sin((double)this.field1283 / 14.0D) * 16.0D + Math.sin((double)this.field1283 / 15.0D) * 14.0D + Math.sin((double)this.field1283 / 16.0D) * 12.0D);
			++this.field1283;
		}

		this.field1295 = this.field1295 * 10000 + 100 * var1;
		var7 = ((Client.cycle & 1) + var1) / 2;
		if (var7 > 0) {
			short var16 = 128;
			byte var17 = 2;
			var10 = 128 - var17 - var17;

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1295 * 10000; ++var11) {
				var12 = (int)(Math.random() * (double)var10) + var17;
				var13 = (int)(Math.random() * (double)var16) + var16;
				this.field1297[var12 + (var13 << 7)] = 192;
			}

			this.field1295 = 0;

			int var14;
			for (var11 = 0; var11 < 256; ++var11) {
				var12 = 0;
				var13 = var11 * 128;

				for (var14 = -var7; var14 < 128; ++var14) {
					if (var7 + var14 < 128) {
						var12 += this.field1297[var7 + var14 + var13];
					}

					if (var14 - (var7 + 1) >= 0) {
						var12 -= this.field1297[var13 + var14 - (var7 + 1)];
					}

					if (var14 >= 0) {
						this.field1291[var13 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) {
				var12 = 0;

				for (var13 = -var7; var13 < 256; ++var13) {
					var14 = var13 * 128;
					if (var7 + var13 < 256) {
						var12 += this.field1291[var11 + var14 + var7 * 128];
					}

					if (var13 - (var7 + 1) >= 0) {
						var12 -= this.field1291[var11 + var14 - (var7 + 1) * 128];
					}

					if (var13 >= 0) {
						this.field1297[var14 + var11] = var12 / (var7 * 2 + 1);
					}
				}
			}
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1054708219"
	)
	final int method2871(int var1, int var2, int var3) {
		int var4 = 256 - var3;
		return (var3 * (var2 & 65280) + var4 * (var1 & 65280) & 16711680) + (var3 * (var2 & 16711935) + var4 * (var1 & 16711935) & -16711936) >> 8;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2134968857"
	)
	final void method2841(int var1) {
		int var2 = this.field1301.length;
		if (this.field1290 * 16 > 0) {
			this.method2842(this.field1290 * 16, this.field1286);
		} else if (this.field1289 * 16 > 0) {
			this.method2842(this.field1289 * 16, this.field1287);
		} else {
			System.arraycopy(this.field1285, 0, this.field1301, 0, var2);
		}

		this.method2843(var1);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I[II)V",
		garbageValue = "-1423102211"
	)
	final void method2842(int var1, int[] var2) {
		int var3 = this.field1301.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			if (var1 > 768) {
				this.field1301[var4] = this.method2871(this.field1285[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1301[var4] = var2[var4];
			} else {
				this.field1301[var4] = this.method2871(var2[var4], this.field1285[var4], 256 - var1);
			}
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "101"
	)
	final void method2843(int var1) {
		int var2 = 0;

		for (int var3 = 1; var3 < 255; ++var3) {
			int var4 = (256 - var3) * this.field1298[var3] / 256;
			int var5 = var4 + var1;
			int var6 = 0;
			int var7 = 128;
			if (var5 < 0) {
				var6 = -var5;
				var5 = 0;
			}

			if (var5 + 128 >= class6.rasterProvider.width) {
				var7 = class6.rasterProvider.width - var5;
			}

			int var8 = var5 + (var3 + 8) * class6.rasterProvider.width;
			var2 += var6;

			for (int var9 = var6; var9 < var7; ++var9) {
				int var10 = this.field1297[var2++];
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width;
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) {
					int var12 = var10;
					int var13 = 256 - var10;
					var10 = this.field1301[var10];
					int var14 = class6.rasterProvider.pixels[var8];
					class6.rasterProvider.pixels[var8++] = -16777216 | (var12 * (var10 & 65280) + var13 * (var14 & 65280) & 16711680) + ((var10 & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) >> 8;
				} else {
					++var8;
				}
			}

			var2 += 128 - var7;
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lvi;I)V",
		garbageValue = "-2132570656"
	)
	final void method2844(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1292.length; ++var2) {
			this.field1292[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) {
			var3 = (int)(Math.random() * 128.0D * 256.0D);
			this.field1292[var3] = (int)(Math.random() * 256.0D);
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) {
			for (var3 = 1; var3 < 255; ++var3) {
				for (var4 = 1; var4 < 127; ++var4) {
					var5 = var4 + (var3 << 7);
					this.field1280[var5] = (this.field1292[var5 + 1] + this.field1292[var5 - 128] + this.field1292[var5 + 128] + this.field1292[var5 - 1]) / 4;
				}
			}

			int[] var8 = this.field1292;
			this.field1292 = this.field1280;
			this.field1280 = var8;
		}

		if (var1 != null) {
			var2 = 0;

			for (var3 = 0; var3 < var1.subHeight; ++var3) {
				for (var4 = 0; var4 < var1.subWidth; ++var4) {
					if (var1.pixels[var2++] != 0) {
						var5 = var4 + var1.xOffset + 16;
						int var6 = var3 + var1.yOffset + 16;
						int var7 = var5 + (var6 << 7);
						this.field1292[var7] = 0;
					}
				}
			}
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1012588797"
	)
	public static void method2877() {
		VarpDefinition.VarpDefinition_cached.clear();
	}

	@ObfuscatedName("ox")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "545969286"
	)
	static boolean method2876() {
		return class544.clientPreferences.getEULA() >= Client.field766;
	}
}
