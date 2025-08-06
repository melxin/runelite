import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qs")
@Implements("GrandExchangeOfferUnitPriceComparator")
final class GrandExchangeOfferUnitPriceComparator implements Comparator {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lqn;Lqn;I)I",
		garbageValue = "-230996376"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.grandExchangeOffer.unitPrice < var2.grandExchangeOffer.unitPrice ? -1 : (var2.grandExchangeOffer.unitPrice == var1.grandExchangeOffer.unitPrice ? 0 : 1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lpx;II)V",
		garbageValue = "-319814409"
	)
	public static void method8561(AbstractArchive var0, int var1) {
		if (!class337.field3790.isEmpty()) {
			ArrayList var2 = new ArrayList();
			Iterator var3 = class337.field3790.iterator();

			while (var3.hasNext()) {
				MidiRequest var4 = (MidiRequest)var3.next();
				var4.field3908 = false;
				var4.field3917 = false;
				var4.field3914 = false;
				var4.field3918 = false;
				var4.musicTrackArchive = var0;
				var4.musicTrackVolume = var1;
				var4.field3912 = 0.0F;
				var2.add(var4);
			}

			class30.method486(var2, class337.musicPlayerStatus, class337.field3797, class337.field3798, class337.field3789, false);
		}
	}
}
