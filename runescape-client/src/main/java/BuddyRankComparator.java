import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ek")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
	@ObfuscatedName("ci")
	static String field1509;
	@ObfuscatedName("ab")
	@Export("reversed")
	final boolean reversed;

	public BuddyRankComparator(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lsi;Lsi;S)I",
		garbageValue = "3238"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.rank != var1.rank) {
			return this.reversed ? var1.rank - var2.rank : var2.rank - var1.rank;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("od")
	@ObfuscatedSignature(
		descriptor = "(Lnp;B)Lnp;",
		garbageValue = "-89"
	)
	static Widget method3253(Widget var0) {
		int var2 = Renderable.getWidgetFlags(var0);
		int var1 = var2 >> 17 & 7;
		int var3 = var1;
		if (var1 == 0) {
			return null;
		} else {
			for (int var4 = 0; var4 < var3; ++var4) {
				var0 = class379.widgetDefinition.method6875(var0.parentId);
				if (var0 == null) {
					return null;
				}
			}

			return var0;
		}
	}
}
