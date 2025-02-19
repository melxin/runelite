import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fq")
public class class137 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	static final class137 field1631;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	static final class137 field1632;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	static final class137 field1633;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	static final class137 field1639;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	static final class137 field1634;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	static final class137 field1636;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 675036277
	)
	final int field1637;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -59490023
	)
	final int field1635;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -825173087
	)
	final int field1638;

	static {
		field1631 = new class137(0, 0, (String)null, 0);
		field1632 = new class137(1, 1, (String)null, 9);
		field1633 = new class137(2, 2, (String)null, 3);
		field1639 = new class137(3, 3, (String)null, 6);
		field1634 = new class137(4, 4, (String)null, 1);
		field1636 = new class137(5, 5, (String)null, 3);
	}

	class137(int var1, int var2, String var3, int var4) {
		this.field1637 = var1;
		this.field1635 = var2;
		this.field1638 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "32"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1635;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "425681241"
	)
	int method3378() {
		return this.field1638;
	}
}
