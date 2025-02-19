import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wk")
public class class573 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lwk;"
	)
	public static final class573 field5627;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lwk;"
	)
	public static final class573 field5626;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lwk;"
	)
	static final class573 field5632;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lwk;"
	)
	static final class573 field5628;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lwk;"
	)
	static final class573 field5625;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lwk;"
	)
	static final class573 field5630;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 600023927
	)
	final int field5631;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -835733365
	)
	final int field5629;

	static {
		field5627 = new class573(2, 0);
		field5626 = new class573(1, 2);
		field5632 = new class573(5, 5);
		field5628 = new class573(3, 6);
		field5625 = new class573(4, 7);
		field5630 = new class573(0, 8);
	}

	class573(int var1, int var2) {
		this.field5631 = var1;
		this.field5629 = var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "32"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5629;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-888903828"
	)
	public boolean method10536() {
		return this == field5626;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)[B",
		garbageValue = "-1537993280"
	)
	static byte[] method10538(String var0) {
		boolean var1 = true;
		boolean var2 = true;
		int var3 = "pattern".length();
		int var4 = 0;
		byte[] var5 = new byte[8];

		while (true) {
			int var6 = var3 + var4;
			if (var6 >= var0.length()) {
				return null;
			}

			char var7 = var0.charAt(var6);
			if (var7 == ':') {
				if (var4 == 0) {
					return null;
				}

				byte[] var8 = new byte[var4];
				System.arraycopy(var5, 0, var8, 0, var4);
				return var8;
			}

			if (var5.length == var4) {
				return null;
			}

			if (var7 >= '0' && var7 <= '9') {
				var7 = (char)(var7 - '0');
			} else {
				if (var7 < 'a' || var7 > 'z') {
					return null;
				}

				var7 = (char)(var7 - 'W');
			}

			var5[var4++] = (byte)var7;
		}
	}
}
