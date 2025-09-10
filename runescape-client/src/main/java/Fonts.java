import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vc")
@Implements("Fonts")
public class Fonts {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("spritesArchive")
	AbstractArchive spritesArchive;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("fontsArchive")
	AbstractArchive fontsArchive;
	@ObfuscatedName("at")
	@Export("map")
	HashMap map;

	@ObfuscatedSignature(
		descriptor = "(Lpx;Lpx;)V"
	)
	public Fonts(AbstractArchive var1, AbstractArchive var2) {
		this.spritesArchive = var1;
		this.fontsArchive = var2;
		this.map = new HashMap();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([Lvf;I)Ljava/util/HashMap;",
		garbageValue = "-662771868"
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
					if (!class587.method11132(var7, var10, var11)) {
						var12 = null;
					} else {
						byte[] var14 = var8.takeFile(var10, var11);
						Font var13;
						if (var14 == null) {
							var13 = null;
						} else {
							Font var15 = new Font(var14, LoginPacket.SpriteBuffer_xOffsets, class191.SpriteBuffer_yOffsets, class255.SpriteBuffer_spriteWidths, FriendLoginUpdate.field5390, TriBool.SpriteBuffer_spritePalette, SpriteBufferProperties.SpriteBuffer_pixels);
							class388.method8205();
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "37"
	)
	public static int method10840(int var0) {
		return var0 != 0 && var0 != 1 ? -1 : 0;
	}
}
