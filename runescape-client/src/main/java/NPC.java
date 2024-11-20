import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ec")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -112713795
	)
	static int field1356;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1010195617
	)
	static int field1349;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	@Export("definition")
	NPCComposition definition;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 589043955
	)
	int field1351;
	@ObfuscatedName("at")
	String field1353;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1212501177
	)
	int field1350;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	class557 field1354;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lhn;"
	)
	@Export("modelOverrides")
	NpcOverrides modelOverrides;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lhn;"
	)
	@Export("chatheadOverrides")
	NpcOverrides chatheadOverrides;

	static {
		field1356 = 1;
		field1349 = 1;
	}

	NPC() {
		this.field1353 = "";
		this.field1350 = 31;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-5"
	)
	@Export("getPlane")
	public int getPlane() {
		return this.field1351;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Ljt;",
		garbageValue = "-1562991930"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? HealthBarDefinition.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = super.movementSequence == -1 || super.idleSequence == super.movementSequence && var1 != null ? null : HealthBarDefinition.SequenceDefinition_get(super.movementSequence);
			Model var3 = null;
			if (this.modelOverrides != null && this.modelOverrides.useLocalPlayer) {
				var3 = AsyncHttpResponse.localPlayer.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			} else {
				var3 = this.definition.getModel(var1, super.sequenceFrame, var2, super.movementFrame, this.modelOverrides);
			}

			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				int var4 = var3.indicesCount;
				var3 = this.method2649(var3);
				if (this.definition.size == 1) {
					var3.isSingleTile = true;
				}

				if (super.field1233 != 0 && Client.cycle >= super.field1256 && Client.cycle < super.field1264) {
					var3.overrideHue = super.field1224;
					var3.overrideSaturation = super.field1235;
					var3.overrideLuminance = super.field1240;
					var3.overrideAmount = super.field1233;
					var3.field2889 = (short)var4;
				} else {
					var3.overrideAmount = 0;
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)V",
		garbageValue = "-26316"
	)
	void method2910(String var1) {
		this.field1353 = var1 == null ? "" : var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "616401275"
	)
	void method2891(int var1) {
		this.field1350 = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "56694662"
	)
	boolean method2892(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1350 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "58"
	)
	final String method2893() {
		if (!this.field1353.isEmpty()) {
			return this.field1353;
		} else {
			NPCComposition var1 = this.definition;
			if (var1.transforms != null) {
				var1 = var1.transform();
				if (var1 == null) {
					var1 = this.definition;
				}
			}

			return var1.name;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILkq;I)V",
		garbageValue = "448368548"
	)
	final void method2921(int var1, MoveSpeed var2) {
		int var3 = super.pathX[0];
		int var4 = super.pathY[0];
		if (var1 == 0) {
			--var3;
			++var4;
		}

		if (var1 == 1) {
			++var4;
		}

		if (var1 == 2) {
			++var3;
			++var4;
		}

		if (var1 == 3) {
			--var3;
		}

		if (var1 == 4) {
			++var3;
		}

		if (var1 == 5) {
			--var3;
			--var4;
		}

		if (var1 == 6) {
			--var4;
		}

		if (var1 == 7) {
			++var3;
			--var4;
		}

		if (super.sequence != -1 && HealthBarDefinition.SequenceDefinition_get(super.sequence).field2312 == 1) {
			super.sequence = -1;
		}

		if (super.pathLength < 9) {
			++super.pathLength;
		}

		for (int var5 = super.pathLength; var5 > 0; --var5) {
			super.pathX[var5] = super.pathX[var5 - 1];
			super.pathY[var5] = super.pathY[var5 - 1];
			super.pathTraversed[var5] = super.pathTraversed[var5 - 1];
		}

		super.pathX[0] = var3;
		super.pathY[0] = var4;
		super.pathTraversed[0] = var2;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "-30"
	)
	final void method2915(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && HealthBarDefinition.SequenceDefinition_get(super.sequence).field2312 == 1) {
			super.sequence = -1;
		}

		if (!var3) {
			int var4 = var1 - super.pathX[0];
			int var5 = var2 - super.pathY[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (super.pathLength < 9) {
					++super.pathLength;
				}

				for (int var6 = super.pathLength; var6 > 0; --var6) {
					super.pathX[var6] = super.pathX[var6 - 1];
					super.pathY[var6] = super.pathY[var6 - 1];
					super.pathTraversed[var6] = super.pathTraversed[var6 - 1];
				}

				super.pathX[0] = var1;
				super.pathY[0] = var2;
				super.pathTraversed[0] = MoveSpeed.field3067;
				return;
			}
		}

		super.pathLength = 0;
		super.field1270 = 0;
		super.field1269 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		super.x = super.pathX[0] * 128 + super.field1199 * -742859456;
		super.y = super.pathY[0] * 128 + super.field1199 * -742859456;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "-124"
	)
	int[] method2898() {
		return this.field1354 != null ? this.field1354.method10375() : this.definition.method3911();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "1110875933"
	)
	short[] method2899() {
		return this.field1354 != null ? this.field1354.method10373() : this.definition.method3913();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IISI)V",
		garbageValue = "-1860311371"
	)
	void method2900(int var1, int var2, short var3) {
		if (this.field1354 == null) {
			this.field1354 = new class557(this.definition);
		}

		this.field1354.method10374(var1, var2, var3);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([I[SI)V",
		garbageValue = "-1744717501"
	)
	void method2901(int[] var1, short[] var2) {
		if (this.field1354 == null) {
			this.field1354 = new class557(this.definition);
		}

		this.field1354.method10376(var1, var2);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "344487603"
	)
	void method2902() {
		this.field1354 = null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lhn;B)V",
		garbageValue = "76"
	)
	void method2903(NpcOverrides var1) {
		this.chatheadOverrides = var1;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)Lhn;",
		garbageValue = "1379095078"
	)
	NpcOverrides method2912() {
		return this.chatheadOverrides;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Lhn;I)V",
		garbageValue = "1372460941"
	)
	void method2935(NpcOverrides var1) {
		this.modelOverrides = var1;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1426757895"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1716271904"
	)
	void method2916() {
		this.chatheadOverrides = null;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1054709288"
	)
	void method2907() {
		this.modelOverrides = null;
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	int vmethod2908() {
		return this.definition.field2028 == -1 ? super.defaultHeight : this.definition.field2028;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-10"
	)
	public static void method2958() {
		class179.field1915.clear();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-61"
	)
	public static void method2955(int var0, int var1) {
		VarbitComposition var2 = class202.method4010(var0);
		int var3 = var2.baseVar;
		int var4 = var2.startBit;
		int var5 = var2.endBit;
		int var6 = Varps.Varps_masks[var5 - var4];
		if (var1 < 0 || var1 > var6) {
			var1 = 0;
		}

		var6 <<= var4;
		Varps.Varps_main[var3] = Varps.Varps_main[var3] & ~var6 | var1 << var4 & var6;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1440425861"
	)
	public static boolean method2956(int var0) {
		return (var0 >> 21 & 1) != 0;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Liz;III)Lbx;",
		garbageValue = "-505785534"
	)
	public static final PcmPlayer method2959(TaskHandler var0, int var1, int var2) {
		if (DbTableType.field5406 * 1168272912 == 0) {
			throw new IllegalStateException();
		} else if (var1 >= 0 && var1 < 2) {
			if (var2 < 256) {
				var2 = 256;
			}

			try {
				PcmPlayer var3 = class31.pcmPlayerProvider.player();
				var3.samples = new int[256 * (ItemContainer.PcmPlayer_stereo ? 2 : 1)];
				var3.field272 = var2;
				var3.init();
				var3.capacity = (var2 & -1024) + 1024;
				if (var3.capacity > 16384) {
					var3.capacity = 16384;
				}

				var3.open(var3.capacity);
				if (RestClientThreadFactory.field72 > 0 && ApproximateRouteStrategy.soundSystem == null) {
					ApproximateRouteStrategy.soundSystem = new SoundSystem();
					class506.soundSystemExecutor = Executors.newScheduledThreadPool(1);
					class506.soundSystemExecutor.scheduleAtFixedRate(ApproximateRouteStrategy.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS);
				}

				if (ApproximateRouteStrategy.soundSystem != null) {
					if (ApproximateRouteStrategy.soundSystem.players[var1] != null) {
						throw new IllegalArgumentException();
					}

					ApproximateRouteStrategy.soundSystem.players[var1] = var3;
				}

				return var3;
			} catch (Throwable var4) {
				return new PcmPlayer();
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "14"
	)
	static void method2957() {
		if (class95.field1151 == Client.field544) {
			GraphicsObject.soundEffectsArchive = class144.newArchive(class389.field4553.field4548, false, true, true, false);
			FontName.archive6 = class144.newArchive(class389.field4571.field4548, true, true, true, false);
			AttackOption.archive8 = class144.newArchive(class389.field4557.field4548, false, true, true, false);
			class419.archive10 = class144.newArchive(class389.field4559.field4548, false, true, true, false);
			class213.archive13 = class144.newArchive(class389.field4554.field4548, true, false, true, false);
			AsyncHttpResponse.field84 = class144.newArchive(class389.field4555.field4548, false, true, true, false);
			class1.field0 = class144.newArchive(class389.field4563.field4548, false, true, true, false);
			class204.field2110 = class144.newArchive(class389.field4562.field4548, true, true, true, false);
			DirectByteArrayCopier.method7446(20, "Connecting to update server");
			class497.method9339(class95.field1152);
		} else {
			int var19;
			byte var36;
			if (class95.field1152 == Client.field544) {
				var36 = 0;
				var19 = var36 + GraphicsObject.soundEffectsArchive.percentage() * 53 / 100;
				var19 += FontName.archive6.percentage() * 5 / 100;
				var19 += AttackOption.archive8.percentage() * 36 / 100;
				var19 += class419.archive10.percentage() / 100;
				var19 += class213.archive13.percentage() / 100;
				var19 += AsyncHttpResponse.field84.percentage() * 2 / 100;
				var19 += class1.field0.percentage() / 100;
				var19 += class204.field2110.method7514() && class204.field2110.isFullyLoaded() ? 1 : 0;
				if (var19 != 100) {
					if (var19 != 0) {
						DirectByteArrayCopier.method7446(30, "Checking for updates - " + var19 + "%");
					}

				} else {
					class379.method7476(GraphicsObject.soundEffectsArchive, "Sound FX");
					class379.method7476(FontName.archive6, "Music Tracks");
					class379.method7476(AttackOption.archive8, "Sprites");
					class379.method7476(AsyncHttpResponse.field84, "Music Samples");
					class379.method7476(class1.field0, "Music Patches");
					class268.field2990 = new GraphicsDefaults();
					class268.field2990.decode(class204.field2110);
					DirectByteArrayCopier.method7446(40, "Loaded update list");
					class497.method9339(class95.field1157);
				}
			} else {
				int var3;
				if (Client.field544 == class95.field1157) {
					boolean var37 = !Client.isLowDetail;
					DbTableType.field5406 = 22050;
					ItemContainer.PcmPlayer_stereo = var37;
					RestClientThreadFactory.field72 = 2;
					ArrayList var29 = new ArrayList(3);
					class75.pcmPlayer1 = method2959(GameEngine.taskHandler, 0, 2048);
					class53.pcmStreamMixer = new PcmStreamMixer();
					PcmStreamMixer var33 = new PcmStreamMixer();
					var33.addSubStream(class53.pcmStreamMixer);

					for (var3 = 0; var3 < 3; ++var3) {
						MidiPcmStream var35 = new MidiPcmStream(class75.pcmPlayer1);
						var35.method6672(9, 128);
						var33.addSubStream(var35);
						var29.add(var35);
					}

					class75.pcmPlayer1.setStream(var33);
					ApproximateRouteStrategy.method1208(class1.field0, AsyncHttpResponse.field84, GraphicsObject.soundEffectsArchive, var29);
					SongTask.decimator = new Decimator(22050, DbTableType.field5406 * 1168272912);
					DirectByteArrayCopier.method7446(60, "Prepared sound engine");
					class497.method9339(class95.field1156);
				} else {
					int var1;
					if (Client.field544 == class95.field1156) {
						if (class197.field2045 == null) {
							class197.field2045 = new Fonts(AttackOption.archive8, class213.archive13);
						}

						FontName[] var26 = new FontName[]{FontName.FontName_plain11, FontName.FontName_verdana13, FontName.FontName_verdana11, FontName.FontName_bold12, FontName.FontName_verdana15, FontName.FontName_plain12};
						var1 = var26.length;
						Fonts var32 = class197.field2045;
						FontName[] var31 = new FontName[]{FontName.FontName_plain11, FontName.FontName_verdana13, FontName.FontName_verdana11, FontName.FontName_bold12, FontName.FontName_verdana15, FontName.FontName_plain12};
						Client.fontsMap = var32.createMap(var31);
						if (Client.fontsMap.size() < var1) {
							DirectByteArrayCopier.method7446(80, "Loading fonts - " + Client.fontsMap.size() * 100 / var1 + "%");
						} else {
							class336.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11);
							class1.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12);
							PacketWriter.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12);
							ObjectComposition.platformInfo = Client.field546.get();
							DirectByteArrayCopier.method7446(80, "Loaded fonts");
							class497.method9339(class95.field1150);
						}
					} else {
						Archive var21;
						if (Client.field544 == class95.field1150) {
							var19 = SecureRandomFuture.method2350(class419.archive10, AttackOption.archive8);
							var21 = AttackOption.archive8;
							var3 = Login.field962.length + Login.field963.length;
							String[] var34 = Login.field942;

							for (int var27 = 0; var27 < var34.length; ++var27) {
								String var28 = var34[var27];
								if (var21.getGroupId(var28) != -1) {
									++var3;
								}
							}

							if (var19 < var3) {
								DirectByteArrayCopier.method7446(90, "Loading title screen - " + var19 * 100 / var3 + "%");
							} else {
								DirectByteArrayCopier.method7446(100, "Loaded title screen");
								if (class360.field3847) {
									class31.updateGameState(5);
									class497.method9339(class95.field1166);
								} else {
									class497.method9339(class95.field1162);
								}

							}
						} else if (Client.field544 == class95.field1166) {
							class31.updateGameState(10);
						} else {
							Archive var0;
							if (Client.field544 == class95.field1162) {
								class390.field4572 = class144.newArchive(class389.field4549.field4548, false, true, true, false);
								class483.field5042 = class144.newArchive(class389.field4550.field4548, false, true, true, false);
								GameEngine.archive2 = class144.newArchive(class389.field4551.field4548, true, false, true, false);
								WorldMapCacheName.archive4 = class144.newArchive(class389.field4552.field4548, false, true, true, false);
								class309.archive9 = class144.newArchive(class389.field4564.field4548, true, true, true, false);
								Language.field4688 = class144.newArchive(class389.field4556.field4548, false, true, true, false);
								AbstractArchive.field4596 = class144.newArchive(class389.field4558.field4548, false, true, true, false);
								class419.field4733 = class144.newArchive(class389.field4560.field4548, false, true, true, false);
								class450.archive12 = class144.newArchive(class389.field4567.field4548, false, true, true, false);
								UserComparator10.field1505 = class144.newArchive(class389.field4566.field4548, false, true, true, false);
								ViewportMouse.field2903 = class144.newArchive(class389.field4561.field4548, false, true, true, false);
								class171.field1814 = class144.newArchive(class389.field4565.field4548, false, true, true, false);
								class53.field362 = class144.newArchive(class389.field4569.field4548, false, true, true, false);
								var1 = class389.field4570.field4548;
								ArchiveDisk var30 = null;
								if (JagexCache.JagexCache_dat2File != null) {
									var30 = new ArchiveDisk(var1, JagexCache.JagexCache_dat2File, UserComparator7.JagexCache_idxFiles[var1], 1000000);
								}

								var0 = new Archive(var30, class346.masterDisk, GrandExchangeOfferTotalQuantityComparator.field4633, var1, false, true, true, true, true);
								HealthBarConfig.field1344 = var0;
								DirectByteArrayCopier.method7446(20, "Connecting to update server");
								class497.method9339(class95.field1153);
							} else if (class95.field1153 == Client.field544) {
								var36 = 0;
								var19 = var36 + class390.field4572.percentage() * 5 / 100;
								var19 += class483.field5042.percentage() * 2 / 100;
								var19 += GameEngine.archive2.percentage() / 100;
								var19 += WorldMapCacheName.archive4.percentage() / 100;
								var19 += class309.archive9.percentage() * 10 / 100;
								var19 += Language.field4688.percentage() * 65 / 100;
								var19 += AbstractArchive.field4596.percentage() / 100;
								var19 += class419.field4733.percentage() / 100;
								var19 += class450.archive12.percentage() * 6 / 100;
								var19 += ViewportMouse.field2903.percentage() / 100;
								var19 += UserComparator10.field1505.percentage() * 2 / 100;
								var19 += class171.field1814.percentage() * 2 / 100;
								var19 += class53.field362.percentage() / 100;
								var19 += HealthBarConfig.field1344.percentage() * 2 / 100;
								if (var19 != 100) {
									if (var19 != 0) {
										DirectByteArrayCopier.method7446(30, "Checking for updates - " + var19 + "%");
									}

								} else {
									class379.method7476(class390.field4572, "Animations");
									class379.method7476(class483.field5042, "Skeletons");
									class379.method7476(class309.archive9, "Maps");
									class379.method7476(Language.field4688, "Models");
									class379.method7476(class419.field4733, "Music Jingles");
									class379.method7476(ViewportMouse.field2903, "World Map");
									class379.method7476(UserComparator10.field1505, "World Map Geography");
									class379.method7476(class171.field1814, "World Map Ground");
									DirectByteArrayCopier.method7446(30, "Loaded update list");
									class497.method9339(class95.field1154);
								}
							} else if (Client.field544 == class95.field1154) {
								HttpRequest.topLevelWorldView = Client.worldViewManager.method2606(104, 104, SecureUrlRequester.clientPreferences.getDrawDistance());
								Projection.worldView = HttpRequest.topLevelWorldView;
								VerticalAlignment.sceneMinimapSprite = new SpritePixels(512, 512);
								DirectByteArrayCopier.method7446(30, "Starting game engine...");
								class497.method9339(class95.field1158);
							} else if (Client.field544 != class95.field1158) {
								if (class95.field1159 == Client.field544) {
									var19 = 0;
									if (HealthBarDefinition.compass == null) {
										HealthBarDefinition.compass = class53.SpriteBuffer_getSprite(AttackOption.archive8, class268.field2990.field5101, 0);
									} else {
										++var19;
									}

									if (class162.redHintArrowSprite == null) {
										class162.redHintArrowSprite = class53.SpriteBuffer_getSprite(AttackOption.archive8, class268.field2990.field5109, 0);
									} else {
										++var19;
									}

									if (class160.mapSceneSprites == null) {
										class160.mapSceneSprites = class278.method5770(AttackOption.archive8, class268.field2990.field5106, 0);
									} else {
										++var19;
									}

									if (class60.headIconPkSprites == null) {
										class60.headIconPkSprites = class550.method10027(AttackOption.archive8, class268.field2990.field5102, 0);
									} else {
										++var19;
									}

									if (class230.headIconPrayerSprites == null) {
										class230.headIconPrayerSprites = class550.method10027(AttackOption.archive8, class268.field2990.field5103, 0);
									} else {
										++var19;
									}

									if (class369.headIconHintSprites == null) {
										class369.headIconHintSprites = class550.method10027(AttackOption.archive8, class268.field2990.field5104, 0);
									} else {
										++var19;
									}

									if (SpriteMask.mapDotSprites == null) {
										SpriteMask.mapDotSprites = class550.method10027(AttackOption.archive8, class268.field2990.field5105, 0);
									} else {
										++var19;
									}

									if (class381.crossSprites == null) {
										class381.crossSprites = class550.method10027(AttackOption.archive8, class268.field2990.field5113, 0);
									} else {
										++var19;
									}

									if (class113.field1435 == null) {
										class113.field1435 = class550.method10027(AttackOption.archive8, class268.field2990.field5100, 0);
									} else {
										++var19;
									}

									if (class36.scrollBarSprites == null) {
										class36.scrollBarSprites = class278.method5770(AttackOption.archive8, class268.field2990.field5108, 0);
									} else {
										++var19;
									}

									if (HttpResponse.field101 == null) {
										HttpResponse.field101 = class278.method5770(AttackOption.archive8, class268.field2990.field5107, 0);
									} else {
										++var19;
									}

									if (var19 < 11) {
										DirectByteArrayCopier.method7446(70, "Loading sprites - " + var19 * 100 / 12 + "%");
									} else {
										AbstractFont.AbstractFont_modIconSprites = HttpResponse.field101;
										class162.redHintArrowSprite.normalize();
										var1 = (int)(Math.random() * 21.0D) - 10;
										int var2 = (int)(Math.random() * 21.0D) - 10;
										var3 = (int)(Math.random() * 21.0D) - 10;
										int var4 = (int)(Math.random() * 41.0D) - 20;
										class160.mapSceneSprites[0].shiftColors(var1 + var4, var2 + var4, var4 + var3);
										DirectByteArrayCopier.method7446(60, "Loaded sprites");
										class497.method9339(class95.field1160);
									}
								} else if (class95.field1160 == Client.field544) {
									if (!AbstractArchive.field4596.isFullyLoaded()) {
										DirectByteArrayCopier.method7446(70, "Loading textures - " + "0%");
									} else {
										class445.textureProvider = new TextureProvider(AbstractArchive.field4596, AttackOption.archive8, 20, SecureUrlRequester.clientPreferences.getBrightness(), Client.isLowDetail ? 64 : 128);
										Rasterizer3D.setTextureLoader(class445.textureProvider);
										Rasterizer3D.buildPalette(SecureUrlRequester.clientPreferences.getBrightness());
										class497.method9339(class95.field1164);
									}
								} else if (Client.field544 == class95.field1164) {
									var19 = class445.textureProvider.getLoadedPercentage();
									if (var19 < 100) {
										DirectByteArrayCopier.method7446(80, "Loading textures - " + var19 + "%");
									} else {
										DirectByteArrayCopier.method7446(90, "Loaded textures");
										class497.method9339(class95.field1167);
									}
								} else if (class95.field1167 == Client.field544) {
									class190.mouseRecorder = new MouseRecorder();
									GameEngine.taskHandler.newThreadTask(class190.mouseRecorder, 10);
									DirectByteArrayCopier.method7446(92, "Loaded input handler");
									class497.method9339(class95.field1163);
								} else if (class95.field1163 == Client.field544) {
									if (!class419.archive10.tryLoadFileByNames("huffman", "")) {
										DirectByteArrayCopier.method7446(94, "Loading wordpack - " + 0 + "%");
									} else {
										Huffman var25 = new Huffman(class419.archive10.takeFileByNames("huffman", ""));
										class364.huffman = var25;
										DirectByteArrayCopier.method7446(94, "Loaded wordpack");
										class497.method9339(class95.field1161);
									}
								} else if (Client.field544 == class95.field1161) {
									if (!WorldMapCacheName.archive4.isFullyLoaded()) {
										DirectByteArrayCopier.method7446(96, "Loading interfaces - " + WorldMapCacheName.archive4.loadPercent() * 4 / 5 + "%");
									} else if (!HealthBarConfig.field1344.isFullyLoaded()) {
										DirectByteArrayCopier.method7446(96, "Loading interfaces - " + HealthBarConfig.field1344.loadPercent() * 4 / 5 + "%");
									} else if (!class450.archive12.isFullyLoaded()) {
										DirectByteArrayCopier.method7446(96, "Loading interfaces - " + (80 + class450.archive12.loadPercent() / 6) + "%");
									} else if (!class213.archive13.isFullyLoaded()) {
										DirectByteArrayCopier.method7446(96, "Loading interfaces - " + (96 + class213.archive13.loadPercent() / 50) + "%");
									} else {
										DirectByteArrayCopier.method7446(98, "Loaded interfaces");
										if (class450.archive12.isValidFileName("version.dat", "")) {
											Buffer var24 = new Buffer(class450.archive12.takeFileByNames("version.dat", ""));
											var24.readUnsignedShort();
										}

										class497.method9339(class95.field1165);
									}
								} else if (class95.field1165 == Client.field544) {
									if (ViewportMouse.field2903.getGroupCount() > 0 && !ViewportMouse.field2903.tryLoadGroupByName(WorldMapCacheName.field3272.name)) {
										DirectByteArrayCopier.method7446(100, "Loading world map - " + ViewportMouse.field2903.groupLoadPercentByName(WorldMapCacheName.field3272.name) / 10 + "%");
									} else {
										if (class158.worldMap == null) {
											class158.worldMap = new WorldMap();
											class158.worldMap.init(ViewportMouse.field2903, UserComparator10.field1505, class171.field1814, PacketWriter.fontBold12, Client.fontsMap, class160.mapSceneSprites);
										}

										DirectByteArrayCopier.method7446(100, "Loaded world map");
										if (class360.field3847) {
											class497.method9339(class95.field1155);
										} else {
											class497.method9339(class95.field1166);
										}

										Client.field698 = false;
									}
								} else {
									if (Client.field544 == class95.field1155) {
										class376.field4116 = false;
										class31.updateGameState(20);
										ViewportMouse.updateLoginState(LoginState.READ_ACCOUNT_INFO_PACKET_SIZE);
									}

								}
							} else if (!GameEngine.archive2.isFullyLoaded()) {
								DirectByteArrayCopier.method7446(40, "Loading config - " + GameEngine.archive2.loadPercent() + "%");
							} else if (!class53.field362.isFullyLoaded()) {
								DirectByteArrayCopier.method7446(40, "Loading config - " + (80 + class450.archive12.loadPercent() / 6) + "%");
							} else {
								class160.method3529(GameEngine.archive2);
								var0 = GameEngine.archive2;
								FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var0;
								Archive var20 = GameEngine.archive2;
								var21 = Language.field4688;
								KitDefinition.KitDefinition_archive = var20;
								class204.KitDefinition_modelsArchive = var21;
								class419.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3);
								Archive var22 = GameEngine.archive2;
								Archive var23 = Language.field4688;
								boolean var5 = Client.isLowDetail;
								ObjectComposition.ObjectDefinition_archive = var22;
								ObjectComposition.ObjectDefinition_modelsArchive = var23;
								ObjectComposition.ObjectDefinition_isLowDetail = var5;
								Archive var6 = GameEngine.archive2;
								Archive var7 = Language.field4688;
								class330.NpcDefinition_archive = var6;
								NPCComposition.field2036 = var7;
								Archive var8 = GameEngine.archive2;
								StructComposition.StructDefinition_archive = var8;
								class202.method4012(GameEngine.archive2, Language.field4688, Client.isMembersWorld, class336.fontPlain11);
								class195.method3954(GameEngine.archive2, class390.field4572, class483.field5042);
								HttpQueryParams.method9395(GameEngine.archive2, Language.field4688);
								Archive var9 = GameEngine.archive2;
								VarbitComposition.VarbitDefinition_archive = var9;
								Archive var10 = GameEngine.archive2;
								VarpDefinition.VarpDefinition_archive = var10;
								VarpDefinition.field1871 = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16);
								class379.widgetDefinition = new WidgetDefinition(WorldMapCacheName.archive4, Language.field4688, AttackOption.archive8, class213.archive13, HealthBarConfig.field1344);
								class372.method7459(GameEngine.archive2);
								class190.method3884(GameEngine.archive2);
								Archive var11 = GameEngine.archive2;
								VarcInt.VarcInt_archive = var11;
								UserComparator7.method3217(GameEngine.archive2);
								class133.method3282(GameEngine.archive2);
								Archive var12 = GameEngine.archive2;
								DbTableType.field5405 = var12;
								ClanChannelMember.method3475(GameEngine.archive2);
								Widget.field3962 = new class539(Language.field4687, 54, class276.clientLanguage, GameEngine.archive2);
								FloorUnderlayDefinition.field2075 = new class539(Language.field4687, 47, class276.clientLanguage, GameEngine.archive2);
								HttpRequestTask.varcs = new Varcs();
								FontName.method9744(GameEngine.archive2, AttackOption.archive8, class213.archive13);
								Archive var13 = GameEngine.archive2;
								Archive var14 = AttackOption.archive8;
								HealthBarDefinition.HealthBarDefinition_archive = var13;
								HealthBarDefinition.field1929 = var14;
								Archive var15 = GameEngine.archive2;
								Archive var16 = AttackOption.archive8;
								WorldMapElement.WorldMapElement_archive = var16;
								if (var15.isFullyLoaded()) {
									WorldMapElement.WorldMapElement_count = var15.getGroupFileCount(35);
									WorldMapElement.WorldMapElement_cached = new WorldMapElement[WorldMapElement.WorldMapElement_count];

									for (int var17 = 0; var17 < WorldMapElement.WorldMapElement_count; ++var17) {
										byte[] var18 = var15.takeFile(35, var17);
										WorldMapElement.WorldMapElement_cached[var17] = new WorldMapElement(var17);
										if (var18 != null) {
											WorldMapElement.WorldMapElement_cached[var17].decode(new Buffer(var18));
											WorldMapElement.WorldMapElement_cached[var17].method3777();
										}
									}
								}

								DirectByteArrayCopier.method7446(50, "Loaded config");
								class497.method9339(class95.field1159);
							}
						}
					}
				}
			}
		}
	}
}
