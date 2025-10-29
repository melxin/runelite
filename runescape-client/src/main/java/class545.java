import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ug")
public class class545 {
	@ObfuscatedName("aw")
	static int[] field5671;
	@ObfuscatedName("ap")
	public static int[] field5676;

	static {
		field5671 = new int[32768];

		for (int var0 = 0; var0 < 32768; ++var0) {
			int[] var1 = field5671;
			double var4 = (double)(var0 >> 10 & 31) / 31.0D;
			double var6 = (double)(var0 >> 5 & 31) / 31.0D;
			double var8 = (double)(var0 & 31) / 31.0D;
			double var10 = var4;
			if (var6 < var4) {
				var10 = var6;
			}

			if (var8 < var10) {
				var10 = var8;
			}

			double var12 = var4;
			if (var6 > var4) {
				var12 = var6;
			}

			if (var8 > var12) {
				var12 = var8;
			}

			double var14 = 0.0D;
			double var16 = 0.0D;
			double var18 = (var12 + var10) / 2.0D;
			if (var12 != var10) {
				if (var18 < 0.5D) {
					var16 = (var12 - var10) / (var10 + var12);
				}

				if (var18 >= 0.5D) {
					var16 = (var12 - var10) / (2.0D - var12 - var10);
				}

				if (var12 == var4) {
					var14 = (var6 - var8) / (var12 - var10);
				} else if (var6 == var12) {
					var14 = 2.0D + (var8 - var4) / (var12 - var10);
				} else if (var12 == var8) {
					var14 = (var4 - var6) / (var12 - var10) + 4.0D;
				}
			}

			int var20 = (int)(256.0D * var14 / 6.0D);
			var20 &= 255;
			double var21 = 256.0D * var16;
			if (var21 < 0.0D) {
				var21 = 0.0D;
			} else if (var21 > 255.0D) {
				var21 = 255.0D;
			}

			if (var18 > 0.7D) {
				var21 /= 2.0D;
				var21 = Math.floor(var21);
			}

			if (var18 > 0.75D) {
				var21 /= 2.0D;
				var21 = Math.floor(var21);
			}

			if (var18 > 0.85D) {
				var21 /= 2.0D;
				var21 = Math.floor(var21);
			}

			if (var18 > 0.95D) {
				var21 /= 2.0D;
				var21 = Math.floor(var21);
			}

			if (var18 > 0.995D) {
				var18 = 0.995D;
			}

			int var23 = (int)((double)(var20 / 4 * 8) + var21 / 32.0D);
			int var3 = (int)(128.0D * var18) + (var23 << 7);
			var1[var0] = var3;
		}

		method10894();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1563030653"
	)
	static void method10894() {
		if (field5676 == null) {
			field5676 = new int[65536];
			double var0 = 0.949999988079071D;

			for (int var2 = 0; var2 < 65536; ++var2) {
				double var3 = 0.0078125D + (double)(var2 >> 10 & 63) / 64.0D;
				double var5 = 0.0625D + (double)(var2 >> 7 & 7) / 8.0D;
				double var7 = (double)(var2 & 127) / 128.0D;
				double var9 = var7;
				double var11 = var7;
				double var13 = var7;
				if (var5 != 0.0D) {
					double var15;
					if (var7 < 0.5D) {
						var15 = (var5 + 1.0D) * var7;
					} else {
						var15 = var7 + var5 - var5 * var7;
					}

					double var17 = 2.0D * var7 - var15;
					double var19 = 0.3333333333333333D + var3;
					if (var19 > 1.0D) {
						--var19;
					}

					double var23 = var3 - 0.3333333333333333D;
					if (var23 < 0.0D) {
						++var23;
					}

					if (6.0D * var19 < 1.0D) {
						var9 = 6.0D * (var15 - var17) * var19 + var17;
					} else if (2.0D * var19 < 1.0D) {
						var9 = var15;
					} else if (3.0D * var19 < 2.0D) {
						var9 = 6.0D * (0.6666666666666666D - var19) * (var15 - var17) + var17;
					} else {
						var9 = var17;
					}

					if (var3 * 6.0D < 1.0D) {
						var11 = var17 + var3 * (var15 - var17) * 6.0D;
					} else if (var3 * 2.0D < 1.0D) {
						var11 = var15;
					} else if (3.0D * var3 < 2.0D) {
						var11 = var17 + (0.6666666666666666D - var3) * (var15 - var17) * 6.0D;
					} else {
						var11 = var17;
					}

					if (6.0D * var23 < 1.0D) {
						var13 = var17 + (var15 - var17) * 6.0D * var23;
					} else if (var23 * 2.0D < 1.0D) {
						var13 = var15;
					} else if (3.0D * var23 < 2.0D) {
						var13 = (0.6666666666666666D - var23) * (var15 - var17) * 6.0D + var17;
					} else {
						var13 = var17;
					}
				}

				var9 = Math.pow(var9, var0);
				var11 = Math.pow(var11, var0);
				var13 = Math.pow(var13, var0);
				int var25 = (int)(256.0D * var9);
				int var16 = (int)(var11 * 256.0D);
				int var26 = (int)(256.0D * var13);
				int var18 = var26 + (var16 << 8) + (var25 << 16);
				field5676[var2] = var18 & 16777215;
			}

		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "77"
	)
	public static int method10891(int var0) {
		return 255 - (var0 & 255);
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(ILcu;ZI)I",
		garbageValue = "-918025140"
	)
	static int method10890(int var0, Script var1, boolean var2) {
		return 2;
	}

	@ObfuscatedName("nc")
	@ObfuscatedSignature(
		descriptor = "([Lof;IIIIIIIIIII)V",
		garbageValue = "-27848124"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		for (int var11 = var1; var11 <= var2; ++var11) {
			Widget var12 = var0[var11];
			if (var12 != null && var3 == var12.parentId && var4 == var12.field4234 && (var12.method8171() || class191.getWidgetFlags(var12) != 0 || class69.getWidgetFlags2(var12) != 0 || var12 == Client.clickedWidgetParent)) {
				if (var12.isIf3) {
					if (class330.isComponentHidden(var12)) {
						continue;
					}
				} else if (var12.type == 0 && var12 != class330.mousedOverWidgetIf1 && class330.isComponentHidden(var12)) {
					continue;
				}

				if (var12.type == 11) {
					if (var12.method8191(class226.widgetDefinition, class164.urlRequester)) {
						if (var12.method8183()) {
							class376.invalidateWidget(var12);
							class339.revalidateWidgetScroll(var12.children, var12, true);
							var12.method8190().method5046().method5143(3, var12.method8190().method5017());
						}

						if (var12.field4245 != null) {
							ScriptEvent var13 = new ScriptEvent();
							var13.widget = var12;
							var13.args = var12.field4245;
							Client.scriptEvents.addFirst(var13);
						}
					}
				} else if (var12.type == 12 && var12.method8157(class226.widgetDefinition)) {
					class376.invalidateWidget(var12);
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
					var21 = var29 + var12.width * -1946208531;
					int var22 = var14 + var12.height * -905446999;
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
					var19 = var12.width * -1946208531 + var29;
					var20 = var14 + var12.height * -905446999;
					var15 = var29 > var5 ? var29 : var5;
					var16 = var14 > var6 ? var14 : var6;
					var17 = var19 < var7 ? var19 : var7;
					var18 = var20 < var8 ? var20 : var8;
				}

				if (var12 == Client.clickedWidget) {
					Client.field500 = true;
					Client.field484 = var29;
					Client.field527 = var14;
				}

				boolean var37 = false;
				if (var12.field4291) {
					switch(Client.field386) {
					case 0:
						var37 = true;
					case 1:
					default:
						break;
					case 2:
						if (Client.field333 == var12.id >>> 16) {
							var37 = true;
						}
						break;
					case 3:
						if (var12.id == Client.field333) {
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
									if (var30.field862) {
										var30.remove();
										var30.widget.field4356 = false;
									}
								}

								class30.method483();
								if (class201.widgetDragDuration == 0) {
									Client.clickedWidget = null;
									Client.clickedWidgetParent = null;
								}

								if (!Client.isMenuOpen) {
									class33.addCancelMenuEntry();
								}
							}
						} else if (var12.noScrollThrough && MouseHandler.MouseHandler_x >= var15 && MouseHandler.MouseHandler_y >= var16 && MouseHandler.MouseHandler_x < var17 && MouseHandler.MouseHandler_y < var18) {
							for (var30 = (ScriptEvent)Client.scriptEvents.last(); var30 != null; var30 = (ScriptEvent)Client.scriptEvents.previous()) {
								if (var30.field862 && var30.widget.onScroll == var30.args) {
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
							class62.addSceneMenuOptions(var20, var21, var15, var16);
						}
					} else if (var12.contentType == 1338) {
						class1.checkIfMinimapClicked(var12, var29, var14);
					} else {
						if (var12.contentType == 1400) {
							Skills.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var38, var29, var14, var12.width * -1946208531, var12.height * -905446999);
						}

						if (!Client.isMenuOpen && var38) {
							if (var12.contentType == 1400) {
								Skills.worldMap.addElementMenuOptions(var29, var14, var12.width * -1946208531, var12.height * -905446999, var20, var21);
							} else {
								WorldMapScaleHandler.Widget_addToMenu(var12);
							}
						}

						boolean var24;
						int var26;
						if (var37) {
							for (int var23 = 0; var23 < var12.field4263.length; ++var23) {
								var24 = false;
								boolean var31 = false;
								if (!var24 && var12.field4263[var23] != null) {
									for (var26 = 0; var26 < var12.field4263[var23].length; ++var26) {
										boolean var27 = false;
										if (var12.field4372 != null) {
											var27 = Client.indexCheck.isValidIndexInRange(var12.field4263[var23][var26]);
										}

										if (class142.method3885(var12.field4263[var23][var26]) || var27) {
											var24 = true;
											if (var12.field4372 != null && var12.field4372[var23] > Client.cycle) {
												break;
											}

											byte var36 = var12.field4293[var23][var26];
											if (var36 == 0 || ((var36 & 8) == 0 || !Client.indexCheck.isValidIndexInRange(86) && !Client.indexCheck.isValidIndexInRange(82) && !Client.indexCheck.isValidIndexInRange(81)) && ((var36 & 2) == 0 || Client.indexCheck.isValidIndexInRange(86)) && ((var36 & 1) == 0 || Client.indexCheck.isValidIndexInRange(82)) && ((var36 & 4) == 0 || Client.indexCheck.isValidIndexInRange(81))) {
												var31 = true;
												break;
											}
										}
									}
								}

								if (var31) {
									if (var23 < 10) {
										FontName.widgetDefaultMenuAction(var23 + 1, var12.id, var12.childIndex * 2077538819, var12.itemId, "");
									} else if (var23 == 10) {
										class62.method2177();
										class406.method8489(var12.id, var12.childIndex * 2077538819, LoginPacket.Widget_unpackTargetMask(class191.getWidgetFlags(var12)), var12.itemId);
										Client.selectedSpellActionName = ItemComposition.Widget_getSpellActionName(var12);
										if (Client.selectedSpellActionName == null) {
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var12.dataText + class144.colorStartTag(16777215);
									}

									var26 = var12.field4294[var23];
									if (var12.field4372 == null) {
										var12.field4372 = new int[var12.field4263.length];
									}

									if (var12.field4295 == null) {
										var12.field4295 = new int[var12.field4263.length];
									}

									if (var26 != 0) {
										if (var12.field4372[var23] == 0) {
											var12.field4372[var23] = var26 + Client.cycle + var12.field4295[var23];
										} else {
											var12.field4372[var23] = var26 + Client.cycle;
										}
									} else {
										var12.field4372[var23] = Integer.MAX_VALUE;
									}
								}

								if (!var24 && var12.field4372 != null) {
									var12.field4372[var23] = 0;
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
							if ((MouseHandler.MouseHandler_currentButton == 1 || !UrlRequest.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var38) {
								var39 = true;
							}

							var24 = false;
							if ((MouseHandler.MouseHandler_lastButton == 1 || !UrlRequest.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var15 && MouseHandler.MouseHandler_lastPressedY >= var16 && MouseHandler.MouseHandler_lastPressedX < var17 && MouseHandler.MouseHandler_lastPressedY < var18) {
								var24 = true;
							}

							if (var24) {
								class141.clickWidget(var12, MouseHandler.MouseHandler_lastPressedX - var29, MouseHandler.MouseHandler_lastPressedY - var14);
							}

							if (var12.method8239()) {
								if (var24) {
									Client.field400.addFirst(new class279(0, MouseHandler.MouseHandler_x - var29, MouseHandler.MouseHandler_y - var14, var12));
								}

								if (var39) {
									Client.field400.addFirst(new class279(1, MouseHandler.MouseHandler_x - var29, MouseHandler.MouseHandler_y - var14, var12));
								}
							}

							if (var12.contentType == 1400) {
								Skills.worldMap.method11007(var20, var21, var38 & var39, var38 & var24);
							}

							if (Client.clickedWidget != null && var12 != Client.clickedWidget && var38 && class82.method2890(class191.getWidgetFlags(var12))) {
								Client.draggedOnWidget = var12;
							}

							if (var12 == Client.clickedWidgetParent) {
								Client.field465 = true;
								Client.field411 = var29;
								Client.field292 = var14;
							}

							if (var12.hasListener) {
								ScriptEvent var25;
								if (var38 && Client.mouseWheelRotation != 0 && var12.onScroll != null) {
									var25 = new ScriptEvent();
									var25.field862 = true;
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

								if (!var12.field4217 && var24) {
									var12.field4217 = true;
									if (var12.onClick != null) {
										var25 = new ScriptEvent();
										var25.field862 = true;
										var25.widget = var12;
										var25.mouseX = MouseHandler.MouseHandler_lastPressedX - var29;
										var25.mouseY = MouseHandler.MouseHandler_lastPressedY - var14;
										var25.args = var12.onClick;
										Client.scriptEvents.addFirst(var25);
									}
								}

								if (var12.field4217 && var39 && var12.onClickRepeat != null) {
									var25 = new ScriptEvent();
									var25.field862 = true;
									var25.widget = var12;
									var25.mouseX = MouseHandler.MouseHandler_x - var29;
									var25.mouseY = MouseHandler.MouseHandler_y - var14;
									var25.args = var12.onClickRepeat;
									Client.scriptEvents.addFirst(var25);
								}

								if (var12.field4217 && !var39) {
									var12.field4217 = false;
									if (var12.onRelease != null) {
										var25 = new ScriptEvent();
										var25.field862 = true;
										var25.widget = var12;
										var25.mouseX = MouseHandler.MouseHandler_x - var29;
										var25.mouseY = MouseHandler.MouseHandler_y - var14;
										var25.args = var12.onRelease;
										Client.scriptEvents3.addFirst(var25);
									}
								}

								if (var39 && var12.onHold != null) {
									var25 = new ScriptEvent();
									var25.field862 = true;
									var25.widget = var12;
									var25.mouseX = MouseHandler.MouseHandler_x - var29;
									var25.mouseY = MouseHandler.MouseHandler_y - var14;
									var25.args = var12.onHold;
									Client.scriptEvents.addFirst(var25);
								}

								if (!var12.field4356 && var38) {
									var12.field4356 = true;
									if (var12.onMouseOver != null) {
										var25 = new ScriptEvent();
										var25.field862 = true;
										var25.widget = var12;
										var25.mouseX = MouseHandler.MouseHandler_x - var29;
										var25.mouseY = MouseHandler.MouseHandler_y - var14;
										var25.args = var12.onMouseOver;
										Client.scriptEvents.addFirst(var25);
									}
								}

								if (var12.field4356 && var38 && var12.onMouseRepeat != null) {
									var25 = new ScriptEvent();
									var25.field862 = true;
									var25.widget = var12;
									var25.mouseX = MouseHandler.MouseHandler_x - var29;
									var25.mouseY = MouseHandler.MouseHandler_y - var14;
									var25.args = var12.onMouseRepeat;
									Client.scriptEvents.addFirst(var25);
								}

								if (var12.field4356 && !var38) {
									var12.field4356 = false;
									if (var12.onMouseLeave != null) {
										var25 = new ScriptEvent();
										var25.field862 = true;
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
								if (var12.onVarTransmit != null && Client.changedVarpCount > var12.field4227) {
									if (var12.varTransmitTriggers != null && Client.changedVarpCount - var12.field4227 <= 32) {
										label841:
										for (var42 = var12.field4227; var42 < Client.changedVarpCount; ++var42) {
											var26 = Client.changedVarps[var42 & 31];

											for (var40 = 0; var40 < var12.varTransmitTriggers.length; ++var40) {
												if (var26 == var12.varTransmitTriggers[var40]) {
													var28 = new ScriptEvent();
													var28.widget = var12;
													var28.args = var12.onVarTransmit;
													Client.scriptEvents.addFirst(var28);
													break label841;
												}
											}
										}
									} else {
										var25 = new ScriptEvent();
										var25.widget = var12;
										var25.args = var12.onVarTransmit;
										Client.scriptEvents.addFirst(var25);
									}

									var12.field4227 = Client.changedVarpCount;
								}

								if (var12.onInvTransmit != null && Client.changedItemsCount > var12.field4360) {
									if (var12.invTransmitTriggers != null && Client.changedItemsCount - var12.field4360 <= 32) {
										label817:
										for (var42 = var12.field4360; var42 < Client.changedItemsCount; ++var42) {
											var26 = Client.changedItemContainers[var42 & 31];

											for (var40 = 0; var40 < var12.invTransmitTriggers.length; ++var40) {
												if (var26 == var12.invTransmitTriggers[var40]) {
													var28 = new ScriptEvent();
													var28.widget = var12;
													var28.args = var12.onInvTransmit;
													Client.scriptEvents.addFirst(var28);
													break label817;
												}
											}
										}
									} else {
										var25 = new ScriptEvent();
										var25.widget = var12;
										var25.args = var12.onInvTransmit;
										Client.scriptEvents.addFirst(var25);
									}

									var12.field4360 = Client.changedItemsCount;
								}

								if (var12.onStatTransmit != null && Client.changedSkillsCount > var12.field4361) {
									if (var12.statTransmitTriggers != null && Client.changedSkillsCount - var12.field4361 <= 32) {
										label793:
										for (var42 = var12.field4361; var42 < Client.changedSkillsCount; ++var42) {
											var26 = Client.changedSkills[var42 & 31];

											for (var40 = 0; var40 < var12.statTransmitTriggers.length; ++var40) {
												if (var26 == var12.statTransmitTriggers[var40]) {
													var28 = new ScriptEvent();
													var28.widget = var12;
													var28.args = var12.onStatTransmit;
													Client.scriptEvents.addFirst(var28);
													break label793;
												}
											}
										}
									} else {
										var25 = new ScriptEvent();
										var25.widget = var12;
										var25.args = var12.onStatTransmit;
										Client.scriptEvents.addFirst(var25);
									}

									var12.field4361 = Client.changedSkillsCount;
								}

								if (Client.chatCycle > var12.field4358 && var12.onChatTransmit != null) {
									var25 = new ScriptEvent();
									var25.widget = var12;
									var25.args = var12.onChatTransmit;
									Client.scriptEvents.addFirst(var25);
								}

								if (Client.field452 > var12.field4358 && var12.onFriendTransmit != null) {
									var25 = new ScriptEvent();
									var25.widget = var12;
									var25.args = var12.onFriendTransmit;
									Client.scriptEvents.addFirst(var25);
								}

								if (Client.field513 > var12.field4358 && var12.onClanTransmit != null) {
									var25 = new ScriptEvent();
									var25.widget = var12;
									var25.args = var12.onClanTransmit;
									Client.scriptEvents.addFirst(var25);
								}

								if (Client.field514 > var12.field4358 && var12.field4336 != null) {
									var25 = new ScriptEvent();
									var25.widget = var12;
									var25.args = var12.field4336;
									Client.scriptEvents.addFirst(var25);
								}

								if (Client.field515 > var12.field4358 && var12.field4335 != null) {
									var25 = new ScriptEvent();
									var25.widget = var12;
									var25.args = var12.field4335;
									Client.scriptEvents.addFirst(var25);
								}

								if (Client.field295 > var12.field4358 && var12.onStockTransmit != null) {
									var25 = new ScriptEvent();
									var25.widget = var12;
									var25.args = var12.onStockTransmit;
									Client.scriptEvents.addFirst(var25);
								}

								if (Client.field517 > var12.field4358 && var12.field4341 != null) {
									var25 = new ScriptEvent();
									var25.widget = var12;
									var25.args = var12.field4341;
									Client.scriptEvents.addFirst(var25);
								}

								if (Client.field338 > var12.field4358 && var12.onMiscTransmit != null) {
									var25 = new ScriptEvent();
									var25.widget = var12;
									var25.args = var12.onMiscTransmit;
									Client.scriptEvents.addFirst(var25);
								}

								var12.field4358 = Client.cycleCntr;
								if (var12.onKey != null) {
									for (var42 = 0; var42 < Client.field405; ++var42) {
										ScriptEvent var35 = new ScriptEvent();
										var35.widget = var12;
										var35.keyTyped = Client.field407[var42];
										var35.keyPressed = Client.field424[var42];
										var35.args = var12.onKey;
										Client.scriptEvents.addFirst(var35);
									}
								}

								ScriptEvent var34;
								int[] var41;
								if (var12.field4330 != null) {
									var41 = Client.indexCheck.method6305();

									for (var26 = 0; var26 < var41.length; ++var26) {
										var34 = new ScriptEvent();
										var34.widget = var12;
										var34.keyTyped = var41[var26];
										var34.args = var12.field4330;
										Client.scriptEvents.addFirst(var34);
									}
								}

								if (var12.field4331 != null) {
									var41 = Client.indexCheck.method6320();

									for (var26 = 0; var26 < var41.length; ++var26) {
										var34 = new ScriptEvent();
										var34.widget = var12;
										var34.keyTyped = var41[var26];
										var34.args = var12.field4331;
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
									class330.mousedOverWidgetIf1 = var0[var12.mouseOverRedirect];
								} else {
									class330.mousedOverWidgetIf1 = var12;
								}
							}

							if (var12.type == 8 && MouseHandler.MouseHandler_x >= var15 && MouseHandler.MouseHandler_y >= var16 && MouseHandler.MouseHandler_x < var17 && MouseHandler.MouseHandler_y < var18) {
								WorldView.field1149 = var12;
							}

							if (var12.scrollHeight > var12.height * -905446999) {
								class339.method7286(var12, var29 + var12.width * -1946208531, var14, var12.height * -905446999, var12.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var12.type == 0) {
							updateInterface(var0, var12.field4236, var12.field4241, var12.id, var12.childIndex * 2077538819, var15, var16, var17, var18, var29 - var12.scrollX, var14 - var12.scrollY);
							if (var12.children != null) {
								updateInterface(var12.children, 0, var12.children.length - 1, var12.id, -1, var15, var16, var17, var18, var29 - var12.scrollX, var14 - var12.scrollY);
							}

							if (var12.childIndex * 2077538819 == -1) {
								InterfaceParent var32 = (InterfaceParent)Client.interfaceParents.get((long)var12.id);
								if (var32 != null) {
									if (var32.type == 0 && MouseHandler.MouseHandler_x >= var15 && MouseHandler.MouseHandler_y >= var16 && MouseHandler.MouseHandler_x < var17 && MouseHandler.MouseHandler_y < var18 && !Client.isMenuOpen) {
										for (ScriptEvent var33 = (ScriptEvent)Client.scriptEvents.last(); var33 != null; var33 = (ScriptEvent)Client.scriptEvents.previous()) {
											if (var33.field862) {
												var33.remove();
												var33.widget.field4356 = false;
											}
										}

										if (class201.widgetDragDuration == 0) {
											Client.clickedWidget = null;
											Client.clickedWidgetParent = null;
										}

										if (!Client.isMenuOpen) {
											class33.addCancelMenuEntry();
										}
									}

									PcmPlayer.updateRootInterface(var32.group, var15, var16, var17, var18, var29, var14);
								}
							}
						}
					}
				}
			}
		}

	}
}
