import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("we")
public class class575 extends class576 {
	@ObfuscatedName("ap")
	final int[][] field5671;
	@ObfuscatedName("aj")
	final int[][] field5668;
	@ObfuscatedName("an")
	final int[] field5669;
	@ObfuscatedName("ai")
	final int[] field5670;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Lrv;"
	)
	final Bounds[] field5672;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[Lrv;"
	)
	final Bounds[] field5667;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "[Lrv;"
	)
	final Bounds[] field5673;

	public class575(int var1, int var2, int var3, int var4) {
		super(var1, var2, var3, var4);
		this.field5671 = new int[16][4];
		this.field5668 = new int[16][4];
		this.field5669 = new int[16];
		this.field5670 = new int[16];
		this.field5672 = new Bounds[16];
		this.field5667 = new Bounds[16];
		this.field5673 = new Bounds[16];

		for (int var5 = 0; var5 < 16; ++var5) {
			int var6 = var5 * 128;
			int var7 = VertexNormal.method5706(var6);
			int var8 = class177.method3964(var6);
			int var9 = -(var3 * var7 - var8 * var4 >> 16);
			int var10 = var3 * var8 + var7 * var4 >> 16;
			int var11 = var7 * super.field5674 - var8 * super.field5680 >> 16;
			int var12 = var8 * super.field5674 + var7 * super.field5680 >> 16;
			int var13 = var7 * super.field5674 + var8 * super.field5680 >> 16;
			int var14 = var7 * super.field5680 - var8 * super.field5674 >> 16;
			this.field5671[var5] = new int[4];
			this.field5668[var5] = new int[4];
			this.field5671[var5][0] = var9 - var11;
			this.field5668[var5][0] = var10 + var12;
			this.field5671[var5][1] = var9 + var13;
			this.field5668[var5][1] = var10 + var14;
			this.field5671[var5][2] = var9 + var11;
			this.field5668[var5][2] = var10 - var12;
			this.field5671[var5][3] = var9 - var13;
			this.field5668[var5][3] = var10 - var14;
			this.field5669[var5] = Math.abs(var8 * super.field5680) >> 16;
			this.field5670[var5] = Math.abs(var7 * super.field5680) >> 16;
			int var15 = Math.min(this.field5671[var5][0], Math.min(this.field5671[var5][1], Math.min(this.field5671[var5][2], this.field5671[var5][3])));
			int var16 = Math.max(this.field5671[var5][0], Math.max(this.field5671[var5][1], Math.max(this.field5671[var5][2], this.field5671[var5][3])));
			int var17 = Math.min(this.field5668[var5][0], Math.min(this.field5668[var5][1], Math.min(this.field5668[var5][2], this.field5668[var5][3])));
			int var18 = Math.max(this.field5668[var5][0], Math.max(this.field5668[var5][1], Math.max(this.field5668[var5][2], this.field5668[var5][3])));
			this.field5672[var5] = new Bounds(var15, var17, var16 - var15, var18 - var17);
			var15 = Math.min(this.field5671[var5][2], Math.min(this.field5671[var5][3], var9));
			var16 = Math.max(this.field5671[var5][2], Math.max(this.field5671[var5][3], var9));
			var17 = Math.min(this.field5668[var5][2], Math.min(this.field5668[var5][3], var10));
			var18 = Math.max(this.field5668[var5][2], Math.max(this.field5668[var5][3], var10));
			this.field5667[var5] = new Bounds(var15, var17, var16 - var15, var18 - var17);
			var15 = Math.min(this.field5671[var5][0], Math.min(this.field5671[var5][1], var9));
			var16 = Math.max(this.field5671[var5][0], Math.max(this.field5671[var5][1], var9));
			var17 = Math.min(this.field5668[var5][0], Math.min(this.field5668[var5][1], var10));
			var18 = Math.max(this.field5668[var5][0], Math.max(this.field5668[var5][1], var10));
			this.field5673[var5] = new Bounds(var15, var17, var16 - var15, var18 - var17);
		}

	}
}
