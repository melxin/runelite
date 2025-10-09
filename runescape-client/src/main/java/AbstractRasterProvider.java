import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("xn")
@Implements("AbstractRasterProvider")
public abstract class AbstractRasterProvider {
	@ObfuscatedName("ag")
	@Export("pixels")
	public int[] pixels;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1480943191
	)
	@Export("width")
	public int width;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -956133831
	)
	@Export("height")
	public int height;
	@ObfuscatedName("af")
	protected float[] field6058;

	protected AbstractRasterProvider() {
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "116"
	)
	@Export("drawFull")
	public abstract void drawFull(int var1, int var2);

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-103"
	)
	@Export("draw")
	public abstract void draw(int var1, int var2, int var3, int var4);

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2093446846"
	)
	@Export("apply")
	public final void apply() {
		Rasterizer2D.Rasterizer2D_init(this.pixels, this.width, this.height, this.field6058);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "102"
	)
	public final void method11823(boolean var1) {
		this.field6058 = var1 ? new float[this.height * this.width + 1] : null;
	}
}
