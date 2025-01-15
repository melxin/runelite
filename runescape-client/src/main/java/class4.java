import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ad")
public final class class4 {
	@ObfuscatedName("au")
	@Export("Tiles_hueMultiplier")
	static int[] Tiles_hueMultiplier;

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)[Loz;",
		garbageValue = "1199091310"
	)
	public static class383[] method16() {
		return new class383[]{class383.field4487, class383.field4488, class383.field4486, class383.field4485};
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lbt;Lqw;Lqw;S)V",
		garbageValue = "14930"
	)
	@Export("loginScreen")
	static void loginScreen(GameEngine var0, Font var1, Font var2) {
		int var5;
		int var29;
		int var30;
		int var34;
		boolean var38;
		if (Login.worldSelectOpen) {
			IndexCheck var3 = HealthBarConfig.method3010();

			while (true) {
				if (!var3.method5772()) {
					if (MouseHandler.MouseHandler_lastButton != 1 && (KeyHandler.mouseCam || MouseHandler.MouseHandler_lastButton != 4)) {
						break;
					}

					int var4 = Login.xPadding + 280;
					if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						FloatProjection.changeWorldSelectSorting(0, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						FloatProjection.changeWorldSelectSorting(0, 1);
						break;
					}

					var5 = Login.xPadding + 390;
					if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var5 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						FloatProjection.changeWorldSelectSorting(1, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var5 + 15 && MouseHandler.MouseHandler_lastPressedX <= var5 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						FloatProjection.changeWorldSelectSorting(1, 1);
						break;
					}

					var29 = Login.xPadding + 500;
					if (MouseHandler.MouseHandler_lastPressedX >= var29 && MouseHandler.MouseHandler_lastPressedX <= var29 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						FloatProjection.changeWorldSelectSorting(2, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var29 + 15 && MouseHandler.MouseHandler_lastPressedX <= var29 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						FloatProjection.changeWorldSelectSorting(2, 1);
						break;
					}

					var30 = Login.xPadding + 610;
					if (MouseHandler.MouseHandler_lastPressedX >= var30 && MouseHandler.MouseHandler_lastPressedX <= var30 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						FloatProjection.changeWorldSelectSorting(3, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var30 + 15 && MouseHandler.MouseHandler_lastPressedX <= var30 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						FloatProjection.changeWorldSelectSorting(3, 1);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) {
						if (Login.loginIndex == 34) {
							class33.Login_promptCredentials(false);
						}

						Login.worldSelectOpen = false;
						Rasterizer2D.Rasterizer2D_fillRectangle(0, 0, Rasterizer2D.Rasterizer2D_width, Rasterizer2D.Rasterizer2D_height, 0);
						WorldMapSectionType.leftTitleSprite.drawAt(Login.xPadding, 0);
						TriBool.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
						Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18);
						break;
					}

					if (Login.hoveredWorldIndex != -1) {
						World var31 = World.World_worlds[Login.hoveredWorldIndex];
						var34 = Client.worldProperties;
						class552 var33 = class552.field5442;
						var38 = (var34 & var33.rsOrdinal()) != 0;
						boolean var36 = var31.isDeadman();
						class273.field3035 = var36;
						var31.field819 = var36 ? "beta" : var31.field819;
						Language.changeWorld(var31);
						if (Login.loginIndex == 34) {
							class33.Login_promptCredentials(false);
						}

						Login.worldSelectOpen = false;
						Rasterizer2D.Rasterizer2D_fillRectangle(0, 0, Rasterizer2D.Rasterizer2D_width, Rasterizer2D.Rasterizer2D_height, 0);
						WorldMapSectionType.leftTitleSprite.drawAt(Login.xPadding, 0);
						TriBool.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
						Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18);
						if (var38 != var36) {
							ModelData0.method4808();
						}
					} else {
						if (Login.worldSelectPage > 0 && class164.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= class164.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= Huffman.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= Huffman.canvasHeight / 2 + 50) {
							--Login.worldSelectPage;
						}

						if (Login.worldSelectPage < Login.worldSelectPagesCount && Decimator.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= BuddyRankComparator.canvasWidth - Decimator.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= BuddyRankComparator.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= Huffman.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= Huffman.canvasHeight / 2 + 50) {
							++Login.worldSelectPage;
						}
					}
					break;
				}

				if (var3.field2989 == 13) {
					if (Login.loginIndex == 34) {
						class33.Login_promptCredentials(false);
					}

					Login.worldSelectOpen = false;
					Rasterizer2D.Rasterizer2D_fillRectangle(0, 0, Rasterizer2D.Rasterizer2D_width, Rasterizer2D.Rasterizer2D_height, 0);
					WorldMapSectionType.leftTitleSprite.drawAt(Login.xPadding, 0);
					TriBool.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
					Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18);
					break;
				}

				if (var3.field2989 == 96) {
					if (Login.worldSelectPage > 0 && class164.worldSelectLeftSprite != null) {
						--Login.worldSelectPage;
					}
				} else if (var3.field2989 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && Decimator.worldSelectRightSprite != null) {
					++Login.worldSelectPage;
				}
			}

		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !KeyHandler.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453 && MouseHandler.MouseHandler_lastPressedX < Login.xPadding + 765 && MouseHandler.MouseHandler_lastPressedY < 503) {
				class544.clientPreferences.updateTitleMusicDisabled(!class544.clientPreferences.isTitleMusicDisabled());
				class106.method3078();
				class153.method3619();
			}

			if (Client.gameState != 5) {
				if (-1L == Login.field954) {
					Login.field954 = ReflectionCheck.method724() + 1000L;
				}

				long var18 = ReflectionCheck.method724();
				if (class319.method6610() && Login.field927 == -1L) {
					Login.field927 = var18;
					if (Login.field927 > Login.field954) {
						Login.field954 = Login.field927;
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) {
					if (ScriptFrame.clientLanguage == Language.Language_EN) {
						if (MouseHandler.MouseHandler_lastButton == 1 || !KeyHandler.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
							var5 = Login.xPadding + 5;
							short var6 = 463;
							byte var7 = 100;
							byte var20 = 35;
							if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var7 + var5 && MouseHandler.MouseHandler_lastPressedY >= var6 && MouseHandler.MouseHandler_lastPressedY <= var20 + var6) {
								class212.method4849();
								return;
							}
						}

						if (class149.World_request != null) {
							class212.method4849();
						}
					}

					var5 = MouseHandler.MouseHandler_lastButton;
					var29 = MouseHandler.MouseHandler_lastPressedX;
					var30 = MouseHandler.MouseHandler_lastPressedY;
					if (var5 == 0) {
						var29 = MouseHandler.MouseHandler_x;
						var30 = MouseHandler.MouseHandler_y;
					}

					if (!KeyHandler.mouseCam && var5 == 4) {
						var5 = 1;
					}

					IndexCheck var8 = HealthBarConfig.method3010();
					short var39;
					if (Login.loginIndex == 0) {
						var38 = false;

						while (var8.method5772()) {
							if (var8.field2989 == 84) {
								var38 = true;
							}
						}

						var34 = UserComparator3.loginBoxCenter - 80;
						var39 = 291;
						if (var5 == 1 && var29 >= var34 - 75 && var29 <= var34 + 75 && var30 >= var39 - 20 && var30 <= var39 + 20) {
							WorldMapRectangle.openURL(RouteStrategy.method5846("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
						}

						var34 = UserComparator3.loginBoxCenter + 80;
						if (var5 == 1 && var29 >= var34 - 75 && var29 <= var34 + 75 && var30 >= var39 - 20 && var30 <= var39 + 20 || var38) {
							if ((Client.worldProperties & class552.field5451.rsOrdinal()) != 0) {
								Login.Login_response0 = "";
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world.";
								Login.Login_response2 = "Your normal account will not be affected.";
								Login.Login_response3 = "";
								Varcs.method3212(1);
								HealthBarUpdate.focusPasswordWhenUsernameFilled();
							} else if ((Client.worldProperties & class552.field5428.rsOrdinal()) != 0) {
								if ((Client.worldProperties & class552.field5427.rsOrdinal()) != 0) {
									Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
									Login.Login_response2 = "Players can attack each other almost everywhere";
									Login.Login_response3 = "and the Protect Item prayer won't work.";
								} else {
									Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world.";
									Login.Login_response2 = "Players can attack each other";
									Login.Login_response3 = "almost everywhere.";
								}

								Login.Login_response0 = "Warning!";
								Varcs.method3212(1);
								HealthBarUpdate.focusPasswordWhenUsernameFilled();
							} else if ((Client.worldProperties & class552.field5427.rsOrdinal()) != 0) {
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
								Login.Login_response2 = "The Protect Item prayer will";
								Login.Login_response3 = "not work on this world.";
								Login.Login_response0 = "Warning!";
								Varcs.method3212(1);
								HealthBarUpdate.focusPasswordWhenUsernameFilled();
							} else {
								class33.Login_promptCredentials(false);
							}
						}
					} else {
						int var9;
						short var10;
						if (Login.loginIndex == 1) {
							while (true) {
								if (!var8.method5772()) {
									var9 = UserComparator3.loginBoxCenter - 80;
									var10 = 321;
									if (var5 == 1 && var29 >= var9 - 75 && var29 <= var9 + 75 && var30 >= var10 - 20 && var30 <= var10 + 20) {
										class33.Login_promptCredentials(false);
									}

									var9 = UserComparator3.loginBoxCenter + 80;
									if (var5 == 1 && var29 >= var9 - 75 && var29 <= var9 + 75 && var30 >= var10 - 20 && var30 <= var10 + 20) {
										Varcs.method3212(0);
									}
									break;
								}

								if (var8.field2989 == 84) {
									class33.Login_promptCredentials(false);
								} else if (var8.field2989 == 13) {
									Varcs.method3212(0);
								}
							}
						} else {
							short var32;
							if (Login.loginIndex == 2) {
								var32 = 201;
								var9 = var32 + 52;
								if (var5 == 1 && var30 >= var9 - 12 && var30 < var9 + 2) {
									Login.currentLoginField = 0;
								}

								var9 += 15;
								if (var5 == 1 && var30 >= var9 - 12 && var30 < var9 + 2) {
									Login.currentLoginField = 1;
								}

								var9 += 15;
								var32 = 361;
								if (class169.field1800 != null) {
									var34 = class169.field1800.highX / 2;
									if (var5 == 1 && var29 >= class169.field1800.lowX - var34 && var29 <= var34 + class169.field1800.lowX && var30 >= var32 - 15 && var30 < var32) {
										switch(Login.field933) {
										case 1:
											WorldMapRectangle.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
											return;
										case 2:
											WorldMapRectangle.openURL("https://support.runescape.com/hc/en-gb", true, false);
										}
									}
								}

								var34 = UserComparator3.loginBoxCenter - 80;
								var39 = 321;
								if (var5 == 1 && var29 >= var34 - 75 && var29 <= var34 + 75 && var30 >= var39 - 20 && var30 <= var39 + 20) {
									ClientPreferences.method2989();
									return;
								}

								var34 = Login.loginBoxX + 180 + 80;
								if (var5 == 1 && var29 >= var34 - 75 && var29 <= var34 + 75 && var30 >= var39 - 20 && var30 <= var39 + 20) {
									Varcs.method3212(0);
									Login.Login_username = "";
									Login.Login_password = "";
									class326.otpMedium = 0;
									WorldEntity.otp = "";
									Login.rememberUsername = true;
								}

								var34 = UserComparator3.loginBoxCenter + -117;
								var39 = 277;
								Login.field944 = var29 >= var34 && var29 < var34 + ClanMate.field5001 && var30 >= var39 && var30 < var39 + UrlRequester.field1461;
								if (var5 == 1 && Login.field944) {
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered;
									if (!Client.Login_isUsernameRemembered && class544.clientPreferences.getRememberedUsername() != null) {
										class544.clientPreferences.updateRememberedUsername((String)null);
									}
								}

								var34 = UserComparator3.loginBoxCenter + 24;
								var39 = 277;
								Login.field945 = var29 >= var34 && var29 < var34 + ClanMate.field5001 && var30 >= var39 && var30 < var39 + UrlRequester.field1461;
								if (var5 == 1 && Login.field945) {
									class544.clientPreferences.updateHideUsername(!class544.clientPreferences.isUsernameHidden());
									if (!class544.clientPreferences.isUsernameHidden()) {
										Login.Login_username = "";
										class544.clientPreferences.updateRememberedUsername((String)null);
										HealthBarUpdate.focusPasswordWhenUsernameFilled();
									}
								}

								while (true) {
									int var37;
									Transferable var41;
									do {
										while (true) {
											label1446:
											do {
												while (true) {
													while (var8.method5772()) {
														if (var8.field2989 != 13) {
															if (Login.currentLoginField != 0) {
																continue label1446;
															}

															class145.method3558(var8.field2975);
															if (var8.field2989 == 85 && Login.Login_username.length() > 0) {
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (var8.field2989 == 84 || var8.field2989 == 80) {
																Login.currentLoginField = 1;
															}

															if (AsyncRestClient.method188(var8.field2975) && Login.Login_username.length() < 320) {
																Login.Login_username = Login.Login_username + var8.field2975;
															}
														} else {
															Varcs.method3212(0);
															Login.Login_username = "";
															Login.Login_password = "";
															class326.otpMedium = 0;
															WorldEntity.otp = "";
															Login.rememberUsername = true;
														}
													}

													return;
												}
											} while(Login.currentLoginField != 1);

											if (var8.field2989 == 85 && Login.Login_password.length() > 0) {
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
											} else if (var8.field2989 == 84 || var8.field2989 == 80) {
												Login.currentLoginField = 0;
												if (var8.field2989 == 84) {
													ClientPreferences.method2989();
													return;
												}
											}

											if ((var8.isValidIndexInRange(82) || var8.isValidIndexInRange(87)) && var8.field2989 == 67) {
												Clipboard var40 = Toolkit.getDefaultToolkit().getSystemClipboard();
												var41 = var40.getContents(Client.client);
												var37 = 20 - Login.Login_password.length();
												break;
											}

											if (class59.method1203(var8.field2975) && AsyncRestClient.method188(var8.field2975) && Login.Login_password.length() < 20) {
												Login.Login_password = Login.Login_password + var8.field2975;
											}
										}
									} while(var37 <= 0);

									try {
										String var15 = (String)var41.getTransferData(DataFlavor.stringFlavor);
										int var16 = Math.min(var37, var15.length());

										for (int var17 = 0; var17 < var16; ++var17) {
											if (!class59.method1203(var15.charAt(var17)) || !AsyncRestClient.method188(var15.charAt(var17))) {
												Varcs.method3212(3);
												return;
											}
										}

										Login.Login_password = Login.Login_password + var15.substring(0, var16);
									} catch (UnsupportedFlavorException var27) {
									} catch (IOException var28) {
									}
								}
							} else {
								Bounds var11;
								if (Login.loginIndex == 3) {
									var9 = Login.loginBoxX + 180;
									var10 = 241;
									var11 = var1.method8709(25, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.".length() - 34, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", var9, var10);
									if (var5 == 1 && var11.method8263(var29, var30)) {
										WorldMapRectangle.openURL("https://oldschool.runescape.com/launcher", true, false);
									}

									var9 = Login.loginBoxX + 180;
									var10 = 276;
									if (var5 == 1 && var29 >= var9 - 75 && var29 <= var9 + 75 && var30 >= var10 - 20 && var30 <= var10 + 20) {
										AbstractSocket.updateLoginStatusUsernameRemembered(false);
									}

									var9 = Login.loginBoxX + 180;
									var10 = 326;
									if (var5 == 1 && var29 >= var9 - 75 && var29 <= var9 + 75 && var30 >= var10 - 20 && var30 <= var10 + 20) {
										WorldMapRectangle.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
										return;
									}
								} else {
									int var12;
									if (Login.loginIndex == 4) {
										var9 = Login.loginBoxX + 180 - 80;
										var10 = 321;
										if (var5 == 1 && var29 >= var9 - 75 && var29 <= var9 + 75 && var30 >= var10 - 20 && var30 <= var10 + 20) {
											class233.method5134();
											return;
										}

										if (var5 == 1 && var29 >= Login.loginBoxX + 180 - 9 && var29 <= Login.loginBoxX + 180 + 130 && var30 >= 263 && var30 <= 296) {
											Login.rememberUsername = !Login.rememberUsername;
										}

										if (var5 == 1 && var29 >= Login.loginBoxX + 180 - 34 && var29 <= Login.loginBoxX + 34 + 180 && var30 >= 351 && var30 <= 363) {
											WorldMapRectangle.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
										}

										var9 = Login.loginBoxX + 180 + 80;
										if (var5 == 1 && var29 >= var9 - 75 && var29 <= var9 + 75 && var30 >= var10 - 20 && var30 <= var10 + 20) {
											Varcs.method3212(0);
											Login.Login_username = "";
											Login.Login_password = "";
											class326.otpMedium = 0;
											WorldEntity.otp = "";
										}

										while (var8.method5772()) {
											boolean var21 = false;

											for (var12 = 0; var12 < "1234567890".length(); ++var12) {
												if (var8.field2975 == "1234567890".charAt(var12)) {
													var21 = true;
													break;
												}
											}

											if (var8.field2989 == 13) {
												Varcs.method3212(0);
												Login.Login_username = "";
												Login.Login_password = "";
												class326.otpMedium = 0;
												WorldEntity.otp = "";
											} else {
												if (var8.field2989 == 85 && WorldEntity.otp.length() > 0) {
													WorldEntity.otp = WorldEntity.otp.substring(0, WorldEntity.otp.length() - 1);
												}

												if (var8.field2989 == 84) {
													class233.method5134();
													return;
												}

												if (var21 && WorldEntity.otp.length() < 6) {
													WorldEntity.otp = WorldEntity.otp + var8.field2975;
												}
											}
										}
									} else {
										int var13;
										if (Login.loginIndex == 5) {
											var9 = Login.loginBoxX + 180 - 80;
											var10 = 321;
											if (var5 == 1 && var29 >= var9 - 75 && var29 <= var9 + 75 && var30 >= var10 - 20 && var30 <= var10 + 20) {
												class221.method5000();
												return;
											}

											var9 = Login.loginBoxX + 180 + 80;
											if (var5 == 1 && var29 >= var9 - 75 && var29 <= var9 + 75 && var30 >= var10 - 20 && var30 <= var10 + 20) {
												class33.Login_promptCredentials(true);
											}

											var39 = 361;
											if (WorldMapCacheName.field3266 != null) {
												var12 = WorldMapCacheName.field3266.highX / 2;
												if (var5 == 1 && var29 >= WorldMapCacheName.field3266.lowX - var12 && var29 <= var12 + WorldMapCacheName.field3266.lowX && var30 >= var39 - 15 && var30 < var39) {
													WorldMapRectangle.openURL(RouteStrategy.method5846("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
												}
											}

											while (var8.method5772()) {
												boolean var35 = false;

												for (var13 = 0; var13 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var13) {
													if (var8.field2975 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var13)) {
														var35 = true;
														break;
													}
												}

												if (var8.field2989 == 13) {
													class33.Login_promptCredentials(true);
												} else {
													if (var8.field2989 == 85 && Login.Login_username.length() > 0) {
														Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
													}

													if (var8.field2989 == 84) {
														class221.method5000();
														return;
													}

													if (var35 && Login.Login_username.length() < 320) {
														Login.Login_username = Login.Login_username + var8.field2975;
													}
												}
											}
										} else if (Login.loginIndex != 6) {
											if (Login.loginIndex == 7) {
												if (class380.field4145 && !Client.onMobile) {
													var9 = UserComparator3.loginBoxCenter - 150;
													var34 = var9 + 40 + 240 + 25;
													var39 = 231;
													var12 = var39 + 40;
													if (var5 == 1 && var29 >= var9 && var29 <= var34 && var30 >= var39 && var30 <= var12) {
														Login.field941 = class340.method6897(var9, var29);
													}

													var13 = Login.loginBoxX + 180 - 80;
													short var14 = 321;
													boolean var24;
													if (var5 == 1 && var29 >= var13 - 75 && var29 <= var13 + 75 && var30 >= var14 - 20 && var30 <= var14 + 20) {
														var24 = class355.method7042();
														if (var24) {
															class360.updateGameState(50);
															return;
														}
													}

													var13 = Login.loginBoxX + 180 + 80;
													if (var5 == 1 && var29 >= var13 - 75 && var29 <= var13 + 75 && var30 >= var14 - 20 && var30 <= var14 + 20) {
														Login.field922 = new String[8];
														class33.Login_promptCredentials(true);
													}

													while (var8.method5772()) {
														if (var8.field2989 == 101) {
															Login.field922[Login.field941] = null;
														}

														if (var8.field2989 == 85) {
															if (Login.field922[Login.field941] == null && Login.field941 > 0) {
																--Login.field941;
															}

															Login.field922[Login.field941] = null;
														}

														if (var8.field2975 >= '0' && var8.field2975 <= '9') {
															Login.field922[Login.field941] = "" + var8.field2975;
															if (Login.field941 < 7) {
																++Login.field941;
															}
														}

														if (var8.field2989 == 84) {
															var24 = class355.method7042();
															if (var24) {
																class360.updateGameState(50);
															}

															return;
														}
													}
												} else {
													var9 = Login.loginBoxX + 180 - 80;
													var10 = 321;
													if (var5 == 1 && var29 >= var9 - 75 && var29 <= var9 + 75 && var30 >= var10 - 20 && var30 <= var10 + 20) {
														WorldMapRectangle.openURL(RouteStrategy.method5846("secure", true) + "m=dob/set_dob.ws", true, false);
														class150.setLoginResponseString("", "Page has opened in the browser.", "");
														Varcs.method3212(6);
														return;
													}

													var9 = Login.loginBoxX + 180 + 80;
													if (var5 == 1 && var29 >= var9 - 75 && var29 <= var9 + 75 && var30 >= var10 - 20 && var30 <= var10 + 20) {
														class33.Login_promptCredentials(true);
													}
												}
											} else if (Login.loginIndex == 8) {
												var9 = Login.loginBoxX + 180 - 80;
												var10 = 321;
												if (var5 == 1 && var29 >= var9 - 75 && var29 <= var9 + 75 && var30 >= var10 - 20 && var30 <= var10 + 20) {
													WorldMapRectangle.openURL("https://www.jagex.com/terms/privacy", true, false);
													class150.setLoginResponseString("", "Page has opened in the browser.", "");
													Varcs.method3212(6);
													return;
												}

												var9 = Login.loginBoxX + 180 + 80;
												if (var5 == 1 && var29 >= var9 - 75 && var29 <= var9 + 75 && var30 >= var10 - 20 && var30 <= var10 + 20) {
													class33.Login_promptCredentials(true);
												}
											} else if (Login.loginIndex == 9) {
												var9 = Login.loginBoxX + 180;
												var10 = 311;
												if (var8.field2989 == 84 || var8.field2989 == 13 || var5 == 1 && var29 >= var9 - 75 && var29 <= var9 + 75 && var30 >= var10 - 20 && var30 <= var10 + 20) {
													AbstractSocket.updateLoginStatusUsernameRemembered(false);
												}
											} else if (Login.loginIndex == 10) {
												var9 = Login.loginBoxX + 180;
												var10 = 209;
												if (var8.field2989 == 84 || var5 == 1 && var29 >= var9 - 109 && var29 <= var9 + 109 && var30 >= var10 && var30 <= var10 + 68) {
													class150.setLoginResponseString("", "Connecting to server...", "");
													Client.field741 = class561.field5525;
													Client.authenticationScheme = class544.clientPreferences.containsKey(Login.Login_username) ? AuthenticationScheme.USERNAME_PASSWORD_REMEMBER : AuthenticationScheme.USERNAME_PASSWORD;
													class360.updateGameState(20);
												}
											} else if (Login.loginIndex == 12) {
												var9 = UserComparator3.loginBoxCenter;
												var10 = 233;
												var11 = var2.method8709(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var9, var10);
												Bounds var22 = var2.method8709(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var9, var10);
												Bounds var23 = var2.method8709(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var9, var10);
												var34 = var10 + 17;
												Bounds var25 = var2.method8709(0, 34, "<col=ffd200>agreement (EULA)</col>.", var9, var34);
												if (var5 == 1) {
													if (var11.method8263(var29, var30)) {
														WorldMapRectangle.openURL("https://www.jagex.com/terms", true, false);
													} else if (var22.method8263(var29, var30)) {
														WorldMapRectangle.openURL("https://www.jagex.com/terms/privacy", true, false);
													} else if (var23.method8263(var29, var30) || var25.method8263(var29, var30)) {
														WorldMapRectangle.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
													}
												}

												var9 = UserComparator3.loginBoxCenter - 80;
												var10 = 311;
												if (var5 == 1 && var29 >= var9 - 75 && var29 <= var9 + 75 && var30 >= var10 - 20 && var30 <= var10 + 20) {
													class544.clientPreferences.updateEULA(Client.field766);
													AbstractSocket.updateLoginStatusUsernameRemembered(true);
												}

												var9 = UserComparator3.loginBoxCenter + 80;
												if (var5 == 1 && var29 >= var9 - 75 && var29 <= var9 + 75 && var30 >= var10 - 20 && var30 <= var10 + 20) {
													Login.loginIndex = 13;
												}
											} else if (Login.loginIndex == 13) {
												var9 = UserComparator3.loginBoxCenter;
												var10 = 321;
												if (var5 == 1 && var29 >= var9 - 75 && var29 <= var9 + 75 && var30 >= var10 - 20 && var30 <= var10 + 20) {
													AbstractSocket.updateLoginStatusUsernameRemembered(true);
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
													class33.Login_promptCredentials(false);
												}

												var34 = Login.loginBoxX + 180;
												var39 = 276;
												if (var5 == 1 && var29 >= var34 - 75 && var29 <= var34 + 75 && var30 >= var39 - 20 && var30 <= var39 + 20) {
													WorldMapRectangle.openURL(var26, true, false);
													class150.setLoginResponseString("", "Page has opened in the browser.", "");
													Varcs.method3212(6);
													return;
												}

												var34 = Login.loginBoxX + 180;
												var39 = 326;
												if (var5 == 1 && var29 >= var34 - 75 && var29 <= var34 + 75 && var30 >= var39 - 20 && var30 <= var39 + 20) {
													class33.Login_promptCredentials(false);
												}
											} else if (Login.loginIndex == 24) {
												var9 = Login.loginBoxX + 180;
												var10 = 301;
												if (var5 == 1 && var29 >= var9 - 75 && var29 <= var9 + 75 && var30 >= var10 - 20 && var30 <= var10 + 20) {
													AbstractSocket.updateLoginStatusUsernameRemembered(false);
												}
											} else if (Login.loginIndex == 32) {
												var9 = Login.loginBoxX + 180 - 80;
												var10 = 321;
												if (var5 == 1 && var29 >= var9 - 75 && var29 <= var9 + 75 && var30 >= var10 - 20 && var30 <= var10 + 20) {
													WorldMapRectangle.openURL(RouteStrategy.method5846("secure", true) + "m=dob/set_dob.ws", true, false);
													class150.setLoginResponseString("", "Page has opened in the browser.", "");
													Varcs.method3212(6);
													return;
												}

												var9 = Login.loginBoxX + 180 + 80;
												if (var5 == 1 && var29 >= var9 - 75 && var29 <= var9 + 75 && var30 >= var10 - 20 && var30 <= var10 + 20) {
													class33.Login_promptCredentials(true);
												}
											} else if (Login.loginIndex == 33) {
												var9 = Login.loginBoxX + 180;
												var10 = 276;
												if (var5 == 1 && var29 >= var9 - 75 && var29 <= var9 + 75 && var30 >= var10 - 20 && var30 <= var10 + 20) {
													WorldMapRectangle.openURL("https://oldschool.runescape.com/launcher", true, false);
												}

												var9 = Login.loginBoxX + 180;
												var10 = 326;
												if (var5 == 1 && var29 >= var9 - 75 && var29 <= var9 + 75 && var30 >= var10 - 20 && var30 <= var10 + 20) {
													class33.Login_promptCredentials(true);
												}
											} else if (Login.loginIndex == 34) {
												var9 = Login.loginBoxX + 180;
												var10 = 276;
												if (var5 == 1 && var29 >= var9 - 75 && var29 <= var9 + 75 && var30 >= var10 - 20 && var30 <= var10 + 20) {
													class212.method4849();
													return;
												}

												if (class149.World_request != null) {
													class212.method4849();
												}

												var9 = Login.loginBoxX + 180;
												var10 = 326;
												if (var5 == 1 && var29 >= var9 - 75 && var29 <= var9 + 75 && var30 >= var10 - 20 && var30 <= var10 + 20) {
													class33.Login_promptCredentials(false);
												}
											}
										} else {
											while (true) {
												do {
													if (!var8.method5772()) {
														var32 = 321;
														if (var5 == 1 && var30 >= var32 - 20 && var30 <= var32 + 20) {
															class33.Login_promptCredentials(true);
														}

														return;
													}
												} while(var8.field2989 != 84 && var8.field2989 != 13);

												class33.Login_promptCredentials(true);
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

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/Object;",
		garbageValue = "-7"
	)
	static Object method17(int var0) {
		return Timer.method8952((class544)StructComposition.findEnumerated(class544.method10125(), var0));
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("clear")
	static final void clear() {
		class211.method4837();
		class166.method3807();
		class251.method5358();
		DbRowType.DBRowType_cache.clear();
		DbTableType.DBTableType_cache.clear();
		World.method1994();
		ServerPacket.method6635();
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear();
		RestClientThreadFactory.method209();
		HitSplatDefinition.HitSplatDefinition_cached.clear();
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear();
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear();
		class336.method6883();
		KitDefinition.KitDefinition_cached.clear();
		class165.method3794();
		class241.method5257();
		World.method1960();
		class244.field2026.clear();
		TextureProvider.method4473();
		ItemComposition.ItemDefinition_cached.clear();
		ItemComposition.ItemDefinition_cachedModels.clear();
		ItemComposition.ItemDefinition_cachedSprites.clear();
		class459.method8967();
		SequenceDefinition.SequenceDefinition_cached.clear();
		SequenceDefinition.SequenceDefinition_cachedFrames.clear();
		SequenceDefinition.SequenceDefinition_cachedModel.clear();
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear();
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear();
		StructComposition.StructDefinition_cached.clear();
		WorldViewManager.method2751();
		if (AsyncHttpResponse.field75 != null) {
			AsyncHttpResponse.field75.method10082();
		}

		if (UserComparator9.field1513 != null) {
			UserComparator9.field1513.method10082();
		}

		class248.field2100.clear();
		class250.field2022.clear();
		AsyncHttpResponse.method275();
		class153.method3618();
		class230.field1842.clear();
		class233.field1851.clear();
		SpotAnimationDefinition.method5377();
		LoginScreenAnimation.method2877();
		UserComparator3.method3346();
		Client.DBTableIndex_cache.clear();
		Client.archive11.clear();
		PlayerComposition.PlayerAppearance_cachedModels.clear();
		PlayerComposition.field3808.clearFiles();
		PlayerComposition.field3821 = 0;
		if (ClanChannel.widgetDefinition != null) {
			ClanChannel.widgetDefinition.method7026();
		}

		if (Rasterizer3D.clips.Rasterizer3D_textureLoader != null) {
			((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).clear();
		}

		class244.method5287();
		Client.field636.clearFiles();
		if (GraphicsDefaults.field5117 != null) {
			GraphicsDefaults.field5117.clearFiles();
		}

		if (FloatProjection.field2104 != null) {
			FloatProjection.field2104.clearFiles();
		}

		if (class166.archive10 != null) {
			class166.archive10.clearFiles();
		}

		if (class167.archive12 != null) {
			class167.archive12.clearFiles();
		}

		if (class268.archive2 != null) {
			class268.archive2.clearFiles();
		}

		if (HitSplatDefinition.field2777 != null) {
			HitSplatDefinition.field2777.clearFiles();
		}

		if (FaceNormal.field2120 != null) {
			FaceNormal.field2120.clearFiles();
		}

		if (class220.archive13 != null) {
			class220.archive13.clearFiles();
		}

		if (SoundCache.archive4 != null) {
			SoundCache.archive4.clearFiles();
		}

		if (class88.field1069 != null) {
			class88.field1069.clearFiles();
		}

		if (World.soundEffectsArchive != null) {
			World.soundEffectsArchive.clearFiles();
		}

		if (WorldMapSection2.field3102 != null) {
			WorldMapSection2.field3102.clearFiles();
		}

		if (LoginState.archive9 != null) {
			LoginState.archive9.clearFiles();
		}

		if (class544.archive6 != null) {
			class544.archive6.clearFiles();
		}

		if (class59.field398 != null) {
			class59.field398.clearFiles();
		}

		if (ClanSettings.field1762 != null) {
			ClanSettings.field1762.clearFiles();
		}

		if (PcmPlayer.archive8 != null) {
			PcmPlayer.archive8.clearFiles();
		}

		if (SpotAnimationDefinition.field2704 != null) {
			SpotAnimationDefinition.field2704.clearFiles();
		}

		if (class221.field2421 != null) {
			class221.field2421.clearFiles();
		}

		if (class137.field1603 != null) {
			class137.field1603.clearFiles();
		}

		if (StructComposition.field2746 != null) {
			StructComposition.field2746.clearFiles();
		}

		if (Sound.field1718 != null) {
			Sound.field1718.clearFiles();
		}

	}

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(Ldz;IIIIII)V",
		garbageValue = "-1622761338"
	)
	@Export("worldToScreen")
	static void worldToScreen(WorldView var0, int var1, int var2, int var3, int var4, int var5) {
		if (var1 >= 128 && 13056 >= var1 && var2 >= 128 && 13056 >= var2) {
			int var6 = Canvas.getTileHeight(var0, var3, var4, var0.plane) - var5;
			var1 -= Buddy.cameraX;
			var6 -= Message.cameraY;
			var2 -= class31.cameraZ;
			int var7 = Rasterizer3D.Rasterizer3D_sine[class159.cameraPitch];
			int var8 = Rasterizer3D.Rasterizer3D_cosine[class159.cameraPitch];
			int var9 = Rasterizer3D.Rasterizer3D_sine[IntProjection.cameraYaw];
			int var10 = Rasterizer3D.Rasterizer3D_cosine[IntProjection.cameraYaw];
			int var11 = var9 * var2 + var10 * var1 >> 16;
			var2 = var10 * var2 - var9 * var1 >> 16;
			var1 = var11;
			var11 = var6 * var8 - var7 * var2 >> 16;
			var2 = var7 * var6 + var8 * var2 >> 16;
			if (var2 >= 50) {
				Client.viewportTempX = Client.viewportWidth / 2 + Client.viewportZoom * var1 / var2;
				Client.viewportTempY = Client.viewportHeight / 2 + var11 * Client.viewportZoom / var2;
			} else {
				Client.viewportTempX = -1;
				Client.viewportTempY = -1;
			}

		} else {
			Client.viewportTempX = -1;
			Client.viewportTempY = -1;
		}
	}
}
