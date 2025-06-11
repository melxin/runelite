import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
public enum class67 implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	field913(0, -1),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	field919(1, 1),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	field914(2, 7),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	field915(3, 8),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	field916(4, 9);

	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 2016519583
	)
	final int field920;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 656946615
	)
	final int field918;

	class67(int var3, int var4) {
		this.field920 = var3;
		this.field918 = var4;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "26"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field918;
	}
}
