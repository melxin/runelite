import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sz")
@Implements("IntHashTable")
public class IntHashTable {
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 1605146791
	)
	static int field5140;
	@ObfuscatedName("vg")
	@ObfuscatedGetter(
		intValue = 182673155
	)
	static int field5141;
	@ObfuscatedName("ap")
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2005026269"
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "97"
	)
	static int method9453(int var0) {
		return (var0 >> 7) + 1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lps;IIB)Lwd;",
		garbageValue = "99"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		return !class167.method3865(var0, var1, var2) ? null : MilliClock.method4750();
	}
}
