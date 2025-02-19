import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lws;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("ao")
	int[] field1307;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 737869365
	)
	int field1310;
	@ObfuscatedName("aa")
	int[] field1317;
	@ObfuscatedName("as")
	int[] field1309;
	@ObfuscatedName("ae")
	int[] field1311;
	@ObfuscatedName("ax")
	int[] field1303;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -2016087223
	)
	int field1313;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1858400139
	)
	int field1306;
	@ObfuscatedName("aj")
	int[] field1315;
	@ObfuscatedName("av")
	int[] field1316;
	@ObfuscatedName("ar")
	int[] field1314;
	@ObfuscatedName("ag")
	int[] field1318;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1746710855
	)
	int field1319;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1546107856
	)
	int field1320;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -545218449
	)
	int field1321;
	@ObfuscatedName("aw")
	final int[][] field1312;

	@ObfuscatedSignature(
		descriptor = "([Lws;[[I)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1, int[][] var2) {
		this.field1307 = new int[256];
		this.field1310 = 0;
		this.field1313 = 0;
		this.field1306 = 0;
		this.field1319 = 0;
		this.field1320 = 0;
		this.field1321 = 0;
		this.sprites = var1;
		this.field1312 = var2;
		this.initColors();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "14"
	)
	@Export("initColors")
	void initColors() {
		this.field1309 = SecureRandomCallable.method2410(this.field1312[0][0], this.field1312[0][1], this.field1312[0][2], this.field1312[0][3], this.field1312[0][4]);
		this.field1311 = SecureRandomCallable.method2410(this.field1312[1][0], this.field1312[1][1], this.field1312[1][2], this.field1312[1][3], this.field1312[1][4]);
		this.field1303 = SecureRandomCallable.method2410(this.field1312[2][0], this.field1312[2][1], this.field1312[2][2], this.field1312[2][3], this.field1312[2][4]);
		this.field1317 = new int[256];
		this.field1319 = 0;
		this.field1314 = new int[32768];
		this.field1318 = new int[32768];
		this.method2672((IndexedSprite)null);
		this.field1315 = new int[32768];
		this.field1316 = new int[32768];
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1302825901"
	)
	void method2663() {
		this.field1309 = null;
		this.field1311 = null;
		this.field1303 = null;
		this.field1317 = null;
		this.field1314 = null;
		this.field1318 = null;
		this.field1315 = null;
		this.field1316 = null;
		this.field1319 = 0;
		this.field1320 = 0;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1805844632"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1315 == null) {
			this.initColors();
		}

		if (this.field1321 == 0) {
			this.field1321 = var2;
		}

		int var3 = var2 - this.field1321;
		if (var3 >= 256) {
			var3 = 0;
		}

		this.field1321 = var2;
		if (var3 > 0) {
			this.method2667(var3);
		}

		this.method2669(var1);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-901744671"
	)
	final void method2667(int var1) {
		this.field1319 += var1 * 128;
		int var2;
		if (this.field1319 > this.field1314.length) {
			this.field1319 -= this.field1314.length;
			var2 = (int)(Math.random() * 12.0D);
			this.method2672(this.sprites[var2]);
		}

		var2 = 0;
		int var3 = var1 * 128;
		int var4 = (256 - var1) * 128;

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) {
			var6 = this.field1315[var2 + var3] - this.field1314[var2 + this.field1319 & this.field1314.length - 1] * var1 / 6;
			if (var6 < 0) {
				var6 = 0;
			}

			this.field1315[var2++] = var6;
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
					this.field1315[var9 + var8] = 255;
				} else {
					this.field1315[var9 + var8] = 0;
				}
			}
		}

		if (this.field1313 * 16 > 0) {
			this.field1313 = this.field1313 * 16 - var1 * 4;
		}

		if (this.field1306 * 16 > 0) {
			this.field1306 = this.field1306 * 16 - var1 * 4;
		}

		if (this.field1313 * 16 == 0 && this.field1306 * 16 == 0) {
			var7 = (int)(Math.random() * (double)(2000 / var1));
			if (var7 == 0) {
				this.field1313 = 1024;
			}

			if (var7 == 1) {
				this.field1306 = 1024;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) {
			this.field1307[var7] = this.field1307[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) {
			this.field1307[var7] = (int)(Math.sin((double)this.field1310 / 14.0D) * 16.0D + Math.sin((double)this.field1310 / 15.0D) * 14.0D + Math.sin((double)this.field1310 / 16.0D) * 12.0D);
			++this.field1310;
		}

		this.field1320 = this.field1320 * 10000 + var1 * 10000;
		var7 = ((Client.cycle & 1) + var1) / 2;
		if (var7 > 0) {
			short var16 = 128;
			byte var17 = 2;
			var10 = 128 - var17 - var17;

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1320 * 100; ++var11) {
				var12 = (int)(Math.random() * (double)var10) + var17;
				var13 = (int)(Math.random() * (double)var16) + var16;
				this.field1315[var12 + (var13 << 7)] = 192;
			}

			this.field1320 = 0;

			int var14;
			for (var11 = 0; var11 < 256; ++var11) {
				var12 = 0;
				var13 = var11 * 128;

				for (var14 = -var7; var14 < 128; ++var14) {
					if (var7 + var14 < 128) {
						var12 += this.field1315[var7 + var14 + var13];
					}

					if (var14 - (var7 + 1) >= 0) {
						var12 -= this.field1315[var13 + var14 - (var7 + 1)];
					}

					if (var14 >= 0) {
						this.field1316[var13 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) {
				var12 = 0;

				for (var13 = -var7; var13 < 256; ++var13) {
					var14 = var13 * 128;
					if (var13 + var7 < 256) {
						var12 += this.field1316[var7 * 128 + var14 + var11];
					}

					if (var13 - (var7 + 1) >= 0) {
						var12 -= this.field1316[var11 + var14 - (var7 + 1) * 128];
					}

					if (var13 >= 0) {
						this.field1315[var14 + var11] = var12 / (var7 * 2 + 1);
					}
				}
			}
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-668275210"
	)
	final int method2687(int var1, int var2, int var3) {
		int var4 = 256 - var3;
		return (var4 * (var1 & 16711935) + var3 * (var2 & 16711935) & -16711936) + (var3 * (var2 & 65280) + var4 * (var1 & 65280) & 16711680) >> 8;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-50"
	)
	final void method2669(int var1) {
		int var2 = this.field1317.length;
		if (this.field1313 * 16 > 0) {
			this.method2670(this.field1313 * 16, this.field1311);
		} else if (this.field1306 * 16 > 0) {
			this.method2670(this.field1306 * 16, this.field1303);
		} else {
			System.arraycopy(this.field1309, 0, this.field1317, 0, var2);
		}

		this.method2671(var1);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I[IB)V",
		garbageValue = "79"
	)
	final void method2670(int var1, int[] var2) {
		int var3 = this.field1317.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			if (var1 > 768) {
				this.field1317[var4] = this.method2687(this.field1309[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1317[var4] = var2[var4];
			} else {
				this.field1317[var4] = this.method2687(var2[var4], this.field1309[var4], 256 - var1);
			}
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1079065806"
	)
	final void method2671(int var1) {
		int var2 = 0;

		for (int var3 = 1; var3 < 255; ++var3) {
			int var4 = (256 - var3) * this.field1307[var3] / 256;
			int var5 = var4 + var1;
			int var6 = 0;
			int var7 = 128;
			if (var5 < 0) {
				var6 = -var5;
				var5 = 0;
			}

			if (var5 + 128 >= class159.rasterProvider.width) {
				var7 = class159.rasterProvider.width - var5;
			}

			int var8 = var5 + (var3 + 8) * class159.rasterProvider.width;
			var2 += var6;

			for (int var9 = var6; var9 < var7; ++var9) {
				int var10 = this.field1315[var2++];
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width;
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) {
					int var12 = var10;
					int var13 = 256 - var10;
					var10 = this.field1317[var10];
					int var14 = class159.rasterProvider.pixels[var8];
					class159.rasterProvider.pixels[var8++] = -16777216 | (var12 * (var10 & 65280) + var13 * (var14 & 65280) & 16711680) + ((var14 & 16711935) * var13 + (var10 & 16711935) * var12 & -16711936) >> 8;
				} else {
					++var8;
				}
			}

			var2 += 128 - var7;
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lws;B)V",
		garbageValue = "-31"
	)
	final void method2672(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1314.length; ++var2) {
			this.field1314[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) {
			var3 = (int)(Math.random() * 128.0D * 256.0D);
			this.field1314[var3] = (int)(Math.random() * 256.0D);
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) {
			for (var3 = 1; var3 < 255; ++var3) {
				for (var4 = 1; var4 < 127; ++var4) {
					var5 = var4 + (var3 << 7);
					this.field1318[var5] = (this.field1314[var5 + 1] + this.field1314[var5 + 128] + this.field1314[var5 - 128] + this.field1314[var5 - 1]) / 4;
				}
			}

			int[] var8 = this.field1314;
			this.field1314 = this.field1318;
			this.field1318 = var8;
		}

		if (var1 != null) {
			var2 = 0;

			for (var3 = 0; var3 < var1.subHeight; ++var3) {
				for (var4 = 0; var4 < var1.subWidth; ++var4) {
					if (var1.pixels[var2++] != 0) {
						var5 = var4 + var1.xOffset + 16;
						int var6 = var3 + var1.yOffset + 16;
						int var7 = var5 + (var6 << 7);
						this.field1314[var7] = 0;
					}
				}
			}
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(S)[Ldb;",
		garbageValue = "-31883"
	)
	static class92[] method2682() {
		return new class92[]{class92.field1124, class92.field1125, class92.field1126, class92.field1131, class92.field1130, class92.field1127};
	}
}
