import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ef")
@Implements("VorbisMapping")
public class VorbisMapping {
	@ObfuscatedName("al")
	int field1393;
	@ObfuscatedName("ab")
	int field1392;
	@ObfuscatedName("ac")
	int[] field1391;
	@ObfuscatedName("av")
	int[] field1394;

	@ObfuscatedSignature(
		descriptor = "(Leh;)V"
	)
	VorbisMapping(class114 var1) {
		var1.method3409(16);
		this.field1393 = var1.method3408() != 0 ? var1.method3409(4) + 1 : 1;
		if (var1.method3408() != 0) {
			var1.method3409(8);
		}

		var1.method3409(2);
		if (this.field1393 > 1) {
			this.field1392 = var1.method3409(4);
		}

		this.field1391 = new int[this.field1393];
		this.field1394 = new int[this.field1393];

		for (int var2 = 0; var2 < this.field1393; ++var2) {
			var1.method3409(8);
			this.field1391[var2] = var1.method3409(8);
			this.field1394[var2] = var1.method3409(8);
		}

	}
}
