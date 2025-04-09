import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dj")
@Implements("WorldView")
public class WorldView extends Node {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 2085597975
	)
	@Export("id")
	int id;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("scene")
	public Scene scene;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lkd;"
	)
	@Export("collisionMaps")
	CollisionMap[] collisionMaps;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1445092353
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -762638669
	)
	@Export("sizeX")
	public int sizeX;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 976750293
	)
	@Export("sizeY")
	public int sizeY;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1702914355
	)
	@Export("baseX")
	int baseX;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1095873273
	)
	@Export("baseY")
	int baseY;
	@ObfuscatedName("aa")
	@Export("tileLastDrawnActor")
	int[][] tileLastDrawnActor;
	@ObfuscatedName("ap")
	@Export("tileHeights")
	int[][][] tileHeights;
	@ObfuscatedName("ax")
	@Export("tileSettings")
	byte[][][] tileSettings;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpd;"
	)
	@Export("players")
	IndexedObjectSet players;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lpd;"
	)
	@Export("npcs")
	IndexedObjectSet npcs;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	@Export("worldEntities")
	IterableNodeHashTable worldEntities;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[[[Lqx;"
	)
	@Export("groundItems")
	NodeDeque[][][] groundItems;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lqx;"
	)
	@Export("pendingSpawns")
	NodeDeque pendingSpawns;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lqx;"
	)
	@Export("projectiles")
	NodeDeque projectiles;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lqx;"
	)
	@Export("graphicsObjects")
	NodeDeque graphicsObjects;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lsw;"
	)
	class473 field1351;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lsw;"
	)
	class473 field1352;

	@ObfuscatedSignature(
		descriptor = "(IIIILgx;)V"
	)
	WorldView(int var1, int var2, int var3, int var4, class173 var5) {
		this.collisionMaps = new CollisionMap[4];
		this.pendingSpawns = new NodeDeque();
		this.projectiles = new NodeDeque();
		this.graphicsObjects = new NodeDeque();
		this.field1351 = new class473(149);
		this.field1352 = new class473(25);
		this.id = var1;
		this.sizeX = var2;
		this.sizeY = var3;
		this.players = new IndexedObjectSet(var1 == -1 ? 512 : 8);
		this.npcs = new IndexedObjectSet(var1 == -1 ? 128 : 8);
		this.worldEntities = new IterableNodeHashTable(var1 == -1 ? 32 : 1);
		this.groundItems = new NodeDeque[4][var2][var3];
		this.tileHeights = new int[4][var2 + 1][var3 + 1];
		this.tileSettings = new byte[4][var2][var3];
		this.tileLastDrawnActor = new int[var2][var3];
		boolean var6 = var1 != -1;

		for (int var7 = 0; var7 < 4; ++var7) {
			this.collisionMaps[var7] = new CollisionMap(var2, var3, var6);
		}

		this.scene = new Scene(var1, 4, var2, var3, var4, var5, this.tileHeights);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-61"
	)
	boolean method2871() {
		return this.id == -1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-358479222"
	)
	void method2869() {
		this.field1351.method9058();
		this.field1352.method9058();
		this.players.clear();
		this.npcs.clear();
		this.worldEntities.clear();
		this.projectiles.clear();
		this.graphicsObjects.clear();
		this.pendingSpawns = new NodeDeque();

		int var1;
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-7"
	)
	void method2872() {
		this.players.clear();

		Actor var2;
		for (Iterator var1 = this.npcs.iterator(); var1.hasNext(); var2.false0 = false) {
			var2 = (Actor)var1.next();
			var2.targetIndex = -1;
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IZI)Ljava/lang/String;",
		garbageValue = "-832812176"
	)
	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		return var1 && var0 >= 0 ? class169.method3723(var0, 10, var1) : Integer.toString(var0);
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "([BIIB)I",
		garbageValue = "-107"
	)
	static int method2877(byte[] var0, int var1, int var2) {
		int var3 = -1;

		for (int var4 = var1; var4 < var2; ++var4) {
			var3 = var3 >>> 8 ^ Buffer.field5600[(var3 ^ var0[var4]) & 255];
		}

		var3 = ~var3;
		return var3;
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-710402881"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		WorldMapIcon_0.method6266();
		Client.menu.menuWorldViewIds[0] = -1;
		Client.menu.menuActions[0] = "Cancel";
		Client.menu.menuTargets[0] = "";
		Client.menu.menuOpcodes[0] = 1006;
		Client.menu.menuShiftClick[0] = false;
		Client.menu.subMenus[0] = null;
		Client.menu.menuOptionsCount = 1;
	}
}
