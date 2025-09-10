import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ck")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("tr")
	@ObfuscatedGetter(
		intValue = -692034665
	)
	@Export("widgetDragDuration")
	static int widgetDragDuration;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1807644487
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 173220327
	)
	@Export("type")
	int type;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1300241925
	)
	@Export("x")
	int x;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1520132353
	)
	@Export("y")
	int y;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1896493323
	)
	@Export("objectId")
	int objectId;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1577127295
	)
	int field1025;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1243384765
	)
	int field1035;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1768533279
	)
	int field1027;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 954740903
	)
	int field1028;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -857369257
	)
	int field1029;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1354974779
	)
	int field1023;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 594717283
	)
	@Export("delay")
	int delay;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 316804587
	)
	@Export("hitpoints")
	int hitpoints;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -756842331
	)
	int field1033;
	@ObfuscatedName("ae")
	String[] field1020;

	PendingSpawn() {
		this.delay = 0;
		this.hitpoints = -1;
		this.field1033 = 31;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2059192484"
	)
	void method2398(int var1) {
		this.field1033 = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;I)V",
		garbageValue = "449920500"
	)
	void method2399(String[] var1) {
		this.field1020 = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1968487390"
	)
	boolean method2400(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1033 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "119"
	)
	boolean method2408(int var1) {
		return this.field1020 != null && var1 >= 0 && var1 < this.field1020.length && this.field1020[var1] != null;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1562991786"
	)
	String method2402(int var1) {
		return this.field1020 != null && var1 >= 0 && var1 < this.field1020.length ? this.field1020[var1] : null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lrl;",
		garbageValue = "-1192431635"
	)
	public static class453 method2414() {
		synchronized(class453.field5178) {
			if (DevicePcmPlayerProvider.field91 == 0) {
				return new class453();
			} else {
				class453.field5178[--DevicePcmPlayerProvider.field91].method9058();
				return class453.field5178[DevicePcmPlayerProvider.field91];
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lre;Lre;I)F",
		garbageValue = "-1676431985"
	)
	public static final float method2413(class452 var0, class452 var1) {
		return var0.method8999(var1);
	}

	@ObfuscatedName("mm")
	@ObfuscatedSignature(
		descriptor = "([Loi;IIIIIIIIIIII)V",
		garbageValue = "1219865577"
	)
	@Export("drawInterface")
	static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		Rasterizer2D.Rasterizer2D_setClip(var5, var6, var7, var8);
		Rasterizer3D.resetRasterClipping();

		for (int var12 = var1; var12 <= var2; ++var12) {
			Widget var13 = var0[var12];
			if (var13 != null && (var3 == var13.parentId && var4 == var13.field4165 || var3 == -1412584499 && var13 == Client.clickedWidget)) {
				int var14;
				if (var11 == -1) {
					Client.rootWidgetXs[Client.rootWidgetCount] = var9 + var13.x;
					Client.rootWidgetYs[Client.rootWidgetCount] = var10 + var13.y;
					Client.rootWidgetWidths[Client.rootWidgetCount] = var13.width * 469894397;
					Client.rootWidgetHeights[Client.rootWidgetCount] = var13.height * 1156037777;
					var14 = ++Client.rootWidgetCount - 1;
				} else {
					var14 = var11;
				}

				var13.rootIndex = var14;
				var13.cycle = Client.cycle;
				if (!var13.isIf3 || !class364.isComponentHidden(var13)) {
					if (var13.contentType > 0) {
						class537.method10544(var13);
					}

					int var15 = var9 + var13.x;
					int var16 = var10 + var13.y;
					int var17 = var13.transparencyTop;
					int var18;
					int var19;
					if (var13 == Client.clickedWidget) {
						if (var3 != -1412584499 && !var13.isScrollBar) {
							class152.field1777 = var0;
							class163.field1872 = var9;
							WorldMapRenderer.field3375 = var10;
							continue;
						}

						if (Client.isDraggingWidget && Client.field540) {
							var18 = MouseHandler.MouseHandler_x;
							var19 = MouseHandler.MouseHandler_y;
							var18 -= Client.widgetClickX;
							var19 -= Client.widgetClickY;
							if (var18 < Client.field541) {
								var18 = Client.field541;
							}

							if (var18 + var13.width * 469894397 > Client.clickedWidgetParent.width * 469894397 + Client.field541) {
								var18 = Client.clickedWidgetParent.width * 469894397 + Client.field541 - var13.width * 469894397;
							}

							if (var19 < Client.field542) {
								var19 = Client.field542;
							}

							if (var13.height * 1156037777 + var19 > Client.field542 + Client.clickedWidgetParent.height * 1156037777) {
								var19 = Client.clickedWidgetParent.height * 1156037777 + Client.field542 - var13.height * 1156037777;
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
						var24 = var15 + var13.width * 469894397;
						var25 = var13.height * 1156037777 + var16;
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
						var22 = var15 + var13.width * 469894397;
						var23 = var13.height * 1156037777 + var16;
						var18 = var15 > var5 ? var15 : var5;
						var19 = var16 > var6 ? var16 : var6;
						var20 = var22 < var7 ? var22 : var7;
						var21 = var23 < var8 ? var23 : var8;
					}

					if (!var13.isIf3 || var18 < var20 && var19 < var21) {
						if (var13.contentType != 0) {
							if (var13.contentType == 1336) {
								if (class36.clientPreferences.isDisplayingFps()) {
									var16 += 15;
									class463.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var15 + var13.width * 469894397, var16, 16776960, -1);
									var16 += 15;
									Runtime var45 = Runtime.getRuntime();
									var23 = (int)((var45.totalMemory() - var45.freeMemory()) / 1024L);
									var24 = 16776960;
									if (var23 > 327680 && !Client.isLowDetail) {
										var24 = 16711680;
									}

									class463.fontPlain12.drawRightAligned("Mem:" + var23 + "k", var15 + var13.width * 469894397, var16, var24, -1);
									var16 += 15;
								}
								continue;
							}

							if (var13.contentType == 1337) {
								Client.viewportX = var15;
								Client.viewportY = var16;
								Bounds.drawEntities(var15, var16, var13.width * 469894397, var13.height * 1156037777);
								Client.validRootWidgets[var13.rootIndex] = true;
								Rasterizer2D.Rasterizer2D_setClip(var5, var6, var7, var8);
								continue;
							}

							if (var13.contentType == 1338) {
								HttpRequestTask.drawMinimap(var13, var15, var16, var14);
								Rasterizer2D.Rasterizer2D_setClip(var5, var6, var7, var8);
								continue;
							}

							if (var13.contentType == 1339) {
								class452.method9051(var13, var15, var16, var14);
								Rasterizer2D.Rasterizer2D_setClip(var5, var6, var7, var8);
								continue;
							}

							if (var13.contentType == 1400) {
								DynamicObject.worldMap.draw(var15, var16, var13.width * 469894397, var13.height * 1156037777, Client.cycle, class36.clientPreferences.getBrightness());
							}

							if (var13.contentType == 1401) {
								DynamicObject.worldMap.drawOverview(var15, var16, var13.width * 469894397, var13.height * 1156037777);
							}

							if (var13.contentType == 1402) {
								class155.loginScreenRunesAnimation.draw(var15, Client.cycle);
							}
						}

						if (var13.type == 0) {
							if (!var13.isIf3 && class364.isComponentHidden(var13) && var13 != class343.mousedOverWidgetIf1) {
								continue;
							}

							if (!var13.isIf3) {
								if (var13.scrollY > var13.scrollHeight - var13.height * 1156037777) {
									var13.scrollY = var13.scrollHeight - var13.height * 1156037777;
								}

								if (var13.scrollY < 0) {
									var13.scrollY = 0;
								}
							}

							drawInterface(var0, var13.field4248, var13.field4214, var13.id, var13.childIndex * -217986249, var18, var19, var20, var21, var15 - var13.scrollX, var16 - var13.scrollY, var14);
							if (var13.children != null) {
								drawInterface(var13.children, 0, var13.children.length - 1, var13.id, -1, var18, var19, var20, var21, var15 - var13.scrollX, var16 - var13.scrollY, var14);
							}

							if (var13.childIndex * -217986249 == -1) {
								InterfaceParent var32 = (InterfaceParent)Client.interfaceParents.get((long)var13.id);
								if (var32 != null) {
									class164.drawWidgets(var32.group, var18, var19, var20, var21, var15, var16, var14);
								}
							}

							Rasterizer2D.Rasterizer2D_setClip(var5, var6, var7, var8);
							Rasterizer3D.resetRasterClipping();
						} else if (var13.type == 11) {
							if (class364.isComponentHidden(var13) && var13 != class343.mousedOverWidgetIf1) {
								continue;
							}

							if (var13.children != null) {
								drawInterface(var13.children, 0, var13.children.length - 1, var13.id, -1, var18, var19, var20, var21, var15 - var13.scrollX, var16 - var13.scrollY, var14);
							}

							Rasterizer2D.Rasterizer2D_setClip(var5, var6, var7, var8);
							Rasterizer3D.resetRasterClipping();
						}

						if (Client.isResizable || Client.field356[var14] || Client.gameDrawingMode > 1) {
							if (var13.type == 0 && !var13.isIf3 && var13.scrollHeight > var13.height * 1156037777) {
								Message.drawScrollBar(var15 + var13.width * 469894397, var16, var13.scrollY, var13.height * 1156037777, var13.scrollHeight);
							}

							if (var13.type != 1) {
								if (var13.type == 3) {
									if (FileSystem.runCs1(var13)) {
										var22 = var13.color2;
										if (var13 == class343.mousedOverWidgetIf1 && var13.mouseOverColor2 != 0) {
											var22 = var13.mouseOverColor2;
										}
									} else {
										var22 = var13.color;
										if (var13 == class343.mousedOverWidgetIf1 && var13.mouseOverColor != 0) {
											var22 = var13.mouseOverColor;
										}
									}

									if (var13.fill) {
										switch(var13.fillMode.field6003) {
										case 1:
											Rasterizer2D.Rasterizer2D_fillRectangleGradient(var15, var16, var13.width * 469894397, var13.height * 1156037777, var13.color, var13.color2);
											break;
										case 2:
											Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var15, var16, var13.width * 469894397, var13.height * 1156037777, var13.color, var13.color2, 255 - (var13.transparencyTop & 255), 255 - (var13.transparencyBot & 255));
											break;
										default:
											if (var17 == 0) {
												Rasterizer2D.Rasterizer2D_fillRectangle(var15, var16, var13.width * 469894397, var13.height * 1156037777, var22);
											} else {
												Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var15, var16, var13.width * 469894397, var13.height * 1156037777, var22, 256 - (var17 & 255));
											}
										}
									} else if (var17 == 0) {
										Rasterizer2D.Rasterizer2D_drawRectangle(var15, var16, var13.width * 469894397, var13.height * 1156037777, var22);
									} else {
										Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var15, var16, var13.width * 469894397, var13.height * 1156037777, var22, 256 - (var17 & 255));
									}
								} else if (var13.type == 4) {
									Font var44 = var13.getFont(UrlRequester.widgetDefinition);
									if (var44 == null) {
										if (Widget.field4142) {
											class89.invalidateWidget(var13);
										}
									} else {
										String var43 = var13.text;
										if (FileSystem.runCs1(var13)) {
											var23 = var13.color2;
											if (var13 == class343.mousedOverWidgetIf1 && var13.mouseOverColor2 != 0) {
												var23 = var13.mouseOverColor2;
											}

											if (!var13.text2.isEmpty()) {
												var43 = var13.text2;
											}
										} else {
											var23 = var13.color;
											if (var13 == class343.mousedOverWidgetIf1 && var13.mouseOverColor != 0) {
												var23 = var13.mouseOverColor;
											}
										}

										if (var13.isIf3 && var13.itemId != -1) {
											ItemComposition var46 = AttackOption.ItemDefinition_get(var13.itemId);
											var43 = var46.name;
											if (var43 == null) {
												var43 = "null";
											}

											if ((var46.isStackable == 1 || var13.itemQuantity != 1) && var13.itemQuantity != -1) {
												var43 = class134.colorStartTag(16748608) + var43 + "</col>" + " " + 'x' + class446.formatItemStacks(var13.itemQuantity);
											}
										}

										if (var13 == Client.meslayerContinueWidget) {
											var43 = "Please wait...";
											var23 = var13.color;
										}

										if (!var13.isIf3) {
											var43 = UserComparator10.method3581(var43, var13);
										}

										var44.drawWidgetText(var43, var15, var16, var13.width * 469894397, var13.height * 1156037777, var23, var13.textShadowed ? 0 : -1, class537.method10535(var13.transparencyTop), var13.textXAlignment, var13.textYAlignment, var13.textLineHeight);
									}
								} else {
									int var27;
									int var28;
									if (var13.type == 5) {
										SpritePixels var42;
										if (!var13.isIf3) {
											var42 = var13.getSprite(UrlRequester.widgetDefinition, FileSystem.runCs1(var13), class114.urlRequester);
											if (var42 != null) {
												var42.drawTransBgAt(var15, var16);
											} else if (Widget.field4142) {
												class89.invalidateWidget(var13);
											}
										} else {
											if (var13.itemId != -1) {
												var42 = HealthBarDefinition.getItemSprite(var13.itemId, var13.itemQuantity, var13.outline, var13.spriteShadow, var13.itemQuantityMode, false, Math.max(36, var13.width * 469894397), Math.max(32, var13.height * 1156037777));
											} else {
												var42 = var13.getSprite(UrlRequester.widgetDefinition, false, class114.urlRequester);
											}

											if (var42 == null) {
												if (Widget.field4142) {
													class89.invalidateWidget(var13);
												}
											} else {
												var23 = var42.width;
												var24 = var42.height;
												if (!var13.spriteTiling) {
													var25 = var13.width * 542101504 / var23;
													if (var13.spriteAngle != 0) {
														var42.method11715(var15 + var13.width * 469894397 / 2, var16 + var13.height * 1156037777 / 2, var13.spriteAngle, var25);
													} else if (var17 != 0) {
														var42.drawTransScaledAt(var15, var16, var13.width * 469894397, var13.height * 1156037777, 256 - (var17 & 255));
													} else if (var23 == var13.width * 469894397 && var13.height * 1156037777 == var24) {
														var42.drawTransBgAt(var15, var16);
													} else {
														var42.drawScaledAt(var15, var16, var13.width * 469894397, var13.height * 1156037777);
													}
												} else {
													Rasterizer2D.Rasterizer2D_expandClip(var15, var16, var15 + var13.width * 469894397, var13.height * 1156037777 + var16);
													var25 = (var13.width * 469894397 + (var23 - 1)) / var23;
													int var26 = (var13.height * 1156037777 + (var24 - 1)) / var24;

													for (var27 = 0; var27 < var25; ++var27) {
														for (var28 = 0; var28 < var26; ++var28) {
															if (var13.spriteAngle != 0) {
																var42.method11715(var23 / 2 + var15 + var23 * var27, var24 / 2 + var16 + var28 * var24, var13.spriteAngle, 4096);
															} else if (var17 != 0) {
																var42.drawTransAt(var15 + var23 * var27, var16 + var28 * var24, 256 - (var17 & 255));
															} else {
																var42.drawTransBgAt(var15 + var23 * var27, var16 + var28 * var24);
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
											boolean var39 = FileSystem.runCs1(var13);
											if (var39) {
												var25 = var13.sequenceId2;
											} else {
												var25 = var13.sequenceId;
											}

											if (var25 != -1) {
												var41 = InvDefinition.SequenceDefinition_get(var25);
												var23 = var13.modelFrame;
											}

											Model var48 = null;
											var27 = 0;
											if (var13.itemId != -1) {
												ItemComposition var37 = AttackOption.ItemDefinition_get(var13.itemId);
												if (var37 != null) {
													var37 = var37.getCountObj(var13.itemQuantity);
													var48 = var37.getModel(1);
													if (var48 != null) {
														var48.calculateBoundsCylinder();
														var27 = var48.height / 2;
													} else {
														class89.invalidateWidget(var13);
													}
												}
											} else if (var13.modelType == 5) {
												if (var13.modelId == 0) {
													var48 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
												} else {
													var48 = HealthBarUpdate.localPlayer.getModel();
												}
											} else if (var13.modelType == 7) {
												var48 = var13.field4206.getModel((SequenceDefinition)null, -1, InvDefinition.SequenceDefinition_get(HealthBarUpdate.localPlayer.idleSequence), HealthBarUpdate.localPlayer.poseAnimationSequence.getFrame());
											} else if (var13.modelType == 8) {
												if (var13.modelId != -1) {
													ObjectComposition var47 = ModeWhere.getObjectDefinition(var13.modelId);
													var48 = var47.getModelDynamic(10, 0, (int[][])null, 0, 0, 0, var41, var23);
												}
											} else {
												NPCComposition var49;
												if (var13.modelType == 9) {
													if (var13.modelId != -1) {
														var49 = class63.getNpcDefinition(var13.modelId);
														var48 = var49.getModel(var41, var23, (SequenceDefinition)null, -1, (NpcOverrides)null);
													}
												} else {
													var49 = null;
													NpcOverrides var38 = null;
													if (var13.modelType == 6) {
														var30 = var13.modelId;
														if (var30 >= 0) {
															NPC var31 = (NPC)class333.topLevelWorldView.npcs.get((long)var30);
															if (var31 != null && var31.definition != null) {
																var49 = var31.definition;
																if (var49.transforms != null) {
																	var49 = var49.transform();
																}

																var38 = var31.method2729();
															}
														}
													} else if (var13.modelType == 2) {
														var30 = var13.modelId;
														var49 = class63.getNpcDefinition(var30);
														if (var49.transforms != null) {
															var49 = var49.transform();
														}
													}

													var48 = var13.getModel(UrlRequester.widgetDefinition, var41, var23, var39, HealthBarUpdate.localPlayer.appearance, var49, var38);
													if (var48 == null && Widget.field4142) {
														class89.invalidateWidget(var13);
													}
												}
											}

											Rasterizer3D.setCustomClipBounds(var15 + var13.width * 469894397 / 2, var13.height * 1156037777 / 2 + var16);
											var28 = Rasterizer3D.Rasterizer3D_sine[var13.modelAngleX] * var13.modelZoom >> 16;
											var29 = Rasterizer3D.Rasterizer3D_cosine[var13.modelAngleX] * var13.modelZoom >> 16;
											if (var48 != null) {
												Rasterizer3D.method4927(false);
												if (!var13.isIf3) {
													var48.drawFrustum(0, var13.modelAngleY, 0, var13.modelAngleX, 0, var28, var29);
												} else {
													var48.calculateBoundsCylinder();
													if (var13.modelOrthog) {
														var48.drawOrtho(0, var13.modelAngleY, var13.modelAngleZ, var13.modelAngleX, var13.modelOffsetX, var28 + var27 + var13.modelOffsetY, var29 + var13.modelOffsetY, var13.modelZoom);
													} else {
														var48.drawFrustum(0, var13.modelAngleY, var13.modelAngleZ, var13.modelAngleX, var13.modelOffsetX, var28 + var27 + var13.modelOffsetY, var29 + var13.modelOffsetY);
													}
												}
											}

											Rasterizer3D.setClipBounds();
										} else {
											Font var34;
											if (var13.type == 8) {
												if (var13 == class134.field1624 && Client.field426 == Client.field481) {
													var22 = 0;
													var23 = 0;
													var34 = class463.fontPlain12;
													String var35 = var13.text;

													String var36;
													for (var35 = UserComparator10.method3581(var35, var13); !var35.isEmpty(); var23 = var23 + var34.ascent + 1) {
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
													var27 = var15 + var13.width * 469894397 - 5 - var22;
													var28 = var13.height * 1156037777 + var16 + 5;
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
													var35 = var13.text;
													var29 = var28 + var34.ascent + 2;

													for (var35 = UserComparator10.method3581(var35, var13); !var35.isEmpty(); var29 = var29 + var34.ascent + 1) {
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
												if (var13.field4182) {
													var22 = var15;
													var23 = var13.height * 1156037777 + var16;
													var24 = var15 + var13.width * 469894397;
													var25 = var16;
												} else {
													var22 = var15;
													var23 = var16;
													var24 = var15 + var13.width * 469894397;
													var25 = var13.height * 1156037777 + var16;
												}

												if (var13.lineWid == 1) {
													Rasterizer2D.Rasterizer2D_drawLine(var22, var23, var24, var25, var13.color);
												} else {
													class199.method4399(var22, var23, var24, var25, var13.color, var13.lineWid);
												}
											} else if (var13.type == 12) {
												class366 var40 = var13.method7971();
												class360 var33 = var13.method8088();
												if (var40 != null && var33 != null && var40.method7658()) {
													var34 = var13.getFont(UrlRequester.widgetDefinition);
													if (var34 != null) {
														Client.field501.method11846(var15, var16, var13.width * 469894397, var13.height * 1156037777, var40.method7792(), var40.method7660(), var40.method7656(), var40.method7857(), var40.method7655());
														var25 = var13.textShadowed ? var13.spriteShadow : -1;
														if (!var40.method7839() && var40.method7650().method9338()) {
															Client.field501.method11850(var33.field4055, var25, var33.field4052, var33.field4053);
															Client.field501.method11848(var40.method7651(), var34);
														} else {
															Client.field501.method11850(var13.color, var25, var33.field4052, var33.field4053);
															Client.field501.method11848(var40.method7650(), var34);
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
