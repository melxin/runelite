import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kk")
public class class280 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Lkb;"
	)
	class276[] field3208;

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-115"
	)
	public void method6324() {
		this.field3208 = new class276[1];
		class274 var1 = class274.field3163;
		this.field3208[0] = new class276(var1.field3170, var1.field3171);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIILkq;Lkp;Z[I[IB)I",
		garbageValue = "63"
	)
	public int method6312(int var1, int var2, int var3, RouteStrategy var4, CollisionMap var5, boolean var6, int[] var7, int[] var8) {
		return this.method6329(var1, var2, var3, var4, var5, var6, var7, var8, this.field3208[0]);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIILkq;Lkp;Z[I[ILkb;I)I",
		garbageValue = "-1910129227"
	)
	int method6329(int var1, int var2, int var3, RouteStrategy var4, CollisionMap var5, boolean var6, int[] var7, int[] var8, class276 var9) {
		var9.method6213();
		int var10 = var9.method6217();
		int var11 = var9.method6244();
		int[][] var12 = var9.method6220();
		int[][] var13 = var9.method6219();
		int[] var14 = var9.method6221();
		int[] var15 = var9.method6218();
		boolean var16;
		if (var3 == 1) {
			var16 = this.method6314(var1, var2, var4, var5, var9);
		} else if (var3 == 2) {
			var16 = this.method6315(var1, var2, var4, var5, var9);
		} else {
			var16 = this.method6332(var1, var2, var3, var4, var5, var9);
		}

		int var17 = var1 - (var10 >> 1);
		int var18 = var2 - (var11 >> 1);
		int var19 = var9.method6223();
		int var20 = var9.method6216();
		int var21;
		int var22;
		int var24;
		if (!var16) {
			if (!var6) {
				return -1;
			}

			var21 = Integer.MAX_VALUE;
			var22 = Integer.MAX_VALUE;
			byte var23 = 10;
			var24 = var4.approxDestinationX;
			int var25 = var4.approxDestinationY;
			int var26 = var4.approxDestinationSizeX;
			int var27 = var4.approxDestinationSizeY;

			for (int var28 = var24 - var23; var28 <= var24 + var23; ++var28) {
				for (int var29 = var25 - var23; var29 <= var23 + var25; ++var29) {
					int var30 = var28 - var17;
					int var31 = var29 - var18;
					if (var30 >= 0 && var31 >= 0 && var30 < var10 && var31 < var11 && var12[var30][var31] < 100) {
						int var32 = 0;
						if (var28 < var24) {
							var32 = var24 - var28;
						} else if (var28 > var26 + var24 - 1) {
							var32 = var28 - (var24 + var26 - 1);
						}

						int var33 = 0;
						if (var29 < var25) {
							var33 = var25 - var29;
						} else if (var29 > var25 + var27 - 1) {
							var33 = var29 - (var27 + var25 - 1);
						}

						int var34 = var32 * var32 + var33 * var33;
						if (var34 < var21 || var21 == var34 && var12[var30][var31] < var22) {
							var21 = var34;
							var22 = var12[var30][var31];
							var19 = var28;
							var20 = var29;
						}
					}
				}
			}

			if (var21 == Integer.MAX_VALUE) {
				return -1;
			}
		}

		if (var19 == var1 && var20 == var2) {
			var7[0] = var19;
			var8[0] = var20;
			return 0;
		} else {
			byte var36 = 0;
			var14[var36] = var19;
			var21 = var36 + 1;
			var15[var36] = var20;

			int var37;
			for (var22 = var37 = var13[var19 - var17][var20 - var18]; var19 != var1 || var20 != var2; var22 = var13[var19 - var17][var20 - var18]) {
				if (var22 != var37) {
					var37 = var22;
					var14[var21] = var19;
					var15[var21++] = var20;
				}

				if ((var22 & 2) != 0) {
					++var19;
				} else if ((var22 & 8) != 0) {
					--var19;
				}

				if ((var22 & 1) != 0) {
					++var20;
				} else if ((var22 & 4) != 0) {
					--var20;
				}
			}

			var24 = 0;

			while (var21-- > 0) {
				var7[var24] = var14[var21];
				var8[var24++] = var15[var21];
				if (var24 >= var7.length) {
					break;
				}
			}

			return var24;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IILkq;Lkp;Lkb;B)Z",
		garbageValue = "-116"
	)
	final boolean method6314(int var1, int var2, RouteStrategy var3, CollisionMap var4, class276 var5) {
		int var6 = var5.method6217();
		int var7 = var5.method6244();
		int[][] var8 = var5.method6220();
		int[][] var9 = var5.method6219();
		int[] var10 = var5.method6221();
		int[] var11 = var5.method6218();
		int var12 = var5.method6212();
		int var13 = var1;
		int var14 = var2;
		int var15 = var6 >> 1;
		int var16 = var7 >> 1;
		int var17 = var1 - var15;
		int var18 = var2 - var16;
		var9[var15][var16] = 99;
		var8[var15][var16] = 0;
		byte var19 = 0;
		int var20 = 0;
		var10[var19] = var1;
		byte var10001 = var19;
		int var24 = var19 + 1;
		var11[var10001] = var2;

		while (var24 != var20) {
			var13 = var10[var20];
			var14 = var11[var20];
			var20 = var20 + 1 & var12;
			var15 = var13 - var17;
			var16 = var14 - var18;
			int var21 = var13 - var4.method6129();
			int var22 = var14 - var4.method6130();
			if (var3.hasArrived(1, var13, var14, var4)) {
				var5.method6214(var13, var14);
				return true;
			}

			int var23 = var8[var15][var16] + 1;
			if (var15 > 0 && var9[var15 - 1][var16] == 0 && !var4.method6134(var21 - 1, var22, 1076101384)) {
				var10[var24] = var13 - 1;
				var11[var24] = var14;
				var24 = var24 + 1 & var12;
				var9[var15 - 1][var16] = 2;
				var8[var15 - 1][var16] = var23;
			}

			if (var15 < var6 - 1 && var9[var15 + 1][var16] == 0 && !var4.method6134(var21 + 1, var22, 1076101504)) {
				var10[var24] = var13 + 1;
				var11[var24] = var14;
				var24 = var24 + 1 & var12;
				var9[var15 + 1][var16] = 8;
				var8[var15 + 1][var16] = var23;
			}

			if (var16 > 0 && var9[var15][var16 - 1] == 0 && !var4.method6134(var21, var22 - 1, 1076101378)) {
				var10[var24] = var13;
				var11[var24] = var14 - 1;
				var24 = var24 + 1 & var12;
				var9[var15][var16 - 1] = 1;
				var8[var15][var16 - 1] = var23;
			}

			if (var16 < var7 - 1 && var9[var15][var16 + 1] == 0 && !var4.method6134(var21, var22 + 1, 1076101408)) {
				var10[var24] = var13;
				var11[var24] = var14 + 1;
				var24 = var24 + 1 & var12;
				var9[var15][var16 + 1] = 4;
				var8[var15][var16 + 1] = var23;
			}

			if (var15 > 0 && var16 > 0 && var9[var15 - 1][var16 - 1] == 0 && !var4.method6134(var21 - 1, var22 - 1, 1076101390) && !var4.method6134(var21 - 1, var22, 1076101384) && !var4.method6134(var21, var22 - 1, 1076101378)) {
				var10[var24] = var13 - 1;
				var11[var24] = var14 - 1;
				var24 = var24 + 1 & var12;
				var9[var15 - 1][var16 - 1] = 3;
				var8[var15 - 1][var16 - 1] = var23;
			}

			if (var15 < var6 - 1 && var16 > 0 && var9[var15 + 1][var16 - 1] == 0 && !var4.method6134(var21 + 1, var22 - 1, 1076101507) && !var4.method6134(var21 + 1, var22, 1076101504) && !var4.method6134(var21, var22 - 1, 1076101378)) {
				var10[var24] = var13 + 1;
				var11[var24] = var14 - 1;
				var24 = var24 + 1 & var12;
				var9[var15 + 1][var16 - 1] = 9;
				var8[var15 + 1][var16 - 1] = var23;
			}

			if (var15 > 0 && var16 < var7 - 1 && var9[var15 - 1][var16 + 1] == 0 && !var4.method6134(var21 - 1, var22 + 1, 1076101432) && !var4.method6134(var21 - 1, var22, 1076101384) && !var4.method6134(var21, var22 + 1, 1076101408)) {
				var10[var24] = var13 - 1;
				var11[var24] = var14 + 1;
				var24 = var24 + 1 & var12;
				var9[var15 - 1][var16 + 1] = 6;
				var8[var15 - 1][var16 + 1] = var23;
			}

			if (var15 < var6 - 1 && var16 < var7 - 1 && var9[var15 + 1][var16 + 1] == 0 && !var4.method6134(var21 + 1, var22 + 1, 1076101600) && !var4.method6134(var21 + 1, var22, 1076101504) && !var4.method6134(var21, var22 + 1, 1076101408)) {
				var10[var24] = var13 + 1;
				var11[var24] = var14 + 1;
				var24 = var24 + 1 & var12;
				var9[var15 + 1][var16 + 1] = 12;
				var8[var15 + 1][var16 + 1] = var23;
			}
		}

		var5.method6214(var13, var14);
		return false;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IILkq;Lkp;Lkb;I)Z",
		garbageValue = "-527712967"
	)
	final boolean method6315(int var1, int var2, RouteStrategy var3, CollisionMap var4, class276 var5) {
		int var6 = var5.method6217();
		int var7 = var5.method6244();
		int[][] var8 = var5.method6220();
		int[][] var9 = var5.method6219();
		int[] var10 = var5.method6221();
		int[] var11 = var5.method6218();
		int var12 = var5.method6212();
		int var13 = var1;
		int var14 = var2;
		int var15 = var6 >> 1;
		int var16 = var7 >> 1;
		int var17 = var1 - var15;
		int var18 = var2 - var16;
		var9[var15][var16] = 99;
		var8[var15][var16] = 0;
		byte var19 = 0;
		int var20 = 0;
		var10[var19] = var1;
		byte var10001 = var19;
		int var24 = var19 + 1;
		var11[var10001] = var2;

		while (var24 != var20) {
			var13 = var10[var20];
			var14 = var11[var20];
			var20 = var20 + 1 & var12;
			var15 = var13 - var17;
			var16 = var14 - var18;
			int var21 = var13 - var4.method6129();
			int var22 = var14 - var4.method6130();
			if (var3.hasArrived(2, var13, var14, var4)) {
				var5.method6214(var13, var14);
				return true;
			}

			int var23 = var8[var15][var16] + 1;
			if (var15 > 0 && var9[var15 - 1][var16] == 0 && !var4.method6134(var21 - 1, var22, 1076101390) && !var4.method6134(var21 - 1, var22 + 1, 1076101432)) {
				var10[var24] = var13 - 1;
				var11[var24] = var14;
				var24 = var24 + 1 & var12;
				var9[var15 - 1][var16] = 2;
				var8[var15 - 1][var16] = var23;
			}

			if (var15 < var6 - 2 && var9[var15 + 1][var16] == 0 && !var4.method6134(var21 + 2, var22, 1076101507) && !var4.method6134(var21 + 2, var22 + 1, 1076101600)) {
				var10[var24] = var13 + 1;
				var11[var24] = var14;
				var24 = var24 + 1 & var12;
				var9[var15 + 1][var16] = 8;
				var8[var15 + 1][var16] = var23;
			}

			if (var16 > 0 && var9[var15][var16 - 1] == 0 && !var4.method6134(var21, var22 - 1, 1076101390) && !var4.method6134(var21 + 1, var22 - 1, 1076101507)) {
				var10[var24] = var13;
				var11[var24] = var14 - 1;
				var24 = var24 + 1 & var12;
				var9[var15][var16 - 1] = 1;
				var8[var15][var16 - 1] = var23;
			}

			if (var16 < var7 - 2 && var9[var15][var16 + 1] == 0 && !var4.method6134(var21, var22 + 2, 1076101432) && !var4.method6134(var21 + 1, var22 + 2, 1076101600)) {
				var10[var24] = var13;
				var11[var24] = var14 + 1;
				var24 = var24 + 1 & var12;
				var9[var15][var16 + 1] = 4;
				var8[var15][var16 + 1] = var23;
			}

			if (var15 > 0 && var16 > 0 && var9[var15 - 1][var16 - 1] == 0 && !var4.method6134(var21 - 1, var22, 1076101438) && !var4.method6134(var21 - 1, var22 - 1, 1076101390) && !var4.method6134(var21, var22 - 1, 1076101519)) {
				var10[var24] = var13 - 1;
				var11[var24] = var14 - 1;
				var24 = var24 + 1 & var12;
				var9[var15 - 1][var16 - 1] = 3;
				var8[var15 - 1][var16 - 1] = var23;
			}

			if (var15 < var6 - 2 && var16 > 0 && var9[var15 + 1][var16 - 1] == 0 && !var4.method6134(var21 + 1, var22 - 1, 1076101519) && !var4.method6134(var21 + 2, var22 - 1, 1076101507) && !var4.method6134(var21 + 2, var22, 1076101603)) {
				var10[var24] = var13 + 1;
				var11[var24] = var14 - 1;
				var24 = var24 + 1 & var12;
				var9[var15 + 1][var16 - 1] = 9;
				var8[var15 + 1][var16 - 1] = var23;
			}

			if (var15 > 0 && var16 < var7 - 2 && var9[var15 - 1][var16 + 1] == 0 && !var4.method6134(var21 - 1, var22 + 1, 1076101438) && !var4.method6134(var21 - 1, var22 + 2, 1076101432) && !var4.method6134(var21, var22 + 2, 1076101624)) {
				var10[var24] = var13 - 1;
				var11[var24] = var14 + 1;
				var24 = var24 + 1 & var12;
				var9[var15 - 1][var16 + 1] = 6;
				var8[var15 - 1][var16 + 1] = var23;
			}

			if (var15 < var6 - 2 && var16 < var7 - 2 && var9[var15 + 1][var16 + 1] == 0 && !var4.method6134(var21 + 1, var22 + 2, 1076101624) && !var4.method6134(var21 + 2, var22 + 2, 1076101600) && !var4.method6134(var21 + 2, var22 + 1, 1076101603)) {
				var10[var24] = var13 + 1;
				var11[var24] = var14 + 1;
				var24 = var24 + 1 & var12;
				var9[var15 + 1][var16 + 1] = 12;
				var8[var15 + 1][var16 + 1] = var23;
			}
		}

		var5.method6214(var13, var14);
		return false;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIILkq;Lkp;Lkb;I)Z",
		garbageValue = "60695862"
	)
	final boolean method6332(int var1, int var2, int var3, RouteStrategy var4, CollisionMap var5, class276 var6) {
		int var7 = var6.method6217();
		int var8 = var6.method6244();
		int[][] var9 = var6.method6220();
		int[][] var10 = var6.method6219();
		int[] var11 = var6.method6221();
		int[] var12 = var6.method6218();
		int var13 = var6.method6212();
		int var14 = var1;
		int var15 = var2;
		int var16 = var7 >> 1;
		int var17 = var8 >> 1;
		int var18 = var1 - var16;
		int var19 = var2 - var17;
		var10[var16][var17] = 99;
		var9[var16][var17] = 0;
		byte var20 = 0;
		int var21 = 0;
		var11[var20] = var1;
		int var26 = var20 + 1;
		var12[var20] = var2;

		while (true) {
			label308:
			while (true) {
				int var22;
				int var23;
				int var24;
				int var25;
				do {
					do {
						do {
							label285:
							do {
								if (var26 == var21) {
									var6.method6214(var14, var15);
									return false;
								}

								var14 = var11[var21];
								var15 = var12[var21];
								var21 = var21 + 1 & var13;
								var16 = var14 - var18;
								var17 = var15 - var19;
								var22 = var14 - var5.method6129();
								var23 = var15 - var5.method6130();
								if (var4.hasArrived(var3, var14, var15, var5)) {
									var6.method6214(var14, var15);
									return true;
								}

								var24 = var9[var16][var17] + 1;
								if (var16 > 0 && var10[var16 - 1][var17] == 0 && !var5.method6134(var22 - 1, var23, 1076101390) && !var5.method6134(var22 - 1, var3 + var23 - 1, 1076101432)) {
									var25 = 1;

									while (true) {
										if (var25 >= var3 - 1) {
											var11[var26] = var14 - 1;
											var12[var26] = var15;
											var26 = var26 + 1 & var13;
											var10[var16 - 1][var17] = 2;
											var9[var16 - 1][var17] = var24;
											break;
										}

										if (var5.method6134(var22 - 1, var25 + var23, 1076101438)) {
											break;
										}

										++var25;
									}
								}

								if (var16 < var7 - var3 && var10[var16 + 1][var17] == 0 && !var5.method6134(var3 + var22, var23, 1076101507) && !var5.method6134(var3 + var22, var3 + var23 - 1, 1076101600)) {
									var25 = 1;

									while (true) {
										if (var25 >= var3 - 1) {
											var11[var26] = var14 + 1;
											var12[var26] = var15;
											var26 = var26 + 1 & var13;
											var10[var16 + 1][var17] = 8;
											var9[var16 + 1][var17] = var24;
											break;
										}

										if (var5.method6134(var3 + var22, var23 + var25, 1076101603)) {
											break;
										}

										++var25;
									}
								}

								if (var17 > 0 && var10[var16][var17 - 1] == 0 && !var5.method6134(var22, var23 - 1, 1076101390) && !var5.method6134(var3 + var22 - 1, var23 - 1, 1076101507)) {
									var25 = 1;

									while (true) {
										if (var25 >= var3 - 1) {
											var11[var26] = var14;
											var12[var26] = var15 - 1;
											var26 = var26 + 1 & var13;
											var10[var16][var17 - 1] = 1;
											var9[var16][var17 - 1] = var24;
											break;
										}

										if (var5.method6134(var25 + var22, var23 - 1, 1076101519)) {
											break;
										}

										++var25;
									}
								}

								if (var17 < var8 - var3 && var10[var16][var17 + 1] == 0 && !var5.method6134(var22, var3 + var23, 1076101432) && !var5.method6134(var3 + var22 - 1, var3 + var23, 1076101600)) {
									var25 = 1;

									while (true) {
										if (var25 >= var3 - 1) {
											var11[var26] = var14;
											var12[var26] = var15 + 1;
											var26 = var26 + 1 & var13;
											var10[var16][var17 + 1] = 4;
											var9[var16][var17 + 1] = var24;
											break;
										}

										if (var5.method6134(var22 + var25, var3 + var23, 1076101624)) {
											break;
										}

										++var25;
									}
								}

								if (var16 > 0 && var17 > 0 && var10[var16 - 1][var17 - 1] == 0 && !var5.method6134(var22 - 1, var23 - 1, 1076101390)) {
									var25 = 1;

									while (true) {
										if (var25 >= var3) {
											var11[var26] = var14 - 1;
											var12[var26] = var15 - 1;
											var26 = var26 + 1 & var13;
											var10[var16 - 1][var17 - 1] = 3;
											var9[var16 - 1][var17 - 1] = var24;
											break;
										}

										if (var5.method6134(var22 - 1, var25 + (var23 - 1), 1076101438) || var5.method6134(var25 + (var22 - 1), var23 - 1, 1076101519)) {
											break;
										}

										++var25;
									}
								}

								if (var16 < var7 - var3 && var17 > 0 && var10[var16 + 1][var17 - 1] == 0 && !var5.method6134(var3 + var22, var23 - 1, 1076101507)) {
									var25 = 1;

									while (true) {
										if (var25 >= var3) {
											var11[var26] = var14 + 1;
											var12[var26] = var15 - 1;
											var26 = var26 + 1 & var13;
											var10[var16 + 1][var17 - 1] = 9;
											var9[var16 + 1][var17 - 1] = var24;
											break;
										}

										if (var5.method6134(var3 + var22, var25 + (var23 - 1), 1076101603) || var5.method6134(var22 + var25, var23 - 1, 1076101519)) {
											break;
										}

										++var25;
									}
								}

								if (var16 > 0 && var17 < var8 - var3 && var10[var16 - 1][var17 + 1] == 0 && !var5.method6134(var22 - 1, var3 + var23, 1076101432)) {
									for (var25 = 1; var25 < var3; ++var25) {
										if (var5.method6134(var22 - 1, var25 + var23, 1076101438) || var5.method6134(var25 + (var22 - 1), var3 + var23, 1076101624)) {
											continue label285;
										}
									}

									var11[var26] = var14 - 1;
									var12[var26] = var15 + 1;
									var26 = var26 + 1 & var13;
									var10[var16 - 1][var17 + 1] = 6;
									var9[var16 - 1][var17 + 1] = var24;
								}
							} while(var16 >= var7 - var3);
						} while(var17 >= var8 - var3);
					} while(var10[var16 + 1][var17 + 1] != 0);
				} while(var5.method6134(var3 + var22, var3 + var23, 1076101600));

				for (var25 = 1; var25 < var3; ++var25) {
					if (var5.method6134(var25 + var22, var3 + var23, 1076101624) || var5.method6134(var3 + var22, var25 + var23, 1076101603)) {
						continue label308;
					}
				}

				var11[var26] = var14 + 1;
				var12[var26] = var15 + 1;
				var26 = var26 + 1 & var13;
				var10[var16 + 1][var17 + 1] = 12;
				var9[var16 + 1][var17 + 1] = var24;
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "16"
	)
	public static int method6334(int var0, int var1) {
		return (-3 - var0 << 8) + var1;
	}
}
