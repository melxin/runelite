import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("em")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -567323953
	)
	static int field1481;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 844296649
	)
	static int field1482;
	@ObfuscatedName("ab")
	final URL field1480;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1275385291
	)
	volatile int field1485;
	@ObfuscatedName("ao")
	@Export("response0")
	volatile byte[] response0;

	static {
		field1481 = -1;
		field1482 = -2;
	}

	UrlRequest(URL var1) {
		this.field1485 = field1481;
		this.field1480 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1306096829"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.field1485 != field1481;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "104"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "12"
	)
	public String method3191() {
		return this.field1480.toString();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([FIFZFZ[FI)I",
		garbageValue = "1268330776"
	)
	public static int method3192(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6) {
		float var7 = 0.0F;

		for (int var8 = 0; var8 < var1 + 1; ++var8) {
			var7 += Math.abs(var0[var8]);
		}

		float var24 = (Math.abs(var2) + Math.abs(var4)) * (float)(var1 + 1) * class133.field1535;
		if (var7 <= var24) {
			return -1;
		} else {
			float[] var9 = new float[var1 + 1];

			int var10;
			for (var10 = 0; var10 < var1 + 1; ++var10) {
				var9[var10] = 1.0F / var7 * var0[var10];
			}

			while (Math.abs(var9[var1]) < var24) {
				--var1;
			}

			var10 = 0;
			if (var1 == 0) {
				return var10;
			} else if (var1 == 1) {
				var6[0] = -var9[0] / var9[1];
				boolean var22 = var3 ? var2 < var6[0] + var24 : var2 < var6[0] - var24;
				boolean var23 = var5 ? var4 > var6[0] - var24 : var4 > var6[0] + var24;
				var10 = var22 && var23 ? 1 : 0;
				if (var10 > 0) {
					if (var3 && var6[0] < var2) {
						var6[0] = var2;
					} else if (var5 && var6[0] > var4) {
						var6[0] = var4;
					}
				}

				return var10;
			} else {
				class430 var11 = new class430(var9, var1);
				float[] var12 = new float[var1 + 1];

				for (int var13 = 1; var13 <= var1; ++var13) {
					var12[var13 - 1] = (float)var13 * var9[var13];
				}

				float[] var21 = new float[var1 + 1];
				int var14 = method3192(var12, var1 - 1, var2, false, var4, false, var21);
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
							var18 = class372.method7458(var9, var1, var2);
							if (Math.abs(var18) <= var24 && var3) {
								var6[var10++] = var2;
							}
						} else {
							var16 = var19;
							var18 = var17;
						}

						if (var14 == var20) {
							var19 = var4;
							var15 = false;
						} else {
							var19 = var21[var20];
						}

						var17 = class372.method7458(var9, var1, var19);
						if (var15) {
							var15 = false;
						} else if (Math.abs(var17) < var24) {
							if (var14 != var20 || var5) {
								var6[var10++] = var19;
								var15 = true;
							}
						} else if (var18 < 0.0F && var17 > 0.0F || var18 > 0.0F && var17 < 0.0F) {
							var6[var10++] = AsyncRestClient.method167(var11, var16, var19, 0.0F);
							if (var10 > 1 && var6[var10 - 2] >= var6[var10 - 1] - var24) {
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ldm;[BIIIII)V",
		garbageValue = "-2119591322"
	)
	static final void method3188(WorldView var0, byte[] var1, int var2, int var3, int var4, int var5) {
		int var7;
		int var8;
		if (var0.collisionMaps != null) {
			for (int var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 64; ++var7) {
					for (var8 = 0; var8 < 64; ++var8) {
						if (var7 + var2 > 0 && var7 + var2 < var0.collisionMaps[var6].flags.length && var3 + var8 > 0 && var3 + var8 < var0.collisionMaps[var6].flags[var7 + var2].length) {
							int[] var10000 = var0.collisionMaps[var6].flags[var7 + var2];
							var10000[var8 + var3] &= -1073741825;
						}
					}
				}
			}
		}

		Buffer var12 = new Buffer(var1);

		for (var7 = 0; var7 < 4; ++var7) {
			for (var8 = 0; var8 < 64; ++var8) {
				for (int var9 = 0; var9 < 64; ++var9) {
					int var10 = var8 + var2;
					int var11 = var3 + var9;
					class182.loadTerrain(var0, var12, var7, var10, var11, var10 + var4, var5 + var11, 0);
				}
			}
		}

	}
}
