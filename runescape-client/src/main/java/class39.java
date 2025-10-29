import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bi")
public class class39 {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 597277019
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lxt;"
	)
	@Export("redHintArrowSprite")
	static SpritePixels redHintArrowSprite;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 471691931
	)
	static int field233;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1136885703
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("as")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("ac")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lxt;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -253055945
	)
	static int field239;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 785245265
	)
	@Export("Players_count")
	static int Players_count;
	@ObfuscatedName("il")
	static String field241;

	static {
		minimapState = 0;
		field233 = -1;
		mapIconCount = 0;
		mapIconXs = new int[1000];
		mapIconYs = new int[1000];
		mapIcons = new SpritePixels[1000];
		field239 = 0;
		Players_count = 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lit;",
		garbageValue = "-950455341"
	)
	@Export("StructDefinition_getStructDefinition")
	public static StructComposition StructDefinition_getStructDefinition(int var0) {
		StructComposition var1 = (StructComposition)StructComposition.StructDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = StructComposition.StructDefinition_archive.takeFile(34, var0);
			var1 = new StructComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			StructComposition.StructDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lts;Lts;ZI)Z",
		garbageValue = "-1621590824"
	)
	static boolean method814(WorldEntity var0, WorldEntity var1, boolean var2) {
		if (var1 == var0) {
			return true;
		} else if (var1 == null) {
			return true;
		} else {
			return var0 == null ? false : var2;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1478629578"
	)
	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0;
		if (var0 < 0 || var0 >= 65536) {
			var0 >>>= 16;
			var1 += 16;
		}

		if (var0 >= 256) {
			var0 >>>= 8;
			var1 += 8;
		}

		if (var0 >= 16) {
			var0 >>>= 4;
			var1 += 4;
		}

		if (var0 >= 4) {
			var0 >>>= 2;
			var1 += 2;
		}

		if (var0 >= 1) {
			var0 >>>= 1;
			++var1;
		}

		return var0 + var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1128984967"
	)
	static final int method817(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
		return var3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILcu;ZI)I",
		garbageValue = "-1622367182"
	)
	static int method813(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) {
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) {
				var3 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
				var4 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
				if (var4 >= 1 && var4 <= 10) {
					class82 var12 = new class82(var4, var3.id, var3.childIndex * 2077538819, var3.itemId);
					Interpreter.field621.add(var12);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else {
				int var5;
				if (var0 == ScriptOpcodes.IF_TRIGGEROP) {
					class408.Interpreter_intStackSize -= 3;
					int var9 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 2];
					if (var5 >= 1 && var5 <= 10) {
						Widget var10 = class226.widgetDefinition.getWidgetChild(var9, var4);
						if (var10 == null) {
							throw new RuntimeException();
						} else {
							class82 var11 = new class82(var5, var9, var4, var10.itemId);
							Interpreter.field621.add(var11);
							return 1;
						}
					} else {
						throw new RuntimeException();
					}
				} else if (var0 == 2929) {
					Object[] var14 = class195.method4454();
					class408.Interpreter_intStackSize -= 3;
					var4 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
					var5 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
					int var6 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 2];
					boolean var7 = true;
					Widget var8 = class226.widgetDefinition.getWidgetChild(var5, var6);
					if (var8 != null) {
						int var15 = var8.itemId;
						HttpRequestTask.method289(var5, var6, var15, var4, var14);
						return 1;
					} else {
						throw new RuntimeException();
					}
				} else {
					return 2;
				}
			}
		} else if (Interpreter.field608 >= 10) {
			throw new RuntimeException();
		} else {
			if (var0 >= 2000) {
				var3 = class226.widgetDefinition.method7728(Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize]);
			} else {
				var3 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
			}

			if (var3.onResize == null) {
				return 0;
			} else {
				ScriptEvent var13 = new ScriptEvent();
				var13.widget = var3;
				var13.args = var3.onResize;
				var13.field857 = Interpreter.field608 + 1;
				Client.scriptEvents.addFirst(var13);
				return 1;
			}
		}
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "1851348870"
	)
	static Object method816(int var0) {
		return var0 == -1 ? null : class165.method4143((class586)GrandExchangeOffer.findEnumerated(class586.method11449(), var0));
	}

	@ObfuscatedName("or")
	@ObfuscatedSignature(
		descriptor = "(Lcx;ZB)V",
		garbageValue = "15"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group;
		int var3 = (int)var0.key;
		var0.remove();
		if (var1) {
			class226.widgetDefinition.method7731(var2);
		}

		for (WidgetConfigNode var4 = (WidgetConfigNode)Client.widgetFlags.first(); var4 != null; var4 = (WidgetConfigNode)Client.widgetFlags.next()) {
			if ((var4.key >> 16 & 65535L) == (long)var2) {
				var4.remove();
			}
		}

		Widget var5 = class226.widgetDefinition.method7728(var3);
		if (var5 != null) {
			class376.invalidateWidget(var5);
		}

		if (Client.rootInterface != -1) {
			class520.runIntfCloseListeners(Client.rootInterface, 1);
		}

	}
}
