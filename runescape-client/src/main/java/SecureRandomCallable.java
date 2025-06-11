import java.security.SecureRandom;
import java.util.concurrent.Callable;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ci")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
	@ObfuscatedName("as")
	static int[][][] field862;

	SecureRandomCallable() {
	}

	public Object call() {
		SecureRandom var2 = new SecureRandom();
		var2.nextInt();
		return var2;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lre;I)Lre;",
		garbageValue = "69677009"
	)
	public static class445 method2080(class445 var0) {
		synchronized(class445.field4963) {
			if (GrandExchangeOfferNameComparator.field4812 == 0) {
				return new class445(var0);
			} else {
				class445.field4963[--GrandExchangeOfferNameComparator.field4812].method8689(var0);
				return class445.field4963[GrandExchangeOfferNameComparator.field4812];
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([[[IIIII)V",
		garbageValue = "1331701651"
	)
	static final void method2078(int[][][] var0, int var1, int var2, int var3) {
		int var4;
		for (var4 = 0; var4 < 8; ++var4) {
			for (int var5 = 0; var5 < 8; ++var5) {
				var0[var1][var4 + var2][var3 + var5] = 0;
			}
		}

		if (var2 > 0) {
			for (var4 = 1; var4 < 8; ++var4) {
				var0[var1][var2][var3 + var4] = var0[var1][var2 - 1][var3 + var4];
			}
		}

		if (var3 > 0) {
			for (var4 = 1; var4 < 8; ++var4) {
				var0[var1][var4 + var2][var3] = var0[var1][var4 + var2][var3 - 1];
			}
		}

		if (var2 > 0 && var0[var1][var2 - 1][var3] != 0) {
			var0[var1][var2][var3] = var0[var1][var2 - 1][var3];
		} else if (var3 > 0 && var0[var1][var2][var3 - 1] != 0) {
			var0[var1][var2][var3] = var0[var1][var2][var3 - 1];
		} else if (var2 > 0 && var3 > 0 && var0[var1][var2 - 1][var3 - 1] != 0) {
			var0[var1][var2][var3] = var0[var1][var2 - 1][var3 - 1];
		}

	}
}
