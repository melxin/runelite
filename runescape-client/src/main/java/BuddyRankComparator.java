import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
	@ObfuscatedName("av")
	static String[] field1522;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 139576529
	)
	@Export("canvasWidth")
	public static int canvasWidth;
	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "[Lvf;"
	)
	@Export("headIconPkSprites")
	static SpritePixels[] headIconPkSprites;
	@ObfuscatedName("ay")
	@Export("reversed")
	final boolean reversed;

	public BuddyRankComparator(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lsu;Lsu;I)I",
		garbageValue = "335257140"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.rank != var1.rank) {
			return this.reversed ? var1.rank - var2.rank : var2.rank - var1.rank;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILdb;I)Ldz;",
		garbageValue = "1501070296"
	)
	public static WorldView method3366(int var0, WorldViewManager var1) {
		Iterator var2 = var1.iterator();

		WorldView var3;
		do {
			if (!var2.hasNext()) {
				return var1.method2726();
			}

			var3 = (WorldView)var2.next();
		} while(var3.players[var0] == null || var3.id == -1);

		return var3;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "2021385313"
	)
	public static int method3362(int var0, int var1) {
		int var2 = var1 - var0 & 2047;
		return var2 > 1024 ? -(2048 - var2) : var2;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lqw;Lqw;Lqw;I)V",
		garbageValue = "-863541888"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (canvasWidth - 765) / 2;
		Login.loginBoxX = Login.xPadding + 202;
		UserComparator3.loginBoxCenter = Login.loginBoxX + 180;
		if (Login.worldSelectOpen) {
			class390.method7723(var0, var1);
		} else {
			WorldMapSectionType.leftTitleSprite.drawAt(Login.xPadding, 0);
			TriBool.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18);
			int var4;
			if (Client.gameState == 0 || Client.gameState == 5) {
				byte var3 = 20;
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1);
				var4 = 253 - var3;
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409);
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0);
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409);
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150 + Login.Login_loadingPercent * 3, var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0);
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1);
			}

			String var5;
			String var6;
			String var7;
			short var23;
			int var24;
			short var25;
			if (Client.gameState == 20) {
				Login.titleboxSprite.drawAt(Login.loginBoxX + 180 - Login.titleboxSprite.subWidth / 2, 271 - Login.titleboxSprite.subHeight / 2);
				var23 = 201;
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16776960, 0);
				var24 = var23 + 15;
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16776960, 0);
				var24 += 15;
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16776960, 0);
				var24 += 15;
				var24 += 7;
				if (Login.loginIndex != 4 && Login.loginIndex != 10) {
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var24, 16777215, 0);
					var25 = 200;
					var5 = class544.clientPreferences.isUsernameHidden() ? class106.method3069(Login.Login_username) : Login.Login_username;

					for (var6 = var5; var0.stringWidth(var6) > var25; var6 = var6.substring(0, var6.length() - 1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var6), Login.loginBoxX + 180 - 70, var24, 16777215, 0);
					var24 += 15;

					for (var7 = class106.method3069(Login.Login_password); var0.stringWidth(var7) > var25; var7 = var7.substring(1)) {
					}

					var0.draw("Password: " + var7, Login.loginBoxX + 180 - 108, var24, 16777215, 0);
					var24 += 15;
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11 || Client.gameState == 50) {
				Login.titleboxSprite.drawAt(Login.loginBoxX, 171);
				short var18;
				if (Login.loginIndex == 0) {
					var23 = 251;
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var23, 16776960, 0);
					var24 = var23 + 30;
					var4 = Login.loginBoxX + 180 - 80;
					var18 = 291;
					class454.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
					var0.drawLines("New User", var4 - 73, var18 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var4 = Login.loginBoxX + 180 + 80;
					class454.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
					var0.drawLines("Existing User", var4 - 73, var18 - 20, 144, 40, 16777215, 0, 1, 1, 0);
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
					var18 = 321;
					class454.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
					var0.drawCentered("Continue", var4, var18 + 5, 16777215, 0);
					var4 = Login.loginBoxX + 180 + 80;
					class454.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
					var0.drawCentered("Cancel", var4, var18 + 5, 16777215, 0);
				} else if (Login.loginIndex == 2) {
					var23 = 201;
					var0.drawCentered(Login.Login_response1, UserComparator3.loginBoxCenter, var23, 16776960, 0);
					var24 = var23 + 15;
					var0.drawCentered(Login.Login_response2, UserComparator3.loginBoxCenter, var24, 16776960, 0);
					var24 += 15;
					var0.drawCentered(Login.Login_response3, UserComparator3.loginBoxCenter, var24, 16776960, 0);
					var24 += 15;
					var24 += 7;
					var0.draw("Login: ", UserComparator3.loginBoxCenter - 110, var24, 16777215, 0);
					var25 = 200;
					var5 = class544.clientPreferences.isUsernameHidden() ? class106.method3069(Login.Login_username) : Login.Login_username;

					for (var6 = var5; var0.stringWidth(var6) > var25; var6 = var6.substring(1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var6) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? WorldViewManager.colorStartTag(16776960) + "|" : ""), UserComparator3.loginBoxCenter - 70, var24, 16777215, 0);
					var24 += 15;

					for (var7 = class106.method3069(Login.Login_password); var0.stringWidth(var7) > var25; var7 = var7.substring(1)) {
					}

					var0.draw("Password: " + var7 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? WorldViewManager.colorStartTag(16776960) + "|" : ""), UserComparator3.loginBoxCenter - 108, var24, 16777215, 0);
					var24 += 15;
					var23 = 277;
					int var8 = UserComparator3.loginBoxCenter + -117;
					boolean var10 = Client.Login_isUsernameRemembered;
					boolean var11 = Login.field944;
					IndexedSprite var9 = var10 ? (var11 ? PlayerUpdateManager.field1414 : FriendLoginUpdate.options_buttons_2Sprite) : (var11 ? Sound.field1724 : Login.options_buttons_0Sprite);
					var9.drawAt(var8, var23);
					var8 = var8 + var9.subWidth + 5;
					var1.draw("Remember username", var8, var23 + 13, 16776960, 0);
					var8 = UserComparator3.loginBoxCenter + 24;
					boolean var14 = class544.clientPreferences.isUsernameHidden();
					boolean var15 = Login.field945;
					IndexedSprite var13 = var14 ? (var15 ? PlayerUpdateManager.field1414 : FriendLoginUpdate.options_buttons_2Sprite) : (var15 ? Sound.field1724 : Login.options_buttons_0Sprite);
					var13.drawAt(var8, var23);
					var8 = var8 + var13.subWidth + 5;
					var1.draw("Hide username", var8, var23 + 13, 16776960, 0);
					var24 = var23 + 15;
					int var16 = UserComparator3.loginBoxCenter - 80;
					short var17 = 321;
					class454.titlebuttonSprite.drawAt(var16 - 73, var17 - 20);
					var0.drawCentered("Login", var16, var17 + 5, 16777215, 0);
					var16 = UserComparator3.loginBoxCenter + 80;
					class454.titlebuttonSprite.drawAt(var16 - 73, var17 - 20);
					var0.drawCentered("Cancel", var16, var17 + 5, 16777215, 0);
					var23 = 357;
					switch(Login.field933) {
					case 2:
						WorldMapDecorationType.field4073 = "Having trouble logging in?";
						break;
					default:
						WorldMapDecorationType.field4073 = "Can't login? Click here.";
					}

					class169.field1800 = new Bounds(UserComparator3.loginBoxCenter, var23, var1.stringWidth(WorldMapDecorationType.field4073), 11);
					WorldMapCacheName.field3266 = new Bounds(UserComparator3.loginBoxCenter, var23, var1.stringWidth("Still having trouble logging in?"), 11);
					var1.drawCentered(WorldMapDecorationType.field4073, UserComparator3.loginBoxCenter, var23, 16777215, 0);
				} else if (Login.loginIndex == 3) {
					var23 = 201;
					var0.drawCentered("Incorrect username or password.", Login.loginBoxX + 180, var23, 16776960, 0);
					var24 = var23 + 20;
					var1.drawCentered("If you have upgraded to a Jagex Account, you", Login.loginBoxX + 180, var24, 16776960, 0);
					var24 += 20;
					var1.drawCentered("need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", Login.loginBoxX + 180, var24, 16776960, 0);
					var24 += 15;
					var4 = Login.loginBoxX + 180;
					var18 = 276;
					class454.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
					var2.drawCentered("Try again", var4, var18 + 5, 16777215, 0);
					var4 = Login.loginBoxX + 180;
					var18 = 326;
					class454.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
					var2.drawCentered("Forgotten password?", var4, var18 + 5, 16777215, 0);
				} else {
					int var20;
					short var27;
					int var28;
					if (Login.loginIndex == 4) {
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0);
						var23 = 236;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16777215, 0);
						var24 = var23 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16777215, 0);
						var24 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16777215, 0);
						var24 += 15;
						var0.draw("PIN: " + class106.method3069(WorldEntity.otp) + (Client.cycle % 40 < 20 ? WorldViewManager.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var24, 16777215, 0);
						var24 -= 8;
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var24, 16776960, 0);
						var24 += 15;
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var24, 16776960, 0);
						var4 = 180 + Login.loginBoxX - 9 + var0.stringWidth("for 30 days: ") + 15;
						var28 = var24 - var0.ascent;
						IndexedSprite var26;
						if (Login.rememberUsername) {
							var26 = FriendLoginUpdate.options_buttons_2Sprite;
						} else {
							var26 = Login.options_buttons_0Sprite;
						}

						var26.drawAt(var4, var28);
						var24 += 15;
						var20 = Login.loginBoxX + 180 - 80;
						var27 = 321;
						class454.titlebuttonSprite.drawAt(var20 - 73, var27 - 20);
						var0.drawCentered("Continue", var20, var27 + 5, 16777215, 0);
						var20 = Login.loginBoxX + 180 + 80;
						class454.titlebuttonSprite.drawAt(var20 - 73, var27 - 20);
						var0.drawCentered("Cancel", var20, var27 + 5, 16777215, 0);
						var1.drawCentered("Can't login? Click here.", Login.loginBoxX + 180, var27 + 36, 16777215, 0);
					} else if (Login.loginIndex == 5) {
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
						var5 = class544.clientPreferences.isUsernameHidden() ? class106.method3069(Login.Login_username) : Login.Login_username;

						for (var6 = var5; var0.stringWidth(var6) > var25; var6 = var6.substring(1)) {
						}

						var0.draw(AbstractFont.escapeBrackets(var6) + (Client.cycle % 40 < 20 ? WorldViewManager.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var24, 16777215, 0);
						var24 += 15;
						var20 = Login.loginBoxX + 180 - 80;
						var27 = 321;
						class454.titlebuttonSprite.drawAt(var20 - 73, var27 - 20);
						var0.drawCentered("Recover", var20, var27 + 5, 16777215, 0);
						var20 = Login.loginBoxX + 180 + 80;
						class454.titlebuttonSprite.drawAt(var20 - 73, var27 - 20);
						var0.drawCentered("Back", var20, var27 + 5, 16777215, 0);
						var27 = 356;
						var1.drawCentered("Still having trouble logging in?", UserComparator3.loginBoxCenter, var27, 268435455, 0);
					} else if (Login.loginIndex == 6) {
						var23 = 201;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16776960, 0);
						var24 = var23 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16776960, 0);
						var24 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16776960, 0);
						var24 += 15;
						var4 = Login.loginBoxX + 180;
						var18 = 321;
						class454.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
						var0.drawCentered("Back", var4, var18 + 5, 16777215, 0);
					} else if (Login.loginIndex == 7) {
						if (class380.field4145 && !Client.onMobile) {
							var23 = 201;
							var0.drawCentered(Login.Login_response1, UserComparator3.loginBoxCenter, var23, 16776960, 0);
							var24 = var23 + 15;
							var0.drawCentered(Login.Login_response2, UserComparator3.loginBoxCenter, var24, 16776960, 0);
							var24 += 15;
							var0.drawCentered(Login.Login_response3, UserComparator3.loginBoxCenter, var24, 16776960, 0);
							var4 = UserComparator3.loginBoxCenter - 150;
							var24 += 10;

							for (var28 = 0; var28 < 8; ++var28) {
								class454.titlebuttonSprite.method10712(var4, var24, 30, 40);
								boolean var21 = var28 == Login.field941 & Client.cycle % 40 < 20;
								var0.draw((Login.field922[var28] == null ? "" : Login.field922[var28]) + (var21 ? WorldViewManager.colorStartTag(16776960) + "|" : ""), var4 + 10, var24 + 27, 16777215, 0);
								if (var28 != 1 && var28 != 3) {
									var4 += 35;
								} else {
									var4 += 50;
									var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var24 + 27, 16777215, 0);
								}
							}

							var28 = UserComparator3.loginBoxCenter - 80;
							short var29 = 321;
							class454.titlebuttonSprite.drawAt(var28 - 73, var29 - 20);
							var0.drawCentered("Submit", var28, var29 + 5, 16777215, 0);
							var28 = UserComparator3.loginBoxCenter + 80;
							class454.titlebuttonSprite.drawAt(var28 - 73, var29 - 20);
							var0.drawCentered("Cancel", var28, var29 + 5, 16777215, 0);
						} else {
							var23 = 216;
							var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var23, 16776960, 0);
							var24 = var23 + 15;
							var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var24, 16776960, 0);
							var24 += 15;
							var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var24, 16776960, 0);
							var24 += 15;
							var4 = Login.loginBoxX + 180 - 80;
							var18 = 321;
							class454.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
							var0.drawCentered("Set Date of Birth", var4, var18 + 5, 16777215, 0);
							var4 = Login.loginBoxX + 180 + 80;
							class454.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
							var0.drawCentered("Back", var4, var18 + 5, 16777215, 0);
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
						var18 = 321;
						class454.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
						var0.drawCentered("Privacy Policy", var4, var18 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180 + 80;
						class454.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
						var0.drawCentered("Back", var4, var18 + 5, 16777215, 0);
					} else if (Login.loginIndex == 9) {
						var23 = 221;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16776960, 0);
						var24 = var23 + 25;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16776960, 0);
						var24 += 25;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16776960, 0);
						var4 = Login.loginBoxX + 180;
						var18 = 311;
						class454.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
						var0.drawCentered("Try again", var4, var18 + 5, 16777215, 0);
					} else if (Login.loginIndex == 10) {
						var24 = Login.loginBoxX + 180;
						var25 = 209;
						var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var25, 16776960, 0);
						var4 = var25 + 20;
						Login.field953.drawAt(var24 - 109, var4);
						if (Login.displayName.isEmpty()) {
							class418.field4715.drawAt(var24 - 48, var4 + 18);
						} else {
							class418.field4715.drawAt(var24 - 48, var4 + 5);
							var0.drawCentered(Login.displayName, var24, var4 + 68 - 15, 16776960, 0);
						}
					} else if (Login.loginIndex == 12) {
						var24 = UserComparator3.loginBoxCenter;
						var25 = 216;
						var2.drawCentered("Before using this app, please read and accept our", var24, var25, 16777215, 0);
						var4 = var25 + 17;
						var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var24, var4, 16777215, 0);
						var4 += 17;
						var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var24, var4, 16777215, 0);
						var4 += 17;
						var2.drawCentered("By accepting, you agree to these documents.", var24, var4, 16777215, 0);
						var24 = UserComparator3.loginBoxCenter - 80;
						var25 = 311;
						class454.titlebuttonSprite.drawAt(var24 - 73, var25 - 20);
						var0.drawCentered("Accept", var24, var25 + 5, 16777215, 0);
						var24 = UserComparator3.loginBoxCenter + 80;
						class454.titlebuttonSprite.drawAt(var24 - 73, var25 - 20);
						var0.drawCentered("Decline", var24, var25 + 5, 16777215, 0);
					} else if (Login.loginIndex == 13) {
						var23 = 231;
						var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var23, 16777215, 0);
						var24 = var23 + 20;
						var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var24, 16777215, 0);
						var4 = Login.loginBoxX + 180;
						var23 = 311;
						class454.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 14) {
						var23 = 201;
						String var19 = "";
						var5 = "";
						var6 = "";
						switch(Login.Login_banType) {
						case 0:
							var19 = "Your account has been involved";
							var5 = "in serious rule breaking.";
							var6 = "";
							break;
						case 1:
							var19 = "Your account has been locked due to";
							var5 = "suspicious activity.";
							var6 = "Please recover your account.";
							break;
						case 2:
							var19 = "The unpaid balance on your account needs";
							var5 = "to be resolved before you can play.";
							var6 = Strings.field4301;
							break;
						default:
							class33.Login_promptCredentials(false);
						}

						var0.drawCentered(var19, Login.loginBoxX + 180, var23, 16776960, 0);
						var24 = var23 + 20;
						var0.drawCentered(var5, Login.loginBoxX + 180, var24, 16776960, 0);
						var24 += 20;
						var0.drawCentered(var6, Login.loginBoxX + 180, var24, 16776960, 0);
						var20 = Login.loginBoxX + 180;
						var27 = 276;
						class454.titlebuttonSprite.drawAt(var20 - 73, var27 - 20);
						if (Login.Login_banType == 1) {
							var0.drawCentered("Recover Account", var20, var27 + 5, 16777215, 0);
						} else {
							var0.drawCentered("View Appeal Options", var20, var27 + 5, 16777215, 0);
						}

						var20 = Login.loginBoxX + 180;
						var27 = 326;
						class454.titlebuttonSprite.drawAt(var20 - 73, var27 - 20);
						var0.drawCentered("Back", var20, var27 + 5, 16777215, 0);
					} else if (Login.loginIndex == 24) {
						var23 = 221;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16777215, 0);
						var24 = var23 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16777215, 0);
						var24 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16777215, 0);
						var24 += 15;
						var4 = Login.loginBoxX + 180;
						var18 = 301;
						class454.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
						var0.drawCentered("Ok", var4, var18 + 5, 16777215, 0);
					} else if (Login.loginIndex == 32) {
						var23 = 216;
						var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var23, 16776960, 0);
						var24 = var23 + 15;
						var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var24, 16776960, 0);
						var24 += 15;
						var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var24, 16776960, 0);
						var24 += 15;
						var4 = Login.loginBoxX + 180 - 80;
						var18 = 321;
						class454.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
						var0.drawCentered("Set Date of Birth", var4, var18 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180 + 80;
						class454.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
						var0.drawCentered("Back", var4, var18 + 5, 16777215, 0);
					} else if (Login.loginIndex == 33) {
						var23 = 201;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16776960, 0);
						var24 = var23 + 20;
						var1.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16776960, 0);
						var24 += 20;
						var1.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16776960, 0);
						var24 += 15;
						var4 = Login.loginBoxX + 180;
						var18 = 276;
						class454.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
						var2.drawCentered("Download Launcher", var4, var18 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180;
						var18 = 326;
						class454.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
						var2.drawCentered("Back", var4, var18 + 5, 16777215, 0);
					} else if (Login.loginIndex == 34) {
						var23 = 201;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16776960, 0);
						var24 = var23 + 20;
						var1.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16776960, 0);
						var24 += 20;
						var1.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16776960, 0);
						var4 = Login.loginBoxX + 180;
						var18 = 276;
						class454.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
						var6 = class149.World_request != null ? "Loading..." : "Switch World";
						var2.drawCentered(var6, var4, var18 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180;
						var18 = 326;
						class454.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
						var2.drawCentered("Back", var4, var18 + 5, 16777215, 0);
					}
				}
			}

			if (Client.gameState >= 10) {
				int[] var22 = new int[4];
				Rasterizer2D.Rasterizer2D_getClipArray(var22);
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, Huffman.canvasHeight);
				HttpHeaders.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle);
				HttpHeaders.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle);
				Rasterizer2D.Rasterizer2D_setClipArray(var22);
			}

			class169.title_muteSprite[class544.clientPreferences.isTitleMusicDisabled() ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463);
			if (Client.gameState > 5 && Language.Language_EN == ScriptFrame.clientLanguage) {
				if (class93.field1118 != null) {
					var24 = Login.xPadding + 5;
					var25 = 463;
					byte var31 = 100;
					byte var30 = 35;
					class93.field1118.drawAt(var24, var25);
					var0.drawCentered("World" + " " + Client.worldId, var31 / 2 + var24, var30 / 2 + var25 - 2, 16777215, 0);
					if (class149.World_request != null) {
						var1.drawCentered("Loading...", var31 / 2 + var24, var30 / 2 + var25 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var31 / 2 + var24, var30 / 2 + var25 + 12, 16777215, 0);
					}
				} else {
					class93.field1118 = AttackOption.SpriteBuffer_getIndexedSpriteByName(PcmPlayer.archive8, "sl_button", "");
				}
			}

		}
	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(Ldz;IIIII)Ldu;",
		garbageValue = "1789450078"
	)
	static final PendingSpawn method3365(WorldView var0, int var1, int var2, int var3, int var4) {
		for (PendingSpawn var5 = (PendingSpawn)var0.pendingSpawns.last(); var5 != null; var5 = (PendingSpawn)var0.pendingSpawns.previous()) {
			if (var5.plane == var1 && var2 == var5.x && var3 == var5.y && var4 == var5.type) {
				return var5;
			}
		}

		return null;
	}

	@ObfuscatedName("ml")
	@ObfuscatedSignature(
		descriptor = "([Lna;II)V",
		garbageValue = "389193373"
	)
	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) {
			Widget var3 = var0[var2];
			if (var3 != null) {
				if (var3.type == 0) {
					if (var3.children != null) {
						runComponentCloseListeners(var3.children, var1);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id);
					if (var4 != null) {
						Client.runIntfCloseListeners(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) {
					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onDialogAbort;
					Friend.runScriptEvent(var5);
				}

				if (var1 == 1 && var3.onSubChange != null) {
					if (var3.childIndex >= 0) {
						Widget var6 = ClanChannel.widgetDefinition.method7031(var3.id);
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) {
							continue;
						}
					}

					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onSubChange;
					Friend.runScriptEvent(var5);
				}
			}
		}

	}
}
