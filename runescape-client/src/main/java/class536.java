import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("up")
public abstract class class536 {
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 918089373
	)
	int field5384;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 178604217
	)
	int field5381;
	@ObfuscatedName("ax")
	double field5382;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -984309221
	)
	int field5383;

	class536(int var1, int var2) {
		this.field5384 = 0;
		this.field5381 = 0;
		this.field5382 = 0.0D;
		this.field5383 = 0;
		this.field5384 = var1;
		this.field5381 = 0;
		this.field5383 = var2 >= 0 && var2 <= 27 ? var2 : 0;
		this.field5382 = ClanSettings.method3561(this.field5381, this.field5384, this.field5383);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1222605009"
	)
	public void method9771() {
		if (this.field5381 < this.field5384) {
			++this.field5381;
			this.field5382 = ClanSettings.method3561(this.field5381, this.field5384, this.field5383);
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)D",
		garbageValue = "1188171036"
	)
	double method9776() {
		return this.field5382;
	}
}
