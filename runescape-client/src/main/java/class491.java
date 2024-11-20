import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("se")
public enum class491 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lse;"
	)
	field5083(0, 0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lse;"
	)
	field5084(1, 1),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lse;"
	)
	field5085(2, 2);

	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1313417221
	)
	final int field5086;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 325432497
	)
	final int field5087;

	class491(int var3, int var4) {
		this.field5086 = var3;
		this.field5087 = var4;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1071289392"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5087;
	}
}
