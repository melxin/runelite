import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cj")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("lc")
	@ObfuscatedGetter(
		intValue = 1088736263
	)
	static int field1081;
	@ObfuscatedName("oy")
	static int[] field1082;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -313755967
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 17821737
	)
	@Export("health")
	int health;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -712865399
	)
	@Export("health2")
	int health2;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 111989601
	)
	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1045995060"
	)
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lsu;Lsu;Lsu;I)V",
		garbageValue = "2017660941"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (class489.canvasWidth - 765) / 2;
		Login.loginBoxX = Login.xPadding + 202;
		CollisionMap.loginBoxCenter = Login.loginBoxX + 180;
		byte var3;
		int var4;
		int var7;
		int var25;
		int var32;
		int var45;
		if (Login.worldSelectOpen) {
			if (class461.worldSelectBackSprites == null) {
				class461.worldSelectBackSprites = class234.method5164(class147.archive8, "sl_back", "");
			}

			if (class107.worldSelectFlagSprites == null) {
				class107.worldSelectFlagSprites = class288.getFont(class147.archive8, "sl_flags", "");
			}

			if (MoveSpeed.worldSelectArrows == null) {
				MoveSpeed.worldSelectArrows = class288.getFont(class147.archive8, "sl_arrows", "");
			}

			if (class148.worldSelectStars == null) {
				class148.worldSelectStars = class288.getFont(class147.archive8, "sl_stars", "");
			}

			if (class70.worldSelectLeftSprite == null) {
				class70.worldSelectLeftSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(class147.archive8, "leftarrow", "");
			}

			if (class339.worldSelectRightSprite == null) {
				class339.worldSelectRightSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(class147.archive8, "rightarrow", "");
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0);
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624);
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513);
			var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1);
			if (class148.worldSelectStars != null) {
				class148.worldSelectStars[1].drawAt(Login.xPadding + 140, 1);
				var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1);
				class148.worldSelectStars[0].drawAt(Login.xPadding + 140, 12);
				var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1);
			}

			if (MoveSpeed.worldSelectArrows != null) {
				var32 = Login.xPadding + 280;
				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) {
					MoveSpeed.worldSelectArrows[2].drawAt(var32, 4);
				} else {
					MoveSpeed.worldSelectArrows[0].drawAt(var32, 4);
				}

				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) {
					MoveSpeed.worldSelectArrows[3].drawAt(var32 + 15, 4);
				} else {
					MoveSpeed.worldSelectArrows[1].drawAt(var32 + 15, 4);
				}

				var0.draw("World", var32 + 32, 17, 16777215, -1);
				var4 = Login.xPadding + 390;
				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) {
					MoveSpeed.worldSelectArrows[2].drawAt(var4, 4);
				} else {
					MoveSpeed.worldSelectArrows[0].drawAt(var4, 4);
				}

				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) {
					MoveSpeed.worldSelectArrows[3].drawAt(var4 + 15, 4);
				} else {
					MoveSpeed.worldSelectArrows[1].drawAt(var4 + 15, 4);
				}

				var0.draw("Players", var4 + 32, 17, 16777215, -1);
				var45 = Login.xPadding + 500;
				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) {
					MoveSpeed.worldSelectArrows[2].drawAt(var45, 4);
				} else {
					MoveSpeed.worldSelectArrows[0].drawAt(var45, 4);
				}

				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) {
					MoveSpeed.worldSelectArrows[3].drawAt(var45 + 15, 4);
				} else {
					MoveSpeed.worldSelectArrows[1].drawAt(var45 + 15, 4);
				}

				var0.draw("Location", var45 + 32, 17, 16777215, -1);
				var25 = Login.xPadding + 610;
				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) {
					MoveSpeed.worldSelectArrows[2].drawAt(var25, 4);
				} else {
					MoveSpeed.worldSelectArrows[0].drawAt(var25, 4);
				}

				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) {
					MoveSpeed.worldSelectArrows[3].drawAt(var25 + 15, 4);
				} else {
					MoveSpeed.worldSelectArrows[1].drawAt(var25 + 15, 4);
				}

				var0.draw("Type", var25 + 32, 17, 16777215, -1);
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0);
			var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1);
			Login.hoveredWorldIndex = -1;
			if (class461.worldSelectBackSprites != null) {
				var3 = 88;
				byte var42 = 19;
				var45 = 765 / (var3 + 1) - 1;
				var25 = 480 / (var42 + 1);

				int var35;
				do {
					var7 = var25;
					var35 = var45;
					if (var25 * (var45 - 1) >= World.World_count) {
						--var45;
					}

					if (var45 * (var25 - 1) >= World.World_count) {
						--var25;
					}

					if (var45 * (var25 - 1) >= World.World_count) {
						--var25;
					}
				} while(var25 != var7 || var45 != var35);

				var7 = (765 - var45 * var3) / (var45 + 1);
				if (var7 > 5) {
					var7 = 5;
				}

				var35 = (480 - var25 * var42) / (var25 + 1);
				if (var35 > 5) {
					var35 = 5;
				}

				int var37 = (765 - var45 * var3 - var7 * (var45 - 1)) / 2;
				int var38 = (480 - var25 * var42 - var35 * (var25 - 1)) / 2;
				int var28 = (var25 + World.World_count - 1) / var25;
				Login.worldSelectPagesCount = var28 - var45;
				if (class70.worldSelectLeftSprite != null && Login.worldSelectPage > 0) {
					class70.worldSelectLeftSprite.drawAt(8, class374.canvasHeight / 2 - class70.worldSelectLeftSprite.subHeight * -183371056 / 2);
				}

				if (class339.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) {
					class339.worldSelectRightSprite.drawAt(class489.canvasWidth - class339.worldSelectRightSprite.subWidth - 8, class374.canvasHeight / 2 - class339.worldSelectRightSprite.subHeight * -183371056 / 2);
				}

				int var29 = var38 + 23;
				int var39 = var37 + Login.xPadding;
				int var40 = 0;
				boolean var41 = false;
				int var43 = Login.worldSelectPage;

				int var17;
				for (var17 = var25 * var43; var17 < World.World_count && var43 - Login.worldSelectPage < var45; ++var17) {
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
						var21 = var18.isMembersOnly() ? class88.field1238 : class88.field1237;
					} else if (var18.isDeadman()) {
						var21 = var18.isMembersOnly() ? class88.field1234 : class88.field1245;
					} else if (var18.method1538()) {
						var22 = 16711680;
						var21 = var18.isMembersOnly() ? class88.field1236 : class88.field1247;
					} else if (var18.method1569()) {
						var21 = var18.isMembersOnly() ? class88.field1240 : class88.field1243;
					} else if (var18.isPvp()) {
						var21 = var18.isMembersOnly() ? class88.field1246 : class88.field1233;
					} else if (var18.method1541()) {
						var21 = var18.isMembersOnly() ? class88.field1242 : class88.field1241;
					} else if (var18.method1577()) {
						var21 = var18.isMembersOnly() ? class88.field1390 : class88.field1239;
					}

					if (var21 == null || var21.field1231 >= class461.worldSelectBackSprites.length) {
						var21 = var18.isMembersOnly() ? class88.field1232 : class88.field1235;
					}

					if (MouseHandler.MouseHandler_x >= var39 && MouseHandler.MouseHandler_y >= var29 && MouseHandler.MouseHandler_x < var39 + var3 && MouseHandler.MouseHandler_y < var42 + var29 && var19) {
						Login.hoveredWorldIndex = var17;
						class461.worldSelectBackSprites[var21.field1231].drawTransOverlayAt(var39, var29, 128, 16777215);
						var41 = true;
					} else {
						class461.worldSelectBackSprites[var21.field1231].drawAt(var39, var29);
					}

					if (class107.worldSelectFlagSprites != null) {
						class107.worldSelectFlagSprites[(var18.isMembersOnly() ? 8 : 0) + var18.location].drawAt(var39 + 29, var29);
					}

					var0.drawCentered(Integer.toString(var18.id), var39 + 15, var42 / 2 + var29 + 5, var22, -1);
					var1.drawCentered(var20, var39 + 60, var42 / 2 + var29 + 5, 268435455, -1);
					var29 = var29 + var42 + var35;
					++var40;
					if (var40 >= var25) {
						var29 = var38 + 23;
						var39 = var39 + var7 + var3;
						var40 = 0;
						++var43;
					}
				}

				if (var41) {
					var17 = var1.stringWidth(World.World_worlds[Login.hoveredWorldIndex].activity) + 6;
					int var30 = var1.ascent + 8;
					int var44 = MouseHandler.MouseHandler_y + 25;
					if (var44 + var30 > 480) {
						var44 = MouseHandler.MouseHandler_y - 25 - var30;
					}

					Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var17 / 2, var44, var17, var30, 16777120);
					Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var17 / 2, var44, var17, var30, 0);
					var1.drawCentered(World.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var44 + var1.ascent + 4, 0, -1);
				}
			}

		} else {
			class560.leftTitleSprite.drawAt(Login.xPadding, 0);
			WorldMapData_1.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			class50.logoSprite.drawAt(Login.xPadding + 382 - class50.logoSprite.subWidth / 2, 18);
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
			short var31;
			short var33;
			if (Client.gameState == 20) {
				class208.titleboxSprite.drawAt(Login.loginBoxX + 180 - class208.titleboxSprite.subWidth / 2, 271 - class208.titleboxSprite.subHeight * -183371056 / 2);
				var31 = 201;
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16776960, 0);
				var32 = var31 + 15;
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16776960, 0);
				var32 += 15;
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16776960, 0);
				var32 += 15;
				var32 += 7;
				if (Login.loginIndex != 4 && Login.loginIndex != 10 && Login.loginIndex != 1) {
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var32, 16777215, 0);
					var33 = 200;

					for (var5 = ClanMate.method10237(); var0.stringWidth(var5) > var33; var5 = var5.substring(0, var5.length() - 1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var5), Login.loginBoxX + 180 - 70, var32, 16777215, 0);
					var32 += 15;

					for (var6 = FriendsList.method10182(Login.Login_password); var0.stringWidth(var6) > var33; var6 = var6.substring(1)) {
					}

					var0.draw("Password: " + var6, Login.loginBoxX + 180 - 108, var32, 16777215, 0);
					var32 += 15;
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11 || Client.gameState == 50) {
				class208.titleboxSprite.drawAt(Login.loginBoxX, 171);
				short var23;
				if (Login.loginIndex == 0) {
					var31 = 251;
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var31, 16776960, 0);
					var32 = var31 + 30;
					var4 = Login.loginBoxX + 180 - 80;
					var23 = 291;
					World.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawLines("New User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var4 = Login.loginBoxX + 180 + 80;
					World.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawLines("Existing User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (Login.loginIndex == 1) {
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0);
					var31 = 236;
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16777215, 0);
					var32 = var31 + 15;
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16777215, 0);
					var32 += 15;
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16777215, 0);
					var32 += 15;
					var4 = Login.loginBoxX + 180 - 80;
					var23 = 321;
					World.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawCentered("Continue", var4, var23 + 5, 16777215, 0);
					var4 = Login.loginBoxX + 180 + 80;
					World.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawCentered("Cancel", var4, var23 + 5, 16777215, 0);
				} else if (Login.loginIndex == 2) {
					var31 = 201;
					var0.drawCentered(Login.Login_response1, CollisionMap.loginBoxCenter, var31, 16776960, 0);
					var32 = var31 + 15;
					var0.drawCentered(Login.Login_response2, CollisionMap.loginBoxCenter, var32, 16776960, 0);
					var32 += 15;
					var0.drawCentered(Login.Login_response3, CollisionMap.loginBoxCenter, var32, 16776960, 0);
					var32 += 15;
					var32 += 7;
					var0.draw("Login: ", CollisionMap.loginBoxCenter - 110, var32, 16777215, 0);
					var33 = 200;

					for (var5 = ClanMate.method10237(); var0.stringWidth(var5) > var33; var5 = var5.substring(1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var5) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? class144.colorStartTag(16776960) + "|" : ""), CollisionMap.loginBoxCenter - 70, var32, 16777215, 0);
					var32 += 15;

					for (var6 = FriendsList.method10182(Login.Login_password); var0.stringWidth(var6) > var33; var6 = var6.substring(1)) {
					}

					var0.draw("Password: " + var6 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? class144.colorStartTag(16776960) + "|" : ""), CollisionMap.loginBoxCenter - 108, var32, 16777215, 0);
					var32 += 15;
					var31 = 277;
					var7 = CollisionMap.loginBoxCenter + -117;
					boolean var9 = Client.Login_isUsernameRemembered;
					boolean var10 = Login.field684;
					IndexedSprite var26 = var9 ? (var10 ? HealthBarDefinition.field2048 : WidgetConfigNode.options_buttons_2Sprite) : (var10 ? UserComparator6.field1577 : class456.options_buttons_0Sprite);
					var26.drawAt(var7, var31);
					var7 = var7 + var26.subWidth + 5;
					var1.draw("Remember username", var7, var31 + 13, 16776960, 0);
					var7 = CollisionMap.loginBoxCenter + 24;
					boolean var13 = class468.clientPreferences.isUsernameHidden();
					boolean var14 = Login.field696;
					IndexedSprite var12 = var13 ? (var14 ? HealthBarDefinition.field2048 : WidgetConfigNode.options_buttons_2Sprite) : (var14 ? UserComparator6.field1577 : class456.options_buttons_0Sprite);
					var12.drawAt(var7, var31);
					var7 = var7 + var12.subWidth + 5;
					var1.draw("Hide username", var7, var31 + 13, 16776960, 0);
					var32 = var31 + 15;
					int var15 = CollisionMap.loginBoxCenter - 80;
					short var16 = 321;
					World.titlebuttonSprite.drawAt(var15 - 73, var16 - 20);
					var0.drawCentered("Login", var15, var16 + 5, 16777215, 0);
					var15 = CollisionMap.loginBoxCenter + 80;
					World.titlebuttonSprite.drawAt(var15 - 73, var16 - 20);
					var0.drawCentered("Cancel", var15, var16 + 5, 16777215, 0);
					var31 = 357;
					switch(Login.field688) {
					case 2:
						WorldMapLabel.field3495 = "Having trouble logging in?";
						break;
					default:
						WorldMapLabel.field3495 = "Can't login? Click here.";
					}

					class181.field1964 = new Bounds(CollisionMap.loginBoxCenter, var31, var1.stringWidth(WorldMapLabel.field3495), 11);
					WorldMapElement.field2009 = new Bounds(CollisionMap.loginBoxCenter, var31, var1.stringWidth("Still having trouble logging in?"), 11);
					var1.drawCentered(WorldMapLabel.field3495, CollisionMap.loginBoxCenter, var31, 16777215, 0);
				} else if (Login.loginIndex == 3) {
					var31 = 201;
					var0.drawCentered("Incorrect username or password.", Login.loginBoxX + 180, var31, 16776960, 0);
					var32 = var31 + 20;
					var1.drawCentered("If you have upgraded to a Jagex Account, you", Login.loginBoxX + 180, var32, 16776960, 0);
					var32 += 20;
					var1.drawCentered("need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", Login.loginBoxX + 180, var32, 16776960, 0);
					var32 += 15;
					var4 = Login.loginBoxX + 180;
					var23 = 276;
					World.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var2.drawCentered("Try again", var4, var23 + 5, 16777215, 0);
					var4 = Login.loginBoxX + 180;
					var23 = 326;
					World.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var2.drawCentered("Forgotten password?", var4, var23 + 5, 16777215, 0);
				} else {
					short var8;
					if (Login.loginIndex == 4) {
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0);
						var31 = 236;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16777215, 0);
						var32 = var31 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16777215, 0);
						var32 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16777215, 0);
						var32 += 15;
						var0.draw("PIN: " + FriendsList.method10182(UserComparator6.otp) + (Client.cycle % 40 < 20 ? class144.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var32, 16777215, 0);
						var32 -= 8;
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var32, 16776960, 0);
						var32 += 15;
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var32, 16776960, 0);
						var4 = Login.loginBoxX + 180 - 9 + var0.stringWidth("for 30 days: ") + 15;
						var45 = var32 - var0.ascent;
						IndexedSprite var34;
						if (Login.rememberUsername) {
							var34 = WidgetConfigNode.options_buttons_2Sprite;
						} else {
							var34 = class456.options_buttons_0Sprite;
						}

						var34.drawAt(var4, var45);
						var32 += 15;
						var7 = Login.loginBoxX + 180 - 80;
						var8 = 321;
						World.titlebuttonSprite.drawAt(var7 - 73, var8 - 20);
						var0.drawCentered("Continue", var7, var8 + 5, 16777215, 0);
						var7 = Login.loginBoxX + 180 + 80;
						World.titlebuttonSprite.drawAt(var7 - 73, var8 - 20);
						var0.drawCentered("Cancel", var7, var8 + 5, 16777215, 0);
						var1.drawCentered("Can't login? Click here.", Login.loginBoxX + 180, var8 + 36, 16777215, 0);
					} else if (Login.loginIndex == 5) {
						var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0);
						var31 = 221;
						var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16776960, 0);
						var32 = var31 + 15;
						var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var32 += 14;
						var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var32, 16777215, 0);
						var33 = 174;

						for (var5 = ClanMate.method10237(); var0.stringWidth(var5) > var33; var5 = var5.substring(1)) {
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Client.cycle % 40 < 20 ? class144.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var32, 16777215, 0);
						var32 += 15;
						var25 = Login.loginBoxX + 180 - 80;
						short var36 = 321;
						World.titlebuttonSprite.drawAt(var25 - 73, var36 - 20);
						var0.drawCentered("Recover", var25, var36 + 5, 16777215, 0);
						var25 = Login.loginBoxX + 180 + 80;
						World.titlebuttonSprite.drawAt(var25 - 73, var36 - 20);
						var0.drawCentered("Back", var25, var36 + 5, 16777215, 0);
						var36 = 356;
						var1.drawCentered("Still having trouble logging in?", CollisionMap.loginBoxCenter, var36, 268435455, 0);
					} else if (Login.loginIndex == 6) {
						var31 = 201;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16776960, 0);
						var32 = var31 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var4 = Login.loginBoxX + 180;
						var23 = 321;
						World.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 7) {
						if (Frames.field2971 && !Client.onMobile) {
							var31 = 201;
							var0.drawCentered(Login.Login_response1, CollisionMap.loginBoxCenter, var31, 16776960, 0);
							var32 = var31 + 15;
							var0.drawCentered(Login.Login_response2, CollisionMap.loginBoxCenter, var32, 16776960, 0);
							var32 += 15;
							var0.drawCentered(Login.Login_response3, CollisionMap.loginBoxCenter, var32, 16776960, 0);
							var4 = CollisionMap.loginBoxCenter - 150;
							var32 += 10;

							for (var45 = 0; var45 < 8; ++var45) {
								World.titlebuttonSprite.method12104(var4, var32, 30, 40);
								boolean var46 = var45 == Login.field706 & Client.cycle % 40 < 20;
								var0.draw((Login.field694[var45] == null ? "" : Login.field694[var45]) + (var46 ? class144.colorStartTag(16776960) + "|" : ""), var4 + 10, var32 + 27, 16777215, 0);
								if (var45 != 1 && var45 != 3) {
									var4 += 35;
								} else {
									var4 += 50;
									var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var32 + 27, 16777215, 0);
								}
							}

							var45 = CollisionMap.loginBoxCenter - 80;
							short var47 = 321;
							World.titlebuttonSprite.drawAt(var45 - 73, var47 - 20);
							var0.drawCentered("Submit", var45, var47 + 5, 16777215, 0);
							var45 = CollisionMap.loginBoxCenter + 80;
							World.titlebuttonSprite.drawAt(var45 - 73, var47 - 20);
							var0.drawCentered("Cancel", var45, var47 + 5, 16777215, 0);
						} else {
							var31 = 216;
							var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var31, 16776960, 0);
							var32 = var31 + 15;
							var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var32, 16776960, 0);
							var32 += 15;
							var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var32, 16776960, 0);
							var32 += 15;
							var4 = Login.loginBoxX + 180 - 80;
							var23 = 321;
							World.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
							var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0);
							var4 = Login.loginBoxX + 180 + 80;
							World.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
							var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
						}
					} else if (Login.loginIndex == 8) {
						var31 = 216;
						var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var31, 16776960, 0);
						var32 = var31 + 15;
						var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var4 = Login.loginBoxX + 180 - 80;
						var23 = 321;
						World.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Privacy Policy", var4, var23 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180 + 80;
						World.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 9) {
						var31 = 221;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16776960, 0);
						var32 = var31 + 25;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 25;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16776960, 0);
						var4 = Login.loginBoxX + 180;
						var23 = 311;
						World.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Try again", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 10) {
						var32 = Login.loginBoxX + 180;
						var33 = 209;
						var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var33, 16776960, 0);
						var4 = var33 + 20;
						class311.field3509.drawAt(var32 - 109, var4);
						if (Login.displayName.isEmpty()) {
							TriBool.field5495.drawAt(var32 - 48, var4 + 18);
						} else {
							TriBool.field5495.drawAt(var32 - 48, var4 + 5);
							var0.drawCentered(Login.displayName, var32, var4 + 68 - 15, 16776960, 0);
						}
					} else if (Login.loginIndex == 12) {
						var32 = CollisionMap.loginBoxCenter;
						var33 = 216;
						var2.drawCentered("Before using this app, please read and accept our", var32, var33, 16777215, 0);
						var4 = var33 + 17;
						var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var32, var4, 16777215, 0);
						var4 += 17;
						var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var32, var4, 16777215, 0);
						var4 += 17;
						var2.drawCentered("By accepting, you agree to these documents.", var32, var4, 16777215, 0);
						var32 = CollisionMap.loginBoxCenter - 80;
						var33 = 311;
						World.titlebuttonSprite.drawAt(var32 - 73, var33 - 20);
						var0.drawCentered("Accept", var32, var33 + 5, 16777215, 0);
						var32 = CollisionMap.loginBoxCenter + 80;
						World.titlebuttonSprite.drawAt(var32 - 73, var33 - 20);
						var0.drawCentered("Decline", var32, var33 + 5, 16777215, 0);
					} else if (Login.loginIndex == 13) {
						var31 = 231;
						var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var31, 16777215, 0);
						var32 = var31 + 20;
						var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var32, 16777215, 0);
						var4 = Login.loginBoxX + 180;
						var31 = 311;
						World.titlebuttonSprite.drawAt(var4 - 73, var31 - 20);
						var0.drawCentered("Back", var4, var31 + 5, 16777215, 0);
					} else if (Login.loginIndex == 14) {
						var31 = 201;
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
							var6 = Strings.field4718;
							break;
						default:
							SpotAnimationDefinition.Login_promptCredentials(false);
						}

						var0.drawCentered(var24, Login.loginBoxX + 180, var31, 16776960, 0);
						var32 = var31 + 20;
						var0.drawCentered(var5, Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 20;
						var0.drawCentered(var6, Login.loginBoxX + 180, var32, 16776960, 0);
						var7 = Login.loginBoxX + 180;
						var8 = 276;
						World.titlebuttonSprite.drawAt(var7 - 73, var8 - 20);
						if (Login.Login_banType == 1) {
							var0.drawCentered("Recover Account", var7, var8 + 5, 16777215, 0);
						} else {
							var0.drawCentered("View Appeal Options", var7, var8 + 5, 16777215, 0);
						}

						var7 = Login.loginBoxX + 180;
						var8 = 326;
						World.titlebuttonSprite.drawAt(var7 - 73, var8 - 20);
						var0.drawCentered("Back", var7, var8 + 5, 16777215, 0);
					} else if (Login.loginIndex == 24) {
						var31 = 221;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16777215, 0);
						var32 = var31 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16777215, 0);
						var32 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16777215, 0);
						var32 += 15;
						var4 = Login.loginBoxX + 180;
						var23 = 301;
						World.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Ok", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 32) {
						var31 = 216;
						var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var31, 16776960, 0);
						var32 = var31 + 15;
						var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var4 = Login.loginBoxX + 180 - 80;
						var23 = 321;
						World.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180 + 80;
						World.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 33) {
						var31 = 201;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16776960, 0);
						var32 = var31 + 20;
						var1.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 20;
						var1.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var4 = Login.loginBoxX + 180;
						var23 = 276;
						World.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var2.drawCentered("Download Launcher", var4, var23 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180;
						var23 = 326;
						World.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var2.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 34) {
						var31 = 201;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16776960, 0);
						var32 = var31 + 20;
						var1.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 20;
						var1.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16776960, 0);
						var4 = Login.loginBoxX + 180;
						var23 = 276;
						World.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var6 = Huffman.World_request != null ? "Loading..." : "Switch World";
						var2.drawCentered(var6, var4, var23 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180;
						var23 = 326;
						World.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var2.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					}
				}
			}

			if (Client.gameState >= 10) {
				int[] var27 = new int[4];
				Rasterizer2D.Rasterizer2D_getClipArray(var27);
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, class374.canvasHeight);
				class204.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle);
				class204.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle);
				Rasterizer2D.Rasterizer2D_setClipArray(var27);
			}

			FadeOutTask.title_muteSprite[class468.clientPreferences.isTitleMusicDisabled() ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463);
			if (Client.gameState > 5 && class352.clientLanguage == Language.Language_EN) {
				if (ModelData0.field3172 != null) {
					var32 = Login.xPadding + 5;
					var33 = 463;
					byte var49 = 100;
					byte var48 = 35;
					ModelData0.field3172.drawAt(var32, var33);
					var0.drawCentered("World" + " " + Client.worldId, var49 / 2 + var32, var48 / 2 + var33 - 2, 16777215, 0);
					if (Huffman.World_request != null) {
						var1.drawCentered("Loading...", var49 / 2 + var32, var48 / 2 + var33 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var49 / 2 + var32, var48 / 2 + var33 + 12, 16777215, 0);
					}
				} else {
					ModelData0.field3172 = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(class147.archive8, "sl_button", "");
				}
			}

		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ILcu;ZB)I",
		garbageValue = "90"
	)
	static int method2589(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) {
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = class406.loadWorlds() ? 1 : 0;
			return 1;
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) {
				var9 = class339.worldListStart();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var9.id;
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var9.properties;
					Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var9.activity;
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var9.location;
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var9.population;
					Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var9.host;
				} else {
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) {
				var9 = class217.getNextWorldListWorld();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var9.id;
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var9.properties;
					Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var9.activity;
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var9.location;
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var9.population;
					Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var9.host;
				} else {
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
				}

				return 1;
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) {
					var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
					var7 = null;

					for (var8 = 0; var8 < World.World_count; ++var8) {
						if (var3 == World.World_worlds[var8].id) {
							var7 = World.World_worlds[var8];
							break;
						}
					}

					if (var7 != null) {
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var7.id;
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var7.properties;
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var7.activity;
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var7.location;
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var7.population;
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var7.host;
					} else {
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) {
					class408.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
					boolean var10 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1] == 1;
					var8 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 2];
					boolean var6 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 3] == 1;
					class204.sortWorldList(var3, var10, var8, var6);
					return 1;
				} else if (var0 != 6511) {
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) {
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
						return 1;
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) {
							class408.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
							var5 = WorldMap.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = AsyncHttpResponse.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = AsyncHttpResponse.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.LC_PARAM) {
							class408.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
							var5 = WorldMap.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = AsyncHttpResponse.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = AsyncHttpResponse.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.OC_PARAM) {
							class408.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
							var5 = WorldMap.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = class150.ItemDefinition_get(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = class150.ItemDefinition_get(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) {
							class408.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
							var5 = WorldMap.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = class39.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = class39.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.ON_MOBILE) {
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) {
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Client.clientType;
							return 1;
						} else if (var0 == 6520) {
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) {
							return 1;
						} else if (var0 == 6522) {
							--SecureRandomFuture.Interpreter_objectStackSize;
							--class408.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 6523) {
							--SecureRandomFuture.Interpreter_objectStackSize;
							--class408.Interpreter_intStackSize;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) {
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) {
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) {
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == 6527) {
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Client.field352;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
					if (var3 >= 0 && var3 < World.World_count) {
						var7 = World.World_worlds[var3];
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var7.id;
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var7.properties;
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var7.activity;
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var7.location;
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var7.population;
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var7.host;
					} else {
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-56"
	)
	static void method2590(int var0) {
		PacketBufferNode var1 = ReflectionCheck.getPacketBufferNode(ClientPacket.SET_HEADING, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByteAdd(var0);
		Client.packetWriter.addNode(var1);
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(Lmm;S)V",
		garbageValue = "-12763"
	)
	static final void method2594(class334 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer;
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var11;
		int var12;
		int var13;
		int var14;
		int var15;
		int var18;
		int var21;
		int var30;
		int var35;
		if (class334.field3696 == var0) {
			var2 = var1.method11663();
			var3 = var1.method11663();
			var4 = var1.readUnsignedShortLE();
			var5 = var1.readUnsignedByteAdd();
			var6 = AsyncHttpResponse.worldView.plane;
			var7 = (var5 >> 4 & 7) + SpriteBufferProperties.field23 + AsyncHttpResponse.worldView.baseX;
			var21 = (var5 & 7) + class482.field5369 + AsyncHttpResponse.worldView.baseY;
			var35 = var1.readUnsignedShortAddLE();
			var30 = var1.readUnsignedByteAdd();
			var11 = var1.readUnsignedShort();
			var12 = var1.readUnsignedShortLE();
			var13 = var1.readUnsignedShortAddLE();
			var14 = var1.readUnsignedIntME();
			var15 = Coord.method7673(var14);
			int var34 = Coord.method7674(var14);
			int var26 = Coord.method7675(var14);
			var18 = var1.readUnsignedShortAdd();
			if (var18 != 65535) {
				Projectile var19 = new Projectile(var6, var7, var21, var11, var2, var15, var34, var26, var35, var3, var18, var4 + Client.cycle, var13 + Client.cycle, var30, var12);
				Client.projectiles.addFirst(var19);
			}

		} else if (class334.field3699 == var0) {
			var2 = var1.readUnsignedByte() & 31;
			var3 = var1.readUnsignedByteNeg();
			var4 = (var3 >> 4 & 7) + SpriteBufferProperties.field23;
			var5 = (var3 & 7) + class482.field5369;
			var6 = var1.readUnsignedByteSub();
			var7 = var1.readUnsignedShortAdd();
			var21 = var1.readUnsignedByteSub();
			var35 = var1.readUnsignedByteSub();
			if (var4 >= 0 && var5 >= 0 && var4 < AsyncHttpResponse.worldView.sizeX && var5 < AsyncHttpResponse.worldView.sizeY) {
				var30 = var2 + 1;
				if (class330.localPlayer.pathX[0] >= var4 - var30 && class330.localPlayer.pathX[0] <= var30 + var4 && class330.localPlayer.pathY[0] >= var5 - var30 && class330.localPlayer.pathY[0] <= var5 + var30) {
					class114.method3596(AsyncHttpResponse.worldView.id, var7, var4, var5, var2, var6, var21, var35);
				}
			}

		} else if (class334.field3690 == var0) {
			var2 = var1.readUnsignedShort();
			var3 = var1.readUnsignedByteSub();
			var4 = var1.readUnsignedShort();
			var5 = var1.readUnsignedByteAdd();
			var6 = (var5 >> 4 & 7) + SpriteBufferProperties.field23;
			var7 = (var5 & 7) + class482.field5369;
			if (var6 >= 0 && var7 >= 0 && var6 < AsyncHttpResponse.worldView.sizeX && var7 < AsyncHttpResponse.worldView.sizeY) {
				var6 = Coord.method7679(var6);
				var7 = Coord.method7679(var7);
				var21 = Client.overheadTextLimit == -1 ? AsyncHttpResponse.worldView.plane : Client.overheadTextLimit;
				GraphicsObject var29 = new GraphicsObject(AsyncHttpResponse.worldView, var2, var21, var6, var7, NPCComposition.getTileHeight(AsyncHttpResponse.worldView, var6, var7, var21) - var3, var4, Client.cycle);
				AsyncHttpResponse.worldView.graphicsObjects.addFirst(var29);
			}

		} else if (class334.field3688 == var0) {
			var2 = var1.readUnsignedByteNeg();
			String[] var24 = null;
			if (var2 > 0) {
				var24 = new String[5];

				for (var4 = 0; var4 < var2; ++var4) {
					var5 = var1.readUnsignedByteSub();
					String var25 = var1.readStringCp1252NullTerminated();
					if (var5 >= 0 && var5 < 5) {
						var24[var5] = var25;
					}
				}
			}

			var4 = var1.readUnsignedByteNeg();
			var5 = var4 >> 2;
			var6 = var4 & 3;
			var7 = Client.field284[var5];
			var21 = var1.readUnsignedByteAdd();
			var35 = var1.readUnsignedShortAdd();
			var30 = var1.readUnsignedByteAdd();
			var11 = (var30 >> 4 & 7) + SpriteBufferProperties.field23;
			var12 = (var30 & 7) + class482.field5369;
			if (var11 >= 0 && var12 >= 0 && var11 < AsyncHttpResponse.worldView.sizeX && var12 < AsyncHttpResponse.worldView.sizeY) {
				var13 = Client.overheadTextLimit == -1 ? AsyncHttpResponse.worldView.plane : Client.overheadTextLimit;
				HttpRequest.method89(AsyncHttpResponse.worldView, var13, var11, var12, var7, var35, var5, var6, var21, var24, 0, -1);
			}

		} else if (class334.field3686 == var0) {
			var2 = var1.readUnsignedShortAddLE();
			var3 = var1.readUnsignedIntME();
			var4 = var1.readUnsignedIntLE();
			var5 = var1.readUnsignedByteNeg();
			var6 = (var5 >> 4 & 7) + SpriteBufferProperties.field23;
			var7 = (var5 & 7) + class482.field5369;
			if (var6 >= 0 && var7 >= 0 && var6 < AsyncHttpResponse.worldView.sizeX && var7 < AsyncHttpResponse.worldView.sizeY) {
				var21 = Client.overheadTextLimit == -1 ? AsyncHttpResponse.worldView.plane : Client.overheadTextLimit;
				WorldMapIcon_0.method6932(var21, var6, var7, var2, var3, var4);
			}

		} else if (class334.field3694 == var0) {
			var2 = var1.readUnsignedByte();
			var3 = var2 >> 2;
			var4 = var2 & 3;
			var5 = Client.field284[var3];
			var6 = var1.readUnsignedByteSub();
			var7 = (var6 >> 4 & 7) + SpriteBufferProperties.field23;
			var21 = (var6 & 7) + class482.field5369;
			if (var7 >= 0 && var21 >= 0 && var7 < AsyncHttpResponse.worldView.sizeX && var21 < AsyncHttpResponse.worldView.sizeY) {
				var35 = Client.overheadTextLimit == -1 ? AsyncHttpResponse.worldView.plane : Client.overheadTextLimit;
				HttpRequest.method89(AsyncHttpResponse.worldView, var35, var7, var21, var5, -1, var3, var4, 31, (String[])null, 0, -1);
			}

		} else if (class334.field3692 == var0) {
			var2 = var1.readUnsignedByteNeg();
			var3 = var2 >> 2;
			var4 = var2 & 3;
			var5 = Client.field284[var3];
			var6 = var1.readUnsignedShortAddLE();
			var7 = var1.readUnsignedByteNeg();
			var21 = (var7 >> 4 & 7) + SpriteBufferProperties.field23;
			var35 = (var7 & 7) + class482.field5369;
			if (0 <= var21 && var21 < 103 && 0 <= var35 && var35 < 103) {
				var30 = Client.overheadTextLimit == -1 ? AsyncHttpResponse.worldView.plane : Client.overheadTextLimit;
				PendingSpawn var22 = class67.method2209(AsyncHttpResponse.worldView, var30, var21, var35, var5);
				if (var22 != null) {
					ObjectComposition var23 = AsyncHttpResponse.getObjectDefinition(var22.field998);
					if (var23.field2397) {
						class392.method8382(var30, var21, var35, var3, var4, var5, var6);
						var22.field1001 = var6;
						return;
					}
				}

				boolean var33 = class392.method8382(var30, var21, var35, var3, var4, var5, var6);
				if (var33) {
					return;
				}

				if (var22 != null) {
					var22.field1001 = var6;
				}
			}

		} else if (class334.field3693 == var0) {
			var2 = var1.readUnsignedByteSub();
			var3 = (var2 >> 4 & 7) + SpriteBufferProperties.field23;
			var4 = (var2 & 7) + class482.field5369;
			var5 = var1.method11682();
			var6 = var1.readUnsignedIntLE();
			var7 = var1.readUnsignedShortAddLE();
			var21 = var1.readShortLE();
			var35 = var1.readUnsignedShortAddLE();
			short var31 = (short)var1.readShortLE();
			short var32 = (short)var1.readShortLE();
			if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
				var12 = Client.overheadTextLimit == -1 ? AsyncHttpResponse.worldView.plane : Client.overheadTextLimit;
				AbstractWorldMapData.method7005(var12, var3, var4, var7, var6, var31, var5, var32, var21, var35);
			}

		} else {
			if (class334.field3689 == var0) {
				var2 = var1.readUnsignedByteNeg();
				var3 = (var2 >> 4 & 7) + SpriteBufferProperties.field23;
				var4 = (var2 & 7) + class482.field5369;
				var5 = var1.readUnsignedByte();
				var6 = var1.readUnsignedShort();
				var7 = AsyncHttpResponse.worldView.plane;
				if (var3 >= 0 && var4 >= 0 && var3 < AsyncHttpResponse.worldView.sizeX && var4 < AsyncHttpResponse.worldView.sizeY) {
					NodeDeque var8 = AsyncHttpResponse.worldView.groundItems[var7][var3][var4];
					if (var8 != null) {
						for (TileItem var9 = (TileItem)var8.last(); var9 != null; var9 = (TileItem)var8.previous()) {
							if (var6 == var9.id) {
								var9.setFlag(var5);
								break;
							}
						}
					}

					if (var3 >= 0 && var4 >= 0 && var3 < AsyncHttpResponse.worldView.sizeX && var4 < AsyncHttpResponse.worldView.sizeY) {
						var35 = Client.overheadTextLimit == -1 ? AsyncHttpResponse.worldView.plane : Client.overheadTextLimit;
						HttpMethod.method83(var35, var3, var4, var6, var5);
					}

					return;
				}
			}

			if (class334.field3687 == var0) {
				var2 = var1.readUnsignedShort();
				var3 = var1.readUnsignedByteAdd();
				var4 = (var3 >> 4 & 7) + SpriteBufferProperties.field23;
				var5 = (var3 & 7) + class482.field5369;
				var6 = var1.readUnsignedIntLE();
				var7 = AsyncHttpResponse.worldView.plane;
				if (0 <= var4 && var4 < 104 && 0 <= var5 && var5 < 104) {
					var21 = Client.overheadTextLimit == -1 ? var7 : Client.overheadTextLimit;
					WorldMapLabel.method7017(var21, var4, var5, var2, var6);
				}

			} else {
				if (class334.field3698 == var0) {
					var2 = var1.readUnsignedByte();
					var3 = var2 >> 2;
					var4 = var2 & 3;
					var5 = Client.field284[var3];
					byte var27 = var1.readByteAdd();
					var7 = var1.readUnsignedShortAdd();
					var21 = var1.readUnsignedShortAdd();
					byte var20 = var1.readByteSub();
					byte var10 = var1.readByteSub();
					var11 = var1.readUnsignedShort();
					var12 = var1.readUnsignedByteAdd();
					var13 = (var12 >> 4 & 7) + SpriteBufferProperties.field23;
					var14 = (var12 & 7) + class482.field5369;
					var15 = var1.readUnsignedShortLE();
					byte var16 = var1.readByteNeg();
					Player var17;
					if (var21 == Client.localPlayerIndex) {
						var17 = class330.localPlayer;
					} else {
						var17 = (Player)AsyncHttpResponse.worldView.players.get((long)var21);
					}

					if (var17 != null) {
						var18 = Client.overheadTextLimit == -1 ? AsyncHttpResponse.worldView.plane : Client.overheadTextLimit;
						class586.method11444(var18, var13, var14, var3, var4, var5, var15, var7, var11, var10, var27, var16, var20, var17);
					}
				}

				if (class334.field3697 == var0) {
					var2 = var1.readUnsignedShortAdd();
					var3 = var1.readUnsignedByteSub();
					var4 = (var3 >> 4 & 7) + SpriteBufferProperties.field23;
					var5 = (var3 & 7) + class482.field5369;
					boolean var28 = var1.readUnsignedByteSub() == 1;
					var7 = var1.readUnsignedByteSub();
					var21 = var1.readUnsignedByteAdd();
					var35 = var1.readUnsignedShortLE();
					var30 = var1.readUnsignedIntLE();
					var11 = var1.readUnsignedShort();
					if (var4 >= 0 && var5 >= 0 && var4 < AsyncHttpResponse.worldView.sizeX && var5 < AsyncHttpResponse.worldView.sizeY) {
						var12 = Client.overheadTextLimit == -1 ? AsyncHttpResponse.worldView.plane : Client.overheadTextLimit;
						Widget.addTileItemToGroundItems(var12, var4, var5, var35, var30, var7, var2, var11, var21, var28);
					}

				} else if (class334.field3695 == var0) {
					var2 = var1.readUnsignedByte();
					var3 = (var2 >> 4 & 7) + SpriteBufferProperties.field23;
					var4 = (var2 & 7) + class482.field5369;
					var5 = var1.readUnsignedIntME();
					var6 = var1.readUnsignedShortAddLE();
					if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
						var7 = Client.overheadTextLimit == -1 ? AsyncHttpResponse.worldView.plane : Client.overheadTextLimit;
						AbstractWorldMapData.method7004(var7, var3, var4, var6, var5);
					}

				}
			}
		}
	}
}
