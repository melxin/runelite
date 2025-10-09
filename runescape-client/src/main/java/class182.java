import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hm")
public class class182 extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("field1864")
	public static EvictingDualNodeHashTable field1864;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -1993568005
	)
	static int field1981;

	static {
		field1864 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZIII)Lxl;",
		garbageValue = "-2130133535"
	)
	@Export("getItemSprite")
	public static final SpritePixels getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5, int var6, int var7) {
		if (var6 == 36 && var7 == 32) {
			if (var1 == -1) {
				var4 = 0;
			} else if (var4 == 2 && var1 != 1) {
				var4 = 1;
			}
		} else {
			var4 = 0;
		}

		long var8 = ((long)var3 << 42) + ((long)var2 << 38) + (long)var0 + ((long)var1 << 16) + ((long)var4 << 40);
		SpritePixels var10;
		if (!var5 && var6 == 36 && var7 == 32) {
			var10 = (SpritePixels)ItemComposition.ItemDefinition_cachedSprites.get(var8);
			if (var10 != null) {
				return var10;
			}
		}

		ItemComposition var11 = WorldMapIcon_1.ItemDefinition_get(var0);
		if (var1 > 1 && var11.countobj != null) {
			int var12 = -1;

			for (int var13 = 0; var13 < 10; ++var13) {
				if (var1 >= var11.countco[var13] && var11.countco[var13] != 0) {
					var12 = var11.countobj[var13];
				}
			}

			if (var12 != -1) {
				var11 = WorldMapIcon_1.ItemDefinition_get(var12);
			}
		}

		Model var25 = var11.getModel(1);
		if (var25 == null) {
			return null;
		} else {
			SpritePixels var26 = null;
			if (var11.noteTemplate != -1) {
				var26 = getItemSprite(var11.note, 10, 1, 0, 0, true, var6, var7);
				if (var26 == null) {
					return null;
				}
			} else if (var11.notedId != -1) {
				var26 = getItemSprite(var11.unnotedId, var1, var2, var3, 0, false, var6, var7);
				if (var26 == null) {
					return null;
				}
			} else if (var11.placeholderTemplate != -1) {
				var26 = getItemSprite(var11.placeholder, var1, 0, 0, 0, false, var6, var7);
				if (var26 == null) {
					return null;
				}
			}

			int[] var14 = Rasterizer2D.Rasterizer2D_pixels;
			int var15 = Rasterizer2D.Rasterizer2D_width;
			int var16 = Rasterizer2D.Rasterizer2D_height;
			float[] var17 = Rasterizer2D.Rasterizer2D_brightness;
			int[] var18 = new int[4];
			Rasterizer2D.Rasterizer2D_getClipArray(var18);
			var10 = new SpritePixels(var6, var7);
			Rasterizer3D.method5057(var10.pixels, var6, var7, (float[])null);
			Rasterizer2D.Rasterizer2D_clear();
			Rasterizer3D.resetRasterClipping();
			int var19 = var7 >> 1;
			Rasterizer3D.setCustomClipBounds(var19, var19);
			Rasterizer3D.clips.rasterGouraudLowRes = false;
			if (var11.placeholderTemplate != -1) {
				var26.drawTransBgAt(0, 0);
			}

			int var20 = var11.zoom2d;
			if (var6 != 36) {
				var20 = var20 * 32 / var6;
			}

			if (var5) {
				var20 = (int)((double)var20 * 1.5D);
			} else if (var2 == 2) {
				var20 = (int)(1.04D * (double)var20);
			}

			int var21 = var20 * Rasterizer3D.Rasterizer3D_sine[var11.xan2d] >> 16;
			int var22 = var20 * Rasterizer3D.Rasterizer3D_cosine[var11.xan2d] >> 16;
			var25.calculateBoundsCylinder();
			var25.drawFrustum(0, var11.yan2d, var11.zan2d, var11.xan2d, var11.offsetX2d, var25.height / 2 + var21 + var11.offsetY2d, var22 + var11.offsetY2d);
			if (var11.notedId != -1) {
				var26.drawTransBgAt(0, 0);
			}

			if (var2 >= 1) {
				var10.outline(1);
			}

			if (var2 >= 2) {
				var10.outline(16777215);
			}

			if (var3 != 0) {
				var10.shadow(var3);
			}

			Rasterizer3D.method5057(var10.pixels, var6, var7, (float[])null);
			if (var11.noteTemplate != -1) {
				var26.drawTransBgAt(0, 0);
			}

			if (var4 == 1 || var4 == 2 && var11.isStackable == 1) {
				Font var23 = ItemComposition.ItemDefinition_fontPlain11;
				String var24;
				if (var1 < 100000) {
					var24 = "<col=ffff00>" + var1 + "</col>";
				} else if (var1 < 10000000) {
					var24 = "<col=ffffff>" + var1 / 1000 + "K" + "</col>";
				} else {
					var24 = "<col=00ff80>" + var1 / 1000000 + "M" + "</col>";
				}

				var23.draw(var24, 0, 9, 16776960, 1);
			}

			if (!var5 && var6 == 36 && var7 == 32) {
				ItemComposition.ItemDefinition_cachedSprites.put(var10, var8);
			}

			Rasterizer3D.method5057(var14, var15, var16, var17);
			Rasterizer2D.Rasterizer2D_setClipArray(var18);
			Rasterizer3D.resetRasterClipping();
			Rasterizer3D.clips.rasterGouraudLowRes = true;
			return var10;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lkg;Lwq;B)Lra;",
		garbageValue = "-24"
	)
	public static Bounds method4229(WorldEntityCoord var0, class584 var1) {
		int var2 = var1.field5960;
		int var3 = var1.field5965;
		int var4 = var1.field5962;
		int var5 = var1.field5963;
		int var6 = var0.getCurrentRotationAngle();
		int var7 = var0.getX();
		int var8 = var0.getY();
		double var9 = class258.method5937(var6);
		double var11 = (double)class267.method6053(var6) / 65536.0D;
		int var15 = (int)((double)var2 * var9 - var11 * (double)var3);
		int var16 = (int)((double)var3 * var9 + var11 * (double)var2);
		var7 += var15;
		var8 += var16;
		int var17 = (int)((double)var4 * var9 - var11 * (double)var5);
		int var18 = (int)((double)var5 * var9 + (double)var4 * var11);
		int var19 = (int)((double)var4 * var9 + (double)var5 * var11);
		int var20 = (int)((double)var5 * var9 - (double)var4 * var11);
		int var21 = var7 - var17;
		int var22 = var18 + var8;
		int var23 = var7 + var19;
		int var24 = var8 + var20;
		int var25 = var17 + var7;
		int var26 = var8 - var18;
		int var27 = var7 - var19;
		int var28 = var8 - var20;
		int var29 = Math.min(var21, Math.min(var23, Math.min(var25, var27)));
		int var30 = Math.max(var21, Math.max(var23, Math.max(var25, var27)));
		int var31 = Math.min(var22, Math.min(var24, Math.min(var26, var28)));
		int var32 = Math.max(var22, Math.max(var24, Math.max(var26, var28)));
		int var34 = var30 - var29 + 1;
		int var35 = var32 - var31 + 1;
		synchronized(Bounds.field5201) {
			Bounds var33;
			if (Bounds.field5200 == 0) {
				var33 = new Bounds(var29, var31, var34, var35);
			} else {
				--Bounds.field5200;
				Bounds.field5201[Bounds.field5200].setLow(var29, var31);
				Bounds.field5201[Bounds.field5200].setHigh(var34, var35);
				var33 = Bounds.field5201[Bounds.field5200];
			}

			return var33;
		}
	}
}
