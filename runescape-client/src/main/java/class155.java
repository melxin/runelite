import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fr")
public class class155 extends class151 {
	@ObfuscatedName("lw")
	@ObfuscatedGetter(
		intValue = -1032384273
	)
	static int field1788;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1686786787
	)
	int field1789;
	@ObfuscatedName("at")
	byte field1787;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfc;"
	)
	final class154 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfc;)V"
	)
	class155(class154 var1) {
		this.this$0 = var1;
		this.field1789 = -1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxa;B)V",
		garbageValue = "-11"
	)
	void vmethod4235(Buffer var1) {
		this.field1789 = var1.readUnsignedShort();
		this.field1787 = var1.readByte();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lgs;B)V",
		garbageValue = "-98"
	)
	void vmethod4241(ClanSettings var1) {
		var1.method4062(this.field1789, this.field1787);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILcu;ZI)I",
		garbageValue = "1725515448"
	)
	static int method3998(int var0, Script var1, boolean var2) {
		int var3;
		int var16;
		int var17;
		Widget var20;
		Widget var24;
		if (var0 == ScriptOpcodes.CC_CREATE) {
			class408.Interpreter_intStackSize -= 4;
			var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
			var17 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
			var16 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 2];
			boolean var26 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 3] != 0;
			var24 = class226.widgetDefinition.method7728(var3);
			if (var24.type != 0) {
				throw new RuntimeException("");
			} else {
				GrandExchangeOfferOwnWorldComparator.method838(var24, var16, var26, var1);
				var20 = new Widget();
				var20.type = var17;
				var20.parentId = var20.id = var24.id;
				var20.childIndex = var16 * 1657618603;
				var20.isIf3 = true;
				if (var17 == 12) {
					SongTask.method9962(var20);
				}

				var24.children[var16] = var20;
				if (var2) {
					UserComparator3.scriptDotWidget = var20;
				} else {
					class222.scriptActiveWidget = var20;
				}

				class376.invalidateWidget(var24);
				return 1;
			}
		} else {
			Widget var4;
			Widget var19;
			if (var0 == ScriptOpcodes.CC_DELETE) {
				var19 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
				var4 = class226.widgetDefinition.method7728(var19.id);
				class526.method10648(var19, var4);
				class376.invalidateWidget(var4);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) {
				--class408.Interpreter_intStackSize;
				var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
				var4 = class226.widgetDefinition.method7728(var3);
				var4.children = null;
				class376.invalidateWidget(var4);
				return 1;
			} else {
				Widget var6;
				if (var0 == 105) {
					class408.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
					var17 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
					var16 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 2];
					var6 = class226.widgetDefinition.method7728(var3);
					var24 = class226.widgetDefinition.getWidgetChild(var3, var17);
					if (var6 == null) {
						throw new RuntimeException("");
					} else if (var17 < 0) {
						throw new RuntimeException("");
					} else if (var24 == null) {
						throw new RuntimeException("");
					} else if (var24.type == 0) {
						throw new RuntimeException("");
					} else {
						GrandExchangeOfferOwnWorldComparator.method838(var6, var16, true, var1);
						if (var24.field4234 != -1) {
							var20 = class226.widgetDefinition.getWidgetChild(var3, var24.field4234);
							class418.method8578(var20, var16);
						}

						var20 = new Widget(var24);
						var20.childIndex = var16 * 1657618603;
						if (var24.type == 12) {
							SongTask.method9962(var20);
						}

						var6.children[var16] = var20;
						if (var2) {
							UserComparator3.scriptDotWidget = var20;
						} else {
							class222.scriptActiveWidget = var20;
						}

						class376.invalidateWidget(var6);
						return 1;
					}
				} else {
					Widget var5;
					if (var0 == 106) {
						class408.Interpreter_intStackSize -= 2;
						var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
						var17 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
						var5 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
						if (var5 == null) {
							throw new RuntimeException("");
						} else {
							var6 = class226.widgetDefinition.method7728(var5.parentId);
							if (var5.type != 0) {
								throw new RuntimeException("");
							} else if (var6.type != 0) {
								throw new RuntimeException();
							} else {
								GrandExchangeOfferOwnWorldComparator.method838(var6, var17, true, var1);
								class418.method8578(var5, var17);
								var24 = new Widget();
								var24.type = var3;
								var24.parentId = var24.id = var6.id;
								var24.field4234 = var5.childIndex * 2077538819;
								var24.childIndex = var17 * 1657618603;
								var24.isIf3 = true;
								if (var3 == 12) {
									SongTask.method9962(var24);
								}

								var6.children[var17] = var24;
								if (var2) {
									UserComparator3.scriptDotWidget = var24;
								} else {
									class222.scriptActiveWidget = var24;
								}

								class376.invalidateWidget(var6);
								return 1;
							}
						}
					} else if (var0 == 107) {
						class408.Interpreter_intStackSize -= 2;
						var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
						var17 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
						var5 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
						if (var5 == null) {
							throw new RuntimeException("");
						} else {
							var6 = class226.widgetDefinition.getWidgetChild(var5.parentId, var5.field4234);
							var24 = class226.widgetDefinition.method7728(var6.parentId);
							if (var6.type != 0) {
								throw new RuntimeException("");
							} else if (var24.type != 0) {
								throw new RuntimeException();
							} else {
								GrandExchangeOfferOwnWorldComparator.method838(var24, var17, true, var1);
								class418.method8578(var6, var17);
								var20 = new Widget();
								var20.type = var3;
								var20.parentId = var20.id = var24.id;
								var20.field4234 = var6.childIndex * 2077538819;
								var20.childIndex = var17 * 1657618603;
								var20.isIf3 = true;
								if (var3 == 12) {
									SongTask.method9962(var20);
								}

								var24.children[var17] = var20;
								if (var2) {
									UserComparator3.scriptDotWidget = var20;
								} else {
									class222.scriptActiveWidget = var20;
								}

								class376.invalidateWidget(var24);
								return 1;
							}
						}
					} else if (var0 == ScriptOpcodes.CC_FIND) {
						class408.Interpreter_intStackSize -= 2;
						var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
						var17 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
						var5 = var17 != -1 ? class226.widgetDefinition.getWidgetChild(var3, var17) : null;
						WorldMapRectangle.method7006(var5, var2);
						return 1;
					} else if (var0 == ScriptOpcodes.IF_FIND) {
						WorldMapRectangle.method7006(class226.widgetDefinition.method7728(Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize]), var2);
						return 1;
					} else if (var0 == 204) {
						var19 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
						var4 = var19 != null ? class226.widgetDefinition.getWidgetChild(var19.parentId, var19.field4234) : null;
						WorldMapRectangle.method7006(var4, var2);
						return 1;
					} else if (var0 == 205) {
						var19 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
						var4 = var19 != null ? class226.widgetDefinition.method7728(var19.parentId) : null;
						WorldMapRectangle.method7006(var4, var2);
						return 1;
					} else {
						int var18;
						if (var0 == 206) {
							var19 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
							if (var19 == null) {
								Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
								return 1;
							} else if (var19.childIndex * 2077538819 == -1) {
								Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
								return 1;
							} else {
								var4 = class226.widgetDefinition.method7728(var19.parentId);
								var5 = null;

								for (var18 = var19.childIndex * 2077538819 + 1; var18 < var4.children.length; ++var18) {
									var24 = var4.children[var18];
									if (var24 != null && var24.field4234 == var19.field4234) {
										var5 = var24;
										break;
									}
								}

								WorldMapRectangle.method7006(var5, var2);
								return 1;
							}
						} else if (var0 == 207) {
							var19 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
							if (var19 == null) {
								Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
								return 1;
							} else if (var19.childIndex * 2077538819 == -1) {
								Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
								return 1;
							} else {
								var4 = class226.widgetDefinition.method7728(var19.parentId);
								var5 = null;

								for (var18 = var19.childIndex * 2077538819 - 1; var18 >= 0; --var18) {
									var24 = var4.children[var18];
									if (var24 != null && var19.field4234 == var24.field4234) {
										var5 = var24;
										break;
									}
								}

								WorldMapRectangle.method7006(var5, var2);
								return 1;
							}
						} else if (var0 == 208) {
							var19 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
							if (var19 == null) {
								Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
								return 1;
							} else if (var19.type != 0) {
								Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
								return 1;
							} else {
								var4 = class226.widgetDefinition.method7728(var19.parentId);
								if (var4.children == null) {
									Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = 0;
									return 1;
								} else {
									var16 = 0;

									for (var18 = 0; var18 < var4.children.length; ++var18) {
										var24 = var4.children[var18];
										if (var24 != null && var19.childIndex * 2077538819 == var24.field4234) {
											++var16;
										}
									}

									Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var16;
									return 1;
								}
							}
						} else if (var0 == 209) {
							var19 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
							Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = var19 != null ? var19.field4234 : -1;
							return 1;
						} else {
							Object var7;
							if (var0 == 210) {
								var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
								var17 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
								Object var22 = class39.method816(var3);
								var18 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
								var7 = class39.method816(var17);
								int var8 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
								ParamComposition var9 = WorldMap.getParamDefinition(var8);
								Object var10 = var9.isString() ? var9.defaultStr : var9.defaultInt;
								Object var11 = null;
								if (var18 >= 0) {
									ParamComposition var12 = WorldMap.getParamDefinition(var18);
									var11 = var12.isString() ? var12.defaultStr : var12.defaultInt;
								}

								Widget var25 = class226.widgetDefinition.method7728(Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize]);
								Widget var13 = null;
								if (var25 != null && var25.children != null) {
									for (int var14 = 0; var14 < var25.children.length; ++var14) {
										Widget var15 = var25.children[var14];
										if (var15 != null && (var8 < 0 || var15.method8283(var8, var10).equals(var7)) && (var18 < 0 || var15.method8283(var18, var11).equals(var22))) {
											var13 = var15;
											break;
										}
									}
								}

								WorldMapRectangle.method7006(var13, var2);
								return 1;
							} else if (var0 == 211) {
								class408.Interpreter_intStackSize -= 3;
								var3 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
								var4 = class226.widgetDefinition.method7728(Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1]);
								var16 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 2];
								Interpreter.field616.method8128(var3, var4, var16);
								Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Interpreter.field616.method8120();
								return 1;
							} else if (var0 == 212) {
								var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
								var4 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
								if (var4.childIndex * 2077538819 == -1) {
									Interpreter.field616.method8128(var3, var4, -1);
								} else {
									Interpreter.field616.method8128(var3, class226.widgetDefinition.method7728(var4.parentId), var4.childIndex * 2077538819);
								}

								Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Interpreter.field616.method8120();
								return 1;
							} else if (var0 == 213) {
								WorldMapRectangle.method7006(Interpreter.field616.method8121(), var2);
								return 1;
							} else if (var0 == 214) {
								Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Interpreter.field616.method8122();
								return 1;
							} else if (var0 == 215) {
								Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = class356.method7604(Interpreter.field616.method8123());
								return 1;
							} else if (var0 == 216) {
								var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
								Object var21 = class39.method816(var3);
								var16 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
								ParamComposition var23 = WorldMap.getParamDefinition(var16);
								var7 = var23.isString() ? var23.defaultStr : var23.defaultInt;
								Interpreter.field616.method8124(var16, var21, var7);
								Interpreter.Interpreter_intStack[++class408.Interpreter_intStackSize - 1] = Interpreter.field616.method8120();
								return 1;
							} else if (var0 == 217) {
								var3 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
								var4 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
								if (var4 == null) {
									throw new RuntimeException("");
								} else if (var4.type != 0) {
									throw new RuntimeException("");
								} else {
									var5 = class226.widgetDefinition.method7728(var4.parentId);
									if (var5.type != 0) {
										throw new RuntimeException();
									} else {
										var6 = GrandExchangeOfferOwnWorldComparator.method837(var3, var5, var4);
										WorldMapRectangle.method7006(var6, var2);
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

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "228245989"
	)
	static final void method4000(boolean var0) {
		if (var0) {
			Client.authenticationScheme = Login.rememberUsername ? AuthenticationScheme.USERNAME_PASSWORD_REMEMBER : AuthenticationScheme.USERNAME_PASSWORD;
		} else {
			Client.authenticationScheme = class468.clientPreferences.containsKey(Login.Login_username) ? AuthenticationScheme.TOKEN_REMEMBER : AuthenticationScheme.TOKEN;
		}

	}

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(Ldd;IIIII)V",
		garbageValue = "-93464466"
	)
	static void method4001(WorldView var0, int var1, int var2, int var3, int var4) {
		int var5 = var1;
		int var6 = var2;
		int var7 = class67.method2215(var0, var1, var2, var0.plane, var4) - var3;
		if (!var0.method2791()) {
			WorldEntity var8 = (WorldEntity)Occluder.topLevelWorldView.worldEntities.get((long)var0.id);
			if (var8 != null) {
				ProjectionCoord var9 = class86.method2932(var0, var1, var2);
				var5 = (int)var9.x;
				var6 = (int)var9.y;
				var7 += NPCComposition.getTileHeight(Occluder.topLevelWorldView, var8.getY(), var8.getPlane(), Occluder.topLevelWorldView.plane);
				var9.release();
			}
		}

		if (var5 >= 128 && 13056 >= var5 && var6 >= 128 && 13056 >= var6) {
			int var16 = var5 - SpriteBufferProperties.cameraX;
			int var10 = var7 - ScriptFrame.cameraY;
			int var17 = var6 - class528.cameraZ;
			int var11 = Rasterizer3D.Rasterizer3D_sine[GraphicsObject.cameraPitch];
			int var12 = Rasterizer3D.Rasterizer3D_cosine[GraphicsObject.cameraPitch];
			int var13 = Rasterizer3D.Rasterizer3D_sine[WorldMapData_0.cameraYaw];
			int var14 = Rasterizer3D.Rasterizer3D_cosine[WorldMapData_0.cameraYaw];
			int var15 = var17 * var13 + var14 * var16 >> 16;
			var17 = var17 * var14 - var13 * var16 >> 16;
			var16 = var15;
			var15 = var12 * var10 - var11 * var17 >> 16;
			var17 = var12 * var17 + var11 * var10 >> 16;
			if (var17 >= 50) {
				Client.viewportTempX = Client.viewportWidth / 2 + var16 * Client.viewportZoom / var17;
				Client.viewportTempY = var15 * Client.viewportZoom / var17 + Client.viewportHeight / 2;
			} else {
				Client.viewportTempX = -1;
				Client.viewportTempY = -1;
			}
		} else {
			Client.viewportTempX = -1;
			Client.viewportTempY = -1;
		}

	}
}
