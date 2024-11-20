import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("my")
public final class class329 {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = -6943238699222390545L
	)
	static long field3603;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -646372875
	)
	@Export("canvasWidth")
	public static int canvasWidth;

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "70"
	)
	@Export("isAlphaNumeric")
	public static boolean isAlphaNumeric(char var0) {
		return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1608586871"
	)
	@Export("updateLoginIndex")
	static void updateLoginIndex(int var0) {
		if (var0 != Login.loginIndex) {
			Login.loginIndex = var0;
		}
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-513978308"
	)
	@Export("loadRegion")
	static final void loadRegion() {
		WorldMapRenderer.method6084(false);
		Client.field777 = 0;
		boolean var0 = true;

		int var1;
		for (var1 = 0; var1 < class164.regionLandArchives.length; ++var1) {
			if (class27.regionMapArchiveIds[var1] != -1 && class164.regionLandArchives[var1] == null) {
				class164.regionLandArchives[var1] = class309.archive9.takeFile(class27.regionMapArchiveIds[var1], 0);
				if (class164.regionLandArchives[var1] == null) {
					var0 = false;
					++Client.field777;
				}
			}

			if (class187.regionLandArchiveIds[var1] != -1 && MouseHandler.regionMapArchives[var1] == null) {
				MouseHandler.regionMapArchives[var1] = class309.archive9.takeFileEncrypted(class187.regionLandArchiveIds[var1], 0, Client.xteaKeys[var1]);
				if (MouseHandler.regionMapArchives[var1] == null) {
					var0 = false;
					++Client.field777;
				}
			}
		}

		if (!var0) {
			Client.field583 = 1;
		} else {
			Client.field581 = 0;
			var0 = true;

			int var3;
			int var4;
			for (var1 = 0; var1 < class164.regionLandArchives.length; ++var1) {
				byte[] var17 = MouseHandler.regionMapArchives[var1];
				if (var17 != null) {
					var3 = (AsyncRestClient.regions[var1] >> 8) * 64 - HttpRequest.topLevelWorldView.baseX;
					var4 = (AsyncRestClient.regions[var1] & 255) * 64 - HttpRequest.topLevelWorldView.baseY;
					if (Client.isInInstance) {
						var3 = 10;
						var4 = 10;
					}

					var0 &= UserComparator3.method3233(var17, var3, var4);
				}
			}

			if (!var0) {
				Client.field583 = 2;
			} else {
				if (Client.field583 != 0) {
					class135.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				UserComparator3.method3232();
				HttpRequest.topLevelWorldView.scene.clearTempGameObjects();

				for (var1 = 0; var1 < 4; ++var1) {
					HttpRequest.topLevelWorldView.collisionMaps[var1].clear();
				}

				int var2;
				for (var1 = 0; var1 < 4; ++var1) {
					for (var2 = 0; var2 < 104; ++var2) {
						for (var3 = 0; var3 < 104; ++var3) {
							HttpRequest.topLevelWorldView.tileSettings[var1][var2][var3] = 0;
						}
					}
				}

				UserComparator3.method3232();
				GrandExchangeEvent.method7730();
				var1 = class164.regionLandArchives.length;
				MouseRecorder.method2503();
				WorldMapRenderer.method6084(true);
				int var5;
				if (!Client.isInInstance) {
					byte[] var16;
					for (var2 = 0; var2 < var1; ++var2) {
						var3 = (AsyncRestClient.regions[var2] >> 8) * 64 - HttpRequest.topLevelWorldView.baseX;
						var4 = (AsyncRestClient.regions[var2] & 255) * 64 - HttpRequest.topLevelWorldView.baseY;
						var16 = class164.regionLandArchives[var2];
						if (var16 != null) {
							UserComparator3.method3232();
							UrlRequest.method3188(HttpRequest.topLevelWorldView, var16, var3, var4, class217.field2364 * 8 - 48, Projectile.field998 * 8 - 48);
						}
					}

					for (var2 = 0; var2 < var1; ++var2) {
						var3 = (AsyncRestClient.regions[var2] >> 8) * 64 - HttpRequest.topLevelWorldView.baseX;
						var4 = (AsyncRestClient.regions[var2] & 255) * 64 - HttpRequest.topLevelWorldView.baseY;
						var16 = class164.regionLandArchives[var2];
						if (var16 == null && Projectile.field998 < 800) {
							UserComparator3.method3232();
							class346.method6797(HttpRequest.topLevelWorldView, var3, var4, 64, 64);
						}
					}

					WorldMapRenderer.method6084(true);

					for (var2 = 0; var2 < var1; ++var2) {
						byte[] var15 = MouseHandler.regionMapArchives[var2];
						if (var15 != null) {
							var4 = (AsyncRestClient.regions[var2] >> 8) * 64 - HttpRequest.topLevelWorldView.baseX;
							var5 = (AsyncRestClient.regions[var2] & 255) * 64 - HttpRequest.topLevelWorldView.baseY;
							UserComparator3.method3232();
							class318.method6450(HttpRequest.topLevelWorldView, var15, var4, var5);
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
						UserComparator3.method3232();

						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								boolean var18 = false;
								var6 = Client.instanceChunkTemplates[var2][var3][var4];
								if (var6 != -1) {
									var7 = var6 >> 24 & 3;
									var8 = var6 >> 1 & 3;
									var9 = var6 >> 14 & 1023;
									var10 = var6 >> 3 & 2047;
									var11 = (var9 / 8 << 8) + var10 / 8;

									for (int var12 = 0; var12 < AsyncRestClient.regions.length; ++var12) {
										if (AsyncRestClient.regions[var12] == var11 && class164.regionLandArchives[var12] != null) {
											int var13 = (var9 - var3) * 8;
											int var14 = (var10 - var4) * 8;
											WorldMapSectionType.method6196(HttpRequest.topLevelWorldView, class164.regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, var13, var14);
											var18 = true;
											break;
										}
									}
								}

								if (!var18) {
									Client.method1634(HttpRequest.topLevelWorldView.tileHeights, var2, var3 * 8, var4 * 8);
								}
							}
						}
					}

					for (var2 = 0; var2 < 13; ++var2) {
						for (var3 = 0; var3 < 13; ++var3) {
							var4 = Client.instanceChunkTemplates[0][var2][var3];
							if (var4 == -1) {
								class346.method6797(HttpRequest.topLevelWorldView, var2 * 8, var3 * 8, 8, 8);
							}
						}
					}

					WorldMapRenderer.method6084(true);

					for (var2 = 0; var2 < 4; ++var2) {
						UserComparator3.method3232();

						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								var5 = Client.instanceChunkTemplates[var2][var3][var4];
								if (var5 != -1) {
									var6 = var5 >> 24 & 3;
									var7 = var5 >> 1 & 3;
									var8 = var5 >> 14 & 1023;
									var9 = var5 >> 3 & 2047;
									var10 = (var8 / 8 << 8) + var9 / 8;

									for (var11 = 0; var11 < AsyncRestClient.regions.length; ++var11) {
										if (AsyncRestClient.regions[var11] == var10 && MouseHandler.regionMapArchives[var11] != null) {
											Tiles.method2387(HttpRequest.topLevelWorldView, MouseHandler.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7);
											break;
										}
									}
								}
							}
						}
					}
				}

				WorldMapRenderer.method6084(true);
				UserComparator3.method3232();
				Language.method7792(HttpRequest.topLevelWorldView);
				WorldMapRenderer.method6084(true);
				var2 = Tiles.Tiles_minPlane;
				if (var2 > HttpRequest.topLevelWorldView.plane) {
					var2 = HttpRequest.topLevelWorldView.plane;
				}

				if (var2 < HttpRequest.topLevelWorldView.plane - 1) {
					var2 = HttpRequest.topLevelWorldView.plane - 1;
				}

				if (Client.isLowDetail) {
					HttpRequest.topLevelWorldView.scene.init(Tiles.Tiles_minPlane);
				} else {
					HttpRequest.topLevelWorldView.scene.init(0);
				}

				for (var3 = 0; var3 < 104; ++var3) {
					for (var4 = 0; var4 < 104; ++var4) {
						AuthenticationScheme.updateItemPile3(HttpRequest.topLevelWorldView, var3, var4);
					}
				}

				UserComparator3.method3232();
				PacketWriter.method3153();
				ObjectComposition.ObjectDefinition_cachedModelData.clear();
				PacketBufferNode var19;
				if (NpcOverrides.client.hasFrame()) {
					var19 = Message.getPacketBufferNode(ClientPacket.DETECT_MODIFIED_CLIENT, Client.packetWriter.isaacCipher);
					var19.packetBuffer.writeInt(1057001181);
					Client.packetWriter.addNode(var19);
				}

				if (!Client.isInInstance) {
					var3 = (class217.field2364 - 6) / 8;
					var4 = (class217.field2364 + 6) / 8;
					var5 = (Projectile.field998 - 6) / 8;
					var6 = (Projectile.field998 + 6) / 8;

					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) {
						for (var8 = var5 - 1; var8 <= var6 + 1; ++var8) {
							if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) {
								class309.archive9.loadRegionFromName("m" + var7 + "_" + var8);
								class309.archive9.loadRegionFromName("l" + var7 + "_" + var8);
							}
						}
					}
				}

				UserComparator3.method3232();
				class268.method5565();
				var19 = Message.getPacketBufferNode(ClientPacket.MAP_BUILD_COMPLETE, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var19);
				Canvas.method310();
				Client.field518 = false;
			}
		}
	}
}
