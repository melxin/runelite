import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("eb")
@Implements("UserComparator7")
public class UserComparator7 extends AbstractUserComparator {
	@ObfuscatedName("tt")
	@ObfuscatedGetter(
		intValue = 2105061489
	)
	@Export("widgetDragDuration")
	static int widgetDragDuration;
	@ObfuscatedName("ap")
	@Export("reversed")
	final boolean reversed;

	public UserComparator7(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lsl;Lsl;I)I",
		garbageValue = "1995010597"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) {
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILcr;ZI)I",
		garbageValue = "-1448059673"
	)
	static int method3402(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) {
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) {
				var3 = var2 ? class539.scriptDotWidget : Huffman.scriptActiveWidget;
				var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if (var4 >= 1 && var4 <= 10) {
					class82 var12 = new class82(var4, var3.id, var3.childIndex * -744024149, var3.itemId);
					Interpreter.field670.add(var12);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else {
				int var5;
				if (var0 == ScriptOpcodes.IF_TRIGGEROP) {
					Interpreter.Interpreter_intStackSize -= 3;
					int var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
					if (var5 >= 1 && var5 <= 10) {
						Widget var10 = ClientPreferences.widgetDefinition.getWidgetChild(var9, var4);
						if (var10 == null) {
							throw new RuntimeException();
						} else {
							class82 var11 = new class82(var5, var9, var4, var10.itemId);
							Interpreter.field670.add(var11);
							return 1;
						}
					} else {
						throw new RuntimeException();
					}
				} else if (var0 == 2929) {
					Object[] var14 = class179.method3970();
					Interpreter.Interpreter_intStackSize -= 3;
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
					var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					int var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
					boolean var7 = true;
					Widget var8 = ClientPreferences.widgetDefinition.getWidgetChild(var5, var6);
					if (var8 != null) {
						int var15 = var8.itemId;
						class205.method4312(var5, var6, var15, var4, var14);
						return 1;
					} else {
						throw new RuntimeException();
					}
				} else {
					return 2;
				}
			}
		} else if (Interpreter.field677 >= 10) {
			throw new RuntimeException();
		} else {
			if (var0 >= 2000) {
				var3 = ClientPreferences.widgetDefinition.method7286(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
			} else {
				var3 = var2 ? class539.scriptDotWidget : Huffman.scriptActiveWidget;
			}

			if (var3.onResize == null) {
				return 0;
			} else {
				ScriptEvent var13 = new ScriptEvent();
				var13.widget = var3;
				var13.args = var3.onResize;
				var13.field901 = Interpreter.field677 + 1;
				Client.scriptEvents.addFirst(var13);
				return 1;
			}
		}
	}
}
