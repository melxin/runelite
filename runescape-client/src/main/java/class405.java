import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pi")
public enum class405 implements Enum {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	field4901(0),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	field4898(1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	field4899(2),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	field4900(3);

	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -922772659
	)
	public final int field4897;

	class405(int var3) {
		this.field4897 = var3;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "20"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4897;
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "3"
	)
	static void method8482() {
		if (Client.field550 == class69.field935) {
			class175.field1928 = class69.newArchive(class418.field4991.field5012, false, true, true, false);
			GrandExchangeOfferOwnWorldComparator.field248 = class69.newArchive(class418.field4995.field5012, true, true, true, false);
			class147.archive8 = class69.newArchive(class418.field4986.field5012, false, true, true, false);
			HttpRequestTask.archive10 = class69.newArchive(class418.field4997.field5012, false, true, true, false);
			ActorSpotAnim.archive13 = class69.newArchive(class418.field5000.field5012, true, false, true, false);
			class474.field5353 = class69.newArchive(class418.field5008.field5012, false, true, true, false);
			class226.field2558 = class69.newArchive(class418.field5001.field5012, false, true, true, false);
			Varps.field4092 = class69.newArchive(class418.field5003.field5012, true, true, true, false);
			SceneTilePaint.method6128(20, "Connecting to update server");
			HitSplatDefinition.method4773(class69.field927);
		} else {
			int var24;
			byte var44;
			if (Client.field550 == class69.field927) {
				var44 = 0;
				var24 = var44 + class175.field1928.percentage() * 53 / 100;
				var24 += GrandExchangeOfferOwnWorldComparator.field248.percentage() * 5 / 100;
				var24 += class147.archive8.percentage() * 36 / 100;
				var24 += HttpRequestTask.archive10.percentage() / 100;
				var24 += ActorSpotAnim.archive13.percentage() / 100;
				var24 += class474.field5353.percentage() * 2 / 100;
				var24 += class226.field2558.percentage() / 100;
				var24 += Varps.field4092.method8532() && Varps.field4092.isFullyLoaded() ? 1 : 0;
				if (var24 != 100) {
					if (var24 != 0) {
						SceneTilePaint.method6128(30, "Checking for updates - " + var24 + "%");
					}

				} else {
					FileSystem.method5113(class175.field1928, "Sound FX");
					FileSystem.method5113(GrandExchangeOfferOwnWorldComparator.field248, "Music Tracks");
					FileSystem.method5113(class147.archive8, "Sprites");
					FileSystem.method5113(class474.field5353, "Music Samples");
					FileSystem.method5113(class226.field2558, "Music Patches");
					ApproximateRouteStrategy.field225 = new GraphicsDefaults();
					ApproximateRouteStrategy.field225.decode(Varps.field4092);
					SceneTilePaint.method6128(40, "Loaded update list");
					HitSplatDefinition.method4773(class69.field929);
				}
			} else {
				int var3;
				Archive var4;
				Archive var28;
				if (Client.field550 == class69.field929) {
					boolean var45 = !Client.isLowDetail;
					EnumComposition.field2063 = 155013150;
					FaceNormal.PcmPlayer_stereo = var45;
					class339.field3870 = 2;
					ArrayList var37 = new ArrayList(3);
					Skills.pcmPlayer1 = class62.method2176(GameEngine.taskHandler, 0, 2048);
					class50.pcmStreamMixer = new PcmStreamMixer();
					PcmStreamMixer var39 = new PcmStreamMixer();
					var39.addSubStream(class50.pcmStreamMixer);

					for (var3 = 0; var3 < 3; ++var3) {
						MidiPcmStream var40 = new MidiPcmStream(Skills.pcmPlayer1);
						var40.method7435(9, 128);
						var39.addSubStream(var40);
						var37.add(var40);
					}

					Skills.pcmPlayer1.setStream(var39);
					var28 = class226.field2558;
					var4 = class474.field5353;
					Archive var41 = class175.field1928;
					class345.field3927 = var28;
					WidgetFocusInputManager.field3220 = var4;
					class173.field1921 = var41;
					class345.field3924 = var37;
					SceneTilePaint.method6128(60, "Prepared sound engine");
					HitSplatDefinition.method4773(class69.field930);
				} else {
					int var25;
					if (class69.field930 == Client.field550) {
						if (class189.field2051 == null) {
							class189.field2051 = new Fonts(class147.archive8, ActorSpotAnim.archive13);
						}

						FontName[] var33 = new FontName[]{FontName.FontName_plain12, FontName.FontName_bold12, FontName.FontName_verdana11, FontName.FontName_verdana13, FontName.FontName_plain11, FontName.FontName_verdana15};
						var25 = var33.length;
						Fonts var38 = class189.field2051;
						FontName[] var43 = new FontName[]{FontName.FontName_plain12, FontName.FontName_bold12, FontName.FontName_verdana11, FontName.FontName_verdana13, FontName.FontName_plain11, FontName.FontName_verdana15};
						Client.fontsMap = var38.createMap(var43);
						if (Client.fontsMap.size() < var25) {
							SceneTilePaint.method6128(80, "Loading fonts - " + Client.fontsMap.size() * 100 / var25 + "%");
						} else {
							class498.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11);
							UserComparator5.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12);
							class234.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12);
							WorldMapLabelSize.platformInfo = Client.field391.get();
							SceneTilePaint.method6128(80, "Loaded fonts");
							HitSplatDefinition.method4773(class69.field928);
						}
					} else if (class69.field928 == Client.field550) {
						var24 = class28.method429(HttpRequestTask.archive10, class147.archive8);
						var25 = HttpRequest.method102(class147.archive8);
						if (var24 < var25) {
							SceneTilePaint.method6128(90, "Loading title screen - " + var24 * 100 / var25 + "%");
						} else {
							SceneTilePaint.method6128(100, "Loaded title screen");
							if (class452.field5203) {
								WorldMapSectionType.updateGameState(5);
								HitSplatDefinition.method4773(class69.field940);
							} else {
								HitSplatDefinition.method4773(class69.field926);
							}

						}
					} else if (class69.field940 == Client.field550) {
						WorldMapSectionType.updateGameState(10);
					} else {
						Archive var32;
						if (class69.field926 == Client.field550) {
							AbstractWorldMapIcon.field3529 = class69.newArchive(class418.field4987.field5012, false, true, true, false);
							AsyncHttpResponse.field67 = class69.newArchive(class418.field5005.field5012, false, true, true, true);
							VarcInt.field2017 = class69.newArchive(class418.field4988.field5012, false, true, true, false);
							StructComposition.archive2 = class69.newArchive(class418.field4989.field5012, true, false, true, false);
							class189.archive4 = class69.newArchive(class418.field5007.field5012, false, true, true, false);
							Tile.archive9 = class69.newArchive(class418.field4990.field5012, true, true, true, false);
							Skeleton.field2836 = class69.newArchive(class418.field4994.field5012, false, true, true, false);
							class160.field1815 = class69.newArchive(class418.field5002.field5012, false, true, true, false);
							UserComparator4.archive6 = class69.newArchive(class418.field4998.field5012, false, true, true, false);
							WorldMapRectangle.archive12 = class69.newArchive(class418.field4999.field5012, false, true, true, false);
							ParamComposition.field2290 = class69.newArchive(class418.field5004.field5012, false, true, true, false);
							PcmPlayer.field1328 = class69.newArchive(class418.field5010.field5012, false, true, true, false);
							class138.field1642 = class69.newArchive(class418.field5006.field5012, false, true, true, false);
							class136.field1619 = class69.newArchive(class418.field4992.field5012, false, true, true, false);
							var25 = class418.field5009.field5012;
							ArchiveDisk var34 = null;
							if (JagexCache.JagexCache_dat2File != null) {
								var34 = new ArchiveDisk(var25, JagexCache.JagexCache_dat2File, UserComparator9.JagexCache_idxFiles[var25], 1000000);
							}

							var32 = new Archive(var34, InterfaceParent.masterDisk, VarbitComposition.field2279, var25, false, true, true, true, true);
							Message.soundEffectsArchive = var32;
							SceneTilePaint.method6128(20, "Connecting to update server");
							HitSplatDefinition.method4773(class69.field924);
						} else if (Client.field550 == class69.field924) {
							var44 = 0;
							var24 = var44 + AbstractWorldMapIcon.field3529.percentage() * 4 / 100;
							var24 += AsyncHttpResponse.field67.percentage() / 100;
							var24 += VarcInt.field2017.percentage() * 2 / 100;
							var24 += StructComposition.archive2.percentage() / 100;
							var24 += class189.archive4.percentage() / 100;
							var24 += Tile.archive9.percentage() * 10 / 100;
							var24 += Skeleton.field2836.percentage() * 65 / 100;
							var24 += class160.field1815.percentage() / 100;
							var24 += UserComparator4.archive6.percentage() / 100;
							var24 += WorldMapRectangle.archive12.percentage() * 6 / 100;
							var24 += PcmPlayer.field1328.percentage() / 100;
							var24 += ParamComposition.field2290.percentage() * 2 / 100;
							var24 += class138.field1642.percentage() * 2 / 100;
							var24 += class136.field1619.percentage() / 100;
							var24 += Message.soundEffectsArchive.percentage() * 2 / 100;
							if (var24 != 100) {
								if (var24 != 0) {
									SceneTilePaint.method6128(30, "Checking for updates - " + var24 + "%");
								}

							} else {
								FileSystem.method5113(AbstractWorldMapIcon.field3529, "Animations");
								FileSystem.method5113(AsyncHttpResponse.field67, "Animation Keyframes");
								FileSystem.method5113(VarcInt.field2017, "Skeletons");
								FileSystem.method5113(Tile.archive9, "Maps");
								FileSystem.method5113(Skeleton.field2836, "Models");
								FileSystem.method5113(UserComparator4.archive6, "Music Jingles");
								FileSystem.method5113(PcmPlayer.field1328, "World Map");
								FileSystem.method5113(ParamComposition.field2290, "World Map Geography");
								FileSystem.method5113(class138.field1642, "World Map Ground");
								SceneTilePaint.method6128(30, "Loaded update list");
								HitSplatDefinition.method4773(class69.field931);
							}
						} else if (class69.field931 == Client.field550) {
							Occluder.topLevelWorldView = Client.worldViewManager.createWorldView(104, 104, class468.clientPreferences.getDrawDistance());
							AsyncHttpResponse.worldView = Occluder.topLevelWorldView;
							class437.sceneMinimapSprite = new SpritePixels(512, 512);
							SceneTilePaint.method6128(30, "Starting game engine...");
							HitSplatDefinition.method4773(class69.field933);
						} else {
							Archive var2;
							if (Client.field550 == class69.field933) {
								if (!StructComposition.archive2.isFullyLoaded()) {
									SceneTilePaint.method6128(40, "Loading config - " + StructComposition.archive2.loadPercent() + "%");
								} else if (!class136.field1619.isFullyLoaded()) {
									SceneTilePaint.method6128(40, "Loading config - " + (80 + WorldMapRectangle.archive12.loadPercent() / 6) + "%");
								} else {
									var32 = StructComposition.archive2;
									FloorOverlayDefinition.FloorOverlayDefinition_archive = var32;
									ItemContainer.method2163(StructComposition.archive2);
									Archive var36 = StructComposition.archive2;
									var2 = Skeleton.field2836;
									KitDefinition.KitDefinition_archive = var36;
									ClanChannelMember.KitDefinition_modelsArchive = var2;
									class408.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3);
									var28 = StructComposition.archive2;
									var4 = Skeleton.field2836;
									boolean var29 = Client.isLowDetail;
									VarcInt.ObjectDefinition_archive = var28;
									SecureRandomCallable.ObjectDefinition_modelsArchive = var4;
									ObjectComposition.ObjectDefinition_isLowDetail = var29;
									Archive var30 = StructComposition.archive2;
									Archive var42 = Skeleton.field2836;
									Username.NpcDefinition_archive = var30;
									class348.field3986 = var42;
									class157.method4009(StructComposition.archive2);
									Archive var8 = StructComposition.archive2;
									Archive var9 = Skeleton.field2836;
									boolean var10 = Client.isMembersWorld;
									Font var11 = class498.fontPlain11;
									class138.ItemDefinition_archive = var8;
									Language.ItemDefinition_modelArchive = var9;
									TileItem.ItemDefinition_inMembersWorld = var10;
									class394.ItemDefinition_fileCount = class138.ItemDefinition_archive.getGroupFileCount(10);
									class175.ItemDefinition_fontPlain11 = var11;
									SecureRandomCallable.method2151(StructComposition.archive2, AbstractWorldMapIcon.field3529, AsyncHttpResponse.field67, VarcInt.field2017);
									Archive var12 = StructComposition.archive2;
									Archive var13 = Skeleton.field2836;
									SpotAnimationDefinition.field2199 = var12;
									SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var13;
									Archive var14 = StructComposition.archive2;
									VarbitComposition.VarbitDefinition_archive = var14;
									class46.method1918(StructComposition.archive2);
									int var15 = VarpDefinition.field1976;
									Varps.Varps_temp = new int[var15];
									Varps.Varps_main = new int[var15];
									class226.widgetDefinition = new WidgetDefinition(class189.archive4, Skeleton.field2836, class147.archive8, ActorSpotAnim.archive13, Message.soundEffectsArchive);
									Archive var16 = StructComposition.archive2;
									InvDefinition.InvDefinition_archive = var16;
									Archive var17 = StructComposition.archive2;
									EnumComposition.EnumDefinition_archive = var17;
									class342.method7324(StructComposition.archive2);
									Archive var18 = StructComposition.archive2;
									class378.method7970(StructComposition.archive2);
									Archive var19 = StructComposition.archive2;
									Archive var20 = class147.archive8;
									HttpAuthenticationHeader.field5422 = var19;
									class141.field1694 = var20;
									Archive var21 = StructComposition.archive2;
									class458.field5233 = var21;
									class86.method2933(StructComposition.archive2);
									class86.field1210 = new class580(class520.field5546, 54, class352.clientLanguage, StructComposition.archive2);
									ScriptFrame.field202 = new class580(class520.field5546, 47, class352.clientLanguage, StructComposition.archive2);
									class166.varcs = new Varcs();
									class380.method8117(StructComposition.archive2, class147.archive8, ActorSpotAnim.archive13);
									Archive var22 = StructComposition.archive2;
									Archive var23 = class147.archive8;
									HealthBarDefinition.HealthBarDefinition_archive = var22;
									UserComparator1.field6081 = var23;
									class169.method4185(StructComposition.archive2, class147.archive8);
									SceneTilePaint.method6128(50, "Loaded config");
									HitSplatDefinition.method4773(class69.field925);
								}
							} else if (Client.field550 == class69.field925) {
								var24 = 0;
								if (class472.compass == null) {
									class472.compass = class387.SpriteBuffer_getSprite(class147.archive8, ApproximateRouteStrategy.field225.field5614, 0);
								} else {
									++var24;
								}

								if (class39.redHintArrowSprite == null) {
									class39.redHintArrowSprite = class387.SpriteBuffer_getSprite(class147.archive8, ApproximateRouteStrategy.field225.field5617, 0);
								} else {
									++var24;
								}

								IndexedSprite[] var1;
								IndexedSprite[] var5;
								int var6;
								IndexedSprite var7;
								if (class499.mapSceneSprites == null) {
									var2 = class147.archive8;
									var3 = ApproximateRouteStrategy.field225.field5609;
									if (!FloorOverlayDefinition.method4919(var2, var3, 0)) {
										var1 = null;
									} else {
										var5 = new IndexedSprite[class615.SpriteBuffer_spriteCount];

										for (var6 = 0; var6 < class615.SpriteBuffer_spriteCount; ++var6) {
											var7 = var5[var6] = new IndexedSprite();
											var7.width = class208.SpriteBuffer_spriteWidth;
											var7.height = class144.SpriteBuffer_spriteHeight;
											var7.xOffset = class615.SpriteBuffer_xOffsets[var6];
											var7.yOffset = class615.SpriteBuffer_yOffsets[var6];
											var7.subWidth = IntHashTable.SpriteBuffer_spriteWidths[var6];
											var7.subHeight = class615.SpriteBuffer_spriteHeights[var6] * 449044205;
											var7.palette = BufferedSource.SpriteBuffer_spritePalette;
											var7.pixels = class320.SpriteBuffer_pixels[var6];
										}

										class615.SpriteBuffer_xOffsets = null;
										class615.SpriteBuffer_yOffsets = null;
										IntHashTable.SpriteBuffer_spriteWidths = null;
										class615.SpriteBuffer_spriteHeights = null;
										BufferedSource.SpriteBuffer_spritePalette = null;
										class320.SpriteBuffer_pixels = null;
										var1 = var5;
									}

									class499.mapSceneSprites = var1;
								} else {
									++var24;
								}

								if (class66.headIconPkSprites == null) {
									class66.headIconPkSprites = class69.method2287(class147.archive8, ApproximateRouteStrategy.field225.field5620, 0);
								} else {
									++var24;
								}

								if (class279.headIconPrayerSprites == null) {
									class279.headIconPrayerSprites = class69.method2287(class147.archive8, ApproximateRouteStrategy.field225.field5628, 0);
								} else {
									++var24;
								}

								if (SceneTilePaint.headIconHintSprites == null) {
									SceneTilePaint.headIconHintSprites = class69.method2287(class147.archive8, ApproximateRouteStrategy.field225.field5621, 0);
								} else {
									++var24;
								}

								if (class217.mapDotSprites == null) {
									class217.mapDotSprites = class69.method2287(class147.archive8, ApproximateRouteStrategy.field225.field5622, 0);
								} else {
									++var24;
								}

								if (class137.crossSprites == null) {
									class137.crossSprites = class69.method2287(class147.archive8, ApproximateRouteStrategy.field225.field5623, 0);
								} else {
									++var24;
								}

								if (class579.field5923 == null) {
									class579.field5923 = class69.method2287(class147.archive8, ApproximateRouteStrategy.field225.field5624, 0);
								} else {
									++var24;
								}

								if (WorldMapArchiveLoader.scrollBarSprites == null) {
									var2 = class147.archive8;
									var3 = ApproximateRouteStrategy.field225.field5625;
									if (!FloorOverlayDefinition.method4919(var2, var3, 0)) {
										var1 = null;
									} else {
										var5 = new IndexedSprite[class615.SpriteBuffer_spriteCount];

										for (var6 = 0; var6 < class615.SpriteBuffer_spriteCount; ++var6) {
											var7 = var5[var6] = new IndexedSprite();
											var7.width = class208.SpriteBuffer_spriteWidth;
											var7.height = class144.SpriteBuffer_spriteHeight;
											var7.xOffset = class615.SpriteBuffer_xOffsets[var6];
											var7.yOffset = class615.SpriteBuffer_yOffsets[var6];
											var7.subWidth = IntHashTable.SpriteBuffer_spriteWidths[var6];
											var7.subHeight = class615.SpriteBuffer_spriteHeights[var6] * 449044205;
											var7.palette = BufferedSource.SpriteBuffer_spritePalette;
											var7.pixels = class320.SpriteBuffer_pixels[var6];
										}

										class615.SpriteBuffer_xOffsets = null;
										class615.SpriteBuffer_yOffsets = null;
										IntHashTable.SpriteBuffer_spriteWidths = null;
										class615.SpriteBuffer_spriteHeights = null;
										BufferedSource.SpriteBuffer_spritePalette = null;
										class320.SpriteBuffer_pixels = null;
										var1 = var5;
									}

									WorldMapArchiveLoader.scrollBarSprites = var1;
								} else {
									++var24;
								}

								if (UrlRequest.field1542 == null) {
									UrlRequest.field1542 = class207.method4647(class147.archive8, ApproximateRouteStrategy.field225.field5626, 0);
								} else {
									++var24;
								}

								ModelData var35;
								if (AbstractWorldMapIcon.field3523 == null && ApproximateRouteStrategy.field225.field5627 != -1) {
									var35 = ModelData.ModelData_get(Skeleton.field2836, ApproximateRouteStrategy.field225.field5627, 0);
									if (var35 != null) {
										AbstractWorldMapIcon.field3523 = var35.method5285();
									}
								} else {
									++var24;
								}

								if (class166.field1882 == null && ApproximateRouteStrategy.field225.field5613 != -1) {
									var35 = ModelData.ModelData_get(Skeleton.field2836, ApproximateRouteStrategy.field225.field5613, 0);
									if (var35 != null) {
										class166.field1882 = var35.method5285();
									}
								} else {
									++var24;
								}

								if (var24 < 13) {
									SceneTilePaint.method6128(70, "Loading sprites - " + var24 * 100 / 14 + "%");
								} else {
									AbstractFont.AbstractFont_modIconSprites = UrlRequest.field1542;
									class39.redHintArrowSprite.normalize();
									var25 = (int)(Math.random() * 21.0D) - 10;
									int var26 = (int)(Math.random() * 21.0D) - 10;
									var3 = (int)(Math.random() * 21.0D) - 10;
									int var27 = (int)(Math.random() * 41.0D) - 20;
									class499.mapSceneSprites[0].shiftColors(var25 + var27, var26 + var27, var3 + var27);
									SceneTilePaint.method6128(60, "Loaded sprites");
									HitSplatDefinition.method4773(class69.field934);
								}
							} else if (class69.field934 == Client.field550) {
								if (!class160.field1815.isFullyLoaded()) {
									SceneTilePaint.method6128(70, "Loading textures - " + "0%");
								} else {
									WorldMapSection0.textureProvider = new TextureProvider(class160.field1815, class147.archive8, 20, class468.clientPreferences.getBrightness(), 128);
									Rasterizer3D.setTextureLoader(WorldMapSection0.textureProvider);
									Rasterizer3D.buildPalette(class468.clientPreferences.getBrightness());
									HitSplatDefinition.method4773(class69.field932);
								}
							} else if (class69.field932 == Client.field550) {
								var24 = WorldMapSection0.textureProvider.getLoadedPercentage();
								if (var24 < 100) {
									SceneTilePaint.method6128(80, "Loading textures - " + var24 + "%");
								} else {
									SceneTilePaint.method6128(90, "Loaded textures");
									HitSplatDefinition.method4773(class69.field936);
								}
							} else if (class69.field936 == Client.field550) {
								class535.mouseRecorder = new MouseRecorder();
								GameEngine.taskHandler.newThreadTask(class535.mouseRecorder, 10);
								SceneTilePaint.method6128(92, "Loaded input handler");
								HitSplatDefinition.method4773(class69.field937);
							} else if (class69.field937 == Client.field550) {
								if (!HttpRequestTask.archive10.tryLoadFileByNames("huffman", "")) {
									SceneTilePaint.method6128(94, "Loading wordpack - " + 0 + "%");
								} else {
									Huffman var31 = new Huffman(HttpRequestTask.archive10.takeFileByNames("huffman", ""));
									AsyncRestClient.method173(var31);
									SceneTilePaint.method6128(94, "Loaded wordpack");
									HitSplatDefinition.method4773(class69.field938);
								}
							} else if (Client.field550 == class69.field938) {
								if (!class189.archive4.isFullyLoaded()) {
									SceneTilePaint.method6128(96, "Loading interfaces - " + class189.archive4.loadPercent() * 4 / 5 + "%");
								} else if (!Message.soundEffectsArchive.isFullyLoaded()) {
									SceneTilePaint.method6128(96, "Loading interfaces - " + Message.soundEffectsArchive.loadPercent() * 4 / 5 + "%");
								} else if (!WorldMapRectangle.archive12.isFullyLoaded()) {
									SceneTilePaint.method6128(96, "Loading interfaces - " + (80 + WorldMapRectangle.archive12.loadPercent() / 6) + "%");
								} else if (!ActorSpotAnim.archive13.isFullyLoaded()) {
									SceneTilePaint.method6128(96, "Loading interfaces - " + (96 + ActorSpotAnim.archive13.loadPercent() / 50) + "%");
								} else {
									SceneTilePaint.method6128(98, "Loaded interfaces");
									if (WorldMapRectangle.archive12.isValidFileName("version.dat", "")) {
										Buffer var0 = new Buffer(WorldMapRectangle.archive12.takeFileByNames("version.dat", ""));
										var0.readUnsignedShort();
									}

									HitSplatDefinition.method4773(class69.field939);
								}
							} else if (Client.field550 == class69.field939) {
								if (PcmPlayer.field1328.getGroupCount() > 0 && !PcmPlayer.field1328.tryLoadGroupByName(WorldMapCacheName.field3532.name)) {
									SceneTilePaint.method6128(100, "Loading world map - " + PcmPlayer.field1328.groupLoadPercentByName(WorldMapCacheName.field3532.name) / 10 + "%");
								} else {
									if (Skills.worldMap == null) {
										Skills.worldMap = new WorldMap();
										Skills.worldMap.init(PcmPlayer.field1328, ParamComposition.field2290, class138.field1642, class234.fontBold12, Client.fontsMap, class499.mapSceneSprites);
									}

									SceneTilePaint.method6128(100, "Loaded world map");
									if (class452.field5203) {
										HitSplatDefinition.method4773(class69.field941);
									} else {
										HitSplatDefinition.method4773(class69.field940);
									}

								}
							} else {
								if (Client.field550 == class69.field941) {
									class134.field1592 = false;
									WorldMapSectionType.updateGameState(20);
									NpcOverrides.updateLoginState(LoginState.READ_ACCOUNT_INFO_PACKET_SIZE);
								}

							}
						}
					}
				}
			}
		}
	}
}
