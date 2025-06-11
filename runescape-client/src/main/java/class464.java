import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ra")
public class class464 extends SongTask {
	@ObfuscatedName("lj")
	static String field5081;

	@ObfuscatedSignature(
		descriptor = "(Lrh;)V"
	)
	public class464(SongTask var1) {
		super(var1);
		super.field5090 = "StartSongTask";
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1822823713"
	)
	public boolean vmethod9290() {
		Iterator var1 = class335.midiRequests.iterator();

		while (var1.hasNext()) {
			MidiRequest var2 = (MidiRequest)var1.next();
			if (var2 != null && !var2.field3817 && var2.midiPcmStream != null) {
				try {
					var2.midiPcmStream.method6982();
					var2.midiPcmStream.setPcmStreamVolume(0);
					if (var2.field3822 != null) {
						var2.midiPcmStream.setMusicTrack(var2.field3822, var2.musicTrackBoolean);
					}

					var2.field3822 = null;
					var2.field3821 = null;
					var2.musicTrackArchive = null;
					var2.field3817 = true;
				} catch (Exception var4) {
					class569.RunException_sendStackTrace((String)null, var4);
					this.method9268(var4.getMessage());
					return true;
				}
			}
		}

		super.field5089 = true;
		return true;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-338961815"
	)
	static int method9251(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lrf;Lrf;Lrf;I)V",
		garbageValue = "-1679482196"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (GameEngine.canvasWidth - 765) / 2;
		Login.loginBoxX = Login.xPadding + 202;
		WorldMapData_0.loginBoxCenter = Login.loginBoxX + 180;
		if (Login.worldSelectOpen) {
			class290.method6518(var0, var1);
		} else {
			InterfaceParent.leftTitleSprite.drawAt(Login.xPadding, 0);
			UserComparator4.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			class348.logoSprite.drawAt(Login.xPadding + 382 - class348.logoSprite.subWidth / 2, 18);
			int var4;
			if (Client.gameState == 0 || Client.gameState == 5) {
				byte var3 = 20;
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1);
				var4 = 253 - var3;
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409);
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0);
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409);
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.Login_loadingPercent * 3 + (Login.loginBoxX + 180 - 150), var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0);
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1);
			}

			String var6;
			String var8;
			String var9;
			int var10;
			char[] var11;
			int var12;
			short var23;
			int var24;
			short var25;
			if (Client.gameState == 20) {
				class173.titleboxSprite.drawAt(Login.loginBoxX + 180 - class173.titleboxSprite.subWidth / 2, 271 - class173.titleboxSprite.subHeight / 2);
				var23 = 201;
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16776960, 0);
				var24 = var23 + 15;
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16776960, 0);
				var24 += 15;
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16776960, 0);
				var24 += 15;
				var24 += 7;
				if (Login.loginIndex != 4 && Login.loginIndex != 10 && Login.loginIndex != 1) {
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var24, 16777215, 0);
					var25 = 200;
					if (!ClientPacket.clientPreferences.isUsernameHidden()) {
						var6 = Login.Login_username;
					} else {
						var8 = Login.Login_username;
						var10 = var8.length();
						var11 = new char[var10];

						for (var12 = 0; var12 < var10; ++var12) {
							var11[var12] = '*';
						}

						var9 = new String(var11);
						var6 = var9;
					}

					for (var6 = var6; var0.stringWidth(var6) > var25; var6 = var6.substring(0, var6.length() - 1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var6), Login.loginBoxX + 180 - 70, var24, 16777215, 0);
					var24 += 15;
					var8 = Login.Login_password;
					var10 = var8.length();
					var11 = new char[var10];

					for (var12 = 0; var12 < var10; ++var12) {
						var11[var12] = '*';
					}

					var9 = new String(var11);

					for (var9 = var9; var0.stringWidth(var9) > var25; var9 = var9.substring(1)) {
					}

					var0.draw("Password: " + var9, Login.loginBoxX + 180 - 108, var24, 16777215, 0);
					var24 += 15;
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11 || Client.gameState == 50) {
				class173.titleboxSprite.drawAt(Login.loginBoxX, 171);
				short var14;
				if (Login.loginIndex == 0) {
					var23 = 251;
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var23, 16776960, 0);
					var24 = var23 + 30;
					var4 = Login.loginBoxX + 180 - 80;
					var14 = 291;
					class131.titlebuttonSprite.drawAt(var4 - 73, var14 - 20);
					var0.drawLines("New User", var4 - 73, var14 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var4 = Login.loginBoxX + 180 + 80;
					class131.titlebuttonSprite.drawAt(var4 - 73, var14 - 20);
					var0.drawLines("Existing User", var4 - 73, var14 - 20, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (Login.loginIndex == 1) {
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0);
					var23 = 236;
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16777215, 0);
					var24 = var23 + 15;
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16777215, 0);
					var24 += 15;
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16777215, 0);
					var24 += 15;
					var4 = Login.loginBoxX + 180 - 80;
					var14 = 321;
					class131.titlebuttonSprite.drawAt(var4 - 73, var14 - 20);
					var0.drawCentered("Continue", var4, var14 + 5, 16777215, 0);
					var4 = Login.loginBoxX + 180 + 80;
					class131.titlebuttonSprite.drawAt(var4 - 73, var14 - 20);
					var0.drawCentered("Cancel", var4, var14 + 5, 16777215, 0);
				} else if (Login.loginIndex == 2) {
					var23 = 201;
					var0.drawCentered(Login.Login_response1, WorldMapData_0.loginBoxCenter, var23, 16776960, 0);
					var24 = var23 + 15;
					var0.drawCentered(Login.Login_response2, WorldMapData_0.loginBoxCenter, var24, 16776960, 0);
					var24 += 15;
					var0.drawCentered(Login.Login_response3, WorldMapData_0.loginBoxCenter, var24, 16776960, 0);
					var24 += 15;
					var24 += 7;
					var0.draw("Login: ", WorldMapData_0.loginBoxCenter - 110, var24, 16777215, 0);
					var25 = 200;
					if (!ClientPacket.clientPreferences.isUsernameHidden()) {
						var6 = Login.Login_username;
					} else {
						var8 = Login.Login_username;
						var10 = var8.length();
						var11 = new char[var10];

						for (var12 = 0; var12 < var10; ++var12) {
							var11[var12] = '*';
						}

						var9 = new String(var11);
						var6 = var9;
					}

					for (var6 = var6; var0.stringWidth(var6) > var25; var6 = var6.substring(1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var6) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? AbstractWorldMapIcon.colorStartTag(16776960) + "|" : ""), WorldMapData_0.loginBoxCenter - 70, var24, 16777215, 0);
					var24 += 15;
					var8 = Login.Login_password;
					var10 = var8.length();
					var11 = new char[var10];

					for (var12 = 0; var12 < var10; ++var12) {
						var11[var12] = '*';
					}

					var9 = new String(var11);

					for (var9 = var9; var0.stringWidth(var9) > var25; var9 = var9.substring(1)) {
					}

					var0.draw("Password: " + var9 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? AbstractWorldMapIcon.colorStartTag(16776960) + "|" : ""), WorldMapData_0.loginBoxCenter - 108, var24, 16777215, 0);
					var24 += 15;
					var23 = 277;
					var10 = WorldMapData_0.loginBoxCenter + -117;
					IndexedSprite var26 = class273.method6000(Client.Login_isUsernameRemembered, Login.field758);
					var26.drawAt(var10, var23);
					var10 = var10 + var26.subWidth + 5;
					var1.draw("Remember username", var10, var23 + 13, 16776960, 0);
					var10 = WorldMapData_0.loginBoxCenter + 24;
					var26 = class273.method6000(ClientPacket.clientPreferences.isUsernameHidden(), Login.field732);
					var26.drawAt(var10, var23);
					var10 = var10 + var26.subWidth + 5;
					var1.draw("Hide username", var10, var23 + 13, 16776960, 0);
					var24 = var23 + 15;
					var12 = WorldMapData_0.loginBoxCenter - 80;
					short var13 = 321;
					class131.titlebuttonSprite.drawAt(var12 - 73, var13 - 20);
					var0.drawCentered("Login", var12, var13 + 5, 16777215, 0);
					var12 = WorldMapData_0.loginBoxCenter + 80;
					class131.titlebuttonSprite.drawAt(var12 - 73, var13 - 20);
					var0.drawCentered("Cancel", var12, var13 + 5, 16777215, 0);
					var23 = 357;
					switch(Login.field741) {
					case 2:
						WorldMapRegion.field3196 = "Having trouble logging in?";
						break;
					default:
						WorldMapRegion.field3196 = "Can't login? Click here.";
					}

					TaskHandler.field2419 = new Bounds(WorldMapData_0.loginBoxCenter, var23, var1.stringWidth(WorldMapRegion.field3196), 11);
					LoginState.field304 = new Bounds(WorldMapData_0.loginBoxCenter, var23, var1.stringWidth("Still having trouble logging in?"), 11);
					var1.drawCentered(WorldMapRegion.field3196, WorldMapData_0.loginBoxCenter, var23, 16777215, 0);
				} else if (Login.loginIndex == 3) {
					var23 = 201;
					var0.drawCentered("Incorrect username or password.", Login.loginBoxX + 180, var23, 16776960, 0);
					var24 = var23 + 20;
					var1.drawCentered("If you have upgraded to a Jagex Account, you", Login.loginBoxX + 180, var24, 16776960, 0);
					var24 += 20;
					var1.drawCentered("need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", Login.loginBoxX + 180, var24, 16776960, 0);
					var24 += 15;
					var4 = Login.loginBoxX + 180;
					var14 = 276;
					class131.titlebuttonSprite.drawAt(var4 - 73, var14 - 20);
					var2.drawCentered("Try again", var4, var14 + 5, 16777215, 0);
					var4 = Login.loginBoxX + 180;
					var14 = 326;
					class131.titlebuttonSprite.drawAt(var4 - 73, var14 - 20);
					var2.drawCentered("Forgotten password?", var4, var14 + 5, 16777215, 0);
				} else {
					String var5;
					if (Login.loginIndex == 4) {
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0);
						var23 = 236;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16777215, 0);
						var24 = var23 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16777215, 0);
						var24 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16777215, 0);
						var24 += 15;
						var5 = "PIN: ";
						String var7 = class82.otp;
						int var19 = var7.length();
						char[] var20 = new char[var19];

						int var21;
						for (var21 = 0; var21 < var19; ++var21) {
							var20[var21] = '*';
						}

						var8 = new String(var20);
						var0.draw(var5 + var8 + (Client.cycle % 40 < 20 ? AbstractWorldMapIcon.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var24, 16777215, 0);
						var24 -= 8;
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var24, 16776960, 0);
						var24 += 15;
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var24, 16776960, 0);
						int var17 = 180 + Login.loginBoxX - 9 + var0.stringWidth("for 30 days: ") + 15;
						var19 = var24 - var0.ascent;
						IndexedSprite var33;
						if (Login.rememberUsername) {
							var33 = class82.options_buttons_2Sprite;
						} else {
							var33 = class164.options_buttons_0Sprite;
						}

						var33.drawAt(var17, var19);
						var24 += 15;
						var21 = Login.loginBoxX + 180 - 80;
						short var27 = 321;
						class131.titlebuttonSprite.drawAt(var21 - 73, var27 - 20);
						var0.drawCentered("Continue", var21, var27 + 5, 16777215, 0);
						var21 = Login.loginBoxX + 180 + 80;
						class131.titlebuttonSprite.drawAt(var21 - 73, var27 - 20);
						var0.drawCentered("Cancel", var21, var27 + 5, 16777215, 0);
						var1.drawCentered("Can't login? Click here.", Login.loginBoxX + 180, var27 + 36, 16777215, 0);
					} else {
						int var16;
						short var29;
						if (Login.loginIndex == 5) {
							var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0);
							var23 = 221;
							var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16776960, 0);
							var24 = var23 + 15;
							var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16776960, 0);
							var24 += 15;
							var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16776960, 0);
							var24 += 15;
							var24 += 14;
							var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var24, 16777215, 0);
							var25 = 174;
							if (!ClientPacket.clientPreferences.isUsernameHidden()) {
								var6 = Login.Login_username;
							} else {
								var8 = Login.Login_username;
								var10 = var8.length();
								var11 = new char[var10];

								for (var12 = 0; var12 < var10; ++var12) {
									var11[var12] = '*';
								}

								var9 = new String(var11);
								var6 = var9;
							}

							for (var6 = var6; var0.stringWidth(var6) > var25; var6 = var6.substring(1)) {
							}

							var0.draw(AbstractFont.escapeBrackets(var6) + (Client.cycle % 40 < 20 ? AbstractWorldMapIcon.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var24, 16777215, 0);
							var24 += 15;
							var16 = Login.loginBoxX + 180 - 80;
							var29 = 321;
							class131.titlebuttonSprite.drawAt(var16 - 73, var29 - 20);
							var0.drawCentered("Recover", var16, var29 + 5, 16777215, 0);
							var16 = Login.loginBoxX + 180 + 80;
							class131.titlebuttonSprite.drawAt(var16 - 73, var29 - 20);
							var0.drawCentered("Back", var16, var29 + 5, 16777215, 0);
							var29 = 356;
							var1.drawCentered("Still having trouble logging in?", WorldMapData_0.loginBoxCenter, var29, 268435455, 0);
						} else if (Login.loginIndex == 6) {
							var23 = 201;
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16776960, 0);
							var24 = var23 + 15;
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16776960, 0);
							var24 += 15;
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16776960, 0);
							var24 += 15;
							var4 = Login.loginBoxX + 180;
							var14 = 321;
							class131.titlebuttonSprite.drawAt(var4 - 73, var14 - 20);
							var0.drawCentered("Back", var4, var14 + 5, 16777215, 0);
						} else if (Login.loginIndex == 7) {
							if (class435.field4926 && !Client.onMobile) {
								var23 = 201;
								var0.drawCentered(Login.Login_response1, WorldMapData_0.loginBoxCenter, var23, 16776960, 0);
								var24 = var23 + 15;
								var0.drawCentered(Login.Login_response2, WorldMapData_0.loginBoxCenter, var24, 16776960, 0);
								var24 += 15;
								var0.drawCentered(Login.Login_response3, WorldMapData_0.loginBoxCenter, var24, 16776960, 0);
								var4 = WorldMapData_0.loginBoxCenter - 150;
								var24 += 10;

								int var28;
								for (var28 = 0; var28 < 8; ++var28) {
									class131.titlebuttonSprite.method11296(var4, var24, 30, 40);
									boolean var18 = var28 == Login.field744 & Client.cycle % 40 < 20;
									var0.draw((Login.field757[var28] == null ? "" : Login.field757[var28]) + (var18 ? AbstractWorldMapIcon.colorStartTag(16776960) + "|" : ""), var4 + 10, var24 + 27, 16777215, 0);
									if (var28 != 1 && var28 != 3) {
										var4 += 35;
									} else {
										var4 += 50;
										var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var24 + 27, 16777215, 0);
									}
								}

								var28 = WorldMapData_0.loginBoxCenter - 80;
								short var30 = 321;
								class131.titlebuttonSprite.drawAt(var28 - 73, var30 - 20);
								var0.drawCentered("Submit", var28, var30 + 5, 16777215, 0);
								var28 = WorldMapData_0.loginBoxCenter + 80;
								class131.titlebuttonSprite.drawAt(var28 - 73, var30 - 20);
								var0.drawCentered("Cancel", var28, var30 + 5, 16777215, 0);
							} else {
								var23 = 216;
								var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var23, 16776960, 0);
								var24 = var23 + 15;
								var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var24, 16776960, 0);
								var24 += 15;
								var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var24, 16776960, 0);
								var24 += 15;
								var4 = Login.loginBoxX + 180 - 80;
								var14 = 321;
								class131.titlebuttonSprite.drawAt(var4 - 73, var14 - 20);
								var0.drawCentered("Set Date of Birth", var4, var14 + 5, 16777215, 0);
								var4 = Login.loginBoxX + 180 + 80;
								class131.titlebuttonSprite.drawAt(var4 - 73, var14 - 20);
								var0.drawCentered("Back", var4, var14 + 5, 16777215, 0);
							}
						} else if (Login.loginIndex == 8) {
							var23 = 216;
							var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var23, 16776960, 0);
							var24 = var23 + 15;
							var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var24, 16776960, 0);
							var24 += 15;
							var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var24, 16776960, 0);
							var24 += 15;
							var4 = Login.loginBoxX + 180 - 80;
							var14 = 321;
							class131.titlebuttonSprite.drawAt(var4 - 73, var14 - 20);
							var0.drawCentered("Privacy Policy", var4, var14 + 5, 16777215, 0);
							var4 = Login.loginBoxX + 180 + 80;
							class131.titlebuttonSprite.drawAt(var4 - 73, var14 - 20);
							var0.drawCentered("Back", var4, var14 + 5, 16777215, 0);
						} else if (Login.loginIndex == 9) {
							var23 = 221;
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16776960, 0);
							var24 = var23 + 25;
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16776960, 0);
							var24 += 25;
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16776960, 0);
							var4 = Login.loginBoxX + 180;
							var14 = 311;
							class131.titlebuttonSprite.drawAt(var4 - 73, var14 - 20);
							var0.drawCentered("Try again", var4, var14 + 5, 16777215, 0);
						} else if (Login.loginIndex == 10) {
							var24 = Login.loginBoxX + 180;
							var25 = 209;
							var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var25, 16776960, 0);
							var4 = var25 + 20;
							Login.field747.drawAt(var24 - 109, var4);
							if (Login.displayName.isEmpty()) {
								FileSystem.field2442.drawAt(var24 - 48, var4 + 18);
							} else {
								FileSystem.field2442.drawAt(var24 - 48, var4 + 5);
								var0.drawCentered(Login.displayName, var24, var4 + 68 - 15, 16776960, 0);
							}
						} else if (Login.loginIndex == 12) {
							var24 = WorldMapData_0.loginBoxCenter;
							var25 = 216;
							var2.drawCentered("Before using this app, please read and accept our", var24, var25, 16777215, 0);
							var4 = var25 + 17;
							var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var24, var4, 16777215, 0);
							var4 += 17;
							var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var24, var4, 16777215, 0);
							var4 += 17;
							var2.drawCentered("By accepting, you agree to these documents.", var24, var4, 16777215, 0);
							var24 = WorldMapData_0.loginBoxCenter - 80;
							var25 = 311;
							class131.titlebuttonSprite.drawAt(var24 - 73, var25 - 20);
							var0.drawCentered("Accept", var24, var25 + 5, 16777215, 0);
							var24 = WorldMapData_0.loginBoxCenter + 80;
							class131.titlebuttonSprite.drawAt(var24 - 73, var25 - 20);
							var0.drawCentered("Decline", var24, var25 + 5, 16777215, 0);
						} else if (Login.loginIndex == 13) {
							var23 = 231;
							var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var23, 16777215, 0);
							var24 = var23 + 20;
							var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var24, 16777215, 0);
							var4 = Login.loginBoxX + 180;
							var23 = 311;
							class131.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
							var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
						} else if (Login.loginIndex == 14) {
							var23 = 201;
							String var15 = "";
							var5 = "";
							var6 = "";
							switch(Login.Login_banType) {
							case 0:
								var15 = "Your account has been involved";
								var5 = "in serious rule breaking.";
								var6 = "";
								break;
							case 1:
								var15 = "Your account has been locked due to";
								var5 = "suspicious activity.";
								var6 = "Please recover your account.";
								break;
							case 2:
								var15 = "The unpaid balance on your account needs";
								var5 = "to be resolved before you can play.";
								var6 = Strings.field4414;
								break;
							default:
								MidiRequest.Login_promptCredentials(false);
							}

							var0.drawCentered(var15, Login.loginBoxX + 180, var23, 16776960, 0);
							var24 = var23 + 20;
							var0.drawCentered(var5, Login.loginBoxX + 180, var24, 16776960, 0);
							var24 += 20;
							var0.drawCentered(var6, Login.loginBoxX + 180, var24, 16776960, 0);
							var16 = Login.loginBoxX + 180;
							var29 = 276;
							class131.titlebuttonSprite.drawAt(var16 - 73, var29 - 20);
							if (Login.Login_banType == 1) {
								var0.drawCentered("Recover Account", var16, var29 + 5, 16777215, 0);
							} else {
								var0.drawCentered("View Appeal Options", var16, var29 + 5, 16777215, 0);
							}

							var16 = Login.loginBoxX + 180;
							var29 = 326;
							class131.titlebuttonSprite.drawAt(var16 - 73, var29 - 20);
							var0.drawCentered("Back", var16, var29 + 5, 16777215, 0);
						} else if (Login.loginIndex == 24) {
							var23 = 221;
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16777215, 0);
							var24 = var23 + 15;
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16777215, 0);
							var24 += 15;
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16777215, 0);
							var24 += 15;
							var4 = Login.loginBoxX + 180;
							var14 = 301;
							class131.titlebuttonSprite.drawAt(var4 - 73, var14 - 20);
							var0.drawCentered("Ok", var4, var14 + 5, 16777215, 0);
						} else if (Login.loginIndex == 32) {
							var23 = 216;
							var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var23, 16776960, 0);
							var24 = var23 + 15;
							var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var24, 16776960, 0);
							var24 += 15;
							var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var24, 16776960, 0);
							var24 += 15;
							var4 = Login.loginBoxX + 180 - 80;
							var14 = 321;
							class131.titlebuttonSprite.drawAt(var4 - 73, var14 - 20);
							var0.drawCentered("Set Date of Birth", var4, var14 + 5, 16777215, 0);
							var4 = Login.loginBoxX + 180 + 80;
							class131.titlebuttonSprite.drawAt(var4 - 73, var14 - 20);
							var0.drawCentered("Back", var4, var14 + 5, 16777215, 0);
						} else if (Login.loginIndex == 33) {
							var23 = 201;
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16776960, 0);
							var24 = var23 + 20;
							var1.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16776960, 0);
							var24 += 20;
							var1.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16776960, 0);
							var24 += 15;
							var4 = Login.loginBoxX + 180;
							var14 = 276;
							class131.titlebuttonSprite.drawAt(var4 - 73, var14 - 20);
							var2.drawCentered("Download Launcher", var4, var14 + 5, 16777215, 0);
							var4 = Login.loginBoxX + 180;
							var14 = 326;
							class131.titlebuttonSprite.drawAt(var4 - 73, var14 - 20);
							var2.drawCentered("Back", var4, var14 + 5, 16777215, 0);
						} else if (Login.loginIndex == 34) {
							var23 = 201;
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16776960, 0);
							var24 = var23 + 20;
							var1.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16776960, 0);
							var24 += 20;
							var1.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16776960, 0);
							var4 = Login.loginBoxX + 180;
							var14 = 276;
							class131.titlebuttonSprite.drawAt(var4 - 73, var14 - 20);
							var6 = class6.World_request != null ? "Loading..." : "Switch World";
							var2.drawCentered(var6, var4, var14 + 5, 16777215, 0);
							var4 = Login.loginBoxX + 180;
							var14 = 326;
							class131.titlebuttonSprite.drawAt(var4 - 73, var14 - 20);
							var2.drawCentered("Back", var4, var14 + 5, 16777215, 0);
						}
					}
				}
			}

			if (Client.gameState >= 10) {
				int[] var22 = new int[4];
				Rasterizer2D.Rasterizer2D_getClipArray(var22);
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, GameEngine.canvasHeight);
				class584.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle);
				class584.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle);
				Rasterizer2D.Rasterizer2D_setClipArray(var22);
			}

			WorldMapSection1.title_muteSprite[ClientPacket.clientPreferences.isTitleMusicDisabled() ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463);
			if (Client.gameState > 5 && class28.clientLanguage == Language.Language_EN) {
				if (HttpMethod.field43 != null) {
					var24 = Login.xPadding + 5;
					var25 = 463;
					byte var32 = 100;
					byte var31 = 35;
					HttpMethod.field43.drawAt(var24, var25);
					var0.drawCentered("World" + " " + Client.worldId, var32 / 2 + var24, var31 / 2 + var25 - 2, 16777215, 0);
					if (class6.World_request != null) {
						var1.drawCentered("Loading...", var32 / 2 + var24, var31 / 2 + var25 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var32 / 2 + var24, var31 / 2 + var25 + 12, 16777215, 0);
					}
				} else {
					HttpMethod.field43 = class404.SpriteBuffer_getIndexedSpriteByName(GrandExchangeOfferAgeComparator.archive8, "sl_button", "");
				}
			}

		}
	}

	@ObfuscatedName("ox")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "367865029"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (class187.friendsChat != null) {
			PacketBufferNode var1 = class139.getPacketBufferNode(ClientPacket.CLAN_KICKUSER, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(FriendsChat.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}
