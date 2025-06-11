import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pj")
@Implements("GrandExchangeOfferTotalQuantityComparator")
final class GrandExchangeOfferTotalQuantityComparator implements Comparator {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lpf;Lpf;I)I",
		garbageValue = "-1270897959"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.grandExchangeOffer.totalQuantity < var2.grandExchangeOffer.totalQuantity ? -1 : (var2.grandExchangeOffer.totalQuantity == var1.grandExchangeOffer.totalQuantity ? 0 : 1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Ldl;IIIII)I",
		garbageValue = "-218557446"
	)
	static int method8203(WorldView var0, int var1, int var2, int var3, int var4) {
		int var5 = var4 / 2;
		int var6 = var1 - var5;
		int var7 = var2 - var5;
		int var8 = var5 + var1;
		int var9 = var5 + var2;
		int var10 = var6 >> 7;
		int var11 = var10 + 1;
		int var12 = var7 >> 7;
		int var13 = var12 + 1;
		int var14 = var8 >> 7;
		int var15 = var14;
		int var16 = var9 >> 7;
		int var17 = var16;
		int var18 = Integer.MAX_VALUE;

		for (int var19 = var11; var19 <= var15; ++var19) {
			for (int var20 = var13; var20 <= var17; ++var20) {
				var18 = Math.min(var18, DevicePcmPlayerProvider.method329(var0, Coord.method7228(var19), Coord.method7228(var20), var3));
			}
		}

		var18 = Math.min(var18, DevicePcmPlayerProvider.method329(var0, var1, var2, var3));
		var18 = Math.min(var18, DevicePcmPlayerProvider.method329(var0, var1 - var5, var2 - var5, var3));
		var18 = Math.min(var18, DevicePcmPlayerProvider.method329(var0, var1 - var5, var5 + var2, var3));
		var18 = Math.min(var18, DevicePcmPlayerProvider.method329(var0, var5 + var1, var2 - var5, var3));
		var18 = Math.min(var18, DevicePcmPlayerProvider.method329(var0, var5 + var1, var5 + var2, var3));
		return var18;
	}
}
