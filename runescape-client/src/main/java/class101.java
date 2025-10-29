import java.util.concurrent.locks.ReentrantLock;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("do")
public class class101 {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ler;"
	)
	VorbisSample field1359;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	RawSound field1360;
	@ObfuscatedName("ag")
	ReentrantLock field1361;

	@ObfuscatedSignature(
		descriptor = "(Ler;Ldq;)V"
	)
	class101(VorbisSample var1, RawSound var2) {
		this.field1359 = var1;
		this.field1360 = var2;
		this.field1361 = new ReentrantLock();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-41"
	)
	public static int method3260(int var0, int var1) {
		return (int)(Math.atan2((double)var0, (double)var1) * 325.94932345220167D) & 2047;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ILcu;ZI)I",
		garbageValue = "1827144587"
	)
	static int method3259(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) {
			Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Client.cycle;
			return 1;
		} else {
			int var3;
			int var8;
			if (var0 == ScriptOpcodes.INV_GETOBJ) {
				class408.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
				var8 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = GrandExchangeOfferTotalQuantityComparator.method8730(var3, var8);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_GETNUM) {
				class408.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
				var8 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = class209.ItemContainer_getCount(var3, var8);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_TOTAL) {
				class408.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
				var8 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = class320.method7180(var3, var8);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_SIZE) {
				var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = WallDecoration.getInvDefinition(var3).size;
				return 1;
			} else if (var0 == ScriptOpcodes.STAT) {
				var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Client.currentLevels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_BASE) {
				var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Client.levels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_XP) {
				var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Client.experience[var3];
				return 1;
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) {
					var3 = Occluder.topLevelWorldView.plane;
					var8 = (class330.localPlayer.x >> 7) + Occluder.topLevelWorldView.baseX;
					var5 = (class330.localPlayer.y >> 7) + Occluder.topLevelWorldView.baseY;
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Coord.method7672(var3, var8, var5);
					return 1;
				} else if (var0 == ScriptOpcodes.COORDX) {
					var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Coord.method7674(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.COORDZ) {
					var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Coord.method7673(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.COORDY) {
					var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Coord.method7675(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) {
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) {
					class408.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize] + 32768;
					var8 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = GrandExchangeOfferTotalQuantityComparator.method8730(var3, var8);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) {
					class408.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize] + 32768;
					var8 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = class209.ItemContainer_getCount(var3, var8);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) {
					class408.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize] + 32768;
					var8 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = class320.method7180(var3, var8);
					return 1;
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) {
					if (Client.staffModLevel >= 2) {
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) {
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Client.rebootTimer;
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_WORLD) {
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Client.worldId;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) {
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Client.runEnergy / 100;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) {
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Client.weight;
					return 1;
				} else if (var0 == ScriptOpcodes.PLAYERMOD) {
					if (Client.playerMod) {
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) {
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Client.worldProperties;
					return 1;
				} else if (var0 == ScriptOpcodes.MOVECOORD) {
					class408.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
					var8 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 2];
					int var6 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 3];
					int var7 = Coord.method7672(var5, var8, var6);
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var3 + var7;
					return 1;
				} else if (var0 == 3326) {
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Client.field498;
					return 1;
				} else if (var0 == 3327) {
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Client.field360;
					return 1;
				} else if (var0 == 3331) {
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Client.runEnergy;
					return 1;
				} else if (var0 == 3332) {
					var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Client.field328[var3];
					return 1;
				} else if (var0 == 3333) {
					Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = Client.field309;
					return 1;
				} else if (var0 == 3339) {
					var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
					if (var3 == -1) {
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "";
					} else {
						class207 var4 = WorldMapRegion.method6822(var3);
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var4 == null ? "" : var4.field2233;
					}

					return 1;
				} else {
					return 2;
				}
			}
		}
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(ILcu;ZB)I",
		garbageValue = "-113"
	)
	static int method3261(int var0, Script var1, boolean var2) {
		DynamicArray var8;
		DynamicArray var9;
		if (var0 == 8000) {
			SecureRandomFuture.Interpreter_objectStackSize -= 2;
			var9 = VarcInt.method4356(Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize], (String)null);
			var8 = (DynamicArray)Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize + 1];
			class520.method10573(var9, var8);
			return 1;
		} else {
			int var3;
			int var4;
			DynamicArray var5;
			if (var0 == 8001) {
				class408.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
				var5 = VarcInt.method4356(Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize], (String)null);
				class412.method8516(var5, var3, var4);
				return 1;
			} else if (var0 == 8002) {
				var9 = (DynamicArray)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var9 == null ? 1 : 0;
				return 1;
			} else if (var0 == 8003) {
				var9 = (DynamicArray)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var9 != null ? var9.method10652() : 0;
				return 1;
			} else if (var0 == 8004) {
				SecureRandomFuture.Interpreter_objectStackSize -= 2;
				var9 = (DynamicArray)Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize];
				var8 = (DynamicArray)Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize + 1];
				Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = HttpHeaders.method10055(var9, var8);
				return 1;
			} else {
				DynamicArray var7;
				int var10;
				Object var13;
				if (var0 == 8005) {
					class408.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
					var10 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 2];
					var13 = class39.method816(var10);
					var7 = (DynamicArray)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var7 != null ? BufferedSink.method10466(var7, var13, var3, var4) : -1;
					return 1;
				} else if (var0 == 8006) {
					class408.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
					var10 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 2];
					var13 = class39.method816(var10);
					var7 = (DynamicArray)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var7 != null ? class392.method8381(var7, var13, var3, var4) : -1;
					return 1;
				} else if (var0 == 8007) {
					class408.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
					var10 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 2];
					var13 = class39.method816(var10);
					var7 = (DynamicArray)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
					Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var7 != null ? class320.method7181(var7, var13, var3, var4) : 0;
					return 1;
				} else {
					String var14;
					if (var0 == 8008) {
						var9 = VarcInt.method4356(Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize], (String)null);
						var4 = FloorUnderlayDefinition.method4584(var9);
						if (var9.field5584 == class586.field5937) {
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var4 >= 0 ? var9.method10650()[var4] : -1;
						} else {
							if (var9.field5584 != class586.field5939) {
								throw new IllegalStateException();
							}

							var14 = (String)((String)(var4 >= 0 ? var9.method10681()[var4] : null));
							Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var14 != null ? var14 : "";
						}

						return 1;
					} else if (var0 == 8009) {
						var9 = VarcInt.method4356(Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize], (String)null);
						var4 = Projectile.method2029(var9);
						if (var9.field5584 == class586.field5937) {
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var4 >= 0 ? var9.method10650()[var4] : -1;
						} else {
							if (var9.field5584 != class586.field5939) {
								throw new IllegalStateException();
							}

							var14 = (String)((String)(var4 >= 0 ? var9.method10681()[var4] : null));
							Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var14 != null ? var14 : "";
						}

						return 1;
					} else if (var0 == 8010) {
						class408.Interpreter_intStackSize -= 3;
						var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
						var4 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
						var10 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 2];
						var13 = class39.method816(var10);
						var7 = VarcInt.method4356(Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize], (String)null);
						class532.method10782(var7, var13, var3, var4);
						return 1;
					} else {
						DynamicArray var6;
						if (var0 == 8011) {
							class408.Interpreter_intStackSize -= 3;
							var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
							var10 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 2];
							var6 = VarcInt.method4356(Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize], (String)null);
							IntHashTable.method10049(var6, var3, 1, var4, var10);
							return 1;
						} else if (var0 == 8012) {
							var9 = VarcInt.method4356(Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize], (String)null);
							FriendSystem.method1659(var9);
							return 1;
						} else if (var0 == 8013) {
							var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
							var8 = VarcInt.method4356(Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize], (String)null);
							VarpDefinition.method4310(var8, var3);
							return 1;
						} else if (var0 == 8014) {
							class408.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
							var5 = VarcInt.method4356(Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize], (String)null);
							class380.method8145(var5, var3, var4);
							return 1;
						} else if (var0 == 8015) {
							class408.Interpreter_intStackSize -= 3;
							var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
							var10 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 2];
							SecureRandomFuture.Interpreter_objectStackSize -= 2;
							var6 = VarcInt.method4356(Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize], (String)null);
							var7 = VarcInt.method4356(Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize + 1], (String)null);
							ItemLayer.method5257(var6, var7, var3, var4, var10);
							return 1;
						} else if (var0 == 8016) {
							var9 = VarcInt.method4356(Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize], (String)null);
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = (int)class6.method43(var9);
							return 1;
						} else if (var0 == 8017) {
							var9 = VarcInt.method4356(Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize], (String)null);
							var4 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = class236.method5212(var9, var4);
							return 1;
						} else {
							String var17;
							if (var0 == 8018) {
								SecureRandomFuture.Interpreter_objectStackSize -= 2;
								String var16 = (String)Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize];
								var17 = (String)Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize + 1];
								Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = class233.method5127(var16, var17);
								return 1;
							} else if (var0 == 8019) {
								SecureRandomFuture.Interpreter_objectStackSize -= 2;
								var9 = VarcInt.method4356(Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize], (String)null);
								var17 = (String)Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize + 1];
								Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = class383.method8350(var9, var17);
								return 1;
							} else {
								EnumComposition var12;
								if (var0 == 8020) {
									class408.Interpreter_intStackSize -= 2;
									var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
									var4 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
									var12 = class108.getEnum(var4);
									if (var3 != var12.inputType) {
										throw new RuntimeException();
									} else {
										Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var12.method4427();
										return 1;
									}
								} else if (var0 == 8021) {
									class408.Interpreter_intStackSize -= 2;
									var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
									var4 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
									var12 = class108.getEnum(var4);
									if (var3 != var12.outputType) {
										throw new RuntimeException();
									} else {
										Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var12.method4428();
										return 1;
									}
								} else if (var0 == 8022) {
									class408.Interpreter_intStackSize -= 3;
									var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
									var4 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
									var10 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 2];
									if (var10 < var4) {
										var10 = var4;
									}

									if (var4 >= 0 && var4 <= 5000 && var10 >= 0 && var10 <= 5000) {
										if (var3 == 115) {
											Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = new DynamicArray(class586.field5939, "", var4, var10);
										} else if (var3 != 105 && var3 != 49) {
											Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = new DynamicArray(class586.field5937, -1, var4, var10);
										} else {
											Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = new DynamicArray(class586.field5937, 0, var4, var10);
										}

										return 1;
									} else {
										throw new RuntimeException();
									}
								} else if (var0 == 8023) {
									var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
									var8 = VarcInt.method4356(Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize], (String)null);
									if (var3 >= 0 && var3 <= 5000) {
										var8.method10655(var3);
										return 1;
									} else {
										throw new RuntimeException();
									}
								} else if (var0 == 8024) {
									var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
									Object var15 = class39.method816(var3);
									var5 = VarcInt.method4356(Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize], (String)null);
									ProjectionCoord.method9358(var5, var5.method10652(), var15);
									return 1;
								} else {
									Object var11;
									if (var0 == 8025) {
										class408.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
										var4 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
										var11 = class39.method816(var4);
										var6 = VarcInt.method4356(Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize], (String)null);
										ProjectionCoord.method9358(var6, var3, var11);
										return 1;
									} else if (var0 == 8026) {
										var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
										var8 = VarcInt.method4356(Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize], (String)null);
										var11 = GrandExchangeEvent.method8775(var8, var3);
										SwapSongTask.method9926(var8.field5584, var11);
										return 1;
									} else if (var0 == 8027) {
										SecureRandomFuture.Interpreter_objectStackSize -= 2;
										var9 = VarcInt.method4356(Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize], (String)null);
										var8 = VarcInt.method4356(Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize + 1], (String)null);
										GrandExchangeOfferNameComparator.method8737(var9, var8, var9.method10652());
										return 1;
									} else if (var0 == 8028) {
										var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
										SecureRandomFuture.Interpreter_objectStackSize -= 2;
										var8 = VarcInt.method4356(Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize], (String)null);
										var5 = VarcInt.method4356(Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize + 1], (String)null);
										GrandExchangeOfferNameComparator.method8737(var8, var5, var3);
										return 1;
									} else if (var0 == 8029) {
										class408.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
										var4 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
										var5 = VarcInt.method4356(Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize], (String)null);
										SpotAnimationDefinition.method4573(var5, var3, var4);
										return 1;
									} else {
										return 2;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILjava/lang/String;Ljava/lang/String;IIB)V",
		garbageValue = "-32"
	)
	@Export("menuAction")
	public static final void menuAction(int var0, int var1, int var2, int var3, int var4, int var5, String var6, String var7, int var8, int var9) {
		WorldView var10 = Client.worldViewManager.getWorldView(var5);
		if (var10 != null) {
			int var11 = var10.baseX;
			int var12 = var10.baseY;
			IndexedObjectSet var13 = var10.npcs;
			IndexedObjectSet var14 = var10.players;
			if (var2 >= 2000) {
				var2 -= 2000;
			}

			PacketBufferNode var15;
			if (var2 == 1) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = ReflectionCheck.getPacketBufferNode(ClientPacket.OPLOCU, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeIntLE(class480.field5366);
				var15.packetBuffer.writeShort(var12 + var1);
				var15.packetBuffer.writeInt(ModelData0.field3174);
				var15.packetBuffer.writeShort(var0 + var11);
				var15.packetBuffer.writeShort(class113.field1483);
				var15.packetBuffer.writeIntLE(var3);
				Client.packetWriter.addNode(var15);
			} else if (var2 == 2) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = ReflectionCheck.getPacketBufferNode(ClientPacket.OPLOCT, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShort(var12 + var1);
				var15.packetBuffer.writeShortAdd(Client.selectedSpellItemId);
				var15.packetBuffer.writeShort(var0 + var11);
				var15.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeIntIME(Skills.selectedSpellWidget);
				var15.packetBuffer.writeShortAdd(Client.selectedSpellChildIndex);
				var15.packetBuffer.writeShortAdd(var3);
				Client.packetWriter.addNode(var15);
			} else if (var2 == 3) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = ReflectionCheck.getPacketBufferNode(ClientPacket.OPLOC1, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShortAdd(var0 + var11);
				var15.packetBuffer.writeShortAddLE(var12 + var1);
				var15.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeIntLE(var3);
				Client.packetWriter.addNode(var15);
			} else if (var2 == 4) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = ReflectionCheck.getPacketBufferNode(ClientPacket.OPLOC2, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeIntLE(var0 + var11);
				var15.packetBuffer.writeIntLE(var12 + var1);
				var15.packetBuffer.writeShortLE(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeShort(var3);
				Client.packetWriter.addNode(var15);
			} else if (var2 == 5) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = ReflectionCheck.getPacketBufferNode(ClientPacket.OPLOC3, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShortAddLE(var12 + var1);
				var15.packetBuffer.writeShortAddLE(var3);
				var15.packetBuffer.writeIntLE(var0 + var11);
				var15.packetBuffer.writeShortLE(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				Client.packetWriter.addNode(var15);
			} else if (var2 == 6) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = ReflectionCheck.getPacketBufferNode(ClientPacket.OPLOC4, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShortAdd(var0 + var11);
				var15.packetBuffer.writeShortAddLE(var3);
				var15.packetBuffer.writeShortAdd(var12 + var1);
				var15.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				Client.packetWriter.addNode(var15);
			} else {
				PacketBufferNode var16;
				NPC var20;
				if (var2 == 7) {
					var20 = (NPC)var13.get((long)var3);
					if (var20 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var16 = ReflectionCheck.getPacketBufferNode(ClientPacket.OPNPCU, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeShort(var3);
						var16.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var16.packetBuffer.writeIntLE(class480.field5366);
						var16.packetBuffer.writeShortAddLE(class113.field1483);
						var16.packetBuffer.method11690(ModelData0.field3174);
						Client.packetWriter.addNode(var16);
					}
				} else if (var2 == 8) {
					var20 = (NPC)var13.get((long)var3);
					if (var20 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var16 = ReflectionCheck.getPacketBufferNode(ClientPacket.OPNPCT, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeIntLE(Client.selectedSpellItemId);
						var16.packetBuffer.method11727(Skills.selectedSpellWidget);
						var16.packetBuffer.writeShortAddLE(Client.selectedSpellChildIndex);
						var16.packetBuffer.writeShortLE(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var16.packetBuffer.writeIntLE(var3);
						Client.packetWriter.addNode(var16);
					}
				} else if (var2 == 9) {
					var20 = (NPC)var13.get((long)var3);
					if (var20 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var16 = ReflectionCheck.getPacketBufferNode(ClientPacket.OPNPC1, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var16.packetBuffer.writeShortAddLE(var3);
						Client.packetWriter.addNode(var16);
					}
				} else if (var2 == 10) {
					var20 = (NPC)var13.get((long)var3);
					if (var20 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var16 = ReflectionCheck.getPacketBufferNode(ClientPacket.OPNPC2, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeShort(var3);
						var16.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						Client.packetWriter.addNode(var16);
					}
				} else if (var2 == 11) {
					var20 = (NPC)var13.get((long)var3);
					if (var20 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var16 = ReflectionCheck.getPacketBufferNode(ClientPacket.OPNPC3, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var16.packetBuffer.writeShortAddLE(var3);
						Client.packetWriter.addNode(var16);
					}
				} else if (var2 == 12) {
					var20 = (NPC)var13.get((long)var3);
					if (var20 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var16 = ReflectionCheck.getPacketBufferNode(ClientPacket.OPNPC4, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeIntLE(var3);
						var16.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						Client.packetWriter.addNode(var16);
					}
				} else if (var2 == 13) {
					var20 = (NPC)var13.get((long)var3);
					if (var20 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var16 = ReflectionCheck.getPacketBufferNode(ClientPacket.OPNPC5, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeShortAdd(var3);
						var16.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						Client.packetWriter.addNode(var16);
					}
				} else {
					Player var22;
					if (var2 == 14) {
						var22 = (Player)var14.get((long)var3);
						if (var22 != null) {
							Client.mouseCrossX = var8;
							Client.mouseCrossY = var9;
							Client.mouseCrossColor = 2;
							Client.mouseCrossState = 0;
							Client.destinationX = var0;
							Client.destinationY = var1;
							var16 = ReflectionCheck.getPacketBufferNode(ClientPacket.OPPLAYERU, Client.packetWriter.isaacCipher);
							var16.packetBuffer.method11690(ModelData0.field3174);
							var16.packetBuffer.writeIntLE(var3);
							var16.packetBuffer.writeIntLE(class113.field1483);
							var16.packetBuffer.writeShortAdd(class480.field5366);
							var16.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
							Client.packetWriter.addNode(var16);
						}
					} else if (var2 == 15) {
						var22 = (Player)var14.get((long)var3);
						if (var22 != null) {
							Client.mouseCrossX = var8;
							Client.mouseCrossY = var9;
							Client.mouseCrossColor = 2;
							Client.mouseCrossState = 0;
							Client.destinationX = var0;
							Client.destinationY = var1;
							var16 = ReflectionCheck.getPacketBufferNode(ClientPacket.OPPLAYERT, Client.packetWriter.isaacCipher);
							var16.packetBuffer.writeShortAdd(Client.selectedSpellChildIndex);
							var16.packetBuffer.writeShort(var3);
							var16.packetBuffer.writeIntIME(Skills.selectedSpellWidget);
							var16.packetBuffer.writeIntLE(Client.selectedSpellItemId);
							var16.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
							Client.packetWriter.addNode(var16);
						}
					} else if (var2 == 16) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = ReflectionCheck.getPacketBufferNode(ClientPacket.OPOBJU, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeIntIME(ModelData0.field3174);
						var15.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var15.packetBuffer.writeIntLE(class480.field5366);
						var15.packetBuffer.writeShort(var0 + var11);
						var15.packetBuffer.writeShort(var12 + var1);
						var15.packetBuffer.writeShortAddLE(class113.field1483);
						var15.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 17) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = ReflectionCheck.getPacketBufferNode(ClientPacket.OPOBJT, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeIntLE(var0 + var11);
						var15.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var15.packetBuffer.writeIntLE(Client.selectedSpellItemId);
						var15.packetBuffer.writeShortAddLE(var12 + var1);
						var15.packetBuffer.writeShort(var3);
						var15.packetBuffer.writeIntIME(Skills.selectedSpellWidget);
						var15.packetBuffer.writeIntLE(Client.selectedSpellChildIndex);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 18) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = ReflectionCheck.getPacketBufferNode(ClientPacket.OPOBJ1, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeShortLE(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var15.packetBuffer.writeShortAdd(var0 + var11);
						var15.packetBuffer.writeShort(var12 + var1);
						var15.packetBuffer.writeShortAdd(var3);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 19) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = ReflectionCheck.getPacketBufferNode(ClientPacket.OPOBJ2, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeIntLE(var12 + var1);
						var15.packetBuffer.writeShort(var0 + var11);
						var15.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var15.packetBuffer.writeIntLE(var3);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 20) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = ReflectionCheck.getPacketBufferNode(ClientPacket.OPOBJ3, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeShortAdd(var0 + var11);
						var15.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var15.packetBuffer.writeIntLE(var3);
						var15.packetBuffer.writeShortAddLE(var12 + var1);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 21) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = ReflectionCheck.getPacketBufferNode(ClientPacket.OPOBJ4, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeShort(var12 + var1);
						var15.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var15.packetBuffer.writeShort(var3);
						var15.packetBuffer.writeIntLE(var0 + var11);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 22) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = ReflectionCheck.getPacketBufferNode(ClientPacket.OPOBJ5, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeShortAddLE(var3);
						var15.packetBuffer.writeIntLE(var0 + var11);
						var15.packetBuffer.writeShortAdd(var12 + var1);
						var15.packetBuffer.writeShortLE(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 23) {
						if (Client.isMenuOpen) {
							var10.scene.method5612();
						} else {
							var10.scene.menuOpen(true);
						}
					} else {
						PacketBufferNode var18;
						Widget var23;
						if (var2 == 24) {
							var23 = class226.widgetDefinition.method7728(var1);
							if (var23 != null) {
								boolean var19 = true;
								if (var23.contentType > 0) {
									var19 = class557.method10965(var23);
								}

								if (var19) {
									var18 = ReflectionCheck.getPacketBufferNode(ClientPacket.WIDGET_TYPE, Client.packetWriter.isaacCipher);
									var18.packetBuffer.writeInt(var1);
									Client.packetWriter.addNode(var18);
								}
							}
						} else {
							if (var2 == 25) {
								var23 = class226.widgetDefinition.getWidgetChild(var1, var0);
								if (var23 != null) {
									class62.method2177();
									class406.method8489(var1, var0, LoginPacket.Widget_unpackTargetMask(class191.getWidgetFlags(var23)), var4);
									Client.isItemSelected = 0;
									Client.selectedSpellActionName = ItemComposition.Widget_getSpellActionName(var23);
									if (Client.selectedSpellActionName == null) {
										Client.selectedSpellActionName = "null";
									}

									if (var23.isIf3) {
										Client.selectedSpellName = var23.dataText + class144.colorStartTag(16777215);
									} else {
										Client.selectedSpellName = class144.colorStartTag(65280) + var23.field4259 + class144.colorStartTag(16777215);
									}
								}

								return;
							}

							if (var2 == 26) {
								Login.method1967();
							} else {
								int var17;
								Widget var21;
								if (var2 == 28) {
									var15 = ReflectionCheck.getPacketBufferNode(ClientPacket.WIDGET_TYPE, Client.packetWriter.isaacCipher);
									var15.packetBuffer.writeInt(var1);
									Client.packetWriter.addNode(var15);
									var21 = class226.widgetDefinition.method7728(var1);
									if (var21 != null && var21.cs1Instructions != null && var21.cs1Instructions[0][0] == 5) {
										var17 = var21.cs1Instructions[0][1];
										Varps.Varps_main[var17] = 1 - Varps.Varps_main[var17];
										Huffman.changeGameOptions(var17);
									}
								} else if (var2 == 29) {
									var15 = ReflectionCheck.getPacketBufferNode(ClientPacket.WIDGET_TYPE, Client.packetWriter.isaacCipher);
									var15.packetBuffer.writeInt(var1);
									Client.packetWriter.addNode(var15);
									var21 = class226.widgetDefinition.method7728(var1);
									if (var21 != null && var21.cs1Instructions != null && var21.cs1Instructions[0][0] == 5) {
										var17 = var21.cs1Instructions[0][1];
										if (Varps.Varps_main[var17] != var21.cs1ComparisonValues[0]) {
											Varps.Varps_main[var17] = var21.cs1ComparisonValues[0];
											Huffman.changeGameOptions(var17);
										}
									}
								} else if (var2 == 30) {
									if (Client.meslayerContinueWidget == null) {
										HealthBarDefinition.resumePauseWidget(var1, var0);
										Client.meslayerContinueWidget = class226.widgetDefinition.getWidgetChild(var1, var0);
										class376.invalidateWidget(Client.meslayerContinueWidget);
									}
								} else if (var2 == 44) {
									var22 = (Player)var14.get((long)var3);
									if (var22 != null) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var16 = ReflectionCheck.getPacketBufferNode(ClientPacket.OPPLAYER1, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeShortLE(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										var16.packetBuffer.writeShort(var3);
										Client.packetWriter.addNode(var16);
									}
								} else if (var2 == 45) {
									var22 = (Player)var14.get((long)var3);
									if (var22 != null) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var16 = ReflectionCheck.getPacketBufferNode(ClientPacket.OPPLAYER2, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										var16.packetBuffer.writeShort(var3);
										Client.packetWriter.addNode(var16);
									}
								} else if (var2 == 46) {
									var22 = (Player)var14.get((long)var3);
									if (var22 != null) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var16 = ReflectionCheck.getPacketBufferNode(ClientPacket.OPPLAYER3, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeShortLE(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										var16.packetBuffer.writeShort(var3);
										Client.packetWriter.addNode(var16);
									}
								} else if (var2 == 47) {
									var22 = (Player)var14.get((long)var3);
									if (var22 != null) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var16 = ReflectionCheck.getPacketBufferNode(ClientPacket.OPPLAYER4, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeShort(var3);
										var16.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										Client.packetWriter.addNode(var16);
									}
								} else if (var2 == 48) {
									var22 = (Player)var14.get((long)var3);
									if (var22 != null) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var16 = ReflectionCheck.getPacketBufferNode(ClientPacket.OPPLAYER5, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeIntLE(var3);
										var16.packetBuffer.writeShortLE(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										Client.packetWriter.addNode(var16);
									}
								} else if (var2 == 49) {
									var22 = (Player)var14.get((long)var3);
									if (var22 != null) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var16 = ReflectionCheck.getPacketBufferNode(ClientPacket.OPPLAYER6, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeShort(var3);
										var16.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										Client.packetWriter.addNode(var16);
									}
								} else if (var2 == 50) {
									var22 = (Player)var14.get((long)var3);
									if (var22 != null) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var16 = ReflectionCheck.getPacketBufferNode(ClientPacket.OPPLAYER7, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeShortAdd(var3);
										var16.packetBuffer.writeShortLE(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										Client.packetWriter.addNode(var16);
									}
								} else if (var2 == 51) {
									var22 = (Player)var14.get((long)var3);
									if (var22 != null) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var16 = ReflectionCheck.getPacketBufferNode(ClientPacket.OPPLAYER8, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										var16.packetBuffer.writeShortAdd(var3);
										Client.packetWriter.addNode(var16);
									}
								} else {
									label665: {
										if (var2 != 57) {
											if (var2 == 58) {
												var23 = class226.widgetDefinition.getWidgetChild(var1, var0);
												if (var23 != null) {
													if (var23.field4326 != null) {
														ScriptEvent var25 = new ScriptEvent();
														var25.widget = var23;
														var25.opIndex = var3;
														var25.targetName = var7;
														var25.args = var23.field4326;
														class141.runScriptEvent(var25);
													}

													var16 = ReflectionCheck.getPacketBufferNode(ClientPacket.IF_BUTTONT, Client.packetWriter.isaacCipher);
													var16.packetBuffer.method11727(var1);
													var16.packetBuffer.writeShortAdd(Client.selectedSpellChildIndex);
													var16.packetBuffer.writeShortAddLE(var0);
													var16.packetBuffer.writeShortAddLE(Client.selectedSpellItemId);
													var16.packetBuffer.method11727(Skills.selectedSpellWidget);
													var16.packetBuffer.writeIntLE(var4);
													Client.packetWriter.addNode(var16);
												}
												break label665;
											}

											if (var2 == 60) {
												Client.mouseCrossX = var8;
												Client.mouseCrossY = var9;
												Client.mouseCrossColor = 1;
												Client.mouseCrossState = 0;
												Client.field377 = var3;
												Client.field536 = 30;
												var15 = ReflectionCheck.getPacketBufferNode(ClientPacket.SET_HEADING, Client.packetWriter.isaacCipher);
												var15.packetBuffer.writeByteNeg(var3);
												Client.packetWriter.addNode(var15);
												break label665;
											}

											WorldEntity var26;
											if (var2 == 61) {
												var26 = (WorldEntity)var10.worldEntities.get((long)var3);
												if (var26 != null) {
													Client.mouseCrossX = var8;
													Client.mouseCrossY = var9;
													Client.mouseCrossColor = 2;
													Client.mouseCrossState = 0;
													Client.destinationX = var0;
													Client.destinationY = var1;
													var16 = ReflectionCheck.getPacketBufferNode(ClientPacket.OPWORLDENTITYU, Client.packetWriter.isaacCipher);
													var16.packetBuffer.writeIntLE(class113.field1483);
													var16.packetBuffer.writeShort(class480.field5366);
													var16.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
													var16.packetBuffer.writeShort(var3);
													var16.packetBuffer.writeInt(ModelData0.field3174);
													Client.packetWriter.addNode(var16);
												}
												break label665;
											}

											if (var2 == 62) {
												var26 = (WorldEntity)var10.worldEntities.get((long)var3);
												if (var26 != null) {
													Client.mouseCrossX = var8;
													Client.mouseCrossY = var9;
													Client.mouseCrossColor = 2;
													Client.mouseCrossState = 0;
													Client.destinationX = var0;
													Client.destinationY = var1;
													var16 = ReflectionCheck.getPacketBufferNode(ClientPacket.OPWORLDENTITYT, Client.packetWriter.isaacCipher);
													var16.packetBuffer.writeShortAddLE(Client.selectedSpellItemId);
													var16.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
													var16.packetBuffer.method11727(Skills.selectedSpellWidget);
													var16.packetBuffer.writeIntLE(var3);
													var16.packetBuffer.writeShortAdd(Client.selectedSpellChildIndex);
													Client.packetWriter.addNode(var16);
												}
												break label665;
											}

											if (var2 == 63) {
												Client.mouseCrossX = var8;
												Client.mouseCrossY = var9;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												Client.destinationX = var0;
												Client.destinationY = var1;
												var15 = ReflectionCheck.getPacketBufferNode(ClientPacket.OPWORLDENTITY1, Client.packetWriter.isaacCipher);
												var15.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
												var15.packetBuffer.writeShortAdd(var3);
												Client.packetWriter.addNode(var15);
												break label665;
											}

											if (var2 == 64) {
												Client.mouseCrossX = var8;
												Client.mouseCrossY = var9;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												Client.destinationX = var0;
												Client.destinationY = var1;
												var15 = ReflectionCheck.getPacketBufferNode(ClientPacket.OPWORLDENTITY2, Client.packetWriter.isaacCipher);
												var15.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
												var15.packetBuffer.writeIntLE(var3);
												Client.packetWriter.addNode(var15);
												break label665;
											}

											if (var2 == 65) {
												Client.mouseCrossX = var8;
												Client.mouseCrossY = var9;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												Client.destinationX = var0;
												Client.destinationY = var1;
												var15 = ReflectionCheck.getPacketBufferNode(ClientPacket.OPWORLDENTITY3, Client.packetWriter.isaacCipher);
												var15.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
												var15.packetBuffer.writeIntLE(var3);
												Client.packetWriter.addNode(var15);
												break label665;
											}

											if (var2 == 66) {
												Client.mouseCrossX = var8;
												Client.mouseCrossY = var9;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												Client.destinationX = var0;
												Client.destinationY = var1;
												var15 = ReflectionCheck.getPacketBufferNode(ClientPacket.OPWORLDENTITY4, Client.packetWriter.isaacCipher);
												var15.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
												var15.packetBuffer.writeShort(var3);
												Client.packetWriter.addNode(var15);
												break label665;
											}

											if (var2 == 67) {
												Client.mouseCrossX = var8;
												Client.mouseCrossY = var9;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												Client.destinationX = var0;
												Client.destinationY = var1;
												var15 = ReflectionCheck.getPacketBufferNode(ClientPacket.OPWORLDENTITY5, Client.packetWriter.isaacCipher);
												var15.packetBuffer.writeShortAdd(var3);
												var15.packetBuffer.writeShortLE(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
												Client.packetWriter.addNode(var15);
												break label665;
											}

											if (var2 == 1001) {
												Client.mouseCrossX = var8;
												Client.mouseCrossY = var9;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												Client.destinationX = var0;
												Client.destinationY = var1;
												var15 = ReflectionCheck.getPacketBufferNode(ClientPacket.OPLOC5, Client.packetWriter.isaacCipher);
												var15.packetBuffer.writeShort(var0 + var11);
												var15.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
												var15.packetBuffer.writeShortAdd(var12 + var1);
												var15.packetBuffer.writeShortAdd(var3);
												Client.packetWriter.addNode(var15);
												break label665;
											}

											if (var2 == 1002) {
												Client.mouseCrossX = var8;
												Client.mouseCrossY = var9;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												var15 = ReflectionCheck.getPacketBufferNode(ClientPacket.OPLOCE, Client.packetWriter.isaacCipher);
												var15.packetBuffer.writeIntLE(var3);
												Client.packetWriter.addNode(var15);
												break label665;
											}

											if (var2 == 1003) {
												Client.mouseCrossX = var8;
												Client.mouseCrossY = var9;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												var20 = (NPC)var13.get((long)var3);
												if (var20 != null) {
													NPCComposition var24 = var20.definition;
													if (var24.transforms != null) {
														var24 = var24.transform();
													}

													if (var24 != null) {
														var18 = ReflectionCheck.getPacketBufferNode(ClientPacket.OPNPCE, Client.packetWriter.isaacCipher);
														var18.packetBuffer.writeShortAdd(var24.id);
														Client.packetWriter.addNode(var18);
													}
												}
												break label665;
											}

											if (var2 == 1004) {
												Client.mouseCrossX = var8;
												Client.mouseCrossY = var9;
												Client.mouseCrossColor = 2;
												Client.mouseCrossState = 0;
												var15 = ReflectionCheck.getPacketBufferNode(ClientPacket.OPOBJE, Client.packetWriter.isaacCipher);
												var15.packetBuffer.writeShort(var3);
												var15.packetBuffer.writeShortAddLE(var12 + var1);
												var15.packetBuffer.writeShortAddLE(var0 + var11);
												Client.packetWriter.addNode(var15);
												break label665;
											}

											if (var2 != 1007) {
												if (var2 != 1009 && var2 != 1008 && var2 != 1012 && var2 != 1010 && var2 != 1011) {
													if (var2 == 1013) {
														Client.mouseCrossX = var8;
														Client.mouseCrossY = var9;
														Client.mouseCrossColor = 2;
														Client.mouseCrossState = 0;
														var15 = ReflectionCheck.getPacketBufferNode(ClientPacket.OPWORLDENTITYE, Client.packetWriter.isaacCipher);
														var15.packetBuffer.writeShort(var3);
														Client.packetWriter.addNode(var15);
													}
												} else {
													Skills.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1));
												}
												break label665;
											}
										}

										var23 = class226.widgetDefinition.getWidgetChild(var1, var0);
										if (var23 != null) {
											FontName.widgetDefaultMenuAction(var3, var1, var0, var4, var7);
										}
									}
								}
							}
						}
					}
				}
			}

			if (Client.isItemSelected != 0) {
				Client.isItemSelected = 0;
				class376.invalidateWidget(class226.widgetDefinition.method7728(ModelData0.field3174));
			}

			if (Client.isSpellSelected) {
				class62.method2177();
			}

		}
	}
}
