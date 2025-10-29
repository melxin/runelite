import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vx")
public class class556 extends class559 {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -922834783
	)
	int field5744;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -193648427
	)
	int field5740;
	@ObfuscatedName("ag")
	double field5741;
	@ObfuscatedName("an")
	double field5745;
	@ObfuscatedName("ae")
	double field5743;
	@ObfuscatedName("aj")
	double field5742;
	@ObfuscatedName("ak")
	double field5739;

	public class556(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		super(var9, var10);
		this.field5744 = 0;
		this.field5740 = 0;
		this.field5741 = 0.0D;
		this.field5745 = 0.0D;
		this.field5743 = 0.0D;
		this.field5742 = 0.0D;
		this.field5739 = 0.0D;
		this.field5744 = var3;
		this.field5740 = var6;
		if ((var5 - var8) * (var7 - var1) == (var4 - var7) * (var8 - var2)) {
			this.field5741 = (double)var4;
			this.field5745 = (double)var5;
		} else {
			double var11 = (double)((float)(var7 + var1)) / 2.0D;
			double var13 = (double)((float)(var8 + var2)) / 2.0D;
			double var15 = (double)((float)(var4 + var7)) / 2.0D;
			double var17 = (double)((float)(var5 + var8)) / 2.0D;
			double var19 = (double)(var7 - var1) * -1.0D / (double)(var8 - var2);
			double var21 = (double)(var4 - var7) * -1.0D / (double)(var5 - var8);
			this.field5741 = (var17 + (var11 * var19 - var15 * var21) - var13) / (var19 - var21);
			this.field5745 = var19 * (this.field5741 - var11) + var13;
			this.field5743 = Math.sqrt(Math.pow(this.field5741 - (double)var1, 2.0D) + Math.pow(this.field5745 - (double)var2, 2.0D));
			this.field5742 = Math.atan2((double)var2 - this.field5745, (double)var1 - this.field5741);
			double var23 = Math.atan2((double)var8 - this.field5745, (double)var7 - this.field5741);
			this.field5739 = Math.atan2((double)var5 - this.field5745, (double)var4 - this.field5741);
			boolean var25 = this.field5742 <= var23 && var23 <= this.field5739 || this.field5739 <= var23 && var23 <= this.field5742;
			if (!var25) {
				this.field5739 += (double)(this.field5742 - this.field5739 > 0.0D ? 2 : -2) * 3.141592653589793D;
			}

		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1159791844"
	)
	public int vmethod10971() {
		double var1 = this.method10984();
		double var3 = var1 * (this.field5739 - this.field5742) + this.field5742;
		return (int)Math.round(this.field5741 + this.field5743 * Math.cos(var3));
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1928238764"
	)
	public int vmethod10974() {
		double var1 = this.method10984();
		double var3 = (this.field5739 - this.field5742) * var1 + this.field5742;
		return (int)Math.round(this.field5745 + this.field5743 * Math.sin(var3));
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "814091759"
	)
	public int vmethod10970() {
		double var1 = this.method10984();
		return (int)Math.round((double)this.field5744 + var1 * (double)(this.field5740 - this.field5744));
	}

	@ObfuscatedName("no")
	@ObfuscatedSignature(
		descriptor = "(Lof;I)Z",
		garbageValue = "-1333135934"
	)
	@Export("runCs1")
	static final boolean runCs1(Widget var0) {
		if (var0.cs1Comparisons == null) {
			return false;
		} else {
			for (int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) {
				int var2 = class147.method3943(var0, var1);
				int var3 = var0.cs1ComparisonValues[var1];
				if (var0.cs1Comparisons[var1] == 2) {
					if (var2 >= var3) {
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 3) {
					if (var2 <= var3) {
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 4) {
					if (var3 == var2) {
						return false;
					}
				} else if (var2 != var3) {
					return false;
				}
			}

			return true;
		}
	}
}
