import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sm")
public enum class492 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lsm;"
	)
	field5095(0, 0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lsm;"
	)
	field5090(1, 1),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lsm;"
	)
	field5091(2, 2);

	@ObfuscatedName("jt")
	@ObfuscatedGetter(
		intValue = 1114271039
	)
	static int field5089;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1929680873
	)
	final int field5092;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 517868397
	)
	final int field5093;

	class492(int var3, int var4) {
		this.field5092 = var3;
		this.field5093 = var4;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1071289392"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5093;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1452060905"
	)
	public static final boolean method9312(char var0) {
		return var0 == 160 || var0 == ' ' || var0 == '_' || var0 == '-';
	}
}
