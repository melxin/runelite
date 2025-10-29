import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kq")
public class class272 extends AbstractRasterizer {
	@ObfuscatedSignature(
		descriptor = "(Lkt;)V"
	)
	class272(Clips var1) {
		super(var1);
	}

	@ObfuscatedName("aj")
	boolean vmethod6185() {
		return true;
	}

	@ObfuscatedName("ay")
	@Export("drawAlphaBlendedGraphics")
	void drawAlphaBlendedGraphics(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12) {
		float var13 = (float)((int)(var4 + 0.5F));
		float var14 = (float)((int)(var5 + 0.5F));
		float var15 = (float)((int)(var6 + 0.5F));
		float var16 = (float)((int)(var1 + 0.5F));
		float var17 = (float)((int)(var2 + 0.5F));
		float var18 = (float)((int)(var3 + 0.5F));
		float var19 = var14 - var13;
		float var20 = var17 - var16;
		float var21 = var15 - var13;
		float var22 = var18 - var16;
		float var23 = var19 * var22 - var21 * var20;
		if (var23 != 0.0F) {
			float var24 = (float)var10;
			float var25 = (float)var11;
			float var26 = (float)var12;
			float var27 = var25 - var24;
			float var28 = var26 - var24;
			float var29 = (var27 * var22 - var28 * var20) / var23;
			float var30 = (var28 * var19 - var27 * var21) / var23;
			float var31 = var5 - var4;
			float var32 = var2 - var1;
			float var33 = var6 - var4;
			float var34 = var3 - var1;
			float var35 = var31 * var34 - var33 * var32;
			if (var35 != 0.0F) {
				float var36 = var8 - var7;
				float var37 = var9 - var7;
				float var38 = (var36 * var34 - var37 * var32) / var35;
				float var39 = (var37 * var31 - var36 * var33) / var35;
				float var40;
				if (var18 != var17) {
					var40 = (var15 - var14) / (var18 - var17);
				} else {
					var40 = 0.0F;
				}

				float var41;
				if (var17 != var16) {
					var41 = var19 / var20;
				} else {
					var41 = 0.0F;
				}

				float var42;
				if (var18 != var16) {
					var42 = var21 / var22;
				} else {
					var42 = 0.0F;
				}

				int[] var43 = super.field2828.Rasterizer3D_rowOffsets;
				int var44 = super.field2828.clipY;
				int var45;
				if (var16 <= var17 && var16 <= var18) {
					if (var16 < (float)var44) {
						if (var17 > (float)var44) {
							var17 = (float)var44;
						}

						if (var18 > (float)var44) {
							var18 = (float)var44;
						}

						var24 = var24 - var29 * var13 + var29;
						var7 = this.method6228(var4, var1, var7, var38, var39);
						if (var17 < var18) {
							var15 = var13;
							if (var16 < 0.0F) {
								var15 = var13 - var42 * var16;
								var13 -= var41 * var16;
								var24 -= var30 * var16;
								var16 = 0.0F;
							}

							if (var17 < 0.0F) {
								var14 -= var40 * var17;
								var17 = 0.0F;
							}

							if (var16 != var17 && var42 < var41 || var16 == var17 && var42 > var40) {
								var16 = (float)((int)(var16 + 0.5F));
								var17 = (float)((int)(var17 + 0.5F));
								var18 = (float)((int)(var18 + 0.5F)) - var17;
								var17 -= var16;

								for (var45 = var43[(int)var16]; --var17 >= 0.0F; var7 += var39) {
									this.method6188(Rasterizer2D.Rasterizer2D_pixels, var45, 0, 0, (int)var15, (int)var13, var24, var29, var7, var38);
									var15 += var42;
									var13 += var41;
									var24 += var30;
									var45 += Rasterizer2D.Rasterizer2D_width;
								}

								while (--var18 >= 0.0F) {
									this.method6188(Rasterizer2D.Rasterizer2D_pixels, var45, 0, 0, (int)var15, (int)var14, var24, var29, var7, var38);
									var15 += var42;
									var14 += var40;
									var24 += var30;
									var45 += Rasterizer2D.Rasterizer2D_width;
									var7 += var39;
								}

							} else {
								var16 = (float)((int)(var16 + 0.5F));
								var17 = (float)((int)(var17 + 0.5F));
								var18 = (float)((int)(var18 + 0.5F)) - var17;
								var17 -= var16;

								for (var45 = var43[(int)var16]; --var17 >= 0.0F; var7 += var39) {
									this.method6188(Rasterizer2D.Rasterizer2D_pixels, var45, 0, 0, (int)var13, (int)var15, var24, var29, var7, var38);
									var15 += var42;
									var13 += var41;
									var24 += var30;
									var45 += Rasterizer2D.Rasterizer2D_width;
								}

								while (--var18 >= 0.0F) {
									this.method6188(Rasterizer2D.Rasterizer2D_pixels, var45, 0, 0, (int)var14, (int)var15, var24, var29, var7, var38);
									var15 += var42;
									var14 += var40;
									var24 += var30;
									var45 += Rasterizer2D.Rasterizer2D_width;
									var7 += var39;
								}

							}
						} else {
							var14 = var13;
							if (var16 < 0.0F) {
								var14 = var13 - var42 * var16;
								var13 -= var41 * var16;
								var24 -= var30 * var16;
								var16 = 0.0F;
							}

							if (var18 < 0.0F) {
								var15 -= var40 * var18;
								var18 = 0.0F;
							}

							if (var16 != var18 && var42 < var41 || var16 == var18 && var40 > var41) {
								var16 = (float)((int)(var16 + 0.5F));
								var18 = (float)((int)(var18 + 0.5F));
								var17 = (float)((int)(var17 + 0.5F)) - var18;
								var18 -= var16;

								for (var45 = var43[(int)var16]; --var18 >= 0.0F; var7 += var39) {
									this.method6188(Rasterizer2D.Rasterizer2D_pixels, var45, 0, 0, (int)var14, (int)var13, var24, var29, var7, var38);
									var14 += var42;
									var13 += var41;
									var24 += var30;
									var45 += Rasterizer2D.Rasterizer2D_width;
								}

								while (--var17 >= 0.0F) {
									this.method6188(Rasterizer2D.Rasterizer2D_pixels, var45, 0, 0, (int)var15, (int)var13, var24, var29, var7, var38);
									var15 += var40;
									var13 += var41;
									var24 += var30;
									var45 += Rasterizer2D.Rasterizer2D_width;
									var7 += var39;
								}

							} else {
								var16 = (float)((int)(var16 + 0.5F));
								var18 = (float)((int)(var18 + 0.5F));
								var17 = (float)((int)(var17 + 0.5F)) - var18;
								var18 -= var16;

								for (var45 = var43[(int)var16]; --var18 >= 0.0F; var7 += var39) {
									this.method6188(Rasterizer2D.Rasterizer2D_pixels, var45, 0, 0, (int)var13, (int)var14, var24, var29, var7, var38);
									var14 += var42;
									var13 += var41;
									var24 += var30;
									var45 += Rasterizer2D.Rasterizer2D_width;
								}

								while (--var17 >= 0.0F) {
									this.method6188(Rasterizer2D.Rasterizer2D_pixels, var45, 0, 0, (int)var13, (int)var15, var24, var29, var7, var38);
									var15 += var40;
									var13 += var41;
									var24 += var30;
									var45 += Rasterizer2D.Rasterizer2D_width;
									var7 += var39;
								}

							}
						}
					}
				} else if (var17 <= var18) {
					if (var17 < (float)var44) {
						if (var18 > (float)var44) {
							var18 = (float)var44;
						}

						if (var16 > (float)var44) {
							var16 = (float)var44;
						}

						var25 = var25 - var29 * var14 + var29;
						var8 = this.method6228(var5, var2, var8, var38, var39);
						if (var18 < var16) {
							var13 = var14;
							if (var17 < 0.0F) {
								var13 = var14 - var41 * var17;
								var14 -= var40 * var17;
								var25 -= var30 * var17;
								var17 = 0.0F;
							}

							if (var18 < 0.0F) {
								var15 -= var42 * var18;
								var18 = 0.0F;
							}

							if (var17 != var18 && var41 < var40 || var17 == var18 && var41 > var42) {
								var17 = (float)((int)(var17 + 0.5F));
								var18 = (float)((int)(var18 + 0.5F));
								var16 = (float)((int)(var16 + 0.5F)) - var18;
								var18 -= var17;

								for (var45 = var43[(int)var17]; --var18 >= 0.0F; var8 += var39) {
									this.method6188(Rasterizer2D.Rasterizer2D_pixels, var45, 0, 0, (int)var13, (int)var14, var25, var29, var8, var38);
									var13 += var41;
									var14 += var40;
									var25 += var30;
									var45 += Rasterizer2D.Rasterizer2D_width;
								}

								while (--var16 >= 0.0F) {
									this.method6188(Rasterizer2D.Rasterizer2D_pixels, var45, 0, 0, (int)var13, (int)var15, var25, var29, var8, var38);
									var13 += var41;
									var15 += var42;
									var25 += var30;
									var45 += Rasterizer2D.Rasterizer2D_width;
									var8 += var39;
								}

							} else {
								var17 = (float)((int)(var17 + 0.5F));
								var18 = (float)((int)(var18 + 0.5F));
								var16 = (float)((int)(var16 + 0.5F)) - var18;
								var18 -= var17;

								for (var45 = var43[(int)var17]; --var18 >= 0.0F; var8 += var39) {
									this.method6188(Rasterizer2D.Rasterizer2D_pixels, var45, 0, 0, (int)var14, (int)var13, var25, var29, var8, var38);
									var13 += var41;
									var14 += var40;
									var25 += var30;
									var45 += Rasterizer2D.Rasterizer2D_width;
								}

								while (--var16 >= 0.0F) {
									this.method6188(Rasterizer2D.Rasterizer2D_pixels, var45, 0, 0, (int)var15, (int)var13, var25, var29, var8, var38);
									var13 += var41;
									var15 += var42;
									var25 += var30;
									var45 += Rasterizer2D.Rasterizer2D_width;
									var8 += var39;
								}

							}
						} else {
							var15 = var14;
							if (var17 < 0.0F) {
								var15 = var14 - var41 * var17;
								var14 -= var40 * var17;
								var25 -= var30 * var17;
								var17 = 0.0F;
							}

							if (var16 < 0.0F) {
								var13 -= var42 * var16;
								var16 = 0.0F;
							}

							var17 = (float)((int)(var17 + 0.5F));
							var16 = (float)((int)(var16 + 0.5F));
							var18 = (float)((int)(var18 + 0.5F)) - var16;
							var16 -= var17;
							var45 = var43[(int)var17];
							if (var41 < var40) {
								while (--var16 >= 0.0F) {
									this.method6188(Rasterizer2D.Rasterizer2D_pixels, var45, 0, 0, (int)var15, (int)var14, var25, var29, var8, var38);
									var15 += var41;
									var14 += var40;
									var25 += var30;
									var45 += Rasterizer2D.Rasterizer2D_width;
									var8 += var39;
								}

								while (--var18 >= 0.0F) {
									this.method6188(Rasterizer2D.Rasterizer2D_pixels, var45, 0, 0, (int)var13, (int)var14, var25, var29, var8, var38);
									var13 += var42;
									var14 += var40;
									var25 += var30;
									var45 += Rasterizer2D.Rasterizer2D_width;
									var8 += var39;
								}

							} else {
								while (--var16 >= 0.0F) {
									this.method6188(Rasterizer2D.Rasterizer2D_pixels, var45, 0, 0, (int)var14, (int)var15, var25, var29, var8, var38);
									var15 += var41;
									var14 += var40;
									var25 += var30;
									var45 += Rasterizer2D.Rasterizer2D_width;
									var8 += var39;
								}

								while (--var18 >= 0.0F) {
									this.method6188(Rasterizer2D.Rasterizer2D_pixels, var45, 0, 0, (int)var14, (int)var13, var25, var29, var8, var38);
									var13 += var42;
									var14 += var40;
									var25 += var30;
									var45 += Rasterizer2D.Rasterizer2D_width;
									var8 += var39;
								}

							}
						}
					}
				} else if (var18 < (float)var44) {
					if (var16 > (float)var44) {
						var16 = (float)var44;
					}

					if (var17 > (float)var44) {
						var17 = (float)var44;
					}

					var26 = var26 - var29 * var15 + var29;
					var9 = this.method6228(var6, var3, var9, var38, var39);
					if (var16 < var17) {
						var14 = var15;
						if (var18 < 0.0F) {
							var14 = var15 - var40 * var18;
							var15 -= var42 * var18;
							var26 -= var30 * var18;
							var18 = 0.0F;
						}

						if (var16 < 0.0F) {
							var13 -= var41 * var16;
							var16 = 0.0F;
						}

						var18 = (float)((int)(var18 + 0.5F));
						var16 = (float)((int)(var16 + 0.5F));
						var17 = (float)((int)(var17 + 0.5F)) - var16;
						var16 -= var18;
						var45 = var43[(int)var18];
						if (var40 < var42) {
							while (--var16 >= 0.0F) {
								this.method6188(Rasterizer2D.Rasterizer2D_pixels, var45, 0, 0, (int)var14, (int)var15, var26, var29, var9, var38);
								var14 += var40;
								var15 += var42;
								var26 += var30;
								var45 += Rasterizer2D.Rasterizer2D_width;
								var9 += var39;
							}

							while (--var17 >= 0.0F) {
								this.method6188(Rasterizer2D.Rasterizer2D_pixels, var45, 0, 0, (int)var14, (int)var13, var26, var29, var9, var38);
								var14 += var40;
								var13 += var41;
								var26 += var30;
								var45 += Rasterizer2D.Rasterizer2D_width;
								var9 += var39;
							}

						} else {
							while (--var16 >= 0.0F) {
								this.method6188(Rasterizer2D.Rasterizer2D_pixels, var45, 0, 0, (int)var15, (int)var14, var26, var29, var9, var38);
								var14 += var40;
								var15 += var42;
								var26 += var30;
								var45 += Rasterizer2D.Rasterizer2D_width;
								var9 += var39;
							}

							while (--var17 >= 0.0F) {
								this.method6188(Rasterizer2D.Rasterizer2D_pixels, var45, 0, 0, (int)var13, (int)var14, var26, var29, var9, var38);
								var14 += var40;
								var13 += var41;
								var26 += var30;
								var45 += Rasterizer2D.Rasterizer2D_width;
								var9 += var39;
							}

						}
					} else {
						var13 = var15;
						if (var18 < 0.0F) {
							var13 = var15 - var40 * var18;
							var15 -= var42 * var18;
							var26 -= var30 * var18;
							var18 = 0.0F;
						}

						if (var17 < 0.0F) {
							var14 -= var41 * var17;
							var17 = 0.0F;
						}

						var18 = (float)((int)(var18 + 0.5F));
						var17 = (float)((int)(var17 + 0.5F));
						var16 = (float)((int)(var16 + 0.5F)) - var17;
						var17 -= var18;
						var45 = var43[(int)var18];
						if (var40 < var42) {
							while (--var17 >= 0.0F) {
								this.method6188(Rasterizer2D.Rasterizer2D_pixels, var45, 0, 0, (int)var13, (int)var15, var26, var29, var9, var38);
								var13 += var40;
								var15 += var42;
								var26 += var30;
								var45 += Rasterizer2D.Rasterizer2D_width;
								var9 += var39;
							}

							while (--var16 >= 0.0F) {
								this.method6188(Rasterizer2D.Rasterizer2D_pixels, var45, 0, 0, (int)var14, (int)var15, var26, var29, var9, var38);
								var14 += var41;
								var15 += var42;
								var26 += var30;
								var45 += Rasterizer2D.Rasterizer2D_width;
								var9 += var39;
							}

						} else {
							while (--var17 >= 0.0F) {
								this.method6188(Rasterizer2D.Rasterizer2D_pixels, var45, 0, 0, (int)var15, (int)var13, var26, var29, var9, var38);
								var13 += var40;
								var15 += var42;
								var26 += var30;
								var45 += Rasterizer2D.Rasterizer2D_width;
								var9 += var39;
							}

							while (--var16 >= 0.0F) {
								this.method6188(Rasterizer2D.Rasterizer2D_pixels, var45, 0, 0, (int)var15, (int)var14, var26, var29, var9, var38);
								var14 += var41;
								var15 += var42;
								var26 += var30;
								var45 += Rasterizer2D.Rasterizer2D_width;
								var9 += var39;
							}

						}
					}
				}
			}
		}
	}

