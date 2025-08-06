import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fa")
public class class138 implements Enum {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfa;"
	)
	static final class138 field1664;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lfa;"
	)
	static final class138 field1663;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfa;"
	)
	static final class138 field1666;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lfa;"
	)
	static final class138 field1662;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lfa;"
	)
	static final class138 field1659;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lfa;"
	)
	static final class138 field1661;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -578946483
	)
	final int field1665;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 700960751
	)
	final int field1660;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1108192843
	)
	final int field1667;

	static {
		field1664 = new class138(0, 0, (String)null, 0);
		field1663 = new class138(1, 1, (String)null, 9);
		field1666 = new class138(2, 2, (String)null, 3);
		field1662 = new class138(3, 3, (String)null, 6);
		field1659 = new class138(4, 4, (String)null, 1);
		field1661 = new class138(5, 5, (String)null, 3);
	}

	class138(int var1, int var2, String var3, int var4) {
		this.field1665 = var1;
		this.field1660 = var2;
		this.field1667 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-164877066"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1660;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "87"
	)
	int method3677() {
		return this.field1667;
	}
}
