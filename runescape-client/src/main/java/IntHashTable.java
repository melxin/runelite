import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ws")
@Implements("IntHashTable")
public class IntHashTable {
	@ObfuscatedName("ab")
	@Export("array")
	int[] array;

	public IntHashTable(int[] var1) {
		int var2;
		for (var2 = 1; var2 <= (var1.length >> 1) + var1.length; var2 <<= 1) {
		}

		this.array = new int[var2 + var2];

		int var3;
		for (var3 = 0; var3 < var2 + var2; ++var3) {
			this.array[var3] = -1;
		}

		int var4;
		for (var3 = 0; var3 < var1.length; this.array[var4 + var4 + 1] = var3++) {
			for (var4 = var1[var3] & var2 - 1; this.array[var4 + var4 + 1] != -1; var4 = var4 + 1 & var2 - 1) {
			}

			this.array[var4 + var4] = var1[var3];
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "1"
	)
	@Export("get")
	public int get(int var1) {
		int var2 = (this.array.length >> 1) - 1;
		int var3 = var1 & var2;

		while (true) {
			int var4 = this.array[var3 + var3 + 1];
			if (var4 == -1) {
				return -1;
			}

			if (this.array[var3 + var3] == var1) {
				return var4;
			}

			var3 = var3 + 1 & var2;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)[B",
		garbageValue = "-1897966647"
	)
	static byte[] method10781(String var0) {
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
