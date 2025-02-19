import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ef")
@Implements("UserComparator8")
public class UserComparator8 extends AbstractUserComparator {
	@ObfuscatedName("jm")
	@Export("regionLandArchiveIds")
	static int[] regionLandArchiveIds;
	@ObfuscatedName("ab")
	@Export("reversed")
	final boolean reversed;

	public UserComparator8(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lst;Lst;B)I",
		garbageValue = "-41"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world) {
			if (var2.world != Client.worldId) {
				return this.reversed ? -1 : 1;
			}
		} else if (var2.world == Client.worldId) {
			return this.reversed ? 1 : -1;
		}

		return this.compareUser(var1, var2);
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ldp;[BIIB)V",
		garbageValue = "73"
	)
	static final void method3190(WorldView var0, byte[] var1, int var2, int var3) {
		Buffer var4 = new Buffer(var1);
		int var5 = -1;

		while (true) {
			int var6 = var4.readIncrSmallSmart();
			if (var6 == 0) {
				return;
			}

			var5 += var6;
			int var7 = 0;

			while (true) {
				int var8 = var4.readUShortSmart();
				if (var8 == 0) {
					break;
				}

				var7 += var8 - 1;
				int var9 = var7 & 63;
				int var10 = var7 >> 6 & 63;
				int var11 = var7 >> 12;
				int var12 = var4.readUnsignedByte();
				int var13 = var12 >> 2;
				int var14 = var12 & 3;
				int var15 = var10 + var2;
				int var16 = var3 + var9;
				if (var15 > 0 && var16 > 0 && var15 < var0.tileHeights[0].length - 2 && var16 < var0.tileHeights[0][0].length - 2) {
					int var17 = var11;
					if ((var0.tileSettings[1][var15][var16] & 2) == 2) {
						var17 = var11 - 1;
					}

					CollisionMap var18 = null;
					if (var17 >= 0 && var0.collisionMaps != null) {
						var18 = var0.collisionMaps[var17];
					}

					FillMode.addObjects(var0, var11, var15, var16, var5, var14, var13, var18);
				}
			}
		}
	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1059748940"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount;
		class200.topLevelWorldView.scene.cycle = Client.cycle;
		if (class132.localPlayer.x >> 7 == Client.destinationX && class132.localPlayer.y >> 7 == Client.destinationY) {
			Client.destinationX = 0;
		}

		WorldView var4 = class200.topLevelWorldView;
		int var8;
		int var9;
		int var12;
		int var16;
		int var17;
		int var19;
		if (Client.field790 > 0) {
			int var5 = Client.field742 * 128;
			Model var6 = BoundaryObject.field3009;
			boolean var7 = true;
			var8 = Math.max(384, 2000 - Client.viewportZoom * 2);
			var9 = Client.field647;
			var12 = class520.field5274[var5 & 2047];
			double var10 = (double)var12 / 65536.0D;
			var12 = var9 - (int)(var10 * (double)var8);
			int var13 = Client.field532;
			double var14 = (double)class204.method4072(var5) / 65536.0D;
			var16 = var13 - (int)((double)var8 * var14);
			var17 = var12 >> 7;
			var19 = var16 >> 7;
			long var20 = HttpRequestTask.calculateTag(var17, var19, 5, false, -1, var4.id);
			var4.scene.drawEntity(var4.plane, var12, var16, Client.field648, 60, var6, var5, var20, false);
		}

		WorldView var27 = class200.topLevelWorldView;
		int var28 = class332.method6534();
		int var11;
		int var15;
		int var18;
		int var21;
		int var30;
		int var31;
		int var44;
		if (var27 == class200.topLevelWorldView && var28 >= 0 && Client.menu.menuOpcodes[var28] == 60) {
			var44 = Client.menu.menuIdentifiers[var28] * 128;
			Model var29 = SongTask.field5033;
			boolean var45 = true;
			var30 = Math.max(384, 2000 - Client.viewportZoom * 2);
			var11 = Client.field647;
			var31 = class520.field5274[var44 & 2047];
			double var32 = (double)var31 / 65536.0D;
			var31 = var11 - (int)(var32 * (double)var30);
			var15 = Client.field532;
			double var34 = (double)class204.method4072(var44) / 65536.0D;
			var18 = var15 - (int)((double)var30 * var34);
			var19 = var31 >> 7;
			var21 = var18 >> 7;
			long var22 = HttpRequestTask.calculateTag(var19, var21, 5, false, -1, var27.id);
			var27.scene.drawEntity(var27.plane, var31, var18, Client.field648, 60, var29, var44, var22, false);
		}

		UserComparator3.method3217(class200.topLevelWorldView);
		FaceNormal.method5192(class200.topLevelWorldView);
		ReflectionCheck.method671(class200.topLevelWorldView, class386.TOKEN);
		ReflectionCheck.method671(class200.topLevelWorldView, class386.field4552);
		class138.addNpcsToScene(class200.topLevelWorldView, true);
		class138.method3392(class200.topLevelWorldView);
		class138.addNpcsToScene(class200.topLevelWorldView, false);
		class1.method12(class200.topLevelWorldView);
		WorldView var43 = class200.topLevelWorldView;

		for (GraphicsObject var37 = (GraphicsObject)var43.graphicsObjects.last(); var37 != null; var37 = (GraphicsObject)var43.graphicsObjects.previous()) {
			if (var37.plane == var43.plane && !var37.isFinished) {
				if (Client.cycle >= var37.cycleStart) {
					var37.advance(Client.graphicsCycle);
					if (var37.isFinished) {
						var37.remove();
					} else {
						var43.scene.drawEntity(var37.plane, var37.x, var37.y, var37.z, 60, var37, 0, -1L, false);
					}
				}
			} else {
				var37.remove();
			}
		}

		ReflectionCheck.method671(class200.topLevelWorldView, class386.field4553);
		ParamComposition.setViewportShape(var0, var1, var2, var3, true);
		var0 = Client.viewportOffsetX;
		var1 = Client.viewportOffsetY;
		var2 = Client.viewportWidth;
		var3 = Client.viewportHeight;
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
		Rasterizer3D.resetRasterClipping();
		Rasterizer2D.clearBrightness();
		var44 = Client.camAngleX;
		if (Client.field617 / 256 > var44) {
			var44 = Client.field617 / 256;
		}

		if (Client.field523[4] && Client.field784[4] + 128 > var44) {
			var44 = Client.field784[4] + 128;
		}

		var8 = Client.camAngleY & 2047;
		var9 = RestClientThreadFactory.oculusOrbFocalPointX;
		var30 = class274.oculusOrbFocalPointZ;
		var11 = class173.oculusOrbFocalPointY;
		var12 = var44 * 3 + 600;
		var15 = var3 - 334;
		if (var15 < 0) {
			var15 = 0;
		} else if (var15 > 100) {
			var15 = 100;
		}

		var16 = (Client.zoomWidth - Client.zoomHeight) * var15 / 100 + Client.zoomHeight;
		var31 = var12 * var16 / 256;
		var15 = 2048 - var44 & 2047;
		var16 = 2048 - var8 & 2047;
		var17 = 0;
		var18 = 0;
		var19 = var31;
		int var36;
		int var38;
		if (var15 != 0) {
			var36 = Rasterizer3D.Rasterizer3D_sine[var15];
			var21 = Rasterizer3D.Rasterizer3D_cosine[var15];
			var38 = var18 * var21 - var31 * var36 >> 16;
			var19 = var21 * var31 + var18 * var36 >> 16;
			var18 = var38;
		}

		if (var16 != 0) {
			var36 = Rasterizer3D.Rasterizer3D_sine[var16];
			var21 = Rasterizer3D.Rasterizer3D_cosine[var16];
			var38 = var36 * var19 + var17 * var21 >> 16;
			var19 = var21 * var19 - var17 * var36 >> 16;
			var17 = var38;
		}

		if (Client.isCameraLocked) {
			class329.field3661 = var9 - var17;
			class190.field2016 = var30 - var18;
			FriendsChat.field5114 = var11 - var19;
			Language.field4826 = var44;
			class346.field3797 = var8;
		} else {
			class181.cameraX = var9 - var17;
			GrandExchangeOfferUnitPriceComparator.cameraY = var30 - var18;
			ApproximateRouteStrategy.cameraZ = var11 - var19;
			class59.cameraPitch = var44;
			FloorDecoration.cameraYaw = var8;
		}

		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (RestClientThreadFactory.oculusOrbFocalPointX >> 7 != class132.localPlayer.x >> 7 || class173.oculusOrbFocalPointY >> 7 != class132.localPlayer.y >> 7)) {
			var36 = class132.localPlayer.plane;
			var21 = (RestClientThreadFactory.oculusOrbFocalPointX >> 7) + class200.topLevelWorldView.baseX;
			var38 = (class173.oculusOrbFocalPointY >> 7) + class200.topLevelWorldView.baseY;
			SecureUrlRequester.method3159(var21, var38, var36, true);
		}

		int var24;
		int var25;
		int var26;
		if (!Client.isCameraLocked) {
			if (AbstractWorldMapIcon.clientPreferences.isRoofsHidden()) {
				var15 = class200.topLevelWorldView.plane;
			} else {
				label488: {
					var16 = 3;
					var17 = Client.field647 >> 7;
					var18 = Client.field532 >> 7;
					if (class59.cameraPitch < 310) {
						if (Client.oculusOrbState == 1) {
							var19 = RestClientThreadFactory.oculusOrbFocalPointX >> 7;
							var36 = class173.oculusOrbFocalPointY >> 7;
						} else {
							var19 = var17;
							var36 = var18;
						}

						var21 = class181.cameraX >> 7;
						var38 = ApproximateRouteStrategy.cameraZ >> 7;
						if (var21 < 0 || 104 <= var21 || var38 < 0 || 104 <= var38) {
							var15 = class200.topLevelWorldView.plane;
							break label488;
						}

						if (var19 < 0 || 104 <= var19 || var36 < 0 || 104 <= var36) {
							var15 = class200.topLevelWorldView.plane;
							break label488;
						}

						if ((class200.topLevelWorldView.tileSettings[class200.topLevelWorldView.plane][var21][var38] & 4) != 0) {
							var16 = class200.topLevelWorldView.plane;
						}

						int var23;
						if (var19 > var21) {
							var23 = var19 - var21;
						} else {
							var23 = var21 - var19;
						}

						if (var36 > var38) {
							var24 = var36 - var38;
						} else {
							var24 = var38 - var36;
						}

						if (var23 > var24) {
							var25 = var24 * 65536 / var23;
							var26 = 32768;

							while (var21 != var19) {
								if (var21 < var19) {
									++var21;
								} else if (var21 > var19) {
									--var21;
								}

								if ((class200.topLevelWorldView.tileSettings[class200.topLevelWorldView.plane][var21][var38] & 4) != 0) {
									var16 = class200.topLevelWorldView.plane;
								}

								var26 += var25;
								if (var26 >= 65536) {
									var26 -= 65536;
									if (var38 < var36) {
										++var38;
									} else if (var38 > var36) {
										--var38;
									}

									if ((class200.topLevelWorldView.tileSettings[class200.topLevelWorldView.plane][var21][var38] & 4) != 0) {
										var16 = class200.topLevelWorldView.plane;
									}
								}
							}
						} else if (var24 > 0) {
							var25 = var23 * 65536 / var24;
							var26 = 32768;

							while (var36 != var38) {
								if (var38 < var36) {
									++var38;
								} else if (var38 > var36) {
									--var38;
								}

								if ((class200.topLevelWorldView.tileSettings[class200.topLevelWorldView.plane][var21][var38] & 4) != 0) {
									var16 = class200.topLevelWorldView.plane;
								}

								var26 += var25;
								if (var26 >= 65536) {
									var26 -= 65536;
									if (var21 < var19) {
										++var21;
									} else if (var21 > var19) {
										--var21;
									}

									if ((class200.topLevelWorldView.tileSettings[class200.topLevelWorldView.plane][var21][var38] & 4) != 0) {
										var16 = class200.topLevelWorldView.plane;
									}
								}
							}
						}
					}

					if (var17 >= 0 && 104 > var17 && var18 >= 0 && 104 > var18) {
						if ((class200.topLevelWorldView.tileSettings[class200.topLevelWorldView.plane][var17][var18] & 4) != 0) {
							var16 = class200.topLevelWorldView.plane;
						}

						var15 = var16;
					} else {
						var15 = class200.topLevelWorldView.plane;
					}
				}
			}

			var31 = var15;
		} else {
			var31 = class7.method44();
		}

		var15 = class181.cameraX;
		var16 = GrandExchangeOfferUnitPriceComparator.cameraY;
		var17 = ApproximateRouteStrategy.cameraZ;
		var18 = class59.cameraPitch;
		var19 = FloorDecoration.cameraYaw;

		for (var36 = 0; var36 < 5; ++var36) {
			if (Client.field523[var36]) {
				var21 = (int)(Math.random() * (double)(Client.field783[var36] * 2 + 1) - (double)Client.field783[var36] + Math.sin((double)Client.field785[var36] / 100.0D * (double)Client.field786[var36]) * (double)Client.field784[var36]);
				if (var36 == 0) {
					class181.cameraX += var21;
				}

				if (var36 == 1) {
					GrandExchangeOfferUnitPriceComparator.cameraY += var21;
				}

				if (var36 == 2) {
					ApproximateRouteStrategy.cameraZ += var21;
				}

				if (var36 == 3) {
					FloorDecoration.cameraYaw = var21 + FloorDecoration.cameraYaw & 2047;
				}

				if (var36 == 4) {
					class59.cameraPitch += var21;
					if (class59.cameraPitch < 128) {
						class59.cameraPitch = 128;
					}

					if (class59.cameraPitch > 383) {
						class59.cameraPitch = 383;
					}
				}
			}
		}

		var36 = MouseHandler.MouseHandler_x;
		var21 = MouseHandler.MouseHandler_y;
		if (MouseHandler.MouseHandler_lastButton != 0) {
			var36 = MouseHandler.MouseHandler_lastPressedX;
			var21 = MouseHandler.MouseHandler_lastPressedY;
		}

		if (var36 >= var0 && var36 < var0 + var2 && var21 >= var1 && var21 < var3 + var1) {
			ClanChannel.method3682(var36 - var0, var21 - var1);
			Iterator var39 = Client.worldViewManager.iterator();

			while (var39.hasNext()) {
				WorldView var40 = (WorldView)var39.next();
				var40.scene.method5070(var40.plane, var36 - var0, var21 - var1);
			}
		} else {
			FriendSystem.method1958();
		}

		UrlRequester.method3151();
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
		UrlRequester.method3151();
		var38 = Rasterizer3D.get3dZoom();
		Rasterizer3D.method4743(class569.client.field205);
		Rasterizer3D.clips.zoom = Client.viewportZoom;
		class232 var46 = Client.field780 == -1 ? class232.field2516 : class232.field2515;
		class200.topLevelWorldView.scene.method4982(var46);
		class200.topLevelWorldView.scene.draw(class181.cameraX, GrandExchangeOfferUnitPriceComparator.cameraY, ApproximateRouteStrategy.cameraZ, class59.cameraPitch, FloorDecoration.cameraYaw, var31, Client.field647, Client.field532, Client.isCameraLocked);
		Rasterizer3D.method4743(false);
		if (Client.z) {
			Rasterizer2D.adjustBrightness();
		}

		Rasterizer3D.clips.zoom = var38;
		UrlRequester.method3151();
		class200.topLevelWorldView.scene.setViewportWalking();

		WorldEntity var42;
		for (var24 = 0; var24 < class200.topLevelWorldView.field1357.method9005(); ++var24) {
			var42 = (WorldEntity)class200.topLevelWorldView.worldEntities.get((long)class200.topLevelWorldView.field1357.method9007(var24));
			if (var42 != null) {
				var42.worldView.scene.setViewportWalking();
			}
		}

		ReflectionCheck.method669(class200.topLevelWorldView, var0, var1, var2, var3);

		for (var24 = 0; var24 < class200.topLevelWorldView.field1357.method9005(); ++var24) {
			var42 = (WorldEntity)class200.topLevelWorldView.worldEntities.get((long)class200.topLevelWorldView.field1357.method9007(var24));
			if (var42 != null) {
				ReflectionCheck.method669(var42.worldView, var0, var1, var2, var3);
			}
		}

		WorldView var41 = class200.topLevelWorldView;
		if (Client.hintArrowType == 2) {
			var25 = Client.hintArrowSubX * 64 + (Client.hintArrowX - var41.baseX << 7);
			var26 = (Client.hintArrowY - var41.baseY << 7) + Client.hintArrowSubY * 4096;
			VarpDefinition.worldToScreen(var41, var25, var26, var25, var26, Client.hintArrowHeight * 2);
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) {
				PlayerComposition.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}
		}

		((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).animate(Client.graphicsCycle);
		Client.field637 = 0;
		var25 = (class132.localPlayer.x >> 7) + class200.topLevelWorldView.baseX;
		var26 = (class132.localPlayer.y >> 7) + class200.topLevelWorldView.baseY;
		if (var25 >= 3053 && var25 <= 3156 && var26 >= 3056 && var26 <= 3136) {
			Client.field637 = 1;
		}

		if (var25 >= 3072 && var25 <= 3118 && var26 >= 9492 && var26 <= 9535) {
			Client.field637 = 1;
		}

		if (Client.field637 == 1 && var25 >= 3139 && var25 <= 3199 && var26 >= 3008 && var26 <= 3062) {
			Client.field637 = 0;
		}

		class181.cameraX = var15;
		GrandExchangeOfferUnitPriceComparator.cameraY = var16;
		ApproximateRouteStrategy.cameraZ = var17;
		class59.cameraPitch = var18;
		FloorDecoration.cameraYaw = var19;
		if (Client.isLoading && AsyncHttpResponse.field77.method7751(true, false) == 0) {
			Client.isLoading = false;
		}

		if (Client.isLoading) {
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
			TextureProvider.drawLoadingMessage("Loading - please wait.", false);
		}

	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)Z",
		garbageValue = "-1008872583"
	)
	static boolean method3186(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		Scene var7 = class376.worldView.scene;
		int var9;
		if (var5 == class388.field4565.field4568) {
			BoundaryObject var8 = var7.getBoundaryObject(var0, var1, var2);
			if (var8 != null) {
				var9 = FaceNormal.Entity_unpackID(var8.tag);
				if (var3 == WorldMapDecorationType.field4118.id) {
					var8.renderable1 = new DynamicObject(class376.worldView, var9, 2, var4 + 4, var0, var1, var2, var6, false, var8.renderable1);
					var8.renderable2 = new DynamicObject(class376.worldView, var9, 2, var4 + 1 & 3, var0, var1, var2, var6, false, var8.renderable2);
				} else {
					var8.renderable1 = new DynamicObject(class376.worldView, var9, var3, var4, var0, var1, var2, var6, false, var8.renderable1);
				}

				return true;
			}
		} else if (var5 == class388.field4566.field4568) {
			WallDecoration var10 = var7.getWallDecoration(var0, var1, var2);
			if (var10 != null) {
				var9 = FaceNormal.Entity_unpackID(var10.tag);
				if (var3 != WorldMapDecorationType.field4121.id && var3 != WorldMapDecorationType.field4134.id) {
					if (var3 == WorldMapDecorationType.field4123.id) {
						var10.renderable1 = new DynamicObject(class376.worldView, var9, 4, var4 + 4, var0, var1, var2, var6, false, var10.renderable1);
					} else if (var3 == WorldMapDecorationType.field4122.id) {
						var10.renderable1 = new DynamicObject(class376.worldView, var9, 4, (var4 + 2 & 3) + 4, var0, var1, var2, var6, false, var10.renderable1);
					} else if (var3 == WorldMapDecorationType.field4125.id) {
						var10.renderable1 = new DynamicObject(class376.worldView, var9, 4, var4 + 4, var0, var1, var2, var6, false, var10.renderable1);
						var10.renderable2 = new DynamicObject(class376.worldView, var9, 4, (var4 + 2 & 3) + 4, var0, var1, var2, var6, false, var10.renderable2);
					}
				} else {
					var10.renderable1 = new DynamicObject(class376.worldView, var9, 4, var4, var0, var1, var2, var6, false, var10.renderable1);
				}

				return true;
			}
		} else if (var5 == class388.field4567.field4568) {
			GameObject var11 = var7.getGameObject(var0, var1, var2);
			if (var3 == WorldMapDecorationType.field4137.id) {
				var3 = WorldMapDecorationType.field4136.id;
			}

			if (var11 != null) {
				var11.renderable = new DynamicObject(class376.worldView, FaceNormal.Entity_unpackID(var11.tag), var3, var4, var0, var1, var2, var6, false, var11.renderable);
				return true;
			}
		} else if (var5 == class388.field4569.field4568) {
			FloorDecoration var12 = var7.getFloorDecoration(var0, var1, var2);
			if (var12 != null) {
				var12.renderable = new DynamicObject(class376.worldView, FaceNormal.Entity_unpackID(var12.tag), 22, var4, var0, var1, var2, var6, false, var12.renderable);
				return true;
			}
		}

		return false;
	}
}
