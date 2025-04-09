import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oi")
@Implements("StudioGame")
public enum StudioGame implements Enum {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "[Lws;"
	)
	static IndexedSprite[] field4210;
	@ObfuscatedName("av")
	@Export("name")
	public final String name;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -523599407
	)
	@Export("id")
	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3;
		this.id = var5;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1746725635"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}
}
