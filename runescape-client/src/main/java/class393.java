import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pv")
public class class393 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "39"
	)
	static String method7565() {
		String var0;
		if (AbstractWorldMapIcon.clientPreferences.isUsernameHidden()) {
			String var2 = Login.Login_username;
			int var4 = var2.length();
			char[] var5 = new char[var4];

			for (int var6 = 0; var6 < var4; ++var6) {
				var5[var6] = '*';
			}

			String var3 = new String(var5);
			var0 = var3;
		} else {
			var0 = Login.Login_username;
		}

		return var0;
	}
}
