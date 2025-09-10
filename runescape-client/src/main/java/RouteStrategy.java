import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kc")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -906535551
	)
	@Export("approxDestinationX")
	public int approxDestinationX;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1024531605
	)
	@Export("approxDestinationY")
	public int approxDestinationY;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 876794791
	)
	@Export("approxDestinationSizeX")
	public int approxDestinationSizeX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1893902693
	)
	@Export("approxDestinationSizeY")
	public int approxDestinationSizeY;

	protected RouteStrategy() {
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIILkb;I)Z",
		garbageValue = "164670435"
	)
	@Export("hasArrived")
	protected abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIIB)J",
		garbageValue = "93"
	)
	static long method6239(int var0, int var1, int var2) {
		return (long)(var2 << 16 | var0 << 8 | var1);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ldr;B)V",
		garbageValue = "0"
	)
	static final void method6233(WorldView var0) {
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
			boolean var54 = true;
			boolean var55 = true;
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
					var24 = (var23 * -50 + var21 * -50 + var22 * -10) / var15 + 96;
					var25 = (var48[var17][var16 + 1] >> 3) + (var48[var17 - 1][var16] >> 2) + (var48[var17][var16 - 1] >> 2) + (var48[var17 + 1][var16] >> 3) + (var48[var17][var16] >> 1);
					class159.field1828[var17][var16] = var24 - var25;
				}
			}

			for (var16 = 0; var16 < var2; ++var16) {
				UserComparator7.Tiles_hue[var16] = 0;
				class256.Tiles_saturation[var16] = 0;
				Tiles.Tiles_lightness[var16] = 0;
				Tiles.Tiles_hueMultiplier[var16] = 0;
				Frames.field2814[var16] = 0;
			}

			for (var16 = -5; var16 < var1 + 5; ++var16) {
				int[] var10000;
				for (var17 = 0; var17 < var2; ++var17) {
					var49 = var16 + 5;
					int var10002;
					if (var49 >= 0 && var49 < var1) {
						var19 = (int)DelayFadeTask.method9649(15);
						var20 = Message.Tiles_underlays[var7][var49][var17] & var19;
						if (var20 > 0) {
							FloorUnderlayDefinition var50 = FloorUnderlayDefinition.FloorUnderlayDefinition_get(var20 - 1);
							var10000 = UserComparator7.Tiles_hue;
							var10000[var17] += var50.hue;
							var10000 = class256.Tiles_saturation;
							var10000[var17] += var50.saturation;
							var10000 = Tiles.Tiles_lightness;
							var10000[var17] += var50.lightness;
							var10000 = Tiles.Tiles_hueMultiplier;
							var10000[var17] += var50.hueMultiplier;
							var10002 = Frames.field2814[var17]++;
						}
					}

					var19 = var16 - 5;
					if (var19 >= 0 && var19 < var1) {
						var20 = (int)DelayFadeTask.method9649(15);
						var21 = Message.Tiles_underlays[var7][var19][var17] & var20;
						if (var21 > 0) {
							var23 = var21 - 1;
							FloorUnderlayDefinition var51 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var23);
							FloorUnderlayDefinition var53;
							if (var51 != null) {
								var53 = var51;
							} else {
								byte[] var52 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var23);
								var51 = new FloorUnderlayDefinition();
								if (var52 != null) {
									var51.decode(new Buffer(var52), var23);
								}

								var51.postDecode();
								FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var51, (long)var23);
								var53 = var51;
							}

							var10000 = UserComparator7.Tiles_hue;
							var10000[var17] -= var53.hue;
							var10000 = class256.Tiles_saturation;
							var10000[var17] -= var53.saturation;
							var10000 = Tiles.Tiles_lightness;
							var10000[var17] -= var53.lightness;
							var10000 = Tiles.Tiles_hueMultiplier;
							var10000[var17] -= var53.hueMultiplier;
							var10002 = Frames.field2814[var17]--;
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
							var17 += UserComparator7.Tiles_hue[var23];
							var49 += class256.Tiles_saturation[var23];
							var19 += Tiles.Tiles_lightness[var23];
							var20 += Tiles.Tiles_hueMultiplier[var23];
							var21 += Frames.field2814[var23];
						}

						var24 = var22 - 5;
						if (var24 >= 0 && var24 < var2) {
							var17 -= UserComparator7.Tiles_hue[var24];
							var49 -= class256.Tiles_saturation[var24];
							var19 -= Tiles.Tiles_lightness[var24];
							var20 -= Tiles.Tiles_hueMultiplier[var24];
							var21 -= Frames.field2814[var24];
						}

						if (var22 >= 1 && var22 < var2 - 1 && (!Client.isLowDetail || (var4[0][var16][var22] & 2) != 0 || (var4[var7][var16][var22] & 16) == 0)) {
							if (var7 < Tiles.Tiles_minPlane) {
								Tiles.Tiles_minPlane = var7;
							}

							var25 = (int)DelayFadeTask.method9649(15);
							int var26 = Message.Tiles_underlays[var7][var16][var22] & var25;
							int var27 = Tiles.Tiles_overlays[var7][var16][var22] & var25;
							if (var26 > 0 || var27 > 0) {
								int var28 = var3[var7][var16][var22];
								int var29 = var3[var7][var16 + 1][var22];
								int var30 = var3[var7][var16 + 1][var22 + 1];
								int var31 = var3[var7][var16][var22 + 1];
								int var32 = class159.field1828[var16][var22];
								int var33 = class159.field1828[var16 + 1][var22];
								int var34 = class159.field1828[var16 + 1][var22 + 1];
								int var35 = class159.field1828[var16][var22 + 1];
								int var36 = -1;
								int var37 = -1;
								int var38;
								int var39;
								if (var26 > 0) {
									var38 = var17 * 256 / var20;
									var39 = var49 / var21;
									int var40 = var19 / var21;
									var36 = ClientPacket.method7039(var38, var39, var40);
									var38 = var38 + Tiles.rndHue & 255;
									var40 += Tiles.rndLightness;
									if (var40 < 0) {
										var40 = 0;
									} else if (var40 > 255) {
										var40 = 255;
									}

									var37 = ClientPacket.method7039(var38, var39, var40);
								}

								if (var7 > 0) {
									boolean var56 = true;
									if (var26 == 0 && Tiles.Tiles_shapes[var7][var16][var22] != 0) {
										var56 = false;
									}

									if (var27 > 0 && !Client.method1287(var27 - 1).hideUnderlay) {
										var56 = false;
									}

									if (var56 && var28 == var29 && var28 == var30 && var31 == var28) {
										var10000 = PlayerType.field4837[var7][var16];
										var10000[var22] |= 2340;
									}
								}

								var38 = 0;
								if (var37 != -1) {
									var38 = Rasterizer3D.Rasterizer3D_colorPalette[ItemLayer.method4825(var37, 96)];
								}

								if (var27 == 0) {
									var5.addTile(var7, var16, var22, 0, 0, -1, var28, var29, var30, var31, ItemLayer.method4825(var36, var32), ItemLayer.method4825(var36, var33), ItemLayer.method4825(var36, var34), ItemLayer.method4825(var36, var35), 0, 0, 0, 0, var38, 0);
								} else {
									var39 = Tiles.Tiles_shapes[var7][var16][var22] + 1;
									byte var57 = Tiles.field848[var7][var16][var22];
									FloorOverlayDefinition var41 = Client.method1287(var27 - 1);
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
										var43 = ClientPacket.method7039(var41.hue, var41.saturation, var41.lightness);
										var45 = var41.hue + Tiles.rndHue & 255;
										var46 = var41.lightness + Tiles.rndLightness;
										if (var46 < 0) {
											var46 = 0;
										} else if (var46 > 255) {
											var46 = 255;
										}

										var44 = ClientPacket.method7039(var45, var41.saturation, var46);
									}

									var45 = 0;
									if (var44 != -2) {
										var45 = Rasterizer3D.Rasterizer3D_colorPalette[WorldMapEvent.method6970(var44, 96)];
									}

									if (var41.secondaryRgb != -1) {
										var46 = var41.secondaryHue + Tiles.rndHue & 255;
										int var47 = var41.secondaryLightness + Tiles.rndLightness;
										if (var47 < 0) {
											var47 = 0;
										} else if (var47 > 255) {
											var47 = 255;
										}

										var44 = ClientPacket.method7039(var46, var41.secondarySaturation, var47);
										var45 = Rasterizer3D.Rasterizer3D_colorPalette[WorldMapEvent.method6970(var44, 96)];
									}

									var5.addTile(var7, var16, var22, var39, var57, var42, var28, var29, var30, var31, ItemLayer.method4825(var36, var32), ItemLayer.method4825(var36, var33), ItemLayer.method4825(var36, var34), ItemLayer.method4825(var36, var35), WorldMapEvent.method6970(var43, var32), WorldMapEvent.method6970(var43, var33), WorldMapEvent.method6970(var43, var34), WorldMapEvent.method6970(var43, var35), var38, var45);
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

			Message.Tiles_underlays[var7] = null;
			Tiles.Tiles_overlays[var7] = null;
			Tiles.Tiles_shapes[var7] = null;
			Tiles.field848[var7] = null;
			Tiles.Tiles_underlays2[var7] = null;
		}

		var5.method5132(-50, -10, -50);

		for (var7 = 0; var7 < var1; ++var7) {
			for (var8 = 0; var8 < var2; ++var8) {
				if ((var4[1][var7][var8] & 2) == 2) {
					var5.setLinkBelow(var7, var8);
				}
			}
		}

		if (var0.method2691()) {
			ClientPacket.method7037(var0);
		}

	}

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1219347614"
	)
	public static final void method6236(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) {
			if (Client.rootWidgetWidths[var4] + Client.rootWidgetXs[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetHeights[var4] + Client.rootWidgetYs[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) {
				Client.validRootWidgets[var4] = true;
			}
		}

	}
}
