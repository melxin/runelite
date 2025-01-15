import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jt")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements Enum {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	field2609(2, 0),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(0, 1),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	field2605(1, 2);

	@ObfuscatedName("uk")
	@ObfuscatedGetter(
		intValue = -374291309
	)
	static int field2603;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1606140245
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1784617127
	)
	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "118"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}
}
