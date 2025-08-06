import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pd")
public class class401 {
	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "Lxa;"
	)
	static IndexedSprite field4773;

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Ltn;ILtn;III)V",
		garbageValue = "1550891299"
	)
	static void method8272(DynamicArray var0, int var1, DynamicArray var2, int var3, int var4) {
		if (var0.field5399 == class570.field5721) {
			System.arraycopy(var0.array, var1, var2.array, var3, var4);
		} else if (var0.field5399 == class570.field5724) {
			System.arraycopy(var0.field5405, var1, var2.field5405, var3, var4);
		} else {
			System.arraycopy(var0.field5406, var1, var2.field5406, var3, var4);
		}

	}
}
