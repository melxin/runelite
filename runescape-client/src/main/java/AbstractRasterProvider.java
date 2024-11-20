import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vx")
@Implements("AbstractRasterProvider")
public abstract class AbstractRasterProvider {
	@ObfuscatedName("at")
	@Export("pixels")
	public int[] pixels;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1867620685
	)
	@Export("width")
	public int width;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -866005647
	)
	@Export("height")
	public int height;
	@ObfuscatedName("ac")
	protected float[] field5549;

	protected AbstractRasterProvider() {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-719074145"
	)
	@Export("drawFull")
	public abstract void drawFull(int var1, int var2);

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIIS)V",
		garbageValue = "7108"
	)
	@Export("draw")
	public abstract void draw(int var1, int var2, int var3, int var4);

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1859343542"
	)
	@Export("apply")
	public final void apply() {
		Rasterizer2D.Rasterizer2D_init(this.pixels, this.width, this.height, this.field5549);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1498265916"
	)
	public final void method10523(boolean var1) {
		this.field5549 = var1 ? new float[this.width * this.height + 1] : null;
	}
}
