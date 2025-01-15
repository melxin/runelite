import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sq")
@Implements("AbstractSocket")
public abstract class AbstractSocket {
	AbstractSocket() {
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1264971006"
	)
	@Export("isAvailable")
	public abstract boolean isAvailable(int var1) throws IOException;

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2125512046"
	)
	@Export("available")
	public abstract int available() throws IOException;

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1363854656"
	)
	@Export("readUnsignedByte")
	public abstract int readUnsignedByte() throws IOException;

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "([BIIB)I",
		garbageValue = "72"
	)
	@Export("read")
	public abstract int read(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "-105"
	)
	@Export("write")
	public abstract void write(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1821776179"
	)
	@Export("close")
	public abstract void close();

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lpq;IIB)[Lvf;",
		garbageValue = "34"
	)
	public static SpritePixels[] method9404(AbstractArchive var0, int var1, int var2) {
		return !WorldMapSprite.method6397(var0, var1, var2) ? null : class457.method8965();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-97"
	)
	@Export("updateLoginStatusUsernameRemembered")
	static void updateLoginStatusUsernameRemembered(boolean var0) {
		byte var1 = 0;
		if (!LoginScreenAnimation.method2876()) {
			var1 = 12;
		} else if (Client.client.containsAccessAndRefreshToken() || Client.client.otlTokenRequesterInitialized() || Client.client.containsSessionAndCharacterId()) {
			var1 = 10;
		}

		Varcs.method3212(var1);
		if (var0) {
			Login.Login_username = "";
			Login.Login_password = "";
			class326.otpMedium = 0;
			WorldEntity.otp = "";
		}

		if (Login.Login_username == null || Login.Login_username.length() <= 0) {
			if (class544.clientPreferences.getRememberedUsername() != null) {
				Login.Login_username = class544.clientPreferences.getRememberedUsername();
				Client.Login_isUsernameRemembered = true;
			} else {
				Client.Login_isUsernameRemembered = false;
			}
		}

		HealthBarUpdate.focusPasswordWhenUsernameFilled();
	}
}
