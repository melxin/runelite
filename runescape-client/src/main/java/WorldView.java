import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dd")
@Implements("WorldView")
public class WorldView extends Node {
	@ObfuscatedName("rd")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	static Widget field1149;
	@ObfuscatedName("uo")
	@ObfuscatedGetter(
		intValue = 436965041
	)
	static int field1142;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lrt;"
	)
	@Export("objectSounds")
	final NodeDeque objectSounds;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 577964535
	)
	@Export("id")
	public int id;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	@Export("scene")
	public Scene scene;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Lkk;"
	)
	@Export("collisionMaps")
	CollisionMap[] collisionMaps;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 2115028565
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 2010544793
	)
	@Export("sizeX")
	public int sizeX;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1823353167
	)
	@Export("sizeY")
	public int sizeY;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 825809917
	)
	@Export("baseX")
	int baseX;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1279964673
	)
	@Export("baseY")
	int baseY;
	@ObfuscatedName("ay")
	@Export("tileLastDrawnActor")
	int[][] tileLastDrawnActor;
	@ObfuscatedName("au")
	@Export("tileHeights")
	int[][][] tileHeights;
	@ObfuscatedName("az")
	@Export("tileSettings")
	byte[][][] tileSettings;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	@Export("players")
	public IndexedObjectSet players;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	@Export("npcs")
	public IndexedObjectSet npcs;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	@Export("worldEntities")
	IterableNodeHashTable worldEntities;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[[[Lrt;"
	)
	@Export("groundItems")
	NodeDeque[][][] groundItems;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lrt;"
	)
	@Export("pendingSpawns")
	NodeDeque pendingSpawns;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lrt;"
	)
	@Export("graphicsObjects")
	NodeDeque graphicsObjects;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lsr;"
	)
	class491 field1130;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lsr;"
	)
	class491 field1148;

	@ObfuscatedSignature(
		descriptor = "(IIIILjn;)V"
	)
	WorldView(int var1, int var2, int var3, int var4, TileRenderMode var5) {
		this.objectSounds = new NodeDeque();
		this.collisionMaps = new CollisionMap[4];
		this.pendingSpawns = new NodeDeque();
		this.graphicsObjects = new NodeDeque();
		this.field1130 = new class491(149);
		this.field1148 = new class491(25);
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	boolean method2791() {
		return this.id == -1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "710287567"
	)
	void method2792() {
		this.field1130.method10039();
		this.field1148.method10039();
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-77"
	)
	void method2768() {
		this.players.clear();

		Actor var2;
		for (Iterator var1 = this.npcs.iterator(); var1.hasNext(); var2.false0 = false) {
			var2 = (Actor)var1.next();
			var2.targetIndex = -1;
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Lci;",
		garbageValue = "1799324545"
	)
	Player method2769(int var1) {
		return (Player)this.players.get((long)var1);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lrt;",
		garbageValue = "-870499811"
	)
	NodeDeque method2789() {
		return this.objectSounds;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIILiv;II)V",
		garbageValue = "-1412759036"
	)
	@Export("createObjectSound")
	void createObjectSound(int var1, int var2, int var3, ObjectComposition var4, int var5) {
		ObjectSound var6 = new ObjectSound(this.id, var1, var2, var3, var5, var4);
		this.objectSounds.addFirst(var6);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-40"
	)
	void method2770() {
		for (ObjectSound var1 = (ObjectSound)this.objectSounds.last(); var1 != null; var1 = (ObjectSound)this.objectSounds.previous()) {
			var1.method2301();
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIILiv;II)V",
		garbageValue = "-576603424"
	)
	void method2773(int var1, int var2, int var3, ObjectComposition var4, int var5) {
		if (var4 != null && var4.hasSound()) {
			int var6 = var4.sizeX;
			int var7 = var4.sizeY;
			if (var5 == 1 || var5 == 3) {
				var6 = var4.sizeY;
				var7 = var4.sizeX;
			}

			int var8 = Coord.method7702(var6 + var2);
			int var9 = Coord.method7702(var3 + var7);
			var2 = Coord.method7702(var2);
			var3 = Coord.method7702(var3);
			int var10 = var4.ambientSoundId;
			int var11 = Coord.method7702(var4.int7);
			int var12 = Math.max(Coord.method7702(var4.int8 - 1), 0);
			if (var4.transforms != null) {
				ObjectComposition var13 = var4.transform();
				if (var13 != null) {
					var10 = var13.ambientSoundId;
					var11 = Coord.method7702(var13.int7);
					var12 = Math.max(Coord.method7702(var4.int8 - 1), 0);
				}
			}

			for (ObjectSound var14 = (ObjectSound)this.objectSounds.last(); var14 != null; var14 = (ObjectSound)this.objectSounds.previous()) {
				if (var14.method2347() == var1 && var14.method2303() == var2 && var14.method2305() == var3 && var14.method2377() == var8 && var14.method2306() == var9 && var14.method2302() == var10 && var14.method2368() == var11 && var14.method2309() == var12) {
					var14.method2301();
					break;
				}
			}
		}

	}
}
