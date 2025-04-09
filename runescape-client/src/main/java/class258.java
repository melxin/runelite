import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jg")
public class class258 extends DualNode {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("field1909")
	public static EvictingDualNodeHashTable field1909;
	@ObfuscatedName("mb")
	@ObfuscatedGetter(
		intValue = -376874865
	)
	@Export("cameraPitch")
	static int cameraPitch;

	static {
		field1909 = new EvictingDualNodeHashTable(64);
	}
}
