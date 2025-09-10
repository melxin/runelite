import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vd")
public class class548 extends class551 {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -65435855
	)
	int field5643;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 155660375
	)
	int field5642;
	@ObfuscatedName("at")
	double field5648;
	@ObfuscatedName("ac")
	double field5641;
	@ObfuscatedName("ap")
	double field5645;
	@ObfuscatedName("aq")
	double field5646;
	@ObfuscatedName("ao")
	double field5647;

	public class548(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		super(var9, var10);
		this.field5643 = 0;
		this.field5642 = 0;
		this.field5648 = 0.0D;
		this.field5641 = 0.0D;
		this.field5645 = 0.0D;
		this.field5646 = 0.0D;
		this.field5647 = 0.0D;
		this.field5643 = var3;
		this.field5642 = var6;
		if ((var5 - var8) * (var7 - var1) == (var4 - var7) * (var8 - var2)) {
			this.field5648 = (double)var4;
			this.field5641 = (double)var5;
		} else {
			double var11 = (double)((float)(var7 + var1)) / 2.0D;
			double var13 = (double)((float)(var8 + var2)) / 2.0D;
			double var15 = (double)((float)(var4 + var7)) / 2.0D;
			double var17 = (double)((float)(var5 + var8)) / 2.0D;
			double var19 = (double)(var7 - var1) * -1.0D / (double)(var8 - var2);
			double var21 = (double)(var4 - var7) * -1.0D / (double)(var5 - var8);
			this.field5648 = (var19 * var11 - var21 * var15 + var17 - var13) / (var19 - var21);
			this.field5641 = var19 * (this.field5648 - var11) + var13;
			this.field5645 = Math.sqrt(Math.pow(this.field5648 - (double)var1, 2.0D) + Math.pow(this.field5641 - (double)var2, 2.0D));
			this.field5646 = Math.atan2((double)var2 - this.field5641, (double)var1 - this.field5648);
			double var23 = Math.atan2((double)var8 - this.field5641, (double)var7 - this.field5648);
			this.field5647 = Math.atan2((double)var5 - this.field5641, (double)var4 - this.field5648);
			boolean var25 = this.field5646 <= var23 && var23 <= this.field5647 || this.field5647 <= var23 && var23 <= this.field5646;
			if (!var25) {
				this.field5647 += 3.141592653589793D * (double)(this.field5646 - this.field5647 > 0.0D ? 2 : -2);
			}

		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2121166831"
	)
	public int vmethod10615() {
		double var1 = this.method10618();
		double var3 = var1 * (this.field5647 - this.field5646) + this.field5646;
		return (int)Math.round(this.field5648 + this.field5645 * Math.cos(var3));
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1036932109"
	)
	public int vmethod10609() {
		double var1 = this.method10618();
		double var3 = this.field5646 + (this.field5647 - this.field5646) * var1;
		return (int)Math.round(this.field5641 + this.field5645 * Math.sin(var3));
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1956644652"
	)
	public int vmethod10614() {
		double var1 = this.method10618();
		return (int)Math.round((double)this.field5643 + (double)(this.field5642 - this.field5643) * var1);
	}
}
