import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iy")
@Implements("ItemLayer")
public final class ItemLayer {
	@ObfuscatedName("jw")
	@Export("regionMapArchiveIds")
	static int[] regionMapArchiveIds;
	@ObfuscatedName("ut")
	@ObfuscatedGetter(
		intValue = 555553693
	)
	static int field2525;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -683061363
	)
	@Export("z")
	int z;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 681176637
	)
	@Export("x")
	int x;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1830527111
	)
	@Export("y")
	int y;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Ljc;"
	)
	@Export("first")
	TileItem first;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ljc;"
	)
	@Export("second")
	TileItem second;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ljc;"
	)
	@Export("third")
	TileItem third;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		longValue = 1723065648273843879L
	)
	@Export("tag")
	long tag;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1887534507
	)
	@Export("height")
	int height;

	ItemLayer() {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "923388292"
	)
	@Export("Widget_unpackTargetMask")
	public static int Widget_unpackTargetMask(int var0) {
		return var0 >> 11 & 63;
	}
}
