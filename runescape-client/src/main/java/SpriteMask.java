import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oz")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
	@ObfuscatedName("uf")
	@ObfuscatedGetter(
		intValue = 824582895
	)
	static int field4089;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 915756381
	)
	@Export("width")
	public final int width;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1668058793
	)
	@Export("height")
	public final int height;
	@ObfuscatedName("ag")
	@Export("xWidths")
	public final int[] xWidths;
	@ObfuscatedName("an")
	@Export("xStarts")
	public final int[] xStarts;

	SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.width = var1;
		this.height = var2;
		this.xWidths = var3;
		this.xStarts = var4;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-729119930"
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

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(Ldd;IIIIIII)V",
		garbageValue = "957069650"
	)
	static void method7659(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		NodeDeque var7 = var0.groundItems[var1][var2][var3];
		if (var7 != null) {
			for (TileItem var8 = (TileItem)var7.last(); var8 != null; var8 = (TileItem)var7.previous()) {
				if (var4 == var8.id && var5 == var8.quantity) {
					var8.quantity = var6;
					break;
				}
			}

			class157.updateItemPile(var1, var2, var3);
		}

	}
}
