import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ks")
public class class268 {
	@ObfuscatedName("jp")
	static String field3179;
	@ObfuscatedName("ac")
	public String field3173;
	@ObfuscatedName("ap")
	public float[] field3178;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -2087214391
	)
	public int field3175;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1043538817
	)
	public int field3176;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -2135123207
	)
	public int field3177;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	final class267 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lkm;)V"
	)
	class268(class267 var1) {
		this.this$0 = var1;
		this.field3178 = new float[4];
		this.field3175 = 1;
		this.field3176 = 1;
		this.field3177 = 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILcg;ZB)I",
		garbageValue = "-23"
	)
	static int method6044(int var0, Script var1, boolean var2) {
		int var3;
		int var16;
		int var17;
		Widget var20;
		Widget var24;
		if (var0 == ScriptOpcodes.CC_CREATE) {
			UserComparator7.Interpreter_intStackSize -= 4;
			var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
			var17 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
			var16 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 2];
			boolean var26 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 3] != 0;
			var24 = UrlRequester.widgetDefinition.method7476(var3);
			if (var24.type != 0) {
				throw new RuntimeException("");
			} else {
				Tiles.method2081(var24, var16, var26, var1);
				var20 = new Widget();
				var20.type = var17;
				var20.parentId = var20.id = var24.id;
				var20.childIndex = var16 * -1618486649;
				var20.isIf3 = true;
				if (var17 == 12) {
					class146.method3782(var20);
				}

				var24.children[var16] = var20;
				if (var2) {
					HttpRequestTask.scriptDotWidget = var20;
				} else {
					class141.scriptActiveWidget = var20;
				}

				class89.invalidateWidget(var24);
				return 1;
			}
		} else {
			Widget var4;
			Widget var19;
			if (var0 == ScriptOpcodes.CC_DELETE) {
				var19 = var2 ? HttpRequestTask.scriptDotWidget : class141.scriptActiveWidget;
				var4 = UrlRequester.widgetDefinition.method7476(var19.id);
				WorldMapSection0.method6771(var19, var4);
				class89.invalidateWidget(var4);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) {
				--UserComparator7.Interpreter_intStackSize;
				var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
				var4 = UrlRequester.widgetDefinition.method7476(var3);
				var4.children = null;
				class89.invalidateWidget(var4);
				return 1;
			} else {
				Widget var6;
				if (var0 == 105) {
					UserComparator7.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
					var17 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
					var16 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 2];
					var6 = UrlRequester.widgetDefinition.method7476(var3);
					var24 = UrlRequester.widgetDefinition.getWidgetChild(var3, var17);
					if (var6 == null) {
						throw new RuntimeException("");
					} else if (var17 < 0) {
						throw new RuntimeException("");
					} else if (var24 == null) {
						throw new RuntimeException("");
					} else if (var24.type == 0) {
						throw new RuntimeException("");
					} else {
						Tiles.method2081(var6, var16, true, var1);
						if (var24.field4165 != -1) {
							var20 = UrlRequester.widgetDefinition.getWidgetChild(var3, var24.field4165);
							class1.method11(var20, var16);
						}

						var20 = new Widget(var24);
						var20.childIndex = var16 * -1618486649;
						if (var24.type == 12) {
							class146.method3782(var20);
						}

						var6.children[var16] = var20;
						if (var2) {
							HttpRequestTask.scriptDotWidget = var20;
						} else {
							class141.scriptActiveWidget = var20;
						}

						class89.invalidateWidget(var6);
						return 1;
					}
				} else {
					Widget var5;
					if (var0 == 106) {
						UserComparator7.Interpreter_intStackSize -= 2;
						var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
						var17 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
						var5 = var2 ? HttpRequestTask.scriptDotWidget : class141.scriptActiveWidget;
						if (var5 == null) {
							throw new RuntimeException("");
						} else {
							var6 = UrlRequester.widgetDefinition.method7476(var5.parentId);
							if (var5.type != 0) {
								throw new RuntimeException("");
							} else if (var6.type != 0) {
								throw new RuntimeException();
							} else {
								Tiles.method2081(var6, var17, true, var1);
								class1.method11(var5, var17);
								var24 = new Widget();
								var24.type = var3;
								var24.parentId = var24.id = var6.id;
								var24.field4165 = var5.childIndex * -217986249;
								var24.childIndex = var17 * -1618486649;
								var24.isIf3 = true;
								if (var3 == 12) {
									class146.method3782(var24);
								}

								var6.children[var17] = var24;
								if (var2) {
									HttpRequestTask.scriptDotWidget = var24;
								} else {
									class141.scriptActiveWidget = var24;
								}

								class89.invalidateWidget(var6);
								return 1;
							}
						}
					} else if (var0 == 107) {
						UserComparator7.Interpreter_intStackSize -= 2;
						var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
						var17 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
						var5 = var2 ? HttpRequestTask.scriptDotWidget : class141.scriptActiveWidget;
						if (var5 == null) {
							throw new RuntimeException("");
						} else {
							var6 = UrlRequester.widgetDefinition.getWidgetChild(var5.parentId, var5.field4165);
							var24 = UrlRequester.widgetDefinition.method7476(var6.parentId);
							if (var6.type != 0) {
								throw new RuntimeException("");
							} else if (var24.type != 0) {
								throw new RuntimeException();
							} else {
								Tiles.method2081(var24, var17, true, var1);
								class1.method11(var6, var17);
								var20 = new Widget();
								var20.type = var3;
								var20.parentId = var20.id = var24.id;
								var20.field4165 = var6.childIndex * -217986249;
								var20.childIndex = var17 * -1618486649;
								var20.isIf3 = true;
								if (var3 == 12) {
									class146.method3782(var20);
								}

								var24.children[var17] = var20;
								if (var2) {
									HttpRequestTask.scriptDotWidget = var20;
								} else {
									class141.scriptActiveWidget = var20;
								}

								class89.invalidateWidget(var24);
								return 1;
							}
						}
					} else if (var0 == ScriptOpcodes.CC_FIND) {
						UserComparator7.Interpreter_intStackSize -= 2;
						var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
						var17 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
						var5 = var17 != -1 ? UrlRequester.widgetDefinition.getWidgetChild(var3, var17) : null;
						class314.method6971(var5, var2);
						return 1;
					} else if (var0 == ScriptOpcodes.IF_FIND) {
						class314.method6971(UrlRequester.widgetDefinition.method7476(Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize]), var2);
						return 1;
					} else if (var0 == 204) {
						var19 = var2 ? HttpRequestTask.scriptDotWidget : class141.scriptActiveWidget;
						var4 = var19 != null ? UrlRequester.widgetDefinition.getWidgetChild(var19.parentId, var19.field4165) : null;
						class314.method6971(var4, var2);
						return 1;
					} else if (var0 == 205) {
						var19 = var2 ? HttpRequestTask.scriptDotWidget : class141.scriptActiveWidget;
						var4 = var19 != null ? UrlRequester.widgetDefinition.method7476(var19.parentId) : null;
						class314.method6971(var4, var2);
						return 1;
					} else {
						int var18;
						if (var0 == 206) {
							var19 = var2 ? HttpRequestTask.scriptDotWidget : class141.scriptActiveWidget;
							if (var19 == null) {
								Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
								return 1;
							} else if (var19.childIndex * -217986249 == -1) {
								Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
								return 1;
							} else {
								var4 = UrlRequester.widgetDefinition.method7476(var19.parentId);
								var5 = null;

								for (var18 = var19.childIndex * -217986249 + 1; var18 < var4.children.length; ++var18) {
									var24 = var4.children[var18];
									if (var24 != null && var19.field4165 == var24.field4165) {
										var5 = var24;
										break;
									}
								}

								class314.method6971(var5, var2);
								return 1;
							}
						} else if (var0 == 207) {
							var19 = var2 ? HttpRequestTask.scriptDotWidget : class141.scriptActiveWidget;
							if (var19 == null) {
								Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
								return 1;
							} else if (var19.childIndex * -217986249 == -1) {
								Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
								return 1;
							} else {
								var4 = UrlRequester.widgetDefinition.method7476(var19.parentId);
								var5 = null;

								for (var18 = var19.childIndex * -217986249 - 1; var18 >= 0; --var18) {
									var24 = var4.children[var18];
									if (var24 != null && var19.field4165 == var24.field4165) {
										var5 = var24;
										break;
									}
								}

								class314.method6971(var5, var2);
								return 1;
							}
						} else if (var0 == 208) {
							var19 = var2 ? HttpRequestTask.scriptDotWidget : class141.scriptActiveWidget;
							if (var19 == null) {
								Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
								return 1;
							} else if (var19.type != 0) {
								Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
								return 1;
							} else {
								var4 = UrlRequester.widgetDefinition.method7476(var19.parentId);
								if (var4.children == null) {
									Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = 0;
									return 1;
								} else {
									var16 = 0;

									for (var18 = 0; var18 < var4.children.length; ++var18) {
										var24 = var4.children[var18];
										if (var24 != null && var19.childIndex * -217986249 == var24.field4165) {
											++var16;
										}
									}

									Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var16;
									return 1;
								}
							}
						} else if (var0 == 209) {
							var19 = var2 ? HttpRequestTask.scriptDotWidget : class141.scriptActiveWidget;
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var19 != null ? var19.field4165 : -1;
							return 1;
						} else {
							Object var7;
							if (var0 == 210) {
								var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
								var17 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
								Object var22 = SecureRandomCallable.method2082(var3);
								var18 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
								var7 = SecureRandomCallable.method2082(var17);
								int var8 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
								ParamComposition var9 = PcmPlayer.getParamDefinition(var8);
								Object var10 = var9.isString() ? var9.defaultStr : var9.defaultInt;
								Object var11 = null;
								if (var18 >= 0) {
									ParamComposition var12 = PcmPlayer.getParamDefinition(var18);
									var11 = var12.isString() ? var12.defaultStr : var12.defaultInt;
								}

								Widget var25 = UrlRequester.widgetDefinition.method7476(Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize]);
								Widget var13 = null;
								if (var25 != null && var25.children != null) {
									for (int var14 = 0; var14 < var25.children.length; ++var14) {
										Widget var15 = var25.children[var14];
										if (var15 != null && (var8 < 0 || var15.method8004(var8, var10).equals(var7)) && (var18 < 0 || var15.method8004(var18, var11).equals(var22))) {
											var13 = var15;
											break;
										}
									}
								}

								class314.method6971(var13, var2);
								return 1;
							} else if (var0 == 211) {
								UserComparator7.Interpreter_intStackSize -= 3;
								var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
								var4 = UrlRequester.widgetDefinition.method7476(Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1]);
								var16 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 2];
								Interpreter.field665.method7917(var3, var4, var16);
								Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Interpreter.field665.method7904();
								return 1;
							} else if (var0 == 212) {
								var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
								var4 = var2 ? HttpRequestTask.scriptDotWidget : class141.scriptActiveWidget;
								if (var4.childIndex * -217986249 == -1) {
									Interpreter.field665.method7917(var3, var4, -1);
								} else {
									Interpreter.field665.method7917(var3, UrlRequester.widgetDefinition.method7476(var4.parentId), var4.childIndex * -217986249);
								}

								Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Interpreter.field665.method7904();
								return 1;
							} else if (var0 == 213) {
								class314.method6971(Interpreter.field665.method7906(), var2);
								return 1;
							} else if (var0 == 214) {
								Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Interpreter.field665.method7919();
								return 1;
							} else if (var0 == 215) {
								Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = class423.method8555(Interpreter.field665.method7907());
								return 1;
							} else if (var0 == 216) {
								var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
								Object var21 = SecureRandomCallable.method2082(var3);
								var16 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
								ParamComposition var23 = PcmPlayer.getParamDefinition(var16);
								var7 = var23.isString() ? var23.defaultStr : var23.defaultInt;
								Interpreter.field665.method7908(var16, var21, var7);
								Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Interpreter.field665.method7904();
								return 1;
							} else if (var0 == 217) {
								var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
								var4 = var2 ? HttpRequestTask.scriptDotWidget : class141.scriptActiveWidget;
								if (var4 == null) {
									throw new RuntimeException("");
								} else if (var4.type != 0) {
									throw new RuntimeException("");
								} else {
									var5 = UrlRequester.widgetDefinition.method7476(var4.parentId);
									if (var5.type != 0) {
										throw new RuntimeException();
									} else {
										var6 = class273.method6113(var3, var5, var4);
										class314.method6971(var6, var2);
										return 1;
									}
								}
							} else {
								return 2;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(ILcg;ZI)I",
		garbageValue = "54089534"
	)
	static int method6043(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) {
			UserComparator7.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
			int var4 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
			if (!Client.isCameraLocked) {
				Client.camAngleX = var3;
				Client.camAngleY = var4;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) {
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Client.camAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) {
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Client.camAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) {
			var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
			if (var3 < 0) {
				var3 = 0;
			}

			Client.camFollowHeight = var3;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) {
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Client.camFollowHeight;
			return 1;
		} else {
			return 2;
		}
	}
}
