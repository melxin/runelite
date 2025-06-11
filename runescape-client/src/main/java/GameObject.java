import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kg")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("ij")
	@ObfuscatedGetter(
		intValue = 1573431341
	)
	@Export("foundItemIndex")
	static int foundItemIndex;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ljr;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1227629273
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		longValue = -2880859857278335301L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1568296557
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -2072549767
	)
	@Export("z")
	int z;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1459476017
	)
	@Export("centerX")
	int centerX;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 346610267
	)
	@Export("centerY")
	int centerY;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -392628845
	)
	@Export("startX")
	int startX;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1979677587
	)
	@Export("endX")
	int endX;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1499680739
	)
	@Export("startY")
	int startY;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 315127403
	)
	@Export("endY")
	int endY;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -863775835
	)
	int field3038;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 137646659
	)
	@Export("lastDrawn")
	int lastDrawn;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1457901723
	)
	@Export("flags")
	int flags;

	GameObject() {
		this.tag = 0L;
		this.flags = 0;
	}
}
