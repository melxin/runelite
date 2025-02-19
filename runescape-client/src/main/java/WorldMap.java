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

@ObfuscatedName("uu")
@Implements("WorldMap")
public class WorldMap {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	@Export("fontNameVerdana11")
	static final FontName fontNameVerdana11;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	@Export("fontNameVerdana13")
	static final FontName fontNameVerdana13;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	@Export("fontNameVerdana15")
	static final FontName fontNameVerdana15;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	@Export("WorldMap_archive")
	AbstractArchive WorldMap_archive;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	@Export("WorldMap_geographyArchive")
	AbstractArchive WorldMap_geographyArchive;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	@Export("WorldMap_groundArchive")
	AbstractArchive WorldMap_groundArchive;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lrf;"
	)
	@Export("font")
	Font font;
	@ObfuscatedName("ak")
	@Export("fonts")
	HashMap fonts;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Lws;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("av")
	@Export("details")
	HashMap details;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	@Export("mainMapArea")
	WorldMapArea mainMapArea;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	@Export("currentMapArea")
	WorldMapArea currentMapArea;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	WorldMapArea field5429;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("worldMapRenderer")
	WorldMapRenderer worldMapRenderer;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Luz;"
	)
	@Export("cacheLoader")
	WorldMapArchiveLoader cacheLoader;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 643433743
	)
	@Export("centerTileX")
	int centerTileX;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1567056835
	)
	@Export("centerTileY")
	int centerTileY;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -695999289
	)
	@Export("worldMapTargetX")
	int worldMapTargetX;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1784397555
	)
	@Export("worldMapTargetY")
	int worldMapTargetY;
	@ObfuscatedName("al")
	@Export("zoom")
	float zoom;
	@ObfuscatedName("bw")
	@Export("zoomTarget")
	float zoomTarget;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -297732511
	)
	@Export("worldMapDisplayWidth")
	int worldMapDisplayWidth;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -548080827
	)
	@Export("worldMapDisplayHeight")
	int worldMapDisplayHeight;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 2098715763
	)
	@Export("worldMapDisplayX")
	int worldMapDisplayX;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -402209047
	)
	@Export("worldMapDisplayY")
	int worldMapDisplayY;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1423082177
	)
	@Export("maxFlashCount")
	int maxFlashCount;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 490830013
	)
	@Export("cyclesPerFlash")
	int cyclesPerFlash;
	@ObfuscatedName("bv")
	@Export("perpetualFlash")
	boolean perpetualFlash;
	@ObfuscatedName("bk")
	@Export("flashingElements")
	HashSet flashingElements;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -437019409
	)
	@Export("flashCount")
	int flashCount;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -708974325
	)
	@Export("flashCycle")
	int flashCycle;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1296103467
	)
	int field5406;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -1363637543
	)
	int field5409;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -661628431
	)
	int field5405;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1048752575
	)
	int field5412;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		longValue = -1081207265886667835L
	)
	long field5410;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1592418277
	)
	int field5411;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -529941629
	)
	int field5371;
	@ObfuscatedName("bb")
	boolean field5407;
	@ObfuscatedName("bl")
	@Export("enabledElements")
	HashSet enabledElements;
	@ObfuscatedName("bd")
	@Export("enabledCategories")
	HashSet enabledCategories;
	@ObfuscatedName("br")
	@Export("enabledElementIds")
	HashSet enabledElementIds;
	@ObfuscatedName("bm")
	HashSet field5418;
	@ObfuscatedName("bp")
	@Export("elementsDisabled")
	boolean elementsDisabled;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 1016884417
	)
	int field5375;
	@ObfuscatedName("cp")
	@Export("menuOpcodes")
	final int[] menuOpcodes;
	@ObfuscatedName("ca")
	List field5415;
	@ObfuscatedName("cs")
	@Export("iconIterator")
	Iterator iconIterator;
	@ObfuscatedName("cj")
	HashSet field5424;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("mouseCoord")
	Coord mouseCoord;
	@ObfuscatedName("cb")
	@Export("showCoord")
	public boolean showCoord;
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "Lwg;"
	)
	@Export("sprite")
	SpritePixels sprite;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -832743293
	)
	@Export("cachedPixelsPerTile")
	int cachedPixelsPerTile;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -1439096085
	)
	@Export("minCachedTileX")
	int minCachedTileX;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -1820472647
	)
	@Export("minCachedTileY")
	int minCachedTileY;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -256484367
	)
	int field5431;

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
		this.field5406 = -1;
		this.field5409 = -1;
		this.field5405 = -1;
		this.field5412 = -1;
		this.field5407 = true;
		this.enabledElements = new HashSet();
		this.enabledCategories = new HashSet();
		this.enabledElementIds = new HashSet();
		this.field5418 = new HashSet();
		this.elementsDisabled = false;
		this.field5375 = 0;
		this.menuOpcodes = new int[]{1008, 1009, 1010, 1011, 1012};
		this.field5424 = new HashSet();
		this.mouseCoord = null;
		this.showCoord = false;
		this.minCachedTileX = -1;
		this.minCachedTileY = -1;
		this.field5431 = -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpl;Lpl;Lpl;Lrf;Ljava/util/HashMap;[Lws;B)V",
		garbageValue = "60"
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
		int var7 = this.WorldMap_archive.getGroupId(WorldMapCacheName.field3340.name);
		int[] var8 = this.WorldMap_archive.getGroupFileIds(var7);
		int var9 = var8 == null ? 0 : var8.length;
		this.details = new HashMap(var9);

		for (int var10 = 0; var10 < var9; ++var10) {
			Buffer var11 = new Buffer(this.WorldMap_archive.takeFile(var7, var8[var10]));
			WorldMapArea var12 = new WorldMapArea();
			var12.method5909(var11, var8[var10]);
			this.details.put(var12.getInternalName(), var12);
			if (var12.getIsMain()) {
				this.mainMapArea = var12;
			}
		}

		this.setCurrentMapArea(this.mainMapArea);
		this.field5429 = null;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "31352650"
	)
	public void method9832() {
		FloorDecoration.method4730();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIZIIIII)V",
		garbageValue = "-2050951371"
	)
	@Export("onCycle")
	public void onCycle(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
		if (this.cacheLoader.isLoaded()) {
			this.smoothZoom();
			this.scrollToTarget();
			if (var3) {
				int var8 = (int)Math.ceil((double)((float)var6 / this.zoom));
				int var9 = (int)Math.ceil((double)((float)var7 / this.zoom));
				List var10 = this.worldMapRenderer.method6145(this.centerTileX - var8 / 2 - 1, this.centerTileY - var9 / 2 - 1, var8 / 2 + this.centerTileX + 1, var9 / 2 + this.centerTileY + 1, var4, var5, var6, var7, var1, var2);
				HashSet var11 = new HashSet();

				Iterator var12;
				AbstractWorldMapIcon var13;
				ScriptEvent var14;
				WorldMapEvent var15;
				for (var12 = var10.iterator(); var12.hasNext(); MilliClock.runScriptEvent(var14)) {
					var13 = (AbstractWorldMapIcon)var12.next();
					var11.add(var13);
					var14 = new ScriptEvent();
					var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2);
					var14.setArgs(new Object[]{var15, var1, var2});
					if (this.field5424.contains(var13)) {
						var14.setType(17);
					} else {
						var14.setType(15);
					}
				}

				var12 = this.field5424.iterator();

				while (var12.hasNext()) {
					var13 = (AbstractWorldMapIcon)var12.next();
					if (!var11.contains(var13)) {
						var14 = new ScriptEvent();
						var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2);
						var14.setArgs(new Object[]{var15, var1, var2});
						var14.setType(16);
						MilliClock.runScriptEvent(var14);
					}
				}

				this.field5424 = var11;
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIZZI)V",
		garbageValue = "379746876"
	)
	public void method9839(int var1, int var2, boolean var3, boolean var4) {
		long var5;
		label41: {
			var5 = InterfaceParent.method2434();
			this.method9720(var1, var2, var4, var5);
			if (!this.hasTarget() && (var4 || var3)) {
				boolean var7 = Client.clickedWidget != null;
				if (!var7) {
					if (var4) {
						this.field5405 = var1;
						this.field5412 = var2;
						this.field5406 = this.centerTileX;
						this.field5409 = this.centerTileY;
					}

					if (this.field5406 != -1) {
						int var8 = var1 - this.field5405;
						int var9 = var2 - this.field5412;
						this.setWorldMapPosition(this.field5406 - (int)((float)var8 / this.zoomTarget), (int)((float)var9 / this.zoomTarget) + this.field5409, false);
					}
					break label41;
				}
			}

			this.method9724();
		}

		if (var4) {
			this.field5410 = var5;
			this.field5411 = var1;
			this.field5371 = var2;
		}

	}

	@ObfuscatedName("ah")
	void method9720(int var1, int var2, boolean var3, long var4) {
		if (this.currentMapArea != null) {
			int var6 = (int)((float)this.centerTileX + ((float)(var1 - this.worldMapDisplayX) - (float)this.getDisplayWith() * this.zoom / 2.0F) / this.zoom);
			int var7 = (int)((float)this.centerTileY - ((float)(var2 - this.worldMapDisplayY) - (float)this.getDisplayHeight() * this.zoom / 2.0F) / this.zoom);
			this.mouseCoord = this.currentMapArea.coord(var6 + this.currentMapArea.getRegionLowX() * 64, var7 + this.currentMapArea.getRegionLowY() * 64);
			if (this.mouseCoord != null && var3) {
				IndexCheck var8 = PlayerUpdateManager.method2991();
				if (MouseHandler.method650() && var8.isValidIndexInRange(82) && var8.isValidIndexInRange(81)) {
					SecureUrlRequester.method3159(this.mouseCoord.x, this.mouseCoord.y, this.mouseCoord.plane, false);
				} else {
					boolean var9 = true;
					if (this.field5407) {
						int var10 = var1 - this.field5411;
						int var11 = var2 - this.field5371;
						if (var4 - this.field5410 > 500L || var10 < -25 || var10 > 25 || var11 < -25 || var11 > 25) {
							var9 = false;
						}
					}

					if (var9) {
						PacketBufferNode var12 = class272.getPacketBufferNode(ClientPacket.CLICK_WORLD_MAP, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeIntME(this.mouseCoord.packed());
						Client.packetWriter.addNode(var12);
						this.field5410 = 0L;
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
		garbageValue = "1711798050"
	)
	@Export("smoothZoom")
	void smoothZoom() {
		if (Client.field810 != null) {
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "723707593"
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
			if (this.centerTileX == this.worldMapTargetX && this.worldMapTargetY == this.centerTileY) {
				this.worldMapTargetX = -1;
				this.worldMapTargetY = -1;
			}

		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "2"
	)
	@Export("setWorldMapPosition")
	final void setWorldMapPosition(int var1, int var2, boolean var3) {
		this.centerTileX = var1;
		this.centerTileY = var2;
		InterfaceParent.method2434();
		if (var3) {
			this.method9724();
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2026895610"
	)
	final void method9724() {
		this.field5412 = -1;
		this.field5405 = -1;
		this.field5409 = -1;
		this.field5406 = -1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-210237007"
	)
	@Export("hasTarget")
	boolean hasTarget() {
		return this.worldMapTargetX != -1 && this.worldMapTargetY != -1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Lly;",
		garbageValue = "0"
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "1175265225"
	)
	public void method9727(int var1, int var2, int var3, boolean var4) {
		WorldMapArea var5 = this.mapAreaAtCoord(var1, var2, var3);
		if (var5 == null) {
			if (!var4) {
				return;
			}

			var5 = this.mainMapArea;
		}

		boolean var6 = false;
		if (var5 != this.field5429 || var4) {
			this.field5429 = var5;
			this.setCurrentMapArea(var5);
			var6 = true;
		}

		if (var6 || var4) {
			this.jump(var1, var2, var3);
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "110"
	)
	@Export("setCurrentMapAreaId")
	public void setCurrentMapAreaId(int var1) {
		WorldMapArea var2 = this.getMapArea(var1);
		if (var2 != null) {
			this.setCurrentMapArea(var2);
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "629522633"
	)
	@Export("currentMapAreaId")
	public int currentMapAreaId() {
		return this.currentMapArea == null ? -1 : this.currentMapArea.getId();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Lly;",
		garbageValue = "1943004994"
	)
	@Export("getCurrentMapArea")
	public WorldMapArea getCurrentMapArea() {
		return this.currentMapArea;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lly;B)V",
		garbageValue = "1"
	)
	@Export("setCurrentMapArea")
	void setCurrentMapArea(WorldMapArea var1) {
		if (this.currentMapArea == null || var1 != this.currentMapArea) {
			this.initializeWorldMap(var1);
			this.jump(-1, -1, -1);
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lly;B)V",
		garbageValue = "-14"
	)
	@Export("initializeWorldMap")
	void initializeWorldMap(WorldMapArea var1) {
		this.currentMapArea = var1;
		this.worldMapRenderer = new WorldMapRenderer(this.mapSceneSprites, this.fonts, this.WorldMap_geographyArchive, this.WorldMap_groundArchive);
		this.cacheLoader.reset(this.currentMapArea == null ? null : this.currentMapArea.getInternalName());
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lly;Lnq;Lnq;ZI)V",
		garbageValue = "862228661"
	)
	public void method9733(WorldMapArea var1, Coord var2, Coord var3, boolean var4) {
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIIS)V",
		garbageValue = "18970"
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
			this.field5415 = null;
			this.iconIterator = null;
			this.worldMapRenderer.clearIcons();
		}
	}

	@ObfuscatedName("am")
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
				this.worldMapRenderer.method6103(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld);
				if (!this.worldMapRenderer.isLoaded()) {
					return;
				}
			}

			int var10 = IndexCheck.method5626(this.worldMapRenderer.method6111(), var6);
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

			int var11 = (int)Math.ceil((double)((float)var3 / this.zoom));
			int var12 = (int)Math.ceil((double)((float)var4 / this.zoom));
			double var13 = Rasterizer3D.method4748();
			this.worldMapRenderer.drawTiles(this.centerTileX - var11 / 2, this.centerTileY - var12 / 2, var11 / 2 + this.centerTileX, var12 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4);
			boolean var15;
			if (!this.elementsDisabled) {
				var15 = false;
				if (var5 - this.field5375 > 100) {
					this.field5375 = var5;
					var15 = true;
				}

				this.worldMapRenderer.drawElements(this.centerTileX - var11 / 2, this.centerTileY - var12 / 2, var11 / 2 + this.centerTileX, var12 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4, this.field5418, this.flashingElements, this.flashCycle, this.cyclesPerFlash, var15);
			}

			this.method9752(var1, var2, var3, var4, var11, var12);
			var15 = Client.staffModLevel >= 2;
			if (var15 && this.showCoord && this.mouseCoord != null) {
				this.font.draw("Coord: " + this.mouseCoord, Rasterizer2D.Rasterizer2D_xClipStart + 10, Rasterizer2D.Rasterizer2D_yClipStart + 20, 16776960, -1);
			}

			this.worldMapDisplayWidth = var11;
			this.worldMapDisplayHeight = var12;
			this.worldMapDisplayX = var1;
			this.worldMapDisplayY = var2;
			Rasterizer2D.Rasterizer2D_setClipArray(var8);
			if (var13 != Rasterizer3D.method4748()) {
				Rasterizer3D.buildPalette(var13);
			}

		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1607580622"
	)
	public void method9736() {
		WorldMapRegion.WorldMapRegion_cachedSprites.clear();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)Z",
		garbageValue = "1155787320"
	)
	boolean method9737(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.sprite == null) {
			return true;
		} else if (this.sprite.subWidth == var1 && this.sprite.subHeight == var2) {
			if (this.worldMapRenderer.pixelsPerTile != this.cachedPixelsPerTile) {
				return true;
			} else if (this.field5431 != Client.field811) {
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "2086855835"
	)
	void method9752(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field810 != null) {
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
			if (this.method9737(var8, var9, var13, var14, var3, var4)) {
				if (this.sprite != null && this.sprite.subWidth == var8 && this.sprite.subHeight == var9) {
					Arrays.fill(this.sprite.pixels, 0);
				} else {
					this.sprite = new SpritePixels(var8, var9);
				}

				this.minCachedTileX = this.getDisplayX() - var5 / 2 - var7;
				this.minCachedTileY = this.getDisplayY() - var6 / 2 - var7;
				this.cachedPixelsPerTile = this.worldMapRenderer.pixelsPerTile;
				Client.field810.method7861(this.minCachedTileX, this.minCachedTileY, this.sprite, (float)this.cachedPixelsPerTile / var10);
				this.field5431 = Client.field811;
				var13 = var1 - (var7 + var11 - this.minCachedTileX) * this.worldMapRenderer.pixelsPerTile;
				var14 = var2 - this.worldMapRenderer.pixelsPerTile * (var7 - (var12 - this.minCachedTileY));
			}

			Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var1, var2, var3, var4, 0, 128);
			if (var10 == 1.0F) {
				this.sprite.method10767(var13, var14, 192);
			} else {
				this.sprite.method10740(var13, var14, (int)((float)var8 * var10), (int)((float)var9 * var10), 192);
			}
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-455421331"
	)
	@Export("drawOverview")
	public void drawOverview(int var1, int var2, int var3, int var4) {
		if (this.cacheLoader.isLoaded()) {
			if (!this.worldMapRenderer.isLoaded()) {
				this.worldMapRenderer.method6103(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld);
				if (!this.worldMapRenderer.isLoaded()) {
					return;
				}
			}

			this.worldMapRenderer.drawOverview(var1, var2, var3, var4, this.flashingElements, this.flashCycle, this.cyclesPerFlash);
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1117160908"
	)
	@Export("setZoomPercentage")
	public void setZoomPercentage(int var1) {
		this.zoomTarget = this.getZoomFromPercentage(var1);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "1689467667"
	)
	@Export("drawLoading")
	void drawLoading(int var1, int var2, int var3, int var4, int var5) {
		byte var6 = 20;
		int var7 = var3 / 2 + var1;
		int var8 = var4 / 2 + var2 - 18 - var6;
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216);
		Rasterizer2D.Rasterizer2D_drawRectangle(var7 - 152, var8, 304, 34, -65536);
		Rasterizer2D.Rasterizer2D_fillRectangle(var7 - 150, var8 + 2, var5 * 3, 30, -65536);
		this.font.drawCentered("Loading...", var7, var8 + var6, -1, -1);
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "-868297753"
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

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-286321462"
	)
	@Export("getZoomLevel")
	public int getZoomLevel() {
		if ((double)this.zoomTarget == 1.0D) {
			return 25;
		} else if (1.5D == (double)this.zoomTarget) {
			return 37;
		} else if ((double)this.zoomTarget == 2.0D) {
			return 50;
		} else if ((double)this.zoomTarget == 3.0D) {
			return 75;
		} else {
			return 4.0D == (double)this.zoomTarget ? 100 : 200;
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-519019233"
	)
	@Export("loadCache")
	public void loadCache() {
		this.cacheLoader.load();
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-41"
	)
	@Export("isCacheLoaded")
	public boolean isCacheLoaded() {
		return this.cacheLoader.isLoaded();
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(IB)Lly;",
		garbageValue = "15"
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

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1404662367"
	)
	@Export("setWorldMapPositionTarget")
	public void setWorldMapPositionTarget(int var1, int var2) {
		if (this.currentMapArea != null && this.currentMapArea.containsPosition(var1, var2)) {
			this.worldMapTargetX = var1 - this.currentMapArea.getRegionLowX() * 64;
			this.worldMapTargetY = var2 - this.currentMapArea.getRegionLowY() * 64;
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1961978317"
	)
	@Export("setWorldMapPositionTargetInstant")
	public void setWorldMapPositionTargetInstant(int var1, int var2) {
		if (this.currentMapArea != null) {
			this.setWorldMapPosition(var1 - this.currentMapArea.getRegionLowX() * 64, var2 - this.currentMapArea.getRegionLowY() * 64, true);
			this.worldMapTargetX = -1;
			this.worldMapTargetY = -1;
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-859618383"
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

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-52"
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
		descriptor = "(B)I",
		garbageValue = "-20"
	)
	@Export("getDisplayX")
	public int getDisplayX() {
		return this.currentMapArea == null ? -1 : this.centerTileX + this.currentMapArea.getRegionLowX() * 64;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "84"
	)
	@Export("getDisplayY")
	public int getDisplayY() {
		return this.currentMapArea == null ? -1 : this.centerTileY + this.currentMapArea.getRegionLowY() * 64;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(S)Lnq;",
		garbageValue = "132"
	)
	@Export("getDisplayCoord")
	public Coord getDisplayCoord() {
		return this.currentMapArea == null ? null : this.currentMapArea.coord(this.getDisplayX(), this.getDisplayY());
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "93"
	)
	@Export("getDisplayWith")
	public int getDisplayWith() {
		return this.worldMapDisplayWidth;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1567554524"
	)
	@Export("getDisplayHeight")
	public int getDisplayHeight() {
		return this.worldMapDisplayHeight;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "880250496"
	)
	@Export("setMaxFlashCount")
	public void setMaxFlashCount(int var1) {
		if (var1 >= 1) {
			this.maxFlashCount = var1;
		}

	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-10"
	)
	@Export("resetMaxFlashCount")
	public void resetMaxFlashCount() {
		this.maxFlashCount = 3;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-993406959"
	)
	@Export("setCyclesPerFlash")
	public void setCyclesPerFlash(int var1) {
		if (var1 >= 1) {
			this.cyclesPerFlash = var1;
		}

	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-32"
	)
	@Export("resetCyclesPerFlash")
	public void resetCyclesPerFlash() {
		this.cyclesPerFlash = 50;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1791843488"
	)
	@Export("setPerpetualFlash")
	public void setPerpetualFlash(boolean var1) {
		this.perpetualFlash = var1;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "559477556"
	)
	@Export("flashElement")
	public void flashElement(int var1) {
		this.flashingElements = new HashSet();
		this.flashingElements.add(var1);
		this.flashCount = 0;
		this.flashCycle = 0;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "55"
	)
	@Export("flashCategory")
	public void flashCategory(int var1) {
		this.flashingElements = new HashSet();
		this.flashCount = 0;
		this.flashCycle = 0;

		for (int var2 = 0; var2 < WorldMapElement.WorldMapElement_count; ++var2) {
			if (Canvas.WorldMapElement_get(var2) != null && Canvas.WorldMapElement_get(var2).category == var1) {
				this.flashingElements.add(Canvas.WorldMapElement_get(var2).objectId);
			}
		}

	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-608133418"
	)
	@Export("stopCurrentFlashes")
	public void stopCurrentFlashes() {
		this.flashingElements = null;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1140546430"
	)
	@Export("setElementsDisabled")
	public void setElementsDisabled(boolean var1) {
		this.elementsDisabled = !var1;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "1494990547"
	)
	@Export("disableElement")
	public void disableElement(int var1, boolean var2) {
		if (!var2) {
			this.enabledElements.add(var1);
		} else {
			this.enabledElements.remove(var1);
		}

		this.method9770();
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "-65"
	)
	@Export("setCategoryDisabled")
	public void setCategoryDisabled(int var1, boolean var2) {
		if (!var2) {
			this.enabledCategories.add(var1);
		} else {
			this.enabledCategories.remove(var1);
		}

		for (int var3 = 0; var3 < WorldMapElement.WorldMapElement_count; ++var3) {
			if (Canvas.WorldMapElement_get(var3) != null && Canvas.WorldMapElement_get(var3).category == var1) {
				int var4 = Canvas.WorldMapElement_get(var3).objectId;
				if (!var2) {
					this.enabledElementIds.add(var4);
				} else {
					this.enabledElementIds.remove(var4);
				}
			}
		}

		this.method9770();
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-719340383"
	)
	@Export("getElementsDisabled")
	public boolean getElementsDisabled() {
		return !this.elementsDisabled;
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1625027747"
	)
	@Export("isElementDisabled")
	public boolean isElementDisabled(int var1) {
		return !this.enabledElements.contains(var1);
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1913854404"
	)
	@Export("isCategoryDisabled")
	public boolean isCategoryDisabled(int var1) {
		return !this.enabledCategories.contains(var1);
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-435761894"
	)
	void method9770() {
		this.field5418.clear();
		this.field5418.addAll(this.enabledElements);
		this.field5418.addAll(this.enabledElementIds);
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-1005300876"
	)
	@Export("addElementMenuOptions")
	public void addElementMenuOptions(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.cacheLoader.isLoaded()) {
			int var7 = (int)Math.ceil((double)((float)var3 / this.zoom));
			int var8 = (int)Math.ceil((double)((float)var4 / this.zoom));
			List var9 = this.worldMapRenderer.method6145(this.centerTileX - var7 / 2 - 1, this.centerTileY - var8 / 2 - 1, var7 / 2 + this.centerTileX + 1, var8 / 2 + this.centerTileY + 1, var1, var2, var3, var4, var5, var6);
			if (!var9.isEmpty()) {
				Iterator var10 = var9.iterator();

				boolean var13;
				do {
					if (!var10.hasNext()) {
						return;
					}

					AbstractWorldMapIcon var11 = (AbstractWorldMapIcon)var10.next();
					WorldMapElement var12 = Canvas.WorldMapElement_get(var11.getElement());
					var13 = false;

					for (int var14 = this.menuOpcodes.length - 1; var14 >= 0; --var14) {
						if (var12.menuActions[var14] != null) {
							ObjectSound.insertMenuItemNoShift(var12.menuActions[var14], var12.menuTargetName, this.menuOpcodes[var14], var11.getElement(), var11.coord1.packed(), var11.coord2.packed());
							var13 = true;
						}
					}
				} while(!var13);

			}
		}
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(ILnq;B)Lnq;",
		garbageValue = "75"
	)
	public Coord method9772(int var1, Coord var2) {
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

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(IILnq;Lnq;B)V",
		garbageValue = "-3"
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

		MilliClock.runScriptEvent(var5);
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(B)Llo;",
		garbageValue = "94"
	)
	@Export("iconStart")
	public AbstractWorldMapIcon iconStart() {
		if (!this.cacheLoader.isLoaded()) {
			return null;
		} else if (!this.worldMapRenderer.isLoaded()) {
			return null;
		} else {
			HashMap var1 = this.worldMapRenderer.buildIcons();
			this.field5415 = new LinkedList();
			Iterator var2 = var1.values().iterator();

			while (var2.hasNext()) {
				List var3 = (List)var2.next();
				this.field5415.addAll(var3);
			}

			this.iconIterator = this.field5415.iterator();
			return this.iconNext();
		}
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(I)Llo;",
		garbageValue = "430964196"
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
