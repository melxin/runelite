import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iv")
@Implements("IntProjection")
public class IntProjection extends Projection {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -68637557
	)
	@Export("cameraX")
	int cameraX;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -422254313
	)
	@Export("cameraY")
	int cameraY;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1935077757
	)
	@Export("cameraZ")
	int cameraZ;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1836711867
	)
	@Export("cameraPitch")
	int cameraPitch;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1805728625
	)
	@Export("cameraYaw2")
	int cameraYaw2;
	@ObfuscatedName("aq")
	@Export("pitchSin")
	float pitchSin;
	@ObfuscatedName("ao")
	@Export("pitchCos")
	float pitchCos;
	@ObfuscatedName("as")
	@Export("yawSin")
	float yawSin;
	@ObfuscatedName("al")
	@Export("yawCos")
	float yawCos;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 612208117
	)
	int field2644;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -228335611
	)
	int field2652;

	IntProjection(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.cameraX = var1;
		this.cameraY = var2;
		this.cameraZ = var3;
		this.cameraPitch = var4;
		this.cameraYaw2 = var5;
		this.pitchSin = Rasterizer3D.field2630[var4];
		this.pitchCos = Rasterizer3D.field2638[var4];
		this.yawSin = Rasterizer3D.field2630[var5];
		this.yawCos = Rasterizer3D.field2638[var5];
		this.field2644 = var6;
		this.field2652 = var7;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Liz;IIIIJ)V"
	)
	@Export("draw")
	void draw(Renderable var1, int var2, int var3, int var4, int var5, long var6) {
		var1.vmethod5531(var2, this.cameraPitch, this.cameraYaw2, var3, var4, var5, this.cameraX, this.cameraY, this.cameraZ, var6, this.field2644, this.field2652, false);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lit;Ljt;IIIB)V",
		garbageValue = "1"
	)
	@Export("drawTileUnderlay")
	void drawTileUnderlay(Scene var1, SceneTilePaint var2, int var3, int var4, int var5) {
		float var6;
		float var7 = var6 = (float)((var4 << 7) - this.cameraX);
		float var8;
		float var9 = var8 = (float)((var5 << 7) - this.cameraZ);
		float var10;
		float var11 = var10 = var7 + 128.0F;
		float var12;
		float var13 = var12 = var9 + 128.0F;
		float var14 = (float)(var1.tileHeights[var3][var4][var5] - this.cameraY);
		float var15 = (float)(var1.tileHeights[var3][var4 + 1][var5] - this.cameraY);
		float var16 = (float)(var1.tileHeights[var3][var4 + 1][var5 + 1] - this.cameraY);
		float var17 = (float)(var1.tileHeights[var3][var4][var5 + 1] - this.cameraY);
		float var18 = var9 * this.yawSin + this.yawCos * var7;
		var9 = var9 * this.yawCos - this.yawSin * var7;
		var7 = var18;
		var18 = var14 * this.pitchCos - var9 * this.pitchSin;
		var9 = var9 * this.pitchCos + this.pitchSin * var14;
		var14 = var18;
		if (var9 >= 50.0F) {
			var18 = var11 * this.yawCos + var8 * this.yawSin;
			var8 = this.yawCos * var8 - this.yawSin * var11;
			var11 = var18;
			var18 = var15 * this.pitchCos - var8 * this.pitchSin;
			var8 = this.pitchCos * var8 + this.pitchSin * var15;
			var15 = var18;
			if (var8 >= 50.0F) {
				var18 = var10 * this.yawCos + var13 * this.yawSin;
				var13 = var13 * this.yawCos - var10 * this.yawSin;
				var10 = var18;
				var18 = this.pitchCos * var16 - var13 * this.pitchSin;
				var13 = var16 * this.pitchSin + var13 * this.pitchCos;
				var16 = var18;
				if (var13 >= 50.0F) {
					var18 = var6 * this.yawCos + this.yawSin * var12;
					var12 = var12 * this.yawCos - this.yawSin * var6;
					var6 = var18;
					var18 = var17 * this.pitchCos - var12 * this.pitchSin;
					var12 = this.pitchSin * var17 + this.pitchCos * var12;
					if (var12 >= 50.0F) {
						this.drawSceneTilePaint(var1, var2, var4, var5, var7, var11, var10, var6, var14, var15, var16, var18, var9, var8, var13, var12);
					}
				}
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lit;Ljp;III)V",
		garbageValue = "-535692172"
	)
	@Export("drawTileOverlay")
	void drawTileOverlay(Scene var1, SceneTileModel var2, int var3, int var4) {
		int var5 = var2.vertexX.length;

		for (int var6 = 0; var6 < var5; ++var6) {
			float var7 = (float)(var2.vertexX[var6] - this.cameraX);
			float var8 = (float)(var2.vertexY[var6] - this.cameraY);
			float var9 = (float)(var2.vertexZ[var6] - this.cameraZ);
			float var10 = var7 * this.yawCos + this.yawSin * var9;
			var9 = this.yawCos * var9 - var7 * this.yawSin;
			var7 = var10;
			var10 = this.pitchCos * var8 - var9 * this.pitchSin;
			var9 = var8 * this.pitchSin + this.pitchCos * var9;
			if (var9 < 50.0F) {
				return;
			}

			if (var2.triangleTextureId != null) {
				SceneTileModel.triangleTexturesX[var6] = (int)var7;
				SceneTileModel.triangleTexturesY[var6] = (int)var10;
				SceneTileModel.triangleTexturesZ[var6] = (int)var9;
			}

			SceneTileModel.verticesX[var6] = (float)Rasterizer3D.getClipMidX() + var7 * (float)Rasterizer3D.get3dZoom() / var9;
			SceneTileModel.verticesY[var6] = (float)Rasterizer3D.getClipMidY() + var10 * (float)Rasterizer3D.get3dZoom() / var9;
			SceneTileModel.verticesZ[var6] = class145.method3742(var9);
		}

		this.drawSceneTileModel(var1, var2, var3, var4);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)I",
		garbageValue = "1398389523"
	)
	static int method5014(AbstractArchive var0) {
		int var1 = Login.field759.length + Login.field760.length;
		String[] var2 = Login.field761;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			String var4 = var2[var3];
			if (var0.getGroupId(var4) != -1) {
				++var1;
			}
		}

		return var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "-1923815146"
	)
	public static void method5022(AbstractArchive var0) {
		FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var0;
	}
}
