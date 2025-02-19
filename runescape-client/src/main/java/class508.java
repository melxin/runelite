import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ta")
public enum class508 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lta;"
	)
	field5241(3, 1),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lta;"
	)
	field5238(1, 2),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lta;"
	)
	field5239(2, 3),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lta;"
	)
	field5240(0, 10);

	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -274123967
	)
	final int field5237;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -329723191
	)
	final int field5242;

	class508(int var3, int var4) {
		this.field5237 = var3;
		this.field5242 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "32"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5242;
	}
}
