import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pj")
@Implements("GrandExchangeEvent")
public class GrandExchangeEvent {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 38001761
	)
	@Export("world")
	public final int world;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		longValue = 5386861718554422505L
	)
	@Export("age")
	public final long age;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	@Export("grandExchangeOffer")
	public final GrandExchangeOffer grandExchangeOffer;
	@ObfuscatedName("ao")
	@Export("offerName")
	String offerName;
	@ObfuscatedName("ad")
	@Export("previousOfferName")
	String previousOfferName;

	@ObfuscatedSignature(
		descriptor = "(Lvy;BI)V"
	)
	GrandExchangeEvent(Buffer var1, byte var2, int var3) {
		this.offerName = var1.readStringCp1252NullTerminated();
		this.previousOfferName = var1.readStringCp1252NullTerminated();
		this.world = var1.readUnsignedShort();
		this.age = var1.readLong();
		int var4 = var1.readInt();
		int var5 = var1.readInt();
		this.grandExchangeOffer = new GrandExchangeOffer();
		this.grandExchangeOffer.method7918(2);
		this.grandExchangeOffer.method7919(var2);
		this.grandExchangeOffer.unitPrice = var4;
		this.grandExchangeOffer.totalQuantity = var5;
		this.grandExchangeOffer.currentQuantity = 0;
		this.grandExchangeOffer.currentPrice = 0;
		this.grandExchangeOffer.id = var3;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1560869395"
	)
	@Export("getOfferName")
	public String getOfferName() {
		return this.offerName;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1718272041"
	)
	@Export("getPreviousOfferName")
	public String getPreviousOfferName() {
		return this.previousOfferName;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ldz;I)V",
		garbageValue = "1354859132"
	)
	static final void method7903(WorldView var0) {
		int var1 = var0.sizeX;
		int var2 = var0.sizeY;
		int[][][] var3 = var0.tileHeights;
		byte[][][] var4 = var0.tileSettings;
		Scene var5 = var0.scene;
		CollisionMap[] var6 = var0.collisionMaps;

		int var7;
		int var8;
		int var9;
		int var10;
		for (var7 = 0; var7 < 4; ++var7) {
			for (var8 = 0; var8 < var1; ++var8) {
				for (var9 = 0; var9 < var2; ++var9) {
					if ((var0.tileSettings[var7][var8][var9] & 1) == 1) {
						var10 = var7;
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

		int var14;
		int var15;
		int var16;
		int[] var10000;
		int var17;
		int var18;
		int var19;
		int var20;
		int var21;
		int var22;
		int var23;
		for (var7 = 0; var7 < 4; ++var7) {
			byte[][] var52 = Tiles.Tiles_underlays2[var7];
			boolean var64 = true;
			boolean var65 = true;
			boolean var11 = true;
			boolean var12 = true;
			boolean var13 = true;
			var14 = (int)Math.sqrt(5100.0D);
			var15 = var14 * 768 >> 8;

			int var24;
			for (var16 = 1; var16 < var2 - 1; ++var16) {
				for (var17 = 1; var17 < var1 - 1; ++var17) {
					var18 = var3[var7][var17 + 1][var16] - var3[var7][var17 - 1][var16];
					var19 = var3[var7][var17][var16 + 1] - var3[var7][var17][var16 - 1];
					var20 = (int)Math.sqrt((double)(var18 * var18 + var19 * var19 + 65536));
					var21 = (var18 << 8) / var20;
					var22 = 65536 / var20;
					var23 = (var19 << 8) / var20;
					var24 = (var21 * -50 + var23 * -50 + var22 * -10) / var15 + 96;
					int var63 = (var52[var17][var16 + 1] >> 3) + (var52[var17 - 1][var16] >> 2) + (var52[var17][var16 - 1] >> 2) + (var52[var17 + 1][var16] >> 3) + (var52[var17][var16] >> 1);
					WorldMapID.field3244[var17][var16] = var24 - var63;
				}
			}

			for (var16 = 0; var16 < var2; ++var16) {
				InvDefinition.Tiles_hue[var16] = 0;
				Tiles.Tiles_saturation[var16] = 0;
				Tiles.Tiles_lightness[var16] = 0;
				class4.Tiles_hueMultiplier[var16] = 0;
				class557.field5476[var16] = 0;
			}

			for (var16 = -5; var16 < var1 + 5; ++var16) {
				for (var17 = 0; var17 < var2; ++var17) {
					var18 = var16 + 5;
					int var10002;
					if (var18 >= 0 && var18 < var1) {
						long var57 = (long)Math.pow(2.0D, 15.0D) - 1L;
						var21 = (int)var57;
						var22 = SecureRandomCallable.Tiles_underlays[var7][var18][var17] & var21;
						if (var22 > 0) {
							FloorUnderlayDefinition var59 = MenuAction.method2365(var22 - 1);
							var10000 = InvDefinition.Tiles_hue;
							var10000[var17] += var59.hue;
							var10000 = Tiles.Tiles_saturation;
							var10000[var17] += var59.saturation;
							var10000 = Tiles.Tiles_lightness;
							var10000[var17] += var59.lightness;
							var10000 = class4.Tiles_hueMultiplier;
							var10000[var17] += var59.hueMultiplier;
							var10002 = class557.field5476[var17]++;
						}
					}

					var19 = var16 - 5;
					if (var19 >= 0 && var19 < var1) {
						long var60 = (long)Math.pow(2.0D, 15.0D) - 1L;
						var22 = (int)var60;
						var23 = SecureRandomCallable.Tiles_underlays[var7][var19][var17] & var22;
						if (var23 > 0) {
							FloorUnderlayDefinition var62 = MenuAction.method2365(var23 - 1);
							var10000 = InvDefinition.Tiles_hue;
							var10000[var17] -= var62.hue;
							var10000 = Tiles.Tiles_saturation;
							var10000[var17] -= var62.saturation;
							var10000 = Tiles.Tiles_lightness;
							var10000[var17] -= var62.lightness;
							var10000 = class4.Tiles_hueMultiplier;
							var10000[var17] -= var62.hueMultiplier;
							var10002 = class557.field5476[var17]--;
						}
					}
				}

				if (var16 >= 1 && var16 < var1 - 1) {
					var17 = 0;
					var18 = 0;
					var19 = 0;
					var20 = 0;
					var21 = 0;

					for (var22 = -5; var22 < var2 + 5; ++var22) {
						var23 = var22 + 5;
						if (var23 >= 0 && var23 < var2) {
							var17 += InvDefinition.Tiles_hue[var23];
							var18 += Tiles.Tiles_saturation[var23];
							var19 += Tiles.Tiles_lightness[var23];
							var20 += class4.Tiles_hueMultiplier[var23];
							var21 += class557.field5476[var23];
						}

						var24 = var22 - 5;
						if (var24 >= 0 && var24 < var2) {
							var17 -= InvDefinition.Tiles_hue[var24];
							var18 -= Tiles.Tiles_saturation[var24];
							var19 -= Tiles.Tiles_lightness[var24];
							var20 -= class4.Tiles_hueMultiplier[var24];
							var21 -= class557.field5476[var24];
						}

						if (var22 >= 1 && var22 < var2 - 1 && (!Client.isLowDetail || (var4[0][var16][var22] & 2) != 0 || (var4[var7][var16][var22] & 16) == 0)) {
							if (var7 < Tiles.Tiles_minPlane) {
								Tiles.Tiles_minPlane = var7;
							}

							long var25 = (long)Math.pow(2.0D, 15.0D) - 1L;
							int var27 = (int)var25;
							int var28 = SecureRandomCallable.Tiles_underlays[var7][var16][var22] & var27;
							int var29 = SecureRandomFuture.Tiles_overlays[var7][var16][var22] & var27;
							if (var28 > 0 || var29 > 0) {
								int var30 = var3[var7][var16][var22];
								int var31 = var3[var7][var16 + 1][var22];
								int var32 = var3[var7][var16 + 1][var22 + 1];
								int var33 = var3[var7][var16][var22 + 1];
								int var34 = WorldMapID.field3244[var16][var22];
								int var35 = WorldMapID.field3244[var16 + 1][var22];
								int var36 = WorldMapID.field3244[var16 + 1][var22 + 1];
								int var37 = WorldMapID.field3244[var16][var22 + 1];
								int var38 = -1;
								int var39 = -1;
								int var40;
								int var41;
								int var42;
								if (var28 > 0) {
									var40 = var17 * 256 / var20;
									var41 = var18 / var21;
									var42 = var19 / var21;
									var38 = class28.method462(var40, var41, var42);
									var40 = var40 + Tiles.rndHue & 255;
									var42 += Tiles.rndLightness;
									if (var42 < 0) {
										var42 = 0;
									} else if (var42 > 255) {
										var42 = 255;
									}

									var39 = class28.method462(var40, var41, var42);
								}

								FloorOverlayDefinition var43;
								if (var7 > 0) {
									boolean var70 = true;
									if (var28 == 0 && Tiles.Tiles_shapes[var7][var16][var22] != 0) {
										var70 = false;
									}

									if (var29 > 0) {
										var42 = var29 - 1;
										var43 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var42);
										FloorOverlayDefinition var54;
										if (var43 != null) {
											var54 = var43;
										} else {
											byte[] var44 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var42);
											var43 = new FloorOverlayDefinition();
											if (var44 != null) {
												var43.decode(new Buffer(var44), var42);
											}

											var43.postDecode();
											FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var43, (long)var42);
											var54 = var43;
										}

										if (!var54.hideUnderlay) {
											var70 = false;
										}
									}

									if (var70 && var31 == var30 && var30 == var32 && var30 == var33) {
										var10000 = class538.field5380[var7][var16];
										var10000[var22] |= 2340;
									}
								}

								var40 = 0;
								if (var39 != -1) {
									var40 = Rasterizer3D.Rasterizer3D_colorPalette[class140.method3505(var39, 96)];
								}

								if (var29 == 0) {
									var5.addTile(var7, var16, var22, 0, 0, -1, var30, var31, var32, var33, class140.method3505(var38, var34), class140.method3505(var38, var35), class140.method3505(var38, var36), class140.method3505(var38, var37), 0, 0, 0, 0, var40, 0);
								} else {
									var41 = Tiles.Tiles_shapes[var7][var16][var22] + 1;
									byte var71 = Tiles.field1026[var7][var16][var22];
									int var55 = var29 - 1;
									FloorOverlayDefinition var45 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var55);
									if (var45 != null) {
										var43 = var45;
									} else {
										byte[] var46 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var55);
										var45 = new FloorOverlayDefinition();
										if (var46 != null) {
											var45.decode(new Buffer(var46), var55);
										}

										var45.postDecode();
										FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var45, (long)var55);
										var43 = var45;
									}

									int var56 = var43.texture;
									int var47;
									int var48;
									int var49;
									int var50;
									if (var56 >= 0) {
										var48 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var56);
										var47 = -1;
									} else if (var43.primaryRgb == 16711935) {
										var47 = -2;
										var56 = -1;
										var48 = -2;
									} else {
										var47 = class28.method462(var43.hue, var43.saturation, var43.lightness);
										var49 = var43.hue + Tiles.rndHue & 255;
										var50 = var43.lightness + Tiles.rndLightness;
										if (var50 < 0) {
											var50 = 0;
										} else if (var50 > 255) {
											var50 = 255;
										}

										var48 = class28.method462(var49, var43.saturation, var50);
									}

									var49 = 0;
									if (var48 != -2) {
										var49 = Rasterizer3D.Rasterizer3D_colorPalette[MenuAction.method2362(var48, 96)];
									}

									if (var43.secondaryRgb != -1) {
										var50 = var43.secondaryHue + Tiles.rndHue & 255;
										int var51 = var43.secondaryLightness + Tiles.rndLightness;
										if (var51 < 0) {
											var51 = 0;
										} else if (var51 > 255) {
											var51 = 255;
										}

										var48 = class28.method462(var50, var43.secondarySaturation, var51);
										var49 = Rasterizer3D.Rasterizer3D_colorPalette[MenuAction.method2362(var48, 96)];
									}

									var5.addTile(var7, var16, var22, var41, var71, var56, var30, var31, var32, var33, class140.method3505(var38, var34), class140.method3505(var38, var35), class140.method3505(var38, var36), class140.method3505(var38, var37), MenuAction.method2362(var47, var34), MenuAction.method2362(var47, var35), MenuAction.method2362(var47, var36), MenuAction.method2362(var47, var37), var40, var49);
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

			SecureRandomCallable.Tiles_underlays[var7] = null;
			SecureRandomFuture.Tiles_overlays[var7] = null;
			Tiles.Tiles_shapes[var7] = null;
			Tiles.field1026[var7] = null;
			Tiles.Tiles_underlays2[var7] = null;
		}

		var5.method4205(-50, -10, -50);

		for (var7 = 0; var7 < var1; ++var7) {
			for (var8 = 0; var8 < var2; ++var8) {
				if ((var4[1][var7][var8] & 2) == 2) {
					var5.setLinkBelow(var7, var8);
				}
			}
		}

		var7 = 1;
		var8 = 2;
		var9 = 4;

		for (var10 = 0; var10 < 4; ++var10) {
			if (var10 > 0) {
				var7 <<= 3;
				var8 <<= 3;
				var9 <<= 3;
			}

			for (int var66 = 0; var66 <= var10; ++var66) {
				for (int var67 = 0; var67 <= var2; ++var67) {
					for (int var68 = 0; var68 <= var1; ++var68) {
						short var69;
						if ((class538.field5380[var66][var68][var67] & var7) != 0) {
							var14 = var67;
							var15 = var67;
							var16 = var66;

							for (var17 = var66; var14 > 0 && (class538.field5380[var66][var68][var14 - 1] & var7) != 0; --var14) {
							}

							while (var15 < var2 && (class538.field5380[var66][var68][var15 + 1] & var7) != 0) {
								++var15;
							}

							label454:
							while (var16 > 0) {
								for (var18 = var14; var18 <= var15; ++var18) {
									if ((class538.field5380[var16 - 1][var68][var18] & var7) == 0) {
										break label454;
									}
								}

								--var16;
							}

							label443:
							while (var17 < var10) {
								for (var18 = var14; var18 <= var15; ++var18) {
									if ((class538.field5380[var17 + 1][var68][var18] & var7) == 0) {
										break label443;
									}
								}

								++var17;
							}

							var18 = (var15 - var14 + 1) * (var17 + 1 - var16);
							if (var18 >= 8) {
								var69 = 240;
								var20 = var3[var17][var68][var14] - var69;
								var21 = var3[var16][var68][var14];
								var5.Scene_addOccluder(var10, 1, var68 * 128, var68 * 128, var14 * 128, var15 * 128 + 128, var20, var21);

								for (var22 = var16; var22 <= var17; ++var22) {
									for (var23 = var14; var23 <= var15; ++var23) {
										var10000 = class538.field5380[var22][var68];
										var10000[var23] &= ~var7;
									}
								}
							}
						}

						if ((class538.field5380[var66][var68][var67] & var8) != 0) {
							var14 = var68;
							var15 = var68;
							var16 = var66;

							for (var17 = var66; var14 > 0 && (class538.field5380[var66][var14 - 1][var67] & var8) != 0; --var14) {
							}

							while (var15 < var1 && (class538.field5380[var66][var15 + 1][var67] & var8) != 0) {
								++var15;
							}

							label507:
							while (var16 > 0) {
								for (var18 = var14; var18 <= var15; ++var18) {
									if ((class538.field5380[var16 - 1][var18][var67] & var8) == 0) {
										break label507;
									}
								}

								--var16;
							}

							label496:
							while (var17 < var10) {
								for (var18 = var14; var18 <= var15; ++var18) {
									if ((class538.field5380[var17 + 1][var18][var67] & var8) == 0) {
										break label496;
									}
								}

								++var17;
							}

							var18 = (var17 + 1 - var16) * (var15 - var14 + 1);
							if (var18 >= 8) {
								var69 = 240;
								var20 = var3[var17][var14][var67] - var69;
								var21 = var3[var16][var14][var67];
								var5.Scene_addOccluder(var10, 2, var14 * 128, var15 * 128 + 128, var67 * 128, var67 * 128, var20, var21);

								for (var22 = var16; var22 <= var17; ++var22) {
									for (var23 = var14; var23 <= var15; ++var23) {
										var10000 = class538.field5380[var22][var23];
										var10000[var67] &= ~var8;
									}
								}
							}
						}

						if ((class538.field5380[var66][var68][var67] & var9) != 0) {
							var14 = var68;
							var15 = var68;
							var16 = var67;

							for (var17 = var67; var16 > 0 && (class538.field5380[var66][var68][var16 - 1] & var9) != 0; --var16) {
							}

							while (var17 < var2 && (class538.field5380[var66][var68][var17 + 1] & var9) != 0) {
								++var17;
							}

							label560:
							while (var14 > 0) {
								for (var18 = var16; var18 <= var17; ++var18) {
									if ((class538.field5380[var66][var14 - 1][var18] & var9) == 0) {
										break label560;
									}
								}

								--var14;
							}

							label549:
							while (var15 < var1) {
								for (var18 = var16; var18 <= var17; ++var18) {
									if ((class538.field5380[var66][var15 + 1][var18] & var9) == 0) {
										break label549;
									}
								}

								++var15;
							}

							if ((var17 - var16 + 1) * (var15 - var14 + 1) >= 4) {
								var18 = var3[var66][var14][var16];
								var5.Scene_addOccluder(var10, 4, var14 * 128, var15 * 128 + 128, var16 * 128, var17 * 128 + 128, var18, var18);

								for (var19 = var14; var19 <= var15; ++var19) {
									for (var20 = var16; var20 <= var17; ++var20) {
										var10000 = class538.field5380[var66][var19];
										var10000[var20] &= ~var9;
									}
								}
							}
						}
					}
				}
			}
		}

	}
}
