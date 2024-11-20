import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vh")
public class class550 {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1074578513
	)
	static final int field5421;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1595715185
	)
	static final int field5419;

	static {
		field5421 = (int)(Math.pow(2.0D, 4.0D) - 1.0D);
		field5419 = (int)(Math.pow(2.0D, 8.0D) - 1.0D);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lpi;IIS)[Lvr;",
		garbageValue = "351"
	)
	public static SpritePixels[] method10027(AbstractArchive var0, int var1, int var2) {
		if (!class326.method6471(var0, var1, var2)) {
			return null;
		} else {
			SpritePixels[] var4 = new SpritePixels[SpriteBufferProperties.SpriteBuffer_spriteCount];

			for (int var5 = 0; var5 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var5) {
				SpritePixels var6 = var4[var5] = new SpritePixels();
				var6.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
				var6.height = SecureRandomFuture.SpriteBuffer_spriteHeight;
				var6.xOffset = SpriteBufferProperties.SpriteBuffer_xOffsets[var5];
				var6.yOffset = HttpResponse.SpriteBuffer_yOffsets[var5];
				var6.subWidth = SpriteBufferProperties.SpriteBuffer_spriteWidths[var5];
				var6.subHeight = WorldMapCacheName.SpriteBuffer_spriteHeights[var5];
				int var7 = var6.subWidth * var6.subHeight;
				byte[] var8 = SpriteBufferProperties.SpriteBuffer_pixels[var5];
				var6.pixels = new int[var7];

				for (int var9 = 0; var9 < var7; ++var9) {
					var6.pixels[var9] = class140.SpriteBuffer_spritePalette[var8[var9] & 255];
				}
			}

			SpriteBufferProperties.SpriteBuffer_xOffsets = null;
			HttpResponse.SpriteBuffer_yOffsets = null;
			SpriteBufferProperties.SpriteBuffer_spriteWidths = null;
			WorldMapCacheName.SpriteBuffer_spriteHeights = null;
			class140.SpriteBuffer_spritePalette = null;
			SpriteBufferProperties.SpriteBuffer_pixels = null;
			return var4;
		}
	}
}
