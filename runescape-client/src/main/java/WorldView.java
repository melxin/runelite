import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dm")
@Implements("WorldView")
public class WorldView extends Node {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	@Export("objectSounds")
	final NodeDeque objectSounds;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 342219453
	)
	@Export("id")
	public int id;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lih;"
	)
	@Export("scene")
	public Scene scene;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Lke;"
	)
	@Export("collisionMaps")
	CollisionMap[] collisionMaps;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1633830575
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1095188513
	)
	@Export("sizeX")
	public int sizeX;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1077011335
	)
	@Export("sizeY")
	public int sizeY;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1409092661
	)
	@Export("baseX")
	int baseX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 267347979
	)
	@Export("baseY")
	int baseY;
	@ObfuscatedName("aa")
	@Export("tileLastDrawnActor")
	int[][] tileLastDrawnActor;
	@ObfuscatedName("ap")
	@Export("tileHeights")
	int[][][] tileHeights;
	@ObfuscatedName("ad")
	@Export("tileSettings")
	byte[][][] tileSettings;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	@Export("players")
	public IndexedObjectSet players;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	@Export("npcs")
	IndexedObjectSet npcs;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	@Export("worldEntities")
	IterableNodeHashTable worldEntities;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[[[Lqf;"
	)
	@Export("groundItems")
	NodeDeque[][][] groundItems;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	@Export("pendingSpawns")
	NodeDeque pendingSpawns;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	@Export("graphicsObjects")
	NodeDeque graphicsObjects;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lsr;"
	)
	class484 field1169;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lsr;"
	)
	class484 field1170;

	@ObfuscatedSignature(
		descriptor = "(IIIILir;)V"
	)
	WorldView(int var1, int var2, int var3, int var4, class216 var5) {
		this.objectSounds = new NodeDeque();
		this.collisionMaps = new CollisionMap[4];
		this.pendingSpawns = new NodeDeque();
		this.graphicsObjects = new NodeDeque();
		this.field1169 = new class484(149);
		this.field1170 = new class484(25);
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "7"
	)
	boolean method2736() {
		return this.id == -1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2068872742"
	)
	void method2743() {
		this.field1169.method9888();
		this.field1170.method9888();
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
		descriptor = "(I)V",
		garbageValue = "-1570495960"
	)
	void method2739() {
		this.players.clear();

		Actor var2;
		for (Iterator var1 = this.npcs.iterator(); var1.hasNext(); var2.false0 = false) {
			var2 = (Actor)var1.next();
			var2.targetIndex = -1;
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Lcs;",
		garbageValue = "1190592204"
	)
	Player method2745(int var1) {
		return (Player)this.players.get((long)var1);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lqf;",
		garbageValue = "-390705206"
	)
	NodeDeque method2741() {
		return this.objectSounds;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIILia;II)V",
		garbageValue = "-758336980"
	)
	@Export("createObjectSound")
	void createObjectSound(int var1, int var2, int var3, ObjectComposition var4, int var5) {
		ObjectSound var6 = new ObjectSound(this.id, var1, var2, var3, var5, var4);
		this.objectSounds.addFirst(var6);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-115"
	)
	void method2747() {
		for (ObjectSound var1 = (ObjectSound)this.objectSounds.last(); var1 != null; var1 = (ObjectSound)this.objectSounds.previous()) {
			var1.method2286();
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIILia;II)V",
		garbageValue = "685871960"
	)
	void method2744(int var1, int var2, int var3, ObjectComposition var4, int var5) {
		if (var4 != null && var4.hasSound()) {
			int var6 = var4.sizeX;
			int var7 = var4.sizeY;
			if (var5 == 1 || var5 == 3) {
				var6 = var4.sizeY;
				var7 = var4.sizeX;
			}

			int var8 = Coord.method7440(var6 + var2);
			int var9 = Coord.method7440(var3 + var7);
			var2 = Coord.method7440(var2);
			var3 = Coord.method7440(var3);
			int var10 = var4.ambientSoundId;
			int var11 = Coord.method7440(var4.int7);
			int var12 = Coord.method7440(var4.int8);
			if (var4.transforms != null) {
				ObjectComposition var13 = var4.transform();
				if (var13 != null) {
					var10 = var13.ambientSoundId;
					var11 = Coord.method7440(var13.int7);
					var12 = Coord.method7440(var13.int8);
				}
			}

			for (ObjectSound var14 = (ObjectSound)this.objectSounds.last(); var14 != null; var14 = (ObjectSound)this.objectSounds.previous()) {
				if (var14.method2292() == var1 && var14.method2288() == var2 && var14.method2290() == var3 && var14.method2289() == var8 && var14.method2302() == var9 && var14.method2321() == var10 && var14.method2293() == var11 && var14.method2294() == var12) {
					var14.method2286();
					break;
				}
			}
		}

	}

	@ObfuscatedName("ab")
	public static double method2763(double var0, double var2, double var4) {
		double var8 = (var0 - var2) / var4;
		double var6 = Math.exp(-var8 * var8 / 2.0D) / Math.sqrt(6.283185307179586D);
		return var6 / var4;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IZIZI)V",
		garbageValue = "-1317271040"
	)
	@Export("sortWorldList")
	static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
		if (World.World_worlds != null) {
			ServerPacket.doWorldSorting(0, World.World_worlds.length - 1, var0, var1, var2, var3);
		}

	}
}
