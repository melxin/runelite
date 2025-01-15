import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ky")
public class class273 {
	@ObfuscatedName("ds")
	static boolean field3035;
	@ObfuscatedName("ay")
	final int[][] field3031;
	@ObfuscatedName("ah")
	final int[][] field3028;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1936066213
	)
	int field3025;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -2011681545
	)
	int field3026;
	@ObfuscatedName("ad")
	final int[] field3029;
	@ObfuscatedName("an")
	final int[] field3030;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 298514173
	)
	final int field3027;

	class273(int var1, int var2) {
		this.field3031 = new int[var1][var2];
		this.field3028 = new int[var1][var2];
		int var3 = var2 * var1;
		int var4 = class357.method7049(var3 / 4);
		this.field3029 = new int[var4];
		this.field3030 = new int[var4];
		this.field3027 = var4 - 1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1612101914"
	)
	void method5850() {
		for (int var1 = 0; var1 < this.field3031.length; ++var1) {
			for (int var2 = 0; var2 < this.field3031[var1].length; ++var2) {
				this.field3031[var1][var2] = 0;
				this.field3028[var1][var2] = 99999999;
			}
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-976996248"
	)
	void method5851(int var1, int var2) {
		this.field3025 = var1;
		this.field3026 = var2;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "45"
	)
	int method5852() {
		return this.field3025;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "71"
	)
	int method5863() {
		return this.field3026;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1701907074"
	)
	int method5886() {
		return this.field3031.length;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "1188"
	)
	int method5855() {
		return this.field3031[0].length;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)[[I",
		garbageValue = "-230145331"
	)
	int[][] method5856() {
		return this.field3031;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)[[I",
		garbageValue = "2015726352"
	)
	int[][] method5857() {
		return this.field3028;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "81"
	)
	int[] method5858() {
		return this.field3029;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-2017734139"
	)
	int[] method5877() {
		return this.field3030;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1261980185"
	)
	int method5860() {
		return this.field3027;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZI)I",
		garbageValue = "-1711907147"
	)
	static int method5890(int var0, Script var1, boolean var2) {
		boolean var3 = true;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = ClanChannel.widgetDefinition.method7031(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
			var3 = false;
		} else {
			var4 = var2 ? class134.scriptDotWidget : HttpMethod.scriptActiveWidget;
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) {
			var11 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] - 1;
			if (var11 >= 0 && var11 <= 9) {
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--HealthBarConfig.Interpreter_stringStackSize]);
				return 1;
			} else {
				--HealthBarConfig.Interpreter_stringStackSize;
				return 1;
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) {
				ScriptFrame.Interpreter_intStackSize -= 2;
				var11 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
				var6 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
				var4.parent = ClanChannel.widgetDefinition.getWidgetChild(var11, var6);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) {
				var4.isScrollBar = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) {
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) {
				var4.dragThreshold = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) {
				var4.dataText = Interpreter.Interpreter_stringStack[--HealthBarConfig.Interpreter_stringStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) {
				var4.spellActionName = Interpreter.Interpreter_stringStack[--HealthBarConfig.Interpreter_stringStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) {
				var4.actions = null;
				var4.field3957 = null;
				return 1;
			} else if (var0 == 1308) {
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
				return 1;
			} else if (var0 == 1309) {
				--ScriptFrame.Interpreter_intStackSize;
				return 1;
			} else if (var0 == 1310) {
				var11 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] - 1;
				if (var11 >= 0 && var11 <= 9 && var4.field3957 != null) {
					var4.field3957[var11] = null;
					return 1;
				} else {
					return 1;
				}
			} else if (var0 == 1311) {
				var11 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] - 1;
				var6 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] - 1;
				if (var6 >= 0 && var6 <= 9 && var11 >= 0) {
					var4.method7498(var6, var11, Interpreter.Interpreter_stringStack[--HealthBarConfig.Interpreter_stringStackSize]);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == 1312) {
				var11 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
				if (var11 == -1) {
					var4.field3958 = 319558396;
				} else if (var11 >= 1 && var11 <= 10) {
					var4.field3958 = (var11 - 1) * 79889599;
				}

				return 1;
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) {
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) {
						ScriptFrame.Interpreter_intStackSize -= 2;
						var5 = 10;
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize]};
						byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1]};
						ReflectionCheck.Widget_setKey(var4, var5, var8, var9);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) {
						ScriptFrame.Interpreter_intStackSize -= 3;
						var11 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize] - 1;
						var6 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
						var7 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 2];
						if (var11 >= 0 && var11 <= 9) {
							class397.Widget_setKeyRate(var4, var11, var6, var7);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) {
						var5 = 10;
						var6 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
						var7 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
						class397.Widget_setKeyRate(var4, var5, var6, var7);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) {
						--ScriptFrame.Interpreter_intStackSize;
						var11 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize] - 1;
						if (var11 >= 0 && var11 <= 9) {
							class77.Widget_setKeyIgnoreHeld(var4, var11);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) {
						var5 = 10;
						class77.Widget_setKeyIgnoreHeld(var4, var5);
						return 1;
					} else {
						return 2;
					}
				} else {
					byte[] var10 = null;
					var8 = null;
					if (var3) {
						ScriptFrame.Interpreter_intStackSize -= 10;

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + ScriptFrame.Interpreter_intStackSize] >= 0; var7 += 2) {
						}

						if (var7 > 0) {
							var10 = new byte[var7 / 2];
							var8 = new byte[var7 / 2];

							for (var7 -= 2; var7 >= 0; var7 -= 2) {
								var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + ScriptFrame.Interpreter_intStackSize];
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + ScriptFrame.Interpreter_intStackSize + 1];
							}
						}
					} else {
						ScriptFrame.Interpreter_intStackSize -= 2;
						var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize]};
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1]};
					}

					var7 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] - 1;
					if (var7 >= 0 && var7 <= 9) {
						ReflectionCheck.Widget_setKey(var4, var7, var10, var8);
						return 1;
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
	}
}
