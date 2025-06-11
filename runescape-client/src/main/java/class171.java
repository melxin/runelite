import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gv")
public class class171 extends class149 {
	@ObfuscatedName("aa")
	@Export("SpriteBuffer_spriteHeights")
	static int[] SpriteBuffer_spriteHeights;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		longValue = -4713865280900147193L
	)
	long field1863;
	@ObfuscatedName("aj")
	String field1861;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	final class152 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfp;)V"
	)
	class171(class152 var1) {
		this.this$0 = var1;
		this.field1863 = -1L;
		this.field1861 = null;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lwt;I)V",
		garbageValue = "-1635342078"
	)
	void vmethod3913(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1863 = var1.readLong();
		}

		this.field1861 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lgu;I)V",
		garbageValue = "-1572789515"
	)
	void vmethod3914(ClanSettings var1) {
		var1.method3766(this.field1863, this.field1861);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lps;Ljava/lang/String;Ljava/lang/String;I)[Lwd;",
		garbageValue = "1789615666"
	)
	public static SpritePixels[] method3893(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) {
			return null;
		} else {
			int var3 = var0.getGroupId(var1);
			int var4 = var0.getFileId(var3, var2);
			return class480.method9483(var0, var3, var4);
		}
	}

	@ObfuscatedName("mr")
	@ObfuscatedSignature(
		descriptor = "([Lov;IIIIIIIIIIII)V",
		garbageValue = "1932391359"
	)
	@Export("drawInterface")
	static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		Rasterizer2D.Rasterizer2D_setClip(var5, var6, var7, var8);
		Rasterizer3D.resetRasterClipping();

		for (int var12 = var1; var12 <= var2; ++var12) {
			Widget var13 = var0[var12];
			if (var13 != null && (var3 == var13.parentId && var4 == var13.field4127 || var3 == -1412584499 && var13 == Client.clickedWidget)) {
				int var14;
				if (var11 == -1) {
					Client.rootWidgetXs[Client.rootWidgetCount] = var9 + var13.x;
					Client.rootWidgetYs[Client.rootWidgetCount] = var10 + var13.y;
					Client.rootWidgetWidths[Client.rootWidgetCount] = var13.width * -1805166981;
					Client.rootWidgetHeights[Client.rootWidgetCount] = var13.height * -2133353239;
					var14 = ++Client.rootWidgetCount - 1;
				} else {
					var14 = var11;
				}

				var13.rootIndex = var14;
				var13.cycle = Client.cycle;
				if (!var13.isIf3 || !isComponentHidden(var13)) {
					if (var13.contentType > 0) {
						MusicPatch.method7111(var13);
					}

					int var15 = var9 + var13.x;
					int var16 = var10 + var13.y;
					int var17 = var13.transparencyTop;
					int var18;
					int var19;
					if (var13 == Client.clickedWidget) {
						if (var3 != -1412584499 && !var13.isScrollBar) {
							Renderable.field2813 = var0;
							class469.field5099 = var9;
							class330.field3668 = var10;
							continue;
						}

						if (Client.isDraggingWidget && Client.field532) {
							var18 = MouseHandler.MouseHandler_x;
							var19 = MouseHandler.MouseHandler_y;
							var18 -= Client.widgetClickX;
							var19 -= Client.widgetClickY;
							if (var18 < Client.field371) {
								var18 = Client.field371;
							}

							if (var18 + var13.width * -1805166981 > Client.clickedWidgetParent.width * -1805166981 + Client.field371) {
								var18 = Client.clickedWidgetParent.width * -1805166981 + Client.field371 - var13.width * -1805166981;
							}

							if (var19 < Client.field568) {
								var19 = Client.field568;
							}

							if (var19 + var13.height * -2133353239 > Client.clickedWidgetParent.height * -2133353239 + Client.field568) {
								var19 = Client.clickedWidgetParent.height * -2133353239 + Client.field568 - var13.height * -2133353239;
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
						var24 = var15 + var13.width * -1805166981;
						var25 = var16 + var13.height * -2133353239;
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
						var22 = var15 + var13.width * -1805166981;
						var23 = var16 + var13.height * -2133353239;
						var18 = var15 > var5 ? var15 : var5;
						var19 = var16 > var6 ? var16 : var6;
						var20 = var22 < var7 ? var22 : var7;
						var21 = var23 < var8 ? var23 : var8;
					}

					if (!var13.isIf3 || var18 < var20 && var19 < var21) {
						if (var13.contentType != 0) {
							if (var13.contentType == 1336) {
								if (ClientPacket.clientPreferences.isDisplayingFps()) {
									var16 += 15;
									Tile.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var15 + var13.width * -1805166981, var16, 16776960, -1);
									var16 += 15;
									Runtime var43 = Runtime.getRuntime();
									var23 = (int)((var43.totalMemory() - var43.freeMemory()) / 1024L);
									var24 = 16776960;
									if (var23 > 327680 && !Client.isLowDetail) {
										var24 = 16711680;
									}

									Tile.fontPlain12.drawRightAligned("Mem:" + var23 + "k", var15 + var13.width * -1805166981, var16, var24, -1);
									var16 += 15;
								}
								continue;
							}

							if (var13.contentType == 1337) {
								Client.viewportX = var15;
								Client.viewportY = var16;
								class47.drawEntities(var15, var16, var13.width * -1805166981, var13.height * -2133353239);
								Client.validRootWidgets[var13.rootIndex] = true;
								Rasterizer2D.Rasterizer2D_setClip(var5, var6, var7, var8);
								continue;
							}

							if (var13.contentType == 1338) {
								MidiRequest.drawMinimap(var13, var15, var16, var14);
								Rasterizer2D.Rasterizer2D_setClip(var5, var6, var7, var8);
								continue;
							}

							if (var13.contentType == 1339) {
								WorldMapSectionType.method6575(var13, var15, var16, var14);
								Rasterizer2D.Rasterizer2D_setClip(var5, var6, var7, var8);
								continue;
							}

							if (var13.contentType == 1400) {
								class338.worldMap.draw(var15, var16, var13.width * -1805166981, var13.height * -2133353239, Client.cycle, ClientPacket.clientPreferences.getBrightness());
							}

							if (var13.contentType == 1401) {
								class338.worldMap.drawOverview(var15, var16, var13.width * -1805166981, var13.height * -2133353239);
							}

							if (var13.contentType == 1402) {
								class584.loginScreenRunesAnimation.draw(var15, Client.cycle);
							}
						}

						if (var13.type == 0) {
							if (!var13.isIf3 && isComponentHidden(var13) && var13 != FloorUnderlayDefinition.mousedOverWidgetIf1) {
								continue;
							}

							if (!var13.isIf3) {
								if (var13.scrollY > var13.scrollHeight - var13.height * -2133353239) {
									var13.scrollY = var13.scrollHeight - var13.height * -2133353239;
								}

								if (var13.scrollY < 0) {
									var13.scrollY = 0;
								}
							}

							drawInterface(var0, var13.field4002, var13.field4003, var13.id, var13.childIndex * -744024149, var18, var19, var20, var21, var15 - var13.scrollX, var16 - var13.scrollY, var14);
							if (var13.children != null) {
								drawInterface(var13.children, 0, var13.children.length - 1, var13.id, -1, var18, var19, var20, var21, var15 - var13.scrollX, var16 - var13.scrollY, var14);
							}

							if (var13.childIndex * -744024149 == -1) {
								InterfaceParent var31 = (InterfaceParent)Client.interfaceParents.get((long)var13.id);
								if (var31 != null) {
									class166.drawWidgets(var31.group, var18, var19, var20, var21, var15, var16, var14);
								}
							}

							Rasterizer2D.Rasterizer2D_setClip(var5, var6, var7, var8);
							Rasterizer3D.resetRasterClipping();
						} else if (var13.type == 11) {
							if (isComponentHidden(var13) && var13 != FloorUnderlayDefinition.mousedOverWidgetIf1) {
								continue;
							}

							if (var13.children != null) {
								drawInterface(var13.children, 0, var13.children.length - 1, var13.id, -1, var18, var19, var20, var21, var15 - var13.scrollX, var16 - var13.scrollY, var14);
							}

							Rasterizer2D.Rasterizer2D_setClip(var5, var6, var7, var8);
							Rasterizer3D.resetRasterClipping();
						}

						if (Client.isResizable || Client.field559[var14] || Client.gameDrawingMode > 1) {
							if (var13.type == 0 && !var13.isIf3 && var13.scrollHeight > var13.height * -2133353239) {
								class179.drawScrollBar(var15 + var13.width * -1805166981, var16, var13.scrollY, var13.height * -2133353239, var13.scrollHeight);
							}

							if (var13.type != 1) {
								if (var13.type == 3) {
									if (SoundSystem.runCs1(var13)) {
										var22 = var13.color2;
										if (var13 == FloorUnderlayDefinition.mousedOverWidgetIf1 && var13.mouseOverColor2 != 0) {
											var22 = var13.mouseOverColor2;
										}
									} else {
										var22 = var13.color;
										if (var13 == FloorUnderlayDefinition.mousedOverWidgetIf1 && var13.mouseOverColor != 0) {
											var22 = var13.mouseOverColor;
										}
									}

									if (var13.fill) {
										switch(var13.fillMode.field5782) {
										case 1:
											Rasterizer2D.Rasterizer2D_fillRectangleGradient(var15, var16, var13.width * -1805166981, var13.height * -2133353239, var13.color, var13.color2);
											break;
										case 2:
											Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var15, var16, var13.width * -1805166981, var13.height * -2133353239, var13.color, var13.color2, 255 - (var13.transparencyTop & 255), 255 - (var13.transparencyBot & 255));
											break;
										default:
											if (var17 == 0) {
												Rasterizer2D.Rasterizer2D_fillRectangle(var15, var16, var13.width * -1805166981, var13.height * -2133353239, var22);
											} else {
												Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var15, var16, var13.width * -1805166981, var13.height * -2133353239, var22, 256 - (var17 & 255));
											}
										}
									} else if (var17 == 0) {
										Rasterizer2D.Rasterizer2D_drawRectangle(var15, var16, var13.width * -1805166981, var13.height * -2133353239, var22);
									} else {
										Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var15, var16, var13.width * -1805166981, var13.height * -2133353239, var22, 256 - (var17 & 255));
									}
								} else if (var13.type == 4) {
									Font var42 = var13.getFont(ClientPreferences.widgetDefinition);
									if (var42 == null) {
										if (Widget.field3977) {
											ScriptFrame.invalidateWidget(var13);
										}
									} else {
										String var45 = var13.text;
										if (SoundSystem.runCs1(var13)) {
											var23 = var13.color2;
											if (var13 == FloorUnderlayDefinition.mousedOverWidgetIf1 && var13.mouseOverColor2 != 0) {
												var23 = var13.mouseOverColor2;
											}

											if (!var13.text2.isEmpty()) {
												var45 = var13.text2;
											}
										} else {
											var23 = var13.color;
											if (var13 == FloorUnderlayDefinition.mousedOverWidgetIf1 && var13.mouseOverColor != 0) {
												var23 = var13.mouseOverColor;
											}
										}

										if (var13.isIf3 && var13.itemId != -1) {
											ItemComposition var46 = SceneTilePaint.ItemDefinition_get(var13.itemId);
											var45 = var46.name;
											if (var45 == null) {
												var45 = "null";
											}

											if ((var46.isStackable == 1 || var13.itemQuantity != 1) && var13.itemQuantity != -1) {
												var45 = AbstractWorldMapIcon.colorStartTag(16748608) + var45 + "</col>" + " " + 'x' + AsyncRestClient.formatItemStacks(var13.itemQuantity);
											}
										}

										if (var13 == Client.meslayerContinueWidget) {
											var45 = "Please wait...";
											var23 = var13.color;
										}

										if (!var13.isIf3) {
											var45 = NPCComposition.method4219(var45, var13);
										}

										var42.drawWidgetText(var45, var15, var16, var13.width * -1805166981, var13.height * -2133353239, var23, var13.textShadowed ? 0 : -1, class527.method10160(var13.transparencyTop), var13.textXAlignment, var13.textYAlignment, var13.textLineHeight);
									}
								} else {
									int var26;
									int var27;
									int var28;
									if (var13.type == 5) {
										SpritePixels var41;
										if (!var13.isIf3) {
											var41 = var13.getSprite(ClientPreferences.widgetDefinition, SoundSystem.runCs1(var13), class167.urlRequester);
											if (var41 != null) {
												var41.drawTransBgAt(var15, var16);
											} else if (Widget.field3977) {
												ScriptFrame.invalidateWidget(var13);
											}
										} else {
											if (var13.itemId != -1) {
												var41 = class68.getItemSprite(var13.itemId, var13.itemQuantity, var13.outline, var13.spriteShadow, var13.itemQuantityMode, false);
											} else {
												var41 = var13.getSprite(ClientPreferences.widgetDefinition, false, class167.urlRequester);
											}

											if (var41 == null) {
												if (Widget.field3977) {
													ScriptFrame.invalidateWidget(var13);
												}
											} else {
												var23 = var41.width;
												var24 = var41.height;
												if (!var13.spriteTiling) {
													var25 = var13.width * 1969729536 / var23;
													if (var13.spriteAngle != 0) {
														var41.method11383(var15 + var13.width * -1805166981 / 2, var16 + var13.height * -2133353239 / 2, var13.spriteAngle, var25);
													} else if (var17 != 0) {
														var41.drawTransScaledAt(var15, var16, var13.width * -1805166981, var13.height * -2133353239, 256 - (var17 & 255));
													} else if (var23 == var13.width * -1805166981 && var24 == var13.height * -2133353239) {
														var41.drawTransBgAt(var15, var16);
													} else {
														var41.drawScaledAt(var15, var16, var13.width * -1805166981, var13.height * -2133353239);
													}
												} else {
													Rasterizer2D.Rasterizer2D_expandClip(var15, var16, var15 + var13.width * -1805166981, var16 + var13.height * -2133353239);
													var25 = (var23 - 1 + var13.width * -1805166981) / var23;
													var26 = (var13.height * -2133353239 + (var24 - 1)) / var24;

													for (var27 = 0; var27 < var25; ++var27) {
														for (var28 = 0; var28 < var26; ++var28) {
															if (var13.spriteAngle != 0) {
																var41.method11383(var23 / 2 + var15 + var23 * var27, var24 / 2 + var16 + var28 * var24, var13.spriteAngle, 4096);
															} else if (var17 != 0) {
																var41.drawTransAt(var15 + var23 * var27, var16 + var28 * var24, 256 - (var17 & 255));
															} else {
																var41.drawTransBgAt(var15 + var27 * var23, var16 + var28 * var24);
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
											boolean var39 = SoundSystem.runCs1(var13);
											if (var39) {
												var23 = var13.sequenceId2;
											} else {
												var23 = var13.sequenceId;
											}

											Model var44 = null;
											var25 = 0;
											if (var13.itemId != -1) {
												ItemComposition var47 = SceneTilePaint.ItemDefinition_get(var13.itemId);
												if (var47 != null) {
													var47 = var47.getCountObj(var13.itemQuantity);
													var44 = var47.getModel(1);
													if (var44 != null) {
														var44.calculateBoundsCylinder();
														var25 = var44.height / 2;
													} else {
														ScriptFrame.invalidateWidget(var13);
													}
												}
											} else if (var13.modelType == 5) {
												if (var13.modelId == 0) {
													var44 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
												} else {
													var44 = class152.localPlayer.getModel();
												}
											} else if (var13.modelType == 7) {
												var44 = var13.field4111.getModel((SequenceDefinition)null, -1, VarpDefinition.SequenceDefinition_get(class152.localPlayer.idleSequence), class152.localPlayer.movementFrame);
											} else {
												NPCComposition var48 = null;
												NpcOverrides var36 = null;
												if (var13.modelType == 6) {
													var28 = var13.modelId;
													if (var28 >= 0) {
														NPC var37 = (NPC)Sound.topLevelWorldView.npcs.get((long)var28);
														if (var37 != null && var37.definition != null) {
															var48 = var37.definition;
															if (var48.transforms != null) {
																var48 = var48.transform();
															}

															var36 = var37.method2585();
														}
													}
												} else if (var13.modelType == 2) {
													var28 = var13.modelId;
													var48 = UserComparator3.getNpcDefinition(var28);
													if (var48.transforms != null) {
														var48 = var48.transform();
													}
												}

												SequenceDefinition var38 = null;
												var29 = -1;
												if (var23 != -1) {
													var38 = VarpDefinition.SequenceDefinition_get(var23);
													var29 = var13.modelFrame;
												}

												var44 = var13.getModel(ClientPreferences.widgetDefinition, var38, var29, var39, class152.localPlayer.appearance, var48, var36);
												if (var44 == null && Widget.field3977) {
													ScriptFrame.invalidateWidget(var13);
												}
											}

											Rasterizer3D.setCustomClipBounds(var15 + var13.width * -1805166981 / 2, var13.height * -2133353239 / 2 + var16);
											var26 = Rasterizer3D.Rasterizer3D_sine[var13.modelAngleX] * var13.modelZoom >> 16;
											var27 = Rasterizer3D.Rasterizer3D_cosine[var13.modelAngleX] * var13.modelZoom >> 16;
											if (var44 != null) {
												Rasterizer3D.method4992(false);
												if (!var13.isIf3) {
													var44.drawFrustum(0, var13.modelAngleY, 0, var13.modelAngleX, 0, var26, var27);
												} else {
													var44.calculateBoundsCylinder();
													if (var13.modelOrthog) {
														var44.drawOrtho(0, var13.modelAngleY, var13.modelAngleZ, var13.modelAngleX, var13.modelOffsetX, var25 + var26 + var13.modelOffsetY, var27 + var13.modelOffsetY, var13.modelZoom);
													} else {
														var44.drawFrustum(0, var13.modelAngleY, var13.modelAngleZ, var13.modelAngleX, var13.modelOffsetX, var26 + var25 + var13.modelOffsetY, var27 + var13.modelOffsetY);
													}
												}
											}

											Rasterizer3D.setClipBounds();
										} else {
											Font var33;
											if (var13.type == 8) {
												if (var13 == Strings.field4598 && Client.field518 == Client.field519) {
													var22 = 0;
													var23 = 0;
													var33 = Tile.fontPlain12;
													String var34 = var13.text;

													String var35;
													for (var34 = NPCComposition.method4219(var34, var13); !var34.isEmpty(); var23 = var23 + var33.ascent + 1) {
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
													var27 = var15 + var13.width * -1805166981 - 5 - var22;
													var28 = var16 + var13.height * -2133353239 + 5;
													if (var27 < var15 + 5) {
														var27 = var15 + 5;
													}

													if (var22 + var27 > var7) {
														var27 = var7 - var22;
													}

													if (var23 + var28 > var8) {
														var28 = var8 - var23;
													}

													Rasterizer2D.Rasterizer2D_fillRectangle(var27, var28, var22, var23, 16777120);
													Rasterizer2D.Rasterizer2D_drawRectangle(var27, var28, var22, var23, 0);
													var34 = var13.text;
													var29 = var28 + var33.ascent + 2;

													for (var34 = NPCComposition.method4219(var34, var13); !var34.isEmpty(); var29 = var29 + var33.ascent + 1) {
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
												if (var13.field3983) {
													var22 = var15;
													var23 = var16 + var13.height * -2133353239;
													var24 = var15 + var13.width * -1805166981;
													var25 = var16;
												} else {
													var22 = var15;
													var23 = var16;
													var24 = var15 + var13.width * -1805166981;
													var25 = var16 + var13.height * -2133353239;
												}

												if (var13.lineWid == 1) {
													Rasterizer2D.Rasterizer2D_drawLine(var22, var23, var24, var25, var13.color);
												} else {
													class137.method3570(var22, var23, var24, var25, var13.color, var13.lineWid);
												}
											} else if (var13.type == 12) {
												class367 var40 = var13.method7755();
												class361 var32 = var13.method7774();
												if (var40 != null && var32 != null && var40.method7454()) {
													var33 = var13.getFont(ClientPreferences.widgetDefinition);
													if (var33 != null) {
														Client.field554.method11483(var15, var16, var13.width * -1805166981, var13.height * -2133353239, var40.method7559(), var40.method7456(), var40.method7452(), var40.method7615(), var40.method7451());
														var25 = var13.textShadowed ? var13.spriteShadow : -1;
														if (!var40.method7449() && var40.method7446().method9064()) {
															Client.field554.method11484(var32.field3886, var25, var32.field3885, var32.field3883);
															Client.field554.method11485(var40.method7447(), var33);
														} else {
															Client.field554.method11484(var13.color, var25, var32.field3885, var32.field3883);
															Client.field554.method11485(var40.method7446(), var33);
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

	@ObfuscatedName("oc")
	@ObfuscatedSignature(
		descriptor = "(Lov;B)Z",
		garbageValue = "0"
	)
	@Export("isComponentHidden")
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden;
	}
}
