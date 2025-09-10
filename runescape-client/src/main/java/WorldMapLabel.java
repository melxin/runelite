import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ls")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("mk")
	@ObfuscatedGetter(
		intValue = 2107040277
	)
	@Export("cameraYaw")
	static int cameraYaw;
	@ObfuscatedName("af")
	@Export("text")
	String text;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1305762797
	)
	@Export("width")
	int width;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1015778207
	)
	@Export("height")
	int height;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IILlf;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1;
		this.width = var2;
		this.height = var3;
		this.size = var4;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILcg;ZI)I",
		garbageValue = "-1806323724"
	)
	static int method6828(int var0, Script var1, boolean var2) {
		boolean var3 = true;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = UrlRequester.widgetDefinition.method7476(Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize]);
			var3 = false;
		} else {
			var4 = var2 ? HttpRequestTask.scriptDotWidget : class141.scriptActiveWidget;
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) {
			var11 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] - 1;
			if (var11 >= 0 && var11 < 32) {
				var4.setAction(var11, (String)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize]);
				return 1;
			} else {
				--Interpreter.Interpreter_objectStackSize;
				return 1;
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) {
				UserComparator7.Interpreter_intStackSize -= 2;
				var11 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
				var6 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
				var4.parent = UrlRequester.widgetDefinition.getWidgetChild(var11, var6);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) {
				var4.isScrollBar = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) {
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) {
				var4.dragThreshold = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) {
				var4.dataText = (String)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) {
				var4.spellActionName = (String)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) {
				var4.actions = null;
				var4.field4229 = null;
				return 1;
			} else if (var0 == 1308) {
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
				return 1;
			} else if (var0 == 1309) {
				--UserComparator7.Interpreter_intStackSize;
				return 1;
			} else if (var0 == 1310) {
				var11 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] - 1;
				if (var11 >= 0 && var11 <= 9 && var4.field4229 != null) {
					var4.field4229[var11] = null;
					return 1;
				} else {
					return 1;
				}
			} else if (var0 == 1311) {
				var11 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] - 1;
				var6 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] - 1;
				if (var6 >= 0 && var6 <= 9 && var11 >= 0) {
					var4.method7947(var6, var11, (String)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize]);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == 1312) {
				var11 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
				if (var11 == -1) {
					var4.targetPriority = 1195639676;
				} else if (var11 >= 1 && var11 <= 32) {
					var4.targetPriority = (var11 - 1) * 1372651743;
				}

				return 1;
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) {
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) {
						UserComparator7.Interpreter_intStackSize -= 2;
						var5 = 10;
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize]};
						byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1]};
						class192.Widget_setKey(var4, var5, var8, var9);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) {
						UserComparator7.Interpreter_intStackSize -= 3;
						var11 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize] - 1;
						var6 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
						var7 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 2];
						if (var11 >= 0 && var11 <= 9) {
							class154.Widget_setKeyRate(var4, var11, var6, var7);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) {
						var5 = 10;
						var6 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
						var7 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
						class154.Widget_setKeyRate(var4, var5, var6, var7);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) {
						--UserComparator7.Interpreter_intStackSize;
						var11 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize] - 1;
						if (var11 >= 0 && var11 <= 9) {
							IgnoreList.Widget_setKeyIgnoreHeld(var4, var11);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) {
						var5 = 10;
						IgnoreList.Widget_setKeyIgnoreHeld(var4, var5);
						return 1;
					} else {
						return 2;
					}
				} else {
					byte[] var10 = null;
					var8 = null;
					if (var3) {
						UserComparator7.Interpreter_intStackSize -= 10;

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + UserComparator7.Interpreter_intStackSize] >= 0; var7 += 2) {
						}

						if (var7 > 0) {
							var10 = new byte[var7 / 2];
							var8 = new byte[var7 / 2];

							for (var7 -= 2; var7 >= 0; var7 -= 2) {
								var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + UserComparator7.Interpreter_intStackSize];
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + UserComparator7.Interpreter_intStackSize + 1];
							}
						}
					} else {
						UserComparator7.Interpreter_intStackSize -= 2;
						var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize]};
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1]};
					}

					var7 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] - 1;
					if (var7 >= 0 && var7 <= 9) {
						class192.Widget_setKey(var4, var7, var10, var8);
						return 1;
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-87"
	)
	static final void method6829(int var0, int var1, int var2) {
		if (HealthBarDefinition.cameraX < var0) {
			HealthBarDefinition.cameraX = (var0 - HealthBarDefinition.cameraX) * class282.field3290 / 1000 + HealthBarDefinition.cameraX + class265.field3150;
			if (HealthBarDefinition.cameraX > var0) {
				HealthBarDefinition.cameraX = var0;
			}
		}

		if (HealthBarDefinition.cameraX > var0) {
			HealthBarDefinition.cameraX -= (HealthBarDefinition.cameraX - var0) * class282.field3290 / 1000 + class265.field3150;
			if (HealthBarDefinition.cameraX < var0) {
				HealthBarDefinition.cameraX = var0;
			}
		}

		if (class174.cameraY < var1) {
			class174.cameraY = (var1 - class174.cameraY) * class282.field3290 / 1000 + class174.cameraY + class265.field3150;
			if (class174.cameraY > var1) {
				class174.cameraY = var1;
			}
		}

		if (class174.cameraY > var1) {
			class174.cameraY -= (class174.cameraY - var1) * class282.field3290 / 1000 + class265.field3150;
			if (class174.cameraY < var1) {
				class174.cameraY = var1;
			}
		}

		if (HttpRequest.cameraZ < var2) {
			HttpRequest.cameraZ = (var2 - HttpRequest.cameraZ) * class282.field3290 / 1000 + HttpRequest.cameraZ + class265.field3150;
			if (HttpRequest.cameraZ > var2) {
				HttpRequest.cameraZ = var2;
			}
		}

		if (HttpRequest.cameraZ > var2) {
			HttpRequest.cameraZ -= (HttpRequest.cameraZ - var2) * class282.field3290 / 1000 + class265.field3150;
			if (HttpRequest.cameraZ < var2) {
				HttpRequest.cameraZ = var2;
			}
		}

	}
}
