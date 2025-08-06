import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dl")
public class class100 {
	@ObfuscatedName("al")
	int field1356;
	@ObfuscatedName("ab")
	int field1354;
	@ObfuscatedName("ac")
	int field1355;
	@ObfuscatedName("av")
	int field1357;
	@ObfuscatedName("au")
	int field1358;
	@ObfuscatedName("as")
	int field1359;
	@ObfuscatedName("ah")
	int[] field1360;

	@ObfuscatedSignature(
		descriptor = "(Leh;)V"
	)
	class100(class114 var1) {
		this.field1356 = var1.method3409(16);
		this.field1354 = var1.method3409(24);
		this.field1355 = var1.method3409(24);
		this.field1357 = var1.method3409(24) + 1;
		this.field1358 = var1.method3409(6) + 1;
		this.field1359 = var1.method3409(8);
		int[] var2 = new int[this.field1358];

		int var3;
		for (var3 = 0; var3 < this.field1358; ++var3) {
			int var4 = 0;
			int var5 = var1.method3409(3);
			boolean var6 = var1.method3408() != 0;
			if (var6) {
				var4 = var1.method3409(5);
			}

			var2[var3] = var4 << 3 | var5;
		}

		this.field1360 = new int[this.field1358 * 8];

		for (var3 = 0; var3 < this.field1358 * 8; ++var3) {
			this.field1360[var3] = (var2[var3 >> 3] & 1 << (var3 & 7)) != 0 ? var1.method3409(8) : -1;
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([FIZLeh;[Leo;)V"
	)
	void method3096(float[] var1, int var2, boolean var3, class114 var4, VorbisCodebook[] var5) {
		int var6;
		for (var6 = 0; var6 < var2; ++var6) {
			var1[var6] = 0.0F;
		}

		if (!var3) {
			var6 = var5[this.field1359].field1395;
			int var7 = this.field1355 - this.field1354;
			int var8 = var7 / this.field1357;
			int[] var9 = new int[var8];

			for (int var10 = 0; var10 < 8; ++var10) {
				int var11 = 0;

				while (var11 < var8) {
					int var12;
					int var13;
					if (var10 == 0) {
						var12 = var5[this.field1359].method3291(var4);

						for (var13 = var6 - 1; var13 >= 0; --var13) {
							if (var11 + var13 < var8) {
								var9[var11 + var13] = var12 % this.field1358;
							}

							var12 /= this.field1358;
						}
					}

					for (var12 = 0; var12 < var6; ++var12) {
						var13 = var9[var11];
						int var14 = this.field1360[var10 + var13 * 8];
						if (var14 >= 0) {
							int var15 = var11 * this.field1357 + this.field1354;
							VorbisCodebook var16 = var5[var14];
							int var17;
							if (this.field1356 == 0) {
								var17 = this.field1357 / var16.field1395;

								for (int var21 = 0; var21 < var17; ++var21) {
									float[] var22 = var16.method3294(var4);

									for (int var20 = 0; var20 < var16.field1395; ++var20) {
										var1[var15 + var21 + var20 * var17] += var22[var20];
									}
								}
							} else {
								var17 = 0;

								while (var17 < this.field1357) {
									float[] var18 = var16.method3294(var4);

									for (int var19 = 0; var19 < var16.field1395; ++var19) {
										var1[var15 + var17] += var18[var19];
										++var17;
									}
								}
							}
						}

						++var11;
						if (var11 >= var8) {
							break;
						}
					}
				}
			}

		}
	}
}
