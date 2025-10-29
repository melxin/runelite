import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ou")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements Enum {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4406(0, 0),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4391(1, 0),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4405(2, 0),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4389(3, 0),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4402(9, 2),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4390(4, 1),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4392(5, 1),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4393(6, 1),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4394(7, 1),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4395(8, 1),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4396(12, 2),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4397(13, 2),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4398(14, 2),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4399(15, 2),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4400(16, 2),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4386(17, 2),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4409(18, 2),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4403(19, 2),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4404(20, 2),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4410(21, 2),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4387(10, 2),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4407(11, 2),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	field4408(22, 3);

	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -13030657
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "20"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("pf")
	@ObfuscatedSignature(
		descriptor = "(IB)Lwu;",
		garbageValue = "30"
	)
	@Export("getDbTable2")
	static DbTable getDbTable2(int var0) {
		DbTable var1 = (DbTable)Client.archive11.get((long)var0);
		if (var1 == null) {
			var1 = new DbTable(class136.field1619, var0);
		}

		return var1;
	}
}
