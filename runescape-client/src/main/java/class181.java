import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gy")
public class class181 extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("field1864")
	static EvictingDualNodeHashTable field1864;
	@ObfuscatedName("kl")
	@ObfuscatedGetter(
		intValue = -1532322889
	)
	@Export("cameraX")
	static int cameraX;

	static {
		field1864 = new EvictingDualNodeHashTable(64);
	}
}
