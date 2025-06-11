import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bp")
public class class51 {
	@ObfuscatedName("ap")
	static final BigInteger field726;
	@ObfuscatedName("aj")
	static final BigInteger field730;
	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	static Archive field728;

	static {
		field726 = new BigInteger("10001", 16);
		field730 = new BigInteger("ae61e0df7f65fd97a15baecac264daec7a47f83b616b4e579aae49391d857ccb73cbc45e5b8fd2b02f9134af7098eabbf3096999d0c2facbad8f5b087bbad6820bf6b54e6a8d070de5ccf10a1548afe95d995258045c1b1fb400f9cc36ed62e0ab01175270885ef38081f33d9a6ce565cce9641100b02b0d8548955eeac2ef29", 16);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;ZI)V",
		garbageValue = "190228448"
	)
	static void method1868(ArrayList var0, boolean var1) {
		if (!var1) {
			class335.field3698.clear();
		}

		Iterator var2 = var0.iterator();

		while (var2.hasNext()) {
			MidiRequest var3 = (MidiRequest)var2.next();
			if (var3.musicTrackGroupId != -1 && var3.musicTrackFileId != -1) {
				if (!var1) {
					class335.field3698.add(var3);
				}

				class335.field3704.add(var3);
			}
		}

	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ILcr;ZB)I",
		garbageValue = "15"
	)
	static int method1867(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) {
			Interpreter.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			EnumComposition var10 = World.getEnum(var3);
			if (var10.outputType != 's') {
			}

			for (var6 = 0; var6 < var10.outputCount; ++var6) {
				if (var9 == var10.keys[var6]) {
					Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = var10.strVals[var6];
					var10 = null;
					break;
				}
			}

			if (var10 != null) {
				Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = var10.defaultStr;
			}

			return 1;
		} else if (var0 != ScriptOpcodes.ENUM) {
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				EnumComposition var4 = World.getEnum(var3);
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.size();
				return 1;
			} else {
				return 2;
			}
		} else {
			Interpreter.Interpreter_intStackSize -= 4;
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
			var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
			EnumComposition var7 = World.getEnum(var5);
			if (var3 == var7.inputType && var9 == var7.outputType) {
				for (int var8 = 0; var8 < var7.outputCount; ++var8) {
					if (var6 == var7.keys[var8]) {
						if (var9 == 115) {
							Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.intVals[var8];
						}

						var7 = null;
						break;
					}
				}

				if (var7 != null) {
					if (var9 == 115) {
						Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.defaultInt;
					}
				}

				return 1;
			} else {
				if (var9 == 115) {
					Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			}
		}
	}
}
