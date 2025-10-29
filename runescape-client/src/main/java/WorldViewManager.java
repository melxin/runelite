import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cv")
@Implements("WorldViewManager")
public class WorldViewManager implements Iterable {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	@Export("worldViews")
	final IterableNodeHashTable worldViews;
	@ObfuscatedName("at")
	final HashMap field982;
	@ObfuscatedName("ag")
	final HashMap field983;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Luv;"
	)
	class526 field986;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Luf;"
	)
	class524 field985;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	@Export("worldView")
	WorldView worldView;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 492420025
	)
	int field988;

	WorldViewManager() {
		this.worldViews = new IterableNodeHashTable(16);
		this.field982 = new HashMap(16);
		this.field983 = new HashMap(16);
		this.field988 = 0;
		this.clear();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Ldd;",
		garbageValue = "-42"
	)
	@Export("createWorldView")
	WorldView createWorldView(int var1, int var2, int var3) {
		this.worldView = this.createWorldView2(-1, var1, var2, var3, TileRenderMode.field2669);
		return this.worldView;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIILjn;I)Ldd;",
		garbageValue = "1833387737"
	)
	@Export("createWorldView2")
	WorldView createWorldView2(int var1, int var2, int var3, int var4, TileRenderMode var5) {
		WorldView var6 = new WorldView(var1, var2, var3, var4, var5);
		this.worldViews.put(var6, (long)var1);
		++this.field988;
		return var6;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "753377245"
	)
	@Export("removeWorldViewById")
	void removeWorldViewById(int var1) {
		WorldView var2 = (WorldView)this.worldViews.get((long)var1);
		this.removeWorldView(var2);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ldd;S)V",
		garbageValue = "-17095"
	)
	@Export("removeWorldView")
	void removeWorldView(WorldView var1) {
		if (var1 != null) {
			this.field982.remove(var1.id);
			this.field983.remove(var1.id);
			var1.method2770();
			var1.remove();
			--this.field988;
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)Ldd;",
		garbageValue = "1"
	)
	@Export("getWorldView")
	public WorldView getWorldView(int var1) {
		return (WorldView)this.worldViews.get((long)var1);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Ldd;",
		garbageValue = "-26"
	)
	public WorldView method2394() {
		return this.worldView;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Ldd;",
		garbageValue = "1"
	)
	@Export("getWorldView")
	WorldView getWorldView() {
		return this.getWorldView(Client.currentWorldViewId);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)Ldd;",
		garbageValue = "-896670169"
	)
	@Export("getWorldViewFromWorldPoint")
	WorldView getWorldViewFromWorldPoint(int var1, int var2) {
		Iterator var3 = this.iterator();

		while (var3.hasNext()) {
			WorldView var4 = (WorldView)var3.next();
			if (var4.id != -1) {
				int var5 = var4.baseX;
				int var6 = var4.baseY;
				int var7 = var5 + var4.sizeX;
				int var8 = var6 + var4.sizeY;
				if (var1 >= var5 && var2 >= var6 && var1 < var7 && var2 < var8) {
					return var4;
				}
			}
		}

		return this.worldView;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lci;",
		garbageValue = "1069843077"
	)
	Player method2390() {
		return this.getWorldView(Client.currentWorldViewId).method2769(Client.localPlayerIndex);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Lts;",
		garbageValue = "-1209535253"
	)
	WorldEntity method2391(int var1) {
		return (WorldEntity)this.method2394().worldEntities.get((long)var1);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Lts;",
		garbageValue = "95303638"
	)
	WorldEntity method2411() {
		return (WorldEntity)this.method2394().worldEntities.get((long)Client.currentWorldViewId);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lrx;",
		garbageValue = "25158689"
	)
	ProjectionCoord method2393() {
		WorldView var1 = this.getWorldView();
		Player var2 = var1.method2769(Client.localPlayerIndex);
		ProjectionCoord var3 = class86.method2932(var1, var2.getY(), var2.getPlane());
		var3.z = (float)var2.getX();
		return var3;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "751747207"
	)
	int method2387() {
		return this.field988;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Luv;Luf;I)V",
		garbageValue = "-2019849903"
	)
	void method2395(class526 var1, class524 var2) {
		this.field986 = var1;
		this.field985 = var2;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILuv;Luf;I)V",
		garbageValue = "600103470"
	)
	void method2417(int var1, class526 var2, class524 var3) {
		this.field982.put(var1, var2);
		this.field983.put(var1, var3);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-92"
	)
	void method2389(int var1) {
		this.field982.remove(var1);
		this.field983.remove(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Luv;",
		garbageValue = "-19345525"
	)
	class526 method2398(int var1) {
		class526 var2 = (class526)this.field982.get(var1);
		return var2 != null ? var2 : this.field986;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Luf;",
		garbageValue = "385247347"
	)
	class524 method2399(int var1) {
		class524 var2 = (class524)this.field983.get(var1);
		return var2 != null ? var2 : this.field985;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-52"
	)
	@Export("clear")
	void clear() {
		Iterator var1 = this.worldViews.iterator();

		while (var1.hasNext()) {
			WorldView var2 = (WorldView)var1.next();
			this.removeWorldView(var2);
		}

		this.worldViews.clear();
		this.field988 = 0;
		this.field982.clear();
		this.field983.clear();
		this.field986 = class526.field5582;
		this.field985 = class524.field5562;
		if (this.worldView != null) {
			this.worldView.method2792();
			this.worldViews.put(this.worldView, -1L);
			this.field988 = 1;
		}

	}

	public Iterator iterator() {
		return this.worldViews.iterator();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2138868602"
	)
	public static void method2422() {
		VarbitComposition.VarbitDefinition_cached.clear();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lcg;Lcu;III)V",
		garbageValue = "1369353301"
	)
	@Export("runScriptLogic")
	static void runScriptLogic(ScriptEvent var0, Script var1, int var2, int var3) {
		Object[] var4 = var0.args;
		class408.Interpreter_intStackSize = 0;
		SecureRandomFuture.Interpreter_objectStackSize = 0;
		int var5 = -1;
		int[] var6 = var1.opcodes;
		int[] var7 = var1.intOperands;
		byte var8 = -1;
		Interpreter.Interpreter_frameDepth = 0;
		Interpreter.field620 = false;
		boolean var9 = false;
		Interpreter.field615 = 0;
		boolean var26 = false;

		label903: {
			label904: {
				try {
					int var12;
					try {
						var26 = true;
						class251.Interpreter_intLocals = new int[var1.localIntCount];
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
									var13 = var0.widget != null ? var0.widget.childIndex * 2077538819 : -1;
								}

								if (var13 == -2147483642) {
									var13 = var0.dragTarget != null ? var0.dragTarget.id : -1;
								}

								if (var13 == -2147483641) {
									var13 = var0.dragTarget != null ? var0.dragTarget.childIndex * 2077538819 : -1;
								}

								if (var13 == -2147483640) {
									var13 = var0.keyTyped;
								}

								if (var13 == -2147483639) {
									var13 = var0.keyPressed;
								}

								if (var13 == -2147483638) {
									var13 = var0.field852;
								}

								class251.Interpreter_intLocals[var10++] = var13;
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

						Interpreter.field608 = var0.field857;

						while (true) {
							++Interpreter.field615;
							if (Interpreter.field615 > var2) {
								throw new RuntimeException();
							}

							++var5;
							int var29 = var6[var5];
							if (var29 < 100) {
								if (var29 == 0) {
									Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var7[var5];
								} else if (var29 == 1) {
									var12 = var7[var5];
									Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Varps.Varps_main[var12];
								} else if (var29 == 2) {
									var12 = var7[var5];
									Varps.Varps_main[var12] = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
									Huffman.changeGameOptions(var12);
								} else if (var29 == 3) {
									Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var1.stringOperands[var5];
								} else if (var29 == 6) {
									var5 += var7[var5];
								} else if (var29 == 7) {
									class408.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1]) {
										var5 += var7[var5];
									}
								} else if (var29 == 8) {
									class408.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1]) {
										var5 += var7[var5];
									}
								} else if (var29 == 9) {
									class408.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1]) {
										var5 += var7[var5];
									}
								} else if (var29 == 10) {
									class408.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1]) {
										var5 += var7[var5];
									}
								} else if (var29 == 21) {
									if (Interpreter.Interpreter_frameDepth == 0) {
										var26 = false;
										break label903;
									}

									ScriptFrame var37 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth];
									var1 = var37.script;
									var6 = var1.opcodes;
									var7 = var1.intOperands;
									var5 = var37.pc;
									class251.Interpreter_intLocals = var37.intLocals;
									Interpreter.Interpreter_objectLocals = var37.stringLocals;
								} else if (var29 == 25) {
									var12 = var7[var5];
									Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = WorldMapData_1.getVarbit(var12);
								} else if (var29 == 27) {
									var12 = var7[var5];
									VarbitComposition.method4678(var12, Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize]);
								} else if (var29 == 31) {
									class408.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1]) {
										var5 += var7[var5];
									}
								} else if (var29 == 32) {
									class408.Interpreter_intStackSize -= 2;
									if (Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1]) {
										var5 += var7[var5];
									}
								} else if (var29 == 33) {
									Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = class251.Interpreter_intLocals[var7[var5]];
								} else if (var29 == 34) {
									class251.Interpreter_intLocals[var7[var5]] = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
								} else if (var29 == 35) {
									Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = Interpreter.Interpreter_objectLocals[var7[var5]];
								} else if (var29 == 36) {
									Interpreter.Interpreter_objectLocals[var7[var5]] = Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
								} else if (var29 == 37) {
									var12 = var7[var5];
									SecureRandomFuture.Interpreter_objectStackSize -= var12;
									var19 = WorldMapData_0.method6567(Interpreter.Interpreter_objectStack, SecureRandomFuture.Interpreter_objectStackSize, var12);
									Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var19;
								} else if (var29 == 38) {
									--class408.Interpreter_intStackSize;
								} else if (var29 == 39) {
									--SecureRandomFuture.Interpreter_objectStackSize;
								} else if (var29 == 40) {
									if (Interpreter.Interpreter_frameDepth == 50) {
										throw new RuntimeException();
									}

									var12 = var7[var5];
									Script var33 = class383.getScript(var12);
									int[] var14 = new int[var33.localIntCount];
									Object[] var15 = new Object[var33.localStringCount];
									if (var33.intArgumentCount >= 0) {
										System.arraycopy(Interpreter.Interpreter_intStack, class408.Interpreter_intStackSize - var33.intArgumentCount + 0, var14, 0, var33.intArgumentCount);
									}

									if (var33.stringArgumentCount >= 0) {
										System.arraycopy(Interpreter.Interpreter_objectStack, SecureRandomFuture.Interpreter_objectStackSize - var33.stringArgumentCount + 0, var15, 0, var33.stringArgumentCount);
									}

									class408.Interpreter_intStackSize -= var33.intArgumentCount;
									SecureRandomFuture.Interpreter_objectStackSize -= var33.stringArgumentCount;
									ScriptFrame var16 = new ScriptFrame();
									var16.script = var1;
									var16.pc = var5;
									var16.intLocals = class251.Interpreter_intLocals;
									var16.stringLocals = Interpreter.Interpreter_objectLocals;
									Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var16;
									var1 = var33;
									var6 = var33.opcodes;
									var7 = var33.intOperands;
									var5 = -1;
									class251.Interpreter_intLocals = var14;
									Interpreter.Interpreter_objectLocals = var15;
								} else if (var29 == 42) {
									Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = class166.varcs.getInt(var7[var5]);
								} else if (var29 == 43) {
									class166.varcs.setInt(var7[var5], Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize]);
								} else if (var29 == 44) {
									var12 = var7[var5] >> 16;
									var13 = var7[var5] & 65535;
									int var21 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
									if (var21 < 0 || var21 > 5000) {
										throw new RuntimeException();
									}

									if (var13 == 115) {
										Interpreter.Interpreter_objectLocals[var12] = new DynamicArray(class586.field5939, "", var21, var21);
									} else if (var13 != 105 && var13 != 49) {
										Interpreter.Interpreter_objectLocals[var12] = new DynamicArray(class586.field5937, -1, var21, var21);
									} else {
										Interpreter.Interpreter_objectLocals[var12] = new DynamicArray(class586.field5937, 0, var21, var21);
									}
								} else {
									DynamicArray var20;
									if (var29 == 45) {
										var20 = class66.method2205(var7[var5], Interpreter.Interpreter_objectLocals[var7[var5]]);
										var13 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
										class31.method490(var20, var13);
										if (var20.field5584 == class586.field5937) {
											Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var20.method10650()[var13];
										} else {
											Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var20.method10681()[var13];
										}
									} else if (var29 == 46) {
										var20 = class66.method2205(var7[var5], Interpreter.Interpreter_objectLocals[var7[var5]]);
										if (!var20.field5585) {
											throw new RuntimeException();
										}

										if (var20.field5584 == class586.field5937) {
											class408.Interpreter_intStackSize -= 2;
											var13 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
											class31.method490(var20, var13);
											var20.method10650()[var13] = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
										} else {
											var13 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
											class31.method490(var20, var13);
											var20.method10681()[var13] = Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize];
										}
									} else if (var29 == 49) {
										String var34 = class166.varcs.getString(var7[var5]);
										Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var34;
									} else if (var29 == 50) {
										class166.varcs.setString(var7[var5], (String)Interpreter.Interpreter_objectStack[--SecureRandomFuture.Interpreter_objectStackSize]);
									} else if (var29 == 60) {
										IterableNodeHashTable var35 = var1.switches[var7[var5]];
										IntegerNode var32 = (IntegerNode)var35.get((long)Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize]);
										if (var32 != null) {
											var5 += var32.integer;
										}
									} else if (var29 == 63) {
										Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = null;
									} else {
										Integer var36;
										if (var29 == 74) {
											var36 = FontName.field5871.getTitleGroupValue(var7[var5]);
											if (var36 == null) {
												Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var36;
											}
										} else {
											if (var29 != 76) {
												throw new IllegalStateException();
											}

											var36 = class4.field4.method10788(var7[var5]);
											if (var36 == null) {
												Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var36;
											}
										}
									}
								}
							} else {
								boolean var30 = var1.intOperands[var5] == 1;
								var13 = FontName.method11266(var29, var1, var30);
								switch(var13) {
								case 0:
									var26 = false;
									break label904;
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
								PlayerType.RunException_sendStackTrace(var23.toString(), var27);
								var26 = false;
								break;
							}

							var23.append("").append(Interpreter.Interpreter_frames[var12].script.key).append(" ");
							--var12;
						}
					}
				} finally {
					if (var26) {
						while (!Interpreter.field621.isEmpty()) {
							class82 var18 = (class82)Interpreter.field621.remove(0);
							FontName.widgetDefaultMenuAction(var18.method2884(), var18.method2886(), var18.method2885(), var18.method2893(), "");
						}

						if (Interpreter.field620) {
							Interpreter.field620 = false;
							Login.method1967();
						}

						if (!var9 && var3 > 0 && Interpreter.field615 >= var3) {
							PlayerType.RunException_sendStackTrace("Warning: Script " + var1.field754 + " finished at op count " + Interpreter.field615 + " of max " + var2, (Throwable)null);
						}

					}
				}

				while (!Interpreter.field621.isEmpty()) {
					class82 var22 = (class82)Interpreter.field621.remove(0);
					FontName.widgetDefaultMenuAction(var22.method2884(), var22.method2886(), var22.method2885(), var22.method2893(), "");
				}

				if (Interpreter.field620) {
					Interpreter.field620 = false;
					Login.method1967();
				}

				if (!var9 && var3 > 0 && Interpreter.field615 >= var3) {
					PlayerType.RunException_sendStackTrace("Warning: Script " + var1.field754 + " finished at op count " + Interpreter.field615 + " of max " + var2, (Throwable)null);
				}

				return;
			}

			while (!Interpreter.field621.isEmpty()) {
				class82 var31 = (class82)Interpreter.field621.remove(0);
				FontName.widgetDefaultMenuAction(var31.method2884(), var31.method2886(), var31.method2885(), var31.method2893(), "");
			}

			if (Interpreter.field620) {
				Interpreter.field620 = false;
				Login.method1967();
			}

			if (!var9 && var3 > 0 && Interpreter.field615 >= var3) {
				PlayerType.RunException_sendStackTrace("Warning: Script " + var1.field754 + " finished at op count " + Interpreter.field615 + " of max " + var2, (Throwable)null);
			}

			return;
		}

		while (!Interpreter.field621.isEmpty()) {
			class82 var38 = (class82)Interpreter.field621.remove(0);
			FontName.widgetDefaultMenuAction(var38.method2884(), var38.method2886(), var38.method2885(), var38.method2893(), "");
		}

		if (Interpreter.field620) {
			Interpreter.field620 = false;
			Login.method1967();
		}

		if (!var9 && var3 > 0 && Interpreter.field615 >= var3) {
			PlayerType.RunException_sendStackTrace("Warning: Script " + var1.field754 + " finished at op count " + Interpreter.field615 + " of max " + var2, (Throwable)null);
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "15"
	)
	public static void method2453() {
		DbRowType.DBRowType_cache.clear();
	}
}
