import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dl")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "[Lvf;"
	)
	@Export("crossSprites")
	static SpritePixels[] crossSprites;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 806302351
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1027900291
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		descriptor = "(Lok;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0;
		this.archive = var1;
		this.groupCount = var1.getGroupCount();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1114413689"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0;

		for (int var1 = 0; var1 < this.groupCount; ++var1) {
			if (!this.archive.method7684(var1) || this.archive.method7720(var1)) {
				++this.loadedCount;
			}
		}

		return this.loadedCount >= this.groupCount;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)[Ltl;",
		garbageValue = "-1280910138"
	)
	static class495[] method2586() {
		return new class495[]{class495.field5119, class495.field5125, class495.field5121, class495.field5122};
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "0"
	)
	static final boolean method2587(int var0) {
		boolean var1 = var0 == 14 || var0 == 15 || var0 >= 44 && var0 <= 51;
		boolean var2 = var1 || class212.method4905(var0) || PlayerComposition.method7125(var0) || class544.method10126(var0);
		if (!var2) {
			boolean var3 = var0 == 1002 || var0 == 1003 || var0 == 1004;
			var2 = var3;
		}

		return var2;
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "688799447"
	)
	static void method2581() {
		if (Client.field533 == class95.field1157) {
			World.soundEffectsArchive = class92.newArchive(class389.field4556.field4567, false, true, true, false);
			class544.archive6 = class92.newArchive(class389.field4555.field4567, true, true, true, false);
			PcmPlayer.archive8 = class92.newArchive(class389.field4557.field4567, false, true, true, false);
			class166.archive10 = class92.newArchive(class389.field4559.field4567, false, true, true, false);
			class220.archive13 = class92.newArchive(class389.field4562.field4567, true, false, true, false);
			class221.field2421 = class92.newArchive(class389.field4563.field4567, false, true, true, false);
			ClanSettings.field1762 = class92.newArchive(class389.field4564.field4567, false, true, true, false);
			FaceNormal.field2120 = class92.newArchive(class389.field4548.field4567, true, true, true, false);
			GraphicsObject.method2357(20, "Connecting to update server");
			Clock.method5078(class95.field1151);
		} else {
			int var20;
			byte var26;
			if (class95.field1151 == Client.field533) {
				var26 = 0;
				var20 = var26 + World.soundEffectsArchive.percentage() * 53 / 100;
				var20 += class544.archive6.percentage() * 5 / 100;
				var20 += PcmPlayer.archive8.percentage() * 36 / 100;
				var20 += class166.archive10.percentage() / 100;
				var20 += class220.archive13.percentage() / 100;
				var20 += class221.field2421.percentage() * 2 / 100;
				var20 += ClanSettings.field1762.percentage() / 100;
				var20 += FaceNormal.field2120.method7674() && FaceNormal.field2120.isFullyLoaded() ? 1 : 0;
				if (var20 != 100) {
					if (var20 != 0) {
						GraphicsObject.method2357(30, "Checking for updates - " + var20 + "%");
					}

				} else {
					GameEngine.method677(World.soundEffectsArchive, "Sound FX");
					GameEngine.method677(class544.archive6, "Music Tracks");
					GameEngine.method677(PcmPlayer.archive8, "Sprites");
					GameEngine.method677(class221.field2421, "Music Samples");
					GameEngine.method677(ClanSettings.field1762, "Music Patches");
					class30.field133 = new GraphicsDefaults();
					class30.field133.decode(FaceNormal.field2120);
					GraphicsObject.method2357(40, "Loaded update list");
					Clock.method5078(class95.field1150);
				}
			} else {
				int var3;
				if (class95.field1150 != Client.field533) {
					if (class95.field1154 == Client.field533) {
						if (VerticalAlignment.field2674 == null) {
							VerticalAlignment.field2674 = new Fonts(PcmPlayer.archive8, class220.archive13);
						}

						var20 = FontName.method9935().length;
						Client.fontsMap = VerticalAlignment.field2674.createMap(FontName.method9935());
						if (Client.fontsMap.size() < var20) {
							GraphicsObject.method2357(80, "Loading fonts - " + Client.fontsMap.size() * 100 / var20 + "%");
						} else {
							FontName.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11);
							HealthBarUpdate.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12);
							GraphicsObject.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12);
							class437.platformInfo = Client.field686.get();
							GraphicsObject.method2357(80, "Loaded fonts");
							Clock.method5078(class95.field1155);
						}
					} else {
						Archive var5;
						Archive var21;
						Archive var22;
						if (Client.field533 == class95.field1155) {
							var21 = class166.archive10;
							var22 = PcmPlayer.archive8;
							var3 = 0;
							String[] var25 = Login.field956;

							int var15;
							String var19;
							for (var15 = 0; var15 < var25.length; ++var15) {
								var19 = var25[var15];
								if (var21.tryLoadFileByNames(var19, "")) {
									++var3;
								}
							}

							var25 = Login.field960;

							for (var15 = 0; var15 < var25.length; ++var15) {
								var19 = var25[var15];
								if (var22.tryLoadFileByNames(var19, "")) {
									++var3;
								}
							}

							var25 = Login.field958;

							for (var15 = 0; var15 < var25.length; ++var15) {
								var19 = var25[var15];
								if (var22.getGroupId(var19) != -1 && var22.tryLoadFileByNames(var19, "")) {
									++var3;
								}
							}

							var5 = PcmPlayer.archive8;
							int var16 = Login.field960.length + Login.field956.length;
							String[] var7 = Login.field958;

							for (int var8 = 0; var8 < var7.length; ++var8) {
								String var9 = var7[var8];
								if (var5.getGroupId(var9) != -1) {
									++var16;
								}
							}

							if (var3 < var16) {
								GraphicsObject.method2357(90, "Loading title screen - " + var3 * 100 / var16 + "%");
							} else {
								GraphicsObject.method2357(100, "Loaded title screen");
								if (class273.field3035) {
									class360.updateGameState(5);
									Clock.method5078(class95.field1160);
								} else {
									Clock.method5078(class95.field1153);
								}

							}
						} else if (Client.field533 == class95.field1160) {
							class360.updateGameState(10);
						} else {
							int var1;
							Archive var18;
							if (class95.field1153 == Client.field533) {
								GraphicsDefaults.field5117 = class92.newArchive(class389.field4549.field4567, false, true, true, false);
								FloatProjection.field2104 = class92.newArchive(class389.field4558.field4567, false, true, true, false);
								class268.archive2 = class92.newArchive(class389.field4571.field4567, true, false, true, false);
								SoundCache.archive4 = class92.newArchive(class389.field4552.field4567, false, true, true, false);
								LoginState.archive9 = class92.newArchive(class389.field4554.field4567, true, true, true, false);
								class59.field398 = class92.newArchive(class389.field4565.field4567, false, true, true, false);
								SpotAnimationDefinition.field2704 = class92.newArchive(class389.field4553.field4567, false, true, true, false);
								WorldMapSection2.field3102 = class92.newArchive(class389.field4560.field4567, false, true, true, false);
								class167.archive12 = class92.newArchive(class389.field4561.field4567, false, true, true, false);
								StructComposition.field2746 = class92.newArchive(class389.field4566.field4567, false, true, true, false);
								Sound.field1718 = class92.newArchive(class389.field4551.field4567, false, true, true, false);
								class137.field1603 = class92.newArchive(class389.field4568.field4567, false, true, true, false);
								HitSplatDefinition.field2777 = class92.newArchive(class389.field4569.field4567, false, true, true, false);
								var1 = class389.field4570.field4567;
								ArchiveDisk var23 = null;
								if (JagexCache.JagexCache_dat2File != null) {
									var23 = new ArchiveDisk(var1, JagexCache.JagexCache_dat2File, UserComparator4.JagexCache_idxFiles[var1], 1000000);
								}

								var18 = new Archive(var23, ReflectionCheck.masterDisk, HitSplatDefinition.field2760, var1, false, true, true, true, true);
								class88.field1069 = var18;
								GraphicsObject.method2357(20, "Connecting to update server");
								Clock.method5078(class95.field1152);
							} else if (Client.field533 == class95.field1152) {
								var26 = 0;
								var20 = var26 + GraphicsDefaults.field5117.percentage() * 5 / 100;
								var20 += FloatProjection.field2104.percentage() * 2 / 100;
								var20 += class268.archive2.percentage() / 100;
								var20 += SoundCache.archive4.percentage() / 100;
								var20 += LoginState.archive9.percentage() * 10 / 100;
								var20 += class59.field398.percentage() * 65 / 100;
								var20 += SpotAnimationDefinition.field2704.percentage() / 100;
								var20 += WorldMapSection2.field3102.percentage() / 100;
								var20 += class167.archive12.percentage() * 6 / 100;
								var20 += Sound.field1718.percentage() / 100;
								var20 += StructComposition.field2746.percentage() * 2 / 100;
								var20 += class137.field1603.percentage() * 2 / 100;
								var20 += HitSplatDefinition.field2777.percentage() / 100;
								var20 += class88.field1069.percentage() * 2 / 100;
								if (var20 != 100) {
									if (var20 != 0) {
										GraphicsObject.method2357(30, "Checking for updates - " + var20 + "%");
									}

								} else {
									GameEngine.method677(GraphicsDefaults.field5117, "Animations");
									GameEngine.method677(FloatProjection.field2104, "Skeletons");
									GameEngine.method677(LoginState.archive9, "Maps");
									GameEngine.method677(class59.field398, "Models");
									GameEngine.method677(WorldMapSection2.field3102, "Music Jingles");
									GameEngine.method677(Sound.field1718, "World Map");
									GameEngine.method677(StructComposition.field2746, "World Map Geography");
									GameEngine.method677(class137.field1603, "World Map Ground");
									GraphicsObject.method2357(30, "Loaded update list");
									Clock.method5078(class95.field1165);
								}
							} else if (class95.field1165 == Client.field533) {
								GameEngine.topLevelWorldView = Client.worldViewManager.method2712(104, 104, class544.clientPreferences.getDrawDistance());
								class30.worldView = GameEngine.topLevelWorldView;
								class174.sceneMinimapSprite = new SpritePixels(512, 512);
								GraphicsObject.method2357(30, "Starting game engine...");
								Clock.method5078(class95.field1149);
							} else if (class95.field1149 == Client.field533) {
								if (!class268.archive2.isFullyLoaded()) {
									GraphicsObject.method2357(40, "Loading config - " + class268.archive2.loadPercent() + "%");
								} else if (!HitSplatDefinition.field2777.isFullyLoaded()) {
									GraphicsObject.method2357(40, "Loading config - " + (80 + class167.archive12.loadPercent() / 6) + "%");
								} else {
									class151.method3608(class268.archive2);
									var18 = class268.archive2;
									FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var18;
									var21 = class268.archive2;
									var22 = class59.field398;
									KitDefinition.KitDefinition_archive = var21;
									KitDefinition.KitDefinition_modelsArchive = var22;
									KitDefinition.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3);
									class136.method3476(class268.archive2, class59.field398, Client.isLowDetail);
									SongTask.method8875(class268.archive2, class59.field398);
									Archive var13 = class268.archive2;
									StructComposition.StructDefinition_archive = var13;
									AttackOption.method3099(class268.archive2, class59.field398, Client.isMembersWorld, FontName.fontPlain11);
									class243.method5285(class268.archive2, GraphicsDefaults.field5117, FloatProjection.field2104);
									class491.method9488(class268.archive2, class59.field398);
									Archive var24 = class268.archive2;
									class431.VarbitDefinition_archive = var24;
									JagNetThread.method7840(class268.archive2);
									ClanChannel.widgetDefinition = new WidgetDefinition(SoundCache.archive4, class59.field398, PcmPlayer.archive8, class220.archive13, class88.field1069);
									KeyHandler.method373(class268.archive2);
									class167.method3811(class268.archive2);
									UrlRequester.method3282(class268.archive2);
									var5 = class268.archive2;
									InvDefinition.method5120(class268.archive2);
									Archive var6 = class268.archive2;
									DbTableType.field5408 = var6;
									GraphicsDefaults.method9495(class268.archive2);
									AsyncHttpResponse.field75 = new class539(StructComposition.field2749, 54, ScriptFrame.clientLanguage, class268.archive2);
									UserComparator9.field1513 = new class539(StructComposition.field2749, 47, ScriptFrame.clientLanguage, class268.archive2);
									HttpRequestTask.varcs = new Varcs();
									Player.method2704(class268.archive2, PcmPlayer.archive8, class220.archive13);
									InterfaceParent.method2618(class268.archive2, PcmPlayer.archive8);
									WorldMapLabel.method6398(class268.archive2, PcmPlayer.archive8);
									GraphicsObject.method2357(50, "Loaded config");
									Clock.method5078(class95.field1148);
								}
							} else if (Client.field533 == class95.field1148) {
								var20 = 0;
								if (SpriteMask.compass == null) {
									SpriteMask.compass = ChatChannel.SpriteBuffer_getSprite(PcmPlayer.archive8, class30.field133.field5116, 0);
								} else {
									++var20;
								}

								if (class213.redHintArrowSprite == null) {
									class213.redHintArrowSprite = ChatChannel.SpriteBuffer_getSprite(PcmPlayer.archive8, class30.field133.field5106, 0);
								} else {
									++var20;
								}

								if (class155.mapSceneSprites == null) {
									class155.mapSceneSprites = RestClientThreadFactory.method213(PcmPlayer.archive8, class30.field133.field5102, 0);
								} else {
									++var20;
								}

								if (BuddyRankComparator.headIconPkSprites == null) {
									BuddyRankComparator.headIconPkSprites = AbstractSocket.method9404(PcmPlayer.archive8, class30.field133.field5103, 0);
								} else {
									++var20;
								}

								if (HttpRequest.headIconPrayerSprites == null) {
									HttpRequest.headIconPrayerSprites = AbstractSocket.method9404(PcmPlayer.archive8, class30.field133.field5104, 0);
								} else {
									++var20;
								}

								if (SoundSystem.headIconHintSprites == null) {
									SoundSystem.headIconHintSprites = AbstractSocket.method9404(PcmPlayer.archive8, class30.field133.field5105, 0);
								} else {
									++var20;
								}

								if (class140.mapDotSprites == null) {
									class140.mapDotSprites = AbstractSocket.method9404(PcmPlayer.archive8, class30.field133.field5108, 0);
								} else {
									++var20;
								}

								if (crossSprites == null) {
									crossSprites = AbstractSocket.method9404(PcmPlayer.archive8, class30.field133.field5107, 0);
								} else {
									++var20;
								}

								if (class464.field4957 == null) {
									class464.field4957 = AbstractSocket.method9404(PcmPlayer.archive8, class30.field133.field5100, 0);
								} else {
									++var20;
								}

								if (WorldMapSection2.scrollBarSprites == null) {
									WorldMapSection2.scrollBarSprites = RestClientThreadFactory.method213(PcmPlayer.archive8, class30.field133.field5109, 0);
								} else {
									++var20;
								}

								if (FriendSystem.field829 == null) {
									FriendSystem.field829 = RestClientThreadFactory.method213(PcmPlayer.archive8, class30.field133.field5110, 0);
								} else {
									++var20;
								}

								if (var20 < 11) {
									GraphicsObject.method2357(70, "Loading sprites - " + var20 * 100 / 12 + "%");
								} else {
									AbstractFont.AbstractFont_modIconSprites = FriendSystem.field829;
									class213.redHintArrowSprite.normalize();
									var1 = (int)(Math.random() * 21.0D) - 10;
									int var2 = (int)(Math.random() * 21.0D) - 10;
									var3 = (int)(Math.random() * 21.0D) - 10;
									int var4 = (int)(Math.random() * 41.0D) - 20;
									class155.mapSceneSprites[0].shiftColors(var1 + var4, var2 + var4, var4 + var3);
									GraphicsObject.method2357(60, "Loaded sprites");
									Clock.method5078(class95.field1158);
								}
							} else if (class95.field1158 == Client.field533) {
								if (!SpotAnimationDefinition.field2704.isFullyLoaded()) {
									GraphicsObject.method2357(70, "Loading textures - " + "0%");
								} else {
									HttpRequestTask.textureProvider = new TextureProvider(SpotAnimationDefinition.field2704, PcmPlayer.archive8, 20, class544.clientPreferences.getBrightness(), Client.isLowDetail ? 64 : 128);
									Rasterizer3D.setTextureLoader(HttpRequestTask.textureProvider);
									Rasterizer3D.buildPalette(class544.clientPreferences.getBrightness());
									Clock.method5078(class95.field1159);
								}
							} else if (class95.field1159 == Client.field533) {
								var20 = HttpRequestTask.textureProvider.getLoadedPercentage();
								if (var20 < 100) {
									GraphicsObject.method2357(80, "Loading textures - " + var20 + "%");
								} else {
									GraphicsObject.method2357(90, "Loaded textures");
									Clock.method5078(class95.field1156);
								}
							} else if (class95.field1156 == Client.field533) {
								class168.mouseRecorder = new MouseRecorder();
								GameEngine.taskHandler.newThreadTask(class168.mouseRecorder, 10);
								GraphicsObject.method2357(92, "Loaded input handler");
								Clock.method5078(class95.field1161);
							} else if (Client.field533 == class95.field1161) {
								if (!class166.archive10.tryLoadFileByNames("huffman", "")) {
									GraphicsObject.method2357(94, "Loading wordpack - " + 0 + "%");
								} else {
									Huffman var17 = new Huffman(class166.archive10.takeFileByNames("huffman", ""));
									TileItem.method3111(var17);
									GraphicsObject.method2357(94, "Loaded wordpack");
									Clock.method5078(class95.field1162);
								}
							} else if (Client.field533 == class95.field1162) {
								if (!SoundCache.archive4.isFullyLoaded()) {
									GraphicsObject.method2357(96, "Loading interfaces - " + SoundCache.archive4.loadPercent() * 4 / 5 + "%");
								} else if (!class88.field1069.isFullyLoaded()) {
									GraphicsObject.method2357(96, "Loading interfaces - " + class88.field1069.loadPercent() * 4 / 5 + "%");
								} else if (!class167.archive12.isFullyLoaded()) {
									GraphicsObject.method2357(96, "Loading interfaces - " + (80 + class167.archive12.loadPercent() / 6) + "%");
								} else if (!class220.archive13.isFullyLoaded()) {
									GraphicsObject.method2357(96, "Loading interfaces - " + (96 + class220.archive13.loadPercent() / 50) + "%");
								} else {
									GraphicsObject.method2357(98, "Loaded interfaces");
									if (class167.archive12.isValidFileName("version.dat", "")) {
										Buffer var0 = new Buffer(class167.archive12.takeFileByNames("version.dat", ""));
										var0.readUnsignedShort();
									}

									Clock.method5078(class95.field1163);
								}
							} else if (Client.field533 == class95.field1163) {
								if (Sound.field1718.getGroupCount() > 0 && !Sound.field1718.tryLoadGroupByName(WorldMapCacheName.field3264.name)) {
									GraphicsObject.method2357(100, "Loading world map - " + Sound.field1718.groupLoadPercentByName(WorldMapCacheName.field3264.name) / 10 + "%");
								} else {
									if (class420.worldMap == null) {
										class420.worldMap = new WorldMap();
										class420.worldMap.init(Sound.field1718, StructComposition.field2746, class137.field1603, GraphicsObject.fontBold12, Client.fontsMap, class155.mapSceneSprites);
									}

									GraphicsObject.method2357(100, "Loaded world map");
									if (class273.field3035) {
										Clock.method5078(class95.field1164);
									} else {
										Clock.method5078(class95.field1160);
									}

									Client.field512 = false;
								}
							} else {
								if (class95.field1164 == Client.field533) {
									Client.field765 = false;
									class360.updateGameState(20);
									DevicePcmPlayerProvider.updateLoginState(LoginState.READ_ACCOUNT_INFO_PACKET_SIZE);
								}

							}
						}
					}
				} else {
					boolean var10 = !Client.isLowDetail;
					PcmPlayer.field257 = 22050;
					PcmPlayer.PcmPlayer_stereo = var10;
					class328.field3605 = 2;
					ArrayList var11 = new ArrayList(3);
					class328.pcmPlayer1 = class241.method5262(GameEngine.taskHandler, 0, 2048);
					UserList.pcmStreamMixer = new PcmStreamMixer();
					PcmStreamMixer var12 = new PcmStreamMixer();
					var12.addSubStream(UserList.pcmStreamMixer);

					for (var3 = 0; var3 < 3; ++var3) {
						MidiPcmStream var14 = new MidiPcmStream(class328.pcmPlayer1);
						var14.method6719(9, 128);
						var12.addSubStream(var14);
						var11.add(var14);
					}

					class328.pcmPlayer1.setStream(var12);
					Timer.method8939(ClanSettings.field1762, class221.field2421, World.soundEffectsArchive, var11);
					Message.decimator = new Decimator(22050, PcmPlayer.field257);
					GraphicsObject.method2357(60, "Prepared sound engine");
					Clock.method5078(class95.field1154);
				}
			}
		}
	}

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "(III)Ljava/lang/String;",
		garbageValue = "589124194"
	)
	static final String method2584(int var0, int var1) {
		int var2 = var1 - var0;
		if (var2 < -9) {
			return WorldViewManager.colorStartTag(16711680);
		} else if (var2 < -6) {
			return WorldViewManager.colorStartTag(16723968);
		} else if (var2 < -3) {
			return WorldViewManager.colorStartTag(16740352);
		} else if (var2 < 0) {
			return WorldViewManager.colorStartTag(16756736);
		} else if (var2 > 9) {
			return WorldViewManager.colorStartTag(65280);
		} else if (var2 > 6) {
			return WorldViewManager.colorStartTag(4259584);
		} else if (var2 > 3) {
			return WorldViewManager.colorStartTag(8453888);
		} else {
			return var2 > 0 ? WorldViewManager.colorStartTag(12648192) : WorldViewManager.colorStartTag(16776960);
		}
	}

	@ObfuscatedName("mk")
	@ObfuscatedSignature(
		descriptor = "([Lna;IIIZI)V",
		garbageValue = "1382423197"
	)
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; ++var5) {
			Widget var6 = var0[var5];
			if (var6 != null && var6.parentId == var1) {
				GrandExchangeOfferTotalQuantityComparator.alignWidgetSize(var6, var2, var3, var4);
				alignWidgetPosition(var6, var2, var3);
				if (var6.scrollX > var6.scrollWidth - var6.width) {
					var6.scrollX = var6.scrollWidth - var6.width;
				}

				if (var6.scrollX < 0) {
					var6.scrollX = 0;
				}

				if (var6.scrollY > var6.scrollHeight - var6.height * -1528330031) {
					var6.scrollY = var6.scrollHeight - var6.height * -1528330031;
				}

				if (var6.scrollY < 0) {
					var6.scrollY = 0;
				}

				if (var6.type == 0) {
					class244.revalidateWidgetScroll(var0, var6, var4);
				}
			}
		}

	}

	@ObfuscatedName("mt")
	@ObfuscatedSignature(
		descriptor = "(Lna;IIB)V",
		garbageValue = "17"
	)
	@Export("alignWidgetPosition")
	static void alignWidgetPosition(Widget var0, int var1, int var2) {
		if (var0.xAlignment == 0) {
			var0.x = var0.rawX;
		} else if (var0.xAlignment == 1) {
			var0.x = var0.rawX + (var1 - var0.width) / 2;
		} else if (var0.xAlignment == 2) {
			var0.x = var1 - var0.width - var0.rawX;
		} else if (var0.xAlignment == 3) {
			var0.x = var0.rawX * var1 >> 14;
		} else if (var0.xAlignment == 4) {
			var0.x = (var0.rawX * var1 >> 14) + (var1 - var0.width) / 2;
		} else {
			var0.x = var1 - var0.width - (var0.rawX * var1 >> 14);
		}

		if (var0.yAlignment == 0) {
			var0.y = var0.rawY;
		} else if (var0.yAlignment == 1) {
			var0.y = (var2 - var0.height * -1528330031) / 2 + var0.rawY;
		} else if (var0.yAlignment == 2) {
			var0.y = var2 - var0.height * -1528330031 - var0.rawY;
		} else if (var0.yAlignment == 3) {
			var0.y = var2 * var0.rawY >> 14;
		} else if (var0.yAlignment == 4) {
			var0.y = (var2 * var0.rawY >> 14) + (var2 - var0.height * -1528330031) / 2;
		} else {
			var0.y = var2 - var0.height * -1528330031 - (var2 * var0.rawY >> 14);
		}

	}
}
