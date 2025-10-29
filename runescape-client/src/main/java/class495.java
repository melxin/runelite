import java.util.Comparator;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tr")
class class495 implements Comparator {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ltx;"
	)
	final HttpHeaders this$0;

	@ObfuscatedSignature(
		descriptor = "(Ltx;)V"
	)
	class495(HttpHeaders var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;I)I",
		garbageValue = "-1927686803"
	)
	int method10097(Entry var1, Entry var2) {
		return ((Float)var2.getValue()).compareTo((Float)var1.getValue());
	}

	public int compare(Object var1, Object var2) {
		return this.method10097((Entry)var1, (Entry)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "26"
	)
	public static int method10109(int var0, int var1) {
		return (-3 - var0 << 8) + var1;
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(Lts;Lcr;I)Z",
		garbageValue = "1409342983"
	)
	static boolean method10096(WorldEntity var0, Actor var1) {
		if (var0 != null && var1 != null) {
			int var2 = var1.size * -767295488;
			int var3 = var1.x - var2;
			int var4 = var1.y - var2;
			int var5 = var2 + var1.x - 1;
			int var6 = var2 + var1.y - 1;
			class563 var7 = StudioGame.method8385();
			var7.method11207(var0.field5538.method4619(), var0.getY(), var0.getPlane(), var0.method10529());
			boolean var8 = GrandExchangeOfferOwnWorldComparator.method828(var7, var3, var4, var5, var6);
			var7.method11210();
			return var8;
		} else {
			return false;
		}
	}
}
