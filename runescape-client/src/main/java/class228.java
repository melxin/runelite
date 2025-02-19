import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("is")
public class class228 {
	@ObfuscatedName("ad")
	public String field2494;
	@ObfuscatedName("ah")
	public float[] field2495;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1792688109
	)
	public int field2496;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1161728031
	)
	public int field2497;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1604202277
	)
	public int field2498;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	final class227 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lix;)V"
	)
	class228(class227 var1) {
		this.this$0 = var1;
		this.field2495 = new float[4];
		this.field2496 = 1;
		this.field2497 = 1;
		this.field2498 = 0;
	}

	@ObfuscatedName("mp")
	@ObfuscatedSignature(
		descriptor = "(Lnz;III)V",
		garbageValue = "2126866139"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) {
			if (var0 != null) {
				Widget var4 = MusicPatchNode2.method6559(var0);
				if (var4 == null) {
					var4 = var0.parent;
				}

				if (var4 != null) {
					Client.clickedWidget = var0;
					var4 = MusicPatchNode2.method6559(var0);
					if (var4 == null) {
						var4 = var0.parent;
					}

					Client.clickedWidgetParent = var4;
					Client.widgetClickX = var1;
					Client.widgetClickY = var2;
					class155.widgetDragDuration = 0;
					Client.isDraggingWidget = false;
					int var5 = GraphicsObject.method6534();
					if (var5 != -1) {
						class153.method3510(var5);
					}

					return;
				}
			}

		}
	}
}
