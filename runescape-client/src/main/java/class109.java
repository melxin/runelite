import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("er")
final class class109 implements class353 {
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "Lws;"
	)
	@Export("worldSelectLeftSprite")
	static IndexedSprite worldSelectLeftSprite;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	final Widget val$item;

	@ObfuscatedSignature(
		descriptor = "(Lnz;)V"
	)
	class109(Widget var1) {
		this.val$item = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "66"
	)
	public void vmethod6917() {
		if (this.val$item.method7334().field3860 != null) {
			ScriptEvent var1 = new ScriptEvent();
			var1.method2439(this.val$item);
			var1.setArgs(this.val$item.method7334().field3860);
			class60.method1154().addFirst(var1);
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1902868847"
	)
	static int method2980(int var0, int var1) {
		FloorOverlayDefinition var2 = Canvas.method284(var0);
		if (var2 == null) {
			return var1;
		} else {
			int var3;
			int var4;
			if (var2.secondaryRgb >= 0) {
				var3 = class87.method2430(var2.secondaryHue, var2.secondarySaturation, var2.secondaryLightness);
				var4 = Actor.method2660(var3, 96);
				return Rasterizer3D.Rasterizer3D_colorPalette[var4] | -16777216;
			} else if (var2.texture >= 0) {
				var3 = Actor.method2660(Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture), 96);
				return Rasterizer3D.Rasterizer3D_colorPalette[var3] | -16777216;
			} else if (var2.primaryRgb == 16711935) {
				return var1;
			} else {
				var3 = class87.method2430(var2.hue, var2.saturation, var2.lightness);
				var4 = Actor.method2660(var3, 96);
				return Rasterizer3D.Rasterizer3D_colorPalette[var4] | -16777216;
			}
		}
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(Lpn;Ljava/lang/String;B)V",
		garbageValue = "-9"
	)
	static void method2978(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1);
		Client.archiveLoaders.add(var2);
		Client.field708 += var2.groupCount;
	}
}
