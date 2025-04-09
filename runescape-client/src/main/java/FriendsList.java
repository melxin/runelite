import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ss")
@Implements("FriendsList")
public class FriendsList extends UserList {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Luw;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lqk;"
	)
	@Export("friendLoginUpdates")
	public LinkDeque friendLoginUpdates;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 763143211
	)
	int field5113;

	@ObfuscatedSignature(
		descriptor = "(Luw;)V"
	)
	public FriendsList(LoginType var1) {
		super(400);
		this.friendLoginUpdates = new LinkDeque();
		this.field5113 = 1;
		this.loginType = var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lsh;",
		garbageValue = "-1223410224"
	)
	@Export("newInstance")
	User newInstance() {
		return new Friend();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)[Lsh;",
		garbageValue = "11"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new Friend[var1];
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lwp;ZI)Z",
		garbageValue = "-1817919781"
	)
	@Export("isFriended")
	public boolean isFriended(Username var1, boolean var2) {
		Friend var3 = (Friend)this.getByUsername(var1);
		if (var3 == null) {
			return false;
		} else {
			return !var2 || var3.world != 0;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lve;IB)V",
		garbageValue = "-1"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		while (true) {
			if (var1.offset * -2066221813 < var2) {
				boolean var3 = var1.readUnsignedByte() == 1;
				Username var4 = new Username(var1.readStringCp1252NullTerminated(), this.loginType);
				Username var5 = new Username(var1.readStringCp1252NullTerminated(), this.loginType);
				int var6 = var1.readUnsignedShort();
				int var7 = var1.readUnsignedByte();
				int var8 = var1.readUnsignedByte();
				boolean var9 = (var8 & 2) != 0;
				boolean var10 = (var8 & 1) != 0;
				if (var6 > 0) {
					var1.readStringCp1252NullTerminated();
					var1.readUnsignedByte();
					var1.readInt();
				}

				var1.readStringCp1252NullTerminated();
				if (var4 != null && var4.hasCleanName()) {
					Friend var11 = (Friend)this.getByCurrentUsername(var4);
					if (var3) {
						Friend var12 = (Friend)this.getByCurrentUsername(var5);
						if (var12 != null && var11 != var12) {
							if (var11 != null) {
								this.remove(var12);
							} else {
								var11 = var12;
							}
						}
					}

					if (var11 != null) {
						this.changeName(var11, var4, var5);
						if (var6 != var11.world) {
							boolean var14 = true;

							for (FriendLoginUpdate var13 = (FriendLoginUpdate)this.friendLoginUpdates.last(); var13 != null; var13 = (FriendLoginUpdate)this.friendLoginUpdates.previous()) {
								if (var13.username.equals(var4)) {
									if (var6 != 0 && var13.world == 0) {
										var13.remove();
										var14 = false;
									} else if (var6 == 0 && var13.world != 0) {
										var13.remove();
										var14 = false;
									}
								}
							}

							if (var14) {
								this.friendLoginUpdates.addFirst(new FriendLoginUpdate(var4, var6));
							}
						}
					} else {
						if (this.getSize() >= 400) {
							continue;
						}

						var11 = (Friend)this.addLast(var4, var5);
					}

					if (var6 != var11.world) {
						var11.int2 = ++this.field5113 - 1;
						if (var11.world == -1 && var6 == 0) {
							var11.int2 = -(var11.int2 * 16045143) * 1144215399;
						}

						var11.world = var6;
					}

					var11.rank = var7;
					var11.field5125 = var9;
					var11.field5126 = var10;
					continue;
				}

				throw new IllegalStateException();
			}

			this.sort();
			return;
		}
	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "49184"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount;
		class509.topLevelWorldView.scene.cycle = Client.cycle;
		GrandExchangeOfferAgeComparator.method7862();
		WorldView var4 = class509.topLevelWorldView;
		int var8;
		int var9;
		int var12;
		int var13;
		int var16;
		int var17;
		int var18;
		int var20;
		if (Client.field785 > 0) {
			int var5 = Client.field768 * 128;
			Model var6 = PacketWriter.field1464;
			boolean var7 = true;
			var8 = Math.max(384, 2000 - Client.viewportZoom * 2);
			var9 = Client.field696;
			double var10 = (double)Archive.method7679(var5) / 65536.0D;
			var12 = var9 - (int)(var10 * (double)var8);
			var13 = Client.field697;
			var16 = class520.field5298[var5 & 2047];
			double var14 = (double)var16 / 65536.0D;
			var16 = var13 - (int)(var14 * (double)var8);
			var17 = var4.plane;
			var18 = var12 >> 7;
			var20 = var16 >> 7;
			long var21 = LoginPacket.calculateTag(var17, var18, var20, 5, false, -1, var4.id);
			var4.scene.drawEntity(var4.plane, var12, var16, Client.field758, 60, var6, var5, var21, false);
		}

		WorldView var26 = class509.topLevelWorldView;
		int var27 = MenuAction.method2255();
		int var11;
		int var15;
		int var19;
		int var22;
		int var29;
		int var32;
		int var42;
		if (var26 == class509.topLevelWorldView && var27 >= 0 && Client.menu.menuOpcodes[var27] == 60) {
			var42 = Client.menu.menuIdentifiers[var27] * 128;
			Model var28 = class138.field1643;
			boolean var43 = true;
			var29 = Math.max(384, 2000 - Client.viewportZoom * 2);
			var11 = Client.field696;
			double var30 = (double)Archive.method7679(var42) / 65536.0D;
			var32 = var11 - (int)((double)var29 * var30);
			var15 = Client.field697;
			var18 = class520.field5298[var42 & 2047];
			double var33 = (double)var18 / 65536.0D;
			var18 = var15 - (int)((double)var29 * var33);
			var19 = var26.plane;
			var20 = var32 >> 7;
			var22 = var18 >> 7;
			long var23 = LoginPacket.calculateTag(var19, var20, var22, 5, false, -1, var26.id);
			var26.scene.drawEntity(var26.plane, var32, var18, Client.field758, 60, var28, var42, var23, false);
		}

		HorizontalAlignment.method5169(class509.topLevelWorldView);
		WorldView var41 = class509.topLevelWorldView;
		if (Client.combatTargetPlayerIndex >= 0 && var41.players.get((long)Client.combatTargetPlayerIndex) != null) {
			WorldMapRectangle.addPlayerToScene(var41, Client.combatTargetPlayerIndex, false);
		}

		Actor.method2699(class509.topLevelWorldView, class386.TOKEN);
		Actor.method2699(class509.topLevelWorldView, class386.field4571);
		class477.addNpcsToScene(class509.topLevelWorldView, true);
		class92.method2494(class509.topLevelWorldView);
		class477.addNpcsToScene(class509.topLevelWorldView, false);
		class280.method5892(class509.topLevelWorldView);
		WorldMapDecorationType.method7541(class509.topLevelWorldView);
		Actor.method2699(class509.topLevelWorldView, class386.field4570);
		HttpRequest.setViewportShape(var0, var1, var2, var3, true);
		var0 = Client.viewportOffsetX;
		var1 = Client.viewportOffsetY;
		var2 = Client.viewportWidth;
		var3 = Client.viewportHeight;
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
		Rasterizer3D.resetRasterClipping();
		Rasterizer2D.clearBrightness();
		var42 = Client.camAngleX;
		if (Client.field675 / 256 > var42) {
			var42 = Client.field675 / 256;
		}

		if (Client.field686[4] && Client.field784[4] + 128 > var42) {
			var42 = Client.field784[4] + 128;
		}

		var8 = Client.camAngleY & 2047;
		var9 = ReflectionCheck.oculusOrbFocalPointX;
		var29 = class165.oculusOrbFocalPointZ;
		var11 = KeyHandler.oculusOrbFocalPointY;
		var12 = class4.method19(var42);
		var12 = RestClientThreadFactory.method203(var12, var3);
		var13 = 2048 - var42 & 2047;
		var32 = 2048 - var8 & 2047;
		var15 = 0;
		var16 = 0;
		var17 = var12;
		if (var13 != 0) {
			var18 = Rasterizer3D.Rasterizer3D_sine[var13];
			var19 = Rasterizer3D.Rasterizer3D_cosine[var13];
			var20 = var16 * var19 - var18 * var12 >> 16;
			var17 = var16 * var18 + var19 * var12 >> 16;
			var16 = var20;
		}

		if (var32 != 0) {
			var18 = Rasterizer3D.Rasterizer3D_sine[var32];
			var19 = Rasterizer3D.Rasterizer3D_cosine[var32];
			var20 = var17 * var18 + var19 * var15 >> 16;
			var17 = var17 * var19 - var15 * var18 >> 16;
			var15 = var20;
		}

		if (Client.isCameraLocked) {
			AddRequestTask.field5021 = var9 - var15;
			Projection.field2196 = var29 - var16;
			AsyncRestClient.field55 = var11 - var17;
			class30.field131 = var42;
			SwapSongTask.field5023 = var8;
		} else {
			MusicPatchNode2.cameraX = var9 - var15;
			TaskHandler.cameraY = var29 - var16;
			SceneTilePaint.cameraZ = var11 - var17;
			class258.cameraPitch = var42;
			AsyncHttpResponse.cameraYaw = var8;
		}

		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (ReflectionCheck.oculusOrbFocalPointX >> 7 != Script.localPlayer.x >> 7 || KeyHandler.oculusOrbFocalPointY >> 7 != Script.localPlayer.y >> 7)) {
			var18 = Script.localPlayer.plane;
			var19 = (ReflectionCheck.oculusOrbFocalPointX >> 7) + class509.topLevelWorldView.baseX;
			var20 = (KeyHandler.oculusOrbFocalPointY >> 7) + class509.topLevelWorldView.baseY;
			PacketBufferNode var36 = FloorDecoration.getPacketBufferNode(ClientPacket.TELEPORT, Client.packetWriter.isaacCipher);
			var36.packetBuffer.writeShortAdd(var20);
			var36.packetBuffer.writeByteAdd(var18);
			var36.packetBuffer.writeIntME(Client.revision);
			var36.packetBuffer.writeShortLE(var19);
			Client.packetWriter.addNode(var36);
		}

		int var24;
		int var25;
		int var35;
		int var37;
		if (!Client.isCameraLocked) {
			if (Renderable.clientPreferences.isRoofsHidden()) {
				var32 = class509.topLevelWorldView.plane;
			} else {
				label433: {
					var15 = 3;
					var16 = Client.field696 >> 7;
					var17 = Client.field697 >> 7;
					if (class258.cameraPitch < 310) {
						label429: {
							if (Client.oculusOrbState == 1) {
								var18 = ReflectionCheck.oculusOrbFocalPointX >> 7;
								var19 = KeyHandler.oculusOrbFocalPointY >> 7;
							} else {
								var18 = var16;
								var19 = var17;
							}

							var20 = MusicPatchNode2.cameraX >> 7;
							var35 = SceneTilePaint.cameraZ >> 7;
							if (var20 >= 0 && 104 > var20 && var35 >= 0 && 104 > var35) {
								if (var18 >= 0 && 104 > var18 && var19 >= 0 && 104 > var19) {
									if ((class509.topLevelWorldView.tileSettings[class509.topLevelWorldView.plane][var20][var35] & 4) != 0) {
										var15 = class509.topLevelWorldView.plane;
									}

									if (var18 > var20) {
										var22 = var18 - var20;
									} else {
										var22 = var20 - var18;
									}

									if (var19 > var35) {
										var37 = var19 - var35;
									} else {
										var37 = var35 - var19;
									}

									if (var22 > var37) {
										var24 = var37 * 65536 / var22;
										var25 = 32768;

										while (true) {
											if (var20 == var18) {
												break label429;
											}

											if (var20 < var18) {
												++var20;
											} else if (var20 > var18) {
												--var20;
											}

											if ((class509.topLevelWorldView.tileSettings[class509.topLevelWorldView.plane][var20][var35] & 4) != 0) {
												var15 = class509.topLevelWorldView.plane;
											}

											var25 += var24;
											if (var25 >= 65536) {
												var25 -= 65536;
												if (var35 < var19) {
													++var35;
												} else if (var35 > var19) {
													--var35;
												}

												if ((class509.topLevelWorldView.tileSettings[class509.topLevelWorldView.plane][var20][var35] & 4) != 0) {
													var15 = class509.topLevelWorldView.plane;
												}
											}
										}
									} else {
										if (var37 > 0) {
											var24 = var22 * 65536 / var37;
											var25 = 32768;

											while (var35 != var19) {
												if (var35 < var19) {
													++var35;
												} else if (var35 > var19) {
													--var35;
												}

												if ((class509.topLevelWorldView.tileSettings[class509.topLevelWorldView.plane][var20][var35] & 4) != 0) {
													var15 = class509.topLevelWorldView.plane;
												}

												var25 += var24;
												if (var25 >= 65536) {
													var25 -= 65536;
													if (var20 < var18) {
														++var20;
													} else if (var20 > var18) {
														--var20;
													}

													if ((class509.topLevelWorldView.tileSettings[class509.topLevelWorldView.plane][var20][var35] & 4) != 0) {
														var15 = class509.topLevelWorldView.plane;
													}
												}
											}
										}
										break label429;
									}
								}

								var32 = class509.topLevelWorldView.plane;
								break label433;
							}

							var32 = class509.topLevelWorldView.plane;
							break label433;
						}
					}

					if (var16 >= 0 && 104 > var16 && var17 >= 0 && 104 > var17) {
						if ((class509.topLevelWorldView.tileSettings[class509.topLevelWorldView.plane][var16][var17] & 4) != 0) {
							var15 = class509.topLevelWorldView.plane;
						}

						var32 = var15;
					} else {
						var32 = class509.topLevelWorldView.plane;
					}
				}
			}

			var13 = var32;
		} else {
			var13 = ItemContainer.method2459();
		}

		var32 = MusicPatchNode2.cameraX;
		var15 = TaskHandler.cameraY;
		var16 = SceneTilePaint.cameraZ;
		var17 = class258.cameraPitch;
		var18 = AsyncHttpResponse.cameraYaw;

		for (var19 = 0; var19 < 5; ++var19) {
			if (Client.field686[var19]) {
				var20 = (int)(Math.random() * (double)(Client.field783[var19] * 2 + 1) - (double)Client.field783[var19] + Math.sin((double)Client.field786[var19] * ((double)Client.field550[var19] / 100.0D)) * (double)Client.field784[var19]);
				if (var19 == 0) {
					MusicPatchNode2.cameraX += var20;
				}

				if (var19 == 1) {
					TaskHandler.cameraY += var20;
				}

				if (var19 == 2) {
					SceneTilePaint.cameraZ += var20;
				}

				if (var19 == 3) {
					AsyncHttpResponse.cameraYaw = var20 + AsyncHttpResponse.cameraYaw & 2047;
				}

				if (var19 == 4) {
					class258.cameraPitch += var20;
					if (class258.cameraPitch < 128) {
						class258.cameraPitch = 128;
					}

					if (class258.cameraPitch > 383) {
						class258.cameraPitch = 383;
					}
				}
			}
		}

		var19 = MouseHandler.MouseHandler_x;
		var20 = MouseHandler.MouseHandler_y;
		if (MouseHandler.MouseHandler_lastButton != 0) {
			var19 = MouseHandler.MouseHandler_lastPressedX;
			var20 = MouseHandler.MouseHandler_lastPressedY;
		}

		if (var19 >= var0 && var19 < var0 + var2 && var20 >= var1 && var20 < var3 + var1) {
			ClanSettings.method3615(var19 - var0, var20 - var1);
			Iterator var44 = Client.worldViewManager.iterator();

			while (var44.hasNext()) {
				WorldView var38 = (WorldView)var44.next();
				var38.scene.method4210(var38.plane, var19 - var0, var20 - var1);
			}
		} else {
			ItemContainer.method2457();
		}

		class362.method7337();
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
		class362.method7337();
		var35 = Rasterizer3D.get3dZoom();
		Rasterizer3D.method3865(SecureRandomCallable.client.field176);
		Rasterizer3D.clips.zoom = Client.viewportZoom;
		class173 var45 = Client.field530 == -1 ? class173.field1877 : class173.field1878;
		class509.topLevelWorldView.scene.method4253(var45);
		class509.topLevelWorldView.scene.draw(MusicPatchNode2.cameraX, TaskHandler.cameraY, SceneTilePaint.cameraZ, class258.cameraPitch, AsyncHttpResponse.cameraYaw, var13, Client.field696, Client.field697, Client.isCameraLocked);
		Rasterizer3D.method3865(false);
		if (Client.z) {
			Rasterizer2D.adjustBrightness();
		}

		Rasterizer3D.clips.zoom = var35;
		class362.method7337();
		class509.topLevelWorldView.scene.setViewportWalking();

		WorldEntity var40;
		for (var37 = 0; var37 < class509.topLevelWorldView.field1352.method9060(); ++var37) {
			var40 = (WorldEntity)class509.topLevelWorldView.worldEntities.get((long)class509.topLevelWorldView.field1352.method9056(var37));
			if (var40 != null) {
				var40.worldView.scene.setViewportWalking();
			}
		}

		class214.method4805(class509.topLevelWorldView, var0, var1, var2, var3);

		for (var37 = 0; var37 < class509.topLevelWorldView.field1352.method9060(); ++var37) {
			var40 = (WorldEntity)class509.topLevelWorldView.worldEntities.get((long)class509.topLevelWorldView.field1352.method9056(var37));
			if (var40 != null) {
				class214.method4805(var40.worldView, var0, var1, var2, var3);
			}
		}

		WorldView var39 = class509.topLevelWorldView;
		if (Client.hintArrowType == 2) {
			var24 = Client.hintArrowSubX * 64 + (Client.hintArrowX - var39.baseX << 7);
			var25 = Client.hintArrowSubY * 64 + (Client.hintArrowY - var39.baseY << 7);
			class136.worldToScreen(var39, var24, var25, var24, var25, Client.hintArrowHeight * 2);
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) {
				KeyHandler.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}
		}

		((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).animate(Client.graphicsCycle);
		Client.field808 = 0;
		var24 = (Script.localPlayer.x >> 7) + class509.topLevelWorldView.baseX;
		var25 = (Script.localPlayer.y >> 7) + class509.topLevelWorldView.baseY;
		if (var24 >= 3053 && var24 <= 3156 && var25 >= 3056 && var25 <= 3136) {
			Client.field808 = 1;
		}

		if (var24 >= 3072 && var24 <= 3118 && var25 >= 9492 && var25 <= 9535) {
			Client.field808 = 1;
		}

		if (Client.field808 == 1 && var24 >= 3139 && var24 <= 3199 && var25 >= 3008 && var25 <= 3062) {
			Client.field808 = 0;
		}

		MusicPatchNode2.cameraX = var32;
		TaskHandler.cameraY = var15;
		SceneTilePaint.cameraZ = var16;
		class258.cameraPitch = var17;
		AsyncHttpResponse.cameraYaw = var18;
		if (Client.isLoading && ClanSettings.field1791.method7820(true, false) == 0) {
			Client.isLoading = false;
		}

		if (Client.isLoading) {
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
			NpcOverrides.drawLoadingMessage("Loading - please wait.", false);
		}

	}
}
