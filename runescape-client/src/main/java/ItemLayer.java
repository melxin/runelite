import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gp")
@Implements("ItemLayer")
public final class ItemLayer {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -297505657
	)
	@Export("z")
	int z;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1629083191
	)
	@Export("x")
	int x;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1164753728
	)
	@Export("y")
	int y;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lhy;"
	)
	@Export("first")
	Renderable first;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lhy;"
	)
	@Export("second")
	Renderable second;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lhy;"
	)
	@Export("third")
	Renderable third;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		longValue = 227418584973564749L
	)
	@Export("tag")
	long tag;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1229830239
	)
	@Export("height")
	int height;

	ItemLayer() {
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	static void method3758() {
		if (class94.field1158 == Client.field611) {
			ClientPacket.field3483 = class149.newArchive(class400.field4710.field4712, false, true, true, false);
			class133.field1576 = class149.newArchive(class400.field4693.field4712, true, true, true, false);
			class357.archive8 = class149.newArchive(class400.field4695.field4712, false, true, true, false);
			FloorDecoration.archive10 = class149.newArchive(class400.field4697.field4712, false, true, true, false);
			MouseHandler.archive13 = class149.newArchive(class400.field4700.field4712, true, false, true, false);
			class456.field5014 = class149.newArchive(class400.field4701.field4712, false, true, true, false);
			class330.field3665 = class149.newArchive(class400.field4698.field4712, false, true, true, false);
			HttpMethod.field39 = class149.newArchive(class400.field4703.field4712, true, true, true, false);
			WorldMapIcon_0.method6262(20, "Connecting to update server");
			class136.method3366(class94.field1155);
		} else {
			int var23;
			byte var32;
			if (Client.field611 == class94.field1155) {
				var32 = 0;
				var23 = var32 + ClientPacket.field3483.percentage() * 53 / 100;
				var23 += class133.field1576.percentage() * 5 / 100;
				var23 += class357.archive8.percentage() * 36 / 100;
				var23 += FloorDecoration.archive10.percentage() / 100;
				var23 += MouseHandler.archive13.percentage() / 100;
				var23 += class456.field5014.percentage() * 2 / 100;
				var23 += class330.field3665.percentage() / 100;
				var23 += HttpMethod.field39.method7630() && HttpMethod.field39.isFullyLoaded() ? 1 : 0;
				if (var23 != 100) {
					if (var23 != 0) {
						WorldMapIcon_0.method6262(30, "Checking for updates - " + var23 + "%");
					}

				} else {
					class224.method4952(ClientPacket.field3483, "Sound FX");
					class224.method4952(class133.field1576, "Music Tracks");
					class224.method4952(class357.archive8, "Sprites");
					class224.method4952(class456.field5014, "Music Samples");
					class224.method4952(class330.field3665, "Music Patches");
					class157.field1768 = new GraphicsDefaults();
					class157.field1768.decode(HttpMethod.field39);
					WorldMapIcon_0.method6262(40, "Loaded update list");
					class136.method3366(class94.field1157);
				}
			} else {
				Archive var8;
				Archive var15;
				Archive var31;
				if (class94.field1157 != Client.field611) {
					if (class94.field1170 == Client.field611) {
						if (class519.field5289 == null) {
							class519.field5289 = new Fonts(class357.archive8, MouseHandler.archive13);
						}

						var23 = FontName.method10007().length;
						Client.fontsMap = class519.field5289.createMap(FontName.method10007());
						if (Client.fontsMap.size() < var23) {
							WorldMapIcon_0.method6262(80, "Loading fonts - " + Client.fontsMap.size() * 100 / var23 + "%");
						} else {
							class282.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11);
							HorizontalAlignment.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12);
							class440.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12);
							WorldMapAreaData.platformInfo = Client.field789.get();
							WorldMapIcon_0.method6262(80, "Loaded fonts");
							class136.method3366(class94.field1159);
						}
					} else {
						int var16;
						Archive var24;
						Archive var25;
						int var28;
						if (Client.field611 == class94.field1159) {
							var24 = FloorDecoration.archive10;
							var25 = class357.archive8;
							var16 = 0;
							String[] var34 = Login.field948;

							int var18;
							String var33;
							for (var18 = 0; var18 < var34.length; ++var18) {
								var33 = var34[var18];
								if (var24.tryLoadFileByNames(var33, "")) {
									++var16;
								}
							}

							var34 = Login.field964;

							for (var18 = 0; var18 < var34.length; ++var18) {
								var33 = var34[var18];
								if (var25.tryLoadFileByNames(var33, "")) {
									++var16;
								}
							}

							var34 = Login.field965;

							for (var18 = 0; var18 < var34.length; ++var18) {
								var33 = var34[var18];
								if (var25.getGroupId(var33) != -1 && var25.tryLoadFileByNames(var33, "")) {
									++var16;
								}
							}

							var28 = ReflectionCheck.method712(class357.archive8);
							if (var16 < var28) {
								WorldMapIcon_0.method6262(90, "Loading title screen - " + var16 * 100 / var28 + "%");
							} else {
								WorldMapIcon_0.method6262(100, "Loaded title screen");
								if (LoginScreenAnimation.field1314) {
									class325.updateGameState(5);
									class136.method3366(class94.field1168);
								} else {
									class136.method3366(class94.field1154);
								}

							}
						} else if (class94.field1168 == Client.field611) {
							class325.updateGameState(10);
						} else {
							int var19;
							Archive var36;
							if (Client.field611 == class94.field1154) {
								class145.field1696 = class149.newArchive(class400.field4687.field4712, false, true, true, false);
								class231.field2558 = class149.newArchive(class400.field4686.field4712, false, true, true, true);
								UserComparator6.field1532 = class149.newArchive(class400.field4691.field4712, false, true, true, false);
								class521.archive2 = class149.newArchive(class400.field4689.field4712, true, false, true, false);
								class147.archive4 = class149.newArchive(class400.field4705.field4712, false, true, true, false);
								class161.archive9 = class149.newArchive(class400.field4692.field4712, true, true, true, false);
								SongTask.field5037 = class149.newArchive(class400.field4708.field4712, false, true, true, false);
								AsyncHttpResponse.field66 = class149.newArchive(class400.field4711.field4712, false, true, true, false);
								class143.archive6 = class149.newArchive(class400.field4704.field4712, false, true, true, false);
								WorldMapDecoration.archive12 = class149.newArchive(class400.field4699.field4712, false, true, true, false);
								class33.field150 = class149.newArchive(class400.field4688.field4712, false, true, true, false);
								class140.field1650 = class149.newArchive(class400.field4702.field4712, false, true, true, false);
								class342.field3779 = class149.newArchive(class400.field4696.field4712, false, true, true, false);
								class171.field1872 = class149.newArchive(class400.field4707.field4712, false, true, true, false);
								var19 = class400.field4709.field4712;
								ArchiveDisk var26 = null;
								if (JagexCache.JagexCache_dat2File != null) {
									var26 = new ArchiveDisk(var19, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idxFiles[var19], 1000000);
								}

								var36 = new Archive(var26, class6.masterDisk, ClanSettings.field1791, var19, false, true, true, true, true);
								Messages.soundEffectsArchive = var36;
								WorldMapIcon_0.method6262(20, "Connecting to update server");
								class136.method3366(class94.field1156);
							} else if (class94.field1156 == Client.field611) {
								var32 = 0;
								var23 = var32 + class145.field1696.percentage() * 4 / 100;
								var23 += class231.field2558.percentage() / 100;
								var23 += UserComparator6.field1532.percentage() * 2 / 100;
								var23 += class521.archive2.percentage() / 100;
								var23 += class147.archive4.percentage() / 100;
								var23 += class161.archive9.percentage() * 10 / 100;
								var23 += SongTask.field5037.percentage() * 65 / 100;
								var23 += AsyncHttpResponse.field66.percentage() / 100;
								var23 += class143.archive6.percentage() / 100;
								var23 += WorldMapDecoration.archive12.percentage() * 6 / 100;
								var23 += class140.field1650.percentage() / 100;
								var23 += class33.field150.percentage() * 2 / 100;
								var23 += class342.field3779.percentage() * 2 / 100;
								var23 += class171.field1872.percentage() / 100;
								var23 += Messages.soundEffectsArchive.percentage() * 2 / 100;
								if (var23 != 100) {
									if (var23 != 0) {
										WorldMapIcon_0.method6262(30, "Checking for updates - " + var23 + "%");
									}

								} else {
									class224.method4952(class145.field1696, "Animations");
									class224.method4952(class231.field2558, "Animation Keyframes");
									class224.method4952(UserComparator6.field1532, "Skeletons");
									class224.method4952(class161.archive9, "Maps");
									class224.method4952(SongTask.field5037, "Models");
									class224.method4952(class143.archive6, "Music Jingles");
									class224.method4952(class140.field1650, "World Map");
									class224.method4952(class33.field150, "World Map Geography");
									class224.method4952(class342.field3779, "World Map Ground");
									WorldMapIcon_0.method6262(30, "Loaded update list");
									class136.method3366(class94.field1167);
								}
							} else if (Client.field611 == class94.field1167) {
								class509.topLevelWorldView = Client.worldViewManager.method2569(104, 104, Renderable.clientPreferences.getDrawDistance());
								Scene.field2059 = class509.topLevelWorldView.scene;
								DevicePcmPlayerProvider.worldView = class509.topLevelWorldView;
								InterfaceParent.sceneMinimapSprite = new SpritePixels(512, 512);
								WorldMapIcon_0.method6262(30, "Starting game engine...");
								class136.method3366(class94.field1160);
							} else if (class94.field1160 == Client.field611) {
								if (!class521.archive2.isFullyLoaded()) {
									WorldMapIcon_0.method6262(40, "Loading config - " + class521.archive2.loadPercent() + "%");
								} else if (!class171.field1872.isFullyLoaded()) {
									WorldMapIcon_0.method6262(40, "Loading config - " + (80 + WorldMapDecoration.archive12.loadPercent() / 6) + "%");
								} else {
									var36 = class521.archive2;
									FloorOverlayDefinition.FloorOverlayDefinition_archive = var36;
									class170.method3735(class521.archive2);
									SpriteMask.method6879(class521.archive2, SongTask.field5037);
									ScriptFrame.method1192(class521.archive2, SongTask.field5037, Client.isLowDetail);
									var24 = class521.archive2;
									var25 = SongTask.field5037;
									NPCComposition.NpcDefinition_archive = var24;
									NPCComposition.field2696 = var25;
									IgnoreList.method9127(class521.archive2);
									Actor.method2690(class521.archive2, SongTask.field5037, Client.isMembersWorld, class282.fontPlain11);
									Archive var27 = class521.archive2;
									Archive var17 = class145.field1696;
									Archive var30 = class231.field2558;
									var15 = UserComparator6.field1532;
									SequenceDefinition.SequenceDefinition_archive = var27;
									SequenceDefinition.SequenceDefinition_animationsArchive = var17;
									SequenceDefinition.SequenceDefinition_skeletonsArchive = var30;
									class149.SpotAnimationDefinition_archive = var15;
									class27.method435(class521.archive2, SongTask.field5037);
									var31 = class521.archive2;
									class157.VarbitDefinition_archive = var31;
									var8 = class521.archive2;
									VarpDefinition.VarpDefinition_archive = var8;
									VarpDefinition.field2569 = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16);
									class232.widgetDefinition = new WidgetDefinition(class147.archive4, SongTask.field5037, class357.archive8, MouseHandler.archive13, Messages.soundEffectsArchive);
									SecureRandomFuture.method2337(class521.archive2);
									Archive var9 = class521.archive2;
									EnumComposition.EnumDefinition_archive = var9;
									ItemContainer.method2458(class521.archive2);
									Archive var10 = class521.archive2;
									Archive var11 = class521.archive2;
									ParamComposition.ParamDefinition_archive = var11;
									class28.method445(class521.archive2);
									Archive var12 = class521.archive2;
									DbTableType.field5533 = var12;
									class535.method9769(class521.archive2);
									class223.field2517 = new class550(class496.field5187, 54, class248.clientLanguage, class521.archive2);
									LoginState.field491 = new class550(class496.field5187, 47, class248.clientLanguage, class521.archive2);
									NPCComposition.varcs = new Varcs();
									Projection.method4367(class521.archive2, class357.archive8, MouseHandler.archive13);
									Archive var13 = class521.archive2;
									Archive var14 = class357.archive8;
									HealthBarDefinition.HealthBarDefinition_archive = var13;
									class549.field5509 = var14;
									Message.method1224(class521.archive2, class357.archive8);
									WorldMapIcon_0.method6262(50, "Loaded config");
									class136.method3366(class94.field1161);
								}
							} else if (class94.field1161 == Client.field611) {
								var23 = 0;
								if (UserComparator9.compass == null) {
									UserComparator9.compass = GrandExchangeOfferNameComparator.SpriteBuffer_getSprite(class357.archive8, class157.field1768.field5251, 0);
								} else {
									++var23;
								}

								if (class434.redHintArrowSprite == null) {
									class434.redHintArrowSprite = GrandExchangeOfferNameComparator.SpriteBuffer_getSprite(class357.archive8, class157.field1768.field5252, 0);
								} else {
									++var23;
								}

								if (class377.mapSceneSprites == null) {
									class377.mapSceneSprites = class223.method4935(class357.archive8, class157.field1768.field5253, 0);
								} else {
									++var23;
								}

								if (class521.headIconPkSprites == null) {
									class521.headIconPkSprites = GrandExchangeEvents.method7833(class357.archive8, class157.field1768.field5254, 0);
								} else {
									++var23;
								}

								if (class241.headIconPrayerSprites == null) {
									class241.headIconPrayerSprites = GrandExchangeEvents.method7833(class357.archive8, class157.field1768.field5255, 0);
								} else {
									++var23;
								}

								if (KeyHandler.headIconHintSprites == null) {
									KeyHandler.headIconHintSprites = GrandExchangeEvents.method7833(class357.archive8, class157.field1768.field5256, 0);
								} else {
									++var23;
								}

								if (class59.mapDotSprites == null) {
									class59.mapDotSprites = GrandExchangeEvents.method7833(class357.archive8, class157.field1768.field5245, 0);
								} else {
									++var23;
								}

								if (class240.crossSprites == null) {
									class240.crossSprites = GrandExchangeEvents.method7833(class357.archive8, class157.field1768.field5249, 0);
								} else {
									++var23;
								}

								if (WorldMapSection1.field3325 == null) {
									WorldMapSection1.field3325 = GrandExchangeEvents.method7833(class357.archive8, class157.field1768.field5259, 0);
								} else {
									++var23;
								}

								if (MenuAction.scrollBarSprites == null) {
									MenuAction.scrollBarSprites = class223.method4935(class357.archive8, class157.field1768.field5260, 0);
								} else {
									++var23;
								}

								if (StudioGame.field4210 == null) {
									StudioGame.field4210 = class223.method4935(class357.archive8, class157.field1768.field5246, 0);
								} else {
									++var23;
								}

								if (var23 < 11) {
									WorldMapIcon_0.method6262(70, "Loading sprites - " + var23 * 100 / 12 + "%");
								} else {
									AbstractFont.AbstractFont_modIconSprites = StudioGame.field4210;
									class434.redHintArrowSprite.normalize();
									var19 = (int)(Math.random() * 21.0D) - 10;
									int var21 = (int)(Math.random() * 21.0D) - 10;
									var16 = (int)(Math.random() * 21.0D) - 10;
									var28 = (int)(Math.random() * 41.0D) - 20;
									class377.mapSceneSprites[0].shiftColors(var19 + var28, var28 + var21, var16 + var28);
									WorldMapIcon_0.method6262(60, "Loaded sprites");
									class136.method3366(class94.field1162);
								}
							} else if (class94.field1162 == Client.field611) {
								if (!AsyncHttpResponse.field66.isFullyLoaded()) {
									WorldMapIcon_0.method6262(70, "Loading textures - " + "0%");
								} else {
									PcmPlayer.textureProvider = new TextureProvider(AsyncHttpResponse.field66, class357.archive8, 20, Renderable.clientPreferences.getBrightness(), Client.isLowDetail ? 64 : 128);
									Rasterizer3D.setTextureLoader(PcmPlayer.textureProvider);
									Rasterizer3D.buildPalette(Renderable.clientPreferences.getBrightness());
									class136.method3366(class94.field1164);
								}
							} else if (class94.field1164 == Client.field611) {
								var23 = PcmPlayer.textureProvider.getLoadedPercentage();
								if (var23 < 100) {
									WorldMapIcon_0.method6262(80, "Loading textures - " + var23 + "%");
								} else {
									WorldMapIcon_0.method6262(90, "Loaded textures");
									class136.method3366(class94.field1153);
								}
							} else if (Client.field611 == class94.field1153) {
								class433.mouseRecorder = new MouseRecorder();
								GameEngine.taskHandler.newThreadTask(class433.mouseRecorder, 10);
								WorldMapIcon_0.method6262(92, "Loaded input handler");
								class136.method3366(class94.field1165);
							} else if (class94.field1165 == Client.field611) {
								if (!FloorDecoration.archive10.tryLoadFileByNames("huffman", "")) {
									WorldMapIcon_0.method6262(94, "Loading wordpack - " + 0 + "%");
								} else {
									Huffman var35 = new Huffman(FloorDecoration.archive10.takeFileByNames("huffman", ""));
									class366.huffman = var35;
									WorldMapIcon_0.method6262(94, "Loaded wordpack");
									class136.method3366(class94.field1171);
								}
							} else if (class94.field1171 == Client.field611) {
								if (!class147.archive4.isFullyLoaded()) {
									WorldMapIcon_0.method6262(96, "Loading interfaces - " + class147.archive4.loadPercent() * 4 / 5 + "%");
								} else if (!Messages.soundEffectsArchive.isFullyLoaded()) {
									WorldMapIcon_0.method6262(96, "Loading interfaces - " + Messages.soundEffectsArchive.loadPercent() * 4 / 5 + "%");
								} else if (!WorldMapDecoration.archive12.isFullyLoaded()) {
									WorldMapIcon_0.method6262(96, "Loading interfaces - " + (80 + WorldMapDecoration.archive12.loadPercent() / 6) + "%");
								} else if (!MouseHandler.archive13.isFullyLoaded()) {
									WorldMapIcon_0.method6262(96, "Loading interfaces - " + (96 + MouseHandler.archive13.loadPercent() / 50) + "%");
								} else {
									WorldMapIcon_0.method6262(98, "Loaded interfaces");
									if (WorldMapDecoration.archive12.isValidFileName("version.dat", "")) {
										Buffer var20 = new Buffer(WorldMapDecoration.archive12.takeFileByNames("version.dat", ""));
										var20.readUnsignedShort();
									}

									class136.method3366(class94.field1169);
								}
							} else if (class94.field1169 == Client.field611) {
								if (class140.field1650.getGroupCount() > 0 && !class140.field1650.tryLoadGroupByName(WorldMapCacheName.field3336.name)) {
									WorldMapIcon_0.method6262(100, "Loading world map - " + class140.field1650.groupLoadPercentByName(WorldMapCacheName.field3336.name) / 10 + "%");
								} else {
									if (GameBuild.worldMap == null) {
										GameBuild.worldMap = new WorldMap();
										GameBuild.worldMap.init(class140.field1650, class33.field150, class342.field3779, class440.fontBold12, Client.fontsMap, class377.mapSceneSprites);
									}

									WorldMapIcon_0.method6262(100, "Loaded world map");
									if (LoginScreenAnimation.field1314) {
										class136.method3366(class94.field1166);
									} else {
										class136.method3366(class94.field1168);
									}

									Client.field639 = false;
								}
							} else {
								if (class94.field1166 == Client.field611) {
									Clock.field2530 = false;
									class325.updateGameState(20);
									VarcInt.updateLoginState(LoginState.READ_ACCOUNT_INFO_PACKET_SIZE);
								}

							}
						}
					}
				} else {
					boolean var0 = !Client.isLowDetail;
					class4.field7 = 22050;
					PcmPlayer.PcmPlayer_stereo = var0;
					class165.field1835 = 2;
					ArrayList var1 = new ArrayList(3);
					TaskHandler var3 = GameEngine.taskHandler;
					short var4 = 2048;
					if (class4.field7 * -70401264 == 0) {
						throw new IllegalStateException();
					} else {
						if (var4 < 256) {
							var4 = 256;
						}

						PcmPlayer var2;
						try {
							PcmPlayer var5 = GameEngine.pcmPlayerProvider.player();
							var5.samples = new int[(PcmPlayer.PcmPlayer_stereo ? 2 : 1) * 256];
							var5.field262 = var4;
							var5.init();
							var5.capacity = (var4 & -1024) + 1024;
							if (var5.capacity > 16384) {
								var5.capacity = 16384;
							}

							var5.open(var5.capacity);
							if (class165.field1835 > 0 && Calendar.soundSystem == null) {
								Calendar.soundSystem = new SoundSystem();
								FadeOutTask.soundSystemExecutor = Executors.newScheduledThreadPool(1);
								FadeOutTask.soundSystemExecutor.scheduleAtFixedRate(Calendar.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS);
							}

							if (Calendar.soundSystem != null) {
								if (Calendar.soundSystem.players[0] != null) {
									throw new IllegalArgumentException();
								}

								Calendar.soundSystem.players[0] = var5;
							}

							var2 = var5;
						} catch (Throwable var22) {
							var2 = new PcmPlayer();
						}

						class1.pcmPlayer1 = var2;
						BufferedSink.pcmStreamMixer = new PcmStreamMixer();
						PcmStreamMixer var29 = new PcmStreamMixer();
						var29.addSubStream(BufferedSink.pcmStreamMixer);

						for (int var6 = 0; var6 < 3; ++var6) {
							MidiPcmStream var7 = new MidiPcmStream(class1.pcmPlayer1);
							var7.method6642(9, 128);
							var29.addSubStream(var7);
							var1.add(var7);
						}

						class1.pcmPlayer1.setStream(var29);
						var15 = class330.field3665;
						var31 = class456.field5014;
						var8 = ClientPacket.field3483;
						class335.field3696 = var15;
						UserComparator4.field1497 = var31;
						class335.field3703 = var8;
						class335.field3697 = var1;
						class153.field1736 = new Decimator(22050, class4.field7 * -70401264);
						WorldMapIcon_0.method6262(60, "Prepared sound engine");
						class136.method3366(class94.field1170);
					}
				}
			}
		}
	}
}
