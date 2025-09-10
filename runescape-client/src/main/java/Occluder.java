import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jk")
@Implements("Occluder")
public final class Occluder {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1942311071
	)
	@Export("minTileX")
	int minTileX;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -803319375
	)
	@Export("maxTileX")
	int maxTileX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1030563503
	)
	@Export("minTileY")
	int minTileY;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 2133961185
	)
	@Export("maxTileY")
	int maxTileY;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 753330381
	)
	@Export("type")
	int type;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1134792567
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 344670591
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1813630749
	)
	@Export("minZ")
	int minZ;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -968611377
	)
	@Export("maxZ")
	int maxZ;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 754158615
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1259682761
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1586443513
	)
	int field2826;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1510671523
	)
	int field2827;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 487184861
	)
	int field2828;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -2084873843
	)
	int field2817;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1125511533
	)
	int field2833;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -736166349
	)
	int field2831;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1715814317
	)
	int field2832;

	Occluder() {
	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(Ldr;IIIIII)V",
		garbageValue = "752206861"
	)
	static void method5384(WorldView var0, int var1, int var2, int var3, int var4, int var5) {
		NodeDeque var6 = var0.groundItems[var1][var2][var3];
		if (var6 != null) {
			for (TileItem var7 = (TileItem)var6.last(); var7 != null; var7 = (TileItem)var6.previous()) {
				if ((var4 & 32767) == var7.id && var5 == var7.quantity) {
					var7.remove();
					break;
				}
			}

			if (var6.last() == null) {
				var0.groundItems[var1][var2][var3] = null;
			}

			ObjectSound.updateItemPile2(var0, var1, var2, var3);
		}

	}
}
