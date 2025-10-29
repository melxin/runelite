import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("xf")
@Implements("AbstractRasterProvider")
public abstract class AbstractRasterProvider {
	@ObfuscatedName("ag")
	@Export("pixels")
	public int[] pixels;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 81685145
	)
	@Export("width")
	public int width;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -136501203
	)
	@Export("height")
	public int height;
	@ObfuscatedName("aj")
	protected float[] field6096;

	protected AbstractRasterProvider() {
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-69"
	)
	@Export("drawFull")
	public abstract void drawFull(int var1, int var2);

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-905446999"
	)
	@Export("draw")
	public abstract void draw(int var1, int var2, int var3, int var4);

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "11"
	)
	@Export("apply")
	public final void apply() {
		Rasterizer2D.Rasterizer2D_init(this.pixels, this.width, this.height, this.field6096);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "119138100"
	)
	public final void method12080(boolean var1) {
		this.field6096 = var1 ? new float[this.height * this.width + 1] : null;
	}
}
