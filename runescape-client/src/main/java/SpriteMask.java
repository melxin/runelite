import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nu")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -964726337
	)
	@Export("width")
	public final int width;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1418256767
	)
	@Export("height")
	public final int height;
	@ObfuscatedName("ac")
	@Export("xWidths")
	public final int[] xWidths;
	@ObfuscatedName("av")
	@Export("xStarts")
	public final int[] xStarts;

	SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.width = var1;
		this.height = var2;
		this.xWidths = var3;
		this.xStarts = var4;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-79"
	)
	@Export("contains")
	public boolean contains(int var1, int var2) {
		if (var2 >= 0 && var2 < this.xStarts.length) {
			int var3 = this.xStarts[var2];
			if (var1 >= var3 && var1 <= var3 + this.xWidths[var2]) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-78"
	)
	static int method7371(int var0, int var1) {
		FloorOverlayDefinition var2 = JagNetThread.method8476(var0);
		if (var2 == null) {
			return var1;
		} else {
			int var4;
			int var5;
			int var6;
			int var7;
			int var8;
			if (var2.secondaryRgb >= 0) {
				var4 = var2.secondaryHue;
				var5 = var2.secondarySaturation;
				var6 = var2.secondaryLightness;
				if (var6 > 179) {
					var5 /= 2;
				}

				if (var6 > 192) {
					var5 /= 2;
				}

				if (var6 > 217) {
					var5 /= 2;
				}

				if (var6 > 243) {
					var5 /= 2;
				}

				var7 = (var5 / 32 << 7) + var6 / 2 + (var4 / 4 << 10);
				var8 = Varcs.method2870(var7, 96);
				return Rasterizer3D.Rasterizer3D_colorPalette[var8] | -16777216;
			} else if (var2.texture >= 0) {
				int var3 = Varcs.method2870(Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture), 96);
				return Rasterizer3D.Rasterizer3D_colorPalette[var3] | -16777216;
			} else if (var2.primaryRgb == 16711935) {
				return var1;
			} else {
				var4 = var2.hue;
				var5 = var2.saturation;
				var6 = var2.lightness;
				if (var6 > 179) {
					var5 /= 2;
				}

				if (var6 > 192) {
					var5 /= 2;
				}

				if (var6 > 217) {
					var5 /= 2;
				}

				if (var6 > 243) {
					var5 /= 2;
				}

				var7 = (var5 / 32 << 7) + var6 / 2 + (var4 / 4 << 10);
				var8 = Varcs.method2870(var7, 96);
				return Rasterizer3D.Rasterizer3D_colorPalette[var8] | -16777216;
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "-1356540140"
	)
	public static void method7375(AbstractArchive var0) {
		ParamComposition.ParamDefinition_archive = var0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Lia;",
		garbageValue = "1355150813"
	)
	@Export("getObjectDefinition")
	public static ObjectComposition getObjectDefinition(int var0) {
		ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = FriendSystem.ObjectDefinition_archive.takeFile(6, var0);
			var1 = new ObjectComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			if (var1.isSolid) {
				var1.interactType = 0;
				var1.boolean1 = false;
			}

			ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
