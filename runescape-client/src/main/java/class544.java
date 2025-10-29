import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ud")
public class class544 {
	@ObfuscatedName("ab")
	static final int[] field5667;
	@ObfuscatedName("ax")
	public static final int[] field5668;
	@ObfuscatedName("ar")
	static final int[][] field5669;

	static {
		field5667 = new int[2048];
		field5668 = new int[2048];
		field5669 = new int[512][512];
		double var0 = 0.0030679615757712823D;

		int var2;
		for (var2 = 0; var2 < 2048; ++var2) {
			field5667[var2] = (int)(65536.0D * Math.sin(var0 * (double)var2));
			field5668[var2] = (int)(65536.0D * Math.cos((double)var2 * var0));
		}

		for (var2 = -256; var2 < 256; ++var2) {
			for (int var3 = -256; var3 < 256; ++var3) {
				field5669[var2 + 256][var3 + 256] = (int)Math.round(Math.atan2((double)var2, (double)var3) * 325.94932345220167D) - 512 & 2047;
			}
		}

	}
}
