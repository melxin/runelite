import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
@Implements("BoundaryObject")
public final class BoundaryObject {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1837012129
	)
	@Export("z")
	int z;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1884426115
	)
	@Export("x")
	int x;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 506114547
	)
	@Export("y")
	int y;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1738243283
	)
	@Export("orientationA")
	int orientationA;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1084924095
	)
	@Export("orientationB")
	int orientationB;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		longValue = -4333333370256334569L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1069251799
	)
	@Export("flags")
	int flags;

	BoundaryObject() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-57"
	)
	public static int method4809(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
		var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459);
		var0 = var0 + (var0 >>> 4) & 252645135;
		var0 += var0 >>> 8;
		var0 += var0 >>> 16;
		return var0 & 255;
	}
}
