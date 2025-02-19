import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ud")
public class class533 extends class535 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -67212603
	)
	int field5353;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -237587181
	)
	int field5351;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1057644185
	)
	int field5352;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -520838269
	)
	int field5350;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -3530899
	)
	int field5354;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1842126563
	)
	int field5355;

	public class533(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		super(var7, var8);
		this.field5353 = 0;
		this.field5351 = 0;
		this.field5352 = 0;
		this.field5350 = 0;
		this.field5354 = 0;
		this.field5355 = 0;
		this.field5353 = var1;
		this.field5351 = var2;
		this.field5352 = var3;
		this.field5350 = var4;
		this.field5354 = var5;
		this.field5355 = var6;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1312763798"
	)
	public int vmethod9685() {
		double var1 = this.method9695();
		return (int)Math.round(var1 * (double)(this.field5350 - this.field5353) + (double)this.field5353);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1028002245"
	)
	public int vmethod9686() {
		double var1 = this.method9695();
		return (int)Math.round((double)this.field5351 + var1 * (double)(this.field5354 - this.field5351));
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-51009761"
	)
	public int vmethod9689() {
		double var1 = this.method9695();
		return (int)Math.round((double)this.field5352 + var1 * (double)(this.field5355 - this.field5352));
	}
}
