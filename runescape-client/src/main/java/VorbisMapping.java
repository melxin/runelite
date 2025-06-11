import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("et")
@Implements("VorbisMapping")
public class VorbisMapping {
	@ObfuscatedName("ap")
	int field1377;
	@ObfuscatedName("aj")
	int field1379;
	@ObfuscatedName("an")
	int[] field1376;
	@ObfuscatedName("ai")
	int[] field1378;

	VorbisMapping() {
		class114 var1 = VorbisSample.field1422;
		var1.method3296(16);
		this.field1377 = var1.method3295() != 0 ? var1.method3296(4) + 1 : 1;
		if (var1.method3295() != 0) {
			var1.method3296(8);
		}

		var1.method3296(2);
		if (this.field1377 > 1) {
			this.field1379 = var1.method3296(4);
		}

		this.field1376 = new int[this.field1377];
		this.field1378 = new int[this.field1377];

		for (int var2 = 0; var2 < this.field1377; ++var2) {
			var1.method3296(8);
			this.field1376[var2] = var1.method3296(8);
			this.field1378[var2] = var1.method3296(8);
		}

	}
}
