import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qp")
@Implements("GrandExchangeOfferNameComparator")
final class GrandExchangeOfferNameComparator implements Comparator {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lqk;Lqk;B)I",
		garbageValue = "-3"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.getOfferName().compareTo(var2.getOfferName());
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lut;Lut;II)V",
		garbageValue = "122104396"
	)
	public static void method8737(DynamicArray var0, DynamicArray var1, int var2) {
		class461.method9375(var0, (class586)null, true);
		ProjectionCoord.method9359(var1, var0.field5584);
		if (var2 >= 0 && var2 <= var0.size * 1583568339) {
			if (var1.size * 1583568339 != 0) {
				var0.method10656(var1.size * 1583568339 + var0.size * 1583568339);
				if (var2 < var0.size * 1583568339) {
					HttpResponse.method296(var0, var2, var0, var1.size * 1583568339 + var2, var0.size * 1583568339 - var2);
				}

				HttpResponse.method296(var1, 0, var0, var2, var1.size * 1583568339);
				var0.size += var1.size;
			}
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ow")
	@ObfuscatedSignature(
		descriptor = "(Lof;IB)Ljava/lang/String;",
		garbageValue = "-59"
	)
	static String method8748(Widget var0, int var1) {
		int var3 = class69.getWidgetFlags2(var0);
		boolean var2 = (var3 >> var1 & 1) != 0;
		if (!var2 && var0.onOp == null) {
			return null;
		} else {
			return var0.actions != null && var0.actions.length > var1 && var0.actions[var1] != null && !var0.actions[var1].trim().isEmpty() ? var0.actions[var1] : null;
		}
	}
}
