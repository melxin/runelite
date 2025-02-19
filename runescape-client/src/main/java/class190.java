import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hc")
public class class190 extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("field2026")
	public static EvictingDualNodeHashTable field2026;
	@ObfuscatedName("uv")
	@ObfuscatedGetter(
		intValue = 122762981
	)
	static int field2016;

	static {
		field2026 = new EvictingDualNodeHashTable(64);
	}
}
