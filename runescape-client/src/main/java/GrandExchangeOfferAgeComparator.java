import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pq")
@Implements("GrandExchangeOfferAgeComparator")
final class GrandExchangeOfferAgeComparator implements Comparator {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpk;Lpk;I)I",
		garbageValue = "-833306069"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.age < var2.age ? -1 : (var1.age == var2.age ? 0 : 1);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1930770900"
	)
	static void method7711() {
		HealthBarDefinition.compass = null;
		class162.redHintArrowSprite = null;
		class160.mapSceneSprites = null;
		class60.headIconPkSprites = null;
		class230.headIconPrayerSprites = null;
		class369.headIconHintSprites = null;
		SpriteMask.mapDotSprites = null;
		class381.crossSprites = null;
		class113.field1435 = null;
		class36.scrollBarSprites = null;
		HttpResponse.field101 = null;
	}

	@ObfuscatedName("mg")
	@ObfuscatedSignature(
		descriptor = "([Lnp;Lnp;ZI)V",
		garbageValue = "21935086"
	)
	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = var1.scrollWidth != 0 ? var1.scrollWidth : var1.width * 1063514007;
		int var4 = var1.scrollHeight != 0 ? var1.scrollHeight : var1.height * 1899982693;
		Tile.resizeInterface(var0, var1.id, var3, var4, var2);
		if (var1.children != null) {
			Tile.resizeInterface(var1.children, var1.id, var3, var4, var2);
		}

		InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var1.id);
		if (var5 != null) {
			Message.method1201(var5.group, var3, var4, var2);
		}

		if (var1.contentType == 1337) {
		}

	}
}
