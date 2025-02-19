import java.util.ArrayList;
import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qt")
@Implements("Language")
public class Language implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lqt;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lqt;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lqt;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lqt;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lqt;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lqt;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lqt;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lqt;"
	)
	@Export("Language_valuesOrdered")
	public static final Language[] Language_valuesOrdered;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -964837581
	)
	@Export("otpMedium")
	static int otpMedium;
	@ObfuscatedName("cr")
	@Export("otp")
	static String otp;
	@ObfuscatedName("ii")
	@ObfuscatedGetter(
		intValue = 1907977715
	)
	static int field4818;
	@ObfuscatedName("up")
	@ObfuscatedGetter(
		intValue = 1179126223
	)
	static int field4826;
	@ObfuscatedName("af")
	final String field4819;
	@ObfuscatedName("aa")
	@Export("language")
	final String language;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 700908203
	)
	@Export("id")
	final int id;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field4839, 0, "GB");
		Language_DE = new Language("DE", "de", "German", ModeWhere.field4839, 1, "DE");
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field4839, 2, "FR");
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field4839, 3, "BR");
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field4834, 4, "NL");
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field4834, 5, "ES");
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field4839, 6, "MX");
		Language[] var0 = new Language[]{Language_ES_MX, Language_ES, Language_FR, Language_EN, Language_DE, Language_PT, Language_NL};
		Language_valuesOrdered = new Language[var0.length];
		Language[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			Language var4 = var2[var3];
			if (Language_valuesOrdered[var4.id] != null) {
				throw new IllegalStateException();
			}

			Language_valuesOrdered[var4.id] = var4;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqp;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field4819 = var1;
		this.language = var2;
		this.id = var5;
		if (var6 != null) {
			new Locale(var2.substring(0, 2), var6);
		} else {
			new Locale(var2.substring(0, 2));
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "32"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "52790219"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language;
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH);
	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-204060137"
	)
	static void method7970() {
		if (class94.field1161 == Client.field545) {
			class553.field5487 = UserComparator4.newArchive(class400.field4674.field4685, false, true, true, false);
			EnumComposition.field2011 = UserComparator4.newArchive(class400.field4668.field4685, true, true, true, false);
			PendingSpawn.archive8 = UserComparator4.newArchive(class400.field4661.field4685, false, true, true, false);
			class6.archive10 = UserComparator4.newArchive(class400.field4672.field4685, false, true, true, false);
			JagexCache.archive13 = UserComparator4.newArchive(class400.field4686.field4685, true, false, true, false);
			EnumComposition.field2004 = UserComparator4.newArchive(class400.field4665.field4685, false, true, true, false);
			MenuAction.field931 = UserComparator4.newArchive(class400.field4677.field4685, false, true, true, false);
			class78.field996 = UserComparator4.newArchive(class400.field4678.field4685, true, true, true, false);
			ScriptFrame.method1176(20, "Connecting to update server");
			WorldMapIcon_0.method6208(class94.field1163);
		} else {
			int var25;
			byte var46;
			if (class94.field1163 == Client.field545) {
				var46 = 0;
				var25 = var46 + class553.field5487.percentage() * 53 / 100;
				var25 += EnumComposition.field2011.percentage() * 5 / 100;
				var25 += PendingSpawn.archive8.percentage() * 36 / 100;
				var25 += class6.archive10.percentage() / 100;
				var25 += JagexCache.archive13.percentage() / 100;
				var25 += EnumComposition.field2004.percentage() * 2 / 100;
				var25 += MenuAction.field931.percentage() / 100;
				var25 += class78.field996.vmethod7631() && class78.field996.isFullyLoaded() ? 1 : 0;
				if (var25 != 100) {
					if (var25 != 0) {
						ScriptFrame.method1176(30, "Checking for updates - " + var25 + "%");
					}

				} else {
					class109.method2978(class553.field5487, "Sound FX");
					class109.method2978(EnumComposition.field2011, "Music Tracks");
					class109.method2978(PendingSpawn.archive8, "Sprites");
					class109.method2978(EnumComposition.field2004, "Music Samples");
					class109.method2978(MenuAction.field931, "Music Patches");
					class355.field3850 = new GraphicsDefaults();
					class355.field3850.decode(class78.field996);
					ScriptFrame.method1176(40, "Loaded update list");
					WorldMapIcon_0.method6208(class94.field1165);
				}
			} else {
				int var27;
				if (Client.field545 == class94.field1165) {
					class361.method7291(22050, !Client.isLowDetail, 2);
					ArrayList var35 = new ArrayList(3);
					FloorDecoration.pcmPlayer1 = WorldMapSectionType.method6244(GraphicsObject.taskHandler, 0, 2048);
					WorldMapIcon_0.pcmStreamMixer = new PcmStreamMixer();
					PcmStreamMixer var38 = new PcmStreamMixer();
					var38.addSubStream(WorldMapIcon_0.pcmStreamMixer);

					for (var27 = 0; var27 < 3; ++var27) {
						MidiPcmStream var43 = new MidiPcmStream(FloorDecoration.pcmPlayer1);
						var43.method6616(9, 128);
						var38.addSubStream(var43);
						var35.add(var43);
					}

					FloorDecoration.pcmPlayer1.setStream(var38);
					class72.method2199(MenuAction.field931, EnumComposition.field2004, class553.field5487, var35);
					HttpMethod.decimator = new Decimator(22050, PcmPlayer.field284);
					ScriptFrame.method1176(60, "Prepared sound engine");
					WorldMapIcon_0.method6208(class94.field1166);
				} else {
					int var26;
					if (Client.field545 == class94.field1166) {
						if (GrandExchangeOfferAgeComparator.field4751 == null) {
							GrandExchangeOfferAgeComparator.field4751 = new Fonts(PendingSpawn.archive8, JagexCache.archive13);
						}

						FontName[] var34 = new FontName[]{FontName.FontName_plain11, FontName.FontName_verdana11, FontName.FontName_bold12, FontName.FontName_verdana15, FontName.FontName_plain12, FontName.FontName_verdana13};
						var26 = var34.length;
						Client.fontsMap = GrandExchangeOfferAgeComparator.field4751.createMap(FontName.method9920());
						if (Client.fontsMap.size() < var26) {
							ScriptFrame.method1176(80, "Loading fonts - " + Client.fontsMap.size() * 100 / var26 + "%");
						} else {
							SecureRandomCallable.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11);
							class187.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12);
							UserComparator7.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12);
							Decimator.platformInfo = Client.field801.get();
							ScriptFrame.method1176(80, "Loaded fonts");
							WorldMapIcon_0.method6208(class94.field1167);
						}
					} else {
						Archive var2;
						int var3;
						Archive var37;
						int var40;
						if (Client.field545 == class94.field1167) {
							var37 = class6.archive10;
							var2 = PendingSpawn.archive8;
							var3 = 0;
							String[] var44 = Login.field977;

							String var41;
							int var45;
							for (var45 = 0; var45 < var44.length; ++var45) {
								var41 = var44[var45];
								if (var37.tryLoadFileByNames(var41, "")) {
									++var3;
								}
							}

							var44 = Login.field965;

							for (var45 = 0; var45 < var44.length; ++var45) {
								var41 = var44[var45];
								if (var2.tryLoadFileByNames(var41, "")) {
									++var3;
								}
							}

							var44 = Login.field953;

							for (var45 = 0; var45 < var44.length; ++var45) {
								var41 = var44[var45];
								if (var2.getGroupId(var41) != -1 && var2.tryLoadFileByNames(var41, "")) {
									++var3;
								}
							}

							var40 = InterfaceParent.method2432(PendingSpawn.archive8);
							if (var3 < var40) {
								ScriptFrame.method1176(90, "Loading title screen - " + var3 * 100 / var40 + "%");
							} else {
								ScriptFrame.method1176(100, "Loaded title screen");
								if (SecureRandomFuture.field1011) {
									class511.updateGameState(5);
									WorldMapIcon_0.method6208(class94.field1176);
								} else {
									WorldMapIcon_0.method6208(class94.field1178);
								}

							}
						} else if (class94.field1176 == Client.field545) {
							class511.updateGameState(10);
						} else {
							Archive var33;
							if (class94.field1178 == Client.field545) {
								MilliClock.field2452 = UserComparator4.newArchive(class400.field4662.field4685, false, true, true, false);
								class60.field422 = UserComparator4.newArchive(class400.field4675.field4685, false, true, true, true);
								class189.archive2 = UserComparator4.newArchive(class400.field4663.field4685, false, true, true, false);
								Client.field548 = UserComparator4.newArchive(class400.field4664.field4685, true, false, true, false);
								WorldMapIcon_1.field3170 = UserComparator4.newArchive(class400.field4682.field4685, false, true, true, false);
								class166.archive6 = UserComparator4.newArchive(class400.field4667.field4685, true, true, true, false);
								class1.field3 = UserComparator4.newArchive(class400.field4669.field4685, false, true, true, false);
								SpriteMask.field3819 = UserComparator4.newArchive(class400.field4671.field4685, false, true, true, false);
								PlayerUpdateManager.archive9 = UserComparator4.newArchive(class400.field4673.field4685, false, true, true, false);
								TextureProvider.archive12 = UserComparator4.newArchive(class400.field4683.field4685, false, true, true, false);
								ArchiveLoader.field1065 = UserComparator4.newArchive(class400.field4679.field4685, false, true, true, false);
								GrandExchangeEvents.field4746 = UserComparator4.newArchive(class400.field4670.field4685, false, true, true, false);
								KeyHandler.field116 = UserComparator4.newArchive(class400.field4681.field4685, false, true, true, false);
								AsyncHttpResponse.field76 = UserComparator4.newArchive(class400.field4666.field4685, false, true, true, false);
								var26 = class400.field4684.field4685;
								ArchiveDisk var36 = null;
								if (JagexCache.JagexCache_dat2File != null) {
									var36 = new ArchiveDisk(var26, JagexCache.JagexCache_dat2File, class379.JagexCache_idxFiles[var26], 1000000);
								}

								var33 = new Archive(var36, RouteStrategy.masterDisk, AsyncHttpResponse.field77, var26, false, true, true, true, true);
								HealthBarConfig.soundEffectsArchive = var33;
								ScriptFrame.method1176(20, "Connecting to update server");
								WorldMapIcon_0.method6208(class94.field1164);
							} else if (Client.field545 == class94.field1164) {
								var46 = 0;
								var25 = var46 + MilliClock.field2452.percentage() * 4 / 100;
								var25 += class60.field422.percentage() / 100;
								var25 += class189.archive2.percentage() * 2 / 100;
								var25 += Client.field548.percentage() / 100;
								var25 += WorldMapIcon_1.field3170.percentage() / 100;
								var25 += class166.archive6.percentage() * 10 / 100;
								var25 += class1.field3.percentage() * 65 / 100;
								var25 += SpriteMask.field3819.percentage() / 100;
								var25 += PlayerUpdateManager.archive9.percentage() / 100;
								var25 += TextureProvider.archive12.percentage() * 6 / 100;
								var25 += GrandExchangeEvents.field4746.percentage() / 100;
								var25 += ArchiveLoader.field1065.percentage() * 2 / 100;
								var25 += KeyHandler.field116.percentage() * 2 / 100;
								var25 += AsyncHttpResponse.field76.percentage() / 100;
								var25 += HealthBarConfig.soundEffectsArchive.percentage() * 2 / 100;
								if (var25 != 100) {
									if (var25 != 0) {
										ScriptFrame.method1176(30, "Checking for updates - " + var25 + "%");
									}

								} else {
									class109.method2978(MilliClock.field2452, "Animations");
									class109.method2978(class60.field422, "Animation Keyframes");
									class109.method2978(class189.archive2, "Skeletons");
									class109.method2978(class166.archive6, "Maps");
									class109.method2978(class1.field3, "Models");
									class109.method2978(PlayerUpdateManager.archive9, "Music Jingles");
									class109.method2978(GrandExchangeEvents.field4746, "World Map");
									class109.method2978(ArchiveLoader.field1065, "World Map Geography");
									class109.method2978(KeyHandler.field116, "World Map Ground");
									ScriptFrame.method1176(30, "Loaded update list");
									WorldMapIcon_0.method6208(class94.field1174);
								}
							} else if (Client.field545 == class94.field1174) {
								class200.topLevelWorldView = Client.worldViewManager.method2527(104, 104, AbstractWorldMapIcon.clientPreferences.getDrawDistance());
								class376.worldView = class200.topLevelWorldView;
								MidiRequest.sceneMinimapSprite = new SpritePixels(512, 512);
								ScriptFrame.method1176(30, "Starting game engine...");
								WorldMapIcon_0.method6208(class94.field1162);
							} else if (Client.field545 == class94.field1162) {
								if (!Client.field548.isFullyLoaded()) {
									ScriptFrame.method1176(40, "Loading config - " + Client.field548.loadPercent() + "%");
								} else if (!AsyncHttpResponse.field76.isFullyLoaded()) {
									ScriptFrame.method1176(40, "Loading config - " + (80 + TextureProvider.archive12.loadPercent() / 6) + "%");
								} else {
									var33 = Client.field548;
									FloorOverlayDefinition.FloorOverlayDefinition_archive = var33;
									class6.method40(Client.field548);
									var37 = Client.field548;
									var2 = class1.field3;
									KitDefinition.KitDefinition_archive = var37;
									KitDefinition.KitDefinition_modelsArchive = var2;
									KitDefinition.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3);
									Archive var28 = Client.field548;
									Archive var29 = class1.field3;
									boolean var30 = Client.isLowDetail;
									class279.ObjectDefinition_archive = var28;
									ObjectComposition.ObjectDefinition_modelsArchive = var29;
									ObjectComposition.ObjectDefinition_isLowDetail = var30;
									class277.method5805(Client.field548, class1.field3);
									Archive var39 = Client.field548;
									StructComposition.StructDefinition_archive = var39;
									GrandExchangeOfferUnitPriceComparator.method7855(Client.field548, class1.field3, Client.isMembersWorld, SecureRandomCallable.fontPlain11);
									Archive var31 = Client.field548;
									Archive var42 = MilliClock.field2452;
									Archive var9 = class60.field422;
									Archive var10 = class189.archive2;
									SequenceDefinition.SequenceDefinition_archive = var31;
									SequenceDefinition.SequenceDefinition_animationsArchive = var42;
									SequenceDefinition.SequenceDefinition_skeletonsArchive = var9;
									class194.SpotAnimationDefinition_archive = var10;
									Player.method2520(Client.field548, class1.field3);
									Archive var11 = Client.field548;
									VarbitComposition.VarbitDefinition_archive = var11;
									Archive var12 = Client.field548;
									class447.VarpDefinition_archive = var12;
									VarpDefinition.field1924 = class447.VarpDefinition_archive.getGroupFileCount(16);
									class376.widgetDefinition = new WidgetDefinition(WorldMapIcon_1.field3170, class1.field3, PendingSpawn.archive8, JagexCache.archive13, HealthBarConfig.soundEffectsArchive);
									UserComparator9.method3234(Client.field548);
									ModeWhere.method7985(Client.field548);
									Archive var13 = Client.field548;
									VarcInt.VarcInt_archive = var13;
									class146.method3459(Client.field548);
									Archive var14 = Client.field548;
									ParamComposition.ParamDefinition_archive = var14;
									Archive var15 = Client.field548;
									class28.field137 = var15;
									GrandExchangeEvent.method7822(Client.field548);
									PacketBufferNode.method6510(Client.field548);
									class478.field5096 = new class550(DevicePcmPlayerProvider.field93, 54, class144.clientLanguage, Client.field548);
									class328.field3644 = new class550(DevicePcmPlayerProvider.field93, 47, class144.clientLanguage, Client.field548);
									class322.varcs = new Varcs();
									Archive var16 = Client.field548;
									Archive var17 = PendingSpawn.archive8;
									Archive var18 = JagexCache.archive13;
									HitSplatDefinition.HitSplatDefinition_archive = var16;
									HitSplatDefinition.field2188 = var17;
									HitSplatDefinition.HitSplatDefinition_fontsArchive = var18;
									Archive var19 = Client.field548;
									Archive var20 = PendingSpawn.archive8;
									class557.HealthBarDefinition_archive = var19;
									HealthBarDefinition.field1978 = var20;
									Archive var21 = Client.field548;
									Archive var22 = PendingSpawn.archive8;
									WorldMapElement.WorldMapElement_archive = var22;
									if (var21.isFullyLoaded()) {
										WorldMapElement.WorldMapElement_count = var21.getGroupFileCount(35);
										WorldMapElement.WorldMapElement_cached = new WorldMapElement[WorldMapElement.WorldMapElement_count];

										for (int var23 = 0; var23 < WorldMapElement.WorldMapElement_count; ++var23) {
											byte[] var24 = var21.takeFile(35, var23);
											WorldMapElement.WorldMapElement_cached[var23] = new WorldMapElement(var23);
											if (var24 != null) {
												WorldMapElement.WorldMapElement_cached[var23].decode(new Buffer(var24));
												WorldMapElement.WorldMapElement_cached[var23].method3800();
											}
										}
									}

									ScriptFrame.method1176(50, "Loaded config");
									WorldMapIcon_0.method6208(class94.field1169);
								}
							} else if (class94.field1169 == Client.field545) {
								var25 = 0;
								if (class142.compass == null) {
									class142.compass = class145.SpriteBuffer_getSprite(PendingSpawn.archive8, class355.field3850.field5234, 0);
								} else {
									++var25;
								}

								if (class158.redHintArrowSprite == null) {
									class158.redHintArrowSprite = class145.SpriteBuffer_getSprite(PendingSpawn.archive8, class355.field3850.field5220, 0);
								} else {
									++var25;
								}

								IndexedSprite[] var1;
								boolean var4;
								byte[] var5;
								IndexedSprite[] var6;
								int var7;
								IndexedSprite var8;
								if (WorldMapID.mapSceneSprites == null) {
									var2 = PendingSpawn.archive8;
									var3 = class355.field3850.field5222;
									var5 = var2.takeFile(var3, 0);
									if (var5 == null) {
										var4 = false;
									} else {
										class478.SpriteBuffer_decode(var5);
										var4 = true;
									}

									if (!var4) {
										var1 = null;
									} else {
										var6 = new IndexedSprite[class561.SpriteBuffer_spriteCount];

										for (var7 = 0; var7 < class561.SpriteBuffer_spriteCount; ++var7) {
											var8 = var6[var7] = new IndexedSprite();
											var8.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
											var8.height = SpriteBufferProperties.SpriteBuffer_spriteHeight;
											var8.xOffset = Canvas.SpriteBuffer_xOffsets[var7];
											var8.yOffset = class194.SpriteBuffer_yOffsets[var7];
											var8.subWidth = SpriteBufferProperties.SpriteBuffer_spriteWidths[var7];
											var8.subHeight = class456.SpriteBuffer_spriteHeights[var7];
											var8.palette = DbTable.SpriteBuffer_spritePalette;
											var8.pixels = SpriteBufferProperties.SpriteBuffer_pixels[var7];
										}

										CollisionMap.method5672();
										var1 = var6;
									}

									WorldMapID.mapSceneSprites = var1;
								} else {
									++var25;
								}

								if (class165.headIconPkSprites == null) {
									class165.headIconPkSprites = class556.method10080(PendingSpawn.archive8, class355.field3850.field5225, 0);
								} else {
									++var25;
								}

								if (WorldMapSectionType.headIconPrayerSprites == null) {
									WorldMapSectionType.headIconPrayerSprites = class556.method10080(PendingSpawn.archive8, class355.field3850.field5227, 0);
								} else {
									++var25;
								}

								if (PlayerComposition.headIconHintSprites == null) {
									PlayerComposition.headIconHintSprites = class556.method10080(PendingSpawn.archive8, class355.field3850.field5224, 0);
								} else {
									++var25;
								}

								if (BuddyRankComparator.mapDotSprites == null) {
									BuddyRankComparator.mapDotSprites = class556.method10080(PendingSpawn.archive8, class355.field3850.field5221, 0);
								} else {
									++var25;
								}

								if (class201.crossSprites == null) {
									class201.crossSprites = class556.method10080(PendingSpawn.archive8, class355.field3850.field5226, 0);
								} else {
									++var25;
								}

								if (class27.field124 == null) {
									class27.field124 = class556.method10080(PendingSpawn.archive8, class355.field3850.field5236, 0);
								} else {
									++var25;
								}

								if (ClanChannelMember.scrollBarSprites == null) {
									var2 = PendingSpawn.archive8;
									var3 = class355.field3850.field5228;
									var5 = var2.takeFile(var3, 0);
									if (var5 == null) {
										var4 = false;
									} else {
										class478.SpriteBuffer_decode(var5);
										var4 = true;
									}

									if (!var4) {
										var1 = null;
									} else {
										var6 = new IndexedSprite[class561.SpriteBuffer_spriteCount];

										for (var7 = 0; var7 < class561.SpriteBuffer_spriteCount; ++var7) {
											var8 = var6[var7] = new IndexedSprite();
											var8.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
											var8.height = SpriteBufferProperties.SpriteBuffer_spriteHeight;
											var8.xOffset = Canvas.SpriteBuffer_xOffsets[var7];
											var8.yOffset = class194.SpriteBuffer_yOffsets[var7];
											var8.subWidth = SpriteBufferProperties.SpriteBuffer_spriteWidths[var7];
											var8.subHeight = class456.SpriteBuffer_spriteHeights[var7];
											var8.palette = DbTable.SpriteBuffer_spritePalette;
											var8.pixels = SpriteBufferProperties.SpriteBuffer_pixels[var7];
										}

										CollisionMap.method5672();
										var1 = var6;
									}

									ClanChannelMember.scrollBarSprites = var1;
								} else {
									++var25;
								}

								if (class94.field1182 == null) {
									var2 = PendingSpawn.archive8;
									var3 = class355.field3850.field5229;
									var5 = var2.takeFile(var3, 0);
									if (var5 == null) {
										var4 = false;
									} else {
										class478.SpriteBuffer_decode(var5);
										var4 = true;
									}

									if (!var4) {
										var1 = null;
									} else {
										var6 = new IndexedSprite[class561.SpriteBuffer_spriteCount];

										for (var7 = 0; var7 < class561.SpriteBuffer_spriteCount; ++var7) {
											var8 = var6[var7] = new IndexedSprite();
											var8.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
											var8.height = SpriteBufferProperties.SpriteBuffer_spriteHeight;
											var8.xOffset = Canvas.SpriteBuffer_xOffsets[var7];
											var8.yOffset = class194.SpriteBuffer_yOffsets[var7];
											var8.subWidth = SpriteBufferProperties.SpriteBuffer_spriteWidths[var7];
											var8.subHeight = class456.SpriteBuffer_spriteHeights[var7];
											var8.palette = DbTable.SpriteBuffer_spritePalette;
											var8.pixels = SpriteBufferProperties.SpriteBuffer_pixels[var7];
										}

										CollisionMap.method5672();
										var1 = var6;
									}

									class94.field1182 = var1;
								} else {
									++var25;
								}

								if (var25 < 11) {
									ScriptFrame.method1176(70, "Loading sprites - " + var25 * 100 / 12 + "%");
								} else {
									AbstractFont.AbstractFont_modIconSprites = class94.field1182;
									class158.redHintArrowSprite.normalize();
									var26 = (int)(Math.random() * 21.0D) - 10;
									var27 = (int)(Math.random() * 21.0D) - 10;
									var3 = (int)(Math.random() * 21.0D) - 10;
									var40 = (int)(Math.random() * 41.0D) - 20;
									WorldMapID.mapSceneSprites[0].shiftColors(var26 + var40, var27 + var40, var40 + var3);
									ScriptFrame.method1176(60, "Loaded sprites");
									WorldMapIcon_0.method6208(class94.field1168);
								}
							} else if (class94.field1168 == Client.field545) {
								if (!SpriteMask.field3819.isFullyLoaded()) {
									ScriptFrame.method1176(70, "Loading textures - " + "0%");
								} else {
									class339.textureProvider = new TextureProvider(SpriteMask.field3819, PendingSpawn.archive8, 20, AbstractWorldMapIcon.clientPreferences.getBrightness(), Client.isLowDetail ? 64 : 128);
									Rasterizer3D.setTextureLoader(class339.textureProvider);
									Rasterizer3D.buildPalette(AbstractWorldMapIcon.clientPreferences.getBrightness());
									WorldMapIcon_0.method6208(class94.field1171);
								}
							} else if (Client.field545 == class94.field1171) {
								var25 = class339.textureProvider.getLoadedPercentage();
								if (var25 < 100) {
									ScriptFrame.method1176(80, "Loading textures - " + var25 + "%");
								} else {
									ScriptFrame.method1176(90, "Loaded textures");
									WorldMapIcon_0.method6208(class94.field1172);
								}
							} else if (class94.field1172 == Client.field545) {
								class178.mouseRecorder = new MouseRecorder();
								GraphicsObject.taskHandler.newThreadTask(class178.mouseRecorder, 10);
								ScriptFrame.method1176(92, "Loaded input handler");
								WorldMapIcon_0.method6208(class94.field1181);
							} else if (Client.field545 == class94.field1181) {
								if (!class6.archive10.tryLoadFileByNames("huffman", "")) {
									ScriptFrame.method1176(94, "Loading wordpack - " + 0 + "%");
								} else {
									Huffman var32 = new Huffman(class6.archive10.takeFileByNames("huffman", ""));
									class366.huffman = var32;
									ScriptFrame.method1176(94, "Loaded wordpack");
									WorldMapIcon_0.method6208(class94.field1173);
								}
							} else if (Client.field545 == class94.field1173) {
								if (!WorldMapIcon_1.field3170.isFullyLoaded()) {
									ScriptFrame.method1176(96, "Loading interfaces - " + WorldMapIcon_1.field3170.loadPercent() * 4 / 5 + "%");
								} else if (!HealthBarConfig.soundEffectsArchive.isFullyLoaded()) {
									ScriptFrame.method1176(96, "Loading interfaces - " + HealthBarConfig.soundEffectsArchive.loadPercent() * 4 / 5 + "%");
								} else if (!TextureProvider.archive12.isFullyLoaded()) {
									ScriptFrame.method1176(96, "Loading interfaces - " + (80 + TextureProvider.archive12.loadPercent() / 6) + "%");
								} else if (!JagexCache.archive13.isFullyLoaded()) {
									ScriptFrame.method1176(96, "Loading interfaces - " + (96 + JagexCache.archive13.loadPercent() / 50) + "%");
								} else {
									ScriptFrame.method1176(98, "Loaded interfaces");
									if (TextureProvider.archive12.isValidFileName("version.dat", "")) {
										Buffer var0 = new Buffer(TextureProvider.archive12.takeFileByNames("version.dat", ""));
										var0.readUnsignedShort();
									}

									WorldMapIcon_0.method6208(class94.field1175);
								}
							} else if (class94.field1175 == Client.field545) {
								if (GrandExchangeEvents.field4746.getGroupCount() > 0 && !GrandExchangeEvents.field4746.tryLoadGroupByName(WorldMapCacheName.field3340.name)) {
									ScriptFrame.method1176(100, "Loading world map - " + GrandExchangeEvents.field4746.groupLoadPercentByName(WorldMapCacheName.field3340.name) / 10 + "%");
								} else {
									if (class541.worldMap == null) {
										class541.worldMap = new WorldMap();
										class541.worldMap.init(GrandExchangeEvents.field4746, ArchiveLoader.field1065, KeyHandler.field116, UserComparator7.fontBold12, Client.fontsMap, WorldMapID.mapSceneSprites);
									}

									ScriptFrame.method1176(100, "Loaded world map");
									if (SecureRandomFuture.field1011) {
										WorldMapIcon_0.method6208(class94.field1177);
									} else {
										WorldMapIcon_0.method6208(class94.field1176);
									}

									Client.field575 = false;
								}
							} else {
								if (Client.field545 == class94.field1177) {
									HttpResponse.field83 = false;
									class511.updateGameState(20);
									class215.updateLoginState(LoginState.READ_ACCOUNT_INFO_PACKET_SIZE);
								}

							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "626105111"
	)
	@Export("loadRegion")
	static final void loadRegion() {
		GameBuild.method7512(false);
		Client.field553 = 0;
		boolean var0 = true;

		int var1;
		for (var1 = 0; var1 < KitDefinition.regionLandArchives.length; ++var1) {
			if (ItemLayer.regionMapArchiveIds[var1] != -1 && KitDefinition.regionLandArchives[var1] == null) {
				KitDefinition.regionLandArchives[var1] = class166.archive6.takeFile(ItemLayer.regionMapArchiveIds[var1], 0);
				if (KitDefinition.regionLandArchives[var1] == null) {
					var0 = false;
					++Client.field553;
				}
			}

			if (UserComparator8.regionLandArchiveIds[var1] != -1 && class370.regionMapArchives[var1] == null) {
				class370.regionMapArchives[var1] = class166.archive6.takeFileEncrypted(UserComparator8.regionLandArchiveIds[var1], 0, class28.xteaKeys[var1]);
				if (class370.regionMapArchives[var1] == null) {
					var0 = false;
					++Client.field553;
				}
			}
		}

		if (!var0) {
			Client.field585 = 1;
		} else {
			Client.field583 = 0;
			var0 = true;

			int var3;
			int var4;
			for (var1 = 0; var1 < KitDefinition.regionLandArchives.length; ++var1) {
				byte[] var17 = class370.regionMapArchives[var1];
				if (var17 != null) {
					var3 = (class401.regions[var1] >> 8) * 64 - class200.topLevelWorldView.baseX;
					var4 = (class401.regions[var1] & 255) * 64 - class200.topLevelWorldView.baseY;
					if (Client.isInInstance) {
						var3 = 10;
						var4 = 10;
					}

					var0 &= ArchiveLoader.method2415(var17, var3, var4);
				}
			}

			if (!var0) {
				Client.field585 = 2;
			} else {
				if (Client.field585 != 0) {
					TextureProvider.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				UrlRequester.method3151();
				class200.topLevelWorldView.scene.clearTempGameObjects();

				for (var1 = 0; var1 < 4; ++var1) {
					class200.topLevelWorldView.collisionMaps[var1].clear();
				}

				int var2;
				for (var1 = 0; var1 < 4; ++var1) {
					for (var2 = 0; var2 < 104; ++var2) {
						for (var3 = 0; var3 < 104; ++var3) {
							class200.topLevelWorldView.tileSettings[var1][var2][var3] = 0;
						}
					}
				}

				UrlRequester.method3151();
				HttpRequestTask.method246();
				var1 = KitDefinition.regionLandArchives.length;
				RouteStrategy.method5690();
				GameBuild.method7512(true);
				int var5;
				if (!Client.isInInstance) {
					byte[] var16;
					for (var2 = 0; var2 < var1; ++var2) {
						var3 = (class401.regions[var2] >> 8) * 64 - class200.topLevelWorldView.baseX;
						var4 = (class401.regions[var2] & 255) * 64 - class200.topLevelWorldView.baseY;
						var16 = KitDefinition.regionLandArchives[var2];
						if (var16 != null) {
							UrlRequester.method3151();
							ClanSettings.method3606(class200.topLevelWorldView, var16, var3, var4, ApproximateRouteStrategy.field476 * 8 - 48, field4818 * 8 - 48);
						}
					}

					for (var2 = 0; var2 < var1; ++var2) {
						var3 = (class401.regions[var2] >> 8) * 64 - class200.topLevelWorldView.baseX;
						var4 = (class401.regions[var2] & 255) * 64 - class200.topLevelWorldView.baseY;
						var16 = KitDefinition.regionLandArchives[var2];
						if (var16 == null && field4818 < 800) {
							UrlRequester.method3151();
							class448.method8505(class200.topLevelWorldView, var3, var4, 64, 64);
						}
					}

					GameBuild.method7512(true);

					for (var2 = 0; var2 < var1; ++var2) {
						byte[] var15 = class370.regionMapArchives[var2];
						if (var15 != null) {
							var4 = (class401.regions[var2] >> 8) * 64 - class200.topLevelWorldView.baseX;
							var5 = (class401.regions[var2] & 255) * 64 - class200.topLevelWorldView.baseY;
							UrlRequester.method3151();
							UserComparator8.method3190(class200.topLevelWorldView, var15, var4, var5);
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
						UrlRequester.method3151();

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

									for (int var12 = 0; var12 < class401.regions.length; ++var12) {
										if (class401.regions[var12] == var11 && KitDefinition.regionLandArchives[var12] != null) {
											int var13 = (var9 - var3) * 8;
											int var14 = (var10 - var4) * 8;
											class375.method7504(class200.topLevelWorldView, KitDefinition.regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, var13, var14);
											var18 = true;
											break;
										}
									}
								}

								if (!var18) {
									ClanChannel.method3672(class200.topLevelWorldView.tileHeights, var2, var3 * 8, var4 * 8);
								}
							}
						}
					}

					for (var2 = 0; var2 < 13; ++var2) {
						for (var3 = 0; var3 < 13; ++var3) {
							var4 = Client.instanceChunkTemplates[0][var2][var3];
							if (var4 == -1) {
								class448.method8505(class200.topLevelWorldView, var2 * 8, var3 * 8, 8, 8);
							}
						}
					}

					GameBuild.method7512(true);

					for (var2 = 0; var2 < 4; ++var2) {
						UrlRequester.method3151();

						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								var5 = Client.instanceChunkTemplates[var2][var3][var4];
								if (var5 != -1) {
									var6 = var5 >> 24 & 3;
									var7 = var5 >> 1 & 3;
									var8 = var5 >> 14 & 1023;
									var9 = var5 >> 3 & 2047;
									var10 = (var8 / 8 << 8) + var9 / 8;

									for (var11 = 0; var11 < class401.regions.length; ++var11) {
										if (class401.regions[var11] == var10 && class370.regionMapArchives[var11] != null) {
											Tiles.method2354(class200.topLevelWorldView, class370.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7);
											break;
										}
									}
								}
							}
						}
					}
				}

				GameBuild.method7512(true);
				UrlRequester.method3151();
				class197.method3992(class200.topLevelWorldView);
				GameBuild.method7512(true);
				var2 = Tiles.Tiles_minPlane;
				if (var2 > class200.topLevelWorldView.plane) {
					var2 = class200.topLevelWorldView.plane;
				}

				if (var2 < class200.topLevelWorldView.plane - 1) {
					var2 = class200.topLevelWorldView.plane - 1;
				}

				if (Client.isLowDetail) {
					class200.topLevelWorldView.scene.init(Tiles.Tiles_minPlane);
				} else {
					class200.topLevelWorldView.scene.init(0);
				}

				for (var3 = 0; var3 < 104; ++var3) {
					for (var4 = 0; var4 < 104; ++var4) {
						TaskHandler.updateItemPile3(class200.topLevelWorldView, var3, var4);
					}
				}

				UrlRequester.method3151();
				Varcs.method3070();
				ObjectComposition.ObjectDefinition_cachedModelData.clear();
				PacketBufferNode var19;
				if (class569.client.hasFrame()) {
					var19 = class272.getPacketBufferNode(ClientPacket.DETECT_MODIFIED_CLIENT, Client.packetWriter.isaacCipher);
					var19.packetBuffer.writeInt(1057001181);
					Client.packetWriter.addNode(var19);
				}

				if (!Client.isInInstance) {
					var3 = (ApproximateRouteStrategy.field476 - 6) / 8;
					var4 = (ApproximateRouteStrategy.field476 + 6) / 8;
					var5 = (field4818 - 6) / 8;
					var6 = (field4818 + 6) / 8;

					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) {
						for (var8 = var5 - 1; var8 <= var6 + 1; ++var8) {
							if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) {
								class166.archive6.loadRegionFromName("m" + var7 + "_" + var8);
								class166.archive6.loadRegionFromName("l" + var7 + "_" + var8);
							}
						}
					}
				}

				UrlRequester.method3151();
				WorldView.method2831();
				var19 = class272.getPacketBufferNode(ClientPacket.MAP_BUILD_COMPLETE, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var19);
				class162.method3623();
				Client.field519 = false;
			}
		}
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "99442489"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1, int var2) {
		WorldMapRegion.updateItemPile2(class376.worldView, var0, var1, var2);
	}
}
