import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wz")
@Implements("AbstractRasterProvider")
public abstract class AbstractRasterProvider {
	@ObfuscatedName("an")
	@Export("pixels")
	public int[] pixels;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1974345807
	)
	@Export("width")
	public int width;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -433062843
	)
	@Export("height")
	public int height;
	@ObfuscatedName("ac")
	protected float[] field5775;

	protected AbstractRasterProvider() {
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1599847989"
	)
	@Export("drawFull")
	public abstract void drawFull(int var1, int var2);

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "0"
	)
	@Export("draw")
	public abstract void draw(int var1, int var2, int var3, int var4);

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "19"
	)
	@Export("apply")
	public final void apply() {
		Rasterizer2D.Rasterizer2D_init(this.pixels, this.width, this.height, this.field5775);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1382399649"
	)
	public final void method11279(boolean var1) {
		this.field5775 = var1 ? new float[this.height * this.width + 1] : null;
	}
}
