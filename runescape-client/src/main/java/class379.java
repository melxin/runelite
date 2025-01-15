import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ot")
public class class379 {
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZB)I",
		garbageValue = "8"
	)
	static int method7638(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) {
			if (HttpRequest.friendSystem.field827 == 0) {
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -2;
			} else if (HttpRequest.friendSystem.field827 == 1) {
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = HttpRequest.friendSystem.friendsList.getSize();
			}

			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
				if (HttpRequest.friendSystem.method2019() && var3 >= 0 && var3 < HttpRequest.friendSystem.friendsList.getSize()) {
					Friend var8 = (Friend)HttpRequest.friendSystem.friendsList.get(var3);
					Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var8.getName();
					Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var8.getPreviousName();
				} else {
					Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
				if (HttpRequest.friendSystem.method2019() && var3 >= 0 && var3 < HttpRequest.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = ((Buddy)HttpRequest.friendSystem.friendsList.get(var3)).world;
				} else {
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
				if (HttpRequest.friendSystem.method2019() && var3 >= 0 && var3 < HttpRequest.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = ((Buddy)HttpRequest.friendSystem.friendsList.get(var3)).rank;
				} else {
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--HealthBarConfig.Interpreter_stringStackSize];
					int var9 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
					InvDefinition.method5121(var5, var9);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--HealthBarConfig.Interpreter_stringStackSize];
					HttpRequest.friendSystem.addFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--HealthBarConfig.Interpreter_stringStackSize];
					HttpRequest.friendSystem.removeFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--HealthBarConfig.Interpreter_stringStackSize];
					HttpRequest.friendSystem.addIgnore(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--HealthBarConfig.Interpreter_stringStackSize];
					boolean var6 = true;
					HttpRequest.friendSystem.removeIgnore(var5, var6);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--HealthBarConfig.Interpreter_stringStackSize];
					var5 = Canvas.method334(var5);
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = HttpRequest.friendSystem.isFriended(new Username(var5, class383.loginType), false) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (WorldMapLabelSize.friendsChat != null) {
						Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = WorldMapLabelSize.friendsChat.name;
					} else {
						Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (WorldMapLabelSize.friendsChat != null) {
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = WorldMapLabelSize.friendsChat.getSize();
					} else {
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
					if (WorldMapLabelSize.friendsChat != null && var3 < WorldMapLabelSize.friendsChat.getSize()) {
						Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = WorldMapLabelSize.friendsChat.get(var3).getUsername().getName();
					} else {
						Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
					if (WorldMapLabelSize.friendsChat != null && var3 < WorldMapLabelSize.friendsChat.getSize()) {
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = ((Buddy)WorldMapLabelSize.friendsChat.get(var3)).getWorld();
					} else {
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
					if (WorldMapLabelSize.friendsChat != null && var3 < WorldMapLabelSize.friendsChat.getSize()) {
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = ((Buddy)WorldMapLabelSize.friendsChat.get(var3)).rank;
					} else {
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = WorldMapLabelSize.friendsChat != null ? WorldMapLabelSize.friendsChat.minKick : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--HealthBarConfig.Interpreter_stringStackSize];
					Skills.clanKickUser(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = WorldMapLabelSize.friendsChat != null ? WorldMapLabelSize.friendsChat.rank : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--HealthBarConfig.Interpreter_stringStackSize];
					class75.Clan_joinChat(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					UserComparator4.Clan_leaveChat();
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!HttpRequest.friendSystem.method2019()) {
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = HttpRequest.friendSystem.ignoreList.getSize();
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
					if (HttpRequest.friendSystem.method2019() && var3 >= 0 && var3 < HttpRequest.friendSystem.ignoreList.getSize()) {
						Ignored var4 = (Ignored)HttpRequest.friendSystem.ignoreList.get(var3);
						Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var4.getName();
						Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var4.getPreviousName();
					} else {
						Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--HealthBarConfig.Interpreter_stringStackSize];
					var5 = Canvas.method334(var5);
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = HttpRequest.friendSystem.isIgnored(new Username(var5, class383.loginType)) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
					if (WorldMapLabelSize.friendsChat != null && var3 < WorldMapLabelSize.friendsChat.getSize() && WorldMapLabelSize.friendsChat.get(var3).getUsername().equals(ModeWhere.localPlayer.username)) {
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (WorldMapLabelSize.friendsChat != null && WorldMapLabelSize.friendsChat.owner != null) {
						Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = WorldMapLabelSize.friendsChat.owner;
					} else {
						Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
					if (WorldMapLabelSize.friendsChat != null && var3 < WorldMapLabelSize.friendsChat.getSize() && ((ClanMate)WorldMapLabelSize.friendsChat.get(var3)).isFriend()) {
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						HttpRequest.friendSystem.friendsList.removeComparator();
						return 1;
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
							HttpRequest.friendSystem.friendsList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
							HttpRequest.friendSystem.friendsList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
							HttpRequest.friendSystem.friendsList.addComparator(new UserComparator3(var7));
							return 1;
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
							HttpRequest.friendSystem.friendsList.addComparator(new UserComparator4(var7));
							return 1;
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
							HttpRequest.friendSystem.friendsList.addComparator(new UserComparator5(var7));
							return 1;
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
							HttpRequest.friendSystem.friendsList.addComparator(new UserComparator6(var7));
							return 1;
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
							HttpRequest.friendSystem.friendsList.addComparator(new UserComparator7(var7));
							return 1;
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
							HttpRequest.friendSystem.friendsList.addComparator(new UserComparator8(var7));
							return 1;
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
							HttpRequest.friendSystem.friendsList.addComparator(new UserComparator9(var7));
							return 1;
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
							HttpRequest.friendSystem.friendsList.addComparator(new UserComparator10(var7));
							return 1;
						} else if (var0 == 3639) {
							HttpRequest.friendSystem.friendsList.sort();
							return 1;
						} else if (var0 == 3640) {
							HttpRequest.friendSystem.ignoreList.removeComparator();
							return 1;
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
							HttpRequest.friendSystem.ignoreList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
							HttpRequest.friendSystem.ignoreList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3643) {
							HttpRequest.friendSystem.ignoreList.sort();
							return 1;
						} else if (var0 == 3644) {
							if (WorldMapLabelSize.friendsChat != null) {
								WorldMapLabelSize.friendsChat.removeComparator();
							}

							return 1;
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
							if (WorldMapLabelSize.friendsChat != null) {
								WorldMapLabelSize.friendsChat.addComparator(new UserComparator1(var7));
							}

							return 1;
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
							if (WorldMapLabelSize.friendsChat != null) {
								WorldMapLabelSize.friendsChat.addComparator(new UserComparator2(var7));
							}

							return 1;
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
							if (WorldMapLabelSize.friendsChat != null) {
								WorldMapLabelSize.friendsChat.addComparator(new UserComparator3(var7));
							}

							return 1;
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
							if (WorldMapLabelSize.friendsChat != null) {
								WorldMapLabelSize.friendsChat.addComparator(new UserComparator4(var7));
							}

							return 1;
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
							if (WorldMapLabelSize.friendsChat != null) {
								WorldMapLabelSize.friendsChat.addComparator(new UserComparator5(var7));
							}

							return 1;
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
							if (WorldMapLabelSize.friendsChat != null) {
								WorldMapLabelSize.friendsChat.addComparator(new UserComparator6(var7));
							}

							return 1;
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
							if (WorldMapLabelSize.friendsChat != null) {
								WorldMapLabelSize.friendsChat.addComparator(new UserComparator7(var7));
							}

							return 1;
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
							if (WorldMapLabelSize.friendsChat != null) {
								WorldMapLabelSize.friendsChat.addComparator(new UserComparator8(var7));
							}

							return 1;
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
							if (WorldMapLabelSize.friendsChat != null) {
								WorldMapLabelSize.friendsChat.addComparator(new UserComparator9(var7));
							}

							return 1;
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
							if (WorldMapLabelSize.friendsChat != null) {
								WorldMapLabelSize.friendsChat.addComparator(new UserComparator10(var7));
							}

							return 1;
						} else if (var0 == 3655) {
							if (WorldMapLabelSize.friendsChat != null) {
								WorldMapLabelSize.friendsChat.sort();
							}

							return 1;
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
							HttpRequest.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7));
							return 1;
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
							if (WorldMapLabelSize.friendsChat != null) {
								WorldMapLabelSize.friendsChat.addComparator(new BuddyRankComparator(var7));
							}

							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
					if (WorldMapLabelSize.friendsChat != null && var3 < WorldMapLabelSize.friendsChat.getSize() && ((ClanMate)WorldMapLabelSize.friendsChat.get(var3)).isIgnored()) {
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				}
			}
		}
	}
}
