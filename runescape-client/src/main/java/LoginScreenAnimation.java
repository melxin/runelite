import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("co")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("ly")
	@ObfuscatedGetter(
		intValue = -1561663163
	)
	static int field1129;
	@ObfuscatedName("af")
	final int[][] field1111;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lxc;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("aq")
	int[] field1113;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 188834283
	)
	int field1114;
	@ObfuscatedName("aa")
	int[] field1116;
	@ObfuscatedName("ap")
	int[] field1115;
	@ObfuscatedName("ad")
	int[] field1117;
	@ObfuscatedName("av")
	int[] field1118;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -91231125
	)
	int field1119;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -329618131
	)
	int field1120;
	@ObfuscatedName("az")
	int[] field1127;
	@ObfuscatedName("au")
	int[] field1122;
	@ObfuscatedName("ak")
	int[] field1123;
	@ObfuscatedName("ao")
	int[] field1126;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -252548217
	)
	int field1125;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 38437680
	)
	int field1109;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 824047197
	)
	int field1108;

	@ObfuscatedSignature(
		descriptor = "([Lxc;[[I)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1, int[][] var2) {
		this.field1113 = new int[256];
		this.field1114 = 0;
		this.field1119 = 0;
		this.field1120 = 0;
		this.field1125 = 0;
		this.field1109 = 0;
		this.field1108 = 0;
		this.sprites = var1;
		this.field1111 = var2;
		this.initColors();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-43740475"
	)
	@Export("initColors")
	void initColors() {
		this.field1115 = World.method1512(this.field1111[0][0], this.field1111[0][1], this.field1111[0][2], this.field1111[0][3], this.field1111[0][4]);
		this.field1117 = World.method1512(this.field1111[1][0], this.field1111[1][1], this.field1111[1][2], this.field1111[1][3], this.field1111[1][4]);
		this.field1118 = World.method1512(this.field1111[2][0], this.field1111[2][1], this.field1111[2][2], this.field1111[2][3], this.field1111[2][4]);
		this.field1116 = new int[256];
		this.field1125 = 0;
		this.field1123 = new int[32768];
		this.field1126 = new int[32768];
		this.method2562((IndexedSprite)null);
		this.field1127 = new int[32768];
		this.field1122 = new int[32768];
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "998820745"
	)
	void method2565() {
		this.field1115 = null;
		this.field1117 = null;
		this.field1118 = null;
		this.field1116 = null;
		this.field1123 = null;
		this.field1126 = null;
		this.field1127 = null;
		this.field1122 = null;
		this.field1125 = 0;
		this.field1109 = 0;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1547939496"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1127 == null) {
			this.initColors();
		}

		if (this.field1108 == 0) {
			this.field1108 = var2;
		}

		int var3 = var2 - this.field1108;
		if (var3 >= 256) {
			var3 = 0;
		}

		this.field1108 = var2;
		if (var3 > 0) {
			this.method2557(var3);
		}

		this.method2559(var1);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "18118"
	)
	final void method2557(int var1) {
		this.field1125 += var1 * 128;
		int var2;
		if (this.field1125 > this.field1123.length) {
			this.field1125 -= this.field1123.length;
			var2 = (int)(Math.random() * 12.0D);
			this.method2562(this.sprites[var2]);
		}

		var2 = 0;
		int var3 = var1 * 128;
		int var4 = (256 - var1) * 128;

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) {
			var6 = this.field1127[var2 + var3] - this.field1123[var2 + this.field1125 & this.field1123.length - 1] * var1 / 6;
			if (var6 < 0) {
				var6 = 0;
			}

			this.field1127[var2++] = var6;
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
					this.field1127[var8 + var9] = 255;
				} else {
					this.field1127[var9 + var8] = 0;
				}
			}
		}

		if (this.field1119 * 16 > 0) {
			this.field1119 = this.field1119 * 16 - var1 * 4;
		}

		if (this.field1120 * 16 > 0) {
			this.field1120 = this.field1120 * 16 - var1 * 4;
		}

		if (this.field1119 * 16 == 0 && this.field1120 * 16 == 0) {
			var7 = (int)(Math.random() * (double)(2000 / var1));
			if (var7 == 0) {
				this.field1119 = 1024;
			}

			if (var7 == 1) {
				this.field1120 = 1024;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) {
			this.field1113[var7] = this.field1113[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) {
			this.field1113[var7] = (int)(Math.sin((double)this.field1114 / 14.0D) * 16.0D + Math.sin((double)this.field1114 / 15.0D) * 14.0D + Math.sin((double)this.field1114 / 16.0D) * 12.0D);
			++this.field1114;
		}

		this.field1109 = this.field1109 * 10000 + var1 * 10000;
		var7 = ((Client.cycle & 1) + var1) / 2;
		if (var7 > 0) {
			short var16 = 128;
			byte var17 = 2;
			var10 = 128 - var17 - var17;

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1109 * 100; ++var11) {
				var12 = (int)(Math.random() * (double)var10) + var17;
				var13 = (int)(Math.random() * (double)var16) + var16;
				this.field1127[var12 + (var13 << 7)] = 192;
			}

			this.field1109 = 0;

			int var14;
			for (var11 = 0; var11 < 256; ++var11) {
				var12 = 0;
				var13 = var11 * 128;

				for (var14 = -var7; var14 < 128; ++var14) {
					if (var14 + var7 < 128) {
						var12 += this.field1127[var7 + var13 + var14];
					}

					if (var14 - (var7 + 1) >= 0) {
						var12 -= this.field1127[var13 + var14 - (var7 + 1)];
					}

					if (var14 >= 0) {
						this.field1122[var13 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) {
				var12 = 0;

				for (var13 = -var7; var13 < 256; ++var13) {
					var14 = var13 * 128;
					if (var7 + var13 < 256) {
						var12 += this.field1122[var7 * 128 + var14 + var11];
					}

					if (var13 - (var7 + 1) >= 0) {
						var12 -= this.field1122[var11 + var14 - (var7 + 1) * 128];
					}

					if (var13 >= 0) {
						this.field1127[var14 + var11] = var12 / (var7 * 2 + 1);
					}
				}
			}
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-909887383"
	)
	@Export("blendColors")
	final int blendColors(int var1, int var2, int var3) {
		int var4 = 256 - var3;
		return (var3 * (var2 & 65280) + var4 * (var1 & 65280) & 16711680) + (var3 * (var2 & 16711935) + var4 * (var1 & 16711935) & -16711936) >> 8;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1769764336"
	)
	final void method2559(int var1) {
		int var2 = this.field1116.length;
		if (this.field1119 * 16 > 0) {
			this.method2560(this.field1119 * 16, this.field1117);
		} else if (this.field1120 * 16 > 0) {
			this.method2560(this.field1120 * 16, this.field1118);
		} else {
			System.arraycopy(this.field1115, 0, this.field1116, 0, var2);
		}

		this.method2561(var1);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I[IB)V",
		garbageValue = "56"
	)
	final void method2560(int var1, int[] var2) {
		int var3 = this.field1116.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			if (var1 > 768) {
				this.field1116[var4] = this.blendColors(this.field1115[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1116[var4] = var2[var4];
			} else {
				this.field1116[var4] = this.blendColors(var2[var4], this.field1115[var4], 256 - var1);
			}
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1691280240"
	)
	final void method2561(int var1) {
		int var2 = 0;

		for (int var3 = 1; var3 < 255; ++var3) {
			int var4 = (256 - var3) * this.field1113[var3] / 256;
			int var5 = var4 + var1;
			int var6 = 0;
			int var7 = 128;
			if (var5 < 0) {
				var6 = -var5;
				var5 = 0;
			}

			if (var5 + 128 >= class409.rasterProvider.width) {
				var7 = class409.rasterProvider.width - var5;
			}

			int var8 = var5 + (var3 + 8) * class409.rasterProvider.width;
			var2 += var6;

			for (int var9 = var6; var9 < var7; ++var9) {
				int var10 = this.field1127[var2++];
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width;
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) {
					int var12 = var10;
					int var13 = 256 - var10;
					var10 = this.field1116[var10];
					int var14 = class409.rasterProvider.pixels[var8];
					class409.rasterProvider.pixels[var8++] = -16777216 | ((var14 & 16711935) * var13 + (var10 & 16711935) * var12 & -16711936) + (var12 * (var10 & 65280) + var13 * (var14 & 65280) & 16711680) >> 8;
				} else {
					++var8;
				}
			}

			var2 += 128 - var7;
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lxc;I)V",
		garbageValue = "24567448"
	)
	final void method2562(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1123.length; ++var2) {
			this.field1123[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) {
			var3 = (int)(Math.random() * 128.0D * 256.0D);
			this.field1123[var3] = (int)(Math.random() * 256.0D);
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) {
			for (var3 = 1; var3 < 255; ++var3) {
				for (var4 = 1; var4 < 127; ++var4) {
					var5 = var4 + (var3 << 7);
					this.field1126[var5] = (this.field1123[var5 - 128] + this.field1123[var5 + 1] + this.field1123[var5 + 128] + this.field1123[var5 - 1]) / 4;
				}
			}

			int[] var8 = this.field1123;
			this.field1123 = this.field1126;
			this.field1126 = var8;
		}

		if (var1 != null) {
			var2 = 0;

			for (var3 = 0; var3 < var1.subHeight; ++var3) {
				for (var4 = 0; var4 < var1.subWidth; ++var4) {
					if (var1.pixels[var2++] != 0) {
						var5 = var4 + var1.xOffset + 16;
						int var6 = var3 + var1.yOffset + 16;
						int var7 = var5 + (var6 << 7);
						this.field1123[var7] = 0;
					}
				}
			}
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/Socket;III)Ltf;",
		garbageValue = "-214932794"
	)
	public static AbstractSocket method2579(Socket var0, int var1, int var2) throws IOException {
		return new BufferedNetSocket(var0, var1, var2);
	}

	@ObfuscatedName("mf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIII)I",
		garbageValue = "-1239170281"
	)
	static final int method2587(String var0, String var1, int var2, int var3, int var4, int var5, int var6) {
		return class162.insertMenuItem(var0, var1, var2, var3, var4, var5, var6, false, -1);
	}
}
