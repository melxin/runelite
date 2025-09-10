import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ie")
@Implements("Rasterizer3D")
public class Rasterizer3D {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lih;"
	)
	static final AbstractRasterizer field2635;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lih;"
	)
	static final AbstractRasterizer field2631;
	@ObfuscatedName("at")
	@Export("Rasterizer3D_colorPalette")
	public static int[] Rasterizer3D_colorPalette;
	@ObfuscatedName("ac")
	static int[] field2633;
	@ObfuscatedName("ap")
	static int[] field2634;
	@ObfuscatedName("aq")
	@Export("Rasterizer3D_sine")
	public static int[] Rasterizer3D_sine;
	@ObfuscatedName("ao")
	@Export("Rasterizer3D_cosine")
	public static int[] Rasterizer3D_cosine;
	@ObfuscatedName("as")
	static float[] field2630;
	@ObfuscatedName("al")
	static float[] field2638;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("clips")
	public static Clips clips;
	@ObfuscatedName("ai")
	static double field2640;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lih;"
	)
	static AbstractRasterizer field2641;

	static {
		Rasterizer3D_colorPalette = new int[65536];
		field2633 = new int[512];
		field2634 = new int[2048];
		Rasterizer3D_sine = new int[2048];
		Rasterizer3D_cosine = new int[2048];
		field2630 = new float[2048];
		field2638 = new float[2048];

		int var0;
		for (var0 = 1; var0 < 512; ++var0) {
			field2633[var0] = 32768 / var0;
		}

		for (var0 = 1; var0 < 2048; ++var0) {
			field2634[var0] = 65536 / var0;
		}

		for (var0 = 0; var0 < 2048; ++var0) {
			double var1 = Math.sin((double)var0 * 0.0030679615D);
			double var3 = Math.cos((double)var0 * 0.0030679615D);
			Rasterizer3D_sine[var0] = (int)(65536.0D * var1);
			Rasterizer3D_cosine[var0] = (int)(65536.0D * var3);
			field2630[var0] = (float)var1;
			field2638[var0] = (float)var3;
		}

		clips = new Clips();
		field2635 = new class246(clips);
		field2631 = new class248(clips);
		field2641 = field2635;
	}

	@ObfuscatedName("af")
	public static void method4927(boolean var0) {
		if (var0 && Rasterizer2D.Rasterizer2D_brightness != null) {
			field2641 = field2631;
		} else {
			field2641 = field2635;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljs;)V"
	)
	@Export("setTextureLoader")
	public static void setTextureLoader(TextureLoader var0) {
		clips.Rasterizer3D_textureLoader = var0;
	}

	@ObfuscatedName("at")
	@Export("buildPalette")
	public static void buildPalette(double var0) {
		Rasterizer3D_buildPalette(var0, 0, 512);
	}

	@ObfuscatedName("ac")
	@Export("Rasterizer3D_buildPalette")
	static void Rasterizer3D_buildPalette(double var0, int var2, int var3) {
		int var4 = var2 * 128;

		for (int var5 = var2; var5 < var3; ++var5) {
			double var6 = (double)(var5 >> 3) / 64.0D + 0.0078125D;
			double var8 = (double)(var5 & 7) / 8.0D + 0.0625D;

			for (int var10 = 0; var10 < 128; ++var10) {
				double var11 = (double)var10 / 128.0D;
				double var13 = var11;
				double var15 = var11;
				double var17 = var11;
				if (var8 != 0.0D) {
					double var19;
					if (var11 < 0.5D) {
						var19 = var11 * (1.0D + var8);
					} else {
						var19 = var11 + var8 - var11 * var8;
					}

					double var21 = 2.0D * var11 - var19;
					double var23 = var6 + 0.3333333333333333D;
					if (var23 > 1.0D) {
						--var23;
					}

					double var27 = var6 - 0.3333333333333333D;
					if (var27 < 0.0D) {
						++var27;
					}

					if (6.0D * var23 < 1.0D) {
						var13 = var21 + (var19 - var21) * 6.0D * var23;
					} else if (2.0D * var23 < 1.0D) {
						var13 = var19;
					} else if (3.0D * var23 < 2.0D) {
						var13 = var21 + (var19 - var21) * (0.6666666666666666D - var23) * 6.0D;
					} else {
						var13 = var21;
					}

					if (6.0D * var6 < 1.0D) {
						var15 = var21 + (var19 - var21) * 6.0D * var6;
					} else if (2.0D * var6 < 1.0D) {
						var15 = var19;
					} else if (3.0D * var6 < 2.0D) {
						var15 = var21 + (var19 - var21) * (0.6666666666666666D - var6) * 6.0D;
					} else {
						var15 = var21;
					}

					if (6.0D * var27 < 1.0D) {
						var17 = var21 + (var19 - var21) * 6.0D * var27;
					} else if (2.0D * var27 < 1.0D) {
						var17 = var19;
					} else if (3.0D * var27 < 2.0D) {
						var17 = var21 + (var19 - var21) * (0.6666666666666666D - var27) * 6.0D;
					} else {
						var17 = var21;
					}
				}

				int var29 = (int)(var13 * 256.0D);
				int var20 = (int)(var15 * 256.0D);
				int var30 = (int)(var17 * 256.0D);
				int var22 = var30 + (var20 << 8) + (var29 << 16);
				var22 = Rasterizer3D_brighten(var22, var0);
				if (var22 == 0) {
					var22 = 1;
				}

				Rasterizer3D_colorPalette[var4++] = var22;
			}
		}

	}

	@ObfuscatedName("ap")
	@Export("Rasterizer3D_brighten")
	static int Rasterizer3D_brighten(int var0, double var1) {
		field2640 = var1;
		double var3 = (double)(var0 >> 16) / 256.0D;
		double var5 = (double)(var0 >> 8 & 255) / 256.0D;
		double var7 = (double)(var0 & 255) / 256.0D;
		var3 = Math.pow(var3, var1);
		var5 = Math.pow(var5, var1);
		var7 = Math.pow(var7, var1);
		int var9 = (int)(var3 * 256.0D);
		int var10 = (int)(var5 * 256.0D);
		int var11 = (int)(var7 * 256.0D);
		return var11 + (var10 << 8) + (var9 << 16);
	}

	@ObfuscatedName("aq")
	public static double method4932() {
		return field2640;
	}

	@ObfuscatedName("ao")
	@Export("getClipMidX")
	static int getClipMidX() {
		return clips.clipMidX;
	}

	@ObfuscatedName("as")
	@Export("getClipMidY")
	static int getClipMidY() {
		return clips.clipMidY;
	}

	@ObfuscatedName("al")
	@Export("Rasterizer3D_clipMidX2")
	static int Rasterizer3D_clipMidX2() {
		return clips.clipNegativeMidX;
	}

	@ObfuscatedName("au")
	@Export("Rasterizer3D_clipMidY2")
	static int Rasterizer3D_clipMidY2() {
		return clips.clipCenterX;
	}

	@ObfuscatedName("ai")
	static int method4935() {
		return clips.field3014;
	}

	@ObfuscatedName("aa")
	static int method4937() {
		return clips.clipNegativeMidY;
	}

	@ObfuscatedName("am")
	@Export("get3dZoom")
	public static int get3dZoom() {
		return clips.zoom;
	}

	@ObfuscatedName("an")
	static int method4939() {
		return clips.clipX;
	}

	@ObfuscatedName("ar")
	static boolean method4940() {
		return field2641.vmethod5713();
	}

	@ObfuscatedName("ae")
	public static void method4941(int[] var0, int var1, int var2, float[] var3) {
		if (var3 == null && field2641 == field2631) {
			field2641 = field2635;
		}

		field2641.method5054(var0, var1, var2, var3);
	}

	@ObfuscatedName("ay")
	@Export("resetRasterClipping")
	public static void resetRasterClipping() {
		setClipBoundsAndInitOffsets(Rasterizer2D.Rasterizer2D_xClipStart, Rasterizer2D.Rasterizer2D_yClipStart, Rasterizer2D.Rasterizer2D_xClipEnd, Rasterizer2D.Rasterizer2D_yClipEnd);
	}

	@ObfuscatedName("ad")
	@Export("setClipBoundsAndInitOffsets")
	static void setClipBoundsAndInitOffsets(int var0, int var1, int var2, int var3) {
		clips.clipX = var2 - var0;
		clips.clipY = var3 - var1;
		setClipBounds();
		if (clips.Rasterizer3D_rowOffsets.length < clips.clipY) {
			clips.Rasterizer3D_rowOffsets = new int[class165.method4019(clips.clipY)];
		}

		int var4 = var0 + Rasterizer2D.Rasterizer2D_width * var1;

		for (int var5 = 0; var5 < clips.clipY; ++var5) {
			clips.Rasterizer3D_rowOffsets[var5] = var4;
			var4 += Rasterizer2D.Rasterizer2D_width;
		}

	}

	@ObfuscatedName("ag")
	@Export("setClipBounds")
	public static void setClipBounds() {
		clips.setClipBounds();
	}

	@ObfuscatedName("av")
	@Export("setCustomClipBounds")
	public static void setCustomClipBounds(int var0, int var1) {
		int var2 = clips.Rasterizer3D_rowOffsets[0];
		int var3 = var2 / Rasterizer2D.Rasterizer2D_width;
		int var4 = var2 - var3 * Rasterizer2D.Rasterizer2D_width;
		clips.setCustomClipBounds(var0, var4, var1, var3);
	}

	@ObfuscatedName("ah")
	@Export("setClipping")
	public static void setClipping(int var0, int var1, int var2) {
		clips.setClipping(var0, var1, var2);
	}

	@ObfuscatedName("ab")
	@Export("rasterGouraud")
	static void rasterGouraud(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11) {
		field2641.drawAlphaBlendedGraphics(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
	}

	@ObfuscatedName("ax")
	@Export("rasterFlat")
	public static void rasterFlat(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9) {
		field2641.vmethod5717(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
	}

	@ObfuscatedName("ak")
	@Export("rasterTextureWithShadingAndLighting")
	static void rasterTextureWithShadingAndLighting(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
		field2641.drawGradientTriangle(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
	}

	@ObfuscatedName("aj")
	@Export("rasterTextureWithColors")
	static void rasterTextureWithColors(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
		field2641.textureMapPolygons(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
	}

	@ObfuscatedName("az")
	@Export("rasterTriangleWithGradient")
	static void rasterTriangleWithGradient(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11) {
		field2641.method5059(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
	}

	@ObfuscatedName("bt")
	@Export("rasterTriangle")
	static void rasterTriangle(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9) {
		field2641.method5055(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
	}
}
