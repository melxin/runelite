import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("np")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	@ObfuscatedName("iv")
	@ObfuscatedGetter(
		intValue = 1501959967
	)
	@Export("foundItemIndex")
	static int foundItemIndex;

	AbstractByteArrayCopier() {
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-1601907569"
	)
	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "2"
	)
	@Export("set")
	abstract void set(byte[] var1);

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lra;I)Lra;",
		garbageValue = "807751936"
	)
	static final class461 method7629(class461 var0) {
		class461 var1;
		synchronized(class461.field5251) {
			if (class461.field5245 == 0) {
				var1 = new class461(var0);
			} else {
				class461.field5251[--class461.field5245].method9364(var0);
				var1 = class461.field5251[class461.field5245];
			}
		}

		var1.method9360();
		return var1;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ILcu;ZB)I",
		garbageValue = "-49"
	)
	static int method7620(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) {
			var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type();
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) {
			var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) {
			var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) {
			var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) {
			var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) {
			var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice;
			return 1;
		} else {
			int var13;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) {
				var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var13 == 0 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) {
				var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var13 == 2 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) {
				var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var13 == 5 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) {
				var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var13 == 1 ? 1 : 0;
				return 1;
			} else {
				boolean var12;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) {
					var12 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
					if (class234.grandExchangeEvents != null) {
						class234.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) {
					var12 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
					if (class234.grandExchangeEvents != null) {
						class234.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) {
					class408.Interpreter_intStackSize -= 2;
					var12 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize] == 1;
					boolean var11 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1] == 1;
					if (class234.grandExchangeEvents != null) {
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var11;
						class234.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) {
					var12 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
					if (class234.grandExchangeEvents != null) {
						class234.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) {
					var12 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
					if (class234.grandExchangeEvents != null) {
						class234.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) {
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = class234.grandExchangeEvents == null ? 0 : class234.grandExchangeEvents.events.size();
					return 1;
				} else {
					GrandExchangeEvent var4;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) {
						var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)class234.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var4.world;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) {
						var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)class234.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var4.getOfferName();
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) {
						var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)class234.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var4.getPreviousOfferName();
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) {
						var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)class234.grandExchangeEvents.events.get(var3);
						long var5 = ParamComposition.method4708() - class135.field1607 - var4.age;
						int var7 = (int)(var5 / 3600000L);
						int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L);
						int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * 60000)) / 1000L);
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10;
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var10;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) {
						var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)class234.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.totalQuantity;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) {
						var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)class234.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.unitPrice;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) {
						var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)class234.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.id;
						return 1;
					} else if (var0 == 3939) {
						var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = class150.ItemDefinition_get(var3).isTradable ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}
}
