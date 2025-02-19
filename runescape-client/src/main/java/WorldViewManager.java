import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
@Implements("WorldViewManager")
public class WorldViewManager implements Iterable {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	@Export("worldView")
	WorldView worldView;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lqv;"
	)
	@Export("hashTable")
	final IterableNodeHashTable hashTable;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1588511189
	)
	int field1197;
	@ObfuscatedName("ad")
	final HashMap field1193;
	@ObfuscatedName("ah")
	final HashMap field1194;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ltx;"
	)
	class505 field1195;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	class503 field1196;

	WorldViewManager() {
		this.hashTable = new IterableNodeHashTable(16);
		this.field1197 = 0;
		this.field1193 = new HashMap(16);
		this.field1194 = new HashMap(16);
		this.clear();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIII)Ldp;",
		garbageValue = "1975564801"
	)
	WorldView method2527(int var1, int var2, int var3) {
		this.worldView = this.method2528(-1, var1, var2, var3, class232.field2516);
		return this.worldView;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIILio;I)Ldp;",
		garbageValue = "403213682"
	)
	WorldView method2528(int var1, int var2, int var3, int var4, class232 var5) {
		WorldView var6 = new WorldView(var1, var2, var3, var4, var5);
		this.hashTable.put(var6, (long)var1);
		++this.field1197;
		return var6;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "76690858"
	)
	void method2529(int var1) {
		WorldView var2 = (WorldView)this.hashTable.get((long)var1);
		this.method2538(var2);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ldp;I)V",
		garbageValue = "-1170204589"
	)
	void method2538(WorldView var1) {
		if (var1 != null) {
			this.field1193.remove(var1.field1354);
			this.field1194.remove(var1.field1354);
			var1.remove();
			--this.field1197;
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)Ldp;",
		garbageValue = "-13"
	)
	public WorldView method2546(int var1) {
		return (WorldView)this.hashTable.get((long)var1);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Ldp;",
		garbageValue = "357848244"
	)
	public WorldView method2532() {
		return this.worldView;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "114"
	)
	int method2533() {
		return this.field1197;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ltx;Lty;I)V",
		garbageValue = "-1030576061"
	)
	void method2534(class505 var1, class503 var2) {
		this.field1195 = var1;
		this.field1196 = var2;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILtx;Lty;I)V",
		garbageValue = "1667753753"
	)
	void method2545(int var1, class505 var2, class503 var3) {
		this.field1193.put(var1, var2);
		this.field1194.put(var1, var3);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1317931407"
	)
	void method2553(int var1) {
		this.field1193.remove(var1);
		this.field1194.remove(var1);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)Ltx;",
		garbageValue = "1"
	)
	class505 method2536(int var1) {
		class505 var2 = (class505)this.field1193.get(var1);
		return var2 != null ? var2 : this.field1195;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Lty;",
		garbageValue = "-2041701883"
	)
	class503 method2537(int var1) {
		class503 var2 = (class503)this.field1194.get(var1);
		return var2 != null ? var2 : this.field1196;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-403551596"
	)
	@Export("clear")
	void clear() {
		this.hashTable.clear();
		this.field1197 = 0;
		this.field1193.clear();
		this.field1194.clear();
		this.field1195 = class505.field5212;
		this.field1196 = class503.field5199;
		if (this.worldView != null) {
			this.worldView.method2823();
			this.hashTable.put(this.worldView, -1L);
			this.field1197 = 1;
		}

	}

	public Iterator iterator() {
		return this.hashTable.iterator();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)[Log;",
		garbageValue = "8"
	)
	public static class387[] method2570() {
		return new class387[]{class387.field4561, class387.field4564, class387.field4560, class387.field4559};
	}

	@ObfuscatedName("my")
	@ObfuscatedSignature(
		descriptor = "([Lnz;IIIIIIIB)V",
		garbageValue = "-33"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) {
			Widget var9 = var0[var8];
			if (var9 != null && var9.parentId == var1 && (var9.method7311() || class441.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent)) {
				if (var9.isIf3) {
					if (PendingSpawn.isComponentHidden(var9)) {
						continue;
					}
				} else if (var9.type == 0 && var9 != class27.mousedOverWidgetIf1 && PendingSpawn.isComponentHidden(var9)) {
					continue;
				}

				if (var9.type == 11) {
					if (var9.method7328(class376.widgetDefinition, Tiles.urlRequester)) {
						if (var9.method7342()) {
							MilliClock.invalidateWidget(var9);
							class95.revalidateWidgetScroll(var9.children, var9, true);
							var9.method7327().method4433().method4531(3, var9.method7327().method4397());
						}

						if (var9.field4061 != null) {
							ScriptEvent var10 = new ScriptEvent();
							var10.widget = var9;
							var10.args = var9.field4061;
							Client.scriptEvents.addFirst(var10);
						}
					}
				} else if (var9.type == 12 && var9.method7336(class376.widgetDefinition)) {
					MilliClock.invalidateWidget(var9);
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
					var18 = var9.width * 779142065 + var26;
					int var19 = var9.height * 1836304183 + var11;
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
					var16 = var9.width * 779142065 + var26;
					var17 = var9.height * 1836304183 + var11;
					var12 = var26 > var2 ? var26 : var2;
					var13 = var11 > var3 ? var11 : var3;
					var14 = var16 < var4 ? var16 : var4;
					var15 = var17 < var5 ? var17 : var5;
				}

				if (var9 == Client.clickedWidget) {
					Client.field700 = true;
					Client.field701 = var26;
					Client.field702 = var11;
				}

				boolean var34 = false;
				if (var9.field3976) {
					switch(Client.field820) {
					case 0:
						var34 = true;
					case 1:
					default:
						break;
					case 2:
						if (Client.field813 == var9.id >>> 16) {
							var34 = true;
						}
						break;
					case 3:
						if (var9.id == Client.field813) {
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
									if (var27.field1092) {
										var27.remove();
										var27.widget.field4075 = false;
									}
								}

								ViewportMouse.method5420();
								if (class155.widgetDragDuration == 0) {
									Client.clickedWidget = null;
									Client.clickedWidgetParent = null;
								}

								if (!Client.isMenuOpen) {
									InterfaceParent.addCancelMenuEntry();
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
							for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) {
								if (var27.field1092 && var27.widget.onScroll == var27.args) {
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
							ClientPreferences.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) {
						class72.checkIfMinimapClicked(var9, var26, var11);
					} else {
						if (var9.contentType == 1400) {
							class541.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var35, var26, var11, var9.width * 779142065, var9.height * 1836304183);
						}

						if (!Client.isMenuOpen && var35) {
							if (var9.contentType == 1400) {
								class541.worldMap.addElementMenuOptions(var26, var11, var9.width * 779142065, var9.height * 1836304183, var17, var18);
							} else {
								class248.Widget_addToMenu(var9);
							}
						}

						boolean var21;
						int var23;
						if (var34) {
							for (int var20 = 0; var20 < var9.field3939.length; ++var20) {
								var21 = false;
								boolean var28 = false;
								if (!var21 && var9.field3939[var20] != null) {
									for (var23 = 0; var23 < var9.field3939[var20].length; ++var23) {
										boolean var24 = false;
										if (var9.field4083 != null) {
											var24 = Client.indexCheck.isValidIndexInRange(var9.field3939[var20][var23]);
										}

										if (WorldMapSection1.method6328(var9.field3939[var20][var23]) || var24) {
											var21 = true;
											if (var9.field4083 != null && var9.field4083[var20] > Client.cycle) {
												break;
											}

											byte var33 = var9.field4012[var20][var23];
											if (var33 == 0 || ((var33 & 8) == 0 || !Client.indexCheck.isValidIndexInRange(86) && !Client.indexCheck.isValidIndexInRange(82) && !Client.indexCheck.isValidIndexInRange(81)) && ((var33 & 2) == 0 || Client.indexCheck.isValidIndexInRange(86)) && ((var33 & 1) == 0 || Client.indexCheck.isValidIndexInRange(82)) && ((var33 & 4) == 0 || Client.indexCheck.isValidIndexInRange(81))) {
												var28 = true;
												break;
											}
										}
									}
								}

								if (var28) {
									if (var20 < 10) {
										class449.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) {
										class142.method3403();
										SpriteMask.method6854(var9.id, var9.childIndex, ItemLayer.Widget_unpackTargetMask(class441.getWidgetFlags(var9)), var9.itemId);
										Client.selectedSpellActionName = PlayerType.Widget_getSpellActionName(var9);
										if (Client.selectedSpellActionName == null) {
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var9.dataText + MilliClock.colorStartTag(16777215);
									}

									var23 = var9.field4011[var20];
									if (var9.field4083 == null) {
										var9.field4083 = new int[var9.field3939.length];
									}

									if (var9.field4014 == null) {
										var9.field4014 = new int[var9.field3939.length];
									}

									if (var23 != 0) {
										if (var9.field4083[var20] == 0) {
											var9.field4083[var20] = var23 + Client.cycle + var9.field4014[var20];
										} else {
											var9.field4083[var20] = var23 + Client.cycle;
										}
									} else {
										var9.field4083[var20] = Integer.MAX_VALUE;
									}
								}

								if (!var21 && var9.field4083 != null) {
									var9.field4083[var20] = 0;
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
							if ((MouseHandler.MouseHandler_currentButton == 1 || !class466.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var35) {
								var36 = true;
							}

							var21 = false;
							if ((MouseHandler.MouseHandler_lastButton == 1 || !class466.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) {
								var21 = true;
							}

							if (var21) {
								class228.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var26, MouseHandler.MouseHandler_lastPressedY - var11);
							}

							if (var9.method7340()) {
								if (var21) {
									Client.field726.addFirst(new class269(0, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9));
								}

								if (var36) {
									Client.field726.addFirst(new class269(1, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9));
								}
							}

							if (var9.contentType == 1400) {
								class541.worldMap.method9839(var17, var18, var35 & var36, var35 & var21);
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var35 && class165.method3638(class441.getWidgetFlags(var9))) {
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) {
								Client.field697 = true;
								Client.field565 = var26;
								Client.field699 = var11;
							}

							if (var9.hasListener) {
								ScriptEvent var22;
								if (var35 && Client.mouseWheelRotation != 0 && var9.onScroll != null) {
									var22 = new ScriptEvent();
									var22.field1092 = true;
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

								if (!var9.field4076 && var21) {
									var9.field4076 = true;
									if (var9.onClick != null) {
										var22 = new ScriptEvent();
										var22.field1092 = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_lastPressedX - var26;
										var22.mouseY = MouseHandler.MouseHandler_lastPressedY - var11;
										var22.args = var9.onClick;
										Client.scriptEvents.addFirst(var22);
									}
								}

								if (var9.field4076 && var36 && var9.onClickRepeat != null) {
									var22 = new ScriptEvent();
									var22.field1092 = true;
									var22.widget = var9;
									var22.mouseX = MouseHandler.MouseHandler_x - var26;
									var22.mouseY = MouseHandler.MouseHandler_y - var11;
									var22.args = var9.onClickRepeat;
									Client.scriptEvents.addFirst(var22);
								}

								if (var9.field4076 && !var36) {
									var9.field4076 = false;
									if (var9.onRelease != null) {
										var22 = new ScriptEvent();
										var22.field1092 = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_x - var26;
										var22.mouseY = MouseHandler.MouseHandler_y - var11;
										var22.args = var9.onRelease;
										Client.scriptEvents3.addFirst(var22);
									}
								}

								if (var36 && var9.onHold != null) {
									var22 = new ScriptEvent();
									var22.field1092 = true;
									var22.widget = var9;
									var22.mouseX = MouseHandler.MouseHandler_x - var26;
									var22.mouseY = MouseHandler.MouseHandler_y - var11;
									var22.args = var9.onHold;
									Client.scriptEvents.addFirst(var22);
								}

								if (!var9.field4075 && var35) {
									var9.field4075 = true;
									if (var9.onMouseOver != null) {
										var22 = new ScriptEvent();
										var22.field1092 = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_x - var26;
										var22.mouseY = MouseHandler.MouseHandler_y - var11;
										var22.args = var9.onMouseOver;
										Client.scriptEvents.addFirst(var22);
									}
								}

								if (var9.field4075 && var35 && var9.onMouseRepeat != null) {
									var22 = new ScriptEvent();
									var22.field1092 = true;
									var22.widget = var9;
									var22.mouseX = MouseHandler.MouseHandler_x - var26;
									var22.mouseY = MouseHandler.MouseHandler_y - var11;
									var22.args = var9.onMouseRepeat;
									Client.scriptEvents.addFirst(var22);
								}

								if (var9.field4075 && !var35) {
									var9.field4075 = false;
									if (var9.onMouseLeave != null) {
										var22 = new ScriptEvent();
										var22.field1092 = true;
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
								if (var9.onVarTransmit != null && Client.changedVarpCount > var9.field4078) {
									if (var9.varTransmitTriggers != null && Client.changedVarpCount - var9.field4078 <= 32) {
										label826:
										for (var39 = var9.field4078; var39 < Client.changedVarpCount; ++var39) {
											var23 = Client.changedVarps[var39 & 31];

											for (var37 = 0; var37 < var9.varTransmitTriggers.length; ++var37) {
												if (var23 == var9.varTransmitTriggers[var37]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onVarTransmit;
													Client.scriptEvents.addFirst(var25);
													break label826;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onVarTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field4078 = Client.changedVarpCount;
								}

								if (var9.onInvTransmit != null && Client.field797 > var9.field4027) {
									if (var9.invTransmitTriggers != null && Client.field797 - var9.field4027 <= 32) {
										label802:
										for (var39 = var9.field4027; var39 < Client.field797; ++var39) {
											var23 = Client.changedItemContainers[var39 & 31];

											for (var37 = 0; var37 < var9.invTransmitTriggers.length; ++var37) {
												if (var23 == var9.invTransmitTriggers[var37]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onInvTransmit;
													Client.scriptEvents.addFirst(var25);
													break label802;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onInvTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field4027 = Client.field797;
								}

								if (var9.onStatTransmit != null && Client.changedSkillsCount > var9.field4069) {
									if (var9.statTransmitTriggers != null && Client.changedSkillsCount - var9.field4069 <= 32) {
										label778:
										for (var39 = var9.field4069; var39 < Client.changedSkillsCount; ++var39) {
											var23 = Client.changedSkills[var39 & 31];

											for (var37 = 0; var37 < var9.statTransmitTriggers.length; ++var37) {
												if (var23 == var9.statTransmitTriggers[var37]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onStatTransmit;
													Client.scriptEvents.addFirst(var25);
													break label778;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onStatTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field4069 = Client.changedSkillsCount;
								}

								if (Client.chatCycle > var9.field4040 && var9.onChatTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onChatTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field714 > var9.field4040 && var9.onFriendTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onFriendTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field715 > var9.field4040 && var9.onClanTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onClanTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field750 > var9.field4040 && var9.field3989 != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.field3989;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field555 > var9.field4040 && var9.field4049 != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.field4049;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field718 > var9.field4040 && var9.onStockTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onStockTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field719 > var9.field4040 && var9.field3974 != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.field3974;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field720 > var9.field4040 && var9.onMiscTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onMiscTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								var9.field4040 = Client.cycleCntr;
								if (var9.onKey != null) {
									for (var39 = 0; var39 < Client.field579; ++var39) {
										ScriptEvent var32 = new ScriptEvent();
										var32.widget = var9;
										var32.keyTyped = Client.field752[var39];
										var32.keyPressed = Client.field751[var39];
										var32.args = var9.onKey;
										Client.scriptEvents.addFirst(var32);
									}
								}

								ScriptEvent var31;
								int[] var38;
								if (var9.field4053 != null) {
									var38 = Client.indexCheck.method5601();

									for (var23 = 0; var23 < var38.length; ++var23) {
										var31 = new ScriptEvent();
										var31.widget = var9;
										var31.keyTyped = var38[var23];
										var31.args = var9.field4053;
										Client.scriptEvents.addFirst(var31);
									}
								}

								if (var9.field4050 != null) {
									var38 = Client.indexCheck.method5602();

									for (var23 = 0; var23 < var38.length; ++var23) {
										var31 = new ScriptEvent();
										var31.widget = var9;
										var31.keyTyped = var38[var23];
										var31.args = var9.field4050;
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
									class27.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									class27.mousedOverWidgetIf1 = var9;
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								WorldMapLabel.field3311 = var9;
							}

							if (var9.scrollHeight > var9.height * 1836304183) {
								class171.method3694(var9, var9.width * 779142065 + var26, var11, var9.height * 1836304183, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
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
										if (var30.field1092) {
											var30.remove();
											var30.widget.field4075 = false;
										}
									}

									if (class155.widgetDragDuration == 0) {
										Client.clickedWidget = null;
										Client.clickedWidgetParent = null;
									}

									if (!Client.isMenuOpen) {
										InterfaceParent.addCancelMenuEntry();
									}
								}

								MenuAction.updateRootInterface(var29.group, var12, var13, var14, var15, var26, var11);
							}
						}
					}
				}
			}
		}

	}
}
