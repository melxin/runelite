import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ou")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4175(0, 0),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4153(1, 0),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4154(2, 0),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4155(3, 0),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4160(9, 2),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4157(4, 1),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4158(5, 1),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4159(6, 1),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4167(7, 1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4166(8, 1),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4162(12, 2),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4152(13, 2),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4164(14, 2),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4168(15, 2),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4165(16, 2),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4163(17, 2),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4173(18, 2),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4169(19, 2),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4170(20, 2),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4171(21, 2),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4172(10, 2),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4161(11, 2),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4174(22, 3);

	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1095876367
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "26"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}
}
