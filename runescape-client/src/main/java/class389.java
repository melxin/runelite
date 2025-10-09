import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oj")
public class class389 {
	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	static class523 field4498;

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ltl;IB)I",
		garbageValue = "12"
	)
	public static int method8214(DynamicArray var0, int var1) {
		DefaultsGroup.method10548(var0, class572.field5879);
		if (var1 >= 0) {
			int[] var2 = var0.method10430();
			int var3 = var0.method10433();

			for (int var4 = 0; var4 < var3; ++var4) {
				if (var1 < var2[var4]) {
					return var4;
				}

				var1 -= var2[var4];
			}
		}

		return -1;
	}
}
