import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mw")
public class class331 {
	@ObfuscatedName("ab")
	static int[] field3608;

	static {
		new Object();
		field3608 = new int[33];
		field3608[0] = 0;
		int var0 = 2;

		for (int var1 = 1; var1 < 33; ++var1) {
			field3608[var1] = var0 - 1;
			var0 += var0;
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "82"
	)
	public static void method6493() {
		PlayerComposition.PlayerAppearance_cachedModels.clear();
		PlayerComposition.field3815.clearFiles();
		PlayerComposition.field3816 = 0;
	}
}
