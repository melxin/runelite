import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fk")
public class class138 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	static final class138 field1675;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	static final class138 field1681;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	static final class138 field1677;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	static final class138 field1678;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	static final class138 field1684;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	static final class138 field1680;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1738143935
	)
	final int field1679;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -505680525
	)
	final int field1686;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1220513153
	)
	final int field1683;

	static {
		field1675 = new class138(0, 0, (String)null, 0);
		field1681 = new class138(1, 1, (String)null, 9);
		field1677 = new class138(2, 2, (String)null, 3);
		field1678 = new class138(3, 3, (String)null, 6);
		field1684 = new class138(4, 4, (String)null, 1);
		field1680 = new class138(5, 5, (String)null, 3);
	}

	class138(int var1, int var2, String var3, int var4) {
		this.field1679 = var1;
		this.field1686 = var2;
		this.field1683 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1012656358"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1686;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-12173"
	)
	int method3796() {
		return this.field1683;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1726518124"
	)
	public static int method3798(int var0) {
		return var0 >> 3 & 2047;
	}
}
