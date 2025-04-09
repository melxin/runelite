import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("bf")
@Implements("VorbisMapping")
public class VorbisMapping {
	@ObfuscatedName("ao")
	int field338;
	@ObfuscatedName("an")
	int field336;
	@ObfuscatedName("ae")
	int[] field337;
	@ObfuscatedName("af")
	int[] field335;

	VorbisMapping() {
		class60 var1 = VorbisSample.field365;
		var1.method1173(16);
		this.field338 = var1.method1176() != 0 ? var1.method1173(4) + 1 : 1;
		if (var1.method1176() != 0) {
			var1.method1173(8);
		}

		var1.method1173(2);
		if (this.field338 > 1) {
			this.field336 = var1.method1173(4);
		}

		this.field337 = new int[this.field338];
		this.field335 = new int[this.field338];

		for (int var2 = 0; var2 < this.field338; ++var2) {
			var1.method1173(8);
			this.field337[var2] = var1.method1173(8);
			this.field335[var2] = var1.method1173(8);
		}

	}
}
