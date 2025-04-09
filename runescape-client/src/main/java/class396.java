import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pj")
public class class396 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-86"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		if (!SecureRandomCallable.client.containsAccessAndRefreshToken() && !SecureRandomCallable.client.otlTokenRequesterInitialized() && !SecureRandomCallable.client.containsSessionAndCharacterId()) {
			Login.Login_response1 = "";
			Login.Login_response2 = "Enter your username/email & password.";
			Login.Login_response3 = "";
			class137.method3379(2);
			if (var0) {
				Login.Login_password = "";
			}

			TileItem.method2992();
			ChatChannel.focusPasswordWhenUsernameFilled();
		} else {
			class137.method3379(10);
		}
	}
}
