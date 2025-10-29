import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jv")
@Implements("FloorDecoration")
public final class FloorDecoration {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = -8859526887717711125L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -495673633
	)
	@Export("z")
	int z;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1266171817
	)
	@Export("x")
	int x;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -190028295
	)
	@Export("y")
	int y;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 633706255
	)
	@Export("flags")
	int flags;

	FloorDecoration() {
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-75"
	)
	static boolean method5346(int var0) {
		return (var0 & 128) != 0;
	}
}
