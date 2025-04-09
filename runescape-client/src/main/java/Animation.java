import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gk")
@Implements("Animation")
public class Animation {
	@ObfuscatedName("ao")
	static int[] field1964;
	@ObfuscatedName("an")
	static int[] field1956;
	@ObfuscatedName("ae")
	static int[] field1957;
	@ObfuscatedName("af")
	static int[] field1955;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	@Export("skeleton")
	Skeleton skeleton;
	@ObfuscatedName("aq")
	@Export("transformCount")
	int transformCount;
	@ObfuscatedName("av")
	@Export("transformSkeletonLabels")
	int[] transformSkeletonLabels;
	@ObfuscatedName("am")
	@Export("transformXs")
	int[] transformXs;
	@ObfuscatedName("aa")
	@Export("transformYs")
	int[] transformYs;
	@ObfuscatedName("ap")
	@Export("transformZs")
	int[] transformZs;
	@ObfuscatedName("ax")
	@Export("hasAlphaTransform")
	boolean hasAlphaTransform;

	static {
		field1964 = new int[500];
		field1956 = new int[500];
		field1957 = new int[500];
		field1955 = new int[500];
	}

	@ObfuscatedSignature(
		descriptor = "([BLhl;)V"
	)
	Animation(byte[] var1, Skeleton var2) {
		this.skeleton = null;
		this.transformCount = -1;
		this.hasAlphaTransform = false;
		this.skeleton = var2;
		Buffer var3 = new Buffer(var1);
		Buffer var4 = new Buffer(var1);
		var3.offset = 59399494;
		int var5 = var3.readUnsignedByte();
		int var6 = -1;
		int var7 = 0;
		var4.offset = (var5 + var3.offset * -2066221813) * 29699747;

		int var8;
		for (var8 = 0; var8 < var5; ++var8) {
			int var9 = var3.readUnsignedByte();
			if (var9 > 0) {
				if (this.skeleton.transformTypes[var8] != 0) {
					for (int var10 = var8 - 1; var10 > var6; --var10) {
						if (this.skeleton.transformTypes[var10] == 0) {
							field1964[var7] = var10;
							field1956[var7] = 0;
							field1957[var7] = 0;
							field1955[var7] = 0;
							++var7;
							break;
						}
					}
				}

				field1964[var7] = var8;
				short var11 = 0;
				if (this.skeleton.transformTypes[var8] == 3) {
					var11 = 128;
				}

				if ((var9 & 1) != 0) {
					field1956[var7] = var4.readShortSmart();
				} else {
					field1956[var7] = var11;
				}

				if ((var9 & 2) != 0) {
					field1957[var7] = var4.readShortSmart();
				} else {
					field1957[var7] = var11;
				}

				if ((var9 & 4) != 0) {
					field1955[var7] = var4.readShortSmart();
				} else {
					field1955[var7] = var11;
				}

				var6 = var8;
				++var7;
				if (this.skeleton.transformTypes[var8] == 5) {
					this.hasAlphaTransform = true;
				}
			}
		}

		if (var1.length != var4.offset * -2066221813) {
			throw new RuntimeException();
		} else {
			this.transformCount = var7;
			this.transformSkeletonLabels = new int[var7];
			this.transformXs = new int[var7];
			this.transformYs = new int[var7];
			this.transformZs = new int[var7];

			for (var8 = 0; var8 < var7; ++var8) {
				this.transformSkeletonLabels[var8] = field1964[var8];
				this.transformXs[var8] = field1956[var8];
				this.transformYs[var8] = field1957[var8];
				this.transformZs[var8] = field1955[var8];
			}

			var3.offset = var4.offset;
		}
	}
}
