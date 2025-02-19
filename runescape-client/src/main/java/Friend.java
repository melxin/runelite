import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ss")
@Implements("Friend")
public class Friend extends Buddy {
	@ObfuscatedName("ab")
	boolean field5117;
	@ObfuscatedName("ay")
	boolean field5118;

	Friend() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lss;I)I",
		garbageValue = "1967942052"
	)
	@Export("compareToFriend")
	int compareToFriend(Friend var1) {
		if (super.world == Client.worldId && Client.worldId != var1.world) {
			return -1;
		} else if (Client.worldId == var1.world && super.world != Client.worldId) {
			return 1;
		} else if (super.world != 0 && var1.world == 0) {
			return -1;
		} else if (var1.world != 0 && super.world == 0) {
			return 1;
		} else if (this.field5117 && !var1.field5117) {
			return -1;
		} else if (!this.field5117 && var1.field5117) {
			return 1;
		} else if (this.field5118 && !var1.field5118) {
			return -1;
		} else if (!this.field5118 && var1.field5118) {
			return 1;
		} else {
			return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lsz;I)I",
		garbageValue = "-1986498122"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareToFriend((Friend)var1);
	}

	public int compareTo(Object var1) {
		return this.compareToFriend((Friend)var1);
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "149742143"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		int var1 = MusicPatchNode.method6833();
		if (var0 == -3) {
			class401.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) {
			class401.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) {
			class401.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) {
			ObjectComposition.method4206(3);
			Login.field954 = 1;
		} else if (var0 == 4) {
			ObjectComposition.method4206(14);
			Login.Login_banType = 0;
		} else if (var0 == 5) {
			Login.field954 = 2;
			class401.setLoginResponseString("Either your account is still logged in, or the last", "world you were using has become unavailable.", "Please try again later.");
		} else if (var0 == 68) {
			if (!Client.field629) {
				Client.field629 = true;
				ArchiveLoader.method2416();
				return;
			}

			class401.setLoginResponseString("RuneScape has been updated!", "Please restart your client.", "");
		} else if (!Client.onMobile && var0 == 6) {
			class401.setLoginResponseString("RuneScape has been updated!", "Please restart your client.", "");
		} else if (var0 == 7) {
			class401.setLoginResponseString("This world is full.", "Please use a different world.", "");
		} else if (var0 == 8) {
			class401.setLoginResponseString("Unable to connect.", "Login server offline.", "");
		} else if (var0 == 9) {
			class401.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
		} else if (var0 == 10) {
			class401.setLoginResponseString("Unable to connect.", "Bad session id.", "");
		} else if (var0 == 11) {
			class401.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
		} else if (var0 == 12) {
			class511.updateGameState(10);
			class401.setLoginResponseString("You need a members' account to use this world.", "Please subscribe to login to this world,", "or use a different world.");
			ObjectComposition.method4206(34);
		} else if (var0 == 13) {
			class401.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
		} else if (var0 == 14) {
			class401.setLoginResponseString("The server is being updated.", "Please wait a few minutes", "before trying again.");
		} else if (var0 == 16) {
			class401.setLoginResponseString("Too many login attempts.", "You can use the Jagex Launcher to continue playing.", "Press the button below to download it now.");
			ObjectComposition.method4206(33);
		} else if (var0 == 17) {
			class401.setLoginResponseString("To access this free world, log into a", "members world and move your character", "to a non-members area.");
		} else if (var0 == 18) {
			FriendsList.method9091(1);
		} else if (var0 == 19) {
			class401.setLoginResponseString("This world is running a", "closed Beta. Please ", "use a different world.");
		} else if (var0 == 20) {
			class401.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
		} else if (var0 == 22) {
			class401.setLoginResponseString("Malformed login packet.", "Please try again.", "");
		} else if (var0 == 23) {
			class401.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 24) {
			class401.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
		} else if (var0 == 25) {
			class401.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
		} else if (var0 == 26) {
			class401.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
		} else if (var0 == 27) {
			class401.setLoginResponseString("", "Service unavailable.", "");
		} else if (var0 == 31) {
			class401.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
		} else if (var0 == 32) {
			FriendsList.method9091(2);
		} else if (var0 == 37) {
			class401.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
		} else if (var0 == 38) {
			class401.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
		} else if (var0 == 74) {
			class401.setLoginResponseString("Access to this world is", "restricted. Please use", "a different world.");
		} else if (var0 == 55) {
			ObjectComposition.method4206(8);
		} else {
			if (var0 == 56) {
				class401.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", "");
				class511.updateGameState(11);
				return;
			}

			if (var0 == 57) {
				class401.setLoginResponseString("The code you entered was incorrect.", "Please try again.", "");
				class511.updateGameState(11);
				return;
			}

			if (var0 == 61) {
				class401.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", "");
				ObjectComposition.method4206(7);
			} else {
				if (var0 == 62) {
					class511.updateGameState(10);
					ObjectComposition.method4206(9);
					class401.setLoginResponseString("Login attempt timed out.", "Please try again.", "");
					return;
				}

				if (var0 == 63) {
					class511.updateGameState(10);
					ObjectComposition.method4206(9);
					class401.setLoginResponseString("You were signed out.", "Please sign in again.", "");
					return;
				}

				if (var0 == 65 || var0 == 67) {
					class511.updateGameState(10);
					ObjectComposition.method4206(9);
					class401.setLoginResponseString("Failed to login.", "Please try again.", "");
					return;
				}

				if (var0 == 71) {
					class511.updateGameState(10);
					ObjectComposition.method4206(7);
					class401.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
				} else if (var0 == 73) {
					class511.updateGameState(10);
					ObjectComposition.method4206(6);
					class401.setLoginResponseString("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly.");
				} else if (var0 == 72) {
					class511.updateGameState(10);
					ObjectComposition.method4206(32);
				} else {
					class401.setLoginResponseString("Unexpected server response", "Please try using a different world.", "");
				}
			}
		}

		class511.updateGameState(10);
		boolean var2 = var1 != MusicPatchNode.method6833();
		if (!var2 && Client.field554.method10536()) {
			ObjectComposition.method4206(9);
		}

	}
}
