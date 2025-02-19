import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fr")
public class class131 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -58572205
	)
	int field1564;
	@ObfuscatedName("ay")
	float field1563;
	@ObfuscatedName("au")
	float field1560;
	@ObfuscatedName("ad")
	float field1561;
	@ObfuscatedName("ah")
	float field1562;
	@ObfuscatedName("ac")
	float field1565;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	class131 field1566;

	class131() {
		this.field1560 = Float.MAX_VALUE;
		this.field1561 = Float.MAX_VALUE;
		this.field1562 = Float.MAX_VALUE;
		this.field1565 = Float.MAX_VALUE;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvy;II)V",
		garbageValue = "687857728"
	)
	void method3269(Buffer var1, int var2) {
		this.field1564 = var1.readShort();
		this.field1563 = var1.method10354();
		this.field1560 = var1.method10354();
		this.field1561 = var1.method10354();
		this.field1562 = var1.method10354();
		this.field1565 = var1.method10354();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-765403087"
	)
	public static void method3273(int var0, int var1) {
		VarbitComposition var2 = ArchiveDisk.method9483(var0);
		int var3 = var2.baseVar;
		int var4 = var2.startBit;
		int var5 = var2.endBit;
		int var6 = Varps.Varps_masks[var5 - var4];
		if (var1 < 0 || var1 > var6) {
			var1 = 0;
		}

		var6 <<= var4;
		Varps.Varps_main[var3] = Varps.Varps_main[var3] & ~var6 | var1 << var4 & var6;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "2340"
	)
	static int method3274(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return 0;
		} else if (var1 == -1) {
			return 0;
		} else {
			int var3 = 0;

			for (int var4 = 0; var4 < var2.quantities.length; ++var4) {
				if (var2.ids[var4] == var1) {
					var3 += var2.quantities[var4];
				}
			}

			return var3;
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ILdy;ZI)I",
		garbageValue = "1519303876"
	)
	static int method3272(int var0, Script var1, boolean var2) {
		return 2;
	}
}
