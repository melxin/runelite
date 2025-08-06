import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
@Implements("AuthenticationScheme")
public enum AuthenticationScheme implements Enum {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfc;"
	)
	@Export("USERNAME_PASSWORD_REMEMBER")
	USERNAME_PASSWORD_REMEMBER(0, 0),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lfc;"
	)
	@Export("TOKEN_REMEMBER")
	TOKEN_REMEMBER(2, 1),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfc;"
	)
	@Export("USERNAME_PASSWORD")
	USERNAME_PASSWORD(4, 2),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lfc;"
	)
	@Export("TOKEN")
	TOKEN(1, 3),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lfc;"
	)
	field1581(3, 4);

	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1016665151
	)
	static int field1584;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -69650273
	)
	@Export("schemeId")
	public final int schemeId;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1958927193
	)
	@Export("packetId")
	final int packetId;

	AuthenticationScheme(int var3, int var4) {
		this.schemeId = var3;
		this.packetId = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-164877066"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.packetId;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "-76"
	)
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		class329.addChatMessage(var0, var1, var2, (String)null);
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(Lox;B)V",
		garbageValue = "-12"
	)
	static void method3569(Widget var0) {
		var0.method7927();
		var0.method7935().method7747(new class85(var0));
		var0.method7935().method7790(new class86(var0));
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1679150853"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) {
			if (Client.gameState == 30) {
				Client.field344.method6081();
			}

			if (Client.gameState == 0) {
				Language.client.method561();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) {
				BufferedFile.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
				Client.field498 = 0;
				Client.field462 = 0;
				Client.timer.method8246(var0);
				if (var0 != 20) {
					Client.authenticationScheme = FriendSystem.clientPreferences.containsKey(Login.Login_username) ? USERNAME_PASSWORD_REMEMBER : USERNAME_PASSWORD;
				}
			}

			if (var0 != 20 && var0 != 40 && Tiles.field834 != null) {
				Tiles.field834.close();
				Tiles.field834 = null;
			}

			if (Client.gameState == 25) {
				Client.field393 = 0;
				Client.field453 = 0;
				Client.field390 = 1;
				Client.field391 = 0;
				Client.field539 = 1;
			}

			int var2;
			if (var0 != 5 && var0 != 10) {
				if (var0 == 20) {
					var2 = Client.gameState == 11 ? 4 : 0;
					class337.method7129(PacketWriter.archive10, class188.archive8, InterfaceParent.field870, false, var2);
				} else if (var0 == 11) {
					class337.method7129(PacketWriter.archive10, class188.archive8, InterfaceParent.field870, false, 4);
				} else if (var0 == 50) {
					class460.setLoginResponseString("", "Updating date of birth...", "");
					class337.method7129(PacketWriter.archive10, class188.archive8, InterfaceParent.field870, false, 7);
				} else if (var0 != 0 && class482.clearLoginScreen) {
					Login.titleboxSprite = null;
					Tile.titlebuttonSprite = null;
					class36.runesSprite = null;
					class372.leftTitleSprite = null;
					class524.rightTitleSprite = null;
					class205.logoSprite = null;
					Huffman.title_muteSprite = null;
					Interpreter.options_buttons_0Sprite = null;
					AddRequestTask.options_buttons_2Sprite = null;
					class163.worldSelectBackSprites = null;
					IntProjection.worldSelectFlagSprites = null;
					UserComparator5.worldSelectArrows = null;
					GraphicsObject.worldSelectStars = null;
					class401.field4773 = null;
					MidiPcmStream.loginScreenRunesAnimation.method2480();
					class267.method6028(0, 100);
					JagNetThread var1 = HorizontalAlignment.field2060;
					var1.method8447(true);
					class482.clearLoginScreen = false;
				}
			} else {
				var2 = GrandExchangeOfferNameComparator.method8501() ? 0 : 12;
				class337.method7129(PacketWriter.archive10, class188.archive8, InterfaceParent.field870, true, var2);
			}

			Client.gameState = var0;
		}
	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1407165623"
	)
	static final int method3567() {
		if (FriendSystem.clientPreferences.isRoofsHidden()) {
			return class7.topLevelWorldView.plane;
		} else {
			int var0 = 3;
			int var1 = Client.field581 >> 7;
			int var2 = Client.field492 >> 7;
			if (class187.cameraPitch < 310) {
				int var3;
				int var4;
				if (Client.oculusOrbState == 1) {
					var3 = class28.oculusOrbFocalPointX >> 7;
					var4 = MusicPatch.oculusOrbFocalPointY >> 7;
				} else {
					var3 = var1;
					var4 = var2;
				}

				int var5 = Language.cameraX >> 7;
				int var6 = class66.cameraZ >> 7;
				if (var5 < 0 || 104 <= var5 || var6 < 0 || 104 <= var6) {
					return class7.topLevelWorldView.plane;
				}

				if (var3 < 0 || 104 <= var3 || var4 < 0 || 104 <= var4) {
					return class7.topLevelWorldView.plane;
				}

				if ((class7.topLevelWorldView.tileSettings[class7.topLevelWorldView.plane][var5][var6] & 4) != 0) {
					var0 = class7.topLevelWorldView.plane;
				}

				int var7;
				if (var3 > var5) {
					var7 = var3 - var5;
				} else {
					var7 = var5 - var3;
				}

				int var8;
				if (var4 > var6) {
					var8 = var4 - var6;
				} else {
					var8 = var6 - var4;
				}

				int var9;
				int var10;
				if (var7 > var8) {
					var9 = var8 * 65536 / var7;
					var10 = 32768;

					while (var3 != var5) {
						if (var5 < var3) {
							++var5;
						} else if (var5 > var3) {
							--var5;
						}

						if ((class7.topLevelWorldView.tileSettings[class7.topLevelWorldView.plane][var5][var6] & 4) != 0) {
							var0 = class7.topLevelWorldView.plane;
						}

						var10 += var9;
						if (var10 >= 65536) {
							var10 -= 65536;
							if (var6 < var4) {
								++var6;
							} else if (var6 > var4) {
								--var6;
							}

							if ((class7.topLevelWorldView.tileSettings[class7.topLevelWorldView.plane][var5][var6] & 4) != 0) {
								var0 = class7.topLevelWorldView.plane;
							}
						}
					}
				} else if (var8 > 0) {
					var9 = var7 * 65536 / var8;
					var10 = 32768;

					while (var6 != var4) {
						if (var6 < var4) {
							++var6;
						} else if (var6 > var4) {
							--var6;
						}

						if ((class7.topLevelWorldView.tileSettings[class7.topLevelWorldView.plane][var5][var6] & 4) != 0) {
							var0 = class7.topLevelWorldView.plane;
						}

						var10 += var9;
						if (var10 >= 65536) {
							var10 -= 65536;
							if (var5 < var3) {
								++var5;
							} else if (var5 > var3) {
								--var5;
							}

							if ((class7.topLevelWorldView.tileSettings[class7.topLevelWorldView.plane][var5][var6] & 4) != 0) {
								var0 = class7.topLevelWorldView.plane;
							}
						}
					}
				}
			}

			if (var1 >= 0 && 104 > var1 && var2 >= 0 && 104 > var2) {
				if ((class7.topLevelWorldView.tileSettings[class7.topLevelWorldView.plane][var1][var2] & 4) != 0) {
					var0 = class7.topLevelWorldView.plane;
				}

				return var0;
			} else {
				return class7.topLevelWorldView.plane;
			}
		}
	}
}
