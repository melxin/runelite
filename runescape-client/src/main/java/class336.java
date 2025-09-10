import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("md")
public class class336 {
	@ObfuscatedName("af")
	static int[] field3845;

	static {
		new Object();
		field3845 = new int[33];
		field3845[0] = 0;
		int var0 = 2;

		for (int var1 = 1; var1 < 33; ++var1) {
			field3845[var1] = var0 - 1;
			var0 += var0;
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-974306976"
	)
	static boolean method7086(int var0) {
		return var0 != 0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lti;Ljava/lang/Object;IIB)I",
		garbageValue = "99"
	)
	public static int method7098(DynamicArray var0, Object var1, int var2, int var3) {
		if (var2 < 0) {
			var2 = 0;
		}

		if (var3 < 0 || var3 > var0.method10322()) {
			var3 = var0.method10322();
		}

		int var4 = 0;
		int var6;
		if (var0.field5504 == class574.field5820) {
			int[] var5 = var0.method10318();
			var6 = (Integer)var1;

			for (int var7 = var2; var7 < var3; ++var7) {
				if (var6 == var5[var7]) {
					++var4;
				}
			}
		} else if (var0.field5504 == class574.field5816) {
			long[] var11 = var0.method10320();
			long var9 = (Long)var1;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var11[var8] == var9) {
					++var4;
				}
			}
		} else {
			Object[] var12 = var0.method10321();

			for (var6 = var2; var6 < var3; ++var6) {
				if (var12[var6] == var1 || var12[var6] != null && var12[var6].equals(var1)) {
					++var4;
				}
			}
		}

		return var4;
	}
}
