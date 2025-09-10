import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cs")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("pf")
	@ObfuscatedSignature(
		descriptor = "[Lxt;"
	)
	@Export("headIconPrayerSprites")
	static SpritePixels[] headIconPrayerSprites;
	@ObfuscatedName("aq")
	final int[][] field1119;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Lxc;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("as")
	int[] field1122;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1095452139
	)
	int field1123;
	@ObfuscatedName("au")
	int[] field1124;
	@ObfuscatedName("ai")
	int[] field1126;
	@ObfuscatedName("aa")
	int[] field1121;
	@ObfuscatedName("am")
	int[] field1127;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1829810023
	)
	int field1128;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -189292767
	)
	int field1129;
	@ObfuscatedName("ae")
	int[] field1130;
	@ObfuscatedName("ay")
	int[] field1118;
	@ObfuscatedName("ad")
	int[] field1132;
	@ObfuscatedName("ag")
	int[] field1133;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1797413157
	)
	int field1134;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 769631984
	)
	int field1135;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1813528075
	)
	int field1136;

	@ObfuscatedSignature(
		descriptor = "([Lxc;[[I)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1, int[][] var2) {
		this.field1122 = new int[256];
		this.field1123 = 0;
		this.field1128 = 0;
		this.field1129 = 0;
		this.field1134 = 0;
		this.field1135 = 0;
		this.field1136 = 0;
		this.sprites = var1;
		this.field1119 = var2;
		this.initColors();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-96"
	)
	@Export("initColors")
	void initColors() {
		this.field1126 = class70.method2236(this.field1119[0][0], this.field1119[0][1], this.field1119[0][2], this.field1119[0][3], this.field1119[0][4]);
		this.field1121 = class70.method2236(this.field1119[1][0], this.field1119[1][1], this.field1119[1][2], this.field1119[1][3], this.field1119[1][4]);
		this.field1127 = class70.method2236(this.field1119[2][0], this.field1119[2][1], this.field1119[2][2], this.field1119[2][3], this.field1119[2][4]);
		this.field1124 = new int[256];
		this.field1134 = 0;
		this.field1132 = new int[32768];
		this.field1133 = new int[32768];
		this.method2535((IndexedSprite)null);
		this.field1130 = new int[32768];
		this.field1118 = new int[32768];
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "646006279"
	)
	void method2517() {
		this.field1126 = null;
		this.field1121 = null;
		this.field1127 = null;
		this.field1124 = null;
		this.field1132 = null;
		this.field1133 = null;
		this.field1130 = null;
		this.field1118 = null;
		this.field1134 = 0;
		this.field1135 = 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "507026539"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1130 == null) {
			this.initColors();
		}

		if (this.field1136 == 0) {
			this.field1136 = var2;
		}

		int var3 = var2 - this.field1136;
		if (var3 >= 256) {
			var3 = 0;
		}

		this.field1136 = var2;
		if (var3 > 0) {
			this.method2519(var3);
		}

		this.method2515(var1);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "65280"
	)
	final void method2519(int var1) {
		this.field1134 += 128 * var1;
		int var2;
		if (this.field1134 > this.field1132.length) {
			this.field1134 -= this.field1132.length;
			var2 = (int)(Math.random() * 12.0D);
			this.method2535(this.sprites[var2]);
		}

		var2 = 0;
		int var3 = var1 * 128;
		int var4 = (256 - var1) * 128;

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) {
			var6 = this.field1130[var3 + var2] - this.field1132[var2 + this.field1134 & this.field1132.length - 1] * var1 / 6;
			if (var6 < 0) {
				var6 = 0;
			}

			this.field1130[var2++] = var6;
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
					this.field1130[var8 + var9] = 255;
				} else {
					this.field1130[var9 + var8] = 0;
				}
			}
		}

		if (this.field1128 * 16 > 0) {
			this.field1128 = this.field1128 * 16 - var1 * 4;
		}

		if (this.field1129 * 16 > 0) {
			this.field1129 = this.field1129 * 16 - var1 * 4;
		}

		if (this.field1128 * 16 == 0 && this.field1129 * 16 == 0) {
			var7 = (int)(Math.random() * (double)(2000 / var1));
			if (var7 == 0) {
				this.field1128 = 1024;
			}

			if (var7 == 1) {
				this.field1129 = 1024;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) {
			this.field1122[var7] = this.field1122[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) {
			this.field1122[var7] = (int)(Math.sin((double)this.field1123 / 14.0D) * 16.0D + Math.sin((double)this.field1123 / 15.0D) * 14.0D + Math.sin((double)this.field1123 / 16.0D) * 12.0D);
			++this.field1123;
		}

		this.field1135 = this.field1135 * 10000 + 10000 * var1;
		var7 = ((Client.cycle & 1) + var1) / 2;
		if (var7 > 0) {
			short var16 = 128;
			byte var17 = 2;
			var10 = 128 - var17 - var17;

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1135 * 100; ++var11) {
				var12 = (int)(Math.random() * (double)var10) + var17;
				var13 = (int)(Math.random() * (double)var16) + var16;
				this.field1130[var12 + (var13 << 7)] = 192;
			}

			this.field1135 = 0;

			int var14;
			for (var11 = 0; var11 < 256; ++var11) {
				var12 = 0;
				var13 = var11 * 128;

				for (var14 = -var7; var14 < 128; ++var14) {
					if (var14 + var7 < 128) {
						var12 += this.field1130[var7 + var13 + var14];
					}

					if (var14 - (var7 + 1) >= 0) {
						var12 -= this.field1130[var13 + var14 - (var7 + 1)];
					}

					if (var14 >= 0) {
						this.field1118[var13 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) {
				var12 = 0;

				for (var13 = -var7; var13 < 256; ++var13) {
					var14 = var13 * 128;
					if (var7 + var13 < 256) {
						var12 += this.field1118[var11 + var14 + var7 * 128];
					}

					if (var13 - (var7 + 1) >= 0) {
						var12 -= this.field1118[var14 + var11 - (var7 + 1) * 128];
					}

					if (var13 >= 0) {
						this.field1130[var11 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "207190940"
	)
	@Export("blendColors")
	final int blendColors(int var1, int var2, int var3) {
		int var4 = 256 - var3;
		return (var3 * (var2 & 65280) + var4 * (var1 & 65280) & 16711680) + (var4 * (var1 & 16711935) + var3 * (var2 & 16711935) & -16711936) >> 8;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "8"
	)
	final void method2515(int var1) {
		int var2 = this.field1124.length;
		if (this.field1128 * 16 > 0) {
			this.method2522(this.field1128 * 16, this.field1121);
		} else if (this.field1129 * 16 > 0) {
			this.method2522(this.field1129 * 16, this.field1127);
		} else {
			System.arraycopy(this.field1126, 0, this.field1124, 0, var2);
		}

		this.method2523(var1);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I[II)V",
		garbageValue = "-1912829633"
	)
	final void method2522(int var1, int[] var2) {
		int var3 = this.field1124.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			if (var1 > 768) {
				this.field1124[var4] = this.blendColors(this.field1126[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1124[var4] = var2[var4];
			} else {
				this.field1124[var4] = this.blendColors(var2[var4], this.field1126[var4], 256 - var1);
			}
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1315434492"
	)
	final void method2523(int var1) {
		int var2 = 0;

		for (int var3 = 1; var3 < 255; ++var3) {
			int var4 = (256 - var3) * this.field1122[var3] / 256;
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
				int var10 = this.field1130[var2++];
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width;
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) {
					int var12 = var10;
					int var13 = 256 - var10;
					var10 = this.field1124[var10];
					int var14 = GameEngine.rasterProvider.pixels[var8];
					GameEngine.rasterProvider.pixels[var8++] = -16777216 | (var12 * (var10 & 65280) + var13 * (var14 & 65280) & 16711680) + ((var10 & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) >> 8;
				} else {
					++var8;
				}
			}

			var2 += 128 - var7;
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lxc;I)V",
		garbageValue = "1838483014"
	)
	final void method2535(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1132.length; ++var2) {
			this.field1132[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) {
			var3 = (int)(Math.random() * 128.0D * 256.0D);
			this.field1132[var3] = (int)(Math.random() * 256.0D);
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) {
			for (var3 = 1; var3 < 255; ++var3) {
				for (var4 = 1; var4 < 127; ++var4) {
					var5 = var4 + (var3 << 7);
					this.field1133[var5] = (this.field1132[var5 + 1] + this.field1132[var5 - 128] + this.field1132[var5 + 128] + this.field1132[var5 - 1]) / 4;
				}
			}

			int[] var8 = this.field1132;
			this.field1132 = this.field1133;
			this.field1133 = var8;
		}

		if (var1 != null) {
			var2 = 0;

			for (var3 = 0; var3 < var1.subHeight; ++var3) {
				for (var4 = 0; var4 < var1.subWidth; ++var4) {
					if (var1.pixels[var2++] != 0) {
						var5 = var4 + var1.xOffset + 16;
						int var6 = var3 + var1.yOffset + 16;
						int var7 = var5 + (var6 << 7);
						this.field1132[var7] = 0;
					}
				}
			}
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)[Loc;",
		garbageValue = "-20"
	)
	public static class384[] method2550() {
		return new class384[]{class384.USERNAME_PASSWORD, class384.field4402, class384.field4401};
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILcg;ZI)I",
		garbageValue = "229327022"
	)
	static int method2532(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? HttpRequestTask.scriptDotWidget : class141.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = class537.Widget_unpackTargetMask(DirectByteArrayCopier.getWidgetFlags(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.CC_GETOP) {
			if (var0 == ScriptOpcodes.CC_GETOPBASE) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var3.dataText;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
			--var4;
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
				Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = "";
			}

			return 1;
		}
	}
}
