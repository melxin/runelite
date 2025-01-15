import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dz")
@Implements("WorldView")
public class WorldView extends Node {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -654168689
	)
	@Export("id")
	public int id;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	@Export("scene")
	public Scene scene;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[Lku;"
	)
	@Export("collisionMaps")
	CollisionMap[] collisionMaps;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 2049252501
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1436000011
	)
	@Export("sizeX")
	public int sizeX;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 780525675
	)
	@Export("sizeY")
	public int sizeY;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1670285575
	)
	@Export("baseX")
	int baseX;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1186505997
	)
	@Export("baseY")
	int baseY;
	@ObfuscatedName("at")
	@Export("tileLastDrawnActor")
	int[][] tileLastDrawnActor;
	@ObfuscatedName("ac")
	@Export("tileHeights")
	int[][][] tileHeights;
	@ObfuscatedName("au")
	@Export("tileSettings")
	byte[][][] tileSettings;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[Ldx;"
	)
	@Export("players")
	public Player[] players;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Leq;"
	)
	@Export("npcs")
	public NPC[] npcs;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1239693991
	)
	@Export("npcCount")
	int npcCount;
	@ObfuscatedName("aa")
	@Export("npcIndices")
	int[] npcIndices;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[Lsg;"
	)
	@Export("worldEntities")
	WorldEntity[] worldEntities;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1859119109
	)
	@Export("worldEntityCount")
	int worldEntityCount;
	@ObfuscatedName("av")
	@Export("worldEntityIndices")
	int[] worldEntityIndices;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[[[Lpm;"
	)
	@Export("groundItems")
	NodeDeque[][][] groundItems;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("pendingSpawns")
	NodeDeque pendingSpawns;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("projectiles")
	NodeDeque projectiles;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("graphicsObjects")
	NodeDeque graphicsObjects;

	@ObfuscatedSignature(
		descriptor = "(IIIILgs;)V"
	)
	WorldView(int var1, int var2, int var3, int var4, class175 var5) {
		this.collisionMaps = new CollisionMap[4];
		this.players = new Player[2048];
		this.npcs = new NPC[65536];
		this.npcIndices = new int[65536];
		this.worldEntities = new WorldEntity[2048];
		this.worldEntityIndices = new int[2048];
		this.pendingSpawns = new NodeDeque();
		this.projectiles = new NodeDeque();
		this.graphicsObjects = new NodeDeque();
		this.id = var1;
		this.sizeX = var2;
		this.sizeY = var3;
		this.groundItems = new NodeDeque[4][var2][var3];
		this.tileHeights = new int[4][var2 + 1][var3 + 1];
		this.tileSettings = new byte[4][var2][var3];
		this.tileLastDrawnActor = new int[var2][var3];

		for (int var6 = 0; var6 < 4; ++var6) {
			this.collisionMaps[var6] = new CollisionMap(var2, var3);
		}

		this.scene = new Scene(var1, 4, var2, var3, var4, var5, this.tileHeights);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1808821499"
	)
	void method2991() {
		this.npcCount = 0;
		this.worldEntityCount = 0;

		int var1;
		for (var1 = 0; var1 < 2048; ++var1) {
			this.players[var1] = null;
		}

		for (var1 = 0; var1 < 65536; ++var1) {
			this.npcs[var1] = null;
		}

		for (var1 = 0; var1 < 2048; ++var1) {
			this.worldEntities[var1] = null;
		}

		this.projectiles.clear();
		this.graphicsObjects.clear();
		this.pendingSpawns = new NodeDeque();

		for (var1 = 0; var1 < 4; ++var1) {
			for (int var2 = 0; var2 < this.sizeX; ++var2) {
				for (int var3 = 0; var3 < this.sizeY; ++var3) {
					this.groundItems[var1][var2][var3] = null;
				}
			}
		}

		this.scene.clearTempGameObjects();

		for (var1 = 0; var1 < 4; ++var1) {
			this.collisionMaps[var1].clear();
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1597512398"
	)
	void method2992() {
		int var1;
		for (var1 = 0; var1 < 2048; ++var1) {
			this.players[var1] = null;
		}

		for (var1 = 0; var1 < this.npcs.length; ++var1) {
			NPC var2 = this.npcs[var1];
			if (var2 != null) {
				var2.targetIndex = -1;
				var2.false0 = false;
			}
		}

	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(IIIIIS)V",
		garbageValue = "128"
	)
	static void method2997(int var0, int var1, int var2, int var3, int var4) {
		NodeDeque var5 = class30.worldView.groundItems[var0][var1][var2];
		if (var5 != null) {
			for (TileItem var6 = (TileItem)var5.last(); var6 != null; var6 = (TileItem)var5.previous()) {
				if ((var3 & 32767) == var6.id && var4 == var6.quantity) {
					var6.remove();
					break;
				}
			}

			if (var5.last() == null) {
				class30.worldView.groundItems[var0][var1][var2] = null;
			}

			ByteArrayPool.updateItemPile(var0, var1, var2);
		}

	}
}
