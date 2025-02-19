import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fw")
public class class142 {
	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "Lwg;"
	)
	@Export("compass")
	static SpritePixels compass;

	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1779336879"
	)
	static void method3403() {
		if (Client.isSpellSelected) {
			Widget var0 = class376.widgetDefinition.getWidgetChild(class171.selectedSpellWidget, Client.selectedSpellChildIndex);
			if (var0 != null && var0.onTargetLeave != null) {
				ScriptEvent var1 = new ScriptEvent();
				var1.widget = var0;
				var1.args = var0.onTargetLeave;
				MilliClock.runScriptEvent(var1);
			}

			Client.selectedSpellItemId = -1;
			Client.isSpellSelected = false;
			MilliClock.invalidateWidget(var0);
		}
	}
}
