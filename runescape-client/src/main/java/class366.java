import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("os")
public class class366 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	@Export("huffman")
	public static Huffman huffman;
	@ObfuscatedName("gn")
	@Export("accessToken")
	static String accessToken;

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)[Lol;",
		garbageValue = "-1431371311"
	)
	public static class377[] method7456() {
		return new class377[]{class377.USERNAME_PASSWORD, class377.field4171, class377.field4170};
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Lwg;",
		garbageValue = "2019331754"
	)
	static SpritePixels method7453() {
		SpritePixels var0 = new SpritePixels();
		var0.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
		var0.height = SpriteBufferProperties.SpriteBuffer_spriteHeight;
		var0.xOffset = Canvas.SpriteBuffer_xOffsets[0];
		var0.yOffset = class194.SpriteBuffer_yOffsets[0];
		var0.subWidth = SpriteBufferProperties.SpriteBuffer_spriteWidths[0];
		var0.subHeight = class456.SpriteBuffer_spriteHeights[0];
		int var1 = var0.subWidth * var0.subHeight;
		byte[] var2 = SpriteBufferProperties.SpriteBuffer_pixels[0];
		var0.pixels = new int[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			var0.pixels[var3] = DbTable.SpriteBuffer_spritePalette[var2[var3] & 255];
		}

		CollisionMap.method5672();
		return var0;
	}

	@ObfuscatedName("mz")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "3192935"
	)
	static final void method7455(int var0, int var1, int var2, boolean var3) {
		if (class376.widgetDefinition.loadInterface(var0)) {
			Tiles.resizeInterface(class376.widgetDefinition.Widget_interfaceComponents[var0], -1, var1, var2, var3);
		}
	}
}
