import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jr")
public class class239 {
	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2023213963"
	)
	static int method5520() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
			int var0 = 0;

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) {
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount;
			}

			return var0 * 10000 / Client.field520;
		} else {
			return 10000;
		}
	}
}
