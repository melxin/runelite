import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rq")
@Implements("SwapSongTask")
public class SwapSongTask extends SongTask {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 2099695683
	)
	@Export("canvasHeight")
	public static int canvasHeight;

	@ObfuscatedSignature(
		descriptor = "(Lrt;)V"
	)
	public SwapSongTask(SongTask var1) {
		super(var1);
		super.field5028 = "SwapSongTask";
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2115930134"
	)
	public boolean vmethod8896() {
		if (class335.midiRequests.size() > 1 && class335.midiRequests.get(0) != null && ((MidiRequest)class335.midiRequests.get(0)).midiPcmStream.isReady() && class335.midiRequests.get(1) != null && ((MidiRequest)class335.midiRequests.get(1)).midiPcmStream.isReady()) {
			MidiRequest var1 = (MidiRequest)class335.midiRequests.get(0);
			class335.midiRequests.set(0, class335.midiRequests.get(1));
			class335.midiRequests.set(1, var1);
		}

		return true;
	}

	@ObfuscatedName("mf")
	@ObfuscatedSignature(
		descriptor = "([Lnz;IIIIIIIII)V",
		garbageValue = "-1947041401"
	)
	@Export("drawInterface")
	static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
		Rasterizer3D.resetRasterClipping();

		for (int var9 = 0; var9 < var0.length; ++var9) {
			Widget var10 = var0[var9];
			if (var10 != null && (var10.parentId == var1 || var1 == -1412584499 && var10 == Client.clickedWidget)) {
				int var11;
				if (var8 == -1) {
					Client.rootWidgetXs[Client.rootWidgetCount] = var10.x + var6;
					Client.rootWidgetYs[Client.rootWidgetCount] = var7 + var10.y;
					Client.rootWidgetWidths[Client.rootWidgetCount] = var10.width * 779142065;
					Client.rootWidgetHeights[Client.rootWidgetCount] = var10.height * 1836304183;
					var11 = ++Client.rootWidgetCount - 1;
				} else {
					var11 = var8;
				}

				var10.rootIndex = var11;
				var10.cycle = Client.cycle;
				if (!var10.isIf3 || !PendingSpawn.isComponentHidden(var10)) {
					if (var10.contentType > 0) {
						BuddyRankComparator.method3246(var10);
					}

					int var12 = var10.x + var6;
					int var13 = var7 + var10.y;
					int var14 = var10.transparencyTop;
					int var15;
					int var16;
					if (var10 == Client.clickedWidget) {
						if (var1 != -1412584499 && !var10.isScrollBar) {
							GameEngine.field197 = var0;
							class150.field1726 = var6;
							MidiRequest.field3815 = var7;
							continue;
						}

						if (Client.isDraggingWidget && Client.field697) {
							var15 = MouseHandler.MouseHandler_x;
							var16 = MouseHandler.MouseHandler_y;
							var15 -= Client.widgetClickX;
							var16 -= Client.widgetClickY;
							if (var15 < Client.field565) {
								var15 = Client.field565;
							}

							if (var15 + var10.width * 779142065 > Client.clickedWidgetParent.width * 779142065 + Client.field565) {
								var15 = Client.clickedWidgetParent.width * 779142065 + Client.field565 - var10.width * 779142065;
							}

							if (var16 < Client.field699) {
								var16 = Client.field699;
							}

							if (var10.height * 1836304183 + var16 > Client.clickedWidgetParent.height * 1836304183 + Client.field699) {
								var16 = Client.clickedWidgetParent.height * 1836304183 + Client.field699 - var10.height * 1836304183;
							}

							var12 = var15;
							var13 = var16;
						}

						if (!var10.isScrollBar) {
							var14 = 128;
						}
					}

					int var17;
					int var18;
					int var19;
					int var20;
					int var21;
					int var22;
					if (var10.type == 9) {
						var19 = var12;
						var20 = var13;
						var21 = var12 + var10.width * 779142065;
						var22 = var13 + var10.height * 1836304183;
						if (var21 < var12) {
							var19 = var21;
							var21 = var12;
						}

						if (var22 < var13) {
							var20 = var22;
							var22 = var13;
						}

						++var21;
						++var22;
						var15 = var19 > var2 ? var19 : var2;
						var16 = var20 > var3 ? var20 : var3;
						var17 = var21 < var4 ? var21 : var4;
						var18 = var22 < var5 ? var22 : var5;
					} else {
						var19 = var10.width * 779142065 + var12;
						var20 = var13 + var10.height * 1836304183;
						var15 = var12 > var2 ? var12 : var2;
						var16 = var13 > var3 ? var13 : var3;
						var17 = var19 < var4 ? var19 : var4;
						var18 = var20 < var5 ? var20 : var5;
					}

					if (!var10.isIf3 || var15 < var17 && var16 < var18) {
						if (var10.contentType != 0) {
							if (var10.contentType == 1336) {
								if (AbstractWorldMapIcon.clientPreferences.isDisplayingFps()) {
									var13 += 15;
									class187.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var10.width * 779142065 + var12, var13, 16776960, -1);
									var13 += 15;
									Runtime var41 = Runtime.getRuntime();
									var20 = (int)((var41.totalMemory() - var41.freeMemory()) / 1024L);
									var21 = 16776960;
									if (var20 > 327680 && !Client.isLowDetail) {
										var21 = 16711680;
									}

									class187.fontPlain12.drawRightAligned("Mem:" + var20 + "k", var12 + var10.width * 779142065, var13, var21, -1);
									var13 += 15;
								}
								continue;
							}

							if (var10.contentType == 1337) {
								Client.viewportX = var12;
								Client.viewportY = var13;
								UserComparator8.drawEntities(var12, var13, var10.width * 779142065, var10.height * 1836304183);
								Client.validRootWidgets[var10.rootIndex] = true;
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
								continue;
							}

							if (var10.contentType == 1338) {
								class229.drawMinimap(var10, var12, var13, var11);
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
								continue;
							}

							if (var10.contentType == 1339) {
								class91.method2459(var10, var12, var13, var11);
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
								continue;
							}

							if (var10.contentType == 1400) {
								class541.worldMap.draw(var12, var13, var10.width * 779142065, var10.height * 1836304183, Client.cycle, AbstractWorldMapIcon.clientPreferences.getBrightness());
							}

							if (var10.contentType == 1401) {
								class541.worldMap.drawOverview(var12, var13, var10.width * 779142065, var10.height * 1836304183);
							}

							if (var10.contentType == 1402) {
								FloorDecoration.loginScreenRunesAnimation.draw(var12, Client.cycle);
							}
						}

						if (var10.type == 0) {
							if (!var10.isIf3 && PendingSpawn.isComponentHidden(var10) && var10 != class27.mousedOverWidgetIf1) {
								continue;
							}

							if (!var10.isIf3) {
								if (var10.scrollY > var10.scrollHeight - var10.height * 1836304183) {
									var10.scrollY = var10.scrollHeight - var10.height * 1836304183;
								}

								if (var10.scrollY < 0) {
									var10.scrollY = 0;
								}
							}

							drawInterface(var0, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							if (var10.children != null) {
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							InterfaceParent var28 = (InterfaceParent)Client.interfaceParents.get((long)var10.id);
							if (var28 != null) {
								class272.drawWidgets(var28.group, var15, var16, var17, var18, var12, var13, var11);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
							Rasterizer3D.resetRasterClipping();
						} else if (var10.type == 11) {
							if (PendingSpawn.isComponentHidden(var10) && var10 != class27.mousedOverWidgetIf1) {
								continue;
							}

							if (var10.children != null) {
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
							Rasterizer3D.resetRasterClipping();
						}

						if (Client.isResizable || Client.field732[var11] || Client.gameDrawingMode > 1) {
							if (var10.type == 0 && !var10.isIf3 && var10.scrollHeight > var10.height * 1836304183) {
								WorldEntity.drawScrollBar(var12 + var10.width * 779142065, var13, var10.scrollY, var10.height * 1836304183, var10.scrollHeight);
							}

							if (var10.type != 1) {
								if (var10.type == 3) {
									if (class60.runCs1(var10)) {
										var19 = var10.color2;
										if (var10 == class27.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) {
											var19 = var10.mouseOverColor2;
										}
									} else {
										var19 = var10.color;
										if (var10 == class27.mousedOverWidgetIf1 && var10.mouseOverColor != 0) {
											var19 = var10.mouseOverColor;
										}
									}

									if (var10.fill) {
										switch(var10.fillMode.field5657) {
										case 1:
											Rasterizer2D.Rasterizer2D_fillRectangleGradient(var12, var13, var10.width * 779142065, var10.height * 1836304183, var10.color, var10.color2);
											break;
										case 2:
											Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var12, var13, var10.width * 779142065, var10.height * 1836304183, var10.color, var10.color2, 255 - (var10.transparencyTop & 255), 255 - (var10.transparencyBot & 255));
											break;
										default:
											if (var14 == 0) {
												Rasterizer2D.Rasterizer2D_fillRectangle(var12, var13, var10.width * 779142065, var10.height * 1836304183, var19);
											} else {
												Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var12, var13, var10.width * 779142065, var10.height * 1836304183, var19, 256 - (var14 & 255));
											}
										}
									} else if (var14 == 0) {
										Rasterizer2D.Rasterizer2D_drawRectangle(var12, var13, var10.width * 779142065, var10.height * 1836304183, var19);
									} else {
										Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var12, var13, var10.width * 779142065, var10.height * 1836304183, var19, 256 - (var14 & 255));
									}
								} else if (var10.type == 4) {
									Font var40 = var10.getFont(class376.widgetDefinition);
									if (var40 == null) {
										if (Widget.field3928) {
											MilliClock.invalidateWidget(var10);
										}
									} else {
										String var42 = var10.text;
										if (class60.runCs1(var10)) {
											var20 = var10.color2;
											if (var10 == class27.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) {
												var20 = var10.mouseOverColor2;
											}

											if (var10.text2.length() > 0) {
												var42 = var10.text2;
											}
										} else {
											var20 = var10.color;
											if (var10 == class27.mousedOverWidgetIf1 && var10.mouseOverColor != 0) {
												var20 = var10.mouseOverColor;
											}
										}

										if (var10.isIf3 && var10.itemId != -1) {
											ItemComposition var43 = class138.ItemDefinition_get(var10.itemId);
											var42 = var43.name;
											if (var42 == null) {
												var42 = "null";
											}

											if ((var43.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) {
												var42 = MilliClock.colorStartTag(16748608) + var42 + "</col>" + " " + 'x' + TextureProvider.formatItemStacks(var10.itemQuantity);
											}
										}

										if (var10 == Client.meslayerContinueWidget) {
											var42 = "Please wait...";
											var20 = var10.color;
										}

										if (!var10.isIf3) {
											var42 = User.method9174(var42, var10);
										}

										var40.drawWidgetText(var42, var12, var13, var10.width * 779142065, var10.height * 1836304183, var20, var10.textShadowed ? 0 : -1, class521.method9608(var10.transparencyTop), var10.textXAlignment, var10.textYAlignment, var10.textLineHeight);
									}
								} else {
									int var23;
									int var24;
									int var25;
									if (var10.type == 5) {
										SpritePixels var38;
										if (!var10.isIf3) {
											var38 = var10.getSprite(class376.widgetDefinition, class60.runCs1(var10), Tiles.urlRequester);
											if (var38 != null) {
												var38.drawTransBgAt(var12, var13);
											} else if (Widget.field3928) {
												MilliClock.invalidateWidget(var10);
											}
										} else {
											if (var10.itemId != -1) {
												var38 = Interpreter.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
											} else {
												var38 = var10.getSprite(class376.widgetDefinition, false, Tiles.urlRequester);
											}

											if (var38 == null) {
												if (Widget.field3928) {
													MilliClock.invalidateWidget(var10);
												}
											} else {
												var20 = var38.width;
												var21 = var38.height;
												if (!var10.spriteTiling) {
													var22 = var10.width * 205197312 / var20;
													if (var10.spriteAngle != 0) {
														var38.method10714(var12 + var10.width * 779142065 / 2, var13 + var10.height * 1836304183 / 2, var10.spriteAngle, var22);
													} else if (var14 != 0) {
														var38.drawTransScaledAt(var12, var13, var10.width * 779142065, var10.height * 1836304183, 256 - (var14 & 255));
													} else if (var20 == var10.width * 779142065 && var10.height * 1836304183 == var21) {
														var38.drawTransBgAt(var12, var13);
													} else {
														var38.drawScaledAt(var12, var13, var10.width * 779142065, var10.height * 1836304183);
													}
												} else {
													Rasterizer2D.Rasterizer2D_expandClip(var12, var13, var10.width * 779142065 + var12, var13 + var10.height * 1836304183);
													var22 = (var20 - 1 + var10.width * 779142065) / var20;
													var23 = (var10.height * 1836304183 + (var21 - 1)) / var21;

													for (var24 = 0; var24 < var22; ++var24) {
														for (var25 = 0; var25 < var23; ++var25) {
															if (var10.spriteAngle != 0) {
																var38.method10714(var20 / 2 + var12 + var24 * var20, var21 / 2 + var13 + var25 * var21, var10.spriteAngle, 4096);
															} else if (var14 != 0) {
																var38.drawTransAt(var12 + var20 * var24, var13 + var25 * var21, 256 - (var14 & 255));
															} else {
																var38.drawTransBgAt(var12 + var24 * var20, var13 + var25 * var21);
															}
														}
													}

													Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
												}
											}
										}
									} else {
										int var26;
										if (var10.type == 6) {
											boolean var36 = class60.runCs1(var10);
											if (var36) {
												var20 = var10.sequenceId2;
											} else {
												var20 = var10.sequenceId;
											}

											Model var39 = null;
											var22 = 0;
											if (var10.itemId != -1) {
												ItemComposition var44 = class138.ItemDefinition_get(var10.itemId);
												if (var44 != null) {
													var44 = var44.getCountObj(var10.itemQuantity);
													var39 = var44.getModel(1);
													if (var39 != null) {
														var39.calculateBoundsCylinder();
														var22 = var39.height / 2;
													} else {
														MilliClock.invalidateWidget(var10);
													}
												}
											} else if (var10.modelType == 5) {
												if (var10.modelId == 0) {
													var39 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
												} else {
													var39 = class132.localPlayer.getModel();
												}
											} else if (var10.modelType == 7) {
												var39 = var10.field3981.getModel((SequenceDefinition)null, -1, WorldMapData_1.SequenceDefinition_get(class132.localPlayer.idleSequence), class132.localPlayer.movementFrame);
											} else {
												NPCComposition var45 = null;
												NpcOverrides var33 = null;
												if (var10.modelType == 6) {
													var25 = var10.modelId;
													if (var25 >= 0) {
														NPC var34 = (NPC)class200.topLevelWorldView.field1356.method7890((long)var25);
														if (var34 != null && var34.definition != null) {
															var45 = var34.definition;
															if (var45.transforms != null) {
																var45 = var45.transform();
															}

															var33 = var34.method2866();
														}
													}
												} else if (var10.modelType == 2) {
													var25 = var10.modelId;
													var45 = class91.getNpcDefinition(var25);
													if (var45.transforms != null) {
														var45 = var45.transform();
													}
												}

												SequenceDefinition var35 = null;
												var26 = -1;
												if (var20 != -1) {
													var35 = WorldMapData_1.SequenceDefinition_get(var20);
													var26 = var10.modelFrame;
												}

												var39 = var10.getModel(class376.widgetDefinition, var35, var26, var36, class132.localPlayer.appearance, var45, var33);
												if (var39 == null && Widget.field3928) {
													MilliClock.invalidateWidget(var10);
												}
											}

											Rasterizer3D.setCustomClipBounds(var12 + var10.width * 779142065 / 2, var13 + var10.height * 1836304183 / 2);
											var23 = Rasterizer3D.Rasterizer3D_sine[var10.modelAngleX] * var10.modelZoom >> 16;
											var24 = Rasterizer3D.Rasterizer3D_cosine[var10.modelAngleX] * var10.modelZoom >> 16;
											if (var39 != null) {
												if (!var10.isIf3) {
													var39.drawFrustum(0, var10.modelAngleY, 0, var10.modelAngleX, 0, var23, var24);
												} else {
													var39.calculateBoundsCylinder();
													if (var10.modelOrthog) {
														var39.drawOrtho(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var23 + var22 + var10.modelOffsetY, var24 + var10.modelOffsetY, var10.modelZoom);
													} else {
														var39.drawFrustum(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var24 + var10.modelOffsetY);
													}
												}
											}

											Rasterizer3D.setClipBounds();
										} else {
											Font var29;
											if (var10.type == 8 && var10 == WorldMapLabel.field3311 && Client.field706 == Client.field639) {
												var19 = 0;
												var20 = 0;
												var29 = class187.fontPlain12;
												String var30 = var10.text;

												String var31;
												for (var30 = User.method9174(var30, var10); var30.length() > 0; var20 = var20 + var29.ascent + 1) {
													var24 = var30.indexOf("<br>");
													if (var24 != -1) {
														var31 = var30.substring(0, var24);
														var30 = var30.substring(var24 + 4);
													} else {
														var31 = var30;
														var30 = "";
													}

													var25 = var29.stringWidth(var31);
													if (var25 > var19) {
														var19 = var25;
													}
												}

												var19 += 6;
												var20 += 7;
												var24 = var10.width * 779142065 + var12 - 5 - var19;
												var25 = var10.height * 1836304183 + var13 + 5;
												if (var24 < var12 + 5) {
													var24 = var12 + 5;
												}

												if (var24 + var19 > var4) {
													var24 = var4 - var19;
												}

												if (var25 + var20 > var5) {
													var25 = var5 - var20;
												}

												Rasterizer2D.Rasterizer2D_fillRectangle(var24, var25, var19, var20, 16777120);
												Rasterizer2D.Rasterizer2D_drawRectangle(var24, var25, var19, var20, 0);
												var30 = var10.text;
												var26 = var25 + var29.ascent + 2;

												for (var30 = User.method9174(var30, var10); var30.length() > 0; var26 = var26 + var29.ascent + 1) {
													int var27 = var30.indexOf("<br>");
													if (var27 != -1) {
														var31 = var30.substring(0, var27);
														var30 = var30.substring(var27 + 4);
													} else {
														var31 = var30;
														var30 = "";
													}

													var29.draw(var31, var24 + 3, var26, 0, -1);
												}
											}

											if (var10.type == 9) {
												if (var10.field3965) {
													var19 = var12;
													var20 = var13 + var10.height * 1836304183;
													var21 = var12 + var10.width * 779142065;
													var22 = var13;
												} else {
													var19 = var12;
													var20 = var13;
													var21 = var12 + var10.width * 779142065;
													var22 = var10.height * 1836304183 + var13;
												}

												if (var10.lineWid == 1) {
													Rasterizer2D.Rasterizer2D_drawLine(var19, var20, var21, var22, var10.color);
												} else {
													class229.method4610(var19, var20, var21, var22, var10.color, var10.lineWid);
												}
											} else if (var10.type == 12) {
												class361 var37 = var10.method7331();
												class355 var32 = var10.method7332();
												if (var37 != null && var32 != null && var37.method7077()) {
													var29 = var10.getFont(class376.widgetDefinition);
													if (var29 != null) {
														Client.field805.method10865(var12, var13, var10.width * 779142065, var10.height * 1836304183, var37.method7078(), var37.method7079(), var37.method7075(), var37.method7076(), var37.method7074());
														var22 = var10.textShadowed ? var10.spriteShadow : -1;
														if (!var37.method7072() && var37.method7069().method8666()) {
															Client.field805.method10864(var32.field3849, var22, var32.field3853, var32.field3848);
															Client.field805.method10861(var37.method7070(), var29);
														} else {
															Client.field805.method10864(var10.color, var22, var32.field3853, var32.field3848);
															Client.field805.method10861(var37.method7069(), var29);
														}

														Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
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
