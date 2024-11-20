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
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("kd")
@Implements("WorldMapRegion")
public class WorldMapRegion {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	@Export("WorldMapRegion_cachedSprites")
	public static DemotingHashTable WorldMapRegion_cachedSprites;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1240236437
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 2047519367
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	@Export("worldMapData_0")
	WorldMapData_0 worldMapData_0;
	@ObfuscatedName("au")
	@Export("worldMapData1List")
	LinkedList worldMapData1List;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1870481773
	)
	@Export("backgroundColor")
	int backgroundColor;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -492649481
	)
	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("ai")
	@Export("icon0List")
	List icon0List;
	@ObfuscatedName("al")
	@Export("iconMap")
	HashMap iconMap;
	@ObfuscatedName("ar")
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "641709450"
	)
	void method5911(int var1, int var2, int var3) {
		SpritePixels var4 = RestClientThreadFactory.method194(this.regionX, this.regionY, this.pixelsPerTile);
		if (var4 != null) {
			if (var3 == this.pixelsPerTile * 64) {
				var4.drawAt(var1, var2);
			} else {
				var4.drawScaledWorldmap(var1, var2, var3, var3);
			}

		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lki;Ljava/util/List;I)V",
		garbageValue = "-869380103"
	)
	@Export("initWorldMapData0")
	void initWorldMapData0(WorldMapData_0 var1, List var2) {
		this.iconMap.clear();
		this.worldMapData_0 = var1;
		this.addAllToIconList(var2);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;Ljava/util/List;I)V",
		garbageValue = "-930270174"
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIILlo;B)V",
		garbageValue = "0"
	)
	@Export("getIconsForTiles")
	void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		for (int var6 = var1; var6 < var3 + var1; ++var6) {
			label51:
			for (int var7 = var2; var7 < var2 + var4; ++var7) {
				for (int var8 = 0; var8 < var5.planes; ++var8) {
					WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7];
					if (var9 != null && var9.length != 0) {
						WorldMapDecoration[] var10 = var9;

						for (int var11 = 0; var11 < var10.length; ++var11) {
							WorldMapDecoration var12 = var10[var11];
							ObjectComposition var13 = HttpMethod.getObjectDefinition(var12.objectDefinitionId);
							if (WorldMapRectangle.method6230(var13)) {
								this.getIcon(var13, var8, var6, var7, var5);
								continue label51;
							}
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lir;IIILlo;I)V",
		garbageValue = "610056244"
	)
	@Export("getIcon")
	void getIcon(ObjectComposition var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		Coord var6 = new Coord(var2, var3 + this.regionX * 64, this.regionY * 64 + var4);
		Coord var7 = null;
		if (this.worldMapData_0 != null) {
			var7 = new Coord(this.worldMapData_0.minPlane + var2, var3 + this.worldMapData_0.regionXLow * 4096, var4 + this.worldMapData_0.regionYLow * 64);
		} else {
			WorldMapData_1 var8 = (WorldMapData_1)var5;
			var7 = new Coord(var2 + var8.minPlane, var3 + var8.regionXLow * 4096 + var8.getChunkXLow() * 8, var8.regionYLow * 64 + var4 + var8.getChunkYLow() * 8);
		}

		WorldMapElement var9;
		Object var10;
		if (var1.transforms != null) {
			var10 = new WorldMapIcon_1(var7, var6, var1.id, this);
		} else {
			var9 = Tiles.WorldMapElement_get(var1.mapIconId);
			var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9));
		}

		var9 = Tiles.WorldMapElement_get(((AbstractWorldMapIcon)var10).getElement());
		if (var9.field1904) {
			this.iconMap.put(new Coord(0, var3, var4), var10);
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-26"
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/List;I)V",
		garbageValue = "-1739602138"
	)
	@Export("addAllToIconList")
	void addAllToIconList(List var1) {
		Iterator var2 = var1.iterator();

		while (var2.hasNext()) {
			WorldMapIcon_0 var3 = (WorldMapIcon_0)var2.next();
			if (Tiles.WorldMapElement_get(var3.element).field1904 && var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) {
				WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method5925(var3.element));
				this.icon0List.add(var4);
			}
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-53"
	)
	void method5918() {
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)Z",
		garbageValue = "-1434592807"
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILlv;[Lvy;Lpi;Lpi;D)V"
	)
	@Export("drawTile")
	void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5, double var6) {
		this.pixelsPerTile = var1;
		if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) {
			if (RestClientThreadFactory.method194(this.regionX, this.regionY, var1) == null) {
				if (Rasterizer3D.method4706() != var6) {
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
						var11 = new WorldMapSprite(World.readSpritePixelsFromBytes(var9).pixels);
					}

					SpritePixels var13 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64);
					var13.setRaster();
					if (this.worldMapData_0 != null) {
						this.method5923(var2, var3, var11);
					} else {
						this.method5926(var2, var3, var11);
					}

					int var14 = this.regionX;
					int var15 = this.regionY;
					int var16 = this.pixelsPerTile;
					WorldMapRegion_cachedSprites.put(var13, AsyncRestClient.method165(var14, var15, var16), var13.pixels.length * 4);
					this.method5918();
				}
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/util/HashSet;I)V",
		garbageValue = "-740016616"
	)
	void method5921(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) {
			var4 = new HashSet();
		}

		this.drawNonLinkMapIcons(var1, var2, var4, var3);
		this.drawMapLinks(var1, var2, var4, var3);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "-2036521032"
	)
	@Export("flashElements")
	void flashElements(HashSet var1, int var2, int var3) {
		Iterator var4 = this.iconMap.values().iterator();

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next();
			if (var5.hasValidElement()) {
				int var6 = var5.getElement();
				if (var1.contains(var6)) {
					WorldMapElement var7 = Tiles.WorldMapElement_get(var6);
					this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3);
				}
			}
		}

		this.method5974(var1, var2, var3);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Llv;[Lvy;Llw;B)V",
		garbageValue = "-51"
	)
	void method5923(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		int var4;
		int var5;
		for (var4 = 0; var4 < 64; ++var4) {
			for (var5 = 0; var5 < 64; ++var5) {
				this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3);
				this.method5927(var4, var5, this.worldMapData_0, var1);
			}
		}

		for (var4 = 0; var4 < 64; ++var4) {
			for (var5 = 0; var5 < 64; ++var5) {
				this.method5961(var4, var5, this.worldMapData_0, var1, var2);
			}
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Llv;[Lvy;Llw;B)V",
		garbageValue = "-16"
	)
	void method5926(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		Iterator var4 = this.worldMapData1List.iterator();

		WorldMapData_1 var5;
		int var6;
		int var7;
		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next();

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) {
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) {
					this.drawTileGround(var6, var7, var5, var1, var3);
					this.method5927(var6, var7, var5, var1);
				}
			}
		}

		var4 = this.worldMapData1List.iterator();

		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next();

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) {
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) {
					this.method5961(var6, var7, var5, var1, var2);
				}
			}
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IILlo;Llv;[Lvy;B)V",
		garbageValue = "111"
	)
	void method5961(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
		this.method5987(var1, var2, var3);
		this.method5929(var1, var2, var3, var5);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IILlo;Llv;Llw;I)V",
		garbageValue = "-942391967"
	)
	@Export("drawTileGround")
	void drawTileGround(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, WorldMapSprite var5) {
		int var6 = var3.floorUnderlayIds[0][var1][var2] - 1;
		int var7 = var3.floorOverlayIds[0][var1][var2] - 1;
		if (var6 == -1 && var7 == -1) {
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, this.backgroundColor);
		}

		int var8 = 16711935;
		int var9;
		if (var7 != -1) {
			int var10 = this.backgroundColor;
			FloorOverlayDefinition var11 = class180.method3751(var7);
			if (var11 == null) {
				var9 = var10;
			} else {
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				if (var11.secondaryRgb >= 0) {
					var13 = var11.secondaryHue;
					var14 = var11.secondarySaturation;
					var15 = var11.secondaryLightness;
					if (var15 > 179) {
						var14 /= 2;
					}

					if (var15 > 192) {
						var14 /= 2;
					}

					if (var15 > 217) {
						var14 /= 2;
					}

					if (var15 > 243) {
						var14 /= 2;
					}

					var16 = (var14 / 32 << 7) + var15 / 2 + (var13 / 4 << 10);
					var17 = class27.method402(var16, 96);
					var9 = Rasterizer3D.Rasterizer3D_colorPalette[var17] | -16777216;
				} else if (var11.texture >= 0) {
					int var12 = class27.method402(Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var11.texture), 96);
					var9 = Rasterizer3D.Rasterizer3D_colorPalette[var12] | -16777216;
				} else if (var11.primaryRgb == 16711935) {
					var9 = var10;
				} else {
					var13 = var11.hue;
					var14 = var11.saturation;
					var15 = var11.lightness;
					if (var15 > 179) {
						var14 /= 2;
					}

					if (var15 > 192) {
						var14 /= 2;
					}

					if (var15 > 217) {
						var14 /= 2;
					}

					if (var15 > 243) {
						var14 /= 2;
					}

					var16 = (var14 / 32 << 7) + var15 / 2 + (var13 / 4 << 10);
					var17 = class27.method402(var16, 96);
					var9 = Rasterizer3D.Rasterizer3D_colorPalette[var17] | -16777216;
				}
			}

			var8 = var9;
		}

		if (var7 > -1 && var3.field3211[0][var1][var2] == 0) {
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8);
		} else {
			var9 = this.method5928(var1, var2, var3, var5);
			if (var7 == -1) {
				Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9);
			} else {
				var4.method6334(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field3211[0][var1][var2], var3.field3220[0][var1][var2]);
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IILlo;Llv;I)V",
		garbageValue = "290940661"
	)
	void method5927(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
		for (int var5 = 1; var5 < var3.planes; ++var5) {
			int var6 = var3.floorOverlayIds[var5][var1][var2] - 1;
			if (var6 > -1) {
				int var8 = this.backgroundColor;
				FloorOverlayDefinition var9 = class180.method3751(var6);
				int var7;
				if (var9 == null) {
					var7 = var8;
				} else {
					int var11;
					int var12;
					int var13;
					int var14;
					int var15;
					if (var9.secondaryRgb >= 0) {
						var11 = var9.secondaryHue;
						var12 = var9.secondarySaturation;
						var13 = var9.secondaryLightness;
						if (var13 > 179) {
							var12 /= 2;
						}

						if (var13 > 192) {
							var12 /= 2;
						}

						if (var13 > 217) {
							var12 /= 2;
						}

						if (var13 > 243) {
							var12 /= 2;
						}

						var14 = (var12 / 32 << 7) + var13 / 2 + (var11 / 4 << 10);
						var15 = class27.method402(var14, 96);
						var7 = Rasterizer3D.Rasterizer3D_colorPalette[var15] | -16777216;
					} else if (var9.texture >= 0) {
						int var10 = class27.method402(Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var9.texture), 96);
						var7 = Rasterizer3D.Rasterizer3D_colorPalette[var10] | -16777216;
					} else if (var9.primaryRgb == 16711935) {
						var7 = var8;
					} else {
						var11 = var9.hue;
						var12 = var9.saturation;
						var13 = var9.lightness;
						if (var13 > 179) {
							var12 /= 2;
						}

						if (var13 > 192) {
							var12 /= 2;
						}

						if (var13 > 217) {
							var12 /= 2;
						}

						if (var13 > 243) {
							var12 /= 2;
						}

						var14 = (var12 / 32 << 7) + var13 / 2 + (var11 / 4 << 10);
						var15 = class27.method402(var14, 96);
						var7 = Rasterizer3D.Rasterizer3D_colorPalette[var15] | -16777216;
					}
				}

				if (var3.field3211[var5][var1][var2] == 0) {
					Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7);
				} else {
					var4.method6334(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field3211[var5][var1][var2], var3.field3220[var5][var1][var2]);
				}
			}
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IILlo;Llw;I)I",
		garbageValue = "145556795"
	)
	int method5928(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
		return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IILlo;[Lvy;I)V",
		garbageValue = "-1273235228"
	)
	void method5929(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
		for (int var5 = 0; var5 < var3.planes; ++var5) {
			WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2];
			if (var6 != null && var6.length != 0) {
				WorldMapDecoration[] var7 = var6;

				for (int var8 = 0; var8 < var7.length; ++var8) {
					WorldMapDecoration var9 = var7[var8];
					int var11 = var9.decoration;
					boolean var10 = var11 >= WorldMapDecorationType.field4068.id && var11 <= WorldMapDecorationType.field4049.id;
					int var13;
					if (!var10) {
						var13 = var9.decoration;
						boolean var12 = var13 == WorldMapDecorationType.field4070.id;
						if (!var12) {
							continue;
						}
					}

					ObjectComposition var14 = HttpMethod.getObjectDefinition(var9.objectDefinitionId);
					if (var14.mapSceneId != -1) {
						var13 = var9.rotation != 1 && var9.rotation != 3 ? var14.sizeY : var14.sizeX;
						var4[var14.mapSceneId].method10548(this.pixelsPerTile * var1, this.pixelsPerTile * (64 - var13 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2);
					}
				}
			}
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IILlo;I)V",
		garbageValue = "-1222261406"
	)
	void method5987(int var1, int var2, AbstractWorldMapData var3) {
		for (int var4 = 0; var4 < var3.planes; ++var4) {
			WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2];
			if (var5 != null && var5.length != 0) {
				WorldMapDecoration[] var6 = var5;

				for (int var7 = 0; var7 < var6.length; ++var7) {
					WorldMapDecoration var8 = var6[var7];
					if (WorldView.method2874(var8.decoration)) {
						ObjectComposition var9 = HttpMethod.getObjectDefinition(var8.objectDefinitionId);
						int var10 = var9.int1 != 0 ? -3407872 : -3355444;
						if (var8.decoration == WorldMapDecorationType.field4050.id) {
							this.method6011(var1, var2, var8.rotation, var10);
						}

						if (var8.decoration == WorldMapDecorationType.field4067.id) {
							this.method6011(var1, var2, var8.rotation, -3355444);
							this.method6011(var1, var2, var8.rotation + 1, var10);
						}

						if (var8.decoration == WorldMapDecorationType.field4051.id) {
							if (var8.rotation == 0) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var10);
							}

							if (var8.rotation == 1) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2), 1, var10);
							}

							if (var8.rotation == 2) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}

							if (var8.rotation == 3) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}
						}

						if (var8.decoration == WorldMapDecorationType.field4052.id) {
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;II)V",
		garbageValue = "-1302055781"
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
				WorldMapElement var13 = Tiles.WorldMapElement_get(var12.getElement());
				if (!var3.contains(var13.getObjectId())) {
					this.method5933(var12, var10, var11, var5);
				}
			}
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "1060559861"
	)
	void method5974(HashSet var1, int var2, int var3) {
		Iterator var4 = this.icon0List.iterator();

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next();
			if (var5.hasValidElement()) {
				WorldMapElement var6 = Tiles.WorldMapElement_get(var5.getElement());
				if (var6 != null && var1.contains(var6.getObjectId())) {
					this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3);
				}
			}
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lhi;IIIII)V",
		garbageValue = "-2023778236"
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

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Llh;IIFB)V",
		garbageValue = "103"
	)
	void method5933(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
		WorldMapElement var5 = Tiles.WorldMapElement_get(var1.getElement());
		this.method5934(var5, var2, var3);
		this.method5935(var1, var5, var2, var3, var4);
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Lhi;III)V",
		garbageValue = "406222471"
	)
	void method5934(WorldMapElement var1, int var2, int var3) {
		SpritePixels var4 = var1.getSpriteBool(false);
		if (var4 != null) {
			int var5 = this.method5932(var4, var1.horizontalAlignment);
			int var6 = this.method5938(var4, var1.verticalAlignment);
			var4.drawTransBgAt(var5 + var2, var3 + var6);
		}

	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Llh;Lhi;IIFI)V",
		garbageValue = "-1369357175"
	)
	void method5935(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
		WorldMapLabel var6 = var1.getLabel();
		if (var6 != null) {
			if (var6.size.method5787(var5)) {
				Font var7 = (Font)this.fonts.get(var6.size);
				var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field1905, 0, 1, 0, var7.ascent / 2);
			}
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;II)V",
		garbageValue = "-985213580"
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
				var7.screenX = (int)((float)var8 * var5 + (float)var1);
				var7.screenY = (int)(var5 * (float)(63 - var9) + (float)var2);
				if (!var3.contains(var7.getElement())) {
					this.method5933(var7, var7.screenX, var7.screenY, var5);
				}
			}
		}

	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lvr;Lhf;B)I",
		garbageValue = "-75"
	)
	int method5932(SpritePixels var1, HorizontalAlignment var2) {
		switch(var2.value) {
		case 0:
			return 0;
		case 2:
			return -var1.subWidth / 2;
		default:
			return -var1.subWidth;
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Lvr;Lha;I)I",
		garbageValue = "1099362771"
	)
	int method5938(SpritePixels var1, VerticalAlignment var2) {
		switch(var2.value) {
		case 0:
			return -var1.subHeight / 2;
		case 1:
			return 0;
		default:
			return -var1.subHeight;
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(II)Lln;",
		garbageValue = "672428564"
	)
	WorldMapLabel method5925(int var1) {
		WorldMapElement var2 = Tiles.WorldMapElement_get(var1);
		return this.createMapLabel(var2);
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Lhi;I)Lln;",
		garbageValue = "-1255860469"
	)
	@Export("createMapLabel")
	WorldMapLabel createMapLabel(WorldMapElement var1) {
		if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) {
			int var3 = var1.textSize;
			WorldMapLabelSize[] var4 = WorldMapLabelSize.method5790();
			int var5 = 0;

			WorldMapLabelSize var2;
			while (true) {
				if (var5 >= var4.length) {
					var2 = null;
					break;
				}

				WorldMapLabelSize var6 = var4[var5];
				if (var3 == var6.field3093) {
					var2 = var6;
					break;
				}

				++var5;
			}

			if (var2 == null) {
				return null;
			} else {
				Font var14 = (Font)this.fonts.get(var2);
				if (var14 == null) {
					return null;
				} else {
					int var15 = var14.lineCount(var1.name, 1000000);
					String[] var7 = new String[var15];
					var14.breakLines(var1.name, (int[])null, var7);
					int var8 = var7.length * var14.ascent / 2;
					int var9 = 0;
					String[] var10 = var7;

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

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)Ljava/util/List;",
		garbageValue = "861381816"
	)
	List method5941(int var1, int var2, int var3, int var4, int var5) {
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

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/List;",
		garbageValue = "60"
	)
	@Export("icons")
	List icons() {
		LinkedList var1 = new LinkedList();
		var1.addAll(this.icon0List);
		var1.addAll(this.iconMap.values());
		return var1;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-785419748"
	)
	void method6011(int var1, int var2, int var3, int var4) {
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

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "-2004646555"
	)
	static int method6041(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.LOGOUT) {
			Client.logoutTimer = 250;
			return 1;
		} else {
			return 2;
		}
	}
}
