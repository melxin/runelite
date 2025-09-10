import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bw")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1703880999
	)
	@Export("param0")
	int param0;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1961044783
	)
	@Export("param1")
	int param1;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -190793019
	)
	@Export("opcode")
	int opcode;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 834359437
	)
	@Export("identifier")
	int identifier;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -877803125
	)
	@Export("itemId")
	int itemId;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1984162679
	)
	@Export("worldViewId")
	int worldViewId;
	@ObfuscatedName("ao")
	@Export("action")
	String action;
	@ObfuscatedName("as")
	@Export("target")
	String target;
	@ObfuscatedName("al")
	boolean field720;

	MenuAction() {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lhe;",
		garbageValue = "-2011895701"
	)
	public static VarbitComposition method1890(int var0) {
		VarbitComposition var1 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0);
			var1 = new VarbitComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			VarbitComposition.VarbitDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ILcg;ZI)I",
		garbageValue = "-1370636116"
	)
	static int method1891(int var0, Script var1, boolean var2) {
		Widget var3 = UrlRequester.widgetDefinition.method7476(Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) {
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) {
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) {
			Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var3.text;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) {
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.scrollWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) {
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.scrollHeight;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) {
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.modelZoom;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) {
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.modelAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) {
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.modelAngleZ;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) {
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.modelAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTRANS) {
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.transparencyTop;
			return 1;
		} else if (var0 == 2610) {
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.transparencyBot;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) {
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.color;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) {
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.color2;
			return 1;
		} else if (var0 == 2613) {
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) {
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
			return 1;
		} else {
			class360 var4;
			if (var0 == 2617) {
				var4 = var3.method8088();
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var4 != null ? var4.field4052 : 0;
			}

			if (var0 == 2618) {
				var4 = var3.method8088();
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var4 != null ? var4.field4053 : 0;
				return 1;
			} else {
				class366 var7;
				if (var0 == 2619) {
					var7 = var3.method7971();
					Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var7 != null ? var7.method7651().method9329() : "";
					return 1;
				} else if (var0 == 2620) {
					var4 = var3.method8088();
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var4 != null ? var4.field4055 : 0;
					return 1;
				} else if (var0 == 2621) {
					var7 = var3.method7971();
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var7 != null ? var7.method7777() : 0;
					return 1;
				} else if (var0 == 2622) {
					var7 = var3.method7971();
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var7 != null ? var7.method7662() : 0;
					return 1;
				} else if (var0 == 2623) {
					var7 = var3.method7971();
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var7 != null ? var7.method7663() : 0;
					return 1;
				} else if (var0 == 2624) {
					var7 = var3.method7971();
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var7 != null && var7.method7839() ? 1 : 0;
					return 1;
				} else if (var0 != 2625) {
					if (var0 == 2626) {
						var7 = var3.method7971();
						Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var7 != null ? var7.method7796().method9518() : "";
						return 1;
					} else if (var0 == 2627) {
						var7 = var3.method7971();
						int var5 = var7 != null ? var7.method7857() : 0;
						int var6 = var7 != null ? var7.method7656() : 0;
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Math.min(var5, var6);
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Math.max(var5, var6);
						return 1;
					} else if (var0 == 2628) {
						var7 = var3.method7971();
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var7 != null ? var7.method7656() : 0;
						return 1;
					} else if (var0 == 2629) {
						var7 = var3.method7971();
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var7 != null ? var7.method7666() : 0;
						return 1;
					} else if (var0 == 2630) {
						var7 = var3.method7971();
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var7 != null ? var7.method7783() : 0;
						return 1;
					} else if (var0 == 2631) {
						var7 = var3.method7971();
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var7 != null ? var7.method7773() : 0;
						return 1;
					} else if (var0 == 2632) {
						var7 = var3.method7971();
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var7 != null ? var7.method7689() : 0;
						return 1;
					} else {
						class28 var8;
						if (var0 == 2633) {
							var8 = var3.method7973();
							Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize - 1] = var8 != null ? var8.method419(Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else if (var0 == 2634) {
							var8 = var3.method7973();
							Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize - 1] = var8 != null ? var8.method420((char)Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var7 = var3.method7971();
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var7 != null && var7.method7654() ? 1 : 0;
					return 1;
				}
			}
		}
	}
}
