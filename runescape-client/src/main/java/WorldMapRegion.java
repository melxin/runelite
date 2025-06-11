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

@ObfuscatedName("le")
@Implements("WorldMapRegion")
public class WorldMapRegion {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("WorldMapRegion_cachedSprites")
	static DemotingHashTable WorldMapRegion_cachedSprites;
	@ObfuscatedName("bz")
	static String field3196;
	@ObfuscatedName("ac")
	@Export("fonts")
	final HashMap fonts;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -2111786059
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 59658863
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	@Export("worldMapData_0")
	WorldMapData_0 worldMapData_0;
	@ObfuscatedName("ag")
	@Export("worldMapData1List")
	LinkedList worldMapData1List;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -532326871
	)
	@Export("backgroundColor")
	int backgroundColor;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 914011767
	)
	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("ad")
	@Export("icon0List")
	List icon0List;
	@ObfuscatedName("af")
	@Export("iconMap")
	HashMap iconMap;

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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1597190833"
	)
	void method6357(int var1, int var2, int var3) {
		SpritePixels var4 = class539.method10242(this.regionX, this.regionY, this.pixelsPerTile);
		if (var4 != null) {
			if (var3 == this.pixelsPerTile * 64) {
				var4.drawAt(var1, var2);
			} else {
				var4.drawScaledWorldmap(var1, var2, var3, var3);
			}

		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lkl;Ljava/util/List;B)V",
		garbageValue = "72"
	)
	@Export("initWorldMapData0")
	void initWorldMapData0(WorldMapData_0 var1, List var2) {
		this.iconMap.clear();
		this.worldMapData_0 = var1;
		this.addAllToIconList(var2);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;Ljava/util/List;I)V",
		garbageValue = "-482254632"
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIIILlq;I)V",
		garbageValue = "1982881902"
	)
	@Export("getIconsForTiles")
	void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		for (int var6 = var1; var6 < var3 + var1; ++var6) {
			label76:
			for (int var7 = var2; var7 < var2 + var4; ++var7) {
				for (int var8 = 0; var8 < var5.planes; ++var8) {
					WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7];
					if (var9 != null && var9.length != 0) {
						WorldMapDecoration[] var10 = var9;

						for (int var11 = 0; var11 < var10.length; ++var11) {
							ObjectComposition var13;
							boolean var14;
							label67: {
								WorldMapDecoration var12 = var10[var11];
								var13 = HealthBarConfig.getObjectDefinition(var12.objectDefinitionId);
								if (var13.transforms != null) {
									int[] var15 = var13.transforms;

									for (int var16 = 0; var16 < var15.length; ++var16) {
										int var17 = var15[var16];
										ObjectComposition var18 = HealthBarConfig.getObjectDefinition(var17);
										if (var18.mapIconId != -1) {
											var14 = true;
											break label67;
										}
									}
								} else if (var13.mapIconId != -1) {
									var14 = true;
									break label67;
								}

								var14 = false;
							}

							if (var14) {
								this.getIcon(var13, var8, var6, var7, var5);
								continue label76;
							}
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lik;IIILlq;I)V",
		garbageValue = "-811016557"
	)
	@Export("getIcon")
	void getIcon(ObjectComposition var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		Coord var6 = new Coord(var2, var3 + this.regionX * 64, this.regionY * 64 + var4);
		Coord var7 = null;
		if (this.worldMapData_0 != null) {
			var7 = new Coord(this.worldMapData_0.minPlane + var2, var3 + this.worldMapData_0.regionXLow * 64, var4 + this.worldMapData_0.regionYLow * 64);
		} else {
			WorldMapData_1 var8 = (WorldMapData_1)var5;
			var7 = new Coord(var2 + var8.minPlane, var8.regionXLow * 64 + var3 + var8.getChunkXLow() * 8, var4 + var8.regionYLow * 64 + var8.getChunkYLow() * 8);
		}

		WorldMapElement var9;
		Object var10;
		if (var1.transforms != null) {
			var10 = new WorldMapIcon_1(var7, var6, var1.id, this);
		} else {
			var9 = InvDefinition.WorldMapElement_get(var1.mapIconId);
			var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9));
		}

		var9 = InvDefinition.WorldMapElement_get(((AbstractWorldMapIcon)var10).getElement());
		if (var9.field1918) {
			this.iconMap.put(new Coord(0, var3, var4), var10);
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-81542274"
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/List;I)V",
		garbageValue = "1364496738"
	)
	@Export("addAllToIconList")
	void addAllToIconList(List var1) {
		Iterator var2 = var1.iterator();

		while (var2.hasNext()) {
			WorldMapIcon_0 var3 = (WorldMapIcon_0)var2.next();
			if (InvDefinition.WorldMapElement_get(var3.element).field1918 && var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) {
				WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method6329(var3.element));
				this.icon0List.add(var4);
			}
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "71"
	)
	void method6308() {
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lps;I)Z",
		garbageValue = "-2082735223"
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILlf;[Lwy;Lps;Lps;D)V"
	)
	@Export("drawTile")
	void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5, double var6) {
		this.pixelsPerTile = var1;
		if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) {
			if (class539.method10242(this.regionX, this.regionY, var1) == null) {
				if (Rasterizer3D.method5014() != var6) {
					Rasterizer3D.buildPalette(var6);
				}

				boolean var8 = true;
				var8 &= this.loadGeography(var4);
				int var10;
				if (this.worldMapData_0 != null) {
					var10 = this.worldMapData_0.groupId;
				} else {
					var10 = ((AbstractWorldMapData)this.worldMapData1List.getFirst()).groupId;
				}

				var8 &= var5.tryLoadGroup(var10);
				if (var8) {
					byte[] var9 = var5.takeFileFlat(var10);
					WorldMapSprite var11;
					if (var9 == null) {
						var11 = new WorldMapSprite();
					} else {
						var11 = new WorldMapSprite(Tile.readSpritePixelsFromBytes(var9).pixels);
					}

					SpritePixels var13 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64);
					var13.setRaster();
					if (this.worldMapData_0 != null) {
						this.method6371(var2, var3, var11);
					} else {
						this.method6417(var2, var3, var11);
					}

					int var14 = this.regionX;
					int var15 = this.regionY;
					int var16 = this.pixelsPerTile;
					WorldMapRegion_cachedSprites.put(var13, class164.method3844(var14, var15, var16), var13.pixels.length * 4);
					this.method6308();
				}
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/util/HashSet;B)V",
		garbageValue = "-44"
	)
	void method6300(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) {
			var4 = new HashSet();
		}

		this.drawNonLinkMapIcons(var1, var2, var4, var3);
		this.drawMapLinks(var1, var2, var4, var3);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "1479071202"
	)
	@Export("flashElements")
	void flashElements(HashSet var1, int var2, int var3) {
		Iterator var4 = this.iconMap.values().iterator();

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next();
			if (var5.hasValidElement()) {
				int var6 = var5.getElement();
				if (var1.contains(var6)) {
					WorldMapElement var7 = InvDefinition.WorldMapElement_get(var6);
					this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3);
				}
			}
		}

		this.method6373(var1, var2, var3);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Llf;[Lwy;Llj;I)V",
		garbageValue = "1398773083"
	)
	void method6371(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		int var4;
		int var5;
		for (var4 = 0; var4 < 64; ++var4) {
			for (var5 = 0; var5 < 64; ++var5) {
				this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3);
				this.method6317(var4, var5, this.worldMapData_0, var1);
			}
		}

		for (var4 = 0; var4 < 64; ++var4) {
			for (var5 = 0; var5 < 64; ++var5) {
				this.method6315(var4, var5, this.worldMapData_0, var1, var2);
			}
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Llf;[Lwy;Llj;I)V",
		garbageValue = "1810456643"
	)
	void method6417(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		Iterator var4 = this.worldMapData1List.iterator();

		WorldMapData_1 var5;
		int var6;
		int var7;
		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next();

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) {
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) {
					this.drawTileGround(var6, var7, var5, var1, var3);
					this.method6317(var6, var7, var5, var1);
				}
			}
		}

		var4 = this.worldMapData1List.iterator();

		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next();

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) {
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) {
					this.method6315(var6, var7, var5, var1, var2);
				}
			}
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IILlq;Llf;[Lwy;I)V",
		garbageValue = "193150885"
	)
	void method6315(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
		this.method6320(var1, var2, var3);
		this.method6389(var1, var2, var3, var5);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IILlq;Llf;Llj;I)V",
		garbageValue = "1229839249"
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
			var8 = WorldMapElement.method4019(var7, this.backgroundColor);
		}

		if (var7 > -1 && var3.field3273[0][var1][var2] == 0) {
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8);
		} else {
			int var9 = this.method6313(var1, var2, var3, var5);
			if (var7 == -1) {
				Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9);
			} else {
				var4.method6754(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field3273[0][var1][var2], var3.field3274[0][var1][var2]);
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IILlq;Llf;I)V",
		garbageValue = "-690658425"
	)
	void method6317(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
		for (int var5 = 1; var5 < var3.planes; ++var5) {
			int var6 = var3.floorOverlayIds[var5][var1][var2] - 1;
			if (var6 > -1) {
				int var7 = WorldMapElement.method4019(var6, this.backgroundColor);
				if (var3.field3273[var5][var1][var2] == 0) {
					Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7);
				} else {
					var4.method6754(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field3273[var5][var1][var2], var3.field3274[var5][var1][var2]);
				}
			}
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IILlq;Llj;B)I",
		garbageValue = "112"
	)
	int method6313(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
		return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IILlq;[Lwy;I)V",
		garbageValue = "-2111772211"
	)
	void method6389(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
		for (int var5 = 0; var5 < var3.planes; ++var5) {
			WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2];
			if (var6 != null && var6.length != 0) {
				WorldMapDecoration[] var7 = var6;

				for (int var8 = 0; var8 < var7.length; ++var8) {
					WorldMapDecoration var9 = var7[var8];
					int var11 = var9.decoration;
					boolean var10 = var11 >= WorldMapDecorationType.field4172.id && var11 <= WorldMapDecorationType.field4161.id;
					if (var10 || class153.method3689(var9.decoration)) {
						ObjectComposition var12 = HealthBarConfig.getObjectDefinition(var9.objectDefinitionId);
						if (var12.mapSceneId != -1) {
							int var13 = var9.rotation != 1 && var9.rotation != 3 ? var12.sizeY : var12.sizeX;
							var4[var12.mapSceneId].method11296(this.pixelsPerTile * var1, this.pixelsPerTile * (64 - var13 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2);
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IILlq;I)V",
		garbageValue = "-1445801634"
	)
	void method6320(int var1, int var2, AbstractWorldMapData var3) {
		for (int var4 = 0; var4 < var3.planes; ++var4) {
			WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2];
			if (var5 != null && var5.length != 0) {
				WorldMapDecoration[] var6 = var5;

				for (int var7 = 0; var7 < var6.length; ++var7) {
					WorldMapDecoration var8 = var6[var7];
					int var10 = var8.decoration;
					boolean var9 = var10 >= WorldMapDecorationType.field4175.id && var10 <= WorldMapDecorationType.field4155.id || var10 == WorldMapDecorationType.field4160.id;
					if (var9) {
						ObjectComposition var11 = HealthBarConfig.getObjectDefinition(var8.objectDefinitionId);
						int var12 = var11.int1 != 0 ? -3407872 : -3355444;
						if (var8.decoration == WorldMapDecorationType.field4175.id) {
							this.method6333(var1, var2, var8.rotation, var12);
						}

						if (var8.decoration == WorldMapDecorationType.field4154.id) {
							this.method6333(var1, var2, var8.rotation, -3355444);
							this.method6333(var1, var2, var8.rotation + 1, var12);
						}

						if (var8.decoration == WorldMapDecorationType.field4155.id) {
							if (var8.rotation == 0) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var12);
							}

							if (var8.rotation == 1) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2), 1, var12);
							}

							if (var8.rotation == 2) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var12);
							}

							if (var8.rotation == 3) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var12);
							}
						}

						if (var8.decoration == WorldMapDecorationType.field4160.id) {
							int var13 = var8.rotation % 2;
							int var14;
							if (var13 == 0) {
								for (var14 = 0; var14 < this.pixelsPerTile; ++var14) {
									Rasterizer2D.Rasterizer2D_drawHorizontalLine(var14 + this.pixelsPerTile * var1, (64 - var2) * this.pixelsPerTile - 1 - var14, 1, var12);
								}
							} else {
								for (var14 = 0; var14 < this.pixelsPerTile; ++var14) {
									Rasterizer2D.Rasterizer2D_drawHorizontalLine(var14 + this.pixelsPerTile * var1, var14 + this.pixelsPerTile * (63 - var2), 1, var12);
								}
							}
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;II)V",
		garbageValue = "-57958383"
	)
	@Export("drawNonLinkMapIcons")
	void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F;
		float var6 = var5 / 2.0F;
		Iterator var7 = this.iconMap.entrySet().iterator();

		while (var7.hasNext()) {
			Entry var8 = (Entry)var7.next();
			Coord var9 = (Coord)var8.getKey();
			int var10 = (int)((float)var1 + var5 * (float)var9.x - var6);
			int var11 = (int)((float)(var2 + var4) - var5 * (float)var9.y - var6);
			AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.getValue();
			if (var12 != null && var12.hasValidElement()) {
				var12.screenX = var10;
				var12.screenY = var11;
				WorldMapElement var13 = InvDefinition.WorldMapElement_get(var12.getElement());
				if (!var3.contains(var13.getObjectId())) {
					this.method6343(var12, var10, var11, var5);
				}
			}
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "1069365107"
	)
	void method6373(HashSet var1, int var2, int var3) {
		Iterator var4 = this.icon0List.iterator();

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next();
			if (var5.hasValidElement()) {
				WorldMapElement var6 = InvDefinition.WorldMapElement_get(var5.getElement());
				if (var6 != null && var1.contains(var6.getObjectId())) {
					this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3);
				}
			}
		}

	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Lhm;IIIII)V",
		garbageValue = "-1177876423"
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

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Llr;IIFB)V",
		garbageValue = "65"
	)
	void method6343(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
		WorldMapElement var5 = InvDefinition.WorldMapElement_get(var1.getElement());
		this.method6324(var5, var2, var3);
		this.method6325(var1, var5, var2, var3, var4);
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Lhm;IIB)V",
		garbageValue = "1"
	)
	void method6324(WorldMapElement var1, int var2, int var3) {
		SpritePixels var4 = var1.getSpriteBool(false);
		if (var4 != null) {
			int var5 = this.method6327(var4, var1.horizontalAlignment);
			int var6 = this.method6400(var4, var1.verticalAlignment);
			var4.drawTransBgAt(var5 + var2, var3 + var6);
		}

	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Llr;Lhm;IIFI)V",
		garbageValue = "233258018"
	)
	void method6325(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
		WorldMapLabel var6 = var1.getLabel();
		if (var6 != null) {
			if (var6.size.method6160(var5)) {
				Font var7 = (Font)this.fonts.get(var6.size);
				var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field1934, 0, 1, 0, var7.ascent / 2);
			}
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;II)V",
		garbageValue = "1394101650"
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
				var7.screenX = (int)((float)var1 + (float)var8 * var5);
				var7.screenY = (int)((float)var2 + var5 * (float)(63 - var9));
				if (!var3.contains(var7.getElement())) {
					this.method6343(var7, var7.screenX, var7.screenY, var5);
				}
			}
		}

	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Lwd;Lhv;B)I",
		garbageValue = "-9"
	)
	int method6327(SpritePixels var1, HorizontalAlignment var2) {
		switch(var2.value) {
		case 0:
			return -var1.subWidth / 2;
		case 1:
			return 0;
		default:
			return -var1.subWidth;
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Lwd;Lhr;I)I",
		garbageValue = "2022689416"
	)
	int method6400(SpritePixels var1, VerticalAlignment var2) {
		switch(var2.value) {
		case 1:
			return 0;
		case 2:
			return -var1.subHeight / 2;
		default:
			return -var1.subHeight;
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(II)Llp;",
		garbageValue = "-1121309782"
	)
	WorldMapLabel method6329(int var1) {
		WorldMapElement var2 = InvDefinition.WorldMapElement_get(var1);
		return this.createMapLabel(var2);
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Lhm;B)Llp;",
		garbageValue = "21"
	)
	@Export("createMapLabel")
	WorldMapLabel createMapLabel(WorldMapElement var1) {
		if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) {
			WorldMapLabelSize var2 = WorldMapLabelSize.method6158(var1.textSize);
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

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)Ljava/util/List;",
		garbageValue = "2092358045"
	)
	List method6351(int var1, int var2, int var3, int var4, int var5) {
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

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/List;",
		garbageValue = "1"
	)
	@Export("icons")
	List icons() {
		LinkedList var1 = new LinkedList();
		var1.addAll(this.icon0List);
		var1.addAll(this.iconMap.values());
		return var1;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "2065501065"
	)
	void method6333(int var1, int var2, int var3, int var4) {
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lps;IIB)Lwy;",
		garbageValue = "-98"
	)
	static IndexedSprite method6429(AbstractArchive var0, int var1, int var2) {
		return !class167.method3865(var0, var1, var2) ? null : AuthenticationScheme.method3628();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "13786"
	)
	public static int method6426(int var0) {
		return var0 >> 3 & 2047;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)Lbd;",
		garbageValue = "72"
	)
	@Export("Messages_getMessage")
	static Message Messages_getMessage(int var0) {
		return (Message)Messages.Messages_hashTable.get((long)var0);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1070819827"
	)
	public static String method6428(String var0) {
		StringBuilder var1 = new StringBuilder(var0.length());
		int var2 = 0;
		int var3 = -1;

		for (int var4 = 0; var4 < var0.length(); ++var4) {
			char var5 = var0.charAt(var4);
			if (var5 == '<') {
				var1.append(var0.substring(var2, var4));
				var3 = var4;
			} else if (var5 == '>' && var3 != -1) {
				String var6 = var0.substring(var3 + 1, var4);
				var3 = -1;
				if (var6.equals("lt")) {
					var1.append("<");
				} else if (var6.equals("gt")) {
					var1.append(">");
				} else if (var6.equals("br")) {
					var1.append("\n");
				}

				var2 = var4 + 1;
			}
		}

		if (var2 < var0.length()) {
			var1.append(var0.substring(var2, var0.length()));
		}

		return var1.toString();
	}
}
