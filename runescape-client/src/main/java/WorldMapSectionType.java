import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lh")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements Enum {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("WORLDMAPSECTIONTYPE0")
	WORLDMAPSECTIONTYPE0(3, (byte)0),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("WORLDMAPSECTIONTYPE1")
	WORLDMAPSECTIONTYPE1(1, (byte)1),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("WORLDMAPSECTIONTYPE2")
	WORLDMAPSECTIONTYPE2(0, (byte)2),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("WORLDMAPSECTIONTYPE3")
	WORLDMAPSECTIONTYPE3(2, (byte)3);

	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -2040317245
	)
	@Export("type")
	final int type;
	@ObfuscatedName("aq")
	@Export("id")
	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3;
		this.id = var4;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1746725635"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "32"
	)
	@Export("changeWorldSelectSorting")
	static void changeWorldSelectSorting(int var0, int var1) {
		int[] var2 = new int[4];
		int[] var3 = new int[4];
		var2[0] = var0;
		var3[0] = var1;
		int var4 = 1;

		for (int var5 = 0; var5 < 4; ++var5) {
			if (World.World_sortOption1[var5] != var0) {
				var2[var4] = World.World_sortOption1[var5];
				var3[var4] = World.World_sortOption2[var5];
				++var4;
			}
		}

		World.World_sortOption1 = var2;
		World.World_sortOption2 = var3;
		class171.sortWorlds(World.World_worlds, 0, World.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)[Llh;",
		garbageValue = "-457082308"
	)
	static WorldMapSectionType[] method6299() {
		return new WorldMapSectionType[]{WORLDMAPSECTIONTYPE3, WORLDMAPSECTIONTYPE2, WORLDMAPSECTIONTYPE0, WORLDMAPSECTIONTYPE1};
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "673925099"
	)
	static final void method6302(int var0, int var1, int var2) {
		if (MusicPatchNode2.cameraX < var0) {
			MusicPatchNode2.cameraX = (var0 - MusicPatchNode2.cameraX) * class342.field3777 / 1000 + MusicPatchNode2.cameraX + WorldEntity.field5170;
			if (MusicPatchNode2.cameraX > var0) {
				MusicPatchNode2.cameraX = var0;
			}
		}

		if (MusicPatchNode2.cameraX > var0) {
			MusicPatchNode2.cameraX -= (MusicPatchNode2.cameraX - var0) * class342.field3777 / 1000 + WorldEntity.field5170;
			if (MusicPatchNode2.cameraX < var0) {
				MusicPatchNode2.cameraX = var0;
			}
		}

		if (TaskHandler.cameraY < var1) {
			TaskHandler.cameraY = (var1 - TaskHandler.cameraY) * class342.field3777 / 1000 + TaskHandler.cameraY + WorldEntity.field5170;
			if (TaskHandler.cameraY > var1) {
				TaskHandler.cameraY = var1;
			}
		}

		if (TaskHandler.cameraY > var1) {
			TaskHandler.cameraY -= (TaskHandler.cameraY - var1) * class342.field3777 / 1000 + WorldEntity.field5170;
			if (TaskHandler.cameraY < var1) {
				TaskHandler.cameraY = var1;
			}
		}

		if (SceneTilePaint.cameraZ < var2) {
			SceneTilePaint.cameraZ = (var2 - SceneTilePaint.cameraZ) * class342.field3777 / 1000 + SceneTilePaint.cameraZ + WorldEntity.field5170;
			if (SceneTilePaint.cameraZ > var2) {
				SceneTilePaint.cameraZ = var2;
			}
		}

		if (SceneTilePaint.cameraZ > var2) {
			SceneTilePaint.cameraZ -= (SceneTilePaint.cameraZ - var2) * class342.field3777 / 1000 + WorldEntity.field5170;
			if (SceneTilePaint.cameraZ < var2) {
				SceneTilePaint.cameraZ = var2;
			}
		}

	}

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1320089364"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		int var14;
		int var15;
		int var16;
		class442 var22;
		int var32;
		int var38;
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) {
			int var4 = var0 - var2;
			int var5 = var1 - var3;
			int[] var6 = new int[Client.worldViewManager.method2575()];
			float[] var7 = new float[Client.worldViewManager.method2575()];
			int var8 = 0;

			for (Iterator var9 = Client.worldViewManager.iterator(); var9.hasNext(); ++var8) {
				WorldView var10 = (WorldView)var9.next();
				var6[var8] = var10.id;
				var7[var8] = var10.scene.field2082;
			}

			WorldEntityCoord.method5845(var7, var6);
			HashMap var59 = new HashMap();

			for (var8 = var6.length - 1; var8 >= 0; --var8) {
				if (var7[var8] > 0.0F || var6[var8] == -1) {
					class505 var60 = Client.worldViewManager.method2578(var6[var8]);
					if (!var59.containsKey(var60)) {
						var59.put(var60, var6[var8]);
					}
				}
			}

			for (var8 = 0; var8 < var6.length; ++var8) {
				var32 = var6[var8];
				class505 var11 = Client.worldViewManager.method2578(var32);
				Integer var12 = (Integer)var59.get(var11);
				if (var12 != null && var12.equals(var32)) {
					if (var11 == class505.field5237) {
						UserComparator6.insertMenuItem("Walk here", "", 23, 0, var4, var5, 0, false, var32);
					} else if (var11 == class505.field5239) {
						var14 = Client.field758;
						var15 = MusicPatchNode2.cameraX;
						var16 = TaskHandler.cameraY;
						int var17 = SceneTilePaint.cameraZ;
						float var18 = 1.0E-5F;
						class376.method7548(Scene.field2059.field2145, Scene.field2059.field2111, Scene.field2059.field2112, Scene.field2059.field2096);
						class442 var19 = class219.method4844(0.0F, 1.0F, 0.0F);
						float var20 = class436.method8284(var19, ViewportMouse.field2299);
						class442 var13;
						if (Math.abs(var20) < 1.0E-5F) {
							var19.method8339();
							var13 = null;
						} else {
							class442 var21 = class219.method4844((float)var15, (float)var16, (float)var17);
							var22 = class219.method4844(var21.field4918, var21.field4915 - (float)var14, var21.field4922);
							float var23 = -class436.method8284(var19, var22) / var20;
							var19.method8339();
							if (var23 < 0.0F) {
								var22.method8339();
								var21.method8339();
								var13 = null;
							} else {
								class442 var25 = ViewportMouse.field2299;
								class442 var26;
								synchronized(class442.field4917) {
									if (class442.field4920 == 0) {
										var26 = new class442(var25);
									} else {
										class442.field4917[--class442.field4920].method8341(var25);
										var26 = class442.field4917[class442.field4920];
									}
								}

								var26.method8355(var23);
								class442 var28;
								synchronized(class442.field4917) {
									if (class442.field4920 == 0) {
										var28 = new class442(var21);
									} else {
										class442.field4917[--class442.field4920].method8341(var21);
										var28 = class442.field4917[class442.field4920];
									}
								}

								var28.method8345(var26);
								var26.method8339();
								var22.method8339();
								var21.method8339();
								var13 = var28;
							}
						}

						if (var13 != null) {
							var19 = class219.method4844((float)Client.field696, (float)Client.field758, (float)Client.field697);
							class442 var34 = SpriteMask.method6872(var13, var19);
							var22 = class442.field4916;
							class442 var35;
							synchronized(class442.field4917) {
								if (class442.field4920 == 0) {
									var35 = new class442(var22);
								} else {
									class442.field4917[--class442.field4920].method8341(var22);
									var35 = class442.field4917[class442.field4920];
								}
							}

							var35.method8369(var34);
							float var36 = (float)Math.atan2((double)class436.method8284(var35, class442.field4921), (double)class436.method8284(class442.field4916, var34));
							int var37 = (int)((double)var36 / 6.283185307179586D * 2048.0D) & 2047;
							var38 = NPC.method2949(var37);
							UserComparator6.insertMenuItem("Set heading", "", 60, var38, 0, 0, 0, false, var32);
							var19.method8339();
							var34.method8339();
							var35.method8339();
							var13.method8339();
						}
					}
				}
			}
		}

		long var39 = -1L;
		int var41 = 0;
		long var42 = -1L;

		int var44;
		for (var44 = 0; var44 < TileItem.method2980(); ++var44) {
			long var45 = ViewportMouse.ViewportMouse_entityTags[var44];
			if (var45 != var42) {
				var42 = var45;
				var14 = WorldMapID.method6350(var44);
				var15 = MilliClock.method4833(ViewportMouse.ViewportMouse_entityTags[var44]);
				var16 = var15;
				long var49 = ViewportMouse.ViewportMouse_entityTags[var44];
				int var62 = (int)(var49 >>> 16 & 7L);
				int var51 = HttpMethod.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var44]);
				int var63 = var51;
				int var52 = class447.method8528(var44);
				var22 = null;
				WorldView var77 = null;
				WorldEntity var64 = (WorldEntity)class509.topLevelWorldView.worldEntities.get((long)var52);
				if (var52 >= 0 && var64 != null) {
					if (var64.method9347()) {
						continue;
					}

					var77 = var64.worldView;
				} else if (var52 == -1) {
					var64 = null;
					var77 = class509.topLevelWorldView;
				}

				if (var77 != null) {
					int var78 = class437.method8290(var52, var64, var77);
					if (var78 != -1) {
						int var53;
						if (var62 == 2 && var77.scene.getObjectFlags(var78, var14, var15, var45) >= 0) {
							ObjectComposition var65 = class162.getObjectDefinition(var51);
							if (var65.transforms != null) {
								var65 = var65.transform();
							}

							if (var65 == null) {
								continue;
							}

							PendingSpawn var68 = null;

							for (PendingSpawn var27 = (PendingSpawn)var77.pendingSpawns.last(); var27 != null; var27 = (PendingSpawn)var77.pendingSpawns.previous()) {
								if (var78 == var27.plane && var14 == var27.x && var16 == var27.y && var63 == var27.field1200) {
									var68 = var27;
									break;
								}
							}

							if (!SpotAnimationDefinition.field2792 && Client.isItemSelected == 1) {
								UserComparator6.insertMenuItem("Use", Client.field713 + " " + "->" + " " + Decimator.colorStartTag(65535) + var65.name, 1, var63, var14, var16, -1, false, var52);
							} else if (Client.isSpellSelected) {
								if (!SpotAnimationDefinition.field2792 && (class31.selectedSpellFlags & 4) == 4) {
									UserComparator6.insertMenuItem(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + Decimator.colorStartTag(65535) + var65.name, 2, var63, var14, var16, -1, false, var52);
								}
							} else {
								String[] var70 = var65.actions;
								if (var70 != null) {
									for (var53 = 4; var53 >= 0; --var53) {
										if (!SpotAnimationDefinition.field2792 && (var68 == null || var68.method2622(var53))) {
											String var29 = var70[var53];
											if (var68 != null && var68.method2634(var53)) {
												var29 = var68.method2621(var53);
											}

											if (var29 != null) {
												short var54 = 0;
												if (var53 == 0) {
													var54 = 3;
												}

												if (var53 == 1) {
													var54 = 4;
												}

												if (var53 == 2) {
													var54 = 5;
												}

												if (var53 == 3) {
													var54 = 6;
												}

												if (var53 == 4) {
													var54 = 1001;
												}

												UserComparator6.insertMenuItem(var29, Decimator.colorStartTag(65535) + var65.name, var54, var63, var14, var16, -1, false, var52);
											}
										}
									}
								}

								UserComparator6.insertMenuItem("Examine", Decimator.colorStartTag(65535) + var65.name, 1002, var65.id, var14, var16, -1, false, var52);
							}
						}

						NPC var72;
						int[] var73;
						Player var76;
						if (var62 == 1) {
							NPC var66 = (NPC)var77.npcs.get((long)var63);
							if (var66 == null) {
								continue;
							}

							if (var66.definition.size == 1 && (var66.x & 127) == 64 && (var66.y & 127) == 64) {
								for (var38 = 0; var38 < var77.field1351.method9060(); ++var38) {
									var72 = (NPC)var77.npcs.get((long)var77.field1351.method9056(var38));
									if (var72 != null && var66 != var72 && var72.definition.size == 1 && var72.x == var66.x && var72.y == var66.y) {
										class139.addNpcToMenu(var72, var72.index, var14, var16, var52);
									}
								}

								var38 = Client.playerUpdateManager.playerCount;
								var73 = Client.playerUpdateManager.playerIndices;

								for (var53 = 0; var53 < var38; ++var53) {
									var76 = (Player)var77.players.get((long)var73[var53]);
									if (var76 != null && var76.x == var66.x && var76.y == var66.y) {
										Messages.addPlayerToMenu(var76, var73[var53], var14, var16, var52);
									}
								}
							}

							class139.addNpcToMenu(var66, var63, var14, var16, var52);
						}

						if (var62 == 0) {
							Player var67 = (Player)var77.players.get((long)var63);
							if (var67 == null) {
								continue;
							}

							if ((var67.x & 127) == 64 && (var67.y & 127) == 64) {
								for (var38 = 0; var38 < var77.field1351.method9060(); ++var38) {
									var72 = (NPC)var77.npcs.get((long)var77.field1351.method9056(var38));
									if (var72 != null && var72.definition.size == 1 && var67.x == var72.x && var67.y == var72.y) {
										class139.addNpcToMenu(var72, var77.field1351.method9056(var38), var14, var16, var52);
									}
								}

								var38 = Client.playerUpdateManager.playerCount;
								var73 = Client.playerUpdateManager.playerIndices;

								for (var53 = 0; var53 < var38; ++var53) {
									var76 = (Player)var77.players.get((long)var73[var53]);
									if (var76 != null && var76 != var67 && var76.x == var67.x && var76.y == var67.y) {
										Messages.addPlayerToMenu(var76, var73[var53], var14, var16, var52);
									}
								}
							}

							if (var63 != Client.combatTargetPlayerIndex) {
								Messages.addPlayerToMenu(var67, var63, var14, var16, var52);
							} else {
								var39 = var45;
								var41 = var52;
							}
						}

						if (var62 == 3) {
							NodeDeque var69 = var77.groundItems[var78][var14][var16];
							if (var69 != null) {
								for (TileItem var71 = (TileItem)var69.first(); var71 != null; var71 = (TileItem)var69.next()) {
									ItemComposition var75 = class231.ItemDefinition_get(var71.id);
									if (!HttpAuthenticationHeader.field5075 && Client.isItemSelected == 1) {
										UserComparator6.insertMenuItem("Use", Client.field713 + " " + "->" + " " + Decimator.colorStartTag(16748608) + var75.name, 16, var71.id, var14, var16, -1, false, var52);
									} else if (Client.isSpellSelected) {
										if (!HttpAuthenticationHeader.field5075 && (class31.selectedSpellFlags & 1) == 1) {
											UserComparator6.insertMenuItem(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + Decimator.colorStartTag(16748608) + var75.name, 17, var71.id, var14, var16, -1, false, var52);
										}
									} else {
										String[] var74 = var75.groundActions;

										for (int var55 = 4; var55 >= 0; --var55) {
											if (!HttpAuthenticationHeader.field5075 && var71.method2989(var55)) {
												if (var74 != null && var74[var55] != null) {
													byte var79 = 0;
													if (var55 == 0) {
														var79 = 18;
													}

													if (var55 == 1) {
														var79 = 19;
													}

													if (var55 == 2) {
														var79 = 20;
													}

													if (var55 == 3) {
														var79 = 21;
													}

													if (var55 == 4) {
														var79 = 22;
													}

													UserComparator6.insertMenuItem(var74[var55], Decimator.colorStartTag(16748608) + var75.name, var79, var71.id, var14, var16, -1, false, var52);
												} else if (var55 == 2) {
													UserComparator6.insertMenuItem("Take", Decimator.colorStartTag(16748608) + var75.name, 20, var71.id, var14, var16, -1, false, var52);
												}
											}
										}

										UserComparator6.insertMenuItem("Examine", Decimator.colorStartTag(16748608) + var75.name, 1004, var71.id, var14, var16, -1, false, var52);
									}
								}
							}
						}
					}
				}
			}
		}

		if (var39 != -1L) {
			var44 = MouseHandler.method674(var39);
			var32 = MilliClock.method4833(var39);
			Player var61 = (Player)class509.topLevelWorldView.players.get((long)Client.combatTargetPlayerIndex);
			Messages.addPlayerToMenu(var61, Client.combatTargetPlayerIndex, var44, var32, var41);
		}

	}
}
