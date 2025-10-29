import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("id")
public class class222 {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	static final class222 field2535;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	static final class222 field2523;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	static final class222 field2524;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	public static final class222 field2528;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	static final class222 field2526;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	public static final class222 field2527;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	static final class222 field2525;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	static final class222 field2529;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	static final class222 field2530;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	static final class222 field2531;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	static final class222 field2522;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	public static final class222 field2533;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	static final class222 field2532;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	static final class222 field2534;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("scriptActiveWidget")
	static Widget scriptActiveWidget;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1469073007
	)
	public final int field2536;

	static {
		field2535 = new class222(0);
		field2523 = new class222(1);
		field2524 = new class222(2);
		field2528 = new class222(3);
		field2526 = new class222(4);
		field2527 = new class222(5);
		field2525 = new class222(6);
		field2529 = new class222(7);
		field2530 = new class222(8);
		field2531 = new class222(9);
		field2522 = new class222(10);
		field2533 = new class222(11);
		field2532 = new class222(12);
		field2534 = new class222(13);
	}

	class222(int var1) {
		this.field2536 = var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lof;IIIB)V",
		garbageValue = "100"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		HttpRequestTask.method290();
		SpriteMask var4 = var0.method8168(class226.widgetDefinition, false);
		if (var4 != null) {
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height);
			if (class39.minimapState != 2 && class39.minimapState != 5) {
				int var5 = Client.camAngleY & 2047;
				int var6 = Client.field468 / 32 + 48;
				int var7 = 464 - Client.field512 / 32;
				class437.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var1, var2, var4.xStarts, var4.xWidths);

				int var9;
				int var33;
				for (int var8 = 0; var8 < class39.mapIconCount; ++var8) {
					var9 = class39.mapIconXs[var8] * 4 + 2 - Client.field468 / 32;
					var33 = class39.mapIconYs[var8] * 4 + 2 - Client.field512 / 32;
					SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var9, var33, var5, class39.mapIcons[var8], var4);
				}

				class6.method41(Occluder.topLevelWorldView, var1, var2, var5, var4);
				FontName.method11267(Occluder.topLevelWorldView, var1, var2, var5, var4);
				WorldView var29 = Occluder.topLevelWorldView;

				int var11;
				int var18;
				int var19;
				int var20;
				int var21;
				int var22;
				int var31;
				SpritePixels var32;
				byte var34;
				int var35;
				int var36;
				for (var9 = 0; var9 < var29.field1148.method10038(); ++var9) {
					WorldEntity var10 = (WorldEntity)var29.worldEntities.get((long)var29.field1148.method10037(var9));
					if (var10 != null) {
						var11 = var10.getY() / 32 - Client.field468 / 32;
						var31 = var10.getPlane() / 32 - Client.field512 / 32;
						var32 = var10.field5538.method4640();
						var34 = 1;
						if (!var10.method10502()) {
							var35 = 2047 - var10.method10529() + 1024;
							if (var32 != null) {
								var36 = var11 * var11 + var31 * var31;
								if (var36 <= 12100) {
									int var39 = Rasterizer3D.Rasterizer3D_sine[var5];
									var18 = Rasterizer3D.Rasterizer3D_cosine[var5];
									var19 = var11 * var18 + var31 * var39 >> 16;
									var20 = var18 * var31 - var11 * var39 >> 16;
									var35 = var5 - var35 & 2047;
									var21 = var4.width / 2 + var19 + var1;
									var22 = var4.height / 2 + var2 - var20;
									int var23 = var34 * var32.width;
									int var24 = var34 * var32.height;
									int var25 = var21 - var23 / 2;
									int var26 = var22 - var24 / 2;
									int var27 = var32.subWidth / 2;
									int var28 = var32.subHeight / 2;
									var32.drawRotatedMaskedCenteredAround(var25, var26, var23, var24, var27, var28, var35, var34 * 256, var1, var2, var4.xStarts, var4.xWidths);
								}
							}

							class6.method41(var10.worldView, var1, var2, var5, var4);
							FontName.method11267(var10.worldView, var1, var2, var5, var4);
							WorldMapSprite.method7012(var10.worldView, var1, var2, var5, var4);
						}
					}
				}

				WorldMapSprite.method7012(Occluder.topLevelWorldView, var1, var2, var5, var4);
				int var13;
				if (Client.hintArrow.method8422() && Client.cycle % 20 < 10) {
					var9 = Client.hintArrow.method8423();
					WorldView var40 = Occluder.topLevelWorldView;
					if (var9 != 1) {
						if (var9 == 2) {
							WorldView var42 = Client.worldViewManager.getWorldViewFromWorldPoint(Client.hintArrow.method8435(), Client.hintArrow.method8445());
							var31 = Coord.method7702(Client.hintArrow.method8435() - var42.baseX) + Client.hintArrow.method8427();
							var13 = Coord.method7702(Client.hintArrow.method8445() - var42.baseY) + Client.hintArrow.method8428();
							BufferedNetSocket.worldToMinimap(var42, var31, var13, var1, var2, var5, class217.mapDotSprites[1], var4);
						} else if (var9 == 3) {
							Player var43 = Renderable.method5846(Client.hintArrow.method8454(), Client.worldViewManager);
							if (var43 != null) {
								BufferedNetSocket.worldToMinimap(var43.getWorldView(), var43.x, var43.y, var1, var2, var5, class217.mapDotSprites[1], var4);
							}
						} else if (var9 == 4) {
							var11 = Client.hintArrow.method8454();
							WorldEntity var12 = (WorldEntity)Occluder.topLevelWorldView.worldEntities.get((long)var11);
							if (var12 != null) {
								BufferedNetSocket.worldToMinimap(Occluder.topLevelWorldView, var12.getY(), var12.getPlane(), var1, var2, var5, class217.mapDotSprites[1], var4);
							}
						}
					} else {
						var31 = Client.hintArrow.method8454();
						WorldViewManager var44 = Client.worldViewManager;
						Iterator var14 = var44.iterator();

						NPC var30;
						while (true) {
							if (var14.hasNext()) {
								WorldView var15 = (WorldView)var14.next();
								NPC var16 = (NPC)var15.npcs.get((long)var31);
								if (var16 == null) {
									continue;
								}

								var30 = var16;
								break;
							}

							var30 = null;
							break;
						}

						if (var30 != null) {
							BufferedNetSocket.worldToMinimap(var30.getWorldView(), var30.x, var30.y, var1, var2, var5, class217.mapDotSprites[1], var4);
						}
					}
				}

				if (Client.destinationX != 0) {
					var9 = Client.destinationX * 4 + 2 - Client.field468 / 32;
					var33 = Client.destinationY * 4 + 2 - Client.field512 / 32;
					SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var9, var33, var5, class217.mapDotSprites[0], var4);
				}

				if (Client.worldViewManager.method2398(-1) == class526.field5580 && class217.mapDotSprites.length >= 4) {
					var9 = var4.width / 2 + var1;
					var33 = var4.height / 2 + var2;
					if (var4.contains(MouseHandler.MouseHandler_x - var1, MouseHandler.MouseHandler_y - var2)) {
						var31 = var4.width / 2 + var1;
						var13 = var4.height / 2 + var2;
						int var45 = MouseHandler.MouseHandler_x - var31;
						var35 = MouseHandler.MouseHandler_y - var13;
						var36 = class238.method5229(var35, var45);
						var36 -= Client.camAngleY;
						var36 &= 2047;
						var11 = class169.method4184(var36);
						var32 = class217.mapDotSprites[2];
						var45 = var11 * 128;
						var45 += Client.camAngleY;
						var45 &= 2047;
						byte var46 = 30;
						double var17 = (double)class66.method2206(var45) / 65536.0D;
						var19 = var9 - (int)((double)var46 * var17);
						var20 = var33 + (int)(DevicePcmPlayerProvider.method332(var45) * (double)var46);
						var21 = Math.max(var32.subWidth, var32.subHeight);
						var22 = var21 / 2;
						var32.method12150(var19 - var22, var20 - var22, var32.subWidth, var32.subHeight, var32.subWidth / 2, var32.subHeight / 2, (double)class6.method44(var45), 256);
					}

					if (Client.field536 > 0) {
						var11 = Client.field377;
						SpritePixels var41 = class217.mapDotSprites[3];
						var13 = var11 * 128;
						var13 += Client.camAngleY;
						var13 &= 2047;
						var34 = 30;
						double var37 = (double)class66.method2206(var13) / 65536.0D;
						var18 = var9 - (int)((double)var34 * var37);
						var19 = var33 + (int)(DevicePcmPlayerProvider.method332(var13) * (double)var34);
						var20 = Math.max(var41.subWidth, var41.subHeight);
						var21 = var20 / 2;
						var41.method12150(var18 - var21, var19 - var21, var41.subWidth, var41.subHeight, var41.subWidth / 2, var41.subHeight / 2, (double)class6.method44(var13), 256);
					}
				}

				if (!Client.worldViewManager.method2390().isHidden) {
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + class39.field239 + var1 - 1, var4.height / 2 + var2 - class39.Players_count - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

			Client.field523[var3] = true;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "18"
	)
	@Export("addChatMessage")
	static void addChatMessage(int var0, String var1, String var2, String var3) {
		ChatChannel var4 = (ChatChannel)Messages.Messages_channels.get(var0);
		if (var4 == null) {
			var4 = new ChatChannel();
			Messages.Messages_channels.put(var0, var4);
		}

		Message var5 = var4.addMessage(var0, var1, var2, var3);
		Messages.Messages_hashTable.put(var5, (long)var5.count);
		Messages.Messages_queue.add(var5);
		Client.chatCycle = Client.cycleCntr;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)[Low;",
		garbageValue = "67"
	)
	public static class386[] method4988() {
		return new class386[]{class386.field4423, class386.field4421, class386.field4422};
	}
}
