import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("sb")
@Implements("FadeOutTask")
public class FadeOutTask extends SongTask {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	MidiRequest field5294;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 288721377
	)
	int field5292;

	@ObfuscatedSignature(
		descriptor = "(Lsi;IZI)V"
	)
	public FadeOutTask(SongTask var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field5294 = null;
		this.field5292 = 0;
		super.field5303 = "FadeOutTask";
		if (var2 >= 0) {
			if (var3 && var2 < class339.field3895.size()) {
				this.field5294 = (MidiRequest)class339.field3895.get(var2);
			} else if (!var3 && var2 < class339.midiRequests.size()) {
				this.field5294 = (MidiRequest)class339.midiRequests.get(var2);
			}

			this.field5292 = var4;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "40"
	)
	public boolean vmethod9673() {
		if (this.field5294 != null && this.field5294.midiPcmStream != null) {
			this.field5294.field4010 = true;

			try {
				if (this.field5294.field4002 > 0.0F && this.field5294.midiPcmStream.isReady()) {
					float var1 = this.field5292 == 0 ? (float)this.field5292 : (float)this.field5294.musicTrackVolume / (float)this.field5292;
					MidiRequest var10000 = this.field5294;
					var10000.field4002 -= var1 == 0.0F ? (float)this.field5294.musicTrackVolume : var1;
					if (this.field5294.field4002 < 0.0F) {
						this.field5294.field4002 = 0.0F;
					}

					this.field5294.midiPcmStream.setPcmStreamVolume((int)this.field5294.field4002);
					return false;
				}
			} catch (Exception var3) {
				this.method9659(var3.getMessage());
				return true;
			}

			this.field5294.field4010 = false;
			return true;
		} else {
			return true;
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ILcg;ZS)I",
		garbageValue = "128"
	)
	static int method9652(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) {
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = MouseHandler.getWindowedMode();
			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) {
				var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					ParamComposition.setWindowedMode(var3);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) {
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = class36.clientPreferences.getWindowMode();
				return 1;
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) {
				if (var0 == 5310) {
					--UserComparator7.Interpreter_intStackSize;
					return 1;
				} else {
					return 2;
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					class36.clientPreferences.updateWindowMode(var3);
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-533281127"
	)
	@Export("loadRegion")
	static final void loadRegion() {
		WorldMapLabelSize.method6372(false);
		Client.field410 = 0;
		boolean var0 = true;

		int var1;
		for (var1 = 0; var1 < UrlRequester.regionLandArchives.length; ++var1) {
			if (SequenceDefinition.regionMapArchiveIds[var1] != -1 && UrlRequester.regionLandArchives[var1] == null) {
				UrlRequester.regionLandArchives[var1] = LoginPacket.archive9.takeFile(SequenceDefinition.regionMapArchiveIds[var1], 0);
				if (UrlRequester.regionLandArchives[var1] == null) {
					var0 = false;
					++Client.field410;
				}
			}

			if (class386.regionLandArchiveIds[var1] != -1 && VarcInt.regionMapArchives[var1] == null) {
				VarcInt.regionMapArchives[var1] = LoginPacket.archive9.takeFileEncrypted(class386.regionLandArchiveIds[var1], 0, class267.xteaKeys[var1]);
				if (VarcInt.regionMapArchives[var1] == null) {
					var0 = false;
					++Client.field410;
				}
			}
		}

		if (!var0) {
			Client.field476 = 1;
		} else {
			Client.field329 = 0;
			var0 = true;

			int var3;
			int var4;
			for (var1 = 0; var1 < UrlRequester.regionLandArchives.length; ++var1) {
				byte[] var17 = VarcInt.regionMapArchives[var1];
				if (var17 != null) {
					var3 = (class405.regions[var1] >> 8) * 64 - class333.topLevelWorldView.baseX;
					var4 = (class405.regions[var1] & 255) * 64 - class333.topLevelWorldView.baseY;
					if (Client.isInInstance) {
						var3 = 10;
						var4 = 10;
					}

					var0 &= HorizontalAlignment.method4320(var17, var3, var4);
				}
			}

			if (!var0) {
				Client.field476 = 2;
			} else {
				if (Client.field476 != 0) {
					class464.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				UserComparator5.method3557();
				class333.topLevelWorldView.scene.clearTempGameObjects();

				for (var1 = 0; var1 < 4; ++var1) {
					class333.topLevelWorldView.collisionMaps[var1].clear();
				}

				int var2;
				for (var1 = 0; var1 < 4; ++var1) {
					for (var2 = 0; var2 < 104; ++var2) {
						for (var3 = 0; var3 < 104; ++var3) {
							class333.topLevelWorldView.tileSettings[var1][var2][var3] = 0;
						}
					}
				}

				UserComparator5.method3557();
				ArchiveLoader.method2093();
				var1 = UrlRequester.regionLandArchives.length;
				class333.topLevelWorldView.method2686();
				WorldMapLabelSize.method6372(true);
				int var5;
				if (!Client.isInInstance) {
					byte[] var16;
					for (var2 = 0; var2 < var1; ++var2) {
						var3 = (class405.regions[var2] >> 8) * 64 - class333.topLevelWorldView.baseX;
						var4 = (class405.regions[var2] & 255) * 64 - class333.topLevelWorldView.baseY;
						var16 = UrlRequester.regionLandArchives[var2];
						if (var16 != null) {
							UserComparator5.method3557();
							MusicPatch.method7331(class333.topLevelWorldView, var16, var3, var4, class269.field3187 * 8 - 48, SpotAnimationDefinition.field2210 * 8 - 48);
						}
					}

					for (var2 = 0; var2 < var1; ++var2) {
						var3 = (class405.regions[var2] >> 8) * 64 - class333.topLevelWorldView.baseX;
						var4 = (class405.regions[var2] & 255) * 64 - class333.topLevelWorldView.baseY;
						var16 = UrlRequester.regionLandArchives[var2];
						if (var16 == null && SpotAnimationDefinition.field2210 < 800) {
							UserComparator5.method3557();
							class443.method8868(class333.topLevelWorldView, var3, var4, 64, 64);
						}
					}

					WorldMapLabelSize.method6372(true);

					for (var2 = 0; var2 < var1; ++var2) {
						byte[] var15 = VarcInt.regionMapArchives[var2];
						if (var15 != null) {
							var4 = (class405.regions[var2] >> 8) * 64 - class333.topLevelWorldView.baseX;
							var5 = (class405.regions[var2] & 255) * 64 - class333.topLevelWorldView.baseY;
							UserComparator5.method3557();
							CollisionMap.method6229(class333.topLevelWorldView, var15, var4, var5);
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
						UserComparator5.method3557();

						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								boolean var18 = false;
								var6 = Client.instanceChunkTemplates[var2][var3][var4];
								if (var6 != -1) {
									var7 = ClanChannelMember.method3835(var6);
									var8 = ArchiveLoader.method2087(var6);
									var9 = GameObject.method5796(var6);
									var10 = GameEngine.method689(var6);
									var11 = (var9 / 8 << 8) + var10 / 8;

									for (int var12 = 0; var12 < class405.regions.length; ++var12) {
										if (class405.regions[var12] == var11 && UrlRequester.regionLandArchives[var12] != null) {
											int var13 = (var9 - var3) * 8;
											int var14 = (var10 - var4) * 8;
											UserComparator7.method3545(class333.topLevelWorldView, UrlRequester.regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, var13, var14);
											var18 = true;
											break;
										}
									}
								}

								if (!var18) {
									class173.method4095(class333.topLevelWorldView.tileHeights, var2, var3 * 8, var4 * 8);
								}
							}
						}
					}

					for (var2 = 0; var2 < 13; ++var2) {
						for (var3 = 0; var3 < 13; ++var3) {
							var4 = Client.instanceChunkTemplates[0][var2][var3];
							if (var4 == -1) {
								class443.method8868(class333.topLevelWorldView, var2 * 8, var3 * 8, 8, 8);
							}
						}
					}

					WorldMapLabelSize.method6372(true);

					for (var2 = 0; var2 < 4; ++var2) {
						UserComparator5.method3557();

						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								var5 = Client.instanceChunkTemplates[var2][var3][var4];
								if (var5 != -1) {
									var6 = ClanChannelMember.method3835(var5);
									var7 = ArchiveLoader.method2087(var5);
									var8 = GameObject.method5796(var5);
									var9 = GameEngine.method689(var5);
									var10 = (var8 / 8 << 8) + var9 / 8;

									for (var11 = 0; var11 < class405.regions.length; ++var11) {
										if (class405.regions[var11] == var10 && VarcInt.regionMapArchives[var11] != null) {
											Tiles.method2034(class333.topLevelWorldView, VarcInt.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7);
											break;
										}
									}
								}
							}
						}
					}
				}

				WorldMapLabelSize.method6372(true);
				UserComparator5.method3557();
				RouteStrategy.method6233(class333.topLevelWorldView);
				WorldMapLabelSize.method6372(true);
				var2 = Tiles.Tiles_minPlane;
				if (var2 > class333.topLevelWorldView.plane) {
					var2 = class333.topLevelWorldView.plane;
				}

				if (var2 < class333.topLevelWorldView.plane - 1) {
					var2 = class333.topLevelWorldView.plane - 1;
				}

				if (Client.isLowDetail) {
					class333.topLevelWorldView.scene.init(Tiles.Tiles_minPlane);
				} else {
					class333.topLevelWorldView.scene.init(0);
				}

				for (var3 = 0; var3 < 104; ++var3) {
					for (var4 = 0; var4 < 104; ++var4) {
						DirectByteArrayCopier.updateItemPile3(class333.topLevelWorldView, var3, var4);
					}
				}

				UserComparator5.method3557();
				Tiles.method2066();
				ObjectComposition.ObjectDefinition_cachedModelData.clear();
				PacketBufferNode var19;
				if (class521.client.hasFrame()) {
					var19 = UserComparator6.getPacketBufferNode(ClientPacket.DETECT_MODIFIED_CLIENT, Client.packetWriter.isaacCipher);
					var19.packetBuffer.writeInt(1057001181);
					Client.packetWriter.addNode(var19);
				}

				if (!Client.isInInstance) {
					var3 = (class269.field3187 - 6) / 8;
					var4 = (class269.field3187 + 6) / 8;
					var5 = (SpotAnimationDefinition.field2210 - 6) / 8;
					var6 = (SpotAnimationDefinition.field2210 + 6) / 8;

					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) {
						for (var8 = var5 - 1; var8 <= var6 + 1; ++var8) {
							if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) {
								LoginPacket.archive9.loadRegionFromName("m" + var7 + "_" + var8);
								LoginPacket.archive9.loadRegionFromName("l" + var7 + "_" + var8);
							}
						}
					}
				}

				UserComparator5.method3557();
				NPCComposition.method4383();
				var19 = UserComparator6.getPacketBufferNode(ClientPacket.MAP_BUILD_COMPLETE, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var19);
				class144.method3738();
				Client.field556 = false;
			}
		}
	}
}
