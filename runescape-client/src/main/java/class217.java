import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("im")
public class class217 {
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 731779013
	)
	@Export("loginBoxCenter")
	static int loginBoxCenter;
	@ObfuscatedName("ig")
	@ObfuscatedGetter(
		intValue = 645625339
	)
	static int field2364;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	public UrlRequest field2361;
	@ObfuscatedName("aw")
	public float[] field2362;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	final class227 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lid;)V"
	)
	class217(class227 var1) {
		this.this$0 = var1;
		this.field2362 = new float[4];
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "140850507"
	)
	public static int method4385(int var0, int var1) {
		int var2 = var0 >>> 31;
		return (var0 + var2) / var1 - var2;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZB)I",
		garbageValue = "0"
	)
	static int method4386(int var0, Script var1, boolean var2) {
		Widget var8;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) {
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) {
				var8 = var2 ? RestClientThreadFactory.scriptDotWidget : WorldMapCacheName.scriptActiveWidget;
				var4 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
				if (var4 >= 1 && var4 <= 10) {
					class107 var9 = new class107(var4, var8.id, var8.childIndex, var8.itemId);
					Interpreter.field873.add(var9);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) {
				PrivateChatMode.Interpreter_intStackSize -= 3;
				int var3 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
				int var5 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 2];
				if (var5 >= 1 && var5 <= 10) {
					Widget var6 = class379.widgetDefinition.getWidgetChild(var3, var4);
					if (var6 == null) {
						throw new RuntimeException();
					} else {
						class107 var7 = new class107(var5, var3, var4, var6.itemId);
						Interpreter.field873.add(var7);
						return 1;
					}
				} else {
					throw new RuntimeException();
				}
			} else {
				return 2;
			}
		} else if (Interpreter.field874 >= 10) {
			throw new RuntimeException();
		} else {
			if (var0 >= 2000) {
				var8 = class379.widgetDefinition.method6875(Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize]);
			} else {
				var8 = var2 ? RestClientThreadFactory.scriptDotWidget : WorldMapCacheName.scriptActiveWidget;
			}

			if (var8.onResize == null) {
				return 0;
			} else {
				ScriptEvent var10 = new ScriptEvent();
				var10.widget = var8;
				var10.args = var8.onResize;
				var10.field1094 = Interpreter.field874 + 1;
				Client.scriptEvents.addFirst(var10);
				return 1;
			}
		}
	}

	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-558162517"
	)
	static final int method4387() {
		return Client.menu.menuOptionsCount - 1;
	}
}
