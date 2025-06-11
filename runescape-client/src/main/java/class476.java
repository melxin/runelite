import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sw")
public class class476 {
	@ObfuscatedName("ap")
	final int[] field5137;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 586960285
	)
	int field5138;

	public class476(int var1) {
		this.field5137 = new int[var1];
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1579062174"
	)
	public void method9428(int var1) {
		this.field5137[++this.field5138 - 1] = var1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-121"
	)
	public int method9430(int var1) {
		return this.field5137[var1];
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "14485"
	)
	public int method9429() {
		return this.field5138;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "388884917"
	)
	public void method9432() {
		this.field5138 = 0;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ILcr;ZI)I",
		garbageValue = "1121677806"
	)
	static int method9446(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.indexCheck.isValidIndexInRange(var3) ? 1 : 0;
			return 1;
		} else if (var0 == 3501) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.indexCheck.method5891(var3) ? 1 : 0;
			return 1;
		} else if (var0 == 3502) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.indexCheck.method5893(var3) ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}
}
