import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hp")
@Implements("FloatProjection")
public class FloatProjection extends Projection {
	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	static Archive field2104;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	@Export("transformationMatrix")
	TransformationMatrix transformationMatrix;
	@ObfuscatedName("ah")
	@Export("projection")
	float[] projection;

	@ObfuscatedSignature(
		descriptor = "(Lqe;)V"
	)
	FloatProjection(TransformationMatrix var1) {
		this.projection = new float[3];
		this.transformationMatrix = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lhs;IIIIJ)V"
	)
	@Export("draw")
	void draw(Renderable var1, int var2, int var3, int var4, int var5, long var6) {
		var1.draw(var2, this.transformationMatrix, var3, var4, var5, var6);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lhj;Lhz;IIII)V",
		garbageValue = "54431755"
	)
	@Export("drawTileUnderlay")
	void drawTileUnderlay(Scene var1, SceneTilePaint var2, int var3, int var4, int var5) {
		int var6;
		int var7 = var6 = var4 << 7;
		int var8;
		int var9 = var8 = var5 << 7;
		int var10;
		int var11 = var10 = var7 + 128;
		int var12;
		int var13 = var12 = var9 + 128;
		int var14 = var1.tileHeights[var3][var4][var5];
		int var15 = var1.tileHeights[var3][var4 + 1][var5];
		int var16 = var1.tileHeights[var3][var4 + 1][var5 + 1];
		int var17 = var1.tileHeights[var3][var4][var5 + 1];
		this.transformationMatrix.transformPoint((float)var7, (float)var14, (float)var9, this.projection);
		var7 = (int)this.projection[0];
		var14 = (int)this.projection[1];
		var9 = (int)this.projection[2] | 1;
		this.transformationMatrix.transformPoint((float)var11, (float)var15, (float)var8, this.projection);
		var11 = (int)this.projection[0];
		var15 = (int)this.projection[1];
		var8 = (int)this.projection[2] | 1;
		this.transformationMatrix.transformPoint((float)var10, (float)var16, (float)var13, this.projection);
		var10 = (int)this.projection[0];
		var16 = (int)this.projection[1];
		var13 = (int)this.projection[2] | 1;
		this.transformationMatrix.transformPoint((float)var6, (float)var17, (float)var12, this.projection);
		var6 = (int)this.projection[0];
		var17 = (int)this.projection[1];
		var12 = (int)this.projection[2] | 1;
		this.drawSceneTilePaint(var1, var2, var4, var5, var7, var11, var10, var6, var14, var15, var16, var17, var9, var8, var13, var12);
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
			int var7 = var2.vertexX[var6];
			int var8 = var2.vertexY[var6];
			int var9 = var2.vertexZ[var6];
			this.transformationMatrix.transformPoint((float)var7, (float)var8, (float)var9, this.projection);
			var7 = (int)this.projection[0];
			var8 = (int)this.projection[1];
			var9 = (int)this.projection[2];
			if (var2.triangleTextureId != null) {
				SceneTileModel.triangleTexturesX[var6] = var7;
				SceneTileModel.triangleTexturesY[var6] = var8;
				SceneTileModel.triangleTexturesZ[var6] = var9;
			}

			var9 |= 1;
			SceneTileModel.verticesX[var6] = Rasterizer3D.getClipMidX() + var7 * Rasterizer3D.get3dZoom() / var9;
			SceneTileModel.verticesY[var6] = Rasterizer3D.getClipMidY() + var8 * Rasterizer3D.get3dZoom() / var9;
			SceneTileModel.verticesZ[var6] = HttpResponse.method298(var9);
		}

		this.drawSceneTileModel(var1, var2, var3, var4);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "345972941"
	)
	@Export("changeWorldSelectSorting")
	static void changeWorldSelectSorting(int var0, int var1) {
		int[] var2 = new int[4];
		int[] var3 = new int[4];
		var2[0] = var0;
		var3[0] = var1;
		int var4 = 1;

		for (int var5 = 0; var5 < 4; ++var5) {
			if (World.World_sortOption1[var5] != var0) {
				var2[var4] = World.World_sortOption1[var5];
				var3[var4] = World.World_sortOption2[var5];
				++var4;
			}
		}

		World.World_sortOption1 = var2;
		World.World_sortOption2 = var3;
		class159.sortWorlds(World.World_worlds, 0, World.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-947724231"
	)
	static final void method4437(int var0, int var1, boolean var2) {
		if (!var2 || var0 != AsyncRestClient.field62 || class133.field1554 != var1) {
			AsyncRestClient.field62 = var0;
			class133.field1554 = var1;
			class360.updateGameState(25);
			Client.field723 = true;
			class328.drawLoadingMessage("Loading - please wait.", true);
			int var3 = GameEngine.topLevelWorldView.baseX;
			int var4 = GameEngine.topLevelWorldView.baseY;
			GameEngine.topLevelWorldView.baseX = (var0 - 6) * 8;
			GameEngine.topLevelWorldView.baseY = (var1 - 6) * 8;
			int var5 = GameEngine.topLevelWorldView.baseX - var3;
			int var6 = GameEngine.topLevelWorldView.baseY - var4;
			int var7 = var5 * 128;
			int var8 = var6 * 128;

			int var9;
			int var11;
			int[] var10000;
			for (var9 = 0; var9 < 65536; ++var9) {
				NPC var21 = GameEngine.topLevelWorldView.npcs[var9];
				if (var21 != null) {
					for (var11 = 0; var11 < 10; ++var11) {
						var10000 = var21.pathX;
						var10000[var11] -= var5;
						var10000 = var21.pathY;
						var10000[var11] -= var6;
					}

					var21.x -= var7;
					var21.y -= var8;
					var21.field1247 -= var5;
					var21.field1249 -= var6;
					var21.field1248 -= var5;
					var21.field1250 -= var6;
				}
			}

			for (var9 = 0; var9 < 2048; ++var9) {
				Player var24 = GameEngine.topLevelWorldView.players[var9];
				if (var24 != null) {
					for (var11 = 0; var11 < 10; ++var11) {
						var10000 = var24.pathX;
						var10000[var11] -= var5;
						var10000 = var24.pathY;
						var10000[var11] -= var6;
					}

					var24.x -= var7;
					var24.y -= var8;
					var24.field1247 -= var5;
					var24.field1249 -= var6;
					var24.field1248 -= var5;
					var24.field1250 -= var6;
				}
			}

			for (var9 = 0; var9 < 2048; ++var9) {
				WorldEntity var25 = GameEngine.topLevelWorldView.worldEntities[var9];
				if (var25 != null) {
					var25.setPosition(-var7, -var8);
				}
			}

			byte var22 = 0;
			byte var10 = 104;
			byte var23 = 1;
			if (var5 < 0) {
				var22 = 103;
				var10 = -1;
				var23 = -1;
			}

			byte var12 = 0;
			byte var13 = 104;
			byte var14 = 1;
			if (var6 < 0) {
				var12 = 103;
				var13 = -1;
				var14 = -1;
			}

			int var16;
			for (int var15 = var22; var10 != var15; var15 += var23) {
				for (var16 = var12; var16 != var13; var16 += var14) {
					int var17 = var15 + var5;
					int var18 = var6 + var16;

					for (int var19 = 0; var19 < 4; ++var19) {
						if (0 <= var17 && var17 < 104 && 0 <= var18 && var18 < 104) {
							GameEngine.topLevelWorldView.groundItems[var19][var15][var16] = GameEngine.topLevelWorldView.groundItems[var19][var17][var18];
						} else {
							GameEngine.topLevelWorldView.groundItems[var19][var15][var16] = null;
						}
					}
				}
			}

			for (PendingSpawn var20 = (PendingSpawn)GameEngine.topLevelWorldView.pendingSpawns.last(); var20 != null; var20 = (PendingSpawn)GameEngine.topLevelWorldView.pendingSpawns.previous()) {
				var20.x -= var5;
				var20.y -= var6;
				if (var20.x < 0 || 104 <= var20.x || var20.y < 0 || 104 <= var20.y) {
					var20.remove();
				}
			}

			if (Client.destinationX != 0) {
				Client.destinationX -= var5;
				Client.destinationY -= var6;
			}

			Client.soundEffectCount = 0;
			Client.isCameraLocked = false;
			Buddy.cameraX -= var5 << 7;
			class31.cameraZ -= var6 << 7;
			VarpDefinition.oculusOrbFocalPointX -= var5 << 7;
			class7.oculusOrbFocalPointY -= var6 << 7;
			Client.field739 = -1;
			GameEngine.topLevelWorldView.graphicsObjects.clear();
			GameEngine.topLevelWorldView.projectiles.clear();

			for (var16 = 0; var16 < 4; ++var16) {
				GameEngine.topLevelWorldView.collisionMaps[var16].clear();
			}

		}
	}

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "708605342"
	)
	static final void method4435() {
		for (PendingSpawn var0 = (PendingSpawn)GameEngine.topLevelWorldView.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)GameEngine.topLevelWorldView.pendingSpawns.previous()) {
			if (var0.hitpoints == -1) {
				var0.delay = 0;
				ObjectComposition.method5557(GameEngine.topLevelWorldView, var0);
			} else {
				var0.remove();
			}
		}

	}

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "544538834"
	)
	static void method4443() {
		Client.menu.menuOptionsCount = 0;
		Client.isMenuOpen = false;
	}
}
