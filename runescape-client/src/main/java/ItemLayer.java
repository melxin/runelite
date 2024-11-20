import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iu")
@Implements("ItemLayer")
public final class ItemLayer {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 897215101
	)
	@Export("z")
	int z;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 2117928659
	)
	@Export("x")
	int x;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1163562385
	)
	@Export("y")
	int y;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	@Export("first")
	Renderable first;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	@Export("second")
	Renderable second;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	@Export("third")
	Renderable third;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = -1379009837610365539L
	)
	@Export("tag")
	long tag;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -560526403
	)
	@Export("height")
	int height;

	ItemLayer() {
	}
}
