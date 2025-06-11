import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("om")
public class class384 {
	@ObfuscatedName("kh")
	@ObfuscatedGetter(
		longValue = 5530406296584103933L
	)
	static long field4233;

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lps;Lps;IIB)Lrf;",
		garbageValue = "1"
	)
	public static Font method7944(AbstractArchive var0, AbstractArchive var1, int var2, int var3) {
		if (!class167.method3865(var0, var2, var3)) {
			return null;
		} else {
			byte[] var5 = var1.takeFile(var2, var3);
			Font var4;
			if (var5 == null) {
				var4 = null;
			} else {
				Font var6 = new Font(var5, SpriteBufferProperties.SpriteBuffer_xOffsets, Varps.SpriteBuffer_yOffsets, class379.SpriteBuffer_spriteWidths, class171.SpriteBuffer_spriteHeights, SpriteBufferProperties.SpriteBuffer_spritePalette, SpriteBufferProperties.SpriteBuffer_pixels);
				SpriteBufferProperties.SpriteBuffer_xOffsets = null;
				Varps.SpriteBuffer_yOffsets = null;
				class379.SpriteBuffer_spriteWidths = null;
				class171.SpriteBuffer_spriteHeights = null;
				SpriteBufferProperties.SpriteBuffer_spritePalette = null;
				SpriteBufferProperties.SpriteBuffer_pixels = null;
				var4 = var6;
			}

			return var4;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-845589785"
	)
	public static int method7943(int var0) {
		var0 += 64;
		return (var0 & 2047) / 128;
	}
}
