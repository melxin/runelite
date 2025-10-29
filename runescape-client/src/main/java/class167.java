import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gk")
public abstract class class167 extends Node {
	class167() {
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxa;B)V",
		garbageValue = "23"
	)
	abstract void vmethod4228(Buffer var1);

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lgz;B)V",
		garbageValue = "-24"
	)
	abstract void vmethod4229(ClanChannel var1);

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "969246232"
	)
	public static void method4167(int var0, int var1) {
		ItemLayer.method5256(var0, var1, 0, 0);
		class345.field3928.clear();
		class345.field3929.clear();
		if (class345.midiRequests.isEmpty() || var0 == 0 && var1 == 0) {
			class151.method3973();
		} else {
			class345.field3929.add(new DelayFadeTask((SongTask)null, class345.musicPlayerStatus));
			class345.field3929.add(new FadeOutTask((SongTask)null, 0, false, class345.field3931));
			ArrayList var2 = class287.method6525();
			class345.field3929.add(new class480((SongTask)null, var2));
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "48"
	)
	public static void method4166() {
		class207.field2248.clear();
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-1765432687"
	)
	static final void method4165(int var0, int var1, boolean var2) {
		if (!var2 || var0 != HealthBarUpdate.field1081 || ScriptFrame.field210 != var1) {
			HealthBarUpdate.field1081 = var0;
			ScriptFrame.field210 = var1;
			WorldMapSectionType.updateGameState(25);
			Client.field489 = true;
			HttpMethod.drawLoadingMessage("Loading - please wait.", true);
			int var3 = Occluder.topLevelWorldView.baseX;
			int var4 = Occluder.topLevelWorldView.baseY;
			Occluder.topLevelWorldView.baseX = (var0 - 6) * 8;
			Occluder.topLevelWorldView.baseY = (var1 - 6) * 8;
			int var5 = Occluder.topLevelWorldView.baseX - var3;
			int var6 = Occluder.topLevelWorldView.baseY - var4;
			int var7 = var5 * 128;
			int var8 = var6 * 128;

			int var11;
			int[] var10000;
			for (int var9 = 0; var9 < 65536; ++var9) {
				NPC var25 = (NPC)Occluder.topLevelWorldView.npcs.get((long)var9);
				if (var25 != null) {
					for (var11 = 0; var11 < 10; ++var11) {
						var10000 = var25.pathX;
						var10000[var11] -= var5;
						var10000 = var25.pathY;
						var10000[var11] -= var6;
					}

					var25.x -= var7;
					var25.y -= var8;
					var25.field1059 -= var5;
					var25.field1061 -= var6;
					var25.field1060 -= var5;
					var25.field1062 -= var6;
				}
			}

			Iterator var21 = Occluder.topLevelWorldView.players.iterator();

			while (true) {
				Player var28;
				do {
					if (!var21.hasNext()) {
						for (int var10 = 0; var10 < 4095; ++var10) {
							WorldEntity var24 = (WorldEntity)Occluder.topLevelWorldView.worldEntities.get((long)var10);
							if (var24 != null) {
								var24.setPosition(-var7, -var8);
							}
						}

						byte var26 = 0;
						byte var27 = 104;
						byte var12 = 1;
						if (var5 < 0) {
							var26 = 103;
							var27 = -1;
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

						int var18;
						for (int var16 = var26; var16 != var27; var16 += var12) {
							for (int var23 = var13; var14 != var23; var23 += var15) {
								var18 = var16 + var5;
								int var19 = var23 + var6;

								for (int var20 = 0; var20 < 4; ++var20) {
									if (0 <= var18 && var18 < 104 && 0 <= var19 && var19 < 104) {
										Occluder.topLevelWorldView.groundItems[var20][var16][var23] = Occluder.topLevelWorldView.groundItems[var20][var18][var19];
									} else {
										Occluder.topLevelWorldView.groundItems[var20][var16][var23] = null;
									}
								}
							}
						}

						for (PendingSpawn var22 = (PendingSpawn)Occluder.topLevelWorldView.pendingSpawns.last(); var22 != null; var22 = (PendingSpawn)Occluder.topLevelWorldView.pendingSpawns.previous()) {
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

						for (Projectile var17 = (Projectile)Client.projectiles.last(); var17 != null; var17 = (Projectile)Client.projectiles.previous()) {
							var17.method2009(-var5, -var6);
						}

						RestClientThreadFactory.method206();
						Client.isCameraLocked = false;
						SpriteBufferProperties.cameraX -= var5 << 7;
						class528.cameraZ -= var6 << 7;
						class40.oculusOrbFocalPointX -= var5 << 7;
						class4.oculusOrbFocalPointY -= var6 << 7;
						Client.field468 -= var5 << 7;
						Client.field512 -= var6 << 7;
						class39.field233 = -1;
						Occluder.topLevelWorldView.graphicsObjects.clear();

						for (var18 = 0; var18 < 4; ++var18) {
							Occluder.topLevelWorldView.collisionMaps[var18].clear();
						}

						return;
					}

					var28 = (Player)var21.next();
				} while(var28 == null);

				for (var11 = 0; var11 < 10; ++var11) {
					var10000 = var28.pathX;
					var10000[var11] -= var5;
					var10000 = var28.pathY;
					var10000[var11] -= var6;
				}

				var28.x -= var7;
				var28.y -= var8;
				var28.field1059 -= var5;
				var28.field1061 -= var6;
				var28.field1060 -= var5;
				var28.field1062 -= var6;
			}
		}
	}
}
