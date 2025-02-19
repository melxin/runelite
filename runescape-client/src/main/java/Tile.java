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
		intValue = -43076811
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 423199951
	)
	@Export("x")
	int x;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1743450465
	)
	@Export("y")
	int y;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1775125779
	)
	@Export("originalPlane")
	int originalPlane;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	@Export("paint")
	SceneTilePaint paint;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	@Export("model")
	SceneTileModel model;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	@Export("boundaryObject")
	BoundaryObject boundaryObject;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	@Export("wallDecoration")
	WallDecoration wallDecoration;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
	)
	@Export("floorDecoration")
	FloorDecoration floorDecoration;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	@Export("itemLayer")
	ItemLayer itemLayer;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 18946921
	)
	@Export("gameObjectsCount")
	int gameObjectsCount;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "[Lkf;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("ak")
	@Export("gameObjectEdgeMasks")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1063239869
	)
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1110399489
	)
	int field2627;
	@ObfuscatedName("ar")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("ag")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("az")
	@Export("drawGameObjects")
	boolean drawGameObjects;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -162315339
	)
	@Export("drawGameObjectEdges")
	int drawGameObjectEdges;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1604368099
	)
	int field2633;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1252207319
	)
	int field2622;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 808614061
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("at")
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
}
