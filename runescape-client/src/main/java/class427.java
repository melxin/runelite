import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qa")
public final class class427 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[Lqa;"
	)
	static class427[] field4755;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1504367069
	)
	static int field4750;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -457814417
	)
	static int field4752;
	@ObfuscatedName("ao")
	float field4751;
	@ObfuscatedName("ad")
	float field4754;
	@ObfuscatedName("an")
	float field4753;
	@ObfuscatedName("ae")
	float field4756;

	static {
		field4755 = new class427[0];
		field4750 = 100;
		field4755 = new class427[100];
		field4752 = 0;
		new class427();
	}

	class427() {
		this.method8345();
	}

	public class427(float var1, float var2, float var3) {
		this.method8332(var1, var2, var3);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1473805285"
	)
	public void method8354() {
		synchronized(field4755) {
			if (field4752 < field4750 - 1) {
				field4755[++field4752 - 1] = this;
			}

		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "-987345796"
	)
	void method8333(float var1, float var2, float var3, float var4) {
		this.field4751 = var1;
		this.field4754 = var2;
		this.field4753 = var3;
		this.field4756 = var4;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "1523709540"
	)
	public void method8334(float var1, float var2, float var3, float var4) {
		float var5 = (float)Math.sin((double)(0.5F * var4));
		float var6 = (float)Math.cos((double)(0.5F * var4));
		this.field4751 = var1 * var5;
		this.field4754 = var5 * var2;
		this.field4753 = var3 * var5;
		this.field4756 = var6;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "-29318803"
	)
	public void method8332(float var1, float var2, float var3) {
		this.method8334(0.0F, 1.0F, 0.0F, var1);
		class427 var4 = FaceNormal.method4465();
		var4.method8334(1.0F, 0.0F, 0.0F, var2);
		this.method8340(var4);
		var4.method8334(0.0F, 0.0F, 1.0F, var3);
		this.method8340(var4);
		var4.method8354();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-476969734"
	)
	final void method8345() {
		this.field4753 = 0.0F;
		this.field4754 = 0.0F;
		this.field4751 = 0.0F;
		this.field4756 = 1.0F;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lqa;I)V",
		garbageValue = "2146504528"
	)
	public final void method8340(class427 var1) {
		this.method8333(this.field4751 * var1.field4756 + this.field4756 * var1.field4751 + var1.field4754 * this.field4753 - this.field4754 * var1.field4753, var1.field4753 * this.field4751 + var1.field4756 * this.field4754 - var1.field4751 * this.field4753 + this.field4756 * var1.field4754, var1.field4756 * this.field4753 + this.field4754 * var1.field4751 - var1.field4754 * this.field4751 + this.field4756 * var1.field4753, this.field4756 * var1.field4756 - var1.field4751 * this.field4751 - this.field4754 * var1.field4754 - var1.field4753 * this.field4753);
	}

	public int hashCode() {
		boolean var1 = true;
		float var2 = 1.0F;
		var2 = this.field4751 + var2 * 31.0F;
		var2 = this.field4754 + 31.0F * var2;
		var2 = this.field4753 + 31.0F * var2;
		var2 = this.field4756 + var2 * 31.0F;
		return (int)var2;
	}

	public String toString() {
		return this.field4751 + "," + this.field4754 + "," + this.field4753 + "," + this.field4756;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class427)) {
			return false;
		} else {
			class427 var2 = (class427)var1;
			return var2.field4751 == this.field4751 && this.field4754 == var2.field4754 && var2.field4753 == this.field4753 && var2.field4756 == this.field4756;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ldf;Ldm;III)V",
		garbageValue = "-105147355"
	)
	@Export("runScriptLogic")
	static void runScriptLogic(ScriptEvent var0, Script var1, int var2, int var3) {
		Object[] var4 = var0.args;
		ScriptFrame.Interpreter_intStackSize = 0;
		HealthBarConfig.Interpreter_stringStackSize = 0;
		int var5 = -1;
		int[] var6 = var1.opcodes;
		int[] var7 = var1.intOperands;
		byte var8 = -1;
		Interpreter.Interpreter_frameDepth = 0;
		Interpreter.field850 = false;
		boolean var9 = false;
		int var10 = 0;
		boolean var29 = false;

		label927: {
			label928: {
				try {
					label920: {
						int var13;
						StringBuilder var26;
						try {
							var29 = true;
							class542.Interpreter_intLocals = new int[var1.localIntCount];
							int var11 = 0;
							LoginPacket.Interpreter_stringLocals = new String[var1.localStringCount];
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
										var14 = var0.field1081;
									}

									class542.Interpreter_intLocals[var11++] = var14;
								} else if (var4[var13] instanceof String) {
									var20 = (String)var4[var13];
									if (var20.equals("event_opbase")) {
										var20 = var0.targetName;
									}

									LoginPacket.Interpreter_stringLocals[var12++] = var20;
								}
							}

							Interpreter.field864 = var0.field1080;

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

									var14 = class53.method1129(var32, var1, var34);
									switch(var14) {
									case 0:
										var29 = false;
										break label927;
									case 1:
									default:
										break;
									case 2:
										throw new IllegalStateException();
									}
								} else if (var32 == 0) {
									Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var7[var5];
								} else if (var32 == 1) {
									var13 = var7[var5];
									Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Varps.Varps_main[var13];
								} else if (var32 == 2) {
									var13 = var7[var5];
									Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
									RouteStrategy.changeGameOptions(var13);
								} else if (var32 == 3) {
									Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var1.stringOperands[var5];
								} else if (var32 == 6) {
									var5 += var7[var5];
								} else if (var32 == 7) {
									ScriptFrame.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1]) {
										var5 += var7[var5];
									}
								} else if (var32 == 8) {
									ScriptFrame.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1]) {
										var5 += var7[var5];
									}
								} else if (var32 == 9) {
									ScriptFrame.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1]) {
										var5 += var7[var5];
									}
								} else if (var32 == 10) {
									ScriptFrame.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1]) {
										var5 += var7[var5];
									}
								} else if (var32 == 21) {
									if (Interpreter.Interpreter_frameDepth == 0) {
										var29 = false;
										break label920;
									}

									ScriptFrame var39 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth];
									var1 = var39.script;
									var6 = var1.opcodes;
									var7 = var1.intOperands;
									var5 = var39.pc;
									class542.Interpreter_intLocals = var39.intLocals;
									LoginPacket.Interpreter_stringLocals = var39.stringLocals;
								} else if (var32 == 25) {
									var13 = var7[var5];
									Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class77.getVarbit(var13);
								} else if (var32 == 27) {
									var13 = var7[var5];
									RouteStrategy.method5847(var13, Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
								} else if (var32 == 31) {
									ScriptFrame.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1]) {
										var5 += var7[var5];
									}
								} else if (var32 == 32) {
									ScriptFrame.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1]) {
										var5 += var7[var5];
									}
								} else if (var32 == 33) {
									Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = class542.Interpreter_intLocals[var7[var5]];
								} else if (var32 == 34) {
									class542.Interpreter_intLocals[var7[var5]] = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
								} else if (var32 == 35) {
									Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = LoginPacket.Interpreter_stringLocals[var7[var5]];
								} else if (var32 == 36) {
									LoginPacket.Interpreter_stringLocals[var7[var5]] = Interpreter.Interpreter_stringStack[--HealthBarConfig.Interpreter_stringStackSize];
								} else if (var32 == 37) {
									var13 = var7[var5];
									HealthBarConfig.Interpreter_stringStackSize -= var13;
									var20 = ArchiveDiskActionHandler.method7668(Interpreter.Interpreter_stringStack, HealthBarConfig.Interpreter_stringStackSize, var13);
									Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var20;
								} else if (var32 == 38) {
									--ScriptFrame.Interpreter_intStackSize;
								} else if (var32 == 39) {
									--HealthBarConfig.Interpreter_stringStackSize;
								} else {
									int var17;
									if (var32 != 40) {
										if (var32 == 42) {
											Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = HttpRequestTask.varcs.getInt(var7[var5]);
										} else if (var32 == 43) {
											HttpRequestTask.varcs.setInt(var7[var5], Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
										} else if (var32 == 44) {
											var13 = var7[var5] >> 16;
											var14 = var7[var5] & 65535;
											int var23 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
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
											var14 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
												throw new RuntimeException();
											}

											Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14];
										} else if (var32 == 46) {
											var13 = var7[var5];
											ScriptFrame.Interpreter_intStackSize -= 2;
											var14 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
											if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
												throw new RuntimeException();
											}

											Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
										} else if (var32 == 49) {
											String var21 = HttpRequestTask.varcs.getString(var7[var5]);
											Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var21;
										} else if (var32 == 50) {
											HttpRequestTask.varcs.setString(var7[var5], Interpreter.Interpreter_stringStack[--HealthBarConfig.Interpreter_stringStackSize]);
										} else if (var32 == 60) {
											IterableNodeHashTable var36 = var1.switches[var7[var5]];
											IntegerNode var37 = (IntegerNode)var36.get((long)Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
											if (var37 != null) {
												var5 += var37.integer;
											}
										} else {
											Integer var38;
											if (var32 == 74) {
												var38 = WorldMapLabelSize.field3082.getTitleGroupValue(var7[var5]);
												if (var38 == null) {
													Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var38;
												}
											} else {
												if (var32 != 76) {
													throw new IllegalStateException();
												}

												var38 = Client.field803.method9506(var7[var5]);
												if (var38 == null) {
													Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var38;
												}
											}
										}
									} else {
										if (Interpreter.Interpreter_frameDepth == 50) {
											throw new RuntimeException();
										}

										var13 = var7[var5];
										Script var35 = GameEngine.getScript(var13);
										int[] var15 = new int[var35.localIntCount];
										String[] var16 = new String[var35.localStringCount];

										for (var17 = 0; var17 < var35.intArgumentCount; ++var17) {
											var15[var17] = Interpreter.Interpreter_intStack[var17 + (ScriptFrame.Interpreter_intStackSize - var35.intArgumentCount)];
										}

										for (var17 = 0; var17 < var35.stringArgumentCount; ++var17) {
											var16[var17] = Interpreter.Interpreter_stringStack[var17 + (HealthBarConfig.Interpreter_stringStackSize - var35.stringArgumentCount)];
										}

										ScriptFrame.Interpreter_intStackSize -= var35.intArgumentCount;
										HealthBarConfig.Interpreter_stringStackSize -= var35.stringArgumentCount;
										ScriptFrame var22 = new ScriptFrame();
										var22.script = var1;
										var22.pc = var5;
										var22.intLocals = class542.Interpreter_intLocals;
										var22.stringLocals = LoginPacket.Interpreter_stringLocals;
										Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var22;
										var1 = var35;
										var6 = var35.opcodes;
										var7 = var35.intOperands;
										var5 = -1;
										class542.Interpreter_intLocals = var15;
										LoginPacket.Interpreter_stringLocals = var16;
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
						class255.RunException_sendStackTrace(var26.toString(), var30);
						var29 = false;
						break label928;
					}
				} finally {
					if (var29) {
						while (Interpreter.field863.size() > 0) {
							class107 var19 = (class107)Interpreter.field863.remove(0);
							UrlRequester.widgetDefaultMenuAction(var19.method3090(), var19.method3081(), var19.method3082(), var19.method3083(), "");
						}

						if (Interpreter.field850) {
							Interpreter.field850 = false;
							AbstractByteArrayCopier.method7584();
						}

						if (!var9 && var3 > 0 && var10 >= var3) {
							class255.RunException_sendStackTrace("Warning: Script " + var1.field1004 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
						}

					}
				}

				while (Interpreter.field863.size() > 0) {
					class107 var40 = (class107)Interpreter.field863.remove(0);
					UrlRequester.widgetDefaultMenuAction(var40.method3090(), var40.method3081(), var40.method3082(), var40.method3083(), "");
				}

				if (Interpreter.field850) {
					Interpreter.field850 = false;
					AbstractByteArrayCopier.method7584();
				}

				if (!var9 && var3 > 0 && var10 >= var3) {
					class255.RunException_sendStackTrace("Warning: Script " + var1.field1004 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
				}

				return;
			}

			while (Interpreter.field863.size() > 0) {
				class107 var25 = (class107)Interpreter.field863.remove(0);
				UrlRequester.widgetDefaultMenuAction(var25.method3090(), var25.method3081(), var25.method3082(), var25.method3083(), "");
			}

			if (Interpreter.field850) {
				Interpreter.field850 = false;
				AbstractByteArrayCopier.method7584();
			}

			if (!var9 && var3 > 0 && var10 >= var3) {
				class255.RunException_sendStackTrace("Warning: Script " + var1.field1004 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
			}

			return;
		}

		while (Interpreter.field863.size() > 0) {
			class107 var33 = (class107)Interpreter.field863.remove(0);
			UrlRequester.widgetDefaultMenuAction(var33.method3090(), var33.method3081(), var33.method3082(), var33.method3083(), "");
		}

		if (Interpreter.field850) {
			Interpreter.field850 = false;
			AbstractByteArrayCopier.method7584();
		}

		if (!var9 && var3 > 0 && var10 >= var3) {
			class255.RunException_sendStackTrace("Warning: Script " + var1.field1004 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
		}

	}
}
