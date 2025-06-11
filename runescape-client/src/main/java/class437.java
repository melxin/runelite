import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qu")
public class class437 {
	@ObfuscatedName("ap")
	public static char[] field4937;
	@ObfuscatedName("aj")
	static char[] field4933;
	@ObfuscatedName("an")
	static char[] field4934;
	@ObfuscatedName("ai")
	static int[] field4936;

	static {
		field4937 = new char[64];

		int var0;
		for (var0 = 0; var0 < 26; ++var0) {
			field4937[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4937[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4937[var0] = (char)(var0 + 48 - 52);
		}

		field4937[62] = '+';
		field4937[63] = '/';
		field4933 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field4933[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4933[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4933[var0] = (char)(var0 + 48 - 52);
		}

		field4933[62] = '*';
		field4933[63] = '-';
		field4934 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field4934[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4934[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4934[var0] = (char)(var0 + 48 - 52);
		}

		field4934[62] = '-';
		field4934[63] = '_';
		field4936 = new int[128];

		for (var0 = 0; var0 < field4936.length; ++var0) {
			field4936[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) {
			field4936[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) {
			field4936[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) {
			field4936[var0] = var0 - 48 + 52;
		}

		int[] var2 = field4936;
		field4936[43] = 62;
		var2[42] = 62;
		int[] var1 = field4936;
		field4936[47] = 63;
		var1[45] = 63;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "15"
	)
	static final int method8576(int var0, int var1) {
		if (var0 == -1) {
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}
}
