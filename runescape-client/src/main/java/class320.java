import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mt")
public class class320 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)[Lde;",
		garbageValue = "122"
	)
	static class93[] method6452() {
		return new class93[]{class93.field1117, class93.field1118, class93.field1116, class93.field1114, class93.field1120, class93.field1119};
	}

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1500022745"
	)
	static void method6451() {
		if (Client.isSpellSelected) {
			Widget var0 = class379.widgetDefinition.getWidgetChild(Clock.selectedSpellWidget, Client.selectedSpellChildIndex);
			if (var0 != null && var0.onTargetLeave != null) {
				ScriptEvent var1 = new ScriptEvent();
				var1.widget = var0;
				var1.args = var0.onTargetLeave;
				WorldMapEvent.runScriptEvent(var1);
			}

			Client.selectedSpellItemId = -1;
			Client.isSpellSelected = false;
			class178.invalidateWidget(var0);
		}
	}
}
