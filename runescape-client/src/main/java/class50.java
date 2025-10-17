import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bt")
public class class50 {
	@ObfuscatedName("ab")
	static final BigInteger field692;
	@ObfuscatedName("at")
	static final BigInteger field693;
	@ObfuscatedName("wl")
	@ObfuscatedSignature(
		descriptor = "Lvo;"
	)
	@Export("worldMap")
	static WorldMap worldMap;

	static {
		field692 = new BigInteger("10001", 16);
		field693 = new BigInteger("c1c5120b1d2da47766923df0b8a585f6d9b640dd7b0154d77bd3e05e8ae3643378809c4a4e8a7f7b59e74977063cfce80bcfe1c729fdfdfff4696155e9d6ba70510e5f9832a80b1f3c39d7efa909d0ffdd46af7683f2a96dc7a479ed52d416102dd327fa03cab6623095946204f5caed41d94d1e4a0195a04b20b239f59e7335", 16);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1494753545"
	)
	static void method1923() {
		Iterator var0 = Messages.Messages_hashTable.iterator();

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next();
			var1.clearIsFromFriend();
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILcj;ZB)I",
		garbageValue = "-15"
	)
	static int method1924(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			int var4 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
			var3 = class35.widgetDefinition.method7496(var4);
		} else {
			var3 = var2 ? class359.scriptDotWidget : GameEngine.scriptActiveWidget;
		}

		Widget[] var5;
		if (var0 == ScriptOpcodes.CC_SETPOSITION) {
			UrlRequest.Interpreter_intStackSize -= 4;
			var3.rawX = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
			var3.rawY = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
			var3.xAlignment = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 2];
			var3.yAlignment = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 3];
			class154.invalidateWidget(var3);
			class32.client.alignWidget(var3);
			if (var3.type == 0) {
				var5 = var3.childIndex * -2066937045 == -1 ? class35.widgetDefinition.Widget_interfaceComponents[var3.id >> 16] : class35.widgetDefinition.method7496(var3.parentId).children;
				VarcInt.revalidateWidgetScroll(var5, var3, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) {
			UrlRequest.Interpreter_intStackSize -= 4;
			var3.rawWidth = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
			var3.rawHeight = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
			var3.widthAlignment = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 2];
			var3.heightAlignment = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 3];
			class154.invalidateWidget(var3);
			class32.client.alignWidget(var3);
			if (var3.type == 0) {
				var5 = var3.childIndex * -2066937045 == -1 ? class35.widgetDefinition.Widget_interfaceComponents[var3.id >> 16] : class35.widgetDefinition.method7496(var3.parentId).children;
				VarcInt.revalidateWidgetScroll(var5, var3, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) {
			boolean var6 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1;
			if (var6 != var3.isHidden) {
				var3.isHidden = var6;
				class154.invalidateWidget(var3);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) {
			var3.noClickThrough = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) {
			var3.noScrollThrough = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-31325"
	)
	static void method1922() {
		if (class69.field953 == Client.field443) {
			PacketWriter.field1291 = Actor.newArchive(class408.field4975.field4982, false, true, true, false);
			class443.field5180 = Actor.newArchive(class408.field4963.field4982, true, true, true, false);
			BoundaryObject.archive8 = Actor.newArchive(class408.field4968.field4982, false, true, true, false);
			Projection.archive10 = Actor.newArchive(class408.field4967.field4982, false, true, true, false);
			Canvas.archive13 = Actor.newArchive(class408.field4970.field4982, true, false, true, false);
			WorldViewManager.field1001 = Actor.newArchive(class408.field4971.field4982, false, true, true, false);
			UserComparator4.field1562 = Actor.newArchive(class408.field4972.field4982, false, true, true, false);
			Client.field376 = Actor.newArchive(class408.field4973.field4982, true, true, true, false);
			BuddyRankComparator.method3651(20, "Connecting to update server");
			RestClientThreadFactory.method205(class69.field943);
		} else {
			int var0;
			byte var43;
			if (class69.field943 == Client.field443) {
				var43 = 0;
				var0 = var43 + PacketWriter.field1291.percentage() * 53 / 100;
				var0 += class443.field5180.percentage() * 5 / 100;
				var0 += BoundaryObject.archive8.percentage() * 36 / 100;
				var0 += Projection.archive10.percentage() / 100;
				var0 += Canvas.archive13.percentage() / 100;
				var0 += WorldViewManager.field1001.percentage() * 2 / 100;
				var0 += UserComparator4.field1562.percentage() / 100;
				var0 += Client.field376.method8369() && Client.field376.isFullyLoaded() ? 1 : 0;
				if (var0 != 100) {
					if (var0 != 0) {
						BuddyRankComparator.method3651(30, "Checking for updates - " + var0 + "%");
					}

				} else {
					Projectile.method2012(PacketWriter.field1291, "Sound FX");
					Projectile.method2012(class443.field5180, "Music Tracks");
					Projectile.method2012(BoundaryObject.archive8, "Sprites");
					Projectile.method2012(WorldViewManager.field1001, "Music Samples");
					Projectile.method2012(UserComparator4.field1562, "Music Patches");
					class155.field1804 = new GraphicsDefaults();
					class155.field1804.decode(Client.field376);
					BuddyRankComparator.method3651(40, "Loaded update list");
					RestClientThreadFactory.method205(class69.field950);
				}
			} else {
				int var6;
				if (Client.field443 == class69.field950) {
					boolean var45 = !Client.isLowDetail;
					class349.field4014 = 22050;
					DelayFadeTask.PcmPlayer_stereo = var45;
					FloorDecoration.field2576 = 2;
					ArrayList var37 = new ArrayList(3);
					TaskHandler var30 = GameEngine.taskHandler;
					short var35 = 2048;
					if (class349.field4014 * -304735216 == 0) {
						throw new IllegalStateException();
					} else {
						if (var35 < 512) {
							var35 = 512;
						}

						PcmPlayer var32;
						try {
							PcmPlayer var38 = DelayFadeTask.pcmPlayerProvider.player();
							var38.samples = new int[(DelayFadeTask.PcmPlayer_stereo ? 2 : 1) * 512];
							var38.field1347 = var35;
							var38.init();
							var38.capacity = (var35 & -2048) + 2048;
							if (var38.capacity > 32768) {
								var38.capacity = 32768;
							}

							var38.open(var38.capacity);
							if (FloorDecoration.field2576 > 0 && class454.soundSystem == null) {
								class454.soundSystem = new SoundSystem();
								class146.soundSystemExecutor = Executors.newScheduledThreadPool(1);
								class146.soundSystemExecutor.scheduleAtFixedRate(class454.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS);
							}

							if (class454.soundSystem != null) {
								if (class454.soundSystem.players[0] != null) {
									throw new IllegalArgumentException();
								}

								class454.soundSystem.players[0] = var38;
							}

							var32 = var38;
						} catch (Throwable var28) {
							var32 = new PcmPlayer();
						}

						class135.pcmPlayer1 = var32;
						class4.pcmStreamMixer = new PcmStreamMixer();
						PcmStreamMixer var39 = new PcmStreamMixer();
						var39.addSubStream(class4.pcmStreamMixer);

						for (var6 = 0; var6 < 3; ++var6) {
							MidiPcmStream var41 = new MidiPcmStream(class135.pcmPlayer1);
							var41.method7159(9, 128);
							var39.addSubStream(var41);
							var37.add(var41);
						}

						class135.pcmPlayer1.setStream(var39);
						VarbitComposition.method4589(UserComparator4.field1562, WorldViewManager.field1001, PacketWriter.field1291, var37);
						BuddyRankComparator.method3651(60, "Prepared sound engine");
						RestClientThreadFactory.method205(class69.field940);
					}
				} else {
					int var22;
					if (Client.field443 == class69.field940) {
						if (HttpRequestTask.field78 == null) {
							HttpRequestTask.field78 = new Fonts(BoundaryObject.archive8, Canvas.archive13);
						}

						FontName[] var48 = new FontName[]{FontName.FontName_bold12, FontName.FontName_verdana13, FontName.FontName_verdana11, FontName.FontName_plain12, FontName.FontName_plain11, FontName.FontName_verdana15};
						var22 = var48.length;
						Fonts var31 = HttpRequestTask.field78;
						FontName[] var29 = new FontName[]{FontName.FontName_bold12, FontName.FontName_verdana13, FontName.FontName_verdana11, FontName.FontName_plain12, FontName.FontName_plain11, FontName.FontName_verdana15};
						Client.fontsMap = var31.createMap(var29);
						if (Client.fontsMap.size() < var22) {
							BuddyRankComparator.method3651(80, "Loading fonts - " + Client.fontsMap.size() * 100 / var22 + "%");
						} else {
							class85.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11);
							Message.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12);
							class70.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12);
							class151.platformInfo = Client.field528.get();
							BuddyRankComparator.method3651(80, "Loaded fonts");
							RestClientThreadFactory.method205(class69.field951);
						}
					} else {
						Archive var2;
						Archive var5;
						int var23;
						Archive var36;
						if (Client.field443 == class69.field951) {
							var36 = Projection.archive10;
							var2 = BoundaryObject.archive8;
							var23 = 0;
							String[] var24 = Login.field737;

							int var25;
							String var49;
							for (var25 = 0; var25 < var24.length; ++var25) {
								var49 = var24[var25];
								if (var36.tryLoadFileByNames(var49, "")) {
									++var23;
								}
							}

							var24 = Login.field706;

							for (var25 = 0; var25 < var24.length; ++var25) {
								var49 = var24[var25];
								if (var2.tryLoadFileByNames(var49, "")) {
									++var23;
								}
							}

							var24 = Login.field739;

							for (var25 = 0; var25 < var24.length; ++var25) {
								var49 = var24[var25];
								if (var2.getGroupId(var49) != -1 && var2.tryLoadFileByNames(var49, "")) {
									++var23;
								}
							}

							var5 = BoundaryObject.archive8;
							var6 = Login.field737.length + Login.field706.length;
							String[] var40 = Login.field739;

							for (int var42 = 0; var42 < var40.length; ++var42) {
								String var44 = var40[var42];
								if (var5.getGroupId(var44) != -1) {
									++var6;
								}
							}

							if (var23 < var6) {
								BuddyRankComparator.method3651(90, "Loading title screen - " + var23 * 100 / var6 + "%");
							} else {
								BuddyRankComparator.method3651(100, "Loaded title screen");
								if (MenuAction.field687) {
									class135.updateGameState(5);
									RestClientThreadFactory.method205(class69.field956);
								} else {
									RestClientThreadFactory.method205(class69.field942);
								}

							}
						} else if (class69.field956 == Client.field443) {
							class135.updateGameState(10);
						} else if (class69.field942 == Client.field443) {
							class322.field3540 = Actor.newArchive(class408.field4980.field4982, false, true, true, false);
							RestClientThreadFactory.field67 = Actor.newArchive(class408.field4978.field4982, false, true, true, true);
							WorldMapDecoration.field3459 = Actor.newArchive(class408.field4958.field4982, false, true, true, false);
							class206.archive2 = Actor.newArchive(class408.field4959.field4982, true, false, true, false);
							class416.archive4 = Actor.newArchive(class408.field4960.field4982, false, true, true, false);
							ItemContainer.archive9 = Actor.newArchive(class408.field4962.field4982, true, true, true, false);
							class113.field1508 = Actor.newArchive(class408.field4964.field4982, false, true, true, false);
							PendingSpawn.field1023 = Actor.newArchive(class408.field4956.field4982, false, true, true, false);
							GrandExchangeOffer.archive6 = Actor.newArchive(class408.field4961.field4982, false, true, true, false);
							class142.archive12 = Actor.newArchive(class408.field4969.field4982, false, true, true, false);
							FriendSystem.field621 = Actor.newArchive(class408.field4974.field4982, false, true, true, false);
							class156.field1814 = Actor.newArchive(class408.field4965.field4982, false, true, true, false);
							WorldMapArea.field3339 = Actor.newArchive(class408.field4976.field4982, false, true, true, false);
							WorldMapSprite.field3462 = Actor.newArchive(class408.field4966.field4982, false, true, true, false);
							ViewportMouse.soundEffectsArchive = LoginState.method795(class408.field4979.field4982, false, true, true, true, true);
							BuddyRankComparator.method3651(20, "Connecting to update server");
							RestClientThreadFactory.method205(class69.field944);
						} else if (Client.field443 == class69.field944) {
							var43 = 0;
							var0 = var43 + class322.field3540.percentage() * 4 / 100;
							var0 += RestClientThreadFactory.field67.percentage() / 100;
							var0 += WorldMapDecoration.field3459.percentage() * 2 / 100;
							var0 += class206.archive2.percentage() / 100;
							var0 += class416.archive4.percentage() / 100;
							var0 += ItemContainer.archive9.percentage() * 10 / 100;
							var0 += class113.field1508.percentage() * 65 / 100;
							var0 += PendingSpawn.field1023.percentage() / 100;
							var0 += GrandExchangeOffer.archive6.percentage() / 100;
							var0 += class142.archive12.percentage() * 6 / 100;
							var0 += class156.field1814.percentage() / 100;
							var0 += FriendSystem.field621.percentage() * 2 / 100;
							var0 += WorldMapArea.field3339.percentage() * 2 / 100;
							var0 += WorldMapSprite.field3462.percentage() / 100;
							var0 += ViewportMouse.soundEffectsArchive.percentage() * 2 / 100;
							if (var0 != 100) {
								if (var0 != 0) {
									BuddyRankComparator.method3651(30, "Checking for updates - " + var0 + "%");
								}

							} else {
								Projectile.method2012(class322.field3540, "Animations");
								Projectile.method2012(RestClientThreadFactory.field67, "Animation Keyframes");
								Projectile.method2012(WorldMapDecoration.field3459, "Skeletons");
								Projectile.method2012(ItemContainer.archive9, "Maps");
								Projectile.method2012(class113.field1508, "Models");
								Projectile.method2012(GrandExchangeOffer.archive6, "Music Jingles");
								Projectile.method2012(class156.field1814, "World Map");
								Projectile.method2012(FriendSystem.field621, "World Map Geography");
								Projectile.method2012(WorldMapArea.field3339, "World Map Ground");
								BuddyRankComparator.method3651(30, "Loaded update list");
								RestClientThreadFactory.method205(class69.field947);
							}
						} else if (Client.field443 == class69.field947) {
							class547.topLevelWorldView = Client.worldViewManager.createWorldView(104, 104, class154.clientPreferences.getDrawDistance());
							class32.worldView = class547.topLevelWorldView;
							class135.sceneMinimapSprite = new SpritePixels(512, 512);
							BuddyRankComparator.method3651(30, "Starting game engine...");
							RestClientThreadFactory.method205(class69.field945);
						} else if (Client.field443 == class69.field945) {
							if (!class206.archive2.isFullyLoaded()) {
								BuddyRankComparator.method3651(40, "Loading config - " + class206.archive2.loadPercent() + "%");
							} else if (!WorldMapSprite.field3462.isFullyLoaded()) {
								BuddyRankComparator.method3651(40, "Loading config - " + (80 + class142.archive12.loadPercent() / 6) + "%");
							} else {
								Archive var47 = class206.archive2;
								FloorOverlayDefinition.FloorOverlayDefinition_archive = var47;
								var36 = class206.archive2;
								FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var36;
								GraphicsObject.method1911(class206.archive2, class113.field1508);
								var2 = class206.archive2;
								Archive var3 = class113.field1508;
								boolean var34 = Client.isLowDetail;
								class266.ObjectDefinition_archive = var2;
								ChatChannel.ObjectDefinition_modelsArchive = var3;
								ObjectComposition.ObjectDefinition_isLowDetail = var34;
								class88.method2983(class206.archive2, class113.field1508);
								var5 = class206.archive2;
								StructComposition.StructDefinition_archive = var5;
								Archive var26 = class206.archive2;
								Archive var7 = class113.field1508;
								boolean var8 = Client.isMembersWorld;
								Font var9 = class85.fontPlain11;
								ItemComposition.ItemDefinition_archive = var26;
								SpriteBufferProperties.ItemDefinition_modelArchive = var7;
								class281.ItemDefinition_inMembersWorld = var8;
								ItemLayer.ItemDefinition_fileCount = ItemComposition.ItemDefinition_archive.getGroupFileCount(10);
								ItemComposition.ItemDefinition_fontPlain11 = var9;
								Archive var10 = class206.archive2;
								Archive var11 = class322.field3540;
								Archive var12 = RestClientThreadFactory.field67;
								Archive var13 = WorldMapDecoration.field3459;
								ChatChannel.SequenceDefinition_archive = var10;
								class139.SequenceDefinition_animationsArchive = var11;
								class255.SequenceDefinition_skeletonsArchive = var12;
								class458.SpotAnimationDefinition_archive = var13;
								Archive var14 = class206.archive2;
								Archive var15 = class113.field1508;
								SpotAnimationDefinition.field2186 = var14;
								class149.SpotAnimationDefinition_modelArchive = var15;
								FloorUnderlayDefinition.method4511(class206.archive2);
								Archive var16 = class206.archive2;
								VarpDefinition.VarpDefinition_archive = var16;
								VarpDefinition.field1973 = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16);
								class333.method7075(VarpDefinition.field1973);
								class35.widgetDefinition = new WidgetDefinition(class416.archive4, class113.field1508, BoundaryObject.archive8, Canvas.archive13, ViewportMouse.soundEffectsArchive);
								class335.method7091(class206.archive2);
								class391.method8226(class206.archive2);
								Archive var17 = class206.archive2;
								VarcInt.VarcInt_archive = var17;
								Archive var18 = class206.archive2;
								SpriteMask.method7407(class206.archive2);
								Archive var19 = class206.archive2;
								Archive var20 = BoundaryObject.archive8;
								ScriptFrame.field240 = var19;
								class267.field3180 = var20;
								class156.method3950(class206.archive2);
								class465.method9616(class206.archive2);
								class416.field5060 = new class566(NpcOverrides.field2082, 54, class179.clientLanguage, class206.archive2);
								FriendSystem.field624 = new class566(NpcOverrides.field2082, 47, class179.clientLanguage, class206.archive2);
								ModeWhere.varcs = new Varcs();
								class507.method10288(class206.archive2, BoundaryObject.archive8, Canvas.archive13);
								class134.method3734(class206.archive2, BoundaryObject.archive8);
								ClientPacket.method7037(class206.archive2, BoundaryObject.archive8);
								BuddyRankComparator.method3651(50, "Loaded config");
								RestClientThreadFactory.method205(class69.field954);
							}
						} else if (Client.field443 == class69.field954) {
							var0 = 0;
							if (ItemComposition.compass == null) {
								ItemComposition.compass = class455.SpriteBuffer_getSprite(BoundaryObject.archive8, class155.field1804.field5598, 0);
							} else {
								++var0;
							}

							if (class445.redHintArrowSprite == null) {
								class445.redHintArrowSprite = class455.SpriteBuffer_getSprite(BoundaryObject.archive8, class155.field1804.field5604, 0);
							} else {
								++var0;
							}

							IndexedSprite[] var1;
							if (PendingSpawn.mapSceneSprites == null) {
								var2 = BoundaryObject.archive8;
								var23 = class155.field1804.field5600;
								if (!Friend.method10009(var2, var23, 0)) {
									var1 = null;
								} else {
									var1 = class313.method6975();
								}

								PendingSpawn.mapSceneSprites = var1;
							} else {
								++var0;
							}

							if (PcmPlayer.headIconPkSprites == null) {
								PcmPlayer.headIconPkSprites = HttpJsonRequestBody.method10636(BoundaryObject.archive8, class155.field1804.field5601, 0);
							} else {
								++var0;
							}

							if (Varcs.headIconPrayerSprites == null) {
								Varcs.headIconPrayerSprites = HttpJsonRequestBody.method10636(BoundaryObject.archive8, class155.field1804.field5602, 0);
							} else {
								++var0;
							}

							if (ArchiveDisk.headIconHintSprites == null) {
								ArchiveDisk.headIconHintSprites = HttpJsonRequestBody.method10636(BoundaryObject.archive8, class155.field1804.field5603, 0);
							} else {
								++var0;
							}

							if (AsyncHttpResponse.mapDotSprites == null) {
								AsyncHttpResponse.mapDotSprites = HttpJsonRequestBody.method10636(BoundaryObject.archive8, class155.field1804.field5593, 0);
							} else {
								++var0;
							}

							if (class198.crossSprites == null) {
								class198.crossSprites = HttpJsonRequestBody.method10636(BoundaryObject.archive8, class155.field1804.field5605, 0);
							} else {
								++var0;
							}

							if (class199.field2176 == null) {
								class199.field2176 = HttpJsonRequestBody.method10636(BoundaryObject.archive8, class155.field1804.field5606, 0);
							} else {
								++var0;
							}

							if (ProjectionCoord.scrollBarSprites == null) {
								var2 = BoundaryObject.archive8;
								var23 = class155.field1804.field5608;
								if (!Friend.method10009(var2, var23, 0)) {
									var1 = null;
								} else {
									var1 = class313.method6975();
								}

								ProjectionCoord.scrollBarSprites = var1;
							} else {
								++var0;
							}

							if (ViewportMouse.field2951 == null) {
								var2 = BoundaryObject.archive8;
								var23 = class155.field1804.field5597;
								if (!Friend.method10009(var2, var23, 0)) {
									var1 = null;
								} else {
									var1 = class313.method6975();
								}

								ViewportMouse.field2951 = var1;
							} else {
								++var0;
							}

							ModelData var33;
							if (WorldMapSection1.field3493 == null && class155.field1804.field5599 != -1) {
								var33 = ModelData.ModelData_get(class113.field1508, class155.field1804.field5599, 0);
								if (var33 != null) {
									WorldMapSection1.field3493 = var33.method4934();
								}
							} else {
								++var0;
							}

							if (UserComparator3.field1576 == null && class155.field1804.field5610 != -1) {
								var33 = ModelData.ModelData_get(class113.field1508, class155.field1804.field5610, 0);
								if (var33 != null) {
									UserComparator3.field1576 = var33.method4934();
								}
							} else {
								++var0;
							}

							if (var0 < 13) {
								BuddyRankComparator.method3651(70, "Loading sprites - " + var0 * 100 / 14 + "%");
							} else {
								AbstractFont.AbstractFont_modIconSprites = ViewportMouse.field2951;
								class445.redHintArrowSprite.normalize();
								var22 = (int)(Math.random() * 21.0D) - 10;
								int var27 = (int)(Math.random() * 21.0D) - 10;
								var23 = (int)(Math.random() * 21.0D) - 10;
								int var4 = (int)(Math.random() * 41.0D) - 20;
								PendingSpawn.mapSceneSprites[0].shiftColors(var22 + var4, var4 + var27, var23 + var4);
								BuddyRankComparator.method3651(60, "Loaded sprites");
								RestClientThreadFactory.method205(class69.field949);
							}
						} else if (class69.field949 == Client.field443) {
							if (!PendingSpawn.field1023.isFullyLoaded()) {
								BuddyRankComparator.method3651(70, "Loading textures - " + "0%");
							} else {
								class256.textureProvider = new TextureProvider(PendingSpawn.field1023, BoundaryObject.archive8, 20, class154.clientPreferences.getBrightness(), 128);
								Rasterizer3D.setTextureLoader(class256.textureProvider);
								Rasterizer3D.buildPalette(class154.clientPreferences.getBrightness());
								RestClientThreadFactory.method205(class69.field948);
							}
						} else if (Client.field443 == class69.field948) {
							var0 = class256.textureProvider.getLoadedPercentage();
							if (var0 < 100) {
								BuddyRankComparator.method3651(80, "Loading textures - " + var0 + "%");
							} else {
								BuddyRankComparator.method3651(90, "Loaded textures");
								RestClientThreadFactory.method205(class69.field952);
							}
						} else if (Client.field443 == class69.field952) {
							MidiRequest.mouseRecorder = new MouseRecorder();
							GameEngine.taskHandler.newThreadTask(MidiRequest.mouseRecorder, 10);
							BuddyRankComparator.method3651(92, "Loaded input handler");
							RestClientThreadFactory.method205(class69.field941);
						} else if (class69.field941 == Client.field443) {
							if (!Projection.archive10.tryLoadFileByNames("huffman", "")) {
								BuddyRankComparator.method3651(94, "Loading wordpack - " + 0 + "%");
							} else {
								Huffman var46 = new Huffman(Projection.archive10.takeFileByNames("huffman", ""));
								class373.huffman = var46;
								BuddyRankComparator.method3651(94, "Loaded wordpack");
								RestClientThreadFactory.method205(class69.field946);
							}
						} else if (class69.field946 == Client.field443) {
							if (!class416.archive4.isFullyLoaded()) {
								BuddyRankComparator.method3651(96, "Loading interfaces - " + class416.archive4.loadPercent() * 4 / 5 + "%");
							} else if (!ViewportMouse.soundEffectsArchive.isFullyLoaded()) {
								BuddyRankComparator.method3651(96, "Loading interfaces - " + ViewportMouse.soundEffectsArchive.loadPercent() * 4 / 5 + "%");
							} else if (!class142.archive12.isFullyLoaded()) {
								BuddyRankComparator.method3651(96, "Loading interfaces - " + (80 + class142.archive12.loadPercent() / 6) + "%");
							} else if (!Canvas.archive13.isFullyLoaded()) {
								BuddyRankComparator.method3651(96, "Loading interfaces - " + (96 + Canvas.archive13.loadPercent() / 50) + "%");
							} else {
								BuddyRankComparator.method3651(98, "Loaded interfaces");
								if (class142.archive12.isValidFileName("version.dat", "")) {
									Buffer var21 = new Buffer(class142.archive12.takeFileByNames("version.dat", ""));
									var21.readUnsignedShort();
								}

								RestClientThreadFactory.method205(class69.field955);
							}
						} else if (Client.field443 == class69.field955) {
							if (class156.field1814.getGroupCount() > 0 && !class156.field1814.tryLoadGroupByName(WorldMapCacheName.field3505.name)) {
								BuddyRankComparator.method3651(100, "Loading world map - " + class156.field1814.groupLoadPercentByName(WorldMapCacheName.field3505.name) / 10 + "%");
							} else {
								if (worldMap == null) {
									worldMap = new WorldMap();
									worldMap.init(class156.field1814, FriendSystem.field621, WorldMapArea.field3339, class70.fontBold12, Client.fontsMap, PendingSpawn.mapSceneSprites);
								}

								BuddyRankComparator.method3651(100, "Loaded world map");
								if (MenuAction.field687) {
									RestClientThreadFactory.method205(class69.field957);
								} else {
									RestClientThreadFactory.method205(class69.field956);
								}

							}
						} else {
							if (class69.field957 == Client.field443) {
								class30.field135 = false;
								class135.updateGameState(20);
								class254.updateLoginState(LoginState.READ_ACCOUNT_INFO_PACKET_SIZE);
							}

						}
					}
				}
			}
		}
	}
}
