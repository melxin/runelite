import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ap")
@Implements("HttpMethod")
public class HttpMethod implements Enum {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lap;"
	)
	@Export("POST")
	public static final HttpMethod POST;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lap;"
	)
	@Export("GET")
	public static final HttpMethod GET;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lap;"
	)
	@Export("PUT")
	static final HttpMethod PUT;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lap;"
	)
	@Export("PATCH")
	static final HttpMethod PATCH;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lap;"
	)
	@Export("DELETE")
	static final HttpMethod DELETE;
	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	static Archive field39;
	@ObfuscatedName("uo")
	@Export("ClanChat_inClanChat")
	static boolean ClanChat_inClanChat;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1724406643
	)
	int field35;
	@ObfuscatedName("av")
	@Export("name")
	String name;
	@ObfuscatedName("am")
	boolean field37;
	@ObfuscatedName("aa")
	boolean field38;

	static {
		POST = new HttpMethod(0, "POST", true, true);
		GET = new HttpMethod(1, "GET", true, false);
		PUT = new HttpMethod(2, "PUT", false, true);
		PATCH = new HttpMethod(3, "PATCH", false, true);
		DELETE = new HttpMethod(4, "DELETE", false, true);
	}

	HttpMethod(int var1, String var2, boolean var3, boolean var4) {
		this.field35 = var1;
		this.name = var2;
		this.field37 = var3;
		this.field38 = var4;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1746725635"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field35;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-953554784"
	)
	boolean method64() {
		return this.field37;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1798000015"
	)
	@Export("getName")
	public String getName() {
		return this.name;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "72"
	)
	boolean method66() {
		return this.field38;
	}

	@ObfuscatedName("am")
	@Export("Entity_unpackID")
	public static int Entity_unpackID(long var0) {
		return (int)(var0 >>> 20 & 4294967295L);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-13"
	)
	static final int method71(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-262096386"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		int var1 = Login.loginIndex;
		if (var0 == -3) {
			TileItem.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) {
			TileItem.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) {
			TileItem.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) {
			class137.method3379(3);
			Login.field956 = 1;
		} else if (var0 == 4) {
			class94.method2565(0);
		} else if (var0 == 5) {
			Login.field956 = 2;
			TileItem.setLoginResponseString("Either your account is still logged in, or the last", "world you were using has become unavailable.", "Please try again later.");
		} else if (var0 == 68) {
			if (!Client.field638) {
				Client.field638 = true;
				class106.method2966();
				return;
			}

			TileItem.setLoginResponseString("RuneScape has been updated!", "Please restart your client.", "");
		} else if (!Client.onMobile && var0 == 6) {
			TileItem.setLoginResponseString("RuneScape has been updated!", "Please restart your client.", "");
		} else if (var0 == 7) {
			TileItem.setLoginResponseString("This world is full.", "Please use a different world.", "");
		} else if (var0 == 8) {
			TileItem.setLoginResponseString("Unable to connect.", "Login server offline.", "");
		} else if (var0 == 9) {
			TileItem.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
		} else if (var0 == 10) {
			TileItem.setLoginResponseString("Unable to connect.", "Bad session id.", "");
		} else if (var0 == 11) {
			TileItem.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
		} else if (var0 == 12) {
			class325.updateGameState(10);
			TileItem.setLoginResponseString("You need a members' account to use this world.", "Please subscribe to login to this world,", "or use a different world.");
			class137.method3379(34);
		} else if (var0 == 13) {
			TileItem.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
		} else if (var0 == 14) {
			TileItem.setLoginResponseString("The server is being updated.", "Please wait a few minutes", "before trying again.");
		} else if (var0 == 16) {
			TileItem.setLoginResponseString("Too many login attempts.", "You can use the Jagex Launcher to continue playing.", "Press the button below to download it now.");
			class137.method3379(33);
		} else if (var0 == 17) {
			TileItem.setLoginResponseString("To access this free world, log into a", "members world and move your character", "to a non-members area.");
		} else if (var0 == 18) {
			class94.method2565(1);
		} else if (var0 == 19) {
			TileItem.setLoginResponseString("This world is running a", "closed Beta. Please ", "use a different world.");
		} else if (var0 == 20) {
			TileItem.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
		} else if (var0 == 22) {
			TileItem.setLoginResponseString("Malformed login packet.", "Please try again.", "");
		} else if (var0 == 23) {
			TileItem.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 24) {
			TileItem.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
		} else if (var0 == 25) {
			TileItem.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
		} else if (var0 == 26) {
			TileItem.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
		} else if (var0 == 27) {
			TileItem.setLoginResponseString("", "Service unavailable.", "");
		} else if (var0 == 31) {
			TileItem.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
		} else if (var0 == 32) {
			class94.method2565(2);
		} else if (var0 == 37) {
			TileItem.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
		} else if (var0 == 38) {
			TileItem.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
		} else if (var0 == 74) {
			TileItem.setLoginResponseString("Access to this world is", "restricted. Please use", "a different world.");
		} else if (var0 == 55) {
			class137.method3379(8);
		} else {
			if (var0 == 56) {
				TileItem.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", "");
				class325.updateGameState(11);
				return;
			}

			if (var0 == 57) {
				TileItem.setLoginResponseString("The code you entered was incorrect.", "Please try again.", "");
				class325.updateGameState(11);
				return;
			}

			if (var0 == 61) {
				TileItem.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", "");
				class137.method3379(7);
			} else {
				if (var0 == 62) {
					class325.updateGameState(10);
					class137.method3379(9);
					TileItem.setLoginResponseString("Login attempt timed out.", "Please try again.", "");
					return;
				}

				if (var0 == 63) {
					class325.updateGameState(10);
					class137.method3379(9);
					TileItem.setLoginResponseString("You were signed out.", "Please sign in again.", "");
					return;
				}

				if (var0 == 65 || var0 == 67) {
					class325.updateGameState(10);
					class137.method3379(9);
					TileItem.setLoginResponseString("Failed to login.", "Please try again.", "");
					return;
				}

				if (var0 == 71) {
					class325.updateGameState(10);
					class137.method3379(7);
					TileItem.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
				} else if (var0 == 73) {
					class325.updateGameState(10);
					class137.method3379(6);
					TileItem.setLoginResponseString("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly.");
				} else if (var0 == 72) {
					class325.updateGameState(10);
					class137.method3379(32);
				} else {
					TileItem.setLoginResponseString("Unexpected server response", "Please try using a different world.", "");
				}
			}
		}

		class325.updateGameState(10);
		int var4 = Login.loginIndex;
		boolean var5 = var4 != var1;
		if (!var5 && Client.field515.method10602()) {
			class137.method3379(9);
		}

	}

	@ObfuscatedName("og")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "883300482"
	)
	public static boolean method79() {
		return Client.clickedWidget != null;
	}
}
