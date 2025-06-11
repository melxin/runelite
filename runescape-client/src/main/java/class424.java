import java.util.HashMap;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("qo")
public class class424 {
	static {
		new HashMap();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)[Lwy;",
		garbageValue = "1708548148"
	)
	static IndexedSprite[] method8367() {
		IndexedSprite[] var0 = new IndexedSprite[SpriteBufferProperties.SpriteBuffer_spriteCount];

		for (int var1 = 0; var1 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var1) {
			IndexedSprite var2 = var0[var1] = new IndexedSprite();
			var2.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
			var2.height = SpriteBufferProperties.SpriteBuffer_spriteHeight;
			var2.xOffset = SpriteBufferProperties.SpriteBuffer_xOffsets[var1];
			var2.yOffset = Varps.SpriteBuffer_yOffsets[var1];
			var2.subWidth = class379.SpriteBuffer_spriteWidths[var1];
			var2.subHeight = class171.SpriteBuffer_spriteHeights[var1];
			var2.palette = SpriteBufferProperties.SpriteBuffer_spritePalette;
			var2.pixels = SpriteBufferProperties.SpriteBuffer_pixels[var1];
		}

		SpriteBufferProperties.SpriteBuffer_xOffsets = null;
		Varps.SpriteBuffer_yOffsets = null;
		class379.SpriteBuffer_spriteWidths = null;
		class171.SpriteBuffer_spriteHeights = null;
		SpriteBufferProperties.SpriteBuffer_spritePalette = null;
		SpriteBufferProperties.SpriteBuffer_pixels = null;
		return var0;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ILcr;ZI)I",
		garbageValue = "1950321020"
	)
	static int method8363(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) {
			if (Actor.friendSystem.field636 == 0) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -2;
			} else if (Actor.friendSystem.field636 == 1) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Actor.friendSystem.friendsList.getSize();
			}

			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if (Actor.friendSystem.method1531() && var3 >= 0 && var3 < Actor.friendSystem.friendsList.getSize()) {
					Friend var8 = (Friend)Actor.friendSystem.friendsList.get(var3);
					Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = var8.getName();
					Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = var8.getPreviousName();
				} else {
					Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = "";
					Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if (Actor.friendSystem.method1531() && var3 >= 0 && var3 < Actor.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)Actor.friendSystem.friendsList.get(var3)).world;
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if (Actor.friendSystem.method1531() && var3 >= 0 && var3 < Actor.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)Actor.friendSystem.friendsList.get(var3)).rank;
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = (String)Interpreter.Interpreter_objectStack[--class175.Interpreter_objectStackSize];
					int var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					GameEngine.method653(var5, var9);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = (String)Interpreter.Interpreter_objectStack[--class175.Interpreter_objectStackSize];
					Actor.friendSystem.addFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = (String)Interpreter.Interpreter_objectStack[--class175.Interpreter_objectStackSize];
					Actor.friendSystem.removeFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = (String)Interpreter.Interpreter_objectStack[--class175.Interpreter_objectStackSize];
					Actor.friendSystem.addIgnore(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = (String)Interpreter.Interpreter_objectStack[--class175.Interpreter_objectStackSize];
					boolean var6 = true;
					Actor.friendSystem.removeIgnore(var5, var6);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = (String)Interpreter.Interpreter_objectStack[--class175.Interpreter_objectStackSize];
					var5 = class332.method6860(var5);
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Actor.friendSystem.isFriended(new Username(var5, AbstractUserComparator.loginType), false) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (class187.friendsChat != null) {
						Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = class187.friendsChat.name;
					} else {
						Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (class187.friendsChat != null) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class187.friendsChat.getSize();
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if (class187.friendsChat != null && var3 < class187.friendsChat.getSize()) {
						Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = class187.friendsChat.get(var3).getUsername().getName();
					} else {
						Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if (class187.friendsChat != null && var3 < class187.friendsChat.getSize()) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)class187.friendsChat.get(var3)).getWorld();
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if (class187.friendsChat != null && var3 < class187.friendsChat.getSize()) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)class187.friendsChat.get(var3)).rank;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class187.friendsChat != null ? class187.friendsChat.minKick : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = (String)Interpreter.Interpreter_objectStack[--class175.Interpreter_objectStackSize];
					class464.clanKickUser(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class187.friendsChat != null ? class187.friendsChat.rank : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = (String)Interpreter.Interpreter_objectStack[--class175.Interpreter_objectStackSize];
					GrandExchangeOfferOwnWorldComparator.Clan_joinChat(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					Sound.Clan_leaveChat();
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!Actor.friendSystem.method1531()) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Actor.friendSystem.ignoreList.getSize();
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if (Actor.friendSystem.method1531() && var3 >= 0 && var3 < Actor.friendSystem.ignoreList.getSize()) {
						Ignored var4 = (Ignored)Actor.friendSystem.ignoreList.get(var3);
						Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = var4.getName();
						Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = var4.getPreviousName();
					} else {
						Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = "";
						Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = (String)Interpreter.Interpreter_objectStack[--class175.Interpreter_objectStackSize];
					var5 = class332.method6860(var5);
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Actor.friendSystem.isIgnored(new Username(var5, AbstractUserComparator.loginType)) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if (class187.friendsChat != null && var3 < class187.friendsChat.getSize() && class187.friendsChat.get(var3).getUsername().equals(class152.localPlayer.username)) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (class187.friendsChat != null && class187.friendsChat.owner != null) {
						Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = class187.friendsChat.owner;
					} else {
						Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if (class187.friendsChat != null && var3 < class187.friendsChat.getSize() && ((ClanMate)class187.friendsChat.get(var3)).isFriend()) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						Actor.friendSystem.friendsList.removeComparator();
						return 1;
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							Actor.friendSystem.friendsList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							Actor.friendSystem.friendsList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							Actor.friendSystem.friendsList.addComparator(new UserComparator3(var7));
							return 1;
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							Actor.friendSystem.friendsList.addComparator(new UserComparator4(var7));
							return 1;
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							Actor.friendSystem.friendsList.addComparator(new UserComparator5(var7));
							return 1;
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							Actor.friendSystem.friendsList.addComparator(new UserComparator6(var7));
							return 1;
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							Actor.friendSystem.friendsList.addComparator(new UserComparator7(var7));
							return 1;
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							Actor.friendSystem.friendsList.addComparator(new UserComparator8(var7));
							return 1;
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							Actor.friendSystem.friendsList.addComparator(new UserComparator9(var7));
							return 1;
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							Actor.friendSystem.friendsList.addComparator(new UserComparator10(var7));
							return 1;
						} else if (var0 == 3639) {
							Actor.friendSystem.friendsList.sort();
							return 1;
						} else if (var0 == 3640) {
							Actor.friendSystem.ignoreList.removeComparator();
							return 1;
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							Actor.friendSystem.ignoreList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							Actor.friendSystem.ignoreList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3643) {
							Actor.friendSystem.ignoreList.sort();
							return 1;
						} else if (var0 == 3644) {
							if (class187.friendsChat != null) {
								class187.friendsChat.removeComparator();
							}

							return 1;
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (class187.friendsChat != null) {
								class187.friendsChat.addComparator(new UserComparator1(var7));
							}

							return 1;
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (class187.friendsChat != null) {
								class187.friendsChat.addComparator(new UserComparator2(var7));
							}

							return 1;
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (class187.friendsChat != null) {
								class187.friendsChat.addComparator(new UserComparator3(var7));
							}

							return 1;
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (class187.friendsChat != null) {
								class187.friendsChat.addComparator(new UserComparator4(var7));
							}

							return 1;
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (class187.friendsChat != null) {
								class187.friendsChat.addComparator(new UserComparator5(var7));
							}

							return 1;
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (class187.friendsChat != null) {
								class187.friendsChat.addComparator(new UserComparator6(var7));
							}

							return 1;
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (class187.friendsChat != null) {
								class187.friendsChat.addComparator(new UserComparator7(var7));
							}

							return 1;
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (class187.friendsChat != null) {
								class187.friendsChat.addComparator(new UserComparator8(var7));
							}

							return 1;
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (class187.friendsChat != null) {
								class187.friendsChat.addComparator(new UserComparator9(var7));
							}

							return 1;
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (class187.friendsChat != null) {
								class187.friendsChat.addComparator(new UserComparator10(var7));
							}

							return 1;
						} else if (var0 == 3655) {
							if (class187.friendsChat != null) {
								class187.friendsChat.sort();
							}

							return 1;
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							Actor.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7));
							return 1;
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
							if (class187.friendsChat != null) {
								class187.friendsChat.addComparator(new BuddyRankComparator(var7));
							}

							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if (class187.friendsChat != null && var3 < class187.friendsChat.getSize() && ((ClanMate)class187.friendsChat.get(var3)).isIgnored()) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(Lov;Lov;B)V",
		garbageValue = "-3"
	)
	static void method8365(Widget var0, Widget var1) {
		if (var0.type == 0) {
			for (int var2 = var0.field4002; var2 <= var0.field4003; ++var2) {
				Widget var3 = var1.children[var2];
				if (var3 != null && var0.childIndex * -744024149 == var3.field4127) {
					method8365(var3, var1);
				}
			}
		}

		var1.children[var0.childIndex * -744024149] = null;
	}
}
