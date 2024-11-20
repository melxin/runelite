import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oc")
@Implements("StudioGame")
public enum StudioGame implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);

	@ObfuscatedName("aj")
	@Export("name")
	public final String name;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -2093358445
	)
	@Export("id")
	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3;
		this.id = var5;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1071289392"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("mt")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "-112"
	)
	static final void method7473(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0;
		int var7 = var3 - var1;
		int var8 = var6 >= 0 ? var6 : -var6;
		int var9 = var7 >= 0 ? var7 : -var7;
		int var10 = var8;
		if (var8 < var9) {
			var10 = var9;
		}

		if (var10 != 0) {
			int var11 = (var6 << 16) / var10;
			int var12 = (var7 << 16) / var10;
			if (var12 <= var11) {
				var11 = -var11;
			} else {
				var12 = -var12;
			}

			int var13 = var5 * var12 >> 17;
			int var14 = var5 * var12 + 1 >> 17;
			int var15 = var5 * var11 >> 17;
			int var16 = var5 * var11 + 1 >> 17;
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart;
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart;
			int var17 = var0 + var13;
			int var18 = var0 - var14;
			int var19 = var0 + var6 - var14;
			int var20 = var0 + var6 + var13;
			int var21 = var15 + var1;
			int var22 = var1 - var16;
			int var23 = var7 + var1 - var16;
			int var24 = var7 + var15 + var1;
			Rasterizer3D.setClipping(var17, var18, var19);
			Rasterizer3D.rasterFlat(var21, var22, var23, var17, var18, var19, 0.0F, 0.0F, 0.0F, var4);
			Rasterizer3D.setClipping(var17, var19, var20);
			Rasterizer3D.rasterFlat(var21, var23, var24, var17, var19, var20, 0.0F, 0.0F, 0.0F, var4);
		}
	}

	@ObfuscatedName("nd")
	@ObfuscatedSignature(
		descriptor = "([Lnp;IIIIIIIB)V",
		garbageValue = "6"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) {
			Widget var9 = var0[var8];
			if (var9 != null && var9.parentId == var1 && (var9.method7261() || Renderable.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent)) {
				if (var9.isIf3) {
					if (UserComparator3.isComponentHidden(var9)) {
						continue;
					}
				} else if (var9.type == 0 && var9 != PcmPlayer.mousedOverWidgetIf1 && UserComparator3.isComponentHidden(var9)) {
					continue;
				}

				if (var9.type == 11) {
					if (var9.method7348(class379.widgetDefinition, class167.urlRequester)) {
						if (var9.method7331()) {
							class178.invalidateWidget(var9);
							GrandExchangeOfferAgeComparator.revalidateWidgetScroll(var9.children, var9, true);
							var9.method7276().method4366().method4450(3, var9.method7276().method4343());
						}

						if (var9.field3992 != null) {
							ScriptEvent var10 = new ScriptEvent();
							var10.widget = var9;
							var10.args = var9.field3992;
							Client.scriptEvents.addFirst(var10);
						}
					}
				} else if (var9.type == 12 && var9.method7283(class379.widgetDefinition)) {
					class178.invalidateWidget(var9);
				}

				int var26 = var9.x + var6;
				int var11 = var7 + var9.y;
				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				if (var9.type == 9) {
					var16 = var26;
					var17 = var11;
					var18 = var9.width * 1063514007 + var26;
					int var19 = var11 + var9.height * 1899982693;
					if (var18 < var26) {
						var16 = var18;
						var18 = var26;
					}

					if (var19 < var11) {
						var17 = var19;
						var19 = var11;
					}

					++var18;
					++var19;
					var12 = var16 > var2 ? var16 : var2;
					var13 = var17 > var3 ? var17 : var3;
					var14 = var18 < var4 ? var18 : var4;
					var15 = var19 < var5 ? var19 : var5;
				} else {
					var16 = var26 + var9.width * 1063514007;
					var17 = var11 + var9.height * 1899982693;
					var12 = var26 > var2 ? var26 : var2;
					var13 = var11 > var3 ? var11 : var3;
					var14 = var16 < var4 ? var16 : var4;
					var15 = var17 < var5 ? var17 : var5;
				}

				if (var9 == Client.clickedWidget) {
					Client.field749 = true;
					Client.field694 = var26;
					Client.field695 = var11;
				}

				boolean var34 = false;
				if (var9.field3940) {
					switch(Client.field710) {
					case 0:
						var34 = true;
					case 1:
					default:
						break;
					case 2:
						if (Client.field676 == var9.id >>> 16) {
							var34 = true;
						}
						break;
					case 3:
						if (var9.id == Client.field676) {
							var34 = true;
						}
					}
				}

				if (var34 || !var9.isIf3 || var12 < var14 && var13 < var15) {
					if (var9.isIf3) {
						ScriptEvent var27;
						if (var9.noClickThrough) {
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) {
									if (var27.field1083) {
										var27.remove();
										var27.widget.field4006 = false;
									}
								}

								class163.method3617();
								if (class383.widgetDragDuration == 0) {
									Client.clickedWidget = null;
									Client.clickedWidgetParent = null;
								}

								if (!Client.isMenuOpen) {
									HttpRequestTask.addCancelMenuEntry();
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
							for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) {
								if (var27.field1083 && var27.widget.onScroll == var27.args) {
									var27.remove();
								}
							}
						}
					}

					var17 = MouseHandler.MouseHandler_x;
					var18 = MouseHandler.MouseHandler_y;
					if (MouseHandler.MouseHandler_lastButton != 0) {
						var17 = MouseHandler.MouseHandler_lastPressedX;
						var18 = MouseHandler.MouseHandler_lastPressedY;
					}

					boolean var35 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15;
					if (var9.contentType == 1337) {
						if (!Client.isLoading && !Client.isMenuOpen && var35) {
							FaceNormal.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) {
						class507.checkIfMinimapClicked(var9, var26, var11);
					} else {
						if (var9.contentType == 1400) {
							class158.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var35, var26, var11, var9.width * 1063514007, var9.height * 1899982693);
						}

						if (!Client.isMenuOpen && var35) {
							if (var9.contentType == 1400) {
								class158.worldMap.addElementMenuOptions(var26, var11, var9.width * 1063514007, var9.height * 1899982693, var17, var18);
							} else {
								class431.Widget_addToMenu(var9);
							}
						}

						boolean var21;
						int var23;
						if (var34) {
							for (int var20 = 0; var20 < var9.field3941.length; ++var20) {
								var21 = false;
								boolean var28 = false;
								if (!var21 && var9.field3941[var20] != null) {
									for (var23 = 0; var23 < var9.field3941[var20].length; ++var23) {
										boolean var24 = false;
										if (var9.field4014 != null) {
											var24 = Client.indexCheck.isValidIndexInRange(var9.field3941[var20][var23]);
										}

										if (Interpreter.method2127(var9.field3941[var20][var23]) || var24) {
											var21 = true;
											if (var9.field4014 != null && var9.field4014[var20] > Client.cycle) {
												break;
											}

											byte var33 = var9.field3942[var20][var23];
											if (var33 == 0 || ((var33 & 8) == 0 || !Client.indexCheck.isValidIndexInRange(86) && !Client.indexCheck.isValidIndexInRange(82) && !Client.indexCheck.isValidIndexInRange(81)) && ((var33 & 2) == 0 || Client.indexCheck.isValidIndexInRange(86)) && ((var33 & 1) == 0 || Client.indexCheck.isValidIndexInRange(82)) && ((var33 & 4) == 0 || Client.indexCheck.isValidIndexInRange(81))) {
												var28 = true;
												break;
											}
										}
									}
								}

								if (var28) {
									if (var20 < 10) {
										AsyncHttpResponse.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) {
										class320.method6451();
										class229.method4534(var9.id, var9.childIndex, class202.Widget_unpackTargetMask(Renderable.getWidgetFlags(var9)), var9.itemId);
										Client.selectedSpellActionName = Fonts.Widget_getSpellActionName(var9);
										if (Client.selectedSpellActionName == null) {
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var9.dataText + class438.colorStartTag(16777215);
									}

									var23 = var9.field3943[var20];
									if (var9.field4014 == null) {
										var9.field4014 = new int[var9.field3941.length];
									}

									if (var9.field3944 == null) {
										var9.field3944 = new int[var9.field3941.length];
									}

									if (var23 != 0) {
										if (var9.field4014[var20] == 0) {
											var9.field4014[var20] = var23 + Client.cycle + var9.field3944[var20];
										} else {
											var9.field4014[var20] = var23 + Client.cycle;
										}
									} else {
										var9.field4014[var20] = Integer.MAX_VALUE;
									}
								}

								if (!var21 && var9.field4014 != null) {
									var9.field4014[var20] = 0;
								}
							}
						}

						if (var9.isIf3) {
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								var35 = true;
							} else {
								var35 = false;
							}

							boolean var36 = false;
							if ((MouseHandler.MouseHandler_currentButton == 1 || !class160.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var35) {
								var36 = true;
							}

							var21 = false;
							if ((MouseHandler.MouseHandler_lastButton == 1 || !class160.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) {
								var21 = true;
							}

							if (var21) {
								User.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var26, MouseHandler.MouseHandler_lastPressedY - var11);
							}

							if (var9.method7260()) {
								if (var21) {
									Client.field719.addFirst(new class268(0, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9));
								}

								if (var36) {
									Client.field719.addFirst(new class268(1, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9));
								}
							}

							if (var9.contentType == 1400) {
								class158.worldMap.method9692(var17, var18, var35 & var36, var35 & var21);
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var35 && PcmPlayer.method815(Renderable.getWidgetFlags(var9))) {
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) {
								Client.field690 = true;
								Client.field795 = var26;
								Client.field683 = var11;
							}

							if (var9.hasListener) {
								ScriptEvent var22;
								if (var35 && Client.mouseWheelRotation != 0 && var9.onScroll != null) {
									var22 = new ScriptEvent();
									var22.field1083 = true;
									var22.widget = var9;
									var22.mouseY = Client.mouseWheelRotation;
									var22.args = var9.onScroll;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.clickedWidget != null || Client.isMenuOpen) {
									var21 = false;
									var36 = false;
									var35 = false;
								}

								if (!var9.field4007 && var21) {
									var9.field4007 = true;
									if (var9.onClick != null) {
										var22 = new ScriptEvent();
										var22.field1083 = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_lastPressedX - var26;
										var22.mouseY = MouseHandler.MouseHandler_lastPressedY - var11;
										var22.args = var9.onClick;
										Client.scriptEvents.addFirst(var22);
									}
								}

								if (var9.field4007 && var36 && var9.onClickRepeat != null) {
									var22 = new ScriptEvent();
									var22.field1083 = true;
									var22.widget = var9;
									var22.mouseX = MouseHandler.MouseHandler_x - var26;
									var22.mouseY = MouseHandler.MouseHandler_y - var11;
									var22.args = var9.onClickRepeat;
									Client.scriptEvents.addFirst(var22);
								}

								if (var9.field4007 && !var36) {
									var9.field4007 = false;
									if (var9.onRelease != null) {
										var22 = new ScriptEvent();
										var22.field1083 = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_x - var26;
										var22.mouseY = MouseHandler.MouseHandler_y - var11;
										var22.args = var9.onRelease;
										Client.scriptEvents3.addFirst(var22);
									}
								}

								if (var36 && var9.onHold != null) {
									var22 = new ScriptEvent();
									var22.field1083 = true;
									var22.widget = var9;
									var22.mouseX = MouseHandler.MouseHandler_x - var26;
									var22.mouseY = MouseHandler.MouseHandler_y - var11;
									var22.args = var9.onHold;
									Client.scriptEvents.addFirst(var22);
								}

								if (!var9.field4006 && var35) {
									var9.field4006 = true;
									if (var9.onMouseOver != null) {
										var22 = new ScriptEvent();
										var22.field1083 = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_x - var26;
										var22.mouseY = MouseHandler.MouseHandler_y - var11;
										var22.args = var9.onMouseOver;
										Client.scriptEvents.addFirst(var22);
									}
								}

								if (var9.field4006 && var35 && var9.onMouseRepeat != null) {
									var22 = new ScriptEvent();
									var22.field1083 = true;
									var22.widget = var9;
									var22.mouseX = MouseHandler.MouseHandler_x - var26;
									var22.mouseY = MouseHandler.MouseHandler_y - var11;
									var22.args = var9.onMouseRepeat;
									Client.scriptEvents.addFirst(var22);
								}

								if (var9.field4006 && !var35) {
									var9.field4006 = false;
									if (var9.onMouseLeave != null) {
										var22 = new ScriptEvent();
										var22.field1083 = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_x - var26;
										var22.mouseY = MouseHandler.MouseHandler_y - var11;
										var22.args = var9.onMouseLeave;
										Client.scriptEvents3.addFirst(var22);
									}
								}

								if (var9.onTimer != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onTimer;
									Client.scriptEvents2.addFirst(var22);
								}

								ScriptEvent var25;
								int var37;
								int var39;
								if (var9.onVarTransmit != null && Client.changedVarpCount > var9.field4009) {
									if (var9.varTransmitTriggers != null && Client.changedVarpCount - var9.field4009 <= 32) {
										label827:
										for (var39 = var9.field4009; var39 < Client.changedVarpCount; ++var39) {
											var23 = Client.changedVarps[var39 & 31];

											for (var37 = 0; var37 < var9.varTransmitTriggers.length; ++var37) {
												if (var23 == var9.varTransmitTriggers[var37]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onVarTransmit;
													Client.scriptEvents.addFirst(var25);
													break label827;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onVarTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field4009 = Client.changedVarpCount;
								}

								if (var9.onInvTransmit != null && Client.field701 > var9.field3988) {
									if (var9.invTransmitTriggers != null && Client.field701 - var9.field3988 <= 32) {
										label803:
										for (var39 = var9.field3988; var39 < Client.field701; ++var39) {
											var23 = Client.changedItemContainers[var39 & 31];

											for (var37 = 0; var37 < var9.invTransmitTriggers.length; ++var37) {
												if (var23 == var9.invTransmitTriggers[var37]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onInvTransmit;
													Client.scriptEvents.addFirst(var25);
													break label803;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onInvTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field3988 = Client.field701;
								}

								if (var9.onStatTransmit != null && Client.changedSkillsCount > var9.field4011) {
									if (var9.statTransmitTriggers != null && Client.changedSkillsCount - var9.field4011 <= 32) {
										label779:
										for (var39 = var9.field4011; var39 < Client.changedSkillsCount; ++var39) {
											var23 = Client.changedSkills[var39 & 31];

											for (var37 = 0; var37 < var9.statTransmitTriggers.length; ++var37) {
												if (var23 == var9.statTransmitTriggers[var37]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onStatTransmit;
													Client.scriptEvents.addFirst(var25);
													break label779;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onStatTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field4011 = Client.changedSkillsCount;
								}

								if (Client.chatCycle > var9.field4008 && var9.onChatTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onChatTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field707 > var9.field4008 && var9.onFriendTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onFriendTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field708 > var9.field4008 && var9.onClanTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onClanTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field709 > var9.field4008 && var9.field3984 != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.field3984;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field798 > var9.field4008 && var9.field3965 != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.field3965;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field769 > var9.field4008 && var9.onStockTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onStockTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field712 > var9.field4008 && var9.field3991 != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.field3991;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field713 > var9.field4008 && var9.onMiscTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onMiscTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								var9.field4008 = Client.cycleCntr;
								if (var9.onKey != null) {
									for (var39 = 0; var39 < Client.field743; ++var39) {
										ScriptEvent var32 = new ScriptEvent();
										var32.widget = var9;
										var32.keyTyped = Client.field745[var39];
										var32.keyPressed = Client.field744[var39];
										var32.args = var9.onKey;
										Client.scriptEvents.addFirst(var32);
									}
								}

								ScriptEvent var31;
								int[] var38;
								if (var9.field3980 != null) {
									var38 = Client.indexCheck.method5566();

									for (var23 = 0; var23 < var38.length; ++var23) {
										var31 = new ScriptEvent();
										var31.widget = var9;
										var31.keyTyped = var38[var23];
										var31.args = var9.field3980;
										Client.scriptEvents.addFirst(var31);
									}
								}

								if (var9.field3981 != null) {
									var38 = Client.indexCheck.method5593();

									for (var23 = 0; var23 < var38.length; ++var23) {
										var31 = new ScriptEvent();
										var31.widget = var9;
										var31.keyTyped = var38[var23];
										var31.args = var9.field3981;
										Client.scriptEvents.addFirst(var31);
									}
								}
							}
						}

						if (!var9.isIf3) {
							if (Client.clickedWidget != null || Client.isMenuOpen) {
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.mouseOverColor != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								if (var9.mouseOverRedirect >= 0) {
									PcmPlayer.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									PcmPlayer.mousedOverWidgetIf1 = var9;
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								SongTask.field4882 = var9;
							}

							if (var9.scrollHeight > var9.height * 1899982693) {
								class421.method8050(var9, var9.width * 1063514007 + var26, var11, var9.height * 1899982693, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var9.type == 0) {
							updateInterface(var0, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY);
							if (var9.children != null) {
								updateInterface(var9.children, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY);
							}

							InterfaceParent var29 = (InterfaceParent)Client.interfaceParents.get((long)var9.id);
							if (var29 != null) {
								if (var29.type == 0 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15 && !Client.isMenuOpen) {
									for (ScriptEvent var30 = (ScriptEvent)Client.scriptEvents.last(); var30 != null; var30 = (ScriptEvent)Client.scriptEvents.previous()) {
										if (var30.field1083) {
											var30.remove();
											var30.widget.field4006 = false;
										}
									}

									if (class383.widgetDragDuration == 0) {
										Client.clickedWidget = null;
										Client.clickedWidgetParent = null;
									}

									if (!Client.isMenuOpen) {
										HttpRequestTask.addCancelMenuEntry();
									}
								}

								class7.updateRootInterface(var29.group, var12, var13, var14, var15, var26, var11);
							}
						}
					}
				}
			}
		}

	}
}
