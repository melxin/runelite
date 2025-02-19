import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hb")
public class class186 {
	@ObfuscatedName("gy")
	@Export("authServiceBaseUrl")
	static String authServiceBaseUrl;

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIZB)V",
		garbageValue = "45"
	)
	@Export("addTileItemToGroundItems")
	static void addTileItemToGroundItems(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		TileItem var10 = new TileItem();
		var10.id = var3;
		var10.quantity = var4;
		var10.setFlag(var5);
		var10.visibleTime = Client.serverCycle + var6;
		var10.despawnTime = var7 + Client.serverCycle;
		var10.ownership = var8;
		var10.isPrivate = var9;
		if (class376.worldView.groundItems[var0][var1][var2] == null) {
			class376.worldView.groundItems[var0][var1][var2] = new NodeDeque();
		}

		class376.worldView.groundItems[var0][var1][var2].addFirst(var10);
		Language.updateItemPile(var0, var1, var2);
	}
}
