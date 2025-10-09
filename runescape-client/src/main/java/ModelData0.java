import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jc")
@Implements("ModelData0")
public class ModelData0 {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 960079637
	)
	static int field3022;

	ModelData0() {
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lcb;Lcj;III)V",
		garbageValue = "-1994210930"
	)
	@Export("runScriptLogic")
	static void runScriptLogic(ScriptEvent var0, Script var1, int var2, int var3) {
		Object[] var4 = var0.args;
		UrlRequest.Interpreter_intStackSize = 0;
		Message.Interpreter_objectStackSize = 0;
		int var5 = -1;
		int[] var6 = var1.opcodes;
		int[] var7 = var1.intOperands;
		byte var8 = -1;
		Interpreter.Interpreter_frameDepth = 0;
		Interpreter.field640 = false;
		boolean var9 = false;
		Interpreter.field632 = 0;
		boolean var26 = false;

		label908: {
			label909: {
				try {
					int var12;
					try {
						var26 = true;
						Interpreter.Interpreter_intLocals = new int[var1.localIntCount];
						int var10 = 0;
						WorldEntityCoord.Interpreter_objectLocals = new Object[var1.localStringCount];
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
									var13 = var0.widget != null ? var0.widget.childIndex * -2066937045 : -1;
								}

								if (var13 == -2147483642) {
									var13 = var0.dragTarget != null ? var0.dragTarget.id : -1;
								}

								if (var13 == -2147483641) {
									var13 = var0.dragTarget != null ? var0.dragTarget.childIndex * -2066937045 : -1;
								}

								if (var13 == -2147483640) {
									var13 = var0.keyTyped;
								}

								if (var13 == -2147483639) {
									var13 = var0.keyPressed;
								}

								if (var13 == -2147483638) {
									var13 = var0.field876;
								}

								Interpreter.Interpreter_intLocals[var10++] = var13;
							} else if (var4[var12] instanceof String) {
								var19 = (String)var4[var12];
								if (var19.equals("event_opbase")) {
									var19 = var0.targetName;
								}

								WorldEntityCoord.Interpreter_objectLocals[var11++] = var19;
							} else if (var4[var12] instanceof DynamicArray) {
								WorldEntityCoord.Interpreter_objectLocals[var11++] = var4[var12];
							}
						}

						Interpreter.field629 = var0.field871;

						while (true) {
							++Interpreter.field632;
							if (Interpreter.field632 > var2) {
								throw new RuntimeException();
							}

							++var5;
							int var29 = var6[var5];
							if (var29 < 100) {
								if (var29 == 0) {
									Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var7[var5];
								} else if (var29 == 1) {
									var12 = var7[var5];
									Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Varps.Varps_main[var12];
								} else if (var29 == 2) {
									var12 = var7[var5];
									Varps.Varps_main[var12] = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
									class271.changeGameOptions(var12);
								} else if (var29 == 3) {
									Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var1.stringOperands[var5];
								} else if (var29 == 6) {
									var5 += var7[var5];
								} else if (var29 == 7) {
									UrlRequest.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1]) {
										var5 += var7[var5];
									}
								} else if (var29 == 8) {
									UrlRequest.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1]) {
										var5 += var7[var5];
									}
								} else if (var29 == 9) {
									UrlRequest.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1]) {
										var5 += var7[var5];
									}
								} else if (var29 == 10) {
									UrlRequest.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1]) {
										var5 += var7[var5];
									}
								} else if (var29 == 21) {
									if (Interpreter.Interpreter_frameDepth == 0) {
										var26 = false;
										break label908;
									}

									ScriptFrame var37 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth];
									var1 = var37.script;
									var6 = var1.opcodes;
									var7 = var1.intOperands;
									var5 = var37.pc;
									Interpreter.Interpreter_intLocals = var37.intLocals;
									WorldEntityCoord.Interpreter_objectLocals = var37.stringLocals;
								} else if (var29 == 25) {
									var12 = var7[var5];
									Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = MenuAction.getVarbit(var12);
								} else if (var29 == 27) {
									var12 = var7[var5];
									class263.method5982(var12, Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize]);
								} else if (var29 == 31) {
									UrlRequest.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1]) {
										var5 += var7[var5];
									}
								} else if (var29 == 32) {
									UrlRequest.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1]) {
										var5 += var7[var5];
									}
								} else if (var29 == 33) {
									Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Interpreter.Interpreter_intLocals[var7[var5]];
								} else if (var29 == 34) {
									Interpreter.Interpreter_intLocals[var7[var5]] = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
								} else if (var29 == 35) {
									Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = WorldEntityCoord.Interpreter_objectLocals[var7[var5]];
								} else if (var29 == 36) {
									WorldEntityCoord.Interpreter_objectLocals[var7[var5]] = Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize];
								} else if (var29 == 37) {
									var12 = var7[var5];
									Message.Interpreter_objectStackSize -= var12;
									var19 = MidiPcmStream.method7243(Interpreter.Interpreter_objectStack, Message.Interpreter_objectStackSize, var12);
									Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var19;
								} else if (var29 == 38) {
									--UrlRequest.Interpreter_intStackSize;
								} else if (var29 == 39) {
									--Message.Interpreter_objectStackSize;
								} else if (var29 == 40) {
									if (Interpreter.Interpreter_frameDepth == 50) {
										throw new RuntimeException();
									}

									var12 = var7[var5];
									Script var33 = class456.getScript(var12);
									int[] var14 = new int[var33.localIntCount];
									Object[] var15 = new Object[var33.localStringCount];
									if (var33.intArgumentCount >= 0) {
										System.arraycopy(Interpreter.Interpreter_intStack, UrlRequest.Interpreter_intStackSize - var33.intArgumentCount + 0, var14, 0, var33.intArgumentCount);
									}

									if (var33.stringArgumentCount >= 0) {
										System.arraycopy(Interpreter.Interpreter_objectStack, Message.Interpreter_objectStackSize - var33.stringArgumentCount + 0, var15, 0, var33.stringArgumentCount);
									}

									UrlRequest.Interpreter_intStackSize -= var33.intArgumentCount;
									Message.Interpreter_objectStackSize -= var33.stringArgumentCount;
									ScriptFrame var16 = new ScriptFrame();
									var16.script = var1;
									var16.pc = var5;
									var16.intLocals = Interpreter.Interpreter_intLocals;
									var16.stringLocals = WorldEntityCoord.Interpreter_objectLocals;
									Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var16;
									var1 = var33;
									var6 = var33.opcodes;
									var7 = var33.intOperands;
									var5 = -1;
									Interpreter.Interpreter_intLocals = var14;
									WorldEntityCoord.Interpreter_objectLocals = var15;
								} else if (var29 == 42) {
									Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = ModeWhere.varcs.getInt(var7[var5]);
								} else if (var29 == 43) {
									ModeWhere.varcs.setInt(var7[var5], Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize]);
								} else if (var29 == 44) {
									var12 = var7[var5] >> 16;
									var13 = var7[var5] & 65535;
									int var21 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
									if (var21 < 0 || var21 > 5000) {
										throw new RuntimeException();
									}

									if (var13 == 115) {
										WorldEntityCoord.Interpreter_objectLocals[var12] = new DynamicArray(class572.field5877, "", var21, var21);
									} else if (var13 != 105 && var13 != 49) {
										WorldEntityCoord.Interpreter_objectLocals[var12] = new DynamicArray(class572.field5879, -1, var21, var21);
									} else {
										WorldEntityCoord.Interpreter_objectLocals[var12] = new DynamicArray(class572.field5879, 0, var21, var21);
									}
								} else {
									DynamicArray var20;
									if (var29 == 45) {
										var20 = class330.method7060(var7[var5], WorldEntityCoord.Interpreter_objectLocals[var7[var5]]);
										var13 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
										class391.method8223(var20, var13);
										if (var20.field5571 == class572.field5879) {
											Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var20.method10430()[var13];
										} else {
											Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var20.method10428()[var13];
										}
									} else if (var29 == 46) {
										var20 = class330.method7060(var7[var5], WorldEntityCoord.Interpreter_objectLocals[var7[var5]]);
										if (!var20.field5570) {
											throw new RuntimeException();
										}

										if (var20.field5571 == class572.field5879) {
											UrlRequest.Interpreter_intStackSize -= 2;
											var13 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
											class391.method8223(var20, var13);
											var20.method10430()[var13] = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
										} else {
											var13 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
											class391.method8223(var20, var13);
											var20.method10428()[var13] = Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize];
										}
									} else if (var29 == 49) {
										String var34 = ModeWhere.varcs.getString(var7[var5]);
										Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var34;
									} else if (var29 == 50) {
										ModeWhere.varcs.setString(var7[var5], (String)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize]);
									} else if (var29 == 60) {
										IterableNodeHashTable var35 = var1.switches[var7[var5]];
										IntegerNode var32 = (IntegerNode)var35.get((long)Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize]);
										if (var32 != null) {
											var5 += var32.integer;
										}
									} else if (var29 == 63) {
										Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = null;
									} else {
										Integer var36;
										if (var29 == 74) {
											var36 = ByteArrayPool.field5368.getTitleGroupValue(var7[var5]);
											if (var36 == null) {
												Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var36;
											}
										} else {
											if (var29 != 76) {
												throw new IllegalStateException();
											}

											var36 = class389.field4498.method10559(var7[var5]);
											if (var36 == null) {
												Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var36;
											}
										}
									}
								}
							} else {
								boolean var30 = var1.intOperands[var5] == 1;
								var13 = HttpResponse.method288(var29, var1, var30);
								switch(var13) {
								case 0:
									var26 = false;
									break label909;
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
								ArchiveDiskActionHandler.RunException_sendStackTrace(var23.toString(), var27);
								var26 = false;
								break;
							}

							var23.append("").append(Interpreter.Interpreter_frames[var12].script.key).append(" ");
							--var12;
						}
					}
				} finally {
					if (var26) {
						while (!Interpreter.field626.isEmpty()) {
							class82 var18 = (class82)Interpreter.field626.remove(0);
							class179.widgetDefaultMenuAction(var18.method2871(), var18.method2862(), var18.method2863(), var18.method2864(), "");
						}

						if (Interpreter.field640) {
							Interpreter.field640 = false;
							class206.method4591();
						}

						if (!var9 && var3 > 0 && Interpreter.field632 >= var3) {
							ArchiveDiskActionHandler.RunException_sendStackTrace("Warning: Script " + var1.field769 + " finished at op count " + Interpreter.field632 + " of max " + var2, (Throwable)null);
						}

					}
				}

				while (!Interpreter.field626.isEmpty()) {
					class82 var22 = (class82)Interpreter.field626.remove(0);
					class179.widgetDefaultMenuAction(var22.method2871(), var22.method2862(), var22.method2863(), var22.method2864(), "");
				}

				if (Interpreter.field640) {
					Interpreter.field640 = false;
					class206.method4591();
				}

				if (!var9 && var3 > 0 && Interpreter.field632 >= var3) {
					ArchiveDiskActionHandler.RunException_sendStackTrace("Warning: Script " + var1.field769 + " finished at op count " + Interpreter.field632 + " of max " + var2, (Throwable)null);
				}

				return;
			}

			while (!Interpreter.field626.isEmpty()) {
				class82 var31 = (class82)Interpreter.field626.remove(0);
				class179.widgetDefaultMenuAction(var31.method2871(), var31.method2862(), var31.method2863(), var31.method2864(), "");
			}

			if (Interpreter.field640) {
				Interpreter.field640 = false;
				class206.method4591();
			}

			if (!var9 && var3 > 0 && Interpreter.field632 >= var3) {
				ArchiveDiskActionHandler.RunException_sendStackTrace("Warning: Script " + var1.field769 + " finished at op count " + Interpreter.field632 + " of max " + var2, (Throwable)null);
			}

			return;
		}

		while (!Interpreter.field626.isEmpty()) {
			class82 var38 = (class82)Interpreter.field626.remove(0);
			class179.widgetDefaultMenuAction(var38.method2871(), var38.method2862(), var38.method2863(), var38.method2864(), "");
		}

		if (Interpreter.field640) {
			Interpreter.field640 = false;
			class206.method4591();
		}

		if (!var9 && var3 > 0 && Interpreter.field632 >= var3) {
			ArchiveDiskActionHandler.RunException_sendStackTrace("Warning: Script " + var1.field769 + " finished at op count " + Interpreter.field632 + " of max " + var2, (Throwable)null);
		}

	}
}
