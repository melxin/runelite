import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cb")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("ac")
	final int[][] field1100;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "[Lwy;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("am")
	int[] field1101;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1152502803
	)
	int field1114;
	@ObfuscatedName("ag")
	int[] field1103;
	@ObfuscatedName("au")
	int[] field1104;
	@ObfuscatedName("ar")
	int[] field1094;
	@ObfuscatedName("ad")
	int[] field1105;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 2081377781
	)
	int field1116;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -898660321
	)
	int field1108;
	@ObfuscatedName("az")
	int[] field1109;
	@ObfuscatedName("aw")
	int[] field1110;
	@ObfuscatedName("at")
	int[] field1111;
	@ObfuscatedName("ae")
	int[] field1112;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 578426025
	)
	int field1113;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 881796624
	)
	int field1106;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 783368111
	)
	int field1115;

	@ObfuscatedSignature(
		descriptor = "([Lwy;[[I)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1, int[][] var2) {
		this.field1101 = new int[256];
		this.field1114 = 0;
		this.field1116 = 0;
		this.field1108 = 0;
		this.field1113 = 0;
		this.field1106 = 0;
		this.field1115 = 0;
		this.sprites = var1;
		this.field1100 = var2;
		this.initColors();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2008830665"
	)
	@Export("initColors")
	void initColors() {
		this.field1104 = GameEngine.method558(this.field1100[0][0], this.field1100[0][1], this.field1100[0][2], this.field1100[0][3], this.field1100[0][4]);
		this.field1094 = GameEngine.method558(this.field1100[1][0], this.field1100[1][1], this.field1100[1][2], this.field1100[1][3], this.field1100[1][4]);
		this.field1105 = GameEngine.method558(this.field1100[2][0], this.field1100[2][1], this.field1100[2][2], this.field1100[2][3], this.field1100[2][4]);
		this.field1103 = new int[256];
		this.field1113 = 0;
		this.field1111 = new int[32768];
		this.field1112 = new int[32768];
		this.method2373((IndexedSprite)null);
		this.field1109 = new int[32768];
		this.field1110 = new int[32768];
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "967140418"
	)
	void method2376() {
		this.field1104 = null;
		this.field1094 = null;
		this.field1105 = null;
		this.field1103 = null;
		this.field1111 = null;
		this.field1112 = null;
		this.field1109 = null;
		this.field1110 = null;
		this.field1113 = 0;
		this.field1106 = 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1859968506"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1109 == null) {
			this.initColors();
		}

		if (this.field1115 == 0) {
			this.field1115 = var2;
		}

		int var3 = var2 - this.field1115;
		if (var3 >= 256) {
			var3 = 0;
		}

		this.field1115 = var2;
		if (var3 > 0) {
			this.method2381(var3);
		}

		this.method2370(var1);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1564936823"
	)
	final void method2381(int var1) {
		this.field1113 += var1 * 128;
		int var2;
		if (this.field1113 > this.field1111.length) {
			this.field1113 -= this.field1111.length;
			var2 = (int)(Math.random() * 12.0D);
			this.method2373(this.sprites[var2]);
		}

		var2 = 0;
		int var3 = var1 * 128;
		int var4 = (256 - var1) * 128;

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) {
			var6 = this.field1109[var3 + var2] - this.field1111[var2 + this.field1113 & this.field1111.length - 1] * var1 / 6;
			if (var6 < 0) {
				var6 = 0;
			}

			this.field1109[var2++] = var6;
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
					this.field1109[var9 + var8] = 255;
				} else {
					this.field1109[var9 + var8] = 0;
				}
			}
		}

		if (this.field1116 * 16 > 0) {
			this.field1116 = this.field1116 * 16 - var1 * 4;
		}

		if (this.field1108 * 16 > 0) {
			this.field1108 = this.field1108 * 16 - var1 * 4;
		}

		if (this.field1116 * 16 == 0 && this.field1108 * 16 == 0) {
			var7 = (int)(Math.random() * (double)(2000 / var1));
			if (var7 == 0) {
				this.field1116 = 1024;
			}

			if (var7 == 1) {
				this.field1108 = 1024;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) {
			this.field1101[var7] = this.field1101[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) {
			this.field1101[var7] = (int)(Math.sin((double)this.field1114 / 14.0D) * 16.0D + Math.sin((double)this.field1114 / 15.0D) * 14.0D + Math.sin((double)this.field1114 / 16.0D) * 12.0D);
			++this.field1114;
		}

		this.field1106 = this.field1106 * 10000 + var1 * 10000;
		var7 = ((Client.cycle & 1) + var1) / 2;
		if (var7 > 0) {
			short var16 = 128;
			byte var17 = 2;
			var10 = 128 - var17 - var17;

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1106 * 100; ++var11) {
				var12 = (int)(Math.random() * (double)var10) + var17;
				var13 = (int)(Math.random() * (double)var16) + var16;
				this.field1109[var12 + (var13 << 7)] = 192;
			}

			this.field1106 = 0;

			int var14;
			for (var11 = 0; var11 < 256; ++var11) {
				var12 = 0;
				var13 = var11 * 128;

				for (var14 = -var7; var14 < 128; ++var14) {
					if (var7 + var14 < 128) {
						var12 += this.field1109[var7 + var13 + var14];
					}

					if (var14 - (var7 + 1) >= 0) {
						var12 -= this.field1109[var14 + var13 - (var7 + 1)];
					}

					if (var14 >= 0) {
						this.field1110[var14 + var13] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) {
				var12 = 0;

				for (var13 = -var7; var13 < 256; ++var13) {
					var14 = var13 * 128;
					if (var13 + var7 < 256) {
						var12 += this.field1110[var14 + var11 + var7 * 128];
					}

					if (var13 - (var7 + 1) >= 0) {
						var12 -= this.field1110[var11 + var14 - (var7 + 1) * 128];
					}

					if (var13 >= 0) {
						this.field1109[var11 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "-83"
	)
	final int method2369(int var1, int var2, int var3) {
		int var4 = 256 - var3;
		return (var3 * (var2 & 65280) + var4 * (var1 & 65280) & 16711680) + (var4 * (var1 & 16711935) + var3 * (var2 & 16711935) & -16711936) >> 8;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2077962892"
	)
	final void method2370(int var1) {
		int var2 = this.field1103.length;
		if (this.field1116 * 16 > 0) {
			this.method2371(this.field1116 * 16, this.field1094);
		} else if (this.field1108 * 16 > 0) {
			this.method2371(this.field1108 * 16, this.field1105);
		} else {
			System.arraycopy(this.field1104, 0, this.field1103, 0, var2);
		}

		this.method2372(var1);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I[IB)V",
		garbageValue = "-55"
	)
	final void method2371(int var1, int[] var2) {
		int var3 = this.field1103.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			if (var1 > 768) {
				this.field1103[var4] = this.method2369(this.field1104[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1103[var4] = var2[var4];
			} else {
				this.field1103[var4] = this.method2369(var2[var4], this.field1104[var4], 256 - var1);
			}
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "127"
	)
	final void method2372(int var1) {
		int var2 = 0;

		for (int var3 = 1; var3 < 255; ++var3) {
			int var4 = (256 - var3) * this.field1101[var3] / 256;
			int var5 = var4 + var1;
			int var6 = 0;
			int var7 = 128;
			if (var5 < 0) {
				var6 = -var5;
				var5 = 0;
			}

			if (var5 + 128 >= ArchiveDiskActionHandler.rasterProvider.width) {
				var7 = ArchiveDiskActionHandler.rasterProvider.width - var5;
			}

			int var8 = var5 + (var3 + 8) * ArchiveDiskActionHandler.rasterProvider.width;
			var2 += var6;

			for (int var9 = var6; var9 < var7; ++var9) {
				int var10 = this.field1109[var2++];
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width;
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) {
					int var12 = var10;
					int var13 = 256 - var10;
					var10 = this.field1103[var10];
					int var14 = ArchiveDiskActionHandler.rasterProvider.pixels[var8];
					ArchiveDiskActionHandler.rasterProvider.pixels[var8++] = -16777216 | ((var14 & 16711935) * var13 + (var10 & 16711935) * var12 & -16711936) + (var13 * (var14 & 65280) + var12 * (var10 & 65280) & 16711680) >> 8;
				} else {
					++var8;
				}
			}

			var2 += 128 - var7;
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lwy;S)V",
		garbageValue = "15153"
	)
	final void method2373(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1111.length; ++var2) {
			this.field1111[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) {
			var3 = (int)(Math.random() * 128.0D * 256.0D);
			this.field1111[var3] = (int)(Math.random() * 256.0D);
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) {
			for (var3 = 1; var3 < 255; ++var3) {
				for (var4 = 1; var4 < 127; ++var4) {
					var5 = var4 + (var3 << 7);
					this.field1112[var5] = (this.field1111[var5 + 128] + this.field1111[var5 - 128] + this.field1111[var5 + 1] + this.field1111[var5 - 1]) / 4;
				}
			}

			int[] var8 = this.field1111;
			this.field1111 = this.field1112;
			this.field1112 = var8;
		}

		if (var1 != null) {
			var2 = 0;

			for (var3 = 0; var3 < var1.subHeight; ++var3) {
				for (var4 = 0; var4 < var1.subWidth; ++var4) {
					if (var1.pixels[var2++] != 0) {
						var5 = var4 + var1.xOffset + 16;
						int var6 = var3 + var1.yOffset + 16;
						int var7 = var5 + (var6 << 7);
						this.field1111[var7] = 0;
					}
				}
			}
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "([BZB)Ljava/lang/Object;",
		garbageValue = "-35"
	)
	public static Object method2400(byte[] var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0.length > 136) {
			DirectByteArrayCopier var2 = new DirectByteArrayCopier();
			var2.set(var0);
			return var2;
		} else {
			return var0;
		}
	}
}
