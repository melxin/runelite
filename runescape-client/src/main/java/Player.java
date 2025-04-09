import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("du")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lwp;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1905881129
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 253827547
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("av")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 991089863
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1061005675
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 227013689
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1550829017
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 285811645
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 714929875
	)
	int field1125;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1807738767
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1213661629
	)
	int field1133;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -2079885409
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1920029865
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -346779923
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1856939291
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("ai")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1634679211
	)
	@Export("team")
	int team;
	@ObfuscatedName("ah")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -149578855
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lsd;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lsd;"
	)
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Lsd;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;

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

		for (int var2 = 0; var2 < 3; ++var2) {
			this.actions[var2] = "";
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lve;I)V",
		garbageValue = "1602470721"
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
				if (this.method2546(var5[var6])) {
					var10 = this.method2516(var5[var6]).team;
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
			if (var9 < 0 || var9 >= PlayerComposition.field3878[var8].length) {
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

		this.username = new Username(var1.readStringCp1252NullTerminated(), class339.loginType);
		this.clearIsFriend();
		this.clearIsInFriendsChat();
		this.method2509();
		if (this == Script.localPlayer) {
			RunException.field5759 = this.username.getName();
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
					var15[var11] = Message.method1223(var5[var11] - 2048, var1);
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

		this.appearance.method7060(var13, var5, var15, var17, var14, var2, var4, var16);
		if (var4 != -1) {
			super.size = class232.getNpcDefinition(var4).size;
		} else {
			super.size = 1;
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Lhe;",
		garbageValue = "-1407261867"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? class91.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.idleSequence == super.movementSequence && var1 != null ? null : class91.SequenceDefinition_get(super.movementSequence);
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				int var4 = var3.indicesCount;
				if (!this.isUnanimated) {
					var3 = this.method2649(var3);
				}

				if (!this.isUnanimated && this.model0 != null) {
					if (Client.cycle >= this.animationCycleEnd) {
						this.model0 = null;
					}

					if (Client.cycle >= this.animationCycleStart && Client.cycle < this.animationCycleEnd) {
						Model var5 = this.model0;
						var5.offsetBy(this.field1125 * 4096 - super.x, this.tileHeight2 - this.tileHeight, this.field1133 * 4096 - super.y);
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

						var5.offsetBy(super.x - this.field1125 * 4096, this.tileHeight - this.tileHeight2, super.y - this.field1133 * 4096);
					}
				}

				var3.isSingleTile = true;
				if (super.field1220.method4575() && Client.cycle >= super.npcCycle && Client.cycle < super.field1226) {
					var3.method4491(super.field1220, (short)var4);
				} else {
					var3.method4442();
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1225890913"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) {
			this.checkIsFriend();
		}

		return this.isFriendTriBool == TriBool.TriBool_true;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2041381932"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1082747558"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = class223.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-27"
	)
	@Export("isFriendsChatMember")
	boolean isFriendsChatMember() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) {
			this.updateIsInFriendsChat();
		}

		return this.isInFriendsChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "163102415"
	)
	@Export("clearIsInFriendsChat")
	void clearIsInFriendsChat() {
		this.isInFriendsChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1084916564"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = SoundCache.friendsChat != null && SoundCache.friendsChat.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-92"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 4; ++var1) {
			if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method3557(this.username.getName()) != -1 && var1 != 2) {
				this.isInClanChat = TriBool.TriBool_true;
				return;
			}
		}

		this.isInClanChat = TriBool.TriBool_false;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1931065027"
	)
	void method2509() {
		this.isInClanChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-767255833"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) {
			this.updateIsInClanChat();
		}

		return this.isInClanChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ldj;IILkw;I)V",
		garbageValue = "-1383801875"
	)
	final void method2512(WorldView var1, int var2, int var3, MoveSpeed var4) {
		if (super.sequence != -1 && class91.SequenceDefinition_get(super.sequence).field3000 == 1) {
			super.sequence = -1;
		}

		this.method2693();
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) {
				if (var4 == MoveSpeed.field3127) {
					AABB.method4317(var1, this, var2, var3, MoveSpeed.field3127);
				}

				this.method2639(var2, var3, var4);
			} else {
				this.method2640(var2, var3);
			}
		} else {
			this.method2640(var2, var3);
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1517175045"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		super.pathLength = 0;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "497971202"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2051616751"
	)
	boolean method2546(int var1) {
		return var1 >= 2048;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Lkv;",
		garbageValue = "-1508657159"
	)
	ItemComposition method2516(int var1) {
		return class231.ItemDefinition_get(var1 - 2048);
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "80"
	)
	@Export("loadRegion")
	static final void loadRegion() {
		class157.method3539(false);
		Client.field631 = 0;
		boolean var0 = true;

		int var1;
		for (var1 = 0; var1 < class149.regionLandArchives.length; ++var1) {
			if (ArchiveLoader.regionMapArchiveIds[var1] != -1 && class149.regionLandArchives[var1] == null) {
				class149.regionLandArchives[var1] = class161.archive9.takeFile(ArchiveLoader.regionMapArchiveIds[var1], 0);
				if (class149.regionLandArchives[var1] == null) {
					var0 = false;
					++Client.field631;
				}
			}

			if (ClanChannelMember.regionLandArchiveIds[var1] != -1 && WorldMapSection1.regionMapArchives[var1] == null) {
				WorldMapSection1.regionMapArchives[var1] = class161.archive9.takeFileEncrypted(ClanChannelMember.regionLandArchiveIds[var1], 0, PacketBufferNode.xteaKeys[var1]);
				if (WorldMapSection1.regionMapArchives[var1] == null) {
					var0 = false;
					++Client.field631;
				}
			}
		}

		if (!var0) {
			Client.field599 = 1;
		} else {
			Client.field597 = 0;
			var0 = true;

			int var3;
			int var4;
			for (var1 = 0; var1 < class149.regionLandArchives.length; ++var1) {
				byte[] var17 = WorldMapSection1.regionMapArchives[var1];
				if (var17 != null) {
					var3 = (class377.regions[var1] >> 8) * 64 - class509.topLevelWorldView.baseX;
					var4 = (class377.regions[var1] & 255) * 64 - class509.topLevelWorldView.baseY;
					if (Client.isInInstance) {
						var3 = 10;
						var4 = 10;
					}

					var0 &= class235.method5048(var17, var3, var4);
				}
			}

			if (!var0) {
				Client.field599 = 2;
			} else {
				if (Client.field599 != 0) {
					NpcOverrides.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				class362.method7337();
				class509.topLevelWorldView.scene.clearTempGameObjects();

				for (var1 = 0; var1 < 4; ++var1) {
					class509.topLevelWorldView.collisionMaps[var1].clear();
				}

				int var2;
				for (var1 = 0; var1 < 4; ++var1) {
					for (var2 = 0; var2 < 104; ++var2) {
						for (var3 = 0; var3 < 104; ++var3) {
							class509.topLevelWorldView.tileSettings[var1][var2][var3] = 0;
						}
					}
				}

				class362.method7337();
				class36.method710();
				var1 = class149.regionLandArchives.length;
				class521.method9686();
				class157.method3539(true);
				int var5;
				if (!Client.isInInstance) {
					byte[] var16;
					for (var2 = 0; var2 < var1; ++var2) {
						var3 = (class377.regions[var2] >> 8) * 64 - class509.topLevelWorldView.baseX;
						var4 = (class377.regions[var2] & 255) * 64 - class509.topLevelWorldView.baseY;
						var16 = class149.regionLandArchives[var2];
						if (var16 != null) {
							class362.method7337();
							class1.method12(class509.topLevelWorldView, var16, var3, var4, class137.field1641 * 8 - 48, WidgetDefinition.field3856 * 8 - 48);
						}
					}

					for (var2 = 0; var2 < var1; ++var2) {
						var3 = (class377.regions[var2] >> 8) * 64 - class509.topLevelWorldView.baseX;
						var4 = (class377.regions[var2] & 255) * 64 - class509.topLevelWorldView.baseY;
						var16 = class149.regionLandArchives[var2];
						if (var16 == null && WidgetDefinition.field3856 < 800) {
							class362.method7337();
							PlayerType.method7585(class509.topLevelWorldView, var3, var4, 64, 64);
						}
					}

					class157.method3539(true);

					for (var2 = 0; var2 < var1; ++var2) {
						byte[] var15 = WorldMapSection1.regionMapArchives[var2];
						if (var15 != null) {
							var4 = (class377.regions[var2] >> 8) * 64 - class509.topLevelWorldView.baseX;
							var5 = (class377.regions[var2] & 255) * 64 - class509.topLevelWorldView.baseY;
							class362.method7337();
							ServerPacket.method6560(class509.topLevelWorldView, var15, var4, var5);
						}
					}
				}

				int var6;
				int var7;
				int var8;
				if (Client.isInInstance) {
					int var9;
					int var10;
					int var11;
					for (var2 = 0; var2 < 4; ++var2) {
						class362.method7337();

						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								boolean var18 = false;
								var6 = Client.instanceChunkTemplates[var2][var3][var4];
								if (var6 != -1) {
									var7 = var6 >> 24 & 3;
									var8 = var6 >> 1 & 3;
									var9 = var6 >> 14 & 1023;
									var10 = var6 >> 3 & 2047;
									var11 = (var9 / 8 << 8) + var10 / 8;

									for (int var12 = 0; var12 < class377.regions.length; ++var12) {
										if (class377.regions[var12] == var11 && class149.regionLandArchives[var12] != null) {
											int var13 = (var9 - var3) * 8;
											int var14 = (var10 - var4) * 8;
											class325.method6545(class509.topLevelWorldView, class149.regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, var13, var14);
											var18 = true;
											break;
										}
									}
								}

								if (!var18) {
									MusicPatch.method6824(class509.topLevelWorldView.tileHeights, var2, var3 * 8, var4 * 8);
								}
							}
						}
					}

					for (var2 = 0; var2 < 13; ++var2) {
						for (var3 = 0; var3 < 13; ++var3) {
							var4 = Client.instanceChunkTemplates[0][var2][var3];
							if (var4 == -1) {
								PlayerType.method7585(class509.topLevelWorldView, var2 * 8, var3 * 8, 8, 8);
							}
						}
					}

					class157.method3539(true);

					for (var2 = 0; var2 < 4; ++var2) {
						class362.method7337();

						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								var5 = Client.instanceChunkTemplates[var2][var3][var4];
								if (var5 != -1) {
									var6 = var5 >> 24 & 3;
									var7 = var5 >> 1 & 3;
									var8 = var5 >> 14 & 1023;
									var9 = var5 >> 3 & 2047;
									var10 = (var8 / 8 << 8) + var9 / 8;

									for (var11 = 0; var11 < class377.regions.length; ++var11) {
										if (class377.regions[var11] == var10 && WorldMapSection1.regionMapArchives[var11] != null) {
											Tiles.method2385(class509.topLevelWorldView, WorldMapSection1.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7);
											break;
										}
									}
								}
							}
						}
					}
				}

				class157.method3539(true);
				class362.method7337();
				Clock.method4982(class509.topLevelWorldView);
				class157.method3539(true);
				var2 = Tiles.Tiles_minPlane;
				if (var2 > class509.topLevelWorldView.plane) {
					var2 = class509.topLevelWorldView.plane;
				}

				if (var2 < class509.topLevelWorldView.plane - 1) {
					var2 = class509.topLevelWorldView.plane - 1;
				}

				if (Client.isLowDetail) {
					class509.topLevelWorldView.scene.init(Tiles.Tiles_minPlane);
				} else {
					class509.topLevelWorldView.scene.init(0);
				}

				for (var3 = 0; var3 < 104; ++var3) {
					for (var4 = 0; var4 < 104; ++var4) {
						HitSplatDefinition.updateItemPile3(class509.topLevelWorldView, var3, var4);
					}
				}

				class362.method7337();
				class162.method3657();
				ObjectComposition.ObjectDefinition_cachedModelData.clear();
				PacketBufferNode var19;
				if (SecureRandomCallable.client.hasFrame()) {
					var19 = FloorDecoration.getPacketBufferNode(ClientPacket.field3448, Client.packetWriter.isaacCipher);
					var19.packetBuffer.writeInt(1057001181);
					Client.packetWriter.addNode(var19);
				}

				if (!Client.isInInstance) {
					var3 = (class137.field1641 - 6) / 8;
					var4 = (class137.field1641 + 6) / 8;
					var5 = (WidgetDefinition.field3856 - 6) / 8;
					var6 = (WidgetDefinition.field3856 + 6) / 8;

					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) {
						for (var8 = var5 - 1; var8 <= var6 + 1; ++var8) {
							if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) {
								class161.archive9.loadRegionFromName("m" + var7 + "_" + var8);
								class161.archive9.loadRegionFromName("l" + var7 + "_" + var8);
							}
						}
					}
				}

				class362.method7337();
				Widget.method7392();
				var19 = FloorDecoration.getPacketBufferNode(ClientPacket.field3429, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var19);
				WorldMapRectangle.method6333();
				Client.field706 = false;
			}
		}
	}
}
