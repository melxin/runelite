import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("om")
public enum class371 implements Enum {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	field4129(0),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	field4127(1),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	field4128(2),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	field4126(3),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	field4130(4);

	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -2139712763
	)
	final int field4131;

	class371(int var3) {
		this.field4131 = var3;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1746725635"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4131;
	}
}
