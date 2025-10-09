import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tn")
public enum class516 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ltn;"
	)
	field5567(0, 0),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ltn;"
	)
	field5563(1, 1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ltn;"
	)
	field5564(2, 2);

	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -579979599
	)
	final int field5562;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1063719853
	)
	final int field5566;

	class516(int var3, int var4) {
		this.field5562 = var3;
		this.field5566 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1012656358"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5566;
	}
}
