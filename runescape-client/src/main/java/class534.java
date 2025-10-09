import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("uh")
public class class534 {
	@ObfuscatedName("au")
	static final int[] field5642;
	@ObfuscatedName("ak")
	public static final int[] field5650;
	@ObfuscatedName("ao")
	static final int[][] field5651;

	static {
		field5642 = new int[2048];
		field5650 = new int[2048];
		field5651 = new int[512][512];
		double var0 = 0.0030679615757712823D;

		int var2;
		for (var2 = 0; var2 < 2048; ++var2) {
			field5642[var2] = (int)(65536.0D * Math.sin(var0 * (double)var2));
			field5650[var2] = (int)(65536.0D * Math.cos((double)var2 * var0));
		}

		for (var2 = -256; var2 < 256; ++var2) {
			for (int var3 = -256; var3 < 256; ++var3) {
				field5651[var2 + 256][var3 + 256] = (int)Math.round(Math.atan2((double)var2, (double)var3) * 325.94932345220167D) - 512 & 2047;
			}
		}

	}
}
