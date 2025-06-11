import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ld")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("at")
	@Export("Tiles_saturation")
	static int[] Tiles_saturation;
	@ObfuscatedName("ae")
	@Export("ByteArrayPool_altSizeArrayCounts")
	public static int[] ByteArrayPool_altSizeArrayCounts;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1095827275
	)
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1793932931
	)
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1126546759
	)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1;
		this.decoration = var2;
		this.rotation = var3;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)F",
		garbageValue = "40"
	)
	public static float method6615(int var0) {
		var0 &= 16383;
		return (float)(3.834951969714103E-4D * (double)((float)var0));
	}

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIZI)V",
		garbageValue = "1866450658"
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
		if (class330.worldView.groundItems[var0][var1][var2] == null) {
			class330.worldView.groundItems[var0][var1][var2] = new NodeDeque();
		}

		class330.worldView.groundItems[var0][var1][var2].addFirst(var10);
		WorldMapRectangle.updateItemPile(var0, var1, var2);
	}
}
