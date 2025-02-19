import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kk")
@Implements("WallDecoration")
public final class WallDecoration {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 770080297
	)
	@Export("z")
	int z;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 156211677
	)
	@Export("x")
	int x;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 785488267
	)
	@Export("y")
	int y;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 294845149
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 43035115
	)
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 124933739
	)
	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -699489247
	)
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ljc;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Ljc;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		longValue = -657155813371911417L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -159563765
	)
	@Export("flags")
	int flags;

	WallDecoration() {
		this.tag = 0L;
		this.flags = 0;
	}
}
