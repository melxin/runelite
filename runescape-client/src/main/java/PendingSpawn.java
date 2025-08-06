import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("co")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "Lxa;"
	)
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1456395569
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1766296153
	)
	@Export("type")
	int type;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 972494363
	)
	@Export("x")
	int x;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 869135519
	)
	@Export("y")
	int y;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1476764137
	)
	@Export("objectId")
	int objectId;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -921770871
	)
	int field1009;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1732958357
	)
	int field1017;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -54864075
	)
	int field1011;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -386578737
	)
	int field1012;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 443754663
	)
	int field1013;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 718836877
	)
	int field1003;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 987434791
	)
	@Export("delay")
	int delay;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 610803761
	)
	@Export("hitpoints")
	int hitpoints;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1165205569
	)
	int field1005;
	@ObfuscatedName("ar")
	String[] field1018;

	PendingSpawn() {
		this.delay = 0;
		this.hitpoints = -1;
		this.field1005 = 31;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-825324649"
	)
	void method2366(int var1) {
		this.field1005 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;B)V",
		garbageValue = "99"
	)
	void method2370(String[] var1) {
		this.field1018 = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1442066377"
	)
	boolean method2372(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1005 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "9"
	)
	boolean method2365(int var1) {
		return this.field1018 != null && var1 >= 0 && var1 < this.field1018.length && this.field1018[var1] != null;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IS)Ljava/lang/String;",
		garbageValue = "20960"
	)
	String method2369(int var1) {
		return this.field1018 != null && var1 >= 0 && var1 < this.field1018.length ? this.field1018[var1] : null;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "44"
	)
	@Export("itemContainerSetItem")
	static void itemContainerSetItem(int var0, int var1, int var2, int var3) {
		ItemContainer var4 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var4 == null) {
			var4 = new ItemContainer();
			ItemContainer.itemContainers.put(var4, (long)var0);
		}

		if (var4.ids.length <= var1) {
			int[] var5 = new int[var1 + 1];
			int[] var6 = new int[var1 + 1];

			int var7;
			for (var7 = 0; var7 < var4.ids.length; ++var7) {
				var5[var7] = var4.ids[var7];
				var6[var7] = var4.quantities[var7];
			}

			for (var7 = var4.ids.length; var7 < var1; ++var7) {
				var5[var7] = -1;
				var6[var7] = 0;
			}

			var4.ids = var5;
			var4.quantities = var6;
		}

		var4.ids[var1] = var2;
		var4.quantities[var1] = var3;
	}
}
