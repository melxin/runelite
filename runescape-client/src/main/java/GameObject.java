import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kf")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("ue")
	@ObfuscatedGetter(
		intValue = 1582101935
	)
	static int field3039;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1069550861
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1035188933
	)
	@Export("z")
	int z;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1541407521
	)
	@Export("centerX")
	int centerX;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1502940487
	)
	@Export("centerY")
	int centerY;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ljc;"
	)
	@Export("renderable")
	public TileItem renderable;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 122481251
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1589797273
	)
	@Export("startX")
	int startX;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1708569031
	)
	@Export("endX")
	int endX;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 297553709
	)
	@Export("startY")
	int startY;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -872023981
	)
	@Export("endY")
	int endY;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 622585957
	)
	int field3035;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1161558859
	)
	@Export("lastDrawn")
	int lastDrawn;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		longValue = -443731850467096489L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 57354603
	)
	@Export("flags")
	int flags;

	GameObject() {
		this.tag = 0L;
		this.flags = 0;
	}
}
