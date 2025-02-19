import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("bm")
@Implements("VorbisMapping")
public class VorbisMapping {
	@ObfuscatedName("ab")
	int field347;
	@ObfuscatedName("ay")
	int field346;
	@ObfuscatedName("au")
	int[] field348;
	@ObfuscatedName("ad")
	int[] field349;

	VorbisMapping() {
		class60 var1 = VorbisSample.field382;
		var1.method1141(16);
		this.field347 = var1.method1150() != 0 ? var1.method1141(4) + 1 : 1;
		if (var1.method1150() != 0) {
			var1.method1141(8);
		}

		var1.method1141(2);
		if (this.field347 > 1) {
			this.field346 = var1.method1141(4);
		}

		this.field348 = new int[this.field347];
		this.field349 = new int[this.field347];

		for (int var2 = 0; var2 < this.field347; ++var2) {
			var1.method1141(8);
			this.field348[var2] = var1.method1141(8);
			this.field349[var2] = var1.method1141(8);
		}

	}
}
