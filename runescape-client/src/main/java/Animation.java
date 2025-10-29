import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ju")
@Implements("Animation")
public class Animation {
	@ObfuscatedName("av")
	static int[] field2747;
	@ObfuscatedName("at")
	static int[] field2748;
	@ObfuscatedName("ag")
	static int[] field2749;
	@ObfuscatedName("an")
	static int[] field2750;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ljc;"
	)
	@Export("skeleton")
	Skeleton skeleton;
	@ObfuscatedName("aj")
	@Export("transformCount")
	int transformCount;
	@ObfuscatedName("ak")
	@Export("transformSkeletonLabels")
	int[] transformSkeletonLabels;
	@ObfuscatedName("aw")
	@Export("transformXs")
	int[] transformXs;
	@ObfuscatedName("ap")
	@Export("transformYs")
	int[] transformYs;
	@ObfuscatedName("ay")
	@Export("transformZs")
	int[] transformZs;
	@ObfuscatedName("au")
	@Export("hasAlphaTransform")
	boolean hasAlphaTransform;

	static {
		field2747 = new int[500];
		field2748 = new int[500];
		field2749 = new int[500];
		field2750 = new int[500];
	}

	@ObfuscatedSignature(
		descriptor = "([BLjc;)V"
	)
	Animation(byte[] var1, Skeleton var2) {
		this.skeleton = null;
		this.transformCount = -1;
		this.hasAlphaTransform = false;
		this.skeleton = var2;
		Buffer var3 = new Buffer(var1);
		Buffer var4 = new Buffer(var1);
		var3.offset = -811429270;
		int var5 = var3.readUnsignedByte();
		int var6 = -1;
		int var7 = 0;
		var4.offset = (var5 + var3.offset * 2108391709) * 1741769013;

		int var8;
		for (var8 = 0; var8 < var5; ++var8) {
			int var9 = var3.readUnsignedByte();
			if (var9 > 0) {
				if (this.skeleton.transformTypes[var8] != 0) {
					for (int var10 = var8 - 1; var10 > var6; --var10) {
						if (this.skeleton.transformTypes[var10] == 0) {
							field2747[var7] = var10;
							field2748[var7] = 0;
							field2749[var7] = 0;
							field2750[var7] = 0;
							++var7;
							break;
						}
					}
				}

				field2747[var7] = var8;
				short var11 = 0;
				if (this.skeleton.transformTypes[var8] == 3) {
					var11 = 128;
				}

				if ((var9 & 1) != 0) {
					field2748[var7] = var4.readShortSmart();
				} else {
					field2748[var7] = var11;
				}

				if ((var9 & 2) != 0) {
					field2749[var7] = var4.readShortSmart();
				} else {
					field2749[var7] = var11;
				}

				if ((var9 & 4) != 0) {
					field2750[var7] = var4.readShortSmart();
				} else {
					field2750[var7] = var11;
				}

				var6 = var8;
				++var7;
				if (this.skeleton.transformTypes[var8] == 5) {
					this.hasAlphaTransform = true;
				}
			}
		}

		if (var1.length != var4.offset * 2108391709) {
			throw new RuntimeException();
		} else {
			this.transformCount = var7;
			this.transformSkeletonLabels = new int[var7];
			this.transformXs = new int[var7];
			this.transformYs = new int[var7];
			this.transformZs = new int[var7];

			for (var8 = 0; var8 < var7; ++var8) {
				this.transformSkeletonLabels[var8] = field2747[var8];
				this.transformXs[var8] = field2748[var8];
				this.transformYs[var8] = field2749[var8];
				this.transformZs[var8] = field2750[var8];
			}

			var3.offset = var4.offset;
		}
	}
}
