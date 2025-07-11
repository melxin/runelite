import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
public class class263 extends AbstractRasterizer {
	@ObfuscatedSignature(
		descriptor = "(Lkh;)V"
	)
	class263(Clips var1) {
		super(var1);
	}

	@ObfuscatedName("ah")
	@Export("drawAlphaBlendedGraphics")
	void drawAlphaBlendedGraphics(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12) {
		int var13 = var5 - var4;
		int var14 = var2 - var1;
		int var15 = var6 - var4;
		int var16 = var3 - var1;
		int var17 = var11 - var10;
		int var18 = var12 - var10;
		float var19 = var8 - var7;
		float var20 = var9 - var7;
		int var21;
		if (var3 != var2) {
			var21 = (var6 - var5 << 14) / (var3 - var2);
		} else {
			var21 = 0;
		}

		int var22;
		if (var2 != var1) {
			var22 = (var13 << 14) / var14;
		} else {
			var22 = 0;
		}

		int var23;
		if (var3 != var1) {
			var23 = (var15 << 14) / var16;
		} else {
			var23 = 0;
		}

		int var24 = var13 * var16 - var15 * var14;
		if (var24 != 0) {
			int var25 = (var17 * var16 - var18 * var14 << 8) / var24;
			int var26 = (var18 * var13 - var17 * var15 << 8) / var24;
			float var27 = (var19 * (float)var16 - var20 * (float)var14) / (float)var24;
			float var28 = (var20 * (float)var13 - var19 * (float)var15) / (float)var24;
			int[] var29 = super.field2675.Rasterizer3D_rowOffsets;
			int var30 = super.field2675.clipY;
			if (var1 <= var2 && var1 <= var3) {
				if (var1 < var30) {
					if (var2 > var30) {
						var2 = var30;
					}

					if (var3 > var30) {
						var3 = var30;
					}

					var10 = var25 + ((var10 << 8) - var25 * var4);
					var7 = var7 - var27 * (float)var4 + var27;
					if (var2 < var3) {
						var6 = var4 <<= 14;
						if (var1 < 0) {
							var6 -= var23 * var1;
							var4 -= var22 * var1;
							var10 -= var26 * var1;
							var7 -= var28 * (float)var1;
							var1 = 0;
						}

						var5 <<= 14;
						if (var2 < 0) {
							var5 -= var21 * var2;
							var2 = 0;
						}

						if (var2 != var1 && var23 < var22 || var2 == var1 && var23 > var21) {
							var3 -= var2;
							var2 -= var1;
							var1 = var29[var1];

							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var3;
										if (var3 < 0) {
											return;
										}

										this.method5776(Rasterizer2D.Rasterizer2D_pixels, var1, 0, 0, var6 >> 14, var5 >> 14, var10, var25, var7, var27);
										var6 += var23;
										var5 += var21;
										var10 += var26;
										var1 += Rasterizer2D.Rasterizer2D_width;
										var7 += var28;
									}
								}

								this.method5776(Rasterizer2D.Rasterizer2D_pixels, var1, 0, 0, var6 >> 14, var4 >> 14, var10, var25, var7, var27);
								var6 += var23;
								var4 += var22;
								var10 += var26;
								var1 += Rasterizer2D.Rasterizer2D_width;
								var7 += var28;
							}
						} else {
							var3 -= var2;
							var2 -= var1;
							var1 = var29[var1];

							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var3;
										if (var3 < 0) {
											return;
										}

										this.method5776(Rasterizer2D.Rasterizer2D_pixels, var1, 0, 0, var5 >> 14, var6 >> 14, var10, var25, var7, var27);
										var6 += var23;
										var5 += var21;
										var10 += var26;
										var1 += Rasterizer2D.Rasterizer2D_width;
										var7 += var28;
									}
								}

								this.method5776(Rasterizer2D.Rasterizer2D_pixels, var1, 0, 0, var4 >> 14, var6 >> 14, var10, var25, var7, var27);
								var6 += var23;
								var4 += var22;
								var10 += var26;
								var1 += Rasterizer2D.Rasterizer2D_width;
								var7 += var28;
							}
						}
					} else {
						var5 = var4 <<= 14;
						if (var1 < 0) {
							var5 -= var23 * var1;
							var4 -= var22 * var1;
							var10 -= var26 * var1;
							var7 -= var28 * (float)var1;
							var1 = 0;
						}

						var6 <<= 14;
						if (var3 < 0) {
							var6 -= var3 * var21;
							var3 = 0;
						}

						if (var3 != var1 && var23 < var22 || var3 == var1 && var21 > var22) {
							var2 -= var3;
							var3 -= var1;
							var1 = var29[var1];

							while (true) {
								--var3;
								if (var3 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}

										this.method5776(Rasterizer2D.Rasterizer2D_pixels, var1, 0, 0, var6 >> 14, var4 >> 14, var10, var25, var7, var27);
										var6 += var21;
										var4 += var22;
										var10 += var26;
										var1 += Rasterizer2D.Rasterizer2D_width;
										var7 += var28;
									}
								}

								this.method5776(Rasterizer2D.Rasterizer2D_pixels, var1, 0, 0, var5 >> 14, var4 >> 14, var10, var25, var7, var27);
								var5 += var23;
								var4 += var22;
								var10 += var26;
								var1 += Rasterizer2D.Rasterizer2D_width;
								var7 += var28;
							}
						} else {
							var2 -= var3;
							var3 -= var1;
							var1 = var29[var1];

							while (true) {
								--var3;
								if (var3 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}

										this.method5776(Rasterizer2D.Rasterizer2D_pixels, var1, 0, 0, var4 >> 14, var6 >> 14, var10, var25, var7, var27);
										var6 += var21;
										var4 += var22;
										var10 += var26;
										var1 += Rasterizer2D.Rasterizer2D_width;
										var7 += var28;
									}
								}

								this.method5776(Rasterizer2D.Rasterizer2D_pixels, var1, 0, 0, var4 >> 14, var5 >> 14, var10, var25, var7, var27);
								var5 += var23;
								var4 += var22;
								var10 += var26;
								var1 += Rasterizer2D.Rasterizer2D_width;
								var7 += var28;
							}
						}
					}
				}
			} else if (var2 <= var3) {
				if (var2 < var30) {
					if (var3 > var30) {
						var3 = var30;
					}

					if (var1 > var30) {
						var1 = var30;
					}

					var11 = (var11 << 8) - var5 * var25 + var25;
					var8 = var8 - var27 * (float)var5 + var27;
					if (var3 < var1) {
						var4 = var5 <<= 14;
						if (var2 < 0) {
							var4 -= var22 * var2;
							var5 -= var21 * var2;
							var11 -= var26 * var2;
							var8 -= var28 * (float)var2;
							var2 = 0;
						}

						var6 <<= 14;
						if (var3 < 0) {
							var6 -= var3 * var23;
							var3 = 0;
						}

						if (var3 != var2 && var22 < var21 || var3 == var2 && var22 > var23) {
							var1 -= var3;
							var3 -= var2;
							var2 = var29[var2];

							while (true) {
								--var3;
								if (var3 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										this.method5776(Rasterizer2D.Rasterizer2D_pixels, var2, 0, 0, var4 >> 14, var6 >> 14, var11, var25, var8, var27);
										var4 += var22;
										var6 += var23;
										var11 += var26;
										var2 += Rasterizer2D.Rasterizer2D_width;
										var8 += var28;
									}
								}

								this.method5776(Rasterizer2D.Rasterizer2D_pixels, var2, 0, 0, var4 >> 14, var5 >> 14, var11, var25, var8, var27);
								var4 += var22;
								var5 += var21;
								var11 += var26;
								var2 += Rasterizer2D.Rasterizer2D_width;
								var8 += var28;
							}
						} else {
							var1 -= var3;
							var3 -= var2;
							var2 = var29[var2];

							while (true) {
								--var3;
								if (var3 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										this.method5776(Rasterizer2D.Rasterizer2D_pixels, var2, 0, 0, var6 >> 14, var4 >> 14, var11, var25, var8, var27);
										var4 += var22;
										var6 += var23;
										var11 += var26;
										var2 += Rasterizer2D.Rasterizer2D_width;
										var8 += var28;
									}
								}

								this.method5776(Rasterizer2D.Rasterizer2D_pixels, var2, 0, 0, var5 >> 14, var4 >> 14, var11, var25, var8, var27);
								var4 += var22;
								var5 += var21;
								var11 += var26;
								var2 += Rasterizer2D.Rasterizer2D_width;
								var8 += var28;
							}
						}
					} else {
						var6 = var5 <<= 14;
						if (var2 < 0) {
							var6 -= var22 * var2;
							var5 -= var21 * var2;
							var11 -= var26 * var2;
							var8 -= var28 * (float)var2;
							var2 = 0;
						}

						var4 <<= 14;
						if (var1 < 0) {
							var4 -= var23 * var1;
							var1 = 0;
						}

						if (var22 < var21) {
							var3 -= var1;
							var1 -= var2;
							var2 = var29[var2];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var3;
										if (var3 < 0) {
											return;
										}

										this.method5776(Rasterizer2D.Rasterizer2D_pixels, var2, 0, 0, var4 >> 14, var5 >> 14, var11, var25, var8, var27);
										var4 += var23;
										var5 += var21;
										var11 += var26;
										var2 += Rasterizer2D.Rasterizer2D_width;
										var8 += var28;
									}
								}

								this.method5776(Rasterizer2D.Rasterizer2D_pixels, var2, 0, 0, var6 >> 14, var5 >> 14, var11, var25, var8, var27);
								var6 += var22;
								var5 += var21;
								var11 += var26;
								var2 += Rasterizer2D.Rasterizer2D_width;
								var8 += var28;
							}
						} else {
							var3 -= var1;
							var1 -= var2;
							var2 = var29[var2];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var3;
										if (var3 < 0) {
											return;
										}

										this.method5776(Rasterizer2D.Rasterizer2D_pixels, var2, 0, 0, var5 >> 14, var4 >> 14, var11, var25, var8, var27);
										var4 += var23;
										var5 += var21;
										var11 += var26;
										var2 += Rasterizer2D.Rasterizer2D_width;
										var8 += var28;
									}
								}

								this.method5776(Rasterizer2D.Rasterizer2D_pixels, var2, 0, 0, var5 >> 14, var6 >> 14, var11, var25, var8, var27);
								var6 += var22;
								var5 += var21;
								var11 += var26;
								var2 += Rasterizer2D.Rasterizer2D_width;
								var8 += var28;
							}
						}
					}
				}
			} else if (var3 < var30) {
				if (var1 > var30) {
					var1 = var30;
				}

				if (var2 > var30) {
					var2 = var30;
				}

				var12 = var25 + ((var12 << 8) - var25 * var6);
				var9 = var9 - var27 * (float)var6 + var27;
				if (var1 < var2) {
					var5 = var6 <<= 14;
					if (var3 < 0) {
						var5 -= var3 * var21;
						var6 -= var3 * var23;
						var12 -= var3 * var26;
						var9 -= var28 * (float)var3;
						var3 = 0;
					}

					var4 <<= 14;
					if (var1 < 0) {
						var4 -= var22 * var1;
						var1 = 0;
					}

					if (var21 < var23) {
						var2 -= var1;
						var1 -= var3;
						var3 = var29[var3];

						while (true) {
							--var1;
							if (var1 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									this.method5776(Rasterizer2D.Rasterizer2D_pixels, var3, 0, 0, var5 >> 14, var4 >> 14, var12, var25, var9, var27);
									var5 += var21;
									var4 += var22;
									var12 += var26;
									var3 += Rasterizer2D.Rasterizer2D_width;
									var9 += var28;
								}
							}

							this.method5776(Rasterizer2D.Rasterizer2D_pixels, var3, 0, 0, var5 >> 14, var6 >> 14, var12, var25, var9, var27);
							var5 += var21;
							var6 += var23;
							var12 += var26;
							var3 += Rasterizer2D.Rasterizer2D_width;
							var9 += var28;
						}
					} else {
						var2 -= var1;
						var1 -= var3;
						var3 = var29[var3];

						while (true) {
							--var1;
							if (var1 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									this.method5776(Rasterizer2D.Rasterizer2D_pixels, var3, 0, 0, var4 >> 14, var5 >> 14, var12, var25, var9, var27);
									var5 += var21;
									var4 += var22;
									var12 += var26;
									var3 += Rasterizer2D.Rasterizer2D_width;
									var9 += var28;
								}
							}

							this.method5776(Rasterizer2D.Rasterizer2D_pixels, var3, 0, 0, var6 >> 14, var5 >> 14, var12, var25, var9, var27);
							var5 += var21;
							var6 += var23;
							var12 += var26;
							var3 += Rasterizer2D.Rasterizer2D_width;
							var9 += var28;
						}
					}
				} else {
					var4 = var6 <<= 14;
					if (var3 < 0) {
						var4 -= var3 * var21;
						var6 -= var3 * var23;
						var12 -= var3 * var26;
						var9 -= var28 * (float)var3;
						var3 = 0;
					}

					var5 <<= 14;
					if (var2 < 0) {
						var5 -= var22 * var2;
						var2 = 0;
					}

					if (var21 < var23) {
						var1 -= var2;
						var2 -= var3;
						var3 = var29[var3];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}

									this.method5776(Rasterizer2D.Rasterizer2D_pixels, var3, 0, 0, var5 >> 14, var6 >> 14, var12, var25, var9, var27);
									var5 += var22;
									var6 += var23;
									var12 += var26;
									var3 += Rasterizer2D.Rasterizer2D_width;
									var9 += var28;
								}
							}

							this.method5776(Rasterizer2D.Rasterizer2D_pixels, var3, 0, 0, var4 >> 14, var6 >> 14, var12, var25, var9, var27);
							var4 += var21;
							var6 += var23;
							var12 += var26;
							var3 += Rasterizer2D.Rasterizer2D_width;
							var9 += var28;
						}
					} else {
						var1 -= var2;
						var2 -= var3;
						var3 = var29[var3];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}

									this.method5776(Rasterizer2D.Rasterizer2D_pixels, var3, 0, 0, var6 >> 14, var5 >> 14, var12, var25, var9, var27);
									var5 += var22;
									var6 += var23;
									var12 += var26;
									var3 += Rasterizer2D.Rasterizer2D_width;
									var9 += var28;
								}
							}

							this.method5776(Rasterizer2D.Rasterizer2D_pixels, var3, 0, 0, var6 >> 14, var4 >> 14, var12, var25, var9, var27);
							var4 += var21;
							var6 += var23;
							var12 += var26;
							var3 += Rasterizer2D.Rasterizer2D_width;
							var9 += var28;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ag")
	void vmethod5777(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10) {
		int var11 = var5 - var4;
		int var12 = var2 - var1;
		int var13 = var6 - var4;
		int var14 = var3 - var1;
		float var15 = var8 - var7;
		float var16 = var9 - var7;
		int var17;
		if (var3 != var2) {
			var17 = (var6 - var5 << 14) / (var3 - var2);
		} else {
			var17 = 0;
		}

		int var18;
		if (var2 != var1) {
			var18 = (var11 << 14) / var12;
		} else {
			var18 = 0;
		}

		int var19;
		if (var3 != var1) {
			var19 = (var13 << 14) / var14;
		} else {
			var19 = 0;
		}

		int var20 = var11 * var14 - var13 * var12;
		if (var20 != 0) {
			float var21 = (var15 * (float)var14 - var16 * (float)var12) / (float)var20;
			float var22 = (var16 * (float)var11 - var15 * (float)var13) / (float)var20;
			int[] var23 = super.field2675.Rasterizer3D_rowOffsets;
			int var24 = super.field2675.clipY;
			if (var1 <= var2 && var1 <= var3) {
				if (var1 < var24) {
					if (var2 > var24) {
						var2 = var24;
					}

					if (var3 > var24) {
						var3 = var24;
					}

					var7 = var7 - var21 * (float)var4 + var21;
					if (var2 < var3) {
						var6 = var4 <<= 14;
						if (var1 < 0) {
							var6 -= var19 * var1;
							var4 -= var18 * var1;
							var7 -= var22 * (float)var1;
							var1 = 0;
						}

						var5 <<= 14;
						if (var2 < 0) {
							var5 -= var17 * var2;
							var2 = 0;
						}

						if (var2 != var1 && var19 < var18 || var2 == var1 && var19 > var17) {
							var3 -= var2;
							var2 -= var1;
							var1 = var23[var1];

							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var3;
										if (var3 < 0) {
											return;
										}

										this.copyPixelsWithAlphaBlending(Rasterizer2D.Rasterizer2D_pixels, var1, var10, 0, var6 >> 14, var5 >> 14, var7, var21);
										var6 += var19;
										var5 += var17;
										var1 += Rasterizer2D.Rasterizer2D_width;
										var7 += var22;
									}
								}

								this.copyPixelsWithAlphaBlending(Rasterizer2D.Rasterizer2D_pixels, var1, var10, 0, var6 >> 14, var4 >> 14, var7, var21);
								var6 += var19;
								var4 += var18;
								var1 += Rasterizer2D.Rasterizer2D_width;
								var7 += var22;
							}
						} else {
							var3 -= var2;
							var2 -= var1;
							var1 = var23[var1];

							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var3;
										if (var3 < 0) {
											return;
										}

										this.copyPixelsWithAlphaBlending(Rasterizer2D.Rasterizer2D_pixels, var1, var10, 0, var5 >> 14, var6 >> 14, var7, var21);
										var6 += var19;
										var5 += var17;
										var1 += Rasterizer2D.Rasterizer2D_width;
										var7 += var22;
									}
								}

								this.copyPixelsWithAlphaBlending(Rasterizer2D.Rasterizer2D_pixels, var1, var10, 0, var4 >> 14, var6 >> 14, var7, var21);
								var6 += var19;
								var4 += var18;
								var1 += Rasterizer2D.Rasterizer2D_width;
								var7 += var22;
							}
						}
					} else {
						var5 = var4 <<= 14;
						if (var1 < 0) {
							var5 -= var19 * var1;
							var4 -= var18 * var1;
							var7 -= var22 * (float)var1;
							var1 = 0;
						}

						var6 <<= 14;
						if (var3 < 0) {
							var6 -= var3 * var17;
							var3 = 0;
						}

						if ((var3 == var1 || var19 >= var18) && (var3 != var1 || var17 <= var18)) {
							var2 -= var3;
							var3 -= var1;
							var1 = var23[var1];

							while (true) {
								--var3;
								if (var3 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}

										this.copyPixelsWithAlphaBlending(Rasterizer2D.Rasterizer2D_pixels, var1, var10, 0, var4 >> 14, var6 >> 14, var7, var21);
										var6 += var17;
										var4 += var18;
										var1 += Rasterizer2D.Rasterizer2D_width;
										var7 += var22;
									}
								}

								this.copyPixelsWithAlphaBlending(Rasterizer2D.Rasterizer2D_pixels, var1, var10, 0, var4 >> 14, var5 >> 14, var7, var21);
								var5 += var19;
								var4 += var18;
								var1 += Rasterizer2D.Rasterizer2D_width;
								var7 += var22;
							}
						} else {
							var2 -= var3;
							var3 -= var1;
							var1 = var23[var1];

							while (true) {
								--var3;
								if (var3 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}

										this.copyPixelsWithAlphaBlending(Rasterizer2D.Rasterizer2D_pixels, var1, var10, 0, var6 >> 14, var4 >> 14, var7, var21);
										var6 += var17;
										var4 += var18;
										var1 += Rasterizer2D.Rasterizer2D_width;
										var7 += var22;
									}
								}

								this.copyPixelsWithAlphaBlending(Rasterizer2D.Rasterizer2D_pixels, var1, var10, 0, var5 >> 14, var4 >> 14, var7, var21);
								var5 += var19;
								var4 += var18;
								var1 += Rasterizer2D.Rasterizer2D_width;
								var7 += var22;
							}
						}
					}
				}
			} else if (var2 <= var3) {
				if (var2 < var24) {
					if (var3 > var24) {
						var3 = var24;
					}

					if (var1 > var24) {
						var1 = var24;
					}

					var8 = var8 - var21 * (float)var5 + var21;
					if (var3 < var1) {
						var4 = var5 <<= 14;
						if (var2 < 0) {
							var4 -= var18 * var2;
							var5 -= var17 * var2;
							var8 -= var22 * (float)var2;
							var2 = 0;
						}

						var6 <<= 14;
						if (var3 < 0) {
							var6 -= var3 * var19;
							var3 = 0;
						}

						if (var3 != var2 && var18 < var17 || var3 == var2 && var18 > var19) {
							var1 -= var3;
							var3 -= var2;
							var2 = var23[var2];

							while (true) {
								--var3;
								if (var3 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										this.copyPixelsWithAlphaBlending(Rasterizer2D.Rasterizer2D_pixels, var2, var10, 0, var4 >> 14, var6 >> 14, var8, var21);
										var4 += var18;
										var6 += var19;
										var2 += Rasterizer2D.Rasterizer2D_width;
										var8 += var22;
									}
								}

								this.copyPixelsWithAlphaBlending(Rasterizer2D.Rasterizer2D_pixels, var2, var10, 0, var4 >> 14, var5 >> 14, var8, var21);
								var4 += var18;
								var5 += var17;
								var2 += Rasterizer2D.Rasterizer2D_width;
								var8 += var22;
							}
						} else {
							var1 -= var3;
							var3 -= var2;
							var2 = var23[var2];

							while (true) {
								--var3;
								if (var3 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										this.copyPixelsWithAlphaBlending(Rasterizer2D.Rasterizer2D_pixels, var2, var10, 0, var6 >> 14, var4 >> 14, var8, var21);
										var4 += var18;
										var6 += var19;
										var2 += Rasterizer2D.Rasterizer2D_width;
										var8 += var22;
									}
								}

								this.copyPixelsWithAlphaBlending(Rasterizer2D.Rasterizer2D_pixels, var2, var10, 0, var5 >> 14, var4 >> 14, var8, var21);
								var4 += var18;
								var5 += var17;
								var2 += Rasterizer2D.Rasterizer2D_width;
								var8 += var22;
							}
						}
					} else {
						var6 = var5 <<= 14;
						if (var2 < 0) {
							var6 -= var18 * var2;
							var5 -= var17 * var2;
							var8 -= var22 * (float)var2;
							var2 = 0;
						}

						var4 <<= 14;
						if (var1 < 0) {
							var4 -= var19 * var1;
							var1 = 0;
						}

						if (var18 < var17) {
							var3 -= var1;
							var1 -= var2;
							var2 = var23[var2];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var3;
										if (var3 < 0) {
											return;
										}

										this.copyPixelsWithAlphaBlending(Rasterizer2D.Rasterizer2D_pixels, var2, var10, 0, var4 >> 14, var5 >> 14, var8, var21);
										var4 += var19;
										var5 += var17;
										var2 += Rasterizer2D.Rasterizer2D_width;
										var8 += var22;
									}
								}

								this.copyPixelsWithAlphaBlending(Rasterizer2D.Rasterizer2D_pixels, var2, var10, 0, var6 >> 14, var5 >> 14, var8, var21);
								var6 += var18;
								var5 += var17;
								var2 += Rasterizer2D.Rasterizer2D_width;
								var8 += var22;
							}
						} else {
							var3 -= var1;
							var1 -= var2;
							var2 = var23[var2];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var3;
										if (var3 < 0) {
											return;
										}

										this.copyPixelsWithAlphaBlending(Rasterizer2D.Rasterizer2D_pixels, var2, var10, 0, var5 >> 14, var4 >> 14, var8, var21);
										var4 += var19;
										var5 += var17;
										var2 += Rasterizer2D.Rasterizer2D_width;
										var8 += var22;
									}
								}

								this.copyPixelsWithAlphaBlending(Rasterizer2D.Rasterizer2D_pixels, var2, var10, 0, var5 >> 14, var6 >> 14, var8, var21);
								var6 += var18;
								var5 += var17;
								var2 += Rasterizer2D.Rasterizer2D_width;
								var8 += var22;
							}
						}
					}
				}
			} else if (var3 < var24) {
				if (var1 > var24) {
					var1 = var24;
				}

				if (var2 > var24) {
					var2 = var24;
				}

				var9 = var9 - var21 * (float)var6 + var21;
				if (var1 < var2) {
					var5 = var6 <<= 14;
					if (var3 < 0) {
						var5 -= var3 * var17;
						var6 -= var3 * var19;
						var9 -= var22 * (float)var3;
						var3 = 0;
					}

					var4 <<= 14;
					if (var1 < 0) {
						var4 -= var18 * var1;
						var1 = 0;
					}

					if (var17 < var19) {
						var2 -= var1;
						var1 -= var3;
						var3 = var23[var3];

						while (true) {
							--var1;
							if (var1 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									this.copyPixelsWithAlphaBlending(Rasterizer2D.Rasterizer2D_pixels, var3, var10, 0, var5 >> 14, var4 >> 14, var9, var21);
									var5 += var17;
									var4 += var18;
									var3 += Rasterizer2D.Rasterizer2D_width;
									var9 += var22;
								}
							}

							this.copyPixelsWithAlphaBlending(Rasterizer2D.Rasterizer2D_pixels, var3, var10, 0, var5 >> 14, var6 >> 14, var9, var21);
							var5 += var17;
							var6 += var19;
							var3 += Rasterizer2D.Rasterizer2D_width;
							var9 += var22;
						}
					} else {
						var2 -= var1;
						var1 -= var3;
						var3 = var23[var3];

						while (true) {
							--var1;
							if (var1 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									this.copyPixelsWithAlphaBlending(Rasterizer2D.Rasterizer2D_pixels, var3, var10, 0, var4 >> 14, var5 >> 14, var9, var21);
									var5 += var17;
									var4 += var18;
									var3 += Rasterizer2D.Rasterizer2D_width;
									var9 += var22;
								}
							}

							this.copyPixelsWithAlphaBlending(Rasterizer2D.Rasterizer2D_pixels, var3, var10, 0, var6 >> 14, var5 >> 14, var9, var21);
							var5 += var17;
							var6 += var19;
							var3 += Rasterizer2D.Rasterizer2D_width;
							var9 += var22;
						}
					}
				} else {
					var4 = var6 <<= 14;
					if (var3 < 0) {
						var4 -= var3 * var17;
						var6 -= var3 * var19;
						var9 -= var22 * (float)var3;
						var3 = 0;
					}

					var5 <<= 14;
					if (var2 < 0) {
						var5 -= var18 * var2;
						var2 = 0;
					}

					if (var17 < var19) {
						var1 -= var2;
						var2 -= var3;
						var3 = var23[var3];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}

									this.copyPixelsWithAlphaBlending(Rasterizer2D.Rasterizer2D_pixels, var3, var10, 0, var5 >> 14, var6 >> 14, var9, var21);
									var5 += var18;
									var6 += var19;
									var3 += Rasterizer2D.Rasterizer2D_width;
									var9 += var22;
								}
							}

							this.copyPixelsWithAlphaBlending(Rasterizer2D.Rasterizer2D_pixels, var3, var10, 0, var4 >> 14, var6 >> 14, var9, var21);
							var4 += var17;
							var6 += var19;
							var3 += Rasterizer2D.Rasterizer2D_width;
							var9 += var22;
						}
					} else {
						var1 -= var2;
						var2 -= var3;
						var3 = var23[var3];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}

									this.copyPixelsWithAlphaBlending(Rasterizer2D.Rasterizer2D_pixels, var3, var10, 0, var6 >> 14, var5 >> 14, var9, var21);
									var5 += var18;
									var6 += var19;
									var3 += Rasterizer2D.Rasterizer2D_width;
									var9 += var22;
								}
							}

							this.copyPixelsWithAlphaBlending(Rasterizer2D.Rasterizer2D_pixels, var3, var10, 0, var6 >> 14, var4 >> 14, var9, var21);
							var4 += var17;
							var6 += var19;
							var3 += Rasterizer2D.Rasterizer2D_width;
							var9 += var22;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("au")
	@Export("drawGradientTriangle")
	void drawGradientTriangle(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22) {
		int[] var23 = super.field2675.Rasterizer3D_textureLoader.getTexturePixels(var22);
		int var24;
		if (var23 == null) {
			var24 = super.field2675.Rasterizer3D_textureLoader.getAverageTextureRGB(var22);
			this.drawAlphaBlendedGraphics(var1, var2, var3, var4, var5, var6, var7, var8, var9, AbstractRasterizer.method5141(var24, var10), AbstractRasterizer.method5141(var24, var11), AbstractRasterizer.method5141(var24, var12));
		} else {
			super.field2669 = super.field2675.Rasterizer3D_textureLoader.isLowDetail(var22);
			super.field2672 = super.field2675.Rasterizer3D_textureLoader.vmethod5847(var22);
			var24 = var5 - var4;
			int var25 = var2 - var1;
			int var26 = var6 - var4;
			int var27 = var3 - var1;
			int var28 = var11 - var10;
			int var29 = var12 - var10;
			int var30 = 0;
			if (var2 != var1) {
				var30 = (var5 - var4 << 14) / (var2 - var1);
			}

			int var31 = 0;
			if (var3 != var2) {
				var31 = (var6 - var5 << 14) / (var3 - var2);
			}

			int var32 = 0;
			if (var3 != var1) {
				var32 = (var4 - var6 << 14) / (var1 - var3);
			}

			int var33 = var24 * var27 - var26 * var25;
			if (var33 != 0) {
				int var34 = (var28 * var27 - var29 * var25 << 9) / var33;
				int var35 = (var29 * var24 - var28 * var26 << 9) / var33;
				float var36 = var8 - var7;
				float var37 = var9 - var7;
				float var38 = (var36 * (float)var27 - var37 * (float)var25) / (float)var33;
				float var39 = (var37 * (float)var24 - var36 * (float)var26) / (float)var33;
				int var40 = super.field2675.zoom;
				var14 = var13 - var14;
				var17 = var16 - var17;
				var20 = var19 - var20;
				var15 -= var13;
				var18 -= var16;
				var21 -= var19;
				int var41 = var15 * var16 - var18 * var13 << 14;
				int var42 = (int)(((long)(var18 * var19 - var16 * var21) << 3 << 14) / (long)var40);
				int var43 = (int)(((long)(var13 * var21 - var19 * var15) << 14) / (long)var40);
				int var44 = var16 * var14 - var13 * var17 << 14;
				int var45 = (int)(((long)(var19 * var17 - var16 * var20) << 3 << 14) / (long)var40);
				int var46 = (int)(((long)(var13 * var20 - var19 * var14) << 14) / (long)var40);
				int var47 = var17 * var15 - var18 * var14 << 14;
				int var48 = (int)(((long)(var18 * var20 - var17 * var21) << 3 << 14) / (long)var40);
				int var49 = (int)(((long)(var21 * var14 - var15 * var20) << 14) / (long)var40);
				int[] var50 = super.field2675.Rasterizer3D_rowOffsets;
				int var51 = super.field2675.clipY;
				int var52;
				if (var1 <= var2 && var1 <= var3) {
					if (var1 < var51) {
						if (var2 > var51) {
							var2 = var51;
						}

						if (var3 > var51) {
							var3 = var51;
						}

						var10 = var34 + ((var10 << 9) - var34 * var4);
						var7 = var7 - var38 * (float)var4 + var38;
						if (var2 < var3) {
							var6 = var4 <<= 14;
							if (var1 < 0) {
								var6 -= var32 * var1;
								var4 -= var30 * var1;
								var10 -= var35 * var1;
								var7 -= var39 * (float)var1;
								var1 = 0;
							}

							var5 <<= 14;
							if (var2 < 0) {
								var5 -= var31 * var2;
								var2 = 0;
							}

							var52 = var1 - super.field2675.clipMidY;
							var41 += var43 * var52;
							var44 += var46 * var52;
							var47 += var49 * var52;
							if (var2 != var1 && var32 < var30 || var2 == var1 && var32 > var31) {
								var3 -= var2;
								var2 -= var1;
								var1 = var50[var1];

								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var3;
											if (var3 < 0) {
												return;
											}

											this.method5780(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var1, var6 >> 14, var5 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
											var6 += var32;
											var5 += var31;
											var10 += var35;
											var1 += Rasterizer2D.Rasterizer2D_width;
											var41 += var43;
											var44 += var46;
											var47 += var49;
											var7 += var39;
										}
									}

									this.method5780(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
									var6 += var32;
									var4 += var30;
									var10 += var35;
									var1 += Rasterizer2D.Rasterizer2D_width;
									var41 += var43;
									var44 += var46;
									var47 += var49;
									var7 += var39;
								}
							} else {
								var3 -= var2;
								var2 -= var1;
								var1 = var50[var1];

								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var3;
											if (var3 < 0) {
												return;
											}

											this.method5780(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var1, var5 >> 14, var6 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
											var6 += var32;
											var5 += var31;
											var10 += var35;
											var1 += Rasterizer2D.Rasterizer2D_width;
											var41 += var43;
											var44 += var46;
											var47 += var49;
											var7 += var39;
										}
									}

									this.method5780(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
									var6 += var32;
									var4 += var30;
									var10 += var35;
									var1 += Rasterizer2D.Rasterizer2D_width;
									var41 += var43;
									var44 += var46;
									var47 += var49;
									var7 += var39;
								}
							}
						} else {
							var5 = var4 <<= 14;
							if (var1 < 0) {
								var5 -= var32 * var1;
								var4 -= var30 * var1;
								var10 -= var35 * var1;
								var7 -= var39 * (float)var1;
								var1 = 0;
							}

							var6 <<= 14;
							if (var3 < 0) {
								var6 -= var3 * var31;
								var3 = 0;
							}

							var52 = var1 - super.field2675.clipMidY;
							var41 += var43 * var52;
							var44 += var46 * var52;
							var47 += var49 * var52;
							if (var3 != var1 && var32 < var30 || var3 == var1 && var31 > var30) {
								var2 -= var3;
								var3 -= var1;
								var1 = var50[var1];

								while (true) {
									--var3;
									if (var3 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}

											this.method5780(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
											var6 += var31;
											var4 += var30;
											var10 += var35;
											var1 += Rasterizer2D.Rasterizer2D_width;
											var41 += var43;
											var44 += var46;
											var47 += var49;
											var7 += var39;
										}
									}

									this.method5780(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var1, var5 >> 14, var4 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
									var5 += var32;
									var4 += var30;
									var10 += var35;
									var1 += Rasterizer2D.Rasterizer2D_width;
									var41 += var43;
									var44 += var46;
									var47 += var49;
									var7 += var39;
								}
							} else {
								var2 -= var3;
								var3 -= var1;
								var1 = var50[var1];

								while (true) {
									--var3;
									if (var3 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}

											this.method5780(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
											var6 += var31;
											var4 += var30;
											var10 += var35;
											var1 += Rasterizer2D.Rasterizer2D_width;
											var41 += var43;
											var44 += var46;
											var47 += var49;
											var7 += var39;
										}
									}

									this.method5780(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var1, var4 >> 14, var5 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
									var5 += var32;
									var4 += var30;
									var10 += var35;
									var1 += Rasterizer2D.Rasterizer2D_width;
									var41 += var43;
									var44 += var46;
									var47 += var49;
									var7 += var39;
								}
							}
						}
					}
				} else if (var2 <= var3) {
					if (var2 < var51) {
						if (var3 > var51) {
							var3 = var51;
						}

						if (var1 > var51) {
							var1 = var51;
						}

						var11 = var34 + ((var11 << 9) - var5 * var34);
						var8 = var8 - var38 * (float)var5 + var38;
						if (var3 < var1) {
							var4 = var5 <<= 14;
							if (var2 < 0) {
								var4 -= var30 * var2;
								var5 -= var31 * var2;
								var11 -= var35 * var2;
								var8 -= var39 * (float)var2;
								var2 = 0;
							}

							var6 <<= 14;
							if (var3 < 0) {
								var6 -= var3 * var32;
								var3 = 0;
							}

							var52 = var2 - super.field2675.clipMidY;
							var41 += var43 * var52;
							var44 += var46 * var52;
							var47 += var49 * var52;
							if (var3 != var2 && var30 < var31 || var3 == var2 && var30 > var32) {
								var1 -= var3;
								var3 -= var2;
								var2 = var50[var2];

								while (true) {
									--var3;
									if (var3 < 0) {
										while (true) {
											--var1;
											if (var1 < 0) {
												return;
											}

											this.method5780(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var2, var4 >> 14, var6 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
											var4 += var30;
											var6 += var32;
											var11 += var35;
											var2 += Rasterizer2D.Rasterizer2D_width;
											var41 += var43;
											var44 += var46;
											var47 += var49;
											var8 += var39;
										}
									}

									this.method5780(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
									var4 += var30;
									var5 += var31;
									var11 += var35;
									var2 += Rasterizer2D.Rasterizer2D_width;
									var41 += var43;
									var44 += var46;
									var47 += var49;
									var8 += var39;
								}
							} else {
								var1 -= var3;
								var3 -= var2;
								var2 = var50[var2];

								while (true) {
									--var3;
									if (var3 < 0) {
										while (true) {
											--var1;
											if (var1 < 0) {
												return;
											}

											this.method5780(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var2, var6 >> 14, var4 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
											var4 += var30;
											var6 += var32;
											var11 += var35;
											var2 += Rasterizer2D.Rasterizer2D_width;
											var41 += var43;
											var44 += var46;
											var47 += var49;
											var8 += var39;
										}
									}

									this.method5780(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
									var4 += var30;
									var5 += var31;
									var11 += var35;
									var2 += Rasterizer2D.Rasterizer2D_width;
									var41 += var43;
									var44 += var46;
									var47 += var49;
									var8 += var39;
								}
							}
						} else {
							var6 = var5 <<= 14;
							if (var2 < 0) {
								var6 -= var30 * var2;
								var5 -= var31 * var2;
								var11 -= var35 * var2;
								var8 -= var39 * (float)var2;
								var2 = 0;
							}

							var4 <<= 14;
							if (var1 < 0) {
								var4 -= var32 * var1;
								var1 = 0;
							}

							var52 = var2 - super.field2675.clipMidY;
							var41 += var43 * var52;
							var44 += var46 * var52;
							var47 += var49 * var52;
							if (var30 < var31) {
								var3 -= var1;
								var1 -= var2;
								var2 = var50[var2];

								while (true) {
									--var1;
									if (var1 < 0) {
										while (true) {
											--var3;
											if (var3 < 0) {
												return;
											}

											this.method5780(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
											var4 += var32;
											var5 += var31;
											var11 += var35;
											var2 += Rasterizer2D.Rasterizer2D_width;
											var41 += var43;
											var44 += var46;
											var47 += var49;
											var8 += var39;
										}
									}

									this.method5780(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var2, var6 >> 14, var5 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
									var6 += var30;
									var5 += var31;
									var11 += var35;
									var2 += Rasterizer2D.Rasterizer2D_width;
									var41 += var43;
									var44 += var46;
									var47 += var49;
									var8 += var39;
								}
							} else {
								var3 -= var1;
								var1 -= var2;
								var2 = var50[var2];

								while (true) {
									--var1;
									if (var1 < 0) {
										while (true) {
											--var3;
											if (var3 < 0) {
												return;
											}

											this.method5780(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
											var4 += var32;
											var5 += var31;
											var11 += var35;
											var2 += Rasterizer2D.Rasterizer2D_width;
											var41 += var43;
											var44 += var46;
											var47 += var49;
											var8 += var39;
										}
									}

									this.method5780(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var2, var5 >> 14, var6 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
									var6 += var30;
									var5 += var31;
									var11 += var35;
									var2 += Rasterizer2D.Rasterizer2D_width;
									var41 += var43;
									var44 += var46;
									var47 += var49;
									var8 += var39;
								}
							}
						}
					}
				} else if (var3 < var51) {
					if (var1 > var51) {
						var1 = var51;
					}

					if (var2 > var51) {
						var2 = var51;
					}

					var12 = (var12 << 9) - var34 * var6 + var34;
					var9 = var9 - var38 * (float)var6 + var38;
					if (var1 < var2) {
						var5 = var6 <<= 14;
						if (var3 < 0) {
							var5 -= var3 * var31;
							var6 -= var3 * var32;
							var12 -= var3 * var35;
							var9 -= var39 * (float)var3;
							var3 = 0;
						}

						var4 <<= 14;
						if (var1 < 0) {
							var4 -= var30 * var1;
							var1 = 0;
						}

						var52 = var3 - super.field2675.clipMidY;
						var41 += var43 * var52;
						var44 += var46 * var52;
						var47 += var49 * var52;
						if (var31 < var32) {
							var2 -= var1;
							var1 -= var3;
							var3 = var50[var3];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}

										this.method5780(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var3, var5 >> 14, var4 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
										var5 += var31;
										var4 += var30;
										var12 += var35;
										var3 += Rasterizer2D.Rasterizer2D_width;
										var41 += var43;
										var44 += var46;
										var47 += var49;
										var9 += var39;
									}
								}

								this.method5780(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
								var5 += var31;
								var6 += var32;
								var12 += var35;
								var3 += Rasterizer2D.Rasterizer2D_width;
								var41 += var43;
								var44 += var46;
								var47 += var49;
								var9 += var39;
							}
						} else {
							var2 -= var1;
							var1 -= var3;
							var3 = var50[var3];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}

										this.method5780(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var3, var4 >> 14, var5 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
										var5 += var31;
										var4 += var30;
										var12 += var35;
										var3 += Rasterizer2D.Rasterizer2D_width;
										var41 += var43;
										var44 += var46;
										var47 += var49;
										var9 += var39;
									}
								}

								this.method5780(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
								var5 += var31;
								var6 += var32;
								var12 += var35;
								var3 += Rasterizer2D.Rasterizer2D_width;
								var41 += var43;
								var44 += var46;
								var47 += var49;
								var9 += var39;
							}
						}
					} else {
						var4 = var6 <<= 14;
						if (var3 < 0) {
							var4 -= var3 * var31;
							var6 -= var3 * var32;
							var12 -= var3 * var35;
							var9 -= var39 * (float)var3;
							var3 = 0;
						}

						var5 <<= 14;
						if (var2 < 0) {
							var5 -= var30 * var2;
							var2 = 0;
						}

						var52 = var3 - super.field2675.clipMidY;
						var41 += var43 * var52;
						var44 += var46 * var52;
						var47 += var49 * var52;
						if (var31 < var32) {
							var1 -= var2;
							var2 -= var3;
							var3 = var50[var3];

							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										this.method5780(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
										var5 += var30;
										var6 += var32;
										var12 += var35;
										var3 += Rasterizer2D.Rasterizer2D_width;
										var41 += var43;
										var44 += var46;
										var47 += var49;
										var9 += var39;
									}
								}

								this.method5780(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var3, var4 >> 14, var6 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
								var4 += var31;
								var6 += var32;
								var12 += var35;
								var3 += Rasterizer2D.Rasterizer2D_width;
								var41 += var43;
								var44 += var46;
								var47 += var49;
								var9 += var39;
							}
						} else {
							var1 -= var2;
							var2 -= var3;
							var3 = var50[var3];

							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										this.method5780(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
										var5 += var30;
										var6 += var32;
										var12 += var35;
										var3 += Rasterizer2D.Rasterizer2D_width;
										var41 += var43;
										var44 += var46;
										var47 += var49;
										var9 += var39;
									}
								}

								this.method5780(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var3, var6 >> 14, var4 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
								var4 += var31;
								var6 += var32;
								var12 += var35;
								var3 += Rasterizer2D.Rasterizer2D_width;
								var41 += var43;
								var44 += var46;
								var47 += var49;
								var9 += var39;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ar")
	@Export("textureMapPolygons")
	void textureMapPolygons(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22) {
		int[] var23 = super.field2675.Rasterizer3D_textureLoader.getTexturePixels(var22);
		int var24;
		if (var23 == null) {
			var24 = super.field2675.Rasterizer3D_textureLoader.getAverageTextureRGB(var22);
			this.drawAlphaBlendedGraphics(var1, var2, var3, var4, var5, var6, var7, var8, var9, AbstractRasterizer.method5141(var24, var10), AbstractRasterizer.method5141(var24, var11), AbstractRasterizer.method5141(var24, var12));
		} else {
			super.field2669 = super.field2675.Rasterizer3D_textureLoader.isLowDetail(var22);
			super.field2672 = super.field2675.Rasterizer3D_textureLoader.vmethod5847(var22);
			var24 = var5 - var4;
			int var25 = var2 - var1;
			int var26 = var6 - var4;
			int var27 = var3 - var1;
			int var28 = var11 - var10;
			int var29 = var12 - var10;
			int var30 = 0;
			if (var2 != var1) {
				var30 = (var5 - var4 << 14) / (var2 - var1);
			}

			int var31 = 0;
			if (var3 != var2) {
				var31 = (var6 - var5 << 14) / (var3 - var2);
			}

			int var32 = 0;
			if (var3 != var1) {
				var32 = (var4 - var6 << 14) / (var1 - var3);
			}

			int var33 = var24 * var27 - var26 * var25;
			if (var33 != 0) {
				int var34 = (var28 * var27 - var29 * var25 << 9) / var33;
				int var35 = (var29 * var24 - var28 * var26 << 9) / var33;
				float var36 = var8 - var7;
				float var37 = var9 - var7;
				float var38 = (var36 * (float)var27 - var37 * (float)var25) / (float)var33;
				float var39 = (var37 * (float)var24 - var36 * (float)var26) / (float)var33;
				int var40 = super.field2675.zoom;
				var14 = var13 - var14;
				var17 = var16 - var17;
				var20 = var19 - var20;
				var15 -= var13;
				var18 -= var16;
				var21 -= var19;
				int var41 = var15 * var16 - var18 * var13 << 14;
				int var42 = (int)(((long)(var18 * var19 - var16 * var21) << 14) / (long)var40);
				int var43 = (int)(((long)(var13 * var21 - var19 * var15) << 14) / (long)var40);
				int var44 = var16 * var14 - var13 * var17 << 14;
				int var45 = (int)(((long)(var19 * var17 - var16 * var20) << 14) / (long)var40);
				int var46 = (int)(((long)(var13 * var20 - var19 * var14) << 14) / (long)var40);
				int var47 = var17 * var15 - var18 * var14 << 14;
				int var48 = (int)(((long)(var18 * var20 - var17 * var21) << 14) / (long)var40);
				int var49 = (int)(((long)(var21 * var14 - var15 * var20) << 14) / (long)var40);
				int[] var50 = super.field2675.Rasterizer3D_rowOffsets;
				int var51 = super.field2675.clipY;
				int var52;
				if (var1 <= var2 && var1 <= var3) {
					if (var1 < var51) {
						if (var2 > var51) {
							var2 = var51;
						}

						if (var3 > var51) {
							var3 = var51;
						}

						var10 = var34 + ((var10 << 9) - var34 * var4);
						var7 = var7 - var38 * (float)var4 + var38;
						if (var2 < var3) {
							var6 = var4 <<= 14;
							if (var1 < 0) {
								var6 -= var32 * var1;
								var4 -= var30 * var1;
								var7 -= var39 * (float)var1;
								var10 -= var35 * var1;
								var1 = 0;
							}

							var5 <<= 14;
							if (var2 < 0) {
								var5 -= var31 * var2;
								var2 = 0;
							}

							var52 = var1 - super.field2675.clipMidY;
							var41 += var43 * var52;
							var44 += var46 * var52;
							var47 += var49 * var52;
							if ((var2 == var1 || var32 >= var30) && (var2 != var1 || var32 <= var31)) {
								var3 -= var2;
								var2 -= var1;
								var1 = var50[var1];

								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var3;
											if (var3 < 0) {
												return;
											}

											this.method5833(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var1, var5 >> 14, var6 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
											var6 += var32;
											var5 += var31;
											var10 += var35;
											var1 += Rasterizer2D.Rasterizer2D_width;
											var41 += var43;
											var44 += var46;
											var47 += var49;
											var7 += var39;
										}
									}

									this.method5833(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
									var6 += var32;
									var4 += var30;
									var10 += var35;
									var1 += Rasterizer2D.Rasterizer2D_width;
									var41 += var43;
									var44 += var46;
									var47 += var49;
									var7 += var39;
								}
							} else {
								var3 -= var2;
								var2 -= var1;
								var1 = var50[var1];

								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var3;
											if (var3 < 0) {
												return;
											}

											this.method5833(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var1, var6 >> 14, var5 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
											var6 += var32;
											var5 += var31;
											var10 += var35;
											var1 += Rasterizer2D.Rasterizer2D_width;
											var41 += var43;
											var44 += var46;
											var47 += var49;
											var7 += var39;
										}
									}

									this.method5833(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
									var6 += var32;
									var4 += var30;
									var10 += var35;
									var1 += Rasterizer2D.Rasterizer2D_width;
									var41 += var43;
									var44 += var46;
									var47 += var49;
									var7 += var39;
								}
							}
						} else {
							var5 = var4 <<= 14;
							if (var1 < 0) {
								var5 -= var32 * var1;
								var4 -= var30 * var1;
								var7 -= var39 * (float)var1;
								var10 -= var35 * var1;
								var1 = 0;
							}

							var6 <<= 14;
							if (var3 < 0) {
								var6 -= var3 * var31;
								var3 = 0;
							}

							var52 = var1 - super.field2675.clipMidY;
							var41 += var43 * var52;
							var44 += var46 * var52;
							var47 += var49 * var52;
							if (var3 != var1 && var32 < var30 || var3 == var1 && var31 > var30) {
								var2 -= var3;
								var3 -= var1;
								var1 = var50[var1];

								while (true) {
									--var3;
									if (var3 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}

											this.method5833(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
											var6 += var31;
											var4 += var30;
											var10 += var35;
											var1 += Rasterizer2D.Rasterizer2D_width;
											var41 += var43;
											var44 += var46;
											var47 += var49;
											var7 += var39;
										}
									}

									this.method5833(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var1, var5 >> 14, var4 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
									var5 += var32;
									var4 += var30;
									var10 += var35;
									var1 += Rasterizer2D.Rasterizer2D_width;
									var41 += var43;
									var44 += var46;
									var47 += var49;
									var7 += var39;
								}
							} else {
								var2 -= var3;
								var3 -= var1;
								var1 = var50[var1];

								while (true) {
									--var3;
									if (var3 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}

											this.method5833(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
											var6 += var31;
											var4 += var30;
											var10 += var35;
											var1 += Rasterizer2D.Rasterizer2D_width;
											var41 += var43;
											var44 += var46;
											var47 += var49;
											var7 += var39;
										}
									}

									this.method5833(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var1, var4 >> 14, var5 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
									var5 += var32;
									var4 += var30;
									var10 += var35;
									var1 += Rasterizer2D.Rasterizer2D_width;
									var41 += var43;
									var44 += var46;
									var47 += var49;
									var7 += var39;
								}
							}
						}
					}
				} else if (var2 <= var3) {
					if (var2 < var51) {
						if (var3 > var51) {
							var3 = var51;
						}

						if (var1 > var51) {
							var1 = var51;
						}

						var11 = var34 + ((var11 << 9) - var5 * var34);
						var8 = var8 - var38 * (float)var5 + var38;
						if (var3 < var1) {
							var4 = var5 <<= 14;
							if (var2 < 0) {
								var4 -= var30 * var2;
								var5 -= var31 * var2;
								var8 -= var39 * (float)var2;
								var11 -= var35 * var2;
								var2 = 0;
							}

							var6 <<= 14;
							if (var3 < 0) {
								var6 -= var3 * var32;
								var3 = 0;
							}

							var52 = var2 - super.field2675.clipMidY;
							var41 += var43 * var52;
							var44 += var46 * var52;
							var47 += var49 * var52;
							if ((var3 == var2 || var30 >= var31) && (var3 != var2 || var30 <= var32)) {
								var1 -= var3;
								var3 -= var2;
								var2 = var50[var2];

								while (true) {
									--var3;
									if (var3 < 0) {
										while (true) {
											--var1;
											if (var1 < 0) {
												return;
											}

											this.method5833(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var2, var6 >> 14, var4 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
											var4 += var30;
											var6 += var32;
											var11 += var35;
											var2 += Rasterizer2D.Rasterizer2D_width;
											var41 += var43;
											var44 += var46;
											var47 += var49;
											var8 += var39;
										}
									}

									this.method5833(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
									var4 += var30;
									var5 += var31;
									var11 += var35;
									var2 += Rasterizer2D.Rasterizer2D_width;
									var41 += var43;
									var44 += var46;
									var47 += var49;
									var8 += var39;
								}
							} else {
								var1 -= var3;
								var3 -= var2;
								var2 = var50[var2];

								while (true) {
									--var3;
									if (var3 < 0) {
										while (true) {
											--var1;
											if (var1 < 0) {
												return;
											}

											this.method5833(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var2, var4 >> 14, var6 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
											var4 += var30;
											var6 += var32;
											var11 += var35;
											var2 += Rasterizer2D.Rasterizer2D_width;
											var41 += var43;
											var44 += var46;
											var47 += var49;
											var8 += var39;
										}
									}

									this.method5833(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
									var4 += var30;
									var5 += var31;
									var11 += var35;
									var2 += Rasterizer2D.Rasterizer2D_width;
									var41 += var43;
									var44 += var46;
									var47 += var49;
									var8 += var39;
								}
							}
						} else {
							var6 = var5 <<= 14;
							if (var2 < 0) {
								var6 -= var30 * var2;
								var5 -= var31 * var2;
								var8 -= var39 * (float)var2;
								var11 -= var35 * var2;
								var2 = 0;
							}

							var4 <<= 14;
							if (var1 < 0) {
								var4 -= var32 * var1;
								var1 = 0;
							}

							var52 = var2 - super.field2675.clipMidY;
							var41 += var43 * var52;
							var44 += var46 * var52;
							var47 += var49 * var52;
							if (var30 < var31) {
								var3 -= var1;
								var1 -= var2;
								var2 = var50[var2];

								while (true) {
									--var1;
									if (var1 < 0) {
										while (true) {
											--var3;
											if (var3 < 0) {
												return;
											}

											this.method5833(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
											var4 += var32;
											var5 += var31;
											var11 += var35;
											var2 += Rasterizer2D.Rasterizer2D_width;
											var41 += var43;
											var44 += var46;
											var47 += var49;
											var8 += var39;
										}
									}

									this.method5833(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var2, var6 >> 14, var5 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
									var6 += var30;
									var5 += var31;
									var11 += var35;
									var2 += Rasterizer2D.Rasterizer2D_width;
									var41 += var43;
									var44 += var46;
									var47 += var49;
									var8 += var39;
								}
							} else {
								var3 -= var1;
								var1 -= var2;
								var2 = var50[var2];

								while (true) {
									--var1;
									if (var1 < 0) {
										while (true) {
											--var3;
											if (var3 < 0) {
												return;
											}

											this.method5833(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
											var4 += var32;
											var5 += var31;
											var11 += var35;
											var2 += Rasterizer2D.Rasterizer2D_width;
											var41 += var43;
											var44 += var46;
											var47 += var49;
											var8 += var39;
										}
									}

									this.method5833(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var2, var5 >> 14, var6 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
									var6 += var30;
									var5 += var31;
									var11 += var35;
									var2 += Rasterizer2D.Rasterizer2D_width;
									var41 += var43;
									var44 += var46;
									var47 += var49;
									var8 += var39;
								}
							}
						}
					}
				} else if (var3 < var51) {
					if (var1 > var51) {
						var1 = var51;
					}

					if (var2 > var51) {
						var2 = var51;
					}

					var12 = (var12 << 9) - var34 * var6 + var34;
					var9 = var9 - var38 * (float)var6 + var38;
					if (var1 < var2) {
						var5 = var6 <<= 14;
						if (var3 < 0) {
							var5 -= var3 * var31;
							var6 -= var3 * var32;
							var9 -= var39 * (float)var3;
							var12 -= var3 * var35;
							var3 = 0;
						}

						var4 <<= 14;
						if (var1 < 0) {
							var4 -= var30 * var1;
							var1 = 0;
						}

						var52 = var3 - super.field2675.clipMidY;
						var41 += var43 * var52;
						var44 += var46 * var52;
						var47 += var49 * var52;
						if (var31 < var32) {
							var2 -= var1;
							var1 -= var3;
							var3 = var50[var3];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}

										this.method5833(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var3, var5 >> 14, var4 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
										var5 += var31;
										var4 += var30;
										var12 += var35;
										var3 += Rasterizer2D.Rasterizer2D_width;
										var41 += var43;
										var44 += var46;
										var47 += var49;
										var9 += var39;
									}
								}

								this.method5833(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
								var5 += var31;
								var6 += var32;
								var12 += var35;
								var3 += Rasterizer2D.Rasterizer2D_width;
								var41 += var43;
								var44 += var46;
								var47 += var49;
								var9 += var39;
							}
						} else {
							var2 -= var1;
							var1 -= var3;
							var3 = var50[var3];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}

										this.method5833(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var3, var4 >> 14, var5 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
										var5 += var31;
										var4 += var30;
										var12 += var35;
										var3 += Rasterizer2D.Rasterizer2D_width;
										var41 += var43;
										var44 += var46;
										var47 += var49;
										var9 += var39;
									}
								}

								this.method5833(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
								var5 += var31;
								var6 += var32;
								var12 += var35;
								var3 += Rasterizer2D.Rasterizer2D_width;
								var41 += var43;
								var44 += var46;
								var47 += var49;
								var9 += var39;
							}
						}
					} else {
						var4 = var6 <<= 14;
						if (var3 < 0) {
							var4 -= var3 * var31;
							var6 -= var3 * var32;
							var9 -= var39 * (float)var3;
							var12 -= var3 * var35;
							var3 = 0;
						}

						var5 <<= 14;
						if (var2 < 0) {
							var5 -= var30 * var2;
							var2 = 0;
						}

						var52 = var3 - super.field2675.clipMidY;
						var41 += var43 * var52;
						var44 += var46 * var52;
						var47 += var49 * var52;
						if (var31 < var32) {
							var1 -= var2;
							var2 -= var3;
							var3 = var50[var3];

							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										this.method5833(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
										var5 += var30;
										var6 += var32;
										var12 += var35;
										var3 += Rasterizer2D.Rasterizer2D_width;
										var41 += var43;
										var44 += var46;
										var47 += var49;
										var9 += var39;
									}
								}

								this.method5833(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var3, var4 >> 14, var6 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
								var4 += var31;
								var6 += var32;
								var12 += var35;
								var3 += Rasterizer2D.Rasterizer2D_width;
								var41 += var43;
								var44 += var46;
								var47 += var49;
								var9 += var39;
							}
						} else {
							var1 -= var2;
							var2 -= var3;
							var3 = var50[var3];

							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										this.method5833(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
										var5 += var30;
										var6 += var32;
										var12 += var35;
										var3 += Rasterizer2D.Rasterizer2D_width;
										var41 += var43;
										var44 += var46;
										var47 += var49;
										var9 += var39;
									}
								}

								this.method5833(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var3, var6 >> 14, var4 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
								var4 += var31;
								var6 += var32;
								var12 += var35;
								var3 += Rasterizer2D.Rasterizer2D_width;
								var41 += var43;
								var44 += var46;
								var47 += var49;
								var9 += var39;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("cy")
	final void method5773(int[] var1, float[] var2, int var3, int var4, float var5) {
		int var6 = varTwoIsGreaterAsOne(var2[var3], var5) ? 1 : 0;
		int var7 = 1 - var6;
		var1[var3] = var7 * var1[var3] + var6 * var4;
		var2[var3] = (float)var6 * var5 + (float)var7 * var2[var3];
	}

	@ObfuscatedName("ca")
	final void method5810(int[] var1, float[] var2, int var3, int var4, float var5) {
		if (varTwoIsGreaterAsOne(var2[var3], var5)) {
			int var6 = (var4 & (var4 >> 31 & 1) - 1) >> 8;
			var1[var3] = super.field2670[var6];
			var2[var3] = var5;
		}

	}

	@ObfuscatedName("cr")
	final void method5774(int[] var1, float[] var2, int var3, int var4, int var5, float var6) {
		if (varTwoIsGreaterAsOne(var2[var3], var6)) {
			int var7 = var1[var3];
			var1[var3] = ((var7 & 16711935) * var5 >> 8 & 16711935) + var4 + (var5 * (var7 & 65280) >> 8 & 65280);
		}

	}

	@ObfuscatedName("cu")
	final void method5830(int[] var1, float[] var2, int var3, int var4, int var5, int var6, float var7) {
		if (varTwoIsGreaterAsOne(var2[var3], var7)) {
			int var8 = (var4 & (var4 >> 31 & 1) - 1) >> 8;
			int var9 = super.field2670[var8];
			var9 = ((var9 & 65280) * var6 >> 8 & 65280) + ((var9 & 16711935) * var6 >> 8 & 16711935);
			int var10 = var1[var3];
			var1[var3] = var9 + ((var10 & 16711935) * var5 >> 8 & 16711935) + (var5 * (var10 & 65280) >> 8 & 65280);
		}

	}

	@ObfuscatedName("cd")
	final void method5776(int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, float var9, float var10) {
		if (super.field2675.clipping) {
			if (var6 > super.field2675.clipX) {
				var6 = super.field2675.clipX;
			}

			if (var5 < 0) {
				var5 = 0;
			}
		}

		if (var5 < var6) {
			var2 += var5;
			var7 += var5 * var8;
			var9 += var10 * (float)var5;
			int var11;
			int var12;
			if (super.field2675.rasterGouraudLowRes) {
				var4 = var6 - var5 >> 2;
				var8 <<= 2;
				if (super.field2675.currentFaceAlpha == 0) {
					if (var4 > 0) {
						do {
							var11 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
							var3 = super.field2670[var11];
							var7 += var8;
							this.method5773(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var3, var9);
							var9 += var10;
							++var2;
							this.method5773(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var3, var9);
							var9 += var10;
							++var2;
							this.method5773(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var3, var9);
							var9 += var10;
							++var2;
							this.method5773(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var3, var9);
							var9 += var10;
							++var2;
							--var4;
						} while(var4 > 0);
					}

					var4 = var6 - var5 & 3;
					if (var4 > 0) {
						var11 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
						var3 = super.field2670[var11];

						do {
							this.method5773(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var3, var9);
							var9 += var10;
							++var2;
							--var4;
						} while(var4 > 0);
					}
				} else {
					var11 = super.field2675.currentFaceAlpha;
					var12 = 256 - super.field2675.currentFaceAlpha;
					int var13;
					if (var4 > 0) {
						do {
							var13 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
							var3 = super.field2670[var13];
							var7 += var8;
							var3 = ((var3 & 16711935) * var12 >> 8 & 16711935) + (var12 * (var3 & 65280) >> 8 & 65280);
							this.method5774(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var3, var11, var9);
							++var2;
							var9 += var10;
							this.method5774(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var3, var11, var9);
							++var2;
							var9 += var10;
							this.method5774(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var3, var11, var9);
							++var2;
							var9 += var10;
							this.method5774(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var3, var11, var9);
							++var2;
							var9 += var10;
							--var4;
						} while(var4 > 0);
					}

					var4 = var6 - var5 & 3;
					if (var4 > 0) {
						var13 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
						var3 = super.field2670[var13];
						var3 = ((var3 & 16711935) * var12 >> 8 & 16711935) + (var12 * (var3 & 65280) >> 8 & 65280);

						do {
							this.method5774(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var3, var11, var9);
							++var2;
							var9 += var10;
							--var4;
						} while(var4 > 0);
					}
				}

			} else {
				var4 = var6 - var5;
				if (super.field2675.currentFaceAlpha == 0) {
					do {
						this.method5810(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var7, var9);
						var9 += var10;
						++var2;
						var7 += var8;
						--var4;
					} while(var4 > 0);
				} else {
					var11 = super.field2675.currentFaceAlpha;
					var12 = 256 - super.field2675.currentFaceAlpha;

					do {
						this.method5830(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var3, var11, var12, var9);
						var9 += var10;
						++var2;
						var7 += var8;
						--var4;
					} while(var4 > 0);
				}

			}
		}
	}

	@ObfuscatedName("cl")
	@Export("copyPixelsWithAlphaBlending")
	final void copyPixelsWithAlphaBlending(int[] var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8) {
		if (super.field2675.clipping) {
			if (var6 > super.field2675.clipX) {
				var6 = super.field2675.clipX;
			}

			if (var5 < 0) {
				var5 = 0;
			}
		}

		if (var5 < var6) {
			var2 += var5;
			var4 = var6 - var5 >> 2;
			var7 += var8 * (float)var5;
			if (super.field2675.currentFaceAlpha != 0) {
				if (super.field2675.currentFaceAlpha == 254) {
					while (true) {
						--var4;
						if (var4 < 0) {
							var4 = var6 - var5 & 3;

							while (true) {
								--var4;
								if (var4 < 0) {
									return;
								}

								var1[var2++] = var1[var2];
							}
						}

						var1[var2++] = var1[var2];
						var1[var2++] = var1[var2];
						var1[var2++] = var1[var2];
						var1[var2++] = var1[var2];
					}
				} else {
					int var9 = super.field2675.currentFaceAlpha;
					int var10 = 256 - super.field2675.currentFaceAlpha;
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

								this.method5774(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var3, var9, var7);
								++var2;
								var7 += var8;
							}
						}

						this.method5774(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var3, var9, var7);
						++var2;
						var7 += var8;
						this.method5774(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var3, var9, var7);
						++var2;
						var7 += var8;
						this.method5774(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var3, var9, var7);
						++var2;
						var7 += var8;
						this.method5774(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var3, var9, var7);
						++var2;
						var7 += var8;
					}
				}
			} else {
				while (true) {
					--var4;
					if (var4 < 0) {
						var4 = var6 - var5 & 3;

						while (true) {
							--var4;
							if (var4 < 0) {
								return;
							}

							this.method5773(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var3, var7);
							var7 += var8;
							++var2;
						}
					}

					this.method5773(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var3, var7);
					var7 += var8;
					++var2;
					this.method5773(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var3, var7);
					var7 += var8;
					++var2;
					this.method5773(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var3, var7);
					var7 += var8;
					++var2;
					this.method5773(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var3, var7);
					var7 += var8;
					++var2;
				}
			}
		}
	}

	@ObfuscatedName("cq")
	final void method5780(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, float var10, float var11, int var12, int var13, int var14, int var15, int var16, int var17) {
		if (super.field2675.clipping) {
			if (var7 > super.field2675.clipX) {
				var7 = super.field2675.clipX;
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
			int var10000;
			int var18;
			int var19;
			int var21;
			int var22;
			int var23;
			int var24;
			int var25;
			int var26;
			if (super.field2669) {
				var26 = var6 - super.field2675.clipMidX;
				var12 += (var15 >> 3) * var26;
				var13 += var26 * (var16 >> 3);
				var14 += var26 * (var17 >> 3);
				var25 = var14 >> 12;
				if (var25 != 0) {
					var21 = var12 / var25;
					var22 = var13 / var25;
					if (var21 < 0) {
						var21 = 0;
					} else if (var21 > 4032) {
						var21 = 4032;
					}
				} else {
					var21 = 0;
					var22 = 0;
				}

				var12 += var15;
				var13 += var16;
				var14 += var17;
				var25 = var14 >> 12;
				if (var25 != 0) {
					var23 = var12 / var25;
					var24 = var13 / var25;
					if (var23 < 0) {
						var23 = 0;
					} else if (var23 > 4032) {
						var23 = 4032;
					}
				} else {
					var23 = 0;
					var24 = 0;
				}

				var3 = (var21 << 20) + var22;
				var19 = (var24 - var22 >> 3) + (var23 - var21 >> 3 << 20);
				var20 >>= 3;
				var9 <<= 3;
				var18 = var8 >> 8;
				if (super.field2672) {
					if (var20 > 0) {
						do {
							blendColors(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							blendColors(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							blendColors(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							blendColors(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							blendColors(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							blendColors(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							blendColors(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							blendColors(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var10000 = var3 + var19;
							var10 += var11;
							var21 = var23;
							var22 = var24;
							var12 += var15;
							var13 += var16;
							var14 += var17;
							var25 = var14 >> 12;
							if (var25 != 0) {
								var23 = var12 / var25;
								var24 = var13 / var25;
								if (var23 < 0) {
									var23 = 0;
								} else if (var23 > 4032) {
									var23 = 4032;
								}
							} else {
								var23 = 0;
								var24 = 0;
							}

							var3 = (var21 << 20) + var22;
							var19 = (var24 - var22 >> 3) + (var23 - var21 >> 3 << 20);
							var8 += var9;
							var18 = var8 >> 8;
							--var20;
						} while(var20 > 0);
					}

					var20 = var7 - var6 & 7;
					if (var20 > 0) {
						do {
							blendColors(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							--var20;
						} while(var20 > 0);
					}
				} else {
					if (var20 > 0) {
						do {
							updatePixelColorBasedOnOpacity(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							updatePixelColorBasedOnOpacity(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							updatePixelColorBasedOnOpacity(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							updatePixelColorBasedOnOpacity(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							updatePixelColorBasedOnOpacity(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							updatePixelColorBasedOnOpacity(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							updatePixelColorBasedOnOpacity(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							updatePixelColorBasedOnOpacity(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var10000 = var3 + var19;
							var10 += var11;
							var21 = var23;
							var22 = var24;
							var12 += var15;
							var13 += var16;
							var14 += var17;
							var25 = var14 >> 12;
							if (var25 != 0) {
								var23 = var12 / var25;
								var24 = var13 / var25;
								if (var23 < 0) {
									var23 = 0;
								} else if (var23 > 4032) {
									var23 = 4032;
								}
							} else {
								var23 = 0;
								var24 = 0;
							}

							var3 = (var21 << 20) + var22;
							var19 = (var24 - var22 >> 3) + (var23 - var21 >> 3 << 20);
							var8 += var9;
							var18 = var8 >> 8;
							--var20;
						} while(var20 > 0);
					}

					var20 = var7 - var6 & 7;
					if (var20 > 0) {
						do {
							updatePixelColorBasedOnOpacity(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							--var20;
						} while(var20 > 0);
					}
				}
			} else {
				var26 = var6 - super.field2675.clipMidX;
				var12 += (var15 >> 3) * var26;
				var13 += var26 * (var16 >> 3);
				var14 += var26 * (var17 >> 3);
				var25 = var14 >> 14;
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
				var20 >>= 3;
				var9 <<= 3;
				var18 = var8 >> 8;
				if (super.field2672) {
					if (var20 > 0) {
						do {
							applyColorFilterWithOpacity(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							applyColorFilterWithOpacity(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							applyColorFilterWithOpacity(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							applyColorFilterWithOpacity(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							applyColorFilterWithOpacity(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							applyColorFilterWithOpacity(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							applyColorFilterWithOpacity(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							applyColorFilterWithOpacity(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
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
							--var20;
						} while(var20 > 0);
					}

					var20 = var7 - var6 & 7;
					if (var20 > 0) {
						do {
							applyColorFilterWithOpacity(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							--var20;
						} while(var20 > 0);
					}
				} else {
					if (var20 > 0) {
						do {
							applyColorFilter(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							applyColorFilter(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							applyColorFilter(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							applyColorFilter(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							applyColorFilter(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							applyColorFilter(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							applyColorFilter(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							applyColorFilter(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
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
							--var20;
						} while(var20 > 0);
					}

					var20 = var7 - var6 & 7;
					if (var20 > 0) {
						do {
							applyColorFilter(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							--var20;
						} while(var20 > 0);
					}
				}
			}

		}
	}

	@ObfuscatedName("ci")
	final void method5833(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, float var10, float var11, int var12, int var13, int var14, int var15, int var16, int var17) {
		if (super.field2675.clipping) {
			if (var7 > super.field2675.clipX) {
				var7 = super.field2675.clipX;
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
			int var18;
			int var19;
			int var21;
			int var22;
			int var23;
			int var24;
			int var25;
			int var26;
			if (super.field2669) {
				var26 = var6 - super.field2675.clipMidX;
				var12 += var26 * var15;
				var13 += var26 * var16;
				var14 += var17 * var26;
				var25 = var14 >> 12;
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
				var25 = var14 >> 12;
				if (var25 != 0) {
					var23 = var12 / var25;
					var24 = var13 / var25;
				} else {
					var23 = 0;
					var24 = 0;
				}

				var3 = (var21 << 20) + var22;
				var19 = (var24 - var22) / var20 + ((var23 - var21) / var20 << 20);
				var20 >>= 3;
				var9 <<= 3;
				var18 = var8 >> 8;
				if (super.field2672) {
					if (var20 > 0) {
						do {
							blendColors(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							blendColors(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							blendColors(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							blendColors(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							blendColors(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							blendColors(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							blendColors(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							blendColors(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							var8 += var9;
							var18 = var8 >> 8;
							--var20;
						} while(var20 > 0);
					}

					var20 = var7 - var6 & 7;
					if (var20 > 0) {
						do {
							blendColors(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							--var20;
						} while(var20 > 0);
					}
				} else {
					if (var20 > 0) {
						do {
							updatePixelColorBasedOnOpacity(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							updatePixelColorBasedOnOpacity(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							updatePixelColorBasedOnOpacity(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							updatePixelColorBasedOnOpacity(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							updatePixelColorBasedOnOpacity(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							updatePixelColorBasedOnOpacity(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							updatePixelColorBasedOnOpacity(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							updatePixelColorBasedOnOpacity(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							var8 += var9;
							var18 = var8 >> 8;
							--var20;
						} while(var20 > 0);
					}

					var20 = var7 - var6 & 7;
					if (var20 > 0) {
						do {
							updatePixelColorBasedOnOpacity(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							--var20;
						} while(var20 > 0);
					}
				}
			} else {
				var26 = var6 - super.field2675.clipMidX;
				var12 += var26 * var15;
				var13 += var26 * var16;
				var14 += var17 * var26;
				var25 = var14 >> 14;
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
				if (var25 != 0) {
					var23 = var12 / var25;
					var24 = var13 / var25;
				} else {
					var23 = 0;
					var24 = 0;
				}

				var3 = (var21 << 18) + var22;
				var19 = (var24 - var22) / var20 + ((var23 - var21) / var20 << 18);
				var20 >>= 3;
				var9 <<= 3;
				var18 = var8 >> 8;
				if (super.field2672) {
					if (var20 > 0) {
						do {
							applyColorFilterWithOpacity(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							applyColorFilterWithOpacity(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							applyColorFilterWithOpacity(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							applyColorFilterWithOpacity(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							applyColorFilterWithOpacity(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							applyColorFilterWithOpacity(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							applyColorFilterWithOpacity(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							applyColorFilterWithOpacity(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							var8 += var9;
							var18 = var8 >> 8;
							--var20;
						} while(var20 > 0);
					}

					var20 = var7 - var6 & 7;
					if (var20 > 0) {
						do {
							applyColorFilterWithOpacity(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							--var20;
						} while(var20 > 0);
					}
				} else {
					if (var20 > 0) {
						do {
							applyColorFilter(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							applyColorFilter(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							applyColorFilter(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							applyColorFilter(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							applyColorFilter(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							applyColorFilter(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							applyColorFilter(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							applyColorFilter(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							var8 += var9;
							var18 = var8 >> 8;
							--var20;
						} while(var20 > 0);
					}

					var20 = var7 - var6 & 7;
					if (var20 > 0) {
						do {
							applyColorFilter(var1, Rasterizer2D.Rasterizer2D_brightness, var2, var5, var18, var3, var10);
							++var5;
							var3 += var19;
							var10 += var11;
							--var20;
						} while(var20 > 0);
					}
				}
			}

		}
	}

	@ObfuscatedName("br")
	@Export("varTwoIsGreaterAsOne")
	static final boolean varTwoIsGreaterAsOne(float var0, float var1) {
		return var1 > var0;
	}

	@ObfuscatedName("bk")
	@Export("blendColors")
	static final void blendColors(int[] var0, float[] var1, int[] var2, int var3, int var4, int var5, float var6) {
		if (varTwoIsGreaterAsOne(var1[var3], var6)) {
			int var7 = var2[(var5 & 4032) + (var5 >>> 26)];
			var0[var3] = (var4 * (var7 & 65280) & 16711680) + ((var7 & 16711935) * var4 & -16711936) >> 8;
			var1[var3] = var6;
		}

	}

	@ObfuscatedName("bh")
	@Export("updatePixelColorBasedOnOpacity")
	static final void updatePixelColorBasedOnOpacity(int[] var0, float[] var1, int[] var2, int var3, int var4, int var5, float var6) {
		int var7 = var2[(var5 & 4032) + (var5 >>> 26)];
		if (var7 != 0) {
			if (varTwoIsGreaterAsOne(var1[var3], var6)) {
				var0[var3] = (var4 * (var7 & 65280) & 16711680) + ((var7 & 16711935) * var4 & -16711936) >> 8;
				var1[var3] = var6;
			}

		}
	}

	@ObfuscatedName("bp")
	@Export("applyColorFilterWithOpacity")
	static final void applyColorFilterWithOpacity(int[] var0, float[] var1, int[] var2, int var3, int var4, int var5, float var6) {
		if (varTwoIsGreaterAsOne(var1[var3], var6)) {
			int var7 = var2[(var5 >>> 25) + (var5 & 16256)];
			var0[var3] = (var4 * (var7 & 65280) & 16711680) + ((var7 & 16711935) * var4 & -16711936) >> 8;
			var1[var3] = var6;
		}

	}

	@ObfuscatedName("ck")
	@Export("applyColorFilter")
	static final void applyColorFilter(int[] var0, float[] var1, int[] var2, int var3, int var4, int var5, float var6) {
		int var7 = var2[(var5 >>> 25) + (var5 & 16256)];
		if (var7 != 0) {
			if (varTwoIsGreaterAsOne(var1[var3], var6)) {
				var0[var3] = (var4 * (var7 & 65280) & 16711680) + ((var7 & 16711935) * var4 & -16711936) >> 8;
				var1[var3] = var6;
			}

		}
	}
}
