import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kn")
public class class279 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Lri;",
		garbageValue = "-2086498329"
	)
	public static Bounds method6309(int var0, int var1, int var2, int var3) {
		synchronized(Bounds.field5048) {
			if (Bounds.field5043 == 0) {
				return new Bounds(var0, var1, var2, var3);
			} else {
				--Bounds.field5043;
				Bounds.field5048[Bounds.field5043].setLow(var0, var1);
				Bounds.field5048[Bounds.field5043].setHigh(var2, var3);
				return Bounds.field5048[Bounds.field5043];
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-2032358488"
	)
	static int method6308(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return 0;
		} else if (var1 == -1) {
			return 0;
		} else {
			int var3 = 0;

			for (int var4 = 0; var4 < var2.quantities.length; ++var4) {
				if (var2.ids[var4] == var1) {
					var3 += var2.quantities[var4];
				}
			}

			return var3;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "([I[JIII)V",
		garbageValue = "-2109785506"
	)
	public static void method6302(int[] var0, long[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			int var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			long var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;
			int var9 = var6 == Integer.MAX_VALUE ? 0 : 1;

			for (int var10 = var2; var10 < var3; ++var10) {
				if (var0[var10] < (var10 & var9) + var6) {
					int var11 = var0[var10];
					var0[var10] = var0[var5];
					var0[var5] = var11;
					long var12 = var1[var10];
					var1[var10] = var1[var5];
					var1[var5++] = var12;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method6302(var0, var1, var2, var5 - 1);
			method6302(var0, var1, var5 + 1, var3);
		}

	}
}
