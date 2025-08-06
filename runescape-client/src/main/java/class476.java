import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("sm")
public class class476 {
	@ObfuscatedName("al")
	@Export("writeRandomDat")
	public static void writeRandomDat(byte[] var0, int var1, byte[] var2, int var3, int var4) {
		if (var2 == var0) {
			if (var3 == var1) {
				return;
			}

			if (var3 > var1 && var3 < var4 + var1) {
				--var4;
				var1 += var4;
				var3 += var4;
				var4 = var1 - var4;

				for (var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
					var2[var3--] = var0[var1--];
				}

				for (var4 -= 7; var1 >= var4; var2[var3--] = var0[var1--]) {
				}

				return;
			}
		}

		var4 += var1;

		for (var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
			var2[var3++] = var0[var1++];
		}

		for (var4 += 7; var1 < var4; var2[var3++] = var0[var1++]) {
		}

	}

	@ObfuscatedName("aj")
	@Export("clearIntArray")
	public static void clearIntArray(int[] var0, int var1, int var2) {
		for (var2 = var2 + var1 - 7; var1 < var2; var0[var1++] = 0) {
			var0[var1++] = 0;
			var0[var1++] = 0;
			var0[var1++] = 0;
			var0[var1++] = 0;
			var0[var1++] = 0;
			var0[var1++] = 0;
			var0[var1++] = 0;
		}

		for (var2 += 7; var1 < var2; var0[var1++] = 0) {
		}

	}

	@ObfuscatedName("ag")
	static Random method9685(int var0, int var1) {
		if (var0 == 0 && var1 == 0) {
			var0 = (int)(Math.random() * 2.147483647E9D);
			var1 = (int)(Math.random() * 2.147483647E9D);
		}

		long var2 = (long)var0 << 32 | (long)var1;
		return new Random(var2);
	}

	@ObfuscatedName("ay")
	public static void method9686(int[] var0, int var1, int var2, int var3) {
		Random var4 = method9685(var2, var3);

		for (int var5 = var1 - 1; var5 > 0; --var5) {
			int var6 = var4.nextInt(var5 + 1);
			if (var5 != var6) {
				int var7 = var0[var5];
				var0[var5] = var0[var6];
				var0[var6] = var7;
			}
		}

	}

	@ObfuscatedName("aa")
	public static void method9687(long[] var0, int var1, int var2, int var3) {
		Random var4 = method9685(var2, var3);

		for (int var5 = var1 - 1; var5 > 0; --var5) {
			int var6 = var4.nextInt(var5 + 1);
			if (var5 != var6) {
				long var7 = var0[var5];
				var0[var5] = var0[var6];
				var0[var6] = var7;
			}
		}

	}

	@ObfuscatedName("ai")
	public static void method9688(Object[] var0, int var1, int var2, int var3) {
		Random var4 = method9685(var2, var3);

		for (int var5 = var1 - 1; var5 > 0; --var5) {
			int var6 = var4.nextInt(var5 + 1);
			if (var5 != var6) {
				Object var7 = var0[var5];
				var0[var5] = var0[var6];
				var0[var6] = var7;
			}
		}

	}
}
