import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lo")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	static final WorldMapID field3478;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	static final WorldMapID field3481;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 992813529
	)
	@Export("value")
	final int value;

	static {
		field3478 = new WorldMapID(0);
		field3481 = new WorldMapID(1);
	}

	WorldMapID(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-932312060"
	)
	@Export("ByteArrayPool_release")
	public static void ByteArrayPool_release(byte[] var0) {
		synchronized(ByteArrayPool.field5369) {
			if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < ByteArrayPool.field5374) {
				ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0;
			} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < ByteArrayPool.field5373) {
				ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0;
			} else if (var0.length == 10000 && ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.field5376) {
				ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0;
			} else if (var0.length == 30000 && ByteArrayPool.field5383 < ByteArrayPool.field5377) {
				ByteArrayPool.field5381[++ByteArrayPool.field5383 - 1] = var0;
			} else {
				if (AbstractWorldMapData.ByteArrayPool_arrays != null) {
					for (int var2 = 0; var2 < WorldMapDecoration.ByteArrayPool_alternativeSizes.length; ++var2) {
						if (var0.length == WorldMapDecoration.ByteArrayPool_alternativeSizes[var2] && class159.ByteArrayPool_altSizeArrayCounts[var2] < AbstractWorldMapData.ByteArrayPool_arrays[var2].length) {
							AbstractWorldMapData.ByteArrayPool_arrays[var2][class159.ByteArrayPool_altSizeArrayCounts[var2]++] = var0;
							return;
						}
					}
				}

			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "92"
	)
	public static int method6845(int var0, int var1) {
		int var2 = var0 >>> 31;
		return (var0 + var2) / var1 - var2;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1914951288"
	)
	static final int method6843(int var0, int var1) {
		int var2 = PacketBufferNode.method7043(45365 + var0, var1 + 91923, 4) - 128 + (PacketBufferNode.method7043(var0 + 10294, var1 + 37821, 2) - 128 >> 1) + (PacketBufferNode.method7043(var0, var1, 1) - 128 >> 2);
		var2 = (int)((double)var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}
}
