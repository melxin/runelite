import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fa")
public enum class133 implements Enum {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lfa;"
	)
	field1564(0, 0),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfa;"
	)
	field1574(1, 1),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lfa;"
	)
	field1566(2, 2),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lfa;"
	)
	field1567(3, 3),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lfa;"
	)
	field1568(4, 4);

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	static Archive field1576;
	@ObfuscatedName("lh")
	@ObfuscatedGetter(
		intValue = 874950553
	)
	static int field1571;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -197460785
	)
	final int field1569;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1956155933
	)
	final int field1570;

	class133(int var3, int var4) {
		this.field1569 = var3;
		this.field1570 = var4;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1746725635"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1570;
	}
}
