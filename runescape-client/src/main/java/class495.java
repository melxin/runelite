import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tl")
public enum class495 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	field5121(0, 1),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	field5117(2, 2),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	field5119(3, 3),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	field5118(1, 10);

	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1610172327
	)
	final int field5120;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1461422635
	)
	final int field5116;

	class495(int var3, int var4) {
		this.field5120 = var3;
		this.field5116 = var4;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1071289392"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5116;
	}
}
