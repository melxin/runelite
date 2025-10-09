import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("im")
@Implements("IntProjection")
public class IntProjection extends Projection {
	@ObfuscatedName("lj")
	static String field2650;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1771633749
	)
	@Export("cameraX")
	int cameraX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1492259443
	)
	@Export("cameraY")
	int cameraY;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 219410387
	)
	@Export("cameraZ")
	int cameraZ;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 704062055
	)
	@Export("cameraPitch")
	int cameraPitch;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1075936931
	)
	@Export("cameraYaw2")
	int cameraYaw2;
	@ObfuscatedName("af")
	@Export("pitchSin")
	float pitchSin;
	@ObfuscatedName("ae")
	@Export("pitchCos")
	float pitchCos;
	@ObfuscatedName("aq")
	@Export("yawSin")
	float yawSin;
	@ObfuscatedName("ac")
	@Export("yawCos")
	float yawCos;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1727663787
	)
	int field2642;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1568519403
	)
	int field2651;

	IntProjection(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.cameraX = var1;
		this.cameraY = var2;
		this.cameraZ = var3;
		this.cameraPitch = var4;
		this.cameraYaw2 = var5;
		this.pitchSin = Rasterizer3D.field2636[var4];
		this.pitchCos = Rasterizer3D.field2632[var4];
		this.yawSin = Rasterizer3D.field2636[var5];
		this.yawCos = Rasterizer3D.field2632[var5];
		this.field2642 = var6;
		this.field2651 = var7;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Liy;IIIIJ)V"
	)
	@Export("draw")
	void draw(Renderable var1, int var2, int var3, int var4, int var5, long var6) {
		var1.vmethod5554(var2, this.cameraPitch, this.cameraYaw2, var3, var4, var5, this.cameraX, this.cameraY, this.cameraZ, var6, this.field2642, this.field2651, false);
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
			float var7 = var6 = (float)((var4 << 7) - this.cameraX);
			float var8;
			float var9 = var8 = (float)((var5 << 7) - this.cameraZ);
			float var10;
			float var11 = var10 = var7 + 128.0F;
			float var12;
			float var13 = var12 = 128.0F + var9;
			float var14 = (float)(var1.tileHeights[var3][var4][var5] - this.cameraY);
			float var15 = (float)(var1.tileHeights[var3][var4 + 1][var5] - this.cameraY);
			float var16 = (float)(var1.tileHeights[var3][var4 + 1][var5 + 1] - this.cameraY);
			float var17 = (float)(var1.tileHeights[var3][var4][var5 + 1] - this.cameraY);
			float var18 = var7 * this.yawCos + this.yawSin * var9;
			var9 = var9 * this.yawCos - this.yawSin * var7;
			var7 = var18;
			var18 = var14 * this.pitchCos - var9 * this.pitchSin;
			var9 = this.pitchCos * var9 + this.pitchSin * var14;
			var14 = var18;
			if (var9 >= 50.0F) {
				var18 = var8 * this.yawSin + var11 * this.yawCos;
				var8 = var8 * this.yawCos - this.yawSin * var11;
				var11 = var18;
				var18 = this.pitchCos * var15 - this.pitchSin * var8;
				var8 = var8 * this.pitchCos + var15 * this.pitchSin;
				var15 = var18;
				if (var8 >= 50.0F) {
					var18 = this.yawSin * var13 + this.yawCos * var10;
					var13 = this.yawCos * var13 - var10 * this.yawSin;
					var10 = var18;
					var18 = var16 * this.pitchCos - this.pitchSin * var13;
					var13 = var13 * this.pitchCos + this.pitchSin * var16;
					var16 = var18;
					if (var13 >= 50.0F) {
						var18 = this.yawCos * var6 + this.yawSin * var12;
						var12 = var12 * this.yawCos - var6 * this.yawSin;
						var6 = var18;
						var18 = this.pitchCos * var17 - var12 * this.pitchSin;
						var12 = var17 * this.pitchSin + var12 * this.pitchCos;
						if (var12 >= 50.0F) {
							this.drawSceneTilePaint(var1, var2, var4, var5, var7, var11, var10, var6, var14, var15, var16, var18, var9, var8, var13, var12);
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
				float var7 = (float)(var2.vertexX[var6] - this.cameraX);
				float var8 = (float)(var2.vertexY[var6] - this.cameraY);
				float var9 = (float)(var2.vertexZ[var6] - this.cameraZ);
				float var10 = var9 * this.yawSin + var7 * this.yawCos;
				var9 = var9 * this.yawCos - this.yawSin * var7;
				var7 = var10;
				var10 = this.pitchCos * var8 - this.pitchSin * var9;
				var9 = var9 * this.pitchCos + var8 * this.pitchSin;
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
				SceneTileModel.verticesZ[var6] = MouseHandler.method724(var9);
			}

			this.drawSceneTileModel(var1, var2, var3, var4);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-119"
	)
	public static void method5075() {
		InvDefinition.InvDefinition_cached.clear();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-47"
	)
	static final void method5086(String var0) {
		Frames.method5459(var0 + " is already on your ignore list");
	}
}
