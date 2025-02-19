import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oa")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	field4131(0, 0),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	field4117(1, 0),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	field4118(2, 0),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	field4135(3, 0),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	field4120(9, 2),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	field4121(4, 1),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	field4134(5, 1),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	field4123(6, 1),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	field4122(7, 1),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	field4125(8, 1),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	field4119(12, 2),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	field4127(13, 2),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	field4124(14, 2),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	field4129(15, 2),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	field4130(16, 2),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	field4138(17, 2),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	field4132(18, 2),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	field4133(19, 2),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	field4116(20, 2),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	field4126(21, 2),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	field4136(10, 2),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	field4137(11, 2),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	field4128(22, 3);

	@ObfuscatedName("em")
	@ObfuscatedGetter(
		longValue = 3714856338632891285L
	)
	static long field4140;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1494297697
	)
	@Export("id")
	public final int id;

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "0"
	)
	WorldMapDecorationType(int var3, int var4) {
		this.id = var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "32"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}
}
