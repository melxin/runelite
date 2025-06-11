import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ae")
@Implements("AsyncHttpResponse")
public class AsyncHttpResponse {
	@ObfuscatedName("ap")
	@Export("responseFuture")
	Future responseFuture;
	@ObfuscatedName("aj")
	@Export("errorMessage")
	String errorMessage;

	AsyncHttpResponse(Future var1) {
		this.responseFuture = var1;
	}

	AsyncHttpResponse(String var1) {
		this.method284(var1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "304"
	)
	@Export("getErrorMessage")
	public final String getErrorMessage() {
		return this.errorMessage;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "16711680"
	)
	void method284(String var1) {
		if (var1 == null) {
			var1 = "";
		}

		this.errorMessage = var1;
		if (this.responseFuture != null) {
			this.responseFuture.cancel(true);
			this.responseFuture = null;
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2060426607"
	)
	@Export("hasError")
	public boolean hasError() {
		return this.errorMessage != null || this.responseFuture == null;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-366500020"
	)
	@Export("hasFinished")
	public final boolean hasFinished() {
		return this.hasError() ? true : this.responseFuture.isDone();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Lao;",
		garbageValue = "0"
	)
	@Export("await")
	public final HttpResponse await() {
		if (this.hasError()) {
			return new HttpResponse(this.errorMessage);
		} else if (!this.hasFinished()) {
			return null;
		} else {
			try {
				return (HttpResponse)this.responseFuture.get();
			} catch (Exception var3) {
				String var2 = "Error retrieving REST request reply";
				System.err.println(var2 + "\r\n" + var3);
				this.method284(var2);
				return new HttpResponse(var2);
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILcr;ZB)I",
		garbageValue = "-57"
	)
	static int method288(int var0, Script var1, boolean var2) {
		int var3;
		int var5;
		int var16;
		Widget var20;
		Widget var23;
		if (var0 == ScriptOpcodes.CC_CREATE) {
			Interpreter.Interpreter_intStackSize -= 4;
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			var16 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
			boolean var26 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3] != 0;
			var23 = ClientPreferences.widgetDefinition.method7286(var3);
			if (var23.type != 0) {
				throw new RuntimeException("");
			} else {
				UserComparator8.method3388(var23, var5, var26, var1);
				var20 = new Widget();
				var20.type = var16;
				var20.parentId = var20.id = var23.id;
				var20.childIndex = var5 * 926100227;
				var20.isIf3 = true;
				if (var16 == 12) {
					SoundCache.method2983(var20);
				}

				var23.children[var5] = var20;
				if (var2) {
					class539.scriptDotWidget = var20;
				} else {
					Huffman.scriptActiveWidget = var20;
				}

				ScriptFrame.invalidateWidget(var23);
				return 1;
			}
		} else {
			Widget var19;
			Widget var21;
			if (var0 == ScriptOpcodes.CC_DELETE) {
				var19 = var2 ? class539.scriptDotWidget : Huffman.scriptActiveWidget;
				var21 = ClientPreferences.widgetDefinition.method7286(var19.id);
				class424.method8365(var19, var21);
				ScriptFrame.invalidateWidget(var21);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) {
				--Interpreter.Interpreter_intStackSize;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var21 = ClientPreferences.widgetDefinition.method7286(var3);
				var21.children = null;
				ScriptFrame.invalidateWidget(var21);
				return 1;
			} else {
				Widget var22;
				if (var0 == 105) {
					Interpreter.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
					var16 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
					var22 = ClientPreferences.widgetDefinition.method7286(var3);
					var23 = ClientPreferences.widgetDefinition.getWidgetChild(var3, var16);
					if (var22 == null) {
						throw new RuntimeException("");
					} else if (var16 < 0) {
						throw new RuntimeException("");
					} else if (var23 == null) {
						throw new RuntimeException("");
					} else if (var23.type == 0) {
						throw new RuntimeException("");
					} else {
						UserComparator8.method3388(var22, var5, true, var1);
						if (var23.field4127 != -1) {
							var20 = ClientPreferences.widgetDefinition.getWidgetChild(var3, var23.field4127);
							HttpResponse.method305(var20, var5);
						}

						var20 = new Widget(var23);
						var20.childIndex = var5 * 926100227;
						if (var23.type == 12) {
							SoundCache.method2983(var20);
						}

						var22.children[var5] = var20;
						if (var2) {
							class539.scriptDotWidget = var20;
						} else {
							Huffman.scriptActiveWidget = var20;
						}

						ScriptFrame.invalidateWidget(var22);
						return 1;
					}
				} else {
					Widget var25;
					if (var0 == 106) {
						Interpreter.Interpreter_intStackSize -= 2;
						var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
						var16 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
						var25 = var2 ? class539.scriptDotWidget : Huffman.scriptActiveWidget;
						if (var25 == null) {
							throw new RuntimeException("");
						} else {
							var22 = ClientPreferences.widgetDefinition.method7286(var25.parentId);
							if (var25.type != 0) {
								throw new RuntimeException("");
							} else if (var22.type != 0) {
								throw new RuntimeException();
							} else {
								UserComparator8.method3388(var22, var16, true, var1);
								HttpResponse.method305(var25, var16);
								var23 = new Widget();
								var23.type = var3;
								var23.parentId = var23.id = var22.id;
								var23.field4127 = var25.childIndex * -744024149;
								var23.childIndex = var16 * 926100227;
								var23.isIf3 = true;
								if (var3 == 12) {
									SoundCache.method2983(var23);
								}

								var22.children[var16] = var23;
								if (var2) {
									class539.scriptDotWidget = var23;
								} else {
									Huffman.scriptActiveWidget = var23;
								}

								ScriptFrame.invalidateWidget(var22);
								return 1;
							}
						}
					} else if (var0 == 107) {
						Interpreter.Interpreter_intStackSize -= 2;
						var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
						var16 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
						var25 = var2 ? class539.scriptDotWidget : Huffman.scriptActiveWidget;
						if (var25 == null) {
							throw new RuntimeException("");
						} else {
							var22 = ClientPreferences.widgetDefinition.getWidgetChild(var25.parentId, var25.field4127);
							var23 = ClientPreferences.widgetDefinition.method7286(var22.parentId);
							if (var22.type != 0) {
								throw new RuntimeException("");
							} else if (var23.type != 0) {
								throw new RuntimeException();
							} else {
								UserComparator8.method3388(var23, var16, true, var1);
								HttpResponse.method305(var22, var16);
								var20 = new Widget();
								var20.type = var3;
								var20.parentId = var20.id = var23.id;
								var20.field4127 = var22.childIndex * -744024149;
								var20.childIndex = var16 * 926100227;
								var20.isIf3 = true;
								if (var3 == 12) {
									SoundCache.method2983(var20);
								}

								var23.children[var16] = var20;
								if (var2) {
									class539.scriptDotWidget = var20;
								} else {
									Huffman.scriptActiveWidget = var20;
								}

								ScriptFrame.invalidateWidget(var23);
								return 1;
							}
						}
					} else if (var0 == ScriptOpcodes.CC_FIND) {
						Interpreter.Interpreter_intStackSize -= 2;
						var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
						var16 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
						var25 = var16 != -1 ? ClientPreferences.widgetDefinition.getWidgetChild(var3, var16) : null;
						class33.method485(var25, var2);
						return 1;
					} else if (var0 == ScriptOpcodes.IF_FIND) {
						class33.method485(ClientPreferences.widgetDefinition.method7286(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]), var2);
						return 1;
					} else if (var0 == 204) {
						var19 = var2 ? class539.scriptDotWidget : Huffman.scriptActiveWidget;
						var21 = var19 != null ? ClientPreferences.widgetDefinition.getWidgetChild(var19.parentId, var19.field4127) : null;
						class33.method485(var21, var2);
						return 1;
					} else if (var0 == 205) {
						var19 = var2 ? class539.scriptDotWidget : Huffman.scriptActiveWidget;
						var21 = var19 != null ? ClientPreferences.widgetDefinition.method7286(var19.parentId) : null;
						class33.method485(var21, var2);
						return 1;
					} else {
						int var18;
						if (var0 == 206) {
							var19 = var2 ? class539.scriptDotWidget : Huffman.scriptActiveWidget;
							if (var19 == null) {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
								return 1;
							} else if (var19.childIndex * -744024149 == -1) {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
								return 1;
							} else {
								var21 = ClientPreferences.widgetDefinition.method7286(var19.parentId);
								var25 = null;

								for (var18 = var19.childIndex * -744024149 + 1; var18 < var21.children.length; ++var18) {
									var23 = var21.children[var18];
									if (var23 != null && var23.field4127 == var19.field4127) {
										var25 = var23;
										break;
									}
								}

								class33.method485(var25, var2);
								return 1;
							}
						} else if (var0 == 207) {
							var19 = var2 ? class539.scriptDotWidget : Huffman.scriptActiveWidget;
							if (var19 == null) {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
								return 1;
							} else if (var19.childIndex * -744024149 == -1) {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
								return 1;
							} else {
								var21 = ClientPreferences.widgetDefinition.method7286(var19.parentId);
								var25 = null;

								for (var18 = var19.childIndex * -744024149 - 1; var18 >= 0; --var18) {
									var23 = var21.children[var18];
									if (var23 != null && var19.field4127 == var23.field4127) {
										var25 = var23;
										break;
									}
								}

								class33.method485(var25, var2);
								return 1;
							}
						} else if (var0 == 208) {
							var19 = var2 ? class539.scriptDotWidget : Huffman.scriptActiveWidget;
							if (var19 == null) {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
								return 1;
							} else if (var19.type != 0) {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
								return 1;
							} else {
								var21 = ClientPreferences.widgetDefinition.method7286(var19.parentId);
								if (var21.children == null) {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
									return 1;
								} else {
									var5 = 0;

									for (var18 = 0; var18 < var21.children.length; ++var18) {
										var23 = var21.children[var18];
										if (var23 != null && var19.childIndex * -744024149 == var23.field4127) {
											++var5;
										}
									}

									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5;
									return 1;
								}
							}
						} else if (var0 == 209) {
							var19 = var2 ? class539.scriptDotWidget : Huffman.scriptActiveWidget;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var19 != null ? var19.field4127 : -1;
							return 1;
						} else {
							Object var7;
							if (var0 == 210) {
								var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
								var16 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
								Object var17 = PlayerType.method7974(var3);
								var18 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
								var7 = PlayerType.method7974(var16);
								int var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
								ParamComposition var9 = TaskHandler.getParamDefinition(var8);
								Object var10 = var9.isString() ? var9.defaultStr : var9.defaultInt;
								Object var11 = null;
								if (var18 >= 0) {
									ParamComposition var12 = TaskHandler.getParamDefinition(var18);
									var11 = var12.isString() ? var12.defaultStr : var12.defaultInt;
								}

								Widget var24 = ClientPreferences.widgetDefinition.method7286(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
								Widget var13 = null;
								if (var24 != null && var24.children != null) {
									for (int var14 = 0; var14 < var24.children.length; ++var14) {
										Widget var15 = var24.children[var14];
										if (var15 != null && (var8 < 0 || var15.method7752(var8, var10).equals(var7)) && (var18 < 0 || var15.method7752(var18, var11).equals(var17))) {
											var13 = var15;
											break;
										}
									}
								}

								class33.method485(var13, var2);
								return 1;
							} else if (var0 == 211) {
								Interpreter.Interpreter_intStackSize -= 3;
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
								var21 = ClientPreferences.widgetDefinition.method7286(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
								var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
								Interpreter.field672.method7693(var3, var21, var5);
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.field672.method7696();
								return 1;
							} else if (var0 == 212) {
								var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
								var21 = var2 ? class539.scriptDotWidget : Huffman.scriptActiveWidget;
								if (var21.childIndex * -744024149 == -1) {
									Interpreter.field672.method7693(var3, var21, -1);
								} else {
									Interpreter.field672.method7693(var3, ClientPreferences.widgetDefinition.method7286(var21.parentId), var21.childIndex * -744024149);
								}

								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.field672.method7696();
								return 1;
							} else if (var0 == 213) {
								class33.method485(Interpreter.field672.method7697(), var2);
								return 1;
							} else if (var0 == 214) {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.field672.method7705();
								return 1;
							} else if (var0 == 215) {
								Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = AddRequestTask.method9231(Interpreter.field672.method7700());
								return 1;
							} else if (var0 == 216) {
								var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
								Object var4 = PlayerType.method7974(var3);
								var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
								ParamComposition var6 = TaskHandler.getParamDefinition(var5);
								var7 = var6.isString() ? var6.defaultStr : var6.defaultInt;
								Interpreter.field672.method7713(var5, var4, var7);
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.field672.method7696();
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
