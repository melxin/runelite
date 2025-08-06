import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("op")
public class class383 {
	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(IZZZZI)Lpo;",
		garbageValue = "-1902656029"
	)
	@Export("newArchive")
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
		ArchiveDisk var5 = null;
		if (JagexCache.JagexCache_dat2File != null) {
			var5 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, class159.JagexCache_idxFiles[var0], 1000000);
		}

		return new Archive(var5, class406.masterDisk, HorizontalAlignment.field2060, var0, var1, var2, var3, var4, false);
	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(Ldj;IIIII)Lco;",
		garbageValue = "-1898374618"
	)
	static final PendingSpawn method8170(WorldView var0, int var1, int var2, int var3, int var4) {
		for (PendingSpawn var5 = (PendingSpawn)var0.pendingSpawns.last(); var5 != null; var5 = (PendingSpawn)var0.pendingSpawns.previous()) {
			if (var5.plane == var1 && var2 == var5.x && var3 == var5.y && var4 == var5.type) {
				return var5;
			}
		}

		return null;
	}
}
