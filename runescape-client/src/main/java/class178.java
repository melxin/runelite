import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gi")
public class class178 extends DualNode {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("field1842")
	public static EvictingDualNodeHashTable field1842;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "Lxc;"
	)
	static IndexedSprite field1964;

	static {
		field1842 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Loi;I)I",
		garbageValue = "1943525583"
	)
	static int method4156(Widget var0) {
		if (var0.type != 11) {
			Interpreter.Interpreter_objectStack[Interpreter.Interpreter_objectStackSize - 1] = "";
			return 1;
		} else {
			String var1 = (String)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize];
			Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var0.method7962(var1);
			return 1;
		}
	}
}
