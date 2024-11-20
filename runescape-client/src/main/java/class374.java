import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oy")
public class class374 {
	@ObfuscatedName("ao")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("ItemDefinition_archive")
	static AbstractArchive ItemDefinition_archive;

	static {
		Math.sqrt(8192.0D);
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-64986648"
	)
	static final void method7462() {
		Iterator var0 = Client.worldViewManager.iterator();

		while (var0.hasNext()) {
			WorldView var1 = (WorldView)var0.next();

			for (int var2 = 0; var2 < var1.npcCount; ++var2) {
				int var3 = var1.npcIndices[var2];
				NPC var4 = var1.npcs[var3];
				if (var4 != null) {
					class36.updateActorSequence(var1, var4, var4.definition.size);
				}
			}
		}

	}
}
