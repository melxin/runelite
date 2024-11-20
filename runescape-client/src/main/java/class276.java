import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kn")
public class class276 {
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "Lpw;"
	)
	@Export("clientLanguage")
	static Language clientLanguage;

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILsr;Loa;B)V",
		garbageValue = "-79"
	)
	static void method5742(int var0, ArchiveDisk var1, Archive var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction();
		var3.type = 1;
		var3.key = (long)var0;
		var3.archiveDisk = var1;
		var3.archive = var2;
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3);
		}

		class278.method5768();
	}
}
