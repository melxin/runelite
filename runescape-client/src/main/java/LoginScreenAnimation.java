import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dv")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lvy;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("aj")
	int[] field1283;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -233273843
	)
	int field1295;
	@ObfuscatedName("au")
	int[] field1285;
	@ObfuscatedName("an")
	int[] field1286;
	@ObfuscatedName("af")
	int[] field1287;
	@ObfuscatedName("ai")
	int[] field1288;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1705508841
	)
	int field1284;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1514486545
	)
	int field1290;
	@ObfuscatedName("as")
	int[] field1291;
	@ObfuscatedName("az")
	int[] field1289;
	@ObfuscatedName("ak")
	int[] field1293;
	@ObfuscatedName("ap")
	int[] field1294;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -2040649619
	)
	int field1298;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1745495644
	)
	int field1296;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 98255923
	)
	int field1297;
	@ObfuscatedName("ax")
	final int[][] field1299;

	@ObfuscatedSignature(
		descriptor = "([Lvy;[[I)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1, int[][] var2) {
		this.field1283 = new int[256];
		this.field1295 = 0;
		this.field1284 = 0;
		this.field1290 = 0;
		this.field1298 = 0;
		this.field1296 = 0;
		this.field1297 = 0;
		this.sprites = var1;
		this.field1299 = var2;
		this.initColors();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1046146402"
	)
	@Export("initColors")
	void initColors() {
		this.field1286 = class227.method4499(this.field1299[0][0], this.field1299[0][1], this.field1299[0][2], this.field1299[0][3], this.field1299[0][4]);
		this.field1287 = class227.method4499(this.field1299[1][0], this.field1299[1][1], this.field1299[1][2], this.field1299[1][3], this.field1299[1][4]);
		this.field1288 = class227.method4499(this.field1299[2][0], this.field1299[2][1], this.field1299[2][2], this.field1299[2][3], this.field1299[2][4]);
		this.field1285 = new int[256];
		this.field1298 = 0;
		this.field1293 = new int[32768];
		this.field1294 = new int[32768];
		this.method2708((IndexedSprite)null);
		this.field1291 = new int[32768];
		this.field1289 = new int[32768];
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-352735822"
	)
	void method2703() {
		this.field1286 = null;
		this.field1287 = null;
		this.field1288 = null;
		this.field1285 = null;
		this.field1293 = null;
		this.field1294 = null;
		this.field1291 = null;
		this.field1289 = null;
		this.field1298 = 0;
		this.field1296 = 0;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2096394042"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1291 == null) {
			this.initColors();
		}

		if (this.field1297 == 0) {
			this.field1297 = var2;
		}

		int var3 = var2 - this.field1297;
		if (var3 >= 256) {
			var3 = 0;
		}

		this.field1297 = var2;
		if (var3 > 0) {
			this.method2710(var3);
		}

		this.method2720(var1);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1060587812"
	)
	final void method2710(int var1) {
		this.field1298 += var1 * 128;
		int var2;
		if (this.field1298 > this.field1293.length) {
			this.field1298 -= this.field1293.length;
			var2 = (int)(Math.random() * 12.0D);
			this.method2708(this.sprites[var2]);
		}

		var2 = 0;
		int var3 = var1 * 128;
		int var4 = (256 - var1) * 128;

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) {
			var6 = this.field1291[var3 + var2] - this.field1293[var2 + this.field1298 & this.field1293.length - 1] * var1 / 6;
			if (var6 < 0) {
				var6 = 0;
			}

			this.field1291[var2++] = var6;
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
					this.field1291[var9 + var8] = 255;
				} else {
					this.field1291[var8 + var9] = 0;
				}
			}
		}

		if (this.field1284 * 16 > 0) {
			this.field1284 = this.field1284 * 16 - var1 * 4;
		}

		if (this.field1290 * 16 > 0) {
			this.field1290 = this.field1290 * 16 - var1 * 4;
		}

		if (this.field1284 * 16 == 0 && this.field1290 * 16 == 0) {
			var7 = (int)(Math.random() * (double)(2000 / var1));
			if (var7 == 0) {
				this.field1284 = 1024;
			}

			if (var7 == 1) {
				this.field1290 = 1024;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) {
			this.field1283[var7] = this.field1283[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) {
			this.field1283[var7] = (int)(Math.sin((double)this.field1295 / 14.0D) * 16.0D + Math.sin((double)this.field1295 / 15.0D) * 14.0D + Math.sin((double)this.field1295 / 16.0D) * 12.0D);
			++this.field1295;
		}

		this.field1296 = this.field1296 * 10000 + 100 * var1;
		var7 = ((Client.cycle & 1) + var1) / 2;
		if (var7 > 0) {
			short var16 = 128;
			byte var17 = 2;
			var10 = 128 - var17 - var17;

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1296 * 10000; ++var11) {
				var12 = (int)(Math.random() * (double)var10) + var17;
				var13 = (int)(Math.random() * (double)var16) + var16;
				this.field1291[var12 + (var13 << 7)] = 192;
			}

			this.field1296 = 0;

			int var14;
			for (var11 = 0; var11 < 256; ++var11) {
				var12 = 0;
				var13 = var11 * 128;

				for (var14 = -var7; var14 < 128; ++var14) {
					if (var7 + var14 < 128) {
						var12 += this.field1291[var7 + var14 + var13];
					}

					if (var14 - (var7 + 1) >= 0) {
						var12 -= this.field1291[var13 + var14 - (var7 + 1)];
					}

					if (var14 >= 0) {
						this.field1289[var14 + var13] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) {
				var12 = 0;

				for (var13 = -var7; var13 < 256; ++var13) {
					var14 = var13 * 128;
					if (var7 + var13 < 256) {
						var12 += this.field1289[var11 + var14 + var7 * 128];
					}

					if (var13 - (var7 + 1) >= 0) {
						var12 -= this.field1289[var11 + var14 - (var7 + 1) * 128];
					}

					if (var13 >= 0) {
						this.field1291[var14 + var11] = var12 / (var7 * 2 + 1);
					}
				}
			}
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1809424198"
	)
	final int method2706(int var1, int var2, int var3) {
		int var4 = 256 - var3;
		return (var3 * (var2 & 65280) + var4 * (var1 & 65280) & 16711680) + (var4 * (var1 & 16711935) + var3 * (var2 & 16711935) & -16711936) >> 8;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-978281205"
	)
	final void method2720(int var1) {
		int var2 = this.field1285.length;
		if (this.field1284 * 16 > 0) {
			this.method2707(this.field1284 * 16, this.field1287);
		} else if (this.field1290 * 16 > 0) {
			this.method2707(this.field1290 * 16, this.field1288);
		} else {
			System.arraycopy(this.field1286, 0, this.field1285, 0, var2);
		}

		this.method2705(var1);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I[IB)V",
		garbageValue = "45"
	)
	final void method2707(int var1, int[] var2) {
		int var3 = this.field1285.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			if (var1 > 768) {
				this.field1285[var4] = this.method2706(this.field1286[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1285[var4] = var2[var4];
			} else {
				this.field1285[var4] = this.method2706(var2[var4], this.field1286[var4], 256 - var1);
			}
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-786635196"
	)
	final void method2705(int var1) {
		int var2 = 0;

		for (int var3 = 1; var3 < 255; ++var3) {
			int var4 = (256 - var3) * this.field1283[var3] / 256;
			int var5 = var4 + var1;
			int var6 = 0;
			int var7 = 128;
			if (var5 < 0) {
				var6 = -var5;
				var5 = 0;
			}

			if (var5 + 128 >= class154.rasterProvider.width) {
				var7 = class154.rasterProvider.width - var5;
			}

			int var8 = var5 + (var3 + 8) * class154.rasterProvider.width;
			var2 += var6;

			for (int var9 = var6; var9 < var7; ++var9) {
				int var10 = this.field1291[var2++];
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width;
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) {
					int var12 = var10;
					int var13 = 256 - var10;
					var10 = this.field1285[var10];
					int var14 = class154.rasterProvider.pixels[var8];
					class154.rasterProvider.pixels[var8++] = -16777216 | ((var14 & 16711935) * var13 + (var10 & 16711935) * var12 & -16711936) + (var12 * (var10 & 65280) + var13 * (var14 & 65280) & 16711680) >> 8;
				} else {
					++var8;
				}
			}

			var2 += 128 - var7;
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "119934800"
	)
	final void method2708(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1293.length; ++var2) {
			this.field1293[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) {
			var3 = (int)(Math.random() * 128.0D * 256.0D);
			this.field1293[var3] = (int)(Math.random() * 256.0D);
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) {
			for (var3 = 1; var3 < 255; ++var3) {
				for (var4 = 1; var4 < 127; ++var4) {
					var5 = var4 + (var3 << 7);
					this.field1294[var5] = (this.field1293[var5 - 128] + this.field1293[var5 + 1] + this.field1293[var5 + 128] + this.field1293[var5 - 1]) / 4;
				}
			}

			int[] var8 = this.field1293;
			this.field1293 = this.field1294;
			this.field1294 = var8;
		}

		if (var1 != null) {
			var2 = 0;

			for (var3 = 0; var3 < var1.subHeight; ++var3) {
				for (var4 = 0; var4 < var1.subWidth; ++var4) {
					if (var1.pixels[var2++] != 0) {
						var5 = var4 + var1.xOffset + 16;
						int var6 = var3 + var1.yOffset + 16;
						int var7 = var5 + (var6 << 7);
						this.field1293[var7] = 0;
					}
				}
			}
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lvj;[IB)[Ljava/lang/Object;",
		garbageValue = "-37"
	)
	static Object[] method2740(Buffer var0, int[] var1) {
		int var2 = var0.readUShortSmart();
		Object[] var3 = new Object[var1.length * var2];

		for (int var4 = 0; var4 < var2; ++var4) {
			for (int var5 = 0; var5 < var1.length; ++var5) {
				int var6 = var1.length * var4 + var5;
				class544 var7 = TextureProvider.method5186(var1[var5]);
				var3[var6] = var7.method9957(var0);
			}
		}

		return var3;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljv;",
		garbageValue = "31"
	)
	@Export("getFrames")
	static Frames getFrames(int var0) {
		Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			AbstractArchive var3 = SequenceDefinition.SequenceDefinition_animationsArchive;
			AbstractArchive var4 = SequenceDefinition.SequenceDefinition_skeletonsArchive;
			boolean var5 = true;
			int[] var6 = var3.getGroupFileIds(var0);

			for (int var7 = 0; var7 < var6.length; ++var7) {
				byte[] var8 = var3.getFile(var0, var6[var7]);
				if (var8 == null) {
					var5 = false;
				} else {
					int var9 = (var8[0] & 255) << 8 | var8[1] & 255;
					byte[] var10 = var4.getFile(var9, 0);
					if (var10 == null) {
						var5 = false;
					}
				}
			}

			Frames var2;
			if (!var5) {
				var2 = null;
			} else {
				try {
					var2 = new Frames(var3, var4, var0, false);
				} catch (Exception var12) {
					var2 = null;
				}
			}

			if (var2 != null) {
				SequenceDefinition.SequenceDefinition_cachedFrames.put(var2, (long)var0);
			}

			return var2;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "1332218875"
	)
	static int method2737(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? RestClientThreadFactory.scriptDotWidget : WorldMapCacheName.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = class202.Widget_unpackTargetMask(Renderable.getWidgetFlags(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.CC_GETOP) {
			if (var0 == ScriptOpcodes.CC_GETOPBASE) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.dataText;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
			--var4;
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
			}

			return 1;
		}
	}

	@ObfuscatedName("mk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZII)I",
		garbageValue = "837728441"
	)
	@Export("insertMenuItem")
	static final int insertMenuItem(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7, int var8) {
		if (Client.isMenuOpen) {
			return -1;
		} else {
			int var11 = var2;
			if (var2 >= 2000) {
				var11 = var2 - 2000;
			}

			boolean var12 = var8 == class31.field153 || var8 == -1 || class357.method6898(var11);
			boolean var13;
			if (!var12) {
				var13 = var11 == 14 || var11 == 15 || var11 >= 44 && var11 <= 51;
				var12 = var13;
			}

			boolean var10 = var12 || class95.method2586(var11);
			boolean var9;
			if (!var10) {
				var9 = false;
			} else {
				var13 = AttackOption.method2989(var2) || WorldMapLabelSize.method5795(var2);
				boolean var14;
				if (!var13) {
					var14 = var2 == 7 || var2 == 8 || var2 >= 9 && var2 <= 13;
					var13 = var14;
				}

				var14 = var13;
				if (!var13) {
					boolean var15 = var2 == 16 || var2 == 17 || var2 >= 18 && var2 <= 22;
					var14 = var15;
				}

				var12 = var14 || class95.method2586(var2);
				if (var12) {
					class491 var16 = Client.worldViewManager.method2599(var8);
					if (var16 == class491.field5083) {
						var9 = false;
						return !var9 ? -1 : Client.menu.insertMenuItem(var0, var1, var2, var3, var4, var5, var6, var7, var8);
					}

					if (var16 == class491.field5085 && !class95.method2586(var2)) {
						var9 = false;
						return !var9 ? -1 : Client.menu.insertMenuItem(var0, var1, var2, var3, var4, var5, var6, var7, var8);
					}
				}

				var9 = true;
			}

			return !var9 ? -1 : Client.menu.insertMenuItem(var0, var1, var2, var3, var4, var5, var6, var7, var8);
		}
	}

	@ObfuscatedName("my")
	@ObfuscatedSignature(
		descriptor = "(Lnp;III)V",
		garbageValue = "1525116140"
	)
	@Export("alignWidgetPosition")
	static void alignWidgetPosition(Widget var0, int var1, int var2) {
		if (var0.xAlignment == 0) {
			var0.x = var0.rawX;
		} else if (var0.xAlignment == 1) {
			var0.x = var0.rawX + (var1 - var0.width) / 2;
		} else if (var0.xAlignment == 2) {
			var0.x = var1 - var0.width - var0.rawX;
		} else if (var0.xAlignment == 3) {
			var0.x = var0.rawX * var1 >> 14;
		} else if (var0.xAlignment == 4) {
			var0.x = (var0.rawX * var1 >> 14) + (var1 - var0.width) / 2;
		} else {
			var0.x = var1 - var0.width - (var0.rawX * var1 >> 14);
		}

		if (var0.yAlignment == 0) {
			var0.y = var0.rawY;
		} else if (var0.yAlignment == 1) {
			var0.y = (var2 - var0.height) / 2 + var0.rawY;
		} else if (var0.yAlignment == 2) {
			var0.y = var2 - var0.height - var0.rawY;
		} else if (var0.yAlignment == 3) {
			var0.y = var2 * var0.rawY >> 14;
		} else if (var0.yAlignment == 4) {
			var0.y = (var2 - var0.height) / 2 + (var2 * var0.rawY >> 14);
		} else {
			var0.y = var2 - var0.height - (var2 * var0.rawY >> 14);
		}

	}
}
