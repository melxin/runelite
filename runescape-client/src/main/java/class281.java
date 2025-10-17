import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ku")
public class class281 {
	@ObfuscatedName("ar")
	@Export("ItemDefinition_inMembersWorld")
	public static boolean ItemDefinition_inMembersWorld;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lkf;"
	)
	class277[] field3286;

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-117"
	)
	public void method6375() {
		this.field3286 = new class277[1];
		class275 var1 = class275.field3242;
		this.field3286[0] = new class277(var1.field3249, var1.field3250);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIILkc;Lke;Z[I[II)I",
		garbageValue = "2129927547"
	)
	public int method6348(int var1, int var2, int var3, RouteStrategy var4, CollisionMap var5, boolean var6, int[] var7, int[] var8) {
		return this.method6349(var1, var2, var3, var4, var5, var6, var7, var8, this.field3286[0]);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIILkc;Lke;Z[I[ILkf;B)I",
		garbageValue = "0"
	)
	int method6349(int var1, int var2, int var3, RouteStrategy var4, CollisionMap var5, boolean var6, int[] var7, int[] var8, class277 var9) {
		var9.method6253();
		int var10 = var9.method6249();
		int var11 = var9.method6282();
		int[][] var12 = var9.method6257();
		int[][] var13 = var9.method6256();
		int[] var14 = var9.method6258();
		int[] var15 = var9.method6259();
		boolean var16;
		if (var3 == 1) {
			var16 = this.method6353(var1, var2, var4, var5, var9);
		} else if (var3 == 2) {
			var16 = this.method6351(var1, var2, var4, var5, var9);
		} else {
			var16 = this.method6352(var1, var2, var3, var4, var5, var9);
		}

		int var17 = var1 - (var10 >> 1);
		int var18 = var2 - (var11 >> 1);
		int var19 = var9.method6252();
		int var20 = var9.method6281();
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

			for (int var28 = var24 - var23; var28 <= var23 + var24; ++var28) {
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
							var33 = var29 - (var25 + var27 - 1);
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IILkc;Lke;Lkf;I)Z",
		garbageValue = "775660287"
	)
	final boolean method6353(int var1, int var2, RouteStrategy var3, CollisionMap var4, class277 var5) {
		int var6 = var5.method6249();
		int var7 = var5.method6282();
		int[][] var8 = var5.method6257();
		int[][] var9 = var5.method6256();
		int[] var10 = var5.method6258();
		int[] var11 = var5.method6259();
		int var12 = var5.method6269();
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
			int var21 = var13 - var4.method6172();
			int var22 = var14 - var4.method6173();
			if (var3.hasArrived(1, var13, var14, var4)) {
				var5.method6251(var13, var14);
				return true;
			}

			int var23 = var8[var15][var16] + 1;
			if (var15 > 0 && var9[var15 - 1][var16] == 0 && !var4.method6217(var21 - 1, var22, 1076101384)) {
				var10[var24] = var13 - 1;
				var11[var24] = var14;
				var24 = var24 + 1 & var12;
				var9[var15 - 1][var16] = 2;
				var8[var15 - 1][var16] = var23;
			}

			if (var15 < var6 - 1 && var9[var15 + 1][var16] == 0 && !var4.method6217(var21 + 1, var22, 1076101504)) {
				var10[var24] = var13 + 1;
				var11[var24] = var14;
				var24 = var24 + 1 & var12;
				var9[var15 + 1][var16] = 8;
				var8[var15 + 1][var16] = var23;
			}

			if (var16 > 0 && var9[var15][var16 - 1] == 0 && !var4.method6217(var21, var22 - 1, 1076101378)) {
				var10[var24] = var13;
				var11[var24] = var14 - 1;
				var24 = var24 + 1 & var12;
				var9[var15][var16 - 1] = 1;
				var8[var15][var16 - 1] = var23;
			}

			if (var16 < var7 - 1 && var9[var15][var16 + 1] == 0 && !var4.method6217(var21, var22 + 1, 1076101408)) {
				var10[var24] = var13;
				var11[var24] = var14 + 1;
				var24 = var24 + 1 & var12;
				var9[var15][var16 + 1] = 4;
				var8[var15][var16 + 1] = var23;
			}

			if (var15 > 0 && var16 > 0 && var9[var15 - 1][var16 - 1] == 0 && !var4.method6217(var21 - 1, var22 - 1, 1076101390) && !var4.method6217(var21 - 1, var22, 1076101384) && !var4.method6217(var21, var22 - 1, 1076101378)) {
				var10[var24] = var13 - 1;
				var11[var24] = var14 - 1;
				var24 = var24 + 1 & var12;
				var9[var15 - 1][var16 - 1] = 3;
				var8[var15 - 1][var16 - 1] = var23;
			}

			if (var15 < var6 - 1 && var16 > 0 && var9[var15 + 1][var16 - 1] == 0 && !var4.method6217(var21 + 1, var22 - 1, 1076101507) && !var4.method6217(var21 + 1, var22, 1076101504) && !var4.method6217(var21, var22 - 1, 1076101378)) {
				var10[var24] = var13 + 1;
				var11[var24] = var14 - 1;
				var24 = var24 + 1 & var12;
				var9[var15 + 1][var16 - 1] = 9;
				var8[var15 + 1][var16 - 1] = var23;
			}

			if (var15 > 0 && var16 < var7 - 1 && var9[var15 - 1][var16 + 1] == 0 && !var4.method6217(var21 - 1, var22 + 1, 1076101432) && !var4.method6217(var21 - 1, var22, 1076101384) && !var4.method6217(var21, var22 + 1, 1076101408)) {
				var10[var24] = var13 - 1;
				var11[var24] = var14 + 1;
				var24 = var24 + 1 & var12;
				var9[var15 - 1][var16 + 1] = 6;
				var8[var15 - 1][var16 + 1] = var23;
			}

			if (var15 < var6 - 1 && var16 < var7 - 1 && var9[var15 + 1][var16 + 1] == 0 && !var4.method6217(var21 + 1, var22 + 1, 1076101600) && !var4.method6217(var21 + 1, var22, 1076101504) && !var4.method6217(var21, var22 + 1, 1076101408)) {
				var10[var24] = var13 + 1;
				var11[var24] = var14 + 1;
				var24 = var24 + 1 & var12;
				var9[var15 + 1][var16 + 1] = 12;
				var8[var15 + 1][var16 + 1] = var23;
			}
		}

		var5.method6251(var13, var14);
		return false;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IILkc;Lke;Lkf;B)Z",
		garbageValue = "9"
	)
	final boolean method6351(int var1, int var2, RouteStrategy var3, CollisionMap var4, class277 var5) {
		int var6 = var5.method6249();
		int var7 = var5.method6282();
		int[][] var8 = var5.method6257();
		int[][] var9 = var5.method6256();
		int[] var10 = var5.method6258();
		int[] var11 = var5.method6259();
		int var12 = var5.method6269();
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
			int var21 = var13 - var4.method6172();
			int var22 = var14 - var4.method6173();
			if (var3.hasArrived(2, var13, var14, var4)) {
				var5.method6251(var13, var14);
				return true;
			}

			int var23 = var8[var15][var16] + 1;
			if (var15 > 0 && var9[var15 - 1][var16] == 0 && !var4.method6217(var21 - 1, var22, 1076101390) && !var4.method6217(var21 - 1, var22 + 1, 1076101432)) {
				var10[var24] = var13 - 1;
				var11[var24] = var14;
				var24 = var24 + 1 & var12;
				var9[var15 - 1][var16] = 2;
				var8[var15 - 1][var16] = var23;
			}

			if (var15 < var6 - 2 && var9[var15 + 1][var16] == 0 && !var4.method6217(var21 + 2, var22, 1076101507) && !var4.method6217(var21 + 2, var22 + 1, 1076101600)) {
				var10[var24] = var13 + 1;
				var11[var24] = var14;
				var24 = var24 + 1 & var12;
				var9[var15 + 1][var16] = 8;
				var8[var15 + 1][var16] = var23;
			}

			if (var16 > 0 && var9[var15][var16 - 1] == 0 && !var4.method6217(var21, var22 - 1, 1076101390) && !var4.method6217(var21 + 1, var22 - 1, 1076101507)) {
				var10[var24] = var13;
				var11[var24] = var14 - 1;
				var24 = var24 + 1 & var12;
				var9[var15][var16 - 1] = 1;
				var8[var15][var16 - 1] = var23;
			}

			if (var16 < var7 - 2 && var9[var15][var16 + 1] == 0 && !var4.method6217(var21, var22 + 2, 1076101432) && !var4.method6217(var21 + 1, var22 + 2, 1076101600)) {
				var10[var24] = var13;
				var11[var24] = var14 + 1;
				var24 = var24 + 1 & var12;
				var9[var15][var16 + 1] = 4;
				var8[var15][var16 + 1] = var23;
			}

			if (var15 > 0 && var16 > 0 && var9[var15 - 1][var16 - 1] == 0 && !var4.method6217(var21 - 1, var22, 1076101438) && !var4.method6217(var21 - 1, var22 - 1, 1076101390) && !var4.method6217(var21, var22 - 1, 1076101519)) {
				var10[var24] = var13 - 1;
				var11[var24] = var14 - 1;
				var24 = var24 + 1 & var12;
				var9[var15 - 1][var16 - 1] = 3;
				var8[var15 - 1][var16 - 1] = var23;
			}

			if (var15 < var6 - 2 && var16 > 0 && var9[var15 + 1][var16 - 1] == 0 && !var4.method6217(var21 + 1, var22 - 1, 1076101519) && !var4.method6217(var21 + 2, var22 - 1, 1076101507) && !var4.method6217(var21 + 2, var22, 1076101603)) {
				var10[var24] = var13 + 1;
				var11[var24] = var14 - 1;
				var24 = var24 + 1 & var12;
				var9[var15 + 1][var16 - 1] = 9;
				var8[var15 + 1][var16 - 1] = var23;
			}

			if (var15 > 0 && var16 < var7 - 2 && var9[var15 - 1][var16 + 1] == 0 && !var4.method6217(var21 - 1, var22 + 1, 1076101438) && !var4.method6217(var21 - 1, var22 + 2, 1076101432) && !var4.method6217(var21, var22 + 2, 1076101624)) {
				var10[var24] = var13 - 1;
				var11[var24] = var14 + 1;
				var24 = var24 + 1 & var12;
				var9[var15 - 1][var16 + 1] = 6;
				var8[var15 - 1][var16 + 1] = var23;
			}

			if (var15 < var6 - 2 && var16 < var7 - 2 && var9[var15 + 1][var16 + 1] == 0 && !var4.method6217(var21 + 1, var22 + 2, 1076101624) && !var4.method6217(var21 + 2, var22 + 2, 1076101600) && !var4.method6217(var21 + 2, var22 + 1, 1076101603)) {
				var10[var24] = var13 + 1;
				var11[var24] = var14 + 1;
				var24 = var24 + 1 & var12;
				var9[var15 + 1][var16 + 1] = 12;
				var8[var15 + 1][var16 + 1] = var23;
			}
		}

		var5.method6251(var13, var14);
		return false;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIILkc;Lke;Lkf;I)Z",
		garbageValue = "-1156617389"
	)
	final boolean method6352(int var1, int var2, int var3, RouteStrategy var4, CollisionMap var5, class277 var6) {
		int var7 = var6.method6249();
		int var8 = var6.method6282();
		int[][] var9 = var6.method6257();
		int[][] var10 = var6.method6256();
		int[] var11 = var6.method6258();
		int[] var12 = var6.method6259();
		int var13 = var6.method6269();
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
			label307:
			while (true) {
				int var22;
				int var23;
				int var24;
				int var25;
				do {
					do {
						do {
							label284:
							do {
								if (var26 == var21) {
									var6.method6251(var14, var15);
									return false;
								}

								var14 = var11[var21];
								var15 = var12[var21];
								var21 = var21 + 1 & var13;
								var16 = var14 - var18;
								var17 = var15 - var19;
								var22 = var14 - var5.method6172();
								var23 = var15 - var5.method6173();
								if (var4.hasArrived(var3, var14, var15, var5)) {
									var6.method6251(var14, var15);
									return true;
								}

								var24 = var9[var16][var17] + 1;
								if (var16 > 0 && var10[var16 - 1][var17] == 0 && !var5.method6217(var22 - 1, var23, 1076101390) && !var5.method6217(var22 - 1, var3 + var23 - 1, 1076101432)) {
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

										if (var5.method6217(var22 - 1, var23 + var25, 1076101438)) {
											break;
										}

										++var25;
									}
								}

								if (var16 < var7 - var3 && var10[var16 + 1][var17] == 0 && !var5.method6217(var3 + var22, var23, 1076101507) && !var5.method6217(var3 + var22, var3 + var23 - 1, 1076101600)) {
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

										if (var5.method6217(var3 + var22, var23 + var25, 1076101603)) {
											break;
										}

										++var25;
									}
								}

								if (var17 > 0 && var10[var16][var17 - 1] == 0 && !var5.method6217(var22, var23 - 1, 1076101390) && !var5.method6217(var3 + var22 - 1, var23 - 1, 1076101507)) {
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

										if (var5.method6217(var25 + var22, var23 - 1, 1076101519)) {
											break;
										}

										++var25;
									}
								}

								if (var17 < var8 - var3 && var10[var16][var17 + 1] == 0 && !var5.method6217(var22, var3 + var23, 1076101432) && !var5.method6217(var3 + var22 - 1, var3 + var23, 1076101600)) {
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

										if (var5.method6217(var22 + var25, var3 + var23, 1076101624)) {
											break;
										}

										++var25;
									}
								}

								if (var16 > 0 && var17 > 0 && var10[var16 - 1][var17 - 1] == 0 && !var5.method6217(var22 - 1, var23 - 1, 1076101390)) {
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

										if (var5.method6217(var22 - 1, var25 + (var23 - 1), 1076101438) || var5.method6217(var25 + (var22 - 1), var23 - 1, 1076101519)) {
											break;
										}

										++var25;
									}
								}

								if (var16 < var7 - var3 && var17 > 0 && var10[var16 + 1][var17 - 1] == 0 && !var5.method6217(var3 + var22, var23 - 1, 1076101507)) {
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

										if (var5.method6217(var3 + var22, var25 + (var23 - 1), 1076101603) || var5.method6217(var22 + var25, var23 - 1, 1076101519)) {
											break;
										}

										++var25;
									}
								}

								if (var16 > 0 && var17 < var8 - var3 && var10[var16 - 1][var17 + 1] == 0 && !var5.method6217(var22 - 1, var3 + var23, 1076101432)) {
									for (var25 = 1; var25 < var3; ++var25) {
										if (var5.method6217(var22 - 1, var25 + var23, 1076101438) || var5.method6217(var25 + (var22 - 1), var3 + var23, 1076101624)) {
											continue label284;
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
				} while(var5.method6217(var3 + var22, var3 + var23, 1076101600));

				for (var25 = 1; var25 < var3; ++var25) {
					if (var5.method6217(var22 + var25, var3 + var23, 1076101624) || var5.method6217(var3 + var22, var23 + var25, 1076101603)) {
						continue label307;
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)J",
		garbageValue = "-74"
	)
	public static final synchronized long method6373() {
		long var0 = System.currentTimeMillis();
		if (var0 < class333.field3842) {
			class333.field3841 += class333.field3842 - var0;
		}

		class333.field3842 = var0;
		return var0 + class333.field3841;
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "13892"
	)
	static final void method6350(int var0, int var1) {
		if (var0 < 128) {
			var0 = 128;
		} else if (var0 > 383) {
			var0 = 383;
		}

		if (class386.cameraPitch < var0) {
			class386.cameraPitch = (var0 - class386.cameraPitch) * MilliClock.field3131 / 1000 + class386.cameraPitch + HealthBarConfig.field1176;
			if (class386.cameraPitch > var0) {
				class386.cameraPitch = var0;
			}
		} else if (class386.cameraPitch > var0) {
			class386.cameraPitch -= (class386.cameraPitch - var0) * MilliClock.field3131 / 1000 + HealthBarConfig.field1176;
			if (class386.cameraPitch < var0) {
				class386.cameraPitch = var0;
			}
		}

		var1 &= 2047;
		int var2 = var1 - SpriteBufferProperties.cameraYaw;
		if (var2 > 1024) {
			var2 -= 2048;
		} else if (var2 < -1024) {
			var2 += 2048;
		}

		if (var2 > 0) {
			SpriteBufferProperties.cameraYaw = var2 * MilliClock.field3131 / 1000 + SpriteBufferProperties.cameraYaw + HealthBarConfig.field1176;
			SpriteBufferProperties.cameraYaw &= 2047;
		} else if (var2 < 0) {
			SpriteBufferProperties.cameraYaw -= HealthBarConfig.field1176 + -var2 * MilliClock.field3131 / 1000;
			SpriteBufferProperties.cameraYaw &= 2047;
		}

		int var3 = var1 - SpriteBufferProperties.cameraYaw;
		if (var3 > 1024) {
			var3 -= 2048;
		} else if (var3 < -1024) {
			var3 += 2048;
		}

		if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) {
			SpriteBufferProperties.cameraYaw = var1;
		}

	}

	@ObfuscatedName("om")
	@ObfuscatedSignature(
		descriptor = "(Ldm;IIILnt;B)V",
		garbageValue = "-78"
	)
	static void method6364(WorldView var0, int var1, int var2, int var3, SpriteMask var4) {
		int var5 = Client.playerUpdateManager.playerCount;
		int[] var6 = Client.playerUpdateManager.playerIndices;

		for (int var7 = 0; var7 < var5; ++var7) {
			Player var8 = (Player)var0.players.get((long)var6[var7]);
			if (var8 != null && var8.isVisible() && !var8.isHidden && var8 != class159.localPlayer) {
				ProjectionCoord var9 = Varcs.method3022(var0, var8.x, var8.y);
				int var10 = (int)var9.x;
				int var11 = (int)var9.y;
				var9.release();
				int var12 = var10 / 32 - Client.field484 / 32;
				int var13 = var11 / 32 - Client.field377 / 32;
				if (var8.isFriend()) {
					class445.drawSpriteOnMinimap(var1, var2, var12, var13, var3, class199.field2176[3], var4);
				} else if (class159.localPlayer.team != 0 && var8.team != 0 && var8.team == class159.localPlayer.team) {
					class445.drawSpriteOnMinimap(var1, var2, var12, var13, var3, class199.field2176[4], var4);
				} else if (var8.isFriendsChatMember()) {
					class445.drawSpriteOnMinimap(var1, var2, var12, var13, var3, class199.field2176[5], var4);
				} else if (var8.isClanMember()) {
					class445.drawSpriteOnMinimap(var1, var2, var12, var13, var3, class199.field2176[6], var4);
				} else {
					class445.drawSpriteOnMinimap(var1, var2, var12, var13, var3, class199.field2176[2], var4);
				}
			}
		}

	}
}
