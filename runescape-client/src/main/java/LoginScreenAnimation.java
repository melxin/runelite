import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("fx")
	static boolean field1314;
	@ObfuscatedName("aq")
	final int[][] field1300;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[Lws;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("am")
	int[] field1307;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 807674463
	)
	int field1301;
	@ObfuscatedName("ap")
	int[] field1302;
	@ObfuscatedName("ax")
	int[] field1303;
	@ObfuscatedName("aw")
	int[] field1304;
	@ObfuscatedName("ar")
	int[] field1305;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1329084447
	)
	int field1306;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1908849587
	)
	int field1294;
	@ObfuscatedName("al")
	int[] field1308;
	@ObfuscatedName("ac")
	int[] field1309;
	@ObfuscatedName("ay")
	int[] field1310;
	@ObfuscatedName("ak")
	int[] field1298;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -2135311543
	)
	int field1299;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1925654084
	)
	int field1312;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -635759221
	)
	int field1311;

	@ObfuscatedSignature(
		descriptor = "([Lws;[[I)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1, int[][] var2) {
		this.field1307 = new int[256];
		this.field1301 = 0;
		this.field1306 = 0;
		this.field1294 = 0;
		this.field1299 = 0;
		this.field1312 = 0;
		this.field1311 = 0;
		this.sprites = var1;
		this.field1300 = var2;
		this.initColors();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1562838581"
	)
	@Export("initColors")
	void initColors() {
		this.field1303 = WidgetDefinition.method6971(this.field1300[0][0], this.field1300[0][1], this.field1300[0][2], this.field1300[0][3], this.field1300[0][4]);
		this.field1304 = WidgetDefinition.method6971(this.field1300[1][0], this.field1300[1][1], this.field1300[1][2], this.field1300[1][3], this.field1300[1][4]);
		this.field1305 = WidgetDefinition.method6971(this.field1300[2][0], this.field1300[2][1], this.field1300[2][2], this.field1300[2][3], this.field1300[2][4]);
		this.field1302 = new int[256];
		this.field1299 = 0;
		this.field1310 = new int[32768];
		this.field1298 = new int[32768];
		this.method2722((IndexedSprite)null);
		this.field1308 = new int[32768];
		this.field1309 = new int[32768];
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-155882614"
	)
	void method2709() {
		this.field1303 = null;
		this.field1304 = null;
		this.field1305 = null;
		this.field1302 = null;
		this.field1310 = null;
		this.field1298 = null;
		this.field1308 = null;
		this.field1309 = null;
		this.field1299 = 0;
		this.field1312 = 0;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1994804712"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1308 == null) {
			this.initColors();
		}

		if (this.field1311 == 0) {
			this.field1311 = var2;
		}

		int var3 = var2 - this.field1311;
		if (var3 >= 256) {
			var3 = 0;
		}

		this.field1311 = var2;
		if (var3 > 0) {
			this.method2711(var3);
		}

		this.method2713(var1);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	final void method2711(int var1) {
		this.field1299 += var1 * 128;
		int var2;
		if (this.field1299 > this.field1310.length) {
			this.field1299 -= this.field1310.length;
			var2 = (int)(Math.random() * 12.0D);
			this.method2722(this.sprites[var2]);
		}

		var2 = 0;
		int var3 = var1 * 128;
		int var4 = (256 - var1) * 128;

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) {
			var6 = this.field1308[var3 + var2] - this.field1310[var2 + this.field1299 & this.field1310.length - 1] * var1 / 6;
			if (var6 < 0) {
				var6 = 0;
			}

			this.field1308[var2++] = var6;
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
					this.field1308[var9 + var8] = 255;
				} else {
					this.field1308[var9 + var8] = 0;
				}
			}
		}

		if (this.field1306 * 16 > 0) {
			this.field1306 = this.field1306 * 16 - var1 * 4;
		}

		if (this.field1294 * 16 > 0) {
			this.field1294 = this.field1294 * 16 - var1 * 4;
		}

		if (this.field1306 * 16 == 0 && this.field1294 * 16 == 0) {
			var7 = (int)(Math.random() * (double)(2000 / var1));
			if (var7 == 0) {
				this.field1306 = 1024;
			}

			if (var7 == 1) {
				this.field1294 = 1024;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) {
			this.field1307[var7] = this.field1307[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) {
			this.field1307[var7] = (int)(Math.sin((double)this.field1301 / 14.0D) * 16.0D + Math.sin((double)this.field1301 / 15.0D) * 14.0D + Math.sin((double)this.field1301 / 16.0D) * 12.0D);
			++this.field1301;
		}

		this.field1312 = this.field1312 * 10000 + var1 * 100;
		var7 = ((Client.cycle & 1) + var1) / 2;
		if (var7 > 0) {
			short var16 = 128;
			byte var17 = 2;
			var10 = 128 - var17 - var17;

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1312 * 10000; ++var11) {
				var12 = (int)(Math.random() * (double)var10) + var17;
				var13 = (int)(Math.random() * (double)var16) + var16;
				this.field1308[var12 + (var13 << 7)] = 192;
			}

			this.field1312 = 0;

			int var14;
			for (var11 = 0; var11 < 256; ++var11) {
				var12 = 0;
				var13 = var11 * 128;

				for (var14 = -var7; var14 < 128; ++var14) {
					if (var7 + var14 < 128) {
						var12 += this.field1308[var7 + var13 + var14];
					}

					if (var14 - (var7 + 1) >= 0) {
						var12 -= this.field1308[var14 + var13 - (var7 + 1)];
					}

					if (var14 >= 0) {
						this.field1309[var14 + var13] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) {
				var12 = 0;

				for (var13 = -var7; var13 < 256; ++var13) {
					var14 = var13 * 128;
					if (var7 + var13 < 256) {
						var12 += this.field1309[var14 + var11 + var7 * 128];
					}

					if (var13 - (var7 + 1) >= 0) {
						var12 -= this.field1309[var11 + var14 - (var7 + 1) * 128];
					}

					if (var13 >= 0) {
						this.field1308[var11 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "6"
	)
	final int method2735(int var1, int var2, int var3) {
		int var4 = 256 - var3;
		return (var4 * (var1 & 16711935) + var3 * (var2 & 16711935) & -16711936) + (var3 * (var2 & 65280) + var4 * (var1 & 65280) & 16711680) >> 8;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2039490630"
	)
	final void method2713(int var1) {
		int var2 = this.field1302.length;
		if (this.field1306 * 16 > 0) {
			this.method2707(this.field1306 * 16, this.field1304);
		} else if (this.field1294 * 16 > 0) {
			this.method2707(this.field1294 * 16, this.field1305);
		} else {
			System.arraycopy(this.field1303, 0, this.field1302, 0, var2);
		}

		this.method2716(var1);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I[II)V",
		garbageValue = "-885746057"
	)
	final void method2707(int var1, int[] var2) {
		int var3 = this.field1302.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			if (var1 > 768) {
				this.field1302[var4] = this.method2735(this.field1303[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1302[var4] = var2[var4];
			} else {
				this.field1302[var4] = this.method2735(var2[var4], this.field1303[var4], 256 - var1);
			}
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2004127903"
	)
	final void method2716(int var1) {
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

			if (var5 + 128 >= GameEngine.rasterProvider.width) {
				var7 = GameEngine.rasterProvider.width - var5;
			}

			int var8 = var5 + (var3 + 8) * GameEngine.rasterProvider.width;
			var2 += var6;

			for (int var9 = var6; var9 < var7; ++var9) {
				int var10 = this.field1308[var2++];
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width;
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) {
					int var12 = var10;
					int var13 = 256 - var10;
					var10 = this.field1302[var10];
					int var14 = GameEngine.rasterProvider.pixels[var8];
					GameEngine.rasterProvider.pixels[var8++] = -16777216 | ((var14 & 16711935) * var13 + (var10 & 16711935) * var12 & -16711936) + (var13 * (var14 & 65280) + var12 * (var10 & 65280) & 16711680) >> 8;
				} else {
					++var8;
				}
			}

			var2 += 128 - var7;
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lws;I)V",
		garbageValue = "2056861388"
	)
	final void method2722(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1310.length; ++var2) {
			this.field1310[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) {
			var3 = (int)(Math.random() * 128.0D * 256.0D);
			this.field1310[var3] = (int)(Math.random() * 256.0D);
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) {
			for (var3 = 1; var3 < 255; ++var3) {
				for (var4 = 1; var4 < 127; ++var4) {
					var5 = var4 + (var3 << 7);
					this.field1298[var5] = (this.field1310[var5 + 1] + this.field1310[var5 + 128] + this.field1310[var5 - 128] + this.field1310[var5 - 1]) / 4;
				}
			}

			int[] var8 = this.field1310;
			this.field1310 = this.field1298;
			this.field1298 = var8;
		}

		if (var1 != null) {
			var2 = 0;

			for (var3 = 0; var3 < var1.subHeight; ++var3) {
				for (var4 = 0; var4 < var1.subWidth; ++var4) {
					if (var1.pixels[var2++] != 0) {
						var5 = var4 + var1.xOffset + 16;
						int var6 = var3 + var1.yOffset + 16;
						int var7 = var5 + (var6 << 7);
						this.field1310[var7] = 0;
					}
				}
			}
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)I",
		garbageValue = "-56"
	)
	@Export("hashString")
	public static int hashString(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			var2 = (var2 << 5) - var2 + ItemContainer.charToByteCp1252(var0.charAt(var3));
		}

		return var2;
	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(Ldj;IIIII)Ldk;",
		garbageValue = "-661758699"
	)
	static final PendingSpawn method2744(WorldView var0, int var1, int var2, int var3, int var4) {
		for (PendingSpawn var5 = (PendingSpawn)var0.pendingSpawns.last(); var5 != null; var5 = (PendingSpawn)var0.pendingSpawns.previous()) {
			if (var5.plane == var1 && var2 == var5.x && var3 == var5.y && var4 == var5.type) {
				return var5;
			}
		}

		return null;
	}
}
