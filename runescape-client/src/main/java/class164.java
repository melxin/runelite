import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gf")
public abstract class class164 extends Node {
	class164() {
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lve;I)V",
		garbageValue = "-1341652344"
	)
	abstract void vmethod3736(Buffer var1);

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lgb;I)V",
		garbageValue = "992088037"
	)
	abstract void vmethod3737(ClanChannel var1);

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(Lvh;I)Ljava/lang/Object;",
		garbageValue = "-1816852553"
	)
	static Object method3674(class555 var0) {
		if (var0 == null) {
			throw new IllegalStateException("popValueOfType() failure - null baseVarType");
		} else {
			switch(var0.field5519) {
			case 0:
				return Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
			case 2:
				return Interpreter.Interpreter_stringStack[--class338.Interpreter_stringStackSize];
			default:
				throw new IllegalStateException("popValueOfType() failure - unsupported type");
			}
		}
	}
}
