import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ud")
public abstract class class522 {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1868245591
	)
	int field5238;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1611138843
	)
	int field5237;
	@ObfuscatedName("an")
	double field5239;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1912537713
	)
	int field5240;

	class522(int var1, int var2) {
		this.field5238 = 0;
		this.field5237 = 0;
		this.field5239 = 0.0D;
		this.field5240 = 0;
		this.field5238 = var1;
		this.field5237 = 0;
		this.field5240 = var2 >= 0 && var2 <= 27 ? var2 : 0;
		this.field5239 = ApproximateRouteStrategy.method1203(this.field5237, this.field5238, this.field5240);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-113"
	)
	public void method9503() {
		if (this.field5237 < this.field5238) {
			++this.field5237;
			this.field5239 = ApproximateRouteStrategy.method1203(this.field5237, this.field5238, this.field5240);
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)D",
		garbageValue = "45140215"
	)
	double method9502() {
		return this.field5239;
	}
}
