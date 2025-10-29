import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nu")
public class class341 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "49"
	)
	public static int method7292(int var0) {
		return var0 + -512;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "([J[IIII)V",
		garbageValue = "812950560"
	)
	public static void method7294(long[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			long var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var8 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var8;
			int var9 = Long.MAX_VALUE == var6 ? 0 : 1;

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
			method7294(var0, var1, var2, var5 - 1);
			method7294(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "600904686"
	)
	@Export("isDigit")
	public static boolean isDigit(char var0) {
		return var0 >= '0' && var0 <= '9';
	}
}
