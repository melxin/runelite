import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("if")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("FloorOverlayDefinition_archive")
	static AbstractArchive FloorOverlayDefinition_archive;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("FloorOverlayDefinition_cached")
	static EvictingDualNodeHashTable FloorOverlayDefinition_cached;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1763761349
	)
	@Export("primaryRgb")
	public int primaryRgb;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1800770457
	)
	@Export("texture")
	public int texture;
	@ObfuscatedName("al")
	@Export("hideUnderlay")
	public boolean hideUnderlay;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 621989845
	)
	@Export("secondaryRgb")
	public int secondaryRgb;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -594391471
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 823946833
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1375076023
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1169962293
	)
	@Export("secondaryHue")
	public int secondaryHue;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -289321653
	)
	@Export("secondarySaturation")
	public int secondarySaturation;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -800333745
	)
	@Export("secondaryLightness")
	public int secondaryLightness;

	static {
		FloorOverlayDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	FloorOverlayDefinition() {
		this.primaryRgb = 0;
		this.texture = -1;
		this.hideUnderlay = true;
		this.secondaryRgb = -1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2121417974"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.secondaryRgb != -1) {
			this.setHsl(this.secondaryRgb);
			this.secondaryHue = this.hue;
			this.secondarySaturation = this.saturation;
			this.secondaryLightness = this.lightness;
		}

		this.setHsl(this.primaryRgb);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lwt;II)V",
		garbageValue = "-2131371087"
	)
	@Export("decode")
	void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 0) {
				return;
			}

			this.decodeNext(var1, var3, var2);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lwt;III)V",
		garbageValue = "891623949"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) {
			this.primaryRgb = var1.readMedium();
		} else if (var2 == 2) {
			this.texture = var1.readUnsignedByte();
		} else if (var2 == 5) {
			this.hideUnderlay = false;
		} else if (var2 == 7) {
			this.secondaryRgb = var1.readMedium();
		} else if (var2 != 8 && var2 == 9) {
			var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-3"
	)
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D;
		double var4 = (double)(var1 >> 8 & 255) / 256.0D;
		double var6 = (double)(var1 & 255) / 256.0D;
		double var8 = var2;
		if (var4 < var2) {
			var8 = var4;
		}

		if (var6 < var8) {
			var8 = var6;
		}

		double var10 = var2;
		if (var4 > var2) {
			var10 = var4;
		}

		if (var6 > var10) {
			var10 = var6;
		}

		double var12 = 0.0D;
		double var14 = 0.0D;
		double var16 = (var10 + var8) / 2.0D;
		if (var10 != var8) {
			if (var16 < 0.5D) {
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5D) {
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var2 == var10) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) {
				var12 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var6 == var10) {
				var12 = (var2 - var4) / (var10 - var8) + 4.0D;
			}
		}

		var12 /= 6.0D;
		this.hue = (int)(var12 * 256.0D);
		this.saturation = (int)(256.0D * var14);
		this.lightness = (int)(var16 * 256.0D);
		if (this.saturation < 0) {
			this.saturation = 0;
		} else if (this.saturation > 255) {
			this.saturation = 255;
		}

		if (this.lightness < 0) {
			this.lightness = 0;
		} else if (this.lightness > 255) {
			this.lightness = 255;
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ldl;B)V",
		garbageValue = "48"
	)
	static final void method4536(WorldView var0) {
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
				for (int var49 = 0; var49 < var2; ++var49) {
					if ((var0.tileSettings[var7][var8][var49] & 1) == 1) {
						int var50 = var7;
						if ((var0.tileSettings[1][var8][var49] & 2) == 2) {
							var50 = var7 - 1;
						}

						if (var50 >= 0 && var6 != null) {
							var6[var50].setBlockedByFloor(var8, var49);
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
		int var24;
		int var25;
		int var26;
		int var27;
		for (var7 = 0; var7 < 4; ++var7) {
			byte[][] var48 = class462.Tiles_underlays2[var7];
			boolean var62 = true;
			boolean var63 = true;
			boolean var11 = true;
			boolean var12 = true;
			boolean var13 = true;
			var14 = (int)Math.sqrt(5100.0D);
			var15 = var14 * 768 >> 8;

			for (var16 = 1; var16 < var2 - 1; ++var16) {
				for (var17 = 1; var17 < var1 - 1; ++var17) {
					var18 = var3[var7][var17 + 1][var16] - var3[var7][var17 - 1][var16];
					var19 = var3[var7][var17][var16 + 1] - var3[var7][var17][var16 - 1];
					var20 = (int)Math.sqrt((double)(var19 * var19 + var18 * var18 + 65536));
					var21 = (var18 << 8) / var20;
					var22 = 65536 / var20;
					var23 = (var19 << 8) / var20;
					var24 = (var23 * -50 + var21 * -50 + var22 * -10) / var15 + 96;
					var25 = (var48[var17 - 1][var16] >> 2) + (var48[var17][var16 - 1] >> 2) + (var48[var17 + 1][var16] >> 3) + (var48[var17][var16 + 1] >> 3) + (var48[var17][var16] >> 1);
					Tiles.field846[var17][var16] = var24 - var25;
				}
			}

			for (var16 = 0; var16 < var2; ++var16) {
				class451.Tiles_hue[var16] = 0;
				WorldMapDecoration.Tiles_saturation[var16] = 0;
				GrandExchangeOfferNameComparator.Tiles_lightness[var16] = 0;
				GameEngine.Tiles_hueMultiplier[var16] = 0;
				World.field617[var16] = 0;
			}

			for (var16 = -5; var16 < var1 + 5; ++var16) {
				for (var17 = 0; var17 < var2; ++var17) {
					var18 = var16 + 5;
					int var10002;
					if (var18 >= 0 && var18 < var1) {
						var19 = (int)Message.method740(15);
						var20 = AuthenticationScheme.Tiles_underlays[var7][var18][var17] & var19;
						if (var20 > 0) {
							var22 = var20 - 1;
							FloorUnderlayDefinition var51 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var22);
							FloorUnderlayDefinition var53;
							if (var51 != null) {
								var53 = var51;
							} else {
								byte[] var52 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var22);
								var51 = new FloorUnderlayDefinition();
								if (var52 != null) {
									var51.decode(new Buffer(var52), var22);
								}

								var51.postDecode();
								FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var51, (long)var22);
								var53 = var51;
							}

							var10000 = class451.Tiles_hue;
							var10000[var17] += var53.hue;
							var10000 = WorldMapDecoration.Tiles_saturation;
							var10000[var17] += var53.saturation;
							var10000 = GrandExchangeOfferNameComparator.Tiles_lightness;
							var10000[var17] += var53.lightness;
							var10000 = GameEngine.Tiles_hueMultiplier;
							var10000[var17] += var53.hueMultiplier;
							var10002 = World.field617[var17]++;
						}
					}

					var19 = var16 - 5;
					if (var19 >= 0 && var19 < var1) {
						var20 = (int)Message.method740(15);
						var21 = AuthenticationScheme.Tiles_underlays[var7][var19][var17] & var20;
						if (var21 > 0) {
							var23 = var21 - 1;
							FloorUnderlayDefinition var64 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var23);
							FloorUnderlayDefinition var55;
							if (var64 != null) {
								var55 = var64;
							} else {
								byte[] var54 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var23);
								var64 = new FloorUnderlayDefinition();
								if (var54 != null) {
									var64.decode(new Buffer(var54), var23);
								}

								var64.postDecode();
								FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var64, (long)var23);
								var55 = var64;
							}

							var10000 = class451.Tiles_hue;
							var10000[var17] -= var55.hue;
							var10000 = WorldMapDecoration.Tiles_saturation;
							var10000[var17] -= var55.saturation;
							var10000 = GrandExchangeOfferNameComparator.Tiles_lightness;
							var10000[var17] -= var55.lightness;
							var10000 = GameEngine.Tiles_hueMultiplier;
							var10000[var17] -= var55.hueMultiplier;
							var10002 = World.field617[var17]--;
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
							var17 += class451.Tiles_hue[var23];
							var18 += WorldMapDecoration.Tiles_saturation[var23];
							var19 += GrandExchangeOfferNameComparator.Tiles_lightness[var23];
							var20 += GameEngine.Tiles_hueMultiplier[var23];
							var21 += World.field617[var23];
						}

						var24 = var22 - 5;
						if (var24 >= 0 && var24 < var2) {
							var17 -= class451.Tiles_hue[var24];
							var18 -= WorldMapDecoration.Tiles_saturation[var24];
							var19 -= GrandExchangeOfferNameComparator.Tiles_lightness[var24];
							var20 -= GameEngine.Tiles_hueMultiplier[var24];
							var21 -= World.field617[var24];
						}

						if (var22 >= 1 && var22 < var2 - 1 && (!Client.isLowDetail || (var4[0][var16][var22] & 2) != 0 || (var4[var7][var16][var22] & 16) == 0)) {
							if (var7 < Tiles.Tiles_minPlane) {
								Tiles.Tiles_minPlane = var7;
							}

							var25 = (int)Message.method740(15);
							var26 = AuthenticationScheme.Tiles_underlays[var7][var16][var22] & var25;
							var27 = class31.Tiles_overlays[var7][var16][var22] & var25;
							if (var26 > 0 || var27 > 0) {
								int var28 = var3[var7][var16][var22];
								int var29 = var3[var7][var16 + 1][var22];
								int var30 = var3[var7][var16 + 1][var22 + 1];
								int var31 = var3[var7][var16][var22 + 1];
								int var32 = Tiles.field846[var16][var22];
								int var33 = Tiles.field846[var16 + 1][var22];
								int var34 = Tiles.field846[var16 + 1][var22 + 1];
								int var35 = Tiles.field846[var16][var22 + 1];
								int var36 = -1;
								int var37 = -1;
								int var38;
								int var39;
								if (var26 > 0) {
									var38 = var17 * 256 / var20;
									var39 = var18 / var21;
									int var40 = var19 / var21;
									var36 = VerticalAlignment.method4228(var38, var39, var40);
									var38 = var38 + Tiles.rndHue & 255;
									var40 += Tiles.rndLightness;
									if (var40 < 0) {
										var40 = 0;
									} else if (var40 > 255) {
										var40 = 255;
									}

									var37 = VerticalAlignment.method4228(var38, var39, var40);
								}

								if (var7 > 0) {
									boolean var60 = true;
									if (var26 == 0 && User.Tiles_shapes[var7][var16][var22] != 0) {
										var60 = false;
									}

									if (var27 > 0 && !class389.method7962(var27 - 1).hideUnderlay) {
										var60 = false;
									}

									if (var60 && var28 == var29 && var28 == var30 && var28 == var31) {
										var10000 = SecureRandomCallable.field862[var7][var16];
										var10000[var22] |= 2340;
									}
								}

								var38 = 0;
								if (var37 != -1) {
									var38 = Rasterizer3D.Rasterizer3D_colorPalette[class437.method8576(var37, 96)];
								}

								if (var27 == 0) {
									var5.addTile(var7, var16, var22, 0, 0, -1, var28, var29, var30, var31, class437.method8576(var36, var32), class437.method8576(var36, var33), class437.method8576(var36, var34), class437.method8576(var36, var35), 0, 0, 0, 0, var38, 0);
								} else {
									var39 = User.Tiles_shapes[var7][var16][var22] + 1;
									byte var61 = class518.field5341[var7][var16][var22];
									FloorOverlayDefinition var41 = class389.method7962(var27 - 1);
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
										var43 = VerticalAlignment.method4228(var41.hue, var41.saturation, var41.lightness);
										var45 = var41.hue + Tiles.rndHue & 255;
										var46 = var41.lightness + Tiles.rndLightness;
										if (var46 < 0) {
											var46 = 0;
										} else if (var46 > 255) {
											var46 = 255;
										}

										var44 = VerticalAlignment.method4228(var45, var41.saturation, var46);
									}

									var45 = 0;
									if (var44 != -2) {
										var45 = Rasterizer3D.Rasterizer3D_colorPalette[StructComposition.method4357(var44, 96)];
									}

									if (var41.secondaryRgb != -1) {
										var46 = var41.secondaryHue + Tiles.rndHue & 255;
										int var47 = var41.secondaryLightness + Tiles.rndLightness;
										if (var47 < 0) {
											var47 = 0;
										} else if (var47 > 255) {
											var47 = 255;
										}

										var44 = VerticalAlignment.method4228(var46, var41.secondarySaturation, var47);
										var45 = Rasterizer3D.Rasterizer3D_colorPalette[StructComposition.method4357(var44, 96)];
									}

									var5.addTile(var7, var16, var22, var39, var61, var42, var28, var29, var30, var31, class437.method8576(var36, var32), class437.method8576(var36, var33), class437.method8576(var36, var34), class437.method8576(var36, var35), StructComposition.method4357(var43, var32), StructComposition.method4357(var43, var33), StructComposition.method4357(var43, var34), StructComposition.method4357(var43, var35), var38, var45);
								}
							}
						}
					}
				}
			}

			for (var16 = 1; var16 < var2 - 1; ++var16) {
				for (var17 = 1; var17 < var1 - 1; ++var17) {
					var5.setTileMinPlane(var7, var17, var16, class101.method3011(var0, var7, var17, var16));
				}
			}

			AuthenticationScheme.Tiles_underlays[var7] = null;
			class31.Tiles_overlays[var7] = null;
			User.Tiles_shapes[var7] = null;
			class518.field5341[var7] = null;
			class462.Tiles_underlays2[var7] = null;
		}

		var5.method5190(-50, -10, -50);

		for (var7 = 0; var7 < var1; ++var7) {
			for (var8 = 0; var8 < var2; ++var8) {
				if ((var4[1][var7][var8] & 2) == 2) {
					var5.setLinkBelow(var7, var8);
				}
			}
		}

		if (var0.method2548()) {
			var7 = var0.sizeX;
			var8 = var0.sizeY;
			int[][][] var9 = var0.tileHeights;
			Scene var10 = var0.scene;
			int var56 = 1;
			int var57 = 2;
			int var58 = 4;

			for (var14 = 0; var14 < 4; ++var14) {
				if (var14 > 0) {
					var56 <<= 3;
					var57 <<= 3;
					var58 <<= 3;
				}

				for (var15 = 0; var15 <= var14; ++var15) {
					for (var16 = 0; var16 <= var8; ++var16) {
						for (var17 = 0; var17 <= var7; ++var17) {
							short var59;
							if ((SecureRandomCallable.field862[var15][var17][var16] & var56) != 0) {
								var18 = var16;
								var19 = var16;
								var20 = var15;

								for (var21 = var15; var18 > 0 && (SecureRandomCallable.field862[var15][var17][var18 - 1] & var56) != 0; --var18) {
								}

								while (var19 < var8 && (SecureRandomCallable.field862[var15][var17][var19 + 1] & var56) != 0) {
									++var19;
								}

								label449:
								while (var20 > 0) {
									for (var22 = var18; var22 <= var19; ++var22) {
										if ((SecureRandomCallable.field862[var20 - 1][var17][var22] & var56) == 0) {
											break label449;
										}
									}

									--var20;
								}

								label438:
								while (var21 < var14) {
									for (var22 = var18; var22 <= var19; ++var22) {
										if ((SecureRandomCallable.field862[var21 + 1][var17][var22] & var56) == 0) {
											break label438;
										}
									}

									++var21;
								}

								var22 = (var19 - var18 + 1) * (var21 + 1 - var20);
								if (var22 >= 8) {
									var59 = 240;
									var24 = var9[var21][var17][var18] - var59;
									var25 = var9[var20][var17][var18];
									var10.Scene_addOccluder(var14, 1, var17 * 128, var17 * 128, var18 * 128, var19 * 128 + 128, var24, var25);

									for (var26 = var20; var26 <= var21; ++var26) {
										for (var27 = var18; var27 <= var19; ++var27) {
											var10000 = SecureRandomCallable.field862[var26][var17];
											var10000[var27] &= ~var56;
										}
									}
								}
							}

							if ((SecureRandomCallable.field862[var15][var17][var16] & var57) != 0) {
								var18 = var17;
								var19 = var17;
								var20 = var15;

								for (var21 = var15; var18 > 0 && (SecureRandomCallable.field862[var15][var18 - 1][var16] & var57) != 0; --var18) {
								}

								while (var19 < var7 && (SecureRandomCallable.field862[var15][var19 + 1][var16] & var57) != 0) {
									++var19;
								}

								label502:
								while (var20 > 0) {
									for (var22 = var18; var22 <= var19; ++var22) {
										if ((SecureRandomCallable.field862[var20 - 1][var22][var16] & var57) == 0) {
											break label502;
										}
									}

									--var20;
								}

								label491:
								while (var21 < var14) {
									for (var22 = var18; var22 <= var19; ++var22) {
										if ((SecureRandomCallable.field862[var21 + 1][var22][var16] & var57) == 0) {
											break label491;
										}
									}

									++var21;
								}

								var22 = (var21 + 1 - var20) * (var19 - var18 + 1);
								if (var22 >= 8) {
									var59 = 240;
									var24 = var9[var21][var18][var16] - var59;
									var25 = var9[var20][var18][var16];
									var10.Scene_addOccluder(var14, 2, var18 * 128, var19 * 128 + 128, var16 * 128, var16 * 128, var24, var25);

									for (var26 = var20; var26 <= var21; ++var26) {
										for (var27 = var18; var27 <= var19; ++var27) {
											var10000 = SecureRandomCallable.field862[var26][var27];
											var10000[var16] &= ~var57;
										}
									}
								}
							}

							if ((SecureRandomCallable.field862[var15][var17][var16] & var58) != 0) {
								var18 = var17;
								var19 = var17;
								var20 = var16;

								for (var21 = var16; var20 > 0 && (SecureRandomCallable.field862[var15][var17][var20 - 1] & var58) != 0; --var20) {
								}

								while (var21 < var8 && (SecureRandomCallable.field862[var15][var17][var21 + 1] & var58) != 0) {
									++var21;
								}

								label555:
								while (var18 > 0) {
									for (var22 = var20; var22 <= var21; ++var22) {
										if ((SecureRandomCallable.field862[var15][var18 - 1][var22] & var58) == 0) {
											break label555;
										}
									}

									--var18;
								}

								label544:
								while (var19 < var7) {
									for (var22 = var20; var22 <= var21; ++var22) {
										if ((SecureRandomCallable.field862[var15][var19 + 1][var22] & var58) == 0) {
											break label544;
										}
									}

									++var19;
								}

								if ((var19 - var18 + 1) * (var21 - var20 + 1) >= 4) {
									var22 = var9[var15][var18][var20];
									var10.Scene_addOccluder(var14, 4, var18 * 128, var19 * 128 + 128, var20 * 128, var21 * 128 + 128, var22, var22);

									for (var23 = var18; var23 <= var19; ++var23) {
										for (var24 = var20; var24 <= var21; ++var24) {
											var10000 = SecureRandomCallable.field862[var15][var23];
											var10000[var24] &= ~var58;
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
}
