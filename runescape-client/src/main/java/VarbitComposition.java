import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ja")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("VarbitDefinition_cached")
	static EvictingDualNodeHashTable VarbitDefinition_cached;
	@ObfuscatedName("an")
	static final int[] field2734;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -704299373
	)
	@Export("baseVar")
	public int baseVar;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1843645225
	)
	@Export("startBit")
	public int startBit;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1856419001
	)
	@Export("endBit")
	public int endBit;

	static {
		VarbitDefinition_cached = new EvictingDualNodeHashTable(64);
		field2734 = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			field2734[var1] = var0 - 1;
			var0 += var0;
		}

	}

	VarbitComposition() {
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "-456122148"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lvy;II)V",
		garbageValue = "-1149562142"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.baseVar = var1.readUnsignedShort();
			this.startBit = var1.readUnsignedByte();
			this.endBit = var1.readUnsignedByte();
		}

	}
}
