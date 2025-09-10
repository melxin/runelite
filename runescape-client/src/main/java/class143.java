import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
class class143 implements Callable {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class146 this$0;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lwb;"
	)
	final Buffer val$p;
	// $FF: synthetic field
	final int val$version;

	@ObfuscatedSignature(
		descriptor = "(Lfh;Lwb;I)V"
	)
	class143(class146 var1, Buffer var2, int var3) {
		this.this$0 = var1;
		this.val$p = var2;
		this.val$version = var3;
	}

	public Object call() {
		this.this$0.method3783(this.val$p, this.val$version);
		return null;
	}

	@ObfuscatedName("np")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lcu;",
		garbageValue = "-1465366104"
	)
	@Export("openInterface")
	static final InterfaceParent openInterface(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent();
		var3.group = var1;
		var3.type = var2;
		Client.interfaceParents.put(var3, (long)var0);
		class1.method10(var1);
		Widget var4 = UrlRequester.widgetDefinition.method7476(var0);
		class89.invalidateWidget(var4);
		if (Client.meslayerContinueWidget != null) {
			class89.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		Canvas.revalidateWidgetScroll(UrlRequester.widgetDefinition.Widget_interfaceComponents[var0 >> 16], var4, false);
		class429.runWidgetOnLoadListener(var1);
		if (Client.rootInterface != -1) {
			class142.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3;
	}
}
