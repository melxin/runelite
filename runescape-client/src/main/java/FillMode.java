import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("va")
@Implements("FillMode")
public enum FillMode implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	field5550(1, 1),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	field5551(2, 2);

	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1632709435
	)
	public final int field5554;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 837777567
	)
	final int field5552;

	FillMode(int var3, int var4) {
		this.field5554 = var3;
		this.field5552 = var4;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1071289392"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5552;
	}
}
