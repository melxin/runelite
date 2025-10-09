import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ty")
@Implements("AbstractUserComparator")
public abstract class AbstractUserComparator implements Comparator {
	@ObfuscatedName("nn")
	static boolean field5455;
	@ObfuscatedName("ob")
	@Export("regionLandArchives")
	static byte[][] regionLandArchives;
	@ObfuscatedName("at")
	@Export("nextComparator")
	Comparator nextComparator;

	protected AbstractUserComparator() {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;I)V",
		garbageValue = "925583274"
	)
	@Export("addComparator")
	final void addComparator(Comparator var1) {
		if (this.nextComparator == null) {
			this.nextComparator = var1;
		} else if (this.nextComparator instanceof AbstractUserComparator) {
			((AbstractUserComparator)this.nextComparator).addComparator(var1);
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ltk;Ltk;I)I",
		garbageValue = "-2034563284"
	)
	@Export("compareUser")
	protected final int compareUser(User var1, User var2) {
		return this.nextComparator == null ? 0 : this.nextComparator.compare(var1, var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-704560642"
	)
	static void method10062() {
		Client.menu.menuOptionsCount = 0;
		Client.isMenuOpen = false;
	}

	@ObfuscatedName("mg")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1041129414"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) {
			class477.method9765(var0 - var2, var1 - var3);
		}

		long var4 = -1L;
		int var6 = 0;
		int var7 = 0;

		while (true) {
			int var9 = ViewportMouse.ViewportMouse_entityCount + 1;
			if (var7 >= var9) {
				if (-1L != var4) {
					var7 = (int)(var4 >>> 0 & 127L);
					var9 = class196.method4452(var4);
					Player var10 = (Player)class547.topLevelWorldView.players.get((long)Client.combatTargetPlayerIndex);
					class568.addPlayerToMenu(var10, Client.combatTargetPlayerIndex, var7, var9, var6);
				}

				return;
			}

			long var30 = ViewportMouse.ViewportMouse_entityTags[var7];
			if (var30 != -1L) {
				label512: {
					int var14 = (int)(var30 >>> 0 & 127L);
					int var15 = var14;
					int var16 = class196.method4452(var30);
					int var17 = (int)(var30 >>> 16 & 7L);
					int var19 = BuddyRankComparator.Entity_unpackID(var30);
					int var20 = class254.method5858(var30);
					WorldEntity var21 = null;
					WorldView var22 = null;
					var21 = (WorldEntity)class547.topLevelWorldView.worldEntities.get((long)var20);
					if (var20 >= 0 && var21 != null) {
						if (var21.method10243()) {
							break label512;
						}

						var22 = var21.worldView;
					} else if (var20 == -1) {
						var21 = null;
						var22 = class547.topLevelWorldView;
					}

					if (var22 != null) {
						int var23 = SecureUrlRequester.method3585(var20, var21, var22);
						if (var23 != -1) {
							label491: {
								int var27;
								String[] var41;
								if (var17 == 2 && var22.scene.getObjectFlags(var23, var14, var16, var30) >= 0) {
									ObjectComposition var24 = TileItem.getObjectDefinition(var19);
									if (var24.transforms != null) {
										var24 = var24.transform();
									}

									if (var24 == null) {
										break label491;
									}

									PendingSpawn var25 = null;

									for (PendingSpawn var26 = (PendingSpawn)var22.pendingSpawns.last(); var26 != null; var26 = (PendingSpawn)var22.pendingSpawns.previous()) {
										if (var23 == var26.plane && var15 == var26.x && var16 == var26.y && var19 == var26.field1025) {
											var25 = var26;
											break;
										}
									}

									if (!MenuAction.field680 && Client.isItemSelected == 1) {
										class162.insertMenuItem("Use", Client.field485 + " " + "->" + " " + class171.colorStartTag(65535) + var24.name, 1, var19, var15, var16, -1, false, var20);
									} else if (Client.isSpellSelected) {
										if (!MenuAction.field680 && (class266.selectedSpellFlags & 4) == 4) {
											class162.insertMenuItem(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class171.colorStartTag(65535) + var24.name, 2, var19, var15, var16, -1, false, var20);
										}
									} else {
										var41 = var24.actions;
										if (var41 != null) {
											for (var27 = 4; var27 >= 0; --var27) {
												if (!MenuAction.field680 && (var25 == null || var25.method2429(var27))) {
													String var28 = var41[var27];
													if (var25 != null && var25.method2430(var27)) {
														var28 = var25.method2431(var27);
													}

													if (var28 != null) {
														short var29 = 0;
														if (var27 == 0) {
															var29 = 3;
														}

														if (var27 == 1) {
															var29 = 4;
														}

														if (var27 == 2) {
															var29 = 5;
														}

														if (var27 == 3) {
															var29 = 6;
														}

														if (var27 == 4) {
															var29 = 1001;
														}

														class162.insertMenuItem(var28, class171.colorStartTag(65535) + var24.name, var29, var19, var15, var16, -1, false, var20);
													}
												}
											}
										}

										class162.insertMenuItem("Examine", class171.colorStartTag(65535) + var24.name, 1002, var24.id, var15, var16, -1, false, var20);
									}
								}

								int var32;
								NPC var42;
								int[] var43;
								Player var45;
								if (var17 == 1) {
									NPC var35 = (NPC)var22.npcs.get((long)var19);
									if (var35 == null) {
										break label491;
									}

									if (var35.definition.size == 1 && (var35.x & 127) == 64 && (var35.y & 127) == 64) {
										for (var32 = 0; var32 < var22.field1169.method9887(); ++var32) {
											var42 = (NPC)var22.npcs.get((long)var22.field1169.method9886(var32));
											if (var42 != null && var35 != var42 && var42.definition.size == 1 && var42.x == var35.x && var35.y == var42.y) {
												class40.addNpcToMenu(var42, var42.index, var15, var16, var20);
											}
										}

										var32 = Client.playerUpdateManager.playerCount;
										var43 = Client.playerUpdateManager.playerIndices;

										for (var27 = 0; var27 < var32; ++var27) {
											var45 = (Player)var22.players.get((long)var43[var27]);
											if (var45 != null && var35.x == var45.x && var45.y == var35.y) {
												class568.addPlayerToMenu(var45, var43[var27], var15, var16, var20);
											}
										}
									}

									class40.addNpcToMenu(var35, var19, var15, var16, var20);
								}

								if (var17 == 0) {
									Player var36 = (Player)var22.players.get((long)var19);
									if (var36 == null) {
										break label491;
									}

									if ((var36.x & 127) == 64 && (var36.y & 127) == 64) {
										for (var32 = 0; var32 < var22.field1169.method9887(); ++var32) {
											var42 = (NPC)var22.npcs.get((long)var22.field1169.method9886(var32));
											if (var42 != null && var42.definition.size == 1 && var36.x == var42.x && var36.y == var42.y) {
												class40.addNpcToMenu(var42, var22.field1169.method9886(var32), var15, var16, var20);
											}
										}

										var32 = Client.playerUpdateManager.playerCount;
										var43 = Client.playerUpdateManager.playerIndices;

										for (var27 = 0; var27 < var32; ++var27) {
											var45 = (Player)var22.players.get((long)var43[var27]);
											if (var45 != null && var45 != var36 && var36.x == var45.x && var45.y == var36.y) {
												class568.addPlayerToMenu(var45, var43[var27], var15, var16, var20);
											}
										}
									}

									if (var19 != Client.combatTargetPlayerIndex) {
										class568.addPlayerToMenu(var36, var19, var15, var16, var20);
									} else {
										var4 = var30;
										var6 = var20;
									}
								}

								if (var17 == 3) {
									NodeDeque var37 = var22.groundItems[var23][var15][var16];
									if (var37 != null) {
										for (TileItem var38 = (TileItem)var37.first(); var38 != null; var38 = (TileItem)var37.next()) {
											ItemComposition var44 = WorldMapIcon_1.ItemDefinition_get(var38.id);
											if (!field5455 && Client.isItemSelected == 1) {
												class162.insertMenuItem("Use", Client.field485 + " " + "->" + " " + class171.colorStartTag(16748608) + var44.name, 16, var38.id, var15, var16, -1, false, var20);
											} else if (Client.isSpellSelected) {
												if (!field5455 && (class266.selectedSpellFlags & 1) == 1) {
													class162.insertMenuItem(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class171.colorStartTag(16748608) + var44.name, 17, var38.id, var15, var16, -1, false, var20);
												}
											} else {
												String[] var34 = var44.groundActions;

												for (int var33 = 4; var33 >= 0; --var33) {
													if (!field5455 && var38.method2886(var33)) {
														if (var34 != null && var34[var33] != null) {
															byte var46 = 0;
															if (var33 == 0) {
																var46 = 18;
															}

															if (var33 == 1) {
																var46 = 19;
															}

															if (var33 == 2) {
																var46 = 20;
															}

															if (var33 == 3) {
																var46 = 21;
															}

															if (var33 == 4) {
																var46 = 22;
															}

															class162.insertMenuItem(var34[var33], class171.colorStartTag(16748608) + var44.name, var46, var38.id, var15, var16, -1, false, var20);
														} else if (var33 == 2) {
															class162.insertMenuItem("Take", class171.colorStartTag(16748608) + var44.name, 20, var38.id, var15, var16, -1, false, var20);
														}
													}
												}

												class162.insertMenuItem("Examine", class171.colorStartTag(16748608) + var44.name, 1004, var38.id, var15, var16, -1, false, var20);
											}
										}
									}
								}

								if (var17 == 4) {
									WorldEntity var39 = (WorldEntity)var22.worldEntities.get((long)var19);
									if (var39 != null) {
										class202 var40 = var39.field5482;
										if (Client.isItemSelected == 1) {
											class162.insertMenuItem("Use", Client.field485 + " " + "->" + " " + class171.colorStartTag(65280) + var40.field2213, 61, var19, var15, var16, -1, false, var20);
										} else if (!Client.isSpellSelected) {
											var41 = var40.field2214;
											if (var41 != null) {
												for (var27 = 4; var27 >= 0; --var27) {
													if (var39.method10187(var27) && var41[var27] != null) {
														byte var47 = 0;
														if (var27 == 0) {
															var47 = 63;
														}

														if (var27 == 1) {
															var47 = 64;
														}

														if (var27 == 2) {
															var47 = 65;
														}

														if (var27 == 3) {
															var47 = 66;
														}

														if (var27 == 4) {
															var47 = 67;
														}

														class162.insertMenuItem(var41[var27], class171.colorStartTag(65280) + var40.field2213, var47, var19, var15, var16, -1, false, var20);
													}
												}
											}

											class162.insertMenuItem("Examine", class171.colorStartTag(65280) + var40.field2213, 1013, var40.method4523(), var15, var16, -1, false, var20);
										}
									}
								}
							}
						}
					}
				}
			}

			++var7;
		}
	}
}
