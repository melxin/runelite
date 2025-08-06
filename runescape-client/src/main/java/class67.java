import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cp")
public enum class67 implements Enum {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lcp;"
	)
	field908(0, -1),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lcp;"
	)
	field905(1, 2),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lcp;"
	)
	field904(2, 3),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lcp;"
	)
	field907(3, 4),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lcp;"
	)
	field910(4, 5),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lcp;"
	)
	field909(5, 6),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lcp;"
	)
	field913(6, 21);

	@ObfuscatedName("pk")
	@ObfuscatedGetter(
		intValue = -688904891
	)
	static int field906;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -2059355833
	)
	final int field911;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1871080511
	)
	final int field912;

	class67(int var3, int var4) {
		this.field911 = var3;
		this.field912 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-164877066"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field912;
	}

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "69"
	)
	static final boolean method2139() {
		return Client.isMenuOpen;
	}
}
