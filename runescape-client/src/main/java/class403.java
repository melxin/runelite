import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pp")
public class class403 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IZI)[B",
		garbageValue = "1862088618"
	)
	@Export("ByteArrayPool_getArrayBool")
	public static byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
		synchronized(ByteArrayPool.field5317) {
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

			if ((var0 == 30000 || var0 < 30000 && var1) && ByteArrayPool.field5321 > 0) {
				var3 = ByteArrayPool.field5328[--ByteArrayPool.field5321];
				ByteArrayPool.field5328[ByteArrayPool.field5321] = null;
				return var3;
			}

			int var6;
			if (class67.ByteArrayPool_arrays != null) {
				for (var6 = 0; var6 < ByteArrayPool.ByteArrayPool_alternativeSizes.length; ++var6) {
					if ((ByteArrayPool.ByteArrayPool_alternativeSizes[var6] == var0 || var0 < ByteArrayPool.ByteArrayPool_alternativeSizes[var6] && var1) && FadeInTask.ByteArrayPool_altSizeArrayCounts[var6] > 0) {
						byte[] var4 = class67.ByteArrayPool_arrays[var6][--FadeInTask.ByteArrayPool_altSizeArrayCounts[var6]];
						class67.ByteArrayPool_arrays[var6][FadeInTask.ByteArrayPool_altSizeArrayCounts[var6]] = null;
						return var4;
					}
				}
			}

			if (var1 && ByteArrayPool.ByteArrayPool_alternativeSizes != null) {
				for (var6 = 0; var6 < ByteArrayPool.ByteArrayPool_alternativeSizes.length; ++var6) {
					if (var0 <= ByteArrayPool.ByteArrayPool_alternativeSizes[var6] && FadeInTask.ByteArrayPool_altSizeArrayCounts[var6] < class67.ByteArrayPool_arrays[var6].length) {
						return new byte[ByteArrayPool.ByteArrayPool_alternativeSizes[var6]];
					}
				}
			}
		}

		return new byte[var0];
	}
}
