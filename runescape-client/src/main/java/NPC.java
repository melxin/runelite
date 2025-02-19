import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1974964299
	)
	static int field1377;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -621727943
	)
	static int field1381;
	@ObfuscatedName("ae")
	public static short[] field1378;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	@Export("definition")
	NPCComposition definition;
	@ObfuscatedName("ay")
	boolean field1371;
	@ObfuscatedName("au")
	String field1372;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 930919269
	)
	int field1379;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lvn;"
	)
	class569 field1375;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	NpcOverrides field1376;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	@Export("chatheadOverrides")
	NpcOverrides chatheadOverrides;

	static {
		field1377 = 1;
		field1381 = 1;
	}

	NPC(int var1) {
		super(var1);
		this.field1371 = false;
		this.field1372 = "";
		this.field1379 = 31;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "51"
	)
	void method2868(String var1) {
		this.field1372 = var1 == null ? "" : var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Ljf;",
		garbageValue = "-516720946"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.field1265 != -1 && super.field1268 == 0 ? WorldMapData_1.SequenceDefinition_get(super.field1265) : null;
			SequenceDefinition var2 = super.field1261 == -1 || super.idleSequence == super.field1261 && var1 != null ? null : WorldMapData_1.SequenceDefinition_get(super.field1261);
			Model var3 = null;
			if (this.field1376 != null && this.field1376.useLocalPlayer) {
				var3 = class132.localPlayer.appearance.getModel(var1, super.field1266, var2, super.movementFrame);
			} else {
				var3 = this.definition.getModel(var1, super.field1266, var2, super.movementFrame, this.field1376);
			}

			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				int var4 = var3.field2884;
				var3 = this.method2600(var3);
				if (this.definition.size == 1) {
					var3.isSingleTile = true;
				}

				if (super.field1286.method5437() && Client.cycle >= super.field1280 && Client.cycle < super.field1281) {
					var3.method5295(super.field1286, (short)var4);
				} else {
					var3.method5296();
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1600740059"
	)
	void method2853(int var1) {
		this.field1379 = var1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1054830188"
	)
	boolean method2854(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1379 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-2105402224"
	)
	final String method2855() {
		if (!this.field1372.isEmpty()) {
			return this.field1372;
		} else {
			NPCComposition var1 = this.definition;
			if (var1.transforms != null) {
				var1 = var1.transform();
				if (var1 == null) {
					var1 = this.definition;
				}
			}

			return var1.name;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILkn;I)V",
		garbageValue = "1731449205"
	)
	final void method2856(int var1, MoveSpeed var2) {
		int var3 = super.field1287[0];
		int var4 = super.field1288[0];
		if (var1 == 0) {
			--var3;
			++var4;
		}

		if (var1 == 1) {
			++var4;
		}

		if (var1 == 2) {
			++var3;
			++var4;
		}

		if (var1 == 3) {
			--var3;
		}

		if (var1 == 4) {
			++var3;
		}

		if (var1 == 5) {
			--var3;
			--var4;
		}

		if (var1 == 6) {
			--var4;
		}

		if (var1 == 7) {
			++var3;
			--var4;
		}

		if (super.field1265 != -1 && WorldMapData_1.SequenceDefinition_get(super.field1265).field2374 == 1) {
			super.field1265 = -1;
		}

		this.method2590(var3, var4, var2);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "1534401578"
	)
	final void method2901(int var1, int var2, boolean var3) {
		if (super.field1265 != -1 && WorldMapData_1.SequenceDefinition_get(super.field1265).field2374 == 1) {
			super.field1265 = -1;
		}

		if (!var3) {
			int var4 = var1 - super.field1287[0];
			int var5 = var2 - super.field1288[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				this.method2590(var1, var2, MoveSpeed.field3122);
				return;
			}
		}

		this.method2623(var1, var2);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "51"
	)
	int[] method2860() {
		return this.field1375 != null ? this.field1375.method10492() : this.definition.method3947();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "-1589499069"
	)
	short[] method2861() {
		return this.field1375 != null ? this.field1375.method10491() : this.definition.method3934();
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IISI)V",
		garbageValue = "1191258711"
	)
	void method2852(int var1, int var2, short var3) {
		if (this.field1375 == null) {
			this.field1375 = new class569(this.definition);
		}

		this.field1375.method10494(var1, var2, var3);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([I[SI)V",
		garbageValue = "1607254038"
	)
	void method2926(int[] var1, short[] var2) {
		if (this.field1375 == null) {
			this.field1375 = new class569(this.definition);
		}

		this.field1375.method10495(var1, var2);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-62"
	)
	void method2864() {
		this.field1375 = null;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lhw;I)V",
		garbageValue = "-611003708"
	)
	void method2865(NpcOverrides var1) {
		this.chatheadOverrides = var1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "657986527"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Lhw;",
		garbageValue = "1347620007"
	)
	NpcOverrides method2866() {
		return this.chatheadOverrides;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lhw;B)V",
		garbageValue = "-25"
	)
	void method2867(NpcOverrides var1) {
		this.field1376 = var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1371257325"
	)
	void method2851() {
		this.chatheadOverrides = null;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1808766329"
	)
	void method2869() {
		this.field1376 = null;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "28116"
	)
	int vmethod2898() {
		return this.definition.field2066 == -1 ? super.defaultHeight : this.definition.field2066;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ldh;Ldy;IIB)V",
		garbageValue = "69"
	)
	@Export("runScriptLogic")
	static void runScriptLogic(ScriptEvent var0, Script var1, int var2, int var3) {
		Object[] var4 = var0.args;
		HealthBarConfig.Interpreter_intStackSize = 0;
		Interpreter.Interpreter_stringStackSize = 0;
		int var5 = -1;
		int[] var6 = var1.opcodes;
		int[] var7 = var1.intOperands;
		byte var8 = -1;
		Interpreter.Interpreter_frameDepth = 0;
		Interpreter.field881 = false;
		boolean var9 = false;
		int var10 = 0;
		boolean var29 = false;

		label928: {
			label929: {
				try {
					int var13;
					try {
						var29 = true;
						Interpreter.Interpreter_intLocals = new int[var1.localIntCount];
						int var11 = 0;
						Interpreter.Interpreter_stringLocals = new String[var1.localStringCount];
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
									var14 = var0.field1091;
								}

								Interpreter.Interpreter_intLocals[var11++] = var14;
							} else if (var4[var13] instanceof String) {
								var20 = (String)var4[var13];
								if (var20.equals("event_opbase")) {
									var20 = var0.targetName;
								}

								Interpreter.Interpreter_stringLocals[var12++] = var20;
							}
						}

						Interpreter.field884 = var0.field1102;

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

								var14 = class435.method8220(var32, var1, var34);
								switch(var14) {
								case 0:
									var29 = false;
									break label929;
								case 1:
								default:
									break;
								case 2:
									throw new IllegalStateException();
								}
							} else if (var32 == 0) {
								Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var7[var5];
							} else if (var32 == 1) {
								var13 = var7[var5];
								Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = Varps.Varps_main[var13];
							} else if (var32 == 2) {
								var13 = var7[var5];
								Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
								DevicePcmPlayerProvider.changeGameOptions(var13);
							} else if (var32 == 3) {
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var1.stringOperands[var5];
							} else if (var32 == 6) {
								var5 += var7[var5];
							} else if (var32 == 7) {
								HealthBarConfig.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 8) {
								HealthBarConfig.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 9) {
								HealthBarConfig.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 10) {
								HealthBarConfig.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1]) {
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
								Interpreter.Interpreter_stringLocals = var39.stringLocals;
							} else if (var32 == 25) {
								var13 = var7[var5];
								Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = class241.getVarbit(var13);
							} else if (var32 == 27) {
								var13 = var7[var5];
								class131.method3273(var13, Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize]);
							} else if (var32 == 31) {
								HealthBarConfig.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 32) {
								HealthBarConfig.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 33) {
								Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = Interpreter.Interpreter_intLocals[var7[var5]];
							} else if (var32 == 34) {
								Interpreter.Interpreter_intLocals[var7[var5]] = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
							} else if (var32 == 35) {
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = Interpreter.Interpreter_stringLocals[var7[var5]];
							} else if (var32 == 36) {
								Interpreter.Interpreter_stringLocals[var7[var5]] = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
							} else if (var32 == 37) {
								var13 = var7[var5];
								Interpreter.Interpreter_stringStackSize -= var13;
								var20 = class359.method6944(Interpreter.Interpreter_stringStack, Interpreter.Interpreter_stringStackSize, var13);
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var20;
							} else if (var32 == 38) {
								--HealthBarConfig.Interpreter_intStackSize;
							} else if (var32 == 39) {
								--Interpreter.Interpreter_stringStackSize;
							} else {
								int var17;
								if (var32 != 40) {
									if (var32 == 42) {
										Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = class322.varcs.getInt(var7[var5]);
									} else if (var32 == 43) {
										class322.varcs.setInt(var7[var5], Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize]);
									} else if (var32 == 44) {
										var13 = var7[var5] >> 16;
										var14 = var7[var5] & 65535;
										int var23 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
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
										var14 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
										if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
											throw new RuntimeException();
										}

										Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14];
									} else if (var32 == 46) {
										var13 = var7[var5];
										HealthBarConfig.Interpreter_intStackSize -= 2;
										var14 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
										if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
											throw new RuntimeException();
										}

										Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
									} else if (var32 == 49) {
										String var21 = class322.varcs.getString(var7[var5]);
										Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var21;
									} else if (var32 == 50) {
										class322.varcs.setString(var7[var5], Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]);
									} else if (var32 == 60) {
										IterableNodeHashTable var36 = var1.switches[var7[var5]];
										IntegerNode var37 = (IntegerNode)var36.get((long)Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize]);
										if (var37 != null) {
											var5 += var37.integer;
										}
									} else {
										Integer var38;
										if (var32 == 74) {
											var38 = class144.field1684.getTitleGroupValue(var7[var5]);
											if (var38 == null) {
												Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var38;
											}
										} else {
											if (var32 != 76) {
												throw new IllegalStateException();
											}

											var38 = EnumComposition.field2010.method9530(var7[var5]);
											if (var38 == null) {
												Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var38;
											}
										}
									}
								} else {
									if (Interpreter.Interpreter_frameDepth == 50) {
										throw new RuntimeException();
									}

									var13 = var7[var5];
									Script var35 = Widget.getScript(var13);
									int[] var15 = new int[var35.localIntCount];
									String[] var16 = new String[var35.localStringCount];

									for (var17 = 0; var17 < var35.intArgumentCount; ++var17) {
										var15[var17] = Interpreter.Interpreter_intStack[var17 + (HealthBarConfig.Interpreter_intStackSize - var35.intArgumentCount)];
									}

									for (var17 = 0; var17 < var35.stringArgumentCount; ++var17) {
										var16[var17] = Interpreter.Interpreter_stringStack[var17 + (Interpreter.Interpreter_stringStackSize - var35.stringArgumentCount)];
									}

									HealthBarConfig.Interpreter_intStackSize -= var35.intArgumentCount;
									Interpreter.Interpreter_stringStackSize -= var35.stringArgumentCount;
									ScriptFrame var22 = new ScriptFrame();
									var22.script = var1;
									var22.pc = var5;
									var22.intLocals = Interpreter.Interpreter_intLocals;
									var22.stringLocals = Interpreter.Interpreter_stringLocals;
									Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var22;
									var1 = var35;
									var6 = var35.opcodes;
									var7 = var35.intOperands;
									var5 = -1;
									Interpreter.Interpreter_intLocals = var15;
									Interpreter.Interpreter_stringLocals = var16;
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
								class213.RunException_sendStackTrace(var26.toString(), var30);
								var29 = false;
								break;
							}

							var26.append("").append(Interpreter.Interpreter_frames[var13].script.key).append(" ");
							--var13;
						}
					}
				} finally {
					if (var29) {
						while (Interpreter.field868.size() > 0) {
							class106 var19 = (class106)Interpreter.field868.remove(0);
							class449.widgetDefaultMenuAction(var19.method2935(), var19.method2936(), var19.method2937(), var19.method2938(), "");
						}

						if (Interpreter.field881) {
							Interpreter.field881 = false;
							class179.method3771();
						}

						if (!var9 && var3 > 0 && var10 >= var3) {
							class213.RunException_sendStackTrace("Warning: Script " + var1.field1019 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
						}

					}
				}

				while (Interpreter.field868.size() > 0) {
					class106 var25 = (class106)Interpreter.field868.remove(0);
					class449.widgetDefaultMenuAction(var25.method2935(), var25.method2936(), var25.method2937(), var25.method2938(), "");
				}

				if (Interpreter.field881) {
					Interpreter.field881 = false;
					class179.method3771();
				}

				if (!var9 && var3 > 0 && var10 >= var3) {
					class213.RunException_sendStackTrace("Warning: Script " + var1.field1019 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
				}

				return;
			}

			while (Interpreter.field868.size() > 0) {
				class106 var33 = (class106)Interpreter.field868.remove(0);
				class449.widgetDefaultMenuAction(var33.method2935(), var33.method2936(), var33.method2937(), var33.method2938(), "");
			}

			if (Interpreter.field881) {
				Interpreter.field881 = false;
				class179.method3771();
			}

			if (!var9 && var3 > 0 && var10 >= var3) {
				class213.RunException_sendStackTrace("Warning: Script " + var1.field1019 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
			}

			return;
		}

		while (Interpreter.field868.size() > 0) {
			class106 var40 = (class106)Interpreter.field868.remove(0);
			class449.widgetDefaultMenuAction(var40.method2935(), var40.method2936(), var40.method2937(), var40.method2938(), "");
		}

		if (Interpreter.field881) {
			Interpreter.field881 = false;
			class179.method3771();
		}

		if (!var9 && var3 > 0 && var10 >= var3) {
			class213.RunException_sendStackTrace("Warning: Script " + var1.field1019 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "100"
	)
	@Export("focusPasswordWhenUsernameFilled")
	static void focusPasswordWhenUsernameFilled() {
		if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
			Login.currentLoginField = 1;
		} else {
			Login.currentLoginField = 0;
		}

	}
}
