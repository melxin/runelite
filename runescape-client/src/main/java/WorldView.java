import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dp")
@Implements("WorldView")
public class WorldView extends Node {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -825145433
	)
	int field1354;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	@Export("scene")
	public Scene scene;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Lkj;"
	)
	@Export("collisionMaps")
	CollisionMap[] collisionMaps;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -2066943567
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1118763905
	)
	@Export("sizeX")
	public int sizeX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1221502571
	)
	@Export("sizeY")
	public int sizeY;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1427471673
	)
	@Export("baseX")
	int baseX;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1397534037
	)
	@Export("baseY")
	int baseY;
	@ObfuscatedName("aa")
	@Export("tileLastDrawnActor")
	int[][] tileLastDrawnActor;
	@ObfuscatedName("as")
	@Export("tileHeights")
	int[][][] tileHeights;
	@ObfuscatedName("ae")
	@Export("tileSettings")
	byte[][][] tileSettings;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	class414 field1353;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	public class414 field1356;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lse;"
	)
	ModelData0 field1355;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lqv;"
	)
	IterableNodeHashTable field1358;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lse;"
	)
	ModelData0 field1357;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[[[Lqb;"
	)
	@Export("groundItems")
	NodeDeque[][][] groundItems;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	@Export("pendingSpawns")
	NodeDeque pendingSpawns;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	@Export("projectiles")
	NodeDeque projectiles;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	NodeDeque field1342;

	@ObfuscatedSignature(
		descriptor = "(IIIILio;)V"
	)
	WorldView(int var1, int var2, int var3, int var4, class232 var5) {
		this.collisionMaps = new CollisionMap[4];
		this.field1355 = new ModelData0(149);
		this.field1357 = new ModelData0(25);
		this.pendingSpawns = new NodeDeque();
		this.projectiles = new NodeDeque();
		this.field1342 = new NodeDeque();
		this.field1354 = var1;
		this.sizeX = var2;
		this.sizeY = var3;
		this.field1353 = new class414(var1 == -1 ? 512 : 8);
		this.field1356 = new class414(var1 == -1 ? 128 : 8);
		this.field1358 = new IterableNodeHashTable(var1 == -1 ? 32 : 1);
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
		descriptor = "(I)V",
		garbageValue = "294103836"
	)
	void method2823() {
		this.field1355.method9009();
		this.field1357.method9009();
		this.field1353.method7885();
		this.field1356.method7885();
		this.field1358.clear();
		this.projectiles.clear();
		this.field1342.clear();
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1435748252"
	)
	void method2824() {
		this.field1353.method7885();

		Actor var2;
		for (Iterator var1 = this.field1356.iterator(); var1.hasNext(); var2.isWalking = false) {
			var2 = (Actor)var1.next();
			var2.targetIndex = -1;
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILvy;I)Lgf;",
		garbageValue = "-1005551502"
	)
	public static PlayerCompositionColorTextureOverride method2834(int var0, Buffer var1) {
		int var2 = var1.readUnsignedByte();
		boolean var3 = (var2 & 1) != 0;
		boolean var4 = (var2 & 2) != 0;
		boolean var5 = (var2 & 4) != 0;
		boolean var6 = (var2 & 8) != 0;
		PlayerCompositionColorTextureOverride var7 = new PlayerCompositionColorTextureOverride(var0);
		int var8;
		int[] var9;
		boolean var10;
		int var11;
		short var12;
		if (var3) {
			var8 = var1.readUnsignedByte();
			var9 = new int[]{var8 & 15, var8 >> 4 & 15};
			var10 = var7.playerCompositionRecolorTo != null && var9.length == var7.playerCompositionRecolorTo.length;

			for (var11 = 0; var11 < 2; ++var11) {
				if (var9[var11] != 15) {
					var12 = (short)var1.readUnsignedShort();
					if (var10) {
						var7.playerCompositionRecolorTo[var9[var11]] = var12;
					}
				}
			}
		}

		if (var4) {
			var8 = var1.readUnsignedByte();
			var9 = new int[]{var8 & 15, var8 >> 4 & 15};
			var10 = var7.playerCompositionRetextureTo != null && var9.length == var7.playerCompositionRetextureTo.length;

			for (var11 = 0; var11 < 2; ++var11) {
				if (var9[var11] != 15) {
					var12 = (short)var1.readUnsignedShort();
					if (var10) {
						var7.playerCompositionRetextureTo[var9[var11]] = var12;
					}
				}
			}
		}

		if (var5) {
			var7.field1890 = var1.readUnsignedShort();
			var7.field1898 = var1.readUnsignedShort();
		}

		if (var6) {
			var7.field1891 = var1.readUnsignedShort();
			var7.field1893 = var1.readUnsignedShort();
		}

		return var7;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "53"
	)
	static void method2831() {
		Tiles.Tiles_underlays = null;
		Tiles.Tiles_overlays = null;
		Tiles.Tiles_shapes = null;
		Tiles.field1047 = null;
		Canvas.field98 = null;
		SpriteMask.Tiles_underlays2 = null;
		SecureUrlRequester.field1506 = null;
		Tiles.Tiles_hue = null;
		class592.Tiles_saturation = null;
		class447.Tiles_lightness = null;
		class330.Tiles_hueMultiplier = null;
		BoundaryObject.field3005 = null;
	}

	@ObfuscatedName("og")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1212919709"
	)
	static void method2835(boolean var0) {
		Client.leftClickOpensMenu = var0;
	}
}
