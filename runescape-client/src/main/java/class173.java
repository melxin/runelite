import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gw")
public class class173 extends class166 {
	@ObfuscatedName("ab")
	String field1933;
	@ObfuscatedName("at")
	byte field1929;
	@ObfuscatedName("ag")
	byte field1930;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgc;"
	)
	final class167 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgc;)V"
	)
	class173(class167 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "2073998337"
	)
	void vmethod4154(Buffer var1) {
		this.field1933 = var1.readStringCp1252NullTerminatedOrNull();
		if (this.field1933 != null) {
			var1.readUnsignedByte();
			this.field1929 = var1.readByte();
			this.field1930 = var1.readByte();
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lgr;I)V",
		garbageValue = "2002767604"
	)
	void vmethod4151(ClanChannel var1) {
		var1.name = this.field1933;
		if (this.field1933 != null) {
			var1.field1917 = this.field1929;
			var1.field1916 = this.field1930;
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([FIFZFZ[FB)I",
		garbageValue = "1"
	)
	public static int method4150(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6) {
		float var7 = 0.0F;

		for (int var8 = 0; var8 < var1 + 1; ++var8) {
			var7 += Math.abs(var0[var8]);
		}

		float var44 = (Math.abs(var2) + Math.abs(var4)) * (float)(var1 + 1) * class133.field1614;
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
				boolean var42 = var3 ? var2 < var44 + var6[0] : var2 < var6[0] - var44;
				boolean var43 = var5 ? var4 > var6[0] - var44 : var4 > var6[0] + var44;
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
				class454 var11 = new class454(var9, var1);
				float[] var12 = new float[var1 + 1];

				for (int var13 = 1; var13 <= var1; ++var13) {
					var12[var13 - 1] = var9[var13] * (float)var13;
				}

				float[] var41 = new float[var1 + 1];
				int var14 = method4150(var12, var1 - 1, var2, false, var4, false, var41);
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
							var18 = ArchiveDiskActionHandler.method8340(var9, var1, var2);
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

						var17 = ArchiveDiskActionHandler.method8340(var9, var1, var19);
						if (var15) {
							var15 = false;
						} else if (Math.abs(var17) < var44) {
							if (var20 != var14 || var5) {
								var6[var10++] = var19;
								var15 = true;
							}
						} else if (var18 < 0.0F && var17 > 0.0F || var18 > 0.0F && var17 < 0.0F) {
							int var22 = var10++;
							float var24 = var16;
							float var25 = var19;
							float var26 = ArchiveDiskActionHandler.method8340(var11.field5251, var11.field5250, var16);
							float var23;
							if (Math.abs(var26) < class133.field1614) {
								var23 = var16;
							} else {
								float var27 = ArchiveDiskActionHandler.method8340(var11.field5251, var11.field5250, var19);
								if (Math.abs(var27) < class133.field1614) {
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

										float var38 = class133.field1616 * Math.abs(var25) + 0.0F;
										float var39 = (var28 - var25) * 0.5F;
										boolean var40 = Math.abs(var39) > var38 && 0.0F != var27;
										if (var40) {
											if (Math.abs(var30) >= var38 && Math.abs(var26) > Math.abs(var27)) {
												float var34 = var27 / var26;
												float var31;
												float var32;
												if (var28 == var24) {
													var31 = var39 * 2.0F * var34;
													var32 = 1.0F - var34;
												} else {
													var32 = var26 / var35;
													float var33 = var27 / var35;
													var31 = var34 * ((var32 - var33) * var32 * 2.0F * var39 - (var25 - var24) * (var33 - 1.0F));
													var32 = (var34 - 1.0F) * (var33 - 1.0F) * (var32 - 1.0F);
												}

												if ((double)var31 > 0.0D) {
													var32 = -var32;
												} else {
													var31 = -var31;
												}

												var34 = var30;
												var30 = var29;
												if (var31 * 2.0F < 3.0F * var39 * var32 - Math.abs(var32 * var38) && var31 < Math.abs(var32 * var34 * 0.5F)) {
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

											var27 = ArchiveDiskActionHandler.method8340(var11.field5251, var11.field5250, var25);
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
								var6[var10 - 2] = 0.5F * (var6[var10 - 1] + var6[var10 - 2]);
								--var10;
							}
						}
					}

					return var10;
				}
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "711954799"
	)
	public static void method4158() {
		ViewportMouse.ViewportMouse_false0 = false;
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "-1676184156"
	)
	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) {
			var2 = 1;
		}

		if (var3 < 1) {
			var3 = 1;
		}

		int var5 = var3 - 334;
		int var6;
		if (var5 < 0) {
			var6 = Client.field347;
		} else if (var5 >= 100) {
			var6 = Client.field348;
		} else {
			var6 = (Client.field348 - Client.field347) * var5 / 100 + Client.field347;
		}

		int var7 = var3 * var6 * 512 / (var2 * 334);
		int var8;
		int var9;
		short var17;
		if (var7 < Client.field353) {
			var17 = Client.field353;
			var6 = var17 * var2 * 334 / (var3 * 512);
			if (var6 > Client.field352) {
				var6 = Client.field352;
				var8 = var3 * var6 * 512 / (var17 * 334);
				var9 = (var2 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216);
				}

				var0 += var9;
				var2 -= var9 * 2;
			}
		} else if (var7 > Client.field354) {
			var17 = Client.field354;
			var6 = var17 * var2 * 334 / (var3 * 512);
			if (var6 < Client.field458) {
				var6 = Client.field458;
				var8 = var17 * var2 * 334 / (var6 * 512);
				var9 = (var3 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216);
				}

				var1 += var9;
				var3 -= var9 * 2;
			}
		}

		Client.viewportZoom = var3 * var6 / 334;
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) {
			int[] var16 = new int[9];

			for (var9 = 0; var9 < var16.length; ++var9) {
				int var10 = var9 * 32 + 15 + 128;
				int var11 = Occluder.method5463(var10);
				int var12 = Rasterizer3D.Rasterizer3D_sine[var10];
				int var14 = var3 - 334;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 100) {
					var14 = 100;
				}

				int var15 = (Client.zoomWidth - Client.zoomHeight) * var14 / 100 + Client.zoomHeight;
				int var13 = var11 * var15 / 256;
				var16[var9] = var13 * var12 >> 16;
			}

			class547.topLevelWorldView.scene.method5405(var16, 500, 800, var2 * 334 / var3, 334);
		}

		Client.viewportOffsetX = var0;
		Client.viewportOffsetY = var1;
		Client.viewportWidth = var2;
		Client.viewportHeight = var3;
	}
}
