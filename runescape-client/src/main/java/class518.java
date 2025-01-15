import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ti")
public class class518 extends class521 {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 787504179
	)
	int field5223;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -693478239
	)
	int field5221;
	@ObfuscatedName("az")
	double field5219;
	@ObfuscatedName("ao")
	double field5218;
	@ObfuscatedName("ad")
	double field5222;
	@ObfuscatedName("an")
	double field5220;
	@ObfuscatedName("ae")
	double field5224;

	public class518(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		super(var9, var10);
		this.field5223 = 0;
		this.field5221 = 0;
		this.field5219 = 0.0D;
		this.field5218 = 0.0D;
		this.field5222 = 0.0D;
		this.field5220 = 0.0D;
		this.field5224 = 0.0D;
		this.field5223 = var3;
		this.field5221 = var6;
		if ((var5 - var8) * (var7 - var1) == (var4 - var7) * (var8 - var2)) {
			this.field5219 = (double)var4;
			this.field5218 = (double)var5;
		} else {
			double var11 = (double)((float)(var7 + var1)) / 2.0D;
			double var13 = (double)((float)(var8 + var2)) / 2.0D;
			double var15 = (double)((float)(var4 + var7)) / 2.0D;
			double var17 = (double)((float)(var5 + var8)) / 2.0D;
			double var19 = (double)(var7 - var1) * -1.0D / (double)(var8 - var2);
			double var21 = (double)(var4 - var7) * -1.0D / (double)(var5 - var8);
			this.field5219 = (var17 + (var11 * var19 - var21 * var15) - var13) / (var19 - var21);
			this.field5218 = var13 + var19 * (this.field5219 - var11);
			this.field5222 = Math.sqrt(Math.pow(this.field5219 - (double)var1, 2.0D) + Math.pow(this.field5218 - (double)var2, 2.0D));
			this.field5220 = Math.atan2((double)var2 - this.field5218, (double)var1 - this.field5219);
			double var23 = Math.atan2((double)var8 - this.field5218, (double)var7 - this.field5219);
			this.field5224 = Math.atan2((double)var5 - this.field5218, (double)var4 - this.field5219);
			boolean var25 = this.field5220 <= var23 && var23 <= this.field5224 || this.field5224 <= var23 && var23 <= this.field5220;
			if (!var25) {
				this.field5224 += 3.141592653589793D * (double)(this.field5220 - this.field5224 > 0.0D ? 2 : -2);
			}

		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "634007463"
	)
	public int vmethod9687() {
		double var1 = this.method9695();
		double var3 = (this.field5224 - this.field5220) * var1 + this.field5220;
		return (int)Math.round(this.field5219 + this.field5222 * Math.cos(var3));
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1800401881"
	)
	public int vmethod9688() {
		double var1 = this.method9695();
		double var3 = this.field5220 + var1 * (this.field5224 - this.field5220);
		return (int)Math.round(this.field5218 + this.field5222 * Math.sin(var3));
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "7"
	)
	public int vmethod9689() {
		double var1 = this.method9695();
		return (int)Math.round(var1 * (double)(this.field5221 - this.field5223) + (double)this.field5223);
	}
}
