import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bh")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "[Lxc;"
	)
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;
	@ObfuscatedName("af")
	@Export("filterWorlds")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lqi;Lqi;I)I",
		garbageValue = "-852390989"
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

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ILcg;ZB)I",
		garbageValue = "-5"
	)
	static int method789(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) {
			var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Client.indexCheck.isValidIndexInRange(var3) ? 1 : 0;
			return 1;
		} else if (var0 == 3501) {
			var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Client.indexCheck.method6122(var3) ? 1 : 0;
			return 1;
		} else if (var0 == 3502) {
			var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Client.indexCheck.method6124(var3) ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}
}
