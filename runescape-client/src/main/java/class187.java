import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hv")
public class class187 extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("field2007")
	static EvictingDualNodeHashTable field2007;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1309146655
	)
	static int field1997;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lws;"
	)
	@Export("options_buttons_2Sprite")
	static IndexedSprite options_buttons_2Sprite;
	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "Lrf;"
	)
	@Export("fontPlain12")
	static Font fontPlain12;

	static {
		field2007 = new EvictingDualNodeHashTable(64);
	}
}
