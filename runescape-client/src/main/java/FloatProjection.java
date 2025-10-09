import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("is")
@Implements("FloatProjection")
public class FloatProjection extends Projection {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	@Export("transformationMatrix")
	TransformationMatrix transformationMatrix;
	@ObfuscatedName("at")
	@Export("projection")
	float[] projection;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		longValue = -3020040893522980731L
	)
	long field2788;

	@ObfuscatedSignature(
		descriptor = "(Lrz;)V"
	)
	FloatProjection(TransformationMatrix var1) {
		this.projection = new float[3];
		this.field2788 = 0L;
		this.transformationMatrix = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Liy;IIIIJ)V"
	)
	@Export("draw")
	void draw(Renderable var1, int var2, int var3, int var4, int var5, long var6) {
		int var8 = ViewportMouse.ViewportMouse_entityCount + 1;
		if (0L != this.field2788) {
			boolean var10 = LoginState.method798(var6);
			boolean var11 = !var10 || LoginState.method798(this.field2788);
			if (var11) {
				var6 = WorldMapSection2.method6436(this.field2788);
			}
		}

		var1.draw(var2, this.transformationMatrix, var3, var4, var5, var6);
		if (this.field2788 != 0L) {
			int var12 = ViewportMouse.ViewportMouse_entityCount + 1;
			if (var12 != var8) {
				this.field2788 = ClanChannelMember.calculateTag(0, 0, 0, 5, !LoginState.method798(this.field2788), 0, 0);
			}
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lih;Ljw;IIII)V",
		garbageValue = "880043785"
	)
	@Export("drawTileUnderlay")
	void drawTileUnderlay(Scene var1, SceneTilePaint var2, int var3, int var4, int var5) {
		if (Rasterizer3D.clips.field2999 != 1) {
			float var6;
			float var7 = var6 = (float)(var4 << 7);
			float var8;
			float var9 = var8 = (float)(var5 << 7);
			float var10;
			float var11 = var10 = var7 + 128.0F;
			float var12;
			float var13 = var12 = 128.0F + var9;
			float var14 = (float)var1.tileHeights[var3][var4][var5];
			float var15 = (float)var1.tileHeights[var3][var4 + 1][var5];
			float var16 = (float)var1.tileHeights[var3][var4 + 1][var5 + 1];
			float var17 = (float)var1.tileHeights[var3][var4][var5 + 1];
			this.transformationMatrix.transformPoint(var7, var14, var9, this.projection);
			var7 = this.projection[0];
			var14 = this.projection[1];
			var9 = this.projection[2];
			if (var9 >= 50.0F) {
				this.transformationMatrix.transformPoint(var11, var15, var8, this.projection);
				var11 = this.projection[0];
				var15 = this.projection[1];
				var8 = this.projection[2];
				if (var8 >= 50.0F) {
					this.transformationMatrix.transformPoint(var10, var16, var13, this.projection);
					var10 = this.projection[0];
					var16 = this.projection[1];
					var13 = this.projection[2];
					if (var13 >= 50.0F) {
						this.transformationMatrix.transformPoint(var6, var17, var12, this.projection);
						var6 = this.projection[0];
						var17 = this.projection[1];
						var12 = this.projection[2];
						if (var12 >= 50.0F) {
							this.drawSceneTilePaint(var1, var2, var4, var5, var7, var11, var10, var6, var14, var15, var16, var17, var9, var8, var13, var12);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lih;Lje;IIB)V",
		garbageValue = "1"
	)
	@Export("drawTileOverlay")
	void drawTileOverlay(Scene var1, SceneTileModel var2, int var3, int var4) {
		if (Rasterizer3D.clips.field2999 != 1) {
			int var5 = var2.vertexX.length;

			for (int var6 = 0; var6 < var5; ++var6) {
				float var7 = (float)var2.vertexX[var6];
				float var8 = (float)var2.vertexY[var6];
				float var9 = (float)var2.vertexZ[var6];
				this.transformationMatrix.transformPoint(var7, var8, var9, this.projection);
				var7 = this.projection[0];
				var8 = this.projection[1];
				var9 = this.projection[2];
				if (var9 < 50.0F) {
					return;
				}

				if (var2.triangleTextureId != null) {
					SceneTileModel.triangleTexturesX[var6] = (int)var7;
					SceneTileModel.triangleTexturesY[var6] = (int)var8;
					SceneTileModel.triangleTexturesZ[var6] = (int)var9;
				}

				SceneTileModel.verticesX[var6] = (float)Rasterizer3D.getClipMidX() + var7 * (float)Rasterizer3D.get3dZoom() / var9;
				SceneTileModel.verticesY[var6] = (float)Rasterizer3D.getClipMidY() + var8 * (float)Rasterizer3D.get3dZoom() / var9;
				SceneTileModel.verticesZ[var6] = MouseHandler.method724(var9);
			}

			this.drawSceneTileModel(var1, var2, var3, var4);
		}
	}

	@ObfuscatedName("ap")
	void method5416(long var1) {
		this.field2788 = var1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "([J[Ljava/lang/Object;IIS)V",
		garbageValue = "1774"
	)
	public static void method5415(long[] var0, Object[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			long var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			Object var8 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var8;
			int var9 = var6 == Long.MAX_VALUE ? 0 : 1;

			for (int var10 = var2; var10 < var3; ++var10) {
				if (var0[var10] < var6 + (long)(var10 & var9)) {
					long var11 = var0[var10];
					var0[var10] = var0[var5];
					var0[var5] = var11;
					Object var13 = var1[var10];
					var1[var10] = var1[var5];
					var1[var5++] = var13;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var8;
			method5415(var0, var1, var2, var5 - 1);
			method5415(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ltl;Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-154508597"
	)
	public static String method5429(DynamicArray var0, String var1) {
		DefaultsGroup.method10548(var0, class572.field5877);
		int var2 = var0.method10433();
		String[] var3 = (String[])((String[])var0.method10428());
		if (var2 == 0) {
			return "";
		} else if (var2 == 1) {
			return var3[0];
		} else {
			int var4 = var1.length();
			int var5 = var4 * (var2 - 1);

			for (int var6 = 0; var6 < var2; ++var6) {
				var5 += var3[var6].length();
			}

			char[] var9 = new char[var5];
			int var7 = 0;

			for (int var8 = 0; var8 < var2; ++var8) {
				if (var8 > 0) {
					var1.getChars(0, var4, var9, var7);
					var7 += var4;
				}

				var3[var8].getChars(0, var3[var8].length(), var9, var7);
				var7 += var3[var8].length();
			}

			return new String(var9);
		}
	}
}
