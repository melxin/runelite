import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fj")
public class class150 extends class151 {
	@ObfuscatedName("ld")
	@ObfuscatedGetter(
		intValue = 550365507
	)
	static int field1757;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -2060802931
	)
	int field1758;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfc;"
	)
	final class154 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfc;)V"
	)
	class150(class154 var1) {
		this.this$0 = var1;
		this.field1758 = -1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxa;B)V",
		garbageValue = "-11"
	)
	void vmethod4235(Buffer var1) {
		this.field1758 = var1.readUnsignedShort();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lgs;B)V",
		garbageValue = "-98"
	)
	void vmethod4241(ClanSettings var1) {
		var1.method4052(this.field1758);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Lis;",
		garbageValue = "-1561767584"
	)
	@Export("ItemDefinition_get")
	public static ItemComposition ItemDefinition_get(int var0) {
		ItemComposition var1 = (ItemComposition)ItemComposition.ItemDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class138.ItemDefinition_archive.takeFile(10, var0);
			var1 = new ItemComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.post();
			if (var1.noteTemplate != -1) {
				var1.genCert(ItemDefinition_get(var1.noteTemplate), ItemDefinition_get(var1.note));
			}

			if (var1.notedId != -1) {
				var1.genBought(ItemDefinition_get(var1.notedId), ItemDefinition_get(var1.unnotedId));
			}

			if (var1.placeholderTemplate != -1) {
				var1.genPlaceholder(ItemDefinition_get(var1.placeholderTemplate), ItemDefinition_get(var1.placeholder));
			}

			if (!TileItem.ItemDefinition_inMembersWorld && var1.isMembersOnly) {
				if (var1.noteTemplate == -1 && var1.notedId == -1 && var1.placeholderTemplate == -1) {
					var1.name = var1.name + " (Members)";
				}

				var1.examine = "Login to a members' server to use this object.";
				var1.isTradable = false;

				int var3;
				for (var3 = 0; var3 < var1.groundActions.length; ++var3) {
					var1.groundActions[var3] = null;
				}

				for (var3 = 0; var3 < var1.inventoryActions.length; ++var3) {
					if (var3 != 4) {
						if (var1.subOps != null) {
							var1.subOps[var3] = null;
						}

						var1.inventoryActions[var3] = null;
					}
				}

				var1.shiftClickIndex = -2;
				var1.team = 0;
				if (var1.params != null) {
					boolean var6 = false;

					for (Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) {
						ParamComposition var5 = WorldMap.getParamDefinition((int)var4.key);
						if (var5.autoDisable) {
							var4.remove();
						} else {
							var6 = true;
						}
					}

					if (!var6) {
						var1.params = null;
					}
				}
			}

			ItemComposition.ItemDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "(Ldd;IIIIIIIII)V",
		garbageValue = "-1704342885"
	)
	@Export("addPendingSpawnToScene")
	static final void addPendingSpawnToScene(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Scene var9 = var0.scene;
		if (var3 >= 1 && var4 >= 1 && var3 <= var0.sizeX - 2 && var4 <= var0.sizeY - 2) {
			if (Client.isLowDetail && var0.plane != var1) {
				return;
			}

			Renderable var10 = null;
			Renderable var11 = null;
			int var12 = -1;
			long var13 = 0L;
			boolean var15 = false;
			boolean var16 = false;
			if (var2 == 0) {
				var13 = var9.getBoundaryObjectTag(var1, var3, var4);
			}

			if (var2 == 1) {
				var13 = var9.getWallDecorationTag(var1, var3, var4);
			}

			if (var2 == 2) {
				var13 = var9.getGameObjectTag(var1, var3, var4);
			}

			if (var2 == 3) {
				var13 = var9.getFloorDecorationTag(var1, var3, var4);
			}

			int var17;
			if (0L != var13) {
				var17 = var9.getObjectFlags(var1, var3, var4, var13);
				var12 = HorizontalAlignment.Entity_unpackID(var13);
				int var44 = var17 & 31;
				int var45 = var17 >> 6 & 3;
				ObjectComposition var18 = AsyncHttpResponse.getObjectDefinition(var12);
				var0.method2773(var1, var3, var4, var18, var45);
				if (var2 == 0) {
					BoundaryObject var19 = var9.getBoundaryObject(var1, var3, var4);
					var10 = var19.renderable1;
					var11 = var19.renderable2;
					var9.removeBoundaryObject(var1, var3, var4);
					if (var18.interactType != 0) {
						var0.collisionMaps[var1].method6345(var3, var4, var44, var45, var18.boolean1);
					}
				}

				if (var2 == 1) {
					WallDecoration var47 = var9.getWallDecoration(var1, var3, var4);
					var10 = var47.renderable1;
					var11 = var47.renderable2;
					var9.removeWallDecoration(var1, var3, var4);
				}

				if (var2 == 2) {
					var10 = var9.getGameObject(var1, var3, var4).renderable;
					var9.removeGameObject(var1, var3, var4);
					if (var3 + var18.sizeX > var0.sizeX - 1 || var4 + var18.sizeX > var0.sizeY - 1 || var3 + var18.sizeY > var0.sizeX - 1 || var4 + var18.sizeY > var0.sizeY - 1) {
						return;
					}

					if (var18.interactType != 0) {
						var0.collisionMaps[var1].setFlagOffNonSquare(var3, var4, var18.sizeX, var18.sizeY, var45, var18.boolean1);
					}
				}

				if (var2 == 3) {
					var10 = var9.getFloorDecoration(var1, var3, var4).renderable;
					var9.removeFloorDecoration(var1, var3, var4);
					if (var18.interactType == 1) {
						var0.collisionMaps[var1].method6347(var3, var4);
					}
				}
			}

			if (var5 >= 0) {
				var17 = var1;
				if (var1 < 3 && (var0.tileSettings[1][var3][var4] & 2) == 2) {
					var17 = var1 + 1;
				}

				if (var5 != var12) {
					var10 = null;
					var11 = null;
				}

				CollisionMap var46 = var0.collisionMaps[var1];
				ObjectComposition var48 = AsyncHttpResponse.getObjectDefinition(var5);
				int var20 = var8 >= 0 ? var8 : var48.animationId;
				int var21;
				int var22;
				if (var6 != 1 && var6 != 3) {
					var21 = var48.sizeX;
					var22 = var48.sizeY;
				} else {
					var21 = var48.sizeY;
					var22 = var48.sizeX;
				}

				int var23;
				int var24;
				if (var3 + var21 <= var0.sizeX) {
					var23 = var3 + (var21 >> 1);
					var24 = var3 + (var21 + 1 >> 1);
				} else {
					var23 = var3;
					var24 = var3 + 1;
				}

				int var25;
				int var26;
				if (var22 + var4 <= var0.sizeY) {
					var25 = (var22 >> 1) + var4;
					var26 = var4 + (var22 + 1 >> 1);
				} else {
					var25 = var4;
					var26 = var4 + 1;
				}

				int[][] var27 = var0.tileHeights[var17];
				int var28 = var27[var24][var26] + var27[var23][var26] + var27[var24][var25] + var27[var23][var25] >> 2;
				int var29 = (var3 << 7) + (var21 << 6);
				int var30 = (var4 << 7) + (var22 << 6);
				Scene var31 = var0.scene;
				long var32 = class236.calculateTag(var1, var3, var4, 2, var48.int1 == 0, var5, var0.id);
				int var34 = (var6 << 6) + var7;
				if (var48.int3 == 1) {
					var34 += 256;
				}

				Object var42;
				if (var7 == 22) {
					if (var20 == -1 && var48.transforms == null) {
						var42 = var48.getModel(22, var6, var27, var29, var28, var30);
					} else {
						var42 = new DynamicObject(var0, var5, 22, var6, var17, var3, var4, var20, var48.boolean3, var10);
					}

					var31.newFloorDecoration(var1, var3, var4, var28, (Renderable)var42, var32, var34);
					if (var48.interactType == 1 && var46 != null) {
						var46.setBlockedByFloorDec(var3, var4);
					}
				} else if (var7 != 10 && var7 != 11) {
					if (var7 >= 12) {
						if (var20 == -1 && var48.transforms == null) {
							var42 = var48.getModel(var7, var6, var27, var29, var28, var30);
						} else {
							var42 = new DynamicObject(var0, var5, var7, var6, var17, var3, var4, var20, var48.boolean3, var10);
						}

						var31.method5564(var1, var3, var4, var28, 1, 1, (Renderable)var42, 0, var32, var34);
						if (var48.interactType != 0 && var46 != null) {
							var46.addGameObject(var3, var4, var21, var22, var48.boolean1);
						}
					} else if (var7 == 0) {
						if (var20 == -1 && var48.transforms == null) {
							var42 = var48.getModel(0, var6, var27, var29, var28, var30);
						} else {
							var42 = new DynamicObject(var0, var5, 0, var6, var17, var3, var4, var20, var48.boolean3, var10);
						}

						var31.newBoundaryObject(var1, var3, var4, var28, (Renderable)var42, (Renderable)null, Tiles.field800[var6], 0, var32, var34);
						if (var48.interactType != 0 && var46 != null) {
							var46.method6340(var3, var4, var7, var6, var48.boolean1);
						}
					} else if (var7 == 1) {
						if (var20 == -1 && var48.transforms == null) {
							var42 = var48.getModel(1, var6, var27, var29, var28, var30);
						} else {
							var42 = new DynamicObject(var0, var5, 1, var6, var17, var3, var4, var20, var48.boolean3, var10);
						}

						var31.newBoundaryObject(var1, var3, var4, var28, (Renderable)var42, (Renderable)null, Tiles.field804[var6], 0, var32, var34);
						if (var48.interactType != 0 && var46 != null) {
							var46.method6340(var3, var4, var7, var6, var48.boolean1);
						}
					} else {
						int var35;
						if (var7 == 2) {
							var35 = var6 + 1 & 3;
							Object var37;
							Object var43;
							if (var20 == -1 && var48.transforms == null) {
								var43 = var48.getModel(2, var6 + 4, var27, var29, var28, var30);
								var37 = var48.getModel(2, var35, var27, var29, var28, var30);
							} else {
								var43 = new DynamicObject(var0, var5, 2, var6 + 4, var17, var3, var4, var20, var48.boolean3, var10);
								var37 = new DynamicObject(var0, var5, 2, var35, var17, var3, var4, var20, var48.boolean3, var11);
							}

							var31.newBoundaryObject(var1, var3, var4, var28, (Renderable)var43, (Renderable)var37, Tiles.field800[var6], Tiles.field800[var35], var32, var34);
							if (var48.interactType != 0 && var46 != null) {
								var46.method6340(var3, var4, var7, var6, var48.boolean1);
							}
						} else if (var7 == 3) {
							if (var20 == -1 && var48.transforms == null) {
								var42 = var48.getModel(3, var6, var27, var29, var28, var30);
							} else {
								var42 = new DynamicObject(var0, var5, 3, var6, var17, var3, var4, var20, var48.boolean3, var10);
							}

							var31.newBoundaryObject(var1, var3, var4, var28, (Renderable)var42, (Renderable)null, Tiles.field804[var6], 0, var32, var34);
							if (var48.interactType != 0 && var46 != null) {
								var46.method6340(var3, var4, var7, var6, var48.boolean1);
							}
						} else if (var7 == 9) {
							if (var20 == -1 && var48.transforms == null) {
								var42 = var48.getModel(var7, var6, var27, var29, var28, var30);
							} else {
								var42 = new DynamicObject(var0, var5, var7, var6, var17, var3, var4, var20, var48.boolean3, var10);
							}

							var31.method5564(var1, var3, var4, var28, 1, 1, (Renderable)var42, 0, var32, var34);
							if (var48.interactType != 0 && var46 != null) {
								var46.addGameObject(var3, var4, var21, var22, var48.boolean1);
							}
						} else if (var7 == 4) {
							if (var20 == -1 && var48.transforms == null) {
								var42 = var48.getModel(4, var6, var27, var29, var28, var30);
							} else {
								var42 = new DynamicObject(var0, var5, 4, var6, var17, var3, var4, var20, var48.boolean3, var10);
							}

							var31.newWallDecoration(var1, var3, var4, var28, (Renderable)var42, (Renderable)null, Tiles.field800[var6], 0, 0, 0, var32, var34);
						} else {
							long var36;
							Object var38;
							if (var7 == 5) {
								var35 = 16;
								var36 = var31.getBoundaryObjectTag(var1, var3, var4);
								if (var36 != 0L) {
									var35 = AsyncHttpResponse.getObjectDefinition(HorizontalAlignment.Entity_unpackID(var36)).int2;
								}

								if (var20 == -1 && var48.transforms == null) {
									var38 = var48.getModel(4, var6, var27, var29, var28, var30);
								} else {
									var38 = new DynamicObject(var0, var5, 4, var6, var17, var3, var4, var20, var48.boolean3, var10);
								}

								var31.newWallDecoration(var1, var3, var4, var28, (Renderable)var38, (Renderable)null, Tiles.field800[var6], 0, Tiles.field802[var6] * var35, Tiles.field798[var6] * var35, var32, var34);
							} else if (var7 == 6) {
								var35 = 8;
								var36 = var31.getBoundaryObjectTag(var1, var3, var4);
								if (0L != var36) {
									var35 = AsyncHttpResponse.getObjectDefinition(HorizontalAlignment.Entity_unpackID(var36)).int2 / 2;
								}

								if (var20 == -1 && var48.transforms == null) {
									var38 = var48.getModel(4, var6 + 4, var27, var29, var28, var30);
								} else {
									var38 = new DynamicObject(var0, var5, 4, var6 + 4, var17, var3, var4, var20, var48.boolean3, var10);
								}

								var31.newWallDecoration(var1, var3, var4, var28, (Renderable)var38, (Renderable)null, 256, var6, Tiles.field803[var6] * var35, Tiles.field805[var6] * var35, var32, var34);
							} else if (var7 == 7) {
								int var41 = var6 + 2 & 3;
								if (var20 == -1 && var48.transforms == null) {
									var42 = var48.getModel(4, var41 + 4, var27, var29, var28, var30);
								} else {
									var42 = new DynamicObject(var0, var5, 4, var41 + 4, var17, var3, var4, var20, var48.boolean3, var10);
								}

								var31.newWallDecoration(var1, var3, var4, var28, (Renderable)var42, (Renderable)null, 256, var41, 0, 0, var32, var34);
							} else if (var7 == 8) {
								var35 = 8;
								var36 = var31.getBoundaryObjectTag(var1, var3, var4);
								if (var36 != 0L) {
									var35 = AsyncHttpResponse.getObjectDefinition(HorizontalAlignment.Entity_unpackID(var36)).int2 / 2;
								}

								int var40 = var6 + 2 & 3;
								Object var39;
								if (var20 == -1 && var48.transforms == null) {
									var38 = var48.getModel(4, var6 + 4, var27, var29, var28, var30);
									var39 = var48.getModel(4, var40 + 4, var27, var29, var28, var30);
								} else {
									var38 = new DynamicObject(var0, var5, 4, var6 + 4, var17, var3, var4, var20, var48.boolean3, var10);
									var39 = new DynamicObject(var0, var5, 4, var40 + 4, var17, var3, var4, var20, var48.boolean3, var11);
								}

								var31.newWallDecoration(var1, var3, var4, var28, (Renderable)var38, (Renderable)var39, 256, var6, Tiles.field803[var6] * var35, Tiles.field805[var6] * var35, var32, var34);
							}
						}
					}
				} else {
					if (var20 == -1 && var48.transforms == null) {
						var42 = var48.getModel(10, var6, var27, var29, var28, var30);
					} else {
						var42 = new DynamicObject(var0, var5, 10, var6, var17, var3, var4, var20, var48.boolean3, var10);
					}

					if (var42 != null) {
						var31.method5564(var1, var3, var4, var28, var21, var22, (Renderable)var42, var7 == 11 ? 256 : 0, var32, var34);
					}

					if (var48.interactType != 0 && var46 != null) {
						var46.addGameObject(var3, var4, var21, var22, var48.boolean1);
					}
				}

				var48 = AsyncHttpResponse.getObjectDefinition(var5);
				if (var48 != null && var48.hasSound()) {
					var0.createObjectSound(var17, var3, var4, var48, var6);
				}
			}
		}

	}

	@ObfuscatedName("md")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIB)V",
		garbageValue = "94"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (class226.widgetDefinition.loadInterface(var0)) {
			class66.field882 = null;
			class40.drawInterface(class226.widgetDefinition.Widget_interfaceComponents[var0], 0, class226.widgetDefinition.Widget_interfaceComponents[var0].length - 1, -1, -1, var1, var2, var3, var4, var5, var6, var7);
			if (class66.field882 != null) {
				class40.drawInterface(class66.field882, 0, class66.field882.length - 1, -1412584499, -1412584499, var1, var2, var3, var4, DevicePcmPlayerProvider.field88, UserComparator3.field1560, var7);
				class66.field882 = null;
			}

		} else {
			if (var7 != -1) {
				Client.validRootWidgets[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) {
					Client.validRootWidgets[var8] = true;
				}
			}

		}
	}
}
