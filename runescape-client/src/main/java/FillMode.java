import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("xt")
@Implements("FillMode")
public enum FillMode implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lxt;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lxt;"
	)
	field6063(1, 1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lxt;"
	)
	field6064(2, 2);

	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1958220737
	)
	public final int field6065;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -2079850561
	)
	final int field6066;

	FillMode(int var3, int var4) {
		this.field6065 = var3;
		this.field6066 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1012656358"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field6066;
	}
}
