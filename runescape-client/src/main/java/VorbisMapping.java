import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("br")
@Implements("VorbisMapping")
public class VorbisMapping {
	@ObfuscatedName("ay")
	int field330;
	@ObfuscatedName("ah")
	int field328;
	@ObfuscatedName("az")
	int[] field329;
	@ObfuscatedName("ao")
	int[] field327;

	VorbisMapping() {
		class60 var1 = VorbisSample.field347;
		var1.method1205(16);
		this.field330 = var1.method1207() != 0 ? var1.method1205(4) + 1 : 1;
		if (var1.method1207() != 0) {
			var1.method1205(8);
		}

		var1.method1205(2);
		if (this.field330 > 1) {
			this.field328 = var1.method1205(4);
		}

		this.field329 = new int[this.field330];
		this.field327 = new int[this.field330];

		for (int var2 = 0; var2 < this.field330; ++var2) {
			var1.method1205(8);
			this.field329[var2] = var1.method1205(8);
			this.field327[var2] = var1.method1205(8);
		}

	}
}
