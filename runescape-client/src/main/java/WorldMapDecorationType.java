import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("or")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	field4050(0, 0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	field4060(1, 0),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	field4067(2, 0),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	field4051(3, 0),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	field4052(9, 2),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	field4053(4, 1),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	field4054(5, 1),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	field4055(6, 1),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	field4056(7, 1),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	field4057(8, 1),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	field4066(12, 2),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	field4059(13, 2),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	field4048(14, 2),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	field4058(15, 2),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	field4062(16, 2),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	field4063(17, 2),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	field4064(18, 2),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	field4065(19, 2),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	field4072(20, 2),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	field4073(21, 2),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	field4068(10, 2),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	field4049(11, 2),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	field4070(22, 3);

	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -834131543
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1071289392"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}
}
