import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uq")
@Implements("WorldMap")
public class WorldMap {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	@Export("fontNameVerdana11")
	static final FontName fontNameVerdana11;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	@Export("fontNameVerdana13")
	static final FontName fontNameVerdana13;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	@Export("fontNameVerdana15")
	static final FontName fontNameVerdana15;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("WorldMap_archive")
	AbstractArchive WorldMap_archive;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("WorldMap_geographyArchive")
	AbstractArchive WorldMap_geographyArchive;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("WorldMap_groundArchive")
	AbstractArchive WorldMap_groundArchive;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	@Export("font")
	Font font;
	@ObfuscatedName("ar")
	@Export("fonts")
	HashMap fonts;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[Lvy;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("az")
	@Export("details")
	HashMap details;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("mainMapArea")
	WorldMapArea mainMapArea;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("currentMapArea")
	WorldMapArea currentMapArea;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	WorldMapArea field5261;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("worldMapRenderer")
	WorldMapRenderer worldMapRenderer;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Luo;"
	)
	@Export("cacheLoader")
	WorldMapArchiveLoader cacheLoader;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 413975041
	)
	@Export("centerTileX")
	int centerTileX;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1889906575
	)
	@Export("centerTileY")
	int centerTileY;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 11253773
	)
	@Export("worldMapTargetX")
	int worldMapTargetX;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1303643987
	)
	@Export("worldMapTargetY")
	int worldMapTargetY;
	@ObfuscatedName("ag")
	@Export("zoom")
	float zoom;
	@ObfuscatedName("bw")
	@Export("zoomTarget")
	float zoomTarget;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1947373129
	)
	@Export("worldMapDisplayWidth")
	int worldMapDisplayWidth;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -21441541
	)
	@Export("worldMapDisplayHeight")
	int worldMapDisplayHeight;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 587095127
	)
	@Export("worldMapDisplayX")
	int worldMapDisplayX;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1494579165
	)
	@Export("worldMapDisplayY")
	int worldMapDisplayY;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -1075665199
	)
	@Export("maxFlashCount")
	int maxFlashCount;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 2018906991
	)
	@Export("cyclesPerFlash")
	int cyclesPerFlash;
	@ObfuscatedName("bp")
	@Export("perpetualFlash")
	boolean perpetualFlash;
	@ObfuscatedName("bo")
	@Export("flashingElements")
	HashSet flashingElements;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 1071118991
	)
	@Export("flashCount")
	int flashCount;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 745008131
	)
	@Export("flashCycle")
	int flashCycle;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 1517199243
	)
	int field5273;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 1253976453
	)
	int field5295;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -753740675
	)
	int field5284;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1654800111
	)
	int field5307;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		longValue = -1541717218292520349L
	)
	long field5287;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -95490123
	)
	int field5288;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -541575641
	)
	int field5289;
	@ObfuscatedName("bq")
	boolean field5290;
	@ObfuscatedName("bf")
	@Export("enabledElements")
	HashSet enabledElements;
	@ObfuscatedName("be")
	@Export("enabledCategories")
	HashSet enabledCategories;
	@ObfuscatedName("by")
	@Export("enabledElementIds")
	HashSet enabledElementIds;
	@ObfuscatedName("bs")
	HashSet field5294;
	@ObfuscatedName("bc")
	@Export("elementsDisabled")
	boolean elementsDisabled;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -1598942575
	)
	int field5296;
	@ObfuscatedName("cy")
	@Export("menuOpcodes")
	final int[] menuOpcodes;
	@ObfuscatedName("cv")
	List field5298;
	@ObfuscatedName("cq")
	@Export("iconIterator")
	Iterator iconIterator;
	@ObfuscatedName("cn")
	HashSet field5300;
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("mouseCoord")
	Coord mouseCoord;
	@ObfuscatedName("cs")
	@Export("showCoord")
	public boolean showCoord;
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "Lvr;"
	)
	@Export("sprite")
	SpritePixels sprite;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 1703142909
	)
	@Export("cachedPixelsPerTile")
	int cachedPixelsPerTile;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 581495741
	)
	@Export("minCachedTileX")
	int minCachedTileX;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 978436125
	)
	@Export("minCachedTileY")
	int minCachedTileY;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -123557131
	)
	int field5292;

	static {
		fontNameVerdana11 = FontName.FontName_verdana11;
		fontNameVerdana13 = FontName.FontName_verdana13;
		fontNameVerdana15 = FontName.FontName_verdana15;
	}

	public WorldMap() {
		this.worldMapTargetX = -1;
		this.worldMapTargetY = -1;
		this.worldMapDisplayWidth = -1;
		this.worldMapDisplayHeight = -1;
		this.worldMapDisplayX = -1;
		this.worldMapDisplayY = -1;
		this.maxFlashCount = 3;
		this.cyclesPerFlash = 50;
		this.perpetualFlash = false;
		this.flashingElements = null;
		this.flashCount = -1;
		this.flashCycle = -1;
		this.field5273 = -1;
		this.field5295 = -1;
		this.field5284 = -1;
		this.field5307 = -1;
		this.field5290 = true;
		this.enabledElements = new HashSet();
		this.enabledCategories = new HashSet();
		this.enabledElementIds = new HashSet();
		this.field5294 = new HashSet();
		this.elementsDisabled = false;
		this.field5296 = 0;
		this.menuOpcodes = new int[]{1008, 1009, 1010, 1011, 1012};
		this.field5300 = new HashSet();
		this.mouseCoord = null;
		this.showCoord = false;
		this.minCachedTileX = -1;
		this.minCachedTileY = -1;
		this.field5292 = -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpi;Lpi;Lpi;Lqu;Ljava/util/HashMap;[Lvy;I)V",
		garbageValue = "184213022"
	)
	@Export("init")
	public void init(AbstractArchive var1, AbstractArchive var2, AbstractArchive var3, Font var4, HashMap var5, IndexedSprite[] var6) {
		this.mapSceneSprites = var6;
		this.WorldMap_archive = var1;
		this.WorldMap_geographyArchive = var2;
		this.WorldMap_groundArchive = var3;
		this.font = var4;
		this.fonts = new HashMap();
		this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_small, var5.get(fontNameVerdana11));
		this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_medium, var5.get(fontNameVerdana13));
		this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_large, var5.get(fontNameVerdana15));
		this.cacheLoader = new WorldMapArchiveLoader(var1);
		int var7 = this.WorldMap_archive.getGroupId(WorldMapCacheName.field3272.name);
		int[] var8 = this.WorldMap_archive.getGroupFileIds(var7);
		int var9 = var8 == null ? 0 : var8.length;
		this.details = new HashMap(var9);

		for (int var10 = 0; var10 < var9; ++var10) {
			Buffer var11 = new Buffer(this.WorldMap_archive.takeFile(var7, var8[var10]));
			WorldMapArea var12 = new WorldMapArea();
			var12.method5839(var11, var8[var10]);
			this.details.put(var12.getInternalName(), var12);
			if (var12.getIsMain()) {
				this.mainMapArea = var12;
			}
		}

		this.setCurrentMapArea(this.mainMapArea);
		this.field5261 = null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "10"
	)
	public void method9528() {
		Decimator.method1118();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIZIIIII)V",
		garbageValue = "679119060"
	)
	@Export("onCycle")
	public void onCycle(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
		if (this.cacheLoader.isLoaded()) {
			this.smoothZoom();
			this.scrollToTarget();
			if (var3) {
				int var8 = (int)Math.ceil((double)((float)var6 / this.zoom));
				int var9 = (int)Math.ceil((double)((float)var7 / this.zoom));
				List var10 = this.worldMapRenderer.method6048(this.centerTileX - var8 / 2 - 1, this.centerTileY - var9 / 2 - 1, var8 / 2 + this.centerTileX + 1, var9 / 2 + this.centerTileY + 1, var4, var5, var6, var7, var1, var2);
				HashSet var11 = new HashSet();

				Iterator var12;
				AbstractWorldMapIcon var13;
				ScriptEvent var14;
				WorldMapEvent var15;
				for (var12 = var10.iterator(); var12.hasNext(); WorldMapEvent.runScriptEvent(var14)) {
					var13 = (AbstractWorldMapIcon)var12.next();
					var11.add(var13);
					var14 = new ScriptEvent();
					var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2);
					var14.setArgs(new Object[]{var15, var1, var2});
					if (this.field5300.contains(var13)) {
						var14.setType(17);
					} else {
						var14.setType(15);
					}
				}

				var12 = this.field5300.iterator();

				while (var12.hasNext()) {
					var13 = (AbstractWorldMapIcon)var12.next();
					if (!var11.contains(var13)) {
						var14 = new ScriptEvent();
						var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2);
						var14.setArgs(new Object[]{var15, var1, var2});
						var14.setType(16);
						WorldMapEvent.runScriptEvent(var14);
					}
				}

				this.field5300 = var11;
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIZZI)V",
		garbageValue = "544116316"
	)
	public void method9692(int var1, int var2, boolean var3, boolean var4) {
		long var5;
		label39: {
			var5 = class59.method1150();
			this.method9531(var1, var2, var4, var5);
			if (!this.hasTarget() && (var4 || var3)) {
				boolean var7 = Client.clickedWidget != null;
				if (!var7) {
					if (var4) {
						this.field5284 = var1;
						this.field5307 = var2;
						this.field5273 = this.centerTileX;
						this.field5295 = this.centerTileY;
					}

					if (this.field5273 != -1) {
						int var8 = var1 - this.field5284;
						int var9 = var2 - this.field5307;
						this.setWorldMapPosition(this.field5273 - (int)((float)var8 / this.zoomTarget), (int)((float)var9 / this.zoomTarget) + this.field5295, false);
					}
					break label39;
				}
			}

			this.method9535();
		}

		if (var4) {
			this.field5287 = var5;
			this.field5288 = var1;
			this.field5289 = var2;
		}

	}

	@ObfuscatedName("ao")
	void method9531(int var1, int var2, boolean var3, long var4) {
		if (this.currentMapArea != null) {
			int var6 = (int)((float)this.centerTileX + ((float)(var1 - this.worldMapDisplayX) - (float)this.getDisplayWith() * this.zoom / 2.0F) / this.zoom);
			int var7 = (int)((float)this.centerTileY - ((float)(var2 - this.worldMapDisplayY) - (float)this.getDisplayHeight() * this.zoom / 2.0F) / this.zoom);
			this.mouseCoord = this.currentMapArea.coord(var6 + this.currentMapArea.getRegionLowX() * 64, var7 + this.currentMapArea.getRegionLowY() * 64);
			if (this.mouseCoord != null && var3) {
				IndexCheck var8 = Client.indexCheck;
				boolean var10 = Client.staffModLevel >= 2;
				if (var10 && var8.isValidIndexInRange(82) && var8.isValidIndexInRange(81)) {
					UserComparator9.method3238(this.mouseCoord.x, this.mouseCoord.y, this.mouseCoord.plane, false);
				} else {
					boolean var11 = true;
					if (this.field5290) {
						int var12 = var1 - this.field5288;
						int var13 = var2 - this.field5289;
						if (var4 - this.field5287 > 500L || var12 < -25 || var12 > 25 || var13 < -25 || var13 > 25) {
							var11 = false;
						}
					}

					if (var11) {
						PacketBufferNode var14 = Message.getPacketBufferNode(ClientPacket.CLICK_WORLD_MAP, Client.packetWriter.isaacCipher);
						var14.packetBuffer.writeIntME(this.mouseCoord.packed());
						Client.packetWriter.addNode(var14);
						this.field5287 = 0L;
					}
				}
			}
		} else {
			this.mouseCoord = null;
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1189653721"
	)
	@Export("smoothZoom")
	void smoothZoom() {
		if (class506.field5147 != null) {
			this.zoom = this.zoomTarget;
		} else {
			if (this.zoom < this.zoomTarget) {
				this.zoom = Math.min(this.zoomTarget, this.zoom + this.zoom / 30.0F);
			}

			if (this.zoom > this.zoomTarget) {
				this.zoom = Math.max(this.zoomTarget, this.zoom - this.zoom / 30.0F);
			}

		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1449400177"
	)
	@Export("scrollToTarget")
	void scrollToTarget() {
		if (this.hasTarget()) {
			int var1 = this.worldMapTargetX - this.centerTileX;
			int var2 = this.worldMapTargetY - this.centerTileY;
			if (var1 != 0) {
				var1 /= Math.min(8, Math.abs(var1));
			}

			if (var2 != 0) {
				var2 /= Math.min(8, Math.abs(var2));
			}

			this.setWorldMapPosition(var1 + this.centerTileX, var2 + this.centerTileY, true);
			if (this.worldMapTargetX == this.centerTileX && this.centerTileY == this.worldMapTargetY) {
				this.worldMapTargetX = -1;
				this.worldMapTargetY = -1;
			}

		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-171137587"
	)
	@Export("setWorldMapPosition")
	final void setWorldMapPosition(int var1, int var2, boolean var3) {
		this.centerTileX = var1;
		this.centerTileY = var2;
		class59.method1150();
		if (var3) {
			this.method9535();
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-768323799"
	)
	final void method9535() {
		this.field5307 = -1;
		this.field5284 = -1;
		this.field5295 = -1;
		this.field5273 = -1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1276527019"
	)
	@Export("hasTarget")
	boolean hasTarget() {
		return this.worldMapTargetX != -1 && this.worldMapTargetY != -1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lkt;",
		garbageValue = "-616138378"
	)
	@Export("mapAreaAtCoord")
	public WorldMapArea mapAreaAtCoord(int var1, int var2, int var3) {
		Iterator var4 = this.details.values().iterator();

		WorldMapArea var5;
		do {
			if (!var4.hasNext()) {
				return null;
			}

			var5 = (WorldMapArea)var4.next();
		} while(!var5.containsCoord(var1, var2, var3));

		return var5;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "1820090444"
	)
	public void method9735(int var1, int var2, int var3, boolean var4) {
		WorldMapArea var5 = this.mapAreaAtCoord(var1, var2, var3);
		if (var5 == null) {
			if (!var4) {
				return;
			}

			var5 = this.mainMapArea;
		}

		boolean var6 = false;
		if (var5 != this.field5261 || var4) {
			this.field5261 = var5;
			this.setCurrentMapArea(var5);
			var6 = true;
		}

		if (var6 || var4) {
			this.jump(var1, var2, var3);
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1734466589"
	)
	@Export("setCurrentMapAreaId")
	public void setCurrentMapAreaId(int var1) {
		WorldMapArea var2 = this.getMapArea(var1);
		if (var2 != null) {
			this.setCurrentMapArea(var2);
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-44"
	)
	@Export("currentMapAreaId")
	public int currentMapAreaId() {
		return this.currentMapArea == null ? -1 : this.currentMapArea.getId();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Lkt;",
		garbageValue = "-1189653721"
	)
	@Export("getCurrentMapArea")
	public WorldMapArea getCurrentMapArea() {
		return this.currentMapArea;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lkt;B)V",
		garbageValue = "-62"
	)
	@Export("setCurrentMapArea")
	void setCurrentMapArea(WorldMapArea var1) {
		if (this.currentMapArea == null || var1 != this.currentMapArea) {
			this.initializeWorldMap(var1);
			this.jump(-1, -1, -1);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lkt;S)V",
		garbageValue = "-1308"
	)
	@Export("initializeWorldMap")
	void initializeWorldMap(WorldMapArea var1) {
		this.currentMapArea = var1;
		this.worldMapRenderer = new WorldMapRenderer(this.mapSceneSprites, this.fonts, this.WorldMap_geographyArchive, this.WorldMap_groundArchive);
		this.cacheLoader.reset(this.currentMapArea == null ? null : this.currentMapArea.getInternalName());
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lkt;Lny;Lny;ZI)V",
		garbageValue = "1843741152"
	)
	public void method9566(WorldMapArea var1, Coord var2, Coord var3, boolean var4) {
		if (var1 != null) {
			if (this.currentMapArea == null || var1 != this.currentMapArea) {
				this.initializeWorldMap(var1);
			}

			if (!var4 && this.currentMapArea.containsCoord(var2.plane, var2.x, var2.y)) {
				this.jump(var2.plane, var2.x, var2.y);
			} else {
				this.jump(var3.plane, var3.x, var3.y);
			}

		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "2052068566"
	)
	@Export("jump")
	void jump(int var1, int var2, int var3) {
		if (this.currentMapArea != null) {
			int[] var4 = this.currentMapArea.position(var1, var2, var3);
			if (var4 == null) {
				var4 = this.currentMapArea.position(this.currentMapArea.getOriginPlane(), this.currentMapArea.getOriginX(), this.currentMapArea.getOriginY());
			}

			this.setWorldMapPosition(var4[0] - this.currentMapArea.getRegionLowX() * 64, var4[1] - this.currentMapArea.getRegionLowY() * 64, true);
			this.worldMapTargetX = -1;
			this.worldMapTargetY = -1;
			this.zoom = this.getZoomFromPercentage(this.currentMapArea.getZoom());
			this.zoomTarget = this.zoom;
			this.field5298 = null;
			this.iconIterator = null;
			this.worldMapRenderer.clearIcons();
		}
	}

	@ObfuscatedName("ad")
	@Export("draw")
	public void draw(int var1, int var2, int var3, int var4, int var5, double var6) {
		int[] var8 = new int[4];
		Rasterizer2D.Rasterizer2D_getClipArray(var8);
		Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var2 + var4);
		int var9 = this.cacheLoader.getPercentLoaded();
		if (var9 < 100) {
			this.drawLoading(var1, var2, var3, var4, var9);
		} else {
			if (!this.worldMapRenderer.isLoaded()) {
				this.worldMapRenderer.method6043(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld);
				if (!this.worldMapRenderer.isLoaded()) {
					return;
				}
			}

			int var11 = this.worldMapRenderer.method6082();
			double var12 = (double)(var11 >> 16 & 255) / 256.0D;
			double var14 = (double)(var11 >> 8 & 255) / 256.0D;
			double var16 = (double)(var11 & 255) / 256.0D;
			var12 = Math.pow(var12, var6);
			var14 = Math.pow(var14, var6);
			var16 = Math.pow(var16, var6);
			int var18 = (int)(256.0D * var12);
			int var19 = (int)(256.0D * var14);
			int var20 = (int)(var16 * 256.0D);
			int var10 = var20 + (var19 << 8) + (var18 << 16) + -16777216;
			Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, var10);
			if (this.flashingElements != null) {
				++this.flashCycle;
				if (this.flashCycle % this.cyclesPerFlash == 0) {
					this.flashCycle = 0;
					++this.flashCount;
				}

				if (this.flashCount >= this.maxFlashCount && !this.perpetualFlash) {
					this.flashingElements = null;
				}
			}

			int var13 = (int)Math.ceil((double)((float)var3 / this.zoom));
			int var22 = (int)Math.ceil((double)((float)var4 / this.zoom));
			double var15 = Rasterizer3D.method4706();
			this.worldMapRenderer.drawTiles(this.centerTileX - var13 / 2, this.centerTileY - var22 / 2, var13 / 2 + this.centerTileX, var22 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4);
			boolean var17;
			if (!this.elementsDisabled) {
				var17 = false;
				if (var5 - this.field5296 > 100) {
					this.field5296 = var5;
					var17 = true;
				}

				this.worldMapRenderer.drawElements(this.centerTileX - var13 / 2, this.centerTileY - var22 / 2, var13 / 2 + this.centerTileX, var22 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4, this.field5294, this.flashingElements, this.flashCycle, this.cyclesPerFlash, var17);
			}

			this.method9548(var1, var2, var3, var4, var13, var22);
			var17 = Client.staffModLevel >= 2;
			if (var17 && this.showCoord && this.mouseCoord != null) {
				this.font.draw("Coord: " + this.mouseCoord, Rasterizer2D.Rasterizer2D_xClipStart + 10, Rasterizer2D.Rasterizer2D_yClipStart + 20, 16776960, -1);
			}

			this.worldMapDisplayWidth = var13;
			this.worldMapDisplayHeight = var22;
			this.worldMapDisplayX = var1;
			this.worldMapDisplayY = var2;
			Rasterizer2D.Rasterizer2D_setClipArray(var8);
			if (var15 != Rasterizer3D.method4706()) {
				Rasterizer3D.buildPalette(var15);
			}

		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1396281738"
	)
	public void method9546() {
		WorldMapRegion.WorldMapRegion_cachedSprites.clear();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)Z",
		garbageValue = "1966763971"
	)
	boolean method9728(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.sprite == null) {
			return true;
		} else if (this.sprite.subWidth == var1 && this.sprite.subHeight == var2) {
			if (this.worldMapRenderer.pixelsPerTile != this.cachedPixelsPerTile) {
				return true;
			} else if (this.field5292 != Client.field802) {
				return true;
			} else if (var3 <= 0 && var4 <= 0) {
				return var3 + var1 < var5 || var2 + var4 < var6;
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIS)V",
		garbageValue = "255"
	)
	void method9548(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class506.field5147 != null) {
			int var7 = 512 / (this.worldMapRenderer.pixelsPerTile * 2);
			int var8 = var3 + 512;
			int var9 = var4 + 512;
			float var10 = 1.0F;
			var8 = (int)((float)var8 / var10);
			var9 = (int)((float)var9 / var10);
			int var11 = this.getDisplayX() - var5 / 2 - var7;
			int var12 = this.getDisplayY() - var6 / 2 - var7;
			int var13 = var1 - (var7 + var11 - this.minCachedTileX) * this.worldMapRenderer.pixelsPerTile;
			int var14 = var2 - this.worldMapRenderer.pixelsPerTile * (var7 - (var12 - this.minCachedTileY));
			if (this.method9728(var8, var9, var13, var14, var3, var4)) {
				if (this.sprite != null && this.sprite.subWidth == var8 && this.sprite.subHeight == var9) {
					Arrays.fill(this.sprite.pixels, 0);
				} else {
					this.sprite = new SpritePixels(var8, var9);
				}

				this.minCachedTileX = this.getDisplayX() - var5 / 2 - var7;
				this.minCachedTileY = this.getDisplayY() - var6 / 2 - var7;
				this.cachedPixelsPerTile = this.worldMapRenderer.pixelsPerTile;
				class506.field5147.method7762(this.minCachedTileX, this.minCachedTileY, this.sprite, (float)this.cachedPixelsPerTile / var10);
				this.field5292 = Client.field802;
				var13 = var1 - (var11 + var7 - this.minCachedTileX) * this.worldMapRenderer.pixelsPerTile;
				var14 = var2 - this.worldMapRenderer.pixelsPerTile * (var7 - (var12 - this.minCachedTileY));
			}

			Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var1, var2, var3, var4, 0, 128);
			if (var10 == 1.0F) {
				this.sprite.method10588(var13, var14, 192);
			} else {
				this.sprite.method10587(var13, var14, (int)(var10 * (float)var8), (int)((float)var9 * var10), 192);
			}
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-2146324570"
	)
	@Export("drawOverview")
	public void drawOverview(int var1, int var2, int var3, int var4) {
		if (this.cacheLoader.isLoaded()) {
			if (!this.worldMapRenderer.isLoaded()) {
				this.worldMapRenderer.method6043(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld);
				if (!this.worldMapRenderer.isLoaded()) {
					return;
				}
			}

			this.worldMapRenderer.drawOverview(var1, var2, var3, var4, this.flashingElements, this.flashCycle, this.cyclesPerFlash);
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-298408881"
	)
	@Export("setZoomPercentage")
	public void setZoomPercentage(int var1) {
		this.zoomTarget = this.getZoomFromPercentage(var1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "-90"
	)
	@Export("drawLoading")
	void drawLoading(int var1, int var2, int var3, int var4, int var5) {
		byte var6 = 20;
		int var7 = var3 / 2 + var1;
		int var8 = var4 / 2 + var2 - 18 - var6;
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216);
		Rasterizer2D.Rasterizer2D_drawRectangle(var7 - 152, var8, 304, 34, -65536);
		Rasterizer2D.Rasterizer2D_fillRectangle(var7 - 150, var8 + 2, var5 * 3, 30, -65536);
		this.font.drawCentered("Loading...", var7, var6 + var8, -1, -1);
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "406241161"
	)
	@Export("getZoomFromPercentage")
	float getZoomFromPercentage(int var1) {
		if (var1 == 25) {
			return 1.0F;
		} else if (var1 == 37) {
			return 1.5F;
		} else if (var1 == 50) {
			return 2.0F;
		} else if (var1 == 75) {
			return 3.0F;
		} else {
			return var1 == 100 ? 4.0F : 8.0F;
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "113"
	)
	@Export("getZoomLevel")
	public int getZoomLevel() {
		if (1.0D == (double)this.zoomTarget) {
			return 25;
		} else if (1.5D == (double)this.zoomTarget) {
			return 37;
		} else if (2.0D == (double)this.zoomTarget) {
			return 50;
		} else if (3.0D == (double)this.zoomTarget) {
			return 75;
		} else {
			return 4.0D == (double)this.zoomTarget ? 100 : 200;
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1219651155"
	)
	@Export("loadCache")
	public void loadCache() {
		this.cacheLoader.load();
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "518046424"
	)
	@Export("isCacheLoaded")
	public boolean isCacheLoaded() {
		return this.cacheLoader.isLoaded();
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(IB)Lkt;",
		garbageValue = "5"
	)
	@Export("getMapArea")
	public WorldMapArea getMapArea(int var1) {
		Iterator var2 = this.details.values().iterator();

		WorldMapArea var3;
		do {
			if (!var2.hasNext()) {
				return null;
			}

			var3 = (WorldMapArea)var2.next();
		} while(var3.getId() != var1);

		return var3;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-78"
	)
	@Export("setWorldMapPositionTarget")
	public void setWorldMapPositionTarget(int var1, int var2) {
		if (this.currentMapArea != null && this.currentMapArea.containsPosition(var1, var2)) {
			this.worldMapTargetX = var1 - this.currentMapArea.getRegionLowX() * 64;
			this.worldMapTargetY = var2 - this.currentMapArea.getRegionLowY() * 64;
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "98"
	)
	@Export("setWorldMapPositionTargetInstant")
	public void setWorldMapPositionTargetInstant(int var1, int var2) {
		if (this.currentMapArea != null) {
			this.setWorldMapPosition(var1 - this.currentMapArea.getRegionLowX() * 64, var2 - this.currentMapArea.getRegionLowY() * 64, true);
			this.worldMapTargetX = -1;
			this.worldMapTargetY = -1;
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-67"
	)
	@Export("jumpToSourceCoord")
	public void jumpToSourceCoord(int var1, int var2, int var3) {
		if (this.currentMapArea != null) {
			int[] var4 = this.currentMapArea.position(var1, var2, var3);
			if (var4 != null) {
				this.setWorldMapPositionTarget(var4[0], var4[1]);
			}

		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "16"
	)
	@Export("jumpToSourceCoordInstant")
	public void jumpToSourceCoordInstant(int var1, int var2, int var3) {
		if (this.currentMapArea != null) {
			int[] var4 = this.currentMapArea.position(var1, var2, var3);
			if (var4 != null) {
				this.setWorldMapPositionTargetInstant(var4[0], var4[1]);
			}

		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "465853304"
	)
	@Export("getDisplayX")
	public int getDisplayX() {
		return this.currentMapArea == null ? -1 : this.centerTileX + this.currentMapArea.getRegionLowX() * 64;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-82"
	)
	@Export("getDisplayY")
	public int getDisplayY() {
		return this.currentMapArea == null ? -1 : this.centerTileY + this.currentMapArea.getRegionLowY() * 64;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)Lny;",
		garbageValue = "1677318125"
	)
	@Export("getDisplayCoord")
	public Coord getDisplayCoord() {
		return this.currentMapArea == null ? null : this.currentMapArea.coord(this.getDisplayX(), this.getDisplayY());
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "107"
	)
	@Export("getDisplayWith")
	public int getDisplayWith() {
		return this.worldMapDisplayWidth;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "211956766"
	)
	@Export("getDisplayHeight")
	public int getDisplayHeight() {
		return this.worldMapDisplayHeight;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1801046649"
	)
	@Export("setMaxFlashCount")
	public void setMaxFlashCount(int var1) {
		if (var1 >= 1) {
			this.maxFlashCount = var1;
		}

	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-3"
	)
	@Export("resetMaxFlashCount")
	public void resetMaxFlashCount() {
		this.maxFlashCount = 3;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-844934046"
	)
	@Export("setCyclesPerFlash")
	public void setCyclesPerFlash(int var1) {
		if (var1 >= 1) {
			this.cyclesPerFlash = var1;
		}

	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-254467416"
	)
	@Export("resetCyclesPerFlash")
	public void resetCyclesPerFlash() {
		this.cyclesPerFlash = 50;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "3925"
	)
	@Export("setPerpetualFlash")
	public void setPerpetualFlash(boolean var1) {
		this.perpetualFlash = var1;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "14"
	)
	@Export("flashElement")
	public void flashElement(int var1) {
		this.flashingElements = new HashSet();
		this.flashingElements.add(var1);
		this.flashCount = 0;
		this.flashCycle = 0;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1880438523"
	)
	@Export("flashCategory")
	public void flashCategory(int var1) {
		this.flashingElements = new HashSet();
		this.flashCount = 0;
		this.flashCycle = 0;

		for (int var2 = 0; var2 < WorldMapElement.WorldMapElement_count; ++var2) {
			if (Tiles.WorldMapElement_get(var2) != null && Tiles.WorldMapElement_get(var2).category == var1) {
				this.flashingElements.add(Tiles.WorldMapElement_get(var2).objectId);
			}
		}

	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "147296644"
	)
	@Export("stopCurrentFlashes")
	public void stopCurrentFlashes() {
		this.flashingElements = null;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "5"
	)
	@Export("setElementsDisabled")
	public void setElementsDisabled(boolean var1) {
		this.elementsDisabled = !var1;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "-120"
	)
	@Export("disableElement")
	public void disableElement(int var1, boolean var2) {
		if (!var2) {
			this.enabledElements.add(var1);
		} else {
			this.enabledElements.remove(var1);
		}

		this.method9580();
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-1169255180"
	)
	@Export("setCategoryDisabled")
	public void setCategoryDisabled(int var1, boolean var2) {
		if (!var2) {
			this.enabledCategories.add(var1);
		} else {
			this.enabledCategories.remove(var1);
		}

		for (int var3 = 0; var3 < WorldMapElement.WorldMapElement_count; ++var3) {
			if (Tiles.WorldMapElement_get(var3) != null && Tiles.WorldMapElement_get(var3).category == var1) {
				int var4 = Tiles.WorldMapElement_get(var3).objectId;
				if (!var2) {
					this.enabledElementIds.add(var4);
				} else {
					this.enabledElementIds.remove(var4);
				}
			}
		}

		this.method9580();
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2009565481"
	)
	@Export("getElementsDisabled")
	public boolean getElementsDisabled() {
		return !this.elementsDisabled;
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1282717111"
	)
	@Export("isElementDisabled")
	public boolean isElementDisabled(int var1) {
		return !this.enabledElements.contains(var1);
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1757409638"
	)
	@Export("isCategoryDisabled")
	public boolean isCategoryDisabled(int var1) {
		return !this.enabledCategories.contains(var1);
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	void method9580() {
		this.field5294.clear();
		this.field5294.addAll(this.enabledElements);
		this.field5294.addAll(this.enabledElementIds);
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-1765451056"
	)
	@Export("addElementMenuOptions")
	public void addElementMenuOptions(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.cacheLoader.isLoaded()) {
			int var7 = (int)Math.ceil((double)((float)var3 / this.zoom));
			int var8 = (int)Math.ceil((double)((float)var4 / this.zoom));
			List var9 = this.worldMapRenderer.method6048(this.centerTileX - var7 / 2 - 1, this.centerTileY - var8 / 2 - 1, var7 / 2 + this.centerTileX + 1, var8 / 2 + this.centerTileY + 1, var1, var2, var3, var4, var5, var6);
			if (!var9.isEmpty()) {
				Iterator var10 = var9.iterator();

				boolean var13;
				do {
					if (!var10.hasNext()) {
						return;
					}

					AbstractWorldMapIcon var11 = (AbstractWorldMapIcon)var10.next();
					WorldMapElement var12 = Tiles.WorldMapElement_get(var11.getElement());
					var13 = false;

					for (int var14 = this.menuOpcodes.length - 1; var14 >= 0; --var14) {
						if (var12.menuActions[var14] != null) {
							class327.insertMenuItemNoShift(var12.menuActions[var14], var12.menuTargetName, this.menuOpcodes[var14], var11.getElement(), var11.coord1.packed(), var11.coord2.packed());
							var13 = true;
						}
					}
				} while(!var13);

			}
		}
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(ILny;I)Lny;",
		garbageValue = "1712902285"
	)
	public Coord method9582(int var1, Coord var2) {
		if (!this.cacheLoader.isLoaded()) {
			return null;
		} else if (!this.worldMapRenderer.isLoaded()) {
			return null;
		} else if (!this.currentMapArea.containsPosition(var2.x, var2.y)) {
			return null;
		} else {
			HashMap var3 = this.worldMapRenderer.buildIcons();
			List var4 = (List)var3.get(var1);
			if (var4 != null && !var4.isEmpty()) {
				AbstractWorldMapIcon var5 = null;
				int var6 = -1;
				Iterator var7 = var4.iterator();

				while (true) {
					AbstractWorldMapIcon var8;
					int var11;
					do {
						if (!var7.hasNext()) {
							return var5.coord2;
						}

						var8 = (AbstractWorldMapIcon)var7.next();
						int var9 = var8.coord2.x - var2.x;
						int var10 = var8.coord2.y - var2.y;
						var11 = var9 * var9 + var10 * var10;
						if (var11 == 0) {
							return var8.coord2;
						}
					} while(var11 >= var6 && var5 != null);

					var5 = var8;
					var6 = var11;
				}
			} else {
				return null;
			}
		}
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(IILny;Lny;I)V",
		garbageValue = "-594452760"
	)
	@Export("worldMapMenuAction")
	public void worldMapMenuAction(int var1, int var2, Coord var3, Coord var4) {
		ScriptEvent var5 = new ScriptEvent();
		WorldMapEvent var6 = new WorldMapEvent(var2, var3, var4);
		var5.setArgs(new Object[]{var6});
		switch(var1) {
		case 1008:
			var5.setType(10);
			break;
		case 1009:
			var5.setType(11);
			break;
		case 1010:
			var5.setType(12);
			break;
		case 1011:
			var5.setType(13);
			break;
		case 1012:
			var5.setType(14);
		}

		WorldMapEvent.runScriptEvent(var5);
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(B)Llh;",
		garbageValue = "-13"
	)
	@Export("iconStart")
	public AbstractWorldMapIcon iconStart() {
		if (!this.cacheLoader.isLoaded()) {
			return null;
		} else if (!this.worldMapRenderer.isLoaded()) {
			return null;
		} else {
			HashMap var1 = this.worldMapRenderer.buildIcons();
			this.field5298 = new LinkedList();
			Iterator var2 = var1.values().iterator();

			while (var2.hasNext()) {
				List var3 = (List)var2.next();
				this.field5298.addAll(var3);
			}

			this.iconIterator = this.field5298.iterator();
			return this.iconNext();
		}
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(I)Llh;",
		garbageValue = "1532524534"
	)
	@Export("iconNext")
	public AbstractWorldMapIcon iconNext() {
		if (this.iconIterator == null) {
			return null;
		} else {
			AbstractWorldMapIcon var1;
			do {
				if (!this.iconIterator.hasNext()) {
					return null;
				}

				var1 = (AbstractWorldMapIcon)this.iconIterator.next();
			} while(var1.getElement() == -1);

			return var1;
		}
	}
}
