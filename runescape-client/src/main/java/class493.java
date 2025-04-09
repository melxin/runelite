import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sm")
public class class493 {
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 488828967
	)
	@Export("RunException_revision")
	public static int RunException_revision;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	final WorldEntityCoord field5171;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -726592901
	)
	int field5172;

	class493() {
		this.field5171 = new WorldEntityCoord();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)[Lwc;",
		garbageValue = "26"
	)
	static SpritePixels[] method9400() {
		SpritePixels[] var0 = new SpritePixels[SpriteBufferProperties.SpriteBuffer_spriteCount];

		for (int var1 = 0; var1 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var1) {
			SpritePixels var2 = var0[var1] = new SpritePixels();
			var2.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
			var2.height = class27.SpriteBuffer_spriteHeight;
			var2.xOffset = HttpAuthenticationHeader.SpriteBuffer_xOffsets[var1];
			var2.yOffset = MusicPatchPcmStream.SpriteBuffer_yOffsets[var1];
			var2.subWidth = SpriteBufferProperties.SpriteBuffer_spriteWidths[var1];
			var2.subHeight = class386.SpriteBuffer_spriteHeights[var1];
			int var3 = var2.subWidth * var2.subHeight;
			byte[] var4 = SpriteBufferProperties.SpriteBuffer_pixels[var1];
			var2.pixels = new int[var3];

			for (int var5 = 0; var5 < var3; ++var5) {
				var2.pixels[var5] = class382.SpriteBuffer_spritePalette[var4[var5] & 255];
			}
		}

		HttpAuthenticationHeader.SpriteBuffer_xOffsets = null;
		MusicPatchPcmStream.SpriteBuffer_yOffsets = null;
		SpriteBufferProperties.SpriteBuffer_spriteWidths = null;
		class386.SpriteBuffer_spriteHeights = null;
		class382.SpriteBuffer_spritePalette = null;
		SpriteBufferProperties.SpriteBuffer_pixels = null;
		return var0;
	}
}
