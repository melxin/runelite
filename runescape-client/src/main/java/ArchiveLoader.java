import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cg")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -368061863
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 476993049
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		descriptor = "(Lpu;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0;
		this.archive = var1;
		this.groupCount = var1.getGroupCount();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-75"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0;

		for (int var1 = 0; var1 < this.groupCount; ++var1) {
			if (!this.archive.method8039(var1) || this.archive.method8040(var1)) {
				++this.loadedCount;
			}
		}

		return this.loadedCount >= this.groupCount;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "1196147180"
	)
	@Export("ByteArrayPool_release")
	public static void ByteArrayPool_release(byte[] var0) {
		synchronized(ByteArrayPool.field5107) {
			if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < ByteArrayPool.field5109) {
				ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0;
			} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < ByteArrayPool.field5121) {
				ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0;
			} else if (var0.length == 10000 && ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.field5112) {
				ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0;
			} else if (var0.length == 30000 && ByteArrayPool.field5111 < ByteArrayPool.field5115) {
				ByteArrayPool.field5119[++ByteArrayPool.field5111 - 1] = var0;
			} else {
				if (PlayerUpdateManager.ByteArrayPool_arrays != null) {
					for (int var2 = 0; var2 < class63.ByteArrayPool_alternativeSizes.length; ++var2) {
						if (var0.length == class63.ByteArrayPool_alternativeSizes[var2] && WorldMapDecoration.ByteArrayPool_altSizeArrayCounts[var2] < PlayerUpdateManager.ByteArrayPool_arrays[var2].length) {
							PlayerUpdateManager.ByteArrayPool_arrays[var2][WorldMapDecoration.ByteArrayPool_altSizeArrayCounts[var2]++] = var0;
							return;
						}
					}
				}

			}
		}
	}
}
