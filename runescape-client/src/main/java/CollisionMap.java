import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ke")
@Implements("CollisionMap")
public class CollisionMap {
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -855602183
	)
	@Export("xInset")
	int xInset;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 2067336551
	)
	@Export("yInset")
	int yInset;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 987821365
	)
	@Export("xSize")
	int xSize;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -1255104823
	)
	@Export("ySize")
	int ySize;
	@ObfuscatedName("bz")
	@Export("flags")
	final int[][] flags;

	public CollisionMap(int var1, int var2, boolean var3) {
		if (var3) {
			this.method6208(-1, -1, var1 + 6, var2 + 6);
		} else {
			this.method6208(0, 0, var1, var2);
		}

		this.flags = new int[this.xSize][this.ySize];
		this.clear();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-857877385"
	)
	int method6172() {
		return this.xInset;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "2"
	)
	int method6173() {
		return this.yInset;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-319604879"
	)
	public int method6174() {
		return this.xSize;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "495473470"
	)
	public int method6175() {
		return this.ySize;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-122"
	)
	final void method6208(int var1, int var2, int var3, int var4) {
		this.xInset = var1;
		this.yInset = var2;
		this.xSize = var3;
		this.ySize = var4;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1739367362"
	)
	@Export("clear")
	public void clear() {
		for (int var1 = 0; var1 < this.xSize; ++var1) {
			for (int var2 = 0; var2 < this.ySize; ++var2) {
				if (var1 >= 1 && var2 >= 1 && var1 < this.xSize - 5 && var2 < this.ySize - 5) {
					this.flags[var1][var2] = 1073741824;
				} else {
					this.flags[var1][var2] = 16777215;
				}
			}
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-2144547801"
	)
	boolean method6217(int var1, int var2, int var3) {
		return (this.flags[var1][var2] & var3) != 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1886877397"
	)
	@Export("setFlagOff")
	void setFlagOff(int var1, int var2, int var3) {
		int[] var10000 = this.flags[var1];
		var10000[var2] |= var3;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-497471665"
	)
	@Export("setFlag")
	void setFlag(int var1, int var2, int var3) {
		int[] var10000 = this.flags[var1];
		var10000[var2] &= ~var3;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-72"
	)
	public void method6216(int var1, int var2, int var3) {
		this.setFlag(var1 - this.xInset, var2 - this.yInset, var3);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-736623405"
	)
	public boolean method6182(int var1, int var2) {
		return this.method6193(var1 - this.xInset, var2 - this.yInset);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "2139478559"
	)
	boolean method6193(int var1, int var2) {
		return var1 >= 1 && var1 < this.xSize - 5 && var2 >= 1 && var2 < this.ySize - 5;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "-931217384"
	)
	public void method6228(int var1, int var2, int var3, int var4, boolean var5) {
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZI)V",
		garbageValue = "-1511877361"
	)
	void method6197(int var1, int var2, int var3, int var4, int var5, boolean var6) {
		int var7 = 256;
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "1894106380"
	)
	@Export("addGameObject")
	public void addGameObject(int var1, int var2, int var3, int var4, boolean var5) {
		this.method6197(var1, var2, var3, var4, 0, var5);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1694045504"
	)
	@Export("setBlockedByFloor")
	public void setBlockedByFloor(int var1, int var2) {
		var1 -= this.xInset;
		var2 -= this.yInset;
		int[] var10000 = this.flags[var1];
		var10000[var2] |= 2097152;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "69"
	)
	@Export("setBlockedByFloorDec")
	public void setBlockedByFloorDec(int var1, int var2) {
		var1 -= this.xInset;
		var2 -= this.yInset;
		int[] var10000 = this.flags[var1];
		var10000[var2] |= 262144;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIIZB)V",
		garbageValue = "-29"
	)
	public void method6189(int var1, int var2, int var3, int var4, boolean var5) {
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZB)V",
		garbageValue = "25"
	)
	@Export("setFlagOffNonSquare")
	public void setFlagOffNonSquare(int var1, int var2, int var3, int var4, int var5, boolean var6) {
		int var7 = 256;
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-54"
	)
	public void method6190(int var1, int var2) {
		var1 -= this.xInset;
		var2 -= this.yInset;
		int[] var10000 = this.flags[var1];
		var10000[var2] &= -262145;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lrl;ILry;B)I",
		garbageValue = "0"
	)
	public static int method6234(AnimationSequence var0, int var1, class466 var2) {
		int var3 = 0;
		if (!var0.isActive()) {
			var0.method9633(0);
			return var3;
		} else {
			SequenceDefinition var4 = var0.getSequenceDefinition();
			if (var4.frameCount == -1) {
				var3 |= 8;
			}

			if (var4.method4856()) {
				var0.method9633(0);
			} else {
				var0.method9633(var0.method9666() + var1);
			}

			int var7;
			int var8;
			SequenceDefinition var9;
			int var10;
			int var11;
			int var12;
			if (!var4.isCachedModelIdSet()) {
				var7 = var1;
				var8 = 0;
				var9 = var0.getSequenceDefinition();
				if (var9.frameCount > 0 && var9.field2479 > 0) {
					var7 = var1 % var9.field2479;
				}

				var10 = var0.getFrame();
				var11 = var0.getFrameCycle();
				var12 = var0.method9629();
				if (var10 >= var9.frameIds.length) {
					var10 = 0;
					var11 = 0;
				}

				var11 += var7;

				while (true) {
					do {
						if (var11 <= var9.frameLengths[var10]) {
							var0.method9636(var10, var11, var12);
							var3 |= var8;
							return var3;
						}

						var11 -= var9.frameLengths[var10];
						++var10;
						var8 |= 4;
						if ((var8 & 2) == 0 && var2 != null) {
							var2.vmethod11011(var9, var10);
						}
					} while(var10 < var9.frameIds.length);

					++var12;
					var8 |= 1;
					var10 -= var9.frameCount;
					if (var12 >= var9.field2488) {
						var8 |= 2;
					}

					if (var10 < 0 || var10 >= var9.frameIds.length) {
						var8 |= 2;
						var10 = 0;
					}

					if ((var8 & 2) == 0 && var2 != null) {
						var2.vmethod11011(var9, var10);
					}
				}
			} else {
				var7 = var1;
				var8 = 0;
				var9 = var0.getSequenceDefinition();
				if (var9.frameCount > 0 && var1 > 0) {
					var7 = var1 - (var1 - 1) / var9.frameCount * var9.frameCount;
				}

				var10 = var0.getFrame();
				var11 = var0.method9629();

				while (true) {
					do {
						if (var7 <= 0) {
							var0.method9637(var10, var11);
							var3 |= var8;
							return var3;
						}

						--var7;
						++var10;
						var8 |= 4;
						if ((var8 & 2) == 0 && var2 != null) {
							var2.vmethod11011(var9, var10);
						}

						var12 = var9.getMayaAnimFrame();
					} while(var10 < var12);

					++var11;
					var8 |= 1;
					var10 -= var9.frameCount;
					if (var11 >= var9.field2488) {
						var8 |= 2;
					}

					if (var10 < 0 || var10 >= var12) {
						var8 |= 2;
						var10 = 0;
					}

					if ((var8 & 2) == 0 && var2 != null) {
						var2.vmethod11011(var9, var10);
					}
				}
			}
		}
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(Ldm;B)V",
		garbageValue = "-34"
	)
	static final void method6235(WorldView var0) {
		for (GraphicsObject var1 = (GraphicsObject)var0.graphicsObjects.last(); var1 != null; var1 = (GraphicsObject)var0.graphicsObjects.previous()) {
			if (var0.plane == var1.plane && !var1.method1896()) {
				if (Client.cycle >= var1.cycleStart) {
					var1.advance(Client.graphicsCycle);
					if (var1.method1896()) {
						var1.remove();
					} else {
						var0.scene.drawEntity(var1.plane, var1.x, var1.y, var1.z, 60, var1, 0, -1L, false);
					}
				}
			} else {
				var1.remove();
			}
		}

	}
}
