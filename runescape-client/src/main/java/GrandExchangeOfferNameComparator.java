import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ps")
@Implements("GrandExchangeOfferNameComparator")
final class GrandExchangeOfferNameComparator implements Comparator {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lqn;Lqn;B)I",
		garbageValue = "1"
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

	@ObfuscatedName("mm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIII)I",
		garbageValue = "-1724238694"
	)
	static final int method8512(String var0, String var1, int var2, int var3, int var4, int var5, int var6) {
		return ClanSettings.insertMenuItem(var0, var1, var2, var3, var4, var5, var6, false, -1);
	}

	@ObfuscatedName("pi")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1059153168"
	)
	static boolean method8501() {
		return FriendSystem.clientPreferences.getEULA() >= Client.field368;
	}
}
