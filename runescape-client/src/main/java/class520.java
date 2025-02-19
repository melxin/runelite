import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("uh")
public class class520 {
	@ObfuscatedName("ai")
	public static final int[] field5274;
	@ObfuscatedName("ak")
	static final int[] field5278;

	static {
		field5274 = new int[2048];
		field5278 = new int[2048];
		double var0 = 0.0030679615757712823D;

		for (int var2 = 0; var2 < 2048; ++var2) {
			field5274[var2] = (int)(65536.0D * Math.sin(var0 * (double)var2));
			field5278[var2] = (int)(65536.0D * Math.cos((double)var2 * var0));
		}

	}
}
