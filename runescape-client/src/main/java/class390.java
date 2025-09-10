import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("pz")
public class class390 {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lti;ILjava/lang/Object;I)V",
		garbageValue = "-1936454229"
	)
	public static void method8218(DynamicArray var0, int var1, Object var2) {
		class374.method8144(var0);
		if (var1 >= 0 && var1 <= var0.size * -1549457881) {
			var0.method10355(var0.size * -1549457881 + 1);
			if (var1 < var0.size * -1549457881) {
				class82.method2773(var0, var1, var0, var1 + 1, var0.size * -1549457881 - var1);
			}

			var0.method10363(var1, var2);
			var0.size += -698619497;
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(ILcg;ZS)I",
		garbageValue = "25325"
	)
	static int method8217(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) {
			var3 = class333.topLevelWorldView.plane;
			int var15 = (HealthBarUpdate.localPlayer.x >> 7) + class333.topLevelWorldView.baseX;
			int var8 = (HealthBarUpdate.localPlayer.y >> 7) + class333.topLevelWorldView.baseY;
			AABB.getWorldMap().method10649(var3, var15, var8, true);
			return 1;
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) {
				var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
				String var16 = "";
				var9 = AABB.getWorldMap().getMapArea(var3);
				if (var9 != null) {
					var16 = var9.getExternalName();
				}

				Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var16;
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) {
				var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
				AABB.getWorldMap().setCurrentMapAreaId(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) {
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = AABB.getWorldMap().getZoomLevel();
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) {
				var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
				AABB.getWorldMap().setZoomPercentage(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) {
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = AABB.getWorldMap().isCacheLoaded() ? 1 : 0;
				return 1;
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize]);
					AABB.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize]);
					AABB.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize]);
					AABB.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize]);
					AABB.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) {
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = AABB.getWorldMap().getDisplayX();
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = AABB.getWorldMap().getDisplayY();
					return 1;
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
						var11 = AABB.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var11.getOrigin().packed();
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
						var11 = AABB.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64;
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
						var11 = AABB.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64;
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64;
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1;
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
						var11 = AABB.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var11.getZoom();
						}

						return 1;
					} else if (var0 == 6615) {
						var14 = AABB.getWorldMap().getDisplayCoord();
						if (var14 == null) {
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var14.x;
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var14.y;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) {
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = AABB.getWorldMap().currentMapAreaId();
						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) {
						var14 = new Coord(Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize]);
						var11 = AABB.getWorldMap().getCurrentMapArea();
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y);
							if (var12 == null) {
								Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = -1;
							} else {
								Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var12[0];
								Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var12[1];
							}

							return 1;
						}
					} else {
						Coord var5;
						if (var0 == 6618) {
							var14 = new Coord(Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize]);
							var11 = AABB.getWorldMap().getCurrentMapArea();
							if (var11 == null) {
								Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = -1;
								return 1;
							} else {
								var5 = var11.coord(var14.x, var14.y);
								if (var5 == null) {
									Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var5.packed();
								}

								return 1;
							}
						} else {
							Coord var10;
							if (var0 == 6619) {
								UserComparator7.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1]);
								class265.method5990(var3, var10, false);
								return 1;
							} else if (var0 == 6620) {
								UserComparator7.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1]);
								class265.method5990(var3, var10, true);
								return 1;
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) {
								UserComparator7.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1]);
								var9 = AABB.getWorldMap().getMapArea(var3);
								if (var9 == null) {
									Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
									return 1;
								} else {
									Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0;
									return 1;
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) {
								Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = AABB.getWorldMap().getDisplayWith();
								Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = AABB.getWorldMap().getDisplayHeight();
								return 1;
							} else if (var0 == 6623) {
								var14 = new Coord(Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize]);
								var11 = AABB.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y);
								if (var11 == null) {
									Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var11.getId();
								}

								return 1;
							} else if (var0 == 6624) {
								AABB.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6625) {
								AABB.getWorldMap().resetMaxFlashCount();
								return 1;
							} else if (var0 == 6626) {
								AABB.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6627) {
								AABB.getWorldMap().resetCyclesPerFlash();
								return 1;
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) {
									var13 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
									AABB.getWorldMap().setPerpetualFlash(var13);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) {
									var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
									AABB.getWorldMap().flashElement(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) {
									var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
									AABB.getWorldMap().flashCategory(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) {
									AABB.getWorldMap().stopCurrentFlashes();
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) {
									var13 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
									AABB.getWorldMap().setElementsDisabled(var13);
									return 1;
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) {
										UserComparator7.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
										var7 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1] == 1;
										AABB.getWorldMap().disableElement(var3, var7);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) {
										UserComparator7.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
										var7 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1] == 1;
										AABB.getWorldMap().setCategoryDisabled(var3, var7);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) {
										Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = AABB.getWorldMap().getElementsDisabled() ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) {
										var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = AABB.getWorldMap().isElementDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) {
										var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = AABB.getWorldMap().isCategoryDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == 6638) {
										UserComparator7.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
										var10 = new Coord(Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1]);
										var5 = AABB.getWorldMap().method10693(var3, var10);
										if (var5 == null) {
											Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = -1;
										} else {
											Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var5.packed();
										}

										return 1;
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) {
											var6 = AABB.getWorldMap().iconStart();
											if (var6 == null) {
												Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var6.getElement();
												Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var6.coord2.packed();
											}

											return 1;
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) {
											var6 = AABB.getWorldMap().iconNext();
											if (var6 == null) {
												Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var6.getElement();
												Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var6.coord2.packed();
											}

											return 1;
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) {
												var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
												var4 = VerticalAlignment.WorldMapElement_get(var3);
												if (var4.name == null) {
													Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = "";
												} else {
													Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var4.name;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) {
												var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
												var4 = VerticalAlignment.WorldMapElement_get(var3);
												Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var4.textSize;
												return 1;
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) {
												var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
												var4 = VerticalAlignment.WorldMapElement_get(var3);
												if (var4 == null) {
													Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var4.category;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) {
												var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
												var4 = VerticalAlignment.WorldMapElement_get(var3);
												if (var4 == null) {
													Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var4.sprite1;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) {
												Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Frames.worldMapEvent.mapElement;
												return 1;
											} else if (var0 == 6698) {
												Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Frames.worldMapEvent.coord1.packed();
												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) {
												Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Frames.worldMapEvent.coord2.packed();
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

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(Ldr;IZI)V",
		garbageValue = "-944000169"
	)
	@Export("addPlayerToScene")
	static void addPlayerToScene(WorldView var0, int var1, boolean var2) {
		Player var3 = (Player)var0.players.get((long)var1);
		if (var3 != null && var3.isVisible() && !var3.isHidden) {
			int var4 = var3.plane;
			var3.isUnanimated = false;
			if ((Client.isLowDetail && Client.playerUpdateManager.playerCount > 50 || Client.playerUpdateManager.playerCount > 200) && var2 && var3.method2416() == var3.idleSequence) {
				var3.isUnanimated = true;
			}

			int var5 = var3.x >> 7;
			int var6 = var3.y >> 7;
			if (0 <= var5 && var5 < 104 && 0 <= var6 && var6 < 104) {
				long var7 = UserComparator8.calculateTag(0, 0, 0, 0, false, var3.index, var0.id);
				if (var3.model0 != null && Client.cycle >= var3.animationCycleStart && Client.cycle < var3.animationCycleEnd) {
					var3.isUnanimated = false;
					var3.tileHeight = class255.method5812(var0, var3.x, var3.y, var4, var3.vmethod2763());
					var3.tileHeight -= var3.method2417();
					var3.playerCycle = Client.cycle;
					var0.scene.addNullableObject(var4, var3.x, var3.y, var3.tileHeight, 60, var3, var3.rotation, var7, var3.minX, var3.minY, var3.maxX, var3.maxY);
				} else {
					if ((var3.x & 127) == 64 && (var3.y & 127) == 64) {
						if (var0.tileLastDrawnActor[var5][var6] == Client.viewportDrawCount) {
							return;
						}

						var0.tileLastDrawnActor[var5][var6] = Client.viewportDrawCount;
					}

					var3.tileHeight = class255.method5812(var0, var3.x, var3.y, var4, var3.vmethod2763());
					var3.tileHeight -= var3.method2417();
					var3.playerCycle = Client.cycle;
					var0.scene.drawEntity(var4, var3.x, var3.y, var3.tileHeight, 60, var3, var3.rotation, var7, var3.isWalking);
				}
			}
		}

	}
}
