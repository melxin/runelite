import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ba")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("al")
	@Export("filterWorlds")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lqn;Lqn;I)I",
		garbageValue = "1784313440"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) {
			return 0;
		} else {
			if (this.filterWorlds) {
				if (Client.worldId == var1.world) {
					return -1;
				}

				if (var2.world == Client.worldId) {
					return 1;
				}
			}

			return var1.world < var2.world ? -1 : 1;
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(Ldj;IIIIIIB)V",
		garbageValue = "115"
	)
	static void method804(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		NodeDeque var7 = var0.groundItems[var1][var2][var3];
		if (var7 != null) {
			for (TileItem var8 = (TileItem)var7.last(); var8 != null; var8 = (TileItem)var7.previous()) {
				if ((var4 & 32767) == var8.id && var5 == var8.quantity) {
					var8.quantity = var6;
					break;
				}
			}

			class167.updateItemPile(var1, var2, var3);
		}

	}

	@ObfuscatedName("nh")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lch;",
		garbageValue = "556826293"
	)
	@Export("openInterface")
	static final InterfaceParent openInterface(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent();
		var3.group = var1;
		var3.type = var2;
		Client.interfaceParents.put(var3, (long)var0);
		Tiles.method2077(var1);
		Widget var4 = class167.widgetDefinition.method7456(var0);
		ApproximateRouteStrategy.invalidateWidget(var4);
		if (Client.meslayerContinueWidget != null) {
			ApproximateRouteStrategy.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		Tiles.revalidateWidgetScroll(class167.widgetDefinition.Widget_interfaceComponents[var0 >> 16], var4, false);
		WorldMapRegion.runWidgetOnLoadListener(var1);
		if (Client.rootInterface != -1) {
			HttpResponse.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3;
	}
}
