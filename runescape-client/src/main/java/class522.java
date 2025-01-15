import java.lang.management.GarbageCollectorMXBean;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("um")
public abstract class class522 {
	@ObfuscatedName("bj")
	@Export("garbageCollector")
	static GarbageCollectorMXBean garbageCollector;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 825095503
	)
	int field5238;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1832451349
	)
	int field5235;
	@ObfuscatedName("ac")
	double field5236;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1395383813
	)
	int field5237;

	class522(int var1, int var2) {
		this.field5238 = 0;
		this.field5235 = 0;
		this.field5236 = 0.0D;
		this.field5237 = 0;
		this.field5238 = var1;
		this.field5235 = 0;
		this.field5237 = var2 >= 0 && var2 <= 27 ? var2 : 0;
		this.field5236 = class344.method6945(this.field5235, this.field5238, this.field5237);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-752325579"
	)
	public void method9700() {
		if (this.field5235 < this.field5238) {
			++this.field5235;
			this.field5236 = class344.method6945(this.field5235, this.field5238, this.field5237);
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)D",
		garbageValue = "2145106480"
	)
	double method9695() {
		return this.field5236;
	}
}
