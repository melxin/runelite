import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ob")
public class class365 {
	@ObfuscatedName("al")
	public static final short[] field4042;
	@ObfuscatedName("ab")
	public static final short[][] field4043;
	@ObfuscatedName("ac")
	public static final short[] field4041;
	@ObfuscatedName("av")
	public static final short[][] field4044;

	static {
		field4042 = new short[]{6798, 8741, 25238, 4626, 4550};
		field4043 = new short[][]{{6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010, -22122, 937, 8130, -13422, 30385}, {8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, {4626, 11146, 6439, 12, 4758, 10270}, {4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574, 17050, 0, 127, -31821, -17991}};
		field4041 = new short[]{-10304, 9104, -1, -1, -1};
		field4044 = new short[][]{{6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002, -22116, 945, 8144, -13414, 30389}, {9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019}, new short[0], new short[0], new short[0]};
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lce;",
		garbageValue = "1838789640"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = (var1 << 8) + var0;
		Script var5 = Interpreter.getScript(var3, var0);
		if (var5 != null) {
			return var5;
		} else {
			int var4 = class280.method6334(var2, var0);
			var5 = Interpreter.getScript(var4, var0);
			if (var5 != null) {
				return var5;
			} else {
				var4 = Messages.method2906(var0);
				var5 = Interpreter.getScript(var4, var0);
				return var5 != null ? var5 : null;
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lbv;Lru;Lru;I)V",
		garbageValue = "2129251535"
	)
	@Export("loginScreen")
	static void loginScreen(GameEngine var0, Font var1, Font var2) {
		int var6;
		int var36;
		boolean var47;
		if (Login.worldSelectOpen) {
			IndexCheck var34 = class161.method3960();

			while (true) {
				if (!var34.method6092()) {
					if (MouseHandler.MouseHandler_lastButton != 1 && (WidgetDefinition.mouseCam || MouseHandler.MouseHandler_lastButton != 4)) {
						break;
					}

					int var4 = Login.xPadding + 280;
					if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						WorldMapScaleHandler.changeWorldSelectSorting(0, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						WorldMapScaleHandler.changeWorldSelectSorting(0, 1);
						break;
					}

					int var35 = Login.xPadding + 390;
					if (MouseHandler.MouseHandler_lastPressedX >= var35 && MouseHandler.MouseHandler_lastPressedX <= var35 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						WorldMapScaleHandler.changeWorldSelectSorting(1, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var35 + 15 && MouseHandler.MouseHandler_lastPressedX <= var35 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						WorldMapScaleHandler.changeWorldSelectSorting(1, 1);
						break;
					}

					var6 = Login.xPadding + 500;
					if (MouseHandler.MouseHandler_lastPressedX >= var6 && MouseHandler.MouseHandler_lastPressedX <= var6 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						WorldMapScaleHandler.changeWorldSelectSorting(2, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var6 + 15 && MouseHandler.MouseHandler_lastPressedX <= var6 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						WorldMapScaleHandler.changeWorldSelectSorting(2, 1);
						break;
					}

					var36 = Login.xPadding + 610;
					if (MouseHandler.MouseHandler_lastPressedX >= var36 && MouseHandler.MouseHandler_lastPressedX <= var36 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						WorldMapScaleHandler.changeWorldSelectSorting(3, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var36 + 15 && MouseHandler.MouseHandler_lastPressedX <= var36 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						WorldMapScaleHandler.changeWorldSelectSorting(3, 1);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) {
						class366.method7855();
						break;
					}

					if (Login.hoveredWorldIndex != -1) {
						World var8 = World.World_worlds[Login.hoveredWorldIndex];
						boolean var37 = SongTask.method9668(Client.worldProperties, class578.field5767);
						var47 = var8.isDeadman();
						ObjectComposition.field2301 = var47;
						var8.field617 = var47 ? "beta" : var8.field617;
						class155.changeWorld(var8);
						class366.method7855();
						if (var47 != var37) {
							class62.method2115();
						}
					} else {
						if (Login.worldSelectPage > 0 && ScriptEvent.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= ScriptEvent.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= GameEngine.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= GameEngine.canvasHeight / 2 + 50) {
							--Login.worldSelectPage;
						}

						if (Login.worldSelectPage < Login.worldSelectPagesCount && PendingSpawn.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= RestClientThreadFactory.canvasWidth - PendingSpawn.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= RestClientThreadFactory.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= GameEngine.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= GameEngine.canvasHeight / 2 + 50) {
							++Login.worldSelectPage;
						}
					}
					break;
				}

				if (var34.field3137 == 13) {
					class366.method7855();
					break;
				}

				if (var34.field3137 == 96) {
					if (Login.worldSelectPage > 0 && ScriptEvent.worldSelectLeftSprite != null) {
						--Login.worldSelectPage;
					}
				} else if (var34.field3137 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && PendingSpawn.worldSelectRightSprite != null) {
					++Login.worldSelectPage;
				}
			}

		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !WidgetDefinition.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453 && MouseHandler.MouseHandler_lastPressedX < Login.xPadding + 765 && MouseHandler.MouseHandler_lastPressedY < 503) {
				FriendSystem.clientPreferences.updateTitleMusicDisabled(!FriendSystem.clientPreferences.isTitleMusicDisabled());
				if (FriendSystem.clientPreferences.isTitleMusicDisabled()) {
					class267.method6028(0, 0);
				} else {
					class267.method6028(0, 0);
					ArrayList var3 = new ArrayList();
					var3.add(new MidiRequest(MoveSpeed.field3199, "scape main", "", 255, false));
					class30.method486(var3, 0, 0, 0, 100, false);
				}

				class330.method7035();
			}

			if (Client.gameState != 5) {
				if (-1L == Login.field737) {
					Login.field737 = UserComparator7.method3496() + 1000L;
				}

				long var21 = UserComparator7.method3496();
				boolean var5;
				if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
					while (true) {
						if (Client.archiveLoadersDone >= Client.archiveLoaders.size()) {
							var5 = true;
							break;
						}

						ArchiveLoader var23 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone);
						if (!var23.isLoaded()) {
							var5 = false;
							break;
						}

						++Client.archiveLoadersDone;
					}
				} else {
					var5 = true;
				}

				if (var5 && -1L == Login.field738) {
					Login.field738 = var21;
					if (Login.field738 > Login.field737) {
						Login.field737 = Login.field738;
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) {
					if (HorizontalAlignment.clientLanguage == Language.Language_EN) {
						if (MouseHandler.MouseHandler_lastButton == 1 || !WidgetDefinition.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
							var6 = Login.xPadding + 5;
							short var7 = 463;
							byte var24 = 100;
							byte var9 = 35;
							if (MouseHandler.MouseHandler_lastPressedX >= var6 && MouseHandler.MouseHandler_lastPressedX <= var24 + var6 && MouseHandler.MouseHandler_lastPressedY >= var7 && MouseHandler.MouseHandler_lastPressedY <= var9 + var7) {
								class396.method8242();
								return;
							}
						}

						if (class332.World_request != null) {
							class396.method8242();
						}
					}

					var6 = MouseHandler.MouseHandler_lastButton;
					var36 = MouseHandler.MouseHandler_lastPressedX;
					int var48 = MouseHandler.MouseHandler_lastPressedY;
					if (var6 == 0) {
						var36 = MouseHandler.MouseHandler_x;
						var48 = MouseHandler.MouseHandler_y;
					}

					if (!WidgetDefinition.mouseCam && var6 == 4) {
						var6 = 1;
					}

					IndexCheck var25 = class161.method3960();
					short var39;
					int var40;
					if (Login.loginIndex == 0) {
						var47 = false;

						while (var25.method6092()) {
							if (var25.field3137 == 84) {
								var47 = true;
							}
						}

						var40 = class133.loginBoxCenter - 80;
						var39 = 291;
						if (var6 == 1 && var36 >= var40 - 75 && var36 <= var40 + 75 && var48 >= var39 - 20 && var48 <= var39 + 20) {
							class441.openURL(method7850("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
						}

						var40 = class133.loginBoxCenter + 80;
						if (var6 == 1 && var36 >= var40 - 75 && var36 <= var40 + 75 && var48 >= var39 - 20 && var48 <= var39 + 20 || var47) {
							if (MusicPatch.method7313()) {
								class141.focusPasswordWhenUsernameFilled();
							} else {
								Varcs.Login_promptCredentials(false);
							}
						}
					} else if (Login.loginIndex == 1) {
						var47 = Language.client.containsAccessAndRefreshToken() || Language.client.otlTokenRequesterInitialized() || Language.client.containsSessionAndCharacterId();

						while (var25.method6092()) {
							if (var25.field3137 == 84) {
								if (var47) {
									class335.method7086();
								} else {
									Varcs.Login_promptCredentials(false);
								}

								return;
							}

							if (var25.field3137 == 13) {
								WorldMapDecoration.updateLoginStatusUsernameRemembered(true);
								return;
							}
						}

						var40 = class133.loginBoxCenter - 80;
						var39 = 321;
						if (var6 == 1 && var36 >= var40 - 75 && var36 <= var40 + 75 && var48 >= var39 - 20 && var48 <= var39 + 20) {
							if (var47) {
								class335.method7086();
							} else {
								Varcs.Login_promptCredentials(false);
							}

							return;
						}

						var40 = class133.loginBoxCenter + 80;
						if (var6 == 1 && var36 >= var40 - 75 && var36 <= var40 + 75 && var48 >= var39 - 20 && var48 <= var39 + 20) {
							WorldMapDecoration.updateLoginStatusUsernameRemembered(true);
							return;
						}
					} else {
						int var10;
						int var14;
						int var15;
						short var38;
						boolean var41;
						if (Login.loginIndex == 2) {
							var38 = 201;
							var10 = var38 + 52;
							if (var6 == 1 && var48 >= var10 - 12 && var48 < var10 + 2) {
								Login.currentLoginField = 0;
							}

							var10 += 15;
							if (var6 == 1 && var48 >= var10 - 12 && var48 < var10 + 2) {
								Login.currentLoginField = 1;
							}

							var10 += 15;
							var38 = 361;
							if (Login.field714 != null) {
								var40 = Login.field714.highX / 2;
								if (var6 == 1 && var36 >= Login.field714.lowX - var40 && var36 <= var40 + Login.field714.lowX && var48 >= var38 - 15 && var48 < var38) {
									switch(Login.field713) {
									case 1:
										class441.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
										return;
									case 2:
										class441.openURL("https://support.runescape.com/hc/en-gb", true, false);
									}
								}
							}

							var40 = class133.loginBoxCenter - 80;
							var39 = 321;
							if (var6 == 1 && var36 >= var40 - 75 && var36 <= var40 + 75 && var48 >= var39 - 20 && var48 <= var39 + 20) {
								Login.Login_username = Login.Login_username.trim();
								if (Login.Login_username.isEmpty()) {
									class460.setLoginResponseString("", "Please enter your username/email address.", "");
								} else if (Login.Login_password.isEmpty()) {
									class460.setLoginResponseString("", "Please enter your password.", "");
								} else {
									class460.setLoginResponseString("", "Connecting to server...", "");
									Client.authenticationScheme = FriendSystem.clientPreferences.containsKey(Login.Login_username) ? AuthenticationScheme.USERNAME_PASSWORD_REMEMBER : AuthenticationScheme.USERNAME_PASSWORD;
									AuthenticationScheme.updateGameState(20);
								}

								return;
							}

							var40 = Login.loginBoxX + 180 + 80;
							if (var6 == 1 && var36 >= var40 - 75 && var36 <= var40 + 75 && var48 >= var39 - 20 && var48 <= var39 + 20) {
								DynamicObject.method1987(0);
								Login.Login_username = "";
								Login.Login_password = "";
								class563.otpMedium = 0;
								SoundSystem.otp = "";
								Login.rememberUsername = true;
							}

							var40 = class133.loginBoxCenter + -117;
							var39 = 277;
							Login.field710 = var36 >= var40 && var36 < var40 + class144.field1717 && var48 >= var39 && var48 < var39 + VarpDefinition.field1950;
							if (var6 == 1 && Login.field710) {
								Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered;
								if (!Client.Login_isUsernameRemembered && FriendSystem.clientPreferences.getRememberedUsername() != null) {
									FriendSystem.clientPreferences.updateRememberedUsername((String)null);
								}
							}

							var40 = class133.loginBoxCenter + 24;
							var39 = 277;
							Login.field729 = var36 >= var40 && var36 < var40 + class144.field1717 && var48 >= var39 && var48 < var39 + VarpDefinition.field1950;
							if (var6 == 1 && Login.field729) {
								FriendSystem.clientPreferences.updateHideUsername(!FriendSystem.clientPreferences.isUsernameHidden());
								if (!FriendSystem.clientPreferences.isUsernameHidden()) {
									Login.Login_username = "";
									FriendSystem.clientPreferences.updateRememberedUsername((String)null);
									class141.focusPasswordWhenUsernameFilled();
								}
							}

							label1573:
							while (true) {
								Transferable var50;
								do {
									while (true) {
										label1537:
										do {
											while (true) {
												while (var25.method6092()) {
													if (var25.field3137 != 13) {
														if (Login.currentLoginField != 0) {
															continue label1537;
														}

														char var42 = var25.field3136;

														for (var14 = 0; var14 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length() && var42 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var14); ++var14) {
														}

														if (var25.field3137 == 85 && !Login.Login_username.isEmpty()) {
															Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
														}

														if (var25.field3137 == 84 || var25.field3137 == 80) {
															Login.currentLoginField = 1;
														}

														char var44 = var25.field3136;
														boolean var45 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var44) != -1;
														if (var45 && Login.Login_username.length() < 320) {
															Login.Login_username = Login.Login_username + var25.field3136;
														}
													} else {
														DynamicObject.method1987(0);
														Login.Login_username = "";
														Login.Login_password = "";
														class563.otpMedium = 0;
														SoundSystem.otp = "";
														Login.rememberUsername = true;
													}
												}

												return;
											}
										} while(Login.currentLoginField != 1);

										if (var25.field3137 == 85 && !Login.Login_password.isEmpty()) {
											Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
										} else if (var25.field3137 == 84 || var25.field3137 == 80) {
											Login.currentLoginField = 0;
											if (var25.field3137 == 84) {
												Login.Login_username = Login.Login_username.trim();
												if (Login.Login_username.isEmpty()) {
													class460.setLoginResponseString("", "Please enter your username/email address.", "");
												} else if (Login.Login_password.isEmpty()) {
													class460.setLoginResponseString("", "Please enter your password.", "");
												} else {
													class460.setLoginResponseString("", "Connecting to server...", "");
													Client.authenticationScheme = FriendSystem.clientPreferences.containsKey(Login.Login_username) ? AuthenticationScheme.USERNAME_PASSWORD_REMEMBER : AuthenticationScheme.USERNAME_PASSWORD;
													AuthenticationScheme.updateGameState(20);
												}

												return;
											}
										}

										if ((var25.isValidIndexInRange(82) || var25.isValidIndexInRange(87)) && var25.field3137 == 67) {
											Clipboard var49 = Toolkit.getDefaultToolkit().getSystemClipboard();
											var50 = var49.getContents(Language.client);
											var15 = 20 - Login.Login_password.length();
											break;
										}

										if (HealthBarConfig.method2659(var25.field3136)) {
											char var46 = var25.field3136;
											var41 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var46) != -1;
											if (var41 && Login.Login_password.length() < 20) {
												Login.Login_password = Login.Login_password + var25.field3136;
											}
										}
									}
								} while(var15 <= 0);

								try {
									String var16 = (String)var50.getTransferData(DataFlavor.stringFlavor);
									int var17 = Math.min(var15, var16.length());
									int var18 = 0;

									while (true) {
										if (var18 >= var17) {
											Login.Login_password = Login.Login_password + var16.substring(0, var17);
											continue label1573;
										}

										if (!HealthBarConfig.method2659(var16.charAt(var18))) {
											break;
										}

										char var20 = var16.charAt(var18);
										boolean var19 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var20) != -1;
										if (!var19) {
											break;
										}

										++var18;
									}

									DynamicObject.method1987(3);
									return;
								} catch (UnsupportedFlavorException var32) {
								} catch (IOException var33) {
								}
							}
						} else {
							short var11;
							Bounds var28;
							if (Login.loginIndex == 3) {
								var10 = Login.loginBoxX + 180;
								var11 = 241;
								var28 = var1.method9427(25, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.".length() - 34, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", var10, var11);
								if (var6 == 1 && var28.method8987(var36, var48)) {
									class441.openURL("https://oldschool.runescape.com/launcher", true, false);
								}

								var10 = Login.loginBoxX + 180;
								var11 = 276;
								if (var6 == 1 && var36 >= var10 - 75 && var36 <= var10 + 75 && var48 >= var11 - 20 && var48 <= var11 + 20) {
									WorldMapDecoration.updateLoginStatusUsernameRemembered(false);
								}

								var10 = Login.loginBoxX + 180;
								var11 = 326;
								if (var6 == 1 && var36 >= var10 - 75 && var36 <= var10 + 75 && var48 >= var11 - 20 && var48 <= var11 + 20) {
									class441.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
									return;
								}
							} else {
								int var13;
								if (Login.loginIndex == 4) {
									var10 = Login.loginBoxX + 180 - 80;
									var11 = 321;
									if (var6 == 1 && var36 >= var10 - 75 && var36 <= var10 + 75 && var48 >= var11 - 20 && var48 <= var11 + 20) {
										class267.method6027();
										return;
									}

									if (var6 == 1 && var36 >= Login.loginBoxX + 180 - 9 && var36 <= Login.loginBoxX + 180 + 130 && var48 >= 263 && var48 <= 296) {
										Login.rememberUsername = !Login.rememberUsername;
									}

									if (var6 == 1 && var36 >= Login.loginBoxX + 180 - 34 && var36 <= Login.loginBoxX + 34 + 180 && var48 >= 351 && var48 <= 363) {
										class441.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
									}

									var10 = Login.loginBoxX + 180 + 80;
									if (var6 == 1 && var36 >= var10 - 75 && var36 <= var10 + 75 && var48 >= var11 - 20 && var48 <= var11 + 20) {
										DynamicObject.method1987(0);
										Login.Login_username = "";
										Login.Login_password = "";
										class563.otpMedium = 0;
										SoundSystem.otp = "";
									}

									while (var25.method6092()) {
										boolean var12 = false;

										for (var13 = 0; var13 < "1234567890".length(); ++var13) {
											if (var25.field3136 == "1234567890".charAt(var13)) {
												var12 = true;
												break;
											}
										}

										if (var25.field3137 == 13) {
											DynamicObject.method1987(0);
											Login.Login_username = "";
											Login.Login_password = "";
											class563.otpMedium = 0;
											SoundSystem.otp = "";
										} else {
											if (var25.field3137 == 85 && !SoundSystem.otp.isEmpty()) {
												SoundSystem.otp = SoundSystem.otp.substring(0, SoundSystem.otp.length() - 1);
											}

											if (var25.field3137 == 84) {
												class267.method6027();
												return;
											}

											if (var12 && SoundSystem.otp.length() < 6) {
												SoundSystem.otp = SoundSystem.otp + var25.field3136;
											}
										}
									}
								} else if (Login.loginIndex == 5) {
									var10 = Login.loginBoxX + 180 - 80;
									var11 = 321;
									if (var6 == 1 && var36 >= var10 - 75 && var36 <= var10 + 75 && var48 >= var11 - 20 && var48 <= var11 + 20) {
										AbstractSocket.method10221();
										return;
									}

									var10 = Login.loginBoxX + 180 + 80;
									if (var6 == 1 && var36 >= var10 - 75 && var36 <= var10 + 75 && var48 >= var11 - 20 && var48 <= var11 + 20) {
										Varcs.Login_promptCredentials(true);
									}

									var39 = 361;
									if (LoginScreenAnimation.field1100 != null) {
										var13 = LoginScreenAnimation.field1100.highX / 2;
										if (var6 == 1 && var36 >= LoginScreenAnimation.field1100.lowX - var13 && var36 <= var13 + LoginScreenAnimation.field1100.lowX && var48 >= var39 - 15 && var48 < var39) {
											class441.openURL(method7850("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
										}
									}

									while (var25.method6092()) {
										var41 = false;

										for (var14 = 0; var14 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var14) {
											if (var25.field3136 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var14)) {
												var41 = true;
												break;
											}
										}

										if (var25.field3137 == 13) {
											Varcs.Login_promptCredentials(true);
										} else {
											if (var25.field3137 == 85 && !Login.Login_username.isEmpty()) {
												Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
											}

											if (var25.field3137 == 84) {
												AbstractSocket.method10221();
												return;
											}

											if (var41 && Login.Login_username.length() < 320) {
												Login.Login_username = Login.Login_username + var25.field3136;
											}
										}
									}
								} else if (Login.loginIndex != 6) {
									if (Login.loginIndex == 7) {
										if (class161.field1846 && !Client.onMobile) {
											var10 = class133.loginBoxCenter - 150;
											var40 = var10 + 40 + 240 + 25;
											var39 = 231;
											var13 = var39 + 40;
											if (var6 == 1 && var36 >= var10 && var36 <= var40 && var48 >= var39 && var48 <= var13) {
												var15 = var10;
												int var29 = 0;

												while (true) {
													if (var29 >= 8) {
														var14 = 0;
														break;
													}

													if (var36 <= var15 + 30) {
														var14 = var29;
														break;
													}

													var15 += 30;
													var15 += var29 != 1 && var29 != 3 ? 5 : 20;
													++var29;
												}

												Login.field708 = var14;
											}

											var14 = Login.loginBoxX + 180 - 80;
											short var43 = 321;
											boolean var51;
											if (var6 == 1 && var36 >= var14 - 75 && var36 <= var14 + 75 && var48 >= var43 - 20 && var48 <= var43 + 20) {
												var51 = HttpRequest.method89();
												if (var51) {
													AuthenticationScheme.updateGameState(50);
													return;
												}
											}

											var14 = Login.loginBoxX + 180 + 80;
											if (var6 == 1 && var36 >= var14 - 75 && var36 <= var14 + 75 && var48 >= var43 - 20 && var48 <= var43 + 20) {
												Login.field706 = new String[8];
												Varcs.Login_promptCredentials(true);
											}

											while (var25.method6092()) {
												if (var25.field3137 == 101) {
													Login.field706[Login.field708] = null;
												}

												if (var25.field3137 == 85) {
													if (Login.field706[Login.field708] == null && Login.field708 > 0) {
														--Login.field708;
													}

													Login.field706[Login.field708] = null;
												}

												if (var25.field3136 >= '0' && var25.field3136 <= '9') {
													Login.field706[Login.field708] = "" + var25.field3136;
													if (Login.field708 < 7) {
														++Login.field708;
													}
												}

												if (var25.field3137 == 84) {
													var51 = HttpRequest.method89();
													if (var51) {
														AuthenticationScheme.updateGameState(50);
													}

													return;
												}
											}
										} else {
											var10 = Login.loginBoxX + 180 - 80;
											var11 = 321;
											if (var6 == 1 && var36 >= var10 - 75 && var36 <= var10 + 75 && var48 >= var11 - 20 && var48 <= var11 + 20) {
												class441.openURL(method7850("secure", true) + "m=dob/set_dob.ws", true, false);
												class460.setLoginResponseString("", "Page has opened in the browser.", "");
												DynamicObject.method1987(6);
												return;
											}

											var10 = Login.loginBoxX + 180 + 80;
											if (var6 == 1 && var36 >= var10 - 75 && var36 <= var10 + 75 && var48 >= var11 - 20 && var48 <= var11 + 20) {
												Varcs.Login_promptCredentials(true);
											}
										}
									} else if (Login.loginIndex == 8) {
										var10 = Login.loginBoxX + 180 - 80;
										var11 = 321;
										if (var6 == 1 && var36 >= var10 - 75 && var36 <= var10 + 75 && var48 >= var11 - 20 && var48 <= var11 + 20) {
											class441.openURL("https://www.jagex.com/terms/privacy", true, false);
											class460.setLoginResponseString("", "Page has opened in the browser.", "");
											DynamicObject.method1987(6);
											return;
										}

										var10 = Login.loginBoxX + 180 + 80;
										if (var6 == 1 && var36 >= var10 - 75 && var36 <= var10 + 75 && var48 >= var11 - 20 && var48 <= var11 + 20) {
											Varcs.Login_promptCredentials(true);
										}
									} else if (Login.loginIndex == 9) {
										var10 = Login.loginBoxX + 180;
										var11 = 311;
										if (var25.field3137 == 84 || var25.field3137 == 13 || var6 == 1 && var36 >= var10 - 75 && var36 <= var10 + 75 && var48 >= var11 - 20 && var48 <= var11 + 20) {
											WorldMapDecoration.updateLoginStatusUsernameRemembered(false);
										}
									} else if (Login.loginIndex == 10) {
										var10 = Login.loginBoxX + 180;
										var11 = 209;
										if (var25.field3137 == 84 || var6 == 1 && var36 >= var10 - 109 && var36 <= var10 + 109 && var48 >= var11 && var48 <= var11 + 68) {
											if (MusicPatch.method7313()) {
												return;
											}

											class335.method7086();
										}
									} else if (Login.loginIndex == 12) {
										var10 = class133.loginBoxCenter;
										var11 = 233;
										var28 = var2.method9427(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var11);
										Bounds var26 = var2.method9427(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var11);
										Bounds var27 = var2.method9427(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var11);
										var40 = var11 + 17;
										Bounds var30 = var2.method9427(0, 34, "<col=ffd200>agreement (EULA)</col>.", var10, var40);
										if (var6 == 1) {
											if (var28.method8987(var36, var48)) {
												class441.openURL("https://www.jagex.com/terms", true, false);
											} else if (var26.method8987(var36, var48)) {
												class441.openURL("https://www.jagex.com/terms/privacy", true, false);
											} else if (var27.method8987(var36, var48) || var30.method8987(var36, var48)) {
												class441.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
											}
										}

										var10 = class133.loginBoxCenter - 80;
										var11 = 311;
										if (var6 == 1 && var36 >= var10 - 75 && var36 <= var10 + 75 && var48 >= var11 - 20 && var48 <= var11 + 20) {
											FriendSystem.clientPreferences.method2539(Client.field368);
											WorldMapDecoration.updateLoginStatusUsernameRemembered(true);
										}

										var10 = class133.loginBoxCenter + 80;
										if (var6 == 1 && var36 >= var10 - 75 && var36 <= var10 + 75 && var48 >= var11 - 20 && var48 <= var11 + 20) {
											Login.loginIndex = 13;
										}
									} else if (Login.loginIndex == 13) {
										var10 = class133.loginBoxCenter;
										var11 = 321;
										if (var6 == 1 && var36 >= var10 - 75 && var36 <= var10 + 75 && var48 >= var11 - 20 && var48 <= var11 + 20) {
											WorldMapDecoration.updateLoginStatusUsernameRemembered(true);
										}
									} else if (Login.loginIndex == 14) {
										String var31 = "";
										switch(Login.Login_banType) {
										case 0:
											var31 = "https://secure.runescape.com/m=offence-appeal/account-history";
											break;
										case 1:
											var31 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
											break;
										case 2:
											var31 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
											break;
										default:
											Varcs.Login_promptCredentials(false);
										}

										var40 = Login.loginBoxX + 180;
										var39 = 276;
										if (var6 == 1 && var36 >= var40 - 75 && var36 <= var40 + 75 && var48 >= var39 - 20 && var48 <= var39 + 20) {
											class441.openURL(var31, true, false);
											class460.setLoginResponseString("", "Page has opened in the browser.", "");
											DynamicObject.method1987(6);
											return;
										}

										var40 = Login.loginBoxX + 180;
										var39 = 326;
										if (var6 == 1 && var36 >= var40 - 75 && var36 <= var40 + 75 && var48 >= var39 - 20 && var48 <= var39 + 20) {
											Varcs.Login_promptCredentials(false);
										}
									} else if (Login.loginIndex == 24) {
										var10 = Login.loginBoxX + 180;
										var11 = 301;
										if (var6 == 1 && var36 >= var10 - 75 && var36 <= var10 + 75 && var48 >= var11 - 20 && var48 <= var11 + 20) {
											WorldMapDecoration.updateLoginStatusUsernameRemembered(false);
										}
									} else if (Login.loginIndex == 32) {
										var10 = Login.loginBoxX + 180 - 80;
										var11 = 321;
										if (var6 == 1 && var36 >= var10 - 75 && var36 <= var10 + 75 && var48 >= var11 - 20 && var48 <= var11 + 20) {
											class441.openURL(method7850("secure", true) + "m=dob/set_dob.ws", true, false);
											class460.setLoginResponseString("", "Page has opened in the browser.", "");
											DynamicObject.method1987(6);
											return;
										}

										var10 = Login.loginBoxX + 180 + 80;
										if (var6 == 1 && var36 >= var10 - 75 && var36 <= var10 + 75 && var48 >= var11 - 20 && var48 <= var11 + 20) {
											Varcs.Login_promptCredentials(true);
										}
									} else if (Login.loginIndex == 33) {
										var10 = Login.loginBoxX + 180;
										var11 = 276;
										if (var6 == 1 && var36 >= var10 - 75 && var36 <= var10 + 75 && var48 >= var11 - 20 && var48 <= var11 + 20) {
											class441.openURL("https://oldschool.runescape.com/launcher", true, false);
										}

										var10 = Login.loginBoxX + 180;
										var11 = 326;
										if (var6 == 1 && var36 >= var10 - 75 && var36 <= var10 + 75 && var48 >= var11 - 20 && var48 <= var11 + 20) {
											Varcs.Login_promptCredentials(true);
										}
									} else if (Login.loginIndex == 34) {
										var10 = Login.loginBoxX + 180;
										var11 = 276;
										if (var6 == 1 && var36 >= var10 - 75 && var36 <= var10 + 75 && var48 >= var11 - 20 && var48 <= var11 + 20) {
											class396.method8242();
											return;
										}

										if (class332.World_request != null) {
											class396.method8242();
										}

										var10 = Login.loginBoxX + 180;
										var11 = 326;
										if (var6 == 1 && var36 >= var10 - 75 && var36 <= var10 + 75 && var48 >= var11 - 20 && var48 <= var11 + 20) {
											Varcs.Login_promptCredentials(false);
										}
									}
								} else {
									while (true) {
										do {
											if (!var25.method6092()) {
												var38 = 321;
												if (var6 == 1 && var48 >= var38 - 20 && var48 <= var38 + 20) {
													Varcs.Login_promptCredentials(true);
												}

												return;
											}
										} while(var25.field3137 != 84 && var25.field3137 != 13);

										Varcs.Login_promptCredentials(true);
									}
								}
							}
						}
					}

				}
			}
		}
	}

	@ObfuscatedName("ol")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)Ljava/lang/String;",
		garbageValue = "5"
	)
	static String method7850(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://";
		if (Client.gameBuild == 1) {
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) {
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) {
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) {
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) {
			var0 = "local";
		}

		String var3 = "";
		if (ArchiveDiskAction.field4784 != null) {
			var3 = "/p=" + ArchiveDiskAction.field4784;
		}

		String var4 = "runescape.com";
		return var2 + var0 + "." + var4 + "/l=" + HorizontalAlignment.clientLanguage + "/a=" + WorldMapSectionType.field3345 + var3 + "/";
	}
}
