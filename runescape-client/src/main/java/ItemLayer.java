import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ib")
@Implements("ItemLayer")
public final class ItemLayer {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1675178913
	)
	@Export("z")
	int z;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -310439053
	)
	@Export("x")
	int x;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -418956347
	)
	@Export("y")
	int y;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("first")
	Renderable first;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("second")
	Renderable second;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("third")
	Renderable third;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		longValue = 6168778998003613095L
	)
	@Export("tag")
	long tag;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 138009977
	)
	@Export("height")
	int height;

	ItemLayer() {
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "59824424"
	)
	static int method4778() {
		return ++Messages.Messages_count - 1;
	}
}
