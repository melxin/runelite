import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gt")
public abstract class class166 extends Node {
	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("archive10")
	static Archive archive10;

	class166() {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "1969161379"
	)
	abstract void vmethod3869(Buffer var1);

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lgk;I)V",
		garbageValue = "-1263140647"
	)
	abstract void vmethod3870(ClanChannel var1);

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "47"
	)
	public static void method3807() {
		class243.field2023.clear();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "-1"
	)
	static int method3805(int var0, int var1, int var2) {
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "7"
	)
	public static String method3810(String var0) {
		return var0 != null && !var0.isEmpty() && var0.charAt(0) != '#' ? var0 : "";
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "1"
	)
	public static int method3808(int var0) {
		class144 var1 = class137.method3480(var0);
		if (var1 == null) {
			return 2;
		} else {
			return var1.method3521() ? 0 : 1;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "53"
	)
	public static int method3809(int var0) {
		if (var0 > 0) {
			return 1;
		} else {
			return var0 < 0 ? -1 : 0;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZI)I",
		garbageValue = "2103059388"
	)
	static int method3800(int var0, Script var1, boolean var2) {
		Widget var8;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) {
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) {
				var8 = var2 ? class134.scriptDotWidget : HttpMethod.scriptActiveWidget;
				var4 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
				if (var4 >= 1 && var4 <= 10) {
					class107 var9 = new class107(var4, var8.id, var8.childIndex, var8.itemId);
					Interpreter.field863.add(var9);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) {
				ScriptFrame.Interpreter_intStackSize -= 3;
				int var3 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 1];
				int var5 = Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize + 2];
				if (var5 >= 1 && var5 <= 10) {
					Widget var6 = ClanChannel.widgetDefinition.getWidgetChild(var3, var4);
					if (var6 == null) {
						throw new RuntimeException();
					} else {
						class107 var7 = new class107(var5, var3, var4, var6.itemId);
						Interpreter.field863.add(var7);
						return 1;
					}
				} else {
					throw new RuntimeException();
				}
			} else {
				return 2;
			}
		} else if (Interpreter.field864 >= 10) {
			throw new RuntimeException();
		} else {
			if (var0 >= 2000) {
				var8 = ClanChannel.widgetDefinition.method7031(Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize]);
			} else {
				var8 = var2 ? class134.scriptDotWidget : HttpMethod.scriptActiveWidget;
			}

			if (var8.onResize == null) {
				return 0;
			} else {
				ScriptEvent var10 = new ScriptEvent();
				var10.widget = var8;
				var10.args = var8.onResize;
				var10.field1080 = Interpreter.field864 + 1;
				Client.scriptEvents.addFirst(var10);
				return 1;
			}
		}
	}
}
