import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lq")
public class class303 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "98827376"
	)
	static void method6822() {
		if (class358.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
			class27.KeyHandler_keyCodes[186] = 57;
			class27.KeyHandler_keyCodes[187] = 27;
			class27.KeyHandler_keyCodes[188] = 71;
			class27.KeyHandler_keyCodes[189] = 26;
			class27.KeyHandler_keyCodes[190] = 72;
			class27.KeyHandler_keyCodes[191] = 73;
			class27.KeyHandler_keyCodes[192] = 58;
			class27.KeyHandler_keyCodes[219] = 42;
			class27.KeyHandler_keyCodes[220] = 74;
			class27.KeyHandler_keyCodes[221] = 43;
			class27.KeyHandler_keyCodes[222] = 59;
			class27.KeyHandler_keyCodes[223] = 28;
		} else {
			class27.KeyHandler_keyCodes[44] = 71;
			class27.KeyHandler_keyCodes[45] = 26;
			class27.KeyHandler_keyCodes[46] = 72;
			class27.KeyHandler_keyCodes[47] = 73;
			class27.KeyHandler_keyCodes[59] = 57;
			class27.KeyHandler_keyCodes[61] = 27;
			class27.KeyHandler_keyCodes[91] = 42;
			class27.KeyHandler_keyCodes[92] = 74;
			class27.KeyHandler_keyCodes[93] = 43;
			class27.KeyHandler_keyCodes[192] = 28;
			class27.KeyHandler_keyCodes[222] = 58;
			class27.KeyHandler_keyCodes[520] = 59;
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1063873684"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (FriendSystem.clientPreferences.getSoundEffectsVolume() != 0 && var1 != 0 && class57.soundEffectCount < 50) {
			Calendar.method8097(-1, var0, 0, 0, 0, 0, var1, var2, false);
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lcx;Lce;III)V",
		garbageValue = "1404875169"
	)
	@Export("runScriptLogic")
	static void runScriptLogic(ScriptEvent var0, Script var1, int var2, int var3) {
		Object[] var4 = var0.args;
		AbstractWorldMapIcon.Interpreter_intStackSize = 0;
		SecureRandomFuture.Interpreter_objectStackSize = 0;
		int var5 = -1;
		int[] var6 = var1.opcodes;
		int[] var7 = var1.intOperands;
		byte var8 = -1;
		Interpreter.Interpreter_frameDepth = 0;
		Interpreter.field629 = false;
		boolean var9 = false;
		int var10 = 0;
		boolean var27 = false;

		label904: {
			label905: {
				try {
					int var13;
					try {
						var27 = true;
						Interpreter.Interpreter_intLocals = new int[var1.localIntCount];
						int var11 = 0;
						Interpreter.Interpreter_objectLocals = new Object[var1.localStringCount];
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
									var14 = var0.widget != null ? var0.widget.childIndex * -64977777 : -1;
								}

								if (var14 == -2147483642) {
									var14 = var0.dragTarget != null ? var0.dragTarget.id : -1;
								}

								if (var14 == -2147483641) {
									var14 = var0.dragTarget != null ? var0.dragTarget.childIndex * -64977777 : -1;
								}

								if (var14 == -2147483640) {
									var14 = var0.keyTyped;
								}

								if (var14 == -2147483639) {
									var14 = var0.keyPressed;
								}

								if (var14 == -2147483638) {
									var14 = var0.field877;
								}

								Interpreter.Interpreter_intLocals[var11++] = var14;
							} else if (var4[var13] instanceof String) {
								var20 = (String)var4[var13];
								if (var20.equals("event_opbase")) {
									var20 = var0.targetName;
								}

								Interpreter.Interpreter_objectLocals[var12++] = var20;
							} else if (var4[var13] instanceof DynamicArray) {
								Interpreter.Interpreter_objectLocals[var12++] = var4[var13];
							}
						}

						Interpreter.field644 = var0.field876;

						while (true) {
							++var10;
							if (var10 > var2) {
								throw new RuntimeException();
							}

							++var5;
							int var30 = var6[var5];
							if (var30 < 100) {
								if (var30 == 0) {
									Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var7[var5];
								} else if (var30 == 1) {
									var13 = var7[var5];
									Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = Varps.Varps_main[var13];
								} else if (var30 == 2) {
									var13 = var7[var5];
									Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
									SpotAnimationDefinition.changeGameOptions(var13);
								} else if (var30 == 3) {
									Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var1.stringOperands[var5];
								} else if (var30 == 6) {
									var5 += var7[var5];
								} else if (var30 == 7) {
									AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1]) {
										var5 += var7[var5];
									}
								} else if (var30 == 8) {
									AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1]) {
										var5 += var7[var5];
									}
								} else if (var30 == 9) {
									AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1]) {
										var5 += var7[var5];
									}
								} else if (var30 == 10) {
									AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1]) {
										var5 += var7[var5];
									}
								} else if (var30 == 21) {
									if (Interpreter.Interpreter_frameDepth == 0) {
										var27 = false;
										break label904;
									}

									ScriptFrame var38 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth];
									var1 = var38.script;
									var6 = var1.opcodes;
									var7 = var1.intOperands;
									var5 = var38.pc;
									Interpreter.Interpreter_intLocals = var38.intLocals;
									Interpreter.Interpreter_objectLocals = var38.stringLocals;
								} else if (var30 == 25) {
									var13 = var7[var5];
									Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = SequenceDefinition.getVarbit(var13);
								} else if (var30 == 27) {
									var13 = var7[var5];
									class348.method7364(var13, Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize]);
								} else if (var30 == 31) {
									AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1]) {
										var5 += var7[var5];
									}
								} else if (var30 == 32) {
									AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1]) {
										var5 += var7[var5];
									}
								} else if (var30 == 33) {
									Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = Interpreter.Interpreter_intLocals[var7[var5]];
								} else if (var30 == 34) {
									Interpreter.Interpreter_intLocals[var7[var5]] = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
								} else if (var30 == 35) {
									Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = Interpreter.Interpreter_objectLocals[var7[var5]];
								} else if (var30 == 36) {
									Interpreter.Interpreter_objectLocals[var7[var5]] = Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
								} else if (var30 == 37) {
									var13 = var7[var5];
									SecureRandomFuture.Interpreter_objectStackSize -= var13;
									var20 = WorldViewManager.method2348(Interpreter.Interpreter_objectStack, SecureRandomFuture.Interpreter_objectStackSize, var13);
									Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var20;
								} else if (var30 == 38) {
									--AbstractWorldMapIcon.Interpreter_intStackSize;
								} else if (var30 == 39) {
									--SecureRandomFuture.Interpreter_objectStackSize;
								} else if (var30 == 40) {
									if (Interpreter.Interpreter_frameDepth == 50) {
										throw new RuntimeException();
									}

									var13 = var7[var5];
									Script var34 = class57.getScript(var13);
									int[] var15 = new int[var34.localIntCount];
									Object[] var16 = new Object[var34.localStringCount];
									if (var34.intArgumentCount >= 0) {
										System.arraycopy(Interpreter.Interpreter_intStack, AbstractWorldMapIcon.Interpreter_intStackSize - var34.intArgumentCount + 0, var15, 0, var34.intArgumentCount);
									}

									if (var34.stringArgumentCount >= 0) {
										System.arraycopy(Interpreter.Interpreter_objectStack, SecureRandomFuture.Interpreter_objectStackSize - var34.stringArgumentCount + 0, var16, 0, var34.stringArgumentCount);
									}

									AbstractWorldMapIcon.Interpreter_intStackSize -= var34.intArgumentCount;
									SecureRandomFuture.Interpreter_objectStackSize -= var34.stringArgumentCount;
									ScriptFrame var17 = new ScriptFrame();
									var17.script = var1;
									var17.pc = var5;
									var17.intLocals = Interpreter.Interpreter_intLocals;
									var17.stringLocals = Interpreter.Interpreter_objectLocals;
									Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var17;
									var1 = var34;
									var6 = var34.opcodes;
									var7 = var34.intOperands;
									var5 = -1;
									Interpreter.Interpreter_intLocals = var15;
									Interpreter.Interpreter_objectLocals = var16;
								} else if (var30 == 42) {
									Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = FloorDecoration.varcs.getInt(var7[var5]);
								} else if (var30 == 43) {
									FloorDecoration.varcs.setInt(var7[var5], Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize]);
								} else if (var30 == 44) {
									var13 = var7[var5] >> 16;
									var14 = var7[var5] & 65535;
									int var22 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
									if (var22 < 0 || var22 > 5000) {
										throw new RuntimeException();
									}

									if (var14 == 115) {
										Interpreter.Interpreter_objectLocals[var13] = new DynamicArray(class570.field5718, "", var22, var22);
									} else if (var14 != 105 && var14 != 49) {
										Interpreter.Interpreter_objectLocals[var13] = new DynamicArray(class570.field5721, -1, var22, var22);
									} else {
										Interpreter.Interpreter_objectLocals[var13] = new DynamicArray(class570.field5721, 0, var22, var22);
									}
								} else {
									DynamicArray var21;
									if (var30 == 45) {
										var21 = class548.method10667(var7[var5], Interpreter.Interpreter_objectLocals[var7[var5]]);
										var14 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
										class350.method7369(var21, var14);
										if (var21.field5399 == class570.field5721) {
											Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var21.method10348()[var14];
										} else {
											Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var21.method10393()[var14];
										}
									} else if (var30 == 46) {
										var21 = class548.method10667(var7[var5], Interpreter.Interpreter_objectLocals[var7[var5]]);
										if (!var21.field5400) {
											throw new RuntimeException();
										}

										if (var21.field5399 == class570.field5721) {
											AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
											var14 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
											class350.method7369(var21, var14);
											var21.method10348()[var14] = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
										} else {
											var14 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
											class350.method7369(var21, var14);
											var21.method10393()[var14] = Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
										}
									} else if (var30 == 49) {
										String var35 = FloorDecoration.varcs.getString(var7[var5]);
										Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var35;
									} else if (var30 == 50) {
										FloorDecoration.varcs.setString(var7[var5], (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize]);
									} else if (var30 == 60) {
										IterableNodeHashTable var36 = var1.switches[var7[var5]];
										IntegerNode var33 = (IntegerNode)var36.get((long)Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize]);
										if (var33 != null) {
											var5 += var33.integer;
										}
									} else if (var30 == 63) {
										Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = null;
									} else {
										Integer var37;
										if (var30 == 74) {
											var37 = class188.field2029.getTitleGroupValue(var7[var5]);
											if (var37 == null) {
												Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var37;
											}
										} else {
											if (var30 != 76) {
												throw new IllegalStateException();
											}

											var37 = Projection.field2791.method10487(var7[var5]);
											if (var37 == null) {
												Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var37;
											}
										}
									}
								}
							} else {
								boolean var31 = var1.intOperands[var5] == 1;
								var14 = KeyHandler.method375(var30, var1, var31);
								switch(var14) {
								case 0:
									var27 = false;
									break label905;
								case 1:
								default:
									break;
								case 2:
									throw new IllegalStateException();
								}
							}
						}
					} catch (Exception var28) {
						var9 = true;
						StringBuilder var24 = new StringBuilder(30);
						var24.append("").append(var1.key).append(" ");
						var13 = Interpreter.Interpreter_frameDepth - 1;

						while (true) {
							if (var13 < 0) {
								var24.append("").append(var8);
								class559.RunException_sendStackTrace(var24.toString(), var28);
								var27 = false;
								break;
							}

							var24.append("").append(Interpreter.Interpreter_frames[var13].script.key).append(" ");
							--var13;
						}
					}
				} finally {
					if (var27) {
						while (!Interpreter.field646.isEmpty()) {
							class82 var19 = (class82)Interpreter.field646.remove(0);
							ViewportMouse.widgetDefaultMenuAction(var19.method2749(), var19.method2739(), var19.method2740(), var19.method2737(), "");
						}

						if (Interpreter.field629) {
							Interpreter.field629 = false;
							DesktopPlatformInfoProvider.method10613();
						}

						if (!var9 && var3 > 0 && var10 >= var3) {
							class559.RunException_sendStackTrace("Warning: Script " + var1.field777 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
						}

					}
				}

				while (!Interpreter.field646.isEmpty()) {
					class82 var23 = (class82)Interpreter.field646.remove(0);
					ViewportMouse.widgetDefaultMenuAction(var23.method2749(), var23.method2739(), var23.method2740(), var23.method2737(), "");
				}

				if (Interpreter.field629) {
					Interpreter.field629 = false;
					DesktopPlatformInfoProvider.method10613();
				}

				if (!var9 && var3 > 0 && var10 >= var3) {
					class559.RunException_sendStackTrace("Warning: Script " + var1.field777 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
				}

				return;
			}

			while (!Interpreter.field646.isEmpty()) {
				class82 var32 = (class82)Interpreter.field646.remove(0);
				ViewportMouse.widgetDefaultMenuAction(var32.method2749(), var32.method2739(), var32.method2740(), var32.method2737(), "");
			}

			if (Interpreter.field629) {
				Interpreter.field629 = false;
				DesktopPlatformInfoProvider.method10613();
			}

			if (!var9 && var3 > 0 && var10 >= var3) {
				class559.RunException_sendStackTrace("Warning: Script " + var1.field777 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
			}

			return;
		}

		while (!Interpreter.field646.isEmpty()) {
			class82 var39 = (class82)Interpreter.field646.remove(0);
			ViewportMouse.widgetDefaultMenuAction(var39.method2749(), var39.method2739(), var39.method2740(), var39.method2737(), "");
		}

		if (Interpreter.field629) {
			Interpreter.field629 = false;
			DesktopPlatformInfoProvider.method10613();
		}

		if (!var9 && var3 > 0 && var10 >= var3) {
			class559.RunException_sendStackTrace("Warning: Script " + var1.field777 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-53"
	)
	public static void method6823() {
		try {
			JagexCache.JagexCache_dat2File.close();

			for (int var0 = 0; var0 < class533.field5487; ++var0) {
				class159.JagexCache_idxFiles[var0].close();
			}

			JagexCache.JagexCache_idx255File.close();
			JagexCache.JagexCache_randomDat.close();
		} catch (Exception var2) {
		}

	}
}
