import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hc")
public class class191 extends DualNode {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("field2023")
	public static EvictingDualNodeHashTable field2023;
	@ObfuscatedName("ap")
	@Export("SpriteBuffer_yOffsets")
	public static int[] SpriteBuffer_yOffsets;
	@ObfuscatedName("qa")
	@ObfuscatedGetter(
		intValue = -1657964209
	)
	@Export("oculusOrbFocalPointZ")
	static int oculusOrbFocalPointZ;

	static {
		field2023 = new EvictingDualNodeHashTable(64);
	}
}
