import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jn")
public class class235 extends DualNode {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("field1864")
	static EvictingDualNodeHashTable field1864;

	static {
		field1864 = new EvictingDualNodeHashTable(64);
	}
}
