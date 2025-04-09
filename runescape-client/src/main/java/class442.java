import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("rz")
public class class442 {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	public static final class442 field4921;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	public static final class442 field4916;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lrz;"
	)
	public static class442[] field4917;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1597482019
	)
	static int field4919;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1180107909
	)
	public static int field4920;
	@ObfuscatedName("aq")
	public float field4918;
	@ObfuscatedName("av")
	public float field4915;
	@ObfuscatedName("am")
	public float field4922;

	static {
		new class442(0.0F, 0.0F, 0.0F);
		new class442(1.0F, 1.0F, 1.0F);
		new class442(1.0F, 0.0F, 0.0F);
		field4921 = new class442(0.0F, 1.0F, 0.0F);
		new class442(0.0F, 0.0F, 1.0F);
		new class442(1.0F, 0.0F, 0.0F);
		new class442(-1.0F, 0.0F, 0.0F);
		new class442(0.0F, 0.0F, 1.0F);
		field4916 = new class442(0.0F, 0.0F, -1.0F);
		new class442(0.0F, 1.0F, 0.0F);
		new class442(0.0F, -1.0F, 0.0F);
		field4917 = new class442[0];
		field4919 = 16;
		field4917 = new class442[16];
		field4920 = 0;
	}

	public class442() {
	}

	class442(float var1, float var2, float var3) {
		this.field4918 = var1;
		this.field4915 = var2;
		this.field4922 = var3;
	}

	@ObfuscatedSignature(
		descriptor = "(Lrz;)V"
	)
	public class442(class442 var1) {
		this.field4918 = var1.field4918;
		this.field4915 = var1.field4915;
		this.field4922 = var1.field4922;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-72"
	)
	public void method8339() {
		synchronized(field4917) {
			if (field4920 < field4919) {
				field4917[++field4920 - 1] = this;
			}

		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "1413829221"
	)
	public void method8340(float var1, float var2, float var3) {
		this.field4918 = var1;
		this.field4915 = var2;
		this.field4922 = var3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lrz;B)V",
		garbageValue = "1"
	)
	public void method8341(class442 var1) {
		this.method8340(var1.field4918, var1.field4915, var1.field4922);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	final void method8342() {
		this.field4922 = 0.0F;
		this.field4915 = 0.0F;
		this.field4918 = 0.0F;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lrz;I)Z",
		garbageValue = "-1164273561"
	)
	boolean method8343(class442 var1) {
		return var1.field4918 == this.field4918 && this.field4915 == var1.field4915 && this.field4922 == var1.field4922;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1416926695"
	)
	public final void method8344() {
		float var1 = 1.0F / this.method8349();
		this.field4918 *= var1;
		this.field4915 *= var1;
		this.field4922 *= var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lrz;I)V",
		garbageValue = "-1420631144"
	)
	public final void method8345(class442 var1) {
		this.field4918 += var1.field4918;
		this.field4915 += var1.field4915;
		this.field4922 += var1.field4922;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(FFFS)V",
		garbageValue = "12030"
	)
	public final void method8337(float var1, float var2, float var3) {
		this.field4918 += var1;
		this.field4915 += var2;
		this.field4922 += var3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lrz;B)V",
		garbageValue = "25"
	)
	final void method8346(class442 var1) {
		this.field4918 -= var1.field4918;
		this.field4915 -= var1.field4915;
		this.field4922 -= var1.field4922;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lrz;B)F",
		garbageValue = "53"
	)
	final float method8376(class442 var1) {
		return this.field4922 * var1.field4922 + var1.field4915 * this.field4915 + this.field4918 * var1.field4918;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lrz;I)V",
		garbageValue = "1682064224"
	)
	public final void method8369(class442 var1) {
		this.method8340(this.field4915 * var1.field4922 - var1.field4915 * this.field4922, this.field4922 * var1.field4918 - this.field4918 * var1.field4922, this.field4918 * var1.field4915 - var1.field4918 * this.field4915);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "-2071235465"
	)
	final float method8349() {
		return (float)Math.sqrt((double)(this.field4922 * this.field4922 + this.field4918 * this.field4918 + this.field4915 * this.field4915));
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "-15"
	)
	public final void method8355(float var1) {
		this.field4918 *= var1;
		this.field4915 *= var1;
		this.field4922 *= var1;
	}

	public String toString() {
		return this.field4918 + ", " + this.field4915 + ", " + this.field4922;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ILdb;ZI)I",
		garbageValue = "673925099"
	)
	static int method8352(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) {
			if (class331.guestClanSettings != null) {
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 1;
				FriendSystem.field833 = class331.guestClanSettings;
			} else {
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) {
				var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
				if (Client.currentClanSettings[var3] != null) {
					Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 1;
					FriendSystem.field833 = Client.currentClanSettings[var3];
				} else {
					Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) {
				Interpreter.Interpreter_stringStack[++class338.Interpreter_stringStackSize - 1] = FriendSystem.field833.name;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) {
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = FriendSystem.field833.allowGuests ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) {
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = FriendSystem.field833.field1803;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) {
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = FriendSystem.field833.field1784;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) {
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = FriendSystem.field833.field1773;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) {
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = FriendSystem.field833.field1786;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) {
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = FriendSystem.field833.memberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++class338.Interpreter_stringStackSize - 1] = FriendSystem.field833.memberNames[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) {
				var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = FriendSystem.field833.memberRanks[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) {
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = FriendSystem.field833.bannedMemberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++class338.Interpreter_stringStackSize - 1] = FriendSystem.field833.bannedMemberNames[var3];
				return 1;
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) {
					AbstractByteArrayCopier.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 2];
					Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = FriendSystem.field833.method3558(var3, var6, var5);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = FriendSystem.field833.currentOwner;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = FriendSystem.field833.field1794;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = FriendSystem.field833.method3557(Interpreter.Interpreter_stringStack[--class338.Interpreter_stringStackSize]);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize - 1] = FriendSystem.field833.getSortedMembers()[Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize - 1]];
					return 1;
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) {
					AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
					class219.method4836(var6, var3);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) {
					var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = FriendSystem.field833.memberJoinDates[var3];
					return 1;
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) {
						AbstractByteArrayCopier.Interpreter_intStackSize -= 3;
						var3 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
						boolean var4 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1] == 1;
						var5 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 2];
						Language.method8019(var5, var3, var4);
					}

					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) {
						var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = FriendSystem.field833.field1795[var3] ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) {
						if (class92.guestClanChannel != null) {
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 1;
							GrandExchangeOfferTotalQuantityComparator.field4769 = class92.guestClanChannel;
						} else {
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) {
						var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
						if (Client.currentClanChannels[var3] != null) {
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 1;
							GrandExchangeOfferTotalQuantityComparator.field4769 = Client.currentClanChannels[var3];
							Varcs.field1445 = var3;
						} else {
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) {
						Interpreter.Interpreter_stringStack[++class338.Interpreter_stringStackSize - 1] = GrandExchangeOfferTotalQuantityComparator.field4769.name;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) {
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = GrandExchangeOfferTotalQuantityComparator.field4769.field1851;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) {
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = GrandExchangeOfferTotalQuantityComparator.field4769.field1853;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) {
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = GrandExchangeOfferTotalQuantityComparator.field4769.method3704();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) {
						var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++class338.Interpreter_stringStackSize - 1] = ((ClanChannelMember)GrandExchangeOfferTotalQuantityComparator.field4769.members.get(var3)).username.getName();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) {
						var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = ((ClanChannelMember)GrandExchangeOfferTotalQuantityComparator.field4769.members.get(var3)).rank;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) {
						var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = ((ClanChannelMember)GrandExchangeOfferTotalQuantityComparator.field4769.members.get(var3)).world;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) {
						var3 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
						UserComparator9.method3238(Varcs.field1445, var3);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) {
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = GrandExchangeOfferTotalQuantityComparator.field4769.method3700(Interpreter.Interpreter_stringStack[--class338.Interpreter_stringStackSize]);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) {
						Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize - 1] = GrandExchangeOfferTotalQuantityComparator.field4769.getSortedMembers()[Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize - 1]];
						return 1;
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) {
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = class277.field3140 != null ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}

	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1061109567"
	)
	static final void method8359() {
		Iterator var0 = Client.worldViewManager.iterator();

		while (var0.hasNext()) {
			WorldView var1 = (WorldView)var0.next();

			for (int var2 = 0; var2 < Client.playerUpdateManager.playerCount; ++var2) {
				Player var3 = (Player)class509.topLevelWorldView.players.get((long)Client.playerUpdateManager.playerIndices[var2]);
				if (var3 != null) {
					var3.clearIsInFriendsChat();
				}
			}
		}

	}
}
