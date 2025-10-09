import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("go")
public class class171 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Lit;",
		garbageValue = "-1840129181"
	)
	@Export("SequenceDefinition_get")
	public static SequenceDefinition SequenceDefinition_get(int var0) {
		SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ChatChannel.SequenceDefinition_archive.takeFile(12, var0);
			var1 = new SequenceDefinition();
			var1.field2492 = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IS)Ljava/lang/String;",
		garbageValue = "19791"
	)
	@Export("colorStartTag")
	static String colorStartTag(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">";
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Lfz;",
		garbageValue = "-1719726578"
	)
	static class145 method4140(int var0) {
		if (class150.method3908(var0) != 0) {
			return null;
		} else {
			class145 var2 = (class145)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var0);
			class145 var1;
			if (var2 != null) {
				var1 = var2;
			} else {
				var2 = class137.method3764(class255.SequenceDefinition_skeletonsArchive, class458.SpotAnimationDefinition_archive, var0);
				if (var2 != null) {
					SequenceDefinition.SequenceDefinition_cachedModel.put(var2, (long)var0);
				}

				var1 = var2;
			}

			return var1;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lbg;Lri;Lri;S)V",
		garbageValue = "31393"
	)
	@Export("loginScreen")
	static void loginScreen(GameEngine var0, Font var1, Font var2) {
		if (Login.worldSelectOpen) {
			FileSystem.method5960(var0);
		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !ObjectComposition.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453 && MouseHandler.MouseHandler_lastPressedX < Login.xPadding + 765 && MouseHandler.MouseHandler_lastPressedY < 503) {
				class154.clientPreferences.updateTitleMusicDisabled(!class154.clientPreferences.isTitleMusicDisabled());
				class188.method4333();
				WorldMapSectionType.method6800();
			}

			if (Client.gameState != 5) {
				if (-1L == Login.field725) {
					Login.field725 = class281.method6373() + 1000L;
				}

				long var3 = class281.method6373();
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

				if (var5 && -1L == Login.field709) {
					Login.field709 = var3;
					if (Login.field709 > Login.field725) {
						Login.field725 = Login.field709;
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) {
					int var19;
					if (class179.clientLanguage == Language.Language_EN) {
						if (MouseHandler.MouseHandler_lastButton == 1 || !ObjectComposition.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
							var19 = Login.xPadding + 5;
							short var7 = 463;
							byte var8 = 100;
							byte var9 = 35;
							if (MouseHandler.MouseHandler_lastPressedX >= var19 && MouseHandler.MouseHandler_lastPressedX <= var8 + var19 && MouseHandler.MouseHandler_lastPressedY >= var7 && MouseHandler.MouseHandler_lastPressedY <= var9 + var7) {
								if (Message.loadWorlds()) {
									Login.worldSelectOpen = true;
									Login.worldSelectPage = 0;
									Login.worldSelectPagesCount = 0;
								}

								return;
							}
						}

						if (class204.World_request != null && Message.loadWorlds()) {
							Login.worldSelectOpen = true;
							Login.worldSelectPage = 0;
							Login.worldSelectPagesCount = 0;
						}
					}

					var19 = MouseHandler.MouseHandler_lastButton;
					int var29 = MouseHandler.MouseHandler_lastPressedX;
					int var30 = MouseHandler.MouseHandler_lastPressedY;
					if (var19 == 0) {
						var29 = MouseHandler.MouseHandler_x;
						var30 = MouseHandler.MouseHandler_y;
					}

					if (!ObjectComposition.mouseCam && var19 == 4) {
						var19 = 1;
					}

					IndexCheck var20 = SpriteBufferProperties.method52();
					short var32;
					int var33;
					boolean var37;
					if (Login.loginIndex == 0) {
						var37 = false;

						while (var20.method6130()) {
							if (var20.field3213 == 84) {
								var37 = true;
							}
						}

						var33 = ReflectionCheck.loginBoxCenter - 80;
						var32 = 291;
						if (var19 == 1 && var29 >= var33 - 75 && var29 <= var33 + 75 && var30 >= var32 - 20 && var30 <= var32 + 20) {
							class114.method3540(class174.method4161("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws");
						}

						var33 = ReflectionCheck.loginBoxCenter + 80;
						if (var19 == 1 && var29 >= var33 - 75 && var29 <= var33 + 75 && var30 >= var32 - 20 && var30 <= var32 + 20 || var37) {
							if (class29.method465()) {
								class4.method20();
							} else {
								class146.Login_promptCredentials(false);
							}
						}
					} else if (Login.loginIndex == 1) {
						var37 = class32.client.containsAccessAndRefreshToken() || class32.client.otlTokenRequesterInitialized() || class32.client.containsSessionAndCharacterId();

						while (var20.method6130()) {
							if (var20.field3213 == 84) {
								if (var37) {
									class203.method4568();
								} else {
									class146.Login_promptCredentials(false);
								}

								return;
							}

							if (var20.field3213 == 13) {
								DevicePcmPlayerProvider.updateLoginStatusUsernameRemembered(true);
								return;
							}
						}

						var33 = ReflectionCheck.loginBoxCenter - 80;
						var32 = 321;
						if (var19 == 1 && var29 >= var33 - 75 && var29 <= var33 + 75 && var30 >= var32 - 20 && var30 <= var32 + 20) {
							if (var37) {
								class203.method4568();
							} else {
								class146.Login_promptCredentials(false);
							}

							return;
						}

						var33 = ReflectionCheck.loginBoxCenter + 80;
						if (var19 == 1 && var29 >= var33 - 75 && var29 <= var33 + 75 && var30 >= var32 - 20 && var30 <= var32 + 20) {
							DevicePcmPlayerProvider.updateLoginStatusUsernameRemembered(true);
							return;
						}
					} else {
						int var10;
						int var15;
						short var31;
						if (Login.loginIndex == 2) {
							var31 = 201;
							var10 = var31 + 52;
							if (var19 == 1 && var30 >= var10 - 12 && var30 < var10 + 2) {
								Login.currentLoginField = 0;
							}

							var10 += 15;
							if (var19 == 1 && var30 >= var10 - 12 && var30 < var10 + 2) {
								Login.currentLoginField = 1;
							}

							var10 += 15;
							var31 = 361;
							if (class164.field1882 != null) {
								var33 = class164.field1882.highX / 2;
								if (var19 == 1 && var29 >= class164.field1882.lowX - var33 && var29 <= var33 + class164.field1882.lowX && var30 >= var31 - 15 && var30 < var31) {
									switch(Login.field712) {
									case 1:
										class114.method3540("https://support.runescape.com/hc/en-gb/articles/360001552065");
										return;
									case 2:
										class114.method3540("https://support.runescape.com/hc/en-gb");
									}
								}
							}

							var33 = ReflectionCheck.loginBoxCenter - 80;
							var32 = 321;
							if (var19 == 1 && var29 >= var33 - 75 && var29 <= var33 + 75 && var30 >= var32 - 20 && var30 <= var32 + 20) {
								GameEngine.method676();
								return;
							}

							var33 = Login.loginBoxX + 180 + 80;
							if (var19 == 1 && var29 >= var33 - 75 && var29 <= var33 + 75 && var30 >= var32 - 20 && var30 <= var32 + 20) {
								class146.method3876(0);
								Login.Login_username = "";
								Login.Login_password = "";
								AABB.otpMedium = 0;
								class572.otp = "";
								Login.rememberUsername = true;
							}

							var33 = ReflectionCheck.loginBoxCenter + -117;
							var32 = 277;
							Login.field728 = var29 >= var33 && var29 < var33 + VarbitComposition.field2252 && var30 >= var32 && var30 < var32 + FileSystem.field3123;
							if (var19 == 1 && Login.field728) {
								Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered;
								if (!Client.Login_isUsernameRemembered && class154.clientPreferences.getRememberedUsername() != null) {
									class154.clientPreferences.updateRememberedUsername((String)null);
								}
							}

							var33 = ReflectionCheck.loginBoxCenter + 24;
							var32 = 277;
							Login.field726 = var29 >= var33 && var29 < var33 + VarbitComposition.field2252 && var30 >= var32 && var30 < var32 + FileSystem.field3123;
							if (var19 == 1 && Login.field726) {
								class154.clientPreferences.updateHideUsername(!class154.clientPreferences.isUsernameHidden());
								if (!class154.clientPreferences.isUsernameHidden()) {
									Login.Login_username = "";
									class154.clientPreferences.updateRememberedUsername((String)null);
									if (Client.Login_isUsernameRemembered && Login.Login_username != null && !Login.Login_username.isEmpty()) {
										Login.currentLoginField = 1;
									} else {
										Login.currentLoginField = 0;
									}
								}
							}

							while (true) {
								Transferable var35;
								do {
									while (true) {
										label1307:
										do {
											while (true) {
												while (var20.method6130()) {
													if (var20.field3213 != 13) {
														if (Login.currentLoginField != 0) {
															continue label1307;
														}

														DirectByteArrayCopier.method8125(var20.field3207);
														if (var20.field3213 == 85 && !Login.Login_username.isEmpty()) {
															Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
														}

														if (var20.field3213 == 84 || var20.field3213 == 80) {
															Login.currentLoginField = 1;
														}

														if (class401.method8315(var20.field3207) && Login.Login_username.length() < 320) {
															Login.Login_username = Login.Login_username + var20.field3207;
														}
													} else {
														class146.method3876(0);
														Login.Login_username = "";
														Login.Login_password = "";
														AABB.otpMedium = 0;
														class572.otp = "";
														Login.rememberUsername = true;
													}
												}

												return;
											}
										} while(Login.currentLoginField != 1);

										if (var20.field3213 == 85 && !Login.Login_password.isEmpty()) {
											Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
										} else if (var20.field3213 == 84 || var20.field3213 == 80) {
											Login.currentLoginField = 0;
											if (var20.field3213 == 84) {
												Login.Login_username = Login.Login_username.trim();
												if (Login.Login_username.isEmpty()) {
													class203.setLoginResponseString("", "Please enter your username/email address.", "");
												} else if (Login.Login_password.isEmpty()) {
													class203.setLoginResponseString("", "Please enter your password.", "");
												} else {
													class203.setLoginResponseString("", "Connecting to server...", "");
													Client.authenticationScheme = class154.clientPreferences.containsKey(Login.Login_username) ? AuthenticationScheme.TOKEN_REMEMBER : AuthenticationScheme.TOKEN;
													class135.updateGameState(20);
												}

												return;
											}
										}

										if ((var20.isValidIndexInRange(82) || var20.isValidIndexInRange(87)) && var20.field3213 == 67) {
											Clipboard var34 = Toolkit.getDefaultToolkit().getSystemClipboard();
											var35 = var34.getContents(class32.client);
											var15 = 20 - Login.Login_password.length();
											break;
										}

										if (class506.method10287(var20.field3207) && class401.method8315(var20.field3207) && Login.Login_password.length() < 20) {
											Login.Login_password = Login.Login_password + var20.field3207;
										}
									}
								} while(var15 <= 0);

								try {
									String var16 = (String)var35.getTransferData(DataFlavor.stringFlavor);
									int var17 = Math.min(var15, var16.length());

									for (int var18 = 0; var18 < var17; ++var18) {
										if (!class506.method10287(var16.charAt(var18)) || !class401.method8315(var16.charAt(var18))) {
											class146.method3876(3);
											return;
										}
									}

									Login.Login_password = Login.Login_password + var16.substring(0, var17);
								} catch (UnsupportedFlavorException var27) {
								} catch (IOException var28) {
								}
							}
						} else {
							short var11;
							Bounds var21;
							if (Login.loginIndex == 3) {
								var10 = Login.loginBoxX + 180;
								var11 = 241;
								var21 = var1.method9545(25, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.".length() - 34, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", var10, var11);
								if (var19 == 1 && var21.method9035(var29, var30)) {
									class114.method3540("https://oldschool.runescape.com/launcher");
								}

								var10 = Login.loginBoxX + 180;
								var11 = 276;
								if (var19 == 1 && var29 >= var10 - 75 && var29 <= var10 + 75 && var30 >= var11 - 20 && var30 <= var11 + 20) {
									DevicePcmPlayerProvider.updateLoginStatusUsernameRemembered(false);
								}

								var10 = Login.loginBoxX + 180;
								var11 = 326;
								if (var19 == 1 && var29 >= var10 - 75 && var29 <= var10 + 75 && var30 >= var11 - 20 && var30 <= var11 + 20) {
									class114.method3540("https://support.runescape.com/hc/en-gb/articles/360001552065");
									return;
								}
							} else {
								int var22;
								if (Login.loginIndex == 4) {
									var10 = Login.loginBoxX + 180 - 80;
									var11 = 321;
									if (var19 == 1 && var29 >= var10 - 75 && var29 <= var10 + 75 && var30 >= var11 - 20 && var30 <= var11 + 20) {
										class572.otp.trim();
										if (class572.otp.length() != 6) {
											class203.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
										} else {
											AABB.otpMedium = Integer.parseInt(class572.otp);
											class572.otp = "";
											Client.authenticationScheme = Login.rememberUsername ? AuthenticationScheme.field1597 : AuthenticationScheme.field1599;
											class203.setLoginResponseString("", "Connecting to server...", "");
											class135.updateGameState(20);
										}

										return;
									}

									if (var19 == 1 && var29 >= Login.loginBoxX + 180 - 9 && var29 <= Login.loginBoxX + 180 + 130 && var30 >= 263 && var30 <= 296) {
										Login.rememberUsername = !Login.rememberUsername;
									}

									if (var19 == 1 && var29 >= Login.loginBoxX + 180 - 34 && var29 <= Login.loginBoxX + 34 + 180 && var30 >= 351 && var30 <= 363) {
										class114.method3540("https://support.runescape.com/hc/en-gb/articles/360001552065");
									}

									var10 = Login.loginBoxX + 180 + 80;
									if (var19 == 1 && var29 >= var10 - 75 && var29 <= var10 + 75 && var30 >= var11 - 20 && var30 <= var11 + 20) {
										class146.method3876(0);
										Login.Login_username = "";
										Login.Login_password = "";
										AABB.otpMedium = 0;
										class572.otp = "";
									}

									while (var20.method6130()) {
										boolean var12 = false;

										for (var22 = 0; var22 < "1234567890".length(); ++var22) {
											if (var20.field3207 == "1234567890".charAt(var22)) {
												var12 = true;
												break;
											}
										}

										if (var20.field3213 == 13) {
											class146.method3876(0);
											Login.Login_username = "";
											Login.Login_password = "";
											AABB.otpMedium = 0;
											class572.otp = "";
										} else {
											if (var20.field3213 == 85 && !class572.otp.isEmpty()) {
												class572.otp = class572.otp.substring(0, class572.otp.length() - 1);
											}

											if (var20.field3213 == 84) {
												class572.otp.trim();
												if (class572.otp.length() != 6) {
													class203.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
												} else {
													AABB.otpMedium = Integer.parseInt(class572.otp);
													class572.otp = "";
													Client.authenticationScheme = Login.rememberUsername ? AuthenticationScheme.field1597 : AuthenticationScheme.field1599;
													class203.setLoginResponseString("", "Connecting to server...", "");
													class135.updateGameState(20);
												}

												return;
											}

											if (var12 && class572.otp.length() < 6) {
												class572.otp = class572.otp + var20.field3207;
											}
										}
									}
								} else {
									int var23;
									if (Login.loginIndex == 5) {
										var10 = Login.loginBoxX + 180 - 80;
										var11 = 321;
										if (var19 == 1 && var29 >= var10 - 75 && var29 <= var10 + 75 && var30 >= var11 - 20 && var30 <= var11 + 20) {
											class477.method9766();
											return;
										}

										var10 = Login.loginBoxX + 180 + 80;
										if (var19 == 1 && var29 >= var10 - 75 && var29 <= var10 + 75 && var30 >= var11 - 20 && var30 <= var11 + 20) {
											class146.Login_promptCredentials(true);
										}

										var32 = 361;
										if (LoginState.field266 != null) {
											var22 = LoginState.field266.highX / 2;
											if (var19 == 1 && var29 >= LoginState.field266.lowX - var22 && var29 <= var22 + LoginState.field266.lowX && var30 >= var32 - 15 && var30 < var32) {
												class114.method3540(class174.method4161("secure", true) + "m=weblogin/g=oldscape/cant_log_in");
											}
										}

										while (var20.method6130()) {
											boolean var38 = false;

											for (var23 = 0; var23 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var23) {
												if (var20.field3207 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var23)) {
													var38 = true;
													break;
												}
											}

											if (var20.field3213 == 13) {
												class146.Login_promptCredentials(true);
											} else {
												if (var20.field3213 == 85 && !Login.Login_username.isEmpty()) {
													Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
												}

												if (var20.field3213 == 84) {
													class477.method9766();
													return;
												}

												if (var38 && Login.Login_username.length() < 320) {
													Login.Login_username = Login.Login_username + var20.field3207;
												}
											}
										}
									} else if (Login.loginIndex != 6) {
										if (Login.loginIndex == 7) {
											if (ModeWhere.field5150 && !Client.onMobile) {
												var10 = ReflectionCheck.loginBoxCenter - 150;
												var33 = var10 + 40 + 240 + 25;
												var32 = 231;
												var22 = var32 + 40;
												if (var19 == 1 && var29 >= var10 && var29 <= var33 && var30 >= var32 && var30 <= var22) {
													var15 = var10;
													int var24 = 0;

													while (true) {
														if (var24 >= 8) {
															var23 = 0;
															break;
														}

														if (var29 <= var15 + 30) {
															var23 = var24;
															break;
														}

														var15 += 30;
														var15 += var24 != 1 && var24 != 3 ? 5 : 20;
														++var24;
													}

													Login.field715 = var23;
												}

												var23 = Login.loginBoxX + 180 - 80;
												short var36 = 321;
												boolean var39;
												if (var19 == 1 && var29 >= var23 - 75 && var29 <= var23 + 75 && var30 >= var36 - 20 && var30 <= var36 + 20) {
													var39 = WorldMapSection0.method6793();
													if (var39) {
														class135.updateGameState(50);
														return;
													}
												}

												var23 = Login.loginBoxX + 180 + 80;
												if (var19 == 1 && var29 >= var23 - 75 && var29 <= var23 + 75 && var30 >= var36 - 20 && var30 <= var36 + 20) {
													Login.field714 = new String[8];
													class146.Login_promptCredentials(true);
												}

												while (var20.method6130()) {
													if (var20.field3213 == 101) {
														Login.field714[Login.field715] = null;
													}

													if (var20.field3213 == 85) {
														if (Login.field714[Login.field715] == null && Login.field715 > 0) {
															--Login.field715;
														}

														Login.field714[Login.field715] = null;
													}

													if (var20.field3207 >= '0' && var20.field3207 <= '9') {
														Login.field714[Login.field715] = "" + var20.field3207;
														if (Login.field715 < 7) {
															++Login.field715;
														}
													}

													if (var20.field3213 == 84) {
														var39 = WorldMapSection0.method6793();
														if (var39) {
															class135.updateGameState(50);
														}

														return;
													}
												}
											} else {
												var10 = Login.loginBoxX + 180 - 80;
												var11 = 321;
												if (var19 == 1 && var29 >= var10 - 75 && var29 <= var10 + 75 && var30 >= var11 - 20 && var30 <= var11 + 20) {
													class114.method3540(class174.method4161("secure", true) + "m=dob/set_dob.ws");
													class203.setLoginResponseString("", "Page has opened in the browser.", "");
													class146.method3876(6);
													return;
												}

												var10 = Login.loginBoxX + 180 + 80;
												if (var19 == 1 && var29 >= var10 - 75 && var29 <= var10 + 75 && var30 >= var11 - 20 && var30 <= var11 + 20) {
													class146.Login_promptCredentials(true);
												}
											}
										} else if (Login.loginIndex == 8) {
											var10 = Login.loginBoxX + 180 - 80;
											var11 = 321;
											if (var19 == 1 && var29 >= var10 - 75 && var29 <= var10 + 75 && var30 >= var11 - 20 && var30 <= var11 + 20) {
												class114.method3540("https://www.jagex.com/terms/privacy");
												class203.setLoginResponseString("", "Page has opened in the browser.", "");
												class146.method3876(6);
												return;
											}

											var10 = Login.loginBoxX + 180 + 80;
											if (var19 == 1 && var29 >= var10 - 75 && var29 <= var10 + 75 && var30 >= var11 - 20 && var30 <= var11 + 20) {
												class146.Login_promptCredentials(true);
											}
										} else if (Login.loginIndex == 9) {
											var10 = Login.loginBoxX + 180;
											var11 = 311;
											if (var20.field3213 == 84 || var20.field3213 == 13 || var19 == 1 && var29 >= var10 - 75 && var29 <= var10 + 75 && var30 >= var11 - 20 && var30 <= var11 + 20) {
												DevicePcmPlayerProvider.updateLoginStatusUsernameRemembered(false);
											}
										} else if (Login.loginIndex == 10) {
											var10 = Login.loginBoxX + 180;
											var11 = 209;
											if (var20.field3213 == 84 || var19 == 1 && var29 >= var10 - 109 && var29 <= var10 + 109 && var30 >= var11 && var30 <= var11 + 68) {
												if (class29.method465()) {
													return;
												}

												class203.method4568();
											}
										} else if (Login.loginIndex == 12) {
											var10 = ReflectionCheck.loginBoxCenter;
											var11 = 233;
											var21 = var2.method9545(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var11);
											Bounds var13 = var2.method9545(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var11);
											Bounds var14 = var2.method9545(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var11);
											var33 = var11 + 17;
											Bounds var25 = var2.method9545(0, 34, "<col=ffd200>agreement (EULA)</col>.", var10, var33);
											if (var19 == 1) {
												if (var21.method9035(var29, var30)) {
													class114.method3540("https://www.jagex.com/terms");
												} else if (var13.method9035(var29, var30)) {
													class114.method3540("https://www.jagex.com/terms/privacy");
												} else if (var14.method9035(var29, var30) || var25.method9035(var29, var30)) {
													class114.method3540("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool");
												}
											}

											var10 = ReflectionCheck.loginBoxCenter - 80;
											var11 = 311;
											if (var19 == 1 && var29 >= var10 - 75 && var29 <= var10 + 75 && var30 >= var11 - 20 && var30 <= var11 + 20) {
												class137.method3794();
												DevicePcmPlayerProvider.updateLoginStatusUsernameRemembered(true);
											}

											var10 = ReflectionCheck.loginBoxCenter + 80;
											if (var19 == 1 && var29 >= var10 - 75 && var29 <= var10 + 75 && var30 >= var11 - 20 && var30 <= var11 + 20) {
												Login.loginIndex = 13;
											}
										} else if (Login.loginIndex == 13) {
											var10 = ReflectionCheck.loginBoxCenter;
											var11 = 321;
											if (var19 == 1 && var29 >= var10 - 75 && var29 <= var10 + 75 && var30 >= var11 - 20 && var30 <= var11 + 20) {
												DevicePcmPlayerProvider.updateLoginStatusUsernameRemembered(true);
											}
										} else if (Login.loginIndex == 14) {
											String var26 = "";
											switch(Login.Login_banType) {
											case 0:
												var26 = "https://secure.runescape.com/m=offence-appeal/account-history";
												break;
											case 1:
												var26 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
												break;
											case 2:
												var26 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
												break;
											default:
												class146.Login_promptCredentials(false);
											}

											var33 = Login.loginBoxX + 180;
											var32 = 276;
											if (var19 == 1 && var29 >= var33 - 75 && var29 <= var33 + 75 && var30 >= var32 - 20 && var30 <= var32 + 20) {
												class114.method3540(var26);
												class203.setLoginResponseString("", "Page has opened in the browser.", "");
												class146.method3876(6);
												return;
											}

											var33 = Login.loginBoxX + 180;
											var32 = 326;
											if (var19 == 1 && var29 >= var33 - 75 && var29 <= var33 + 75 && var30 >= var32 - 20 && var30 <= var32 + 20) {
												class146.Login_promptCredentials(false);
											}
										} else if (Login.loginIndex == 24) {
											var10 = Login.loginBoxX + 180;
											var11 = 301;
											if (var19 == 1 && var29 >= var10 - 75 && var29 <= var10 + 75 && var30 >= var11 - 20 && var30 <= var11 + 20) {
												DevicePcmPlayerProvider.updateLoginStatusUsernameRemembered(false);
											}
										} else if (Login.loginIndex == 32) {
											var10 = Login.loginBoxX + 180 - 80;
											var11 = 321;
											if (var19 == 1 && var29 >= var10 - 75 && var29 <= var10 + 75 && var30 >= var11 - 20 && var30 <= var11 + 20) {
												class114.method3540(class174.method4161("secure", true) + "m=dob/set_dob.ws");
												class203.setLoginResponseString("", "Page has opened in the browser.", "");
												class146.method3876(6);
												return;
											}

											var10 = Login.loginBoxX + 180 + 80;
											if (var19 == 1 && var29 >= var10 - 75 && var29 <= var10 + 75 && var30 >= var11 - 20 && var30 <= var11 + 20) {
												class146.Login_promptCredentials(true);
											}
										} else if (Login.loginIndex == 33) {
											var10 = Login.loginBoxX + 180;
											var11 = 276;
											if (var19 == 1 && var29 >= var10 - 75 && var29 <= var10 + 75 && var30 >= var11 - 20 && var30 <= var11 + 20) {
												class114.method3540("https://oldschool.runescape.com/launcher");
											}

											var10 = Login.loginBoxX + 180;
											var11 = 326;
											if (var19 == 1 && var29 >= var10 - 75 && var29 <= var10 + 75 && var30 >= var11 - 20 && var30 <= var11 + 20) {
												class146.Login_promptCredentials(true);
											}
										} else if (Login.loginIndex == 34) {
											var10 = Login.loginBoxX + 180;
											var11 = 276;
											if (var19 == 1 && var29 >= var10 - 75 && var29 <= var10 + 75 && var30 >= var11 - 20 && var30 <= var11 + 20) {
												if (Message.loadWorlds()) {
													Login.worldSelectOpen = true;
													Login.worldSelectPage = 0;
													Login.worldSelectPagesCount = 0;
												}

												return;
											}

											if (class204.World_request != null && Message.loadWorlds()) {
												Login.worldSelectOpen = true;
												Login.worldSelectPage = 0;
												Login.worldSelectPagesCount = 0;
											}

											var10 = Login.loginBoxX + 180;
											var11 = 326;
											if (var19 == 1 && var29 >= var10 - 75 && var29 <= var10 + 75 && var30 >= var11 - 20 && var30 <= var11 + 20) {
												class146.Login_promptCredentials(false);
											}
										}
									} else {
										while (true) {
											do {
												if (!var20.method6130()) {
													var31 = 321;
													if (var19 == 1 && var30 >= var31 - 20 && var30 <= var31 + 20) {
														class146.Login_promptCredentials(true);
													}

													return;
												}
											} while(var20.field3213 != 84 && var20.field3213 != 13);

											class146.Login_promptCredentials(true);
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
