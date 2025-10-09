import java.util.regex.Pattern;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rp")
public final class class443 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	static AbstractArchive field5181;
	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	static Archive field5180;

	static {
		Pattern.compile("^\\D*(\\d+)\\D*$");
	}

	@ObfuscatedName("ns")
	@ObfuscatedSignature(
		descriptor = "([Lok;IIIIIIIIIII)V",
		garbageValue = "347113320"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		for (int var11 = var1; var11 <= var2; ++var11) {
			Widget var12 = var0[var11];
			if (var12 != null && var3 == var12.parentId && var4 == var12.field4173 && (var12.method7939() || MouseRecorder.method2181(var12) != 0 || class338.getWidgetFlags2(var12) != 0 || var12 == Client.clickedWidgetParent)) {
				if (var12.isIf3) {
					if (class30.isComponentHidden(var12)) {
						continue;
					}
				} else if (var12.type == 0 && var12 != class280.mousedOverWidgetIf1 && class30.isComponentHidden(var12)) {
					continue;
				}

				if (var12.type == 11) {
					if (var12.method7958(class35.widgetDefinition, PcmPlayer.urlRequester)) {
						if (var12.method7951()) {
							class154.invalidateWidget(var12);
							VarcInt.revalidateWidgetScroll(var12.children, var12, true);
							var12.method7957().method5916().method6001(3, var12.method7957().method5891());
						}

						if (var12.field4300 != null) {
							ScriptEvent var13 = new ScriptEvent();
							var13.widget = var12;
							var13.args = var12.field4300;
							Client.scriptEvents.addFirst(var13);
						}
					}
				} else if (var12.type == 12 && var12.method7992(class35.widgetDefinition)) {
					class154.invalidateWidget(var12);
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
					var21 = var29 + var12.width;
					int var22 = var12.height * -171267385 + var14;
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
					var19 = var29 + var12.width;
					var20 = var12.height * -171267385 + var14;
					var15 = var29 > var5 ? var29 : var5;
					var16 = var14 > var6 ? var14 : var6;
					var17 = var19 < var7 ? var19 : var7;
					var18 = var20 < var8 ? var20 : var8;
				}

				if (var12 == Client.clickedWidget) {
					Client.field411 = true;
					Client.field537 = var29;
					Client.field589 = var14;
				}

				boolean var37 = false;
				if (var12.field4182) {
					switch(Client.field403) {
					case 0:
						var37 = true;
					case 1:
					default:
						break;
					case 2:
						if (Client.field404 == var12.id >>> 16) {
							var37 = true;
						}
						break;
					case 3:
						if (var12.id == Client.field404) {
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
									if (var30.field875) {
										var30.remove();
										var30.widget.field4314 = false;
									}
								}

								class271.method6107();
								if (SecureRandomCallable.widgetDragDuration == 0) {
									Client.clickedWidget = null;
									Client.clickedWidgetParent = null;
								}

								if (!Client.isMenuOpen) {
									Frames.addCancelMenuEntry();
								}
							}
						} else if (var12.noScrollThrough && MouseHandler.MouseHandler_x >= var15 && MouseHandler.MouseHandler_y >= var16 && MouseHandler.MouseHandler_x < var17 && MouseHandler.MouseHandler_y < var18) {
							for (var30 = (ScriptEvent)Client.scriptEvents.last(); var30 != null; var30 = (ScriptEvent)Client.scriptEvents.previous()) {
								if (var30.field875 && var30.widget.onScroll == var30.args) {
									var30.remove();
								}
							}
						}
					}

					var20 = MouseHandler.MouseHandler_x;
					var21 = MouseHandler.MouseHandler_y;
					if (MouseHandler.MouseHandler_lastButton != 0) {
						var20 = MouseHandler.MouseHandler_lastPressedX;
						var21 = MouseHandler.MouseHandler_lastPressedY;
					}

					boolean var38 = var20 >= var15 && var21 >= var16 && var20 < var17 && var21 < var18;
					if (var12.contentType == 1337) {
						if (!Client.isLoading && !Client.isMenuOpen && var38) {
							AbstractUserComparator.addSceneMenuOptions(var20, var21, var15, var16);
						}
					} else if (var12.contentType == 1338) {
						class399.checkIfMinimapClicked(var12, var29, var14);
					} else {
						if (var12.contentType == 1400) {
							class50.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var38, var29, var14, var12.width, var12.height * -171267385);
						}

						if (!Client.isMenuOpen && var38) {
							if (var12.contentType == 1400) {
								class50.worldMap.addElementMenuOptions(var29, var14, var12.width, var12.height * -171267385, var20, var21);
							} else {
								class135.Widget_addToMenu(var12);
							}
						}

						boolean var24;
						int var26;
						if (var37) {
							for (int var23 = 0; var23 < var12.field4250.length; ++var23) {
								var24 = false;
								boolean var31 = false;
								if (!var24 && var12.field4250[var23] != null) {
									for (var26 = 0; var26 < var12.field4250[var23].length; ++var26) {
										boolean var27 = false;
										if (var12.field4322 != null) {
											var27 = Client.indexCheck.isValidIndexInRange(var12.field4250[var23][var26]);
										}

										if (SecureUrlRequester.method3583(var12.field4250[var23][var26]) || var27) {
											var24 = true;
											if (var12.field4322 != null && var12.field4322[var23] > Client.cycle) {
												break;
											}

											byte var36 = var12.field4251[var23][var26];
											if (var36 == 0 || ((var36 & 8) == 0 || !Client.indexCheck.isValidIndexInRange(86) && !Client.indexCheck.isValidIndexInRange(82) && !Client.indexCheck.isValidIndexInRange(81)) && ((var36 & 2) == 0 || Client.indexCheck.isValidIndexInRange(86)) && ((var36 & 1) == 0 || Client.indexCheck.isValidIndexInRange(82)) && ((var36 & 4) == 0 || Client.indexCheck.isValidIndexInRange(81))) {
												var31 = true;
												break;
											}
										}
									}
								}

								if (var31) {
									if (var23 < 10) {
										class179.widgetDefaultMenuAction(var23 + 1, var12.id, var12.childIndex * -2066937045, var12.itemId, "");
									} else if (var23 == 10) {
										class30.method470();
										class572.method11201(var12.id, var12.childIndex * -2066937045, AsyncRestClient.Widget_unpackTargetMask(MouseRecorder.method2181(var12)), var12.itemId);
										Client.selectedSpellActionName = ClientPreferences.Widget_getSpellActionName(var12);
										if (Client.selectedSpellActionName == null) {
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var12.dataText + class171.colorStartTag(16777215);
									}

									var26 = var12.field4316[var23];
									if (var12.field4322 == null) {
										var12.field4322 = new int[var12.field4250.length];
									}

									if (var12.field4253 == null) {
										var12.field4253 = new int[var12.field4250.length];
									}

									if (var26 != 0) {
										if (var12.field4322[var23] == 0) {
											var12.field4322[var23] = var26 + Client.cycle + var12.field4253[var23];
										} else {
											var12.field4322[var23] = var26 + Client.cycle;
										}
									} else {
										var12.field4322[var23] = Integer.MAX_VALUE;
									}
								}

								if (!var24 && var12.field4322 != null) {
									var12.field4322[var23] = 0;
								}
							}
						}

						if (var12.isIf3) {
							if (MouseHandler.MouseHandler_x >= var15 && MouseHandler.MouseHandler_y >= var16 && MouseHandler.MouseHandler_x < var17 && MouseHandler.MouseHandler_y < var18) {
								var38 = true;
							} else {
								var38 = false;
							}

							boolean var39 = false;
							if ((MouseHandler.MouseHandler_currentButton == 1 || !ObjectComposition.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var38) {
								var39 = true;
							}

							var24 = false;
							if ((MouseHandler.MouseHandler_lastButton == 1 || !ObjectComposition.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var15 && MouseHandler.MouseHandler_lastPressedY >= var16 && MouseHandler.MouseHandler_lastPressedX < var17 && MouseHandler.MouseHandler_lastPressedY < var18) {
								var24 = true;
							}

							if (var24) {
								MenuAction.clickWidget(var12, MouseHandler.MouseHandler_lastPressedX - var29, MouseHandler.MouseHandler_lastPressedY - var14);
							}

							if (var12.method7927()) {
								if (var24) {
									Client.field360.addFirst(new class272(0, MouseHandler.MouseHandler_x - var29, MouseHandler.MouseHandler_y - var14, var12));
								}

								if (var39) {
									Client.field360.addFirst(new class272(1, MouseHandler.MouseHandler_x - var29, MouseHandler.MouseHandler_y - var14, var12));
								}
							}

							if (var12.contentType == 1400) {
								class50.worldMap.method10786(var20, var21, var38 & var39, var38 & var24);
							}

							if (Client.clickedWidget != null && var12 != Client.clickedWidget && var38 && EnumComposition.method4360(MouseRecorder.method2181(var12))) {
								Client.draggedOnWidget = var12;
							}

							if (var12 == Client.clickedWidgetParent) {
								Client.field513 = true;
								Client.field514 = var29;
								Client.field515 = var14;
							}

							if (var12.hasListener) {
								ScriptEvent var25;
								if (var38 && Client.mouseWheelRotation != 0 && var12.onScroll != null) {
									var25 = new ScriptEvent();
									var25.field875 = true;
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

								if (!var12.field4315 && var24) {
									var12.field4315 = true;
									if (var12.onClick != null) {
										var25 = new ScriptEvent();
										var25.field875 = true;
										var25.widget = var12;
										var25.mouseX = MouseHandler.MouseHandler_lastPressedX - var29;
										var25.mouseY = MouseHandler.MouseHandler_lastPressedY - var14;
										var25.args = var12.onClick;
										Client.scriptEvents.addFirst(var25);
									}
								}

								if (var12.field4315 && var39 && var12.onClickRepeat != null) {
									var25 = new ScriptEvent();
									var25.field875 = true;
									var25.widget = var12;
									var25.mouseX = MouseHandler.MouseHandler_x - var29;
									var25.mouseY = MouseHandler.MouseHandler_y - var14;
									var25.args = var12.onClickRepeat;
									Client.scriptEvents.addFirst(var25);
								}

								if (var12.field4315 && !var39) {
									var12.field4315 = false;
									if (var12.onRelease != null) {
										var25 = new ScriptEvent();
										var25.field875 = true;
										var25.widget = var12;
										var25.mouseX = MouseHandler.MouseHandler_x - var29;
										var25.mouseY = MouseHandler.MouseHandler_y - var14;
										var25.args = var12.onRelease;
										Client.scriptEvents3.addFirst(var25);
									}
								}

								if (var39 && var12.onHold != null) {
									var25 = new ScriptEvent();
									var25.field875 = true;
									var25.widget = var12;
									var25.mouseX = MouseHandler.MouseHandler_x - var29;
									var25.mouseY = MouseHandler.MouseHandler_y - var14;
									var25.args = var12.onHold;
									Client.scriptEvents.addFirst(var25);
								}

								if (!var12.field4314 && var38) {
									var12.field4314 = true;
									if (var12.onMouseOver != null) {
										var25 = new ScriptEvent();
										var25.field875 = true;
										var25.widget = var12;
										var25.mouseX = MouseHandler.MouseHandler_x - var29;
										var25.mouseY = MouseHandler.MouseHandler_y - var14;
										var25.args = var12.onMouseOver;
										Client.scriptEvents.addFirst(var25);
									}
								}

								if (var12.field4314 && var38 && var12.onMouseRepeat != null) {
									var25 = new ScriptEvent();
									var25.field875 = true;
									var25.widget = var12;
									var25.mouseX = MouseHandler.MouseHandler_x - var29;
									var25.mouseY = MouseHandler.MouseHandler_y - var14;
									var25.args = var12.onMouseRepeat;
									Client.scriptEvents.addFirst(var25);
								}

								if (var12.field4314 && !var38) {
									var12.field4314 = false;
									if (var12.onMouseLeave != null) {
										var25 = new ScriptEvent();
										var25.field875 = true;
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
								if (var12.onVarTransmit != null && Client.changedVarpCount > var12.field4317) {
									if (var12.varTransmitTriggers != null && Client.changedVarpCount - var12.field4317 <= 32) {
										label844:
										for (var42 = var12.field4317; var42 < Client.changedVarpCount; ++var42) {
											var26 = Client.changedVarps[var42 & 31];

											for (var40 = 0; var40 < var12.varTransmitTriggers.length; ++var40) {
												if (var26 == var12.varTransmitTriggers[var40]) {
													var28 = new ScriptEvent();
													var28.widget = var12;
													var28.args = var12.onVarTransmit;
													Client.scriptEvents.addFirst(var28);
													break label844;
												}
											}
										}
									} else {
										var25 = new ScriptEvent();
										var25.widget = var12;
										var25.args = var12.onVarTransmit;
										Client.scriptEvents.addFirst(var25);
									}

									var12.field4317 = Client.changedVarpCount;
								}

								if (var12.onInvTransmit != null && Client.changedItemsCount > var12.field4318) {
									if (var12.invTransmitTriggers != null && Client.changedItemsCount - var12.field4318 <= 32) {
										label820:
										for (var42 = var12.field4318; var42 < Client.changedItemsCount; ++var42) {
											var26 = Client.changedItemContainers[var42 & 31];

											for (var40 = 0; var40 < var12.invTransmitTriggers.length; ++var40) {
												if (var26 == var12.invTransmitTriggers[var40]) {
													var28 = new ScriptEvent();
													var28.widget = var12;
													var28.args = var12.onInvTransmit;
													Client.scriptEvents.addFirst(var28);
													break label820;
												}
											}
										}
									} else {
										var25 = new ScriptEvent();
										var25.widget = var12;
										var25.args = var12.onInvTransmit;
										Client.scriptEvents.addFirst(var25);
									}

									var12.field4318 = Client.changedItemsCount;
								}

								if (var12.onStatTransmit != null && Client.changedSkillsCount > var12.field4266) {
									if (var12.statTransmitTriggers != null && Client.changedSkillsCount - var12.field4266 <= 32) {
										label796:
										for (var42 = var12.field4266; var42 < Client.changedSkillsCount; ++var42) {
											var26 = Client.changedSkills[var42 & 31];

											for (var40 = 0; var40 < var12.statTransmitTriggers.length; ++var40) {
												if (var26 == var12.statTransmitTriggers[var40]) {
													var28 = new ScriptEvent();
													var28.widget = var12;
													var28.args = var12.onStatTransmit;
													Client.scriptEvents.addFirst(var28);
													break label796;
												}
											}
										}
									} else {
										var25 = new ScriptEvent();
										var25.widget = var12;
										var25.args = var12.onStatTransmit;
										Client.scriptEvents.addFirst(var25);
									}

									var12.field4266 = Client.changedSkillsCount;
								}

								if (Client.chatCycle > var12.field4285 && var12.onChatTransmit != null) {
									var25 = new ScriptEvent();
									var25.widget = var12;
									var25.args = var12.onChatTransmit;
									Client.scriptEvents.addFirst(var25);
								}

								if (Client.field470 > var12.field4285 && var12.onFriendTransmit != null) {
									var25 = new ScriptEvent();
									var25.widget = var12;
									var25.args = var12.onFriendTransmit;
									Client.scriptEvents.addFirst(var25);
								}

								if (Client.field529 > var12.field4285 && var12.onClanTransmit != null) {
									var25 = new ScriptEvent();
									var25.widget = var12;
									var25.args = var12.onClanTransmit;
									Client.scriptEvents.addFirst(var25);
								}

								if (Client.field530 > var12.field4285 && var12.field4292 != null) {
									var25 = new ScriptEvent();
									var25.widget = var12;
									var25.args = var12.field4292;
									Client.scriptEvents.addFirst(var25);
								}

								if (Client.field531 > var12.field4285 && var12.field4243 != null) {
									var25 = new ScriptEvent();
									var25.widget = var12;
									var25.args = var12.field4243;
									Client.scriptEvents.addFirst(var25);
								}

								if (Client.field532 > var12.field4285 && var12.onStockTransmit != null) {
									var25 = new ScriptEvent();
									var25.widget = var12;
									var25.args = var12.onStockTransmit;
									Client.scriptEvents.addFirst(var25);
								}

								if (Client.field446 > var12.field4285 && var12.field4299 != null) {
									var25 = new ScriptEvent();
									var25.widget = var12;
									var25.args = var12.field4299;
									Client.scriptEvents.addFirst(var25);
								}

								if (Client.field428 > var12.field4285 && var12.onMiscTransmit != null) {
									var25 = new ScriptEvent();
									var25.widget = var12;
									var25.args = var12.onMiscTransmit;
									Client.scriptEvents.addFirst(var25);
								}

								var12.field4285 = Client.cycleCntr;
								if (var12.onKey != null) {
									for (var42 = 0; var42 < Client.field434; ++var42) {
										ScriptEvent var35 = new ScriptEvent();
										var35.widget = var12;
										var35.keyTyped = Client.field568[var42];
										var35.keyPressed = Client.field423[var42];
										var35.args = var12.onKey;
										Client.scriptEvents.addFirst(var35);
									}
								}

								ScriptEvent var34;
								int[] var41;
								if (var12.field4288 != null) {
									var41 = Client.indexCheck.method6129();

									for (var26 = 0; var26 < var41.length; ++var26) {
										var34 = new ScriptEvent();
										var34.widget = var12;
										var34.keyTyped = var41[var26];
										var34.args = var12.field4288;
										Client.scriptEvents.addFirst(var34);
									}
								}

								if (var12.field4289 != null) {
									var41 = Client.indexCheck.method6135();

									for (var26 = 0; var26 < var41.length; ++var26) {
										var34 = new ScriptEvent();
										var34.widget = var12;
										var34.keyTyped = var41[var26];
										var34.args = var12.field4289;
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
									class280.mousedOverWidgetIf1 = var0[var12.mouseOverRedirect];
								} else {
									class280.mousedOverWidgetIf1 = var12;
								}
							}

							if (var12.type == 8 && MouseHandler.MouseHandler_x >= var15 && MouseHandler.MouseHandler_y >= var16 && MouseHandler.MouseHandler_x < var17 && MouseHandler.MouseHandler_y < var18) {
								ChatChannel.field800 = var12;
							}

							if (var12.scrollHeight > var12.height * -171267385) {
								SequenceDefinition.method4851(var12, var29 + var12.width, var14, var12.height * -171267385, var12.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var12.type == 0) {
							updateInterface(var0, var12.field4228, var12.field4195, var12.id, var12.childIndex * -2066937045, var15, var16, var17, var18, var29 - var12.scrollX, var14 - var12.scrollY);
							if (var12.children != null) {
								updateInterface(var12.children, 0, var12.children.length - 1, var12.id, -1, var15, var16, var17, var18, var29 - var12.scrollX, var14 - var12.scrollY);
							}

							if (var12.childIndex * -2066937045 == -1) {
								InterfaceParent var32 = (InterfaceParent)Client.interfaceParents.get((long)var12.id);
								if (var32 != null) {
									if (var32.type == 0 && MouseHandler.MouseHandler_x >= var15 && MouseHandler.MouseHandler_y >= var16 && MouseHandler.MouseHandler_x < var17 && MouseHandler.MouseHandler_y < var18 && !Client.isMenuOpen) {
										for (ScriptEvent var33 = (ScriptEvent)Client.scriptEvents.last(); var33 != null; var33 = (ScriptEvent)Client.scriptEvents.previous()) {
											if (var33.field875) {
												var33.remove();
												var33.widget.field4314 = false;
											}
										}

										if (SecureRandomCallable.widgetDragDuration == 0) {
											Client.clickedWidget = null;
											Client.clickedWidgetParent = null;
										}

										if (!Client.isMenuOpen) {
											Frames.addCancelMenuEntry();
										}
									}

									Projection.updateRootInterface(var32.group, var15, var16, var17, var18, var29, var14);
								}
							}
						}
					}
				}
			}
		}

	}
}
