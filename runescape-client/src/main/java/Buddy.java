import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("tm")
@Implements("Buddy")
public class Buddy extends User {
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1914416777
	)
	@Export("world")
	public int world;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -529820201
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 91500301
	)
	@Export("rank")
	public int rank;

	Buddy() {
		this.world = -1;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "3567"
	)
	@Export("set")
	void set(int var1, int var2) {
		this.world = var1;
		this.int2 = var2;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1864841334"
	)
	@Export("getWorld")
	public int getWorld() {
		return this.world;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "937210184"
	)
	@Export("hasWorld")
	public boolean hasWorld() {
		return this.world > 0;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-519592981"
	)
	public static int method10379(int var0) {
		return var0 >>> 12;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ILcu;ZB)I",
		garbageValue = "114"
	)
	static int method10385(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) {
			if (class320.friendSystem.field599 == 0) {
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = -2;
			} else if (class320.friendSystem.field599 == 1) {
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = class320.friendSystem.friendsList.getSize();
			}

			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
				if (class320.friendSystem.method1591() && var3 >= 0 && var3 < class320.friendSystem.friendsList.getSize()) {
					Friend var8 = (Friend)class320.friendSystem.friendsList.get(var3);
					Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var8.getName();
					Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var8.getPreviousName();
				} else {
					Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
					Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
				if (class320.friendSystem.method1591() && var3 >= 0 && var3 < class320.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = ((Buddy)class320.friendSystem.friendsList.get(var3)).world;
				} else {
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
				if (class320.friendSystem.method1591() && var3 >= 0 && var3 < class320.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = ((Buddy)class320.friendSystem.friendsList.get(var3)).rank;
				} else {
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
					int var9 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
					Clock.method5247(var5, var9);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
					class320.friendSystem.addFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
					class320.friendSystem.removeFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
					class320.friendSystem.addIgnore(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
					boolean var6 = true;
					class320.friendSystem.removeIgnore(var5, var6);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
					var5 = class117.method3622(var5);
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = class320.friendSystem.isFriended(new Username(var5, LoginScreenAnimation.loginType), false) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (BuddyRankComparator.friendsChat != null) {
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = BuddyRankComparator.friendsChat.name;
					} else {
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (BuddyRankComparator.friendsChat != null) {
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = BuddyRankComparator.friendsChat.getSize();
					} else {
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
					if (BuddyRankComparator.friendsChat != null && var3 < BuddyRankComparator.friendsChat.getSize()) {
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = BuddyRankComparator.friendsChat.get(var3).getUsername().getName();
					} else {
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
					if (BuddyRankComparator.friendsChat != null && var3 < BuddyRankComparator.friendsChat.getSize()) {
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = ((Buddy)BuddyRankComparator.friendsChat.get(var3)).getWorld();
					} else {
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
					if (BuddyRankComparator.friendsChat != null && var3 < BuddyRankComparator.friendsChat.getSize()) {
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = ((Buddy)BuddyRankComparator.friendsChat.get(var3)).rank;
					} else {
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = BuddyRankComparator.friendsChat != null ? BuddyRankComparator.friendsChat.minKick : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
					class57.clanKickUser(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = BuddyRankComparator.friendsChat != null ? BuddyRankComparator.friendsChat.rank : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
					IntProjection.Clan_joinChat(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					class195.Clan_leaveChat();
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!class320.friendSystem.method1591()) {
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = class320.friendSystem.ignoreList.getSize();
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
					if (class320.friendSystem.method1591() && var3 >= 0 && var3 < class320.friendSystem.ignoreList.getSize()) {
						Ignored var4 = (Ignored)class320.friendSystem.ignoreList.get(var3);
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var4.getName();
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var4.getPreviousName();
					} else {
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
					var5 = class117.method3622(var5);
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = class320.friendSystem.isIgnored(new Username(var5, LoginScreenAnimation.loginType)) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
					if (BuddyRankComparator.friendsChat != null && var3 < BuddyRankComparator.friendsChat.getSize() && BuddyRankComparator.friendsChat.get(var3).getUsername().equals(class330.localPlayer.username)) {
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (BuddyRankComparator.friendsChat != null && BuddyRankComparator.friendsChat.owner != null) {
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = BuddyRankComparator.friendsChat.owner;
					} else {
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
					if (BuddyRankComparator.friendsChat != null && var3 < BuddyRankComparator.friendsChat.getSize() && ((ClanMate)BuddyRankComparator.friendsChat.get(var3)).isFriend()) {
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						class320.friendSystem.friendsList.removeComparator();
						return 1;
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
							class320.friendSystem.friendsList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
							class320.friendSystem.friendsList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
							class320.friendSystem.friendsList.addComparator(new UserComparator3(var7));
							return 1;
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
							class320.friendSystem.friendsList.addComparator(new UserComparator4(var7));
							return 1;
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
							class320.friendSystem.friendsList.addComparator(new UserComparator5(var7));
							return 1;
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
							class320.friendSystem.friendsList.addComparator(new UserComparator6(var7));
							return 1;
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
							class320.friendSystem.friendsList.addComparator(new UserComparator7(var7));
							return 1;
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
							class320.friendSystem.friendsList.addComparator(new UserComparator8(var7));
							return 1;
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
							class320.friendSystem.friendsList.addComparator(new UserComparator9(var7));
							return 1;
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
							class320.friendSystem.friendsList.addComparator(new UserComparator10(var7));
							return 1;
						} else if (var0 == 3639) {
							class320.friendSystem.friendsList.sort();
							return 1;
						} else if (var0 == 3640) {
							class320.friendSystem.ignoreList.removeComparator();
							return 1;
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
							class320.friendSystem.ignoreList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
							class320.friendSystem.ignoreList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3643) {
							class320.friendSystem.ignoreList.sort();
							return 1;
						} else if (var0 == 3644) {
							if (BuddyRankComparator.friendsChat != null) {
								BuddyRankComparator.friendsChat.removeComparator();
							}

							return 1;
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
							if (BuddyRankComparator.friendsChat != null) {
								BuddyRankComparator.friendsChat.addComparator(new UserComparator1(var7));
							}

							return 1;
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
							if (BuddyRankComparator.friendsChat != null) {
								BuddyRankComparator.friendsChat.addComparator(new UserComparator2(var7));
							}

							return 1;
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
							if (BuddyRankComparator.friendsChat != null) {
								BuddyRankComparator.friendsChat.addComparator(new UserComparator3(var7));
							}

							return 1;
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
							if (BuddyRankComparator.friendsChat != null) {
								BuddyRankComparator.friendsChat.addComparator(new UserComparator4(var7));
							}

							return 1;
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
							if (BuddyRankComparator.friendsChat != null) {
								BuddyRankComparator.friendsChat.addComparator(new UserComparator5(var7));
							}

							return 1;
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
							if (BuddyRankComparator.friendsChat != null) {
								BuddyRankComparator.friendsChat.addComparator(new UserComparator6(var7));
							}

							return 1;
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
							if (BuddyRankComparator.friendsChat != null) {
								BuddyRankComparator.friendsChat.addComparator(new UserComparator7(var7));
							}

							return 1;
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
							if (BuddyRankComparator.friendsChat != null) {
								BuddyRankComparator.friendsChat.addComparator(new UserComparator8(var7));
							}

							return 1;
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
							if (BuddyRankComparator.friendsChat != null) {
								BuddyRankComparator.friendsChat.addComparator(new UserComparator9(var7));
							}

							return 1;
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
							if (BuddyRankComparator.friendsChat != null) {
								BuddyRankComparator.friendsChat.addComparator(new UserComparator10(var7));
							}

							return 1;
						} else if (var0 == 3655) {
							if (BuddyRankComparator.friendsChat != null) {
								BuddyRankComparator.friendsChat.sort();
							}

							return 1;
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
							class320.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7));
							return 1;
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
							if (BuddyRankComparator.friendsChat != null) {
								BuddyRankComparator.friendsChat.addComparator(new BuddyRankComparator(var7));
							}

							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
					if (BuddyRankComparator.friendsChat != null && var3 < BuddyRankComparator.friendsChat.getSize() && ((ClanMate)BuddyRankComparator.friendsChat.get(var3)).isIgnored()) {
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				}
			}
		}
	}
}
