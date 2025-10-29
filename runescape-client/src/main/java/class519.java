import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("to")
public class class519 {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	final WorldEntityCoord field5545;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 631746927
	)
	int field5542;

	class519() {
		this.field5545 = new WorldEntityCoord();
	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(Ldd;IIIIIIIIIZI)V",
		garbageValue = "-806668510"
	)
	static void method10567(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10) {
		TileItem var11 = new TileItem();
		var11.id = var4;
		var11.quantity = var5;
		var11.setFlag(var6);
		var11.visibleTime = var7 + Client.serverCycle;
		var11.despawnTime = var8 + Client.serverCycle;
		var11.ownership = var9;
		var11.isPrivate = var10;
		if (var0.groundItems[var1][var2][var3] == null) {
			var0.groundItems[var1][var2][var3] = new NodeDeque();
		}

		var0.groundItems[var1][var2][var3].addFirst(var11);
		class348.updateItemPile2(var0, var1, var2, var3);
	}
}
