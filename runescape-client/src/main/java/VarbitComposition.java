import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("he")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
	@ObfuscatedName("af")
	static final int[] field2261;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("VarbitDefinition_archive")
	static AbstractArchive VarbitDefinition_archive;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("VarbitDefinition_cached")
	public static EvictingDualNodeHashTable VarbitDefinition_cached;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 391048105
	)
	@Export("baseVar")
	public int baseVar;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1000785497
	)
	@Export("startBit")
	public int startBit;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -850328077
	)
	@Export("endBit")
	public int endBit;

	static {
		field2261 = new int[32];
		VarbitDefinition_cached = new EvictingDualNodeHashTable(64);
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			field2261[var1] = var0 - 1;
			var0 += var0;
		}

	}

	VarbitComposition() {
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lwb;I)V",
		garbageValue = "1264643719"
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lwb;IB)V",
		garbageValue = "18"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.baseVar = var1.readUnsignedShort();
			this.startBit = var1.readUnsignedByte();
			this.endBit = var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "856085244"
	)
	static final void method4512(String var0) {
		Varcs.addGameMessage(30, "", var0);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2112596582"
	)
	public static int method4513(int var0) {
		long var2 = ViewportMouse.ViewportMouse_entityTags[var0];
		int var1 = (int)(var2 >>> 0 & 127L);
		return var1;
	}
}
