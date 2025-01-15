import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sn")
public enum class492 implements Enum {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lsn;"
	)
	field5095(0, 0),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lsn;"
	)
	field5092(1, 1),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lsn;"
	)
	field5094(2, 2);

	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1060015231
	)
	final int field5091;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1387065079
	)
	final int field5093;

	class492(int var3, int var4) {
		this.field5091 = var3;
		this.field5093 = var4;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "118"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5093;
	}
}
