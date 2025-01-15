import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tq")
public class class519 extends class521 {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 2124514443
	)
	int field5227;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1132406593
	)
	int field5226;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -997503879
	)
	int field5228;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1709532629
	)
	int field5230;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -2074165069
	)
	int field5225;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1914738025
	)
	int field5229;

	public class519(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		super(var7, var8);
		this.field5227 = 0;
		this.field5226 = 0;
		this.field5228 = 0;
		this.field5230 = 0;
		this.field5225 = 0;
		this.field5229 = 0;
		this.field5227 = var1;
		this.field5226 = var2;
		this.field5228 = var3;
		this.field5230 = var4;
		this.field5225 = var5;
		this.field5229 = var6;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "634007463"
	)
	public int vmethod9687() {
		double var1 = this.method9695();
		return (int)Math.round((double)(this.field5230 - this.field5227) * var1 + (double)this.field5227);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1800401881"
	)
	public int vmethod9688() {
		double var1 = this.method9695();
		return (int)Math.round(var1 * (double)(this.field5225 - this.field5226) + (double)this.field5226);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "7"
	)
	public int vmethod9689() {
		double var1 = this.method9695();
		return (int)Math.round((double)this.field5228 + (double)(this.field5229 - this.field5228) * var1);
	}
}
