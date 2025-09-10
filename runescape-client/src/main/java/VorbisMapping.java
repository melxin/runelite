import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ez")
@Implements("VorbisMapping")
public class VorbisMapping {
	@ObfuscatedName("af")
	int field1417;
	@ObfuscatedName("aw")
	int field1415;
	@ObfuscatedName("at")
	int[] field1416;
	@ObfuscatedName("ac")
	int[] field1414;

	@ObfuscatedSignature(
		descriptor = "(Led;)V"
	)
	VorbisMapping(class115 var1) {
		var1.method3467(16);
		this.field1417 = var1.method3465() != 0 ? var1.method3467(4) + 1 : 1;
		if (var1.method3465() != 0) {
			var1.method3467(8);
		}

		var1.method3467(2);
		if (this.field1417 > 1) {
			this.field1415 = var1.method3467(4);
		}

		this.field1416 = new int[this.field1417];
		this.field1414 = new int[this.field1417];

		for (int var2 = 0; var2 < this.field1417; ++var2) {
			var1.method3467(8);
			this.field1416[var2] = var1.method3467(8);
			this.field1414[var2] = var1.method3467(8);
		}

	}
}
