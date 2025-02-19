import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("tq")
public class class519 {
	@ObfuscatedName("ac")
	static final int[] field5271;
	@ObfuscatedName("ao")
	static final int[] field5269;
	@ObfuscatedName("nj")
	@ObfuscatedGetter(
		intValue = -1694509889
	)
	static int field5270;

	static {
		field5271 = new int[16384];
		field5269 = new int[16384];
		double var0 = 3.834951969714103E-4D;

		for (int var2 = 0; var2 < 16384; ++var2) {
			field5271[var2] = (int)(16384.0D * Math.sin(var0 * (double)var2));
			field5269[var2] = (int)(16384.0D * Math.cos((double)var2 * var0));
		}

	}
}
