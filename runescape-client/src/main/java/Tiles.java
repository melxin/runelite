import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ds")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1710557195
	)
	@Export("Tiles_minPlane")
	static int Tiles_minPlane;
	@ObfuscatedName("ao")
	@Export("Tiles_shapes")
	static byte[][][] Tiles_shapes;
	@ObfuscatedName("ad")
	static byte[][][] field1026;
	@ObfuscatedName("an")
	@Export("Tiles_underlays2")
	static byte[][][] Tiles_underlays2;
	@ObfuscatedName("at")
	@Export("Tiles_saturation")
	static int[] Tiles_saturation;
	@ObfuscatedName("ac")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;
	@ObfuscatedName("al")
	static final int[] field1028;
	@ObfuscatedName("av")
	static final int[] field1034;
	@ObfuscatedName("ag")
	static final int[] field1031;
	@ObfuscatedName("aw")
	static final int[] field1036;
	@ObfuscatedName("ai")
	static final int[] field1037;
	@ObfuscatedName("ar")
	static final int[] field1038;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1718024243
	)
	@Export("rndHue")
	static int rndHue;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1678568769
	)
	@Export("rndLightness")
	static int rndLightness;

	static {
		Tiles_minPlane = 99;
		field1028 = new int[]{1, 2, 4, 8};
		field1034 = new int[]{16, 32, 64, 128};
		field1031 = new int[]{1, 0, -1, 0};
		field1036 = new int[]{0, -1, 0, 1};
		field1037 = new int[]{1, -1, -1, 1};
		field1038 = new int[]{-1, -1, 1, 1};
		rndHue = (int)(Math.random() * 17.0D) - 8;
		rndLightness = (int)(Math.random() * 33.0D) - 16;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1060073835"
	)
	static int method2572() {
		return ++Messages.Messages_count - 1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([FIFZFZ[FI)I",
		garbageValue = "-113421688"
	)
	public static int method2556(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6) {
		float var7 = 0.0F;

		for (int var8 = 0; var8 < var1 + 1; ++var8) {
			var7 += Math.abs(var0[var8]);
		}

		float var44 = (Math.abs(var2) + Math.abs(var4)) * (float)(var1 + 1) * class132.field1535;
		if (var7 <= var44) {
			return -1;
		} else {
			float[] var9 = new float[var1 + 1];

			int var10;
			for (var10 = 0; var10 < var1 + 1; ++var10) {
				var9[var10] = 1.0F / var7 * var0[var10];
			}

			while (Math.abs(var9[var1]) < var44) {
				--var1;
			}

			var10 = 0;
			if (var1 == 0) {
				return var10;
			} else if (var1 == 1) {
				var6[0] = -var9[0] / var9[1];
				boolean var42 = var3 ? var2 < var44 + var6[0] : var2 < var6[0] - var44;
				boolean var43 = var5 ? var4 > var6[0] - var44 : var4 > var44 + var6[0];
				var10 = var42 && var43 ? 1 : 0;
				if (var10 > 0) {
					if (var3 && var6[0] < var2) {
						var6[0] = var2;
					} else if (var5 && var6[0] > var4) {
						var6[0] = var4;
					}
				}

				return var10;
			} else {
				class430 var11 = new class430(var9, var1);
				float[] var12 = new float[var1 + 1];

				for (int var13 = 1; var13 <= var1; ++var13) {
					var12[var13 - 1] = var9[var13] * (float)var13;
				}

				float[] var41 = new float[var1 + 1];
				int var14 = method2556(var12, var1 - 1, var2, false, var4, false, var41);
				if (var14 == -1) {
					return 0;
				} else {
					boolean var15 = false;
					float var17 = 0.0F;
					float var18 = 0.0F;
					float var19 = 0.0F;

					for (int var20 = 0; var20 <= var14; ++var20) {
						if (var10 > var1) {
							return var10;
						}

						float var16;
						if (var20 == 0) {
							var16 = var2;
							var18 = class450.method8887(var9, var1, var2);
							if (Math.abs(var18) <= var44 && var3) {
								var6[var10++] = var2;
							}
						} else {
							var16 = var19;
							var18 = var17;
						}

						if (var14 == var20) {
							var19 = var4;
							var15 = false;
						} else {
							var19 = var41[var20];
						}

						var17 = class450.method8887(var9, var1, var19);
						if (var15) {
							var15 = false;
						} else if (Math.abs(var17) < var44) {
							if (var20 != var14 || var5) {
								var6[var10++] = var19;
								var15 = true;
							}
						} else if (var18 < 0.0F && var17 > 0.0F || var18 > 0.0F && var17 < 0.0F) {
							int var22 = var10++;
							float var24 = var16;
							float var25 = var19;
							float var26 = class450.method8887(var11.field4780, var11.field4778, var16);
							float var23;
							if (Math.abs(var26) < class132.field1535) {
								var23 = var16;
							} else {
								float var27 = class450.method8887(var11.field4780, var11.field4778, var19);
								if (Math.abs(var27) < class132.field1535) {
									var23 = var19;
								} else {
									float var28 = 0.0F;
									float var29 = 0.0F;
									float var30 = 0.0F;
									float var35 = 0.0F;
									boolean var36 = true;
									boolean var37 = false;

									do {
										var37 = false;
										if (var36) {
											var28 = var24;
											var35 = var26;
											var29 = var25 - var24;
											var30 = var29;
											var36 = false;
										}

										if (Math.abs(var35) < Math.abs(var27)) {
											var24 = var25;
											var25 = var28;
											var28 = var24;
											var26 = var27;
											var27 = var35;
											var35 = var26;
										}

										float var38 = class132.field1536 * Math.abs(var25) + 0.0F;
										float var39 = (var28 - var25) * 0.5F;
										boolean var40 = Math.abs(var39) > var38 && 0.0F != var27;
										if (var40) {
											if (Math.abs(var30) >= var38 && Math.abs(var26) > Math.abs(var27)) {
												float var34 = var27 / var26;
												float var31;
												float var32;
												if (var28 == var24) {
													var31 = var39 * 2.0F * var34;
													var32 = 1.0F - var34;
												} else {
													var32 = var26 / var35;
													float var33 = var27 / var35;
													var31 = (2.0F * var39 * var32 * (var32 - var33) - (var33 - 1.0F) * (var25 - var24)) * var34;
													var32 = (var34 - 1.0F) * (var33 - 1.0F) * (var32 - 1.0F);
												}

												if ((double)var31 > 0.0D) {
													var32 = -var32;
												} else {
													var31 = -var31;
												}

												var34 = var30;
												var30 = var29;
												if (2.0F * var31 < var32 * var39 * 3.0F - Math.abs(var32 * var38) && var31 < Math.abs(var32 * var34 * 0.5F)) {
													var29 = var31 / var32;
												} else {
													var29 = var39;
													var30 = var39;
												}
											} else {
												var29 = var39;
												var30 = var39;
											}

											var24 = var25;
											var26 = var27;
											if (Math.abs(var29) > var38) {
												var25 += var29;
											} else if ((double)var39 > 0.0D) {
												var25 += var38;
											} else {
												var25 -= var38;
											}

											var27 = class450.method8887(var11.field4780, var11.field4778, var25);
											if ((double)(var27 * (var35 / Math.abs(var35))) > 0.0D) {
												var36 = true;
												var37 = true;
											} else {
												var37 = true;
											}
										}
									} while(var37);

									var23 = var25;
								}
							}

							var6[var22] = var23;
							if (var10 > 1 && var6[var10 - 2] >= var6[var10 - 1] - var44) {
								var6[var10 - 2] = 0.5F * (var6[var10 - 1] + var6[var10 - 2]);
								--var10;
							}
						}
					}

					return var10;
				}
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-232898322"
	)
	static void method2571() {
		ItemContainer.itemContainers = new NodeHashTable(32);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ldz;[BIIIIIII)V"
	)
	static final void method2511(WorldView var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Buffer var9 = new Buffer(var1);
		int var10 = -1;

		while (true) {
			int var11 = var9.readIncrSmallSmart();
			if (var11 == 0) {
				return;
			}

			var10 += var11;
			int var12 = 0;

			while (true) {
				int var13 = var9.readUShortSmart();
				if (var13 == 0) {
					break;
				}

				var12 += var13 - 1;
				int var14 = var12 & 63;
				int var15 = var12 >> 6 & 63;
				int var16 = var12 >> 12;
				int var17 = var9.readUnsignedByte();
				int var18 = var17 >> 2;
				int var19 = var17 & 3;
				if (var5 == var16 && var15 >= var6 && var15 < var6 + 8 && var14 >= var7 && var14 < var7 + 8) {
					ObjectComposition var20 = class142.getObjectDefinition(var10);
					int var21 = var3 + class133.method3426(var15 & 7, var14 & 7, var8, var20.sizeX, var20.sizeY, var19);
					int var22 = var4 + class224.method5045(var15 & 7, var14 & 7, var8, var20.sizeX, var20.sizeY, var19);
					if (var21 > 0 && var22 > 0 && var21 < var0.sizeX - 1 && var22 < var0.sizeY - 1) {
						int var23 = var2;
						if ((var0.tileSettings[1][var21][var22] & 2) == 2) {
							var23 = var2 - 1;
						}

						CollisionMap var24 = null;
						if (var23 >= 0 && var0.collisionMaps != null) {
							var24 = var0.collisionMaps[var23];
						}

						WorldMapSection1.addObjects(var0, var2, var21, var22, var10, var19 + var8 & 3, var18, var24);
					}
				}
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-360358901"
	)
	static void method2574(String var0, String var1, String var2) {
		Varcs.method3212(7);
		class150.setLoginResponseString(var0, var1, var2);
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZB)I",
		garbageValue = "-95"
	)
	static int method2544(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.LOGOUT) {
			Client.logoutTimer = 250;
			return 1;
		} else {
			return 2;
		}
	}
}
