import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gb")
public class class180 extends DualNode {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("field1851")
	public static EvictingDualNodeHashTable field1851;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 418528339
	)
	static int field1905;

	static {
		field1851 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)J",
		garbageValue = "-126"
	)
	public static final synchronized long method3973() {
		long var0 = System.currentTimeMillis();
		if (var0 < class331.field3674) {
			class331.field3676 += class331.field3674 - var0;
		}

		class331.field3674 = var0;
		return class331.field3676 + var0;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(FI)F",
		garbageValue = "-1591989896"
	)
	public static final float method3974(float var0) {
		float var1 = 75.0F;
		float var2 = 10000.0F;
		float var3 = 750000.0F / (10000.0F - 9925.0F * var0);
		return (var3 - 75.0F) / 9925.0F;
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "-1546790714"
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
			var6 = Client.field358;
		} else if (var5 >= 100) {
			var6 = Client.field359;
		} else {
			var6 = (Client.field359 - Client.field358) * var5 / 100 + Client.field358;
		}

		int var7 = var3 * var6 * 512 / (var2 * 334);
		int var8;
		int var9;
		short var14;
		if (var7 < Client.field364) {
			var14 = Client.field364;
			var6 = var14 * var2 * 334 / (var3 * 512);
			if (var6 > Client.field363) {
				var6 = Client.field363;
				var8 = var3 * var6 * 512 / (var14 * 334);
				var9 = (var2 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216);
				}

				var0 += var9;
				var2 -= var9 * 2;
			}
		} else if (var7 > Client.field365) {
			var14 = Client.field365;
			var6 = var14 * var2 * 334 / (var3 * 512);
			if (var6 < Client.field362) {
				var6 = Client.field362;
				var8 = var14 * var2 * 334 / (var6 * 512);
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
			int[] var13 = new int[9];

			for (var9 = 0; var9 < var13.length; ++var9) {
				int var10 = var9 * 32 + 15 + 128;
				int var11 = FriendSystem.method1551(var10);
				int var12 = Rasterizer3D.Rasterizer3D_sine[var10];
				var11 = ItemComposition.method4534(var11, var3);
				var13[var9] = var12 * var11 >> 16;
			}

			Sound.topLevelWorldView.scene.method5368(var13, 500, 800, var2 * 334 / var3, 334);
		}

		Client.viewportOffsetX = var0;
		Client.viewportOffsetY = var1;
		Client.viewportWidth = var2;
		Client.viewportHeight = var3;
	}
}
