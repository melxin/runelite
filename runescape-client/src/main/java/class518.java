import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tp")
public class class518 extends class521 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1747926423
	)
	int field5222;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1695149069
	)
	int field5223;
	@ObfuscatedName("at")
	double field5221;
	@ObfuscatedName("ae")
	double field5224;
	@ObfuscatedName("ao")
	double field5225;
	@ObfuscatedName("ac")
	double field5226;
	@ObfuscatedName("aj")
	double field5227;

	public class518(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		super(var9, var10);
		this.field5222 = 0;
		this.field5223 = 0;
		this.field5221 = 0.0D;
		this.field5224 = 0.0D;
		this.field5225 = 0.0D;
		this.field5226 = 0.0D;
		this.field5227 = 0.0D;
		this.field5222 = var3;
		this.field5223 = var6;
		if ((var5 - var8) * (var7 - var1) == (var4 - var7) * (var8 - var2)) {
			this.field5221 = (double)var4;
			this.field5224 = (double)var5;
		} else {
			double var11 = (double)((float)(var7 + var1)) / 2.0D;
			double var13 = (double)((float)(var8 + var2)) / 2.0D;
			double var15 = (double)((float)(var4 + var7)) / 2.0D;
			double var17 = (double)((float)(var5 + var8)) / 2.0D;
			double var19 = -1.0D * (double)(var7 - var1) / (double)(var8 - var2);
			double var21 = -1.0D * (double)(var4 - var7) / (double)(var5 - var8);
			this.field5221 = (var17 + (var11 * var19 - var15 * var21) - var13) / (var19 - var21);
			this.field5224 = var19 * (this.field5221 - var11) + var13;
			this.field5225 = Math.sqrt(Math.pow(this.field5221 - (double)var1, 2.0D) + Math.pow(this.field5224 - (double)var2, 2.0D));
			this.field5226 = Math.atan2((double)var2 - this.field5224, (double)var1 - this.field5221);
			double var23 = Math.atan2((double)var8 - this.field5224, (double)var7 - this.field5221);
			this.field5227 = Math.atan2((double)var5 - this.field5224, (double)var4 - this.field5221);
			boolean var25 = this.field5226 <= var23 && var23 <= this.field5227 || this.field5227 <= var23 && var23 <= this.field5226;
			if (!var25) {
				this.field5227 += (double)(this.field5226 - this.field5227 > 0.0D ? 2 : -2) * 3.141592653589793D;
			}

		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "32"
	)
	public int vmethod9494() {
		double var1 = this.method9502();
		double var3 = this.field5226 + var1 * (this.field5227 - this.field5226);
		return (int)Math.round(this.field5221 + this.field5225 * Math.cos(var3));
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "10274157"
	)
	public int vmethod9492() {
		double var1 = this.method9502();
		double var3 = var1 * (this.field5227 - this.field5226) + this.field5226;
		return (int)Math.round(this.field5224 + this.field5225 * Math.sin(var3));
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-800032356"
	)
	public int vmethod9493() {
		double var1 = this.method9502();
		return (int)Math.round(var1 * (double)(this.field5223 - this.field5222) + (double)this.field5222);
	}
}
