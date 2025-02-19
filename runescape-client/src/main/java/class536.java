import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("un")
public abstract class class536 {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -831674851
	)
	int field5363;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 821067835
	)
	int field5361;
	@ObfuscatedName("as")
	double field5359;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -35843443
	)
	int field5362;

	class536(int var1, int var2) {
		this.field5363 = 0;
		this.field5361 = 0;
		this.field5359 = 0.0D;
		this.field5362 = 0;
		this.field5363 = var1;
		this.field5361 = 0;
		this.field5362 = var2 >= 0 && var2 <= 27 ? var2 : 0;
		this.field5359 = Messages.method3077(this.field5361, this.field5363, this.field5362);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1208813313"
	)
	public void method9698() {
		if (this.field5361 < this.field5363) {
			++this.field5361;
			this.field5359 = Messages.method3077(this.field5361, this.field5363, this.field5362);
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)D",
		garbageValue = "30"
	)
	double method9695() {
		return this.field5359;
	}
}
