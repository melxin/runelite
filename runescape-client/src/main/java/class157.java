import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gt")
public class class157 extends class148 {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("VarbitDefinition_archive")
	public static AbstractArchive VarbitDefinition_archive;
	@ObfuscatedName("ox")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	static GraphicsDefaults field1768;
	@ObfuscatedName("ao")
	String field1765;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	final class151 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfd;)V"
	)
	class157(class151 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lve;B)V",
		garbageValue = "53"
	)
	void vmethod3749(Buffer var1) {
		this.field1765 = var1.readStringCp1252NullTerminated();
		var1.readInt();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lgw;I)V",
		garbageValue = "1984465176"
	)
	void vmethod3750(ClanSettings var1) {
		var1.name = this.field1765;
	}

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(Ldj;Ldy;IIIIIB)V",
		garbageValue = "1"
	)
	@Export("drawActor2d")
	static final void drawActor2d(WorldView var0, Actor var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null && var1.isVisible()) {
			if (var1 instanceof NPC) {
				NPCComposition var7 = ((NPC)var1).definition;
				if (var7.transforms != null) {
					var7 = var7.transform();
				}

				if (var7 == null) {
					return;
				}
			}

			int var76 = Client.playerUpdateManager.playerCount;
			int[] var8 = Client.playerUpdateManager.playerIndices;
			boolean var9 = var2 < var76;
			int var10 = -2;
			if (var1.overheadText != null && (!var9 || !var1.field1251 && (Client.publicChatMode == 4 || !var1.field1227 && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var1).isFriend())))) {
				class165.method3675(var0, var1, var1.vmethod2917());
				if (Client.viewportTempX > -1 && Client.overheadTextCount < Client.overheadTextLimit) {
					Client.overheadTextXOffsets[Client.overheadTextCount] = class440.fontBold12.stringWidth(var1.overheadText) / 2;
					Client.overheadTextAscents[Client.overheadTextCount] = class440.fontBold12.ascent;
					Client.overheadTextXs[Client.overheadTextCount] = Client.viewportTempX;
					Client.overheadTextYs[Client.overheadTextCount] = Client.viewportTempY - var10;
					Client.overheadTextColors[Client.overheadTextCount] = var1.field1253;
					Client.overheadTextEffects[Client.overheadTextCount] = var1.field1254;
					Client.overheadTextCyclesRemaining[Client.overheadTextCount] = var1.overheadTextCyclesRemaining;
					Client.field646[Client.overheadTextCount] = var1.field1255;
					Client.overheadText[Client.overheadTextCount] = var1.overheadText;
					++Client.overheadTextCount;
					var10 += 12;
				}
			}

			int var16;
			int var23;
			int var24;
			if (!var1.healthBars.method8103()) {
				class165.method3675(var0, var1, var1.vmethod2917() + 15);

				for (HealthBarConfig var11 = (HealthBarConfig)var1.healthBars.last(); var11 != null; var11 = (HealthBarConfig)var1.healthBars.previous()) {
					HealthBarUpdate var12 = var11.get(Client.cycle);
					if (var12 == null) {
						if (var11.isEmpty()) {
							var11.remove();
						}
					} else {
						HealthBarDefinition var78 = var11.definition;
						SpritePixels var79 = var78.getBackSprite();
						SpritePixels var85 = var78.getFrontSprite();
						int var86 = 0;
						if (var79 != null && var85 != null) {
							if (var78.widthPadding * 2 < var85.subWidth) {
								var86 = var78.widthPadding;
							}

							var16 = var85.subWidth - var86 * 2;
						} else {
							var16 = var78.width;
						}

						int var83 = 255;
						boolean var87 = true;
						int var88 = Client.cycle - var12.cycle;
						int var89 = var16 * var12.health2 / var78.width;
						int var90;
						int var106;
						if (var12.cycleOffset > var88) {
							var90 = var78.field2636 == 0 ? 0 : var78.field2636 * (var88 / var78.field2636);
							var23 = var16 * var12.health / var78.width;
							var106 = var90 * (var89 - var23) / var12.cycleOffset + var23;
						} else {
							var106 = var89;
							var90 = var12.cycleOffset + var78.int5 - var88;
							if (var78.int3 >= 0) {
								var83 = (var90 << 8) / (var78.int5 - var78.int3);
							}
						}

						if (var12.health2 > 0 && var106 < 1) {
							var106 = 1;
						}

						if (var79 != null && var85 != null) {
							if (var16 == var106) {
								var106 += var86 * 2;
							} else {
								var106 += var86;
							}

							var90 = var79.subHeight;
							var10 += var90;
							var23 = var3 + Client.viewportTempX - (var16 >> 1);
							var24 = var4 + Client.viewportTempY - var10;
							var23 -= var86;
							if (var83 >= 0 && var83 < 255) {
								var79.drawTransAt(var23, var24, var83);
								Rasterizer2D.Rasterizer2D_expandClip(var23, var24, var23 + var106, var90 + var24);
								var85.drawTransAt(var23, var24, var83);
							} else {
								var79.drawTransBgAt(var23, var24);
								Rasterizer2D.Rasterizer2D_expandClip(var23, var24, var106 + var23, var90 + var24);
								var85.drawTransBgAt(var23, var24);
							}

							Rasterizer2D.Rasterizer2D_setClip(var3, var4, var3 + var5, var4 + var6);
							var10 += 2;
						} else {
							var10 += 5;
							if (Client.viewportTempX > -1) {
								var90 = var3 + Client.viewportTempX - (var16 >> 1);
								var23 = var4 + Client.viewportTempY - var10;
								Rasterizer2D.Rasterizer2D_fillRectangle(var90, var23, var106, 5, 65280);
								Rasterizer2D.Rasterizer2D_fillRectangle(var90 + var106, var23, var16 - var106, 5, 16711680);
							}

							var10 += 2;
						}
					}
				}
			}

			if (var10 == -2) {
				var10 += 7;
			}

			if (var9 && Client.cycle == var1.playerCycle) {
				Player var93 = (Player)var1;
				boolean var77;
				if (Client.drawPlayerNames == 0) {
					var77 = false;
				} else if (var93 != Script.localPlayer) {
					boolean var13 = (Client.drawPlayerNames & 4) != 0;
					boolean var14 = var13;
					if (!var13) {
						boolean var15 = (Client.drawPlayerNames & 1) != 0;
						var14 = var15 && var93.isFriend();
					}

					var77 = var14 || class256.method5321() && var93.isFriendsChatMember();
				} else {
					var77 = Canvas.method326();
				}

				if (var77) {
					Player var100 = (Player)var1;
					if (var9) {
						class165.method3675(var0, var1, var1.vmethod2917() + 15);
						AbstractFont var103 = (AbstractFont)Client.fontsMap.get(FontName.FontName_plain12);
						var10 += 4;
						var103.drawCentered(var100.username.getName(), var3 + Client.viewportTempX, var4 + Client.viewportTempY - var10, 16777215, 0);
						var10 += 18;
					}
				}
			}

			if (var9) {
				Player var91 = (Player)var1;
				if (var91.isHidden) {
					return;
				}

				if (var91.headIconPk != -1 || var91.headIconPrayer != -1) {
					class165.method3675(var0, var1, var1.defaultHeight + 15);
					if (Client.viewportTempX > -1) {
						if (var91.headIconPk != -1) {
							var10 += 25;
							class521.headIconPkSprites[var91.headIconPk].drawTransBgAt(var3 + Client.viewportTempX - 12, var4 + Client.viewportTempY - var10);
						}

						if (var91.headIconPrayer != -1) {
							var10 += 25;
							class241.headIconPrayerSprites[var91.headIconPrayer].drawTransBgAt(var3 + Client.viewportTempX - 12, var4 + Client.viewportTempY - var10);
						}
					}
				}

				if (var2 >= 0 && Client.hintArrowType == 10 && var8[var2] == Client.hintArrowPlayerIndex) {
					class165.method3675(var0, var1, var1.defaultHeight + 15);
					if (Client.viewportTempX > -1) {
						var10 += KeyHandler.headIconHintSprites[1].subHeight;
						KeyHandler.headIconHintSprites[1].drawTransBgAt(var3 + Client.viewportTempX - 12, var4 + Client.viewportTempY - var10);
					}
				}
			} else {
				NPC var92 = (NPC)var1;
				int[] var94 = var92.method2923();
				short[] var102 = var92.method2901();
				if (var102 != null && var94 != null) {
					for (int var96 = 0; var96 < var102.length; ++var96) {
						if (var102[var96] >= 0 && var94[var96] >= 0) {
							long var80 = (long)var94[var96] << 8 | (long)var102[var96];
							SpritePixels var17 = (SpritePixels)Client.field770.method9082(var80);
							if (var17 == null) {
								SpritePixels[] var18 = GrandExchangeEvents.method7833(class357.archive8, var94[var96], 0);
								if (var18 != null && var102[var96] < var18.length) {
									var17 = var18[var102[var96]];
									Client.field770.method9083(var80, var17);
								}
							}

							if (var17 != null) {
								class165.method3675(var0, var1, var1.vmethod2917() + 15);
								if (Client.viewportTempX > -1) {
									var17.drawTransBgAt(var3 + Client.viewportTempX - (var17.subWidth >> 1), (var4 - var17.subHeight - 2) * (var96 + 1) - var17.subHeight + Client.viewportTempY - 4);
								}
							}
						}
					}
				}

				if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex == var0.field1351.method9056(var2 - var76) && Client.cycle % 20 < 10) {
					class165.method3675(var0, var1, var1.vmethod2917() + 15);
					if (Client.viewportTempX > -1) {
						KeyHandler.headIconHintSprites[0].drawTransBgAt(var3 + Client.viewportTempX - 12, var4 + Client.viewportTempY - 28);
					}
				}
			}

			for (int var101 = 0; var101 < 4; ++var101) {
				int var82 = var1.hitSplatCycles[var101];
				int var95 = var1.hitSplatTypes[var101];
				HitSplatDefinition var104 = null;
				int var97 = 0;
				if (var95 >= 0) {
					if (var82 <= Client.cycle) {
						continue;
					}

					var104 = class172.method3755(var1.hitSplatTypes[var101]);
					var97 = var104.field2863;
					if (var104 != null && var104.transforms != null) {
						var104 = var104.transform();
						if (var104 == null) {
							var1.hitSplatCycles[var101] = -1;
							continue;
						}
					}
				} else if (var82 < 0) {
					continue;
				}

				var16 = var1.hitSplatTypes2[var101];
				HitSplatDefinition var98 = null;
				if (var16 >= 0) {
					var98 = class172.method3755(var16);
					if (var98 != null && var98.transforms != null) {
						var98 = var98.transform();
					}
				}

				if (var82 - var97 <= Client.cycle) {
					if (var104 == null) {
						var1.hitSplatCycles[var101] = -1;
					} else {
						class165.method3675(var0, var1, var1.vmethod2917() / 2);
						if (Client.viewportTempX > -1) {
							boolean var105 = true;
							if (var101 == 1) {
								Client.viewportTempY -= 20;
							}

							if (var101 == 2) {
								Client.viewportTempX -= 15;
								Client.viewportTempY -= 10;
							}

							if (var101 == 3) {
								Client.viewportTempX += 15;
								Client.viewportTempY -= 10;
							}

							SpritePixels var19 = null;
							SpritePixels var20 = null;
							SpritePixels var21 = null;
							SpritePixels var22 = null;
							var23 = 0;
							var24 = 0;
							int var25 = 0;
							int var26 = 0;
							int var27 = 0;
							int var28 = 0;
							int var29 = 0;
							int var30 = 0;
							SpritePixels var31 = null;
							SpritePixels var32 = null;
							SpritePixels var33 = null;
							SpritePixels var34 = null;
							int var35 = 0;
							int var36 = 0;
							int var37 = 0;
							int var38 = 0;
							int var39 = 0;
							int var40 = 0;
							int var41 = 0;
							int var42 = 0;
							int var43 = 0;
							var19 = var104.method5386();
							int var44;
							if (var19 != null) {
								var23 = var19.subWidth;
								var44 = var19.subHeight;
								if (var44 > var43) {
									var43 = var44;
								}

								var27 = var19.xOffset;
							}

							var20 = var104.method5399();
							if (var20 != null) {
								var24 = var20.subWidth;
								var44 = var20.subHeight;
								if (var44 > var43) {
									var43 = var44;
								}

								var28 = var20.xOffset;
							}

							var21 = var104.method5393();
							if (var21 != null) {
								var25 = var21.subWidth;
								var44 = var21.subHeight;
								if (var44 > var43) {
									var43 = var44;
								}

								var29 = var21.xOffset;
							}

							var22 = var104.method5406();
							if (var22 != null) {
								var26 = var22.subWidth;
								var44 = var22.subHeight;
								if (var44 > var43) {
									var43 = var44;
								}

								var30 = var22.xOffset;
							}

							if (var98 != null) {
								var31 = var98.method5386();
								if (var31 != null) {
									var35 = var31.subWidth;
									var44 = var31.subHeight;
									if (var44 > var43) {
										var43 = var44;
									}

									var39 = var31.xOffset;
								}

								var32 = var98.method5399();
								if (var32 != null) {
									var36 = var32.subWidth;
									var44 = var32.subHeight;
									if (var44 > var43) {
										var43 = var44;
									}

									var40 = var32.xOffset;
								}

								var33 = var98.method5393();
								if (var33 != null) {
									var37 = var33.subWidth;
									var44 = var33.subHeight;
									if (var44 > var43) {
										var43 = var44;
									}

									var41 = var33.xOffset;
								}

								var34 = var98.method5406();
								if (var34 != null) {
									var38 = var34.subWidth;
									var44 = var34.subHeight;
									if (var44 > var43) {
										var43 = var44;
									}

									var42 = var34.xOffset;
								}
							}

							Font var84 = var104.getFont();
							if (var84 == null) {
								var84 = class282.fontPlain11;
							}

							Font var45;
							if (var98 != null) {
								var45 = var98.getFont();
								if (var45 == null) {
									var45 = class282.fontPlain11;
								}
							} else {
								var45 = class282.fontPlain11;
							}

							String var46 = null;
							String var47 = null;
							boolean var48 = false;
							int var49 = 0;
							var46 = var104.getString(var1.hitSplatValues[var101]);
							int var99 = var84.stringWidth(var46);
							if (var98 != null) {
								var47 = var98.getString(var1.hitSplatValues2[var101]);
								var49 = var45.stringWidth(var47);
							}

							int var50 = 0;
							int var51 = 0;
							if (var24 > 0) {
								if (var21 == null && var22 == null) {
									var50 = 1;
								} else {
									var50 = var99 / var24 + 1;
								}
							}

							if (var98 != null && var36 > 0) {
								if (var33 == null && var34 == null) {
									var51 = 1;
								} else {
									var51 = var49 / var36 + 1;
								}
							}

							int var52 = 0;
							int var53 = var52;
							if (var23 > 0) {
								var52 += var23;
							}

							var52 += 2;
							int var54 = var52;
							if (var25 > 0) {
								var52 += var25;
							}

							int var55 = var52;
							int var56 = var52;
							int var57;
							if (var24 > 0) {
								var57 = var24 * var50;
								var52 += var57;
								var56 += (var57 - var99) / 2;
							} else {
								var52 += var99;
							}

							var57 = var52;
							if (var26 > 0) {
								var52 += var26;
							}

							int var58 = 0;
							int var59 = 0;
							int var60 = 0;
							int var61 = 0;
							int var62 = 0;
							int var63;
							if (var98 != null) {
								var52 += 2;
								var58 = var52;
								if (var35 > 0) {
									var52 += var35;
								}

								var52 += 2;
								var59 = var52;
								if (var37 > 0) {
									var52 += var37;
								}

								var60 = var52;
								var62 = var52;
								if (var36 > 0) {
									var63 = var36 * var51;
									var52 += var63;
									var62 += (var63 - var49) / 2;
								} else {
									var52 += var49;
								}

								var61 = var52;
								if (var38 > 0) {
									var52 += var38;
								}
							}

							var63 = var1.hitSplatCycles[var101] - Client.cycle;
							int var64 = var104.field2854 - var63 * var104.field2854 / var104.field2863;
							int var65 = var63 * var104.field2856 / var104.field2863 + -var104.field2856;
							int var66 = var64 + (var3 + Client.viewportTempX - (var52 >> 1));
							int var67 = var65 + (var4 + Client.viewportTempY - 12);
							int var68 = var67;
							int var69 = var67 + var43;
							int var70 = var67 + var104.field2860 + 15;
							int var71 = var70 - var84.maxAscent;
							int var72 = var70 + var84.maxDescent;
							if (var71 < var67) {
								var68 = var71;
							}

							if (var72 > var69) {
								var69 = var72;
							}

							int var73 = 0;
							int var74;
							int var75;
							if (var98 != null) {
								var73 = var67 + var98.field2860 + 15;
								var74 = var73 - var45.maxAscent;
								var75 = var73 + var45.maxDescent;
								if (var74 < var68) {
									;
								}

								if (var75 > var69) {
									;
								}
							}

							var74 = 255;
							if (var104.field2857 >= 0) {
								var74 = (var63 << 8) / (var104.field2863 - var104.field2857);
							}

							if (var74 >= 0 && var74 < 255) {
								if (var19 != null) {
									var19.drawTransAt(var53 + var66 - var27, var67, var74);
								}

								if (var21 != null) {
									var21.drawTransAt(var54 + var66 - var29, var67, var74);
								}

								if (var20 != null) {
									for (var75 = 0; var75 < var50; ++var75) {
										var20.drawTransAt(var75 * var24 + (var55 + var66 - var28), var67, var74);
									}
								}

								if (var22 != null) {
									var22.drawTransAt(var66 + var57 - var30, var67, var74);
								}

								var84.drawAlpha(var46, var66 + var56, var70, var104.textColor, 0, var74);
								if (var98 != null) {
									if (var31 != null) {
										var31.drawTransAt(var58 + var66 - var39, var67, var74);
									}

									if (var33 != null) {
										var33.drawTransAt(var59 + var66 - var41, var67, var74);
									}

									if (var32 != null) {
										for (var75 = 0; var75 < var51; ++var75) {
											var32.drawTransAt(var36 * var75 + (var60 + var66 - var40), var67, var74);
										}
									}

									if (var34 != null) {
										var34.drawTransAt(var61 + var66 - var42, var67, var74);
									}

									var45.drawAlpha(var47, var66 + var62, var73, var98.textColor, 0, var74);
								}
							} else {
								if (var19 != null) {
									var19.drawTransBgAt(var66 + var53 - var27, var67);
								}

								if (var21 != null) {
									var21.drawTransBgAt(var66 + var54 - var29, var67);
								}

								if (var20 != null) {
									for (var75 = 0; var75 < var50; ++var75) {
										var20.drawTransBgAt(var75 * var24 + (var55 + var66 - var28), var67);
									}
								}

								if (var22 != null) {
									var22.drawTransBgAt(var66 + var57 - var30, var67);
								}

								var84.draw(var46, var56 + var66, var70, var104.textColor | -16777216, 0);
								if (var98 != null) {
									if (var31 != null) {
										var31.drawTransBgAt(var58 + var66 - var39, var67);
									}

									if (var33 != null) {
										var33.drawTransBgAt(var59 + var66 - var41, var67);
									}

									if (var32 != null) {
										for (var75 = 0; var75 < var51; ++var75) {
											var32.drawTransBgAt(var36 * var75 + (var66 + var60 - var40), var67);
										}
									}

									if (var34 != null) {
										var34.drawTransBgAt(var61 + var66 - var42, var67);
									}

									var45.draw(var47, var66 + var62, var73, var98.textColor | -16777216, 0);
								}
							}
						}
					}
				}
			}

		}
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "478163025"
	)
	static final void method3539(boolean var0) {
		class362.method7337();
		++Client.packetWriter.pendingWrites;
		if (Client.packetWriter.pendingWrites >= 50 || var0) {
			Client.packetWriter.pendingWrites = 0;
			if (!Client.hadNetworkError && Client.packetWriter.getSocket() != null) {
				PacketBufferNode var1 = FloorDecoration.getPacketBufferNode(ClientPacket.NO_TIMEOUT, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var1);

				try {
					Client.packetWriter.flush();
				} catch (IOException var3) {
					Client.hadNetworkError = true;
				}
			}

		}
	}

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(Ldj;Ldk;B)V",
		garbageValue = "2"
	)
	static final void method3545(WorldView var0, PendingSpawn var1) {
		Scene var2 = var0.scene;
		long var3 = 0L;
		int var5 = -1;
		int var6 = 0;
		int var7 = 0;
		if (var1.type == 0) {
			var3 = var2.getBoundaryObjectTag(var1.plane, var1.x, var1.y);
		}

		if (var1.type == 1) {
			var3 = var2.getWallDecorationTag(var1.plane, var1.x, var1.y);
		}

		if (var1.type == 2) {
			var3 = var2.getGameObjectTag(var1.plane, var1.x, var1.y);
		}

		if (var1.type == 3) {
			var3 = var2.getFloorDecorationTag(var1.plane, var1.x, var1.y);
		}

		if (0L != var3) {
			int var8 = var2.getObjectFlags(var1.plane, var1.x, var1.y, var3);
			var5 = HttpMethod.Entity_unpackID(var3);
			var6 = var8 & 31;
			var7 = var8 >> 6 & 3;
		}

		var1.objectId = var5;
		var1.field1199 = var6;
		var1.field1198 = var7;
	}

	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-58001496"
	)
	static boolean method3542(int var0) {
		for (int var1 = 0; var1 < Client.field627; ++var1) {
			if (Client.field629[var1] == var0) {
				return true;
			}
		}

		return false;
	}
}
