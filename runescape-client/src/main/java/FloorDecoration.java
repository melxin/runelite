import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("in")
@Implements("FloorDecoration")
public final class FloorDecoration {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 238066481
	)
	public static int field2576;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = -1653388810263335849L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1894200033
	)
	@Export("z")
	int z;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1575855251
	)
	@Export("x")
	int x;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1647343275
	)
	@Export("y")
	int y;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 23098573
	)
	@Export("flags")
	int flags;

	FloorDecoration() {
	}
}
