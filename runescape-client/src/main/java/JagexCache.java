import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("it")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lvp;"
	)
	@Export("JagexCache_dat2File")
	public static AccessFile JagexCache_dat2File;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lvo;"
	)
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[Lvo;"
	)
	@Export("JagexCache_idxFiles")
	public static BufferedFile[] JagexCache_idxFiles;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1629678375
	)
	static int field2435;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lvo;"
	)
	@Export("JagexCache_randomDat")
	public static BufferedFile JagexCache_randomDat;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -887356757
	)
	static int field2431;

	static {
		JagexCache_dat2File = null;
		JagexCache_idx255File = null;
		JagexCache_randomDat = null;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lfg;FB)F",
		garbageValue = "-118"
	)
	static float method4732(class136 var0, float var1) {
		if (var0 != null && var0.method3551() != 0) {
			if (var1 < (float)var0.field1596[0].field1552) {
				return var0.field1604 == class134.field1581 ? var0.field1596[0].field1544 : class131.method3455(var0, var1, true);
			} else if (var1 > (float)var0.field1596[var0.method3551() - 1].field1552) {
				return var0.field1615 == class134.field1581 ? var0.field1596[var0.method3551() - 1].field1544 : class131.method3455(var0, var1, false);
			} else if (var0.field1593) {
				return var0.field1596[0].field1544;
			} else {
				class131 var2 = var0.method3549(var1);
				boolean var3 = false;
				boolean var4 = false;
				if (var2 == null) {
					return 0.0F;
				} else {
					float var5;
					float var6;
					if (0.0F == var2.field1547 && var2.field1548 == 0.0F) {
						var3 = true;
					} else if (Float.MAX_VALUE == var2.field1547 && var2.field1548 == Float.MAX_VALUE) {
						var4 = true;
					} else if (var2.field1549 != null) {
						if (var0.field1598) {
							var5 = (float)var2.field1552;
							float var9 = var2.field1544;
							var6 = var2.field1547 * 0.33333334F + var5;
							float var10 = var2.field1548 * 0.33333334F + var9;
							float var8 = (float)var2.field1549.field1552;
							float var12 = var2.field1549.field1544;
							float var7 = var8 - var2.field1549.field1543 * 0.33333334F;
							float var11 = var12 - 0.33333334F * var2.field1549.field1546;
							float var13;
							float var15;
							float var16;
							float var17;
							float var18;
							float var19;
							if (var0.field1599) {
								var15 = var10;
								var16 = var11;
								if (var0 != null) {
									var17 = var8 - var5;
									if (0.0F != var17) {
										var18 = var6 - var5;
										var19 = var7 - var5;
										float[] var27 = new float[]{var18 / var17, var19 / var17};
										var0.field1592 = var27[0] == 0.33333334F && var27[1] == 0.6666667F;
										float var21 = var27[0];
										float var22 = var27[1];
										if (var27[0] < 0.0F) {
											var27[0] = 0.0F;
										}

										if (var27[1] > 1.0F) {
											var27[1] = 1.0F;
										}

										if (var27[0] > 1.0F || var27[1] < -1.0F) {
											class217.method4696(var27);
										}

										if (var27[0] != var21) {
											var13 = var17 * var27[0] + var5;
											if (0.0F != var21) {
												var15 = var9 + var27[0] * (var10 - var9) / var21;
											}
										}

										if (var27[1] != var22) {
											float var10000 = var5 + var17 * var27[1];
											if (var22 != 1.0F) {
												var16 = var12 - (var12 - var11) * (1.0F - var27[1]) / (1.0F - var22);
											}
										}

										var0.field1600 = var5;
										var0.field1597 = var8;
										VertexNormal.method5708(0.0F, var27[0], var27[1], 1.0F, var0);
										float var23 = var15 - var9;
										float var24 = var16 - var15;
										float var25 = var12 - var16;
										float var26 = var24 - var23;
										var0.field1607 = var25 - var24 - var26;
										var0.field1594 = var26 + var26 + var26;
										var0.field1605 = var23 + var23 + var23;
										var0.field1612 = var9;
									}
								}
							} else if (var0 != null) {
								var0.field1600 = var5;
								var13 = var8 - var5;
								float var14 = var12 - var9;
								var15 = var6 - var5;
								var16 = 0.0F;
								var17 = 0.0F;
								if (var15 != 0.0F) {
									var16 = (var10 - var9) / var15;
								}

								var15 = var8 - var7;
								if (0.0F != var15) {
									var17 = (var12 - var11) / var15;
								}

								var18 = 1.0F / (var13 * var13);
								var19 = var13 * var16;
								float var20 = var13 * var17;
								var0.field1595 = (var20 + var19 - var14 - var14) * var18 / var13;
								var0.field1601 = var18 * (var14 + var14 + var14 - var19 - var19 - var20);
								var0.field1602 = var16;
								var0.field1603 = var9;
							}

							var0.field1598 = false;
						}
					} else {
						var3 = true;
					}

					if (var3) {
						return var2.field1544;
					} else if (var4) {
						return (float)var2.field1552 != var1 && var2.field1549 != null ? var2.field1549.field1544 : var2.field1544;
					} else if (var0.field1599) {
						return MenuAction.method1866(var0, var1);
					} else {
						if (var0 == null) {
							var5 = 0.0F;
						} else {
							var6 = var1 - var0.field1600;
							var5 = var6 * (var0.field1602 + (var6 * var0.field1595 + var0.field1601) * var6) + var0.field1603;
						}

						return var5;
					}
				}
			}
		} else {
			return 0.0F;
		}
	}
}
