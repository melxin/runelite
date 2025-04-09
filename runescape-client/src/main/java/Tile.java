import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gg")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	@Export("paint")
	SceneTilePaint paint;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("model")
	SceneTileModel model;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lgp;"
	)
	@Export("itemLayer")
	ItemLayer itemLayer;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 965742327
	)
	@Export("gameObjectsCount")
	int gameObjectsCount;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Liv;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 856317447
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -202054623
	)
	@Export("x")
	int x;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 376332683
	)
	@Export("y")
	int y;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 450256985
	)
	@Export("originalPlane")
	int originalPlane;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lhc;"
	)
	@Export("boundaryObject")
	BoundaryObject boundaryObject;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lhk;"
	)
	@Export("wallDecoration")
	WallDecoration wallDecoration;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lgd;"
	)
	@Export("floorDecoration")
	FloorDecoration floorDecoration;
	@ObfuscatedName("au")
	@Export("gameObjectEdgeMasks")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -204487599
	)
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 153997521
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("ac")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("ay")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("ak")
	@Export("drawGameObjects")
	boolean drawGameObjects;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1818239469
	)
	@Export("drawGameObjectEdges")
	int drawGameObjectEdges;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 629624439
	)
	int field1986;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -815175623
	)
	int field1990;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -353832721
	)
	int field1988;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZI)V",
		garbageValue = "1961197026"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) {
			int var6 = (var0 + var1) / 2;
			int var7 = var0;
			World var8 = World.World_worlds[var6];
			World.World_worlds[var6] = World.World_worlds[var1];
			World.World_worlds[var1] = var8;

			for (int var9 = var0; var9 < var1; ++var9) {
				World var11 = World.World_worlds[var9];
				int var12 = AsyncRestClient.compareWorlds(var11, var8, var2, var3);
				int var10;
				if (var12 != 0) {
					if (var3) {
						var10 = -var12;
					} else {
						var10 = var12;
					}
				} else if (var4 == -1) {
					var10 = 0;
				} else {
					int var13 = AsyncRestClient.compareWorlds(var11, var8, var4, var5);
					if (var5) {
						var10 = -var13;
					} else {
						var10 = var13;
					}
				}

				if (var10 <= 0) {
					World var14 = World.World_worlds[var9];
					World.World_worlds[var9] = World.World_worlds[var7];
					World.World_worlds[var7++] = var14;
				}
			}

			World.World_worlds[var1] = World.World_worlds[var7];
			World.World_worlds[var7] = var8;
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5);
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5);
		}

	}
}
