import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mw")
public class class319 {
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		longValue = 504080126095839219L
	)
	static long field3313;

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1501922780"
	)
	public static int method6609() {
		return ViewportMouse.ViewportMouse_entityCount;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lpq;Ljava/lang/String;Ljava/lang/String;I)[Lvi;",
		garbageValue = "-1850059826"
	)
	@Export("getFont")
	public static IndexedSprite[] getFont(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) {
			return null;
		} else {
			int var3 = var0.getGroupId(var1);
			int var4 = var0.getFileId(var3, var2);
			return RestClientThreadFactory.method213(var0, var3, var4);
		}
	}

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1037305055"
	)
	static boolean method6610() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
			while (Client.archiveLoadersDone < Client.archiveLoaders.size()) {
				ArchiveLoader var0 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone);
				if (!var0.isLoaded()) {
					return false;
				}

				++Client.archiveLoadersDone;
			}

			return true;
		} else {
			return true;
		}
	}
}
