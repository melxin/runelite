import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oi")
public final class class379 {
	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-73"
	)
	static final void method8181(boolean var0) {
		Client.authenticationScheme = class154.clientPreferences.containsKey(Login.Login_username) ? AuthenticationScheme.TOKEN_REMEMBER : AuthenticationScheme.TOKEN;
	}
}
