import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mn")
public abstract class class312 implements class314 {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 803105357
	)
	protected int field3429;

	@ObfuscatedSignature(
		descriptor = "(Loy;Lqq;I)V"
	)
	protected class312(StudioGame var1, Language var2, int var3) {
		this.field3429 = var3;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lfn;FZB)F",
		garbageValue = "-22"
	)
	static float method6942(class137 var0, float var1, boolean var2) {
		float var3 = 0.0F;
		if (var0 != null && var0.method3658() != 0) {
			float var4 = (float)var0.field1634[0].field1597;
			float var5 = (float)var0.field1634[var0.method3658() - 1].field1597;
			float var6 = var5 - var4;
			if (var6 == 0.0F) {
				return var0.field1634[0].field1589;
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
				var8 = Math.abs(var8 + 1.0F);
				float var11 = var8 / 2.0F;
				float var12 = (float)((int)var11);
				var9 = var11 - var12;
				float var13;
				float var14;
				if (var2) {
					if (var0.field1636 == class135.field1623) {
						if (var9 != 0.0F) {
							var10 += var4;
						} else {
							var10 = var5 - var10;
						}
					} else if (var0.field1636 != class135.field1622 && var0.field1636 != class135.field1621) {
						if (var0.field1636 == class135.field1620) {
							var10 = var4 - var1;
							var13 = var0.field1634[0].field1590;
							var14 = var0.field1634[0].field1591;
							var3 = var0.field1634[0].field1589;
							if (var13 != 0.0F) {
								var3 -= var14 * var10 / var13;
							}

							return var3;
						}
					} else {
						var10 = var5 - var10;
					}
				} else if (var0.field1645 == class135.field1623) {
					if (0.0F != var9) {
						var10 = var5 - var10;
					} else {
						var10 += var4;
					}
				} else if (var0.field1645 != class135.field1622 && var0.field1645 != class135.field1621) {
					if (var0.field1645 == class135.field1620) {
						var10 = var1 - var5;
						var13 = var0.field1634[var0.method3658() - 1].field1592;
						var14 = var0.field1634[var0.method3658() - 1].field1593;
						var3 = var0.field1634[var0.method3658() - 1].field1589;
						if (0.0F != var13) {
							var3 += var14 * var10 / var13;
						}

						return var3;
					}
				} else {
					var10 += var4;
				}

				var3 = class301.method6813(var0, var10);
				float var15;
				if (var2 && var0.field1636 == class135.field1621) {
					var15 = var0.field1634[var0.method3658() - 1].field1589 - var0.field1634[0].field1589;
					var3 -= var15 * var8;
				} else if (!var2 && var0.field1645 == class135.field1621) {
					var15 = var0.field1634[var0.method3658() - 1].field1589 - var0.field1634[0].field1589;
					var3 += var8 * var15;
				}

				return var3;
			}
		} else {
			return var3;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-89"
	)
	@Export("isDigit")
	public static boolean isDigit(char var0) {
		return var0 >= '0' && var0 <= '9';
	}
}
