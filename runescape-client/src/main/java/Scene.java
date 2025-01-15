import java.util.Arrays;
import java.util.BitSet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hj")
@Implements("Scene")
public class Scene extends Renderable {
	@ObfuscatedName("ah")
	@Export("Scene_isLowDetail")
	public static boolean Scene_isLowDetail;
	@ObfuscatedName("cq")
	static final int[] field2059;
	@ObfuscatedName("cf")
	static final int[] field2061;
	@ObfuscatedName("ct")
	static final int[] field2066;
	@ObfuscatedName("ci")
	static final int[] field2074;
	@ObfuscatedName("cl")
	static final int[] field2068;
	@ObfuscatedName("cw")
	static final int[] field2069;
	@ObfuscatedName("cj")
	static final int[] field2070;
	@ObfuscatedName("ay")
	@Export("worldViewId")
	final int worldViewId;
	@ObfuscatedName("az")
	@Export("cycle")
	public int cycle;
	@ObfuscatedName("ao")
	@Export("planes")
	int planes;
	@ObfuscatedName("ad")
	@Export("xSize")
	int xSize;
	@ObfuscatedName("an")
	@Export("ySize")
	int ySize;
	@ObfuscatedName("ae")
	@Export("tileHeights")
	int[][][] tileHeights;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[[[Lgu;"
	)
	@Export("tiles")
	Tile[][][] tiles;
	@ObfuscatedName("at")
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("ac")
	@Export("tempGameObjectsCount")
	int tempGameObjectsCount;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Lik;"
	)
	@Export("tempGameObjects")
	GameObject[] tempGameObjects;
	@ObfuscatedName("as")
	int[][][] field2013;
	@ObfuscatedName("av")
	@Export("Scene_offsetOccluder")
	int Scene_offsetOccluder;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lgs;"
	)
	class175 field2020;
	@ObfuscatedName("aw")
	int field2021;
	@ObfuscatedName("ai")
	int field2022;
	@ObfuscatedName("ar")
	@Export("tileUpdateCount")
	int tileUpdateCount;
	@ObfuscatedName("am")
	@Export("Scene_plane")
	public int Scene_plane;
	@ObfuscatedName("ap")
	@Export("Scene_drawnCount")
	int Scene_drawnCount;
	@ObfuscatedName("ab")
	@Export("Scene_cameraXTileMin")
	int Scene_cameraXTileMin;
	@ObfuscatedName("aj")
	@Export("Scene_cameraXTileMax")
	int Scene_cameraXTileMax;
	@ObfuscatedName("bu")
	@Export("Scene_cameraYTileMin")
	int Scene_cameraYTileMin;
	@ObfuscatedName("bh")
	@Export("Scene_cameraYTileMax")
	int Scene_cameraYTileMax;
	@ObfuscatedName("bw")
	@Export("Scene_cameraX")
	int Scene_cameraX;
	@ObfuscatedName("bb")
	@Export("Scene_cameraY")
	int Scene_cameraY;
	@ObfuscatedName("bx")
	@Export("Scene_cameraZ")
	int Scene_cameraZ;
	@ObfuscatedName("bd")
	@Export("Scene_cameraXTile")
	int Scene_cameraXTile;
	@ObfuscatedName("bi")
	@Export("Scene_cameraYTile")
	int Scene_cameraYTile;
	@ObfuscatedName("bz")
	@Export("Scene_entityX")
	int Scene_entityX;
	@ObfuscatedName("bt")
	@Export("Scene_entityY")
	int Scene_entityY;
	@ObfuscatedName("bf")
	int field2014;
	@ObfuscatedName("by")
	int field2038;
	@ObfuscatedName("bm")
	public int field2002;
	@ObfuscatedName("bp")
	public int field2040;
	@ObfuscatedName("bg")
	int field2041;
	@ObfuscatedName("bc")
	int field2042;
	@ObfuscatedName("bv")
	int field2096;
	@ObfuscatedName("bq")
	int field2044;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "[Lik;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("bk")
	@Export("checkClick")
	boolean checkClick;
	@ObfuscatedName("bs")
	@Export("Scene_selectedPlane")
	int Scene_selectedPlane;
	@ObfuscatedName("bj")
	@Export("Scene_selectedScreenX")
	int Scene_selectedScreenX;
	@ObfuscatedName("bo")
	@Export("Scene_selectedScreenY")
	int Scene_selectedScreenY;
	@ObfuscatedName("be")
	@Export("Scene_baseX")
	int Scene_baseX;
	@ObfuscatedName("bn")
	@Export("Scene_baseY")
	int Scene_baseY;
	@ObfuscatedName("br")
	public float field2067;
	@ObfuscatedName("bl")
	@Export("baseX")
	public int baseX;
	@ObfuscatedName("cb")
	@Export("baseY")
	public int baseY;
	@ObfuscatedName("cn")
	@Export("viewportWalking")
	boolean viewportWalking;
	@ObfuscatedName("ca")
	@Export("scenePlanesCount")
	int scenePlanesCount;
	@ObfuscatedName("cg")
	@Export("Scene_planeOccluderCounts")
	int[] Scene_planeOccluderCounts;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "[[Lhe;"
	)
	@Export("Scene_planeOccluders")
	Occluder[][] Scene_planeOccluders;
	@ObfuscatedName("cz")
	@Export("Scene_currentOccludersCount")
	int Scene_currentOccludersCount;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "[Lhe;"
	)
	@Export("Scene_currentOccluders")
	Occluder[] Scene_currentOccluders;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("Scene_tilesDeque")
	NodeDeque Scene_tilesDeque;
	@ObfuscatedName("cs")
	@Export("tileShape2D")
	int[][] tileShape2D;
	@ObfuscatedName("cm")
	@Export("tileRotation2D")
	int[][] tileRotation2D;
	@ObfuscatedName("ce")
	int[] field2077;
	@ObfuscatedName("cr")
	int field2078;
	@ObfuscatedName("ch")
	int field2081;
	@ObfuscatedName("dh")
	int field2080;
	@ObfuscatedName("dn")
	int field2075;
	@ObfuscatedName("dc")
	final int field2082;
	@ObfuscatedName("dm")
	BitSet field2083;
	@ObfuscatedName("dj")
	BitSet field2072;
	@ObfuscatedName("dk")
	final int field2052;
	@ObfuscatedName("ds")
	final int field2079;
	@ObfuscatedName("dr")
	final int field2039;
	@ObfuscatedName("dl")
	final int field2093;
	@ObfuscatedName("do")
	BitSet field2003;
	@ObfuscatedName("dg")
	BitSet field2010;
	@ObfuscatedName("dt")
	final int field2091;
	@ObfuscatedName("df")
	final int field2060;
	@ObfuscatedName("de")
	final int field2101;
	@ObfuscatedName("dw")
	int field2064;
	@ObfuscatedName("dv")
	int field2095;
	@ObfuscatedName("dx")
	int field2084;
	@ObfuscatedName("dd")
	int field2033;
	@ObfuscatedName("dy")
	int field2098;
	@ObfuscatedName("db")
	int field2099;
	@ObfuscatedName("du")
	int field2086;
	@ObfuscatedName("da")
	int field2004;

	static {
		Scene_isLowDetail = false;
		field2059 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
		field2061 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
		field2066 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
		field2074 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
		field2068 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
		field2069 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
		field2070 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
	}

	@ObfuscatedSignature(
		descriptor = "(IIIIILgs;[[[I)V"
	)
	public Scene(int var1, int var2, int var3, int var4, int var5, class175 var6, int[][][] var7) {
		this.minPlane = 0;
		this.tempGameObjectsCount = 0;
		this.tempGameObjects = new GameObject[32];
		this.Scene_offsetOccluder = 0;
		this.field2020 = class175.field1837;
		this.field2021 = 0;
		this.field2022 = 0;
		this.tileUpdateCount = 0;
		this.Scene_plane = 0;
		this.field2002 = 0;
		this.field2040 = 0;
		this.gameObjects = new GameObject[5];
		this.checkClick = false;
		this.Scene_selectedPlane = 0;
		this.Scene_selectedScreenX = 0;
		this.Scene_selectedScreenY = 0;
		this.Scene_baseX = -1;
		this.Scene_baseY = -1;
		this.field2067 = -1.0F;
		this.baseX = -1;
		this.baseY = -1;
		this.viewportWalking = false;
		this.scenePlanesCount = 4;
		this.Scene_planeOccluderCounts = new int[this.scenePlanesCount];
		this.Scene_planeOccluders = new Occluder[this.scenePlanesCount][500];
		this.Scene_currentOccludersCount = 0;
		this.Scene_currentOccluders = new Occluder[500];
		this.Scene_tilesDeque = new NodeDeque();
		this.tileShape2D = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
		this.tileRotation2D = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
		this.field2077 = new int[9];
		this.planes = var2;
		this.xSize = var3;
		this.ySize = var4;
		this.tiles = new Tile[var2][var3][var4];
		this.field2013 = new int[var2][var3 + 1][var4 + 1];
		this.tileHeights = var7;
		this.Scene_offsetOccluder = var5;
		this.field2020 = var6;
		this.worldViewId = var1;
		if (var1 != -1) {
			this.field2082 = 0;
			this.field2083 = null;
			this.field2072 = null;
			this.field2052 = 0;
			this.field2079 = 0;
			this.field2039 = 0;
			this.field2093 = 0;
			this.field2003 = null;
			this.field2010 = null;
			this.field2091 = 0;
			this.field2060 = 0;
			this.field2101 = 0;
		} else {
			this.field2082 = 8386816;
			this.field2083 = new BitSet(this.field2082);
			this.field2072 = new BitSet(this.field2082);
			this.field2052 = 1048352;
			this.field2079 = 32761;
			this.field2039 = 181;
			this.field2093 = 9644832;
			this.field2003 = new BitSet(this.field2093);
			this.field2010 = new BitSet(this.field2093);
			this.field2091 = 1071648;
			this.field2060 = 33489;
			this.field2101 = 183;
		}

		AbstractRasterizer.method4156(var5);
		this.clearTempGameObjects();
	}

	@ObfuscatedName("ay")
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

		for (var1 = 0; var1 < this.scenePlanesCount; ++var1) {
			for (var2 = 0; var2 < this.Scene_planeOccluderCounts[var1]; ++var2) {
				this.Scene_planeOccluders[var1][var2] = null;
			}

			this.Scene_planeOccluderCounts[var1] = 0;
		}

		for (var1 = 0; var1 < this.tempGameObjectsCount; ++var1) {
			this.tempGameObjects[var1] = null;
		}

		this.tempGameObjectsCount = 0;

		for (var1 = 0; var1 < this.gameObjects.length; ++var1) {
			this.gameObjects[var1] = null;
		}

	}

	@ObfuscatedName("ah")
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

	@ObfuscatedName("az")
	@Export("setLinkBelow")
	public void setLinkBelow(int var1, int var2) {
		Tile var3 = this.tiles[0][var1][var2];

		for (int var4 = 0; var4 < 3; ++var4) {
			Tile var5 = this.tiles[var4][var1][var2] = this.tiles[var4 + 1][var1][var2];
			if (var5 != null) {
				--var5.plane;

				for (int var6 = 0; var6 < var5.gameObjectsCount; ++var6) {
					GameObject var7 = var5.gameObjects[var6];
					if (Language.method7967(var7.tag) && var7.startX == var1 && var2 == var7.startY) {
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

	@ObfuscatedName("ao")
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

	@ObfuscatedName("ad")
	@Export("setTileMinPlane")
	public void setTileMinPlane(int var1, int var2, int var3, int var4) {
		Tile var5 = this.tiles[var1][var2][var3];
		if (var5 != null) {
			this.tiles[var1][var2][var3].minPlane = var4;
		}
	}

	@ObfuscatedName("an")
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIILhs;JI)V"
	)
	@Export("newFloorDecoration")
	public void newFloorDecoration(int var1, int var2, int var3, int var4, Renderable var5, long var6, int var8) {
		if (var5 != null) {
			FloorDecoration var9 = new FloorDecoration();
			var9.renderable = var5;
			var9.x = var2 * 8192 + 4096;
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIIILhs;JLhs;Lhs;)V"
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIILhs;Lhs;IIJI)V"
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIILhs;Lhs;IIIIJI)V"
	)
	@Export("newWallDecoration")
	public void newWallDecoration(int var1, int var2, int var3, int var4, Renderable var5, Renderable var6, int var7, int var8, int var9, int var10, long var11, int var13) {
		if (var5 != null) {
			WallDecoration var14 = new WallDecoration();
			var14.tag = var11;
			var14.flags = var13;
			var14.x = var2 * 128 + 64;
			var14.y = var3 * 128 + 64;
			var14.z = var4;
			var14.renderable1 = var5;
			var14.renderable2 = var6;
			var14.orientation = var7;
			var14.orientation2 = var8;
			var14.xOffset = var9;
			var14.yOffset = var10;

			for (int var15 = var1; var15 >= 0; --var15) {
				if (this.tiles[var15][var2][var3] == null) {
					this.tiles[var15][var2][var3] = new Tile(var15, var2, var3);
				}
			}

			this.tiles[var1][var2][var3].wallDecoration = var14;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILhs;IJI)Z"
	)
	public boolean method4184(int var1, int var2, int var3, int var4, int var5, int var6, Renderable var7, int var8, long var9, int var11) {
		if (var7 == null) {
			return true;
		} else {
			int var12 = var5 * 64 + var2 * 128;
			int var13 = var6 * 64 + var3 * 128;
			return this.newGameObject(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIIIILhs;IJZ)Z"
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIIILhs;IJIIII)Z"
	)
	@Export("addNullableObject")
	public boolean addNullableObject(int var1, int var2, int var3, int var4, int var5, Renderable var6, int var7, long var8, int var10, int var11, int var12, int var13) {
		return var6 == null ? true : this.newGameObject(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIILhs;IZJI)Z"
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

	@ObfuscatedName("av")
	@Export("setViewportWalking")
	public void setViewportWalking() {
		for (int var1 = 0; var1 < this.tempGameObjectsCount; ++var1) {
			GameObject var2 = this.tempGameObjects[var1];
			this.removeGameObject(var2);
			this.tempGameObjects[var1] = null;
		}

		this.tempGameObjectsCount = 0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lik;)V"
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

	@ObfuscatedName("aw")
	public void method4190(int var1, int var2, int var3, int var4) {
		Tile var5 = this.tiles[var1][var2][var3];
		if (var5 != null) {
			WallDecoration var6 = var5.wallDecoration;
			if (var6 != null) {
				var6.xOffset = var4 * var6.xOffset / 16;
				var6.yOffset = var4 * var6.yOffset / 16;
			}
		}
	}

	@ObfuscatedName("ai")
	@Export("removeBoundaryObject")
	public void removeBoundaryObject(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		if (var4 != null) {
			var4.boundaryObject = null;
		}
	}

	@ObfuscatedName("ar")
	@Export("removeWallDecoration")
	public void removeWallDecoration(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		if (var4 != null) {
			var4.wallDecoration = null;
		}
	}

	@ObfuscatedName("am")
	@Export("removeGameObject")
	public void removeGameObject(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		if (var4 != null) {
			for (int var5 = 0; var5 < var4.gameObjectsCount; ++var5) {
				GameObject var6 = var4.gameObjects[var5];
				if (Language.method7967(var6.tag) && var2 == var6.startX && var3 == var6.startY) {
					this.removeGameObject(var6);
					return;
				}
			}

		}
	}

	@ObfuscatedName("ap")
	@Export("removeFloorDecoration")
	public void removeFloorDecoration(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		if (var4 != null) {
			var4.floorDecoration = null;
		}
	}

	@ObfuscatedName("ab")
	@Export("removeGroundItemPile")
	public void removeGroundItemPile(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		if (var4 != null) {
			var4.itemLayer = null;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)Lha;"
	)
	@Export("getBoundaryObject")
	public BoundaryObject getBoundaryObject(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		return var4 == null ? null : var4.boundaryObject;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(III)Lie;"
	)
	@Export("getWallDecoration")
	public WallDecoration getWallDecoration(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		return var4 == null ? null : var4.wallDecoration;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(III)Lik;"
	)
	@Export("getGameObject")
	public GameObject getGameObject(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		if (var4 == null) {
			return null;
		} else {
			for (int var5 = 0; var5 < var4.gameObjectsCount; ++var5) {
				GameObject var6 = var4.gameObjects[var5];
				if (Language.method7967(var6.tag) && var2 == var6.startX && var3 == var6.startY) {
					return var6;
				}
			}

			return null;
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(III)Lgi;"
	)
	@Export("getFloorDecoration")
	public FloorDecoration getFloorDecoration(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		return var4 != null && var4.floorDecoration != null ? var4.floorDecoration : null;
	}

	@ObfuscatedName("bb")
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

	@ObfuscatedName("bd")
	@Export("getGameObjectTag")
	public long getGameObjectTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		if (var4 == null) {
			return 0L;
		} else {
			for (int var5 = 0; var5 < var4.gameObjectsCount; ++var5) {
				GameObject var6 = var4.gameObjects[var5];
				if (Language.method7967(var6.tag) && var2 == var6.startX && var3 == var6.startY) {
					return var6.tag;
				}
			}

			return 0L;
		}
	}

	@ObfuscatedName("bi")
	@Export("getFloorDecorationTag")
	public long getFloorDecorationTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		return var4 != null && var4.floorDecoration != null ? var4.floorDecoration.tag : 0L;
	}

	@ObfuscatedName("bz")
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

	@ObfuscatedName("bt")
	public void method4205(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.planes; ++var4) {
			for (int var5 = 0; var5 < this.xSize; ++var5) {
				for (int var6 = 0; var6 < this.ySize; ++var6) {
					Tile var7 = this.tiles[var4][var5][var6];
					if (var7 != null) {
						BoundaryObject var8 = var7.boundaryObject;
						ModelData var10;
						if (var8 != null && var8.renderable1 instanceof ModelData) {
							ModelData var9 = (ModelData)var8.renderable1;
							this.method4207(var9, var4, var5, var6, 1, 1);
							if (var8.renderable2 instanceof ModelData) {
								var10 = (ModelData)var8.renderable2;
								this.method4207(var10, var4, var5, var6, 1, 1);
								ModelData.method3916(var9, var10, 0, 0, 0, false);
								var8.renderable2 = var10.toModel(var10.ambient, var10.contrast, var1, var2, var3);
							}

							var8.renderable1 = var9.toModel(var9.ambient, var9.contrast, var1, var2, var3);
						}

						for (int var12 = 0; var12 < var7.gameObjectsCount; ++var12) {
							GameObject var14 = var7.gameObjects[var12];
							if (var14 != null && var14.renderable instanceof ModelData) {
								ModelData var11 = (ModelData)var14.renderable;
								this.method4207(var11, var4, var5, var6, var14.endX - var14.startX + 1, var14.endY - var14.startY + 1);
								var14.renderable = var11.toModel(var11.ambient, var11.contrast, var1, var2, var3);
							}
						}

						FloorDecoration var13 = var7.floorDecoration;
						if (var13 != null && var13.renderable instanceof ModelData) {
							var10 = (ModelData)var13.renderable;
							this.method4234(var10, var4, var5, var6);
							var13.renderable = var10.toModel(var10.ambient, var10.contrast, var1, var2, var3);
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Lgx;III)V"
	)
	void method4234(ModelData var1, int var2, int var3, int var4) {
		int var6 = var3 + 1;
		int var7 = var4 - 1;
		int var8 = var4 + 1;

		for (int var9 = var3; var9 <= var6; ++var9) {
			if (var9 >= 0 && var9 < this.xSize) {
				for (int var10 = var7; var10 <= var8; ++var10) {
					if (var10 >= 0 && var10 < this.ySize && (var9 >= var6 || var10 >= var8)) {
						Tile var11 = this.tiles[var2][var9][var10];
						if (var11 != null && var11.floorDecoration != null && var11.floorDecoration.renderable instanceof ModelData) {
							int var12 = this.method4208(var2, var9, var10, var2, var3, var4);
							ModelData var13 = (ModelData)var11.floorDecoration.renderable;
							ModelData.method3916(var1, var13, (var9 - var3) * 128, var12, (var10 - var4) * 128, true);
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Lgx;IIIII)V"
	)
	void method4207(ModelData var1, int var2, int var3, int var4, int var5, int var6) {
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
									int var16 = this.method4208(var12, var13, var14, var2, var3, var4);
									BoundaryObject var17 = var15.boundaryObject;
									if (var17 != null) {
										ModelData var18;
										if (var17.renderable1 instanceof ModelData) {
											var18 = (ModelData)var17.renderable1;
											ModelData.method3916(var1, var18, (1 - var5) * 64 + (var13 - var3) * 128, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
										}

										if (var17.renderable2 instanceof ModelData) {
											var18 = (ModelData)var17.renderable2;
											ModelData.method3916(var1, var18, (1 - var5) * 64 + (var13 - var3) * 128, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
										}
									}

									for (int var23 = 0; var23 < var15.gameObjectsCount; ++var23) {
										GameObject var19 = var15.gameObjects[var23];
										if (var19 != null && var19.renderable instanceof ModelData) {
											ModelData var20 = (ModelData)var19.renderable;
											int var21 = var19.endX - var19.startX + 1;
											int var22 = var19.endY - var19.startY + 1;
											ModelData.method3916(var1, var20, (var21 - var5) * 64 + (var19.startX - var3) * 128, var16, (var19.startY - var4) * 128 + (var22 - var6) * 64, var7);
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

	@ObfuscatedName("bm")
	int method4208(int var1, int var2, int var3, int var4, int var5, int var6) {
		return this.method4209(var1, var2, var3) - this.method4209(var4, var5, var6);
	}

	@ObfuscatedName("bp")
	int method4209(int var1, int var2, int var3) {
		return (this.tileHeights[var1][var2 + 1][var3 + 1] + this.tileHeights[var1][var2][var3] + this.tileHeights[var1][var2][var3 + 1] + this.tileHeights[var1][var2 + 1][var3]) / 4;
	}

	@ObfuscatedName("bg")
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
					int[] var14 = this.tileShape2D[var10];
					int[] var15 = this.tileRotation2D[var11];
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

	@ObfuscatedName("bc")
	public void method4211(int var1) {
		int var2 = Math.max(25, Math.min(var1, 90));
		this.Scene_offsetOccluder = var2;
		AbstractRasterizer.method4156(this.Scene_offsetOccluder);
		if (this.field2077 != null && this.field2077.length > 0) {
			this.method4267(this.field2077, this.field2078, this.field2081, this.field2080, this.field2075);
		}

	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Lgs;)V"
	)
	public void method4212(class175 var1) {
		if (var1 != this.field2020) {
			this.field2020 = var1;
			this.method4267(this.field2077, this.field2078, this.field2081, this.field2080, this.field2075);
		}

	}

	@ObfuscatedName("bq")
	boolean method4397(BitSet var1, int var2, int var3, int var4, int var5) {
		return var1.get(var5 + var4 * this.field2039 + var2 * this.field2052 + var3 * this.field2079);
	}

	@ObfuscatedName("ba")
	boolean method4214(BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
		var1.set(var5 + var4 * this.field2039 + var2 * this.field2052 + var3 * this.field2079, var6);
		return var6;
	}

	@ObfuscatedName("bk")
	boolean method4215(int var1, int var2, int var3, int var4) {
		return this.method4397(this.field2083, var1, var2, var3, var4);
	}

	@ObfuscatedName("bs")
	boolean method4378(int var1, int var2, int var3, int var4, boolean var5) {
		return this.method4214(this.field2083, var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("bj")
	boolean method4217(int var1, int var2, int var3, int var4) {
		return this.method4397(this.field2072, var1, var2, var3, var4);
	}

	@ObfuscatedName("bo")
	boolean method4218(int var1, int var2, int var3, int var4, boolean var5) {
		return this.method4214(this.field2072, var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("be")
	boolean method4219(BitSet var1, int var2, int var3, int var4, int var5) {
		return var1.get(var5 + var4 * this.field2101 + var2 * this.field2091 + var3 * this.field2060);
	}

	@ObfuscatedName("bn")
	boolean method4220(BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
		var1.set(var5 + var4 * this.field2101 + var2 * this.field2091 + var3 * this.field2060, var6);
		return var6;
	}

	@ObfuscatedName("br")
	boolean method4221(int var1, int var2, int var3, int var4) {
		return this.method4219(this.field2003, var1, var2, var3, var4);
	}

	@ObfuscatedName("bl")
	boolean method4222(int var1, int var2, int var3, int var4, boolean var5) {
		return this.method4220(this.field2003, var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("cb")
	boolean method4177(int var1, int var2, int var3, int var4) {
		return this.method4219(this.field2010, var1, var2, var3, var4);
	}

	@ObfuscatedName("cn")
	boolean method4224(int var1, int var2, int var3, int var4, boolean var5) {
		return this.method4220(this.field2010, var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("cc")
	public void method4267(int[] var1, int var2, int var3, int var4, int var5) {
		this.field2077 = var1;
		this.field2078 = var2;
		this.field2081 = var3;
		this.field2080 = var4;
		this.field2075 = var5;
		this.field2098 = 0;
		this.field2099 = 0;
		this.field2086 = var4;
		this.field2004 = var5;
		this.field2084 = var4 / 2;
		this.field2033 = var5 / 2;
		this.field2072.set(0, this.field2072.size());
		this.field2010.set(0, this.field2010.size());
	}

	@ObfuscatedName("co")
	@Export("visibilityMap")
	void visibilityMap(int var1, int var2) {
		this.field2064 = var1;
		this.field2095 = var2;
	}

	@ObfuscatedName("ca")
	@Export("visibleTiles")
	boolean visibleTiles(int var1, int var2) {
		if (!this.method4217(this.field2064, this.field2095, var1, var2)) {
			return this.method4215(this.field2064, this.field2095, var1, var2);
		} else {
			this.method4218(this.field2064, this.field2095, var1, var2, false);
			boolean var3 = false;

			for (int var4 = -1; var4 <= 1; ++var4) {
				for (int var5 = -1; var5 <= 1; ++var5) {
					if (this.method4286(this.field2064, this.field2095, var4 + var1 + 1, var5 + var2 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}

					if (this.method4286(this.field2064, (this.field2095 + 1) % 31, var4 + var1 + 1, var5 + var2 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}

					if (this.method4286(this.field2064 + 1, this.field2095, var4 + var1 + 1, var5 + var2 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}

					if (this.method4286(this.field2064 + 1, (this.field2095 + 1) % 31, var4 + var1 + 1, var5 + var2 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}
				}
			}

			return this.method4378(this.field2064, this.field2095, var1, var2, var3);
		}
	}

	@ObfuscatedName("cg")
	boolean method4286(int var1, int var2, int var3, int var4) {
		if (!this.method4177(var1, var2, var3, var4)) {
			return this.method4221(var1, var2, var3, var4);
		} else {
			this.method4224(var1, var2, var3, var4, false);
			int var5 = var1 * 32 + 128;
			int var6 = var2 * 64;
			int var7 = (var3 - this.Scene_offsetOccluder - this.field2021 - 1) * 128;
			int var8 = (var4 - this.Scene_offsetOccluder - this.field2022 - 1) * 128;

			for (int var9 = -this.field2078; var9 <= this.field2081; var9 += 128) {
				if (this.method4410(var7, var9 + this.field2077[var1], var8, var5, var6)) {
					return this.method4222(var1, var2, var3, var4, true);
				}
			}

			return this.method4222(var1, var2, var3, var4, false);
		}
	}

	@ObfuscatedName("cp")
	boolean method4410(int var1, int var2, int var3, int var4, int var5) {
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
		if (var14 >= 50 && var14 <= AbstractRasterizer.method4138()) {
			int var16 = var12 * 128 / var14 + this.field2084;
			int var17 = var15 * 128 / var14 + this.field2033;
			return var16 >= this.field2098 && var16 <= this.field2086 && var17 >= this.field2099 && var17 <= this.field2004;
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

	@ObfuscatedName("cy")
	public void method4231(int var1, int var2, int var3) {
		this.Scene_selectedPlane = var1;
		this.Scene_selectedScreenX = var2;
		this.Scene_selectedScreenY = var3;
	}

	@ObfuscatedName("cu")
	public void method4232() {
		this.viewportWalking = true;
	}

	@ObfuscatedName("cq")
	@Export("shouldSendWalk")
	public boolean shouldSendWalk() {
		return this.viewportWalking && this.baseX != -1;
	}

	@ObfuscatedName("cf")
	@Export("processWalkClick")
	void processWalkClick() {
		if (this.checkClick) {
			this.checkClick = false;
			this.baseX = this.Scene_baseX;
			this.baseY = this.Scene_baseY;
		}

	}

	@ObfuscatedName("ct")
	public void method4411() {
		this.baseX = -1;
		this.viewportWalking = false;
	}

	@ObfuscatedName("ci")
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

		this.field2041 = Rasterizer3D.Rasterizer3D_sine[var4];
		this.field2042 = Rasterizer3D.Rasterizer3D_cosine[var4];
		this.field2096 = Rasterizer3D.Rasterizer3D_sine[var5];
		this.field2044 = Rasterizer3D.Rasterizer3D_cosine[var5];
		this.visibilityMap((var4 - 128) / 32, var5 / 64);
		class110.method3122(this.field2041, this.field2042, this.field2096, this.field2044);
		this.Scene_cameraX = var1;
		this.Scene_cameraY = var2;
		this.Scene_cameraZ = var3;
		this.Scene_cameraXTile = var1 / 128;
		this.Scene_cameraYTile = var3 / 128;
		this.Scene_entityX = var7 / 128;
		this.Scene_entityY = var8 / 128;
		this.Scene_plane = var6;
		IntProjection var10 = new IntProjection(var1, var2, var3, var4, var5, var7, var8);
		this.updateVisibleTilesAndOccluders(var10, var9);
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(Lht;Z)V"
	)
	@Export("updateVisibleTilesAndOccluders")
	void updateVisibleTilesAndOccluders(Projection var1, boolean var2) {
		++this.Scene_drawnCount;
		this.Scene_baseX = -1;
		this.Scene_baseY = -1;
		this.field2067 = -1.0F;
		boolean var3 = this.worldViewId == -1;
		this.field2014 = !var2 && this.field2020 != class175.field1837 ? this.Scene_entityX : this.Scene_cameraXTile;
		this.field2038 = !var2 && this.field2020 != class175.field1837 ? this.Scene_entityY : this.Scene_cameraYTile;
		if (var3) {
			this.Scene_cameraXTileMin = this.field2014 - this.Scene_offsetOccluder;
			if (this.Scene_cameraXTileMin < 0) {
				this.Scene_cameraXTileMin = 0;
			}

			this.Scene_cameraYTileMin = this.field2038 - this.Scene_offsetOccluder;
			if (this.Scene_cameraYTileMin < 0) {
				this.Scene_cameraYTileMin = 0;
			}

			this.Scene_cameraXTileMax = this.field2014 + this.Scene_offsetOccluder;
			if (this.Scene_cameraXTileMax > this.xSize) {
				this.Scene_cameraXTileMax = this.xSize;
			}

			this.Scene_cameraYTileMax = this.field2038 + this.Scene_offsetOccluder;
			if (this.Scene_cameraYTileMax > this.ySize) {
				this.Scene_cameraYTileMax = this.ySize;
			}
		} else {
			this.Scene_cameraXTileMin = 0;
			this.Scene_cameraYTileMin = 0;
			this.Scene_cameraXTileMax = this.xSize;
			this.Scene_cameraYTileMax = this.ySize;
			this.field2014 = this.xSize / 2;
			this.field2038 = this.ySize / 2;
			this.Scene_offsetOccluder = Math.max(this.field2014, this.field2038);
		}

		this.field2021 = this.Scene_cameraXTile - this.field2014;
		this.field2022 = this.Scene_cameraYTile - this.field2038;
		if (var3) {
			this.occlude();
		}

		this.tileUpdateCount = 0;

		int var4;
		int var6;
		for (var4 = this.minPlane; var4 < this.planes; ++var4) {
			Tile[][] var15 = this.tiles[var4];

			for (var6 = this.Scene_cameraXTileMin; var6 < this.Scene_cameraXTileMax; ++var6) {
				for (int var16 = this.Scene_cameraYTileMin; var16 < this.Scene_cameraYTileMax; ++var16) {
					Tile var17 = var15[var6][var16];
					if (var17 != null) {
						if (var17.minPlane > this.Scene_plane || var3 && !this.visibleTiles(var6 - this.Scene_cameraXTile + this.field2021 + this.Scene_offsetOccluder, var16 - this.Scene_cameraYTile + this.field2022 + this.Scene_offsetOccluder) && this.tileHeights[var4][var6][var16] - this.Scene_cameraY < 2000) {
							var17.drawPrimary = false;
							var17.drawSecondary = false;
							var17.drawGameObjectEdges = 0;
						} else {
							var17.drawPrimary = true;
							var17.drawSecondary = true;
							if (var17.gameObjectsCount > 0) {
								var17.drawGameObjects = true;
							} else {
								var17.drawGameObjects = false;
							}

							++this.tileUpdateCount;
						}
					}
				}
			}
		}

		var4 = Math.abs(this.field2021);
		int var5 = Math.abs(this.field2022);

		Tile[][] var7;
		int var8;
		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		Tile var14;
		for (var6 = this.minPlane; var6 < this.planes; ++var6) {
			var7 = this.tiles[var6];

			for (var8 = -(var4 + this.Scene_offsetOccluder); var8 <= 0; ++var8) {
				var9 = var8 + this.Scene_cameraXTile;
				var10 = this.Scene_cameraXTile - var8;
				if (var9 >= this.Scene_cameraXTileMin || var10 < this.Scene_cameraXTileMax) {
					for (var11 = -(var5 + this.Scene_offsetOccluder); var11 <= 0; ++var11) {
						var12 = var11 + this.Scene_cameraYTile;
						var13 = this.Scene_cameraYTile - var11;
						if (var9 >= this.Scene_cameraXTileMin && var9 < this.Scene_cameraXTileMax) {
							if (var12 >= this.Scene_cameraYTileMin && var12 < this.Scene_cameraYTileMax) {
								var14 = var7[var9][var12];
								if (var14 != null && var14.drawPrimary) {
									this.drawTile(var1, var14, true);
								}
							}

							if (var13 >= this.Scene_cameraYTileMin && var13 < this.Scene_cameraYTileMax) {
								var14 = var7[var9][var13];
								if (var14 != null && var14.drawPrimary) {
									this.drawTile(var1, var14, true);
								}
							}
						}

						if (var10 >= this.Scene_cameraXTileMin && var10 < this.Scene_cameraXTileMax) {
							if (var12 >= this.Scene_cameraYTileMin && var12 < this.Scene_cameraYTileMax) {
								var14 = var7[var10][var12];
								if (var14 != null && var14.drawPrimary) {
									this.drawTile(var1, var14, true);
								}
							}

							if (var13 >= this.Scene_cameraYTileMin && var13 < this.Scene_cameraYTileMax) {
								var14 = var7[var10][var13];
								if (var14 != null && var14.drawPrimary) {
									this.drawTile(var1, var14, true);
								}
							}
						}

						if (this.tileUpdateCount == 0) {
							this.processWalkClick();
							return;
						}
					}
				}
			}
		}

		for (var6 = this.minPlane; var6 < this.planes; ++var6) {
			var7 = this.tiles[var6];

			for (var8 = -(var4 + this.Scene_offsetOccluder); var8 <= 0; ++var8) {
				var9 = var8 + this.field2014;
				var10 = this.field2014 - var8;
				if (var9 >= this.Scene_cameraXTileMin || var10 < this.Scene_cameraXTileMax) {
					for (var11 = -(var5 + this.Scene_offsetOccluder); var11 <= 0; ++var11) {
						var12 = var11 + this.field2038;
						var13 = this.field2038 - var11;
						if (var9 >= this.Scene_cameraXTileMin && var9 < this.Scene_cameraXTileMax) {
							if (var12 >= this.Scene_cameraYTileMin && var12 < this.Scene_cameraYTileMax) {
								var14 = var7[var9][var12];
								if (var14 != null && var14.drawPrimary) {
									this.drawTile(var1, var14, false);
								}
							}

							if (var13 >= this.Scene_cameraYTileMin && var13 < this.Scene_cameraYTileMax) {
								var14 = var7[var9][var13];
								if (var14 != null && var14.drawPrimary) {
									this.drawTile(var1, var14, false);
								}
							}
						}

						if (var10 >= this.Scene_cameraXTileMin && var10 < this.Scene_cameraXTileMax) {
							if (var12 >= this.Scene_cameraYTileMin && var12 < this.Scene_cameraYTileMax) {
								var14 = var7[var10][var12];
								if (var14 != null && var14.drawPrimary) {
									this.drawTile(var1, var14, false);
								}
							}

							if (var13 >= this.Scene_cameraYTileMin && var13 < this.Scene_cameraYTileMax) {
								var14 = var7[var10][var13];
								if (var14 != null && var14.drawPrimary) {
									this.drawTile(var1, var14, false);
								}
							}
						}

						if (this.tileUpdateCount == 0) {
							this.processWalkClick();
							return;
						}
					}
				}
			}
		}

		this.processWalkClick();
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(Lht;Lgu;Z)V"
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
													if (!this.method4329(0, var5, var6)) {
														var1.drawTileUnderlay(this, var10.paint, 0, var5, var6);
													}
												} else if (var10.model != null && !this.method4329(0, var5, var6)) {
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
												if (!this.method4329(var8, var5, var6)) {
													var20 = true;
													if (var4.paint.neColor != 12345678 || var7 <= this.Scene_selectedPlane) {
														var1.drawTileUnderlay(this, var4.paint, var8, var5, var6);
													}
												}
											} else if (var4.model != null && !this.method4329(var8, var5, var6)) {
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

												var12 = field2059[var21];
												var4.field1949 = field2066[var21];
											}

											if (var31 != null) {
												if ((var31.orientationA & field2061[var21]) != 0) {
													if (var31.orientationA == 16) {
														var4.drawGameObjectEdges = 3;
														var4.field1947 = field2074[var21];
														var4.field1946 = 3 - var4.field1947;
													} else if (var31.orientationA == 32) {
														var4.drawGameObjectEdges = 6;
														var4.field1947 = field2068[var21];
														var4.field1946 = 6 - var4.field1947;
													} else if (var31.orientationA == 64) {
														var4.drawGameObjectEdges = 12;
														var4.field1947 = field2069[var21];
														var4.field1946 = 12 - var4.field1947;
													} else {
														var4.drawGameObjectEdges = 9;
														var4.field1947 = field2070[var21];
														var4.field1946 = 9 - var4.field1947;
													}
												} else {
													var4.drawGameObjectEdges = 0;
												}

												if ((var31.orientationA & var12) != 0 && !this.method4243(var8, var5, var6, var31.orientationA)) {
													var1.draw(var31.renderable1, 0, var31.x * 4096, var31.z, var31.y * 4096, var31.tag);
												}

												if ((var31.orientationB & var12) != 0 && !this.method4243(var8, var5, var6, var31.orientationB)) {
													var1.draw(var31.renderable2, 0, var31.x * 4096, var31.z, var31.y * 4096, var31.tag);
												}
											}

											if (var14 != null && !this.method4244(var8, var5, var6, var14.renderable1.height)) {
												if ((var14.orientation & var12) != 0) {
													var1.draw(var14.renderable1, 0, var14.x * 4096 + var14.xOffset, var14.z, var14.y * 4096 + var14.yOffset, var14.tag);
												} else if (var14.orientation == 256) {
													var15 = var14.x * 4096 - this.Scene_cameraX;
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
														var1.draw(var14.renderable1, 0, var14.x * 4096 + var14.xOffset, var14.z, var14.y * 4096 + var14.yOffset, var14.tag);
													} else if (var14.renderable2 != null) {
														var1.draw(var14.renderable2, 0, var14.x * 4096, var14.z, var14.y * 4096, var14.tag);
													}
												}
											}

											if (var20) {
												FloorDecoration var22 = var4.floorDecoration;
												if (var22 != null) {
													var1.draw(var22.renderable, 0, var22.x * 64, var22.z, var22.y * 4096, var22.tag);
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
												if (var4.gameObjects[var21].lastDrawn != this.Scene_drawnCount && (var4.gameObjectEdgeMasks[var21] & var4.drawGameObjectEdges) == var4.field1947) {
													var20 = false;
													break;
												}
											}

											if (var20) {
												var11 = var4.boundaryObject;
												if (!this.method4243(var8, var5, var6, var11.orientationA)) {
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

																if ((var17 & var36.drawGameObjectEdges) == var4.field1946) {
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
														var13.field2335 = var24 + var17;
													} else {
														var13.field2335 = var24 + var16;
													}
												}
											}

											while (true) {
												var12 = -50;
												var25 = -1;

												for (var24 = 0; var24 < var21; ++var24) {
													GameObject var35 = this.gameObjects[var24];
													if (var35.lastDrawn != this.Scene_drawnCount) {
														if (var35.field2335 > var12) {
															var12 = var35.field2335;
															var25 = var24;
														} else if (var12 == var35.field2335) {
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
												if (!this.method4245(var8, var33.startX, var33.endX, var33.startY, var33.endY, var33.renderable.height)) {
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

			if (var4.field1949 != 0) {
				WallDecoration var29 = var4.wallDecoration;
				if (var29 != null && !this.method4244(var8, var5, var6, var29.renderable1.height)) {
					if ((var29.orientation & var4.field1949) != 0) {
						var1.draw(var29.renderable1, 0, var29.x * 4096 + var29.xOffset, var29.z, var29.y * 4096 + var29.yOffset, var29.tag);
					} else if (var29.orientation == 256) {
						var12 = var29.x * 4096 - this.Scene_cameraX;
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
							var1.draw(var29.renderable1, 0, var29.x * 4096 + var29.xOffset, var29.z, var29.y * 4096 + var29.yOffset, var29.tag);
						} else if (var29.renderable2 != null) {
							var1.draw(var29.renderable2, 0, var29.x * 4096, var29.z, var29.y * 4096, var29.tag);
						}
					}
				}

				BoundaryObject var27 = var4.boundaryObject;
				if (var27 != null) {
					if ((var27.orientationB & var4.field1949) != 0 && !this.method4243(var8, var5, var6, var27.orientationB)) {
						var1.draw(var27.renderable2, 0, var27.x * 4096, var27.z, var27.y * 4096, var27.tag);
					}

					if ((var27.orientationA & var4.field1949) != 0 && !this.method4243(var8, var5, var6, var27.orientationA)) {
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

	@ObfuscatedName("cd")
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
							var4.field2131 = 1;
						} else {
							if (var9 >= -32) {
								continue;
							}

							var4.field2131 = 2;
							var9 = -var9;
						}

						var4.field2140 = (var4.minZ - this.Scene_cameraZ << 8) / var9;
						var4.field2141 = (var4.maxZ - this.Scene_cameraZ << 8) / var9;
						var4.field2142 = (var4.minY - this.Scene_cameraY << 8) / var9;
						var4.field2135 = (var4.maxY - this.Scene_cameraY << 8) / var9;
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
							var4.field2131 = 3;
						} else {
							if (var9 >= -32) {
								continue;
							}

							var4.field2131 = 4;
							var9 = -var9;
						}

						var4.field2138 = (var4.minX - this.Scene_cameraX << 8) / var9;
						var4.field2139 = (var4.maxX - this.Scene_cameraX << 8) / var9;
						var4.field2142 = (var4.minY - this.Scene_cameraY << 8) / var9;
						var4.field2135 = (var4.maxY - this.Scene_cameraY << 8) / var9;
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

						label149:
						for (int var11 = var8; var11 <= var9; ++var11) {
							for (int var12 = var6; var12 <= var7; ++var12) {
								if (this.visibleTiles(var11, var12)) {
									var10 = true;
									break label149;
								}
							}
						}

						if (var10) {
							var4.field2131 = 5;
							var4.field2138 = (var4.minX - this.Scene_cameraX << 8) / var5;
							var4.field2139 = (var4.maxX - this.Scene_cameraX << 8) / var5;
							var4.field2140 = (var4.minZ - this.Scene_cameraZ << 8) / var5;
							var4.field2141 = (var4.maxZ - this.Scene_cameraZ << 8) / var5;
							this.Scene_currentOccluders[this.Scene_currentOccludersCount++] = var4;
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("cv")
	boolean method4329(int var1, int var2, int var3) {
		int var4 = this.field2013[var1][var2][var3];
		if (var4 == -this.Scene_drawnCount) {
			return false;
		} else if (var4 == this.Scene_drawnCount) {
			return true;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			if (this.method4246(var5 + 1, this.tileHeights[var1][var2][var3], var6 + 1) && this.method4246(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3], var6 + 1) && this.method4246(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.method4246(var5 + 1, this.tileHeights[var1][var2][var3 + 1], var6 + 128 - 1)) {
				this.field2013[var1][var2][var3] = this.Scene_drawnCount;
				return true;
			} else {
				this.field2013[var1][var2][var3] = -this.Scene_drawnCount;
				return false;
			}
		}
	}

	@ObfuscatedName("ck")
	boolean method4243(int var1, int var2, int var3, int var4) {
		if (!this.method4329(var1, var2, var3)) {
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
						if (!this.method4246(var5, var7, var6)) {
							return false;
						}

						if (!this.method4246(var5, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.method4246(var5, var8, var6)) {
							return false;
						}

						if (!this.method4246(var5, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.method4246(var5, var9, var6)) {
						return false;
					}

					if (!this.method4246(var5, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 2) {
					if (var6 < this.Scene_cameraZ) {
						if (!this.method4246(var5, var7, var6 + 128)) {
							return false;
						}

						if (!this.method4246(var5 + 128, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.method4246(var5, var8, var6 + 128)) {
							return false;
						}

						if (!this.method4246(var5 + 128, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.method4246(var5, var9, var6 + 128)) {
						return false;
					}

					if (!this.method4246(var5 + 128, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 4) {
					if (var5 < this.Scene_cameraX) {
						if (!this.method4246(var5 + 128, var7, var6)) {
							return false;
						}

						if (!this.method4246(var5 + 128, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.method4246(var5 + 128, var8, var6)) {
							return false;
						}

						if (!this.method4246(var5 + 128, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.method4246(var5 + 128, var9, var6)) {
						return false;
					}

					if (!this.method4246(var5 + 128, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 8) {
					if (var6 > this.Scene_cameraZ) {
						if (!this.method4246(var5, var7, var6)) {
							return false;
						}

						if (!this.method4246(var5 + 128, var7, var6)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.method4246(var5, var8, var6)) {
							return false;
						}

						if (!this.method4246(var5 + 128, var8, var6)) {
							return false;
						}
					}

					if (!this.method4246(var5, var9, var6)) {
						return false;
					}

					if (!this.method4246(var5 + 128, var9, var6)) {
						return false;
					}

					return true;
				}
			}

			if (!this.method4246(var5 + 64, var10, var6 + 64)) {
				return false;
			} else if (var4 == 16) {
				return this.method4246(var5, var9, var6 + 128);
			} else if (var4 == 32) {
				return this.method4246(var5 + 128, var9, var6 + 128);
			} else if (var4 == 64) {
				return this.method4246(var5 + 128, var9, var6);
			} else if (var4 == 128) {
				return this.method4246(var5, var9, var6);
			} else {
				return true;
			}
		}
	}

	@ObfuscatedName("cs")
	boolean method4244(int var1, int var2, int var3, int var4) {
		if (!this.method4329(var1, var2, var3)) {
			return false;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			return this.method4246(var5 + 1, this.tileHeights[var1][var2][var3] - var4, var6 + 1) && this.method4246(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3] - var4, var6 + 1) && this.method4246(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.method4246(var5 + 1, this.tileHeights[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
		}
	}

	@ObfuscatedName("cm")
	boolean method4245(int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		int var8;
		if (var3 == var2 && var5 == var4) {
			if (!this.method4329(var1, var2, var4)) {
				return false;
			} else {
				var7 = var2 << 7;
				var8 = var4 << 7;
				return this.method4246(var7 + 1, this.tileHeights[var1][var2][var4] - var6, var8 + 1) && this.method4246(var7 + 128 - 1, this.tileHeights[var1][var2 + 1][var4] - var6, var8 + 1) && this.method4246(var7 + 128 - 1, this.tileHeights[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.method4246(var7 + 1, this.tileHeights[var1][var2][var4 + 1] - var6, var8 + 128 - 1);
			}
		} else {
			for (var7 = var2; var7 <= var3; ++var7) {
				for (var8 = var4; var8 <= var5; ++var8) {
					if (this.field2013[var1][var7][var8] == -this.Scene_drawnCount) {
						return false;
					}
				}
			}

			var7 = (var2 << 7) + 1;
			var8 = (var4 << 7) + 2;
			int var9 = this.tileHeights[var1][var2][var4] - var6;
			if (!this.method4246(var7, var9, var8)) {
				return false;
			} else {
				int var10 = (var3 << 7) - 1;
				if (!this.method4246(var10, var9, var8)) {
					return false;
				} else {
					int var11 = (var5 << 7) - 1;
					if (!this.method4246(var7, var9, var11)) {
						return false;
					} else if (!this.method4246(var10, var9, var11)) {
						return false;
					} else {
						return true;
					}
				}
			}
		}
	}

	@ObfuscatedName("ce")
	boolean method4246(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.Scene_currentOccludersCount; ++var4) {
			Occluder var5 = this.Scene_currentOccluders[var4];
			int var6;
			int var7;
			int var8;
			int var9;
			int var10;
			if (var5.field2131 == 1) {
				var6 = var5.minX - var1;
				if (var6 > 0) {
					var7 = (var6 * var5.field2140 >> 8) + var5.minZ;
					var8 = (var6 * var5.field2141 >> 8) + var5.maxZ;
					var9 = (var6 * var5.field2142 >> 8) + var5.minY;
					var10 = (var6 * var5.field2135 >> 8) + var5.maxY;
					if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.field2131 == 2) {
				var6 = var1 - var5.minX;
				if (var6 > 0) {
					var7 = (var6 * var5.field2140 >> 8) + var5.minZ;
					var8 = (var6 * var5.field2141 >> 8) + var5.maxZ;
					var9 = (var6 * var5.field2142 >> 8) + var5.minY;
					var10 = (var6 * var5.field2135 >> 8) + var5.maxY;
					if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.field2131 == 3) {
				var6 = var5.minZ - var3;
				if (var6 > 0) {
					var7 = (var6 * var5.field2138 >> 8) + var5.minX;
					var8 = (var6 * var5.field2139 >> 8) + var5.maxX;
					var9 = (var6 * var5.field2142 >> 8) + var5.minY;
					var10 = (var6 * var5.field2135 >> 8) + var5.maxY;
					if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.field2131 == 4) {
				var6 = var3 - var5.minZ;
				if (var6 > 0) {
					var7 = (var6 * var5.field2138 >> 8) + var5.minX;
					var8 = (var6 * var5.field2139 >> 8) + var5.maxX;
					var9 = (var6 * var5.field2142 >> 8) + var5.minY;
					var10 = (var6 * var5.field2135 >> 8) + var5.maxY;
					if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.field2131 == 5) {
				var6 = var2 - var5.minY;
				if (var6 > 0) {
					var7 = (var6 * var5.field2138 >> 8) + var5.minX;
					var8 = (var6 * var5.field2139 >> 8) + var5.maxX;
					var9 = (var6 * var5.field2140 >> 8) + var5.minZ;
					var10 = (var6 * var5.field2141 >> 8) + var5.maxZ;
					if (var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) {
						return true;
					}
				}
			}
		}

		return false;
	}

	@ObfuscatedName("eq")
	void vmethod4616(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
		class429 var15 = new class429();
		var15.method8459((float)((double)(-var2) * 0.0030679615D));
		var15.method8460((float)((double)(-var3) * 0.0030679615D));
		var15.method8458((float)var7, (float)var8, (float)var9);
		TransformationMatrix var16 = new TransformationMatrix();
		var16.method8381(var15);
		var16.method8383();
		int var17 = this.cycle % 300;
		float var18 = (float)var17 / 300.0F * 6.283F;
		float var19 = (float)Math.sin((double)var18);
		float var20 = (float)Math.cos((double)var18);
		float var21 = var19 * 3.14159F / 100.0F;
		float var22 = var20 * 3.14159F / 100.0F;
		class422 var23 = new class422();
		TransformationMatrix var24 = new TransformationMatrix();
		var23.field4728 = new class427((float)((double)var1 * 0.0030679615D), var21, var22);
		var23.field4729 = new class426((float)var4, (float)var5, (float)var6);
		TransformationMatrix var25 = new TransformationMatrix();
		var25.method8379(var23);
		var25.method8383();
		class422 var26 = new class422();
		var26.field4729 = new class426((float)(-(this.xSize * 64) - this.field2002), 0.0F, (float)(-(this.ySize * 64) - this.field2040));
		TransformationMatrix var27 = new TransformationMatrix();
		var27.method8379(var26);
		var24.method8398(1.0F, 1.0F, 1.0F, 1.0F);
		var27.method8389(var24);
		var24.method8379(var23);
		var27.method8389(var24);
		var27.method8389(var16);
		this.Scene_cameraX = (int)var25.method8400((float)var7, (float)var8, (float)var9);
		this.Scene_cameraY = (int)var25.method8388((float)var7, (float)var8, (float)var9);
		this.Scene_cameraZ = (int)var25.method8452((float)var7, (float)var8, (float)var9);
		this.Scene_cameraXTile = this.Scene_cameraX / 128;
		this.Scene_cameraYTile = this.Scene_cameraZ / 128;
		this.Scene_entityX = (int)var25.method8400((float)var12, 0.0F, (float)var13) / 128;
		this.Scene_entityY = (int)var25.method8452((float)var12, 0.0F, (float)var13) / 128;
		FloatProjection var28 = new FloatProjection(var27);
		this.updateVisibleTilesAndOccluders(var28, var14);
	}

	@ObfuscatedName("cj")
	static final int method4239(int var0, int var1) {
		var1 = (var0 & 127) * var1 >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}

	@ObfuscatedName("cx")
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
