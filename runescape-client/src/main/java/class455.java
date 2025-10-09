import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rn")
public class class455 extends RuntimeException {
	public class455(String var1, Object[] var2) {
		super(String.format(var1, var2));
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)[Lmn;",
		garbageValue = "-64"
	)
	public static class327[] method9283() {
		return new class327[]{class327.field3652, class327.field3653, class327.field3655, class327.field3659, class327.field3656, class327.field3660, class327.field3658, class327.field3657, class327.field3654, class327.field3661, class327.field3662, class327.field3663, class327.field3664};
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lpe;IIB)Lxl;",
		garbageValue = "96"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		return !Friend.method10009(var0, var1, var2) ? null : LoginPacket.method3890();
	}

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "1984026243"
	)
	static final void method9284(int var0, int var1, boolean var2) {
		if (!var2 || var0 != WorldMapIcon_1.field3312 || class187.field2048 != var1) {
			WorldMapIcon_1.field3312 = var0;
			class187.field2048 = var1;
			class135.updateGameState(25);
			Client.field476 = true;
			class88.drawLoadingMessage("Loading - please wait.", true);
			int var3 = class547.topLevelWorldView.baseX;
			int var4 = class547.topLevelWorldView.baseY;
			class547.topLevelWorldView.baseX = (var0 - 6) * 8;
			class547.topLevelWorldView.baseY = (var1 - 6) * 8;
			int var5 = class547.topLevelWorldView.baseX - var3;
			int var6 = class547.topLevelWorldView.baseY - var4;
			int var7 = var5 * 128;
			int var8 = var6 * 128;

			int var11;
			int[] var10000;
			for (int var9 = 0; var9 < 65536; ++var9) {
				NPC var25 = (NPC)class547.topLevelWorldView.npcs.get((long)var9);
				if (var25 != null) {
					for (var11 = 0; var11 < 10; ++var11) {
						var10000 = var25.pathX;
						var10000[var11] -= var5;
						var10000 = var25.pathY;
						var10000[var11] -= var6;
					}

					var25.x -= var7;
					var25.y -= var8;
					var25.field1032 -= var5;
					var25.field1080 -= var6;
					var25.field1061 -= var5;
					var25.field1055 -= var6;
				}
			}

			Iterator var21 = class547.topLevelWorldView.players.iterator();

			while (true) {
				Player var28;
				do {
					if (!var21.hasNext()) {
						for (int var10 = 0; var10 < 4095; ++var10) {
							WorldEntity var24 = (WorldEntity)class547.topLevelWorldView.worldEntities.get((long)var10);
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
							for (int var23 = var13; var23 != var14; var23 += var15) {
								var18 = var16 + var5;
								int var19 = var6 + var23;

								for (int var20 = 0; var20 < 4; ++var20) {
									if (0 <= var18 && var18 < 104 && 0 <= var19 && var19 < 104) {
										class547.topLevelWorldView.groundItems[var20][var16][var23] = class547.topLevelWorldView.groundItems[var20][var18][var19];
									} else {
										class547.topLevelWorldView.groundItems[var20][var16][var23] = null;
									}
								}
							}
						}

						for (PendingSpawn var22 = (PendingSpawn)class547.topLevelWorldView.pendingSpawns.last(); var22 != null; var22 = (PendingSpawn)class547.topLevelWorldView.pendingSpawns.previous()) {
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
							var17.method1992(-var5, -var6);
						}

						class48.method1912();
						Client.isCameraLocked = false;
						Huffman.cameraX -= var5 << 7;
						ChatChannel.cameraZ -= var6 << 7;
						class454.oculusOrbFocalPointX -= var5 << 7;
						WorldMapElement.oculusOrbFocalPointY -= var6 << 7;
						Client.field484 -= var5 << 7;
						Client.field377 -= var6 << 7;
						Client.field549 = -1;
						class547.topLevelWorldView.graphicsObjects.clear();

						for (var18 = 0; var18 < 4; ++var18) {
							class547.topLevelWorldView.collisionMaps[var18].clear();
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
				var28.field1032 -= var5;
				var28.field1080 -= var6;
				var28.field1061 -= var5;
				var28.field1055 -= var6;
			}
		}
	}
}
