import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dt")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lwm;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -240519287
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 754944649
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("ac")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1761737677
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -828432963
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -484329439
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1329441393
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1011970773
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1520504637
	)
	int field1145;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -183907203
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -78465371
	)
	int field1134;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 297632709
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 45531573
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1965266411
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1275704549
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("am")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1061177707
	)
	@Export("team")
	int team;
	@ObfuscatedName("aw")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1594026029
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lsi;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lsi;"
	)
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lsi;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;

	Player(int var1) {
		super(var1);
		this.headIconPk = -1;
		this.headIconPrayer = -1;
		this.actions = new String[3];

		for (int var2 = 0; var2 < 3; ++var2) {
			this.actions[var2] = "";
		}

		this.combatLevel = 0;
		this.skillLevel = 0;
		this.animationCycleStart = 0;
		this.animationCycleEnd = 0;
		this.isUnanimated = false;
		this.team = 0;
		this.isHidden = false;
		this.isFriendTriBool = TriBool.TriBool_unknown;
		this.isInFriendsChat = TriBool.TriBool_unknown;
		this.isInClanChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "-1471838664"
	)
	@Export("read")
	final void read(Buffer var1) {
		var1.offset = 0;
		byte var2 = var1.readByte();
		boolean var3 = true;
		this.headIconPk = var1.readByte();
		this.headIconPrayer = var1.readByte();
		int var4 = -1;
		this.team = 0;
		int[] var5 = new int[12];

		int var7;
		int var8;
		int var9;
		int var10;
		for (int var6 = 0; var6 < var5.length; ++var6) {
			var7 = var1.readUnsignedByte();
			if (var7 == 0) {
				var5[var6] = 0;
			} else {
				var8 = var1.readUnsignedByte();
				var9 = var8 + (var7 << 8);
				if (var6 == 0 && var9 == 65535) {
					var4 = var1.readUnsignedShort();
					break;
				}

				var5[var6] = var9;
				if (this.method2482(var5[var6])) {
					var10 = this.method2488(var5[var6]).team;
					if (var10 != 0) {
						this.team = var10;
					}
				}
			}
		}

		int[] var13 = new int[12];

		for (var7 = 0; var7 < var13.length; ++var7) {
			var8 = var1.readUnsignedByte();
			if (var8 == 0) {
				var13[var7] = 0;
			} else {
				var9 = var1.readUnsignedByte();
				var13[var7] = var9 + (var8 << 8);
			}
		}

		int[] var14 = new int[5];

		for (var8 = 0; var8 < var14.length; ++var8) {
			var9 = var1.readUnsignedByte();
			if (var9 < 0 || var9 >= class140.field1665[var8].length) {
				var9 = 0;
			}

			var14[var8] = var9;
		}

		super.idleSequence = var1.readUnsignedShort();
		if (super.idleSequence == 65535) {
			super.idleSequence = -1;
		}

		super.turnLeftSequence = var1.readUnsignedShort();
		if (super.turnLeftSequence == 65535) {
			super.turnLeftSequence = -1;
		}

		super.turnRightSequence = super.turnLeftSequence;
		super.walkSequence = var1.readUnsignedShort();
		if (super.walkSequence == 65535) {
			super.walkSequence = -1;
		}

		super.walkBackSequence = var1.readUnsignedShort();
		if (super.walkBackSequence == 65535) {
			super.walkBackSequence = -1;
		}

		super.walkLeftSequence = var1.readUnsignedShort();
		if (super.walkLeftSequence == 65535) {
			super.walkLeftSequence = -1;
		}

		super.walkRightSequence = var1.readUnsignedShort();
		if (super.walkRightSequence == 65535) {
			super.walkRightSequence = -1;
		}

		super.runSequence = var1.readUnsignedShort();
		if (super.runSequence == 65535) {
			super.runSequence = -1;
		}

		this.username = new Username(var1.readStringCp1252NullTerminated(), class280.loginType);
		this.clearIsFriend();
		this.clearIsInFriendsChat();
		this.method2476();
		if (this == class132.localPlayer) {
			RunException.field5741 = this.username.getName();
		}

		this.combatLevel = var1.readUnsignedByte();
		this.skillLevel = var1.readUnsignedShort();
		this.isHidden = var1.readUnsignedByte() == 1;
		if (Client.gameBuild == 0 && Client.staffModLevel >= 2) {
			this.isHidden = false;
		}

		PlayerCompositionColorTextureOverride[] var15 = null;
		boolean var17 = false;
		var10 = var1.readUnsignedShort();
		var17 = (var10 >> 15 & 1) == 1;
		int var11;
		if (var10 > 0 && var10 != 32768) {
			var15 = new PlayerCompositionColorTextureOverride[12];

			for (var11 = 0; var11 < var15.length; ++var11) {
				int var12 = var10 >> 12 - var11 & 1;
				if (var12 == 1) {
					var15[var11] = WorldView.method2834(var5[var11] - 2048, var1);
				}
			}
		}

		for (var11 = 0; var11 < 3; ++var11) {
			this.actions[var11] = var1.readStringCp1252NullTerminated();
		}

		byte var16 = var1.readByte();
		if (this.appearance == null) {
			this.appearance = new PlayerComposition();
		}

		this.appearance.method6946(var13, var5, var15, var17, var14, var2, var4, var16);
		if (var4 != -1) {
			super.size = class91.getNpcDefinition(var4).size;
		} else {
			super.size = 1;
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Ljf;",
		garbageValue = "-516720946"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? WorldMapData_1.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.movementSequence == super.idleSequence && var1 != null ? null : WorldMapData_1.SequenceDefinition_get(super.movementSequence);
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				int var4 = var3.indicesCount;
				if (!this.isUnanimated) {
					var3 = this.method2600(var3);
				}

				if (!this.isUnanimated && this.model0 != null) {
					if (Client.cycle >= this.animationCycleEnd) {
						this.model0 = null;
					}

					if (Client.cycle >= this.animationCycleStart && Client.cycle < this.animationCycleEnd) {
						Model var5 = this.model0;
						var5.offsetBy(this.field1145 * 4096 - super.x, this.tileHeight2 - this.tileHeight, this.field1134 * 4096 - super.y);
						if (super.orientation == 512) {
							var5.rotateY90Ccw();
							var5.rotateY90Ccw();
							var5.rotateY90Ccw();
						} else if (super.orientation == 1024) {
							var5.rotateY90Ccw();
							var5.rotateY90Ccw();
						} else if (super.orientation == 1536) {
							var5.rotateY90Ccw();
						}

						Model[] var6 = new Model[]{var3, var5};
						var3 = new Model(var6, 2);
						if (super.orientation == 512) {
							var5.rotateY90Ccw();
						} else if (super.orientation == 1024) {
							var5.rotateY90Ccw();
							var5.rotateY90Ccw();
						} else if (super.orientation == 1536) {
							var5.rotateY90Ccw();
							var5.rotateY90Ccw();
							var5.rotateY90Ccw();
						}

						var5.offsetBy(super.x - this.field1145 * 4096, this.tileHeight - this.tileHeight2, super.y - this.field1134 * 4096);
					}
				}

				var3.isSingleTile = true;
				if (super.field1286.method5437() && Client.cycle >= super.npcCycle && Client.cycle < super.field1281) {
					var3.method5295(super.field1286, (short)var4);
				} else {
					var3.method5296();
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "580786541"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) {
			this.checkIsFriend();
		}

		return this.isFriendTriBool == TriBool.TriBool_true;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "32141937"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-283549863"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = SoundCache.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2084404785"
	)
	@Export("isFriendsChatMember")
	boolean isFriendsChatMember() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) {
			this.updateIsInFriendsChat();
		}

		return this.isInFriendsChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "113"
	)
	@Export("clearIsInFriendsChat")
	void clearIsInFriendsChat() {
		this.isInFriendsChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-68"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = class7.friendsChat != null && class7.friendsChat.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 4; ++var1) {
			if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method3546(this.username.getName()) != -1 && var1 != 2) {
				this.isInClanChat = TriBool.TriBool_true;
				return;
			}
		}

		this.isInClanChat = TriBool.TriBool_false;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1054203820"
	)
	void method2476() {
		this.isInClanChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "129"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) {
			this.updateIsInClanChat();
		}

		return this.isInClanChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ldp;IILkn;I)V",
		garbageValue = "-1355657600"
	)
	final void method2479(WorldView var1, int var2, int var3, MoveSpeed var4) {
		if (super.sequence != -1 && WorldMapData_1.SequenceDefinition_get(super.sequence).field2374 == 1) {
			super.sequence = -1;
		}

		this.method2601();
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) {
				if (var4 == MoveSpeed.field3123) {
					ChatChannel.method2343(var1, this, var2, var3, MoveSpeed.field3123);
				}

				this.method2590(var2, var3, var4);
			} else {
				this.method2623(var2, var3);
			}
		} else {
			this.method2623(var2, var3);
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1181269414"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		super.pathLength = 0;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "657986527"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "63084109"
	)
	boolean method2482(int var1) {
		return var1 >= 2048;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)Lin;",
		garbageValue = "0"
	)
	ItemComposition method2488(int var1) {
		return class138.ItemDefinition_get(var1 - 2048);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpl;Lpl;I)V",
		garbageValue = "-2143306809"
	)
	public static void method2520(AbstractArchive var0, AbstractArchive var1) {
		class476.field5081 = var0;
		SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var1;
	}

	@ObfuscatedName("au")
	public static int method2521(long var0) {
		return (int)(var0 >>> 0 & 127L);
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ILdy;ZI)I",
		garbageValue = "-504388378"
	)
	static int method2516(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) {
			var3 = class200.topLevelWorldView.plane;
			int var15 = (class132.localPlayer.x >> 7) + class200.topLevelWorldView.baseX;
			int var8 = (class132.localPlayer.y >> 7) + class200.topLevelWorldView.baseY;
			LoginState.getWorldMap().method9727(var3, var15, var8, true);
			return 1;
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) {
				var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
				String var16 = "";
				var9 = LoginState.getWorldMap().getMapArea(var3);
				if (var9 != null) {
					var16 = var9.getExternalName();
				}

				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var16;
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) {
				var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
				LoginState.getWorldMap().setCurrentMapAreaId(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) {
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = LoginState.getWorldMap().getZoomLevel();
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) {
				var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
				LoginState.getWorldMap().setZoomPercentage(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) {
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = LoginState.getWorldMap().isCacheLoaded() ? 1 : 0;
				return 1;
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize]);
					LoginState.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize]);
					LoginState.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize]);
					LoginState.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize]);
					LoginState.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) {
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = LoginState.getWorldMap().getDisplayX();
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = LoginState.getWorldMap().getDisplayY();
					return 1;
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) {
						var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
						var11 = LoginState.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var11.getOrigin().packed();
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) {
						var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
						var11 = LoginState.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64;
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) {
						var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
						var11 = LoginState.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64;
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64;
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1;
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) {
						var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
						var11 = LoginState.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var11.getZoom();
						}

						return 1;
					} else if (var0 == 6615) {
						var14 = LoginState.getWorldMap().getDisplayCoord();
						if (var14 == null) {
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var14.x;
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var14.y;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) {
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = LoginState.getWorldMap().currentMapAreaId();
						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) {
						var14 = new Coord(Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize]);
						var11 = LoginState.getWorldMap().getCurrentMapArea();
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y);
							if (var12 == null) {
								Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = -1;
							} else {
								Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var12[0];
								Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var12[1];
							}

							return 1;
						}
					} else {
						Coord var5;
						if (var0 == 6618) {
							var14 = new Coord(Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize]);
							var11 = LoginState.getWorldMap().getCurrentMapArea();
							if (var11 == null) {
								Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = -1;
								return 1;
							} else {
								var5 = var11.coord(var14.x, var14.y);
								if (var5 == null) {
									Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var5.packed();
								}

								return 1;
							}
						} else {
							Coord var10;
							if (var0 == 6619) {
								HealthBarConfig.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1]);
								HitSplatDefinition.method4149(var3, var10, false);
								return 1;
							} else if (var0 == 6620) {
								HealthBarConfig.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1]);
								HitSplatDefinition.method4149(var3, var10, true);
								return 1;
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) {
								HealthBarConfig.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1]);
								var9 = LoginState.getWorldMap().getMapArea(var3);
								if (var9 == null) {
									Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 0;
									return 1;
								} else {
									Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0;
									return 1;
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) {
								Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = LoginState.getWorldMap().getDisplayWith();
								Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = LoginState.getWorldMap().getDisplayHeight();
								return 1;
							} else if (var0 == 6623) {
								var14 = new Coord(Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize]);
								var11 = LoginState.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y);
								if (var11 == null) {
									Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var11.getId();
								}

								return 1;
							} else if (var0 == 6624) {
								LoginState.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6625) {
								LoginState.getWorldMap().resetMaxFlashCount();
								return 1;
							} else if (var0 == 6626) {
								LoginState.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6627) {
								LoginState.getWorldMap().resetCyclesPerFlash();
								return 1;
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) {
									var13 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize] == 1;
									LoginState.getWorldMap().setPerpetualFlash(var13);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) {
									var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
									LoginState.getWorldMap().flashElement(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) {
									var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
									LoginState.getWorldMap().flashCategory(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) {
									LoginState.getWorldMap().stopCurrentFlashes();
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) {
									var13 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize] == 1;
									LoginState.getWorldMap().setElementsDisabled(var13);
									return 1;
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) {
										HealthBarConfig.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
										var7 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1] == 1;
										LoginState.getWorldMap().disableElement(var3, var7);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) {
										HealthBarConfig.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
										var7 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1] == 1;
										LoginState.getWorldMap().setCategoryDisabled(var3, var7);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) {
										Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = LoginState.getWorldMap().getElementsDisabled() ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) {
										var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = LoginState.getWorldMap().isElementDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) {
										var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = LoginState.getWorldMap().isCategoryDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == 6638) {
										HealthBarConfig.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
										var10 = new Coord(Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1]);
										var5 = LoginState.getWorldMap().method9772(var3, var10);
										if (var5 == null) {
											Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = -1;
										} else {
											Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var5.packed();
										}

										return 1;
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) {
											var6 = LoginState.getWorldMap().iconStart();
											if (var6 == null) {
												Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var6.getElement();
												Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var6.coord2.packed();
											}

											return 1;
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) {
											var6 = LoginState.getWorldMap().iconNext();
											if (var6 == null) {
												Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var6.getElement();
												Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var6.coord2.packed();
											}

											return 1;
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) {
												var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
												var4 = Canvas.WorldMapElement_get(var3);
												if (var4.name == null) {
													Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
												} else {
													Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.name;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) {
												var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
												var4 = Canvas.WorldMapElement_get(var3);
												Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var4.textSize;
												return 1;
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) {
												var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
												var4 = Canvas.WorldMapElement_get(var3);
												if (var4 == null) {
													Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var4.category;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) {
												var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
												var4 = Canvas.WorldMapElement_get(var3);
												if (var4 == null) {
													Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var4.sprite1;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) {
												Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = class454.worldMapEvent.mapElement;
												return 1;
											} else if (var0 == 6698) {
												Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = class454.worldMapEvent.coord1.packed();
												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) {
												Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = class454.worldMapEvent.coord2.packed();
												return 1;
											} else {
												return 2;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