	@ObfuscatedName("au")
	void vmethod6189(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10) {
		float var11 = (float)((int)(var4 + 0.5F));
		float var12 = (float)((int)(var5 + 0.5F));
		float var13 = (float)((int)(var6 + 0.5F));
		float var14 = (float)((int)(var1 + 0.5F));
		float var15 = (float)((int)(var2 + 0.5F));
		float var16 = (float)((int)(var3 + 0.5F));
		float var17 = var12 - var11;
		float var18 = var15 - var14;
		float var19 = var13 - var11;
		float var20 = var16 - var14;
		float var21 = var5 - var4;
		float var22 = var2 - var1;
		float var23 = var6 - var4;
		float var24 = var3 - var1;
		float var25 = var21 * var24 - var23 * var22;
		if (var25 != 0.0F) {
			float var26 = var8 - var7;
			float var27 = var9 - var7;
			float var28 = (var26 * var24 - var27 * var22) / var25;
			float var29 = (var27 * var21 - var26 * var23) / var25;
			float var30;
			if (var16 != var15) {
				var30 = (var13 - var12) / (var16 - var15);
			} else {
				var30 = 0.0F;
			}

			float var31;
			if (var15 != var14) {
				var31 = var17 / var18;
			} else {
				var31 = 0.0F;
			}

			float var32;
			if (var16 != var14) {
				var32 = var19 / var20;
			} else {
				var32 = 0.0F;
			}

			int[] var33 = super.field2828.Rasterizer3D_rowOffsets;
			int var34 = super.field2828.clipY;
			int var35;
			if (var14 <= var15 && var14 <= var16) {
				if (var14 < (float)var34) {
					if (var15 > (float)var34) {
						var15 = (float)var34;
					}

					if (var16 > (float)var34) {
						var16 = (float)var34;
					}

					var7 = this.method6228(var4, var1, var7, var28, var29);
					if (var15 < var16) {
						var13 = var11;
						if (var14 < 0.0F) {
							var13 = var11 - var32 * var14;
							var11 -= var31 * var14;
							var14 = 0.0F;
						}

						if (var15 < 0.0F) {
							var12 -= var30 * var15;
							var15 = 0.0F;
						}

						if ((var14 == var15 || var32 >= var31) && (var14 != var15 || var32 <= var30)) {
							var14 = (float)((int)(var14 + 0.5F));
							var15 = (float)((int)(var15 + 0.5F));
							var16 = (float)((int)(var16 + 0.5F)) - var15;
							var15 -= var14;

							for (var35 = var33[(int)var14]; --var15 >= 0.0F; var7 += var29) {
								this.copyPixelsWithAlphaBlending(Rasterizer2D.Rasterizer2D_pixels, var35, var10, 0, (int)var11, (int)var13, var7, var28);
								var13 += var32;
								var11 += var31;
								var35 += Rasterizer2D.Rasterizer2D_width;
							}

							while (--var16 >= 0.0F) {
								this.copyPixelsWithAlphaBlending(Rasterizer2D.Rasterizer2D_pixels, var35, var10, 0, (int)var12, (int)var13, var7, var28);
								var13 += var32;
								var12 += var30;
								var35 += Rasterizer2D.Rasterizer2D_width;
								var7 += var29;
							}

						} else {
							var14 = (float)((int)(var14 + 0.5F));
							var15 = (float)((int)(var15 + 0.5F));
							var16 = (float)((int)(var16 + 0.5F)) - var15;
							var15 -= var14;

							for (var35 = var33[(int)var14]; --var15 >= 0.0F; var7 += var29) {
								this.copyPixelsWithAlphaBlending(Rasterizer2D.Rasterizer2D_pixels, var35, var10, 0, (int)var13, (int)var11, var7, var28);
								var13 += var32;
								var11 += var31;
								var35 += Rasterizer2D.Rasterizer2D_width;
							}

							while (--var16 >= 0.0F) {
								this.copyPixelsWithAlphaBlending(Rasterizer2D.Rasterizer2D_pixels, var35, var10, 0, (int)var13, (int)var12, var7, var28);
								var13 += var32;
								var12 += var30;
								var35 += Rasterizer2D.Rasterizer2D_width;
								var7 += var29;
							}

						}
					} else {
						var12 = var11;
						if (var14 < 0.0F) {
							var12 = var11 - var32 * var14;
							var11 -= var31 * var14;
							var14 = 0.0F;
						}

						if (var16 < 0.0F) {
							var13 -= var30 * var16;
							var16 = 0.0F;
						}

						if (var14 != var16 && var32 < var31 || var14 == var16 && var30 > var31) {
							var14 = (float)((int)(var14 + 0.5F));
							var16 = (float)((int)(var16 + 0.5F));
							var15 = (float)((int)(var15 + 0.5F)) - var16;
							var16 -= var14;

							for (var35 = var33[(int)var14]; --var16 >= 0.0F; var7 += var29) {
								this.copyPixelsWithAlphaBlending(Rasterizer2D.Rasterizer2D_pixels, var35, var10, 0, (int)var12, (int)var11, var7, var28);
								var12 += var32;
								var11 += var31;
								var35 += Rasterizer2D.Rasterizer2D_width;
							}

							while (--var15 >= 0.0F) {
								this.copyPixelsWithAlphaBlending(Rasterizer2D.Rasterizer2D_pixels, var35, var10, 0, (int)var13, (int)var11, var7, var28);
								var13 += var30;
								var11 += var31;
								var35 += Rasterizer2D.Rasterizer2D_width;
								var7 += var29;
							}

						} else {
							var14 = (float)((int)(var14 + 0.5F));
							var16 = (float)((int)(var16 + 0.5F));
							var15 = (float)((int)(var15 + 0.5F)) - var16;
							var16 -= var14;

							for (var35 = var33[(int)var14]; --var16 >= 0.0F; var7 += var29) {
								this.copyPixelsWithAlphaBlending(Rasterizer2D.Rasterizer2D_pixels, var35, var10, 0, (int)var11, (int)var12, var7, var28);
								var12 += var32;
								var11 += var31;
								var35 += Rasterizer2D.Rasterizer2D_width;
							}

							while (--var15 >= 0.0F) {
								this.copyPixelsWithAlphaBlending(Rasterizer2D.Rasterizer2D_pixels, var35, var10, 0, (int)var11, (int)var13, var7, var28);
								var13 += var30;
								var11 += var31;
								var35 += Rasterizer2D.Rasterizer2D_width;
								var7 += var29;
							}

						}
					}
				}
			} else if (var15 <= var16) {
				if (var15 < (float)var34) {
					if (var16 > (float)var34) {
						var16 = (float)var34;
					}

					if (var14 > (float)var34) {
						var14 = (float)var34;
					}

					var8 = this.method6228(var5, var2, var8, var28, var29);
					if (var16 < var14) {
						var11 = var12;
						if (var15 < 0.0F) {
							var11 = var12 - var31 * var15;
							var12 -= var30 * var15;
							var15 = 0.0F;
						}

						if (var16 < 0.0F) {
							var13 -= var32 * var16;
							var16 = 0.0F;
						}

						if ((var15 == var16 || var31 >= var30) && (var15 != var16 || var31 <= var32)) {
							var15 = (float)((int)(var15 + 0.5F));
							var16 = (float)((int)(var16 + 0.5F));
							var14 = (float)((int)(var14 + 0.5F)) - var16;
							var16 -= var15;

							for (var35 = var33[(int)var15]; --var16 >= 0.0F; var8 += var29) {
								this.copyPixelsWithAlphaBlending(Rasterizer2D.Rasterizer2D_pixels, var35, var10, 0, (int)var12, (int)var11, var8, var28);
								var11 += var31;
								var12 += var30;
								var35 += Rasterizer2D.Rasterizer2D_width;
							}

							while (--var14 >= 0.0F) {
								this.copyPixelsWithAlphaBlending(Rasterizer2D.Rasterizer2D_pixels, var35, var10, 0, (int)var13, (int)var11, var8, var28);
								var11 += var31;
								var13 += var32;
								var35 += Rasterizer2D.Rasterizer2D_width;
								var8 += var29;
							}

						} else {
							var15 = (float)((int)(var15 + 0.5F));
							var16 = (float)((int)(var16 + 0.5F));
							var14 = (float)((int)(var14 + 0.5F)) - var16;
							var16 -= var15;

							for (var35 = var33[(int)var15]; --var16 >= 0.0F; var8 += var29) {
								this.copyPixelsWithAlphaBlending(Rasterizer2D.Rasterizer2D_pixels, var35, var10, 0, (int)var11, (int)var12, var8, var28);
								var11 += var31;
								var12 += var30;
								var35 += Rasterizer2D.Rasterizer2D_width;
							}

							while (--var14 >= 0.0F) {
								this.copyPixelsWithAlphaBlending(Rasterizer2D.Rasterizer2D_pixels, var35, var10, 0, (int)var11, (int)var13, var8, var28);
								var11 += var31;
								var13 += var32;
								var35 += Rasterizer2D.Rasterizer2D_width;
								var8 += var29;
							}

						}
					} else {
						var13 = var12;
						if (var15 < 0.0F) {
							var13 = var12 - var31 * var15;
							var12 -= var30 * var15;
							var15 = 0.0F;
						}

						if (var14 < 0.0F) {
							var11 -= var32 * var14;
							var14 = 0.0F;
						}

						var15 = (float)((int)(var15 + 0.5F));
						var14 = (float)((int)(var14 + 0.5F));
						var16 = (float)((int)(var16 + 0.5F)) - var14;
						var14 -= var15;
						var35 = var33[(int)var15];
						if (var31 < var30) {
							while (--var14 >= 0.0F) {
								this.copyPixelsWithAlphaBlending(Rasterizer2D.Rasterizer2D_pixels, var35, var10, 0, (int)var13, (int)var12, var8, var28);
								var13 += var31;
								var12 += var30;
								var35 += Rasterizer2D.Rasterizer2D_width;
								var8 += var29;
							}

							while (--var16 >= 0.0F) {
								this.copyPixelsWithAlphaBlending(Rasterizer2D.Rasterizer2D_pixels, var35, var10, 0, (int)var11, (int)var12, var8, var28);
								var11 += var32;
								var12 += var30;
								var35 += Rasterizer2D.Rasterizer2D_width;
								var8 += var29;
							}

						} else {
							while (--var14 >= 0.0F) {
								this.copyPixelsWithAlphaBlending(Rasterizer2D.Rasterizer2D_pixels, var35, var10, 0, (int)var12, (int)var13, var8, var28);
								var13 += var31;
								var12 += var30;
								var35 += Rasterizer2D.Rasterizer2D_width;
								var8 += var29;
							}

							while (--var16 >= 0.0F) {
								this.copyPixelsWithAlphaBlending(Rasterizer2D.Rasterizer2D_pixels, var35, var10, 0, (int)var12, (int)var11, var8, var28);
								var11 += var32;
								var12 += var30;
								var35 += Rasterizer2D.Rasterizer2D_width;
								var8 += var29;
							}

						}
					}
				}
			} else if (var16 < (float)var34) {
				if (var14 > (float)var34) {
					var14 = (float)var34;
				}

				if (var15 > (float)var34) {
					var15 = (float)var34;
				}

				var9 = this.method6228(var6, var3, var9, var28, var29);
				if (var14 < var15) {
					var12 = var13;
					if (var16 < 0.0F) {
						var12 = var13 - var30 * var16;
						var13 -= var32 * var16;
						var16 = 0.0F;
					}

					if (var14 < 0.0F) {
						var11 -= var31 * var14;
						var14 = 0.0F;
					}

					var16 = (float)((int)(var16 + 0.5F));
					var14 = (float)((int)(var14 + 0.5F));
					var15 = (float)((int)(var15 + 0.5F)) - var14;
					var14 -= var16;
					var35 = var33[(int)var16];
					if (var30 < var32) {
						while (--var14 >= 0.0F) {
							this.copyPixelsWithAlphaBlending(Rasterizer2D.Rasterizer2D_pixels, var35, var10, 0, (int)var12, (int)var13, var9, var28);
							var12 += var30;
							var13 += var32;
							var35 += Rasterizer2D.Rasterizer2D_width;
							var9 += var29;
						}

						while (--var15 >= 0.0F) {
							this.copyPixelsWithAlphaBlending(Rasterizer2D.Rasterizer2D_pixels, var35, var10, 0, (int)var12, (int)var11, var9, var28);
							var12 += var30;
							var11 += var31;
							var35 += Rasterizer2D.Rasterizer2D_width;
							var9 += var29;
						}

					} else {
						while (--var14 >= 0.0F) {
							this.copyPixelsWithAlphaBlending(Rasterizer2D.Rasterizer2D_pixels, var35, var10, 0, (int)var13, (int)var12, var9, var28);
							var12 += var30;
							var13 += var32;
							var35 += Rasterizer2D.Rasterizer2D_width;
							var9 += var29;
						}

						while (--var15 >= 0.0F) {
							this.copyPixelsWithAlphaBlending(Rasterizer2D.Rasterizer2D_pixels, var35, var10, 0, (int)var11, (int)var12, var9, var28);
							var12 += var30;
							var11 += var31;
							var35 += Rasterizer2D.Rasterizer2D_width;
							var9 += var29;
						}

					}
				} else {
					var11 = var13;
					if (var16 < 0.0F) {
						var11 = var13 - var30 * var16;
						var13 -= var32 * var16;
						var16 = 0.0F;
					}

					if (var15 < 0.0F) {
						var12 -= var31 * var15;
						var15 = 0.0F;
					}

					var16 = (float)((int)(var16 + 0.5F));
					var15 = (float)((int)(var15 + 0.5F));
					var14 = (float)((int)(var14 + 0.5F)) - var15;
					var15 -= var16;
					var35 = var33[(int)var16];
					if (var30 < var32) {
						while (--var15 >= 0.0F) {
							this.copyPixelsWithAlphaBlending(Rasterizer2D.Rasterizer2D_pixels, var35, var10, 0, (int)var11, (int)var13, var9, var28);
							var11 += var30;
							var13 += var32;
							var35 += Rasterizer2D.Rasterizer2D_width;
							var9 += var29;
						}

						while (--var14 >= 0.0F) {
							this.copyPixelsWithAlphaBlending(Rasterizer2D.Rasterizer2D_pixels, var35, var10, 0, (int)var12, (int)var13, var9, var28);
							var12 += var31;
							var13 += var32;
							var35 += Rasterizer2D.Rasterizer2D_width;
							var9 += var29;
						}

					} else {
						while (--var15 >= 0.0F) {
							this.copyPixelsWithAlphaBlending(Rasterizer2D.Rasterizer2D_pixels, var35, var10, 0, (int)var13, (int)var11, var9, var28);
							var11 += var30;
							var13 += var32;
							var35 += Rasterizer2D.Rasterizer2D_width;
							var9 += var29;
						}

						while (--var14 >= 0.0F) {
							this.copyPixelsWithAlphaBlending(Rasterizer2D.Rasterizer2D_pixels, var35, var10, 0, (int)var13, (int)var12, var9, var28);
							var12 += var31;
							var13 += var32;
							var35 += Rasterizer2D.Rasterizer2D_width;
							var9 += var29;
						}

					}
				}
			}
		}
	}

