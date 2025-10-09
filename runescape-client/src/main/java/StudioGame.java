import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oh")
@Implements("StudioGame")
public enum StudioGame implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("la")
	@ObfuscatedGetter(
		intValue = -285801757
	)
	@Export("js5Port")
	static int js5Port;
	@ObfuscatedName("ae")
	@Export("name")
	public final String name;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 216444163
	)
	@Export("id")
	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3;
		this.id = var5;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1012656358"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1852210111"
	)
	static final void method8201() {
		if (class135.pcmPlayer1 != null) {
			class135.pcmPlayer1.run();
		}

	}
}
