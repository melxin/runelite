import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qz")
public class class434 {
	@ObfuscatedName("ao")
	static char[] field4890;
	@ObfuscatedName("an")
	static char[] field4887;
	@ObfuscatedName("ae")
	static char[] field4886;
	@ObfuscatedName("af")
	static int[] field4888;
	@ObfuscatedName("py")
	@ObfuscatedSignature(
		descriptor = "Lwc;"
	)
	@Export("redHintArrowSprite")
	static SpritePixels redHintArrowSprite;

	static {
		field4890 = new char[64];

		int var0;
		for (var0 = 0; var0 < 26; ++var0) {
			field4890[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4890[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4890[var0] = (char)(var0 + 48 - 52);
		}

		field4890[62] = '+';
		field4890[63] = '/';
		field4887 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field4887[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4887[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4887[var0] = (char)(var0 + 48 - 52);
		}

		field4887[62] = '*';
		field4887[63] = '-';
		field4886 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field4886[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4886[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4886[var0] = (char)(var0 + 48 - 52);
		}

		field4886[62] = '-';
		field4886[63] = '_';
		field4888 = new int[128];

		for (var0 = 0; var0 < field4888.length; ++var0) {
			field4888[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) {
			field4888[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) {
			field4888[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) {
			field4888[var0] = var0 - 48 + 52;
		}

		int[] var2 = field4888;
		field4888[43] = 62;
		var2[42] = 62;
		int[] var1 = field4888;
		field4888[47] = 63;
		var1[45] = 63;
	}
}
