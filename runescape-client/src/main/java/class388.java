import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ok")
public enum class388 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	field4565(0),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	field4566(1),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	field4567(2),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	field4569(3);

	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1147894731
	)
	public final int field4568;

	class388(int var3) {
		this.field4568 = var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "32"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4568;
	}
}
