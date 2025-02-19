import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("wt")
@Implements("SpriteBufferProperties")
public class SpriteBufferProperties {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 841798349
	)
	@Export("SpriteBuffer_spriteWidth")
	public static int SpriteBuffer_spriteWidth;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1306602989
	)
	@Export("SpriteBuffer_spriteHeight")
	public static int SpriteBuffer_spriteHeight;
	@ObfuscatedName("ac")
	@Export("SpriteBuffer_spriteWidths")
	public static int[] SpriteBuffer_spriteWidths;
	@ObfuscatedName("aa")
	@Export("SpriteBuffer_pixels")
	public static byte[][] SpriteBuffer_pixels;
}
