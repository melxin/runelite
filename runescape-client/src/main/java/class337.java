import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mj")
public class class337 {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 381161101
	)
	int field3689;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lcn;"
	)
	class53 field3688;

	@ObfuscatedSignature(
		descriptor = "(ILcn;)V"
	)
	class337(int var1, class53 var2) {
		this.field3689 = var1;
		this.field3688 = var2;
	}

	@ObfuscatedName("nz")
	@ObfuscatedSignature(
		descriptor = "(Lna;IIII)V",
		garbageValue = "1197017701"
	)
	static final void method6885(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.method7446(ClanChannel.widgetDefinition, false);
		if (var4 != null) {
			if (Client.minimapState < 3) {
				SpriteMask.compass.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

		}
	}
}
