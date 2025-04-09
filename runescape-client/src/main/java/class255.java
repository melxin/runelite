import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jh")
public class class255 extends DualNode {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("field2136")
	static EvictingDualNodeHashTable field2136;

	static {
		field2136 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lph;Lph;III)Lrk;",
		garbageValue = "-1970172611"
	)
	public static Font method5320(AbstractArchive var0, AbstractArchive var1, int var2, int var3) {
		if (!class362.method7335(var0, var2, var3)) {
			return null;
		} else {
			byte[] var5 = var1.takeFile(var2, var3);
			Font var4;
			if (var5 == null) {
				var4 = null;
			} else {
				Font var6 = new Font(var5, HttpAuthenticationHeader.SpriteBuffer_xOffsets, MusicPatchPcmStream.SpriteBuffer_yOffsets, SpriteBufferProperties.SpriteBuffer_spriteWidths, class386.SpriteBuffer_spriteHeights, class382.SpriteBuffer_spritePalette, SpriteBufferProperties.SpriteBuffer_pixels);
				HttpAuthenticationHeader.SpriteBuffer_xOffsets = null;
				MusicPatchPcmStream.SpriteBuffer_yOffsets = null;
				SpriteBufferProperties.SpriteBuffer_spriteWidths = null;
				class386.SpriteBuffer_spriteHeights = null;
				class382.SpriteBuffer_spritePalette = null;
				SpriteBufferProperties.SpriteBuffer_pixels = null;
				var4 = var6;
			}

			return var4;
		}
	}
}
