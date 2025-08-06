import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("in")
@Implements("Frames")
public class Frames extends DualNode {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Liw;"
	)
	@Export("frames")
	Animation[] frames;

	@ObfuscatedSignature(
		descriptor = "(Lpx;Lpx;I)V"
	)
	Frames(AbstractArchive var1, AbstractArchive var2, int var3) {
		int var4 = var1.getGroupFileCount(var3);
		this.frames = new Animation[var4];
		Skeleton var5 = null;
		int[] var6 = var1.getGroupFileIds(var3);

		for (int var7 = 0; var7 < var6.length; ++var7) {
			byte[] var8 = var1.takeFile(var3, var6[var7]);
			if (var5 == null) {
				int var9 = (var8[0] & 255) << 8 | var8[1] & 255;
				byte[] var10 = var2.getFile(var9, 0);
				var5 = new Skeleton(var9, var10);
			}

			this.frames[var6[var7]] = new Animation(var8, var5);
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1462448483"
	)
	@Export("hasAlphaTransform")
	public boolean hasAlphaTransform(int var1) {
		return this.frames[var1].hasAlphaTransform;
	}
}
