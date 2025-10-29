import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("os")
public enum class383 implements Enum {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	field4380(0),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	field4383(1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	field4381(2),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	field4382(3),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	field4379(4);

	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -64238307
	)
	final int field4384;

	class383(int var3) {
		this.field4384 = var3;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "20"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4384;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Lcu;",
		garbageValue = "257085052"
	)
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = (Script)Script.Script_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = WorldMapRectangle.archive12.takeFile(var0, 0);
			if (var2 == null) {
				return null;
			} else {
				var1 = UserComparator3.newScript(var2);
				Script.Script_cached.put(var1, (long)var0);
				return var1;
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lut;Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "921778921"
	)
	public static String method8350(DynamicArray var0, String var1) {
		ProjectionCoord.method9359(var0, class586.field5939);
		int var2 = var0.method10652();
		String[] var3 = (String[])((String[])var0.method10681());
		if (var2 == 0) {
			return "";
		} else if (var2 == 1) {
			return var3[0];
		} else {
			int var4 = var1.length();
			int var5 = var4 * (var2 - 1);

			for (int var6 = 0; var6 < var2; ++var6) {
				var5 += var3[var6].length();
			}

			char[] var9 = new char[var5];
			int var7 = 0;

			for (int var8 = 0; var8 < var2; ++var8) {
				if (var8 > 0) {
					var1.getChars(0, var4, var9, var7);
					var7 += var4;
				}

				var3[var8].getChars(0, var3[var8].length(), var9, var7);
				var7 += var3[var8].length();
			}

			return new String(var9);
		}
	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1315018704"
	)
	@Export("loadRegion")
	static final void loadRegion() {
		class228.method5080(false);
		Client.field373 = 0;
		boolean var0 = true;

		int var1;
		for (var1 = 0; var1 < class160.regionLandArchives.length; ++var1) {
			if (FaceNormal.regionMapArchiveIds[var1] != -1 && class160.regionLandArchives[var1] == null) {
				class160.regionLandArchives[var1] = Tile.archive9.takeFile(FaceNormal.regionMapArchiveIds[var1], 0);
				if (class160.regionLandArchives[var1] == null) {
					var0 = false;
					++Client.field373;
				}
			}

			if (class210.regionLandArchiveIds[var1] != -1 && class148.regionMapArchives[var1] == null) {
				class148.regionMapArchives[var1] = Tile.archive9.takeFileEncrypted(class210.regionLandArchiveIds[var1], 0, SpriteBufferProperties.xteaKeys[var1]);
				if (class148.regionMapArchives[var1] == null) {
					var0 = false;
					++Client.field373;
				}
			}
		}

		if (!var0) {
			Client.field356 = 1;
		} else {
			Client.field375 = 0;
			var0 = true;

			int var3;
			int var4;
			for (var1 = 0; var1 < class160.regionLandArchives.length; ++var1) {
				byte[] var17 = class148.regionMapArchives[var1];
				if (var17 != null) {
					var3 = (Script.regions[var1] >> 8) * 64 - Occluder.topLevelWorldView.baseX;
					var4 = (Script.regions[var1] & 255) * 64 - Occluder.topLevelWorldView.baseY;
					if (Client.isInInstance) {
						var3 = 10;
						var4 = 10;
					}

					var0 &= ClanChannelMember.method3985(var17, var3, var4);
				}
			}

			if (!var0) {
				Client.field356 = 2;
			} else {
				if (Client.field356 != 0) {
					HttpMethod.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				HttpRequestTask.method290();
				Occluder.topLevelWorldView.scene.clearTempGameObjects();

				for (var1 = 0; var1 < 4; ++var1) {
					Occluder.topLevelWorldView.collisionMaps[var1].clear();
				}

				int var2;
				for (var1 = 0; var1 < 4; ++var1) {
					for (var2 = 0; var2 < 104; ++var2) {
						for (var3 = 0; var3 < 104; ++var3) {
							Occluder.topLevelWorldView.tileSettings[var1][var2][var3] = 0;
						}
					}
				}

				HttpRequestTask.method290();
				SoundSystem.method3227();
				var1 = class160.regionLandArchives.length;
				Occluder.topLevelWorldView.method2770();
				class228.method5080(true);
				int var5;
				if (!Client.isInInstance) {
					byte[] var16;
					for (var2 = 0; var2 < var1; ++var2) {
						var3 = (Script.regions[var2] >> 8) * 64 - Occluder.topLevelWorldView.baseX;
						var4 = (Script.regions[var2] & 255) * 64 - Occluder.topLevelWorldView.baseY;
						var16 = class160.regionLandArchives[var2];
						if (var16 != null) {
							HttpRequestTask.method290();
							class337.method7281(Occluder.topLevelWorldView, var16, var3, var4, HealthBarUpdate.field1081 * 8 - 48, ScriptFrame.field210 * 8 - 48);
						}
					}

					for (var2 = 0; var2 < var1; ++var2) {
						var3 = (Script.regions[var2] >> 8) * 64 - Occluder.topLevelWorldView.baseX;
						var4 = (Script.regions[var2] & 255) * 64 - Occluder.topLevelWorldView.baseY;
						var16 = class160.regionLandArchives[var2];
						if (var16 == null && ScriptFrame.field210 < 800) {
							HttpRequestTask.method290();
							ScriptFrame.method749(Occluder.topLevelWorldView, var3, var4, 64, 64);
						}
					}

					class228.method5080(true);

					for (var2 = 0; var2 < var1; ++var2) {
						byte[] var15 = class148.regionMapArchives[var2];
						if (var15 != null) {
							var4 = (Script.regions[var2] >> 8) * 64 - Occluder.topLevelWorldView.baseX;
							var5 = (Script.regions[var2] & 255) * 64 - Occluder.topLevelWorldView.baseY;
							HttpRequestTask.method290();
							DynamicObject.method2054(Occluder.topLevelWorldView, var15, var4, var5);
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
						HttpRequestTask.method290();

						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								boolean var18 = false;
								var6 = Client.instanceChunkTemplates[var2][var3][var4];
								if (var6 != -1) {
									var7 = class225.method5054(var6);
									var8 = VarbitComposition.method4673(var6);
									var9 = class498.method10142(var6);
									var10 = Renderable.method5835(var6);
									var11 = (var9 / 8 << 8) + var10 / 8;

									for (int var12 = 0; var12 < Script.regions.length; ++var12) {
										if (Script.regions[var12] == var11 && class160.regionLandArchives[var12] != null) {
											int var13 = (var9 - var3) * 8;
											int var14 = (var10 - var4) * 8;
											SequenceDefinition.method4986(Occluder.topLevelWorldView, class160.regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, var13, var14);
											var18 = true;
											break;
										}
									}
								}

								if (!var18) {
									class226.method5057(Occluder.topLevelWorldView.tileHeights, var2, var3 * 8, var4 * 8);
								}
							}
						}
					}

					for (var2 = 0; var2 < 13; ++var2) {
						for (var3 = 0; var3 < 13; ++var3) {
							var4 = Client.instanceChunkTemplates[0][var2][var3];
							if (var4 == -1) {
								ScriptFrame.method749(Occluder.topLevelWorldView, var2 * 8, var3 * 8, 8, 8);
							}
						}
					}

					class228.method5080(true);

					for (var2 = 0; var2 < 4; ++var2) {
						HttpRequestTask.method290();

						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								var5 = Client.instanceChunkTemplates[var2][var3][var4];
								if (var5 != -1) {
									var6 = class225.method5054(var5);
									var7 = VarbitComposition.method4673(var5);
									var8 = class498.method10142(var5);
									var9 = Renderable.method5835(var5);
									var10 = (var8 / 8 << 8) + var9 / 8;

									for (var11 = 0; var11 < Script.regions.length; ++var11) {
										if (Script.regions[var11] == var10 && class148.regionMapArchives[var11] != null) {
											Tiles.method2092(Occluder.topLevelWorldView, class148.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7);
											break;
										}
									}
								}
							}
						}
					}
				}

				class228.method5080(true);
				HttpRequestTask.method290();
				class470.method9712(Occluder.topLevelWorldView);
				class228.method5080(true);
				var2 = Tiles.Tiles_minPlane;
				if (var2 > Occluder.topLevelWorldView.plane) {
					var2 = Occluder.topLevelWorldView.plane;
				}

				if (var2 < Occluder.topLevelWorldView.plane - 1) {
					var2 = Occluder.topLevelWorldView.plane - 1;
				}

				if (Client.isLowDetail) {
					Occluder.topLevelWorldView.scene.init(Tiles.Tiles_minPlane);
				} else {
					Occluder.topLevelWorldView.scene.init(0);
				}

				for (var3 = 0; var3 < 104; ++var3) {
					for (var4 = 0; var4 < 104; ++var4) {
						ConcurrentMidiTask.updateItemPile3(Occluder.topLevelWorldView, var3, var4);
					}
				}

				HttpRequestTask.method290();
				class426.method8758();
				ObjectComposition.ObjectDefinition_cachedModelData.clear();
				PacketBufferNode var19;
				if (SecureUrlRequester.client.hasFrame()) {
					var19 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3600, Client.packetWriter.isaacCipher);
					var19.packetBuffer.writeInt(1057001181);
					Client.packetWriter.addNode(var19);
				}

				if (!Client.isInInstance) {
					var3 = (HealthBarUpdate.field1081 - 6) / 8;
					var4 = (HealthBarUpdate.field1081 + 6) / 8;
					var5 = (ScriptFrame.field210 - 6) / 8;
					var6 = (ScriptFrame.field210 + 6) / 8;

					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) {
						for (var8 = var5 - 1; var8 <= var6 + 1; ++var8) {
							if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) {
								Tile.archive9.loadRegionFromName("m" + var7 + "_" + var8);
								Tile.archive9.loadRegionFromName("l" + var7 + "_" + var8);
							}
						}
					}
				}

				HttpRequestTask.method290();
				InterfaceParent.method2179();
				var19 = ReflectionCheck.getPacketBufferNode(ClientPacket.MAP_BUILD_COMPLETE, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var19);
				HttpResponse.method314();
				Client.field489 = false;
			}
		}
	}

	@ObfuscatedName("oq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1847847248"
	)
	static final void method8349(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		class468.clientPreferences.updateAreaSoundEffectsVolume(var0);
	}
}
