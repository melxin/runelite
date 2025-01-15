import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("am")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class51 {
	@ObfuscatedName("gl")
	@Export("characterId")
	static String characterId;

	DevicePcmPlayerProvider() {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Lbq;",
		garbageValue = "70280008"
	)
	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer();
	}

	@ObfuscatedName("at")
	public static int method325(long var0) {
		return (int)(var0 >>> 49 & 2047L);
	}

	@ObfuscatedName("oz")
	@ObfuscatedSignature(
		descriptor = "(Lcj;I)V",
		garbageValue = "286253951"
	)
	@Export("updateLoginState")
	static void updateLoginState(LoginState var0) {
		if (VarpDefinition.loginState != var0) {
			VarpDefinition.loginState = var0;
		}
	}
}
