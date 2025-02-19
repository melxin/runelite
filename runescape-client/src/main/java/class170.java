import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gx")
public class class170 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "36"
	)
	@Export("updateLoginIndex")
	static void updateLoginIndex(int var0) {
		Bounds.field4889 = var0;
		Bounds.field4888 = new Bounds[var0];
		class346.field3798 = 0;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-2141507180"
	)
	public static int method3685(int var0, int var1) {
		int var2;
		for (var2 = 0; var1 > 0; --var1) {
			var2 = var2 << 1 | var0 & 1;
			var0 >>>= 1;
		}

		return var2;
	}
}
