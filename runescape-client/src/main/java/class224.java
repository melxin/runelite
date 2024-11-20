import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ic")
public class class224 extends class230 {
	@ObfuscatedName("ab")
	String field2413;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	final class227 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lid;Ljava/lang/String;Ljava/lang/String;)V"
	)
	class224(class227 var1, String var2, String var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field2413 = var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "8123"
	)
	public int vmethod4561() {
		return 1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-2115621213"
	)
	public String vmethod4549() {
		return this.field2413;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-115097600"
	)
	public static int method4448(int var0, int var1) {
		return (var0 << 8) + var1;
	}

	@ObfuscatedName("ns")
	@ObfuscatedSignature(
		descriptor = "(Lnp;IIII)V",
		garbageValue = "-835001997"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		UserComparator3.method3232();
		SpriteMask var4 = var0.method7256(class379.widgetDefinition, false);
		if (var4 != null) {
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height);
			if (Client.minimapState != 2 && Client.minimapState != 5) {
				int var5 = Client.camAngleY & 2047;
				int var6 = 48 + HttpResponse.entity.getX() / 32;
				int var7 = 464 - HttpResponse.entity.getY() / 32;
				VerticalAlignment.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths);

				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) {
					var16 = Client.mapIconXs[var8] * 4 + 2 - HttpResponse.entity.getX() / 32;
					var10 = Client.field752[var8] * 4 + 2 - HttpResponse.entity.getY() / 32;
					class167.drawSpriteOnMinimap(var1, var2, var16, var10, Client.mapIcons[var8], var4);
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) {
					for (var16 = 0; var16 < 104; ++var16) {
						NodeDeque var14 = HttpRequest.topLevelWorldView.groundItems[HttpRequest.topLevelWorldView.plane][var8][var16];
						if (var14 != null) {
							var11 = var8 * 4 + 2 - HttpResponse.entity.getX() / 32;
							var12 = var16 * 4 + 2 - HttpResponse.entity.getY() / 32;
							class167.drawSpriteOnMinimap(var1, var2, var11, var12, class113.field1435[0], var4);
						}
					}
				}

				for (var8 = 0; var8 < HttpRequest.topLevelWorldView.npcCount; ++var8) {
					NPC var9 = HttpRequest.topLevelWorldView.npcs[HttpRequest.topLevelWorldView.npcIndices[var8]];
					if (var9 != null && var9.isVisible()) {
						NPCComposition var18 = var9.definition;
						if (var18 != null && var18.transforms != null) {
							var18 = var18.transform();
						}

						if (var18 != null && var18.drawMapDot && var18.isInteractable) {
							var11 = var9.x / 32 - HttpResponse.entity.getX() / 32;
							var12 = var9.y / 32 - HttpResponse.entity.getY() / 32;
							class167.drawSpriteOnMinimap(var1, var2, var11, var12, class113.field1435[1], var4);
						}
					}
				}

				var8 = Client.playerUpdateManager.playerCount;
				int[] var17 = Client.playerUpdateManager.playerIndices;

				for (var10 = 0; var10 < var8; ++var10) {
					Player var15 = HttpRequest.topLevelWorldView.players[var17[var10]];
					if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != AsyncHttpResponse.localPlayer) {
						var12 = var15.x / 32 - HttpResponse.entity.getX() / 32;
						int var13 = var15.y / 32 - HttpResponse.entity.getY() / 32;
						if (var15.isFriend()) {
							class167.drawSpriteOnMinimap(var1, var2, var12, var13, class113.field1435[3], var4);
						} else if (AsyncHttpResponse.localPlayer.team != 0 && var15.team != 0 && var15.team == AsyncHttpResponse.localPlayer.team) {
							class167.drawSpriteOnMinimap(var1, var2, var12, var13, class113.field1435[4], var4);
						} else if (var15.isFriendsChatMember()) {
							class167.drawSpriteOnMinimap(var1, var2, var12, var13, class113.field1435[5], var4);
						} else if (var15.isClanMember()) {
							class167.drawSpriteOnMinimap(var1, var2, var12, var13, class113.field1435[6], var4);
						} else {
							class167.drawSpriteOnMinimap(var1, var2, var12, var13, class113.field1435[2], var4);
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) {
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < HttpRequest.topLevelWorldView.npcs.length) {
						NPC var19 = HttpRequest.topLevelWorldView.npcs[Client.hintArrowNpcIndex];
						if (var19 != null) {
							var11 = var19.x / 32 - HttpResponse.entity.getX() / 32;
							var12 = var19.y / 32 - HttpResponse.entity.getY() / 32;
							class229.worldToMinimap(var1, var2, var11, var12, SpriteMask.mapDotSprites[1], var4);
						}
					}

					if (Client.hintArrowType == 2) {
						var10 = Client.hintArrowX * 4 - HttpRequest.topLevelWorldView.baseX * 4 + 2 - HttpResponse.entity.getX() / 32;
						var11 = Client.hintArrowY * 4 - HttpRequest.topLevelWorldView.baseY * 4 + 2 - HttpResponse.entity.getY() / 32;
						class229.worldToMinimap(var1, var2, var10, var11, SpriteMask.mapDotSprites[1], var4);
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < HttpRequest.topLevelWorldView.players.length) {
						Player var20 = HttpRequest.topLevelWorldView.players[Client.hintArrowPlayerIndex];
						if (var20 != null) {
							var11 = var20.x / 32 - HttpResponse.entity.getX() / 32;
							var12 = var20.y / 32 - HttpResponse.entity.getY() / 32;
							class229.worldToMinimap(var1, var2, var11, var12, SpriteMask.mapDotSprites[1], var4);
						}
					}
				}

				if (Client.destinationX != 0) {
					var10 = Client.destinationX * 4 + 2 - HttpResponse.entity.getX() / 32;
					var11 = Client.destinationY * 4 + 2 - HttpResponse.entity.getY() / 32;
					class167.drawSpriteOnMinimap(var1, var2, var10, var11, SpriteMask.mapDotSprites[0], var4);
				}

				if (!AsyncHttpResponse.localPlayer.isHidden) {
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

			Client.field724[var3] = true;
		}
	}
}
