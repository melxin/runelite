import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
public abstract class class166 extends Node {
	@ObfuscatedName("kp")
	@ObfuscatedGetter(
		intValue = -1611850441
	)
	@Export("cameraY")
	static int cameraY;

	class166() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvj;B)V",
		garbageValue = "13"
	)
	abstract void vmethod3691(Buffer var1);

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgc;I)V",
		garbageValue = "-1736476566"
	)
	abstract void vmethod3688(ClanChannel var1);

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lpi;Lpi;IIB)Lqu;",
		garbageValue = "-46"
	)
	public static Font method3637(AbstractArchive var0, AbstractArchive var1, int var2, int var3) {
		if (!class326.method6471(var0, var2, var3)) {
			return null;
		} else {
			byte[] var5 = var1.takeFile(var2, var3);
			Font var4;
			if (var5 == null) {
				var4 = null;
			} else {
				Font var6 = new Font(var5, SpriteBufferProperties.SpriteBuffer_xOffsets, HttpResponse.SpriteBuffer_yOffsets, SpriteBufferProperties.SpriteBuffer_spriteWidths, WorldMapCacheName.SpriteBuffer_spriteHeights, class140.SpriteBuffer_spritePalette, SpriteBufferProperties.SpriteBuffer_pixels);
				SpriteBufferProperties.SpriteBuffer_xOffsets = null;
				HttpResponse.SpriteBuffer_yOffsets = null;
				SpriteBufferProperties.SpriteBuffer_spriteWidths = null;
				WorldMapCacheName.SpriteBuffer_spriteHeights = null;
				class140.SpriteBuffer_spritePalette = null;
				SpriteBufferProperties.SpriteBuffer_pixels = null;
				var4 = var6;
			}

			return var4;
		}
	}
}
