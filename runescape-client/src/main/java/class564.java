import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vt")
public class class564 extends class565 {
	@ObfuscatedName("av")
	final int[][] field5838;
	@ObfuscatedName("at")
	final int[][] field5837;
	@ObfuscatedName("ag")
	final int[] field5839;
	@ObfuscatedName("an")
	final int[] field5842;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lrl;"
	)
	final Bounds[] field5841;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Lrl;"
	)
	final Bounds[] field5840;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[Lrl;"
	)
	final Bounds[] field5843;

	class564(int var1, int var2, int var3, int var4, int var5, int var6) {
		super(var1, var2, var3, var4, var5, var6);
		this.field5838 = new int[16][4];
		this.field5837 = new int[16][4];
		this.field5839 = new int[16];
		this.field5842 = new int[16];
		this.field5841 = new Bounds[16];
		this.field5840 = new Bounds[16];
		this.field5843 = new Bounds[16];

		for (int var7 = 0; var7 < 16; ++var7) {
			int var8 = var7 * 128;
			int var9 = class544.field5668[var8 & 2047];
			int var11 = class66.method2206(var8);
			int var12 = -(var3 * var9 - var11 * var4 >> 16);
			int var13 = var9 * var4 + var3 * var11 >> 16;
			int var14 = var9 * super.field5851 - var11 * super.field5847 >> 16;
			int var15 = var11 * super.field5851 + var9 * super.field5847 >> 16;
			int var16 = var9 * super.field5851 + var11 * super.field5847 >> 16;
			int var17 = var9 * super.field5847 - var11 * super.field5851 >> 16;
			this.field5838[var7] = new int[4];
			this.field5837[var7] = new int[4];
			this.field5838[var7][0] = var12 - var14;
			this.field5837[var7][0] = var13 + var15;
			this.field5838[var7][1] = var16 + var12;
			this.field5837[var7][1] = var13 + var17;
			this.field5838[var7][2] = var12 + var14;
			this.field5837[var7][2] = var13 - var15;
			this.field5838[var7][3] = var12 - var16;
			this.field5837[var7][3] = var13 - var17;
			this.field5839[var7] = Math.abs(var11 * super.field5847) >> 16;
			this.field5842[var7] = Math.abs(var9 * super.field5847) >> 16;
			int var18 = Math.min(this.field5838[var7][0], Math.min(this.field5838[var7][1], Math.min(this.field5838[var7][2], this.field5838[var7][3])));
			int var19 = Math.max(this.field5838[var7][0], Math.max(this.field5838[var7][1], Math.max(this.field5838[var7][2], this.field5838[var7][3])));
			int var20 = Math.min(this.field5837[var7][0], Math.min(this.field5837[var7][1], Math.min(this.field5837[var7][2], this.field5837[var7][3])));
			int var21 = Math.max(this.field5837[var7][0], Math.max(this.field5837[var7][1], Math.max(this.field5837[var7][2], this.field5837[var7][3])));
			this.field5841[var7] = new Bounds(var18, var20, var19 - var18, var21 - var20);
			var18 = Math.min(this.field5838[var7][2], Math.min(this.field5838[var7][3], var12));
			var19 = Math.max(this.field5838[var7][2], Math.max(this.field5838[var7][3], var12));
			var20 = Math.min(this.field5837[var7][2], Math.min(this.field5837[var7][3], var13));
			var21 = Math.max(this.field5837[var7][2], Math.max(this.field5837[var7][3], var13));
			this.field5840[var7] = new Bounds(var18, var20, var19 - var18, var21 - var20);
			var18 = Math.min(this.field5838[var7][0], Math.min(this.field5838[var7][1], var12));
			var19 = Math.max(this.field5838[var7][0], Math.max(this.field5838[var7][1], var12));
			var20 = Math.min(this.field5837[var7][0], Math.min(this.field5837[var7][1], var13));
			var21 = Math.max(this.field5837[var7][0], Math.max(this.field5837[var7][1], var13));
			this.field5843[var7] = new Bounds(var18, var20, var19 - var18, var21 - var20);
		}

	}

	public class564(int var1, int var2, int var3, int var4) {
		this(var1, var2, var3, var4, 2359552, 0);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "0"
	)
	int method11236(int var1, int var2) {
		return this.field5838[var1][var2];
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "13"
	)
	int method11235(int var1, int var2) {
		return this.field5837[var1][var2];
	}
}
