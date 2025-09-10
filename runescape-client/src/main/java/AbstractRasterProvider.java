import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("xo")
@Implements("AbstractRasterProvider")
public abstract class AbstractRasterProvider {
	@ObfuscatedName("at")
	@Export("pixels")
	public int[] pixels;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1144170259
	)
	@Export("width")
	public int width;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1893187821
	)
	@Export("height")
	public int height;
	@ObfuscatedName("aq")
	protected float[] field5999;

	protected AbstractRasterProvider() {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1889941463"
	)
	@Export("drawFull")
	public abstract void drawFull(int var1, int var2);

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-540591436"
	)
	@Export("draw")
	public abstract void draw(int var1, int var2, int var3, int var4);

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "300699084"
	)
	@Export("apply")
	public final void apply() {
		Rasterizer2D.Rasterizer2D_init(this.pixels, this.width, this.height, this.field5999);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1608046387"
	)
	public final void method11643(boolean var1) {
		this.field5999 = var1 ? new float[this.height * this.width + 1] : null;
	}
}
