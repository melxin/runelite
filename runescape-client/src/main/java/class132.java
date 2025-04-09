import java.security.SecureRandom;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
public class class132 {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1400978679
	)
	public final int field1557;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Lrm;"
	)
	final TransformationMatrix[] field1559;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	public class132 field1560;
	@ObfuscatedName("af")
	float[][] field1553;
	@ObfuscatedName("as")
	boolean field1550;
	@ObfuscatedName("aq")
	boolean field1555;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[Lrm;"
	)
	TransformationMatrix[] field1556;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "[Lrm;"
	)
	TransformationMatrix[] field1551;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lrm;"
	)
	TransformationMatrix field1552;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lrm;"
	)
	TransformationMatrix field1554;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lrm;"
	)
	TransformationMatrix field1558;
	@ObfuscatedName("aw")
	float[][] field1561;
	@ObfuscatedName("ar")
	float[][] field1562;
	@ObfuscatedName("au")
	float[][] field1563;

	@ObfuscatedSignature(
		descriptor = "(ILve;Z)V"
	)
	public class132(int var1, Buffer var2, boolean var3) {
		this.field1550 = true;
		this.field1555 = true;
		this.field1552 = new TransformationMatrix();
		this.field1554 = new TransformationMatrix();
		this.field1558 = new TransformationMatrix();
		this.field1557 = var2.readShort();
		this.field1559 = new TransformationMatrix[var1];
		this.field1556 = new TransformationMatrix[this.field1559.length];
		this.field1551 = new TransformationMatrix[this.field1559.length];
		this.field1553 = new float[this.field1559.length][3];

		for (int var4 = 0; var4 < this.field1559.length; ++var4) {
			this.field1559[var4] = new TransformationMatrix(var2, var3);
			this.field1553[var4][0] = var2.method10305();
			this.field1553[var4][1] = var2.method10305();
			this.field1553[var4][2] = var2.method10305();
		}

		this.method3267();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-690298561"
	)
	void method3267() {
		this.field1561 = new float[this.field1559.length][3];
		this.field1562 = new float[this.field1559.length][3];
		this.field1563 = new float[this.field1559.length][3];
		TransformationMatrix var1 = class331.method6572();

		for (int var2 = 0; var2 < this.field1559.length; ++var2) {
			TransformationMatrix var3 = this.method3268(var2);
			var1.method8430(var3);
			var1.method8439();
			this.field1561[var2] = var1.method8443();
			this.field1562[var2][0] = var3.field4936[12];
			this.field1562[var2][1] = var3.field4936[13];
			this.field1562[var2][2] = var3.field4936[14];
			this.field1563[var2] = var3.method8448();
		}

		var1.method8500();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Lrm;",
		garbageValue = "-346125770"
	)
	TransformationMatrix method3268(int var1) {
		return this.field1559[var1];
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Lrm;",
		garbageValue = "137702001"
	)
	TransformationMatrix method3296(int var1) {
		if (this.field1556[var1] == null) {
			this.field1556[var1] = new TransformationMatrix(this.method3268(var1));
			if (this.field1560 != null) {
				this.field1556[var1].method8450(this.field1560.method3296(var1));
			} else {
				this.field1556[var1].method8450(TransformationMatrix.field4933);
			}
		}

		return this.field1556[var1];
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Lrm;",
		garbageValue = "1720989664"
	)
	TransformationMatrix method3276(int var1) {
		if (this.field1551[var1] == null) {
			this.field1551[var1] = new TransformationMatrix(this.method3296(var1));
			this.field1551[var1].method8439();
		}

		return this.field1551[var1];
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Lrm;",
		garbageValue = "-1095388575"
	)
	TransformationMatrix method3302() {
		return this.field1552;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lrm;I)V",
		garbageValue = "1606902615"
	)
	void method3271(TransformationMatrix var1) {
		this.field1552.method8430(var1);
		this.field1550 = true;
		this.field1555 = true;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Lrm;",
		garbageValue = "919076194"
	)
	TransformationMatrix method3272() {
		if (this.field1550) {
			this.field1554.method8430(this.method3302());
			if (this.field1560 != null) {
				this.field1554.method8450(this.field1560.method3272());
			}

			this.field1550 = false;
		}

		return this.field1554;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Lrm;",
		garbageValue = "16711680"
	)
	public TransformationMatrix method3273(int var1) {
		if (this.field1555) {
			this.field1558.method8430(this.method3276(var1));
			this.field1558.method8450(this.method3272());
			this.field1555 = false;
		}

		return this.field1558;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "1288757816"
	)
	float[] method3274(int var1) {
		return this.field1561[var1];
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "1195342498"
	)
	float[] method3275(int var1) {
		return this.field1562[var1];
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "1881425001"
	)
	float[] method3298(int var1) {
		return this.field1563[var1];
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([FIFZFZ[FI)I",
		garbageValue = "-2127276057"
	)
	public static int method3294(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6) {
		float var7 = 0.0F;

		for (int var8 = 0; var8 < var1 + 1; ++var8) {
			var7 += Math.abs(var0[var8]);
		}

		float var44 = (Math.abs(var2) + Math.abs(var4)) * (float)(var1 + 1) * class131.field1545;
		if (var7 <= var44) {
			return -1;
		} else {
			float[] var9 = new float[var1 + 1];

			int var10;
			for (var10 = 0; var10 < var1 + 1; ++var10) {
				var9[var10] = 1.0F / var7 * var0[var10];
			}

			while (Math.abs(var9[var1]) < var44) {
				--var1;
			}

			var10 = 0;
			if (var1 == 0) {
				return var10;
			} else if (var1 == 1) {
				var6[0] = -var9[0] / var9[1];
				boolean var42 = var3 ? var2 < var6[0] + var44 : var2 < var6[0] - var44;
				boolean var43 = var5 ? var4 > var6[0] - var44 : var4 > var44 + var6[0];
				var10 = var42 && var43 ? 1 : 0;
				if (var10 > 0) {
					if (var3 && var6[0] < var2) {
						var6[0] = var2;
					} else if (var5 && var6[0] > var4) {
						var6[0] = var4;
					}
				}

				return var10;
			} else {
				class446 var11 = new class446(var9, var1);
				float[] var12 = new float[var1 + 1];

				for (int var13 = 1; var13 <= var1; ++var13) {
					var12[var13 - 1] = var9[var13] * (float)var13;
				}

				float[] var41 = new float[var1 + 1];
				int var14 = method3294(var12, var1 - 1, var2, false, var4, false, var41);
				if (var14 == -1) {
					return 0;
				} else {
					boolean var15 = false;
					float var17 = 0.0F;
					float var18 = 0.0F;
					float var19 = 0.0F;

					for (int var20 = 0; var20 <= var14; ++var20) {
						if (var10 > var1) {
							return var10;
						}

						float var16;
						if (var20 == 0) {
							var16 = var2;
							var18 = WorldMapLabelSize.method5923(var9, var1, var2);
							if (Math.abs(var18) <= var44 && var3) {
								var6[var10++] = var2;
							}
						} else {
							var16 = var19;
							var18 = var17;
						}

						if (var20 == var14) {
							var19 = var4;
							var15 = false;
						} else {
							var19 = var41[var20];
						}

						var17 = WorldMapLabelSize.method5923(var9, var1, var19);
						if (var15) {
							var15 = false;
						} else if (Math.abs(var17) < var44) {
							if (var14 != var20 || var5) {
								var6[var10++] = var19;
								var15 = true;
							}
						} else if (var18 < 0.0F && var17 > 0.0F || var18 > 0.0F && var17 < 0.0F) {
							int var22 = var10++;
							float var24 = var16;
							float var25 = var19;
							float var26 = WorldMapLabelSize.method5923(var11.field4950, var11.field4951, var16);
							float var23;
							if (Math.abs(var26) < class131.field1545) {
								var23 = var16;
							} else {
								float var27 = WorldMapLabelSize.method5923(var11.field4950, var11.field4951, var19);
								if (Math.abs(var27) < class131.field1545) {
									var23 = var19;
								} else {
									float var28 = 0.0F;
									float var29 = 0.0F;
									float var30 = 0.0F;
									float var35 = 0.0F;
									boolean var36 = true;
									boolean var37 = false;

									do {
										var37 = false;
										if (var36) {
											var28 = var24;
											var35 = var26;
											var29 = var25 - var24;
											var30 = var29;
											var36 = false;
										}

										if (Math.abs(var35) < Math.abs(var27)) {
											var24 = var25;
											var25 = var28;
											var28 = var24;
											var26 = var27;
											var27 = var35;
											var35 = var26;
										}

										float var38 = class131.field1546 * Math.abs(var25) + 0.0F;
										float var39 = 0.5F * (var28 - var25);
										boolean var40 = Math.abs(var39) > var38 && var27 != 0.0F;
										if (var40) {
											if (Math.abs(var30) >= var38 && Math.abs(var26) > Math.abs(var27)) {
												float var34 = var27 / var26;
												float var31;
												float var32;
												if (var24 == var28) {
													var31 = var34 * var39 * 2.0F;
													var32 = 1.0F - var34;
												} else {
													var32 = var26 / var35;
													float var33 = var27 / var35;
													var31 = var34 * (var32 * var39 * 2.0F * (var32 - var33) - (var25 - var24) * (var33 - 1.0F));
													var32 = (var33 - 1.0F) * (var32 - 1.0F) * (var34 - 1.0F);
												}

												if ((double)var31 > 0.0D) {
													var32 = -var32;
												} else {
													var31 = -var31;
												}

												var34 = var30;
												var30 = var29;
												if (2.0F * var31 < 3.0F * var39 * var32 - Math.abs(var38 * var32) && var31 < Math.abs(var32 * 0.5F * var34)) {
													var29 = var31 / var32;
												} else {
													var29 = var39;
													var30 = var39;
												}
											} else {
												var29 = var39;
												var30 = var39;
											}

											var24 = var25;
											var26 = var27;
											if (Math.abs(var29) > var38) {
												var25 += var29;
											} else if ((double)var39 > 0.0D) {
												var25 += var38;
											} else {
												var25 -= var38;
											}

											var27 = WorldMapLabelSize.method5923(var11.field4950, var11.field4951, var25);
											if ((double)(var27 * (var35 / Math.abs(var35))) > 0.0D) {
												var36 = true;
												var37 = true;
											} else {
												var37 = true;
											}
										}
									} while(var37);

									var23 = var25;
								}
							}

							var6[var22] = var23;
							if (var10 > 1 && var6[var10 - 2] >= var6[var10 - 1] - var44) {
								var6[var10 - 2] = (var6[var10 - 2] + var6[var10 - 1]) * 0.5F;
								--var10;
							}
						}
					}

					return var10;
				}
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/security/SecureRandom;",
		garbageValue = "29"
	)
	static SecureRandom method3297() {
		SecureRandom var0 = new SecureRandom();
		var0.nextInt();
		return var0;
	}
}
