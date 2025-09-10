import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mr")
public class class325 {
	@ObfuscatedName("ix")
	@ObfuscatedGetter(
		intValue = -1154174731
	)
	@Export("Players_count")
	static int Players_count;

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1295594443"
	)
	public static void method7034() {
		VarpDefinition.VarpDefinition_cached.clear();
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "4"
	)
	static final void method7035(boolean var0) {
		if (var0) {
			Client.authenticationScheme = Login.rememberUsername ? AuthenticationScheme.USERNAME_PASSWORD_REMEMBER : AuthenticationScheme.USERNAME_PASSWORD;
		} else {
			Client.authenticationScheme = class36.clientPreferences.containsKey(Login.Login_username) ? AuthenticationScheme.TOKEN_REMEMBER : AuthenticationScheme.TOKEN;
		}

	}
}
