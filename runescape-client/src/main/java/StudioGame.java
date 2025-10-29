import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pm")
@Implements("StudioGame")
public enum StudioGame implements Enum {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("ak")
	@Export("name")
	public final String name;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 809367525
	)
	@Export("id")
	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3;
		this.id = var5;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "20"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Lvu;",
		garbageValue = "2041145193"
	)
	public static class563 method8385() {
		synchronized(class563.field5834) {
			if (class563.field5836 == 0) {
				return new class563();
			} else {
				class563.field5834[--class563.field5836].method11223();
				return class563.field5834[class563.field5836];
			}
		}
	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "871960420"
	)
	static int method8389() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
			int var0 = 0;

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) {
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount;
			}

			return var0 * 10000 / Client.field555;
		} else {
			return 10000;
		}
	}
}
