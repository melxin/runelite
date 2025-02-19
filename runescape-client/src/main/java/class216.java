import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import org.json.JSONObject;

@ObfuscatedName("iu")
public class class216 {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	class225 field2404;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	class227 field2398;
	@ObfuscatedName("ax")
	int field2406;
	@ObfuscatedName("ai")
	String field2407;
	@ObfuscatedName("ak")
	String field2409;
	@ObfuscatedName("aj")
	String field2410;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	UrlRequest field2399;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 26331031
	)
	int field2411;

	public class216() {
		this.field2406 = -2029745297;
		this.field2411 = 0;
	}

	@ObfuscatedSignature(
		descriptor = "(Liu;)V"
	)
	public class216(class216 var1) {
		this.field2406 = -2029745297;
		this.field2411 = 0;
		if (var1 != null) {
			this.field2404 = var1.field2404;
			this.field2398 = var1.field2398;
			this.field2406 = var1.field2406;
			this.field2407 = var1.field2407;
			this.field2409 = var1.field2409;
			this.field2410 = var1.field2410;
			this.field2399 = null;
			this.field2411 = var1.field2411;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lir;",
		garbageValue = "913657919"
	)
	public class225 method4433() {
		return this.field2404;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Lec;I)Z",
		garbageValue = "-1114747868"
	)
	public boolean method4385(String var1, String var2, UrlRequester var3) {
		if (var1 != null && !var1.isEmpty()) {
			if (var3 == null) {
				return false;
			} else {
				this.method4412();

				try {
					this.field2407 = var1;
					this.field2399 = var3.request(new URL(this.field2407));
					this.field2406 = 0;
				} catch (MalformedURLException var5) {
					this.method4412();
					this.field2406 = -470953404;
					return false;
				}

				if (!var2.isEmpty()) {
					this.field2410 = var2;
				}

				return true;
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-821006704"
	)
	public void method4392(String var1, String var2, String var3) {
		this.field2404 = class152.method3501();
		this.field2409 = var1;
		this.field2404.method4516(this.field2409, var2, var3);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lec;I)V",
		garbageValue = "1856754216"
	)
	public void method4426(UrlRequester var1) {
		switch(this.field2406 * -1388393359) {
		case 0:
			this.method4413(var1);
			break;
		case 1:
			this.method4400();
			break;
		default:
			return;
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2117088221"
	)
	public int method4388() {
		return this.field2406 * -1388393359;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1707211813"
	)
	public boolean method4431() {
		return this.field2398 != null;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1731543346"
	)
	public int method4390(String var1) {
		return this.field2398.field2486.containsKey(var1) ? (Integer)this.field2398.field2486.get(var1) : -1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-371149541"
	)
	public String method4391(String var1) {
		return (String)((String)(this.field2398.field2483.containsKey(var1) ? this.field2398.field2483.get(var1) : null));
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "2"
	)
	public ArrayList method4387() {
		return this.field2398.field2479;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "-1899240178"
	)
	public ArrayList method4393() {
		return this.field2398.field2478;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "-560982865"
	)
	public ArrayList method4394() {
		return this.field2398.field2487;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1626050555"
	)
	public String method4395() {
		return this.field2398.field2484;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "13"
	)
	public float[] method4389() {
		return this.field2398.field2485;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-2088629520"
	)
	public String method4397() {
		return this.field2398.method4553();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "100"
	)
	void method4412() {
		this.field2399 = null;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lec;S)V",
		garbageValue = "62"
	)
	void method4413(UrlRequester var1) {
		if (this.field2399 != null && this.field2399.isDone()) {
			byte[] var2 = this.field2399.getResponse();
			if (var2 == null) {
				this.method4412();
				this.field2406 = -470953404;
			} else {
				try {
					HttpJsonRequestBody var3 = new HttpJsonRequestBody(var2);
					JSONObject var4 = var3.getBody();
					if (var4 == null) {
						return;
					}

					try {
						this.field2411 = var4.getInt("version");
					} catch (Exception var6) {
						this.method4412();
						this.field2406 = -706430106;
						return;
					}

					if (this.field2411 < 2) {
						if (!this.field2398.method4556(var4, this.field2411, var1)) {
							this.field2406 = -706430106;
						}
					} else if (this.field2411 == 2) {
						class229 var5 = WorldMapSectionType.method6239();
						var5.method4595(var4, this.field2411, var1);
						this.field2398 = var5.method4597(this.field2410);
						if (this.field2398 != null) {
							this.method4400();
							this.field2406 = 2029745297;
						} else {
							this.field2406 = 1323315191;
						}
					}
				} catch (UnsupportedEncodingException var7) {
					this.method4412();
					this.field2406 = -706430106;
					return;
				}

				if (this.field2398 != null) {
					this.field2406 = (this.field2398.field2479.size() > 0 ? 1 : 2) * 2029745297;
				}

				this.field2399 = null;
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "62"
	)
	void method4400() {
		Iterator var1 = this.field2398.field2479.iterator();

		class217 var2;
		do {
			if (!var1.hasNext()) {
				var1 = this.field2398.field2479.iterator();

				while (var1.hasNext()) {
					var2 = (class217)var1.next();
					if (var2.field2414 != null) {
						byte[] var3 = var2.field2414.getResponse();
						if (var3 != null && var3.length > 0) {
							this.field2406 = -235476702;
							return;
						}
					}
				}

				this.method4412();
				this.field2406 = 1558791893;
				return;
			}

			var2 = (class217)var1.next();
		} while(var2.field2414 == null || var2.field2414.isDone());

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lec;B)Z",
		garbageValue = "-34"
	)
	public boolean method4399(String var1, UrlRequester var2) {
		try {
			JSONObject var3 = (new HttpJsonRequestBody(var1.getBytes())).getBody();

			try {
				this.field2411 = var3.getInt("version");
			} catch (Exception var5) {
				this.method4412();
				this.field2406 = -706430106;
				return false;
			}

			if (!this.field2398.method4556(var3, this.field2411, var2)) {
				this.field2406 = -706430106;
			}

			this.field2406 = (this.field2398.field2479.size() > 0 ? 1 : 2) * 2029745297;
		} catch (UnsupportedEncodingException var6) {
			this.field2406 = -706430106;
		}

		return this.field2406 * -1388393359 < 3;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ILdy;ZI)I",
		garbageValue = "-1757189916"
	)
	static int method4436(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) {
			if (class196.guestClanSettings != null) {
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 1;
				class144.field1684 = class196.guestClanSettings;
			} else {
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) {
				var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
				if (Client.currentClanSettings[var3] != null) {
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 1;
					class144.field1684 = Client.currentClanSettings[var3];
				} else {
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) {
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class144.field1684.name;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) {
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = class144.field1684.allowGuests ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) {
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = class144.field1684.field1795;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) {
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = class144.field1684.field1805;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) {
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = class144.field1684.field1797;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) {
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = class144.field1684.field1796;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) {
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = class144.field1684.memberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class144.field1684.memberNames[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) {
				var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = class144.field1684.memberRanks[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) {
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = class144.field1684.bannedMemberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class144.field1684.bannedMemberNames[var3];
				return 1;
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) {
					HealthBarConfig.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 2];
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = class144.field1684.method3550(var3, var6, var5);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = class144.field1684.currentOwner;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = class144.field1684.field1807;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = class144.field1684.method3546(Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize - 1] = class144.field1684.getSortedMembers()[Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize - 1]];
					return 1;
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) {
					HealthBarConfig.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
					WorldMapEvent.method6421(var6, var3);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) {
					var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = class144.field1684.memberJoinDates[var3];
					return 1;
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) {
						HealthBarConfig.Interpreter_intStackSize -= 3;
						var3 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
						boolean var4 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1] == 1;
						var5 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 2];
						ChatChannel.method2352(var5, var3, var4);
					}

					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) {
						var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = class144.field1684.field1792[var3] ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) {
						if (HttpMethod.guestClanChannel != null) {
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 1;
							ModeWhere.field4846 = HttpMethod.guestClanChannel;
						} else {
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) {
						var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
						if (Client.currentClanChannels[var3] != null) {
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 1;
							ModeWhere.field4846 = Client.currentClanChannels[var3];
							Interpreter.field878 = var3;
						} else {
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ModeWhere.field4846.name;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) {
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = ModeWhere.field4846.field1857;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) {
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = ModeWhere.field4846.field1863;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) {
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = ModeWhere.field4846.method3665();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) {
						var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ((ClanChannelMember)ModeWhere.field4846.members.get(var3)).username.getName();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) {
						var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = ((ClanChannelMember)ModeWhere.field4846.members.get(var3)).rank;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) {
						var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = ((ClanChannelMember)ModeWhere.field4846.members.get(var3)).world;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) {
						var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
						HttpRequest.method98(Interpreter.field878, var3);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) {
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = ModeWhere.field4846.method3661(Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) {
						Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize - 1] = ModeWhere.field4846.getSortedMembers()[Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize - 1]];
						return 1;
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) {
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = EnumComposition.field2010 != null ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}
}
