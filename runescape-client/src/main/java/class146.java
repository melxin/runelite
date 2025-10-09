import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
public enum class146 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	field1750(0, 0),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	field1740(1, 1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	field1753(2, 2),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	field1746(3, 3),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	field1743(4, 4),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	field1744(5, 5),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	field1745(6, 6),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	field1739(7, 7),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	field1747(8, 8);

	@ObfuscatedName("az")
	@Export("soundSystemExecutor")
	public static ScheduledExecutorService soundSystemExecutor;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1687179715
	)
	final int field1748;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1490931105
	)
	final int field1741;

	class146(int var3, int var4) {
		this.field1748 = var3;
		this.field1741 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1012656358"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1741;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-730783658"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		if (!class32.client.containsAccessAndRefreshToken() && !class32.client.otlTokenRequesterInitialized() && !class32.client.containsSessionAndCharacterId()) {
			Login.Login_response1 = "";
			Login.Login_response2 = "Enter your username/email & password.";
			Login.Login_response3 = "";
			method3876(2);
			if (var0) {
				Login.Login_password = "";
			}

			if (Login.Login_username == null || Login.Login_username.isEmpty()) {
				if (class154.clientPreferences.getRememberedUsername() != null) {
					Login.Login_username = class154.clientPreferences.getRememberedUsername();
					Client.Login_isUsernameRemembered = true;
				} else {
					Client.Login_isUsernameRemembered = false;
				}
			}

			class4.focusPasswordWhenUsernameFilled();
		} else {
			method3876(10);
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-270619667"
	)
	static void method3876(int var0) {
		if (var0 != Login.loginIndex) {
			Login.loginIndex = var0;
		}
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "33"
	)
	@Export("loadRegion")
	static final void loadRegion() {
		Player.method2271(false);
		Client.field390 = 0;
		boolean var0 = true;

		int var1;
		for (var1 = 0; var1 < AbstractUserComparator.regionLandArchives.length; ++var1) {
			if (AsyncRestClient.regionMapArchiveIds[var1] != -1 && AbstractUserComparator.regionLandArchives[var1] == null) {
				AbstractUserComparator.regionLandArchives[var1] = ItemContainer.archive9.takeFile(AsyncRestClient.regionMapArchiveIds[var1], 0);
				if (AbstractUserComparator.regionLandArchives[var1] == null) {
					var0 = false;
					++Client.field390;
				}
			}

			if (WorldViewManager.regionLandArchiveIds[var1] != -1 && GrandExchangeOffer.regionMapArchives[var1] == null) {
				GrandExchangeOffer.regionMapArchives[var1] = ItemContainer.archive9.takeFileEncrypted(WorldViewManager.regionLandArchiveIds[var1], 0, PlayerComposition.xteaKeys[var1]);
				if (GrandExchangeOffer.regionMapArchives[var1] == null) {
					var0 = false;
					++Client.field390;
				}
			}
		}

		if (!var0) {
			Client.field394 = 1;
		} else {
			Client.field392 = 0;
			var0 = true;

			int var3;
			int var4;
			for (var1 = 0; var1 < AbstractUserComparator.regionLandArchives.length; ++var1) {
				byte[] var17 = GrandExchangeOffer.regionMapArchives[var1];
				if (var17 != null) {
					var3 = (class29.regions[var1] >> 8) * 64 - class547.topLevelWorldView.baseX;
					var4 = (class29.regions[var1] & 255) * 64 - class547.topLevelWorldView.baseY;
					if (Client.isInInstance) {
						var3 = 10;
						var4 = 10;
					}

					var0 &= class533.method10661(var17, var3, var4);
				}
			}

			if (!var0) {
				Client.field394 = 2;
			} else {
				if (Client.field394 != 0) {
					class88.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				StudioGame.method8201();
				class547.topLevelWorldView.scene.clearTempGameObjects();

				for (var1 = 0; var1 < 4; ++var1) {
					class547.topLevelWorldView.collisionMaps[var1].clear();
				}

				int var2;
				for (var1 = 0; var1 < 4; ++var1) {
					for (var2 = 0; var2 < 104; ++var2) {
						for (var3 = 0; var3 < 104; ++var3) {
							class547.topLevelWorldView.tileSettings[var1][var2][var3] = 0;
						}
					}
				}

				StudioGame.method8201();
				NpcOverrides.method4378();
				var1 = AbstractUserComparator.regionLandArchives.length;
				class547.topLevelWorldView.method2747();
				Player.method2271(true);
				int var5;
				if (!Client.isInInstance) {
					byte[] var16;
					for (var2 = 0; var2 < var1; ++var2) {
						var3 = (class29.regions[var2] >> 8) * 64 - class547.topLevelWorldView.baseX;
						var4 = (class29.regions[var2] & 255) * 64 - class547.topLevelWorldView.baseY;
						var16 = AbstractUserComparator.regionLandArchives[var2];
						if (var16 != null) {
							StudioGame.method8201();
							MouseHandler.method679(class547.topLevelWorldView, var16, var3, var4, WorldMapIcon_1.field3312 * 8 - 48, class187.field2048 * 8 - 48);
						}
					}

					for (var2 = 0; var2 < var1; ++var2) {
						var3 = (class29.regions[var2] >> 8) * 64 - class547.topLevelWorldView.baseX;
						var4 = (class29.regions[var2] & 255) * 64 - class547.topLevelWorldView.baseY;
						var16 = AbstractUserComparator.regionLandArchives[var2];
						if (var16 == null && class187.field2048 < 800) {
							StudioGame.method8201();
							ChatChannel.method2057(class547.topLevelWorldView, var3, var4, 64, 64);
						}
					}

					Player.method2271(true);

					for (var2 = 0; var2 < var1; ++var2) {
						byte[] var15 = GrandExchangeOffer.regionMapArchives[var2];
						if (var15 != null) {
							var4 = (class29.regions[var2] >> 8) * 64 - class547.topLevelWorldView.baseX;
							var5 = (class29.regions[var2] & 255) * 64 - class547.topLevelWorldView.baseY;
							StudioGame.method8201();
							class48.method1916(class547.topLevelWorldView, var15, var4, var5);
						}
					}
				}

				int var6;
				int var7;
				int var8;
				if (Client.isInInstance) {
					int var9;
					int var10;
					int var11;
					for (var2 = 0; var2 < 4; ++var2) {
						StudioGame.method8201();

						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								boolean var18 = false;
								var6 = Client.instanceChunkTemplates[var2][var3][var4];
								if (var6 != -1) {
									var7 = SpotAnimationDefinition.method4496(var6);
									var8 = WorldMapEvent.method6973(var6);
									var9 = class210.method4671(var6);
									var10 = class138.method3798(var6);
									var11 = (var9 / 8 << 8) + var10 / 8;

									for (int var12 = 0; var12 < class29.regions.length; ++var12) {
										if (class29.regions[var12] == var11 && AbstractUserComparator.regionLandArchives[var12] != null) {
											int var13 = (var9 - var3) * 8;
											int var14 = (var10 - var4) * 8;
											AttackOption.method2881(class547.topLevelWorldView, AbstractUserComparator.regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, var13, var14);
											var18 = true;
											break;
										}
									}
								}

								if (!var18) {
									MusicPatchNode2.method7120(class547.topLevelWorldView.tileHeights, var2, var3 * 8, var4 * 8);
								}
							}
						}
					}

					for (var2 = 0; var2 < 13; ++var2) {
						for (var3 = 0; var3 < 13; ++var3) {
							var4 = Client.instanceChunkTemplates[0][var2][var3];
							if (var4 == -1) {
								ChatChannel.method2057(class547.topLevelWorldView, var2 * 8, var3 * 8, 8, 8);
							}
						}
					}

					Player.method2271(true);

					for (var2 = 0; var2 < 4; ++var2) {
						StudioGame.method8201();

						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								var5 = Client.instanceChunkTemplates[var2][var3][var4];
								if (var5 != -1) {
									var6 = SpotAnimationDefinition.method4496(var5);
									var7 = WorldMapEvent.method6973(var5);
									var8 = class210.method4671(var5);
									var9 = class138.method3798(var5);
									var10 = (var8 / 8 << 8) + var9 / 8;

									for (var11 = 0; var11 < class29.regions.length; ++var11) {
										if (class29.regions[var11] == var10 && GrandExchangeOffer.regionMapArchives[var11] != null) {
											Tiles.method2110(class547.topLevelWorldView, GrandExchangeOffer.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7);
											break;
										}
									}
								}
							}
						}
					}
				}

				Player.method2271(true);
				StudioGame.method8201();
				Skills.method8168(class547.topLevelWorldView);
				Player.method2271(true);
				var2 = Tiles.Tiles_minPlane;
				if (var2 > class547.topLevelWorldView.plane) {
					var2 = class547.topLevelWorldView.plane;
				}

				if (var2 < class547.topLevelWorldView.plane - 1) {
					var2 = class547.topLevelWorldView.plane - 1;
				}

				if (Client.isLowDetail) {
					class547.topLevelWorldView.scene.init(Tiles.Tiles_minPlane);
				} else {
					class547.topLevelWorldView.scene.init(0);
				}

				for (var3 = 0; var3 < 104; ++var3) {
					for (var4 = 0; var4 < 104; ++var4) {
						class393.updateItemPile3(class547.topLevelWorldView, var3, var4);
					}
				}

				StudioGame.method8201();
				HttpResponse.method305();
				ObjectComposition.ObjectDefinition_cachedModelData.clear();
				PacketBufferNode var19;
				if (class32.client.hasFrame()) {
					var19 = HorizontalAlignment.getPacketBufferNode(ClientPacket.DETECT_MODIFIED_CLIENT, Client.packetWriter.isaacCipher);
					var19.packetBuffer.writeInt(1057001181);
					Client.packetWriter.addNode(var19);
				}

				if (!Client.isInInstance) {
					var3 = (WorldMapIcon_1.field3312 - 6) / 8;
					var4 = (WorldMapIcon_1.field3312 + 6) / 8;
					var5 = (class187.field2048 - 6) / 8;
					var6 = (class187.field2048 + 6) / 8;

					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) {
						for (var8 = var5 - 1; var8 <= var6 + 1; ++var8) {
							if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) {
								ItemContainer.archive9.loadRegionFromName("m" + var7 + "_" + var8);
								ItemContainer.archive9.loadRegionFromName("l" + var7 + "_" + var8);
							}
						}
					}
				}

				StudioGame.method8201();
				HealthBarDefinition.method4316();
				var19 = HorizontalAlignment.getPacketBufferNode(ClientPacket.MAP_BUILD_COMPLETE, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var19);
				ObjectSound.method2358();
				Client.field476 = false;
			}
		}
	}

	@ObfuscatedName("oy")
	@ObfuscatedSignature(
		descriptor = "(IILnt;I)I",
		garbageValue = "439357698"
	)
	static int method3870(int var0, int var1, SpriteMask var2) {
		int var3 = var2.width / 2 + var0;
		int var4 = var2.height / 2 + var1;
		int var5 = MouseHandler.MouseHandler_x - var3;
		int var6 = MouseHandler.MouseHandler_y - var4;
		int var7 = GrandExchangeOfferNameComparator.method8547(var6, var5);
		var7 -= Client.camAngleY;
		var7 &= 2047;
		int var9 = var7 + 64;
		int var8 = (var9 & 2047) / 128;
		return var8;
	}
}
