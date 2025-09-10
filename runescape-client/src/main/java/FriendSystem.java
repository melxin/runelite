import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("br")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ltq;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 906619781
	)
	int field648;

	@ObfuscatedSignature(
		descriptor = "(Lva;)V"
	)
	FriendSystem(LoginType var1) {
		this.field648 = 0;
		this.loginType = var1;
		this.friendsList = new FriendsList(var1);
		this.ignoreList = new IgnoreList(var1);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1992390271"
	)
	boolean method1535() {
		return this.field648 == 2;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "3515"
	)
	final void method1536() {
		this.field648 = 1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lwb;II)V",
		garbageValue = "572106873"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2);
		this.field648 = 2;
		PacketBufferNode.method7052();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-638155798"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) {
			if ((long)var1.field5389 < class189.method4284() / 1000L - 5L) {
				if (var1.world > 0) {
					Varcs.addGameMessage(5, "", var1.username + " has logged in.");
				}

				if (var1.world == 0) {
					Varcs.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove();
			}
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1334844356"
	)
	final void method1539() {
		this.field648 = 0;
		this.friendsList.clear();
		this.ignoreList.clear();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lxa;ZS)Z",
		garbageValue = "5193"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) {
			return false;
		} else if (var1.equals(HealthBarUpdate.localPlayer.username)) {
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2);
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lxa;I)Z",
		garbageValue = "1591772425"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) {
			return false;
		} else {
			return this.ignoreList.contains(var1);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1927072818"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsListIsFull()) {
					VarbitComposition.method4512("Your friend list is full. Max of 200 for free users, and 400 for members");
				} else if (HealthBarUpdate.localPlayer.username.equals(var2)) {
					VarbitComposition.method4512("You can't add yourself to your own friend list");
				} else if (this.isFriended(var2, false)) {
					class431.method8647(var1);
				} else if (this.isIgnored(var2)) {
					VarbitComposition.method4512("Please remove " + var1 + " from your ignore list first");
				} else {
					SoundCache.method3117(var1);
				}
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1228820208"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field344 != 1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-27"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.canAddIgnore()) {
					VarbitComposition.method4512("Your ignore list is full. Max of 100 for free users, and 400 for members");
				} else if (HealthBarUpdate.localPlayer.username.equals(var2)) {
					VarbitComposition.method4512("You can't add yourself to your own ignore list");
				} else if (this.isIgnored(var2)) {
					Script.method2006(var1);
				} else if (this.isFriended(var2, false)) {
					VarbitComposition.method4512("Please remove " + var1 + " from your friend list first");
				} else {
					class161.method3908(var1);
				}
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2039564455"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field344 != 1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-24871720"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsList.removeByUsername(var2)) {
					Client.field555 = Client.cycleCntr;
					PacketBufferNode var3 = UserComparator6.getPacketBufferNode(ClientPacket.FRIEND_DELUSER, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(WorldMapSection2.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}

				PacketBufferNode.method7052();
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "-1379584929"
	)
	@Export("removeIgnore")
	public final void removeIgnore(String var1, boolean var2) {
		if (var1 != null) {
			Username var3 = new Username(var1, this.loginType);
			if (var3.hasCleanName()) {
				if (this.ignoreList.removeByUsername(var3)) {
					Client.field555 = Client.cycleCntr;
					if (var2) {
						PacketBufferNode var4 = UserComparator6.getPacketBufferNode(ClientPacket.IGNORE_DELUSER, Client.packetWriter.isaacCipher);
						var4.packetBuffer.writeByte(WorldMapSection2.stringCp1252NullTerminatedByteSize(var1));
						var4.packetBuffer.writeStringCp1252NullTerminated(var1);
						Client.packetWriter.addNode(var4);
					}
				}

				HttpRequestTask.FriendSystem_invalidateIgnoreds();
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxa;I)Z",
		garbageValue = "-1292272667"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1);
		return var2 != null && var2.hasWorld();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Z",
		garbageValue = "556520645"
	)
	@Export("isNumber")
	public static boolean isNumber(CharSequence var0) {
		boolean var2 = false;
		boolean var3 = false;
		int var4 = 0;
		int var5 = var0.length();
		int var6 = 0;

		boolean var1;
		while (true) {
			if (var6 >= var5) {
				var1 = var3;
				break;
			}

			label85: {
				char var7 = var0.charAt(var6);
				if (var6 == 0) {
					if (var7 == '-') {
						var2 = true;
						break label85;
					}

					if (var7 == '+') {
						break label85;
					}
				}

				int var9;
				if (var7 >= '0' && var7 <= '9') {
					var9 = var7 - '0';
				} else if (var7 >= 'A' && var7 <= 'Z') {
					var9 = var7 - '7';
				} else {
					if (var7 < 'a' || var7 > 'z') {
						var1 = false;
						break;
					}

					var9 = var7 - 'W';
				}

				if (var9 >= 10) {
					var1 = false;
					break;
				}

				if (var2) {
					var9 = -var9;
				}

				int var8 = var9 + var4 * 10;
				if (var4 != var8 / 10) {
					var1 = false;
					break;
				}

				var4 = var8;
				var3 = true;
			}

			++var6;
		}

		return var1;
	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "113"
	)
	static void method1534() {
		if (Client.field401 == class70.field969) {
			class115.field1514 = ObjectComposition.newArchive(class410.field4933.field4954, false, true, true, false);
			WidgetDefinition.field4042 = ObjectComposition.newArchive(class410.field4935.field4954, true, true, true, false);
			Friend.archive8 = ObjectComposition.newArchive(class410.field4937.field4954, false, true, true, false);
			class27.archive10 = ObjectComposition.newArchive(class410.field4928.field4954, false, true, true, false);
			class145.archive13 = ObjectComposition.newArchive(class410.field4953.field4954, true, false, true, false);
			class159.field1830 = ObjectComposition.newArchive(class410.field4943.field4954, false, true, true, false);
			HorizontalAlignment.field2091 = ObjectComposition.newArchive(class410.field4944.field4954, false, true, true, false);
			GrandExchangeOfferNameComparator.field5019 = ObjectComposition.newArchive(class410.field4936.field4954, true, true, true, false);
			class423.method8556(20, "Connecting to update server");
			class68.method2161(class70.field970);
		} else {
			int var0;
			byte var33;
			if (Client.field401 == class70.field970) {
				var33 = 0;
				var0 = var33 + class115.field1514.percentage() * 53 / 100;
				var0 += WidgetDefinition.field4042.percentage() * 5 / 100;
				var0 += Friend.archive8.percentage() * 36 / 100;
				var0 += class27.archive10.percentage() / 100;
				var0 += class145.archive13.percentage() / 100;
				var0 += class159.field1830.percentage() * 2 / 100;
				var0 += HorizontalAlignment.field2091.percentage() / 100;
				var0 += GrandExchangeOfferNameComparator.field5019.method8287() && GrandExchangeOfferNameComparator.field5019.isFullyLoaded() ? 1 : 0;
				if (var0 != 100) {
					if (var0 != 0) {
						class423.method8556(30, "Checking for updates - " + var0 + "%");
					}

				} else {
					ItemContainer.method2100(class115.field1514, "Sound FX");
					ItemContainer.method2100(WidgetDefinition.field4042, "Music Tracks");
					ItemContainer.method2100(Friend.archive8, "Sprites");
					ItemContainer.method2100(class159.field1830, "Music Samples");
					ItemContainer.method2100(HorizontalAlignment.field2091, "Music Patches");
					class332.field3827 = new GraphicsDefaults();
					class332.field3827.decode(GrandExchangeOfferNameComparator.field5019);
					class423.method8556(40, "Loaded update list");
					class68.method2161(class70.field965);
				}
			} else {
				int var5;
				if (Client.field401 == class70.field965) {
					UserComparator9.method3575(22050, !Client.isLowDetail, 2);
					ArrayList var36 = new ArrayList(3);
					TaskHandler var24 = UserComparator4.taskHandler;
					short var29 = 2048;
					if (PcmPlayer.field1356 == 0) {
						throw new IllegalStateException();
					} else {
						if (var29 < 512) {
							var29 = 512;
						}

						PcmPlayer var27;
						try {
							PcmPlayer var28 = class199.pcmPlayerProvider.player();
							var28.samples = new int[(PcmPlayer.PcmPlayer_stereo ? 2 : 1) * 512];
							var28.field1345 = var29;
							var28.init();
							var28.capacity = (var29 & -2048) + 2048;
							if (var28.capacity > 32768) {
								var28.capacity = 32768;
							}

							var28.open(var28.capacity);
							if (ScriptEvent.field904 > 0 && FloorDecoration.soundSystem == null) {
								FloorDecoration.soundSystem = new SoundSystem();
								PcmPlayer.soundSystemExecutor = Executors.newScheduledThreadPool(1);
								PcmPlayer.soundSystemExecutor.scheduleAtFixedRate(FloorDecoration.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS);
							}

							if (FloorDecoration.soundSystem != null) {
								if (FloorDecoration.soundSystem.players[0] != null) {
									throw new IllegalArgumentException();
								}

								FloorDecoration.soundSystem.players[0] = var28;
							}

							var27 = var28;
						} catch (Throwable var23) {
							var27 = new PcmPlayer();
						}

						class70.pcmPlayer1 = var27;
						class28.pcmStreamMixer = new PcmStreamMixer();
						PcmStreamMixer var30 = new PcmStreamMixer();
						var30.addSubStream(class28.pcmStreamMixer);

						for (var5 = 0; var5 < 3; ++var5) {
							MidiPcmStream var32 = new MidiPcmStream(class70.pcmPlayer1);
							var32.method7152(9, 128);
							var30.addSubStream(var32);
							var36.add(var32);
						}

						class70.pcmPlayer1.setStream(var30);
						KitDefinition.method4239(HorizontalAlignment.field2091, class159.field1830, class115.field1514, var36);
						class423.method8556(60, "Prepared sound engine");
						class68.method2161(class70.field978);
					}
				} else if (Client.field401 == class70.field978) {
					if (BufferedSink.field5467 == null) {
						BufferedSink.field5467 = new Fonts(Friend.archive8, class145.archive13);
					}

					var0 = FontName.method10844().length;
					Client.fontsMap = BufferedSink.field5467.createMap(FontName.method10844());
					if (Client.fontsMap.size() < var0) {
						class423.method8556(80, "Loading fonts - " + Client.fontsMap.size() * 100 / var0 + "%");
					} else {
						class342.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11);
						class463.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12);
						class333.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12);
						AbstractWorldMapIcon.platformInfo = Client.field418.get();
						class423.method8556(80, "Loaded fonts");
						class68.method2161(class70.field960);
					}
				} else {
					Archive var2;
					int var3;
					int var16;
					Archive var25;
					if (Client.field401 == class70.field960) {
						var25 = class27.archive10;
						var2 = Friend.archive8;
						var3 = 0;
						String[] var26 = Login.field759;

						String var31;
						for (var5 = 0; var5 < var26.length; ++var5) {
							var31 = var26[var5];
							if (var25.tryLoadFileByNames(var31, "")) {
								++var3;
							}
						}

						var26 = Login.field760;

						for (var5 = 0; var5 < var26.length; ++var5) {
							var31 = var26[var5];
							if (var2.tryLoadFileByNames(var31, "")) {
								++var3;
							}
						}

						var26 = Login.field761;

						for (var5 = 0; var5 < var26.length; ++var5) {
							var31 = var26[var5];
							if (var2.getGroupId(var31) != -1 && var2.tryLoadFileByNames(var31, "")) {
								++var3;
							}
						}

						var16 = IntProjection.method5014(Friend.archive8);
						if (var3 < var16) {
							class423.method8556(90, "Loading title screen - " + var3 * 100 / var16 + "%");
						} else {
							class423.method8556(100, "Loaded title screen");
							if (class509.field5441) {
								UrlRequest.updateGameState(5);
								class68.method2161(class70.field976);
							} else {
								class68.method2161(class70.field962);
							}

						}
					} else if (Client.field401 == class70.field976) {
						UrlRequest.updateGameState(10);
					} else if (class70.field962 == Client.field401) {
						class418.field5030 = ObjectComposition.newArchive(class410.field4929.field4954, false, true, true, false);
						MouseRecorder.field913 = ObjectComposition.newArchive(class410.field4950.field4954, false, true, true, true);
						class273.field3204 = ObjectComposition.newArchive(class410.field4930.field4954, false, true, true, false);
						VarpDefinition.archive2 = ObjectComposition.newArchive(class410.field4931.field4954, true, false, true, false);
						GraphicsObject.archive4 = ObjectComposition.newArchive(class410.field4952.field4954, false, true, true, false);
						LoginPacket.archive9 = ObjectComposition.newArchive(class410.field4942.field4954, true, true, true, false);
						class485.field5345 = ObjectComposition.newArchive(class410.field4934.field4954, false, true, true, false);
						PlayerCompositionColorTextureOverride.field1956 = ObjectComposition.newArchive(class410.field4938.field4954, false, true, true, false);
						class259.archive6 = ObjectComposition.newArchive(class410.field4945.field4954, false, true, true, false);
						class334.archive12 = ObjectComposition.newArchive(class410.field4939.field4954, false, true, true, false);
						class551.field5661 = ObjectComposition.newArchive(class410.field4946.field4954, false, true, true, false);
						WorldMapScaleHandler.field3506 = ObjectComposition.newArchive(class410.field4932.field4954, false, true, true, false);
						ApproximateRouteStrategy.field280 = ObjectComposition.newArchive(class410.field4948.field4954, false, true, true, false);
						WorldMapLabelSize.field3302 = ObjectComposition.newArchive(class410.field4949.field4954, false, true, true, false);
						ReflectionCheck.soundEffectsArchive = class134.method3618(class410.field4941.field4954, false, true, true, true, true);
						class423.method8556(20, "Connecting to update server");
						class68.method2161(class70.field966);
					} else if (class70.field966 == Client.field401) {
						var33 = 0;
						var0 = var33 + class418.field5030.percentage() * 4 / 100;
						var0 += MouseRecorder.field913.percentage() / 100;
						var0 += class273.field3204.percentage() * 2 / 100;
						var0 += VarpDefinition.archive2.percentage() / 100;
						var0 += GraphicsObject.archive4.percentage() / 100;
						var0 += LoginPacket.archive9.percentage() * 10 / 100;
						var0 += class485.field5345.percentage() * 65 / 100;
						var0 += PlayerCompositionColorTextureOverride.field1956.percentage() / 100;
						var0 += class259.archive6.percentage() / 100;
						var0 += class334.archive12.percentage() * 6 / 100;
						var0 += WorldMapScaleHandler.field3506.percentage() / 100;
						var0 += class551.field5661.percentage() * 2 / 100;
						var0 += ApproximateRouteStrategy.field280.percentage() * 2 / 100;
						var0 += WorldMapLabelSize.field3302.percentage() / 100;
						var0 += ReflectionCheck.soundEffectsArchive.percentage() * 2 / 100;
						if (var0 != 100) {
							if (var0 != 0) {
								class423.method8556(30, "Checking for updates - " + var0 + "%");
							}

						} else {
							ItemContainer.method2100(class418.field5030, "Animations");
							ItemContainer.method2100(MouseRecorder.field913, "Animation Keyframes");
							ItemContainer.method2100(class273.field3204, "Skeletons");
							ItemContainer.method2100(LoginPacket.archive9, "Maps");
							ItemContainer.method2100(class485.field5345, "Models");
							ItemContainer.method2100(class259.archive6, "Music Jingles");
							ItemContainer.method2100(WorldMapScaleHandler.field3506, "World Map");
							ItemContainer.method2100(class551.field5661, "World Map Geography");
							ItemContainer.method2100(ApproximateRouteStrategy.field280, "World Map Ground");
							class423.method8556(30, "Loaded update list");
							class68.method2161(class70.field964);
						}
					} else if (class70.field964 == Client.field401) {
						class333.topLevelWorldView = Client.worldViewManager.method2380(104, 104, class36.clientPreferences.getDrawDistance());
						HttpHeaders.worldView = class333.topLevelWorldView;
						SceneTilePaint.sceneMinimapSprite = new SpritePixels(512, 512);
						class423.method8556(30, "Starting game engine...");
						class68.method2161(class70.field968);
					} else if (class70.field968 == Client.field401) {
						if (!VarpDefinition.archive2.isFullyLoaded()) {
							class423.method8556(40, "Loading config - " + VarpDefinition.archive2.loadPercent() + "%");
						} else if (!WorldMapLabelSize.field3302.isFullyLoaded()) {
							class423.method8556(40, "Loading config - " + (80 + class334.archive12.loadPercent() / 6) + "%");
						} else {
							class67.method2156(VarpDefinition.archive2);
							IntProjection.method5022(VarpDefinition.archive2);
							class517.method10310(VarpDefinition.archive2, class485.field5345);
							Archive var35 = VarpDefinition.archive2;
							var25 = class485.field5345;
							boolean var37 = Client.isLowDetail;
							ObjectComposition.ObjectDefinition_archive = var35;
							WorldMapCacheName.ObjectDefinition_modelsArchive = var25;
							ObjectComposition.ObjectDefinition_isLowDetail = var37;
							class139.method3713(VarpDefinition.archive2, class485.field5345);
							MouseHandler.method730(VarpDefinition.archive2);
							class183.method4177(VarpDefinition.archive2, class485.field5345, Client.isMembersWorld, class342.fontPlain11);
							Archive var18 = VarpDefinition.archive2;
							Archive var4 = class418.field5030;
							Archive var38 = MouseRecorder.field913;
							Archive var6 = class273.field3204;
							class133.SequenceDefinition_archive = var18;
							SequenceDefinition.SequenceDefinition_animationsArchive = var4;
							TransformationMatrix.SequenceDefinition_skeletonsArchive = var38;
							class216.SpotAnimationDefinition_archive = var6;
							class135.method3657(VarpDefinition.archive2, class485.field5345);
							UrlRequest.method3528(VarpDefinition.archive2);
							class265.method5993(VarpDefinition.archive2);
							int var7 = class4.field8;
							GrandExchangeOfferUnitPriceComparator.Varps_temp = new int[var7];
							Varps.Varps_main = new int[var7];
							UrlRequester.widgetDefinition = new WidgetDefinition(GraphicsObject.archive4, class485.field5345, Friend.archive8, class145.archive13, ReflectionCheck.soundEffectsArchive);
							class525.method10440(VarpDefinition.archive2);
							class28.method453(VarpDefinition.archive2);
							Archive var8 = VarpDefinition.archive2;
							VarcInt.VarcInt_archive = var8;
							class146.method3777(VarpDefinition.archive2);
							Archive var9 = VarpDefinition.archive2;
							ParamComposition.ParamDefinition_archive = var9;
							Archive var10 = VarpDefinition.archive2;
							RestClientThreadFactory.field65 = var10;
							ObjectComposition.method4632(VarpDefinition.archive2);
							Archive var11 = VarpDefinition.archive2;
							DbRowType.field5839 = var11;
							class161.field1835 = new class568(class429.field5084, 54, ViewportMouse.clientLanguage, VarpDefinition.archive2);
							DynamicObject.field817 = new class568(class429.field5084, 47, ViewportMouse.clientLanguage, VarpDefinition.archive2);
							class516.varcs = new Varcs();
							Archive var12 = VarpDefinition.archive2;
							Archive var13 = Friend.archive8;
							Archive var14 = class145.archive13;
							ApproximateRouteStrategy.HitSplatDefinition_archive = var12;
							HitSplatDefinition.field2287 = var13;
							Varcs.HitSplatDefinition_fontsArchive = var14;
							UserComparator9.method3573(VarpDefinition.archive2, Friend.archive8);
							FriendLoginUpdate.method9922(VarpDefinition.archive2, Friend.archive8);
							class423.method8556(50, "Loaded config");
							class68.method2161(class70.field961);
						}
					} else if (class70.field961 == Client.field401) {
						var0 = 0;
						if (class168.compass == null) {
							class168.compass = SoundCache.SpriteBuffer_getSprite(Friend.archive8, class332.field3827.field5529, 0);
						} else {
							++var0;
						}

						if (class181.redHintArrowSprite == null) {
							class181.redHintArrowSprite = SoundCache.SpriteBuffer_getSprite(Friend.archive8, class332.field3827.field5539, 0);
						} else {
							++var0;
						}

						IndexedSprite[] var1;
						IndexedSprite[] var19;
						int var20;
						IndexedSprite var21;
						if (GameEngine.mapSceneSprites == null) {
							var2 = Friend.archive8;
							var3 = class332.field3827.field5524;
							if (!class587.method11132(var2, var3, 0)) {
								var1 = null;
							} else {
								var19 = new IndexedSprite[class606.SpriteBuffer_spriteCount];

								for (var20 = 0; var20 < class606.SpriteBuffer_spriteCount; ++var20) {
									var21 = var19[var20] = new IndexedSprite();
									var21.width = class606.SpriteBuffer_spriteWidth;
									var21.height = class581.SpriteBuffer_spriteHeight;
									var21.xOffset = LoginPacket.SpriteBuffer_xOffsets[var20];
									var21.yOffset = class191.SpriteBuffer_yOffsets[var20];
									var21.subWidth = class255.SpriteBuffer_spriteWidths[var20];
									var21.subHeight = FriendLoginUpdate.SpriteBuffer_spriteHeights[var20];
									var21.palette = TriBool.SpriteBuffer_spritePalette;
									var21.pixels = SpriteBufferProperties.SpriteBuffer_pixels[var20];
								}

								class388.method8205();
								var1 = var19;
							}

							GameEngine.mapSceneSprites = var1;
						} else {
							++var0;
						}

						if (ItemComposition.headIconPkSprites == null) {
							ItemComposition.headIconPkSprites = class463.method9400(Friend.archive8, class332.field3827.field5532, 0);
						} else {
							++var0;
						}

						if (LoginScreenAnimation.headIconPrayerSprites == null) {
							LoginScreenAnimation.headIconPrayerSprites = class463.method9400(Friend.archive8, class332.field3827.field5528, 0);
						} else {
							++var0;
						}

						if (class400.headIconHintSprites == null) {
							class400.headIconHintSprites = class463.method9400(Friend.archive8, class332.field3827.field5534, 0);
						} else {
							++var0;
						}

						if (ParamComposition.mapDotSprites == null) {
							ParamComposition.mapDotSprites = class463.method9400(Friend.archive8, class332.field3827.field5533, 0);
						} else {
							++var0;
						}

						if (NPCComposition.crossSprites == null) {
							NPCComposition.crossSprites = class463.method9400(Friend.archive8, class332.field3827.field5536, 0);
						} else {
							++var0;
						}

						if (class200.field2185 == null) {
							class200.field2185 = class463.method9400(Friend.archive8, class332.field3827.field5537, 0);
						} else {
							++var0;
						}

						if (class255.scrollBarSprites == null) {
							var2 = Friend.archive8;
							var3 = class332.field3827.field5538;
							if (!class587.method11132(var2, var3, 0)) {
								var1 = null;
							} else {
								var19 = new IndexedSprite[class606.SpriteBuffer_spriteCount];

								for (var20 = 0; var20 < class606.SpriteBuffer_spriteCount; ++var20) {
									var21 = var19[var20] = new IndexedSprite();
									var21.width = class606.SpriteBuffer_spriteWidth;
									var21.height = class581.SpriteBuffer_spriteHeight;
									var21.xOffset = LoginPacket.SpriteBuffer_xOffsets[var20];
									var21.yOffset = class191.SpriteBuffer_yOffsets[var20];
									var21.subWidth = class255.SpriteBuffer_spriteWidths[var20];
									var21.subHeight = FriendLoginUpdate.SpriteBuffer_spriteHeights[var20];
									var21.palette = TriBool.SpriteBuffer_spritePalette;
									var21.pixels = SpriteBufferProperties.SpriteBuffer_pixels[var20];
								}

								class388.method8205();
								var1 = var19;
							}

							class255.scrollBarSprites = var1;
						} else {
							++var0;
						}

						if (Language.field5104 == null) {
							var2 = Friend.archive8;
							var3 = class332.field3827.field5530;
							if (!class587.method11132(var2, var3, 0)) {
								var1 = null;
							} else {
								var19 = new IndexedSprite[class606.SpriteBuffer_spriteCount];

								for (var20 = 0; var20 < class606.SpriteBuffer_spriteCount; ++var20) {
									var21 = var19[var20] = new IndexedSprite();
									var21.width = class606.SpriteBuffer_spriteWidth;
									var21.height = class581.SpriteBuffer_spriteHeight;
									var21.xOffset = LoginPacket.SpriteBuffer_xOffsets[var20];
									var21.yOffset = class191.SpriteBuffer_yOffsets[var20];
									var21.subWidth = class255.SpriteBuffer_spriteWidths[var20];
									var21.subHeight = FriendLoginUpdate.SpriteBuffer_spriteHeights[var20];
									var21.palette = TriBool.SpriteBuffer_spritePalette;
									var21.pixels = SpriteBufferProperties.SpriteBuffer_pixels[var20];
								}

								class388.method8205();
								var1 = var19;
							}

							Language.field5104 = var1;
						} else {
							++var0;
						}

						if (var0 < 11) {
							class423.method8556(70, "Loading sprites - " + var0 * 100 / 12 + "%");
						} else {
							AbstractFont.AbstractFont_modIconSprites = Language.field5104;
							class181.redHintArrowSprite.normalize();
							int var22 = (int)(Math.random() * 21.0D) - 10;
							int var17 = (int)(Math.random() * 21.0D) - 10;
							var3 = (int)(Math.random() * 21.0D) - 10;
							var16 = (int)(Math.random() * 41.0D) - 20;
							GameEngine.mapSceneSprites[0].shiftColors(var16 + var22, var16 + var17, var3 + var16);
							class423.method8556(60, "Loaded sprites");
							class68.method2161(class70.field967);
						}
					} else if (class70.field967 == Client.field401) {
						if (!PlayerCompositionColorTextureOverride.field1956.isFullyLoaded()) {
							class423.method8556(70, "Loading textures - " + "0%");
						} else {
							class518.textureProvider = new TextureProvider(PlayerCompositionColorTextureOverride.field1956, Friend.archive8, 20, class36.clientPreferences.getBrightness(), 128);
							Rasterizer3D.setTextureLoader(class518.textureProvider);
							Rasterizer3D.buildPalette(class36.clientPreferences.getBrightness());
							class68.method2161(class70.field971);
						}
					} else if (Client.field401 == class70.field971) {
						var0 = class518.textureProvider.getLoadedPercentage();
						if (var0 < 100) {
							class423.method8556(80, "Loading textures - " + var0 + "%");
						} else {
							class423.method8556(90, "Loaded textures");
							class68.method2161(class70.field972);
						}
					} else if (class70.field972 == Client.field401) {
						class398.mouseRecorder = new MouseRecorder();
						UserComparator4.taskHandler.newThreadTask(class398.mouseRecorder, 10);
						class423.method8556(92, "Loaded input handler");
						class68.method2161(class70.field973);
					} else if (class70.field973 == Client.field401) {
						if (!class27.archive10.tryLoadFileByNames("huffman", "")) {
							class423.method8556(94, "Loading wordpack - " + 0 + "%");
						} else {
							Huffman var34 = new Huffman(class27.archive10.takeFileByNames("huffman", ""));
							class376.huffman = var34;
							class423.method8556(94, "Loaded wordpack");
							class68.method2161(class70.field974);
						}
					} else if (class70.field974 == Client.field401) {
						if (!GraphicsObject.archive4.isFullyLoaded()) {
							class423.method8556(96, "Loading interfaces - " + GraphicsObject.archive4.loadPercent() * 4 / 5 + "%");
						} else if (!ReflectionCheck.soundEffectsArchive.isFullyLoaded()) {
							class423.method8556(96, "Loading interfaces - " + ReflectionCheck.soundEffectsArchive.loadPercent() * 4 / 5 + "%");
						} else if (!class334.archive12.isFullyLoaded()) {
							class423.method8556(96, "Loading interfaces - " + (80 + class334.archive12.loadPercent() / 6) + "%");
						} else if (!class145.archive13.isFullyLoaded()) {
							class423.method8556(96, "Loading interfaces - " + (96 + class145.archive13.loadPercent() / 50) + "%");
						} else {
							class423.method8556(98, "Loaded interfaces");
							if (class334.archive12.isValidFileName("version.dat", "")) {
								Buffer var15 = new Buffer(class334.archive12.takeFileByNames("version.dat", ""));
								var15.readUnsignedShort();
							}

							class68.method2161(class70.field975);
						}
					} else if (Client.field401 == class70.field975) {
						if (WorldMapScaleHandler.field3506.getGroupCount() > 0 && !WorldMapScaleHandler.field3506.tryLoadGroupByName(WorldMapCacheName.field3498.name)) {
							class423.method8556(100, "Loading world map - " + WorldMapScaleHandler.field3506.groupLoadPercentByName(WorldMapCacheName.field3498.name) / 10 + "%");
						} else {
							if (DynamicObject.worldMap == null) {
								DynamicObject.worldMap = new WorldMap();
								DynamicObject.worldMap.init(WorldMapScaleHandler.field3506, class551.field5661, ApproximateRouteStrategy.field280, class333.fontBold12, Client.fontsMap, GameEngine.mapSceneSprites);
							}

							class423.method8556(100, "Loaded world map");
							if (class509.field5441) {
								class68.method2161(class70.field977);
							} else {
								class68.method2161(class70.field976);
							}

						}
					} else {
						if (Client.field401 == class70.field977) {
							Script.field793 = false;
							UrlRequest.updateGameState(20);
							DefaultsGroup.updateLoginState(LoginState.READ_ACCOUNT_INFO_PACKET_SIZE);
						}

					}
				}
			}
		}
	}

	@ObfuscatedName("mc")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "826664543"
	)
	static boolean method1591(int var0, int var1) {
		if (var1 >= 2000) {
			var1 -= 2000;
		}

		class516 var2 = Client.worldViewManager.method2378(var0);
		WorldEntity var3 = (WorldEntity)Client.worldViewManager.method2343().worldEntities.get((long)var0);
		boolean var4 = var0 == -1;
		boolean var5 = var0 == Client.field346;
		boolean var6 = false;
		boolean var9;
		if (var3 != null) {
			var6 = var3.method10072() != class394.field4796;
			if (!var5) {
				class380 var7 = var3.field5425.method4457();
				if (class154.method3838(var1) && !var7.field4372) {
					return false;
				}

				var9 = var1 == 1 || var1 == 2 || var1 >= 3 && var1 <= 6 || var1 == 1001;
				boolean var10 = var9 || RestClientThreadFactory.method218(var1);
				boolean var11;
				if (!var10) {
					var11 = var1 == 16 || var1 == 17 || var1 >= 18 && var1 <= 22;
					var10 = var11;
				}

				var11 = var10;
				if (!var10) {
					boolean var12 = var1 >= 61 && var1 <= 67;
					var11 = var12;
				}

				if (var11 && !var7.field4377) {
					return false;
				}
			}
		}

		boolean var13 = var1 == 1 || var1 == 2 || var1 >= 3 && var1 <= 6 || var1 == 1001;
		if (var13 && !var2.method10278(var6, var4, var5)) {
			return false;
		} else {
			boolean var8 = var1 == 16 || var1 == 17 || var1 >= 18 && var1 <= 22;
			if (var8 && !var2.method10279(var6, var4, var5)) {
				return false;
			} else if (RestClientThreadFactory.method218(var1) && !var2.method10280(var6, var4, var5)) {
				return false;
			} else {
				var9 = var1 == 14 || var1 == 15 || var1 >= 44 && var1 <= 51;
				if (var9 && !var2.method10281(var6, var4, var5)) {
					return false;
				} else if (var1 == 1002 && !var2.method10285(var6, var4, var5)) {
					return false;
				} else if (var1 == 1004 && !var2.method10282(var6, var4, var5)) {
					return false;
				} else {
					return var1 != 1003 || var2.method10283(var6, var4, var5);
				}
			}
		}
	}
}
