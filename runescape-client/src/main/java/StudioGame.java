import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ol")
@Implements("StudioGame")
public enum StudioGame implements Enum {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("ae")
	@Export("name")
	public final String name;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -157847499
	)
	@Export("id")
	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3;
		this.id = var5;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "118"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}
}
