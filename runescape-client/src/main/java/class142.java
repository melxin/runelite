import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ft")
class class142 implements Callable {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	final class143 this$0;
	// $FF: synthetic field
	final int val$workStart;
	// $FF: synthetic field
	final int val$workEnd;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "[Lfu;"
	)
	final class135[] val$curveLoadJobs;

	@ObfuscatedSignature(
		descriptor = "(Lfj;II[Lfu;)V"
	)
	class142(class143 var1, int var2, int var3, class135[] var4) {
		this.this$0 = var1;
		this.val$workStart = var2;
		this.val$workEnd = var3;
		this.val$curveLoadJobs = var4;
	}

	public Object call() {
		for (int var1 = this.val$workStart; var1 < this.val$workEnd; ++var1) {
			this.val$curveLoadJobs[var1].call();
		}

		return null;
	}

	@ObfuscatedName("nk")
	@ObfuscatedSignature(
		descriptor = "(Lov;III)V",
		garbageValue = "-79877532"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) {
			if (var0 != null && class177.method3963(var0) != null) {
				Client.clickedWidget = var0;
				Client.clickedWidgetParent = class177.method3963(var0);
				Client.widgetClickX = var1;
				Client.widgetClickY = var2;
				UserComparator7.widgetDragDuration = 0;
				Client.isDraggingWidget = false;
				int var3 = class571.method10767();
				if (var3 != -1) {
					class182.method3995(var3);
				}

			}
		}
	}
}
