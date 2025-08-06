import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ld")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 167735309
	)
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1244859073
	)
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1266177893
	)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1;
		this.decoration = var2;
		this.rotation = var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)Lvf;",
		garbageValue = "-61"
	)
	public static class570 method6802(int var0) {
		int var1 = class568.field5712[var0];
		if (var1 == 1) {
			return class570.field5721;
		} else if (var1 == 2) {
			return class570.field5718;
		} else {
			return var1 == 3 ? class570.field5724 : null;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "1553970929"
	)
	static byte[] method6801(byte[] var0) {
		int var1 = var0.length;
		byte[] var2 = new byte[var1];
		System.arraycopy(var0, 0, var2, 0, var1);
		return var2;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1593426150"
	)
	@Export("updateLoginStatusUsernameRemembered")
	static void updateLoginStatusUsernameRemembered(boolean var0) {
		byte var1 = 0;
		if (!GrandExchangeOfferNameComparator.method8501()) {
			var1 = 12;
		} else if (Language.client.containsAccessAndRefreshToken() || Language.client.otlTokenRequesterInitialized() || Language.client.containsSessionAndCharacterId()) {
			var1 = 10;
		}

		DynamicObject.method1987(var1);
		if (var0) {
			Login.Login_username = "";
			Login.Login_password = "";
			class563.otpMedium = 0;
			SoundSystem.otp = "";
		}

		class66.method2131();
		class141.focusPasswordWhenUsernameFilled();
	}
}
