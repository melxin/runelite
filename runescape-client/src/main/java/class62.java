import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("co")
public class class62 {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "-1272645413"
	)
	public static void method2173(String var0, String var1, String var2, int var3, int var4) throws IOException {
		if (var1 != null && !var1.isEmpty()) {
			var0 = var0 + "-" + var1;
		}

		class134.field1596 = var4;
		class224.cacheGamebuild = var3;

		try {
			EnumComposition.osName = System.getProperty("os.name");
		} catch (Exception var14) {
			EnumComposition.osName = "Unknown";
		}

		AttackOption.osNameLowercase = EnumComposition.osName.toLowerCase();
		JagexCache.userHomeDirectory = null;

		try {
			JagexCache.userHomeDirectory = System.getProperty("jagex.userhome");
		} catch (Exception var13) {
		}

		if (JagexCache.userHomeDirectory == null) {
			try {
				JagexCache.userHomeDirectory = System.getProperty("user.home");
			} catch (Exception var12) {
			}
		}

		if (JagexCache.userHomeDirectory != null) {
			JagexCache.userHomeDirectory = JagexCache.userHomeDirectory + "/";
		}

		try {
			if (AttackOption.osNameLowercase.startsWith("win")) {
				if (JagexCache.userHomeDirectory == null) {
					JagexCache.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (JagexCache.userHomeDirectory == null) {
				JagexCache.userHomeDirectory = System.getenv("HOME");
			}

			if (JagexCache.userHomeDirectory != null) {
				JagexCache.userHomeDirectory = JagexCache.userHomeDirectory + "/";
			}
		} catch (Exception var11) {
		}

		if (JagexCache.userHomeDirectory == null) {
			JagexCache.userHomeDirectory = "~/";
		}

		class596.field6009 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", JagexCache.userHomeDirectory, "/tmp/", ""};
		class201.field2173 = new String[]{".jagex_cache_" + class224.cacheGamebuild, ".file_store_" + class224.cacheGamebuild};
		int var10 = 0;

		label110:
		while (var10 < 4) {
			class452.cacheDir = class137.method3826(var0, var2, var10);
			if (!class452.cacheDir.exists()) {
				class452.cacheDir.mkdirs();
			}

			File[] var6 = class452.cacheDir.listFiles();
			if (var6 == null) {
				break;
			}

			File[] var7 = var6;
			int var8 = 0;

			while (true) {
				if (var8 >= var7.length) {
					break label110;
				}

				File var9 = var7[var8];
				if (!class194.method4453(var9, false)) {
					++var10;
					break;
				}

				++var8;
			}
		}

		class107.method3490(class452.cacheDir);
		class184.method4311();
		JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(KeyHandler.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
		JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(KeyHandler.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
		UserComparator9.JagexCache_idxFiles = new BufferedFile[class134.field1596];

		for (var10 = 0; var10 < class134.field1596; ++var10) {
			UserComparator9.JagexCache_idxFiles[var10] = new BufferedFile(new AccessFile(KeyHandler.getFile("main_file_cache.idx" + var10), "rw", 1048576L), 6000, 0);
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lic;III)Ldm;",
		garbageValue = "1812404121"
	)
	public static final PcmPlayer method2176(TaskHandler var0, int var1, int var2) {
		if (EnumComposition.field2063 * 1063377631 == 0) {
			throw new IllegalStateException();
		} else if (var1 >= 0 && var1 < 2) {
			if (var2 < 512) {
				var2 = 512;
			}

			try {
				PcmPlayer var3 = class380.pcmPlayerProvider.player();
				var3.samples = new int[(FaceNormal.PcmPlayer_stereo ? 2 : 1) * 512];
				var3.field1316 = var2;
				var3.init();
				var3.capacity = (var2 & -2048) + 2048;
				if (var3.capacity > 32768) {
					var3.capacity = 32768;
				}

				var3.open(var3.capacity);
				if (class339.field3870 > 0 && class372.soundSystem == null) {
					class372.soundSystem = new SoundSystem();
					Script.soundSystemExecutor = Executors.newScheduledThreadPool(1);
					Script.soundSystemExecutor.scheduleAtFixedRate(class372.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS);
				}

				if (class372.soundSystem != null) {
					if (class372.soundSystem.players[var1] != null) {
						throw new IllegalArgumentException();
					}

					class372.soundSystem.players[var1] = var3;
				}

				return var3;
			} catch (Throwable var4) {
				return new PcmPlayer();
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("mf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "798665770"
	)
	static void method2177() {
		if (Client.isSpellSelected) {
			Widget var0 = class226.widgetDefinition.getWidgetChild(Skills.selectedSpellWidget, Client.selectedSpellChildIndex);
			if (var0 != null && var0.onTargetLeave != null) {
				ScriptEvent var1 = new ScriptEvent();
				var1.widget = var0;
				var1.args = var0.onTargetLeave;
				class141.runScriptEvent(var1);
			}

			Client.selectedSpellItemId = -1;
			Client.isSpellSelected = false;
			class376.invalidateWidget(var0);
		}
	}

	@ObfuscatedName("mg")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1050697004"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) {
			class166.method4157(var0 - var2, var1 - var3);
		}

		long var4 = -1L;
		int var6 = 0;

		int var7;
		for (var7 = 0; var7 < class177.method4270(); ++var7) {
			long var29 = ViewportMouse.ViewportMouse_entityTags[var7];
			if (-1L != var29) {
				int var12 = Tiles.method2117(var29);
				int var13 = (int)(var29 >>> 7 & 127L);
				int var14 = var13;
				int var15 = (int)(var29 >>> 16 & 7L);
				int var17 = HorizontalAlignment.Entity_unpackID(var29);
				int var18 = class311.method7028(var29);
				WorldEntity var19 = null;
				WorldView var20 = null;
				var19 = (WorldEntity)Occluder.topLevelWorldView.worldEntities.get((long)var18);
				if (var18 >= 0 && var19 != null) {
					if (var19.method10502()) {
						continue;
					}

					var20 = var19.worldView;
				} else if (var18 == -1) {
					var19 = null;
					var20 = Occluder.topLevelWorldView;
				}

				if (var20 != null) {
					int var22 = -1;
					WorldEntity var23;
					if (var18 == Client.currentWorldViewId) {
						var22 = var20.plane;
					} else if (Client.currentWorldViewId == -1) {
						var22 = var19.field5538.method4615();
					} else {
						var23 = Client.worldViewManager.method2411();
						WorldView var24 = var23.worldView;
						if (var24.plane == var23.field5538.method4615()) {
							if (var18 == -1) {
								var22 = var23.getX();
							} else {
								var22 = var19.field5538.method4615();
							}
						}
					}

					var22 = var22;
					if (var22 != -1) {
						int var26;
						String[] var42;
						if (var15 == 2 && var20.scene.getObjectFlags(var22, var12, var13, var29) >= 0) {
							ObjectComposition var36 = AsyncHttpResponse.getObjectDefinition(var17);
							if (var36.transforms != null) {
								var36 = var36.transform();
							}

							if (var36 == null) {
								continue;
							}

							PendingSpawn var38 = null;

							for (PendingSpawn var25 = (PendingSpawn)var20.pendingSpawns.last(); var25 != null; var25 = (PendingSpawn)var20.pendingSpawns.previous()) {
								if (var22 == var25.plane && var12 == var25.x && var14 == var25.y && var17 == var25.field998) {
									var38 = var25;
									break;
								}
							}

							if (!ApproximateRouteStrategy.field226 && Client.isItemSelected == 1) {
								ClanChannel.insertMenuItem("Use", Client.field485 + " " + "->" + " " + class144.colorStartTag(65535) + var36.name, 1, var17, var12, var14, -1, false, var18);
							} else if (Client.isSpellSelected) {
								if (!ApproximateRouteStrategy.field226 && (DesktopPlatformInfoProvider.selectedSpellFlags & 4) == 4) {
									ClanChannel.insertMenuItem(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class144.colorStartTag(65535) + var36.name, 2, var17, var12, var14, -1, false, var18);
								}
							} else {
								var42 = var36.actions;
								if (var42 != null) {
									for (var26 = 4; var26 >= 0; --var26) {
										if (!ApproximateRouteStrategy.field226 && (var38 == null || var38.method2473(var26))) {
											String var27 = var42[var26];
											if (var38 != null && var38.method2459(var26)) {
												var27 = var38.method2460(var26);
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

												ClanChannel.insertMenuItem(var27, class144.colorStartTag(65535) + var36.name, var28, var17, var12, var14, -1, false, var18);
											}
										}
									}
								}

								ClanChannel.insertMenuItem("Examine", class144.colorStartTag(65535) + var36.name, 1002, var36.id, var12, var14, -1, false, var18);
							}
						}

						int var33;
						NPC var43;
						int[] var45;
						Player var47;
						if (var15 == 1) {
							NPC var37 = (NPC)var20.npcs.get((long)var17);
							if (var37 == null) {
								continue;
							}

							if (var37.definition.size == 1 && (var37.x & 127) == 64 && (var37.y & 127) == 64) {
								for (var33 = 0; var33 < var20.field1130.method10038(); ++var33) {
									var43 = (NPC)var20.npcs.get((long)var20.field1130.method10037(var33));
									if (var43 != null && var37 != var43 && var43.definition.size == 1 && var43.x == var37.x && var43.y == var37.y) {
										class40.addNpcToMenu(var43, var43.index, var12, var14, var18);
									}
								}

								var33 = Client.playerUpdateManager.playerCount;
								var45 = Client.playerUpdateManager.playerIndices;

								for (var26 = 0; var26 < var33; ++var26) {
									var47 = (Player)var20.players.get((long)var45[var26]);
									if (var47 != null && var37.x == var47.x && var47.y == var37.y) {
										AsyncRestClient.addPlayerToMenu(var47, var45[var26], var12, var14, var18);
									}
								}
							}

							class40.addNpcToMenu(var37, var17, var12, var14, var18);
						}

						if (var15 == 0) {
							Player var39 = (Player)var20.players.get((long)var17);
							if (var39 == null) {
								continue;
							}

							if ((var39.x & 127) == 64 && (var39.y & 127) == 64) {
								for (var33 = 0; var33 < var20.field1130.method10038(); ++var33) {
									var43 = (NPC)var20.npcs.get((long)var20.field1130.method10037(var33));
									if (var43 != null && var43.definition.size == 1 && var39.x == var43.x && var39.y == var43.y) {
										class40.addNpcToMenu(var43, var20.field1130.method10037(var33), var12, var14, var18);
									}
								}

								var33 = Client.playerUpdateManager.playerCount;
								var45 = Client.playerUpdateManager.playerIndices;

								for (var26 = 0; var26 < var33; ++var26) {
									var47 = (Player)var20.players.get((long)var45[var26]);
									if (var47 != null && var47 != var39 && var47.x == var39.x && var47.y == var39.y) {
										AsyncRestClient.addPlayerToMenu(var47, var45[var26], var12, var14, var18);
									}
								}
							}

							if (var17 != Client.combatTargetPlayerIndex) {
								AsyncRestClient.addPlayerToMenu(var39, var17, var12, var14, var18);
							} else {
								var4 = var29;
								var6 = var18;
							}
						}

						if (var15 == 3) {
							NodeDeque var40 = var20.groundItems[var22][var12][var14];
							if (var40 != null) {
								for (TileItem var41 = (TileItem)var40.first(); var41 != null; var41 = (TileItem)var40.next()) {
									ItemComposition var46 = class150.ItemDefinition_get(var41.id);
									if (!WorldMapRectangle.field3472 && Client.isItemSelected == 1) {
										ClanChannel.insertMenuItem("Use", Client.field485 + " " + "->" + " " + class144.colorStartTag(16748608) + var46.name, 16, var41.id, var12, var14, -1, false, var18);
									} else if (Client.isSpellSelected) {
										if (!WorldMapRectangle.field3472 && (DesktopPlatformInfoProvider.selectedSpellFlags & 1) == 1) {
											ClanChannel.insertMenuItem(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class144.colorStartTag(16748608) + var46.name, 17, var41.id, var12, var14, -1, false, var18);
										}
									} else {
										String[] var35 = var46.groundActions;

										for (int var34 = 4; var34 >= 0; --var34) {
											if (!WorldMapRectangle.field3472 && var41.method2902(var34)) {
												if (var35 != null && var35[var34] != null) {
													byte var48 = 0;
													if (var34 == 0) {
														var48 = 18;
													}

													if (var34 == 1) {
														var48 = 19;
													}

													if (var34 == 2) {
														var48 = 20;
													}

													if (var34 == 3) {
														var48 = 21;
													}

													if (var34 == 4) {
														var48 = 22;
													}

													ClanChannel.insertMenuItem(var35[var34], class144.colorStartTag(16748608) + var46.name, var48, var41.id, var12, var14, -1, false, var18);
												} else if (var34 == 2) {
													ClanChannel.insertMenuItem("Take", class144.colorStartTag(16748608) + var46.name, 20, var41.id, var12, var14, -1, false, var18);
												}
											}
										}

										ClanChannel.insertMenuItem("Examine", class144.colorStartTag(16748608) + var46.name, 1004, var41.id, var12, var14, -1, false, var18);
									}
								}
							}
						}

						if (var15 == 4) {
							var23 = (WorldEntity)var20.worldEntities.get((long)var17);
							if (var23 != null) {
								class207 var44 = var23.field5538;
								if (Client.isItemSelected == 1) {
									ClanChannel.insertMenuItem("Use", Client.field485 + " " + "->" + " " + class144.colorStartTag(15574765) + var44.field2233, 61, var17, var12, var14, -1, false, var18);
								} else if (!Client.isSpellSelected) {
									var42 = var44.field2234;
									if (var42 != null) {
										for (var26 = 4; var26 >= 0; --var26) {
											if (var23.method10526(var26) && var42[var26] != null) {
												byte var49 = 0;
												if (var26 == 0) {
													var49 = 63;
												}

												if (var26 == 1) {
													var49 = 64;
												}

												if (var26 == 2) {
													var49 = 65;
												}

												if (var26 == 3) {
													var49 = 66;
												}

												if (var26 == 4) {
													var49 = 67;
												}

												ClanChannel.insertMenuItem(var42[var26], class144.colorStartTag(15574765) + var44.field2233, var49, var17, var12, var14, -1, false, var18);
											}
										}
									}

									ClanChannel.insertMenuItem("Examine", class144.colorStartTag(15574765) + var44.field2233, 1013, var44.method4610(), var12, var14, -1, false, var18);
								}
							}
						}
					}
				}
			}
		}

		if (var4 != -1L) {
			var7 = Tiles.method2117(var4);
			int var8 = (int)(var4 >>> 7 & 127L);
			Player var10 = Renderable.method5846(Client.combatTargetPlayerIndex, Client.worldViewManager);
			if (var10 != null) {
				AsyncRestClient.addPlayerToMenu(var10, Client.combatTargetPlayerIndex, var7, var8, var6);
			}
		}

	}
}
