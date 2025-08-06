import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ky")
@Implements("Clock")
public abstract class Clock {
	Clock() {
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1103629739"
	)
	@Export("mark")
	public abstract void mark();

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "2018679037"
	)
	@Export("wait")
	public abstract int wait(int var1, int var2);

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "100"
	)
	public static void method6052() {
		class195.field2100.clear();
	}

	@ObfuscatedName("mh")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "-792903551"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (class167.widgetDefinition.loadInterface(var0)) {
			Canvas.field104 = null;
			WorldView.drawInterface(class167.widgetDefinition.Widget_interfaceComponents[var0], 0, class167.widgetDefinition.Widget_interfaceComponents[var0].length - 1, -1, -1, var1, var2, var3, var4, var5, var6, var7);
			if (Canvas.field104 != null) {
				WorldView.drawInterface(Canvas.field104, 0, Canvas.field104.length - 1, -1412584499, -1412584499, var1, var2, var3, var4, PcmPlayer.field1311, UserComparator5.field1553, var7);
				Canvas.field104 = null;
			}

		} else {
			if (var7 != -1) {
				Client.validRootWidgets[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) {
					Client.validRootWidgets[var8] = true;
				}
			}

		}
	}
}
