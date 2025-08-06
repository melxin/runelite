import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tx")
public enum class514 implements Enum {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ltx;"
	)
	field5396(0, 0),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ltx;"
	)
	field5394(1, 1),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ltx;"
	)
	field5397(2, 2);

	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1884540943
	)
	final int field5395;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 829133917
	)
	final int field5393;

	class514(int var3, int var4) {
		this.field5395 = var3;
		this.field5393 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-164877066"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5393;
	}
}
