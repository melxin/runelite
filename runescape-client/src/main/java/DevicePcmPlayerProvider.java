import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aw")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class105 {
	DevicePcmPlayerProvider() {
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Ldh;",
		garbageValue = "-1008109510"
	)
	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lox;IIII)V",
		garbageValue = "-1396170113"
	)
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field4147 == null) {
			throw new RuntimeException();
		} else {
			var0.field4147[var1] = var2;
			var0.field4055[var1] = var3;
		}
	}

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-402181825"
	)
	@Export("loadRegion")
	static final void loadRegion() {
		UserComparator8.method3491(false);
		Client.field453 = 0;
		boolean var0 = true;

		int var1;
		for (var1 = 0; var1 < class458.regionLandArchives.length; ++var1) {
			if (class108.regionMapArchiveIds[var1] != -1 && class458.regionLandArchives[var1] == null) {
				class458.regionLandArchives[var1] = class201.archive9.takeFile(class108.regionMapArchiveIds[var1], 0);
				if (class458.regionLandArchives[var1] == null) {
					var0 = false;
					++Client.field453;
				}
			}

			if (SequenceDefinition.regionLandArchiveIds[var1] != -1 && UserComparator6.regionMapArchives[var1] == null) {
				UserComparator6.regionMapArchives[var1] = class201.archive9.takeFileEncrypted(SequenceDefinition.regionLandArchiveIds[var1], 0, class86.xteaKeys[var1]);
				if (UserComparator6.regionMapArchives[var1] == null) {
					var0 = false;
					++Client.field453;
				}
			}
		}

		if (!var0) {
			Client.field393 = 1;
		} else {
			Client.field391 = 0;
			var0 = true;

			int var3;
			int var4;
			for (var1 = 0; var1 < class458.regionLandArchives.length; ++var1) {
				byte[] var17 = UserComparator6.regionMapArchives[var1];
				if (var17 != null) {
					var3 = (ItemContainer.regions[var1] >> 8) * 64 - class7.topLevelWorldView.baseX;
					var4 = (ItemContainer.regions[var1] & 255) * 64 - class7.topLevelWorldView.baseY;
					if (Client.isInInstance) {
						var3 = 10;
						var4 = 10;
					}

					var0 &= WallDecoration.method5786(var17, var3, var4);
				}
			}

			if (!var0) {
				Client.field393 = 2;
			} else {
				if (Client.field393 != 0) {
					WorldMapLabel.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				MouseHandler.method722();
				class7.topLevelWorldView.scene.clearTempGameObjects();

				for (var1 = 0; var1 < 4; ++var1) {
					class7.topLevelWorldView.collisionMaps[var1].clear();
				}

				int var2;
				for (var1 = 0; var1 < 4; ++var1) {
					for (var2 = 0; var2 < 104; ++var2) {
						for (var3 = 0; var3 < 104; ++var3) {
							class7.topLevelWorldView.tileSettings[var1][var2][var3] = 0;
						}
					}
				}

				MouseHandler.method722();
				class571.method11084();
				var1 = class458.regionLandArchives.length;
				class7.topLevelWorldView.method2641();
				UserComparator8.method3491(true);
				int var5;
				if (!Client.isInInstance) {
					byte[] var16;
					for (var2 = 0; var2 < var1; ++var2) {
						var3 = (ItemContainer.regions[var2] >> 8) * 64 - class7.topLevelWorldView.baseX;
						var4 = (ItemContainer.regions[var2] & 255) * 64 - class7.topLevelWorldView.baseY;
						var16 = class458.regionLandArchives[var2];
						if (var16 != null) {
							MouseHandler.method722();
							class419.method8597(class7.topLevelWorldView, var16, var3, var4, BuddyRankComparator.field1574 * 8 - 48, class140.field1692 * 8 - 48);
						}
					}

					for (var2 = 0; var2 < var1; ++var2) {
						var3 = (ItemContainer.regions[var2] >> 8) * 64 - class7.topLevelWorldView.baseX;
						var4 = (ItemContainer.regions[var2] & 255) * 64 - class7.topLevelWorldView.baseY;
						var16 = class458.regionLandArchives[var2];
						if (var16 == null && class140.field1692 < 800) {
							MouseHandler.method722();
							WorldMapID.method6814(class7.topLevelWorldView, var3, var4, 64, 64);
						}
					}

					UserComparator8.method3491(true);

					for (var2 = 0; var2 < var1; ++var2) {
						byte[] var15 = UserComparator6.regionMapArchives[var2];
						if (var15 != null) {
							var4 = (ItemContainer.regions[var2] >> 8) * 64 - class7.topLevelWorldView.baseX;
							var5 = (ItemContainer.regions[var2] & 255) * 64 - class7.topLevelWorldView.baseY;
							MouseHandler.method722();
							class414.method8524(class7.topLevelWorldView, var15, var4, var5);
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
						MouseHandler.method722();

						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								boolean var18 = false;
								var6 = Client.instanceChunkTemplates[var2][var3][var4];
								if (var6 != -1) {
									var7 = class268.method6040(var6);
									var8 = Varcs.method2868(var6);
									var9 = MusicPatchNode2.method7087(var6);
									var10 = class149.method3791(var6);
									var11 = (var9 / 8 << 8) + var10 / 8;

									for (int var12 = 0; var12 < ItemContainer.regions.length; ++var12) {
										if (ItemContainer.regions[var12] == var11 && class458.regionLandArchives[var12] != null) {
											int var13 = (var9 - var3) * 8;
											int var14 = (var10 - var4) * 8;
											Varcs.method2871(class7.topLevelWorldView, class458.regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, var13, var14);
											var18 = true;
											break;
										}
									}
								}

								if (!var18) {
									class348.method7355(class7.topLevelWorldView.tileHeights, var2, var3 * 8, var4 * 8);
								}
							}
						}
					}

					for (var2 = 0; var2 < 13; ++var2) {
						for (var3 = 0; var3 < 13; ++var3) {
							var4 = Client.instanceChunkTemplates[0][var2][var3];
							if (var4 == -1) {
								WorldMapID.method6814(class7.topLevelWorldView, var2 * 8, var3 * 8, 8, 8);
							}
						}
					}

					UserComparator8.method3491(true);

					for (var2 = 0; var2 < 4; ++var2) {
						MouseHandler.method722();

						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								var5 = Client.instanceChunkTemplates[var2][var3][var4];
								if (var5 != -1) {
									var6 = class268.method6040(var5);
									var7 = Varcs.method2868(var5);
									var8 = MusicPatchNode2.method7087(var5);
									var9 = class149.method3791(var5);
									var10 = (var8 / 8 << 8) + var9 / 8;

									for (var11 = 0; var11 < ItemContainer.regions.length; ++var11) {
										if (ItemContainer.regions[var11] == var10 && UserComparator6.regionMapArchives[var11] != null) {
											Tiles.method2039(class7.topLevelWorldView, UserComparator6.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7);
											break;
										}
									}
								}
							}
						}
					}
				}

				UserComparator8.method3491(true);
				MouseHandler.method722();
				class162.method3975(class7.topLevelWorldView);
				UserComparator8.method3491(true);
				var2 = Tiles.Tiles_minPlane;
				if (var2 > class7.topLevelWorldView.plane) {
					var2 = class7.topLevelWorldView.plane;
				}

				if (var2 < class7.topLevelWorldView.plane - 1) {
					var2 = class7.topLevelWorldView.plane - 1;
				}

				if (Client.isLowDetail) {
					class7.topLevelWorldView.scene.init(Tiles.Tiles_minPlane);
				} else {
					class7.topLevelWorldView.scene.init(0);
				}

				for (var3 = 0; var3 < 104; ++var3) {
					for (var4 = 0; var4 < 104; ++var4) {
						class165.updateItemPile3(class7.topLevelWorldView, var3, var4);
					}
				}

				MouseHandler.method722();
				Widget.method8065();
				ObjectComposition.ObjectDefinition_cachedModelData.clear();
				PacketBufferNode var19;
				if (Language.client.hasFrame()) {
					var19 = class291.getPacketBufferNode(ClientPacket.DETECT_MODIFIED_CLIENT, Client.packetWriter.isaacCipher);
					var19.packetBuffer.writeInt(1057001181);
					Client.packetWriter.addNode(var19);
				}

				if (!Client.isInInstance) {
					var3 = (BuddyRankComparator.field1574 - 6) / 8;
					var4 = (BuddyRankComparator.field1574 + 6) / 8;
					var5 = (class140.field1692 - 6) / 8;
					var6 = (class140.field1692 + 6) / 8;

					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) {
						for (var8 = var5 - 1; var8 <= var6 + 1; ++var8) {
							if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) {
								class201.archive9.loadRegionFromName("m" + var7 + "_" + var8);
								class201.archive9.loadRegionFromName("l" + var7 + "_" + var8);
							}
						}
					}
				}

				MouseHandler.method722();
				Script.method1980();
				var19 = class291.getPacketBufferNode(ClientPacket.MAP_BUILD_COMPLETE, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var19);
				class62.method2111();
				Client.field431 = false;
			}
		}
	}
}
