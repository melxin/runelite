import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ue")
public class class532 extends class535 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 17052733
	)
	int field5349;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -52709261
	)
	int field5343;
	@ObfuscatedName("au")
	double field5344;
	@ObfuscatedName("ad")
	double field5345;
	@ObfuscatedName("ah")
	double field5346;
	@ObfuscatedName("ac")
	double field5347;
	@ObfuscatedName("ao")
	double field5348;

	public class532(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		super(var9, var10);
		this.field5349 = 0;
		this.field5343 = 0;
		this.field5344 = 0.0D;
		this.field5345 = 0.0D;
		this.field5346 = 0.0D;
		this.field5347 = 0.0D;
		this.field5348 = 0.0D;
		this.field5349 = var3;
		this.field5343 = var6;
		if ((var5 - var8) * (var7 - var1) == (var4 - var7) * (var8 - var2)) {
			this.field5344 = (double)var4;
			this.field5345 = (double)var5;
		} else {
			double var11 = (double)((float)(var7 + var1)) / 2.0D;
			double var13 = (double)((float)(var8 + var2)) / 2.0D;
			double var15 = (double)((float)(var4 + var7)) / 2.0D;
			double var17 = (double)((float)(var5 + var8)) / 2.0D;
			double var19 = -1.0D * (double)(var7 - var1) / (double)(var8 - var2);
			double var21 = (double)(var4 - var7) * -1.0D / (double)(var5 - var8);
			this.field5344 = (var17 + (var19 * var11 - var15 * var21) - var13) / (var19 - var21);
			this.field5345 = var19 * (this.field5344 - var11) + var13;
			this.field5346 = Math.sqrt(Math.pow(this.field5344 - (double)var1, 2.0D) + Math.pow(this.field5345 - (double)var2, 2.0D));
			this.field5347 = Math.atan2((double)var2 - this.field5345, (double)var1 - this.field5344);
			double var23 = Math.atan2((double)var8 - this.field5345, (double)var7 - this.field5344);
			this.field5348 = Math.atan2((double)var5 - this.field5345, (double)var4 - this.field5344);
			boolean var25 = this.field5347 <= var23 && var23 <= this.field5348 || this.field5348 <= var23 && var23 <= this.field5347;
			if (!var25) {
				this.field5348 += 3.141592653589793D * (double)(this.field5347 - this.field5348 > 0.0D ? 2 : -2);
			}

		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1312763798"
	)
	public int vmethod9685() {
		double var1 = this.method9695();
		double var3 = var1 * (this.field5348 - this.field5347) + this.field5347;
		return (int)Math.round(this.field5344 + this.field5346 * Math.cos(var3));
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1028002245"
	)
	public int vmethod9686() {
		double var1 = this.method9695();
		double var3 = var1 * (this.field5348 - this.field5347) + this.field5347;
		return (int)Math.round(this.field5345 + this.field5346 * Math.sin(var3));
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-51009761"
	)
	public int vmethod9689() {
		double var1 = this.method9695();
		return (int)Math.round((double)this.field5349 + (double)(this.field5343 - this.field5349) * var1);
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ILdy;ZI)I",
		garbageValue = "-1319656580"
	)
	static int method9670(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) {
			var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class138.ItemDefinition_get(var3).name;
			return 1;
		} else {
			int var8;
			ItemComposition var10;
			if (var0 == ScriptOpcodes.OC_OP) {
				HealthBarConfig.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
				var8 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
				var10 = class138.ItemDefinition_get(var3);
				if (var8 >= 1 && var8 <= 5 && var10.groundActions[var8 - 1] != null) {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var10.groundActions[var8 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.OC_IOP) {
				HealthBarConfig.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
				var8 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
				var10 = class138.ItemDefinition_get(var3);
				if (var8 >= 1 && var8 <= 5 && var10.inventoryActions[var8 - 1] != null) {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var10.inventoryActions[var8 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == 4222) {
				HealthBarConfig.Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
				var8 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
				int var5 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 2];
				ItemComposition var6 = class138.ItemDefinition_get(var3);
				String var7 = null;
				if (var8 >= 1 && var8 <= 5 && var6.inventoryActions[var8 - 1] != null && var6.subOps != null && var6.subOps[var8 - 1] != null && var5 >= 1 && var5 <= var6.subOps[var8 - 1].length) {
					var7 = var6.subOps[var8 - 1][var5 - 1];
				}

				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7 != null ? var7 : "";
				return 1;
			} else if (var0 == ScriptOpcodes.OC_COST) {
				var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = class138.ItemDefinition_get(var3).price;
				return 1;
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) {
				var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = class138.ItemDefinition_get(var3).isStackable == 1 ? 1 : 0;
				return 1;
			} else {
				ItemComposition var4;
				if (var0 == ScriptOpcodes.OC_CERT) {
					var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
					var4 = class138.ItemDefinition_get(var3);
					if (var4.noteTemplate == -1 && var4.note >= 0) {
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNCERT) {
					var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
					var4 = class138.ItemDefinition_get(var3);
					if (var4.noteTemplate >= 0 && var4.note >= 0) {
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) {
					var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = class138.ItemDefinition_get(var3).isMembersOnly ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
					var4 = class138.ItemDefinition_get(var3);
					if (var4.placeholderTemplate == -1 && var4.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
					var4 = class138.ItemDefinition_get(var3);
					if (var4.placeholderTemplate >= 0 && var4.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_FIND) {
					String var9 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					var8 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
					UrlRequester.findItemDefinitions(var9, var8 == 1);
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = class394.foundItemIdCount;
					return 1;
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) {
					if (var0 == ScriptOpcodes.OC_FINDRESET) {
						class394.foundItemIndex = 0;
						return 1;
					} else if (var0 == 4213) {
						var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
						var8 = class138.ItemDefinition_get(var3).getShiftClickIndex();
						if (var8 == -1) {
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var8;
						} else {
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var8 + 1;
						}

						return 1;
					} else if (var0 == 4214) {
						var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = class138.ItemDefinition_get(var3).maleModel;
						return 1;
					} else if (var0 == 4215) {
						var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = class138.ItemDefinition_get(var3).maleModel1;
						return 1;
					} else if (var0 == 4216) {
						var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = class138.ItemDefinition_get(var3).maleModel2;
						return 1;
					} else if (var0 == 4217) {
						var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
						var4 = class138.ItemDefinition_get(var3);
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var4.field2286;
						return 1;
					} else if (var0 == 4218) {
						var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class138.ItemDefinition_get(var3).examine;
						return 1;
					} else {
						return 2;
					}
				} else {
					if (FloorUnderlayDefinition.foundItemIds != null && class394.foundItemIndex < class394.foundItemIdCount) {
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = FloorUnderlayDefinition.foundItemIds[++class394.foundItemIndex - 1] & '\uffff';
					} else {
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = -1;
					}

					return 1;
				}
			}
		}
	}
}
