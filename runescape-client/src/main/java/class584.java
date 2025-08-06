import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ww")
public class class584 {
	@ObfuscatedName("am")
	static final int[] field5804;

	static {
		field5804 = new int[17];
		field5804[0] = 0;

		for (int var0 = 0; var0 < 2048; var0 += 128) {
			int var1 = (var0 >> 7) + 1;
			int var3 = 0;
			if (var0 > 0 && var0 < 1024) {
				var3 |= 272;
			}

			if (var0 > 512 && var0 < 1536) {
				var3 |= 1088;
			}

			if (var0 > 1024) {
				var3 |= 544;
			}

			if (var0 > 1536 || var0 < 512) {
				var3 |= 2176;
			}

			if (var0 == 0 || var0 == 1024) {
				var3 |= 48;
			}

			if (var0 == 512 || var0 == 1536) {
				var3 |= 1152;
			}

			field5804[var1] = var3;
		}

	}
}
