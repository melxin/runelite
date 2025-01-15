import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("il")
public class class213 {
	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "Lvf;"
	)
	@Export("redHintArrowSprite")
	static SpritePixels redHintArrowSprite;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Len;"
	)
	public UrlRequest field2373;
	@ObfuscatedName("ah")
	public float[] field2372;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	final class223 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lic;)V"
	)
	class213(class223 var1) {
		this.this$0 = var1;
		this.field2372 = new float[4];
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-919920239"
	)
	@Export("loadRegion")
	static final void loadRegion() {
		Projectile.method2454(false);
		Client.field760 = 0;
		boolean var0 = true;

		int var1;
		for (var1 = 0; var1 < HttpResponse.regionLandArchives.length; ++var1) {
			if (class92.regionMapArchiveIds[var1] != -1 && HttpResponse.regionLandArchives[var1] == null) {
				HttpResponse.regionLandArchives[var1] = LoginState.archive9.takeFile(class92.regionMapArchiveIds[var1], 0);
				if (HttpResponse.regionLandArchives[var1] == null) {
					var0 = false;
					++Client.field760;
				}
			}

			if (GrandExchangeOfferNameComparator.regionLandArchiveIds[var1] != -1 && WorldMapCacheName.regionMapArchives[var1] == null) {
				WorldMapCacheName.regionMapArchives[var1] = LoginState.archive9.takeFileEncrypted(GrandExchangeOfferNameComparator.regionLandArchiveIds[var1], 0, MusicPatchPcmStream.xteaKeys[var1]);
				if (WorldMapCacheName.regionMapArchives[var1] == null) {
					var0 = false;
					++Client.field760;
				}
			}
		}

		if (!var0) {
			Client.field573 = 1;
		} else {
			Client.field561 = 0;
			var0 = true;

			int var3;
			int var4;
			for (var1 = 0; var1 < HttpResponse.regionLandArchives.length; ++var1) {
				byte[] var17 = WorldMapCacheName.regionMapArchives[var1];
				if (var17 != null) {
					var3 = (TextureProvider.regions[var1] >> 8) * 64 - GameEngine.topLevelWorldView.baseX;
					var4 = (TextureProvider.regions[var1] & 255) * 64 - GameEngine.topLevelWorldView.baseY;
					if (Client.isInInstance) {
						var3 = 10;
						var4 = 10;
					}

					var0 &= class508.method9614(var17, var3, var4);
				}
			}

			if (!var0) {
				Client.field573 = 2;
			} else {
				if (Client.field573 != 0) {
					class328.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				class113.method3178();
				GameEngine.topLevelWorldView.scene.clearTempGameObjects();

				for (var1 = 0; var1 < 4; ++var1) {
					GameEngine.topLevelWorldView.collisionMaps[var1].clear();
				}

				int var2;
				for (var1 = 0; var1 < 4; ++var1) {
					for (var2 = 0; var2 < 104; ++var2) {
						for (var3 = 0; var3 < 104; ++var3) {
							GameEngine.topLevelWorldView.tileSettings[var1][var2][var3] = 0;
						}
					}
				}

				class113.method3178();
				Renderable.method4460();
				var1 = HttpResponse.regionLandArchives.length;
				World.method1957();
				Projectile.method2454(true);
				int var5;
				if (!Client.isInInstance) {
					byte[] var16;
					for (var2 = 0; var2 < var1; ++var2) {
						var3 = (TextureProvider.regions[var2] >> 8) * 64 - GameEngine.topLevelWorldView.baseX;
						var4 = (TextureProvider.regions[var2] & 255) * 64 - GameEngine.topLevelWorldView.baseY;
						var16 = HttpResponse.regionLandArchives[var2];
						if (var16 != null) {
							class113.method3178();
							Language.method7975(GameEngine.topLevelWorldView, var16, var3, var4, AsyncRestClient.field62 * 8 - 48, class133.field1554 * 8 - 48);
						}
					}

					for (var2 = 0; var2 < var1; ++var2) {
						var3 = (TextureProvider.regions[var2] >> 8) * 64 - GameEngine.topLevelWorldView.baseX;
						var4 = (TextureProvider.regions[var2] & 255) * 64 - GameEngine.topLevelWorldView.baseY;
						var16 = HttpResponse.regionLandArchives[var2];
						if (var16 == null && class133.field1554 < 800) {
							class113.method3178();
							class280.method5989(GameEngine.topLevelWorldView, var3, var4, 64, 64);
						}
					}

					Projectile.method2454(true);

					for (var2 = 0; var2 < var1; ++var2) {
						byte[] var15 = WorldMapCacheName.regionMapArchives[var2];
						if (var15 != null) {
							var4 = (TextureProvider.regions[var2] >> 8) * 64 - GameEngine.topLevelWorldView.baseX;
							var5 = (TextureProvider.regions[var2] & 255) * 64 - GameEngine.topLevelWorldView.baseY;
							class113.method3178();
							class140.method3503(GameEngine.topLevelWorldView, var15, var4, var5);
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
						class113.method3178();

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

									for (int var12 = 0; var12 < TextureProvider.regions.length; ++var12) {
										if (TextureProvider.regions[var12] == var11 && HttpResponse.regionLandArchives[var12] != null) {
											int var13 = (var9 - var3) * 8;
											int var14 = (var10 - var4) * 8;
											class92.method2646(GameEngine.topLevelWorldView, HttpResponse.regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, var13, var14);
											var18 = true;
											break;
										}
									}
								}

								if (!var18) {
									FloorOverlayDefinition.method5662(GameEngine.topLevelWorldView.tileHeights, var2, var3 * 8, var4 * 8);
								}
							}
						}
					}

					for (var2 = 0; var2 < 13; ++var2) {
						for (var3 = 0; var3 < 13; ++var3) {
							var4 = Client.instanceChunkTemplates[0][var2][var3];
							if (var4 == -1) {
								class280.method5989(GameEngine.topLevelWorldView, var2 * 8, var3 * 8, 8, 8);
							}
						}
					}

					Projectile.method2454(true);

					for (var2 = 0; var2 < 4; ++var2) {
						class113.method3178();

						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								var5 = Client.instanceChunkTemplates[var2][var3][var4];
								if (var5 != -1) {
									var6 = var5 >> 24 & 3;
									var7 = var5 >> 1 & 3;
									var8 = var5 >> 14 & 1023;
									var9 = var5 >> 3 & 2047;
									var10 = (var8 / 8 << 8) + var9 / 8;

									for (var11 = 0; var11 < TextureProvider.regions.length; ++var11) {
										if (TextureProvider.regions[var11] == var10 && WorldMapCacheName.regionMapArchives[var11] != null) {
											Tiles.method2511(GameEngine.topLevelWorldView, WorldMapCacheName.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7);
											break;
										}
									}
								}
							}
						}
					}
				}

				Projectile.method2454(true);
				class113.method3178();
				GrandExchangeEvent.method7903(GameEngine.topLevelWorldView);
				Projectile.method2454(true);
				var2 = Tiles.Tiles_minPlane;
				if (var2 > GameEngine.topLevelWorldView.plane) {
					var2 = GameEngine.topLevelWorldView.plane;
				}

				if (var2 < GameEngine.topLevelWorldView.plane - 1) {
					var2 = GameEngine.topLevelWorldView.plane - 1;
				}

				if (Client.isLowDetail) {
					GameEngine.topLevelWorldView.scene.init(Tiles.Tiles_minPlane);
				} else {
					GameEngine.topLevelWorldView.scene.init(0);
				}

				for (var3 = 0; var3 < 104; ++var3) {
					for (var4 = 0; var4 < 104; ++var4) {
						MusicPatchPcmStream.updateItemPile3(GameEngine.topLevelWorldView, var3, var4);
					}
				}

				class113.method3178();
				FloatProjection.method4435();
				ObjectComposition.ObjectDefinition_cachedModelData.clear();
				PacketBufferNode var19;
				if (Client.client.hasFrame()) {
					var19 = ScriptEvent.getPacketBufferNode(ClientPacket.DETECT_MODIFIED_CLIENT, Client.packetWriter.isaacCipher);
					var19.packetBuffer.writeInt(1057001181);
					Client.packetWriter.addNode(var19);
				}

				if (!Client.isInInstance) {
					var3 = (AsyncRestClient.field62 - 6) / 8;
					var4 = (AsyncRestClient.field62 + 6) / 8;
					var5 = (class133.field1554 - 6) / 8;
					var6 = (class133.field1554 + 6) / 8;

					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) {
						for (var8 = var5 - 1; var8 <= var6 + 1; ++var8) {
							if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) {
								LoginState.archive9.loadRegionFromName("m" + var7 + "_" + var8);
								LoginState.archive9.loadRegionFromName("l" + var7 + "_" + var8);
							}
						}
					}
				}

				class113.method3178();
				UserComparator7.method3331();
				var19 = ScriptEvent.getPacketBufferNode(ClientPacket.MAP_BUILD_COMPLETE, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var19);
				GrandExchangeOfferWorldComparator.method7902();
				Client.field723 = false;
			}
		}
	}
}
