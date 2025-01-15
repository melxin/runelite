import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("ay")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("ah")
	@Export("lock")
	Object lock;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -2087384675
	)
	@Export("index")
	int index;
	@ObfuscatedName("ao")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("ad")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("an")
	@Export("millis")
	long[] millis;

	MouseRecorder() {
		this.isRunning = true;
		this.lock = new Object();
		this.index = 0;
		this.xs = new int[500];
		this.ys = new int[500];
		this.millis = new long[500];
	}

	public void run() {
		for (; this.isRunning; class174.method3881(50L)) {
			synchronized(this.lock) {
				if (this.index < 500) {
					this.xs[this.index] = MouseHandler.MouseHandler_x;
					this.ys[this.index] = MouseHandler.MouseHandler_y;
					this.millis[this.index] = MouseHandler.MouseHandler_millis;
					++this.index;
				}
			}
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-5635"
	)
	static void method2635() {
		try {
			File var0 = new File(HttpContentType.userHomeDirectory, "random.dat");
			int var2;
			if (var0.exists()) {
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0);
			} else {
				label38:
				for (int var1 = 0; var1 < BuddyRankComparator.field1522.length; ++var1) {
					for (var2 = 0; var2 < class355.field3789.length; ++var2) {
						File var3 = new File(class355.field3789[var2] + BuddyRankComparator.field1522[var1] + File.separatorChar + "random.dat");
						if (var3.exists()) {
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var3, "rw", 25L), 24, 0);
							break label38;
						}
					}
				}
			}

			if (JagexCache.JagexCache_randomDat == null) {
				RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
				var2 = var4.read();
				var4.seek(0L);
				var4.write(var2);
				var4.seek(0L);
				var4.close();
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0);
			}
		} catch (IOException var5) {
		}

	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1832120228"
	)
	@Export("stringCp1252NullTerminatedByteSize")
	public static int stringCp1252NullTerminatedByteSize(String var0) {
		return var0.length() + 1;
	}

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-67"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		int var1 = class336.method6884();
		if (var0 == -3) {
			class150.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) {
			class150.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) {
			class150.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) {
			Varcs.method3212(3);
			Login.field933 = 1;
		} else if (var0 == 4) {
			GameObject.method4822(0);
		} else if (var0 == 5) {
			Login.field933 = 2;
			class150.setLoginResponseString("Either your account is still logged in, or the last", "world you were using has become unavailable.", "Please try again later.");
		} else if (var0 == 68) {
			if (!Client.field511) {
				Client.field511 = true;
				ModelData0.method4808();
				return;
			}

			class150.setLoginResponseString("RuneScape has been updated!", "Please restart your client.", "");
		} else if (!Client.onMobile && var0 == 6) {
			class150.setLoginResponseString("RuneScape has been updated!", "Please restart your client.", "");
		} else if (var0 == 7) {
			class150.setLoginResponseString("This world is full.", "Please use a different world.", "");
		} else if (var0 == 8) {
			class150.setLoginResponseString("Unable to connect.", "Login server offline.", "");
		} else if (var0 == 9) {
			class150.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
		} else if (var0 == 10) {
			class150.setLoginResponseString("Unable to connect.", "Bad session id.", "");
		} else if (var0 == 11) {
			class150.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
		} else if (var0 == 12) {
			class360.updateGameState(10);
			class150.setLoginResponseString("You need a members' account to use this world.", "Please subscribe to login to this world,", "or use a different world.");
			Varcs.method3212(34);
		} else if (var0 == 13) {
			class150.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
		} else if (var0 == 14) {
			class150.setLoginResponseString("The server is being updated.", "Please wait a few minutes", "before trying again.");
		} else if (var0 == 16) {
			class150.setLoginResponseString("Too many login attempts.", "You can use the Jagex Launcher to continue playing.", "Press the button below to download it now.");
			Varcs.method3212(33);
		} else if (var0 == 17) {
			class150.setLoginResponseString("To access this free world, log into a", "members world and move your character", "to a non-members area.");
		} else if (var0 == 18) {
			GameObject.method4822(1);
		} else if (var0 == 19) {
			class150.setLoginResponseString("This world is running a", "closed Beta. Please ", "use a different world.");
		} else if (var0 == 20) {
			class150.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
		} else if (var0 == 22) {
			class150.setLoginResponseString("Malformed login packet.", "Please try again.", "");
		} else if (var0 == 23) {
			class150.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 24) {
			class150.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
		} else if (var0 == 25) {
			class150.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
		} else if (var0 == 26) {
			class150.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
		} else if (var0 == 27) {
			class150.setLoginResponseString("", "Service unavailable.", "");
		} else if (var0 == 31) {
			class150.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
		} else if (var0 == 32) {
			GameObject.method4822(2);
		} else if (var0 == 37) {
			class150.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
		} else if (var0 == 38) {
			class150.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
		} else if (var0 == 74) {
			class150.setLoginResponseString("Access to this world is", "restricted. Please use", "a different world.");
		} else if (var0 == 55) {
			Varcs.method3212(8);
		} else {
			if (var0 == 56) {
				class150.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", "");
				class360.updateGameState(11);
				return;
			}

			if (var0 == 57) {
				class150.setLoginResponseString("The code you entered was incorrect.", "Please try again.", "");
				class360.updateGameState(11);
				return;
			}

			if (var0 == 61) {
				class150.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", "");
				Varcs.method3212(7);
			} else {
				if (var0 == 62) {
					class360.updateGameState(10);
					Varcs.method3212(9);
					class150.setLoginResponseString("Login attempt timed out.", "Please try again.", "");
					return;
				}

				if (var0 == 63) {
					class360.updateGameState(10);
					Varcs.method3212(9);
					class150.setLoginResponseString("You were signed out.", "Please sign in again.", "");
					return;
				}

				if (var0 == 65 || var0 == 67) {
					class360.updateGameState(10);
					Varcs.method3212(9);
					class150.setLoginResponseString("Failed to login.", "Please try again.", "");
					return;
				}

				if (var0 == 71) {
					class360.updateGameState(10);
					Varcs.method3212(7);
					class150.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
				} else if (var0 == 73) {
					class360.updateGameState(10);
					Varcs.method3212(6);
					class150.setLoginResponseString("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly.");
				} else if (var0 == 72) {
					class360.updateGameState(10);
					Varcs.method3212(32);
				} else {
					class150.setLoginResponseString("Unexpected server response", "Please try using a different world.", "");
				}
			}
		}

		class360.updateGameState(10);
		boolean var2 = var1 != class336.method6884();
		if (!var2 && Client.field741.method10576()) {
			Varcs.method3212(9);
		}

	}
}
