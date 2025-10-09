import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ka")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1598556889
	)
	final int field3305;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 2069559765
	)
	final int field3306;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1703624315
	)
	final int field3307;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(0, 0, 4);
		WorldMapLabelSize_medium = new WorldMapLabelSize(1, 1, 2);
		WorldMapLabelSize_large = new WorldMapLabelSize(2, 2, 0);
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field3305 = var1;
		this.field3306 = var2;
		this.field3307 = var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(FS)Z",
		garbageValue = "493"
	)
	boolean method6409(float var1) {
		return var1 >= (float)this.field3307;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1664005412"
	)
	static final void method6406(String var0) {
		Frames.method5459("Please remove " + var0 + " from your ignore list first");
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ltl;Ljava/lang/Object;III)I",
		garbageValue = "-140084730"
	)
	public static int method6408(DynamicArray var0, Object var1, int var2, int var3) {
		if (var2 < 0) {
			var2 = 0;
		}

		if (var3 < 0 || var3 > var0.method10433()) {
			var3 = var0.method10433();
		}

		int var5;
		if (var0.field5571 == class572.field5879) {
			int[] var11 = var0.method10430();
			var5 = (Integer)var1;

			for (int var6 = var3 - 1; var6 >= var2; --var6) {
				if (var5 == var11[var6]) {
					return var6;
				}
			}
		} else if (var0.field5571 == class572.field5878) {
			long[] var10 = var0.method10431();
			long var8 = (Long)var1;

			for (int var7 = var3 - 1; var7 >= var2; --var7) {
				if (var8 == var10[var7]) {
					return var7;
				}
			}
		} else {
			Object[] var4 = var0.method10428();

			for (var5 = var3 - 1; var5 >= var2; --var5) {
				if (var4[var5] == var1 || var4[var5] != null && var4[var5].equals(var1)) {
					return var5;
				}
			}
		}

		return -1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	protected static final boolean method6404() {
		return GameEngine.keyHandler.method348();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lok;ZI)V",
		garbageValue = "942167361"
	)
	static void method6407(Widget var0, boolean var1) {
		if (var0 != null) {
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 1;
			if (var1) {
				class359.scriptDotWidget = var0;
			} else {
				GameEngine.scriptActiveWidget = var0;
			}
		} else {
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
		}

	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(ILcj;ZI)I",
		garbageValue = "-111064705"
	)
	static int method6405(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) {
			if (KitDefinition.friendSystem.field618 == 0) {
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = -2;
			} else if (KitDefinition.friendSystem.field618 == 1) {
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = KitDefinition.friendSystem.friendsList.getSize();
			}

			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
				if (KitDefinition.friendSystem.method1555() && var3 >= 0 && var3 < KitDefinition.friendSystem.friendsList.getSize()) {
					Friend var8 = (Friend)KitDefinition.friendSystem.friendsList.get(var3);
					Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var8.getName();
					Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var8.getPreviousName();
				} else {
					Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = "";
					Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
				if (KitDefinition.friendSystem.method1555() && var3 >= 0 && var3 < KitDefinition.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = ((Buddy)KitDefinition.friendSystem.friendsList.get(var3)).world;
				} else {
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
				if (KitDefinition.friendSystem.method1555() && var3 >= 0 && var3 < KitDefinition.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = ((Buddy)KitDefinition.friendSystem.friendsList.get(var3)).rank;
				} else {
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = (String)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize];
					int var9 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
					class362.method7531(var5, var9);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = (String)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize];
					KitDefinition.friendSystem.addFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = (String)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize];
					KitDefinition.friendSystem.removeFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = (String)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize];
					KitDefinition.friendSystem.addIgnore(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = (String)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize];
					boolean var6 = true;
					KitDefinition.friendSystem.removeIgnore(var5, var6);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = (String)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize];
					var5 = class188.method4334(var5);
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = KitDefinition.friendSystem.isFriended(new Username(var5, class147.loginType), false) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (class445.friendsChat != null) {
						Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = class445.friendsChat.name;
					} else {
						Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (class445.friendsChat != null) {
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = class445.friendsChat.getSize();
					} else {
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
					if (class445.friendsChat != null && var3 < class445.friendsChat.getSize()) {
						Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = class445.friendsChat.get(var3).getUsername().getName();
					} else {
						Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
					if (class445.friendsChat != null && var3 < class445.friendsChat.getSize()) {
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = ((Buddy)class445.friendsChat.get(var3)).getWorld();
					} else {
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
					if (class445.friendsChat != null && var3 < class445.friendsChat.getSize()) {
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = ((Buddy)class445.friendsChat.get(var3)).rank;
					} else {
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = class445.friendsChat != null ? class445.friendsChat.minKick : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = (String)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize];
					class159.clanKickUser(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = class445.friendsChat != null ? class445.friendsChat.rank : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = (String)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize];
					Player.Clan_joinChat(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					WorldMapElement.Clan_leaveChat();
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!KitDefinition.friendSystem.method1555()) {
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = KitDefinition.friendSystem.ignoreList.getSize();
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
					if (KitDefinition.friendSystem.method1555() && var3 >= 0 && var3 < KitDefinition.friendSystem.ignoreList.getSize()) {
						Ignored var4 = (Ignored)KitDefinition.friendSystem.ignoreList.get(var3);
						Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var4.getName();
						Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var4.getPreviousName();
					} else {
						Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = "";
						Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = (String)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize];
					var5 = class188.method4334(var5);
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = KitDefinition.friendSystem.isIgnored(new Username(var5, class147.loginType)) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
					if (class445.friendsChat != null && var3 < class445.friendsChat.getSize() && class445.friendsChat.get(var3).getUsername().equals(class159.localPlayer.username)) {
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (class445.friendsChat != null && class445.friendsChat.owner != null) {
						Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = class445.friendsChat.owner;
					} else {
						Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
					if (class445.friendsChat != null && var3 < class445.friendsChat.getSize() && ((ClanMate)class445.friendsChat.get(var3)).isFriend()) {
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						KitDefinition.friendSystem.friendsList.removeComparator();
						return 1;
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1;
							KitDefinition.friendSystem.friendsList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1;
							KitDefinition.friendSystem.friendsList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1;
							KitDefinition.friendSystem.friendsList.addComparator(new UserComparator3(var7));
							return 1;
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1;
							KitDefinition.friendSystem.friendsList.addComparator(new UserComparator4(var7));
							return 1;
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1;
							KitDefinition.friendSystem.friendsList.addComparator(new UserComparator5(var7));
							return 1;
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1;
							KitDefinition.friendSystem.friendsList.addComparator(new UserComparator6(var7));
							return 1;
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1;
							KitDefinition.friendSystem.friendsList.addComparator(new UserComparator7(var7));
							return 1;
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1;
							KitDefinition.friendSystem.friendsList.addComparator(new UserComparator8(var7));
							return 1;
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1;
							KitDefinition.friendSystem.friendsList.addComparator(new UserComparator9(var7));
							return 1;
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1;
							KitDefinition.friendSystem.friendsList.addComparator(new UserComparator10(var7));
							return 1;
						} else if (var0 == 3639) {
							KitDefinition.friendSystem.friendsList.sort();
							return 1;
						} else if (var0 == 3640) {
							KitDefinition.friendSystem.ignoreList.removeComparator();
							return 1;
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1;
							KitDefinition.friendSystem.ignoreList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1;
							KitDefinition.friendSystem.ignoreList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3643) {
							KitDefinition.friendSystem.ignoreList.sort();
							return 1;
						} else if (var0 == 3644) {
							if (class445.friendsChat != null) {
								class445.friendsChat.removeComparator();
							}

							return 1;
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1;
							if (class445.friendsChat != null) {
								class445.friendsChat.addComparator(new UserComparator1(var7));
							}

							return 1;
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1;
							if (class445.friendsChat != null) {
								class445.friendsChat.addComparator(new UserComparator2(var7));
							}

							return 1;
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1;
							if (class445.friendsChat != null) {
								class445.friendsChat.addComparator(new UserComparator3(var7));
							}

							return 1;
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1;
							if (class445.friendsChat != null) {
								class445.friendsChat.addComparator(new UserComparator4(var7));
							}

							return 1;
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1;
							if (class445.friendsChat != null) {
								class445.friendsChat.addComparator(new UserComparator5(var7));
							}

							return 1;
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1;
							if (class445.friendsChat != null) {
								class445.friendsChat.addComparator(new UserComparator6(var7));
							}

							return 1;
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1;
							if (class445.friendsChat != null) {
								class445.friendsChat.addComparator(new UserComparator7(var7));
							}

							return 1;
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1;
							if (class445.friendsChat != null) {
								class445.friendsChat.addComparator(new UserComparator8(var7));
							}

							return 1;
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1;
							if (class445.friendsChat != null) {
								class445.friendsChat.addComparator(new UserComparator9(var7));
							}

							return 1;
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1;
							if (class445.friendsChat != null) {
								class445.friendsChat.addComparator(new UserComparator10(var7));
							}

							return 1;
						} else if (var0 == 3655) {
							if (class445.friendsChat != null) {
								class445.friendsChat.sort();
							}

							return 1;
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1;
							KitDefinition.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7));
							return 1;
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1;
							if (class445.friendsChat != null) {
								class445.friendsChat.addComparator(new BuddyRankComparator(var7));
							}

							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
					if (class445.friendsChat != null && var3 < class445.friendsChat.getSize() && ((ClanMate)class445.friendsChat.get(var3)).isIgnored()) {
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(Ldm;I)V",
		garbageValue = "1147075568"
	)
	static void method6400(WorldView var0) {
		WorldEntity var1 = (WorldEntity)var0.worldEntities.get((long)Client.currentWorldViewId);
		if (var1 != null) {
			class404.method8319(var0, var1, false);
		}
	}
}
