import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ax")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class105 {
	DevicePcmPlayerProvider() {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Ldc;",
		garbageValue = "91183909"
	)
	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)I",
		garbageValue = "0"
	)
	public static int method328(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) {
			int var6 = var3;
			var3 = var4;
			var4 = var6;
		}

		var2 &= 3;
		if (var2 == 0) {
			return var1;
		} else if (var2 == 1) {
			return 7 - var0 - (var3 - 1);
		} else {
			return var2 == 2 ? 7 - var1 - (var4 - 1) : var0;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lov;I)I",
		garbageValue = "1230215838"
	)
	static int method327(Widget var0) {
		if (var0.type != 11) {
			--class175.Interpreter_objectStackSize;
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else {
			String var1 = (String)Interpreter.Interpreter_objectStack[--class175.Interpreter_objectStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var0.method7763(var1);
			return 1;
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ILcr;ZB)I",
		garbageValue = "1"
	)
	static int method325(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type();
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice;
			return 1;
		} else {
			int var13;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 0 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 2 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 5 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13 == 1 ? 1 : 0;
				return 1;
			} else {
				boolean var12;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) {
					var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
					if (class143.grandExchangeEvents != null) {
						class143.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) {
					var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
					if (class143.grandExchangeEvents != null) {
						class143.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) {
					Interpreter.Interpreter_intStackSize -= 2;
					var12 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] == 1;
					boolean var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1;
					if (class143.grandExchangeEvents != null) {
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var11;
						class143.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) {
					var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
					if (class143.grandExchangeEvents != null) {
						class143.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) {
					var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
					if (class143.grandExchangeEvents != null) {
						class143.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class143.grandExchangeEvents == null ? 0 : class143.grandExchangeEvents.events.size();
					return 1;
				} else {
					GrandExchangeEvent var4;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)class143.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.world;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)class143.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = var4.getOfferName();
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)class143.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = var4.getPreviousOfferName();
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)class143.grandExchangeEvents.events.get(var3);
						long var5 = class180.method3973() - class6.field12 - var4.age;
						int var7 = (int)(var5 / 3600000L);
						int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L);
						int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * 60000)) / 1000L);
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10;
						Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = var10;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)class143.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.totalQuantity;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)class143.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.unitPrice;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)class143.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.id;
						return 1;
					} else if (var0 == 3939) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = SceneTilePaint.ItemDefinition_get(var3).isTradable ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(Ldl;IIIS)I",
		garbageValue = "206"
	)
	@Export("getTileHeight")
	static final int getTileHeight(WorldView var0, int var1, int var2, int var3) {
		int var4 = var1 >> 7;
		int var5 = var2 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 < var0.tileSettings[0].length && var5 < var0.tileSettings[0][0].length) {
			int var6 = var3;
			if (var3 < 3 && (var0.tileSettings[1][var4][var5] & 2) == 2) {
				var6 = var3 + 1;
			}

			int var7 = var1 & 127;
			int var8 = var2 & 127;
			int var9 = var7 * var0.tileHeights[var6][var4 + 1][var5] + var0.tileHeights[var6][var4][var5] * (128 - var7) >> 7;
			int var10 = var0.tileHeights[var6][var4][var5 + 1] * (128 - var7) + var7 * var0.tileHeights[var6][var4 + 1][var5 + 1] >> 7;
			return var9 * (128 - var8) + var8 * var10 >> 7;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(IIIIIS)V",
		garbageValue = "13426"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		Scene var5 = Sound.topLevelWorldView.scene;
		long var6 = var5.getBoundaryObjectTag(var0, var1, var2);
		int var8;
		int var9;
		int var10;
		int var11;
		int var15;
		int var27;
		if (0L != var6) {
			var8 = var5.getObjectFlags(var0, var1, var2, var6);
			var9 = var8 >> 6 & 3;
			var10 = var8 & 31;
			var11 = var3;
			boolean var13 = var6 != 0L;
			if (var13) {
				boolean var14 = (int)(var6 >>> 19 & 1L) == 1;
				var13 = !var14;
			}

			if (var13) {
				var11 = var4;
			}

			int[] var20 = class328.sceneMinimapSprite.pixels;
			var27 = var1 * 4 + (103 - var2) * 2048 + 24624;
			var15 = DirectByteArrayCopier.Entity_unpackID(var6);
			ObjectComposition var16 = HealthBarConfig.getObjectDefinition(var15);
			if (var16.mapSceneId != -1) {
				IndexedSprite var17 = class403.mapSceneSprites[var16.mapSceneId];
				if (var17 != null) {
					int var18 = (var16.sizeX * 4 - var17.subWidth) / 2;
					int var19 = (var16.sizeY * 4 - var17.subHeight) / 2;
					var17.drawAt(var1 * 4 + var18 + 48, (104 - var2 - var16.sizeY) * 4 + var19 + 48);
				}
			} else {
				if (var10 == 0 || var10 == 2) {
					if (var9 == 0) {
						var20[var27] = var11;
						var20[var27 + 512] = var11;
						var20[var27 + 1024] = var11;
						var20[var27 + 1536] = var11;
					} else if (var9 == 1) {
						var20[var27] = var11;
						var20[var27 + 1] = var11;
						var20[var27 + 2] = var11;
						var20[var27 + 3] = var11;
					} else if (var9 == 2) {
						var20[var27 + 3] = var11;
						var20[var27 + 512 + 3] = var11;
						var20[var27 + 1024 + 3] = var11;
						var20[var27 + 1536 + 3] = var11;
					} else if (var9 == 3) {
						var20[var27 + 1536] = var11;
						var20[var27 + 1536 + 1] = var11;
						var20[var27 + 1536 + 2] = var11;
						var20[var27 + 1536 + 3] = var11;
					}
				}

				if (var10 == 3) {
					if (var9 == 0) {
						var20[var27] = var11;
					} else if (var9 == 1) {
						var20[var27 + 3] = var11;
					} else if (var9 == 2) {
						var20[var27 + 1536 + 3] = var11;
					} else if (var9 == 3) {
						var20[var27 + 1536] = var11;
					}
				}

				if (var10 == 2) {
					if (var9 == 3) {
						var20[var27] = var11;
						var20[var27 + 512] = var11;
						var20[var27 + 1024] = var11;
						var20[var27 + 1536] = var11;
					} else if (var9 == 0) {
						var20[var27] = var11;
						var20[var27 + 1] = var11;
						var20[var27 + 2] = var11;
						var20[var27 + 3] = var11;
					} else if (var9 == 1) {
						var20[var27 + 3] = var11;
						var20[var27 + 512 + 3] = var11;
						var20[var27 + 1024 + 3] = var11;
						var20[var27 + 1536 + 3] = var11;
					} else if (var9 == 2) {
						var20[var27 + 1536] = var11;
						var20[var27 + 1536 + 1] = var11;
						var20[var27 + 1536 + 2] = var11;
						var20[var27 + 1536 + 3] = var11;
					}
				}
			}
		}

		var6 = var5.getGameObjectTag(var0, var1, var2);
		if (var6 != 0L) {
			var8 = var5.getObjectFlags(var0, var1, var2, var6);
			var9 = var8 >> 6 & 3;
			var10 = var8 & 31;
			var11 = DirectByteArrayCopier.Entity_unpackID(var6);
			ObjectComposition var21 = HealthBarConfig.getObjectDefinition(var11);
			if (var21.mapSceneId != -1) {
				IndexedSprite var29 = class403.mapSceneSprites[var21.mapSceneId];
				if (var29 != null) {
					var27 = (var21.sizeX * 4 - var29.subWidth) / 2;
					var15 = (var21.sizeY * 4 - var29.subHeight) / 2;
					var29.drawAt(var27 + var1 * 4 + 48, var15 + (104 - var2 - var21.sizeY) * 4 + 48);
				}
			} else if (var10 == 9) {
				int var26 = 15658734;
				boolean var28 = 0L != var6;
				if (var28) {
					boolean var22 = (int)(var6 >>> 19 & 1L) == 1;
					var28 = !var22;
				}

				if (var28) {
					var26 = 15597568;
				}

				int[] var23 = class328.sceneMinimapSprite.pixels;
				int var30 = var1 * 4 + (103 - var2) * 2048 + 24624;
				if (var9 != 0 && var9 != 2) {
					var23[var30] = var26;
					var23[var30 + 1 + 512] = var26;
					var23[var30 + 1024 + 2] = var26;
					var23[var30 + 1536 + 3] = var26;
				} else {
					var23[var30 + 1536] = var26;
					var23[var30 + 1 + 1024] = var26;
					var23[var30 + 512 + 2] = var26;
					var23[var30 + 3] = var26;
				}
			}
		}

		var6 = var5.getFloorDecorationTag(var0, var1, var2);
		if (var6 != 0L) {
			var8 = DirectByteArrayCopier.Entity_unpackID(var6);
			ObjectComposition var24 = HealthBarConfig.getObjectDefinition(var8);
			if (var24.mapSceneId != -1) {
				IndexedSprite var25 = class403.mapSceneSprites[var24.mapSceneId];
				if (var25 != null) {
					var11 = (var24.sizeX * 4 - var25.subWidth) / 2;
					int var12 = (var24.sizeY * 4 - var25.subHeight) / 2;
					var25.drawAt(var1 * 4 + var11 + 48, var12 + (104 - var2 - var24.sizeY) * 4 + 48);
				}
			}
		}

	}
}
