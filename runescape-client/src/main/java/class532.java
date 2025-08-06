import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("uu")
public class class532 {
	@ObfuscatedName("at")
	public static final int[] field5477;
	@ObfuscatedName("ax")
	static final int[] field5476;
	@ObfuscatedName("aq")
	static final int[][] field5467;

	static {
		field5477 = new int[2048];
		field5476 = new int[2048];
		field5467 = new int[512][512];
		double var0 = 0.0030679615757712823D;

		int var2;
		for (var2 = 0; var2 < 2048; ++var2) {
			field5477[var2] = (int)(65536.0D * Math.sin((double)var2 * var0));
			field5476[var2] = (int)(65536.0D * Math.cos(var0 * (double)var2));
		}

		for (var2 = -256; var2 < 256; ++var2) {
			for (int var3 = -256; var3 < 256; ++var3) {
				field5467[var2 + 256][var3 + 256] = (int)Math.round(Math.atan2((double)var2, (double)var3) * 325.94932345220167D) - 512 & 2047;
			}
		}

	}
}
