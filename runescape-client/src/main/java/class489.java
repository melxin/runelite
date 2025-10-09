import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("sc")
public final class class489 implements Comparable {
	@ObfuscatedName("ab")
	Object field5417;
	@ObfuscatedName("at")
	Object field5416;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		longValue = 3268226343279191167L
	)
	long field5418;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = 251685432321480119L
	)
	long field5415;

	class489(Object var1, Object var2) {
		this.field5417 = var1;
		this.field5416 = var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lsc;I)I",
		garbageValue = "-1425428306"
	)
	int method9928(class489 var1) {
		if (this.field5415 < var1.field5415) {
			return -1;
		} else {
			return this.field5415 > var1.field5415 ? 1 : 0;
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof class489) {
			return this.field5416.equals(((class489)var1).field5416);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public int hashCode() {
		return this.field5416.hashCode();
	}

	public int compareTo(Object var1) {
		return this.method9928((class489)var1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([Lbv;II[I[II)V",
		garbageValue = "739481687"
	)
	@Export("sortWorlds")
	static void sortWorlds(World[] var0, int var1, int var2, int[] var3, int[] var4) {
		if (var1 < var2) {
			int var5 = var1 - 1;
			int var6 = var2 + 1;
			int var7 = (var2 + var1) / 2;
			World var8 = var0[var7];
			var0[var7] = var0[var1];
			var0[var1] = var8;

			while (var5 < var6) {
				boolean var9 = true;

				int var10;
				int var11;
				int var12;
				do {
					--var6;

					for (var10 = 0; var10 < 4; ++var10) {
						if (var3[var10] == 2) {
							var11 = var0[var6].index;
							var12 = var8.index;
						} else if (var3[var10] == 1) {
							var11 = var0[var6].population;
							var12 = var8.population;
							if (var11 == -1 && var4[var10] == 1) {
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) {
								var12 = 2001;
							}
						} else if (var3[var10] == 3) {
							var11 = var0[var6].isMembersOnly() ? 1 : 0;
							var12 = var8.isMembersOnly() ? 1 : 0;
						} else {
							var11 = var0[var6].id;
							var12 = var8.id;
						}

						if (var12 != var11) {
							if ((var4[var10] != 1 || var11 <= var12) && (var4[var10] != 0 || var11 >= var12)) {
								var9 = false;
							}
							break;
						}

						if (var10 == 3) {
							var9 = false;
						}
					}
				} while(var9);

				var9 = true;

				do {
					++var5;

					for (var10 = 0; var10 < 4; ++var10) {
						if (var3[var10] == 2) {
							var11 = var0[var5].index;
							var12 = var8.index;
						} else if (var3[var10] == 1) {
							var11 = var0[var5].population;
							var12 = var8.population;
							if (var11 == -1 && var4[var10] == 1) {
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) {
								var12 = 2001;
							}
						} else if (var3[var10] == 3) {
							var11 = var0[var5].isMembersOnly() ? 1 : 0;
							var12 = var8.isMembersOnly() ? 1 : 0;
						} else {
							var11 = var0[var5].id;
							var12 = var8.id;
						}

						if (var11 != var12) {
							if ((var4[var10] != 1 || var11 >= var12) && (var4[var10] != 0 || var11 <= var12)) {
								var9 = false;
							}
							break;
						}

						if (var10 == 3) {
							var9 = false;
						}
					}
				} while(var9);

				if (var5 < var6) {
					World var13 = var0[var5];
					var0[var5] = var0[var6];
					var0[var6] = var13;
				}
			}

			sortWorlds(var0, var1, var6, var3, var4);
			sortWorlds(var0, var6 + 1, var2, var3, var4);
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILcj;ZB)I",
		garbageValue = "2"
	)
	static int method9931(int var0, Script var1, boolean var2) {
		boolean var3 = true;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = class35.widgetDefinition.method7496(Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize]);
			var3 = false;
		} else {
			var4 = var2 ? class359.scriptDotWidget : GameEngine.scriptActiveWidget;
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) {
			var11 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] - 1;
			if (var11 >= 0 && var11 < 32) {
				var4.setAction(var11, (String)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize]);
				return 1;
			} else {
				--Message.Interpreter_objectStackSize;
				return 1;
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) {
				UrlRequest.Interpreter_intStackSize -= 2;
				var11 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
				var6 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
				var4.parent = class35.widgetDefinition.getWidgetChild(var11, var6);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) {
				var4.isScrollBar = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) {
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) {
				var4.dragThreshold = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) {
				var4.dataText = (String)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) {
				var4.spellActionName = (String)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) {
				var4.actions = null;
				var4.field4256 = null;
				return 1;
			} else if (var0 == 1308) {
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] == 1;
				return 1;
			} else if (var0 == 1309) {
				--UrlRequest.Interpreter_intStackSize;
				return 1;
			} else if (var0 == 1310) {
				var11 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] - 1;
				if (var11 >= 0 && var11 <= 9 && var4.field4256 != null) {
					var4.field4256[var11] = null;
					return 1;
				} else {
					return 1;
				}
			} else if (var0 == 1311) {
				var11 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] - 1;
				var6 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] - 1;
				if (var6 >= 0 && var6 <= 9 && var11 >= 0) {
					var4.method7938(var6, var11, (String)Interpreter.Interpreter_objectStack[--Message.Interpreter_objectStackSize]);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == 1312) {
				var11 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
				if (var11 == -1) {
					var4.targetPriority = -1479148364;
				} else if (var11 >= 1 && var11 <= 32) {
					var4.targetPriority = (var11 - 1) * 1777696557;
				}

				return 1;
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) {
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) {
						UrlRequest.Interpreter_intStackSize -= 2;
						var5 = 10;
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize]};
						byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1]};
						GameEngine.Widget_setKey(var4, var5, var8, var9);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) {
						UrlRequest.Interpreter_intStackSize -= 3;
						var11 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize] - 1;
						var6 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
						var7 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 2];
						if (var11 >= 0 && var11 <= 9) {
							WorldMapIcon_1.Widget_setKeyRate(var4, var11, var6, var7);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) {
						var5 = 10;
						var6 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
						var7 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
						WorldMapIcon_1.Widget_setKeyRate(var4, var5, var6, var7);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) {
						--UrlRequest.Interpreter_intStackSize;
						var11 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize] - 1;
						if (var11 >= 0 && var11 <= 9) {
							WidgetConfigNode.Widget_setKeyIgnoreHeld(var4, var11);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) {
						var5 = 10;
						WidgetConfigNode.Widget_setKeyIgnoreHeld(var4, var5);
						return 1;
					} else {
						return 2;
					}
				} else {
					byte[] var10 = null;
					var8 = null;
					if (var3) {
						UrlRequest.Interpreter_intStackSize -= 10;

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + UrlRequest.Interpreter_intStackSize] >= 0; var7 += 2) {
						}

						if (var7 > 0) {
							var10 = new byte[var7 / 2];
							var8 = new byte[var7 / 2];

							for (var7 -= 2; var7 >= 0; var7 -= 2) {
								var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + UrlRequest.Interpreter_intStackSize];
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + UrlRequest.Interpreter_intStackSize + 1];
							}
						}
					} else {
						UrlRequest.Interpreter_intStackSize -= 2;
						var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize]};
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1]};
					}

					var7 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize] - 1;
					if (var7 >= 0 && var7 <= 9) {
						GameEngine.Widget_setKey(var4, var7, var10, var8);
						return 1;
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lbv;B)V",
		garbageValue = "-104"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) {
			Client.isMembersWorld = var0.isMembersOnly();
			boolean var1 = var0.isMembersOnly();
			if (var1 != class281.ItemDefinition_inMembersWorld) {
				class134.method3732();
				class281.ItemDefinition_inMembersWorld = var1;
			}
		}

		if (var0.properties != Client.worldProperties) {
			Archive var3 = BoundaryObject.archive8;
			int var2 = var0.properties;
			if ((var2 & class580.field5942.rsOrdinal()) != 0) {
				class1.logoSprite = class334.SpriteBuffer_getIndexedSpriteByName(var3, "logo_deadman_mode", "");
			} else if ((var2 & class580.field5944.rsOrdinal()) != 0) {
				class1.logoSprite = class334.SpriteBuffer_getIndexedSpriteByName(var3, "logo_seasonal_mode", "");
			} else if ((var2 & class580.field5927.rsOrdinal()) != 0) {
				class1.logoSprite = class334.SpriteBuffer_getIndexedSpriteByName(var3, "logo_speedrunning", "");
			} else if ((var2 & class580.field5924.rsOrdinal()) != 0) {
				class1.logoSprite = class334.SpriteBuffer_getIndexedSpriteByName(var3, "logo_ugc_world", "");
			} else {
				class1.logoSprite = class334.SpriteBuffer_getIndexedSpriteByName(var3, "logo", "");
			}
		}

		class401.worldHost = var0.host;
		Client.worldId = var0.id;
		Client.worldProperties = var0.properties;
		IntProjection.field2650 = var0.field596;
		HealthBarDefinition.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000;
		StudioGame.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000;
		class199.currentPort = HealthBarDefinition.worldPort;
	}
}
