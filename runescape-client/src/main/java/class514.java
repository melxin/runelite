import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tk")
public enum class514 implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ltk;"
	)
	field5330(2, 1),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ltk;"
	)
	field5329(3, 2),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ltk;"
	)
	field5331(1, 3),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ltk;"
	)
	field5332(0, 10);

	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1492923891
	)
	final int field5333;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -776657553
	)
	final int field5334;

	class514(int var3, int var4) {
		this.field5333 = var3;
		this.field5334 = var4;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "26"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5334;
	}
}
