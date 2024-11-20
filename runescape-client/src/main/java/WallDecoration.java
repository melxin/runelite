import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ks")
@Implements("WallDecoration")
public final class WallDecoration {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 890612751
	)
	@Export("z")
	int z;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1525014976
	)
	@Export("x")
	int x;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -574582761
	)
	@Export("y")
	int y;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1163309547
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -686513589
	)
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1555735271
	)
	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1321547361
	)
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		longValue = -4773209231483660881L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1063686703
	)
	@Export("flags")
	int flags;

	WallDecoration() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ldw;Ldt;IIB)V",
		garbageValue = "92"
	)
	@Export("runScriptLogic")
	static void runScriptLogic(ScriptEvent var0, Script var1, int var2, int var3) {
		Object[] var4 = var0.args;
		PrivateChatMode.Interpreter_intStackSize = 0;
		Interpreter.Interpreter_stringStackSize = 0;
		int var5 = -1;
		int[] var6 = var1.opcodes;
		int[] var7 = var1.intOperands;
		byte var8 = -1;
		Interpreter.Interpreter_frameDepth = 0;
		Interpreter.field871 = false;
		boolean var9 = false;
		int var10 = 0;
		boolean var29 = false;

		label928: {
			label929: {
				try {
					label921: {
						int var13;
						StringBuilder var26;
						try {
							var29 = true;
							Interpreter.Interpreter_intLocals = new int[var1.localIntCount];
							int var11 = 0;
							class379.Interpreter_stringLocals = new String[var1.localStringCount];
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
										var14 = var0.widget != null ? var0.widget.childIndex : -1;
									}

									if (var14 == -2147483642) {
										var14 = var0.dragTarget != null ? var0.dragTarget.id : -1;
									}

									if (var14 == -2147483641) {
										var14 = var0.dragTarget != null ? var0.dragTarget.childIndex : -1;
									}

									if (var14 == -2147483640) {
										var14 = var0.keyTyped;
									}

									if (var14 == -2147483639) {
										var14 = var0.keyPressed;
									}

									if (var14 == -2147483638) {
										var14 = var0.field1092;
									}

									Interpreter.Interpreter_intLocals[var11++] = var14;
								} else if (var4[var13] instanceof String) {
									var20 = (String)var4[var13];
									if (var20.equals("event_opbase")) {
										var20 = var0.targetName;
									}

									class379.Interpreter_stringLocals[var12++] = var20;
								}
							}

							Interpreter.field874 = var0.field1094;

							while (true) {
								++var10;
								if (var10 > var2) {
									throw new RuntimeException();
								}

								++var5;
								int var32 = var6[var5];
								if (var32 >= 100) {
									boolean var34;
									if (var1.intOperands[var5] == 1) {
										var34 = true;
									} else {
										var34 = false;
									}

									var14 = class389.method7552(var32, var1, var34);
									switch(var14) {
									case 0:
										var29 = false;
										break label921;
									case 1:
									default:
										break;
									case 2:
										throw new IllegalStateException();
									}
								} else if (var32 == 0) {
									Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var7[var5];
								} else if (var32 == 1) {
									var13 = var7[var5];
									Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Varps.Varps_main[var13];
								} else if (var32 == 2) {
									var13 = var7[var5];
									Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
									class145.changeGameOptions(var13);
								} else if (var32 == 3) {
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var1.stringOperands[var5];
								} else if (var32 == 6) {
									var5 += var7[var5];
								} else if (var32 == 7) {
									PrivateChatMode.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1]) {
										var5 += var7[var5];
									}
								} else if (var32 == 8) {
									PrivateChatMode.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1]) {
										var5 += var7[var5];
									}
								} else if (var32 == 9) {
									PrivateChatMode.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1]) {
										var5 += var7[var5];
									}
								} else if (var32 == 10) {
									PrivateChatMode.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1]) {
										var5 += var7[var5];
									}
								} else if (var32 == 21) {
									if (Interpreter.Interpreter_frameDepth == 0) {
										var29 = false;
										break label928;
									}

									ScriptFrame var39 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth];
									var1 = var39.script;
									var6 = var1.opcodes;
									var7 = var1.intOperands;
									var5 = var39.pc;
									Interpreter.Interpreter_intLocals = var39.intLocals;
									class379.Interpreter_stringLocals = var39.stringLocals;
								} else if (var32 == 25) {
									var13 = var7[var5];
									Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Frames.getVarbit(var13);
								} else if (var32 == 27) {
									var13 = var7[var5];
									NPC.method2955(var13, Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize]);
								} else if (var32 == 31) {
									PrivateChatMode.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1]) {
										var5 += var7[var5];
									}
								} else if (var32 == 32) {
									PrivateChatMode.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1]) {
										var5 += var7[var5];
									}
								} else if (var32 == 33) {
									Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Interpreter.Interpreter_intLocals[var7[var5]];
								} else if (var32 == 34) {
									Interpreter.Interpreter_intLocals[var7[var5]] = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
								} else if (var32 == 35) {
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class379.Interpreter_stringLocals[var7[var5]];
								} else if (var32 == 36) {
									class379.Interpreter_stringLocals[var7[var5]] = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
								} else if (var32 == 37) {
									var13 = var7[var5];
									Interpreter.Interpreter_stringStackSize -= var13;
									var20 = WorldView.method2870(Interpreter.Interpreter_stringStack, Interpreter.Interpreter_stringStackSize, var13);
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var20;
								} else if (var32 == 38) {
									--PrivateChatMode.Interpreter_intStackSize;
								} else if (var32 == 39) {
									--Interpreter.Interpreter_stringStackSize;
								} else {
									int var17;
									if (var32 != 40) {
										if (var32 == 42) {
											Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = HttpRequestTask.varcs.getInt(var7[var5]);
										} else if (var32 == 43) {
											HttpRequestTask.varcs.setInt(var7[var5], Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize]);
										} else if (var32 == 44) {
											var13 = var7[var5] >> 16;
											var14 = var7[var5] & 65535;
											int var23 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
											if (var23 < 0 || var23 > 5000) {
												throw new RuntimeException();
											}

											Interpreter.Interpreter_arrayLengths[var13] = var23;
											byte var24 = -1;
											if (var14 == 105) {
												var24 = 0;
											}

											for (var17 = 0; var17 < var23; ++var17) {
												Interpreter.Interpreter_arrays[var13][var17] = var24;
											}
										} else if (var32 == 45) {
											var13 = var7[var5];
											var14 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
												throw new RuntimeException();
											}

											Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14];
										} else if (var32 == 46) {
											var13 = var7[var5];
											PrivateChatMode.Interpreter_intStackSize -= 2;
											var14 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
												throw new RuntimeException();
											}

											Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
										} else if (var32 == 49) {
											String var21 = HttpRequestTask.varcs.getString(var7[var5]);
											Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var21;
										} else if (var32 == 50) {
											HttpRequestTask.varcs.setString(var7[var5], Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]);
										} else if (var32 == 60) {
											IterableNodeHashTable var36 = var1.switches[var7[var5]];
											IntegerNode var37 = (IntegerNode)var36.get((long)Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize]);
											if (var37 != null) {
												var5 += var37.integer;
											}
										} else {
											Integer var38;
											if (var32 == 74) {
												var38 = class158.field1725.getTitleGroupValue(var7[var5]);
												if (var38 == null) {
													Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var38;
												}
											} else {
												if (var32 != 76) {
													throw new IllegalStateException();
												}

												var38 = class155.field1711.method9321(var7[var5]);
												if (var38 == null) {
													Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var38;
												}
											}
										}
									} else {
										if (Interpreter.Interpreter_frameDepth == 50) {
											throw new RuntimeException();
										}

										var13 = var7[var5];
										Script var35 = class268.getScript(var13);
										int[] var15 = new int[var35.localIntCount];
										String[] var16 = new String[var35.localStringCount];

										for (var17 = 0; var17 < var35.intArgumentCount; ++var17) {
											var15[var17] = Interpreter.Interpreter_intStack[var17 + (PrivateChatMode.Interpreter_intStackSize - var35.intArgumentCount)];
										}

										for (var17 = 0; var17 < var35.stringArgumentCount; ++var17) {
											var16[var17] = Interpreter.Interpreter_stringStack[var17 + (Interpreter.Interpreter_stringStackSize - var35.stringArgumentCount)];
										}

										PrivateChatMode.Interpreter_intStackSize -= var35.intArgumentCount;
										Interpreter.Interpreter_stringStackSize -= var35.stringArgumentCount;
										ScriptFrame var22 = new ScriptFrame();
										var22.script = var1;
										var22.pc = var5;
										var22.intLocals = Interpreter.Interpreter_intLocals;
										var22.stringLocals = class379.Interpreter_stringLocals;
										Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var22;
										var1 = var35;
										var6 = var35.opcodes;
										var7 = var35.intOperands;
										var5 = -1;
										Interpreter.Interpreter_intLocals = var15;
										class379.Interpreter_stringLocals = var16;
									}
								}
							}
						} catch (Exception var30) {
							var9 = true;
							var26 = new StringBuilder(30);
							var26.append("").append(var1.key).append(" ");

							for (var13 = Interpreter.Interpreter_frameDepth - 1; var13 >= 0; --var13) {
								var26.append("").append(Interpreter.Interpreter_frames[var13].script.key).append(" ");
							}
						}

						var26.append("").append(var8);
						//ArchiveLoader.RunException_sendStackTrace(var26.toString(), var30);
						var29 = false;
						break label929;
					}
				} finally {
					if (var29) {
						while (Interpreter.field873.size() > 0) {
							class107 var19 = (class107)Interpreter.field873.remove(0);
							AsyncHttpResponse.widgetDefaultMenuAction(var19.method2968(), var19.method2969(), var19.method2970(), var19.method2971(), "");
						}

						if (Interpreter.field871) {
							Interpreter.field871 = false;
							Login.method2332();
						}

						if (!var9 && var3 > 0 && var10 >= var3) {
							ArchiveLoader.RunException_sendStackTrace("Warning: Script " + var1.field1016 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
						}

					}
				}

				while (Interpreter.field873.size() > 0) {
					class107 var33 = (class107)Interpreter.field873.remove(0);
					AsyncHttpResponse.widgetDefaultMenuAction(var33.method2968(), var33.method2969(), var33.method2970(), var33.method2971(), "");
				}

				if (Interpreter.field871) {
					Interpreter.field871 = false;
					Login.method2332();
				}

				if (!var9 && var3 > 0 && var10 >= var3) {
					ArchiveLoader.RunException_sendStackTrace("Warning: Script " + var1.field1016 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
				}

				return;
			}

			while (Interpreter.field873.size() > 0) {
				class107 var25 = (class107)Interpreter.field873.remove(0);
				AsyncHttpResponse.widgetDefaultMenuAction(var25.method2968(), var25.method2969(), var25.method2970(), var25.method2971(), "");
			}

			if (Interpreter.field871) {
				Interpreter.field871 = false;
				Login.method2332();
			}

			if (!var9 && var3 > 0 && var10 >= var3) {
				ArchiveLoader.RunException_sendStackTrace("Warning: Script " + var1.field1016 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
			}

			return;
		}

		while (Interpreter.field873.size() > 0) {
			class107 var40 = (class107)Interpreter.field873.remove(0);
			AsyncHttpResponse.widgetDefaultMenuAction(var40.method2968(), var40.method2969(), var40.method2970(), var40.method2971(), "");
		}

		if (Interpreter.field871) {
			Interpreter.field871 = false;
			Login.method2332();
		}

		if (!var9 && var3 > 0 && var10 >= var3) {
			ArchiveLoader.RunException_sendStackTrace("Warning: Script " + var1.field1016 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
		}

	}
}
