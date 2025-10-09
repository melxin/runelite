import java.util.Arrays;
import java.util.BitSet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
@Implements("Scene")
public class Scene extends Renderable {
	@ObfuscatedName("ac")
	static final int[] field2687;
	@ObfuscatedName("aa")
	static final int[] field2762;
	@ObfuscatedName("ap")
	static final int[] field2691;
	@ObfuscatedName("ad")
	static final int[] field2692;
	@ObfuscatedName("av")
	static final int[] field2693;
	@ObfuscatedName("as")
	static final int[] field2755;
	@ObfuscatedName("ar")
	static final int[] field2695;
	@ObfuscatedName("ao")
	@Export("Scene_isLowDetail")
	public static boolean Scene_isLowDetail;
	@ObfuscatedName("dq")
	@Export("tileShape2D")
	static final int[][] tileShape2D;
	@ObfuscatedName("du")
	@Export("tileRotation2D")
	static final int[][] tileRotation2D;
	@ObfuscatedName("ax")
	final int field2700;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	@Export("modelColorOverride")
	public final ModelColorOverride modelColorOverride;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	final ModelColorOverride field2702;
	@ObfuscatedName("ai")
	final int field2747;
	@ObfuscatedName("am")
	final int field2758;
	@ObfuscatedName("al")
	@Export("worldViewId")
	final int worldViewId;
	@ObfuscatedName("ay")
	final int field2706;
	@ObfuscatedName("be")
	final int field2707;
	@ObfuscatedName("ba")
	final int field2759;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1515787825
	)
	final int field2709;
	@ObfuscatedName("bb")
	final int field2764;
	@ObfuscatedName("bn")
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "[[[Lif;"
	)
	@Export("tiles")
	Tile[][][] tiles;
	@ObfuscatedName("bm")
	@Export("Scene_plane")
	public int Scene_plane;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	public TransformationMatrix field2690;
	@ObfuscatedName("bu")
	public int field2715;
	@ObfuscatedName("bs")
	public int field2716;
	@ObfuscatedName("bq")
	public int field2717;
	@ObfuscatedName("bo")
	public float field2718;
	@ObfuscatedName("bx")
	@Export("Scene_baseX")
	int Scene_baseX;
	@ObfuscatedName("bp")
	@Export("Scene_baseY")
	int Scene_baseY;
	@ObfuscatedName("bz")
	public float field2714;
	@ObfuscatedName("bh")
	@Export("baseX")
	public int baseX;
	@ObfuscatedName("bc")
	@Export("baseY")
	public int baseY;
	@ObfuscatedName("bv")
	@Export("viewportWalking")
	boolean viewportWalking;
	@ObfuscatedName("bi")
	@Export("Scene_currentOccludersCount")
	int Scene_currentOccludersCount;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "[Ljp;"
	)
	@Export("Scene_currentOccluders")
	Occluder[] Scene_currentOccluders;
	@ObfuscatedName("br")
	@Export("planes")
	int planes;
	@ObfuscatedName("bf")
	@Export("xSize")
	int xSize;
	@ObfuscatedName("bl")
	@Export("ySize")
	int ySize;
	@ObfuscatedName("bd")
	@Export("tileHeights")
	int[][][] tileHeights;
	@ObfuscatedName("bt")
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("bk")
	@Export("tempGameObjectsCount")
	int tempGameObjectsCount;
	@ObfuscatedName("ca")
	int[][][] field2733;
	@ObfuscatedName("cy")
	@Export("Scene_cameraZ")
	int Scene_cameraZ;
	@ObfuscatedName("cj")
	@Export("tileUpdateCount")
	int tileUpdateCount;
	@ObfuscatedName("ce")
	@Export("Scene_drawnCount")
	int Scene_drawnCount;
	@ObfuscatedName("cl")
	@Export("Scene_cameraXTileMin")
	int Scene_cameraXTileMin;
	@ObfuscatedName("ci")
	@Export("Scene_cameraXTileMax")
	int Scene_cameraXTileMax;
	@ObfuscatedName("cq")
	@Export("Scene_cameraYTileMin")
	int Scene_cameraYTileMin;
	@ObfuscatedName("cp")
	@Export("Scene_cameraYTileMax")
	int Scene_cameraYTileMax;
	@ObfuscatedName("cw")
	@Export("Scene_cameraX")
	int Scene_cameraX;
	@ObfuscatedName("cn")
	@Export("Scene_cameraY")
	int Scene_cameraY;
	@ObfuscatedName("ck")
	@Export("Scene_cameraXTile")
	int Scene_cameraXTile;
	@ObfuscatedName("cx")
	@Export("Scene_cameraYTile")
	int Scene_cameraYTile;
	@ObfuscatedName("cb")
	@Export("Scene_entityX")
	int Scene_entityX;
	@ObfuscatedName("ct")
	@Export("Scene_entityY")
	int Scene_entityY;
	@ObfuscatedName("cf")
	int field2705;
	@ObfuscatedName("ch")
	int field2748;
	@ObfuscatedName("cs")
	public float field2749;
	@ObfuscatedName("cu")
	public float field2711;
	@ObfuscatedName("cz")
	public float field2751;
	@ObfuscatedName("cv")
	public float field2703;
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "[Lju;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("cc")
	@Export("checkClick")
	boolean checkClick;
	@ObfuscatedName("cd")
	@Export("Scene_selectedPlane")
	int Scene_selectedPlane;
	@ObfuscatedName("cm")
	@Export("Scene_selectedScreenX")
	int Scene_selectedScreenX;
	@ObfuscatedName("co")
	@Export("Scene_selectedScreenY")
	int Scene_selectedScreenY;
	@ObfuscatedName("cg")
	@Export("scenePlanesCount")
	int scenePlanesCount;
	@ObfuscatedName("dm")
	@Export("Scene_planeOccluderCounts")
	int[] Scene_planeOccluderCounts;
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "[[Ljp;"
	)
	@Export("Scene_planeOccluders")
	Occluder[][] Scene_planeOccluders;
	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	@Export("Scene_tilesDeque")
	NodeDeque Scene_tilesDeque;
	@ObfuscatedName("da")
	int field2721;
	@ObfuscatedName("dg")
	int field2765;
	@ObfuscatedName("dl")
	int field2750;
	@ObfuscatedName("df")
	int field2767;
	@ObfuscatedName("dy")
	int field2768;
	@ObfuscatedName("dn")
	int field2769;
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "[Lju;"
	)
	@Export("tempGameObjects")
	GameObject[] tempGameObjects;
	@ObfuscatedName("dc")
	@Export("Scene_offsetOccluder")
	int Scene_offsetOccluder;
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	class216 field2772;
	@ObfuscatedName("dv")
	int field2773;
	@ObfuscatedName("dz")
	int field2723;
	@ObfuscatedName("di")
	int[] field2774;
	@ObfuscatedName("dr")
	int field2776;
	@ObfuscatedName("dx")
	int field2777;
	@ObfuscatedName("do")
	int field2778;
	@ObfuscatedName("dk")
	int field2779;
	@ObfuscatedName("db")
	BitSet field2780;
	@ObfuscatedName("de")
	BitSet field2781;
	@ObfuscatedName("dj")
	BitSet field2742;
	@ObfuscatedName("dp")
	BitSet field2766;
	@ObfuscatedName("dw")
	int field2784;
	@ObfuscatedName("es")
	int field2694;

	static {
		field2687 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
		field2762 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
		field2691 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
		field2692 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
		field2693 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
		field2755 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
		field2695 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
		Scene_isLowDetail = false;
		tileShape2D = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
		tileRotation2D = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
	}

	@ObfuscatedSignature(
		descriptor = "(IIIIILir;[[[I)V"
	)
	public Scene(int var1, int var2, int var3, int var4, int var5, class216 var6, int[][][] var7) {
		this.modelColorOverride = new ModelColorOverride();
		this.field2702 = new ModelColorOverride();
		this.Scene_plane = 0;
		this.field2690 = new TransformationMatrix();
		this.field2715 = 0;
		this.field2716 = 0;
		this.field2717 = 0;
		this.field2718 = 1.0F;
		this.Scene_baseX = -1;
		this.Scene_baseY = -1;
		this.field2714 = -1.0F;
		this.baseX = -1;
		this.baseY = -1;
		this.viewportWalking = false;
		this.minPlane = 0;
		this.tempGameObjectsCount = 0;
		this.tileUpdateCount = 0;
		this.gameObjects = new GameObject[5];
		this.checkClick = false;
		this.Scene_selectedPlane = 0;
		this.Scene_selectedScreenX = 0;
		this.Scene_selectedScreenY = 0;
		this.scenePlanesCount = 4;
		this.Scene_tilesDeque = new NodeDeque();
		this.tempGameObjects = new GameObject[32];
		this.Scene_offsetOccluder = 0;
		this.field2772 = class216.field2511;
		this.field2773 = 0;
		this.field2723 = 0;
		this.field2774 = new int[9];
		this.planes = var2;
		this.xSize = var3;
		this.ySize = var4;
		this.tiles = new Tile[var2][var3][var4];
		this.field2733 = new int[var2][var3 + 1][var4 + 1];
		this.tileHeights = var7;
		this.Scene_offsetOccluder = var5;
		this.field2772 = var6;
		this.field2700 = var1;
		if (var1 != -1) {
			this.field2747 = 0;
			this.field2780 = null;
			this.field2781 = null;
			this.field2758 = 0;
			this.worldViewId = 0;
			this.field2706 = 0;
			this.field2707 = 0;
			this.field2742 = null;
			this.field2766 = null;
			this.field2759 = 0;
			this.field2709 = 0;
			this.field2764 = 0;
		} else {
			this.field2747 = 8386816;
			this.field2780 = new BitSet(this.field2747);
			this.field2781 = new BitSet(this.field2747);
			this.field2758 = 1048352;
			this.worldViewId = 32761;
			this.field2706 = 181;
			this.field2707 = 9644832;
			this.field2742 = new BitSet(this.field2707);
			this.field2766 = new BitSet(this.field2707);
			this.field2759 = 1071648;
			this.field2709 = 1;
			this.field2764 = 183;
			this.Scene_planeOccluderCounts = new int[this.scenePlanesCount];
			this.Scene_planeOccluders = new Occluder[this.scenePlanesCount][500];
			this.Scene_currentOccluders = new Occluder[500];
		}

		AbstractRasterizer.method5129(var5);
		this.clearTempGameObjects();
	}

	@ObfuscatedName("ah")
	@Export("clearTempGameObjects")
	public void clearTempGameObjects() {
		int var1;
		int var2;
		for (var1 = 0; var1 < this.planes; ++var1) {
			for (var2 = 0; var2 < this.xSize; ++var2) {
				for (int var3 = 0; var3 < this.ySize; ++var3) {
					this.tiles[var1][var2][var3] = null;
				}
			}
		}

		if (this.Scene_planeOccluderCounts != null) {
			for (var1 = 0; var1 < this.scenePlanesCount; ++var1) {
				for (var2 = 0; var2 < this.Scene_planeOccluderCounts[var1]; ++var2) {
					this.Scene_planeOccluders[var1][var2] = null;
				}

				this.Scene_planeOccluderCounts[var1] = 0;
			}
		}

		if (this.Scene_currentOccluders != null) {
			Arrays.fill(this.Scene_currentOccluders, (Object)null);
		}

		this.Scene_currentOccludersCount = 0;

		for (var1 = 0; var1 < this.tempGameObjectsCount; ++var1) {
			this.tempGameObjects[var1] = null;
		}

		this.tempGameObjectsCount = 0;

		for (var1 = 0; var1 < this.gameObjects.length; ++var1) {
			this.gameObjects[var1] = null;
		}

	}

	@ObfuscatedName("af")
	@Export("init")
	public void init(int var1) {
		this.minPlane = var1;

		for (int var2 = 0; var2 < this.xSize; ++var2) {
			for (int var3 = 0; var3 < this.ySize; ++var3) {
				if (this.tiles[var1][var2][var3] == null) {
					this.tiles[var1][var2][var3] = new Tile(var1, var2, var3);
				}
			}
		}

	}

	@ObfuscatedName("ae")
	@Export("setLinkBelow")
	public void setLinkBelow(int var1, int var2) {
		Tile var3 = this.tiles[0][var1][var2];

		for (int var4 = 0; var4 < 3; ++var4) {
			Tile var5 = this.tiles[var4][var1][var2] = this.tiles[var4 + 1][var1][var2];
			if (var5 != null) {
				--var5.plane;

				for (int var6 = 0; var6 < var5.gameObjectsCount; ++var6) {
					GameObject var7 = var5.gameObjects[var6];
					if (class32.method498(var7.tag) && var7.startX == var1 && var2 == var7.startY) {
						--var7.plane;
					}
				}
			}
		}

		if (this.tiles[0][var1][var2] == null) {
			this.tiles[0][var1][var2] = new Tile(0, var1, var2);
		}

		this.tiles[0][var1][var2].linkedBelowTile = var3;
		this.tiles[3][var1][var2] = null;
	}

	@ObfuscatedName("aq")
	@Export("Scene_addOccluder")
	public void Scene_addOccluder(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Occluder var9 = new Occluder();
		var9.minTileX = var3 / 128;
		var9.maxTileX = var4 / 128;
		var9.minTileY = var5 / 128;
		var9.maxTileY = var6 / 128;
		var9.type = var2;
		var9.minX = var3;
		var9.maxX = var4;
		var9.minZ = var5;
		var9.maxZ = var6;
		var9.minY = var7;
		var9.maxY = var8;
		this.Scene_planeOccluders[var1][this.Scene_planeOccluderCounts[var1]++] = var9;
	}

	@ObfuscatedName("ac")
	@Export("setTileMinPlane")
	public void setTileMinPlane(int var1, int var2, int var3, int var4) {
		Tile var5 = this.tiles[var1][var2][var3];
		if (var5 != null) {
			this.tiles[var1][var2][var3].minPlane = var4;
		}
	}

	@ObfuscatedName("az")
	@Export("addTile")
	public void addTile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
		SceneTilePaint var21;
		int var22;
		if (var4 == 0) {
			var21 = new SceneTilePaint(var11, var12, var13, var14, -1, var19, false);

			for (var22 = var1; var22 >= 0; --var22) {
				if (this.tiles[var22][var2][var3] == null) {
					this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
				}
			}

			this.tiles[var1][var2][var3].paint = var21;
		} else if (var4 != 1) {
			SceneTileModel var23 = new SceneTileModel(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);

			for (var22 = var1; var22 >= 0; --var22) {
				if (this.tiles[var22][var2][var3] == null) {
					this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
				}
			}

			this.tiles[var1][var2][var3].model = var23;
		} else {
			var21 = new SceneTilePaint(var15, var16, var17, var18, var6, var20, var8 == var7 && var7 == var9 && var10 == var7);

			for (var22 = var1; var22 >= 0; --var22) {
				if (this.tiles[var22][var2][var3] == null) {
					this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
				}
			}

			this.tiles[var1][var2][var3].paint = var21;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIILiy;JI)V"
	)
	@Export("newFloorDecoration")
	public void newFloorDecoration(int var1, int var2, int var3, int var4, Renderable var5, long var6, int var8) {
		if (var5 != null) {
			FloorDecoration var9 = new FloorDecoration();
			var9.renderable = var5;
			var9.x = var2 * 128 + 64;
			var9.y = var3 * 128 + 64;
			var9.z = var4;
			var9.tag = var6;
			var9.flags = var8;
			if (this.tiles[var1][var2][var3] == null) {
				this.tiles[var1][var2][var3] = new Tile(var1, var2, var3);
			}

			this.tiles[var1][var2][var3].floorDecoration = var9;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIILiy;JLiy;Liy;)V"
	)
	@Export("newGroundItemPile")
	public void newGroundItemPile(int var1, int var2, int var3, int var4, Renderable var5, long var6, Renderable var8, Renderable var9) {
		ItemLayer var10 = new ItemLayer();
		var10.first = var5;
		var10.x = var2 * 128 + 64;
		var10.y = var3 * 128 + 64;
		var10.z = var4;
		var10.tag = var6;
		var10.second = var8;
		var10.third = var9;
		int var11 = 0;
		Tile var12 = this.tiles[var1][var2][var3];
		if (var12 != null) {
			for (int var13 = 0; var13 < var12.gameObjectsCount; ++var13) {
				if ((var12.gameObjects[var13].flags & 256) == 256 && var12.gameObjects[var13].renderable instanceof Model) {
					Model var14 = (Model)var12.gameObjects[var13].renderable;
					var14.calculateBoundsCylinder();
					if (var14.height > var11) {
						var11 = var14.height;
					}
				}
			}
		}

		var10.height = var11;
		if (this.tiles[var1][var2][var3] == null) {
			this.tiles[var1][var2][var3] = new Tile(var1, var2, var3);
		}

		this.tiles[var1][var2][var3].itemLayer = var10;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIILiy;Liy;IIJI)V"
	)
	@Export("newBoundaryObject")
	public void newBoundaryObject(int var1, int var2, int var3, int var4, Renderable var5, Renderable var6, int var7, int var8, long var9, int var11) {
		if (var5 != null || var6 != null) {
			BoundaryObject var12 = new BoundaryObject();
			var12.tag = var9;
			var12.flags = var11;
			var12.x = var2 * 128 + 64;
			var12.y = var3 * 128 + 64;
			var12.z = var4;
			var12.renderable1 = var5;
			var12.renderable2 = var6;
			var12.orientationA = var7;
			var12.orientationB = var8;

			for (int var13 = var1; var13 >= 0; --var13) {
				if (this.tiles[var13][var2][var3] == null) {
					this.tiles[var13][var2][var3] = new Tile(var13, var2, var3);
				}
			}

			this.tiles[var1][var2][var3].boundaryObject = var12;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIIILiy;Liy;IIIIJI)V"
	)
	@Export("newWallDecoration")
	public void newWallDecoration(int var1, int var2, int var3, int var4, Renderable var5, Renderable var6, int var7, int var8, int var9, int var10, long var11, int var13) {
		if (var5 != null) {
			WallDecoration var14 = new WallDecoration();
			var14.tag = var11;
			var14.flags = var13;
			var14.x = var2 * 8192 + 4096;
			var14.y = var3 * 128 + 64;
			var14.z = var4;
			var14.renderable1 = var5;
			var14.renderable2 = var6;
			var14.orientation = var7;
			var14.orientation2 = var8;
			var14.method5847(var9, var10);

			for (int var15 = var1; var15 >= 0; --var15) {
				if (this.tiles[var15][var2][var3] == null) {
					this.tiles[var15][var2][var3] = new Tile(var15, var2, var3);
				}
			}

			this.tiles[var1][var2][var3].wallDecoration = var14;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILiy;IJI)Z"
	)
	public boolean method5168(int var1, int var2, int var3, int var4, int var5, int var6, Renderable var7, int var8, long var9, int var11) {
		if (var7 == null) {
			return true;
		} else {
			int var12 = var5 * 64 + var2 * 128;
			int var13 = var6 * 64 + var3 * 128;
			return this.newGameObject(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIIILiy;IJZ)Z"
	)
	@Export("drawEntity")
	public boolean drawEntity(int var1, int var2, int var3, int var4, int var5, Renderable var6, int var7, long var8, boolean var10) {
		if (var6 == null) {
			return true;
		} else {
			int var11 = var2 - var5;
			int var12 = var3 - var5;
			int var13 = var5 + var2;
			int var14 = var3 + var5;
			if (var10) {
				if (var7 > 640 && var7 < 1408) {
					var14 += 128;
				}

				if (var7 > 1152 && var7 < 1920) {
					var13 += 128;
				}

				if (var7 > 1664 || var7 < 384) {
					var12 -= 128;
				}

				if (var7 > 128 && var7 < 896) {
					var11 -= 128;
				}
			}

			var11 /= 128;
			var12 /= 128;
			var13 /= 128;
			var14 /= 128;
			return this.newGameObject(var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIIIILiy;IJIIII)Z"
	)
	@Export("addNullableObject")
	public boolean addNullableObject(int var1, int var2, int var3, int var4, int var5, Renderable var6, int var7, long var8, int var10, int var11, int var12, int var13) {
		return var6 == null ? true : this.newGameObject(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIILiy;IZJI)Z"
	)
	@Export("newGameObject")
	boolean newGameObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Renderable var9, int var10, boolean var11, long var12, int var14) {
		int var16;
		for (int var15 = var2; var15 < var2 + var4; ++var15) {
			for (var16 = var3; var16 < var3 + var5; ++var16) {
				if (var15 < 0 || var16 < 0 || var15 >= this.xSize || var16 >= this.ySize) {
					return false;
				}

				Tile var23 = this.tiles[var1][var15][var16];
				if (var23 != null && var23.gameObjectsCount >= 5) {
					return false;
				}
			}
		}

		GameObject var21 = new GameObject();
		var21.tag = var12;
		var21.flags = var14;
		var21.plane = var1;
		var21.centerX = var6;
		var21.centerY = var7;
		var21.z = var8;
		var21.renderable = var9;
		var21.orientation = var10;
		var21.startX = var2;
		var21.startY = var3;
		var21.endX = var2 + var4 - 1;
		var21.endY = var3 + var5 - 1;

		for (var16 = var2; var16 < var2 + var4; ++var16) {
			for (int var17 = var3; var17 < var3 + var5; ++var17) {
				int var18 = 0;
				if (var16 > var2) {
					++var18;
				}

				if (var16 < var2 + var4 - 1) {
					var18 += 4;
				}

				if (var17 > var3) {
					var18 += 8;
				}

				if (var17 < var3 + var5 - 1) {
					var18 += 2;
				}

				for (int var19 = var1; var19 >= 0; --var19) {
					if (this.tiles[var19][var16][var17] == null) {
						this.tiles[var19][var16][var17] = new Tile(var19, var16, var17);
					}
				}

				Tile var22 = this.tiles[var1][var16][var17];
				var22.gameObjects[var22.gameObjectsCount] = var21;
				var22.gameObjectEdgeMasks[var22.gameObjectsCount] = var18;
				var22.gameObjectsEdgeMask |= var18;
				++var22.gameObjectsCount;
			}
		}

		if (var11) {
			if (this.tempGameObjectsCount >= this.tempGameObjects.length) {
				this.tempGameObjects = (GameObject[])((GameObject[])Arrays.copyOf(this.tempGameObjects, this.tempGameObjects.length * 2));
			}

			this.tempGameObjects[this.tempGameObjectsCount++] = var21;
		}

		return true;
	}

	@ObfuscatedName("ay")
	@Export("setViewportWalking")
	public void setViewportWalking() {
		for (int var1 = 0; var1 < this.tempGameObjectsCount; ++var1) {
			GameObject var2 = this.tempGameObjects[var1];
			this.removeGameObject(var2);
			this.tempGameObjects[var1] = null;
		}

		this.tempGameObjectsCount = 0;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Lju;)V"
	)
	@Export("removeGameObject")
	void removeGameObject(GameObject var1) {
		for (int var2 = var1.startX; var2 <= var1.endX; ++var2) {
			for (int var3 = var1.startY; var3 <= var1.endY; ++var3) {
				Tile var4 = this.tiles[var1.plane][var2][var3];
				if (var4 != null) {
					int var5;
					for (var5 = 0; var5 < var4.gameObjectsCount; ++var5) {
						if (var4.gameObjects[var5] == var1) {
							--var4.gameObjectsCount;

							for (int var6 = var5; var6 < var4.gameObjectsCount; ++var6) {
								var4.gameObjects[var6] = var4.gameObjects[var6 + 1];
								var4.gameObjectEdgeMasks[var6] = var4.gameObjectEdgeMasks[var6 + 1];
							}

							var4.gameObjects[var4.gameObjectsCount] = null;
							break;
						}
					}

					var4.gameObjectsEdgeMask = 0;

					for (var5 = 0; var5 < var4.gameObjectsCount; ++var5) {
						var4.gameObjectsEdgeMask |= var4.gameObjectEdgeMasks[var5];
					}
				}
			}
		}

	}

	@ObfuscatedName("ba")
	public void method5300(int var1, int var2, int var3, int var4) {
		Tile var5 = this.tiles[var1][var2][var3];
		if (var5 != null) {
			WallDecoration var6 = var5.wallDecoration;
			if (var6 != null) {
				var6.method5847(var4 * var6.yOffset / 16, var4 * var6.field3046 / 16);
			}
		}
	}

	@ObfuscatedName("bj")
	@Export("removeBoundaryObject")
	public void removeBoundaryObject(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		if (var4 != null) {
			var4.boundaryObject = null;
		}
	}

	@ObfuscatedName("bb")
	@Export("removeWallDecoration")
	public void removeWallDecoration(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		if (var4 != null) {
			var4.wallDecoration = null;
		}
	}

	@ObfuscatedName("bn")
	@Export("removeGameObject")
	public void removeGameObject(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		if (var4 != null) {
			for (int var5 = 0; var5 < var4.gameObjectsCount; ++var5) {
				GameObject var6 = var4.gameObjects[var5];
				if (class32.method498(var6.tag) && var2 == var6.startX && var3 == var6.startY) {
					this.removeGameObject(var6);
					return;
				}
			}

		}
	}

	@ObfuscatedName("by")
	@Export("removeFloorDecoration")
	public void removeFloorDecoration(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		if (var4 != null) {
			var4.floorDecoration = null;
		}
	}

	@ObfuscatedName("bm")
	@Export("removeGroundItemPile")
	public void removeGroundItemPile(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		if (var4 != null) {
			var4.itemLayer = null;
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(III)Lji;"
	)
	@Export("getBoundaryObject")
	public BoundaryObject getBoundaryObject(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		return var4 == null ? null : var4.boundaryObject;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(III)Ljk;"
	)
	@Export("getWallDecoration")
	public WallDecoration getWallDecoration(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		return var4 == null ? null : var4.wallDecoration;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(III)Lju;"
	)
	@Export("getGameObject")
	public GameObject getGameObject(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		if (var4 == null) {
			return null;
		} else {
			for (int var5 = 0; var5 < var4.gameObjectsCount; ++var5) {
				GameObject var6 = var4.gameObjects[var5];
				if (class32.method498(var6.tag) && var2 == var6.startX && var3 == var6.startY) {
					return var6;
				}
			}

			return null;
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(III)Lin;"
	)
	@Export("getFloorDecoration")
	public FloorDecoration getFloorDecoration(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		return var4 != null && var4.floorDecoration != null ? var4.floorDecoration : null;
	}

	@ObfuscatedName("bo")
	@Export("getBoundaryObjectTag")
	public long getBoundaryObjectTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		return var4 != null && var4.boundaryObject != null ? var4.boundaryObject.tag : 0L;
	}

	@ObfuscatedName("bx")
	@Export("getWallDecorationTag")
	public long getWallDecorationTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		return var4 != null && var4.wallDecoration != null ? var4.wallDecoration.tag : 0L;
	}

	@ObfuscatedName("bp")
	@Export("getGameObjectTag")
	public long getGameObjectTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		if (var4 == null) {
			return 0L;
		} else {
			for (int var5 = 0; var5 < var4.gameObjectsCount; ++var5) {
				GameObject var6 = var4.gameObjects[var5];
				if (class32.method498(var6.tag) && var2 == var6.startX && var3 == var6.startY) {
					return var6.tag;
				}
			}

			return 0L;
		}
	}

	@ObfuscatedName("bz")
	@Export("getFloorDecorationTag")
	public long getFloorDecorationTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		return var4 != null && var4.floorDecoration != null ? var4.floorDecoration.tag : 0L;
	}

	@ObfuscatedName("bh")
	@Export("getObjectFlags")
	public int getObjectFlags(int var1, int var2, int var3, long var4) {
		Tile var6 = this.tiles[var1][var2][var3];
		if (var6 == null) {
			return -1;
		} else if (var6.boundaryObject != null && var6.boundaryObject.tag == var4) {
			return var6.boundaryObject.flags & 255;
		} else if (var6.wallDecoration != null && var6.wallDecoration.tag == var4) {
			return var6.wallDecoration.flags & 255;
		} else if (var6.floorDecoration != null && var6.floorDecoration.tag == var4) {
			return var6.floorDecoration.flags & 255;
		} else {
			for (int var7 = 0; var7 < var6.gameObjectsCount; ++var7) {
				if (var6.gameObjects[var7].tag == var4) {
					return var6.gameObjects[var7].flags & 255;
				}
			}

			return -1;
		}
	}

	@ObfuscatedName("bc")
	public void method5189(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.planes; ++var4) {
			for (int var5 = 0; var5 < this.xSize; ++var5) {
				for (int var6 = 0; var6 < this.ySize; ++var6) {
					Tile var7 = this.tiles[var4][var5][var6];
					if (var7 != null) {
						BoundaryObject var8 = var7.boundaryObject;
						ModelData var10;
						if (var8 != null && var8.renderable1 instanceof ModelData) {
							ModelData var9 = (ModelData)var8.renderable1;
							this.method5191(var9, var4, var5, var6, 1, 1);
							if (var8.renderable2 instanceof ModelData) {
								var10 = (ModelData)var8.renderable2;
								this.method5191(var10, var4, var5, var6, 1, 1);
								ModelData.method4943(var9, var10, 0, 0, 0, false);
								var8.renderable2 = var10.toModel(var10.ambient, var10.contrast, var1, var2, var3);
							}

							var8.renderable1 = var9.toModel(var9.ambient, var9.contrast, var1, var2, var3);
						}

						for (int var12 = 0; var12 < var7.gameObjectsCount; ++var12) {
							GameObject var14 = var7.gameObjects[var12];
							if (var14 != null && var14.renderable instanceof ModelData) {
								ModelData var11 = (ModelData)var14.renderable;
								this.method5191(var11, var4, var5, var6, var14.endX - var14.startX + 1, var14.endY - var14.startY + 1);
								var14.renderable = var11.toModel(var11.ambient, var11.contrast, var1, var2, var3);
							}
						}

						FloorDecoration var13 = var7.floorDecoration;
						if (var13 != null && var13.renderable instanceof ModelData) {
							var10 = (ModelData)var13.renderable;
							this.method5322(var10, var4, var5, var6);
							var13.renderable = var10.toModel(var10.ambient, var10.contrast, var1, var2, var3);
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Lib;III)V"
	)
	void method5322(ModelData var1, int var2, int var3, int var4) {
		int var6 = var3 + 1;
		int var7 = var4 - 1;
		int var8 = var4 + 1;

		for (int var9 = var3; var9 <= var6; ++var9) {
			if (var9 >= 0 && var9 < this.xSize) {
				for (int var10 = var7; var10 <= var8; ++var10) {
					if (var10 >= 0 && var10 < this.ySize && (var9 >= var6 || var10 >= var8)) {
						Tile var11 = this.tiles[var2][var9][var10];
						if (var11 != null && var11.floorDecoration != null && var11.floorDecoration.renderable instanceof ModelData) {
							int var12 = this.method5224(var2, var9, var10, var2, var3, var4);
							ModelData var13 = (ModelData)var11.floorDecoration.renderable;
							ModelData.method4943(var1, var13, (var9 - var3) * 128, var12, (var10 - var4) * 128, true);
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Lib;IIIII)V"
	)
	void method5191(ModelData var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true;
		int var8 = var3;
		int var9 = var3 + var5;
		int var10 = var4 - 1;
		int var11 = var4 + var6;

		for (int var12 = var2; var12 <= var2 + 1; ++var12) {
			if (var12 != this.planes) {
				for (int var13 = var8; var13 <= var9; ++var13) {
					if (var13 >= 0 && var13 < this.xSize) {
						for (int var14 = var10; var14 <= var11; ++var14) {
							if (var14 >= 0 && var14 < this.ySize && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var3 != var13)) {
								Tile var15 = this.tiles[var12][var13][var14];
								if (var15 != null) {
									int var16 = this.method5224(var12, var13, var14, var2, var3, var4);
									BoundaryObject var17 = var15.boundaryObject;
									if (var17 != null) {
										ModelData var18;
										if (var17.renderable1 instanceof ModelData) {
											var18 = (ModelData)var17.renderable1;
											ModelData.method4943(var1, var18, (1 - var5) * 64 + (var13 - var3) * 128, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
										}

										if (var17.renderable2 instanceof ModelData) {
											var18 = (ModelData)var17.renderable2;
											ModelData.method4943(var1, var18, (1 - var5) * 64 + (var13 - var3) * 128, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
										}
									}

									for (int var23 = 0; var23 < var15.gameObjectsCount; ++var23) {
										GameObject var19 = var15.gameObjects[var23];
										if (var19 != null && var19.renderable instanceof ModelData) {
											ModelData var20 = (ModelData)var19.renderable;
											int var21 = var19.endX - var19.startX + 1;
											int var22 = var19.endY - var19.startY + 1;
											ModelData.method4943(var1, var20, (var21 - var5) * 64 + (var19.startX - var3) * 128, var16, (var19.startY - var4) * 128 + (var22 - var6) * 64, var7);
										}
									}
								}
							}
						}
					}
				}

				--var8;
				var7 = false;
			}
		}

	}

	@ObfuscatedName("bw")
	int method5224(int var1, int var2, int var3, int var4, int var5, int var6) {
		return this.method5209(var1, var2, var3) - this.method5209(var4, var5, var6);
	}

	@ObfuscatedName("br")
	int method5209(int var1, int var2, int var3) {
		return (this.tileHeights[var1][var2 + 1][var3 + 1] + this.tileHeights[var1][var2][var3] + this.tileHeights[var1][var2][var3 + 1] + this.tileHeights[var1][var2 + 1][var3]) / 4;
	}

	@ObfuscatedName("bf")
	@Export("drawTileMinimap")
	public void drawTileMinimap(int[] var1, int var2, int var3, int var4, int var5, int var6) {
		Tile var7 = this.tiles[var4][var5][var6];
		if (var7 != null) {
			SceneTilePaint var8 = var7.paint;
			int var10;
			if (var8 != null) {
				int var18 = var8.rgb;
				if (var18 != 0) {
					for (var10 = 0; var10 < 4; ++var10) {
						var1[var2] = var18;
						var1[var2 + 1] = var18;
						var1[var2 + 2] = var18;
						var1[var2 + 3] = var18;
						var2 += var3;
					}

				}
			} else {
				SceneTileModel var9 = var7.model;
				if (var9 != null) {
					var10 = var9.shape;
					int var11 = var9.rotation;
					int var12 = var9.underlayRgb;
					int var13 = var9.overlayRgb;
					int[] var14 = tileShape2D[var10];
					int[] var15 = tileRotation2D[var11];
					int var16 = 0;
					int var17;
					if (var12 != 0) {
						for (var17 = 0; var17 < 4; ++var17) {
							var1[var2] = var14[var15[var16++]] == 0 ? var12 : var13;
							var1[var2 + 1] = var14[var15[var16++]] == 0 ? var12 : var13;
							var1[var2 + 2] = var14[var15[var16++]] == 0 ? var12 : var13;
							var1[var2 + 3] = var14[var15[var16++]] == 0 ? var12 : var13;
							var2 += var3;
						}
					} else {
						for (var17 = 0; var17 < 4; ++var17) {
							if (var14[var15[var16++]] != 0) {
								var1[var2] = var13;
							}

							if (var14[var15[var16++]] != 0) {
								var1[var2 + 1] = var13;
							}

							if (var14[var15[var16++]] != 0) {
								var1[var2 + 2] = var13;
							}

							if (var14[var15[var16++]] != 0) {
								var1[var2 + 3] = var13;
							}

							var2 += var3;
						}
					}

				}
			}
		}
	}

	@ObfuscatedName("bl")
	public void method5195(int var1) {
		this.Scene_offsetOccluder = KeyHandler.method396(25, 90, var1);
		AbstractRasterizer.method5129(this.Scene_offsetOccluder);
		if (this.field2774 != null && this.field2774.length > 0) {
			this.method5405(this.field2774, this.field2776, this.field2777, this.field2778, this.field2779);
		}

	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Lir;)V"
	)
	public void method5171(class216 var1) {
		if (var1 != this.field2772) {
			this.field2772 = var1;
			this.method5405(this.field2774, this.field2776, this.field2777, this.field2778, this.field2779);
		}

	}

	@ObfuscatedName("bt")
	boolean method5197(BitSet var1, int var2, int var3, int var4, int var5) {
		return var1.get(var5 + var4 * this.field2706 + var2 * this.field2758 + var3 * this.worldViewId);
	}

	@ObfuscatedName("bk")
	boolean method5198(BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
		var1.set(var5 + var4 * this.field2706 + var2 * this.field2758 + var3 * this.worldViewId, var6);
		return var6;
	}

	@ObfuscatedName("ca")
	boolean method5400(int var1, int var2, int var3, int var4) {
		return this.method5197(this.field2780, var1, var2, var3, var4);
	}

	@ObfuscatedName("cy")
	boolean method5200(int var1, int var2, int var3, int var4, boolean var5) {
		return this.method5198(this.field2780, var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("cl")
	boolean method5233(int var1, int var2, int var3, int var4) {
		return this.method5197(this.field2781, var1, var2, var3, var4);
	}

	@ObfuscatedName("ci")
	boolean method5202(int var1, int var2, int var3, int var4, boolean var5) {
		return this.method5198(this.field2781, var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("cq")
	boolean method5203(BitSet var1, int var2, int var3, int var4, int var5) {
		return var1.get(var5 + var4 * this.field2764 + var3 * this.field2709 * 33489 + var2 * this.field2759);
	}

	@ObfuscatedName("cp")
	boolean method5204(BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
		var1.set(var5 + var4 * this.field2764 + var3 * this.field2709 * 33489 + var2 * this.field2759, var6);
		return var6;
	}

	@ObfuscatedName("cw")
	boolean method5205(int var1, int var2, int var3, int var4) {
		return this.method5203(this.field2742, var1, var2, var3, var4);
	}

	@ObfuscatedName("cn")
	boolean method5206(int var1, int var2, int var3, int var4, boolean var5) {
		return this.method5204(this.field2742, var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("ck")
	boolean method5207(int var1, int var2, int var3, int var4) {
		return this.method5203(this.field2766, var1, var2, var3, var4);
	}

	@ObfuscatedName("cx")
	boolean method5208(int var1, int var2, int var3, int var4, boolean var5) {
		return this.method5204(this.field2766, var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("cb")
	public void method5405(int[] var1, int var2, int var3, int var4, int var5) {
		this.field2774 = var1;
		this.field2776 = var2;
		this.field2777 = var3;
		this.field2778 = var4;
		this.field2779 = var5;
		this.field2750 = 0;
		this.field2767 = 0;
		this.field2768 = var4;
		this.field2769 = var5;
		this.field2721 = var4 / 2;
		this.field2765 = var5 / 2;
		this.field2781.set(0, this.field2781.size());
		this.field2766.set(0, this.field2766.size());
	}

	@ObfuscatedName("ct")
	@Export("visibilityMap")
	void visibilityMap(int var1, int var2) {
		this.field2784 = var1;
		this.field2694 = var2;
	}

	@ObfuscatedName("cf")
	@Export("visibleTiles")
	boolean visibleTiles(int var1, int var2) {
		if (!this.method5233(this.field2784, this.field2694, var1, var2)) {
			return this.method5400(this.field2784, this.field2694, var1, var2);
		} else {
			this.method5202(this.field2784, this.field2694, var1, var2, false);
			boolean var3 = false;

			for (int var4 = -1; var4 <= 1; ++var4) {
				for (int var5 = -1; var5 <= 1; ++var5) {
					if (this.method5212(this.field2784, this.field2694, var4 + var1 + 1, var5 + var2 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}

					if (this.method5212(this.field2784, (this.field2694 + 1) % 31, var4 + var1 + 1, var5 + var2 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}

					if (this.method5212(this.field2784 + 1, this.field2694, var4 + var1 + 1, var5 + var2 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}

					if (this.method5212(this.field2784 + 1, (this.field2694 + 1) % 31, var4 + var1 + 1, var5 + var2 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}
				}
			}

			return this.method5200(this.field2784, this.field2694, var1, var2, var3);
		}
	}

	@ObfuscatedName("ch")
	boolean method5212(int var1, int var2, int var3, int var4) {
		if (!this.method5207(var1, var2, var3, var4)) {
			return this.method5205(var1, var2, var3, var4);
		} else {
			this.method5208(var1, var2, var3, var4, false);
			int var5 = var1 * 32 + 128;
			int var6 = var2 * 64;
			int var7 = (var3 - this.Scene_offsetOccluder - this.field2773 - 1) * 128;
			int var8 = (var4 - this.Scene_offsetOccluder - this.field2723 - 1) * 128;

			for (int var9 = -this.field2776; var9 <= this.field2777; var9 += 128) {
				if (this.method5258(var7, var9 + this.field2774[var1], var8, var5, var6)) {
					return this.method5206(var1, var2, var3, var4, true);
				}
			}

			return this.method5206(var1, var2, var3, var4, false);
		}
	}

	@ObfuscatedName("cs")
	boolean method5258(int var1, int var2, int var3, int var4, int var5) {
		int[] var6 = Rasterizer3D.Rasterizer3D_sine;
		int[] var7 = Rasterizer3D.Rasterizer3D_cosine;
		int var8 = var6[var4];
		int var9 = var7[var4];
		int var10 = var6[var5];
		int var11 = var7[var5];
		int var12 = var11 * var1 + var3 * var10 >> 16;
		int var13 = var3 * var11 - var10 * var1 >> 16;
		int var14 = var13 * var9 + var8 * var2 >> 16;
		int var15 = var9 * var2 - var13 * var8 >> 16;
		if (var14 >= 50 && var14 <= AbstractRasterizer.method5112()) {
			int var16 = var12 * 128 / var14 + this.field2721;
			int var17 = var15 * 128 / var14 + this.field2765;
			return var16 >= this.field2750 && var16 <= this.field2768 && var17 >= this.field2767 && var17 <= this.field2769;
		} else {
			return false;
		}
	}

	@ObfuscatedName("cz")
	@Export("menuOpen")
	public void menuOpen(boolean var1) {
		if (!this.shouldSendWalk() || var1) {
			this.checkClick = true;
			this.viewportWalking = var1;
			this.baseX = -1;
			this.baseY = -1;
		}
	}

	@ObfuscatedName("cv")
	public void method5172(int var1, int var2, int var3) {
		this.Scene_selectedPlane = var1;
		this.Scene_selectedScreenX = var2;
		this.Scene_selectedScreenY = var3;
	}

	@ObfuscatedName("cr")
	public void method5216() {
		this.viewportWalking = true;
	}

	@ObfuscatedName("cc")
	@Export("shouldSendWalk")
	public boolean shouldSendWalk() {
		return this.viewportWalking && this.baseX != -1;
	}

	@ObfuscatedName("cd")
	@Export("processWalkClick")
	void processWalkClick() {
		if (this.checkClick) {
			this.checkClick = false;
			this.baseX = this.Scene_baseX;
			this.baseY = this.Scene_baseY;
		}

	}

	@ObfuscatedName("cm")
	public void method5219() {
		this.baseX = -1;
		this.viewportWalking = false;
	}

	@ObfuscatedName("co")
	@Export("draw")
	public void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		if (var1 < 0) {
			var1 = 0;
		} else if (var1 >= this.xSize * 128) {
			var1 = this.xSize * 128 - 1;
		}

		if (var3 < 0) {
			var3 = 0;
		} else if (var3 >= this.ySize * 128) {
			var3 = this.ySize * 128 - 1;
		}

		if (var4 < 128) {
			var4 = 128;
		} else if (var4 > 383) {
			var4 = 383;
		}

		this.field2749 = Rasterizer3D.field2636[var4];
		this.field2711 = Rasterizer3D.field2632[var4];
		this.field2751 = Rasterizer3D.field2636[var5];
		this.field2703 = Rasterizer3D.field2632[var5];
		this.visibilityMap((var4 - 128) / 32, var5 / 64);
		this.Scene_cameraX = var1;
		this.Scene_cameraY = var2;
		this.Scene_cameraZ = var3;
		this.Scene_cameraXTile = var1 / 128;
		this.Scene_cameraYTile = var3 / 128;
		this.Scene_entityX = var7 / 128;
		this.Scene_entityY = var8 / 128;
		this.Scene_plane = var6;
		IntProjection var10 = new IntProjection(var1, var2, var3, var4, var5, var7, var8);
		if (Rasterizer3D.method5002()) {
			Rasterizer3D.clips.field2999 = 0;
			this.method5230(var10, var9, true);
			Rasterizer3D.clips.field2999 = 1;
			this.method5230(var10, var9, false);
			Rasterizer3D.clips.field2999 = 2;
		} else {
			Rasterizer3D.clips.field2999 = 2;
			this.method5230(var10, var9, true);
		}

	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(Ljf;ZZ)V"
	)
	void method5230(Projection var1, boolean var2, boolean var3) {
		++this.Scene_drawnCount;
		this.field2702.method5737(Rasterizer3D.clips.field3001);
		Rasterizer3D.clips.field3001.method5737(this.modelColorOverride);
		boolean var4 = this.field2700 == -1;
		if (var3) {
			this.Scene_baseX = -1;
			this.Scene_baseY = -1;
			this.field2714 = -1.0F;
			this.field2705 = !var2 && this.field2772 != class216.field2511 ? this.Scene_entityX : this.Scene_cameraXTile;
			this.field2748 = !var2 && this.field2772 != class216.field2511 ? this.Scene_entityY : this.Scene_cameraYTile;
			if (var4) {
				this.Scene_cameraXTileMin = this.field2705 - this.Scene_offsetOccluder;
				if (this.Scene_cameraXTileMin < 0) {
					this.Scene_cameraXTileMin = 0;
				}

				this.Scene_cameraYTileMin = this.field2748 - this.Scene_offsetOccluder;
				if (this.Scene_cameraYTileMin < 0) {
					this.Scene_cameraYTileMin = 0;
				}

				this.Scene_cameraXTileMax = this.field2705 + this.Scene_offsetOccluder;
				if (this.Scene_cameraXTileMax > this.xSize) {
					this.Scene_cameraXTileMax = this.xSize;
				}

				this.Scene_cameraYTileMax = this.field2748 + this.Scene_offsetOccluder;
				if (this.Scene_cameraYTileMax > this.ySize) {
					this.Scene_cameraYTileMax = this.ySize;
				}
			} else {
				this.Scene_cameraXTileMin = 0;
				this.Scene_cameraYTileMin = 0;
				this.Scene_cameraXTileMax = this.xSize;
				this.Scene_cameraYTileMax = this.ySize;
				this.field2705 = this.xSize / 2;
				this.field2748 = this.ySize / 2;
				this.Scene_offsetOccluder = Math.max(this.field2705, this.field2748);
			}

			this.field2773 = this.Scene_cameraXTile - this.field2705;
			this.field2723 = this.Scene_cameraYTile - this.field2748;
			if (var4) {
				this.occlude();
			}
		}

		if (Rasterizer3D.clips.field2999 == 0) {
			this.updateVisibleTilesAndOccluders(var1, var4);
		} else {
			this.method5223(var1, var4);
		}

	}

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "(Ljf;Z)V"
	)
	@Export("updateVisibleTilesAndOccluders")
	void updateVisibleTilesAndOccluders(Projection var1, boolean var2) {
		this.tileUpdateCount = 0;

		for (int var3 = this.minPlane; var3 < this.planes; ++var3) {
			Tile[][] var4 = this.tiles[var3];

			for (int var5 = this.Scene_cameraXTileMin; var5 < this.Scene_cameraXTileMax; ++var5) {
				for (int var6 = this.Scene_cameraYTileMin; var6 < this.Scene_cameraYTileMax; ++var6) {
					Tile var7 = var4[var5][var6];
					if (var7 != null && var7.minPlane <= this.Scene_plane && (!var2 || this.visibleTiles(var5 - this.Scene_cameraXTile + this.field2773 + this.Scene_offsetOccluder, var6 - this.Scene_cameraYTile + this.field2723 + this.Scene_offsetOccluder) || this.tileHeights[var3][var5][var6] - this.Scene_cameraY >= 2000)) {
						this.method5180(var1, var7);
					}
				}
			}
		}

		this.processWalkClick();
		Rasterizer3D.clips.field3001.method5737(this.field2702);
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(Ljf;Z)V"
	)
	void method5223(Projection var1, boolean var2) {
		this.tileUpdateCount = 0;

		int var3;
		int var5;
		for (var3 = this.minPlane; var3 < this.planes; ++var3) {
			Tile[][] var14 = this.tiles[var3];

			for (var5 = this.Scene_cameraXTileMin; var5 < this.Scene_cameraXTileMax; ++var5) {
				for (int var15 = this.Scene_cameraYTileMin; var15 < this.Scene_cameraYTileMax; ++var15) {
					Tile var16 = var14[var5][var15];
					if (var16 != null) {
						if (var16.minPlane > this.Scene_plane || var2 && !this.visibleTiles(var5 - this.Scene_cameraXTile + this.field2773 + this.Scene_offsetOccluder, var15 - this.Scene_cameraYTile + this.field2723 + this.Scene_offsetOccluder) && this.tileHeights[var3][var5][var15] - this.Scene_cameraY < 2000) {
							var16.drawPrimary = false;
							var16.drawSecondary = false;
							var16.drawGameObjectEdges = 0;
						} else {
							var16.drawPrimary = true;
							var16.drawSecondary = true;
							if (var16.gameObjectsCount > 0) {
								var16.drawGameObjects = true;
							} else {
								var16.drawGameObjects = false;
							}

							++this.tileUpdateCount;
						}
					}
				}
			}
		}

		var3 = Math.abs(this.field2773);
		int var4 = Math.abs(this.field2723);

		Tile[][] var6;
		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		int var12;
		Tile var13;
		for (var5 = this.minPlane; var5 < this.planes; ++var5) {
			var6 = this.tiles[var5];

			for (var7 = -(var3 + this.Scene_offsetOccluder); var7 <= 0; ++var7) {
				var8 = var7 + this.Scene_cameraXTile;
				var9 = this.Scene_cameraXTile - var7;
				if (var8 >= this.Scene_cameraXTileMin || var9 < this.Scene_cameraXTileMax) {
					for (var10 = -(var4 + this.Scene_offsetOccluder); var10 <= 0; ++var10) {
						var11 = var10 + this.Scene_cameraYTile;
						var12 = this.Scene_cameraYTile - var10;
						if (var8 >= this.Scene_cameraXTileMin && var8 < this.Scene_cameraXTileMax) {
							if (var11 >= this.Scene_cameraYTileMin && var11 < this.Scene_cameraYTileMax) {
								var13 = var6[var8][var11];
								if (var13 != null && var13.drawPrimary) {
									this.drawTile(var1, var13, true);
								}
							}

							if (var12 >= this.Scene_cameraYTileMin && var12 < this.Scene_cameraYTileMax) {
								var13 = var6[var8][var12];
								if (var13 != null && var13.drawPrimary) {
									this.drawTile(var1, var13, true);
								}
							}
						}

						if (var9 >= this.Scene_cameraXTileMin && var9 < this.Scene_cameraXTileMax) {
							if (var11 >= this.Scene_cameraYTileMin && var11 < this.Scene_cameraYTileMax) {
								var13 = var6[var9][var11];
								if (var13 != null && var13.drawPrimary) {
									this.drawTile(var1, var13, true);
								}
							}

							if (var12 >= this.Scene_cameraYTileMin && var12 < this.Scene_cameraYTileMax) {
								var13 = var6[var9][var12];
								if (var13 != null && var13.drawPrimary) {
									this.drawTile(var1, var13, true);
								}
							}
						}

						if (this.tileUpdateCount == 0) {
							this.processWalkClick();
							Rasterizer3D.clips.field3001.method5737(this.field2702);
							return;
						}
					}
				}
			}
		}

		for (var5 = this.minPlane; var5 < this.planes; ++var5) {
			var6 = this.tiles[var5];

			for (var7 = -(var3 + this.Scene_offsetOccluder); var7 <= 0; ++var7) {
				var8 = var7 + this.field2705;
				var9 = this.field2705 - var7;
				if (var8 >= this.Scene_cameraXTileMin || var9 < this.Scene_cameraXTileMax) {
					for (var10 = -(var4 + this.Scene_offsetOccluder); var10 <= 0; ++var10) {
						var11 = var10 + this.field2748;
						var12 = this.field2748 - var10;
						if (var8 >= this.Scene_cameraXTileMin && var8 < this.Scene_cameraXTileMax) {
							if (var11 >= this.Scene_cameraYTileMin && var11 < this.Scene_cameraYTileMax) {
								var13 = var6[var8][var11];
								if (var13 != null && var13.drawPrimary) {
									this.drawTile(var1, var13, false);
								}
							}

							if (var12 >= this.Scene_cameraYTileMin && var12 < this.Scene_cameraYTileMax) {
								var13 = var6[var8][var12];
								if (var13 != null && var13.drawPrimary) {
									this.drawTile(var1, var13, false);
								}
							}
						}

						if (var9 >= this.Scene_cameraXTileMin && var9 < this.Scene_cameraXTileMax) {
							if (var11 >= this.Scene_cameraYTileMin && var11 < this.Scene_cameraYTileMax) {
								var13 = var6[var9][var11];
								if (var13 != null && var13.drawPrimary) {
									this.drawTile(var1, var13, false);
								}
							}

							if (var12 >= this.Scene_cameraYTileMin && var12 < this.Scene_cameraYTileMax) {
								var13 = var6[var9][var12];
								if (var13 != null && var13.drawPrimary) {
									this.drawTile(var1, var13, false);
								}
							}
						}

						if (this.tileUpdateCount == 0) {
							this.processWalkClick();
							Rasterizer3D.clips.field3001.method5737(this.field2702);
							return;
						}
					}
				}
			}
		}

		Rasterizer3D.clips.field3001.method5737(this.field2702);
		this.processWalkClick();
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(Ljf;Lif;Z)V"
	)
	@Export("drawTile")
	void drawTile(Projection var1, Tile var2, boolean var3) {
		this.Scene_tilesDeque.addFirst(var2);

		while (true) {
			Tile var4;
			int var5;
			int var6;
			int var7;
			int var8;
			Tile[][] var9;
			Tile var10;
			int var12;
			int var15;
			int var16;
			int var24;
			int var25;
			do {
				do {
					do {
						do {
							do {
								label596:
								do {
									while (true) {
										BoundaryObject var11;
										GameObject var13;
										int var17;
										int var18;
										int var19;
										boolean var20;
										int var21;
										Tile var36;
										while (true) {
											do {
												var4 = (Tile)this.Scene_tilesDeque.removeLast();
												if (var4 == null) {
													return;
												}
											} while(!var4.drawSecondary);

											var5 = var4.x;
											var6 = var4.y;
											var7 = var4.plane;
											var8 = var4.originalPlane;
											var9 = this.tiles[var7];
											if (!var4.drawPrimary) {
												break;
											}

											if (var3) {
												if (var7 > 0) {
													var10 = this.tiles[var7 - 1][var5][var6];
													if (var10 != null && var10.drawSecondary) {
														continue;
													}
												}

												if (var5 <= this.Scene_cameraXTile && var5 > this.Scene_cameraXTileMin) {
													var10 = var9[var5 - 1][var6];
													if (var10 != null && var10.drawSecondary && (var10.drawPrimary || (var4.gameObjectsEdgeMask & 1) == 0)) {
														continue;
													}
												}

												if (var5 >= this.Scene_cameraXTile && var5 < this.Scene_cameraXTileMax - 1) {
													var10 = var9[var5 + 1][var6];
													if (var10 != null && var10.drawSecondary && (var10.drawPrimary || (var4.gameObjectsEdgeMask & 4) == 0)) {
														continue;
													}
												}

												if (var6 <= this.Scene_cameraYTile && var6 > this.Scene_cameraYTileMin) {
													var10 = var9[var5][var6 - 1];
													if (var10 != null && var10.drawSecondary && (var10.drawPrimary || (var4.gameObjectsEdgeMask & 8) == 0)) {
														continue;
													}
												}

												if (var6 >= this.Scene_cameraYTile && var6 < this.Scene_cameraYTileMax - 1) {
													var10 = var9[var5][var6 + 1];
													if (var10 != null && var10.drawSecondary && (var10.drawPrimary || (var4.gameObjectsEdgeMask & 2) == 0)) {
														continue;
													}
												}
											} else {
												var3 = true;
											}

											var4.drawPrimary = false;
											if (var4.linkedBelowTile != null) {
												var10 = var4.linkedBelowTile;
												if (var10.paint != null) {
													if (!this.method5227(0, var5, var6)) {
														var1.drawTileUnderlay(this, var10.paint, 0, var5, var6);
													}
												} else if (var10.model != null && !this.method5227(0, var5, var6)) {
													var1.drawTileOverlay(this, var10.model, var5, var6);
												}

												var11 = var10.boundaryObject;
												if (var11 != null) {
													var1.draw(var11.renderable1, 0, var11.x * 4096, var11.z, var11.y * 4096, var11.tag);
												}

												for (var12 = 0; var12 < var10.gameObjectsCount; ++var12) {
													var13 = var10.gameObjects[var12];
													if (var13 != null) {
														var1.draw(var13.renderable, var13.orientation, var13.centerX, var13.z, var13.centerY, var13.tag);
													}
												}
											}

											var20 = false;
											if (var4.paint != null) {
												if (!this.method5227(var8, var5, var6)) {
													var20 = true;
													if (var4.paint.neColor != 12345678 || var7 <= this.Scene_selectedPlane) {
														var1.drawTileUnderlay(this, var4.paint, var8, var5, var6);
													}
												}
											} else if (var4.model != null && !this.method5227(var8, var5, var6)) {
												var20 = true;
												var1.drawTileOverlay(this, var4.model, var5, var6);
											}

											var21 = 0;
											var12 = 0;
											BoundaryObject var31 = var4.boundaryObject;
											WallDecoration var14 = var4.wallDecoration;
											if (var31 != null || var14 != null) {
												if (var5 == this.Scene_cameraXTile) {
													++var21;
												} else if (this.Scene_cameraXTile < var5) {
													var21 += 2;
												}

												if (var6 == this.Scene_cameraYTile) {
													var21 += 3;
												} else if (this.Scene_cameraYTile > var6) {
													var21 += 6;
												}

												var12 = field2687[var21];
												var4.field2622 = field2691[var21];
											}

											if (var31 != null) {
												if ((var31.orientationA & field2762[var21]) != 0) {
													if (var31.orientationA == 16) {
														var4.drawGameObjectEdges = 3;
														var4.field2612 = field2692[var21];
														var4.field2621 = 3 - var4.field2612;
													} else if (var31.orientationA == 32) {
														var4.drawGameObjectEdges = 6;
														var4.field2612 = field2693[var21];
														var4.field2621 = 6 - var4.field2612;
													} else if (var31.orientationA == 64) {
														var4.drawGameObjectEdges = 12;
														var4.field2612 = field2755[var21];
														var4.field2621 = 12 - var4.field2612;
													} else {
														var4.drawGameObjectEdges = 9;
														var4.field2612 = field2695[var21];
														var4.field2621 = 9 - var4.field2612;
													}
												} else {
													var4.drawGameObjectEdges = 0;
												}

												if ((var31.orientationA & var12) != 0 && !this.method5228(var8, var5, var6, var31.orientationA)) {
													var1.draw(var31.renderable1, 0, var31.x * 4096, var31.z, var31.y * 4096, var31.tag);
												}

												if ((var31.orientationB & var12) != 0 && !this.method5228(var8, var5, var6, var31.orientationB)) {
													var1.draw(var31.renderable2, 0, var31.x * 4096, var31.z, var31.y * 4096, var31.tag);
												}
											}

											if (var14 != null && !this.method5229(var8, var5, var6, var14.renderable1.height)) {
												if ((var14.orientation & var12) != 0) {
													var1.draw(var14.renderable1, 0, var14.x * 64 + var14.xOffset, var14.z, var14.y * 4096 + var14.field3044, var14.tag);
												} else if (var14.orientation == 256) {
													var15 = var14.x * 64 - this.Scene_cameraX;
													var16 = var14.y * 4096 - this.Scene_cameraZ;
													var17 = var14.orientation2;
													if (var17 != 1 && var17 != 2) {
														var18 = var15;
													} else {
														var18 = -var15;
													}

													if (var17 != 2 && var17 != 3) {
														var19 = var16;
													} else {
														var19 = -var16;
													}

													if (var19 < var18) {
														var1.draw(var14.renderable1, 0, var14.x * 64 + var14.xOffset, var14.z, var14.y * 4096 + var14.field3044, var14.tag);
													} else if (var14.renderable2 != null) {
														var1.draw(var14.renderable2, 0, var14.x * 64, var14.z, var14.y * 4096, var14.tag);
													}
												}
											}

											if (var20) {
												FloorDecoration var22 = var4.floorDecoration;
												if (var22 != null) {
													var1.draw(var22.renderable, 0, var22.x * 4096, var22.z, var22.y * 4096, var22.tag);
												}

												ItemLayer var23 = var4.itemLayer;
												if (var23 != null && var23.height == 0) {
													if (var23.second != null) {
														var1.draw(var23.second, 0, var23.x * 4096, var23.z, var23.y * 4096, var23.tag);
													}

													if (var23.third != null) {
														var1.draw(var23.third, 0, var23.x * 4096, var23.z, var23.y * 4096, var23.tag);
													}

													if (var23.first != null) {
														var1.draw(var23.first, 0, var23.x * 4096, var23.z, var23.y * 4096, var23.tag);
													}
												}
											}

											var15 = var4.gameObjectsEdgeMask;
											if (var15 != 0) {
												if (var5 < this.Scene_cameraXTile && var5 >= this.Scene_cameraXTileMin && var5 < this.Scene_cameraXTileMax - 1 && (var15 & 4) != 0) {
													var36 = var9[var5 + 1][var6];
													if (var36 != null && var36.drawSecondary) {
														this.Scene_tilesDeque.addFirst(var36);
													}
												}

												if (var6 < this.Scene_cameraYTile && var6 >= this.Scene_cameraYTileMin && var6 < this.Scene_cameraYTileMax - 1 && (var15 & 2) != 0) {
													var36 = var9[var5][var6 + 1];
													if (var36 != null && var36.drawSecondary) {
														this.Scene_tilesDeque.addFirst(var36);
													}
												}

												if (var5 > this.Scene_cameraXTile && var5 > this.Scene_cameraXTileMin && var5 < this.Scene_cameraXTileMax && (var15 & 1) != 0) {
													var36 = var9[var5 - 1][var6];
													if (var36 != null && var36.drawSecondary) {
														this.Scene_tilesDeque.addFirst(var36);
													}
												}

												if (var6 > this.Scene_cameraYTile && var6 > this.Scene_cameraYTileMin && var6 < this.Scene_cameraYTileMax && (var15 & 8) != 0) {
													var36 = var9[var5][var6 - 1];
													if (var36 != null && var36.drawSecondary) {
														this.Scene_tilesDeque.addFirst(var36);
													}
												}
											}
											break;
										}

										if (var4.drawGameObjectEdges != 0) {
											var20 = true;

											for (var21 = 0; var21 < var4.gameObjectsCount; ++var21) {
												if (var4.gameObjects[var21].lastDrawn != this.Scene_drawnCount && (var4.gameObjectEdgeMasks[var21] & var4.drawGameObjectEdges) == var4.field2612) {
													var20 = false;
													break;
												}
											}

											if (var20) {
												var11 = var4.boundaryObject;
												if (!this.method5228(var8, var5, var6, var11.orientationA)) {
													var1.draw(var11.renderable1, 0, var11.x * 4096, var11.z, var11.y * 4096, var11.tag);
												}

												var4.drawGameObjectEdges = 0;
											}
										}

										if (!var4.drawGameObjects) {
											break;
										}

										try {
											int var34 = var4.gameObjectsCount;
											var4.drawGameObjects = false;
											var21 = 0;

											label588:
											for (var12 = 0; var12 < var34; ++var12) {
												var13 = var4.gameObjects[var12];
												if (var13.lastDrawn != this.Scene_drawnCount) {
													for (var24 = var13.startX; var24 <= var13.endX; ++var24) {
														for (var15 = var13.startY; var15 <= var13.endY; ++var15) {
															var36 = var9[var24][var15];
															if (var36.drawPrimary) {
																var4.drawGameObjects = true;
																continue label588;
															}

															if (var36.drawGameObjectEdges != 0) {
																var17 = 0;
																if (var24 > var13.startX) {
																	++var17;
																}

																if (var24 < var13.endX) {
																	var17 += 4;
																}

																if (var15 > var13.startY) {
																	var17 += 8;
																}

																if (var15 < var13.endY) {
																	var17 += 2;
																}

																if ((var17 & var36.drawGameObjectEdges) == var4.field2621) {
																	var4.drawGameObjects = true;
																	continue label588;
																}
															}
														}
													}

													this.gameObjects[var21++] = var13;
													var24 = this.Scene_cameraXTile - var13.startX;
													var15 = var13.endX - this.Scene_cameraXTile;
													if (var15 > var24) {
														var24 = var15;
													}

													var16 = this.Scene_cameraYTile - var13.startY;
													var17 = var13.endY - this.Scene_cameraYTile;
													if (var17 > var16) {
														var13.field3060 = var24 + var17;
													} else {
														var13.field3060 = var24 + var16;
													}
												}
											}

											while (true) {
												var12 = -50;
												var25 = -1;

												for (var24 = 0; var24 < var21; ++var24) {
													GameObject var35 = this.gameObjects[var24];
													if (var35.lastDrawn != this.Scene_drawnCount) {
														if (var35.field3060 > var12) {
															var12 = var35.field3060;
															var25 = var24;
														} else if (var12 == var35.field3060) {
															var16 = var35.centerX - this.Scene_cameraX;
															var17 = var35.centerY - this.Scene_cameraZ;
															var18 = this.gameObjects[var25].centerX - this.Scene_cameraX;
															var19 = this.gameObjects[var25].centerY - this.Scene_cameraZ;
															if (var16 * var16 + var17 * var17 > var18 * var18 + var19 * var19) {
																var25 = var24;
															}
														}
													}
												}

												if (var25 == -1) {
													if (var4.drawGameObjects) {
														break;
													}
													continue label596;
												}

												GameObject var33 = this.gameObjects[var25];
												var33.lastDrawn = this.Scene_drawnCount;
												if (!this.method5397(var8, var33.startX, var33.endX, var33.startY, var33.endY, var33.renderable.height)) {
													var1.draw(var33.renderable, var33.orientation, var33.centerX, var33.z, var33.centerY, var33.tag);
												}

												for (var15 = var33.startX; var15 <= var33.endX; ++var15) {
													for (var16 = var33.startY; var16 <= var33.endY; ++var16) {
														Tile var26 = var9[var15][var16];
														if (var26.drawGameObjectEdges != 0) {
															this.Scene_tilesDeque.addFirst(var26);
														} else if ((var15 != var5 || var16 != var6) && var26.drawSecondary) {
															this.Scene_tilesDeque.addFirst(var26);
														}
													}
												}
											}
										} catch (Exception var28) {
											var4.drawGameObjects = false;
											break;
										}
									}
								} while(!var4.drawSecondary);
							} while(var4.drawGameObjectEdges != 0);

							if (var5 > this.Scene_cameraXTile || var5 <= this.Scene_cameraXTileMin) {
								break;
							}

							var10 = var9[var5 - 1][var6];
						} while(var10 != null && var10.drawSecondary);

						if (var5 < this.Scene_cameraXTile || var5 >= this.Scene_cameraXTileMax - 1) {
							break;
						}

						var10 = var9[var5 + 1][var6];
					} while(var10 != null && var10.drawSecondary);

					if (var6 > this.Scene_cameraYTile || var6 <= this.Scene_cameraYTileMin) {
						break;
					}

					var10 = var9[var5][var6 - 1];
				} while(var10 != null && var10.drawSecondary);

				if (var6 < this.Scene_cameraYTile || var6 >= this.Scene_cameraYTileMax - 1) {
					break;
				}

				var10 = var9[var5][var6 + 1];
			} while(var10 != null && var10.drawSecondary);

			var4.drawSecondary = false;
			--this.tileUpdateCount;
			ItemLayer var32 = var4.itemLayer;
			if (var32 != null && var32.height != 0) {
				if (var32.second != null) {
					var1.draw(var32.second, 0, var32.x * 4096, var32.z - var32.height, var32.y * 4096, var32.tag);
				}

				if (var32.third != null) {
					var1.draw(var32.third, 0, var32.x * 4096, var32.z - var32.height, var32.y * 4096, var32.tag);
				}

				if (var32.first != null) {
					var1.draw(var32.first, 0, var32.x * 4096, var32.z - var32.height, var32.y * 4096, var32.tag);
				}
			}

			if (var4.field2622 != 0) {
				WallDecoration var29 = var4.wallDecoration;
				if (var29 != null && !this.method5229(var8, var5, var6, var29.renderable1.height)) {
					if ((var29.orientation & var4.field2622) != 0) {
						var1.draw(var29.renderable1, 0, var29.x * 64 + var29.xOffset, var29.z, var29.y * 4096 + var29.field3044, var29.tag);
					} else if (var29.orientation == 256) {
						var12 = var29.x * 64 - this.Scene_cameraX;
						var25 = var29.y * 4096 - this.Scene_cameraZ;
						var24 = var29.orientation2;
						if (var24 != 1 && var24 != 2) {
							var15 = var12;
						} else {
							var15 = -var12;
						}

						if (var24 != 2 && var24 != 3) {
							var16 = var25;
						} else {
							var16 = -var25;
						}

						if (var16 >= var15) {
							var1.draw(var29.renderable1, 0, var29.x * 64 + var29.xOffset, var29.z, var29.y * 4096 + var29.field3044, var29.tag);
						} else if (var29.renderable2 != null) {
							var1.draw(var29.renderable2, 0, var29.x * 64, var29.z, var29.y * 4096, var29.tag);
						}
					}
				}

				BoundaryObject var27 = var4.boundaryObject;
				if (var27 != null) {
					if ((var27.orientationB & var4.field2622) != 0 && !this.method5228(var8, var5, var6, var27.orientationB)) {
						var1.draw(var27.renderable2, 0, var27.x * 4096, var27.z, var27.y * 4096, var27.tag);
					}

					if ((var27.orientationA & var4.field2622) != 0 && !this.method5228(var8, var5, var6, var27.orientationA)) {
						var1.draw(var27.renderable1, 0, var27.x * 4096, var27.z, var27.y * 4096, var27.tag);
					}
				}
			}

			Tile var30;
			if (var7 < this.planes - 1) {
				var30 = this.tiles[var7 + 1][var5][var6];
				if (var30 != null && var30.drawSecondary) {
					this.Scene_tilesDeque.addFirst(var30);
				}
			}

			if (var5 < this.Scene_cameraXTile && var5 >= this.Scene_cameraXTileMin && var5 < this.Scene_cameraXTileMax - 1) {
				var30 = var9[var5 + 1][var6];
				if (var30 != null && var30.drawSecondary) {
					this.Scene_tilesDeque.addFirst(var30);
				}
			}

			if (var6 < this.Scene_cameraYTile && var6 >= this.Scene_cameraYTileMin && var6 < this.Scene_cameraYTileMax - 1) {
				var30 = var9[var5][var6 + 1];
				if (var30 != null && var30.drawSecondary) {
					this.Scene_tilesDeque.addFirst(var30);
				}
			}

			if (var5 > this.Scene_cameraXTile && var5 > this.Scene_cameraXTileMin && var5 < this.Scene_cameraXTileMax) {
				var30 = var9[var5 - 1][var6];
				if (var30 != null && var30.drawSecondary) {
					this.Scene_tilesDeque.addFirst(var30);
				}
			}

			if (var6 > this.Scene_cameraYTile && var6 > this.Scene_cameraYTileMin && var6 < this.Scene_cameraYTileMax) {
				var30 = var9[var5][var6 - 1];
				if (var30 != null && var30.drawSecondary) {
					this.Scene_tilesDeque.addFirst(var30);
				}
			}
		}
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(Ljf;Lif;)V"
	)
	void method5180(Projection var1, Tile var2) {
		if (var2 != null) {
			int var3 = var2.x;
			int var4 = var2.y;
			int var5 = var2.plane;
			int var6 = var2.originalPlane;
			if (var2.plane == 0 && var2.linkedBelowTile != null) {
				this.method5180(var1, var2.linkedBelowTile);
			}

			if (var2.paint != null) {
				if (!this.method5227(var6, var3, var4) && (var2.paint.neColor != 12345678 || var5 <= this.Scene_selectedPlane)) {
					var1.drawTileUnderlay(this, var2.paint, var6, var3, var4);
				}
			} else if (var2.model != null && !this.method5227(var6, var3, var4)) {
				var1.drawTileOverlay(this, var2.model, var3, var4);
			}

			BoundaryObject var7 = var2.boundaryObject;
			if (var7 != null) {
				if (var7.renderable1 != null && !this.method5228(var6, var3, var4, var7.orientationA)) {
					var1.draw(var7.renderable1, 0, var7.x * 4096, var7.z, var7.y * 4096, var7.tag);
				}

				if (var7.renderable2 != null && !this.method5228(var6, var3, var4, var7.orientationB)) {
					var1.draw(var7.renderable2, 0, var7.x * 4096, var7.z, var7.y * 4096, var7.tag);
				}
			}

			WallDecoration var8 = var2.wallDecoration;
			if (var8 != null && !this.method5229(var6, var3, var4, var8.renderable1.height)) {
				if (var8.orientation == 256) {
					var1.draw(var8.renderable1, 0, var8.x * 64 + var8.xOffset, var8.z, var8.y * 4096 + var8.field3044, var8.tag);
					if (var8.renderable2 != null) {
						var1.draw(var8.renderable2, 0, var8.x * 64, var8.z, var8.y * 4096, var8.tag);
					}
				} else {
					var1.draw(var8.renderable1, 0, var8.x * 64 + var8.xOffset, var8.z, var8.y * 4096 + var8.field3044, var8.tag);
				}
			}

			FloorDecoration var9 = var2.floorDecoration;
			if (var9 != null) {
				var1.draw(var9.renderable, 0, var9.x * 4096, var9.z, var9.y * 4096, var9.tag);
			}

			ItemLayer var10 = var2.itemLayer;
			if (var10 != null) {
				if (var10.second != null) {
					var1.draw(var10.second, 0, var10.x * 4096, var10.z - var10.height, var10.y * 4096, var10.tag);
				}

				if (var10.third != null) {
					var1.draw(var10.third, 0, var10.x * 4096, var10.z - var10.height, var10.y * 4096, var10.tag);
				}

				if (var10.first != null) {
					var1.draw(var10.first, 0, var10.x * 4096, var10.z - var10.height, var10.y * 4096, var10.tag);
				}
			}

			for (int var11 = 0; var11 < var2.gameObjectsCount; ++var11) {
				GameObject var12 = var2.gameObjects[var11];
				var12.lastDrawn = this.Scene_drawnCount;
				if (var2.x == var12.startX && var2.y == var12.startY && !this.method5397(var6, var12.startX, var12.endX, var12.startY, var12.endY, var12.renderable.height)) {
					var1.draw(var12.renderable, var12.orientation, var12.centerX, var12.z, var12.centerY, var12.tag);
				}
			}

		}
	}

	@ObfuscatedName("du")
	@Export("occlude")
	void occlude() {
		int var1 = this.Scene_planeOccluderCounts[this.Scene_plane];
		Occluder[] var2 = this.Scene_planeOccluders[this.Scene_plane];
		this.Scene_currentOccludersCount = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			Occluder var4 = var2[var3];
			int var5;
			int var6;
			int var7;
			int var9;
			boolean var13;
			if (var4.type == 1) {
				var5 = var4.minTileX - this.Scene_cameraXTile + this.Scene_offsetOccluder;
				if (var5 >= 0 && var5 <= this.Scene_offsetOccluder + this.Scene_offsetOccluder) {
					var6 = var4.minTileY - this.Scene_cameraYTile + this.Scene_offsetOccluder;
					if (var6 < 0) {
						var6 = 0;
					}

					var7 = var4.maxTileY - this.Scene_cameraYTile + this.Scene_offsetOccluder;
					if (var7 > this.Scene_offsetOccluder + this.Scene_offsetOccluder) {
						var7 = this.Scene_offsetOccluder + this.Scene_offsetOccluder;
					}

					var13 = false;

					while (var6 <= var7) {
						if (this.visibleTiles(var5, var6++)) {
							var13 = true;
							break;
						}
					}

					if (var13) {
						var9 = this.Scene_cameraX - var4.minX;
						if (var9 > 32) {
							var4.field2823 = 1;
						} else {
							if (var9 >= -32) {
								continue;
							}

							var4.field2823 = 2;
							var9 = -var9;
						}

						var4.field2820 = (var4.minZ - this.Scene_cameraZ << 8) / var9;
						var4.field2827 = (var4.maxZ - this.Scene_cameraZ << 8) / var9;
						var4.field2828 = (var4.minY - this.Scene_cameraY << 8) / var9;
						var4.field2829 = (var4.maxY - this.Scene_cameraY << 8) / var9;
						this.Scene_currentOccluders[this.Scene_currentOccludersCount++] = var4;
					}
				}
			} else if (var4.type == 2) {
				var5 = var4.minTileY - this.Scene_cameraYTile + this.Scene_offsetOccluder;
				if (var5 >= 0 && var5 <= this.Scene_offsetOccluder + this.Scene_offsetOccluder) {
					var6 = var4.minTileX - this.Scene_cameraXTile + this.Scene_offsetOccluder;
					if (var6 < 0) {
						var6 = 0;
					}

					var7 = var4.maxTileX - this.Scene_cameraXTile + this.Scene_offsetOccluder;
					if (var7 > this.Scene_offsetOccluder + this.Scene_offsetOccluder) {
						var7 = this.Scene_offsetOccluder + this.Scene_offsetOccluder;
					}

					var13 = false;

					while (var6 <= var7) {
						if (this.visibleTiles(var6++, var5)) {
							var13 = true;
							break;
						}
					}

					if (var13) {
						var9 = this.Scene_cameraZ - var4.minZ;
						if (var9 > 32) {
							var4.field2823 = 3;
						} else {
							if (var9 >= -32) {
								continue;
							}

							var4.field2823 = 4;
							var9 = -var9;
						}

						var4.field2812 = (var4.minX - this.Scene_cameraX << 8) / var9;
						var4.field2825 = (var4.maxX - this.Scene_cameraX << 8) / var9;
						var4.field2828 = (var4.minY - this.Scene_cameraY << 8) / var9;
						var4.field2829 = (var4.maxY - this.Scene_cameraY << 8) / var9;
						this.Scene_currentOccluders[this.Scene_currentOccludersCount++] = var4;
					}
				}
			} else if (var4.type == 4) {
				var5 = var4.minY - this.Scene_cameraY;
				if (var5 > 128) {
					var6 = var4.minTileY - this.Scene_cameraYTile + this.Scene_offsetOccluder;
					if (var6 < 0) {
						var6 = 0;
					}

					var7 = var4.maxTileY - this.Scene_cameraYTile + this.Scene_offsetOccluder;
					if (var7 > this.Scene_offsetOccluder + this.Scene_offsetOccluder) {
						var7 = this.Scene_offsetOccluder + this.Scene_offsetOccluder;
					}

					if (var6 <= var7) {
						int var8 = var4.minTileX - this.Scene_cameraXTile + this.Scene_offsetOccluder;
						if (var8 < 0) {
							var8 = 0;
						}

						var9 = var4.maxTileX - this.Scene_cameraXTile + this.Scene_offsetOccluder;
						if (var9 > this.Scene_offsetOccluder + this.Scene_offsetOccluder) {
							var9 = this.Scene_offsetOccluder + this.Scene_offsetOccluder;
						}

						boolean var10 = false;

						label157:
						for (int var11 = var8; var11 <= var9; ++var11) {
							for (int var12 = var6; var12 <= var7; ++var12) {
								if (this.visibleTiles(var11, var12)) {
									var10 = true;
									break label157;
								}
							}
						}

						if (var10) {
							var4.field2823 = 5;
							var4.field2812 = (var4.minX - this.Scene_cameraX << 8) / var5;
							var4.field2825 = (var4.maxX - this.Scene_cameraX << 8) / var5;
							var4.field2820 = (var4.minZ - this.Scene_cameraZ << 8) / var5;
							var4.field2827 = (var4.maxZ - this.Scene_cameraZ << 8) / var5;
							this.Scene_currentOccluders[this.Scene_currentOccludersCount++] = var4;
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("da")
	boolean method5227(int var1, int var2, int var3) {
		int var4 = this.field2733[var1][var2][var3];
		if (var4 == -this.Scene_drawnCount) {
			return false;
		} else if (var4 == this.Scene_drawnCount) {
			return true;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			if (this.method5289(var5 + 1, this.tileHeights[var1][var2][var3], var6 + 1) && this.method5289(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3], var6 + 1) && this.method5289(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.method5289(var5 + 1, this.tileHeights[var1][var2][var3 + 1], var6 + 128 - 1)) {
				this.field2733[var1][var2][var3] = this.Scene_drawnCount;
				return true;
			} else {
				this.field2733[var1][var2][var3] = -this.Scene_drawnCount;
				return false;
			}
		}
	}

	@ObfuscatedName("dg")
	boolean method5228(int var1, int var2, int var3, int var4) {
		if (!this.method5227(var1, var2, var3)) {
			return false;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			int var7 = this.tileHeights[var1][var2][var3] - 1;
			int var8 = var7 - 120;
			int var9 = var7 - 230;
			int var10 = var7 - 238;
			if (var4 < 16) {
				if (var4 == 1) {
					if (var5 > this.Scene_cameraX) {
						if (!this.method5289(var5, var7, var6)) {
							return false;
						}

						if (!this.method5289(var5, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.method5289(var5, var8, var6)) {
							return false;
						}

						if (!this.method5289(var5, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.method5289(var5, var9, var6)) {
						return false;
					}

					if (!this.method5289(var5, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 2) {
					if (var6 < this.Scene_cameraZ) {
						if (!this.method5289(var5, var7, var6 + 128)) {
							return false;
						}

						if (!this.method5289(var5 + 128, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.method5289(var5, var8, var6 + 128)) {
							return false;
						}

						if (!this.method5289(var5 + 128, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.method5289(var5, var9, var6 + 128)) {
						return false;
					}

					if (!this.method5289(var5 + 128, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 4) {
					if (var5 < this.Scene_cameraX) {
						if (!this.method5289(var5 + 128, var7, var6)) {
							return false;
						}

						if (!this.method5289(var5 + 128, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.method5289(var5 + 128, var8, var6)) {
							return false;
						}

						if (!this.method5289(var5 + 128, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.method5289(var5 + 128, var9, var6)) {
						return false;
					}

					if (!this.method5289(var5 + 128, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 8) {
					if (var6 > this.Scene_cameraZ) {
						if (!this.method5289(var5, var7, var6)) {
							return false;
						}

						if (!this.method5289(var5 + 128, var7, var6)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.method5289(var5, var8, var6)) {
							return false;
						}

						if (!this.method5289(var5 + 128, var8, var6)) {
							return false;
						}
					}

					if (!this.method5289(var5, var9, var6)) {
						return false;
					}

					if (!this.method5289(var5 + 128, var9, var6)) {
						return false;
					}

					return true;
				}
			}

			if (!this.method5289(var5 + 64, var10, var6 + 64)) {
				return false;
			} else if (var4 == 16) {
				return this.method5289(var5, var9, var6 + 128);
			} else if (var4 == 32) {
				return this.method5289(var5 + 128, var9, var6 + 128);
			} else if (var4 == 64) {
				return this.method5289(var5 + 128, var9, var6);
			} else if (var4 == 128) {
				return this.method5289(var5, var9, var6);
			} else {
				return true;
			}
		}
	}

	@ObfuscatedName("dl")
	boolean method5229(int var1, int var2, int var3, int var4) {
		if (!this.method5227(var1, var2, var3)) {
			return false;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			return this.method5289(var5 + 1, this.tileHeights[var1][var2][var3] - var4, var6 + 1) && this.method5289(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3] - var4, var6 + 1) && this.method5289(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.method5289(var5 + 1, this.tileHeights[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
		}
	}

	@ObfuscatedName("dn")
	boolean method5397(int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		int var8;
		if (var3 == var2 && var5 == var4) {
			if (!this.method5227(var1, var2, var4)) {
				return false;
			} else {
				var7 = var2 << 7;
				var8 = var4 << 7;
				return this.method5289(var7 + 1, this.tileHeights[var1][var2][var4] - var6, var8 + 1) && this.method5289(var7 + 128 - 1, this.tileHeights[var1][var2 + 1][var4] - var6, var8 + 1) && this.method5289(var7 + 128 - 1, this.tileHeights[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.method5289(var7 + 1, this.tileHeights[var1][var2][var4 + 1] - var6, var8 + 128 - 1);
			}
		} else {
			for (var7 = var2; var7 <= var3; ++var7) {
				for (var8 = var4; var8 <= var5; ++var8) {
					if (this.field2733[var1][var7][var8] == -this.Scene_drawnCount) {
						return false;
					}
				}
			}

			var7 = (var2 << 7) + 1;
			var8 = (var4 << 7) + 2;
			int var9 = this.tileHeights[var1][var2][var4] - var6;
			if (!this.method5289(var7, var9, var8)) {
				return false;
			} else {
				int var10 = (var3 << 7) - 1;
				if (!this.method5289(var10, var9, var8)) {
					return false;
				} else {
					int var11 = (var5 << 7) - 1;
					if (!this.method5289(var7, var9, var11)) {
						return false;
					} else if (!this.method5289(var10, var9, var11)) {
						return false;
					} else {
						return true;
					}
				}
			}
		}
	}

	@ObfuscatedName("dh")
	boolean method5289(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.Scene_currentOccludersCount; ++var4) {
			Occluder var5 = this.Scene_currentOccluders[var4];
			int var6;
			int var7;
			int var8;
			int var9;
			int var10;
			if (var5.field2823 == 1) {
				var6 = var5.minX - var1;
				if (var6 > 0) {
					var7 = (var6 * var5.field2820 >> 8) + var5.minZ;
					var8 = (var6 * var5.field2827 >> 8) + var5.maxZ;
					var9 = (var6 * var5.field2828 >> 8) + var5.minY;
					var10 = (var6 * var5.field2829 >> 8) + var5.maxY;
					if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.field2823 == 2) {
				var6 = var1 - var5.minX;
				if (var6 > 0) {
					var7 = (var6 * var5.field2820 >> 8) + var5.minZ;
					var8 = (var6 * var5.field2827 >> 8) + var5.maxZ;
					var9 = (var6 * var5.field2828 >> 8) + var5.minY;
					var10 = (var6 * var5.field2829 >> 8) + var5.maxY;
					if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.field2823 == 3) {
				var6 = var5.minZ - var3;
				if (var6 > 0) {
					var7 = (var6 * var5.field2812 >> 8) + var5.minX;
					var8 = (var6 * var5.field2825 >> 8) + var5.maxX;
					var9 = (var6 * var5.field2828 >> 8) + var5.minY;
					var10 = (var6 * var5.field2829 >> 8) + var5.maxY;
					if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.field2823 == 4) {
				var6 = var3 - var5.minZ;
				if (var6 > 0) {
					var7 = (var6 * var5.field2812 >> 8) + var5.minX;
					var8 = (var6 * var5.field2825 >> 8) + var5.maxX;
					var9 = (var6 * var5.field2828 >> 8) + var5.minY;
					var10 = (var6 * var5.field2829 >> 8) + var5.maxY;
					if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.field2823 == 5) {
				var6 = var2 - var5.minY;
				if (var6 > 0) {
					var7 = (var6 * var5.field2812 >> 8) + var5.minX;
					var8 = (var6 * var5.field2825 >> 8) + var5.maxX;
					var9 = (var6 * var5.field2820 >> 8) + var5.minZ;
					var10 = (var6 * var5.field2827 >> 8) + var5.maxZ;
					if (var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) {
						return true;
					}
				}
			}
		}

		return false;
	}

	@ObfuscatedName("gw")
	void vmethod5554(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
		TransformationMatrix var15 = AbstractArchive.method8450();
		class446 var16 = ModeWhere.method8730();
		class451 var17 = var16.field5197;
		int var19 = var1 & 2047;
		float var18 = (float)(6.283185307179586D * (double)((float)var19 / 2048.0F));
		var17.method9130(var18, 0.0F, 0.0F);
		var16.field5193.method9066((float)var4, (float)var5, (float)var6);
		class446 var20 = ModeWhere.method8730();
		var20.field5193.method9066((float)(-(this.xSize * 64) - this.field2715), (float)this.field2716, (float)(-(this.ySize * 64) - this.field2717));
		TransformationMatrix var21 = AbstractArchive.method8450();
		var21.method9182(var20);
		var21.method9181(this.field2690);
		var15.method9211(1.0F, this.field2718, 1.0F, 1.0F);
		var21.method9181(var15);
		var15.method9182(var16);
		var21.method9181(var15);
		var15.method9187(var21);
		var15.method9174();
		this.Scene_cameraX = (int)var15.method9190((float)var7, (float)var8, (float)var9);
		this.Scene_cameraY = (int)var15.method9191((float)var7, (float)var8, (float)var9);
		this.Scene_cameraZ = (int)var15.method9194((float)var7, (float)var8, (float)var9);
		this.Scene_cameraXTile = this.Scene_cameraX / 128;
		this.Scene_cameraYTile = this.Scene_cameraZ / 128;
		this.Scene_entityX = (int)var15.method9190((float)var12, 0.0F, (float)var13) / 128;
		this.Scene_entityY = (int)var15.method9194((float)var12, 0.0F, (float)var13) / 128;
		class453 var22 = new class453();
		TransformationMatrix var23 = AbstractArchive.method8450();
		int var26 = -var2;
		var26 &= 2047;
		float var25 = (float)((double)((float)var26 / 2048.0F) * 6.283185307179586D);
		var22.method9260(var25);
		int var29 = -var3;
		var29 &= 2047;
		float var28 = (float)((double)((float)var29 / 2048.0F) * 6.283185307179586D);
		var22.method9261(var28);
		var22.method9263((float)var7, (float)var8, (float)var9);
		var23.method9184(var22);
		var23.method9174();
		var16.method9005();
		var20.method9005();
		var15.method9171();
		var21.method9181(var23);
		FloatProjection var30 = new FloatProjection(var21);
		var30.method5416(var10);
		class173.method4158();
		this.method5230(var30, var14, Rasterizer3D.clips.field2999 != 1);
		class173.method4158();
		var23.method9171();
		var21.method9171();
	}

	@ObfuscatedName("ab")
	static final int method5240(int var0, int var1) {
		var1 = (var0 & 127) * var1 >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}

	@ObfuscatedName("at")
	@Export("containsBounds")
	static boolean containsBounds(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var1 < var2 && var1 < var3 && var1 < var4) {
			return false;
		} else if (var1 > var2 && var1 > var3 && var1 > var4) {
			return false;
		} else if (var0 < var5 && var0 < var6 && var0 < var7) {
			return false;
		} else if (var0 > var5 && var0 > var6 && var0 > var7) {
			return false;
		} else {
			int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2);
			int var9 = (var7 - var6) * (var1 - var3) - (var0 - var6) * (var4 - var3);
			int var10 = (var5 - var7) * (var1 - var4) - (var2 - var4) * (var0 - var7);
			if (var8 == 0) {
				if (var9 != 0) {
					return var9 < 0 ? var10 <= 0 : var10 >= 0;
				} else {
					return true;
				}
			} else {
				return var8 < 0 ? var9 <= 0 && var10 <= 0 : var9 >= 0 && var10 >= 0;
			}
		}
	}
}
