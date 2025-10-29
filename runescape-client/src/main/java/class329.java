import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("me")
public class class329 {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(CLqd;B)I",
		garbageValue = "70"
	)
	@Export("lowercaseChar")
	static int lowercaseChar(char var0, Language var1) {
		int var2 = var0 << 4;
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
			var0 = Character.toLowerCase(var0);
			var2 = (var0 << 4) + 1;
		}

		if (var0 == 241 && var1 == Language.Language_ES) {
			var2 = 1762;
		}

		return var2;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)[Lpz;",
		garbageValue = "-132883655"
	)
	public static CameraViewMode[] method7256() {
		return new CameraViewMode[]{CameraViewMode.field4455, CameraViewMode.field4454, CameraViewMode.field4457};
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILcu;ZI)I",
		garbageValue = "999017463"
	)
	static int method7258(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			int var4 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize];
			var3 = class226.widgetDefinition.method7728(var4);
		} else {
			var3 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
		}

		Widget[] var5;
		if (var0 == ScriptOpcodes.CC_SETPOSITION) {
			class408.Interpreter_intStackSize -= 4;
			var3.rawX = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
			var3.rawY = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
			var3.xAlignment = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 2];
			var3.yAlignment = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 3];
			class376.invalidateWidget(var3);
			SecureUrlRequester.client.alignWidget(var3);
			if (var3.type == 0) {
				var5 = var3.childIndex * 2077538819 == -1 ? class226.widgetDefinition.Widget_interfaceComponents[var3.id >> 16] : class226.widgetDefinition.method7728(var3.parentId).children;
				class339.revalidateWidgetScroll(var5, var3, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) {
			class408.Interpreter_intStackSize -= 4;
			var3.rawWidth = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize];
			var3.rawHeight = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 1];
			var3.widthAlignment = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 2];
			var3.heightAlignment = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize + 3];
			class376.invalidateWidget(var3);
			SecureUrlRequester.client.alignWidget(var3);
			if (var3.type == 0) {
				var5 = var3.childIndex * 2077538819 == -1 ? class226.widgetDefinition.Widget_interfaceComponents[var3.id >> 16] : class226.widgetDefinition.method7728(var3.parentId).children;
				class339.revalidateWidgetScroll(var5, var3, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) {
			boolean var6 = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
			if (var6 != var3.isHidden) {
				var3.isHidden = var6;
				class376.invalidateWidget(var3);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) {
			var3.noClickThrough = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) {
			var3.noScrollThrough = Interpreter.Interpreter_intStack[--class408.Interpreter_intStackSize] == 1;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ne")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-64"
	)
	static void method7255(int var0) {
		WorldMapSection2.tempMenuAction = new MenuAction();
		WorldMapSection2.tempMenuAction.param0 = Client.menu.menuArguments1[var0];
		WorldMapSection2.tempMenuAction.param1 = Client.menu.menuArguments2[var0];
		WorldMapSection2.tempMenuAction.opcode = Client.menu.menuOpcodes[var0];
		WorldMapSection2.tempMenuAction.identifier = Client.menu.menuIdentifiers[var0];
		WorldMapSection2.tempMenuAction.itemId = Client.menu.menuItemIds[var0];
		WorldMapSection2.tempMenuAction.action = Client.menu.menuActions[var0];
		WorldMapSection2.tempMenuAction.target = Client.menu.menuTargets[var0];
		WorldMapSection2.tempMenuAction.worldViewId = Client.menu.menuWorldViewIds[var0];
		WorldMapSection2.tempMenuAction.field667 = Client.menu.menuShiftClick[var0];
	}
}
