import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hf")
public class class191 extends DualNode {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("field2026")
	static EvictingDualNodeHashTable field2026;

	static {
		field2026 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhg;",
		garbageValue = "104"
	)
	@Export("getNpcDefinition")
	public static NPCComposition getNpcDefinition(int var0) {
		NPCComposition var1 = (NPCComposition)NPCComposition.NpcDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = NPCComposition.NpcDefinition_archive.takeFile(9, var0);
			var1 = new NPCComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			NPCComposition.NpcDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("no")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "122"
	)
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop;
	}

	@ObfuscatedName("oa")
	@ObfuscatedSignature(
		descriptor = "(Lox;IIII)V",
		garbageValue = "-1665024579"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		MouseHandler.method722();
		SpriteMask var4 = var0.method7902(class167.widgetDefinition, false);
		if (var4 != null) {
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height);
			if (Client.minimapState != 2 && Client.minimapState != 5) {
				int var5 = Client.camAngleY & 2047;
				int var6 = Client.field581 / 32 + 48;
				int var7 = 464 - Client.field492 / 32;
				Script.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths);

				int var8;
				int var10;
				int var32;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) {
					var32 = Client.changedSkills[var8] * 4 + 2 - Client.field581 / 32;
					var10 = Client.field558[var8] * 4 + 2 - Client.field492 / 32;
					NPC.drawSpriteOnMinimap(var1, var2, var32, var10, Client.mapIcons[var8], var4);
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) {
					for (var32 = 0; var32 < 104; ++var32) {
						NodeDeque var27 = class7.topLevelWorldView.groundItems[class7.topLevelWorldView.plane][var8][var32];
						if (var27 != null) {
							var11 = var8 * 4 + 2 - Client.field581 / 32;
							var12 = var32 * 4 + 2 - Client.field492 / 32;
							NPC.drawSpriteOnMinimap(var1, var2, var11, var12, AsyncRestClient.field62[0], var4);
						}
					}
				}

				for (var8 = 0; var8 < class7.topLevelWorldView.field1150.method9810(); ++var8) {
					NPC var9 = (NPC)class7.topLevelWorldView.npcs.get((long)class7.topLevelWorldView.field1150.method9817(var8));
					if (var9 != null && var9.isVisible()) {
						NPCComposition var35 = var9.definition;
						if (var35 != null && var35.transforms != null) {
							var35 = var35.transform();
						}

						if (var35 != null && var35.drawMapDot && var35.isInteractable) {
							var11 = var9.x / 32 - Client.field581 / 32;
							var12 = var9.y / 32 - Client.field492 / 32;
							NPC.drawSpriteOnMinimap(var1, var2, var11, var12, AsyncRestClient.field62[1], var4);
						}
					}
				}

				var8 = Client.playerUpdateManager.playerCount;
				int[] var33 = Client.playerUpdateManager.playerIndices;

				int var13;
				for (var10 = 0; var10 < var8; ++var10) {
					Player var31 = (Player)class7.topLevelWorldView.players.get((long)var33[var10]);
					if (var31 != null && var31.isVisible() && !var31.isHidden && var31 != class27.localPlayer) {
						var12 = var31.x / 32 - Client.field581 / 32;
						var13 = var31.y / 32 - Client.field492 / 32;
						if (var31.isFriend()) {
							NPC.drawSpriteOnMinimap(var1, var2, var12, var13, AsyncRestClient.field62[3], var4);
						} else if (class27.localPlayer.team != 0 && var31.team != 0 && var31.team == class27.localPlayer.team) {
							NPC.drawSpriteOnMinimap(var1, var2, var12, var13, AsyncRestClient.field62[4], var4);
						} else if (var31.isFriendsChatMember()) {
							NPC.drawSpriteOnMinimap(var1, var2, var12, var13, AsyncRestClient.field62[5], var4);
						} else if (var31.isClanMember()) {
							NPC.drawSpriteOnMinimap(var1, var2, var12, var13, AsyncRestClient.field62[6], var4);
						} else {
							NPC.drawSpriteOnMinimap(var1, var2, var12, var13, AsyncRestClient.field62[2], var4);
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) {
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0) {
						NPC var36 = (NPC)class7.topLevelWorldView.npcs.get((long)Client.hintArrowNpcIndex);
						if (var36 != null) {
							var11 = var36.x / 32 - Client.field581 / 32;
							var12 = var36.y / 32 - Client.field492 / 32;
							class407.worldToMinimap(var1, var2, var11, var12, class48.mapDotSprites[1], var4);
						}
					}

					if (Client.hintArrowType == 2) {
						var10 = Client.hintArrowX * 4 - class7.topLevelWorldView.baseX * 4 + 2 - Client.field581 / 32;
						var11 = Client.hintArrowY * 4 - class7.topLevelWorldView.baseY * 4 + 2 - Client.field492 / 32;
						class407.worldToMinimap(var1, var2, var10, var11, class48.mapDotSprites[1], var4);
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0) {
						Player var37 = (Player)class7.topLevelWorldView.players.get((long)Client.hintArrowPlayerIndex);
						if (var37 != null) {
							var11 = var37.x / 32 - Client.field581 / 32;
							var12 = var37.y / 32 - Client.field492 / 32;
							class407.worldToMinimap(var1, var2, var11, var12, class48.mapDotSprites[1], var4);
						}
					}
				}

				if (Client.destinationX != 0) {
					var10 = Client.destinationX * 4 + 2 - Client.field581 / 32;
					var11 = Client.destinationY * 4 + 2 - Client.field492 / 32;
					NPC.drawSpriteOnMinimap(var1, var2, var10, var11, class48.mapDotSprites[0], var4);
				}

				if (Client.worldViewManager.method2355(-1) == class514.field5397 && class48.mapDotSprites.length >= 4) {
					var10 = var4.width / 2 + var1;
					var11 = var4.height / 2 + var2;
					if (var4.contains(MouseHandler.MouseHandler_x - var1, MouseHandler.MouseHandler_y - var2)) {
						var13 = var4.width / 2 + var1;
						int var14 = var4.height / 2 + var2;
						int var15 = MouseHandler.MouseHandler_x - var13;
						int var16 = MouseHandler.MouseHandler_y - var14;
						int var17 = (int)Math.round(Math.atan2((double)var16, (double)var15) * 325.94932345220167D) - 512 & 2047;
						int var18 = var17 - Client.camAngleY;
						var18 &= 2047;
						int var20 = var18 + 64;
						int var19 = (var20 & 2047) / 128;
						SpritePixels var28 = class48.mapDotSprites[2];
						var15 = var19 * 128;
						var15 += Client.camAngleY;
						var15 &= 2047;
						byte var34 = 30;
						var20 = class532.field5477[var15 & 2047];
						double var29 = (double)var20 / 65536.0D;
						var20 = var10 - (int)((double)var34 * var29);
						double var22 = (double)WorldMapLabel.method6812(var15) / 65536.0D;
						int var24 = (int)(var22 * (double)var34) + var11;
						int var25 = Math.max(var28.subWidth, var28.subHeight);
						int var26 = var25 / 2;
						var28.method11801(var20 - var26, var24 - var26, var28.subWidth, var28.subHeight, var28.subWidth / 2, var28.subHeight / 2, (double)class31.method501(var15), 256);
					}

					if (Client.field307 > 0) {
						SecureRandomFuture.method1967(var10, var11, Client.field308, class48.mapDotSprites[3]);
					}
				}

				if (!class27.localPlayer.isHidden) {
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

			Client.field545[var3] = true;
		}
	}
}
