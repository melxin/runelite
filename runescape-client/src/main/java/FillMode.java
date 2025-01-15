import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vb")
@Implements("FillMode")
public enum FillMode implements Enum {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lvb;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lvb;"
	)
	field5555(1, 1),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lvb;"
	)
	field5556(2, 2);

	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 166649643
	)
	public final int field5554;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -218930385
	)
	final int field5559;

	FillMode(int var3, int var4) {
		this.field5554 = var3;
		this.field5559 = var4;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "118"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5559;
	}
}
