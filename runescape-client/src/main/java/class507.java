import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("tt")
public class class507 {
	@ObfuscatedName("aq")
	static final int[] field5154;
	@ObfuscatedName("af")
	static final int[] field5153;

	static {
		field5154 = new int[2048];
		field5153 = new int[2048];
		double var0 = 0.0030679615757712823D;

		for (int var2 = 0; var2 < 2048; ++var2) {
			field5154[var2] = (int)(65536.0D * Math.sin(var0 * (double)var2));
			field5153[var2] = (int)(65536.0D * Math.cos((double)var2 * var0));
		}

	}
}
