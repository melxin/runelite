import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oe")
public enum class369 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	field4039(0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	field4046(1),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	field4041(2),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	field4042(3),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	field4047(4);

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "[Lvr;"
	)
	@Export("headIconHintSprites")
	static SpritePixels[] headIconHintSprites;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1774613483
	)
	final int field4044;

	class369(int var3) {
		this.field4044 = var3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1071289392"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4044;
	}
}
