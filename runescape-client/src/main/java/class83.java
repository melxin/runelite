import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dc")
public class class83 {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -656443587
	)
	int field1209;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 97877211
	)
	int field1208;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1814614173
	)
	int field1207;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -522238531
	)
	int field1205;

	class83(int var1, int var2, int var3, int var4) {
		this.field1209 = var1;
		this.field1208 = var2;
		this.field1207 = var3;
		this.field1205 = var4;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1399233263"
	)
	int method2781() {
		return this.field1209;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-781841929"
	)
	int method2782() {
		return this.field1208;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2045203339"
	)
	int method2783() {
		return this.field1207;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "87"
	)
	int method2787() {
		return this.field1205;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILcg;ZB)I",
		garbageValue = "0"
	)
	static int method2795(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) {
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) {
				var3 = var2 ? HttpRequestTask.scriptDotWidget : class141.scriptActiveWidget;
				var4 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
				if (var4 >= 1 && var4 <= 10) {
					class83 var12 = new class83(var4, var3.id, var3.childIndex * -217986249, var3.itemId);
					Interpreter.field669.add(var12);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else {
				int var5;
				if (var0 == ScriptOpcodes.IF_TRIGGEROP) {
					UserComparator7.Interpreter_intStackSize -= 3;
					int var9 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 2];
					if (var5 >= 1 && var5 <= 10) {
						Widget var10 = UrlRequester.widgetDefinition.getWidgetChild(var9, var4);
						if (var10 == null) {
							throw new RuntimeException();
						} else {
							class83 var11 = new class83(var5, var9, var4, var10.itemId);
							Interpreter.field669.add(var11);
							return 1;
						}
					} else {
						throw new RuntimeException();
					}
				} else if (var0 == 2929) {
					Object[] var14 = WorldMapSprite.method6826();
					UserComparator7.Interpreter_intStackSize -= 3;
					var4 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
					var5 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
					int var6 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 2];
					boolean var7 = true;
					Widget var8 = UrlRequester.widgetDefinition.getWidgetChild(var5, var6);
					if (var8 != null) {
						int var15 = var8.itemId;
						FloatProjection.method5359(var5, var6, var15, var4, var14);
						return 1;
					} else {
						throw new RuntimeException();
					}
				} else {
					return 2;
				}
			}
		} else if (Interpreter.field670 >= 10) {
			throw new RuntimeException();
		} else {
			if (var0 >= 2000) {
				var3 = UrlRequester.widgetDefinition.method7476(Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize]);
			} else {
				var3 = var2 ? HttpRequestTask.scriptDotWidget : class141.scriptActiveWidget;
			}

			if (var3.onResize == null) {
				return 0;
			} else {
				ScriptEvent var13 = new ScriptEvent();
				var13.widget = var3;
				var13.args = var3.onResize;
				var13.field902 = Interpreter.field670 + 1;
				Client.scriptEvents.addFirst(var13);
				return 1;
			}
		}
	}
}
