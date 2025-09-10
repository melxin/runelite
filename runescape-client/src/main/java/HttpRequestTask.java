import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("av")
@Implements("HttpRequestTask")
public class HttpRequestTask implements Callable {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	@Export("scriptDotWidget")
	static Widget scriptDotWidget;
	@ObfuscatedName("id")
	@ObfuscatedGetter(
		intValue = -1196551529
	)
	@Export("foundItemIndex")
	static int foundItemIndex;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	final HttpRequest field80;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	final AsyncRestClient this$0;

	@ObfuscatedSignature(
		descriptor = "(Lar;Lai;)V"
	)
	HttpRequestTask(AsyncRestClient var1, HttpRequest var2) {
		this.this$0 = var1;
		this.field80 = var2;
	}

	public Object call() throws Exception {
		try {
			while (this.field80.connect()) {
				class164.method4001(10L);
			}
		} catch (IOException var2) {
			return new HttpResponse("Error servicing REST query: " + var2.getMessage());
		}

		return this.field80.getResponse();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Loe;",
		garbageValue = "-51762780"
	)
	public static GameBuild method299(int var0) {
		GameBuild[] var1 = new GameBuild[]{GameBuild.RC, GameBuild.WIP, GameBuild.LIVE, GameBuild.BUILDLIVE};
		GameBuild[] var2 = var1;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			GameBuild var4 = var2[var3];
			if (var0 == var4.buildId) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Lcg;",
		garbageValue = "-121"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = class200.method4401(var1, var0);
		Script var4 = TileItem.getScript(var3, var0);
		if (var4 != null) {
			return var4;
		} else {
			var3 = PacketBufferNode.method7048(var2, var0);
			var4 = TileItem.getScript(var3, var0);
			if (var4 != null) {
				return var4;
			} else {
				int var5 = var0 + -512;
				var4 = TileItem.getScript(var5, var0);
				return var4 != null ? var4 : null;
			}
		}
	}

	@ObfuscatedName("nh")
	@ObfuscatedSignature(
		descriptor = "(Loi;IIIB)V",
		garbageValue = "-16"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		UserComparator5.method3557();
		SpriteMask var4 = var0.method8005(UrlRequester.widgetDefinition, false);
		if (var4 != null) {
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height);
			if (Client.minimapState != 2 && Client.minimapState != 5) {
				int var5 = Client.camAngleY & 2047;
				int var6 = Client.field552 / 32 + 48;
				int var7 = 464 - Client.field337 / 32;
				SceneTilePaint.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths);

				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) {
					var16 = Client.mapIconXs[var8] * 4 + 2 - Client.field552 / 32;
					var10 = Client.mapIconYs[var8] * 4 + 2 - Client.field337 / 32;
					AttackOption.drawSpriteOnMinimap(var1, var2, var16, var10, Client.mapIcons[var8], var4);
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) {
					for (var16 = 0; var16 < 104; ++var16) {
						NodeDeque var14 = class333.topLevelWorldView.groundItems[class333.topLevelWorldView.plane][var8][var16];
						if (var14 != null) {
							var11 = var8 * 4 + 2 - Client.field552 / 32;
							var12 = var16 * 4 + 2 - Client.field337 / 32;
							AttackOption.drawSpriteOnMinimap(var1, var2, var11, var12, class200.field2185[0], var4);
						}
					}
				}

				for (var8 = 0; var8 < class333.topLevelWorldView.field1161.method9790(); ++var8) {
					NPC var9 = (NPC)class333.topLevelWorldView.npcs.get((long)class333.topLevelWorldView.field1161.method9787(var8));
					if (var9 != null && var9.isVisible()) {
						NPCComposition var18 = var9.definition;
						if (var18 != null && var18.transforms != null) {
							var18 = var18.transform();
						}

						if (var18 != null && var18.drawMapDot && var18.isInteractable) {
							var11 = var9.x / 32 - Client.field552 / 32;
							var12 = var9.y / 32 - Client.field337 / 32;
							AttackOption.drawSpriteOnMinimap(var1, var2, var11, var12, class200.field2185[1], var4);
						}
					}
				}

				var8 = Client.playerUpdateManager.playerCount;
				int[] var17 = Client.playerUpdateManager.playerIndices;

