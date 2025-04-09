import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lv")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1667284197
	)
	@Export("width")
	int width;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1601024511
	)
	@Export("height")
	int height;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 549502809
	)
	@Export("x")
	int x;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 119368031
	)
	@Export("y")
	int y;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	final WorldMapRenderer this$0;

	@ObfuscatedSignature(
		descriptor = "(Llg;)V"
	)
	WorldMapRectangle(WorldMapRenderer var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ao")
	public static final void method6331(long var0) {
		if (var0 > 0L) {
			if (0L == var0 % 10L) {
				ActorSpotAnim.method9427(var0 - 1L);
				ActorSpotAnim.method9427(1L);
			} else {
				ActorSpotAnim.method9427(var0);
			}

		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Ljl;",
		garbageValue = "-2008338430"
	)
	@Export("getParamDefinition")
	public static ParamComposition getParamDefinition(int var0) {
		ParamComposition var1 = (ParamComposition)ParamComposition.ParamDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ParamComposition.ParamDefinition_archive.takeFile(11, var0);
			var1 = new ParamComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			ParamComposition.ParamDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-426498525"
	)
	protected static final void method6333() {
		class395.clock.mark();

		int var0;
		for (var0 = 0; var0 < 32; ++var0) {
			GameEngine.graphicsTickTimes[var0] = 0L;
		}

		for (var0 = 0; var0 < 32; ++var0) {
			GameEngine.clientTickTimes[var0] = 0L;
		}

		class441.gameCyclesToDo = 0;
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(Ldj;IZI)V",
		garbageValue = "-1596504675"
	)
	@Export("addPlayerToScene")
	static void addPlayerToScene(WorldView var0, int var1, boolean var2) {
		Player var3 = (Player)var0.players.get((long)var1);
		if (var3 != null && var3.isVisible() && !var3.isHidden) {
			int var4 = var3.plane;
			var3.isUnanimated = false;
			if ((Client.isLowDetail && Client.playerUpdateManager.playerCount > 50 || Client.playerUpdateManager.playerCount > 200) && var2 && var3.idleSequence == var3.movementSequence) {
				var3.isUnanimated = true;
			}

			int var5 = var3.x >> 7;
			int var6 = var3.y >> 7;
			if (0 <= var5 && var5 < 104 && 0 <= var6 && var6 < 104) {
				long var7 = LoginPacket.calculateTag(0, 0, 0, 0, false, var3.index, var0.id);
				if (var3.model0 != null && Client.cycle >= var3.animationCycleStart && Client.cycle < var3.animationCycleEnd) {
					var3.isUnanimated = false;
					var3.tileHeight = GraphicsObject.getTileHeight(var0, var3.x, var3.y, var4);
					var3.playerCycle = Client.cycle;
					var0.scene.addNullableObject(var4, var3.x, var3.y, var3.tileHeight, 60, var3, var3.rotation, var7, var3.minX, var3.minY, var3.maxX, var3.maxY);
				} else {
					if ((var3.x & 127) == 64 && (var3.y & 127) == 64) {
						if (var0.tileLastDrawnActor[var5][var6] == Client.viewportDrawCount) {
							return;
						}

						var0.tileLastDrawnActor[var5][var6] = Client.viewportDrawCount;
					}

					var3.tileHeight = GraphicsObject.getTileHeight(var0, var3.x, var3.y, var4);
					var3.playerCycle = Client.cycle;
					var0.scene.drawEntity(var4, var3.x, var3.y, var3.tileHeight, 60, var3, var3.rotation, var7, var3.isWalking);
				}
			}
		}

	}

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "([Lnh;IIIIIIIIIIIB)V",
		garbageValue = "0"
	)
	static final void method6332(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		Rasterizer2D.Rasterizer2D_setClip(var5, var6, var7, var8);
		Rasterizer3D.resetRasterClipping();

		for (int var12 = var1; var12 <= var2; ++var12) {
			Widget var13 = var0[var12];
			if (var13 != null && (var3 == var13.parentId && var4 == var13.field3960 || var3 == -1412584499 && var13 == Client.clickedWidget)) {
				int var14;
				if (var11 == -1) {
					Client.rootWidgetXs[Client.rootWidgetCount] = var9 + var13.x;
					Client.rootWidgetYs[Client.rootWidgetCount] = var10 + var13.y;
					Client.rootWidgetWidths[Client.rootWidgetCount] = var13.width * 624892547;
					Client.rootWidgetHeights[Client.rootWidgetCount] = var13.height * 1265510039;
					var14 = ++Client.rootWidgetCount - 1;
				} else {
					var14 = var11;
				}

				var13.field3940 = var14;
				var13.cycle = Client.cycle;
				if (!var13.isIf3 || !DynamicObject.method2369(var13)) {
					if (var13.contentType > 0) {
						Script.method2363(var13);
					}

					int var15 = var9 + var13.x;
					int var16 = var10 + var13.y;
					int var17 = var13.transparencyTop;
					int var18;
					int var19;
					if (var13 == Client.clickedWidget) {
						if (var3 != -1412584499 && !var13.isScrollBar) {
							WorldMapLabel.field3304 = var0;
							HealthBarConfig.field1360 = var9;
							UrlRequest.field1489 = var10;
							continue;
						}

						if (Client.isDraggingWidget && Client.field725) {
							var18 = MouseHandler.MouseHandler_x;
							var19 = MouseHandler.MouseHandler_y;
							var18 -= Client.widgetClickX;
							var19 -= Client.widgetClickY;
							if (var18 < Client.field726) {
								var18 = Client.field726;
							}

							if (var18 + var13.width * 624892547 > Client.clickedWidgetParent.width * 624892547 + Client.field726) {
								var18 = Client.clickedWidgetParent.width * 624892547 + Client.field726 - var13.width * 624892547;
							}

							if (var19 < Client.field727) {
								var19 = Client.field727;
							}

							if (var19 + var13.height * 1265510039 > Client.clickedWidgetParent.height * 1265510039 + Client.field727) {
								var19 = Client.clickedWidgetParent.height * 1265510039 + Client.field727 - var13.height * 1265510039;
							}

							var15 = var18;
							var16 = var19;
						}

						if (!var13.isScrollBar) {
							var17 = 128;
						}
					}

					int var20;
					int var21;
					int var22;
					int var23;
					int var24;
					int var25;
					if (var13.type == 9) {
						var22 = var15;
						var23 = var16;
						var24 = var15 + var13.width * 624892547;
						var25 = var16 + var13.height * 1265510039;
						if (var24 < var15) {
							var22 = var24;
							var24 = var15;
						}

						if (var25 < var16) {
							var23 = var25;
							var25 = var16;
						}

						++var24;
						++var25;
						var18 = var22 > var5 ? var22 : var5;
						var19 = var23 > var6 ? var23 : var6;
						var20 = var24 < var7 ? var24 : var7;
						var21 = var25 < var8 ? var25 : var8;
					} else {
						var22 = var13.width * 624892547 + var15;
						var23 = var16 + var13.height * 1265510039;
						var18 = var15 > var5 ? var15 : var5;
						var19 = var16 > var6 ? var16 : var6;
						var20 = var22 < var7 ? var22 : var7;
						var21 = var23 < var8 ? var23 : var8;
					}

					if (!var13.isIf3 || var18 < var20 && var19 < var21) {
						if (var13.contentType != 0) {
							if (var13.contentType == 1336) {
								if (Renderable.clientPreferences.isDisplayingFps()) {
									var16 += 15;
									HorizontalAlignment.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var15 + var13.width * 624892547, var16, 16776960, -1);
									var16 += 15;
									Runtime var43 = Runtime.getRuntime();
									var23 = (int)((var43.totalMemory() - var43.freeMemory()) / 1024L);
									var24 = 16776960;
									if (var23 > 327680 && !Client.isLowDetail) {
										var24 = 16711680;
									}

									HorizontalAlignment.fontPlain12.drawRightAligned("Mem:" + var23 + "k", var13.width * 624892547 + var15, var16, var24, -1);
									var16 += 15;
								}
								continue;
							}

							if (var13.contentType == 1337) {
								Client.viewportX = var15;
								Client.viewportY = var16;
								FriendsList.drawEntities(var15, var16, var13.width * 624892547, var13.height * 1265510039);
								Client.validRootWidgets[var13.field3940] = true;
								Rasterizer2D.Rasterizer2D_setClip(var5, var6, var7, var8);
								continue;
							}

							if (var13.contentType == 1338) {
								class76.drawMinimap(var13, var15, var16, var14);
								Rasterizer2D.Rasterizer2D_setClip(var5, var6, var7, var8);
								continue;
							}

							if (var13.contentType == 1339) {
								class328.method6564(var13, var15, var16, var14);
								Rasterizer2D.Rasterizer2D_setClip(var5, var6, var7, var8);
								continue;
							}

							if (var13.contentType == 1400) {
								GameBuild.worldMap.draw(var15, var16, var13.width * 624892547, var13.height * 1265510039, Client.cycle, Renderable.clientPreferences.getBrightness());
							}

							if (var13.contentType == 1401) {
								GameBuild.worldMap.drawOverview(var15, var16, var13.width * 624892547, var13.height * 1265510039);
							}

							if (var13.contentType == 1402) {
								WorldMapLabelSize.loginScreenRunesAnimation.draw(var15, Client.cycle);
							}
						}

						if (var13.type == 0) {
							if (!var13.isIf3 && DynamicObject.method2369(var13) && var13 != AbstractUserComparator.field5138) {
								continue;
							}

							if (!var13.isIf3) {
								if (var13.scrollY > var13.scrollHeight - var13.height * 1265510039) {
									var13.scrollY = var13.scrollHeight - var13.height * 1265510039;
								}

								if (var13.scrollY < 0) {
									var13.scrollY = 0;
								}
							}

							method6332(var0, var13.field3962, var13.field3968, var13.id, var13.childIndex * -1626125685, var18, var19, var20, var21, var15 - var13.scrollX, var16 - var13.scrollY, var14);
							if (var13.children != null) {
								method6332(var13.children, 0, var13.children.length - 1, var13.id, -1, var18, var19, var20, var21, var15 - var13.scrollX, var16 - var13.scrollY, var14);
							}

							if (var13.childIndex * -1626125685 == -1) {
								InterfaceParent var31 = (InterfaceParent)Client.interfaceParents.get((long)var13.id);
								if (var31 != null) {
									class33.drawWidgets(var31.group, var18, var19, var20, var21, var15, var16, var14);
								}
							}

							Rasterizer2D.Rasterizer2D_setClip(var5, var6, var7, var8);
							Rasterizer3D.resetRasterClipping();
						} else if (var13.type == 11) {
							if (DynamicObject.method2369(var13) && var13 != AbstractUserComparator.field5138) {
								continue;
							}

							if (var13.children != null) {
								method6332(var13.children, 0, var13.children.length - 1, var13.id, -1, var18, var19, var20, var21, var15 - var13.scrollX, var16 - var13.scrollY, var14);
							}

							Rasterizer2D.Rasterizer2D_setClip(var5, var6, var7, var8);
							Rasterizer3D.resetRasterClipping();
						}

						if (Client.isResizable || Client.field752[var14] || Client.gameDrawingMode > 1) {
							if (var13.type == 0 && !var13.isIf3 && var13.scrollHeight > var13.height * 1265510039) {
								class448.drawScrollBar(var15 + var13.width * 624892547, var16, var13.scrollY, var13.height * 1265510039, var13.scrollHeight);
							}

							if (var13.type != 1) {
								if (var13.type == 3) {
									if (class370.runCs1(var13)) {
										var22 = var13.color2;
										if (var13 == AbstractUserComparator.field5138 && var13.mouseOverColor2 != 0) {
											var22 = var13.mouseOverColor2;
										}
									} else {
										var22 = var13.color;
										if (var13 == AbstractUserComparator.field5138 && var13.mouseOverColor != 0) {
											var22 = var13.mouseOverColor;
										}
									}

									if (var13.fill) {
										switch(var13.fillMode.field5677) {
										case 1:
											Rasterizer2D.Rasterizer2D_fillRectangleGradient(var15, var16, var13.width * 624892547, var13.height * 1265510039, var13.color, var13.color2);
											break;
										case 2:
											Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var15, var16, var13.width * 624892547, var13.height * 1265510039, var13.color, var13.color2, 255 - (var13.transparencyTop & 255), 255 - (var13.transparencyBot & 255));
											break;
										default:
											if (var17 == 0) {
												Rasterizer2D.Rasterizer2D_fillRectangle(var15, var16, var13.width * 624892547, var13.height * 1265510039, var22);
											} else {
												Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var15, var16, var13.width * 624892547, var13.height * 1265510039, var22, 256 - (var17 & 255));
											}
										}
									} else if (var17 == 0) {
										Rasterizer2D.Rasterizer2D_drawRectangle(var15, var16, var13.width * 624892547, var13.height * 1265510039, var22);
									} else {
										Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var15, var16, var13.width * 624892547, var13.height * 1265510039, var22, 256 - (var17 & 255));
									}
								} else if (var13.type == 4) {
									Font var42 = var13.getFont(class232.widgetDefinition);
									if (var42 == null) {
										if (Widget.field3937) {
											class139.invalidateWidget(var13);
										}
									} else {
										String var45 = var13.text;
										if (class370.runCs1(var13)) {
											var23 = var13.color2;
											if (var13 == AbstractUserComparator.field5138 && var13.mouseOverColor2 != 0) {
												var23 = var13.mouseOverColor2;
											}

											if (!var13.text2.isEmpty()) {
												var45 = var13.text2;
											}
										} else {
											var23 = var13.color;
											if (var13 == AbstractUserComparator.field5138 && var13.mouseOverColor != 0) {
												var23 = var13.mouseOverColor;
											}
										}

										if (var13.isIf3 && var13.itemId != -1) {
											ItemComposition var46 = class231.ItemDefinition_get(var13.itemId);
											var45 = var46.name;
											if (var45 == null) {
												var45 = "null";
											}

											if ((var46.isStackable == 1 || var13.itemQuantity != 1) && var13.itemQuantity != -1) {
												var45 = Decimator.colorStartTag(16748608) + var45 + "</col>" + " " + 'x' + class171.formatItemStacks(var13.itemQuantity);
											}
										}

										if (var13 == Client.meslayerContinueWidget) {
											var45 = "Please wait...";
											var23 = var13.color;
										}

										if (!var13.isIf3) {
											var45 = UrlRequest.method3194(var45, var13);
										}

										var42.drawWidgetText(var45, var15, var16, var13.width * 624892547, var13.height * 1265510039, var23, var13.textShadowed ? 0 : -1, class521.method9679(var13.transparencyTop), var13.textXAlignment, var13.textYAlignment, var13.textLineHeight);
									}
								} else {
									int var26;
									int var27;
									int var28;
									if (var13.type == 5) {
										SpritePixels var41;
										if (!var13.isIf3) {
											var41 = var13.getSprite(class232.widgetDefinition, class370.runCs1(var13), ParamComposition.urlRequester);
											if (var41 != null) {
												var41.drawTransBgAt(var15, var16);
											} else if (Widget.field3937) {
												class139.invalidateWidget(var13);
											}
										} else {
											if (var13.itemId != -1) {
												var41 = class1.getItemSprite(var13.itemId, var13.itemQuantity, var13.outline, var13.spriteShadow, var13.itemQuantityMode, false);
											} else {
												var41 = var13.getSprite(class232.widgetDefinition, false, ParamComposition.urlRequester);
											}

											if (var41 == null) {
												if (Widget.field3937) {
													class139.invalidateWidget(var13);
												}
											} else {
												var23 = var41.width;
												var24 = var41.height;
												if (!var13.spriteTiling) {
													var25 = var13.width * -240635904 / var23;
													if (var13.spriteAngle != 0) {
														var41.method10780(var15 + var13.width * 624892547 / 2, var16 + var13.height * 1265510039 / 2, var13.spriteAngle, var25);
													} else if (var17 != 0) {
														var41.drawTransScaledAt(var15, var16, var13.width * 624892547, var13.height * 1265510039, 256 - (var17 & 255));
													} else if (var23 == var13.width * 624892547 && var24 == var13.height * 1265510039) {
														var41.drawTransBgAt(var15, var16);
													} else {
														var41.drawScaledAt(var15, var16, var13.width * 624892547, var13.height * 1265510039);
													}
												} else {
													Rasterizer2D.Rasterizer2D_expandClip(var15, var16, var13.width * 624892547 + var15, var16 + var13.height * 1265510039);
													var25 = (var13.width * 624892547 + (var23 - 1)) / var23;
													var26 = (var24 - 1 + var13.height * 1265510039) / var24;

													for (var27 = 0; var27 < var25; ++var27) {
														for (var28 = 0; var28 < var26; ++var28) {
															if (var13.spriteAngle != 0) {
																var41.method10780(var23 / 2 + var15 + var23 * var27, var24 / 2 + var16 + var28 * var24, var13.spriteAngle, 4096);
															} else if (var17 != 0) {
																var41.drawTransAt(var15 + var23 * var27, var16 + var24 * var28, 256 - (var17 & 255));
															} else {
																var41.drawTransBgAt(var15 + var23 * var27, var16 + var24 * var28);
															}
														}
													}

													Rasterizer2D.Rasterizer2D_setClip(var5, var6, var7, var8);
												}
											}
										}
									} else {
										int var29;
										if (var13.type == 6) {
											boolean var39 = class370.runCs1(var13);
											if (var39) {
												var23 = var13.sequenceId2;
											} else {
												var23 = var13.sequenceId;
											}

											Model var44 = null;
											var25 = 0;
											if (var13.itemId != -1) {
												ItemComposition var47 = class231.ItemDefinition_get(var13.itemId);
												if (var47 != null) {
													var47 = var47.getCountObj(var13.itemQuantity);
													var44 = var47.getModel(1);
													if (var44 != null) {
														var44.calculateBoundsCylinder();
														var25 = var44.height / 2;
													} else {
														class139.invalidateWidget(var13);
													}
												}
											} else if (var13.modelType == 5) {
												if (var13.modelId == 0) {
													var44 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
												} else {
													var44 = Script.localPlayer.getModel();
												}
											} else if (var13.modelType == 7) {
												var44 = var13.field3932.getModel((SequenceDefinition)null, -1, class91.SequenceDefinition_get(Script.localPlayer.idleSequence), Script.localPlayer.movementFrame);
											} else {
												NPCComposition var48 = null;
												NpcOverrides var36 = null;
												if (var13.modelType == 6) {
													var28 = var13.modelId;
													if (var28 >= 0) {
														NPC var37 = (NPC)class509.topLevelWorldView.npcs.get((long)var28);
														if (var37 != null && var37.definition != null) {
															var48 = var37.definition;
															if (var48.transforms != null) {
																var48 = var48.transform();
															}

															var36 = var37.method2905();
														}
													}
												} else if (var13.modelType == 2) {
													var28 = var13.modelId;
													var48 = class232.getNpcDefinition(var28);
													if (var48.transforms != null) {
														var48 = var48.transform();
													}
												}

												SequenceDefinition var38 = null;
												var29 = -1;
												if (var23 != -1) {
													var38 = class91.SequenceDefinition_get(var23);
													var29 = var13.modelFrame;
												}

												var44 = var13.getModel(class232.widgetDefinition, var38, var29, var39, Script.localPlayer.appearance, var48, var36);
												if (var44 == null && Widget.field3937) {
													class139.invalidateWidget(var13);
												}
											}

											Rasterizer3D.setCustomClipBounds(var13.width * 624892547 / 2 + var15, var16 + var13.height * 1265510039 / 2);
											var26 = Rasterizer3D.Rasterizer3D_sine[var13.modelAngleX] * var13.modelZoom >> 16;
											var27 = Rasterizer3D.Rasterizer3D_cosine[var13.modelAngleX] * var13.modelZoom >> 16;
											if (var44 != null) {
												if (!var13.isIf3) {
													var44.drawFrustum(0, var13.modelAngleY, 0, var13.modelAngleX, 0, var26, var27);
												} else {
													var44.calculateBoundsCylinder();
													if (var13.modelOrthog) {
														var44.drawOrtho(0, var13.modelAngleY, var13.modelAngleZ, var13.modelAngleX, var13.modelOffsetX, var26 + var25 + var13.modelOffsetY, var27 + var13.modelOffsetY, var13.modelZoom);
													} else {
														var44.drawFrustum(0, var13.modelAngleY, var13.modelAngleZ, var13.modelAngleX, var13.modelOffsetX, var26 + var25 + var13.modelOffsetY, var27 + var13.modelOffsetY);
													}
												}
											}

											Rasterizer3D.setClipBounds();
										} else {
											Font var33;
											if (var13.type == 8) {
												if (var13 == class555.field5526 && Client.field691 == Client.field712) {
													var22 = 0;
													var23 = 0;
													var33 = HorizontalAlignment.fontPlain12;
													String var34 = var13.text;

													String var35;
													for (var34 = UrlRequest.method3194(var34, var13); !var34.isEmpty(); var23 = var23 + var33.ascent + 1) {
														var27 = var34.indexOf("<br>");
														if (var27 != -1) {
															var35 = var34.substring(0, var27);
															var34 = var34.substring(var27 + 4);
														} else {
															var35 = var34;
															var34 = "";
														}

														var28 = var33.stringWidth(var35);
														if (var28 > var22) {
															var22 = var28;
														}
													}

													var22 += 6;
													var23 += 7;
													var27 = var13.width * 624892547 + var15 - 5 - var22;
													var28 = var16 + var13.height * 1265510039 + 5;
													if (var27 < var15 + 5) {
														var27 = var15 + 5;
													}

													if (var22 + var27 > var7) {
														var27 = var7 - var22;
													}

													if (var28 + var23 > var8) {
														var28 = var8 - var23;
													}

													Rasterizer2D.Rasterizer2D_fillRectangle(var27, var28, var22, var23, 16777120);
													Rasterizer2D.Rasterizer2D_drawRectangle(var27, var28, var22, var23, 0);
													var34 = var13.text;
													var29 = var28 + var33.ascent + 2;

													for (var34 = UrlRequest.method3194(var34, var13); !var34.isEmpty(); var29 = var29 + var33.ascent + 1) {
														int var30 = var34.indexOf("<br>");
														if (var30 != -1) {
															var35 = var34.substring(0, var30);
															var34 = var34.substring(var30 + 4);
														} else {
															var35 = var34;
															var34 = "";
														}

														var33.draw(var35, var27 + 3, var29, 0, -1);
													}
												}
											} else if (var13.type == 9) {
												if (var13.field3977) {
													var22 = var15;
													var23 = var16 + var13.height * 1265510039;
													var24 = var15 + var13.width * 624892547;
													var25 = var16;
												} else {
													var22 = var15;
													var23 = var16;
													var24 = var13.width * 624892547 + var15;
													var25 = var16 + var13.height * 1265510039;
												}

												if (var13.lineWid == 1) {
													Rasterizer2D.Rasterizer2D_drawLine(var22, var23, var24, var25, var13.color);
												} else {
													SoundSystem.method860(var22, var23, var24, var25, var13.color, var13.lineWid);
												}
											} else if (var13.type == 12) {
												class361 var40 = var13.method7377();
												class355 var32 = var13.method7378();
												if (var40 != null && var32 != null && var40.method7118()) {
													var33 = var13.getFont(class232.widgetDefinition);
													if (var33 != null) {
														Client.field623.method10927(var15, var16, var13.width * 624892547, var13.height * 1265510039, var40.method7119(), var40.method7120(), var40.method7116(), var40.method7129(), var40.method7115());
														var25 = var13.textShadowed ? var13.spriteShadow : -1;
														if (!var40.method7113() && var40.method7110().method8593()) {
															Client.field623.method10934(var32.field3859, var25, var32.field3860, var32.field3858);
															Client.field623.method10930(var40.method7201(), var33);
														} else {
															Client.field623.method10934(var13.color, var25, var32.field3860, var32.field3858);
															Client.field623.method10930(var40.method7110(), var33);
														}

														Rasterizer2D.Rasterizer2D_setClip(var5, var6, var7, var8);
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

	}
}
