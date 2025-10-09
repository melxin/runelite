import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("es")
@Implements("VorbisMapping")
public class VorbisMapping {
	@ObfuscatedName("ab")
	int field1415;
	@ObfuscatedName("at")
	int field1414;
	@ObfuscatedName("ag")
	int[] field1416;
	@ObfuscatedName("aj")
	int[] field1417;

	@ObfuscatedSignature(
		descriptor = "(Lef;)V"
	)
	VorbisMapping(class114 var1) {
		var1.method3529(16);
		this.field1415 = var1.method3531() != 0 ? var1.method3529(4) + 1 : 1;
		if (var1.method3531() != 0) {
			var1.method3529(8);
		}

		var1.method3529(2);
		if (this.field1415 > 1) {
			this.field1414 = var1.method3529(4);
		}

		this.field1416 = new int[this.field1415];
		this.field1417 = new int[this.field1415];

		for (int var2 = 0; var2 < this.field1415; ++var2) {
			var1.method3529(8);
			this.field1416[var2] = var1.method3529(8);
			this.field1417[var2] = var1.method3529(8);
		}

	}
}
