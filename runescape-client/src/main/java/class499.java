import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tn")
public class class499 {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ltp;II)V",
		garbageValue = "1749663243"
	)
	public static void method9798(class509 var0, int var1) {
		class573.method10775(var0);
		int var2 = var0.method9937();
		if (var2 > 1) {
			var1 %= var2;
			if (var1 != 0) {
				if (var1 < 0) {
					var1 += var2;
				}

				if (var0.field5288 == class563.field5600) {
					int[] var3 = var0.method9965();
					class182.method3997(var3, 0, var2 - 1);
					class182.method3997(var3, 0, var1 - 1);
					class182.method3997(var3, var1, var2 - 1);
				} else if (var0.field5288 == class563.field5594) {
					long[] var4 = var0.method9973();
					class177.method3966(var4, 0, var2 - 1);
					class177.method3966(var4, 0, var1 - 1);
					class177.method3966(var4, var1, var2 - 1);
				} else {
					Object[] var5 = var0.method9936();
					World.method1454(var5, 0, var2 - 1);
					World.method1454(var5, 0, var1 - 1);
					World.method1454(var5, var1, var2 - 1);
				}

			}
		}
	}
}
