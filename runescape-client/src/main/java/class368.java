import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ow")
public class class368 {
	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1711334686"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) {
			class77.method2366(var0 - var2, var1 - var3);
		}

		long var4 = -1L;
		int var6 = 0;
		long var7 = -1L;

		int var9;
		for (var9 = 0; var9 < class319.method6609(); ++var9) {
			long var29 = class141.method3506(var9);
			if (var7 != var29) {
				var7 = var29;
				int var31 = ClientPreferences.method2988(ViewportMouse.ViewportMouse_entityTags[var9]);
				int var13 = var31;
				int var14 = LoginPacket.method3577(var9);
				int var15 = FontName.method9937(var9);
				int var16 = HttpResponse.method307(var9);
				int var17 = DevicePcmPlayerProvider.method325(ViewportMouse.ViewportMouse_entityTags[var9]);
				int var18 = var17;
				if (var17 == 2047) {
					var18 = -1;
				}

				WorldEntity var19 = null;
				WorldView var20 = null;
				if (var18 >= 0 && GameEngine.topLevelWorldView.worldEntities[var18] != null) {
					var19 = GameEngine.topLevelWorldView.worldEntities[var18];
					var20 = var19.worldView;
				} else if (var18 == -1) {
					var19 = null;
					var20 = GameEngine.topLevelWorldView;
				}

				if (var20 != null) {
					int var22 = -1;
					if (var18 == LoginPacket.field1676) {
						var22 = var20.plane;
					} else if (LoginPacket.field1676 == -1) {
						var22 = var19.field5027;
					} else {
						WorldEntity var23 = GameEngine.topLevelWorldView.worldEntities[LoginPacket.field1676];
						WorldView var24 = var23.worldView;
						if (var23.field5027 == var24.plane) {
							if (var18 == -1) {
								var22 = GameEngine.topLevelWorldView.worldEntities[LoginPacket.field1676].getPlane();
							} else {
								var22 = var19.field5027;
							}
						}
					}

					var22 = var22;
					if (var22 != -1) {
						int var26;
						if (var15 == 2 && var20.scene.getObjectFlags(var22, var31, var14, var29) >= 0) {
							ObjectComposition var35 = class142.getObjectDefinition(var16);
							if (var35.transforms != null) {
								var35 = var35.transform();
							}

							if (var35 == null) {
								continue;
							}

							PendingSpawn var37 = null;

							for (PendingSpawn var25 = (PendingSpawn)var20.pendingSpawns.last(); var25 != null; var25 = (PendingSpawn)var20.pendingSpawns.previous()) {
								if (var22 == var25.plane && var13 == var25.x && var14 == var25.y && var16 == var25.field1192) {
									var37 = var25;
									break;
								}
							}

							if (!class418.field4719 && Client.isItemSelected == 1) {
								class231.insertMenuItem("Use", Client.field570 + " " + "->" + " " + WorldViewManager.colorStartTag(65535) + var35.name, 1, var16, var13, var14, -1, false, var18);
							} else if (Client.isSpellSelected) {
								if (!class418.field4719 && (class106.selectedSpellFlags & 4) == 4) {
									class231.insertMenuItem(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + WorldViewManager.colorStartTag(65535) + var35.name, 2, var16, var13, var14, -1, false, var18);
								}
							} else {
								String[] var41 = var35.actions;
								if (var41 != null) {
									for (var26 = 4; var26 >= 0; --var26) {
										if (!class418.field4719 && (var37 == null || var37.method2756(var26))) {
											String var27 = var41[var26];
											if (var37 != null && var37.method2753(var26)) {
												var27 = var37.method2766(var26);
											}

											if (var27 != null) {
												short var28 = 0;
												if (var26 == 0) {
													var28 = 3;
												}

												if (var26 == 1) {
													var28 = 4;
												}

												if (var26 == 2) {
													var28 = 5;
												}

												if (var26 == 3) {
													var28 = 6;
												}

												if (var26 == 4) {
													var28 = 1001;
												}

												class231.insertMenuItem(var27, WorldViewManager.colorStartTag(65535) + var35.name, var28, var16, var13, var14, -1, false, var18);
											}
										}
									}
								}

								class231.insertMenuItem("Examine", WorldViewManager.colorStartTag(65535) + var35.name, 1002, var35.id, var13, var14, -1, false, var18);
							}
						}

						int var32;
						NPC var42;
						int[] var43;
						Player var45;
						if (var15 == 1) {
							NPC var36 = var20.npcs[var16];
							if (var36 == null) {
								continue;
							}

							if (var36.definition.size == 1 && (var36.x & 127) == 64 && (var36.y & 127) == 64) {
								for (var32 = 0; var32 < var20.npcCount; ++var32) {
									var42 = var20.npcs[var20.npcIndices[var32]];
									if (var42 != null && var36 != var42 && var42.definition.size == 1 && var36.x == var42.x && var42.y == var36.y) {
										FadeInTask.addNpcToMenu(var42, var20.npcIndices[var32], var13, var14, var18);
									}
								}

								var32 = Client.playerUpdateManager.playerCount;
								var43 = Client.playerUpdateManager.playerIndices;

								for (var26 = 0; var26 < var32; ++var26) {
									var45 = var20.players[var43[var26]];
									if (var45 != null && var45.x == var36.x && var36.y == var45.y) {
										class53.addPlayerToMenu(var45, var43[var26], var13, var14, var18);
									}
								}
							}

							FadeInTask.addNpcToMenu(var36, var16, var13, var14, var18);
						}

						if (var15 == 0) {
							Player var38 = var20.players[var16];
							if (var38 == null) {
								continue;
							}

							if ((var38.x & 127) == 64 && (var38.y & 127) == 64) {
								for (var32 = 0; var32 < var20.npcCount; ++var32) {
									var42 = var20.npcs[var20.npcIndices[var32]];
									if (var42 != null && var42.definition.size == 1 && var42.x == var38.x && var42.y == var38.y) {
										FadeInTask.addNpcToMenu(var42, var20.npcIndices[var32], var13, var14, var18);
									}
								}

								var32 = Client.playerUpdateManager.playerCount;
								var43 = Client.playerUpdateManager.playerIndices;

								for (var26 = 0; var26 < var32; ++var26) {
									var45 = var20.players[var43[var26]];
									if (var45 != null && var38 != var45 && var45.x == var38.x && var38.y == var45.y) {
										class53.addPlayerToMenu(var45, var43[var26], var13, var14, var18);
									}
								}
							}

							if (var16 != Client.combatTargetPlayerIndex) {
								class53.addPlayerToMenu(var38, var16, var13, var14, var18);
							} else {
								var4 = var29;
								var6 = var18;
							}
						}

						if (var15 == 3) {
							NodeDeque var39 = var20.groundItems[var22][var13][var14];
							if (var39 != null) {
								for (TileItem var40 = (TileItem)var39.first(); var40 != null; var40 = (TileItem)var39.next()) {
									ItemComposition var44 = FaceNormal.ItemDefinition_get(var40.id);
									if (!class436.field4815 && Client.isItemSelected == 1) {
										class231.insertMenuItem("Use", Client.field570 + " " + "->" + " " + WorldViewManager.colorStartTag(16748608) + var44.name, 16, var40.id, var13, var14, -1, false, var18);
									} else if (Client.isSpellSelected) {
										if (!class436.field4815 && (class106.selectedSpellFlags & 1) == 1) {
											class231.insertMenuItem(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + WorldViewManager.colorStartTag(16748608) + var44.name, 17, var40.id, var13, var14, -1, false, var18);
										}
									} else {
										String[] var33 = var44.groundActions;

										for (int var34 = 4; var34 >= 0; --var34) {
											if (!class436.field4815 && var40.method3116(var34)) {
												if (var33 != null && var33[var34] != null) {
													byte var46 = 0;
													if (var34 == 0) {
														var46 = 18;
													}

													if (var34 == 1) {
														var46 = 19;
													}

													if (var34 == 2) {
														var46 = 20;
													}

													if (var34 == 3) {
														var46 = 21;
													}

													if (var34 == 4) {
														var46 = 22;
													}

													class231.insertMenuItem(var33[var34], WorldViewManager.colorStartTag(16748608) + var44.name, var46, var40.id, var13, var14, -1, false, var18);
												} else if (var34 == 2) {
													class231.insertMenuItem("Take", WorldViewManager.colorStartTag(16748608) + var44.name, 20, var40.id, var13, var14, -1, false, var18);
												}
											}
										}

										class231.insertMenuItem("Examine", WorldViewManager.colorStartTag(16748608) + var44.name, 1004, var40.id, var13, var14, -1, false, var18);
									}
								}
							}
						}
					}
				}
			}
		}

		if (-1L != var4) {
			var9 = ClientPreferences.method2988(var4);
			int var10 = (int)(var4 >>> 7 & 127L);
			Player var12 = GameEngine.topLevelWorldView.players[Client.combatTargetPlayerIndex];
			class53.addPlayerToMenu(var12, Client.combatTargetPlayerIndex, var9, var10, var6);
		}

	}
}
