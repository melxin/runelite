import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wi")
public class class584 {
	@ObfuscatedName("ne")
	@ObfuscatedSignature(
		descriptor = "(Loi;III)V",
		garbageValue = "-2139264577"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) {
			if (var0 != null) {
				Widget var4 = class207.method4518(var0);
				if (var4 == null) {
					var4 = var0.parent;
				}

				if (var4 != null) {
					Client.clickedWidget = var0;
					var4 = class207.method4518(var0);
					if (var4 == null) {
						var4 = var0.parent;
					}

					Client.clickedWidgetParent = var4;
					Client.widgetClickX = var1;
					Client.widgetClickY = var2;
					PendingSpawn.widgetDragDuration = 0;
					Client.isDraggingWidget = false;
					int var5 = Sound.method3883();
					if (var5 != -1) {
						class87.method2833(var5);
					}

					return;
				}
			}

		}
	}
}
