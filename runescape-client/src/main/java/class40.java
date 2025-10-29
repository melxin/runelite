import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("by")
public class class40 {
	@ObfuscatedName("pp")
	@ObfuscatedGetter(
		intValue = 605904631
	)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "1019556323"
	)
	@Export("getUserHash")
	static long getUserHash() {
		return Client.userHash;
	}

	@ObfuscatedName("mx")
	@ObfuscatedSignature(
		descriptor = "(Ldv;IIIIS)V",
		garbageValue = "32557"
	)
	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPC var0, int var1, int var2, int var3, int var4) {
		NPCComposition var5 = var0.definition;
		if (Client.menu.menuOptionsCount < 400) {
			if (var5.transforms != null) {
				var5 = var5.transform();
			}

			if (var5 != null) {
				if (var5.isInteractable) {
					if (!var5.isFollower || Client.followerIndex == var1) {
						String var6 = var0.method2810();
						int var7;
						if (var5.combatLevel != 0 && var0.field1076 != 0) {
							var7 = var0.field1076 != -1 ? var0.field1076 : var5.combatLevel;
							var6 = var6 + class108.method3521(var7, class330.localPlayer.combatLevel) + " " + " (" + "level-" + var7 + ")";
						}

						if (var5.lowPriorityFollowerOps && Client.followerOpsLowPriority) {
							ClanChannel.insertMenuItem("Examine", class144.colorStartTag(16776960) + var6, 1003, var1, var2, var3, -1, false, var4);
						}

						if (!class349.field3990 && Client.isItemSelected == 1) {
							ClanChannel.insertMenuItem("Use", Client.field485 + " " + "->" + " " + class144.colorStartTag(16776960) + var6, 7, var1, var2, var3, -1, false, var4);
						} else if (Client.isSpellSelected) {
							if (!class349.field3990 && (DesktopPlatformInfoProvider.selectedSpellFlags & 2) == 2) {
								ClanChannel.insertMenuItem(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class144.colorStartTag(16776960) + var6, 8, var1, var2, var3, -1, false, var4);
							}
						} else {
							var7 = var5.lowPriorityFollowerOps && Client.followerOpsLowPriority ? 2000 : 0;
							String[] var8 = var5.actions;
							int var9;
							int var10;
							if (var8 != null) {
								for (var9 = 4; var9 >= 0; --var9) {
									if (!class349.field3990 && var0.method2875(var9) && var8[var9] != null && !var8[var9].equalsIgnoreCase("Attack")) {
										var10 = 0;
										if (var9 == 0) {
											var10 = var7 + 9;
										}

										if (var9 == 1) {
											var10 = var7 + 10;
										}

										if (var9 == 2) {
											var10 = var7 + 11;
										}

										if (var9 == 3) {
											var10 = var7 + 12;
										}

										if (var9 == 4) {
											var10 = var7 + 13;
										}

										ClanChannel.insertMenuItem(var8[var9], class144.colorStartTag(16776960) + var6, var10, var1, var2, var3, -1, false, var4);
									}
								}
							}

							if (var8 != null) {
								for (var9 = 4; var9 >= 0; --var9) {
									if (!class349.field3990 && var0.method2875(var9) && var8[var9] != null && var8[var9].equalsIgnoreCase("Attack")) {
										short var11 = 0;
										if (AttackOption.AttackOption_hidden != Client.npcAttackOption) {
											if (AttackOption.AttackOption_alwaysRightClick == Client.npcAttackOption || Client.npcAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var5.combatLevel > class330.localPlayer.combatLevel) {
												var11 = 2000;
											}

											var10 = 0;
											if (var9 == 0) {
												var10 = var11 + 9;
											}

											if (var9 == 1) {
												var10 = var11 + 10;
											}

											if (var9 == 2) {
												var10 = var11 + 11;
											}

											if (var9 == 3) {
												var10 = var11 + 12;
											}

											if (var9 == 4) {
												var10 = var11 + 13;
											}

											ClanChannel.insertMenuItem(var8[var9], class144.colorStartTag(16776960) + var6, var10, var1, var2, var3, -1, false, var4);
										}
									}
								}
							}

							if (!var5.lowPriorityFollowerOps || !Client.followerOpsLowPriority) {
								ClanChannel.insertMenuItem("Examine", class144.colorStartTag(16776960) + var6, 1003, var1, var2, var3, -1, false, var4);
							}
						}

					}
				}
			}
		}
	}

	@ObfuscatedName("me")
	@ObfuscatedSignature(
		descriptor = "([Lof;IIIIIIIIIIII)V",
		garbageValue = "1105137527"
	)
	@Export("drawInterface")
	static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		Rasterizer2D.Rasterizer2D_setClip(var5, var6, var7, var8);
		Rasterizer3D.resetRasterClipping();

		for (int var12 = var1; var12 <= var2; ++var12) {
			Widget var13 = var0[var12];
			if (var13 != null && (var3 == var13.parentId && var4 == var13.field4234 || var3 == -1412584499 && var13 == Client.clickedWidget)) {
				int var14;
				if (var11 == -1) {
					Client.rootWidgetXs[Client.rootWidgetCount] = var9 + var13.x;
					Client.rootWidgetYs[Client.rootWidgetCount] = var10 + var13.y;
					Client.rootWidgetWidths[Client.rootWidgetCount] = var13.width * -1946208531;
					Client.rootWidgetHeights[Client.rootWidgetCount] = var13.height * -905446999;
					var14 = ++Client.rootWidgetCount - 1;
				} else {
					var14 = var11;
				}

				var13.rootIndex = var14;
				var13.cycle = Client.cycle;
				if (!var13.isIf3 || !class330.isComponentHidden(var13)) {
					if (var13.contentType > 0) {
						class88.method2983(var13);
					}

					int var15 = var9 + var13.x;
					int var16 = var10 + var13.y;
					int var17 = var13.transparencyTop;
					int var18;
					int var19;
					if (var13 == Client.clickedWidget) {
						if (var3 != -1412584499 && !var13.isScrollBar) {
							class66.field882 = var0;
							DevicePcmPlayerProvider.field88 = var9;
							UserComparator3.field1560 = var10;
							continue;
						}

						if (Client.isDraggingWidget && Client.field465) {
							var18 = MouseHandler.MouseHandler_x;
							var19 = MouseHandler.MouseHandler_y;
							var18 -= Client.widgetClickX;
							var19 -= Client.widgetClickY;
							if (var18 < Client.field411) {
								var18 = Client.field411;
							}

							if (var18 + var13.width * -1946208531 > Client.clickedWidgetParent.width * -1946208531 + Client.field411) {
								var18 = Client.clickedWidgetParent.width * -1946208531 + Client.field411 - var13.width * -1946208531;
							}

							if (var19 < Client.field292) {
								var19 = Client.field292;
							}

							if (var19 + var13.height * -905446999 > Client.clickedWidgetParent.height * -905446999 + Client.field292) {
								var19 = Client.clickedWidgetParent.height * -905446999 + Client.field292 - var13.height * -905446999;
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
						var24 = var13.width * -1946208531 + var15;
						var25 = var16 + var13.height * -905446999;
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
						var22 = var13.width * -1946208531 + var15;
						var23 = var16 + var13.height * -905446999;
						var18 = var15 > var5 ? var15 : var5;
						var19 = var16 > var6 ? var16 : var6;
						var20 = var22 < var7 ? var22 : var7;
						var21 = var23 < var8 ? var23 : var8;
					}

					if (!var13.isIf3 || var18 < var20 && var19 < var21) {
						if (var13.contentType != 0) {
							if (var13.contentType == 1336) {
								if (class468.clientPreferences.isDisplayingFps()) {
									var16 += 15;
									UserComparator5.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var13.width * -1946208531 + var15, var16, 16776960, -1);
									var16 += 15;
									Runtime var45 = Runtime.getRuntime();
									var23 = (int)((var45.totalMemory() - var45.freeMemory()) / 1024L);
									var24 = 16776960;
									if (var23 > 327680 && !Client.isLowDetail) {
										var24 = 16711680;
									}

									UserComparator5.fontPlain12.drawRightAligned("Mem:" + var23 + "k", var15 + var13.width * -1946208531, var16, var24, -1);
									var16 += 15;
								}
								continue;
							}

							if (var13.contentType == 1337) {
								Client.viewportX = var15;
								Client.viewportY = var16;
								class108.drawEntities(var15, var16, var13.width * -1946208531, var13.height * -905446999);
								Client.validRootWidgets[var13.rootIndex] = true;
								Rasterizer2D.Rasterizer2D_setClip(var5, var6, var7, var8);
								continue;
							}

							if (var13.contentType == 1338) {
								class222.drawMinimap(var13, var15, var16, var14);
								Rasterizer2D.Rasterizer2D_setClip(var5, var6, var7, var8);
								continue;
							}

							if (var13.contentType == 1339) {
								class172.method4219(var13, var15, var16, var14);
								Rasterizer2D.Rasterizer2D_setClip(var5, var6, var7, var8);
								continue;
							}

							if (var13.contentType == 1400) {
								Skills.worldMap.draw(var15, var16, var13.width * -1946208531, var13.height * -905446999, Client.cycle, class468.clientPreferences.getBrightness());
							}

							if (var13.contentType == 1401) {
								Skills.worldMap.drawOverview(var15, var16, var13.width * -1946208531, var13.height * -905446999);
							}

							if (var13.contentType == 1402) {
								class204.loginScreenRunesAnimation.draw(var15, Client.cycle);
							}
						}

						if (var13.type == 0) {
							if (!var13.isIf3 && class330.isComponentHidden(var13) && var13 != class330.mousedOverWidgetIf1) {
								continue;
							}

							if (!var13.isIf3) {
								if (var13.scrollY > var13.scrollHeight - var13.height * -905446999) {
									var13.scrollY = var13.scrollHeight - var13.height * -905446999;
								}

								if (var13.scrollY < 0) {
									var13.scrollY = 0;
								}
							}

							drawInterface(var0, var13.field4236, var13.field4241, var13.id, var13.childIndex * 2077538819, var18, var19, var20, var21, var15 - var13.scrollX, var16 - var13.scrollY, var14);
							if (var13.children != null) {
								drawInterface(var13.children, 0, var13.children.length - 1, var13.id, -1, var18, var19, var20, var21, var15 - var13.scrollX, var16 - var13.scrollY, var14);
							}

							if (var13.childIndex * 2077538819 == -1) {
								InterfaceParent var32 = (InterfaceParent)Client.interfaceParents.get((long)var13.id);
								if (var32 != null) {
									class150.drawWidgets(var32.group, var18, var19, var20, var21, var15, var16, var14);
								}
							}

							Rasterizer2D.Rasterizer2D_setClip(var5, var6, var7, var8);
							Rasterizer3D.resetRasterClipping();
						} else if (var13.type == 11) {
							if (class330.isComponentHidden(var13) && var13 != class330.mousedOverWidgetIf1) {
								continue;
							}

							if (var13.children != null) {
								drawInterface(var13.children, 0, var13.children.length - 1, var13.id, -1, var18, var19, var20, var21, var15 - var13.scrollX, var16 - var13.scrollY, var14);
							}

							Rasterizer2D.Rasterizer2D_setClip(var5, var6, var7, var8);
							Rasterizer3D.resetRasterClipping();
						}

						if (Client.isResizable || Client.field524[var14] || Client.gameDrawingMode > 1) {
							if (var13.type == 0 && !var13.isIf3 && var13.scrollHeight > var13.height * -905446999) {
								WorldMapScaleHandler.drawScrollBar(var13.width * -1946208531 + var15, var16, var13.scrollY, var13.height * -905446999, var13.scrollHeight);
							}

							if (var13.type != 1) {
								if (var13.type == 3) {
									if (class556.runCs1(var13)) {
										var22 = var13.color2;
										if (var13 == class330.mousedOverWidgetIf1 && var13.mouseOverColor2 != 0) {
											var22 = var13.mouseOverColor2;
										}
									} else {
										var22 = var13.color;
										if (var13 == class330.mousedOverWidgetIf1 && var13.mouseOverColor != 0) {
											var22 = var13.mouseOverColor;
										}
									}

									if (var13.fill) {
										switch(var13.fillMode.field6101) {
										case 1:
											Rasterizer2D.Rasterizer2D_fillRectangleGradient(var15, var16, var13.width * -1946208531, var13.height * -905446999, var13.color, var13.color2);
											break;
										case 2:
											Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var15, var16, var13.width * -1946208531, var13.height * -905446999, var13.color, var13.color2, 255 - (var13.transparencyTop & 255), 255 - (var13.transparencyBot & 255));
											break;
										default:
											if (var17 == 0) {
												Rasterizer2D.Rasterizer2D_fillRectangle(var15, var16, var13.width * -1946208531, var13.height * -905446999, var22);
											} else {
												Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var15, var16, var13.width * -1946208531, var13.height * -905446999, var22, 256 - (var17 & 255));
											}
										}
									} else if (var17 == 0) {
										Rasterizer2D.Rasterizer2D_drawRectangle(var15, var16, var13.width * -1946208531, var13.height * -905446999, var22);
									} else {
										Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var15, var16, var13.width * -1946208531, var13.height * -905446999, var22, 256 - (var17 & 255));
									}
								} else if (var13.type == 4) {
									Font var44 = var13.getFont(class226.widgetDefinition);
									if (var44 == null) {
										if (Widget.field4211) {
											class376.invalidateWidget(var13);
										}
									} else {
										String var43 = var13.text;
										if (class556.runCs1(var13)) {
											var23 = var13.color2;
											if (var13 == class330.mousedOverWidgetIf1 && var13.mouseOverColor2 != 0) {
												var23 = var13.mouseOverColor2;
											}

											if (!var13.text2.isEmpty()) {
												var43 = var13.text2;
											}
										} else {
											var23 = var13.color;
											if (var13 == class330.mousedOverWidgetIf1 && var13.mouseOverColor != 0) {
												var23 = var13.mouseOverColor;
											}
										}

										if (var13.isIf3 && var13.itemId != -1) {
											ItemComposition var46 = class150.ItemDefinition_get(var13.itemId);
											var43 = var46.name;
											if (var43 == null) {
												var43 = "null";
											}

											if ((var46.isStackable == 1 || var13.itemQuantity != 1) && var13.itemQuantity != -1) {
												var43 = class144.colorStartTag(16748608) + var43 + "</col>" + " " + 'x' + class4.formatItemStacks(var13.itemQuantity);
											}
										}

										if (var13 == Client.meslayerContinueWidget) {
											var43 = "Please wait...";
											var23 = var13.color;
										}

										if (!var13.isIf3) {
											var43 = class135.method3779(var43, var13);
										}

										var44.drawWidgetText(var43, var15, var16, var13.width * -1946208531, var13.height * -905446999, var23, var13.textShadowed ? 0 : -1, class545.method10891(var13.transparencyTop), var13.textXAlignment, var13.textYAlignment, var13.textLineHeight);
									}
								} else {
									int var27;
									int var28;
									if (var13.type == 5) {
										SpritePixels var42;
										if (!var13.isIf3) {
											var42 = var13.getSprite(class226.widgetDefinition, class556.runCs1(var13), class164.urlRequester);
											if (var42 != null) {
												var42.drawTransBgAt(var15, var16);
											} else if (Widget.field4211) {
												class376.invalidateWidget(var13);
											}
										} else {
											if (var13.itemId != -1) {
												var42 = Archive.getItemSprite(var13.itemId, var13.itemQuantity, var13.outline, var13.spriteShadow, var13.itemQuantityMode, false, Math.max(36, var13.width * -1946208531), Math.max(32, var13.height * -905446999));
											} else {
												var42 = var13.getSprite(class226.widgetDefinition, false, class164.urlRequester);
											}

											if (var42 == null) {
												if (Widget.field4211) {
													class376.invalidateWidget(var13);
												}
											} else {
												var23 = var42.width;
												var24 = var42.height;
												if (!var13.spriteTiling) {
													var25 = var13.width * -210841600 / var23;
													if (var13.spriteAngle != 0) {
														var42.method12151(var13.width * -1946208531 / 2 + var15, var13.height * -905446999 / 2 + var16, var13.spriteAngle, var25);
													} else if (var17 != 0) {
														var42.drawTransScaledAt(var15, var16, var13.width * -1946208531, var13.height * -905446999, 256 - (var17 & 255));
													} else if (var13.width * -1946208531 == var23 && var24 == var13.height * -905446999) {
														var42.drawTransBgAt(var15, var16);
													} else {
														var42.drawScaledAt(var15, var16, var13.width * -1946208531, var13.height * -905446999);
													}
												} else {
													Rasterizer2D.Rasterizer2D_expandClip(var15, var16, var15 + var13.width * -1946208531, var16 + var13.height * -905446999);
													var25 = (var13.width * -1946208531 + (var23 - 1)) / var23;
													int var26 = (var24 - 1 + var13.height * -905446999) / var24;

													for (var27 = 0; var27 < var25; ++var27) {
														for (var28 = 0; var28 < var26; ++var28) {
															if (var13.spriteAngle != 0) {
																var42.method12151(var23 / 2 + var15 + var27 * var23, var24 / 2 + var16 + var28 * var24, var13.spriteAngle, 4096);
															} else if (var17 != 0) {
																var42.drawTransAt(var15 + var23 * var27, var16 + var24 * var28, 256 - (var17 & 255));
															} else {
																var42.drawTransBgAt(var15 + var27 * var23, var16 + var28 * var24);
															}
														}
													}

													Rasterizer2D.Rasterizer2D_setClip(var5, var6, var7, var8);
												}
											}
										}
									} else {
										int var29;
										int var30;
										if (var13.type == 6) {
											SequenceDefinition var41 = null;
											var23 = -1;
											boolean var39 = class556.runCs1(var13);
											if (var39) {
												var25 = var13.sequenceId2;
											} else {
												var25 = var13.sequenceId;
											}

											if (var25 != -1) {
												var41 = ClientPacket.SequenceDefinition_get(var25);
												var23 = var13.modelFrame;
											}

											Model var48 = null;
											var27 = 0;
											if (var13.itemId != -1) {
												ItemComposition var37 = class150.ItemDefinition_get(var13.itemId);
												if (var37 != null) {
													var37 = var37.getCountObj(var13.itemQuantity);
													var48 = var37.getModel(1);
													if (var48 != null) {
														var48.calculateBoundsCylinder();
														var27 = var48.height / 2;
													} else {
														class376.invalidateWidget(var13);
													}
												}
											} else if (var13.modelType == 5) {
												if (var13.modelId == 0) {
													var48 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
												} else {
													var48 = class330.localPlayer.getModel();
												}
											} else if (var13.modelType == 7) {
												var48 = var13.field4275.getModel((SequenceDefinition)null, -1, ClientPacket.SequenceDefinition_get(class330.localPlayer.idleSequence), class330.localPlayer.poseAnimationSequence.getFrame());
											} else if (var13.modelType == 8) {
												if (var13.modelId != -1) {
													ObjectComposition var47 = AsyncHttpResponse.getObjectDefinition(var13.modelId);
													var48 = var47.getModelDynamic(10, 0, (int[][])null, 0, 0, 0, var41, var23);
												}
											} else {
												NPCComposition var49;
												if (var13.modelType == 9) {
													if (var13.modelId != -1) {
														var49 = AsyncHttpResponse.getNpcDefinition(var13.modelId);
														var48 = var49.getModel(var41, var23, (SequenceDefinition)null, -1, (NpcOverrides)null);
													}
												} else {
													var49 = null;
													NpcOverrides var38 = null;
													if (var13.modelType == 6) {
														var30 = var13.modelId;
														if (var30 >= 0) {
															NPC var31 = (NPC)Occluder.topLevelWorldView.npcs.get((long)var30);
															if (var31 != null && var31.definition != null) {
																var49 = var31.definition;
																if (var49.transforms != null) {
																	var49 = var49.transform();
																}

																var38 = var31.method2821();
															}
														}
													} else if (var13.modelType == 2) {
														var30 = var13.modelId;
														var49 = AsyncHttpResponse.getNpcDefinition(var30);
														if (var49.transforms != null) {
															var49 = var49.transform();
														}
													}

													var48 = var13.getModel(class226.widgetDefinition, var41, var23, var39, class330.localPlayer.appearance, var49, var38);
													if (var48 == null && Widget.field4211) {
														class376.invalidateWidget(var13);
													}
												}
											}

											Rasterizer3D.setCustomClipBounds(var13.width * -1946208531 / 2 + var15, var13.height * -905446999 / 2 + var16);
											var28 = Rasterizer3D.Rasterizer3D_sine[var13.modelAngleX] * var13.modelZoom >> 16;
											var29 = Rasterizer3D.Rasterizer3D_cosine[var13.modelAngleX] * var13.modelZoom >> 16;
											if (var48 != null) {
												Rasterizer3D.method5362(false);
												if (!var13.isIf3) {
													var48.drawFrustum(0, var13.modelAngleY, 0, var13.modelAngleX, 0, var28, var29);
												} else {
													var48.calculateBoundsCylinder();
													if (var13.modelOrthog) {
														var48.drawOrtho(0, var13.modelAngleY, var13.modelAngleZ, var13.modelAngleX, var13.modelOffsetX, var27 + var28 + var13.modelOffsetY, var29 + var13.modelOffsetY, var13.modelZoom);
													} else {
														var48.drawFrustum(0, var13.modelAngleY, var13.modelAngleZ, var13.modelAngleX, var13.modelOffsetX, var27 + var28 + var13.modelOffsetY, var29 + var13.modelOffsetY);
													}
												}
											}

											Rasterizer3D.setClipBounds();
										} else {
											Font var34;
											if (var13.type == 8) {
												if (var13 == WorldView.field1149 && Client.field535 == Client.field483) {
													var22 = 0;
													var23 = 0;
													var34 = UserComparator5.fontPlain12;
													String var35 = var13.text;

													String var36;
													for (var35 = class135.method3779(var35, var13); !var35.isEmpty(); var23 = var23 + var34.ascent + 1) {
														var27 = var35.indexOf("<br>");
														if (var27 != -1) {
															var36 = var35.substring(0, var27);
															var35 = var35.substring(var27 + 4);
														} else {
															var36 = var35;
															var35 = "";
														}

														var28 = var34.stringWidth(var36);
														if (var28 > var22) {
															var22 = var28;
														}
													}

													var22 += 6;
													var23 += 7;
													var27 = var13.width * -1946208531 + var15 - 5 - var22;
													var28 = var16 + var13.height * -905446999 + 5;
													if (var27 < var15 + 5) {
														var27 = var15 + 5;
													}

													if (var27 + var22 > var7) {
														var27 = var7 - var22;
													}

													if (var23 + var28 > var8) {
														var28 = var8 - var23;
													}

													Rasterizer2D.Rasterizer2D_fillRectangle(var27, var28, var22, var23, 16777120);
													Rasterizer2D.Rasterizer2D_drawRectangle(var27, var28, var22, var23, 0);
													var35 = var13.text;
													var29 = var28 + var34.ascent + 2;

													for (var35 = class135.method3779(var35, var13); !var35.isEmpty(); var29 = var29 + var34.ascent + 1) {
														var30 = var35.indexOf("<br>");
														if (var30 != -1) {
															var36 = var35.substring(0, var30);
															var35 = var35.substring(var30 + 4);
														} else {
															var36 = var35;
															var35 = "";
														}

														var34.draw(var36, var27 + 3, var29, 0, -1);
													}
												}
											} else if (var13.type == 9) {
												if (var13.field4251) {
													var22 = var15;
													var23 = var16 + var13.height * -905446999;
													var24 = var15 + var13.width * -1946208531;
													var25 = var16;
												} else {
													var22 = var15;
													var23 = var16;
													var24 = var15 + var13.width * -1946208531;
													var25 = var16 + var13.height * -905446999;
												}

												if (var13.lineWid == 1) {
													Rasterizer2D.Rasterizer2D_drawLine(var22, var23, var24, var25, var13.color);
												} else {
													GrandExchangeOffer.method8779(var22, var23, var24, var25, var13.color, var13.lineWid);
												}
											} else if (var13.type == 12) {
												class378 var40 = var13.method8194();
												class372 var33 = var13.method8195();
												if (var40 != null && var33 != null && var40.method8105()) {
													var34 = var13.getFont(class226.widgetDefinition);
													if (var34 != null) {
														Client.field317.method12276(var15, var16, var13.width * -1946208531, var13.height * -905446999, var40.method7894(), var40.method7895(), var40.method8082(), var40.method7848(), var40.method7890());
														var25 = var13.textShadowed ? var13.spriteShadow : -1;
														if (!var40.method7888() && var40.method7885().method9575()) {
															Client.field317.method12277(var33.field4122, var25, var33.field4127, var33.field4126);
															Client.field317.method12278(var40.method7886(), var34);
														} else {
															Client.field317.method12277(var13.color, var25, var33.field4127, var33.field4126);
															Client.field317.method12278(var40.method7885(), var34);
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
