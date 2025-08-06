import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iw")
@Implements("Animation")
public class Animation {
	@ObfuscatedName("al")
	static int[] field2543;
	@ObfuscatedName("ab")
	static int[] field2540;
	@ObfuscatedName("ac")
	static int[] field2541;
	@ObfuscatedName("av")
	static int[] field2546;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lih;"
	)
	@Export("skeleton")
	Skeleton skeleton;
	@ObfuscatedName("as")
	@Export("transformCount")
	int transformCount;
	@ObfuscatedName("ah")
	@Export("transformSkeletonLabels")
	int[] transformSkeletonLabels;
	@ObfuscatedName("ap")
	@Export("transformXs")
	int[] transformXs;
	@ObfuscatedName("am")
	@Export("transformYs")
	int[] transformYs;
	@ObfuscatedName("aj")
	@Export("transformZs")
	int[] transformZs;
	@ObfuscatedName("ag")
	@Export("hasAlphaTransform")
	boolean hasAlphaTransform;

	static {
		field2543 = new int[500];
		field2540 = new int[500];
		field2541 = new int[500];
		field2546 = new int[500];
	}

	@ObfuscatedSignature(
		descriptor = "([BLih;)V"
	)
	Animation(byte[] var1, Skeleton var2) {
		this.skeleton = null;
		this.transformCount = -1;
		this.hasAlphaTransform = false;
		this.skeleton = var2;
		Buffer var3 = new Buffer(var1);
		Buffer var4 = new Buffer(var1);
		var3.field5818 = 2;
		int var5 = var3.readUnsignedByte();
		int var6 = -1;
		int var7 = 0;
		var4.field5818 = var5 + var3.field5818;

		int var8;
		for (var8 = 0; var8 < var5; ++var8) {
			int var9 = var3.readUnsignedByte();
			if (var9 > 0) {
				if (this.skeleton.transformTypes[var8] != 0) {
					for (int var10 = var8 - 1; var10 > var6; --var10) {
						if (this.skeleton.transformTypes[var10] == 0) {
							field2543[var7] = var10;
							field2540[var7] = 0;
							field2541[var7] = 0;
							field2546[var7] = 0;
							++var7;
							break;
						}
					}
				}

				field2543[var7] = var8;
				short var11 = 0;
				if (this.skeleton.transformTypes[var8] == 3) {
					var11 = 128;
				}

				if ((var9 & 1) != 0) {
					field2540[var7] = var4.readShortSmart();
				} else {
					field2540[var7] = var11;
				}

				if ((var9 & 2) != 0) {
					field2541[var7] = var4.readShortSmart();
				} else {
					field2541[var7] = var11;
				}

				if ((var9 & 4) != 0) {
					field2546[var7] = var4.readShortSmart();
				} else {
					field2546[var7] = var11;
				}

				var6 = var8;
				++var7;
				if (this.skeleton.transformTypes[var8] == 5) {
					this.hasAlphaTransform = true;
				}
			}
		}

		if (var1.length != var4.field5818) {
			throw new RuntimeException();
		} else {
			this.transformCount = var7;
			this.transformSkeletonLabels = new int[var7];
			this.transformXs = new int[var7];
			this.transformYs = new int[var7];
			this.transformZs = new int[var7];

			for (var8 = 0; var8 < var7; ++var8) {
				this.transformSkeletonLabels[var8] = field2543[var8];
				this.transformXs[var8] = field2540[var8];
				this.transformYs[var8] = field2541[var8];
				this.transformZs[var8] = field2546[var8];
			}

			var3.field5818 = var4.field5818;
		}
	}
}
