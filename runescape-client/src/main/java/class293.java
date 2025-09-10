import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ly")
public class class293 implements WorldMapSection {
	@ObfuscatedName("jn")
	@ObfuscatedGetter(
		intValue = 1851989185
	)
	static int field3392;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -286391635
	)
	int field3393;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1102309851
	)
	int field3383;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -587744763
	)
	int field3389;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1730320183
	)
	int field3385;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1399519995
	)
	int field3394;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1334418551
	)
	int field3387;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -341652159
	)
	int field3388;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1204110005
	)
	int field3382;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1064668053
	)
	int field3390;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1847442727
	)
	int field3391;

	class293() {
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lll;I)V",
		garbageValue = "1896416407"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field3394) {
			var1.regionLowX = this.field3394;
		}

		if (var1.regionHighX < this.field3394) {
			var1.regionHighX = this.field3394;
		}

		if (var1.regionLowY > this.field3387) {
			var1.regionLowY = this.field3387;
		}

		if (var1.regionHighY < this.field3387) {
			var1.regionHighY = this.field3387;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-739948834"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field3393 && var1 < this.field3393 + this.field3383) {
			return var2 >= (this.field3389 << 6) + (this.field3388 << 3) && var2 <= (this.field3389 << 6) + (this.field3388 << 3) + 7 && var3 >= (this.field3385 << 6) + (this.field3382 << 3) && var3 <= (this.field3385 << 6) + (this.field3382 << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-51"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field3394 << 6) + (this.field3390 << 3) && var1 <= (this.field3394 << 6) + (this.field3390 << 3) + 7 && var2 >= (this.field3387 << 6) + (this.field3391 << 3) && var2 <= (this.field3387 << 6) + (this.field3391 << 3) + 7;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "-2061697618"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.field3394 * 64 - this.field3389 * 64 + var2 + (this.field3390 * 8 - this.field3388 * 8), var3 + (this.field3387 * 64 - this.field3385 * 64) + (this.field3391 * 8 - this.field3382 * 8)};
			return var4;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lna;",
		garbageValue = "1"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.field3389 * 64 - this.field3394 * 64 + (this.field3388 * 8 - this.field3390 * 8) + var1;
			int var4 = this.field3385 * 64 - this.field3387 * 64 + var2 + (this.field3382 * 8 - this.field3391 * 8);
			return new Coord(this.field3393, var3, var4);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lwb;I)V",
		garbageValue = "-1979822224"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field3393 = var1.readUnsignedByte();
		this.field3383 = var1.readUnsignedByte();
		this.field3389 = var1.readUnsignedShort();
		this.field3388 = var1.readUnsignedByte();
		this.field3385 = var1.readUnsignedShort();
		this.field3382 = var1.readUnsignedByte();
		this.field3394 = var1.readUnsignedShort();
		this.field3390 = var1.readUnsignedByte();
		this.field3387 = var1.readUnsignedShort();
		this.field3391 = var1.readUnsignedByte();
		this.method6714();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "34"
	)
	void method6714() {
	}

	@ObfuscatedName("nf")
	@ObfuscatedSignature(
		descriptor = "([Loi;IIIIIIIIIII)V",
		garbageValue = "2018430265"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		for (int var11 = var1; var11 <= var2; ++var11) {
			Widget var12 = var0[var11];
			if (var12 != null && var3 == var12.parentId && var4 == var12.field4165 && (var12.method7948() || DirectByteArrayCopier.getWidgetFlags(var12) != 0 || class388.getWidgetFlags2(var12) != 0 || var12 == Client.clickedWidgetParent)) {
				if (var12.isIf3) {
					if (class364.isComponentHidden(var12)) {
						continue;
					}
				} else if (var12.type == 0 && var12 != class343.mousedOverWidgetIf1 && class364.isComponentHidden(var12)) {
					continue;
				}

				if (var12.type == 11) {
					if (var12.method7968(UrlRequester.widgetDefinition, class114.urlRequester)) {
						if (var12.method8100()) {
							class89.invalidateWidget(var12);
							Canvas.revalidateWidgetScroll(var12.children, var12, true);
							var12.method7967().method5816().method5962(3, var12.method7967().method5825());
						}

						if (var12.field4176 != null) {
							ScriptEvent var13 = new ScriptEvent();
							var13.widget = var12;
							var13.args = var12.field4176;
							Client.scriptEvents.addFirst(var13);
						}
					}
				} else if (var12.type == 12 && var12.method8091(UrlRequester.widgetDefinition)) {
					class89.invalidateWidget(var12);
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
					var21 = var29 + var12.width * 469894397;
					int var22 = var12.height * 1156037777 + var14;
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
					var19 = var29 + var12.width * 469894397;
					var20 = var12.height * 1156037777 + var14;
					var15 = var29 > var5 ? var29 : var5;
					var16 = var14 > var6 ? var14 : var6;
					var17 = var19 < var7 ? var19 : var7;
					var18 = var20 < var8 ? var20 : var8;
				}

				if (var12 == Client.clickedWidget) {
					Client.field543 = true;
					Client.field544 = var29;
					Client.field545 = var14;
				}

				boolean var37 = false;
				if (var12.field4222) {
					switch(Client.field324) {
					case 0:
						var37 = true;
					case 1:
					default:
						break;
					case 2:
						if (Client.field573 == var12.id >>> 16) {
							var37 = true;
						}
						break;
					case 3:
						if (var12.id == Client.field573) {
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
									if (var30.field899) {
										var30.remove();
										var30.widget.field4265 = false;
									}
								}

								class395.method8231();
								if (PendingSpawn.widgetDragDuration == 0) {
									Client.clickedWidget = null;
									Client.clickedWidgetParent = null;
								}

								if (!Client.isMenuOpen) {
									AsyncRestClient.addCancelMenuEntry();
								}
							}
						} else if (var12.noScrollThrough && MouseHandler.MouseHandler_x >= var15 && MouseHandler.MouseHandler_y >= var16 && MouseHandler.MouseHandler_x < var17 && MouseHandler.MouseHandler_y < var18) {
							for (var30 = (ScriptEvent)Client.scriptEvents.last(); var30 != null; var30 = (ScriptEvent)Client.scriptEvents.previous()) {
								if (var30.field899 && var30.widget.onScroll == var30.args) {
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
							class67.addSceneMenuOptions(var20, var21, var15, var16);
						}
					} else if (var12.contentType == 1338) {
						class4.checkIfMinimapClicked(var12, var29, var14);
					} else {
						if (var12.contentType == 1400) {
							DynamicObject.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var38, var29, var14, var12.width * 469894397, var12.height * 1156037777);
						}

						if (!Client.isMenuOpen && var38) {
							if (var12.contentType == 1400) {
								DynamicObject.worldMap.addElementMenuOptions(var29, var14, var12.width * 469894397, var12.height * 1156037777, var20, var21);
							} else {
								class145.Widget_addToMenu(var12);
							}
						}

						boolean var24;
						int var26;
						if (var37) {
							for (int var23 = 0; var23 < var12.field4223.length; ++var23) {
								var24 = false;
								boolean var31 = false;
								if (!var24 && var12.field4223[var23] != null) {
									for (var26 = 0; var26 < var12.field4223[var23].length; ++var26) {
										boolean var27 = false;
										if (var12.field4295 != null) {
											var27 = Client.indexCheck.isValidIndexInRange(var12.field4223[var23][var26]);
										}

										if (MouseHandler.method727(var12.field4223[var23][var26]) || var27) {
											var24 = true;
											if (var12.field4295 != null && var12.field4295[var23] > Client.cycle) {
												break;
											}

											byte var36 = var12.field4224[var23][var26];
											if (var36 == 0 || ((var36 & 8) == 0 || !Client.indexCheck.isValidIndexInRange(86) && !Client.indexCheck.isValidIndexInRange(82) && !Client.indexCheck.isValidIndexInRange(81)) && ((var36 & 2) == 0 || Client.indexCheck.isValidIndexInRange(86)) && ((var36 & 1) == 0 || Client.indexCheck.isValidIndexInRange(82)) && ((var36 & 4) == 0 || Client.indexCheck.isValidIndexInRange(81))) {
												var31 = true;
												break;
											}
										}
									}
								}

								if (var31) {
									if (var23 < 10) {
										WorldMapScaleHandler.widgetDefaultMenuAction(var23 + 1, var12.id, var12.childIndex * -217986249, var12.itemId, "");
									} else if (var23 == 10) {
										Timer.method8270();
										Message.method767(var12.id, var12.childIndex * -217986249, class537.Widget_unpackTargetMask(DirectByteArrayCopier.getWidgetFlags(var12)), var12.itemId);
										Client.selectedSpellActionName = WorldMapLabelSize.Widget_getSpellActionName(var12);
										if (Client.selectedSpellActionName == null) {
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var12.dataText + class134.colorStartTag(16777215);
									}

									var26 = var12.field4220[var23];
									if (var12.field4295 == null) {
										var12.field4295 = new int[var12.field4223.length];
									}

									if (var12.field4233 == null) {
										var12.field4233 = new int[var12.field4223.length];
									}

									if (var26 != 0) {
										if (var12.field4295[var23] == 0) {
											var12.field4295[var23] = var26 + Client.cycle + var12.field4233[var23];
										} else {
											var12.field4295[var23] = var26 + Client.cycle;
										}
									} else {
										var12.field4295[var23] = Integer.MAX_VALUE;
									}
								}

								if (!var24 && var12.field4295 != null) {
									var12.field4295[var23] = 0;
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
							if ((MouseHandler.MouseHandler_currentButton == 1 || !class423.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var38) {
								var39 = true;
							}

							var24 = false;
							if ((MouseHandler.MouseHandler_lastButton == 1 || !class423.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var15 && MouseHandler.MouseHandler_lastPressedY >= var16 && MouseHandler.MouseHandler_lastPressedX < var17 && MouseHandler.MouseHandler_lastPressedY < var18) {
								var24 = true;
							}

							if (var24) {
								class584.clickWidget(var12, MouseHandler.MouseHandler_lastPressedX - var29, MouseHandler.MouseHandler_lastPressedY - var14);
							}

							if (var12.method7945()) {
								if (var24) {
									Client.field437.addFirst(new class273(0, MouseHandler.MouseHandler_x - var29, MouseHandler.MouseHandler_y - var14, var12));
								}

								if (var39) {
									Client.field437.addFirst(new class273(1, MouseHandler.MouseHandler_x - var29, MouseHandler.MouseHandler_y - var14, var12));
								}
							}

							if (var12.contentType == 1400) {
								DynamicObject.worldMap.method10641(var20, var21, var38 & var39, var38 & var24);
							}

							if (Client.clickedWidget != null && var12 != Client.clickedWidget && var38 && class227.method5046(DirectByteArrayCopier.getWidgetFlags(var12))) {
								Client.draggedOnWidget = var12;
							}

							if (var12 == Client.clickedWidgetParent) {
								Client.field540 = true;
								Client.field541 = var29;
								Client.field542 = var14;
							}

							if (var12.hasListener) {
								ScriptEvent var25;
								if (var38 && Client.mouseWheelRotation != 0 && var12.onScroll != null) {
									var25 = new ScriptEvent();
									var25.field899 = true;
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

								if (!var12.field4171 && var24) {
									var12.field4171 = true;
									if (var12.onClick != null) {
										var25 = new ScriptEvent();
										var25.field899 = true;
										var25.widget = var12;
										var25.mouseX = MouseHandler.MouseHandler_lastPressedX - var29;
										var25.mouseY = MouseHandler.MouseHandler_lastPressedY - var14;
										var25.args = var12.onClick;
										Client.scriptEvents.addFirst(var25);
									}
								}

								if (var12.field4171 && var39 && var12.onClickRepeat != null) {
									var25 = new ScriptEvent();
									var25.field899 = true;
									var25.widget = var12;
									var25.mouseX = MouseHandler.MouseHandler_x - var29;
									var25.mouseY = MouseHandler.MouseHandler_y - var14;
									var25.args = var12.onClickRepeat;
									Client.scriptEvents.addFirst(var25);
								}

								if (var12.field4171 && !var39) {
									var12.field4171 = false;
									if (var12.onRelease != null) {
										var25 = new ScriptEvent();
										var25.field899 = true;
										var25.widget = var12;
										var25.mouseX = MouseHandler.MouseHandler_x - var29;
										var25.mouseY = MouseHandler.MouseHandler_y - var14;
										var25.args = var12.onRelease;
										Client.scriptEvents3.addFirst(var25);
									}
								}

								if (var39 && var12.onHold != null) {
									var25 = new ScriptEvent();
									var25.field899 = true;
									var25.widget = var12;
									var25.mouseX = MouseHandler.MouseHandler_x - var29;
									var25.mouseY = MouseHandler.MouseHandler_y - var14;
									var25.args = var12.onHold;
									Client.scriptEvents.addFirst(var25);
								}

								if (!var12.field4265 && var38) {
									var12.field4265 = true;
									if (var12.onMouseOver != null) {
										var25 = new ScriptEvent();
										var25.field899 = true;
										var25.widget = var12;
										var25.mouseX = MouseHandler.MouseHandler_x - var29;
										var25.mouseY = MouseHandler.MouseHandler_y - var14;
										var25.args = var12.onMouseOver;
										Client.scriptEvents.addFirst(var25);
									}
								}

								if (var12.field4265 && var38 && var12.onMouseRepeat != null) {
									var25 = new ScriptEvent();
									var25.field899 = true;
									var25.widget = var12;
									var25.mouseX = MouseHandler.MouseHandler_x - var29;
									var25.mouseY = MouseHandler.MouseHandler_y - var14;
									var25.args = var12.onMouseRepeat;
									Client.scriptEvents.addFirst(var25);
								}

								if (var12.field4265 && !var38) {
									var12.field4265 = false;
									if (var12.onMouseLeave != null) {
										var25 = new ScriptEvent();
										var25.field899 = true;
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
								if (var12.onVarTransmit != null && Client.changedVarpCount > var12.field4290) {
									if (var12.varTransmitTriggers != null && Client.changedVarpCount - var12.field4290 <= 32) {
										label842:
										for (var42 = var12.field4290; var42 < Client.changedVarpCount; ++var42) {
											var26 = Client.changedVarps[var42 & 31];

											for (var40 = 0; var40 < var12.varTransmitTriggers.length; ++var40) {
												if (var26 == var12.varTransmitTriggers[var40]) {
													var28 = new ScriptEvent();
													var28.widget = var12;
													var28.args = var12.onVarTransmit;
													Client.scriptEvents.addFirst(var28);
													break label842;
												}
											}
										}
									} else {
										var25 = new ScriptEvent();
										var25.widget = var12;
										var25.args = var12.onVarTransmit;
										Client.scriptEvents.addFirst(var25);
									}

									var12.field4290 = Client.changedVarpCount;
								}

								if (var12.onInvTransmit != null && Client.changedItemsCount > var12.field4287) {
									if (var12.invTransmitTriggers != null && Client.changedItemsCount - var12.field4287 <= 32) {
										label818:
										for (var42 = var12.field4287; var42 < Client.changedItemsCount; ++var42) {
											var26 = Client.changedItemContainers[var42 & 31];

											for (var40 = 0; var40 < var12.invTransmitTriggers.length; ++var40) {
												if (var26 == var12.invTransmitTriggers[var40]) {
													var28 = new ScriptEvent();
													var28.widget = var12;
													var28.args = var12.onInvTransmit;
													Client.scriptEvents.addFirst(var28);
													break label818;
												}
											}
										}
									} else {
										var25 = new ScriptEvent();
										var25.widget = var12;
										var25.args = var12.onInvTransmit;
										Client.scriptEvents.addFirst(var25);
									}

									var12.field4287 = Client.changedItemsCount;
								}

								if (var12.onStatTransmit != null && Client.changedSkillsCount > var12.field4292) {
									if (var12.statTransmitTriggers != null && Client.changedSkillsCount - var12.field4292 <= 32) {
										label794:
										for (var42 = var12.field4292; var42 < Client.changedSkillsCount; ++var42) {
											var26 = Client.changedSkills[var42 & 31];

											for (var40 = 0; var40 < var12.statTransmitTriggers.length; ++var40) {
												if (var26 == var12.statTransmitTriggers[var40]) {
													var28 = new ScriptEvent();
													var28.widget = var12;
													var28.args = var12.onStatTransmit;
													Client.scriptEvents.addFirst(var28);
													break label794;
												}
											}
										}
									} else {
										var25 = new ScriptEvent();
										var25.widget = var12;
										var25.args = var12.onStatTransmit;
										Client.scriptEvents.addFirst(var25);
									}

									var12.field4292 = Client.changedSkillsCount;
								}

								if (Client.chatCycle > var12.field4289 && var12.onChatTransmit != null) {
									var25 = new ScriptEvent();
									var25.widget = var12;
									var25.args = var12.onChatTransmit;
									Client.scriptEvents.addFirst(var25);
								}

								if (Client.field555 > var12.field4289 && var12.onFriendTransmit != null) {
									var25 = new ScriptEvent();
									var25.widget = var12;
									var25.args = var12.onFriendTransmit;
									Client.scriptEvents.addFirst(var25);
								}

								if (Client.field363 > var12.field4289 && var12.onClanTransmit != null) {
									var25 = new ScriptEvent();
									var25.widget = var12;
									var25.args = var12.onClanTransmit;
									Client.scriptEvents.addFirst(var25);
								}

								if (Client.field352 > var12.field4289 && var12.field4280 != null) {
									var25 = new ScriptEvent();
									var25.widget = var12;
									var25.args = var12.field4280;
									Client.scriptEvents.addFirst(var25);
								}

								if (Client.field484 > var12.field4289 && var12.field4266 != null) {
									var25 = new ScriptEvent();
									var25.widget = var12;
									var25.args = var12.field4266;
									Client.scriptEvents.addFirst(var25);
								}

								if (Client.field559 > var12.field4289 && var12.onStockTransmit != null) {
									var25 = new ScriptEvent();
									var25.widget = var12;
									var25.args = var12.onStockTransmit;
									Client.scriptEvents.addFirst(var25);
								}

								if (Client.field560 > var12.field4289 && var12.field4273 != null) {
									var25 = new ScriptEvent();
									var25.widget = var12;
									var25.args = var12.field4273;
									Client.scriptEvents.addFirst(var25);
								}

								if (Client.field561 > var12.field4289 && var12.onMiscTransmit != null) {
									var25 = new ScriptEvent();
									var25.widget = var12;
									var25.args = var12.onMiscTransmit;
									Client.scriptEvents.addFirst(var25);
								}

								var12.field4289 = Client.cycleCntr;
								if (var12.onKey != null) {
									for (var42 = 0; var42 < Client.field442; ++var42) {
										ScriptEvent var35 = new ScriptEvent();
										var35.widget = var12;
										var35.keyTyped = Client.field511[var42];
										var35.keyPressed = Client.field443[var42];
										var35.args = var12.onKey;
										Client.scriptEvents.addFirst(var35);
									}
								}

								ScriptEvent var34;
								int[] var41;
								if (var12.field4261 != null) {
									var41 = Client.indexCheck.method6135();

									for (var26 = 0; var26 < var41.length; ++var26) {
										var34 = new ScriptEvent();
										var34.widget = var12;
										var34.keyTyped = var41[var26];
										var34.args = var12.field4261;
										Client.scriptEvents.addFirst(var34);
									}
								}

								if (var12.field4159 != null) {
									var41 = Client.indexCheck.method6126();

									for (var26 = 0; var26 < var41.length; ++var26) {
										var34 = new ScriptEvent();
										var34.widget = var12;
										var34.keyTyped = var41[var26];
										var34.args = var12.field4159;
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
									class343.mousedOverWidgetIf1 = var0[var12.mouseOverRedirect];
								} else {
									class343.mousedOverWidgetIf1 = var12;
								}
							}

							if (var12.type == 8 && MouseHandler.MouseHandler_x >= var15 && MouseHandler.MouseHandler_y >= var16 && MouseHandler.MouseHandler_x < var17 && MouseHandler.MouseHandler_y < var18) {
								class134.field1624 = var12;
							}

							if (var12.scrollHeight > var12.height * 1156037777) {
								class134.method3620(var12, var29 + var12.width * 469894397, var14, var12.height * 1156037777, var12.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var12.type == 0) {
							updateInterface(var0, var12.field4248, var12.field4214, var12.id, var12.childIndex * -217986249, var15, var16, var17, var18, var29 - var12.scrollX, var14 - var12.scrollY);
							if (var12.children != null) {
								updateInterface(var12.children, 0, var12.children.length - 1, var12.id, -1, var15, var16, var17, var18, var29 - var12.scrollX, var14 - var12.scrollY);
							}

							if (var12.childIndex * -217986249 == -1) {
								InterfaceParent var32 = (InterfaceParent)Client.interfaceParents.get((long)var12.id);
								if (var32 != null) {
									if (var32.type == 0 && MouseHandler.MouseHandler_x >= var15 && MouseHandler.MouseHandler_y >= var16 && MouseHandler.MouseHandler_x < var17 && MouseHandler.MouseHandler_y < var18 && !Client.isMenuOpen) {
										for (ScriptEvent var33 = (ScriptEvent)Client.scriptEvents.last(); var33 != null; var33 = (ScriptEvent)Client.scriptEvents.previous()) {
											if (var33.field899) {
												var33.remove();
												var33.widget.field4265 = false;
											}
										}

										if (PendingSpawn.widgetDragDuration == 0) {
											Client.clickedWidget = null;
											Client.clickedWidgetParent = null;
										}

										if (!Client.isMenuOpen) {
											AsyncRestClient.addCancelMenuEntry();
										}
									}

									WorldMapLabelSize.updateRootInterface(var32.group, var15, var16, var17, var18, var29, var14);
								}
							}
						}
					}
				}
			}
		}

	}
}
