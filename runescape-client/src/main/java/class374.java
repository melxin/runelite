import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("or")
public class class374 {
	@ObfuscatedName("jb")
	static int[][] field4114;

	static {
		Math.sqrt(8192.0D);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1163631135"
	)
	static final int method7622(int var0, int var1) {
		int var2 = PcmPlayer.method804(var0 - 1, var1 - 1) + PcmPlayer.method804(var0 + 1, var1 - 1) + PcmPlayer.method804(var0 - 1, 1 + var1) + PcmPlayer.method804(var0 + 1, var1 + 1);
		int var3 = PcmPlayer.method804(var0 - 1, var1) + PcmPlayer.method804(var0 + 1, var1) + PcmPlayer.method804(var0, var1 - 1) + PcmPlayer.method804(var0, var1 + 1);
		int var4 = PcmPlayer.method804(var0, var1);
		return var2 / 16 + var3 / 8 + var4 / 4;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZI)I",
		garbageValue = "-574847449"
	)
	static int method7621(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) {
			var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
			Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = FaceNormal.ItemDefinition_get(var3).name;
			return 1;
		} else {
			int var8;
			ItemComposition var10;
			if (var0 == ScriptOpcodes.OC_OP) {
				ScriptFrame.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
				var8 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
				var10 = FaceNormal.ItemDefinition_get(var3);
				if (var8 >= 1 && var8 <= 5 && var10.groundActions[var8 - 1] != null) {
					Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var10.groundActions[var8 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.OC_IOP) {
				ScriptFrame.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
				var8 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
				var10 = FaceNormal.ItemDefinition_get(var3);
				if (var8 >= 1 && var8 <= 5 && var10.inventoryActions[var8 - 1] != null) {
					Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var10.inventoryActions[var8 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == 4222) {
				ScriptFrame.Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
				var8 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
				int var5 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 2];
				ItemComposition var6 = FaceNormal.ItemDefinition_get(var3);
				String var7 = null;
				if (var8 >= 1 && var8 <= 5 && var6.inventoryActions[var8 - 1] != null && var6.subOps != null && var6.subOps[var8 - 1] != null && var5 >= 1 && var5 <= var6.subOps[var8 - 1].length) {
					var7 = var6.subOps[var8 - 1][var5 - 1];
				}

				Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var7 != null ? var7 : "";
				return 1;
			} else if (var0 == ScriptOpcodes.OC_COST) {
				var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = FaceNormal.ItemDefinition_get(var3).price;
				return 1;
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) {
				var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = FaceNormal.ItemDefinition_get(var3).isStackable == 1 ? 1 : 0;
				return 1;
			} else {
				ItemComposition var4;
				if (var0 == ScriptOpcodes.OC_CERT) {
					var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
					var4 = FaceNormal.ItemDefinition_get(var3);
					if (var4.noteTemplate == -1 && var4.note >= 0) {
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNCERT) {
					var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
					var4 = FaceNormal.ItemDefinition_get(var3);
					if (var4.noteTemplate >= 0 && var4.note >= 0) {
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) {
					var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = FaceNormal.ItemDefinition_get(var3).isMembersOnly ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
					var4 = FaceNormal.ItemDefinition_get(var3);
					if (var4.placeholderTemplate == -1 && var4.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
					var4 = FaceNormal.ItemDefinition_get(var3);
					if (var4.placeholderTemplate >= 0 && var4.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_FIND) {
					String var9 = Interpreter.Interpreter_stringStack[--HealthBarConfig.Interpreter_stringStackSize];
					var8 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
					class360.findItemDefinitions(var9, var8 == 1);
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = HttpResponse.foundItemIdCount;
					return 1;
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) {
					if (var0 == ScriptOpcodes.OC_FINDRESET) {
						class271.foundItemIndex = 0;
						return 1;
					} else if (var0 == 4213) {
						var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
						var8 = FaceNormal.ItemDefinition_get(var3).getShiftClickIndex();
						if (var8 == -1) {
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var8;
						} else {
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var8 + 1;
						}

						return 1;
					} else if (var0 == 4214) {
						var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = FaceNormal.ItemDefinition_get(var3).maleModel;
						return 1;
					} else if (var0 == 4215) {
						var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = FaceNormal.ItemDefinition_get(var3).maleModel1;
						return 1;
					} else if (var0 == 4216) {
						var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = FaceNormal.ItemDefinition_get(var3).maleModel2;
						return 1;
					} else if (var0 == 4217) {
						var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
						var4 = FaceNormal.ItemDefinition_get(var3);
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var4.field2896;
						return 1;
					} else if (var0 == 4218) {
						var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = FaceNormal.ItemDefinition_get(var3).examine;
						return 1;
					} else {
						return 2;
					}
				} else {
					if (WorldMapSection1.foundItemIds != null && class271.foundItemIndex < HttpResponse.foundItemIdCount) {
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = WorldMapSection1.foundItemIds[++class271.foundItemIndex - 1] & '\uffff';
					} else {
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-38"
	)
	static final void method7623(int var0, int var1, int var2) {
		if (Buddy.cameraX < var0) {
			Buddy.cameraX = (var0 - Buddy.cameraX) * class544.field5398 / 1000 + Buddy.cameraX + WorldMapSectionType.field3187;
			if (Buddy.cameraX > var0) {
				Buddy.cameraX = var0;
			}
		}

		if (Buddy.cameraX > var0) {
			Buddy.cameraX -= (Buddy.cameraX - var0) * class544.field5398 / 1000 + WorldMapSectionType.field3187;
			if (Buddy.cameraX < var0) {
				Buddy.cameraX = var0;
			}
		}

		if (Message.cameraY < var1) {
			Message.cameraY = (var1 - Message.cameraY) * class544.field5398 / 1000 + Message.cameraY + WorldMapSectionType.field3187;
			if (Message.cameraY > var1) {
				Message.cameraY = var1;
			}
		}

		if (Message.cameraY > var1) {
			Message.cameraY -= (Message.cameraY - var1) * class544.field5398 / 1000 + WorldMapSectionType.field3187;
			if (Message.cameraY < var1) {
				Message.cameraY = var1;
			}
		}

		if (class31.cameraZ < var2) {
			class31.cameraZ = (var2 - class31.cameraZ) * class544.field5398 / 1000 + class31.cameraZ + WorldMapSectionType.field3187;
			if (class31.cameraZ > var2) {
				class31.cameraZ = var2;
			}
		}

		if (class31.cameraZ > var2) {
			class31.cameraZ -= (class31.cameraZ - var2) * class544.field5398 / 1000 + WorldMapSectionType.field3187;
			if (class31.cameraZ < var2) {
				class31.cameraZ = var2;
			}
		}

	}
}
