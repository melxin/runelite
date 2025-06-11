import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("by")
public class class47 {
	@ObfuscatedName("ap")
	final ArrayList field690;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 999856973
	)
	int field682;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	@Export("coord")
	Coord coord;
	@ObfuscatedName("ai")
	byte field686;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("pathTraversed")
	MoveSpeed pathTraversed;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lwt;"
	)
	Buffer field681;
	@ObfuscatedName("aa")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1648344429
	)
	int field688;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1129942131
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 2044314573
	)
	int field683;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1306744753
	)
	@Export("targetIndex")
	int targetIndex;

	class47(int var1) {
		this.field690 = new ArrayList(1);
		this.field682 = 0;
		this.coord = new Coord();
		this.actions = new String[3];
		this.field688 = -1;
		this.orientation = 0;
		this.field683 = -1;
		this.targetIndex = -1;
		this.field688 = var1;

		for (int var2 = 0; var2 < 3; ++var2) {
			this.actions[var2] = "";
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1050850761"
	)
	void method1760() {
		this.field681 = null;
		this.field690.clear();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "15"
	)
	void method1761(int var1) {
		this.field682 = var1;
		this.orientation = 0;
		this.field683 = -1;
		this.targetIndex = -1;
		this.field686 = 0;
		this.pathTraversed = MoveSpeed.field3118;
		this.field681 = null;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lcp;B)V",
		garbageValue = "0"
	)
	void method1762(Player var1) {
		this.field690.add(var1);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lcp;I)V",
		garbageValue = "887713908"
	)
	void method1763(Player var1) {
		this.field690.remove(var1);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-352866"
	)
	void method1764() {
		this.field690.clear();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILdl;I)Lcp;",
		garbageValue = "-609131142"
	)
	Player method1765(int var1, WorldView var2) {
		Player var3 = new Player(var1);
		if (this.field681 != null) {
			var3.read(this.field681);
		}

		var3.orientation = this.orientation;
		var3.targetIndex = this.targetIndex;
		var3.pathTraversed[0] = this.pathTraversed;
		var3.plane = this.coord.plane;
		var3.worldViewId = var2.id;
		var3.actions = this.actions;
		var3.method2328(this.coord.x - var2.baseX, this.coord.y - var2.baseY);
		return var3;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "718137620"
	)
	boolean method1766() {
		return this.field682 == -1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1282055829"
	)
	void method1838() {
		this.field682 = this.coord.method7232();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "598499597"
	)
	void method1768(int var1, int var2) {
		this.coord.method7233(this.field682, var1, var2);
		this.field682 = -1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-1"
	)
	int method1769() {
		return this.coord.plane;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-324215022"
	)
	void method1770(int var1) {
		this.coord.plane = var1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lkt;B)V",
		garbageValue = "23"
	)
	void method1817(MoveSpeed var1) {
		for (int var2 = 0; var2 < this.field690.size(); ++var2) {
			Player var3 = (Player)this.field690.get(var2);
			WorldView var4 = var3.getWorldView();
			int var5 = this.coord.x - var4.baseX;
			int var6 = this.coord.y - var4.baseY;
			MoveSpeed var7 = var1;
			boolean var8 = true;
			boolean var9 = true;
			if (var4.id == -1 && this.field688 == Client.field339 && class330.field3670 == class379.USERNAME_PASSWORD && (var3.x < 1536 || var3.y < 1536 || var3.x >= 11776 || var3.y >= 11776)) {
				var7 = MoveSpeed.field3121;
			}

			var3.plane = this.coord.plane;
			if (var7 == MoveSpeed.field3121) {
				var3.method2328(var5, var6);
			} else {
				var3.method2157(var4, var5, var6, var7);
			}
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lwt;I)V",
		garbageValue = "1223234599"
	)
	void method1774(Buffer var1) {
		this.field681 = var1;

		for (int var2 = 0; var2 < this.field690.size(); ++var2) {
			((Player)this.field690.get(var2)).read(this.field681);
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "0"
	)
	void method1773(int var1, int var2) {
		for (int var3 = 0; var3 < this.field690.size(); ++var3) {
			GraphicsObject.performPlayerAnimation((Player)this.field690.get(var3), var1, var2);
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "16"
	)
	void method1828(int var1) {
		this.targetIndex = var1;

		for (int var2 = 0; var2 < this.field690.size(); ++var2) {
			((Actor)this.field690.get(var2)).targetIndex = var1;
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1216371014"
	)
	void method1775(String var1) {
		boolean var2 = var1.charAt(0) == '~';
		if (var2) {
			var1 = var1.substring(1);
		}

		Username var3 = null;

		for (int var4 = 0; var4 < this.field690.size(); ++var4) {
			Player var5 = (Player)this.field690.get(var4);
			var5.field1035 = false;
			var5.field1023 = 0;
			var5.field1055 = 0;
			var5.overheadTextCyclesRemaining = 150;
			var5.overheadText = var1;
			var3 = var5.username;
		}

		if (var3 != null) {
			if (var2 || this.field688 == Client.localPlayerIndex) {
				GrandExchangeOfferWorldComparator.addGameMessage(2, var3.getName(), var1);
			}

		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-1408542083"
	)
	void method1831(int var1, int var2, int var3, int var4, int var5) {
		for (int var6 = 0; var6 < this.field690.size(); ++var6) {
			((Actor)this.field690.get(var6)).addHitSplat(var1, var2, var3, var4, Client.cycle, var5);
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "114"
	)
	void method1777(int var1, int var2, int var3, int var4, int var5) {
		for (int var6 = 0; var6 < this.field690.size(); ++var6) {
			((Actor)this.field690.get(var6)).addHealthBar(var1, Client.cycle, var2, var3, var4, var5);
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "12"
	)
	void method1778(int var1) {
		for (int var2 = 0; var2 < this.field690.size(); ++var2) {
			((Actor)this.field690.get(var2)).removeHealthBar(var1);
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "333665081"
	)
	void method1794(int var1) {
		this.field683 = var1;

		for (int var2 = 0; var2 < this.field690.size(); ++var2) {
			Player var3 = (Player)this.field690.get(var2);
			var3.field1022 = this.field683;
			if (var3.pathLength == 0) {
				var3.orientation = this.field683;
				var3.method2305();
			}
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILpn;ZLjava/lang/String;[BI)V",
		garbageValue = "-347925700"
	)
	void method1780(int var1, PlayerType var2, boolean var3, String var4, byte[] var5) {
		boolean var6 = false;
		String var7 = null;

		int var8;
		for (var8 = 0; var8 < this.field690.size(); ++var8) {
			Player var9 = (Player)this.field690.get(var8);
			if (var9.username != null && var9.appearance != null) {
				boolean var10 = false;
				if (var2.isUser && Actor.friendSystem.isIgnored(var9.username)) {
					var10 = true;
				}

				if (!var10 && Client.field332 == 0 && !var9.isHidden) {
					var6 = true;
					var7 = var9.username.getName();
					var9.overheadText = var4.trim();
					var9.field1023 = var1 >> 8;
					var9.field1055 = var1 & 255;
					var9.overheadTextCyclesRemaining = 150;
					var9.field1056 = TileItem.method2683(var5);
					var9.field1035 = var3;
					var9.field1041 = var9 != class152.localPlayer && var2.isUser && !Client.field431.isEmpty() && var4.toLowerCase().indexOf(Client.field431) == -1;
				}
			}
		}

		if (var6 && var7 != null) {
			if (var2.isPrivileged) {
				var8 = var3 ? 91 : 1;
			} else {
				var8 = var3 ? 90 : 2;
			}

			if (var2.modIcon != -1) {
				GrandExchangeOfferWorldComparator.addGameMessage(var8, TextureProvider.method5483(var2.modIcon) + var7, var4);
			} else {
				GrandExchangeOfferWorldComparator.addGameMessage(var8, var7, var4);
			}
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIB)V",
		garbageValue = "32"
	)
	void method1826(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < this.field690.size(); ++var8) {
			Player var9 = (Player)this.field690.get(var8);
			WorldView var10 = var9.getWorldView();
			int var11 = this.coord.x - var10.baseX;
			int var12 = this.coord.y - var10.baseY;
			var9.field1062 = var11 + var1;
			var9.field1065 = var12 + var2;
			var9.field1070 = var3 + var11;
			var9.field1072 = var12 + var4;
			var9.spotAnimation = var5;
			var9.field1016 = var6;
			var9.field1012 = var7;
			var9.field1048 = 0;
			var9.resetPath(var9.field1070, var9.field1072);
			var9.plane = this.coord.plane;
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;I)V",
		garbageValue = "-822744509"
	)
	void method1782(String[] var1) {
		this.actions = (String[])((String[])Arrays.copyOf(var1, var1.length));

		for (int var2 = 0; var2 < this.field690.size(); ++var2) {
			((Player)this.field690.get(var2)).actions = (String[])((String[])Arrays.copyOf(var1, var1.length));
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIBBBBI)V",
		garbageValue = "-221475203"
	)
	void method1783(int var1, int var2, byte var3, byte var4, byte var5, byte var6) {
		for (int var7 = 0; var7 < this.field690.size(); ++var7) {
			Player var8 = (Player)this.field690.get(var7);
			var8.npcCycle = var1;
			var8.field1027 = var2;
			var8.field1054.method5715(var3, var4, var5, var6);
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1963633561"
	)
	void method1806(int var1, int var2, int var3, int var4) {
		for (int var5 = 0; var5 < this.field690.size(); ++var5) {
			((Actor)this.field690.get(var5)).updateSpotAnimation(var1, var2, var3, var4);
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(FFFI)Lre;",
		garbageValue = "1461132049"
	)
	public static class445 method1781(float var0, float var1, float var2) {
		synchronized(class445.field4963) {
			if (GrandExchangeOfferNameComparator.field4812 == 0) {
				return new class445(var0, var1, var2);
			} else {
				class445.field4963[--GrandExchangeOfferNameComparator.field4812].method8688(var0, var1, var2);
				return class445.field4963[GrandExchangeOfferNameComparator.field4812];
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-981801792"
	)
	public static void method1767(int var0) {
		MouseHandler.MouseHandler_idleCycles = var0;
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(Lmk;S)V",
		garbageValue = "1919"
	)
	static void method1845(PacketBufferNode var0) {
		var0.packetBuffer.writeIntLE(ModeWhere.field4905.hash);
		var0.packetBuffer.writeIntME(class198.archive10.hash);
		var0.packetBuffer.writeIntLE(class226.field2467.hash);
		var0.packetBuffer.writeIntLE(class225.field2457.hash);
		var0.packetBuffer.writeIntLE(WorldMapArea.field3181.hash);
		var0.packetBuffer.writeInt(SoundCache.field1342.hash);
		var0.packetBuffer.writeIntLE(class526.archive12.hash);
		var0.packetBuffer.writeIntIME(LoginState.field283.hash);
		var0.packetBuffer.writeIntIME(Varcs.field1254.hash);
		var0.packetBuffer.writeInt(AbstractByteArrayCopier.field3837.hash);
		var0.packetBuffer.writeIntIME(class403.field4745.hash);
		var0.packetBuffer.writeIntLE(WorldMapRectangle.field3283.hash);
		var0.packetBuffer.writeInt(VerticalAlignment.archive9.hash);
		var0.packetBuffer.writeIntME(class51.field728.hash);
		var0.packetBuffer.writeInt(0);
		var0.packetBuffer.writeInt(class361.archive13.hash);
		var0.packetBuffer.writeIntIME(class150.field1717.hash);
		var0.packetBuffer.writeIntME(class107.field1386.hash);
		var0.packetBuffer.writeInt(ArchiveDiskAction.field4689.hash);
		var0.packetBuffer.writeIntIME(class217.archive6.hash);
		var0.packetBuffer.writeIntLE(GrandExchangeOfferAgeComparator.archive8.hash);
		var0.packetBuffer.writeIntME(MusicPatchPcmStream.archive2.hash);
		var0.packetBuffer.writeIntIME(class330.archive4.hash);
	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1458021708"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		class436.method8568();
		class180.setViewportShape(var0, var1, var2, var3, true);
		int var4 = Client.viewportOffsetX;
		int var5 = Client.viewportOffsetY;
		int var6 = Client.viewportWidth;
		int var7 = Client.viewportHeight;
		Rasterizer2D.Rasterizer2D_setClip(var4, var5, var6 + var4, var7 + var5);
		Rasterizer3D.resetRasterClipping();
		Rasterizer2D.clearBrightness();
		int var8 = Client.camAngleX;
		if (Client.field481 / 256 > var8) {
			var8 = Client.field481 / 256;
		}

		if (Client.field584[4] && Client.field586[4] + 128 > var8) {
			var8 = Client.field586[4] + 128;
		}

		int var9 = Client.camAngleY & 2047;
		int var10 = UserComparator5.oculusOrbFocalPointX;
		int var11 = class275.oculusOrbFocalPointZ;
		int var12 = class198.oculusOrbFocalPointY;
		int var13 = FriendSystem.method1551(var8);
		var13 = ItemComposition.method4534(var13, var7);
		int var14 = 2048 - var8 & 2047;
		int var15 = 2048 - var9 & 2047;
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
			var18 = var20 * var13 + var17 * var19 >> 16;
			var17 = var21;
		}

		if (var15 != 0) {
			var19 = Rasterizer3D.Rasterizer3D_sine[var15];
			var20 = Rasterizer3D.Rasterizer3D_cosine[var15];
			var21 = var18 * var19 + var16 * var20 >> 16;
			var18 = var20 * var18 - var16 * var19 >> 16;
			var16 = var21;
		}

		if (Client.isCameraLocked) {
			NpcOverrides.field2022 = var10 - var16;
			Strings.field4599 = var11 - var17;
			ReflectionCheck.field248 = var12 - var18;
			ChatChannel.field830 = var8;
			Calendar.field3843 = var9;
		} else {
			class6.cameraX = var10 - var16;
			ClientPreferences.cameraY = var11 - var17;
			GrandExchangeOfferAgeComparator.cameraZ = var12 - var18;
			WorldMapData_1.cameraPitch = var8;
			class455.cameraYaw = var9;
		}

		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (UserComparator5.oculusOrbFocalPointX >> 7 != class152.localPlayer.x >> 7 || class198.oculusOrbFocalPointY >> 7 != class152.localPlayer.y >> 7)) {
			var19 = class152.localPlayer.plane;
			var20 = (UserComparator5.oculusOrbFocalPointX >> 7) + Sound.topLevelWorldView.baseX;
			var21 = (class198.oculusOrbFocalPointY >> 7) + Sound.topLevelWorldView.baseY;
			ItemComposition.method4533(var20, var21, var19, true);
		}

		int var22;
		int var24;
		if (!Client.isCameraLocked) {
			if (ClientPacket.clientPreferences.isRoofsHidden()) {
				var15 = Sound.topLevelWorldView.plane;
			} else {
				label374: {
					var16 = 3;
					var17 = Client.field527 >> 7;
					var18 = Client.field387 >> 7;
					if (WorldMapData_1.cameraPitch < 310) {
						label369: {
							if (Client.oculusOrbState == 1) {
								var19 = UserComparator5.oculusOrbFocalPointX >> 7;
								var20 = class198.oculusOrbFocalPointY >> 7;
							} else {
								var19 = var17;
								var20 = var18;
							}

							var21 = class6.cameraX >> 7;
							var22 = GrandExchangeOfferAgeComparator.cameraZ >> 7;
							if (var21 >= 0 && 104 > var21 && var22 >= 0 && 104 > var22) {
								if (var19 >= 0 && 104 > var19 && var20 >= 0 && 104 > var20) {
									if ((Sound.topLevelWorldView.tileSettings[Sound.topLevelWorldView.plane][var21][var22] & 4) != 0) {
										var16 = Sound.topLevelWorldView.plane;
									}

									int var23;
									if (var19 > var21) {
										var23 = var19 - var21;
									} else {
										var23 = var21 - var19;
									}

									if (var20 > var22) {
										var24 = var20 - var22;
									} else {
										var24 = var22 - var20;
									}

									int var25;
									int var26;
									if (var23 > var24) {
										var25 = var24 * 65536 / var23;
										var26 = 32768;

										while (true) {
											if (var21 == var19) {
												break label369;
											}

											if (var21 < var19) {
												++var21;
											} else if (var21 > var19) {
												--var21;
											}

											if ((Sound.topLevelWorldView.tileSettings[Sound.topLevelWorldView.plane][var21][var22] & 4) != 0) {
												var16 = Sound.topLevelWorldView.plane;
											}

											var26 += var25;
											if (var26 >= 65536) {
												var26 -= 65536;
												if (var22 < var20) {
													++var22;
												} else if (var22 > var20) {
													--var22;
												}

												if ((Sound.topLevelWorldView.tileSettings[Sound.topLevelWorldView.plane][var21][var22] & 4) != 0) {
													var16 = Sound.topLevelWorldView.plane;
												}
											}
										}
									} else {
										if (var24 > 0) {
											var25 = var23 * 65536 / var24;
											var26 = 32768;

											while (var20 != var22) {
												if (var22 < var20) {
													++var22;
												} else if (var22 > var20) {
													--var22;
												}

												if ((Sound.topLevelWorldView.tileSettings[Sound.topLevelWorldView.plane][var21][var22] & 4) != 0) {
													var16 = Sound.topLevelWorldView.plane;
												}

												var26 += var25;
												if (var26 >= 65536) {
													var26 -= 65536;
													if (var21 < var19) {
														++var21;
													} else if (var21 > var19) {
														--var21;
													}

													if ((Sound.topLevelWorldView.tileSettings[Sound.topLevelWorldView.plane][var21][var22] & 4) != 0) {
														var16 = Sound.topLevelWorldView.plane;
													}
												}
											}
										}
										break label369;
									}
								}

								var15 = Sound.topLevelWorldView.plane;
								break label374;
							}

							var15 = Sound.topLevelWorldView.plane;
							break label374;
						}
					}

					if (var17 >= 0 && 104 > var17 && var18 >= 0 && 104 > var18) {
						if ((Sound.topLevelWorldView.tileSettings[Sound.topLevelWorldView.plane][var17][var18] & 4) != 0) {
							var16 = Sound.topLevelWorldView.plane;
						}

						var15 = var16;
					} else {
						var15 = Sound.topLevelWorldView.plane;
					}
				}
			}

			var14 = var15;
		} else {
			if (ClientPacket.clientPreferences.isRoofsHidden()) {
				var15 = Sound.topLevelWorldView.plane;
			} else {
				var16 = class6.cameraX >> 7;
				var17 = GrandExchangeOfferAgeComparator.cameraZ >> 7;
				if (var16 >= 0 && 104 > var16 && var17 >= 0 && 104 > var17) {
					var18 = DevicePcmPlayerProvider.getTileHeight(Sound.topLevelWorldView, class6.cameraX, GrandExchangeOfferAgeComparator.cameraZ, Sound.topLevelWorldView.plane);
					if (var18 - ClientPreferences.cameraY < 800 && (Sound.topLevelWorldView.tileSettings[Sound.topLevelWorldView.plane][var16][var17] & 4) != 0) {
						var15 = Sound.topLevelWorldView.plane;
					} else {
						var15 = 3;
					}
				} else {
					var15 = Sound.topLevelWorldView.plane;
				}
			}

			var14 = var15;
		}

		var15 = class6.cameraX;
		var16 = ClientPreferences.cameraY;
		var17 = GrandExchangeOfferAgeComparator.cameraZ;
		var18 = WorldMapData_1.cameraPitch;
		var19 = class455.cameraYaw;

		for (var20 = 0; var20 < 5; ++var20) {
			if (Client.field584[var20]) {
				var21 = (int)(Math.random() * (double)(Client.field585[var20] * 2 + 1) - (double)Client.field585[var20] + Math.sin((double)Client.field587[var20] / 100.0D * (double)Client.field588[var20]) * (double)Client.field586[var20]);
				if (var20 == 0) {
					class6.cameraX += var21;
				}

				if (var20 == 1) {
					ClientPreferences.cameraY += var21;
				}

				if (var20 == 2) {
					GrandExchangeOfferAgeComparator.cameraZ += var21;
				}

				if (var20 == 3) {
					class455.cameraYaw = var21 + class455.cameraYaw & 2047;
				}

				if (var20 == 4) {
					WorldMapData_1.cameraPitch += var21;
					if (WorldMapData_1.cameraPitch < 128) {
						WorldMapData_1.cameraPitch = 128;
					}

					if (WorldMapData_1.cameraPitch > 383) {
						WorldMapData_1.cameraPitch = 383;
					}
				}
			}
		}

		var20 = MouseHandler.MouseHandler_x;
		var21 = MouseHandler.MouseHandler_y;
		if (var20 >= var4 && var20 < var4 + var6 && var21 >= var5 && var21 < var7 + var5) {
			DbTable.method10688(var20 - var4, var21 - var5);
			Iterator var27 = Client.worldViewManager.iterator();

			while (var27.hasNext()) {
				WorldView var28 = (WorldView)var27.next();
				var28.scene.method5378(var28.plane, var20 - var4, var21 - var5);
			}
		} else {
			class385.method7947();
		}

		MusicPatchNode2.method6884();
		Rasterizer2D.Rasterizer2D_fillRectangle(var4, var5, var6, var7, 0);
		MusicPatchNode2.method6884();
		var22 = Rasterizer3D.get3dZoom();
		Rasterizer3D.method4992(class36.client.field195);
		Rasterizer3D.clips.zoom = Client.viewportZoom;
		class233 var30 = Client.field337 == -1 ? class233.field2522 : class233.field2523;
		Sound.topLevelWorldView.scene.method5409(var30);
		Sound.topLevelWorldView.scene.draw(class6.cameraX, ClientPreferences.cameraY, GrandExchangeOfferAgeComparator.cameraZ, WorldMapData_1.cameraPitch, class455.cameraYaw, var14, Client.field527, Client.field387, Client.isCameraLocked);
		Rasterizer3D.method4992(false);
		if (Client.z) {
			Rasterizer2D.adjustBrightness();
		}

		Rasterizer3D.clips.zoom = var22;
		MusicPatchNode2.method6884();
		WorldEntityCoord.method6093(Sound.topLevelWorldView, var4, var5, var6, var7);

		for (var24 = 0; var24 < Sound.topLevelWorldView.field1159.method9429(); ++var24) {
			WorldEntity var29 = (WorldEntity)Sound.topLevelWorldView.worldEntities.get((long)Sound.topLevelWorldView.field1159.method9430(var24));
			if (var29 != null) {
				WorldEntityCoord.method6093(var29.worldView, var4, var5, var6, var7);
			}
		}

		class28.method437(Sound.topLevelWorldView, var4, var5);
		((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).animate(Client.graphicsCycle);
		class148.method3659(var4, var5, var6, var7);
		class6.cameraX = var15;
		ClientPreferences.cameraY = var16;
		GrandExchangeOfferAgeComparator.cameraZ = var17;
		WorldMapData_1.cameraPitch = var18;
		class455.cameraYaw = var19;
		if (Client.isLoading && class330.field3669.method8170(true, false) == 0) {
			Client.isLoading = false;
		}

		if (Client.isLoading) {
			Rasterizer2D.Rasterizer2D_fillRectangle(var4, var5, var6, var7, 0);
			class391.drawLoadingMessage("Loading - please wait.", false);
		}

		WorldMapCacheName.method6690();
	}
}
