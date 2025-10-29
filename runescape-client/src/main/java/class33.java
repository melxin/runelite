import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bj")
public class class33 {
	@ObfuscatedName("au")
	@Export("Tiles_underlays")
	static short[][][] Tiles_underlays;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -844395485
	)
	int field139;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -621391697
	)
	int field140;

	class33(int var1, int var2) {
		this.field139 = var1;
		this.field140 = var2;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lbs;I)Z",
		garbageValue = "-1190796916"
	)
	boolean method519(class29 var1) {
		if (var1 == null) {
			return false;
		} else {
			switch(this.field139) {
			case 1:
				return var1.vmethod6295(this.field140);
			case 2:
				return var1.vmethod6326(this.field140);
			case 3:
				return var1.vmethod6297((char)this.field140);
			case 4:
				return var1.vmethod6294(this.field140 == 1);
			default:
				return false;
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)[Lxy;",
		garbageValue = "1993951420"
	)
	static PrivateChatMode[] method517() {
		return new PrivateChatMode[]{PrivateChatMode.field6173, PrivateChatMode.field6175, PrivateChatMode.field6174};
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2115780482"
	)
	public static int method518(int var0) {
		return class543.field5657[var0 & 16383];
	}

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-867112715"
	)
	@Export("worldToScreen")
	static final void worldToScreen(int var0, int var1, int var2, int var3) {
		SoundCache.setViewportShape(var0, var1, var2, var3, true);
		var0 = Client.viewportOffsetX;
		var1 = Client.viewportOffsetY;
		var2 = Client.viewportWidth;
		var3 = Client.viewportHeight;
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
		Rasterizer3D.resetRasterClipping();
		Rasterizer2D.clearBrightness();
		int var4 = Client.camAngleX;
		if (Client.field447 / 256 > var4) {
			var4 = Client.field447 / 256;
		}

		if (Client.field543[4] && Client.field545[4] + 128 > var4) {
			var4 = Client.field545[4] + 128;
		}

		int var5 = Client.camAngleY & 2047;
		int var6 = class40.oculusOrbFocalPointX;
		int var7 = class289.oculusOrbFocalPointZ;
		int var8 = class4.oculusOrbFocalPointY;
		int var9 = GraphicsObject.method1936(var4);
		int var11 = var3 - 334;
		if (var11 < 0) {
			var11 = 0;
		} else if (var11 > 100) {
			var11 = 100;
		}

		int var12 = (Client.zoomWidth - Client.zoomHeight) * var11 / 100 + Client.zoomHeight;
		int var10 = var12 * var9 / 256;
		var11 = 2048 - var4 & 2047;
		var12 = 2048 - var5 & 2047;
		int var13 = 0;
		int var14 = 0;
		int var15 = var10;
		int var16;
		int var17;
		int var18;
		if (var11 != 0) {
			var16 = Rasterizer3D.Rasterizer3D_sine[var11];
			var17 = Rasterizer3D.Rasterizer3D_cosine[var11];
			var18 = var14 * var17 - var16 * var10 >> 16;
			var15 = var17 * var10 + var16 * var14 >> 16;
			var14 = var18;
		}

		if (var12 != 0) {
			var16 = Rasterizer3D.Rasterizer3D_sine[var12];
			var17 = Rasterizer3D.Rasterizer3D_cosine[var12];
			var18 = var15 * var16 + var17 * var13 >> 16;
			var15 = var15 * var17 - var13 * var16 >> 16;
			var13 = var18;
		}

		if (Client.isCameraLocked) {
			class207.field2252 = var6 - var13;
			class414.field4955 = var7 - var14;
			RouteStrategy.field3280 = var8 - var15;
			AsyncHttpResponse.field68 = var4;
			class300.field3420 = var5;
		} else {
			SpriteBufferProperties.cameraX = var6 - var13;
			ScriptFrame.cameraY = var7 - var14;
			class528.cameraZ = var8 - var15;
			GraphicsObject.cameraPitch = var4;
			WorldMapData_0.cameraYaw = var5;
		}

		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (class40.oculusOrbFocalPointX >> 7 != class330.localPlayer.x >> 7 || class4.oculusOrbFocalPointY >> 7 != class330.localPlayer.y >> 7)) {
			var16 = class330.localPlayer.plane;
			var17 = (class40.oculusOrbFocalPointX >> 7) + Occluder.topLevelWorldView.baseX;
			var18 = (class4.oculusOrbFocalPointY >> 7) + Occluder.topLevelWorldView.baseY;
			class114.method3598(var17, var18, var16, true);
		}

		int var19;
		int var20;
		int var21;
		int var22;
		if (!Client.isCameraLocked) {
			if (class468.clientPreferences.isRoofsHidden()) {
				var11 = Occluder.topLevelWorldView.plane;
			} else {
				label403: {
					var12 = 3;
					var13 = Client.field468 >> 7;
					var14 = Client.field512 >> 7;
					if (GraphicsObject.cameraPitch < 310) {
						label399: {
							if (Client.oculusOrbState == 1) {
								var15 = class40.oculusOrbFocalPointX >> 7;
								var16 = class4.oculusOrbFocalPointY >> 7;
							} else {
								var15 = var13;
								var16 = var14;
							}

							var17 = SpriteBufferProperties.cameraX >> 7;
							var18 = class528.cameraZ >> 7;
							if (var17 >= 0 && 104 > var17 && var18 >= 0 && 104 > var18) {
								if (var15 >= 0 && 104 > var15 && var16 >= 0 && 104 > var16) {
									if ((Occluder.topLevelWorldView.tileSettings[Occluder.topLevelWorldView.plane][var17][var18] & 4) != 0) {
										var12 = Occluder.topLevelWorldView.plane;
									}

									if (var15 > var17) {
										var19 = var15 - var17;
									} else {
										var19 = var17 - var15;
									}

									if (var16 > var18) {
										var20 = var16 - var18;
									} else {
										var20 = var18 - var16;
									}

									if (var19 > var20) {
										var21 = var20 * 65536 / var19;
										var22 = 32768;

										while (true) {
											if (var17 == var15) {
												break label399;
											}

											if (var17 < var15) {
												++var17;
											} else if (var17 > var15) {
												--var17;
											}

											if ((Occluder.topLevelWorldView.tileSettings[Occluder.topLevelWorldView.plane][var17][var18] & 4) != 0) {
												var12 = Occluder.topLevelWorldView.plane;
											}

											var22 += var21;
											if (var22 >= 65536) {
												var22 -= 65536;
												if (var18 < var16) {
													++var18;
												} else if (var18 > var16) {
													--var18;
												}

												if ((Occluder.topLevelWorldView.tileSettings[Occluder.topLevelWorldView.plane][var17][var18] & 4) != 0) {
													var12 = Occluder.topLevelWorldView.plane;
												}
											}
										}
									} else {
										if (var20 > 0) {
											var21 = var19 * 65536 / var20;
											var22 = 32768;

											while (var16 != var18) {
												if (var18 < var16) {
													++var18;
												} else if (var18 > var16) {
													--var18;
												}

												if ((Occluder.topLevelWorldView.tileSettings[Occluder.topLevelWorldView.plane][var17][var18] & 4) != 0) {
													var12 = Occluder.topLevelWorldView.plane;
												}

												var22 += var21;
												if (var22 >= 65536) {
													var22 -= 65536;
													if (var17 < var15) {
														++var17;
													} else if (var17 > var15) {
														--var17;
													}

													if ((Occluder.topLevelWorldView.tileSettings[Occluder.topLevelWorldView.plane][var17][var18] & 4) != 0) {
														var12 = Occluder.topLevelWorldView.plane;
													}
												}
											}
										}
										break label399;
									}
								}

								var11 = Occluder.topLevelWorldView.plane;
								break label403;
							}

							var11 = Occluder.topLevelWorldView.plane;
							break label403;
						}
					}

					if (var13 >= 0 && 104 > var13 && var14 >= 0 && 104 > var14) {
						if ((Occluder.topLevelWorldView.tileSettings[Occluder.topLevelWorldView.plane][var13][var14] & 4) != 0) {
							var12 = Occluder.topLevelWorldView.plane;
						}

						var11 = var12;
					} else {
						var11 = Occluder.topLevelWorldView.plane;
					}
				}
			}

			var10 = var11;
		} else {
			var10 = ArchiveLoader.method2155();
		}

		var11 = SpriteBufferProperties.cameraX;
		var12 = ScriptFrame.cameraY;
		var13 = class528.cameraZ;
		var14 = GraphicsObject.cameraPitch;
		var15 = WorldMapData_0.cameraYaw;

		for (var16 = 0; var16 < 5; ++var16) {
			if (Client.field543[var16]) {
				var17 = (int)(Math.random() * (double)(Client.field362[var16] * 2 + 1) - (double)Client.field362[var16] + Math.sin((double)Client.field546[var16] / 100.0D * (double)Client.field547[var16]) * (double)Client.field545[var16]);
				if (var16 == 0) {
					SpriteBufferProperties.cameraX += var17;
				}

				if (var16 == 1) {
					ScriptFrame.cameraY += var17;
				}

				if (var16 == 2) {
					class528.cameraZ += var17;
				}

				if (var16 == 3) {
					WorldMapData_0.cameraYaw = var17 + WorldMapData_0.cameraYaw & 2047;
				}

				if (var16 == 4) {
					GraphicsObject.cameraPitch += var17;
					if (GraphicsObject.cameraPitch < 128) {
						GraphicsObject.cameraPitch = 128;
					}

					if (GraphicsObject.cameraPitch > 383) {
						GraphicsObject.cameraPitch = 383;
					}
				}
			}
		}

		var16 = MouseHandler.MouseHandler_x;
		var17 = MouseHandler.MouseHandler_y;
		if (var16 >= var0 && var16 < var0 + var2 && var17 >= var1 && var17 < var3 + var1) {
			var18 = var16 - var0;
			var19 = var17 - var1;
			ViewportMouse.ViewportMouse_x = var18;
			ViewportMouse.ViewportMouse_y = var19;
			ViewportMouse.ViewportMouse_isInViewport = true;
			ViewportMouse.ViewportMouse_entityCount = 0;
			ViewportMouse.ViewportMouse_entityTags[0] = -1L;
			ViewportMouse.field3116[0] = Integer.MAX_VALUE;
			ViewportMouse.ViewportMouse_false0 = false;
			Iterator var24 = Client.worldViewManager.iterator();

			while (var24.hasNext()) {
				WorldView var25 = (WorldView)var24.next();
				var25.scene.method5611(var25.plane, var16 - var0, var17 - var1);
			}
		} else {
			class139.method3832();
		}

		HttpRequestTask.method290();
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
		HttpRequestTask.method290();
		var18 = Rasterizer3D.get3dZoom();
		Rasterizer3D.method5362(SecureUrlRequester.client.field171);
		Rasterizer3D.clips.zoom = Client.viewportZoom;
		TileRenderMode var26 = Client.currentWorldViewId == -1 ? TileRenderMode.field2669 : TileRenderMode.field2670;
		Occluder.topLevelWorldView.scene.method5592(var26);
		Occluder.topLevelWorldView.scene.draw(SpriteBufferProperties.cameraX, ScriptFrame.cameraY, class528.cameraZ, GraphicsObject.cameraPitch, WorldMapData_0.cameraYaw, var10, Client.field468, Client.field512, Client.isCameraLocked);
		SecureRandomCallable.method2149();
		Rasterizer3D.method5362(false);
		if (Client.z) {
			Rasterizer2D.adjustBrightness();
		}

		Rasterizer3D.clips.zoom = var18;
		HttpRequestTask.method290();
		Varcs.method3019(Occluder.topLevelWorldView, var0, var1, var2, var3);

		for (var20 = 0; var20 < Occluder.topLevelWorldView.field1148.method10038(); ++var20) {
			WorldEntity var28 = (WorldEntity)Occluder.topLevelWorldView.worldEntities.get((long)Occluder.topLevelWorldView.field1148.method10037(var20));
			if (var28 != null) {
				Varcs.method3019(var28.worldView, var0, var1, var2, var3);
			}
		}

		if (Client.hintArrow.method8423() == 2) {
			WorldView var27 = Client.worldViewManager.getWorldViewFromWorldPoint(Client.hintArrow.method8435(), Client.hintArrow.method8445());
			var21 = (Client.hintArrow.method8435() - var27.baseX << 7) + Client.hintArrow.method8427();
			var22 = (Client.hintArrow.method8445() - var27.baseY << 7) + Client.hintArrow.method8428();
			int var23 = Client.hintArrow.method8429() * 2;
			class155.method4001(var27, var21, var22, var23, 0);
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) {
				SceneTilePaint.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}
		}

		class431.method8826(var0, var1);
		((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).animate(Client.graphicsCycle);
		Client.field305 = 0;
		var20 = (class330.localPlayer.x >> 7) + Occluder.topLevelWorldView.baseX;
		var21 = (class330.localPlayer.y >> 7) + Occluder.topLevelWorldView.baseY;
		if (var20 >= 3053 && var20 <= 3156 && var21 >= 3056 && var21 <= 3136) {
			Client.field305 = 1;
		}

		if (var20 >= 3072 && var20 <= 3118 && var21 >= 9492 && var21 <= 9535) {
			Client.field305 = 1;
		}

		if (Client.field305 == 1 && var20 >= 3139 && var20 <= 3199 && var21 >= 3008 && var21 <= 3062) {
			Client.field305 = 0;
		}

		SpriteBufferProperties.cameraX = var11;
		ScriptFrame.cameraY = var12;
		class528.cameraZ = var13;
		GraphicsObject.cameraPitch = var14;
		WorldMapData_0.cameraYaw = var15;
		if (Client.isLoading && VarbitComposition.field2279.method8687(true, false) == 0) {
			Client.isLoading = false;
		}

		if (Client.isLoading) {
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
			HttpMethod.drawLoadingMessage("Loading - please wait.", false);
		}

	}

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-433401203"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		class177.method4269();
		Client.menu.menuWorldViewIds[0] = -1;
		Client.menu.menuActions[0] = "Cancel";
		Client.menu.menuTargets[0] = "";
		Client.menu.menuOpcodes[0] = 1006;
		Client.menu.menuShiftClick[0] = false;
		Client.menu.subMenus[0] = null;
		Client.menu.menuOptionsCount = 1;
	}
}
