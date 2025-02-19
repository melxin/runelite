import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dn")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1760647651
	)
	@Export("group")
	int group;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 113511677
	)
	@Export("type")
	int type;
	@ObfuscatedName("au")
	boolean field1088;

	InterfaceParent() {
		this.field1088 = false;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)J",
		garbageValue = "4"
	)
	public static final synchronized long method2434() {
		long var0 = System.currentTimeMillis();
		if (var0 < class331.field3666) {
			class331.field3668 += class331.field3666 - var0;
		}

		class331.field3666 = var0;
		return class331.field3668 + var0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpl;I)I",
		garbageValue = "-976934426"
	)
	static int method2432(AbstractArchive var0) {
		int var1 = Login.field977.length + Login.field965.length;
		String[] var2 = Login.field953;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			String var4 = var2[var3];
			if (var0.getGroupId(var4) != -1) {
				++var1;
			}
		}

		return var1;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILdy;ZI)I",
		garbageValue = "-1403012540"
	)
	static int method2433(int var0, Script var1, boolean var2) {
		boolean var3 = true;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = class376.widgetDefinition.method6918(Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize]);
			var3 = false;
		} else {
			var4 = var2 ? class132.scriptDotWidget : PlayerCompositionColorTextureOverride.scriptActiveWidget;
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) {
			var11 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize] - 1;
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
				HealthBarConfig.Interpreter_intStackSize -= 2;
				var11 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
				var6 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
				var4.parent = class376.widgetDefinition.getWidgetChild(var11, var6);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) {
				var4.isScrollBar = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize] == 1;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) {
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) {
				var4.dragThreshold = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) {
				var4.dataText = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) {
				var4.spellActionName = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) {
				var4.actions = null;
				var4.field4017 = null;
				return 1;
			} else if (var0 == 1308) {
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize] == 1;
				return 1;
			} else if (var0 == 1309) {
				--HealthBarConfig.Interpreter_intStackSize;
				return 1;
			} else if (var0 == 1310) {
				var11 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize] - 1;
				if (var11 >= 0 && var11 <= 9 && var4.field4017 != null) {
					var4.field4017[var11] = null;
					return 1;
				} else {
					return 1;
				}
			} else if (var0 == 1311) {
				var11 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize] - 1;
				var6 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize] - 1;
				if (var6 >= 0 && var6 <= 9 && var11 >= 0) {
					var4.method7423(var6, var11, Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == 1312) {
				var11 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
				if (var11 == -1) {
					var4.field4056 = -97278468;
				} else if (var11 >= 1 && var11 <= 10) {
					var4.field4056 = (var11 - 1) * -1098061441;
				}

				return 1;
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) {
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) {
						HealthBarConfig.Interpreter_intStackSize -= 2;
						var5 = 10;
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize]};
						byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1]};
						AttackOption.Widget_setKey(var4, var5, var8, var9);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) {
						HealthBarConfig.Interpreter_intStackSize -= 3;
						var11 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize] - 1;
						var6 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
						var7 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 2];
						if (var11 >= 0 && var11 <= 9) {
							class87.Widget_setKeyRate(var4, var11, var6, var7);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) {
						var5 = 10;
						var6 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
						var7 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
						class87.Widget_setKeyRate(var4, var5, var6, var7);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) {
						--HealthBarConfig.Interpreter_intStackSize;
						var11 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize] - 1;
						if (var11 >= 0 && var11 <= 9) {
							DirectByteArrayCopier.Widget_setKeyIgnoreHeld(var4, var11);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) {
						var5 = 10;
						DirectByteArrayCopier.Widget_setKeyIgnoreHeld(var4, var5);
						return 1;
					} else {
						return 2;
					}
				} else {
					byte[] var10 = null;
					var8 = null;
					if (var3) {
						HealthBarConfig.Interpreter_intStackSize -= 10;

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + HealthBarConfig.Interpreter_intStackSize] >= 0; var7 += 2) {
						}

						if (var7 > 0) {
							var10 = new byte[var7 / 2];
							var8 = new byte[var7 / 2];

							for (var7 -= 2; var7 >= 0; var7 -= 2) {
								var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + HealthBarConfig.Interpreter_intStackSize];
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + HealthBarConfig.Interpreter_intStackSize + 1];
							}
						}
					} else {
						HealthBarConfig.Interpreter_intStackSize -= 2;
						var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize]};
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1]};
					}

					var7 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize] - 1;
					if (var7 >= 0 && var7 <= 9) {
						AttackOption.Widget_setKey(var4, var7, var10, var8);
						return 1;
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(Ldp;Ldv;I)V",
		garbageValue = "-375244692"
	)
	static final void method2436(WorldView var0, PendingSpawn var1) {
		Scene var2 = var0.scene;
		long var3 = 0L;
		int var5 = -1;
		int var6 = 0;
		int var7 = 0;
		if (var1.type == 0) {
			var3 = var2.getBoundaryObjectTag(var1.plane, var1.x, var1.y);
		}

		if (var1.type == 1) {
			var3 = var2.getWallDecorationTag(var1.plane, var1.x, var1.y);
		}

		if (var1.type == 2) {
			var3 = var2.getGameObjectTag(var1.plane, var1.x, var1.y);
		}

		if (var1.type == 3) {
			var3 = var2.getFloorDecorationTag(var1.plane, var1.x, var1.y);
		}

		if (var3 != 0L) {
			int var8 = var2.getObjectFlags(var1.plane, var1.x, var1.y, var3);
			var5 = FaceNormal.Entity_unpackID(var3);
			var6 = var8 & 31;
			var7 = var8 >> 6 & 3;
		}

		var1.objectId = var5;
		var1.field1205 = var6;
		var1.field1204 = var7;
	}

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1698847650"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		class435.method8221();
		Client.menu.menuWorldViewIds[0] = -1;
		Client.menu.menuActions[0] = "Cancel";
		Client.menu.menuTargets[0] = "";
		Client.menu.menuOpcodes[0] = 1006;
		Client.menu.menuShiftClick[0] = false;
		Client.menu.subMenus[0] = null;
		Client.menu.menuOptionsCount = 1;
	}
}
