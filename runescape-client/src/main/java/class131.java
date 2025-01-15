import java.awt.Component;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
public class class131 {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 59770549
	)
	int field1528;
	@ObfuscatedName("ah")
	float field1527;
	@ObfuscatedName("az")
	float field1531;
	@ObfuscatedName("ao")
	float field1529;
	@ObfuscatedName("ad")
	float field1530;
	@ObfuscatedName("an")
	float field1526;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	class131 field1532;

	class131() {
		this.field1531 = Float.MAX_VALUE;
		this.field1529 = Float.MAX_VALUE;
		this.field1530 = Float.MAX_VALUE;
		this.field1526 = Float.MAX_VALUE;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvy;II)V",
		garbageValue = "740982673"
	)
	void method3375(Buffer var1, int var2) {
		this.field1528 = var1.readShort();
		this.field1527 = var1.method10302();
		this.field1531 = var1.method10302();
		this.field1529 = var1.method10302();
		this.field1530 = var1.method10302();
		this.field1526 = var1.method10302();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "2033705331"
	)
	static void method3379(Component var0) {
		var0.addMouseListener(MouseHandler.MouseHandler_instance);
		var0.addMouseMotionListener(MouseHandler.MouseHandler_instance);
		var0.addFocusListener(MouseHandler.MouseHandler_instance);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1032226607"
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
