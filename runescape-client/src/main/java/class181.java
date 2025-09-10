import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gg")
public class class181 extends DualNode {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("field1851")
	public static EvictingDualNodeHashTable field1851;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("FloorOverlayDefinition_archive")
	static AbstractArchive FloorOverlayDefinition_archive;
	@ObfuscatedName("pn")
	@ObfuscatedSignature(
		descriptor = "Lxt;"
	)
	@Export("redHintArrowSprite")
	static SpritePixels redHintArrowSprite;

	static {
		field1851 = new EvictingDualNodeHashTable(64);
	}
}
