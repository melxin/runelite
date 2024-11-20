import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("na")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "[Lvr;"
	)
	@Export("mapDotSprites")
	static SpritePixels[] mapDotSprites;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 2039213361
	)
	@Export("width")
	public final int width;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -314185945
	)
	@Export("height")
	public final int height;
	@ObfuscatedName("at")
	@Export("xWidths")
	public final int[] xWidths;
	@ObfuscatedName("ae")
	@Export("xStarts")
	public final int[] xStarts;

	SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.width = var1;
		this.height = var2;
		this.xWidths = var3;
		this.xStarts = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "117"
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
