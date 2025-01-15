import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ib")
public class class233 extends DualNode {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("field1851")
	public static EvictingDualNodeHashTable field1851;

	static {
		field1851 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "12"
	)
	static void method5134() {
		WorldEntity.otp.trim();
		if (WorldEntity.otp.length() != 6) {
			class150.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
		} else {
			class326.otpMedium = Integer.parseInt(WorldEntity.otp);
			WorldEntity.otp = "";
			Client.authenticationScheme = Login.rememberUsername ? AuthenticationScheme.TOKEN_REMEMBER : AuthenticationScheme.TOKEN;
			class150.setLoginResponseString("", "Connecting to server...", "");
			class360.updateGameState(20);
		}
	}
}
