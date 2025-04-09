import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ma")
public class class320 {
	@ObfuscatedName("oy")
	@Export("sessionId")
	static String sessionId;
	@ObfuscatedName("ss")
	@ObfuscatedGetter(
		intValue = 1948641161
	)
	static int field3376;

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1559257247"
	)
	public static void method6537() {
		WorldMapRegion.WorldMapRegion_cachedSprites.demote(5);
	}
}
