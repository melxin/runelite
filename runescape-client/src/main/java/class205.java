import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ht")
public class class205 extends DualNode {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("field1909")
	public static EvictingDualNodeHashTable field1909;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "Lxa;"
	)
	@Export("logoSprite")
	static IndexedSprite logoSprite;

	static {
		field1909 = new EvictingDualNodeHashTable(64);
	}
}
