import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("qv")
public class class439 {
	@ObfuscatedName("al")
	@Export("cp1252AsciiExtension")
	public static final char[] cp1252AsciiExtension;

	static {
		cp1252AsciiExtension = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'};
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ILce;ZS)I",
		garbageValue = "-22137"
	)
	static int method8907(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) {
			if (class137.friendSystem.field623 == 0) {
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = -2;
			} else if (class137.friendSystem.field623 == 1) {
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = class137.friendSystem.friendsList.getSize();
			}

			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
				if (class137.friendSystem.method1550() && var3 >= 0 && var3 < class137.friendSystem.friendsList.getSize()) {
					Friend var8 = (Friend)class137.friendSystem.friendsList.get(var3);
					Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var8.getName();
					Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var8.getPreviousName();
				} else {
					Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
					Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
				if (class137.friendSystem.method1550() && var3 >= 0 && var3 < class137.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = ((Buddy)class137.friendSystem.friendsList.get(var3)).world;
				} else {
					Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
				if (class137.friendSystem.method1550() && var3 >= 0 && var3 < class137.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = ((Buddy)class137.friendSystem.friendsList.get(var3)).rank;
				} else {
					Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
					int var9 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
					ScriptFrame.method761(var5, var9);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
					class137.friendSystem.addFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
					class137.friendSystem.removeFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
					class137.friendSystem.addIgnore(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
					boolean var6 = true;
					class137.friendSystem.removeIgnore(var5, var6);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
					var5 = ModeWhere.method8720(var5);
					Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = class137.friendSystem.isFriended(new Username(var5, class198.loginType), false) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (MusicPatch.friendsChat != null) {
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = MusicPatch.friendsChat.name;
					} else {
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (MusicPatch.friendsChat != null) {
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = MusicPatch.friendsChat.getSize();
					} else {
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
					if (MusicPatch.friendsChat != null && var3 < MusicPatch.friendsChat.getSize()) {
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = MusicPatch.friendsChat.get(var3).getUsername().getName();
					} else {
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
					if (MusicPatch.friendsChat != null && var3 < MusicPatch.friendsChat.getSize()) {
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = ((Buddy)MusicPatch.friendsChat.get(var3)).getWorld();
					} else {
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
					if (MusicPatch.friendsChat != null && var3 < MusicPatch.friendsChat.getSize()) {
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = ((Buddy)MusicPatch.friendsChat.get(var3)).rank;
					} else {
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = MusicPatch.friendsChat != null ? MusicPatch.friendsChat.minKick : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
					TransformationMatrix.clanKickUser(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = MusicPatch.friendsChat != null ? MusicPatch.friendsChat.rank : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
					class225.Clan_joinChat(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					class195.Clan_leaveChat();
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!class137.friendSystem.method1550()) {
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = class137.friendSystem.ignoreList.getSize();
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
					if (class137.friendSystem.method1550() && var3 >= 0 && var3 < class137.friendSystem.ignoreList.getSize()) {
						Ignored var4 = (Ignored)class137.friendSystem.ignoreList.get(var3);
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var4.getName();
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var4.getPreviousName();
					} else {
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
					var5 = ModeWhere.method8720(var5);
					Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = class137.friendSystem.isIgnored(new Username(var5, class198.loginType)) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
					if (MusicPatch.friendsChat != null && var3 < MusicPatch.friendsChat.getSize() && MusicPatch.friendsChat.get(var3).getUsername().equals(class27.localPlayer.username)) {
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (MusicPatch.friendsChat != null && MusicPatch.friendsChat.owner != null) {
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = MusicPatch.friendsChat.owner;
					} else {
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
					if (MusicPatch.friendsChat != null && var3 < MusicPatch.friendsChat.getSize() && ((ClanMate)MusicPatch.friendsChat.get(var3)).isFriend()) {
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						class137.friendSystem.friendsList.removeComparator();
						return 1;
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize] == 1;
							class137.friendSystem.friendsList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize] == 1;
							class137.friendSystem.friendsList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize] == 1;
							class137.friendSystem.friendsList.addComparator(new UserComparator3(var7));
							return 1;
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize] == 1;
							class137.friendSystem.friendsList.addComparator(new UserComparator4(var7));
							return 1;
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize] == 1;
							class137.friendSystem.friendsList.addComparator(new UserComparator5(var7));
							return 1;
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize] == 1;
							class137.friendSystem.friendsList.addComparator(new UserComparator6(var7));
							return 1;
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize] == 1;
							class137.friendSystem.friendsList.addComparator(new UserComparator7(var7));
							return 1;
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize] == 1;
							class137.friendSystem.friendsList.addComparator(new UserComparator8(var7));
							return 1;
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize] == 1;
							class137.friendSystem.friendsList.addComparator(new UserComparator9(var7));
							return 1;
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize] == 1;
							class137.friendSystem.friendsList.addComparator(new UserComparator10(var7));
							return 1;
						} else if (var0 == 3639) {
							class137.friendSystem.friendsList.sort();
							return 1;
						} else if (var0 == 3640) {
							class137.friendSystem.ignoreList.removeComparator();
							return 1;
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize] == 1;
							class137.friendSystem.ignoreList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize] == 1;
							class137.friendSystem.ignoreList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3643) {
							class137.friendSystem.ignoreList.sort();
							return 1;
						} else if (var0 == 3644) {
							if (MusicPatch.friendsChat != null) {
								MusicPatch.friendsChat.removeComparator();
							}

							return 1;
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize] == 1;
							if (MusicPatch.friendsChat != null) {
								MusicPatch.friendsChat.addComparator(new UserComparator1(var7));
							}

							return 1;
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize] == 1;
							if (MusicPatch.friendsChat != null) {
								MusicPatch.friendsChat.addComparator(new UserComparator2(var7));
							}

							return 1;
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize] == 1;
							if (MusicPatch.friendsChat != null) {
								MusicPatch.friendsChat.addComparator(new UserComparator3(var7));
							}

							return 1;
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize] == 1;
							if (MusicPatch.friendsChat != null) {
								MusicPatch.friendsChat.addComparator(new UserComparator4(var7));
							}

							return 1;
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize] == 1;
							if (MusicPatch.friendsChat != null) {
								MusicPatch.friendsChat.addComparator(new UserComparator5(var7));
							}

							return 1;
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize] == 1;
							if (MusicPatch.friendsChat != null) {
								MusicPatch.friendsChat.addComparator(new UserComparator6(var7));
							}

							return 1;
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize] == 1;
							if (MusicPatch.friendsChat != null) {
								MusicPatch.friendsChat.addComparator(new UserComparator7(var7));
							}

							return 1;
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize] == 1;
							if (MusicPatch.friendsChat != null) {
								MusicPatch.friendsChat.addComparator(new UserComparator8(var7));
							}

							return 1;
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize] == 1;
							if (MusicPatch.friendsChat != null) {
								MusicPatch.friendsChat.addComparator(new UserComparator9(var7));
							}

							return 1;
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize] == 1;
							if (MusicPatch.friendsChat != null) {
								MusicPatch.friendsChat.addComparator(new UserComparator10(var7));
							}

							return 1;
						} else if (var0 == 3655) {
							if (MusicPatch.friendsChat != null) {
								MusicPatch.friendsChat.sort();
							}

							return 1;
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize] == 1;
							class137.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7));
							return 1;
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize] == 1;
							if (MusicPatch.friendsChat != null) {
								MusicPatch.friendsChat.addComparator(new BuddyRankComparator(var7));
							}

							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
					if (MusicPatch.friendsChat != null && var3 < MusicPatch.friendsChat.getSize() && ((ClanMate)MusicPatch.friendsChat.get(var3)).isIgnored()) {
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				}
			}
		}
	}
}