	@ObfuscatedName("az")
	@Export("drawGradientTriangle")
	void drawGradientTriangle(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22) {
		int[] var23 = super.field2828.Rasterizer3D_textureLoader.getTexturePixels(var22);
		if (var23 == null) {
			int var65 = super.field2828.Rasterizer3D_textureLoader.getAverageTextureRGB(var22);
			this.drawAlphaBlendedGraphics(var1, var2, var3, var4, var5, var6, var7, var8, var9, AbstractRasterizer.method5497(var65, var10), AbstractRasterizer.method5497(var65, var11), AbstractRasterizer.method5497(var65, var12));
		} else {
			super.field2826 = super.field2828.Rasterizer3D_textureLoader.isLowDetail(var22);
			float var24 = (float)((int)(var4 + 0.5F));
			float var25 = (float)((int)(var5 + 0.5F));
			float var26 = (float)((int)(var6 + 0.5F));
			float var27 = (float)((int)(var1 + 0.5F));
			float var28 = (float)((int)(var2 + 0.5F));
			float var29 = (float)((int)(var3 + 0.5F));
			float var30 = var25 - var24;
			float var31 = var28 - var27;
			float var32 = var26 - var24;
			float var33 = var29 - var27;
			float var34 = var30 * var33 - var32 * var31;
			if (var34 != 0.0F) {
				float var35 = (float)(var11 - var10);
				float var36 = (float)(var12 - var10);
				int var37 = (int)((var35 * var33 - var36 * var31) * 512.0F / var34);
				int var38 = (int)((var36 * var30 - var35 * var32) * 512.0F / var34);
				float var39 = var5 - var4;
				float var40 = var2 - var1;
				float var41 = var6 - var4;
				float var42 = var3 - var1;
				float var43 = var39 * var42 - var41 * var40;
				if (var43 != 0.0F) {
					float var44 = var8 - var7;
					float var45 = var9 - var7;
					float var46 = (var44 * var42 - var45 * var40) / var43;
					float var47 = (var45 * var39 - var44 * var41) / var43;
					float var48;
					if (var29 != var28) {
						var48 = (var26 - var25) / (var29 - var28);
					} else {
						var48 = 0.0F;
					}

					float var49;
					if (var28 != var27) {
						var49 = var30 / var31;
					} else {
						var49 = 0.0F;
					}

					float var50;
					if (var29 != var27) {
						var50 = var32 / var33;
					} else {
						var50 = 0.0F;
					}

					int var51 = super.field2828.zoom;
					var14 = var13 - var14;
					var17 = var16 - var17;
					var20 = var19 - var20;
					var15 -= var13;
					var18 -= var16;
					var21 -= var19;
					int var52 = var15 * var16 - var18 * var13 << 14;
					int var53 = (int)(((long)(var18 * var19 - var16 * var21) << 3 << 14) / (long)var51);
					int var54 = (int)(((long)(var13 * var21 - var19 * var15) << 14) / (long)var51);
					int var55 = var16 * var14 - var13 * var17 << 14;
					int var56 = (int)(((long)(var19 * var17 - var16 * var20) << 3 << 14) / (long)var51);
					int var57 = (int)(((long)(var13 * var20 - var19 * var14) << 14) / (long)var51);
					int var58 = var17 * var15 - var18 * var14 << 14;
					int var59 = (int)(((long)(var18 * var20 - var17 * var21) << 3 << 14) / (long)var51);
					int var60 = (int)(((long)(var21 * var14 - var15 * var20) << 14) / (long)var51);
					int[] var61 = super.field2828.Rasterizer3D_rowOffsets;
					int var62 = super.field2828.clipY;
					int var63;
					int var64;
					if (var27 <= var28 && var27 <= var29) {
						if (var27 < (float)var62) {
							if (var28 > (float)var62) {
								var28 = (float)var62;
							}

							if (var29 > (float)var62) {
								var29 = (float)var62;
							}

							var10 = var37 + ((var10 << 9) - var37 * (int)var24);
							var7 = this.method6228(var4, var1, var7, var46, var47);
							if (var28 < var29) {
								var26 = var24;
								if (var27 < 0.0F) {
									var26 = var24 - var50 * var27;
									var24 -= var49 * var27;
									var10 -= var38 * (int)var27;
									var27 = 0.0F;
								}

								if (var28 < 0.0F) {
									var25 -= var48 * var28;
									var28 = 0.0F;
								}

								var63 = (int)var27 - super.field2828.clipMidY;
								var52 += var54 * var63;
								var55 += var57 * var63;
								var58 += var60 * var63;
								if (var27 != var28 && var50 < var49 || var27 == var28 && var50 > var48) {
									var27 = (float)((int)(var27 + 0.5F));
									var28 = (float)((int)(var28 + 0.5F));
									var29 = (float)((int)(var29 + 0.5F)) - var28;
									var28 -= var27;

									for (var64 = var61[(int)var27]; --var28 >= 0.0F; var7 += var47) {
										this.method6192(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var64, (int)var26, (int)var24, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
										var26 += var50;
										var24 += var49;
										var10 += var38;
										var64 += Rasterizer2D.Rasterizer2D_width;
										var52 += var54;
										var55 += var57;
										var58 += var60;
									}

									while (--var29 >= 0.0F) {
										this.method6192(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var64, (int)var26, (int)var25, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
										var26 += var50;
										var25 += var48;
										var10 += var38;
										var64 += Rasterizer2D.Rasterizer2D_width;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var7 += var47;
									}

								} else {
									var27 = (float)((int)(var27 + 0.5F));
									var28 = (float)((int)(var28 + 0.5F));
									var29 = (float)((int)(var29 + 0.5F)) - var28;
									var28 -= var27;

									for (var64 = var61[(int)var27]; --var28 >= 0.0F; var7 += var47) {
										this.method6192(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var64, (int)var24, (int)var26, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
										var26 += var50;
										var24 += var49;
										var10 += var38;
										var64 += Rasterizer2D.Rasterizer2D_width;
										var52 += var54;
										var55 += var57;
										var58 += var60;
									}

									while (--var29 >= 0.0F) {
										this.method6192(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var64, (int)var25, (int)var26, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
										var26 += var50;
										var25 += var48;
										var10 += var38;
										var64 += Rasterizer2D.Rasterizer2D_width;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var7 += var47;
									}

								}
							} else {
								var25 = var24;
								if (var27 < 0.0F) {
									var25 = var24 - var50 * var27;
									var24 -= var49 * var27;
									var10 = (int)((float)var10 - (float)var38 * var27);
									var27 = 0.0F;
								}

								if (var29 < 0.0F) {
									var26 -= var48 * var29;
									var29 = 0.0F;
								}

								var63 = (int)var27 - super.field2828.clipMidY;
								var52 += var54 * var63;
								var55 += var57 * var63;
								var58 += var60 * var63;
								if ((var27 == var29 || var50 >= var49) && (var27 != var29 || var48 <= var49)) {
									var27 = (float)((int)(var27 + 0.5F));
									var29 = (float)((int)(var29 + 0.5F));
									var28 = (float)((int)(var28 + 0.5F)) - var29;
									var29 -= var27;

									for (var64 = var61[(int)var27]; --var29 >= 0.0F; var7 += var47) {
										this.method6192(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var64, (int)var24, (int)var25, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
										var25 += var50;
										var24 += var49;
										var10 += var38;
										var64 += Rasterizer2D.Rasterizer2D_width;
										var52 += var54;
										var55 += var57;
										var58 += var60;
									}

									while (--var28 >= 0.0F) {
										this.method6192(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var64, (int)var24, (int)var26, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
										var26 += var48;
										var24 += var49;
										var10 += var38;
										var64 += Rasterizer2D.Rasterizer2D_width;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var7 += var47;
									}

								} else {
									var27 = (float)((int)(var27 + 0.5F));
									var29 = (float)((int)(var29 + 0.5F));
									var28 = (float)((int)(var28 + 0.5F)) - var29;
									var29 -= var27;

									for (var64 = var61[(int)var27]; --var29 >= 0.0F; var7 += var47) {
										this.method6192(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var64, (int)var25, (int)var24, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
										var25 += var50;
										var24 += var49;
										var10 += var38;
										var64 += Rasterizer2D.Rasterizer2D_width;
										var52 += var54;
										var55 += var57;
										var58 += var60;
									}

									while (--var28 >= 0.0F) {
										this.method6192(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var64, (int)var26, (int)var24, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
										var26 += var48;
										var24 += var49;
										var10 += var38;
										var64 += Rasterizer2D.Rasterizer2D_width;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var7 += var47;
									}

								}
							}
						}
					} else if (var28 <= var29) {
						if (var28 < (float)var62) {
							if (var29 > (float)var62) {
								var29 = (float)var62;
							}

							if (var27 > (float)var62) {
								var27 = (float)var62;
							}

							var11 = var37 + ((var11 << 9) - var37 * (int)var25);
							var8 = this.method6228(var5, var2, var8, var46, var47);
							if (var29 < var27) {
								var24 = var25;
								if (var28 < 0.0F) {
									var24 = var25 - var49 * var28;
									var25 -= var48 * var28;
									var11 -= var38 * (int)var28;
									var28 = 0.0F;
								}

								if (var29 < 0.0F) {
									var26 -= var50 * var29;
									var29 = 0.0F;
								}

								var63 = (int)var28 - super.field2828.clipMidY;
								var52 += var54 * var63;
								var55 += var57 * var63;
								var58 += var60 * var63;
								if (var28 != var29 && var49 < var48 || var28 == var29 && var49 > var50) {
									var28 = (float)((int)(var28 + 0.5F));
									var29 = (float)((int)(var29 + 0.5F));
									var27 = (float)((int)(var27 + 0.5F)) - var29;
									var29 -= var28;

									for (var64 = var61[(int)var28]; --var29 >= 0.0F; var8 += var47) {
										this.method6192(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var64, (int)var24, (int)var25, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
										var24 += var49;
										var25 += var48;
										var11 += var38;
										var64 += Rasterizer2D.Rasterizer2D_width;
										var52 += var54;
										var55 += var57;
										var58 += var60;
									}

									while (--var27 >= 0.0F) {
										this.method6192(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var64, (int)var24, (int)var26, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
										var24 += var49;
										var26 += var50;
										var11 += var38;
										var64 += Rasterizer2D.Rasterizer2D_width;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var8 += var47;
									}

								} else {
									var28 = (float)((int)(var28 + 0.5F));
									var29 = (float)((int)(var29 + 0.5F));
									var27 = (float)((int)(var27 + 0.5F)) - var29;
									var29 -= var28;

									for (var64 = var61[(int)var28]; --var29 >= 0.0F; var8 += var47) {
										this.method6192(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var64, (int)var25, (int)var24, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
										var24 += var49;
										var25 += var48;
										var11 += var38;
										var64 += Rasterizer2D.Rasterizer2D_width;
										var52 += var54;
										var55 += var57;
										var58 += var60;
									}

									while (--var27 >= 0.0F) {
										this.method6192(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var64, (int)var26, (int)var24, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
										var24 += var49;
										var26 += var50;
										var11 += var38;
										var64 += Rasterizer2D.Rasterizer2D_width;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var8 += var47;
									}

								}
							} else {
								var26 = var25;
								if (var28 < 0.0F) {
									var26 = var25 - var49 * var28;
									var25 -= var48 * var28;
									var11 -= var38 * (int)var28;
									var28 = 0.0F;
								}

								if (var27 < 0.0F) {
									var24 -= var50 * var27;
									var27 = 0.0F;
								}

								var63 = (int)var28 - super.field2828.clipMidY;
								var52 += var54 * var63;
								var55 += var57 * var63;
								var58 += var60 * var63;
								var28 = (float)((int)(var28 + 0.5F));
								var27 = (float)((int)(var27 + 0.5F));
								var29 = (float)((int)(var29 + 0.5F)) - var27;
								var27 -= var28;
								var64 = var61[(int)var28];
								if (var49 < var48) {
									while (--var27 >= 0.0F) {
										this.method6192(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var64, (int)var26, (int)var25, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
										var26 += var49;
										var25 += var48;
										var11 += var38;
										var64 += Rasterizer2D.Rasterizer2D_width;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var8 += var47;
									}

									while (--var29 >= 0.0F) {
										this.method6192(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var64, (int)var24, (int)var25, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
										var24 += var50;
										var25 += var48;
										var11 += var38;
										var64 += Rasterizer2D.Rasterizer2D_width;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var8 += var47;
									}

								} else {
									while (--var27 >= 0.0F) {
										this.method6192(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var64, (int)var25, (int)var26, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
										var26 += var49;
										var25 += var48;
										var11 += var38;
										var64 += Rasterizer2D.Rasterizer2D_width;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var8 += var47;
									}

									while (--var29 >= 0.0F) {
										this.method6192(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var64, (int)var25, (int)var24, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
										var24 += var50;
										var25 += var48;
										var11 += var38;
										var64 += Rasterizer2D.Rasterizer2D_width;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var8 += var47;
									}

								}
							}
						}
					} else if (var29 < (float)var62) {
						if (var27 > (float)var62) {
							var27 = (float)var62;
						}

						if (var28 > (float)var62) {
							var28 = (float)var62;
						}

						var12 = var37 + ((var12 << 9) - var37 * (int)var26);
						var9 = this.method6228(var6, var3, var9, var46, var47);
						if (var27 < var28) {
							var25 = var26;
							if (var29 < 0.0F) {
								var25 = var26 - var48 * var29;
								var26 -= var50 * var29;
								var12 -= var38 * (int)var29;
								var29 = 0.0F;
							}

							if (var27 < 0.0F) {
								var24 -= var49 * var27;
								var27 = 0.0F;
							}

							var63 = (int)var29 - super.field2828.clipMidY;
							var52 += var54 * var63;
							var55 += var57 * var63;
							var58 += var60 * var63;
							var29 = (float)((int)(var29 + 0.5F));
							var27 = (float)((int)(var27 + 0.5F));
							var28 = (float)((int)(var28 + 0.5F)) - var27;
							var27 -= var29;
							var64 = var61[(int)var29];
							if (var48 < var50) {
								while (--var27 >= 0.0F) {
									this.method6192(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var64, (int)var25, (int)var26, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
									var25 += var48;
									var26 += var50;
									var12 += var38;
									var64 += Rasterizer2D.Rasterizer2D_width;
									var52 += var54;
									var55 += var57;
									var58 += var60;
									var9 += var47;
								}

								while (--var28 >= 0.0F) {
									this.method6192(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var64, (int)var25, (int)var24, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
									var25 += var48;
									var24 += var49;
									var12 += var38;
									var64 += Rasterizer2D.Rasterizer2D_width;
									var52 += var54;
									var55 += var57;
									var58 += var60;
									var9 += var47;
								}

							} else {
								while (--var27 >= 0.0F) {
									this.method6192(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var64, (int)var26, (int)var25, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
									var25 += var48;
									var26 += var50;
									var12 += var38;
									var64 += Rasterizer2D.Rasterizer2D_width;
									var52 += var54;
									var55 += var57;
									var58 += var60;
									var9 += var47;
								}

								while (--var28 >= 0.0F) {
									this.method6192(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var64, (int)var24, (int)var25, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
									var25 += var48;
									var24 += var49;
									var12 += var38;
									var64 += Rasterizer2D.Rasterizer2D_width;
									var52 += var54;
									var55 += var57;
									var58 += var60;
									var9 += var47;
								}

							}
						} else {
							var24 = var26;
							if (var29 < 0.0F) {
								var24 = var26 - var48 * var29;
								var26 -= var50 * var29;
								var12 -= var38 * (int)var29;
								var29 = 0.0F;
							}

							if (var28 < 0.0F) {
								var25 -= var49 * var28;
								var28 = 0.0F;
							}

							var63 = (int)var29 - super.field2828.clipMidY;
							var52 += var54 * var63;
							var55 += var57 * var63;
							var58 += var60 * var63;
							var29 = (float)((int)(var29 + 0.5F));
							var28 = (float)((int)(var28 + 0.5F));
							var27 = (float)((int)(var27 + 0.5F)) - var28;
							var28 -= var29;
							var64 = var61[(int)var29];
							if (var48 < var50) {
								while (--var28 >= 0.0F) {
									this.method6192(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var64, (int)var24, (int)var26, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
									var24 += var48;
									var26 += var50;
									var12 += var38;
									var64 += Rasterizer2D.Rasterizer2D_width;
									var52 += var54;
									var55 += var57;
									var58 += var60;
									var9 += var47;
								}

								while (--var27 >= 0.0F) {
									this.method6192(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var64, (int)var25, (int)var26, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
									var25 += var49;
									var26 += var50;
									var12 += var38;
									var64 += Rasterizer2D.Rasterizer2D_width;
									var52 += var54;
									var55 += var57;
									var58 += var60;
									var9 += var47;
								}

							} else {
								while (--var28 >= 0.0F) {
									this.method6192(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var64, (int)var26, (int)var24, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
									var24 += var48;
									var26 += var50;
									var12 += var38;
									var64 += Rasterizer2D.Rasterizer2D_width;
									var52 += var54;
									var55 += var57;
									var58 += var60;
									var9 += var47;
								}

								while (--var27 >= 0.0F) {
									this.method6192(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var64, (int)var26, (int)var25, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
									var25 += var49;
									var26 += var50;
									var12 += var38;
									var64 += Rasterizer2D.Rasterizer2D_width;
									var52 += var54;
									var55 += var57;
									var58 += var60;
									var9 += var47;
								}

							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ad")
	@Export("textureMapPolygons")
	void textureMapPolygons(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22) {
		int[] var23 = super.field2828.Rasterizer3D_textureLoader.getTexturePixels(var22);
		if (var23 == null) {
			int var65 = super.field2828.Rasterizer3D_textureLoader.getAverageTextureRGB(var22);
			this.drawAlphaBlendedGraphics(var1, var2, var3, var4, var5, var6, var7, var8, var9, AbstractRasterizer.method5497(var65, var10), AbstractRasterizer.method5497(var65, var11), AbstractRasterizer.method5497(var65, var12));
		} else {
			super.field2826 = super.field2828.Rasterizer3D_textureLoader.isLowDetail(var22);
			float var24 = (float)((int)(var4 + 0.5F));
			float var25 = (float)((int)(var5 + 0.5F));
			float var26 = (float)((int)(var6 + 0.5F));
			float var27 = (float)((int)(var1 + 0.5F));
			float var28 = (float)((int)(var2 + 0.5F));
			float var29 = (float)((int)(var3 + 0.5F));
			float var30 = var25 - var24;
			float var31 = var28 - var27;
			float var32 = var26 - var24;
			float var33 = var29 - var27;
			float var34 = var30 * var33 - var32 * var31;
			if (var34 != 0.0F) {
				float var35 = (float)(var11 - var10);
				float var36 = (float)(var12 - var10);
				int var37 = (int)((var35 * var33 - var36 * var31) * 512.0F / var34);
				int var38 = (int)((var36 * var30 - var35 * var32) * 512.0F / var34);
				float var39 = var5 - var4;
				float var40 = var2 - var1;
				float var41 = var6 - var4;
				float var42 = var3 - var1;
				float var43 = var39 * var42 - var41 * var40;
				if (var43 != 0.0F) {
					float var44 = var8 - var7;
					float var45 = var9 - var7;
					float var46 = (var44 * var42 - var45 * var40) / var43;
					float var47 = (var45 * var39 - var44 * var41) / var43;
					float var48;
					if (var29 != var28) {
						var48 = (var26 - var25) / (var29 - var28);
					} else {
						var48 = 0.0F;
					}

					float var49;
					if (var28 != var27) {
						var49 = var30 / var31;
					} else {
						var49 = 0.0F;
					}

					float var50;
					if (var29 != var27) {
						var50 = var32 / var33;
					} else {
						var50 = 0.0F;
					}

					int var51 = super.field2828.zoom;
					var14 = var13 - var14;
					var17 = var16 - var17;
					var20 = var19 - var20;
					var15 -= var13;
					var18 -= var16;
					var21 -= var19;
					int var52 = var15 * var16 - var18 * var13 << 14;
					int var53 = (int)(((long)(var18 * var19 - var16 * var21) << 14) / (long)var51);
					int var54 = (int)(((long)(var13 * var21 - var19 * var15) << 14) / (long)var51);
					int var55 = var16 * var14 - var13 * var17 << 14;
					int var56 = (int)(((long)(var19 * var17 - var16 * var20) << 14) / (long)var51);
					int var57 = (int)(((long)(var13 * var20 - var19 * var14) << 14) / (long)var51);
					int var58 = var17 * var15 - var18 * var14 << 14;
					int var59 = (int)(((long)(var18 * var20 - var17 * var21) << 14) / (long)var51);
					int var60 = (int)(((long)(var21 * var14 - var15 * var20) << 14) / (long)var51);
					int[] var61 = super.field2828.Rasterizer3D_rowOffsets;
					int var62 = super.field2828.clipY;
					int var63;
					int var64;
					if (var27 <= var28 && var27 <= var29) {
						if (var27 < (float)var62) {
							if (var28 > (float)var62) {
								var28 = (float)var62;
							}

							if (var29 > (float)var62) {
								var29 = (float)var62;
							}

							var10 = var37 + ((var10 << 9) - var37 * (int)var24);
							var7 = this.method6228(var4, var1, var7, var46, var47);
							if (var28 < var29) {
								var26 = var24;
								if (var27 < 0.0F) {
									var26 = var24 - var50 * var27;
									var24 -= var49 * var27;
									var10 -= var38 * (int)var27;
									var27 = 0.0F;
								}

								if (var28 < 0.0F) {
									var25 -= var48 * var28;
									var28 = 0.0F;
								}

								var63 = (int)var27 - super.field2828.clipMidY;
								var52 += var54 * var63;
								var55 += var57 * var63;
								var58 += var60 * var63;
								if (var27 != var28 && var50 < var49 || var27 == var28 && var50 > var48) {
									var27 = (float)((int)(var27 + 0.5F));
									var28 = (float)((int)(var28 + 0.5F));
									var29 = (float)((int)(var29 + 0.5F)) - var28;
									var28 -= var27;

									for (var64 = var61[(int)var27]; --var28 >= 0.0F; var7 += var47) {
										this.method6194(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var64, (int)var26, (int)var24, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
										var26 += var50;
										var24 += var49;
										var10 += var38;
										var64 += Rasterizer2D.Rasterizer2D_width;
										var52 += var54;
										var55 += var57;
										var58 += var60;
									}

									while (--var29 >= 0.0F) {
										this.method6194(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var64, (int)var26, (int)var25, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
										var26 += var50;
										var25 += var48;
										var10 += var38;
										var64 += Rasterizer2D.Rasterizer2D_width;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var7 += var47;
									}

								} else {
									var27 = (float)((int)(var27 + 0.5F));
									var28 = (float)((int)(var28 + 0.5F));
									var29 = (float)((int)(var29 + 0.5F)) - var28;
									var28 -= var27;

									for (var64 = var61[(int)var27]; --var28 >= 0.0F; var7 += var47) {
										this.method6194(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var64, (int)var24, (int)var26, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
										var26 += var50;
										var24 += var49;
										var10 += var38;
										var64 += Rasterizer2D.Rasterizer2D_width;
										var52 += var54;
										var55 += var57;
										var58 += var60;
									}

									while (--var29 >= 0.0F) {
										this.method6194(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var64, (int)var25, (int)var26, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
										var26 += var50;
										var25 += var48;
										var10 += var38;
										var64 += Rasterizer2D.Rasterizer2D_width;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var7 += var47;
									}

								}
							} else {
								var25 = var24;
								if (var27 < 0.0F) {
									var25 = var24 - var50 * var27;
									var24 -= var49 * var27;
									var10 -= var38 * (int)var27;
									var27 = 0.0F;
								}

								if (var29 < 0.0F) {
									var26 -= var48 * var29;
									var29 = 0.0F;
								}

								var63 = (int)var27 - super.field2828.clipMidY;
								var52 += var54 * var63;
								var55 += var57 * var63;
								var58 += var60 * var63;
								if (var27 != var29 && var50 < var49 || var27 == var29 && var48 > var49) {
									var27 = (float)((int)(var27 + 0.5F));
									var29 = (float)((int)(var29 + 0.5F));
									var28 = (float)((int)(var28 + 0.5F)) - var29;
									var29 -= var27;

									for (var64 = var61[(int)var27]; --var29 >= 0.0F; var7 += var47) {
										this.method6194(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var64, (int)var25, (int)var24, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
										var25 += var50;
										var24 += var49;
										var10 += var38;
										var64 += Rasterizer2D.Rasterizer2D_width;
										var52 += var54;
										var55 += var57;
										var58 += var60;
									}

									while (--var28 >= 0.0F) {
										this.method6194(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var64, (int)var26, (int)var24, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
										var26 += var48;
										var24 += var49;
										var10 += var38;
										var64 += Rasterizer2D.Rasterizer2D_width;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var7 += var47;
									}

								} else {
									var27 = (float)((int)(var27 + 0.5F));
									var29 = (float)((int)(var29 + 0.5F));
									var28 = (float)((int)(var28 + 0.5F)) - var29;
									var29 -= var27;

									for (var64 = var61[(int)var27]; --var29 >= 0.0F; var7 += var47) {
										this.method6194(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var64, (int)var24, (int)var25, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
										var25 += var50;
										var24 += var49;
										var10 += var38;
										var64 += Rasterizer2D.Rasterizer2D_width;
										var52 += var54;
										var55 += var57;
										var58 += var60;
									}

									while (--var28 >= 0.0F) {
										this.method6194(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var64, (int)var24, (int)var26, var10, var37, var7, var46, var52, var55, var58, var53, var56, var59);
										var26 += var48;
										var24 += var49;
										var10 += var38;
										var64 += Rasterizer2D.Rasterizer2D_width;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var7 += var47;
									}

								}
							}
						}
					} else if (var28 <= var29) {
						if (var28 < (float)var62) {
							if (var29 > (float)var62) {
								var29 = (float)var62;
							}

							if (var27 > (float)var62) {
								var27 = (float)var62;
							}

							var11 = var37 + ((var11 << 9) - var37 * (int)var25);
							var8 = this.method6228(var5, var2, var8, var46, var47);
							if (var29 < var27) {
								var24 = var25;
								if (var28 < 0.0F) {
									var24 = var25 - var49 * var28;
									var25 -= var48 * var28;
									var11 -= var38 * (int)var28;
									var28 = 0.0F;
								}

								if (var29 < 0.0F) {
									var26 -= var50 * var29;
									var29 = 0.0F;
								}

								var63 = (int)var28 - super.field2828.clipMidY;
								var52 += var54 * var63;
								var55 += var57 * var63;
								var58 += var60 * var63;
								if (var28 != var29 && var49 < var48 || var28 == var29 && var49 > var50) {
									var28 = (float)((int)(var28 + 0.5F));
									var29 = (float)((int)(var29 + 0.5F));
									var27 = (float)((int)(var27 + 0.5F)) - var29;
									var29 -= var28;

									for (var64 = var61[(int)var28]; --var29 >= 0.0F; var8 += var47) {
										this.method6194(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var64, (int)var24, (int)var25, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
										var24 += var49;
										var25 += var48;
										var11 += var38;
										var64 += Rasterizer2D.Rasterizer2D_width;
										var52 += var54;
										var55 += var57;
										var58 += var60;
									}

									while (--var27 >= 0.0F) {
										this.method6194(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var64, (int)var24, (int)var26, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
										var24 += var49;
										var26 += var50;
										var11 += var38;
										var64 += Rasterizer2D.Rasterizer2D_width;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var8 += var47;
									}

								} else {
									var28 = (float)((int)(var28 + 0.5F));
									var29 = (float)((int)(var29 + 0.5F));
									var27 = (float)((int)(var27 + 0.5F)) - var29;
									var29 -= var28;

									for (var64 = var61[(int)var28]; --var29 >= 0.0F; var8 += var47) {
										this.method6194(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var64, (int)var25, (int)var24, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
										var24 += var49;
										var25 += var48;
										var11 += var38;
										var64 += Rasterizer2D.Rasterizer2D_width;
										var52 += var54;
										var55 += var57;
										var58 += var60;
									}

									while (--var27 >= 0.0F) {
										this.method6194(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var64, (int)var26, (int)var24, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
										var24 += var49;
										var26 += var50;
										var11 += var38;
										var64 += Rasterizer2D.Rasterizer2D_width;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var8 += var47;
									}

								}
							} else {
								var26 = var25 = var25;
								if (var28 < 0.0F) {
									var26 -= var49 * var28;
									var25 -= var48 * var28;
									var11 -= var38 * (int)var28;
									var28 = 0.0F;
								}

								if (var27 < 0.0F) {
									var24 -= var50 * var27;
									var27 = 0.0F;
								}

								var63 = (int)var28 - super.field2828.clipMidY;
								var52 += var54 * var63;
								var55 += var57 * var63;
								var58 += var60 * var63;
								var28 = (float)((int)(var28 + 0.5F));
								var27 = (float)((int)(var27 + 0.5F));
								var29 = (float)((int)(var29 + 0.5F)) - var27;
								var27 -= var28;
								var64 = var61[(int)var28];
								if (var49 < var48) {
									while (--var27 >= 0.0F) {
										this.method6194(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var64, (int)var26, (int)var25, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
										var26 += var49;
										var25 += var48;
										var11 += var38;
										var64 += Rasterizer2D.Rasterizer2D_width;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var8 += var47;
									}

									while (--var29 >= 0.0F) {
										this.method6194(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var64, (int)var24, (int)var25, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
										var24 += var50;
										var25 += var48;
										var11 += var38;
										var64 += Rasterizer2D.Rasterizer2D_width;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var8 += var47;
									}

								} else {
									while (--var27 >= 0.0F) {
										this.method6194(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var64, (int)var25, (int)var26, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
										var26 += var49;
										var25 += var48;
										var11 += var38;
										var64 += Rasterizer2D.Rasterizer2D_width;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var8 += var47;
									}

									while (--var29 >= 0.0F) {
										this.method6194(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var64, (int)var25, (int)var24, var11, var37, var8, var46, var52, var55, var58, var53, var56, var59);
										var24 += var50;
										var25 += var48;
										var11 += var38;
										var64 += Rasterizer2D.Rasterizer2D_width;
										var52 += var54;
										var55 += var57;
										var58 += var60;
										var8 += var47;
									}

								}
							}
						}
					} else if (var29 < (float)var62) {
						if (var27 > (float)var62) {
							var27 = (float)var62;
						}

						if (var28 > (float)var62) {
							var28 = (float)var62;
						}

						var12 = var37 + ((var12 << 9) - var37 * (int)var26);
						var9 = this.method6228(var6, var3, var9, var46, var47);
						if (var27 < var28) {
							var25 = var26;
							if (var29 < 0.0F) {
								var25 = var26 - var48 * var29;
								var26 -= var50 * var29;
								var12 -= var38 * (int)var29;
								var29 = 0.0F;
							}

							if (var27 < 0.0F) {
								var24 -= var49 * var27;
								var27 = 0.0F;
							}

							var63 = (int)var29 - super.field2828.clipMidY;
							var52 += var54 * var63;
							var55 += var57 * var63;
							var58 += var60 * var63;
							var29 = (float)((int)(var29 + 0.5F));
							var27 = (float)((int)(var27 + 0.5F));
							var28 = (float)((int)(var28 + 0.5F)) - var27;
							var27 -= var29;
							var64 = var61[(int)var29];
							if (var48 < var50) {
								while (--var27 >= 0.0F) {
									this.method6194(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var64, (int)var25, (int)var26, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
									var25 += var48;
									var26 += var50;
									var12 += var38;
									var64 += Rasterizer2D.Rasterizer2D_width;
									var52 += var54;
									var55 += var57;
									var58 += var60;
									var9 += var47;
								}

								while (--var28 >= 0.0F) {
									this.method6194(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var64, (int)var25, (int)var24, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
									var25 += var48;
									var24 += var49;
									var12 += var38;
									var64 += Rasterizer2D.Rasterizer2D_width;
									var52 += var54;
									var55 += var57;
									var58 += var60;
									var9 += var47;
								}

							} else {
								while (--var27 >= 0.0F) {
									this.method6194(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var64, (int)var26, (int)var25, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
									var25 += var48;
									var26 += var50;
									var12 += var38;
									var64 += Rasterizer2D.Rasterizer2D_width;
									var52 += var54;
									var55 += var57;
									var58 += var60;
									var9 += var47;
								}

								while (--var28 >= 0.0F) {
									this.method6194(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var64, (int)var24, (int)var25, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
									var25 += var48;
									var24 += var49;
									var12 += var38;
									var64 += Rasterizer2D.Rasterizer2D_width;
									var52 += var54;
									var55 += var57;
									var58 += var60;
									var9 += var47;
								}

							}
						} else {
							var24 = var26 = var26;
							if (var29 < 0.0F) {
								var24 -= var48 * var29;
								var26 -= var50 * var29;
								var12 -= var38 * (int)var29;
								var29 = 0.0F;
							}

							if (var28 < 0.0F) {
								var25 -= var49 * var28;
								var28 = 0.0F;
							}

							var63 = (int)var29 - super.field2828.clipMidY;
							var52 += var54 * var63;
							var55 += var57 * var63;
							var58 += var60 * var63;
							var29 = (float)((int)(var29 + 0.5F));
							var28 = (float)((int)(var28 + 0.5F));
							var27 = (float)((int)(var27 + 0.5F)) - var28;
							var28 -= var29;
							var64 = var61[(int)var29];
							if (var48 < var50) {
								while (--var28 >= 0.0F) {
									this.method6194(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var64, (int)var24, (int)var26, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
									var24 += var48;
									var26 += var50;
									var12 += var38;
									var64 += Rasterizer2D.Rasterizer2D_width;
									var52 += var54;
									var55 += var57;
									var58 += var60;
									var9 += var47;
								}

								while (--var27 >= 0.0F) {
									this.method6194(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var64, (int)var25, (int)var26, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
									var25 += var49;
									var26 += var50;
									var12 += var38;
									var64 += Rasterizer2D.Rasterizer2D_width;
									var52 += var54;
									var55 += var57;
									var58 += var60;
									var9 += var47;
								}

							} else {
								while (--var28 >= 0.0F) {
									this.method6194(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var64, (int)var26, (int)var24, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
									var24 += var48;
									var26 += var50;
									var12 += var38;
									var64 += Rasterizer2D.Rasterizer2D_width;
									var52 += var54;
									var55 += var57;
									var58 += var60;
									var9 += var47;
								}

								while (--var27 >= 0.0F) {
									this.method6194(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var64, (int)var26, (int)var25, var12, var37, var9, var46, var52, var55, var58, var53, var56, var59);
									var25 += var49;
									var26 += var50;
									var12 += var38;
									var64 += Rasterizer2D.Rasterizer2D_width;
									var52 += var54;
									var55 += var57;
									var58 += var60;
									var9 += var47;
								}

							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("bc")
	final void method6239(int[] var1, float[] var2, int var3, int var4, float var5, int var6) {
		int var7 = super.field2828.field3142 & var6;
		int var8 = super.field2828.field3139 & var6;
		var1[var3] = var7 & var4 | ~var7 & var1[var3];
		int var9 = var8 & Float.floatToRawIntBits(var5);
		int var10 = ~var8 & Float.floatToRawIntBits(var2[var3]);
		var2[var3] = Float.intBitsToFloat(var9 | var10);
	}

	@ObfuscatedName("bq")
	final void method6231(int[] var1, float[] var2, int[] var3, int var4, int var5, int var6, float var7) {
		int var8 = var3[(var6 & 16256) + (var6 >>> 25)];
		var8 = ((var8 & 16711935) * var5 & -16711936) + (var5 * (var8 & 65280) & 16711680) >> 8;
		this.method6239(var1, var2, var4, var8, var7, method6175(var2[var4], var7));
	}

	@ObfuscatedName("bx")
	final void method6177(int[] var1, float[] var2, int[] var3, int var4, int var5, int var6, int var7, float var8) {
		int var9 = var3[(var7 & 16256) + (var7 >>> 25)];
		var9 = ((var9 & 16711935) * var6 & -16711936 | (var9 & 65280) * var6 & 16711680) >> 8;
		int var10 = var1[var4];
		var9 += ((var10 & 16711935) * var5 & -16711936 | var5 * (var10 & 65280) & 16711680) >> 8;
		int var11 = super.field2828.field3142 & method6175(var2[var4], var8);
		var1[var4] = (var11 & var9) + (~var11 & var10);
	}

	@ObfuscatedName("bv")
	final void method6179(int[] var1, float[] var2, int[] var3, int var4, int var5, int var6, float var7) {
		int var8 = var3[(var6 & 16256) + (var6 >>> 25)];
		if (var8 != 0) {
			var8 = ((var8 & 16711935) * var5 & -16711936) + (var5 * (var8 & 65280) & 16711680) >> 8;
			this.method6239(var1, var2, var4, var8, var7, method6175(var2[var4], var7));
		}
	}

	@ObfuscatedName("ch")
	final void method6242(int[] var1, float[] var2, int[] var3, int var4, int var5, int var6, int var7, float var8) {
		int var9 = var3[(var7 & 16256) + (var7 >>> 25)];
		if (var9 != 0) {
			var9 = ((var9 & 16711935) * var6 & -16711936 | (var9 & 65280) * var6 & 16711680) >> 8;
			int var10 = var1[var4];
			var9 += ((var10 & 16711935) * var5 & -16711936 | var5 * (var10 & 65280) & 16711680) >> 8;
			int var11 = super.field2828.field3142 & method6175(var2[var4], var8);
			var1[var4] = (var11 & var9) + (~var11 & var10);
		}
	}

	@ObfuscatedName("ce")
	final void method6174(int[] var1, float[] var2, int var3, int var4, float var5) {
		this.method6239(var1, var2, var3, var4, var5, method6175(var2[var3], var5));
	}

	@ObfuscatedName("cu")
	final void method6182(int[] var1, float[] var2, int var3, int var4, float var5) {
		this.method6239(var1, var2, var3, super.field2827[var4], var5, method6175(var2[var3], var5));
	}

	@ObfuscatedName("ct")
	final void method6183(int[] var1, float[] var2, int var3, int var4, int var5, float var6) {
		int var7 = var1[var3];
		var4 = ((var7 & 16711935) * var5 >> 8 & 16711935) + var4 + (var5 * (var7 & 65280) >> 8 & 65280);
		int var8 = super.field2828.field3142 & method6175(var2[var3], var6);
		var1[var3] = (~var8 & var7) + (var8 & var4);
	}

	@ObfuscatedName("cm")
	final void method6184(int[] var1, float[] var2, int var3, int var4, int var5, int var6, float var7) {
		int var8 = super.field2827[var4];
		var8 = ((var8 & 65280) * var6 >> 8 & 65280) + ((var8 & 16711935) * var6 >> 8 & 16711935);
		int var9 = var1[var3];
		var8 = var8 + ((var9 & 16711935) * var5 >> 8 & 16711935) + (var5 * (var9 & 65280) >> 8 & 65280);
		int var10 = super.field2828.field3142 & method6175(var2[var3], var7);
		var1[var3] = (var10 & var8) + (~var10 & var9);
	}

	@ObfuscatedName("cb")
	float method6228(float var1, float var2, float var3, float var4, float var5) {
		var3 = var3 - var4 * var1 + var4;
		if (var2 < 0.0F) {
			var3 -= var5 * (float)((int)var2);
		}

		var3 -= var5 * (var2 - (float)((int)(var2 + 0.5F)));
		return var3;
	}

	@ObfuscatedName("ck")
	final void method6188(int[] var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, float var10) {
		if (super.field2828.clipping) {
			if (var6 > super.field2828.clipX) {
				var6 = super.field2828.clipX;
			}

			if (var5 < 0) {
				var5 = 0;
			}
		}

		if (var5 < var6) {
			var2 += var5 - 1;
			var7 += var8 * (float)var5;
			var9 += var10 * (float)var5;
			int var11;
			int var12;
			if (super.field2828.rasterGouraudLowRes) {
				var4 = var6 - var5 >> 2;
				var8 *= 4.0F;
				if (super.field2828.currentFaceAlpha == 0) {
					if (var4 > 0) {
						do {
							var11 = (int)var7 & 65535;
							var3 = super.field2827[var11];
							var7 += var8;
							++var2;
							this.method6174(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var3, var9);
							var9 += var10;
							++var2;
							this.method6174(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var3, var9);
							var9 += var10;
							++var2;
							this.method6174(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var3, var9);
							var9 += var10;
							++var2;
							this.method6174(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var3, var9);
							var9 += var10;
							--var4;
						} while(var4 > 0);
					}

					var4 = var6 - var5 & 3;
					if (var4 > 0) {
						var11 = (int)var7 & 65535;
						var3 = super.field2827[var11];

						do {
							++var2;
							this.method6174(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var3, var9);
							var9 += var10;
							--var4;
						} while(var4 > 0);
					}
				} else {
					var11 = super.field2828.currentFaceAlpha;
					var12 = 256 - super.field2828.currentFaceAlpha;
					int var13;
					if (var4 > 0) {
						do {
							var13 = (int)var7 & 65535;
							var3 = super.field2827[var13];
							var7 += var8;
							var3 = ((var3 & 16711935) * var12 >> 8 & 16711935) + (var12 * (var3 & 65280) >> 8 & 65280);
							++var2;
							this.method6183(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var3, var11, var9);
							var9 += var10;
							++var2;
							this.method6183(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var3, var11, var9);
							var9 += var10;
							++var2;
							this.method6183(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var3, var11, var9);
							var9 += var10;
							++var2;
							this.method6183(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var3, var11, var9);
							var9 += var10;
							--var4;
						} while(var4 > 0);
					}

					var4 = var6 - var5 & 3;
					if (var4 > 0) {
						var13 = (int)var7 & 65535;
						var3 = super.field2827[var13];
						var3 = ((var3 & 16711935) * var12 >> 8 & 16711935) + (var12 * (var3 & 65280) >> 8 & 65280);

						do {
							++var2;
							this.method6183(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var3, var11, var9);
							var9 += var10;
							--var4;
						} while(var4 > 0);
					}
				}

			} else {
				var4 = var6 - var5;
				if (super.field2828.currentFaceAlpha == 0) {
					do {
						++var2;
						this.method6182(var1, Rasterizer2D.Rasterizer2D_brightness, var2, (int)var7 & 65535, var9);
						var9 += var10;
						var7 += var8;
						--var4;
					} while(var4 > 0);
				} else {
					var11 = super.field2828.currentFaceAlpha;
					var12 = 256 - super.field2828.currentFaceAlpha;

					do {
						++var2;
						this.method6184(var1, Rasterizer2D.Rasterizer2D_brightness, var2, (int)var7 & 65535, var11, var12, var9);
						var9 += var10;
						var7 += var8;
						--var4;
					} while(var4 > 0);
				}

			}
		}
	}

	@ObfuscatedName("cc")
	@Export("copyPixelsWithAlphaBlending")
	final void copyPixelsWithAlphaBlending(int[] var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8) {
		if (super.field2828.clipping) {
			if (var6 > super.field2828.clipX) {
				var6 = super.field2828.clipX;
			}

			if (var5 < 0) {
				var5 = 0;
			}
		}

		if (var5 < var6) {
			var2 += var5 - 1;
			var4 = var6 - var5 >> 2;
			var7 += var8 * (float)var5;
			if (super.field2828.currentFaceAlpha == 0) {
				while (true) {
					--var4;
					if (var4 < 0) {
						var4 = var6 - var5 & 3;

						while (true) {
							--var4;
							if (var4 < 0) {
								return;
							}

							++var2;
							this.method6174(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var3, var7);
							var7 += var8;
						}
					}

					++var2;
					this.method6174(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var3, var7);
					var7 += var8;
					++var2;
					this.method6174(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var3, var7);
					var7 += var8;
					++var2;
					this.method6174(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var3, var7);
					var7 += var8;
					++var2;
					this.method6174(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var3, var7);
					var7 += var8;
				}
			} else if (super.field2828.currentFaceAlpha != 254) {
				int var9 = super.field2828.currentFaceAlpha;
				int var10 = 256 - super.field2828.currentFaceAlpha;
				var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + (var10 * (var3 & 65280) >> 8 & 65280);

				while (true) {
					--var4;
					if (var4 < 0) {
						var4 = var6 - var5 & 3;

						while (true) {
							--var4;
							if (var4 < 0) {
								return;
							}

							++var2;
							this.method6183(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var3, var9, var7);
							var7 += var8;
						}
					}

					++var2;
					this.method6183(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var3, var9, var7);
					var7 += var8;
					++var2;
					this.method6183(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var3, var9, var7);
					var7 += var8;
					++var2;
					this.method6183(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var3, var9, var7);
					var7 += var8;
					++var2;
					this.method6183(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var3, var9, var7);
					var7 += var8;
				}
			} else if (var5 != 0 && var6 <= super.field2828.clipX - 1) {
				while (true) {
					--var4;
					if (var4 < 0) {
						var4 = var6 - var5 & 3;

						while (true) {
							--var4;
							if (var4 < 0) {
								return;
							}

							++var2;
							this.method6183(var1, Rasterizer2D.Rasterizer2D_brightness, var2 - 1, var1[var2], 0, var7);
							var7 += var8;
						}
					}

					++var2;
					this.method6183(var1, Rasterizer2D.Rasterizer2D_brightness, var2 - 1, var1[var2], 0, var7);
					var7 += var8;
					++var2;
					this.method6183(var1, Rasterizer2D.Rasterizer2D_brightness, var2 - 1, var1[var2], 0, var7);
					var7 += var8;
					++var2;
					this.method6183(var1, Rasterizer2D.Rasterizer2D_brightness, var2 - 1, var1[var2], 0, var7);
					var7 += var8;
					++var2;
					this.method6183(var1, Rasterizer2D.Rasterizer2D_brightness, var2 - 1, var1[var2], 0, var7);
					var7 += var8;
				}
			}
		}
	}

	@ObfuscatedName("cs")
	final void method6192(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, float var10, float var11, int var12, int var13, int var14, int var15, int var16, int var17) {
		if (super.field2828.clipping) {
			if (var7 > super.field2828.clipX) {
				var7 = super.field2828.clipX;
			}

			if (var6 < 0) {
				var6 = 0;
			}
		}

		if (var6 < var7) {
			var5 += var6;
			var8 += var9 * var6;
			var10 += var11 * (float)var6;
			int var20 = var7 - var6;
			int var26 = var6 - super.field2828.clipMidX;
			var12 += (var15 >> 3) * var26;
			var13 += var26 * (var16 >> 3);
			var14 += var26 * (var17 >> 3);
			int var25 = var14 >> 14;
			int var21;
			int var22;
			if (var25 != 0) {
				var21 = var12 / var25;
				var22 = var13 / var25;
				if (var21 < 0) {
					var21 = 0;
				} else if (var21 > 16256) {
					var21 = 16256;
				}
			} else {
				var21 = 0;
				var22 = 0;
			}

			var12 += var15;
			var13 += var16;
			var14 += var17;
			var25 = var14 >> 14;
			int var23;
			int var24;
			if (var25 != 0) {
				var23 = var12 / var25;
				var24 = var13 / var25;
				if (var23 < 0) {
					var23 = 0;
				} else if (var23 > 16256) {
					var23 = 16256;
				}
			} else {
				var23 = 0;
				var24 = 0;
			}

			var3 = (var21 << 18) + var22;
			int var19 = (var24 - var22 >> 3) + (var23 - var21 >> 3 << 18);
			var20 >>= 3;
			var9 <<= 3;
			int var18 = var8 >> 8;
			int var10000;
			int var27;
			int var28;
			int var29;
			if (super.field2826) {
				if (super.field2828.currentFaceAlpha != 0) {
					var27 = super.field2828.currentFaceAlpha;
					var28 = 256 - super.field2828.currentFaceAlpha;

					for (var29 = var18 * var28 >> 8; var20-- > 0; var18 = var8 >> 8) {
						this.method6177(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
						++var5;
						var3 += var19;
						var10 += var11;
						this.method6177(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
						++var5;
						var3 += var19;
						var10 += var11;
						this.method6177(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
						++var5;
						var3 += var19;
						var10 += var11;
						this.method6177(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
						++var5;
						var3 += var19;
						var10 += var11;
						this.method6177(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
						++var5;
						var3 += var19;
						var10 += var11;
						this.method6177(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
						++var5;
						var3 += var19;
						var10 += var11;
						this.method6177(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
						++var5;
						var3 += var19;
						var10 += var11;
						this.method6177(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
						++var5;
						var10000 = var3 + var19;
						var10 += var11;
						var21 = var23;
						var22 = var24;
						var12 += var15;
						var13 += var16;
						var14 += var17;
						var25 = var14 >> 14;
						if (var25 != 0) {
							var23 = var12 / var25;
							var24 = var13 / var25;
							if (var23 < 0) {
								var23 = 0;
							} else if (var23 > 16256) {
								var23 = 16256;
							}
						} else {
							var23 = 0;
							var24 = 0;
						}

						var3 = (var21 << 18) + var22;
						var19 = (var24 - var22 >> 3) + (var23 - var21 >> 3 << 18);
						var8 += var9;
					}

					for (var20 = var7 - var6 & 7; var20-- > 0; var10 += var11) {
						this.method6177(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
						++var5;
						var3 += var19;
					}
				} else {
					while (var20-- > 0) {
						this.method6231(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
						++var5;
						var3 += var19;
						var10 += var11;
						this.method6231(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
						++var5;
						var3 += var19;
						var10 += var11;
						this.method6231(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
						++var5;
						var3 += var19;
						var10 += var11;
						this.method6231(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
						++var5;
						var3 += var19;
						var10 += var11;
						this.method6231(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
						++var5;
						var3 += var19;
						var10 += var11;
						this.method6231(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
						++var5;
						var3 += var19;
						var10 += var11;
						this.method6231(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
						++var5;
						var3 += var19;
						var10 += var11;
						this.method6231(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
						++var5;
						var10000 = var3 + var19;
						var10 += var11;
						var21 = var23;
						var22 = var24;
						var12 += var15;
						var13 += var16;
						var14 += var17;
						var25 = var14 >> 14;
						if (var25 != 0) {
							var23 = var12 / var25;
							var24 = var13 / var25;
							if (var23 < 0) {
								var23 = 0;
							} else if (var23 > 16256) {
								var23 = 16256;
							}
						} else {
							var23 = 0;
							var24 = 0;
						}

						var3 = (var21 << 18) + var22;
						var19 = (var24 - var22 >> 3) + (var23 - var21 >> 3 << 18);
						var8 += var9;
						var18 = var8 >> 8;
					}

					for (var20 = var7 - var6 & 7; var20-- > 0; var10 += var11) {
						this.method6231(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
						++var5;
						var3 += var19;
					}
				}
			} else if (super.field2828.currentFaceAlpha != 0) {
				var27 = super.field2828.currentFaceAlpha;
				var28 = 256 - super.field2828.currentFaceAlpha;

				for (var29 = var18 * var28 >> 8; var20-- > 0; var18 = var8 >> 8) {
					this.method6242(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
					++var5;
					var3 += var19;
					var10 += var11;
					this.method6242(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
					++var5;
					var3 += var19;
					var10 += var11;
					this.method6242(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
					++var5;
					var3 += var19;
					var10 += var11;
					this.method6242(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
					++var5;
					var3 += var19;
					var10 += var11;
					this.method6242(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
					++var5;
					var3 += var19;
					var10 += var11;
					this.method6242(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
					++var5;
					var3 += var19;
					var10 += var11;
					this.method6242(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
					++var5;
					var3 += var19;
					var10 += var11;
					this.method6242(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
					++var5;
					var10000 = var3 + var19;
					var10 += var11;
					var21 = var23;
					var22 = var24;
					var12 += var15;
					var13 += var16;
					var14 += var17;
					var25 = var14 >> 14;
					if (var25 != 0) {
						var23 = var12 / var25;
						var24 = var13 / var25;
						if (var23 < 0) {
							var23 = 0;
						} else if (var23 > 16256) {
							var23 = 16256;
						}
					} else {
						var23 = 0;
						var24 = 0;
					}

					var3 = (var21 << 18) + var22;
					var19 = (var24 - var22 >> 3) + (var23 - var21 >> 3 << 18);
					var8 += var9;
				}

				for (var20 = var7 - var6 & 7; var20-- > 0; var10 += var11) {
					this.method6242(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var27, var29, var3, var10);
					++var5;
					var3 += var19;
				}
			} else {
				while (var20-- > 0) {
					this.method6179(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
					++var5;
					var3 += var19;
					var10 += var11;
					this.method6179(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
					++var5;
					var3 += var19;
					var10 += var11;
					this.method6179(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
					++var5;
					var3 += var19;
					var10 += var11;
					this.method6179(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
					++var5;
					var3 += var19;
					var10 += var11;
					this.method6179(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
					++var5;
					var3 += var19;
					var10 += var11;
					this.method6179(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
					++var5;
					var3 += var19;
					var10 += var11;
					this.method6179(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
					++var5;
					var3 += var19;
					var10 += var11;
					this.method6179(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
					++var5;
					var10000 = var3 + var19;
					var10 += var11;
					var21 = var23;
					var22 = var24;
					var12 += var15;
					var13 += var16;
					var14 += var17;
					var25 = var14 >> 14;
					if (var25 != 0) {
						var23 = var12 / var25;
						var24 = var13 / var25;
						if (var23 < 0) {
							var23 = 0;
						} else if (var23 > 16256) {
							var23 = 16256;
						}
					} else {
						var23 = 0;
						var24 = 0;
					}

					var3 = (var21 << 18) + var22;
					var19 = (var24 - var22 >> 3) + (var23 - var21 >> 3 << 18);
					var8 += var9;
					var18 = var8 >> 8;
				}

				for (var20 = var7 - var6 & 7; var20-- > 0; var10 += var11) {
					this.method6179(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
					++var5;
					var3 += var19;
				}
			}

		}
	}

	@ObfuscatedName("cn")
	final void method6194(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, float var10, float var11, int var12, int var13, int var14, int var15, int var16, int var17) {
		if (super.field2828.clipping) {
			if (var7 > super.field2828.clipX) {
				var7 = super.field2828.clipX;
			}

			if (var6 < 0) {
				var6 = 0;
			}
		}

		if (var6 < var7) {
			var5 += var6;
			var8 += var9 * var6;
			var10 += var11 * (float)var6;
			int var20 = var7 - var6;
			int var26 = var6 - super.field2828.clipMidX;
			var12 += var26 * var15;
			var13 += var26 * var16;
			var14 += var17 * var26;
			int var25 = var14 >> 14;
			int var21;
			int var22;
			if (var25 != 0) {
				var21 = var12 / var25;
				var22 = var13 / var25;
			} else {
				var21 = 0;
				var22 = 0;
			}

			var12 += var20 * var15;
			var13 += var20 * var16;
			var14 += var17 * var20;
			var25 = var14 >> 14;
			int var23;
			int var24;
			if (var25 != 0) {
				var23 = var12 / var25;
				var24 = var13 / var25;
			} else {
				var23 = 0;
				var24 = 0;
			}

			var3 = (var21 << 18) + var22;
			int var19 = (var24 - var22) / var20 + ((var23 - var21) / var20 << 18);
			var20 >>= 3;
			var9 <<= 3;
			int var18 = var8 >> 8;
			if (super.field2826) {
				while (var20-- > 0) {
					this.method6231(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
					++var5;
					var3 += var19;
					var10 += var11;
					this.method6231(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
					++var5;
					var3 += var19;
					var10 += var11;
					this.method6231(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
					++var5;
					var3 += var19;
					var10 += var11;
					this.method6231(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
					++var5;
					var3 += var19;
					var10 += var11;
					this.method6231(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
					++var5;
					var3 += var19;
					var10 += var11;
					this.method6231(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
					++var5;
					var3 += var19;
					var10 += var11;
					this.method6231(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
					++var5;
					var3 += var19;
					var10 += var11;
					this.method6231(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
					++var5;
					var3 += var19;
					var10 += var11;
					var8 += var9;
					var18 = var8 >> 8;
				}

				for (var20 = var7 - var6 & 7; var20-- > 0; var10 += var11) {
					this.method6231(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
					++var5;
					var3 += var19;
				}
			} else {
				while (var20-- > 0) {
					this.method6179(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
					++var5;
					var3 += var19;
					var10 += var11;
					this.method6179(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
					++var5;
					var3 += var19;
					var10 += var11;
					this.method6179(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
					++var5;
					var3 += var19;
					var10 += var11;
					this.method6179(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
					++var5;
					var3 += var19;
					var10 += var11;
					this.method6179(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
					++var5;
					var3 += var19;
					var10 += var11;
					this.method6179(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
					++var5;
					var3 += var19;
					var10 += var11;
					this.method6179(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
					++var5;
					var3 += var19;
					var10 += var11;
					this.method6179(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
					++var5;
					var3 += var19;
					var10 += var11;
					var8 += var9;
					var18 = var8 >> 8;
				}

				for (var20 = var7 - var6 & 7; var20-- > 0; var10 += var11) {
					this.method6179(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
					++var5;
					var3 += var19;
				}
			}

		}
	}

	@ObfuscatedName("bl")
	static final int method6175(float var0, float var1) {
		return Float.floatToRawIntBits(var0 - var1) >> 31;
	}
}
