import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jq")
@Implements("ModelData0")
public class ModelData0 {
	@ObfuscatedName("ie")
	@ObfuscatedGetter(
		intValue = -46711549
	)
	@Export("foundItemIdCount")
	static int foundItemIdCount;

	ModelData0() {
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lcq;Lcg;IIB)V",
		garbageValue = "31"
	)
	@Export("runScriptLogic")
	static void runScriptLogic(ScriptEvent var0, Script var1, int var2, int var3) {
		Object[] var4 = var0.args;
		UserComparator7.Interpreter_intStackSize = 0;
		Interpreter.Interpreter_objectStackSize = 0;
		int var5 = -1;
		int[] var6 = var1.opcodes;
		int[] var7 = var1.intOperands;
		byte var8 = -1;
		Interpreter.Interpreter_frameDepth = 0;
		Interpreter.field667 = false;
		boolean var9 = false;
		Interpreter.field653 = 0;
		boolean var26 = false;

		label907: {
			label908: {
				try {
					int var12;
					try {
						var26 = true;
						WorldEntityCoord.Interpreter_intLocals = new int[var1.localIntCount];
						int var10 = 0;
						Interpreter.Interpreter_objectLocals = new Object[var1.localStringCount];
						int var11 = 0;

						int var13;
						String var19;
						for (var12 = 1; var12 < var4.length; ++var12) {
							if (var4[var12] instanceof Integer) {
								var13 = (Integer)var4[var12];
								if (var13 == -2147483647) {
									var13 = var0.mouseX;
								}

								if (var13 == -2147483646) {
									var13 = var0.mouseY;
								}

								if (var13 == -2147483645) {
									var13 = var0.widget != null ? var0.widget.id : -1;
								}

								if (var13 == -2147483644) {
									var13 = var0.opIndex;
								}

								if (var13 == -2147483643) {
									var13 = var0.widget != null ? var0.widget.childIndex * -217986249 : -1;
								}

								if (var13 == -2147483642) {
									var13 = var0.dragTarget != null ? var0.dragTarget.id : -1;
								}

								if (var13 == -2147483641) {
									var13 = var0.dragTarget != null ? var0.dragTarget.childIndex * -217986249 : -1;
								}

								if (var13 == -2147483640) {
									var13 = var0.keyTyped;
								}

								if (var13 == -2147483639) {
									var13 = var0.keyPressed;
								}

								if (var13 == -2147483638) {
									var13 = var0.field897;
								}

								WorldEntityCoord.Interpreter_intLocals[var10++] = var13;
							} else if (var4[var12] instanceof String) {
								var19 = (String)var4[var12];
								if (var19.equals("event_opbase")) {
									var19 = var0.targetName;
								}

								Interpreter.Interpreter_objectLocals[var11++] = var19;
							} else if (var4[var12] instanceof DynamicArray) {
								Interpreter.Interpreter_objectLocals[var11++] = var4[var12];
							}
						}

						Interpreter.field670 = var0.field902;

						while (true) {
							++Interpreter.field653;
							if (Interpreter.field653 > var2) {
								throw new RuntimeException();
							}

							++var5;
							int var29 = var6[var5];
							if (var29 < 100) {
								if (var29 == 0) {
									Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var7[var5];
								} else if (var29 == 1) {
									var12 = var7[var5];
									Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Varps.Varps_main[var12];
								} else if (var29 == 2) {
									var12 = var7[var5];
									Varps.Varps_main[var12] = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
									AbstractByteArrayCopier.changeGameOptions(var12);
								} else if (var29 == 3) {
									Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var1.stringOperands[var5];
								} else if (var29 == 6) {
									var5 += var7[var5];
								} else if (var29 == 7) {
									UserComparator7.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1]) {
										var5 += var7[var5];
									}
								} else if (var29 == 8) {
									UserComparator7.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1]) {
										var5 += var7[var5];
									}
								} else if (var29 == 9) {
									UserComparator7.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1]) {
										var5 += var7[var5];
									}
								} else if (var29 == 10) {
									UserComparator7.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1]) {
										var5 += var7[var5];
									}
								} else if (var29 == 21) {
									if (Interpreter.Interpreter_frameDepth == 0) {
										var26 = false;
										break label907;
									}

									ScriptFrame var37 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth];
									var1 = var37.script;
									var6 = var1.opcodes;
									var7 = var1.intOperands;
									var5 = var37.pc;
									WorldEntityCoord.Interpreter_intLocals = var37.intLocals;
									Interpreter.Interpreter_objectLocals = var37.stringLocals;
								} else if (var29 == 25) {
									var12 = var7[var5];
									Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = class281.getVarbit(var12);
								} else if (var29 == 27) {
									var12 = var7[var5];
									FloorDecoration.method4911(var12, Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize]);
								} else if (var29 == 31) {
									UserComparator7.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1]) {
										var5 += var7[var5];
									}
								} else if (var29 == 32) {
									UserComparator7.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1]) {
										var5 += var7[var5];
									}
								} else if (var29 == 33) {
									Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = WorldEntityCoord.Interpreter_intLocals[var7[var5]];
								} else if (var29 == 34) {
									WorldEntityCoord.Interpreter_intLocals[var7[var5]] = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
								} else if (var29 == 35) {
									Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = Interpreter.Interpreter_objectLocals[var7[var5]];
								} else if (var29 == 36) {
									Interpreter.Interpreter_objectLocals[var7[var5]] = Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize];
								} else if (var29 == 37) {
									var12 = var7[var5];
									Interpreter.Interpreter_objectStackSize -= var12;
									var19 = TileItem.method2824(Interpreter.Interpreter_objectStack, Interpreter.Interpreter_objectStackSize, var12);
									Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var19;
								} else if (var29 == 38) {
									--UserComparator7.Interpreter_intStackSize;
								} else if (var29 == 39) {
									--Interpreter.Interpreter_objectStackSize;
								} else if (var29 == 40) {
									if (Interpreter.Interpreter_frameDepth == 50) {
										throw new RuntimeException();
									}

									var12 = var7[var5];
									Script var33 = class324.getScript(var12);
									int[] var14 = new int[var33.localIntCount];
									Object[] var15 = new Object[var33.localStringCount];
									if (var33.intArgumentCount >= 0) {
										System.arraycopy(Interpreter.Interpreter_intStack, UserComparator7.Interpreter_intStackSize - var33.intArgumentCount + 0, var14, 0, var33.intArgumentCount);
									}

									if (var33.stringArgumentCount >= 0) {
										System.arraycopy(Interpreter.Interpreter_objectStack, Interpreter.Interpreter_objectStackSize - var33.stringArgumentCount + 0, var15, 0, var33.stringArgumentCount);
									}

									UserComparator7.Interpreter_intStackSize -= var33.intArgumentCount;
									Interpreter.Interpreter_objectStackSize -= var33.stringArgumentCount;
									ScriptFrame var16 = new ScriptFrame();
									var16.script = var1;
									var16.pc = var5;
									var16.intLocals = WorldEntityCoord.Interpreter_intLocals;
									var16.stringLocals = Interpreter.Interpreter_objectLocals;
									Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var16;
									var1 = var33;
									var6 = var33.opcodes;
									var7 = var33.intOperands;
									var5 = -1;
									WorldEntityCoord.Interpreter_intLocals = var14;
									Interpreter.Interpreter_objectLocals = var15;
								} else if (var29 == 42) {
									Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = class516.varcs.getInt(var7[var5]);
								} else if (var29 == 43) {
									class516.varcs.setInt(var7[var5], Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize]);
								} else if (var29 == 44) {
									var12 = var7[var5] >> 16;
									var13 = var7[var5] & 65535;
									int var21 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
									if (var21 < 0 || var21 > 5000) {
										throw new RuntimeException();
									}

									if (var13 == 115) {
										Interpreter.Interpreter_objectLocals[var12] = new DynamicArray(class574.field5824, "", var21, var21);
									} else if (var13 != 105 && var13 != 49) {
										Interpreter.Interpreter_objectLocals[var12] = new DynamicArray(class574.field5820, -1, var21, var21);
									} else {
										Interpreter.Interpreter_objectLocals[var12] = new DynamicArray(class574.field5820, 0, var21, var21);
									}
								} else {
									DynamicArray var20;
									if (var29 == 45) {
										var20 = class382.method8181(var7[var5], Interpreter.Interpreter_objectLocals[var7[var5]]);
										var13 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
										class517.method10309(var20, var13);
										if (var20.field5504 == class574.field5820) {
											Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var20.method10318()[var13];
										} else {
											Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var20.method10321()[var13];
										}
									} else if (var29 == 46) {
										var20 = class382.method8181(var7[var5], Interpreter.Interpreter_objectLocals[var7[var5]]);
										if (!var20.field5501) {
											throw new RuntimeException();
										}

										if (var20.field5504 == class574.field5820) {
											UserComparator7.Interpreter_intStackSize -= 2;
											var13 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
											class517.method10309(var20, var13);
											var20.method10318()[var13] = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
										} else {
											var13 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
											class517.method10309(var20, var13);
											var20.method10321()[var13] = Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize];
										}
									} else if (var29 == 49) {
										String var34 = class516.varcs.getString(var7[var5]);
										Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var34;
									} else if (var29 == 50) {
										class516.varcs.setString(var7[var5], (String)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize]);
									} else if (var29 == 60) {
										IterableNodeHashTable var35 = var1.switches[var7[var5]];
										IntegerNode var32 = (IntegerNode)var35.get((long)Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize]);
										if (var32 != null) {
											var5 += var32.integer;
										}
									} else if (var29 == 63) {
										Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = null;
									} else {
										Integer var36;
										if (var29 == 74) {
											var36 = FaceNormal.field2805.getTitleGroupValue(var7[var5]);
											if (var36 == null) {
												Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var36;
											}
										} else {
											if (var29 != 76) {
												throw new IllegalStateException();
											}

											var36 = class256.field3085.method10439(var7[var5]);
											if (var36 == null) {
												Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var36;
											}
										}
									}
								}
							} else {
								boolean var30 = var1.intOperands[var5] == 1;
								var13 = VerticalAlignment.method4393(var29, var1, var30);
								switch(var13) {
								case 0:
									var26 = false;
									break label908;
								case 1:
								default:
									break;
								case 2:
									throw new IllegalStateException();
								}
							}
						}
					} catch (Exception var27) {
						var9 = true;
						StringBuilder var23 = new StringBuilder(30);
						var23.append("").append(var1.key).append(" ");
						var12 = Interpreter.Interpreter_frameDepth - 1;

						while (true) {
							if (var12 < 0) {
								var23.append("").append(var8);
								class508.RunException_sendStackTrace(var23.toString(), var27);
								var26 = false;
								break;
							}

							var23.append("").append(Interpreter.Interpreter_frames[var12].script.key).append(" ");
							--var12;
						}
					}
				} finally {
					if (var26) {
						while (!Interpreter.field669.isEmpty()) {
							class83 var18 = (class83)Interpreter.field669.remove(0);
							WorldMapScaleHandler.widgetDefaultMenuAction(var18.method2781(), var18.method2782(), var18.method2783(), var18.method2787(), "");
						}

						if (Interpreter.field667) {
							Interpreter.field667 = false;
							HttpRequest.method104();
						}

						if (!var9 && var3 > 0 && Interpreter.field653 >= var3) {
							class508.RunException_sendStackTrace("Warning: Script " + var1.field795 + " finished at op count " + Interpreter.field653 + " of max " + var2, (Throwable)null);
						}

					}
				}

				while (!Interpreter.field669.isEmpty()) {
					class83 var22 = (class83)Interpreter.field669.remove(0);
					WorldMapScaleHandler.widgetDefaultMenuAction(var22.method2781(), var22.method2782(), var22.method2783(), var22.method2787(), "");
				}

				if (Interpreter.field667) {
					Interpreter.field667 = false;
					HttpRequest.method104();
				}

				if (!var9 && var3 > 0 && Interpreter.field653 >= var3) {
					class508.RunException_sendStackTrace("Warning: Script " + var1.field795 + " finished at op count " + Interpreter.field653 + " of max " + var2, (Throwable)null);
				}

				return;
			}

			while (!Interpreter.field669.isEmpty()) {
				class83 var31 = (class83)Interpreter.field669.remove(0);
				WorldMapScaleHandler.widgetDefaultMenuAction(var31.method2781(), var31.method2782(), var31.method2783(), var31.method2787(), "");
			}

			if (Interpreter.field667) {
				Interpreter.field667 = false;
				HttpRequest.method104();
			}

			if (!var9 && var3 > 0 && Interpreter.field653 >= var3) {
				class508.RunException_sendStackTrace("Warning: Script " + var1.field795 + " finished at op count " + Interpreter.field653 + " of max " + var2, (Throwable)null);
			}

			return;
		}

		while (!Interpreter.field669.isEmpty()) {
			class83 var38 = (class83)Interpreter.field669.remove(0);
			WorldMapScaleHandler.widgetDefaultMenuAction(var38.method2781(), var38.method2782(), var38.method2783(), var38.method2787(), "");
		}

		if (Interpreter.field667) {
			Interpreter.field667 = false;
			HttpRequest.method104();
		}

		if (!var9 && var3 > 0 && Interpreter.field653 >= var3) {
			class508.RunException_sendStackTrace("Warning: Script " + var1.field795 + " finished at op count " + Interpreter.field653 + " of max " + var2, (Throwable)null);
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([I[IIII)V",
		garbageValue = "2071091239"
	)
	public static void method5777(int[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			int var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;
			int var8 = var6 == Integer.MAX_VALUE ? 0 : 1;

			for (int var9 = var2; var9 < var3; ++var9) {
				if (var0[var9] < (var9 & var8) + var6) {
					int var10 = var0[var9];
					var0[var9] = var0[var5];
					var0[var5] = var10;
					int var11 = var1[var9];
					var1[var9] = var1[var5];
					var1[var5++] = var11;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method5777(var0, var1, var2, var5 - 1);
			method5777(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "874983861"
	)
	@Export("isAlphaNumeric")
	public static boolean isAlphaNumeric(char var0) {
		return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}
}
