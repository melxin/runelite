import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.text.ParseException;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nx")
public class class358 extends Node {
	@ObfuscatedName("ae")
	public static short[] field4059;
	@ObfuscatedName("av")
	BitSet field4060;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 368452443
	)
	int field4057;

	class358(int var1) {
		this.field4057 = var1;
		this.field4060 = new BitSet(128);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lbm;Lsu;Lsu;B)V",
		garbageValue = "0"
	)
	@Export("loginScreen")
	static void loginScreen(GameEngine var0, Font var1, Font var2) {
		if (Login.worldSelectOpen) {
			class180.method4290(var0);
		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !UrlRequest.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453 && MouseHandler.MouseHandler_lastPressedX < Login.xPadding + 765 && MouseHandler.MouseHandler_lastPressedY < 503) {
				class468.clientPreferences.updateTitleMusicDisabled(!class468.clientPreferences.isTitleMusicDisabled());
				if (class468.clientPreferences.isTitleMusicDisabled()) {
					class167.method4167(0, 0);
				} else {
					class148.method3950("scape main", 255);
				}

				class179.method4284();
			}

			if (Client.gameState != 5) {
				if (Login.field710 == -1L) {
					Login.field710 = ParamComposition.method4708() + 1000L;
				}

				long var3 = ParamComposition.method4708();
				boolean var5;
				if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
					while (true) {
						if (Client.archiveLoadersDone >= Client.archiveLoaders.size()) {
							var5 = true;
							break;
						}

						ArchiveLoader var6 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone);
						if (!var6.isLoaded()) {
							var5 = false;
							break;
						}

						++Client.archiveLoadersDone;
					}
				} else {
					var5 = true;
				}

				if (var5 && -1L == Login.field711) {
					Login.field711 = var3;
					if (Login.field711 > Login.field710) {
						Login.field710 = Login.field711;
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) {
					int var21;
					if (Language.Language_EN == class352.clientLanguage) {
						if (MouseHandler.MouseHandler_lastButton == 1 || !UrlRequest.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
							var21 = Login.xPadding + 5;
							short var7 = 463;
							byte var8 = 100;
							byte var9 = 35;
							if (MouseHandler.MouseHandler_lastPressedX >= var21 && MouseHandler.MouseHandler_lastPressedX <= var8 + var21 && MouseHandler.MouseHandler_lastPressedY >= var7 && MouseHandler.MouseHandler_lastPressedY <= var7 + var9) {
								class177.method4267();
								return;
							}
						}

						if (Huffman.World_request != null) {
							class177.method4267();
						}
					}

					var21 = MouseHandler.MouseHandler_lastButton;
					int var37 = MouseHandler.MouseHandler_lastPressedX;
					int var38 = MouseHandler.MouseHandler_lastPressedY;
					if (var21 == 0) {
						var37 = MouseHandler.MouseHandler_x;
						var38 = MouseHandler.MouseHandler_y;
					}

					if (!UrlRequest.mouseCam && var21 == 4) {
						var21 = 1;
					}

					IndexCheck var22 = HttpRequest.method107();
					short var40;
					int var41;
					boolean var46;
					if (Login.loginIndex == 0) {
						var46 = false;

						while (var22.method6301()) {
							if (var22.field3233 == 84) {
								var46 = true;
							}
						}

						var41 = CollisionMap.loginBoxCenter - 80;
						var40 = 291;
						if (var21 == 1 && var37 >= var41 - 75 && var37 <= var41 + 75 && var38 >= var40 - 20 && var38 <= var40 + 20) {
							class558.openURL(EnumComposition.method4451("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws");
						}

						var41 = CollisionMap.loginBoxCenter + 80;
						if (var21 == 1 && var37 >= var41 - 75 && var37 <= var41 + 75 && var38 >= var40 - 20 && var38 <= var40 + 20 || var46) {
							if (class57.method2089()) {
								WorldMapDecoration.focusPasswordWhenUsernameFilled();
							} else {
								SpotAnimationDefinition.Login_promptCredentials(false);
							}
						}
					} else if (Login.loginIndex == 1) {
						var46 = SecureUrlRequester.client.containsAccessAndRefreshToken() || SecureUrlRequester.client.otlTokenRequesterInitialized() || SecureUrlRequester.client.containsSessionAndCharacterId();

						while (var22.method6301()) {
							if (var22.field3233 == 84) {
								if (var46) {
									class525.setLoginResponseString("", "Connecting to server...", "");
									Client.field422 = class604.field6072;
									class155.method4000(false);
									WorldMapSectionType.updateGameState(20);
								} else {
									SpotAnimationDefinition.Login_promptCredentials(false);
								}

								return;
							}

							if (var22.field3233 == 13) {
								class586.updateLoginStatusUsernameRemembered(true);
								return;
							}
						}

						var41 = CollisionMap.loginBoxCenter - 80;
						var40 = 321;
						if (var21 == 1 && var37 >= var41 - 75 && var37 <= var41 + 75 && var38 >= var40 - 20 && var38 <= var40 + 20) {
							if (var46) {
								class525.setLoginResponseString("", "Connecting to server...", "");
								Client.field422 = class604.field6072;
								class155.method4000(false);
								WorldMapSectionType.updateGameState(20);
							} else {
								SpotAnimationDefinition.Login_promptCredentials(false);
							}

							return;
						}

						var41 = CollisionMap.loginBoxCenter + 80;
						if (var21 == 1 && var37 >= var41 - 75 && var37 <= var41 + 75 && var38 >= var40 - 20 && var38 <= var40 + 20) {
							class586.updateLoginStatusUsernameRemembered(true);
							return;
						}
					} else {
						int var10;
						int var14;
						short var39;
						if (Login.loginIndex == 2) {
							var39 = 201;
							var10 = var39 + 52;
							if (var21 == 1 && var38 >= var10 - 12 && var38 < var10 + 2) {
								Login.currentLoginField = 0;
							}

							var10 += 15;
							if (var21 == 1 && var38 >= var10 - 12 && var38 < var10 + 2) {
								Login.currentLoginField = 1;
							}

							var10 += 15;
							var39 = 361;
							if (class181.field1964 != null) {
								var41 = class181.field1964.highX / 2;
								if (var21 == 1 && var37 >= class181.field1964.lowX - var41 && var37 <= var41 + class181.field1964.lowX && var38 >= var39 - 15 && var38 < var39) {
									switch(Login.field688) {
									case 1:
										class558.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065");
										return;
									case 2:
										class558.openURL("https://support.runescape.com/hc/en-gb");
									}
								}
							}

							var41 = CollisionMap.loginBoxCenter - 80;
							var40 = 321;
							if (var21 == 1 && var37 >= var41 - 75 && var37 <= var41 + 75 && var38 >= var40 - 20 && var38 <= var40 + 20) {
								class411.method8514();
								return;
							}

							var41 = Login.loginBoxX + 180 + 80;
							if (var21 == 1 && var37 >= var41 - 75 && var37 <= var41 + 75 && var38 >= var40 - 20 && var38 <= var40 + 20) {
								class30.method484(0);
								Login.Login_username = "";
								Login.Login_password = "";
								class28.otpMedium = 0;
								UserComparator6.otp = "";
								Login.rememberUsername = true;
							}

							var41 = CollisionMap.loginBoxCenter + -117;
							var40 = 277;
							Login.field684 = var37 >= var41 && var37 < var41 + class164.field1862 && var38 >= var40 && var38 < var40 + TaskHandler.field2564;
							if (var21 == 1 && Login.field684) {
								Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered;
								if (!Client.Login_isUsernameRemembered && class468.clientPreferences.getRememberedUsername() != null) {
									class468.clientPreferences.updateRememberedUsername((String)null);
								}
							}

							var41 = CollisionMap.loginBoxCenter + 24;
							var40 = 277;
							Login.field696 = var37 >= var41 && var37 < var41 + class164.field1862 && var38 >= var40 && var38 < var40 + TaskHandler.field2564;
							if (var21 == 1 && Login.field696) {
								class468.clientPreferences.updateHideUsername(!class468.clientPreferences.isUsernameHidden());
								if (!class468.clientPreferences.isUsernameHidden()) {
									Login.Login_username = "";
									class468.clientPreferences.updateRememberedUsername((String)null);
									WorldMapDecoration.focusPasswordWhenUsernameFilled();
								}
							}

							while (true) {
								int var44;
								Transferable var48;
								do {
									while (true) {
										label1302:
										do {
											while (true) {
												while (var22.method6301()) {
													if (var22.field3233 != 13) {
														if (Login.currentLoginField != 0) {
															continue label1302;
														}

														char var43 = var22.field3248;

														for (var14 = 0; var14 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length() && var43 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var14); ++var14) {
														}

														if (var22.field3233 == 85 && !Login.Login_username.isEmpty()) {
															Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
														}

														if (var22.field3233 == 84 || var22.field3233 == 80) {
															Login.currentLoginField = 1;
														}

														if (class145.method3901(var22.field3248) && Login.Login_username.length() < 320) {
															Login.Login_username = Login.Login_username + var22.field3248;
														}
													} else {
														class30.method484(0);
														Login.Login_username = "";
														Login.Login_password = "";
														class28.otpMedium = 0;
														UserComparator6.otp = "";
														Login.rememberUsername = true;
													}
												}

												return;
											}
										} while(Login.currentLoginField != 1);

										if (var22.field3233 == 85 && !Login.Login_password.isEmpty()) {
											Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
										} else if (var22.field3233 == 84 || var22.field3233 == 80) {
											Login.currentLoginField = 0;
											if (var22.field3233 == 84) {
												class411.method8514();
												return;
											}
										}

										if ((var22.isValidIndexInRange(82) || var22.isValidIndexInRange(87)) && var22.field3233 == 67) {
											Clipboard var47 = Toolkit.getDefaultToolkit().getSystemClipboard();
											var48 = var47.getContents(SecureUrlRequester.client);
											var44 = 20 - Login.Login_password.length();
											break;
										}

										if (AbstractWorldMapData.method6974(var22.field3248) && class145.method3901(var22.field3248) && Login.Login_password.length() < 20) {
											Login.Login_password = Login.Login_password + var22.field3248;
										}
									}
								} while(var44 <= 0);

								try {
									String var16 = (String)var48.getTransferData(DataFlavor.stringFlavor);
									int var17 = Math.min(var44, var16.length());

									for (int var45 = 0; var45 < var17; ++var45) {
										if (!AbstractWorldMapData.method6974(var16.charAt(var45)) || !class145.method3901(var16.charAt(var45))) {
											class30.method484(3);
											return;
										}
									}

									Login.Login_password = Login.Login_password + var16.substring(0, var17);
								} catch (UnsupportedFlavorException var35) {
								} catch (IOException var36) {
								}
							}
						} else {
							short var11;
							Bounds var25;
							if (Login.loginIndex == 3) {
								var10 = Login.loginBoxX + 180;
								var11 = 241;
								var25 = var1.method9826(25, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.".length() - 34, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", var10, var11);
								if (var21 == 1 && var25.method9245(var37, var38)) {
									class558.openURL("https://oldschool.runescape.com/launcher");
								}

								var10 = Login.loginBoxX + 180;
								var11 = 276;
								if (var21 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var38 >= var11 - 20 && var38 <= var11 + 20) {
									class586.updateLoginStatusUsernameRemembered(false);
								}

								var10 = Login.loginBoxX + 180;
								var11 = 326;
								if (var21 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var38 >= var11 - 20 && var38 <= var11 + 20) {
									class558.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065");
									return;
								}
							} else {
								int var13;
								if (Login.loginIndex == 4) {
									var10 = Login.loginBoxX + 180 - 80;
									var11 = 321;
									if (var21 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var38 >= var11 - 20 && var38 <= var11 + 20) {
										FriendSystem.method1654();
										return;
									}

									if (var21 == 1 && var37 >= Login.loginBoxX + 180 - 9 && var37 <= Login.loginBoxX + 180 + 130 && var38 >= 263 && var38 <= 296) {
										Login.rememberUsername = !Login.rememberUsername;
									}

									if (var21 == 1 && var37 >= Login.loginBoxX + 180 - 34 && var37 <= Login.loginBoxX + 34 + 180 && var38 >= 351 && var38 <= 363) {
										class558.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065");
									}

									var10 = Login.loginBoxX + 180 + 80;
									if (var21 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var38 >= var11 - 20 && var38 <= var11 + 20) {
										class30.method484(0);
										Login.Login_username = "";
										Login.Login_password = "";
										class28.otpMedium = 0;
										UserComparator6.otp = "";
									}

									while (var22.method6301()) {
										boolean var12 = false;

										for (var13 = 0; var13 < "1234567890".length(); ++var13) {
											if (var22.field3248 == "1234567890".charAt(var13)) {
												var12 = true;
												break;
											}
										}

										if (var22.field3233 == 13) {
											class30.method484(0);
											Login.Login_username = "";
											Login.Login_password = "";
											class28.otpMedium = 0;
											UserComparator6.otp = "";
										} else {
											if (var22.field3233 == 85 && !UserComparator6.otp.isEmpty()) {
												UserComparator6.otp = UserComparator6.otp.substring(0, UserComparator6.otp.length() - 1);
											}

											if (var22.field3233 == 84) {
												FriendSystem.method1654();
												return;
											}

											if (var12 && UserComparator6.otp.length() < 6) {
												UserComparator6.otp = UserComparator6.otp + var22.field3248;
											}
										}
									}
								} else if (Login.loginIndex == 5) {
									var10 = Login.loginBoxX + 180 - 80;
									var11 = 321;
									if (var21 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var38 >= var11 - 20 && var38 <= var11 + 20) {
										class299.performLoginRequest();
										return;
									}

									var10 = Login.loginBoxX + 180 + 80;
									if (var21 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var38 >= var11 - 20 && var38 <= var11 + 20) {
										SpotAnimationDefinition.Login_promptCredentials(true);
									}

									var40 = 361;
									if (WorldMapElement.field2009 != null) {
										var13 = WorldMapElement.field2009.highX / 2;
										if (var21 == 1 && var37 >= WorldMapElement.field2009.lowX - var13 && var37 <= var13 + WorldMapElement.field2009.lowX && var38 >= var40 - 15 && var38 < var40) {
											class558.openURL(EnumComposition.method4451("secure", true) + "m=weblogin/g=oldscape/cant_log_in");
										}
									}

									while (var22.method6301()) {
										boolean var42 = false;

										for (var14 = 0; var14 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var14) {
											if (var22.field3248 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var14)) {
												var42 = true;
												break;
											}
										}

										if (var22.field3233 == 13) {
											SpotAnimationDefinition.Login_promptCredentials(true);
										} else {
											if (var22.field3233 == 85 && !Login.Login_username.isEmpty()) {
												Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
											}

											if (var22.field3233 == 84) {
												class299.performLoginRequest();
												return;
											}

											if (var42 && Login.Login_username.length() < 320) {
												Login.Login_username = Login.Login_username + var22.field3248;
											}
										}
									}
								} else if (Login.loginIndex != 6) {
									if (Login.loginIndex == 7) {
										if (Frames.field2971 && !Client.onMobile) {
											var10 = CollisionMap.loginBoxCenter - 150;
											var41 = var10 + 40 + 240 + 25;
											var40 = 231;
											var13 = var40 + 40;
											if (var21 == 1 && var37 >= var10 && var37 <= var41 && var38 >= var40 && var38 <= var13) {
												Login.field706 = class450.method9119(var10, var37);
											}

											var14 = Login.loginBoxX + 180 - 80;
											short var15 = 321;
											boolean var18;
											Calendar var19;
											Date var20;
											Date var26;
											boolean var28;
											boolean var30;
											if (var21 == 1 && var37 >= var14 - 75 && var37 <= var14 + 75 && var38 >= var15 - 20 && var38 <= var15 + 20) {
												label1203: {
													try {
														var26 = class356.method7608();
													} catch (ParseException var34) {
														WorldMapEvent.method7177("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
														var28 = false;
														break label1203;
													}

													if (var26 == null) {
														var28 = false;
													} else {
														var19 = Calendar.getInstance();
														var19.set(1, var19.get(1) - 13);
														var19.set(5, var19.get(5) + 1);
														var19.set(11, 0);
														var19.set(12, 0);
														var19.set(13, 0);
														var19.set(14, 0);
														var20 = var19.getTime();
														var18 = var26.before(var20);
														var30 = class4.method17(var26);
														if (!var30) {
															WorldMapEvent.method7177("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
															var28 = false;
														} else {
															if (!var18) {
																class67.field890 = 8388607;
															} else {
																class67.field890 = (int)(var26.getTime() / 86400000L - 11745L);
															}

															var28 = true;
														}
													}
												}

												if (var28) {
													WorldMapSectionType.updateGameState(50);
													return;
												}
											}

											var14 = Login.loginBoxX + 180 + 80;
											if (var21 == 1 && var37 >= var14 - 75 && var37 <= var14 + 75 && var38 >= var15 - 20 && var38 <= var15 + 20) {
												Login.field694 = new String[8];
												SpotAnimationDefinition.Login_promptCredentials(true);
											}

											while (var22.method6301()) {
												if (var22.field3233 == 101) {
													Login.field694[Login.field706] = null;
												}

												if (var22.field3233 == 85) {
													if (Login.field694[Login.field706] == null && Login.field706 > 0) {
														--Login.field706;
													}

													Login.field694[Login.field706] = null;
												}

												if (var22.field3248 >= '0' && var22.field3248 <= '9') {
													Login.field694[Login.field706] = "" + var22.field3248;
													if (Login.field706 < 7) {
														++Login.field706;
													}
												}

												if (var22.field3233 == 84) {
													label1127: {
														try {
															var26 = class356.method7608();
														} catch (ParseException var33) {
															WorldMapEvent.method7177("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
															var28 = false;
															break label1127;
														}

														if (var26 == null) {
															var28 = false;
														} else {
															var19 = Calendar.getInstance();
															var19.set(1, var19.get(1) - 13);
															var19.set(5, var19.get(5) + 1);
															var19.set(11, 0);
															var19.set(12, 0);
															var19.set(13, 0);
															var19.set(14, 0);
															var20 = var19.getTime();
															var18 = var26.before(var20);
															var30 = class4.method17(var26);
															if (!var30) {
																WorldMapEvent.method7177("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
																var28 = false;
															} else {
																if (!var18) {
																	class67.field890 = 8388607;
																} else {
																	class67.field890 = (int)(var26.getTime() / 86400000L - 11745L);
																}

																var28 = true;
															}
														}
													}

													if (var28) {
														WorldMapSectionType.updateGameState(50);
													}

													return;
												}
											}
										} else {
											var10 = Login.loginBoxX + 180 - 80;
											var11 = 321;
											if (var21 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var38 >= var11 - 20 && var38 <= var11 + 20) {
												class558.openURL(EnumComposition.method4451("secure", true) + "m=dob/set_dob.ws");
												class525.setLoginResponseString("", "Page has opened in the browser.", "");
												class30.method484(6);
												return;
											}

											var10 = Login.loginBoxX + 180 + 80;
											if (var21 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var38 >= var11 - 20 && var38 <= var11 + 20) {
												SpotAnimationDefinition.Login_promptCredentials(true);
											}
										}
									} else if (Login.loginIndex == 8) {
										var10 = Login.loginBoxX + 180 - 80;
										var11 = 321;
										if (var21 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var38 >= var11 - 20 && var38 <= var11 + 20) {
											class558.openURL("https://www.jagex.com/terms/privacy");
											class525.setLoginResponseString("", "Page has opened in the browser.", "");
											class30.method484(6);
											return;
										}

										var10 = Login.loginBoxX + 180 + 80;
										if (var21 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var38 >= var11 - 20 && var38 <= var11 + 20) {
											SpotAnimationDefinition.Login_promptCredentials(true);
										}
									} else if (Login.loginIndex == 9) {
										var10 = Login.loginBoxX + 180;
										var11 = 311;
										if (var22.field3233 == 84 || var22.field3233 == 13 || var21 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var38 >= var11 - 20 && var38 <= var11 + 20) {
											class586.updateLoginStatusUsernameRemembered(false);
										}
									} else if (Login.loginIndex == 10) {
										var10 = Login.loginBoxX + 180;
										var11 = 209;
										if (var22.field3233 == 84 || var21 == 1 && var37 >= var10 - 109 && var37 <= var10 + 109 && var38 >= var11 && var38 <= var11 + 68) {
											if (class57.method2089()) {
												return;
											}

											class525.setLoginResponseString("", "Connecting to server...", "");
											Client.field422 = class604.field6072;
											class155.method4000(false);
											WorldMapSectionType.updateGameState(20);
										}
									} else if (Login.loginIndex == 12) {
										var10 = CollisionMap.loginBoxCenter;
										var11 = 233;
										var25 = var2.method9826(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var11);
										Bounds var23 = var2.method9826(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var11);
										Bounds var24 = var2.method9826(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var11);
										var41 = var11 + 17;
										Bounds var31 = var2.method9826(0, 34, "<col=ffd200>agreement (EULA)</col>.", var10, var41);
										if (var21 == 1) {
											if (var25.method9245(var37, var38)) {
												class558.openURL("https://www.jagex.com/terms");
											} else if (var23.method9245(var37, var38)) {
												class558.openURL("https://www.jagex.com/terms/privacy");
											} else if (var24.method9245(var37, var38) || var31.method9245(var37, var38)) {
												class558.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool");
											}
										}

										var10 = CollisionMap.loginBoxCenter - 80;
										var11 = 311;
										if (var21 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var38 >= var11 - 20 && var38 <= var11 + 20) {
											WorldMapAreaData.method7117();
											class586.updateLoginStatusUsernameRemembered(true);
										}

										var10 = CollisionMap.loginBoxCenter + 80;
										if (var21 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var38 >= var11 - 20 && var38 <= var11 + 20) {
											Login.loginIndex = 13;
										}
									} else if (Login.loginIndex == 13) {
										var10 = CollisionMap.loginBoxCenter;
										var11 = 321;
										if (var21 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var38 >= var11 - 20 && var38 <= var11 + 20) {
											class586.updateLoginStatusUsernameRemembered(true);
										}
									} else if (Login.loginIndex == 14) {
										String var32 = "";
										switch(Login.Login_banType) {
										case 0:
											var32 = "https://secure.runescape.com/m=offence-appeal/account-history";
											break;
										case 1:
											var32 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
											break;
										case 2:
											var32 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
											break;
										default:
											SpotAnimationDefinition.Login_promptCredentials(false);
										}

										var41 = Login.loginBoxX + 180;
										var40 = 276;
										if (var21 == 1 && var37 >= var41 - 75 && var37 <= var41 + 75 && var38 >= var40 - 20 && var38 <= var40 + 20) {
											class558.openURL(var32);
											class525.setLoginResponseString("", "Page has opened in the browser.", "");
											class30.method484(6);
											return;
										}

										var41 = Login.loginBoxX + 180;
										var40 = 326;
										if (var21 == 1 && var37 >= var41 - 75 && var37 <= var41 + 75 && var38 >= var40 - 20 && var38 <= var40 + 20) {
											SpotAnimationDefinition.Login_promptCredentials(false);
										}
									} else if (Login.loginIndex == 24) {
										var10 = Login.loginBoxX + 180;
										var11 = 301;
										if (var21 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var38 >= var11 - 20 && var38 <= var11 + 20) {
											class586.updateLoginStatusUsernameRemembered(false);
										}
									} else if (Login.loginIndex == 32) {
										var10 = Login.loginBoxX + 180 - 80;
										var11 = 321;
										if (var21 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var38 >= var11 - 20 && var38 <= var11 + 20) {
											class558.openURL(EnumComposition.method4451("secure", true) + "m=dob/set_dob.ws");
											class525.setLoginResponseString("", "Page has opened in the browser.", "");
											class30.method484(6);
											return;
										}

										var10 = Login.loginBoxX + 180 + 80;
										if (var21 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var38 >= var11 - 20 && var38 <= var11 + 20) {
											SpotAnimationDefinition.Login_promptCredentials(true);
										}
									} else if (Login.loginIndex == 33) {
										var10 = Login.loginBoxX + 180;
										var11 = 276;
										if (var21 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var38 >= var11 - 20 && var38 <= var11 + 20) {
											class558.openURL("https://oldschool.runescape.com/launcher");
										}

										var10 = Login.loginBoxX + 180;
										var11 = 326;
										if (var21 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var38 >= var11 - 20 && var38 <= var11 + 20) {
											SpotAnimationDefinition.Login_promptCredentials(true);
										}
									} else if (Login.loginIndex == 34) {
										var10 = Login.loginBoxX + 180;
										var11 = 276;
										if (var21 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var38 >= var11 - 20 && var38 <= var11 + 20) {
											class177.method4267();
											return;
										}

										if (Huffman.World_request != null) {
											class177.method4267();
										}

										var10 = Login.loginBoxX + 180;
										var11 = 326;
										if (var21 == 1 && var37 >= var10 - 75 && var37 <= var10 + 75 && var38 >= var11 - 20 && var38 <= var11 + 20) {
											SpotAnimationDefinition.Login_promptCredentials(false);
										}
									}
								} else {
									while (true) {
										do {
											if (!var22.method6301()) {
												var39 = 321;
												if (var21 == 1 && var38 >= var39 - 20 && var38 <= var39 + 20) {
													SpotAnimationDefinition.Login_promptCredentials(true);
												}

												return;
											}
										} while(var22.field3233 != 84 && var22.field3233 != 13);

										SpotAnimationDefinition.Login_promptCredentials(true);
									}
								}
							}
						}
					}

				}
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Lnb;",
		garbageValue = "1944344283"
	)
	public static class343 method7617(int var0) {
		return class343.field3911[var0];
	}
}
