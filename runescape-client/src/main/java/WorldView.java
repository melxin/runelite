import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dr")
@Implements("WorldView")
public class WorldView extends Node {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lqs;"
	)
	@Export("objectSounds")
	final NodeDeque objectSounds;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 542989475
	)
	@Export("id")
	public int id;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	@Export("scene")
	public Scene scene;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[Lkb;"
	)
	@Export("collisionMaps")
	CollisionMap[] collisionMaps;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -71765503
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 688942373
	)
	@Export("sizeX")
	public int sizeX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1737912357
	)
	@Export("sizeY")
	public int sizeY;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1803587969
	)
	@Export("baseX")
	int baseX;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1957453421
	)
	@Export("baseY")
	int baseY;
	@ObfuscatedName("au")
	@Export("tileLastDrawnActor")
	int[][] tileLastDrawnActor;
	@ObfuscatedName("ai")
	@Export("tileHeights")
	int[][][] tileHeights;
	@ObfuscatedName("aa")
	@Export("tileSettings")
	byte[][][] tileSettings;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	@Export("players")
	public IndexedObjectSet players;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	@Export("npcs")
	IndexedObjectSet npcs;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	@Export("worldEntities")
	IterableNodeHashTable worldEntities;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[[[Lqs;"
	)
	@Export("groundItems")
	NodeDeque[][][] groundItems;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lqs;"
	)
	@Export("pendingSpawns")
	NodeDeque pendingSpawns;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lqs;"
	)
	@Export("graphicsObjects")
	NodeDeque graphicsObjects;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lsn;"
	)
	class486 field1161;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lsn;"
	)
	class486 field1176;

	@ObfuscatedSignature(
		descriptor = "(IIIILio;)V"
	)
	WorldView(int var1, int var2, int var3, int var4, class217 var5) {
		this.objectSounds = new NodeDeque();
		this.collisionMaps = new CollisionMap[4];
		this.pendingSpawns = new NodeDeque();
		this.graphicsObjects = new NodeDeque();
		this.field1161 = new class486(149);
		this.field1176 = new class486(25);
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1129049926"
	)
	boolean method2691() {
		return this.id == -1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1923596588"
	)
	void method2681() {
		this.field1161.method9793();
		this.field1176.method9793();
		this.players.clear();
		this.npcs.clear();
		this.worldEntities.clear();
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1814219322"
	)
	void method2680() {
		this.players.clear();

		Actor var2;
		for (Iterator var1 = this.npcs.iterator(); var1.hasNext(); var2.false0 = false) {
			var2 = (Actor)var1.next();
			var2.targetIndex = -1;
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)Lcv;",
		garbageValue = "-51"
	)
	Player method2683(int var1) {
		return (Player)this.players.get((long)var1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Lqs;",
		garbageValue = "90"
	)
	NodeDeque method2684() {
		return this.objectSounds;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIILib;II)V",
		garbageValue = "2089182867"
	)
	@Export("createObjectSound")
	void createObjectSound(int var1, int var2, int var3, ObjectComposition var4, int var5) {
		ObjectSound var6 = new ObjectSound(this.id, var1, var2, var3, var5, var4);
		this.objectSounds.addFirst(var6);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1463268347"
	)
	void method2686() {
		for (ObjectSound var1 = (ObjectSound)this.objectSounds.last(); var1 != null; var1 = (ObjectSound)this.objectSounds.previous()) {
			var1.method2252();
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIILib;IB)V",
		garbageValue = "2"
	)
	void method2687(int var1, int var2, int var3, ObjectComposition var4, int var5) {
		if (var4 != null && var4.hasSound()) {
			int var6 = var4.sizeX;
			int var7 = var4.sizeY;
			if (var5 == 1 || var5 == 3) {
				var6 = var4.sizeY;
				var7 = var4.sizeX;
			}

			int var8 = Coord.method7417(var6 + var2);
			int var9 = Coord.method7417(var3 + var7);
			var2 = Coord.method7417(var2);
			var3 = Coord.method7417(var3);
			int var10 = var4.ambientSoundId;
			int var11 = Coord.method7417(var4.int7);
			int var12 = Coord.method7417(var4.int8);
			if (var4.transforms != null) {
				ObjectComposition var13 = var4.transform();
				if (var13 != null) {
					var10 = var13.ambientSoundId;
					var11 = Coord.method7417(var13.int7);
					var12 = Coord.method7417(var13.int8);
				}
			}

			for (ObjectSound var14 = (ObjectSound)this.objectSounds.last(); var14 != null; var14 = (ObjectSound)this.objectSounds.previous()) {
				if (var14.method2260() == var1 && var14.method2254() == var2 && var14.method2317() == var3 && var14.method2255() == var8 && var14.method2257() == var9 && var14.method2290() == var10 && var14.method2259() == var11 && var14.method2300() == var12) {
					var14.method2252();
					break;
				}
			}
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "951678344"
	)
	protected static final int method2701() {
		return GameEngine.keyHandler.method381();
	}

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(Ldr;IIIIIIII[Ljava/lang/String;IIB)V",
		garbageValue = "-67"
	)
	static void method2702(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, String[] var9, int var10, int var11) {
		NodeDeque var12 = var0.pendingSpawns;
		PendingSpawn var13 = null;

		for (PendingSpawn var14 = (PendingSpawn)var12.last(); var14 != null; var14 = (PendingSpawn)var12.previous()) {
			if (var14.plane == var1 && var2 == var14.x && var3 == var14.y && var4 == var14.type) {
				var13 = var14;
				break;
			}
		}

		if (var13 == null) {
			var13 = new PendingSpawn();
			var13.plane = var1;
			var13.type = var4;
			var13.x = var2;
			var13.y = var3;
			var13.field1023 = -1;
			class108.method3388(var0, var13);
			var12.addFirst(var13);
		}

		var13.field1027 = var5;
		var13.field1029 = var6;
		var13.field1028 = var7;
		var13.delay = var10;
		var13.hitpoints = var11;
		var13.method2398(var8);
		var13.method2399(var9);
	}
}
