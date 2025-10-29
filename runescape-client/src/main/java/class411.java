import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pc")
public class class411 {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SI)V",
		garbageValue = "-479977012"
	)
	public static void method8513(String[] var0, short[] var1) {
		class387.sortItemsByName(var0, var1, 0, var0.length - 1);
	}

	@ObfuscatedName("an")
	static int method8515(long var0) {
		return (int)(var0 >>> 16 & 7L);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-983768802"
	)
	static void method8514() {
		Login.Login_username = Login.Login_username.trim();
		if (Login.Login_username.isEmpty()) {
			class525.setLoginResponseString("", "Please enter your username/email address.", "");
		} else if (Login.Login_password.isEmpty()) {
			class525.setLoginResponseString("", "Please enter your password.", "");
		} else {
			class525.setLoginResponseString("", "Connecting to server...", "");
			class155.method4000(false);
			WorldMapSectionType.updateGameState(20);
		}
	}
}
