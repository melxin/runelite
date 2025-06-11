import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("js")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 976959185
	)
	@Export("x")
	int x;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 711583669
	)
	@Export("y")
	int y;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1011973457
	)
	@Export("z")
	int z;

	FaceNormal() {
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Liv;",
		garbageValue = "2008380976"
	)
	public static Clock method5455() {
		try {
			return new NanoClock();
		} catch (Throwable var1) {
			return new MilliClock();
		}
	}
}
