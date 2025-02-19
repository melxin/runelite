import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pr")
@Implements("GrandExchangeOfferWorldComparator")
final class GrandExchangeOfferWorldComparator implements Comparator {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpx;Lpx;I)I",
		garbageValue = "-1672424588"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.world < var2.world ? -1 : (var2.world == var1.world ? 0 : 1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IZI)[B",
		garbageValue = "1766084845"
	)
	@Export("ByteArrayPool_getArrayBool")
	public static byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
		synchronized(ByteArrayPool.field5049) {
			byte[] var3;
			if ((var0 == 100 || var0 < 100 && var1) && ByteArrayPool.ByteArrayPool_smallCount > 0) {
				var3 = ByteArrayPool.ByteArrayPool_small[--ByteArrayPool.ByteArrayPool_smallCount];
				ByteArrayPool.ByteArrayPool_small[ByteArrayPool.ByteArrayPool_smallCount] = null;
				return var3;
			}

			if ((var0 == 5000 || var0 < 5000 && var1) && ByteArrayPool.ByteArrayPool_mediumCount > 0) {
				var3 = ByteArrayPool.ByteArrayPool_medium[--ByteArrayPool.ByteArrayPool_mediumCount];
				ByteArrayPool.ByteArrayPool_medium[ByteArrayPool.ByteArrayPool_mediumCount] = null;
				return var3;
			}

			if ((var0 == 10000 || var0 < 10000 && var1) && ByteArrayPool.ByteArrayPool_largeCount > 0) {
				var3 = ByteArrayPool.ByteArrayPool_large[--ByteArrayPool.ByteArrayPool_largeCount];
				ByteArrayPool.ByteArrayPool_large[ByteArrayPool.ByteArrayPool_largeCount] = null;
				return var3;
			}

			if ((var0 == 30000 || var0 < 30000 && var1) && ByteArrayPool.field5046 > 0) {
				var3 = ByteArrayPool.field5061[--ByteArrayPool.field5046];
				ByteArrayPool.field5061[ByteArrayPool.field5046] = null;
				return var3;
			}

			int var6;
			if (class172.ByteArrayPool_arrays != null) {
				for (var6 = 0; var6 < Login.ByteArrayPool_alternativeSizes.length; ++var6) {
					if ((Login.ByteArrayPool_alternativeSizes[var6] == var0 || var0 < Login.ByteArrayPool_alternativeSizes[var6] && var1) && AddRequestTask.ByteArrayPool_altSizeArrayCounts[var6] > 0) {
						byte[] var4 = class172.ByteArrayPool_arrays[var6][--AddRequestTask.ByteArrayPool_altSizeArrayCounts[var6]];
						class172.ByteArrayPool_arrays[var6][AddRequestTask.ByteArrayPool_altSizeArrayCounts[var6]] = null;
						return var4;
					}
				}
			}

			if (var1 && Login.ByteArrayPool_alternativeSizes != null) {
				for (var6 = 0; var6 < Login.ByteArrayPool_alternativeSizes.length; ++var6) {
					if (var0 <= Login.ByteArrayPool_alternativeSizes[var6] && AddRequestTask.ByteArrayPool_altSizeArrayCounts[var6] < class172.ByteArrayPool_arrays[var6].length) {
						return new byte[Login.ByteArrayPool_alternativeSizes[var6]];
					}
				}
			}
		}

		return new byte[var0];
	}
}
