import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uw")
public class class544 extends class547 {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 62011403
	)
	int field5552;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 979821217
	)
	int field5547;
	@ObfuscatedName("ac")
	double field5548;
	@ObfuscatedName("av")
	double field5549;
	@ObfuscatedName("au")
	double field5546;
	@ObfuscatedName("as")
	double field5551;
	@ObfuscatedName("ah")
	double field5550;

	public class544(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		super(var9, var10);
		this.field5552 = 0;
		this.field5547 = 0;
		this.field5548 = 0.0D;
		this.field5549 = 0.0D;
		this.field5546 = 0.0D;
		this.field5551 = 0.0D;
		this.field5550 = 0.0D;
		this.field5552 = var3;
		this.field5547 = var6;
		if ((var5 - var8) * (var7 - var1) == (var4 - var7) * (var8 - var2)) {
			this.field5548 = (double)var4;
			this.field5549 = (double)var5;
		} else {
			double var11 = (double)((float)(var7 + var1)) / 2.0D;
			double var13 = (double)((float)(var8 + var2)) / 2.0D;
			double var15 = (double)((float)(var4 + var7)) / 2.0D;
			double var17 = (double)((float)(var5 + var8)) / 2.0D;
			double var19 = (double)(var7 - var1) * -1.0D / (double)(var8 - var2);
			double var21 = (double)(var4 - var7) * -1.0D / (double)(var5 - var8);
			this.field5548 = (var17 + (var19 * var11 - var21 * var15) - var13) / (var19 - var21);
			this.field5549 = var13 + (this.field5548 - var11) * var19;
			this.field5546 = Math.sqrt(Math.pow(this.field5548 - (double)var1, 2.0D) + Math.pow(this.field5549 - (double)var2, 2.0D));
			this.field5551 = Math.atan2((double)var2 - this.field5549, (double)var1 - this.field5548);
			double var23 = Math.atan2((double)var8 - this.field5549, (double)var7 - this.field5548);
			this.field5550 = Math.atan2((double)var5 - this.field5549, (double)var4 - this.field5548);
			boolean var25 = this.field5551 <= var23 && var23 <= this.field5550 || this.field5550 <= var23 && var23 <= this.field5551;
			if (!var25) {
				this.field5550 += 3.141592653589793D * (double)(this.field5551 - this.field5550 > 0.0D ? 2 : -2);
			}

		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	public int vmethod10662() {
		double var1 = this.method10664();
		double var3 = this.field5551 + var1 * (this.field5550 - this.field5551);
		return (int)Math.round(this.field5548 + this.field5546 * Math.cos(var3));
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "31"
	)
	public int vmethod10660() {
		double var1 = this.method10664();
		double var3 = this.field5551 + (this.field5550 - this.field5551) * var1;
		return (int)Math.round(this.field5549 + this.field5546 * Math.sin(var3));
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-170491900"
	)
	public int vmethod10654() {
		double var1 = this.method10664();
		return (int)Math.round((double)(this.field5547 - this.field5552) * var1 + (double)this.field5552);
	}
}
