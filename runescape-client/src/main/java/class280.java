import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kz")
public class class280 implements Comparator {
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	@Export("loginType")
	static LoginType loginType;
	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "Ltj;"
	)
	static AbstractSocket field3142;

	class280() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lka;Lka;I)I",
		garbageValue = "782660907"
	)
	int method5833(class272 var1, class272 var2) {
		return var1.method5673() - var2.method5673();
	}

	public int compare(Object var1, Object var2) {
		return this.method5833((class272)var1, (class272)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1027803086"
	)
	public static int method5841(int var0) {
		return var0 != 0 && var0 != 1 ? -1 : 0;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1599685135"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		if (!class569.client.containsAccessAndRefreshToken() && !class569.client.otlTokenRequesterInitialized() && !class569.client.containsSessionAndCharacterId()) {
			Login.Login_response1 = "";
			Login.Login_response2 = "Enter your username/email & password.";
			Login.Login_response3 = "";
			ObjectComposition.method4206(2);
			if (var0) {
				Login.Login_password = "";
			}

			if (Login.Login_username == null || Login.Login_username.length() <= 0) {
				if (AbstractWorldMapIcon.clientPreferences.getRememberedUsername() != null) {
					Login.Login_username = AbstractWorldMapIcon.clientPreferences.getRememberedUsername();
					Client.Login_isUsernameRemembered = true;
				} else {
					Client.Login_isUsernameRemembered = false;
				}
			}

			NPC.focusPasswordWhenUsernameFilled();
		} else {
			ObjectComposition.method4206(10);
		}
	}
}
