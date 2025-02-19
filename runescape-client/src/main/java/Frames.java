import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jt")
@Implements("Frames")
public class Frames extends DualNode {
	@ObfuscatedName("gg")
	@ObfuscatedGetter(
		intValue = 695303335
	)
	@Export("currentPort")
	static int currentPort;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Ljv;"
	)
	Animation[] field2812;

	@ObfuscatedSignature(
		descriptor = "(Lpl;Lpl;I)V"
	)
	Frames(AbstractArchive var1, AbstractArchive var2, int var3) {
		int var4 = var1.getGroupFileCount(var3);
		this.field2812 = new Animation[var4];
		Skeleton var5 = null;
		int[] var6 = var1.getGroupFileIds(var3);

		for (int var7 = 0; var7 < var6.length; ++var7) {
			byte[] var8 = var1.takeFile(var3, var6[var7]);
			if (var5 == null) {
				int var9 = (var8[0] & 255) << 8 | var8[1] & 255;
				byte[] var10 = var2.getFile(var9, 0);
				var5 = new Skeleton(var9, var10);
			}

			this.field2812[var6[var7]] = new Animation(var8, var5);
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "1"
	)
	@Export("hasAlphaTransform")
	public boolean hasAlphaTransform(int var1) {
		return this.field2812[var1].hasAlphaTransform;
	}
}
