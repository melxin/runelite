import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("vd")
public class class566 {
	@ObfuscatedName("ap")
	static final int[] field5857;

	static {
		field5857 = new int[17];
		field5857[0] = 0;

		for (int var0 = 0; var0 < 2048; var0 += 128) {
			int var1 = class117.method3610(var0);
			int var2 = 0;
			if (var0 > 0 && var0 < 1024) {
				var2 |= 272;
			}

			if (var0 > 512 && var0 < 1536) {
				var2 |= 1088;
			}

			if (var0 > 1024) {
				var2 |= 544;
			}

			if (var0 > 1536 || var0 < 512) {
				var2 |= 2176;
			}

			if (var0 == 0 || var0 == 1024) {
				var2 |= 48;
			}

			if (var0 == 512 || var0 == 1536) {
				var2 |= 1152;
			}

			field5857[var1] = var2;
		}

	}
}
