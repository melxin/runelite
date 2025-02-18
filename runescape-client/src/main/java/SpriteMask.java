import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nf")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "Lvf;"
	)
	@Export("compass")
	static SpritePixels compass;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1573085963
	)
	@Export("width")
	public final int width;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1656732957
	)
	@Export("height")
	public final int height;
	@ObfuscatedName("az")
	@Export("xWidths")
	public final int[] xWidths;
	@ObfuscatedName("ao")
	@Export("xStarts")
	public final int[] xStarts;

	SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.width = var1;
		this.height = var2;
		this.xWidths = var3;
		this.xStarts = var4;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "63"
	)
	@Export("contains")
	public boolean contains(int var1, int var2) {
		if (var2 >= 0 && var2 < this.xStarts.length) {
			int var3 = this.xStarts[var2];
			if (var1 >= var3 && var1 <= var3 + this.xWidths[var2]) {
				return true;
			}
		}

		return false;
	}
}
