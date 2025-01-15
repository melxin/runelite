import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hg")
@Implements("IntProjection")
public class IntProjection extends Projection {
	@ObfuscatedName("ji")
	@ObfuscatedGetter(
		intValue = 2009752845
	)
	static int field1966;
	@ObfuscatedName("kp")
	@ObfuscatedGetter(
		intValue = 433204117
	)
	@Export("cameraYaw")
	static int cameraYaw;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -353137283
	)
	@Export("cameraX")
	int cameraX;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1352147805
	)
	@Export("cameraY")
	int cameraY;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -2132346569
	)
	@Export("cameraZ")
	int cameraZ;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1144738481
	)
	@Export("cameraPitch")
	int cameraPitch;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1079699413
	)
	@Export("cameraYaw2")
	int cameraYaw2;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1738765779
	)
	@Export("pitchSin")
	int pitchSin;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1946329855
	)
	@Export("pitchCos")
	int pitchCos;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -184582315
	)
	@Export("yawSin")
	int yawSin;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -346578271
	)
	@Export("yawCos")
	int yawCos;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -531791061
	)
	int field1970;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1754429917
	)
	int field1971;

	IntProjection(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.cameraX = var1;
		this.cameraY = var2;
		this.cameraZ = var3;
		this.cameraPitch = var4;
		this.cameraYaw2 = var5;
		this.pitchSin = Rasterizer3D.Rasterizer3D_sine[var4];
		this.pitchCos = Rasterizer3D.Rasterizer3D_cosine[var4];
		this.yawSin = Rasterizer3D.Rasterizer3D_sine[var5];
		this.yawCos = Rasterizer3D.Rasterizer3D_cosine[var5];
		this.field1970 = var6;
		this.field1971 = var7;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lhs;IIIIJ)V"
	)
	@Export("draw")
	void draw(Renderable var1, int var2, int var3, int var4, int var5, long var6) {
		var1.vmethod4616(var2, this.cameraPitch, this.cameraYaw2, var3, var4, var5, this.cameraX, this.cameraY, this.cameraZ, var6, this.field1970, this.field1971, false);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lhj;Lhz;IIII)V",
		garbageValue = "54431755"
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
		var9 = var9 * this.pitchCos + var14 * this.pitchSin >> 16;
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
					var12 = var12 * this.pitchCos + var17 * this.pitchSin >> 16;
					if (var12 >= 50) {
						this.drawSceneTilePaint(var1, var2, var4, var5, var7, var11, var10, var6, var14, var15, var16, var18, var9, var8, var13, var12);
					}
				}
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lhj;Lho;IIB)V",
		garbageValue = "-59"
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
			var9 = var9 * this.pitchCos + var8 * this.pitchSin >> 16;
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
			SceneTileModel.verticesZ[var6] = HttpResponse.method298(var9);
		}

		this.drawSceneTileModel(var1, var2, var3, var4);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Lkd;",
		garbageValue = "1793206579"
	)
	public static HitSplatDefinition method4104(int var0) {
		HitSplatDefinition var1 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var0);
			var1 = new HitSplatDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			HitSplatDefinition.HitSplatDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
