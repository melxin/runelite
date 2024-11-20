import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bk")
public class class30 {
	static {
		ImageIO.setUseCache(false);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([F[IIIB)V",
		garbageValue = "1"
	)
	public static void method420(float[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			float var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var0[var8] < var6) {
					float var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					int var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method420(var0, var1, var2, var5 - 1);
			method420(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("nh")
	@ObfuscatedSignature(
		descriptor = "(IIII)Ldo;",
		garbageValue = "1583516087"
	)
	@Export("openInterface")
	static final InterfaceParent openInterface(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent();
		var3.group = var1;
		var3.type = var2;
		Client.interfaceParents.put(var3, (long)var0);
		class47.method866(var1);
		Widget var4 = class379.widgetDefinition.method6875(var0);
		class178.invalidateWidget(var4);
		if (Client.meslayerContinueWidget != null) {
			class178.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		GrandExchangeOfferAgeComparator.revalidateWidgetScroll(class379.widgetDefinition.Widget_interfaceComponents[var0 >> 16], var4, false);
		ArchiveDiskAction.runWidgetOnLoadListener(var1);
		if (Client.rootInterface != -1) {
			World.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3;
	}
}
