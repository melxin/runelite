import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ox")
@Implements("Skills")
public class Skills {
	@ObfuscatedName("at")
	@Export("Skills_enabled")
	public static final boolean[] Skills_enabled;
	@ObfuscatedName("ag")
	@Export("Skills_experienceTable")
	public static int[] Skills_experienceTable;
	@ObfuscatedName("nd")
	static boolean field4383;

	static {
		Skills_enabled = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false};
		Skills_experienceTable = new int[99];
		int var0 = 0;

		for (int var1 = 0; var1 < 99; ++var1) {
			int var2 = var1 + 1;
			int var3 = (int)((double)var2 + 300.0D * Math.pow(2.0D, (double)var2 / 7.0D));
			var0 += var3;
			Skills_experienceTable[var1] = var0 / 4;
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lfu;FI)F",
		garbageValue = "-445872814"
	)
	static float method8170(class137 var0, float var1) {
		if (var0 != null && var0.method3766() != 0) {
			if (var1 < (float)var0.field1655[0].field1607) {
				return var0.field1653 == class135.field1636 ? var0.field1655[0].field1605 : LoginState.method793(var0, var1, true);
			} else if (var1 > (float)var0.field1655[var0.method3766() - 1].field1607) {
				return var0.field1654 == class135.field1636 ? var0.field1655[var0.method3766() - 1].field1605 : LoginState.method793(var0, var1, false);
			} else if (var0.field1652) {
				return var0.field1655[0].field1605;
			} else {
				class132 var2 = var0.method3765(var1);
				boolean var3 = false;
				boolean var4 = false;
				if (var2 == null) {
					return 0.0F;
				} else {
					if (var2.field1608 == 0.0F && var2.field1609 == 0.0F) {
						var3 = true;
					} else if (Float.MAX_VALUE == var2.field1608 && Float.MAX_VALUE == var2.field1609) {
						var4 = true;
					} else if (var2.field1613 != null) {
						if (var0.field1670) {
							float var5 = (float)var2.field1607;
							float var9 = var2.field1605;
							float var6 = var5 + 0.33333334F * var2.field1608;
							float var10 = var9 + 0.33333334F * var2.field1609;
							float var8 = (float)var2.field1613.field1607;
							float var12 = var2.field1613.field1605;
							float var7 = var8 - var2.field1613.field1604 * 0.33333334F;
							float var11 = var12 - 0.33333334F * var2.field1613.field1606;
							float var14;
							float var15;
							float var16;
							float var17;
							float var18;
							float var19;
							if (var0.field1673) {
								var15 = var10;
								var16 = var11;
								if (var0 != null) {
									var17 = var8 - var5;
									if (var17 != 0.0F) {
										var18 = var6 - var5;
										var19 = var7 - var5;
										float[] var28 = new float[]{var18 / var17, var19 / var17};
										var0.field1651 = var28[0] == 0.33333334F && var28[1] == 0.6666667F;
										float var21 = var28[0];
										float var22 = var28[1];
										if (var28[0] < 0.0F) {
											var28[0] = 0.0F;
										}

										if (var28[1] > 1.0F) {
											var28[1] = 1.0F;
										}

										if (var28[0] > 1.0F || var28[1] < -1.0F) {
											var28[1] = 1.0F - var28[1];
											if (var28[0] < 0.0F) {
												var28[0] = 0.0F;
											}

											if (var28[1] < 0.0F) {
												var28[1] = 0.0F;
											}

											if (var28[0] > 1.0F || var28[1] > 1.0F) {
												float var23 = (var28[1] - 2.0F) * var28[1] + var28[0] * (var28[0] - 2.0F + var28[1]) + 1.0F;
												if (var23 + class133.field1614 > 0.0F) {
													if (class133.field1614 + var28[0] < 1.3333334F) {
														float var24 = var28[0] - 2.0F;
														float var25 = var28[0] - 1.0F;
														float var26 = (float)Math.sqrt((double)(var24 * var24 - var25 * var25 * 4.0F));
														float var27 = 0.5F * (var26 + -var24);
														if (class133.field1614 + var28[1] > var27) {
															var28[1] = var27 - class133.field1614;
														} else {
															var27 = 0.5F * (-var24 - var26);
															if (var28[1] < var27 + class133.field1614) {
																var28[1] = class133.field1614 + var27;
															}
														}
													} else {
														var28[0] = 1.3333334F - class133.field1614;
														var28[1] = 0.33333334F - class133.field1614;
													}
												}
											}

											var28[1] = 1.0F - var28[1];
										}

										if (var21 != var28[0]) {
											float var10000 = var5 + var17 * var28[0];
											if (0.0F != var21) {
												var15 = var9 + var28[0] * (var10 - var9) / var21;
											}
										}

										if (var28[1] != var22) {
											var14 = var17 * var28[1] + var5;
											if (1.0F != var22) {
												var16 = var12 - (1.0F - var28[1]) * (var12 - var11) / (1.0F - var22);
											}
										}

										var0.field1656 = var5;
										var0.field1661 = var8;
										Skeleton.method5146(0.0F, var28[0], var28[1], 1.0F, var0);
										class107.method3440(var9, var15, var16, var12, var0);
									}
								}
							} else if (var0 != null) {
								var0.field1656 = var5;
								float var13 = var8 - var5;
								var14 = var12 - var9;
								var15 = var6 - var5;
								var16 = 0.0F;
								var17 = 0.0F;
								if (var15 != 0.0F) {
									var16 = (var10 - var9) / var15;
								}

								var15 = var8 - var7;
								if (var15 != 0.0F) {
									var17 = (var12 - var11) / var15;
								}

								var18 = 1.0F / (var13 * var13);
								var19 = var13 * var16;
								float var20 = var17 * var13;
								var0.field1664 = var18 * (var20 + var19 - var14 - var14) / var13;
								var0.field1657 = var18 * (var14 + var14 + var14 - var19 - var19 - var20);
								var0.field1667 = var16;
								var0.field1662 = var9;
							}

							var0.field1670 = false;
						}
					} else {
						var3 = true;
					}

					if (var3) {
						return var2.field1605;
					} else if (var4) {
						return var1 != (float)var2.field1607 && var2.field1613 != null ? var2.field1613.field1605 : var2.field1605;
					} else {
						return var0.field1673 ? class101.method3230(var0, var1) : class206.method4593(var0, var1);
					}
				}
			}
		} else {
			return 0.0F;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "30328"
	)
	static int method8167(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 0) {
				var1 = 0;
			} else if (var1 > 127) {
				var1 = 127;
			}

			var1 = 127 - var1;
			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ldm;I)V",
		garbageValue = "1590189182"
	)
	static final void method8168(WorldView var0) {
		int var1 = var0.sizeX;
		int var2 = var0.sizeY;
		int[][][] var3 = var0.tileHeights;
		byte[][][] var4 = var0.tileSettings;
		Scene var5 = var0.scene;
		CollisionMap[] var6 = var0.collisionMaps;

		int var7;
		int var8;
		for (var7 = 0; var7 < 4; ++var7) {
			for (var8 = 0; var8 < var1; ++var8) {
				for (int var9 = 0; var9 < var2; ++var9) {
					if ((var0.tileSettings[var7][var8][var9] & 1) == 1) {
						int var10 = var7;
						if ((var0.tileSettings[1][var8][var9] & 2) == 2) {
							var10 = var7 - 1;
						}

						if (var10 >= 0 && var6 != null) {
							var6[var10].setBlockedByFloor(var8, var9);
						}
					}
				}
			}
		}

		Tiles.rndHue += (int)(Math.random() * 5.0D) - 2;
		if (Tiles.rndHue < -8) {
			Tiles.rndHue = -8;
		}

		if (Tiles.rndHue > 8) {
			Tiles.rndHue = 8;
		}

		Tiles.rndLightness += (int)(Math.random() * 5.0D) - 2;
		if (Tiles.rndLightness < -16) {
			Tiles.rndLightness = -16;
		}

		if (Tiles.rndLightness > 16) {
			Tiles.rndLightness = 16;
		}

		for (var7 = 0; var7 < 4; ++var7) {
			byte[][] var48 = Tiles.Tiles_underlays2[var7];
			boolean var55 = true;
			boolean var56 = true;
			boolean var11 = true;
			boolean var12 = true;
			boolean var13 = true;
			int var14 = (int)Math.sqrt(5100.0D);
			int var15 = var14 * 768 >> 8;

			int var16;
			int var17;
			int var19;
			int var20;
			int var21;
			int var22;
			int var23;
			int var24;
			int var25;
			int var49;
			for (var16 = 1; var16 < var2 - 1; ++var16) {
				for (var17 = 1; var17 < var1 - 1; ++var17) {
					var49 = var3[var7][var17 + 1][var16] - var3[var7][var17 - 1][var16];
					var19 = var3[var7][var17][var16 + 1] - var3[var7][var17][var16 - 1];
					var20 = (int)Math.sqrt((double)(var49 * var49 + var19 * var19 + 65536));
					var21 = (var49 << 8) / var20;
					var22 = 65536 / var20;
					var23 = (var19 << 8) / var20;
					var24 = (var21 * -50 + var23 * -50 + var22 * -10) / var15 + 96;
					var25 = (var48[var17][var16 + 1] >> 3) + (var48[var17 - 1][var16] >> 2) + (var48[var17][var16 - 1] >> 2) + (var48[var17 + 1][var16] >> 3) + (var48[var17][var16] >> 1);
					SpriteBufferProperties.field24[var17][var16] = var24 - var25;
				}
			}

			for (var16 = 0; var16 < var2; ++var16) {
				class1.Tiles_hue[var16] = 0;
				ClanChannel.Tiles_saturation[var16] = 0;
				class165.Tiles_lightness[var16] = 0;
				class450.Tiles_hueMultiplier[var16] = 0;
				Language.field5129[var16] = 0;
			}

			for (var16 = -5; var16 < var1 + 5; ++var16) {
				int[] var10000;
				for (var17 = 0; var17 < var2; ++var17) {
					var49 = var16 + 5;
					int var10002;
					if (var49 >= 0 && var49 < var1) {
						var19 = (int)class331.method7062(15);
						var20 = Tiles.Tiles_underlays[var7][var49][var17] & var19;
						if (var20 > 0) {
							var22 = var20 - 1;
							FloorUnderlayDefinition var50 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var22);
							FloorUnderlayDefinition var52;
							if (var50 != null) {
								var52 = var50;
							} else {
								byte[] var51 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var22);
								var50 = new FloorUnderlayDefinition();
								if (var51 != null) {
									var50.decode(new Buffer(var51), var22);
								}

								var50.postDecode();
								FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var50, (long)var22);
								var52 = var50;
							}

							var10000 = class1.Tiles_hue;
							var10000[var17] += var52.hue;
							var10000 = ClanChannel.Tiles_saturation;
							var10000[var17] += var52.saturation;
							var10000 = class165.Tiles_lightness;
							var10000[var17] += var52.lightness;
							var10000 = class450.Tiles_hueMultiplier;
							var10000[var17] += var52.hueMultiplier;
							var10002 = Language.field5129[var17]++;
						}
					}

					var19 = var16 - 5;
					if (var19 >= 0 && var19 < var1) {
						var20 = (int)class331.method7062(15);
						var21 = Tiles.Tiles_underlays[var7][var19][var17] & var20;
						if (var21 > 0) {
							var23 = var21 - 1;
							FloorUnderlayDefinition var59 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var23);
							FloorUnderlayDefinition var54;
							if (var59 != null) {
								var54 = var59;
							} else {
								byte[] var53 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var23);
								var59 = new FloorUnderlayDefinition();
								if (var53 != null) {
									var59.decode(new Buffer(var53), var23);
								}

								var59.postDecode();
								FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var59, (long)var23);
								var54 = var59;
							}

							var10000 = class1.Tiles_hue;
							var10000[var17] -= var54.hue;
							var10000 = ClanChannel.Tiles_saturation;
							var10000[var17] -= var54.saturation;
							var10000 = class165.Tiles_lightness;
							var10000[var17] -= var54.lightness;
							var10000 = class450.Tiles_hueMultiplier;
							var10000[var17] -= var54.hueMultiplier;
							var10002 = Language.field5129[var17]--;
						}
					}
				}

				if (var16 >= 1 && var16 < var1 - 1) {
					var17 = 0;
					var49 = 0;
					var19 = 0;
					var20 = 0;
					var21 = 0;

					for (var22 = -5; var22 < var2 + 5; ++var22) {
						var23 = var22 + 5;
						if (var23 >= 0 && var23 < var2) {
							var17 += class1.Tiles_hue[var23];
							var49 += ClanChannel.Tiles_saturation[var23];
							var19 += class165.Tiles_lightness[var23];
							var20 += class450.Tiles_hueMultiplier[var23];
							var21 += Language.field5129[var23];
						}

						var24 = var22 - 5;
						if (var24 >= 0 && var24 < var2) {
							var17 -= class1.Tiles_hue[var24];
							var49 -= ClanChannel.Tiles_saturation[var24];
							var19 -= class165.Tiles_lightness[var24];
							var20 -= class450.Tiles_hueMultiplier[var24];
							var21 -= Language.field5129[var24];
						}

						if (var22 >= 1 && var22 < var2 - 1 && (!Client.isLowDetail || (var4[0][var16][var22] & 2) != 0 || (var4[var7][var16][var22] & 16) == 0)) {
							if (var7 < Tiles.Tiles_minPlane) {
								Tiles.Tiles_minPlane = var7;
							}

							var25 = (int)class331.method7062(15);
							int var26 = Tiles.Tiles_underlays[var7][var16][var22] & var25;
							int var27 = Tiles.Tiles_overlays[var7][var16][var22] & var25;
							if (var26 > 0 || var27 > 0) {
								int var28 = var3[var7][var16][var22];
								int var29 = var3[var7][var16 + 1][var22];
								int var30 = var3[var7][var16 + 1][var22 + 1];
								int var31 = var3[var7][var16][var22 + 1];
								int var32 = SpriteBufferProperties.field24[var16][var22];
								int var33 = SpriteBufferProperties.field24[var16 + 1][var22];
								int var34 = SpriteBufferProperties.field24[var16 + 1][var22 + 1];
								int var35 = SpriteBufferProperties.field24[var16][var22 + 1];
								int var36 = -1;
								int var37 = -1;
								int var38;
								int var39;
								if (var26 > 0) {
									var38 = var17 * 256 / var20;
									var39 = var49 / var21;
									int var40 = var19 / var21;
									var36 = class101.method3231(var38, var39, var40);
									var38 = var38 + Tiles.rndHue & 255;
									var40 += Tiles.rndLightness;
									if (var40 < 0) {
										var40 = 0;
									} else if (var40 > 255) {
										var40 = 255;
									}

									var37 = class101.method3231(var38, var39, var40);
								}

								if (var7 > 0) {
									boolean var57 = true;
									if (var26 == 0 && Frames.Tiles_shapes[var7][var16][var22] != 0) {
										var57 = false;
									}

									if (var27 > 0 && !ClientPreferences.method2731(var27 - 1).hideUnderlay) {
										var57 = false;
									}

									if (var57 && var29 == var28 && var30 == var28 && var31 == var28) {
										var10000 = MusicPatch.field3967[var7][var16];
										var10000[var22] |= 2340;
									}
								}

								var38 = 0;
								if (var37 != -1) {
									var38 = Rasterizer3D.Rasterizer3D_colorPalette[class32.method496(var37, 96)];
								}

								if (var27 == 0) {
									var5.addTile(var7, var16, var22, 0, 0, -1, var28, var29, var30, var31, class32.method496(var36, var32), class32.method496(var36, var33), class32.method496(var36, var34), class32.method496(var36, var35), 0, 0, 0, 0, var38, 0);
								} else {
									var39 = Frames.Tiles_shapes[var7][var16][var22] + 1;
									byte var58 = GrandExchangeEvents.field5045[var7][var16][var22];
									FloorOverlayDefinition var41 = ClientPreferences.method2731(var27 - 1);
									int var42 = var41.texture;
									int var43;
									int var44;
									int var45;
									int var46;
									if (var42 >= 0) {
										var44 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var42);
										var43 = -1;
									} else if (var41.primaryRgb == 16711935) {
										var43 = -2;
										var42 = -1;
										var44 = -2;
									} else {
										var43 = class101.method3231(var41.hue, var41.saturation, var41.lightness);
										var45 = var41.hue + Tiles.rndHue & 255;
										var46 = var41.lightness + Tiles.rndLightness;
										if (var46 < 0) {
											var46 = 0;
										} else if (var46 > 255) {
											var46 = 255;
										}

										var44 = class101.method3231(var45, var41.saturation, var46);
									}

									var45 = 0;
									if (var44 != -2) {
										var45 = Rasterizer3D.Rasterizer3D_colorPalette[ModeWhere.method8731(var44, 96)];
									}

									if (var41.secondaryRgb != -1) {
										var46 = var41.secondaryHue + Tiles.rndHue & 255;
										int var47 = var41.secondaryLightness + Tiles.rndLightness;
										if (var47 < 0) {
											var47 = 0;
										} else if (var47 > 255) {
											var47 = 255;
										}

										var44 = class101.method3231(var46, var41.secondarySaturation, var47);
										var45 = Rasterizer3D.Rasterizer3D_colorPalette[ModeWhere.method8731(var44, 96)];
									}

									var5.addTile(var7, var16, var22, var39, var58, var42, var28, var29, var30, var31, class32.method496(var36, var32), class32.method496(var36, var33), class32.method496(var36, var34), class32.method496(var36, var35), ModeWhere.method8731(var43, var32), ModeWhere.method8731(var43, var33), ModeWhere.method8731(var43, var34), ModeWhere.method8731(var43, var35), var38, var45);
								}
							}
						}
					}
				}
			}

			for (var16 = 1; var16 < var2 - 1; ++var16) {
				for (var17 = 1; var17 < var1 - 1; ++var17) {
					if ((var0.tileSettings[var7][var17][var16] & 8) != 0) {
						var22 = 0;
					} else if (var7 > 0 && (var0.tileSettings[1][var17][var16] & 2) != 0) {
						var22 = var7 - 1;
					} else {
						var22 = var7;
					}

					var5.setTileMinPlane(var7, var17, var16, var22);
				}
			}

			Tiles.Tiles_underlays[var7] = null;
			Tiles.Tiles_overlays[var7] = null;
			Frames.Tiles_shapes[var7] = null;
			GrandExchangeEvents.field5045[var7] = null;
			Tiles.Tiles_underlays2[var7] = null;
		}

		var5.method5189(-50, -10, -50);

		for (var7 = 0; var7 < var1; ++var7) {
			for (var8 = 0; var8 < var2; ++var8) {
				if ((var4[1][var7][var8] & 2) == 2) {
					var5.setLinkBelow(var7, var8);
				}
			}
		}

		if (var0.method2736()) {
			AsyncHttpResponse.method280(var0);
		}

	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIZI)V",
		garbageValue = "569734226"
	)
	@Export("addTileItemToGroundItems")
	static void addTileItemToGroundItems(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		SoundCache.method3216(class32.worldView, var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
	}

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "(IIII[Ljava/lang/Object;B)V",
		garbageValue = "7"
	)
	static void method8169(int var0, int var1, int var2, int var3, Object[] var4) {
		boolean var5 = false;
		Widget var6 = class35.widgetDefinition.getWidgetChild(var0, var1);
		if (var5 || var6 != null) {
			if (var5 || AbstractWorldMapIcon.method6904(MouseRecorder.getWidgetFlags(var6))) {
				PacketBufferNode var7 = HorizontalAlignment.getPacketBufferNode(ClientPacket.IF_RUNSCRIPT, Client.packetWriter.isaacCipher);
				var7.packetBuffer.writeShort(0);
				int var8 = var7.packetBuffer.offset;
				var7.packetBuffer.writeShortAddLE(var1);
				var7.packetBuffer.writeShort(var2);
				var7.packetBuffer.writeInt(var3);
				var7.packetBuffer.writeIntME(var0);
				Object[] var9 = var4;

				for (int var10 = 0; var10 < var9.length; ++var10) {
					Object var11 = var9[var10];
					if (var11 instanceof Integer) {
						var7.packetBuffer.method11623((Integer)var11);
					} else if (var11 instanceof String) {
						var7.packetBuffer.writeStringCp1252NullTerminated((String)var11);
					} else if (var11 instanceof DynamicArray) {
						DynamicArray var12 = (DynamicArray)var11;
						int var13 = var12.method10433();
						var7.packetBuffer.writeSmartByteShort(var13);
						int var15;
						if (var12.field5571 == class572.field5879) {
							int[] var16 = var12.method10430();

							for (var15 = 0; var15 < var13; ++var15) {
								var7.packetBuffer.method11623(var16[var15]);
							}
						} else {
							Object[] var14 = var12.method10428();

							for (var15 = 0; var15 < var13; ++var15) {
								var7.packetBuffer.writeStringCp1252NullTerminated((String)var14[var15]);
							}
						}
					} else if (var11 == null) {
						var7.packetBuffer.writeByte(0);
					}
				}

				var7.packetBuffer.writeLengthShort(var7.packetBuffer.offset - var8);
				Client.packetWriter.addNode(var7);
			}
		}
	}
}
