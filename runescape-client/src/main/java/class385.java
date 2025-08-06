import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ol")
public class class385 {
	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "20"
	)
	static void method8192(int var0, int var1, int var2, int var3) {
		Widget var4 = class167.widgetDefinition.getWidgetChild(var0, var1);
		if (var4 != null && var4.onTargetEnter != null) {
			ScriptEvent var5 = new ScriptEvent();
			var5.widget = var4;
			var5.args = var4.onTargetEnter;
			SequenceDefinition.runScriptEvent(var5);
		}

		Client.selectedSpellItemId = var3;
		Client.isSpellSelected = true;
		class556.selectedSpellWidget = var0;
		Client.selectedSpellChildIndex = var1;
		class533.selectedSpellFlags = var2;
		ApproximateRouteStrategy.invalidateWidget(var4);
	}
}
