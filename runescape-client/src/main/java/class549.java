import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("vk")
class class549 implements Iterator {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 2055207459
	)
	int field5481;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lvv;"
	)
	final class550 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lvv;)V"
	)
	class549(class550 var1) {
		this.this$0 = var1;
	}

	public boolean hasNext() {
		return this.field5481 < this.this$0.method9535();
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	public Object next() {
		int var1 = ++this.field5481 - 1;
		class511 var2 = (class511)this.this$0.field5483.get((long)var1);
		return var2 != null ? var2 : this.this$0.method10021(var1);
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ILdy;ZB)I",
		garbageValue = "-113"
	)
	static int method10018(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) {
			var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type();
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) {
			var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) {
			var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) {
			var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) {
			var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) {
			var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice;
			return 1;
		} else {
			int var13;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) {
				var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var13 == 0 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) {
				var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var13 == 2 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) {
				var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var13 == 5 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) {
				var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var13 == 1 ? 1 : 0;
				return 1;
			} else {
				boolean var12;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) {
					var12 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize] == 1;
					if (class246.grandExchangeEvents != null) {
						class246.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) {
					var12 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize] == 1;
					if (class246.grandExchangeEvents != null) {
						class246.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) {
					HealthBarConfig.Interpreter_intStackSize -= 2;
					var12 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize] == 1;
					boolean var11 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1] == 1;
					if (class246.grandExchangeEvents != null) {
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var11;
						class246.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) {
					var12 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize] == 1;
					if (class246.grandExchangeEvents != null) {
						class246.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) {
					var12 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize] == 1;
					if (class246.grandExchangeEvents != null) {
						class246.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) {
					Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = class246.grandExchangeEvents == null ? 0 : class246.grandExchangeEvents.events.size();
					return 1;
				} else {
					GrandExchangeEvent var4;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) {
						var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)class246.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var4.world;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) {
						var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)class246.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getOfferName();
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) {
						var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)class246.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getPreviousOfferName();
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) {
						var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)class246.grandExchangeEvents.events.get(var3);
						long var5 = InterfaceParent.method2434() - class168.field1856 - var4.age;
						int var7 = (int)(var5 / 3600000L);
						int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L);
						int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * 60000)) / 1000L);
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var10;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) {
						var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)class246.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.totalQuantity;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) {
						var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)class246.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.unitPrice;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) {
						var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)class246.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.id;
						return 1;
					} else if (var0 == 3939) {
						var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = class138.ItemDefinition_get(var3).isTradable ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}
}
