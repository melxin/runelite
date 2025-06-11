import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("tv")
public class class506 implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ltv;"
	)
	static final class506 field5272;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ltv;"
	)
	static final class506 field5264;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ltv;"
	)
	static final class506 field5265;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ltv;"
	)
	public static final class506 field5263;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1699390219
	)
	final int field5267;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1256904109
	)
	final int field5268;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1496392143
	)
	final int field5270;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1079798799
	)
	final int field5266;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -671116821
	)
	final int field5271;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 280771563
	)
	final int field5269;

	static {
		field5272 = new class506(0, 0, 0, 0, 0, 0);
		field5264 = new class506(1, 1, 507, 507, 507, 507);
		field5265 = new class506(2, 2, 338, 338, 338, 507);
		field5263 = new class506(3, 3, 499, 499, 499, 507);
	}

	class506(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field5267 = var1;
		this.field5269 = var2;
		this.field5268 = var3;
		this.field5270 = var4;
		this.field5266 = var5;
		this.field5271 = var6;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "26"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5269;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IZZZI)Z",
		garbageValue = "629555742"
	)
	boolean method9923(int var1, boolean var2, boolean var3, boolean var4) {
		byte var5 = 0;
		int var6 = var5 | (var3 ? 1 : 0);
		var6 |= var2 ? 8 : 32;
		var6 |= var4 ? 128 : 0;
		return (var1 & var6) != 0;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IZZZI)Z",
		garbageValue = "-1955885013"
	)
	boolean method9893(int var1, boolean var2, boolean var3, boolean var4) {
		byte var5 = 0;
		int var6 = var5 | (var3 ? 2 : 0);
		var6 |= var2 ? 16 : 64;
		var6 |= var4 ? 256 : 0;
		return (var1 & var6) != 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ZZZI)Z",
		garbageValue = "-3654380"
	)
	public boolean method9890(boolean var1, boolean var2, boolean var3) {
		return this.method9923(this.field5268, var1, var2, var3);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ZZZI)Z",
		garbageValue = "1212486692"
	)
	public boolean method9924(boolean var1, boolean var2, boolean var3) {
		return this.method9923(this.field5270, var1, var2, var3);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ZZZB)Z",
		garbageValue = "11"
	)
	public boolean method9896(boolean var1, boolean var2, boolean var3) {
		return this.method9923(this.field5266, var1, var2, var3);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ZZZB)Z",
		garbageValue = "76"
	)
	public boolean method9897(boolean var1, boolean var2, boolean var3) {
		return this.method9923(this.field5271, var1, var2, var3);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ZZZI)Z",
		garbageValue = "361284116"
	)
	public boolean method9915(boolean var1, boolean var2, boolean var3) {
		return this.method9893(this.field5268, var1, var2, var3);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ZZZS)Z",
		garbageValue = "370"
	)
	public boolean method9898(boolean var1, boolean var2, boolean var3) {
		return this.method9893(this.field5270, var1, var2, var3);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ZZZI)Z",
		garbageValue = "442464399"
	)
	public boolean method9899(boolean var1, boolean var2, boolean var3) {
		return this.method9893(this.field5266, var1, var2, var3);
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ILcr;ZI)I",
		garbageValue = "893853754"
	)
	static int method9925(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = SceneTilePaint.ItemDefinition_get(var3).name;
			return 1;
		} else {
			int var8;
			ItemComposition var10;
			if (var0 == ScriptOpcodes.OC_OP) {
				Interpreter.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var8 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				var10 = SceneTilePaint.ItemDefinition_get(var3);
				if (var8 >= 1 && var8 <= 5 && var10.groundActions[var8 - 1] != null) {
					Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = var10.groundActions[var8 - 1];
				} else {
					Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.OC_IOP) {
				Interpreter.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var8 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				var10 = SceneTilePaint.ItemDefinition_get(var3);
				if (var8 >= 1 && var8 <= 5 && var10.inventoryActions[var8 - 1] != null) {
					Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = var10.inventoryActions[var8 - 1];
				} else {
					Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == 4222) {
				Interpreter.Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var8 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
				ItemComposition var6 = SceneTilePaint.ItemDefinition_get(var3);
				String var7 = null;
				if (var8 >= 1 && var8 <= 5 && var6.inventoryActions[var8 - 1] != null && var6.subOps != null && var6.subOps[var8 - 1] != null && var5 >= 1 && var5 <= var6.subOps[var8 - 1].length) {
					var7 = var6.subOps[var8 - 1][var5 - 1];
				}

				Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = var7 != null ? var7 : "";
				return 1;
			} else if (var0 == ScriptOpcodes.OC_COST) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = SceneTilePaint.ItemDefinition_get(var3).price;
				return 1;
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = SceneTilePaint.ItemDefinition_get(var3).isStackable == 1 ? 1 : 0;
				return 1;
			} else {
				ItemComposition var4;
				if (var0 == ScriptOpcodes.OC_CERT) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					var4 = SceneTilePaint.ItemDefinition_get(var3);
					if (var4.noteTemplate == -1 && var4.note >= 0) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNCERT) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					var4 = SceneTilePaint.ItemDefinition_get(var3);
					if (var4.noteTemplate >= 0 && var4.note >= 0) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = SceneTilePaint.ItemDefinition_get(var3).isMembersOnly ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					var4 = SceneTilePaint.ItemDefinition_get(var3);
					if (var4.placeholderTemplate == -1 && var4.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					var4 = SceneTilePaint.ItemDefinition_get(var3);
					if (var4.placeholderTemplate >= 0 && var4.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_FIND) {
					String var9 = (String)Interpreter.Interpreter_objectStack[--class175.Interpreter_objectStackSize];
					var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					class440.findItemDefinitions(var9, var8 == 1);
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class518.foundItemIdCount;
					return 1;
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) {
					if (var0 == ScriptOpcodes.OC_FINDRESET) {
						GameObject.foundItemIndex = 0;
						return 1;
					} else if (var0 == 4213) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var8 = SceneTilePaint.ItemDefinition_get(var3).getShiftClickIndex();
						if (var8 == -1) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var8;
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var8 + 1;
						}

						return 1;
					} else if (var0 == 4214) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = SceneTilePaint.ItemDefinition_get(var3).maleModel;
						return 1;
					} else if (var0 == 4215) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = SceneTilePaint.ItemDefinition_get(var3).maleModel1;
						return 1;
					} else if (var0 == 4216) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = SceneTilePaint.ItemDefinition_get(var3).maleModel2;
						return 1;
					} else if (var0 == 4217) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var4 = SceneTilePaint.ItemDefinition_get(var3);
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.field2267;
						return 1;
					} else if (var0 == 4218) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = SceneTilePaint.ItemDefinition_get(var3).examine;
						return 1;
					} else {
						return 2;
					}
				} else {
					if (class226.foundItemIds != null && GameObject.foundItemIndex < class518.foundItemIdCount) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class226.foundItemIds[++GameObject.foundItemIndex - 1] & '\uffff';
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
					}

					return 1;
				}
			}
		}
	}
}
