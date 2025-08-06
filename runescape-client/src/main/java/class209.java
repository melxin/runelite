import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iv")
public class class209 {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 684312437
	)
	public int field2257;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1067312029
	)
	public int field2253;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1541962633
	)
	public int field2254;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -516765019
	)
	public int field2252;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 605627007
	)
	public int field2255;

	class209(int var1, int var2, int var3, int var4, int var5) {
		this.field2257 = 0;
		this.field2253 = 1;
		this.field2254 = 0;
		this.field2252 = 0;
		this.field2255 = 0;
		this.field2257 = var1;
		this.field2253 = var2;
		this.field2254 = var3;
		this.field2252 = var4;
		this.field2255 = var5;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lpx;III)[Lxv;",
		garbageValue = "-816130148"
	)
	public static SpritePixels[] method4562(AbstractArchive var0, int var1, int var2) {
		if (!class522.method10495(var0, var1, var2)) {
			return null;
		} else {
			SpritePixels[] var4 = new SpritePixels[SpriteBufferProperties.SpriteBuffer_spriteCount];

			for (int var5 = 0; var5 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var5) {
				SpritePixels var6 = var4[var5] = new SpritePixels();
				var6.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
				var6.height = SpriteBufferProperties.SpriteBuffer_spriteHeight;
				var6.xOffset = SpriteBufferProperties.SpriteBuffer_xOffsets[var5];
				var6.yOffset = class440.SpriteBuffer_yOffsets[var5];
				var6.subWidth = class333.SpriteBuffer_spriteWidths[var5];
				var6.subHeight = Buffer.SpriteBuffer_spriteHeights[var5];
				int var7 = var6.subWidth * var6.subHeight;
				byte[] var8 = SpriteBufferProperties.SpriteBuffer_pixels[var5];
				var6.pixels = new int[var7];

				for (int var9 = 0; var9 < var7; ++var9) {
					int var10 = var8[var9] & 255;
					var6.pixels[var9] = class113.SpriteBuffer_spritePalette[var10];
				}
			}

			SpriteBufferProperties.SpriteBuffer_xOffsets = null;
			class440.SpriteBuffer_yOffsets = null;
			class333.SpriteBuffer_spriteWidths = null;
			Buffer.SpriteBuffer_spriteHeights = null;
			class113.SpriteBuffer_spritePalette = null;
			SpriteBufferProperties.SpriteBuffer_pixels = null;
			return var4;
		}
	}
}
