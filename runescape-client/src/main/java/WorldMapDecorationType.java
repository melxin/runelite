import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ou")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements Enum {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4365(0, 0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4342(1, 0),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4345(2, 0),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4355(3, 0),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4360(9, 2),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4348(4, 1),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4363(5, 1),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4347(6, 1),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4349(7, 1),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4350(8, 1),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4351(12, 2),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4352(13, 2),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4341(14, 2),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4354(15, 2),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4343(16, 2),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4356(17, 2),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4357(18, 2),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4358(19, 2),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4359(20, 2),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4346(21, 2),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4361(10, 2),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4362(11, 2),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4344(22, 3);

	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -93451035
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1935172756"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("pd")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "66"
	)
	static void method8170(int var0) {
		Client.oculusOrbState = var0;
	}
}
