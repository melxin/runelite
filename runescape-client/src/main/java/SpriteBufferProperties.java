import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("vc")
@Implements("SpriteBufferProperties")
public class SpriteBufferProperties {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1406881477
	)
	@Export("SpriteBuffer_spriteCount")
	static int SpriteBuffer_spriteCount;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 632319681
	)
	@Export("SpriteBuffer_spriteWidth")
	public static int SpriteBuffer_spriteWidth;
	@ObfuscatedName("ad")
	@Export("SpriteBuffer_yOffsets")
	public static int[] SpriteBuffer_yOffsets;
	@ObfuscatedName("an")
	@Export("SpriteBuffer_spriteWidths")
	public static int[] SpriteBuffer_spriteWidths;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -960221315
	)
	static int field5585;
}
