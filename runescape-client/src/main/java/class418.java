import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qf")
public class class418 {
	@ObfuscatedName("ab")
	static char[] field4728;
	@ObfuscatedName("aw")
	static char[] field4727;
	@ObfuscatedName("at")
	static char[] field4729;
	@ObfuscatedName("ae")
	static int[] field4730;

	static {
		field4728 = new char[64];

		int var0;
		for (var0 = 0; var0 < 26; ++var0) {
			field4728[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4728[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4728[var0] = (char)(var0 + 48 - 52);
		}

		field4728[62] = '+';
		field4728[63] = '/';
		field4727 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field4727[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4727[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4727[var0] = (char)(var0 + 48 - 52);
		}

		field4727[62] = '*';
		field4727[63] = '-';
		field4729 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field4729[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4729[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4729[var0] = (char)(var0 + 48 - 52);
		}

		field4729[62] = '-';
		field4729[63] = '_';
		field4730 = new int[128];

		for (var0 = 0; var0 < field4730.length; ++var0) {
			field4730[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) {
			field4730[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) {
			field4730[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) {
			field4730[var0] = var0 - 48 + 52;
		}

		int[] var2 = field4730;
		field4730[43] = 62;
		var2[42] = 62;
		int[] var1 = field4730;
		field4730[47] = 63;
		var1[45] = 63;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Luk;B)I",
		garbageValue = "-6"
	)
	public static final int method8001(LoginType var0) {
		if (var0 == null) {
			return 12;
		} else {
			switch(var0.field5357) {
			case 0:
				return 20;
			default:
				return 12;
			}
		}
	}
}
