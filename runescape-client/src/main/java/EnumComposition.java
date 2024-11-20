import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hm")
@Implements("EnumComposition")
public class EnumComposition extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("EnumDefinition_archive")
	static AbstractArchive EnumDefinition_archive;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("EnumDefinition_cached")
	static EvictingDualNodeHashTable EnumDefinition_cached;
	@ObfuscatedName("at")
	@Export("inputType")
	public char inputType;
	@ObfuscatedName("ae")
	@Export("outputType")
	public char outputType;
	@ObfuscatedName("ao")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 471508559
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1007752809
	)
	@Export("outputCount")
	public int outputCount;
	@ObfuscatedName("av")
	@Export("keys")
	public int[] keys;
	@ObfuscatedName("au")
	@Export("intVals")
	public int[] intVals;
	@ObfuscatedName("an")
	@Export("strVals")
	public String[] strVals;

	static {
		EnumDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	EnumComposition() {
		this.defaultStr = "null";
		this.outputCount = 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lvj;I)V",
		garbageValue = "1552147184"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lvj;IB)V",
		garbageValue = "46"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.inputType = (char)var1.readUnsignedByte();
		} else if (var2 == 2) {
			this.outputType = (char)var1.readUnsignedByte();
		} else if (var2 == 3) {
			this.defaultStr = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) {
			this.defaultInt = var1.readInt();
		} else {
			int var3;
			if (var2 == 5) {
				this.outputCount = var1.readUnsignedShort();
				this.keys = new int[this.outputCount];
				this.strVals = new String[this.outputCount];

				for (var3 = 0; var3 < this.outputCount; ++var3) {
					this.keys[var3] = var1.readInt();
					this.strVals[var3] = var1.readStringCp1252NullTerminated();
				}
			} else if (var2 == 6) {
				this.outputCount = var1.readUnsignedShort();
				this.keys = new int[this.outputCount];
				this.intVals = new int[this.outputCount];

				for (var3 = 0; var3 < this.outputCount; ++var3) {
					this.keys[var3] = var1.readInt();
					this.intVals[var3] = var1.readInt();
				}
			}
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1284664956"
	)
	@Export("size")
	public int size() {
		return this.outputCount;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)Ljava/lang/String;",
		garbageValue = "-69"
	)
	public static String method3882(CharSequence var0) {
		int var1 = var0.length();
		StringBuilder var2 = new StringBuilder(var1);

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if ((var4 < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && (var4 < '0' || var4 > '9') && var4 != '.' && var4 != '-' && var4 != '*' && var4 != '_') {
				if (var4 == ' ') {
					var2.append('+');
				} else {
					byte var5 = class7.charToByteCp1252(var4);
					var2.append('%');
					int var6 = var5 >> 4 & 15;
					if (var6 >= 10) {
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48));
					}

					var6 = var5 & 15;
					if (var6 >= 10) {
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48));
					}
				}
			} else {
				var2.append(var4);
			}
		}

		return var2.toString();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lwt;"
	)
	@Export("newRunException")
	public static RunException newRunException(Throwable var0, String var1) {
		RunException var2;
		if (var0 instanceof RunException) {
			var2 = (RunException)var0;
			var2.message = var2.message + ' ' + var1;
		} else {
			var2 = new RunException(var0, var1);
		}

		return var2;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-79"
	)
	public static int method3881(int var0) {
		return class506.field5141[var0 & 16383];
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1923756517"
	)
	static final boolean method3880(int var0, int var1) {
		ObjectComposition var2 = HttpMethod.getObjectDefinition(var0);
		if (var1 == 11) {
			var1 = 10;
		}

		if (var1 >= 5 && var1 <= 8) {
			var1 = 4;
		}

		return var2.method4138(var1);
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "-1372298759"
	)
	static int method3877(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) {
			var3 = HttpRequest.topLevelWorldView.plane;
			int var15 = (AsyncHttpResponse.localPlayer.x >> 7) + HttpRequest.topLevelWorldView.baseX;
			int var8 = (AsyncHttpResponse.localPlayer.y >> 7) + HttpRequest.topLevelWorldView.baseY;
			class403.getWorldMap().method9735(var3, var15, var8, true);
			return 1;
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) {
				var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
				String var16 = "";
				var9 = class403.getWorldMap().getMapArea(var3);
				if (var9 != null) {
					var16 = var9.getExternalName();
				}

				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var16;
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) {
				var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
				class403.getWorldMap().setCurrentMapAreaId(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) {
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = class403.getWorldMap().getZoomLevel();
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) {
				var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
				class403.getWorldMap().setZoomPercentage(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) {
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = class403.getWorldMap().isCacheLoaded() ? 1 : 0;
				return 1;
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize]);
					class403.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize]);
					class403.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize]);
					class403.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize]);
					class403.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) {
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = class403.getWorldMap().getDisplayX();
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = class403.getWorldMap().getDisplayY();
					return 1;
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) {
						var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
						var11 = class403.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var11.getOrigin().packed();
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) {
						var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
						var11 = class403.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64;
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) {
						var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
						var11 = class403.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64;
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64;
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1;
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) {
						var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
						var11 = class403.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var11.getZoom();
						}

						return 1;
					} else if (var0 == 6615) {
						var14 = class403.getWorldMap().getDisplayCoord();
						if (var14 == null) {
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var14.x;
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var14.y;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) {
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = class403.getWorldMap().currentMapAreaId();
						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) {
						var14 = new Coord(Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize]);
						var11 = class403.getWorldMap().getCurrentMapArea();
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y);
							if (var12 == null) {
								Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = -1;
							} else {
								Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var12[0];
								Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var12[1];
							}

							return 1;
						}
					} else {
						Coord var5;
						if (var0 == 6618) {
							var14 = new Coord(Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize]);
							var11 = class403.getWorldMap().getCurrentMapArea();
							if (var11 == null) {
								Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = -1;
								return 1;
							} else {
								var5 = var11.coord(var14.x, var14.y);
								if (var5 == null) {
									Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var5.packed();
								}

								return 1;
							}
						} else {
							Coord var10;
							if (var0 == 6619) {
								PrivateChatMode.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1]);
								class113.method3068(var3, var10, false);
								return 1;
							} else if (var0 == 6620) {
								PrivateChatMode.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1]);
								class113.method3068(var3, var10, true);
								return 1;
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) {
								PrivateChatMode.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1]);
								var9 = class403.getWorldMap().getMapArea(var3);
								if (var9 == null) {
									Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
									return 1;
								} else {
									Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0;
									return 1;
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) {
								Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = class403.getWorldMap().getDisplayWith();
								Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = class403.getWorldMap().getDisplayHeight();
								return 1;
							} else if (var0 == 6623) {
								var14 = new Coord(Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize]);
								var11 = class403.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y);
								if (var11 == null) {
									Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var11.getId();
								}

								return 1;
							} else if (var0 == 6624) {
								class403.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6625) {
								class403.getWorldMap().resetMaxFlashCount();
								return 1;
							} else if (var0 == 6626) {
								class403.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6627) {
								class403.getWorldMap().resetCyclesPerFlash();
								return 1;
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) {
									var13 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
									class403.getWorldMap().setPerpetualFlash(var13);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) {
									var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
									class403.getWorldMap().flashElement(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) {
									var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
									class403.getWorldMap().flashCategory(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) {
									class403.getWorldMap().stopCurrentFlashes();
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) {
									var13 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
									class403.getWorldMap().setElementsDisabled(var13);
									return 1;
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) {
										PrivateChatMode.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
										var7 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1] == 1;
										class403.getWorldMap().disableElement(var3, var7);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) {
										PrivateChatMode.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
										var7 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1] == 1;
										class403.getWorldMap().setCategoryDisabled(var3, var7);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) {
										Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = class403.getWorldMap().getElementsDisabled() ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) {
										var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = class403.getWorldMap().isElementDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) {
										var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = class403.getWorldMap().isCategoryDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == 6638) {
										PrivateChatMode.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
										var10 = new Coord(Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1]);
										var5 = class403.getWorldMap().method9582(var3, var10);
										if (var5 == null) {
											Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = -1;
										} else {
											Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var5.packed();
										}

										return 1;
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) {
											var6 = class403.getWorldMap().iconStart();
											if (var6 == null) {
												Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var6.getElement();
												Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var6.coord2.packed();
											}

											return 1;
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) {
											var6 = class403.getWorldMap().iconNext();
											if (var6 == null) {
												Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var6.getElement();
												Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var6.coord2.packed();
											}

											return 1;
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) {
												var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
												var4 = Tiles.WorldMapElement_get(var3);
												if (var4.name == null) {
													Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
												} else {
													Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.name;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) {
												var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
												var4 = Tiles.WorldMapElement_get(var3);
												Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var4.textSize;
												return 1;
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) {
												var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
												var4 = Tiles.WorldMapElement_get(var3);
												if (var4 == null) {
													Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var4.category;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) {
												var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
												var4 = Tiles.WorldMapElement_get(var3);
												if (var4 == null) {
													Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var4.sprite1;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) {
												Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Interpreter.worldMapEvent.mapElement;
												return 1;
											} else if (var0 == 6698) {
												Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Interpreter.worldMapEvent.coord1.packed();
												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) {
												Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Interpreter.worldMapEvent.coord2.packed();
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
