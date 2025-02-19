import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("qe")
public class class434 {
	@ObfuscatedName("ab")
	public static char[] field4872;
	@ObfuscatedName("ay")
	static char[] field4870;
	@ObfuscatedName("au")
	static char[] field4869;
	@ObfuscatedName("ad")
	static int[] field4871;

	static {
		field4872 = new char[64];

		int var0;
		for (var0 = 0; var0 < 26; ++var0) {
			field4872[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4872[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4872[var0] = (char)(var0 + 48 - 52);
		}

		field4872[62] = '+';
		field4872[63] = '/';
		field4870 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field4870[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4870[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4870[var0] = (char)(var0 + 48 - 52);
		}

		field4870[62] = '*';
		field4870[63] = '-';
		field4869 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field4869[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4869[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4869[var0] = (char)(var0 + 48 - 52);
		}

		field4869[62] = '-';
		field4869[63] = '_';
		field4871 = new int[128];

		for (var0 = 0; var0 < field4871.length; ++var0) {
			field4871[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) {
			field4871[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) {
			field4871[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) {
			field4871[var0] = var0 - 48 + 52;
		}

		int[] var2 = field4871;
		field4871[43] = 62;
		var2[42] = 62;
		int[] var1 = field4871;
		field4871[47] = 63;
		var1[45] = 63;
	}
}
