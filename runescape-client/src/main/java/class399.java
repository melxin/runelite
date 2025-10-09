import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pt")
public class class399 {
	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(Lok;IIS)V",
		garbageValue = "1000"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) {
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !ObjectComposition.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) {
				SpriteMask var3 = var0.method8091(class35.widgetDefinition, true);
				if (var3 == null) {
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1;
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2;
				if (var3.contains(var4, var5)) {
					var4 -= var3.width / 2;
					var5 -= var3.height / 2;
					int var6 = Client.camAngleY & 2047;
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6];
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6];
					int var9 = var5 * var7 + var4 * var8 >> 11;
					int var10 = var8 * var5 - var7 * var4 >> 11;
					int var11 = var9 + Client.field484 >> 7;
					int var12 = Client.field377 - var10 >> 7;
					class516 var13 = Client.worldViewManager.method2376(-1);
					if (var13 == class516.field5563) {
						HttpRequestTask.method285(var11, var12, var4, var5);
					} else if (var13 == class516.field5564) {
						Client.field565 = class146.method3870(var1, var2, var3);
						Client.field557 = 30;
						HttpRequestTask.method286(Client.field565);
					}
				}
			}

		}
	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(Lmn;I)V",
		garbageValue = "-1184959797"
	)
	static final void method8291(class327 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer;
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		if (class327.field3660 == var0) {
			var2 = var1.readUnsignedIntIME();
			var3 = var1.readUnsignedByte();
			var4 = (var3 >> 4 & 7) + class48.field674;
			var5 = (var3 & 7) + WorldMapRenderer.field3375;
			var6 = var1.readUnsignedShort();
			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				var7 = Client.overheadTextLimit == -1 ? class32.worldView.plane : Client.overheadTextLimit;
				class151.method3917(var7, var4, var5, var6, var2);
			}

		} else {
			int var11;
			int var12;
			int var20;
			int var21;
			if (class327.field3653 == var0) {
				var2 = var1.readInt();
				var3 = var1.readUnsignedShortAdd();
				var4 = var1.readUnsignedShort();
				var5 = var1.readUnsignedByteNeg();
				var6 = var1.readUnsignedByteSub();
				var7 = var1.readUnsignedByteAdd();
				var21 = (var7 >> 4 & 7) + class48.field674;
				var20 = (var7 & 7) + WorldMapRenderer.field3375;
				boolean var33 = var1.readUnsignedByteAdd() == 1;
				var11 = var1.readUnsignedShortAdd();
				if (var21 >= 0 && var20 >= 0 && var21 < class32.worldView.sizeX && var20 < class32.worldView.sizeY) {
					var12 = Client.overheadTextLimit == -1 ? class32.worldView.plane : Client.overheadTextLimit;
					Skills.addTileItemToGroundItems(var12, var21, var20, var3, var2, var6, var11, var4, var5, var33);
				}

			} else if (class327.field3661 == var0) {
				var2 = var1.readUnsignedByteAdd();
				var3 = (var2 >> 4 & 7) + class48.field674;
				var4 = (var2 & 7) + WorldMapRenderer.field3375;
				var5 = var1.readUnsignedByteNeg();
				var6 = var5 >> 2;
				var7 = var5 & 3;
				var21 = Client.field351[var6];
				if (var3 >= 0 && var4 >= 0 && var3 < class32.worldView.sizeX && var4 < class32.worldView.sizeY) {
					var20 = Client.overheadTextLimit == -1 ? class32.worldView.plane : Client.overheadTextLimit;
					WorldEntity.method10263(class32.worldView, var20, var3, var4, var21, -1, var6, var7, 31, (String[])null, 0, -1);
				}

			} else {
				int var10;
				if (class327.field3657 == var0) {
					var2 = var1.readUnsignedShortAddLE();
					var3 = var1.readUnsignedByteNeg();
					var4 = var1.readUnsignedByteAdd() & 31;
					var5 = var1.readUnsignedByteAdd();
					var6 = (var5 >> 4 & 7) + class48.field674;
					var7 = (var5 & 7) + WorldMapRenderer.field3375;
					var21 = var1.readUnsignedByteNeg();
					var20 = var1.readUnsignedByte();
					if (var6 >= 0 && var7 >= 0 && var6 < class32.worldView.sizeX && var7 < class32.worldView.sizeY) {
						var10 = var4 + 1;
						if (class159.localPlayer.pathX[0] >= var6 - var10 && class159.localPlayer.pathX[0] <= var10 + var6 && class159.localPlayer.pathY[0] >= var7 - var10 && class159.localPlayer.pathY[0] <= var10 + var7) {
							class32.method495(class32.worldView.id, var2, var6, var7, var4, var20, var21, var3);
						}
					}

				} else {
					if (class327.field3658 == var0) {
						var2 = var1.readUnsignedShortLE();
						var3 = var1.readUnsignedByteNeg();
						var4 = var1.readUnsignedByteSub();
						var5 = (var4 >> 4 & 7) + class48.field674;
						var6 = (var4 & 7) + WorldMapRenderer.field3375;
						var7 = class32.worldView.plane;
						if (var5 >= 0 && var6 >= 0 && var5 < class32.worldView.sizeX && var6 < class32.worldView.sizeY) {
							NodeDeque var28 = class32.worldView.groundItems[var7][var5][var6];
							if (var28 != null) {
								for (TileItem var30 = (TileItem)var28.last(); var30 != null; var30 = (TileItem)var28.previous()) {
									if ((var2 & 32767) == var30.id) {
										var30.setFlag(var3);
										break;
									}
								}
							}

							if (var5 >= 0 && var6 >= 0 && var5 < class32.worldView.sizeX && var6 < class32.worldView.sizeY) {
								var20 = Client.overheadTextLimit == -1 ? class32.worldView.plane : Client.overheadTextLimit;
								class255.method5920(var20, var5, var6, var2, var3);
							}

							return;
						}
					}

					if (class327.field3659 == var0) {
						var2 = var1.readUnsignedShort();
						var3 = var1.readUnsignedShort();
						var4 = var1.readUnsignedByteSub();
						var5 = var1.readUnsignedByteNeg();
						var6 = (var5 >> 4 & 7) + class48.field674;
						var7 = (var5 & 7) + WorldMapRenderer.field3375;
						if (var6 >= 0 && var7 >= 0 && var6 < class32.worldView.sizeX && var7 < class32.worldView.sizeY) {
							var6 = Coord.method7425(var6);
							var7 = Coord.method7425(var7);
							var21 = Client.overheadTextLimit == -1 ? class32.worldView.plane : Client.overheadTextLimit;
							GraphicsObject var9 = new GraphicsObject(class32.worldView, var3, var21, var6, var7, class280.getTileHeight(class32.worldView, var6, var7, var21) - var4, var2, Client.cycle);
							class32.worldView.graphicsObjects.addFirst(var9);
						}

					} else {
						int var13;
						int var14;
						int var15;
						int var18;
						if (class327.field3655 == var0) {
							var2 = var1.readUnsignedByteNeg();
							var3 = var1.readUnsignedShortLE();
							var4 = var1.method11427();
							var5 = var1.readUnsignedShortAddLE();
							var6 = var1.readUnsignedIntLE();
							var7 = Coord.method7460(var6);
							var21 = Coord.method7421(var6);
							var20 = Coord.method7469(var6);
							var10 = var1.readUnsignedShortAdd();
							var11 = var1.readUnsignedShortAdd();
							var12 = var1.method11427();
							var13 = var1.readUnsignedByteNeg();
							var14 = class32.worldView.plane;
							var15 = (var13 >> 4 & 7) + class48.field674 + class32.worldView.baseX;
							int var35 = (var13 & 7) + WorldMapRenderer.field3375 + class32.worldView.baseY;
							int var25 = var1.readUnsignedShortLE();
							var18 = var1.readUnsignedShort();
							if (var18 != 65535) {
								Projectile var19 = new Projectile(var14, var15, var35, var11, var12, var7, var21, var20, var3, var4, var18, var25 + Client.cycle, var5 + Client.cycle, var2, var10);
								Client.projectiles.addFirst(var19);
							}

						} else if (class327.field3654 == var0) {
							var2 = var1.readInt();
							var3 = var1.readUnsignedByteAdd();
							var4 = (var3 >> 4 & 7) + class48.field674;
							var5 = (var3 & 7) + WorldMapRenderer.field3375;
							var6 = var1.readUnsignedShortAddLE();
							var7 = class32.worldView.plane;
							if (0 <= var4 && var4 < 104 && 0 <= var5 && var5 < 104) {
								var21 = Client.overheadTextLimit == -1 ? var7 : Client.overheadTextLimit;
								class46.method1844(var21, var4, var5, var6, var2);
							}

						} else if (class327.field3663 != var0) {
							if (class327.field3662 == var0) {
								var2 = var1.readUnsignedShort();
								var3 = var1.readUnsignedIntIME();
								var4 = var1.readInt();
								var5 = var1.readUnsignedByteNeg();
								var6 = (var5 >> 4 & 7) + class48.field674;
								var7 = (var5 & 7) + WorldMapRenderer.field3375;
								if (var6 >= 0 && var7 >= 0 && var6 < class32.worldView.sizeX && var7 < class32.worldView.sizeY) {
									var21 = Client.overheadTextLimit == -1 ? class32.worldView.plane : Client.overheadTextLimit;
									class198.method4466(var21, var6, var7, var2, var4, var3);
								}

							} else if (class327.field3664 == var0) {
								var2 = var1.readUnsignedShortAdd();
								var3 = var1.readUnsignedShortAddLE();
								var4 = var1.readUnsignedByteSub();
								var5 = (var4 >> 4 & 7) + class48.field674;
								var6 = (var4 & 7) + WorldMapRenderer.field3375;
								short var29 = (short)var1.method4934();
								var21 = var1.readShort();
								var20 = var1.readUnsignedIntME();
								short var32 = (short)var1.readShortLE();
								var11 = var1.readShort();
								if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
									var12 = Client.overheadTextLimit == -1 ? class32.worldView.plane : Client.overheadTextLimit;
									class27.method441(var12, var5, var6, var2, var20, var32, var21, var29, var11, var3);
								}

							} else {
								if (class327.field3652 == var0) {
									var2 = var1.readUnsignedShortAdd();
									byte var26 = var1.readByteAdd();
									byte var27 = var1.readByteSub();
									var5 = var1.readUnsignedByteSub();
									var6 = (var5 >> 4 & 7) + class48.field674;
									var7 = (var5 & 7) + WorldMapRenderer.field3375;
									var21 = var1.readUnsignedShortLE();
									var20 = var1.readUnsignedShortAddLE();
									byte var31 = var1.readByte();
									var11 = var1.readUnsignedByteAdd();
									var12 = var11 >> 2;
									var13 = var11 & 3;
									var14 = Client.field351[var12];
									var15 = var1.readUnsignedShortAdd();
									byte var16 = var1.readByteNeg();
									Player var17;
									if (var21 == Client.localPlayerIndex) {
										var17 = class159.localPlayer;
									} else {
										var17 = (Player)class32.worldView.players.get((long)var21);
									}

									if (var17 != null) {
										var18 = Client.overheadTextLimit == -1 ? class32.worldView.plane : Client.overheadTextLimit;
										class107.method3442(var18, var6, var7, var12, var13, var14, var20, var2, var15, var31, var27, var16, var26, var17);
									}
								}

								if (class327.field3656 == var0) {
									var2 = var1.readUnsignedShortAddLE();
									var3 = var1.readUnsignedByteAdd();
									var4 = var3 >> 2;
									var5 = var3 & 3;
									var6 = Client.field351[var4];
									var7 = var1.readUnsignedByteNeg();
									var21 = (var7 >> 4 & 7) + class48.field674;
									var20 = (var7 & 7) + WorldMapRenderer.field3375;
									if (0 <= var21 && var21 < 103 && 0 <= var20 && var20 < 103) {
										var10 = Client.overheadTextLimit == -1 ? class32.worldView.plane : Client.overheadTextLimit;
										PendingSpawn var22 = class416.method8555(class32.worldView, var10, var21, var20, var6);
										if (var22 != null) {
											ObjectComposition var23 = TileItem.getObjectDefinition(var22.field1025);
											if (var23.field2333) {
												UserComparator6.method3659(var10, var21, var20, var4, var5, var6, var2);
												var22.field1009 = var2;
												return;
											}
										}

										boolean var34 = UserComparator6.method3659(var10, var21, var20, var4, var5, var6, var2);
										if (var34) {
											return;
										}

										if (var22 != null) {
											var22.field1009 = var2;
										}
									}

								}
							}
						} else {
							var2 = var1.readUnsignedByteNeg();
							var3 = var1.readUnsignedShort();
							var4 = var1.readUnsignedByteNeg();
							String[] var24 = null;
							if (var4 > 0) {
								var24 = new String[5];

								for (var6 = 0; var6 < var4; ++var6) {
									var7 = var1.readUnsignedByte();
									String var8 = var1.readStringCp1252NullTerminated();
									if (var7 >= 0 && var7 < 5) {
										var24[var7] = var8;
									}
								}
							}

							var6 = var1.readUnsignedByteSub();
							var7 = var6 >> 2;
							var21 = var6 & 3;
							var20 = Client.field351[var7];
							var10 = var1.readUnsignedByteAdd();
							var11 = (var10 >> 4 & 7) + class48.field674;
							var12 = (var10 & 7) + WorldMapRenderer.field3375;
							if (var11 >= 0 && var12 >= 0 && var11 < class32.worldView.sizeX && var12 < class32.worldView.sizeY) {
								var13 = Client.overheadTextLimit == -1 ? class32.worldView.plane : Client.overheadTextLimit;
								WorldEntity.method10263(class32.worldView, var13, var11, var12, var20, var3, var7, var21, var2, var24, 0, -1);
							}

						}
					}
				}
			}
		}
	}
}
