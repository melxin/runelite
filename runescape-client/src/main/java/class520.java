import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ud")
public enum class520 implements Enum {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	field5438(1, 1),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	field5443(0, 2),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	field5439(3, 3),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	field5441(2, 10);

	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1420049307
	)
	final int field5442;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1024406637
	)
	final int field5440;

	class520(int var3, int var4) {
		this.field5442 = var3;
		this.field5440 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-164877066"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5440;
	}
}
