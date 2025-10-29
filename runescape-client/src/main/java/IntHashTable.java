import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sn")
@Implements("IntHashTable")
public class IntHashTable {
	@ObfuscatedName("aj")
	@Export("SpriteBuffer_spriteWidths")
	public static int[] SpriteBuffer_spriteWidths;
	@ObfuscatedName("av")
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1123379343"
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
		descriptor = "(Lut;IIIII)V",
		garbageValue = "1461486816"
	)
	public static void method10049(DynamicArray var0, int var1, int var2, int var3, int var4) {
		ArchiveDiskActionHandler.method8530(var0, class586.field5937);
		if (var3 < 0) {
			var3 = 0;
		}

		int var5 = var3 + var4;
		if (var4 < 0 || var5 < 0 || var5 > var0.method10652()) {
			var5 = var0.method10652();
		}

		int[] var6 = var0.method10650();
		int var7 = var1;

		for (int var8 = var3; var8 < var5; ++var8) {
			var6[var8] = var7;
			var7 += var2;
		}

	}
}
