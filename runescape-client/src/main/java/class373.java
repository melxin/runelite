import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("os")
public enum class373 implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	field4146(0),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	field4145(1),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	field4147(2),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	field4151(3),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	field4149(4);

	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1227401437
	)
	final int field4150;

	class373(int var3) {
		this.field4150 = var3;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "26"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4150;
	}
}
