import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hf")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lhf;"
	)
	field1973(0, 0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lhf;"
	)
	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(2, 1),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lhf;"
	)
	field1971(1, 2);

	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1209226381
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1293836899
	)
	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1071289392"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}
}
