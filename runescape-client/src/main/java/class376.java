import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oc")
public class class376 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IZB)[B",
		garbageValue = "8"
	)
	@Export("ByteArrayPool_getArrayBool")
	public static byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
		synchronized(ByteArrayPool.field5107) {
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

			if ((var0 == 30000 || var0 < 30000 && var1) && ByteArrayPool.field5111 > 0) {
				var3 = ByteArrayPool.field5119[--ByteArrayPool.field5111];
				ByteArrayPool.field5119[ByteArrayPool.field5111] = null;
				return var3;
			}

			int var6;
			if (PlayerUpdateManager.ByteArrayPool_arrays != null) {
				for (var6 = 0; var6 < class63.ByteArrayPool_alternativeSizes.length; ++var6) {
					if ((class63.ByteArrayPool_alternativeSizes[var6] == var0 || var0 < class63.ByteArrayPool_alternativeSizes[var6] && var1) && WorldMapDecoration.ByteArrayPool_altSizeArrayCounts[var6] > 0) {
						byte[] var4 = PlayerUpdateManager.ByteArrayPool_arrays[var6][--WorldMapDecoration.ByteArrayPool_altSizeArrayCounts[var6]];
						PlayerUpdateManager.ByteArrayPool_arrays[var6][WorldMapDecoration.ByteArrayPool_altSizeArrayCounts[var6]] = null;
						return var4;
					}
				}
			}

			if (var1 && class63.ByteArrayPool_alternativeSizes != null) {
				for (var6 = 0; var6 < class63.ByteArrayPool_alternativeSizes.length; ++var6) {
					if (var0 <= class63.ByteArrayPool_alternativeSizes[var6] && WorldMapDecoration.ByteArrayPool_altSizeArrayCounts[var6] < PlayerUpdateManager.ByteArrayPool_arrays[var6].length) {
						return new byte[class63.ByteArrayPool_alternativeSizes[var6]];
					}
				}
			}
		}

		return new byte[var0];
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/String;I)Ltp;",
		garbageValue = "1985635628"
	)
	static class509 method7915(Object var0, String var1) {
		if (var0 == null) {
			throw new RuntimeException();
		} else {
			return (class509)var0;
		}
	}
}
