import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rp")
public final class class448 {
	@ObfuscatedName("ao")
	final Object field4956;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1444999873
	)
	int field4959;

	class448(Object var1, int var2) {
		this.field4956 = var1;
		this.field4959 = var2;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-49"
	)
	static boolean method8532(int var0, int var1) {
		return var0 != 4 || var1 < 8;
	}

	@ObfuscatedName("mh")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "1735335587"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		MenuAction.scrollBarSprites[0].drawAt(var0, var1);
		MenuAction.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field662);
		int var5 = var3 * (var3 - 32) / var4;
		if (var5 < 8) {
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field663);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0, var6 + var1 + 16, var5, Client.field665);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 1, var6 + var1 + 16, var5, Client.field665);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 16, 16, Client.field665);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 17, 16, Client.field665);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 15, var6 + var1 + 16, var5, Client.field664);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field664);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var5 + var6 + var1 + 15, 16, Client.field664);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0 + 1, var6 + var5 + var1 + 14, 15, Client.field664);
	}

	@ObfuscatedName("ml")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-265397396"
	)
	static final int method8531() {
		float var0 = 200.0F * ((float)Renderable.clientPreferences.getBrightness() - 0.5F);
		return 100 - Math.round(var0);
	}
}
