import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("li")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("ay")
	@Export("text")
	String text;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -289017001
	)
	@Export("width")
	int width;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -640122131
	)
	@Export("height")
	int height;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IILkz;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1;
		this.width = var2;
		this.height = var3;
		this.size = var4;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lpq;Lpq;S)Z",
		garbageValue = "17063"
	)
	public static boolean method6398(AbstractArchive var0, AbstractArchive var1) {
		WorldMapElement.WorldMapElement_archive = var1;
		if (!var0.isFullyLoaded()) {
			return false;
		} else {
			WorldMapElement.WorldMapElement_count = var0.getGroupFileCount(35);
			WorldMapElement.WorldMapElement_cached = new WorldMapElement[WorldMapElement.WorldMapElement_count];

			for (int var2 = 0; var2 < WorldMapElement.WorldMapElement_count; ++var2) {
				byte[] var3 = var0.takeFile(35, var2);
				WorldMapElement.WorldMapElement_cached[var2] = new WorldMapElement(var2);
				if (var3 != null) {
					WorldMapElement.WorldMapElement_cached[var2].decode(new Buffer(var3));
					WorldMapElement.WorldMapElement_cached[var2].method5166();
				}
			}

			return true;
		}
	}

	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "(Lna;IIB)V",
		garbageValue = "-18"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) {
			if (var0 != null && ItemContainer.method2607(var0) != null) {
				Client.clickedWidget = var0;
				Client.clickedWidgetParent = ItemContainer.method2607(var0);
				Client.widgetClickX = var1;
				Client.widgetClickY = var2;
				class243.widgetDragDuration = 0;
				Client.isDraggingWidget = false;
				int var3 = Client.menu.menuOptionsCount - 1;
				if (var3 != -1) {
					class53.method1124(var3);
				}

			}
		}
	}
}
