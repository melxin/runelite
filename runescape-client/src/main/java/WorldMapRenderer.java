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

@ObfuscatedName("je")
@Implements("WorldMapRenderer")
public final class WorldMapRenderer {
   @ObfuscatedName("at")
   @Export("loaded")
   boolean loaded = false;
   @ObfuscatedName("an")
   @Export("loadStarted")
   boolean loadStarted = false;
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lkn;"
   )
   @Export("mapAreaData")
   WorldMapAreaData mapAreaData;
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Ltm;"
   )
   @Export("compositeTextureSprite")
   SpritePixels compositeTextureSprite;
   @ObfuscatedName("ax")
   @Export("icons")
   HashMap icons;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "[[Ljm;"
   )
   @Export("regions")
   WorldMapRegion[][] regions;
   @ObfuscatedName("ab")
   @Export("scaleHandlers")
   HashMap scaleHandlers = new HashMap();
   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "[Ltj;"
   )
   @Export("mapSceneSprites")
   IndexedSprite[] mapSceneSprites;
   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "Lnq;"
   )
   @Export("geographyArchive")
   final AbstractArchive geographyArchive;
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lnq;"
   )
   @Export("groundArchive")
   final AbstractArchive groundArchive;
   @ObfuscatedName("ao")
   @Export("fonts")
   final HashMap fonts;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -1050160831
   )
   @Export("tileX")
   int tileX;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -1009695589
   )
   @Export("tileY")
   int tileY;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = 1929813015
   )
   @Export("tileWidth")
   int tileWidth;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1927991488
   )
   @Export("tileHeight")
   int tileHeight;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = -696394689
   )
   @Export("pixelsPerTile")
   public int pixelsPerTile = 0;

   @ObfuscatedSignature(
      descriptor = "([Ltj;Ljava/util/HashMap;Lnq;Lnq;)V"
   )
   public WorldMapRenderer(IndexedSprite[] var1, HashMap var2, AbstractArchive var3, AbstractArchive var4) {
      this.mapSceneSprites = var1;
      this.fonts = var2;
      this.geographyArchive = var3;
      this.groundArchive = var4;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lnq;Ljava/lang/String;ZI)V",
      garbageValue = "-1541666643"
   )
   @Export("load")
   public void load(AbstractArchive var1, String var2, boolean var3) {
      if (!this.loadStarted) {
         this.loaded = false;
         this.loadStarted = true;
         System.nanoTime();
         int var4 = var1.getGroupId(WorldMapCacheName.field3049.name);
         int var5 = var1.getFileId(var4, var2);
         Buffer var6 = new Buffer(var1.takeFileByNames(WorldMapCacheName.field3049.name, var2));
         Buffer var7 = new Buffer(var1.takeFileByNames(WorldMapCacheName.field3044.name, var2));
         System.nanoTime();
         System.nanoTime();
         this.mapAreaData = new WorldMapAreaData();

         try {
            this.mapAreaData.init(var6, var7, var5, var3);
         } catch (IllegalStateException var19) {
            return;
         }

         this.mapAreaData.getOriginX();
         this.mapAreaData.getOriginPlane();
         this.mapAreaData.getOriginY();
         this.tileX = this.mapAreaData.getRegionLowX() * 64;
         this.tileY = this.mapAreaData.getRegionLowY() * 64;
         this.tileWidth = (this.mapAreaData.getRegionHighX() - this.mapAreaData.getRegionLowX() + 1) * 64;
         this.tileHeight = (this.mapAreaData.getRegionHighY() - this.mapAreaData.getRegionLowY() + 1) * 4096;
         int var16 = this.mapAreaData.getRegionHighX() - this.mapAreaData.getRegionLowX() + 1;
         int var9 = this.mapAreaData.getRegionHighY() - this.mapAreaData.getRegionLowY() + 1;
         System.nanoTime();
         System.nanoTime();
         WorldMapRegion.WorldMapRegion_cachedSprites.clear();
         this.regions = new WorldMapRegion[var16][var9];
         Iterator var10 = this.mapAreaData.worldMapData0Set.iterator();

         while(var10.hasNext()) {
            WorldMapData_0 var11 = (WorldMapData_0)var10.next();
            int var12 = var11.regionX;
            int var13 = var11.regionY;
            int var14 = var12 - this.mapAreaData.getRegionLowX();
            int var15 = var13 - this.mapAreaData.getRegionLowY();
            this.regions[var14][var15] = new WorldMapRegion(var12, var13, this.mapAreaData.getBackGroundColor(), this.fonts);
            this.regions[var14][var15].initWorldMapData0(var11, this.mapAreaData.iconList);
         }

         for(int var17 = 0; var17 < var16; ++var17) {
            for(int var18 = 0; var18 < var9; ++var18) {
               if (this.regions[var17][var18] == null) {
                  this.regions[var17][var18] = new WorldMapRegion(this.mapAreaData.getRegionLowX() + var17, this.mapAreaData.getRegionLowY() + var18, this.mapAreaData.getBackGroundColor(), this.fonts);
                  this.regions[var17][var18].initWorldMapData1(this.mapAreaData.worldMapData1Set, this.mapAreaData.iconList);
               }
            }
         }

         System.nanoTime();
         System.nanoTime();
         if (var1.isValidFileName(WorldMapCacheName.field3045.name, var2)) {
            byte[] var20 = var1.takeFileByNames(WorldMapCacheName.field3045.name, var2);
            this.compositeTextureSprite = Interpreter.method2032(var20);
         }

         System.nanoTime();
         var1.clearGroups();
         var1.clearFiles();
         this.loaded = true;
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "998342198"
   )
   @Export("clearIcons")
   public final void clearIcons() {
      this.icons = null;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIIII)V",
      garbageValue = "1274316959"
   )
   @Export("drawTiles")
   public final void drawTiles(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int[] var9 = Rasterizer2D.Rasterizer2D_pixels;
      int var10 = Rasterizer2D.Rasterizer2D_width;
      int var11 = Rasterizer2D.Rasterizer2D_height;
      float[] var12 = Rasterizer2D.field5088;
      int[] var13 = new int[4];
      Rasterizer2D.Rasterizer2D_getClipArray(var13);
      WorldMapRectangle var14 = this.createWorldMapRectangle(var1, var2, var3, var4);
      float var15 = this.getPixelsPerTile(var7 - var5, var3 - var1);
      int var16 = (int)Math.ceil((double)var15);
      this.pixelsPerTile = var16;
      if (!this.scaleHandlers.containsKey(var16)) {
         WorldMapScaleHandler var17 = new WorldMapScaleHandler(var16);
         var17.init();
         this.scaleHandlers.put(var16, var17);
      }

      int var24 = var14.x + var14.width - 1;
      int var18 = var14.height + var14.y - 1;

      int var19;
      int var20;
      for(var19 = var14.x; var19 <= var24; ++var19) {
         for(var20 = var14.y; var20 <= var18; ++var20) {
            this.regions[var19][var20].drawTile(var16, (WorldMapScaleHandler)this.scaleHandlers.get(var16), this.mapSceneSprites, this.geographyArchive, this.groundArchive);
         }
      }

      Rasterizer3D.method4383(var9, var10, var11, var12);
      Rasterizer2D.Rasterizer2D_setClipArray(var13);
      var19 = (int)(var15 * 64.0F);
      var20 = this.tileX * 4096 + var1;
      int var21 = this.tileY * 4096 + var2;

      for(int var22 = var14.x; var22 < var14.width + var14.x; ++var22) {
         for(int var23 = var14.y; var23 < var14.height + var14.y; ++var23) {
            this.regions[var22][var23].method5173(var5 + var19 * (this.regions[var22][var23].regionX * 64 - var20) / 64, var8 - var19 * (this.regions[var22][var23].regionY * 64 - var21 + 64) / 64, var19);
         }
      }

   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZB)V",
      garbageValue = "72"
   )
   @Export("drawElements")
   public final void drawElements(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
      WorldMapRectangle var14 = this.createWorldMapRectangle(var1, var2, var3, var4);
      float var15 = this.getPixelsPerTile(var7 - var5, var3 - var1);
      int var16 = (int)(var15 * 64.0F);
      int var17 = this.tileX * 4096 + var1;
      int var18 = this.tileY * 4096 + var2;

      int var19;
      int var20;
      for(var19 = var14.x; var19 < var14.width + var14.x; ++var19) {
         for(var20 = var14.y; var20 < var14.y + var14.height; ++var20) {
            if (var13) {
               this.regions[var19][var20].initWorldMapIcon1s();
            }

            this.regions[var19][var20].method5274(var5 + var16 * (this.regions[var19][var20].regionX * 64 - var17) / 64, var8 - var16 * (this.regions[var19][var20].regionY * 64 - var18 + 64) / 64, var16, var9);
         }
      }

      if (var10 != null && var11 > 0) {
         for(var19 = var14.x; var19 < var14.width + var14.x; ++var19) {
            for(var20 = var14.y; var20 < var14.y + var14.height; ++var20) {
               this.regions[var19][var20].flashElements(var10, var11, var12);
            }
         }
      }

   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(IIIILjava/util/HashSet;IIB)V",
      garbageValue = "96"
   )
   @Export("drawOverview")
   public void drawOverview(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
      if (this.compositeTextureSprite != null) {
         this.compositeTextureSprite.drawScaledAt(var1, var2, var3, var4);
         if (var6 > 0 && var6 % var7 < var7 / 2) {
            if (this.icons == null) {
               this.buildIcons0();
            }

            Iterator var8 = var5.iterator();

            while(true) {
               List var10;
               do {
                  if (!var8.hasNext()) {
                     return;
                  }

                  int var9 = (Integer)var8.next();
                  var10 = (List)this.icons.get(var9);
               } while(var10 == null);

               Iterator var11 = var10.iterator();

               while(var11.hasNext()) {
                  AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var11.next();
                  int var13 = var3 * (var12.coord2.x - this.tileX * 4096) / (this.tileWidth * 4096);
                  int var14 = var4 - (var12.coord2.y - this.tileY * 4096) * var4 / (this.tileHeight * 64);
                  Rasterizer2D.Rasterizer2D_drawCircleAlpha(var13 + var1, var14 + var2, 2, 16776960, 256);
               }
            }
         }
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIIIIII)Ljava/util/List;",
      garbageValue = "1632829170"
   )
   public List method5319(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      LinkedList var11 = new LinkedList();
      if (!this.loaded) {
         return var11;
      } else {
         WorldMapRectangle var12 = this.createWorldMapRectangle(var1, var2, var3, var4);
         float var13 = this.getPixelsPerTile(var7, var3 - var1);
         int var14 = (int)(var13 * 64.0F);
         int var15 = this.tileX * 4096 + var1;
         int var16 = this.tileY * 4096 + var2;

         for(int var17 = var12.x; var17 < var12.width + var12.x; ++var17) {
            for(int var18 = var12.y; var18 < var12.y + var12.height; ++var18) {
               List var19 = this.regions[var17][var18].method5204(var5 + var14 * (this.regions[var17][var18].regionX * 64 - var15) / 64, var8 + var6 - var14 * (this.regions[var17][var18].regionY * 64 - var16 + 64) / 64, var14, var9, var10);
               if (!var19.isEmpty()) {
                  var11.addAll(var19);
               }
            }
         }

         return var11;
      }
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(IIIII)Lkx;",
      garbageValue = "-915264018"
   )
   @Export("createWorldMapRectangle")
   WorldMapRectangle createWorldMapRectangle(int var1, int var2, int var3, int var4) {
      WorldMapRectangle var5 = new WorldMapRectangle(this);
      int var6 = this.tileX * 4096 + var1;
      int var7 = this.tileY * 4096 + var2;
      int var8 = var3 + this.tileX * 4096;
      int var9 = this.tileY * 4096 + var4;
      int var10 = var6 / 64;
      int var11 = var7 / 64;
      int var12 = var8 / 64;
      int var13 = var9 / 64;
      var5.width = var12 - var10 + 1;
      var5.height = var13 - var11 + 1;
      var5.x = var10 - this.mapAreaData.getRegionLowX();
      var5.y = var11 - this.mapAreaData.getRegionLowY();
      if (var5.x < 0) {
         var5.width += var5.x;
         var5.x = 0;
      }

      if (var5.x > this.regions.length - var5.width) {
         var5.width = this.regions.length - var5.x;
      }

      if (var5.y < 0) {
         var5.height += var5.y;
         var5.y = 0;
      }

      if (var5.y > this.regions[0].length - var5.height) {
         var5.height = this.regions[0].length - var5.y;
      }

      var5.width = Math.min(var5.width, this.regions.length);
      var5.height = Math.min(var5.height, this.regions[0].length);
      return var5;
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1192890553"
   )
   @Export("isLoaded")
   public boolean isLoaded() {
      return this.loaded;
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/util/HashMap;",
      garbageValue = "2110344719"
   )
   @Export("buildIcons")
   public HashMap buildIcons() {
      this.buildIcons0();
      return this.icons;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "24"
   )
   @Export("buildIcons0")
   void buildIcons0() {
      if (this.icons == null) {
         this.icons = new HashMap();
      }

      this.icons.clear();

      for(int var1 = 0; var1 < this.regions.length; ++var1) {
         for(int var2 = 0; var2 < this.regions[var1].length; ++var2) {
            List var3 = this.regions[var1][var2].icons();
            Iterator var4 = var3.iterator();

            while(var4.hasNext()) {
               AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next();
               if (var5.hasValidElement()) {
                  int var6 = var5.getElement();
                  if (!this.icons.containsKey(var6)) {
                     LinkedList var7 = new LinkedList();
                     var7.add(var5);
                     this.icons.put(var6, var7);
                  } else {
                     List var8 = (List)this.icons.get(var6);
                     var8.add(var5);
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(IIB)F",
      garbageValue = "-7"
   )
   @Export("getPixelsPerTile")
   float getPixelsPerTile(int var1, int var2) {
      float var3 = (float)var1 / (float)var2;
      if (var3 > 8.0F) {
         return 8.0F;
      } else if (var3 < 1.0F) {
         return 1.0F;
      } else {
         int var4 = Math.round(var3);
         return Math.abs((float)var4 - var3) < 0.05F ? (float)var4 : var3;
      }
   }
}
