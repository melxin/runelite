import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cp")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("gq")
	@ObfuscatedGetter(
		intValue = -2091359981
	)
	static int field938;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lxm;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Loq;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1847184155
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1365683895
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("am")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -569942195
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -747621259
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 524882583
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 558215519
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 2097307099
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1786413593
	)
	int field944;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1567565631
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1055378593
	)
	int field946;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1010214625
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 619259745
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -837032925
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 677339129
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("as")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 2133757471
	)
	@Export("team")
	int team;
	@ObfuscatedName("ab")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -226423085
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ltc;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Ltc;"
	)
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Ltc;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 194570827
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1537061280"
	)
	@Export("getX")
	public int getX() {
		return this.plane;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Ljm;",
		garbageValue = "27"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? VarpDefinition.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.idleSequence == super.movementSequence && var1 != null ? null : VarpDefinition.SequenceDefinition_get(super.movementSequence);
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				int var4 = var3.indicesCount;
				if (!this.isUnanimated) {
					var3 = this.method2327(var3);
				}

				if (!this.isUnanimated && this.model0 != null) {
					if (Client.cycle >= this.animationCycleEnd) {
						this.model0 = null;
					}

					if (Client.cycle >= this.animationCycleStart && Client.cycle < this.animationCycleEnd) {
						Model var5 = this.model0;
						var5.offsetBy(this.field944 * 4096 - super.x, this.tileHeight2 - this.tileHeight, this.field946 * 4096 - super.y);
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

						var5.offsetBy(super.x - this.field944 * 4096, this.tileHeight - this.tileHeight2, super.y - this.field946 * 4096);
					}
				}

				var3.isSingleTile = true;
				if (super.field1054.method5714() && Client.cycle >= super.npcCycle && Client.cycle < super.field1027) {
					var3.method5661(super.field1054, (short)var4);
				} else {
					var3.method5611();
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lwt;I)V",
		garbageValue = "-1703948318"
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
				if (this.method2160(var5[var6])) {
					var10 = this.method2161(var5[var6]).team;
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
			if (var9 < 0 || var9 >= PlayerComposition.field3905[var8].length) {
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

		this.username = new Username(var1.readStringCp1252NullTerminated(), AbstractUserComparator.loginType);
		this.clearIsFriend();
		this.clearIsInFriendsChat();
		this.method2154();
		if (this == class152.localPlayer) {
			UserComparator2.field5756 = this.username.getName();
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
						var22.field1881 = var1.readUnsignedShort();
						var22.field1882 = var1.readUnsignedShort();
					}

					if (var21) {
						var22.field1880 = var1.readUnsignedShort();
						var22.field1884 = var1.readUnsignedShort();
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

		this.appearance.method7317(var28, var5, var30, var32, var29, var2, var4, var31);
		if (var4 != -1) {
			super.size = UserComparator3.getNpcDefinition(var4).size;
		} else {
			super.size = 1;
		}

		this.footprintSize = (int)((float)(super.size * -687341568) * 0.4F);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2013832037"
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
		descriptor = "(I)V",
		garbageValue = "-152961642"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1230030788"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = Actor.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1466319460"
	)
	@Export("isFriendsChatMember")
	boolean isFriendsChatMember() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) {
			this.updateIsInFriendsChat();
		}

		return this.isInFriendsChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-86"
	)
	@Export("clearIsInFriendsChat")
	void clearIsInFriendsChat() {
		this.isInFriendsChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "13676"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = class187.friendsChat != null && class187.friendsChat.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "12"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 4; ++var1) {
			if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method3743(this.username.getName()) != -1 && var1 != 2) {
				this.isInClanChat = TriBool.TriBool_true;
				return;
			}
		}

		this.isInClanChat = TriBool.TriBool_false;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1507286124"
	)
	void method2154() {
		this.isInClanChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "113"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) {
			this.updateIsInClanChat();
		}

		return this.isInClanChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ldl;IILkt;I)V",
		garbageValue = "199237263"
	)
	final void method2157(WorldView var1, int var2, int var3, MoveSpeed var4) {
		if (super.sequence != -1 && VarpDefinition.SequenceDefinition_get(super.sequence).field2366 == 1) {
			super.sequence = -1;
		}

		this.method2305();
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) {
				if (var4 == MoveSpeed.field3119) {
					Player var5 = this;
					MoveSpeed var6 = MoveSpeed.field3119;
					int var7 = super.pathX[0];
					int var8 = super.pathY[0];
					int var9 = super.size * -5369856;
					CollisionMap var10 = var1.collisionMaps[var1.plane];
					if (var7 >= var9 && var7 < var10.method5952() - var9 && var8 >= var9 && var8 < var10.method5927() - var9 && var2 >= var9 && var2 < var10.method5952() - var9 && var3 >= var9 && var3 < var10.method5927() - var9) {
						int var11 = Client.field307.method6117(var7, var8, var9, Projectile.method1957(var2, var3), var10, true, Client.field597, Client.field610);
						if (var11 >= 1) {
							for (int var12 = 0; var12 < var11 - 1; ++var12) {
								var5.method2317(Client.field597[var12], Client.field610[var12], var6);
							}
						}
					}
				}

				this.method2317(var2, var3, var4);
			} else {
				this.method2328(var2, var3);
			}
		} else {
			this.method2328(var2, var3);
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "6"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		super.pathLength = 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-55"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-84"
	)
	boolean method2160(int var1) {
		return var1 >= 2048;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Lid;",
		garbageValue = "1989549654"
	)
	ItemComposition method2161(int var1) {
		return SceneTilePaint.ItemDefinition_get(var1 - 2048);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-63164875"
	)
	int method2196() {
		return this.footprintSize;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "-5"
	)
	static ArrayList method2208() {
		ArrayList var0 = new ArrayList();
		Iterator var1 = class335.midiRequests.iterator();

		while (var1.hasNext()) {
			MidiRequest var2 = (MidiRequest)var1.next();
			var0.add(var2);
		}

		return var0;
	}
}
