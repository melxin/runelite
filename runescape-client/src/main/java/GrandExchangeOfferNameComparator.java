import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pc")
@Implements("GrandExchangeOfferNameComparator")
final class GrandExchangeOfferNameComparator implements Comparator {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpx;Lpx;I)I",
		garbageValue = "1368932515"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.getOfferName().compareTo(var2.getOfferName());
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Lcw;",
		garbageValue = "-1123307891"
	)
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? GZipDecompressor.World_worlds[++World.World_listCount - 1] : null;
	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(Ldp;IIIIIIIII)V",
		garbageValue = "-1205351257"
	)
	@Export("addPendingSpawnToScene")
	static final void addPendingSpawnToScene(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Scene var9 = var0.scene;
		if (var3 >= 1 && var4 >= 1 && var3 <= var0.sizeX - 1 && var4 <= var0.sizeY - 1) {
			if (Client.isLowDetail && var0.plane != var1) {
				return;
			}

			long var10 = 0L;
			boolean var12 = true;
			boolean var13 = false;
			boolean var14 = false;
			if (var2 == 0) {
				var10 = var9.getBoundaryObjectTag(var1, var3, var4);
			}

			if (var2 == 1) {
				var10 = var9.getWallDecorationTag(var1, var3, var4);
			}

			if (var2 == 2) {
				var10 = var9.getGameObjectTag(var1, var3, var4);
			}

			if (var2 == 3) {
				var10 = var9.getFloorDecorationTag(var1, var3, var4);
			}

			int var15;
			int var18;
			int var19;
			int var20;
			int var21;
			int var22;
			int var23;
			int var24;
			if (var10 != 0L) {
				var15 = var9.getObjectFlags(var1, var3, var4, var10);
				int var45 = FaceNormal.Entity_unpackID(var10);
				int var46 = var15 & 31;
				int var47 = var15 >> 6 & 3;
				ObjectComposition var16 = class177.getObjectDefinition(var45);
				if (var16 != null && var16.hasSound()) {
					var19 = var16.sizeX;
					var20 = var16.sizeY;
					if (var47 == 1 || var47 == 3) {
						var19 = var16.sizeY;
						var20 = var16.sizeX;
					}

					var21 = (var3 + var19) * 128;
					var22 = (var20 + var4) * 128;
					int var17 = var3 * 128;
					var18 = var4 * 128;
					var23 = var16.ambientSoundId;
					var24 = var16.int7 * 16384;
					int var25 = var16.int8 * 128;
					if (var16.transforms != null) {
						ObjectComposition var26 = var16.transform();
						if (var26 != null) {
							var23 = var26.ambientSoundId;
							var24 = var26.int7 * 16384;
							var25 = var26.int8 * 128;
						}
					}

					Object var10000 = null;

					for (ObjectSound var49 = (ObjectSound)ObjectSound.objectSounds.last(); var49 != null; var49 = (ObjectSound)ObjectSound.objectSounds.previous()) {
						if (var49.plane == var1 && var17 == var49.x * 16384 && var18 == var49.y * 128 && var21 == var49.maxX * 128 && var22 == var49.maxY * 16384 && var23 == var49.soundEffectId && var24 == var49.field855 && var25 == var49.field856) {
							if (var49.stream1 != null) {
								WorldMapIcon_0.pcmStreamMixer.removeSubStream(var49.stream1);
								var49.stream1 = null;
							}

							if (var49.stream2 != null) {
								WorldMapIcon_0.pcmStreamMixer.removeSubStream(var49.stream2);
								var49.stream2 = null;
							}

							var49.remove();
							break;
						}

						var10000 = null;
					}
				}

				if (var2 == 0) {
					var9.removeBoundaryObject(var1, var3, var4);
					if (var16.interactType != 0) {
						var0.collisionMaps[var1].method5640(var3, var4, var46, var47, var16.boolean1);
					}
				}

				if (var2 == 1) {
					var9.removeWallDecoration(var1, var3, var4);
				}

				if (var2 == 2) {
					var9.removeGameObject(var1, var3, var4);
					if (var3 + var16.sizeX > var0.sizeX - 1 || var4 + var16.sizeX > var0.sizeY - 1 || var3 + var16.sizeY > var0.sizeX - 1 || var4 + var16.sizeY > var0.sizeY - 1) {
						return;
					}

					if (var16.interactType != 0) {
						var0.collisionMaps[var1].setFlagOffNonSquare(var3, var4, var16.sizeX, var16.sizeY, var47, var16.boolean1);
					}
				}

				if (var2 == 3) {
					var9.removeFloorDecoration(var1, var3, var4);
					if (var16.interactType == 1) {
						var0.collisionMaps[var1].method5639(var3, var4);
					}
				}
			}

			if (var5 >= 0) {
				var15 = var1;
				if (var1 < 3 && (var0.tileSettings[1][var3][var4] & 2) == 2) {
					var15 = var1 + 1;
				}

				CollisionMap var48 = var0.collisionMaps[var1];
				ObjectComposition var39 = class177.getObjectDefinition(var5);
				var18 = var8 >= 0 ? var8 : var39.animationId;
				if (var6 != 1 && var6 != 3) {
					var19 = var39.sizeX;
					var20 = var39.sizeY;
				} else {
					var19 = var39.sizeY;
					var20 = var39.sizeX;
				}

				if (var3 + var19 <= var0.sizeX) {
					var21 = var3 + (var19 >> 1);
					var22 = var3 + (var19 + 1 >> 1);
				} else {
					var21 = var3;
					var22 = var3 + 1;
				}

				if (var20 + var4 <= var0.sizeY) {
					var23 = (var20 >> 1) + var4;
					var24 = (var20 + 1 >> 1) + var4;
				} else {
					var23 = var4;
					var24 = var4 + 1;
				}

				int[][] var40 = var0.tileHeights[var15];
				int var41 = var40[var22][var24] + var40[var21][var24] + var40[var21][var23] + var40[var22][var23] >> 2;
				int var27 = (var3 << 7) + (var19 << 6);
				int var28 = (var4 << 7) + (var20 << 6);
				Scene var29 = var0.scene;
				long var30 = HttpRequestTask.calculateTag(var3, var4, 2, var39.int1 == 0, var5, var0.id);
				int var32 = (var6 << 6) + var7;
				if (var39.int3 == 1) {
					var32 += 256;
				}

				Object var43;
				if (var7 == 22) {
					if (var18 == -1 && var39.transforms == null) {
						var43 = var39.getModel(22, var6, var40, var27, var41, var28);
					} else {
						var43 = new DynamicObject(var0, var5, 22, var6, var15, var3, var4, var18, var39.boolean3, (Renderable)null);
					}

					var29.newFloorDecoration(var1, var3, var4, var41, (Renderable)var43, var30, var32);
					if (var39.interactType == 1 && var48 != null) {
						var48.setBlockedByFloorDec(var3, var4);
					}
				} else if (var7 != 10 && var7 != 11) {
					if (var7 >= 12) {
						if (var18 == -1 && var39.transforms == null) {
							var43 = var39.getModel(var7, var6, var40, var27, var41, var28);
						} else {
							var43 = new DynamicObject(var0, var5, var7, var6, var15, var3, var4, var18, var39.boolean3, (Renderable)null);
						}

						var29.method5088(var1, var3, var4, var41, 1, 1, (Renderable)var43, 0, var30, var32);
						if (var39.interactType != 0 && var48 != null) {
							var48.addGameObject(var3, var4, var19, var20, var39.boolean1);
						}
					} else if (var7 == 0) {
						if (var18 == -1 && var39.transforms == null) {
							var43 = var39.getModel(0, var6, var40, var27, var41, var28);
						} else {
							var43 = new DynamicObject(var0, var5, 0, var6, var15, var3, var4, var18, var39.boolean3, (Renderable)null);
						}

						var29.newBoundaryObject(var1, var3, var4, var41, (Renderable)var43, (Renderable)null, Tiles.field1051[var6], 0, var30, var32);
						if (var39.interactType != 0 && var48 != null) {
							var48.method5635(var3, var4, var7, var6, var39.boolean1);
						}
					} else if (var7 == 1) {
						if (var18 == -1 && var39.transforms == null) {
							var43 = var39.getModel(1, var6, var40, var27, var41, var28);
						} else {
							var43 = new DynamicObject(var0, var5, 1, var6, var15, var3, var4, var18, var39.boolean3, (Renderable)null);
						}

						var29.newBoundaryObject(var1, var3, var4, var41, (Renderable)var43, (Renderable)null, Tiles.field1052[var6], 0, var30, var32);
						if (var39.interactType != 0 && var48 != null) {
							var48.method5635(var3, var4, var7, var6, var39.boolean1);
						}
					} else {
						int var33;
						if (var7 == 2) {
							var33 = var6 + 1 & 3;
							Object var35;
							Object var44;
							if (var18 == -1 && var39.transforms == null) {
								var44 = var39.getModel(2, var6 + 4, var40, var27, var41, var28);
								var35 = var39.getModel(2, var33, var40, var27, var41, var28);
							} else {
								var44 = new DynamicObject(var0, var5, 2, var6 + 4, var15, var3, var4, var18, var39.boolean3, (Renderable)null);
								var35 = new DynamicObject(var0, var5, 2, var33, var15, var3, var4, var18, var39.boolean3, (Renderable)null);
							}

							var29.newBoundaryObject(var1, var3, var4, var41, (Renderable)var44, (Renderable)var35, Tiles.field1051[var6], Tiles.field1051[var33], var30, var32);
							if (var39.interactType != 0 && var48 != null) {
								var48.method5635(var3, var4, var7, var6, var39.boolean1);
							}
						} else if (var7 == 3) {
							if (var18 == -1 && var39.transforms == null) {
								var43 = var39.getModel(3, var6, var40, var27, var41, var28);
							} else {
								var43 = new DynamicObject(var0, var5, 3, var6, var15, var3, var4, var18, var39.boolean3, (Renderable)null);
							}

							var29.newBoundaryObject(var1, var3, var4, var41, (Renderable)var43, (Renderable)null, Tiles.field1052[var6], 0, var30, var32);
							if (var39.interactType != 0 && var48 != null) {
								var48.method5635(var3, var4, var7, var6, var39.boolean1);
							}
						} else if (var7 == 9) {
							if (var18 == -1 && var39.transforms == null) {
								var43 = var39.getModel(var7, var6, var40, var27, var41, var28);
							} else {
								var43 = new DynamicObject(var0, var5, var7, var6, var15, var3, var4, var18, var39.boolean3, (Renderable)null);
							}

							var29.method5088(var1, var3, var4, var41, 1, 1, (Renderable)var43, 0, var30, var32);
							if (var39.interactType != 0 && var48 != null) {
								var48.addGameObject(var3, var4, var19, var20, var39.boolean1);
							}
						} else if (var7 == 4) {
							if (var18 == -1 && var39.transforms == null) {
								var43 = var39.getModel(4, var6, var40, var27, var41, var28);
							} else {
								var43 = new DynamicObject(var0, var5, 4, var6, var15, var3, var4, var18, var39.boolean3, (Renderable)null);
							}

							var29.newWallDecoration(var1, var3, var4, var41, (Renderable)var43, (Renderable)null, Tiles.field1051[var6], 0, 0, 0, var30, var32);
						} else {
							long var34;
							Object var36;
							if (var7 == 5) {
								var33 = 16;
								var34 = var29.getBoundaryObjectTag(var1, var3, var4);
								if (0L != var34) {
									var33 = class177.getObjectDefinition(FaceNormal.Entity_unpackID(var34)).int2;
								}

								if (var18 == -1 && var39.transforms == null) {
									var36 = var39.getModel(4, var6, var40, var27, var41, var28);
								} else {
									var36 = new DynamicObject(var0, var5, 4, var6, var15, var3, var4, var18, var39.boolean3, (Renderable)null);
								}

								var29.newWallDecoration(var1, var3, var4, var41, (Renderable)var36, (Renderable)null, Tiles.field1051[var6], 0, Tiles.field1053[var6] * var33, Tiles.field1058[var6] * var33, var30, var32);
							} else if (var7 == 6) {
								var33 = 8;
								var34 = var29.getBoundaryObjectTag(var1, var3, var4);
								if (0L != var34) {
									var33 = class177.getObjectDefinition(FaceNormal.Entity_unpackID(var34)).int2 / 2;
								}

								if (var18 == -1 && var39.transforms == null) {
									var36 = var39.getModel(4, var6 + 4, var40, var27, var41, var28);
								} else {
									var36 = new DynamicObject(var0, var5, 4, var6 + 4, var15, var3, var4, var18, var39.boolean3, (Renderable)null);
								}

								var29.newWallDecoration(var1, var3, var4, var41, (Renderable)var36, (Renderable)null, 256, var6, Tiles.field1055[var6] * var33, Tiles.field1056[var6] * var33, var30, var32);
							} else if (var7 == 7) {
								int var42 = var6 + 2 & 3;
								if (var18 == -1 && var39.transforms == null) {
									var43 = var39.getModel(4, var42 + 4, var40, var27, var41, var28);
								} else {
									var43 = new DynamicObject(var0, var5, 4, var42 + 4, var15, var3, var4, var18, var39.boolean3, (Renderable)null);
								}

								var29.newWallDecoration(var1, var3, var4, var41, (Renderable)var43, (Renderable)null, 256, var42, 0, 0, var30, var32);
							} else if (var7 == 8) {
								var33 = 8;
								var34 = var29.getBoundaryObjectTag(var1, var3, var4);
								if (var34 != 0L) {
									var33 = class177.getObjectDefinition(FaceNormal.Entity_unpackID(var34)).int2 / 2;
								}

								int var38 = var6 + 2 & 3;
								Object var37;
								if (var18 == -1 && var39.transforms == null) {
									var36 = var39.getModel(4, var6 + 4, var40, var27, var41, var28);
									var37 = var39.getModel(4, var38 + 4, var40, var27, var41, var28);
								} else {
									var36 = new DynamicObject(var0, var5, 4, var6 + 4, var15, var3, var4, var18, var39.boolean3, (Renderable)null);
									var37 = new DynamicObject(var0, var5, 4, var38 + 4, var15, var3, var4, var18, var39.boolean3, (Renderable)null);
								}

								var29.newWallDecoration(var1, var3, var4, var41, (Renderable)var36, (Renderable)var37, 256, var6, Tiles.field1055[var6] * var33, Tiles.field1056[var6] * var33, var30, var32);
							}
						}
					}
				} else {
					if (var18 == -1 && var39.transforms == null) {
						var43 = var39.getModel(10, var6, var40, var27, var41, var28);
					} else {
						var43 = new DynamicObject(var0, var5, 10, var6, var15, var3, var4, var18, var39.boolean3, (Renderable)null);
					}

					if (var43 != null) {
						var29.method5088(var1, var3, var4, var41, var19, var20, (Renderable)var43, var7 == 11 ? 256 : 0, var30, var32);
					}

					if (var39.interactType != 0 && var48 != null) {
						var48.addGameObject(var3, var4, var19, var20, var39.boolean1);
					}
				}

				var39 = class177.getObjectDefinition(var5);
				if (var39 != null && var39.hasSound()) {
					WorldMapIcon_1.createObjectSound(var15, var3, var4, var39, var6);
				}
			}
		}

	}
}
