import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tl")
public enum class495 implements Enum {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	field5119(2, 1),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	field5125(0, 2),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	field5121(3, 3),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	field5122(1, 10);

	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1090014637
	)
	final int field5123;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1936807073
	)
	final int field5124;

	class495(int var3, int var4) {
		this.field5123 = var3;
		this.field5124 = var4;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "118"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5124;
	}
}
