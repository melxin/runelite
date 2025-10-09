import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pj")
public class class398 {
	@ObfuscatedName("nk")
	@ObfuscatedSignature(
		descriptor = "([Lok;II)V",
		garbageValue = "-1197776074"
	)
	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) {
			Widget var3 = var0[var2];
			if (var3 != null) {
				if (var3.type == 0) {
					if (var3.children != null) {
						runComponentCloseListeners(var3.children, var1);
					}

					if (var3.childIndex * -2066937045 == -1) {
						InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id);
						if (var4 != null) {
							HttpResponse.runIntfCloseListeners(var4.group, var1);
						}
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) {
					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onDialogAbort;
					class332.runScriptEvent(var5);
				}

				if (var1 == 1 && var3.onSubChange != null) {
					if (var3.childIndex * -2066937045 >= 0) {
						Widget var6 = class35.widgetDefinition.method7496(var3.id);
						if (var6 == null || var6.children == null || var3.childIndex * -2066937045 >= var6.children.length || var3 != var6.children[var3.childIndex * -2066937045]) {
							continue;
						}
					}

					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onSubChange;
					class332.runScriptEvent(var5);
				}
			}
		}

	}
}
