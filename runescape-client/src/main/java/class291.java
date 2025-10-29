import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ls")
public class class291 {
	@ObfuscatedName("io")
	static Iterator field3327;

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ILcu;ZI)I",
		garbageValue = "23923789"
	)
	static int method6571(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) {
			var3 = Occluder.topLevelWorldView.plane;
			int var15 = (class330.localPlayer.x >> 7) + Occluder.topLevelWorldView.baseX;
			int var8 = (class330.localPlayer.y >> 7) + Occluder.topLevelWorldView.baseY;
			class455.getWorldMap().method11199(var3, var15, var8, true);
			return 1;
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) {
				var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
				String var16 = "";
				var9 = class455.getWorldMap().getMapArea(var3);
				if (var9 != null) {
					var16 = var9.getExternalName();
				}

				Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var16;
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) {
				var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
				class455.getWorldMap().setCurrentMapAreaId(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) {
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = class455.getWorldMap().getZoomLevel();
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) {
				var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
				class455.getWorldMap().setZoomPercentage(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) {
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = class455.getWorldMap().isCacheLoaded() ? 1 : 0;
				return 1;
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize]);
					class455.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize]);
					class455.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize]);
					class455.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize]);
					class455.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) {
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = class455.getWorldMap().getDisplayX();
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = class455.getWorldMap().getDisplayY();
					return 1;
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) {
						var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
						var11 = class455.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var11.getOrigin().packed();
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) {
						var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
						var11 = class455.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64;
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) {
						var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
						var11 = class455.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64;
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64;
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1;
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) {
						var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
						var11 = class455.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var11.getZoom();
						}

						return 1;
					} else if (var0 == 6615) {
						var14 = class455.getWorldMap().getDisplayCoord();
						if (var14 == null) {
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var14.x;
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var14.y;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) {
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = class455.getWorldMap().currentMapAreaId();
						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) {
						var14 = new Coord(Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize]);
						var11 = class455.getWorldMap().getCurrentMapArea();
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y);
							if (var12 == null) {
								Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = -1;
							} else {
								Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var12[0];
								Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var12[1];
							}

							return 1;
						}
					} else {
						Coord var5;
						if (var0 == 6618) {
							var14 = new Coord(Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize]);
							var11 = class455.getWorldMap().getCurrentMapArea();
							if (var11 == null) {
								Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = -1;
								return 1;
							} else {
								var5 = var11.coord(var14.x, var14.y);
								if (var5 == null) {
									Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var5.packed();
								}

								return 1;
							}
						} else {
							Coord var10;
							if (var0 == 6619) {
								class408.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1]);
								class311.method7030(var3, var10, false);
								return 1;
							} else if (var0 == 6620) {
								class408.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1]);
								class311.method7030(var3, var10, true);
								return 1;
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) {
								class408.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1]);
								var9 = class455.getWorldMap().getMapArea(var3);
								if (var9 == null) {
									Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
									return 1;
								} else {
									Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0;
									return 1;
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) {
								Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = class455.getWorldMap().getDisplayWith();
								Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = class455.getWorldMap().getDisplayHeight();
								return 1;
							} else if (var0 == 6623) {
								var14 = new Coord(Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize]);
								var11 = class455.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y);
								if (var11 == null) {
									Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var11.getId();
								}

								return 1;
							} else if (var0 == 6624) {
								class455.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6625) {
								class455.getWorldMap().resetMaxFlashCount();
								return 1;
							} else if (var0 == 6626) {
								class455.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6627) {
								class455.getWorldMap().resetCyclesPerFlash();
								return 1;
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) {
									var13 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
									class455.getWorldMap().setPerpetualFlash(var13);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) {
									var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
									class455.getWorldMap().flashElement(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) {
									var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
									class455.getWorldMap().flashCategory(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) {
									class455.getWorldMap().stopCurrentFlashes();
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) {
									var13 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
									class455.getWorldMap().setElementsDisabled(var13);
									return 1;
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) {
										class408.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
										var7 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1] == 1;
										class455.getWorldMap().disableElement(var3, var7);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) {
										class408.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
										var7 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1] == 1;
										class455.getWorldMap().setCategoryDisabled(var3, var7);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) {
										Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = class455.getWorldMap().getElementsDisabled() ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) {
										var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = class455.getWorldMap().isElementDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) {
										var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = class455.getWorldMap().isCategoryDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == 6638) {
										class408.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
										var10 = new Coord(Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1]);
										var5 = class455.getWorldMap().method11023(var3, var10);
										if (var5 == null) {
											Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = -1;
										} else {
											Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var5.packed();
										}

										return 1;
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) {
											var6 = class455.getWorldMap().iconStart();
											if (var6 == null) {
												Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var6.getElement();
												Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var6.coord2.packed();
											}

											return 1;
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) {
											var6 = class455.getWorldMap().iconNext();
											if (var6 == null) {
												Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var6.getElement();
												Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var6.coord2.packed();
											}

											return 1;
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) {
												var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
												var4 = class463.WorldMapElement_get(var3);
												if (var4.name == null) {
													Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
												} else {
													Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var4.name;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) {
												var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
												var4 = class463.WorldMapElement_get(var3);
												Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var4.textSize;
												return 1;
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) {
												var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
												var4 = class463.WorldMapElement_get(var3);
												if (var4 == null) {
													Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var4.category;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) {
												var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
												var4 = class463.WorldMapElement_get(var3);
												if (var4 == null) {
													Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var4.sprite1;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) {
												Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = AbstractSocket.worldMapEvent.mapElement;
												return 1;
											} else if (var0 == 6698) {
												Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = AbstractSocket.worldMapEvent.coord1.packed();
												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) {
												Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = AbstractSocket.worldMapEvent.coord2.packed();
												return 1;
											} else {
												return 2;
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

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(Ldd;Lhp;I)V",
		garbageValue = "-1111039125"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(WorldView var0, class201 var1) {
		for (int var2 = 0; var2 < var0.field1130.method10038(); ++var2) {
			NPC var3 = (NPC)var0.npcs.get((long)var0.field1130.method10037(var2));
			if (var3 != null && var3.isVisible() && var3.definition.field2158 == var1 && var3.definition.transformIsVisible()) {
				int var4 = var0.plane;
				int var5 = Coord.method7692(var3.x);
				int var6 = Coord.method7692(var3.y);
				if (var5 >= 0 && var5 < var0.sizeX && var6 >= 0 && var6 < var0.sizeY) {
					if (var3.size * -548859904 == 1 && (var3.x & 127) == 64 && (var3.y & 127) == 64) {
						if (var0.tileLastDrawnActor[var5][var6] == Client.viewportDrawCount) {
							continue;
						}

						var0.tileLastDrawnActor[var5][var6] = Client.viewportDrawCount;
					}

					long var7 = class236.calculateTag(0, 0, 0, 1, !var3.definition.isInteractable, var3.index, var0.id);
					var3.playerCycle = Client.cycle;
					int var9 = class67.method2215(var0, var3.x, var3.y, var4, var3.vmethod2828());
					int var10 = var3.size * -767295488 - 64 + 60;
					boolean var11 = class48.method1941(var3);
					var3.field1158 = var11;
					var0.scene.drawEntity(var4, var3.x, var3.y, var9, var10, var3, var3.rotation, var7, var3.isWalking);
				}
			}
		}

	}
}
