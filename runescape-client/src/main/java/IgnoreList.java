import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sy")
@Implements("IgnoreList")
public class IgnoreList extends UserList {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	final LoginType field5263;

	@ObfuscatedSignature(
		descriptor = "(Lvy;)V"
	)
	public IgnoreList(LoginType var1) {
		super(400);
		this.field5263 = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Ltb;",
		garbageValue = "0"
	)
	@Export("newInstance")
	User newInstance() {
		return new Ignored();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)[Ltb;",
		garbageValue = "-4"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new Ignored[var1];
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lwj;II)V",
		garbageValue = "52953698"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		while (var1.offset < var2) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 4) {
				Username var10 = new Username(var1.readStringCp1252NullTerminated(), this.field5263);
				if (!var10.hasCleanName()) {
					throw new IllegalStateException();
				}

				boolean var11 = false;
				class137.friendSystem.removeIgnore(var10.getName(), var11);
			} else {
				boolean var4 = (var3 & 1) != 0;
				Username var5 = new Username(var1.readStringCp1252NullTerminated(), this.field5263);
				Username var6 = new Username(var1.readStringCp1252NullTerminated(), this.field5263);
				var1.readStringCp1252NullTerminated();
				if (!var5.hasCleanName()) {
					throw new IllegalStateException();
				}

				Ignored var7 = (Ignored)this.getByCurrentUsername(var5);
				if (var4) {
					Ignored var8 = (Ignored)this.getByCurrentUsername(var6);
					if (var8 != null && var8 != var7) {
						if (var7 != null) {
							this.remove(var8);
						} else {
							var7 = var8;
						}
					}
				}

				if (var7 != null) {
					this.changeName(var7, var5, var6);
				} else if (this.getSize() < 400) {
					int var9 = this.getSize();
					var7 = (Ignored)this.addLast(var5, var6);
					var7.id = var9;
				}
			}
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZIIB)Lxv;",
		garbageValue = "53"
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

		long var8 = ((long)var3 << 42) + ((long)var4 << 40) + (long)var0 + ((long)var1 << 16) + ((long)var2 << 38);
		SpritePixels var10;
		if (!var5 && var6 == 36 && var7 == 32) {
			var10 = (SpritePixels)ItemComposition.ItemDefinition_cachedSprites.get(var8);
			if (var10 != null) {
				return var10;
			}
		}

		ItemComposition var11 = ObjectComposition.ItemDefinition_get(var0);
		if (var1 > 1 && var11.countobj != null) {
			int var12 = -1;

			for (int var13 = 0; var13 < 10; ++var13) {
				if (var1 >= var11.countco[var13] && var11.countco[var13] != 0) {
					var12 = var11.countobj[var13];
				}
			}

			if (var12 != -1) {
				var11 = ObjectComposition.ItemDefinition_get(var12);
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
				Font var23 = WidgetConfigNode.ItemDefinition_fontPlain11;
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
}
