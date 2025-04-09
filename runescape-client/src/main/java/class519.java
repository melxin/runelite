import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ty")
public class class519 {
	@ObfuscatedName("af")
	static final int[] field5288;
	@ObfuscatedName("as")
	static final int[] field5291;
	@ObfuscatedName("pl")
	@ObfuscatedSignature(
		descriptor = "Lue;"
	)
	static Fonts field5289;

	static {
		field5288 = new int[16384];
		field5291 = new int[16384];
		double var0 = 3.834951969714103E-4D;

		for (int var2 = 0; var2 < 16384; ++var2) {
			field5288[var2] = (int)(16384.0D * Math.sin(var0 * (double)var2));
			field5291[var2] = (int)(16384.0D * Math.cos((double)var2 * var0));
		}

	}
}
