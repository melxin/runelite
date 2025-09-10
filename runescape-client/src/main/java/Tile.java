import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ii")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	@Export("paint")
	SceneTilePaint paint;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("model")
	SceneTileModel model;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("itemLayer")
	ItemLayer itemLayer;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 422153801
	)
	@Export("gameObjectsCount")
	int gameObjectsCount;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Ljm;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 671492593
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -2022624537
	)
	@Export("x")
	int x;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1465657841
	)
	@Export("y")
	int y;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1474143877
	)
	@Export("originalPlane")
	int originalPlane;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("boundaryObject")
	BoundaryObject boundaryObject;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Ljr;"
	)
	@Export("wallDecoration")
	WallDecoration wallDecoration;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("floorDecoration")
	FloorDecoration floorDecoration;
	@ObfuscatedName("an")
	@Export("gameObjectEdgeMasks")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1325311709
	)
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1043101699
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("ay")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("ad")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("ag")
	@Export("drawGameObjects")
	boolean drawGameObjects;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 196909571
	)
	@Export("drawGameObjectEdges")
	int drawGameObjectEdges;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -666850291
	)
	int field2619;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1202243977
	)
	int field2606;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -518683825
	)
	int field2616;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lii;"
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1952775347"
	)
	public static boolean method4924() {
		if (!class339.field3892.isEmpty()) {
			return true;
		} else {
			return !class339.midiRequests.isEmpty() && class339.midiRequests.get(0) != null && ((MidiRequest)class339.midiRequests.get(0)).midiPcmStream != null ? ((MidiRequest)class339.midiRequests.get(0)).midiPcmStream.isReady() : false;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Date;B)Z",
		garbageValue = "4"
	)
	static boolean method4925(Date var0) {
		java.util.Calendar var1 = java.util.Calendar.getInstance();
		var1.set(1, var1.get(1) - 13);
		var1.set(5, var1.get(5) + 1);
		var1.set(11, 0);
		var1.set(12, 0);
		var1.set(13, 0);
		var1.set(14, 0);
		Date var2 = var1.getTime();
		return var0.before(var2);
	}
}
