import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ka")
@Implements("Projection")
public abstract class Projection {
	Projection() {
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljz;IIIIJ)V"
	)
	@Export("draw")
	abstract void draw(Renderable var1, int var2, int var3, int var4, int var5, long var6);

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljh;Lkz;IIII)V",
		garbageValue = "-436402298"
	)
	@Export("drawTileUnderlay")
	abstract void drawTileUnderlay(Scene var1, SceneTilePaint var2, int var3, int var4, int var5);

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljh;Lkr;III)V",
		garbageValue = "-656009185"
	)
	@Export("drawTileOverlay")
	abstract void drawTileOverlay(Scene var1, SceneTileModel var2, int var3, int var4);

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljh;Lkz;IIFFFFFFFFFFFFI)V",
		garbageValue = "-173961864"
	)
	@Export("drawSceneTilePaint")
	void drawSceneTilePaint(Scene var1, SceneTilePaint var2, int var3, int var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16) {
		float var17 = (float)Rasterizer3D.getClipMidX() + var5 * (float)Rasterizer3D.get3dZoom() / var13;
		float var18 = (float)Rasterizer3D.getClipMidY() + var9 * (float)Rasterizer3D.get3dZoom() / var13;
		float var19 = (float)Rasterizer3D.getClipMidX() + var6 * (float)Rasterizer3D.get3dZoom() / var14;
		float var20 = (float)Rasterizer3D.getClipMidY() + var10 * (float)Rasterizer3D.get3dZoom() / var14;
		float var21 = (float)Rasterizer3D.getClipMidX() + var7 * (float)Rasterizer3D.get3dZoom() / var15;
		float var22 = (float)Rasterizer3D.getClipMidY() + var11 * (float)Rasterizer3D.get3dZoom() / var15;
		float var23 = (float)Rasterizer3D.getClipMidX() + var8 * (float)Rasterizer3D.get3dZoom() / var16;
		float var24 = (float)Rasterizer3D.getClipMidY() + var12 * (float)Rasterizer3D.get3dZoom() / var16;
		float var25 = WorldMapSectionType.method6970(var13);
		float var26 = WorldMapSectionType.method6970(var14);
		float var27 = WorldMapSectionType.method6970(var15);
		float var28 = WorldMapSectionType.method6970(var16);
		Rasterizer3D.clips.currentFaceAlpha = 0;
		int var29;
		float var30;
		int var31;
		if ((var20 - var24) * (var21 - var23) - (var19 - var23) * (var22 - var24) > 0.0F) {
			Rasterizer3D.clips.clipping = false;
			var29 = Rasterizer3D.method5412();
			if (var21 < 0.0F || var23 < 0.0F || var19 < 0.0F || var21 > (float)var29 || var23 > (float)var29 || var19 > (float)var29) {
				Rasterizer3D.clips.clipping = true;
			}

			if (Scene.containsBounds(var1.Scene_selectedScreenX, var1.Scene_selectedScreenY, (int)var22, (int)var24, (int)var20, (int)var21, (int)var23, (int)var19)) {
				var30 = WorldMapEvent.method7175(var1.Scene_selectedScreenX, var1.Scene_selectedScreenY, (int)var21, (int)var23, (int)var19, (int)var22, (int)var24, (int)var20, var27, var28, var26);
				if (var30 > var1.field2877) {
					var1.Scene_baseX = var3;
					var1.Scene_baseY = var4;
					var1.field2877 = var30;
				}
			}

			if (var2.texture == -1) {
				if (var2.neColor != 12345678) {
					Rasterizer3D.rasterGouraud(var22, var24, var20, var21, var23, var19, var27, var28, var26, var2.neColor, var2.nwColor, var2.seColor);
				}
			} else if (!Scene.Scene_isLowDetail) {
				if (var2.isFlat) {
					Rasterizer3D.rasterTextureWithColors(var22, var24, var20, var21, var23, var19, var27, var28, var26, var2.neColor, var2.nwColor, var2.seColor, (int)var5, (int)var6, (int)var8, (int)var9, (int)var10, (int)var12, (int)var13, (int)var14, (int)var16, var2.texture);
				} else {
					Rasterizer3D.rasterTextureWithColors(var22, var24, var20, var21, var23, var19, var27, var28, var26, var2.neColor, var2.nwColor, var2.seColor, (int)var7, (int)var8, (int)var6, (int)var11, (int)var12, (int)var10, (int)var15, (int)var16, (int)var14, var2.texture);
				}
			} else {
				var31 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture);
				Rasterizer3D.rasterGouraud(var22, var24, var20, var21, var23, var19, var27, var28, var26, Scene.method5552(var31, var2.neColor), Scene.method5552(var31, var2.nwColor), Scene.method5552(var31, var2.seColor));
			}
		}

		if ((var17 - var19) * (var24 - var20) - (var18 - var20) * (var23 - var19) > 0.0F) {
			Rasterizer3D.clips.clipping = false;
			var29 = Rasterizer3D.method5412();
			if (var17 < 0.0F || var19 < 0.0F || var23 < 0.0F || var17 > (float)var29 || var19 > (float)var29 || var23 > (float)var29) {
				Rasterizer3D.clips.clipping = true;
			}

			if (Scene.containsBounds(var1.Scene_selectedScreenX, var1.Scene_selectedScreenY, (int)var18, (int)var20, (int)var24, (int)var17, (int)var19, (int)var23)) {
				var30 = WorldMapEvent.method7175(var1.Scene_selectedScreenX, var1.Scene_selectedScreenY, (int)var17, (int)var19, (int)var23, (int)var18, (int)var20, (int)var24, var25, var26, var28);
				if (var30 > var1.field2877) {
					var1.Scene_baseX = var3;
					var1.Scene_baseY = var4;
					var1.field2877 = var30;
				}
			}

			if (var2.texture == -1) {
				if (var2.swColor != 12345678) {
					Rasterizer3D.rasterGouraud(var18, var20, var24, var17, var19, var23, var25, var26, var28, var2.swColor, var2.seColor, var2.nwColor);
				}
			} else if (!Scene.Scene_isLowDetail) {
				Rasterizer3D.rasterTextureWithColors(var18, var20, var24, var17, var19, var23, var25, var26, var28, var2.swColor, var2.seColor, var2.nwColor, (int)var5, (int)var6, (int)var8, (int)var9, (int)var10, (int)var12, (int)var13, (int)var14, (int)var16, var2.texture);
			} else {
				var31 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture);
				Rasterizer3D.rasterGouraud(var18, var20, var24, var17, var19, var23, var25, var26, var28, Scene.method5552(var31, var2.swColor), Scene.method5552(var31, var2.seColor), Scene.method5552(var31, var2.nwColor));
			}
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljh;Lkr;III)V",
		garbageValue = "1967260157"
	)
	@Export("drawSceneTileModel")
	void drawSceneTileModel(Scene var1, SceneTileModel var2, int var3, int var4) {
		Rasterizer3D.clips.currentFaceAlpha = 0;
		int var5 = var2.faceX.length;

		for (int var6 = 0; var6 < var5; ++var6) {
			int var7 = var2.faceX[var6];
			int var8 = var2.faceY[var6];
			int var9 = var2.faceZ[var6];
			float var10 = SceneTileModel.verticesX[var7];
			float var11 = SceneTileModel.verticesX[var8];
			float var12 = SceneTileModel.verticesX[var9];
			float var13 = SceneTileModel.verticesY[var7];
			float var14 = SceneTileModel.verticesY[var8];
			float var15 = SceneTileModel.verticesY[var9];
			float var16 = SceneTileModel.verticesZ[var7];
			float var17 = SceneTileModel.verticesZ[var8];
			float var18 = SceneTileModel.verticesZ[var9];
			if ((var10 - var11) * (var15 - var14) - (var12 - var11) * (var13 - var14) > 0.0F) {
				Rasterizer3D.clips.clipping = false;
				int var19 = Rasterizer3D.method5412();
				if (var10 < 0.0F || var11 < 0.0F || var12 < 0.0F || var10 > (float)var19 || var11 > (float)var19 || var12 > (float)var19) {
					Rasterizer3D.clips.clipping = true;
				}

				if (Scene.containsBounds(var1.Scene_selectedScreenX, var1.Scene_selectedScreenY, (int)var13, (int)var14, (int)var15, (int)var10, (int)var11, (int)var12)) {
					float var20 = WorldMapEvent.method7175(var1.Scene_selectedScreenX, var1.Scene_selectedScreenY, (int)var10, (int)var11, (int)var12, (int)var13, (int)var14, (int)var15, var16, var17, var18);
					if (var20 > var1.field2877) {
						var1.Scene_baseX = var3;
						var1.Scene_baseY = var4;
						var1.field2877 = var20;
					}
				}

				if (var2.triangleTextureId != null && var2.triangleTextureId[var6] != -1) {
					if (!Scene.Scene_isLowDetail) {
						if (var2.isFlat) {
							Rasterizer3D.rasterTextureWithColors(var13, var14, var15, var10, var11, var12, var16, var17, var18, var2.triangleColorA[var6], var2.triangleColorB[var6], var2.triangleColorC[var6], SceneTileModel.triangleTexturesX[0], SceneTileModel.triangleTexturesX[1], SceneTileModel.triangleTexturesX[3], SceneTileModel.triangleTexturesY[0], SceneTileModel.triangleTexturesY[1], SceneTileModel.triangleTexturesY[3], SceneTileModel.triangleTexturesZ[0], SceneTileModel.triangleTexturesZ[1], SceneTileModel.triangleTexturesZ[3], var2.triangleTextureId[var6]);
						} else {
							Rasterizer3D.rasterTextureWithColors(var13, var14, var15, var10, var11, var12, var16, var17, var18, var2.triangleColorA[var6], var2.triangleColorB[var6], var2.triangleColorC[var6], SceneTileModel.triangleTexturesX[var7], SceneTileModel.triangleTexturesX[var8], SceneTileModel.triangleTexturesX[var9], SceneTileModel.triangleTexturesY[var7], SceneTileModel.triangleTexturesY[var8], SceneTileModel.triangleTexturesY[var9], SceneTileModel.triangleTexturesZ[var7], SceneTileModel.triangleTexturesZ[var8], SceneTileModel.triangleTexturesZ[var9], var2.triangleTextureId[var6]);
						}
					} else {
						int var21 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.triangleTextureId[var6]);
						Rasterizer3D.rasterGouraud(var13, var14, var15, var10, var11, var12, var16, var17, var18, Scene.method5552(var21, var2.triangleColorA[var6]), Scene.method5552(var21, var2.triangleColorB[var6]), Scene.method5552(var21, var2.triangleColorC[var6]));
					}
				} else if (var2.triangleColorA[var6] != 12345678) {
					Rasterizer3D.rasterGouraud(var13, var14, var15, var10, var11, var12, var16, var17, var18, var2.triangleColorA[var6], var2.triangleColorB[var6], var2.triangleColorC[var6]);
				}
			}
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1644257037"
	)
	static final int method5894(int var0, int var1) {
		int var2 = class450.method9120(var0 - 1, var1 - 1) + class450.method9120(var0 + 1, var1 - 1) + class450.method9120(var0 - 1, 1 + var1) + class450.method9120(1 + var0, var1 + 1);
		int var3 = class450.method9120(var0 - 1, var1) + class450.method9120(var0 + 1, var1) + class450.method9120(var0, var1 - 1) + class450.method9120(var0, 1 + var1);
		int var4 = class450.method9120(var0, var1);
		return var2 / 16 + var3 / 8 + var4 / 4;
	}
}
