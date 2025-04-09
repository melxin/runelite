import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("na")
public class class339 {
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1251495641
	)
	public static int field3763;
	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "Luw;"
	)
	@Export("loginType")
	static LoginType loginType;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 582761865
	)
	int field3764;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lcg;"
	)
	class53 field3762;

	@ObfuscatedSignature(
		descriptor = "(ILcg;)V"
	)
	class339(int var1, class53 var2) {
		this.field3764 = var1;
		this.field3762 = var2;
	}

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "508675109"
	)
	static void method6807() {
		for (class269 var0 = (class269)Client.field622.last(); var0 != null; var0 = (class269)Client.field622.previous()) {
			var0.remove();
		}

	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIZS)V",
		garbageValue = "29783"
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
		if (DevicePcmPlayerProvider.worldView.groundItems[var0][var1][var2] == null) {
			DevicePcmPlayerProvider.worldView.groundItems[var0][var1][var2] = new NodeDeque();
		}

		DevicePcmPlayerProvider.worldView.groundItems[var0][var1][var2].addFirst(var10);
		WorldMapCacheName.updateItemPile(var0, var1, var2);
	}
}
