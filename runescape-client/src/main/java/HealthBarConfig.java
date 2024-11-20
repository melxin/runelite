import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eu")
@Implements("HealthBarConfig")
public class HealthBarConfig extends Node {
	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	static Archive field1344;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	@Export("definition")
	HealthBarDefinition definition;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	@Export("updates")
	IterableNodeDeque updates;

	@ObfuscatedSignature(
		descriptor = "(Lhj;)V"
	)
	HealthBarConfig(HealthBarDefinition var1) {
		this.updates = new IterableNodeDeque();
		this.definition = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIIS)V",
		garbageValue = "-14089"
	)
	@Export("put")
	void put(int var1, int var2, int var3, int var4) {
		HealthBarUpdate var5 = null;
		int var6 = 0;

		for (HealthBarUpdate var7 = (HealthBarUpdate)this.updates.last(); var7 != null; var7 = (HealthBarUpdate)this.updates.previous()) {
			++var6;
			if (var7.cycle == var1) {
				var7.set(var1, var2, var3, var4);
				return;
			}

			if (var7.cycle <= var1) {
				var5 = var7;
			}
		}

		if (var5 == null) {
			if (var6 < 4) {
				this.updates.addLast(new HealthBarUpdate(var1, var2, var3, var4));
			}

		} else {
			IterableNodeDeque.IterableNodeDeque_addBefore(new HealthBarUpdate(var1, var2, var3, var4), var5);
			if (var6 >= 4) {
				this.updates.last().remove();
			}

		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lds;",
		garbageValue = "-1444311097"
	)
	@Export("get")
	HealthBarUpdate get(int var1) {
		HealthBarUpdate var2 = (HealthBarUpdate)this.updates.last();
		if (var2 != null && var2.cycle <= var1) {
			for (HealthBarUpdate var3 = (HealthBarUpdate)this.updates.previous(); var3 != null && var3.cycle <= var1; var3 = (HealthBarUpdate)this.updates.previous()) {
				var2.remove();
				var2 = var3;
			}

			if (this.definition.int5 + var2.cycle + var2.cycleOffset > var1) {
				return var2;
			} else {
				var2.remove();
				return null;
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1193327604"
	)
	@Export("isEmpty")
	boolean isEmpty() {
		return this.updates.method7934();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lbo;Lqu;Lqu;I)V",
		garbageValue = "233027516"
	)
	@Export("loginScreen")
	static void loginScreen(GameEngine var0, Font var1, Font var2) {
		int var6;
		int var64;
		int var65;
		boolean var77;
		if (Login.worldSelectOpen) {
			IndexCheck var62 = Client.indexCheck;
			IndexCheck var4 = var62;

			while (true) {
				if (!var4.method5597()) {
					if (MouseHandler.MouseHandler_lastButton != 1 && (class160.mouseCam || MouseHandler.MouseHandler_lastButton != 4)) {
						break;
					}

					int var63 = Login.xPadding + 280;
					if (MouseHandler.MouseHandler_lastPressedX >= var63 && MouseHandler.MouseHandler_lastPressedX <= var63 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						class376.changeWorldSelectSorting(0, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var63 + 15 && MouseHandler.MouseHandler_lastPressedX <= var63 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						class376.changeWorldSelectSorting(0, 1);
						break;
					}

					var6 = Login.xPadding + 390;
					if (MouseHandler.MouseHandler_lastPressedX >= var6 && MouseHandler.MouseHandler_lastPressedX <= var6 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						class376.changeWorldSelectSorting(1, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var6 + 15 && MouseHandler.MouseHandler_lastPressedX <= var6 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						class376.changeWorldSelectSorting(1, 1);
						break;
					}

					var64 = Login.xPadding + 500;
					if (MouseHandler.MouseHandler_lastPressedX >= var64 && MouseHandler.MouseHandler_lastPressedX <= var64 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						class376.changeWorldSelectSorting(2, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var64 + 15 && MouseHandler.MouseHandler_lastPressedX <= var64 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						class376.changeWorldSelectSorting(2, 1);
						break;
					}

					var65 = Login.xPadding + 610;
					if (MouseHandler.MouseHandler_lastPressedX >= var65 && MouseHandler.MouseHandler_lastPressedX <= var65 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						class376.changeWorldSelectSorting(3, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var65 + 15 && MouseHandler.MouseHandler_lastPressedX <= var65 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						class376.changeWorldSelectSorting(3, 1);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) {
						if (Login.loginIndex == 34) {
							GameEngine.Login_promptCredentials(false);
						}

						Login.worldSelectOpen = false;
						Rasterizer2D.Rasterizer2D_fillRectangle(0, 0, Rasterizer2D.Rasterizer2D_width, Rasterizer2D.Rasterizer2D_height, 0);
						UserComparator10.leftTitleSprite.drawAt(Login.xPadding, 0);
						UserComparator7.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
						HttpResponse.logoSprite.drawAt(Login.xPadding + 382 - HttpResponse.logoSprite.subWidth / 2, 18);
						break;
					}

					if (Login.hoveredWorldIndex != -1) {
						World var66 = class142.World_worlds[Login.hoveredWorldIndex];
						boolean var10 = class417.method7998(Client.worldProperties, class552.field5440);
						var77 = var66.isDeadman();
						class360.field3847 = var77;
						var66.field822 = var77 ? "beta" : var66.field822;
						UserComparator10.changeWorld(var66);
						if (Login.loginIndex == 34) {
							GameEngine.Login_promptCredentials(false);
						}

						Login.worldSelectOpen = false;
						Rasterizer2D.Rasterizer2D_fillRectangle(0, 0, Rasterizer2D.Rasterizer2D_width, Rasterizer2D.Rasterizer2D_height, 0);
						UserComparator10.leftTitleSprite.drawAt(Login.xPadding, 0);
						UserComparator7.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
						HttpResponse.logoSprite.drawAt(Login.xPadding + 382 - HttpResponse.logoSprite.subWidth / 2, 18);
						if (var77 != var10) {
							WorldMapLabelSize.method5797();
						}
					} else {
						if (Login.worldSelectPage > 0 && class1.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= class1.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= class535.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class535.canvasHeight / 2 + 50) {
							--Login.worldSelectPage;
						}

						if (Login.worldSelectPage < Login.worldSelectPagesCount && class508.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= class329.canvasWidth - class508.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= class329.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= class535.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class535.canvasHeight / 2 + 50) {
							++Login.worldSelectPage;
						}
					}
					break;
				}

				if (var4.field3007 == 13) {
					if (Login.loginIndex == 34) {
						GameEngine.Login_promptCredentials(false);
					}

					Login.worldSelectOpen = false;
					Rasterizer2D.Rasterizer2D_fillRectangle(0, 0, Rasterizer2D.Rasterizer2D_width, Rasterizer2D.Rasterizer2D_height, 0);
					UserComparator10.leftTitleSprite.drawAt(Login.xPadding, 0);
					UserComparator7.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
					HttpResponse.logoSprite.drawAt(Login.xPadding + 382 - HttpResponse.logoSprite.subWidth / 2, 18);
					break;
				}

				if (var4.field3007 == 96) {
					if (Login.worldSelectPage > 0 && class1.worldSelectLeftSprite != null) {
						--Login.worldSelectPage;
					}
				} else if (var4.field3007 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && class508.worldSelectRightSprite != null) {
					++Login.worldSelectPage;
				}
			}

		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !class160.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453 && MouseHandler.MouseHandler_lastPressedX < Login.xPadding + 765 && MouseHandler.MouseHandler_lastPressedY < 503) {
				SecureUrlRequester.clientPreferences.updateTitleMusicDisabled(!SecureUrlRequester.clientPreferences.isTitleMusicDisabled());
				if (!SecureUrlRequester.clientPreferences.isTitleMusicDisabled()) {
					ArrayList var3 = new ArrayList();
					var3.add(new MusicSong(FontName.archive6, "scape main", "", 255, false));
					UrlRequester.method3175(var3, 0, 0, 0, 100, false);
				} else {
					WorldMapSprite.method6235(0, 0);
				}

				FloorOverlayDefinition.method4257();
			}

			if (Client.gameState != 5) {
				if (-1L == Login.field960) {
					Login.field960 = class59.method1150() + 1000L;
				}

				long var35 = class59.method1150();
				boolean var5;
				if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
					while (true) {
						if (Client.archiveLoadersDone >= Client.archiveLoaders.size()) {
							var5 = true;
							break;
						}

						ArchiveLoader var37 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone);
						if (!var37.isLoaded()) {
							var5 = false;
							break;
						}

						++Client.archiveLoadersDone;
					}
				} else {
					var5 = true;
				}

				if (var5 && Login.field965 == -1L) {
					Login.field965 = var35;
					if (Login.field965 > Login.field960) {
						Login.field960 = Login.field965;
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) {
					if (Language.Language_EN == class276.clientLanguage) {
						if (MouseHandler.MouseHandler_lastButton == 1 || !class160.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
							var6 = Login.xPadding + 5;
							short var7 = 463;
							byte var8 = 100;
							byte var38 = 35;
							if (MouseHandler.MouseHandler_lastPressedX >= var6 && MouseHandler.MouseHandler_lastPressedX <= var8 + var6 && MouseHandler.MouseHandler_lastPressedY >= var7 && MouseHandler.MouseHandler_lastPressedY <= var38 + var7) {
								method2877();
								return;
							}
						}

						if (class169.World_request != null) {
							method2877();
						}
					}

					var6 = MouseHandler.MouseHandler_lastButton;
					var64 = MouseHandler.MouseHandler_lastPressedX;
					var65 = MouseHandler.MouseHandler_lastPressedY;
					if (var6 == 0) {
						var64 = MouseHandler.MouseHandler_x;
						var65 = MouseHandler.MouseHandler_y;
					}

					if (!class160.mouseCam && var6 == 4) {
						var6 = 1;
					}

					IndexCheck var9 = Client.indexCheck;
					IndexCheck var39 = var9;
					short var68;
					int var69;
					if (Login.loginIndex == 0) {
						var77 = false;

						while (var39.method5597()) {
							if (var39.field3007 == 84) {
								var77 = true;
							}
						}

						var69 = class217.loginBoxCenter - 80;
						var68 = 291;
						if (var6 == 1 && var64 >= var69 - 75 && var64 <= var69 + 75 && var65 >= var68 - 20 && var65 <= var68 + 20) {
							class445.openURL(ArchiveDiskActionHandler.method7510("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
						}

						var69 = class217.loginBoxCenter + 80;
						if (var6 == 1 && var64 >= var69 - 75 && var64 <= var69 + 75 && var65 >= var68 - 20 && var65 <= var68 + 20 || var77) {
							if ((Client.worldProperties & class552.field5444.rsOrdinal()) != 0) {
								Login.Login_response0 = "";
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world.";
								Login.Login_response2 = "Your normal account will not be affected.";
								Login.Login_response3 = "";
								class329.updateLoginIndex(1);
								class499.focusPasswordWhenUsernameFilled();
							} else if ((Client.worldProperties & class552.field5426.rsOrdinal()) != 0) {
								if ((Client.worldProperties & class552.field5434.rsOrdinal()) != 0) {
									Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
									Login.Login_response2 = "Players can attack each other almost everywhere";
									Login.Login_response3 = "and the Protect Item prayer won't work.";
								} else {
									Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world.";
									Login.Login_response2 = "Players can attack each other";
									Login.Login_response3 = "almost everywhere.";
								}

								Login.Login_response0 = "Warning!";
								class329.updateLoginIndex(1);
								class499.focusPasswordWhenUsernameFilled();
							} else if ((Client.worldProperties & class552.field5434.rsOrdinal()) != 0) {
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
								Login.Login_response2 = "The Protect Item prayer will";
								Login.Login_response3 = "not work on this world.";
								Login.Login_response0 = "Warning!";
								class329.updateLoginIndex(1);
								class499.focusPasswordWhenUsernameFilled();
							} else {
								GameEngine.Login_promptCredentials(false);
							}
						}
					} else {
						int var11;
						short var12;
						if (Login.loginIndex == 1) {
							while (true) {
								if (!var39.method5597()) {
									var11 = class217.loginBoxCenter - 80;
									var12 = 321;
									if (var6 == 1 && var64 >= var11 - 75 && var64 <= var11 + 75 && var65 >= var12 - 20 && var65 <= var12 + 20) {
										GameEngine.Login_promptCredentials(false);
									}

									var11 = class217.loginBoxCenter + 80;
									if (var6 == 1 && var64 >= var11 - 75 && var64 <= var11 + 75 && var65 >= var12 - 20 && var65 <= var12 + 20) {
										class329.updateLoginIndex(0);
									}
									break;
								}

								if (var39.field3007 == 84) {
									GameEngine.Login_promptCredentials(false);
								} else if (var39.field3007 == 13) {
									class329.updateLoginIndex(0);
								}
							}
						} else {
							String var17;
							short var67;
							boolean var71;
							if (Login.loginIndex == 2) {
								var67 = 201;
								var11 = var67 + 52;
								if (var6 == 1 && var65 >= var11 - 12 && var65 < var11 + 2) {
									Login.currentLoginField = 0;
								}

								var11 += 15;
								if (var6 == 1 && var65 >= var11 - 12 && var65 < var11 + 2) {
									Login.currentLoginField = 1;
								}

								var11 += 15;
								var67 = 361;
								if (class139.field1625 != null) {
									var69 = class139.field1625.highX / 2;
									if (var6 == 1 && var64 >= class139.field1625.lowX - var69 && var64 <= var69 + class139.field1625.lowX && var65 >= var67 - 15 && var65 < var67) {
										switch(Login.field939) {
										case 1:
											class445.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
											return;
										case 2:
											class445.openURL("https://support.runescape.com/hc/en-gb", true, false);
										}
									}
								}

								var69 = class217.loginBoxCenter - 80;
								var68 = 321;
								if (var6 == 1 && var64 >= var69 - 75 && var64 <= var69 + 75 && var65 >= var68 - 20 && var65 <= var68 + 20) {
									class330.method6485();
									return;
								}

								var69 = Login.loginBoxX + 180 + 80;
								if (var6 == 1 && var64 >= var69 - 75 && var64 <= var69 + 75 && var65 >= var68 - 20 && var65 <= var68 + 20) {
									class329.updateLoginIndex(0);
									Login.Login_username = "";
									Login.Login_password = "";
									Bounds.otpMedium = 0;
									Client.otp = "";
									Login.rememberUsername = true;
								}

								var69 = class217.loginBoxCenter + -117;
								var68 = 277;
								Login.field949 = var64 >= var69 && var64 < var69 + class188.field1953 && var65 >= var68 && var65 < var68 + ParamComposition.field2122;
								if (var6 == 1 && Login.field949) {
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered;
									if (!Client.Login_isUsernameRemembered && SecureUrlRequester.clientPreferences.getRememberedUsername() != null) {
										SecureUrlRequester.clientPreferences.updateRememberedUsername((String)null);
									}
								}

								var69 = class217.loginBoxCenter + 24;
								var68 = 277;
								Login.field935 = var64 >= var69 && var64 < var69 + class188.field1953 && var65 >= var68 && var65 < var68 + ParamComposition.field2122;
								if (var6 == 1 && Login.field935) {
									SecureUrlRequester.clientPreferences.updateHideUsername(!SecureUrlRequester.clientPreferences.isUsernameHidden());
									if (!SecureUrlRequester.clientPreferences.isUsernameHidden()) {
										Login.Login_username = "";
										SecureUrlRequester.clientPreferences.updateRememberedUsername((String)null);
										class499.focusPasswordWhenUsernameFilled();
									}
								}

								label1759:
								while (true) {
									int var75;
									Transferable var86;
									do {
										while (true) {
											char var73;
											label1723:
											do {
												while (true) {
													while (var39.method5597()) {
														if (var39.field3007 != 13) {
															if (Login.currentLoginField != 0) {
																continue label1723;
															}

															MenuAction.method2257(var39.field3006);
															if (var39.field3007 == 85 && Login.Login_username.length() > 0) {
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (var39.field3007 == 84 || var39.field3007 == 80) {
																Login.currentLoginField = 1;
															}

															var73 = var39.field3006;
															var71 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var73) != -1;
															if (var71 && Login.Login_username.length() < 320) {
																Login.Login_username = Login.Login_username + var39.field3006;
															}
														} else {
															class329.updateLoginIndex(0);
															Login.Login_username = "";
															Login.Login_password = "";
															Bounds.otpMedium = 0;
															Client.otp = "";
															Login.rememberUsername = true;
														}
													}

													return;
												}
											} while(Login.currentLoginField != 1);

											if (var39.field3007 == 85 && Login.Login_password.length() > 0) {
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
											} else if (var39.field3007 == 84 || var39.field3007 == 80) {
												Login.currentLoginField = 0;
												if (var39.field3007 == 84) {
													class330.method6485();
													return;
												}
											}

											if ((var39.isValidIndexInRange(82) || var39.isValidIndexInRange(87)) && var39.field3007 == 67) {
												Clipboard var85 = Toolkit.getDefaultToolkit().getSystemClipboard();
												var86 = var85.getContents(NpcOverrides.client);
												var75 = 20 - Login.Login_password.length();
												break;
											}

											if (class93.method2514(var39.field3006)) {
												var73 = var39.field3006;
												var71 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var73) != -1;
												if (var71 && Login.Login_password.length() < 20) {
													Login.Login_password = Login.Login_password + var39.field3006;
												}
											}
										}
									} while(var75 <= 0);

									try {
										var17 = (String)var86.getTransferData(DataFlavor.stringFlavor);
										int var76 = Math.min(var75, var17.length());
										int var19 = 0;

										while (true) {
											if (var19 >= var76) {
												Login.Login_password = Login.Login_password + var17.substring(0, var76);
												continue label1759;
											}

											if (!class93.method2514(var17.charAt(var19))) {
												break;
											}

											char var21 = var17.charAt(var19);
											boolean var20 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var21) != -1;
											if (!var20) {
												break;
											}

											++var19;
										}

										class329.updateLoginIndex(3);
										return;
									} catch (UnsupportedFlavorException var60) {
									} catch (IOException var61) {
									}
								}
							} else {
								Bounds var42;
								if (Login.loginIndex == 3) {
									var11 = Login.loginBoxX + 180;
									var12 = 241;
									var42 = var1.method8538(25, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.".length() - 34, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", var11, var12);
									if (var6 == 1 && var42.method8069(var64, var65)) {
										class445.openURL("https://oldschool.runescape.com/launcher", true, false);
									}

									var11 = Login.loginBoxX + 180;
									var12 = 276;
									if (var6 == 1 && var64 >= var11 - 75 && var64 <= var11 + 75 && var65 >= var12 - 20 && var65 <= var12 + 20) {
										ItemContainer.updateLoginStatusUsernameRemembered(false);
									}

									var11 = Login.loginBoxX + 180;
									var12 = 326;
									if (var6 == 1 && var64 >= var11 - 75 && var64 <= var11 + 75 && var65 >= var12 - 20 && var65 <= var12 + 20) {
										class445.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
										return;
									}
								} else {
									int var14;
									if (Login.loginIndex == 4) {
										var11 = Login.loginBoxX + 180 - 80;
										var12 = 321;
										if (var6 == 1 && var64 >= var11 - 75 && var64 <= var11 + 75 && var65 >= var12 - 20 && var65 <= var12 + 20) {
											class73.method2238();
											return;
										}

										if (var6 == 1 && var64 >= Login.loginBoxX + 180 - 9 && var64 <= Login.loginBoxX + 180 + 130 && var65 >= 263 && var65 <= 296) {
											Login.rememberUsername = !Login.rememberUsername;
										}

										if (var6 == 1 && var64 >= Login.loginBoxX + 180 - 34 && var64 <= Login.loginBoxX + 34 + 180 && var65 >= 351 && var65 <= 363) {
											class445.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
										}

										var11 = Login.loginBoxX + 180 + 80;
										if (var6 == 1 && var64 >= var11 - 75 && var64 <= var11 + 75 && var65 >= var12 - 20 && var65 <= var12 + 20) {
											class329.updateLoginIndex(0);
											Login.Login_username = "";
											Login.Login_password = "";
											Bounds.otpMedium = 0;
											Client.otp = "";
										}

										while (var39.method5597()) {
											boolean var13 = false;

											for (var14 = 0; var14 < "1234567890".length(); ++var14) {
												if (var39.field3006 == "1234567890".charAt(var14)) {
													var13 = true;
													break;
												}
											}

											if (var39.field3007 == 13) {
												class329.updateLoginIndex(0);
												Login.Login_username = "";
												Login.Login_password = "";
												Bounds.otpMedium = 0;
												Client.otp = "";
											} else {
												if (var39.field3007 == 85 && Client.otp.length() > 0) {
													Client.otp = Client.otp.substring(0, Client.otp.length() - 1);
												}

												if (var39.field3007 == 84) {
													class73.method2238();
													return;
												}

												if (var13 && Client.otp.length() < 6) {
													Client.otp = Client.otp + var39.field3006;
												}
											}
										}
									} else {
										int var15;
										if (Login.loginIndex == 5) {
											var11 = Login.loginBoxX + 180 - 80;
											var12 = 321;
											String var27;
											if (var6 == 1 && var64 >= var11 - 75 && var64 <= var11 + 75 && var65 >= var12 - 20 && var65 <= var12 + 20) {
												Login.Login_username = Login.Login_username.trim();
												if (Login.Login_username.length() == 0) {
													class106.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
												} else {
													long var43 = Sound.method3510();
													byte var70;
													if (0L == var43) {
														var70 = 5;
													} else {
														var17 = Login.Login_username;
														Random var45 = new Random();
														Buffer var87 = new Buffer(128);
														Buffer var88 = new Buffer(128);
														int[] var89 = new int[]{var45.nextInt(), var45.nextInt(), (int)(var43 >> 32), (int)var43};
														var87.writeByte(10);

														int var22;
														for (var22 = 0; var22 < 4; ++var22) {
															var87.writeInt(var45.nextInt());
														}

														var87.writeInt(var89[0]);
														var87.writeInt(var89[1]);
														var87.writeLong(var43);
														var87.writeLong(0L);

														for (var22 = 0; var22 < 4; ++var22) {
															var87.writeInt(var45.nextInt());
														}

														var87.encryptRsa(class75.field901, class75.field906);
														var88.writeByte(10);

														for (var22 = 0; var22 < 3; ++var22) {
															var88.writeInt(var45.nextInt());
														}

														var88.writeLong(var45.nextLong());
														var88.writeLongMedium(var45.nextLong());
														Huffman.randomDatData2(var88);
														var88.writeLong(var45.nextLong());
														var88.encryptRsa(class75.field901, class75.field906);
														var22 = class164.stringCp1252NullTerminatedByteSize(var17);
														if (var22 % 8 != 0) {
															var22 += 8 - var22 % 8;
														}

														Buffer var78 = new Buffer(var22);
														var78.writeStringCp1252NullTerminated(var17);
														var78.offset = var22;
														var78.xteaEncryptAll(var89);
														Buffer var24 = new Buffer(var87.offset + var88.offset + var78.offset + 5);
														var24.writeByte(2);
														var24.writeByte(var87.offset);
														var24.writeBytes(var87.array, 0, var87.offset);
														var24.writeByte(var88.offset);
														var24.writeBytes(var88.array, 0, var88.offset);
														var24.writeShort(var78.offset);
														var24.writeBytes(var78.array, 0, var78.offset);
														byte[] var80 = var24.array;
														String var79 = class344.method6790(var80, 0, var80.length);
														var27 = var79;

														byte var16;
														try {
															URL var81 = new URL(ArchiveDiskActionHandler.method7510("services", false) + "m=accountappeal/login.ws");
															URLConnection var82 = var81.openConnection();
															var82.setDoInput(true);
															var82.setDoOutput(true);
															var82.setConnectTimeout(5000);
															OutputStreamWriter var83 = new OutputStreamWriter(var82.getOutputStream());
															var83.write("data2=" + EnumComposition.method3882(var27) + "&dest=" + EnumComposition.method3882("passwordchoice.ws"));
															var83.flush();
															InputStream var84 = var82.getInputStream();
															var24 = new Buffer(new byte[1000]);

															while (true) {
																int var32 = var84.read(var24.array, var24.offset, 1000 - var24.offset);
																if (var32 == -1) {
																	var83.close();
																	var84.close();
																	String var90 = new String(var24.array);
																	if (var90.startsWith("OFFLINE")) {
																		var16 = 4;
																	} else if (var90.startsWith("WRONG")) {
																		var16 = 7;
																	} else if (var90.startsWith("RELOAD")) {
																		var16 = 3;
																	} else if (var90.startsWith("Not permitted for social network accounts.")) {
																		var16 = 6;
																	} else {
																		var24.xteaDecryptAll(var89);

																		while (var24.offset > 0 && var24.array[var24.offset - 1] == 0) {
																			--var24.offset;
																		}

																		var90 = new String(var24.array, 0, var24.offset);
																		if (TriBool.method9132(var90)) {
																			class445.openURL(var90, true, false);
																			var16 = 2;
																		} else {
																			var16 = 5;
																		}
																	}
																	break;
																}

																var24.offset += var32;
																if (var24.offset >= 1000) {
																	var16 = 5;
																	break;
																}
															}
														} catch (Throwable var58) {
															var58.printStackTrace();
															var16 = 5;
														}

														var70 = var16;
													}

													switch(var70) {
													case 2:
														class106.setLoginResponseString(Strings.field4436, Strings.field4437, Strings.field4424);
														class329.updateLoginIndex(6);
														break;
													case 3:
														class106.setLoginResponseString("", "Error connecting to server.", "");
														break;
													case 4:
														class106.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
														break;
													case 5:
														class106.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
														break;
													case 6:
														class106.setLoginResponseString("", "Error connecting to server.", "");
														break;
													case 7:
														class106.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
													}
												}

												return;
											}

											var11 = Login.loginBoxX + 180 + 80;
											if (var6 == 1 && var64 >= var11 - 75 && var64 <= var11 + 75 && var65 >= var12 - 20 && var65 <= var12 + 20) {
												GameEngine.Login_promptCredentials(true);
											}

											var68 = 361;
											if (FloorUnderlayDefinition.field2082 != null) {
												var14 = FloorUnderlayDefinition.field2082.highX / 2;
												if (var6 == 1 && var64 >= FloorUnderlayDefinition.field2082.lowX - var14 && var64 <= var14 + FloorUnderlayDefinition.field2082.lowX && var65 >= var68 - 15 && var65 < var68) {
													class445.openURL(ArchiveDiskActionHandler.method7510("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
												}
											}

											while (var39.method5597()) {
												var71 = false;

												for (var15 = 0; var15 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var15) {
													if (var39.field3006 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var15)) {
														var71 = true;
														break;
													}
												}

												if (var39.field3007 == 13) {
													GameEngine.Login_promptCredentials(true);
												} else {
													if (var39.field3007 == 85 && Login.Login_username.length() > 0) {
														Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
													}

													if (var39.field3007 == 84) {
														Login.Login_username = Login.Login_username.trim();
														if (Login.Login_username.length() == 0) {
															class106.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
														} else {
															long var50 = Sound.method3510();
															byte var72;
															if (0L == var50) {
																var72 = 5;
															} else {
																String var46 = Login.Login_username;
																Random var47 = new Random();
																Buffer var48 = new Buffer(128);
																Buffer var52 = new Buffer(128);
																int[] var23 = new int[]{var47.nextInt(), var47.nextInt(), (int)(var50 >> 32), (int)var50};
																var48.writeByte(10);

																int var53;
																for (var53 = 0; var53 < 4; ++var53) {
																	var48.writeInt(var47.nextInt());
																}

																var48.writeInt(var23[0]);
																var48.writeInt(var23[1]);
																var48.writeLong(var50);
																var48.writeLong(0L);

																for (var53 = 0; var53 < 4; ++var53) {
																	var48.writeInt(var47.nextInt());
																}

																var48.encryptRsa(class75.field901, class75.field906);
																var52.writeByte(10);

																for (var53 = 0; var53 < 3; ++var53) {
																	var52.writeInt(var47.nextInt());
																}

																var52.writeLong(var47.nextLong());
																var52.writeLongMedium(var47.nextLong());
																Huffman.randomDatData2(var52);
																var52.writeLong(var47.nextLong());
																var52.encryptRsa(class75.field901, class75.field906);
																var53 = class164.stringCp1252NullTerminatedByteSize(var46);
																if (var53 % 8 != 0) {
																	var53 += 8 - var53 % 8;
																}

																Buffer var25 = new Buffer(var53);
																var25.writeStringCp1252NullTerminated(var46);
																var25.offset = var53;
																var25.xteaEncryptAll(var23);
																Buffer var26 = new Buffer(var25.offset + var52.offset + var48.offset + 5);
																var26.writeByte(2);
																var26.writeByte(var48.offset);
																var26.writeBytes(var48.array, 0, var48.offset);
																var26.writeByte(var52.offset);
																var26.writeBytes(var52.array, 0, var52.offset);
																var26.writeShort(var25.offset);
																var26.writeBytes(var25.array, 0, var25.offset);
																byte[] var28 = var26.array;
																var27 = class344.method6790(var28, 0, var28.length);
																String var29 = var27;

																byte var18;
																try {
																	URL var30 = new URL(ArchiveDiskActionHandler.method7510("services", false) + "m=accountappeal/login.ws");
																	URLConnection var31 = var30.openConnection();
																	var31.setDoInput(true);
																	var31.setDoOutput(true);
																	var31.setConnectTimeout(5000);
																	OutputStreamWriter var49 = new OutputStreamWriter(var31.getOutputStream());
																	var49.write("data2=" + EnumComposition.method3882(var29) + "&dest=" + EnumComposition.method3882("passwordchoice.ws"));
																	var49.flush();
																	InputStream var33 = var31.getInputStream();
																	var26 = new Buffer(new byte[1000]);

																	while (true) {
																		int var34 = var33.read(var26.array, var26.offset, 1000 - var26.offset);
																		if (var34 == -1) {
																			var49.close();
																			var33.close();
																			String var54 = new String(var26.array);
																			if (var54.startsWith("OFFLINE")) {
																				var18 = 4;
																			} else if (var54.startsWith("WRONG")) {
																				var18 = 7;
																			} else if (var54.startsWith("RELOAD")) {
																				var18 = 3;
																			} else if (var54.startsWith("Not permitted for social network accounts.")) {
																				var18 = 6;
																			} else {
																				var26.xteaDecryptAll(var23);

																				while (var26.offset > 0 && var26.array[var26.offset - 1] == 0) {
																					--var26.offset;
																				}

																				var54 = new String(var26.array, 0, var26.offset);
																				if (TriBool.method9132(var54)) {
																					class445.openURL(var54, true, false);
																					var18 = 2;
																				} else {
																					var18 = 5;
																				}
																			}
																			break;
																		}

																		var26.offset += var34;
																		if (var26.offset >= 1000) {
																			var18 = 5;
																			break;
																		}
																	}
																} catch (Throwable var59) {
																	var59.printStackTrace();
																	var18 = 5;
																}

																var72 = var18;
															}

															switch(var72) {
															case 2:
																class106.setLoginResponseString(Strings.field4436, Strings.field4437, Strings.field4424);
																class329.updateLoginIndex(6);
																break;
															case 3:
																class106.setLoginResponseString("", "Error connecting to server.", "");
																break;
															case 4:
																class106.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
																break;
															case 5:
																class106.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
																break;
															case 6:
																class106.setLoginResponseString("", "Error connecting to server.", "");
																break;
															case 7:
																class106.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
															}
														}

														return;
													}

													if (var71 && Login.Login_username.length() < 320) {
														Login.Login_username = Login.Login_username + var39.field3006;
													}
												}
											}
										} else if (Login.loginIndex != 6) {
											if (Login.loginIndex == 7) {
												if (IndexCheck.field3003 && !Client.onMobile) {
													var11 = class217.loginBoxCenter - 150;
													var69 = var11 + 40 + 240 + 25;
													var68 = 231;
													var14 = var68 + 40;
													if (var6 == 1 && var64 >= var11 && var64 <= var69 && var65 >= var68 && var65 <= var14) {
														Login.field947 = class544.method9961(var11, var64);
													}

													var15 = Login.loginBoxX + 180 - 80;
													short var74 = 321;
													boolean var55;
													if (var6 == 1 && var64 >= var15 - 75 && var64 <= var15 + 75 && var65 >= var74 - 20 && var65 <= var74 + 20) {
														var55 = class179.method3749();
														if (var55) {
															class31.updateGameState(50);
															return;
														}
													}

													var15 = Login.loginBoxX + 180 + 80;
													if (var6 == 1 && var64 >= var15 - 75 && var64 <= var15 + 75 && var65 >= var74 - 20 && var65 <= var74 + 20) {
														Login.field948 = new String[8];
														GameEngine.Login_promptCredentials(true);
													}

													while (var39.method5597()) {
														if (var39.field3007 == 101) {
															Login.field948[Login.field947] = null;
														}

														if (var39.field3007 == 85) {
															if (Login.field948[Login.field947] == null && Login.field947 > 0) {
																--Login.field947;
															}

															Login.field948[Login.field947] = null;
														}

														if (var39.field3006 >= '0' && var39.field3006 <= '9') {
															Login.field948[Login.field947] = "" + var39.field3006;
															if (Login.field947 < 7) {
																++Login.field947;
															}
														}

														if (var39.field3007 == 84) {
															var55 = class179.method3749();
															if (var55) {
																class31.updateGameState(50);
															}

															return;
														}
													}
												} else {
													var11 = Login.loginBoxX + 180 - 80;
													var12 = 321;
													if (var6 == 1 && var64 >= var11 - 75 && var64 <= var11 + 75 && var65 >= var12 - 20 && var65 <= var12 + 20) {
														class445.openURL(ArchiveDiskActionHandler.method7510("secure", true) + "m=dob/set_dob.ws", true, false);
														class106.setLoginResponseString("", "Page has opened in the browser.", "");
														class329.updateLoginIndex(6);
														return;
													}

													var11 = Login.loginBoxX + 180 + 80;
													if (var6 == 1 && var64 >= var11 - 75 && var64 <= var11 + 75 && var65 >= var12 - 20 && var65 <= var12 + 20) {
														GameEngine.Login_promptCredentials(true);
													}
												}
											} else if (Login.loginIndex == 8) {
												var11 = Login.loginBoxX + 180 - 80;
												var12 = 321;
												if (var6 == 1 && var64 >= var11 - 75 && var64 <= var11 + 75 && var65 >= var12 - 20 && var65 <= var12 + 20) {
													class445.openURL("https://www.jagex.com/terms/privacy", true, false);
													class106.setLoginResponseString("", "Page has opened in the browser.", "");
													class329.updateLoginIndex(6);
													return;
												}

												var11 = Login.loginBoxX + 180 + 80;
												if (var6 == 1 && var64 >= var11 - 75 && var64 <= var11 + 75 && var65 >= var12 - 20 && var65 <= var12 + 20) {
													GameEngine.Login_promptCredentials(true);
												}
											} else if (Login.loginIndex == 9) {
												var11 = Login.loginBoxX + 180;
												var12 = 311;
												if (var9.field3007 == 84 || var9.field3007 == 13 || var6 == 1 && var64 >= var11 - 75 && var64 <= var11 + 75 && var65 >= var12 - 20 && var65 <= var12 + 20) {
													ItemContainer.updateLoginStatusUsernameRemembered(false);
												}
											} else if (Login.loginIndex == 10) {
												var11 = Login.loginBoxX + 180;
												var12 = 209;
												if (var9.field3007 == 84 || var6 == 1 && var64 >= var11 - 109 && var64 <= var11 + 109 && var65 >= var12 && var65 <= var12 + 68) {
													class106.setLoginResponseString("", "Connecting to server...", "");
													Client.field691 = class561.field5529;
													Client.authenticationScheme = SecureUrlRequester.clientPreferences.containsKey(Login.Login_username) ? AuthenticationScheme.USERNAME_PASSWORD_REMEMBER : AuthenticationScheme.USERNAME_PASSWORD;
													class31.updateGameState(20);
												}
											} else if (Login.loginIndex == 12) {
												var11 = class217.loginBoxCenter;
												var12 = 233;
												var42 = var2.method8538(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var11, var12);
												Bounds var40 = var2.method8538(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var11, var12);
												Bounds var41 = var2.method8538(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var11, var12);
												var69 = var12 + 17;
												Bounds var56 = var2.method8538(0, 34, "<col=ffd200>agreement (EULA)</col>.", var11, var69);
												if (var6 == 1) {
													if (var42.method8069(var64, var65)) {
														class445.openURL("https://www.jagex.com/terms", true, false);
													} else if (var40.method8069(var64, var65)) {
														class445.openURL("https://www.jagex.com/terms/privacy", true, false);
													} else if (var41.method8069(var64, var65) || var56.method8069(var64, var65)) {
														class445.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
													}
												}

												var11 = class217.loginBoxCenter - 80;
												var12 = 311;
												if (var6 == 1 && var64 >= var11 - 75 && var64 <= var11 + 75 && var65 >= var12 - 20 && var65 <= var12 + 20) {
													class397.method7713();
													ItemContainer.updateLoginStatusUsernameRemembered(true);
												}

												var11 = class217.loginBoxCenter + 80;
												if (var6 == 1 && var64 >= var11 - 75 && var64 <= var11 + 75 && var65 >= var12 - 20 && var65 <= var12 + 20) {
													Login.loginIndex = 13;
												}
											} else if (Login.loginIndex == 13) {
												var11 = class217.loginBoxCenter;
												var12 = 321;
												if (var6 == 1 && var64 >= var11 - 75 && var64 <= var11 + 75 && var65 >= var12 - 20 && var65 <= var12 + 20) {
													ItemContainer.updateLoginStatusUsernameRemembered(true);
												}
											} else if (Login.loginIndex == 14) {
												String var57 = "";
												switch(Login.Login_banType) {
												case 0:
													var57 = "https://secure.runescape.com/m=offence-appeal/account-history";
													break;
												case 1:
													var57 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
													break;
												case 2:
													var57 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
													break;
												default:
													GameEngine.Login_promptCredentials(false);
												}

												var69 = Login.loginBoxX + 180;
												var68 = 276;
												if (var6 == 1 && var64 >= var69 - 75 && var64 <= var69 + 75 && var65 >= var68 - 20 && var65 <= var68 + 20) {
													class445.openURL(var57, true, false);
													class106.setLoginResponseString("", "Page has opened in the browser.", "");
													class329.updateLoginIndex(6);
													return;
												}

												var69 = Login.loginBoxX + 180;
												var68 = 326;
												if (var6 == 1 && var64 >= var69 - 75 && var64 <= var69 + 75 && var65 >= var68 - 20 && var65 <= var68 + 20) {
													GameEngine.Login_promptCredentials(false);
												}
											} else if (Login.loginIndex == 24) {
												var11 = Login.loginBoxX + 180;
												var12 = 301;
												if (var6 == 1 && var64 >= var11 - 75 && var64 <= var11 + 75 && var65 >= var12 - 20 && var65 <= var12 + 20) {
													ItemContainer.updateLoginStatusUsernameRemembered(false);
												}
											} else if (Login.loginIndex == 32) {
												var11 = Login.loginBoxX + 180 - 80;
												var12 = 321;
												if (var6 == 1 && var64 >= var11 - 75 && var64 <= var11 + 75 && var65 >= var12 - 20 && var65 <= var12 + 20) {
													class445.openURL(ArchiveDiskActionHandler.method7510("secure", true) + "m=dob/set_dob.ws", true, false);
													class106.setLoginResponseString("", "Page has opened in the browser.", "");
													class329.updateLoginIndex(6);
													return;
												}

												var11 = Login.loginBoxX + 180 + 80;
												if (var6 == 1 && var64 >= var11 - 75 && var64 <= var11 + 75 && var65 >= var12 - 20 && var65 <= var12 + 20) {
													GameEngine.Login_promptCredentials(true);
												}
											} else if (Login.loginIndex == 33) {
												var11 = Login.loginBoxX + 180;
												var12 = 276;
												if (var6 == 1 && var64 >= var11 - 75 && var64 <= var11 + 75 && var65 >= var12 - 20 && var65 <= var12 + 20) {
													class445.openURL("https://oldschool.runescape.com/launcher", true, false);
												}

												var11 = Login.loginBoxX + 180;
												var12 = 326;
												if (var6 == 1 && var64 >= var11 - 75 && var64 <= var11 + 75 && var65 >= var12 - 20 && var65 <= var12 + 20) {
													GameEngine.Login_promptCredentials(true);
												}
											} else if (Login.loginIndex == 34) {
												var11 = Login.loginBoxX + 180;
												var12 = 276;
												if (var6 == 1 && var64 >= var11 - 75 && var64 <= var11 + 75 && var65 >= var12 - 20 && var65 <= var12 + 20) {
													method2877();
													return;
												}

												if (class169.World_request != null) {
													method2877();
												}

												var11 = Login.loginBoxX + 180;
												var12 = 326;
												if (var6 == 1 && var64 >= var11 - 75 && var64 <= var11 + 75 && var65 >= var12 - 20 && var65 <= var12 + 20) {
													GameEngine.Login_promptCredentials(false);
												}
											}
										} else {
											while (true) {
												do {
													if (!var39.method5597()) {
														var67 = 321;
														if (var6 == 1 && var65 >= var67 - 20 && var65 <= var67 + 20) {
															GameEngine.Login_promptCredentials(true);
														}

														return;
													}
												} while(var39.field3007 != 84 && var39.field3007 != 13);

												GameEngine.Login_promptCredentials(true);
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-105"
	)
	static void method2877() {
		if (ItemContainer.loadWorlds()) {
			Login.worldSelectOpen = true;
			Login.worldSelectPage = 0;
			Login.worldSelectPagesCount = 0;
		}

	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(Lmc;I)V",
		garbageValue = "1084166484"
	)
	static void method2888(PacketBufferNode var0) {
		var0.packetBuffer.writeInt(class1.field0.hash);
		var0.packetBuffer.writeIntLE(GraphicsObject.soundEffectsArchive.hash);
		var0.packetBuffer.writeIntLE(class213.archive13.hash);
		var0.packetBuffer.writeIntME(AsyncHttpResponse.field84.hash);
		var0.packetBuffer.writeInt(class419.archive10.hash);
		var0.packetBuffer.writeInt(AttackOption.archive8.hash);
		var0.packetBuffer.writeIntIME(FontName.archive6.hash);
	}
}
