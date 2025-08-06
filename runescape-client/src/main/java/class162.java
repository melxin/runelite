import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gt")
public class class162 extends class165 {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 678700057
	)
	int field1852;
	@ObfuscatedName("ab")
	byte field1850;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 604608115
	)
	int field1849;
	@ObfuscatedName("av")
	String field1851;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgp;"
	)
	final class166 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgp;)V"
	)
	class162(class166 var1) {
		this.this$0 = var1;
		this.field1852 = -1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "-2035870878"
	)
	void vmethod4076(Buffer var1) {
		var1.readUnsignedByte();
		this.field1852 = var1.readUnsignedShort();
		this.field1850 = var1.readByte();
		this.field1849 = var1.readUnsignedShort();
		var1.readLong();
		this.field1851 = var1.readStringCp1252NullTerminated();
		var1.readUnsignedByte();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lgw;B)V",
		garbageValue = "19"
	)
	void vmethod4077(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1852);
		var2.rank = this.field1850;
		var2.world = this.field1849;
		var2.username = new Username(this.field1851);
	}

	@ObfuscatedName("av")
	public static int method3976(long var0) {
		return (int)(var0 >>> 16 & 7L);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ldj;I)V",
		garbageValue = "-966866636"
	)
	static final void method3975(WorldView var0) {
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
			byte[][] var48 = Script.Tiles_underlays2[var7];
			boolean var51 = true;
			boolean var52 = true;
			boolean var11 = true;
			boolean var12 = true;
			boolean var13 = true;
			int var14 = (int)Math.sqrt(5100.0D);
			int var15 = var14 * 768 >> 8;

			int var16;
			int var17;
			int var18;
			int var19;
			int var20;
			int var21;
			int var22;
			int var23;
			int var24;
			int var25;
			for (var16 = 1; var16 < var2 - 1; ++var16) {
				for (var17 = 1; var17 < var1 - 1; ++var17) {
					var18 = var3[var7][var17 + 1][var16] - var3[var7][var17 - 1][var16];
					var19 = var3[var7][var17][var16 + 1] - var3[var7][var17][var16 - 1];
					var20 = (int)Math.sqrt((double)(var19 * var19 + var18 * var18 + 65536));
					var21 = (var18 << 8) / var20;
					var22 = 65536 / var20;
					var23 = (var19 << 8) / var20;
					var24 = (var23 * -50 + var21 * -50 + var22 * -10) / var15 + 96;
					var25 = (var48[var17][var16 + 1] >> 3) + (var48[var17 - 1][var16] >> 2) + (var48[var17][var16 - 1] >> 2) + (var48[var17 + 1][var16] >> 3) + (var48[var17][var16] >> 1);
					Timer.field4752[var17][var16] = var24 - var25;
				}
			}

			for (var16 = 0; var16 < var2; ++var16) {
				SecureRandomFuture.Tiles_hue[var16] = 0;
				WorldMapSection0.Tiles_saturation[var16] = 0;
				WorldMapArea.Tiles_lightness[var16] = 0;
				DbTable.Tiles_hueMultiplier[var16] = 0;
				DelayFadeTask.field5175[var16] = 0;
			}

			for (var16 = -5; var16 < var1 + 5; ++var16) {
				int[] var10000;
				for (var17 = 0; var17 < var2; ++var17) {
					var18 = var16 + 5;
					int var10002;
					if (var18 >= 0 && var18 < var1) {
						var19 = (int)class108.method3326(15);
						var20 = AABB.Tiles_underlays[var7][var18][var17] & var19;
						if (var20 > 0) {
							FloorUnderlayDefinition var49 = class427.SpotAnimationDefinition_get(var20 - 1);
							var10000 = SecureRandomFuture.Tiles_hue;
							var10000[var17] += var49.hue;
							var10000 = WorldMapSection0.Tiles_saturation;
							var10000[var17] += var49.saturation;
							var10000 = WorldMapArea.Tiles_lightness;
							var10000[var17] += var49.lightness;
							var10000 = DbTable.Tiles_hueMultiplier;
							var10000[var17] += var49.hueMultiplier;
							var10002 = DelayFadeTask.field5175[var17]++;
						}
					}

					var19 = var16 - 5;
					if (var19 >= 0 && var19 < var1) {
						var20 = (int)class108.method3326(15);
						var21 = AABB.Tiles_underlays[var7][var19][var17] & var20;
						if (var21 > 0) {
							FloorUnderlayDefinition var50 = class427.SpotAnimationDefinition_get(var21 - 1);
							var10000 = SecureRandomFuture.Tiles_hue;
							var10000[var17] -= var50.hue;
							var10000 = WorldMapSection0.Tiles_saturation;
							var10000[var17] -= var50.saturation;
							var10000 = WorldMapArea.Tiles_lightness;
							var10000[var17] -= var50.lightness;
							var10000 = DbTable.Tiles_hueMultiplier;
							var10000[var17] -= var50.hueMultiplier;
							var10002 = DelayFadeTask.field5175[var17]--;
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
							var17 += SecureRandomFuture.Tiles_hue[var23];
							var18 += WorldMapSection0.Tiles_saturation[var23];
							var19 += WorldMapArea.Tiles_lightness[var23];
							var20 += DbTable.Tiles_hueMultiplier[var23];
							var21 += DelayFadeTask.field5175[var23];
						}

						var24 = var22 - 5;
						if (var24 >= 0 && var24 < var2) {
							var17 -= SecureRandomFuture.Tiles_hue[var24];
							var18 -= WorldMapSection0.Tiles_saturation[var24];
							var19 -= WorldMapArea.Tiles_lightness[var24];
							var20 -= DbTable.Tiles_hueMultiplier[var24];
							var21 -= DelayFadeTask.field5175[var24];
						}

						if (var22 >= 1 && var22 < var2 - 1 && (!Client.isLowDetail || (var4[0][var16][var22] & 2) != 0 || (var4[var7][var16][var22] & 16) == 0)) {
							if (var7 < Tiles.Tiles_minPlane) {
								Tiles.Tiles_minPlane = var7;
							}

							var25 = (int)class108.method3326(15);
							int var26 = AABB.Tiles_underlays[var7][var16][var22] & var25;
							int var27 = Tiles.Tiles_overlays[var7][var16][var22] & var25;
							if (var26 > 0 || var27 > 0) {
								int var28 = var3[var7][var16][var22];
								int var29 = var3[var7][var16 + 1][var22];
								int var30 = var3[var7][var16 + 1][var22 + 1];
								int var31 = var3[var7][var16][var22 + 1];
								int var32 = Timer.field4752[var16][var22];
								int var33 = Timer.field4752[var16 + 1][var22];
								int var34 = Timer.field4752[var16 + 1][var22 + 1];
								int var35 = Timer.field4752[var16][var22 + 1];
								int var36 = -1;
								int var37 = -1;
								int var38;
								int var39;
								if (var26 > 0) {
									var38 = var17 * 256 / var20;
									var39 = var18 / var21;
									int var40 = var19 / var21;
									var36 = HealthBarDefinition.method4254(var38, var39, var40);
									var38 = var38 + Tiles.rndHue & 255;
									var40 += Tiles.rndLightness;
									if (var40 < 0) {
										var40 = 0;
									} else if (var40 > 255) {
										var40 = 255;
									}

									var37 = HealthBarDefinition.method4254(var38, var39, var40);
								}

								if (var7 > 0) {
									boolean var53 = true;
									if (var26 == 0 && class28.Tiles_shapes[var7][var16][var22] != 0) {
										var53 = false;
									}

									if (var27 > 0 && !JagNetThread.method8476(var27 - 1).hideUnderlay) {
										var53 = false;
									}

									if (var53 && var29 == var28 && var30 == var28 && var31 == var28) {
										var10000 = class81.field1179[var7][var16];
										var10000[var22] |= 2340;
									}
								}

								var38 = 0;
								if (var37 != -1) {
									var38 = Rasterizer3D.Rasterizer3D_colorPalette[class136.method3648(var37, 96)];
								}

								if (var27 == 0) {
									var5.addTile(var7, var16, var22, 0, 0, -1, var28, var29, var30, var31, class136.method3648(var36, var32), class136.method3648(var36, var33), class136.method3648(var36, var34), class136.method3648(var36, var35), 0, 0, 0, 0, var38, 0);
								} else {
									var39 = class28.Tiles_shapes[var7][var16][var22] + 1;
									byte var54 = ChatChannel.field806[var7][var16][var22];
									FloorOverlayDefinition var41 = JagNetThread.method8476(var27 - 1);
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
										var43 = HealthBarDefinition.method4254(var41.hue, var41.saturation, var41.lightness);
										var45 = var41.hue + Tiles.rndHue & 255;
										var46 = var41.lightness + Tiles.rndLightness;
										if (var46 < 0) {
											var46 = 0;
										} else if (var46 > 255) {
											var46 = 255;
										}

										var44 = HealthBarDefinition.method4254(var45, var41.saturation, var46);
									}

									var45 = 0;
									if (var44 != -2) {
										var45 = Rasterizer3D.Rasterizer3D_colorPalette[AABB.method5347(var44, 96)];
									}

									if (var41.secondaryRgb != -1) {
										var46 = var41.secondaryHue + Tiles.rndHue & 255;
										int var47 = var41.secondaryLightness + Tiles.rndLightness;
										if (var47 < 0) {
											var47 = 0;
										} else if (var47 > 255) {
											var47 = 255;
										}

										var44 = HealthBarDefinition.method4254(var46, var41.secondarySaturation, var47);
										var45 = Rasterizer3D.Rasterizer3D_colorPalette[AABB.method5347(var44, 96)];
									}

									var5.addTile(var7, var16, var22, var39, var54, var42, var28, var29, var30, var31, class136.method3648(var36, var32), class136.method3648(var36, var33), class136.method3648(var36, var34), class136.method3648(var36, var35), AABB.method5347(var43, var32), AABB.method5347(var43, var33), AABB.method5347(var43, var34), AABB.method5347(var43, var35), var38, var45);
								}
							}
						}
					}
				}
			}

			for (var16 = 1; var16 < var2 - 1; ++var16) {
				for (var17 = 1; var17 < var1 - 1; ++var17) {
					var5.setTileMinPlane(var7, var17, var16, TriBool.method10090(var0, var7, var17, var16));
				}
			}

			AABB.Tiles_underlays[var7] = null;
			Tiles.Tiles_overlays[var7] = null;
			class28.Tiles_shapes[var7] = null;
			ChatChannel.field806[var7] = null;
			Script.Tiles_underlays2[var7] = null;
		}

		var5.method5076(-50, -10, -50);

		for (var7 = 0; var7 < var1; ++var7) {
			for (var8 = 0; var8 < var2; ++var8) {
				if ((var4[1][var7][var8] & 2) == 2) {
					var5.setLinkBelow(var7, var8);
				}
			}
		}

		if (var0.method2650()) {
			Canvas.method346(var0);
		}

	}
}
