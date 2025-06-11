import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fx")
public class class138 implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	static final class138 field1648;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	static final class138 field1631;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	static final class138 field1632;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	static final class138 field1646;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	static final class138 field1651;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	static final class138 field1635;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	static final class138 field1636;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	static final class138 field1637;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	static final class138 field1638;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	static final class138 field1639;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	static final class138 field1643;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	static final class138 field1641;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	static final class138 field1642;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	static final class138 field1633;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	static final class138 field1644;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	static final class138 field1645;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	static final class138 field1630;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1341099061
	)
	final int field1647;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -807748075
	)
	final int field1640;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -500922697
	)
	final int field1649;

	static {
		field1648 = new class138(0, 0, (String)null, -1, -1);
		field1631 = new class138(1, 1, (String)null, 0, 2);
		field1632 = new class138(2, 2, (String)null, 1, 2);
		field1646 = new class138(3, 3, (String)null, 2, 2);
		field1651 = new class138(4, 4, (String)null, 3, 1);
		field1635 = new class138(5, 5, (String)null, 4, 1);
		field1636 = new class138(6, 6, (String)null, 5, 1);
		field1637 = new class138(7, 7, (String)null, 6, 3);
		field1638 = new class138(8, 8, (String)null, 7, 3);
		field1639 = new class138(9, 9, (String)null, 8, 3);
		field1643 = new class138(10, 10, (String)null, 0, 7);
		field1641 = new class138(11, 11, (String)null, 1, 7);
		field1642 = new class138(12, 12, (String)null, 2, 7);
		field1633 = new class138(13, 13, (String)null, 3, 7);
		field1644 = new class138(14, 14, (String)null, 4, 7);
		field1645 = new class138(15, 15, (String)null, 5, 7);
		field1630 = new class138(16, 16, (String)null, 0, 5);
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;II)V",
		garbageValue = "-1"
	)
	class138(int var1, int var2, String var3, int var4, int var5) {
		this.field1647 = var1;
		this.field1640 = var2;
		this.field1649 = var4;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "26"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1640;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2132884134"
	)
	int method3571() {
		return this.field1649;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "0"
	)
	public static boolean method3579(int var0, int var1) {
		return (var0 >> var1 & 1) != 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)[Lcf;",
		garbageValue = "-1908652494"
	)
	static class67[] method3583() {
		return new class67[]{class67.field914, class67.field913, class67.field919, class67.field915, class67.field916};
	}
}
