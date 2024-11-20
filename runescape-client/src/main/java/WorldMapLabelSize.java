import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kb")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("tp")
	@ObfuscatedGetter(
		intValue = -1737128745
	)
	static int field3089;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -458057567
	)
	final int field3092;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 458330195
	)
	final int field3093;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -335993063
	)
	final int field3096;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(1, 0, 4);
		WorldMapLabelSize_medium = new WorldMapLabelSize(0, 1, 2);
		WorldMapLabelSize_large = new WorldMapLabelSize(2, 2, 0);
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field3092 = var1;
		this.field3093 = var2;
		this.field3096 = var3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(FI)Z",
		garbageValue = "768554708"
	)
	boolean method5787(float var1) {
		return var1 >= (float)this.field3096;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[Lkb;",
		garbageValue = "-802551298"
	)
	static WorldMapLabelSize[] method5790() {
		return new WorldMapLabelSize[]{WorldMapLabelSize_medium, WorldMapLabelSize_small, WorldMapLabelSize_large};
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-666636236"
	)
	static int method5794(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "463680902"
	)
	static final boolean method5795(int var0) {
		return var0 == 1 || var0 == 2 || var0 >= 3 && var0 <= 6 || var0 == 1001;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1005694341"
	)
	public static void method5789() {
		try {
			JagexCache.JagexCache_dat2File.close();

			for (int var0 = 0; var0 < class201.field2090; ++var0) {
				UserComparator7.JagexCache_idxFiles[var0].close();
			}

			JagexCache.JagexCache_idx255File.close();
			JagexCache.JagexCache_randomDat.close();
		} catch (Exception var2) {
		}

	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1489107050"
	)
	static void method5797() {
		Client.field698 = true;
		if (HttpRequestTask.varcs != null && HttpRequestTask.varcs.hasUnwrittenChanges()) {
			HttpRequestTask.varcs.write();
		}

		class53.method1057();
		class135.method3320();
		if (class190.mouseRecorder != null) {
			class190.mouseRecorder.isRunning = false;
		}

		class190.mouseRecorder = null;
		Client.packetWriter.close();
		if (GameEngine.taskHandler != null) {
			try {
				GameEngine.taskHandler.close();
			} catch (Exception var2) {
			}
		}

		GameEngine.taskHandler = null;
		Huffman.clear();
		GrandExchangeOfferAgeComparator.method7711();
		Client.worldViewManager.clear();
		class158.worldMap = null;
		WorldMapSprite.method6235(0, 0);
		FloorOverlayDefinition.method4257();
		Client.playingJingle = false;
		MouseRecorder.method2503();
		if (class75.pcmPlayer1 != null) {
			class75.pcmPlayer1.shutdown();
		}

		GrandExchangeOfferTotalQuantityComparator.field4633.method7655();
		GameBuild.method7465();
		if (class167.urlRequester != null) {
			class167.urlRequester.close();
		}

		method5789();
		JagexCache.JagexCache_dat2File = null;
		JagexCache.JagexCache_idx255File = null;
		UserComparator7.JagexCache_idxFiles = null;
		class191.method3889();
		class346.masterDisk = null;
		Client.archiveLoaders.clear();
		Client.field549 = 0;
		GrandExchangeOfferTotalQuantityComparator.field4633 = new JagNetThread();
		class167.urlRequester = new SecureUrlRequester(NpcOverrides.client.https, 227);

		try {
			class177.method3741("oldschool", class47.field323, class4.field10.name, 0, 23);
		} catch (IOException var1) {
			throw new RuntimeException(var1);
		}

		class346.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
		GameEngine.taskHandler = new TaskHandler();
		NpcOverrides.client.method484();
		class497.method9339(class95.field1151);
		class31.updateGameState(0);
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "91005951"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		int var1 = FriendsChat.method8962();
		if (var0 == -3) {
			class106.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) {
			class106.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) {
			class106.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) {
			class329.updateLoginIndex(3);
			Login.field939 = 1;
		} else if (var0 == 4) {
			class329.updateLoginIndex(14);
			Login.Login_banType = 0;
		} else if (var0 == 5) {
			Login.field939 = 2;
			class106.setLoginResponseString("Either your account is still logged in, or the last", "world you were using has become unavailable.", "Please try again later.");
		} else if (var0 == 68) {
			if (!Client.field521) {
				Client.field521 = true;
				method5797();
				return;
			}

			class106.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", "");
		} else if (!Client.onMobile && var0 == 6) {
			class106.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", "");
		} else if (var0 == 7) {
			class106.setLoginResponseString("This world is full.", "Please use a different world.", "");
		} else if (var0 == 8) {
			class106.setLoginResponseString("Unable to connect.", "Login server offline.", "");
		} else if (var0 == 9) {
			class106.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
		} else if (var0 == 10) {
			class106.setLoginResponseString("Unable to connect.", "Bad session id.", "");
		} else if (var0 == 11) {
			class106.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
		} else if (var0 == 12) {
			class31.updateGameState(10);
			class106.setLoginResponseString("You need a members' account to use this world.", "Please subscribe to login to this world,", "or use a different world.");
			class329.updateLoginIndex(34);
		} else if (var0 == 13) {
			class106.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
		} else if (var0 == 14) {
			class106.setLoginResponseString("The server is being updated.", "Please wait a few minutes", "before trying again.");
		} else if (var0 == 16) {
			class106.setLoginResponseString("Too many login attempts.", "You can use the Jagex Launcher to continue playing.", "Press the button below to download it now.");
			class329.updateLoginIndex(33);
		} else if (var0 == 17) {
			class106.setLoginResponseString("To access this free world, log into a", "members world and move your character", "to a non-members area.");
		} else if (var0 == 18) {
			class329.updateLoginIndex(14);
			Login.Login_banType = 1;
		} else if (var0 == 19) {
			class106.setLoginResponseString("This world is running a", "closed Beta. Please ", "use a different world.");
		} else if (var0 == 20) {
			class106.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
		} else if (var0 == 22) {
			class106.setLoginResponseString("Malformed login packet.", "Please try again.", "");
		} else if (var0 == 23) {
			class106.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 24) {
			class106.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
		} else if (var0 == 25) {
			class106.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
		} else if (var0 == 26) {
			class106.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
		} else if (var0 == 27) {
			class106.setLoginResponseString("", "Service unavailable.", "");
		} else if (var0 == 31) {
			class106.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
		} else if (var0 == 32) {
			class329.updateLoginIndex(14);
			Login.Login_banType = 2;
		} else if (var0 == 37) {
			class106.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
		} else if (var0 == 38) {
			class106.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
		} else if (var0 == 74) {
			class106.setLoginResponseString("Access to this world is", "restricted. Please use", "a different world.");
		} else if (var0 == 55) {
			class329.updateLoginIndex(8);
		} else {
			if (var0 == 56) {
				class106.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", "");
				class31.updateGameState(11);
				return;
			}

			if (var0 == 57) {
				class106.setLoginResponseString("The code you entered was incorrect.", "Please try again.", "");
				class31.updateGameState(11);
				return;
			}

			if (var0 == 61) {
				class106.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", "");
				class329.updateLoginIndex(7);
			} else {
				if (var0 == 62) {
					class31.updateGameState(10);
					class329.updateLoginIndex(9);
					class106.setLoginResponseString("Login attempt timed out.", "Please try again.", "");
					return;
				}

				if (var0 == 63) {
					class31.updateGameState(10);
					class329.updateLoginIndex(9);
					class106.setLoginResponseString("You were signed out.", "Please sign in again.", "");
					return;
				}

				if (var0 == 65 || var0 == 67) {
					class31.updateGameState(10);
					class329.updateLoginIndex(9);
					class106.setLoginResponseString("Failed to login.", "Please try again.", "");
					return;
				}

				if (var0 == 71) {
					class31.updateGameState(10);
					class329.updateLoginIndex(7);
					class106.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
				} else if (var0 == 73) {
					class31.updateGameState(10);
					class329.updateLoginIndex(6);
					class106.setLoginResponseString("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly.");
				} else if (var0 == 72) {
					class31.updateGameState(10);
					class329.updateLoginIndex(32);
				} else {
					class106.setLoginResponseString("Unexpected server response", "Please try using a different world.", "");
				}
			}
		}

		class31.updateGameState(10);
		boolean var2 = var1 != FriendsChat.method8962();
		if (!var2 && Client.field691.method10412()) {
			class329.updateLoginIndex(9);
		}

	}

	@ObfuscatedName("og")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2082523190"
	)
	static final void method5793() {
		Client.field709 = Client.cycleCntr;
		Calendar.field4031 = true;
	}
}
