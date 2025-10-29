import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nh")
class class348 implements ThreadFactory {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	public static AbstractArchive field3986;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	final MidiPcmStream this$0;

	@ObfuscatedSignature(
		descriptor = "(Lnc;)V"
	)
	class348(MidiPcmStream var1) {
		this.this$0 = var1;
	}

	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS WAV Load");
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "375165849"
	)
	static final int method7548(int var0, int var1, int var2, int var3) {
		return var0 * var2 + var3 * var1 >> 16;
	}

	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "(Ldd;IIII)V",
		garbageValue = "-1949644682"
	)
	@Export("updateItemPile2")
	static final void updateItemPile2(WorldView var0, int var1, int var2, int var3) {
		NodeDeque var4 = var0.groundItems[var1][var2][var3];
		if (var4 == null) {
			var0.scene.removeGroundItemPile(var1, var2, var3);
		} else {
			long var5 = -99999999L;
			TileItem var7 = null;

			TileItem var8;
			for (var8 = (TileItem)var4.last(); var8 != null; var8 = (TileItem)var4.previous()) {
				ItemComposition var9 = class150.ItemDefinition_get(var8.id);
				long var14 = (long)var9.price;
				if (var9.isStackable == 1) {
					var14 *= var8.quantity < Integer.MAX_VALUE ? (long)(var8.quantity + 1) : (long)var8.quantity;
				}

				if (var14 > var5) {
					var5 = var14;
					var7 = var8;
				}
			}

			if (var7 == null) {
				var0.scene.removeGroundItemPile(var1, var2, var3);
			} else {
				var4.addLast(var7);
				TileItem var16 = null;
				TileItem var10 = null;

				for (var8 = (TileItem)var4.last(); var8 != null; var8 = (TileItem)var4.previous()) {
					if (var8.id != var7.id) {
						if (var16 == null) {
							var16 = var8;
						}

						if (var8.id != var16.id && var10 == null) {
							var10 = var8;
						}
					}
				}

				ProjectionCoord var11 = WorldMapSectionType.method6968(var0, var2, var3, var1);
				var7.method2908(var11);
				if (var16 != null) {
					var16.method2908(var11);
				}

				if (var10 != null) {
					var10.method2908(var11);
				}

				long var12 = class236.calculateTag(var1, var2, var3, 3, false, 0, var0.id);
				var0.scene.newGroundItemPile(var1, var2, var3, NPCComposition.getTileHeight(var0, Coord.method7679(var2), Coord.method7679(var3), var1), var7, var12, var16, var10);
			}
		}
	}
}
