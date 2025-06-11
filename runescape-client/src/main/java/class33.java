import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("be")
public class class33 {
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 252360605
	)
	int field168;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 326721991
	)
	int field162;

	class33(int var1, int var2) {
		this.field168 = var1;
		this.field162 = var2;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lbi;B)Z",
		garbageValue = "-80"
	)
	boolean method480(class29 var1) {
		if (var1 == null) {
			return false;
		} else {
			switch(this.field168) {
			case 1:
				return var1.vmethod5884(this.field162);
			case 2:
				return var1.vmethod5912(this.field162);
			case 3:
				return var1.vmethod5908((char)this.field162);
			case 4:
				return var1.vmethod5888(this.field162 == 1);
			default:
				return false;
			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;IIB)Ljava/lang/String;",
		garbageValue = "62"
	)
	public static String method487(Object[] var0, int var1, int var2) {
		if (var2 == 0) {
			return "";
		} else if (var2 == 1) {
			CharSequence var10 = (CharSequence)var0[var1];
			return var10 == null ? "null" : var10.toString();
		} else {
			int var3 = var2 + var1;
			int var4 = 0;

			for (int var5 = var1; var5 < var3; ++var5) {
				CharSequence var9 = (CharSequence)var0[var5];
				if (var9 == null) {
					var4 += 4;
				} else {
					var4 += var9.length();
				}
			}

			StringBuilder var8 = new StringBuilder(var4);

			for (int var6 = var1; var6 < var3; ++var6) {
				CharSequence var7 = (CharSequence)var0[var6];
				if (var7 == null) {
					var8.append("null");
				} else {
					var8.append(var7);
				}
			}

			return var8.toString();
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lov;ZI)V",
		garbageValue = "1098605500"
	)
	static void method485(Widget var0, boolean var1) {
		if (var0 != null) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
			if (var1) {
				class539.scriptDotWidget = var0;
			} else {
				Huffman.scriptActiveWidget = var0;
			}
		} else {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
		}

	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ILcr;ZI)I",
		garbageValue = "-2126328720"
	)
	static int method479(int var0, Script var1, boolean var2) {
		Widget var3 = ClientPreferences.widgetDefinition.method7286(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) {
			Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = var3.text;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollHeight;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelZoom;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleZ;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTRANS) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyTop;
			return 1;
		} else if (var0 == 2610) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyBot;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color2;
			return 1;
		} else if (var0 == 2613) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
			return 1;
		} else {
			class361 var4;
			if (var0 == 2617) {
				var4 = var3.method7774();
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3885 : 0;
			}

			if (var0 == 2618) {
				var4 = var3.method7774();
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3883 : 0;
				return 1;
			} else {
				class367 var7;
				if (var0 == 2619) {
					var7 = var3.method7755();
					Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = var7 != null ? var7.method7447().method9021() : "";
					return 1;
				} else if (var0 == 2620) {
					var4 = var3.method7774();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3886 : 0;
					return 1;
				} else if (var0 == 2621) {
					var7 = var3.method7755();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method7457() : 0;
					return 1;
				} else if (var0 == 2622) {
					var7 = var3.method7755();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method7458() : 0;
					return 1;
				} else if (var0 == 2623) {
					var7 = var3.method7755();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method7459() : 0;
					return 1;
				} else if (var0 == 2624) {
					var7 = var3.method7755();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null && var7.method7449() ? 1 : 0;
					return 1;
				} else if (var0 != 2625) {
					if (var0 == 2626) {
						var7 = var3.method7755();
						Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = var7 != null ? var7.method7421().method9215() : "";
						return 1;
					} else if (var0 == 2627) {
						var7 = var3.method7755();
						int var5 = var7 != null ? var7.method7615() : 0;
						int var6 = var7 != null ? var7.method7452() : 0;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.min(var5, var6);
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.max(var5, var6);
						return 1;
					} else if (var0 == 2628) {
						var7 = var3.method7755();
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method7452() : 0;
						return 1;
					} else if (var0 == 2629) {
						var7 = var3.method7755();
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method7513() : 0;
						return 1;
					} else if (var0 == 2630) {
						var7 = var3.method7755();
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method7617() : 0;
						return 1;
					} else if (var0 == 2631) {
						var7 = var3.method7755();
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method7464() : 0;
						return 1;
					} else if (var0 == 2632) {
						var7 = var3.method7755();
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method7473() : 0;
						return 1;
					} else {
						class27 var8;
						if (var0 == 2633) {
							var8 = var3.method7775();
							Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = var8 != null ? var8.method428(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else if (var0 == 2634) {
							var8 = var3.method7775();
							Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = var8 != null ? var8.method411((char)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var7 = var3.method7755();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null && var7.method7450() ? 1 : 0;
					return 1;
				}
			}
		}
	}
}
