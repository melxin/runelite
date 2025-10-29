import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wm")
public class class593 {
	@ObfuscatedName("ni")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1882331634"
	)
	static final void method11550(int var0) {
		if (class226.widgetDefinition.loadInterface(var0)) {
			Widget[] var1 = class226.widgetDefinition.Widget_interfaceComponents[var0];

			for (int var2 = 0; var2 < var1.length; ++var2) {
				Widget var3 = var1[var2];
				if (var3 != null) {
					var3.modelFrame = 0;
					var3.modelFrameCycle = 0;
				}
			}

		}
	}
}
