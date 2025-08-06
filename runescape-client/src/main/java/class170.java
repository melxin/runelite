import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gr")
public class class170 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lox;B)I",
		garbageValue = "1"
	)
	static int method4063(Widget var0) {
		if (var0.type != 11) {
			Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
			return 1;
		} else {
			String var1 = (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
			Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var0.method7887(var1);
			return 1;
		}
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(ILce;ZI)I",
		garbageValue = "-1579213563"
	)
	static int method4064(int var0, Script var1, boolean var2) {
		return 2;
	}
}
