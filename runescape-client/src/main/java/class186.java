import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hb")
public class class186 {
	@ObfuscatedName("gy")
	static String field1992;

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIZB)V",
		garbageValue = "45"
	)
	@Export("addTileItemToGroundItems")
	static void addTileItemToGroundItems(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		class108 var10 = new class108();
		var10.id = var3;
		var10.field1414 = var4;
		var10.method2953(var5);
		var10.field1413 = Client.field598 + var6;
		var10.field1419 = var7 + Client.field598;
		var10.field1415 = var8;
		var10.field1416 = var9;
		if (class376.worldView.groundItems[var0][var1][var2] == null) {
			class376.worldView.groundItems[var0][var1][var2] = new NodeDeque();
		}

		class376.worldView.groundItems[var0][var1][var2].addFirst(var10);
		Language.updateItemPile(var0, var1, var2);
	}
}
