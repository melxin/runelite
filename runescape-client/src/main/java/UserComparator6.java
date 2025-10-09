import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
@Implements("UserComparator6")
public class UserComparator6 extends AbstractUserComparator {
	@ObfuscatedName("ab")
	@Export("reversed")
	final boolean reversed;

	public UserComparator6(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ltu;Ltu;I)I",
		garbageValue = "-152629337"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) {
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername());
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)Z",
		garbageValue = "-177478253"
	)
	static boolean method3659(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		Scene var7 = class32.worldView.scene;
		int var9;
		if (var5 == class394.field4857.field4855) {
			BoundaryObject var8 = var7.getBoundaryObject(var0, var1, var2);
			if (var8 != null) {
				var9 = BuddyRankComparator.Entity_unpackID(var8.tag);
				if (var3 == WorldMapDecorationType.field4355.id) {
					var8.renderable1 = new DynamicObject(class32.worldView, var9, 2, var4 + 4, var0, var1, var2, var6, false, var8.renderable1);
					var8.renderable2 = new DynamicObject(class32.worldView, var9, 2, var4 + 1 & 3, var0, var1, var2, var6, false, var8.renderable2);
				} else {
					var8.renderable1 = new DynamicObject(class32.worldView, var9, var3, var4, var0, var1, var2, var6, false, var8.renderable1);
				}

				return true;
			}
		} else if (var5 == class394.field4854.field4855) {
			WallDecoration var10 = var7.getWallDecoration(var0, var1, var2);
			if (var10 != null) {
				var9 = BuddyRankComparator.Entity_unpackID(var10.tag);
				if (var3 != WorldMapDecorationType.field4358.id && var3 != WorldMapDecorationType.field4359.id) {
					if (var3 == WorldMapDecorationType.field4353.id) {
						var10.renderable1 = new DynamicObject(class32.worldView, var9, 4, var4 + 4, var0, var1, var2, var6, false, var10.renderable1);
					} else if (var3 == WorldMapDecorationType.field4361.id) {
						var10.renderable1 = new DynamicObject(class32.worldView, var9, 4, (var4 + 2 & 3) + 4, var0, var1, var2, var6, false, var10.renderable1);
					} else if (var3 == WorldMapDecorationType.field4356.id) {
						var10.renderable1 = new DynamicObject(class32.worldView, var9, 4, var4 + 4, var0, var1, var2, var6, false, var10.renderable1);
						var10.renderable2 = new DynamicObject(class32.worldView, var9, 4, (var4 + 2 & 3) + 4, var0, var1, var2, var6, false, var10.renderable2);
					}
				} else {
					var10.renderable1 = new DynamicObject(class32.worldView, var9, 4, var4, var0, var1, var2, var6, false, var10.renderable1);
				}

				return true;
			}
		} else if (var5 == class394.field4856.field4855) {
			GameObject var11 = var7.getGameObject(var0, var1, var2);
			if (var3 == WorldMapDecorationType.field4374.id) {
				var3 = WorldMapDecorationType.field4369.id;
			}

			if (var11 != null) {
				var11.renderable = new DynamicObject(class32.worldView, BuddyRankComparator.Entity_unpackID(var11.tag), var3, var4, var0, var1, var2, var6, false, var11.renderable);
				return true;
			}
		} else if (var5 == class394.field4858.field4855) {
			FloorDecoration var12 = var7.getFloorDecoration(var0, var1, var2);
			if (var12 != null) {
				var12.renderable = new DynamicObject(class32.worldView, BuddyRankComparator.Entity_unpackID(var12.tag), 22, var4, var0, var1, var2, var6, false, var12.renderable);
				return true;
			}
		}

		return false;
	}
}
