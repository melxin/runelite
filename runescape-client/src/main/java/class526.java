import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ut")
public class class526 {
	@ObfuscatedName("aw")
	static final int[] field5365;
	@ObfuscatedName("at")
	static final int[] field5366;
	@ObfuscatedName("ae")
	static final int[][] field5367;
	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	@Export("archive12")
	static Archive archive12;

	static {
		field5365 = new int[2048];
		field5366 = new int[2048];
		field5367 = new int[512][512];
		double var0 = 0.0030679615757712823D;

		int var2;
		for (var2 = 0; var2 < 2048; ++var2) {
			field5365[var2] = (int)(65536.0D * Math.sin(var0 * (double)var2));
			field5366[var2] = (int)(65536.0D * Math.cos(var0 * (double)var2));
		}

		for (var2 = -256; var2 < 256; ++var2) {
			for (int var3 = -256; var3 < 256; ++var3) {
				field5367[var2 + 256][var3 + 256] = (int)Math.round(Math.atan2((double)var2, (double)var3) * 325.94932345220167D) - 512 & 2047;
			}
		}

	}
}
