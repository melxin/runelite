import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rw")
public class class445 {
	@ObfuscatedName("ao")
	float field4941;
	@ObfuscatedName("an")
	float field4948;
	@ObfuscatedName("ae")
	float field4940;
	@ObfuscatedName("af")
	float field4945;
	@ObfuscatedName("as")
	float field4942;
	@ObfuscatedName("aq")
	float field4943;
	@ObfuscatedName("av")
	float field4944;
	@ObfuscatedName("am")
	float field4946;
	@ObfuscatedName("aa")
	float field4939;
	@ObfuscatedName("ap")
	float field4947;
	@ObfuscatedName("ax")
	float field4949;
	@ObfuscatedName("aw")
	float field4938;

	static {
		new class445();
	}

	public class445() {
		this.method8503();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2128212302"
	)
	void method8503() {
		this.field4938 = 0.0F;
		this.field4949 = 0.0F;
		this.field4947 = 0.0F;
		this.field4946 = 0.0F;
		this.field4944 = 0.0F;
		this.field4943 = 0.0F;
		this.field4945 = 0.0F;
		this.field4940 = 0.0F;
		this.field4948 = 0.0F;
		this.field4939 = 1.0F;
		this.field4942 = 1.0F;
		this.field4941 = 1.0F;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "26"
	)
	public void method8502(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4948;
		float var5 = this.field4942;
		float var6 = this.field4946;
		float var7 = this.field4949;
		this.field4948 = var4 * var2 - var3 * this.field4940;
		this.field4940 = this.field4940 * var2 + var4 * var3;
		this.field4942 = var2 * var5 - this.field4943 * var3;
		this.field4943 = var2 * this.field4943 + var5 * var3;
		this.field4946 = var2 * var6 - var3 * this.field4939;
		this.field4939 = var6 * var3 + var2 * this.field4939;
		this.field4949 = var7 * var2 - this.field4938 * var3;
		this.field4938 = var7 * var3 + this.field4938 * var2;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-1184624325"
	)
	public void method8505(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4941;
		float var5 = this.field4945;
		float var6 = this.field4944;
		float var7 = this.field4947;
		this.field4941 = this.field4940 * var3 + var2 * var4;
		this.field4940 = this.field4940 * var2 - var3 * var4;
		this.field4945 = var2 * var5 + this.field4943 * var3;
		this.field4943 = this.field4943 * var2 - var3 * var5;
		this.field4944 = var3 * this.field4939 + var6 * var2;
		this.field4939 = var2 * this.field4939 - var6 * var3;
		this.field4947 = var2 * var7 + var3 * this.field4938;
		this.field4938 = this.field4938 * var2 - var3 * var7;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "1011718174"
	)
	void method8511(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4941;
		float var5 = this.field4945;
		float var6 = this.field4944;
		float var7 = this.field4947;
		this.field4941 = var4 * var2 - var3 * this.field4948;
		this.field4948 = var2 * this.field4948 + var3 * var4;
		this.field4945 = var5 * var2 - this.field4942 * var3;
		this.field4942 = var3 * var5 + this.field4942 * var2;
		this.field4944 = var6 * var2 - this.field4946 * var3;
		this.field4946 = var3 * var6 + this.field4946 * var2;
		this.field4947 = var7 * var2 - var3 * this.field4949;
		this.field4949 = this.field4949 * var2 + var3 * var7;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(FFFB)V",
		garbageValue = "41"
	)
	public void method8512(float var1, float var2, float var3) {
		this.field4947 += var1;
		this.field4949 += var2;
		this.field4938 += var3;
	}

