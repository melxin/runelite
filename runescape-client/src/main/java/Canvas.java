import java.awt.Component;
import java.awt.Graphics;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ab")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("ap")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1;
	}

	public final void update(Graphics var1) {
		this.component.update(var1);
	}

	public final void paint(Graphics var1) {
		this.component.paint(var1);
	}

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-18"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) {
			Timer.method8005(var0 - var2, var1 - var3);
		}

		long var4 = -1L;
		int var6 = 0;
		long var7 = -1L;
		int var9 = 0;

		while (true) {
			int var11 = ViewportMouse.ViewportMouse_entityCount;
			if (var9 >= var11) {
				if (-1L != var4) {
					var9 = GrandExchangeOfferOwnWorldComparator.method759(var4);
					int var10 = (int)(var4 >>> 7 & 127L);
					Player var12 = (Player)Sound.topLevelWorldView.players.get((long)Client.combatTargetPlayerIndex);
					LoginPacket.addPlayerToMenu(var12, Client.combatTargetPlayerIndex, var9, var10, var6);
				}

				return;
			}

			long var32 = FadeInTask.method9262(var9);
			if (var32 != var7) {
				label450: {
					var7 = var32;
					int var14 = GrandExchangeOfferOwnWorldComparator.method759(ViewportMouse.ViewportMouse_entityTags[var9]);
					int var15 = var14;
					int var16 = class270.method5882(var9);
					long var19 = ViewportMouse.ViewportMouse_entityTags[var9];
					int var18 = (int)(var19 >>> 16 & 7L);
					int var34 = DirectByteArrayCopier.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var9]);
					int var20 = var34;
					int var21 = SequenceDefinition.method4597(ViewportMouse.ViewportMouse_entityTags[var9]);
					int var22 = var21;
					WorldEntity var23 = null;
					WorldView var24 = null;
					var23 = (WorldEntity)Sound.topLevelWorldView.worldEntities.get((long)var21);
					if (var21 >= 0 && var23 != null) {
						if (var23.method9727()) {
							break label450;
						}

						var24 = var23.worldView;
					} else if (var21 == -1) {
						var23 = null;
						var24 = Sound.topLevelWorldView;
					}

					if (var24 != null) {
						int var25 = WorldMapRectangle.method6614(var21, var23, var24);
						if (var25 != -1) {
							label431: {
								int var29;
								if (var18 == 2 && var24.scene.getObjectFlags(var25, var14, var16, var32) >= 0) {
									ObjectComposition var26 = HealthBarConfig.getObjectDefinition(var34);
									if (var26.transforms != null) {
										var26 = var26.transform();
									}

									if (var26 == null) {
										break label431;
									}

									PendingSpawn var27 = null;

									for (PendingSpawn var28 = (PendingSpawn)var24.pendingSpawns.last(); var28 != null; var28 = (PendingSpawn)var24.pendingSpawns.previous()) {
										if (var25 == var28.plane && var15 == var28.x && var16 == var28.y && var20 == var28.field1008) {
											var27 = var28;
											break;
										}
									}

									if (!WorldMapAreaData.field3334 && Client.isItemSelected == 1) {
										GrandExchangeOfferOwnWorldComparator.insertMenuItem("Use", Client.field520 + " " + "->" + " " + AbstractWorldMapIcon.colorStartTag(65535) + var26.name, 1, var20, var15, var16, -1, false, var21);
									} else if (Client.isSpellSelected) {
										if (!WorldMapAreaData.field3334 && (class448.selectedSpellFlags & 4) == 4) {
											GrandExchangeOfferOwnWorldComparator.insertMenuItem(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + AbstractWorldMapIcon.colorStartTag(65535) + var26.name, 2, var20, var15, var16, -1, false, var21);
										}
									} else {
										String[] var42 = var26.actions;
										if (var42 != null) {
											for (var29 = 4; var29 >= 0; --var29) {
												if (!WorldMapAreaData.field3334 && (var27 == null || var27.method2282(var29))) {
													String var30 = var42[var29];
													if (var27 != null && var27.method2281(var29)) {
														var30 = var27.method2277(var29);
													}

													if (var30 != null) {
														short var31 = 0;
														if (var29 == 0) {
															var31 = 3;
														}

														if (var29 == 1) {
															var31 = 4;
														}

														if (var29 == 2) {
															var31 = 5;
														}

														if (var29 == 3) {
															var31 = 6;
														}

														if (var29 == 4) {
															var31 = 1001;
														}

														GrandExchangeOfferOwnWorldComparator.insertMenuItem(var30, AbstractWorldMapIcon.colorStartTag(65535) + var26.name, var31, var20, var15, var16, -1, false, var22);
													}
												}
											}
										}

										GrandExchangeOfferOwnWorldComparator.insertMenuItem("Examine", AbstractWorldMapIcon.colorStartTag(65535) + var26.name, 1002, var26.id, var15, var16, -1, false, var22);
									}
								}

								int var35;
								NPC var43;
								int[] var44;
								Player var46;
								if (var18 == 1) {
									NPC var38 = (NPC)var24.npcs.get((long)var20);
									if (var38 == null) {
										break label431;
									}

									if (var38.definition.size == 1 && (var38.x & 127) == 64 && (var38.y & 127) == 64) {
										for (var35 = 0; var35 < var24.field1147.method9429(); ++var35) {
											var43 = (NPC)var24.npcs.get((long)var24.field1147.method9430(var35));
											if (var43 != null && var43 != var38 && var43.definition.size == 1 && var38.x == var43.x && var38.y == var43.y) {
												ItemComposition.addNpcToMenu(var43, var43.index, var15, var16, var22);
											}
										}

										var35 = Client.playerUpdateManager.playerCount;
										var44 = Client.playerUpdateManager.playerIndices;

										for (var29 = 0; var29 < var35; ++var29) {
											var46 = (Player)var24.players.get((long)var44[var29]);
											if (var46 != null && var46.x == var38.x && var38.y == var46.y) {
												LoginPacket.addPlayerToMenu(var46, var44[var29], var15, var16, var22);
											}
										}
									}

									ItemComposition.addNpcToMenu(var38, var20, var15, var16, var22);
								}

								if (var18 == 0) {
									Player var39 = (Player)var24.players.get((long)var20);
									if (var39 == null) {
										break label431;
									}

									if ((var39.x & 127) == 64 && (var39.y & 127) == 64) {
										for (var35 = 0; var35 < var24.field1147.method9429(); ++var35) {
											var43 = (NPC)var24.npcs.get((long)var24.field1147.method9430(var35));
											if (var43 != null && var43.definition.size == 1 && var43.x == var39.x && var43.y == var39.y) {
												ItemComposition.addNpcToMenu(var43, var24.field1147.method9430(var35), var15, var16, var22);
											}
										}

										var35 = Client.playerUpdateManager.playerCount;
										var44 = Client.playerUpdateManager.playerIndices;

										for (var29 = 0; var29 < var35; ++var29) {
											var46 = (Player)var24.players.get((long)var44[var29]);
											if (var46 != null && var39 != var46 && var46.x == var39.x && var46.y == var39.y) {
												LoginPacket.addPlayerToMenu(var46, var44[var29], var15, var16, var22);
											}
										}
									}

									if (var20 != Client.combatTargetPlayerIndex) {
										LoginPacket.addPlayerToMenu(var39, var20, var15, var16, var22);
									} else {
										var4 = var32;
										var6 = var22;
									}
								}

								if (var18 == 3) {
									NodeDeque var40 = var24.groundItems[var25][var15][var16];
									if (var40 != null) {
										for (TileItem var41 = (TileItem)var40.first(); var41 != null; var41 = (TileItem)var40.next()) {
											ItemComposition var45 = SceneTilePaint.ItemDefinition_get(var41.id);
											if (!class166.field1835 && Client.isItemSelected == 1) {
												GrandExchangeOfferOwnWorldComparator.insertMenuItem("Use", Client.field520 + " " + "->" + " " + AbstractWorldMapIcon.colorStartTag(16748608) + var45.name, 16, var41.id, var15, var16, -1, false, var22);
											} else if (Client.isSpellSelected) {
												if (!class166.field1835 && (class448.selectedSpellFlags & 1) == 1) {
													GrandExchangeOfferOwnWorldComparator.insertMenuItem(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + AbstractWorldMapIcon.colorStartTag(16748608) + var45.name, 17, var41.id, var15, var16, -1, false, var22);
												}
											} else {
												String[] var36 = var45.groundActions;

												for (int var37 = 4; var37 >= 0; --var37) {
													if (!class166.field1835 && var41.method2666(var37)) {
														if (var36 != null && var36[var37] != null) {
															byte var47 = 0;
															if (var37 == 0) {
																var47 = 18;
															}

															if (var37 == 1) {
																var47 = 19;
															}

															if (var37 == 2) {
																var47 = 20;
															}

															if (var37 == 3) {
																var47 = 21;
															}

															if (var37 == 4) {
																var47 = 22;
															}

															GrandExchangeOfferOwnWorldComparator.insertMenuItem(var36[var37], AbstractWorldMapIcon.colorStartTag(16748608) + var45.name, var47, var41.id, var15, var16, -1, false, var22);
														} else if (var37 == 2) {
															GrandExchangeOfferOwnWorldComparator.insertMenuItem("Take", AbstractWorldMapIcon.colorStartTag(16748608) + var45.name, 20, var41.id, var15, var16, -1, false, var22);
														}
													}
												}

												GrandExchangeOfferOwnWorldComparator.insertMenuItem("Examine", AbstractWorldMapIcon.colorStartTag(16748608) + var45.name, 1004, var41.id, var15, var16, -1, false, var22);
											}
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

	@ObfuscatedName("ok")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-613046261"
	)
	static final void method334(int var0, int var1) {
		if (Client.currentClanChannels[var0] != null) {
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3878()) {
				ClanChannelMember var2 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
				if (var2.rank == -1) {
					PacketBufferNode var3 = class139.getPacketBufferNode(ClientPacket.CLAN_SETTINGS_ADD_BANNED_FROM_CHANNEL, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(3 + FriendsChat.stringCp1252NullTerminatedByteSize(var2.username.getName()));
					var3.packetBuffer.writeByte(var0);
					var3.packetBuffer.writeShort(var1);
					var3.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName());
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}

	@ObfuscatedName("oe")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1195462019"
	)
	static void method336(String var0) {
		ApproximateRouteStrategy.field267 = var0;

		try {
			String var1 = class36.client.getParameter(Integer.toString(18));
			String var2 = class36.client.getParameter(Integer.toString(13));
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2;
			if (var0.isEmpty()) {
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				String var4 = var3 + "; Expires=";
				long var6 = class180.method3973() + 94608000000L;
				Calendar.Calendar_calendar.setTime(new Date(var6));
				int var8 = Calendar.Calendar_calendar.get(7);
				int var9 = Calendar.Calendar_calendar.get(5);
				int var10 = Calendar.Calendar_calendar.get(2);
				int var11 = Calendar.Calendar_calendar.get(1);
				int var12 = Calendar.Calendar_calendar.get(11);
				int var13 = Calendar.Calendar_calendar.get(12);
				int var14 = Calendar.Calendar_calendar.get(13);
				String var5 = Calendar.DAYS_OF_THE_WEEK[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + Calendar.MONTH_NAMES_ENGLISH_GERMAN[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
				var3 = var4 + var5 + "; Max-Age=" + 94608000L;
			}

			class26.method389(class36.client, "document.cookie=\"" + var3 + "\"");
		} catch (Throwable var15) {
		}

	}
}
