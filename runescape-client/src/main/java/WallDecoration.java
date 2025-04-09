import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hk")
@Implements("WallDecoration")
public final class WallDecoration {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lhy;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 421308915
	)
	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lhy;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		longValue = -7693401070401507971L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -521904581
	)
	@Export("z")
	int z;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1334261507
	)
	@Export("x")
	int x;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1621713413
	)
	@Export("y")
	int y;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1609738827
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -253442527
	)
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -988426473
	)
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1053939873
	)
	@Export("flags")
	int flags;

	WallDecoration() {
		this.tag = 0L;
		this.flags = 0;
	}
}
