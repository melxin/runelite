import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dm")
@Implements("WorldView")
public class WorldView extends Node {
	@ObfuscatedName("ha")
	static SecureRandom field1335;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -775726855
	)
	@Export("id")
	int id;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("scene")
	public Scene scene;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Lka;"
	)
	@Export("collisionMaps")
	CollisionMap[] collisionMaps;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1779737937
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -942555843
	)
	@Export("sizeX")
	public int sizeX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 379101543
	)
	@Export("sizeY")
	public int sizeY;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -369730497
	)
	@Export("baseX")
	int baseX;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 94507959
	)
	@Export("baseY")
	int baseY;
	@ObfuscatedName("au")
	@Export("tileLastDrawnActor")
	int[][] tileLastDrawnActor;
	@ObfuscatedName("an")
	@Export("tileHeights")
	int[][][] tileHeights;
	@ObfuscatedName("af")
	@Export("tileSettings")
	byte[][][] tileSettings;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "[Ldy;"
	)
	@Export("players")
	Player[] players;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Lec;"
	)
	@Export("npcs")
	NPC[] npcs;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1031812205
	)
	@Export("npcCount")
	int npcCount;
	@ObfuscatedName("as")
	@Export("npcIndices")
	int[] npcIndices;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[Lsh;"
	)
	@Export("worldEntities")
	WorldEntity[] worldEntities;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1454815503
	)
	@Export("worldEntityCount")
	int worldEntityCount;
	@ObfuscatedName("ap")
	@Export("worldEntityIndices")
	int[] worldEntityIndices;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[[[Lph;"
	)
	@Export("groundItems")
	NodeDeque[][][] groundItems;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("pendingSpawns")
	NodeDeque pendingSpawns;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("projectiles")
	NodeDeque projectiles;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("graphicsObjects")
	NodeDeque graphicsObjects;

	@ObfuscatedSignature(
		descriptor = "(IIIILit;)V"
	)
	WorldView(int var1, int var2, int var3, int var4, class232 var5) {
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-380276630"
	)
	void method2869() {
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2087759733"
	)
	void method2868() {
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-480191763"
	)
	public static boolean method2874(int var0) {
		return var0 >= WorldMapDecorationType.field4050.id && var0 <= WorldMapDecorationType.field4051.id || var0 == WorldMapDecorationType.field4052.id;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/CharSequence;IIB)Ljava/lang/String;",
		garbageValue = "68"
	)
	public static String method2870(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) {
			return "";
		} else if (var2 == 1) {
			CharSequence var10 = var0[var1];
			return var10 == null ? "null" : var10.toString();
		} else {
			int var3 = var2 + var1;
			int var4 = 0;

			for (int var5 = var1; var5 < var3; ++var5) {
				CharSequence var9 = var0[var5];
				if (var9 == null) {
					var4 += 4;
				} else {
					var4 += var9.length();
				}
			}

			StringBuilder var8 = new StringBuilder(var4);

			for (int var6 = var1; var6 < var3; ++var6) {
				CharSequence var7 = var0[var6];
				if (var7 == null) {
					var8.append("null");
				} else {
					var8.append(var7);
				}
			}

			return var8.toString();
		}
	}
}
