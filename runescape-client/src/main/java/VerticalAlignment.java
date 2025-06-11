import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hr")
@Implements("VerticalAlignment")
public enum VerticalAlignment implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lhr;"
	)
	field2082(1, 0),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lhr;"
	)
	@Export("VerticalAlignment_centered")
	VerticalAlignment_centered(2, 1),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lhr;"
	)
	field2080(0, 2);

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	@Export("archive9")
	static Archive archive9;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1202097001
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -46270567
	)
	@Export("id")
	final int id;

	VerticalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "26"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "163"
	)
	static final int method4229() {
		return ViewportMouse.ViewportMouse_x;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "-10"
	)
	static final int method4228(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
		return var3;
	}

	@ObfuscatedName("mz")
	@ObfuscatedSignature(
		descriptor = "([Lov;IIIIIIIIIIB)V",
		garbageValue = "-4"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		for (int var11 = var1; var11 <= var2; ++var11) {
			Widget var12 = var0[var11];
			if (var12 != null && var3 == var12.parentId && var4 == var12.field4127 && (var12.method7872() || class255.method5526(var12) != 0 || GrandExchangeOfferOwnWorldComparator.method757(var12) != 0 || var12 == Client.clickedWidgetParent)) {
				if (var12.isIf3) {
					if (class171.isComponentHidden(var12)) {
						continue;
					}
				} else if (var12.type == 0 && var12 != FloorUnderlayDefinition.mousedOverWidgetIf1 && class171.isComponentHidden(var12)) {
					continue;
				}

				if (var12.type == 11) {
					if (var12.method7770(ClientPreferences.widgetDefinition, class167.urlRequester)) {
						if (var12.method7841()) {
							ScriptFrame.invalidateWidget(var12);
							ClanSettings.revalidateWidgetScroll(var12.children, var12, true);
							var12.method7758().method4636().method4767(3, var12.method7758().method4678());
						}

						if (var12.field4005 != null) {
							ScriptEvent var13 = new ScriptEvent();
							var13.widget = var12;
							var13.args = var12.field4005;
							Client.scriptEvents.addFirst(var13);
						}
					}
				} else if (var12.type == 12 && var12.method7747(ClientPreferences.widgetDefinition)) {
					ScriptFrame.invalidateWidget(var12);
				}

				int var29 = var9 + var12.x;
				int var14 = var10 + var12.y;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				int var20;
				int var21;
				if (var12.type == 9) {
					var19 = var29;
					var20 = var14;
					var21 = var29 + var12.width * -1805166981;
					int var22 = var14 + var12.height * -2133353239;
					if (var21 < var29) {
						var19 = var21;
						var21 = var29;
					}

					if (var22 < var14) {
						var20 = var22;
						var22 = var14;
					}

					++var21;
					++var22;
					var15 = var19 > var5 ? var19 : var5;
					var16 = var20 > var6 ? var20 : var6;
					var17 = var21 < var7 ? var21 : var7;
					var18 = var22 < var8 ? var22 : var8;
				} else {
					var19 = var29 + var12.width * -1805166981;
					var20 = var14 + var12.height * -2133353239;
					var15 = var29 > var5 ? var29 : var5;
					var16 = var14 > var6 ? var14 : var6;
					var17 = var19 < var7 ? var19 : var7;
					var18 = var20 < var8 ? var20 : var8;
				}

				if (var12 == Client.clickedWidget) {
					Client.field535 = true;
					Client.field536 = var29;
					Client.field537 = var14;
				}

				boolean var37 = false;
				if (var12.field4057) {
					switch(Client.field413) {
					case 0:
						var37 = true;
					case 1:
					default:
						break;
					case 2:
						if (Client.field414 == var12.id >>> 16) {
							var37 = true;
						}
						break;
					case 3:
						if (var12.id == Client.field414) {
							var37 = true;
						}
					}
				}

				if (var37 || !var12.isIf3 || var15 < var17 && var16 < var18) {
					if (var12.isIf3) {
						ScriptEvent var30;
						if (var12.noClickThrough) {
							if (MouseHandler.MouseHandler_x >= var15 && MouseHandler.MouseHandler_y >= var16 && MouseHandler.MouseHandler_x < var17 && MouseHandler.MouseHandler_y < var18) {
								for (var30 = (ScriptEvent)Client.scriptEvents.last(); var30 != null; var30 = (ScriptEvent)Client.scriptEvents.previous()) {
									if (var30.field896) {
										var30.remove();
										var30.widget.field4122 = false;
									}
								}

								class31.method461();
								if (UserComparator7.widgetDragDuration == 0) {
									Client.clickedWidget = null;
									Client.clickedWidgetParent = null;
								}

								if (!Client.isMenuOpen) {
									class547.addCancelMenuEntry();
								}
							}
						} else if (var12.noScrollThrough && MouseHandler.MouseHandler_x >= var15 && MouseHandler.MouseHandler_y >= var16 && MouseHandler.MouseHandler_x < var17 && MouseHandler.MouseHandler_y < var18) {
							for (var30 = (ScriptEvent)Client.scriptEvents.last(); var30 != null; var30 = (ScriptEvent)Client.scriptEvents.previous()) {
								if (var30.field896 && var30.widget.onScroll == var30.args) {
									var30.remove();
								}
							}
						}
					}

					var20 = MouseHandler.MouseHandler_x;
					var21 = MouseHandler.MouseHandler_y;
					boolean var38 = var20 >= var15 && var21 >= var16 && var20 < var17 && var21 < var18;
					if (var12.contentType == 1337) {
						if (!Client.isLoading && !Client.isMenuOpen && var38) {
							Canvas.addSceneMenuOptions(var20, var21, var15, var16);
						}
					} else if (var12.contentType == 1338) {
						ClanSettings.checkIfMinimapClicked(var12, var29, var14);
					} else {
						if (var12.contentType == 1400) {
							class338.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var38, var29, var14, var12.width * -1805166981, var12.height * -2133353239);
						}

						if (!Client.isMenuOpen && var38) {
							if (var12.contentType == 1400) {
								class338.worldMap.addElementMenuOptions(var29, var14, var12.width * -1805166981, var12.height * -2133353239, var20, var21);
							} else {
								class4.Widget_addToMenu(var12);
							}
						}

						boolean var24;
						int var26;
						if (var37) {
							for (int var23 = 0; var23 < var12.field4058.length; ++var23) {
								var24 = false;
								boolean var31 = false;
								if (!var24 && var12.field4058[var23] != null) {
									for (var26 = 0; var26 < var12.field4058[var23].length; ++var26) {
										boolean var27 = false;
										if (var12.field4130 != null) {
											var27 = Client.indexCheck.isValidIndexInRange(var12.field4058[var23][var26]);
										}

										if (StudioGame.method7935(var12.field4058[var23][var26]) || var27) {
											var24 = true;
											if (var12.field4130 != null && var12.field4130[var23] > Client.cycle) {
												break;
											}

											byte var36 = var12.field4059[var23][var26];
											if (var36 == 0 || ((var36 & 8) == 0 || !Client.indexCheck.isValidIndexInRange(86) && !Client.indexCheck.isValidIndexInRange(82) && !Client.indexCheck.isValidIndexInRange(81)) && ((var36 & 2) == 0 || Client.indexCheck.isValidIndexInRange(86)) && ((var36 & 1) == 0 || Client.indexCheck.isValidIndexInRange(82)) && ((var36 & 4) == 0 || Client.indexCheck.isValidIndexInRange(81))) {
												var31 = true;
												break;
											}
										}
									}
								}

								if (var31) {
									if (var23 < 10) {
										VarbitComposition.widgetDefaultMenuAction(var23 + 1, var12.id, var12.childIndex * -744024149, var12.itemId, "");
									} else if (var23 == 10) {
										WorldMapSectionType.method6573();
										class564.method10658(var12.id, var12.childIndex * -744024149, class187.method4098(class255.method5526(var12)), var12.itemId);
										Client.selectedSpellActionName = class322.Widget_getSpellActionName(var12);
										if (Client.selectedSpellActionName == null) {
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var12.dataText + AbstractWorldMapIcon.colorStartTag(16777215);
									}

									var26 = var12.field4060[var23];
									if (var12.field4130 == null) {
										var12.field4130 = new int[var12.field4058.length];
									}

									if (var12.field4031 == null) {
										var12.field4031 = new int[var12.field4058.length];
									}

									if (var26 != 0) {
										if (var12.field4130[var23] == 0) {
											var12.field4130[var23] = var26 + Client.cycle + var12.field4031[var23];
										} else {
											var12.field4130[var23] = var26 + Client.cycle;
										}
									} else {
										var12.field4130[var23] = Integer.MAX_VALUE;
									}
								}

								if (!var24 && var12.field4130 != null) {
									var12.field4130[var23] = 0;
								}
							}
						}

						if (var12.isIf3) {
							boolean var39 = false;
							if ((MouseHandler.MouseHandler_currentButton == 1 || !class7.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var38) {
								var39 = true;
							}

							var24 = false;
							if ((MouseHandler.MouseHandler_lastButton == 1 || !class7.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var15 && MouseHandler.MouseHandler_lastPressedY >= var16 && MouseHandler.MouseHandler_lastPressedX < var17 && MouseHandler.MouseHandler_lastPressedY < var18) {
								var24 = true;
							}

							if (var24) {
								class142.clickWidget(var12, MouseHandler.MouseHandler_lastPressedX - var29, MouseHandler.MouseHandler_lastPressedY - var14);
							}

							if (var12.method7849()) {
								if (var24) {
									Client.field427.addFirst(new class270(0, MouseHandler.MouseHandler_x - var29, MouseHandler.MouseHandler_y - var14, var12));
								}

								if (var39) {
									Client.field427.addFirst(new class270(1, MouseHandler.MouseHandler_x - var29, MouseHandler.MouseHandler_y - var14, var12));
								}
							}

							if (var12.contentType == 1400) {
								class338.worldMap.method10287(var20, var21, var38 & var39, var38 & var24);
							}

							if (Client.clickedWidget != null && var12 != Client.clickedWidget && var38 && ObjectComposition.method4443(class255.method5526(var12))) {
								Client.draggedOnWidget = var12;
							}

							if (var12 == Client.clickedWidgetParent) {
								Client.field532 = true;
								Client.field371 = var29;
								Client.field568 = var14;
							}

							if (var12.hasListener) {
								ScriptEvent var25;
								if (var38 && Client.mouseWheelRotation != 0 && var12.onScroll != null) {
									var25 = new ScriptEvent();
									var25.field896 = true;
									var25.widget = var12;
									var25.mouseY = Client.mouseWheelRotation;
									var25.args = var12.onScroll;
									Client.scriptEvents.addFirst(var25);
								}

								if (Client.clickedWidget != null || Client.isMenuOpen) {
									var24 = false;
									var39 = false;
									var38 = false;
								}

								if (!var12.field4123 && var24) {
									var12.field4123 = true;
									if (var12.onClick != null) {
										var25 = new ScriptEvent();
										var25.field896 = true;
										var25.widget = var12;
										var25.mouseX = MouseHandler.MouseHandler_lastPressedX - var29;
										var25.mouseY = MouseHandler.MouseHandler_lastPressedY - var14;
										var25.args = var12.onClick;
										Client.scriptEvents.addFirst(var25);
									}
								}

								if (var12.field4123 && var39 && var12.onClickRepeat != null) {
									var25 = new ScriptEvent();
									var25.field896 = true;
									var25.widget = var12;
									var25.mouseX = MouseHandler.MouseHandler_x - var29;
									var25.mouseY = MouseHandler.MouseHandler_y - var14;
									var25.args = var12.onClickRepeat;
									Client.scriptEvents.addFirst(var25);
								}

								if (var12.field4123 && !var39) {
									var12.field4123 = false;
									if (var12.onRelease != null) {
										var25 = new ScriptEvent();
										var25.field896 = true;
										var25.widget = var12;
										var25.mouseX = MouseHandler.MouseHandler_x - var29;
										var25.mouseY = MouseHandler.MouseHandler_y - var14;
										var25.args = var12.onRelease;
										Client.scriptEvents3.addFirst(var25);
									}
								}

								if (var39 && var12.onHold != null) {
									var25 = new ScriptEvent();
									var25.field896 = true;
									var25.widget = var12;
									var25.mouseX = MouseHandler.MouseHandler_x - var29;
									var25.mouseY = MouseHandler.MouseHandler_y - var14;
									var25.args = var12.onHold;
									Client.scriptEvents.addFirst(var25);
								}

								if (!var12.field4122 && var38) {
									var12.field4122 = true;
									if (var12.onMouseOver != null) {
										var25 = new ScriptEvent();
										var25.field896 = true;
										var25.widget = var12;
										var25.mouseX = MouseHandler.MouseHandler_x - var29;
										var25.mouseY = MouseHandler.MouseHandler_y - var14;
										var25.args = var12.onMouseOver;
										Client.scriptEvents.addFirst(var25);
									}
								}

								if (var12.field4122 && var38 && var12.onMouseRepeat != null) {
									var25 = new ScriptEvent();
									var25.field896 = true;
									var25.widget = var12;
									var25.mouseX = MouseHandler.MouseHandler_x - var29;
									var25.mouseY = MouseHandler.MouseHandler_y - var14;
									var25.args = var12.onMouseRepeat;
									Client.scriptEvents.addFirst(var25);
								}

								if (var12.field4122 && !var38) {
									var12.field4122 = false;
									if (var12.onMouseLeave != null) {
										var25 = new ScriptEvent();
										var25.field896 = true;
										var25.widget = var12;
										var25.mouseX = MouseHandler.MouseHandler_x - var29;
										var25.mouseY = MouseHandler.MouseHandler_y - var14;
										var25.args = var12.onMouseLeave;
										Client.scriptEvents3.addFirst(var25);
									}
								}

								if (var12.onTimer != null) {
									var25 = new ScriptEvent();
									var25.widget = var12;
									var25.args = var12.onTimer;
									Client.scriptEvents2.addFirst(var25);
								}

								ScriptEvent var28;
								int var40;
								int var42;
								if (var12.onVarTransmit != null && Client.changedVarpCount > var12.field4125) {
									if (var12.varTransmitTriggers != null && Client.changedVarpCount - var12.field4125 <= 32) {
										label831:
										for (var42 = var12.field4125; var42 < Client.changedVarpCount; ++var42) {
											var26 = Client.changedItemContainers[var42 & 31];

											for (var40 = 0; var40 < var12.varTransmitTriggers.length; ++var40) {
												if (var26 == var12.varTransmitTriggers[var40]) {
													var28 = new ScriptEvent();
													var28.widget = var12;
													var28.args = var12.onVarTransmit;
													Client.scriptEvents.addFirst(var28);
													break label831;
												}
											}
										}
									} else {
										var25 = new ScriptEvent();
										var25.widget = var12;
										var25.args = var12.onVarTransmit;
										Client.scriptEvents.addFirst(var25);
									}

									var12.field4125 = Client.changedVarpCount;
								}

								if (var12.onInvTransmit != null && Client.changedSkillsCount > var12.field4126) {
									if (var12.invTransmitTriggers != null && Client.changedSkillsCount - var12.field4126 <= 32) {
										label807:
										for (var42 = var12.field4126; var42 < Client.changedSkillsCount; ++var42) {
											var26 = Client.field374[var42 & 31];

											for (var40 = 0; var40 < var12.invTransmitTriggers.length; ++var40) {
												if (var26 == var12.invTransmitTriggers[var40]) {
													var28 = new ScriptEvent();
													var28.widget = var12;
													var28.args = var12.onInvTransmit;
													Client.scriptEvents.addFirst(var28);
													break label807;
												}
											}
										}
									} else {
										var25 = new ScriptEvent();
										var25.widget = var12;
										var25.args = var12.onInvTransmit;
										Client.scriptEvents.addFirst(var25);
									}

									var12.field4126 = Client.changedSkillsCount;
								}

								if (var12.onStatTransmit != null && Client.field577 > var12.field4141) {
									if (var12.statTransmitTriggers != null && Client.field577 - var12.field4141 <= 32) {
										label783:
										for (var42 = var12.field4141; var42 < Client.field577; ++var42) {
											var26 = Client.field470[var42 & 31];

											for (var40 = 0; var40 < var12.statTransmitTriggers.length; ++var40) {
												if (var26 == var12.statTransmitTriggers[var40]) {
													var28 = new ScriptEvent();
													var28.widget = var12;
													var28.args = var12.onStatTransmit;
													Client.scriptEvents.addFirst(var28);
													break label783;
												}
											}
										}
									} else {
										var25 = new ScriptEvent();
										var25.widget = var12;
										var25.args = var12.onStatTransmit;
										Client.scriptEvents.addFirst(var25);
									}

									var12.field4141 = Client.field577;
								}

								if (Client.chatCycle > var12.field4124 && var12.onChatTransmit != null) {
									var25 = new ScriptEvent();
									var25.widget = var12;
									var25.args = var12.onChatTransmit;
									Client.scriptEvents.addFirst(var25);
								}

								if (Client.field534 > var12.field4124 && var12.onFriendTransmit != null) {
									var25 = new ScriptEvent();
									var25.widget = var12;
									var25.args = var12.onFriendTransmit;
									Client.scriptEvents.addFirst(var25);
								}

								if (Client.field548 > var12.field4124 && var12.onClanTransmit != null) {
									var25 = new ScriptEvent();
									var25.widget = var12;
									var25.args = var12.onClanTransmit;
									Client.scriptEvents.addFirst(var25);
								}

								if (Client.field549 > var12.field4124 && var12.field4100 != null) {
									var25 = new ScriptEvent();
									var25.widget = var12;
									var25.args = var12.field4100;
									Client.scriptEvents.addFirst(var25);
								}

								if (Client.field550 > var12.field4124 && var12.field4088 != null) {
									var25 = new ScriptEvent();
									var25.widget = var12;
									var25.args = var12.field4088;
									Client.scriptEvents.addFirst(var25);
								}

								if (Client.field611 > var12.field4124 && var12.onStockTransmit != null) {
									var25 = new ScriptEvent();
									var25.widget = var12;
									var25.args = var12.onStockTransmit;
									Client.scriptEvents.addFirst(var25);
								}

								if (Client.field552 > var12.field4124 && var12.field4041 != null) {
									var25 = new ScriptEvent();
									var25.widget = var12;
									var25.args = var12.field4041;
									Client.scriptEvents.addFirst(var25);
								}

								if (Client.field553 > var12.field4124 && var12.onMiscTransmit != null) {
									var25 = new ScriptEvent();
									var25.widget = var12;
									var25.args = var12.onMiscTransmit;
									Client.scriptEvents.addFirst(var25);
								}

								var12.field4124 = Client.cycleCntr;
								if (var12.onKey != null) {
									for (var42 = 0; var42 < Client.field432; ++var42) {
										ScriptEvent var35 = new ScriptEvent();
										var35.widget = var12;
										var35.keyTyped = Client.field425[var42];
										var35.keyPressed = Client.field360[var42];
										var35.args = var12.onKey;
										Client.scriptEvents.addFirst(var35);
									}
								}

								ScriptEvent var34;
								int[] var41;
								if (var12.field4023 != null) {
									var41 = Client.indexCheck.method5894();

									for (var26 = 0; var26 < var41.length; ++var26) {
										var34 = new ScriptEvent();
										var34.widget = var12;
										var34.keyTyped = var41[var26];
										var34.args = var12.field4023;
										Client.scriptEvents.addFirst(var34);
									}
								}

								if (var12.field4097 != null) {
									var41 = Client.indexCheck.method5895();

									for (var26 = 0; var26 < var41.length; ++var26) {
										var34 = new ScriptEvent();
										var34.widget = var12;
										var34.keyTyped = var41[var26];
										var34.args = var12.field4097;
										Client.scriptEvents.addFirst(var34);
									}
								}
							}
						}

						if (!var12.isIf3) {
							if (Client.clickedWidget != null || Client.isMenuOpen) {
								continue;
							}

							if ((var12.mouseOverRedirect >= 0 || var12.mouseOverColor != 0) && MouseHandler.MouseHandler_x >= var15 && MouseHandler.MouseHandler_y >= var16 && MouseHandler.MouseHandler_x < var17 && MouseHandler.MouseHandler_y < var18) {
								if (var12.mouseOverRedirect >= 0) {
									FloorUnderlayDefinition.mousedOverWidgetIf1 = var0[var12.mouseOverRedirect];
								} else {
									FloorUnderlayDefinition.mousedOverWidgetIf1 = var12;
								}
							}

							if (var12.type == 8 && MouseHandler.MouseHandler_x >= var15 && MouseHandler.MouseHandler_y >= var16 && MouseHandler.MouseHandler_x < var17 && MouseHandler.MouseHandler_y < var18) {
								Strings.field4598 = var12;
							}

							if (var12.scrollHeight > var12.height * -2133353239) {
								WorldMapSectionType.method6571(var12, var29 + var12.width * -1805166981, var14, var12.height * -2133353239, var12.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var12.type == 0) {
							updateInterface(var0, var12.field4002, var12.field4003, var12.id, var12.childIndex * -744024149, var15, var16, var17, var18, var29 - var12.scrollX, var14 - var12.scrollY);
							if (var12.children != null) {
								updateInterface(var12.children, 0, var12.children.length - 1, var12.id, -1, var15, var16, var17, var18, var29 - var12.scrollX, var14 - var12.scrollY);
							}

							if (var12.childIndex * -744024149 == -1) {
								InterfaceParent var32 = (InterfaceParent)Client.interfaceParents.get((long)var12.id);
								if (var32 != null) {
									if (var32.type == 0 && MouseHandler.MouseHandler_x >= var15 && MouseHandler.MouseHandler_y >= var16 && MouseHandler.MouseHandler_x < var17 && MouseHandler.MouseHandler_y < var18 && !Client.isMenuOpen) {
										for (ScriptEvent var33 = (ScriptEvent)Client.scriptEvents.last(); var33 != null; var33 = (ScriptEvent)Client.scriptEvents.previous()) {
											if (var33.field896) {
												var33.remove();
												var33.widget.field4122 = false;
											}
										}

										if (UserComparator7.widgetDragDuration == 0) {
											Client.clickedWidget = null;
											Client.clickedWidgetParent = null;
										}

										if (!Client.isMenuOpen) {
											class547.addCancelMenuEntry();
										}
									}

									class163.updateRootInterface(var32.group, var15, var16, var17, var18, var29, var14);
								}
							}
						}
					}
				}
			}
		}

	}
}
