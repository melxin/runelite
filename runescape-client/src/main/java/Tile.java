import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ju")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1022484315
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1430718767
	)
	@Export("x")
	int x;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 880346099
	)
	@Export("y")
	int y;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1797654355
	)
	@Export("originalPlane")
	int originalPlane;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lje;"
	)
	@Export("paint")
	SceneTilePaint paint;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ljq;"
	)
	@Export("model")
	SceneTileModel model;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lkv;"
	)
	@Export("boundaryObject")
	BoundaryObject boundaryObject;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	@Export("wallDecoration")
	WallDecoration wallDecoration;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ljr;"
	)
	@Export("floorDecoration")
	FloorDecoration floorDecoration;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	@Export("itemLayer")
	ItemLayer itemLayer;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -874772167
	)
	@Export("gameObjectsCount")
	int gameObjectsCount;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Lkr;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("ar")
	@Export("gameObjectEdgeMasks")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 372734409
	)
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 261645917
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("ak")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("ap")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("ah")
	@Export("drawGameObjects")
	boolean drawGameObjects;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1348956319
	)
	@Export("drawGameObjectEdges")
	int drawGameObjectEdges;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1772087291
	)
	int field2581;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1631164287
	)
	int field2590;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1091419763
	)
	int field2591;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	@Export("linkedBelowTile")
	Tile linkedBelowTile;

	Tile(int var1, int var2, int var3) {
		this.gameObjects = new GameObject[5];
		this.gameObjectEdgeMasks = new int[5];
		this.gameObjectsEdgeMask = 0;
		this.originalPlane = this.plane = var1;
		this.x = var2;
		this.y = var3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SIIB)V",
		garbageValue = "1"
	)
	@Export("sortItemsByName")
	static void sortItemsByName(String[] var0, short[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			short var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					short var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			sortItemsByName(var0, var1, var2, var5 - 1);
			sortItemsByName(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("mm")
	@ObfuscatedSignature(
		descriptor = "([Lnp;IIIZI)V",
		garbageValue = "-715218419"
	)
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; ++var5) {
			Widget var6 = var0[var5];
			if (var6 != null && var6.parentId == var1) {
				AbstractWorldMapIcon.alignWidgetSize(var6, var2, var3, var4);
				LoginScreenAnimation.alignWidgetPosition(var6, var2, var3);
				if (var6.scrollX > var6.scrollWidth - var6.width) {
					var6.scrollX = var6.scrollWidth - var6.width;
				}

				if (var6.scrollX < 0) {
					var6.scrollX = 0;
				}

				if (var6.scrollY > var6.scrollHeight - var6.height) {
					var6.scrollY = var6.scrollHeight - var6.height;
				}

				if (var6.scrollY < 0) {
					var6.scrollY = 0;
				}

				if (var6.type == 0) {
					GrandExchangeOfferAgeComparator.revalidateWidgetScroll(var0, var6, var4);
				}
			}
		}

	}

	@ObfuscatedName("mu")
	@ObfuscatedSignature(
		descriptor = "(Lnp;I)Z",
		garbageValue = "-30302104"
	)
	@Export("runCs1")
	static final boolean runCs1(Widget var0) {
		if (var0.cs1Comparisons == null) {
			return false;
		} else {
			for (int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) {
				int var2 = class300.method6248(var0, var1);
				int var3 = var0.cs1ComparisonValues[var1];
				if (var0.cs1Comparisons[var1] == 2) {
					if (var2 >= var3) {
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 3) {
					if (var2 <= var3) {
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 4) {
					if (var2 == var3) {
						return false;
					}
				} else if (var2 != var3) {
					return false;
				}
			}

			return true;
		}
	}
}
