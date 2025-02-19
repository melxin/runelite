import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tx")
public enum class505 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ltx;"
	)
	field5211(0, 0),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ltx;"
	)
	field5212(1, 1),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ltx;"
	)
	field5213(2, 2);

	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1626412837
	)
	final int field5214;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1294902217
	)
	final int field5215;

	class505(int var3, int var4) {
		this.field5214 = var3;
		this.field5215 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "32"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5215;
	}
}
