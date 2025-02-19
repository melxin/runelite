import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pk")
public class class396 {
	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "29"
	)
	static final void method7567(int var0, int var1, boolean var2) {
		if (!var2 || var0 != ApproximateRouteStrategy.field476 || Language.field4818 != var1) {
			ApproximateRouteStrategy.field476 = var0;
			Language.field4818 = var1;
			class511.updateGameState(25);
			Client.field519 = true;
			TextureProvider.drawLoadingMessage("Loading - please wait.", true);
			int var3 = class200.topLevelWorldView.baseX;
			int var4 = class200.topLevelWorldView.baseY;
			class200.topLevelWorldView.baseX = (var0 - 6) * 8;
			class200.topLevelWorldView.baseY = (var1 - 6) * 8;
			int var5 = class200.topLevelWorldView.baseX - var3;
			int var6 = class200.topLevelWorldView.baseY - var4;
			int var7 = var5 * 128;
			int var8 = var6 * 128;

			int var11;
			int[] var10000;
			for (int var9 = 0; var9 < 65536; ++var9) {
				NPC var24 = (NPC)class200.topLevelWorldView.field1356.method7890((long)var9);
				if (var24 != null) {
					for (var11 = 0; var11 < 10; ++var11) {
						var10000 = var24.field1287;
						var10000[var11] -= var5;
						var10000 = var24.field1288;
						var10000[var11] -= var6;
					}

					var24.x -= var7;
					var24.y -= var8;
					var24.field1221 -= var5;
					var24.field1274 -= var6;
					var24.field1273 -= var5;
					var24.field1275 -= var6;
				}
			}

			Iterator var21 = class200.topLevelWorldView.field1353.iterator();

			while (true) {
				Player var27;
				do {
					if (!var21.hasNext()) {
						for (int var10 = 0; var10 < 4095; ++var10) {
							class492 var23 = (class492)class200.topLevelWorldView.field1358.get((long)var10);
							if (var23 != null) {
								var23.method9297(-var7, -var8);
							}
						}

						byte var25 = 0;
						byte var26 = 104;
						byte var12 = 1;
						if (var5 < 0) {
							var25 = 103;
							var26 = -1;
							var12 = -1;
						}

						byte var13 = 0;
						byte var14 = 104;
						byte var15 = 1;
						if (var6 < 0) {
							var13 = 103;
							var14 = -1;
							var15 = -1;
						}

						int var17;
						for (int var16 = var25; var26 != var16; var16 += var12) {
							for (var17 = var13; var17 != var14; var17 += var15) {
								int var18 = var16 + var5;
								int var19 = var6 + var17;

								for (int var20 = 0; var20 < 4; ++var20) {
									if (0 <= var18 && var18 < 104 && 0 <= var19 && var19 < 104) {
										class200.topLevelWorldView.groundItems[var20][var16][var17] = class200.topLevelWorldView.groundItems[var20][var18][var19];
									} else {
										class200.topLevelWorldView.groundItems[var20][var16][var17] = null;
									}
								}
							}
						}

						for (PendingSpawn var22 = (PendingSpawn)class200.topLevelWorldView.pendingSpawns.last(); var22 != null; var22 = (PendingSpawn)class200.topLevelWorldView.pendingSpawns.previous()) {
							var22.x -= var5;
							var22.y -= var6;
							if (var22.x < 0 || 104 <= var22.x || var22.y < 0 || 104 <= var22.y) {
								var22.remove();
							}
						}

						if (Client.destinationX != 0) {
							Client.destinationX -= var5;
							Client.destinationY -= var6;
						}

						Client.soundEffectCount = 0;
						Client.isCameraLocked = false;
						class181.cameraX -= var5 << 7;
						ApproximateRouteStrategy.cameraZ -= var6 << 7;
						RestClientThreadFactory.oculusOrbFocalPointX -= var5 << 7;
						class173.oculusOrbFocalPointY -= var6 << 7;
						Client.field799 = -1;
						class200.topLevelWorldView.field1342.clear();
						class200.topLevelWorldView.projectiles.clear();

						for (var17 = 0; var17 < 4; ++var17) {
							class200.topLevelWorldView.collisionMaps[var17].clear();
						}

						return;
					}

					var27 = (Player)var21.next();
				} while(var27 == null);

				for (var11 = 0; var11 < 10; ++var11) {
					var10000 = var27.field1287;
					var10000[var11] -= var5;
					var10000 = var27.field1288;
					var10000[var11] -= var6;
				}

				var27.x -= var7;
				var27.y -= var8;
				var27.field1221 -= var5;
				var27.field1274 -= var6;
				var27.field1273 -= var5;
				var27.field1275 -= var6;
			}
		}
	}
}
