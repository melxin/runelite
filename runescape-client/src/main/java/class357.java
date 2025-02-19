import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ny")
public class class357 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lrf;Lrf;Lrf;I)V",
		garbageValue = "-847537607"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (GameEngine.canvasWidth - 765) / 2;
		Login.loginBoxX = Login.xPadding + 202;
		class73.loginBoxCenter = Login.loginBoxX + 180;
		byte var3;
		int var4;
		int var9;
		int var11;
		boolean var15;
		int var17;
		int var26;
		int var27;
		int var34;
		int var44;
		int var45;
		if (Login.worldSelectOpen) {
			if (StructComposition.worldSelectBackSprites == null) {
				StructComposition.worldSelectBackSprites = LoginType.method9950(PendingSpawn.archive8, "sl_back", "");
			}

			if (NPCComposition.worldSelectFlagSprites == null) {
				NPCComposition.worldSelectFlagSprites = class282.getFont(PendingSpawn.archive8, "sl_flags", "");
			}

			if (class342.worldSelectArrows == null) {
				class342.worldSelectArrows = class282.getFont(PendingSpawn.archive8, "sl_arrows", "");
			}

			if (class72.worldSelectStars == null) {
				class72.worldSelectStars = class282.getFont(PendingSpawn.archive8, "sl_stars", "");
			}

			if (class109.worldSelectLeftSprite == null) {
				class109.worldSelectLeftSprite = ClanChannel.SpriteBuffer_getIndexedSpriteByName(PendingSpawn.archive8, "leftarrow", "");
			}

			if (WorldEntityCoord.worldSelectRightSprite == null) {
				WorldEntityCoord.worldSelectRightSprite = ClanChannel.SpriteBuffer_getIndexedSpriteByName(PendingSpawn.archive8, "rightarrow", "");
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0);
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624);
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513);
			var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1);
			if (class72.worldSelectStars != null) {
				class72.worldSelectStars[1].drawAt(Login.xPadding + 140, 1);
				var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1);
				class72.worldSelectStars[0].drawAt(Login.xPadding + 140, 12);
				var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1);
			}

			if (class342.worldSelectArrows != null) {
				var34 = Login.xPadding + 280;
				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) {
					class342.worldSelectArrows[2].drawAt(var34, 4);
				} else {
					class342.worldSelectArrows[0].drawAt(var34, 4);
				}

				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) {
					class342.worldSelectArrows[3].drawAt(var34 + 15, 4);
				} else {
					class342.worldSelectArrows[1].drawAt(var34 + 15, 4);
				}

				var0.draw("World", var34 + 32, 17, 16777215, -1);
				var4 = Login.xPadding + 390;
				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) {
					class342.worldSelectArrows[2].drawAt(var4, 4);
				} else {
					class342.worldSelectArrows[0].drawAt(var4, 4);
				}

				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) {
					class342.worldSelectArrows[3].drawAt(var4 + 15, 4);
				} else {
					class342.worldSelectArrows[1].drawAt(var4 + 15, 4);
				}

				var0.draw("Players", var4 + 32, 17, 16777215, -1);
				var44 = Login.xPadding + 500;
				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) {
					class342.worldSelectArrows[2].drawAt(var44, 4);
				} else {
					class342.worldSelectArrows[0].drawAt(var44, 4);
				}

				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) {
					class342.worldSelectArrows[3].drawAt(var44 + 15, 4);
				} else {
					class342.worldSelectArrows[1].drawAt(var44 + 15, 4);
				}

				var0.draw("Location", var44 + 32, 17, 16777215, -1);
				var27 = Login.xPadding + 610;
				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) {
					class342.worldSelectArrows[2].drawAt(var27, 4);
				} else {
					class342.worldSelectArrows[0].drawAt(var27, 4);
				}

				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) {
					class342.worldSelectArrows[3].drawAt(var27 + 15, 4);
				} else {
					class342.worldSelectArrows[1].drawAt(var27 + 15, 4);
				}

				var0.draw("Type", var27 + 32, 17, 16777215, -1);
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0);
			var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1);
			Login.hoveredWorldIndex = -1;
			if (StructComposition.worldSelectBackSprites != null) {
				var3 = 88;
				byte var40 = 19;
				var44 = 765 / (var3 + 1) - 1;
				var27 = 480 / (var40 + 1);

				do {
					var45 = var27;
					var26 = var44;
					if (var27 * (var44 - 1) >= World.World_count) {
						--var44;
					}

					if (var44 * (var27 - 1) >= World.World_count) {
						--var27;
					}

					if (var44 * (var27 - 1) >= World.World_count) {
						--var27;
					}
				} while(var45 != var27 || var44 != var26);

				var45 = (765 - var44 * var3) / (var44 + 1);
				if (var45 > 5) {
					var45 = 5;
				}

				var26 = (480 - var27 * var40) / (var27 + 1);
				if (var26 > 5) {
					var26 = 5;
				}

				var9 = (765 - var44 * var3 - var45 * (var44 - 1)) / 2;
				int var29 = (480 - var40 * var27 - var26 * (var27 - 1)) / 2;
				var11 = (var27 + World.World_count - 1) / var27;
				Login.worldSelectPagesCount = var11 - var44;
				if (class109.worldSelectLeftSprite != null && Login.worldSelectPage > 0) {
					class109.worldSelectLeftSprite.drawAt(8, SwapSongTask.canvasHeight / 2 - class109.worldSelectLeftSprite.subHeight / 2);
				}

				if (WorldEntityCoord.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) {
					WorldEntityCoord.worldSelectRightSprite.drawAt(GameEngine.canvasWidth - WorldEntityCoord.worldSelectRightSprite.subWidth - 8, SwapSongTask.canvasHeight / 2 - WorldEntityCoord.worldSelectRightSprite.subHeight / 2);
				}

				int var39 = var29 + 23;
				int var30 = var9 + Login.xPadding;
				int var31 = 0;
				var15 = false;
				int var41 = Login.worldSelectPage;

				for (var17 = var41 * var27; var17 < World.World_count && var41 - Login.worldSelectPage < var44; ++var17) {
					World var32 = GZipDecompressor.World_worlds[var17];
					boolean var19 = true;
					String var20 = Integer.toString(var32.population);
					if (var32.population == -1) {
						var20 = "OFF";
						var19 = false;
					} else if (var32.population > 1980) {
						var20 = "FULL";
						var19 = false;
					}

					class112 var21 = null;
					int var22 = 0;
					if (var32.isBeta()) {
						var21 = var32.isMembersOnly() ? class112.field1448 : class112.field1453;
					} else if (var32.isDeadman()) {
						var21 = var32.isMembersOnly() ? class112.field1462 : class112.field1461;
					} else if (var32.method1838()) {
						var22 = 16711680;
						var21 = var32.isMembersOnly() ? class112.field1452 : class112.field1451;
					} else if (var32.method1877()) {
						var21 = var32.isMembersOnly() ? class112.field1458 : class112.field1455;
					} else if (var32.isPvp()) {
						var21 = var32.isMembersOnly() ? class112.field1450 : class112.field1449;
					} else if (var32.method1851()) {
						var21 = var32.isMembersOnly() ? class112.field1464 : class112.field1457;
					} else if (var32.method1841()) {
						var21 = var32.isMembersOnly() ? class112.field1390 : class112.field1459;
					}

					if (var21 == null || var21.field1460 >= StructComposition.worldSelectBackSprites.length) {
						var21 = var32.isMembersOnly() ? class112.field1463 : class112.field1456;
					}

					if (MouseHandler.MouseHandler_x >= var30 && MouseHandler.MouseHandler_y >= var39 && MouseHandler.MouseHandler_x < var3 + var30 && MouseHandler.MouseHandler_y < var40 + var39 && var19) {
						Login.hoveredWorldIndex = var17;
						StructComposition.worldSelectBackSprites[var21.field1460].drawTransOverlayAt(var30, var39, 128, 16777215);
						var15 = true;
					} else {
						StructComposition.worldSelectBackSprites[var21.field1460].drawAt(var30, var39);
					}

					if (NPCComposition.worldSelectFlagSprites != null) {
						NPCComposition.worldSelectFlagSprites[(var32.isMembersOnly() ? 8 : 0) + var32.location].drawAt(var30 + 29, var39);
					}

					var0.drawCentered(Integer.toString(var32.id), var30 + 15, var40 / 2 + var39 + 5, var22, -1);
					var1.drawCentered(var20, var30 + 60, var40 / 2 + var39 + 5, 268435455, -1);
					var39 = var39 + var26 + var40;
					++var31;
					if (var31 >= var27) {
						var39 = var29 + 23;
						var30 = var30 + var3 + var45;
						var31 = 0;
						++var41;
					}
				}

				if (var15) {
					var17 = var1.stringWidth(GZipDecompressor.World_worlds[Login.hoveredWorldIndex].activity) + 6;
					int var42 = var1.ascent + 8;
					int var43 = MouseHandler.MouseHandler_y + 25;
					if (var42 + var43 > 480) {
						var43 = MouseHandler.MouseHandler_y - 25 - var42;
					}

					Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var17 / 2, var43, var17, var42, 16777120);
					Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var17 / 2, var43, var17, var42, 0);
					var1.drawCentered(GZipDecompressor.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var43 + var1.ascent + 4, 0, -1);
				}
			}

		} else {
			SoundCache.leftTitleSprite.drawAt(Login.xPadding, 0);
			class155.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			class87.logoSprite.drawAt(Login.xPadding + 382 - class87.logoSprite.subWidth / 2, 18);
			if (Client.gameState == 0 || Client.gameState == 5) {
				var3 = 20;
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1);
				var4 = 253 - var3;
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409);
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0);
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409);
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.Login_loadingPercent * 3 + (Login.loginBoxX + 180 - 150), var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0);
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1);
			}

			String var5;
			String var7;
			String var8;
			char[] var10;
			short var33;
			short var35;
			if (Client.gameState == 20) {
				Login.titleboxSprite.drawAt(Login.loginBoxX + 180 - Login.titleboxSprite.subWidth / 2, 271 - Login.titleboxSprite.subHeight / 2);
				var33 = 201;
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var33, 16776960, 0);
				var34 = var33 + 15;
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var34, 16776960, 0);
				var34 += 15;
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var34, 16776960, 0);
				var34 += 15;
				var34 += 7;
				if (Login.loginIndex != 4 && Login.loginIndex != 10) {
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var34, 16777215, 0);
					var35 = 200;

					for (var5 = class393.method7565(); var0.stringWidth(var5) > var35; var5 = var5.substring(0, var5.length() - 1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var5), Login.loginBoxX + 180 - 70, var34, 16777215, 0);
					var34 += 15;
					var7 = Login.Login_password;
					var9 = var7.length();
					var10 = new char[var9];

					for (var11 = 0; var11 < var9; ++var11) {
						var10[var11] = '*';
					}

					var8 = new String(var10);

					for (var8 = var8; var0.stringWidth(var8) > var35; var8 = var8.substring(1)) {
					}

					var0.draw("Password: " + var8, Login.loginBoxX + 180 - 108, var34, 16777215, 0);
					var34 += 15;
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11 || Client.gameState == 50) {
				Login.titleboxSprite.drawAt(Login.loginBoxX, 171);
				short var23;
				if (Login.loginIndex == 0) {
					var33 = 251;
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var33, 16776960, 0);
					var34 = var33 + 30;
					var4 = Login.loginBoxX + 180 - 80;
					var23 = 291;
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawLines("New User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var4 = Login.loginBoxX + 180 + 80;
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawLines("Existing User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (Login.loginIndex == 1) {
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0);
					var33 = 236;
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var33, 16777215, 0);
					var34 = var33 + 15;
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var34, 16777215, 0);
					var34 += 15;
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var34, 16777215, 0);
					var34 += 15;
					var4 = Login.loginBoxX + 180 - 80;
					var23 = 321;
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawCentered("Continue", var4, var23 + 5, 16777215, 0);
					var4 = Login.loginBoxX + 180 + 80;
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawCentered("Cancel", var4, var23 + 5, 16777215, 0);
				} else {
					IndexedSprite var36;
					if (Login.loginIndex == 2) {
						var33 = 201;
						var0.drawCentered(Login.Login_response1, class73.loginBoxCenter, var33, 16776960, 0);
						var34 = var33 + 15;
						var0.drawCentered(Login.Login_response2, class73.loginBoxCenter, var34, 16776960, 0);
						var34 += 15;
						var0.drawCentered(Login.Login_response3, class73.loginBoxCenter, var34, 16776960, 0);
						var34 += 15;
						var34 += 7;
						var0.draw("Login: ", class73.loginBoxCenter - 110, var34, 16777215, 0);
						var35 = 200;

						for (var5 = class393.method7565(); var0.stringWidth(var5) > var35; var5 = var5.substring(1)) {
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? MilliClock.colorStartTag(16776960) + "|" : ""), class73.loginBoxCenter - 70, var34, 16777215, 0);
						var34 += 15;
						var7 = Login.Login_password;
						var9 = var7.length();
						var10 = new char[var9];

						for (var11 = 0; var11 < var9; ++var11) {
							var10[var11] = '*';
						}

						var8 = new String(var10);

						for (var8 = var8; var0.stringWidth(var8) > var35; var8 = var8.substring(1)) {
						}

						var0.draw("Password: " + var8 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? MilliClock.colorStartTag(16776960) + "|" : ""), class73.loginBoxCenter - 108, var34, 16777215, 0);
						var34 += 15;
						var33 = 277;
						var9 = class73.loginBoxCenter + -117;
						boolean var37 = Client.Login_isUsernameRemembered;
						boolean var12 = Login.field968;
						var36 = var37 ? (var12 ? SceneTilePaint.field2978 : class187.options_buttons_2Sprite) : (var12 ? class157.field1774 : WorldMapDecoration.options_buttons_0Sprite);
						var36.drawAt(var9, var33);
						var9 = var9 + var36.subWidth + 5;
						var1.draw("Remember username", var9, var33 + 13, 16776960, 0);
						var9 = class73.loginBoxCenter + 24;
						var15 = AbstractWorldMapIcon.clientPreferences.isUsernameHidden();
						boolean var16 = Login.field969;
						IndexedSprite var14 = var15 ? (var16 ? SceneTilePaint.field2978 : class187.options_buttons_2Sprite) : (var16 ? class157.field1774 : WorldMapDecoration.options_buttons_0Sprite);
						var14.drawAt(var9, var33);
						var9 = var9 + var14.subWidth + 5;
						var1.draw("Hide username", var9, var33 + 13, 16776960, 0);
						var34 = var33 + 15;
						var17 = class73.loginBoxCenter - 80;
						short var18 = 321;
						Login.titlebuttonSprite.drawAt(var17 - 73, var18 - 20);
						var0.drawCentered("Login", var17, var18 + 5, 16777215, 0);
						var17 = class73.loginBoxCenter + 80;
						Login.titlebuttonSprite.drawAt(var17 - 73, var18 - 20);
						var0.drawCentered("Cancel", var17, var18 + 5, 16777215, 0);
						var33 = 357;
						switch(Login.field954) {
						case 2:
							class447.field4932 = "Having trouble logging in?";
							break;
						default:
							class447.field4932 = "Can't login? Click here.";
						}

						PlayerCompositionColorTextureOverride.field1897 = new Bounds(class73.loginBoxCenter, var33, var1.stringWidth(class447.field4932), 11);
						ClientPreferences.field1325 = new Bounds(class73.loginBoxCenter, var33, var1.stringWidth("Still having trouble logging in?"), 11);
						var1.drawCentered(class447.field4932, class73.loginBoxCenter, var33, 16777215, 0);
					} else if (Login.loginIndex == 3) {
						var33 = 201;
						var0.drawCentered("Incorrect username or password.", Login.loginBoxX + 180, var33, 16776960, 0);
						var34 = var33 + 20;
						var1.drawCentered("If you have upgraded to a Jagex Account, you", Login.loginBoxX + 180, var34, 16776960, 0);
						var34 += 20;
						var1.drawCentered("need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", Login.loginBoxX + 180, var34, 16776960, 0);
						var34 += 15;
						var4 = Login.loginBoxX + 180;
						var23 = 276;
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var2.drawCentered("Try again", var4, var23 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180;
						var23 = 326;
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var2.drawCentered("Forgotten password?", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 4) {
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0);
						var33 = 236;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var33, 16777215, 0);
						var34 = var33 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var34, 16777215, 0);
						var34 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var34, 16777215, 0);
						var34 += 15;
						var5 = "PIN: ";
						var7 = Language.otp;
						var9 = var7.length();
						var10 = new char[var9];

						for (var11 = 0; var11 < var9; ++var11) {
							var10[var11] = '*';
						}

						var8 = new String(var10);
						var0.draw(var5 + var8 + (Client.cycle % 40 < 20 ? MilliClock.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var34, 16777215, 0);
						var34 -= 8;
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var34, 16776960, 0);
						var34 += 15;
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var34, 16776960, 0);
						var26 = Login.loginBoxX + 180 - 9 + var0.stringWidth("for 30 days: ") + 15;
						var9 = var34 - var0.ascent;
						if (Login.rememberUsername) {
							var36 = class187.options_buttons_2Sprite;
						} else {
							var36 = WorldMapDecoration.options_buttons_0Sprite;
						}

						var36.drawAt(var26, var9);
						var34 += 15;
						var11 = Login.loginBoxX + 180 - 80;
						short var38 = 321;
						Login.titlebuttonSprite.drawAt(var11 - 73, var38 - 20);
						var0.drawCentered("Continue", var11, var38 + 5, 16777215, 0);
						var11 = Login.loginBoxX + 180 + 80;
						Login.titlebuttonSprite.drawAt(var11 - 73, var38 - 20);
						var0.drawCentered("Cancel", var11, var38 + 5, 16777215, 0);
						var1.drawCentered("Can't login? Click here.", Login.loginBoxX + 180, var38 + 36, 16777215, 0);
					} else if (Login.loginIndex == 5) {
						var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0);
						var33 = 221;
						var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var33, 16776960, 0);
						var34 = var33 + 15;
						var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var34, 16776960, 0);
						var34 += 15;
						var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var34, 16776960, 0);
						var34 += 15;
						var34 += 14;
						var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var34, 16777215, 0);
						var35 = 174;

						for (var5 = class393.method7565(); var0.stringWidth(var5) > var35; var5 = var5.substring(1)) {
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Client.cycle % 40 < 20 ? MilliClock.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var34, 16777215, 0);
						var34 += 15;
						var27 = Login.loginBoxX + 180 - 80;
						short var25 = 321;
						Login.titlebuttonSprite.drawAt(var27 - 73, var25 - 20);
						var0.drawCentered("Recover", var27, var25 + 5, 16777215, 0);
						var27 = Login.loginBoxX + 180 + 80;
						Login.titlebuttonSprite.drawAt(var27 - 73, var25 - 20);
						var0.drawCentered("Back", var27, var25 + 5, 16777215, 0);
						var25 = 356;
						var1.drawCentered("Still having trouble logging in?", class73.loginBoxCenter, var25, 268435455, 0);
					} else if (Login.loginIndex == 6) {
						var33 = 201;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var33, 16776960, 0);
						var34 = var33 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var34, 16776960, 0);
						var34 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var34, 16776960, 0);
						var34 += 15;
						var4 = Login.loginBoxX + 180;
						var23 = 321;
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 7) {
						if (Client.field524 && !Client.onMobile) {
							var33 = 201;
							var0.drawCentered(Login.Login_response1, class73.loginBoxCenter, var33, 16776960, 0);
							var34 = var33 + 15;
							var0.drawCentered(Login.Login_response2, class73.loginBoxCenter, var34, 16776960, 0);
							var34 += 15;
							var0.drawCentered(Login.Login_response3, class73.loginBoxCenter, var34, 16776960, 0);
							var4 = class73.loginBoxCenter - 150;
							var34 += 10;

							for (var44 = 0; var44 < 8; ++var44) {
								Login.titlebuttonSprite.method10705(var4, var34, 30, 40);
								boolean var47 = var44 == Login.field940 & Client.cycle % 40 < 20;
								var0.draw((Login.field963[var44] == null ? "" : Login.field963[var44]) + (var47 ? MilliClock.colorStartTag(16776960) + "|" : ""), var4 + 10, var34 + 27, 16777215, 0);
								if (var44 != 1 && var44 != 3) {
									var4 += 35;
								} else {
									var4 += 50;
									var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var34 + 27, 16777215, 0);
								}
							}

							var44 = class73.loginBoxCenter - 80;
							short var48 = 321;
							Login.titlebuttonSprite.drawAt(var44 - 73, var48 - 20);
							var0.drawCentered("Submit", var44, var48 + 5, 16777215, 0);
							var44 = class73.loginBoxCenter + 80;
							Login.titlebuttonSprite.drawAt(var44 - 73, var48 - 20);
							var0.drawCentered("Cancel", var44, var48 + 5, 16777215, 0);
						} else {
							var33 = 216;
							var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var33, 16776960, 0);
							var34 = var33 + 15;
							var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var34, 16776960, 0);
							var34 += 15;
							var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var34, 16776960, 0);
							var34 += 15;
							var4 = Login.loginBoxX + 180 - 80;
							var23 = 321;
							Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
							var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0);
							var4 = Login.loginBoxX + 180 + 80;
							Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
							var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
						}
					} else if (Login.loginIndex == 8) {
						var33 = 216;
						var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var33, 16776960, 0);
						var34 = var33 + 15;
						var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var34, 16776960, 0);
						var34 += 15;
						var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var34, 16776960, 0);
						var34 += 15;
						var4 = Login.loginBoxX + 180 - 80;
						var23 = 321;
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Privacy Policy", var4, var23 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180 + 80;
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 9) {
						var33 = 221;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var33, 16776960, 0);
						var34 = var33 + 25;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var34, 16776960, 0);
						var34 += 25;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var34, 16776960, 0);
						var4 = Login.loginBoxX + 180;
						var23 = 311;
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Try again", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 10) {
						var34 = Login.loginBoxX + 180;
						var35 = 209;
						var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var35, 16776960, 0);
						var4 = var35 + 20;
						Login.field946.drawAt(var34 - 109, var4);
						if (Login.displayName.isEmpty()) {
							Login.field947.drawAt(var34 - 48, var4 + 18);
						} else {
							Login.field947.drawAt(var34 - 48, var4 + 5);
							var0.drawCentered(Login.displayName, var34, var4 + 68 - 15, 16776960, 0);
						}
					} else if (Login.loginIndex == 12) {
						var34 = class73.loginBoxCenter;
						var35 = 216;
						var2.drawCentered("Before using this app, please read and accept our", var34, var35, 16777215, 0);
						var4 = var35 + 17;
						var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var34, var4, 16777215, 0);
						var4 += 17;
						var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var34, var4, 16777215, 0);
						var4 += 17;
						var2.drawCentered("By accepting, you agree to these documents.", var34, var4, 16777215, 0);
						var34 = class73.loginBoxCenter - 80;
						var35 = 311;
						Login.titlebuttonSprite.drawAt(var34 - 73, var35 - 20);
						var0.drawCentered("Accept", var34, var35 + 5, 16777215, 0);
						var34 = class73.loginBoxCenter + 80;
						Login.titlebuttonSprite.drawAt(var34 - 73, var35 - 20);
						var0.drawCentered("Decline", var34, var35 + 5, 16777215, 0);
					} else if (Login.loginIndex == 13) {
						var33 = 231;
						var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var33, 16777215, 0);
						var34 = var33 + 20;
						var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var34, 16777215, 0);
						var4 = Login.loginBoxX + 180;
						var33 = 311;
						Login.titlebuttonSprite.drawAt(var4 - 73, var33 - 20);
						var0.drawCentered("Back", var4, var33 + 5, 16777215, 0);
					} else {
						String var6;
						if (Login.loginIndex == 14) {
							var33 = 201;
							String var24 = "";
							var5 = "";
							var6 = "";
							switch(Login.Login_banType) {
							case 0:
								var24 = "Your account has been involved";
								var5 = "in serious rule breaking.";
								var6 = "";
								break;
							case 1:
								var24 = "Your account has been locked due to";
								var5 = "suspicious activity.";
								var6 = "Please recover your account.";
								break;
							case 2:
								var24 = "The unpaid balance on your account needs";
								var5 = "to be resolved before you can play.";
								var6 = Strings.field4367;
								break;
							default:
								class280.Login_promptCredentials(false);
							}

							var0.drawCentered(var24, Login.loginBoxX + 180, var33, 16776960, 0);
							var34 = var33 + 20;
							var0.drawCentered(var5, Login.loginBoxX + 180, var34, 16776960, 0);
							var34 += 20;
							var0.drawCentered(var6, Login.loginBoxX + 180, var34, 16776960, 0);
							var45 = Login.loginBoxX + 180;
							short var46 = 276;
							Login.titlebuttonSprite.drawAt(var45 - 73, var46 - 20);
							if (Login.Login_banType == 1) {
								var0.drawCentered("Recover Account", var45, var46 + 5, 16777215, 0);
							} else {
								var0.drawCentered("View Appeal Options", var45, var46 + 5, 16777215, 0);
							}

							var45 = Login.loginBoxX + 180;
							var46 = 326;
							Login.titlebuttonSprite.drawAt(var45 - 73, var46 - 20);
							var0.drawCentered("Back", var45, var46 + 5, 16777215, 0);
						} else if (Login.loginIndex == 24) {
							var33 = 221;
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var33, 16777215, 0);
							var34 = var33 + 15;
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var34, 16777215, 0);
							var34 += 15;
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var34, 16777215, 0);
							var34 += 15;
							var4 = Login.loginBoxX + 180;
							var23 = 301;
							Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
							var0.drawCentered("Ok", var4, var23 + 5, 16777215, 0);
						} else if (Login.loginIndex == 32) {
							var33 = 216;
							var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var33, 16776960, 0);
							var34 = var33 + 15;
							var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var34, 16776960, 0);
							var34 += 15;
							var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var34, 16776960, 0);
							var34 += 15;
							var4 = Login.loginBoxX + 180 - 80;
							var23 = 321;
							Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
							var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0);
							var4 = Login.loginBoxX + 180 + 80;
							Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
							var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
						} else if (Login.loginIndex == 33) {
							var33 = 201;
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var33, 16776960, 0);
							var34 = var33 + 20;
							var1.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var34, 16776960, 0);
							var34 += 20;
							var1.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var34, 16776960, 0);
							var34 += 15;
							var4 = Login.loginBoxX + 180;
							var23 = 276;
							Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
							var2.drawCentered("Download Launcher", var4, var23 + 5, 16777215, 0);
							var4 = Login.loginBoxX + 180;
							var23 = 326;
							Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
							var2.drawCentered("Back", var4, var23 + 5, 16777215, 0);
						} else if (Login.loginIndex == 34) {
							var33 = 201;
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var33, 16776960, 0);
							var34 = var33 + 20;
							var1.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var34, 16776960, 0);
							var34 += 20;
							var1.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var34, 16776960, 0);
							var4 = Login.loginBoxX + 180;
							var23 = 276;
							Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
							var6 = World.World_request != null ? "Loading..." : "Switch World";
							var2.drawCentered(var6, var4, var23 + 5, 16777215, 0);
							var4 = Login.loginBoxX + 180;
							var23 = 326;
							Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
							var2.drawCentered("Back", var4, var23 + 5, 16777215, 0);
						}
					}
				}
			}

			if (Client.gameState >= 10) {
				int[] var28 = new int[4];
				Rasterizer2D.Rasterizer2D_getClipArray(var28);
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, SwapSongTask.canvasHeight);
				FloorDecoration.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle);
				FloorDecoration.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle);
				Rasterizer2D.Rasterizer2D_setClipArray(var28);
			}

			Login.title_muteSprite[AbstractWorldMapIcon.clientPreferences.isTitleMusicDisabled() ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463);
			if (Client.gameState > 5 && class144.clientLanguage == Language.Language_EN) {
				if (class361.field3909 != null) {
					var34 = Login.xPadding + 5;
					var35 = 463;
					byte var50 = 100;
					byte var49 = 35;
					class361.field3909.drawAt(var34, var35);
					var0.drawCentered("World" + " " + Client.worldId, var50 / 2 + var34, var49 / 2 + var35 - 2, 16777215, 0);
					if (World.World_request != null) {
						var1.drawCentered("Loading...", var50 / 2 + var34, var49 / 2 + var35 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var50 / 2 + var34, var49 / 2 + var35 + 12, 16777215, 0);
					}
				} else {
					class361.field3909 = ClanChannel.SpriteBuffer_getIndexedSpriteByName(PendingSpawn.archive8, "sl_button", "");
				}
			}

		}
	}
}
