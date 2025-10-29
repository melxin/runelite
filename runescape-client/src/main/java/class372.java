import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("om")
public class class372 {
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	@Export("soundSystem")
	static SoundSystem soundSystem;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -936277931
	)
	public int field4127;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 527385781
	)
	public int field4126;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1635834675
	)
	public int field4122;

	class372() {
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "-15"
	)
	@Export("ByteArrayPool_release")
	public static void ByteArrayPool_release(byte[] var0) {
		synchronized(ByteArrayPool.field5408) {
			if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < ByteArrayPool.field5404) {
				ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0;
			} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < ByteArrayPool.field5405) {
				ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0;
			} else if (var0.length == 10000 && ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.field5401) {
				ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0;
			} else if (var0.length == 30000 && ByteArrayPool.field5403 < ByteArrayPool.field5407) {
				ByteArrayPool.field5411[++ByteArrayPool.field5403 - 1] = var0;
			} else {
				if (ByteArrayPool.ByteArrayPool_arrays != null) {
					for (int var2 = 0; var2 < class451.ByteArrayPool_alternativeSizes.length; ++var2) {
						if (var0.length == class451.ByteArrayPool_alternativeSizes[var2] && class70.ByteArrayPool_altSizeArrayCounts[var2] < ByteArrayPool.ByteArrayPool_arrays[var2].length) {
							ByteArrayPool.ByteArrayPool_arrays[var2][class70.ByteArrayPool_altSizeArrayCounts[var2]++] = var0;
							return;
						}
					}
				}

			}
		}
	}
}
