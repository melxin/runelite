import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eh")
public class class107 extends Node {
	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	static Archive field1386;
	@ObfuscatedName("rj")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	static Model field1390;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	class101 field1388;

	public class107() {
		this.field1388 = null;
	}

	@ObfuscatedSignature(
		descriptor = "(Lem;)V"
	)
	class107(VorbisSample var1) {
		if (var1 != null) {
			this.field1388 = new class101(var1, (RawSound)null);
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Lds;)V"
	)
	public class107(RawSound var1) {
		this.field1388 = new class101((VorbisSample)null, var1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "88"
	)
	public boolean method3219() {
		return this.field1388 == null;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Lds;",
		garbageValue = "33"
	)
	public RawSound method3227() {
		if (this.field1388 != null && this.field1388.field1354.tryLock()) {
			RawSound var1;
			try {
				var1 = this.method3221();
			} finally {
				this.field1388.field1354.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Lds;",
		garbageValue = "-88"
	)
	public RawSound method3218() {
		if (this.field1388 != null) {
			this.field1388.field1354.lock();

			RawSound var1;
			try {
				var1 = this.method3221();
			} finally {
				this.field1388.field1354.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Lds;",
		garbageValue = "-1771676046"
	)
	RawSound method3221() {
		if (this.field1388.field1353 == null) {
			this.field1388.field1353 = this.field1388.field1352.toRawSound((int[])null);
			this.field1388.field1352 = null;
		}

		return this.field1388.field1353;
	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "192064387"
	)
	@Export("loadRegion")
	static final void loadRegion() {
		class242.method5121(false);
		Client.field591 = 0;
		boolean var0 = true;

		int var1;
		for (var1 = 0; var1 < AsyncRestClient.regionLandArchives.length; ++var1) {
			if (class320.regionMapArchiveIds[var1] != -1 && AsyncRestClient.regionLandArchives[var1] == null) {
				AsyncRestClient.regionLandArchives[var1] = VerticalAlignment.archive9.takeFile(class320.regionMapArchiveIds[var1], 0);
				if (AsyncRestClient.regionLandArchives[var1] == null) {
					var0 = false;
					++Client.field591;
				}
			}

			if (class372.regionLandArchiveIds[var1] != -1 && VarbitComposition.regionMapArchives[var1] == null) {
				VarbitComposition.regionMapArchives[var1] = VerticalAlignment.archive9.takeFileEncrypted(class372.regionLandArchiveIds[var1], 0, Projectile.xteaKeys[var1]);
				if (VarbitComposition.regionMapArchives[var1] == null) {
					var0 = false;
					++Client.field591;
				}
			}
		}

		if (!var0) {
			Client.field404 = 1;
		} else {
			Client.field576 = 0;
			var0 = true;

			int var3;
			int var4;
			for (var1 = 0; var1 < AsyncRestClient.regionLandArchives.length; ++var1) {
				byte[] var17 = VarbitComposition.regionMapArchives[var1];
				if (var17 != null) {
					var3 = (class131.regions[var1] >> 8) * 64 - Sound.topLevelWorldView.baseX;
					var4 = (class131.regions[var1] & 255) * 64 - Sound.topLevelWorldView.baseY;
					if (Client.isInInstance) {
						var3 = 10;
						var4 = 10;
					}

					var0 &= ReflectionCheck.method706(var17, var3, var4);
				}
			}

			if (!var0) {
				Client.field404 = 2;
			} else {
				if (Client.field404 != 0) {
					class391.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				MusicPatchNode2.method6884();
				Sound.topLevelWorldView.scene.clearTempGameObjects();

				for (var1 = 0; var1 < 4; ++var1) {
					Sound.topLevelWorldView.collisionMaps[var1].clear();
				}

				int var2;
				for (var1 = 0; var1 < 4; ++var1) {
					for (var2 = 0; var2 < 104; ++var2) {
						for (var3 = 0; var3 < 104; ++var3) {
							Sound.topLevelWorldView.tileSettings[var1][var2][var3] = 0;
						}
					}
				}

				MusicPatchNode2.method6884();
				Skills.method7912();
				var1 = AsyncRestClient.regionLandArchives.length;
				WorldMapArea.method6241();
				class242.method5121(true);
				int var5;
				if (!Client.isInInstance) {
					byte[] var16;
					for (var2 = 0; var2 < var1; ++var2) {
						var3 = (class131.regions[var2] >> 8) * 64 - Sound.topLevelWorldView.baseX;
						var4 = (class131.regions[var2] & 255) * 64 - Sound.topLevelWorldView.baseY;
						var16 = AsyncRestClient.regionLandArchives[var2];
						if (var16 != null) {
							MusicPatchNode2.method6884();
							HttpMethod.method80(Sound.topLevelWorldView, var16, var3, var4, HttpRequest.field52 * 8 - 48, WorldMapElement.field1941 * 8 - 48);
						}
					}

					for (var2 = 0; var2 < var1; ++var2) {
						var3 = (class131.regions[var2] >> 8) * 64 - Sound.topLevelWorldView.baseX;
						var4 = (class131.regions[var2] & 255) * 64 - Sound.topLevelWorldView.baseY;
						var16 = AsyncRestClient.regionLandArchives[var2];
						if (var16 == null && WorldMapElement.field1941 < 800) {
							MusicPatchNode2.method6884();
							Tiles.method2077(Sound.topLevelWorldView, var3, var4, 64, 64);
						}
					}

					class242.method5121(true);

					for (var2 = 0; var2 < var1; ++var2) {
						byte[] var15 = VarbitComposition.regionMapArchives[var2];
						if (var15 != null) {
							var4 = (class131.regions[var2] >> 8) * 64 - Sound.topLevelWorldView.baseX;
							var5 = (class131.regions[var2] & 255) * 64 - Sound.topLevelWorldView.baseY;
							MusicPatchNode2.method6884();
							HttpAuthenticationHeader.method9364(Sound.topLevelWorldView, var15, var4, var5);
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
						MusicPatchNode2.method6884();

						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								boolean var18 = false;
								var6 = Client.instanceChunkTemplates[var2][var3][var4];
								if (var6 != -1) {
									var7 = class300.method6623(var6);
									var8 = class188.method4106(var6);
									var9 = SpriteMask.method7212(var6);
									var10 = WorldMapRegion.method6426(var6);
									var11 = (var9 / 8 << 8) + var10 / 8;

									for (int var12 = 0; var12 < class131.regions.length; ++var12) {
										if (class131.regions[var12] == var11 && AsyncRestClient.regionLandArchives[var12] != null) {
											int var13 = (var9 - var3) * 8;
											int var14 = (var10 - var4) * 8;
											AuthenticationScheme.method3633(Sound.topLevelWorldView, AsyncRestClient.regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, var13, var14);
											var18 = true;
											break;
										}
									}
								}

								if (!var18) {
									SecureRandomCallable.method2078(Sound.topLevelWorldView.tileHeights, var2, var3 * 8, var4 * 8);
								}
							}
						}
					}

					for (var2 = 0; var2 < 13; ++var2) {
						for (var3 = 0; var3 < 13; ++var3) {
							var4 = Client.instanceChunkTemplates[0][var2][var3];
							if (var4 == -1) {
								Tiles.method2077(Sound.topLevelWorldView, var2 * 8, var3 * 8, 8, 8);
							}
						}
					}

					class242.method5121(true);

					for (var2 = 0; var2 < 4; ++var2) {
						MusicPatchNode2.method6884();

						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								var5 = Client.instanceChunkTemplates[var2][var3][var4];
								if (var5 != -1) {
									var6 = class300.method6623(var5);
									var7 = class188.method4106(var5);
									var8 = SpriteMask.method7212(var5);
									var9 = WorldMapRegion.method6426(var5);
									var10 = (var8 / 8 << 8) + var9 / 8;

									for (var11 = 0; var11 < class131.regions.length; ++var11) {
										if (class131.regions[var11] == var10 && VarbitComposition.regionMapArchives[var11] != null) {
											Tiles.method2024(Sound.topLevelWorldView, VarbitComposition.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7);
											break;
										}
									}
								}
							}
						}
					}
				}

				class242.method5121(true);
				MusicPatchNode2.method6884();
				FloorOverlayDefinition.method4536(Sound.topLevelWorldView);
				class242.method5121(true);
				var2 = Tiles.Tiles_minPlane;
				if (var2 > Sound.topLevelWorldView.plane) {
					var2 = Sound.topLevelWorldView.plane;
				}

				if (var2 < Sound.topLevelWorldView.plane - 1) {
					var2 = Sound.topLevelWorldView.plane - 1;
				}

				if (Client.isLowDetail) {
					Sound.topLevelWorldView.scene.init(Tiles.Tiles_minPlane);
				} else {
					Sound.topLevelWorldView.scene.init(0);
				}

				for (var3 = 0; var3 < 104; ++var3) {
					for (var4 = 0; var4 < 104; ++var4) {
						UserComparator10.updateItemPile3(Sound.topLevelWorldView, var3, var4);
					}
				}

				MusicPatchNode2.method6884();
				class393.method7980();
				ObjectComposition.ObjectDefinition_cachedModelData.clear();
				PacketBufferNode var19;
				if (class36.client.hasFrame()) {
					var19 = class139.getPacketBufferNode(ClientPacket.DETECT_MODIFIED_CLIENT, Client.packetWriter.isaacCipher);
					var19.packetBuffer.writeInt(1057001181);
					Client.packetWriter.addNode(var19);
				}

				if (!Client.isInInstance) {
					var3 = (HttpRequest.field52 - 6) / 8;
					var4 = (HttpRequest.field52 + 6) / 8;
					var5 = (WorldMapElement.field1941 - 6) / 8;
					var6 = (WorldMapElement.field1941 + 6) / 8;

					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) {
						for (var8 = var5 - 1; var8 <= var6 + 1; ++var8) {
							if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) {
								VerticalAlignment.archive9.loadRegionFromName("m" + var7 + "_" + var8);
								VerticalAlignment.archive9.loadRegionFromName("l" + var7 + "_" + var8);
							}
						}
					}
				}

				MusicPatchNode2.method6884();
				class269.method5881();
				var19 = class139.getPacketBufferNode(ClientPacket.MAP_BUILD_COMPLETE, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var19);
				FontName.method10484();
				Client.field441 = false;
			}
		}
	}
}
