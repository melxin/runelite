import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("of")
public class class364 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "50331648"
	)
	static void method7490() {
		if (Login.loginIndex == 34) {
			class396.Login_promptCredentials(false);
		}

		Login.worldSelectOpen = false;
		Rasterizer2D.Rasterizer2D_fillRectangle(0, 0, Rasterizer2D.Rasterizer2D_width, Rasterizer2D.Rasterizer2D_height, 0);
		SequenceDefinition.leftTitleSprite.drawAt(Login.xPadding, 0);
		FloorOverlayDefinition.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
		WorldMapDecorationType.logoSprite.drawAt(Login.xPadding + 382 - WorldMapDecorationType.logoSprite.subWidth / 2, 18);
	}

	@ObfuscatedName("ni")
	@ObfuscatedSignature(
		descriptor = "(Lnh;I)Lnh;",
		garbageValue = "-1326500610"
	)
	static Widget method7487(Widget var0) {
		int var2 = class31.getWidgetFlags(var0);
		int var1 = var2 >> 17 & 7;
		int var3 = var1;
		if (var1 == 0) {
			return null;
		} else {
			for (int var4 = 0; var4 < var3; ++var4) {
				var0 = class232.widgetDefinition.method6951(var0.parentId);
				if (var0 == null) {
					return null;
				}
			}

			return var0;
		}
	}
}
