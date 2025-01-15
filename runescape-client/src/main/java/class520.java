import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uh")
public class class520 extends class522 {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -664920125
	)
	int field5232;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -144132369
	)
	int field5231;

	public class520(int var1, int var2, int var3, int var4) {
		super(var3, var4);
		this.field5232 = 0;
		this.field5231 = 0;
		this.field5232 = var1;
		this.field5231 = var2;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1957368633"
	)
	public int method9684() {
		double var1 = this.method9695();
		return (int)Math.round((double)this.field5232 + var1 * (double)(this.field5231 - this.field5232));
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)D",
		garbageValue = "0"
	)
	public static double method9685(int var0) {
		int var1 = class507.field5153[var0 & 2047];
		return (double)var1 / 65536.0D;
	}
}
