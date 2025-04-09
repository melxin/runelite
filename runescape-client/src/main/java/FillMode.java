import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wo")
@Implements("FillMode")
public enum FillMode implements Enum {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lwo;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lwo;"
	)
	field5680(1, 1),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lwo;"
	)
	field5678(2, 2);

	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 846736685
	)
	public final int field5677;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 388456139
	)
	final int field5681;

	FillMode(int var3, int var4) {
		this.field5677 = var3;
		this.field5681 = var4;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1746725635"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5681;
	}
}
