import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fr")
class class143 implements Callable {
	@ObfuscatedName("iz")
	@ObfuscatedGetter(
		intValue = 1078117213
	)
	@Export("Players_count")
	static int Players_count;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	final class144 this$0;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	final Buffer val$p;
	// $FF: synthetic field
	final int val$version;

	@ObfuscatedSignature(
		descriptor = "(Lfl;Lvy;I)V"
	)
	class143(class144 var1, Buffer var2, int var3) {
		this.this$0 = var1;
		this.val$p = var2;
		this.val$version = var3;
	}

	public Object call() {
		this.this$0.method3520(this.val$p, this.val$version);
		return null;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Lim;",
		garbageValue = "-77"
	)
	public static class221 method3517() {
		return class221.field2422;
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(IIIIZB)V",
		garbageValue = "-25"
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
			var6 = Client.field609;
		} else if (var5 >= 100) {
			var6 = Client.field656;
		} else {
			var6 = (Client.field656 - Client.field609) * var5 / 100 + Client.field609;
		}

		int var7 = var3 * var6 * 512 / (var2 * 334);
		int var8;
		int var9;
		short var15;
		if (var7 < Client.field702) {
			var15 = Client.field702;
			var6 = var15 * var2 * 334 / (var3 * 512);
			if (var6 > Client.field773) {
				var6 = Client.field773;
				var8 = var3 * var6 * 512 / (var15 * 334);
				var9 = (var2 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216);
				}

				var0 += var9;
				var2 -= var9 * 2;
			}
		} else if (var7 > Client.field775) {
			var15 = Client.field775;
			var6 = var15 * var2 * 334 / (var3 * 512);
			if (var6 < Client.field772) {
				var6 = Client.field772;
				var8 = var15 * var2 * 334 / (var6 * 512);
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
			int[] var14 = new int[9];

			for (var9 = 0; var9 < var14.length; ++var9) {
				int var10 = var9 * 32 + 15 + 128;
				int var11 = var10 * 3 + 600;
				int var13 = Rasterizer3D.Rasterizer3D_sine[var10];
				int var12 = Frames.method4471(var11, var3);
				var14[var9] = var13 * var12 >> 16;
			}

			GameEngine.topLevelWorldView.scene.method4267(var14, 500, 800, var2 * 334 / var3, 334);
		}

		Client.viewportOffsetX = var0;
		Client.viewportOffsetY = var1;
		Client.viewportWidth = var2;
		Client.viewportHeight = var3;
	}
}
