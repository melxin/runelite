import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("if")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
	)
	@Export("paint")
	SceneTilePaint paint;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lje;"
	)
	@Export("model")
	SceneTileModel model;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	@Export("itemLayer")
	ItemLayer itemLayer;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -955055547
	)
	@Export("gameObjectsCount")
	int gameObjectsCount;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[Lju;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -28710489
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1641406231
	)
	@Export("x")
	int x;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -991648717
	)
	@Export("y")
	int y;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 962159713
	)
	@Export("originalPlane")
	int originalPlane;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	@Export("boundaryObject")
	BoundaryObject boundaryObject;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	@Export("wallDecoration")
	WallDecoration wallDecoration;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lin;"
	)
	@Export("floorDecoration")
	FloorDecoration floorDecoration;
	@ObfuscatedName("as")
	@Export("gameObjectEdgeMasks")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1300692515
	)
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1669252505
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("au")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("ak")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("ao")
	@Export("drawGameObjects")
	boolean drawGameObjects;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -640579255
	)
	@Export("drawGameObjectEdges")
	int drawGameObjectEdges;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1512557741
	)
	int field2612;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 452875131
	)
	int field2621;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -2026799679
	)
	int field2622;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lif;"
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lwe;",
		garbageValue = "-1644410791"
	)
	public static class572 method4986(int var0) {
		int var1 = class570.field5874[var0];
		if (var1 == 1) {
			return class572.field5879;
		} else if (var1 == 2) {
			return class572.field5877;
		} else {
			return var1 == 3 ? class572.field5878 : null;
		}
	}
}
