import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("wa")
@Implements("SpriteBufferProperties")
public class SpriteBufferProperties {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -138984167
	)
	@Export("SpriteBuffer_spriteCount")
	static int SpriteBuffer_spriteCount;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -2021921949
	)
	@Export("SpriteBuffer_spriteWidth")
	static int SpriteBuffer_spriteWidth;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1601557679
	)
	@Export("SpriteBuffer_spriteHeight")
	static int SpriteBuffer_spriteHeight;
	@ObfuscatedName("ai")
	@Export("SpriteBuffer_xOffsets")
	static int[] SpriteBuffer_xOffsets;
	@ObfuscatedName("am")
	@Export("SpriteBuffer_spritePalette")
	static int[] SpriteBuffer_spritePalette;
	@ObfuscatedName("ah")
	@Export("SpriteBuffer_pixels")
	static byte[][] SpriteBuffer_pixels;
}
