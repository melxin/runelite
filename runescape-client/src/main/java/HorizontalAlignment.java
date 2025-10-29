import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements Enum {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	field2093(1, 0),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(0, 1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	field2086(2, 2);

	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1076182323
	)
	static int field2087;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -747709277
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1149697435
	)
	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "20"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ae")
	@Export("Entity_unpackID")
	public static int Entity_unpackID(long var0) {
		return (int)(var0 >>> 20 & 4294967295L);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([J[Ljava/lang/Object;III)V",
		garbageValue = "1894347670"
	)
	public static void method4463(long[] var0, Object[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			long var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			Object var8 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var8;
			int var9 = var6 == Long.MAX_VALUE ? 0 : 1;

			for (int var10 = var2; var10 < var3; ++var10) {
				if (var0[var10] < var6 + (long)(var10 & var9)) {
					long var11 = var0[var10];
					var0[var10] = var0[var5];
					var0[var5] = var11;
					Object var13 = var1[var10];
					var1[var10] = var1[var5];
					var1[var5++] = var13;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var8;
			method4463(var0, var1, var2, var5 - 1);
			method4463(var0, var1, var5 + 1, var3);
		}

	}
}
