import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("us")
@Implements("Fonts")
public class Fonts {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	@Export("spritesArchive")
	AbstractArchive spritesArchive;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	@Export("fontsArchive")
	AbstractArchive fontsArchive;
	@ObfuscatedName("az")
	@Export("map")
	HashMap map;

	@ObfuscatedSignature(
		descriptor = "(Lpq;Lpq;)V"
	)
	public Fonts(AbstractArchive var1, AbstractArchive var2) {
		this.spritesArchive = var1;
		this.fontsArchive = var2;
		this.map = new HashMap();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([Lun;I)Ljava/util/HashMap;",
		garbageValue = "-455222829"
	)
	@Export("createMap")
	public HashMap createMap(FontName[] var1) {
		HashMap var2 = new HashMap();
		FontName[] var3 = var1;

		for (int var4 = 0; var4 < var3.length; ++var4) {
			FontName var5 = var3[var4];
			if (this.map.containsKey(var5)) {
				var2.put(var5, this.map.get(var5));
			} else {
				AbstractArchive var7 = this.spritesArchive;
				AbstractArchive var8 = this.fontsArchive;
				String var9 = var5.name;
				Font var6;
				if (!var7.isValidFileName(var9, "")) {
					var6 = null;
				} else {
					int var10 = var7.getGroupId(var9);
					int var11 = var7.getFileId(var10, "");
					Font var12;
					if (!WorldMapSprite.method6397(var7, var10, var11)) {
						var12 = null;
					} else {
						byte[] var14 = var8.takeFile(var10, var11);
						Font var13;
						if (var14 == null) {
							var13 = null;
						} else {
							Font var15 = new Font(var14, class241.SpriteBuffer_xOffsets, SpriteBufferProperties.SpriteBuffer_yOffsets, SpriteBufferProperties.SpriteBuffer_spriteWidths, class403.SpriteBuffer_spriteHeights, KeyHandler.SpriteBuffer_spritePalette, class240.SpriteBuffer_pixels);
							class241.SpriteBuffer_xOffsets = null;
							SpriteBufferProperties.SpriteBuffer_yOffsets = null;
							SpriteBufferProperties.SpriteBuffer_spriteWidths = null;
							class403.SpriteBuffer_spriteHeights = null;
							KeyHandler.SpriteBuffer_spritePalette = null;
							class240.SpriteBuffer_pixels = null;
							var13 = var15;
						}

						var12 = var13;
					}

					var6 = var12;
				}

				if (var6 != null) {
					this.map.put(var5, var6);
					var2.put(var5, var6);
				}
			}
		}

		return var2;
	}
}
