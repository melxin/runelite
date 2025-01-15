import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kt")
public class class267 implements class29 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	Widget field2966;
	@ObfuscatedName("ah")
	boolean field2961;
	@ObfuscatedName("az")
	boolean field2962;

	public class267() {
		this.field2966 = null;
		this.field2961 = false;
		this.field2962 = false;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-458319724"
	)
	public boolean vmethod5756(int var1) {
		if (this.field2966 == null) {
			return false;
		} else {
			class27 var2 = this.field2966.method7535();
			if (var2 == null) {
				return false;
			} else {
				if (var2.method412(var1)) {
					switch(var1) {
					case 81:
						this.field2962 = true;
						break;
					case 82:
						this.field2961 = true;
						break;
					default:
						if (this.method5752(var1)) {
							UserComparator8.invalidateWidget(this.field2966);
						}
					}
				}

				return var2.method406(var1);
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "0"
	)
	public boolean vmethod5757(int var1) {
		switch(var1) {
		case 81:
			this.field2962 = false;
			return false;
		case 82:
			this.field2961 = false;
			return false;
		default:
			return false;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "804434279"
	)
	public boolean vmethod5758(char var1) {
		if (this.field2966 == null) {
			return false;
		} else if (!class59.method1203(var1)) {
			return false;
		} else {
			class359 var2 = this.field2966.method7444();
			if (var2 != null && var2.method7276()) {
				class27 var3 = this.field2966.method7535();
				if (var3 == null) {
					return false;
				} else {
					if (var3.method413(var1) && var2.method7146(var1)) {
						UserComparator8.invalidateWidget(this.field2966);
					}

					return var3.method411(var1);
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "1360179052"
	)
	public boolean vmethod5764(boolean var1) {
		return false;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lna;B)V",
		garbageValue = "-10"
	)
	public void method5727(Widget var1) {
		if (var1 != null) {
			if (var1 != this.field2966) {
				this.method5738();
				this.field2966 = var1;
			}

			class357 var2 = var1.method7447();
			if (var2 != null) {
				if (!var2.field3801.method7221() && var2.field3803 != null) {
					ScriptEvent var3 = new ScriptEvent();
					var3.method2628(var1);
					var3.setArgs(var2.field3803);
					WorldMapElement.method5196().addFirst(var3);
				}

				var2.field3801.method7129(true);
			}
		} else {
			this.method5738();
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Lna;",
		garbageValue = "-1925559873"
	)
	public Widget method5728() {
		return this.field2966;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-4397062"
	)
	public void method5738() {
		if (this.field2966 != null) {
			class357 var1 = this.field2966.method7447();
			Widget var2 = this.field2966;
			this.field2966 = null;
			if (var1 != null) {
				if (var1.field3801.method7221() && var1.field3803 != null) {
					ScriptEvent var3 = new ScriptEvent();
					var3.method2628(var2);
					var3.setArgs(var1.field3803);
					WorldMapElement.method5196().addFirst(var3);
				}

				var1.field3801.method7129(false);
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "187447019"
	)
	boolean method5752(int var1) {
		if (this.field2966 == null) {
			return false;
		} else {
			class359 var2 = this.field2966.method7444();
			if (var2 != null && var2.method7276()) {
				switch(var1) {
				case 13:
					this.method5738();
					return true;
				case 48:
					if (this.field2961) {
						var2.method7152();
					}

					return true;
				case 65:
					if (this.field2961) {
						var2.method7171(class421.method8239());
					}

					return true;
				case 66:
					if (this.field2961) {
						var2.method7170(class421.method8239());
					}

					return true;
				case 67:
					if (this.field2961) {
						var2.method7172(class421.method8239());
					}

					return true;
				case 84:
					if (var2.method7191() == 0) {
						var2.method7146(10);
					} else if (this.field2962 && var2.method7195()) {
						var2.method7146(10);
					} else {
						class357 var3 = this.field2966.method7447();
						ScriptEvent var4 = new ScriptEvent();
						var4.method2628(this.field2966);
						var4.setArgs(var3.field3805);
						WorldMapElement.method5196().addFirst(var4);
						this.method5738();
					}

					return true;
				case 85:
					if (this.field2961) {
						var2.method7201();
					} else {
						var2.method7228();
					}

					return true;
				case 96:
					if (this.field2961) {
						var2.method7160(this.field2962);
					} else {
						var2.method7220(this.field2962);
					}

					return true;
				case 97:
					if (this.field2961) {
						var2.method7161(this.field2962);
					} else {
						var2.method7194(this.field2962);
					}

					return true;
				case 98:
					if (this.field2961) {
						var2.method7173();
					} else {
						var2.method7162(this.field2962);
					}

					return true;
				case 99:
					if (this.field2961) {
						var2.method7174();
					} else {
						var2.method7163(this.field2962);
					}

					return true;
				case 101:
					if (this.field2961) {
						var2.method7150();
					} else {
						var2.method7281();
					}

					return true;
				case 102:
					if (this.field2961) {
						var2.method7290(this.field2962);
					} else {
						var2.method7332(this.field2962);
					}

					return true;
				case 103:
					if (this.field2961) {
						var2.method7137(this.field2962);
					} else {
						var2.method7155(this.field2962);
					}

					return true;
				case 104:
					if (this.field2961) {
						var2.method7166(this.field2962);
					} else {
						var2.method7164(this.field2962);
					}

					return true;
				case 105:
					if (this.field2961) {
						var2.method7260(this.field2962);
					} else {
						var2.method7165(this.field2962);
					}

					return true;
				default:
					return false;
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lpq;Lpq;Lth;ZII)V",
		garbageValue = "-892928212"
	)
	static void method5753(AbstractArchive var0, AbstractArchive var1, GraphicsDefaults var2, boolean var3, int var4) {
		if (Login.clearLoginScreen) {
			if (var4 == 4) {
				Varcs.method3212(4);
			}

		} else {
			if (var4 == 0) {
				AbstractSocket.updateLoginStatusUsernameRemembered(var3);
			} else {
				Varcs.method3212(var4);
			}

			Rasterizer2D.Rasterizer2D_clear();
			byte[] var5 = var0.takeFileByNames("title.jpg", "");
			WorldMapSectionType.leftTitleSprite = GrandExchangeOfferNameComparator.readSpritePixelsFromBytes(var5);
			TriBool.rightTitleSprite = WorldMapSectionType.leftTitleSprite.mirrorHorizontally();
			int var6 = Client.worldProperties;
			if ((var6 & class552.field5431.rsOrdinal()) != 0) {
				Login.logoSprite = AttackOption.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", "");
			} else if ((var6 & class552.field5456.rsOrdinal()) != 0) {
				Login.logoSprite = AttackOption.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", "");
			} else if ((var6 & class552.field5441.rsOrdinal()) != 0) {
				Login.logoSprite = AttackOption.SpriteBuffer_getIndexedSpriteByName(var1, "logo_speedrunning", "");
			} else {
				Login.logoSprite = AttackOption.SpriteBuffer_getIndexedSpriteByName(var1, "logo", "");
			}

			Login.titleboxSprite = AttackOption.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", "");
			class454.titlebuttonSprite = AttackOption.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", "");
			Login.field953 = AttackOption.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", "");
			class418.field4715 = AttackOption.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", "");
			AttackOption.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", "");
			class538.runesSprite = class319.getFont(var1, "runes", "");
			class169.title_muteSprite = class319.getFont(var1, "title_mute", "");
			Login.options_buttons_0Sprite = AttackOption.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", "");
			Sound.field1724 = AttackOption.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", "");
			FriendLoginUpdate.options_buttons_2Sprite = AttackOption.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", "");
			PlayerUpdateManager.field1414 = AttackOption.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", "");
			ClanMate.field5001 = Login.options_buttons_0Sprite.subWidth;
			UrlRequester.field1461 = Login.options_buttons_0Sprite.subHeight;
			HttpHeaders.loginScreenRunesAnimation = new LoginScreenAnimation(class538.runesSprite, var2.field5101);
			if (var3) {
				Login.Login_username = "";
				Login.Login_password = "";
				Login.field922 = new String[8];
				Login.field941 = 0;
			}

			class326.otpMedium = 0;
			WorldEntity.otp = "";
			Login.rememberUsername = true;
			Login.worldSelectOpen = false;
			class106.method3078();
			class153.method3619();
			UserComparator8.method3320().method7823(false);
			Login.clearLoginScreen = true;
			Login.xPadding = (BuddyRankComparator.canvasWidth - 765) / 2;
			Login.loginBoxX = Login.xPadding + 202;
			UserComparator3.loginBoxCenter = Login.loginBoxX + 180;
			WorldMapSectionType.leftTitleSprite.drawAt(Login.xPadding, 0);
			TriBool.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18);
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-594909621"
	)
	public static void method5746(boolean var0) {
		if (var0 != WorldMapEvent.ItemDefinition_inMembersWorld) {
			ItemComposition.ItemDefinition_cached.clear();
			ItemComposition.ItemDefinition_cachedModels.clear();
			ItemComposition.ItemDefinition_cachedSprites.clear();
			WorldMapEvent.ItemDefinition_inMembersWorld = var0;
		}

	}
}
