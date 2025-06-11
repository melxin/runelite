import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ky")
public class class280 implements Comparator {
	class280() {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lkq;Lkq;I)I",
		garbageValue = "212589587"
	)
	int method6137(class273 var1, class273 var2) {
		return var1.method5991() - var2.method5991();
	}

	public int compare(Object var1, Object var2) {
		return this.method6137((class273)var1, (class273)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(ILcr;ZI)I",
		garbageValue = "549627622"
	)
	static int method6141(int var0, Script var1, boolean var2) {
		if (var0 == 7463) {
			boolean var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
			WorldMapArchiveLoader.method10282(var3);
			return 1;
		} else {
			return 2;
		}
	}
}
