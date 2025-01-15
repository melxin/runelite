import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lwb;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -4338737
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 2021020425
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("ae")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1450184417
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1826513691
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1047556293
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -507008159
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1071049889
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1467025815
	)
	int field1131;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -2059756935
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1918868429
	)
	int field1133;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1224039761
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1108112153
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -2029592175
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1259463217
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("ai")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1299238349
	)
	@Export("team")
	int team;
	@ObfuscatedName("am")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1798595885
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1870889557
	)
	@Export("index")
	int index;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lsb;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lsb;"
	)
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lsb;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Ldz;"
	)
	@Export("worldView")
	WorldView worldView;

	Player() {
		this.headIconPk = -1;
		this.headIconPrayer = -1;
		this.actions = new String[3];

		for (int var1 = 0; var1 < 3; ++var1) {
			this.actions[var1] = "";
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
		this.worldView = GameEngine.topLevelWorldView;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)Lhv;",
		garbageValue = "-7"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? class33.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.idleSequence == super.movementSequence && var1 != null ? null : class33.SequenceDefinition_get(super.movementSequence);
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				int var4 = var3.indicesCount;
				if (!this.isUnanimated) {
					var3 = this.method2807(var3);
				}

				if (!this.isUnanimated && this.model0 != null) {
					if (Client.cycle >= this.animationCycleEnd) {
						this.model0 = null;
					}

					if (Client.cycle >= this.animationCycleStart && Client.cycle < this.animationCycleEnd) {
						Model var5 = this.model0;
						var5.offsetBy(this.field1131 * 4096 - super.x, this.tileHeight2 - this.tileHeight, this.field1133 * 4096 - super.y);
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

						var5.offsetBy(super.x - this.field1131 * 4096, this.tileHeight - this.tileHeight2, super.y - this.field1133 * 4096);
					}
				}

				var3.isSingleTile = true;
				if (super.field1208 != 0 && Client.cycle >= super.field1256 && Client.cycle < super.field1252) {
					var3.overrideHue = super.field1258;
					var3.overrideSaturation = super.field1211;
					var3.overrideLuminance = super.field1261;
					var3.overrideAmount = super.field1208;
					var3.field2193 = (short)var4;
				} else {
					var3.overrideAmount = 0;
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lvy;B)V",
		garbageValue = "3"
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
				if (this.method2696(var5[var6])) {
					var10 = this.method2671(var5[var6]).team;
					if (var10 != 0) {
						this.team = var10;
					}
				}
			}
		}

		int[] var28 = new int[12];

		for (var7 = 0; var7 < var28.length; ++var7) {
			var8 = var1.readUnsignedByte();
			if (var8 == 0) {
				var28[var7] = 0;
			} else {
				var9 = var1.readUnsignedByte();
				var28[var7] = var9 + (var8 << 8);
			}
		}

		int[] var29 = new int[5];

		for (var8 = 0; var8 < var29.length; ++var8) {
			var9 = var1.readUnsignedByte();
			if (var9 < 0 || var9 >= PlayerComposition.field3816[var8].length) {
				var9 = 0;
			}

			var29[var8] = var9;
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

		this.username = new Username(var1.readStringCp1252NullTerminated(), class383.loginType);
		this.clearIsFriend();
		this.clearIsInFriendsChat();
		this.method2662();
		if (this == ModeWhere.localPlayer) {
			class484.field5049 = this.username.getName();
		}

		this.combatLevel = var1.readUnsignedByte();
		this.skillLevel = var1.readUnsignedShort();
		this.isHidden = var1.readUnsignedByte() == 1;
		if (Client.gameBuild == 0 && Client.staffModLevel >= 2) {
			this.isHidden = false;
		}

		PlayerCompositionColorTextureOverride[] var30 = null;
		boolean var32 = false;
		var10 = var1.readUnsignedShort();
		var32 = (var10 >> 15 & 1) == 1;
		int var11;
		if (var10 > 0 && var10 != 32768) {
			var30 = new PlayerCompositionColorTextureOverride[12];

			for (var11 = 0; var11 < var30.length; ++var11) {
				int var12 = var10 >> 12 - var11 & 1;
				if (var12 == 1) {
					int var16 = var5[var11] - 2048;
					int var17 = var1.readUnsignedByte();
					boolean var18 = (var17 & 1) != 0;
					boolean var19 = (var17 & 2) != 0;
					boolean var20 = (var17 & 4) != 0;
					boolean var21 = (var17 & 8) != 0;
					PlayerCompositionColorTextureOverride var22 = new PlayerCompositionColorTextureOverride(var16);
					int var23;
					int[] var24;
					boolean var25;
					int var26;
					short var27;
					if (var18) {
						var23 = var1.readUnsignedByte();
						var24 = new int[]{var23 & 15, var23 >> 4 & 15};
						var25 = var22.playerCompositionRecolorTo != null && var24.length == var22.playerCompositionRecolorTo.length;

						for (var26 = 0; var26 < 2; ++var26) {
							if (var24[var26] != 15) {
								var27 = (short)var1.readUnsignedShort();
								if (var25) {
									var22.playerCompositionRecolorTo[var24[var26]] = var27;
								}
							}
						}
					}

					if (var19) {
						var23 = var1.readUnsignedByte();
						var24 = new int[]{var23 & 15, var23 >> 4 & 15};
						var25 = var22.playerCompositionRetextureTo != null && var24.length == var22.playerCompositionRetextureTo.length;

						for (var26 = 0; var26 < 2; ++var26) {
							if (var24[var26] != 15) {
								var27 = (short)var1.readUnsignedShort();
								if (var25) {
									var22.playerCompositionRetextureTo[var24[var26]] = var27;
								}
							}
						}
					}

					if (var20) {
						var22.field2482 = var1.readUnsignedShort();
						var22.field2472 = var1.readUnsignedShort();
					}

					if (var21) {
						var22.field2480 = var1.readUnsignedShort();
						var22.field2481 = var1.readUnsignedShort();
					}

					var30[var11] = var22;
				}
			}
		}

		for (var11 = 0; var11 < 3; ++var11) {
			this.actions[var11] = var1.readStringCp1252NullTerminated();
		}

		byte var31 = var1.readByte();
		if (this.appearance == null) {
			this.appearance = new PlayerComposition();
		}

		this.appearance.method7095(var28, var5, var30, var32, var29, var2, var4, var31);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1283443343"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) {
			this.checkIsFriend();
		}

		return this.isFriendTriBool == TriBool.TriBool_true;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "92"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "70"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = HttpRequest.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-75"
	)
	@Export("isFriendsChatMember")
	boolean isFriendsChatMember() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) {
			this.updateIsInFriendsChat();
		}

		return this.isInFriendsChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "506446761"
	)
	@Export("clearIsInFriendsChat")
	void clearIsInFriendsChat() {
		this.isInFriendsChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "809695880"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = WorldMapLabelSize.friendsChat != null && WorldMapLabelSize.friendsChat.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1378119328"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 4; ++var1) {
			if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method3712(this.username.getName()) != -1 && var1 != 2) {
				this.isInClanChat = TriBool.TriBool_true;
				return;
			}
		}

		this.isInClanChat = TriBool.TriBool_false;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1692676098"
	)
	void method2662() {
		this.isInClanChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1208907157"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) {
			this.updateIsInClanChat();
		}

		return this.isInClanChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "458573925"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? FadeOutTask.getNpcDefinition(this.appearance.npcTransformId).size : 1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ldz;IILkq;I)V",
		garbageValue = "-1857557654"
	)
	final void method2694(WorldView var1, int var2, int var3, MoveSpeed var4) {
		if (super.sequence != -1 && class33.SequenceDefinition_get(super.sequence).field2942 == 1) {
			super.sequence = -1;
		}

		this.method2782();
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) {
				if (var4 == MoveSpeed.field3046) {
					class154.method3629(var1, this, var2, var3, MoveSpeed.field3046);
				}

				this.method2678(var2, var3, var4);
			} else {
				this.resetPath(var2, var3);
			}
		} else {
			this.resetPath(var2, var3);
		}

	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1461697436"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0;
		super.field1270 = 0;
		super.field1269 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		int var3 = this.transformedSize();
		super.x = var3 * 64 + super.pathX[0] * 128;
		super.y = super.pathY[0] * 128 + var3 * 64;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(IILkq;B)V",
		garbageValue = "-127"
	)
	final void method2678(int var1, int var2, MoveSpeed var3) {
		if (super.pathLength < 9) {
			++super.pathLength;
		}

		for (int var4 = super.pathLength; var4 > 0; --var4) {
			super.pathX[var4] = super.pathX[var4 - 1];
			super.pathY[var4] = super.pathY[var4 - 1];
			super.pathTraversed[var4] = super.pathTraversed[var4 - 1];
		}

		super.pathX[0] = var1;
		super.pathY[0] = var2;
		super.pathTraversed[0] = var3;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "3"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "957965452"
	)
	boolean method2696(int var1) {
		return var1 >= 2048;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(II)Lkm;",
		garbageValue = "-466486148"
	)
	ItemComposition method2671(int var1) {
		return FaceNormal.ItemDefinition_get(var1 - 2048);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lpq;Lpq;Lpq;I)V",
		garbageValue = "1937436320"
	)
	public static void method2704(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
		HitSplatDefinition.HitSplatDefinition_archive = var0;
		HitSplatDefinition.field2751 = var1;
		HitSplatDefinition.HitSplatDefinition_fontsArchive = var2;
	}

	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "([Lna;IIIIIIII)V",
		garbageValue = "2088854136"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) {
			Widget var9 = var0[var8];
			if (var9 != null && var9.parentId == var1 && (var9.method7424() || class232.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent)) {
				if (var9.isIf3) {
					if (class163.isComponentHidden(var9)) {
						continue;
					}
				} else if (var9.type == 0 && var9 != class424.mousedOverWidgetIf1 && class163.isComponentHidden(var9)) {
					continue;
				}

				if (var9.type == 11) {
					if (var9.method7523(ClanChannel.widgetDefinition, class280.urlRequester)) {
						if (var9.method7433()) {
							UserComparator8.invalidateWidget(var9);
							class244.revalidateWidgetScroll(var9.children, var9, true);
							var9.method7440().method4873().method4976(3, var9.method7440().method4853());
						}

						if (var9.field4023 != null) {
							ScriptEvent var10 = new ScriptEvent();
							var10.widget = var9;
							var10.args = var9.field4023;
							Client.scriptEvents.addFirst(var10);
						}
					}
				} else if (var9.type == 12 && var9.method7449(ClanChannel.widgetDefinition)) {
					UserComparator8.invalidateWidget(var9);
				}

				int var26 = var9.x + var6;
				int var11 = var7 + var9.y;
				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				if (var9.type == 9) {
					var16 = var26;
					var17 = var11;
					var18 = var26 + var9.width;
					int var19 = var9.height + var11;
					if (var18 < var26) {
						var16 = var18;
						var18 = var26;
					}

					if (var19 < var11) {
						var17 = var19;
						var19 = var11;
					}

					++var18;
					++var19;
					var12 = var16 > var2 ? var16 : var2;
					var13 = var17 > var3 ? var17 : var3;
					var14 = var18 < var4 ? var18 : var4;
					var15 = var19 < var5 ? var19 : var5;
				} else {
					var16 = var26 + var9.width;
					var17 = var11 + var9.height;
					var12 = var26 > var2 ? var26 : var2;
					var13 = var11 > var3 ? var11 : var3;
					var14 = var16 < var4 ? var16 : var4;
					var15 = var17 < var5 ? var17 : var5;
				}

				if (var9 == Client.clickedWidget) {
					Client.field683 = true;
					Client.field721 = var26;
					Client.field685 = var11;
				}

				boolean var34 = false;
				if (var9.field3950) {
					switch(Client.field665) {
					case 0:
						var34 = true;
					case 1:
					default:
						break;
					case 2:
						if (Client.field707 == var9.id >>> 16) {
							var34 = true;
						}
						break;
					case 3:
						if (var9.id == Client.field707) {
							var34 = true;
						}
					}
				}

				if (var34 || !var9.isIf3 || var12 < var14 && var13 < var15) {
					if (var9.isIf3) {
						ScriptEvent var27;
						if (var9.noClickThrough) {
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) {
									if (var27.field1075) {
										var27.remove();
										var27.widget.field3959 = false;
									}
								}

								SoundCache.method881();
								if (class243.widgetDragDuration == 0) {
									Client.clickedWidget = null;
									Client.clickedWidgetParent = null;
								}

								if (!Client.isMenuOpen) {
									ClientPreferences.addCancelMenuEntry();
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
							for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) {
								if (var27.field1075 && var27.widget.onScroll == var27.args) {
									var27.remove();
								}
							}
						}
					}

					var17 = MouseHandler.MouseHandler_x;
					var18 = MouseHandler.MouseHandler_y;
					if (MouseHandler.MouseHandler_lastButton != 0) {
						var17 = MouseHandler.MouseHandler_lastPressedX;
						var18 = MouseHandler.MouseHandler_lastPressedY;
					}

					boolean var35 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15;
					if (var9.contentType == 1337) {
						if (!Client.isLoading && !Client.isMenuOpen && var35) {
							class368.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) {
						Tile.checkIfMinimapClicked(var9, var26, var11);
					} else {
						if (var9.contentType == 1400) {
							class420.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var35, var26, var11, var9.width, var9.height);
						}

						if (!Client.isMenuOpen && var35) {
							if (var9.contentType == 1400) {
								class420.worldMap.addElementMenuOptions(var26, var11, var9.width, var9.height, var17, var18);
							} else {
								class419.Widget_addToMenu(var9);
							}
						}

						boolean var21;
						int var23;
						if (var34) {
							for (int var20 = 0; var20 < var9.field3861.length; ++var20) {
								var21 = false;
								boolean var28 = false;
								if (!var21 && var9.field3861[var20] != null) {
									for (var23 = 0; var23 < var9.field3861[var20].length; ++var23) {
										boolean var24 = false;
										if (var9.field3953 != null) {
											var24 = Client.indexCheck.isValidIndexInRange(var9.field3861[var20][var23]);
										}

										if (Clock.method5074(var9.field3861[var20][var23]) || var24) {
											var21 = true;
											if (var9.field3953 != null && var9.field3953[var20] > Client.cycle) {
												break;
											}

											byte var33 = var9.field3952[var20][var23];
											if (var33 == 0 || ((var33 & 8) == 0 || !Client.indexCheck.isValidIndexInRange(86) && !Client.indexCheck.isValidIndexInRange(82) && !Client.indexCheck.isValidIndexInRange(81)) && ((var33 & 2) == 0 || Client.indexCheck.isValidIndexInRange(86)) && ((var33 & 1) == 0 || Client.indexCheck.isValidIndexInRange(82)) && ((var33 & 4) == 0 || Client.indexCheck.isValidIndexInRange(81))) {
												var28 = true;
												break;
											}
										}
									}
								}

								if (var28) {
									if (var20 < 10) {
										UrlRequester.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) {
										class278.method5969();
										AbstractWorldMapIcon.method6464(var9.id, var9.childIndex, class298.Widget_unpackTargetMask(class232.getWidgetFlags(var9)), var9.itemId);
										Client.selectedSpellActionName = class47.Widget_getSpellActionName(var9);
										if (Client.selectedSpellActionName == null) {
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var9.dataText + WorldViewManager.colorStartTag(16777215);
									}

									var23 = var9.field3964[var20];
									if (var9.field3953 == null) {
										var9.field3953 = new int[var9.field3861.length];
									}

									if (var9.field3864 == null) {
										var9.field3864 = new int[var9.field3861.length];
									}

									if (var23 != 0) {
										if (var9.field3953[var20] == 0) {
											var9.field3953[var20] = var23 + Client.cycle + var9.field3864[var20];
										} else {
											var9.field3953[var20] = var23 + Client.cycle;
										}
									} else {
										var9.field3953[var20] = Integer.MAX_VALUE;
									}
								}

								if (!var21 && var9.field3953 != null) {
									var9.field3953[var20] = 0;
								}
							}
						}

						if (var9.isIf3) {
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								var35 = true;
							} else {
								var35 = false;
							}

							boolean var36 = false;
							if ((MouseHandler.MouseHandler_currentButton == 1 || !KeyHandler.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var35) {
								var36 = true;
							}

							var21 = false;
							if ((MouseHandler.MouseHandler_lastButton == 1 || !KeyHandler.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) {
								var21 = true;
							}

							if (var21) {
								WorldMapLabel.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var26, MouseHandler.MouseHandler_lastPressedY - var11);
							}

							if (var9.method7425()) {
								if (var21) {
									Client.field709.addFirst(new class268(0, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9));
								}

								if (var36) {
									Client.field709.addFirst(new class268(1, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9));
								}
							}

							if (var9.contentType == 1400) {
								class420.worldMap.method9800(var17, var18, var35 & var36, var35 & var21);
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var35 && GameEngine.method673(class232.getWidgetFlags(var9))) {
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) {
								Client.field523 = true;
								Client.field681 = var26;
								Client.field682 = var11;
							}

							if (var9.hasListener) {
								ScriptEvent var22;
								if (var35 && Client.mouseWheelRotation != 0 && var9.onScroll != null) {
									var22 = new ScriptEvent();
									var22.field1075 = true;
									var22.widget = var9;
									var22.mouseY = Client.mouseWheelRotation;
									var22.args = var9.onScroll;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.clickedWidget != null || Client.isMenuOpen) {
									var21 = false;
									var36 = false;
									var35 = false;
								}

								if (!var9.field4016 && var21) {
									var9.field4016 = true;
									if (var9.onClick != null) {
										var22 = new ScriptEvent();
										var22.field1075 = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_lastPressedX - var26;
										var22.mouseY = MouseHandler.MouseHandler_lastPressedY - var11;
										var22.args = var9.onClick;
										Client.scriptEvents.addFirst(var22);
									}
								}

								if (var9.field4016 && var36 && var9.onClickRepeat != null) {
									var22 = new ScriptEvent();
									var22.field1075 = true;
									var22.widget = var9;
									var22.mouseX = MouseHandler.MouseHandler_x - var26;
									var22.mouseY = MouseHandler.MouseHandler_y - var11;
									var22.args = var9.onClickRepeat;
									Client.scriptEvents.addFirst(var22);
								}

								if (var9.field4016 && !var36) {
									var9.field4016 = false;
									if (var9.onRelease != null) {
										var22 = new ScriptEvent();
										var22.field1075 = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_x - var26;
										var22.mouseY = MouseHandler.MouseHandler_y - var11;
										var22.args = var9.onRelease;
										Client.scriptEvents3.addFirst(var22);
									}
								}

								if (var36 && var9.onHold != null) {
									var22 = new ScriptEvent();
									var22.field1075 = true;
									var22.widget = var9;
									var22.mouseX = MouseHandler.MouseHandler_x - var26;
									var22.mouseY = MouseHandler.MouseHandler_y - var11;
									var22.args = var9.onHold;
									Client.scriptEvents.addFirst(var22);
								}

								if (!var9.field3959 && var35) {
									var9.field3959 = true;
									if (var9.onMouseOver != null) {
										var22 = new ScriptEvent();
										var22.field1075 = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_x - var26;
										var22.mouseY = MouseHandler.MouseHandler_y - var11;
										var22.args = var9.onMouseOver;
										Client.scriptEvents.addFirst(var22);
									}
								}

								if (var9.field3959 && var35 && var9.onMouseRepeat != null) {
									var22 = new ScriptEvent();
									var22.field1075 = true;
									var22.widget = var9;
									var22.mouseX = MouseHandler.MouseHandler_x - var26;
									var22.mouseY = MouseHandler.MouseHandler_y - var11;
									var22.args = var9.onMouseRepeat;
									Client.scriptEvents.addFirst(var22);
								}

								if (var9.field3959 && !var35) {
									var9.field3959 = false;
									if (var9.onMouseLeave != null) {
										var22 = new ScriptEvent();
										var22.field1075 = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_x - var26;
										var22.mouseY = MouseHandler.MouseHandler_y - var11;
										var22.args = var9.onMouseLeave;
										Client.scriptEvents3.addFirst(var22);
									}
								}

								if (var9.onTimer != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onTimer;
									Client.scriptEvents2.addFirst(var22);
								}

								ScriptEvent var25;
								int var37;
								int var39;
								if (var9.onVarTransmit != null && Client.changedVarpCount > var9.field4018) {
									if (var9.varTransmitTriggers != null && Client.changedVarpCount - var9.field4018 <= 32) {
										label841:
										for (var39 = var9.field4018; var39 < Client.changedVarpCount; ++var39) {
											var23 = Client.changedVarps[var39 & 31];

											for (var37 = 0; var37 < var9.varTransmitTriggers.length; ++var37) {
												if (var23 == var9.varTransmitTriggers[var37]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onVarTransmit;
													Client.scriptEvents.addFirst(var25);
													break label841;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onVarTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field4018 = Client.changedVarpCount;
								}

								if (var9.onInvTransmit != null && Client.field749 > var9.field4019) {
									if (var9.invTransmitTriggers != null && Client.field749 - var9.field4019 <= 32) {
										label817:
										for (var39 = var9.field4019; var39 < Client.field749; ++var39) {
											var23 = Client.changedItemContainers[var39 & 31];

											for (var37 = 0; var37 < var9.invTransmitTriggers.length; ++var37) {
												if (var23 == var9.invTransmitTriggers[var37]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onInvTransmit;
													Client.scriptEvents.addFirst(var25);
													break label817;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onInvTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field4019 = Client.field749;
								}

								if (var9.onStatTransmit != null && Client.changedSkillsCount > var9.field3954) {
									if (var9.statTransmitTriggers != null && Client.changedSkillsCount - var9.field3954 <= 32) {
										label793:
										for (var39 = var9.field3954; var39 < Client.changedSkillsCount; ++var39) {
											var23 = Client.changedSkills[var39 & 31];

											for (var37 = 0; var37 < var9.statTransmitTriggers.length; ++var37) {
												if (var23 == var9.statTransmitTriggers[var37]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onStatTransmit;
													Client.scriptEvents.addFirst(var25);
													break label793;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onStatTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field3954 = Client.changedSkillsCount;
								}

								if (Client.chatCycle > var9.field4017 && var9.onChatTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onChatTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field697 > var9.field4017 && var9.onFriendTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onFriendTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field770 > var9.field4017 && var9.onClanTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onClanTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field699 > var9.field4017 && var9.field3993 != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.field3993;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field700 > var9.field4017 && var9.field3988 != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.field3988;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field701 > var9.field4017 && var9.onStockTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onStockTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field714 > var9.field4017 && var9.field4000 != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.field4000;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field499 > var9.field4017 && var9.onMiscTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onMiscTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								var9.field4017 = Client.cycleCntr;
								if (var9.onKey != null) {
									for (var39 = 0; var39 < Client.field733; ++var39) {
										ScriptEvent var32 = new ScriptEvent();
										var32.widget = var9;
										var32.keyTyped = Client.field735[var39];
										var32.keyPressed = Client.field589[var39];
										var32.args = var9.onKey;
										Client.scriptEvents.addFirst(var32);
									}
								}

								ScriptEvent var31;
								int[] var38;
								if (var9.field3989 != null) {
									var38 = Client.indexCheck.method5766();

									for (var23 = 0; var23 < var38.length; ++var23) {
										var31 = new ScriptEvent();
										var31.widget = var9;
										var31.keyTyped = var38[var23];
										var31.args = var9.field3989;
										Client.scriptEvents.addFirst(var31);
									}
								}

								if (var9.field3901 != null) {
									var38 = Client.indexCheck.method5767();

									for (var23 = 0; var23 < var38.length; ++var23) {
										var31 = new ScriptEvent();
										var31.widget = var9;
										var31.keyTyped = var38[var23];
										var31.args = var9.field3901;
										Client.scriptEvents.addFirst(var31);
									}
								}
							}
						}

						if (!var9.isIf3) {
							if (Client.clickedWidget != null || Client.isMenuOpen) {
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.mouseOverColor != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								if (var9.mouseOverRedirect >= 0) {
									class424.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									class424.mousedOverWidgetIf1 = var9;
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								HealthBarConfig.field1346 = var9;
							}

							if (var9.scrollHeight > var9.height) {
								MenuAction.method2364(var9, var26 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var9.type == 0) {
							updateInterface(var0, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY);
							if (var9.children != null) {
								updateInterface(var9.children, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY);
							}

							InterfaceParent var29 = (InterfaceParent)Client.interfaceParents.get((long)var9.id);
							if (var29 != null) {
								if (var29.type == 0 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15 && !Client.isMenuOpen) {
									for (ScriptEvent var30 = (ScriptEvent)Client.scriptEvents.last(); var30 != null; var30 = (ScriptEvent)Client.scriptEvents.previous()) {
										if (var30.field1075) {
											var30.remove();
											var30.widget.field3959 = false;
										}
									}

									if (class243.widgetDragDuration == 0) {
										Client.clickedWidget = null;
										Client.clickedWidgetParent = null;
									}

									if (!Client.isMenuOpen) {
										ClientPreferences.addCancelMenuEntry();
									}
								}

								DirectByteArrayCopier.updateRootInterface(var29.group, var12, var13, var14, var15, var26, var11);
							}
						}
					}
				}
			}
		}

	}
}
