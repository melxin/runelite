import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ot")
@Implements("StudioGame")
public enum StudioGame implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("ao")
	@Export("name")
	public final String name;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 545446257
	)
	@Export("id")
	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3;
		this.id = var5;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "32"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/Socket;III)Ltj;",
		garbageValue = "-922044097"
	)
	public static AbstractSocket method7513(Socket var0, int var1, int var2) throws IOException {
		return new BufferedNetSocket(var0, var1, var2);
	}
}