				for (var10 = 0; var10 < var8; ++var10) {
					Player var15 = (Player)class333.topLevelWorldView.players.get((long)var17[var10]);
					if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != HealthBarUpdate.localPlayer) {
						var12 = var15.x / 32 - Client.field552 / 32;
						int var13 = var15.y / 32 - Client.field337 / 32;
						if (var15.isFriend()) {
							AttackOption.drawSpriteOnMinimap(var1, var2, var12, var13, class200.field2185[3], var4);
						} else if (HealthBarUpdate.localPlayer.team != 0 && var15.team != 0 && var15.team == HealthBarUpdate.localPlayer.team) {
							AttackOption.drawSpriteOnMinimap(var1, var2, var12, var13, class200.field2185[4], var4);
						} else if (var15.isFriendsChatMember()) {
							AttackOption.drawSpriteOnMinimap(var1, var2, var12, var13, class200.field2185[5], var4);
						} else if (var15.isClanMember()) {
							AttackOption.drawSpriteOnMinimap(var1, var2, var12, var13, class200.field2185[6], var4);
						} else {
							AttackOption.drawSpriteOnMinimap(var1, var2, var12, var13, class200.field2185[2], var4);
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) {
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0) {
						NPC var19 = (NPC)class333.topLevelWorldView.npcs.get((long)Client.hintArrowNpcIndex);
						if (var19 != null) {
							var11 = var19.x / 32 - Client.field552 / 32;
							var12 = var19.y / 32 - Client.field337 / 32;
							class388.worldToMinimap(var1, var2, var11, var12, ParamComposition.mapDotSprites[1], var4);
						}
					}

					if (Client.hintArrowType == 2) {
						var10 = Client.hintArrowX * 4 - class333.topLevelWorldView.baseX * 4 + 2 - Client.field552 / 32;
						var11 = Client.hintArrowY * 4 - class333.topLevelWorldView.baseY * 4 + 2 - Client.field337 / 32;
						class388.worldToMinimap(var1, var2, var10, var11, ParamComposition.mapDotSprites[1], var4);
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0) {
						Player var20 = (Player)class333.topLevelWorldView.players.get((long)Client.hintArrowPlayerIndex);
						if (var20 != null) {
							var11 = var20.x / 32 - Client.field552 / 32;
							var12 = var20.y / 32 - Client.field337 / 32;
							class388.worldToMinimap(var1, var2, var11, var12, ParamComposition.mapDotSprites[1], var4);
						}
					}
				}

				if (Client.destinationX != 0) {
					var10 = Client.destinationX * 4 + 2 - Client.field552 / 32;
					var11 = Client.destinationY * 4 + 2 - Client.field337 / 32;
					AttackOption.drawSpriteOnMinimap(var1, var2, var10, var11, ParamComposition.mapDotSprites[0], var4);
				}

				if (Client.worldViewManager.method2352(-1) == class518.field5494 && ParamComposition.mapDotSprites.length >= 4) {
					var10 = var4.width / 2 + var1;
					var11 = var4.height / 2 + var2;
					if (var4.contains(MouseHandler.MouseHandler_x - var1, MouseHandler.MouseHandler_y - var2)) {
						var12 = class70.method2238(var1, var2, var4);
						class51.method1892(var10, var11, var12, ParamComposition.mapDotSprites[2]);
					}

					if (Client.field584 > 0) {
						class51.method1892(var10, var11, Client.field583, ParamComposition.mapDotSprites[3]);
					}
				}

				if (!HealthBarUpdate.localPlayer.isHidden) {
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

			Client.field566[var3] = true;
		}
	}

	@ObfuscatedName("om")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "586957109"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		Iterator var0 = Messages.Messages_hashTable.iterator();

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next();
			var1.clearIsFromIgnored();
		}

		if (DevicePcmPlayerProvider.friendsChat != null) {
			DevicePcmPlayerProvider.friendsChat.invalidateIgnoreds();
		}

	}

	@ObfuscatedName("po")
	@ObfuscatedSignature(
		descriptor = "(Lwb;I)V",
		garbageValue = "53261324"
	)
	@Export("randomDatData2")
	static void randomDatData2(Buffer var0) {
		if (Client.randomDatData != null) {
			var0.writeBytes(Client.randomDatData, 0, Client.randomDatData.length);
		} else {
			byte[] var1 = Script.method2005();
			var0.writeBytes(var1, 0, var1.length);
		}
	}
}
