import java.util.ArrayList;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ct")
public class class53 extends Node {
	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	static Archive field362;
	@ObfuscatedName("pd")
	@ObfuscatedGetter(
		intValue = 110562469
	)
	static int field356;
	@ObfuscatedName("ts")
	@ObfuscatedSignature(
		descriptor = "Lbg;"
	)
	@Export("pcmStreamMixer")
	static PcmStreamMixer pcmStreamMixer;
	@ObfuscatedName("tk")
	@ObfuscatedGetter(
		intValue = -2101020919
	)
	static int field357;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lbf;"
	)
	class47 field360;

	public class53() {
		this.field360 = null;
	}

	@ObfuscatedSignature(
		descriptor = "(Lcy;)V"
	)
	class53(VorbisSample var1) {
		if (var1 != null) {
			this.field360 = new class47(var1, (RawSound)null);
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Lbi;)V"
	)
	public class53(RawSound var1) {
		this.field360 = new class47((VorbisSample)null, var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "400551362"
	)
	public boolean method1058() {
		return this.field360 == null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lbi;",
		garbageValue = "-95599119"
	)
	public RawSound method1059() {
		if (this.field360 != null && this.field360.field321.tryLock()) {
			RawSound var1;
			try {
				var1 = this.method1061();
			} finally {
				this.field360.field321.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Lbi;",
		garbageValue = "74"
	)
	public RawSound method1060() {
		if (this.field360 != null) {
			this.field360.field321.lock();

			RawSound var1;
			try {
				var1 = this.method1061();
			} finally {
				this.field360.field321.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lbi;",
		garbageValue = "-1176387587"
	)
	RawSound method1061() {
		if (this.field360.field320 == null) {
			this.field360.field320 = this.field360.field324.toRawSound((int[])null);
			this.field360.field324 = null;
		}

		return this.field360.field320;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ldw;IIB)V",
		garbageValue = "-42"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args;
		Script var4;
		if (LoginPacket.isWorldMapEvent(var0.type)) {
			Interpreter.worldMapEvent = (WorldMapEvent)var3[0];
			WorldMapElement var6 = Tiles.WorldMapElement_get(Interpreter.worldMapEvent.mapElement);
			var4 = class159.getWorldMapScript(var0.type, var6.objectId, var6.category);
		} else {
			int var5 = (Integer)var3[0];
			var4 = class268.getScript(var5);
		}

		if (var4 != null) {
			WallDecoration.runScriptLogic(var0, var4, var1, var2);
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lvj;I)Ljava/lang/String;",
		garbageValue = "-275836334"
	)
	public static String method1069(Buffer var0) {
		return class397.method7712(var0, 32767);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lpi;Lpi;Ltb;ZII)V",
		garbageValue = "-1319159873"
	)
	static void method1070(AbstractArchive var0, AbstractArchive var1, GraphicsDefaults var2, boolean var3, int var4) {
		if (Login.clearLoginScreen) {
			if (var4 == 4) {
				class329.updateLoginIndex(4);
			}

		} else {
			if (var4 == 0) {
				ItemContainer.updateLoginStatusUsernameRemembered(var3);
			} else {
				class329.updateLoginIndex(var4);
			}

			Rasterizer2D.Rasterizer2D_clear();
			byte[] var5 = var0.takeFileByNames("title.jpg", "");
			UserComparator10.leftTitleSprite = World.readSpritePixelsFromBytes(var5);
			UserComparator7.rightTitleSprite = UserComparator10.leftTitleSprite.mirrorHorizontally();
			int var6 = Client.worldProperties;
			if ((var6 & class552.field5424.rsOrdinal()) != 0) {
				HttpResponse.logoSprite = Fonts.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", "");
			} else if ((var6 & class552.field5454.rsOrdinal()) != 0) {
				HttpResponse.logoSprite = Fonts.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", "");
			} else if ((var6 & class552.field5432.rsOrdinal()) != 0) {
				HttpResponse.logoSprite = Fonts.SpriteBuffer_getIndexedSpriteByName(var1, "logo_speedrunning", "");
			} else {
				HttpResponse.logoSprite = Fonts.SpriteBuffer_getIndexedSpriteByName(var1, "logo", "");
			}

			GrandExchangeOfferNameComparator.titleboxSprite = Fonts.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", "");
			Login.titlebuttonSprite = Fonts.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", "");
			Login.field930 = Fonts.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", "");
			ClanChannelMember.field1690 = Fonts.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", "");
			Fonts.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", "");
			Login.runesSprite = class438.getFont(var1, "runes", "");
			Login.title_muteSprite = class438.getFont(var1, "title_mute", "");
			class227.options_buttons_0Sprite = Fonts.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", "");
			class309.field3285 = Fonts.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", "");
			Login.options_buttons_2Sprite = Fonts.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", "");
			class273.field3054 = Fonts.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", "");
			class188.field1953 = class227.options_buttons_0Sprite.subWidth;
			ParamComposition.field2122 = class227.options_buttons_0Sprite.subHeight;
			class96.loginScreenRunesAnimation = new LoginScreenAnimation(Login.runesSprite, var2.field5115);
			if (var3) {
				Login.Login_username = "";
				Login.Login_password = "";
				Login.field948 = new String[8];
				Login.field947 = 0;
			}

			Bounds.otpMedium = 0;
			Client.otp = "";
			Login.rememberUsername = true;
			Login.worldSelectOpen = false;
			if (!SecureUrlRequester.clientPreferences.isTitleMusicDisabled()) {
				ArrayList var7 = new ArrayList();
				var7.add(new MusicSong(FontName.archive6, "scape main", "", 255, false));
				UrlRequester.method3175(var7, 0, 0, 0, 100, false);
			} else {
				WorldMapSprite.method6235(0, 0);
			}

			FloorOverlayDefinition.method4257();
			class27.method396().method7669(false);
			Login.clearLoginScreen = true;
			Login.xPadding = (class329.canvasWidth - 765) / 2;
			Login.loginBoxX = Login.xPadding + 202;
			class217.loginBoxCenter = Login.loginBoxX + 180;
			UserComparator10.leftTitleSprite.drawAt(Login.xPadding, 0);
			UserComparator7.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			HttpResponse.logoSprite.drawAt(Login.xPadding + 382 - HttpResponse.logoSprite.subWidth / 2, 18);
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lpi;III)Lvr;",
		garbageValue = "715575787"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		return !class326.method6471(var0, var1, var2) ? null : AbstractSocket.method9235();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "5"
	)
	static int method1066(int var0, int var1, int var2) {
		int var3 = var0 >> 16 & 255;
		int var4 = var0 >> 8 & 255;
		int var5 = var0 & 255;
		int var6 = var1 >> 16 & 255;
		int var7 = var1 >> 8 & 255;
		int var8 = var1 & 255;
		int var9 = (var6 - var3 + 1) * var2 / 64 + var3 & 255;
		int var10 = (var7 - var4 + 1) * var2 / 64 + var4 & 255;
		int var11 = (var8 - var5 + 1) * var2 / 64 + var5 & 255;
		return var9 << 16 | var10 << 8 | var11;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1828464822"
	)
	static int method1064(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return 0;
		} else if (var1 == -1) {
			return 0;
		} else {
			int var3 = 0;

			for (int var4 = 0; var4 < var2.quantities.length; ++var4) {
				if (var2.ids[var4] == var1) {
					var3 += var2.quantities[var4];
				}
			}

			return var3;
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZS)I",
		garbageValue = "26964"
	)
	static int method1068(int var0, Script var1, boolean var2) {
		String var3;
		int var10;
		if (var0 == ScriptOpcodes.APPEND_NUM) {
			var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
			var10 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3 + var10;
			return 1;
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) {
				Interpreter.Interpreter_stringStackSize -= 2;
				var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize];
				var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1];
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3 + var4;
				return 1;
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) {
				var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
				var10 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3 + class31.intToString(var10, true);
				return 1;
			} else if (var0 == ScriptOpcodes.LOWERCASE) {
				var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.toLowerCase();
				return 1;
			} else {
				int var6;
				int var11;
				if (var0 == ScriptOpcodes.FROMDATE) {
					var11 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
					long var14 = 86400000L * (11745L + (long)var11);
					Interpreter.Interpreter_calendar.setTime(new Date(var14));
					var6 = Interpreter.Interpreter_calendar.get(5);
					int var17 = Interpreter.Interpreter_calendar.get(2);
					int var8 = Interpreter.Interpreter_calendar.get(1);
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8;
					return 1;
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) {
					if (var0 == ScriptOpcodes.TOSTRING) {
						var11 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = Integer.toString(var11);
						return 1;
					} else if (var0 == ScriptOpcodes.COMPARE) {
						Interpreter.Interpreter_stringStackSize -= 2;
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Occluder.method5165(class73.compareStrings(Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1], class276.clientLanguage));
						return 1;
					} else {
						int var9;
						byte[] var12;
						Font var13;
						if (var0 == ScriptOpcodes.PARAHEIGHT) {
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
							PrivateChatMode.Interpreter_intStackSize -= 2;
							var10 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
							var12 = class213.archive13.takeFile(var9, 0);
							var13 = new Font(var12);
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var13.lineCount(var3, var10);
							return 1;
						} else if (var0 == ScriptOpcodes.PARAWIDTH) {
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
							PrivateChatMode.Interpreter_intStackSize -= 2;
							var10 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
							var12 = class213.archive13.takeFile(var9, 0);
							var13 = new Font(var12);
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var13.lineWidth(var3, var10);
							return 1;
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) {
							Interpreter.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1];
							if (Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1) {
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4;
							}

							return 1;
						} else if (var0 == ScriptOpcodes.ESCAPE) {
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3);
							return 1;
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) {
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
							var10 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3 + (char)var10;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) {
							var11 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = class280.isCharPrintable((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) {
							var11 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = class329.isAlphaNumeric((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) {
							var11 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = class96.isCharAlphabetic((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) {
							var11 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = SoundSystem.isDigit((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) {
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
							if (var3 != null) {
								Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
							}

							return 1;
						} else if (var0 == ScriptOpcodes.SUBSTRING) {
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
							PrivateChatMode.Interpreter_intStackSize -= 2;
							var10 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.substring(var10, var9);
							return 1;
						} else if (var0 == ScriptOpcodes.REMOVETAGS) {
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
							StringBuilder var16 = new StringBuilder(var3.length());
							boolean var18 = false;

							for (var6 = 0; var6 < var3.length(); ++var6) {
								char var7 = var3.charAt(var6);
								if (var7 == '<') {
									var18 = true;
								} else if (var7 == '>') {
									var18 = false;
								} else if (!var18) {
									var16.append(var7);
								}
							}

							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var16.toString();
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) {
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
							var10 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3.indexOf(var10);
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) {
							Interpreter.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1];
							var9 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3.indexOf(var4, var9);
							return 1;
						} else if (var0 == 4122) {
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.toUpperCase();
							return 1;
						} else if (var0 == 4123) {
							Interpreter.Interpreter_stringStackSize -= 3;
							var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1];
							String var5 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 2];
							if (AsyncHttpResponse.localPlayer.appearance == null) {
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5;
								return 1;
							} else {
								switch(AsyncHttpResponse.localPlayer.appearance.field3804) {
								case 0:
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3;
									break;
								case 1:
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4;
									break;
								case 2:
								default:
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5;
								}

								return 1;
							}
						} else if (var0 == 4124) {
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = AsyncHttpResponse.localPlayer.appearance != null ? AsyncHttpResponse.localPlayer.appearance.field3804 : -1;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					Interpreter.Interpreter_stringStackSize -= 2;
					var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize];
					var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1];
					if (AsyncHttpResponse.localPlayer.appearance != null && AsyncHttpResponse.localPlayer.appearance.gender != 0) {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4;
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3;
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-743084580"
	)
	static final void method1057() {
		Actor.method2695();
	}
}
