import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cu")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
	SecureRandomCallable() {
	}

	public Object call() {
		return class386.method8197();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "63"
	)
	public static boolean method2085(int var0) {
		return (var0 >> 22 & 1) != 0;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lru;Lru;Lru;I)V",
		garbageValue = "1644773064"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (RestClientThreadFactory.canvasWidth - 765) / 2;
		Login.loginBoxX = Login.xPadding + 202;
		class133.loginBoxCenter = Login.loginBoxX + 180;
		byte var3;
		int var4;
		int var8;
		int var10;
		int var25;
		int var31;
		int var38;
		if (Login.worldSelectOpen) {
			if (class163.worldSelectBackSprites == null) {
				class163.worldSelectBackSprites = class182.method4168(class188.archive8, "sl_back", "");
			}

			if (IntProjection.worldSelectFlagSprites == null) {
				IntProjection.worldSelectFlagSprites = WorldEntity.getFont(class188.archive8, "sl_flags", "");
			}

			if (UserComparator5.worldSelectArrows == null) {
				UserComparator5.worldSelectArrows = WorldEntity.getFont(class188.archive8, "sl_arrows", "");
			}

			if (GraphicsObject.worldSelectStars == null) {
				GraphicsObject.worldSelectStars = WorldEntity.getFont(class188.archive8, "sl_stars", "");
			}

			if (ScriptEvent.worldSelectLeftSprite == null) {
				ScriptEvent.worldSelectLeftSprite = class484.SpriteBuffer_getIndexedSpriteByName(class188.archive8, "leftarrow", "");
			}

			if (PendingSpawn.worldSelectRightSprite == null) {
				PendingSpawn.worldSelectRightSprite = class484.SpriteBuffer_getIndexedSpriteByName(class188.archive8, "rightarrow", "");
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0);
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624);
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513);
			var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1);
			if (GraphicsObject.worldSelectStars != null) {
				GraphicsObject.worldSelectStars[1].drawAt(Login.xPadding + 140, 1);
				var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1);
				GraphicsObject.worldSelectStars[0].drawAt(Login.xPadding + 140, 12);
				var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1);
			}

			int var41;
			if (UserComparator5.worldSelectArrows != null) {
				var31 = Login.xPadding + 280;
				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) {
					UserComparator5.worldSelectArrows[2].drawAt(var31, 4);
				} else {
					UserComparator5.worldSelectArrows[0].drawAt(var31, 4);
				}

				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) {
					UserComparator5.worldSelectArrows[3].drawAt(var31 + 15, 4);
				} else {
					UserComparator5.worldSelectArrows[1].drawAt(var31 + 15, 4);
				}

				var0.draw("World", var31 + 32, 17, 16777215, -1);
				var4 = Login.xPadding + 390;
				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) {
					UserComparator5.worldSelectArrows[2].drawAt(var4, 4);
				} else {
					UserComparator5.worldSelectArrows[0].drawAt(var4, 4);
				}

				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) {
					UserComparator5.worldSelectArrows[3].drawAt(var4 + 15, 4);
				} else {
					UserComparator5.worldSelectArrows[1].drawAt(var4 + 15, 4);
				}

				var0.draw("Players", var4 + 32, 17, 16777215, -1);
				var38 = Login.xPadding + 500;
				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) {
					UserComparator5.worldSelectArrows[2].drawAt(var38, 4);
				} else {
					UserComparator5.worldSelectArrows[0].drawAt(var38, 4);
				}

				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) {
					UserComparator5.worldSelectArrows[3].drawAt(var38 + 15, 4);
				} else {
					UserComparator5.worldSelectArrows[1].drawAt(var38 + 15, 4);
				}

				var0.draw("Location", var38 + 32, 17, 16777215, -1);
				var41 = Login.xPadding + 610;
				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) {
					UserComparator5.worldSelectArrows[2].drawAt(var41, 4);
				} else {
					UserComparator5.worldSelectArrows[0].drawAt(var41, 4);
				}

				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) {
					UserComparator5.worldSelectArrows[3].drawAt(var41 + 15, 4);
				} else {
					UserComparator5.worldSelectArrows[1].drawAt(var41 + 15, 4);
				}

				var0.draw("Type", var41 + 32, 17, 16777215, -1);
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0);
			var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1);
			Login.hoveredWorldIndex = -1;
			if (class163.worldSelectBackSprites != null) {
				var3 = 88;
				byte var36 = 19;
				var38 = 765 / (var3 + 1) - 1;
				var41 = 480 / (var36 + 1);

				do {
					var25 = var41;
					var8 = var38;
					if (var41 * (var38 - 1) >= World.World_count) {
						--var38;
					}

					if (var38 * (var41 - 1) >= World.World_count) {
						--var41;
					}

					if (var38 * (var41 - 1) >= World.World_count) {
						--var41;
					}
				} while(var25 != var41 || var8 != var38);

				var25 = (765 - var38 * var3) / (var38 + 1);
				if (var25 > 5) {
					var25 = 5;
				}

				var8 = (480 - var36 * var41) / (var41 + 1);
				if (var8 > 5) {
					var8 = 5;
				}

				int var28 = (765 - var38 * var3 - var25 * (var38 - 1)) / 2;
				var10 = (480 - var36 * var41 - var8 * (var41 - 1)) / 2;
				int var35 = (var41 + World.World_count - 1) / var41;
				Login.worldSelectPagesCount = var35 - var38;
				if (ScriptEvent.worldSelectLeftSprite != null && Login.worldSelectPage > 0) {
					ScriptEvent.worldSelectLeftSprite.drawAt(8, GameEngine.canvasHeight / 2 - ScriptEvent.worldSelectLeftSprite.subHeight / 2);
				}

				if (PendingSpawn.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) {
					PendingSpawn.worldSelectRightSprite.drawAt(RestClientThreadFactory.canvasWidth - PendingSpawn.worldSelectRightSprite.subWidth - 8, GameEngine.canvasHeight / 2 - PendingSpawn.worldSelectRightSprite.subHeight / 2);
				}

				int var12 = var10 + 23;
				int var13 = var28 + Login.xPadding;
				int var14 = 0;
				boolean var15 = false;
				int var16 = Login.worldSelectPage;

				int var17;
				for (var17 = var41 * var16; var17 < World.World_count && var16 - Login.worldSelectPage < var38; ++var17) {
					World var18 = World.World_worlds[var17];
					boolean var19 = true;
					String var20 = Integer.toString(var18.population);
					if (var18.population == -1) {
						var20 = "OFF";
						var19 = false;
					} else if (var18.population > 1980) {
						var20 = "FULL";
						var19 = false;
					}

					class88 var21 = null;
					int var22 = 0;
					if (var18.isBeta()) {
						var21 = var18.isMembersOnly() ? class88.field1241 : class88.field1240;
					} else if (var18.isDeadman()) {
						var21 = var18.isMembersOnly() ? class88.field1249 : class88.field1248;
					} else if (var18.method1491()) {
						var22 = 16711680;
						var21 = var18.isMembersOnly() ? class88.field1239 : class88.field1238;
					} else if (var18.method1545()) {
						var21 = var18.isMembersOnly() ? class88.field1243 : class88.field1242;
					} else if (var18.isPvp()) {
						var21 = var18.isMembersOnly() ? class88.field1244 : class88.field1250;
					} else if (var18.method1494()) {
						var21 = var18.isMembersOnly() ? class88.field1245 : class88.field1236;
					} else if (var18.method1509()) {
						var21 = var18.isMembersOnly() ? class88.field1390 : class88.field1246;
					}

					if (var21 == null || var21.field1237 >= class163.worldSelectBackSprites.length) {
						var21 = var18.isMembersOnly() ? class88.field1235 : class88.field1234;
					}

					if (MouseHandler.MouseHandler_x >= var13 && MouseHandler.MouseHandler_y >= var12 && MouseHandler.MouseHandler_x < var13 + var3 && MouseHandler.MouseHandler_y < var36 + var12 && var19) {
						Login.hoveredWorldIndex = var17;
						class163.worldSelectBackSprites[var21.field1237].drawTransOverlayAt(var13, var12, 128, 16777215);
						var15 = true;
					} else {
						class163.worldSelectBackSprites[var21.field1237].drawAt(var13, var12);
					}

					if (IntProjection.worldSelectFlagSprites != null) {
						IntProjection.worldSelectFlagSprites[(var18.isMembersOnly() ? 8 : 0) + var18.location].drawAt(var13 + 29, var12);
					}

					var0.drawCentered(Integer.toString(var18.id), var13 + 15, var36 / 2 + var12 + 5, var22, -1);
					var1.drawCentered(var20, var13 + 60, var36 / 2 + var12 + 5, 268435455, -1);
					var12 = var12 + var36 + var8;
					++var14;
					if (var14 >= var41) {
						var12 = var10 + 23;
						var13 = var13 + var3 + var25;
						var14 = 0;
						++var16;
					}
				}

				if (var15) {
					var17 = var1.stringWidth(World.World_worlds[Login.hoveredWorldIndex].activity) + 6;
					int var29 = var1.ascent + 8;
					int var37 = MouseHandler.MouseHandler_y + 25;
					if (var37 + var29 > 480) {
						var37 = MouseHandler.MouseHandler_y - 25 - var29;
					}

					Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var17 / 2, var37, var17, var29, 16777120);
					Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var17 / 2, var37, var17, var29, 0);
					var1.drawCentered(World.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var37 + var1.ascent + 4, 0, -1);
				}
			}

		} else {
			class372.leftTitleSprite.drawAt(Login.xPadding, 0);
			class524.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			class205.logoSprite.drawAt(Login.xPadding + 382 - class205.logoSprite.subWidth / 2, 18);
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
			String var6;
			String var7;
			short var30;
			short var32;
			if (Client.gameState == 20) {
				Login.titleboxSprite.drawAt(Login.loginBoxX + 180 - Login.titleboxSprite.subWidth / 2, 271 - Login.titleboxSprite.subHeight / 2);
				var30 = 201;
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var30, 16776960, 0);
				var31 = var30 + 15;
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var31, 16776960, 0);
				var31 += 15;
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var31, 16776960, 0);
				var31 += 15;
				var31 += 7;
				if (Login.loginIndex != 4 && Login.loginIndex != 10 && Login.loginIndex != 1) {
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var31, 16777215, 0);
					var32 = 200;
					var5 = FriendSystem.clientPreferences.isUsernameHidden() ? JagNetThread.method8471(Login.Login_username) : Login.Login_username;

					for (var6 = var5; var0.stringWidth(var6) > var32; var6 = var6.substring(0, var6.length() - 1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var6), Login.loginBoxX + 180 - 70, var31, 16777215, 0);
					var31 += 15;

					for (var7 = JagNetThread.method8471(Login.Login_password); var0.stringWidth(var7) > var32; var7 = var7.substring(1)) {
					}

					var0.draw("Password: " + var7, Login.loginBoxX + 180 - 108, var31, 16777215, 0);
					var31 += 15;
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11 || Client.gameState == 50) {
				Login.titleboxSprite.drawAt(Login.loginBoxX, 171);
				short var23;
				if (Login.loginIndex == 0) {
					var30 = 251;
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var30, 16776960, 0);
					var31 = var30 + 30;
					var4 = Login.loginBoxX + 180 - 80;
					var23 = 291;
					Tile.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawLines("New User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var4 = Login.loginBoxX + 180 + 80;
					Tile.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawLines("Existing User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (Login.loginIndex == 1) {
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0);
					var30 = 236;
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var30, 16777215, 0);
					var31 = var30 + 15;
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var31, 16777215, 0);
					var31 += 15;
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var31, 16777215, 0);
					var31 += 15;
					var4 = Login.loginBoxX + 180 - 80;
					var23 = 321;
					Tile.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawCentered("Continue", var4, var23 + 5, 16777215, 0);
					var4 = Login.loginBoxX + 180 + 80;
					Tile.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawCentered("Cancel", var4, var23 + 5, 16777215, 0);
				} else if (Login.loginIndex == 2) {
					var30 = 201;
					var0.drawCentered(Login.Login_response1, class133.loginBoxCenter, var30, 16776960, 0);
					var31 = var30 + 15;
					var0.drawCentered(Login.Login_response2, class133.loginBoxCenter, var31, 16776960, 0);
					var31 += 15;
					var0.drawCentered(Login.Login_response3, class133.loginBoxCenter, var31, 16776960, 0);
					var31 += 15;
					var31 += 7;
					var0.draw("Login: ", class133.loginBoxCenter - 110, var31, 16777215, 0);
					var32 = 200;
					var5 = FriendSystem.clientPreferences.isUsernameHidden() ? JagNetThread.method8471(Login.Login_username) : Login.Login_username;

					for (var6 = var5; var0.stringWidth(var6) > var32; var6 = var6.substring(1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var6) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? ObjectSound.colorStartTag(16776960) + "|" : ""), class133.loginBoxCenter - 70, var31, 16777215, 0);
					var31 += 15;

					for (var7 = JagNetThread.method8471(Login.Login_password); var0.stringWidth(var7) > var32; var7 = var7.substring(1)) {
					}

					var0.draw("Password: " + var7 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? ObjectSound.colorStartTag(16776960) + "|" : ""), class133.loginBoxCenter - 108, var31, 16777215, 0);
					var31 += 15;
					var30 = 277;
					var8 = class133.loginBoxCenter + -117;
					IndexedSprite var9 = ScriptFrame.method762(Client.Login_isUsernameRemembered, Login.field710);
					var9.drawAt(var8, var30);
					var8 = var8 + var9.subWidth + 5;
					var1.draw("Remember username", var8, var30 + 13, 16776960, 0);
					var8 = class133.loginBoxCenter + 24;
					var9 = ScriptFrame.method762(FriendSystem.clientPreferences.isUsernameHidden(), Login.field729);
					var9.drawAt(var8, var30);
					var8 = var8 + var9.subWidth + 5;
					var1.draw("Hide username", var8, var30 + 13, 16776960, 0);
					var31 = var30 + 15;
					var10 = class133.loginBoxCenter - 80;
					short var11 = 321;
					Tile.titlebuttonSprite.drawAt(var10 - 73, var11 - 20);
					var0.drawCentered("Login", var10, var11 + 5, 16777215, 0);
					var10 = class133.loginBoxCenter + 80;
					Tile.titlebuttonSprite.drawAt(var10 - 73, var11 - 20);
					var0.drawCentered("Cancel", var10, var11 + 5, 16777215, 0);
					var30 = 357;
					switch(Login.field713) {
					case 2:
						class57.field819 = "Having trouble logging in?";
						break;
					default:
						class57.field819 = "Can't login? Click here.";
					}

					Login.field714 = new Bounds(class133.loginBoxCenter, var30, var1.stringWidth(class57.field819), 11);
					LoginScreenAnimation.field1100 = new Bounds(class133.loginBoxCenter, var30, var1.stringWidth("Still having trouble logging in?"), 11);
					var1.drawCentered(class57.field819, class133.loginBoxCenter, var30, 16777215, 0);
				} else if (Login.loginIndex == 3) {
					var30 = 201;
					var0.drawCentered("Incorrect username or password.", Login.loginBoxX + 180, var30, 16776960, 0);
					var31 = var30 + 20;
					var1.drawCentered("If you have upgraded to a Jagex Account, you", Login.loginBoxX + 180, var31, 16776960, 0);
					var31 += 20;
					var1.drawCentered("need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", Login.loginBoxX + 180, var31, 16776960, 0);
					var31 += 15;
					var4 = Login.loginBoxX + 180;
					var23 = 276;
					Tile.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var2.drawCentered("Try again", var4, var23 + 5, 16777215, 0);
					var4 = Login.loginBoxX + 180;
					var23 = 326;
					Tile.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var2.drawCentered("Forgotten password?", var4, var23 + 5, 16777215, 0);
				} else {
					short var34;
					if (Login.loginIndex == 4) {
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0);
						var30 = 236;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var30, 16777215, 0);
						var31 = var30 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var31, 16777215, 0);
						var31 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var31, 16777215, 0);
						var31 += 15;
						var0.draw("PIN: " + JagNetThread.method8471(SoundSystem.otp) + (Client.cycle % 40 < 20 ? ObjectSound.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var31, 16777215, 0);
						var31 -= 8;
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var31, 16776960, 0);
						var31 += 15;
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var31, 16776960, 0);
						var4 = Login.loginBoxX + 180 - 9 + var0.stringWidth("for 30 days: ") + 15;
						var38 = var31 - var0.ascent;
						IndexedSprite var33;
						if (Login.rememberUsername) {
							var33 = AddRequestTask.options_buttons_2Sprite;
						} else {
							var33 = Interpreter.options_buttons_0Sprite;
						}

						var33.drawAt(var4, var38);
						var31 += 15;
						var25 = Login.loginBoxX + 180 - 80;
						var34 = 321;
						Tile.titlebuttonSprite.drawAt(var25 - 73, var34 - 20);
						var0.drawCentered("Continue", var25, var34 + 5, 16777215, 0);
						var25 = Login.loginBoxX + 180 + 80;
						Tile.titlebuttonSprite.drawAt(var25 - 73, var34 - 20);
						var0.drawCentered("Cancel", var25, var34 + 5, 16777215, 0);
						var1.drawCentered("Can't login? Click here.", Login.loginBoxX + 180, var34 + 36, 16777215, 0);
					} else if (Login.loginIndex == 5) {
						var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0);
						var30 = 221;
						var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var30, 16776960, 0);
						var31 = var30 + 15;
						var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var31, 16776960, 0);
						var31 += 15;
						var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var31, 16776960, 0);
						var31 += 15;
						var31 += 14;
						var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var31, 16777215, 0);
						var32 = 174;
						var5 = FriendSystem.clientPreferences.isUsernameHidden() ? JagNetThread.method8471(Login.Login_username) : Login.Login_username;

						for (var6 = var5; var0.stringWidth(var6) > var32; var6 = var6.substring(1)) {
						}

						var0.draw(AbstractFont.escapeBrackets(var6) + (Client.cycle % 40 < 20 ? ObjectSound.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var31, 16777215, 0);
						var31 += 15;
						var25 = Login.loginBoxX + 180 - 80;
						var34 = 321;
						Tile.titlebuttonSprite.drawAt(var25 - 73, var34 - 20);
						var0.drawCentered("Recover", var25, var34 + 5, 16777215, 0);
						var25 = Login.loginBoxX + 180 + 80;
						Tile.titlebuttonSprite.drawAt(var25 - 73, var34 - 20);
						var0.drawCentered("Back", var25, var34 + 5, 16777215, 0);
						var34 = 356;
						var1.drawCentered("Still having trouble logging in?", class133.loginBoxCenter, var34, 268435455, 0);
					} else if (Login.loginIndex == 6) {
						var30 = 201;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var30, 16776960, 0);
						var31 = var30 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var31, 16776960, 0);
						var31 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var31, 16776960, 0);
						var31 += 15;
						var4 = Login.loginBoxX + 180;
						var23 = 321;
						Tile.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 7) {
						if (class161.field1846 && !Client.onMobile) {
							var30 = 201;
							var0.drawCentered(Login.Login_response1, class133.loginBoxCenter, var30, 16776960, 0);
							var31 = var30 + 15;
							var0.drawCentered(Login.Login_response2, class133.loginBoxCenter, var31, 16776960, 0);
							var31 += 15;
							var0.drawCentered(Login.Login_response3, class133.loginBoxCenter, var31, 16776960, 0);
							var4 = class133.loginBoxCenter - 150;
							var31 += 10;

							for (var38 = 0; var38 < 8; ++var38) {
								Tile.titlebuttonSprite.method11679(var4, var31, 30, 40);
								boolean var26 = var38 == Login.field708 & Client.cycle % 40 < 20;
								var0.draw((Login.field706[var38] == null ? "" : Login.field706[var38]) + (var26 ? ObjectSound.colorStartTag(16776960) + "|" : ""), var4 + 10, var31 + 27, 16777215, 0);
								if (var38 != 1 && var38 != 3) {
									var4 += 35;
								} else {
									var4 += 50;
									var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var31 + 27, 16777215, 0);
								}
							}

							var38 = class133.loginBoxCenter - 80;
							short var39 = 321;
							Tile.titlebuttonSprite.drawAt(var38 - 73, var39 - 20);
							var0.drawCentered("Submit", var38, var39 + 5, 16777215, 0);
							var38 = class133.loginBoxCenter + 80;
							Tile.titlebuttonSprite.drawAt(var38 - 73, var39 - 20);
							var0.drawCentered("Cancel", var38, var39 + 5, 16777215, 0);
						} else {
							var30 = 216;
							var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var30, 16776960, 0);
							var31 = var30 + 15;
							var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var31, 16776960, 0);
							var31 += 15;
							var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var31, 16776960, 0);
							var31 += 15;
							var4 = Login.loginBoxX + 180 - 80;
							var23 = 321;
							Tile.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
							var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0);
							var4 = Login.loginBoxX + 180 + 80;
							Tile.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
							var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
						}
					} else if (Login.loginIndex == 8) {
						var30 = 216;
						var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var30, 16776960, 0);
						var31 = var30 + 15;
						var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var31, 16776960, 0);
						var31 += 15;
						var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var31, 16776960, 0);
						var31 += 15;
						var4 = Login.loginBoxX + 180 - 80;
						var23 = 321;
						Tile.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Privacy Policy", var4, var23 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180 + 80;
						Tile.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 9) {
						var30 = 221;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var30, 16776960, 0);
						var31 = var30 + 25;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var31, 16776960, 0);
						var31 += 25;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var31, 16776960, 0);
						var4 = Login.loginBoxX + 180;
						var23 = 311;
						Tile.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Try again", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 10) {
						var31 = Login.loginBoxX + 180;
						var32 = 209;
						var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var32, 16776960, 0);
						var4 = var32 + 20;
						class163.field1854.drawAt(var31 - 109, var4);
						if (Login.displayName.isEmpty()) {
							class132.field1588.drawAt(var31 - 48, var4 + 18);
						} else {
							class132.field1588.drawAt(var31 - 48, var4 + 5);
							var0.drawCentered(Login.displayName, var31, var4 + 68 - 15, 16776960, 0);
						}
					} else if (Login.loginIndex == 12) {
						var31 = class133.loginBoxCenter;
						var32 = 216;
						var2.drawCentered("Before using this app, please read and accept our", var31, var32, 16777215, 0);
						var4 = var32 + 17;
						var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var31, var4, 16777215, 0);
						var4 += 17;
						var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var31, var4, 16777215, 0);
						var4 += 17;
						var2.drawCentered("By accepting, you agree to these documents.", var31, var4, 16777215, 0);
						var31 = class133.loginBoxCenter - 80;
						var32 = 311;
						Tile.titlebuttonSprite.drawAt(var31 - 73, var32 - 20);
						var0.drawCentered("Accept", var31, var32 + 5, 16777215, 0);
						var31 = class133.loginBoxCenter + 80;
						Tile.titlebuttonSprite.drawAt(var31 - 73, var32 - 20);
						var0.drawCentered("Decline", var31, var32 + 5, 16777215, 0);
					} else if (Login.loginIndex == 13) {
						var30 = 231;
						var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var30, 16777215, 0);
						var31 = var30 + 20;
						var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var31, 16777215, 0);
						var4 = Login.loginBoxX + 180;
						var30 = 311;
						Tile.titlebuttonSprite.drawAt(var4 - 73, var30 - 20);
						var0.drawCentered("Back", var4, var30 + 5, 16777215, 0);
					} else if (Login.loginIndex == 14) {
						var30 = 201;
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
							var6 = Strings.field4627;
							break;
						default:
							Varcs.Login_promptCredentials(false);
						}

						var0.drawCentered(var24, Login.loginBoxX + 180, var30, 16776960, 0);
						var31 = var30 + 20;
						var0.drawCentered(var5, Login.loginBoxX + 180, var31, 16776960, 0);
						var31 += 20;
						var0.drawCentered(var6, Login.loginBoxX + 180, var31, 16776960, 0);
						var25 = Login.loginBoxX + 180;
						var34 = 276;
						Tile.titlebuttonSprite.drawAt(var25 - 73, var34 - 20);
						if (Login.Login_banType == 1) {
							var0.drawCentered("Recover Account", var25, var34 + 5, 16777215, 0);
						} else {
							var0.drawCentered("View Appeal Options", var25, var34 + 5, 16777215, 0);
						}

						var25 = Login.loginBoxX + 180;
						var34 = 326;
						Tile.titlebuttonSprite.drawAt(var25 - 73, var34 - 20);
						var0.drawCentered("Back", var25, var34 + 5, 16777215, 0);
					} else if (Login.loginIndex == 24) {
						var30 = 221;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var30, 16777215, 0);
						var31 = var30 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var31, 16777215, 0);
						var31 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var31, 16777215, 0);
						var31 += 15;
						var4 = Login.loginBoxX + 180;
						var23 = 301;
						Tile.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Ok", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 32) {
						var30 = 216;
						var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var30, 16776960, 0);
						var31 = var30 + 15;
						var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var31, 16776960, 0);
						var31 += 15;
						var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var31, 16776960, 0);
						var31 += 15;
						var4 = Login.loginBoxX + 180 - 80;
						var23 = 321;
						Tile.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180 + 80;
						Tile.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 33) {
						var30 = 201;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var30, 16776960, 0);
						var31 = var30 + 20;
						var1.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var31, 16776960, 0);
						var31 += 20;
						var1.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var31, 16776960, 0);
						var31 += 15;
						var4 = Login.loginBoxX + 180;
						var23 = 276;
						Tile.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var2.drawCentered("Download Launcher", var4, var23 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180;
						var23 = 326;
						Tile.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var2.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 34) {
						var30 = 201;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var30, 16776960, 0);
						var31 = var30 + 20;
						var1.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var31, 16776960, 0);
						var31 += 20;
						var1.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var31, 16776960, 0);
						var4 = Login.loginBoxX + 180;
						var23 = 276;
						Tile.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var6 = class332.World_request != null ? "Loading..." : "Switch World";
						var2.drawCentered(var6, var4, var23 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180;
						var23 = 326;
						Tile.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var2.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					}
				}
			}

			if (Client.gameState >= 10) {
				int[] var27 = new int[4];
				Rasterizer2D.Rasterizer2D_getClipArray(var27);
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, GameEngine.canvasHeight);
				MidiPcmStream.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle);
				MidiPcmStream.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle);
				Rasterizer2D.Rasterizer2D_setClipArray(var27);
			}

			Huffman.title_muteSprite[FriendSystem.clientPreferences.isTitleMusicDisabled() ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463);
			if (Client.gameState > 5 && HorizontalAlignment.clientLanguage == Language.Language_EN) {
				if (class401.field4773 != null) {
					var31 = Login.xPadding + 5;
					var32 = 463;
					byte var42 = 100;
					byte var40 = 35;
					class401.field4773.drawAt(var31, var32);
					var0.drawCentered("World" + " " + Client.worldId, var42 / 2 + var31, var40 / 2 + var32 - 2, 16777215, 0);
					if (class332.World_request != null) {
						var1.drawCentered("Loading...", var42 / 2 + var31, var40 / 2 + var32 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var42 / 2 + var31, var40 / 2 + var32 + 12, 16777215, 0);
					}
				} else {
					class401.field4773 = class484.SpriteBuffer_getIndexedSpriteByName(class188.archive8, "sl_button", "");
				}
			}

		}
	}
}
