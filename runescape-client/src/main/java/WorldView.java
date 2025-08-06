import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dj")
@Implements("WorldView")
public class WorldView extends Node {
	@ObfuscatedName("of")
	@Export("accessToken")
	static String accessToken;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	@Export("objectSounds")
	final NodeDeque objectSounds;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1326880253
	)
	@Export("id")
	int id;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	@Export("scene")
	public Scene scene;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[Lkp;"
	)
	@Export("collisionMaps")
	CollisionMap[] collisionMaps;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -978921491
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1058891635
	)
	@Export("sizeX")
	public int sizeX;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 471429473
	)
	@Export("sizeY")
	public int sizeY;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -793021063
	)
	@Export("baseX")
	int baseX;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1567916071
	)
	@Export("baseY")
	int baseY;
	@ObfuscatedName("aj")
	@Export("tileLastDrawnActor")
	int[][] tileLastDrawnActor;
	@ObfuscatedName("ag")
	@Export("tileHeights")
	int[][][] tileHeights;
	@ObfuscatedName("ay")
	@Export("tileSettings")
	byte[][][] tileSettings;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	@Export("players")
	IndexedObjectSet players;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	@Export("npcs")
	IndexedObjectSet npcs;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lqr;"
	)
	@Export("worldEntities")
	IterableNodeHashTable worldEntities;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[[[Lqp;"
	)
	@Export("groundItems")
	NodeDeque[][][] groundItems;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	@Export("pendingSpawns")
	NodeDeque pendingSpawns;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	@Export("graphicsObjects")
	NodeDeque graphicsObjects;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	class482 field1150;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	class482 field1143;

	@ObfuscatedSignature(
		descriptor = "(IIIILim;)V"
	)
	WorldView(int var1, int var2, int var3, int var4, class215 var5) {
		this.objectSounds = new NodeDeque();
		this.collisionMaps = new CollisionMap[4];
		this.pendingSpawns = new NodeDeque();
		this.graphicsObjects = new NodeDeque();
		this.field1150 = new class482(149);
		this.field1143 = new class482(25);
		this.id = var1;
		this.sizeX = var2;
		this.sizeY = var3;
		this.players = new IndexedObjectSet(var1 == -1 ? 512 : 8);
		this.npcs = new IndexedObjectSet(var1 == -1 ? 128 : 8);
		this.worldEntities = new IterableNodeHashTable(var1 == -1 ? 32 : 1);
		this.groundItems = new NodeDeque[4][var2][var3];
		this.tileHeights = new int[4][var2 + 1][var3 + 1];
		this.tileSettings = new byte[4][var2][var3];
		this.tileLastDrawnActor = new int[var2][var3];
		boolean var6 = var1 != -1;

		for (int var7 = 0; var7 < 4; ++var7) {
			this.collisionMaps[var7] = new CollisionMap(var2, var3, var6);
		}

		this.scene = new Scene(var1, 4, var2, var3, var4, var5, this.tileHeights);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-81"
	)
	boolean method2650() {
		return this.id == -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1487167704"
	)
	void method2628() {
		this.field1150.method9809();
		this.field1143.method9809();
		this.players.clear();
		this.npcs.clear();
		this.worldEntities.clear();
		this.graphicsObjects.clear();
		this.pendingSpawns = new NodeDeque();

		int var1;
		for (var1 = 0; var1 < 4; ++var1) {
			for (int var2 = 0; var2 < this.sizeX; ++var2) {
				for (int var3 = 0; var3 < this.sizeY; ++var3) {
					this.groundItems[var1][var2][var3] = null;
				}
			}
		}

		this.scene.clearTempGameObjects();

		for (var1 = 0; var1 < 4; ++var1) {
			this.collisionMaps[var1].clear();
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1921704624"
	)
	void method2626() {
		this.players.clear();

		Actor var2;
		for (Iterator var1 = this.npcs.iterator(); var1.hasNext(); var2.false0 = false) {
			var2 = (Actor)var1.next();
			var2.targetIndex = -1;
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Lcr;",
		garbageValue = "1175607437"
	)
	Player method2627(int var1) {
		return (Player)this.players.get((long)var1);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Lqp;",
		garbageValue = "969255450"
	)
	NodeDeque method2638() {
		return this.objectSounds;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIILia;IB)V",
		garbageValue = "-26"
	)
	@Export("createObjectSound")
	void createObjectSound(int var1, int var2, int var3, ObjectComposition var4, int var5) {
		ObjectSound var6 = new ObjectSound(this.id, var1, var2, var3, var5, var4);
		this.objectSounds.addFirst(var6);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "285711210"
	)
	void method2641() {
		for (ObjectSound var1 = (ObjectSound)this.objectSounds.last(); var1 != null; var1 = (ObjectSound)this.objectSounds.previous()) {
			var1.method2242();
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIILia;II)V",
		garbageValue = "766589663"
	)
	void method2631(int var1, int var2, int var3, ObjectComposition var4, int var5) {
		if (var4 != null && var4.hasSound()) {
			int var6 = var4.sizeX;
			int var7 = var4.sizeY;
			if (var5 == 1 || var5 == 3) {
				var6 = var4.sizeY;
				var7 = var4.sizeX;
			}

			int var8 = Coord.method7393(var6 + var2);
			int var9 = Coord.method7393(var3 + var7);
			var2 = Coord.method7393(var2);
			var3 = Coord.method7393(var3);
			int var10 = var4.ambientSoundId;
			int var11 = Coord.method7393(var4.int7);
			int var12 = Coord.method7393(var4.int8);
			if (var4.transforms != null) {
				ObjectComposition var13 = var4.transform();
				if (var13 != null) {
					var10 = var13.ambientSoundId;
					var11 = Coord.method7393(var13.int7);
					var12 = Coord.method7393(var13.int8);
				}
			}

			for (ObjectSound var14 = (ObjectSound)this.objectSounds.last(); var14 != null; var14 = (ObjectSound)this.objectSounds.previous()) {
				if (var14.method2238() == var1 && var14.method2234() == var2 && var14.method2236() == var3 && var14.method2250() == var8 && var14.method2287() == var9 && var14.method2299() == var10 && var14.method2304() == var11 && var14.method2240() == var12) {
					var14.method2242();
					break;
				}
			}
		}

	}

	@ObfuscatedName("mu")
	@ObfuscatedSignature(
		descriptor = "([Lox;IIIIIIIIIIII)V",
		garbageValue = "899027973"
	)
	@Export("drawInterface")
	static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		Rasterizer2D.Rasterizer2D_setClip(var5, var6, var7, var8);
		Rasterizer3D.resetRasterClipping();

		for (int var12 = var1; var12 <= var2; ++var12) {
			Widget var13 = var0[var12];
			if (var13 != null && (var3 == var13.parentId && var4 == var13.field4117 || var3 == -1412584499 && var13 == Client.clickedWidget)) {
				int var14;
				if (var11 == -1) {
					Client.rootWidgetXs[Client.rootWidgetCount] = var9 + var13.x;
					Client.rootWidgetYs[Client.rootWidgetCount] = var10 + var13.y;
					Client.rootWidgetWidths[Client.rootWidgetCount] = var13.width;
					Client.rootWidgetHeights[Client.rootWidgetCount] = var13.height * -1326764757;
					var14 = ++Client.rootWidgetCount - 1;
				} else {
					var14 = var11;
				}

				var13.rootIndex = var14;
				var13.cycle = Client.cycle;
				if (!var13.isIf3 || !class187.isComponentHidden(var13)) {
					if (var13.contentType > 0) {
						BuddyRankComparator.method3549(var13);
					}

					int var15 = var9 + var13.x;
					int var16 = var10 + var13.y;
					int var17 = var13.transparencyTop;
					int var18;
					int var19;
					if (var13 == Client.clickedWidget) {
						if (var3 != -1412584499 && !var13.isScrollBar) {
							Canvas.field104 = var0;
							PcmPlayer.field1311 = var9;
							UserComparator5.field1553 = var10;
							continue;
						}

						if (Client.isDraggingWidget && Client.field519) {
							var18 = MouseHandler.MouseHandler_x;
							var19 = MouseHandler.MouseHandler_y;
							var18 -= Client.widgetClickX;
							var19 -= Client.widgetClickY;
							if (var18 < Client.field512) {
								var18 = Client.field512;
							}

							if (var18 + var13.width > Client.field512 + Client.clickedWidgetParent.width) {
								var18 = Client.field512 + Client.clickedWidgetParent.width - var13.width;
							}

							if (var19 < Client.field521) {
								var19 = Client.field521;
							}

							if (var19 + var13.height * -1326764757 > Client.clickedWidgetParent.height * -1326764757 + Client.field521) {
								var19 = Client.clickedWidgetParent.height * -1326764757 + Client.field521 - var13.height * -1326764757;
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
						var24 = var15 + var13.width;
						var25 = var13.height * -1326764757 + var16;
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
						var22 = var15 + var13.width;
						var23 = var16 + var13.height * -1326764757;
						var18 = var15 > var5 ? var15 : var5;
						var19 = var16 > var6 ? var16 : var6;
						var20 = var22 < var7 ? var22 : var7;
						var21 = var23 < var8 ? var23 : var8;
					}

					if (!var13.isIf3 || var18 < var20 && var19 < var21) {
						if (var13.contentType != 0) {
							if (var13.contentType == 1336) {
								if (FriendSystem.clientPreferences.isDisplayingFps()) {
									var16 += 15;
									class152.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var15 + var13.width, var16, 16776960, -1);
									var16 += 15;
									Runtime var45 = Runtime.getRuntime();
									var23 = (int)((var45.totalMemory() - var45.freeMemory()) / 1024L);
									var24 = 16776960;
									if (var23 > 327680 && !Client.isLowDetail) {
										var24 = 16711680;
									}

									class152.fontPlain12.drawRightAligned("Mem:" + var23 + "k", var15 + var13.width, var16, var24, -1);
									var16 += 15;
								}
								continue;
							}

							if (var13.contentType == 1337) {
								Client.viewportX = var15;
								Client.viewportY = var16;
								ClientPreferences.drawEntities(var15, var16, var13.width, var13.height * -1326764757);
								Client.validRootWidgets[var13.rootIndex] = true;
								Rasterizer2D.Rasterizer2D_setClip(var5, var6, var7, var8);
								continue;
							}

							if (var13.contentType == 1338) {
								class191.drawMinimap(var13, var15, var16, var14);
								Rasterizer2D.Rasterizer2D_setClip(var5, var6, var7, var8);
								continue;
							}

							if (var13.contentType == 1339) {
								class201.method4440(var13, var15, var16, var14);
								Rasterizer2D.Rasterizer2D_setClip(var5, var6, var7, var8);
								continue;
							}

							if (var13.contentType == 1400) {
								Skills.worldMap.draw(var15, var16, var13.width, var13.height * -1326764757, Client.cycle, FriendSystem.clientPreferences.getBrightness());
							}

							if (var13.contentType == 1401) {
								Skills.worldMap.drawOverview(var15, var16, var13.width, var13.height * -1326764757);
							}

							if (var13.contentType == 1402) {
								MidiPcmStream.loginScreenRunesAnimation.draw(var15, Client.cycle);
							}
						}

						if (var13.type == 0) {
							if (!var13.isIf3 && class187.isComponentHidden(var13) && var13 != JagexCache.mousedOverWidgetIf1) {
								continue;
							}

							if (!var13.isIf3) {
								if (var13.scrollY > var13.scrollHeight - var13.height * -1326764757) {
									var13.scrollY = var13.scrollHeight - var13.height * -1326764757;
								}

								if (var13.scrollY < 0) {
									var13.scrollY = 0;
								}
							}

							drawInterface(var0, var13.field4148, var13.field4090, var13.id, var13.childIndex * -64977777, var18, var19, var20, var21, var15 - var13.scrollX, var16 - var13.scrollY, var14);
							if (var13.children != null) {
								drawInterface(var13.children, 0, var13.children.length - 1, var13.id, -1, var18, var19, var20, var21, var15 - var13.scrollX, var16 - var13.scrollY, var14);
							}

							if (var13.childIndex * -64977777 == -1) {
								InterfaceParent var32 = (InterfaceParent)Client.interfaceParents.get((long)var13.id);
								if (var32 != null) {
									Clock.drawWidgets(var32.group, var18, var19, var20, var21, var15, var16, var14);
								}
							}

							Rasterizer2D.Rasterizer2D_setClip(var5, var6, var7, var8);
							Rasterizer3D.resetRasterClipping();
						} else if (var13.type == 11) {
							if (class187.isComponentHidden(var13) && var13 != JagexCache.mousedOverWidgetIf1) {
								continue;
							}

							if (var13.children != null) {
								drawInterface(var13.children, 0, var13.children.length - 1, var13.id, -1, var18, var19, var20, var21, var15 - var13.scrollX, var16 - var13.scrollY, var14);
							}

							Rasterizer2D.Rasterizer2D_setClip(var5, var6, var7, var8);
							Rasterizer3D.resetRasterClipping();
						}

						if (Client.isResizable || Client.field546[var14] || Client.gameDrawingMode > 1) {
							if (var13.type == 0 && !var13.isIf3 && var13.scrollHeight > var13.height * -1326764757) {
								class28.drawScrollBar(var15 + var13.width, var16, var13.scrollY, var13.height * -1326764757, var13.scrollHeight);
							}

							if (var13.type != 1) {
								if (var13.type == 3) {
									if (class375.runCs1(var13)) {
										var22 = var13.color2;
										if (var13 == JagexCache.mousedOverWidgetIf1 && var13.mouseOverColor2 != 0) {
											var22 = var13.mouseOverColor2;
										}
									} else {
										var22 = var13.color;
										if (var13 == JagexCache.mousedOverWidgetIf1 && var13.mouseOverColor != 0) {
											var22 = var13.mouseOverColor;
										}
									}

									if (var13.fill) {
										switch(var13.fillMode.field5900) {
										case 1:
											Rasterizer2D.Rasterizer2D_fillRectangleGradient(var15, var16, var13.width, var13.height * -1326764757, var13.color, var13.color2);
											break;
										case 2:
											Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var15, var16, var13.width, var13.height * -1326764757, var13.color, var13.color2, 255 - (var13.transparencyTop & 255), 255 - (var13.transparencyBot & 255));
											break;
										default:
											if (var17 == 0) {
												Rasterizer2D.Rasterizer2D_fillRectangle(var15, var16, var13.width, var13.height * -1326764757, var22);
											} else {
												Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var15, var16, var13.width, var13.height * -1326764757, var22, 256 - (var17 & 255));
											}
										}
									} else if (var17 == 0) {
										Rasterizer2D.Rasterizer2D_drawRectangle(var15, var16, var13.width, var13.height * -1326764757, var22);
									} else {
										Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var15, var16, var13.width, var13.height * -1326764757, var22, 256 - (var17 & 255));
									}
								} else if (var13.type == 4) {
									Font var44 = var13.getFont(class167.widgetDefinition);
									if (var44 == null) {
										if (Widget.field4064) {
											ApproximateRouteStrategy.invalidateWidget(var13);
										}
									} else {
										String var43 = var13.text;
										if (class375.runCs1(var13)) {
											var23 = var13.color2;
											if (var13 == JagexCache.mousedOverWidgetIf1 && var13.mouseOverColor2 != 0) {
												var23 = var13.mouseOverColor2;
											}

											if (!var13.text2.isEmpty()) {
												var43 = var13.text2;
											}
										} else {
											var23 = var13.color;
											if (var13 == JagexCache.mousedOverWidgetIf1 && var13.mouseOverColor != 0) {
												var23 = var13.mouseOverColor;
											}
										}

										if (var13.isIf3 && var13.itemId != -1) {
											ItemComposition var46 = ObjectComposition.ItemDefinition_get(var13.itemId);
											var43 = var46.name;
											if (var43 == null) {
												var43 = "null";
											}

											if ((var46.isStackable == 1 || var13.itemQuantity != 1) && var13.itemQuantity != -1) {
												var43 = ObjectSound.colorStartTag(16748608) + var43 + "</col>" + " " + 'x' + BoundaryObject.formatItemStacks(var13.itemQuantity);
											}
										}

										if (var13 == Client.meslayerContinueWidget) {
											var43 = "Please wait...";
											var23 = var13.color;
										}

										if (!var13.isIf3) {
											var43 = WorldMapSection0.method6746(var43, var13);
										}

										var44.drawWidgetText(var43, var15, var16, var13.width, var13.height * -1326764757, var23, var13.textShadowed ? 0 : -1, class533.method10570(var13.transparencyTop), var13.textXAlignment, var13.textYAlignment, var13.textLineHeight);
									}
								} else {
									int var27;
									int var28;
									if (var13.type == 5) {
										SpritePixels var42;
										if (!var13.isIf3) {
											var42 = var13.getSprite(class167.widgetDefinition, class375.runCs1(var13), class203.urlRequester);
											if (var42 != null) {
												var42.drawTransBgAt(var15, var16);
											} else if (Widget.field4064) {
												ApproximateRouteStrategy.invalidateWidget(var13);
											}
										} else {
											if (var13.itemId != -1) {
												var42 = IgnoreList.method9876(var13.itemId, var13.itemQuantity, var13.outline, var13.spriteShadow, var13.itemQuantityMode, false, Math.max(36, var13.width), Math.max(32, var13.height * -1326764757));
											} else {
												var42 = var13.getSprite(class167.widgetDefinition, false, class203.urlRequester);
											}

											if (var42 == null) {
												if (Widget.field4064) {
													ApproximateRouteStrategy.invalidateWidget(var13);
												}
											} else {
												var23 = var42.width;
												var24 = var42.height;
												if (!var13.spriteTiling) {
													var25 = var13.width * 4096 / var23;
													if (var13.spriteAngle != 0) {
														var42.method11725(var13.width / 2 + var15, var16 + var13.height * -1326764757 / 2, var13.spriteAngle, var25);
													} else if (var17 != 0) {
														var42.drawTransScaledAt(var15, var16, var13.width, var13.height * -1326764757, 256 - (var17 & 255));
													} else if (var23 == var13.width && var24 == var13.height * -1326764757) {
														var42.drawTransBgAt(var15, var16);
													} else {
														var42.drawScaledAt(var15, var16, var13.width, var13.height * -1326764757);
													}
												} else {
													Rasterizer2D.Rasterizer2D_expandClip(var15, var16, var15 + var13.width, var16 + var13.height * -1326764757);
													var25 = (var23 - 1 + var13.width) / var23;
													int var26 = (var13.height * -1326764757 + (var24 - 1)) / var24;

													for (var27 = 0; var27 < var25; ++var27) {
														for (var28 = 0; var28 < var26; ++var28) {
															if (var13.spriteAngle != 0) {
																var42.method11725(var23 / 2 + var15 + var27 * var23, var24 / 2 + var16 + var28 * var24, var13.spriteAngle, 4096);
															} else if (var17 != 0) {
																var42.drawTransAt(var15 + var27 * var23, var16 + var28 * var24, 256 - (var17 & 255));
															} else {
																var42.drawTransBgAt(var15 + var23 * var27, var16 + var24 * var28);
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
											boolean var39 = class375.runCs1(var13);
											if (var39) {
												var25 = var13.sequenceId2;
											} else {
												var25 = var13.sequenceId;
											}

											if (var25 != -1) {
												var41 = AsyncHttpResponse.SequenceDefinition_get(var25);
												var23 = var13.modelFrame;
											}

											Model var48 = null;
											var27 = 0;
											if (var13.itemId != -1) {
												ItemComposition var37 = ObjectComposition.ItemDefinition_get(var13.itemId);
												if (var37 != null) {
													var37 = var37.getCountObj(var13.itemQuantity);
													var48 = var37.getModel(1);
													if (var48 != null) {
														var48.calculateBoundsCylinder();
														var27 = var48.height / 2;
													} else {
														ApproximateRouteStrategy.invalidateWidget(var13);
													}
												}
											} else if (var13.modelType == 5) {
												if (var13.modelId == 0) {
													var48 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
												} else {
													var48 = class27.localPlayer.getModel();
												}
											} else if (var13.modelType == 7) {
												var48 = var13.field4178.getModel((SequenceDefinition)null, -1, AsyncHttpResponse.SequenceDefinition_get(class27.localPlayer.idleSequence), class27.localPlayer.field1064.method9573());
											} else if (var13.modelType == 8) {
												if (var13.modelId != -1) {
													ObjectComposition var47 = SpriteMask.getObjectDefinition(var13.modelId);
													var48 = var47.getModelDynamic(10, 0, (int[][])null, 0, 0, 0, var41, var23);
												}
											} else {
												NPCComposition var49;
												if (var13.modelType == 9) {
													if (var13.modelId != -1) {
														var49 = class191.getNpcDefinition(var13.modelId);
														var48 = var49.getModel(var41, var23, (SequenceDefinition)null, -1, (NpcOverrides)null);
													}
												} else {
													var49 = null;
													NpcOverrides var38 = null;
													if (var13.modelType == 6) {
														var30 = var13.modelId;
														if (var30 >= 0) {
															NPC var31 = (NPC)class7.topLevelWorldView.npcs.get((long)var30);
															if (var31 != null && var31.definition != null) {
																var49 = var31.definition;
																if (var49.transforms != null) {
																	var49 = var49.transform();
																}

																var38 = var31.method2728();
															}
														}
													} else if (var13.modelType == 2) {
														var30 = var13.modelId;
														var49 = class191.getNpcDefinition(var30);
														if (var49.transforms != null) {
															var49 = var49.transform();
														}
													}

													var48 = var13.getModel(class167.widgetDefinition, var41, var23, var39, class27.localPlayer.appearance, var49, var38);
													if (var48 == null && Widget.field4064) {
														ApproximateRouteStrategy.invalidateWidget(var13);
													}
												}
											}

											Rasterizer3D.setCustomClipBounds(var13.width / 2 + var15, var16 + var13.height * -1326764757 / 2);
											var28 = Rasterizer3D.Rasterizer3D_sine[var13.modelAngleX] * var13.modelZoom >> 16;
											var29 = Rasterizer3D.Rasterizer3D_cosine[var13.modelAngleX] * var13.modelZoom >> 16;
											if (var48 != null) {
												Rasterizer3D.method4968(false);
												if (!var13.isIf3) {
													var48.drawFrustum(0, var13.modelAngleY, 0, var13.modelAngleX, 0, var28, var29);
												} else {
													var48.calculateBoundsCylinder();
													if (var13.modelOrthog) {
														var48.drawOrtho(0, var13.modelAngleY, var13.modelAngleZ, var13.modelAngleX, var13.modelOffsetX, var27 + var28 + var13.modelOffsetY, var29 + var13.modelOffsetY, var13.modelZoom);
													} else {
														var48.drawFrustum(0, var13.modelAngleY, var13.modelAngleZ, var13.modelAngleX, var13.modelOffsetX, var28 + var27 + var13.modelOffsetY, var29 + var13.modelOffsetY);
													}
												}
											}

											Rasterizer3D.setClipBounds();
										} else {
											Font var34;
											if (var13.type == 8) {
												if (var13 == Canvas.field102 && Client.field392 == Client.field506) {
													var22 = 0;
													var23 = 0;
													var34 = class152.fontPlain12;
													String var35 = var13.text;

													String var36;
													for (var35 = WorldMapSection0.method6746(var35, var13); !var35.isEmpty(); var23 = var23 + var34.ascent + 1) {
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
													var27 = var15 + var13.width - 5 - var22;
													var28 = var13.height * -1326764757 + var16 + 5;
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

													for (var35 = WorldMapSection0.method6746(var35, var13); !var35.isEmpty(); var29 = var29 + var34.ascent + 1) {
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
												if (var13.field4109) {
													var22 = var15;
													var23 = var13.height * -1326764757 + var16;
													var24 = var15 + var13.width;
													var25 = var16;
												} else {
													var22 = var15;
													var23 = var16;
													var24 = var15 + var13.width;
													var25 = var16 + var13.height * -1326764757;
												}

												if (var13.lineWid == 1) {
													Rasterizer2D.Rasterizer2D_drawLine(var22, var23, var24, var25, var13.color);
												} else {
													ApproximateRouteStrategy.method791(var22, var23, var24, var25, var13.color, var13.lineWid);
												}
											} else if (var13.type == 12) {
												class364 var40 = var13.method7935();
												class358 var33 = var13.method7970();
												if (var40 != null && var33 != null && var40.method7797()) {
													var34 = var13.getFont(class167.widgetDefinition);
													if (var34 != null) {
														Client.field403.method11847(var15, var16, var13.width, var13.height * -1326764757, var40.method7767(), var40.method7717(), var40.method7630(), var40.method7631(), var40.method7629());
														var25 = var13.textShadowed ? var13.spriteShadow : -1;
														if (!var40.method7753() && var40.method7624().method9274()) {
															Client.field403.method11848(var33.field3963, var25, var33.field3966, var33.field3962);
															Client.field403.method11849(var40.method7664(), var34);
														} else {
															Client.field403.method11848(var13.color, var25, var33.field3966, var33.field3962);
															Client.field403.method11849(var40.method7624(), var34);
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
