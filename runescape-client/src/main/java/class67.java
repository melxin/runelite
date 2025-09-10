import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cl")
public enum class67 implements Enum {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lcl;"
	)
	field920(0, -1),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lcl;"
	)
	field915(1, 1),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lcl;"
	)
	field916(2, 7),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lcl;"
	)
	field922(3, 8),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lcl;"
	)
	field914(4, 9);

	@ObfuscatedName("av")
	@Export("ByteArrayPool_arrays")
	public static byte[][][] ByteArrayPool_arrays;
	@ObfuscatedName("lg")
	@ObfuscatedGetter(
		intValue = -1034470859
	)
	static int field918;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1899899125
	)
	final int field919;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1965814625
	)
	final int field921;

	class67(int var3, int var4) {
		this.field919 = var3;
		this.field921 = var4;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1935172756"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field921;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "1508982215"
	)
	public static void method2156(AbstractArchive var0) {
		class181.FloorOverlayDefinition_archive = var0;
	}

	@ObfuscatedName("ml")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1443965317"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) {
			WorldMapID.method6832(var0 - var2, var1 - var3);
		}

		long var4 = -1L;
		int var6 = 0;
		long var7 = -1L;
		int var9 = 0;

		while (true) {
			int var11 = ViewportMouse.ViewportMouse_entityCount;
			if (var9 >= var11) {
				if (-1L != var4) {
					var9 = (int)(var4 >>> 0 & 127L);
					var11 = class144.method3737(var4);
					Player var12 = (Player)class333.topLevelWorldView.players.get((long)Client.combatTargetPlayerIndex);
					UrlRequest.addPlayerToMenu(var12, Client.combatTargetPlayerIndex, var9, var11, var6);
				}

				return;
			}

			long var31 = ViewportMouse.ViewportMouse_entityTags[var9];
			if (var31 != var7) {
				label517: {
					var7 = var31;
					int var16 = VarbitComposition.method4513(var9);
					int var17 = class144.method3737(ViewportMouse.ViewportMouse_entityTags[var9]);
					int var18 = var17;
					int var19 = TransformationMatrix.method9179(var9);
					int var20 = ItemComposition.method4735(var9);
					int var21 = UserComparator8.method3543(var9);
					WorldEntity var22 = null;
					WorldView var23 = null;
					var22 = (WorldEntity)class333.topLevelWorldView.worldEntities.get((long)var21);
					if (var21 >= 0 && var22 != null) {
						if (var22.method10065()) {
							break label517;
						}

						var23 = var22.worldView;
					} else if (var21 == -1) {
						var22 = null;
						var23 = class333.topLevelWorldView;
					}

					if (var23 != null) {
						int var24 = UserComparator4.method3535(var21, var22, var23);
						if (var24 != -1) {
							label496: {
								int var28;
								String[] var42;
								if (var19 == 2 && var23.scene.getObjectFlags(var24, var16, var17, var31) >= 0) {
									ObjectComposition var25 = ModeWhere.getObjectDefinition(var20);
									if (var25.transforms != null) {
										var25 = var25.transform();
									}

									if (var25 == null) {
										break label496;
									}

									PendingSpawn var26 = null;

									for (PendingSpawn var27 = (PendingSpawn)var23.pendingSpawns.last(); var27 != null; var27 = (PendingSpawn)var23.pendingSpawns.previous()) {
										if (var24 == var27.plane && var16 == var27.x && var18 == var27.y && var20 == var27.field1027) {
											var26 = var27;
											break;
										}
									}

									if (!WorldMapID.field3470 && Client.isItemSelected == 1) {
										class423.insertMenuItem("Use", Client.field528 + " " + "->" + " " + class134.colorStartTag(65535) + var25.name, 1, var20, var16, var18, -1, false, var21);
									} else if (Client.isSpellSelected) {
										if (!WorldMapID.field3470 && (class337.selectedSpellFlags & 4) == 4) {
											class423.insertMenuItem(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class134.colorStartTag(65535) + var25.name, 2, var20, var16, var18, -1, false, var21);
										}
									} else {
										var42 = var25.actions;
										if (var42 != null) {
											for (var28 = 4; var28 >= 0; --var28) {
												if (!WorldMapID.field3470 && (var26 == null || var26.method2400(var28))) {
													String var29 = var42[var28];
													if (var26 != null && var26.method2408(var28)) {
														var29 = var26.method2402(var28);
													}

													if (var29 != null) {
														short var30 = 0;
														if (var28 == 0) {
															var30 = 3;
														}

														if (var28 == 1) {
															var30 = 4;
														}

														if (var28 == 2) {
															var30 = 5;
														}

														if (var28 == 3) {
															var30 = 6;
														}

														if (var28 == 4) {
															var30 = 1001;
														}

														class423.insertMenuItem(var29, class134.colorStartTag(65535) + var25.name, var30, var20, var16, var18, -1, false, var21);
													}
												}
											}
										}

										class423.insertMenuItem("Examine", class134.colorStartTag(65535) + var25.name, 1002, var25.id, var16, var18, -1, false, var21);
									}
								}

								int var33;
								NPC var43;
								int[] var44;
								Player var46;
								if (var19 == 1) {
									NPC var36 = (NPC)var23.npcs.get((long)var20);
									if (var36 == null) {
										break label496;
									}

									if (var36.definition.size == 1 && (var36.x & 127) == 64 && (var36.y & 127) == 64) {
										for (var33 = 0; var33 < var23.field1161.method9790(); ++var33) {
											var43 = (NPC)var23.npcs.get((long)var23.field1161.method9787(var33));
											if (var43 != null && var36 != var43 && var43.definition.size == 1 && var36.x == var43.x && var36.y == var43.y) {
												GameEngine.addNpcToMenu(var43, var43.index, var16, var18, var21);
											}
										}

										var33 = Client.playerUpdateManager.playerCount;
										var44 = Client.playerUpdateManager.playerIndices;

										for (var28 = 0; var28 < var33; ++var28) {
											var46 = (Player)var23.players.get((long)var44[var28]);
											if (var46 != null && var36.x == var46.x && var46.y == var36.y) {
												UrlRequest.addPlayerToMenu(var46, var44[var28], var16, var18, var21);
											}
										}
									}

									GameEngine.addNpcToMenu(var36, var20, var16, var18, var21);
								}

								if (var19 == 0) {
									Player var37 = (Player)var23.players.get((long)var20);
									if (var37 == null) {
										break label496;
									}

									if ((var37.x & 127) == 64 && (var37.y & 127) == 64) {
										for (var33 = 0; var33 < var23.field1161.method9790(); ++var33) {
											var43 = (NPC)var23.npcs.get((long)var23.field1161.method9787(var33));
											if (var43 != null && var43.definition.size == 1 && var43.x == var37.x && var37.y == var43.y) {
												GameEngine.addNpcToMenu(var43, var23.field1161.method9787(var33), var16, var18, var21);
											}
										}

										var33 = Client.playerUpdateManager.playerCount;
										var44 = Client.playerUpdateManager.playerIndices;

										for (var28 = 0; var28 < var33; ++var28) {
											var46 = (Player)var23.players.get((long)var44[var28]);
											if (var46 != null && var46 != var37 && var37.x == var46.x && var46.y == var37.y) {
												UrlRequest.addPlayerToMenu(var46, var44[var28], var16, var18, var21);
											}
										}
									}

									if (var20 != Client.combatTargetPlayerIndex) {
										UrlRequest.addPlayerToMenu(var37, var20, var16, var18, var21);
									} else {
										var4 = var31;
										var6 = var21;
									}
								}

								if (var19 == 3) {
									NodeDeque var38 = var23.groundItems[var24][var16][var18];
									if (var38 != null) {
										for (TileItem var39 = (TileItem)var38.first(); var39 != null; var39 = (TileItem)var38.next()) {
											ItemComposition var45 = AttackOption.ItemDefinition_get(var39.id);
											if (!ArchiveLoader.field860 && Client.isItemSelected == 1) {
												class423.insertMenuItem("Use", Client.field528 + " " + "->" + " " + class134.colorStartTag(16748608) + var45.name, 16, var39.id, var16, var18, -1, false, var21);
											} else if (Client.isSpellSelected) {
												if (!ArchiveLoader.field860 && (class337.selectedSpellFlags & 1) == 1) {
													class423.insertMenuItem(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class134.colorStartTag(16748608) + var45.name, 17, var39.id, var16, var18, -1, false, var21);
												}
											} else {
												String[] var35 = var45.groundActions;

												for (int var34 = 4; var34 >= 0; --var34) {
													if (!ArchiveLoader.field860 && var39.method2820(var34)) {
														if (var35 != null && var35[var34] != null) {
															byte var47 = 0;
															if (var34 == 0) {
																var47 = 18;
															}

															if (var34 == 1) {
																var47 = 19;
															}

															if (var34 == 2) {
																var47 = 20;
															}

															if (var34 == 3) {
																var47 = 21;
															}

															if (var34 == 4) {
																var47 = 22;
															}

															class423.insertMenuItem(var35[var34], class134.colorStartTag(16748608) + var45.name, var47, var39.id, var16, var18, -1, false, var21);
														} else if (var34 == 2) {
															class423.insertMenuItem("Take", class134.colorStartTag(16748608) + var45.name, 20, var39.id, var16, var18, -1, false, var21);
														}
													}
												}

												class423.insertMenuItem("Examine", class134.colorStartTag(16748608) + var45.name, 1004, var39.id, var16, var18, -1, false, var21);
											}
										}
									}
								}

								if (var19 == 4) {
									WorldEntity var40 = (WorldEntity)var23.worldEntities.get((long)var20);
									if (var40 != null) {
										class203 var41 = var40.field5425;
										if (Client.isItemSelected == 1) {
											class423.insertMenuItem("Use", Client.field528 + " " + "->" + " " + class134.colorStartTag(65280) + var41.field2233, 61, var20, var16, var18, -1, false, var21);
										} else if (!Client.isSpellSelected) {
											var42 = var41.field2234;
											if (var42 != null) {
												for (var28 = 4; var28 >= 0; --var28) {
													if (var40.method10076(var28) && var42[var28] != null) {
														byte var48 = 0;
														if (var28 == 0) {
															var48 = 63;
														}

														if (var28 == 1) {
															var48 = 64;
														}

														if (var28 == 2) {
															var48 = 65;
														}

														if (var28 == 3) {
															var48 = 66;
														}

														if (var28 == 4) {
															var48 = 67;
														}

														class423.insertMenuItem(var42[var28], class134.colorStartTag(65280) + var41.field2233, var48, var20, var16, var18, -1, false, var21);
													}
												}
											}

											class423.insertMenuItem("Examine", class134.colorStartTag(65280) + var41.field2233, 1013, var41.method4447(), var16, var18, -1, false, var21);
										}
									}
								}
							}
						}
					}
				}
			}

			++var9;
		}
	}

	@ObfuscatedName("pq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1715705103"
	)
	static void method2155() {
		if (Client.field377 && HealthBarUpdate.localPlayer != null) {
			int var0 = HealthBarUpdate.localPlayer.pathX[0];
			int var1 = HealthBarUpdate.localPlayer.pathY[0];
			if (var0 < 0 || 104 <= var0 || var1 < 0 || 104 <= var1) {
				return;
			}

			class172.oculusOrbFocalPointX = HealthBarUpdate.localPlayer.x;
			int var2 = JagNetThread.method8434(class333.topLevelWorldView, HealthBarUpdate.localPlayer.x, HealthBarUpdate.localPlayer.y, class333.topLevelWorldView.plane) - Client.camFollowHeight;
			if (var2 < class191.oculusOrbFocalPointZ) {
				class191.oculusOrbFocalPointZ = var2;
			}

			BuddyRankComparator.oculusOrbFocalPointY = HealthBarUpdate.localPlayer.y;
			Client.field377 = false;
		}

	}
}
