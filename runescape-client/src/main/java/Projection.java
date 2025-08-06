import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jv")
@Implements("Projection")
public abstract class Projection {
	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "Lua;"
	)
	static class521 field2791;

	Projection() {
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Liq;IIIIJ)V"
	)
	@Export("draw")
	abstract void draw(Renderable var1, int var2, int var3, int var4, int var5, long var6);

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Liy;Ljt;IIII)V",
		garbageValue = "-1433574360"
	)
	@Export("drawTileUnderlay")
	abstract void drawTileUnderlay(Scene var1, SceneTilePaint var2, int var3, int var4, int var5);

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Liy;Ljy;IIB)V",
		garbageValue = "-15"
	)
	@Export("drawTileOverlay")
	abstract void drawTileOverlay(Scene var1, SceneTileModel var2, int var3, int var4);

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Liy;Ljt;IIFFFFFFFFFFFFI)V",
		garbageValue = "-1125801484"
	)
	void method5401(Scene var1, SceneTilePaint var2, int var3, int var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16) {
		float var17 = (float)Rasterizer3D.getClipMidX() + var5 * (float)Rasterizer3D.get3dZoom() / var13;
		float var18 = (float)Rasterizer3D.getClipMidY() + var9 * (float)Rasterizer3D.get3dZoom() / var13;
		float var19 = (float)Rasterizer3D.getClipMidX() + var6 * (float)Rasterizer3D.get3dZoom() / var14;
		float var20 = (float)Rasterizer3D.getClipMidY() + var10 * (float)Rasterizer3D.get3dZoom() / var14;
		float var21 = (float)Rasterizer3D.getClipMidX() + var7 * (float)Rasterizer3D.get3dZoom() / var15;
		float var22 = (float)Rasterizer3D.getClipMidY() + var11 * (float)Rasterizer3D.get3dZoom() / var15;
		float var23 = (float)Rasterizer3D.getClipMidX() + var8 * (float)Rasterizer3D.get3dZoom() / var16;
		float var24 = (float)Rasterizer3D.getClipMidY() + var12 * (float)Rasterizer3D.get3dZoom() / var16;
		float var25 = ClanSettings.method3890(var13);
		float var26 = ClanSettings.method3890(var14);
		float var27 = ClanSettings.method3890(var15);
		float var28 = ClanSettings.method3890(var16);
		Rasterizer3D.clips.currentFaceAlpha = 0;
		int var29;
		int var30;
		if ((var20 - var24) * (var21 - var23) - (var22 - var24) * (var19 - var23) > 0.0F) {
			Rasterizer3D.clips.clipping = false;
			var29 = Rasterizer3D.method4959();
			if (var21 < 0.0F || var23 < 0.0F || var19 < 0.0F || var21 > (float)var29 || var23 > (float)var29 || var19 > (float)var29) {
				Rasterizer3D.clips.clipping = true;
			}

			if (Scene.containsBounds(var1.Scene_selectedScreenX, var1.Scene_selectedScreenY, (int)var22, (int)var24, (int)var20, (int)var21, (int)var23, (int)var19)) {
				var1.Scene_baseX = var3;
				var1.Scene_baseY = var4;
				var1.field2701 = GameBuild.method8169(var1.Scene_selectedScreenX, var1.Scene_selectedScreenY, (int)var21, (int)var23, (int)var19, (int)var22, (int)var24, (int)var20, var27, var28, var26);
			}

			if (var2.texture == -1) {
				if (var2.neColor != 12345678) {
					Rasterizer3D.method4908(var22, var24, var20, var21, var23, var19, var27, var28, var26, var2.neColor, var2.nwColor, var2.seColor);
				}
			} else if (!Scene.Scene_isLowDetail) {
				if (var2.isFlat) {
					Rasterizer3D.method4964(var22, var24, var20, var21, var23, var19, var27, var28, var26, var2.neColor, var2.nwColor, var2.seColor, (int)var5, (int)var6, (int)var8, (int)var9, (int)var10, (int)var12, (int)var13, (int)var14, (int)var16, var2.texture);
				} else {
					Rasterizer3D.method4964(var22, var24, var20, var21, var23, var19, var27, var28, var26, var2.neColor, var2.nwColor, var2.seColor, (int)var7, (int)var8, (int)var6, (int)var11, (int)var12, (int)var10, (int)var15, (int)var16, (int)var14, var2.texture);
				}
			} else {
				var30 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture);
				Rasterizer3D.method4908(var22, var24, var20, var21, var23, var19, var27, var28, var26, Scene.method5081(var30, var2.neColor), Scene.method5081(var30, var2.nwColor), Scene.method5081(var30, var2.seColor));
			}
		}

		if ((var24 - var20) * (var17 - var19) - (var23 - var19) * (var18 - var20) > 0.0F) {
			Rasterizer3D.clips.clipping = false;
			var29 = Rasterizer3D.method4959();
			if (var17 < 0.0F || var19 < 0.0F || var23 < 0.0F || var17 > (float)var29 || var19 > (float)var29 || var23 > (float)var29) {
				Rasterizer3D.clips.clipping = true;
			}

			if (Scene.containsBounds(var1.Scene_selectedScreenX, var1.Scene_selectedScreenY, (int)var18, (int)var20, (int)var24, (int)var17, (int)var19, (int)var23)) {
				var1.Scene_baseX = var3;
				var1.Scene_baseY = var4;
				var1.field2701 = GameBuild.method8169(var1.Scene_selectedScreenX, var1.Scene_selectedScreenY, (int)var17, (int)var19, (int)var23, (int)var18, (int)var20, (int)var24, var25, var26, var28);
			}

			if (var2.texture == -1) {
				if (var2.swColor != 12345678) {
					Rasterizer3D.method4908(var18, var20, var24, var17, var19, var23, var25, var26, var28, var2.swColor, var2.seColor, var2.nwColor);
				}
			} else if (!Scene.Scene_isLowDetail) {
				Rasterizer3D.method4964(var18, var20, var24, var17, var19, var23, var25, var26, var28, var2.swColor, var2.seColor, var2.nwColor, (int)var5, (int)var6, (int)var8, (int)var9, (int)var10, (int)var12, (int)var13, (int)var14, (int)var16, var2.texture);
			} else {
				var30 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture);
				Rasterizer3D.method4908(var18, var20, var24, var17, var19, var23, var25, var26, var28, Scene.method5081(var30, var2.swColor), Scene.method5081(var30, var2.seColor), Scene.method5081(var30, var2.nwColor));
			}
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Liy;Ljy;III)V",
		garbageValue = "1786441219"
	)
	@Export("drawSceneTileModel")
	void drawSceneTileModel(Scene var1, SceneTileModel var2, int var3, int var4) {
		Rasterizer3D.clips.currentFaceAlpha = 0;
		int var5 = var2.faceX.length;

		for (int var6 = 0; var6 < var5; ++var6) {
			int var7 = var2.faceX[var6];
			int var8 = var2.faceY[var6];
			int var9 = var2.faceZ[var6];
			float var10 = SceneTileModel.field2808[var7];
			float var11 = SceneTileModel.field2808[var8];
			float var12 = SceneTileModel.field2808[var9];
			float var13 = SceneTileModel.field2795[var7];
			float var14 = SceneTileModel.field2795[var8];
			float var15 = SceneTileModel.field2795[var9];
			float var16 = SceneTileModel.field2806[var7];
			float var17 = SceneTileModel.field2806[var8];
			float var18 = SceneTileModel.field2806[var9];
			if ((var15 - var14) * (var10 - var11) - (var12 - var11) * (var13 - var14) > 0.0F) {
				Rasterizer3D.clips.clipping = false;
				int var19 = Rasterizer3D.method4959();
				if (var10 < 0.0F || var11 < 0.0F || var12 < 0.0F || var10 > (float)var19 || var11 > (float)var19 || var12 > (float)var19) {
					Rasterizer3D.clips.clipping = true;
				}

				if (Scene.containsBounds(var1.Scene_selectedScreenX, var1.Scene_selectedScreenY, (int)var13, (int)var14, (int)var15, (int)var10, (int)var11, (int)var12)) {
					var1.Scene_baseX = var3;
					var1.Scene_baseY = var4;
					var1.field2701 = GameBuild.method8169(var1.Scene_selectedScreenX, var1.Scene_selectedScreenY, (int)var10, (int)var11, (int)var12, (int)var13, (int)var14, (int)var15, var16, var17, var18);
				}

				if (var2.triangleTextureId != null && var2.triangleTextureId[var6] != -1) {
					if (!Scene.Scene_isLowDetail) {
						if (var2.isFlat) {
							Rasterizer3D.method4964(var13, var14, var15, var10, var11, var12, var16, var17, var18, var2.triangleColorA[var6], var2.triangleColorB[var6], var2.triangleColorC[var6], SceneTileModel.triangleTexturesX[0], SceneTileModel.triangleTexturesX[1], SceneTileModel.triangleTexturesX[3], SceneTileModel.field2799[0], SceneTileModel.field2799[1], SceneTileModel.field2799[3], SceneTileModel.verticesX[0], SceneTileModel.verticesX[1], SceneTileModel.verticesX[3], var2.triangleTextureId[var6]);
						} else {
							Rasterizer3D.method4964(var13, var14, var15, var10, var11, var12, var16, var17, var18, var2.triangleColorA[var6], var2.triangleColorB[var6], var2.triangleColorC[var6], SceneTileModel.triangleTexturesX[var7], SceneTileModel.triangleTexturesX[var8], SceneTileModel.triangleTexturesX[var9], SceneTileModel.field2799[var7], SceneTileModel.field2799[var8], SceneTileModel.field2799[var9], SceneTileModel.verticesX[var7], SceneTileModel.verticesX[var8], SceneTileModel.verticesX[var9], var2.triangleTextureId[var6]);
						}
					} else {
						int var20 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.triangleTextureId[var6]);
						Rasterizer3D.method4908(var13, var14, var15, var10, var11, var12, var16, var17, var18, Scene.method5081(var20, var2.triangleColorA[var6]), Scene.method5081(var20, var2.triangleColorB[var6]), Scene.method5081(var20, var2.triangleColorC[var6]));
					}
				} else if (var2.triangleColorA[var6] != 12345678) {
					Rasterizer3D.method4908(var13, var14, var15, var10, var11, var12, var16, var17, var18, var2.triangleColorA[var6], var2.triangleColorB[var6], var2.triangleColorC[var6]);
				}
			}
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgc;",
		garbageValue = "111"
	)
	@Export("VarpDefinition_get")
	public static VarpDefinition VarpDefinition_get(int var0) {
		VarpDefinition var1 = (VarpDefinition)VarpDefinition.VarpDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class546.VarpDefinition_archive.takeFile(16, var0);
			var1 = new VarpDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			VarpDefinition.VarpDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ltn;Ltn;II)V",
		garbageValue = "1740574118"
	)
	public static void method5413(class515 var0, class515 var1, int var2) {
		class150.method3792(var0, (class570)null, true);
		class267.method6013(var1, var0.field5399);
		if (var2 >= 0 && var2 <= var0.field5401 * -519676011) {
			if (var1.field5401 * -519676011 != 0) {
				var0.method10398(var0.field5401 * -519676011 + var1.field5401 * -519676011);
				if (var2 < var0.field5401 * -519676011) {
					class401.method8272(var0, var2, var0, var1.field5401 * -519676011 + var2, var0.field5401 * -519676011 - var2);
				}

				class401.method8272(var1, 0, var0, var2, var1.field5401 * -519676011);
				var0.field5401 += var1.field5401;
			}
		} else {
			throw new RuntimeException();
		}
	}
}
