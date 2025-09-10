import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cv")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lxa;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -2046771821
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -2098637401
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("ao")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1142723923
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1536638859
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -186364543
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1917832763
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -531848807
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 264944597
	)
	int field944;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 872810909
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -957055045
	)
	int field945;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -2014968995
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 855169737
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1151402741
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1098440261
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("ab")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 141014513
	)
	@Export("team")
	int team;
	@ObfuscatedName("ak")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 306222651
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -1705512019
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("getX")
	public int getX() {
		return this.plane;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lwb;I)V",
		garbageValue = "1737422268"
	)
	@Export("read")
	final void read(Buffer var1) {
		var1.array = 0;
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
				if (this.method2184(var5[var6])) {
					var10 = this.method2180(var5[var6]).team;
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
			if (var9 < 0 || var9 >= PlayerComposition.field4074[var8].length) {
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

		this.username = new Username(var1.readStringCp1252NullTerminated(), PacketWriter.loginType);
		this.clearIsFriend();
		this.clearIsInFriendsChat();
		this.method2220();
		if (this == HealthBarUpdate.localPlayer) {
			RunException.field6086 = this.username.getName();
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
					var15[var11] = Sound.method3879(var5[var11] - 2048, var1);
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

		this.appearance.method7526(var13, var5, var15, var17, var14, var2, var4, var16);
		if (var4 != -1) {
			super.size = class63.getNpcDefinition(var4).size * 64;
		} else {
			super.size = 64;
		}

		this.footprintSize = (int)((float)(super.size * 184557568) * 0.4F);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Ljn;",
		garbageValue = "-1879635116"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) {
			return null;
		} else {
			AnimationSequence var1 = this.method2441();
			AnimationSequence var2 = this.isUnanimated ? null : this.method2419(var1);
			if (var1 == null && var2 == null) {
				var2 = super.field1093;
				if (super.field1093.method9567(30)) {
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
					var7 = this.method2431(var7);
				}

				if (!this.isUnanimated && this.model0 != null) {
					if (Client.cycle >= this.animationCycleEnd) {
						this.model0 = null;
					}

					if (Client.cycle >= this.animationCycleStart && Client.cycle < this.animationCycleEnd) {
						Model var9 = this.model0;
						var9.offsetBy(this.field944 * 4096 - super.x, this.tileHeight2 - this.tileHeight, this.field945 * 4096 - super.y);
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

						var9.offsetBy(super.x - this.field944 * 4096, this.tileHeight - this.tileHeight2, super.y - this.field945 * 4096);
					}
				}

				var7.isSingleTile = true;
				if (super.field1076.method5651() && Client.cycle >= super.npcCycle && Client.cycle < super.field1052) {
					var7.method5491(super.field1076, (short)var8);
				} else {
					var7.method5599();
				}

				return var7;
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "2"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) {
			this.checkIsFriend();
		}

		return this.isFriendTriBool == TriBool.TriBool_true;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "193669174"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2067359333"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = ApproximateRouteStrategy.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1876361634"
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
		descriptor = "(I)V",
		garbageValue = "-1418702940"
	)
	@Export("clearIsInFriendsChat")
	void clearIsInFriendsChat() {
		this.isInFriendsChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "337053224"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = DevicePcmPlayerProvider.friendsChat != null && DevicePcmPlayerProvider.friendsChat.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "881942280"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 4; ++var1) {
			if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method3921(this.username.getName()) != -1 && var1 != 2) {
				this.isInClanChat = TriBool.TriBool_true;
				return;
			}
		}

		this.isInClanChat = TriBool.TriBool_false;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "15"
	)
	void method2220() {
		this.isInClanChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-31"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) {
			this.updateIsInClanChat();
		}

		return this.isInClanChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ldr;IILko;S)V",
		garbageValue = "6803"
	)
	final void method2211(WorldView var1, int var2, int var3, MoveSpeed var4) {
		if (super.animationSequence.isActive() && super.animationSequence.getSequenceDefinition().field2485 == 1) {
			this.method2472();
		}

		this.method2432();
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) {
				if (var4 == MoveSpeed.field3282) {
					Player var5 = this;
					MoveSpeed var6 = MoveSpeed.field3282;
					int var7 = super.pathX[0];
					int var8 = super.pathY[0];
					int var9 = super.size * -1542062016;
					CollisionMap var10 = var1.collisionMaps[var1.plane];
					if (var7 >= var9 && var7 < var10.method6186() - var9 && var8 >= var9 && var8 < var10.method6167() - var9 && var2 >= var9 && var2 < var10.method6186() - var9 && var3 >= var9 && var3 < var10.method6167() - var9) {
						int var11 = Client.field317.method6328(var7, var8, var9, class406.method8276(var2, var3), var10, true, Client.field605, Client.field606);
						if (var11 >= 1) {
							for (int var12 = 0; var12 < var11 - 1; ++var12) {
								var5.method2421(Client.field605[var12], Client.field606[var12], var6);
							}
						}
					}
				}

				this.method2421(var2, var3, var4);
			} else {
				this.method2422(var2, var3);
			}
		} else {
			this.method2422(var2, var3);
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1936500569"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		super.pathLength = 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1641761362"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Lid;",
		garbageValue = "-102"
	)
	protected class224 vmethod5366() {
		return class224.field2625;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2011880333"
	)
	boolean method2184(int var1) {
		return var1 >= 2048;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Lis;",
		garbageValue = "1482657248"
	)
	ItemComposition method2180(int var1) {
		return AttackOption.ItemDefinition_get(var1 - 2048);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "37"
	)
	int vmethod2763() {
		return this.method2440() ? 0 : this.footprintSize;
	}
}
