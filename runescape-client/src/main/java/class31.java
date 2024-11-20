import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bb")
public class class31 {
	@ObfuscatedName("ab")
	static Applet field151;
	@ObfuscatedName("aw")
	static String field156;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1829325037
	)
	@Export("ItemDefinition_fileCount")
	public static int ItemDefinition_fileCount;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("pcmPlayerProvider")
	static class51 pcmPlayerProvider;
	@ObfuscatedName("mv")
	@ObfuscatedGetter(
		intValue = 1751453837
	)
	static int field153;

	static {
		field151 = null;
		field156 = "";
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIB)Ldt;",
		garbageValue = "110"
	)
	@Export("getScript")
	static Script getScript(int var0, int var1) {
		Script var2 = (Script)Script.Script_cached.get((long)(var0 << 16));
		if (var2 != null) {
			return var2;
		} else {
			String var3 = String.valueOf(var0);
			int var4 = class450.archive12.getGroupId(var3);
			if (var4 == -1) {
				return null;
			} else {
				byte[] var5 = class450.archive12.takeFileFlat(var4);
				if (var5 != null) {
					if (var5.length <= 1) {
						return null;
					}

					var2 = class153.newScript(var5);
					if (var2 != null) {
						Script.Script_cached.put(var2, (long)(var0 << 16));
						return var2;
					}
				}

				return null;
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IZB)Ljava/lang/String;",
		garbageValue = "-22"
	)
	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		if (var1 && var0 >= 0) {
			int var3 = var0;
			String var2;
			if (var1 && var0 >= 0) {
				int var4 = 2;

				for (int var5 = var0 / 10; var5 != 0; ++var4) {
					var5 /= 10;
				}

				char[] var6 = new char[var4];
				var6[0] = '+';

				for (int var7 = var4 - 1; var7 > 0; --var7) {
					int var8 = var3;
					var3 /= 10;
					int var9 = var8 - var3 * 10;
					if (var9 >= 10) {
						var6[var7] = (char)(var9 + 87);
					} else {
						var6[var7] = (char)(var9 + 48);
					}
				}

				var2 = new String(var6);
			} else {
				var2 = Integer.toString(var0, 10);
			}

			return var2;
		} else {
			return Integer.toString(var0);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1666863263"
	)
	public static void method439() {
		EnumComposition.EnumDefinition_cached.clear();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lql;FS)Lql;",
		garbageValue = "-6694"
	)
	public static final class426 method438(class426 var0, float var1) {
		class426 var2 = RouteStrategy.method5650(var0);
		var2.method8113(var1);
		return var2;
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "5"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) {
			if (Client.gameState == 30) {
				Client.field816.method5556();
			}

			if (Client.gameState == 0) {
				NpcOverrides.client.method499();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) {
				ViewportMouse.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
				Client.field548 = 0;
				Client.field696 = 0;
				Client.timer.method8801(var0);
				if (var0 != 20) {
					Client.authenticationScheme = SecureUrlRequester.clientPreferences.containsKey(Login.Login_username) ? AuthenticationScheme.USERNAME_PASSWORD_REMEMBER : AuthenticationScheme.USERNAME_PASSWORD;
				}
			}

			if (var0 != 20 && var0 != 40 && class228.field2462 != null) {
				class228.field2462.close();
				class228.field2462 = null;
			}

			if (Client.gameState == 25) {
				Client.field583 = 0;
				Client.field777 = 0;
				Client.field598 = 1;
				Client.field581 = 0;
				Client.field625 = 1;
			}

			int var1;
			if (var0 != 5 && var0 != 10) {
				if (var0 == 20) {
					var1 = Client.gameState == 11 ? 4 : 0;
					class53.method1070(class419.archive10, AttackOption.archive8, class268.field2990, false, var1);
				} else if (var0 == 11) {
					class53.method1070(class419.archive10, AttackOption.archive8, class268.field2990, false, 4);
				} else if (var0 == 50) {
					class106.setLoginResponseString("", "Updating date of birth...", "");
					class53.method1070(class419.archive10, AttackOption.archive8, class268.field2990, false, 7);
				} else if (var0 != 0 && Login.clearLoginScreen) {
					GrandExchangeOfferNameComparator.titleboxSprite = null;
					Login.titlebuttonSprite = null;
					Login.runesSprite = null;
					UserComparator10.leftTitleSprite = null;
					UserComparator7.rightTitleSprite = null;
					HttpResponse.logoSprite = null;
					Login.title_muteSprite = null;
					class227.options_buttons_0Sprite = null;
					Login.options_buttons_2Sprite = null;
					HealthBarUpdate.worldSelectBackSprites = null;
					class424.worldSelectFlagSprites = null;
					HttpMethod.worldSelectArrows = null;
					class182.worldSelectStars = null;
					class318.field3307 = null;
					class96.loginScreenRunesAnimation.method2703();
					WorldMapSprite.method6235(0, 100);
					class27.method396().method7669(true);
					Login.clearLoginScreen = false;
				}
			} else {
				var1 = Script.method2367() ? 0 : 12;
				class53.method1070(class419.archive10, AttackOption.archive8, class268.field2990, true, var1);
			}

			Client.gameState = var0;
		}
	}
}
