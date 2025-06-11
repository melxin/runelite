import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fa")
public class class131 {
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Lwy;"
	)
	@Export("titlebuttonSprite")
	static IndexedSprite titlebuttonSprite;
	@ObfuscatedName("pn")
	@Export("regions")
	static int[] regions;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1203899933
	)
	int field1552;
	@ObfuscatedName("aj")
	float field1544;
	@ObfuscatedName("an")
	float field1543;
	@ObfuscatedName("ai")
	float field1546;
	@ObfuscatedName("al")
	float field1547;
	@ObfuscatedName("ac")
	float field1548;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lfa;"
	)
	class131 field1549;

	class131() {
		this.field1543 = Float.MAX_VALUE;
		this.field1546 = Float.MAX_VALUE;
		this.field1547 = Float.MAX_VALUE;
		this.field1548 = Float.MAX_VALUE;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lwt;II)V",
		garbageValue = "-944452921"
	)
	void method3456(Buffer var1, int var2) {
		this.field1552 = var1.readShort();
		this.field1544 = var1.method10861();
		this.field1543 = var1.method10861();
		this.field1546 = var1.method10861();
		this.field1547 = var1.method10861();
		this.field1548 = var1.method10861();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lps;B)V",
		garbageValue = "34"
	)
	public static void method3458(AbstractArchive var0) {
		FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var0;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfg;FZI)F",
		garbageValue = "-1614793055"
	)
	static float method3455(class136 var0, float var1, boolean var2) {
		float var3 = 0.0F;
		if (var0 != null && var0.method3551() != 0) {
			float var4 = (float)var0.field1596[0].field1552;
			float var5 = (float)var0.field1596[var0.method3551() - 1].field1552;
			float var6 = var5 - var4;
			if (var6 == 0.0F) {
				return var0.field1596[0].field1544;
			} else {
				float var7 = 0.0F;
				if (var1 > var5) {
					var7 = (var1 - var5) / var6;
				} else {
					var7 = (var1 - var4) / var6;
				}

				float var8 = (float)((int)var7);
				float var9 = Math.abs(var7 - var8);
				float var10 = var9 * var6;
				var8 = Math.abs(var8 + 1.0F);
				float var11 = var8 / 2.0F;
				float var12 = (float)((int)var11);
				var9 = var11 - var12;
				float var13;
				float var14;
				if (var2) {
					if (var0.field1604 == class134.field1579) {
						if (0.0F != var9) {
							var10 += var4;
						} else {
							var10 = var5 - var10;
						}
					} else if (var0.field1604 != class134.field1577 && var0.field1604 != class134.field1578) {
						if (var0.field1604 == class134.field1580) {
							var10 = var4 - var1;
							var13 = var0.field1596[0].field1543;
							var14 = var0.field1596[0].field1546;
							var3 = var0.field1596[0].field1544;
							if (0.0F != var13) {
								var3 -= var10 * var14 / var13;
							}

							return var3;
						}
					} else {
						var10 = var5 - var10;
					}
				} else if (var0.field1615 == class134.field1579) {
					if (var9 != 0.0F) {
						var10 = var5 - var10;
					} else {
						var10 += var4;
					}
				} else if (var0.field1615 != class134.field1577 && var0.field1615 != class134.field1578) {
					if (var0.field1615 == class134.field1580) {
						var10 = var1 - var5;
						var13 = var0.field1596[var0.method3551() - 1].field1547;
						var14 = var0.field1596[var0.method3551() - 1].field1548;
						var3 = var0.field1596[var0.method3551() - 1].field1544;
						if (var13 != 0.0F) {
							var3 += var10 * var14 / var13;
						}

						return var3;
					}
				} else {
					var10 += var4;
				}

				var3 = JagexCache.method4732(var0, var10);
				float var15;
				if (var2 && var0.field1604 == class134.field1578) {
					var15 = var0.field1596[var0.method3551() - 1].field1544 - var0.field1596[0].field1544;
					var3 -= var8 * var15;
				} else if (!var2 && var0.field1615 == class134.field1578) {
					var15 = var0.field1596[var0.method3551() - 1].field1544 - var0.field1596[0].field1544;
					var3 += var8 * var15;
				}

				return var3;
			}
		} else {
			return var3;
		}
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1159154770"
	)
	static final void method3459() {
		if (WidgetDefinition.field3870) {
			class394.method7983();
			WidgetDefinition.field3870 = false;
		}

	}
}
