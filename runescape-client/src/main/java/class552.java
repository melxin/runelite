import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vs")
public abstract class class552 {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 918726995
	)
	int field5663;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1162791403
	)
	int field5666;
	@ObfuscatedName("ai")
	double field5665;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1386092375
	)
	int field5664;

	class552(int var1, int var2) {
		this.field5663 = 0;
		this.field5666 = 0;
		this.field5665 = 0.0D;
		this.field5664 = 0;
		this.field5663 = var1;
		this.field5666 = 0;
		this.field5664 = var2 >= 0 && var2 <= 27 ? var2 : 0;
		int var4 = this.field5666;
		int var5 = this.field5663;
		int var7 = this.field5664;
		class337 var6 = class337.field3860[var7];
		this.field5665 = class264.method5958((long)var4, (long)var5, var6);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "81920"
	)
	public void method10620() {
		if (this.field5666 < this.field5663) {
			++this.field5666;
			int var1 = this.field5666;
			int var2 = this.field5663;
			int var4 = this.field5664;
			class337 var3 = class337.field3860[var4];
			this.field5665 = class264.method5958((long)var1, (long)var2, var3);
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)D",
		garbageValue = "-1993415137"
	)
	double method10618() {
		return this.field5665;
	}
}
