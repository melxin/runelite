import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ji")
public class class248 extends DualNode {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("field2100")
	public static EvictingDualNodeHashTable field2100;
	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	@Export("clientLanguage")
	static Language clientLanguage;

	static {
		field2100 = new EvictingDualNodeHashTable(64);
	}
}
