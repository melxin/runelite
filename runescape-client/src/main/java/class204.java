import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hg")
public class class204 extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("field1909")
	public static EvictingDualNodeHashTable field1909;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("KitDefinition_modelsArchive")
	public static AbstractArchive KitDefinition_modelsArchive;
	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	static Archive field2110;
	@ObfuscatedName("gv")
	@ObfuscatedGetter(
		intValue = 84495201
	)
	static int field2109;

	static {
		field1909 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-10"
	)
	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0;
		if (var0 < 0 || var0 >= 65536) {
			var0 >>>= 16;
			var1 += 16;
		}

		if (var0 >= 256) {
			var0 >>>= 8;
			var1 += 8;
		}

		if (var0 >= 16) {
			var0 >>>= 4;
			var1 += 4;
		}

		if (var0 >= 4) {
			var0 >>>= 2;
			var1 += 2;
		}

		if (var0 >= 1) {
			var0 >>>= 1;
			++var1;
		}

		return var0 + var1;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZB)I",
		garbageValue = "16"
	)
	static int method4030(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) {
			var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = WorldEntityCoord.ItemDefinition_get(var3).name;
			return 1;
		} else {
			int var8;
			ItemComposition var10;
			if (var0 == ScriptOpcodes.OC_OP) {
				PrivateChatMode.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
				var8 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
				var10 = WorldEntityCoord.ItemDefinition_get(var3);
				if (var8 >= 1 && var8 <= 5 && var10.groundActions[var8 - 1] != null) {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var10.groundActions[var8 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.OC_IOP) {
				PrivateChatMode.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
				var8 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
				var10 = WorldEntityCoord.ItemDefinition_get(var3);
				if (var8 >= 1 && var8 <= 5 && var10.inventoryActions[var8 - 1] != null) {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var10.inventoryActions[var8 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == 4222) {
				PrivateChatMode.Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
				var8 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
				int var5 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 2];
				ItemComposition var6 = WorldEntityCoord.ItemDefinition_get(var3);
				String var7 = null;
				if (var8 >= 1 && var8 <= 5 && var6.inventoryActions[var8 - 1] != null && var6.field2249 != null && var6.field2249[var8 - 1] != null && var5 >= 1 && var5 <= var6.field2249[var8 - 1].length) {
					var7 = var6.field2249[var8 - 1][var5 - 1];
				}

				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7 != null ? var7 : "";
				return 1;
			} else if (var0 == ScriptOpcodes.OC_COST) {
				var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = WorldEntityCoord.ItemDefinition_get(var3).price;
				return 1;
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) {
				var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = WorldEntityCoord.ItemDefinition_get(var3).isStackable == 1 ? 1 : 0;
				return 1;
			} else {
				ItemComposition var4;
				if (var0 == ScriptOpcodes.OC_CERT) {
					var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
					var4 = WorldEntityCoord.ItemDefinition_get(var3);
					if (var4.noteTemplate == -1 && var4.note >= 0) {
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNCERT) {
					var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
					var4 = WorldEntityCoord.ItemDefinition_get(var3);
					if (var4.noteTemplate >= 0 && var4.note >= 0) {
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) {
					var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = WorldEntityCoord.ItemDefinition_get(var3).isMembersOnly ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
					var4 = WorldEntityCoord.ItemDefinition_get(var3);
					if (var4.placeholderTemplate == -1 && var4.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
					var4 = WorldEntityCoord.ItemDefinition_get(var3);
					if (var4.placeholderTemplate >= 0 && var4.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_FIND) {
					String var9 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					var8 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
					WorldMapSectionType.findItemDefinitions(var9, var8 == 1);
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Bounds.foundItemIdCount;
					return 1;
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) {
					if (var0 == ScriptOpcodes.OC_FINDRESET) {
						WorldMapIcon_1.foundItemIndex = 0;
						return 1;
					} else if (var0 == 4213) {
						var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
						var8 = WorldEntityCoord.ItemDefinition_get(var3).getShiftClickIndex();
						if (var8 == -1) {
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var8;
						} else {
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var8 + 1;
						}

						return 1;
					} else if (var0 == 4214) {
						var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = WorldEntityCoord.ItemDefinition_get(var3).maleModel;
						return 1;
					} else if (var0 == 4215) {
						var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = WorldEntityCoord.ItemDefinition_get(var3).maleModel1;
						return 1;
					} else if (var0 == 4216) {
						var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = WorldEntityCoord.ItemDefinition_get(var3).maleModel2;
						return 1;
					} else if (var0 == 4217) {
						var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
						var4 = WorldEntityCoord.ItemDefinition_get(var3);
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var4.field2265;
						return 1;
					} else if (var0 == 4218) {
						var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = WorldEntityCoord.ItemDefinition_get(var3).examine;
						return 1;
					} else {
						return 2;
					}
				} else {
					if (SecureRandomFuture.foundItemIds != null && WorldMapIcon_1.foundItemIndex < Bounds.foundItemIdCount) {
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = SecureRandomFuture.foundItemIds[++WorldMapIcon_1.foundItemIndex - 1] & '\uffff';
					} else {
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = -1;
					}

					return 1;
				}
			}
		}
	}
}
