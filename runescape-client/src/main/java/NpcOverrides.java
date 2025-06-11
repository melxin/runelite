import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ht")
@Implements("NpcOverrides")
public class NpcOverrides {
	@ObfuscatedName("vt")
	@ObfuscatedGetter(
		intValue = 934735983
	)
	static int field2022;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		longValue = 1697668634574992809L
	)
	public long field2018;
	@ObfuscatedName("aj")
	@Export("modelIds")
	int[] modelIds;
	@ObfuscatedName("an")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("ai")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("al")
	@Export("useLocalPlayer")
	public boolean useLocalPlayer;

	public NpcOverrides(long var1, int[] var3, short[] var4, short[] var5, boolean var6) {
		this.useLocalPlayer = false;
		this.field2018 = var1;
		this.modelIds = var3;
		this.recolorTo = var4;
		this.retextureTo = var5;
		this.useLocalPlayer = var6;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-283722608"
	)
	static void method4147(int var0) {
		class445.field4966 = var0;
		class445.field4963 = new class445[var0];
		GrandExchangeOfferNameComparator.field4812 = 0;
	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(Ldl;IIII)V",
		garbageValue = "2052648065"
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
				ItemComposition var9 = SceneTilePaint.ItemDefinition_get(var8.id);
				long var13 = (long)var9.price;
				if (var9.isStackable == 1) {
					var13 *= var8.quantity < Integer.MAX_VALUE ? (long)(var8.quantity + 1) : (long)var8.quantity;
				}

				if (var13 > var5) {
					var5 = var13;
					var7 = var8;
				}
			}

			if (var7 == null) {
				var0.scene.removeGroundItemPile(var1, var2, var3);
			} else {
				var4.addLast(var7);
				TileItem var15 = null;
				TileItem var10 = null;

				for (var8 = (TileItem)var4.last(); var8 != null; var8 = (TileItem)var4.previous()) {
					if (var8.id != var7.id) {
						if (var15 == null) {
							var15 = var8;
						}

						if (var15.id != var8.id && var10 == null) {
							var10 = var8;
						}
					}
				}

				long var11 = class275.calculateTag(var1, var2, var3, 3, false, 0, var0.id);
				var0.scene.newGroundItemPile(var1, var2, var3, DevicePcmPlayerProvider.method329(var0, Coord.method7242(var2), Coord.method7242(var3), var1), var7, var11, var15, var10);
			}
		}
	}
}
