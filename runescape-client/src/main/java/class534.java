import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uj")
public class class534 extends class536 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 838881665
	)
	int field5357;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -2005056559
	)
	int field5356;

	public class534(int var1, int var2, int var3, int var4) {
		super(var3, var4);
		this.field5357 = 0;
		this.field5356 = 0;
		this.field5357 = var1;
		this.field5356 = var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "14"
	)
	public int method9682() {
		double var1 = this.method9695();
		return (int)Math.round(var1 * (double)(this.field5356 - this.field5357) + (double)this.field5357);
	}
}
