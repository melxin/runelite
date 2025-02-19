import javax.imageio.ImageIO;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bt")
public class class30 {
	static {
		ImageIO.setUseCache(false);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([BB)Lli;",
		garbageValue = "26"
	)
	static WorldMapSprite method410(byte[] var0) {
		return var0 == null ? new WorldMapSprite() : new WorldMapSprite(class395.readSpritePixelsFromBytes(var0).pixels);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILdy;ZI)I",
		garbageValue = "-1083135261"
	)
	static int method409(int var0, Script var1, boolean var2) {
		Widget var8;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) {
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) {
				var8 = var2 ? class132.scriptDotWidget : PlayerCompositionColorTextureOverride.scriptActiveWidget;
				var4 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
				if (var4 >= 1 && var4 <= 10) {
					class106 var9 = new class106(var4, var8.id, var8.childIndex, var8.itemId);
					Interpreter.field868.add(var9);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) {
				HealthBarConfig.Interpreter_intStackSize -= 3;
				int var3 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
				int var5 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 2];
				if (var5 >= 1 && var5 <= 10) {
					Widget var6 = class376.widgetDefinition.getWidgetChild(var3, var4);
					if (var6 == null) {
						throw new RuntimeException();
					} else {
						class106 var7 = new class106(var5, var3, var4, var6.itemId);
						Interpreter.field868.add(var7);
						return 1;
					}
				} else {
					throw new RuntimeException();
				}
			} else {
				return 2;
			}
		} else if (Interpreter.field884 >= 10) {
			throw new RuntimeException();
		} else {
			if (var0 >= 2000) {
				var8 = class376.widgetDefinition.method6918(Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize]);
			} else {
				var8 = var2 ? class132.scriptDotWidget : PlayerCompositionColorTextureOverride.scriptActiveWidget;
			}

			if (var8.onResize == null) {
				return 0;
			} else {
				ScriptEvent var10 = new ScriptEvent();
				var10.widget = var8;
				var10.args = var8.onResize;
				var10.field1102 = Interpreter.field884 + 1;
				Client.scriptEvents.addFirst(var10);
				return 1;
			}
		}
	}
}
