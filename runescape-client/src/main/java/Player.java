import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dy")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lwo;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -113577289
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -2037552605
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("ac")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 38339801
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1274508483
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 770657661
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1327416351
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 76571783
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -540925547
	)
	int field1147;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1339792717
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -152700583
	)
	int field1143;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 86233563
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1260796165
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -608796025
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1721878789
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("ay")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1997583323
	)
	@Export("team")
	int team;
	@ObfuscatedName("aa")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -824443291
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -872464157
	)
	@Export("index")
	int index;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lsx;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lsx;"
	)
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lsx;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
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
		this.worldView = HttpRequest.topLevelWorldView;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Ljt;",
		garbageValue = "-1562991930"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? HealthBarDefinition.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.movementSequence == super.idleSequence && var1 != null ? null : HealthBarDefinition.SequenceDefinition_get(super.movementSequence);
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
						var5.offsetBy(this.field1147 * 4096 - super.x, this.tileHeight2 - this.tileHeight, this.field1143 * 4096 - super.y);
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

						var5.offsetBy(super.x - this.field1147 * 4096, this.tileHeight - this.tileHeight2, super.y - this.field1143 * 4096);
					}
				}

				var3.isSingleTile = true;
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
		descriptor = "(Lvj;I)V",
		garbageValue = "-676266222"
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
				if (this.method2557(var5[var6])) {
					var10 = this.method2538(var5[var6]).team;
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
			if (var9 < 0 || var9 >= class182.field1880[var8].length) {
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

		this.username = new Username(var1.readStringCp1252NullTerminated(), class28.loginType);
		this.clearIsFriend();
		this.clearIsInFriendsChat();
		this.method2530();
		if (this == AsyncHttpResponse.localPlayer) {
			RunException.field5640 = this.username.getName();
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
					var15[var11] = TileItem.method3008(var5[var11] - 2048, var1);
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

		this.appearance.method6901(var13, var5, var15, var17, var14, var2, var4, var16);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1892610967"
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
		descriptor = "(I)V",
		garbageValue = "1591895376"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "51"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = InterfaceParent.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-19"
	)
	@Export("isFriendsChatMember")
	boolean isFriendsChatMember() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) {
			this.updateIsInFriendsChat();
		}

		return this.isInFriendsChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "12"
	)
	@Export("clearIsInFriendsChat")
	void clearIsInFriendsChat() {
		this.isInFriendsChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-700478237"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = class178.friendsChat != null && class178.friendsChat.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-980249771"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 4; ++var1) {
			if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method3553(this.username.getName()) != -1 && var1 != 2) {
				this.isInClanChat = TriBool.TriBool_true;
				return;
			}
		}

		this.isInClanChat = TriBool.TriBool_false;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-25"
	)
	void method2530() {
		this.isInClanChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "62"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) {
			this.updateIsInClanChat();
		}

		return this.isInClanChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1182368638"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? DynamicObject.getNpcDefinition(this.appearance.npcTransformId).size : 1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ldm;IILkq;B)V",
		garbageValue = "-102"
	)
	final void method2533(WorldView var1, int var2, int var3, MoveSpeed var4) {
		if (super.sequence != -1 && HealthBarDefinition.SequenceDefinition_get(super.sequence).field2312 == 1) {
			super.sequence = -1;
		}

		this.method2650();
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) {
				if (var4 == MoveSpeed.field3073) {
					Player var5 = this;
					MoveSpeed var6 = MoveSpeed.field3073;
					int var7 = super.pathX[0];
					int var8 = super.pathY[0];
					int var9 = this.transformedSize();
					CollisionMap var10 = var1.collisionMaps[var1.plane];
					if (var7 >= var9 && var7 < var10.xSize - var9 && var8 >= var9 && var8 < var10.ySize - var9 && var2 >= var9 && var2 < var10.xSize - var9 && var3 >= var9 && var3 < var10.ySize - var9) {
						int var11 = Client.field517.method5760(var7, var8, this.transformedSize(), LoginState.method1232(var2, var3), var10, true, Client.field810, Client.field811);
						if (var11 >= 1) {
							for (int var12 = 0; var12 < var11 - 1; ++var12) {
								var5.method2535(Client.field810[var12], Client.field811[var12], var6);
							}
						}
					}
				}

				this.method2535(var2, var3, var4);
			} else {
				this.resetPath(var2, var3);
			}
		} else {
			this.resetPath(var2, var3);
		}

	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1334794552"
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

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(IILkq;I)V",
		garbageValue = "-1752940884"
	)
	final void method2535(int var1, int var2, MoveSpeed var3) {
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

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1426757895"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "50"
	)
	boolean method2557(int var1) {
		return var1 >= 2048;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(II)Liq;",
		garbageValue = "-778465186"
	)
	ItemComposition method2538(int var1) {
		return WorldEntityCoord.ItemDefinition_get(var1 - 2048);
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "-854780281"
	)
	static int method2584(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) {
			PrivateChatMode.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
			var9 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
			EnumComposition var10 = ClanChannelMember.getEnum(var3);
			if (var10.outputType != 's') {
			}

			for (var6 = 0; var6 < var10.outputCount; ++var6) {
				if (var9 == var10.keys[var6]) {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var10.strVals[var6];
					var10 = null;
					break;
				}
			}

			if (var10 != null) {
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var10.defaultStr;
			}

			return 1;
		} else if (var0 != ScriptOpcodes.ENUM) {
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) {
				var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
				EnumComposition var4 = ClanChannelMember.getEnum(var3);
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var4.size();
				return 1;
			} else {
				return 2;
			}
		} else {
			PrivateChatMode.Interpreter_intStackSize -= 4;
			var3 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
			var9 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
			int var5 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 2];
			var6 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 3];
			EnumComposition var7 = ClanChannelMember.getEnum(var5);
			if (var3 == var7.inputType && var9 == var7.outputType) {
				for (int var8 = 0; var8 < var7.outputCount; ++var8) {
					if (var6 == var7.keys[var8]) {
						if (var9 == 115) {
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var7.intVals[var8];
						}

						var7 = null;
						break;
					}
				}

				if (var7 != null) {
					if (var9 == 115) {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var7.defaultInt;
					}
				}

				return 1;
			} else {
				if (var9 == 115) {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "-2067680735"
	)
	static int method2573(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) {
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = class93.getWindowedMode();
			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) {
				var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					MusicPatchNode.setWindowedMode(var3);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) {
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = SecureUrlRequester.clientPreferences.getWindowMode();
				return 1;
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) {
				if (var0 == 5310) {
					--PrivateChatMode.Interpreter_intStackSize;
					return 1;
				} else {
					return 2;
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					SecureUrlRequester.clientPreferences.updateWindowMode(var3);
				}

				return 1;
			}
		}
	}
}
