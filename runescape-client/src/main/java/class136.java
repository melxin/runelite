import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fs")
public enum class136 implements Enum {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	field1647(0, 0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	field1641(1, 1),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	field1642(2, 2),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	field1643(3, 3),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	field1644(4, 4);

	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -984888973
	)
	final int field1645;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -434289387
	)
	final int field1646;

	class136(int var3, int var4) {
		this.field1645 = var3;
		this.field1646 = var4;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1935172756"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1646;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1792283733"
	)
	@Export("ItemContainer_getCount")
	static int ItemContainer_getCount(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0;
		}
	}
}
