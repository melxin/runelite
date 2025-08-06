import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lt")
public class class301 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	static final class301 field3382;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	static final class301 field3383;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 765760583
	)
	@Export("value")
	final int value;

	static {
		field3382 = new class301(0);
		field3383 = new class301(1);
	}

	class301(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lfn;FI)F",
		garbageValue = "-1214992905"
	)
	static float method6813(class137 var0, float var1) {
		if (var0 != null && var0.method3658() != 0) {
			if (var1 < (float)var0.field1634[0].field1597) {
				return var0.field1636 == class135.field1619 ? var0.field1634[0].field1589 : class312.method6942(var0, var1, true);
			} else if (var1 > (float)var0.field1634[var0.method3658() - 1].field1597) {
				return var0.field1645 == class135.field1619 ? var0.field1634[var0.method3658() - 1].field1589 : class312.method6942(var0, var1, false);
			} else if (var0.field1648) {
				return var0.field1634[0].field1589;
			} else {
				class132 var2 = var0.method3657(var1);
				boolean var3 = false;
				boolean var4 = false;
				if (var2 == null) {
					return 0.0F;
				} else {
					if (0.0F == var2.field1592 && 0.0F == var2.field1593) {
						var3 = true;
					} else if (var2.field1592 == Float.MAX_VALUE && Float.MAX_VALUE == var2.field1593) {
						var4 = true;
					} else if (var2.field1595 != null) {
						if (var0.field1650) {
							float var5 = (float)var2.field1597;
							float var9 = var2.field1589;
							float var6 = var5 + var2.field1592 * 0.33333334F;
							float var10 = var9 + var2.field1593 * 0.33333334F;
							float var8 = (float)var2.field1595.field1597;
							float var12 = var2.field1595.field1589;
							float var7 = var8 - 0.33333334F * var2.field1595.field1590;
							float var11 = var12 - var2.field1595.field1591 * 0.33333334F;
							if (var0.field1640) {
								ObjectComposition.method4568(var0, var5, var6, var7, var8, var9, var10, var11, var12);
							} else if (var0 != null) {
								var0.field1658 = var5;
								float var13 = var8 - var5;
								float var14 = var12 - var9;
								float var15 = var6 - var5;
								float var16 = 0.0F;
								float var17 = 0.0F;
								if (0.0F != var15) {
									var16 = (var10 - var9) / var15;
								}

								var15 = var8 - var7;
								if (0.0F != var15) {
									var17 = (var12 - var11) / var15;
								}

								float var18 = 1.0F / (var13 * var13);
								float var19 = var16 * var13;
								float var20 = var17 * var13;
								var0.field1642 = (var20 + var19 - var14 - var14) * var18 / var13;
								var0.field1643 = var18 * (var14 + var14 + var14 - var19 - var19 - var20);
								var0.field1635 = var16;
								var0.field1646 = var9;
							}

							var0.field1650 = false;
						}
					} else {
						var3 = true;
					}

					if (var3) {
						return var2.field1589;
					} else if (var4) {
						return var1 != (float)var2.field1597 && var2.field1595 != null ? var2.field1595.field1589 : var2.field1589;
					} else {
						return var0.field1640 ? ByteArrayPool.method9739(var0, var1) : ViewportMouse.method5621(var0, var1);
					}
				}
			}
		} else {
			return 0.0F;
		}
	}
}
