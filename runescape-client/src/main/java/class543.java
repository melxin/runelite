import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("us")
public class class543 {
	@ObfuscatedName("an")
	static final int[] field5653;
	@ObfuscatedName("ae")
	static final int[] field5657;
	@ObfuscatedName("aj")
	static final float[] field5654;
	@ObfuscatedName("ak")
	static final float[] field5658;

	static {
		field5653 = new int[16384];
		field5657 = new int[16384];
		field5654 = new float[16384];
		field5658 = new float[16384];
		double var0 = 3.834951969714103E-4D;

		for (int var2 = 0; var2 < 16384; ++var2) {
			field5653[var2] = (int)(16384.0D * Math.sin((double)var2 * var0));
			field5657[var2] = (int)(16384.0D * Math.cos(var0 * (double)var2));
			field5654[var2] = (float)Math.sin(var0 * (double)var2);
			field5658[var2] = (float)Math.cos((double)var2 * var0);
		}

	}
}
