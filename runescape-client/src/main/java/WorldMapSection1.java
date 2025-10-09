import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lf")
@Implements("WorldMapSection1")
public class WorldMapSection1 implements WorldMapSection {
	@ObfuscatedName("ra")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	static Model field3493;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1371836951
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1133633067
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1321601809
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1764650555
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1644312621
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1683947721
	)
	@Export("regionEndY")
	int regionEndY;

	WorldMapSection1() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Llh;I)V",
		garbageValue = "-321528483"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.regionEndX) {
			var1.regionLowX = this.regionEndX;
		}

		if (var1.regionHighX < this.regionEndX) {
			var1.regionHighX = this.regionEndX;
		}

		if (var1.regionLowY > this.regionEndY) {
			var1.regionLowY = this.regionEndY;
		}

		if (var1.regionHighY < this.regionEndY) {
			var1.regionHighY = this.regionEndY;
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-1647486588"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.minPlane + this.planes) {
			return var2 >> 6 == this.regionStartX && var3 >> 6 == this.regionStartY;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "16374902"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 == this.regionEndX && var2 >> 6 == this.regionEndY;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "-10"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.regionEndX * 64 - this.regionStartX * 64 + var2, var3 + (this.regionEndY * 64 - this.regionStartY * 64)};
			return var4;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)Lny;",
		garbageValue = "126893021"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.regionStartX * 64 - this.regionEndX * 64 + var1;
			int var4 = this.regionStartY * 64 - this.regionEndY * 64 + var2;
			return new Coord(this.minPlane, var3, var4);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lwj;B)V",
		garbageValue = "-7"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte();
		this.planes = var1.readUnsignedByte();
		this.regionStartX = var1.readUnsignedShort();
		this.regionStartY = var1.readUnsignedShort();
		this.regionEndX = var1.readUnsignedShort();
		this.regionEndY = var1.readUnsignedShort();
		this.postRead();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "603758088"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(ILcj;ZB)I",
		garbageValue = "51"
	)
	static int method6874(int var0, Script var1, boolean var2) {
		DynamicArray var8;
		DynamicArray var9;
		if (var0 == 8000) {
			Message.Interpreter_objectStackSize -= 2;
			var9 = class196.method4453(Interpreter.Interpreter_objectStack[Message.Interpreter_objectStackSize], (String)null);
			var8 = (DynamicArray)Interpreter.Interpreter_objectStack[Message.Interpreter_objectStackSize + 1];
			ArchiveDiskAction.method8324(var9, var8);
			return 1;
		} else {
			int var3;
			int var4;
			DynamicArray var5;
			if (var0 == 8001) {
				UrlRequest.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
				var5 = class196.method4453(Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize], (String)null);
				class167.method4102(var5, var3, var4);
				return 1;
			} else if (var0 == 8002) {
				var9 = (DynamicArray)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize];
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var9 == null ? 1 : 0;
				return 1;
			} else if (var0 == 8003) {
				var9 = (DynamicArray)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize];
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var9 != null ? var9.method10433() : 0;
				return 1;
			} else if (var0 == 8004) {
				Message.Interpreter_objectStackSize -= 2;
				var9 = (DynamicArray)Interpreter.Interpreter_objectStack[Message.Interpreter_objectStackSize];
				var8 = (DynamicArray)Interpreter.Interpreter_objectStack[Message.Interpreter_objectStackSize + 1];
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = ChatChannel.method2054(var9, var8);
				return 1;
			} else {
				DynamicArray var7;
				int var10;
				Object var13;
				if (var0 == 8005) {
					UrlRequest.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
					var10 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 2];
					var13 = WorldMap.method10995(var10);
					var7 = (DynamicArray)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize];
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var7 != null ? class526.method10592(var7, var13, var3, var4) : -1;
					return 1;
				} else if (var0 == 8006) {
					UrlRequest.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
					var10 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 2];
					var13 = WorldMap.method10995(var10);
					var7 = (DynamicArray)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize];
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var7 != null ? WorldMapLabelSize.method6408(var7, var13, var3, var4) : -1;
					return 1;
				} else if (var0 == 8007) {
					UrlRequest.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
					var10 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 2];
					var13 = WorldMap.method10995(var10);
					var7 = (DynamicArray)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize];
					Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var7 != null ? class327.method7042(var7, var13, var3, var4) : 0;
					return 1;
				} else {
					String var14;
					if (var0 == 8008) {
						var9 = class196.method4453(Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize], (String)null);
						var4 = class470.method9706(var9);
						if (var9.field5571 == class572.field5879) {
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var4 >= 0 ? var9.method10430()[var4] : -1;
						} else {
							if (var9.field5571 != class572.field5877) {
								throw new IllegalStateException();
							}

							var14 = (String)((String)(var4 >= 0 ? var9.method10428()[var4] : null));
							Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var14 != null ? var14 : "";
						}

						return 1;
					} else if (var0 == 8009) {
						var9 = class196.method4453(Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize], (String)null);
						var4 = class304.method6849(var9);
						if (var9.field5571 == class572.field5879) {
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var4 >= 0 ? var9.method10430()[var4] : -1;
						} else {
							if (var9.field5571 != class572.field5877) {
								throw new IllegalStateException();
							}

							var14 = (String)((String)(var4 >= 0 ? var9.method10428()[var4] : null));
							Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var14 != null ? var14 : "";
						}

						return 1;
					} else if (var0 == 8010) {
						UrlRequest.Interpreter_intStackSize -= 3;
						var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
						var4 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
						var10 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 2];
						var13 = WorldMap.method10995(var10);
						var7 = class196.method4453(Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize], (String)null);
						class331.method7061(var7, var13, var3, var4);
						return 1;
					} else {
						DynamicArray var6;
						if (var0 == 8011) {
							UrlRequest.Interpreter_intStackSize -= 3;
							var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
							var10 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 2];
							var6 = class196.method4453(Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize], (String)null);
							class402.method8317(var6, var3, 1, var4, var10);
							return 1;
						} else if (var0 == 8012) {
							var9 = class196.method4453(Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize], (String)null);
							class391.method8225(var9);
							return 1;
						} else if (var0 == 8013) {
							var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
							var8 = class196.method4453(Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize], (String)null);
							class263.method5975(var8, var3);
							return 1;
						} else if (var0 == 8014) {
							UrlRequest.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
							var5 = class196.method4453(Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize], (String)null);
							GrandExchangeOfferOwnWorldComparator.method792(var5, var3, var4);
							return 1;
						} else if (var0 == 8015) {
							UrlRequest.Interpreter_intStackSize -= 3;
							var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
							var10 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 2];
							Message.Interpreter_objectStackSize -= 2;
							var6 = class196.method4453(Interpreter.Interpreter_objectStack[Message.Interpreter_objectStackSize], (String)null);
							var7 = class196.method4453(Interpreter.Interpreter_objectStack[Message.Interpreter_objectStackSize + 1], (String)null);
							class385.method8204(var6, var7, var3, var4, var10);
							return 1;
						} else if (var0 == 8016) {
							var9 = class196.method4453(Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize], (String)null);
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = (int)ParamComposition.method4595(var9);
							return 1;
						} else if (var0 == 8017) {
							var9 = class196.method4453(Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize], (String)null);
							var4 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = class389.method8214(var9, var4);
							return 1;
						} else {
							String var17;
							if (var0 == 8018) {
								Message.Interpreter_objectStackSize -= 2;
								String var16 = (String)Interpreter.Interpreter_objectStack[Message.Interpreter_objectStackSize];
								var17 = (String)Interpreter.Interpreter_objectStack[Message.Interpreter_objectStackSize + 1];
								Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = class486.method9898(var16, var17);
								return 1;
							} else if (var0 == 8019) {
								Message.Interpreter_objectStackSize -= 2;
								var9 = class196.method4453(Interpreter.Interpreter_objectStack[Message.Interpreter_objectStackSize], (String)null);
								var17 = (String)Interpreter.Interpreter_objectStack[Message.Interpreter_objectStackSize + 1];
								Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = FloatProjection.method5429(var9, var17);
								return 1;
							} else {
								EnumComposition var12;
								if (var0 == 8020) {
									UrlRequest.Interpreter_intStackSize -= 2;
									var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
									var4 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
									var12 = class195.getEnum(var4);
									if (var3 != var12.inputType) {
										throw new RuntimeException();
									} else {
										Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var12.method4339();
										return 1;
									}
								} else if (var0 == 8021) {
									UrlRequest.Interpreter_intStackSize -= 2;
									var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
									var4 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
									var12 = class195.getEnum(var4);
									if (var3 != var12.outputType) {
										throw new RuntimeException();
									} else {
										Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var12.method4351();
										return 1;
									}
								} else if (var0 == 8022) {
									UrlRequest.Interpreter_intStackSize -= 3;
									var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
									var4 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
									var10 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 2];
									if (var10 < var4) {
										var10 = var4;
									}

									if (var4 >= 0 && var4 <= 5000 && var10 >= 0 && var10 <= 5000) {
										if (var3 == 115) {
											Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = new DynamicArray(class572.field5877, "", var4, var10);
										} else if (var3 != 105 && var3 != 49) {
											Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = new DynamicArray(class572.field5879, -1, var4, var10);
										} else {
											Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = new DynamicArray(class572.field5879, 0, var4, var10);
										}

										return 1;
									} else {
										throw new RuntimeException();
									}
								} else if (var0 == 8023) {
									var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
									var8 = class196.method4453(Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize], (String)null);
									if (var3 >= 0 && var3 <= 5000) {
										var8.method10456(var3);
										return 1;
									} else {
										throw new RuntimeException();
									}
								} else if (var0 == 8024) {
									var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
									Object var15 = WorldMap.method10995(var3);
									var5 = class196.method4453(Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize], (String)null);
									class377.method8176(var5, var5.method10433(), var15);
									return 1;
								} else {
									Object var11;
									if (var0 == 8025) {
										UrlRequest.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
										var4 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
										var11 = WorldMap.method10995(var4);
										var6 = class196.method4453(Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize], (String)null);
										class377.method8176(var6, var3, var11);
										return 1;
									} else if (var0 == 8026) {
										var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
										var8 = class196.method4453(Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize], (String)null);
										var11 = class132.method3673(var8, var3);
										MoveSpeed.method6336(var8.field5571, var11);
										return 1;
									} else if (var0 == 8027) {
										Message.Interpreter_objectStackSize -= 2;
										var9 = class196.method4453(Interpreter.Interpreter_objectStack[Message.Interpreter_objectStackSize], (String)null);
										var8 = class196.method4453(Interpreter.Interpreter_objectStack[Message.Interpreter_objectStackSize + 1], (String)null);
										WorldMapCacheName.method6907(var9, var8, var9.method10433());
										return 1;
									} else if (var0 == 8028) {
										var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
										Message.Interpreter_objectStackSize -= 2;
										var8 = class196.method4453(Interpreter.Interpreter_objectStack[Message.Interpreter_objectStackSize], (String)null);
										var5 = class196.method4453(Interpreter.Interpreter_objectStack[Message.Interpreter_objectStackSize + 1], (String)null);
										WorldMapCacheName.method6907(var8, var5, var3);
										return 1;
									} else if (var0 == 8029) {
										UrlRequest.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
										var4 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
										var5 = class196.method4453(Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize], (String)null);
										GrandExchangeEvent.method8573(var5, var3, var4);
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
}
