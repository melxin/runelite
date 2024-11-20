import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ga")
public class class178 extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("field1913")
	static EvictingDualNodeHashTable field1913;
	@ObfuscatedName("jw")
	@ObfuscatedGetter(
		intValue = -1499591653
	)
	static int field1859;
	@ObfuscatedName("sl")
	@ObfuscatedSignature(
		descriptor = "Lso;"
	)
	@Export("friendsChat")
	static FriendsChat friendsChat;

	static {
		field1913 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZB)I",
		garbageValue = "3"
	)
	static int method3745(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) {
			if (class378.guestClanSettings != null) {
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 1;
				class158.field1725 = class378.guestClanSettings;
			} else {
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) {
				var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
				if (Client.currentClanSettings[var3] != null) {
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 1;
					class158.field1725 = Client.currentClanSettings[var3];
				} else {
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) {
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class158.field1725.name;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) {
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = class158.field1725.allowGuests ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) {
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = class158.field1725.field1744;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) {
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = class158.field1725.field1764;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) {
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = class158.field1725.field1747;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) {
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = class158.field1725.field1737;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) {
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = class158.field1725.memberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class158.field1725.memberNames[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) {
				var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = class158.field1725.memberRanks[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) {
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = class158.field1725.bannedMemberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class158.field1725.bannedMemberNames[var3];
				return 1;
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) {
					PrivateChatMode.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 2];
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = class158.field1725.method3537(var3, var6, var5);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = class158.field1725.currentOwner;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = class158.field1725.field1761;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = class158.field1725.method3553(Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize - 1] = class158.field1725.getSortedMembers()[Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize - 1]];
					return 1;
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) {
					PrivateChatMode.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
					class362.method7400(var6, var3);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) {
					var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = class158.field1725.memberJoinDates[var3];
					return 1;
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) {
						PrivateChatMode.Interpreter_intStackSize -= 3;
						var3 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
						boolean var4 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1] == 1;
						var5 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 2];
						FloatProjection.method5137(var5, var3, var4);
					}

					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) {
						var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = class158.field1725.field1739[var3] ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) {
						if (ObjectComposition.guestClanChannel != null) {
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 1;
							class450.field4885 = ObjectComposition.guestClanChannel;
						} else {
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) {
						var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
						if (Client.currentClanChannels[var3] != null) {
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 1;
							class450.field4885 = Client.currentClanChannels[var3];
							class7.field30 = var3;
						} else {
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class450.field4885.name;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) {
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = class450.field4885.field1810;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) {
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = class450.field4885.field1809;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) {
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = class450.field4885.method3676();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) {
						var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ((ClanChannelMember)class450.field4885.members.get(var3)).username.getName();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) {
						var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = ((ClanChannelMember)class450.field4885.members.get(var3)).rank;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) {
						var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = ((ClanChannelMember)class450.field4885.members.get(var3)).world;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) {
						var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
						class106.method2966(class7.field30, var3);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) {
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = class450.field4885.method3663(Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) {
						Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize - 1] = class450.field4885.getSortedMembers()[Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize - 1]];
						return 1;
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) {
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = class155.field1711 != null ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}

	@ObfuscatedName("nz")
	@ObfuscatedSignature(
		descriptor = "(Lnp;I)V",
		garbageValue = "318511139"
	)
	@Export("invalidateWidget")
	public static void invalidateWidget(Widget var0) {
		if (var0 != null && var0.cycle == Client.field722) {
			Client.validRootWidgets[var0.rootIndex] = true;
		}

	}

	@ObfuscatedName("pg")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1193257189"
	)
	static void method3744(boolean var0) {
		Client.leftClickOpensMenu = var0;
	}
}
