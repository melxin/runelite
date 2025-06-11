import java.util.List;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ow")
public class class385 {
	@ObfuscatedName("iw")
	static List field4242;

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "190731583"
	)
	public static final void method7947() {
		ViewportMouse.ViewportMouse_isInViewport = false;
		ViewportMouse.ViewportMouse_entityCount = 0;
	}

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-547818914"
	)
	static void method7945(int var0, int var1, int var2, int var3, int var4) {
		NodeDeque var5 = class330.worldView.groundItems[var0][var1][var2];
		if (var5 != null) {
			for (TileItem var6 = (TileItem)var5.last(); var6 != null; var6 = (TileItem)var5.previous()) {
				if ((var3 & 32767) == var6.id && var4 == var6.quantity) {
					var6.method2670();
					break;
				}
			}

			WorldMapRectangle.updateItemPile(var0, var1, var2);
		}

	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-2042786283"
	)
	static void method7946(int var0, int var1, int var2, int var3, int var4) {
		NodeDeque var5 = class330.worldView.groundItems[var0][var1][var2];
		if (var5 != null) {
			for (TileItem var6 = (TileItem)var5.last(); var6 != null; var6 = (TileItem)var5.previous()) {
				if ((var3 & 32767) == var6.id && var4 == var6.quantity) {
					var6.remove();
					break;
				}
			}

			if (var5.last() == null) {
				class330.worldView.groundItems[var0][var1][var2] = null;
			}

			WorldMapRectangle.updateItemPile(var0, var1, var2);
		}

	}
}
