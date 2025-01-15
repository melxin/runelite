import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
public class class138 implements Enum {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	static final class138 field1608;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	static final class138 field1606;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	static final class138 field1607;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	static final class138 field1619;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	static final class138 field1617;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	static final class138 field1610;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	static final class138 field1625;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	static final class138 field1612;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	static final class138 field1613;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	static final class138 field1614;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	static final class138 field1615;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	static final class138 field1616;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	static final class138 field1611;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	static final class138 field1618;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	static final class138 field1605;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	static final class138 field1620;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	static final class138 field1621;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -469878497
	)
	final int field1624;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 809633273
	)
	final int field1622;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -293522285
	)
	final int field1623;

	static {
		field1608 = new class138(0, 0, (String)null, -1, -1);
		field1606 = new class138(1, 1, (String)null, 0, 2);
		field1607 = new class138(2, 2, (String)null, 1, 2);
		field1619 = new class138(3, 3, (String)null, 2, 2);
		field1617 = new class138(4, 4, (String)null, 3, 1);
		field1610 = new class138(5, 5, (String)null, 4, 1);
		field1625 = new class138(6, 6, (String)null, 5, 1);
		field1612 = new class138(7, 7, (String)null, 6, 3);
		field1613 = new class138(8, 8, (String)null, 7, 3);
		field1614 = new class138(9, 9, (String)null, 8, 3);
		field1615 = new class138(10, 10, (String)null, 0, 7);
		field1616 = new class138(11, 11, (String)null, 1, 7);
		field1611 = new class138(12, 12, (String)null, 2, 7);
		field1618 = new class138(13, 13, (String)null, 3, 7);
		field1605 = new class138(14, 14, (String)null, 4, 7);
		field1620 = new class138(15, 15, (String)null, 5, 7);
		field1621 = new class138(16, 16, (String)null, 0, 5);
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;II)V",
		garbageValue = "-1"
	)
	class138(int var1, int var2, String var3, int var4, int var5) {
		this.field1624 = var1;
		this.field1622 = var2;
		this.field1623 = var4;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1607362939"
	)
	int method3491() {
		return this.field1623;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "118"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1622;
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "650985830"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount;
		GameEngine.topLevelWorldView.scene.cycle = Client.cycle;
		if (ModeWhere.localPlayer.x >> 7 == Client.destinationX && ModeWhere.localPlayer.y >> 7 == Client.destinationY) {
			Client.destinationX = 0;
		}

		class36.method718(GameEngine.topLevelWorldView);
		WorldView var4 = GameEngine.topLevelWorldView;
		if (Client.renderSelf) {
			class137.addPlayerToScene(var4, Client.localPlayerIndex, false);
		}

		HttpMethod.method79(GameEngine.topLevelWorldView);
		Timer.addNpcsToScene(GameEngine.topLevelWorldView, true);
		WorldView var5 = GameEngine.topLevelWorldView;
		int var6 = Client.playerUpdateManager.playerCount;
		int[] var7 = Client.playerUpdateManager.playerIndices;

		int var8;
		for (var8 = 0; var8 < var6; ++var8) {
			if (var7[var8] != Client.combatTargetPlayerIndex && var7[var8] != Client.localPlayerIndex) {
				class137.addPlayerToScene(var5, var7[var8], true);
			}
		}

		Timer.addNpcsToScene(GameEngine.topLevelWorldView, false);
		WorldView var28 = GameEngine.topLevelWorldView;
		int var29 = 0;

		int var13;
		int var15;
		for (var8 = 0; var8 < var28.worldEntityCount; ++var8) {
			WorldEntity var34 = var28.worldEntities[var28.worldEntityIndices[var8]];
			if (var34 != null) {
				boolean var10 = var34.worldView.id == LoginPacket.field1676;
				if (!var10) {
					boolean var11 = var29 < Client.field794;
					if (!var11) {
						continue;
					}

					++var29;
				}

				var34.worldEntityCoord.setZ(Canvas.getTileHeight(var28, var34.getX(), var34.getY(), var28.plane));
				var34.worldView.scene.cycle = Client.cycle;
				var34.initScenePlane();
				var28.scene.drawEntity(var28.plane, var34.getX(), var34.getY(), var34.getZ(), var34.method9315() / 2, var34.worldView.scene, var34.method9291(), 0L, false);
				WorldView var35 = var34.worldView;
				if (Client.renderSelf) {
					class137.addPlayerToScene(var35, Client.localPlayerIndex, false);
				}

				HttpMethod.method79(var34.worldView);
				Timer.addNpcsToScene(var34.worldView, true);
				WorldView var36 = var34.worldView;
				var13 = Client.playerUpdateManager.playerCount;
				int[] var37 = Client.playerUpdateManager.playerIndices;

				for (var15 = 0; var15 < var13; ++var15) {
					if (var37[var15] != Client.combatTargetPlayerIndex && var37[var15] != Client.localPlayerIndex) {
						class137.addPlayerToScene(var36, var37[var15], true);
					}
				}

				Timer.addNpcsToScene(var34.worldView, false);
				Language.method7980(var34.worldView);
				RestClientThreadFactory.method208(var34.worldView);
			}
		}

		Language.method7980(GameEngine.topLevelWorldView);
		RestClientThreadFactory.method208(GameEngine.topLevelWorldView);
		class143.setViewportShape(var0, var1, var2, var3, true);
		var0 = Client.viewportOffsetX;
		var1 = Client.viewportOffsetY;
		var2 = Client.viewportWidth;
		var3 = Client.viewportHeight;
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
		Rasterizer3D.resetRasterClipping();
		Rasterizer2D.clearBrightness();
		var29 = Client.camAngleX;
		if (Client.field679 / 256 > var29) {
			var29 = Client.field679 / 256;
		}

		if (Client.field571[4] && Client.field690[4] + 128 > var29) {
			var29 = Client.field690[4] + 128;
		}

		var8 = Client.camAngleY & 2047;
		int var9 = VarpDefinition.oculusOrbFocalPointX;
		int var38 = ClientPacket.oculusOrbFocalPointZ;
		int var39 = class7.oculusOrbFocalPointY;
		int var12 = var29 * 3 + 600;
		var13 = Frames.method4471(var12, var3);
		int var14 = 2048 - var29 & 2047;
		var15 = 2048 - var8 & 2047;
		int var16 = 0;
		int var17 = 0;
		int var18 = var13;
		int var19;
		int var20;
		int var21;
		if (var14 != 0) {
			var19 = Rasterizer3D.Rasterizer3D_sine[var14];
			var20 = Rasterizer3D.Rasterizer3D_cosine[var14];
			var21 = var17 * var20 - var19 * var13 >> 16;
			var18 = var17 * var19 + var20 * var13 >> 16;
			var17 = var21;
		}

		if (var15 != 0) {
			var19 = Rasterizer3D.Rasterizer3D_sine[var15];
			var20 = Rasterizer3D.Rasterizer3D_cosine[var15];
			var21 = var18 * var19 + var16 * var20 >> 16;
			var18 = var18 * var20 - var16 * var19 >> 16;
			var16 = var21;
		}

		if (Client.isCameraLocked) {
			HorizontalAlignment.field2603 = var9 - var16;
			PcmPlayer.field275 = var38 - var17;
			class27.field118 = var39 - var18;
			FriendSystem.field830 = var29;
			class340.field3703 = var8;
		} else {
			Buddy.cameraX = var9 - var16;
			Message.cameraY = var38 - var17;
			class31.cameraZ = var39 - var18;
			class159.cameraPitch = var29;
			IntProjection.cameraYaw = var8;
		}

		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (VarpDefinition.oculusOrbFocalPointX >> 7 != ModeWhere.localPlayer.x >> 7 || class7.oculusOrbFocalPointY >> 7 != ModeWhere.localPlayer.y >> 7)) {
			var19 = ModeWhere.localPlayer.plane;
			var20 = (VarpDefinition.oculusOrbFocalPointX >> 7) + GameEngine.topLevelWorldView.baseX;
			var21 = (class7.oculusOrbFocalPointY >> 7) + GameEngine.topLevelWorldView.baseY;
			PacketBufferNode var22 = ScriptEvent.getPacketBufferNode(ClientPacket.TELEPORT, Client.packetWriter.isaacCipher);
			var22.packetBuffer.writeShortAddLE(var20);
			var22.packetBuffer.writeShortAdd(var21);
			var22.packetBuffer.writeIntME(Client.revision);
			var22.packetBuffer.writeByteNeg(var19);
			Client.packetWriter.addNode(var22);
		}

		int var23;
		int var24;
		int var26;
		int var30;
		if (!Client.isCameraLocked) {
			if (class544.clientPreferences.isRoofsHidden()) {
				var15 = GameEngine.topLevelWorldView.plane;
			} else {
				label530: {
					var16 = 3;
					var17 = class53.entity.getX() >> 7;
					var18 = class53.entity.getY() >> 7;
					if (class159.cameraPitch < 310) {
						label519: {
							if (Client.oculusOrbState == 1) {
								var19 = VarpDefinition.oculusOrbFocalPointX >> 7;
								var20 = class7.oculusOrbFocalPointY >> 7;
							} else {
								var19 = var17;
								var20 = var18;
							}

							var21 = Buddy.cameraX >> 7;
							var30 = class31.cameraZ >> 7;
							if (var21 >= 0 && 104 > var21 && var30 >= 0 && 104 > var30) {
								if (var19 >= 0 && 104 > var19 && var20 >= 0 && 104 > var20) {
									if ((GameEngine.topLevelWorldView.tileSettings[GameEngine.topLevelWorldView.plane][var21][var30] & 4) != 0) {
										var16 = GameEngine.topLevelWorldView.plane;
									}

									if (var19 > var21) {
										var23 = var19 - var21;
									} else {
										var23 = var21 - var19;
									}

									if (var20 > var30) {
										var24 = var20 - var30;
									} else {
										var24 = var30 - var20;
									}

									int var25;
									if (var23 > var24) {
										var25 = var24 * 65536 / var23;
										var26 = 32768;

										while (true) {
											if (var19 == var21) {
												break label519;
											}

											if (var21 < var19) {
												++var21;
											} else if (var21 > var19) {
												--var21;
											}

											if ((GameEngine.topLevelWorldView.tileSettings[GameEngine.topLevelWorldView.plane][var21][var30] & 4) != 0) {
												var16 = GameEngine.topLevelWorldView.plane;
											}

											var26 += var25;
											if (var26 >= 65536) {
												var26 -= 65536;
												if (var30 < var20) {
													++var30;
												} else if (var30 > var20) {
													--var30;
												}

												if ((GameEngine.topLevelWorldView.tileSettings[GameEngine.topLevelWorldView.plane][var21][var30] & 4) != 0) {
													var16 = GameEngine.topLevelWorldView.plane;
												}
											}
										}
									} else {
										if (var24 > 0) {
											var25 = var23 * 65536 / var24;
											var26 = 32768;

											while (var30 != var20) {
												if (var30 < var20) {
													++var30;
												} else if (var30 > var20) {
													--var30;
												}

												if ((GameEngine.topLevelWorldView.tileSettings[GameEngine.topLevelWorldView.plane][var21][var30] & 4) != 0) {
													var16 = GameEngine.topLevelWorldView.plane;
												}

												var26 += var25;
												if (var26 >= 65536) {
													var26 -= 65536;
													if (var21 < var19) {
														++var21;
													} else if (var21 > var19) {
														--var21;
													}

													if ((GameEngine.topLevelWorldView.tileSettings[GameEngine.topLevelWorldView.plane][var21][var30] & 4) != 0) {
														var16 = GameEngine.topLevelWorldView.plane;
													}
												}
											}
										}
										break label519;
									}
								}

								var15 = GameEngine.topLevelWorldView.plane;
								break label530;
							}

							var15 = GameEngine.topLevelWorldView.plane;
							break label530;
						}
					}

					if (var17 >= 0 && 104 > var17 && var18 >= 0 && 104 > var18) {
						if ((GameEngine.topLevelWorldView.tileSettings[GameEngine.topLevelWorldView.plane][var17][var18] & 4) != 0) {
							var16 = GameEngine.topLevelWorldView.plane;
						}

						var15 = var16;
					} else {
						var15 = GameEngine.topLevelWorldView.plane;
					}
				}
			}

			var14 = var15;
		} else {
			if (class544.clientPreferences.isRoofsHidden()) {
				var15 = GameEngine.topLevelWorldView.plane;
			} else {
				var16 = Buddy.cameraX >> 7;
				var17 = class31.cameraZ >> 7;
				if (var16 >= 0 && 104 > var16 && var17 >= 0 && 104 > var17) {
					var18 = Canvas.getTileHeight(GameEngine.topLevelWorldView, Buddy.cameraX, class31.cameraZ, GameEngine.topLevelWorldView.plane);
					if (var18 - Message.cameraY < 800 && (GameEngine.topLevelWorldView.tileSettings[GameEngine.topLevelWorldView.plane][var16][var17] & 4) != 0) {
						var15 = GameEngine.topLevelWorldView.plane;
					} else {
						var15 = 3;
					}
				} else {
					var15 = GameEngine.topLevelWorldView.plane;
				}
			}

			var14 = var15;
		}

		var15 = Buddy.cameraX;
		var16 = Message.cameraY;
		var17 = class31.cameraZ;
		var18 = class159.cameraPitch;
		var19 = IntProjection.cameraYaw;

		for (var20 = 0; var20 < 5; ++var20) {
			if (Client.field571[var20]) {
				var21 = (int)(Math.random() * (double)(Client.field764[var20] * 2 + 1) - (double)Client.field764[var20] + Math.sin((double)Client.field768[var20] / 100.0D * (double)Client.field705[var20]) * (double)Client.field690[var20]);
				if (var20 == 0) {
					Buddy.cameraX += var21;
				}

				if (var20 == 1) {
					Message.cameraY += var21;
				}

				if (var20 == 2) {
					class31.cameraZ += var21;
				}

				if (var20 == 3) {
					IntProjection.cameraYaw = var21 + IntProjection.cameraYaw & 2047;
				}

				if (var20 == 4) {
					class159.cameraPitch += var21;
					if (class159.cameraPitch < 128) {
						class159.cameraPitch = 128;
					}

					if (class159.cameraPitch > 383) {
						class159.cameraPitch = 383;
					}
				}
			}
		}

		var20 = MouseHandler.MouseHandler_x;
		var21 = MouseHandler.MouseHandler_y;
		if (MouseHandler.MouseHandler_lastButton != 0) {
			var20 = MouseHandler.MouseHandler_lastPressedX;
			var21 = MouseHandler.MouseHandler_lastPressedY;
		}

		if (var20 >= var0 && var20 < var0 + var2 && var21 >= var1 && var21 < var3 + var1) {
			class154.method3627(var20 - var0, var21 - var1);
			Iterator var40 = Client.worldViewManager.iterator();

			while (var40.hasNext()) {
				WorldView var31 = (WorldView)var40.next();
				var31.scene.method4231(var31.plane, var20 - var0, var21 - var1);
			}
		} else {
			class251.method5359();
		}

		class113.method3178();
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
		class113.method3178();
		var30 = Rasterizer3D.get3dZoom();
		Rasterizer3D.method4017(Client.client.field174);
		Rasterizer3D.clips.zoom = Client.viewportZoom;
		var23 = class53.entity.getX();
		var24 = class53.entity.getY();
		class175 var32 = LoginPacket.field1676 == -1 ? class175.field1837 : class175.field1838;
		GameEngine.topLevelWorldView.scene.method4212(var32);
		GameEngine.topLevelWorldView.scene.draw(Buddy.cameraX, Message.cameraY, class31.cameraZ, class159.cameraPitch, IntProjection.cameraYaw, var14, var23, var24, Client.isCameraLocked);
		Rasterizer3D.method4017(false);
		if (Client.z) {
			Rasterizer2D.adjustBrightness();
		}

		Rasterizer3D.clips.zoom = var30;
		class113.method3178();
		GameEngine.topLevelWorldView.scene.setViewportWalking();

		WorldEntity var33;
		for (var26 = 0; var26 < GameEngine.topLevelWorldView.worldEntityCount; ++var26) {
			var33 = GameEngine.topLevelWorldView.worldEntities[GameEngine.topLevelWorldView.worldEntityIndices[var26]];
			if (var33 != null) {
				var33.worldView.scene.setViewportWalking();
			}
		}

		class151.method3599(GameEngine.topLevelWorldView, var0, var1, var2, var3);

		for (var26 = 0; var26 < GameEngine.topLevelWorldView.worldEntityCount; ++var26) {
			var33 = GameEngine.topLevelWorldView.worldEntities[GameEngine.topLevelWorldView.worldEntityIndices[var26]];
			if (var33 != null) {
				class151.method3599(var33.worldView, var0, var1, var2, var3);
			}
		}

		class355.method7041(GameEngine.topLevelWorldView, var0, var1);
		((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).animate(Client.graphicsCycle);
		Client.field625 = 0;
		var26 = (ModeWhere.localPlayer.x >> 7) + GameEngine.topLevelWorldView.baseX;
		int var27 = (ModeWhere.localPlayer.y >> 7) + GameEngine.topLevelWorldView.baseY;
		if (var26 >= 3053 && var26 <= 3156 && var27 >= 3056 && var27 <= 3136) {
			Client.field625 = 1;
		}

		if (var26 >= 3072 && var26 <= 3118 && var27 >= 9492 && var27 <= 9535) {
			Client.field625 = 1;
		}

		if (Client.field625 == 1 && var26 >= 3139 && var26 <= 3199 && var27 >= 3008 && var27 <= 3062) {
			Client.field625 = 0;
		}

		Buddy.cameraX = var15;
		Message.cameraY = var16;
		class31.cameraZ = var17;
		class159.cameraPitch = var18;
		IntProjection.cameraYaw = var19;
		if (Client.isLoading && HitSplatDefinition.field2760.method7836(true, false) == 0) {
			Client.isLoading = false;
		}

		if (Client.isLoading) {
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
			class328.drawLoadingMessage("Loading - please wait.", false);
		}

	}
}
