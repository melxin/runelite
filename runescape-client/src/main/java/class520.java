import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("uc")
public class class520 {
	@ObfuscatedName("ar")
	static final int[] field5297;
	@ObfuscatedName("au")
	public static final int[] field5298;

	static {
		field5297 = new int[2048];
		field5298 = new int[2048];
		double var0 = 0.0030679615757712823D;

		for (int var2 = 0; var2 < 2048; ++var2) {
			field5297[var2] = (int)(65536.0D * Math.sin((double)var2 * var0));
			field5298[var2] = (int)(65536.0D * Math.cos(var0 * (double)var2));
		}

	}
}
