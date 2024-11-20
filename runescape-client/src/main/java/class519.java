import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tk")
public class class519 extends class521 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1666443707
	)
	int field5231;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -802615541
	)
	int field5228;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 119084891
	)
	int field5230;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1358754681
	)
	int field5233;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1219576313
	)
	int field5232;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1945318389
	)
	int field5229;

	public class519(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		super(var7, var8);
		this.field5231 = 0;
		this.field5228 = 0;
		this.field5230 = 0;
		this.field5233 = 0;
		this.field5232 = 0;
		this.field5229 = 0;
		this.field5231 = var1;
		this.field5228 = var2;
		this.field5230 = var3;
		this.field5233 = var4;
		this.field5232 = var5;
		this.field5229 = var6;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "32"
	)
	public int vmethod9494() {
		double var1 = this.method9502();
		return (int)Math.round((double)(this.field5233 - this.field5231) * var1 + (double)this.field5231);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "10274157"
	)
	public int vmethod9492() {
		double var1 = this.method9502();
		return (int)Math.round((double)this.field5228 + var1 * (double)(this.field5232 - this.field5228));
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-800032356"
	)
	public int vmethod9493() {
		double var1 = this.method9502();
		return (int)Math.round((double)this.field5230 + (double)(this.field5229 - this.field5230) * var1);
	}
}
