import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("pz")
@Implements("ModeWhere")
public enum ModeWhere implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpz;"
	)
	field4701("", 0, new class403[]{class403.field4670, class403.field4667}),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpz;"
	)
	field4692("", 1, new class403[]{class403.field4669, class403.field4670, class403.field4667}),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpz;"
	)
	field4699("", 2, new class403[]{class403.field4669, class403.field4668, class403.field4670}),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lpz;"
	)
	field4700("", 3, new class403[]{class403.field4669}),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lpz;"
	)
	field4691("", 4),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpz;"
	)
	field4696("", 5, new class403[]{class403.field4669, class403.field4670}),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lpz;"
	)
	field4693("", 6, new class403[]{class403.field4670}),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lpz;"
	)
	field4698("", 8, new class403[]{class403.field4669, class403.field4670}),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lpz;"
	)
	field4694("", 9, new class403[]{class403.field4669, class403.field4668}),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lpz;"
	)
	field4697("", 10, new class403[]{class403.field4669}),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpz;"
	)
	field4695("", 11, new class403[]{class403.field4669}),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lpz;"
	)
	field4702("", 12, new class403[]{class403.field4669, class403.field4670}),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lpz;"
	)
	field4703("", 13, new class403[]{class403.field4669});

	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 612732897
	)
	@Export("id")
	final int id;
	@ObfuscatedName("as")
	final Set field4705;

	static {
		method7804();
	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Lpu;)V"
	)
	ModeWhere(String var3, int var4, class403[] var5) {
		this.field4705 = new HashSet();
		this.id = var4;
		class403[] var6 = var5;

		for (int var7 = 0; var7 < var6.length; ++var7) {
			class403 var8 = var6[var7];
			this.field4705.add(var8);
		}

	}

	ModeWhere(String var3, int var4) {
		this.field4705 = new HashSet();
		this.id = var4;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1071289392"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[Lpz;",
		garbageValue = "350701871"
	)
	static ModeWhere[] method7804() {
		return new ModeWhere[]{field4693, field4702, field4691, field4694, field4698, field4701, field4697, field4699, field4692, field4700, field4696, field4695, field4703};
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1608793253"
	)
	static void method7810(String var0) {
		Login.displayName = WorldMapArea.method5908(var0);
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "-1164324259"
	)
	static int method7809(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) {
			if (InterfaceParent.friendSystem.field839 == 0) {
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = -2;
			} else if (InterfaceParent.friendSystem.field839 == 1) {
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = InterfaceParent.friendSystem.friendsList.getSize();
			}

			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
				if (InterfaceParent.friendSystem.method1934() && var3 >= 0 && var3 < InterfaceParent.friendSystem.friendsList.getSize()) {
					Friend var8 = (Friend)InterfaceParent.friendSystem.friendsList.get(var3);
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var8.getName();
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var8.getPreviousName();
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
				if (InterfaceParent.friendSystem.method1934() && var3 >= 0 && var3 < InterfaceParent.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = ((Buddy)InterfaceParent.friendSystem.friendsList.get(var3)).world;
				} else {
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
				if (InterfaceParent.friendSystem.method1934() && var3 >= 0 && var3 < InterfaceParent.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = ((Buddy)InterfaceParent.friendSystem.friendsList.get(var3)).rank;
				} else {
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					int var9 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
					DirectByteArrayCopier.method7439(var5, var9);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					InterfaceParent.friendSystem.addFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					InterfaceParent.friendSystem.removeFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					InterfaceParent.friendSystem.addIgnore(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					boolean var6 = true;
					InterfaceParent.friendSystem.removeIgnore(var5, var6);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					var5 = class135.method3315(var5);
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = InterfaceParent.friendSystem.isFriended(new Username(var5, class28.loginType), false) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (class178.friendsChat != null) {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class178.friendsChat.name;
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (class178.friendsChat != null) {
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = class178.friendsChat.getSize();
					} else {
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
					if (class178.friendsChat != null && var3 < class178.friendsChat.getSize()) {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class178.friendsChat.get(var3).getUsername().getName();
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
					if (class178.friendsChat != null && var3 < class178.friendsChat.getSize()) {
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = ((Buddy)class178.friendsChat.get(var3)).getWorld();
					} else {
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
					if (class178.friendsChat != null && var3 < class178.friendsChat.getSize()) {
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = ((Buddy)class178.friendsChat.get(var3)).rank;
					} else {
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = class178.friendsChat != null ? class178.friendsChat.minKick : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					class88.clanKickUser(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = class178.friendsChat != null ? class178.friendsChat.rank : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					class278.Clan_joinChat(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					class373.Clan_leaveChat();
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!InterfaceParent.friendSystem.method1934()) {
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = InterfaceParent.friendSystem.ignoreList.getSize();
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
					if (InterfaceParent.friendSystem.method1934() && var3 >= 0 && var3 < InterfaceParent.friendSystem.ignoreList.getSize()) {
						Ignored var4 = (Ignored)InterfaceParent.friendSystem.ignoreList.get(var3);
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getName();
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getPreviousName();
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					var5 = class135.method3315(var5);
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = InterfaceParent.friendSystem.isIgnored(new Username(var5, class28.loginType)) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
					if (class178.friendsChat != null && var3 < class178.friendsChat.getSize() && class178.friendsChat.get(var3).getUsername().equals(AsyncHttpResponse.localPlayer.username)) {
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (class178.friendsChat != null && class178.friendsChat.owner != null) {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class178.friendsChat.owner;
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
					if (class178.friendsChat != null && var3 < class178.friendsChat.getSize() && ((ClanMate)class178.friendsChat.get(var3)).isFriend()) {
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						InterfaceParent.friendSystem.friendsList.removeComparator();
						return 1;
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
							InterfaceParent.friendSystem.friendsList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
							InterfaceParent.friendSystem.friendsList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
							InterfaceParent.friendSystem.friendsList.addComparator(new UserComparator3(var7));
							return 1;
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
							InterfaceParent.friendSystem.friendsList.addComparator(new UserComparator4(var7));
							return 1;
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
							InterfaceParent.friendSystem.friendsList.addComparator(new UserComparator5(var7));
							return 1;
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
							InterfaceParent.friendSystem.friendsList.addComparator(new UserComparator6(var7));
							return 1;
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
							InterfaceParent.friendSystem.friendsList.addComparator(new UserComparator7(var7));
							return 1;
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
							InterfaceParent.friendSystem.friendsList.addComparator(new UserComparator8(var7));
							return 1;
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
							InterfaceParent.friendSystem.friendsList.addComparator(new UserComparator9(var7));
							return 1;
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
							InterfaceParent.friendSystem.friendsList.addComparator(new UserComparator10(var7));
							return 1;
						} else if (var0 == 3639) {
							InterfaceParent.friendSystem.friendsList.sort();
							return 1;
						} else if (var0 == 3640) {
							InterfaceParent.friendSystem.ignoreList.removeComparator();
							return 1;
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
							InterfaceParent.friendSystem.ignoreList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
							InterfaceParent.friendSystem.ignoreList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3643) {
							InterfaceParent.friendSystem.ignoreList.sort();
							return 1;
						} else if (var0 == 3644) {
							if (class178.friendsChat != null) {
								class178.friendsChat.removeComparator();
							}

							return 1;
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
							if (class178.friendsChat != null) {
								class178.friendsChat.addComparator(new UserComparator1(var7));
							}

							return 1;
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
							if (class178.friendsChat != null) {
								class178.friendsChat.addComparator(new UserComparator2(var7));
							}

							return 1;
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
							if (class178.friendsChat != null) {
								class178.friendsChat.addComparator(new UserComparator3(var7));
							}

							return 1;
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
							if (class178.friendsChat != null) {
								class178.friendsChat.addComparator(new UserComparator4(var7));
							}

							return 1;
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
							if (class178.friendsChat != null) {
								class178.friendsChat.addComparator(new UserComparator5(var7));
							}

							return 1;
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
							if (class178.friendsChat != null) {
								class178.friendsChat.addComparator(new UserComparator6(var7));
							}

							return 1;
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
							if (class178.friendsChat != null) {
								class178.friendsChat.addComparator(new UserComparator7(var7));
							}

							return 1;
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
							if (class178.friendsChat != null) {
								class178.friendsChat.addComparator(new UserComparator8(var7));
							}

							return 1;
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
							if (class178.friendsChat != null) {
								class178.friendsChat.addComparator(new UserComparator9(var7));
							}

							return 1;
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
							if (class178.friendsChat != null) {
								class178.friendsChat.addComparator(new UserComparator10(var7));
							}

							return 1;
						} else if (var0 == 3655) {
							if (class178.friendsChat != null) {
								class178.friendsChat.sort();
							}

							return 1;
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
							InterfaceParent.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7));
							return 1;
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
							if (class178.friendsChat != null) {
								class178.friendsChat.addComparator(new BuddyRankComparator(var7));
							}

							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
					if (class178.friendsChat != null && var3 < class178.friendsChat.getSize() && ((ClanMate)class178.friendsChat.get(var3)).isIgnored()) {
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "(Lcx;III)V",
		garbageValue = "-1480545856"
	)
	static final void method7808(MenuAction var0, int var1, int var2) {
		if (var0 != null) {
			SecureRandomFuture.menuAction(var0.param0, var0.param1, var0.opcode, var0.identifier, var0.itemId, var0.worldViewId, var0.action, var0.target, var1, var2);
		}

	}
}
