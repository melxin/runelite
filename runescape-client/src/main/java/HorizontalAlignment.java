import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hv")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	field2015(1, 0),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(0, 1),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	field2009(2, 2);

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "Lgu;"
	)
	@Export("guestClanSettings")
	static ClanSettings guestClanSettings;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -420179143
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 183181169
	)
	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "26"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "47"
	)
	static void method4144(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			var1.remove();
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lbo;Lrf;Lrf;S)V",
		garbageValue = "-27926"
	)
	@Export("loginScreen")
	static void loginScreen(GameEngine var0, Font var1, Font var2) {
		if (Login.worldSelectOpen) {
			class49.method1861(var0);
		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !class7.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453 && MouseHandler.MouseHandler_lastPressedX < Login.xPadding + 765 && MouseHandler.MouseHandler_lastPressedY < 503) {
				ClientPacket.clientPreferences.updateTitleMusicDisabled(!ClientPacket.clientPreferences.isTitleMusicDisabled());
				LoginState.method761();
				class153.method3696();
			}

			if (Client.gameState != 5) {
				if (Login.field765 == -1L) {
					Login.field765 = class180.method3973() + 1000L;
				}

				long var3 = class180.method3973();
				if (class209.method4400() && -1L == Login.field766) {
					Login.field766 = var3;
					if (Login.field766 > Login.field765) {
						Login.field765 = Login.field766;
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) {
					int var5;
					if (Language.Language_EN == class28.clientLanguage) {
						if (MouseHandler.MouseHandler_lastButton == 1 || !class7.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
							var5 = Login.xPadding + 5;
							short var6 = 463;
							byte var7 = 100;
							byte var8 = 35;
							if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var5 + var7 && MouseHandler.MouseHandler_lastPressedY >= var6 && MouseHandler.MouseHandler_lastPressedY <= var8 + var6) {
								ModeWhere.method8389();
								return;
							}
						}

						if (class6.World_request != null) {
							ModeWhere.method8389();
						}
					}

					var5 = MouseHandler.MouseHandler_lastButton;
					int var36 = MouseHandler.MouseHandler_lastPressedX;
					int var37 = MouseHandler.MouseHandler_lastPressedY;
					if (var5 == 0) {
						var36 = MouseHandler.MouseHandler_x;
						var37 = MouseHandler.MouseHandler_y;
					}

					if (!class7.mouseCam && var5 == 4) {
						var5 = 1;
					}

					IndexCheck var21 = Client.indexCheck;
					IndexCheck var9 = var21;
					short var39;
					int var40;
					boolean var48;
					if (Login.loginIndex == 0) {
						var48 = false;

						while (var9.method5890()) {
							if (var9.field3063 == 84) {
								var48 = true;
							}
						}

						var40 = WorldMapData_0.loginBoxCenter - 80;
						var39 = 291;
						if (var5 == 1 && var36 >= var40 - 75 && var36 <= var40 + 75 && var37 >= var39 - 20 && var37 <= var39 + 20) {
							Calendar.openURL(class346.method7159("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
						}

						var40 = WorldMapData_0.loginBoxCenter + 80;
						if (var5 == 1 && var36 >= var40 - 75 && var36 <= var40 + 75 && var37 >= var39 - 20 && var37 <= var39 + 20 || var48) {
							if (class369.method7722()) {
								MouseRecorder.focusPasswordWhenUsernameFilled();
							} else {
								MidiRequest.Login_promptCredentials(false);
							}
						}
					} else if (Login.loginIndex == 1) {
						var48 = class36.client.containsAccessAndRefreshToken() || class36.client.otlTokenRequesterInitialized() || class36.client.containsSessionAndCharacterId();

						while (var9.method5890()) {
							if (var9.field3063 == 84) {
								if (var48) {
									class162.method3816();
								} else {
									MidiRequest.Login_promptCredentials(false);
								}

								return;
							}

							if (var9.field3063 == 13) {
								class177.updateLoginStatusUsernameRemembered(true);
								return;
							}
						}

						var40 = WorldMapData_0.loginBoxCenter - 80;
						var39 = 321;
						if (var5 == 1 && var36 >= var40 - 75 && var36 <= var40 + 75 && var37 >= var39 - 20 && var37 <= var39 + 20) {
							if (var48) {
								class162.method3816();
							} else {
								MidiRequest.Login_promptCredentials(false);
							}

							return;
						}

						var40 = WorldMapData_0.loginBoxCenter + 80;
						if (var5 == 1 && var36 >= var40 - 75 && var36 <= var40 + 75 && var37 >= var39 - 20 && var37 <= var39 + 20) {
							class177.updateLoginStatusUsernameRemembered(true);
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
							if (var5 == 1 && var37 >= var10 - 12 && var37 < var10 + 2) {
								Login.currentLoginField = 0;
							}

							var10 += 15;
							if (var5 == 1 && var37 >= var10 - 12 && var37 < var10 + 2) {
								Login.currentLoginField = 1;
							}

							var10 += 15;
							var38 = 361;
							if (TaskHandler.field2419 != null) {
								var40 = TaskHandler.field2419.highX / 2;
								if (var5 == 1 && var36 >= TaskHandler.field2419.lowX - var40 && var36 <= var40 + TaskHandler.field2419.lowX && var37 >= var38 - 15 && var37 < var38) {
									switch(Login.field741) {
									case 1:
										Calendar.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
										return;
									case 2:
										Calendar.openURL("https://support.runescape.com/hc/en-gb", true, false);
									}
								}
							}

							var40 = WorldMapData_0.loginBoxCenter - 80;
							var39 = 321;
							if (var5 == 1 && var36 >= var40 - 75 && var36 <= var40 + 75 && var37 >= var39 - 20 && var37 <= var39 + 20) {
								Login.Login_username = Login.Login_username.trim();
								if (Login.Login_username.isEmpty()) {
									MenuAction.setLoginResponseString("", "Please enter your username/email address.", "");
								} else if (Login.Login_password.isEmpty()) {
									MenuAction.setLoginResponseString("", "Please enter your password.", "");
								} else {
									MenuAction.setLoginResponseString("", "Connecting to server...", "");
									Client.authenticationScheme = ClientPacket.clientPreferences.containsKey(Login.Login_username) ? AuthenticationScheme.USERNAME_PASSWORD_REMEMBER : AuthenticationScheme.USERNAME_PASSWORD;
									HealthBarConfig.updateGameState(20);
								}

								return;
							}

							var40 = Login.loginBoxX + 180 + 80;
							if (var5 == 1 && var36 >= var40 - 75 && var36 <= var40 + 75 && var37 >= var39 - 20 && var37 <= var39 + 20) {
								class85.method2689(0);
								Login.Login_username = "";
								Login.Login_password = "";
								PcmPlayer.otpMedium = 0;
								class82.otp = "";
								Login.rememberUsername = true;
							}

							var40 = WorldMapData_0.loginBoxCenter + -117;
							var39 = 277;
							Login.field758 = var36 >= var40 && var36 < var40 + PacketBufferNode.field3497 && var37 >= var39 && var37 < var39 + class441.field4947;
							if (var5 == 1 && Login.field758) {
								Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered;
								if (!Client.Login_isUsernameRemembered && ClientPacket.clientPreferences.getRememberedUsername() != null) {
									ClientPacket.clientPreferences.updateRememberedUsername((String)null);
								}
							}

							var40 = WorldMapData_0.loginBoxCenter + 24;
							var39 = 277;
							Login.field732 = var36 >= var40 && var36 < var40 + PacketBufferNode.field3497 && var37 >= var39 && var37 < var39 + class441.field4947;
							if (var5 == 1 && Login.field732) {
								ClientPacket.clientPreferences.updateHideUsername(!ClientPacket.clientPreferences.isUsernameHidden());
								if (!ClientPacket.clientPreferences.isUsernameHidden()) {
									Login.Login_username = "";
									ClientPacket.clientPreferences.updateRememberedUsername((String)null);
									MouseRecorder.focusPasswordWhenUsernameFilled();
								}
							}

							label1403:
							while (true) {
								Transferable var51;
								do {
									while (true) {
										label1367:
										do {
											while (true) {
												while (var9.method5890()) {
													if (var9.field3063 != 13) {
														if (Login.currentLoginField != 0) {
															continue label1367;
														}

														char var42 = var9.field3062;

														for (var14 = 0; var14 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length() && var42 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var14); ++var14) {
														}

														if (var9.field3063 == 85 && !Login.Login_username.isEmpty()) {
															Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
														}

														if (var9.field3063 == 84 || var9.field3063 == 80) {
															Login.currentLoginField = 1;
														}

														char var44 = var9.field3062;
														boolean var45 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var44) != -1;
														if (var45 && Login.Login_username.length() < 320) {
															Login.Login_username = Login.Login_username + var9.field3062;
														}
													} else {
														class85.method2689(0);
														Login.Login_username = "";
														Login.Login_password = "";
														PcmPlayer.otpMedium = 0;
														class82.otp = "";
														Login.rememberUsername = true;
													}
												}

												return;
											}
										} while(Login.currentLoginField != 1);

										if (var9.field3063 == 85 && !Login.Login_password.isEmpty()) {
											Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
										} else if (var9.field3063 == 84 || var9.field3063 == 80) {
											Login.currentLoginField = 0;
											if (var9.field3063 == 84) {
												Login.Login_username = Login.Login_username.trim();
												if (Login.Login_username.isEmpty()) {
													MenuAction.setLoginResponseString("", "Please enter your username/email address.", "");
												} else if (Login.Login_password.isEmpty()) {
													MenuAction.setLoginResponseString("", "Please enter your password.", "");
												} else {
													MenuAction.setLoginResponseString("", "Connecting to server...", "");
													Client.authenticationScheme = ClientPacket.clientPreferences.containsKey(Login.Login_username) ? AuthenticationScheme.USERNAME_PASSWORD_REMEMBER : AuthenticationScheme.USERNAME_PASSWORD;
													HealthBarConfig.updateGameState(20);
												}

												return;
											}
										}

										if ((var9.isValidIndexInRange(82) || var9.isValidIndexInRange(87)) && var9.field3063 == 67) {
											Clipboard var50 = Toolkit.getDefaultToolkit().getSystemClipboard();
											var51 = var50.getContents(class36.client);
											var15 = 20 - Login.Login_password.length();
											break;
										}

										if (class198.method4233(var9.field3062)) {
											char var46 = var9.field3062;
											var41 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var46) != -1;
											if (var41 && Login.Login_password.length() < 20) {
												Login.Login_password = Login.Login_password + var9.field3062;
											}
										}
									}
								} while(var15 <= 0);

								try {
									String var16 = (String)var51.getTransferData(DataFlavor.stringFlavor);
									int var17 = Math.min(var15, var16.length());
									int var47 = 0;

									while (true) {
										if (var47 >= var17) {
											Login.Login_password = Login.Login_password + var16.substring(0, var17);
											continue label1403;
										}

										if (!class198.method4233(var16.charAt(var47))) {
											break;
										}

										char var49 = var16.charAt(var47);
										boolean var19 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var49) != -1;
										if (!var19) {
											break;
										}

										++var47;
									}

									class85.method2689(3);
									return;
								} catch (UnsupportedFlavorException var34) {
								} catch (IOException var35) {
								}
							}
						} else {
							short var11;
							Bounds var24;
							if (Login.loginIndex == 3) {
								var10 = Login.loginBoxX + 180;
								var11 = 241;
								var24 = var1.method9096(25, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.".length() - 34, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", var10, var11);
								if (var5 == 1 && var24.method8644(var36, var37)) {
									Calendar.openURL("https://oldschool.runescape.com/launcher", true, false);
								}

								var10 = Login.loginBoxX + 180;
								var11 = 276;
								if (var5 == 1 && var36 >= var10 - 75 && var36 <= var10 + 75 && var37 >= var11 - 20 && var37 <= var11 + 20) {
									class177.updateLoginStatusUsernameRemembered(false);
								}

								var10 = Login.loginBoxX + 180;
								var11 = 326;
								if (var5 == 1 && var36 >= var10 - 75 && var36 <= var10 + 75 && var37 >= var11 - 20 && var37 <= var11 + 20) {
									Calendar.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
									return;
								}
							} else {
								int var13;
								if (Login.loginIndex == 4) {
									var10 = Login.loginBoxX + 180 - 80;
									var11 = 321;
									if (var5 == 1 && var36 >= var10 - 75 && var36 <= var10 + 75 && var37 >= var11 - 20 && var37 <= var11 + 20) {
										MenuAction.method1865();
										return;
									}

									if (var5 == 1 && var36 >= Login.loginBoxX + 180 - 9 && var36 <= Login.loginBoxX + 180 + 130 && var37 >= 263 && var37 <= 296) {
										Login.rememberUsername = !Login.rememberUsername;
									}

									if (var5 == 1 && var36 >= Login.loginBoxX + 180 - 34 && var36 <= Login.loginBoxX + 34 + 180 && var37 >= 351 && var37 <= 363) {
										Calendar.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
									}

									var10 = Login.loginBoxX + 180 + 80;
									if (var5 == 1 && var36 >= var10 - 75 && var36 <= var10 + 75 && var37 >= var11 - 20 && var37 <= var11 + 20) {
										class85.method2689(0);
										Login.Login_username = "";
										Login.Login_password = "";
										PcmPlayer.otpMedium = 0;
										class82.otp = "";
									}

									while (var9.method5890()) {
										boolean var12 = false;

										for (var13 = 0; var13 < "1234567890".length(); ++var13) {
											if (var9.field3062 == "1234567890".charAt(var13)) {
												var12 = true;
												break;
											}
										}

										if (var9.field3063 == 13) {
											class85.method2689(0);
											Login.Login_username = "";
											Login.Login_password = "";
											PcmPlayer.otpMedium = 0;
											class82.otp = "";
										} else {
											if (var9.field3063 == 85 && !class82.otp.isEmpty()) {
												class82.otp = class82.otp.substring(0, class82.otp.length() - 1);
											}

											if (var9.field3063 == 84) {
												MenuAction.method1865();
												return;
											}

											if (var12 && class82.otp.length() < 6) {
												class82.otp = class82.otp + var9.field3062;
											}
										}
									}
								} else if (Login.loginIndex == 5) {
									var10 = Login.loginBoxX + 180 - 80;
									var11 = 321;
									if (var5 == 1 && var36 >= var10 - 75 && var36 <= var10 + 75 && var37 >= var11 - 20 && var37 <= var11 + 20) {
										PcmPlayer.method2960();
										return;
									}

									var10 = Login.loginBoxX + 180 + 80;
									if (var5 == 1 && var36 >= var10 - 75 && var36 <= var10 + 75 && var37 >= var11 - 20 && var37 <= var11 + 20) {
										MidiRequest.Login_promptCredentials(true);
									}

									var39 = 361;
									if (LoginState.field304 != null) {
										var13 = LoginState.field304.highX / 2;
										if (var5 == 1 && var36 >= LoginState.field304.lowX - var13 && var36 <= var13 + LoginState.field304.lowX && var37 >= var39 - 15 && var37 < var39) {
											Calendar.openURL(class346.method7159("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
										}
									}

									while (var9.method5890()) {
										var41 = false;

										for (var14 = 0; var14 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var14) {
											if (var9.field3062 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var14)) {
												var41 = true;
												break;
											}
										}

										if (var9.field3063 == 13) {
											MidiRequest.Login_promptCredentials(true);
										} else {
											if (var9.field3063 == 85 && !Login.Login_username.isEmpty()) {
												Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
											}

											if (var9.field3063 == 84) {
												PcmPlayer.method2960();
												return;
											}

											if (var41 && Login.Login_username.length() < 320) {
												Login.Login_username = Login.Login_username + var9.field3062;
											}
										}
									}
								} else if (Login.loginIndex != 6) {
									if (Login.loginIndex == 7) {
										if (class435.field4926 && !Client.onMobile) {
											var10 = WorldMapData_0.loginBoxCenter - 150;
											var40 = var10 + 40 + 240 + 25;
											var39 = 231;
											var13 = var39 + 40;
											if (var5 == 1 && var36 >= var10 && var36 <= var40 && var37 >= var39 && var37 <= var13) {
												var15 = var10;
												int var25 = 0;

												while (true) {
													if (var25 >= 8) {
														var14 = 0;
														break;
													}

													if (var36 <= var15 + 30) {
														var14 = var25;
														break;
													}

													var15 += 30;
													var15 += var25 != 1 && var25 != 3 ? 5 : 20;
													++var25;
												}

												Login.field744 = var14;
											}

											var14 = Login.loginBoxX + 180 - 80;
											short var43 = 321;
											boolean var18;
											boolean var20;
											Date var26;
											java.util.Calendar var28;
											Date var29;
											boolean var52;
											if (var5 == 1 && var36 >= var14 - 75 && var36 <= var14 + 75 && var37 >= var43 - 20 && var37 <= var43 + 20) {
												label1244: {
													try {
														var26 = WorldMapIcon_1.method6196();
													} catch (ParseException var33) {
														class85.method2689(7);
														MenuAction.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
														var52 = false;
														break label1244;
													}

													if (var26 == null) {
														var52 = false;
													} else {
														var28 = java.util.Calendar.getInstance();
														var28.set(1, var28.get(1) - 13);
														var28.set(5, var28.get(5) + 1);
														var28.set(11, 0);
														var28.set(12, 0);
														var28.set(13, 0);
														var28.set(14, 0);
														var29 = var28.getTime();
														var18 = var26.before(var29);
														var20 = GrandExchangeOfferUnitPriceComparator.method8266(var26);
														if (!var20) {
															class113.method3292("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
															var52 = false;
														} else {
															if (!var18) {
																LoginPacket.field1705 = 8388607;
															} else {
																LoginPacket.field1705 = (int)(var26.getTime() / 86400000L - 11745L);
															}

															var52 = true;
														}
													}
												}

												if (var52) {
													HealthBarConfig.updateGameState(50);
													return;
												}
											}

											var14 = Login.loginBoxX + 180 + 80;
											if (var5 == 1 && var36 >= var14 - 75 && var36 <= var14 + 75 && var37 >= var43 - 20 && var37 <= var43 + 20) {
												Login.field757 = new String[8];
												MidiRequest.Login_promptCredentials(true);
											}

											while (var9.method5890()) {
												if (var9.field3063 == 101) {
													Login.field757[Login.field744] = null;
												}

												if (var9.field3063 == 85) {
													if (Login.field757[Login.field744] == null && Login.field744 > 0) {
														--Login.field744;
													}

													Login.field757[Login.field744] = null;
												}

												if (var9.field3062 >= '0' && var9.field3062 <= '9') {
													Login.field757[Login.field744] = "" + var9.field3062;
													if (Login.field744 < 7) {
														++Login.field744;
													}
												}

												if (var9.field3063 == 84) {
													label1168: {
														try {
															var26 = WorldMapIcon_1.method6196();
														} catch (ParseException var32) {
															class85.method2689(7);
															MenuAction.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
															var52 = false;
															break label1168;
														}

														if (var26 == null) {
															var52 = false;
														} else {
															var28 = java.util.Calendar.getInstance();
															var28.set(1, var28.get(1) - 13);
															var28.set(5, var28.get(5) + 1);
															var28.set(11, 0);
															var28.set(12, 0);
															var28.set(13, 0);
															var28.set(14, 0);
															var29 = var28.getTime();
															var18 = var26.before(var29);
															var20 = GrandExchangeOfferUnitPriceComparator.method8266(var26);
															if (!var20) {
																class113.method3292("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
																var52 = false;
															} else {
																if (!var18) {
																	LoginPacket.field1705 = 8388607;
																} else {
																	LoginPacket.field1705 = (int)(var26.getTime() / 86400000L - 11745L);
																}

																var52 = true;
															}
														}
													}

													if (var52) {
														HealthBarConfig.updateGameState(50);
													}

													return;
												}
											}
										} else {
											var10 = Login.loginBoxX + 180 - 80;
											var11 = 321;
											if (var5 == 1 && var36 >= var10 - 75 && var36 <= var10 + 75 && var37 >= var11 - 20 && var37 <= var11 + 20) {
												Calendar.openURL(class346.method7159("secure", true) + "m=dob/set_dob.ws", true, false);
												MenuAction.setLoginResponseString("", "Page has opened in the browser.", "");
												class85.method2689(6);
												return;
											}

											var10 = Login.loginBoxX + 180 + 80;
											if (var5 == 1 && var36 >= var10 - 75 && var36 <= var10 + 75 && var37 >= var11 - 20 && var37 <= var11 + 20) {
												MidiRequest.Login_promptCredentials(true);
											}
										}
									} else if (Login.loginIndex == 8) {
										var10 = Login.loginBoxX + 180 - 80;
										var11 = 321;
										if (var5 == 1 && var36 >= var10 - 75 && var36 <= var10 + 75 && var37 >= var11 - 20 && var37 <= var11 + 20) {
											Calendar.openURL("https://www.jagex.com/terms/privacy", true, false);
											MenuAction.setLoginResponseString("", "Page has opened in the browser.", "");
											class85.method2689(6);
											return;
										}

										var10 = Login.loginBoxX + 180 + 80;
										if (var5 == 1 && var36 >= var10 - 75 && var36 <= var10 + 75 && var37 >= var11 - 20 && var37 <= var11 + 20) {
											MidiRequest.Login_promptCredentials(true);
										}
									} else if (Login.loginIndex == 9) {
										var10 = Login.loginBoxX + 180;
										var11 = 311;
										if (var21.field3063 == 84 || var21.field3063 == 13 || var5 == 1 && var36 >= var10 - 75 && var36 <= var10 + 75 && var37 >= var11 - 20 && var37 <= var11 + 20) {
											class177.updateLoginStatusUsernameRemembered(false);
										}
									} else if (Login.loginIndex == 10) {
										var10 = Login.loginBoxX + 180;
										var11 = 209;
										if (var21.field3063 == 84 || var5 == 1 && var36 >= var10 - 109 && var36 <= var10 + 109 && var37 >= var11 && var37 <= var11 + 68) {
											if (class369.method7722()) {
												return;
											}

											class162.method3816();
										}
									} else if (Login.loginIndex == 12) {
										var10 = WorldMapData_0.loginBoxCenter;
										var11 = 233;
										var24 = var2.method9096(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var11);
										Bounds var22 = var2.method9096(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var11);
										Bounds var23 = var2.method9096(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var11);
										var40 = var11 + 17;
										Bounds var30 = var2.method9096(0, 34, "<col=ffd200>agreement (EULA)</col>.", var10, var40);
										if (var5 == 1) {
											if (var24.method8644(var36, var37)) {
												Calendar.openURL("https://www.jagex.com/terms", true, false);
											} else if (var22.method8644(var36, var37)) {
												Calendar.openURL("https://www.jagex.com/terms/privacy", true, false);
											} else if (var23.method8644(var36, var37) || var30.method8644(var36, var37)) {
												Calendar.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
											}
										}

										var10 = WorldMapData_0.loginBoxCenter - 80;
										var11 = 311;
										if (var5 == 1 && var36 >= var10 - 75 && var36 <= var10 + 75 && var37 >= var11 - 20 && var37 <= var11 + 20) {
											ClientPacket.clientPreferences.method2426(Client.field379);
											class177.updateLoginStatusUsernameRemembered(true);
										}

										var10 = WorldMapData_0.loginBoxCenter + 80;
										if (var5 == 1 && var36 >= var10 - 75 && var36 <= var10 + 75 && var37 >= var11 - 20 && var37 <= var11 + 20) {
											Login.loginIndex = 13;
										}
									} else if (Login.loginIndex == 13) {
										var10 = WorldMapData_0.loginBoxCenter;
										var11 = 321;
										if (var5 == 1 && var36 >= var10 - 75 && var36 <= var10 + 75 && var37 >= var11 - 20 && var37 <= var11 + 20) {
											class177.updateLoginStatusUsernameRemembered(true);
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
											MidiRequest.Login_promptCredentials(false);
										}

										var40 = Login.loginBoxX + 180;
										var39 = 276;
										if (var5 == 1 && var36 >= var40 - 75 && var36 <= var40 + 75 && var37 >= var39 - 20 && var37 <= var39 + 20) {
											Calendar.openURL(var31, true, false);
											MenuAction.setLoginResponseString("", "Page has opened in the browser.", "");
											class85.method2689(6);
											return;
										}

										var40 = Login.loginBoxX + 180;
										var39 = 326;
										if (var5 == 1 && var36 >= var40 - 75 && var36 <= var40 + 75 && var37 >= var39 - 20 && var37 <= var39 + 20) {
											MidiRequest.Login_promptCredentials(false);
										}
									} else if (Login.loginIndex == 24) {
										var10 = Login.loginBoxX + 180;
										var11 = 301;
										if (var5 == 1 && var36 >= var10 - 75 && var36 <= var10 + 75 && var37 >= var11 - 20 && var37 <= var11 + 20) {
											class177.updateLoginStatusUsernameRemembered(false);
										}
									} else if (Login.loginIndex == 32) {
										var10 = Login.loginBoxX + 180 - 80;
										var11 = 321;
										if (var5 == 1 && var36 >= var10 - 75 && var36 <= var10 + 75 && var37 >= var11 - 20 && var37 <= var11 + 20) {
											Calendar.openURL(class346.method7159("secure", true) + "m=dob/set_dob.ws", true, false);
											MenuAction.setLoginResponseString("", "Page has opened in the browser.", "");
											class85.method2689(6);
											return;
										}

										var10 = Login.loginBoxX + 180 + 80;
										if (var5 == 1 && var36 >= var10 - 75 && var36 <= var10 + 75 && var37 >= var11 - 20 && var37 <= var11 + 20) {
											MidiRequest.Login_promptCredentials(true);
										}
									} else if (Login.loginIndex == 33) {
										var10 = Login.loginBoxX + 180;
										var11 = 276;
										if (var5 == 1 && var36 >= var10 - 75 && var36 <= var10 + 75 && var37 >= var11 - 20 && var37 <= var11 + 20) {
											Calendar.openURL("https://oldschool.runescape.com/launcher", true, false);
										}

										var10 = Login.loginBoxX + 180;
										var11 = 326;
										if (var5 == 1 && var36 >= var10 - 75 && var36 <= var10 + 75 && var37 >= var11 - 20 && var37 <= var11 + 20) {
											MidiRequest.Login_promptCredentials(true);
										}
									} else if (Login.loginIndex == 34) {
										var10 = Login.loginBoxX + 180;
										var11 = 276;
										if (var5 == 1 && var36 >= var10 - 75 && var36 <= var10 + 75 && var37 >= var11 - 20 && var37 <= var11 + 20) {
											ModeWhere.method8389();
											return;
										}

										if (class6.World_request != null) {
											ModeWhere.method8389();
										}

										var10 = Login.loginBoxX + 180;
										var11 = 326;
										if (var5 == 1 && var36 >= var10 - 75 && var36 <= var10 + 75 && var37 >= var11 - 20 && var37 <= var11 + 20) {
											MidiRequest.Login_promptCredentials(false);
										}
									}
								} else {
									while (true) {
										do {
											if (!var9.method5890()) {
												var38 = 321;
												if (var5 == 1 && var37 >= var38 - 20 && var37 <= var38 + 20) {
													MidiRequest.Login_promptCredentials(true);
												}

												return;
											}
										} while(var9.field3063 != 84 && var9.field3063 != 13);

										MidiRequest.Login_promptCredentials(true);
									}
								}
							}
						}
					}

				}
			}
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ILcr;ZI)I",
		garbageValue = "414181365"
	)
	static int method4145(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) {
			var3 = Sound.topLevelWorldView.plane;
			int var15 = (class152.localPlayer.x >> 7) + Sound.topLevelWorldView.baseX;
			int var8 = (class152.localPlayer.y >> 7) + Sound.topLevelWorldView.baseY;
			Huffman.getWorldMap().method10295(var3, var15, var8, true);
			return 1;
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				String var16 = "";
				var9 = Huffman.getWorldMap().getMapArea(var3);
				if (var9 != null) {
					var16 = var9.getExternalName();
				}

				Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = var16;
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				Huffman.getWorldMap().setCurrentMapAreaId(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Huffman.getWorldMap().getZoomLevel();
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				Huffman.getWorldMap().setZoomPercentage(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Huffman.getWorldMap().isCacheLoaded() ? 1 : 0;
				return 1;
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
					Huffman.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
					Huffman.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
					Huffman.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
					Huffman.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Huffman.getWorldMap().getDisplayX();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Huffman.getWorldMap().getDisplayY();
					return 1;
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var11 = Huffman.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getOrigin().packed();
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var11 = Huffman.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var11 = Huffman.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var11 = Huffman.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getZoom();
						}

						return 1;
					} else if (var0 == 6615) {
						var14 = Huffman.getWorldMap().getDisplayCoord();
						if (var14 == null) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var14.x;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var14.y;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Huffman.getWorldMap().currentMapAreaId();
						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) {
						var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
						var11 = Huffman.getWorldMap().getCurrentMapArea();
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y);
							if (var12 == null) {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var12[0];
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var12[1];
							}

							return 1;
						}
					} else {
						Coord var5;
						if (var0 == 6618) {
							var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
							var11 = Huffman.getWorldMap().getCurrentMapArea();
							if (var11 == null) {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
								return 1;
							} else {
								var5 = var11.coord(var14.x, var14.y);
								if (var5 == null) {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.packed();
								}

								return 1;
							}
						} else {
							Coord var10;
							if (var0 == 6619) {
								Interpreter.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
								Projection.method5507(var3, var10, false);
								return 1;
							} else if (var0 == 6620) {
								Interpreter.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
								Projection.method5507(var3, var10, true);
								return 1;
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) {
								Interpreter.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
								var9 = Huffman.getWorldMap().getMapArea(var3);
								if (var9 == null) {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
									return 1;
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0;
									return 1;
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Huffman.getWorldMap().getDisplayWith();
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Huffman.getWorldMap().getDisplayHeight();
								return 1;
							} else if (var0 == 6623) {
								var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
								var11 = Huffman.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y);
								if (var11 == null) {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getId();
								}

								return 1;
							} else if (var0 == 6624) {
								Huffman.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6625) {
								Huffman.getWorldMap().resetMaxFlashCount();
								return 1;
							} else if (var0 == 6626) {
								Huffman.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6627) {
								Huffman.getWorldMap().resetCyclesPerFlash();
								return 1;
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) {
									var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
									Huffman.getWorldMap().setPerpetualFlash(var13);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) {
									var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
									Huffman.getWorldMap().flashElement(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) {
									var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
									Huffman.getWorldMap().flashCategory(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) {
									Huffman.getWorldMap().stopCurrentFlashes();
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) {
									var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
									Huffman.getWorldMap().setElementsDisabled(var13);
									return 1;
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) {
										Interpreter.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
										var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1;
										Huffman.getWorldMap().disableElement(var3, var7);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) {
										Interpreter.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
										var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1;
										Huffman.getWorldMap().setCategoryDisabled(var3, var7);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) {
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Huffman.getWorldMap().getElementsDisabled() ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) {
										var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Huffman.getWorldMap().isElementDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) {
										var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Huffman.getWorldMap().isCategoryDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == 6638) {
										Interpreter.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
										var10 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
										var5 = Huffman.getWorldMap().method10340(var3, var10);
										if (var5 == null) {
											Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
										} else {
											Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.packed();
										}

										return 1;
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) {
											var6 = Huffman.getWorldMap().iconStart();
											if (var6 == null) {
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.getElement();
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.coord2.packed();
											}

											return 1;
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) {
											var6 = Huffman.getWorldMap().iconNext();
											if (var6 == null) {
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.getElement();
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.coord2.packed();
											}

											return 1;
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) {
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
												var4 = InvDefinition.WorldMapElement_get(var3);
												if (var4.name == null) {
													Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = "";
												} else {
													Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = var4.name;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) {
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
												var4 = InvDefinition.WorldMapElement_get(var3);
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.textSize;
												return 1;
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) {
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
												var4 = InvDefinition.WorldMapElement_get(var3);
												if (var4 == null) {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.category;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) {
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
												var4 = InvDefinition.WorldMapElement_get(var3);
												if (var4 == null) {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.sprite1;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) {
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class383.worldMapEvent.mapElement;
												return 1;
											} else if (var0 == 6698) {
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class383.worldMapEvent.coord1.packed();
												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) {
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class383.worldMapEvent.coord2.packed();
												return 1;
											} else {
												return 2;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
