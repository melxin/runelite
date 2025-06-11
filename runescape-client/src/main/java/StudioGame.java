import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("on")
@Implements("StudioGame")
public enum StudioGame implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("aa")
	@Export("name")
	public final String name;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -785234773
	)
	@Export("id")
	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3;
		this.id = var5;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "26"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("mt")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "399227565"
	)
	static boolean method7935(int var0) {
		for (int var1 = 0; var1 < Client.field432; ++var1) {
			if (Client.field425[var1] == var0) {
				return true;
			}
		}

		return false;
	}
}
