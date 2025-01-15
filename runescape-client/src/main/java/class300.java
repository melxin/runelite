import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("lc")
public class class300 {
	@ObfuscatedName("ay")
	public static int method6411(int var0, double var1) {
		double var3 = (double)(var0 >> 16 & 255) / 256.0D;
		double var5 = (double)(var0 >> 8 & 255) / 256.0D;
		double var7 = (double)(var0 & 255) / 256.0D;
		var3 = Math.pow(var3, var1);
		var5 = Math.pow(var5, var1);
		var7 = Math.pow(var7, var1);
		int var9 = (int)(var3 * 256.0D);
		int var10 = (int)(var5 * 256.0D);
		int var11 = (int)(256.0D * var7);
		return var11 + (var10 << 8) + (var9 << 16) + -16777216;
	}
}
