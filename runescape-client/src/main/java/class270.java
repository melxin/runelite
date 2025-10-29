import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kp")
public class class270 extends AbstractRasterizer {
	@ObfuscatedSignature(
		descriptor = "(Lkt;)V"
	)
	class270(Clips var1) {
		super(var1);
	}

	@ObfuscatedName("aj")
	boolean vmethod6185() {
		return false;
	}

	@ObfuscatedName("ay")
	@Export("drawAlphaBlendedGraphics")
	void drawAlphaBlendedGraphics(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12) {
		int var13 = (int)var4;
		int var14 = (int)var5;
		int var15 = (int)var6;
		int var16 = (int)var1;
		int var17 = (int)var2;
		int var18 = (int)var3;
		int var19 = var14 - var13;
		int var20 = var17 - var16;
		int var21 = var15 - var13;
		int var22 = var18 - var16;
		int var23 = var11 - var10;
		int var24 = var12 - var10;
		int var25;
		if (var18 != var17) {
			var25 = (var15 - var14 << 14) / (var18 - var17);
		} else {
			var25 = 0;
		}

		int var26;
		if (var17 != var16) {
			var26 = (var19 << 14) / var20;
		} else {
			var26 = 0;
		}

		int var27;
		if (var18 != var16) {
			var27 = (var21 << 14) / var22;
		} else {
			var27 = 0;
		}

		int var28 = var19 * var22 - var21 * var20;
		if (var28 != 0) {
			int var29 = (var23 * var22 - var24 * var20 << 8) / var28;
			int var30 = (var24 * var19 - var23 * var21 << 8) / var28;
			int[] var31 = super.field2828.Rasterizer3D_rowOffsets;
			int var32 = super.field2828.clipY;
			if (var16 <= var17 && var16 <= var18) {
				if (var16 < var32) {
					if (var17 > var32) {
						var17 = var32;
					}

					if (var18 > var32) {
						var18 = var32;
					}

					var10 = var29 + ((var10 << 8) - var29 * var13);
					if (var17 < var18) {
						var15 = var13 <<= 14;
						if (var16 < 0) {
							var15 -= var27 * var16;
							var13 -= var26 * var16;
							var10 -= var30 * var16;
							var16 = 0;
						}

						var14 <<= 14;
						if (var17 < 0) {
							var14 -= var25 * var17;
							var17 = 0;
						}

						if (var16 != var17 && var27 < var26 || var16 == var17 && var27 > var25) {
							var18 -= var17;
							var17 -= var16;
							var16 = var31[var16];

							while (true) {
								--var17;
								if (var17 < 0) {
									while (true) {
										--var18;
										if (var18 < 0) {
											return;
										}

										this.Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var16, 0, 0, var15 >> 14, var14 >> 14, var10, var29);
										var15 += var27;
										var14 += var25;
										var10 += var30;
										var16 += Rasterizer2D.Rasterizer2D_width;
									}
								}

								this.Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var16, 0, 0, var15 >> 14, var13 >> 14, var10, var29);
								var15 += var27;
								var13 += var26;
								var10 += var30;
								var16 += Rasterizer2D.Rasterizer2D_width;
							}
						} else {
							var18 -= var17;
							var17 -= var16;
							var16 = var31[var16];

							while (true) {
								--var17;
								if (var17 < 0) {
									while (true) {
										--var18;
										if (var18 < 0) {
											return;
										}

										this.Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var16, 0, 0, var14 >> 14, var15 >> 14, var10, var29);
										var15 += var27;
										var14 += var25;
										var10 += var30;
										var16 += Rasterizer2D.Rasterizer2D_width;
									}
								}

								this.Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var16, 0, 0, var13 >> 14, var15 >> 14, var10, var29);
								var15 += var27;
								var13 += var26;
								var10 += var30;
								var16 += Rasterizer2D.Rasterizer2D_width;
							}
						}
					} else {
						var14 = var13 <<= 14;
						if (var16 < 0) {
							var14 -= var27 * var16;
							var13 -= var26 * var16;
							var10 -= var30 * var16;
							var16 = 0;
						}

						var15 <<= 14;
						if (var18 < 0) {
							var15 -= var25 * var18;
							var18 = 0;
						}

						if (var16 != var18 && var27 < var26 || var16 == var18 && var25 > var26) {
							var17 -= var18;
							var18 -= var16;
							var16 = var31[var16];

							while (true) {
								--var18;
								if (var18 < 0) {
									while (true) {
										--var17;
										if (var17 < 0) {
											return;
										}

										this.Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var16, 0, 0, var15 >> 14, var13 >> 14, var10, var29);
										var15 += var25;
										var13 += var26;
										var10 += var30;
										var16 += Rasterizer2D.Rasterizer2D_width;
									}
								}

								this.Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var16, 0, 0, var14 >> 14, var13 >> 14, var10, var29);
								var14 += var27;
								var13 += var26;
								var10 += var30;
								var16 += Rasterizer2D.Rasterizer2D_width;
							}
						} else {
							var17 -= var18;
							var18 -= var16;
							var16 = var31[var16];

							while (true) {
								--var18;
								if (var18 < 0) {
									while (true) {
										--var17;
										if (var17 < 0) {
											return;
										}

										this.Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var16, 0, 0, var13 >> 14, var15 >> 14, var10, var29);
										var15 += var25;
										var13 += var26;
										var10 += var30;
										var16 += Rasterizer2D.Rasterizer2D_width;
									}
								}

								this.Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var16, 0, 0, var13 >> 14, var14 >> 14, var10, var29);
								var14 += var27;
								var13 += var26;
								var10 += var30;
								var16 += Rasterizer2D.Rasterizer2D_width;
							}
						}
					}
				}
			} else if (var17 <= var18) {
				if (var17 < var32) {
					if (var18 > var32) {
						var18 = var32;
					}

					if (var16 > var32) {
						var16 = var32;
					}

					var11 = (var11 << 8) - var29 * var14 + var29;
					if (var18 < var16) {
						var13 = var14 <<= 14;
						if (var17 < 0) {
							var13 -= var26 * var17;
							var14 -= var25 * var17;
							var11 -= var30 * var17;
							var17 = 0;
						}

						var15 <<= 14;
						if (var18 < 0) {
							var15 -= var27 * var18;
							var18 = 0;
						}

						if (var17 != var18 && var26 < var25 || var17 == var18 && var26 > var27) {
							var16 -= var18;
							var18 -= var17;
							var17 = var31[var17];

							while (true) {
								--var18;
								if (var18 < 0) {
									while (true) {
										--var16;
										if (var16 < 0) {
											return;
										}

										this.Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var17, 0, 0, var13 >> 14, var15 >> 14, var11, var29);
										var13 += var26;
										var15 += var27;
										var11 += var30;
										var17 += Rasterizer2D.Rasterizer2D_width;
									}
								}

								this.Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var17, 0, 0, var13 >> 14, var14 >> 14, var11, var29);
								var13 += var26;
								var14 += var25;
								var11 += var30;
								var17 += Rasterizer2D.Rasterizer2D_width;
							}
						} else {
							var16 -= var18;
							var18 -= var17;
							var17 = var31[var17];

							while (true) {
								--var18;
								if (var18 < 0) {
									while (true) {
										--var16;
										if (var16 < 0) {
											return;
										}

										this.Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var17, 0, 0, var15 >> 14, var13 >> 14, var11, var29);
										var13 += var26;
										var15 += var27;
										var11 += var30;
										var17 += Rasterizer2D.Rasterizer2D_width;
									}
								}

								this.Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var17, 0, 0, var14 >> 14, var13 >> 14, var11, var29);
								var13 += var26;
								var14 += var25;
								var11 += var30;
								var17 += Rasterizer2D.Rasterizer2D_width;
							}
						}
					} else {
						var15 = var14 <<= 14;
						if (var17 < 0) {
							var15 -= var26 * var17;
							var14 -= var25 * var17;
							var11 -= var30 * var17;
							var17 = 0;
						}

						var13 <<= 14;
						if (var16 < 0) {
							var13 -= var27 * var16;
							var16 = 0;
						}

						if (var26 < var25) {
							var18 -= var16;
							var16 -= var17;
							var17 = var31[var17];

							while (true) {
								--var16;
								if (var16 < 0) {
									while (true) {
										--var18;
										if (var18 < 0) {
											return;
										}

										this.Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var17, 0, 0, var13 >> 14, var14 >> 14, var11, var29);
										var13 += var27;
										var14 += var25;
										var11 += var30;
										var17 += Rasterizer2D.Rasterizer2D_width;
									}
								}

								this.Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var17, 0, 0, var15 >> 14, var14 >> 14, var11, var29);
								var15 += var26;
								var14 += var25;
								var11 += var30;
								var17 += Rasterizer2D.Rasterizer2D_width;
							}
						} else {
							var18 -= var16;
							var16 -= var17;
							var17 = var31[var17];

							while (true) {
								--var16;
								if (var16 < 0) {
									while (true) {
										--var18;
										if (var18 < 0) {
											return;
										}

										this.Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var17, 0, 0, var14 >> 14, var13 >> 14, var11, var29);
										var13 += var27;
										var14 += var25;
										var11 += var30;
										var17 += Rasterizer2D.Rasterizer2D_width;
									}
								}

								this.Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var17, 0, 0, var14 >> 14, var15 >> 14, var11, var29);
								var15 += var26;
								var14 += var25;
								var11 += var30;
								var17 += Rasterizer2D.Rasterizer2D_width;
							}
						}
					}
				}
			} else if (var18 < var32) {
				if (var16 > var32) {
					var16 = var32;
				}

				if (var17 > var32) {
					var17 = var32;
				}

				var12 = var29 + ((var12 << 8) - var29 * var15);
				if (var16 < var17) {
					var14 = var15 <<= 14;
					if (var18 < 0) {
						var14 -= var25 * var18;
						var15 -= var27 * var18;
						var12 -= var30 * var18;
						var18 = 0;
					}

					var13 <<= 14;
					if (var16 < 0) {
						var13 -= var26 * var16;
						var16 = 0;
					}

					if (var25 < var27) {
						var17 -= var16;
						var16 -= var18;
						var18 = var31[var18];

						while (true) {
							--var16;
							if (var16 < 0) {
								while (true) {
									--var17;
									if (var17 < 0) {
										return;
									}

									this.Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var18, 0, 0, var14 >> 14, var13 >> 14, var12, var29);
									var14 += var25;
									var13 += var26;
									var12 += var30;
									var18 += Rasterizer2D.Rasterizer2D_width;
								}
							}

							this.Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var18, 0, 0, var14 >> 14, var15 >> 14, var12, var29);
							var14 += var25;
							var15 += var27;
							var12 += var30;
							var18 += Rasterizer2D.Rasterizer2D_width;
						}
					} else {
						var17 -= var16;
						var16 -= var18;
						var18 = var31[var18];

						while (true) {
							--var16;
							if (var16 < 0) {
								while (true) {
									--var17;
									if (var17 < 0) {
										return;
									}

									this.Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var18, 0, 0, var13 >> 14, var14 >> 14, var12, var29);
									var14 += var25;
									var13 += var26;
									var12 += var30;
									var18 += Rasterizer2D.Rasterizer2D_width;
								}
							}

							this.Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var18, 0, 0, var15 >> 14, var14 >> 14, var12, var29);
							var14 += var25;
							var15 += var27;
							var12 += var30;
							var18 += Rasterizer2D.Rasterizer2D_width;
						}
					}
				} else {
					var13 = var15 <<= 14;
					if (var18 < 0) {
						var13 -= var25 * var18;
						var15 -= var27 * var18;
						var12 -= var30 * var18;
						var18 = 0;
					}

					var14 <<= 14;
					if (var17 < 0) {
						var14 -= var26 * var17;
						var17 = 0;
					}

					if (var25 < var27) {
						var16 -= var17;
						var17 -= var18;
						var18 = var31[var18];

						while (true) {
							--var17;
							if (var17 < 0) {
								while (true) {
									--var16;
									if (var16 < 0) {
										return;
									}

									this.Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var18, 0, 0, var14 >> 14, var15 >> 14, var12, var29);
									var14 += var26;
									var15 += var27;
									var12 += var30;
									var18 += Rasterizer2D.Rasterizer2D_width;
								}
							}

							this.Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var18, 0, 0, var13 >> 14, var15 >> 14, var12, var29);
							var13 += var25;
							var15 += var27;
							var12 += var30;
							var18 += Rasterizer2D.Rasterizer2D_width;
						}
					} else {
						var16 -= var17;
						var17 -= var18;
						var18 = var31[var18];

						while (true) {
							--var17;
							if (var17 < 0) {
								while (true) {
									--var16;
									if (var16 < 0) {
										return;
									}

									this.Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var18, 0, 0, var15 >> 14, var14 >> 14, var12, var29);
									var14 += var26;
									var15 += var27;
									var12 += var30;
									var18 += Rasterizer2D.Rasterizer2D_width;
								}
							}

							this.Rasterizer3D_vertAlpha(Rasterizer2D.Rasterizer2D_pixels, var18, 0, 0, var15 >> 14, var13 >> 14, var12, var29);
							var13 += var25;
							var15 += var27;
							var12 += var30;
							var18 += Rasterizer2D.Rasterizer2D_width;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("au")
	void vmethod6189(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10) {
		int var11 = (int)var4;
		int var12 = (int)var5;
		int var13 = (int)var6;
		int var14 = (int)var1;
		int var15 = (int)var2;
		int var16 = (int)var3;
		int var17 = 0;
		if (var15 != var14) {
			var17 = (var12 - var11 << 14) / (var15 - var14);
		}

		int var18 = 0;
		if (var16 != var15) {
			var18 = (var13 - var12 << 14) / (var16 - var15);
		}

		int var19 = 0;
		if (var16 != var14) {
			var19 = (var11 - var13 << 14) / (var14 - var16);
		}

		int[] var20 = super.field2828.Rasterizer3D_rowOffsets;
		int var21 = super.field2828.clipY;
		if (var14 <= var15 && var14 <= var16) {
			if (var14 < var21) {
				if (var15 > var21) {
					var15 = var21;
				}

				if (var16 > var21) {
					var16 = var21;
				}

				if (var15 < var16) {
					var13 = var11 <<= 14;
					if (var14 < 0) {
						var13 -= var19 * var14;
						var11 -= var17 * var14;
						var14 = 0;
					}

					var12 <<= 14;
					if (var15 < 0) {
						var12 -= var18 * var15;
						var15 = 0;
					}

					if (var14 != var15 && var19 < var17 || var14 == var15 && var19 > var18) {
						var16 -= var15;
						var15 -= var14;
						var14 = var20[var14];

						while (true) {
							--var15;
							if (var15 < 0) {
								while (true) {
									--var16;
									if (var16 < 0) {
										return;
									}

									this.applyColorFilterToPixelsInRange(Rasterizer2D.Rasterizer2D_pixels, var14, var10, 0, var13 >> 14, var12 >> 14);
									var13 += var19;
									var12 += var18;
									var14 += Rasterizer2D.Rasterizer2D_width;
								}
							}

							this.applyColorFilterToPixelsInRange(Rasterizer2D.Rasterizer2D_pixels, var14, var10, 0, var13 >> 14, var11 >> 14);
							var13 += var19;
							var11 += var17;
							var14 += Rasterizer2D.Rasterizer2D_width;
						}
					} else {
						var16 -= var15;
						var15 -= var14;
						var14 = var20[var14];

						while (true) {
							--var15;
							if (var15 < 0) {
								while (true) {
									--var16;
									if (var16 < 0) {
										return;
									}

									this.applyColorFilterToPixelsInRange(Rasterizer2D.Rasterizer2D_pixels, var14, var10, 0, var12 >> 14, var13 >> 14);
									var13 += var19;
									var12 += var18;
									var14 += Rasterizer2D.Rasterizer2D_width;
								}
							}

							this.applyColorFilterToPixelsInRange(Rasterizer2D.Rasterizer2D_pixels, var14, var10, 0, var11 >> 14, var13 >> 14);
							var13 += var19;
							var11 += var17;
							var14 += Rasterizer2D.Rasterizer2D_width;
						}
					}
				} else {
					var12 = var11 <<= 14;
					if (var14 < 0) {
						var12 -= var19 * var14;
						var11 -= var17 * var14;
						var14 = 0;
					}

					var13 <<= 14;
					if (var16 < 0) {
						var13 -= var18 * var16;
						var16 = 0;
					}

					if ((var14 == var16 || var19 >= var17) && (var14 != var16 || var18 <= var17)) {
						var15 -= var16;
						var16 -= var14;
						var14 = var20[var14];

						while (true) {
							--var16;
							if (var16 < 0) {
								while (true) {
									--var15;
									if (var15 < 0) {
										return;
									}

									this.applyColorFilterToPixelsInRange(Rasterizer2D.Rasterizer2D_pixels, var14, var10, 0, var11 >> 14, var13 >> 14);
									var13 += var18;
									var11 += var17;
									var14 += Rasterizer2D.Rasterizer2D_width;
								}
							}

							this.applyColorFilterToPixelsInRange(Rasterizer2D.Rasterizer2D_pixels, var14, var10, 0, var11 >> 14, var12 >> 14);
							var12 += var19;
							var11 += var17;
							var14 += Rasterizer2D.Rasterizer2D_width;
						}
					} else {
						var15 -= var16;
						var16 -= var14;
						var14 = var20[var14];

						while (true) {
							--var16;
							if (var16 < 0) {
								while (true) {
									--var15;
									if (var15 < 0) {
										return;
									}

									this.applyColorFilterToPixelsInRange(Rasterizer2D.Rasterizer2D_pixels, var14, var10, 0, var13 >> 14, var11 >> 14);
									var13 += var18;
									var11 += var17;
									var14 += Rasterizer2D.Rasterizer2D_width;
								}
							}

							this.applyColorFilterToPixelsInRange(Rasterizer2D.Rasterizer2D_pixels, var14, var10, 0, var12 >> 14, var11 >> 14);
							var12 += var19;
							var11 += var17;
							var14 += Rasterizer2D.Rasterizer2D_width;
						}
					}
				}
			}
		} else if (var15 <= var16) {
			if (var15 < var21) {
				if (var16 > var21) {
					var16 = var21;
				}

				if (var14 > var21) {
					var14 = var21;
				}

				if (var16 < var14) {
					var11 = var12 <<= 14;
					if (var15 < 0) {
						var11 -= var17 * var15;
						var12 -= var18 * var15;
						var15 = 0;
					}

					var13 <<= 14;
					if (var16 < 0) {
						var13 -= var19 * var16;
						var16 = 0;
					}

					if (var15 != var16 && var17 < var18 || var15 == var16 && var17 > var19) {
						var14 -= var16;
						var16 -= var15;
						var15 = var20[var15];

						while (true) {
							--var16;
							if (var16 < 0) {
								while (true) {
									--var14;
									if (var14 < 0) {
										return;
									}

									this.applyColorFilterToPixelsInRange(Rasterizer2D.Rasterizer2D_pixels, var15, var10, 0, var11 >> 14, var13 >> 14);
									var11 += var17;
									var13 += var19;
									var15 += Rasterizer2D.Rasterizer2D_width;
								}
							}

							this.applyColorFilterToPixelsInRange(Rasterizer2D.Rasterizer2D_pixels, var15, var10, 0, var11 >> 14, var12 >> 14);
							var11 += var17;
							var12 += var18;
							var15 += Rasterizer2D.Rasterizer2D_width;
						}
					} else {
						var14 -= var16;
						var16 -= var15;
						var15 = var20[var15];

						while (true) {
							--var16;
							if (var16 < 0) {
								while (true) {
									--var14;
									if (var14 < 0) {
										return;
									}

									this.applyColorFilterToPixelsInRange(Rasterizer2D.Rasterizer2D_pixels, var15, var10, 0, var13 >> 14, var11 >> 14);
									var11 += var17;
									var13 += var19;
									var15 += Rasterizer2D.Rasterizer2D_width;
								}
							}

							this.applyColorFilterToPixelsInRange(Rasterizer2D.Rasterizer2D_pixels, var15, var10, 0, var12 >> 14, var11 >> 14);
							var11 += var17;
							var12 += var18;
							var15 += Rasterizer2D.Rasterizer2D_width;
						}
					}
				} else {
					var13 = var12 <<= 14;
					if (var15 < 0) {
						var13 -= var17 * var15;
						var12 -= var18 * var15;
						var15 = 0;
					}

					var11 <<= 14;
					if (var14 < 0) {
						var11 -= var19 * var14;
						var14 = 0;
					}

					if (var17 < var18) {
						var16 -= var14;
						var14 -= var15;
						var15 = var20[var15];

						while (true) {
							--var14;
							if (var14 < 0) {
								while (true) {
									--var16;
									if (var16 < 0) {
										return;
									}

									this.applyColorFilterToPixelsInRange(Rasterizer2D.Rasterizer2D_pixels, var15, var10, 0, var11 >> 14, var12 >> 14);
									var11 += var19;
									var12 += var18;
									var15 += Rasterizer2D.Rasterizer2D_width;
								}
							}

							this.applyColorFilterToPixelsInRange(Rasterizer2D.Rasterizer2D_pixels, var15, var10, 0, var13 >> 14, var12 >> 14);
							var13 += var17;
							var12 += var18;
							var15 += Rasterizer2D.Rasterizer2D_width;
						}
					} else {
						var16 -= var14;
						var14 -= var15;
						var15 = var20[var15];

						while (true) {
							--var14;
							if (var14 < 0) {
								while (true) {
									--var16;
									if (var16 < 0) {
										return;
									}

									this.applyColorFilterToPixelsInRange(Rasterizer2D.Rasterizer2D_pixels, var15, var10, 0, var12 >> 14, var11 >> 14);
									var11 += var19;
									var12 += var18;
									var15 += Rasterizer2D.Rasterizer2D_width;
								}
							}

							this.applyColorFilterToPixelsInRange(Rasterizer2D.Rasterizer2D_pixels, var15, var10, 0, var12 >> 14, var13 >> 14);
							var13 += var17;
							var12 += var18;
							var15 += Rasterizer2D.Rasterizer2D_width;
						}
					}
				}
			}
		} else if (var16 < var21) {
			if (var14 > var21) {
				var14 = var21;
			}

			if (var15 > var21) {
				var15 = var21;
			}

			if (var14 < var15) {
				var12 = var13 <<= 14;
				if (var16 < 0) {
					var12 -= var18 * var16;
					var13 -= var19 * var16;
					var16 = 0;
				}

				var11 <<= 14;
				if (var14 < 0) {
					var11 -= var17 * var14;
					var14 = 0;
				}

				if (var18 < var19) {
					var15 -= var14;
					var14 -= var16;
					var16 = var20[var16];

					while (true) {
						--var14;
						if (var14 < 0) {
							while (true) {
								--var15;
								if (var15 < 0) {
									return;
								}

								this.applyColorFilterToPixelsInRange(Rasterizer2D.Rasterizer2D_pixels, var16, var10, 0, var12 >> 14, var11 >> 14);
								var12 += var18;
								var11 += var17;
								var16 += Rasterizer2D.Rasterizer2D_width;
							}
						}

						this.applyColorFilterToPixelsInRange(Rasterizer2D.Rasterizer2D_pixels, var16, var10, 0, var12 >> 14, var13 >> 14);
						var12 += var18;
						var13 += var19;
						var16 += Rasterizer2D.Rasterizer2D_width;
					}
				} else {
					var15 -= var14;
					var14 -= var16;
					var16 = var20[var16];

					while (true) {
						--var14;
						if (var14 < 0) {
							while (true) {
								--var15;
								if (var15 < 0) {
									return;
								}

								this.applyColorFilterToPixelsInRange(Rasterizer2D.Rasterizer2D_pixels, var16, var10, 0, var11 >> 14, var12 >> 14);
								var12 += var18;
								var11 += var17;
								var16 += Rasterizer2D.Rasterizer2D_width;
							}
						}

						this.applyColorFilterToPixelsInRange(Rasterizer2D.Rasterizer2D_pixels, var16, var10, 0, var13 >> 14, var12 >> 14);
						var12 += var18;
						var13 += var19;
						var16 += Rasterizer2D.Rasterizer2D_width;
					}
				}
			} else {
				var11 = var13 <<= 14;
				if (var16 < 0) {
					var11 -= var18 * var16;
					var13 -= var19 * var16;
					var16 = 0;
				}

				var12 <<= 14;
				if (var15 < 0) {
					var12 -= var17 * var15;
					var15 = 0;
				}

				if (var18 < var19) {
					var14 -= var15;
					var15 -= var16;
					var16 = var20[var16];

					while (true) {
						--var15;
						if (var15 < 0) {
							while (true) {
								--var14;
								if (var14 < 0) {
									return;
								}

								this.applyColorFilterToPixelsInRange(Rasterizer2D.Rasterizer2D_pixels, var16, var10, 0, var12 >> 14, var13 >> 14);
								var12 += var17;
								var13 += var19;
								var16 += Rasterizer2D.Rasterizer2D_width;
							}
						}

						this.applyColorFilterToPixelsInRange(Rasterizer2D.Rasterizer2D_pixels, var16, var10, 0, var11 >> 14, var13 >> 14);
						var11 += var18;
						var13 += var19;
						var16 += Rasterizer2D.Rasterizer2D_width;
					}
				} else {
					var14 -= var15;
					var15 -= var16;
					var16 = var20[var16];

					while (true) {
						--var15;
						if (var15 < 0) {
							while (true) {
								--var14;
								if (var14 < 0) {
									return;
								}

								this.applyColorFilterToPixelsInRange(Rasterizer2D.Rasterizer2D_pixels, var16, var10, 0, var13 >> 14, var12 >> 14);
								var12 += var17;
								var13 += var19;
								var16 += Rasterizer2D.Rasterizer2D_width;
							}
						}

						this.applyColorFilterToPixelsInRange(Rasterizer2D.Rasterizer2D_pixels, var16, var10, 0, var13 >> 14, var11 >> 14);
						var11 += var18;
						var13 += var19;
						var16 += Rasterizer2D.Rasterizer2D_width;
					}
				}
			}
		}
	}

	@ObfuscatedName("az")
	@Export("drawGradientTriangle")
	void drawGradientTriangle(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22) {
		int[] var23 = super.field2828.Rasterizer3D_textureLoader.getTexturePixels(var22);
		int var24;
		if (var23 == null) {
			var24 = super.field2828.Rasterizer3D_textureLoader.getAverageTextureRGB(var22);
			this.drawAlphaBlendedGraphics(var1, var2, var3, var4, var5, var6, var7, var8, var9, AbstractRasterizer.method5497(var24, var10), AbstractRasterizer.method5497(var24, var11), AbstractRasterizer.method5497(var24, var12));
		} else {
			super.field2826 = super.field2828.Rasterizer3D_textureLoader.isLowDetail(var22);
			var24 = (int)var4;
			int var25 = (int)var5;
			int var26 = (int)var6;
			int var27 = (int)var1;
			int var28 = (int)var2;
			int var29 = (int)var3;
			int var30 = var25 - var24;
			int var31 = var28 - var27;
			int var32 = var26 - var24;
			int var33 = var29 - var27;
			int var34 = var11 - var10;
			int var35 = var12 - var10;
			int var36 = 0;
			if (var28 != var27) {
				var36 = (var25 - var24 << 14) / (var28 - var27);
			}

			int var37 = 0;
			if (var29 != var28) {
				var37 = (var26 - var25 << 14) / (var29 - var28);
			}

			int var38 = 0;
			if (var29 != var27) {
				var38 = (var24 - var26 << 14) / (var27 - var29);
			}

			int var39 = var30 * var33 - var32 * var31;
			if (var39 != 0) {
				int var40 = (var34 * var33 - var35 * var31 << 9) / var39;
				int var41 = (var35 * var30 - var34 * var32 << 9) / var39;
				int var42 = super.field2828.zoom;
				var14 = var13 - var14;
				var17 = var16 - var17;
				var20 = var19 - var20;
				var15 -= var13;
				var18 -= var16;
				var21 -= var19;
				int var43 = var15 * var16 - var18 * var13 << 14;
				int var44 = (int)(((long)(var18 * var19 - var16 * var21) << 3 << 14) / (long)var42);
				int var45 = (int)(((long)(var13 * var21 - var19 * var15) << 14) / (long)var42);
				int var46 = var16 * var14 - var13 * var17 << 14;
				int var47 = (int)(((long)(var19 * var17 - var16 * var20) << 3 << 14) / (long)var42);
				int var48 = (int)(((long)(var13 * var20 - var19 * var14) << 14) / (long)var42);
				int var49 = var17 * var15 - var18 * var14 << 14;
				int var50 = (int)(((long)(var18 * var20 - var17 * var21) << 3 << 14) / (long)var42);
				int var51 = (int)(((long)(var21 * var14 - var15 * var20) << 14) / (long)var42);
				int[] var52 = super.field2828.Rasterizer3D_rowOffsets;
				int var53 = super.field2828.clipY;
				int var54;
				if (var27 <= var28 && var27 <= var29) {
					if (var27 < var53) {
						if (var28 > var53) {
							var28 = var53;
						}

						if (var29 > var53) {
							var29 = var53;
						}

						var10 = var40 + ((var10 << 9) - var40 * var24);
						if (var28 < var29) {
							var26 = var24 <<= 14;
							if (var27 < 0) {
								var26 -= var38 * var27;
								var24 -= var36 * var27;
								var10 -= var41 * var27;
								var27 = 0;
							}

							var25 <<= 14;
							if (var28 < 0) {
								var25 -= var37 * var28;
								var28 = 0;
							}

							var54 = var27 - super.field2828.clipMidY;
							var43 += var45 * var54;
							var46 += var48 * var54;
							var49 += var51 * var54;
							if ((var27 == var28 || var38 >= var36) && (var27 != var28 || var38 <= var37)) {
								var29 -= var28;
								var28 -= var27;
								var27 = var52[var27];

								while (true) {
									--var28;
									if (var28 < 0) {
										while (true) {
											--var29;
											if (var29 < 0) {
												return;
											}

											this.processPixelsToArray(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var27, var25 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
											var26 += var38;
											var25 += var37;
											var10 += var41;
											var27 += Rasterizer2D.Rasterizer2D_width;
											var43 += var45;
											var46 += var48;
											var49 += var51;
										}
									}

									this.processPixelsToArray(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var27, var24 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
									var26 += var38;
									var24 += var36;
									var10 += var41;
									var27 += Rasterizer2D.Rasterizer2D_width;
									var43 += var45;
									var46 += var48;
									var49 += var51;
								}
							} else {
								var29 -= var28;
								var28 -= var27;
								var27 = var52[var27];

								while (true) {
									--var28;
									if (var28 < 0) {
										while (true) {
											--var29;
											if (var29 < 0) {
												return;
											}

											this.processPixelsToArray(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var27, var26 >> 14, var25 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
											var26 += var38;
											var25 += var37;
											var10 += var41;
											var27 += Rasterizer2D.Rasterizer2D_width;
											var43 += var45;
											var46 += var48;
											var49 += var51;
										}
									}

									this.processPixelsToArray(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var27, var26 >> 14, var24 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
									var26 += var38;
									var24 += var36;
									var10 += var41;
									var27 += Rasterizer2D.Rasterizer2D_width;
									var43 += var45;
									var46 += var48;
									var49 += var51;
								}
							}
						} else {
							var25 = var24 <<= 14;
							if (var27 < 0) {
								var25 -= var38 * var27;
								var24 -= var36 * var27;
								var10 -= var41 * var27;
								var27 = 0;
							}

							var26 <<= 14;
							if (var29 < 0) {
								var26 -= var37 * var29;
								var29 = 0;
							}

							var54 = var27 - super.field2828.clipMidY;
							var43 += var45 * var54;
							var46 += var48 * var54;
							var49 += var51 * var54;
							if (var27 != var29 && var38 < var36 || var27 == var29 && var37 > var36) {
								var28 -= var29;
								var29 -= var27;
								var27 = var52[var27];

								while (true) {
									--var29;
									if (var29 < 0) {
										while (true) {
											--var28;
											if (var28 < 0) {
												return;
											}

											this.processPixelsToArray(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var27, var26 >> 14, var24 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
											var26 += var37;
											var24 += var36;
											var10 += var41;
											var27 += Rasterizer2D.Rasterizer2D_width;
											var43 += var45;
											var46 += var48;
											var49 += var51;
										}
									}

									this.processPixelsToArray(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var27, var25 >> 14, var24 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
									var25 += var38;
									var24 += var36;
									var10 += var41;
									var27 += Rasterizer2D.Rasterizer2D_width;
									var43 += var45;
									var46 += var48;
									var49 += var51;
								}
							} else {
								var28 -= var29;
								var29 -= var27;
								var27 = var52[var27];

								while (true) {
									--var29;
									if (var29 < 0) {
										while (true) {
											--var28;
											if (var28 < 0) {
												return;
											}

											this.processPixelsToArray(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var27, var24 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
											var26 += var37;
											var24 += var36;
											var10 += var41;
											var27 += Rasterizer2D.Rasterizer2D_width;
											var43 += var45;
											var46 += var48;
											var49 += var51;
										}
									}

									this.processPixelsToArray(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var27, var24 >> 14, var25 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
									var25 += var38;
									var24 += var36;
									var10 += var41;
									var27 += Rasterizer2D.Rasterizer2D_width;
									var43 += var45;
									var46 += var48;
									var49 += var51;
								}
							}
						}
					}
				} else if (var28 <= var29) {
					if (var28 < var53) {
						if (var29 > var53) {
							var29 = var53;
						}

						if (var27 > var53) {
							var27 = var53;
						}

						var11 = (var11 << 9) - var40 * var25 + var40;
						if (var29 < var27) {
							var24 = var25 <<= 14;
							if (var28 < 0) {
								var24 -= var36 * var28;
								var25 -= var37 * var28;
								var11 -= var41 * var28;
								var28 = 0;
							}

							var26 <<= 14;
							if (var29 < 0) {
								var26 -= var38 * var29;
								var29 = 0;
							}

							var54 = var28 - super.field2828.clipMidY;
							var43 += var45 * var54;
							var46 += var48 * var54;
							var49 += var51 * var54;
							if ((var28 == var29 || var36 >= var37) && (var28 != var29 || var36 <= var38)) {
								var27 -= var29;
								var29 -= var28;
								var28 = var52[var28];

								while (true) {
									--var29;
									if (var29 < 0) {
										while (true) {
											--var27;
											if (var27 < 0) {
												return;
											}

											this.processPixelsToArray(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var28, var26 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
											var24 += var36;
											var26 += var38;
											var11 += var41;
											var28 += Rasterizer2D.Rasterizer2D_width;
											var43 += var45;
											var46 += var48;
											var49 += var51;
										}
									}

									this.processPixelsToArray(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var28, var25 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
									var24 += var36;
									var25 += var37;
									var11 += var41;
									var28 += Rasterizer2D.Rasterizer2D_width;
									var43 += var45;
									var46 += var48;
									var49 += var51;
								}
							} else {
								var27 -= var29;
								var29 -= var28;
								var28 = var52[var28];

								while (true) {
									--var29;
									if (var29 < 0) {
										while (true) {
											--var27;
											if (var27 < 0) {
												return;
											}

											this.processPixelsToArray(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var28, var24 >> 14, var26 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
											var24 += var36;
											var26 += var38;
											var11 += var41;
											var28 += Rasterizer2D.Rasterizer2D_width;
											var43 += var45;
											var46 += var48;
											var49 += var51;
										}
									}

									this.processPixelsToArray(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var28, var24 >> 14, var25 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
									var24 += var36;
									var25 += var37;
									var11 += var41;
									var28 += Rasterizer2D.Rasterizer2D_width;
									var43 += var45;
									var46 += var48;
									var49 += var51;
								}
							}
						} else {
							var26 = var25 <<= 14;
							if (var28 < 0) {
								var26 -= var36 * var28;
								var25 -= var37 * var28;
								var11 -= var41 * var28;
								var28 = 0;
							}

							var24 <<= 14;
							if (var27 < 0) {
								var24 -= var38 * var27;
								var27 = 0;
							}

							var54 = var28 - super.field2828.clipMidY;
							var43 += var45 * var54;
							var46 += var48 * var54;
							var49 += var51 * var54;
							if (var36 < var37) {
								var29 -= var27;
								var27 -= var28;
								var28 = var52[var28];

								while (true) {
									--var27;
									if (var27 < 0) {
										while (true) {
											--var29;
											if (var29 < 0) {
												return;
											}

											this.processPixelsToArray(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var28, var24 >> 14, var25 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
											var24 += var38;
											var25 += var37;
											var11 += var41;
											var28 += Rasterizer2D.Rasterizer2D_width;
											var43 += var45;
											var46 += var48;
											var49 += var51;
										}
									}

									this.processPixelsToArray(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var28, var26 >> 14, var25 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
									var26 += var36;
									var25 += var37;
									var11 += var41;
									var28 += Rasterizer2D.Rasterizer2D_width;
									var43 += var45;
									var46 += var48;
									var49 += var51;
								}
							} else {
								var29 -= var27;
								var27 -= var28;
								var28 = var52[var28];

								while (true) {
									--var27;
									if (var27 < 0) {
										while (true) {
											--var29;
											if (var29 < 0) {
												return;
											}

											this.processPixelsToArray(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var28, var25 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
											var24 += var38;
											var25 += var37;
											var11 += var41;
											var28 += Rasterizer2D.Rasterizer2D_width;
											var43 += var45;
											var46 += var48;
											var49 += var51;
										}
									}

									this.processPixelsToArray(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var28, var25 >> 14, var26 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
									var26 += var36;
									var25 += var37;
									var11 += var41;
									var28 += Rasterizer2D.Rasterizer2D_width;
									var43 += var45;
									var46 += var48;
									var49 += var51;
								}
							}
						}
					}
				} else if (var29 < var53) {
					if (var27 > var53) {
						var27 = var53;
					}

					if (var28 > var53) {
						var28 = var53;
					}

					var12 = var40 + ((var12 << 9) - var40 * var26);
					if (var27 < var28) {
						var25 = var26 <<= 14;
						if (var29 < 0) {
							var25 -= var37 * var29;
							var26 -= var38 * var29;
							var12 -= var41 * var29;
							var29 = 0;
						}

						var24 <<= 14;
						if (var27 < 0) {
							var24 -= var36 * var27;
							var27 = 0;
						}

						var54 = var29 - super.field2828.clipMidY;
						var43 += var45 * var54;
						var46 += var48 * var54;
						var49 += var51 * var54;
						if (var37 < var38) {
							var28 -= var27;
							var27 -= var29;
							var29 = var52[var29];

							while (true) {
								--var27;
								if (var27 < 0) {
									while (true) {
										--var28;
										if (var28 < 0) {
											return;
										}

										this.processPixelsToArray(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var29, var25 >> 14, var24 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
										var25 += var37;
										var24 += var36;
										var12 += var41;
										var29 += Rasterizer2D.Rasterizer2D_width;
										var43 += var45;
										var46 += var48;
										var49 += var51;
									}
								}

								this.processPixelsToArray(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var29, var25 >> 14, var26 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
								var25 += var37;
								var26 += var38;
								var12 += var41;
								var29 += Rasterizer2D.Rasterizer2D_width;
								var43 += var45;
								var46 += var48;
								var49 += var51;
							}
						} else {
							var28 -= var27;
							var27 -= var29;
							var29 = var52[var29];

							while (true) {
								--var27;
								if (var27 < 0) {
									while (true) {
										--var28;
										if (var28 < 0) {
											return;
										}

										this.processPixelsToArray(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var29, var24 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
										var25 += var37;
										var24 += var36;
										var12 += var41;
										var29 += Rasterizer2D.Rasterizer2D_width;
										var43 += var45;
										var46 += var48;
										var49 += var51;
									}
								}

								this.processPixelsToArray(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var29, var26 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
								var25 += var37;
								var26 += var38;
								var12 += var41;
								var29 += Rasterizer2D.Rasterizer2D_width;
								var43 += var45;
								var46 += var48;
								var49 += var51;
							}
						}
					} else {
						var24 = var26 <<= 14;
						if (var29 < 0) {
							var24 -= var37 * var29;
							var26 -= var38 * var29;
							var12 -= var41 * var29;
							var29 = 0;
						}

						var25 <<= 14;
						if (var28 < 0) {
							var25 -= var36 * var28;
							var28 = 0;
						}

						var54 = var29 - super.field2828.clipMidY;
						var43 += var45 * var54;
						var46 += var48 * var54;
						var49 += var51 * var54;
						if (var37 < var38) {
							var27 -= var28;
							var28 -= var29;
							var29 = var52[var29];

							while (true) {
								--var28;
								if (var28 < 0) {
									while (true) {
										--var27;
										if (var27 < 0) {
											return;
										}

										this.processPixelsToArray(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var29, var25 >> 14, var26 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
										var25 += var36;
										var26 += var38;
										var12 += var41;
										var29 += Rasterizer2D.Rasterizer2D_width;
										var43 += var45;
										var46 += var48;
										var49 += var51;
									}
								}

								this.processPixelsToArray(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var29, var24 >> 14, var26 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
								var24 += var37;
								var26 += var38;
								var12 += var41;
								var29 += Rasterizer2D.Rasterizer2D_width;
								var43 += var45;
								var46 += var48;
								var49 += var51;
							}
						} else {
							var27 -= var28;
							var28 -= var29;
							var29 = var52[var29];

							while (true) {
								--var28;
								if (var28 < 0) {
									while (true) {
										--var27;
										if (var27 < 0) {
											return;
										}

										this.processPixelsToArray(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var29, var26 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
										var25 += var36;
										var26 += var38;
										var12 += var41;
										var29 += Rasterizer2D.Rasterizer2D_width;
										var43 += var45;
										var46 += var48;
										var49 += var51;
									}
								}

								this.processPixelsToArray(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var29, var26 >> 14, var24 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
								var24 += var37;
								var26 += var38;
								var12 += var41;
								var29 += Rasterizer2D.Rasterizer2D_width;
								var43 += var45;
								var46 += var48;
								var49 += var51;
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
		int var24;
		if (var23 == null) {
			var24 = super.field2828.Rasterizer3D_textureLoader.getAverageTextureRGB(var22);
			this.drawAlphaBlendedGraphics(var1, var2, var3, var4, var5, var6, var7, var8, var9, AbstractRasterizer.method5497(var24, var10), AbstractRasterizer.method5497(var24, var11), AbstractRasterizer.method5497(var24, var12));
		} else {
			super.field2826 = super.field2828.Rasterizer3D_textureLoader.isLowDetail(var22);
			var24 = (int)var4;
			int var25 = (int)var5;
			int var26 = (int)var6;
			int var27 = (int)var1;
			int var28 = (int)var2;
			int var29 = (int)var3;
			int var30 = var25 - var24;
			int var31 = var28 - var27;
			int var32 = var26 - var24;
			int var33 = var29 - var27;
			int var34 = var11 - var10;
			int var35 = var12 - var10;
			int var36 = 0;
			if (var28 != var27) {
				var36 = (var25 - var24 << 14) / (var28 - var27);
			}

			int var37 = 0;
			if (var29 != var28) {
				var37 = (var26 - var25 << 14) / (var29 - var28);
			}

			int var38 = 0;
			if (var29 != var27) {
				var38 = (var24 - var26 << 14) / (var27 - var29);
			}

			int var39 = var30 * var33 - var32 * var31;
			if (var39 != 0) {
				int var40 = (var34 * var33 - var35 * var31 << 9) / var39;
				int var41 = (var35 * var30 - var34 * var32 << 9) / var39;
				int var42 = super.field2828.zoom;
				var14 = var13 - var14;
				var17 = var16 - var17;
				var20 = var19 - var20;
				var15 -= var13;
				var18 -= var16;
				var21 -= var19;
				int var43 = var15 * var16 - var18 * var13 << 14;
				int var44 = (int)(((long)(var18 * var19 - var16 * var21) << 14) / (long)var42);
				int var45 = (int)(((long)(var13 * var21 - var19 * var15) << 14) / (long)var42);
				int var46 = var16 * var14 - var13 * var17 << 14;
				int var47 = (int)(((long)(var19 * var17 - var16 * var20) << 14) / (long)var42);
				int var48 = (int)(((long)(var13 * var20 - var19 * var14) << 14) / (long)var42);
				int var49 = var17 * var15 - var18 * var14 << 14;
				int var50 = (int)(((long)(var18 * var20 - var17 * var21) << 14) / (long)var42);
				int var51 = (int)(((long)(var21 * var14 - var15 * var20) << 14) / (long)var42);
				int[] var52 = super.field2828.Rasterizer3D_rowOffsets;
				int var53 = super.field2828.clipY;
				int var54 = super.field2828.clipMidY;
				int var55;
				if (var27 <= var28 && var27 <= var29) {
					if (var27 < var53) {
						if (var28 > var53) {
							var28 = var53;
						}

						if (var29 > var53) {
							var29 = var53;
						}

						var10 = var40 + ((var10 << 9) - var40 * var24);
						if (var28 < var29) {
							var26 = var24 <<= 14;
							if (var27 < 0) {
								var26 -= var38 * var27;
								var24 -= var36 * var27;
								var10 -= var41 * var27;
								var27 = 0;
							}

							var25 <<= 14;
							if (var28 < 0) {
								var25 -= var37 * var28;
								var28 = 0;
							}

							var55 = var27 - var54;
							var43 += var45 * var55;
							var46 += var48 * var55;
							var49 += var51 * var55;
							if (var27 != var28 && var38 < var36 || var27 == var28 && var38 > var37) {
								var29 -= var28;
								var28 -= var27;
								var27 = var52[var27];

								while (true) {
									--var28;
									if (var28 < 0) {
										while (true) {
											--var29;
											if (var29 < 0) {
												return;
											}

											this.drawPixels(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var27, var26 >> 14, var25 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
											var26 += var38;
											var25 += var37;
											var10 += var41;
											var27 += Rasterizer2D.Rasterizer2D_width;
											var43 += var45;
											var46 += var48;
											var49 += var51;
										}
									}

									this.drawPixels(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var27, var26 >> 14, var24 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
									var26 += var38;
									var24 += var36;
									var10 += var41;
									var27 += Rasterizer2D.Rasterizer2D_width;
									var43 += var45;
									var46 += var48;
									var49 += var51;
								}
							} else {
								var29 -= var28;
								var28 -= var27;
								var27 = var52[var27];

								while (true) {
									--var28;
									if (var28 < 0) {
										while (true) {
											--var29;
											if (var29 < 0) {
												return;
											}

											this.drawPixels(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var27, var25 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
											var26 += var38;
											var25 += var37;
											var10 += var41;
											var27 += Rasterizer2D.Rasterizer2D_width;
											var43 += var45;
											var46 += var48;
											var49 += var51;
										}
									}

									this.drawPixels(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var27, var24 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
									var26 += var38;
									var24 += var36;
									var10 += var41;
									var27 += Rasterizer2D.Rasterizer2D_width;
									var43 += var45;
									var46 += var48;
									var49 += var51;
								}
							}
						} else {
							var25 = var24 <<= 14;
							if (var27 < 0) {
								var25 -= var38 * var27;
								var24 -= var36 * var27;
								var10 -= var41 * var27;
								var27 = 0;
							}

							var26 <<= 14;
							if (var29 < 0) {
								var26 -= var37 * var29;
								var29 = 0;
							}

							var55 = var27 - var54;
							var43 += var45 * var55;
							var46 += var48 * var55;
							var49 += var51 * var55;
							if (var27 != var29 && var38 < var36 || var27 == var29 && var37 > var36) {
								var28 -= var29;
								var29 -= var27;
								var27 = var52[var27];

								while (true) {
									--var29;
									if (var29 < 0) {
										while (true) {
											--var28;
											if (var28 < 0) {
												return;
											}

											this.drawPixels(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var27, var26 >> 14, var24 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
											var26 += var37;
											var24 += var36;
											var10 += var41;
											var27 += Rasterizer2D.Rasterizer2D_width;
											var43 += var45;
											var46 += var48;
											var49 += var51;
										}
									}

									this.drawPixels(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var27, var25 >> 14, var24 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
									var25 += var38;
									var24 += var36;
									var10 += var41;
									var27 += Rasterizer2D.Rasterizer2D_width;
									var43 += var45;
									var46 += var48;
									var49 += var51;
								}
							} else {
								var28 -= var29;
								var29 -= var27;
								var27 = var52[var27];

								while (true) {
									--var29;
									if (var29 < 0) {
										while (true) {
											--var28;
											if (var28 < 0) {
												return;
											}

											this.drawPixels(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var27, var24 >> 14, var26 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
											var26 += var37;
											var24 += var36;
											var10 += var41;
											var27 += Rasterizer2D.Rasterizer2D_width;
											var43 += var45;
											var46 += var48;
											var49 += var51;
										}
									}

									this.drawPixels(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var27, var24 >> 14, var25 >> 14, var10, var40, var43, var46, var49, var44, var47, var50);
									var25 += var38;
									var24 += var36;
									var10 += var41;
									var27 += Rasterizer2D.Rasterizer2D_width;
									var43 += var45;
									var46 += var48;
									var49 += var51;
								}
							}
						}
					}
				} else if (var28 <= var29) {
					if (var28 < var53) {
						if (var29 > var53) {
							var29 = var53;
						}

						if (var27 > var53) {
							var27 = var53;
						}

						var11 = (var11 << 9) - var40 * var25 + var40;
						if (var29 < var27) {
							var24 = var25 <<= 14;
							if (var28 < 0) {
								var24 -= var36 * var28;
								var25 -= var37 * var28;
								var11 -= var41 * var28;
								var28 = 0;
							}

							var26 <<= 14;
							if (var29 < 0) {
								var26 -= var38 * var29;
								var29 = 0;
							}

							var55 = var28 - var54;
							var43 += var45 * var55;
							var46 += var48 * var55;
							var49 += var51 * var55;
							if (var28 != var29 && var36 < var37 || var28 == var29 && var36 > var38) {
								var27 -= var29;
								var29 -= var28;
								var28 = var52[var28];

								while (true) {
									--var29;
									if (var29 < 0) {
										while (true) {
											--var27;
											if (var27 < 0) {
												return;
											}

											this.drawPixels(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var28, var24 >> 14, var26 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
											var24 += var36;
											var26 += var38;
											var11 += var41;
											var28 += Rasterizer2D.Rasterizer2D_width;
											var43 += var45;
											var46 += var48;
											var49 += var51;
										}
									}

									this.drawPixels(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var28, var24 >> 14, var25 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
									var24 += var36;
									var25 += var37;
									var11 += var41;
									var28 += Rasterizer2D.Rasterizer2D_width;
									var43 += var45;
									var46 += var48;
									var49 += var51;
								}
							} else {
								var27 -= var29;
								var29 -= var28;
								var28 = var52[var28];

								while (true) {
									--var29;
									if (var29 < 0) {
										while (true) {
											--var27;
											if (var27 < 0) {
												return;
											}

											this.drawPixels(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var28, var26 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
											var24 += var36;
											var26 += var38;
											var11 += var41;
											var28 += Rasterizer2D.Rasterizer2D_width;
											var43 += var45;
											var46 += var48;
											var49 += var51;
										}
									}

									this.drawPixels(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var28, var25 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
									var24 += var36;
									var25 += var37;
									var11 += var41;
									var28 += Rasterizer2D.Rasterizer2D_width;
									var43 += var45;
									var46 += var48;
									var49 += var51;
								}
							}
						} else {
							var26 = var25 <<= 14;
							if (var28 < 0) {
								var26 -= var36 * var28;
								var25 -= var37 * var28;
								var11 -= var41 * var28;
								var28 = 0;
							}

							var24 <<= 14;
							if (var27 < 0) {
								var24 -= var38 * var27;
								var27 = 0;
							}

							var55 = var28 - var54;
							var43 += var45 * var55;
							var46 += var48 * var55;
							var49 += var51 * var55;
							if (var36 < var37) {
								var29 -= var27;
								var27 -= var28;
								var28 = var52[var28];

								while (true) {
									--var27;
									if (var27 < 0) {
										while (true) {
											--var29;
											if (var29 < 0) {
												return;
											}

											this.drawPixels(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var28, var24 >> 14, var25 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
											var24 += var38;
											var25 += var37;
											var11 += var41;
											var28 += Rasterizer2D.Rasterizer2D_width;
											var43 += var45;
											var46 += var48;
											var49 += var51;
										}
									}

									this.drawPixels(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var28, var26 >> 14, var25 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
									var26 += var36;
									var25 += var37;
									var11 += var41;
									var28 += Rasterizer2D.Rasterizer2D_width;
									var43 += var45;
									var46 += var48;
									var49 += var51;
								}
							} else {
								var29 -= var27;
								var27 -= var28;
								var28 = var52[var28];

								while (true) {
									--var27;
									if (var27 < 0) {
										while (true) {
											--var29;
											if (var29 < 0) {
												return;
											}

											this.drawPixels(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var28, var25 >> 14, var24 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
											var24 += var38;
											var25 += var37;
											var11 += var41;
											var28 += Rasterizer2D.Rasterizer2D_width;
											var43 += var45;
											var46 += var48;
											var49 += var51;
										}
									}

									this.drawPixels(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var28, var25 >> 14, var26 >> 14, var11, var40, var43, var46, var49, var44, var47, var50);
									var26 += var36;
									var25 += var37;
									var11 += var41;
									var28 += Rasterizer2D.Rasterizer2D_width;
									var43 += var45;
									var46 += var48;
									var49 += var51;
								}
							}
						}
					}
				} else if (var29 < var53) {
					if (var27 > var53) {
						var27 = var53;
					}

					if (var28 > var53) {
						var28 = var53;
					}

					var12 = var40 + ((var12 << 9) - var40 * var26);
					if (var27 < var28) {
						var25 = var26 <<= 14;
						if (var29 < 0) {
							var25 -= var37 * var29;
							var26 -= var38 * var29;
							var12 -= var41 * var29;
							var29 = 0;
						}

						var24 <<= 14;
						if (var27 < 0) {
							var24 -= var36 * var27;
							var27 = 0;
						}

						var55 = var29 - var54;
						var43 += var45 * var55;
						var46 += var48 * var55;
						var49 += var51 * var55;
						if (var37 < var38) {
							var28 -= var27;
							var27 -= var29;
							var29 = var52[var29];

							while (true) {
								--var27;
								if (var27 < 0) {
									while (true) {
										--var28;
										if (var28 < 0) {
											return;
										}

										this.drawPixels(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var29, var25 >> 14, var24 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
										var25 += var37;
										var24 += var36;
										var12 += var41;
										var29 += Rasterizer2D.Rasterizer2D_width;
										var43 += var45;
										var46 += var48;
										var49 += var51;
									}
								}

								this.drawPixels(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var29, var25 >> 14, var26 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
								var25 += var37;
								var26 += var38;
								var12 += var41;
								var29 += Rasterizer2D.Rasterizer2D_width;
								var43 += var45;
								var46 += var48;
								var49 += var51;
							}
						} else {
							var28 -= var27;
							var27 -= var29;
							var29 = var52[var29];

							while (true) {
								--var27;
								if (var27 < 0) {
									while (true) {
										--var28;
										if (var28 < 0) {
											return;
										}

										this.drawPixels(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var29, var24 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
										var25 += var37;
										var24 += var36;
										var12 += var41;
										var29 += Rasterizer2D.Rasterizer2D_width;
										var43 += var45;
										var46 += var48;
										var49 += var51;
									}
								}

								this.drawPixels(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var29, var26 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
								var25 += var37;
								var26 += var38;
								var12 += var41;
								var29 += Rasterizer2D.Rasterizer2D_width;
								var43 += var45;
								var46 += var48;
								var49 += var51;
							}
						}
					} else {
						var24 = var26 <<= 14;
						if (var29 < 0) {
							var24 -= var37 * var29;
							var26 -= var38 * var29;
							var12 -= var41 * var29;
							var29 = 0;
						}

						var25 <<= 14;
						if (var28 < 0) {
							var25 -= var36 * var28;
							var28 = 0;
						}

						var55 = var29 - var54;
						var43 += var45 * var55;
						var46 += var48 * var55;
						var49 += var51 * var55;
						if (var37 < var38) {
							var27 -= var28;
							var28 -= var29;
							var29 = var52[var29];

							while (true) {
								--var28;
								if (var28 < 0) {
									while (true) {
										--var27;
										if (var27 < 0) {
											return;
										}

										this.drawPixels(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var29, var25 >> 14, var26 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
										var25 += var36;
										var26 += var38;
										var12 += var41;
										var29 += Rasterizer2D.Rasterizer2D_width;
										var43 += var45;
										var46 += var48;
										var49 += var51;
									}
								}

								this.drawPixels(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var29, var24 >> 14, var26 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
								var24 += var37;
								var26 += var38;
								var12 += var41;
								var29 += Rasterizer2D.Rasterizer2D_width;
								var43 += var45;
								var46 += var48;
								var49 += var51;
							}
						} else {
							var27 -= var28;
							var28 -= var29;
							var29 = var52[var29];

							while (true) {
								--var28;
								if (var28 < 0) {
									while (true) {
										--var27;
										if (var27 < 0) {
											return;
										}

										this.drawPixels(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var29, var26 >> 14, var25 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
										var25 += var36;
										var26 += var38;
										var12 += var41;
										var29 += Rasterizer2D.Rasterizer2D_width;
										var43 += var45;
										var46 += var48;
										var49 += var51;
									}
								}

								this.drawPixels(Rasterizer2D.Rasterizer2D_pixels, var23, 0, 0, var29, var26 >> 14, var24 >> 14, var12, var40, var43, var46, var49, var44, var47, var50);
								var24 += var37;
								var26 += var38;
								var12 += var41;
								var29 += Rasterizer2D.Rasterizer2D_width;
								var43 += var45;
								var46 += var48;
								var49 += var51;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("bl")
	@Export("Rasterizer3D_vertAlpha")
	final void Rasterizer3D_vertAlpha(int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (super.field2828.clipping) {
			if (var6 > super.field2828.clipX) {
				var6 = super.field2828.clipX;
			}

			if (var5 < 0) {
				var5 = 0;
			}
		}

		if (var5 < var6) {
			var2 += var5;
			var7 += var5 * var8;
			int var9;
			int var10;
			int var11;
			int var12;
			if (super.field2828.rasterGouraudLowRes) {
				var4 = var6 - var5 >> 2;
				var8 <<= 2;
				if (super.field2828.currentFaceAlpha == 0) {
					if (var4 > 0) {
						do {
							var9 = (var7 & ~(var7 >> 31)) >> 8;
							var3 = super.field2827[var9];
							var7 += var8;
							var1[var2++] = var3;
							var1[var2++] = var3;
							var1[var2++] = var3;
							var1[var2++] = var3;
							--var4;
						} while(var4 > 0);
					}

					var4 = var6 - var5 & 3;
					if (var4 > 0) {
						var9 = (var7 & ~(var7 >> 31)) >> 8;
						var3 = super.field2827[var9];

						do {
							var1[var2++] = var3;
							--var4;
						} while(var4 > 0);
					}
				} else {
					var9 = super.field2828.currentFaceAlpha;
					var10 = 256 - super.field2828.currentFaceAlpha;
					if (var4 > 0) {
						do {
							var11 = (var7 & ~(var7 >> 31)) >> 8;
							var3 = super.field2827[var11];
							var7 += var8;
							var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + (var10 * (var3 & 65280) >> 8 & 65280);
							var12 = var1[var2];
							var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 16711935) + (var9 * (var12 & 65280) >> 8 & 65280);
							var12 = var1[var2];
							var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 16711935) + (var9 * (var12 & 65280) >> 8 & 65280);
							var12 = var1[var2];
							var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 16711935) + (var9 * (var12 & 65280) >> 8 & 65280);
							var12 = var1[var2];
							var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 16711935) + (var9 * (var12 & 65280) >> 8 & 65280);
							--var4;
						} while(var4 > 0);
					}

					var4 = var6 - var5 & 3;
					if (var4 > 0) {
						var11 = (var7 & ~(var7 >> 31)) >> 8;
						var3 = super.field2827[var11];
						var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + (var10 * (var3 & 65280) >> 8 & 65280);

						do {
							var12 = var1[var2];
							var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 16711935) + (var9 * (var12 & 65280) >> 8 & 65280);
							--var4;
						} while(var4 > 0);
					}
				}

			} else {
				var4 = var6 - var5;
				if (super.field2828.currentFaceAlpha == 0) {
					do {
						var9 = (var7 & ~(var7 >> 31)) >> 8;
						var1[var2++] = super.field2827[var9];
						var7 += var8;
						--var4;
					} while(var4 > 0);
				} else {
					var9 = super.field2828.currentFaceAlpha;
					var10 = 256 - super.field2828.currentFaceAlpha;

					do {
						var11 = (var7 & ~(var7 >> 31)) >> 8;
						var3 = super.field2827[var11];
						var7 += var8;
						var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + (var10 * (var3 & 65280) >> 8 & 65280);
						var12 = var1[var2];
						var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 16711935) + (var9 * (var12 & 65280) >> 8 & 65280);
						--var4;
					} while(var4 > 0);
				}

			}
		}
	}

	@ObfuscatedName("bc")
	@Export("applyColorFilterToPixelsInRange")
	void applyColorFilterToPixelsInRange(int[] var1, int var2, int var3, int var4, int var5, int var6) {
		if (super.field2828.clipping) {
			if (var6 > super.field2828.clipX) {
				var6 = super.field2828.clipX;
			}

			if (var5 < 0) {
				var5 = 0;
			}
		}

		if (var5 < var6) {
			var2 += var5;
			var4 = var6 - var5 >> 2;
			if (super.field2828.currentFaceAlpha != 0) {
				if (super.field2828.currentFaceAlpha == 254) {
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
					int var7 = super.field2828.currentFaceAlpha;
					int var8 = 256 - super.field2828.currentFaceAlpha;
					var3 = ((var3 & 16711935) * var8 >> 8 & 16711935) + (var8 * (var3 & 65280) >> 8 & 65280);

					while (true) {
						--var4;
						int var9;
						if (var4 < 0) {
							var4 = var6 - var5 & 3;

							while (true) {
								--var4;
								if (var4 < 0) {
									return;
								}

								var9 = var1[var2];
								var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + (var7 * (var9 & 65280) >> 8 & 65280);
							}
						}

						var9 = var1[var2];
						var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + (var7 * (var9 & 65280) >> 8 & 65280);
						var9 = var1[var2];
						var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + (var7 * (var9 & 65280) >> 8 & 65280);
						var9 = var1[var2];
						var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + (var7 * (var9 & 65280) >> 8 & 65280);
						var9 = var1[var2];
						var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + (var7 * (var9 & 65280) >> 8 & 65280);
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

							var1[var2++] = var3;
						}
					}

					var1[var2++] = var3;
					var1[var2++] = var3;
					var1[var2++] = var3;
					var1[var2++] = var3;
				}
			}
		}
	}

	@ObfuscatedName("bq")
	@Export("processPixelsToArray")
	void processPixelsToArray(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
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
			int var18 = var7 - var6;
			int var24 = var6 - super.field2828.clipMidX;
			var10 += (var13 >> 3) * var24;
			var11 += var24 * (var14 >> 3);
			var12 += (var15 >> 3) * var24;
			int var23 = var12 >> 14;
			int var19;
			int var20;
			if (var23 != 0) {
				var19 = var10 / var23;
				var20 = var11 / var23;
				if (var19 < 0) {
					var19 = 0;
				} else if (var19 > 16256) {
					var19 = 16256;
				}
			} else {
				var19 = 0;
				var20 = 0;
			}

			var10 += var13;
			var11 += var14;
			var12 += var15;
			var23 = var12 >> 14;
			int var21;
			int var22;
			if (var23 != 0) {
				var21 = var10 / var23;
				var22 = var11 / var23;
				if (var21 < 0) {
					var21 = 0;
				} else if (var21 > 16256) {
					var21 = 16256;
				}
			} else {
				var21 = 0;
				var22 = 0;
			}

			var3 = (var19 << 18) + var20;
			int var17 = (var22 - var20 >> 3) + (var21 - var19 >> 3 << 18);
			var18 >>= 3;
			var9 <<= 3;
			int var16 = var8 >> 8;
			int var10000;
			int var25;
			int var26;
			int var27;
			int var28;
			if (super.field2826) {
				if (super.field2828.currentFaceAlpha == 0) {
					if (var18 > 0) {
						do {
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8;
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8;
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8;
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8;
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8;
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8;
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8;
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8;
							var10000 = var3 + var17;
							var19 = var21;
							var20 = var22;
							var10 += var13;
							var11 += var14;
							var12 += var15;
							var23 = var12 >> 14;
							if (var23 != 0) {
								var21 = var10 / var23;
								var22 = var11 / var23;
								if (var21 < 0) {
									var21 = 0;
								} else if (var21 > 16256) {
									var21 = 16256;
								}
							} else {
								var21 = 0;
								var22 = 0;
							}

							var3 = (var19 << 18) + var20;
							var17 = (var22 - var20 >> 3) + (var21 - var19 >> 3 << 18);
							var8 += var9;
							var16 = var8 >> 8;
							--var18;
						} while(var18 > 0);
					}

					var18 = var7 - var6 & 7;
					if (var18 > 0) {
						do {
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8;
							var3 += var17;
							--var18;
						} while(var18 > 0);
					}
				} else {
					var25 = super.field2828.currentFaceAlpha;
					var26 = 256 - super.field2828.currentFaceAlpha;
					var27 = var16 * var26 >> 8;
					if (var18 > 0) {
						do {
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var4 = (var27 * (var4 & 16711935) & -16711936 | var27 * (var4 & 65280) & 16711680) >> 8;
							var28 = var1[var5];
							var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | var25 * (var28 & 65280) & 16711680) >> 8);
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var4 = (var27 * (var4 & 16711935) & -16711936 | var27 * (var4 & 65280) & 16711680) >> 8;
							var28 = var1[var5];
							var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | var25 * (var28 & 65280) & 16711680) >> 8);
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var4 = (var27 * (var4 & 16711935) & -16711936 | var27 * (var4 & 65280) & 16711680) >> 8;
							var28 = var1[var5];
							var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | var25 * (var28 & 65280) & 16711680) >> 8);
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var4 = (var27 * (var4 & 16711935) & -16711936 | var27 * (var4 & 65280) & 16711680) >> 8;
							var28 = var1[var5];
							var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | var25 * (var28 & 65280) & 16711680) >> 8);
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var4 = (var27 * (var4 & 16711935) & -16711936 | var27 * (var4 & 65280) & 16711680) >> 8;
							var28 = var1[var5];
							var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | var25 * (var28 & 65280) & 16711680) >> 8);
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var4 = (var27 * (var4 & 16711935) & -16711936 | var27 * (var4 & 65280) & 16711680) >> 8;
							var28 = var1[var5];
							var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | var25 * (var28 & 65280) & 16711680) >> 8);
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var4 = (var27 * (var4 & 16711935) & -16711936 | var27 * (var4 & 65280) & 16711680) >> 8;
							var28 = var1[var5];
							var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | var25 * (var28 & 65280) & 16711680) >> 8);
							var3 += var17;
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var4 = (var27 * (var4 & 16711935) & -16711936 | var27 * (var4 & 65280) & 16711680) >> 8;
							var28 = var1[var5];
							var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | var25 * (var28 & 65280) & 16711680) >> 8);
							var10000 = var3 + var17;
							var19 = var21;
							var20 = var22;
							var10 += var13;
							var11 += var14;
							var12 += var15;
							var23 = var12 >> 14;
							if (var23 != 0) {
								var21 = var10 / var23;
								var22 = var11 / var23;
								if (var21 < 0) {
									var21 = 0;
								} else if (var21 > 16256) {
									var21 = 16256;
								}
							} else {
								var21 = 0;
								var22 = 0;
							}

							var3 = (var19 << 18) + var20;
							var17 = (var22 - var20 >> 3) + (var21 - var19 >> 3 << 18);
							var8 += var9;
							var16 = var8 >> 8;
							--var18;
						} while(var18 > 0);
					}

					var18 = var7 - var6 & 7;
					if (var18 > 0) {
						do {
							var4 = var2[(var3 & 16256) + (var3 >>> 25)];
							var4 = (var27 * (var4 & 16711935) & -16711936 | var27 * (var4 & 65280) & 16711680) >> 8;
							var28 = var1[var5];
							var1[var5++] = var4 + (((var28 & 16711935) * var25 & -16711936 | var25 * (var28 & 65280) & 16711680) >> 8);
							var3 += var17;
							--var18;
						} while(var18 > 0);
					}
				}
			} else if (super.field2828.currentFaceAlpha == 0) {
				if (var18 > 0) {
					do {
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8;
						}

						++var5;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8;
						}

						++var5;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8;
						}

						++var5;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8;
						}

						++var5;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8;
						}

						++var5;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8;
						}

						++var5;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8;
						}

						++var5;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8;
						}

						++var5;
						var10000 = var3 + var17;
						var19 = var21;
						var20 = var22;
						var10 += var13;
						var11 += var14;
						var12 += var15;
						var23 = var12 >> 14;
						if (var23 != 0) {
							var21 = var10 / var23;
							var22 = var11 / var23;
							if (var21 < 0) {
								var21 = 0;
							} else if (var21 > 16256) {
								var21 = 16256;
							}
						} else {
							var21 = 0;
							var22 = 0;
						}

						var3 = (var19 << 18) + var20;
						var17 = (var22 - var20 >> 3) + (var21 - var19 >> 3 << 18);
						var8 += var9;
						var16 = var8 >> 8;
						--var18;
					} while(var18 > 0);
				}

				var18 = var7 - var6 & 7;
				if (var18 > 0) {
					do {
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8;
						}

						++var5;
						var3 += var17;
						--var18;
					} while(var18 > 0);
				}
			} else {
				var25 = super.field2828.currentFaceAlpha;
				var26 = 256 - super.field2828.currentFaceAlpha;
				var27 = var16 * var26 >> 8;
				if (var18 > 0) {
					do {
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var4 = (var27 * (var4 & 16711935) & -16711936 | var27 * (var4 & 65280) & 16711680) >> 8;
							var28 = var1[var5];
							var1[var5] = var4 + (((var28 & 16711935) * var25 & -16711936 | var25 * (var28 & 65280) & 16711680) >> 8);
						}

						++var5;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var4 = (var27 * (var4 & 16711935) & -16711936 | var27 * (var4 & 65280) & 16711680) >> 8;
							var28 = var1[var5];
							var1[var5] = var4 + (((var28 & 16711935) * var25 & -16711936 | var25 * (var28 & 65280) & 16711680) >> 8);
						}

						++var5;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var4 = (var27 * (var4 & 16711935) & -16711936 | var27 * (var4 & 65280) & 16711680) >> 8;
							var28 = var1[var5];
							var1[var5] = var4 + (((var28 & 16711935) * var25 & -16711936 | var25 * (var28 & 65280) & 16711680) >> 8);
						}

						++var5;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var4 = (var27 * (var4 & 16711935) & -16711936 | var27 * (var4 & 65280) & 16711680) >> 8;
							var28 = var1[var5];
							var1[var5] = var4 + (((var28 & 16711935) * var25 & -16711936 | var25 * (var28 & 65280) & 16711680) >> 8);
						}

						++var5;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var4 = (var27 * (var4 & 16711935) & -16711936 | var27 * (var4 & 65280) & 16711680) >> 8;
							var28 = var1[var5];
							var1[var5] = var4 + (((var28 & 16711935) * var25 & -16711936 | var25 * (var28 & 65280) & 16711680) >> 8);
						}

						++var5;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var4 = (var27 * (var4 & 16711935) & -16711936 | var27 * (var4 & 65280) & 16711680) >> 8;
							var28 = var1[var5];
							var1[var5] = var4 + (((var28 & 16711935) * var25 & -16711936 | var25 * (var28 & 65280) & 16711680) >> 8);
						}

						++var5;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var4 = (var27 * (var4 & 16711935) & -16711936 | var27 * (var4 & 65280) & 16711680) >> 8;
							var28 = var1[var5];
							var1[var5] = var4 + (((var28 & 16711935) * var25 & -16711936 | var25 * (var28 & 65280) & 16711680) >> 8);
						}

						++var5;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var4 = (var27 * (var4 & 16711935) & -16711936 | var27 * (var4 & 65280) & 16711680) >> 8;
							var28 = var1[var5];
							var1[var5] = var4 + (((var28 & 16711935) * var25 & -16711936 | var25 * (var28 & 65280) & 16711680) >> 8);
						}

						++var5;
						var10000 = var3 + var17;
						var19 = var21;
						var20 = var22;
						var10 += var13;
						var11 += var14;
						var12 += var15;
						var23 = var12 >> 14;
						if (var23 != 0) {
							var21 = var10 / var23;
							var22 = var11 / var23;
							if (var21 < 0) {
								var21 = 0;
							} else if (var21 > 16256) {
								var21 = 16256;
							}
						} else {
							var21 = 0;
							var22 = 0;
						}

						var3 = (var19 << 18) + var20;
						var17 = (var22 - var20 >> 3) + (var21 - var19 >> 3 << 18);
						var8 += var9;
						var16 = var8 >> 8;
						--var18;
					} while(var18 > 0);
				}

				var18 = var7 - var6 & 7;
				if (var18 > 0) {
					do {
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var4 = (var27 * (var4 & 16711935) & -16711936 | var27 * (var4 & 65280) & 16711680) >> 8;
							var28 = var1[var5];
							var1[var5] = var4 + (((var28 & 16711935) * var25 & -16711936 | var25 * (var28 & 65280) & 16711680) >> 8);
						}

						++var5;
						var3 += var17;
						--var18;
					} while(var18 > 0);
				}
			}

		}
	}

	@ObfuscatedName("bx")
	@Export("drawPixels")
	void drawPixels(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
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
			int var18 = var7 - var6;
			int var24 = var6 - super.field2828.clipMidX;
			var10 += var13 * var24;
			var11 += var24 * var14;
			var12 += var24 * var15;
			int var23 = var12 >> 14;
			int var19;
			int var20;
			if (var23 != 0) {
				var19 = var10 / var23;
				var20 = var11 / var23;
			} else {
				var19 = 0;
				var20 = 0;
			}

			var10 += var13 * var18;
			var11 += var18 * var14;
			var12 += var18 * var15;
			var23 = var12 >> 14;
			int var21;
			int var22;
			if (var23 != 0) {
				var21 = var10 / var23;
				var22 = var11 / var23;
			} else {
				var21 = 0;
				var22 = 0;
			}

			var3 = (var19 << 18) + var20;
			int var17 = (var22 - var20) / var18 + ((var21 - var19) / var18 << 18);
			var18 >>= 3;
			var9 <<= 3;
			int var16 = var8 >> 8;
			if (super.field2826) {
				if (var18 > 0) {
					do {
						var4 = var2[(var3 & 16256) + (var3 >>> 25)];
						var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8;
						var3 += var17;
						var4 = var2[(var3 & 16256) + (var3 >>> 25)];
						var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8;
						var3 += var17;
						var4 = var2[(var3 & 16256) + (var3 >>> 25)];
						var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8;
						var3 += var17;
						var4 = var2[(var3 & 16256) + (var3 >>> 25)];
						var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8;
						var3 += var17;
						var4 = var2[(var3 & 16256) + (var3 >>> 25)];
						var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8;
						var3 += var17;
						var4 = var2[(var3 & 16256) + (var3 >>> 25)];
						var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8;
						var3 += var17;
						var4 = var2[(var3 & 16256) + (var3 >>> 25)];
						var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8;
						var3 += var17;
						var4 = var2[(var3 & 16256) + (var3 >>> 25)];
						var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8;
						var3 += var17;
						var8 += var9;
						var16 = var8 >> 8;
						--var18;
					} while(var18 > 0);
				}

				var18 = var7 - var6 & 7;
				if (var18 > 0) {
					do {
						var4 = var2[(var3 & 16256) + (var3 >>> 25)];
						var1[var5++] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8;
						var3 += var17;
						--var18;
					} while(var18 > 0);
				}
			} else {
				if (var18 > 0) {
					do {
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8;
						}

						++var5;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8;
						}

						++var5;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8;
						}

						++var5;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8;
						}

						++var5;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8;
						}

						++var5;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8;
						}

						++var5;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8;
						}

						++var5;
						var3 += var17;
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8;
						}

						++var5;
						var3 += var17;
						var8 += var9;
						var16 = var8 >> 8;
						--var18;
					} while(var18 > 0);
				}

				var18 = var7 - var6 & 7;
				if (var18 > 0) {
					do {
						if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
							var1[var5] = (var16 * (var4 & 16711935) & -16711936) + (var16 * (var4 & 65280) & 16711680) >> 8;
						}

						++var5;
						var3 += var17;
						--var18;
					} while(var18 > 0);
				}
			}

		}
	}
}
