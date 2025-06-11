import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tz")
public enum class508 implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ltz;"
	)
	field5285(0, 0),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ltz;"
	)
	field5283(1, 1),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ltz;"
	)
	field5284(2, 2);

	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1859438597
	)
	final int field5282;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1177417485
	)
	final int field5286;

	class508(int var3, int var4) {
		this.field5282 = var3;
		this.field5286 = var4;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "26"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5286;
	}
}
