import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("wr")
public class class577 {
	@ObfuscatedName("ah")
	static final int[] field5686;

	static {
		field5686 = new int[17];
		field5686[0] = 0;

		for (int var0 = 0; var0 < 2048; var0 += 128) {
			int var1 = IntHashTable.method9453(var0);
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

			field5686[var1] = var2;
		}

	}
}
