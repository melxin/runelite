import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rv")
public class class442 {
	@ObfuscatedName("ab")
	static char[] field5175;
	@ObfuscatedName("at")
	static char[] field5179;
	@ObfuscatedName("ag")
	static char[] field5176;
	@ObfuscatedName("aj")
	static int[] field5177;

	static {
		field5175 = new char[64];

		int var0;
		for (var0 = 0; var0 < 26; ++var0) {
			field5175[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field5175[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field5175[var0] = (char)(var0 + 48 - 52);
		}

		field5175[62] = '+';
		field5175[63] = '/';
		field5179 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field5179[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field5179[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field5179[var0] = (char)(var0 + 48 - 52);
		}

		field5179[62] = '*';
		field5179[63] = '-';
		field5176 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field5176[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field5176[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field5176[var0] = (char)(var0 + 48 - 52);
		}

		field5176[62] = '-';
		field5176[63] = '_';
		field5177 = new int[128];

		for (var0 = 0; var0 < field5177.length; ++var0) {
			field5177[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) {
			field5177[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) {
			field5177[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) {
			field5177[var0] = var0 - 48 + 52;
		}

		int[] var2 = field5177;
		field5177[43] = 62;
		var2[42] = 62;
		int[] var1 = field5177;
		field5177[47] = 63;
		var1[45] = 63;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "210"
	)
	public static int method8934(int var0) {
		return class533.field5638[var0 & 16383];
	}
}
