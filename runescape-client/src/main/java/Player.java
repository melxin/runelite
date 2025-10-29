import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ci")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lxv;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1427369953
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 624181267
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("aw")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -545684123
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1506260323
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 781403537
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -920595127
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 2063009467
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1673305597
	)
	int field907;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1055026275
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1289722773
	)
	int field896;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1171013343
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -512742895
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -483984693
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 536054477
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("af")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -2140200207
	)
	@Export("team")
	int team;
	@ObfuscatedName("ao")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -2060016843
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ltq;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Ltq;"
	)
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Ltq;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 1348652401
	)
	@Export("footprintSize")
	int footprintSize;

	Player(int var1) {
		super(var1);
		this.headIconPk = -1;
		this.headIconPrayer = -1;
		this.actions = new String[3];
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
		this.footprintSize = 0;

		for (int var2 = 0; var2 < 3; ++var2) {
			this.actions[var2] = "";
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "446304328"
	)
	@Export("getX")
	public int getX() {
		return this.plane;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lxa;B)V",
		garbageValue = "-94"
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
				if (this.method2232(var5[var6])) {
					var10 = this.method2230(var5[var6]).team;
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
			if (var9 < 0 || var9 >= ItemContainer.field826[var8].length) {
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

		this.username = new Username(var1.readStringCp1252NullTerminated(), LoginScreenAnimation.loginType);
		this.clearIsFriend();
		this.clearIsInFriendsChat();
		this.method2226();
		if (this == class330.localPlayer) {
			RunException.field6189 = this.username.getName();
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
						var22.field1936 = var1.readUnsignedShort();
						var22.field1937 = var1.readUnsignedShort();
					}

					if (var21) {
						var22.field1942 = var1.readUnsignedShort();
						var22.field1939 = var1.readUnsignedShort();
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

		this.appearance.method7768(var28, var5, var30, var32, var29, var2, var4, var31);
		if (var4 != -1) {
			super.size = AsyncHttpResponse.getNpcDefinition(var4).size;
		} else {
			super.size = 1;
		}

		this.footprintSize = (int)(0.4F * (float)(super.size * -1534590976));
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Lky;",
		garbageValue = "566725961"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) {
			return null;
		} else {
			AnimationSequence var1 = this.method2507();
			AnimationSequence var2 = this.isUnanimated ? null : this.method2508(var1);
			if (var1 == null && var2 == null) {
				var2 = super.field1015;
				if (super.field1015.method9876(30)) {
					return null;
				}
			}

			SequenceDefinition var3 = var1 == null ? null : var1.getSequenceDefinition();
			SequenceDefinition var4 = var2 == null ? null : var2.getSequenceDefinition();
			int var5 = var1 == null ? -1 : var1.getFrame();
			int var6 = var2 == null ? -1 : var2.getFrame();
			Model var7 = this.appearance.getModel(var3, var5, var4, var6);
			if (var7 == null) {
				return null;
			} else {
				var7.calculateBoundsCylinder();
				super.defaultHeight = var7.height;
				int var8 = var7.indicesCount;
				if (!this.isUnanimated) {
					var7 = this.method2495(var7);
				}

				if (!this.isUnanimated && this.model0 != null) {
					if (Client.cycle >= this.animationCycleEnd) {
						this.model0 = null;
					}

					if (Client.cycle >= this.animationCycleStart && Client.cycle < this.animationCycleEnd) {
						Model var9 = this.model0;
						var9.offsetBy(this.field907 * 4096 - super.x, this.tileHeight2 - this.tileHeight, this.field896 * 4096 - super.y);
						if (super.orientation == 512) {
							var9.rotateY90Ccw();
							var9.rotateY90Ccw();
							var9.rotateY90Ccw();
						} else if (super.orientation == 1024) {
							var9.rotateY90Ccw();
							var9.rotateY90Ccw();
						} else if (super.orientation == 1536) {
							var9.rotateY90Ccw();
						}

						Model[] var10 = new Model[]{var7, var9};
						var7 = new Model(var10, 2);
						if (super.orientation == 512) {
							var9.rotateY90Ccw();
						} else if (super.orientation == 1024) {
							var9.rotateY90Ccw();
							var9.rotateY90Ccw();
						} else if (super.orientation == 1536) {
							var9.rotateY90Ccw();
							var9.rotateY90Ccw();
							var9.rotateY90Ccw();
						}

						var9.offsetBy(super.x - this.field907 * 4096, this.tileHeight - this.tileHeight2, super.y - this.field896 * 4096);
					}
				}

				var7.isSingleTile = true;
				if (super.field1065.method6121() && Client.cycle >= super.npcCycle && Client.cycle < super.field1022) {
					var7.method5953(super.field1065, (short)var8);
				} else {
					var7.method5954();
				}

				return var7;
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1841545705"
	)
	protected boolean vmethod5839() {
		if (this.appearance == null) {
			return false;
		} else if (this.model0 != null && this.model0.faceAlphas != null) {
			return true;
		} else if (this.method2496()) {
			return true;
		} else if (this.method2537()) {
			return true;
		} else {
			Model var1 = this.appearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
			return var1 != null && var1.faceAlphas != null;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1395283750"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) {
			this.checkIsFriend();
		}

		return this.isFriendTriBool == TriBool.TriBool_true;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-6000"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-52"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = class320.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-82"
	)
	@Export("isFriendsChatMember")
	boolean isFriendsChatMember() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) {
			this.updateIsInFriendsChat();
		}

		return this.isInFriendsChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1078451492"
	)
	@Export("clearIsInFriendsChat")
	void clearIsInFriendsChat() {
		this.isInFriendsChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1418448276"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = BuddyRankComparator.friendsChat != null && BuddyRankComparator.friendsChat.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1221700513"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 4; ++var1) {
			if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method4053(this.username.getName()) != -1 && var1 != 2) {
				this.isInClanChat = TriBool.TriBool_true;
				return;
			}
		}

		this.isInClanChat = TriBool.TriBool_false;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1309903654"
	)
	void method2226() {
		this.isInClanChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) {
			this.updateIsInClanChat();
		}

		return this.isInClanChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ldd;IILlz;I)V",
		garbageValue = "1045116658"
	)
	final void method2231(WorldView var1, int var2, int var3, MoveSpeed var4) {
		if (super.animationSequence.isActive() && super.animationSequence.getSequenceDefinition().field2517 == 1) {
			this.method2486();
		}

		this.method2498();
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) {
				if (var4 == MoveSpeed.field3301) {
					PacketWriter.method3054(var1, this, var2, var3, MoveSpeed.field3301);
				}

				this.method2557(var2, var3, var4);
			} else {
				this.method2482(var2, var3);
			}
		} else {
			this.method2482(var2, var3);
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Ljs;",
		garbageValue = "1389940305"
	)
	protected class248 vmethod5821() {
		return class248.field2785;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "327716789"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		super.pathLength = 0;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1481041478"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1149382054"
	)
	boolean method2232(int var1) {
		return var1 >= 2048;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(II)Lis;",
		garbageValue = "963660187"
	)
	ItemComposition method2230(int var1) {
		return class150.ItemDefinition_get(var1 - 2048);
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-458299933"
	)
	int vmethod2828() {
		return this.method2506() ? 0 : this.footprintSize;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-52"
	)
	@Export("savePreferences")
	static void savePreferences() {
		AccessFile var0 = null;

		try {
			var0 = HttpMethod.getPreferencesFile("", class520.field5546.name, true);
			Buffer var1 = class468.clientPreferences.toBuffer();
			var0.write(var1.array, 0, var1.offset * 2108391709);
		} catch (Exception var3) {
		}

		try {
			if (var0 != null) {
				var0.closeSync(true);
			}
		} catch (Exception var2) {
		}

	}
}
