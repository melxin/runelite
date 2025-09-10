import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ox")
public class class383 {
	static {
		Math.sqrt(8192.0D);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lti;Lti;I)I",
		garbageValue = "963603957"
	)
	public static int method8183(DynamicArray var0, DynamicArray var1) {
		if (var1 == var0) {
			return 0;
		} else if (var0 == null) {
			return -1;
		} else if (var1 == null) {
			return 1;
		} else {
			int var2 = var0.method10322();
			int var3 = var1.method10322();
			int var4 = Math.min(var2, var3);
			int var7;
			if (var0.field5504 == class574.field5820 && class574.field5820 == var1.field5504) {
				int[] var10 = var0.method10318();
				int[] var12 = var1.method10318();

				for (var7 = 0; var7 < var4; ++var7) {
					if (var10[var7] < var12[var7]) {
						return -1;
					}

					if (var10[var7] > var12[var7]) {
						return 1;
					}
				}
			} else if (var0.field5504 == class574.field5816 && class574.field5816 == var1.field5504) {
				long[] var9 = var0.method10320();
				long[] var11 = var1.method10320();

				for (var7 = 0; var7 < var4; ++var7) {
					if (var9[var7] < var11[var7]) {
						return -1;
					}

					if (var9[var7] > var11[var7]) {
						return 1;
					}
				}
			} else {
				if (var0.field5504 != class574.field5824 || class574.field5824 != var1.field5504) {
					throw new RuntimeException();
				}

				Object[] var5 = var0.method10321();
				Object[] var6 = var1.method10321();

				for (var7 = 0; var7 < var4; ++var7) {
					int var8 = ((String)var5[var7]).compareTo((String)var6[var7]);
					if (var8 < 0) {
						return -1;
					}

					if (var8 > 0) {
						return 1;
					}
				}
			}

			return var2 < var3 ? -1 : (var2 == var3 ? 0 : 1);
		}
	}
}
