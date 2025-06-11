import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vc")
public class class561 {
	@ObfuscatedName("aj")
	static final int[] field5589;

	static {
		field5589 = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, -1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 3, 3, 1, 1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lcs;Lcr;IIS)V",
		garbageValue = "31580"
	)
	@Export("runScriptLogic")
	static void runScriptLogic(ScriptEvent var0, Script var1, int var2, int var3) {
		Object[] var4 = var0.args;
		Interpreter.Interpreter_intStackSize = 0;
		class175.Interpreter_stringStackSize = 0;
		int var5 = -1;
		int[] var6 = var1.opcodes;
		int[] var7 = var1.intOperands;
		byte var8 = -1;
		Interpreter.Interpreter_frameDepth = 0;
		Interpreter.field664 = false;
		boolean var9 = false;
		int var10 = 0;
		boolean var29 = false;

		label995: {
			label996: {
				try {
					int var13;
					try {
						var29 = true;
						class351.Interpreter_intLocals = new int[var1.localIntCount];
						int var11 = 0;
						Interpreter.Interpreter_stringLocals = new Object[var1.localStringCount];
						int var12 = 0;

						int var14;
						String var20;
						for (var13 = 1; var13 < var4.length; ++var13) {
							if (var4[var13] instanceof Integer) {
								var14 = (Integer)var4[var13];
								if (var14 == -2147483647) {
									var14 = var0.mouseX;
								}

								if (var14 == -2147483646) {
									var14 = var0.mouseY;
								}

								if (var14 == -2147483645) {
									var14 = var0.widget != null ? var0.widget.id : -1;
								}

								if (var14 == -2147483644) {
									var14 = var0.opIndex;
								}

								if (var14 == -2147483643) {
									var14 = var0.widget != null ? var0.widget.childIndex * -744024149 : -1;
								}

								if (var14 == -2147483642) {
									var14 = var0.dragTarget != null ? var0.dragTarget.id : -1;
								}

								if (var14 == -2147483641) {
									var14 = var0.dragTarget != null ? var0.dragTarget.childIndex * -744024149 : -1;
								}

								if (var14 == -2147483640) {
									var14 = var0.keyTyped;
								}

								if (var14 == -2147483639) {
									var14 = var0.keyPressed;
								}

								if (var14 == -2147483638) {
									var14 = var0.field895;
								}

								class351.Interpreter_intLocals[var11++] = var14;
							} else if (var4[var13] instanceof String) {
								var20 = (String)var4[var13];
								if (var20.equals("event_opbase")) {
									var20 = var0.targetName;
								}

								Interpreter.Interpreter_stringLocals[var12++] = var20;
							} else if (var4[var13] instanceof class509) {
								Interpreter.Interpreter_stringLocals[var12++] = var4[var13];
							}
						}

						Interpreter.field677 = var0.field901;

						while (true) {
							++var10;
							if (var10 > var2) {
								throw new RuntimeException();
							}

							++var5;
							int var32 = var6[var5];
							if (var32 < 100) {
								if (var32 == 0) {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7[var5];
								} else if (var32 == 1) {
									var13 = var7[var5];
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Varps.Varps_main[var13];
								} else if (var32 == 2) {
									var13 = var7[var5];
									Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
									class172.changeGameOptions(var13);
								} else if (var32 == 3) {
									Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = var1.stringOperands[var5];
								} else if (var32 == 6) {
									var5 += var7[var5];
								} else if (var32 == 7) {
									Interpreter.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
										var5 += var7[var5];
									}
								} else if (var32 == 8) {
									Interpreter.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
										var5 += var7[var5];
									}
								} else if (var32 == 9) {
									Interpreter.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
										var5 += var7[var5];
									}
								} else if (var32 == 10) {
									Interpreter.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
										var5 += var7[var5];
									}
								} else if (var32 == 21) {
									if (Interpreter.Interpreter_frameDepth == 0) {
										var29 = false;
										break label995;
									}

									ScriptFrame var40 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth];
									var1 = var40.script;
									var6 = var1.opcodes;
									var7 = var1.intOperands;
									var5 = var40.pc;
									class351.Interpreter_intLocals = var40.intLocals;
									Interpreter.Interpreter_stringLocals = var40.stringLocals;
								} else if (var32 == 25) {
									var13 = var7[var5];
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class4.getVarbit(var13);
								} else if (var32 == 27) {
									var13 = var7[var5];
									Varps.method7213(var13, Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
								} else if (var32 == 31) {
									Interpreter.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
										var5 += var7[var5];
									}
								} else if (var32 == 32) {
									Interpreter.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
										var5 += var7[var5];
									}
								} else if (var32 == 33) {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class351.Interpreter_intLocals[var7[var5]];
								} else if (var32 == 34) {
									class351.Interpreter_intLocals[var7[var5]] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
								} else if (var32 == 35) {
									Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = Interpreter.Interpreter_stringLocals[var7[var5]];
								} else if (var32 == 36) {
									Interpreter.Interpreter_stringLocals[var7[var5]] = Interpreter.Interpreter_stringStack[--class175.Interpreter_stringStackSize];
								} else if (var32 == 37) {
									var13 = var7[var5];
									class175.Interpreter_stringStackSize -= var13;
									var20 = class33.method487(Interpreter.Interpreter_stringStack, class175.Interpreter_stringStackSize, var13);
									Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = var20;
								} else if (var32 == 38) {
									--Interpreter.Interpreter_intStackSize;
								} else if (var32 == 39) {
									--class175.Interpreter_stringStackSize;
								} else if (var32 == 40) {
									if (Interpreter.Interpreter_frameDepth == 50) {
										throw new RuntimeException();
									}

									var13 = var7[var5];
									Script var36 = class191.getScript(var13);
									int[] var15 = new int[var36.localIntCount];
									Object[] var16 = new Object[var36.localStringCount];
									if (var36.intArgumentCount >= 0) {
										System.arraycopy(Interpreter.Interpreter_intStack, Interpreter.Interpreter_intStackSize - var36.intArgumentCount + 0, var15, 0, var36.intArgumentCount);
									}

									if (var36.stringArgumentCount >= 0) {
										System.arraycopy(Interpreter.Interpreter_stringStack, class175.Interpreter_stringStackSize - var36.stringArgumentCount + 0, var16, 0, var36.stringArgumentCount);
									}

									Interpreter.Interpreter_intStackSize -= var36.intArgumentCount;
									class175.Interpreter_stringStackSize -= var36.stringArgumentCount;
									ScriptFrame var17 = new ScriptFrame();
									var17.script = var1;
									var17.pc = var5;
									var17.intLocals = class351.Interpreter_intLocals;
									var17.stringLocals = Interpreter.Interpreter_stringLocals;
									Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var17;
									var1 = var36;
									var6 = var36.opcodes;
									var7 = var36.intOperands;
									var5 = -1;
									class351.Interpreter_intLocals = var15;
									Interpreter.Interpreter_stringLocals = var16;
								} else if (var32 == 42) {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class339.varcs.getInt(var7[var5]);
								} else if (var32 == 43) {
									class339.varcs.setInt(var7[var5], Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
								} else if (var32 == 44) {
									var13 = var7[var5] >> 16;
									var14 = var7[var5] & 65535;
									int var22 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
									if (var22 < 0 || var22 > 5000) {
										throw new RuntimeException();
									}

									if (Client.field434 >= 5) {
										if (var14 == 115) {
											Interpreter.Interpreter_stringLocals[var13] = new class509(class563.field5595, "", var22, var22);
										} else if (var14 != 105 && var14 != 49) {
											Interpreter.Interpreter_stringLocals[var13] = new class509(class563.field5600, -1, var22, var22);
										} else {
											Interpreter.Interpreter_stringLocals[var13] = new class509(class563.field5600, 0, var22, var22);
										}
									} else {
										Interpreter.Interpreter_arrayLengths[var13] = var22;
										int var23 = var14 == 105 ? 0 : -1;

										for (int var24 = 0; var24 < var22; ++var24) {
											Interpreter.Interpreter_arrays[var13][var24] = var23;
										}
									}
								} else {
									class509 var21;
									if (var32 == 45) {
										if (Client.field434 >= 5) {
											var21 = UserComparator4.method3385(var7[var5], Interpreter.Interpreter_stringLocals[var7[var5]]);
											var14 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
											HttpRequestTask.method290(var21, var14);
											if (var21.field5288 == class563.field5600) {
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var21.method9965()[var14];
											} else {
												Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = var21.method9936()[var14];
											}
										} else {
											var13 = var7[var5];
											var14 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
												throw new RuntimeException();
											}

											Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14];
										}
									} else if (var32 == 46) {
										if (Client.field434 >= 5) {
											var21 = UserComparator4.method3385(var7[var5], Interpreter.Interpreter_stringLocals[var7[var5]]);
											if (!var21.field5293) {
												throw new RuntimeException();
											}

											if (var21.field5288 == class563.field5600) {
												Interpreter.Interpreter_intStackSize -= 2;
												var14 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
												HttpRequestTask.method290(var21, var14);
												var21.method9965()[var14] = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
											} else {
												var14 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
												HttpRequestTask.method290(var21, var14);
												var21.method9936()[var14] = Interpreter.Interpreter_stringStack[--class175.Interpreter_stringStackSize];
											}
										} else {
											var13 = var7[var5];
											Interpreter.Interpreter_intStackSize -= 2;
											var14 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
												throw new RuntimeException();
											}

											Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
										}
									} else if (var32 == 49) {
										String var37 = class339.varcs.getString(var7[var5]);
										Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = var37;
									} else if (var32 == 50) {
										class339.varcs.setString(var7[var5], (String)Interpreter.Interpreter_stringStack[--class175.Interpreter_stringStackSize]);
									} else if (var32 == 60) {
										IterableNodeHashTable var38 = var1.switches[var7[var5]];
										IntegerNode var35 = (IntegerNode)var38.get((long)Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
										if (var35 != null) {
											var5 += var35.integer;
										}
									} else if (var32 == 63) {
										Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = null;
									} else {
										Integer var39;
										if (var32 == 74) {
											var39 = class445.field4970.getTitleGroupValue(var7[var5]);
											if (var39 == null) {
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var39;
											}
										} else {
											if (var32 != 76) {
												throw new IllegalStateException();
											}

											var39 = class389.field4604.method10060(var7[var5]);
											if (var39 == null) {
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var39;
											}
										}
									}
								}
							} else {
								boolean var33 = var1.intOperands[var5] == 1;
								var14 = ModeWhere.method8388(var32, var1, var33);
								switch(var14) {
								case 0:
									var29 = false;
									break label996;
								case 1:
								default:
									break;
								case 2:
									throw new IllegalStateException();
								}
							}
						}
					} catch (Exception var30) {
						var9 = true;
						StringBuilder var26 = new StringBuilder(30);
						var26.append("").append(var1.key).append(" ");
						var13 = Interpreter.Interpreter_frameDepth - 1;

						while (true) {
							if (var13 < 0) {
								var26.append("").append(var8);
								class569.RunException_sendStackTrace(var26.toString(), var30);
								var29 = false;
								break;
							}

							var26.append("").append(Interpreter.Interpreter_frames[var13].script.key).append(" ");
							--var13;
						}
					}
				} finally {
					if (var29) {
						while (!Interpreter.field670.isEmpty()) {
							class82 var19 = (class82)Interpreter.field670.remove(0);
							VarbitComposition.widgetDefaultMenuAction(var19.method2651(), var19.method2644(), var19.method2643(), var19.method2646(), "");
						}

						if (Interpreter.field664) {
							Interpreter.field664 = false;
							class386.method7953();
						}

						if (!var9 && var3 > 0 && var10 >= var3) {
							class569.RunException_sendStackTrace("Warning: Script " + var1.field803 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
						}

					}
				}

				while (!Interpreter.field670.isEmpty()) {
					class82 var25 = (class82)Interpreter.field670.remove(0);
					VarbitComposition.widgetDefaultMenuAction(var25.method2651(), var25.method2644(), var25.method2643(), var25.method2646(), "");
				}

				if (Interpreter.field664) {
					Interpreter.field664 = false;
					class386.method7953();
				}

				if (!var9 && var3 > 0 && var10 >= var3) {
					class569.RunException_sendStackTrace("Warning: Script " + var1.field803 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
				}

				return;
			}

			while (!Interpreter.field670.isEmpty()) {
				class82 var34 = (class82)Interpreter.field670.remove(0);
				VarbitComposition.widgetDefaultMenuAction(var34.method2651(), var34.method2644(), var34.method2643(), var34.method2646(), "");
			}

			if (Interpreter.field664) {
				Interpreter.field664 = false;
				class386.method7953();
			}

			if (!var9 && var3 > 0 && var10 >= var3) {
				class569.RunException_sendStackTrace("Warning: Script " + var1.field803 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
			}

			return;
		}

		while (!Interpreter.field670.isEmpty()) {
			class82 var41 = (class82)Interpreter.field670.remove(0);
			VarbitComposition.widgetDefaultMenuAction(var41.method2651(), var41.method2644(), var41.method2643(), var41.method2646(), "");
		}

		if (Interpreter.field664) {
			Interpreter.field664 = false;
			class386.method7953();
		}

		if (!var9 && var3 > 0 && var10 >= var3) {
			class569.RunException_sendStackTrace("Warning: Script " + var1.field803 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
		}

	}
}
