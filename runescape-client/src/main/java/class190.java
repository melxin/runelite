import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hx")
public class class190 extends DualNode {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("field2023")
	static EvictingDualNodeHashTable field2023;

	static {
		field2023 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-47"
	)
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0;
		if (KitDefinition.garbageCollector == null || !KitDefinition.garbageCollector.isValid()) {
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next();
					if (var2.isValid()) {
						KitDefinition.garbageCollector = var2;
						GameEngine.garbageCollectorLastCheckTimeMs = -1L;
						GameEngine.garbageCollectorLastCollectionTime = -1L;
					}
				}
			} catch (Throwable var11) {
			}
		}

		if (KitDefinition.garbageCollector != null) {
			long var9 = class180.method3973();
			long var3 = KitDefinition.garbageCollector.getCollectionTime();
			if (-1L != GameEngine.garbageCollectorLastCollectionTime) {
				long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime;
				long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs;
				if (var7 != 0L) {
					var0 = (int)(100L * var5 / var7);
				}
			}

			GameEngine.garbageCollectorLastCollectionTime = var3;
			GameEngine.garbageCollectorLastCheckTimeMs = var9;
		}

		return var0;
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "178402658"
	)
	static void method4136() {
		if (class70.field978 == Client.field392) {
			WorldMapRectangle.field3283 = Frames.newArchive(class403.field4738.field4743, false, true, true, false);
			ModeWhere.field4905 = Frames.newArchive(class403.field4724.field4743, true, true, true, false);
			GrandExchangeOfferAgeComparator.archive8 = Frames.newArchive(class403.field4739.field4743, false, true, true, false);
			class198.archive10 = Frames.newArchive(class403.field4725.field4743, false, true, true, false);
			class361.archive13 = Frames.newArchive(class403.field4726.field4743, true, false, true, false);
			class150.field1717 = Frames.newArchive(class403.field4728.field4743, false, true, true, false);
			Varcs.field1254 = Frames.newArchive(class403.field4732.field4743, false, true, true, false);
			class403.field4745 = Frames.newArchive(class403.field4741.field4743, true, true, true, false);
			class469.method9294(20, "Connecting to update server");
			InterfaceParent.method2108(class70.field979);
		} else {
			int var20;
			byte var35;
			if (Client.field392 == class70.field979) {
				var35 = 0;
				var20 = var35 + WorldMapRectangle.field3283.percentage() * 53 / 100;
				var20 += ModeWhere.field4905.percentage() * 5 / 100;
				var20 += GrandExchangeOfferAgeComparator.archive8.percentage() * 36 / 100;
				var20 += class198.archive10.percentage() / 100;
				var20 += class361.archive13.percentage() / 100;
				var20 += class150.field1717.percentage() * 2 / 100;
				var20 += Varcs.field1254.percentage() / 100;
				var20 += class403.field4745.method8028() && class403.field4745.isFullyLoaded() ? 1 : 0;
				if (var20 != 100) {
					if (var20 != 0) {
						class469.method9294(30, "Checking for updates - " + var20 + "%");
					}

				} else {
					UserComparator1.method11155(WorldMapRectangle.field3283, "Sound FX");
					UserComparator1.method11155(ModeWhere.field4905, "Music Tracks");
					UserComparator1.method11155(GrandExchangeOfferAgeComparator.archive8, "Sprites");
					UserComparator1.method11155(class150.field1717, "Music Samples");
					UserComparator1.method11155(Varcs.field1254, "Music Patches");
					class330.field3671 = new GraphicsDefaults();
					class330.field3671.decode(class403.field4745);
					class469.method9294(40, "Loaded update list");
					InterfaceParent.method2108(class70.field966);
				}
			} else {
				int var2;
				Archive var22;
				Archive var33;
				if (Client.field392 != class70.field966) {
					if (class70.field977 == Client.field392) {
						if (class282.field3139 == null) {
							class282.field3139 = new Fonts(GrandExchangeOfferAgeComparator.archive8, class361.archive13);
						}

						var20 = FontName.method10485().length;
						Client.fontsMap = class282.field3139.createMap(FontName.method10485());
						if (Client.fontsMap.size() < var20) {
							class469.method9294(80, "Loading fonts - " + Client.fontsMap.size() * 100 / var20 + "%");
						} else {
							class290.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11);
							Tile.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12);
							Friend.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12);
							WorldMapArea.platformInfo = Client.field499.get();
							class469.method9294(80, "Loaded fonts");
							InterfaceParent.method2108(class70.field968);
						}
					} else {
						int var3;
						int var4;
						Archive var31;
						if (Client.field392 == class70.field968) {
							var31 = class198.archive10;
							var22 = GrandExchangeOfferAgeComparator.archive8;
							var3 = 0;
							String[] var34 = Login.field769;

							int var25;
							String var30;
							for (var25 = 0; var25 < var34.length; ++var25) {
								var30 = var34[var25];
								if (var31.tryLoadFileByNames(var30, "")) {
									++var3;
								}
							}

							var34 = Login.field768;

							for (var25 = 0; var25 < var34.length; ++var25) {
								var30 = var34[var25];
								if (var22.tryLoadFileByNames(var30, "")) {
									++var3;
								}
							}

							var34 = Login.field737;

							for (var25 = 0; var25 < var34.length; ++var25) {
								var30 = var34[var25];
								if (var22.getGroupId(var30) != -1 && var22.tryLoadFileByNames(var30, "")) {
									++var3;
								}
							}

							var4 = class175.method3945(GrandExchangeOfferAgeComparator.archive8);
							if (var3 < var4) {
								class469.method9294(90, "Loading title screen - " + var3 * 100 / var4 + "%");
							} else {
								class469.method9294(100, "Loaded title screen");
								if (MusicPatch.field3774) {
									HealthBarConfig.updateGameState(5);
									InterfaceParent.method2108(class70.field962);
								} else {
									InterfaceParent.method2108(class70.field963);
								}

							}
						} else if (class70.field962 == Client.field392) {
							HealthBarConfig.updateGameState(10);
						} else {
							int var1;
							Archive var28;
							if (class70.field963 == Client.field392) {
								class226.field2467 = Frames.newArchive(class403.field4718.field4743, false, true, true, false);
								class51.field728 = Frames.newArchive(class403.field4722.field4743, false, true, true, true);
								SoundCache.field1342 = Frames.newArchive(class403.field4719.field4743, false, true, true, false);
								MusicPatchPcmStream.archive2 = Frames.newArchive(class403.field4720.field4743, true, false, true, false);
								class330.archive4 = Frames.newArchive(class403.field4721.field4743, false, true, true, false);
								VerticalAlignment.archive9 = Frames.newArchive(class403.field4723.field4743, true, true, true, false);
								WorldMapArea.field3181 = Frames.newArchive(class403.field4717.field4743, false, true, true, false);
								class225.field2457 = Frames.newArchive(class403.field4727.field4743, false, true, true, false);
								class217.archive6 = Frames.newArchive(class403.field4729.field4743, false, true, true, false);
								class526.archive12 = Frames.newArchive(class403.field4730.field4743, false, true, true, false);
								LoginState.field283 = Frames.newArchive(class403.field4735.field4743, false, true, true, false);
								ArchiveDiskAction.field4689 = Frames.newArchive(class403.field4736.field4743, false, true, true, false);
								class107.field1386 = Frames.newArchive(class403.field4737.field4743, false, true, true, false);
								AbstractByteArrayCopier.field3837 = Frames.newArchive(class403.field4733.field4743, false, true, true, false);
								var1 = class403.field4740.field4743;
								ArchiveDisk var32 = null;
								if (JagexCache.JagexCache_dat2File != null) {
									var32 = new ArchiveDisk(var1, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idxFiles[var1], 1000000);
								}

								var28 = new Archive(var32, Varps.masterDisk, class330.field3669, var1, false, true, true, true, true);
								class355.soundEffectsArchive = var28;
								class469.method9294(20, "Connecting to update server");
								InterfaceParent.method2108(class70.field965);
							} else if (Client.field392 == class70.field965) {
								var35 = 0;
								var20 = var35 + class226.field2467.percentage() * 4 / 100;
								var20 += class51.field728.percentage() / 100;
								var20 += SoundCache.field1342.percentage() * 2 / 100;
								var20 += MusicPatchPcmStream.archive2.percentage() / 100;
								var20 += class330.archive4.percentage() / 100;
								var20 += VerticalAlignment.archive9.percentage() * 10 / 100;
								var20 += WorldMapArea.field3181.percentage() * 65 / 100;
								var20 += class225.field2457.percentage() / 100;
								var20 += class217.archive6.percentage() / 100;
								var20 += class526.archive12.percentage() * 6 / 100;
								var20 += ArchiveDiskAction.field4689.percentage() / 100;
								var20 += LoginState.field283.percentage() * 2 / 100;
								var20 += class107.field1386.percentage() * 2 / 100;
								var20 += AbstractByteArrayCopier.field3837.percentage() / 100;
								var20 += class355.soundEffectsArchive.percentage() * 2 / 100;
								if (var20 != 100) {
									if (var20 != 0) {
										class469.method9294(30, "Checking for updates - " + var20 + "%");
									}

								} else {
									UserComparator1.method11155(class226.field2467, "Animations");
									UserComparator1.method11155(class51.field728, "Animation Keyframes");
									UserComparator1.method11155(SoundCache.field1342, "Skeletons");
									UserComparator1.method11155(VerticalAlignment.archive9, "Maps");
									UserComparator1.method11155(WorldMapArea.field3181, "Models");
									UserComparator1.method11155(class217.archive6, "Music Jingles");
									UserComparator1.method11155(ArchiveDiskAction.field4689, "World Map");
									UserComparator1.method11155(LoginState.field283, "World Map Geography");
									UserComparator1.method11155(class107.field1386, "World Map Ground");
									class469.method9294(30, "Loaded update list");
									InterfaceParent.method2108(class70.field973);
								}
							} else if (Client.field392 == class70.field973) {
								Sound.topLevelWorldView = Client.worldViewManager.method2216(104, 104, ClientPacket.clientPreferences.getDrawDistance());
								class330.worldView = Sound.topLevelWorldView;
								class328.sceneMinimapSprite = new SpritePixels(512, 512);
								class469.method9294(30, "Starting game engine...");
								InterfaceParent.method2108(class70.field969);
							} else if (class70.field969 == Client.field392) {
								if (!MusicPatchPcmStream.archive2.isFullyLoaded()) {
									class469.method9294(40, "Loading config - " + MusicPatchPcmStream.archive2.loadPercent() + "%");
								} else if (!AbstractByteArrayCopier.field3837.isFullyLoaded()) {
									class469.method9294(40, "Loading config - " + (80 + class526.archive12.loadPercent() / 6) + "%");
								} else {
									Messages.method2787(MusicPatchPcmStream.archive2);
									class131.method3458(MusicPatchPcmStream.archive2);
									var28 = MusicPatchPcmStream.archive2;
									var31 = WorldMapArea.field3181;
									ClanSettings.KitDefinition_archive = var28;
									class63.KitDefinition_modelsArchive = var31;
									KitDefinition.KitDefinition_fileCount = ClanSettings.KitDefinition_archive.getGroupFileCount(3);
									var22 = MusicPatchPcmStream.archive2;
									var33 = WorldMapArea.field3181;
									boolean var29 = Client.isLowDetail;
									ObjectComposition.ObjectDefinition_archive = var22;
									class396.ObjectDefinition_modelsArchive = var33;
									ObjectComposition.ObjectDefinition_isLowDetail = var29;
									class155.method3705(MusicPatchPcmStream.archive2, WorldMapArea.field3181);
									Archive var5 = MusicPatchPcmStream.archive2;
									StructComposition.StructDefinition_archive = var5;
									WidgetConfigNode.method7730(MusicPatchPcmStream.archive2, WorldMapArea.field3181, Client.isMembersWorld, class290.fontPlain11);
									MidiRequest.method7163(MusicPatchPcmStream.archive2, class226.field2467, class51.field728, SoundCache.field1342);
									Archive var6 = MusicPatchPcmStream.archive2;
									Archive var7 = WorldMapArea.field3181;
									SpotAnimationDefinition.field2117 = var6;
									SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var7;
									Archive var8 = MusicPatchPcmStream.archive2;
									VarbitComposition.VarbitDefinition_archive = var8;
									class379.method7926(MusicPatchPcmStream.archive2);
									ClientPreferences.widgetDefinition = new WidgetDefinition(class330.archive4, WorldMapArea.field3181, GrandExchangeOfferAgeComparator.archive8, class361.archive13, class355.soundEffectsArchive);
									class136.method3548(MusicPatchPcmStream.archive2);
									Archive var9 = MusicPatchPcmStream.archive2;
									EnumComposition.EnumDefinition_archive = var9;
									Archive var10 = MusicPatchPcmStream.archive2;
									VarcInt.VarcInt_archive = var10;
									class325.method6831(MusicPatchPcmStream.archive2);
									class399.method8008(MusicPatchPcmStream.archive2);
									Archive var11 = MusicPatchPcmStream.archive2;
									SwapSongTask.field5075 = var11;
									Archive var12 = MusicPatchPcmStream.archive2;
									DbTableType.field5614 = var12;
									BoundaryObject.method5842(MusicPatchPcmStream.archive2);
									class27.field129 = new class557(FontName.field5530, 54, class28.clientLanguage, MusicPatchPcmStream.archive2);
									SequenceDefinition.field2343 = new class557(FontName.field5530, 47, class28.clientLanguage, MusicPatchPcmStream.archive2);
									class339.varcs = new Varcs();
									Archive var13 = MusicPatchPcmStream.archive2;
									Archive var14 = GrandExchangeOfferAgeComparator.archive8;
									Archive var15 = class361.archive13;
									UserComparator5.HitSplatDefinition_archive = var13;
									class452.field5016 = var14;
									HitSplatDefinition.HitSplatDefinition_fontsArchive = var15;
									class135.method3525(MusicPatchPcmStream.archive2, GrandExchangeOfferAgeComparator.archive8);
									Archive var16 = MusicPatchPcmStream.archive2;
									Archive var17 = GrandExchangeOfferAgeComparator.archive8;
									WorldMapElement.WorldMapElement_archive = var17;
									class559.WorldMapElement_count = var16.getGroupFileCount(35);
									WorldMapElement.WorldMapElement_cached = new WorldMapElement[class559.WorldMapElement_count];

									for (int var18 = 0; var18 < class559.WorldMapElement_count; ++var18) {
										byte[] var19 = var16.takeFile(35, var18);
										WorldMapElement.WorldMapElement_cached[var18] = new WorldMapElement(var18);
										if (var19 != null) {
											WorldMapElement.WorldMapElement_cached[var18].decode(new Buffer(var19));
											WorldMapElement.WorldMapElement_cached[var18].method4018();
										}
									}

									class469.method9294(50, "Loaded config");
									InterfaceParent.method2108(class70.field970);
								}
							} else if (class70.field970 == Client.field392) {
								var20 = 0;
								if (MilliClock.compass == null) {
									MilliClock.compass = IntHashTable.SpriteBuffer_getSprite(GrandExchangeOfferAgeComparator.archive8, class330.field3671.field5325, 0);
								} else {
									++var20;
								}

								if (AsyncRestClient.redHintArrowSprite == null) {
									AsyncRestClient.redHintArrowSprite = IntHashTable.SpriteBuffer_getSprite(GrandExchangeOfferAgeComparator.archive8, class330.field3671.field5319, 0);
								} else {
									++var20;
								}

								if (class403.mapSceneSprites == null) {
									class403.mapSceneSprites = DesktopPlatformInfoProvider.method10192(GrandExchangeOfferAgeComparator.archive8, class330.field3671.field5322, 0);
								} else {
									++var20;
								}

								if (Frames.headIconPkSprites == null) {
									Frames.headIconPkSprites = class480.method9483(GrandExchangeOfferAgeComparator.archive8, class330.field3671.field5320, 0);
								} else {
									++var20;
								}

								if (MouseHandler.headIconPrayerSprites == null) {
									MouseHandler.headIconPrayerSprites = class480.method9483(GrandExchangeOfferAgeComparator.archive8, class330.field3671.field5312, 0);
								} else {
									++var20;
								}

								if (Varps.headIconHintSprites == null) {
									Varps.headIconHintSprites = class480.method9483(GrandExchangeOfferAgeComparator.archive8, class330.field3671.field5323, 0);
								} else {
									++var20;
								}

								if (class152.mapDotSprites == null) {
									class152.mapDotSprites = class480.method9483(GrandExchangeOfferAgeComparator.archive8, class330.field3671.field5324, 0);
								} else {
									++var20;
								}

								if (ScriptFrame.crossSprites == null) {
									ScriptFrame.crossSprites = class480.method9483(GrandExchangeOfferAgeComparator.archive8, class330.field3671.field5328, 0);
								} else {
									++var20;
								}

								if (Messages.field1257 == null) {
									Messages.field1257 = class480.method9483(GrandExchangeOfferAgeComparator.archive8, class330.field3671.field5326, 0);
								} else {
									++var20;
								}

								if (ClanChannelMember.scrollBarSprites == null) {
									ClanChannelMember.scrollBarSprites = DesktopPlatformInfoProvider.method10192(GrandExchangeOfferAgeComparator.archive8, class330.field3671.field5327, 0);
								} else {
									++var20;
								}

								if (TaskHandler.field2417 == null) {
									TaskHandler.field2417 = DesktopPlatformInfoProvider.method10192(GrandExchangeOfferAgeComparator.archive8, class330.field3671.field5321, 0);
								} else {
									++var20;
								}

								if (var20 < 11) {
									class469.method9294(70, "Loading sprites - " + var20 * 100 / 12 + "%");
								} else {
									AbstractFont.AbstractFont_modIconSprites = TaskHandler.field2417;
									AsyncRestClient.redHintArrowSprite.normalize();
									var1 = (int)(Math.random() * 21.0D) - 10;
									var2 = (int)(Math.random() * 21.0D) - 10;
									var3 = (int)(Math.random() * 21.0D) - 10;
									var4 = (int)(Math.random() * 41.0D) - 20;
									class403.mapSceneSprites[0].shiftColors(var4 + var1, var2 + var4, var3 + var4);
									class469.method9294(60, "Loaded sprites");
									InterfaceParent.method2108(class70.field971);
								}
							} else if (Client.field392 == class70.field971) {
								if (!class225.field2457.isFullyLoaded()) {
									class469.method9294(70, "Loading textures - " + "0%");
								} else {
									Client.textureProvider = new TextureProvider(class225.field2457, GrandExchangeOfferAgeComparator.archive8, 20, ClientPacket.clientPreferences.getBrightness(), Client.isLowDetail ? 64 : 128);
									Rasterizer3D.setTextureLoader(Client.textureProvider);
									Rasterizer3D.buildPalette(ClientPacket.clientPreferences.getBrightness());
									InterfaceParent.method2108(class70.field972);
								}
							} else if (Client.field392 == class70.field972) {
								var20 = Client.textureProvider.getLoadedPercentage();
								if (var20 < 100) {
									class469.method9294(80, "Loading textures - " + var20 + "%");
								} else {
									class469.method9294(90, "Loaded textures");
									InterfaceParent.method2108(class70.field967);
								}
							} else if (Client.field392 == class70.field967) {
								class328.mouseRecorder = new MouseRecorder();
								GameEngine.taskHandler.newThreadTask(class328.mouseRecorder, 10);
								class469.method9294(92, "Loaded input handler");
								InterfaceParent.method2108(class70.field974);
							} else if (class70.field974 == Client.field392) {
								if (!class198.archive10.tryLoadFileByNames("huffman", "")) {
									class469.method9294(94, "Loading wordpack - " + 0 + "%");
								} else {
									Huffman var27 = new Huffman(class198.archive10.takeFileByNames("huffman", ""));
									ScriptFrame.method708(var27);
									class469.method9294(94, "Loaded wordpack");
									InterfaceParent.method2108(class70.field975);
								}
							} else if (class70.field975 == Client.field392) {
								if (!class330.archive4.isFullyLoaded()) {
									class469.method9294(96, "Loading interfaces - " + class330.archive4.loadPercent() * 4 / 5 + "%");
								} else if (!class355.soundEffectsArchive.isFullyLoaded()) {
									class469.method9294(96, "Loading interfaces - " + class355.soundEffectsArchive.loadPercent() * 4 / 5 + "%");
								} else if (!class526.archive12.isFullyLoaded()) {
									class469.method9294(96, "Loading interfaces - " + (80 + class526.archive12.loadPercent() / 6) + "%");
								} else if (!class361.archive13.isFullyLoaded()) {
									class469.method9294(96, "Loading interfaces - " + (96 + class361.archive13.loadPercent() / 50) + "%");
								} else {
									class469.method9294(98, "Loaded interfaces");
									if (class526.archive12.isValidFileName("version.dat", "")) {
										Buffer var26 = new Buffer(class526.archive12.takeFileByNames("version.dat", ""));
										Client.field434 = var26.readUnsignedShort();
									}

									InterfaceParent.method2108(class70.field961);
								}
							} else if (class70.field961 == Client.field392) {
								if (ArchiveDiskAction.field4689.getGroupCount() > 0 && !ArchiveDiskAction.field4689.tryLoadGroupByName(WorldMapCacheName.field3327.name)) {
									class469.method9294(100, "Loading world map - " + ArchiveDiskAction.field4689.groupLoadPercentByName(WorldMapCacheName.field3327.name) / 10 + "%");
								} else {
									if (class338.worldMap == null) {
										class338.worldMap = new WorldMap();
										class338.worldMap.init(ArchiveDiskAction.field4689, LoginState.field283, class107.field1386, Friend.fontBold12, Client.fontsMap, class403.mapSceneSprites);
									}

									class469.method9294(100, "Loaded world map");
									if (MusicPatch.field3774) {
										InterfaceParent.method2108(class70.field964);
									} else {
										InterfaceParent.method2108(class70.field962);
									}

									Client.field444 = false;
								}
							} else {
								if (Client.field392 == class70.field964) {
									class311.field3348 = false;
									HealthBarConfig.updateGameState(20);
									WorldMapIcon_1.updateLoginState(LoginState.READ_ACCOUNT_INFO_PACKET_SIZE);
								}

							}
						}
					}
				} else {
					UserComparator9.method3427(22050, !Client.isLowDetail, 2);
					ArrayList var0 = new ArrayList(3);
					ClientPreferences.pcmPlayer1 = InvDefinition.method3961(GameEngine.taskHandler, 0, 2048);
					UserComparator6.pcmStreamMixer = new PcmStreamMixer();
					PcmStreamMixer var21 = new PcmStreamMixer();
					var21.addSubStream(UserComparator6.pcmStreamMixer);

					for (var2 = 0; var2 < 3; ++var2) {
						MidiPcmStream var23 = new MidiPcmStream(ClientPreferences.pcmPlayer1);
						var23.method6929(9, 128);
						var21.addSubStream(var23);
						var0.add(var23);
					}

					ClientPreferences.pcmPlayer1.setStream(var21);
					var22 = Varcs.field1254;
					var33 = class150.field1717;
					Archive var24 = WorldMapRectangle.field3283;
					class141.field1661 = var22;
					class321.field3367 = var33;
					class335.field3693 = var24;
					class335.field3694 = var0;
					class6.decimator = new Decimator(22050, UserComparator3.field1521);
					class469.method9294(60, "Prepared sound engine");
					InterfaceParent.method2108(class70.field977);
				}
			}
		}
	}
}
