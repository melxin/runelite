import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("uf")
public class class539 extends class497 implements class311 {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	final AbstractArchive field5385;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lmf;"
	)
	final DemotingHashTable field5383;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 646094095
	)
	final int field5384;

	@ObfuscatedSignature(
		descriptor = "(Lol;ILph;Lpq;)V"
	)
	public class539(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0);
		this.field5383 = new DemotingHashTable(64);
		this.field5385 = var4;
		this.field5384 = var2;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)Lts;",
		garbageValue = "-1"
	)
	protected class499 vmethod10080(int var1) {
		synchronized(this.field5383) {
			class498 var2 = (class498)this.field5383.get((long)var1);
			if (var2 == null) {
				var2 = this.method10081(var1);
				this.field5383.method6549(var2, (long)var1);
			}

			return var2;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Lto;",
		garbageValue = "280173339"
	)
	class498 method10081(int var1) {
		byte[] var2 = this.field5385.takeFile(this.field5384, var1);
		class498 var3 = new class498(var1);
		if (var2 != null) {
			var3.method9530(new Buffer(var2));
		}

		return var3;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1867919389"
	)
	public void method10082() {
		synchronized(this.field5383) {
			this.field5383.clear();
		}
	}

	public Iterator iterator() {
		return new class538(this);
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZI)I",
		garbageValue = "-1346583378"
	)
	static int method10085(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) {
			if (InvDefinition.guestClanSettings != null) {
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 1;
				WorldMapLabelSize.field3082 = InvDefinition.guestClanSettings;
			} else {
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) {
				var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
				if (Client.currentClanSettings[var3] != null) {
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 1;
					WorldMapLabelSize.field3082 = Client.currentClanSettings[var3];
				} else {
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) {
				Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = WorldMapLabelSize.field3082.name;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) {
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = WorldMapLabelSize.field3082.allowGuests ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) {
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = WorldMapLabelSize.field3082.field1742;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) {
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = WorldMapLabelSize.field3082.field1753;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) {
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = WorldMapLabelSize.field3082.field1744;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) {
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = WorldMapLabelSize.field3082.field1745;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) {
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = WorldMapLabelSize.field3082.memberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = WorldMapLabelSize.field3082.memberNames[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) {
				var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = WorldMapLabelSize.field3082.memberRanks[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) {
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = WorldMapLabelSize.field3082.bannedMemberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = WorldMapLabelSize.field3082.bannedMemberNames[var3];
				return 1;
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) {
					ScriptFrame.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 2];
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = WorldMapLabelSize.field3082.method3711(var3, var6, var5);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = WorldMapLabelSize.field3082.currentOwner;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = WorldMapLabelSize.field3082.field1760;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = WorldMapLabelSize.field3082.method3712(Interpreter.Interpreter_stringStack[--HealthBarConfig.Interpreter_stringStackSize]);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize - 1] = WorldMapLabelSize.field3082.getSortedMembers()[Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize - 1]];
					return 1;
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) {
					ScriptFrame.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
					class506.method9591(var6, var3);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) {
					var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = WorldMapLabelSize.field3082.memberJoinDates[var3];
					return 1;
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) {
						ScriptFrame.Interpreter_intStackSize -= 3;
						var3 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
						boolean var4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1] == 1;
						var5 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 2];
						MouseHandler.method678(var5, var3, var4);
					}

					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) {
						var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = WorldMapLabelSize.field3082.field1749[var3] ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) {
						if (class106.guestClanChannel != null) {
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 1;
							AbstractByteArrayCopier.field4045 = class106.guestClanChannel;
						} else {
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) {
						var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
						if (Client.currentClanChannels[var3] != null) {
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 1;
							AbstractByteArrayCopier.field4045 = Client.currentClanChannels[var3];
							SpriteBufferProperties.field5585 = var3;
						} else {
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) {
						Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = AbstractByteArrayCopier.field4045.name;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) {
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = AbstractByteArrayCopier.field4045.field1813;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) {
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = AbstractByteArrayCopier.field4045.field1812;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) {
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = AbstractByteArrayCopier.field4045.method3837();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) {
						var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = ((ClanChannelMember)AbstractByteArrayCopier.field4045.members.get(var3)).username.getName();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) {
						var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = ((ClanChannelMember)AbstractByteArrayCopier.field4045.members.get(var3)).rank;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) {
						var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = ((ClanChannelMember)AbstractByteArrayCopier.field4045.members.get(var3)).world;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) {
						var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
						WorldMapAreaData.method6494(SpriteBufferProperties.field5585, var3);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) {
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = AbstractByteArrayCopier.field4045.method3850(Interpreter.Interpreter_stringStack[--HealthBarConfig.Interpreter_stringStackSize]);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) {
						Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize - 1] = AbstractByteArrayCopier.field4045.getSortedMembers()[Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize - 1]];
						return 1;
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) {
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Client.field803 != null ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}
}
