import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ge")
public class class177 extends DualNode {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("field1842")
	public static EvictingDualNodeHashTable field1842;

	static {
		field1842 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "95"
	)
	public static int method3964(int var0) {
		return class526.field5365[var0 & 2047];
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "150934155"
	)
	@Export("updateLoginStatusUsernameRemembered")
	static void updateLoginStatusUsernameRemembered(boolean var0) {
		byte var1 = 0;
		boolean var2 = ClientPacket.clientPreferences.getEULA() >= Client.field379;
		if (!var2) {
			var1 = 12;
		} else if (class36.client.containsAccessAndRefreshToken() || class36.client.otlTokenRequesterInitialized() || class36.client.containsSessionAndCharacterId()) {
			var1 = 10;
		}

		class85.method2689(var1);
		if (var0) {
			Login.Login_username = "";
			Login.Login_password = "";
			PcmPlayer.otpMedium = 0;
			class82.otp = "";
		}

		if (Login.Login_username == null || Login.Login_username.isEmpty()) {
			if (ClientPacket.clientPreferences.getRememberedUsername() != null) {
				Login.Login_username = ClientPacket.clientPreferences.getRememberedUsername();
				Client.Login_isUsernameRemembered = true;
			} else {
				Client.Login_isUsernameRemembered = false;
			}
		}

		MouseRecorder.focusPasswordWhenUsernameFilled();
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "([JIIB)V",
		garbageValue = "3"
	)
	static void method3966(long[] var0, int var1, int var2) {
		while (var1 < var2) {
			long var3 = var0[var1];
			var0[var1] = var0[var2];
			var0[var2] = var3;
			++var1;
			--var2;
		}

	}

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(Ldl;I)V",
		garbageValue = "49180846"
	)
	static void method3962(WorldView var0) {
		if (Client.renderSelf) {
			WorldEntityCoord.addPlayerToScene(var0, Client.localPlayerIndex, false);
		}

	}

	@ObfuscatedName("nm")
	@ObfuscatedSignature(
		descriptor = "(Lov;B)Lov;",
		garbageValue = "15"
	)
	static Widget method3963(Widget var0) {
		Widget var2 = var0;
		int var4 = class255.getWidgetFlags(var0);
		int var3 = var4 >> 17 & 7;
		int var5 = var3;
		Widget var1;
		if (var3 == 0) {
			var1 = null;
		} else {
			int var6 = 0;

			while (true) {
				if (var6 >= var5) {
					var1 = var2;
					break;
				}

				var2 = ClientPreferences.widgetDefinition.method7286(var2.parentId);
				if (var2 == null) {
					var1 = null;
					break;
				}

				++var6;
			}
		}

		Widget var7 = var1;
		if (var1 == null) {
			var7 = var0.parent;
		}

		return var7;
	}
}
