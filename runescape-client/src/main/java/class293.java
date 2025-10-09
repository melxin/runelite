import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lu")
public class class293 {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lpe;Lpe;III)Lri;",
		garbageValue = "167076878"
	)
	public static Font method6757(AbstractArchive var0, AbstractArchive var1, int var2, int var3) {
		if (!Friend.method10009(var0, var2, var3)) {
			return null;
		} else {
			byte[] var5 = var1.takeFile(var2, var3);
			Font var4;
			if (var5 == null) {
				var4 = null;
			} else {
				Font var6 = new Font(var5, class604.SpriteBuffer_xOffsets, class604.SpriteBuffer_yOffsets, class604.SpriteBuffer_spriteWidths, ItemContainer.SpriteBuffer_spriteHeights, class604.SpriteBuffer_spritePalette, class604.SpriteBuffer_pixels);
				class366.method7888();
				var4 = var6;
			}

			return var4;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ldm;IIIIIIIILke;Liy;Liy;I)V",
		garbageValue = "-1480648861"
	)
	static final void method6752(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, CollisionMap var9, Renderable var10, Renderable var11) {
		ObjectComposition var12 = TileItem.getObjectDefinition(var5);
		int var13 = var8 >= 0 ? var8 : var12.animationId;
		int var14;
		int var15;
		if (var6 != 1 && var6 != 3) {
			var14 = var12.sizeX;
			var15 = var12.sizeY;
		} else {
			var14 = var12.sizeY;
			var15 = var12.sizeX;
		}

		int var16;
		int var17;
		if (var3 + var14 <= var0.sizeX) {
			var16 = var3 + (var14 >> 1);
			var17 = var3 + (var14 + 1 >> 1);
		} else {
			var16 = var3;
			var17 = var3 + 1;
		}

		int var18;
		int var19;
		if (var15 + var4 <= var0.sizeY) {
			var18 = (var15 >> 1) + var4;
			var19 = (var15 + 1 >> 1) + var4;
		} else {
			var18 = var4;
			var19 = var4 + 1;
		}

		int[][] var20 = var0.tileHeights[var2];
		int var21 = var20[var17][var19] + var20[var16][var18] + var20[var17][var18] + var20[var16][var19] >> 2;
		int var22 = (var3 << 7) + (var14 << 6);
		int var23 = (var4 << 7) + (var15 << 6);
		Scene var24 = var0.scene;
		long var25 = ClanChannelMember.calculateTag(var1, var3, var4, 2, var12.int1 == 0, var5, var0.id);
		int var27 = (var6 << 6) + var7;
		if (var12.int3 == 1) {
			var27 += 256;
		}

		Object var35;
		if (var7 == 22) {
			if (var13 == -1 && var12.transforms == null) {
				var35 = var12.getModel(22, var6, var20, var22, var21, var23);
			} else {
				var35 = new DynamicObject(var0, var5, 22, var6, var2, var3, var4, var13, var12.boolean3, var10);
			}

			var24.newFloorDecoration(var1, var3, var4, var21, (Renderable)var35, var25, var27);
			if (var12.interactType == 1 && var9 != null) {
				var9.setBlockedByFloorDec(var3, var4);
			}

		} else if (var7 != 10 && var7 != 11) {
			if (var7 >= 12) {
				if (var13 == -1 && var12.transforms == null) {
					var35 = var12.getModel(var7, var6, var20, var22, var21, var23);
				} else {
					var35 = new DynamicObject(var0, var5, var7, var6, var2, var3, var4, var13, var12.boolean3, var10);
				}

				var24.method5168(var1, var3, var4, var21, 1, 1, (Renderable)var35, 0, var25, var27);
				if (var12.interactType != 0 && var9 != null) {
					var9.addGameObject(var3, var4, var14, var15, var12.boolean1);
				}

			} else if (var7 == 0) {
				if (var13 == -1 && var12.transforms == null) {
					var35 = var12.getModel(0, var6, var20, var22, var21, var23);
				} else {
					var35 = new DynamicObject(var0, var5, 0, var6, var2, var3, var4, var13, var12.boolean3, var10);
				}

				var24.newBoundaryObject(var1, var3, var4, var21, (Renderable)var35, (Renderable)null, Tiles.field817[var6], 0, var25, var27);
				if (var12.interactType != 0 && var9 != null) {
					var9.method6228(var3, var4, var7, var6, var12.boolean1);
				}

			} else if (var7 == 1) {
				if (var13 == -1 && var12.transforms == null) {
					var35 = var12.getModel(1, var6, var20, var22, var21, var23);
				} else {
					var35 = new DynamicObject(var0, var5, 1, var6, var2, var3, var4, var13, var12.boolean3, var10);
				}

				var24.newBoundaryObject(var1, var3, var4, var21, (Renderable)var35, (Renderable)null, Tiles.field818[var6], 0, var25, var27);
				if (var12.interactType != 0 && var9 != null) {
					var9.method6228(var3, var4, var7, var6, var12.boolean1);
				}

			} else {
				int var28;
				if (var7 == 2) {
					var28 = var6 + 1 & 3;
					Object var30;
					Object var36;
					if (var13 == -1 && var12.transforms == null) {
						var36 = var12.getModel(2, var6 + 4, var20, var22, var21, var23);
						var30 = var12.getModel(2, var28, var20, var22, var21, var23);
					} else {
						var36 = new DynamicObject(var0, var5, 2, var6 + 4, var2, var3, var4, var13, var12.boolean3, var10);
						var30 = new DynamicObject(var0, var5, 2, var28, var2, var3, var4, var13, var12.boolean3, var11);
					}

					var24.newBoundaryObject(var1, var3, var4, var21, (Renderable)var36, (Renderable)var30, Tiles.field817[var6], Tiles.field817[var28], var25, var27);
					if (var12.interactType != 0 && var9 != null) {
						var9.method6228(var3, var4, var7, var6, var12.boolean1);
					}

				} else if (var7 == 3) {
					if (var13 == -1 && var12.transforms == null) {
						var35 = var12.getModel(3, var6, var20, var22, var21, var23);
					} else {
						var35 = new DynamicObject(var0, var5, 3, var6, var2, var3, var4, var13, var12.boolean3, var10);
					}

					var24.newBoundaryObject(var1, var3, var4, var21, (Renderable)var35, (Renderable)null, Tiles.field818[var6], 0, var25, var27);
					if (var12.interactType != 0 && var9 != null) {
						var9.method6228(var3, var4, var7, var6, var12.boolean1);
					}

				} else if (var7 == 9) {
					if (var13 == -1 && var12.transforms == null) {
						var35 = var12.getModel(var7, var6, var20, var22, var21, var23);
					} else {
						var35 = new DynamicObject(var0, var5, var7, var6, var2, var3, var4, var13, var12.boolean3, var10);
					}

					var24.method5168(var1, var3, var4, var21, 1, 1, (Renderable)var35, 0, var25, var27);
					if (var12.interactType != 0 && var9 != null) {
						var9.addGameObject(var3, var4, var14, var15, var12.boolean1);
					}

				} else if (var7 == 4) {
					if (var13 == -1 && var12.transforms == null) {
						var35 = var12.getModel(4, var6, var20, var22, var21, var23);
					} else {
						var35 = new DynamicObject(var0, var5, 4, var6, var2, var3, var4, var13, var12.boolean3, var10);
					}

					var24.newWallDecoration(var1, var3, var4, var21, (Renderable)var35, (Renderable)null, Tiles.field817[var6], 0, 0, 0, var25, var27);
				} else {
					long var29;
					Object var31;
					if (var7 == 5) {
						var28 = 16;
						var29 = var24.getBoundaryObjectTag(var1, var3, var4);
						if (0L != var29) {
							var28 = TileItem.getObjectDefinition(BuddyRankComparator.Entity_unpackID(var29)).int2;
						}

						if (var13 == -1 && var12.transforms == null) {
							var31 = var12.getModel(4, var6, var20, var22, var21, var23);
						} else {
							var31 = new DynamicObject(var0, var5, 4, var6, var2, var3, var4, var13, var12.boolean3, var10);
						}

						var24.newWallDecoration(var1, var3, var4, var21, (Renderable)var31, (Renderable)null, Tiles.field817[var6], 0, Tiles.field823[var6] * var28, Tiles.field820[var6] * var28, var25, var27);
					} else if (var7 == 6) {
						var28 = 8;
						var29 = var24.getBoundaryObjectTag(var1, var3, var4);
						if (0L != var29) {
							var28 = TileItem.getObjectDefinition(BuddyRankComparator.Entity_unpackID(var29)).int2 / 2;
						}

						if (var13 == -1 && var12.transforms == null) {
							var31 = var12.getModel(4, var6 + 4, var20, var22, var21, var23);
						} else {
							var31 = new DynamicObject(var0, var5, 4, var6 + 4, var2, var3, var4, var13, var12.boolean3, var10);
						}

						var24.newWallDecoration(var1, var3, var4, var21, (Renderable)var31, (Renderable)null, 256, var6, Tiles.field821[var6] * var28, Tiles.field822[var6] * var28, var25, var27);
					} else if (var7 == 7) {
						int var34 = var6 + 2 & 3;
						if (var13 == -1 && var12.transforms == null) {
							var35 = var12.getModel(4, var34 + 4, var20, var22, var21, var23);
						} else {
							var35 = new DynamicObject(var0, var5, 4, var34 + 4, var2, var3, var4, var13, var12.boolean3, var10);
						}

						var24.newWallDecoration(var1, var3, var4, var21, (Renderable)var35, (Renderable)null, 256, var34, 0, 0, var25, var27);
					} else if (var7 == 8) {
						var28 = 8;
						var29 = var24.getBoundaryObjectTag(var1, var3, var4);
						if (0L != var29) {
							var28 = TileItem.getObjectDefinition(BuddyRankComparator.Entity_unpackID(var29)).int2 / 2;
						}

						int var33 = var6 + 2 & 3;
						Object var32;
						if (var13 == -1 && var12.transforms == null) {
							var31 = var12.getModel(4, var6 + 4, var20, var22, var21, var23);
							var32 = var12.getModel(4, var33 + 4, var20, var22, var21, var23);
						} else {
							var31 = new DynamicObject(var0, var5, 4, var6 + 4, var2, var3, var4, var13, var12.boolean3, var10);
							var32 = new DynamicObject(var0, var5, 4, var33 + 4, var2, var3, var4, var13, var12.boolean3, var11);
						}

						var24.newWallDecoration(var1, var3, var4, var21, (Renderable)var31, (Renderable)var32, 256, var6, Tiles.field821[var6] * var28, Tiles.field822[var6] * var28, var25, var27);
					}
				}
			}
		} else {
			if (var13 == -1 && var12.transforms == null) {
				var35 = var12.getModel(10, var6, var20, var22, var21, var23);
			} else {
				var35 = new DynamicObject(var0, var5, 10, var6, var2, var3, var4, var13, var12.boolean3, var10);
			}

			if (var35 != null) {
				var24.method5168(var1, var3, var4, var21, var14, var15, (Renderable)var35, var7 == 11 ? 256 : 0, var25, var27);
			}

			if (var12.interactType != 0 && var9 != null) {
				var9.addGameObject(var3, var4, var14, var15, var12.boolean1);
			}

		}
	}
}
