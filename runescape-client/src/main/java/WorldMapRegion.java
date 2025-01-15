import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ki")
@Implements("WorldMapRegion")
public class WorldMapRegion {
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmf;"
	)
	@Export("WorldMapRegion_cachedSprites")
	public static DemotingHashTable WorldMapRegion_cachedSprites;
	@ObfuscatedName("ik")
	@ObfuscatedGetter(
		longValue = -443869461595618329L
	)
	static long field3124;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1050432489
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 653055413
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("worldMapData_0")
	WorldMapData_0 worldMapData_0;
	@ObfuscatedName("at")
	@Export("worldMapData1List")
	LinkedList worldMapData1List;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1155673661
	)
	@Export("backgroundColor")
	int backgroundColor;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -373546867
	)
	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("as")
	@Export("icon0List")
	List icon0List;
	@ObfuscatedName("aq")
	@Export("iconMap")
	HashMap iconMap;
	@ObfuscatedName("af")
	@Export("fonts")
	final HashMap fonts;

	static {
		WorldMapRegion_cachedSprites = new DemotingHashTable(37748736, 256);
	}

	WorldMapRegion(int var1, int var2, int var3, HashMap var4) {
		this.regionX = var1;
		this.regionY = var2;
		this.worldMapData1List = new LinkedList();
		this.icon0List = new LinkedList();
		this.iconMap = new HashMap();
		this.backgroundColor = var3 | -16777216;
		this.fonts = var4;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1466626269"
	)
	void method6106(int var1, int var2, int var3) {
		int var5 = this.regionX;
		int var6 = this.regionY;
		int var7 = this.pixelsPerTile;
		DemotingHashTable var8 = WorldMapRegion_cachedSprites;
		long var9 = (long)(var7 << 16 | var5 << 8 | var6);
		SpritePixels var4 = (SpritePixels)var8.get(var9);
		if (var4 != null) {
			if (var3 == this.pixelsPerTile * 64) {
				var4.drawAt(var1, var2);
			} else {
				var4.drawScaledWorldmap(var1, var2, var3, var3);
			}

		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lko;Ljava/util/List;B)V",
		garbageValue = "-60"
	)
	@Export("initWorldMapData0")
	void initWorldMapData0(WorldMapData_0 var1, List var2) {
		this.iconMap.clear();
		this.worldMapData_0 = var1;
		this.addAllToIconList(var2);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;Ljava/util/List;I)V",
		garbageValue = "-588244452"
	)
	@Export("initWorldMapData1")
	void initWorldMapData1(HashSet var1, List var2) {
		this.iconMap.clear();
		Iterator var3 = var1.iterator();

		while (var3.hasNext()) {
			WorldMapData_1 var4 = (WorldMapData_1)var3.next();
			if (var4.getRegionX() == this.regionX && var4.getRegionY() == this.regionY) {
				this.worldMapData1List.add(var4);
			}
		}

		this.addAllToIconList(var2);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIIILlu;I)V",
		garbageValue = "-44209391"
	)
	@Export("getIconsForTiles")
	void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		for (int var6 = var1; var6 < var3 + var1; ++var6) {
			label49:
			for (int var7 = var2; var7 < var2 + var4; ++var7) {
				for (int var8 = 0; var8 < var5.planes; ++var8) {
					WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7];
					if (var9 != null && var9.length != 0) {
						WorldMapDecoration[] var10 = var9;

						for (int var11 = 0; var11 < var10.length; ++var11) {
							WorldMapDecoration var12 = var10[var11];
							ObjectComposition var13 = class142.getObjectDefinition(var12.objectDefinitionId);
							if (class113.method3177(var13)) {
								this.getIcon(var13, var8, var6, var7, var5);
								continue label49;
							}
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lkl;IIILlu;I)V",
		garbageValue = "-1610742956"
	)
	@Export("getIcon")
	void getIcon(ObjectComposition var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		Coord var6 = new Coord(var2, var3 + this.regionX * 64, this.regionY * 64 + var4);
		Coord var7 = null;
		if (this.worldMapData_0 != null) {
			var7 = new Coord(this.worldMapData_0.minPlane + var2, var3 + this.worldMapData_0.regionXLow * 4096, var4 + this.worldMapData_0.regionYLow * 64);
		} else {
			WorldMapData_1 var8 = (WorldMapData_1)var5;
			var7 = new Coord(var2 + var8.minPlane, var8.regionXLow * 4096 + var3 + var8.getChunkXLow() * 8, var4 + var8.regionYLow * 64 + var8.getChunkYLow() * 8);
		}

		WorldMapElement var9;
		Object var10;
		if (var1.transforms != null) {
			var10 = new WorldMapIcon_1(var7, var6, var1.id, this);
		} else {
			var9 = class31.WorldMapElement_get(var1.mapIconId);
			var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9));
		}

		var9 = class31.WorldMapElement_get(((AbstractWorldMapIcon)var10).getElement());
		if (var9.field2533) {
			this.iconMap.put(new Coord(0, var3, var4), var10);
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "517557938"
	)
	@Export("initWorldMapIcon1s")
	void initWorldMapIcon1s() {
		Iterator var1 = this.iconMap.values().iterator();

		while (var1.hasNext()) {
			AbstractWorldMapIcon var2 = (AbstractWorldMapIcon)var1.next();
			if (var2 instanceof WorldMapIcon_1) {
				((WorldMapIcon_1)var2).init();
			}
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/List;I)V",
		garbageValue = "-1162210322"
	)
	@Export("addAllToIconList")
	void addAllToIconList(List var1) {
		Iterator var2 = var1.iterator();

		while (var2.hasNext()) {
			WorldMapIcon_0 var3 = (WorldMapIcon_0)var2.next();
			if (class31.WorldMapElement_get(var3.element).field2533 && var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) {
				WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method6172(var3.element));
				this.icon0List.add(var4);
			}
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-1918"
	)
	void method6113() {
		if (this.worldMapData_0 != null) {
			this.worldMapData_0.reset();
		} else {
			Iterator var1 = this.worldMapData1List.iterator();

			while (var1.hasNext()) {
				WorldMapData_1 var2 = (WorldMapData_1)var1.next();
				var2.reset();
			}
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lpq;B)Z",
		garbageValue = "-69"
	)
	@Export("loadGeography")
	boolean loadGeography(AbstractArchive var1) {
		this.iconMap.clear();
		if (this.worldMapData_0 != null) {
			this.worldMapData_0.loadGeography(var1);
			if (this.worldMapData_0.isFullyLoaded()) {
				this.getIconsForTiles(0, 0, 64, 64, this.worldMapData_0);
				return true;
			} else {
				return false;
			}
		} else {
			boolean var2 = true;

			Iterator var3;
			WorldMapData_1 var4;
			for (var3 = this.worldMapData1List.iterator(); var3.hasNext(); var2 &= var4.isFullyLoaded()) {
				var4 = (WorldMapData_1)var3.next();
				var4.loadGeography(var1);
			}

			if (var2) {
				var3 = this.worldMapData1List.iterator();

				while (var3.hasNext()) {
					var4 = (WorldMapData_1)var3.next();
					this.getIconsForTiles(var4.getChunkX() * 8, var4.getChunkY() * 8, 8, 8, var4);
				}
			}

			return var2;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILlr;[Lvi;Lpq;Lpq;D)V"
	)
	@Export("drawTile")
	void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5, double var6) {
		this.pixelsPerTile = var1;
		if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) {
			int var9 = this.regionX;
			int var10 = this.regionY;
			DemotingHashTable var11 = WorldMapRegion_cachedSprites;
			long var12 = (long)(var1 << 16 | var9 << 8 | var10);
			SpritePixels var8 = (SpritePixels)var11.get(var12);
			if (var8 == null) {
				if (Rasterizer3D.method4068() != var6) {
					Rasterizer3D.buildPalette(var6);
				}

				boolean var19 = true;
				var19 &= this.loadGeography(var4);
				int var13;
				if (this.worldMapData_0 != null) {
					var13 = this.worldMapData_0.groupId;
				} else {
					var13 = ((AbstractWorldMapData)this.worldMapData1List.getFirst()).groupId;
				}

				var19 &= var5.tryLoadGroup(var13);
				if (var19) {
					byte[] var20 = var5.takeFileFlat(var13);
					WorldMapSprite var14 = class344.method6934(var20);
					SpritePixels var15 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64);
					var15.setRaster();
					if (this.worldMapData_0 != null) {
						this.method6227(var2, var3, var14);
					} else {
						this.method6119(var2, var3, var14);
					}

					int var16 = this.regionX;
					int var17 = this.regionY;
					int var18 = this.pixelsPerTile;
					WorldMapRegion_cachedSprites.put(var15, ItemContainer.method2606(var16, var17, var18), var15.pixels.length * 4);
					this.method6113();
				}
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/util/HashSet;I)V",
		garbageValue = "2069696355"
	)
	void method6174(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) {
			var4 = new HashSet();
		}

		this.drawNonLinkMapIcons(var1, var2, var4, var3);
		this.drawMapLinks(var1, var2, var4, var3);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "-1584571433"
	)
	@Export("flashElements")
	void flashElements(HashSet var1, int var2, int var3) {
		Iterator var4 = this.iconMap.values().iterator();

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next();
			if (var5.hasValidElement()) {
				int var6 = var5.getElement();
				if (var1.contains(var6)) {
					WorldMapElement var7 = class31.WorldMapElement_get(var6);
					this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3);
				}
			}
		}

		this.method6165(var1, var2, var3);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Llr;[Lvi;Lld;I)V",
		garbageValue = "24705389"
	)
	void method6227(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		int var4;
		int var5;
		for (var4 = 0; var4 < 64; ++var4) {
			for (var5 = 0; var5 < 64; ++var5) {
				this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3);
				this.method6209(var4, var5, this.worldMapData_0, var1);
			}
		}

		for (var4 = 0; var4 < 64; ++var4) {
			for (var5 = 0; var5 < 64; ++var5) {
				this.method6120(var4, var5, this.worldMapData_0, var1, var2);
			}
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Llr;[Lvi;Lld;B)V",
		garbageValue = "73"
	)
	void method6119(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		Iterator var4 = this.worldMapData1List.iterator();

		WorldMapData_1 var5;
		int var6;
		int var7;
		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next();

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) {
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) {
					this.drawTileGround(var6, var7, var5, var1, var3);
					this.method6209(var6, var7, var5, var1);
				}
			}
		}

		var4 = this.worldMapData1List.iterator();

		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next();

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) {
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) {
					this.method6120(var6, var7, var5, var1, var2);
				}
			}
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IILlu;Llr;[Lvi;B)V",
		garbageValue = "-56"
	)
	void method6120(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
		this.method6175(var1, var2, var3);
		this.method6124(var1, var2, var3, var5);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IILlu;Llr;Lld;I)V",
		garbageValue = "2099380889"
	)
	@Export("drawTileGround")
	void drawTileGround(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, WorldMapSprite var5) {
		int var6 = var3.floorUnderlayIds[0][var1][var2] - 1;
		int var7 = var3.floorOverlayIds[0][var1][var2] - 1;
		if (var6 == -1 && var7 == -1) {
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, this.backgroundColor);
		}

		int var8 = 16711935;
		if (var7 != -1) {
			var8 = class31.method496(var7, this.backgroundColor);
		}

		if (var7 > -1 && var3.field3210[0][var1][var2] == 0) {
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8);
		} else {
			int var9 = this.method6123(var1, var2, var3, var5);
			if (var7 == -1) {
				Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9);
			} else {
				var4.method6497(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field3210[0][var1][var2], var3.field3205[0][var1][var2]);
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IILlu;Llr;B)V",
		garbageValue = "99"
	)
	void method6209(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
		for (int var5 = 1; var5 < var3.planes; ++var5) {
			int var6 = var3.floorOverlayIds[var5][var1][var2] - 1;
			if (var6 > -1) {
				int var7 = class31.method496(var6, this.backgroundColor);
				if (var3.field3210[var5][var1][var2] == 0) {
					Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7);
				} else {
					var4.method6497(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field3210[var5][var1][var2], var3.field3205[var5][var1][var2]);
				}
			}
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IILlu;Lld;I)I",
		garbageValue = "125412595"
	)
	int method6123(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
		return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IILlu;[Lvi;I)V",
		garbageValue = "1149870919"
	)
	void method6124(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
		for (int var5 = 0; var5 < var3.planes; ++var5) {
			WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2];
			if (var6 != null && var6.length != 0) {
				WorldMapDecoration[] var7 = var6;

				for (int var8 = 0; var8 < var7.length; ++var8) {
					WorldMapDecoration var9 = var7[var8];
					int var11 = var9.decoration;
					boolean var10 = var11 >= WorldMapDecorationType.field4086.id && var11 <= WorldMapDecorationType.field4082.id;
					if (var10 || PlayerCompositionColorTextureOverride.method5106(var9.decoration)) {
						ObjectComposition var12 = class142.getObjectDefinition(var9.objectDefinitionId);
						if (var12.mapSceneId != -1) {
							int var13 = var9.rotation != 1 && var9.rotation != 3 ? var12.sizeY : var12.sizeX;
							var4[var12.mapSceneId].method10712(this.pixelsPerTile * var1, this.pixelsPerTile * (64 - var13 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2);
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IILlu;I)V",
		garbageValue = "820260147"
	)
	void method6175(int var1, int var2, AbstractWorldMapData var3) {
		for (int var4 = 0; var4 < var3.planes; ++var4) {
			WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2];
			if (var5 != null && var5.length != 0) {
				WorldMapDecoration[] var6 = var5;

				for (int var7 = 0; var7 < var6.length; ++var7) {
					WorldMapDecoration var8 = var6[var7];
					if (HealthBarUpdate.method2833(var8.decoration)) {
						ObjectComposition var9 = class142.getObjectDefinition(var8.objectDefinitionId);
						int var10 = var9.int1 != 0 ? -3407872 : -3355444;
						if (var8.decoration == WorldMapDecorationType.field4074.id) {
							this.method6139(var1, var2, var8.rotation, var10);
						}

						if (var8.decoration == WorldMapDecorationType.field4070.id) {
							this.method6139(var1, var2, var8.rotation, -3355444);
							this.method6139(var1, var2, var8.rotation + 1, var10);
						}

						if (var8.decoration == WorldMapDecorationType.field4068.id) {
							if (var8.rotation == 0) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var10);
							}

							if (var8.rotation == 1) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2), 1, var10);
							}

							if (var8.rotation == 2) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}

							if (var8.rotation == 3) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}
						}

						if (var8.decoration == WorldMapDecorationType.field4066.id) {
							int var11 = var8.rotation % 2;
							int var12;
							if (var11 == 0) {
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) {
									Rasterizer2D.Rasterizer2D_drawHorizontalLine(var12 + this.pixelsPerTile * var1, (64 - var2) * this.pixelsPerTile - 1 - var12, 1, var10);
								}
							} else {
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) {
									Rasterizer2D.Rasterizer2D_drawHorizontalLine(var12 + this.pixelsPerTile * var1, var12 + this.pixelsPerTile * (63 - var2), 1, var10);
								}
							}
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;II)V",
		garbageValue = "837362733"
	)
	@Export("drawNonLinkMapIcons")
	void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F;
		float var6 = var5 / 2.0F;
		Iterator var7 = this.iconMap.entrySet().iterator();

		while (var7.hasNext()) {
			Entry var8 = (Entry)var7.next();
			Coord var9 = (Coord)var8.getKey();
			int var10 = (int)((float)var1 + (float)var9.x * var5 - var6);
			int var11 = (int)((float)(var2 + var4) - var5 * (float)var9.y - var6);
			AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.getValue();
			if (var12 != null && var12.hasValidElement()) {
				var12.screenX = var10;
				var12.screenY = var11;
				WorldMapElement var13 = class31.WorldMapElement_get(var12.getElement());
				if (!var3.contains(var13.getObjectId())) {
					this.method6129(var12, var10, var11, var5);
				}
			}
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "-98224507"
	)
	void method6165(HashSet var1, int var2, int var3) {
		Iterator var4 = this.icon0List.iterator();

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next();
			if (var5.hasValidElement()) {
				WorldMapElement var6 = class31.WorldMapElement_get(var5.getElement());
				if (var6 != null && var1.contains(var6.getObjectId())) {
					this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3);
				}
			}
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljm;IIIIB)V",
		garbageValue = "81"
	)
	@Export("drawBackgroundCircle")
	void drawBackgroundCircle(WorldMapElement var1, int var2, int var3, int var4, int var5) {
		SpritePixels var6 = var1.getSpriteBool(false);
		if (var6 != null) {
			var6.drawTransBgAt(var2 - var6.subWidth / 2, var3 - var6.subHeight / 2);
			if (var4 % var5 < var5 / 2) {
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 15, 16776960, 128);
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 7, 16777215, 256);
			}

		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lly;IIFI)V",
		garbageValue = "-1797725706"
	)
	void method6129(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
		WorldMapElement var5 = class31.WorldMapElement_get(var1.getElement());
		this.method6116(var5, var2, var3);
		this.method6131(var1, var5, var2, var3, var4);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljm;III)V",
		garbageValue = "-1315466009"
	)
	void method6116(WorldMapElement var1, int var2, int var3) {
		SpritePixels var4 = var1.getSpriteBool(false);
		if (var4 != null) {
			int var5 = this.method6133(var4, var1.horizontalAlignment);
			int var6 = this.method6134(var4, var1.verticalAlignment);
			var4.drawTransBgAt(var5 + var2, var3 + var6);
		}

	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lly;Ljm;IIFB)V",
		garbageValue = "0"
	)
	void method6131(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
		WorldMapLabel var6 = var1.getLabel();
		if (var6 != null) {
			if (var6.size.method5991(var5)) {
				Font var7 = (Font)this.fonts.get(var6.size);
				var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field2540, 0, 1, 0, var7.ascent / 2);
			}
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;IB)V",
		garbageValue = "97"
	)
	@Export("drawMapLinks")
	void drawMapLinks(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F;
		Iterator var6 = this.icon0List.iterator();

		while (var6.hasNext()) {
			AbstractWorldMapIcon var7 = (AbstractWorldMapIcon)var6.next();
			if (var7.hasValidElement()) {
				int var8 = var7.coord2.x % 64;
				int var9 = var7.coord2.y % 64;
				var7.screenX = (int)((float)var1 + var5 * (float)var8);
				var7.screenY = (int)((float)var2 + (float)(63 - var9) * var5);
				if (!var3.contains(var7.getElement())) {
					this.method6129(var7, var7.screenX, var7.screenY, var5);
				}
			}
		}

	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Lvf;Ljt;I)I",
		garbageValue = "949804228"
	)
	int method6133(SpritePixels var1, HorizontalAlignment var2) {
		switch(var2.value) {
		case 0:
			return -var1.subWidth / 2;
		case 2:
			return 0;
		default:
			return -var1.subWidth;
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Lvf;Ljk;I)I",
		garbageValue = "-497738492"
	)
	int method6134(SpritePixels var1, VerticalAlignment var2) {
		switch(var2.value) {
		case 1:
			return -var1.subHeight / 2;
		case 2:
			return 0;
		default:
			return -var1.subHeight;
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(II)Lli;",
		garbageValue = "-633165647"
	)
	WorldMapLabel method6172(int var1) {
		WorldMapElement var2 = class31.WorldMapElement_get(var1);
		return this.createMapLabel(var2);
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Ljm;B)Lli;",
		garbageValue = "87"
	)
	@Export("createMapLabel")
	WorldMapLabel createMapLabel(WorldMapElement var1) {
		if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) {
			WorldMapLabelSize var2 = WorldMapLabelSize.method5992(var1.textSize);
			if (var2 == null) {
				return null;
			} else {
				Font var3 = (Font)this.fonts.get(var2);
				if (var3 == null) {
					return null;
				} else {
					int var4 = var3.lineCount(var1.name, 1000000);
					String[] var5 = new String[var4];
					var3.breakLines(var1.name, (int[])null, var5);
					int var6 = var5.length * var3.ascent / 2;
					int var7 = 0;
					String[] var8 = var5;

					for (int var9 = 0; var9 < var8.length; ++var9) {
						String var10 = var8[var9];
						int var11 = var3.stringWidth(var10);
						if (var11 > var7) {
							var7 = var11;
						}
					}

					return new WorldMapLabel(var1.name, var7, var6, var2);
				}
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)Ljava/util/List;",
		garbageValue = "1263967352"
	)
	List method6216(int var1, int var2, int var3, int var4, int var5) {
		LinkedList var6 = new LinkedList();
		if (var4 >= var1 && var5 >= var2) {
			if (var4 < var3 + var1 && var5 < var3 + var2) {
				Iterator var7 = this.iconMap.values().iterator();

				AbstractWorldMapIcon var8;
				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next();
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) {
						var6.add(var8);
					}
				}

				var7 = this.icon0List.iterator();

				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next();
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) {
						var6.add(var8);
					}
				}

				return var6;
			} else {
				return var6;
			}
		} else {
			return var6;
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/List;",
		garbageValue = "1286016129"
	)
	@Export("icons")
	List icons() {
		LinkedList var1 = new LinkedList();
		var1.addAll(this.icon0List);
		var1.addAll(this.iconMap.values());
		return var1;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "0"
	)
	void method6139(int var1, int var2, int var3, int var4) {
		var3 %= 4;
		if (var3 == 0) {
			Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 1) {
			Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 2) {
			Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 3) {
			Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, this.pixelsPerTile, var4);
		}

	}
}
