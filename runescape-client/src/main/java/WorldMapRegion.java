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

@ObfuscatedName("ld")
@Implements("WorldMapRegion")
public class WorldMapRegion {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	@Export("WorldMapRegion_cachedSprites")
	public static DemotingHashTable WorldMapRegion_cachedSprites;
	@ObfuscatedName("af")
	@Export("fonts")
	final HashMap fonts;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -256430621
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1477055689
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	@Export("worldMapData_0")
	WorldMapData_0 worldMapData_0;
	@ObfuscatedName("aa")
	@Export("worldMapData1List")
	LinkedList worldMapData1List;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1463256947
	)
	@Export("backgroundColor")
	int backgroundColor;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 972707637
	)
	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("av")
	@Export("icon0List")
	List icon0List;
	@ObfuscatedName("as")
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-665463588"
	)
	void method6535(int var1, int var2, int var3) {
		int var5 = this.regionX;
		int var6 = this.regionY;
		int var7 = this.pixelsPerTile;
		SpritePixels var4 = (SpritePixels)WorldMapRegion_cachedSprites.get(AuthenticationScheme.method3661(var5, var6, var7));
		if (var4 != null) {
			if (var3 == this.pixelsPerTile * 64) {
				var4.drawAt(var1, var2);
			} else {
				var4.drawScaledWorldmap(var1, var2, var3, var3);
			}

		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lkl;Ljava/util/List;I)V",
		garbageValue = "-1061403461"
	)
	@Export("initWorldMapData0")
	void initWorldMapData0(WorldMapData_0 var1, List var2) {
		this.iconMap.clear();
		this.worldMapData_0 = var1;
		this.addAllToIconList(var2);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;Ljava/util/List;I)V",
		garbageValue = "-1615182661"
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIILlx;B)V",
		garbageValue = "-107"
	)
	@Export("getIconsForTiles")
	void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		for (int var6 = var1; var6 < var3 + var1; ++var6) {
			label75:
			for (int var7 = var2; var7 < var2 + var4; ++var7) {
				for (int var8 = 0; var8 < var5.planes; ++var8) {
					WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7];
					if (var9 != null && var9.length != 0) {
						WorldMapDecoration[] var10 = var9;

						for (int var11 = 0; var11 < var10.length; ++var11) {
							ObjectComposition var13;
							boolean var14;
							label66: {
								WorldMapDecoration var12 = var10[var11];
								var13 = TileItem.getObjectDefinition(var12.objectDefinitionId);
								if (var13.transforms != null) {
									int[] var15 = var13.transforms;

									for (int var16 = 0; var16 < var15.length; ++var16) {
										int var17 = var15[var16];
										ObjectComposition var18 = TileItem.getObjectDefinition(var17);
										if (var18.mapIconId != -1) {
											var14 = true;
											break label66;
										}
									}
								} else if (var13.mapIconId != -1) {
									var14 = true;
									break label66;
								}

								var14 = false;
							}

							if (var14) {
								this.getIcon(var13, var8, var6, var7, var5);
								continue label75;
							}
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lia;IIILlx;I)V",
		garbageValue = "-1533470106"
	)
	@Export("getIcon")
	void getIcon(ObjectComposition var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		Coord var6 = new Coord(var2, var3 + this.regionX * 64, this.regionY * 64 + var4);
		Coord var7 = null;
		if (this.worldMapData_0 != null) {
			var7 = new Coord(this.worldMapData_0.minPlane + var2, var3 + this.worldMapData_0.regionXLow * 64, this.worldMapData_0.regionYLow * 4096 + var4);
		} else {
			WorldMapData_1 var8 = (WorldMapData_1)var5;
			var7 = new Coord(var2 + var8.minPlane, var8.regionXLow * 64 + var3 + var8.getChunkXLow() * 8, var4 + var8.regionYLow * 4096 + var8.getChunkYLow() * 8);
		}

		WorldMapElement var9;
		Object var10;
		if (var1.transforms != null) {
			var10 = new WorldMapIcon_1(var7, var6, var1.id, this);
		} else {
			var9 = LoginState.WorldMapElement_get(var1.mapIconId);
			var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9));
		}

		var9 = LoginState.WorldMapElement_get(((AbstractWorldMapIcon)var10).getElement());
		if (var9.field1993) {
			this.iconMap.put(new Coord(0, var3, var4), var10);
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1824755973"
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/List;I)V",
		garbageValue = "840260320"
	)
	@Export("addAllToIconList")
	void addAllToIconList(List var1) {
		Iterator var2 = var1.iterator();

		while (var2.hasNext()) {
			WorldMapIcon_0 var3 = (WorldMapIcon_0)var2.next();
			if (LoginState.WorldMapElement_get(var3.element).field1993 && var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) {
				WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method6616(var3.element));
				this.icon0List.add(var4);
			}
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-33"
	)
	void method6542() {
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lpe;B)Z",
		garbageValue = "39"
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILlp;[Lxc;Lpe;Lpe;D)V"
	)
	@Export("drawTile")
	void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5, double var6) {
		this.pixelsPerTile = var1;
		if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) {
			int var9 = this.regionX;
			int var10 = this.regionY;
			SpritePixels var8 = (SpritePixels)WorldMapRegion_cachedSprites.get(AuthenticationScheme.method3661(var9, var10, var1));
			if (var8 == null) {
				if (Rasterizer3D.method5024() != var6) {
					Rasterizer3D.buildPalette(var6);
				}

				boolean var11 = true;
				var11 &= this.loadGeography(var4);
				int var13;
				if (this.worldMapData_0 != null) {
					var13 = this.worldMapData_0.groupId;
				} else {
					var13 = ((AbstractWorldMapData)this.worldMapData1List.getFirst()).groupId;
				}

				var11 &= var5.tryLoadGroup(var13);
				if (var11) {
					byte[] var12 = var5.takeFileFlat(var13);
					WorldMapSprite var14 = AuthenticationScheme.method3666(var12);
					SpritePixels var15 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64);
					var15.setRaster();
					if (this.worldMapData_0 != null) {
						this.method6546(var2, var3, var14);
					} else {
						this.method6547(var2, var3, var14);
					}

					int var16 = this.regionX;
					int var17 = this.regionY;
					int var18 = this.pixelsPerTile;
					WorldMapRegion_cachedSprites.put(var15, AuthenticationScheme.method3661(var16, var17, var18), var15.pixels.length * 4);
					this.method6542();
				}
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/util/HashSet;I)V",
		garbageValue = "354120257"
	)
	void method6623(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) {
			var4 = new HashSet();
		}

		this.drawNonLinkMapIcons(var1, var2, var4, var3);
		this.drawMapLinks(var1, var2, var4, var3);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;IIB)V",
		garbageValue = "-49"
	)
	@Export("flashElements")
	void flashElements(HashSet var1, int var2, int var3) {
		Iterator var4 = this.iconMap.values().iterator();

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next();
			if (var5.hasValidElement()) {
				int var6 = var5.getElement();
				if (var1.contains(var6)) {
					WorldMapElement var7 = LoginState.WorldMapElement_get(var6);
					this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3);
				}
			}
		}

		this.method6553(var1, var2, var3);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Llp;[Lxc;Llq;I)V",
		garbageValue = "-1402738815"
	)
	void method6546(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		int var4;
		int var5;
		for (var4 = 0; var4 < 64; ++var4) {
			for (var5 = 0; var5 < 64; ++var5) {
				this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3);
				this.method6588(var4, var5, this.worldMapData_0, var1);
			}
		}

		for (var4 = 0; var4 < 64; ++var4) {
			for (var5 = 0; var5 < 64; ++var5) {
				this.method6636(var4, var5, this.worldMapData_0, var1, var2);
			}
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Llp;[Lxc;Llq;I)V",
		garbageValue = "431767052"
	)
	void method6547(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		Iterator var4 = this.worldMapData1List.iterator();

		WorldMapData_1 var5;
		int var6;
		int var7;
		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next();

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) {
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) {
					this.drawTileGround(var6, var7, var5, var1, var3);
					this.method6588(var6, var7, var5, var1);
				}
			}
		}

		var4 = this.worldMapData1List.iterator();

		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next();

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) {
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) {
					this.method6636(var6, var7, var5, var1, var2);
				}
			}
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IILlx;Llp;[Lxc;I)V",
		garbageValue = "-867536102"
	)
	void method6636(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
		this.method6552(var1, var2, var3);
		this.method6537(var1, var2, var3, var5);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IILlx;Llp;Llq;I)V",
		garbageValue = "320191422"
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
			var8 = MouseRecorder.method2180(var7, this.backgroundColor);
		}

		if (var7 > -1 && var3.field3434[0][var1][var2] == 0) {
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8);
		} else {
			int var9 = this.method6638(var1, var2, var3, var5);
			if (var7 == -1) {
				Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9);
			} else {
				var4.method6965(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field3434[0][var1][var2], var3.field3442[0][var1][var2]);
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IILlx;Llp;B)V",
		garbageValue = "91"
	)
	void method6588(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
		for (int var5 = 1; var5 < var3.planes; ++var5) {
			int var6 = var3.floorOverlayIds[var5][var1][var2] - 1;
			if (var6 > -1) {
				int var7 = MouseRecorder.method2180(var6, this.backgroundColor);
				if (var3.field3434[var5][var1][var2] == 0) {
					Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7);
				} else {
					var4.method6965(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field3434[var5][var1][var2], var3.field3442[var5][var1][var2]);
				}
			}
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IILlx;Llq;B)I",
		garbageValue = "-128"
	)
	int method6638(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
		return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IILlx;[Lxc;I)V",
		garbageValue = "2084808692"
	)
	void method6537(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
		for (int var5 = 0; var5 < var3.planes; ++var5) {
			WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2];
			if (var6 != null && var6.length != 0) {
				WorldMapDecoration[] var7 = var6;

				for (int var8 = 0; var8 < var7.length; ++var8) {
					WorldMapDecoration var9 = var7[var8];
					int var11 = var9.decoration;
					boolean var10 = var11 >= WorldMapDecorationType.field4369.id && var11 <= WorldMapDecorationType.field4374.id;
					if (var10 || class107.method3441(var9.decoration)) {
						ObjectComposition var12 = TileItem.getObjectDefinition(var9.objectDefinitionId);
						if (var12.mapSceneId != -1) {
							int var13 = var9.rotation != 1 && var9.rotation != 3 ? var12.sizeY : var12.sizeX;
							var4[var12.mapSceneId].method11838(this.pixelsPerTile * var1, this.pixelsPerTile * (64 - var13 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2);
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IILlx;I)V",
		garbageValue = "134087018"
	)
	void method6552(int var1, int var2, AbstractWorldMapData var3) {
		for (int var4 = 0; var4 < var3.planes; ++var4) {
			WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2];
			if (var5 != null && var5.length != 0) {
				WorldMapDecoration[] var6 = var5;

				for (int var7 = 0; var7 < var6.length; ++var7) {
					WorldMapDecoration var8 = var6[var7];
					int var10 = var8.decoration;
					boolean var9 = var10 >= WorldMapDecorationType.field4366.id && var10 <= WorldMapDecorationType.field4368.id || var10 == WorldMapDecorationType.field4357.id;
					if (var9) {
						ObjectComposition var11 = TileItem.getObjectDefinition(var8.objectDefinitionId);
						int var12 = var11.int1 != 0 ? -3407872 : -3355444;
						if (var8.decoration == WorldMapDecorationType.field4366.id) {
							this.method6566(var1, var2, var8.rotation, var12);
						}

						if (var8.decoration == WorldMapDecorationType.field4355.id) {
							this.method6566(var1, var2, var8.rotation, -3355444);
							this.method6566(var1, var2, var8.rotation + 1, var12);
						}

						if (var8.decoration == WorldMapDecorationType.field4368.id) {
							if (var8.rotation == 0) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var12);
							}

							if (var8.rotation == 1) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2), 1, var12);
							}

							if (var8.rotation == 2) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var12);
							}

							if (var8.rotation == 3) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var12);
							}
						}

						if (var8.decoration == WorldMapDecorationType.field4357.id) {
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;IB)V",
		garbageValue = "-58"
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
				WorldMapElement var13 = LoginState.WorldMapElement_get(var12.getElement());
				if (!var3.contains(var13.getObjectId())) {
					this.method6556(var12, var10, var11, var5);
				}
			}
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "-154508597"
	)
	void method6553(HashSet var1, int var2, int var3) {
		Iterator var4 = this.icon0List.iterator();

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next();
			if (var5.hasValidElement()) {
				WorldMapElement var6 = LoginState.WorldMapElement_get(var5.getElement());
				if (var6 != null && var1.contains(var6.getObjectId())) {
					this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3);
				}
			}
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lha;IIIII)V",
		garbageValue = "-1103984366"
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lln;IIFB)V",
		garbageValue = "29"
	)
	void method6556(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
		WorldMapElement var5 = LoginState.WorldMapElement_get(var1.getElement());
		this.method6551(var5, var2, var3);
		this.method6558(var1, var5, var2, var3, var4);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lha;III)V",
		garbageValue = "-46008227"
	)
	void method6551(WorldMapElement var1, int var2, int var3) {
		SpritePixels var4 = var1.getSpriteBool(false);
		if (var4 != null) {
			int var5 = this.method6650(var4, var1.horizontalAlignment);
			int var6 = this.method6562(var4, var1.verticalAlignment);
			var4.drawTransBgAt(var5 + var2, var3 + var6);
		}

	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Lln;Lha;IIFI)V",
		garbageValue = "1904178260"
	)
	void method6558(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
		WorldMapLabel var6 = var1.getLabel();
		if (var6 != null) {
			if (var6.size.method6409(var5)) {
				Font var7 = (Font)this.fonts.get(var6.size);
				var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field1989, 0, 1, 0, var7.ascent / 2);
			}
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;IB)V",
		garbageValue = "0"
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
				var7.screenY = (int)((float)(63 - var9) * var5 + (float)var2);
				if (!var3.contains(var7.getElement())) {
					this.method6556(var7, var7.screenX, var7.screenY, var5);
				}
			}
		}

	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lxl;Lhv;B)I",
		garbageValue = "-86"
	)
	int method6650(SpritePixels var1, HorizontalAlignment var2) {
		switch(var2.value) {
		case 1:
			return 0;
		case 2:
			return -var1.subWidth / 2;
		default:
			return -var1.subWidth;
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Lxl;Lht;I)I",
		garbageValue = "-1881151548"
	)
	int method6562(SpritePixels var1, VerticalAlignment var2) {
		switch(var2.value) {
		case 1:
			return 0;
		case 2:
			return -var1.subHeight / 2;
		default:
			return -var1.subHeight;
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(IB)Llb;",
		garbageValue = "1"
	)
	WorldMapLabel method6616(int var1) {
		WorldMapElement var2 = LoginState.WorldMapElement_get(var1);
		return this.createMapLabel(var2);
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Lha;I)Llb;",
		garbageValue = "288122165"
	)
	@Export("createMapLabel")
	WorldMapLabel createMapLabel(WorldMapElement var1) {
		if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) {
			int var3 = var1.textSize;
			WorldMapLabelSize[] var4 = new WorldMapLabelSize[]{WorldMapLabelSize.WorldMapLabelSize_large, WorldMapLabelSize.WorldMapLabelSize_medium, WorldMapLabelSize.WorldMapLabelSize_small};
			WorldMapLabelSize[] var5 = var4;
			int var6 = 0;

			WorldMapLabelSize var2;
			while (true) {
				if (var6 >= var5.length) {
					var2 = null;
					break;
				}

				WorldMapLabelSize var7 = var5[var6];
				if (var3 == var7.field3306) {
					var2 = var7;
					break;
				}

				++var6;
			}

			if (var2 == null) {
				return null;
			} else {
				Font var14 = (Font)this.fonts.get(var2);
				if (var14 == null) {
					return null;
				} else {
					var6 = var14.lineCount(var1.name, 1000000);
					String[] var15 = new String[var6];
					var14.breakLines(var1.name, (int[])null, var15);
					int var8 = var15.length * var14.ascent / 2;
					int var9 = 0;
					String[] var10 = var15;

					for (int var11 = 0; var11 < var10.length; ++var11) {
						String var12 = var10[var11];
						int var13 = var14.stringWidth(var12);
						if (var13 > var9) {
							var9 = var13;
						}
					}

					return new WorldMapLabel(var1.name, var9, var8, var2);
				}
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)Ljava/util/List;",
		garbageValue = "-58700346"
	)
	List method6564(int var1, int var2, int var3, int var4, int var5) {
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

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/util/List;",
		garbageValue = "-3396"
	)
	@Export("icons")
	List icons() {
		LinkedList var1 = new LinkedList();
		var1.addAll(this.icon0List);
		var1.addAll(this.iconMap.values());
		return var1;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1377596888"
	)
	void method6566(int var1, int var2, int var3, int var4) {
		var3 %= 4;
		if (var3 == 0) {
			Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 1) {
			Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 2) {
			Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 3) {
			Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, this.pixelsPerTile, var4);
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I[BLtd;I)V",
		garbageValue = "291674031"
	)
	static void method6643(int var0, byte[] var1, ArchiveDisk var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction();
		var3.type = 0;
		var3.key = (long)var0;
		var3.data = var1;
		var3.archiveDisk = var2;
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3);
		}

		RouteStrategy.method6246();
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1980975189"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount;
		class547.topLevelWorldView.scene.cycle = Client.cycle;
		Strings.method8218();
		class409.method8389(class547.topLevelWorldView);
		WorldView var4 = class547.topLevelWorldView;
		int var5 = Client.menu.menuOptionsCount - 1;
		int var7;
		if (WorldMapSection1.field3493 != null && var4 == class547.topLevelWorldView && var5 >= 0 && Client.menu.menuOpcodes[var5] == 60 && (Client.field557 <= 0 || Client.menu.menuIdentifiers[var5] != Client.field565)) {
			var7 = Client.menu.menuIdentifiers[var5] * 128;
			class143.method3828(var4, var7, WorldMapSection1.field3493);
		}

		WorldView var23 = class547.topLevelWorldView;
		if (Client.renderSelf) {
			class46.addPlayerToScene(var23, Client.localPlayerIndex, false);
		}

		WorldView var24 = class547.topLevelWorldView;
		if (Client.combatTargetPlayerIndex >= 0 && var24.players.get((long)Client.combatTargetPlayerIndex) != null) {
			class46.addPlayerToScene(var24, Client.combatTargetPlayerIndex, false);
		}

		WorldMapLabelSize.method6400(class547.topLevelWorldView);
		MouseHandler.method712(class547.topLevelWorldView, class391.TOKEN);
		MouseHandler.method712(class547.topLevelWorldView, class391.field4828);
		PlayerUpdateManager.addNpcsToScene(class547.topLevelWorldView, class196.field2146);
		WorldView var25 = class547.topLevelWorldView;
		int var8 = Client.playerUpdateManager.playerCount;
		int[] var9 = Client.playerUpdateManager.playerIndices;

		int var10;
		for (var10 = 0; var10 < var8; ++var10) {
			if (var9[var10] != Client.combatTargetPlayerIndex && var9[var10] != Client.localPlayerIndex) {
				class46.addPlayerToScene(var25, var9[var10], true);
			}
		}

		PlayerUpdateManager.addNpcsToScene(class547.topLevelWorldView, class196.field2147);
		PlayerUpdateManager.addNpcsToScene(class547.topLevelWorldView, class196.field2151);
		class35.method736();
		CollisionMap.method6235(class547.topLevelWorldView);
		MouseHandler.method712(class547.topLevelWorldView, class391.field4831);
		class173.setViewportShape(var0, var1, var2, var3, true);
		int var26 = Client.viewportOffsetX;
		var5 = Client.viewportOffsetY;
		int var6 = Client.viewportWidth;
		var7 = Client.viewportHeight;
		Rasterizer2D.Rasterizer2D_setClip(var26, var5, var26 + var6, var7 + var5);
		Rasterizer3D.resetRasterClipping();
		Rasterizer2D.clearBrightness();
		var8 = Client.camAngleX;
		if (Client.field516 / 256 > var8) {
			var8 = Client.field516 / 256;
		}

		if (Client.field583[4] && Client.field567[4] + 128 > var8) {
			var8 = Client.field567[4] + 128;
		}

		int var27 = Client.camAngleY & 2047;
		class396.method8282(class454.oculusOrbFocalPointX, class32.oculusOrbFocalPointZ, WorldMapElement.oculusOrbFocalPointY, var8, var27, Occluder.method5463(var8), var7);
		int var11;
		int var12;
		int var13;
		int var14;
		int var15;
		int var16;
		int var17;
		int var18;
		int var20;
		int var21;
		if (!Client.isCameraLocked) {
			if (class154.clientPreferences.isRoofsHidden()) {
				var11 = class547.topLevelWorldView.plane;
			} else {
				label443: {
					var12 = 3;
					var13 = Client.field484 >> 7;
					var14 = Client.field377 >> 7;
					if (class386.cameraPitch < 310) {
						label439: {
							if (Client.oculusOrbState == 1) {
								var15 = class454.oculusOrbFocalPointX >> 7;
								var16 = WorldMapElement.oculusOrbFocalPointY >> 7;
							} else {
								var15 = var13;
								var16 = var14;
							}

							var17 = Huffman.cameraX >> 7;
							var18 = ChatChannel.cameraZ >> 7;
							if (var17 >= 0 && 104 > var17 && var18 >= 0 && 104 > var18) {
								if (var15 >= 0 && 104 > var15 && var16 >= 0 && 104 > var16) {
									if ((class547.topLevelWorldView.tileSettings[class547.topLevelWorldView.plane][var17][var18] & 4) != 0) {
										var12 = class547.topLevelWorldView.plane;
									}

									int var19;
									if (var15 > var17) {
										var19 = var15 - var17;
									} else {
										var19 = var17 - var15;
									}

									if (var16 > var18) {
										var20 = var16 - var18;
									} else {
										var20 = var18 - var16;
									}

									int var22;
									if (var19 > var20) {
										var21 = var20 * 65536 / var19;
										var22 = 32768;

										while (true) {
											if (var15 == var17) {
												break label439;
											}

											if (var17 < var15) {
												++var17;
											} else if (var17 > var15) {
												--var17;
											}

											if ((class547.topLevelWorldView.tileSettings[class547.topLevelWorldView.plane][var17][var18] & 4) != 0) {
												var12 = class547.topLevelWorldView.plane;
											}

											var22 += var21;
											if (var22 >= 65536) {
												var22 -= 65536;
												if (var18 < var16) {
													++var18;
												} else if (var18 > var16) {
													--var18;
												}

												if ((class547.topLevelWorldView.tileSettings[class547.topLevelWorldView.plane][var17][var18] & 4) != 0) {
													var12 = class547.topLevelWorldView.plane;
												}
											}
										}
									} else {
										if (var20 > 0) {
											var21 = var19 * 65536 / var20;
											var22 = 32768;

											while (var16 != var18) {
												if (var18 < var16) {
													++var18;
												} else if (var18 > var16) {
													--var18;
												}

												if ((class547.topLevelWorldView.tileSettings[class547.topLevelWorldView.plane][var17][var18] & 4) != 0) {
													var12 = class547.topLevelWorldView.plane;
												}

												var22 += var21;
												if (var22 >= 65536) {
													var22 -= 65536;
													if (var17 < var15) {
														++var17;
													} else if (var17 > var15) {
														--var17;
													}

													if ((class547.topLevelWorldView.tileSettings[class547.topLevelWorldView.plane][var17][var18] & 4) != 0) {
														var12 = class547.topLevelWorldView.plane;
													}
												}
											}
										}
										break label439;
									}
								}

								var11 = class547.topLevelWorldView.plane;
								break label443;
							}

							var11 = class547.topLevelWorldView.plane;
							break label443;
						}
					}

					if (var13 >= 0 && 104 > var13 && var14 >= 0 && 104 > var14) {
						if ((class547.topLevelWorldView.tileSettings[class547.topLevelWorldView.plane][var13][var14] & 4) != 0) {
							var12 = class547.topLevelWorldView.plane;
						}

						var11 = var12;
					} else {
						var11 = class547.topLevelWorldView.plane;
					}
				}
			}

			var10 = var11;
		} else {
			var10 = class334.method7081();
		}

		var11 = Huffman.cameraX;
		var12 = class514.cameraY;
		var13 = ChatChannel.cameraZ;
		var14 = class386.cameraPitch;
		var15 = SpriteBufferProperties.cameraYaw;

		for (var16 = 0; var16 < 5; ++var16) {
			if (Client.field583[var16]) {
				var17 = (int)(Math.random() * (double)(Client.field453[var16] * 2 + 1) - (double)Client.field453[var16] + Math.sin((double)Client.field323[var16] / 100.0D * (double)Client.field569[var16]) * (double)Client.field567[var16]);
				if (var16 == 0) {
					Huffman.cameraX += var17;
				}

				if (var16 == 1) {
					class514.cameraY += var17;
				}

				if (var16 == 2) {
					ChatChannel.cameraZ += var17;
				}

				if (var16 == 3) {
					SpriteBufferProperties.cameraYaw = var17 + SpriteBufferProperties.cameraYaw & 2047;
				}

				if (var16 == 4) {
					class386.cameraPitch += var17;
					if (class386.cameraPitch < 128) {
						class386.cameraPitch = 128;
					}

					if (class386.cameraPitch > 383) {
						class386.cameraPitch = 383;
					}
				}
			}
		}

		var16 = MouseHandler.MouseHandler_x;
		var17 = MouseHandler.MouseHandler_y;
		if (var16 >= var26 && var16 < var6 + var26 && var17 >= var5 && var17 < var7 + var5) {
			class135.method3744(var16 - var26, var17 - var5);
			Iterator var28 = Client.worldViewManager.iterator();

			while (var28.hasNext()) {
				WorldView var29 = (WorldView)var28.next();
				var29.scene.method5172(var29.plane, var16 - var26, var17 - var5);
			}
		} else {
			UrlRequest.method3597();
		}

		StudioGame.method8201();
		Rasterizer2D.Rasterizer2D_fillRectangle(var26, var5, var6, var7, 0);
		StudioGame.method8201();
		var18 = Rasterizer3D.get3dZoom();
		Rasterizer3D.method4988(class32.client.field172);
		Rasterizer3D.clips.zoom = Client.viewportZoom;
		TileRenderMode var32 = Client.currentWorldViewId == -1 ? TileRenderMode.field2511 : TileRenderMode.field2512;
		class547.topLevelWorldView.scene.method5171(var32);
		class547.topLevelWorldView.scene.draw(Huffman.cameraX, class514.cameraY, ChatChannel.cameraZ, class386.cameraPitch, SpriteBufferProperties.cameraYaw, var10, Client.field484, Client.field377, Client.isCameraLocked);
		Projection.method5512(ViewportMouse.field2958, ViewportMouse.ViewportMouse_entityTags, 0, ViewportMouse.ViewportMouse_entityCount);

		for (var20 = 0; var20 < ViewportMouse.ViewportMouse_entityCount; ++var20) {
			for (var21 = var20 + 1; var21 <= ViewportMouse.ViewportMouse_entityCount; ++var21) {
				if (ViewportMouse.ViewportMouse_entityTags[var21] == ViewportMouse.ViewportMouse_entityTags[var20]) {
					ViewportMouse.ViewportMouse_entityTags[var20] = -1L;
					break;
				}
			}
		}

		Rasterizer3D.method4988(false);
		if (Client.z) {
			Rasterizer2D.adjustBrightness();
		}

		Rasterizer3D.clips.zoom = var18;
		StudioGame.method8201();
		AbstractWorldMapData.method6806(class547.topLevelWorldView, var26, var5, var6, var7);

		for (var20 = 0; var20 < class547.topLevelWorldView.field1170.method9887(); ++var20) {
			WorldEntity var30 = (WorldEntity)class547.topLevelWorldView.worldEntities.get((long)class547.topLevelWorldView.field1170.method9886(var20));
			if (var30 != null) {
				AbstractWorldMapData.method6806(var30.worldView, var26, var5, var6, var7);
			}
		}

		HealthBarConfig.method2774(var26, var5);
		class158.method3965(var26, var5);
		((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).animate(Client.graphicsCycle);
		Client.field321 = 0;
		var20 = (class159.localPlayer.x >> 7) + class547.topLevelWorldView.baseX;
		var21 = (class159.localPlayer.y >> 7) + class547.topLevelWorldView.baseY;
		if (var20 >= 3053 && var20 <= 3156 && var21 >= 3056 && var21 <= 3136) {
			Client.field321 = 1;
		}

		if (var20 >= 3072 && var20 <= 3118 && var21 >= 9492 && var21 <= 9535) {
			Client.field321 = 1;
		}

		if (Client.field321 == 1 && var20 >= 3139 && var20 <= 3199 && var21 >= 3008 && var21 <= 3062) {
			Client.field321 = 0;
		}

		Huffman.cameraX = var11;
		class514.cameraY = var12;
		ChatChannel.cameraZ = var13;
		class386.cameraPitch = var14;
		SpriteBufferProperties.cameraYaw = var15;
		if (Client.isLoading && BufferedNetSocket.field5515.method8496(true, false) == 0) {
			Client.isLoading = false;
		}

		if (Client.isLoading) {
			Rasterizer2D.Rasterizer2D_fillRectangle(var26, var5, var6, var7, 0);
			class88.drawLoadingMessage("Loading - please wait.", false);
		}

		class547.topLevelWorldView.scene.setViewportWalking();

		for (var8 = 0; var8 < class547.topLevelWorldView.field1170.method9887(); ++var8) {
			WorldEntity var31 = (WorldEntity)class547.topLevelWorldView.worldEntities.get((long)class547.topLevelWorldView.field1170.method9886(var8));
			if (var31 != null) {
				var31.worldView.scene.setViewportWalking();
			}
		}

	}
}
