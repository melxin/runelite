import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nr")
public class class344 implements Comparator {
	class344() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lmi;Lmi;B)I",
		garbageValue = "113"
	)
	int method6784(class337 var1, class337 var2) {
		return var1.field3688 - var2.field3688;
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.method6784((class337)var1, (class337)var2);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lfm;FB)F",
		garbageValue = "4"
	)
	static float method6792(class137 var0, float var1) {
		if (var0 != null && var0.method3335() != 0) {
			if (var1 < (float)var0.field1574[0].field1525) {
				return var0.field1572 == class135.field1559 ? var0.field1574[0].field1528 : class154.method3485(var0, var1, true);
			} else if (var1 > (float)var0.field1574[var0.method3335() - 1].field1525) {
				return var0.field1573 == class135.field1559 ? var0.field1574[var0.method3335() - 1].field1528 : class154.method3485(var0, var1, false);
			} else if (var0.field1589) {
				return var0.field1574[0].field1528;
			} else {
				class132 var2 = var0.method3326(var1);
				boolean var3 = false;
				boolean var4 = false;
				if (var2 == null) {
					return 0.0F;
				} else {
					if (0.0F == var2.field1524 && var2.field1529 == 0.0F) {
						var3 = true;
					} else if (var2.field1524 == Float.MAX_VALUE && var2.field1529 == Float.MAX_VALUE) {
						var4 = true;
					} else if (var2.field1530 != null) {
						if (var0.field1586) {
							float var5 = (float)var2.field1525;
							float var9 = var2.field1528;
							float var6 = 0.33333334F * var2.field1524 + var5;
							float var10 = 0.33333334F * var2.field1529 + var9;
							float var8 = (float)var2.field1530.field1525;
							float var12 = var2.field1530.field1528;
							float var7 = var8 - 0.33333334F * var2.field1530.field1526;
							float var11 = var12 - 0.33333334F * var2.field1530.field1527;
							float var14;
							float var15;
							float var16;
							float var17;
							float var18;
							float var19;
							if (var0.field1571) {
								var15 = var10;
								var16 = var11;
								if (var0 != null) {
									var17 = var8 - var5;
									if (0.0F != var17) {
										var18 = var6 - var5;
										var19 = var7 - var5;
										float[] var29 = new float[]{var18 / var17, var19 / var17};
										var0.field1570 = 0.33333334F == var29[0] && 0.6666667F == var29[1];
										float var21 = var29[0];
										float var22 = var29[1];
										if (var29[0] < 0.0F) {
											var29[0] = 0.0F;
										}

										if (var29[1] > 1.0F) {
											var29[1] = 1.0F;
										}

										float var23;
										if (var29[0] > 1.0F || var29[1] < -1.0F) {
											var29[1] = 1.0F - var29[1];
											if (var29[0] < 0.0F) {
												var29[0] = 0.0F;
											}

											if (var29[1] < 0.0F) {
												var29[1] = 0.0F;
											}

											if (var29[0] > 1.0F || var29[1] > 1.0F) {
												var23 = 1.0F + var29[0] * (var29[0] - 2.0F + var29[1]) + (var29[1] - 2.0F) * var29[1];
												if (var23 + class133.field1535 > 0.0F) {
													class146.method3435(var29);
												}
											}

											var29[1] = 1.0F - var29[1];
										}

										if (var29[0] != var21) {
											float var10000 = var5 + var29[0] * var17;
											if (0.0F != var21) {
												var15 = (var10 - var9) * var29[0] / var21 + var9;
											}
										}

										if (var29[1] != var22) {
											var14 = var17 * var29[1] + var5;
											if (var22 != 1.0F) {
												var16 = var12 - (1.0F - var29[1]) * (var12 - var11) / (1.0F - var22);
											}
										}

										var0.field1576 = var5;
										var0.field1578 = var8;
										var23 = var29[0];
										float var24 = var29[1];
										float var25 = var23 - 0.0F;
										float var26 = var24 - var23;
										float var27 = 1.0F - var24;
										float var28 = var26 - var25;
										var0.field1588 = var27 - var26 - var28;
										var0.field1580 = var28 + var28 + var28;
										var0.field1579 = var25 + var25 + var25;
										var0.field1587 = 0.0F;
										var25 = var15 - var9;
										var26 = var16 - var15;
										var27 = var12 - var16;
										var28 = var26 - var25;
										var0.field1585 = var27 - var26 - var28;
										var0.field1584 = var28 + var28 + var28;
										var0.field1583 = var25 + var25 + var25;
										var0.field1582 = var9;
									}
								}
							} else if (var0 != null) {
								var0.field1576 = var5;
								float var13 = var8 - var5;
								var14 = var12 - var9;
								var15 = var6 - var5;
								var16 = 0.0F;
								var17 = 0.0F;
								if (var15 != 0.0F) {
									var16 = (var10 - var9) / var15;
								}

								var15 = var8 - var7;
								if (var15 != 0.0F) {
									var17 = (var12 - var11) / var15;
								}

								var18 = 1.0F / (var13 * var13);
								var19 = var16 * var13;
								float var20 = var13 * var17;
								var0.field1587 = var18 * (var20 + var19 - var14 - var14) / var13;
								var0.field1579 = var18 * (var14 + var14 + var14 - var19 - var19 - var20);
								var0.field1580 = var16;
								var0.field1588 = var9;
							}

							var0.field1586 = false;
						}
					} else {
						var3 = true;
					}

					if (var3) {
						return var2.field1528;
					} else if (var4) {
						return (float)var2.field1525 != var1 && var2.field1530 != null ? var2.field1530.field1528 : var2.field1528;
					} else {
						return var0.field1571 ? GameEngine.method637(var0, var1) : AbstractByteArrayCopier.method7435(var0, var1);
					}
				}
			}
		} else {
			return 0.0F;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([BIIB)Ljava/lang/String;",
		garbageValue = "-1"
	)
	public static String method6790(byte[] var0, int var1, int var2) {
		StringBuilder var3 = new StringBuilder();

		for (int var4 = var1; var4 < var2 + var1; var4 += 3) {
			int var5 = var0[var4] & 255;
			var3.append(class418.field4728[var5 >>> 2]);
			if (var4 < var2 - 1) {
				int var6 = var0[var4 + 1] & 255;
				var3.append(class418.field4728[(var5 & 3) << 4 | var6 >>> 4]);
				if (var4 < var2 - 2) {
					int var7 = var0[var4 + 2] & 255;
					var3.append(class418.field4728[(var6 & 15) << 2 | var7 >>> 6]).append(class418.field4728[var7 & 63]);
				} else {
					var3.append(class418.field4728[(var6 & 15) << 2]).append("=");
				}
			} else {
				var3.append(class418.field4728[(var5 & 3) << 4]).append("==");
			}
		}

		return var3.toString();
	}
}
