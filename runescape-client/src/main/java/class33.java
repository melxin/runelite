import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ba")
public class class33 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lee;"
	)
	@Export("World_request")
	static UrlRequest World_request;
	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	static Archive field150;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -147983907
	)
	int field148;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -180005123
	)
	int field147;

	class33(int var1, int var2) {
		this.field148 = var1;
		this.field147 = var2;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lbb;I)Z",
		garbageValue = "1610489624"
	)
	boolean method488(class29 var1) {
		if (var1 == null) {
			return false;
		} else {
			switch(this.field148) {
			case 1:
				return var1.vmethod5667(this.field147);
			case 2:
				return var1.vmethod5668(this.field147);
			case 3:
				return var1.vmethod5681((char)this.field147);
			case 4:
				return var1.vmethod5671(this.field147 == 1);
			default:
				return false;
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljy;",
		garbageValue = "0"
	)
	public static KitDefinition method490(int var0) {
		KitDefinition var1 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else if (KitDefinition.KitDefinition_archive == null) {
			return null;
		} else {
			byte[] var2 = KitDefinition.KitDefinition_archive.takeFile(3, var0);
			var1 = new KitDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			KitDefinition.KitDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1032700404"
	)
	static void method492(int var0, int var1) {
		int[] var2 = new int[9];

		for (int var3 = 0; var3 < var2.length; ++var3) {
			int var4 = var3 * 32 + 15 + 128;
			int var5 = class4.method19(var4);
			int var6 = Rasterizer3D.Rasterizer3D_sine[var4];
			var5 = RestClientThreadFactory.method203(var5, var1);
			var2[var3] = var6 * var5 >> 16;
		}

		class509.topLevelWorldView.scene.method4257(var2, 500, 800, var0 * 334 / var1, 334);
	}

	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "(Lwm;B)V",
		garbageValue = "-94"
	)
	static final void method491(Menu var0) {
		boolean var1 = false;

		while (!var1) {
			var1 = true;

			for (int var2 = 0; var2 < var0.menuOptionsCount - 1; ++var2) {
				if (var0.menuOpcodes[var2] < 1000 && var0.menuOpcodes[var2 + 1] > 1000) {
					String var3 = var0.menuTargets[var2];
					var0.menuTargets[var2] = var0.menuTargets[var2 + 1];
					var0.menuTargets[var2 + 1] = var3;
					String var4 = var0.menuActions[var2];
					var0.menuActions[var2] = var0.menuActions[var2 + 1];
					var0.menuActions[var2 + 1] = var4;
					Menu var5 = var0.subMenus[var2];
					var0.subMenus[var2] = var0.subMenus[var2 + 1];
					var0.subMenus[var2 + 1] = var5;
					int var6 = var0.menuOpcodes[var2];
					var0.menuOpcodes[var2] = var0.menuOpcodes[var2 + 1];
					var0.menuOpcodes[var2 + 1] = var6;
					var6 = var0.menuArguments1[var2];
					var0.menuArguments1[var2] = var0.menuArguments1[var2 + 1];
					var0.menuArguments1[var2 + 1] = var6;
					var6 = var0.menuArguments2[var2];
					var0.menuArguments2[var2] = var0.menuArguments2[var2 + 1];
					var0.menuArguments2[var2 + 1] = var6;
					var6 = var0.menuIdentifiers[var2];
					var0.menuIdentifiers[var2] = var0.menuIdentifiers[var2 + 1];
					var0.menuIdentifiers[var2 + 1] = var6;
					var6 = var0.menuItemIds[var2];
					var0.menuItemIds[var2] = var0.menuItemIds[var2 + 1];
					var0.menuItemIds[var2 + 1] = var6;
					var6 = var0.menuWorldViewIds[var2];
					var0.menuWorldViewIds[var2] = var0.menuWorldViewIds[var2 + 1];
					var0.menuWorldViewIds[var2 + 1] = var6;
					boolean var7 = var0.menuShiftClick[var2];
					var0.menuShiftClick[var2] = var0.menuShiftClick[var2 + 1];
					var0.menuShiftClick[var2 + 1] = var7;
					var1 = false;
				}
			}
		}

	}

	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "-1894019916"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (class232.widgetDefinition.loadInterface(var0)) {
			WorldMapLabel.field3304 = null;
			WorldMapRectangle.drawInterface(class232.widgetDefinition.Widget_interfaceComponents[var0], 0, class232.widgetDefinition.Widget_interfaceComponents[var0].length - 1, -1, -1, var1, var2, var3, var4, var5, var6, var7);
			if (WorldMapLabel.field3304 != null) {
				WorldMapRectangle.drawInterface(WorldMapLabel.field3304, 0, WorldMapLabel.field3304.length - 1, -1412584499, -1412584499, var1, var2, var3, var4, HealthBarConfig.field1360, UrlRequest.field1489, var7);
				WorldMapLabel.field3304 = null;
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
