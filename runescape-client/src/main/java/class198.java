import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hn")
public class class198 extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("field2022")
	static EvictingDualNodeHashTable field2022;
	@ObfuscatedName("pw")
	@ObfuscatedSignature(
		descriptor = "[Lxl;"
	)
	@Export("crossSprites")
	static SpritePixels[] crossSprites;

	static {
		field2022 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1131026898"
	)
	static void method4466(int var0, int var1, int var2, int var3, int var4, int var5) {
		GrandExchangeOfferNameComparator.method8545(class32.worldView, var0, var1, var2, var3, var4, var5);
	}
}
