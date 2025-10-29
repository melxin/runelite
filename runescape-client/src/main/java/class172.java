import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gv")
public class class172 {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1013287245"
	)
	static final boolean method4221(int var0) {
		return var0 == 14 || var0 == 15 || var0 >= 44 && var0 <= 51;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2133209576"
	)
	static final void method4220() {
		if (class39.field233 != Occluder.topLevelWorldView.plane) {
			class39.field233 = Occluder.topLevelWorldView.plane;
			SecureRandomCallable.method2150(Occluder.topLevelWorldView.plane);
		}

	}

	@ObfuscatedName("oe")
	@ObfuscatedSignature(
		descriptor = "(Lof;IIIB)V",
		garbageValue = "82"
	)
	static final void method4219(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.method8168(class226.widgetDefinition, false);
		if (var4 != null) {
			if (class39.minimapState < 3) {
				class472.compass.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var1, var2, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

		}
	}
}
