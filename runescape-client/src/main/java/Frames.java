import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jk")
@Implements("Frames")
public class Frames extends DualNode {
	@ObfuscatedName("pa")
	@ObfuscatedSignature(
		descriptor = "[Lwd;"
	)
	@Export("headIconPkSprites")
	static SpritePixels[] headIconPkSprites;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Ljf;"
	)
	@Export("frames")
	Animation[] frames;

	@ObfuscatedSignature(
		descriptor = "(Lps;Lps;I)V"
	)
	public Frames(AbstractArchive var1, AbstractArchive var2, int var3) {
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-119"
	)
	@Export("hasAlphaTransform")
	public boolean hasAlphaTransform(int var1) {
		return this.frames[var1].hasAlphaTransform;
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(IZZZZI)Lpu;",
		garbageValue = "-534466592"
	)
	@Export("newArchive")
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
		ArchiveDisk var5 = null;
		if (JagexCache.JagexCache_dat2File != null) {
			var5 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idxFiles[var0], 1000000);
		}

		return new Archive(var5, Varps.masterDisk, class330.field3669, var0, var1, var2, var3, var4, false);
	}
}
