import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ff")
final class class142 implements ThreadFactory {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Lcu;"
	)
	@Export("World_worlds")
	static World[] World_worlds;

	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS Maya Anim Load");
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)Lcd;",
		garbageValue = "1579108442"
	)
	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0);
		return var2.getMessage(var1);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZB)I",
		garbageValue = "101"
	)
	static int method3396(int var0, Script var1, boolean var2) {
		int var3 = -1;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
			var4 = class379.widgetDefinition.method6875(var3);
		} else {
			var4 = var2 ? RestClientThreadFactory.scriptDotWidget : WorldMapCacheName.scriptActiveWidget;
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) {
			PrivateChatMode.Interpreter_intStackSize -= 4;
			var4.rawX = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
			var4.rawY = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
			var4.xAlignment = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 2];
			var4.yAlignment = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 3];
			class178.invalidateWidget(var4);
			NpcOverrides.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				GrandExchangeOfferAgeComparator.revalidateWidgetScroll(class379.widgetDefinition.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) {
			PrivateChatMode.Interpreter_intStackSize -= 4;
			var4.rawWidth = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
			var4.rawHeight = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
			var4.widthAlignment = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 2];
			var4.heightAlignment = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 3];
			class178.invalidateWidget(var4);
			NpcOverrides.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				GrandExchangeOfferAgeComparator.revalidateWidgetScroll(class379.widgetDefinition.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) {
			boolean var5 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
			if (var5 != var4.isHidden) {
				var4.isHidden = var5;
				class178.invalidateWidget(var4);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) {
			var4.noClickThrough = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) {
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize] == 1;
			return 1;
		} else {
			return 2;
		}
	}
}
