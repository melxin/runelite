import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dl")
@Implements("WorldView")
public class WorldView extends Node {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lqk;"
	)
	@Export("objectSounds")
	final NodeDeque objectSounds;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -139155621
	)
	@Export("id")
	int id;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	@Export("scene")
	public Scene scene;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "[Lkf;"
	)
	@Export("collisionMaps")
	CollisionMap[] collisionMaps;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 792933123
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1099364355
	)
	@Export("sizeX")
	public int sizeX;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 583189071
	)
	@Export("sizeY")
	public int sizeY;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -714035305
	)
	@Export("baseX")
	int baseX;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1634749657
	)
	@Export("baseY")
	int baseY;
	@ObfuscatedName("ag")
	@Export("tileLastDrawnActor")
	int[][] tileLastDrawnActor;
	@ObfuscatedName("au")
	@Export("tileHeights")
	int[][][] tileHeights;
	@ObfuscatedName("ar")
	@Export("tileSettings")
	byte[][][] tileSettings;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lqx;"
	)
	@Export("players")
	IndexedObjectSet players;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lqx;"
	)
	@Export("npcs")
	public IndexedObjectSet npcs;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	@Export("worldEntities")
	IterableNodeHashTable worldEntities;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[[[Lqk;"
	)
	@Export("groundItems")
	NodeDeque[][][] groundItems;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lqk;"
	)
	@Export("pendingSpawns")
	NodeDeque pendingSpawns;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lqk;"
	)
	@Export("graphicsObjects")
	NodeDeque graphicsObjects;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lsw;"
	)
	class476 field1147;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lsw;"
	)
	class476 field1159;

	@ObfuscatedSignature(
		descriptor = "(IIIILiz;)V"
	)
	WorldView(int var1, int var2, int var3, int var4, class233 var5) {
		this.objectSounds = new NodeDeque();
		this.collisionMaps = new CollisionMap[4];
		this.pendingSpawns = new NodeDeque();
		this.graphicsObjects = new NodeDeque();
		this.field1147 = new class476(149);
		this.field1159 = new class476(25);
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	boolean method2548() {
		return this.id == -1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "41"
	)
	void method2530() {
		this.field1147.method9432();
		this.field1159.method9432();
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-45"
	)
	void method2531() {
		this.players.clear();

		Actor var2;
		for (Iterator var1 = this.npcs.iterator(); var1.hasNext(); var2.false0 = false) {
			var2 = (Actor)var1.next();
			var2.targetIndex = -1;
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Lcp;",
		garbageValue = "-1889777543"
	)
	Player method2532(int var1) {
		return (Player)this.players.get((long)var1);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lqk;",
		garbageValue = "-1284270171"
	)
	NodeDeque method2533() {
		return this.objectSounds;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIILik;II)V",
		garbageValue = "-736940831"
	)
	@Export("createObjectSound")
	void createObjectSound(int var1, int var2, int var3, ObjectComposition var4, int var5) {
		ObjectSound var6 = new ObjectSound(this.id, var1, var2, var3, var5, var4);
		this.objectSounds.addFirst(var6);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIILik;II)V",
		garbageValue = "1576849375"
	)
	void method2534(int var1, int var2, int var3, ObjectComposition var4, int var5) {
		if (var4 != null && var4.hasSound()) {
			int var6 = var4.sizeX;
			int var7 = var4.sizeY;
			if (var5 == 1 || var5 == 3) {
				var6 = var4.sizeY;
				var7 = var4.sizeX;
			}

			int var8 = Coord.method7228(var6 + var2);
			int var9 = Coord.method7228(var3 + var7);
			var2 = Coord.method7228(var2);
			var3 = Coord.method7228(var3);
			int var10 = var4.ambientSoundId;
			int var11 = Coord.method7228(var4.int7);
			int var12 = Coord.method7228(var4.int8);
			if (var4.transforms != null) {
				ObjectComposition var13 = var4.transform();
				if (var13 != null) {
					var10 = var13.ambientSoundId;
					var11 = Coord.method7228(var13.int7);
					var12 = Coord.method7228(var13.int8);
				}
			}

			for (ObjectSound var14 = (ObjectSound)this.objectSounds.last(); var14 != null; var14 = (ObjectSound)this.objectSounds.previous()) {
				if (var14.method1561() == var1 && var14.method1557() == var2 && var14.method1559() == var3 && var14.method1558() == var8 && var14.method1560() == var9 && var14.method1556() == var10 && var14.method1562() == var11 && var14.method1565() == var12) {
					var14.method1593();
					var14.method1555();
					var14.remove();
					break;
				}
			}
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Lva;",
		garbageValue = "77279217"
	)
	@Export("getDbRowType")
	public static DbRowType getDbRowType(int var0) {
		DbRowType var1 = (DbRowType)DbRowType.DBRowType_cache.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class559.field5585.takeFile(38, var0);
			var1 = new DbRowType();
			if (var2 != null) {
				var1.method10689(new Buffer(var2));
			}

			var1.method10692();
			DbRowType.DBRowType_cache.put(var1, (long)var0);
			return var1;
		}
	}
}
