import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vg")
@Implements("AbstractRasterProvider")
public abstract class AbstractRasterProvider {
	@ObfuscatedName("az")
	@Export("pixels")
	public int[] pixels;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -97046745
	)
	@Export("width")
	public int width;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -131339153
	)
	@Export("height")
	public int height;
	@ObfuscatedName("an")
	protected float[] field5553;

	protected AbstractRasterProvider() {
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "268701696"
	)
	@Export("drawFull")
	public abstract void drawFull(int var1, int var2);

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "0"
	)
	@Export("draw")
	public abstract void draw(int var1, int var2, int var3, int var4);

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1201528197"
	)
	@Export("apply")
	public final void apply() {
		Rasterizer2D.Rasterizer2D_init(this.pixels, this.width, this.height, this.field5553);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "36"
	)
	public final void method10691(boolean var1) {
		this.field5553 = var1 ? new float[this.height * this.width + 1] : null;
	}
}
