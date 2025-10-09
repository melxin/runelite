import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jf")
@Implements("Projection")
public abstract class Projection {
	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	@Export("archive10")
	static Archive archive10;

	Projection() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Liy;IIIIJ)V"
	)
	@Export("draw")
	abstract void draw(Renderable var1, int var2, int var3, int var4, int var5, long var6);

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lih;Ljw;IIII)V",
		garbageValue = "880043785"
	)
	@Export("drawTileUnderlay")
	abstract void drawTileUnderlay(Scene var1, SceneTilePaint var2, int var3, int var4, int var5);

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lih;Lje;IIB)V",
		garbageValue = "1"
	)
	@Export("drawTileOverlay")
	abstract void drawTileOverlay(Scene var1, SceneTileModel var2, int var3, int var4);

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lih;Ljw;IIFFFFFFFFFFFFB)V",
		garbageValue = "78"
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
		float var25 = MouseHandler.method724(var13);
		float var26 = MouseHandler.method724(var14);
		float var27 = MouseHandler.method724(var15);
		float var28 = MouseHandler.method724(var16);
		Rasterizer3D.clips.currentFaceAlpha = 0;
		int var29;
		float var30;
		int var31;
		if ((var20 - var24) * (var21 - var23) - (var22 - var24) * (var19 - var23) > 0.0F) {
			Rasterizer3D.clips.clipping = false;
			var29 = Rasterizer3D.method5026();
			if (var21 < 0.0F || var23 < 0.0F || var19 < 0.0F || var21 > (float)var29 || var23 > (float)var29 || var19 > (float)var29) {
				Rasterizer3D.clips.clipping = true;
			}

			if (Scene.containsBounds(var1.Scene_selectedScreenX, var1.Scene_selectedScreenY, (int)var22, (int)var24, (int)var20, (int)var21, (int)var23, (int)var19)) {
				var30 = WorldMapRenderer.method6669(var1.Scene_selectedScreenX, var1.Scene_selectedScreenY, (int)var21, (int)var23, (int)var19, (int)var22, (int)var24, (int)var20, var27, var28, var26);
				if (var30 > var1.field2714) {
					var1.Scene_baseX = var3;
					var1.Scene_baseY = var4;
					var1.field2714 = var30;
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
				Rasterizer3D.rasterGouraud(var22, var24, var20, var21, var23, var19, var27, var28, var26, Scene.method5240(var31, var2.neColor), Scene.method5240(var31, var2.nwColor), Scene.method5240(var31, var2.seColor));
			}
		}

		if ((var17 - var19) * (var24 - var20) - (var23 - var19) * (var18 - var20) > 0.0F) {
			Rasterizer3D.clips.clipping = false;
			var29 = Rasterizer3D.method5026();
			if (var17 < 0.0F || var19 < 0.0F || var23 < 0.0F || var17 > (float)var29 || var19 > (float)var29 || var23 > (float)var29) {
				Rasterizer3D.clips.clipping = true;
			}

			if (Scene.containsBounds(var1.Scene_selectedScreenX, var1.Scene_selectedScreenY, (int)var18, (int)var20, (int)var24, (int)var17, (int)var19, (int)var23)) {
				var30 = WorldMapRenderer.method6669(var1.Scene_selectedScreenX, var1.Scene_selectedScreenY, (int)var17, (int)var19, (int)var23, (int)var18, (int)var20, (int)var24, var25, var26, var28);
				if (var30 > var1.field2714) {
					var1.Scene_baseX = var3;
					var1.Scene_baseY = var4;
					var1.field2714 = var30;
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
				Rasterizer3D.rasterGouraud(var18, var20, var24, var17, var19, var23, var25, var26, var28, Scene.method5240(var31, var2.swColor), Scene.method5240(var31, var2.seColor), Scene.method5240(var31, var2.nwColor));
			}
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lih;Lje;IIB)V",
		garbageValue = "14"
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
				int var19 = Rasterizer3D.method5026();
				if (var10 < 0.0F || var11 < 0.0F || var12 < 0.0F || var10 > (float)var19 || var11 > (float)var19 || var12 > (float)var19) {
					Rasterizer3D.clips.clipping = true;
				}

				if (Scene.containsBounds(var1.Scene_selectedScreenX, var1.Scene_selectedScreenY, (int)var13, (int)var14, (int)var15, (int)var10, (int)var11, (int)var12)) {
					float var20 = WorldMapRenderer.method6669(var1.Scene_selectedScreenX, var1.Scene_selectedScreenY, (int)var10, (int)var11, (int)var12, (int)var13, (int)var14, (int)var15, var16, var17, var18);
					if (var20 > var1.field2714) {
						var1.Scene_baseX = var3;
						var1.Scene_baseY = var4;
						var1.field2714 = var20;
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
						Rasterizer3D.rasterGouraud(var13, var14, var15, var10, var11, var12, var16, var17, var18, Scene.method5240(var21, var2.triangleColorA[var6]), Scene.method5240(var21, var2.triangleColorB[var6]), Scene.method5240(var21, var2.triangleColorC[var6]));
					}
				} else if (var2.triangleColorA[var6] != 12345678) {
					Rasterizer3D.rasterGouraud(var13, var14, var15, var10, var11, var12, var16, var17, var18, var2.triangleColorA[var6], var2.triangleColorB[var6], var2.triangleColorC[var6]);
				}
			}
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-182550049"
	)
	public static void method5508() {
		try {
			JagexCache.JagexCache_dat2File.close();

			for (int var0 = 0; var0 < class153.field1788; ++var0) {
				JagexCache.JagexCache_idxFiles[var0].close();
			}

			JagexCache.JagexCache_idx255File.close();
			JagexCache.JagexCache_randomDat.close();
		} catch (Exception var2) {
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "([I[JIII)V",
		garbageValue = "1201318844"
	)
	public static void method5512(int[] var0, long[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			int var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			long var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;
			int var9 = var6 == Integer.MAX_VALUE ? 0 : 1;

			for (int var10 = var2; var10 < var3; ++var10) {
				if (var0[var10] > var6 - (var10 & var9)) {
					int var11 = var0[var10];
					var0[var10] = var0[var5];
					var0[var5] = var11;
					long var12 = var1[var10];
					var1[var10] = var1[var5];
					var1[var5++] = var12;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method5512(var0, var1, var2, var5 - 1);
			method5512(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ILcj;ZI)I",
		garbageValue = "1944694255"
	)
	static int method5509(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.ADD) {
			UrlRequest.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var9 + var4;
			return 1;
		} else if (var0 == ScriptOpcodes.SUB) {
			UrlRequest.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var9 - var4;
			return 1;
		} else if (var0 == ScriptOpcodes.MULTIPLY) {
			UrlRequest.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var9 * var4;
			return 1;
		} else if (var0 == ScriptOpcodes.DIV) {
			UrlRequest.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var9 / var4;
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOM) {
			var9 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var9);
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOMINC) {
			var9 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var9 + 1));
			return 1;
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) {
				UrlRequest.Interpreter_intStackSize -= 5;
				var9 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 3];
				var7 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 4];
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var9 + (var7 - var5) * (var4 - var9) / (var6 - var5);
				return 1;
			} else if (var0 == ScriptOpcodes.ADDPERCENT) {
				UrlRequest.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var9 + var4 * var9 / 100;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT) {
				UrlRequest.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var9 | 1 << var4;
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT) {
				UrlRequest.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var9 & -1 - (1 << var4);
				return 1;
			} else if (var0 == ScriptOpcodes.TESTBIT) {
				UrlRequest.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = (var9 & 1 << var4) != 0 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.MOD) {
				UrlRequest.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var9 % var4;
				return 1;
			} else if (var0 == ScriptOpcodes.POW) {
				UrlRequest.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
				if (var9 == 0) {
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, (double)var4);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.INVPOW) {
				UrlRequest.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
				if (var9 == 0) {
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
					return 1;
				} else {
					switch(var4) {
					case 0:
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Integer.MAX_VALUE;
						break;
					case 1:
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var9;
						break;
					case 2:
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var9);
						break;
					case 3:
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var9);
						break;
					case 4:
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var9));
						break;
					default:
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, 1.0D / (double)var4);
					}

					return 1;
				}
			} else if (var0 == ScriptOpcodes.AND) {
				UrlRequest.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var9 & var4;
				return 1;
			} else if (var0 == ScriptOpcodes.OR) {
				UrlRequest.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var9 | var4;
				return 1;
			} else if (var0 == 4016) {
				UrlRequest.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var9 < var4 ? var9 : var4;
				return 1;
			} else if (var0 == 4017) {
				UrlRequest.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var9 > var4 ? var9 : var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SCALE) {
				UrlRequest.Interpreter_intStackSize -= 3;
				long var10 = (long)Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
				long var12 = (long)Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
				long var14 = (long)Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = (int)(var10 * var14 / var12);
				return 1;
			} else if (var0 == ScriptOpcodes.BITCOUNT) {
				var9 = WorldMapScaleHandler.method6971(Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var9;
				return 1;
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) {
				UrlRequest.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var9 ^ 1 << var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) {
				UrlRequest.Interpreter_intStackSize -= 3;
				var9 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = class139.method3809(var9, var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) {
				UrlRequest.Interpreter_intStackSize -= 3;
				var9 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = BoundaryObject.method5835(var9, var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) {
				UrlRequest.Interpreter_intStackSize -= 3;
				var9 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 2];
				var6 = 31 - var5;
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var9 << var6 >>> var4 + var6;
				return 1;
			} else if (var0 == 4030) {
				UrlRequest.Interpreter_intStackSize -= 4;
				var9 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 3];
				var9 = BoundaryObject.method5835(var9, var5, var6);
				var7 = class172.method4149(var6 - var5 + 1);
				if (var4 > var7) {
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var9 | var4 << var5;
				return 1;
			} else if (var0 == 4032) {
				Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize - 1] = class442.method8934(Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4033) {
				Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize - 1] = HealthBarConfig.method2764(Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4034) {
				UrlRequest.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
				var5 = JagNetThread.method8517(var9, var4);
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var5;
				return 1;
			} else if (var0 == 4035) {
				Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4036) {
				String var3 = (String)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize];
				var4 = -1;
				if (class464.isNumber(var3)) {
					var4 = class349.method7392(var3);
				}

				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var4;
				return 1;
			} else {
				return 2;
			}
		}
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1255491931"
	)
	static final int method5495(int var0) {
		return Math.abs(var0 - SpriteBufferProperties.cameraYaw) > 1024 ? (var0 < SpriteBufferProperties.cameraYaw ? 1 : -1) * 2048 + var0 : var0;
	}

	@ObfuscatedName("ml")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lok;B)Ljava/lang/String;",
		garbageValue = "71"
	)
	static String method5494(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) {
			for (int var2 = 1; var2 <= 5; ++var2) {
				while (true) {
					int var3 = var0.indexOf("%" + var2);
					if (var3 == -1) {
						break;
					}

					String var4 = var0.substring(0, var3);
					int var6 = WorldMapDecoration.method6831(var1, var2 - 1);
					String var5;
					if (var6 < 999999999) {
						var5 = Integer.toString(var6);
					} else {
						var5 = "*";
					}

					var0 = var4 + var5 + var0.substring(var3 + 2);
				}
			}
		}

		return var0;
	}

	@ObfuscatedName("mt")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "-1928321886"
	)
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class35.widgetDefinition.loadInterface(var0)) {
			class443.updateInterface(class35.widgetDefinition.Widget_interfaceComponents[var0], 0, class35.widgetDefinition.Widget_interfaceComponents[var0].length - 1, -1, -1, var1, var2, var3, var4, var5, var6);
		}
	}
}
