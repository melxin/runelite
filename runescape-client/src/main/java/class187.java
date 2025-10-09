import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hu")
public class class187 {
	@ObfuscatedName("lo")
	@ObfuscatedGetter(
		intValue = -1752506919
	)
	static int field2048;

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(ILcj;ZB)I",
		garbageValue = "-119"
	)
	static int method4328(int var0, Script var1, boolean var2) {
		if (var0 == 13337) {
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Interpreter.field632;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ox")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1075445203"
	)
	static final void method4329() {
		Client.field530 = Client.cycleCntr;
		Actor.field1066 = true;
	}
}
