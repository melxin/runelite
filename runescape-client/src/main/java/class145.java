import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fe")
public enum class145 implements Enum {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	field1729(0, 0),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	field1719(1, 1),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	field1718(2, 2),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	field1721(3, 3),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	field1724(4, 4),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	field1723(5, 5),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	field1720(6, 6),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	field1725(7, 7),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	field1722(8, 8);

	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 491931287
	)
	final int field1727;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1045052555
	)
	final int field1728;

	class145(int var3, int var4) {
		this.field1727 = var3;
		this.field1728 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-164877066"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1728;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "968972810"
	)
	public static void method3740(AbstractArchive var0) {
		StructComposition.StructDefinition_archive = var0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "411524027"
	)
	@Export("isWorldMapEvent")
	public static boolean isWorldMapEvent(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17;
	}
}
