import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fp")
@Implements("AuthenticationScheme")
public enum AuthenticationScheme implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	@Export("TOKEN_REMEMBER")
	TOKEN_REMEMBER(3, 0),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	@Export("USERNAME_PASSWORD_REMEMBER")
	USERNAME_PASSWORD_REMEMBER(1, 1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	@Export("TOKEN")
	TOKEN(4, 2),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	@Export("USERNAME_PASSWORD")
	USERNAME_PASSWORD(0, 3),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	field1596(2, 4);

	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1610172907
	)
	@Export("schemeId")
	public final int schemeId;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -201887153
	)
	@Export("packetId")
	final int packetId;

	AuthenticationScheme(int var3, int var4) {
		this.schemeId = var3;
		this.packetId = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1012656358"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.packetId;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIB)J",
		garbageValue = "80"
	)
	static long method3661(int var0, int var1, int var2) {
		return (long)(var2 << 16 | var0 << 8 | var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([BI)Llq;",
		garbageValue = "478805756"
	)
	static WorldMapSprite method3666(byte[] var0) {
		if (var0 == null) {
			return new WorldMapSprite();
		} else {
			SpritePixels var1 = EnumComposition.readSpritePixelsFromBytes(var0);
			return var1 == null ? new WorldMapSprite() : new WorldMapSprite(var1.pixels);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "6"
	)
	static void method3660(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			var1.remove();
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ILcj;ZI)I",
		garbageValue = "-1965999741"
	)
	static int method3667(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) {
			var3 = class547.topLevelWorldView.plane;
			int var15 = (class159.localPlayer.x >> 7) + class547.topLevelWorldView.baseX;
			int var8 = (class159.localPlayer.y >> 7) + class547.topLevelWorldView.baseY;
			ItemContainer.getWorldMap().method10794(var3, var15, var8, true);
			return 1;
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) {
				var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
				String var16 = "";
				var9 = ItemContainer.getWorldMap().getMapArea(var3);
				if (var9 != null) {
					var16 = var9.getExternalName();
				}

				Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var16;
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) {
				var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
				ItemContainer.getWorldMap().setCurrentMapAreaId(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) {
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = ItemContainer.getWorldMap().getZoomLevel();
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) {
				var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
				ItemContainer.getWorldMap().setZoomPercentage(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) {
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = ItemContainer.getWorldMap().isCacheLoaded() ? 1 : 0;
				return 1;
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize]);
					ItemContainer.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize]);
					ItemContainer.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize]);
					ItemContainer.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize]);
					ItemContainer.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) {
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = ItemContainer.getWorldMap().getDisplayX();
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = ItemContainer.getWorldMap().getDisplayY();
					return 1;
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) {
						var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
						var11 = ItemContainer.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var11.getOrigin().packed();
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) {
						var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
						var11 = ItemContainer.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64;
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) {
						var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
						var11 = ItemContainer.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64;
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64;
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1;
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) {
						var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
						var11 = ItemContainer.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var11.getZoom();
						}

						return 1;
					} else if (var0 == 6615) {
						var14 = ItemContainer.getWorldMap().getDisplayCoord();
						if (var14 == null) {
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var14.x;
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var14.y;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) {
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = ItemContainer.getWorldMap().currentMapAreaId();
						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) {
						var14 = new Coord(Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize]);
						var11 = ItemContainer.getWorldMap().getCurrentMapArea();
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y);
							if (var12 == null) {
								Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = -1;
							} else {
								Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var12[0];
								Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var12[1];
							}

							return 1;
						}
					} else {
						Coord var5;
						if (var0 == 6618) {
							var14 = new Coord(Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize]);
							var11 = ItemContainer.getWorldMap().getCurrentMapArea();
							if (var11 == null) {
								Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = -1;
								return 1;
							} else {
								var5 = var11.coord(var14.x, var14.y);
								if (var5 == null) {
									Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var5.packed();
								}

								return 1;
							}
						} else {
							Coord var10;
							if (var0 == 6619) {
								UrlRequest.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1]);
								AnimationSequence.method9649(var3, var10, false);
								return 1;
							} else if (var0 == 6620) {
								UrlRequest.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1]);
								AnimationSequence.method9649(var3, var10, true);
								return 1;
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) {
								UrlRequest.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1]);
								var9 = ItemContainer.getWorldMap().getMapArea(var3);
								if (var9 == null) {
									Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
									return 1;
								} else {
									Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0;
									return 1;
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) {
								Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = ItemContainer.getWorldMap().getDisplayWith();
								Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = ItemContainer.getWorldMap().getDisplayHeight();
								return 1;
							} else if (var0 == 6623) {
								var14 = new Coord(Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize]);
								var11 = ItemContainer.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y);
								if (var11 == null) {
									Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var11.getId();
								}

								return 1;
							} else if (var0 == 6624) {
								ItemContainer.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6625) {
								ItemContainer.getWorldMap().resetMaxFlashCount();
								return 1;
							} else if (var0 == 6626) {
								ItemContainer.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6627) {
								ItemContainer.getWorldMap().resetCyclesPerFlash();
								return 1;
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) {
									var13 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1;
									ItemContainer.getWorldMap().setPerpetualFlash(var13);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) {
									var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
									ItemContainer.getWorldMap().flashElement(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) {
									var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
									ItemContainer.getWorldMap().flashCategory(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) {
									ItemContainer.getWorldMap().stopCurrentFlashes();
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) {
									var13 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1;
									ItemContainer.getWorldMap().setElementsDisabled(var13);
									return 1;
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) {
										UrlRequest.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
										var7 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1] == 1;
										ItemContainer.getWorldMap().disableElement(var3, var7);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) {
										UrlRequest.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
										var7 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1] == 1;
										ItemContainer.getWorldMap().setCategoryDisabled(var3, var7);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) {
										Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = ItemContainer.getWorldMap().getElementsDisabled() ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) {
										var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = ItemContainer.getWorldMap().isElementDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) {
										var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = ItemContainer.getWorldMap().isCategoryDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == 6638) {
										UrlRequest.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
										var10 = new Coord(Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1]);
										var5 = ItemContainer.getWorldMap().method10839(var3, var10);
										if (var5 == null) {
											Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = -1;
										} else {
											Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var5.packed();
										}

										return 1;
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) {
											var6 = ItemContainer.getWorldMap().iconStart();
											if (var6 == null) {
												Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var6.getElement();
												Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var6.coord2.packed();
											}

											return 1;
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) {
											var6 = ItemContainer.getWorldMap().iconNext();
											if (var6 == null) {
												Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var6.getElement();
												Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var6.coord2.packed();
											}

											return 1;
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) {
												var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
												var4 = LoginState.WorldMapElement_get(var3);
												if (var4.name == null) {
													Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = "";
												} else {
													Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var4.name;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) {
												var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
												var4 = LoginState.WorldMapElement_get(var3);
												Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var4.textSize;
												return 1;
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) {
												var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
												var4 = LoginState.WorldMapElement_get(var3);
												if (var4 == null) {
													Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var4.category;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) {
												var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
												var4 = LoginState.WorldMapElement_get(var3);
												if (var4 == null) {
													Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var4.sprite1;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) {
												Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = class199.worldMapEvent.mapElement;
												return 1;
											} else if (var0 == 6698) {
												Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = class199.worldMapEvent.coord1.packed();
												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) {
												Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = class199.worldMapEvent.coord2.packed();
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
}
