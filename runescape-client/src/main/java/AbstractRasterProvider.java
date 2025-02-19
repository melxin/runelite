import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wu")
@Implements("AbstractRasterProvider")
public abstract class AbstractRasterProvider {
	@ObfuscatedName("au")
	@Export("pixels")
	public int[] pixels;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 899234367
	)
	@Export("width")
	public int width;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 4335907
	)
	@Export("height")
	public int height;
	@ObfuscatedName("ac")
	protected float[] field5652;

	protected AbstractRasterProvider() {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-180892361"
	)
	@Export("drawFull")
	public abstract void drawFull(int var1, int var2);

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-901137477"
	)
	@Export("draw")
	public abstract void draw(int var1, int var2, int var3, int var4);

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1945211385"
	)
	@Export("apply")
	public final void apply() {
		Rasterizer2D.Rasterizer2D_init(this.pixels, this.width, this.height, this.field5652);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "96"
	)
	public final void method10675(boolean var1) {
		this.field5652 = var1 ? new float[this.height * this.width + 1] : null;
	}
}
