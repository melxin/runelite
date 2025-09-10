import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hi")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("HealthBarDefinition_archive")
	static AbstractArchive HealthBarDefinition_archive;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	static AbstractArchive field2039;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("HealthBarDefinition_cached")
	static EvictingDualNodeHashTable HealthBarDefinition_cached;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("HealthBarDefinition_cachedSprites")
	static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites;
	@ObfuscatedName("lt")
	@ObfuscatedGetter(
		intValue = -915910047
	)
	@Export("cameraX")
	static int cameraX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1314996873
	)
	public int field2042;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 2090325649
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1125424573
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1796499015
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -865076841
	)
	public int field2046;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1968747049
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1248285335
	)
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 59520525
	)
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 682173989
	)
	@Export("width")
	public int width;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -548856825
	)
	@Export("widthPadding")
	public int widthPadding;

	static {
		HealthBarDefinition_cached = new EvictingDualNodeHashTable(64);
		HealthBarDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
	}

	HealthBarDefinition() {
		this.int1 = 255;
		this.int2 = 255;
		this.int3 = -1;
		this.field2046 = 1;
		this.int5 = 70;
		this.frontSpriteID = -1;
		this.backSpriteID = -1;
		this.width = 30;
		this.widthPadding = 0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lwb;I)V",
		garbageValue = "-2088254435"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lwb;II)V",
		garbageValue = "-236442452"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			var1.readUnsignedShort();
		} else if (var2 == 2) {
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 3) {
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 4) {
			this.int3 = 0;
		} else if (var2 == 5) {
			this.int5 = var1.readUnsignedShort();
		} else if (var2 == 6) {
			var1.readUnsignedByte();
		} else if (var2 == 7) {
			this.frontSpriteID = var1.readNullableLargeSmart();
		} else if (var2 == 8) {
			this.backSpriteID = var1.readNullableLargeSmart();
		} else if (var2 == 11) {
			this.int3 = var1.readUnsignedShort();
		} else if (var2 == 14) {
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) {
			this.widthPadding = var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Lxt;",
		garbageValue = "548633291"
	)
	@Export("getFrontSprite")
	public SpritePixels getFrontSprite() {
		if (this.frontSpriteID < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.frontSpriteID);
			if (var1 != null) {
				return var1;
			} else {
				var1 = SoundCache.SpriteBuffer_getSprite(field2039, this.frontSpriteID, 0);
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.frontSpriteID);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lxt;",
		garbageValue = "-1730060620"
	)
	@Export("getBackSprite")
	public SpritePixels getBackSprite() {
		if (this.backSpriteID < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.backSpriteID);
			if (var1 != null) {
				return var1;
			} else {
				var1 = SoundCache.SpriteBuffer_getSprite(field2039, this.backSpriteID, 0);
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.backSpriteID);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZIII)Lxt;",
		garbageValue = "-1997595539"
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

		long var8 = ((long)var3 << 42) + ((long)var2 << 38) + ((long)var1 << 16) + (long)var0 + ((long)var4 << 40);
		SpritePixels var10;
		if (!var5 && var6 == 36 && var7 == 32) {
			var10 = (SpritePixels)ItemComposition.ItemDefinition_cachedSprites.get(var8);
			if (var10 != null) {
				return var10;
			}
		}

		ItemComposition var11 = AttackOption.ItemDefinition_get(var0);
		if (var1 > 1 && var11.countobj != null) {
			int var12 = -1;

			for (int var13 = 0; var13 < 10; ++var13) {
				if (var1 >= var11.countco[var13] && var11.countco[var13] != 0) {
					var12 = var11.countobj[var13];
				}
			}

			if (var12 != -1) {
				var11 = AttackOption.ItemDefinition_get(var12);
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
			Rasterizer3D.method4941(var10.pixels, var6, var7, (float[])null);
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
				var20 = (int)((double)var20 * 1.04D);
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

			Rasterizer3D.method4941(var10.pixels, var6, var7, (float[])null);
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

			Rasterizer3D.method4941(var14, var15, var16, var17);
			Rasterizer2D.Rasterizer2D_setClipArray(var18);
			Rasterizer3D.resetRasterClipping();
			Rasterizer3D.clips.rasterGouraudLowRes = true;
			return var10;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "360543412"
	)
	static final int method4259() {
		return ViewportMouse.ViewportMouse_x;
	}
}
