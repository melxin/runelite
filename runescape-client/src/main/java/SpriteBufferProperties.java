import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("xx")
@Implements("SpriteBufferProperties")
public class SpriteBufferProperties {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 194679809
	)
	@Export("SpriteBuffer_spriteCount")
	public static int SpriteBuffer_spriteCount;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 208987771
	)
	@Export("SpriteBuffer_spriteWidth")
	public static int SpriteBuffer_spriteWidth;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1630794425
	)
	@Export("SpriteBuffer_spriteHeight")
	public static int SpriteBuffer_spriteHeight;
	@ObfuscatedName("av")
	@Export("SpriteBuffer_xOffsets")
	public static int[] SpriteBuffer_xOffsets;
	@ObfuscatedName("am")
	@Export("SpriteBuffer_pixels")
	public static byte[][] SpriteBuffer_pixels;
}
