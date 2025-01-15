import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bm")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("ho")
	static SecureRandom field228;
	@ObfuscatedName("vi")
	@ObfuscatedSignature(
		descriptor = "Lsh;"
	)
	@Export("masterDisk")
	static ArchiveDisk masterDisk;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1508244125
	)
	@Export("id")
	int id;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1413258665
	)
	@Export("size")
	int size;
	@ObfuscatedName("az")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("ao")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("ad")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("an")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("ae")
	@Export("methods")
	Method[] methods;
	@ObfuscatedName("ax")
	@Export("arguments")
	byte[][][] arguments;

	ReflectionCheck() {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-373546867"
	)
	public static final synchronized long method724() {
		long var0 = System.currentTimeMillis();
		if (var0 < class329.field3607) {
			class319.field3313 += class329.field3607 - var0;
		}

		class329.field3607 = var0;
		return class319.field3313 + var0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lna;I[B[BI)V",
		garbageValue = "1806582189"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field3861 == null) {
			if (var2 == null) {
				return;
			}

			var0.field3861 = new byte[11][];
			var0.field3952 = new byte[11][];
			var0.field3964 = new int[11];
			var0.field3864 = new int[11];
		}

		var0.field3861[var1] = var2;
		if (var2 != null) {
			var0.field3950 = true;
		} else {
			var0.field3950 = false;

			for (int var4 = 0; var4 < var0.field3861.length; ++var4) {
				if (var0.field3861[var4] != null) {
					var0.field3950 = true;
					break;
				}
			}
		}

		var0.field3952[var1] = var3;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZI)I",
		garbageValue = "-236178595"
	)
	static int method726(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) {
			ScriptFrame.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
			var9 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
			EnumComposition var10 = VertexNormal.getEnum(var3);
			if (var10.outputType != 's') {
			}

			for (var6 = 0; var6 < var10.outputCount; ++var6) {
				if (var9 == var10.keys[var6]) {
					Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var10.strVals[var6];
					var10 = null;
					break;
				}
			}

			if (var10 != null) {
				Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var10.defaultStr;
			}

			return 1;
		} else if (var0 != ScriptOpcodes.ENUM) {
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) {
				var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
				EnumComposition var4 = VertexNormal.getEnum(var3);
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var4.size();
				return 1;
			} else {
				return 2;
			}
		} else {
			ScriptFrame.Interpreter_intStackSize -= 4;
			var3 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
			var9 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
			int var5 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 2];
			var6 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 3];
			EnumComposition var7 = VertexNormal.getEnum(var5);
			if (var3 == var7.inputType && var9 == var7.outputType) {
				for (int var8 = 0; var8 < var7.outputCount; ++var8) {
					if (var6 == var7.keys[var8]) {
						if (var9 == 115) {
							Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var7.intVals[var8];
						}

						var7 = null;
						break;
					}
				}

				if (var7 != null) {
					if (var9 == 115) {
						Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var7.defaultInt;
					}
				}

				return 1;
			} else {
				if (var9 == 115) {
					Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			}
		}
	}
}
