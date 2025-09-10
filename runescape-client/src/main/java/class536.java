import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ub")
public class class536 {
	@ObfuscatedName("ay")
	public static final int[] field5574;
	@ObfuscatedName("ad")
	public static final int[] field5571;
	@ObfuscatedName("ag")
	static final int[][] field5576;

	static {
		field5574 = new int[2048];
		field5571 = new int[2048];
		field5576 = new int[512][512];
		double var0 = 0.0030679615757712823D;

		int var2;
		for (var2 = 0; var2 < 2048; ++var2) {
			field5574[var2] = (int)(65536.0D * Math.sin(var0 * (double)var2));
			field5571[var2] = (int)(65536.0D * Math.cos(var0 * (double)var2));
		}

		for (var2 = -256; var2 < 256; ++var2) {
			for (int var3 = -256; var3 < 256; ++var3) {
				field5576[var2 + 256][var3 + 256] = (int)Math.round(Math.atan2((double)var2, (double)var3) * 325.94932345220167D) - 512 & 2047;
			}
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([J[IIII)V",
		garbageValue = "1345838234"
	)
	public static void method10531(long[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			long var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var8 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var8;
			int var9 = var6 == Long.MAX_VALUE ? 0 : 1;

			for (int var10 = var2; var10 < var3; ++var10) {
				if (var0[var10] < (long)(var10 & var9) + var6) {
					long var11 = var0[var10];
					var0[var10] = var0[var5];
					var0[var5] = var11;
					int var13 = var1[var10];
					var1[var10] = var1[var5];
					var1[var5++] = var13;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var8;
			method10531(var0, var1, var2, var5 - 1);
			method10531(var0, var1, var5 + 1, var3);
		}

	}
}
