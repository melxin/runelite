import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cs")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	static WorldView field939;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lxp;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -2002832851
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1324474589
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("ae")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -704700789
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -529535623
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 83898945
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -523625911
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1423219917
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1902403931
	)
	int field923;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1721877
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -122288899
	)
	int field925;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -707485969
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 377092555
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 439374287
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -899307141
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("aw")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1053378599
	)
	@Export("team")
	int team;
	@ObfuscatedName("am")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1769464207
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lti;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lti;"
	)
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lti;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1347321433
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-565244070"
	)
	@Export("getX")
	public int getX() {
		return this.plane;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lwj;B)V",
		garbageValue = "-65"
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
				if (this.method2216(var5[var6])) {
					var10 = this.method2217(var5[var6]).team;
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
			if (var9 < 0 || var9 >= class323.field3544[var8].length) {
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

		this.username = new Username(var1.readStringCp1252NullTerminated(), class147.loginType);
		this.clearIsFriend();
		this.clearIsInFriendsChat();
		this.method2246();
		if (this == class159.localPlayer) {
			RunException.field6151 = this.username.getName();
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
						var22.field1946 = var1.readUnsignedShort();
						var22.field1945 = var1.readUnsignedShort();
					}

					if (var21) {
						var22.field1948 = var1.readUnsignedShort();
						var22.field1949 = var1.readUnsignedShort();
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

		this.appearance.method7536(var28, var5, var30, var32, var29, var2, var4, var31);
		if (var4 != -1) {
			super.size = class81.getNpcDefinition(var4).size;
		} else {
			super.size = 1;
		}

		this.footprintSize = (int)(0.4F * (float)(super.size * 128));
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Ljd;",
		garbageValue = "-461042632"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) {
			return null;
		} else {
			AnimationSequence var1 = this.method2443();
			AnimationSequence var2 = this.isUnanimated ? null : this.method2470(var1);
			if (var1 == null && var2 == null) {
				var2 = super.field1074;
				if (super.field1074.method9634(30)) {
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
					var7 = this.method2534(var7);
				}

				if (!this.isUnanimated && this.model0 != null) {
					if (Client.cycle >= this.animationCycleEnd) {
						this.model0 = null;
					}

					if (Client.cycle >= this.animationCycleStart && Client.cycle < this.animationCycleEnd) {
						Model var9 = this.model0;
						var9.offsetBy(this.field923 * 4096 - super.x, this.tileHeight2 - this.tileHeight, this.field925 * 4096 - super.y);
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

						var9.offsetBy(super.x - this.field923 * 4096, this.tileHeight - this.tileHeight2, super.y - this.field925 * 4096);
					}
				}

				var7.isSingleTile = true;
				if (super.field1071.method5733() && Client.cycle >= super.npcCycle && Client.cycle < super.field1041) {
					var7.method5547(super.field1071, (short)var8);
				} else {
					var7.method5568();
				}

				return var7;
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "16"
	)
	protected boolean vmethod5447() {
		if (this.appearance == null) {
			return false;
		} else if (this.model0 != null && this.model0.faceAlphas != null) {
			return true;
		} else if (this.method2540()) {
			return true;
		} else if (this.method2459()) {
			return true;
		} else {
			Model var1 = this.appearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
			return var1 != null && var1.faceAlphas != null;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-90"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) {
			this.checkIsFriend();
		}

		return this.isFriendTriBool == TriBool.TriBool_true;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2054977249"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-505303927"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = KitDefinition.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1105714872"
	)
	@Export("isFriendsChatMember")
	boolean isFriendsChatMember() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) {
			this.updateIsInFriendsChat();
		}

		return this.isInFriendsChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1234603466"
	)
	@Export("clearIsInFriendsChat")
	void clearIsInFriendsChat() {
		this.isInFriendsChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "13"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = class445.friendsChat != null && class445.friendsChat.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 4; ++var1) {
			if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method3983(this.username.getName()) != -1 && var1 != 2) {
				this.isInClanChat = TriBool.TriBool_true;
				return;
			}
		}

		this.isInClanChat = TriBool.TriBool_false;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1288026682"
	)
	void method2246() {
		this.isInClanChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-82"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) {
			this.updateIsInClanChat();
		}

		return this.isInClanChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ldm;IILkj;I)V",
		garbageValue = "2131577351"
	)
	final void method2213(WorldView var1, int var2, int var3, MoveSpeed var4) {
		if (super.animationSequence.isActive() && super.animationSequence.getSequenceDefinition().field2490 == 1) {
			this.method2446();
		}

		this.method2460();
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) {
				if (var4 == MoveSpeed.field3274) {
					TaskHandler.method5936(var1, this, var2, var3, MoveSpeed.field3274);
				}

				this.method2527(var2, var3, var4);
			} else {
				this.method2449(var2, var3);
			}
		} else {
			this.method2449(var2, var3);
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "491144928"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		super.pathLength = 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2136021980"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "353011009"
	)
	boolean method2216(int var1) {
		return var1 >= 2048;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Lig;",
		garbageValue = "-1295442705"
	)
	ItemComposition method2217(int var1) {
		return WorldMapIcon_1.ItemDefinition_get(var1 - 2048);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lic;",
		garbageValue = "1493429071"
	)
	protected class223 vmethod5439() {
		return class223.field2626;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1173982593"
	)
	int vmethod2813() {
		return this.method2538() ? 0 : this.footprintSize;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-1190176084"
	)
	@Export("addChatMessage")
	static void addChatMessage(int var0, String var1, String var2, String var3) {
		ChatChannel var4 = (ChatChannel)Messages.Messages_channels.get(var0);
		if (var4 == null) {
			var4 = new ChatChannel();
			Messages.Messages_channels.put(var0, var4);
		}

		Message var5 = var4.addMessage(var0, var1, var2, var3);
		Messages.Messages_hashTable.put(var5, (long)var5.count);
		Messages.Messages_queue.add(var5);
		Client.chatCycle = Client.cycleCntr;
	}

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2049919591"
	)
	static final void method2271(boolean var0) {
		StudioGame.method8201();
		++Client.packetWriter.pendingWrites;
		if (Client.packetWriter.pendingWrites >= 50 || var0) {
			Client.packetWriter.pendingWrites = 0;
			if (!Client.hadNetworkError && Client.packetWriter.getSocket() != null) {
				PacketBufferNode var1 = HorizontalAlignment.getPacketBufferNode(ClientPacket.NO_TIMEOUT, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var1);

				try {
					Client.packetWriter.flush();
				} catch (IOException var3) {
					Client.hadNetworkError = true;
				}
			}

		}
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(Ldm;IIIIISISIIB)V",
		garbageValue = "-67"
	)
	static void method2203(WorldView var0, int var1, int var2, int var3, int var4, int var5, short var6, int var7, short var8, int var9, int var10) {
		NodeDeque var11 = var0.groundItems[var1][var2][var3];
		if (var11 != null) {
			for (TileItem var12 = (TileItem)var11.last(); var12 != null; var12 = (TileItem)var11.previous()) {
				if ((var4 & 32767) == var12.id && var5 == var12.quantity) {
					PlayerCompositionColorTextureOverride var13 = var12.method2910();
					if (var13 == null) {
						var13 = new PlayerCompositionColorTextureOverride(var4);
					}

					if (var13.method4169() && var7 > -1 && var7 < var13.playerCompositionRecolorTo.length) {
						var13.playerCompositionRecolorTo[var7] = var6;
					}

					if (var13.method4170() && var9 > -1 && var9 < var13.playerCompositionRetextureTo.length) {
						var13.playerCompositionRetextureTo[var9] = var8;
					}

					if (var10 > -1) {
						var13.field1950 = var10;
						var13.field1942 = null;
					}

					var12.method2889(var13);
					break;
				}
			}

			class172.updateItemPile(var1, var2, var3);
		}

	}

	@ObfuscatedName("og")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-977385432"
	)
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) {
			PacketBufferNode var1 = HorizontalAlignment.getPacketBufferNode(ClientPacket.FRIEND_CHAT_JOIN_LEAVE, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(WorldMapArea.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}
