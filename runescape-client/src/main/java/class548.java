import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vw")
public class class548 extends class550 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 597704043
	)
	int field5731;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1730815841
	)
	int field5730;

	public class548(int var1, int var2, int var3, int var4) {
		super(var3, var4);
		this.field5731 = 0;
		this.field5730 = 0;
		this.field5731 = var1;
		this.field5730 = var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "54"
	)
	public int method10748() {
		double var1 = this.method10766();
		return (int)Math.round(var1 * (double)(this.field5730 - this.field5731) + (double)this.field5731);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "([I[IIIB)V",
		garbageValue = "-23"
	)
	public static void method10752(int[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			int var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;
			int var8 = var6 == Integer.MAX_VALUE ? 0 : 1;

			for (int var9 = var2; var9 < var3; ++var9) {
				if (var0[var9] < (var9 & var8) + var6) {
					int var10 = var0[var9];
					var0[var9] = var0[var5];
					var0[var5] = var10;
					int var11 = var1[var9];
					var1[var9] = var1[var5];
					var1[var5++] = var11;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method10752(var0, var1, var2, var5 - 1);
			method10752(var0, var1, var5 + 1, var3);
		}

	}
}
