import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("li")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lli;"
	)
	@Export("WORLDMAPSECTIONTYPE0")
	WORLDMAPSECTIONTYPE0(2, (byte)0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lli;"
	)
	@Export("WORLDMAPSECTIONTYPE1")
	WORLDMAPSECTIONTYPE1(0, (byte)1),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lli;"
	)
	@Export("WORLDMAPSECTIONTYPE2")
	WORLDMAPSECTIONTYPE2(3, (byte)2),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lli;"
	)
	@Export("WORLDMAPSECTIONTYPE3")
	WORLDMAPSECTIONTYPE3(1, (byte)3);

	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1637596891
	)
	@Export("type")
	final int type;
	@ObfuscatedName("ac")
	@Export("id")
	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3;
		this.id = var4;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1071289392"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Lhj;",
		garbageValue = "903599656"
	)
	public static HealthBarDefinition method6191(int var0) {
		HealthBarDefinition var1 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var0);
			var1 = new HealthBarDefinition();
			var1.field1934 = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)[Lli;",
		garbageValue = "-36"
	)
	static WorldMapSectionType[] method6193() {
		return new WorldMapSectionType[]{WORLDMAPSECTIONTYPE3, WORLDMAPSECTIONTYPE0, WORLDMAPSECTIONTYPE1, WORLDMAPSECTIONTYPE2};
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([BB)[B",
		garbageValue = "-26"
	)
	static byte[] method6188(byte[] var0) {
		int var1 = var0.length;
		byte[] var2 = new byte[var1];
		System.arraycopy(var0, 0, var2, 0, var1);
		return var2;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ldm;[BIIIIIIIIIS)V",
		garbageValue = "29391"
	)
	static final void method6196(WorldView var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		CollisionMap[] var11 = var0.collisionMaps;
		int var13;
		if (var11 != null) {
			for (int var12 = 0; var12 < 8; ++var12) {
				for (var13 = 0; var13 < 8; ++var13) {
					if (var3 + var12 > 0 && var3 + var12 < var11[var2].flags.length && var13 + var4 > 0 && var13 + var4 < var11[var2].flags[var3 + var12].length) {
						int[] var10000 = var11[var2].flags[var3 + var12];
						var10000[var13 + var4] &= -1073741825;
					}
				}
			}
		}

		Buffer var25 = new Buffer(var1);

		for (var13 = 0; var13 < 4; ++var13) {
			for (int var14 = 0; var14 < 64; ++var14) {
				for (int var15 = 0; var15 < 64; ++var15) {
					if (var5 == var13 && var14 >= var6 && var14 < var6 + 8 && var15 >= var7 && var15 < var7 + 8) {
						int var16 = var3 + class141.method3391(var14 & 7, var15 & 7, var8);
						int var19 = var14 & 7;
						int var20 = var15 & 7;
						int var21 = var8 & 3;
						int var18;
						if (var21 == 0) {
							var18 = var20;
						} else if (var21 == 1) {
							var18 = 7 - var19;
						} else if (var21 == 2) {
							var18 = 7 - var20;
						} else {
							var18 = var19;
						}

						int var22 = var4 + var18;
						int var23 = var3 + (var14 & 7) + var9;
						int var24 = var10 + (var15 & 7) + var4;
						class182.loadTerrain(var0, var25, var2, var16, var22, var23, var24, var8);
					} else {
						class182.loadTerrain(var0, var25, 0, -1, -1, 0, 0, 0);
					}
				}
			}
		}

	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "723902883"
	)
	static int method6197(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) {
			var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type();
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) {
			var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) {
			var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) {
			var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) {
			var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) {
			var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice;
			return 1;
		} else {
			int var13;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) {
				var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var13 == 0 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) {
				var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var13 == 2 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) {
				var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var13 == 5 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) {
				var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var13 == 1 ? 1 : 0;
				return 1;
			} else {
				boolean var12;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) {
					var12 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
					if (class246.grandExchangeEvents != null) {
						class246.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) {
					var12 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
					if (class246.grandExchangeEvents != null) {
						class246.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) {
					PrivateChatMode.Interpreter_intStackSize -= 2;
					var12 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize] == 1;
					boolean var11 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1] == 1;
					if (class246.grandExchangeEvents != null) {
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var11;
						class246.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) {
					var12 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
					if (class246.grandExchangeEvents != null) {
						class246.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) {
					var12 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
					if (class246.grandExchangeEvents != null) {
						class246.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) {
					Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = class246.grandExchangeEvents == null ? 0 : class246.grandExchangeEvents.events.size();
					return 1;
				} else {
					GrandExchangeEvent var4;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) {
						var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)class246.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var4.world;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) {
						var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)class246.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getOfferName();
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) {
						var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)class246.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getPreviousOfferName();
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) {
						var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)class246.grandExchangeEvents.events.get(var3);
						long var5 = class59.method1150() - class27.field130 - var4.age;
						int var7 = (int)(var5 / 3600000L);
						int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L);
						int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * 60000)) / 1000L);
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var10;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) {
						var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)class246.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.totalQuantity;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) {
						var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)class246.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.unitPrice;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) {
						var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)class246.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.id;
						return 1;
					} else if (var0 == 3939) {
						var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = WorldEntityCoord.ItemDefinition_get(var3).isTradable ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}

	@ObfuscatedName("of")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "2081220218"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase();
		short[] var2 = new short[16];
		int var3 = 0;

		for (int var4 = 0; var4 < class31.ItemDefinition_fileCount; ++var4) {
			ItemComposition var9 = WorldEntityCoord.ItemDefinition_get(var4);
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) {
				if (var3 >= 250) {
					Bounds.foundItemIdCount = -1;
					SecureRandomFuture.foundItemIds = null;
					return;
				}

				if (var3 >= var2.length) {
					short[] var6 = new short[var2.length * 2];

					for (int var7 = 0; var7 < var3; ++var7) {
						var6[var7] = var2[var7];
					}

					var2 = var6;
				}

				var2[var3++] = (short)var4;
			}
		}

		SecureRandomFuture.foundItemIds = var2;
		WorldMapIcon_1.foundItemIndex = 0;
		Bounds.foundItemIdCount = var3;
		String[] var8 = new String[Bounds.foundItemIdCount];

		for (int var5 = 0; var5 < Bounds.foundItemIdCount; ++var5) {
			var8[var5] = WorldEntityCoord.ItemDefinition_get(var2[var5]).name;
		}

		DbTable.method10001(var8, SecureRandomFuture.foundItemIds);
	}
}
