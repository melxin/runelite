import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qs")
public class class418 {
	@ObfuscatedName("ay")
	static char[] field4713;
	@ObfuscatedName("ah")
	static char[] field4714;
	@ObfuscatedName("az")
	static char[] field4717;
	@ObfuscatedName("ao")
	static int[] field4716;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	static IndexedSprite field4715;
	@ObfuscatedName("dl")
	static boolean field4719;

	static {
		field4713 = new char[64];

		int var0;
		for (var0 = 0; var0 < 26; ++var0) {
			field4713[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4713[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4713[var0] = (char)(var0 + 48 - 52);
		}

		field4713[62] = '+';
		field4713[63] = '/';
		field4714 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field4714[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4714[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4714[var0] = (char)(var0 + 48 - 52);
		}

		field4714[62] = '*';
		field4714[63] = '-';
		field4717 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field4717[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4717[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4717[var0] = (char)(var0 + 48 - 52);
		}

		field4717[62] = '-';
		field4717[63] = '_';
		field4716 = new int[128];

		for (var0 = 0; var0 < field4716.length; ++var0) {
			field4716[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) {
			field4716[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) {
			field4716[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) {
			field4716[var0] = var0 - 48 + 52;
		}

		int[] var2 = field4716;
		field4716[43] = 62;
		var2[42] = 62;
		int[] var1 = field4716;
		field4716[47] = 63;
		var1[45] = 63;
	}
}
