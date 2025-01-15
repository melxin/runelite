import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rn")
public class class457 {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)[Lvf;",
		garbageValue = "-81"
	)
	static SpritePixels[] method8965() {
		SpritePixels[] var0 = new SpritePixels[SpriteBufferProperties.SpriteBuffer_spriteCount];

		for (int var1 = 0; var1 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var1) {
			SpritePixels var2 = var0[var1] = new SpritePixels();
			var2.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
			var2.height = class174.SpriteBuffer_spriteHeight;
			var2.xOffset = class241.SpriteBuffer_xOffsets[var1];
			var2.yOffset = SpriteBufferProperties.SpriteBuffer_yOffsets[var1];
			var2.subWidth = SpriteBufferProperties.SpriteBuffer_spriteWidths[var1];
			var2.subHeight = class403.SpriteBuffer_spriteHeights[var1];
			int var3 = var2.subHeight * var2.subWidth;
			byte[] var4 = class240.SpriteBuffer_pixels[var1];
			var2.pixels = new int[var3];

			for (int var5 = 0; var5 < var3; ++var5) {
				var2.pixels[var5] = KeyHandler.SpriteBuffer_spritePalette[var4[var5] & 255];
			}
		}

		class241.SpriteBuffer_xOffsets = null;
		SpriteBufferProperties.SpriteBuffer_yOffsets = null;
		SpriteBufferProperties.SpriteBuffer_spriteWidths = null;
		class403.SpriteBuffer_spriteHeights = null;
		KeyHandler.SpriteBuffer_spritePalette = null;
		class240.SpriteBuffer_pixels = null;
		return var0;
	}
}
