import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("xt")
@Implements("AbstractRasterProvider")
public abstract class AbstractRasterProvider {
	@ObfuscatedName("ac")
	@Export("pixels")
	public int[] pixels;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 800230803
	)
	@Export("width")
	public int width;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 473249227
	)
	@Export("height")
	public int height;
	@ObfuscatedName("as")
	protected float[] field5894;

	protected AbstractRasterProvider() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1736180854"
	)
	@Export("drawFull")
	public abstract void drawFull(int var1, int var2);

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-148288461"
	)
	@Export("draw")
	public abstract void draw(int var1, int var2, int var3, int var4);

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-88"
	)
	@Export("apply")
	public final void apply() {
		Rasterizer2D.Rasterizer2D_init(this.pixels, this.width, this.height, this.field5894);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-32"
	)
	public final void method11658(boolean var1) {
		this.field5894 = var1 ? new float[this.height * this.width + 1] : null;
	}
}
