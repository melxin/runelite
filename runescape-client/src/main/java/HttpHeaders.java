import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rs")
@Implements("HttpHeaders")
public class HttpHeaders {
	@ObfuscatedName("ae")
	@Export("headers")
	final Map headers;
	@ObfuscatedName("ao")
	@Export("acceptHeaderValues")
	final Map acceptHeaderValues;
	@ObfuscatedName("ac")
	@Export("decimalFormat")
	final DecimalFormat decimalFormat;

	public HttpHeaders() {
		this.headers = new HashMap();
		this.acceptHeaderValues = new HashMap();
		this.decimalFormat = new DecimalFormat();
		this.decimalFormat.setMaximumFractionDigits(2);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljavax/net/ssl/HttpsURLConnection;I)V",
		garbageValue = "1837619960"
	)
	@Export("setRequestProperties")
	public void setRequestProperties(HttpsURLConnection var1) {
		Iterator var2 = this.headers.entrySet().iterator();

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next();
			var1.setRequestProperty((String)var3.getKey(), (String)var3.getValue());
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Map;",
		garbageValue = "780660540"
	)
	@Export("getHeaders")
	public Map getHeaders() {
		return this.headers;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "13"
	)
	@Export("header")
	public void header(String var1, String var2) {
		if (var1 != null && !var1.isEmpty()) {
			this.headers.put(var1, var2 != null ? var2 : "");
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-2024806856"
	)
	@Export("removeHeader")
	public void removeHeader(String var1) {
		if (var1 != null && !var1.isEmpty()) {
			this.headers.remove(var1);
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lrq;Ljava/lang/String;I)V",
		garbageValue = "464257227"
	)
	@Export("authenticationHeader")
	void authenticationHeader(HttpAuthenticationHeader var1, String var2) {
		String var3 = String.format("%s %s", var1.getKey(), var2);
		this.header("Authorization", var3);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-153455252"
	)
	@Export("basicAuthentication")
	public void basicAuthentication(String var1) {
		this.authenticationHeader(HttpAuthenticationHeader.BASIC, var1);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "56"
	)
	@Export("bearerToken")
	public void bearerToken(String var1) {
		this.authenticationHeader(HttpAuthenticationHeader.BEARER, var1);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lto;I)V",
		garbageValue = "-988088142"
	)
	@Export("contentType")
	public void contentType(HttpContentType var1) {
		this.headers.put("Content-Type", var1.getValue());
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1981667517"
	)
	@Export("removeContentType")
	public void removeContentType() {
		this.headers.remove("Content-Type");
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lto;I)V",
		garbageValue = "1312672638"
	)
	@Export("accept")
	public void accept(HttpContentType var1) {
		this.acceptWithFactor(var1, 1.0F);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lto;FI)V",
		garbageValue = "1381500477"
	)
	@Export("acceptWithFactor")
	void acceptWithFactor(HttpContentType var1, float var2) {
		this.acceptHeaderValues.put(var1, Math.max(0.0F, Math.min(1.0F, var2)));
		this.updateAcceptHeader();
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1764940403"
	)
	@Export("updateAcceptHeader")
	void updateAcceptHeader() {
		this.headers.remove("Accept");
		if (!this.acceptHeaderValues.isEmpty()) {
			this.headers.put("Accept", this.getAcceptHeaderValue());
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "480488005"
	)
	@Export("getAcceptHeaderValue")
	String getAcceptHeaderValue() {
		ArrayList var1 = new ArrayList(this.acceptHeaderValues.entrySet());
		Collections.sort(var1, new class462(this));
		StringBuilder var2 = new StringBuilder();
		Iterator var3 = var1.iterator();

		while (var3.hasNext()) {
			Entry var4 = (Entry)var3.next();
			if (var2.length() > 0) {
				var2.append(",");
			}

			var2.append(((HttpContentType)var4.getKey()).getValue());
			float var5 = (Float)var4.getValue();
			if (var5 < 1.0F) {
				String var6 = this.decimalFormat.format((double)var5);
				var2.append(";q=").append(var6);
			}
		}

		return var2.toString();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lqu;Lqu;Lqu;I)V",
		garbageValue = "335005567"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (class329.canvasWidth - 765) / 2;
		Login.loginBoxX = Login.xPadding + 202;
		class217.loginBoxCenter = Login.loginBoxX + 180;
		if (Login.worldSelectOpen) {
			NpcOverrides.method3897(var0, var1);
		} else {
			UserComparator10.leftTitleSprite.drawAt(Login.xPadding, 0);
			UserComparator7.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			HttpResponse.logoSprite.drawAt(Login.xPadding + 382 - HttpResponse.logoSprite.subWidth / 2, 18);
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
			short var16;
			int var17;
			short var18;
			if (Client.gameState == 20) {
				GrandExchangeOfferNameComparator.titleboxSprite.drawAt(Login.loginBoxX + 180 - GrandExchangeOfferNameComparator.titleboxSprite.subWidth / 2, 271 - GrandExchangeOfferNameComparator.titleboxSprite.subHeight / 2);
				var16 = 201;
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var16, 16776960, 0);
				var17 = var16 + 15;
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var17, 16776960, 0);
				var17 += 15;
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var17, 16776960, 0);
				var17 += 15;
				var17 += 7;
				if (Login.loginIndex != 4 && Login.loginIndex != 10) {
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var17, 16777215, 0);
					var18 = 200;

					for (var5 = class1.method9(); var0.stringWidth(var5) > var18; var5 = var5.substring(0, var5.length() - 1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var5), Login.loginBoxX + 180 - 70, var17, 16777215, 0);
					var17 += 15;

					for (var6 = class4.method19(Login.Login_password); var0.stringWidth(var6) > var18; var6 = var6.substring(1)) {
					}

					var0.draw("Password: " + var6, Login.loginBoxX + 180 - 108, var17, 16777215, 0);
					var17 += 15;
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11 || Client.gameState == 50) {
				GrandExchangeOfferNameComparator.titleboxSprite.drawAt(Login.loginBoxX, 171);
				short var11;
				if (Login.loginIndex == 0) {
					var16 = 251;
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var16, 16776960, 0);
					var17 = var16 + 30;
					var4 = Login.loginBoxX + 180 - 80;
					var11 = 291;
					Login.titlebuttonSprite.drawAt(var4 - 73, var11 - 20);
					var0.drawLines("New User", var4 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var4 = Login.loginBoxX + 180 + 80;
					Login.titlebuttonSprite.drawAt(var4 - 73, var11 - 20);
					var0.drawLines("Existing User", var4 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (Login.loginIndex == 1) {
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0);
					var16 = 236;
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var16, 16777215, 0);
					var17 = var16 + 15;
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var17, 16777215, 0);
					var17 += 15;
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var17, 16777215, 0);
					var17 += 15;
					var4 = Login.loginBoxX + 180 - 80;
					var11 = 321;
					Login.titlebuttonSprite.drawAt(var4 - 73, var11 - 20);
					var0.drawCentered("Continue", var4, var11 + 5, 16777215, 0);
					var4 = Login.loginBoxX + 180 + 80;
					Login.titlebuttonSprite.drawAt(var4 - 73, var11 - 20);
					var0.drawCentered("Cancel", var4, var11 + 5, 16777215, 0);
				} else {
					int var7;
					if (Login.loginIndex == 2) {
						var16 = 201;
						var0.drawCentered(Login.Login_response1, class217.loginBoxCenter, var16, 16776960, 0);
						var17 = var16 + 15;
						var0.drawCentered(Login.Login_response2, class217.loginBoxCenter, var17, 16776960, 0);
						var17 += 15;
						var0.drawCentered(Login.Login_response3, class217.loginBoxCenter, var17, 16776960, 0);
						var17 += 15;
						var17 += 7;
						var0.draw("Login: ", class217.loginBoxCenter - 110, var17, 16777215, 0);
						var18 = 200;

						for (var5 = class1.method9(); var0.stringWidth(var5) > var18; var5 = var5.substring(1)) {
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? class438.colorStartTag(16776960) + "|" : ""), class217.loginBoxCenter - 70, var17, 16777215, 0);
						var17 += 15;

						for (var6 = class4.method19(Login.Login_password); var0.stringWidth(var6) > var18; var6 = var6.substring(1)) {
						}

						var0.draw("Password: " + var6 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? class438.colorStartTag(16776960) + "|" : ""), class217.loginBoxCenter - 108, var17, 16777215, 0);
						var17 += 15;
						var16 = 277;
						var7 = class217.loginBoxCenter + -117;
						IndexedSprite var14 = class6.method44(Client.Login_isUsernameRemembered, Login.field949);
						var14.drawAt(var7, var16);
						var7 = var7 + var14.subWidth + 5;
						var1.draw("Remember username", var7, var16 + 13, 16776960, 0);
						var7 = class217.loginBoxCenter + 24;
						var14 = class6.method44(SecureUrlRequester.clientPreferences.isUsernameHidden(), Login.field935);
						var14.drawAt(var7, var16);
						var7 = var7 + var14.subWidth + 5;
						var1.draw("Hide username", var7, var16 + 13, 16776960, 0);
						var17 = var16 + 15;
						int var9 = class217.loginBoxCenter - 80;
						short var10 = 321;
						Login.titlebuttonSprite.drawAt(var9 - 73, var10 - 20);
						var0.drawCentered("Login", var9, var10 + 5, 16777215, 0);
						var9 = class217.loginBoxCenter + 80;
						Login.titlebuttonSprite.drawAt(var9 - 73, var10 - 20);
						var0.drawCentered("Cancel", var9, var10 + 5, 16777215, 0);
						var16 = 357;
						switch(Login.field939) {
						case 2:
							class326.field3591 = "Having trouble logging in?";
							break;
						default:
							class326.field3591 = "Can't login? Click here.";
						}

						class139.field1625 = new Bounds(class217.loginBoxCenter, var16, var1.stringWidth(class326.field3591), 11);
						FloorUnderlayDefinition.field2082 = new Bounds(class217.loginBoxCenter, var16, var1.stringWidth("Still having trouble logging in?"), 11);
						var1.drawCentered(class326.field3591, class217.loginBoxCenter, var16, 16777215, 0);
					} else if (Login.loginIndex == 3) {
						var16 = 201;
						var0.drawCentered("Incorrect username or password.", Login.loginBoxX + 180, var16, 16776960, 0);
						var17 = var16 + 20;
						var1.drawCentered("If you have upgraded to a Jagex Account, you", Login.loginBoxX + 180, var17, 16776960, 0);
						var17 += 20;
						var1.drawCentered("need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", Login.loginBoxX + 180, var17, 16776960, 0);
						var17 += 15;
						var4 = Login.loginBoxX + 180;
						var11 = 276;
						Login.titlebuttonSprite.drawAt(var4 - 73, var11 - 20);
						var2.drawCentered("Try again", var4, var11 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180;
						var11 = 326;
						Login.titlebuttonSprite.drawAt(var4 - 73, var11 - 20);
						var2.drawCentered("Forgotten password?", var4, var11 + 5, 16777215, 0);
					} else {
						short var8;
						int var21;
						if (Login.loginIndex == 4) {
							var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0);
							var16 = 236;
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var16, 16777215, 0);
							var17 = var16 + 15;
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var17, 16777215, 0);
							var17 += 15;
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var17, 16777215, 0);
							var17 += 15;
							var0.draw("PIN: " + class4.method19(Client.otp) + (Client.cycle % 40 < 20 ? class438.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var17, 16777215, 0);
							var17 -= 8;
							var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var17, 16776960, 0);
							var17 += 15;
							var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var17, 16776960, 0);
							var4 = Login.loginBoxX + 180 - 9 + var0.stringWidth("for 30 days: ") + 15;
							var21 = var17 - var0.ascent;
							IndexedSprite var19;
							if (Login.rememberUsername) {
								var19 = Login.options_buttons_2Sprite;
							} else {
								var19 = class227.options_buttons_0Sprite;
							}

							var19.drawAt(var4, var21);
							var17 += 15;
							var7 = Login.loginBoxX + 180 - 80;
							var8 = 321;
							Login.titlebuttonSprite.drawAt(var7 - 73, var8 - 20);
							var0.drawCentered("Continue", var7, var8 + 5, 16777215, 0);
							var7 = Login.loginBoxX + 180 + 80;
							Login.titlebuttonSprite.drawAt(var7 - 73, var8 - 20);
							var0.drawCentered("Cancel", var7, var8 + 5, 16777215, 0);
							var1.drawCentered("Can't login? Click here.", Login.loginBoxX + 180, var8 + 36, 16777215, 0);
						} else if (Login.loginIndex == 5) {
							var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0);
							var16 = 221;
							var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var16, 16776960, 0);
							var17 = var16 + 15;
							var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var17, 16776960, 0);
							var17 += 15;
							var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var17, 16776960, 0);
							var17 += 15;
							var17 += 14;
							var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var17, 16777215, 0);
							var18 = 174;

							for (var5 = class1.method9(); var0.stringWidth(var5) > var18; var5 = var5.substring(1)) {
							}

							var0.draw(AbstractFont.escapeBrackets(var5) + (Client.cycle % 40 < 20 ? class438.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var17, 16777215, 0);
							var17 += 15;
							int var13 = Login.loginBoxX + 180 - 80;
							short var20 = 321;
							Login.titlebuttonSprite.drawAt(var13 - 73, var20 - 20);
							var0.drawCentered("Recover", var13, var20 + 5, 16777215, 0);
							var13 = Login.loginBoxX + 180 + 80;
							Login.titlebuttonSprite.drawAt(var13 - 73, var20 - 20);
							var0.drawCentered("Back", var13, var20 + 5, 16777215, 0);
							var20 = 356;
							var1.drawCentered("Still having trouble logging in?", class217.loginBoxCenter, var20, 268435455, 0);
						} else if (Login.loginIndex == 6) {
							var16 = 201;
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var16, 16776960, 0);
							var17 = var16 + 15;
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var17, 16776960, 0);
							var17 += 15;
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var17, 16776960, 0);
							var17 += 15;
							var4 = Login.loginBoxX + 180;
							var11 = 321;
							Login.titlebuttonSprite.drawAt(var4 - 73, var11 - 20);
							var0.drawCentered("Back", var4, var11 + 5, 16777215, 0);
						} else if (Login.loginIndex == 7) {
							if (IndexCheck.field3003 && !Client.onMobile) {
								var16 = 201;
								var0.drawCentered(Login.Login_response1, class217.loginBoxCenter, var16, 16776960, 0);
								var17 = var16 + 15;
								var0.drawCentered(Login.Login_response2, class217.loginBoxCenter, var17, 16776960, 0);
								var17 += 15;
								var0.drawCentered(Login.Login_response3, class217.loginBoxCenter, var17, 16776960, 0);
								var4 = class217.loginBoxCenter - 150;
								var17 += 10;

								for (var21 = 0; var21 < 8; ++var21) {
									Login.titlebuttonSprite.method10548(var4, var17, 30, 40);
									boolean var22 = var21 == Login.field947 & Client.cycle % 40 < 20;
									var0.draw((Login.field948[var21] == null ? "" : Login.field948[var21]) + (var22 ? class438.colorStartTag(16776960) + "|" : ""), var4 + 10, var17 + 27, 16777215, 0);
									if (var21 != 1 && var21 != 3) {
										var4 += 35;
									} else {
										var4 += 50;
										var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var17 + 27, 16777215, 0);
									}
								}

								var21 = class217.loginBoxCenter - 80;
								short var23 = 321;
								Login.titlebuttonSprite.drawAt(var21 - 73, var23 - 20);
								var0.drawCentered("Submit", var21, var23 + 5, 16777215, 0);
								var21 = class217.loginBoxCenter + 80;
								Login.titlebuttonSprite.drawAt(var21 - 73, var23 - 20);
								var0.drawCentered("Cancel", var21, var23 + 5, 16777215, 0);
							} else {
								var16 = 216;
								var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var16, 16776960, 0);
								var17 = var16 + 15;
								var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var17, 16776960, 0);
								var17 += 15;
								var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var17, 16776960, 0);
								var17 += 15;
								var4 = Login.loginBoxX + 180 - 80;
								var11 = 321;
								Login.titlebuttonSprite.drawAt(var4 - 73, var11 - 20);
								var0.drawCentered("Set Date of Birth", var4, var11 + 5, 16777215, 0);
								var4 = Login.loginBoxX + 180 + 80;
								Login.titlebuttonSprite.drawAt(var4 - 73, var11 - 20);
								var0.drawCentered("Back", var4, var11 + 5, 16777215, 0);
							}
						} else if (Login.loginIndex == 8) {
							var16 = 216;
							var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var16, 16776960, 0);
							var17 = var16 + 15;
							var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var17, 16776960, 0);
							var17 += 15;
							var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var17, 16776960, 0);
							var17 += 15;
							var4 = Login.loginBoxX + 180 - 80;
							var11 = 321;
							Login.titlebuttonSprite.drawAt(var4 - 73, var11 - 20);
							var0.drawCentered("Privacy Policy", var4, var11 + 5, 16777215, 0);
							var4 = Login.loginBoxX + 180 + 80;
							Login.titlebuttonSprite.drawAt(var4 - 73, var11 - 20);
							var0.drawCentered("Back", var4, var11 + 5, 16777215, 0);
						} else if (Login.loginIndex == 9) {
							var16 = 221;
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var16, 16776960, 0);
							var17 = var16 + 25;
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var17, 16776960, 0);
							var17 += 25;
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var17, 16776960, 0);
							var4 = Login.loginBoxX + 180;
							var11 = 311;
							Login.titlebuttonSprite.drawAt(var4 - 73, var11 - 20);
							var0.drawCentered("Try again", var4, var11 + 5, 16777215, 0);
						} else if (Login.loginIndex == 10) {
							var17 = Login.loginBoxX + 180;
							var18 = 209;
							var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var18, 16776960, 0);
							var4 = var18 + 20;
							Login.field930.drawAt(var17 - 109, var4);
							if (Login.displayName.isEmpty()) {
								ClanChannelMember.field1690.drawAt(var17 - 48, var4 + 18);
							} else {
								ClanChannelMember.field1690.drawAt(var17 - 48, var4 + 5);
								var0.drawCentered(Login.displayName, var17, var4 + 68 - 15, 16776960, 0);
							}
						} else if (Login.loginIndex == 12) {
							var17 = class217.loginBoxCenter;
							var18 = 216;
							var2.drawCentered("Before using this app, please read and accept our", var17, var18, 16777215, 0);
							var4 = var18 + 17;
							var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var17, var4, 16777215, 0);
							var4 += 17;
							var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var17, var4, 16777215, 0);
							var4 += 17;
							var2.drawCentered("By accepting, you agree to these documents.", var17, var4, 16777215, 0);
							var17 = class217.loginBoxCenter - 80;
							var18 = 311;
							Login.titlebuttonSprite.drawAt(var17 - 73, var18 - 20);
							var0.drawCentered("Accept", var17, var18 + 5, 16777215, 0);
							var17 = class217.loginBoxCenter + 80;
							Login.titlebuttonSprite.drawAt(var17 - 73, var18 - 20);
							var0.drawCentered("Decline", var17, var18 + 5, 16777215, 0);
						} else if (Login.loginIndex == 13) {
							var16 = 231;
							var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var16, 16777215, 0);
							var17 = var16 + 20;
							var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var17, 16777215, 0);
							var4 = Login.loginBoxX + 180;
							var16 = 311;
							Login.titlebuttonSprite.drawAt(var4 - 73, var16 - 20);
							var0.drawCentered("Back", var4, var16 + 5, 16777215, 0);
						} else if (Login.loginIndex == 14) {
							var16 = 201;
							String var12 = "";
							var5 = "";
							var6 = "";
							switch(Login.Login_banType) {
							case 0:
								var12 = "Your account has been involved";
								var5 = "in serious rule breaking.";
								var6 = "";
								break;
							case 1:
								var12 = "Your account has been locked due to";
								var5 = "suspicious activity.";
								var6 = "Please recover your account.";
								break;
							case 2:
								var12 = "The unpaid balance on your account needs";
								var5 = "to be resolved before you can play.";
								var6 = Strings.field4300;
								break;
							default:
								GameEngine.Login_promptCredentials(false);
							}

							var0.drawCentered(var12, Login.loginBoxX + 180, var16, 16776960, 0);
							var17 = var16 + 20;
							var0.drawCentered(var5, Login.loginBoxX + 180, var17, 16776960, 0);
							var17 += 20;
							var0.drawCentered(var6, Login.loginBoxX + 180, var17, 16776960, 0);
							var7 = Login.loginBoxX + 180;
							var8 = 276;
							Login.titlebuttonSprite.drawAt(var7 - 73, var8 - 20);
							if (Login.Login_banType == 1) {
								var0.drawCentered("Recover Account", var7, var8 + 5, 16777215, 0);
							} else {
								var0.drawCentered("View Appeal Options", var7, var8 + 5, 16777215, 0);
							}

							var7 = Login.loginBoxX + 180;
							var8 = 326;
							Login.titlebuttonSprite.drawAt(var7 - 73, var8 - 20);
							var0.drawCentered("Back", var7, var8 + 5, 16777215, 0);
						} else if (Login.loginIndex == 24) {
							var16 = 221;
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var16, 16777215, 0);
							var17 = var16 + 15;
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var17, 16777215, 0);
							var17 += 15;
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var17, 16777215, 0);
							var17 += 15;
							var4 = Login.loginBoxX + 180;
							var11 = 301;
							Login.titlebuttonSprite.drawAt(var4 - 73, var11 - 20);
							var0.drawCentered("Ok", var4, var11 + 5, 16777215, 0);
						} else if (Login.loginIndex == 32) {
							var16 = 216;
							var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var16, 16776960, 0);
							var17 = var16 + 15;
							var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var17, 16776960, 0);
							var17 += 15;
							var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var17, 16776960, 0);
							var17 += 15;
							var4 = Login.loginBoxX + 180 - 80;
							var11 = 321;
							Login.titlebuttonSprite.drawAt(var4 - 73, var11 - 20);
							var0.drawCentered("Set Date of Birth", var4, var11 + 5, 16777215, 0);
							var4 = Login.loginBoxX + 180 + 80;
							Login.titlebuttonSprite.drawAt(var4 - 73, var11 - 20);
							var0.drawCentered("Back", var4, var11 + 5, 16777215, 0);
						} else if (Login.loginIndex == 33) {
							var16 = 201;
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var16, 16776960, 0);
							var17 = var16 + 20;
							var1.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var17, 16776960, 0);
							var17 += 20;
							var1.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var17, 16776960, 0);
							var17 += 15;
							var4 = Login.loginBoxX + 180;
							var11 = 276;
							Login.titlebuttonSprite.drawAt(var4 - 73, var11 - 20);
							var2.drawCentered("Download Launcher", var4, var11 + 5, 16777215, 0);
							var4 = Login.loginBoxX + 180;
							var11 = 326;
							Login.titlebuttonSprite.drawAt(var4 - 73, var11 - 20);
							var2.drawCentered("Back", var4, var11 + 5, 16777215, 0);
						} else if (Login.loginIndex == 34) {
							var16 = 201;
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var16, 16776960, 0);
							var17 = var16 + 20;
							var1.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var17, 16776960, 0);
							var17 += 20;
							var1.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var17, 16776960, 0);
							var4 = Login.loginBoxX + 180;
							var11 = 276;
							Login.titlebuttonSprite.drawAt(var4 - 73, var11 - 20);
							var6 = class169.World_request != null ? "Loading..." : "Switch World";
							var2.drawCentered(var6, var4, var11 + 5, 16777215, 0);
							var4 = Login.loginBoxX + 180;
							var11 = 326;
							Login.titlebuttonSprite.drawAt(var4 - 73, var11 - 20);
							var2.drawCentered("Back", var4, var11 + 5, 16777215, 0);
						}
					}
				}
			}

			if (Client.gameState >= 10) {
				int[] var15 = new int[4];
				Rasterizer2D.Rasterizer2D_getClipArray(var15);
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, class535.canvasHeight);
				class96.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle);
				class96.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle);
				Rasterizer2D.Rasterizer2D_setClipArray(var15);
			}

			Login.title_muteSprite[SecureUrlRequester.clientPreferences.isTitleMusicDisabled() ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463);
			if (Client.gameState > 5 && class276.clientLanguage == Language.Language_EN) {
				if (class318.field3307 != null) {
					var17 = Login.xPadding + 5;
					var18 = 463;
					byte var25 = 100;
					byte var24 = 35;
					class318.field3307.drawAt(var17, var18);
					var0.drawCentered("World" + " " + Client.worldId, var25 / 2 + var17, var24 / 2 + var18 - 2, 16777215, 0);
					if (class169.World_request != null) {
						var1.drawCentered("Loading...", var25 / 2 + var17, var24 / 2 + var18 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var25 / 2 + var17, var24 / 2 + var18 + 12, 16777215, 0);
					}
				} else {
					class318.field3307 = Fonts.SpriteBuffer_getIndexedSpriteByName(AttackOption.archive8, "sl_button", "");
				}
			}

		}
	}
}
