import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ap")
public class class7 {
	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	@Export("topLevelWorldView")
	public static WorldView topLevelWorldView;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lwj;"
	)
	final Buffer field22;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lav;"
	)
	final class3 field19;
	@ObfuscatedName("ac")
	ExecutorService field20;
	@ObfuscatedName("av")
	Future field21;

	@ObfuscatedSignature(
		descriptor = "(Lwj;Lav;)V"
	)
	public class7(Buffer var1, class3 var2) {
		this.field20 = Executors.newSingleThreadExecutor();
		this.field22 = var1;
		this.field19 = var2;
		this.method40();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-7"
	)
	public boolean method43() {
		return this.field21.isDone();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2075220776"
	)
	public void method38() {
		this.field20.shutdown();
		this.field20 = null;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Lwj;",
		garbageValue = "-69"
	)
	public Buffer method39() {
		try {
			return (Buffer)this.field21.get();
		} catch (Exception var2) {
			return null;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1406973395"
	)
	void method40() {
		this.field21 = this.field20.submit(new class1(this, this.field22, this.field19));
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)[Lhn;",
		garbageValue = "1821932345"
	)
	static HorizontalAlignment[] method55() {
		return new HorizontalAlignment[]{HorizontalAlignment.field2055, HorizontalAlignment.HorizontalAlignment_centered, HorizontalAlignment.field2059};
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIB)V",
		garbageValue = "80"
	)
	static void method56(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (FriendSystem.clientPreferences.getAreaSoundEffectsVolume() != 0 && var6 > 0 && class57.soundEffectCount < 50) {
			Calendar.method8097(class81.worldView.id, var1, var2, var3, var4, var5, var6, var7, false);
		}

	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ILce;ZI)I",
		garbageValue = "848547154"
	)
	static int method53(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) {
			Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = class31.getWindowedMode();
			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) {
				var3 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					FloorUnderlayDefinition.setWindowedMode(var3);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) {
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = FriendSystem.clientPreferences.getWindowMode();
				return 1;
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) {
				if (var0 == 5310) {
					--AbstractWorldMapIcon.Interpreter_intStackSize;
					return 1;
				} else {
					return 2;
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
				if (var3 == 1 || var3 == 2) {
					FriendSystem.clientPreferences.updateWindowMode(var3);
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-426102903"
	)
	static int method37(int var0) {
		return (int)((Math.log((double)var0) / Interpreter.field634 - 7.0D) * 256.0D);
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "283481472"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		int var1 = Login.loginIndex;
		if (var0 == -3) {
			class460.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) {
			class460.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) {
			class460.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) {
			DynamicObject.method1987(3);
			Login.field713 = 1;
		} else if (var0 == 4) {
			DynamicObject.method1987(14);
			Login.Login_banType = 0;
		} else if (var0 == 5) {
			Login.field713 = 2;
			class460.setLoginResponseString("Either your account is still logged in, or the last", "world you were using has become unavailable.", "Please try again later.");
		} else if (var0 == 68) {
			if (!Client.field433) {
				Client.field433 = true;
				class62.method2115();
				return;
			}

			class460.setLoginResponseString("RuneScape has been updated!", "Please restart your client.", "");
		} else if (!Client.onMobile && var0 == 6) {
			class460.setLoginResponseString("RuneScape has been updated!", "Please restart your client.", "");
		} else if (var0 == 7) {
			class460.setLoginResponseString("This world is full.", "Please use a different world.", "");
		} else if (var0 == 8) {
			class460.setLoginResponseString("Unable to connect.", "Login server offline.", "");
		} else if (var0 == 9) {
			class460.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
		} else if (var0 == 10) {
			class460.setLoginResponseString("Unable to connect.", "Bad session id.", "");
		} else if (var0 == 11) {
			class460.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
		} else if (var0 == 12) {
			AuthenticationScheme.updateGameState(10);
			class460.setLoginResponseString("You need a members' account to use this world.", "Please subscribe to login to this world,", "or use a different world.");
			DynamicObject.method1987(34);
		} else if (var0 == 13) {
			class460.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
		} else if (var0 == 14) {
			class460.setLoginResponseString("The server is being updated.", "Please wait a few minutes", "before trying again.");
		} else if (var0 == 16) {
			class460.setLoginResponseString("Too many login attempts.", "You can use the Jagex Launcher to continue playing.", "Press the button below to download it now.");
			DynamicObject.method1987(33);
		} else if (var0 == 17) {
			class460.setLoginResponseString("To access this free world, log into a", "members world and move your character", "to a non-members area.");
		} else if (var0 == 18) {
			DynamicObject.method1987(14);
			Login.Login_banType = 1;
		} else if (var0 == 19) {
			class460.setLoginResponseString("This world is running a", "closed Beta. Please ", "use a different world.");
		} else if (var0 == 20) {
			class460.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
		} else if (var0 == 22) {
			class460.setLoginResponseString("Malformed login packet.", "Please try again.", "");
		} else if (var0 == 23) {
			class460.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 24) {
			class460.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
		} else if (var0 == 25) {
			class460.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
		} else if (var0 == 26) {
			class460.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
		} else if (var0 == 27) {
			class460.setLoginResponseString("", "Service unavailable.", "");
		} else if (var0 == 31) {
			class460.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
		} else if (var0 == 32) {
			DynamicObject.method1987(14);
			Login.Login_banType = 2;
		} else if (var0 == 37) {
			class460.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
		} else if (var0 == 38) {
			class460.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
		} else if (var0 == 74) {
			class460.setLoginResponseString("Access to this world is", "restricted. Please use", "a different world.");
		} else if (var0 == 55) {
			DynamicObject.method1987(8);
		} else {
			if (var0 == 56) {
				class460.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", "");
				AuthenticationScheme.updateGameState(11);
				return;
			}

			if (var0 == 57) {
				class460.setLoginResponseString("The code you entered was incorrect.", "Please try again.", "");
				AuthenticationScheme.updateGameState(11);
				return;
			}

			if (var0 == 61) {
				class460.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", "");
				DynamicObject.method1987(7);
			} else {
				if (var0 == 62) {
					AuthenticationScheme.updateGameState(10);
					DynamicObject.method1987(9);
					class460.setLoginResponseString("Login attempt timed out.", "Please try again.", "");
					return;
				}

				if (var0 == 63) {
					AuthenticationScheme.updateGameState(10);
					DynamicObject.method1987(9);
					class460.setLoginResponseString("You were signed out.", "Please sign in again.", "");
					return;
				}

				if (var0 == 65 || var0 == 67) {
					AuthenticationScheme.updateGameState(10);
					DynamicObject.method1987(9);
					class460.setLoginResponseString("Failed to login.", "Please try again.", "");
					return;
				}

				if (var0 == 71) {
					AuthenticationScheme.updateGameState(10);
					DynamicObject.method1987(7);
					class460.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
				} else if (var0 == 73) {
					AuthenticationScheme.updateGameState(10);
					DynamicObject.method1987(6);
					class460.setLoginResponseString("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly.");
				} else if (var0 == 72) {
					AuthenticationScheme.updateGameState(10);
					DynamicObject.method1987(32);
				} else {
					class460.setLoginResponseString("Unexpected server response", "Please try using a different world.", "");
				}
			}
		}

		AuthenticationScheme.updateGameState(10);
		boolean var3 = var1 != FloatProjection.method5335();
		if (!var3 && Client.field388.method11517()) {
			DynamicObject.method1987(9);
		}

	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "11"
	)
	static final int method36() {
		if (FriendSystem.clientPreferences.isRoofsHidden()) {
			return topLevelWorldView.plane;
		} else {
			int var0 = Language.cameraX >> 7;
			int var1 = class66.cameraZ >> 7;
			if (var0 >= 0 && 104 > var0 && var1 >= 0 && 104 > var1) {
				int var2 = class477.method9725(topLevelWorldView, Language.cameraX, class66.cameraZ, topLevelWorldView.plane);
				return var2 - WorldMapCacheName.cameraY < 800 && (topLevelWorldView.tileSettings[topLevelWorldView.plane][var0][var1] & 4) != 0 ? topLevelWorldView.plane : 3;
			} else {
				return topLevelWorldView.plane;
			}
		}
	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)Z",
		garbageValue = "-1527692171"
	)
	static boolean method57(int var0, int var1, int var2, int var3, int var4, int var5) {
		return class554.method10912(class81.worldView.plane, var0, var1, var2, var3, var4, var5);
	}
}
