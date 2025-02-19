import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hh")
@Implements("VerticalAlignment")
public enum VerticalAlignment implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	field2090(2, 0),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	@Export("VerticalAlignment_centered")
	VerticalAlignment_centered(0, 1),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	field2086(1, 2);

	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1276552817
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1985848733
	)
	@Export("id")
	final int id;

	VerticalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "32"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}
}
