import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jz")
@Implements("IntProjection")
public class IntProjection extends Projection {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1962663199
	)
	@Export("cameraX")
	int cameraX;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1002569507
	)
	@Export("cameraY")
	int cameraY;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 633492853
	)
	@Export("cameraZ")
	int cameraZ;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1529937537
	)
	@Export("cameraPitch")
	int cameraPitch;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1949089315
	)
	@Export("cameraYaw")
	int cameraYaw;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -629026203
	)
	@Export("pitchSin")
	int pitchSin;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 931895999
	)
	@Export("pitchCos")
	int pitchCos;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 448821199
	)
	@Export("yawSin")
	int yawSin;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1458615833
	)
	@Export("yawCos")
	int yawCos;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 2004858683
	)
	int field2612;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -486018923
	)
	int field2613;

	IntProjection(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.cameraX = var1;
		this.cameraY = var2;
		this.cameraZ = var3;
		this.cameraPitch = var4;
		this.cameraYaw = var5;
		this.pitchSin = Rasterizer3D.Rasterizer3D_sine[var4];
		this.pitchCos = Rasterizer3D.Rasterizer3D_cosine[var4];
		this.yawSin = Rasterizer3D.Rasterizer3D_sine[var5];
		this.yawCos = Rasterizer3D.Rasterizer3D_cosine[var5];
		this.field2612 = var6;
		this.field2613 = var7;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lji;IIIIJ)V"
	)
	@Export("draw")
	void draw(Renderable var1, int var2, int var3, int var4, int var5, long var6) {
		var1.vmethod5270(var2, this.cameraPitch, this.cameraYaw, var3, var4, var5, this.cameraX, this.cameraY, this.cameraZ, var6, this.field2612, this.field2613, false);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljp;Lje;IIIB)V",
		garbageValue = "36"
	)
	@Export("drawTileUnderlay")
	void drawTileUnderlay(Scene var1, SceneTilePaint var2, int var3, int var4, int var5) {
		int var6;
		int var7 = var6 = (var4 << 7) - this.cameraX;
		int var8;
		int var9 = var8 = (var5 << 7) - this.cameraZ;
		int var10;
		int var11 = var10 = var7 + 128;
		int var12;
		int var13 = var12 = var9 + 128;
		int var14 = var1.tileHeights[var3][var4][var5] - this.cameraY;
		int var15 = var1.tileHeights[var3][var4 + 1][var5] - this.cameraY;
		int var16 = var1.tileHeights[var3][var4 + 1][var5 + 1] - this.cameraY;
		int var17 = var1.tileHeights[var3][var4][var5 + 1] - this.cameraY;
		int var18 = var9 * this.yawSin + var7 * this.yawCos >> 16;
		var9 = var9 * this.yawCos - var7 * this.yawSin >> 16;
		var7 = var18;
		var18 = var14 * this.pitchCos - var9 * this.pitchSin >> 16;
		var9 = var14 * this.pitchSin + var9 * this.pitchCos >> 16;
		var14 = var18;
		if (var9 >= 50) {
			var18 = var8 * this.yawSin + var11 * this.yawCos >> 16;
			var8 = var8 * this.yawCos - var11 * this.yawSin >> 16;
			var11 = var18;
			var18 = var15 * this.pitchCos - var8 * this.pitchSin >> 16;
			var8 = var8 * this.pitchCos + var15 * this.pitchSin >> 16;
			var15 = var18;
			if (var8 >= 50) {
				var18 = var10 * this.yawCos + var13 * this.yawSin >> 16;
				var13 = var13 * this.yawCos - var10 * this.yawSin >> 16;
				var10 = var18;
				var18 = var16 * this.pitchCos - var13 * this.pitchSin >> 16;
				var13 = var13 * this.pitchCos + var16 * this.pitchSin >> 16;
				var16 = var18;
				if (var13 >= 50) {
					var18 = var6 * this.yawCos + var12 * this.yawSin >> 16;
					var12 = var12 * this.yawCos - var6 * this.yawSin >> 16;
					var6 = var18;
					var18 = var17 * this.pitchCos - var12 * this.pitchSin >> 16;
					var12 = var17 * this.pitchSin + var12 * this.pitchCos >> 16;
					if (var12 >= 50) {
						this.drawSceneTilePaint(var1, var2, var4, var5, var7, var11, var10, var6, var14, var15, var16, var18, var9, var8, var13, var12);
					}
				}
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljp;Ljq;III)V",
		garbageValue = "-1019162740"
	)
	@Export("drawTileOverlay")
	void drawTileOverlay(Scene var1, SceneTileModel var2, int var3, int var4) {
		int var5 = var2.vertexX.length;

		for (int var6 = 0; var6 < var5; ++var6) {
			int var7 = var2.vertexX[var6] - this.cameraX;
			int var8 = var2.vertexY[var6] - this.cameraY;
			int var9 = var2.vertexZ[var6] - this.cameraZ;
			int var10 = var9 * this.yawSin + var7 * this.yawCos >> 16;
			var9 = var9 * this.yawCos - var7 * this.yawSin >> 16;
			var7 = var10;
			var10 = var8 * this.pitchCos - var9 * this.pitchSin >> 16;
			var9 = var8 * this.pitchSin + var9 * this.pitchCos >> 16;
			if (var9 < 50) {
				return;
			}

			if (var2.triangleTextureId != null) {
				SceneTileModel.triangleTexturesX[var6] = var7;
				SceneTileModel.triangleTexturesY[var6] = var10;
				SceneTileModel.triangleTexturesZ[var6] = var9;
			}

			SceneTileModel.verticesX[var6] = Rasterizer3D.getClipMidX() + var7 * Rasterizer3D.get3dZoom() / var9;
			SceneTileModel.verticesY[var6] = Rasterizer3D.getClipMidY() + var10 * Rasterizer3D.get3dZoom() / var9;
			SceneTileModel.verticesZ[var6] = Decimator.method1117(var9);
		}

		this.drawSceneTileModel(var1, var2, var3, var4);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1171963393"
	)
	public static int method4794(int var0, int var1) {
		int var2;
		for (var2 = 0; var1 > 0; --var1) {
			var2 = var2 << 1 | var0 & 1;
			var0 >>>= 1;
		}

		return var2;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ILnp;IIIII[FS)Lnp;",
		garbageValue = "9858"
	)
	static Widget method4802(int var0, Widget var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
		Widget var8 = new Widget();
		var8.type = var0;
		var8.parentId = var1.id;
		var8.childIndex = var2;
		var8.isIf3 = true;
		var8.xAlignment = var3;
		var8.yAlignment = var4;
		var8.widthAlignment = var5;
		var8.heightAlignment = var6;
		var8.rawX = (int)(var7[0] * (float)(var1.width));
		var8.rawY = (int)((float)(var1.height) * var7[1]);
		var8.rawWidth = (int)(var7[2] * (float)(var1.width));
		var8.rawHeight = (int)((float)(var1.height) * var7[3]);
		return var8;
	}
}
