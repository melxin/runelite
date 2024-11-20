import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cn")
@Implements("Decimator")
public class Decimator {
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 2059786205
	)
	@Export("inputRate")
	int inputRate;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 172062829
	)
	@Export("outputRate")
	int outputRate;
	@ObfuscatedName("ac")
	@Export("table")
	int[][] table;

	public Decimator(int var1, int var2) {
		if (var2 != var1) {
			int var3 = CollisionMap.method5626(var1, var2);
			var1 /= var3;
			var2 /= var3;
			this.inputRate = var1;
			this.outputRate = var2;
			this.table = new int[var1][14];

			for (int var4 = 0; var4 < var1; ++var4) {
				int[] var5 = this.table[var4];
				double var6 = 6.0D + (double)var4 / (double)var1;
				int var8 = (int)Math.floor(1.0D + (var6 - 7.0D));
				if (var8 < 0) {
					var8 = 0;
				}

				int var9 = (int)Math.ceil(7.0D + var6);
				if (var9 > 14) {
					var9 = 14;
				}

				for (double var10 = (double)var2 / (double)var1; var8 < var9; ++var8) {
					double var12 = 3.141592653589793D * ((double)var8 - var6);
					double var14 = var10;
					if (var12 < -1.0E-4D || var12 > 1.0E-4D) {
						var14 = var10 * (Math.sin(var12) / var12);
					}

					var14 *= 0.54D + 0.46D * Math.cos(((double)var8 - var6) * 0.2243994752564138D);
					var5[var8] = (int)Math.floor(0.5D + 65536.0D * var14);
				}
			}

		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([BB)[B",
		garbageValue = "-69"
	)
	@Export("resample")
	byte[] resample(byte[] var1) {
		if (this.table != null) {
			int var2 = (int)((long)var1.length * (long)this.outputRate / (long)this.inputRate) + 14;
			int[] var3 = new int[var2];
			int var4 = 0;
			int var5 = 0;

			int var6;
			for (var6 = 0; var6 < var1.length; ++var6) {
				byte var7 = var1[var6];
				int[] var8 = this.table[var5];

				int var9;
				for (var9 = 0; var9 < 14; ++var9) {
					var3[var4 + var9] += var8[var9] * var7;
				}

				var5 += this.outputRate;
				var9 = var5 / this.inputRate;
				var4 += var9;
				var5 -= var9 * this.inputRate;
			}

			var1 = new byte[var2];

			for (var6 = 0; var6 < var2; ++var6) {
				int var10 = var3[var6] + 32768 >> 16;
				if (var10 < -128) {
					var1[var6] = -128;
				} else if (var10 > 127) {
					var1[var6] = 127;
				} else {
					var1[var6] = (byte)var10;
				}
			}
		}

		return var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "27"
	)
	@Export("scaleRate")
	int scaleRate(int var1) {
		if (this.table != null) {
			var1 = (int)((long)this.outputRate * (long)var1 / (long)this.inputRate);
		}

		return var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "68"
	)
	@Export("scalePosition")
	int scalePosition(int var1) {
		if (this.table != null) {
			var1 = (int)((long)this.outputRate * (long)var1 / (long)this.inputRate) + 6;
		}

		return var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1553529900"
	)
	public static void method1118() {
		WorldMapRegion.WorldMapRegion_cachedSprites.demote(5);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "-1177806224"
	)
	static final float method1117(int var0) {
		float var1 = 10075.0F - (float)var0;
		return (1.0075567F * var1 - 75.56675F) / var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "1710326822"
	)
	static int method1116(int var0, Script var1, boolean var2) {
		boolean var3 = true;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = class379.widgetDefinition.method6875(Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize]);
			var3 = false;
		} else {
			var4 = var2 ? RestClientThreadFactory.scriptDotWidget : WorldMapCacheName.scriptActiveWidget;
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) {
			var11 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] - 1;
			if (var11 >= 0 && var11 <= 9) {
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]);
				return 1;
			} else {
				--Interpreter.Interpreter_stringStackSize;
				return 1;
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) {
				PrivateChatMode.Interpreter_intStackSize -= 2;
				var11 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
				var6 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
				var4.parent = class379.widgetDefinition.getWidgetChild(var11, var6);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) {
				var4.isScrollBar = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) {
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) {
				var4.dragThreshold = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) {
				var4.dataText = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) {
				var4.spellActionName = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) {
				var4.actions = null;
				var4.field3948 = null;
				return 1;
			} else if (var0 == 1308) {
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
				return 1;
			} else if (var0 == 1309) {
				--PrivateChatMode.Interpreter_intStackSize;
				return 1;
			} else if (var0 == 1310) {
				var11 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] - 1;
				if (var11 >= 0 && var11 <= 9 && var4.field3948 != null) {
					var4.field3948[var11] = null;
					return 1;
				} else {
					return 1;
				}
			} else if (var0 == 1311) {
				var11 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] - 1;
				var6 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] - 1;
				if (var6 >= 0 && var6 <= 9 && var11 >= 0) {
					var4.method7258(var6, var11, Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == 1312) {
				var11 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
				if (var11 == -1) {
					var4.field3949 = -128772476;
				} else if (var11 >= 1 && var11 <= 10) {
					var4.field3949 = (var11 - 1) * 1041548705;
				}

				return 1;
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) {
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) {
						PrivateChatMode.Interpreter_intStackSize -= 2;
						var5 = 10;
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize]};
						byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1]};
						VerticalAlignment.Widget_setKey(var4, var5, var8, var9);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) {
						PrivateChatMode.Interpreter_intStackSize -= 3;
						var11 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize] - 1;
						var6 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
						var7 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 2];
						if (var11 >= 0 && var11 <= 9) {
							ItemComposition.Widget_setKeyRate(var4, var11, var6, var7);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) {
						var5 = 10;
						var6 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
						var7 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
						ItemComposition.Widget_setKeyRate(var4, var5, var6, var7);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) {
						--PrivateChatMode.Interpreter_intStackSize;
						var11 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize] - 1;
						if (var11 >= 0 && var11 <= 9) {
							UserComparator5.Widget_setKeyIgnoreHeld(var4, var11);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) {
						var5 = 10;
						UserComparator5.Widget_setKeyIgnoreHeld(var4, var5);
						return 1;
					} else {
						return 2;
					}
				} else {
					byte[] var10 = null;
					var8 = null;
					if (var3) {
						PrivateChatMode.Interpreter_intStackSize -= 10;

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + PrivateChatMode.Interpreter_intStackSize] >= 0; var7 += 2) {
						}

						if (var7 > 0) {
							var10 = new byte[var7 / 2];
							var8 = new byte[var7 / 2];

							for (var7 -= 2; var7 >= 0; var7 -= 2) {
								var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + PrivateChatMode.Interpreter_intStackSize];
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + PrivateChatMode.Interpreter_intStackSize + 1];
							}
						}
					} else {
						PrivateChatMode.Interpreter_intStackSize -= 2;
						var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize]};
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1]};
					}

					var7 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] - 1;
					if (var7 >= 0 && var7 <= 9) {
						VerticalAlignment.Widget_setKey(var4, var7, var10, var8);
						return 1;
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-38"
	)
	static final int method1119(int var0, int var1) {
		if (var0 == -1) {
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIIIILdy;I)V",
		garbageValue = "344509088"
	)
	static void method1108(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, Player var13) {
		ObjectComposition var14 = HttpMethod.getObjectDefinition(var6);
		int var15;
		int var16;
		if (var4 != 1 && var4 != 3) {
			var15 = var14.sizeX;
			var16 = var14.sizeY;
		} else {
			var15 = var14.sizeY;
			var16 = var14.sizeX;
		}

		int var17 = (var15 >> 1) + var1;
		int var18 = (var15 + 1 >> 1) + var1;
		int var19 = (var16 >> 1) + var2;
		int var20 = var2 + (var16 + 1 >> 1);
		int[][] var21 = Projection.worldView.tileHeights[var0];
		int var22 = var21[var18][var19] + var21[var17][var19] + var21[var17][var20] + var21[var18][var20] >> 2;
		int var23 = (var1 << 7) + (var15 << 6);
		int var24 = (var2 << 7) + (var16 << 6);
		Model var25 = var14.getModel(var3, var4, var21, var23, var22, var24);
		if (var25 != null) {
			class180.method3754(Projection.worldView, var0, var1, var2, var5, -1, 0, 0, 31, var7 + 1, var8 + 1);
			var13.animationCycleStart = var7 + Client.cycle;
			var13.animationCycleEnd = var8 + Client.cycle;
			var13.model0 = var25;
			var13.field1147 = var15 * 64 + var1 * 128;
			var13.field1143 = var16 * 64 + var2 * 128;
			var13.tileHeight2 = var22;
			int var26;
			if (var9 > var11) {
				var26 = var9;
				var9 = var11;
				var11 = var26;
			}

			if (var10 > var12) {
				var26 = var10;
				var10 = var12;
				var12 = var26;
			}

			var13.minX = var9 + var1;
			var13.maxX = var11 + var1;
			var13.minY = var10 + var2;
			var13.maxY = var2 + var12;
		}

	}
}
