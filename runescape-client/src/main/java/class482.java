import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sp")
public abstract class class482 {
	class482() {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lks;Lsm;II)V",
		garbageValue = "-1318895003"
	)
	abstract void vmethod9368(WorldEntityCoord var1, class481 var2, int var3);

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lks;IIB)Z",
		garbageValue = "-65"
	)
	abstract boolean vmethod9369(WorldEntityCoord var1, int var2, int var3);

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1212488341"
	)
	abstract void vmethod9367(int var1, int var2);

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(IIIIISISIIB)V",
		garbageValue = "-103"
	)
	static void method9366(int var0, int var1, int var2, int var3, int var4, short var5, int var6, short var7, int var8, int var9) {
		NodeDeque var10 = class30.worldView.groundItems[var0][var1][var2];
		if (var10 != null) {
			for (TileItem var11 = (TileItem)var10.last(); var11 != null; var11 = (TileItem)var10.previous()) {
				if ((var3 & 32767) == var11.id && var4 == var11.quantity) {
					PlayerCompositionColorTextureOverride var12 = var11.method3105();
					if (var12 == null) {
						var12 = new PlayerCompositionColorTextureOverride(var3);
					}

					if (var12.method5081() && var6 > -1 && var6 < var12.playerCompositionRecolorTo.length) {
						var12.playerCompositionRecolorTo[var6] = var5;
					}

					if (var12.method5082() && var8 > -1 && var8 < var12.playerCompositionRetextureTo.length) {
						var12.playerCompositionRetextureTo[var8] = var7;
					}

					if (var9 > -1) {
						var12.field2474 = var9;
						var12.field2483 = null;
					}

					var11.method3104(var12);
					break;
				}
			}

			ByteArrayPool.updateItemPile(var0, var1, var2);
		}

	}
}
