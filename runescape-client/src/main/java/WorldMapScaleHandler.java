import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lv")
@Implements("WorldMapScaleHandler")
public class WorldMapScaleHandler {
	@ObfuscatedName("ao")
	@Export("cacheDir")
	static File cacheDir;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -2026249287
	)
	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("aw")
	@Export("tileTemplates")
	byte[][][] tileTemplates;

	WorldMapScaleHandler(int var1) {
		this.pixelsPerTile = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "-818510354"
	)
	void method6334(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (var7 != 0 && this.pixelsPerTile != 0 && this.tileTemplates != null) {
			var8 = this.method6363(var8, var7);
			var7 = this.method6373(var7);
			Rasterizer2D.Rasterizer2D_drawGradientPixels(var1, var2, var5, var6, var3, var4, this.tileTemplates[var7 - 1][var8], this.pixelsPerTile);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-2102167924"
	)
	int method6363(int var1, int var2) {
		if (var2 == 9) {
			var1 = var1 + 1 & 3;
		}

		if (var2 == 10) {
			var1 = var1 + 3 & 3;
		}

		if (var2 == 11) {
			var1 = var1 + 3 & 3;
		}

		return var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-166851767"
	)
	int method6373(int var1) {
		if (var1 != 9 && var1 != 10) {
			return var1 == 11 ? 8 : var1;
		} else {
			return 1;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1722264854"
	)
	@Export("init")
	void init() {
		if (this.tileTemplates == null) {
			this.tileTemplates = new byte[8][4][];
			this.init0();
			this.init1();
			this.init2();
			this.init3();
			this.init4();
			this.init5();
			this.init6();
			this.init7();
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-142708791"
	)
	@Export("init0")
	void init0() {
		byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		int var2 = 0;

		int var3;
		int var4;
		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) {
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) {
				if (var4 <= var3) {
					var1[var2] = -1;
				}

				++var2;
			}
		}

		this.tileTemplates[0][0] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var2 = 0;

		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) {
				if (var4 <= var3) {
					var1[var2] = -1;
				}

				++var2;
			}
		}

		this.tileTemplates[0][1] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var2 = 0;

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) {
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) {
				if (var4 >= var3) {
					var1[var2] = -1;
				}

				++var2;
			}
		}

		this.tileTemplates[0][2] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var2 = 0;

		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) {
				if (var4 >= var3) {
					var1[var2] = -1;
				}

				++var2;
			}
		}

		this.tileTemplates[0][3] = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	@Export("init1")
	void init1() {
		byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		int var2 = 0;

		int var3;
		int var4;
		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) {
				if (var4 <= var3 >> 1) {
					var1[var2] = -1;
				}

				++var2;
			}
		}

		this.tileTemplates[1][0] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var2 = 0;

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) {
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) {
				if (var2 >= 0 && var2 < var1.length) {
					if (var4 >= var3 << 1) {
						var1[var2] = -1;
					}

					++var2;
				} else {
					++var2;
				}
			}
		}

		this.tileTemplates[1][1] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var2 = 0;

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) {
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
				if (var4 <= var3 >> 1) {
					var1[var2] = -1;
				}

				++var2;
			}
		}

		this.tileTemplates[1][2] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var2 = 0;

		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
				if (var4 >= var3 << 1) {
					var1[var2] = -1;
				}

				++var2;
			}
		}

		this.tileTemplates[1][3] = var1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "30"
	)
	@Export("init2")
	void init2() {
		byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		int var2 = 0;

		int var3;
		int var4;
		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
				if (var4 <= var3 >> 1) {
					var1[var2] = -1;
				}

				++var2;
			}
		}

		this.tileTemplates[2][0] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var2 = 0;

		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) {
				if (var4 >= var3 << 1) {
					var1[var2] = -1;
				}

				++var2;
			}
		}

		this.tileTemplates[2][1] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var2 = 0;

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) {
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) {
				if (var4 <= var3 >> 1) {
					var1[var2] = -1;
				}

				++var2;
			}
		}

		this.tileTemplates[2][2] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var2 = 0;

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) {
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
				if (var4 >= var3 << 1) {
					var1[var2] = -1;
				}

				++var2;
			}
		}

		this.tileTemplates[2][3] = var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2048775005"
	)
	@Export("init3")
	void init3() {
		byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		int var2 = 0;

		int var3;
		int var4;
		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) {
				if (var4 >= var3 >> 1) {
					var1[var2] = -1;
				}

				++var2;
			}
		}

		this.tileTemplates[3][0] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var2 = 0;

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) {
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) {
				if (var4 <= var3 << 1) {
					var1[var2] = -1;
				}

				++var2;
			}
		}

		this.tileTemplates[3][1] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var2 = 0;

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) {
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
				if (var4 >= var3 >> 1) {
					var1[var2] = -1;
				}

				++var2;
			}
		}

		this.tileTemplates[3][2] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var2 = 0;

		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
				if (var4 <= var3 << 1) {
					var1[var2] = -1;
				}

				++var2;
			}
		}

		this.tileTemplates[3][3] = var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "102"
	)
	@Export("init4")
	void init4() {
		byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		int var2 = 0;

		int var3;
		int var4;
		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
				if (var4 >= var3 >> 1) {
					var1[var2] = -1;
				}

				++var2;
			}
		}

		this.tileTemplates[4][0] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var2 = 0;

		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) {
				if (var4 <= var3 << 1) {
					var1[var2] = -1;
				}

				++var2;
			}
		}

		this.tileTemplates[4][1] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var2 = 0;

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) {
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) {
				if (var4 >= var3 >> 1) {
					var1[var2] = -1;
				}

				++var2;
			}
		}

		this.tileTemplates[4][2] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var2 = 0;

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) {
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
				if (var4 <= var3 << 1) {
					var1[var2] = -1;
				}

				++var2;
			}
		}

		this.tileTemplates[4][3] = var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "997022780"
	)
	@Export("init5")
	void init5() {
		byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		boolean var2 = false;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		int var5 = 0;

		int var3;
		int var4;
		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) {
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) {
				if (var4 <= this.pixelsPerTile / 2) {
					var1[var5] = -1;
				}

				++var5;
			}
		}

		this.tileTemplates[5][0] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var5 = 0;

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) {
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) {
				if (var3 <= this.pixelsPerTile / 2) {
					var1[var5] = -1;
				}

				++var5;
			}
		}

		this.tileTemplates[5][1] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var5 = 0;

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) {
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) {
				if (var4 >= this.pixelsPerTile / 2) {
					var1[var5] = -1;
				}

				++var5;
			}
		}

		this.tileTemplates[5][2] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var5 = 0;

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) {
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) {
				if (var3 >= this.pixelsPerTile / 2) {
					var1[var5] = -1;
				}

				++var5;
			}
		}

		this.tileTemplates[5][3] = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "7"
	)
	@Export("init6")
	void init6() {
		byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		boolean var2 = false;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		int var5 = 0;

		int var3;
		int var4;
		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) {
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) {
				if (var4 <= var3 - this.pixelsPerTile / 2) {
					var1[var5] = -1;
				}

				++var5;
			}
		}

		this.tileTemplates[6][0] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var5 = 0;

		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) {
				if (var4 <= var3 - this.pixelsPerTile / 2) {
					var1[var5] = -1;
				}

				++var5;
			}
		}

		this.tileTemplates[6][1] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var5 = 0;

		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
				if (var4 <= var3 - this.pixelsPerTile / 2) {
					var1[var5] = -1;
				}

				++var5;
			}
		}

		this.tileTemplates[6][2] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var5 = 0;

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) {
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
				if (var4 <= var3 - this.pixelsPerTile / 2) {
					var1[var5] = -1;
				}

				++var5;
			}
		}

		this.tileTemplates[6][3] = var1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("init7")
	void init7() {
		byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		boolean var2 = false;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		int var5 = 0;

		int var3;
		int var4;
		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) {
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) {
				if (var4 >= var3 - this.pixelsPerTile / 2) {
					var1[var5] = -1;
				}

				++var5;
			}
		}

		this.tileTemplates[7][0] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var5 = 0;

		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
			for (var4 = 0; var4 < this.pixelsPerTile; ++var4) {
				if (var4 >= var3 - this.pixelsPerTile / 2) {
					var1[var5] = -1;
				}

				++var5;
			}
		}

		this.tileTemplates[7][1] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var5 = 0;

		for (var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
				if (var4 >= var3 - this.pixelsPerTile / 2) {
					var1[var5] = -1;
				}

				++var5;
			}
		}

		this.tileTemplates[7][2] = var1;
		var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
		var5 = 0;

		for (var3 = 0; var3 < this.pixelsPerTile; ++var3) {
			for (var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
				if (var4 >= var3 - this.pixelsPerTile / 2) {
					var1[var5] = -1;
				}

				++var5;
			}
		}

		this.tileTemplates[7][3] = var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIZIII)J",
		garbageValue = "2059848660"
	)
	@Export("calculateTag")
	public static long calculateTag(int var0, int var1, int var2, boolean var3, int var4, int var5) {
		long var6 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17 | ((long)var5 & 2047L) << 49;
		if (var3) {
			var6 |= 65536L;
		}

		return var6;
	}
}
