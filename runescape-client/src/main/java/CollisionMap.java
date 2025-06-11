import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kf")
@Implements("CollisionMap")
public class CollisionMap {
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 377417723
	)
	@Export("xInset")
	int xInset;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1259822635
	)
	@Export("yInset")
	int yInset;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 342382951
	)
	@Export("xSize")
	int xSize;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 571563245
	)
	@Export("ySize")
	int ySize;
	@ObfuscatedName("bn")
	final int[][] field3085;

	public CollisionMap(int var1, int var2, boolean var3) {
		if (var3) {
			this.method5926(-1, -1, var1 + 6, var2 + 6);
		} else {
			this.method5926(0, 0, var1, var2);
		}

		this.field3085 = new int[this.xSize][this.ySize];
		this.clear();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-24"
	)
	int method5924() {
		return this.xInset;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2129432311"
	)
	int method5928() {
		return this.yInset;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "3"
	)
	public int method5952() {
		return this.xSize;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1809686635"
	)
	public int method5927() {
		return this.ySize;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "1"
	)
	final void method5926(int var1, int var2, int var3, int var4) {
		this.xInset = var1;
		this.yInset = var2;
		this.xSize = var3;
		this.ySize = var4;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-942351962"
	)
	@Export("clear")
	public void clear() {
		for (int var1 = 0; var1 < this.xSize; ++var1) {
			for (int var2 = 0; var2 < this.ySize; ++var2) {
				if (var1 >= 1 && var2 >= 1 && var1 < this.xSize - 5 && var2 < this.ySize - 5) {
					this.field3085[var1][var2] = 1073741824;
				} else {
					this.field3085[var1][var2] = 16777215;
				}
			}
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIIS)Z",
		garbageValue = "20720"
	)
	boolean method5925(int var1, int var2, int var3) {
		return (this.field3085[var1][var2] & var3) != 0;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1174463420"
	)
	@Export("setFlag")
	void setFlag(int var1, int var2, int var3) {
		int[] var10000 = this.field3085[var1];
		var10000[var2] |= var3;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1727457760"
	)
	@Export("setFlagOff")
	void setFlagOff(int var1, int var2, int var3) {
		int[] var10000 = this.field3085[var1];
		var10000[var2] &= ~var3;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1595343754"
	)
	public void method5933(int var1, int var2, int var3) {
		this.setFlagOff(var1 - this.xInset, var2 - this.yInset, var3);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1845914854"
	)
	public boolean method5960(int var1, int var2) {
		return this.method5963(var1 - this.xInset, var2 - this.yInset);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-184578158"
	)
	boolean method5963(int var1, int var2) {
		return var1 >= 1 && var1 < this.xSize - 5 && var2 >= 1 && var2 < this.ySize - 5;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "538164633"
	)
	public void method5976(int var1, int var2, int var3, int var4, boolean var5) {
		var1 -= this.xInset;
		var2 -= this.yInset;
		if (var3 == 0) {
			if (var4 == 0) {
				this.setFlag(var1, var2, 128);
				this.setFlag(var1 - 1, var2, 8);
			}

			if (var4 == 1) {
				this.setFlag(var1, var2, 2);
				this.setFlag(var1, var2 + 1, 32);
			}

			if (var4 == 2) {
				this.setFlag(var1, var2, 8);
				this.setFlag(var1 + 1, var2, 128);
			}

			if (var4 == 3) {
				this.setFlag(var1, var2, 32);
				this.setFlag(var1, var2 - 1, 2);
			}
		}

		if (var3 == 1 || var3 == 3) {
			if (var4 == 0) {
				this.setFlag(var1, var2, 1);
				this.setFlag(var1 - 1, var2 + 1, 16);
			}

			if (var4 == 1) {
				this.setFlag(var1, var2, 4);
				this.setFlag(var1 + 1, var2 + 1, 64);
			}

			if (var4 == 2) {
				this.setFlag(var1, var2, 16);
				this.setFlag(var1 + 1, var2 - 1, 1);
			}

			if (var4 == 3) {
				this.setFlag(var1, var2, 64);
				this.setFlag(var1 - 1, var2 - 1, 4);
			}
		}

		if (var3 == 2) {
			if (var4 == 0) {
				this.setFlag(var1, var2, 130);
				this.setFlag(var1 - 1, var2, 8);
				this.setFlag(var1, var2 + 1, 32);
			}

			if (var4 == 1) {
				this.setFlag(var1, var2, 10);
				this.setFlag(var1, var2 + 1, 32);
				this.setFlag(var1 + 1, var2, 128);
			}

			if (var4 == 2) {
				this.setFlag(var1, var2, 40);
				this.setFlag(var1 + 1, var2, 128);
				this.setFlag(var1, var2 - 1, 2);
			}

			if (var4 == 3) {
				this.setFlag(var1, var2, 160);
				this.setFlag(var1, var2 - 1, 2);
				this.setFlag(var1 - 1, var2, 8);
			}
		}

		if (var5) {
			if (var3 == 0) {
				if (var4 == 0) {
					this.setFlag(var1, var2, 65536);
					this.setFlag(var1 - 1, var2, 4096);
				}

				if (var4 == 1) {
					this.setFlag(var1, var2, 1024);
					this.setFlag(var1, var2 + 1, 16384);
				}

				if (var4 == 2) {
					this.setFlag(var1, var2, 4096);
					this.setFlag(var1 + 1, var2, 65536);
				}

				if (var4 == 3) {
					this.setFlag(var1, var2, 16384);
					this.setFlag(var1, var2 - 1, 1024);
				}
			}

			if (var3 == 1 || var3 == 3) {
				if (var4 == 0) {
					this.setFlag(var1, var2, 512);
					this.setFlag(var1 - 1, var2 + 1, 8192);
				}

				if (var4 == 1) {
					this.setFlag(var1, var2, 2048);
					this.setFlag(var1 + 1, var2 + 1, 32768);
				}

				if (var4 == 2) {
					this.setFlag(var1, var2, 8192);
					this.setFlag(var1 + 1, var2 - 1, 512);
				}

				if (var4 == 3) {
					this.setFlag(var1, var2, 32768);
					this.setFlag(var1 - 1, var2 - 1, 2048);
				}
			}

			if (var3 == 2) {
				if (var4 == 0) {
					this.setFlag(var1, var2, 66560);
					this.setFlag(var1 - 1, var2, 4096);
					this.setFlag(var1, var2 + 1, 16384);
				}

				if (var4 == 1) {
					this.setFlag(var1, var2, 5120);
					this.setFlag(var1, var2 + 1, 16384);
					this.setFlag(var1 + 1, var2, 65536);
				}

				if (var4 == 2) {
					this.setFlag(var1, var2, 20480);
					this.setFlag(var1 + 1, var2, 65536);
					this.setFlag(var1, var2 - 1, 1024);
				}

				if (var4 == 3) {
					this.setFlag(var1, var2, 81920);
					this.setFlag(var1, var2 - 1, 1024);
					this.setFlag(var1 - 1, var2, 4096);
				}
			}
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZI)V",
		garbageValue = "307041600"
	)
	@Export("setFlagOffNonSquare")
	void setFlagOffNonSquare(int var1, int var2, int var3, int var4, int var5, boolean var6) {
		int var7 = 33554688;
		if (var6) {
			var7 += 131072;
		}

		var1 -= this.xInset;
		var2 -= this.yInset;
		int var8;
		if (var5 == 1 || var5 == 3) {
			var8 = var3;
			var3 = var4;
			var4 = var8;
		}

		for (var8 = var1; var8 < var3 + var1; ++var8) {
			if (var8 >= 0 && var8 < this.xSize) {
				for (int var9 = var2; var9 < var2 + var4; ++var9) {
					if (var9 >= 0 && var9 < this.ySize) {
						this.setFlag(var8, var9, var7);
					}
				}
			}
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "-309174929"
	)
	@Export("addGameObject")
	public void addGameObject(int var1, int var2, int var3, int var4, boolean var5) {
		this.setFlagOffNonSquare(var1, var2, var3, var4, 0, var5);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "69"
	)
	@Export("setBlockedByFloor")
	public void setBlockedByFloor(int var1, int var2) {
		var1 -= this.xInset;
		var2 -= this.yInset;
		int[] var10000 = this.field3085[var1];
		var10000[var2] |= 2097152;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "70"
	)
	@Export("setBlockedByFloorDec")
	public void setBlockedByFloorDec(int var1, int var2) {
		var1 -= this.xInset;
		var2 -= this.yInset;
		int[] var10000 = this.field3085[var1];
		var10000[var2] |= 262144;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "-1357731653"
	)
	public void method5941(int var1, int var2, int var3, int var4, boolean var5) {
		var1 -= this.xInset;
		var2 -= this.yInset;
		if (var3 == 0) {
			if (var4 == 0) {
				this.setFlagOff(var1, var2, 128);
				this.setFlagOff(var1 - 1, var2, 8);
			}

			if (var4 == 1) {
				this.setFlagOff(var1, var2, 2);
				this.setFlagOff(var1, var2 + 1, 32);
			}

			if (var4 == 2) {
				this.setFlagOff(var1, var2, 8);
				this.setFlagOff(var1 + 1, var2, 128);
			}

			if (var4 == 3) {
				this.setFlagOff(var1, var2, 32);
				this.setFlagOff(var1, var2 - 1, 2);
			}
		}

		if (var3 == 1 || var3 == 3) {
			if (var4 == 0) {
				this.setFlagOff(var1, var2, 1);
				this.setFlagOff(var1 - 1, var2 + 1, 16);
			}

			if (var4 == 1) {
				this.setFlagOff(var1, var2, 4);
				this.setFlagOff(var1 + 1, var2 + 1, 64);
			}

			if (var4 == 2) {
				this.setFlagOff(var1, var2, 16);
				this.setFlagOff(var1 + 1, var2 - 1, 1);
			}

			if (var4 == 3) {
				this.setFlagOff(var1, var2, 64);
				this.setFlagOff(var1 - 1, var2 - 1, 4);
			}
		}

		if (var3 == 2) {
			if (var4 == 0) {
				this.setFlagOff(var1, var2, 130);
				this.setFlagOff(var1 - 1, var2, 8);
				this.setFlagOff(var1, var2 + 1, 32);
			}

			if (var4 == 1) {
				this.setFlagOff(var1, var2, 10);
				this.setFlagOff(var1, var2 + 1, 32);
				this.setFlagOff(var1 + 1, var2, 128);
			}

			if (var4 == 2) {
				this.setFlagOff(var1, var2, 40);
				this.setFlagOff(var1 + 1, var2, 128);
				this.setFlagOff(var1, var2 - 1, 2);
			}

			if (var4 == 3) {
				this.setFlagOff(var1, var2, 160);
				this.setFlagOff(var1, var2 - 1, 2);
				this.setFlagOff(var1 - 1, var2, 8);
			}
		}

		if (var5) {
			if (var3 == 0) {
				if (var4 == 0) {
					this.setFlagOff(var1, var2, 65536);
					this.setFlagOff(var1 - 1, var2, 4096);
				}

				if (var4 == 1) {
					this.setFlagOff(var1, var2, 1024);
					this.setFlagOff(var1, var2 + 1, 16384);
				}

				if (var4 == 2) {
					this.setFlagOff(var1, var2, 4096);
					this.setFlagOff(var1 + 1, var2, 65536);
				}

				if (var4 == 3) {
					this.setFlagOff(var1, var2, 16384);
					this.setFlagOff(var1, var2 - 1, 1024);
				}
			}

			if (var3 == 1 || var3 == 3) {
				if (var4 == 0) {
					this.setFlagOff(var1, var2, 512);
					this.setFlagOff(var1 - 1, var2 + 1, 8192);
				}

				if (var4 == 1) {
					this.setFlagOff(var1, var2, 2048);
					this.setFlagOff(var1 + 1, var2 + 1, 32768);
				}

				if (var4 == 2) {
					this.setFlagOff(var1, var2, 8192);
					this.setFlagOff(var1 + 1, var2 - 1, 512);
				}

				if (var4 == 3) {
					this.setFlagOff(var1, var2, 32768);
					this.setFlagOff(var1 - 1, var2 - 1, 2048);
				}
			}

			if (var3 == 2) {
				if (var4 == 0) {
					this.setFlagOff(var1, var2, 66560);
					this.setFlagOff(var1 - 1, var2, 4096);
					this.setFlagOff(var1, var2 + 1, 16384);
				}

				if (var4 == 1) {
					this.setFlagOff(var1, var2, 5120);
					this.setFlagOff(var1, var2 + 1, 16384);
					this.setFlagOff(var1 + 1, var2, 65536);
				}

				if (var4 == 2) {
					this.setFlagOff(var1, var2, 20480);
					this.setFlagOff(var1 + 1, var2, 65536);
					this.setFlagOff(var1, var2 - 1, 1024);
				}

				if (var4 == 3) {
					this.setFlagOff(var1, var2, 81920);
					this.setFlagOff(var1, var2 - 1, 1024);
					this.setFlagOff(var1 - 1, var2, 4096);
				}
			}
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZB)V",
		garbageValue = "40"
	)
	public void method5942(int var1, int var2, int var3, int var4, int var5, boolean var6) {
		int var7 = 33554688;
		if (var6) {
			var7 += 131072;
		}

		var1 -= this.xInset;
		var2 -= this.yInset;
		int var8;
		if (var5 == 1 || var5 == 3) {
			var8 = var3;
			var3 = var4;
			var4 = var8;
		}

		for (var8 = var1; var8 < var3 + var1; ++var8) {
			if (var8 >= 0 && var8 < this.xSize) {
				for (int var9 = var2; var9 < var2 + var4; ++var9) {
					if (var9 >= 0 && var9 < this.ySize) {
						this.setFlagOff(var8, var9, var7);
					}
				}
			}
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "97"
	)
	public void method5943(int var1, int var2) {
		var1 -= this.xInset;
		var2 -= this.yInset;
		int[] var10000 = this.field3085[var1];
		var10000[var2] &= -262145;
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(ILcr;ZB)I",
		garbageValue = "73"
	)
	static int method5951(int var0, Script var1, boolean var2) {
		return 2;
	}
}
