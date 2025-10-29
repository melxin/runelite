import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qc")
@Implements("GrandExchangeOfferWorldComparator")
final class GrandExchangeOfferWorldComparator implements Comparator {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	@Export("HitSplatDefinition_archive")
	static AbstractArchive HitSplatDefinition_archive;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lqk;Lqk;B)I",
		garbageValue = "92"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.world < var2.world ? -1 : (var2.world == var1.world ? 0 : 1);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "(Ldd;Lcr;IIIIII)V",
		garbageValue = "687535200"
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
			if (var1.overheadText != null && (!var9 || !var1.field1056 && (Client.publicChatMode == 4 || !var1.field1046 && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var1).isFriend())))) {
				ClanSettings.method4097(var0, var1, var1.vmethod2826());
				if (Client.viewportTempX > -1 && Client.overheadTextCount < Client.field449) {
					Client.overheadTextXOffsets[Client.overheadTextCount] = class234.fontBold12.stringWidth(var1.overheadText) / 2;
					Client.overheadTextAscents[Client.overheadTextCount] = class234.fontBold12.ascent;
					Client.overheadTextXs[Client.overheadTextCount] = Client.viewportTempX;
					Client.overheadTextYs[Client.overheadTextCount] = Client.viewportTempY - var10;
					Client.overheadTextColors[Client.overheadTextCount] = var1.field1049;
					Client.overheadTextEffects[Client.overheadTextCount] = var1.field1050;
					Client.overheadTextCyclesRemaining[Client.overheadTextCount] = var1.overheadTextCyclesRemaining;
					Client.field456[Client.overheadTextCount] = var1.field1051;
					Client.overheadText[Client.overheadTextCount] = var1.overheadText;
					++Client.overheadTextCount;
					var10 += 12;
				}
			}

			int var16;
			int var23;
			int var24;
			if (!var1.healthBars.method9013()) {
				ClanSettings.method4097(var0, var1, var1.vmethod2826() + 15);

				for (HealthBarConfig var11 = (HealthBarConfig)var1.healthBars.last(); var11 != null; var11 = (HealthBarConfig)var1.healthBars.previous()) {
					HealthBarUpdate var12 = var11.get(Client.cycle);
					if (var12 == null) {
						if (var11.isEmpty()) {
							var11.remove();
						}
					} else {
						HealthBarDefinition var13 = var11.definition;
						SpritePixels var80 = var13.getBackSprite();
						SpritePixels var84 = var13.getFrontSprite();
						int var85 = 0;
						if (var80 != null && var84 != null) {
							if (var13.widthPadding * 2 < var84.subWidth) {
								var85 = var13.widthPadding;
							}

							var16 = var84.subWidth - var85 * 2;
						} else {
							var16 = var13.width;
						}

						int var82 = 255;
						boolean var86 = true;
						int var87 = Client.cycle - var12.cycle;
						int var88 = var16 * var12.health2 / var13.width;
						int var89;
						int var99;
						if (var12.cycleOffset > var87) {
							var89 = var13.field2041 == 0 ? 0 : var13.field2041 * (var87 / var13.field2041);
							var23 = var16 * var12.health / var13.width;
							var99 = var89 * (var88 - var23) / var12.cycleOffset + var23;
						} else {
							var99 = var88;
							var89 = var13.int5 + var12.cycleOffset - var87;
							if (var13.int3 >= 0) {
								var82 = (var89 << 8) / (var13.int5 - var13.int3);
							}
						}

						if (var12.health2 > 0 && var99 < 1) {
							var99 = 1;
						}

						if (var80 != null && var84 != null) {
							if (var99 == var16) {
								var99 += var85 * 2;
							} else {
								var99 += var85;
							}

							var89 = var80.subHeight;
							var10 += var89;
							var23 = var3 + Client.viewportTempX - (var16 >> 1);
							var24 = var4 + Client.viewportTempY - var10;
							var23 -= var85;
							if (var82 >= 0 && var82 < 255) {
								var80.drawTransAt(var23, var24, var82);
								Rasterizer2D.Rasterizer2D_expandClip(var23, var24, var23 + var99, var89 + var24);
								var84.drawTransAt(var23, var24, var82);
							} else {
								var80.drawTransBgAt(var23, var24);
								Rasterizer2D.Rasterizer2D_expandClip(var23, var24, var99 + var23, var89 + var24);
								var84.drawTransBgAt(var23, var24);
							}

							Rasterizer2D.Rasterizer2D_setClip(var3, var4, var3 + var5, var4 + var6);
							var10 += 2;
						} else {
							var10 += 5;
							if (Client.viewportTempX > -1) {
								var89 = var3 + Client.viewportTempX - (var16 >> 1);
								var23 = var4 + Client.viewportTempY - var10;
								Rasterizer2D.Rasterizer2D_fillRectangle(var89, var23, var99, 5, 65280);
								Rasterizer2D.Rasterizer2D_fillRectangle(var99 + var89, var23, var16 - var99, 5, 16711680);
							}

							var10 += 2;
						}
					}
				}
			}

			if (var10 == -2) {
				var10 += 7;
			}

			Player var90;
			if (var9 && Client.cycle == var1.playerCycle && class152.method3979((Player)var1)) {
				var90 = (Player)var1;
				if (var9) {
					ClanSettings.method4097(var0, var1, var1.vmethod2826() + 15);
					AbstractFont var91 = (AbstractFont)Client.fontsMap.get(FontName.FontName_plain12);
					var10 += 4;
					var91.drawCentered(var90.username.getName(), var3 + Client.viewportTempX, var4 + Client.viewportTempY - var10, 16777215, 0);
					var10 += 18;
				}
			}

			if (var9) {
				var90 = (Player)var1;
				if (var90.isHidden) {
					return;
				}

				if (var90.headIconPk != -1 || var90.headIconPrayer != -1) {
					ClanSettings.method4097(var0, var1, var1.vmethod2826() + 15);
					if (Client.viewportTempX > -1) {
						if (var90.headIconPk != -1) {
							var10 += 25;
							class66.headIconPkSprites[var90.headIconPk].drawTransBgAt(var3 + Client.viewportTempX - 12, var4 + Client.viewportTempY - var10);
						}

						if (var90.headIconPrayer != -1) {
							var10 += 25;
							class279.headIconPrayerSprites[var90.headIconPrayer].drawTransBgAt(var3 + Client.viewportTempX - 12, var4 + Client.viewportTempY - var10);
						}
					}
				}

				if (var2 >= 0 && Client.hintArrow.method8423() == 3 && Client.hintArrow.method8454() == var8[var2]) {
					ClanSettings.method4097(var0, var1, var1.vmethod2826() + 15);
					if (Client.viewportTempX > -1) {
						var10 += SceneTilePaint.headIconHintSprites[1].subHeight;
						SceneTilePaint.headIconHintSprites[1].drawTransBgAt(var3 + Client.viewportTempX - 12, var4 + Client.viewportTempY - var10);
					}
				}
			} else {
				NPC var92 = (NPC)var1;
				int[] var93 = var92.method2816();
				short[] var94 = var92.method2817();
				if (var94 != null && var93 != null) {
					for (int var14 = 0; var14 < var94.length; ++var14) {
						if (var94[var14] >= 0 && var93[var14] >= 0) {
							long var15 = (long)var93[var14] << 8 | (long)var94[var14];
							SpritePixels var17 = (SpritePixels)Client.field363.method10126(var15);
							if (var17 == null) {
								SpritePixels[] var18 = class69.method2287(class147.archive8, var93[var14], 0);
								if (var18 != null && var94[var14] < var18.length) {
									var17 = var18[var94[var14]];
									Client.field363.method10124(var15, var17);
								}
							}

							if (var17 != null) {
								ClanSettings.method4097(var0, var1, var1.vmethod2826() + 15);
								if (Client.viewportTempX > -1) {
									var17.drawTransBgAt(var3 + Client.viewportTempX - (var17.subWidth >> 1), (var4 - var17.subHeight - 2) * (var14 + 1) - var17.subHeight + Client.viewportTempY - 4);
								}
							}
						}
					}
				}

				if (Client.hintArrow.method8423() == 1 && Client.hintArrow.method8454() == var0.field1130.method10037(var2 - var76) && Client.cycle % 20 < 10) {
					ClanSettings.method4097(var0, var1, var1.vmethod2826() + 15);
					if (Client.viewportTempX > -1) {
						SceneTilePaint.headIconHintSprites[0].drawTransBgAt(var3 + Client.viewportTempX - 12, var4 + Client.viewportTempY - 28);
					}
				}
			}

			for (int var77 = 0; var77 < 4; ++var77) {
				int var78 = var1.hitSplatCycles[var77];
				int var79 = var1.hitSplatTypes[var77];
				HitSplatDefinition var97 = null;
				int var81 = 0;
				if (var79 >= 0) {
					if (var78 <= Client.cycle) {
						continue;
					}

					var97 = class159.method4033(var1.hitSplatTypes[var77]);
					var81 = var97.field2309;
					if (var97 != null && var97.transforms != null) {
						var97 = var97.transform();
						if (var97 == null) {
							var1.hitSplatCycles[var77] = -1;
							continue;
						}
					}
				} else if (var78 < 0) {
					continue;
				}

				var16 = var1.hitSplatTypes2[var77];
				HitSplatDefinition var95 = null;
				if (var16 >= 0) {
					var95 = class159.method4033(var16);
					if (var95 != null && var95.transforms != null) {
						var95 = var95.transform();
					}
				}

				if (var78 - var81 <= Client.cycle) {
					if (var97 == null) {
						var1.hitSplatCycles[var77] = -1;
					} else {
						ClanSettings.method4097(var0, var1, var1.vmethod2826() / 2);
						if (Client.viewportTempX > -1) {
							boolean var98 = true;
							if (var77 == 1) {
								Client.viewportTempY -= 20;
							}

							if (var77 == 2) {
								Client.viewportTempX -= 15;
								Client.viewportTempY -= 10;
							}

							if (var77 == 3) {
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
							var19 = var97.method4766();
							int var44;
							if (var19 != null) {
								var23 = var19.subWidth;
								var44 = var19.subHeight;
								if (var44 > var43) {
									var43 = var44;
								}

								var27 = var19.xOffset;
							}

							var20 = var97.method4760();
							if (var20 != null) {
								var24 = var20.subWidth;
								var44 = var20.subHeight;
								if (var44 > var43) {
									var43 = var44;
								}

								var28 = var20.xOffset;
							}

							var21 = var97.method4743();
							if (var21 != null) {
								var25 = var21.subWidth;
								var44 = var21.subHeight;
								if (var44 > var43) {
									var43 = var44;
								}

								var29 = var21.xOffset;
							}

							var22 = var97.method4744();
							if (var22 != null) {
								var26 = var22.subWidth;
								var44 = var22.subHeight;
								if (var44 > var43) {
									var43 = var44;
								}

								var30 = var22.xOffset;
							}

							if (var95 != null) {
								var31 = var95.method4766();
								if (var31 != null) {
									var35 = var31.subWidth;
									var44 = var31.subHeight;
									if (var44 > var43) {
										var43 = var44;
									}

									var39 = var31.xOffset;
								}

								var32 = var95.method4760();
								if (var32 != null) {
									var36 = var32.subWidth;
									var44 = var32.subHeight;
									if (var44 > var43) {
										var43 = var44;
									}

									var40 = var32.xOffset;
								}

								var33 = var95.method4743();
								if (var33 != null) {
									var37 = var33.subWidth;
									var44 = var33.subHeight;
									if (var44 > var43) {
										var43 = var44;
									}

									var41 = var33.xOffset;
								}

								var34 = var95.method4744();
								if (var34 != null) {
									var38 = var34.subWidth;
									var44 = var34.subHeight;
									if (var44 > var43) {
										var43 = var44;
									}

									var42 = var34.xOffset;
								}
							}

							Font var83 = var97.getFont();
							if (var83 == null) {
								var83 = class498.fontPlain11;
							}

							Font var45;
							if (var95 != null) {
								var45 = var95.getFont();
								if (var45 == null) {
									var45 = class498.fontPlain11;
								}
							} else {
								var45 = class498.fontPlain11;
							}

							String var46 = null;
							String var47 = null;
							boolean var48 = false;
							int var49 = 0;
							var46 = var97.getString(var1.hitSplatValues[var77]);
							int var96 = var83.stringWidth(var46);
							if (var95 != null) {
								var47 = var95.getString(var1.hitSplatValues2[var77]);
								var49 = var45.stringWidth(var47);
							}

							int var50 = 0;
							int var51 = 0;
							if (var24 > 0) {
								if (var21 == null && var22 == null) {
									var50 = 1;
								} else {
									var50 = var96 / var24 + 1;
								}
							}

							if (var95 != null && var36 > 0) {
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
								var56 += (var57 - var96) / 2;
							} else {
								var52 += var96;
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
							if (var95 != null) {
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
									var63 = var51 * var36;
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

							var63 = var1.hitSplatCycles[var77] - Client.cycle;
							int var64 = var97.field2314 - var63 * var97.field2314 / var97.field2309;
							int var65 = var63 * var97.field2321 / var97.field2309 + -var97.field2321;
							int var66 = var64 + (var3 + Client.viewportTempX - (var52 >> 1));
							int var67 = var65 + (var4 + Client.viewportTempY - 12);
							int var68 = var67;
							int var69 = var67 + var43;
							int var70 = var67 + var97.field2301 + 15;
							int var71 = var70 - var83.maxAscent;
							int var72 = var70 + var83.maxDescent;
							if (var71 < var67) {
								var68 = var71;
							}

							if (var72 > var69) {
								var69 = var72;
							}

							int var73 = 0;
							int var74;
							int var75;
							if (var95 != null) {
								var73 = var67 + var95.field2301 + 15;
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
							if (var97.field2316 >= 0) {
								var74 = (var63 << 8) / (var97.field2309 - var97.field2316);
							}

							if (var74 >= 0 && var74 < 255) {
								if (var19 != null) {
									var19.drawTransAt(var66 + var53 - var27, var67, var74);
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

								var83.drawAlpha(var46, var56 + var66, var70, var97.textColor, 0, var74);
								if (var95 != null) {
									if (var31 != null) {
										var31.drawTransAt(var66 + var58 - var39, var67, var74);
									}

									if (var33 != null) {
										var33.drawTransAt(var59 + var66 - var41, var67, var74);
									}

									if (var32 != null) {
										for (var75 = 0; var75 < var51; ++var75) {
											var32.drawTransAt(var36 * var75 + (var66 + var60 - var40), var67, var74);
										}
									}

									if (var34 != null) {
										var34.drawTransAt(var66 + var61 - var42, var67, var74);
									}

									var45.drawAlpha(var47, var66 + var62, var73, var95.textColor, 0, var74);
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
										var20.drawTransBgAt(var75 * var24 + (var66 + var55 - var28), var67);
									}
								}

								if (var22 != null) {
									var22.drawTransBgAt(var57 + var66 - var30, var67);
								}

								var83.draw(var46, var66 + var56, var70, var97.textColor | -16777216, 0);
								if (var95 != null) {
									if (var31 != null) {
										var31.drawTransBgAt(var58 + var66 - var39, var67);
									}

									if (var33 != null) {
										var33.drawTransBgAt(var59 + var66 - var41, var67);
									}

									if (var32 != null) {
										for (var75 = 0; var75 < var51; ++var75) {
											var32.drawTransBgAt(var75 * var36 + (var66 + var60 - var40), var67);
										}
									}

									if (var34 != null) {
										var34.drawTransBgAt(var61 + var66 - var42, var67);
									}

									var45.draw(var47, var62 + var66, var73, var95.textColor | -16777216, 0);
								}
							}
						}
					}
				}
			}

		}
	}
}
