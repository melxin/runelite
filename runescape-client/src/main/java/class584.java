import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wq")
public class class584 extends class585 {
	@ObfuscatedName("ab")
	final int[][] field5956;
	@ObfuscatedName("at")
	final int[][] field5954;
	@ObfuscatedName("ag")
	final int[] field5955;
	@ObfuscatedName("aj")
	final int[] field5959;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lra;"
	)
	final Bounds[] field5957;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[Lra;"
	)
	final Bounds[] field5958;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lra;"
	)
	final Bounds[] field5953;

	class584(int var1, int var2, int var3, int var4, int var5, int var6) {
		super(var1, var2, var3, var4, var5, var6);
		this.field5956 = new int[16][4];
		this.field5954 = new int[16][4];
		this.field5955 = new int[16];
		this.field5959 = new int[16];
		this.field5957 = new Bounds[16];
		this.field5958 = new Bounds[16];
		this.field5953 = new Bounds[16];

		for (int var7 = 0; var7 < 16; ++var7) {
			int var8 = var7 * 128;
			int var9 = class534.field5650[var8 & 2047];
			int var11 = class267.method6053(var8);
			int var12 = -(var3 * var9 - var11 * var4 >> 16);
			int var13 = var9 * var4 + var3 * var11 >> 16;
			int var14 = var9 * super.field5962 - var11 * super.field5963 >> 16;
			int var15 = var11 * super.field5962 + var9 * super.field5963 >> 16;
			int var16 = var11 * super.field5963 + var9 * super.field5962 >> 16;
			int var17 = var9 * super.field5963 - var11 * super.field5962 >> 16;
			this.field5956[var7] = new int[4];
			this.field5954[var7] = new int[4];
			this.field5956[var7][0] = var12 - var14;
			this.field5954[var7][0] = var13 + var15;
			this.field5956[var7][1] = var16 + var12;
			this.field5954[var7][1] = var13 + var17;
			this.field5956[var7][2] = var12 + var14;
			this.field5954[var7][2] = var13 - var15;
			this.field5956[var7][3] = var12 - var16;
			this.field5954[var7][3] = var13 - var17;
			this.field5955[var7] = Math.abs(var11 * super.field5963) >> 16;
			this.field5959[var7] = Math.abs(var9 * super.field5963) >> 16;
			int var18 = Math.min(this.field5956[var7][0], Math.min(this.field5956[var7][1], Math.min(this.field5956[var7][2], this.field5956[var7][3])));
			int var19 = Math.max(this.field5956[var7][0], Math.max(this.field5956[var7][1], Math.max(this.field5956[var7][2], this.field5956[var7][3])));
			int var20 = Math.min(this.field5954[var7][0], Math.min(this.field5954[var7][1], Math.min(this.field5954[var7][2], this.field5954[var7][3])));
			int var21 = Math.max(this.field5954[var7][0], Math.max(this.field5954[var7][1], Math.max(this.field5954[var7][2], this.field5954[var7][3])));
			this.field5957[var7] = new Bounds(var18, var20, var19 - var18, var21 - var20);
			var18 = Math.min(this.field5956[var7][2], Math.min(this.field5956[var7][3], var12));
			var19 = Math.max(this.field5956[var7][2], Math.max(this.field5956[var7][3], var12));
			var20 = Math.min(this.field5954[var7][2], Math.min(this.field5954[var7][3], var13));
			var21 = Math.max(this.field5954[var7][2], Math.max(this.field5954[var7][3], var13));
			this.field5958[var7] = new Bounds(var18, var20, var19 - var18, var21 - var20);
			var18 = Math.min(this.field5956[var7][0], Math.min(this.field5956[var7][1], var12));
			var19 = Math.max(this.field5956[var7][0], Math.max(this.field5956[var7][1], var12));
			var20 = Math.min(this.field5954[var7][0], Math.min(this.field5954[var7][1], var13));
			var21 = Math.max(this.field5954[var7][0], Math.max(this.field5954[var7][1], var13));
			this.field5953[var7] = new Bounds(var18, var20, var19 - var18, var21 - var20);
		}

	}

	public class584(int var1, int var2, int var3, int var4) {
		this(var1, var2, var3, var4, 2359552, 0);
	}
}
