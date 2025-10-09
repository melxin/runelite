import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ai")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class105 {
	@ObfuscatedName("ok")
	@Export("refreshToken")
	static String refreshToken;
	@ObfuscatedName("ot")
	@ObfuscatedGetter(
		longValue = -6615141330785227133L
	)
	static long field92;

	DevicePcmPlayerProvider() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Ldx;",
		garbageValue = "1873731449"
	)
	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1402642411"
	)
	static final boolean method319(int var0) {
		return var0 == 14 || var0 == 15 || var0 >= 44 && var0 <= 51;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1642587538"
	)
	@Export("updateLoginStatusUsernameRemembered")
	static void updateLoginStatusUsernameRemembered(boolean var0) {
		byte var1 = 0;
		if (!RouteStrategy.method6247()) {
			var1 = 12;
		} else if (class32.client.containsAccessAndRefreshToken() || class32.client.otlTokenRequesterInitialized() || class32.client.containsSessionAndCharacterId()) {
			var1 = 10;
		}

		class146.method3876(var1);
		if (var0) {
			Login.Login_username = "";
			Login.Login_password = "";
			AABB.otpMedium = 0;
			class572.otp = "";
		}

		if (Login.Login_username == null || Login.Login_username.isEmpty()) {
			if (class154.clientPreferences.getRememberedUsername() != null) {
				Login.Login_username = class154.clientPreferences.getRememberedUsername();
				Client.Login_isUsernameRemembered = true;
			} else {
				Client.Login_isUsernameRemembered = false;
			}
		}

		if (Client.Login_isUsernameRemembered && Login.Login_username != null && !Login.Login_username.isEmpty()) {
			Login.currentLoginField = 1;
		} else {
			Login.currentLoginField = 0;
		}

	}
}
