import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ht")
public class class199 extends DualNode {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("field2022")
	static EvictingDualNodeHashTable field2022;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Ler;"
	)
	@Export("pcmPlayerProvider")
	public static class106 pcmPlayerProvider;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "Lxc;"
	)
	@Export("titlebuttonSprite")
	static IndexedSprite titlebuttonSprite;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "Lxc;"
	)
	@Export("options_buttons_2Sprite")
	static IndexedSprite options_buttons_2Sprite;

	static {
		field2022 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "([I[JIIB)V",
		garbageValue = "-24"
	)
	public static void method4400(int[] var0, long[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			int var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			long var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;
			int var9 = var6 == Integer.MAX_VALUE ? 0 : 1;

			for (int var10 = var2; var10 < var3; ++var10) {
				if (var0[var10] < (var10 & var9) + var6) {
					int var11 = var0[var10];
					var0[var10] = var0[var5];
					var0[var5] = var11;
					long var12 = var1[var10];
					var1[var10] = var1[var5];
					var1[var5++] = var12;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method4400(var0, var1, var2, var5 - 1);
			method4400(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("mz")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "2092054307"
	)
	static final void method4399(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0;
		int var7 = var3 - var1;
		int var8 = var6 >= 0 ? var6 : -var6;
		int var9 = var7 >= 0 ? var7 : -var7;
		int var10 = var8;
		if (var8 < var9) {
			var10 = var9;
		}

		if (var10 != 0) {
			int var11 = (var6 << 16) / var10;
			int var12 = (var7 << 16) / var10;
			if (var12 <= var11) {
				var11 = -var11;
			} else {
				var12 = -var12;
			}

			int var13 = var5 * var12 >> 17;
			int var14 = var5 * var12 + 1 >> 17;
			int var15 = var5 * var11 >> 17;
			int var16 = var5 * var11 + 1 >> 17;
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart;
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart;
			int var17 = var0 + var13;
			int var18 = var0 - var14;
			int var19 = var0 + var6 - var14;
			int var20 = var0 + var6 + var13;
			int var21 = var15 + var1;
			int var22 = var1 - var16;
			int var23 = var7 + var1 - var16;
			int var24 = var7 + var15 + var1;
			Rasterizer3D.setClipping(var17, var18, var19);
			Rasterizer3D.rasterFlat((float)var21, (float)var22, (float)var23, (float)var17, (float)var18, (float)var19, 0.0F, 0.0F, 0.0F, var4);
			Rasterizer3D.setClipping(var17, var19, var20);
			Rasterizer3D.rasterFlat((float)var21, (float)var23, (float)var24, (float)var17, (float)var19, (float)var20, 0.0F, 0.0F, 0.0F, var4);
		}
	}
}
