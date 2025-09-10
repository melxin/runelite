import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bx")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "Lpw;"
	)
	@Export("soundEffectsArchive")
	static Archive soundEffectsArchive;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 122370785
	)
	@Export("id")
	int id;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 203370847
	)
	@Export("size")
	int size;
	@ObfuscatedName("at")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("ac")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("ap")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("aq")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("ao")
	@Export("methods")
	Method[] methods;
	@ObfuscatedName("as")
	@Export("arguments")
	byte[][][] arguments;

	ReflectionCheck() {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "3"
	)
	public static void method740(int var0) {
		MouseHandler.MouseHandler_idleCycles = var0;
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(Lwv;Ljava/lang/Object;I)V",
		garbageValue = "191753758"
	)
	static void method739(class574 var0, Object var1) {
		if (var0 == null) {
			throw new IllegalStateException("pushValueOfType() failure - null baseVarType");
		} else {
			switch(var0.field5819) {
			case 0:
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = (Integer)var1;
				break;
			case 1:
				Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var1;
				break;
			default:
				throw new IllegalStateException("pushValueOfType() failure - unsupported type");
			}

		}
	}
}
