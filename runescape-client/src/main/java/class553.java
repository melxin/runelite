import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vc")
public class class553 {
	@ObfuscatedName("ay")
	static final int[] field5488;
	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	static Archive field5487;

	static {
		field5488 = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, -1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 3, 3, 1, 1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lfn;FZB)F",
		garbageValue = "17"
	)
	static float method10052(class136 var0, float var1, boolean var2) {
		float var3 = 0.0F;
		if (var0 != null && var0.method3366() != 0) {
			float var4 = (float)var0.field1623[0].field1564;
			float var5 = (float)var0.field1623[var0.method3366() - 1].field1564;
			float var6 = var5 - var4;
			if (var6 == 0.0F) {
				return var0.field1623[0].field1563;
			} else {
				float var7 = 0.0F;
				if (var1 > var5) {
					var7 = (var1 - var5) / var6;
				} else {
					var7 = (var1 - var4) / var6;
				}

				float var8 = (float)((int)var7);
				float var9 = Math.abs(var7 - var8);
				float var10 = var6 * var9;
				var8 = Math.abs(1.0F + var8);
				float var11 = var8 / 2.0F;
				float var12 = (float)((int)var11);
				var9 = var11 - var12;
				float var13;
				float var14;
				if (var2) {
					if (var0.field1630 == class134.field1598) {
						if (var9 != 0.0F) {
							var10 += var4;
						} else {
							var10 = var5 - var10;
						}
					} else if (var0.field1630 != class134.field1595 && var0.field1630 != class134.field1597) {
						if (var0.field1630 == class134.field1594) {
							var10 = var4 - var1;
							var13 = var0.field1623[0].field1560;
							var14 = var0.field1623[0].field1561;
							var3 = var0.field1623[0].field1563;
							if (0.0F != var13) {
								var3 -= var10 * var14 / var13;
							}

							return var3;
						}
					} else {
						var10 = var5 - var10;
					}
				} else if (var0.field1616 == class134.field1598) {
					if (0.0F != var9) {
						var10 = var5 - var10;
					} else {
						var10 += var4;
					}
				} else if (var0.field1616 != class134.field1595 && var0.field1616 != class134.field1597) {
					if (var0.field1616 == class134.field1594) {
						var10 = var1 - var5;
						var13 = var0.field1623[var0.method3366() - 1].field1562;
						var14 = var0.field1623[var0.method3366() - 1].field1565;
						var3 = var0.field1623[var0.method3366() - 1].field1563;
						if (0.0F != var13) {
							var3 += var14 * var10 / var13;
						}

						return var3;
					}
				} else {
					var10 += var4;
				}

				var3 = ClientPreferences.method2810(var0, var10);
				float var15;
				if (var2 && var0.field1630 == class134.field1597) {
					var15 = var0.field1623[var0.method3366() - 1].field1563 - var0.field1623[0].field1563;
					var3 -= var8 * var15;
				} else if (!var2 && var0.field1616 == class134.field1597) {
					var15 = var0.field1623[var0.method3366() - 1].field1563 - var0.field1623[0].field1563;
					var3 += var8 * var15;
				}

				return var3;
			}
		} else {
			return var3;
		}
	}
}
