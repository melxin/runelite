import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("xg")
@Implements("FillMode")
public enum FillMode implements Enum {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lxg;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lxg;"
	)
	field6102(1, 1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lxg;"
	)
	field6100(2, 2);

	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 451987283
	)
	public final int field6101;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -216454495
	)
	final int field6104;

	FillMode(int var3, int var4) {
		this.field6101 = var3;
		this.field6104 = var4;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "20"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field6104;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ILcu;ZI)I",
		garbageValue = "1893716028"
	)
	static int method12096(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) {
			if (SecureRandomFuture.guestClanSettings != null) {
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 1;
				FontName.field5871 = SecureRandomFuture.guestClanSettings;
			} else {
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) {
				var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
				if (Client.currentClanSettings[var3] != null) {
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 1;
					FontName.field5871 = Client.currentClanSettings[var3];
				} else {
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) {
				Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = FontName.field5871.name;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) {
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = FontName.field5871.allowGuests ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) {
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = FontName.field5871.field1831;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) {
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = FontName.field5871.field1835;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) {
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = FontName.field5871.field1833;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) {
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = FontName.field5871.field1834;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) {
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = FontName.field5871.memberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
				Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = FontName.field5871.memberNames[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) {
				var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = FontName.field5871.memberRanks[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) {
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = FontName.field5871.bannedMemberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
				Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = FontName.field5871.bannedMemberNames[var3];
				return 1;
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) {
					class408.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 2];
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = FontName.field5871.method4119(var3, var6, var5);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = FontName.field5871.currentOwner;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = FontName.field5871.field1836;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = FontName.field5871.method4053((String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize]);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize - 1] = FontName.field5871.getSortedMembers()[Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize - 1]];
					return 1;
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) {
					class408.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
					Message.method766(var6, var3);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) {
					var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = FontName.field5871.memberJoinDates[var3];
					return 1;
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) {
						class408.Interpreter_intStackSize -= 3;
						var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
						boolean var4 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1] == 1;
						var5 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 2];
						class214.method4711(var5, var3, var4);
					}

					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) {
						var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = FontName.field5871.field1832[var3] ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) {
						if (class57.guestClanChannel != null) {
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 1;
							class225.field2554 = class57.guestClanChannel;
						} else {
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) {
						var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
						if (Client.currentClanChannels[var3] != null) {
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 1;
							class225.field2554 = Client.currentClanChannels[var3];
							class148.field1744 = var3;
						} else {
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) {
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = class225.field2554.name;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) {
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = class225.field2554.field1909;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) {
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = class225.field2554.field1901;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) {
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = class225.field2554.method4196();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) {
						var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = ((ClanChannelMember)class225.field2554.members.get(var3)).username.getName();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) {
						var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = ((ClanChannelMember)class225.field2554.members.get(var3)).rank;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) {
						var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = ((ClanChannelMember)class225.field2554.members.get(var3)).world;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) {
						var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
						class309.method7019(class148.field1744, var3);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) {
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = class225.field2554.method4204((String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize]);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) {
						Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize - 1] = class225.field2554.getSortedMembers()[Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize - 1]];
						return 1;
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) {
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = class4.field4 != null ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}
}
