import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ic")
@Implements("FloatProjection")
public class FloatProjection extends Projection {
	@ObfuscatedName("pn")
	static int[] field2737;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lrr;"
	)
	@Export("transformationMatrix")
	TransformationMatrix transformationMatrix;
	@ObfuscatedName("ab")
	@Export("projection")
	float[] projection;

	@ObfuscatedSignature(
		descriptor = "(Lrr;)V"
	)
	FloatProjection(TransformationMatrix var1) {
		this.projection = new float[3];
		this.transformationMatrix = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Liq;IIIIJ)V"
	)
	@Export("draw")
	void draw(Renderable var1, int var2, int var3, int var4, int var5, long var6) {
		var1.draw(var2, this.transformationMatrix, var3, var4, var5, var6);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Liy;Ljt;IIII)V",
		garbageValue = "-1433574360"
	)
	@Export("drawTileUnderlay")
	void drawTileUnderlay(Scene var1, SceneTilePaint var2, int var3, int var4, int var5) {
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
						this.method5401(var1, var2, var4, var5, var7, var11, var10, var6, var14, var15, var16, var17, var9, var8, var13, var12);
					}
				}
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Liy;Ljy;IIB)V",
		garbageValue = "-15"
	)
	@Export("drawTileOverlay")
	void drawTileOverlay(Scene var1, SceneTileModel var2, int var3, int var4) {
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
				SceneTileModel.field2799[var6] = (int)var8;
				SceneTileModel.verticesX[var6] = (int)var9;
			}

			SceneTileModel.field2808[var6] = (float)Rasterizer3D.getClipMidX() + var7 * (float)Rasterizer3D.get3dZoom() / var9;
			SceneTileModel.field2795[var6] = (float)Rasterizer3D.getClipMidY() + var8 * (float)Rasterizer3D.get3dZoom() / var9;
			SceneTileModel.field2806[var6] = ClanSettings.method3890(var9);
		}

		this.drawSceneTileModel(var1, var2, var3, var4);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lpx;Lpx;ZLru;B)V",
		garbageValue = "-84"
	)
	public static void method5345(AbstractArchive var0, AbstractArchive var1, boolean var2, Font var3) {
		class329.ItemDefinition_archive = var0;
		ItemComposition.ItemDefinition_modelArchive = var1;
		ItemComposition.ItemDefinition_inMembersWorld = var2;
		class142.ItemDefinition_fileCount = class329.ItemDefinition_archive.getGroupFileCount(10);
		class357.ItemDefinition_fontPlain11 = var3;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "40"
	)
	static int method5335() {
		return Login.loginIndex;
	}
}
