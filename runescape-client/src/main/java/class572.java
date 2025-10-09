import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("we")
public class class572 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lwe;"
	)
	public static final class572 field5879;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lwe;"
	)
	public static final class572 field5878;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lwe;"
	)
	public static final class572 field5877;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lwe;"
	)
	static final class572 field5880;
	@ObfuscatedName("ce")
	@Export("otp")
	static String otp;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -813455077
	)
	public final int field5881;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 230425783
	)
	public final int field5882;
	@ObfuscatedName("ae")
	public final Class field5885;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lvb;"
	)
	public final class567 field5884;

	static {
		field5879 = new class572(2, 0, Integer.class, new class568());
		field5878 = new class572(3, 1, Long.class, new class571());
		field5877 = new class572(1, 2, String.class, new class573());
		field5880 = new class572(0, 5, DynamicArray.class, new class569());
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/Class;Lvb;)V"
	)
	class572(int var1, int var2, Class var3, class567 var4) {
		this.field5881 = var1;
		this.field5882 = var2;
		this.field5885 = var3;
		this.field5884 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1012656358"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5882;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)Ljava/lang/Object;",
		garbageValue = "-1835607459"
	)
	public Object method11191(Buffer var1) {
		return this.field5884.vmethod11209(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpe;Lpe;Lun;ZII)V",
		garbageValue = "-1358426060"
	)
	static void method11199(AbstractArchive var0, AbstractArchive var1, GraphicsDefaults var2, boolean var3, int var4) {
		if (class226.clearLoginScreen) {
			if (var4 == 4) {
				class146.method3876(4);
			}

		} else {
			if (var4 == 0) {
				DevicePcmPlayerProvider.updateLoginStatusUsernameRemembered(var3);
			} else {
				class146.method3876(var4);
			}

			Rasterizer2D.Rasterizer2D_clear();
			byte[] var5 = var0.takeFileByNames("title.jpg", "");
			HttpMethod.leftTitleSprite = EnumComposition.readSpritePixelsFromBytes(var5);
			class156.rightTitleSprite = HttpMethod.leftTitleSprite.mirrorHorizontally();
			int var6 = Client.worldProperties;
			if ((var6 & class580.field5942.rsOrdinal()) != 0) {
				class1.logoSprite = class334.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", "");
			} else if ((var6 & class580.field5944.rsOrdinal()) != 0) {
				class1.logoSprite = class334.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", "");
			} else if ((var6 & class580.field5927.rsOrdinal()) != 0) {
				class1.logoSprite = class334.SpriteBuffer_getIndexedSpriteByName(var1, "logo_speedrunning", "");
			} else if ((var6 & class580.field5924.rsOrdinal()) != 0) {
				class1.logoSprite = class334.SpriteBuffer_getIndexedSpriteByName(var1, "logo_ugc_world", "");
			} else {
				class1.logoSprite = class334.SpriteBuffer_getIndexedSpriteByName(var1, "logo", "");
			}

			class546.titleboxSprite = class334.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", "");
			Huffman.titlebuttonSprite = class334.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", "");
			class4.field10 = class334.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", "");
			InvDefinition.field1954 = class334.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", "");
			class334.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", "");
			class255.runesSprite = ArchiveDiskAction.getFont(var1, "runes", "");
			VarpDefinition.title_muteSprite = ArchiveDiskAction.getFont(var1, "title_mute", "");
			GrandExchangeOfferOwnWorldComparator.options_buttons_0Sprite = class334.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", "");
			Sound.field1826 = class334.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", "");
			WorldViewManager.options_buttons_2Sprite = class334.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", "");
			class409.field4989 = class334.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", "");
			VarbitComposition.field2252 = GrandExchangeOfferOwnWorldComparator.options_buttons_0Sprite.subWidth;
			FileSystem.field3123 = GrandExchangeOfferOwnWorldComparator.options_buttons_0Sprite.subHeight;
			JagNetThread.loginScreenRunesAnimation = new LoginScreenAnimation(class255.runesSprite, var2.field5609);
			if (var3) {
				Login.Login_username = "";
				Login.Login_password = "";
				Login.field714 = new String[8];
				Login.field715 = 0;
			}

			AABB.otpMedium = 0;
			otp = "";
			Login.rememberUsername = true;
			Login.worldSelectOpen = false;
			class188.method4333();
			WorldMapSectionType.method6800();
			class486.method9899().method8489(false);
			class226.clearLoginScreen = true;
			Login.xPadding = (class4.canvasWidth - 765) / 2;
			Login.loginBoxX = Login.xPadding + 202;
			ReflectionCheck.loginBoxCenter = Login.loginBoxX + 180;
			HttpMethod.leftTitleSprite.drawAt(Login.xPadding, 0);
			class156.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			class1.logoSprite.drawAt(Login.xPadding + 382 - class1.logoSprite.subWidth / 2, 18);
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "24"
	)
	@Export("ItemContainer_getCount")
	static int ItemContainer_getCount(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)[Lwe;",
		garbageValue = "641252102"
	)
	public static class572[] method11189() {
		return new class572[]{field5880, field5877, field5879, field5878};
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;B)Lwe;",
		garbageValue = "48"
	)
	public static class572 method11202(Class var0) {
		class572[] var1 = method11189();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			class572 var3 = var1[var2];
			if (var3.field5885 == var0) {
				return var3;
			}
		}

		return null;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ILcj;ZB)I",
		garbageValue = "-23"
	)
	static int method11194(int var0, Script var1, boolean var2) {
		String var3;
		int var10;
		if (var0 == ScriptOpcodes.APPEND_NUM) {
			var3 = (String)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize];
			var10 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
			Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var3 + var10;
			return 1;
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) {
				Message.Interpreter_objectStackSize -= 2;
				var3 = (String)Interpreter.Interpreter_objectStack[Message.Interpreter_objectStackSize];
				var4 = (String)Interpreter.Interpreter_objectStack[Message.Interpreter_objectStackSize + 1];
				Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var3 + var4;
				return 1;
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) {
				var3 = (String)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize];
				var10 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
				Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var3 + class143.intToString(var10, true);
				return 1;
			} else if (var0 == ScriptOpcodes.LOWERCASE) {
				var3 = (String)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize];
				Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var3.toLowerCase();
				return 1;
			} else {
				int var6;
				int var11;
				if (var0 == ScriptOpcodes.FROMDATE) {
					var11 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
					long var14 = 86400000L * ((long)var11 + 11745L);
					Interpreter.Interpreter_calendar.setTime(new Date(var14));
					var6 = Interpreter.Interpreter_calendar.get(5);
					int var17 = Interpreter.Interpreter_calendar.get(2);
					int var8 = Interpreter.Interpreter_calendar.get(1);
					Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8;
					return 1;
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) {
					if (var0 == ScriptOpcodes.TOSTRING) {
						var11 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
						Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = Integer.toString(var11);
						return 1;
					} else if (var0 == ScriptOpcodes.COMPARE) {
						Message.Interpreter_objectStackSize -= 2;
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = TextureProvider.method5490(Frames.compareStrings((String)Interpreter.Interpreter_objectStack[Message.Interpreter_objectStackSize], (String)Interpreter.Interpreter_objectStack[Message.Interpreter_objectStackSize + 1], class179.clientLanguage));
						return 1;
					} else {
						int var9;
						byte[] var12;
						Font var13;
						if (var0 == ScriptOpcodes.PARAHEIGHT) {
							var3 = (String)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize];
							UrlRequest.Interpreter_intStackSize -= 2;
							var10 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
							var12 = Canvas.archive13.takeFile(var9, 0);
							var13 = new Font(var12);
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var13.lineCount(var3, var10);
							return 1;
						} else if (var0 == ScriptOpcodes.PARAWIDTH) {
							var3 = (String)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize];
							UrlRequest.Interpreter_intStackSize -= 2;
							var10 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
							var12 = Canvas.archive13.takeFile(var9, 0);
							var13 = new Font(var12);
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var13.lineWidth(var3, var10);
							return 1;
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) {
							Message.Interpreter_objectStackSize -= 2;
							var3 = (String)Interpreter.Interpreter_objectStack[Message.Interpreter_objectStackSize];
							var4 = (String)Interpreter.Interpreter_objectStack[Message.Interpreter_objectStackSize + 1];
							if (Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1) {
								Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var4;
							}

							return 1;
						} else if (var0 == ScriptOpcodes.ESCAPE) {
							var3 = (String)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize];
							Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = AbstractFont.escapeBrackets(var3);
							return 1;
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) {
							var3 = (String)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize];
							var10 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
							Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var3 + (char)var10;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) {
							var11 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = class342.isCharPrintable((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) {
							var11 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = class292.isAlphaNumeric((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) {
							var11 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = WorldMapLabel.isCharAlphabetic((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) {
							var11 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = class177.isDigit((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) {
							var3 = (String)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize];
							if (var3 != null) {
								Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
							}

							return 1;
						} else if (var0 == ScriptOpcodes.SUBSTRING) {
							var3 = (String)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize];
							UrlRequest.Interpreter_intStackSize -= 2;
							var10 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
							Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var3.substring(var10, var9);
							return 1;
						} else if (var0 == ScriptOpcodes.REMOVETAGS) {
							var3 = (String)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize];
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

							Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var16.toString();
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) {
							var3 = (String)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize];
							var10 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.indexOf(var10);
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) {
							Message.Interpreter_objectStackSize -= 2;
							var3 = (String)Interpreter.Interpreter_objectStack[Message.Interpreter_objectStackSize];
							var4 = (String)Interpreter.Interpreter_objectStack[Message.Interpreter_objectStackSize + 1];
							var9 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var3.indexOf(var4, var9);
							return 1;
						} else if (var0 == 4122) {
							var3 = (String)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize];
							Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var3.toUpperCase();
							return 1;
						} else if (var0 == 4123) {
							Message.Interpreter_objectStackSize -= 3;
							var3 = (String)Interpreter.Interpreter_objectStack[Message.Interpreter_objectStackSize];
							var4 = (String)Interpreter.Interpreter_objectStack[Message.Interpreter_objectStackSize + 1];
							String var5 = (String)Interpreter.Interpreter_objectStack[Message.Interpreter_objectStackSize + 2];
							if (class159.localPlayer.appearance == null) {
								Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var5;
								return 1;
							} else {
								switch(class159.localPlayer.appearance.field4105) {
								case 0:
									Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var3;
									break;
								case 1:
									Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var4;
									break;
								case 2:
								default:
									Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var5;
								}

								return 1;
							}
						} else if (var0 == 4124) {
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = class159.localPlayer.appearance != null ? class159.localPlayer.appearance.field4105 : -1;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					Message.Interpreter_objectStackSize -= 2;
					var3 = (String)Interpreter.Interpreter_objectStack[Message.Interpreter_objectStackSize];
					var4 = (String)Interpreter.Interpreter_objectStack[Message.Interpreter_objectStackSize + 1];
					if (class159.localPlayer.appearance != null && class159.localPlayer.appearance.gender != 0) {
						Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var4;
					} else {
						Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var3;
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1953611563"
	)
	static void method11201(int var0, int var1, int var2, int var3) {
		Widget var4 = class35.widgetDefinition.getWidgetChild(var0, var1);
		if (var4 != null && var4.onTargetEnter != null) {
			ScriptEvent var5 = new ScriptEvent();
			var5.widget = var4;
			var5.args = var4.onTargetEnter;
			class332.runScriptEvent(var5);
		}

		Client.selectedSpellItemId = var3;
		Client.isSpellSelected = true;
		class142.selectedSpellWidget = var0;
		Client.selectedSpellChildIndex = var1;
		class266.selectedSpellFlags = var2;
		class154.invalidateWidget(var4);
	}
}
