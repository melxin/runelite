import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ml")
public class class323 {
	@ObfuscatedName("aj")
	public static short[][] field3544;

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1077652640"
	)
	static final boolean method7033(int var0) {
		return var0 == 1 || var0 == 2 || var0 >= 3 && var0 <= 6 || var0 == 1001;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1157829090"
	)
	static int method7031() {
		return class26.KeyHandler_keyCodes.length;
	}

	@ObfuscatedName("nf")
	static final void method7032(double var0) {
		Rasterizer3D.buildPalette(var0);
		((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).setBrightness(var0);
		if (class50.worldMap != null) {
			class50.worldMap.method10803();
		}

		WidgetDefinition.method7504();
		class154.clientPreferences.updateBrightness(var0);
	}
}
