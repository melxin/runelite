import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ji")
@Implements("BoundaryObject")
public final class BoundaryObject {
	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	@Export("archive8")
	static Archive archive8;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		longValue = 3402815881984803951L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1650497165
	)
	@Export("z")
	int z;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 495595975
	)
	@Export("x")
	int x;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1023439509
	)
	@Export("y")
	int y;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1746131451
	)
	@Export("orientationA")
	int orientationA;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1953156409
	)
	@Export("orientationB")
	int orientationB;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -432336851
	)
	@Export("flags")
	int flags;

	BoundaryObject() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-2084962977"
	)
	public static int method5835(int var0, int var1, int var2) {
		int var3 = class172.method4149(var2 - var1 + 1);
		var3 <<= var1;
		return var0 & ~var3;
	}
}
