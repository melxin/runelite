import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wn")
public class class576 {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1802080819
	)
	final int field5676;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1856428221
	)
	final int field5675;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1259741417
	)
	final int field5674;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -416978369
	)
	final int field5680;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1660990085
	)
	final int field5678;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1776427703
	)
	final int field5679;

	class576(int var1, int var2, int var3, int var4) {
		this.field5676 = var1;
		this.field5675 = var2;
		this.field5678 = var3;
		this.field5679 = var4;
		this.field5674 = var1 / 2;
		this.field5680 = var2 / 2;
	}

	public String toString() {
		return String.format("%dx%d (offset %d,%d)", this.field5676, this.field5675, this.field5678, this.field5679);
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(ILcr;ZI)I",
		garbageValue = "287206824"
	)
	static int method10779(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		class509 var8;
		class509 var9;
		if (var0 == 8000) {
			if (Client.field434 >= 5) {
				class175.Interpreter_stringStackSize -= 2;
				var9 = class376.method7915(Interpreter.Interpreter_stringStack[class175.Interpreter_stringStackSize], (String)null);
				var8 = (class509)Interpreter.Interpreter_stringStack[class175.Interpreter_stringStackSize + 1];
				GrandExchangeOfferWorldComparator.method8233(var9, var8);
			} else {
				--Interpreter.Interpreter_intStackSize;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_arrayLengths[var3];
				MusicPatchPcmStream.method7142(Interpreter.Interpreter_arrays[var3], new int[var4], 0, var4 - 1);
			}

			return 1;
		} else {
			class509 var5;
			int var10;
			if (var0 == 8001) {
				if (Client.field434 >= 5) {
					Interpreter.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					var5 = class376.method7915(Interpreter.Interpreter_stringStack[--class175.Interpreter_stringStackSize], (String)null);
					SongTask.method9272(var5, var3, var4);
				} else {
					Interpreter.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
					int var11 = Interpreter.Interpreter_arrayLengths[var3];
					if (var11 <= 1) {
						return 1;
					}

					class470.method9327(Interpreter.Interpreter_arrays[var3], var11, var4, var10);
				}

				return 1;
			} else if (var0 == 8002) {
				var9 = (class509)Interpreter.Interpreter_stringStack[--class175.Interpreter_stringStackSize];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 == null ? 1 : 0;
				return 1;
			} else if (var0 == 8003) {
				var9 = (class509)Interpreter.Interpreter_stringStack[--class175.Interpreter_stringStackSize];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 != null ? var9.method9937() : 0;
				return 1;
			} else if (var0 == 8004) {
				class175.Interpreter_stringStackSize -= 2;
				var9 = (class509)Interpreter.Interpreter_stringStack[class175.Interpreter_stringStackSize];
				var8 = (class509)Interpreter.Interpreter_stringStack[class175.Interpreter_stringStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class225.method4751(var9, var8);
				return 1;
			} else {
				class509 var7;
				Object var14;
				if (var0 == 8005) {
					Interpreter.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
					var14 = PlayerType.method7974(var10);
					var7 = (class509)Interpreter.Interpreter_stringStack[--class175.Interpreter_stringStackSize];
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? UserComparator5.method3406(var7, var14, var3, var4) : -1;
					return 1;
				} else if (var0 == 8006) {
					Interpreter.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
					var14 = PlayerType.method7974(var10);
					var7 = (class509)Interpreter.Interpreter_stringStack[--class175.Interpreter_stringStackSize];
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? Strings.method7954(var7, var14, var3, var4) : -1;
					return 1;
				} else if (var0 == 8007) {
					Interpreter.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
					var14 = PlayerType.method7974(var10);
					var7 = (class509)Interpreter.Interpreter_stringStack[--class175.Interpreter_stringStackSize];
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? WorldMapSprite.method6620(var7, var14, var3, var4) : 0;
					return 1;
				} else {
					String var15;
					if (var0 == 8008) {
						var9 = class376.method7915(Interpreter.Interpreter_stringStack[--class175.Interpreter_stringStackSize], (String)null);
						var4 = class448.method8880(var9);
						if (var9.field5288 == class563.field5600) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 >= 0 ? var9.method9965()[var4] : -1;
						} else {
							if (var9.field5288 != class563.field5595) {
								throw new IllegalStateException();
							}

							var15 = (String)((String)(var4 >= 0 ? var9.method9936()[var4] : null));
							Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = var15 != null ? var15 : "";
						}

						return 1;
					} else if (var0 == 8009) {
						var9 = class376.method7915(Interpreter.Interpreter_stringStack[--class175.Interpreter_stringStackSize], (String)null);
						var4 = class311.method6762(var9);
						if (var9.field5288 == class563.field5600) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 >= 0 ? var9.method9965()[var4] : -1;
						} else {
							if (var9.field5288 != class563.field5595) {
								throw new IllegalStateException();
							}

							var15 = (String)((String)(var4 >= 0 ? var9.method9936()[var4] : null));
							Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = var15 != null ? var15 : "";
						}

						return 1;
					} else if (var0 == 8010) {
						Interpreter.Interpreter_intStackSize -= 3;
						var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
						var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
						var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
						var14 = PlayerType.method7974(var10);
						var7 = class376.method7915(Interpreter.Interpreter_stringStack[--class175.Interpreter_stringStackSize], (String)null);
						class218.method4698(var7, var14, var3, var4);
						return 1;
					} else {
						class509 var6;
						if (var0 == 8011) {
							Interpreter.Interpreter_intStackSize -= 3;
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
							var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
							var6 = class376.method7915(Interpreter.Interpreter_stringStack[--class175.Interpreter_stringStackSize], (String)null);
							HttpAuthenticationHeader.method9363(var6, var3, 1, var4, var10);
							return 1;
						} else if (var0 == 8012) {
							var9 = class376.method7915(Interpreter.Interpreter_stringStack[--class175.Interpreter_stringStackSize], (String)null);
							BufferedNetSocket.method9830(var9);
							return 1;
						} else if (var0 == 8013) {
							var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							var8 = class376.method7915(Interpreter.Interpreter_stringStack[--class175.Interpreter_stringStackSize], (String)null);
							class499.method9798(var8, var3);
							return 1;
						} else if (var0 == 8014) {
							Interpreter.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
							var5 = class376.method7915(Interpreter.Interpreter_stringStack[--class175.Interpreter_stringStackSize], (String)null);
							WorldMapData_1.method6492(var5, var3, var4);
							return 1;
						} else if (var0 == 8015) {
							Interpreter.Interpreter_intStackSize -= 3;
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
							var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
							class175.Interpreter_stringStackSize -= 2;
							var6 = class376.method7915(Interpreter.Interpreter_stringStack[class175.Interpreter_stringStackSize], (String)null);
							var7 = class376.method7915(Interpreter.Interpreter_stringStack[class175.Interpreter_stringStackSize + 1], (String)null);
							GrandExchangeEvent.method8241(var6, var7, var3, var4, var10);
							return 1;
						} else if (var0 == 8016) {
							var9 = class376.method7915(Interpreter.Interpreter_stringStack[--class175.Interpreter_stringStackSize], (String)null);
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)WorldEntity.method9740(var9);
							return 1;
						} else if (var0 == 8017) {
							var9 = class376.method7915(Interpreter.Interpreter_stringStack[--class175.Interpreter_stringStackSize], (String)null);
							var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class275.method6021(var9, var4);
							return 1;
						} else {
							String var18;
							if (var0 == 8018) {
								class175.Interpreter_stringStackSize -= 2;
								String var17 = (String)Interpreter.Interpreter_stringStack[class175.Interpreter_stringStackSize];
								var18 = (String)Interpreter.Interpreter_stringStack[class175.Interpreter_stringStackSize + 1];
								Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = class348.method7169(var17, var18);
								return 1;
							} else if (var0 == 8019) {
								class175.Interpreter_stringStackSize -= 2;
								var9 = class376.method7915(Interpreter.Interpreter_stringStack[class175.Interpreter_stringStackSize], (String)null);
								var18 = (String)Interpreter.Interpreter_stringStack[class175.Interpreter_stringStackSize + 1];
								Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = RestClientThreadFactory.method217(var9, var18);
								return 1;
							} else {
								EnumComposition var13;
								if (var0 == 8020) {
									Interpreter.Interpreter_intStackSize -= 2;
									var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
									var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
									var13 = World.getEnum(var4);
									if (var3 != var13.inputType) {
										throw new RuntimeException();
									} else {
										Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = var13.method4107();
										return 1;
									}
								} else if (var0 == 8021) {
									Interpreter.Interpreter_intStackSize -= 2;
									var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
									var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
									var13 = World.getEnum(var4);
									if (var3 != var13.outputType) {
										throw new RuntimeException();
									} else {
										Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = var13.method4112();
										return 1;
									}
								} else if (var0 == 8022) {
									Interpreter.Interpreter_intStackSize -= 3;
									var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
									var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
									var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
									if (var10 < var4) {
										var10 = var4;
									}

									if (var4 >= 0 && var4 <= 5000 && var10 >= 0 && var10 <= 5000) {
										if (var3 == 115) {
											Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = new class509(class563.field5595, "", var4, var10);
										} else if (var3 != 105 && var3 != 49) {
											Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = new class509(class563.field5600, -1, var4, var10);
										} else {
											Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = new class509(class563.field5600, 0, var4, var10);
										}

										return 1;
									} else {
										throw new RuntimeException();
									}
								} else if (var0 == 8023) {
									var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
									var8 = class376.method7915(Interpreter.Interpreter_stringStack[--class175.Interpreter_stringStackSize], (String)null);
									if (var3 >= 0 && var3 <= 5000) {
										var8.method9976(var3);
										return 1;
									} else {
										throw new RuntimeException();
									}
								} else if (var0 == 8024) {
									var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
									Object var16 = PlayerType.method7974(var3);
									var5 = class376.method7915(Interpreter.Interpreter_stringStack[--class175.Interpreter_stringStackSize], (String)null);
									class563.method10648(var5, var5.method9937(), var16);
									return 1;
								} else {
									Object var12;
									if (var0 == 8025) {
										Interpreter.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
										var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
										var12 = PlayerType.method7974(var4);
										var6 = class376.method7915(Interpreter.Interpreter_stringStack[--class175.Interpreter_stringStackSize], (String)null);
										class563.method10648(var6, var3, var12);
										return 1;
									} else if (var0 == 8026) {
										var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
										var8 = class376.method7915(Interpreter.Interpreter_stringStack[--class175.Interpreter_stringStackSize], (String)null);
										var12 = class378.method7919(var8, var3);
										class367.method7650(var8.field5288, var12);
										return 1;
									} else if (var0 == 8027) {
										class175.Interpreter_stringStackSize -= 2;
										var9 = class376.method7915(Interpreter.Interpreter_stringStack[class175.Interpreter_stringStackSize], (String)null);
										var8 = class376.method7915(Interpreter.Interpreter_stringStack[class175.Interpreter_stringStackSize + 1], (String)null);
										WorldMapRectangle.method6613(var9, var8, var9.method9937());
										return 1;
									} else if (var0 == 8028) {
										var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
										class175.Interpreter_stringStackSize -= 2;
										var8 = class376.method7915(Interpreter.Interpreter_stringStack[class175.Interpreter_stringStackSize], (String)null);
										var5 = class376.method7915(Interpreter.Interpreter_stringStack[class175.Interpreter_stringStackSize + 1], (String)null);
										WorldMapRectangle.method6613(var8, var5, var3);
										return 1;
									} else if (var0 == 8029) {
										Interpreter.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
										var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
										var5 = class376.method7915(Interpreter.Interpreter_stringStack[--class175.Interpreter_stringStackSize], (String)null);
										class389.method7955(var5, var3, var4);
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
