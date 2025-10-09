import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pv")
public class class402 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ltl;IIIIB)V",
		garbageValue = "61"
	)
	public static void method8317(DynamicArray var0, int var1, int var2, int var3, int var4) {
		class572 var5 = class572.field5879;
		PacketBufferNode.method7052(var0, var5, true);
		if (var3 < 0) {
			var3 = 0;
		}

		int var6 = var3 + var4;
		if (var4 < 0 || var6 < 0 || var6 > var0.method10433()) {
			var6 = var0.method10433();
		}

		int[] var7 = var0.method10430();
		int var8 = var1;

		for (int var9 = var3; var9 < var6; ++var9) {
			var7[var9] = var8;
			var8 += var2;
		}

	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "848563620"
	)
	@Export("runWidgetOnLoadListener")
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != -1) {
			if (class35.widgetDefinition.loadInterface(var0)) {
				Widget[] var1 = class35.widgetDefinition.Widget_interfaceComponents[var0];

				for (int var2 = 0; var2 < var1.length; ++var2) {
					Widget var3 = var1[var2];
					if (var3.onLoad != null) {
						ScriptEvent var4 = new ScriptEvent();
						var4.widget = var3;
						var4.args = var3.onLoad;
						class163.runScript(var4, 5000000, 0);
					}
				}

			}
		}
	}
}
