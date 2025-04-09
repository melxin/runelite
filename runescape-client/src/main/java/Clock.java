import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iw")
@Implements("Clock")
public abstract class Clock {
	@ObfuscatedName("fz")
	static boolean field2530;

	Clock() {
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1079999329"
	)
	@Export("mark")
	public abstract void mark();

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-587762544"
	)
	@Export("wait")
	public abstract int wait(int var1, int var2);

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lve;Lkz;I)Z",
		garbageValue = "-723311435"
	)
	public static boolean method4979(Buffer var0, WorldEntityCoord var1) {
		byte var2 = var0.readByte();
		if (var2 == 0) {
			return false;
		} else {
			int var4 = var2 >> 0 & 3;
			int var3;
			if (var4 == 3) {
				var3 = var0.readInt();
			} else if (var4 == 2) {
				var3 = var0.readShort();
			} else if (var4 == 1) {
				var3 = var0.readByte();
			} else {
				var3 = 0;
			}

			int var6 = var2 >> 2 & 3;
			int var5;
			if (var6 == 3) {
				var5 = var0.readInt();
			} else if (var6 == 2) {
				var5 = var0.readShort();
			} else if (var6 == 1) {
				var5 = var0.readByte();
			} else {
				var5 = 0;
			}

			int var8 = var2 >> 4 & 3;
			int var7;
			if (var8 == 3) {
				var7 = var0.readInt();
			} else if (var8 == 2) {
				var7 = var0.readShort();
			} else if (var8 == 1) {
				var7 = var0.readByte();
			} else {
				var7 = 0;
			}

			int var10 = var2 >> 6 & 3;
			int var9;
			if (var10 == 3) {
				var9 = var0.readInt();
			} else if (var10 == 2) {
				var9 = var0.readShort();
			} else if (var10 == 1) {
				var9 = var0.readByte();
			} else {
				var9 = 0;
			}

			var1.method5839(var3, var5, var7, var9);
			return true;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ldj;I)V",
		garbageValue = "1885334386"
	)
	static final void method4982(WorldView var0) {
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
			byte[][] var48 = DevicePcmPlayerProvider.Tiles_underlays2[var7];
			boolean var52 = true;
			boolean var53 = true;
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
					var20 = (int)Math.sqrt((double)(var19 * var19 + var49 * var49 + 65536));
					var21 = (var49 << 8) / var20;
					var22 = 65536 / var20;
					var23 = (var19 << 8) / var20;
					var24 = (var23 * -50 + var21 * -50 + var22 * -10) / var15 + 96;
					var25 = (var48[var17][var16 + 1] >> 3) + (var48[var17 - 1][var16] >> 2) + (var48[var17][var16 - 1] >> 2) + (var48[var17 + 1][var16] >> 3) + (var48[var17][var16] >> 1);
					class543.field5472[var17][var16] = var24 - var25;
				}
			}

			for (var16 = 0; var16 < var2; ++var16) {
				HttpJsonRequestBody.Tiles_hue[var16] = 0;
				class235.Tiles_saturation[var16] = 0;
				ScriptEvent.Tiles_lightness[var16] = 0;
				class28.Tiles_hueMultiplier[var16] = 0;
				class272.field3094[var16] = 0;
			}

			for (var16 = -5; var16 < var1 + 5; ++var16) {
				int[] var10000;
				for (var17 = 0; var17 < var2; ++var17) {
					var49 = var16 + 5;
					int var10002;
					if (var49 >= 0 && var49 < var1) {
						var19 = (int)class251.method5233(15);
						var20 = DirectByteArrayCopier.Tiles_underlays[var7][var49][var17] & var19;
						if (var20 > 0) {
							FloorUnderlayDefinition var50 = PlayerType.method7587(var20 - 1);
							var10000 = HttpJsonRequestBody.Tiles_hue;
							var10000[var17] += var50.hue;
							var10000 = class235.Tiles_saturation;
							var10000[var17] += var50.saturation;
							var10000 = ScriptEvent.Tiles_lightness;
							var10000[var17] += var50.lightness;
							var10000 = class28.Tiles_hueMultiplier;
							var10000[var17] += var50.hueMultiplier;
							var10002 = class272.field3094[var17]++;
						}
					}

					var19 = var16 - 5;
					if (var19 >= 0 && var19 < var1) {
						var20 = (int)class251.method5233(15);
						var21 = DirectByteArrayCopier.Tiles_underlays[var7][var19][var17] & var20;
						if (var21 > 0) {
							FloorUnderlayDefinition var51 = PlayerType.method7587(var21 - 1);
							var10000 = HttpJsonRequestBody.Tiles_hue;
							var10000[var17] -= var51.hue;
							var10000 = class235.Tiles_saturation;
							var10000[var17] -= var51.saturation;
							var10000 = ScriptEvent.Tiles_lightness;
							var10000[var17] -= var51.lightness;
							var10000 = class28.Tiles_hueMultiplier;
							var10000[var17] -= var51.hueMultiplier;
							var10002 = class272.field3094[var17]--;
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
							var17 += HttpJsonRequestBody.Tiles_hue[var23];
							var49 += class235.Tiles_saturation[var23];
							var19 += ScriptEvent.Tiles_lightness[var23];
							var20 += class28.Tiles_hueMultiplier[var23];
							var21 += class272.field3094[var23];
						}

						var24 = var22 - 5;
						if (var24 >= 0 && var24 < var2) {
							var17 -= HttpJsonRequestBody.Tiles_hue[var24];
							var49 -= class235.Tiles_saturation[var24];
							var19 -= ScriptEvent.Tiles_lightness[var24];
							var20 -= class28.Tiles_hueMultiplier[var24];
							var21 -= class272.field3094[var24];
						}

						if (var22 >= 1 && var22 < var2 - 1 && (!Client.isLowDetail || (var4[0][var16][var22] & 2) != 0 || (var4[var7][var16][var22] & 16) == 0)) {
							if (var7 < Tiles.Tiles_minPlane) {
								Tiles.Tiles_minPlane = var7;
							}

							var25 = (int)class251.method5233(15);
							int var26 = DirectByteArrayCopier.Tiles_underlays[var7][var16][var22] & var25;
							int var27 = WorldEntityCoord.Tiles_overlays[var7][var16][var22] & var25;
							if (var26 > 0 || var27 > 0) {
								int var28 = var3[var7][var16][var22];
								int var29 = var3[var7][var16 + 1][var22];
								int var30 = var3[var7][var16 + 1][var22 + 1];
								int var31 = var3[var7][var16][var22 + 1];
								int var32 = class543.field5472[var16][var22];
								int var33 = class543.field5472[var16 + 1][var22];
								int var34 = class543.field5472[var16 + 1][var22 + 1];
								int var35 = class543.field5472[var16][var22 + 1];
								int var36 = -1;
								int var37 = -1;
								int var38;
								int var39;
								if (var26 > 0) {
									var38 = var17 * 256 / var20;
									var39 = var49 / var21;
									int var40 = var19 / var21;
									var36 = class105.method2954(var38, var39, var40);
									var38 = var38 + Tiles.rndHue & 255;
									var40 += Tiles.rndLightness;
									if (var40 < 0) {
										var40 = 0;
									} else if (var40 > 255) {
										var40 = 255;
									}

									var37 = class105.method2954(var38, var39, var40);
								}

								if (var7 > 0) {
									boolean var54 = true;
									if (var26 == 0 && class195.Tiles_shapes[var7][var16][var22] != 0) {
										var54 = false;
									}

									if (var27 > 0 && !UserComparator4.method3198(var27 - 1).hideUnderlay) {
										var54 = false;
									}

									if (var54 && var28 == var29 && var28 == var30 && var31 == var28) {
										var10000 = Varps.field3836[var7][var16];
										var10000[var22] |= 2340;
									}
								}

								var38 = 0;
								if (var37 != -1) {
									var38 = Rasterizer3D.Rasterizer3D_colorPalette[class130.method3257(var37, 96)];
								}

								if (var27 == 0) {
									var5.addTile(var7, var16, var22, 0, 0, -1, var28, var29, var30, var31, class130.method3257(var36, var32), class130.method3257(var36, var33), class130.method3257(var36, var34), class130.method3257(var36, var35), 0, 0, 0, 0, var38, 0);
								} else {
									var39 = class195.Tiles_shapes[var7][var16][var22] + 1;
									byte var55 = class302.field3316[var7][var16][var22];
									FloorOverlayDefinition var41 = UserComparator4.method3198(var27 - 1);
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
										var43 = class105.method2954(var41.hue, var41.saturation, var41.lightness);
										var45 = var41.hue + Tiles.rndHue & 255;
										var46 = var41.lightness + Tiles.rndLightness;
										if (var46 < 0) {
											var46 = 0;
										} else if (var46 > 255) {
											var46 = 255;
										}

										var44 = class105.method2954(var45, var41.saturation, var46);
									}

									var45 = 0;
									if (var44 != -2) {
										var45 = Rasterizer3D.Rasterizer3D_colorPalette[HttpMethod.method71(var44, 96)];
									}

									if (var41.secondaryRgb != -1) {
										var46 = var41.secondaryHue + Tiles.rndHue & 255;
										int var47 = var41.secondaryLightness + Tiles.rndLightness;
										if (var47 < 0) {
											var47 = 0;
										} else if (var47 > 255) {
											var47 = 255;
										}

										var44 = class105.method2954(var46, var41.secondarySaturation, var47);
										var45 = Rasterizer3D.Rasterizer3D_colorPalette[HttpMethod.method71(var44, 96)];
									}

									var5.addTile(var7, var16, var22, var39, var55, var42, var28, var29, var30, var31, class130.method3257(var36, var32), class130.method3257(var36, var33), class130.method3257(var36, var34), class130.method3257(var36, var35), HttpMethod.method71(var43, var32), HttpMethod.method71(var43, var33), HttpMethod.method71(var43, var34), HttpMethod.method71(var43, var35), var38, var45);
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

			DirectByteArrayCopier.Tiles_underlays[var7] = null;
			WorldEntityCoord.Tiles_overlays[var7] = null;
			class195.Tiles_shapes[var7] = null;
			class302.field3316[var7] = null;
			DevicePcmPlayerProvider.Tiles_underlays2[var7] = null;
		}

		var5.method4083(-50, -10, -50);

		for (var7 = 0; var7 < var1; ++var7) {
			for (var8 = 0; var8 < var2; ++var8) {
				if ((var4[1][var7][var8] & 2) == 2) {
					var5.setLinkBelow(var7, var8);
				}
			}
		}

		if (var0.method2871()) {
			HttpResponse.method306(var0);
		}

	}
}
