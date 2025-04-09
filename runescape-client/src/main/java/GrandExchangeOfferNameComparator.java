import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ps")
@Implements("GrandExchangeOfferNameComparator")
final class GrandExchangeOfferNameComparator implements Comparator {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	static AbstractArchive field4771;

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lpt;Lpt;I)I",
		garbageValue = "-601466887"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.getOfferName().compareTo(var2.getOfferName());
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([BI)Ljava/lang/String;",
		garbageValue = "241637183"
	)
	public static String method7852(byte[] var0) {
		int var2 = var0.length;
		StringBuilder var3 = new StringBuilder();

		for (int var4 = 0; var4 < var2 + 0; var4 += 3) {
			int var5 = var0[var4] & 255;
			var3.append(class434.field4890[var5 >>> 2]);
			if (var4 < var2 - 1) {
				int var6 = var0[var4 + 1] & 255;
				var3.append(class434.field4890[(var5 & 3) << 4 | var6 >>> 4]);
				if (var4 < var2 - 2) {
					int var7 = var0[var4 + 2] & 255;
					var3.append(class434.field4890[(var6 & 15) << 2 | var7 >>> 6]).append(class434.field4890[var7 & 63]);
				} else {
					var3.append(class434.field4890[(var6 & 15) << 2]).append("=");
				}
			} else {
				var3.append(class434.field4890[(var5 & 3) << 4]).append("==");
			}
		}

		String var1 = var3.toString();
		return var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lph;IIB)Lwc;",
		garbageValue = "-87"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		return !class362.method7335(var0, var1, var2) ? null : class555.method10140();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-50"
	)
	public static void method7853() {
		DbRowType.DBRowType_cache.clear();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILdb;ZB)I",
		garbageValue = "-54"
	)
	static int method7849(int var0, Script var1, boolean var2) {
		int var5;
		Widget var7;
		Widget var8;
		int var10;
		int var11;
		if (var0 == ScriptOpcodes.CC_CREATE) {
			AbstractByteArrayCopier.Interpreter_intStackSize -= class566.field5590 < 230 ? 3 : 4;
			var10 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
			var11 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
			var5 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 2];
			boolean var13 = false;
			if (class566.field5590 >= 230) {
				var13 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 3] != 0;
			}

			var7 = class232.widgetDefinition.method6951(var10);
			if (var7.type != 0) {
				throw new RuntimeException("");
			} else {
				UserComparator7.method3221(var7, var5, var13, var1);
				var8 = new Widget();
				var8.type = var11;
				var8.parentId = var8.id = var7.id;
				var8.childIndex = var5 * 871583011;
				var8.isIf3 = true;
				if (var11 == 12) {
					class356.method6977(var8);
				}

				var7.children[var5] = var8;
				if (var2) {
					class156.scriptDotWidget = var8;
				} else {
					SoundCache.scriptActiveWidget = var8;
				}

				class139.invalidateWidget(var7);
				return 1;
			}
		} else {
			Widget var3;
			Widget var4;
			if (var0 == ScriptOpcodes.CC_DELETE) {
				var3 = var2 ? class156.scriptDotWidget : SoundCache.scriptActiveWidget;
				var4 = class232.widgetDefinition.method6951(var3.id);
				class322.method6542(var3, var4);
				class139.invalidateWidget(var4);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) {
				--AbstractByteArrayCopier.Interpreter_intStackSize;
				var10 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
				var4 = class232.widgetDefinition.method6951(var10);
				var4.children = null;
				class139.invalidateWidget(var4);
				return 1;
			} else {
				Widget var12;
				if (var0 == 105) {
					AbstractByteArrayCopier.Interpreter_intStackSize -= 3;
					var10 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
					var11 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 2];
					var12 = class232.widgetDefinition.method6951(var10);
					var7 = class232.widgetDefinition.getWidgetChild(var10, var11);
					if (var12 == null) {
						throw new RuntimeException("");
					} else if (var11 < 0) {
						throw new RuntimeException("");
					} else if (var7 == null) {
						throw new RuntimeException("");
					} else if (var7.type == 0) {
						throw new RuntimeException("");
					} else {
						UserComparator7.method3221(var12, var5, true, var1);
						if (var7.field3960 != -1) {
							var8 = class232.widgetDefinition.getWidgetChild(var10, var7.field3960);
							class358.method6984(var8, var5);
						}

						var8 = new Widget(var7);
						var8.childIndex = var5 * 871583011;
						if (var7.type == 12) {
							class356.method6977(var8);
						}

						var12.children[var5] = var8;
						if (var2) {
							class156.scriptDotWidget = var8;
						} else {
							SoundCache.scriptActiveWidget = var8;
						}

						class139.invalidateWidget(var12);
						return 1;
					}
				} else {
					Widget var9;
					if (var0 == 106) {
						AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
						var10 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
						var11 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
						var9 = var2 ? class156.scriptDotWidget : SoundCache.scriptActiveWidget;
						if (var9 == null) {
							throw new RuntimeException("");
						} else {
							var12 = class232.widgetDefinition.method6951(var9.parentId);
							if (var9.type != 0) {
								throw new RuntimeException("");
							} else if (var12.type != 0) {
								throw new RuntimeException();
							} else {
								UserComparator7.method3221(var12, var11, true, var1);
								class358.method6984(var9, var11);
								var7 = new Widget();
								var7.type = var10;
								var7.parentId = var7.id = var12.id;
								var7.field3960 = var9.childIndex * -1626125685;
								var7.childIndex = var11 * 871583011;
								var7.isIf3 = true;
								if (var10 == 12) {
									class356.method6977(var7);
								}

								var12.children[var11] = var7;
								if (var2) {
									class156.scriptDotWidget = var7;
								} else {
									SoundCache.scriptActiveWidget = var7;
								}

								class139.invalidateWidget(var12);
								return 1;
							}
						}
					} else if (var0 == 107) {
						AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
						var10 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
						var11 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
						var9 = var2 ? class156.scriptDotWidget : SoundCache.scriptActiveWidget;
						if (var9 == null) {
							throw new RuntimeException("");
						} else {
							var12 = class232.widgetDefinition.getWidgetChild(var9.parentId, var9.field3960);
							var7 = class232.widgetDefinition.method6951(var12.parentId);
							if (var12.type != 0) {
								throw new RuntimeException("");
							} else if (var7.type != 0) {
								throw new RuntimeException();
							} else {
								UserComparator7.method3221(var7, var11, true, var1);
								class358.method6984(var12, var11);
								var8 = new Widget();
								var8.type = var10;
								var8.parentId = var8.id = var7.id;
								var8.field3960 = var12.childIndex * -1626125685;
								var8.childIndex = var11 * 871583011;
								var8.isIf3 = true;
								if (var10 == 12) {
									class356.method6977(var8);
								}

								var7.children[var11] = var8;
								if (var2) {
									class156.scriptDotWidget = var8;
								} else {
									SoundCache.scriptActiveWidget = var8;
								}

								class139.invalidateWidget(var7);
								return 1;
							}
						}
					} else if (var0 == ScriptOpcodes.CC_FIND) {
						AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
						var10 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
						var11 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
						var9 = class232.widgetDefinition.getWidgetChild(var10, var11);
						if (var9 != null && var11 != -1) {
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 1;
							if (var2) {
								class156.scriptDotWidget = var9;
							} else {
								SoundCache.scriptActiveWidget = var9;
							}
						} else {
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.IF_FIND) {
						var3 = class232.widgetDefinition.method6951(Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize]);
						if (var3 != null) {
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 1;
							if (var2) {
								class156.scriptDotWidget = var3;
							} else {
								SoundCache.scriptActiveWidget = var3;
							}
						} else {
							Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == 204) {
						var3 = var2 ? class156.scriptDotWidget : SoundCache.scriptActiveWidget;
						if (var3 != null) {
							var4 = class232.widgetDefinition.getWidgetChild(var3.parentId, var3.field3960);
							if (var4 != null) {
								Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 1;
								if (var2) {
									class156.scriptDotWidget = var4;
								} else {
									SoundCache.scriptActiveWidget = var4;
								}

								return 1;
							}
						}

						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
						return 1;
					} else if (var0 == 205) {
						var3 = var2 ? class156.scriptDotWidget : SoundCache.scriptActiveWidget;
						if (var3 != null) {
							var4 = class232.widgetDefinition.method6951(var3.parentId);
							if (var4 != null) {
								Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 1;
								if (var2) {
									class156.scriptDotWidget = var4;
								} else {
									SoundCache.scriptActiveWidget = var4;
								}

								return 1;
							}
						}

						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
						return 1;
					} else {
						int var6;
						if (var0 == 206) {
							var3 = var2 ? class156.scriptDotWidget : SoundCache.scriptActiveWidget;
							if (var3 == null) {
								Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
								return 1;
							} else if (var3.childIndex * -1626125685 == -1) {
								Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
								return 1;
							} else {
								var4 = class232.widgetDefinition.method6951(var3.parentId);
								var9 = null;

								for (var6 = var3.childIndex * -1626125685 + 1; var6 < var4.children.length; ++var6) {
									var7 = var4.children[var6];
									if (var7 != null && var3.field3960 == var7.field3960) {
										var9 = var7;
										break;
									}
								}

								if (var9 == null) {
									Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
									return 1;
								} else {
									Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 1;
									if (var2) {
										class156.scriptDotWidget = var9;
									} else {
										SoundCache.scriptActiveWidget = var9;
									}

									return 1;
								}
							}
						} else if (var0 != 207) {
							if (var0 == 208) {
								var3 = var2 ? class156.scriptDotWidget : SoundCache.scriptActiveWidget;
								if (var3 == null) {
									Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
									return 1;
								} else if (var3.type != 0) {
									Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
									return 1;
								} else {
									var4 = class232.widgetDefinition.method6951(var3.parentId);
									if (var4.children == null) {
										Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
										return 1;
									} else {
										var5 = 0;

										for (var6 = 0; var6 < var4.children.length; ++var6) {
											var7 = var4.children[var6];
											if (var7 != null && var3.childIndex * -1626125685 == var7.field3960) {
												++var5;
											}
										}

										Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var5;
										return 1;
									}
								}
							} else {
								return 2;
							}
						} else {
							var3 = var2 ? class156.scriptDotWidget : SoundCache.scriptActiveWidget;
							if (var3 == null) {
								Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
								return 1;
							} else if (var3.childIndex * -1626125685 == -1) {
								Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
								return 1;
							} else {
								var4 = class232.widgetDefinition.method6951(var3.parentId);
								var9 = null;

								for (var6 = var3.childIndex * -1626125685 - 1; var6 >= 0; --var6) {
									var7 = var4.children[var6];
									if (var7 != null && var3.field3960 == var7.field3960) {
										var9 = var7;
										break;
									}
								}

								if (var9 == null) {
									Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
									return 1;
								} else {
									Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 1;
									if (var2) {
										class156.scriptDotWidget = var9;
									} else {
										SoundCache.scriptActiveWidget = var9;
									}

									return 1;
								}
							}
						}
					}
				}
			}
		}
	}
}
