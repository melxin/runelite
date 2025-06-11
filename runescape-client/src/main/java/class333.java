import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ms")
public class class333 {
	@ObfuscatedName("ap")
	static int[] field3682;

	static {
		new Object();
		field3682 = new int[33];
		field3682[0] = 0;
		int var0 = 2;

		for (int var1 = 1; var1 < 33; ++var1) {
			field3682[var1] = var0 - 1;
			var0 += var0;
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ltr;Ltr;ZI)Z",
		garbageValue = "618427115"
	)
	static boolean method6868(WorldEntity var0, WorldEntity var1, boolean var2) {
		if (var1 == var0) {
			return true;
		} else if (var1 == null) {
			return true;
		} else {
			return var0 == null ? false : var2;
		}
	}
}
