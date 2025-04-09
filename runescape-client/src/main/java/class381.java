import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ov")
public class class381 {
	@ObfuscatedName("ns")
	@ObfuscatedSignature(
		descriptor = "(IIII)Ldd;",
		garbageValue = "500239090"
	)
	@Export("openInterface")
	static final InterfaceParent openInterface(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent();
		var3.group = var1;
		var3.type = var2;
		Client.interfaceParents.put(var3, (long)var0);
		JagexCache.method4818(var1);
		Widget var4 = class232.widgetDefinition.method6951(var0);
		class139.invalidateWidget(var4);
		if (Client.meslayerContinueWidget != null) {
			class139.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		class170.revalidateWidgetScroll(class232.widgetDefinition.Widget_interfaceComponents[var0 >> 16], var4, false);
		class161.runWidgetOnLoadListener(var1);
		if (Client.rootInterface != -1) {
			MoveSpeed.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3;
	}
}
