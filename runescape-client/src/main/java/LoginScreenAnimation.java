import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cd")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lri;"
	)
	static Bounds field1100;
	@ObfuscatedName("as")
	final int[][] field1094;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lxa;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("ap")
	int[] field1108;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1873615235
	)
	int field1101;
	@ObfuscatedName("aj")
	int[] field1103;
	@ObfuscatedName("ag")
	int[] field1098;
	@ObfuscatedName("ay")
	int[] field1104;
	@ObfuscatedName("aa")
	int[] field1105;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1045486711
	)
	int field1106;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1155931263
	)
	int field1099;
	@ObfuscatedName("ar")
	int[] field1097;
	@ObfuscatedName("at")
	int[] field1109;
	@ObfuscatedName("ax")
	int[] field1110;
	@ObfuscatedName("aq")
	int[] field1116;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -2003705917
	)
	int field1102;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 900952144
	)
	int field1113;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1345485381
	)
	int field1114;

	@ObfuscatedSignature(
		descriptor = "([Lxa;[[I)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1, int[][] var2) {
		this.field1108 = new int[256];
		this.field1101 = 0;
		this.field1106 = 0;
		this.field1099 = 0;
		this.field1102 = 0;
		this.field1113 = 0;
		this.field1114 = 0;
		this.sprites = var1;
		this.field1094 = var2;
		this.initColors();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1798379868"
	)
	@Export("initColors")
	void initColors() {
		this.field1098 = NPC.method2729(this.field1094[0][0], this.field1094[0][1], this.field1094[0][2], this.field1094[0][3], this.field1094[0][4]);
		this.field1104 = NPC.method2729(this.field1094[1][0], this.field1094[1][1], this.field1094[1][2], this.field1094[1][3], this.field1094[1][4]);
		this.field1105 = NPC.method2729(this.field1094[2][0], this.field1094[2][1], this.field1094[2][2], this.field1094[2][3], this.field1094[2][4]);
		this.field1103 = new int[256];
		this.field1102 = 0;
		this.field1110 = new int[32768];
		this.field1116 = new int[32768];
		this.method2487((IndexedSprite)null);
		this.field1097 = new int[32768];
		this.field1109 = new int[32768];
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-113"
	)
	void method2480() {
		this.field1098 = null;
		this.field1104 = null;
		this.field1105 = null;
		this.field1103 = null;
		this.field1110 = null;
		this.field1116 = null;
		this.field1097 = null;
		this.field1109 = null;
		this.field1102 = 0;
		this.field1113 = 0;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "15451"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1097 == null) {
			this.initColors();
		}

		if (this.field1114 == 0) {
			this.field1114 = var2;
		}

		int var3 = var2 - this.field1114;
		if (var3 >= 256) {
			var3 = 0;
		}

		this.field1114 = var2;
		if (var3 > 0) {
			this.method2482(var3);
		}

		this.method2484(var1);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-88640862"
	)
	final void method2482(int var1) {
		this.field1102 += var1 * 128;
		int var2;
		if (this.field1102 > this.field1110.length) {
			this.field1102 -= this.field1110.length;
			var2 = (int)(Math.random() * 12.0D);
			this.method2487(this.sprites[var2]);
		}

		var2 = 0;
		int var3 = var1 * 128;
		int var4 = (256 - var1) * 128;

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) {
			var6 = this.field1097[var2 + var3] - this.field1110[var2 + this.field1102 & this.field1110.length - 1] * var1 / 6;
			if (var6 < 0) {
				var6 = 0;
			}

			this.field1097[var2++] = var6;
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
					this.field1097[var9 + var8] = 255;
				} else {
					this.field1097[var9 + var8] = 0;
				}
			}
		}

		if (this.field1106 * 16 > 0) {
			this.field1106 = this.field1106 * 16 - var1 * 4;
		}

		if (this.field1099 * 16 > 0) {
			this.field1099 = this.field1099 * 16 - var1 * 4;
		}

		if (this.field1106 * 16 == 0 && this.field1099 * 16 == 0) {
			var7 = (int)(Math.random() * (double)(2000 / var1));
			if (var7 == 0) {
				this.field1106 = 1024;
			}

			if (var7 == 1) {
				this.field1099 = 1024;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) {
			this.field1108[var7] = this.field1108[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) {
			this.field1108[var7] = (int)(Math.sin((double)this.field1101 / 14.0D) * 16.0D + Math.sin((double)this.field1101 / 15.0D) * 14.0D + Math.sin((double)this.field1101 / 16.0D) * 12.0D);
			++this.field1101;
		}

		this.field1113 = this.field1113 * 10000 + 10000 * var1;
		var7 = ((Client.cycle & 1) + var1) / 2;
		if (var7 > 0) {
			short var16 = 128;
			byte var17 = 2;
			var10 = 128 - var17 - var17;

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1113 * 100; ++var11) {
				var12 = (int)(Math.random() * (double)var10) + var17;
				var13 = (int)(Math.random() * (double)var16) + var16;
				this.field1097[var12 + (var13 << 7)] = 192;
			}

			this.field1113 = 0;

			int var14;
			for (var11 = 0; var11 < 256; ++var11) {
				var12 = 0;
				var13 = var11 * 128;

				for (var14 = -var7; var14 < 128; ++var14) {
					if (var14 + var7 < 128) {
						var12 += this.field1097[var13 + var14 + var7];
					}

					if (var14 - (var7 + 1) >= 0) {
						var12 -= this.field1097[var14 + var13 - (var7 + 1)];
					}

					if (var14 >= 0) {
						this.field1109[var13 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) {
				var12 = 0;

				for (var13 = -var7; var13 < 256; ++var13) {
					var14 = var13 * 128;
					if (var7 + var13 < 256) {
						var12 += this.field1109[var7 * 128 + var11 + var14];
					}

					if (var13 - (var7 + 1) >= 0) {
						var12 -= this.field1109[var14 + var11 - (var7 + 1) * 128];
					}

					if (var13 >= 0) {
						this.field1097[var11 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1485168736"
	)
	final int method2483(int var1, int var2, int var3) {
		int var4 = 256 - var3;
		return (var3 * (var2 & 65280) + var4 * (var1 & 65280) & 16711680) + (var3 * (var2 & 16711935) + var4 * (var1 & 16711935) & -16711936) >> 8;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "511940993"
	)
	final void method2484(int var1) {
		int var2 = this.field1103.length;
		if (this.field1106 * 16 > 0) {
			this.method2485(this.field1106 * 16, this.field1104);
		} else if (this.field1099 * 16 > 0) {
			this.method2485(this.field1099 * 16, this.field1105);
		} else {
			System.arraycopy(this.field1098, 0, this.field1103, 0, var2);
		}

		this.method2486(var1);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I[IB)V",
		garbageValue = "1"
	)
	final void method2485(int var1, int[] var2) {
		int var3 = this.field1103.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			if (var1 > 768) {
				this.field1103[var4] = this.method2483(this.field1098[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1103[var4] = var2[var4];
			} else {
				this.field1103[var4] = this.method2483(var2[var4], this.field1098[var4], 256 - var1);
			}
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-1462"
	)
	final void method2486(int var1) {
		int var2 = 0;

		for (int var3 = 1; var3 < 255; ++var3) {
			int var4 = (256 - var3) * this.field1108[var3] / 256;
			int var5 = var4 + var1;
			int var6 = 0;
			int var7 = 128;
			if (var5 < 0) {
				var6 = -var5;
				var5 = 0;
			}

			if (var5 + 128 >= Interpreter.rasterProvider.width) {
				var7 = Interpreter.rasterProvider.width - var5;
			}

			int var8 = var5 + (var3 + 8) * Interpreter.rasterProvider.width;
			var2 += var6;

			for (int var9 = var6; var9 < var7; ++var9) {
				int var10 = this.field1097[var2++];
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width;
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) {
					int var12 = var10;
					int var13 = 256 - var10;
					var10 = this.field1103[var10];
					int var14 = Interpreter.rasterProvider.pixels[var8];
					Interpreter.rasterProvider.pixels[var8++] = -16777216 | ((var14 & 16711935) * var13 + (var10 & 16711935) * var12 & -16711936) + (var12 * (var10 & 65280) + var13 * (var14 & 65280) & 16711680) >> 8;
				} else {
					++var8;
				}
			}

			var2 += 128 - var7;
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lxa;I)V",
		garbageValue = "1578476528"
	)
	final void method2487(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1110.length; ++var2) {
			this.field1110[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) {
			var3 = (int)(Math.random() * 128.0D * 256.0D);
			this.field1110[var3] = (int)(Math.random() * 256.0D);
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) {
			for (var3 = 1; var3 < 255; ++var3) {
				for (var4 = 1; var4 < 127; ++var4) {
					var5 = var4 + (var3 << 7);
					this.field1116[var5] = (this.field1110[var5 + 1] + this.field1110[var5 - 128] + this.field1110[var5 + 128] + this.field1110[var5 - 1]) / 4;
				}
			}

			int[] var8 = this.field1110;
			this.field1110 = this.field1116;
			this.field1116 = var8;
		}

		if (var1 != null) {
			var2 = 0;

			for (var3 = 0; var3 < var1.subHeight; ++var3) {
				for (var4 = 0; var4 < var1.subWidth; ++var4) {
					if (var1.pixels[var2++] != 0) {
						var5 = var4 + var1.xOffset + 16;
						int var6 = var3 + var1.yOffset + 16;
						int var7 = var5 + (var6 << 7);
						this.field1110[var7] = 0;
					}
				}
			}
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-670358129"
	)
	public static boolean method2513(int var0) {
		return var0 == WorldMapDecorationType.field4281.id;
	}
}
