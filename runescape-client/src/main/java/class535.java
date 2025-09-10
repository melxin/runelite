import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("uw")
public class class535 {
	@ObfuscatedName("ac")
	static final int[] field5563;
	@ObfuscatedName("ap")
	static final int[] field5564;

	static {
		field5563 = new int[16384];
		field5564 = new int[16384];
		double var0 = 3.834951969714103E-4D;

		for (int var2 = 0; var2 < 16384; ++var2) {
			field5563[var2] = (int)(16384.0D * Math.sin(var0 * (double)var2));
			field5564[var2] = (int)(16384.0D * Math.cos((double)var2 * var0));
		}

	}
}
