import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ru")
@Implements("AddRequestTask")
public class AddRequestTask extends SongTask {
	@ObfuscatedSignature(
		descriptor = "(Lrh;)V"
	)
	public AddRequestTask(SongTask var1) {
		super(var1);
		super.field5090 = "AddRequestTask";
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1822823713"
	)
	public boolean vmethod9290() {
		while (!class335.field3704.isEmpty()) {
			MidiRequest var1 = (MidiRequest)class335.field3704.peek();
			if (var1 == null) {
				class335.field3704.pop();
			} else {
				var1.midiPcmStream = this.method9229();
				class335.midiRequests.add(var1);
				class335.field3704.pop();
			}
		}

		return true;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Lmt;",
		garbageValue = "-24"
	)
	MidiPcmStream method9229() {
		MidiPcmStream var1 = null;
		Iterator var2 = class335.field3694.iterator();

		while (true) {
			MidiPcmStream var3;
			do {
				do {
					if (!var2.hasNext()) {
						if (var1 != null) {
							++var1.field3739;
							if (var1.method7043() == 0 && var1.isReady()) {
								var1.clear();
								var1.method6981();
								var1.setPcmStreamVolume(0);
							}
						}

						return var1;
					}

					var3 = (MidiPcmStream)var2.next();
				} while(var3 == null);
			} while(var1 != null && var1.field3739 <= var3.field3739 && (var3.method7043() != 0 || !var3.isReady()));

			var1 = var3;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "([IB)Ltp;",
		garbageValue = "93"
	)
	public static class509 method9231(int[] var0) {
		class509 var1 = new class509(class563.field5600, true);
		var1.field5294 = var0;
		var1.field5287 = var0.length * 1090132113;
		var1.field5291 = var0.length;
		return var1;
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1470251607"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		int var1 = class172.method3911();
		if (var0 == -3) {
			MenuAction.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) {
			MenuAction.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) {
			MenuAction.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) {
			class85.method2689(3);
			Login.field741 = 1;
		} else if (var0 == 4) {
			class85.method2689(14);
			Login.Login_banType = 0;
		} else if (var0 == 5) {
			Login.field741 = 2;
			MenuAction.setLoginResponseString("Either your account is still logged in, or the last", "world you were using has become unavailable.", "Please try again later.");
		} else if (var0 == 68) {
			if (!Client.field443) {
				Client.field443 = true;
				HttpAuthenticationHeader.method9362();
				return;
			}

			MenuAction.setLoginResponseString("RuneScape has been updated!", "Please restart your client.", "");
		} else if (!Client.onMobile && var0 == 6) {
			MenuAction.setLoginResponseString("RuneScape has been updated!", "Please restart your client.", "");
		} else if (var0 == 7) {
			MenuAction.setLoginResponseString("This world is full.", "Please use a different world.", "");
		} else if (var0 == 8) {
			MenuAction.setLoginResponseString("Unable to connect.", "Login server offline.", "");
		} else if (var0 == 9) {
			MenuAction.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
		} else if (var0 == 10) {
			MenuAction.setLoginResponseString("Unable to connect.", "Bad session id.", "");
		} else if (var0 == 11) {
			MenuAction.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
		} else if (var0 == 12) {
			HealthBarConfig.updateGameState(10);
			MenuAction.setLoginResponseString("You need a members' account to use this world.", "Please subscribe to login to this world,", "or use a different world.");
			class85.method2689(34);
		} else if (var0 == 13) {
			MenuAction.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
		} else if (var0 == 14) {
			MenuAction.setLoginResponseString("The server is being updated.", "Please wait a few minutes", "before trying again.");
		} else if (var0 == 16) {
			MenuAction.setLoginResponseString("Too many login attempts.", "You can use the Jagex Launcher to continue playing.", "Press the button below to download it now.");
			class85.method2689(33);
		} else if (var0 == 17) {
			MenuAction.setLoginResponseString("To access this free world, log into a", "members world and move your character", "to a non-members area.");
		} else if (var0 == 18) {
			class85.method2689(14);
			Login.Login_banType = 1;
		} else if (var0 == 19) {
			MenuAction.setLoginResponseString("This world is running a", "closed Beta. Please ", "use a different world.");
		} else if (var0 == 20) {
			MenuAction.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
		} else if (var0 == 22) {
			MenuAction.setLoginResponseString("Malformed login packet.", "Please try again.", "");
		} else if (var0 == 23) {
			MenuAction.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 24) {
			MenuAction.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
		} else if (var0 == 25) {
			MenuAction.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
		} else if (var0 == 26) {
			MenuAction.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
		} else if (var0 == 27) {
			MenuAction.setLoginResponseString("", "Service unavailable.", "");
		} else if (var0 == 31) {
			MenuAction.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
		} else if (var0 == 32) {
			class85.method2689(14);
			Login.Login_banType = 2;
		} else if (var0 == 37) {
			MenuAction.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
		} else if (var0 == 38) {
			MenuAction.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
		} else if (var0 == 74) {
			MenuAction.setLoginResponseString("Access to this world is", "restricted. Please use", "a different world.");
		} else if (var0 == 55) {
			class85.method2689(8);
		} else {
			if (var0 == 56) {
				MenuAction.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", "");
				HealthBarConfig.updateGameState(11);
				return;
			}

			if (var0 == 57) {
				MenuAction.setLoginResponseString("The code you entered was incorrect.", "Please try again.", "");
				HealthBarConfig.updateGameState(11);
				return;
			}

			if (var0 == 61) {
				MenuAction.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", "");
				class85.method2689(7);
			} else {
				if (var0 == 62) {
					HealthBarConfig.updateGameState(10);
					class85.method2689(9);
					MenuAction.setLoginResponseString("Login attempt timed out.", "Please try again.", "");
					return;
				}

				if (var0 == 63) {
					HealthBarConfig.updateGameState(10);
					class85.method2689(9);
					MenuAction.setLoginResponseString("You were signed out.", "Please sign in again.", "");
					return;
				}

				if (var0 == 65 || var0 == 67) {
					HealthBarConfig.updateGameState(10);
					class85.method2689(9);
					MenuAction.setLoginResponseString("Failed to login.", "Please try again.", "");
					return;
				}

				if (var0 == 71) {
					HealthBarConfig.updateGameState(10);
					class85.method2689(7);
					MenuAction.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
				} else if (var0 == 73) {
					HealthBarConfig.updateGameState(10);
					class85.method2689(6);
					MenuAction.setLoginResponseString("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly.");
				} else if (var0 == 72) {
					HealthBarConfig.updateGameState(10);
					class85.method2689(32);
				} else {
					MenuAction.setLoginResponseString("Unexpected server response", "Please try using a different world.", "");
				}
			}
		}

		HealthBarConfig.updateGameState(10);
		boolean var2 = var1 != class172.method3911();
		if (!var2 && Client.field438.method11148()) {
			class85.method2689(9);
		}

	}
}
