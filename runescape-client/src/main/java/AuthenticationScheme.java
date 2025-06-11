import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fz")
@Implements("AuthenticationScheme")
public enum AuthenticationScheme implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	@Export("USERNAME_PASSWORD_REMEMBER")
	USERNAME_PASSWORD_REMEMBER(1, 0),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	@Export("TOKEN_REMEMBER")
	TOKEN_REMEMBER(0, 1),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	@Export("USERNAME_PASSWORD")
	USERNAME_PASSWORD(2, 2),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	@Export("TOKEN")
	TOKEN(4, 3),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	field1692(3, 4);

	@ObfuscatedName("au")
	@Export("Tiles_underlays")
	static short[][][] Tiles_underlays;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1389806771
	)
	@Export("schemeId")
	public final int schemeId;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1129913595
	)
	@Export("packetId")
	final int packetId;

	AuthenticationScheme(int var3, int var4) {
		this.schemeId = var3;
		this.packetId = var4;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "26"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.packetId;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[IB)V",
		garbageValue = "84"
	)
	public static void method3634(String[] var0, int[] var1) {
		ObjectSound.quicksortStringsWithCorrespondingIntegers(var0, var1, 0, var0.length - 1);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ldl;[BIIIIIIIIIB)V",
		garbageValue = "-23"
	)
	static final void method3633(WorldView var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		CollisionMap[] var11 = var0.collisionMaps;
		int var13;
		int var14;
		if (var11 != null && var2 >= 0 && var2 < var11.length) {
			CollisionMap var12 = var11[var2];

			for (var13 = var3; var13 < var3 + 8; ++var13) {
				for (var14 = var4; var14 < var4 + 8; ++var14) {
					if (var12.method5960(var13, var14)) {
						var12.method5933(var13, var14, 1073741824);
					}
				}
			}
		}

		Buffer var30 = new Buffer(var1);

		for (var13 = 0; var13 < 4; ++var13) {
			for (var14 = 0; var14 < 64; ++var14) {
				for (int var15 = 0; var15 < 64; ++var15) {
					if (var5 == var13 && var14 >= var6 && var14 < var6 + 8 && var15 >= var7 && var15 < var7 + 8) {
						int var18 = var14 & 7;
						int var19 = var15 & 7;
						int var20 = var8 & 3;
						int var17;
						if (var20 == 0) {
							var17 = var18;
						} else if (var20 == 1) {
							var17 = var19;
						} else if (var20 == 2) {
							var17 = 7 - var18;
						} else {
							var17 = 7 - var19;
						}

						int var21 = var17 + var3;
						int var24 = var14 & 7;
						int var25 = var15 & 7;
						int var26 = var8 & 3;
						int var23;
						if (var26 == 0) {
							var23 = var25;
						} else if (var26 == 1) {
							var23 = 7 - var24;
						} else if (var26 == 2) {
							var23 = 7 - var25;
						} else {
							var23 = var24;
						}

						int var27 = var23 + var4;
						int var28 = var3 + (var14 & 7) + var9;
						int var29 = var10 + (var15 & 7) + var4;
						FriendSystem.loadTerrain(var0, var30, var2, var21, var27, var28, var29, var8);
					} else {
						FriendSystem.loadTerrain(var0, var30, 0, -1, -1, 0, 0, 0);
					}
				}
			}
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Lwy;",
		garbageValue = "-699949419"
	)
	static IndexedSprite method3628() {
		IndexedSprite var0 = new IndexedSprite();
		var0.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
		var0.height = SpriteBufferProperties.SpriteBuffer_spriteHeight;
		var0.xOffset = SpriteBufferProperties.SpriteBuffer_xOffsets[0];
		var0.yOffset = Varps.SpriteBuffer_yOffsets[0];
		var0.subWidth = class379.SpriteBuffer_spriteWidths[0];
		var0.subHeight = class171.SpriteBuffer_spriteHeights[0];
		var0.palette = SpriteBufferProperties.SpriteBuffer_spritePalette;
		var0.pixels = SpriteBufferProperties.SpriteBuffer_pixels[0];
		SpriteBufferProperties.SpriteBuffer_xOffsets = null;
		Varps.SpriteBuffer_yOffsets = null;
		class379.SpriteBuffer_spriteWidths = null;
		class171.SpriteBuffer_spriteHeights = null;
		SpriteBufferProperties.SpriteBuffer_spritePalette = null;
		SpriteBufferProperties.SpriteBuffer_pixels = null;
		return var0;
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(IIZS)V",
		garbageValue = "-20427"
	)
	static final void method3632(int var0, int var1, boolean var2) {
		if (!var2 || var0 != HttpRequest.field52 || WorldMapElement.field1941 != var1) {
			HttpRequest.field52 = var0;
			WorldMapElement.field1941 = var1;
			HealthBarConfig.updateGameState(25);
			Client.field441 = true;
			class391.drawLoadingMessage("Loading - please wait.", true);
			int var3 = Sound.topLevelWorldView.baseX;
			int var4 = Sound.topLevelWorldView.baseY;
			Sound.topLevelWorldView.baseX = (var0 - 6) * 8;
			Sound.topLevelWorldView.baseY = (var1 - 6) * 8;
			int var5 = Sound.topLevelWorldView.baseX - var3;
			int var6 = Sound.topLevelWorldView.baseY - var4;
			int var7 = var5 * 128;
			int var8 = var6 * 128;

			int var11;
			int[] var10000;
			for (int var9 = 0; var9 < 65536; ++var9) {
				NPC var25 = (NPC)Sound.topLevelWorldView.npcs.get((long)var9);
				if (var25 != null) {
					for (var11 = 0; var11 < 10; ++var11) {
						var10000 = var25.pathX;
						var10000[var11] -= var5;
						var10000 = var25.pathY;
						var10000[var11] -= var6;
					}

					var25.x -= var7;
					var25.y -= var8;
					var25.field1062 -= var5;
					var25.field1065 -= var6;
					var25.field1070 -= var5;
					var25.field1072 -= var6;
				}
			}

			Iterator var21 = Sound.topLevelWorldView.players.iterator();

			while (true) {
				Player var28;
				do {
					if (!var21.hasNext()) {
						for (int var10 = 0; var10 < 4095; ++var10) {
							WorldEntity var24 = (WorldEntity)Sound.topLevelWorldView.worldEntities.get((long)var10);
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
								var18 = var5 + var16;
								int var19 = var23 + var6;

								for (int var20 = 0; var20 < 4; ++var20) {
									if (0 <= var18 && var18 < 104 && 0 <= var19 && var19 < 104) {
										Sound.topLevelWorldView.groundItems[var20][var16][var23] = Sound.topLevelWorldView.groundItems[var20][var18][var19];
									} else {
										Sound.topLevelWorldView.groundItems[var20][var16][var23] = null;
									}
								}
							}
						}

						for (PendingSpawn var22 = (PendingSpawn)Sound.topLevelWorldView.pendingSpawns.last(); var22 != null; var22 = (PendingSpawn)Sound.topLevelWorldView.pendingSpawns.previous()) {
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
							var17.method1940(-var5, -var6);
						}

						class58.soundEffectCount = 0;
						Client.isCameraLocked = false;
						class6.cameraX -= var5 << 7;
						GrandExchangeOfferAgeComparator.cameraZ -= var6 << 7;
						UserComparator5.oculusOrbFocalPointX -= var5 << 7;
						class198.oculusOrbFocalPointY -= var6 << 7;
						Client.field347 = -1;
						Sound.topLevelWorldView.graphicsObjects.clear();

						for (var18 = 0; var18 < 4; ++var18) {
							Sound.topLevelWorldView.collisionMaps[var18].clear();
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
				var28.field1062 -= var5;
				var28.field1065 -= var6;
				var28.field1070 -= var5;
				var28.field1072 -= var6;
			}
		}
	}
}
