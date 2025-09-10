import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ol")
public class class389 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(DDIB)[D",
		garbageValue = "113"
	)
	public static double[] method8216(double var0, double var2, int var4) {
		int var5 = var4 * 2 + 1;
		double[] var6 = new double[var5];
		int var7 = -var4;

		for (int var8 = 0; var7 <= var4; ++var8) {
			double var11 = SpriteMask.method7393(((double)var7 - var0) / var2) / var2;
			var6[var8] = var11;
			++var7;
		}

		return var6;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)[Lfe;",
		garbageValue = "-34"
	)
	static class139[] method8215() {
		return new class139[]{class139.field1685, class139.field1682, class139.field1684, class139.field1683, class139.field1687, class139.field1692};
	}
}
