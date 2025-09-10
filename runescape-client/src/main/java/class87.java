import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dq")
final class class87 implements class357 {
	@ObfuscatedName("pu")
	static int[][] field1235;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	final Widget val$item;

	@ObfuscatedSignature(
		descriptor = "(Loi;)V"
	)
	class87(Widget var1) {
		this.val$item = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-8197"
	)
	public void vmethod7474() {
		if (this.val$item.method7974().field4067 != null) {
			ScriptEvent var1 = new ScriptEvent();
			var1.method2136(this.val$item);
			var1.setArgs(this.val$item.method7974().field4067);
			class161.method3912().addFirst(var1);
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "8"
	)
	static int method2829(int var0, int var1) {
		FloorOverlayDefinition var2 = Client.method1287(var0);
		if (var2 == null) {
			return var1;
		} else {
			int var4;
			int var5;
			int var6;
			int var7;
			int var8;
			if (var2.secondaryRgb >= 0) {
				var4 = var2.secondaryHue;
				var5 = var2.secondarySaturation;
				var6 = var2.secondaryLightness;
				if (var6 > 179) {
					var5 /= 2;
				}

				if (var6 > 192) {
					var5 /= 2;
				}

				if (var6 > 217) {
					var5 /= 2;
				}

				if (var6 > 243) {
					var5 /= 2;
				}

				var7 = (var5 / 32 << 7) + var6 / 2 + (var4 / 4 << 10);
				var8 = MidiPcmStream.method7268(var7, 96);
				return Rasterizer3D.Rasterizer3D_colorPalette[var8] | -16777216;
			} else if (var2.texture >= 0) {
				int var3 = MidiPcmStream.method7268(Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture), 96);
				return Rasterizer3D.Rasterizer3D_colorPalette[var3] | -16777216;
			} else if (var2.primaryRgb == 16711935) {
				return var1;
			} else {
				var4 = var2.hue;
				var5 = var2.saturation;
				var6 = var2.lightness;
				if (var6 > 179) {
					var5 /= 2;
				}

				if (var6 > 192) {
					var5 /= 2;
				}

				if (var6 > 217) {
					var5 /= 2;
				}

				if (var6 > 243) {
					var5 /= 2;
				}

				var7 = (var5 / 32 << 7) + var6 / 2 + (var4 / 4 << 10);
				var8 = MidiPcmStream.method7268(var7, 96);
				return Rasterizer3D.Rasterizer3D_colorPalette[var8] | -16777216;
			}
		}
	}

	@ObfuscatedName("nn")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1242444243"
	)
	static void method2833(int var0) {
		class537.tempMenuAction = new MenuAction();
		class537.tempMenuAction.param0 = Client.menu.menuArguments1[var0];
		class537.tempMenuAction.param1 = Client.menu.menuArguments2[var0];
		class537.tempMenuAction.opcode = Client.menu.menuOpcodes[var0];
		class537.tempMenuAction.identifier = Client.menu.menuIdentifiers[var0];
		class537.tempMenuAction.itemId = Client.menu.menuItemIds[var0];
		class537.tempMenuAction.action = Client.menu.menuActions[var0];
		class537.tempMenuAction.target = Client.menu.menuTargets[var0];
		class537.tempMenuAction.worldViewId = Client.menu.menuWorldViewIds[var0];
		class537.tempMenuAction.field720 = Client.menu.menuShiftClick[var0];
	}
}
