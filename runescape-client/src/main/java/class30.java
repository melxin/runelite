import java.util.concurrent.ThreadPoolExecutor;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bn")
public class class30 {
	@ObfuscatedName("at")
	static ThreadPoolExecutor field134;
	@ObfuscatedName("fz")
	static boolean field135;

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "7"
	)
	static void method470() {
		if (Client.isSpellSelected) {
			Widget var0 = class35.widgetDefinition.getWidgetChild(class142.selectedSpellWidget, Client.selectedSpellChildIndex);
			if (var0 != null && var0.onTargetLeave != null) {
				ScriptEvent var1 = new ScriptEvent();
				var1.widget = var0;
				var1.args = var0.onTargetLeave;
				class332.runScriptEvent(var1);
			}

			Client.selectedSpellItemId = -1;
			Client.isSpellSelected = false;
			class154.invalidateWidget(var0);
		}
	}

	@ObfuscatedName("ob")
	@ObfuscatedSignature(
		descriptor = "(Lok;I)Z",
		garbageValue = "851295557"
	)
	@Export("isComponentHidden")
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden;
	}
}
