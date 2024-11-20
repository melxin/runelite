import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("bs")
@Implements("VorbisMapping")
public class VorbisMapping {
	@ObfuscatedName("ab")
	int field345;
	@ObfuscatedName("aw")
	int field346;
	@ObfuscatedName("at")
	int[] field347;
	@ObfuscatedName("ae")
	int[] field348;

	VorbisMapping() {
		class60 var1 = VorbisSample.field370;
		var1.method1152(16);
		this.field345 = var1.method1153() != 0 ? var1.method1152(4) + 1 : 1;
		if (var1.method1153() != 0) {
			var1.method1152(8);
		}

		var1.method1152(2);
		if (this.field345 > 1) {
			this.field346 = var1.method1152(4);
		}

		this.field347 = new int[this.field345];
		this.field348 = new int[this.field345];

		for (int var2 = 0; var2 < this.field345; ++var2) {
			var1.method1152(8);
			this.field347[var2] = var1.method1152(8);
			this.field348[var2] = var1.method1152(8);
		}

	}
}
