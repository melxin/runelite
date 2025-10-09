import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("at")
public class class1 implements Callable {
	@ObfuscatedName("au")
	@Export("Tiles_hue")
	static int[] Tiles_hue;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "Lxc;"
	)
	@Export("logoSprite")
	static IndexedSprite logoSprite;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lwj;"
	)
	final Buffer field1;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Laj;"
	)
	final class3 field4;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Laq;"
	)
	final SpriteBufferProperties this$0;

	@ObfuscatedSignature(
		descriptor = "(Laq;Lwj;Laj;)V"
	)
	class1(SpriteBufferProperties var1, Buffer var2, class3 var3) {
		this.this$0 = var1;
		this.field1 = var2;
		this.field4 = var3;
	}

	public Object call() {
		return this.field4.vmethod18(this.field1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-358192125"
	)
	public static void method8() {
		class188.field2007.clear();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(FI)F",
		garbageValue = "1148555530"
	)
	public static final float method13(float var0) {
		float var1 = 150.75377F / (var0 - 1.0100503F);
		return var1 / 14925.0F / 1.0100503F;
	}

	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "918197734"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		class450.scrollBarSprites[0].drawAt(var0, var1);
		class450.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field450);
		int var5 = var3 * (var3 - 32) / var4;
		if (var5 < 8) {
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field451);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0, var6 + var1 + 16, var5, Client.field366);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 1, var6 + var1 + 16, var5, Client.field366);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 16, 16, Client.field366);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 17, 16, Client.field366);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 15, var6 + var1 + 16, var5, Client.field452);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field452);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var5 + var1 + 15, 16, Client.field452);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0 + 1, var6 + var5 + var1 + 14, 15, Client.field452);
	}
}
