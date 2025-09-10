import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wm")
public class class586 extends class587 {
	@ObfuscatedName("af")
	final int[][] field5894;
	@ObfuscatedName("aw")
	final int[][] field5892;
	@ObfuscatedName("at")
	final int[] field5893;
	@ObfuscatedName("ac")
	final int[] field5896;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Lrw;"
	)
	final Bounds[] field5895;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Lrw;"
	)
	final Bounds[] field5891;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Lrw;"
	)
	final Bounds[] field5897;

	class586(int var1, int var2, int var3, int var4, int var5, int var6) {
		super(var1, var2, var3, var4, var5, var6);
		this.field5894 = new int[16][4];
		this.field5892 = new int[16][4];
		this.field5893 = new int[16];
		this.field5896 = new int[16];
		this.field5895 = new Bounds[16];
		this.field5891 = new Bounds[16];
		this.field5897 = new Bounds[16];

		for (int var7 = 0; var7 < 16; ++var7) {
			int var8 = var7 * 128;
			int var9 = class536.field5571[var8 & 2047];
			int var11 = class536.field5574[var8 & 2047];
			int var13 = -(var3 * var9 - var11 * var4 >> 16);
			int var14 = var3 * var11 + var9 * var4 >> 16;
			int var15 = var9 * super.field5900 - var11 * super.field5901 >> 16;
			int var16 = var11 * super.field5900 + var9 * super.field5901 >> 16;
			int var17 = var11 * super.field5901 + var9 * super.field5900 >> 16;
			int var18 = var9 * super.field5901 - var11 * super.field5900 >> 16;
			this.field5894[var7] = new int[4];
			this.field5892[var7] = new int[4];
			this.field5894[var7][0] = var13 - var15;
			this.field5892[var7][0] = var16 + var14;
			this.field5894[var7][1] = var17 + var13;
			this.field5892[var7][1] = var14 + var18;
			this.field5894[var7][2] = var13 + var15;
			this.field5892[var7][2] = var14 - var16;
			this.field5894[var7][3] = var13 - var17;
			this.field5892[var7][3] = var14 - var18;
			this.field5893[var7] = Math.abs(var11 * super.field5901) >> 16;
			this.field5896[var7] = Math.abs(var9 * super.field5901) >> 16;
			int var19 = Math.min(this.field5894[var7][0], Math.min(this.field5894[var7][1], Math.min(this.field5894[var7][2], this.field5894[var7][3])));
			int var20 = Math.max(this.field5894[var7][0], Math.max(this.field5894[var7][1], Math.max(this.field5894[var7][2], this.field5894[var7][3])));
			int var21 = Math.min(this.field5892[var7][0], Math.min(this.field5892[var7][1], Math.min(this.field5892[var7][2], this.field5892[var7][3])));
			int var22 = Math.max(this.field5892[var7][0], Math.max(this.field5892[var7][1], Math.max(this.field5892[var7][2], this.field5892[var7][3])));
			this.field5895[var7] = new Bounds(var19, var21, var20 - var19, var22 - var21);
			var19 = Math.min(this.field5894[var7][2], Math.min(this.field5894[var7][3], var13));
			var20 = Math.max(this.field5894[var7][2], Math.max(this.field5894[var7][3], var13));
			var21 = Math.min(this.field5892[var7][2], Math.min(this.field5892[var7][3], var14));
			var22 = Math.max(this.field5892[var7][2], Math.max(this.field5892[var7][3], var14));
			this.field5891[var7] = new Bounds(var19, var21, var20 - var19, var22 - var21);
			var19 = Math.min(this.field5894[var7][0], Math.min(this.field5894[var7][1], var13));
			var20 = Math.max(this.field5894[var7][0], Math.max(this.field5894[var7][1], var13));
			var21 = Math.min(this.field5892[var7][0], Math.min(this.field5892[var7][1], var14));
			var22 = Math.max(this.field5892[var7][0], Math.max(this.field5892[var7][1], var14));
			this.field5897[var7] = new Bounds(var19, var21, var20 - var19, var22 - var21);
		}

	}

	public class586(int var1, int var2, int var3, int var4) {
		this(var1, var2, var3, var4, 2359552, 0);
	}
}
