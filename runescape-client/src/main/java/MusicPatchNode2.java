import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mn")
@Implements("MusicPatchNode2")
public class MusicPatchNode2 {
	@ObfuscatedName("ab")
	byte[] field3681;
	@ObfuscatedName("ay")
	byte[] field3676;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1534321937
	)
	int field3677;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1511620507
	)
	int field3678;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 839916729
	)
	int field3679;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1534452707
	)
	int field3680;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -973882239
	)
	int field3683;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1783187897
	)
	int field3682;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -777394457
	)
	int field3675;

	MusicPatchNode2() {
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-61"
	)
	@Export("updateLoginStatusUsernameRemembered")
	static void updateLoginStatusUsernameRemembered(boolean var0) {
		byte var1 = 0;
		boolean var2 = AbstractWorldMapIcon.clientPreferences.getEULA() >= Client.field515;
		if (!var2) {
			var1 = 12;
		} else if (class569.client.containsAccessAndRefreshToken() || class569.client.otlTokenRequesterInitialized() || class569.client.containsSessionAndCharacterId()) {
			var1 = 10;
		}

		ObjectComposition.method4206(var1);
		if (var0) {
			Login.Login_username = "";
			Login.Login_password = "";
			Language.otpMedium = 0;
			Language.otp = "";
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
	}

	@ObfuscatedName("oa")
	@ObfuscatedSignature(
		descriptor = "(Lnz;I)Lnz;",
		garbageValue = "-1827112957"
	)
	static Widget method6559(Widget var0) {
		int var1 = class217.method4437(class441.getWidgetFlags(var0));
		if (var1 == 0) {
			return null;
		} else {
			for (int var2 = 0; var2 < var1; ++var2) {
				var0 = class376.widgetDefinition.method6918(var0.parentId);
				if (var0 == null) {
					return null;
				}
			}

			return var0;
		}
	}
}
