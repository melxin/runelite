import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kp")
public class class282 {
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lpl;Ljava/lang/String;Ljava/lang/String;B)[Lws;",
		garbageValue = "1"
	)
	@Export("getFont")
	public static IndexedSprite[] getFont(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) {
			return null;
		} else {
			int var3 = var0.getGroupId(var1);
			int var4 = var0.getFileId(var3, var2);
			byte[] var7 = var0.takeFile(var3, var4);
			boolean var6;
			if (var7 == null) {
				var6 = false;
			} else {
				class478.SpriteBuffer_decode(var7);
				var6 = true;
			}

			IndexedSprite[] var5;
			if (!var6) {
				var5 = null;
			} else {
				IndexedSprite[] var8 = new IndexedSprite[class561.SpriteBuffer_spriteCount];

				for (int var9 = 0; var9 < class561.SpriteBuffer_spriteCount; ++var9) {
					IndexedSprite var10 = var8[var9] = new IndexedSprite();
					var10.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
					var10.height = SpriteBufferProperties.SpriteBuffer_spriteHeight;
					var10.xOffset = Canvas.SpriteBuffer_xOffsets[var9];
					var10.yOffset = class194.SpriteBuffer_yOffsets[var9];
					var10.subWidth = SpriteBufferProperties.SpriteBuffer_spriteWidths[var9];
					var10.subHeight = class456.SpriteBuffer_spriteHeights[var9];
					var10.palette = DbTable.SpriteBuffer_spritePalette;
					var10.pixels = SpriteBufferProperties.SpriteBuffer_pixels[var9];
				}

				CollisionMap.method5672();
				var5 = var8;
			}

			return var5;
		}
	}
}
