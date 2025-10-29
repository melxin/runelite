import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mb")
public abstract class class320 implements class322 {
	@ObfuscatedName("ap")
	@Export("SpriteBuffer_pixels")
	public static byte[][] SpriteBuffer_pixels;
	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "Lbd;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -514178633
	)
	protected int field3553;

	@ObfuscatedSignature(
		descriptor = "(Lpm;Lqd;I)V"
	)
	protected class320(StudioGame var1, Language var2, int var3) {
		this.field3553 = var3;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(DDII)[D",
		garbageValue = "-1773956998"
	)
	public static double[] method7178(double var0, double var2, int var4) {
		int var5 = var4 * 2 + 1;
		double[] var6 = new double[var5];
		int var7 = -var4;

		for (int var8 = 0; var7 <= var4; ++var8) {
			double var15 = ((double)var7 - var0) / var2;
			double var13 = Math.exp(var15 * -var15 / 2.0D) / Math.sqrt(6.283185307179586D);
			double var11 = var13 / var2;
			var6[var8] = var11;
			++var7;
		}

		return var6;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILwp;I)Z",
		garbageValue = "-2040295588"
	)
	public static boolean method7179(int var0, class594 var1) {
		return (var0 & var1.rsOrdinal()) != 0;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "2120071691"
	)
	public static String method7182(CharSequence var0) {
		int var1 = var0.length();
		StringBuilder var2 = new StringBuilder(var1);

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if ((var4 < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && (var4 < '0' || var4 > '9') && var4 != '.' && var4 != '-' && var4 != '*' && var4 != '_') {
				if (var4 == ' ') {
					var2.append('+');
				} else {
					byte var5 = Sound.charToByteCp1252(var4);
					var2.append('%');
					int var6 = var5 >> 4 & 15;
					if (var6 >= 10) {
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48));
					}

					var6 = var5 & 15;
					if (var6 >= 10) {
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48));
					}
				}
			} else {
				var2.append(var4);
			}
		}

		return var2.toString();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1876982269"
	)
	static int method7180(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return 0;
		} else if (var1 == -1) {
			return 0;
		} else {
			int var3 = 0;

			for (int var4 = 0; var4 < var2.quantities.length; ++var4) {
				if (var2.ids[var4] == var1) {
					var3 += var2.quantities[var4];
				}
			}

			return var3;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lut;Ljava/lang/Object;III)I",
		garbageValue = "-1585877182"
	)
	public static int method7181(DynamicArray var0, Object var1, int var2, int var3) {
		if (var2 < 0) {
			var2 = 0;
		}

		if (var3 < 0 || var3 > var0.method10652()) {
			var3 = var0.method10652();
		}

		int var4 = 0;
		int var6;
		if (var0.field5584 == class586.field5937) {
			int[] var5 = var0.method10650();
			var6 = (Integer)var1;

			for (int var7 = var2; var7 < var3; ++var7) {
				if (var6 == var5[var7]) {
					++var4;
				}
			}
		} else if (var0.field5584 == class586.field5942) {
			long[] var11 = var0.method10651();
			long var9 = (Long)var1;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var11[var8] == var9) {
					++var4;
				}
			}
		} else {
			Object[] var12 = var0.method10681();

			for (var6 = var2; var6 < var3; ++var6) {
				if (var12[var6] == var1 || var12[var6] != null && var12[var6].equals(var1)) {
					++var4;
				}
			}
		}

		return var4;
	}
}
