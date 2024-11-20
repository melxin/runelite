import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jc")
@Implements("Occluder")
public final class Occluder {
	@ObfuscatedName("mc")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	static Model field2779;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1892617197
	)
	@Export("minTileX")
	int minTileX;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1059608515
	)
	@Export("maxTileX")
	int maxTileX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -958142579
	)
	@Export("minTileY")
	int minTileY;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 777970425
	)
	@Export("maxTileY")
	int maxTileY;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1170185197
	)
	@Export("type")
	int type;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 265772305
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -837411707
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 163424337
	)
	@Export("minZ")
	int minZ;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1653602137
	)
	@Export("maxZ")
	int maxZ;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1920298891
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -136231285
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -746602515
	)
	int field2766;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 202988575
	)
	int field2772;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1096450445
	)
	int field2773;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1062920583
	)
	int field2771;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 2025157045
	)
	int field2764;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1287650821
	)
	int field2776;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1561224415
	)
	int field2777;

	Occluder() {
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(CIB)Ljava/lang/String;",
		garbageValue = "0"
	)
	public static String method5164(char var0, int var1) {
		char[] var2 = new char[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			var2[var3] = var0;
		}

		return new String(var2);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1619902467"
	)
	public static int method5165(int var0) {
		if (var0 > 0) {
			return 1;
		} else {
			return var0 < 0 ? -1 : 0;
		}
	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1923599164"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount;
		HttpRequest.topLevelWorldView.scene.cycle = Client.cycle;
		class208.method4104();
		TileItem.method3015(HttpRequest.topLevelWorldView);
		WorldView var4 = HttpRequest.topLevelWorldView;
		if (Client.renderSelf) {
			GameBuild.addPlayerToScene(var4, Client.localPlayerIndex, false);
		}

		WorldView var5 = HttpRequest.topLevelWorldView;
		if (Client.combatTargetPlayerIndex >= 0 && var5.players[Client.combatTargetPlayerIndex] != null) {
			GameBuild.addPlayerToScene(var5, Client.combatTargetPlayerIndex, false);
		}

		class535.addNpcsToScene(HttpRequest.topLevelWorldView, true);
		ClanChannel.method3677(HttpRequest.topLevelWorldView);
		class535.addNpcsToScene(HttpRequest.topLevelWorldView, false);
		WorldView var6 = HttpRequest.topLevelWorldView;
		int var7 = 0;

		int var8;
		for (var8 = 0; var8 < var6.worldEntityCount; ++var8) {
			WorldEntity var37 = var6.worldEntities[var6.worldEntityIndices[var8]];
			if (var37 != null) {
				boolean var10 = var37.worldView.id == class31.field153;
				if (!var10) {
					boolean var11 = var7 < Client.field805;
					if (!var11) {
						continue;
					}

					++var7;
				}

				var37.worldEntityCoord.setZ(class77.getTileHeight(var6, var37.getX(), var37.getY(), var6.plane));
				var37.worldView.scene.cycle = Client.cycle;
				var37.initScenePlane();
				var6.scene.drawEntity(var6.plane, var37.getX(), var37.getY(), var37.getZ(), var37.method9140() / 2, var37.worldView.scene, var37.method9139(), 0L, false);
				WorldView var38 = var37.worldView;
				if (Client.renderSelf) {
					GameBuild.addPlayerToScene(var38, Client.localPlayerIndex, false);
				}

				WorldView var39 = var37.worldView;
				if (Client.combatTargetPlayerIndex >= 0 && var39.players[Client.combatTargetPlayerIndex] != null) {
					GameBuild.addPlayerToScene(var39, Client.combatTargetPlayerIndex, false);
				}

				class535.addNpcsToScene(var37.worldView, true);
				ClanChannel.method3677(var37.worldView);
				class535.addNpcsToScene(var37.worldView, false);
				ObjectComposition.method4106(var37.worldView);
				WorldView var40 = var37.worldView;

				for (GraphicsObject var41 = (GraphicsObject)var40.graphicsObjects.last(); var41 != null; var41 = (GraphicsObject)var40.graphicsObjects.previous()) {
					if (var40.plane == var41.plane && !var41.isFinished) {
						if (Client.cycle >= var41.cycleStart) {
							var41.advance(Client.graphicsCycle);
							if (var41.isFinished) {
								var41.remove();
							} else {
								var40.scene.drawEntity(var41.plane, var41.x, var41.y, var41.z, 60, var41, 0, -1L, false);
							}
						}
					} else {
						var41.remove();
					}
				}
			}
		}

		ObjectComposition.method4106(HttpRequest.topLevelWorldView);
		WorldView var31 = HttpRequest.topLevelWorldView;

		for (GraphicsObject var32 = (GraphicsObject)var31.graphicsObjects.last(); var32 != null; var32 = (GraphicsObject)var31.graphicsObjects.previous()) {
			if (var31.plane == var32.plane && !var32.isFinished) {
				if (Client.cycle >= var32.cycleStart) {
					var32.advance(Client.graphicsCycle);
					if (var32.isFinished) {
						var32.remove();
					} else {
						var31.scene.drawEntity(var32.plane, var32.x, var32.y, var32.z, 60, var32, 0, -1L, false);
					}
				}
			} else {
				var32.remove();
			}
		}

		WorldMapID.setViewportShape(var0, var1, var2, var3, true);
		var0 = Client.viewportOffsetX;
		var1 = Client.viewportOffsetY;
		var2 = Client.viewportWidth;
		var3 = Client.viewportHeight;
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
		Rasterizer3D.resetRasterClipping();
		Rasterizer2D.clearBrightness();
		var8 = Client.camAngleX;
		if (Client.field678 / 256 > var8) {
			var8 = Client.field678 / 256;
		}

		if (Client.field774[4] && Client.field717[4] + 128 > var8) {
			var8 = Client.field717[4] + 128;
		}

		int var9 = Client.camAngleY & 2047;
		int var42 = class443.oculusOrbFocalPointX;
		int var43 = UserComparator8.oculusOrbFocalPointZ;
		int var12 = AsyncRestClient.oculusOrbFocalPointY;
		int var15 = var8 * 3 + 600;
		BufferedNetSocket.method9256(var42, var43, var12, var8, var9, var15, var3);
		int var16;
		int var17;
		int var18;
		int var19;
		int var20;
		int var21;
		int var22;
		int var23;
		int var24;
		int var25;
		int var26;
		int var28;
		if (!Client.isCameraLocked) {
			if (SecureUrlRequester.clientPreferences.isRoofsHidden()) {
				var17 = HttpRequest.topLevelWorldView.plane;
			} else {
				label492: {
					var18 = 3;
					var19 = HttpResponse.entity.getX() >> 7;
					var20 = HttpResponse.entity.getY() >> 7;
					if (SoundSystem.cameraPitch < 310) {
						if (Client.oculusOrbState == 1) {
							var21 = class443.oculusOrbFocalPointX >> 7;
							var22 = AsyncRestClient.oculusOrbFocalPointY >> 7;
						} else {
							var21 = var19;
							var22 = var20;
						}

						var23 = class403.cameraX >> 7;
						var24 = class328.cameraZ >> 7;
						if (var23 < 0 || 104 <= var23 || var24 < 0 || 104 <= var24) {
							var17 = HttpRequest.topLevelWorldView.plane;
							break label492;
						}

						if (var21 < 0 || 104 <= var21 || var22 < 0 || 104 <= var22) {
							var17 = HttpRequest.topLevelWorldView.plane;
							break label492;
						}

						if ((HttpRequest.topLevelWorldView.tileSettings[HttpRequest.topLevelWorldView.plane][var23][var24] & 4) != 0) {
							var18 = HttpRequest.topLevelWorldView.plane;
						}

						if (var21 > var23) {
							var25 = var21 - var23;
						} else {
							var25 = var23 - var21;
						}

						if (var22 > var24) {
							var26 = var22 - var24;
						} else {
							var26 = var24 - var22;
						}

						int var27;
						if (var25 > var26) {
							var27 = var26 * 65536 / var25;
							var28 = 32768;

							while (var21 != var23) {
								if (var23 < var21) {
									++var23;
								} else if (var23 > var21) {
									--var23;
								}

								if ((HttpRequest.topLevelWorldView.tileSettings[HttpRequest.topLevelWorldView.plane][var23][var24] & 4) != 0) {
									var18 = HttpRequest.topLevelWorldView.plane;
								}

								var28 += var27;
								if (var28 >= 65536) {
									var28 -= 65536;
									if (var24 < var22) {
										++var24;
									} else if (var24 > var22) {
										--var24;
									}

									if ((HttpRequest.topLevelWorldView.tileSettings[HttpRequest.topLevelWorldView.plane][var23][var24] & 4) != 0) {
										var18 = HttpRequest.topLevelWorldView.plane;
									}
								}
							}
						} else if (var26 > 0) {
							var27 = var25 * 65536 / var26;
							var28 = 32768;

							while (var24 != var22) {
								if (var24 < var22) {
									++var24;
								} else if (var24 > var22) {
									--var24;
								}

								if ((HttpRequest.topLevelWorldView.tileSettings[HttpRequest.topLevelWorldView.plane][var23][var24] & 4) != 0) {
									var18 = HttpRequest.topLevelWorldView.plane;
								}

								var28 += var27;
								if (var28 >= 65536) {
									var28 -= 65536;
									if (var23 < var21) {
										++var23;
									} else if (var23 > var21) {
										--var23;
									}

									if ((HttpRequest.topLevelWorldView.tileSettings[HttpRequest.topLevelWorldView.plane][var23][var24] & 4) != 0) {
										var18 = HttpRequest.topLevelWorldView.plane;
									}
								}
							}
						}
					}

					if (var19 >= 0 && 104 > var19 && var20 >= 0 && 104 > var20) {
						if ((HttpRequest.topLevelWorldView.tileSettings[HttpRequest.topLevelWorldView.plane][var19][var20] & 4) != 0) {
							var18 = HttpRequest.topLevelWorldView.plane;
						}

						var17 = var18;
					} else {
						var17 = HttpRequest.topLevelWorldView.plane;
					}
				}
			}

			var16 = var17;
		} else {
			if (SecureUrlRequester.clientPreferences.isRoofsHidden()) {
				var17 = HttpRequest.topLevelWorldView.plane;
			} else {
				var18 = class77.getTileHeight(HttpRequest.topLevelWorldView, class403.cameraX, class328.cameraZ, HttpRequest.topLevelWorldView.plane);
				if (var18 - class166.cameraY < 800 && (HttpRequest.topLevelWorldView.tileSettings[HttpRequest.topLevelWorldView.plane][class403.cameraX >> 7][class328.cameraZ >> 7] & 4) != 0) {
					var17 = HttpRequest.topLevelWorldView.plane;
				} else {
					var17 = 3;
				}
			}

			var16 = var17;
		}

		var17 = class403.cameraX;
		var18 = class166.cameraY;
		var19 = class328.cameraZ;
		var20 = SoundSystem.cameraPitch;
		var21 = ReflectionCheck.cameraYaw;

		for (var22 = 0; var22 < 5; ++var22) {
			if (Client.field774[var22]) {
				var23 = (int)(Math.random() * (double)(Client.field775[var22] * 2 + 1) - (double)Client.field775[var22] + Math.sin((double)Client.field738[var22] * ((double)Client.field606[var22] / 100.0D)) * (double)Client.field717[var22]);
				if (var22 == 0) {
					class403.cameraX += var23;
				}

				if (var22 == 1) {
					class166.cameraY += var23;
				}

				if (var22 == 2) {
					class328.cameraZ += var23;
				}

				if (var22 == 3) {
					ReflectionCheck.cameraYaw = var23 + ReflectionCheck.cameraYaw & 2047;
				}

				if (var22 == 4) {
					SoundSystem.cameraPitch += var23;
					if (SoundSystem.cameraPitch < 128) {
						SoundSystem.cameraPitch = 128;
					}

					if (SoundSystem.cameraPitch > 383) {
						SoundSystem.cameraPitch = 383;
					}
				}
			}
		}

		var22 = MouseHandler.MouseHandler_x;
		var23 = MouseHandler.MouseHandler_y;
		if (MouseHandler.MouseHandler_lastButton != 0) {
			var22 = MouseHandler.MouseHandler_lastPressedX;
			var23 = MouseHandler.MouseHandler_lastPressedY;
		}

		if (var22 >= var0 && var22 < var0 + var2 && var23 >= var1 && var23 < var3 + var1) {
			var24 = var22 - var0;
			var25 = var23 - var1;
			ViewportMouse.ViewportMouse_x = var24;
			ViewportMouse.ViewportMouse_y = var25;
			ViewportMouse.ViewportMouse_isInViewport = true;
			ViewportMouse.ViewportMouse_entityCount = 0;
			ViewportMouse.ViewportMouse_false0 = false;
			Iterator var33 = Client.worldViewManager.iterator();

			while (var33.hasNext()) {
				WorldView var34 = (WorldView)var33.next();
				var34.scene.method4932(var34.plane, var22 - var0, var23 - var1);
			}
		} else {
			ItemContainer.method2466();
		}

		UserComparator3.method3232();
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
		UserComparator3.method3232();
		var24 = Rasterizer3D.get3dZoom();
		Rasterizer3D.method4701(NpcOverrides.client.field171);
		Rasterizer3D.clips.zoom = Client.viewportZoom;
		var25 = HttpResponse.entity.getX();
		var26 = HttpResponse.entity.getY();
		class232 var44 = class31.field153 == -1 ? class232.field2479 : class232.field2480;
		HttpRequest.topLevelWorldView.scene.method5076(var44);
		HttpRequest.topLevelWorldView.scene.draw(class403.cameraX, class166.cameraY, class328.cameraZ, SoundSystem.cameraPitch, ReflectionCheck.cameraYaw, var16, var25, var26, Client.isCameraLocked);
		Rasterizer3D.method4701(false);
		if (Client.z) {
			Rasterizer2D.adjustBrightness();
		}

		Rasterizer3D.clips.zoom = var24;
		UserComparator3.method3232();
		HttpRequest.topLevelWorldView.scene.setViewportWalking();

		WorldEntity var36;
		for (var28 = 0; var28 < HttpRequest.topLevelWorldView.worldEntityCount; ++var28) {
			var36 = HttpRequest.topLevelWorldView.worldEntities[HttpRequest.topLevelWorldView.worldEntityIndices[var28]];
			if (var36 != null) {
				var36.worldView.scene.setViewportWalking();
			}
		}

		AttackOption.method2985(HttpRequest.topLevelWorldView, var0, var1, var2, var3);

		for (var28 = 0; var28 < HttpRequest.topLevelWorldView.worldEntityCount; ++var28) {
			var36 = HttpRequest.topLevelWorldView.worldEntities[HttpRequest.topLevelWorldView.worldEntityIndices[var28]];
			if (var36 != null) {
				AttackOption.method2985(var36.worldView, var0, var1, var2, var3);
			}
		}

		WorldView var35 = HttpRequest.topLevelWorldView;
		if (Client.hintArrowType == 2) {
			int var29 = Client.field539 * 64 + (Client.hintArrowX - var35.baseX << 7);
			int var30 = (Client.hintArrowY - var35.baseY << 7) + Client.field808 * 4096;
			class228.worldToScreen(var35, var29, var30, var29, var30, Client.field538 * 2);
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) {
				class369.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}
		}

		((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).animate(Client.graphicsCycle);
		NPCComposition.method3953(var0, var1, var2, var3);
		class403.cameraX = var17;
		class166.cameraY = var18;
		class328.cameraZ = var19;
		SoundSystem.cameraPitch = var20;
		ReflectionCheck.cameraYaw = var21;
		if (Client.isLoading && GrandExchangeOfferTotalQuantityComparator.field4633.method7654(true, false) == 0) {
			Client.isLoading = false;
		}

		if (Client.isLoading) {
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
			class135.drawLoadingMessage("Loading - please wait.", false);
		}

	}

	@ObfuscatedName("ou")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1657625988"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		Iterator var0 = Messages.Messages_hashTable.iterator();

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next();
			var1.clearIsFromIgnored();
		}

		if (class178.friendsChat != null) {
			class178.friendsChat.invalidateIgnoreds();
		}

	}
}
