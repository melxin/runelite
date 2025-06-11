import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
@Implements("ClanChannelMember")
public class ClanChannelMember {
	@ObfuscatedName("qj")
	@ObfuscatedSignature(
		descriptor = "[Lwy;"
	)
	@Export("scrollBarSprites")
	static IndexedSprite[] scrollBarSprites;
	@ObfuscatedName("ap")
	@Export("rank")
	public byte rank;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 691312845
	)
	@Export("world")
	public int world;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lxm;"
	)
	@Export("username")
	public Username username;

	ClanChannelMember() {
	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-106"
	)
	static void method3678() {
		if (class338.worldMap != null) {
			class338.worldMap.method10295(Sound.topLevelWorldView.plane, (Client.field527 >> 7) + Sound.topLevelWorldView.baseX, (Client.field387 >> 7) + Sound.topLevelWorldView.baseY, false);
			class338.worldMap.loadCache();
		}

	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)Z",
		garbageValue = "-1325335667"
	)
	static boolean method3677(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		Scene var7 = class330.worldView.scene;
		int var9;
		if (var5 == class391.field4617.field4619) {
			BoundaryObject var8 = var7.getBoundaryObject(var0, var1, var2);
			if (var8 != null) {
				var9 = DirectByteArrayCopier.Entity_unpackID(var8.tag);
				if (var3 == WorldMapDecorationType.field4154.id) {
					var8.renderable1 = new DynamicObject(class330.worldView, var9, 2, var4 + 4, var0, var1, var2, var6, false, var8.renderable1);
					var8.renderable2 = new DynamicObject(class330.worldView, var9, 2, var4 + 1 & 3, var0, var1, var2, var6, false, var8.renderable2);
				} else {
					var8.renderable1 = new DynamicObject(class330.worldView, var9, var3, var4, var0, var1, var2, var6, false, var8.renderable1);
				}

				return true;
			}
		} else if (var5 == class391.field4614.field4619) {
			WallDecoration var10 = var7.getWallDecoration(var0, var1, var2);
			if (var10 != null) {
				var9 = DirectByteArrayCopier.Entity_unpackID(var10.tag);
				if (var3 != WorldMapDecorationType.field4157.id && var3 != WorldMapDecorationType.field4158.id) {
					if (var3 == WorldMapDecorationType.field4159.id) {
						var10.renderable1 = new DynamicObject(class330.worldView, var9, 4, var4 + 4, var0, var1, var2, var6, false, var10.renderable1);
					} else if (var3 == WorldMapDecorationType.field4167.id) {
						var10.renderable1 = new DynamicObject(class330.worldView, var9, 4, (var4 + 2 & 3) + 4, var0, var1, var2, var6, false, var10.renderable1);
					} else if (var3 == WorldMapDecorationType.field4166.id) {
						var10.renderable1 = new DynamicObject(class330.worldView, var9, 4, var4 + 4, var0, var1, var2, var6, false, var10.renderable1);
						var10.renderable2 = new DynamicObject(class330.worldView, var9, 4, (var4 + 2 & 3) + 4, var0, var1, var2, var6, false, var10.renderable2);
					}
				} else {
					var10.renderable1 = new DynamicObject(class330.worldView, var9, 4, var4, var0, var1, var2, var6, false, var10.renderable1);
				}

				return true;
			}
		} else if (var5 == class391.field4613.field4619) {
			GameObject var11 = var7.getGameObject(var0, var1, var2);
			if (var3 == WorldMapDecorationType.field4161.id) {
				var3 = WorldMapDecorationType.field4172.id;
			}

			if (var11 != null) {
				var11.renderable = new DynamicObject(class330.worldView, DirectByteArrayCopier.Entity_unpackID(var11.tag), var3, var4, var0, var1, var2, var6, false, var11.renderable);
				return true;
			}
		} else if (var5 == class391.field4616.field4619) {
			FloorDecoration var12 = var7.getFloorDecoration(var0, var1, var2);
			if (var12 != null) {
				var12.renderable = new DynamicObject(class330.worldView, DirectByteArrayCopier.Entity_unpackID(var12.tag), 22, var4, var0, var1, var2, var6, false, var12.renderable);
				return true;
			}
		}

		return false;
	}
}
