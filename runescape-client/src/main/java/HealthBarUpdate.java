import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dw")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("lr")
	static String field1292;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1848002919
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -119536819
	)
	@Export("health")
	int health;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -904347369
	)
	@Export("health2")
	int health2;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1589430599
	)
	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1122274853"
	)
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ldt;Ldb;III)V",
		garbageValue = "779448194"
	)
	@Export("runScriptLogic")
	static void runScriptLogic(ScriptEvent var0, Script var1, int var2, int var3) {
		Object[] var4 = var0.args;
		AbstractByteArrayCopier.Interpreter_intStackSize = 0;
		class338.Interpreter_stringStackSize = 0;
		int var5 = -1;
		int[] var6 = var1.opcodes;
		int[] var7 = var1.intOperands;
		byte var8 = -1;
		Interpreter.Interpreter_frameDepth = 0;
		Interpreter.field867 = false;
		boolean var9 = false;
		int var10 = 0;
		boolean var29 = false;

		label901: {
			label902: {
				try {
					int var13;
					try {
						var29 = true;
						VerticalAlignment.Interpreter_intLocals = new int[var1.localIntCount];
						int var11 = 0;
						class156.Interpreter_stringLocals = new String[var1.localStringCount];
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
									var14 = var0.widget != null ? var0.widget.childIndex * -1626125685 : -1;
								}

								if (var14 == -2147483642) {
									var14 = var0.dragTarget != null ? var0.dragTarget.id : -1;
								}

								if (var14 == -2147483641) {
									var14 = var0.dragTarget != null ? var0.dragTarget.childIndex * -1626125685 : -1;
								}

								if (var14 == -2147483640) {
									var14 = var0.keyTyped;
								}

								if (var14 == -2147483639) {
									var14 = var0.keyPressed;
								}

								if (var14 == -2147483638) {
									var14 = var0.field1091;
								}

								VerticalAlignment.Interpreter_intLocals[var11++] = var14;
							} else if (var4[var13] instanceof String) {
								var20 = (String)var4[var13];
								if (var20.equals("event_opbase")) {
									var20 = var0.targetName;
								}

								class156.Interpreter_stringLocals[var12++] = var20;
							}
						}

						Interpreter.field870 = var0.field1094;

						label889:
						while (true) {
							++var10;
							if (var10 > var2) {
								throw new RuntimeException();
							}

							++var5;
							int var32 = var6[var5];
							if (var32 < 100) {
								if (var32 == 0) {
									Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var7[var5];
								} else if (var32 == 1) {
									var13 = var7[var5];
									Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Varps.Varps_main[var13];
								} else if (var32 == 2) {
									var13 = var7[var5];
									Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
									HttpHeaders.changeGameOptions(var13);
								} else if (var32 == 3) {
									Interpreter.Interpreter_stringStack[++class338.Interpreter_stringStackSize - 1] = var1.stringOperands[var5];
								} else if (var32 == 6) {
									var5 += var7[var5];
								} else if (var32 == 7) {
									AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1]) {
										var5 += var7[var5];
									}
								} else if (var32 == 8) {
									AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1]) {
										var5 += var7[var5];
									}
								} else if (var32 == 9) {
									AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1]) {
										var5 += var7[var5];
									}
								} else if (var32 == 10) {
									AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1]) {
										var5 += var7[var5];
									}
								} else if (var32 == 21) {
									if (Interpreter.Interpreter_frameDepth == 0) {
										var29 = false;
										break label902;
									}

									ScriptFrame var39 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth];
									var1 = var39.script;
									var6 = var1.opcodes;
									var7 = var1.intOperands;
									var5 = var39.pc;
									VerticalAlignment.Interpreter_intLocals = var39.intLocals;
									class156.Interpreter_stringLocals = var39.stringLocals;
								} else if (var32 == 25) {
									var13 = var7[var5];
									Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = class375.getVarbit(var13);
								} else if (var32 == 27) {
									var13 = var7[var5];
									InvDefinition.method5009(var13, Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize]);
								} else if (var32 == 31) {
									AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1]) {
										var5 += var7[var5];
									}
								} else if (var32 == 32) {
									AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1]) {
										var5 += var7[var5];
									}
								} else if (var32 == 33) {
									Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = VerticalAlignment.Interpreter_intLocals[var7[var5]];
								} else if (var32 == 34) {
									VerticalAlignment.Interpreter_intLocals[var7[var5]] = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
								} else if (var32 == 35) {
									Interpreter.Interpreter_stringStack[++class338.Interpreter_stringStackSize - 1] = class156.Interpreter_stringLocals[var7[var5]];
								} else if (var32 == 36) {
									class156.Interpreter_stringLocals[var7[var5]] = Interpreter.Interpreter_stringStack[--class338.Interpreter_stringStackSize];
								} else if (var32 == 37) {
									var13 = var7[var5];
									class338.Interpreter_stringStackSize -= var13;
									var20 = MouseRecorder.method2482(Interpreter.Interpreter_stringStack, class338.Interpreter_stringStackSize, var13);
									Interpreter.Interpreter_stringStack[++class338.Interpreter_stringStackSize - 1] = var20;
								} else if (var32 == 38) {
									--AbstractByteArrayCopier.Interpreter_intStackSize;
								} else if (var32 == 39) {
									--class338.Interpreter_stringStackSize;
								} else if (var32 == 40) {
									if (Interpreter.Interpreter_frameDepth == 50) {
										throw new RuntimeException();
									}

									var13 = var7[var5];
									Script var36 = PacketWriter.getScript(var13);
									int[] var15 = new int[var36.localIntCount];
									String[] var16 = new String[var36.localStringCount];
									if (var36.intArgumentCount >= 0) {
										System.arraycopy(Interpreter.Interpreter_intStack, AbstractByteArrayCopier.Interpreter_intStackSize - var36.intArgumentCount + 0, var15, 0, var36.intArgumentCount);
									}

									if (var36.stringArgumentCount >= 0) {
										System.arraycopy(Interpreter.Interpreter_stringStack, class338.Interpreter_stringStackSize - var36.stringArgumentCount + 0, var16, 0, var36.stringArgumentCount);
									}

									AbstractByteArrayCopier.Interpreter_intStackSize -= var36.intArgumentCount;
									class338.Interpreter_stringStackSize -= var36.stringArgumentCount;
									ScriptFrame var17 = new ScriptFrame();
									var17.script = var1;
									var17.pc = var5;
									var17.intLocals = VerticalAlignment.Interpreter_intLocals;
									var17.stringLocals = class156.Interpreter_stringLocals;
									Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var17;
									var1 = var36;
									var6 = var36.opcodes;
									var7 = var36.intOperands;
									var5 = -1;
									VerticalAlignment.Interpreter_intLocals = var15;
									class156.Interpreter_stringLocals = var16;
								} else if (var32 == 42) {
									Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = NPCComposition.varcs.getInt(var7[var5]);
								} else if (var32 == 43) {
									NPCComposition.varcs.setInt(var7[var5], Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize]);
								} else if (var32 == 44) {
									var13 = var7[var5] >> 16;
									var14 = var7[var5] & 65535;
									int var22 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
									if (var22 < 0 || var22 > 5000) {
										throw new RuntimeException();
									}

									Interpreter.Interpreter_arrayLengths[var13] = var22;
									byte var23 = -1;
									if (var14 == 105) {
										var23 = 0;
									}

									for (int var24 = 0; var24 < var22; ++var24) {
										Interpreter.Interpreter_arrays[var13][var24] = var23;
									}
								} else if (var32 == 45) {
									var13 = var7[var5];
									var14 = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
									if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
										throw new RuntimeException();
									}

									Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14];
								} else if (var32 == 46) {
									var13 = var7[var5];
									AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
									var14 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
									if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
										throw new RuntimeException();
									}

									Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
								} else if (var32 == 49) {
									String var21 = NPCComposition.varcs.getString(var7[var5]);
									Interpreter.Interpreter_stringStack[++class338.Interpreter_stringStackSize - 1] = var21;
								} else if (var32 == 50) {
									NPCComposition.varcs.setString(var7[var5], Interpreter.Interpreter_stringStack[--class338.Interpreter_stringStackSize]);
								} else if (var32 == 60) {
									IterableNodeHashTable var37 = var1.switches[var7[var5]];
									IntegerNode var35 = (IntegerNode)var37.get((long)Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize]);
									if (var35 != null) {
										var5 += var35.integer;
									}
								} else {
									Integer var38;
									if (var32 == 74) {
										var38 = FriendSystem.field833.getTitleGroupValue(var7[var5]);
										if (var38 == null) {
											Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = -1;
										} else {
											Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var38;
										}
									} else {
										if (var32 != 76) {
											throw new IllegalStateException();
										}

										var38 = class277.field3140.method9578(var7[var5]);
										if (var38 == null) {
											Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = -1;
										} else {
											Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var38;
										}
									}
								}
							} else {
								boolean var33 = var1.intOperands[var5] == 1;
								var14 = class250.method5227(var32, var1, var33);
								switch(var14) {
								case 0:
									var29 = false;
									break label889;
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

						for (var13 = Interpreter.Interpreter_frameDepth - 1; var13 >= 0; --var13) {
							var26.append("").append(Interpreter.Interpreter_frames[var13].script.key).append(" ");
						}

						var26.append("").append(var8);
						class290.RunException_sendStackTrace(var26.toString(), var30);
						var29 = false;
						break label901;
					}
				} finally {
					if (var29) {
						while (!Interpreter.field869.isEmpty()) {
							class106 var19 = (class106)Interpreter.field869.remove(0);
							class153.widgetDefaultMenuAction(var19.method2956(), var19.method2957(), var19.method2958(), var19.method2959(), "");
						}

						if (Interpreter.field867) {
							Interpreter.field867 = false;
							JagNetThread.method7815();
						}

						if (!var9 && var3 > 0 && var10 >= var3) {
							class290.RunException_sendStackTrace("Warning: Script " + var1.field1008 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
						}

					}
				}

				while (!Interpreter.field869.isEmpty()) {
					class106 var34 = (class106)Interpreter.field869.remove(0);
					class153.widgetDefaultMenuAction(var34.method2956(), var34.method2957(), var34.method2958(), var34.method2959(), "");
				}

				if (Interpreter.field867) {
					Interpreter.field867 = false;
					JagNetThread.method7815();
				}

				if (!var9 && var3 > 0 && var10 >= var3) {
					class290.RunException_sendStackTrace("Warning: Script " + var1.field1008 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
				}

				return;
			}

			while (!Interpreter.field869.isEmpty()) {
				class106 var40 = (class106)Interpreter.field869.remove(0);
				class153.widgetDefaultMenuAction(var40.method2956(), var40.method2957(), var40.method2958(), var40.method2959(), "");
			}

			if (Interpreter.field867) {
				Interpreter.field867 = false;
				JagNetThread.method7815();
			}

			if (!var9 && var3 > 0 && var10 >= var3) {
				class290.RunException_sendStackTrace("Warning: Script " + var1.field1008 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
			}

			return;
		}

		while (!Interpreter.field869.isEmpty()) {
			class106 var25 = (class106)Interpreter.field869.remove(0);
			class153.widgetDefaultMenuAction(var25.method2956(), var25.method2957(), var25.method2958(), var25.method2959(), "");
		}

		if (Interpreter.field867) {
			Interpreter.field867 = false;
			JagNetThread.method7815();
		}

		if (!var9 && var3 > 0 && var10 >= var3) {
			class290.RunException_sendStackTrace("Warning: Script " + var1.field1008 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "929356335"
	)
	static final int method2706(int var0, int var1) {
		int var2 = var1 * 57 + var0;
		var2 ^= var2 << 13;
		int var3 = var2 * (var2 * var2 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 255;
	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "597929112"
	)
	static final void method2704() {
		int var0 = Client.playerUpdateManager.playerCount;
		int[] var1 = Client.playerUpdateManager.playerIndices;
		Iterator var2 = Client.worldViewManager.iterator();

		while (var2.hasNext()) {
			WorldView var3 = (WorldView)var2.next();

			for (int var4 = 0; var4 < var0; ++var4) {
				Player var5 = (Player)var3.players.get((long)var1[var4]);
				if (var5 != null) {
					class244.updateActorSequence(var3, var5, 1);
				}
			}
		}

	}
}
