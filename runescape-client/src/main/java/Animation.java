import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jv")
@Implements("Animation")
public class Animation {
	@ObfuscatedName("ab")
	static int[] field2603;
	@ObfuscatedName("ay")
	static int[] field2605;
	@ObfuscatedName("au")
	static int[] field2604;
	@ObfuscatedName("ad")
	static int[] field2606;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	@Export("skeleton")
	Skeleton skeleton;
	@ObfuscatedName("ac")
	@Export("transformCount")
	int transformCount;
	@ObfuscatedName("ao")
	@Export("transformSkeletonLabels")
	int[] transformSkeletonLabels;
	@ObfuscatedName("af")
	@Export("transformXs")
	int[] transformXs;
	@ObfuscatedName("aa")
	@Export("transformYs")
	int[] transformYs;
	@ObfuscatedName("as")
	@Export("transformZs")
	int[] transformZs;
	@ObfuscatedName("ae")
	@Export("hasAlphaTransform")
	boolean hasAlphaTransform;

	static {
		field2603 = new int[500];
		field2605 = new int[500];
		field2604 = new int[500];
		field2606 = new int[500];
	}

	@ObfuscatedSignature(
		descriptor = "([BLjg;)V"
	)
	Animation(byte[] var1, Skeleton var2) {
		this.skeleton = null;
		this.transformCount = -1;
		this.hasAlphaTransform = false;
		this.skeleton = var2;
		Buffer var3 = new Buffer(var1);
		Buffer var4 = new Buffer(var1);
		var3.field5570 = 2;
		int var5 = var3.readUnsignedByte();
		int var6 = -1;
		int var7 = 0;
		var4.field5570 = var5 + var3.field5570;

		int var8;
		for (var8 = 0; var8 < var5; ++var8) {
			int var9 = var3.readUnsignedByte();
			if (var9 > 0) {
				if (this.skeleton.transformTypes[var8] != 0) {
					for (int var10 = var8 - 1; var10 > var6; --var10) {
						if (this.skeleton.transformTypes[var10] == 0) {
							field2603[var7] = var10;
							field2605[var7] = 0;
							field2604[var7] = 0;
							field2606[var7] = 0;
							++var7;
							break;
						}
					}
				}

				field2603[var7] = var8;
				short var11 = 0;
				if (this.skeleton.transformTypes[var8] == 3) {
					var11 = 128;
				}

				if ((var9 & 1) != 0) {
					field2605[var7] = var4.readShortSmart();
				} else {
					field2605[var7] = var11;
				}

				if ((var9 & 2) != 0) {
					field2604[var7] = var4.readShortSmart();
				} else {
					field2604[var7] = var11;
				}

				if ((var9 & 4) != 0) {
					field2606[var7] = var4.readShortSmart();
				} else {
					field2606[var7] = var11;
				}

				var6 = var8;
				++var7;
				if (this.skeleton.transformTypes[var8] == 5) {
					this.hasAlphaTransform = true;
				}
			}
		}

		if (var1.length != var4.field5570) {
			throw new RuntimeException();
		} else {
			this.transformCount = var7;
			this.transformSkeletonLabels = new int[var7];
			this.transformXs = new int[var7];
			this.transformYs = new int[var7];
			this.transformZs = new int[var7];

			for (var8 = 0; var8 < var7; ++var8) {
				this.transformSkeletonLabels[var8] = field2603[var8];
				this.transformXs[var8] = field2605[var8];
				this.transformYs[var8] = field2604[var8];
				this.transformZs[var8] = field2606[var8];
			}

			var3.field5570 = var4.field5570;
		}
	}
}
