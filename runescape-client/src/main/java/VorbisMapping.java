import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ec")
@Implements("VorbisMapping")
public class VorbisMapping {
	@ObfuscatedName("av")
	int field1389;
	@ObfuscatedName("at")
	int field1390;
	@ObfuscatedName("ag")
	int[] field1388;
	@ObfuscatedName("an")
	int[] field1391;

	@ObfuscatedSignature(
		descriptor = "(Lem;)V"
	)
	VorbisMapping(class114 var1) {
		var1.method3588(16);
		this.field1389 = var1.method3586() != 0 ? var1.method3588(4) + 1 : 1;
		if (var1.method3586() != 0) {
			var1.method3588(8);
		}

		var1.method3588(2);
		if (this.field1389 > 1) {
			this.field1390 = var1.method3588(4);
		}

		this.field1388 = new int[this.field1389];
		this.field1391 = new int[this.field1389];

		for (int var2 = 0; var2 < this.field1389; ++var2) {
			var1.method3588(8);
			this.field1388[var2] = var1.method3588(8);
			this.field1391[var2] = var1.method3588(8);
		}

	}
}
