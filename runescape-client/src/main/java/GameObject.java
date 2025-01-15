import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ik")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -52846939
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -2138523021
	)
	@Export("z")
	int z;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 635722313
	)
	@Export("centerX")
	int centerX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -492530409
	)
	@Export("centerY")
	int centerY;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -62300097
	)
	@Export("startX")
	int startX;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 711001867
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1114535483
	)
	@Export("endX")
	int endX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1257097225
	)
	@Export("startY")
	int startY;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 18141731
	)
	@Export("endY")
	int endY;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1966644445
	)
	int field2335;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -900462987
	)
	@Export("lastDrawn")
	int lastDrawn;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = 8459724622587672005L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1945860265
	)
	@Export("flags")
	int flags;

	GameObject() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZB)I",
		garbageValue = "7"
	)
	static int method4821(int var0, Script var1, boolean var2) {
		int var4;
		Widget var6;
		int var10;
		if (var0 == ScriptOpcodes.CC_CREATE) {
			ScriptFrame.Interpreter_intStackSize -= 3;
			var10 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
			int var12 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 2];
			if (var4 == 0) {
				throw new RuntimeException();
			} else {
				var6 = ClanChannel.widgetDefinition.method7031(var10);
				if (var6.children == null) {
					var6.children = new Widget[var12 + 1];
				}

				if (var6.children.length <= var12) {
					Widget[] var13 = new Widget[var12 + 1];

					for (int var14 = 0; var14 < var6.children.length; ++var14) {
						var13[var14] = var6.children[var14];
					}

					var6.children = var13;
				}

				if (var12 > 0 && var6.children[var12 - 1] == null) {
					throw new RuntimeException("" + (var12 - 1));
				} else {
					Widget var15 = new Widget();
					var15.type = var4;
					var15.parentId = var15.id = var6.id;
					var15.childIndex = var12;
					var15.isIf3 = true;
					if (var4 == 12) {
						class106.method3077(var15);
					}

					var6.children[var12] = var15;
					if (var2) {
						class134.scriptDotWidget = var15;
					} else {
						HttpMethod.scriptActiveWidget = var15;
					}

					UserComparator8.invalidateWidget(var6);
					return 1;
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) {
				var3 = var2 ? class134.scriptDotWidget : HttpMethod.scriptActiveWidget;
				Widget var11 = ClanChannel.widgetDefinition.method7031(var3.id);
				var11.children[var3.childIndex] = null;
				UserComparator8.invalidateWidget(var11);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) {
				var3 = ClanChannel.widgetDefinition.method7031(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
				var3.children = null;
				UserComparator8.invalidateWidget(var3);
				return 1;
			} else {
				Widget var5;
				if (var0 == 105) {
					ScriptFrame.Interpreter_intStackSize -= 2;
					var10 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
					var5 = ClanChannel.widgetDefinition.method7031(var10);
					var6 = ClanChannel.widgetDefinition.getWidgetChild(var10, var4);
					if (var5 == null) {
						throw new RuntimeException("");
					} else if (var4 < 0) {
						throw new RuntimeException("");
					} else if (var6 == null) {
						throw new RuntimeException("");
					} else if (var5.children == null) {
						throw new RuntimeException("");
					} else {
						int var7 = var5.children.length;
						Widget[] var8 = new Widget[var7 + 1];
						System.arraycopy(var5.children, 0, var8, 0, var5.children.length);
						var5.children = var8;
						Widget var9 = new Widget(var6, var7);
						if (var6.type == 12) {
							class106.method3077(var9);
						}

						var5.children[var7] = var9;
						if (var2) {
							class134.scriptDotWidget = var9;
						} else {
							HttpMethod.scriptActiveWidget = var9;
						}

						UserComparator8.invalidateWidget(var5);
						return 1;
					}
				} else if (var0 != ScriptOpcodes.CC_FIND) {
					if (var0 == ScriptOpcodes.IF_FIND) {
						var3 = ClanChannel.widgetDefinition.method7031(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
						if (var3 != null) {
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 1;
							if (var2) {
								class134.scriptDotWidget = var3;
							} else {
								HttpMethod.scriptActiveWidget = var3;
							}
						} else {
							Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else {
						return 2;
					}
				} else {
					ScriptFrame.Interpreter_intStackSize -= 2;
					var10 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
					var5 = ClanChannel.widgetDefinition.getWidgetChild(var10, var4);
					if (var5 != null && var4 != -1) {
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 1;
						if (var2) {
							class134.scriptDotWidget = var5;
						} else {
							HttpMethod.scriptActiveWidget = var5;
						}
					} else {
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZI)I",
		garbageValue = "38006974"
	)
	static int method4823(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class134.scriptDotWidget : HttpMethod.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETX) {
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETY) {
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) {
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3.width;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) {
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3.height;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) {
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) {
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	static void method4822(int var0) {
		Varcs.method3212(14);
		Login.Login_banType = var0;
	}
}
