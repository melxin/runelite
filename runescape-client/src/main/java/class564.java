import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("vz")
public abstract class class564 {
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ILdy;ZI)I",
		garbageValue = "346054568"
	)
	static int method10164(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) {
			HealthBarConfig.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
			var9 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
			EnumComposition var10 = class1.getEnum(var3);
			if (var10.outputType != 's') {
			}

			for (var6 = 0; var6 < var10.outputCount; ++var6) {
				if (var9 == var10.keys[var6]) {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var10.strVals[var6];
					var10 = null;
					break;
				}
			}

			if (var10 != null) {
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var10.defaultStr;
			}

			return 1;
		} else if (var0 != ScriptOpcodes.ENUM) {
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) {
				var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
				EnumComposition var4 = class1.getEnum(var3);
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var4.size();
				return 1;
			} else {
				return 2;
			}
		} else {
			HealthBarConfig.Interpreter_intStackSize -= 4;
			var3 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
			var9 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
			int var5 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 2];
			var6 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 3];
			EnumComposition var7 = class1.getEnum(var5);
			if (var3 == var7.inputType && var9 == var7.outputType) {
				for (int var8 = 0; var8 < var7.outputCount; ++var8) {
					if (var6 == var7.keys[var8]) {
						if (var9 == 115) {
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var7.intVals[var8];
						}

						var7 = null;
						break;
					}
				}

				if (var7 != null) {
					if (var9 == 115) {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var7.defaultInt;
					}
				}

				return 1;
			} else {
				if (var9 == 115) {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			}
		}
	}
}
