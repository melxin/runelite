import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("on")
public class class369 {
	@ObfuscatedName("ni")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lcx;",
		garbageValue = "1682144808"
	)
	@Export("openInterface")
	static final InterfaceParent openInterface(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent();
		var3.group = var1;
		var3.type = var2;
		Client.interfaceParents.put(var3, (long)var0);
		class132.method3672(var1);
		Widget var4 = class35.widgetDefinition.method7496(var0);
		class154.invalidateWidget(var4);
		if (Client.meslayerContinueWidget != null) {
			class154.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		VarcInt.revalidateWidgetScroll(class35.widgetDefinition.Widget_interfaceComponents[var0 >> 16], var4, false);
		class402.runWidgetOnLoadListener(var1);
		if (Client.rootInterface != -1) {
			HttpResponse.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3;
	}
}
