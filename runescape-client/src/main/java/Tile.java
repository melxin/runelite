import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jw")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	@Export("archive9")
	static Archive archive9;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("paint")
	SceneTilePaint paint;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	@Export("model")
	SceneTileModel model;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	@Export("itemLayer")
	ItemLayer itemLayer;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1265471425
	)
	@Export("gameObjectsCount")
	int gameObjectsCount;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Lkd;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1971565835
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1738768469
	)
	@Export("x")
	int x;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -720501671
	)
	@Export("y")
	int y;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1724486501
	)
	@Export("originalPlane")
	int originalPlane;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("boundaryObject")
	BoundaryObject boundaryObject;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	@Export("wallDecoration")
	WallDecoration wallDecoration;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("floorDecoration")
	FloorDecoration floorDecoration;
	@ObfuscatedName("ai")
	@Export("gameObjectEdgeMasks")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -776991163
	)
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -295997735
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("ab")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("ax")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("ar")
	@Export("drawGameObjects")
	boolean drawGameObjects;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 403042499
	)
	@Export("drawGameObjectEdges")
	int drawGameObjectEdges;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1047327197
	)
	int field2782;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -489308045
	)
	int field2767;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1129050639
	)
	int field2758;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IZI)Ljava/lang/String;",
		garbageValue = "-358468941"
	)
	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		if (var1 && var0 >= 0) {
			int var3 = var0;
			String var2;
			if (var1 && var0 >= 0) {
				int var4 = 2;

				for (int var5 = var0 / 10; var5 != 0; ++var4) {
					var5 /= 10;
				}

				char[] var6 = new char[var4];
				var6[0] = '+';

				for (int var7 = var4 - 1; var7 > 0; --var7) {
					int var8 = var3;
					var3 /= 10;
					int var9 = var8 - var3 * 10;
					if (var9 >= 10) {
						var6[var7] = (char)(var9 + 87);
					} else {
						var6[var7] = (char)(var9 + 48);
					}
				}

				var2 = new String(var6);
			} else {
				var2 = Integer.toString(var0, 10);
			}

			return var2;
		} else {
			return Integer.toString(var0);
		}
	}
}
