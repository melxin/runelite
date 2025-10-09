import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sl")
@Implements("IntHashTable")
public class IntHashTable {
	@ObfuscatedName("ab")
	@Export("array")
	int[] array;

	public IntHashTable(int[] var1) {
		int var2;
		for (var2 = 1; var2 <= (var1.length >> 1) + var1.length; var2 <<= 1) {
		}

		this.array = new int[var2 + var2];

		int var3;
		for (var3 = 0; var3 < var2 + var2; ++var3) {
			this.array[var3] = -1;
		}

		int var4;
		for (var3 = 0; var3 < var1.length; this.array[var4 + var4 + 1] = var3++) {
			for (var4 = var1[var3] & var2 - 1; this.array[var4 + var4 + 1] != -1; var4 = var4 + 1 & var2 - 1) {
			}

			this.array[var4 + var4] = var1[var3];
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2143167306"
	)
	@Export("get")
	public int get(int var1) {
		int var2 = (this.array.length >> 1) - 1;
		int var3 = var1 & var2;

		while (true) {
			int var4 = this.array[var3 + var3 + 1];
			if (var4 == -1) {
				return -1;
			}

			if (this.array[var3 + var3] == var1) {
				return var4;
			}

			var3 = var3 + 1 & var2;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lri;Lri;Lri;I)V",
		garbageValue = "-1092631531"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (class4.canvasWidth - 765) / 2;
		Login.loginBoxX = Login.xPadding + 202;
		ReflectionCheck.loginBoxCenter = Login.loginBoxX + 180;
		if (Login.worldSelectOpen) {
			class190.method4362(var0, var1);
		} else {
			HttpMethod.leftTitleSprite.drawAt(Login.xPadding, 0);
			class156.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			class1.logoSprite.drawAt(Login.xPadding + 382 - class1.logoSprite.subWidth / 2, 18);
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

			String var5;
			String var7;
			String var8;
			int var9;
			char[] var10;
			int var11;
			short var26;
			int var27;
			short var28;
			if (Client.gameState == 20) {
				class546.titleboxSprite.drawAt(Login.loginBoxX + 180 - class546.titleboxSprite.subWidth / 2, 271 - class546.titleboxSprite.subHeight / 2);
				var26 = 201;
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var26, 16776960, 0);
				var27 = var26 + 15;
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var27, 16776960, 0);
				var27 += 15;
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var27, 16776960, 0);
				var27 += 15;
				var27 += 7;
				if (Login.loginIndex != 4 && Login.loginIndex != 10 && Login.loginIndex != 1) {
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var27, 16777215, 0);
					var28 = 200;

					for (var5 = GraphicsObject.method1900(); var0.stringWidth(var5) > var28; var5 = var5.substring(0, var5.length() - 1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var5), Login.loginBoxX + 180 - 70, var27, 16777215, 0);
					var27 += 15;
					var7 = Login.Login_password;
					var9 = var7.length();
					var10 = new char[var9];

					for (var11 = 0; var11 < var9; ++var11) {
						var10[var11] = '*';
					}

					var8 = new String(var10);

					for (var8 = var8; var0.stringWidth(var8) > var28; var8 = var8.substring(1)) {
					}

					var0.draw("Password: " + var8, Login.loginBoxX + 180 - 108, var27, 16777215, 0);
					var27 += 15;
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11 || Client.gameState == 50) {
				class546.titleboxSprite.drawAt(Login.loginBoxX, 171);
				short var17;
				if (Login.loginIndex == 0) {
					var26 = 251;
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var26, 16776960, 0);
					var27 = var26 + 30;
					var4 = Login.loginBoxX + 180 - 80;
					var17 = 291;
					Huffman.titlebuttonSprite.drawAt(var4 - 73, var17 - 20);
					var0.drawLines("New User", var4 - 73, var17 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var4 = Login.loginBoxX + 180 + 80;
					Huffman.titlebuttonSprite.drawAt(var4 - 73, var17 - 20);
					var0.drawLines("Existing User", var4 - 73, var17 - 20, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (Login.loginIndex == 1) {
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0);
					var26 = 236;
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var26, 16777215, 0);
					var27 = var26 + 15;
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var27, 16777215, 0);
					var27 += 15;
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var27, 16777215, 0);
					var27 += 15;
					var4 = Login.loginBoxX + 180 - 80;
					var17 = 321;
					Huffman.titlebuttonSprite.drawAt(var4 - 73, var17 - 20);
					var0.drawCentered("Continue", var4, var17 + 5, 16777215, 0);
					var4 = Login.loginBoxX + 180 + 80;
					Huffman.titlebuttonSprite.drawAt(var4 - 73, var17 - 20);
					var0.drawCentered("Cancel", var4, var17 + 5, 16777215, 0);
				} else {
					String var6;
					int var19;
					if (Login.loginIndex == 2) {
						var26 = 201;
						var0.drawCentered(Login.Login_response1, ReflectionCheck.loginBoxCenter, var26, 16776960, 0);
						var27 = var26 + 15;
						var0.drawCentered(Login.Login_response2, ReflectionCheck.loginBoxCenter, var27, 16776960, 0);
						var27 += 15;
						var0.drawCentered(Login.Login_response3, ReflectionCheck.loginBoxCenter, var27, 16776960, 0);
						var27 += 15;
						var27 += 7;
						var0.draw("Login: ", ReflectionCheck.loginBoxCenter - 110, var27, 16777215, 0);
						var28 = 200;

						for (var5 = GraphicsObject.method1900(); var0.stringWidth(var5) > var28; var5 = var5.substring(1)) {
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? class171.colorStartTag(16776960) + "|" : ""), ReflectionCheck.loginBoxCenter - 70, var27, 16777215, 0);
						var27 += 15;

						for (var6 = class280.method6344(Login.Login_password); var0.stringWidth(var6) > var28; var6 = var6.substring(1)) {
						}

						var0.draw("Password: " + var6 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? class171.colorStartTag(16776960) + "|" : ""), ReflectionCheck.loginBoxCenter - 108, var27, 16777215, 0);
						var27 += 15;
						var26 = 277;
						var19 = ReflectionCheck.loginBoxCenter + -117;
						boolean var30 = Client.Login_isUsernameRemembered;
						boolean var22 = Login.field728;
						IndexedSprite var29 = var30 ? (var22 ? class409.field4989 : WorldViewManager.options_buttons_2Sprite) : (var22 ? Sound.field1826 : GrandExchangeOfferOwnWorldComparator.options_buttons_0Sprite);
						var29.drawAt(var19, var26);
						var19 = var19 + var29.subWidth + 5;
						var1.draw("Remember username", var19, var26 + 13, 16776960, 0);
						var19 = ReflectionCheck.loginBoxCenter + 24;
						boolean var13 = class154.clientPreferences.isUsernameHidden();
						boolean var14 = Login.field726;
						IndexedSprite var24 = var13 ? (var14 ? class409.field4989 : WorldViewManager.options_buttons_2Sprite) : (var14 ? Sound.field1826 : GrandExchangeOfferOwnWorldComparator.options_buttons_0Sprite);
						var24.drawAt(var19, var26);
						var19 = var19 + var24.subWidth + 5;
						var1.draw("Hide username", var19, var26 + 13, 16776960, 0);
						var27 = var26 + 15;
						int var15 = ReflectionCheck.loginBoxCenter - 80;
						short var16 = 321;
						Huffman.titlebuttonSprite.drawAt(var15 - 73, var16 - 20);
						var0.drawCentered("Login", var15, var16 + 5, 16777215, 0);
						var15 = ReflectionCheck.loginBoxCenter + 80;
						Huffman.titlebuttonSprite.drawAt(var15 - 73, var16 - 20);
						var0.drawCentered("Cancel", var15, var16 + 5, 16777215, 0);
						var26 = 357;
						switch(Login.field712) {
						case 2:
							GrandExchangeOfferOwnWorldComparator.field264 = "Having trouble logging in?";
							break;
						default:
							GrandExchangeOfferOwnWorldComparator.field264 = "Can't login? Click here.";
						}

						class164.field1882 = new Bounds(ReflectionCheck.loginBoxCenter, var26, var1.stringWidth(GrandExchangeOfferOwnWorldComparator.field264), 11);
						LoginState.field266 = new Bounds(ReflectionCheck.loginBoxCenter, var26, var1.stringWidth("Still having trouble logging in?"), 11);
						var1.drawCentered(GrandExchangeOfferOwnWorldComparator.field264, ReflectionCheck.loginBoxCenter, var26, 16777215, 0);
					} else if (Login.loginIndex == 3) {
						var26 = 201;
						var0.drawCentered("Incorrect username or password.", Login.loginBoxX + 180, var26, 16776960, 0);
						var27 = var26 + 20;
						var1.drawCentered("If you have upgraded to a Jagex Account, you", Login.loginBoxX + 180, var27, 16776960, 0);
						var27 += 20;
						var1.drawCentered("need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", Login.loginBoxX + 180, var27, 16776960, 0);
						var27 += 15;
						var4 = Login.loginBoxX + 180;
						var17 = 276;
						Huffman.titlebuttonSprite.drawAt(var4 - 73, var17 - 20);
						var2.drawCentered("Try again", var4, var17 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180;
						var17 = 326;
						Huffman.titlebuttonSprite.drawAt(var4 - 73, var17 - 20);
						var2.drawCentered("Forgotten password?", var4, var17 + 5, 16777215, 0);
					} else if (Login.loginIndex == 4) {
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0);
						var26 = 236;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var26, 16777215, 0);
						var27 = var26 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var27, 16777215, 0);
						var27 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var27, 16777215, 0);
						var27 += 15;
						var5 = "PIN: ";
						var7 = class572.otp;
						var9 = var7.length();
						var10 = new char[var9];

						for (var11 = 0; var11 < var9; ++var11) {
							var10[var11] = '*';
						}

						var8 = new String(var10);
						var0.draw(var5 + var8 + (Client.cycle % 40 < 20 ? class171.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var27, 16777215, 0);
						var27 -= 8;
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var27, 16776960, 0);
						var27 += 15;
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var27, 16776960, 0);
						int var20 = Login.loginBoxX + 180 - 9 + var0.stringWidth("for 30 days: ") + 15;
						var9 = var27 - var0.ascent;
						IndexedSprite var31;
						if (Login.rememberUsername) {
							var31 = WorldViewManager.options_buttons_2Sprite;
						} else {
							var31 = GrandExchangeOfferOwnWorldComparator.options_buttons_0Sprite;
						}

						var31.drawAt(var20, var9);
						var27 += 15;
						var11 = Login.loginBoxX + 180 - 80;
						short var12 = 321;
						Huffman.titlebuttonSprite.drawAt(var11 - 73, var12 - 20);
						var0.drawCentered("Continue", var11, var12 + 5, 16777215, 0);
						var11 = Login.loginBoxX + 180 + 80;
						Huffman.titlebuttonSprite.drawAt(var11 - 73, var12 - 20);
						var0.drawCentered("Cancel", var11, var12 + 5, 16777215, 0);
						var1.drawCentered("Can't login? Click here.", Login.loginBoxX + 180, var12 + 36, 16777215, 0);
					} else if (Login.loginIndex == 5) {
						var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0);
						var26 = 221;
						var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var26, 16776960, 0);
						var27 = var26 + 15;
						var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var27, 16776960, 0);
						var27 += 15;
						var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var27, 16776960, 0);
						var27 += 15;
						var27 += 14;
						var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var27, 16777215, 0);
						var28 = 174;

						for (var5 = GraphicsObject.method1900(); var0.stringWidth(var5) > var28; var5 = var5.substring(1)) {
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Client.cycle % 40 < 20 ? class171.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var27, 16777215, 0);
						var27 += 15;
						int var21 = Login.loginBoxX + 180 - 80;
						short var33 = 321;
						Huffman.titlebuttonSprite.drawAt(var21 - 73, var33 - 20);
						var0.drawCentered("Recover", var21, var33 + 5, 16777215, 0);
						var21 = Login.loginBoxX + 180 + 80;
						Huffman.titlebuttonSprite.drawAt(var21 - 73, var33 - 20);
						var0.drawCentered("Back", var21, var33 + 5, 16777215, 0);
						var33 = 356;
						var1.drawCentered("Still having trouble logging in?", ReflectionCheck.loginBoxCenter, var33, 268435455, 0);
					} else if (Login.loginIndex == 6) {
						var26 = 201;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var26, 16776960, 0);
						var27 = var26 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var27, 16776960, 0);
						var27 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var27, 16776960, 0);
						var27 += 15;
						var4 = Login.loginBoxX + 180;
						var17 = 321;
						Huffman.titlebuttonSprite.drawAt(var4 - 73, var17 - 20);
						var0.drawCentered("Back", var4, var17 + 5, 16777215, 0);
					} else if (Login.loginIndex == 7) {
						if (ModeWhere.field5150 && !Client.onMobile) {
							var26 = 201;
							var0.drawCentered(Login.Login_response1, ReflectionCheck.loginBoxCenter, var26, 16776960, 0);
							var27 = var26 + 15;
							var0.drawCentered(Login.Login_response2, ReflectionCheck.loginBoxCenter, var27, 16776960, 0);
							var27 += 15;
							var0.drawCentered(Login.Login_response3, ReflectionCheck.loginBoxCenter, var27, 16776960, 0);
							var4 = ReflectionCheck.loginBoxCenter - 150;
							var27 += 10;

							int var32;
							for (var32 = 0; var32 < 8; ++var32) {
								Huffman.titlebuttonSprite.method11838(var4, var27, 30, 40);
								boolean var35 = var32 == Login.field715 & Client.cycle % 40 < 20;
								var0.draw((Login.field714[var32] == null ? "" : Login.field714[var32]) + (var35 ? class171.colorStartTag(16776960) + "|" : ""), var4 + 10, var27 + 27, 16777215, 0);
								if (var32 != 1 && var32 != 3) {
									var4 += 35;
								} else {
									var4 += 50;
									var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var27 + 27, 16777215, 0);
								}
							}

							var32 = ReflectionCheck.loginBoxCenter - 80;
							short var36 = 321;
							Huffman.titlebuttonSprite.drawAt(var32 - 73, var36 - 20);
							var0.drawCentered("Submit", var32, var36 + 5, 16777215, 0);
							var32 = ReflectionCheck.loginBoxCenter + 80;
							Huffman.titlebuttonSprite.drawAt(var32 - 73, var36 - 20);
							var0.drawCentered("Cancel", var32, var36 + 5, 16777215, 0);
						} else {
							var26 = 216;
							var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var26, 16776960, 0);
							var27 = var26 + 15;
							var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var27, 16776960, 0);
							var27 += 15;
							var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var27, 16776960, 0);
							var27 += 15;
							var4 = Login.loginBoxX + 180 - 80;
							var17 = 321;
							Huffman.titlebuttonSprite.drawAt(var4 - 73, var17 - 20);
							var0.drawCentered("Set Date of Birth", var4, var17 + 5, 16777215, 0);
							var4 = Login.loginBoxX + 180 + 80;
							Huffman.titlebuttonSprite.drawAt(var4 - 73, var17 - 20);
							var0.drawCentered("Back", var4, var17 + 5, 16777215, 0);
						}
					} else if (Login.loginIndex == 8) {
						var26 = 216;
						var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var26, 16776960, 0);
						var27 = var26 + 15;
						var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var27, 16776960, 0);
						var27 += 15;
						var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var27, 16776960, 0);
						var27 += 15;
						var4 = Login.loginBoxX + 180 - 80;
						var17 = 321;
						Huffman.titlebuttonSprite.drawAt(var4 - 73, var17 - 20);
						var0.drawCentered("Privacy Policy", var4, var17 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180 + 80;
						Huffman.titlebuttonSprite.drawAt(var4 - 73, var17 - 20);
						var0.drawCentered("Back", var4, var17 + 5, 16777215, 0);
					} else if (Login.loginIndex == 9) {
						var26 = 221;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var26, 16776960, 0);
						var27 = var26 + 25;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var27, 16776960, 0);
						var27 += 25;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var27, 16776960, 0);
						var4 = Login.loginBoxX + 180;
						var17 = 311;
						Huffman.titlebuttonSprite.drawAt(var4 - 73, var17 - 20);
						var0.drawCentered("Try again", var4, var17 + 5, 16777215, 0);
					} else if (Login.loginIndex == 10) {
						var27 = Login.loginBoxX + 180;
						var28 = 209;
						var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var28, 16776960, 0);
						var4 = var28 + 20;
						class4.field10.drawAt(var27 - 109, var4);
						if (Login.displayName.isEmpty()) {
							InvDefinition.field1954.drawAt(var27 - 48, var4 + 18);
						} else {
							InvDefinition.field1954.drawAt(var27 - 48, var4 + 5);
							var0.drawCentered(Login.displayName, var27, var4 + 68 - 15, 16776960, 0);
						}
					} else if (Login.loginIndex == 12) {
						var27 = ReflectionCheck.loginBoxCenter;
						var28 = 216;
						var2.drawCentered("Before using this app, please read and accept our", var27, var28, 16777215, 0);
						var4 = var28 + 17;
						var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var27, var4, 16777215, 0);
						var4 += 17;
						var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var27, var4, 16777215, 0);
						var4 += 17;
						var2.drawCentered("By accepting, you agree to these documents.", var27, var4, 16777215, 0);
						var27 = ReflectionCheck.loginBoxCenter - 80;
						var28 = 311;
						Huffman.titlebuttonSprite.drawAt(var27 - 73, var28 - 20);
						var0.drawCentered("Accept", var27, var28 + 5, 16777215, 0);
						var27 = ReflectionCheck.loginBoxCenter + 80;
						Huffman.titlebuttonSprite.drawAt(var27 - 73, var28 - 20);
						var0.drawCentered("Decline", var27, var28 + 5, 16777215, 0);
					} else if (Login.loginIndex == 13) {
						var26 = 231;
						var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var26, 16777215, 0);
						var27 = var26 + 20;
						var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var27, 16777215, 0);
						var4 = Login.loginBoxX + 180;
						var26 = 311;
						Huffman.titlebuttonSprite.drawAt(var4 - 73, var26 - 20);
						var0.drawCentered("Back", var4, var26 + 5, 16777215, 0);
					} else if (Login.loginIndex == 14) {
						var26 = 201;
						String var18 = "";
						var5 = "";
						var6 = "";
						switch(Login.Login_banType) {
						case 0:
							var18 = "Your account has been involved";
							var5 = "in serious rule breaking.";
							var6 = "";
							break;
						case 1:
							var18 = "Your account has been locked due to";
							var5 = "suspicious activity.";
							var6 = "Please recover your account.";
							break;
						case 2:
							var18 = "The unpaid balance on your account needs";
							var5 = "to be resolved before you can play.";
							var6 = Strings.field4686;
							break;
						default:
							class146.Login_promptCredentials(false);
						}

						var0.drawCentered(var18, Login.loginBoxX + 180, var26, 16776960, 0);
						var27 = var26 + 20;
						var0.drawCentered(var5, Login.loginBoxX + 180, var27, 16776960, 0);
						var27 += 20;
						var0.drawCentered(var6, Login.loginBoxX + 180, var27, 16776960, 0);
						var19 = Login.loginBoxX + 180;
						short var34 = 276;
						Huffman.titlebuttonSprite.drawAt(var19 - 73, var34 - 20);
						if (Login.Login_banType == 1) {
							var0.drawCentered("Recover Account", var19, var34 + 5, 16777215, 0);
						} else {
							var0.drawCentered("View Appeal Options", var19, var34 + 5, 16777215, 0);
						}

						var19 = Login.loginBoxX + 180;
						var34 = 326;
						Huffman.titlebuttonSprite.drawAt(var19 - 73, var34 - 20);
						var0.drawCentered("Back", var19, var34 + 5, 16777215, 0);
					} else if (Login.loginIndex == 24) {
						var26 = 221;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var26, 16777215, 0);
						var27 = var26 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var27, 16777215, 0);
						var27 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var27, 16777215, 0);
						var27 += 15;
						var4 = Login.loginBoxX + 180;
						var17 = 301;
						Huffman.titlebuttonSprite.drawAt(var4 - 73, var17 - 20);
						var0.drawCentered("Ok", var4, var17 + 5, 16777215, 0);
					} else if (Login.loginIndex == 32) {
						var26 = 216;
						var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var26, 16776960, 0);
						var27 = var26 + 15;
						var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var27, 16776960, 0);
						var27 += 15;
						var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var27, 16776960, 0);
						var27 += 15;
						var4 = Login.loginBoxX + 180 - 80;
						var17 = 321;
						Huffman.titlebuttonSprite.drawAt(var4 - 73, var17 - 20);
						var0.drawCentered("Set Date of Birth", var4, var17 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180 + 80;
						Huffman.titlebuttonSprite.drawAt(var4 - 73, var17 - 20);
						var0.drawCentered("Back", var4, var17 + 5, 16777215, 0);
					} else if (Login.loginIndex == 33) {
						var26 = 201;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var26, 16776960, 0);
						var27 = var26 + 20;
						var1.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var27, 16776960, 0);
						var27 += 20;
						var1.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var27, 16776960, 0);
						var27 += 15;
						var4 = Login.loginBoxX + 180;
						var17 = 276;
						Huffman.titlebuttonSprite.drawAt(var4 - 73, var17 - 20);
						var2.drawCentered("Download Launcher", var4, var17 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180;
						var17 = 326;
						Huffman.titlebuttonSprite.drawAt(var4 - 73, var17 - 20);
						var2.drawCentered("Back", var4, var17 + 5, 16777215, 0);
					} else if (Login.loginIndex == 34) {
						var26 = 201;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var26, 16776960, 0);
						var27 = var26 + 20;
						var1.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var27, 16776960, 0);
						var27 += 20;
						var1.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var27, 16776960, 0);
						var4 = Login.loginBoxX + 180;
						var17 = 276;
						Huffman.titlebuttonSprite.drawAt(var4 - 73, var17 - 20);
						var6 = class204.World_request != null ? "Loading..." : "Switch World";
						var2.drawCentered(var6, var4, var17 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180;
						var17 = 326;
						Huffman.titlebuttonSprite.drawAt(var4 - 73, var17 - 20);
						var2.drawCentered("Back", var4, var17 + 5, 16777215, 0);
					}
				}
			}

			if (Client.gameState >= 10) {
				int[] var25 = new int[4];
				Rasterizer2D.Rasterizer2D_getClipArray(var25);
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, class558.canvasHeight);
				JagNetThread.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle);
				JagNetThread.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle);
				Rasterizer2D.Rasterizer2D_setClipArray(var25);
			}

			VarpDefinition.title_muteSprite[class154.clientPreferences.isTitleMusicDisabled() ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463);
			if (Client.gameState > 5 && class179.clientLanguage == Language.Language_EN) {
				if (Login.field731 != null) {
					var27 = Login.xPadding + 5;
					var28 = 463;
					byte var38 = 100;
					byte var37 = 35;
					Login.field731.drawAt(var27, var28);
					var0.drawCentered("World" + " " + Client.worldId, var38 / 2 + var27, var37 / 2 + var28 - 2, 16777215, 0);
					if (class204.World_request != null) {
						var1.drawCentered("Loading...", var38 / 2 + var27, var37 / 2 + var28 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var38 / 2 + var27, var37 / 2 + var28 + 12, 16777215, 0);
					}
				} else {
					Login.field731 = class334.SpriteBuffer_getIndexedSpriteByName(BoundaryObject.archive8, "sl_button", "");
				}
			}

		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)V",
		garbageValue = "-2016321198"
	)
	static void method9896(DynamicArray var0) {
		PacketBufferNode.method7052(var0, (class572)null, false);
	}
}
