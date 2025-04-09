import java.awt.Component;
import java.awt.Graphics;
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
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("az")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("ao")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1;
	}

	public final void update(Graphics var1) {
		this.component.update(var1);
	}

	public final void paint(Graphics var1) {
		this.component.paint(var1);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lbk;Lrk;Lrk;I)V",
		garbageValue = "-1208619030"
	)
	@Export("loginScreen")
	static void loginScreen(GameEngine var0, Font var1, Font var2) {
		if (Login.worldSelectOpen) {
			class478.method9116(var0);
		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !Occluder.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453 && MouseHandler.MouseHandler_lastPressedX < Login.xPadding + 765 && MouseHandler.MouseHandler_lastPressedY < 503) {
				Renderable.clientPreferences.updateTitleMusicDisabled(!Renderable.clientPreferences.isTitleMusicDisabled());
				if (Renderable.clientPreferences.isTitleMusicDisabled()) {
					MenuAction.method2254(0, 0);
				} else {
					class532.method9742("scape main", 255);
				}

				class438.method8301();
			}

			if (Client.gameState != 5) {
				if (-1L == Login.field944) {
					Login.field944 = class282.method5908() + 1000L;
				}

				long var3 = class282.method5908();
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

				if (var5 && -1L == Login.field962) {
					Login.field962 = var3;
					if (Login.field962 > Login.field944) {
						Login.field944 = Login.field962;
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) {
					int var24;
					if (Language.Language_EN == class248.clientLanguage) {
						if (MouseHandler.MouseHandler_lastButton == 1 || !Occluder.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
							var24 = Login.xPadding + 5;
							short var7 = 463;
							byte var8 = 100;
							byte var9 = 35;
							if (MouseHandler.MouseHandler_lastPressedX >= var24 && MouseHandler.MouseHandler_lastPressedX <= var8 + var24 && MouseHandler.MouseHandler_lastPressedY >= var7 && MouseHandler.MouseHandler_lastPressedY <= var7 + var9) {
								class453.method8726();
								return;
							}
						}

						if (class33.World_request != null) {
							class453.method8726();
						}
					}

					var24 = MouseHandler.MouseHandler_lastButton;
					int var38 = MouseHandler.MouseHandler_lastPressedX;
					int var39 = MouseHandler.MouseHandler_lastPressedY;
					if (var24 == 0) {
						var38 = MouseHandler.MouseHandler_x;
						var39 = MouseHandler.MouseHandler_y;
					}

					if (!Occluder.mouseCam && var24 == 4) {
						var24 = 1;
					}

					IndexCheck var25 = ArchiveDiskAction.method7614();
					short var41;
					int var42;
					if (Login.loginIndex == 0) {
						boolean var49 = false;

						while (var25.method5689()) {
							if (var25.field3071 == 84) {
								var49 = true;
							}
						}

						var42 = class387.loginBoxCenter - 80;
						var41 = 291;
						if (var24 == 1 && var38 >= var42 - 75 && var38 <= var42 + 75 && var39 >= var41 - 20 && var39 <= var41 + 20) {
							RestClientThreadFactory.openURL(WorldMapArchiveLoader.method9796("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
						}

						var42 = class387.loginBoxCenter + 80;
						if (var24 == 1 && var38 >= var42 - 75 && var38 <= var42 + 75 && var39 >= var41 - 20 && var39 <= var41 + 20 || var49) {
							ClientPreferences.method2767();
						}
					} else {
						int var10;
						short var11;
						if (Login.loginIndex == 1) {
							while (true) {
								if (!var25.method5689()) {
									var10 = class387.loginBoxCenter - 80;
									var11 = 321;
									if (var24 == 1 && var38 >= var10 - 75 && var38 <= var10 + 75 && var39 >= var11 - 20 && var39 <= var11 + 20) {
										class396.Login_promptCredentials(false);
									}

									var10 = class387.loginBoxCenter + 80;
									if (var24 == 1 && var38 >= var10 - 75 && var38 <= var10 + 75 && var39 >= var11 - 20 && var39 <= var11 + 20) {
										class137.method3379(0);
									}
									break;
								}

								if (var25.field3071 == 84) {
									class396.Login_promptCredentials(false);
								} else if (var25.field3071 == 13) {
									class137.method3379(0);
								}
							}
						} else {
							int var15;
							boolean var19;
							int var30;
							short var40;
							boolean var43;
							if (Login.loginIndex == 2) {
								var40 = 201;
								var10 = var40 + 52;
								if (var24 == 1 && var39 >= var10 - 12 && var39 < var10 + 2) {
									Login.currentLoginField = 0;
								}

								var10 += 15;
								if (var24 == 1 && var39 >= var10 - 12 && var39 < var10 + 2) {
									Login.currentLoginField = 1;
								}

								var10 += 15;
								var40 = 361;
								if (SoundCache.field299 != null) {
									var42 = SoundCache.field299.highX / 2;
									if (var24 == 1 && var38 >= SoundCache.field299.lowX - var42 && var38 <= var42 + SoundCache.field299.lowX && var39 >= var40 - 15 && var39 < var40) {
										switch(Login.field956) {
										case 1:
											RestClientThreadFactory.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
											return;
										case 2:
											RestClientThreadFactory.openURL("https://support.runescape.com/hc/en-gb", true, false);
										}
									}
								}

								var42 = class387.loginBoxCenter - 80;
								var41 = 321;
								if (var24 == 1 && var38 >= var42 - 75 && var38 <= var42 + 75 && var39 >= var41 - 20 && var39 <= var41 + 20) {
									Login.Login_username = Login.Login_username.trim();
									if (Login.Login_username.isEmpty()) {
										TileItem.setLoginResponseString("", "Please enter your username/email address.", "");
									} else if (Login.Login_password.isEmpty()) {
										TileItem.setLoginResponseString("", "Please enter your password.", "");
									} else {
										TileItem.setLoginResponseString("", "Connecting to server...", "");
										Client.authenticationScheme = Renderable.clientPreferences.containsKey(Login.Login_username) ? AuthenticationScheme.USERNAME_PASSWORD_REMEMBER : AuthenticationScheme.USERNAME_PASSWORD;
										class325.updateGameState(20);
									}

									return;
								}

								var42 = Login.loginBoxX + 180 + 80;
								if (var24 == 1 && var38 >= var42 - 75 && var38 <= var42 + 75 && var39 >= var41 - 20 && var39 <= var41 + 20) {
									class137.method3379(0);
									Login.Login_username = "";
									Login.Login_password = "";
									class137.otpMedium = 0;
									WorldMapIcon_1.otp = "";
									Login.rememberUsername = true;
								}

								var42 = class387.loginBoxCenter + -117;
								var41 = 277;
								Login.field943 = var38 >= var42 && var38 < var42 + class138.field1645 && var39 >= var41 && var39 < var41 + class95.field1174;
								if (var24 == 1 && Login.field943) {
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered;
									if (!Client.Login_isUsernameRemembered && Renderable.clientPreferences.getRememberedUsername() != null) {
										Renderable.clientPreferences.updateRememberedUsername((String)null);
									}
								}

								var42 = class387.loginBoxCenter + 24;
								var41 = 277;
								Login.field952 = var38 >= var42 && var38 < var42 + class138.field1645 && var39 >= var41 && var39 < var41 + class95.field1174;
								if (var24 == 1 && Login.field952) {
									Renderable.clientPreferences.updateHideUsername(!Renderable.clientPreferences.isUsernameHidden());
									if (!Renderable.clientPreferences.isUsernameHidden()) {
										Login.Login_username = "";
										Renderable.clientPreferences.updateRememberedUsername((String)null);
										ChatChannel.focusPasswordWhenUsernameFilled();
									}
								}

								label1419:
								while (true) {
									Transferable var52;
									do {
										while (true) {
											char var45;
											label1337:
											do {
												while (true) {
													while (var25.method5689()) {
														if (var25.field3071 != 13) {
															if (Login.currentLoginField != 0) {
																continue label1337;
															}

															MusicPatchNode.method6858(var25.field3066);
															if (var25.field3071 == 85 && !Login.Login_username.isEmpty()) {
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (var25.field3071 == 84 || var25.field3071 == 80) {
																Login.currentLoginField = 1;
															}

															var45 = var25.field3066;
															var43 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var45) != -1;
															if (var43 && Login.Login_username.length() < 320) {
																Login.Login_username = Login.Login_username + var25.field3066;
															}
														} else {
															class137.method3379(0);
															Login.Login_username = "";
															Login.Login_password = "";
															class137.otpMedium = 0;
															WorldMapIcon_1.otp = "";
															Login.rememberUsername = true;
														}
													}

													return;
												}
											} while(Login.currentLoginField != 1);

											if (var25.field3071 == 85 && !Login.Login_password.isEmpty()) {
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
											} else if (var25.field3071 == 84 || var25.field3071 == 80) {
												Login.currentLoginField = 0;
												if (var25.field3071 == 84) {
													Login.Login_username = Login.Login_username.trim();
													if (Login.Login_username.isEmpty()) {
														TileItem.setLoginResponseString("", "Please enter your username/email address.", "");
													} else if (Login.Login_password.isEmpty()) {
														TileItem.setLoginResponseString("", "Please enter your password.", "");
													} else {
														TileItem.setLoginResponseString("", "Connecting to server...", "");
														Client.authenticationScheme = Renderable.clientPreferences.containsKey(Login.Login_username) ? AuthenticationScheme.USERNAME_PASSWORD_REMEMBER : AuthenticationScheme.USERNAME_PASSWORD;
														class325.updateGameState(20);
													}

													return;
												}
											}

											if ((var25.isValidIndexInRange(82) || var25.isValidIndexInRange(87)) && var25.field3071 == 67) {
												Clipboard var51 = Toolkit.getDefaultToolkit().getSystemClipboard();
												var52 = var51.getContents(SecureRandomCallable.client);
												var15 = 20 - Login.Login_password.length();
												break;
											}

											var45 = var25.field3066;
											if ((var45 < ' ' || var45 >= 127) && (var45 <= 127 || var45 >= 160) && (var45 <= 160 || var45 > 255)) {
												label1568: {
													if (var45 != 0) {
														char[] var53 = class433.cp1252AsciiExtension;

														for (var30 = 0; var30 < var53.length; ++var30) {
															char var17 = var53[var30];
															if (var17 == var45) {
																var43 = true;
																break label1568;
															}
														}
													}

													var43 = false;
												}
											} else {
												var43 = true;
											}

											if (var43) {
												char var55 = var25.field3066;
												boolean var46 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var55) != -1;
												if (var46 && Login.Login_password.length() < 20) {
													Login.Login_password = Login.Login_password + var25.field3066;
												}
											}
										}
									} while(var15 <= 0);

									try {
										String var16 = (String)var52.getTransferData(DataFlavor.stringFlavor);
										int var47 = Math.min(var15, var16.length());
										int var48 = 0;

										while (true) {
											if (var48 >= var47) {
												Login.Login_password = Login.Login_password + var16.substring(0, var47);
												continue label1419;
											}

											char var20 = var16.charAt(var48);
											if ((var20 < ' ' || var20 >= 127) && (var20 <= 127 || var20 >= 160) && (var20 <= 160 || var20 > 255)) {
												label1571: {
													if (var20 != 0) {
														char[] var21 = class433.cp1252AsciiExtension;

														for (int var22 = 0; var22 < var21.length; ++var22) {
															char var23 = var21[var22];
															if (var20 == var23) {
																var19 = true;
																break label1571;
															}
														}
													}

													var19 = false;
												}
											} else {
												var19 = true;
											}

											if (!var19) {
												break;
											}

											char var50 = var16.charAt(var48);
											boolean var28 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var50) != -1;
											if (!var28) {
												break;
											}

											++var48;
										}

										class137.method3379(3);
										return;
									} catch (UnsupportedFlavorException var36) {
									} catch (IOException var37) {
									}
								}
							} else {
								Bounds var31;
								if (Login.loginIndex == 3) {
									var10 = Login.loginBoxX + 180;
									var11 = 241;
									var31 = var1.method8741(25, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.".length() - 34, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", var10, var11);
									if (var24 == 1 && var31.method8322(var38, var39)) {
										RestClientThreadFactory.openURL("https://oldschool.runescape.com/launcher", true, false);
									}

									var10 = Login.loginBoxX + 180;
									var11 = 276;
									if (var24 == 1 && var38 >= var10 - 75 && var38 <= var10 + 75 && var39 >= var11 - 20 && var39 <= var11 + 20) {
										class563.updateLoginStatusUsernameRemembered(false);
									}

									var10 = Login.loginBoxX + 180;
									var11 = 326;
									if (var24 == 1 && var38 >= var10 - 75 && var38 <= var10 + 75 && var39 >= var11 - 20 && var39 <= var11 + 20) {
										RestClientThreadFactory.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
										return;
									}
								} else {
									int var13;
									if (Login.loginIndex == 4) {
										var10 = Login.loginBoxX + 180 - 80;
										var11 = 321;
										if (var24 == 1 && var38 >= var10 - 75 && var38 <= var10 + 75 && var39 >= var11 - 20 && var39 <= var11 + 20) {
											class167.method3697();
											return;
										}

										if (var24 == 1 && var38 >= Login.loginBoxX + 180 - 9 && var38 <= Login.loginBoxX + 180 + 130 && var39 >= 263 && var39 <= 296) {
											Login.rememberUsername = !Login.rememberUsername;
										}

										if (var24 == 1 && var38 >= Login.loginBoxX + 180 - 34 && var38 <= Login.loginBoxX + 34 + 180 && var39 >= 351 && var39 <= 363) {
											RestClientThreadFactory.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
										}

										var10 = Login.loginBoxX + 180 + 80;
										if (var24 == 1 && var38 >= var10 - 75 && var38 <= var10 + 75 && var39 >= var11 - 20 && var39 <= var11 + 20) {
											class137.method3379(0);
											Login.Login_username = "";
											Login.Login_password = "";
											class137.otpMedium = 0;
											WorldMapIcon_1.otp = "";
										}

										while (var25.method5689()) {
											boolean var12 = false;

											for (var13 = 0; var13 < "1234567890".length(); ++var13) {
												if (var25.field3066 == "1234567890".charAt(var13)) {
													var12 = true;
													break;
												}
											}

											if (var25.field3071 == 13) {
												class137.method3379(0);
												Login.Login_username = "";
												Login.Login_password = "";
												class137.otpMedium = 0;
												WorldMapIcon_1.otp = "";
											} else {
												if (var25.field3071 == 85 && !WorldMapIcon_1.otp.isEmpty()) {
													WorldMapIcon_1.otp = WorldMapIcon_1.otp.substring(0, WorldMapIcon_1.otp.length() - 1);
												}

												if (var25.field3071 == 84) {
													class167.method3697();
													return;
												}

												if (var12 && WorldMapIcon_1.otp.length() < 6) {
													WorldMapIcon_1.otp = WorldMapIcon_1.otp + var25.field3066;
												}
											}
										}
									} else {
										int var14;
										if (Login.loginIndex == 5) {
											var10 = Login.loginBoxX + 180 - 80;
											var11 = 321;
											if (var24 == 1 && var38 >= var10 - 75 && var38 <= var10 + 75 && var39 >= var11 - 20 && var39 <= var11 + 20) {
												class92.method2492();
												return;
											}

											var10 = Login.loginBoxX + 180 + 80;
											if (var24 == 1 && var38 >= var10 - 75 && var38 <= var10 + 75 && var39 >= var11 - 20 && var39 <= var11 + 20) {
												class396.Login_promptCredentials(true);
											}

											var41 = 361;
											if (KeyHandler.field93 != null) {
												var13 = KeyHandler.field93.highX / 2;
												if (var24 == 1 && var38 >= KeyHandler.field93.lowX - var13 && var38 <= var13 + KeyHandler.field93.lowX && var39 >= var41 - 15 && var39 < var41) {
													RestClientThreadFactory.openURL(WorldMapArchiveLoader.method9796("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
												}
											}

											while (var25.method5689()) {
												var43 = false;

												for (var14 = 0; var14 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var14) {
													if (var25.field3066 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var14)) {
														var43 = true;
														break;
													}
												}

												if (var25.field3071 == 13) {
													class396.Login_promptCredentials(true);
												} else {
													if (var25.field3071 == 85 && !Login.Login_username.isEmpty()) {
														Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
													}

													if (var25.field3071 == 84) {
														class92.method2492();
														return;
													}

													if (var43 && Login.Login_username.length() < 320) {
														Login.Login_username = Login.Login_username + var25.field3066;
													}
												}
											}
										} else if (Login.loginIndex != 6) {
											if (Login.loginIndex == 7) {
												if (Occluder.field2185 && !Client.onMobile) {
													var10 = class387.loginBoxCenter - 150;
													var42 = var10 + 40 + 240 + 25;
													var41 = 231;
													var13 = var41 + 40;
													if (var24 == 1 && var38 >= var10 && var38 <= var42 && var39 >= var41 && var39 <= var13) {
														var15 = var10;
														var30 = 0;

														while (true) {
															if (var30 >= 8) {
																var14 = 0;
																break;
															}

															if (var38 <= var15 + 30) {
																var14 = var30;
																break;
															}

															var15 += 30;
															var15 += var30 != 1 && var30 != 3 ? 5 : 20;
															++var30;
														}

														Login.field940 = var14;
													}

													var14 = Login.loginBoxX + 180 - 80;
													short var44 = 321;
													boolean var54;
													if (var24 == 1 && var38 >= var14 - 75 && var38 <= var14 + 75 && var39 >= var44 - 20 && var39 <= var44 + 20) {
														var54 = UserComparator3.method3233();
														if (var54) {
															class325.updateGameState(50);
															return;
														}
													}

													var14 = Login.loginBoxX + 180 + 80;
													if (var24 == 1 && var38 >= var14 - 75 && var38 <= var14 + 75 && var39 >= var44 - 20 && var39 <= var44 + 20) {
														Login.field933 = new String[8];
														class396.Login_promptCredentials(true);
													}

													while (var25.method5689()) {
														if (var25.field3071 == 101) {
															Login.field933[Login.field940] = null;
														}

														if (var25.field3071 == 85) {
															if (Login.field933[Login.field940] == null && Login.field940 > 0) {
																--Login.field940;
															}

															Login.field933[Login.field940] = null;
														}

														if (var25.field3066 >= '0' && var25.field3066 <= '9') {
															Login.field933[Login.field940] = "" + var25.field3066;
															if (Login.field940 < 7) {
																++Login.field940;
															}
														}

														if (var25.field3071 == 84) {
															label1168: {
																Date var32;
																try {
																	var32 = AttackOption.method2972();
																} catch (ParseException var35) {
																	class251.method5232("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
																	var54 = false;
																	break label1168;
																}

																if (var32 == null) {
																	var54 = false;
																} else {
																	boolean var18 = class165.method3681(var32);
																	var19 = class521.method9684(var32);
																	if (!var19) {
																		class251.method5232("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
																		var54 = false;
																	} else {
																		if (!var18) {
																			class387.field4577 = 8388607;
																		} else {
																			class387.field4577 = (int)(var32.getTime() / 86400000L - 11745L);
																		}

																		var54 = true;
																	}
																}
															}

															if (var54) {
																class325.updateGameState(50);
															}

															return;
														}
													}
												} else {
													var10 = Login.loginBoxX + 180 - 80;
													var11 = 321;
													if (var24 == 1 && var38 >= var10 - 75 && var38 <= var10 + 75 && var39 >= var11 - 20 && var39 <= var11 + 20) {
														RestClientThreadFactory.openURL(WorldMapArchiveLoader.method9796("secure", true) + "m=dob/set_dob.ws", true, false);
														TileItem.setLoginResponseString("", "Page has opened in the browser.", "");
														class137.method3379(6);
														return;
													}

													var10 = Login.loginBoxX + 180 + 80;
													if (var24 == 1 && var38 >= var10 - 75 && var38 <= var10 + 75 && var39 >= var11 - 20 && var39 <= var11 + 20) {
														class396.Login_promptCredentials(true);
													}
												}
											} else if (Login.loginIndex == 8) {
												var10 = Login.loginBoxX + 180 - 80;
												var11 = 321;
												if (var24 == 1 && var38 >= var10 - 75 && var38 <= var10 + 75 && var39 >= var11 - 20 && var39 <= var11 + 20) {
													RestClientThreadFactory.openURL("https://www.jagex.com/terms/privacy", true, false);
													TileItem.setLoginResponseString("", "Page has opened in the browser.", "");
													class137.method3379(6);
													return;
												}

												var10 = Login.loginBoxX + 180 + 80;
												if (var24 == 1 && var38 >= var10 - 75 && var38 <= var10 + 75 && var39 >= var11 - 20 && var39 <= var11 + 20) {
													class396.Login_promptCredentials(true);
												}
											} else if (Login.loginIndex == 9) {
												var10 = Login.loginBoxX + 180;
												var11 = 311;
												if (var25.field3071 == 84 || var25.field3071 == 13 || var24 == 1 && var38 >= var10 - 75 && var38 <= var10 + 75 && var39 >= var11 - 20 && var39 <= var11 + 20) {
													class563.updateLoginStatusUsernameRemembered(false);
												}
											} else if (Login.loginIndex == 10) {
												var10 = Login.loginBoxX + 180;
												var11 = 209;
												if (var25.field3071 == 84 || var24 == 1 && var38 >= var10 - 109 && var38 <= var10 + 109 && var39 >= var11 && var39 <= var11 + 68) {
													TileItem.setLoginResponseString("", "Connecting to server...", "");
													Client.field515 = class573.field5652;
													Client.authenticationScheme = Renderable.clientPreferences.containsKey(Login.Login_username) ? AuthenticationScheme.USERNAME_PASSWORD_REMEMBER : AuthenticationScheme.USERNAME_PASSWORD;
													class325.updateGameState(20);
												}
											} else if (Login.loginIndex == 12) {
												var10 = class387.loginBoxCenter;
												var11 = 233;
												var31 = var2.method8741(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var11);
												Bounds var26 = var2.method8741(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var11);
												Bounds var27 = var2.method8741(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var11);
												var42 = var11 + 17;
												Bounds var29 = var2.method8741(0, 34, "<col=ffd200>agreement (EULA)</col>.", var10, var42);
												if (var24 == 1) {
													if (var31.method8322(var38, var39)) {
														RestClientThreadFactory.openURL("https://www.jagex.com/terms", true, false);
													} else if (var26.method8322(var38, var39)) {
														RestClientThreadFactory.openURL("https://www.jagex.com/terms/privacy", true, false);
													} else if (var27.method8322(var38, var39) || var29.method8322(var38, var39)) {
														RestClientThreadFactory.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
													}
												}

												var10 = class387.loginBoxCenter - 80;
												var11 = 311;
												if (var24 == 1 && var38 >= var10 - 75 && var38 <= var10 + 75 && var39 >= var11 - 20 && var39 <= var11 + 20) {
													RouteStrategy.method5756();
													class563.updateLoginStatusUsernameRemembered(true);
												}

												var10 = class387.loginBoxCenter + 80;
												if (var24 == 1 && var38 >= var10 - 75 && var38 <= var10 + 75 && var39 >= var11 - 20 && var39 <= var11 + 20) {
													Login.loginIndex = 13;
												}
											} else if (Login.loginIndex == 13) {
												var10 = class387.loginBoxCenter;
												var11 = 321;
												if (var24 == 1 && var38 >= var10 - 75 && var38 <= var10 + 75 && var39 >= var11 - 20 && var39 <= var11 + 20) {
													class563.updateLoginStatusUsernameRemembered(true);
												}
											} else if (Login.loginIndex == 14) {
												String var34 = "";
												switch(Login.Login_banType) {
												case 0:
													var34 = "https://secure.runescape.com/m=offence-appeal/account-history";
													break;
												case 1:
													var34 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
													break;
												case 2:
													var34 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
													break;
												default:
													class396.Login_promptCredentials(false);
												}

												var42 = Login.loginBoxX + 180;
												var41 = 276;
												if (var24 == 1 && var38 >= var42 - 75 && var38 <= var42 + 75 && var39 >= var41 - 20 && var39 <= var41 + 20) {
													RestClientThreadFactory.openURL(var34, true, false);
													TileItem.setLoginResponseString("", "Page has opened in the browser.", "");
													class137.method3379(6);
													return;
												}

												var42 = Login.loginBoxX + 180;
												var41 = 326;
												if (var24 == 1 && var38 >= var42 - 75 && var38 <= var42 + 75 && var39 >= var41 - 20 && var39 <= var41 + 20) {
													class396.Login_promptCredentials(false);
												}
											} else if (Login.loginIndex == 24) {
												var10 = Login.loginBoxX + 180;
												var11 = 301;
												if (var24 == 1 && var38 >= var10 - 75 && var38 <= var10 + 75 && var39 >= var11 - 20 && var39 <= var11 + 20) {
													class563.updateLoginStatusUsernameRemembered(false);
												}
											} else if (Login.loginIndex == 32) {
												var10 = Login.loginBoxX + 180 - 80;
												var11 = 321;
												if (var24 == 1 && var38 >= var10 - 75 && var38 <= var10 + 75 && var39 >= var11 - 20 && var39 <= var11 + 20) {
													RestClientThreadFactory.openURL(WorldMapArchiveLoader.method9796("secure", true) + "m=dob/set_dob.ws", true, false);
													TileItem.setLoginResponseString("", "Page has opened in the browser.", "");
													class137.method3379(6);
													return;
												}

												var10 = Login.loginBoxX + 180 + 80;
												if (var24 == 1 && var38 >= var10 - 75 && var38 <= var10 + 75 && var39 >= var11 - 20 && var39 <= var11 + 20) {
													class396.Login_promptCredentials(true);
												}
											} else if (Login.loginIndex == 33) {
												var10 = Login.loginBoxX + 180;
												var11 = 276;
												if (var24 == 1 && var38 >= var10 - 75 && var38 <= var10 + 75 && var39 >= var11 - 20 && var39 <= var11 + 20) {
													RestClientThreadFactory.openURL("https://oldschool.runescape.com/launcher", true, false);
												}

												var10 = Login.loginBoxX + 180;
												var11 = 326;
												if (var24 == 1 && var38 >= var10 - 75 && var38 <= var10 + 75 && var39 >= var11 - 20 && var39 <= var11 + 20) {
													class396.Login_promptCredentials(true);
												}
											} else if (Login.loginIndex == 34) {
												var10 = Login.loginBoxX + 180;
												var11 = 276;
												if (var24 == 1 && var38 >= var10 - 75 && var38 <= var10 + 75 && var39 >= var11 - 20 && var39 <= var11 + 20) {
													class453.method8726();
													return;
												}

												if (class33.World_request != null) {
													class453.method8726();
												}

												var10 = Login.loginBoxX + 180;
												var11 = 326;
												if (var24 == 1 && var38 >= var10 - 75 && var38 <= var10 + 75 && var39 >= var11 - 20 && var39 <= var11 + 20) {
													class396.Login_promptCredentials(false);
												}
											}
										} else {
											while (true) {
												do {
													if (!var25.method5689()) {
														var40 = 321;
														if (var24 == 1 && var39 >= var40 - 20 && var39 <= var40 + 20) {
															class396.Login_promptCredentials(true);
														}

														return;
													}
												} while(var25.field3071 != 84 && var25.field3071 != 13);

												class396.Login_promptCredentials(true);
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

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	static boolean method326() {
		return (Client.drawPlayerNames & 8) != 0;
	}
}
