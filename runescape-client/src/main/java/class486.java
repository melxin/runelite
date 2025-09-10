import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("sn")
public class class486 {
	@ObfuscatedName("af")
	final int[] field5347;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -2036941375
	)
	int field5346;

	public class486(int var1) {
		this.field5347 = new int[var1];
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "736905991"
	)
	public void method9798(int var1) {
		this.field5347[++this.field5346 - 1] = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "68"
	)
	public int method9787(int var1) {
		return this.field5347[var1];
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "4"
	)
	public int method9790() {
		return this.field5346;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-397086878"
	)
	public void method9793() {
		this.field5346 = 0;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(ILcg;ZI)I",
		garbageValue = "814224388"
	)
	static int method9789(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) {
			if (HttpAuthenticationHeader.guestClanSettings != null) {
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 1;
				FaceNormal.field2805 = HttpAuthenticationHeader.guestClanSettings;
			} else {
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) {
				var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
				if (Client.currentClanSettings[var3] != null) {
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 1;
					FaceNormal.field2805 = Client.currentClanSettings[var3];
				} else {
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) {
				Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = FaceNormal.field2805.name;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) {
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = FaceNormal.field2805.allowGuests ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) {
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = FaceNormal.field2805.field1850;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) {
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = FaceNormal.field2805.field1846;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) {
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = FaceNormal.field2805.field1852;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) {
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = FaceNormal.field2805.field1853;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) {
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = FaceNormal.field2805.memberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
				Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = FaceNormal.field2805.memberNames[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) {
				var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = FaceNormal.field2805.memberRanks[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) {
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = FaceNormal.field2805.bannedMemberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
				Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = FaceNormal.field2805.bannedMemberNames[var3];
				return 1;
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) {
					UserComparator7.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 2];
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = FaceNormal.field2805.method3943(var3, var6, var5);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = FaceNormal.field2805.currentOwner;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = FaceNormal.field2805.field1861;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = FaceNormal.field2805.method3921((String)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize]);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize - 1] = FaceNormal.field2805.getSortedMembers()[Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize - 1]];
					return 1;
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) {
					UserComparator7.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
					class384.method8188(var6, var3);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) {
					var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = FaceNormal.field2805.memberJoinDates[var3];
					return 1;
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) {
						UserComparator7.Interpreter_intStackSize -= 3;
						var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
						boolean var4 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1] == 1;
						var5 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 2];
						BufferedSink.method10263(var5, var3, var4);
					}

					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = FaceNormal.field2805.field1859[var3] ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) {
						if (class86.guestClanChannel != null) {
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 1;
							class161.field1834 = class86.guestClanChannel;
						} else {
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
						if (Client.currentClanChannels[var3] != null) {
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 1;
							class161.field1834 = Client.currentClanChannels[var3];
							class161.field1836 = var3;
						} else {
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) {
						Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = class161.field1834.name;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) {
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = class161.field1834.field1921;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) {
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = class161.field1834.field1917;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) {
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = class161.field1834.method4076();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
						Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = ((ClanChannelMember)class161.field1834.members.get(var3)).username.getName();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = ((ClanChannelMember)class161.field1834.members.get(var3)).rank;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = ((ClanChannelMember)class161.field1834.members.get(var3)).world;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
						Varcs.method2915(class161.field1836, var3);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) {
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = class161.field1834.method4070((String)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize]);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) {
						Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize - 1] = class161.field1834.getSortedMembers()[Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize - 1]];
						return 1;
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) {
						Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = class256.field3085 != null ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}
}
