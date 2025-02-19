import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hj")
public class class201 extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("field2136")
	static EvictingDualNodeHashTable field2136;
	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "[Lwg;"
	)
	@Export("crossSprites")
	static SpritePixels[] crossSprites;

	static {
		field2136 = new EvictingDualNodeHashTable(64);
	}
}
