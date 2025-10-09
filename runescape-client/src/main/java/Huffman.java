import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ou")
@Implements("Huffman")
public class Huffman {
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "Lxc;"
	)
	@Export("titlebuttonSprite")
	static IndexedSprite titlebuttonSprite;
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "[Lxc;"
	)
	@Export("worldSelectArrows")
	static IndexedSprite[] worldSelectArrows;
	@ObfuscatedName("lp")
	@ObfuscatedGetter(
		intValue = 2116644007
	)
	@Export("cameraX")
	static int cameraX;
	@ObfuscatedName("ab")
	@Export("masks")
	int[] masks;
	@ObfuscatedName("at")
	@Export("bits")
	byte[] bits;
	@ObfuscatedName("ag")
	@Export("keys")
	int[] keys;

	public Huffman(byte[] var1) {
		int var2 = var1.length;
		this.masks = new int[var2];
		this.bits = var1;
		int[] var3 = new int[33];
		this.keys = new int[8];
		int var4 = 0;

		for (int var5 = 0; var5 < var2; ++var5) {
			byte var6 = var1[var5];
			if (var6 != 0) {
				int var7 = 1 << 32 - var6;
				int var8 = var3[var6];
				this.masks[var5] = var8;
				int var9;
				int var10;
				int var11;
				int var12;
				if ((var8 & var7) != 0) {
					var9 = var3[var6 - 1];
				} else {
					var9 = var8 | var7;

					for (var10 = var6 - 1; var10 >= 1; --var10) {
						var11 = var3[var10];
						if (var8 != var11) {
							break;
						}

						var12 = 1 << 32 - var10;
						if ((var11 & var12) != 0) {
							var3[var10] = var3[var10 - 1];
							break;
						}

						var3[var10] = var11 | var12;
					}
				}

				var3[var6] = var9;

				for (var10 = var6 + 1; var10 <= 32; ++var10) {
					if (var8 == var3[var10]) {
						var3[var10] = var9;
					}
				}

				var10 = 0;

				for (var11 = 0; var11 < var6; ++var11) {
					var12 = Integer.MIN_VALUE >>> var11;
					if ((var8 & var12) != 0) {
						if (this.keys[var10] == 0) {
							this.keys[var10] = var4;
						}

						var10 = this.keys[var10];
					} else {
						++var10;
					}

					if (var10 >= this.keys.length) {
						int[] var13 = new int[this.keys.length * 2];

						for (int var14 = 0; var14 < this.keys.length; ++var14) {
							var13[var14] = this.keys[var14];
						}

						this.keys = var13;
					}

					var12 >>>= 1;
				}

				this.keys[var10] = ~var5;
				if (var10 >= var4) {
					var4 = var10 + 1;
				}
			}
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([BII[BII)I",
		garbageValue = "681081543"
	)
	@Export("compress")
	int compress(byte[] var1, int var2, int var3, byte[] var4, int var5) {
		int var6 = 0;
		int var7 = var5 << 3;

		for (var3 += var2; var2 < var3; ++var2) {
			int var8 = var1[var2] & 255;
			int var9 = this.masks[var8];
			byte var10 = this.bits[var8];
			if (var10 == 0) {
				throw new RuntimeException("" + var8);
			}

			int var11 = var7 >> 3;
			int var12 = var7 & 7;
			var6 &= -var12 >> 31;
			int var13 = (var10 + var12 - 1 >> 3) + var11;
			var12 += 24;
			var4[var11] = (byte)(var6 |= var9 >>> var12);
			if (var11 < var13) {
				++var11;
				var12 -= 8;
				var4[var11] = (byte)(var6 = var9 >>> var12);
				if (var11 < var13) {
					++var11;
					var12 -= 8;
					var4[var11] = (byte)(var6 = var9 >>> var12);
					if (var11 < var13) {
						++var11;
						var12 -= 8;
						var4[var11] = (byte)(var6 = var9 >>> var12);
						if (var11 < var13) {
							++var11;
							var12 -= 8;
							var4[var11] = (byte)(var6 = var9 << -var12);
						}
					}
				}
			}

			var7 += var10;
		}

		return (var7 + 7 >> 3) - var5;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([BI[BIII)I",
		garbageValue = "1104162750"
	)
	@Export("decompress")
	int decompress(byte[] var1, int var2, byte[] var3, int var4, int var5) {
		if (var5 == 0) {
			return 0;
		} else {
			int var6 = 0;
			var5 += var4;
			int var7 = var2;

			while (true) {
				byte var8 = var1[var7];
				if (var8 < 0) {
					var6 = this.keys[var6];
				} else {
					++var6;
				}

				int var9;
				if ((var9 = this.keys[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if ((var8 & 64) != 0) {
					var6 = this.keys[var6];
				} else {
					++var6;
				}

				if ((var9 = this.keys[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if ((var8 & 32) != 0) {
					var6 = this.keys[var6];
				} else {
					++var6;
				}

				if ((var9 = this.keys[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if ((var8 & 16) != 0) {
					var6 = this.keys[var6];
				} else {
					++var6;
				}

				if ((var9 = this.keys[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if ((var8 & 8) != 0) {
					var6 = this.keys[var6];
				} else {
					++var6;
				}

				if ((var9 = this.keys[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if ((var8 & 4) != 0) {
					var6 = this.keys[var6];
				} else {
					++var6;
				}

				if ((var9 = this.keys[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if ((var8 & 2) != 0) {
					var6 = this.keys[var6];
				} else {
					++var6;
				}

				if ((var9 = this.keys[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				if ((var8 & 1) != 0) {
					var6 = this.keys[var6];
				} else {
					++var6;
				}

				if ((var9 = this.keys[var6]) < 0) {
					var3[var4++] = (byte)(~var9);
					if (var4 >= var5) {
						break;
					}

					var6 = 0;
				}

				++var7;
			}

			return var7 + 1 - var2;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILok;IIIII[FI)Lok;",
		garbageValue = "-609597496"
	)
	static Widget method8146(int var0, Widget var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
		Widget var8 = new Widget();
		var8.type = var0;
		var8.parentId = var1.id;
		var8.childIndex = var2 * 517036931;
		var8.isIf3 = true;
		var8.xAlignment = var3;
		var8.yAlignment = var4;
		var8.widthAlignment = var5;
		var8.heightAlignment = var6;
		var8.rawX = (int)((float)var1.width * var7[0]);
		var8.rawY = (int)((float)(var1.height * -171267385) * var7[1]);
		var8.rawWidth = (int)(var7[2] * (float)var1.width);
		var8.rawHeight = (int)((float)(var1.height * -171267385) * var7[3]);
		return var8;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ILcj;ZB)I",
		garbageValue = "66"
	)
	static int method8137(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) {
			var3 = class35.widgetDefinition.method7496(Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize]);
			Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) {
			var3 = class35.widgetDefinition.method7496(Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize]);
			if (var3.itemId != -1) {
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else {
			int var7;
			if (var0 == ScriptOpcodes.IF_HASSUB) {
				var7 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
				InterfaceParent var10 = (InterfaceParent)Client.interfaceParents.get((long)var7);
				if (var10 != null) {
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 1;
				} else {
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == 2703) {
				UrlRequest.Interpreter_intStackSize -= 3;
				var7 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
				Widget var8 = class35.widgetDefinition.getWidgetChild(Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 2]);
				ParamComposition var9 = VarpDefinition.getParamDefinition(var7);
				if (var9.isString()) {
					Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var8.method7941(var7, var9.defaultStr);
				} else {
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var8.method7942(var7, var9.defaultInt);
				}

				return 1;
			} else if (var0 == 2704) {
				UrlRequest.Interpreter_intStackSize -= 3;
				var3 = class35.widgetDefinition.getWidgetChild(Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize], Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1]);
				int var4 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 2];
				Object var5 = WorldMap.method10995(var4);
				int var6 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
				var3.method7943(var6, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.IF_GETTOP) {
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Client.rootInterface;
				return 1;
			} else if (var0 == 2707) {
				var3 = class35.widgetDefinition.method7496(Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.method7951() ? 1 : 0;
				return 1;
			} else if (var0 == 2708) {
				var3 = class35.widgetDefinition.method7496(Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize]);
				return World.method1553(var3);
			} else if (var0 == 2709) {
				var3 = class35.widgetDefinition.method7496(Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize]);
				return class210.method4670(var3);
			} else {
				return 2;
			}
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ILcj;ZI)I",
		garbageValue = "-1965084583"
	)
	static int method8139(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) {
			if (class377.guestClanSettings != null) {
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 1;
				ByteArrayPool.field5368 = class377.guestClanSettings;
			} else {
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) {
				var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
				if (Client.currentClanSettings[var3] != null) {
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 1;
					ByteArrayPool.field5368 = Client.currentClanSettings[var3];
				} else {
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) {
				Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = ByteArrayPool.field5368.name;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) {
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = ByteArrayPool.field5368.allowGuests ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) {
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = ByteArrayPool.field5368.field1846;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) {
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = ByteArrayPool.field5368.field1857;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) {
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = ByteArrayPool.field5368.field1858;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) {
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = ByteArrayPool.field5368.field1849;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) {
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = ByteArrayPool.field5368.memberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
				Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = ByteArrayPool.field5368.memberNames[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) {
				var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = ByteArrayPool.field5368.memberRanks[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) {
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = ByteArrayPool.field5368.bannedMemberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
				Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = ByteArrayPool.field5368.bannedMemberNames[var3];
				return 1;
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) {
					UrlRequest.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 2];
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = ByteArrayPool.field5368.method3984(var3, var6, var5);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = ByteArrayPool.field5368.currentOwner;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = ByteArrayPool.field5368.field1841;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = ByteArrayPool.field5368.method3983((String)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize]);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize - 1] = ByteArrayPool.field5368.getSortedMembers()[Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize - 1]];
					return 1;
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) {
					UrlRequest.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
					AsyncHttpResponse.method276(var6, var3);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) {
					var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = ByteArrayPool.field5368.memberJoinDates[var3];
					return 1;
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) {
						UrlRequest.Interpreter_intStackSize -= 3;
						var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
						boolean var4 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1] == 1;
						var5 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 2];
						AbstractByteArrayCopier.method8124(var5, var3, var4);
					}

					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) {
						var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = ByteArrayPool.field5368.field1855[var3] ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) {
						if (class341.guestClanChannel != null) {
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 1;
							class448.field5206 = class341.guestClanChannel;
						} else {
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) {
						var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
						if (Client.currentClanChannels[var3] != null) {
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 1;
							class448.field5206 = Client.currentClanChannels[var3];
							Friend.field5441 = var3;
						} else {
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) {
						Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = class448.field5206.name;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) {
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = class448.field5206.field1916;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) {
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = class448.field5206.field1917;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) {
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = class448.field5206.method4121();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) {
						var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
						Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = ((ClanChannelMember)class448.field5206.members.get(var3)).username.getName();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) {
						var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = ((ClanChannelMember)class448.field5206.members.get(var3)).rank;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) {
						var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = ((ClanChannelMember)class448.field5206.members.get(var3)).world;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) {
						var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
						PcmPlayer.method3149(Friend.field5441, var3);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) {
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = class448.field5206.method4120((String)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize]);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) {
						Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize - 1] = class448.field5206.getSortedMembers()[Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize - 1]];
						return 1;
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) {
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = class389.field4498 != null ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}
}
