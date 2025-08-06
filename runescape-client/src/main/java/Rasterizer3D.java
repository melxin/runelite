import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("il")
@Implements("Rasterizer3D")
public class Rasterizer3D {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	static final AbstractRasterizer field2586;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	static final AbstractRasterizer field2581;
	@ObfuscatedName("ac")
	@Export("Rasterizer3D_colorPalette")
	public static int[] Rasterizer3D_colorPalette;
	@ObfuscatedName("av")
	static int[] field2580;
	@ObfuscatedName("au")
	static int[] field2584;
	@ObfuscatedName("as")
	@Export("Rasterizer3D_sine")
	public static int[] Rasterizer3D_sine;
	@ObfuscatedName("ah")
	@Export("Rasterizer3D_cosine")
	public static int[] Rasterizer3D_cosine;
	@ObfuscatedName("ap")
	static float[] field2590;
	@ObfuscatedName("am")
	static float[] field2588;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	@Export("clips")
	public static Clips clips;
	@ObfuscatedName("ag")
	static double field2587;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	static AbstractRasterizer field2583;

	static {
		Rasterizer3D_colorPalette = new int[65536];
		field2580 = new int[512];
		field2584 = new int[2048];
		Rasterizer3D_sine = new int[2048];
		Rasterizer3D_cosine = new int[2048];
		field2590 = new float[2048];
		field2588 = new float[2048];

		int var0;
		for (var0 = 1; var0 < 512; ++var0) {
			field2580[var0] = 32768 / var0;
		}

		for (var0 = 1; var0 < 2048; ++var0) {
			field2584[var0] = 65536 / var0;
		}

		for (var0 = 0; var0 < 2048; ++var0) {
			field2590[var0] = (float)Math.sin((double)var0 * 0.0030679615D);
			field2588[var0] = (float)Math.cos((double)var0 * 0.0030679615D);
			Rasterizer3D_sine[var0] = (int)(65536.0F * field2590[var0]);
			Rasterizer3D_cosine[var0] = (int)(65536.0F * field2588[var0]);
		}

		clips = new Clips();
		field2586 = new class244(clips);
		field2581 = new class246(clips);
		field2583 = field2586;
	}

	@ObfuscatedName("al")
	public static void method4968(boolean var0) {
		if (var0 && Rasterizer2D.Rasterizer2D_brightness != null) {
			field2583 = field2581;
		} else {
			field2583 = field2586;
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lju;)V"
	)
	@Export("setTextureLoader")
	public static void setTextureLoader(TextureLoader var0) {
		clips.Rasterizer3D_textureLoader = var0;
	}

	@ObfuscatedName("ac")
	@Export("buildPalette")
	public static void buildPalette(double var0) {
		Rasterizer3D_buildPalette(var0, 0, 512);
	}

	@ObfuscatedName("av")
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

	@ObfuscatedName("au")
	@Export("Rasterizer3D_brighten")
	static int Rasterizer3D_brighten(int var0, double var1) {
		field2587 = var1;
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

	@ObfuscatedName("as")
	public static double method4892() {
		return field2587;
	}

	@ObfuscatedName("ah")
	@Export("getClipMidX")
	static int getClipMidX() {
		return clips.clipMidX;
	}

	@ObfuscatedName("ap")
	@Export("getClipMidY")
	static int getClipMidY() {
		return clips.clipMidY;
	}

	@ObfuscatedName("am")
	@Export("Rasterizer3D_clipMidX2")
	static int Rasterizer3D_clipMidX2() {
		return clips.clipNegativeMidX;
	}

	@ObfuscatedName("aj")
	@Export("Rasterizer3D_clipMidY2")
	static int Rasterizer3D_clipMidY2() {
		return clips.clipCenterX;
	}

	@ObfuscatedName("ag")
	static int method4897() {
		return clips.field2940;
	}

	@ObfuscatedName("ay")
	static int method4898() {
		return clips.clipNegativeMidY;
	}

	@ObfuscatedName("aa")
	@Export("get3dZoom")
	public static int get3dZoom() {
		return clips.zoom;
	}

	@ObfuscatedName("ai")
	static int method4959() {
		return clips.clipX;
	}

	@ObfuscatedName("ak")
	static boolean method4901() {
		return field2583.vmethod5761();
	}

	@ObfuscatedName("ar")
	public static void method4941(int[] var0, int var1, int var2, float[] var3) {
		if (var3 == null && field2583 == field2581) {
			field2583 = field2586;
		}

		field2583.method5030(var0, var1, var2, var3);
	}

	@ObfuscatedName("at")
	@Export("resetRasterClipping")
	public static void resetRasterClipping() {
		setClipBoundsAndInitOffsets(Rasterizer2D.Rasterizer2D_xClipStart, Rasterizer2D.Rasterizer2D_yClipStart, Rasterizer2D.Rasterizer2D_xClipEnd, Rasterizer2D.Rasterizer2D_yClipEnd);
	}

	@ObfuscatedName("ax")
	@Export("setClipBoundsAndInitOffsets")
	static void setClipBoundsAndInitOffsets(int var0, int var1, int var2, int var3) {
		clips.clipX = var2 - var0;
		clips.clipY = var3 - var1;
		setClipBounds();
		if (clips.Rasterizer3D_rowOffsets.length < clips.clipY) {
			clips.Rasterizer3D_rowOffsets = new int[Huffman.method8114(clips.clipY)];
		}

		int var4 = var0 + Rasterizer2D.Rasterizer2D_width * var1;

		for (int var5 = 0; var5 < clips.clipY; ++var5) {
			clips.Rasterizer3D_rowOffsets[var5] = var4;
			var4 += Rasterizer2D.Rasterizer2D_width;
		}

	}

	@ObfuscatedName("aq")
	@Export("setClipBounds")
	public static void setClipBounds() {
		clips.setClipBounds();
	}

	@ObfuscatedName("ao")
	@Export("setCustomClipBounds")
	public static void setCustomClipBounds(int var0, int var1) {
		int var2 = clips.Rasterizer3D_rowOffsets[0];
		int var3 = var2 / Rasterizer2D.Rasterizer2D_width;
		int var4 = var2 - var3 * Rasterizer2D.Rasterizer2D_width;
		clips.setCustomClipBounds(var0, var4, var1, var3);
	}

	@ObfuscatedName("az")
	@Export("setClipping")
	public static void setClipping(int var0, int var1, int var2) {
		clips.setClipping(var0, var1, var2);
	}

	@ObfuscatedName("ad")
	@Export("rasterGouraud")
	static void rasterGouraud(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11) {
		field2583.drawAlphaBlendedGraphics(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
	}

	@ObfuscatedName("aw")
	@Export("rasterFlat")
	public static void rasterFlat(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9) {
		field2583.vmethod5725(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
	}

	@ObfuscatedName("af")
	@Export("rasterTextureWithShadingAndLighting")
	static void rasterTextureWithShadingAndLighting(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
		field2583.drawGradientTriangle(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
	}

	@ObfuscatedName("an")
	@Export("rasterTextureWithColors")
	static void rasterTextureWithColors(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
		field2583.textureMapPolygons(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
	}

	@ObfuscatedName("ae")
	@Export("rasterTriangleWithGradient")
	static void rasterTriangleWithGradient(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11) {
		field2583.method5031(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
	}

	@ObfuscatedName("bj")
	@Export("rasterTriangle")
	static void rasterTriangle(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9) {
		field2583.method5063(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
	}
}
