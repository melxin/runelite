import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jf")
@Implements("BoundaryObject")
public final class BoundaryObject {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = 9027675054958033925L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1390673375
	)
	@Export("z")
	int z;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1222861919
	)
	@Export("x")
	int x;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -658078459
	)
	@Export("y")
	int y;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 900647447
	)
	@Export("orientationA")
	int orientationA;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1447138463
	)
	@Export("orientationB")
	int orientationB;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1282124153
	)
	@Export("flags")
	int flags;

	BoundaryObject() {
		this.tag = 0L;
		this.flags = 0;
	}
}
