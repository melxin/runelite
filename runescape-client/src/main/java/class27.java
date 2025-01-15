import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bh")
public class class27 {
	@ObfuscatedName("uz")
	@ObfuscatedGetter(
		intValue = 393762101
	)
	static int field118;
	@ObfuscatedName("ae")
	int[] field116;
	@ObfuscatedName("ax")
	int[] field117;

	public class27() {
		this.field116 = new int[112];
		this.field117 = new int[192];
		Arrays.fill(this.field116, 3);
		Arrays.fill(this.field117, 3);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "862757942"
	)
	public void method408(int var1, int var2) {
		if (this.method414(var1) && this.method416(var2)) {
			this.field116[var1] = var2;
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(CII)V",
		garbageValue = "-1952351037"
	)
	public void method407(char var1, int var2) {
		if (this.method415(var1) && this.method416(var2)) {
			this.field117[var1] = var2;
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "693442515"
	)
	public int method449(int var1) {
		return this.method414(var1) ? this.field116[var1] : 0;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(CI)I",
		garbageValue = "-1717637674"
	)
	public int method409(char var1) {
		return this.method415(var1) ? this.field117[var1] : 0;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "73"
	)
	public boolean method406(int var1) {
		return this.method414(var1) && (this.field116[var1] == 1 || this.field116[var1] == 3);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1204283468"
	)
	public boolean method411(char var1) {
		return this.method415(var1) && (this.field117[var1] == 1 || this.field117[var1] == 3);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1272866882"
	)
	public boolean method412(int var1) {
		return this.method414(var1) && (this.field116[var1] == 2 || this.field116[var1] == 3);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "73484292"
	)
	public boolean method413(char var1) {
		return this.method415(var1) && (this.field117[var1] == 2 || this.field117[var1] == 3);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-639505872"
	)
	boolean method414(int var1) {
		if (var1 >= 0 && var1 < 112) {
			return true;
		} else {
			System.out.println("Invalid keycode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1150164658"
	)
	boolean method415(char var1) {
		if (var1 >= 0 && var1 < 192) {
			return true;
		} else {
			System.out.println("Invalid keychar: " + var1);
			return false;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1650627396"
	)
	boolean method416(int var1) {
		if (var1 >= 0 && var1 < 4) {
			return true;
		} else {
			System.out.println("Invalid mode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZI)I",
		garbageValue = "-1394724390"
	)
	static int method426(int var0, Script var1, boolean var2) {
		Widget var3 = ClanChannel.widgetDefinition.method7031(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) {
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) {
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) {
			Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var3.text;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) {
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3.scrollWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) {
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3.scrollHeight;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) {
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3.modelZoom;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) {
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3.modelAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) {
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3.modelAngleZ;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) {
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3.modelAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTRANS) {
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3.transparencyTop;
			return 1;
		} else if (var0 == 2610) {
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3.transparencyBot;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) {
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3.color;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) {
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3.color2;
			return 1;
		} else if (var0 == 2613) {
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) {
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
			return 1;
		} else {
			class353 var4;
			if (var0 == 2617) {
				var4 = var3.method7445();
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var4 != null ? var4.field3783 : 0;
			}

			if (var0 == 2618) {
				var4 = var3.method7445();
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var4 != null ? var4.field3781 : 0;
				return 1;
			} else {
				class359 var7;
				if (var0 == 2619) {
					var7 = var3.method7444();
					Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var7 != null ? var7.method7363().method8533() : "";
					return 1;
				} else if (var0 == 2620) {
					var4 = var3.method7445();
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var4 != null ? var4.field3782 : 0;
					return 1;
				} else if (var0 == 2621) {
					var7 = var3.method7444();
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var7 != null ? var7.method7188() : 0;
					return 1;
				} else if (var0 == 2622) {
					var7 = var3.method7444();
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var7 != null ? var7.method7189() : 0;
					return 1;
				} else if (var0 == 2623) {
					var7 = var3.method7444();
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var7 != null ? var7.method7190() : 0;
					return 1;
				} else if (var0 == 2624) {
					var7 = var3.method7444();
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var7 != null && var7.method7221() ? 1 : 0;
					return 1;
				} else if (var0 != 2625) {
					if (var0 == 2626) {
						var7 = var3.method7444();
						Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var7 != null ? var7.method7179().method8809() : "";
						return 1;
					} else if (var0 == 2627) {
						var7 = var3.method7444();
						int var5 = var7 != null ? var7.method7184() : 0;
						int var6 = var7 != null ? var7.method7259() : 0;
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Math.min(var5, var6);
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Math.max(var5, var6);
						return 1;
					} else if (var0 == 2628) {
						var7 = var3.method7444();
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var7 != null ? var7.method7259() : 0;
						return 1;
					} else if (var0 == 2629) {
						var7 = var3.method7444();
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var7 != null ? var7.method7157() : 0;
						return 1;
					} else if (var0 == 2630) {
						var7 = var3.method7444();
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var7 != null ? var7.method7191() : 0;
						return 1;
					} else if (var0 == 2631) {
						var7 = var3.method7444();
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var7 != null ? var7.method7193() : 0;
						return 1;
					} else if (var0 == 2632) {
						var7 = var3.method7444();
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var7 != null ? var7.method7371() : 0;
						return 1;
					} else {
						class27 var8;
						if (var0 == 2633) {
							var8 = var3.method7535();
							Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize - 1] = var8 != null ? var8.method449(Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else if (var0 == 2634) {
							var8 = var3.method7535();
							Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize - 1] = var8 != null ? var8.method409((char)Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var7 = var3.method7444();
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var7 != null && var7.method7181() ? 1 : 0;
					return 1;
				}
			}
		}
	}
}