	public String toString() {
		return this.field4941 + "," + this.field4945 + "," + this.field4944 + "," + this.field4947 + "\n" + this.field4948 + "," + this.field4942 + "," + this.field4946 + "," + this.field4949 + "\n" + this.field4940 + "," + this.field4943 + "," + this.field4939 + "," + this.field4938;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lfm;FI)F",
		garbageValue = "1455992266"
	)
	static float method8520(class135 var0, float var1) {
		if (var0 != null && var0.method3320() != 0) {
			if (var1 < (float)var0.field1598[0].field1537) {
				return var0.field1586 == class133.field1564 ? var0.field1598[0].field1534 : FadeOutTask.method8909(var0, var1, true);
			} else if (var1 > (float)var0.field1598[var0.method3320() - 1].field1537) {
				return var0.field1587 == class133.field1564 ? var0.field1598[var0.method3320() - 1].field1534 : FadeOutTask.method8909(var0, var1, false);
			} else if (var0.field1585) {
				return var0.field1598[0].field1534;
			} else {
				class130 var2 = var0.method3326(var1);
				boolean var3 = false;
				boolean var4 = false;
				if (var2 == null) {
					return 0.0F;
				} else {
					float var5;
					float var6;
					float var7;
					if (var2.field1538 == 0.0F && var2.field1536 == 0.0F) {
						var3 = true;
					} else if (var2.field1538 == Float.MAX_VALUE && Float.MAX_VALUE == var2.field1536) {
						var4 = true;
					} else if (var2.field1539 != null) {
						if (var0.field1600) {
							var5 = (float)var2.field1537;
							float var9 = var2.field1534;
							var6 = var2.field1538 * 0.33333334F + var5;
							float var10 = var2.field1536 * 0.33333334F + var9;
							float var8 = (float)var2.field1539.field1537;
							float var12 = var2.field1539.field1534;
							var7 = var8 - 0.33333334F * var2.field1539.field1535;
							float var11 = var12 - var2.field1539.field1541 * 0.33333334F;
							float var15;
							float var16;
							float var17;
							float var18;
							float var19;
							if (var0.field1589) {
								var15 = var10;
								var16 = var11;
								if (var0 != null) {
									var17 = var8 - var5;
									if (0.0F != var17) {
										var18 = var6 - var5;
										var19 = var7 - var5;
										float[] var29 = new float[]{var18 / var17, var19 / var17};
										var0.field1597 = var29[0] == 0.33333334F && var29[1] == 0.6666667F;
										float var21 = var29[0];
										float var22 = var29[1];
										if (var29[0] < 0.0F) {
											var29[0] = 0.0F;
										}

										if (var29[1] > 1.0F) {
											var29[1] = 1.0F;
										}

										float var23;
										float var24;
										float var25;
										float var26;
										float var27;
										if (var29[0] > 1.0F || var29[1] < -1.0F) {
											var29[1] = 1.0F - var29[1];
											if (var29[0] < 0.0F) {
												var29[0] = 0.0F;
											}

											if (var29[1] < 0.0F) {
												var29[1] = 0.0F;
											}

											if (var29[0] > 1.0F || var29[1] > 1.0F) {
												var23 = 1.0F + var29[1] * (var29[1] - 2.0F) + (var29[0] - 2.0F + var29[1]) * var29[0];
												if (var23 + class131.field1545 > 0.0F) {
													if (class131.field1545 + var29[0] < 1.3333334F) {
														var24 = var29[0] - 2.0F;
														var25 = var29[0] - 1.0F;
														var26 = (float)Math.sqrt((double)(var24 * var24 - 4.0F * var25 * var25));
														var27 = 0.5F * (var26 + -var24);
														if (class131.field1545 + var29[1] > var27) {
															var29[1] = var27 - class131.field1545;
														} else {
															var27 = 0.5F * (-var24 - var26);
															if (var29[1] < class131.field1545 + var27) {
																var29[1] = var27 + class131.field1545;
															}
														}
													} else {
														var29[0] = 1.3333334F - class131.field1545;
														var29[1] = 0.33333334F - class131.field1545;
													}
												}
											}

											var29[1] = 1.0F - var29[1];
										}

										float var10000;
										if (var29[0] != var21) {
											var10000 = var5 + var29[0] * var17;
											if (0.0F != var21) {
												var15 = var29[0] * (var10 - var9) / var21 + var9;
											}
										}

										if (var29[1] != var22) {
											var10000 = var5 + var17 * var29[1];
											if (var22 != 1.0F) {
												var16 = var12 - (var12 - var11) * (1.0F - var29[1]) / (1.0F - var22);
											}
										}

										var0.field1590 = var5;
										var0.field1591 = var8;
										var23 = var29[0];
										var24 = var29[1];
										var25 = var23 - 0.0F;
										var26 = var24 - var23;
										var27 = 1.0F - var24;
										float var28 = var26 - var25;
										var0.field1595 = var27 - var26 - var28;
										var0.field1594 = var28 + var28 + var28;
										var0.field1604 = var25 + var25 + var25;
										var0.field1584 = 0.0F;
										var25 = var15 - var9;
										var26 = var16 - var15;
										var27 = var12 - var16;
										var28 = var26 - var25;
										var0.field1599 = var27 - var26 - var28;
										var0.field1593 = var28 + var28 + var28;
										var0.field1605 = var25 + var25 + var25;
										var0.field1592 = var9;
									}
								}
							} else if (var0 != null) {
								var0.field1590 = var5;
								float var13 = var8 - var5;
								float var14 = var12 - var9;
								var15 = var6 - var5;
								var16 = 0.0F;
								var17 = 0.0F;
								if (0.0F != var15) {
									var16 = (var10 - var9) / var15;
								}

								var15 = var8 - var7;
								if (0.0F != var15) {
									var17 = (var12 - var11) / var15;
								}

								var18 = 1.0F / (var13 * var13);
								var19 = var13 * var16;
								float var20 = var13 * var17;
								var0.field1584 = var18 * (var20 + var19 - var14 - var14) / var13;
								var0.field1604 = (var14 + var14 + var14 - var19 - var19 - var20) * var18;
								var0.field1594 = var16;
								var0.field1595 = var9;
							}

							var0.field1600 = false;
						}
					} else {
						var3 = true;
					}

					if (var3) {
						return var2.field1534;
					} else if (var4) {
						return var1 != (float)var2.field1537 && var2.field1539 != null ? var2.field1539.field1534 : var2.field1534;
					} else if (var0.field1589) {
						if (var0 == null) {
							var5 = 0.0F;
						} else {
							if (var0.field1590 == var1) {
								var6 = 0.0F;
							} else if (var0.field1591 == var1) {
								var6 = 1.0F;
							} else {
								var6 = (var1 - var0.field1590) / (var0.field1591 - var0.field1590);
							}

							if (var0.field1597) {
								var7 = var6;
							} else {
								float[] var30 = new float[]{var0.field1584 - var6, var0.field1604, var0.field1594, var0.field1595};
								float[] var31 = new float[5];
								int var32 = class132.method3294(var30, 3, 0.0F, true, 1.0F, true, var31);
								if (var32 == 1) {
									var7 = var31[0];
								} else {
									var7 = 0.0F;
								}
							}

							var5 = (var0.field1605 + var7 * (var0.field1593 + var7 * var0.field1599)) * var7 + var0.field1592;
						}

						return var5;
					} else {
						return MenuAction.method2256(var0, var1);
					}
				}
			}
		} else {
			return 0.0F;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Lhf;",
		garbageValue = "-1952936813"
	)
	@Export("getFrames")
	static Frames getFrames(int var0) {
		Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			AbstractArchive var3 = SequenceDefinition.SequenceDefinition_animationsArchive;
			AbstractArchive var4 = class149.SpotAnimationDefinition_archive;
			boolean var5 = true;
			int var6 = -1;
			int[] var7 = var3.getGroupFileIds(var0);

			for (int var8 = 0; var8 < var7.length; ++var8) {
				byte[] var9 = var3.getFile(var0, var7[var8]);
				if (var9 == null) {
					var5 = false;
				} else if (var6 == -1) {
					var6 = (var9[0] & 255) << 8 | var9[1] & 255;
				}
			}

			if (var6 != -1) {
				byte[] var10 = var4.getFile(var6, 0);
				if (var10 == null) {
					var5 = false;
				}
			} else {
				var5 = false;
			}

			Frames var2;
			if (!var5) {
				var2 = null;
			} else {
				try {
					var2 = new Frames(var3, var4, var0);
				} catch (Exception var11) {
					var2 = null;
				}
			}

			if (var2 != null) {
				SequenceDefinition.SequenceDefinition_cachedFrames.put(var2, (long)var0);
			}

			return var2;
		}
	}
}
