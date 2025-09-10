import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rg")
public class class444 {
	@ObfuscatedName("af")
	static char[] field5143;
	@ObfuscatedName("aw")
	static char[] field5146;
	@ObfuscatedName("at")
	static char[] field5145;
	@ObfuscatedName("ac")
	static int[] field5144;

	static {
		field5143 = new char[64];

		int var0;
		for (var0 = 0; var0 < 26; ++var0) {
			field5143[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field5143[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field5143[var0] = (char)(var0 + 48 - 52);
		}

		field5143[62] = '+';
		field5143[63] = '/';
		field5146 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field5146[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field5146[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field5146[var0] = (char)(var0 + 48 - 52);
		}

		field5146[62] = '*';
		field5146[63] = '-';
		field5145 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field5145[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field5145[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field5145[var0] = (char)(var0 + 48 - 52);
		}

		field5145[62] = '-';
		field5145[63] = '_';
		field5144 = new int[128];

		for (var0 = 0; var0 < field5144.length; ++var0) {
			field5144[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) {
			field5144[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) {
			field5144[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) {
			field5144[var0] = var0 - 48 + 52;
		}

		int[] var2 = field5144;
		field5144[43] = 62;
		var2[42] = 62;
		int[] var1 = field5144;
		field5144[47] = 63;
		var1[45] = 63;
	}

	@ObfuscatedName("mu")
	@ObfuscatedSignature(
		descriptor = "(IIB)Ljava/lang/String;",
		garbageValue = "82"
	)
	static final String method8880(int var0, int var1) {
		int var2 = var1 - var0;
		if (var2 < -9) {
			return class134.colorStartTag(16711680);
		} else if (var2 < -6) {
			return class134.colorStartTag(16723968);
		} else if (var2 < -3) {
			return class134.colorStartTag(16740352);
		} else if (var2 < 0) {
			return class134.colorStartTag(16756736);
		} else if (var2 > 9) {
			return class134.colorStartTag(65280);
		} else if (var2 > 6) {
			return class134.colorStartTag(4259584);
		} else if (var2 > 3) {
			return class134.colorStartTag(8453888);
		} else {
			return var2 > 0 ? class134.colorStartTag(12648192) : class134.colorStartTag(16776960);
		}
	}
}
