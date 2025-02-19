import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pd")
@Implements("GrandExchangeOfferTotalQuantityComparator")
final class GrandExchangeOfferTotalQuantityComparator implements Comparator {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpx;Lpx;B)I",
		garbageValue = "61"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.grandExchangeOffer.totalQuantity < var2.grandExchangeOffer.totalQuantity ? -1 : (var2.grandExchangeOffer.totalQuantity == var1.grandExchangeOffer.totalQuantity ? 0 : 1);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lpl;Lpl;III)Lrf;",
		garbageValue = "-158631099"
	)
	public static Font method7791(AbstractArchive var0, AbstractArchive var1, int var2, int var3) {
		byte[] var5 = var0.takeFile(var2, var3);
		boolean var4;
		if (var5 == null) {
			var4 = false;
		} else {
			class478.SpriteBuffer_decode(var5);
			var4 = true;
		}

		if (!var4) {
			return null;
		} else {
			byte[] var6 = var1.takeFile(var2, var3);
			Font var8;
			if (var6 == null) {
				var8 = null;
			} else {
				Font var7 = new Font(var6, Canvas.SpriteBuffer_xOffsets, class194.SpriteBuffer_yOffsets, SpriteBufferProperties.SpriteBuffer_spriteWidths, class456.SpriteBuffer_spriteHeights, DbTable.SpriteBuffer_spritePalette, SpriteBufferProperties.SpriteBuffer_pixels);
				CollisionMap.method5672();
				var8 = var7;
			}

			return var8;
		}
	}
}
