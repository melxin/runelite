import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("po")
public class class413 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILcu;ZI)I",
		garbageValue = "1833713655"
	)
	static int method8517(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) {
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) {
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else {
			class378 var7;
			if (var0 == ScriptOpcodes.CC_GETTEXT) {
				if (var3.type == 12) {
					var7 = var3.method8194();
					if (var7 != null) {
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var7.method7885().method9578();
						return 1;
					}
				}

				Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var3.text;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) {
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3.scrollWidth;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) {
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3.scrollHeight;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) {
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3.modelZoom;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) {
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3.modelAngleX;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) {
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3.modelAngleZ;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) {
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3.modelAngleY;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETTRANS) {
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3.transparencyTop;
				return 1;
			} else if (var0 == 1610) {
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3.transparencyBot;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) {
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3.color;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) {
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3.color2;
				return 1;
			} else if (var0 == 1613) {
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) {
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
				return 1;
			} else {
				class372 var4;
				if (var0 == 1617) {
					var4 = var3.method8195();
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var4 != null ? var4.field4127 : 0;
				}

				if (var0 == 1618) {
					var4 = var3.method8195();
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var4 != null ? var4.field4126 : 0;
					return 1;
				} else if (var0 == 1619) {
					var7 = var3.method8194();
					Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var7 != null ? var7.method7886().method9578() : "";
					return 1;
				} else if (var0 == 1620) {
					var4 = var3.method8195();
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var4 != null ? var4.field4122 : 0;
					return 1;
				} else if (var0 == 1621) {
					var7 = var3.method8194();
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var7 != null ? var7.method7919() : 0;
					return 1;
				} else if (var0 == 1622) {
					var7 = var3.method8194();
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var7 != null ? var7.method7852() : 0;
					return 1;
				} else if (var0 == 1623) {
					var7 = var3.method8194();
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var7 != null ? var7.method7845() : 0;
					return 1;
				} else if (var0 == 1624) {
					var7 = var3.method8194();
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var7 != null && var7.method7888() ? 1 : 0;
					return 1;
				} else if (var0 != 1625) {
					if (var0 == 1626) {
						var7 = var3.method8194();
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var7 != null ? var7.method8023().method9830() : "";
						return 1;
					} else if (var0 == 1627) {
						var7 = var3.method8194();
						int var5 = var7 != null ? var7.method7848() : 0;
						int var6 = var7 != null ? var7.method8082() : 0;
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Math.min(var5, var6);
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Math.max(var5, var6);
						return 1;
					} else if (var0 == 1628) {
						var7 = var3.method8194();
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var7 != null ? var7.method8082() : 0;
						return 1;
					} else if (var0 == 1629) {
						var7 = var3.method8194();
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var7 != null ? var7.method7901() : 0;
						return 1;
					} else if (var0 == 1630) {
						var7 = var3.method8194();
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var7 != null ? var7.method8012() : 0;
						return 1;
					} else if (var0 == 1631) {
						var7 = var3.method8194();
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var7 != null ? var7.method8051() : 0;
						return 1;
					} else if (var0 == 1632) {
						var7 = var3.method8194();
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var7 != null ? var7.method7904() : 0;
						return 1;
					} else {
						class28 var8;
						if (var0 == 1633) {
							var8 = var3.method8280();
							Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize - 1] = var8 != null ? var8.method452(Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else if (var0 == 1634) {
							var8 = var3.method8280();
							Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize - 1] = var8 != null ? var8.method427((char)Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var7 = var3.method8194();
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var7 != null && var7.method7889() ? 1 : 0;
					return 1;
				}
			}
		}
	}
}
