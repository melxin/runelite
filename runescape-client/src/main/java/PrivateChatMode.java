import java.util.ArrayList;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("xe")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lxe;"
	)
	static final PrivateChatMode field5970;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lxe;"
	)
	public static final PrivateChatMode field5971;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lxe;"
	)
	static final PrivateChatMode field5972;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1928396639
	)
	public final int field5973;

	static {
		field5970 = new PrivateChatMode(0);
		field5971 = new PrivateChatMode(1);
		field5972 = new PrivateChatMode(2);
	}

	PrivateChatMode(int var1) {
		this.field5973 = var1;
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2081477141"
	)
	static void method11907() {
		if (Client.field477 == class69.field954) {
			class4.field6 = class383.newArchive(class406.field4841.field4820, false, true, true, false);
			MoveSpeed.field3199 = class383.newArchive(class406.field4823.field4820, true, true, true, false);
			class188.archive8 = class383.newArchive(class406.field4825.field4820, false, true, true, false);
			PacketWriter.archive10 = class383.newArchive(class406.field4827.field4820, false, true, true, false);
			class36.archive13 = class383.newArchive(class406.field4830.field4820, true, false, true, false);
			class173.field1915 = class383.newArchive(class406.field4831.field4820, false, true, true, false);
			CollisionMap.field3159 = class383.newArchive(class406.field4832.field4820, false, true, true, false);
			class350.field3925 = class383.newArchive(class406.field4833.field4820, true, true, true, false);
			class330.method7036(20, "Connecting to update server");
			class202.method4464(class69.field952);
		} else {
			int var21;
			byte var39;
			if (class69.field952 == Client.field477) {
				var39 = 0;
				var21 = var39 + class4.field6.percentage() * 53 / 100;
				var21 += MoveSpeed.field3199.percentage() * 5 / 100;
				var21 += class188.archive8.percentage() * 36 / 100;
				var21 += PacketWriter.archive10.percentage() / 100;
				var21 += class36.archive13.percentage() / 100;
				var21 += class173.field1915.percentage() * 2 / 100;
				var21 += CollisionMap.field3159.percentage() / 100;
				var21 += class350.field3925.method8285() && class350.field3925.isFullyLoaded() ? 1 : 0;
				if (var21 != 100) {
					if (var21 != 0) {
						class330.method7036(30, "Checking for updates - " + var21 + "%");
					}

				} else {
					class570.method11072(class4.field6, "Sound FX");
					class570.method11072(MoveSpeed.field3199, "Music Tracks");
					class570.method11072(class188.archive8, "Sprites");
					class570.method11072(class173.field1915, "Music Samples");
					class570.method11072(CollisionMap.field3159, "Music Patches");
					InterfaceParent.field870 = new GraphicsDefaults();
					InterfaceParent.field870.decode(class350.field3925);
					class330.method7036(40, "Loaded update list");
					class202.method4464(class69.field956);
				}
			} else {
				Archive var2;
				Archive var4;
				int var23;
				Archive var25;
				if (Client.field477 == class69.field956) {
					TileItem.method2783(22050, !Client.isLowDetail, 2);
					ArrayList var30 = new ArrayList(3);
					Client.pcmPlayer1 = MoveSpeed.method6297(GameEngine.taskHandler, 0, 2048);
					class366.pcmStreamMixer = new PcmStreamMixer();
					PcmStreamMixer var34 = new PcmStreamMixer();
					var34.addSubStream(class366.pcmStreamMixer);

					for (var23 = 0; var23 < 3; ++var23) {
						MidiPcmStream var37 = new MidiPcmStream(Client.pcmPlayer1);
						var37.method7140(9, 128);
						var34.addSubStream(var37);
						var30.add(var37);
					}

					Client.pcmPlayer1.setStream(var34);
					var2 = CollisionMap.field3159;
					var25 = class173.field1915;
					var4 = class4.field6;
					class337.field3793 = var2;
					class149.field1749 = var25;
					HttpResponse.field93 = var4;
					class337.field3794 = var30;
					class330.method7036(60, "Prepared sound engine");
					class202.method4464(class69.field950);
				} else if (class69.field950 == Client.field477) {
					if (WorldViewManager.field995 == null) {
						WorldViewManager.field995 = new Fonts(class188.archive8, class36.archive13);
					}

					var21 = FontName.method10903().length;
					Client.fontsMap = WorldViewManager.field995.createMap(FontName.method10903());
					if (Client.fontsMap.size() < var21) {
						class330.method7036(80, "Loading fonts - " + Client.fontsMap.size() * 100 / var21 + "%");
					} else {
						Interpreter.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11);
						class152.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12);
						HttpJsonRequestBody.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12);
						ArchiveLoader.platformInfo = Client.field578.get();
						class330.method7036(80, "Loaded fonts");
						class202.method4464(class69.field951);
					}
				} else {
					int var3;
					int var24;
					Archive var32;
					if (class69.field951 == Client.field477) {
						var32 = PacketWriter.archive10;
						var2 = class188.archive8;
						var3 = 0;
						String[] var33 = Login.field734;

						int var27;
						String var38;
						for (var27 = 0; var27 < var33.length; ++var27) {
							var38 = var33[var27];
							if (var32.tryLoadFileByNames(var38, "")) {
								++var3;
							}
						}

						var33 = Login.field740;

						for (var27 = 0; var27 < var33.length; ++var27) {
							var38 = var33[var27];
							if (var2.tryLoadFileByNames(var38, "")) {
								++var3;
							}
						}

						var33 = Login.field741;

						for (var27 = 0; var27 < var33.length; ++var27) {
							var38 = var33[var27];
							if (var2.getGroupId(var38) != -1 && var2.tryLoadFileByNames(var38, "")) {
								++var3;
							}
						}

						var24 = ParamComposition.method4501(class188.archive8);
						if (var3 < var24) {
							class330.method7036(90, "Loading title screen - " + var3 * 100 / var24 + "%");
						} else {
							class330.method7036(100, "Loaded title screen");
							if (ObjectComposition.field2301) {
								AuthenticationScheme.updateGameState(5);
								class202.method4464(class69.field960);
							} else {
								class202.method4464(class69.field946);
							}

						}
					} else if (Client.field477 == class69.field960) {
						AuthenticationScheme.updateGameState(10);
					} else {
						int var22;
						Archive var29;
						if (Client.field477 == class69.field946) {
							LoginPacket.field1743 = class383.newArchive(class406.field4817.field4820, false, true, true, false);
							MusicPatch.field3868 = class383.newArchive(class406.field4838.field4820, false, true, true, true);
							class381.field4313 = class383.newArchive(class406.field4818.field4820, false, true, true, false);
							AsyncRestClient.archive2 = class383.newArchive(class406.field4842.field4820, true, false, true, false);
							class161.archive4 = class383.newArchive(class406.field4819.field4820, false, true, true, false);
							class201.archive9 = class383.newArchive(class406.field4822.field4820, true, true, true, false);
							class197.field2131 = class383.newArchive(class406.field4843.field4820, false, true, true, false);
							class82.field1191 = class383.newArchive(class406.field4829.field4820, false, true, true, false);
							MoveSpeed.archive6 = class383.newArchive(class406.field4828.field4820, false, true, true, false);
							Canvas.archive12 = class383.newArchive(class406.field4826.field4820, false, true, true, false);
							class175.field1928 = class383.newArchive(class406.field4834.field4820, false, true, true, false);
							class46.field666 = class383.newArchive(class406.field4835.field4820, false, true, true, false);
							ReflectionCheck.field240 = class383.newArchive(class406.field4836.field4820, false, true, true, false);
							ScriptEvent.field871 = class383.newArchive(class406.field4824.field4820, false, true, true, false);
							var22 = class406.field4839.field4820;
							ArchiveDisk var31 = null;
							if (JagexCache.JagexCache_dat2File != null) {
								var31 = new ArchiveDisk(var22, JagexCache.JagexCache_dat2File, class159.JagexCache_idxFiles[var22], 1000000);
							}

							var29 = new Archive(var31, class406.masterDisk, HorizontalAlignment.field2060, var22, false, true, true, true, true);
							SecureRandomFuture.soundEffectsArchive = var29;
							class330.method7036(20, "Connecting to update server");
							class202.method4464(class69.field948);
						} else if (Client.field477 == class69.field948) {
							var39 = 0;
							var21 = var39 + LoginPacket.field1743.percentage() * 4 / 100;
							var21 += MusicPatch.field3868.percentage() / 100;
							var21 += class381.field4313.percentage() * 2 / 100;
							var21 += AsyncRestClient.archive2.percentage() / 100;
							var21 += class161.archive4.percentage() / 100;
							var21 += class201.archive9.percentage() * 10 / 100;
							var21 += class197.field2131.percentage() * 65 / 100;
							var21 += class82.field1191.percentage() / 100;
							var21 += MoveSpeed.archive6.percentage() / 100;
							var21 += Canvas.archive12.percentage() * 6 / 100;
							var21 += class46.field666.percentage() / 100;
							var21 += class175.field1928.percentage() * 2 / 100;
							var21 += ReflectionCheck.field240.percentage() * 2 / 100;
							var21 += ScriptEvent.field871.percentage() / 100;
							var21 += SecureRandomFuture.soundEffectsArchive.percentage() * 2 / 100;
							if (var21 != 100) {
								if (var21 != 0) {
									class330.method7036(30, "Checking for updates - " + var21 + "%");
								}

							} else {
								class570.method11072(LoginPacket.field1743, "Animations");
								class570.method11072(MusicPatch.field3868, "Animation Keyframes");
								class570.method11072(class381.field4313, "Skeletons");
								class570.method11072(class201.archive9, "Maps");
								class570.method11072(class197.field2131, "Models");
								class570.method11072(MoveSpeed.archive6, "Music Jingles");
								class570.method11072(class46.field666, "World Map");
								class570.method11072(class175.field1928, "World Map Geography");
								class570.method11072(ReflectionCheck.field240, "World Map Ground");
								class330.method7036(30, "Loaded update list");
								class202.method4464(class69.field949);
							}
						} else if (class69.field949 == Client.field477) {
							class7.topLevelWorldView = Client.worldViewManager.method2309(104, 104, FriendSystem.clientPreferences.getDrawDistance());
							class81.worldView = class7.topLevelWorldView;
							Script.sceneMinimapSprite = new SpritePixels(512, 512);
							class330.method7036(30, "Starting game engine...");
							class202.method4464(class69.field945);
						} else if (Client.field477 == class69.field945) {
							if (!AsyncRestClient.archive2.isFullyLoaded()) {
								class330.method7036(40, "Loading config - " + AsyncRestClient.archive2.loadPercent() + "%");
							} else if (!ScriptEvent.field871.isFullyLoaded()) {
								class330.method7036(40, "Loading config - " + (80 + Canvas.archive12.loadPercent() / 6) + "%");
							} else {
								var29 = AsyncRestClient.archive2;
								class238.FloorOverlayDefinition_archive = var29;
								var32 = AsyncRestClient.archive2;
								class572.FloorUnderlayDefinition_archive = var32;
								var2 = AsyncRestClient.archive2;
								var25 = class197.field2131;
								KitDefinition.KitDefinition_archive = var2;
								KitDefinition.KitDefinition_modelsArchive = var25;
								GZipDecompressor.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3);
								class70.method2215(AsyncRestClient.archive2, class197.field2131, Client.isLowDetail);
								var4 = AsyncRestClient.archive2;
								Archive var35 = class197.field2131;
								NPCComposition.NpcDefinition_archive = var4;
								NPCComposition.field2071 = var35;
								class145.method3740(AsyncRestClient.archive2);
								FloatProjection.method5345(AsyncRestClient.archive2, class197.field2131, Client.isMembersWorld, Interpreter.fontPlain11);
								Archive var26 = AsyncRestClient.archive2;
								Archive var36 = LoginPacket.field1743;
								Archive var8 = MusicPatch.field3868;
								Archive var9 = class381.field4313;
								class172.SequenceDefinition_archive = var26;
								class407.SequenceDefinition_animationsArchive = var36;
								class167.SequenceDefinition_skeletonsArchive = var8;
								class202.SpotAnimationDefinition_archive = var9;
								class453.method9218(AsyncRestClient.archive2, class197.field2131);
								VertexNormal.method5648(AsyncRestClient.archive2);
								Archive var10 = AsyncRestClient.archive2;
								class546.VarpDefinition_archive = var10;
								ModelData0.field2962 = class546.VarpDefinition_archive.getGroupFileCount(16);
								class504.method10190(ModelData0.field2962);
								class167.widgetDefinition = new WidgetDefinition(class161.archive4, class197.field2131, class188.archive8, class36.archive13, SecureRandomFuture.soundEffectsArchive);
								class50.method1868(AsyncRestClient.archive2);
								Archive var11 = AsyncRestClient.archive2;
								class4.EnumDefinition_archive = var11;
								Archive var12 = AsyncRestClient.archive2;
								VarcInt.VarcInt_archive = var12;
								Archive var13 = AsyncRestClient.archive2;
								SpriteMask.method7375(AsyncRestClient.archive2);
								class166.method4016(AsyncRestClient.archive2);
								Archive var14 = AsyncRestClient.archive2;
								DbTableType.field5729 = var14;
								Archive var15 = AsyncRestClient.archive2;
								DbRowType.field5741 = var15;
								WorldMapEvent.field3424 = new class564(class36.field227, 54, HorizontalAlignment.clientLanguage, AsyncRestClient.archive2);
								class270.field3123 = new class564(class36.field227, 47, HorizontalAlignment.clientLanguage, AsyncRestClient.archive2);
								FloorDecoration.varcs = new Varcs();
								Archive var16 = AsyncRestClient.archive2;
								Archive var17 = class188.archive8;
								Archive var18 = class36.archive13;
								HitSplatDefinition.HitSplatDefinition_archive = var16;
								HitSplatDefinition.field2246 = var17;
								HttpResponse.HitSplatDefinition_fontsArchive = var18;
								Archive var19 = AsyncRestClient.archive2;
								Archive var20 = class188.archive8;
								class505.HealthBarDefinition_archive = var19;
								class172.field1904 = var20;
								ClientPreferences.method2621(AsyncRestClient.archive2, class188.archive8);
								class330.method7036(50, "Loaded config");
								class202.method4464(class69.field959);
							}
						} else if (class69.field959 == Client.field477) {
							var21 = 0;
							if (class484.compass == null) {
								class484.compass = class407.SpriteBuffer_getSprite(class188.archive8, InterfaceParent.field870.field5427, 0);
							} else {
								++var21;
							}

							if (class141.redHintArrowSprite == null) {
								class141.redHintArrowSprite = class407.SpriteBuffer_getSprite(class188.archive8, InterfaceParent.field870.field5421, 0);
							} else {
								++var21;
							}

							IndexedSprite[] var1;
							IndexedSprite[] var5;
							int var6;
							IndexedSprite var7;
							if (Bounds.mapSceneSprites == null) {
								var2 = class188.archive8;
								var3 = InterfaceParent.field870.field5429;
								if (!class522.method10495(var2, var3, 0)) {
									var1 = null;
								} else {
									var5 = new IndexedSprite[SpriteBufferProperties.SpriteBuffer_spriteCount];

									for (var6 = 0; var6 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var6) {
										var7 = var5[var6] = new IndexedSprite();
										var7.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
										var7.height = SpriteBufferProperties.SpriteBuffer_spriteHeight;
										var7.xOffset = SpriteBufferProperties.SpriteBuffer_xOffsets[var6];
										var7.yOffset = class440.SpriteBuffer_yOffsets[var6];
										var7.subWidth = class333.SpriteBuffer_spriteWidths[var6];
										var7.subHeight = Buffer.SpriteBuffer_spriteHeights[var6];
										var7.palette = class113.SpriteBuffer_spritePalette;
										var7.pixels = SpriteBufferProperties.SpriteBuffer_pixels[var6];
									}

									SpriteBufferProperties.SpriteBuffer_xOffsets = null;
									class440.SpriteBuffer_yOffsets = null;
									class333.SpriteBuffer_spriteWidths = null;
									Buffer.SpriteBuffer_spriteHeights = null;
									class113.SpriteBuffer_spritePalette = null;
									SpriteBufferProperties.SpriteBuffer_pixels = null;
									var1 = var5;
								}

								Bounds.mapSceneSprites = var1;
							} else {
								++var21;
							}

							if (Message.headIconPkSprites == null) {
								Message.headIconPkSprites = class209.method4562(class188.archive8, InterfaceParent.field870.field5430, 0);
							} else {
								++var21;
							}

							if (HttpMethod.headIconPrayerSprites == null) {
								HttpMethod.headIconPrayerSprites = class209.method4562(class188.archive8, InterfaceParent.field870.field5425, 0);
							} else {
								++var21;
							}

							if (class389.headIconHintSprites == null) {
								class389.headIconHintSprites = class209.method4562(class188.archive8, InterfaceParent.field870.field5424, 0);
							} else {
								++var21;
							}

							if (class48.mapDotSprites == null) {
								class48.mapDotSprites = class209.method4562(class188.archive8, InterfaceParent.field870.field5423, 0);
							} else {
								++var21;
							}

							if (class360.crossSprites == null) {
								class360.crossSprites = class209.method4562(class188.archive8, InterfaceParent.field870.field5428, 0);
							} else {
								++var21;
							}

							if (AsyncRestClient.field62 == null) {
								AsyncRestClient.field62 = class209.method4562(class188.archive8, InterfaceParent.field870.field5435, 0);
							} else {
								++var21;
							}

							if (class393.scrollBarSprites == null) {
								var2 = class188.archive8;
								var3 = InterfaceParent.field870.field5436;
								if (!class522.method10495(var2, var3, 0)) {
									var1 = null;
								} else {
									var5 = new IndexedSprite[SpriteBufferProperties.SpriteBuffer_spriteCount];

									for (var6 = 0; var6 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var6) {
										var7 = var5[var6] = new IndexedSprite();
										var7.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
										var7.height = SpriteBufferProperties.SpriteBuffer_spriteHeight;
										var7.xOffset = SpriteBufferProperties.SpriteBuffer_xOffsets[var6];
										var7.yOffset = class440.SpriteBuffer_yOffsets[var6];
										var7.subWidth = class333.SpriteBuffer_spriteWidths[var6];
										var7.subHeight = Buffer.SpriteBuffer_spriteHeights[var6];
										var7.palette = class113.SpriteBuffer_spritePalette;
										var7.pixels = SpriteBufferProperties.SpriteBuffer_pixels[var6];
									}

									SpriteBufferProperties.SpriteBuffer_xOffsets = null;
									class440.SpriteBuffer_yOffsets = null;
									class333.SpriteBuffer_spriteWidths = null;
									Buffer.SpriteBuffer_spriteHeights = null;
									class113.SpriteBuffer_spritePalette = null;
									SpriteBufferProperties.SpriteBuffer_pixels = null;
									var1 = var5;
								}

								class393.scrollBarSprites = var1;
							} else {
								++var21;
							}

							if (Tiles.field820 == null) {
								var2 = class188.archive8;
								var3 = InterfaceParent.field870.field5437;
								if (!class522.method10495(var2, var3, 0)) {
									var1 = null;
								} else {
									var5 = new IndexedSprite[SpriteBufferProperties.SpriteBuffer_spriteCount];

									for (var6 = 0; var6 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var6) {
										var7 = var5[var6] = new IndexedSprite();
										var7.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
										var7.height = SpriteBufferProperties.SpriteBuffer_spriteHeight;
										var7.xOffset = SpriteBufferProperties.SpriteBuffer_xOffsets[var6];
										var7.yOffset = class440.SpriteBuffer_yOffsets[var6];
										var7.subWidth = class333.SpriteBuffer_spriteWidths[var6];
										var7.subHeight = Buffer.SpriteBuffer_spriteHeights[var6];
										var7.palette = class113.SpriteBuffer_spritePalette;
										var7.pixels = SpriteBufferProperties.SpriteBuffer_pixels[var6];
									}

									SpriteBufferProperties.SpriteBuffer_xOffsets = null;
									class440.SpriteBuffer_yOffsets = null;
									class333.SpriteBuffer_spriteWidths = null;
									Buffer.SpriteBuffer_spriteHeights = null;
									class113.SpriteBuffer_spritePalette = null;
									SpriteBufferProperties.SpriteBuffer_pixels = null;
									var1 = var5;
								}

								Tiles.field820 = var1;
							} else {
								++var21;
							}

							if (var21 < 11) {
								class330.method7036(70, "Loading sprites - " + var21 * 100 / 12 + "%");
							} else {
								AbstractFont.AbstractFont_modIconSprites = Tiles.field820;
								class141.redHintArrowSprite.normalize();
								var22 = (int)(Math.random() * 21.0D) - 10;
								var23 = (int)(Math.random() * 21.0D) - 10;
								var3 = (int)(Math.random() * 21.0D) - 10;
								var24 = (int)(Math.random() * 41.0D) - 20;
								Bounds.mapSceneSprites[0].shiftColors(var24 + var22, var24 + var23, var24 + var3);
								class330.method7036(60, "Loaded sprites");
								class202.method4464(class69.field961);
							}
						} else if (class69.field961 == Client.field477) {
							if (!class82.field1191.isFullyLoaded()) {
								class330.method7036(70, "Loading textures - " + "0%");
							} else {
								UserComparator5.textureProvider = new TextureProvider(class82.field1191, class188.archive8, 20, FriendSystem.clientPreferences.getBrightness(), 128);
								Rasterizer3D.setTextureLoader(UserComparator5.textureProvider);
								Rasterizer3D.buildPalette(FriendSystem.clientPreferences.getBrightness());
								class202.method4464(class69.field955);
							}
						} else if (Client.field477 == class69.field955) {
							var21 = UserComparator5.textureProvider.getLoadedPercentage();
							if (var21 < 100) {
								class330.method7036(80, "Loading textures - " + var21 + "%");
							} else {
								class330.method7036(90, "Loaded textures");
								class202.method4464(class69.field944);
							}
						} else if (Client.field477 == class69.field944) {
							WorldMapLabel.mouseRecorder = new MouseRecorder();
							GameEngine.taskHandler.newThreadTask(WorldMapLabel.mouseRecorder, 10);
							class330.method7036(92, "Loaded input handler");
							class202.method4464(class69.field957);
						} else if (Client.field477 == class69.field957) {
							if (!PacketWriter.archive10.tryLoadFileByNames("huffman", "")) {
								class330.method7036(94, "Loading wordpack - " + 0 + "%");
							} else {
								Huffman var28 = new Huffman(PacketWriter.archive10.takeFileByNames("huffman", ""));
								class374.huffman = var28;
								class330.method7036(94, "Loaded wordpack");
								class202.method4464(class69.field958);
							}
						} else if (Client.field477 == class69.field958) {
							if (!class161.archive4.isFullyLoaded()) {
								class330.method7036(96, "Loading interfaces - " + class161.archive4.loadPercent() * 4 / 5 + "%");
							} else if (!SecureRandomFuture.soundEffectsArchive.isFullyLoaded()) {
								class330.method7036(96, "Loading interfaces - " + SecureRandomFuture.soundEffectsArchive.loadPercent() * 4 / 5 + "%");
							} else if (!Canvas.archive12.isFullyLoaded()) {
								class330.method7036(96, "Loading interfaces - " + (80 + Canvas.archive12.loadPercent() / 6) + "%");
							} else if (!class36.archive13.isFullyLoaded()) {
								class330.method7036(96, "Loading interfaces - " + (96 + class36.archive13.loadPercent() / 50) + "%");
							} else {
								class330.method7036(98, "Loaded interfaces");
								if (Canvas.archive12.isValidFileName("version.dat", "")) {
									Buffer var0 = new Buffer(Canvas.archive12.takeFileByNames("version.dat", ""));
									var0.readUnsignedShort();
								}

								class202.method4464(class69.field947);
							}
						} else if (class69.field947 == Client.field477) {
							if (class46.field666.getGroupCount() > 0 && !class46.field666.tryLoadGroupByName(WorldMapCacheName.field3410.name)) {
								class330.method7036(100, "Loading world map - " + class46.field666.groupLoadPercentByName(WorldMapCacheName.field3410.name) / 10 + "%");
							} else {
								if (Skills.worldMap == null) {
									Skills.worldMap = new WorldMap();
									Skills.worldMap.init(class46.field666, class175.field1928, ReflectionCheck.field240, HttpJsonRequestBody.fontBold12, Client.fontsMap, Bounds.mapSceneSprites);
								}

								class330.method7036(100, "Loaded world map");
								if (ObjectComposition.field2301) {
									class202.method4464(class69.field963);
								} else {
									class202.method4464(class69.field960);
								}

							}
						} else {
							if (class69.field963 == Client.field477) {
								AsyncRestClient.field57 = false;
								AuthenticationScheme.updateGameState(20);
								BufferedFile.updateLoginState(LoginState.READ_ACCOUNT_INFO_PACKET_SIZE);
							}

						}
					}
				}
			}
		}
	}
}
