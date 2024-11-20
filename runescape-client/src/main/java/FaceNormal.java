import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jx")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1404562863
	)
	@Export("x")
	int x;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -933800883
	)
	@Export("y")
	int y;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 83272273
	)
	@Export("z")
	int z;

	FaceNormal() {
	}

	@ObfuscatedName("mx")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1234441286"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		int var10;
		int var13;
		int var26;
		int var27;
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) {
			int var4 = var0 - var2;
			int var5 = var1 - var3;
			int[] var6 = new int[Client.worldViewManager.method2612()];
			float[] var7 = new float[Client.worldViewManager.method2612()];
			int var8 = 0;

			for (Iterator var9 = Client.worldViewManager.iterator(); var9.hasNext(); ++var8) {
				WorldView var29 = (WorldView)var9.next();
				var6[var8] = var29.id;
				var7[var8] = var29.scene.field2682;
			}

			class30.method420(var7, var6, 0, var7.length - 1);
			HashMap var54 = new HashMap();

			for (var8 = var6.length - 1; var8 >= 0; --var8) {
				if (var7[var8] > 0.0F || var6[var8] == -1) {
					class492 var60 = Client.worldViewManager.method2607(var6[var8]);
					if (!var54.containsKey(var60)) {
						var54.put(var60, var6[var8]);
					}
				}
			}

			for (var8 = 0; var8 < var6.length; ++var8) {
				var10 = var6[var8];
				class492 var11 = Client.worldViewManager.method2607(var10);
				Integer var12 = (Integer)var54.get(var11);
				if (var12 != null && var12.equals(var10)) {
					if (var11 == class492.field5090) {
						LoginScreenAnimation.insertMenuItem("Walk here", "", 23, 0, var4, var5, 0, false, var10);
					} else if (var11 == class492.field5091) {
						var13 = class77.getTileHeight(HttpRequest.topLevelWorldView, HttpResponse.entity.getX(), HttpResponse.entity.getY(), HttpResponse.entity.getPlane());
						class426 var14 = PlayerCompositionColorTextureOverride.method3722((float)HttpResponse.entity.getX(), (float)var13, (float)HttpResponse.entity.getY());
						class426 var15 = Canvas.method308(var13, class403.cameraX, class166.cameraY, class328.cameraZ);
						if (var15 != null) {
							class426 var16 = GameEngine.method639(var15, var14);
							class426 var18 = class426.field4760;
							class426 var19 = RouteStrategy.method5650(var18);
							var19.method8152(var16);
							class426 var21 = class426.field4761;
							float var20 = var19.method8114(var21);
							class426 var24 = class426.field4760;
							float var23 = var24.method8114(var16);
							float var25 = (float)Math.atan2((double)var20, (double)var23);
							var26 = (int)((double)var25 / 6.283185307179586D * 2048.0D) & 2047;
							var27 = var26 + 64;
							var27 = (var27 & 2047) / 128;
							LoginScreenAnimation.insertMenuItem("Set heading", "", 60, var27, 0, 0, 0, false, var10);
							var16.method8136();
							var19.method8136();
							var15.method8136();
						}
					}
				}
			}
		}

		long var30 = -1L;
		int var32 = 0;
		long var33 = -1L;

		int var35;
		for (var35 = 0; var35 < class59.method1144(); ++var35) {
			long var37 = WorldMapRectangle.method6229(var35);
			if (var33 != var37) {
				var33 = var37;
				int var39 = class171.method3679(var35);
				var13 = class171.method3678(var35);
				int var40 = class288.method6120(ViewportMouse.ViewportMouse_entityTags[var35]);
				int var42 = class137.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var35]);
				int var43 = var42;
				long var44 = ViewportMouse.ViewportMouse_entityTags[var35];
				int var46 = (int)(var44 >>> 49 & 2047L);
				var46 = var46;
				if (var46 == 2047) {
					var46 = -1;
				}

				WorldEntity var48 = null;
				WorldView var56 = null;
				if (var46 >= 0 && HttpRequest.topLevelWorldView.worldEntities[var46] != null) {
					var48 = HttpRequest.topLevelWorldView.worldEntities[var46];
					var56 = var48.worldView;
				} else if (var46 == -1) {
					var48 = null;
					var56 = HttpRequest.topLevelWorldView;
				}

				if (var56 != null) {
					int var22 = RouteStrategy.method5646(var46, var48, var56);
					if (var22 != -1) {
						if (var40 == 2 && var56.scene.getObjectFlags(var22, var39, var13, var37) >= 0) {
							ObjectComposition var49 = HttpMethod.getObjectDefinition(var42);
							if (var49.transforms != null) {
								var49 = var49.transform();
							}

							if (var49 == null) {
								continue;
							}

							PendingSpawn var57 = null;

							for (PendingSpawn var50 = (PendingSpawn)var56.pendingSpawns.last(); var50 != null; var50 = (PendingSpawn)var56.pendingSpawns.previous()) {
								if (var22 == var50.plane && var39 == var50.x && var13 == var50.y && var43 == var50.field1191) {
									var57 = var50;
									break;
								}
							}

							if (!Client.field523 && Client.isItemSelected == 1) {
								LoginScreenAnimation.insertMenuItem("Use", Client.field667 + " " + "->" + " " + class438.colorStartTag(65535) + var49.name, 1, var43, var39, var13, -1, false, var46);
							} else if (Client.isSpellSelected) {
								if (!Client.field523 && (class202.selectedSpellFlags & 4) == 4) {
									LoginScreenAnimation.insertMenuItem(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class438.colorStartTag(65535) + var49.name, 2, var43, var39, var13, -1, false, var46);
								}
							} else {
								String[] var64 = var49.actions;
								if (var64 != null) {
									for (var26 = 4; var26 >= 0; --var26) {
										if (!Client.field523 && (var57 == null || var57.method2633(var26)) && var64[var26] != null) {
											short var59 = 0;
											if (var26 == 0) {
												var59 = 3;
											}

											if (var26 == 1) {
												var59 = 4;
											}

											if (var26 == 2) {
												var59 = 5;
											}

											if (var26 == 3) {
												var59 = 6;
											}

											if (var26 == 4) {
												var59 = 1001;
											}

											LoginScreenAnimation.insertMenuItem(var64[var26], class438.colorStartTag(65535) + var49.name, var59, var43, var39, var13, -1, false, var46);
										}
									}
								}

								LoginScreenAnimation.insertMenuItem("Examine", class438.colorStartTag(65535) + var49.name, 1002, var49.id, var39, var13, -1, false, var46);
							}
						}

						int var51;
						Player var52;
						NPC var65;
						int[] var66;
						if (var40 == 1) {
							NPC var61 = var56.npcs[var43];
							if (var61 == null) {
								continue;
							}

							if (var61.definition.size == 1 && (var61.x & 127) == 64 && (var61.y & 127) == 64) {
								for (var51 = 0; var51 < var56.npcCount; ++var51) {
									var65 = var56.npcs[var56.npcIndices[var51]];
									if (var65 != null && var65 != var61 && var65.definition.size == 1 && var61.x == var65.x && var65.y == var61.y) {
										InvDefinition.addNpcToMenu(var65, var56.npcIndices[var51], var39, var13, var46);
									}
								}

								var51 = Client.playerUpdateManager.playerCount;
								var66 = Client.playerUpdateManager.playerIndices;

								for (var26 = 0; var26 < var51; ++var26) {
									var52 = var56.players[var66[var26]];
									if (var52 != null && var61.x == var52.x && var52.y == var61.y) {
										VarpDefinition.addPlayerToMenu(var52, var66[var26], var39, var13, var46);
									}
								}
							}

							InvDefinition.addNpcToMenu(var61, var43, var39, var13, var46);
						}

						if (var40 == 0) {
							Player var62 = var56.players[var43];
							if (var62 == null) {
								continue;
							}

							if ((var62.x & 127) == 64 && (var62.y & 127) == 64) {
								for (var51 = 0; var51 < var56.npcCount; ++var51) {
									var65 = var56.npcs[var56.npcIndices[var51]];
									if (var65 != null && var65.definition.size == 1 && var62.x == var65.x && var62.y == var65.y) {
										InvDefinition.addNpcToMenu(var65, var56.npcIndices[var51], var39, var13, var46);
									}
								}

								var51 = Client.playerUpdateManager.playerCount;
								var66 = Client.playerUpdateManager.playerIndices;

								for (var26 = 0; var26 < var51; ++var26) {
									var52 = var56.players[var66[var26]];
									if (var52 != null && var62 != var52 && var62.x == var52.x && var62.y == var52.y) {
										VarpDefinition.addPlayerToMenu(var52, var66[var26], var39, var13, var46);
									}
								}
							}

							if (var43 != Client.combatTargetPlayerIndex) {
								VarpDefinition.addPlayerToMenu(var62, var43, var39, var13, var46);
							} else {
								var30 = var37;
								var32 = var46;
							}
						}

						if (var40 == 3) {
							NodeDeque var63 = var56.groundItems[var22][var39][var13];
							if (var63 != null) {
								for (TileItem var58 = (TileItem)var63.first(); var58 != null; var58 = (TileItem)var63.next()) {
									ItemComposition var67 = WorldEntityCoord.ItemDefinition_get(var58.id);
									if (!WorldMapID.field3249 && Client.isItemSelected == 1) {
										LoginScreenAnimation.insertMenuItem("Use", Client.field667 + " " + "->" + " " + class438.colorStartTag(16748608) + var67.name, 16, var58.id, var39, var13, -1, false, var46);
									} else if (Client.isSpellSelected) {
										if (!WorldMapID.field3249 && (class202.selectedSpellFlags & 1) == 1) {
											LoginScreenAnimation.insertMenuItem(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class438.colorStartTag(16748608) + var67.name, 17, var58.id, var39, var13, -1, false, var46);
										}
									} else {
										String[] var53 = var67.groundActions;

										for (var27 = 4; var27 >= 0; --var27) {
											if (!WorldMapID.field3249 && var58.method2993(var27)) {
												if (var53 != null && var53[var27] != null) {
													byte var28 = 0;
													if (var27 == 0) {
														var28 = 18;
													}

													if (var27 == 1) {
														var28 = 19;
													}

													if (var27 == 2) {
														var28 = 20;
													}

													if (var27 == 3) {
														var28 = 21;
													}

													if (var27 == 4) {
														var28 = 22;
													}

													LoginScreenAnimation.insertMenuItem(var53[var27], class438.colorStartTag(16748608) + var67.name, var28, var58.id, var39, var13, -1, false, var46);
												} else if (var27 == 2) {
													LoginScreenAnimation.insertMenuItem("Take", class438.colorStartTag(16748608) + var67.name, 20, var58.id, var39, var13, -1, false, var46);
												}
											}
										}

										LoginScreenAnimation.insertMenuItem("Examine", class438.colorStartTag(16748608) + var67.name, 1004, var58.id, var39, var13, -1, false, var46);
									}
								}
							}
						}
					}
				}
			}
		}

		if (var30 != -1L) {
			var35 = Renderable.method5155(var30);
			var10 = (int)(var30 >>> 7 & 127L);
			Player var55 = HttpRequest.topLevelWorldView.players[Client.combatTargetPlayerIndex];
			VarpDefinition.addPlayerToMenu(var55, Client.combatTargetPlayerIndex, var35, var10, var32);
		}

	}
}
