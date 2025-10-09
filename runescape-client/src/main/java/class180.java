import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gd")
public class class180 extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("field1851")
	static EvictingDualNodeHashTable field1851;

	static {
		field1851 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lbv;",
		garbageValue = "2017660362"
	)
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0;
		return class546.getNextWorldListWorld();
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2018226227"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		int var1 = class445.method9002();
		if (var0 == -3) {
			class203.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) {
			class203.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) {
			class203.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) {
			class146.method3876(3);
			Login.field712 = 1;
		} else if (var0 == 4) {
			class146.method3876(14);
			Login.Login_banType = 0;
		} else if (var0 == 5) {
			Login.field712 = 2;
			class203.setLoginResponseString("Either your account is still logged in, or the last", "world you were using has become unavailable.", "Please try again later.");
		} else if (var0 == 68) {
			if (!Client.field330) {
				Client.field330 = true;
				Occluder.method5462();
				return;
			}

			class203.setLoginResponseString("RuneScape has been updated!", "Please restart your client.", "");
		} else if (!Client.onMobile && var0 == 6) {
			class203.setLoginResponseString("RuneScape has been updated!", "Please restart your client.", "");
		} else if (var0 == 7) {
			class203.setLoginResponseString("This world is full.", "Please use a different world.", "");
		} else if (var0 == 8) {
			class203.setLoginResponseString("Unable to connect.", "Login server offline.", "");
		} else if (var0 == 9) {
			class203.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
		} else if (var0 == 10) {
			class203.setLoginResponseString("Unable to connect.", "Bad session id.", "");
		} else if (var0 == 11) {
			class203.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
		} else if (var0 == 12) {
			class135.updateGameState(10);
			class203.setLoginResponseString("You need a members' account to use this world.", "Please subscribe to login to this world,", "or use a different world.");
			class146.method3876(34);
		} else if (var0 == 13) {
			class203.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
		} else if (var0 == 14) {
			class203.setLoginResponseString("The server is being updated.", "Please wait a few minutes", "before trying again.");
		} else if (var0 == 16) {
			class203.setLoginResponseString("Too many login attempts.", "You can use the Jagex Launcher to continue playing.", "Press the button below to download it now.");
			class146.method3876(33);
		} else if (var0 == 17) {
			class203.setLoginResponseString("To access this free world, log into a", "members world and move your character", "to a non-members area.");
		} else if (var0 == 18) {
			class146.method3876(14);
			Login.Login_banType = 1;
		} else if (var0 == 19) {
			class203.setLoginResponseString("This world is running a", "closed Beta. Please ", "use a different world.");
		} else if (var0 == 20) {
			class203.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
		} else if (var0 == 22) {
			class203.setLoginResponseString("Malformed login packet.", "Please try again.", "");
		} else if (var0 == 23) {
			class203.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 24) {
			class203.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
		} else if (var0 == 25) {
			class203.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
		} else if (var0 == 26) {
			class203.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
		} else if (var0 == 27) {
			class203.setLoginResponseString("", "Service unavailable.", "");
		} else if (var0 == 31) {
			class203.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
		} else if (var0 == 32) {
			class146.method3876(14);
			Login.Login_banType = 2;
		} else if (var0 == 37) {
			class203.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
		} else if (var0 == 38) {
			class203.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
		} else if (var0 == 74) {
			class203.setLoginResponseString("Access to this world is", "restricted. Please use", "a different world.");
		} else if (var0 == 55) {
			class146.method3876(8);
		} else {
			if (var0 == 56) {
				class203.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", "");
				class135.updateGameState(11);
				return;
			}

			if (var0 == 57) {
				class203.setLoginResponseString("The code you entered was incorrect.", "Please try again.", "");
				class135.updateGameState(11);
				return;
			}

			if (var0 == 61) {
				class203.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", "");
				class146.method3876(7);
			} else {
				if (var0 == 62) {
					class135.updateGameState(10);
					class146.method3876(9);
					class203.setLoginResponseString("Login attempt timed out.", "Please try again.", "");
					return;
				}

				if (var0 == 63) {
					class135.updateGameState(10);
					class146.method3876(9);
					class203.setLoginResponseString("You were signed out.", "Please sign in again.", "");
					return;
				}

				if (var0 == 65 || var0 == 67) {
					class135.updateGameState(10);
					class146.method3876(9);
					class203.setLoginResponseString("Failed to login.", "Please try again.", "");
					return;
				}

				if (var0 == 71) {
					class135.updateGameState(10);
					class146.method3876(7);
					class203.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
				} else if (var0 == 73) {
					class135.updateGameState(10);
					class146.method3876(6);
					class203.setLoginResponseString("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly.");
				} else if (var0 == 72) {
					class135.updateGameState(10);
					class146.method3876(32);
				} else {
					class203.setLoginResponseString("Unexpected server response", "Please try using a different world.", "");
				}
			}
		}

		class135.updateGameState(10);
		boolean var2 = var1 != class445.method9002();
		if (!var2 && Client.field310.method11670()) {
			class146.method3876(9);
		}

	}
}
