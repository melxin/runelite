import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hb")
public class class207 extends DualNode {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("field1909")
	static EvictingDualNodeHashTable field1909;

	static {
		field1909 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "-2095396192"
	)
	public static int method4519(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if (var4 <= 127) {
				++var2;
			} else if (var4 <= 2047) {
				var2 += 2;
			} else {
				var2 += 3;
			}
		}

		return var2;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ILcg;ZI)I",
		garbageValue = "-681737568"
	)
	static int method4514(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) {
			if (ApproximateRouteStrategy.friendSystem.field648 == 0) {
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = -2;
			} else if (ApproximateRouteStrategy.friendSystem.field648 == 1) {
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = ApproximateRouteStrategy.friendSystem.friendsList.getSize();
			}

			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
				if (ApproximateRouteStrategy.friendSystem.method1535() && var3 >= 0 && var3 < ApproximateRouteStrategy.friendSystem.friendsList.getSize()) {
					Friend var8 = (Friend)ApproximateRouteStrategy.friendSystem.friendsList.get(var3);
					Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var8.getName();
					Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var8.getPreviousName();
				} else {
					Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = "";
					Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
				if (ApproximateRouteStrategy.friendSystem.method1535() && var3 >= 0 && var3 < ApproximateRouteStrategy.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = ((Buddy)ApproximateRouteStrategy.friendSystem.friendsList.get(var3)).world;
				} else {
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
				if (ApproximateRouteStrategy.friendSystem.method1535() && var3 >= 0 && var3 < ApproximateRouteStrategy.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = ((Buddy)ApproximateRouteStrategy.friendSystem.friendsList.get(var3)).rank;
				} else {
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = (String)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize];
					int var9 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
					ClientPreferences.method2678(var5, var9);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = (String)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize];
					ApproximateRouteStrategy.friendSystem.addFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = (String)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize];
					ApproximateRouteStrategy.friendSystem.removeFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = (String)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize];
					ApproximateRouteStrategy.friendSystem.addIgnore(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = (String)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize];
					boolean var6 = true;
					ApproximateRouteStrategy.friendSystem.removeIgnore(var5, var6);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = (String)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize];
					var5 = class6.method38(var5);
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = ApproximateRouteStrategy.friendSystem.isFriended(new Username(var5, PacketWriter.loginType), false) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (DevicePcmPlayerProvider.friendsChat != null) {
						Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = DevicePcmPlayerProvider.friendsChat.name;
					} else {
						Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (DevicePcmPlayerProvider.friendsChat != null) {
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = DevicePcmPlayerProvider.friendsChat.getSize();
					} else {
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
					if (DevicePcmPlayerProvider.friendsChat != null && var3 < DevicePcmPlayerProvider.friendsChat.getSize()) {
						Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = DevicePcmPlayerProvider.friendsChat.get(var3).getUsername().getName();
					} else {
						Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
					if (DevicePcmPlayerProvider.friendsChat != null && var3 < DevicePcmPlayerProvider.friendsChat.getSize()) {
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = ((Buddy)DevicePcmPlayerProvider.friendsChat.get(var3)).getWorld();
					} else {
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
					if (DevicePcmPlayerProvider.friendsChat != null && var3 < DevicePcmPlayerProvider.friendsChat.getSize()) {
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = ((Buddy)DevicePcmPlayerProvider.friendsChat.get(var3)).rank;
					} else {
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = DevicePcmPlayerProvider.friendsChat != null ? DevicePcmPlayerProvider.friendsChat.minKick : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = (String)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize];
					class142.clanKickUser(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = DevicePcmPlayerProvider.friendsChat != null ? DevicePcmPlayerProvider.friendsChat.rank : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = (String)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize];
					DevicePcmPlayerProvider.Clan_joinChat(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					class180.Clan_leaveChat();
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!ApproximateRouteStrategy.friendSystem.method1535()) {
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = ApproximateRouteStrategy.friendSystem.ignoreList.getSize();
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
					if (ApproximateRouteStrategy.friendSystem.method1535() && var3 >= 0 && var3 < ApproximateRouteStrategy.friendSystem.ignoreList.getSize()) {
						Ignored var4 = (Ignored)ApproximateRouteStrategy.friendSystem.ignoreList.get(var3);
						Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var4.getName();
						Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var4.getPreviousName();
					} else {
						Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = "";
						Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = (String)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize];
					var5 = class6.method38(var5);
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = ApproximateRouteStrategy.friendSystem.isIgnored(new Username(var5, PacketWriter.loginType)) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
					if (DevicePcmPlayerProvider.friendsChat != null && var3 < DevicePcmPlayerProvider.friendsChat.getSize() && DevicePcmPlayerProvider.friendsChat.get(var3).getUsername().equals(HealthBarUpdate.localPlayer.username)) {
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (DevicePcmPlayerProvider.friendsChat != null && DevicePcmPlayerProvider.friendsChat.owner != null) {
						Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = DevicePcmPlayerProvider.friendsChat.owner;
					} else {
						Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
					if (DevicePcmPlayerProvider.friendsChat != null && var3 < DevicePcmPlayerProvider.friendsChat.getSize() && ((ClanMate)DevicePcmPlayerProvider.friendsChat.get(var3)).isFriend()) {
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						ApproximateRouteStrategy.friendSystem.friendsList.removeComparator();
						return 1;
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
							ApproximateRouteStrategy.friendSystem.friendsList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
							ApproximateRouteStrategy.friendSystem.friendsList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
							ApproximateRouteStrategy.friendSystem.friendsList.addComparator(new UserComparator3(var7));
							return 1;
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
							ApproximateRouteStrategy.friendSystem.friendsList.addComparator(new UserComparator4(var7));
							return 1;
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
							ApproximateRouteStrategy.friendSystem.friendsList.addComparator(new UserComparator5(var7));
							return 1;
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
							ApproximateRouteStrategy.friendSystem.friendsList.addComparator(new UserComparator6(var7));
							return 1;
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
							ApproximateRouteStrategy.friendSystem.friendsList.addComparator(new UserComparator7(var7));
							return 1;
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
							ApproximateRouteStrategy.friendSystem.friendsList.addComparator(new UserComparator8(var7));
							return 1;
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
							ApproximateRouteStrategy.friendSystem.friendsList.addComparator(new UserComparator9(var7));
							return 1;
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
							ApproximateRouteStrategy.friendSystem.friendsList.addComparator(new UserComparator10(var7));
							return 1;
						} else if (var0 == 3639) {
							ApproximateRouteStrategy.friendSystem.friendsList.sort();
							return 1;
						} else if (var0 == 3640) {
							ApproximateRouteStrategy.friendSystem.ignoreList.removeComparator();
							return 1;
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
							ApproximateRouteStrategy.friendSystem.ignoreList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
							ApproximateRouteStrategy.friendSystem.ignoreList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3643) {
							ApproximateRouteStrategy.friendSystem.ignoreList.sort();
							return 1;
						} else if (var0 == 3644) {
							if (DevicePcmPlayerProvider.friendsChat != null) {
								DevicePcmPlayerProvider.friendsChat.removeComparator();
							}

							return 1;
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
							if (DevicePcmPlayerProvider.friendsChat != null) {
								DevicePcmPlayerProvider.friendsChat.addComparator(new UserComparator1(var7));
							}

							return 1;
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
							if (DevicePcmPlayerProvider.friendsChat != null) {
								DevicePcmPlayerProvider.friendsChat.addComparator(new UserComparator2(var7));
							}

							return 1;
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
							if (DevicePcmPlayerProvider.friendsChat != null) {
								DevicePcmPlayerProvider.friendsChat.addComparator(new UserComparator3(var7));
							}

							return 1;
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
							if (DevicePcmPlayerProvider.friendsChat != null) {
								DevicePcmPlayerProvider.friendsChat.addComparator(new UserComparator4(var7));
							}

							return 1;
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
							if (DevicePcmPlayerProvider.friendsChat != null) {
								DevicePcmPlayerProvider.friendsChat.addComparator(new UserComparator5(var7));
							}

							return 1;
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
							if (DevicePcmPlayerProvider.friendsChat != null) {
								DevicePcmPlayerProvider.friendsChat.addComparator(new UserComparator6(var7));
							}

							return 1;
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
							if (DevicePcmPlayerProvider.friendsChat != null) {
								DevicePcmPlayerProvider.friendsChat.addComparator(new UserComparator7(var7));
							}

							return 1;
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
							if (DevicePcmPlayerProvider.friendsChat != null) {
								DevicePcmPlayerProvider.friendsChat.addComparator(new UserComparator8(var7));
							}

							return 1;
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
							if (DevicePcmPlayerProvider.friendsChat != null) {
								DevicePcmPlayerProvider.friendsChat.addComparator(new UserComparator9(var7));
							}

							return 1;
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
							if (DevicePcmPlayerProvider.friendsChat != null) {
								DevicePcmPlayerProvider.friendsChat.addComparator(new UserComparator10(var7));
							}

							return 1;
						} else if (var0 == 3655) {
							if (DevicePcmPlayerProvider.friendsChat != null) {
								DevicePcmPlayerProvider.friendsChat.sort();
							}

							return 1;
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
							ApproximateRouteStrategy.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7));
							return 1;
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize] == 1;
							if (DevicePcmPlayerProvider.friendsChat != null) {
								DevicePcmPlayerProvider.friendsChat.addComparator(new BuddyRankComparator(var7));
							}

							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
					if (DevicePcmPlayerProvider.friendsChat != null && var3 < DevicePcmPlayerProvider.friendsChat.getSize() && ((ClanMate)DevicePcmPlayerProvider.friendsChat.get(var3)).isIgnored()) {
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("ox")
	@ObfuscatedSignature(
		descriptor = "(Loi;B)Loi;",
		garbageValue = "-10"
	)
	static Widget method4518(Widget var0) {
		int var2 = DirectByteArrayCopier.getWidgetFlags(var0);
		int var1 = var2 >> 17 & 7;
		int var3 = var1;
		if (var1 == 0) {
			return null;
		} else {
			for (int var4 = 0; var4 < var3; ++var4) {
				var0 = UrlRequester.widgetDefinition.method7476(var0.parentId);
				if (var0 == null) {
					return null;
				}
			}

			return var0;
		}
	}
}
