import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fw")
public class class139 implements Enum {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	static final class139 field1670;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	static final class139 field1689;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	static final class139 field1671;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	static final class139 field1672;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	static final class139 field1673;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	static final class139 field1685;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	static final class139 field1675;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	static final class139 field1676;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	static final class139 field1677;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	static final class139 field1669;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	static final class139 field1679;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	static final class139 field1680;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	static final class139 field1681;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	static final class139 field1682;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	static final class139 field1683;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	static final class139 field1684;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	static final class139 field1690;
	@ObfuscatedName("if")
	static Iterator field1674;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1454831071
	)
	final int field1678;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1452172589
	)
	final int field1687;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1985932271
	)
	final int field1688;

	static {
		field1670 = new class139(0, 0, (String)null, -1, -1);
		field1689 = new class139(1, 1, (String)null, 0, 2);
		field1671 = new class139(2, 2, (String)null, 1, 2);
		field1672 = new class139(3, 3, (String)null, 2, 2);
		field1673 = new class139(4, 4, (String)null, 3, 1);
		field1685 = new class139(5, 5, (String)null, 4, 1);
		field1675 = new class139(6, 6, (String)null, 5, 1);
		field1676 = new class139(7, 7, (String)null, 6, 3);
		field1677 = new class139(8, 8, (String)null, 7, 3);
		field1669 = new class139(9, 9, (String)null, 8, 3);
		field1679 = new class139(10, 10, (String)null, 0, 7);
		field1680 = new class139(11, 11, (String)null, 1, 7);
		field1681 = new class139(12, 12, (String)null, 2, 7);
		field1682 = new class139(13, 13, (String)null, 3, 7);
		field1683 = new class139(14, 14, (String)null, 4, 7);
		field1684 = new class139(15, 15, (String)null, 5, 7);
		field1690 = new class139(16, 16, (String)null, 0, 5);
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;II)V",
		garbageValue = "-1"
	)
	class139(int var1, int var2, String var3, int var4, int var5) {
		this.field1678 = var1;
		this.field1687 = var2;
		this.field1688 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-164877066"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1687;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1797177405"
	)
	int method3689() {
		return this.field1688;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lwj;II)V",
		garbageValue = "750264998"
	)
	public static void method3697(Buffer var0, int var1) {
		if (JagexCache.JagexCache_randomDat != null) {
			try {
				JagexCache.JagexCache_randomDat.seek(0L);
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24);
			} catch (Exception var3) {
			}
		}

	}
}
