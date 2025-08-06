import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ip")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "Lxa;"
	)
	@Export("titlebuttonSprite")
	static IndexedSprite titlebuttonSprite;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	@Export("paint")
	SceneTilePaint paint;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	@Export("model")
	SceneTileModel model;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	@Export("itemLayer")
	ItemLayer itemLayer;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -649575905
	)
	@Export("gameObjectsCount")
	int gameObjectsCount;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[Ljk;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -875667687
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 685137059
	)
	@Export("x")
	int x;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1690732139
	)
	@Export("y")
	int y;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 965952075
	)
	@Export("originalPlane")
	int originalPlane;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("boundaryObject")
	BoundaryObject boundaryObject;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ljc;"
	)
	@Export("wallDecoration")
	WallDecoration wallDecoration;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	@Export("floorDecoration")
	FloorDecoration floorDecoration;
	@ObfuscatedName("ai")
	@Export("gameObjectEdgeMasks")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -2024953185
	)
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 593882325
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("at")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("ax")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("aq")
	@Export("drawGameObjects")
	boolean drawGameObjects;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 122784195
	)
	@Export("drawGameObjectEdges")
	int drawGameObjectEdges;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 797084287
	)
	int field2570;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -494726895
	)
	int field2571;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -325278227
	)
	int field2572;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lip;"
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfo;",
		garbageValue = "-1030976259"
	)
	static class135[] method4885() {
		return new class135[]{class135.field1619, class135.field1620, class135.field1622, class135.field1621, class135.field1623};
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-4"
	)
	public static void method4884() {
		VarpDefinition.VarpDefinition_cached.clear();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)Lmx;",
		garbageValue = "1"
	)
	public static class335 method4883(int var0) {
		return class335.field3775[var0];
	}
}
