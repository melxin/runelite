import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("we")
public class class582 extends class583 {
	@ObfuscatedName("al")
	final int[][] field5796;
	@ObfuscatedName("ab")
	final int[][] field5792;
	@ObfuscatedName("ac")
	final int[] field5797;
	@ObfuscatedName("av")
	final int[] field5794;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Lri;"
	)
	final Bounds[] field5795;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[Lri;"
	)
	final Bounds[] field5793;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lri;"
	)
	final Bounds[] field5791;

	public class582(int var1, int var2, int var3, int var4) {
		super(var1, var2, var3, var4);
		this.field5796 = new int[16][4];
		this.field5792 = new int[16][4];
		this.field5797 = new int[16];
		this.field5794 = new int[16];
		this.field5795 = new Bounds[16];
		this.field5793 = new Bounds[16];
		this.field5791 = new Bounds[16];

		for (int var5 = 0; var5 < 16; ++var5) {
			int var6 = var5 * 128;
			int var7 = WorldMapLabel.method6812(var6);
			int var8 = class532.field5477[var6 & 2047];
			int var10 = -(var3 * var7 - var8 * var4 >> 16);
			int var11 = var3 * var8 + var7 * var4 >> 16;
			int var12 = var7 * super.field5798 - var8 * super.field5802 >> 16;
			int var13 = var7 * super.field5802 + var8 * super.field5798 >> 16;
			int var14 = var8 * super.field5802 + var7 * super.field5798 >> 16;
			int var15 = var7 * super.field5802 - var8 * super.field5798 >> 16;
			this.field5796[var5] = new int[4];
			this.field5792[var5] = new int[4];
			this.field5796[var5][0] = var10 - var12;
			this.field5792[var5][0] = var13 + var11;
			this.field5796[var5][1] = var10 + var14;
			this.field5792[var5][1] = var15 + var11;
			this.field5796[var5][2] = var10 + var12;
			this.field5792[var5][2] = var11 - var13;
			this.field5796[var5][3] = var10 - var14;
			this.field5792[var5][3] = var11 - var15;
			this.field5797[var5] = Math.abs(var8 * super.field5802) >> 16;
			this.field5794[var5] = Math.abs(var7 * super.field5802) >> 16;
			int var16 = Math.min(this.field5796[var5][0], Math.min(this.field5796[var5][1], Math.min(this.field5796[var5][2], this.field5796[var5][3])));
			int var17 = Math.max(this.field5796[var5][0], Math.max(this.field5796[var5][1], Math.max(this.field5796[var5][2], this.field5796[var5][3])));
			int var18 = Math.min(this.field5792[var5][0], Math.min(this.field5792[var5][1], Math.min(this.field5792[var5][2], this.field5792[var5][3])));
			int var19 = Math.max(this.field5792[var5][0], Math.max(this.field5792[var5][1], Math.max(this.field5792[var5][2], this.field5792[var5][3])));
			this.field5795[var5] = new Bounds(var16, var18, var17 - var16, var19 - var18);
			var16 = Math.min(this.field5796[var5][2], Math.min(this.field5796[var5][3], var10));
			var17 = Math.max(this.field5796[var5][2], Math.max(this.field5796[var5][3], var10));
			var18 = Math.min(this.field5792[var5][2], Math.min(this.field5792[var5][3], var11));
			var19 = Math.max(this.field5792[var5][2], Math.max(this.field5792[var5][3], var11));
			this.field5793[var5] = new Bounds(var16, var18, var17 - var16, var19 - var18);
			var16 = Math.min(this.field5796[var5][0], Math.min(this.field5796[var5][1], var10));
			var17 = Math.max(this.field5796[var5][0], Math.max(this.field5796[var5][1], var10));
			var18 = Math.min(this.field5792[var5][0], Math.min(this.field5792[var5][1], var11));
			var19 = Math.max(this.field5792[var5][0], Math.max(this.field5792[var5][1], var11));
			this.field5791[var5] = new Bounds(var16, var18, var17 - var16, var19 - var18);
		}

	}
}
