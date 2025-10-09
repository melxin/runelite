import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uo")
public enum class522 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Luo;"
	)
	field5612(1, 1),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Luo;"
	)
	field5614(0, 2),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Luo;"
	)
	field5611(2, 3),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Luo;"
	)
	field5617(3, 10);

	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -801016567
	)
	final int field5615;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 527176909
	)
	final int field5616;

	class522(int var3, int var4) {
		this.field5615 = var3;
		this.field5616 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1012656358"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5616;
	}
}
