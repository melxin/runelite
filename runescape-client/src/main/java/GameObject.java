import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kr")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("pc")
	@ObfuscatedGetter(
		intValue = -2045476909
	)
	static int field2973;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -6305905
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1787010639
	)
	@Export("z")
	int z;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -2096310135
	)
	@Export("centerX")
	int centerX;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 373142153
	)
	@Export("centerY")
	int centerY;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 2046998057
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1074891597
	)
	@Export("startX")
	int startX;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1170690627
	)
	@Export("endX")
	int endX;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 135868165
	)
	@Export("startY")
	int startY;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -159492391
	)
	@Export("endY")
	int endY;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1848231225
	)
	int field2967;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1729708675
	)
	@Export("lastDrawn")
	int lastDrawn;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		longValue = 5177952103211529979L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 343203793
	)
	@Export("flags")
	int flags;

	GameObject() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ldm;IIIIIILka;B)V",
		garbageValue = "-51"
	)
	@Export("addObjects")
	static final void addObjects(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, CollisionMap var7) {
		if (!Client.isLowDetail || (var0.tileSettings[0][var2][var3] & 2) != 0 || (var0.tileSettings[var1][var2][var3] & 16) == 0) {
			if (var1 < Tiles.Tiles_minPlane) {
				Tiles.Tiles_minPlane = var1;
			}

			ObjectComposition var8 = HttpMethod.getObjectDefinition(var4);
			int var9;
			int var10;
			if (var5 != 1 && var5 != 3) {
				var9 = var8.sizeX;
				var10 = var8.sizeY;
			} else {
				var9 = var8.sizeY;
				var10 = var8.sizeX;
			}

			int var11;
			int var12;
			if (var9 + var2 <= var0.sizeX) {
				var11 = (var9 >> 1) + var2;
				var12 = var2 + (var9 + 1 >> 1);
			} else {
				var11 = var2;
				var12 = var2 + 1;
			}

			int var13;
			int var14;
			if (var3 + var10 <= var0.sizeY) {
				var13 = var3 + (var10 >> 1);
				var14 = var3 + (var10 + 1 >> 1);
			} else {
				var13 = var3;
				var14 = var3 + 1;
			}

			int[][] var15 = var0.tileHeights[var1];
			int var16 = var15[var12][var14] + var15[var12][var13] + var15[var11][var13] + var15[var11][var14] >> 2;
			int var17 = (var2 << 7) + (var9 << 6);
			int var18 = (var3 << 7) + (var10 << 6);
			long var19 = WorldMapScaleHandler.calculateTag(var2, var3, 2, var8.int1 == 0, var4, var0.id);
			int var21 = (var5 << 6) + var6;
			if (var8.int3 == 1) {
				var21 += 256;
			}

			if (var8.hasSound()) {
				class202.createObjectSound(var1, var2, var3, var8, var5);
			}

			Scene var22 = var0.scene;
			Object var30;
			if (var6 == 22) {
				if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) {
					if (var8.animationId == -1 && var8.transforms == null) {
						var30 = var8.getEntity(22, var5, var15, var17, var16, var18);
					} else {
						var30 = new DynamicObject(var0, var4, 22, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
					}

					var22.newFloorDecoration(var1, var2, var3, var16, (Renderable)var30, var19, var21);
					if (var8.interactType == 1 && var7 != null) {
						var7.setBlockedByFloorDec(var2, var3);
					}

				}
			} else {
				int var29;
				if (var6 != 10 && var6 != 11) {
					int[] var10000;
					if (var6 >= 12) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var30 = var8.getEntity(var6, var5, var15, var17, var16, var18);
						} else {
							var30 = new DynamicObject(var0, var4, var6, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
						}

						var22.method4885(var1, var2, var3, var16, 1, 1, (Renderable)var30, 0, var19, var21);
						if (var6 >= 12 && var6 <= 17 && var6 != 13 && var1 > 0) {
							var10000 = UserComparator2.field5534[var1][var2];
							var10000[var3] |= 2340;
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.addGameObject(var2, var3, var9, var10, var8.boolean1);
						}

					} else if (var6 == 0) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var30 = var8.getEntity(0, var5, var15, var17, var16, var18);
						} else {
							var30 = new DynamicObject(var0, var4, 0, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
						}

						var22.newBoundaryObject(var1, var2, var3, var16, (Renderable)var30, (Renderable)null, Tiles.field1037[var5], 0, var19, var21);
						if (var5 == 0) {
							if (var8.clipped) {
								DirectByteArrayCopier.Tiles_underlays2[var1][var2][var3] = 50;
								DirectByteArrayCopier.Tiles_underlays2[var1][var2][var3 + 1] = 50;
							}

							if (var8.modelClipped) {
								var10000 = UserComparator2.field5534[var1][var2];
								var10000[var3] |= 585;
							}
						} else if (var5 == 1) {
							if (var8.clipped) {
								DirectByteArrayCopier.Tiles_underlays2[var1][var2][var3 + 1] = 50;
								DirectByteArrayCopier.Tiles_underlays2[var1][var2 + 1][var3 + 1] = 50;
							}

							if (var8.modelClipped) {
								var10000 = UserComparator2.field5534[var1][var2];
								var10000[var3 + 1] |= 1170;
							}
						} else if (var5 == 2) {
							if (var8.clipped) {
								DirectByteArrayCopier.Tiles_underlays2[var1][var2 + 1][var3] = 50;
								DirectByteArrayCopier.Tiles_underlays2[var1][var2 + 1][var3 + 1] = 50;
							}

							if (var8.modelClipped) {
								var10000 = UserComparator2.field5534[var1][var2 + 1];
								var10000[var3] |= 585;
							}
						} else if (var5 == 3) {
							if (var8.clipped) {
								DirectByteArrayCopier.Tiles_underlays2[var1][var2][var3] = 50;
								DirectByteArrayCopier.Tiles_underlays2[var1][var2 + 1][var3] = 50;
							}

							if (var8.modelClipped) {
								var10000 = UserComparator2.field5534[var1][var2];
								var10000[var3] |= 1170;
							}
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.method5607(var2, var3, var6, var5, var8.boolean1);
						}

						if (var8.int2 != 16) {
							var22.method4981(var1, var2, var3, var8.int2);
						}

					} else if (var6 == 1) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var30 = var8.getEntity(1, var5, var15, var17, var16, var18);
						} else {
							var30 = new DynamicObject(var0, var4, 1, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
						}

						var22.newBoundaryObject(var1, var2, var3, var16, (Renderable)var30, (Renderable)null, Tiles.field1047[var5], 0, var19, var21);
						if (var8.clipped) {
							if (var5 == 0) {
								DirectByteArrayCopier.Tiles_underlays2[var1][var2][var3 + 1] = 50;
							} else if (var5 == 1) {
								DirectByteArrayCopier.Tiles_underlays2[var1][var2 + 1][var3 + 1] = 50;
							} else if (var5 == 2) {
								DirectByteArrayCopier.Tiles_underlays2[var1][var2 + 1][var3] = 50;
							} else if (var5 == 3) {
								DirectByteArrayCopier.Tiles_underlays2[var1][var2][var3] = 50;
							}
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.method5607(var2, var3, var6, var5, var8.boolean1);
						}

					} else {
						int var23;
						if (var6 == 2) {
							var23 = var5 + 1 & 3;
							Object var25;
							Object var31;
							if (var8.animationId == -1 && var8.transforms == null) {
								var31 = var8.getEntity(2, var5 + 4, var15, var17, var16, var18);
								var25 = var8.getEntity(2, var23, var15, var17, var16, var18);
							} else {
								var31 = new DynamicObject(var0, var4, 2, var5 + 4, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
								var25 = new DynamicObject(var0, var4, 2, var23, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
							}

							var22.newBoundaryObject(var1, var2, var3, var16, (Renderable)var31, (Renderable)var25, Tiles.field1037[var5], Tiles.field1037[var23], var19, var21);
							if (var8.modelClipped) {
								if (var5 == 0) {
									var10000 = UserComparator2.field5534[var1][var2];
									var10000[var3] |= 585;
									var10000 = UserComparator2.field5534[var1][var2];
									var10000[1 + var3] |= 1170;
								} else if (var5 == 1) {
									var10000 = UserComparator2.field5534[var1][var2];
									var10000[1 + var3] |= 1170;
									var10000 = UserComparator2.field5534[var1][var2 + 1];
									var10000[var3] |= 585;
								} else if (var5 == 2) {
									var10000 = UserComparator2.field5534[var1][var2 + 1];
									var10000[var3] |= 585;
									var10000 = UserComparator2.field5534[var1][var2];
									var10000[var3] |= 1170;
								} else if (var5 == 3) {
									var10000 = UserComparator2.field5534[var1][var2];
									var10000[var3] |= 1170;
									var10000 = UserComparator2.field5534[var1][var2];
									var10000[var3] |= 585;
								}
							}

							if (var8.interactType != 0 && var7 != null) {
								var7.method5607(var2, var3, var6, var5, var8.boolean1);
							}

							if (var8.int2 != 16) {
								var22.method4981(var1, var2, var3, var8.int2);
							}

						} else if (var6 == 3) {
							if (var8.animationId == -1 && var8.transforms == null) {
								var30 = var8.getEntity(3, var5, var15, var17, var16, var18);
							} else {
								var30 = new DynamicObject(var0, var4, 3, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
							}

							var22.newBoundaryObject(var1, var2, var3, var16, (Renderable)var30, (Renderable)null, Tiles.field1047[var5], 0, var19, var21);
							if (var8.clipped) {
								if (var5 == 0) {
									DirectByteArrayCopier.Tiles_underlays2[var1][var2][var3 + 1] = 50;
								} else if (var5 == 1) {
									DirectByteArrayCopier.Tiles_underlays2[var1][var2 + 1][var3 + 1] = 50;
								} else if (var5 == 2) {
									DirectByteArrayCopier.Tiles_underlays2[var1][var2 + 1][var3] = 50;
								} else if (var5 == 3) {
									DirectByteArrayCopier.Tiles_underlays2[var1][var2][var3] = 50;
								}
							}

							if (var8.interactType != 0 && var7 != null) {
								var7.method5607(var2, var3, var6, var5, var8.boolean1);
							}

						} else if (var6 == 9) {
							if (var8.animationId == -1 && var8.transforms == null) {
								var30 = var8.getEntity(var6, var5, var15, var17, var16, var18);
							} else {
								var30 = new DynamicObject(var0, var4, var6, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
							}

							var22.method4885(var1, var2, var3, var16, 1, 1, (Renderable)var30, 0, var19, var21);
							if (var8.interactType != 0 && var7 != null) {
								var7.addGameObject(var2, var3, var9, var10, var8.boolean1);
							}

							if (var8.int2 != 16) {
								var22.method4981(var1, var2, var3, var8.int2);
							}

						} else if (var6 == 4) {
							if (var8.animationId == -1 && var8.transforms == null) {
								var30 = var8.getEntity(4, var5, var15, var17, var16, var18);
							} else {
								var30 = new DynamicObject(var0, var4, 4, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
							}

							var22.newWallDecoration(var1, var2, var3, var16, (Renderable)var30, (Renderable)null, Tiles.field1037[var5], 0, 0, 0, var19, var21);
						} else {
							long var24;
							Object var26;
							if (var6 == 5) {
								var23 = 16;
								var24 = var22.getBoundaryObjectTag(var1, var2, var3);
								if (var24 != 0L) {
									var23 = HttpMethod.getObjectDefinition(class137.Entity_unpackID(var24)).int2;
								}

								if (var8.animationId == -1 && var8.transforms == null) {
									var26 = var8.getEntity(4, var5, var15, var17, var16, var18);
								} else {
									var26 = new DynamicObject(var0, var4, 4, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
								}

								var22.newWallDecoration(var1, var2, var3, var16, (Renderable)var26, (Renderable)null, Tiles.field1037[var5], 0, var23 * Tiles.field1044[var5], var23 * Tiles.field1045[var5], var19, var21);
							} else if (var6 == 6) {
								var23 = 8;
								var24 = var22.getBoundaryObjectTag(var1, var2, var3);
								if (0L != var24) {
									var23 = HttpMethod.getObjectDefinition(class137.Entity_unpackID(var24)).int2 / 2;
								}

								if (var8.animationId == -1 && var8.transforms == null) {
									var26 = var8.getEntity(4, var5 + 4, var15, var17, var16, var18);
								} else {
									var26 = new DynamicObject(var0, var4, 4, var5 + 4, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
								}

								var22.newWallDecoration(var1, var2, var3, var16, (Renderable)var26, (Renderable)null, 256, var5, var23 * Tiles.field1046[var5], var23 * Tiles.field1050[var5], var19, var21);
							} else if (var6 == 7) {
								var29 = var5 + 2 & 3;
								if (var8.animationId == -1 && var8.transforms == null) {
									var30 = var8.getEntity(4, var29 + 4, var15, var17, var16, var18);
								} else {
									var30 = new DynamicObject(var0, var4, 4, var29 + 4, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
								}

								var22.newWallDecoration(var1, var2, var3, var16, (Renderable)var30, (Renderable)null, 256, var29, 0, 0, var19, var21);
							} else if (var6 == 8) {
								var23 = 8;
								var24 = var22.getBoundaryObjectTag(var1, var2, var3);
								if (0L != var24) {
									var23 = HttpMethod.getObjectDefinition(class137.Entity_unpackID(var24)).int2 / 2;
								}

								int var28 = var5 + 2 & 3;
								Object var27;
								if (var8.animationId == -1 && var8.transforms == null) {
									var26 = var8.getEntity(4, var5 + 4, var15, var17, var16, var18);
									var27 = var8.getEntity(4, var28 + 4, var15, var17, var16, var18);
								} else {
									var26 = new DynamicObject(var0, var4, 4, var5 + 4, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
									var27 = new DynamicObject(var0, var4, 4, var28 + 4, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
								}

								var22.newWallDecoration(var1, var2, var3, var16, (Renderable)var26, (Renderable)var27, 256, var5, var23 * Tiles.field1046[var5], var23 * Tiles.field1050[var5], var19, var21);
							}
						}
					}
				} else {
					if (var8.animationId == -1 && var8.transforms == null) {
						var30 = var8.getEntity(10, var5, var15, var17, var16, var18);
					} else {
						var30 = new DynamicObject(var0, var4, 10, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
					}

					if (var30 != null && var22.method4885(var1, var2, var3, var16, var9, var10, (Renderable)var30, var6 == 11 ? 256 : 0, var19, var21) && var8.clipped) {
						var29 = 15;
						if (var30 instanceof Model) {
							var29 = ((Model)var30).method5389() / 4;
							if (var29 > 30) {
								var29 = 30;
							}
						}

						for (int var32 = 0; var32 <= var9; ++var32) {
							for (int var33 = 0; var33 <= var10; ++var33) {
								if (var29 > DirectByteArrayCopier.Tiles_underlays2[var1][var32 + var2][var3 + var33]) {
									DirectByteArrayCopier.Tiles_underlays2[var1][var32 + var2][var3 + var33] = (byte)var29;
								}
							}
						}
					}

					if (var8.interactType != 0 && var7 != null) {
						var7.addGameObject(var2, var3, var9, var10, var8.boolean1);
					}

				}
			}
		}
	}
}
