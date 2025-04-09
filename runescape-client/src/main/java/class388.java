import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oe")
public enum class388 implements Enum {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	field4592(0),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	field4587(1),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	field4588(2),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	field4586(3);

	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1443041759
	)
	public final int field4590;

	class388(int var3) {
		this.field4590 = var3;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1746725635"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4590;
	}
}
