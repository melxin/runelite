import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("nb")
public enum class343 implements Enum {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	field3891(0, 0),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	field3883(1, 1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	field3884(2, 2),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	field3885(3, 3),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	field3888(4, 4),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	field3887(5, 5),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	field3905(6, 6),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	field3889(7, 7),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	field3890(8, 8),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	field3904(9, 9),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	field3912(10, 10),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	field3893(11, 11),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	field3894(12, 12),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	field3892(13, 13),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	field3899(14, 14),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	field3897(15, 15),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	field3895(16, 16),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	field3886(17, 17),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	field3900(18, 18),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	field3901(19, 19),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	field3902(20, 20),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	field3882(21, 21),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	field3896(22, 22),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	field3903(23, 23),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	field3906(24, 24),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	field3907(25, 25),
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	field3908(26, 26),
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	field3909(27, 27);

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "[Lnb;"
	)
	static final class343[] field3911;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -2082356211
	)
	final int field3910;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 2046502037
	)
	final int field3898;

	static {
		class343[] var0 = class288.method6546();
		field3911 = new class343[var0.length];
		class343[] var1 = var0;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			class343 var3 = var1[var2];
			field3911[var3.field3898] = var3;
		}

	}

	class343(int var3, int var4) {
		this.field3910 = var3;
		this.field3898 = var4;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "20"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3898;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "422795684"
	)
	static final void method7338() {
		SwapSongTask.method9921("Your ignore list is full. Max of 100 for free users, and 400 for members");
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILcu;ZI)I",
		garbageValue = "239604991"
	)
	static int method7339(int var0, Script var1, boolean var2) {
		boolean var3 = true;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = class226.widgetDefinition.method7728(Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize]);
			var3 = false;
		} else {
			var4 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) {
			var11 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] - 1;
			if (var11 >= 0 && var11 < 32) {
				var4.setAction(var11, (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize]);
				return 1;
			} else {
				--SecureRandomFuture.Interpreter_objectStackSize;
				return 1;
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) {
				class408.Interpreter_intStackSize -= 2;
				var11 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
				var6 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
				var4.parent = class226.widgetDefinition.getWidgetChild(var11, var6);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) {
				var4.isScrollBar = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) {
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) {
				var4.dragThreshold = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) {
				var4.dataText = (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) {
				var4.spellActionName = (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) {
				var4.actions = null;
				var4.field4298 = null;
				return 1;
			} else if (var0 == 1308) {
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
				return 1;
			} else if (var0 == 1309) {
				--class408.Interpreter_intStackSize;
				return 1;
			} else if (var0 == 1310) {
				var11 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] - 1;
				if (var11 >= 0 && var11 <= 9 && var4.field4298 != null) {
					var4.field4298[var11] = null;
					return 1;
				} else {
					return 1;
				}
			} else if (var0 == 1311) {
				var11 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] - 1;
				var6 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] - 1;
				if (var6 >= 0 && var6 <= 9 && var11 >= 0) {
					var4.method8170(var6, var11, (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize]);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == 1312) {
				var11 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
				if (var11 == -1) {
					var4.targetPriority = 1300706076;
				} else if (var11 >= 1 && var11 <= 32) {
					var4.targetPriority = (var11 - 1) * 1398918343;
				}

				return 1;
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) {
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) {
						class408.Interpreter_intStackSize -= 2;
						var5 = 10;
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize]};
						byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1]};
						MouseHandler.Widget_setKey(var4, var5, var8, var9);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) {
						class408.Interpreter_intStackSize -= 3;
						var11 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize] - 1;
						var6 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
						var7 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 2];
						if (var11 >= 0 && var11 <= 9) {
							class161.Widget_setKeyRate(var4, var11, var6, var7);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) {
						var5 = 10;
						var6 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
						var7 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
						class161.Widget_setKeyRate(var4, var5, var6, var7);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) {
						--class408.Interpreter_intStackSize;
						var11 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize] - 1;
						if (var11 >= 0 && var11 <= 9) {
							class379.Widget_setKeyIgnoreHeld(var4, var11);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) {
						var5 = 10;
						class379.Widget_setKeyIgnoreHeld(var4, var5);
						return 1;
					} else {
						return 2;
					}
				} else {
					byte[] var10 = null;
					var8 = null;
					if (var3) {
						class408.Interpreter_intStackSize -= 10;

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + class408.Interpreter_intStackSize] >= 0; var7 += 2) {
						}

						if (var7 > 0) {
							var10 = new byte[var7 / 2];
							var8 = new byte[var7 / 2];

							for (var7 -= 2; var7 >= 0; var7 -= 2) {
								var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + class408.Interpreter_intStackSize];
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + class408.Interpreter_intStackSize + 1];
							}
						}
					} else {
						class408.Interpreter_intStackSize -= 2;
						var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize]};
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1]};
					}

					var7 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] - 1;
					if (var7 >= 0 && var7 <= 9) {
						MouseHandler.Widget_setKey(var4, var7, var10, var8);
						return 1;
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
	}
}
