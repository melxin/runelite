import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
@Implements("ItemLayer")
public final class ItemLayer {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -352679989
	)
	@Export("z")
	int z;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 373348255
	)
	@Export("x")
	int x;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 472754515
	)
	@Export("y")
	int y;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	@Export("first")
	Renderable first;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	@Export("second")
	Renderable second;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	@Export("third")
	Renderable third;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		longValue = -7391763247128294713L
	)
	@Export("tag")
	long tag;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1845304357
	)
	@Export("height")
	int height;

	ItemLayer() {
	}
}
