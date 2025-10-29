import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qj")
public class class437 {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	static final class437 field5144;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	static final class437 field5141;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	static final class437 field5140;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	static final class437 field5142;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lxt;"
	)
	@Export("sceneMinimapSprite")
	static SpritePixels sceneMinimapSprite;

	static {
		field5144 = new class437();
		field5141 = new class437();
		field5140 = new class437();
		field5142 = new class437();
	}

	class437() {
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "966597198"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		int var1 = Login.loginIndex;
		if (var0 == -3) {
			class525.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) {
			class525.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) {
			class525.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) {
			class30.method484(3);
			Login.field688 = 1;
		} else if (var0 == 4) {
			class30.method484(14);
			Login.Login_banType = 0;
		} else if (var0 == 5) {
			Login.field688 = 2;
			class525.setLoginResponseString("Either your account is still logged in, or the last", "world you were using has become unavailable.", "Please try again later.");
		} else if (var0 == 68) {
			if (!Client.field417) {
				Client.field417 = true;
				class144.method3892();
				return;
			}

			class525.setLoginResponseString("RuneScape has been updated!", "Please restart your client.", "");
		} else if (!Client.onMobile && var0 == 6) {
			class525.setLoginResponseString("RuneScape has been updated!", "Please restart your client.", "");
		} else if (var0 == 7) {
			class525.setLoginResponseString("This world is full.", "Please use a different world.", "");
		} else if (var0 == 8) {
			class525.setLoginResponseString("Unable to connect.", "Login server offline.", "");
		} else if (var0 == 9) {
			class525.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
		} else if (var0 == 10) {
			class525.setLoginResponseString("Unable to connect.", "Bad session id.", "");
		} else if (var0 == 11) {
			class525.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
		} else if (var0 == 12) {
			WorldMapSectionType.updateGameState(10);
			class525.setLoginResponseString("You need a members' account to use this world.", "Please subscribe to login to this world,", "or use a different world.");
			class30.method484(34);
		} else if (var0 == 13) {
			class525.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
		} else if (var0 == 14) {
			class525.setLoginResponseString("The server is being updated.", "Please wait a few minutes", "before trying again.");
		} else if (var0 == 16) {
			class525.setLoginResponseString("Too many login attempts.", "You can use the Jagex Launcher to continue playing.", "Press the button below to download it now.");
			class30.method484(33);
		} else if (var0 == 17) {
			class525.setLoginResponseString("To access this free world, log into a", "members world and move your character", "to a non-members area.");
		} else if (var0 == 18) {
			class30.method484(14);
			Login.Login_banType = 1;
		} else if (var0 == 19) {
			class525.setLoginResponseString("This world is running a", "closed Beta. Please ", "use a different world.");
		} else if (var0 == 20) {
			class525.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
		} else if (var0 == 22) {
			class525.setLoginResponseString("Malformed login packet.", "Please try again.", "");
		} else if (var0 == 23) {
			class525.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 24) {
			class525.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
		} else if (var0 == 25) {
			class525.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
		} else if (var0 == 26) {
			class525.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
		} else if (var0 == 27) {
			class525.setLoginResponseString("", "Service unavailable.", "");
		} else if (var0 == 31) {
			class525.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
		} else if (var0 == 32) {
			class30.method484(14);
			Login.Login_banType = 2;
		} else if (var0 == 37) {
			class525.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
		} else if (var0 == 38) {
			class525.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
		} else if (var0 == 74) {
			class525.setLoginResponseString("Access to this world is", "restricted. Please use", "a different world.");
		} else if (var0 == 55) {
			class30.method484(8);
		} else {
			if (var0 == 56) {
				class525.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", "");
				WorldMapSectionType.updateGameState(11);
				return;
			}

			if (var0 == 57) {
				class525.setLoginResponseString("The code you entered was incorrect.", "Please try again.", "");
				WorldMapSectionType.updateGameState(11);
				return;
			}

			if (var0 == 61) {
				class525.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", "");
				class30.method484(7);
			} else {
				if (var0 == 62) {
					WorldMapSectionType.updateGameState(10);
					class30.method484(9);
					class525.setLoginResponseString("Login attempt timed out.", "Please try again.", "");
					return;
				}

				if (var0 == 63) {
					WorldMapSectionType.updateGameState(10);
					class30.method484(9);
					class525.setLoginResponseString("You were signed out.", "Please sign in again.", "");
					return;
				}

				if (var0 == 65 || var0 == 67) {
					WorldMapSectionType.updateGameState(10);
					class30.method484(9);
					class525.setLoginResponseString("Failed to login.", "Please try again.", "");
					return;
				}

				if (var0 == 71) {
					WorldMapSectionType.updateGameState(10);
					class30.method484(7);
					class525.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
				} else if (var0 == 73) {
					WorldMapSectionType.updateGameState(10);
					class30.method484(6);
					class525.setLoginResponseString("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly.");
				} else if (var0 == 72) {
					WorldMapSectionType.updateGameState(10);
					class30.method484(32);
				} else {
					class525.setLoginResponseString("Unexpected server response", "Please try using a different world.", "");
				}
			}
		}

		WorldMapSectionType.updateGameState(10);
		int var4 = Login.loginIndex;
		boolean var5 = var4 != var1;
		if (!var5 && Client.field422.method11953()) {
			class30.method484(9);
		}

	}
}
