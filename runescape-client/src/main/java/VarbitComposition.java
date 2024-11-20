import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hu")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("VarbitDefinition_archive")
	public static AbstractArchive VarbitDefinition_archive;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("VarbitDefinition_cached")
	static EvictingDualNodeHashTable VarbitDefinition_cached;
	@ObfuscatedName("ac")
	static final int[] field2105;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 2146013601
	)
	@Export("baseVar")
	public int baseVar;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1009309479
	)
	@Export("startBit")
	public int startBit;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1715015457
	)
	@Export("endBit")
	public int endBit;

	static {
		VarbitDefinition_cached = new EvictingDualNodeHashTable(64);
		field2105 = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			field2105[var1] = var0 - 1;
			var0 += var0;
		}

	}

	VarbitComposition() {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lvj;B)V",
		garbageValue = "-90"
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lvj;II)V",
		garbageValue = "-363401419"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.baseVar = var1.readUnsignedShort();
			this.startBit = var1.readUnsignedByte();
			this.endBit = var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-45"
	)
	protected static final int method4029() {
		return GameEngine.keyHandler.method336();
	}
}
