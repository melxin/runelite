import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("md")
public class class331 {
	@ObfuscatedName("ay")
	static int[] field3612;

	static {
		new Object();
		field3612 = new int[33];
		field3612[0] = 0;
		int var0 = 2;

		for (int var1 = 1; var1 < 33; ++var1) {
			field3612[var1] = var0 - 1;
			var0 += var0;
		}

	}
}
