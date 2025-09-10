import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jw")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lgs;"
	)
	static ClanSettings field2805;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 542673887
	)
	@Export("x")
	int x;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 694810815
	)
	@Export("y")
	int y;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1991757615
	)
	@Export("z")
	int z;

	FaceNormal() {
	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(Ldr;IIIIIIIIIZI)V",
		garbageValue = "781510154"
	)
	static void method5375(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10) {
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
		ObjectSound.updateItemPile2(var0, var1, var2, var3);
	}
}
