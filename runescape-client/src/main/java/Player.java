import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cr")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("nh")
	static boolean field923;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lxf;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -827095657
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 64148653
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("ah")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1200807265
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1828986679
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -448100593
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1791890569
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1906633059
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1086388993
	)
	int field927;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1595911749
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -673445225
	)
	int field929;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1919402109
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 880679665
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1041205371
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1902299033
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("az")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 971214193
	)
	@Export("team")
	int team;
	@ObfuscatedName("aw")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1060680325
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lta;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lta;"
	)
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lta;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -971093659
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1261334993"
	)
	@Export("getX")
	public int getX() {
		return this.plane;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "991561622"
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
				if (this.method2208(var5[var6])) {
					var10 = this.method2165(var5[var6]).team;
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
			if (var9 < 0 || var9 >= PlayerComposition.field3995[var8].length) {
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

		this.username = new Username(var1.readStringCp1252NullTerminated(), class198.loginType);
		this.clearIsFriend();
		this.clearIsInFriendsChat();
		this.method2190();
		if (this == class27.localPlayer) {
			RunException.field5986 = this.username.getName();
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
					var15[var11] = class533.method10581(var5[var11] - 2048, var1);
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

		this.appearance.method7512(var13, var5, var15, var17, var14, var2, var4, var16);
		if (var4 != -1) {
			super.size = class191.getNpcDefinition(var4).size;
		} else {
			super.size = 1;
		}

		this.footprintSize = (int)((float)(super.size * -1643642880) * 0.4F);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Ljx;",
		garbageValue = "15"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) {
			return null;
		} else {
			AnimationSequence var1 = this.method2427();
			AnimationSequence var2 = this.isUnanimated ? null : this.method2407(var1);
			if (var1 == null && var2 == null) {
				var2 = super.field1081;
				if (super.field1081.method9601(30)) {
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
					var7 = this.method2396(var7);
				}

				if (!this.isUnanimated && this.model0 != null) {
					if (Client.cycle >= this.animationCycleEnd) {
						this.model0 = null;
					}

					if (Client.cycle >= this.animationCycleStart && Client.cycle < this.animationCycleEnd) {
						Model var9 = this.model0;
						var9.offsetBy(this.field927 * 4096 - super.x, this.tileHeight2 - this.tileHeight, this.field929 * 4096 - super.y);
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

						var9.offsetBy(super.x - this.field927 * 4096, this.tileHeight - this.tileHeight2, super.y - this.field929 * 4096);
					}
				}

				var7.isSingleTile = true;
				if (super.field1066.method5662() && Client.cycle >= super.npcCycle && Client.cycle < super.field1026) {
					var7.method5472(super.field1066, (short)var8);
				} else {
					var7.method5574();
				}

				return var7;
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-117"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) {
			this.checkIsFriend();
		}

		return this.isFriendTriBool == TriBool.TriBool_true;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1635272367"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1673684368"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = class137.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "631567391"
	)
	@Export("isFriendsChatMember")
	boolean isFriendsChatMember() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) {
			this.updateIsInFriendsChat();
		}

		return this.isInFriendsChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "43"
	)
	@Export("clearIsInFriendsChat")
	void clearIsInFriendsChat() {
		this.isInFriendsChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-658293902"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = MusicPatch.friendsChat != null && MusicPatch.friendsChat.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-34"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 4; ++var1) {
			if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method3893(this.username.getName()) != -1 && var1 != 2) {
				this.isInClanChat = TriBool.TriBool_true;
				return;
			}
		}

		this.isInClanChat = TriBool.TriBool_false;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1292431300"
	)
	void method2190() {
		this.isInClanChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-54"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) {
			this.updateIsInClanChat();
		}

		return this.isInClanChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ldj;IILke;B)V",
		garbageValue = "95"
	)
	final void method2161(WorldView var1, int var2, int var3, MoveSpeed var4) {
		if (super.animationSequence.isActive() && super.animationSequence.getSequenceDefinition().field2439 == 1) {
			this.method2385();
		}

		this.method2397();
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) {
				if (var4 == MoveSpeed.field3197) {
					Player var5 = this;
					MoveSpeed var6 = MoveSpeed.field3197;
					int var7 = super.pathX[0];
					int var8 = super.pathY[0];
					int var9 = super.size * -549711872;
					CollisionMap var10 = var1.collisionMaps[var1.plane];
					if (var7 >= var9 && var7 < var10.method6148() - var9 && var8 >= var9 && var8 < var10.method6131() - var9 && var2 >= var9 && var2 < var10.method6148() - var9 && var3 >= var9 && var3 < var10.method6131() - var9) {
						int var11 = Client.field294.method6312(var7, var8, var9, DynamicObject.method1990(var2, var3), var10, true, Client.field383, Client.field585);
						if (var11 >= 1) {
							for (int var12 = 0; var12 < var11 - 1; ++var12) {
								var5.method2387(Client.field383[var12], Client.field585[var12], var6);
							}
						}
					}
				}

				this.method2387(var2, var3, var4);
			} else {
				this.method2462(var2, var3);
			}
		} else {
			this.method2462(var2, var3);
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "336"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		super.pathLength = 0;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2113253836"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-869442321"
	)
	boolean method2208(int var1) {
		return var1 >= 2048;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)Lid;",
		garbageValue = "-37"
	)
	ItemComposition method2165(int var1) {
		return ObjectComposition.ItemDefinition_get(var1 - 2048);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1615218034"
	)
	int vmethod2682() {
		return this.method2405() ? 0 : this.footprintSize;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lif;",
		garbageValue = "1952103211"
	)
	protected class222 vmethod5351() {
		return class222.field2577;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(CI)B",
		garbageValue = "346249352"
	)
	@Export("charToByteCp1252")
	public static byte charToByteCp1252(char var0) {
		byte var1;
		if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
			if (var0 == 8364) {
				var1 = -128;
			} else if (var0 == 8218) {
				var1 = -126;
			} else if (var0 == 402) {
				var1 = -125;
			} else if (var0 == 8222) {
				var1 = -124;
			} else if (var0 == 8230) {
				var1 = -123;
			} else if (var0 == 8224) {
				var1 = -122;
			} else if (var0 == 8225) {
				var1 = -121;
			} else if (var0 == 710) {
				var1 = -120;
			} else if (var0 == 8240) {
				var1 = -119;
			} else if (var0 == 352) {
				var1 = -118;
			} else if (var0 == 8249) {
				var1 = -117;
			} else if (var0 == 338) {
				var1 = -116;
			} else if (var0 == 381) {
				var1 = -114;
			} else if (var0 == 8216) {
				var1 = -111;
			} else if (var0 == 8217) {
				var1 = -110;
			} else if (var0 == 8220) {
				var1 = -109;
			} else if (var0 == 8221) {
				var1 = -108;
			} else if (var0 == 8226) {
				var1 = -107;
			} else if (var0 == 8211) {
				var1 = -106;
			} else if (var0 == 8212) {
				var1 = -105;
			} else if (var0 == 732) {
				var1 = -104;
			} else if (var0 == 8482) {
				var1 = -103;
			} else if (var0 == 353) {
				var1 = -102;
			} else if (var0 == 8250) {
				var1 = -101;
			} else if (var0 == 339) {
				var1 = -100;
			} else if (var0 == 382) {
				var1 = -98;
			} else if (var0 == 376) {
				var1 = -97;
			} else {
				var1 = 63;
			}
		} else {
			var1 = (byte)var0;
		}

		return var1;
	}
}
