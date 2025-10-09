import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ov")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	field4366(0, 0),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	field4354(1, 0),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	field4355(2, 0),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	field4368(3, 0),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	field4357(9, 2),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	field4358(4, 1),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	field4359(5, 1),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	field4353(6, 1),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	field4361(7, 1),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	field4356(8, 1),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	field4363(12, 2),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	field4362(13, 2),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	field4365(14, 2),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	field4370(15, 2),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	field4367(16, 2),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	field4373(17, 2),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	field4364(18, 2),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	field4360(19, 2),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	field4371(20, 2),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	field4372(21, 2),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	field4369(10, 2),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	field4374(11, 2),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	field4375(22, 3);

	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 398754503
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
		descriptor = "(I)I",
		garbageValue = "-1012656358"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}
}
